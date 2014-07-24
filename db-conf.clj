(use 'korma.db)
(require '[clojure.string :as str])

(defdb db (postgres {:db "des_db"
                     :user "des user"
                     :password "desuser"
                     :host "172.17.33.10"}))