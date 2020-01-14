package com.ayaz.core.domain.meta;

import com.ayaz.core.domain.IssuetypeBean;
import com.google.gson.annotations.Expose;


public class IssueTypeMetaBean extends IssuetypeBean {

    @Expose
    private FieldsMetaBean fields;

    public FieldsMetaBean getFields() {
        return fields;
    }

    public void setFields(FieldsMetaBean fields) {
        this.fields = fields;
    }
}
