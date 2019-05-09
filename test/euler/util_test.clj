(ns euler.util-test
  (:require [clojure.test :refer :all]
            [euler.util :refer :all]))

(deftest divide-test
  (is (true? (divide? 2 10)))
  (is (true? (divide? 1 0)))
  (is (false? (divide? 3 10))))

(deftest sum-test
  (is (= (sum '(1 1 1)) 3)))