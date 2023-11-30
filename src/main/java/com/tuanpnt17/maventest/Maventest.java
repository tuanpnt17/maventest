/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.tuanpnt17.maventest;

/**
 *
 * @author TuanPNTSE173039
 */
public class Maventest {

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }

  public static long f(int num) {
    if (num <= 0) {
      throw new IllegalArgumentException("Nguu");
    }

    long result = 1;
    for (int i = 1; i <= num; i++) {
      result *= i;
    }
    return result;
  }
}
