(ns mdes.models
  (:refer-clojure :exclude [comment])
  (:use korma.db korma.core)
  (:require [clojure.string :as string]))

(defdb prod (postgres {:db "des_db"
                        :user "desuser"
                        :password "desuser"
                        :host "172.17.33.10"}))
(defentity expo
           (pk :id)
           (table :expo)
           (database prod)
           (entity-fields :name :description :url_code :secret_code))

(defn public-user-expo [url-code secret-code]
  (first (select expo (fields :id )
          (where {:url_code url-code :secret_code secret-code} ))))