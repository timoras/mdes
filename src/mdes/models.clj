(ns mdes.models
  (:refer-clojure :exclude [comment])
  (:use korma.db korma.core)
  (:require [clojure.string :as string]))

(defdb prod (postgres {:db "des_db"
                        :user "desuser"
                        :password "desuser"
                        :host "172.17.33.10"}))

(declare expo expo-item)

(defentity expo-item
           (database prod)
           (table :expo_item)
           (pk :id)
           (entity-fields :name :description :file_path)
           (has-many expo {:fk :expo_id}))

(defentity expo
           (pk :id)
           (table :expo)
           (database prod)
           (entity-fields :name :description :url_code :secret_code)
           (has-many expo-item {:fk :expo_id}))

(defn public-user-expo [url-code secret-code]
  (first (select expo
                 (fields :id)
                 (with expo-item)
                 (where {:url_code url-code :secret_code secret-code}))))
