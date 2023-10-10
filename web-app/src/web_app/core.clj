(ns web-app.core
  (:require [ring.adapter.jetty :as jetty])
  (:gen-class))

(defn handler
  [request]
  {:status 200
   :headers {"Content-Type" "test/html"}
   :body "Hello World!"   
  })

(defn -main
  []
  (jetty/run-jetty handler
                   {:port 3000
                    :join? true}))

