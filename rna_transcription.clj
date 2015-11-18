(ns rna-transcription)

(def dna-to-rna {\T "A", \A "U", \G "C", \C "G"})

(defn is-dna? [input]
  (re-matches #"[CGAT]+" input))

(defn to-rna [input]
  (when (is-dna? input)
    (apply str (map dna-to-rna input))))