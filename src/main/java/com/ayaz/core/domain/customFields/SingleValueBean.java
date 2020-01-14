package com.ayaz.core.domain.customFields;


public class SingleValueBean extends CustomFieldBaseBean {

    private ValueBean value;

    public ValueBean getValue() {
        return value;
    }

    public void setValue(ValueBean value) {
        this.value = value;
    }
}
