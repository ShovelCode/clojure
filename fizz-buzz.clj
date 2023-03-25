(defn fizzbuzz [n]
  (for [i (range 1 (inc n))]
    (cond
      (and (zero? (mod i 3)) (zero? (mod i 5))) "FizzBuzz"
      (zero? (mod i 3)) "Fizz"
      (zero? (mod i 5)) "Buzz"
      :else i)))
