package com.ayaz.core.domain.meta.custom;

import com.ayaz.core.domain.ProjectBean;
import com.ayaz.core.domain.meta.fields.FieldMetaBean;

import java.util.ArrayList;
import java.util.List;

public class ProjectCustomFieldMetaBean extends FieldMetaBean {

    private List<ProjectBean> allowedValues = new ArrayList<>();

    public ProjectCustomFieldMetaBean(FieldMetaBean fieldMetaBean) {
        super(fieldMetaBean);
    }

    public List<ProjectBean> getAllowedValues() {
        return allowedValues;
    }

    public void setAllowedValues(List<ProjectBean> allowedValues) {
        this.allowedValues = allowedValues;
    }
}
