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

    public void addLogLocation(String call, LogLocations locs) {
        if(logs == null) { logs = new HashMap<>(); }
        if(!logs.containsKey(call)) { logs.put(call, new ArrayList<>()); }
        logs.get(call).add(locs);
    }

    public void addLogLocation(String call, String stdOut, String stdErr) {
        addLogLocation(call, new LogLocations(stdOut, stdErr));
    }

    public void addLogLocations(String call, Iterable<LogLocations> logLocs) {
        for(LogLocations ll : logLocs) {
            addLogLocation(call, ll);
        }
    }



}

