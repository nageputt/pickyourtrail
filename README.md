# pickyourtrail 
 In this repo contains the code for the Palindrome and Mudwall java programs
# Command-line Instructions

- Prerequisites:
  - Download and install the latest version of the [Java Platform](https://www.oracle.com/technetwork/java/javase/downloads/index.html), [Standard Edition Development Kit](https://www.oracle.com/technetwork/java/javase/downloads/index.html). 
  - To make sure that Windows can find the Java compiler and interpreter:
    - Select Start -> Computer -> System Properties -> Advanced system settings -> Environment Variables -> System variables -> PATH.
     - [ In Vista, select Start -> My Computer -> Properties -> Advanced -> Environment Variables -> System variables -> PATH. ]
     - [ In Windows XP, Select Start -> Control Panel -> System -> Advanced -> Environment Variables -> System variables -> PATH. ]
   - Prepend C:\Program Files\Java\jdk1.6.0_27\bin; to the beginning of the PATH variable.
   - Click OK three times.
   
 - Compile the Program
   - You will use the javac command to convert your Java program into a form more amenable for execution on a computer.
   - From the Command Prompt, navigate to the directory containing your .java files, 
   - Assuming the file, say Palindrome.java, is in the current working directory, type the javac command in boldface below to compile it.
   - If everything went well, you should see no error messages.
   
 - Execute the Program
   - You will use the java command to execute your program.
   - From the Command Prompt, type the java command below.
     C:\xxx\xxx\>java Palindrome
   - If all goes well, you should see the output of the program.
   
# Eclipse Instructions

- Prerequisites:
  - Install [Eclipse](https://www.eclipse.org/downloads/).
  
- Import from git.
  - Open eclipse.
  - Right click in Navigator -> click on import -> select the git(Project from Git ) -> click on Next
  - Select Clone URL -> input the fileds URL (https://github.com/nageputt/pickyourtrail) -> clcik on Next
  - Select the master branch -> Click on Next for 3 times
  
 - Run the program
   - Open the file you want to run (eg: Palindrome.java).
   - Right click the file -> select run as -> run as java application.
   - Input the data in console.
