(ns interware.mx.leveldb-micro-test
  (:require [clojure.test :refer [deftest is testing]]
            [interware.mx.leveldb-micro :refer [suma]]))

(deftest -suma
  (testing "Probamos funcion suma"
    (is (= (suma 0 1) 1)))
  (testing "Probamos funcion suma con letras"
    (is (nil? (suma 0 "A"))))
  (testing "Probamos funcion suma con aridad 6"
    (is (= (suma 0 1 2 3 4 5) 15)))
  (testing "Probamos funcion suma con aridad 6 con letras"
    (is (= (suma 0 1 2 3 "A" 5) nil))))
