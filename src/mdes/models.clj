(ns mdes.models
  (:refer-clojure :exclude [comment])
  (:use korma.db korma.core)
  (:require [clojure.string :as string]))

(def hello (fn [] "Hello world"))

(defn addss [x]
  (+ x 6))

(defdb prod (postgres {:db "des_db"
                        :user "desuser"
                        :password "desuser"
                        ;; optional keys
                        :host "172.17.33.10"}))

(declare expo)

(defentity expo
           (pk :id)
           (table :expo)
           (database prod)
           (entity-fields :name))


(defn by-id [id]
  (select expo (fields :id :name) (where {:id id} )))