package com.ayaz.core.domain.customFields;

import com.google.gson.annotations.Expose;
import de.micromata.jira.rest.core.domain.BaseBean;


public class ValueBean extends BaseBean {
    @Expose
    private String value;
    @Expose
    private ValueBean child;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ValueBean getChild() {
        return child;
    }

    public void setChild(ValueBean child) {
        this.child = child;
    }
}
