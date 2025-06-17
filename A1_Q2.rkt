#lang scheme
; Sebastian Janeczek 300361784 
; time spent: an hour
; reason: i kept having trouble with something, figured out it was th let part mainly the cadr and caddr (i had it as cdar cddar) 
(define (bst-insert tree value)
  (if (null? tree)                     
      (list value '() '())            
      (let ((node-value (car tree))    
            (left-tree (cadr tree))   
            (right-tree (caddr tree))) 
        (cond ((< value node-value)   
               (list node-value (bst-insert left-tree value) right-tree))
              ((> value node-value)
               (list node-value left-tree (bst-insert right-tree value)))
              (else tree)))))

(define (bst-search tree value)
  (if (null? tree)                  
      #f                            
      (let ((node-value (car tree))
            (left-tree (cadr tree))
            (right-tree (caddr tree))) 
        (cond ((= value node-value)
               #t)                 
              ((< value node-value)
               (bst-search left-tree value))
              ((> value node-value) 
               (bst-search right-tree value))))))
 
(define tree '())                    

(set! tree (bst-insert tree 5))       
(set! tree (bst-insert tree 3))      
(set! tree (bst-insert tree 7))    
(set! tree (bst-insert tree 4))      
(set! tree (bst-insert tree 6))       

(bst-search tree 4)
(bst-search tree 100)

(car tree)
(cdr tree)