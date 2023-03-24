; A palindrome function
(defn palindrome? [s]
  (= s (apply str (reverse s))))

(println (palindrome? "racecar"))  ; true
(println (palindrome? "hello"))    ; false
