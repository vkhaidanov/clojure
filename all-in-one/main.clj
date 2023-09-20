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