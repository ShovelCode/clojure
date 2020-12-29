(use 'clojure.java.jdbc)
 
(let [db-host "localhost"
      db-port 3306
      db-name "a_database"]
 
  (def db {:classname "com.mysql.jdbc.Driver" ; must be in classpath
           :subprotocol "mysql"
           :subname (str "//" db-host ":" db-port "/" db-name)
           ; Any additional keys are passed to the driver
           ; as driver-specific properties.
           :user "a_user"
           :password "secret"}))
