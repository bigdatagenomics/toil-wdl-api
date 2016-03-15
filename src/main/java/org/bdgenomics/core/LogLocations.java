package org.bdgenomics.core;

class LogLocations {

    public String stdout, stderr;

    public LogLocations() {}

    public LogLocations(String stdout, String stderr) {
        this.stdout = stdout;
        this.stderr = stderr;
    }
}
