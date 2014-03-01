(ns hello-node-cljs.core
    (:require [cljs.nodejs :as nodejs]
              [hello-node-cljs.server :as server]
              [hello-node-cljs.greet :as greet]))

(defn -main []
  (-> (server/app)
      (server/static "static")
      (greet/init)
      (server/listen 3000)))

(nodejs/enable-util-print!)
(set! *main-cli-fn* -main)
