cwlVersion: cwl:draft-3
class: Workflow
inputs:
- id: test.bam
  type: string
- id: test.bai
  type: string
- id: metrics.txt
  type: string
- id: hg19.fa
  type: string
- id: hg19.fai
  type: string
- id: 1024*1024*1024*30
  type: string
outputs:
- id: metrics
  type: File
  source: '#CollectWgsMetrics/metrics'
steps:
- id: CollectWgsMetrics
  run: CollectWgsMetrics.cwl
  inputs:
  - id: input_bam
    source: test.bam
  - id: input_bam_index
    source: test.bai
  - id: metrics_filename
    source: metrics.txt
  - id: wgs_interval_list
  - id: ref_fasta
    source: hg19.fa
  - id: ref_fasta_index
    source: hg19.fai
  - id: disk_size
    source: 32212254720
  outputs:
  - id: metrics
