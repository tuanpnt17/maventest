/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tuanpnt17.mytest;

import com.tuanpnt17.maventest.Maventest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author TuanPNTSE173039
 */
public class DDTest {
  
  public static Object[][] initData() {
    return new Integer[][]{{1, 1}, {2, 2}, {5, 120}, {6, 720}};
  }

  //Data Driven Test
  //Khi test thì từng testcase là từng cặp giá trị trong initData
  @ParameterizedTest
  @MethodSource(value = "initData")
  void testGetFactorialDDT(int num, long expected) {
    assertEquals(expected, Maventest.f(num));
  }
  
}
