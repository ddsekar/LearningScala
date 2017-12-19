package com.dhan.learnscala.ch1

import scala.util.matching.Regex

object Ch5Regex extends App {

  var r1 = "[0-9]+".r

  println(r1.findAllIn("101 test strin 404").foreach( println ))

  val pattern = "([0-9]+) ([A-Za-z]+)".r

  val pattern(count, fruit) = "101 Banana";

  println(count)

  println(fruit)

  var reg = new Regex("[0-9]+")
}
