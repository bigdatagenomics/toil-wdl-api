package org.bdgenomics.core;

import static org.bdgenomics.utils.HashUtils.hash;
import static org.bdgenomics.utils.EqualityUtils.*;

public class LogLocations {

    private String stdout, stderr;

    public LogLocations() {}

    public LogLocations(String stdout, String stderr) {
        this.stdout = stdout;
        this.stderr = stderr;
    }

    public String getStdout() { return stdout; }
    public String getStderr() { return stderr; }

    public void setStdout(String stdout) { this.stdout = stdout; }
    public void setStderr(String stderr) { this.stderr = stderr; }

    public LogLocations withStdout(String stdout) { setStdout(stdout); return this; }
    public LogLocations withStderr(String stderr) { setStderr(stderr); return this; }

    public int hashCode() { return hash(stdout, stderr); }

    public boolean equals(Object o) {
        LogLocations ll = as(o, LogLocations.class);
        return check(ll) && eq(of(stdout, stderr), to(ll.stdout, ll.stderr));
    }
}

