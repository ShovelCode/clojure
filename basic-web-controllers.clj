(ns myapp.controllers
  (:require [compojure.core :refer [defroutes GET POST]]
            [ring.util.response :refer [response]]))

(defn index-page []
  (response "Welcome to my app!"))

(defn hello-page [name]
  (response (str "Hello, " name "!")))

(defroutes app-routes
  (GET "/" [] (index-page))
  (GET "/hello/:name" [name] (hello-page name)))

