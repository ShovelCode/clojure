(defn and-chain [x y z]
  (and x y z (do (println "All true!") :all-truthy)))

(and-chain () 42 true) ;all true
(and-chain true false true) ;false


;triangular numbers, infinite sequence

(defn triangle [n]
  (/ (* n (+ n 1)) 2)
  
(triangle 10) ;ouput 55

;list of first 10 triangle numbers
(map triangle (range 1 11))

;infinite sequence

(def trinums (map triangle (iterate inc 1)))

;first 10 
(take 10 trinums)

;first 10 even
(take 10 (filter even? trinums))

;the 99th trinum
(nth trinums 99)
