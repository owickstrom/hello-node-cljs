(defproject hello-node-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173"]
                 [hiccups "0.3.0"]]

  :node-dependencies [[express "latest"]]
  :nodejs {:scripts {:start "node server"}}

  :plugins [[lein-cljsbuild "1.0.2"]
            [lein-npm "0.3.0"]]

  :source-paths ["src"]
  :cljsbuild {:builds [{:id "server"
                        :source-paths ["src"]
                        :compiler {:output-to "server.js"
                                   :output-dir "out"
                                   :target :nodejs
                                   :optimizations :simple}}]})
