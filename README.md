# factsoft
CREATING the JAR file:
if mvn command it's not working try mvn install first 
1.Update your pom.xml with this
***
<build>
        <plugins>
            <plugin>
                <!-- Build an executable JAR -->
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <version>2.4</version>
                <configuration>
                    <archive>
                        <manifest>
                            <addClasspath>true</addClasspath>
                            <classpathPrefix>lib/</classpathPrefix>
                            <mainClass>Main</mainClass>
                        </manifest>
                    </archive>
                </configuration>
            </plugin>
        </plugins>
    </build>
*** 
2.Open terminal in the directory where you have the project and run "mvn package",it will create your .jar file
3.Now run mvn clean package 
4.Finally you should run java -jar target/nameOfFile-1.0-SNAPSHOT.jar
