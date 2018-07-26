(ns interware.mx.leveldb-micro)

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