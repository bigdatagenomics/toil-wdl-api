package org.bdgenomics.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Logs {

    public String id;
    public Map<String, ArrayList<LogLocations>> logs;

    public Logs() {}

    public Logs(String id) {
        this.id = id;
    }

    public void addLogLocation(String call, String stdOut, String stdErr) {
        if(logs == null) { logs = new HashMap<>(); }
        if(!logs.containsKey(call)) { logs.put(call, new ArrayList<LogLocations>()); }
        logs.get(call).add(new LogLocations(stdOut, stdErr));
    }

}

