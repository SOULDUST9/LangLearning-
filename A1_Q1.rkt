#lang scheme
; Sebastian Janeczek 300361784 
; time spent: 20 min (i could not get the parenthesis's to work for the life of me)

(define (triangle-area x y z)
  (if (and (> x 0) (> y 0) (> z 0)) ; checks if its a valid triangle
      (let ((s (/ (+ x y z) 2)))  
        (sqrt (* s (- s x) (- s y) (- s z)))) ; area calc
      (display "Not a valid triangle")))
  
    
(triangle-area 3 4 5)
(triangle-area 7 8 9)
(triangle-area 10 10 10)
(triangle-area -10 -10 -10)