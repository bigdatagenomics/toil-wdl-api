package org.bdgenomics.api;

import org.bdgenomics.core.CallMetadata;
import org.bdgenomics.core.LogLocations;

import java.util.Map;

public interface WorkflowService {

    String[] calls(String workflowId);

    String status(String workflowId);

    String callOutputs(String workflowId, String callId);

    Map<String,Object> outputs(String workflowId);

    CallMetadata callMetadata(String workflowId, String callId);

    LogLocations[] callLogs(String workflowId, String callId);

}
