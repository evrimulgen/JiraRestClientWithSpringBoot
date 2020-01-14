package com.ayaz.core.domain.meta.fields;

import com.ayaz.core.domain.PriorityBean;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.List;


public class PriorityFieldMetaBean extends FieldMetaBean {

    @Expose
    private List<PriorityBean> allowedValues = new ArrayList<>();

    public List<PriorityBean> getAllowedValues() {
        return allowedValues;
    }

    public void setAllowedValues(List<PriorityBean> allowedValues) {
        this.allowedValues = allowedValues;
    }
}
