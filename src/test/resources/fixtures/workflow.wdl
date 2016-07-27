workflow wf {

	String inputValue

	call echo {
	  input: voice=inputValue
	}
}

task echo {
  String voice

  command {
    echo ${voice} > echo_output.txt
  }

  output {
    File output = "echo_output.txt"
  }
}

