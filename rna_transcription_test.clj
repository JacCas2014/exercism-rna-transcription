(ns rna-transcription-test
  (:require [clojure.test :refer :all]
            [rna-transcription :refer :all])
  (:use midje.sweet))

(fact "transcribes-cytosine-to-guanine"
      (to-rna "C") => "G")

(fact "transcribes-guanine-to-cytosine"
             (to-rna "G") => "C")

(fact "transcribes-adenine-to-uracil"
             (to-rna "A") => "U")

(fact "it-transcribes-thymine-to-adenine"
             (to-rna "T") => "A")

(future-fact "it-transcribes-all-nucleotides"
             (to-rna "ACGTGGTCTTAA") => "UGCACCAGAAUU")

(future-fact "it-validates-dna-strands"
             (to-rna "XCGFGGTDTTAA") => (throw AssertionError))

