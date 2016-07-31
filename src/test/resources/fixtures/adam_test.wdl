workflow wf {

  File inputBam
  String outputBamFilename

  call adamPipeline {
    input: 
      inputBam=inputBam,
      outputBamFilename=outputBamFilename
  }
}

task adamPipeline {
  File inputBam 
  String outputBamFilename

  command {
    /work/convert_adam.sh ${inputBam} ${outputBamFilename}
  }

  output {
    File outputBam = "${outputBamFilename}.tgz"
  }
}
