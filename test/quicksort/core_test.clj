(ns quicksort.core-test
  (:require [clojure.test :refer :all]
            [quicksort.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= (qs [0 3 2 1]) [0 1 2 3]))))
