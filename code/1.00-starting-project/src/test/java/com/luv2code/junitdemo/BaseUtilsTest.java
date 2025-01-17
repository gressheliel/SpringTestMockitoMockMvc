package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)  //Commentar @DisplayName
//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)  //Commentar @DisplayName
//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)  //Commentar @DisplayName
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BaseUtilsTest {

    DemoUtils demoUtils;

    @BeforeAll
    static void setupBeforeAll(){
        System.out.println("### @BeforeAll run  before all methods, Only once. ###");
    }
    @BeforeEach
    void setupBeforeEach(){
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach run  before each method");
    }

    @AfterEach
    void setupAfterEach(){
        System.out.println("@AfterEach run  after each method");
    }

    @AfterAll
    static void setupAfterAll(){
        System.out.println("### @AfterAll run  after all methods, Only once. ####");
    }

}
