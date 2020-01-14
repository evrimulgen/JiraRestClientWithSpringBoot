package com.ayaz.core.domain.customFields;


import com.ayaz.core.domain.ProjectBean;

public class ProjectSelectBean extends CustomFieldBaseBean {

    private ProjectBean project;

    public ProjectBean getProject() {
        return project;
    }

    public void setProject(ProjectBean project) {
        this.project = project;
    }
}
