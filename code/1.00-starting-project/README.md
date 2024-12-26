# 01 Test Coverage in IntelliJ
- Run All Tests with coverage

# 02 Test Report with Maven SUREFIRE
- Maven installed
- Verify version
  - mvn -version
- Development Process
  1. Configure Maven to find unit tests
    - Resolve this by using Maven Surefire Plugin version 2.22.0 or higher
    - See the pom.xml build section
  2. Run unit tests
   - mvn clean test
   - mvn site -DgenerateReports=false  (No sobreescriba reports & some style css)
   - Results at : target/site/surefire-report.html
```
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.0.0-M5</version>
            
            <configuration>
                <!-- GET REPORTS IF TESTS FAIL -->
                <testFailureIgnore>true</testFailureIgnore>
                <!-- SHOW @DisplayName -->
                <statelessTestsetReporter implementation="org.apache.maven.plugin.surefire.extensions.junit5.JUnit5Xml30StatelessReporter">
                    <usePhrasedTestCaseMethodName>true</usePhrasedTestCaseMethodName>
                </statelessTestsetReporter>
            </configuration>
        </plugin>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-report-plugin</artifactId>
            <version>3.0.0-M5</version>
            <executions>
                <execution>
                    <phase>test</phase>
                    <goals>
                        <goal>report</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>        
```
# 03 Test Coverage with Maven JACOCO
- Maven installed
- Verify version
    - mvn -version
- Development Process
  1. See pom.xml
  2. Run unit tests
    - mvn clean test
    - Results at : target/site/jacoco/index.html
 
```
<build>
    <plugins>
        ...
        <plugin>
            <groupId>org.jacoco</groupId>
            <artifactId>jacoco-maven-plugin</artifactId>
            <version>0.8.7</version>

            <!-- GENERATE CODE COVERAGE REPORTS JACOCO (JAVA CODE COVERAGE) -->
            <executions>
                <execution>
                    <id>jacoco-prepare</id>
                    <goals>
                        <goal>prepare-agent</goal>
                    </goals>
                </execution>

                <execution>
                    <id>jacoco-report</id>
                    <phase>test</phase>
                    <goals>
                        <goal>report</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```

# 04 See all reports Test and Coverage with Maven JACOCO
- mvn clean test
- mvn site -DgenerateReports=false 
- Results at : target/site/surefire-report.html
- Results at : target/site/jacoco/index.html