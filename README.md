
# Stopwatch tasks by Sathira Kittisukmongkol (5910545868)


I ran the tasks on a MacBookPro , and got these results:

Task 							| sec
--------------------------------------------------------|-----
Append 50,000 chars to String 				| 1.272830 sec
Append 50,000 chars to StringBuilder 			| 0.001232 sec
Append 100000 chars to String 				| 2.241992 sec
Append 100000 chars to StringBuilder			| 0.002520 sec
Sum 1,000,000,000 double values from an array 		| 1.498159 sec
Sum 1,000,000,000 Double objects having the same values as in task 4.		| 4.418951 sec
Sum 1,000,000,000 BigDecimal objects having the same values as in task 4.  	| 9.462163 sec


## Explanation of Results
1.StringBuilder is faster than String beacuse if we add new words into String, String  will create new reference numbers or new memory but if we add new words into StringBuilder , StringBuilder will add them to the old reference number so it means the same reference number has more characters in it. We can create new reference numbers of StringBuilder by create new object of it.
^M 2.The double primitive is the fastest. The Double object is slower. The BigDecimal is the slowest. Double Object is slower than double primitive because the value of Double object is wrapped inside an object which needs allocation , deallocation , memory management plus getters and setters. 
