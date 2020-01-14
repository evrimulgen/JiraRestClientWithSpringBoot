package com.ayaz.core.domain.meta.fields;

import com.ayaz.core.domain.IssuetypeBean;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.List;

public class IssueTypeFieldMetaBean extends FieldMetaBean {

    @Expose
    private List<IssuetypeBean> allowedValues = new ArrayList<>();

    public List<IssuetypeBean> getAllowedValues() {
        return allowedValues;
    }

    public void setAllowedValues(List<IssuetypeBean> allowedValues) {
        this.allowedValues = allowedValues;
    }
}
