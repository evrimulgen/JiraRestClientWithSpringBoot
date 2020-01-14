package com.ayaz.client;

import com.ayaz.core.domain.JqlSearchResult;
import com.ayaz.core.domain.filter.FilterBean;
import com.ayaz.core.jql.JqlSearchBean;

import java.util.List;
import java.util.concurrent.Future;

public interface SearchClient {

    Future<JqlSearchResult> searchIssues(JqlSearchBean jsb);
    Future<FilterBean> createSearchFilter(FilterBean filter);
    Future<List<FilterBean>> getFavoriteFilter();
    Future<FilterBean> getFilterById(String id);

}
