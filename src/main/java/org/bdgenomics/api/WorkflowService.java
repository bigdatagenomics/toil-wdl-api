package org.bdgenomics.api;

import org.bdgenomics.core.Logs;
import org.bdgenomics.core.Status;
import org.bdgenomics.cwl.CWLPackage;
import org.bdgenomics.cwl.Workflow;

import java.io.IOException;
import java.util.Map;

public interface WorkflowService {

    String create(CWLPackage components, Map<String, Object> inputs) throws IOException;

    String abort(String workflowId);

    String status(String workflowId);

    String metadata(String workflowId);

    Map<String,Object> outputs(String workflowId);

    Logs logs(String workflowId);

}
