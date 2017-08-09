package com.mycompany.test;

public class Calculator {

  public static void main(String[] args){
    int a = 4;
    int b = 2;
    System.out.println( sum(a,b) );
    System.out.println( sub(a,b) );
  }

  private static int sum ( int a, int b){
    return a + b;
  }

  private static int sub ( int a, int b){
    return a - b;
  }

  public static int mul ( int a, int b){
    int result = a * b;
    return result;
  }

  public static int div ( int a, int b){
    return a / b;
  }
}
