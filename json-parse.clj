(ns org.currylogic.damages.http.expenses)
 
(use 'org.danlarkin.json)
(use 'clojure.xml)
 
 
(defn import-transactions-xml-from-bank [url]
  (let [xml-document (parse url)]
  ;;more code here
 
 
(defn totals-by-day [start-date end-date]
  (let [expenses-by-day (load-totals start-date end-date)]
     (encode-to-str expenses-by-day)))
