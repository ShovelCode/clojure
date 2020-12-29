(def guys-whole-name ["Guy" "Lewis" "Steele" ])
  (str (nth guys-whole-name 2) ", "
       (nth guys-whole-name 0) " "
       (nth guys-whole-name 1))
       
(prn guys-whole-name)
(prn(class guys-whole-name))
 
(def theName (str
  (nth guys-whole-name 2) ", "
  (nth guys-whole-name 0) " "
  (nth guys-whole-name 1)))
  
(prn theName)
