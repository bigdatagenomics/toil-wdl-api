package org.bdgenomics.core;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.bdgenomics.utils.HashUtils.hash;
import static org.bdgenomics.utils.EqualityUtils.*;

public class WorkflowOutputs {

    private String id;
    private Map<String,Object> outputs;

    public WorkflowOutputs() {}

    public WorkflowOutputs(String id, Map<String,Object> outputs) {
        this.id = id;
        this.outputs = new LinkedHashMap<>(outputs);
    }

    public String getId() { return id; }
    public Map<String,Object> getOutputs() { return outputs; }

    public void setId(String id) { this.id = id; }
    public void setOutputs(Map<String,Object> outputs) { this.outputs = outputs; }

    public WorkflowOutputs withId(String id) { setId(id); return this; }
    public WorkflowOutputs withOutputs(Map<String,Object> outputs) { setOutputs(outputs); return this; }

    public WorkflowOutputs withOutput(String call, Object output) {
        if(outputs == null) { outputs = new LinkedHashMap<>(); }
        outputs.put(call, output);
        return this;
    }

    public int hashCode() { return hash(id); }

    public boolean equals(Object o) {
        WorkflowOutputs w = as(o, WorkflowOutputs.class);
        return check(w) && eq(of(id), to(w.id));
    }
}
