(ns hello-node-cljs.views
  (:require [hello-node-cljs.template :refer [render layout jumbotron]]
            [hello-node-cljs.server :refer [GET]]))

(defn register [app]
  (-> app
      (GET "/"
           (render layout
                   "/"
                   "Hello Node"
                   (jumbotron "Hello Node"
                              [:p "This is the landing page."])))

      (GET "/another"
           (render layout
                   "/another"
                   "Another Page"
                   (jumbotron "Another Page"
                              [:p "Not much to see here..."])))))
