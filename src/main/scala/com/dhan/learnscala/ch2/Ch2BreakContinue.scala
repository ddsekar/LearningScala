package com.dhan.learnscala.ch2

import scala.util.control.Breaks
import util.control.Breaks._

object Ch2BreakContinue extends App{

  println("\n=== BREAK EXAMPLE ===")
  breakable {
    for (i <- 1 to 10) {
      println(i)
      if (i == 4) break // break out of the for loop
    }
  }
  println("\n=== CONTINUE EXAMPLE ===")

  for (i <- 1 to 10) {
    breakable {
      if (i == 4) break // break out of the for loop
      println(i)
    }
  }

  val EXIT = new Breaks

  for (i <- 1 to 5) {
    EXIT.breakable {
      if( i == 4 ) EXIT.break
      println(i)
    }
  }
}
