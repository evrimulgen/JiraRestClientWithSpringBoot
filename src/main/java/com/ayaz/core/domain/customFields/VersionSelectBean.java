package com.ayaz.core.domain.customFields;

import de.micromata.jira.rest.core.domain.VersionBean;

import java.util.ArrayList;
import java.util.List;


public class VersionSelectBean extends CustomFieldBaseBean {

    private List<VersionBean> versions;

    public List<VersionBean> getVersions() {
        if(versions == null){
            versions = new ArrayList<>();
        }
        return versions;
    }

    public void setVersions(List<VersionBean> versions) {
        this.versions = versions;
    }
}
