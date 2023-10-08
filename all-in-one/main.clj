(defn testFn 
  [in]
  (+ in 1)
  )

(testFn 1)

(-> 1 (+ 2) (- 4))
comment(
        (- (+ 2 1) 4)
) 

(->> 1 (+ 2) (- 4)) 
;;(- 4 (+ 2 1))

(defn inc_first [n]
  (-> n  inc))
(-> 1 inc inc inc)
(println (map (fn [n]
             (-> n inc))  #{1 2 3} ))

(-> #{1 2} first inc)

;;hash map
(println (hash-map :key 1 :value 'value) :value)
(println (get {:key 1 :value 'value} :value1 "missing"))