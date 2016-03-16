package org.bdgenomics.core;

import static org.bdgenomics.utils.HashUtils.hash;
import static org.bdgenomics.utils.EqualityUtils.*;

public class Status {

    private String id;
    private String status;

    public Status() {}

    public Status(String id, String status) {
        this.id = id;
        this.status = status;
    }

    public String getId() { return id; }
    public String getStatus() { return status; }

    public void setId(String id) { this.id = id; }
    public void setStatus(String status) { this.status = status; }

    public Status withId(String id) { setId(id); return this; }
    public Status withStatus(String status) { setStatus(status); return this; }

    public int hashCode() {
        return hash(id, status);
    }

    public boolean equals(Object o) {
        Status s = as(o, Status.class);
        return check(s) && eq(of(id, status), to(s.id, s.status));
    }
}
