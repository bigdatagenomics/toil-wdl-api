package org.bdgenomics.api;

import org.bdgenomics.core.LogLocations;

public interface LogService {

    LogLocations getLogLocations(String workflowId);
}
