 (ns rna-transcription)

 (defn to-rna [input]
  (cond
   (= input "C") "G"
   (= input "G" ) "C"
   (= input "A") "U"
   (= input "T") "A"))