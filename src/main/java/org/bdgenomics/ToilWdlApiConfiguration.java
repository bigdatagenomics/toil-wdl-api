package org.bdgenomics;

import io.dropwizard.Configuration;
import org.bdgenomics.api.ToilService;
import org.bdgenomics.api.WorkflowService;

public class ToilWdlApiConfiguration extends Configuration {

    public ToilService service() {
        return new ToilService() {
            @Override
            public WorkflowService workflowService() {
                return null;
            }
        };
    }
}
