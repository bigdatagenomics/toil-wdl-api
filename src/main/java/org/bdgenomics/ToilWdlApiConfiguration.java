package org.bdgenomics;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.bdgenomics.api.LogService;
import org.bdgenomics.api.ToilService;
import org.bdgenomics.api.WorkflowService;
import org.bdgenomics.core.LogLocations;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;

public class ToilWdlApiConfiguration extends Configuration {

    public ToilService service() {
        return new ToilService() {

            @Override
            public LogService logService() {
                return null;
            }

            @Override
            public WorkflowService workflowService() {
                return null;
            }
        };
    }
}
