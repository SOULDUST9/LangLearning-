#lang scheme
; Sebastian Janeczek 300361784 
; time spent: an hour
; reason: was having trouble stream function maily y they wouldnt work and it was because i wasnt delaying the lamda funct 
; also i was really struglling with the car and cdr function i could not figure out how to do it, until i though to do a similar thing that we are doing with fib-stream

(define (stream-cons first rest)
  (lambda () (cons first rest))) 


(define (stream-car s)
  (car (s)))  


(define (stream-cdr s)
  ((cdr (s))))  


(define (lazy-fib)
  (define (fib-stream a b)
    (stream-cons a (lambda () (fib-stream b (+ a b)))))  
  (fib-stream 0 1))  

(define (nth-fib stream n)
  (if (= n 0)
      (stream-car stream)  
      (nth-fib (stream-cdr stream) (- n 1)))) 


(nth-fib (lazy-fib) 0) 

(nth-fib (lazy-fib) 5)

(nth-fib (lazy-fib) 10)  

(nth-fib (lazy-fib) 20)


