(ns hello-node-cljs.template
  (:require [hiccups.runtime :as hiccupsrt])
  (:require-macros [hiccups.core :refer [defhtml]]))

(defhtml a [href text]
  [:a {:href href} text])

(defhtml link [rel href]
  [:link {:rel rel :href href}])

(def ^:private links
  {"/" "Home"
   "/another" "Another"})

(defhtml nav [active]
  [:ul.nav.nav-tabs
   (for [[href text] links]
     [(if (= href active) :li.active :li)
      (a href text)])])

(defhtml layout [path title & body]
  [:head
   [:title title]
   (link "stylesheet" "bootstrap.min.css")
   (link "stylesheet" "main.css")]
  [:body [:div.container
          (nav path)
          body]])

(defhtml jumbotron [title & children]
  [:div {:class "jumbotron"}
   [:h1 title]
   children])

(defn render [template & args]
  (fn [res req]
    (.send req (apply template args))))
