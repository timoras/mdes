(ns mdes.handler
  (:use compojure.core)
  (:use mdes.models)
  (require [clojure.data.json :as json])
  ;(:require [compojure.core :refer :all]
  ;          [compojure.handler :as handler]
  ;          [compojure.route :as route])
      )

(defroutes app
  (GET "/" [] "Hello World")
  (GET "/:url-code/:secret-code" [url-code secret-code]
       (if-let [proj (public-user-expo url-code secret-code)]
           (json/write-str proj)
           {:status 404 :body "NotFound"})))

;(defroutes app-routes
;  (GET "/" [] "Hello World")
;  (GET "/start" [] (srt "HiNnello World" (mdes.models/addss 8))
;  (route/resources "/")
;  (route/not-found "Not Found"))
;
;(def app
;  (handler/site app-routes))
