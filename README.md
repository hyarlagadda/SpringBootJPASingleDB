# SpringBootJPASingleDB
Demo Spring-boot-jpa using  a single DB. You only write minimal amount of code. Focus on business logic. Don't worry about connections etc

Spring Boot does a lot of heavy lifting for you. It follows the convention over configuration.
 (a). It reads your property
 (b). Creates a database connection
 (c). Provides interfaces for high level SQL operations (CrudRepository) for you. 
 (d). DI using @Atuowired is nice.

Step 1: Since we are using Oracle as database you need to download oracle driver ojdbc6.jar from http://www.oracle.com/technetwork/apps-tech/jdbc-112010-090769.html
Step 2: Install jar in local maven repo "mvn install:install-file -Dfile=ojdbc6.jar -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0 -Dpackaging=jar"
Step 3: Run "mvn clean install"
Step 4: Run the application.

