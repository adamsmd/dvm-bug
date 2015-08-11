package com.example.inheritance;

import com.example.other.C3;

public class C4 {
  public static void main(String [] args) {
    C1 c1 = new C3();
    C2 c2 = new C3();
    C3 c3 = new C3();

    System.out.println("C1: " + c1.doTheThing());
    System.out.println("C2: " + c2.doTheThing());
    System.out.println("C3: " + c3.doTheThing());
  }
}
