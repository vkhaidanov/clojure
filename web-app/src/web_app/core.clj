(ns web-app.core
  (:require [ring.adapter.jetty :as jetty])
  (:require [hiccup2.core :as h])
  
  (:gen-class))

(defn handler
  [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (str(h/html [:div "Test"]))
  })

(defn -main
  []
  (jetty/run-jetty handler
                   {:port 3000
                    :join? true}))

