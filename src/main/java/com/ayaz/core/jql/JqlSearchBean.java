/*
 * Copyright 2013 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ayaz.core.jql;

import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JqlSearchBean {


    @Expose
    private Integer startAt = null;

    @Expose
    private Integer maxResults = null;

    @Expose
    private List<String> fields = null;

    @Expose
    private String jql = StringUtils.EMPTY;

    @Expose
    private List<String> expand = new ArrayList<>();


    public void addField(EField... fields) {
        for (EField f : fields) {
            getFields().add(f.toString());
        }
    }

    public void addField(Collection<String> fields){
        for (String field : fields) {
            getFields().add(field);
        }
    }

    public void addExpand(EField... fields){
        for (EField field : fields) {
            getExpand().add(field.toString());
        }
    }

    public Integer getStartAt() {
        return startAt;
    }

    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }

    public Integer getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    public List<String> getFields() {
        if (fields == null) {
            fields = new ArrayList<>();
        }
        return fields;
    }

    public String getJql() {
        return jql;
    }

    public void setJql(String jql) {
        this.jql = jql;
    }

    public List<String> getExpand() {
        if(expand == null){
            expand = new ArrayList<>();
        }
        return expand;
    }
}
