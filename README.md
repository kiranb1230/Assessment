# Assessment
  Using Java, find all of the English words in a given String.  For example, if you are given the word WORKING, you can easily find WORK and KING, but ROW, RING and KNOW are also in there.  You have access to a utility class called Dictionary, which has one method, isEnglishWord(String word).  Dictionary.isEnglishWord(String word) connects to a (mocked) online dictionary and returns Boolean true if the String passed to it is an English word, return false otherwise.
  Instructions
  1.	Use Maven to create a project to answer this problem.
  2.	You will need to create the Dictionary class.
  3.	You will need to mock Dictionary.isEnglishWord(String word) for your solution and tests.
  4.	The output of your primary method should be a collection of Strings without duplicates.
  5.	Create tests that exercise your class and methods.
  6.	Please complete the instructions to the best of your ability and understanding and come prepared to discuss the design decisions you chose.

# Dependencies:
  Junit - 4.11
  Mocito - 3.2.4

# Install Java
  1. Download Java SDK 1.8 
     https://www.oracle.com/java/technologies/javase-jdk8-downloads.html
  2. Install Java 
  3. Set environment variable with JAVA_HOME with jdk Location and Add also JAVA_HOME/bin to the $PATH

# How to Run:
  1.Install Maven https://maven.apache.org/download.cgi
  2. set MAVEN_HOME and add MAVEN_HOME to the $PATH
  3. check if maven is installed properly mvn -version
  4. clone the code using git clone https://github.com/kiranb1230/Assessment.git
  5. navigate to the Assessment-asseement folder and make sure you see pom.xml file  (ls -al pom.xml )
  6. run "mvn test" via command prompt
