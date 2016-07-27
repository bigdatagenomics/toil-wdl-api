workflow wf {

	call CollectWgsMetrics {
	  input:
	    input_bam='test.bam',
	    input_bam_index='test.bai',
	    metrics_filename='metrics.txt',
	    ref_fasta='hg19.fa',
	    ref_fasta_index='hg19.fai',
	    disk_size= 1024 * 1024 * 1024 * 30
	}
}

task CollectWgsMetrics {
  File input_bam
  File input_bam_index
  String metrics_filename
  File? wgs_interval_list
  File ref_fasta
  File ref_fasta_index
  Int disk_size

  command {
  java -Xmx2000m -jar /usr/gitc/picard.jar \
  CollectWgsMetrics \
  INPUT=${input_bam} \
  VALIDATION_STRINGENCY=SILENT \
  REFERENCE_SEQUENCE=${ref_fasta} \
  ${"INTERVALS=" + wgs_interval_list} \
  OUTPUT=${metrics_filename}
  }
  runtime {
  docker: "broadinstitute/genomes-in-the-cloud:1.1044_with_gatk4"
  memory: "3 GB"
  disks: "local-disk " + disk_size + " HDD"
  }
  output {
  File metrics = "${metrics_filename}"
  }
}
