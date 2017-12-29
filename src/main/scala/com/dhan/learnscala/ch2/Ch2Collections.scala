package com.dhan.learnscala.ch2

object Ch2Collections extends App {

  var map1 = Map("a" -> "apple", "b" -> "banana", "c" -> "cake", "d" -> "donut")
  for((k,v) <- map1) {
    println(s"key=$k value=$v")
  }

  var lst = List(1,2,3,4,5)

  for (i <- lst) println(i)

  lst.foreach(i => println(i))

  lst.foreach(println)

  val fruits = "apple"::"banana"::"orange"::Nil
  for(f<-fruits) println(f)
}
