package org.bdgenomics.core;

import java.util.Date;

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
}
