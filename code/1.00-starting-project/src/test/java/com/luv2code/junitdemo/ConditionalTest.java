package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {

    @Test
    @Disabled("Don't run until JIRA #123 is resolved")
    void basicTest(){
        // execute method and perform assert
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly(){
        // execute method and perform assert
    }
    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinuxOnly(){
        // execute method and perform assert
    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.WINDOWS})
    void testForWindowsAndLinux(){
        // execute method and perform assert
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testForOnlyJava17(){
        // execute method and perform assert
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_13, max = JRE.JAVA_18)
    void testForRangeJava(){
        // execute method and perform assert
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "LUV2CODE_ENV", matches = "DEV")
    void testForDevEnvironment(){
        // execute method and perform assert
    }

    @Test
    @EnabledIfSystemProperty(named = "LUV2CODE_SYS_PROP", matches = "DEV")
    void testForSystemProperty(){
        // execute method and perform assert
    }
}
