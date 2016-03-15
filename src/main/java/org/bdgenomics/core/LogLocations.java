package org.bdgenomics.core;

public class LogLocations {

    public String stdout, stderr;

    public LogLocations() {}

    public LogLocations(String stdout, String stderr) {
        this.stdout = stdout;
        this.stderr = stderr;
    }
}
