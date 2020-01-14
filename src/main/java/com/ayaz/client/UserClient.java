package com.ayaz.client;

import com.ayaz.core.domain.UserBean;
import org.springframework.web.client.RestClientException;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Future;

public interface UserClient {

    Future<List<UserBean>> getAssignableUserForProject(String projectKey, Integer startAt, Integer maxResults) throws RestClientException, IOException;
    Future<List<UserBean>> getAssignableUsersForIssue(String issueKey, Integer startAt, Integer maxResults) throws RestClientException, IOException;
    Future<UserBean> getUserByUsername(String username);
    Future<UserBean> getLoggedInRemoteUser() throws RestClientException, IOException;
    Future<MyPermissionsBean> getMyPermissions();
}
