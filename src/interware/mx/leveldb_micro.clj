(ns interware.mx.leveldb-micro
  (:gen-class))

(defn suma [& a]
  (try (apply + a)
       (catch Exception e
         nil)))

(defn resta [& a]
  (try (apply - a)
       (catch Exception e
         nil)))

(defn multi [& a]
  (try (apply * a)
       (catch Exception e
         nil)))

(defn div [& a]
  (try (apply / a)
       (catch Exception e
         nil)))

(defn -main [& args]
  (println "This is a main function"))
