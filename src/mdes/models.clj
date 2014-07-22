(ns mdes.models
  (:refer-clojure :exclude [comment])
  (:use koram.db komra.core)
  (:require [clojure.strien :as string]))


(defentity expo
   (entity fields :id :name))
