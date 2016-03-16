package org.bdgenomics.api;

import java.util.Map;

public interface WorkflowService {

    String[] calls(String workflowId);

    String status(String workflowId);

    String output(String workflowId, String callId);

    Map<String,Object> outputs(String workflowId);

}
