(println "Getting started with Clojure") ;outputs are side effects
 
(+ 1243 2328 21238 423) ;a sum of an arbitary list of numbers
 
(< 0 1 3 9) ;returns true
 
(def ratpi (/ 22 7)) ;approximation of pi
 
(def x 42) ;what is essentially assignment and mutability
 
;an anonymous function
(( fn [x y] ; like a header
  (println "making a set") ;body
  #{x y}) ;return value
  1 2) ;arguments directly inserted
 
(do 
  (def x 5)
  (def y 4)
  (+ x y)
  [x y])
;output from this is [5 4]
 
(Math/sqrt 9) ;3.0
 
;an instance of a Java object
 
(new java.awt.Point 0 1)
 
(defn print-seq [s]
  (when (seq s)
   (prn (first s))
   (recur (rest s))))
 
(def clueless 9)
(class clueless) ;java.lang.Long
 
(def guys-whole-name ["Guy" "Lewis" "Steele" ])
  (str (nth guys-whole-name 2) ", "
       (nth guys-whole-name 0) " "
       (nth guys-whole-name 1))
;output should be Steele, Guy Lewis
 
(class #"example") ;java.util.regex.Pattern
