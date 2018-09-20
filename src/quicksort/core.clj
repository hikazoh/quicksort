(ns quicksort.core
  (:gen-class))

(defn randseq[n]
  (lazy-seq
   (cons (rand-int n)
         (randseq n))))
(defn randseq2[n]
  (repeatedly #(rand-int n)))

(defn qs[[p & c]]
  (when p
    (concat
     (qs (filter #(< % p) c))
     [p]
     (qs (filter #(>= % p) c)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (time (qs (take 1000 (randseq 100)))))
  (println (time (qs (take 1000 (randseq2 100)))))
  (println (time (sort (take 1000 (randseq 100)))))
  (println (time (sort (take 1000 (randseq2 100))))))
