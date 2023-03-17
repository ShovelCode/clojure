(require '[clojure.java.jdbc :as jdbc])

(def db-spec {:classname "org.postgresql.Driver"
              :subprotocol "postgresql"
              :subname "//localhost:5432/mydatabase"
              :user "myuser"
              :password "mypassword"})

(jdbc/with-db-connection [conn db-spec]
  (let [result (jdbc/query conn ["SELECT * FROM mytable"])]
    (doseq [row result]
      (println row))))
