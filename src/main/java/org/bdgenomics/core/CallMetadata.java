package org.bdgenomics.core;

import java.util.Date;
import java.util.Map;

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
}
