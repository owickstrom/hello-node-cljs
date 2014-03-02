(ns hello-node-cljs.core
    (:require [cljs.nodejs :as nodejs]
              [hello-node-cljs.server :as server]
              [hello-node-cljs.views :as views]))

(defn -main []
  (-> (server/app)
      (server/static "static")
      (views/register)
      (server/listen 3000))
  (println "Server started at localhost:3000"))

(nodejs/enable-util-print!)
(set! *main-cli-fn* -main)
