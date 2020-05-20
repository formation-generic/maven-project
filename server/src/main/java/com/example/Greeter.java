package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

 /**
   * @Param someone  : the name of a person
   * @Return greting string
   */
  public final String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
