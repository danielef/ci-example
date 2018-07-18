(ns interware.mx.leveldb-micro)

(defn suma [& a]
  (try (apply + a)
       (catch Exception e
         nil)))
