package com.ayaz.core.domain.customFields;


import com.ayaz.core.domain.BaseBean;

public class CustomFieldBaseBean extends BaseBean {

    private CustomFieldType type;

    public CustomFieldType getType() {
        return type;
    }

    public void setType(CustomFieldType type) {
        this.type = type;
    }
}
