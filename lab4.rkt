#lang scheme
(define (sum-sequence v begin end)
  (do ((sum 0 (+ sum (vector-ref v i))) 
       (i begin (+ i 1)))               
      ((> i end) sum)))                   


(sum-sequence '#(2 6 -3 4 7 1 5) 2 5)
(sum-sequence '#(6 7 4) 2 1)






(define (binary-search-recursive v x)
  (define (search left right)
    (if (> left right)
        -1
        (let* ((mid (quotient (+ left right) 2))
               (mid-val (vector-ref v mid)))
          (cond
            ((= mid-val x) mid)
            ((< mid-val x) (search (+ mid 1) right))
            (else (search left (- mid 1)))))))
  (search 0 (- (vector-length v) 1)))

(binary-search-recursive '#(5 12 21 34 56 67 89) 56)
(binary-search-recursive '#(5 12 21 34 56 67 89) 44)





(define (binary-search-loop v x)
  (let loop ((left 0) (right (- (vector-length v) 1)))
    (if (> left right)
        -1
        (let* ((mid (quotient (+ left right) 2))
               (mid-val (vector-ref v mid)))
          (cond
            ((= mid-val x) mid)
            ((< mid-val x) (loop (+ mid 1) right))
            (else (loop left (- mid 1))))))))


(binary-search-loop '#(5 12 21 34 56 67 89) 56)

(binary-search-loop '#(5 12 21 34 56 67 89) 44)