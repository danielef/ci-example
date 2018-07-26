(ns interware.mx.leveldb-micro-test
  (:require [clojure.test :refer [deftest is testing]]
            [interware.mx.leveldb-micro :refer [suma resta multi div]]))

(deftest -suma
  (testing "Probamos funcion suma"
    (is (= (suma 0 1) 1)))
  (testing "Probamos funcion suma con letras"
    (is (nil? (suma 0 "A"))))
  (testing "Probamos funcion suma con aridad 6"
    (is (= (suma 0 1 2 3 4 5) 15)))
  (testing "Probamos funcion suma con aridad 6 con letras"
    (is (= (suma 0 1 2 3 "A" 5) nil))))

(deftest -resta
  (testing "Probamos funcion suma"
    (is (= (resta 0 1) -1)))
  (testing "Probamos funcion suma con letras"
    (is (nil? (resta 0 "A"))))
  (testing "Probamos funcion suma con aridad 6"
    (is (= (resta 0 1 2 3 4 5) -15)))
  (testing "Probamos funcion suma con aridad 6 con letras"
    (is (= (resta 0 1 2 3 "A" 5) nil))))

(deftest -multi
  (testing "Probamos funcion suma"
    (is (= (multi 0 1) 0)))
  (testing "Probamos funcion suma con letras"
    (is (nil? (multi 0 "A"))))
  (testing "Probamos funcion suma con aridad 6"
    (is (= (multi 0 1 2 3 4 5) 0)))
  (testing "Probamos funcion suma con aridad 6 con letras"
    (is (= (multi 0 1 2 3 "A" 5) nil))))

(deftest -div
  (testing "Probamos funcion suma"
    (is (= (div 0 1) 0)))
  (testing "Probamos funcion suma con letras"
    (is (nil? (div 0 "A"))))
  (testing "Probamos funcion suma con aridad 6"
    (is (= (div 0 1 2 3 4 5) 0)))
  (testing "Probamos funcion suma con aridad 6 con letras"
    (is (= (div 0 1 2 3 "A" 5) nil))))