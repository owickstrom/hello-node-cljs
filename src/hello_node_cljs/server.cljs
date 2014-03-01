(ns hello-node-cljs.server)

(def ^:private express (js/require "express"))

(defn app [] (express))

(defn GET [app path handler]
  (.get app path handler))

(defn static [app directory]
  (.use app ((aget express "static") directory)))

(defn listen [app port]
  (.listen app port))
