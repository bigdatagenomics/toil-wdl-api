package org.bdgenomics.health;

import com.codahale.metrics.health.HealthCheck;

public class WorkflowServiceHealthCheck extends HealthCheck {

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
