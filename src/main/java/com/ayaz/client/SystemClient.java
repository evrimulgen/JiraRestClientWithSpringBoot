package com.ayaz.client;

import com.ayaz.core.domain.AttachmentMetaBean;
import com.ayaz.core.domain.IssuetypeBean;
import com.ayaz.core.domain.PriorityBean;
import com.ayaz.core.domain.StatusBean;
import com.ayaz.core.domain.field.CreateFieldBean;
import com.ayaz.core.domain.field.FieldBean;
import com.ayaz.core.domain.system.ConfigurationBean;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Future;

public interface SystemClient {

    Future<ConfigurationBean> getConfiguration();
    Future<List<IssuetypeBean>> getIssueTypes();
    Future<List<StatusBean>> getStates();
    Future<List<PriorityBean>> getPriorities();
    Future<List<FieldBean>> getAllFields();
    Future<List<FieldBean>> getAllCustomFields();
    Future<FieldBean> getCustomFieldById(String id);
    Future<AttachmentMetaBean> getAttachmentMeta();
    Future<FieldBean> createCustomField(CreateFieldBean fieldBean);

}
