package org.bdgenomics.core;

import java.util.Date;
import java.util.Map;

import static org.bdgenomics.utils.HashUtils.hash;
import static org.bdgenomics.utils.EqualityUtils.*;

/**
 * Example:
 {
 "executionStatus": "Done",
 "stdout": "/home/jdoe/cromwell/cromwell-executions/sc_test/8e592ed8-ebe5-4be0-8dcb-4073a41fe180/call-do_prepare/stdout",
 "shardIndex": -1,
 "outputs": {
 "split_files": [
 "/home/jdoe/cromwell/cromwell-test-executions/sc_test/8e592ed8-ebe5-4be0-8dcb-4073a41fe180/call-do_prepare/temp_aa",
 "/home/jdoe/cromwell/cromwell-test-executions/sc_test/8e592ed8-ebe5-4be0-8dcb-4073a41fe180/call-do_prepare/temp_ab",
 "/home/jdoe/cromwell/cromwell-test-executions/sc_test/8e592ed8-ebe5-4be0-8dcb-4073a41fe180/call-do_prepare/temp_ac",
 "/home/jdoe/cromwell/cromwell-test-executions/sc_test/8e592ed8-ebe5-4be0-8dcb-4073a41fe180/call-do_prepare/temp_ad"
 ]
 },
 "inputs": {
 "input_file": "/home/jdoe/cromwell/11.txt"
 },
 "runtimeAttributes": {
 "failOnStderr": "true",
 "continueOnReturnCode": "0"
 },
 "returnCode": 0,
 "backend": "Local",
 "end": "2016-02-04T13:47:56.000-05:00",
 "stderr": "/home/jdoe/cromwell/cromwell-executions/sc_test/8e592ed8-ebe5-4be0-8dcb-4073a41fe180/call-do_prepare/stderr",
 "attempt": 1,
 "executionEvents": [],
 "start": "2016-02-04T13:47:55.000-05:00"
 }
 */
public class CallMetadata {
 private String executionStatus;
 private String stdout, stderr;
 private Integer shardIndex;
 private Map<String,String[]> outputs;
 private Map<String, String> inputs;
 private Map<String, String> runtimeAttributes;
 private Integer returnCode;
 private String backend;
 private Date start, end;
 private Integer attempt;
 private ExecutionEvent[] executionEvents;

 public CallMetadata() {  }

 public String getExecutionStatus() { return executionStatus; }
 public String getStdout() { return stdout; }
 public String getStderr() { return stderr; }
 public Integer getShardIndex() { return shardIndex; }

 public void setExecutionStatus(String status) { this.executionStatus = status; }
 public void setStdout(String stdout) { this.stdout = stdout; }
 public void setStderr(String stderr) { this.stderr = stderr; }
 public void setShardIndex(Integer shardIndex) { this.shardIndex = shardIndex; }

 public CallMetadata withExecutionStatus(String status) { setExecutionStatus(status); return this; }
 public CallMetadata withStdout(String stdout) { setStdout(stdout); return this; }
 public CallMetadata withStderr(String stderr) { setStderr(stderr); return this; }
 public CallMetadata withShardIndex(Integer shardIndex) { setShardIndex(shardIndex); return this; }

 public int hashCode() {
  return hash(executionEvents, stdout, stderr, shardIndex, returnCode, backend, start, end, attempt);
 }

 public boolean equals(Object o) {
  CallMetadata cm = as(o, CallMetadata.class);
  return check(cm) && eq(of(executionStatus, stdout, stderr, shardIndex, returnCode, backend, start, end, attempt),
          to(cm.executionStatus, cm.stdout, cm.stderr, cm.shardIndex, cm.returnCode, cm.backend, cm.start, cm.end, cm.attempt));
 }
}
