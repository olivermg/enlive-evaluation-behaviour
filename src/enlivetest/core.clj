(ns enlivetest.core
  (:require [net.cgrand.enlive-html :refer [deftemplate defsnippet] :as html]))

(deftemplate page "index.html"
  [ctx]
  [:.foobar] (html/content (do (println "GENERATING FOOBAR")  ;; why does this get evaluated?
                               "===FOOBAR===")))
