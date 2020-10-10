#COO Project
##About
    This project solves the exercise proposed in class COO. 
    Full text is available [here](https://www.fil.univ-lille1.fr/~quinton/coo/projet/competitions.pdf).

##Obtain code
    From a terminal type: 

    git clone git@gitlab-etu.fil.univ-lille1.fr:bragagnoloc/coo_project.git

#Obtain Maven
    this project is managed by Maven.
    For being able to compile / generate javadoc and execute tests and examples we are going to need a fully functional maven installation.
    For doing so in Ubuntu 20, we can follow the tutorial [here](https://tecadmin.net/install-apache-maven-ubuntu-20-04/)
    For other operative systems there are many available tutorials in the [apache maven site](https://maven.apache.org/install.html)

##Install 
    Step into the project folder Ensure that the file *pom.xml* is in this location.
    execute the following line
    $ mvn install 
    
    Maven will download the required libraries for Junit 5.6.2 testing. As well is going to execute the tests (4 in total).
    Our project is also configured to produce a jar and a javadoc. Within the project folder we are going to find the target folder.
    In the target folder we are going to find a jar for the project and a jar for the javadoc: 
    ./target/SportCompetitionMaven-0.0.1-SNAPSHOT.jar
    ./target/SportCompetitionMaven-0.0.1-SNAPSHOT-javadoc.jar

    In the first archive we can find the compiled classes.
    In the second archive we can find a generated javadoc website.

##Execute Example 
     Our project counts with a main program. This main program runs a League and a Tournament competitions with 8 different teams each.
     After the execution of each of this programs we list the rankings in the standar output.
     For executing the example, step into the project folder and execute

     $ mvn exec:java -Dexec.mainClass="coo.project.core.MainCompetition"

     If is desired to execute by using only the jar file we should execute the following command instead

     $ java -jar target/SportCompetitionMaven-0.0.1-SNAPSHOT.jar


##Maven POM file 
   The  maven file is based in a public archetype named "java11-junit5" available in the maven central repository.
   For adding javadoc generation capability I added the plugin maven-javadoc-plugin (3.2.0). 
   

    

   