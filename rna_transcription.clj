 (ns rna-transcription)

(defn is-dna? [input]
 (re-matches #"[CGAT]+" input))

 (defn to-rna-char [^Character c]
  (cond
   (= c \C) "G"
   (= c \G) "C"
   (= c \A) "U"
   (= c \T) "A"))

 (defn to-rna [input]
  (when (is-dna? input)
   (apply str (map to-rna-char (seq input)))))