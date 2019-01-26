package com.alliance.repository.custom.impl;

import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.SQLQuery;
import org.hibernate.type.LongType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.alliance.repository.custom.GenericRepositoryCustom;
import com.alliance.utility.ReflectionUtility;
import com.alliance.utility.StringUtility;

@Repository("genericRepository")
@Transactional(readOnly = true)
public class GenericRepositoryImpl implements GenericRepositoryCustom {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<?> searchTable(Class<?> classParameter, String tableName, Object searchFilter, String[] parameters, HashMap<String, String> parametersMap) {
		StringBuilder sqlQuery = new StringBuilder("SELECT  tbl.* FROM " + tableName + " tbl ");
		boolean appended = false;
		for (String parameter : parameters) {
			try {
				Object obj = ReflectionUtility.getValue(searchFilter, parameter);
				if (obj != null) {
					System.out.println("THIS IS OBJECT - " + parameter + " - " + obj.getClass() + " - " + obj.toString());
					boolean appendParameter = true;
					if (obj instanceof String && StringUtility.isStringNullOrEmpty((String) obj)) {
						appendParameter = false;
					}

					if (appendParameter) {
						if (appended)
							sqlQuery.append(" AND ");
						else
							sqlQuery.append(" WHERE ");
						// sqlQuery.append(" tbl." + parametersMap.get(parameter) + (obj instanceof String ? " LIKE " : " = ") + ":" + parameter);
						sqlQuery.append(" tbl." + parametersMap.get(parameter) + " = :" + parameter);
						appended = true;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("THIS IS QUERY == " + sqlQuery.toString());
		Query query = entityManager.createNativeQuery(sqlQuery.toString(), classParameter);
		for (String parameter : parameters) {
			try {
				Object obj = ReflectionUtility.getValue(searchFilter, parameter);
				if (obj != null) {
					boolean appendParameter = true;
					if (obj instanceof String && StringUtility.isStringNullOrEmpty((String) obj)) {
						appendParameter = false;
					}

					if (appendParameter) {
						// if (obj instanceof String)
						// query.setParameter(parameter, "%" + obj + "%");
						// else
						query.setParameter(parameter, "" + obj);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		try {
			int page = 0;
			int pageSize = 0;
			if (!StringUtility.isStringNullOrEmpty((String) ReflectionUtility.getValue(searchFilter, "page"))) {
				page = Integer.parseInt((String) ReflectionUtility.getValue(searchFilter, "page"));
			}
			if (!StringUtility.isStringNullOrEmpty((String) ReflectionUtility.getValue(searchFilter, "pageSize"))) {
				pageSize = Integer.parseInt((String) ReflectionUtility.getValue(searchFilter, "pageSize"));
			}

			int firstResult = 0;
			// if (pageSize == 0) {
			// pageSize = 15;
			// }
			if (page > 0) {
				firstResult = pageSize * (page - 1);
				query.setFirstResult(firstResult);
			}
			
			if (pageSize > 0)
				query.setMaxResults(pageSize);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return query.getResultList();
	}

	@Override
	public Long getResultCount(String tableName, Object searchFilter, String[] parameters, HashMap<String, String> parametersMap) {
		StringBuilder sqlQuery = new StringBuilder("SELECT  count(*) as maxResults FROM " + tableName + " tbl ");
		boolean appended = false;
		for (String parameter : parameters) {
			try {
				Object obj = ReflectionUtility.getValue(searchFilter, parameter);
				if (obj != null) {
					System.out.println("THIS IS OBJECT - " + parameter + " - " + obj.getClass() + " - " + obj.toString());
					boolean appendParameter = true;
					if (obj instanceof String && StringUtility.isStringNullOrEmpty((String) obj)) {
						appendParameter = false;
					}

					if (appendParameter) {
						if (appended)
							sqlQuery.append(" AND ");
						else
							sqlQuery.append(" WHERE ");
						// sqlQuery.append(" tbl." + parametersMap.get(parameter) + (obj instanceof String ? " LIKE " : " = ") + ":" + parameter);
						sqlQuery.append(" tbl." + parametersMap.get(parameter) + " = :" + parameter);
						appended = true;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("THIS IS QUERY == " + sqlQuery.toString());
		Query query = entityManager.createNativeQuery(sqlQuery.toString());
		for (String parameter : parameters) {
			try {
				Object obj = ReflectionUtility.getValue(searchFilter, parameter);
				if (obj != null) {
					boolean appendParameter = true;
					if (obj instanceof String && StringUtility.isStringNullOrEmpty((String) obj)) {
						appendParameter = false;
					}

					if (appendParameter) {
						// if (obj instanceof String)
						// query.setParameter(parameter, "%" + obj + "%");
						// else
						query.setParameter(parameter, "" + obj);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		query.unwrap(SQLQuery.class).addScalar("maxResults", LongType.INSTANCE);

		return (Long) query.getSingleResult();
	}
}
