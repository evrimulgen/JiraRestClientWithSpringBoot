package com.ayaz.core.domain.meta.custom;


import com.ayaz.core.domain.meta.fields.FieldMetaBean;

import java.util.ArrayList;
import java.util.List;

public class ValuesCustomFieldMetaBean extends FieldMetaBean {

    private List<ValueMetaBean> allowedValues = new ArrayList<>();

    public ValuesCustomFieldMetaBean(FieldMetaBean fieldMetaBean) {
        super(fieldMetaBean);
    }

    public List<ValueMetaBean> getAllowedValues() {
        return allowedValues;
    }

    public void setAllowedValues(List<ValueMetaBean> allowedValues) {
        this.allowedValues = allowedValues;
    }
}
