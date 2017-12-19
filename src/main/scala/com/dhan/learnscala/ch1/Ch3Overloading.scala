package com.dhan.learnscala.ch1

class Foo(val x: Int, val y: Int, val z: Int) {

  def this(x: Int) {
    this(x,0,0)
  }

  def this(x: Int, y: Int) {
    this(x,y,0)
  }

  def print(): Unit = {
    println("x="+x+";y="+y+";z="+z)
  }

  def sum(): Unit = {
    println("sum="+(x+y+z))
  }
}


object Lesson4 extends App {
  def printit() {
    println("Hi")
  }

  def printit(str: String) {
    println("Hi"+str)
  }

  def argPrint(s1: String = "def1", s2: String = "def2"): Unit = {
    println("arg1:"+s1+";arg2:"+s2)
  }

  printit()
  printit("Jon")
  printit(str="Dav")

  argPrint()
  argPrint("a1","a2")
  argPrint(s2="b1",s1="b2")

  val f1 = new Foo(1,2,3)
  f1.print()
  f1.sum()

  val f2 = new Foo(1,2)
  f2.print()
  f2.sum()

  val f3 = new Foo(1)
  f3.print()
  f3.sum()

}