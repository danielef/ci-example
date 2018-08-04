(defproject interware.mx/ci-example "0.1.1-SNAPSHOT"
  :description "ci example project"
  :url "https://github.com/danielef/ci-example"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :plugins [[lein-cloverage "1.0.11"]]
  
  :repositories [["snapshots" "https://ci.interware.mx/nexus/repository/interware-snapshot"]
                 ["releases" {:sign-releases false 
                              :url "https://ci.interware.mx/nexus/repository/interware-release"}]]
  :main interware.mx.leveldb-micro)
