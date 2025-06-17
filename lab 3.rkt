#lang scheme



; p1

(define (min-element L)
  (letrec ((min-helper (lambda (lst current-min)
                         (if (null? lst)
                             current-min
                             (min-helper (cdr lst)
                                         (if (< (car lst) current-min)
                                             (car lst)
                                             current-min))))))
    (if (null? L)
        2000000000  
        (min-helper (cdr L) (car L)))))  
(min-element '(22 18 14 9 31 44))
(min-element '(7))



; p2

(define (palindrome str)
  (let ((reversed (list->string (reverse (string->list str)))))  
    (string=? str reversed)))  

(palindrome "madam")
(palindrome "bahrami")



; p3

(define (isSubString str1 str2)
  (let ((len1 (string-length str1))
        (len2 (string-length str2)))
    (let loop ((i 0))  
      (cond
        ((> (+ i len1) len2) #f)  
        ((string=? str1 (substring str2 i (+ i len1))) #t)  
        (else (loop (+ i 1)))))))  

(isSubString "him" "Rahim Bahrami")
(isSubString "Blue" "Mrs. Green") 