package com.alliance.repository.custom;

import java.util.HashMap;
import java.util.List;

public interface GenericRepositoryCustom {

	List<?> searchTable(Class<?> classParameter, String tableName, Object searchFilter, String[] parameters, HashMap<String, String> columnMap);

	Long getResultCount(String tableName, Object searchFilter, String[] parameters, HashMap<String, String> columnMap);
}
