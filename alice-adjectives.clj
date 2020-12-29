(def adjs ["normal"
           "too small"
           "too big"
           "is swimming"])
 
(defn alice-is [input]
  (loop [in input out []]
    (if (empty? in)
      out
      (recur (rest in)
        (conj out
          (str "Alice is " (first in)))))))
          
[Alice is normal Alice is too small Alice is too big Alice is is swimming]
[Alice is normal Alice is too small Alice is too big Alice is is swimming]
