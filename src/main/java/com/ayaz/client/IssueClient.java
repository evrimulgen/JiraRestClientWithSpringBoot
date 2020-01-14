package com.ayaz.client;

import com.ayaz.core.domain.*;
import com.ayaz.core.domain.update.IssueUpdate;
import org.springframework.web.client.RestClientException;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.Future;

public interface IssueClient {

    Future<IssueResponse> createIssue(IssueBean issue);
    Future<IssueBean> getIssueByKey(String issueKey);
    Future<IssueBean> updateIssue(String issueKey, IssueUpdate issueUpdate);
    Future<IssueBean> getIssueByKey(String issueKey, List<String> fields, List<String> expand);
    Future<Byte[]> getAttachment(URI uri);
    InputStream getAttachmentAsStream(long id);
    Future<AttachmentBean> getAttachment(long id);
    Future<List<AttachmentBean>> saveAttachmentToIssue(String issuekey, File... file);
    boolean transferWorklogInIssue(String issueKey, WorklogBean worklog) throws RestClientException, IOException, URISyntaxException;
    boolean updateIssueTransitionByKey(String issueKey, int transitionId) throws RestClientException, IOException, URISyntaxException;
    Future<List<TransitionBean>> getIssueTransitionsByKey(String issueKey);
    Future<CommentsBean> getCommentsByIssue(String issueKey);
    boolean addCommentToIssue(String issueKey, CommentBean comment) throws RestClientException, URISyntaxException, IOException;
}
