(ns myapp.core
  (:require [clj-http.client :as client]
            [clojure.data.json :as json]))

(def access-token-url "https://login.salesforce.com/services/oauth2/token")
(def query-url "https://yourinstance.salesforce.com/services/data/v51.0/query?q=SELECT+Id,+Name+FROM+Account")

(defn get-access-token [client-id client-secret username password security-token]
  (let [params {:grant_type "password"
                :client_id client-id
                :client_secret client-secret
                :username username
                :password (str password security-token)}]
    (-> (client/post access-token-url {:form-params params})
        :body
        json/read-string
        :access_token)))

(defn get-salesforce-data [access-token]
  (-> (client/get query-url {:headers {"Authorization" (str "Bearer " access-token)}})
      :body
      json/read-string
      :records))

;; Replace these values with your Salesforce credentials
(def client-id "your-client-id")
(def client-secret "your-client-secret")
(def username "your-username")
(def password "your-password")
(def security-token "your-security-token")

;; Get an access token
(def access-token (get-access-token client-id client-secret username password security-token))

;; Query Salesforce data
(def salesforce-data (get-salesforce-data access-token))
