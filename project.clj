(defproject mdes "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.8"]
                 [migratus "0.7.0"]
                 [postgresql/postgresql "9.0-801.jdbc4"]]
  :plugins [[lein-ring "0.8.11"]
            [migratus-lein "0.1.0"]]
  :ring {:handler mdes.handler/app}
  :migratus {:store :database
             :migration-dir "migrations"
             :db  {:classname "org.postgresql.Driver"
                   :subprotocol "postgresql"
                   :subname "//172.17.33.10/des_db"
                   :user "desuser"
                   :password "desuser"}}
  :profiles
  {:dev {
          :kapooya { :environment "development"
                     :db-spec { :subprotocol "postgresql"
                                :subname "172.17.33.10/des_db"
                                :user        "desuser"
                                :password    "desuser" }}
          :dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
