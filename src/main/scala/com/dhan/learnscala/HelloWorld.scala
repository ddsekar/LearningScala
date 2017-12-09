package com.dhan.learnscala



object HelloWorld extends App {
  println("Hello, World!")
  val ages = Seq(12, 42, 53, 11, 16);
  println(s"The oldest person is ${ages.max}")

}
