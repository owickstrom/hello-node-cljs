(ns hello-node-cljs.greet
  (:require [hiccups.runtime :as hiccupsrt]
            [hello-node-cljs.template :refer [render layout nav jumbotron a]]
            [hello-node-cljs.server :refer [GET]])
  (:require-macros [hiccups.core :refer [defhtml]]))

(defn init [app]
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
