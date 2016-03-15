package org.bdgenomics;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.bdgenomics.resources.WorkflowResource;
import org.bdgenomics.resources.WorkflowsResource;

public class ToilWdlApiApplication extends Application<ToilWdlApiConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ToilWdlApiApplication().run(args);
    }

    @Override
    public String getName() {
        return "ToilWdlApi";
    }

    @Override
    public void initialize(final Bootstrap<ToilWdlApiConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ToilWdlApiConfiguration configuration,
                    final Environment environment) {

        environment.jersey().register(new WorkflowResource());
        environment.jersey().register(new WorkflowsResource());
    }

}
