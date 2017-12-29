package com.dhan.learnscala.ch2

object Ch2RangeLoop {

  def main(arg: Array[String]): Unit = {
    println("----args <- 1 to 5------")
    for (args <- 1 to 5) {
      println(args)
    }
    println("----args <- 1 to 5------")
    for (args <- 1 to 5 by 2) {
      println(args)
    }

    println("i <- 1 to 5 if i % 2 ==0")
    for(i <- 1 to 5 if i % 2 ==0) println (i)

    for{
      i <- 1 to 5
      if i % 2 == 0
    } println(i)

    1.to(5).filter(i => i%2==0).foreach(println(_))

    println("----args <- 1 to 4------")
    for (args <- 1 until 5) {
      println(args)
    }
    println("-----arg1 <- 1 to 3; arg2 <- 1 to 3-----")
    for (arg1 <- 1 to 3; arg2 <- 1 to 3) {
      println(arg1+"--"+arg2)
    }
    println("----args <-  list1------")
    val list1 = List(1,2,3,4,5,6,7,8,9,10)
    for (args <-  list1) {
      println(args)
    }
    println("----args <-  list1 if(args!=3 && args < 5)------")
    for (args <-  list1 if(args!=3 && args < 5)) {
      println(args)
    }

    println ("---------------for (a <-  list1 if(a!=3 && a < 5)) yield -----------------")
    val l = for (a <-  list1 if(a!=3 && a < 5)) yield a
    for (args <- l) {
      println(args)
    }
  }

}
