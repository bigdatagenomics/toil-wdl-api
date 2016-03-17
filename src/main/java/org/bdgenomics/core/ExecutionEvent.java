package org.bdgenomics.core;

import java.util.Date;

import static org.bdgenomics.utils.EqualityUtils.*;
import static org.bdgenomics.utils.HashUtils.hash;

/**
 *
 * Example:
 *
 {
 "description": "running docker",
 "startTime": "2015-10-29T03:16:51.213-03:00",
 "endTime": "2015-10-29T03:16:51.732-03:00"
 }
 */
public class ExecutionEvent {

 private String description;
 private Date startTime, endTime;

 public ExecutionEvent() {}

 public String getDescription() { return description; }
 public Date getStartTime() { return startTime; }
 public Date getEndTime() { return endTime; }

 public void setDescription(String description) { this.description = description; }
 public void setStartTime(Date date) { this.startTime = date; }
 public void setEndTime(Date date) { this.endTime = date; }

 public ExecutionEvent withDescription(String d) { setDescription(d); return this; }
 public ExecutionEvent withStartTime(Date d) { this.startTime = d; return this; }
 public ExecutionEvent withEndTime(Date d) { this.endTime = d; return this; }

 public int hashCode() { return hash(description, startTime, endTime); }

 public boolean equals(Object o) {
  ExecutionEvent ee = as(o, ExecutionEvent.class);
  return check(ee) && eq(
          of(description, startTime, endTime),
          to(ee.description, ee.startTime, ee.endTime));
 }
}
