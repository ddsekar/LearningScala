package com.dhan.learnscala.ch1

import java.util.{Calendar, LinkedList}
import java.util.{List => UtilList}


object Imports {

  def main(args: Array[String]): Unit = {

    var cal:Calendar = Calendar.getInstance()
    var lst:UtilList[Int] = new LinkedList[Int]()
    var ci = new com.dhan.learnscala.ch1.p1.p2.c1
    ci.hi()

    class ClassWithValParameter(val name: String)
    val aClass = new ClassWithValParameter("Gandalf")
  }

}


package p1 {
  package p2 {
    class c1 {
      def hi(): Unit = {
        println("hi")
      }
    }
  }
}