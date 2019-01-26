package com.alliance.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class SearchFilter {
	private transient String pageSize;
	private transient String page;

	@JsonIgnore
	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	@JsonIgnore
	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "SearchFilter [pageSize=" + pageSize + ", page=" + page + "]";
	}

}
