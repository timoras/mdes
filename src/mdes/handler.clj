(ns mdes.handler
  (:use compojure.core)
  (:use mdes.models)

  ;(:require [compojure.core :refer :all]
  ;          [compojure.handler :as handler]
  ;          [compojure.route :as route])
      )

(defroutes app
  (GET "/" [] "Hello World")
  (GET "/next" [] (str "Hello World" (class (by-id 1)) (by-id 1))))

;(defroutes app-routes
;  (GET "/" [] "Hello World")
;  (GET "/start" [] (srt "HiNnello World" (mdes.models/addss 8))
;  (route/resources "/")
;  (route/not-found "Not Found"))
;
;(def app
;  (handler/site app-routes))
