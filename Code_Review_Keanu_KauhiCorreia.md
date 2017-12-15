Project name: XMPPChat		
Programmers: Matthew Greenberg, Isabella Cedric, Matthew Schwab
Code Reviewer: Keanu Kauhi-Correia

On a scale of 1 to 5, I give this code a rating of 3 based on the following criteria:

1  I was not able to compile the program due to insufficient information in the README.md file.

2  At least one of the programs has syntax errors and does not compile

3  The programs compile successfully but at least one generates runtime errors
	- NewLogin.java generates a runtime error on click of Login button
	Exception in thread "AWT-EventQueue-0" java.lang.NoClassDefFoundError: de/measite/minidns/hla/ResolverApi
	
	Being that it's a NoClassDef exception, which usually means that a lib is missing (in this case, minidns from the Smack API), I'm
	really hoping that it's me not being able to import the libs by following the instructions on the repo :(. I've tried to manually resolve each problem 
	by browsing to each individual JAR on importing the project as well to no avail. If the error was on my end, I do apologize as this really deserves at least a 5. 
	Code for handling no connection to server seems solid
	
4  The programs compile and run but the project does not perform correctly and does not produce correct results.
Specifically:

5  The programs compile and produce technically correct results but does not perform according to the documentation or does not comply with Chapman Coding Standards.
Specifically:

6  The program produces correct output and is well written and well documented, following the Chapman Coding Standards.

Suggestions for improving the code (for extra credit!):
	- Perhaps a bit more specific error message on if the connection to server fails? Some possibles
		- DNS couldn't resolve, if you happen to type in a domain
		- Connection refused
	- Also didn't notice that it checks for blank fields and sanitization, if that's necessary