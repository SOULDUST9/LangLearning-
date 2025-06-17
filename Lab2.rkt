#lang scheme

; task 1
(define (sumDiv a b d)
  (if (> a b)
      0
      (if (= (modulo a d) 0) 
          (+ a (sumDiv (+ a 1) b d)) 
          (sumDiv (+ a 1) b d))))   

(sumDiv 6 12 4)
(sumDiv 1 10 3)


; task 2

(define (count L x)
  (if (null? L) 
      0 
      (if (= (car L) x)
          (+ 1 (count (cdr L) x)) 
          (count (cdr L) x))))    

(count '(5 2 3 4 5 6 5 4 2) 5)
(count '(1 2 3 1 5 6 5 4 2) 7) 


; task 2

(define (remove-repetition L)
  (if (null? L)
      '() 
      (if (member (car L) (cdr L))
          (remove-duplicates (cdr L)) 
          (cons (car L) (remove-repetition (cdr L))))))

(remove-repetition '(1 2 4 5 6 5 4 7))
(remove-repetition '(1 4 1 2))
(define org '())
(cons org '(8))
 (cons org '(9))

(define (bst-insert L value)
  (if (null? L) ; checks if sub tree is a empty node
      '(value)
      (if (<= value (car L))
          (if (null? (cdr (car L)))
              '(value)
              (bst-insert (cdr (car L)) value))
          (if (> value (car L))
              (if (null? (cdr (cdr L)))
                  '(value)
                  (bst-insert (cdr (car L)) value))
              ))))
(define (bst-search tree value)
  (if (eq? tree '())  ; If the tree is empty, return #f
      #f
      (if (and (number? (car tree)) (= value (car tree)))  ; If the value matches the current node value, return #t
          #t
          (if (or (bst-search (cadr tree) value)  ; Search the left subtree
                  (bst-search (cddr tree) value))  ; Search the right subtree
              #t  ; If value is found in either subtree, return #t
              #f))))  ; Otherwise, return #f


(define (bst-search tree value)
  (if (eq? tree '())  ; If the tree is empty, return #f
      #f
      (if (and (number? (car tree)) (= value (car tree)))  ; If the value matches the current node value, return #t
          #t
          (if (and (number? (car tree)) (< value (car tree)))
              (bst-search (cdr (car tree)) value)  ; Search the left subtree
              (if (and (number? (car tree)) (< value (car tree)))
                  (bst-search (cdr (cdr  tree)) value)
                  #f)))  ; Search the right subtree
              ))  ; Otherwise, return #f
 

    


(bst-search '(7 '(3 '() '()) '(10 '() '())) 10) ; Should return #t
(bst-search '(10 (5 '() '()) '(15 '() '())) 3)  ; Should return #f
