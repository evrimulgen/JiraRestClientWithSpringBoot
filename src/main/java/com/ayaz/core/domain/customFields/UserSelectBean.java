package com.ayaz.core.domain.customFields;


import com.ayaz.core.domain.UserBean;

import java.util.ArrayList;
import java.util.List;

public class UserSelectBean extends CustomFieldBaseBean {

    private List<UserBean> users;

    public List<UserBean> getUsers() {
        if(users == null){
            users = new ArrayList<>();
        }
        return users;
    }

    public void setUsers(List<UserBean> users) {
        this.users = users;
    }
}
