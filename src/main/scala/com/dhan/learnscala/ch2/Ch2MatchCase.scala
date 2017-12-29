package com.dhan.learnscala.ch2

import scala.annotation.switch

object Ch2MatchCase {

  def main(args: Array[String]): Unit = {
    val i = 6
    val month = i match {
      case 1 => "Jan"
      case 2 => "Feb"
      case 3 => "Mar"
      case 4 => {
        "Apr"
      }
      case 5 => "May"
      case _ => "Invalid"
    }

    println(month)
  }


}
