 (ns rna-transcription)

 (defn to-rna-char [^Character c]
  (cond
   (= c \C) "G"
   (= c \G) "C"
   (= c \A) "U"
   (= c \T) "A"))

 (defn to-rna [input]
  (apply str (map to-rna-char (seq input))))