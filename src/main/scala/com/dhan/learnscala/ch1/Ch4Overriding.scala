package com.dhan.learnscala.ch1

class Point(val x:Int, val y:Int) {

  var x1: Int = x
  var y1: Int = y

  def move(a:Int, b:Int) : Unit = {
    x1+=a
    y1+=b
  }

  def print() : Unit = {
    println("x="+x1+";y="+y1)
  }
}

class Position(override val x:Int, override val y:Int, val z:Int) extends Point(x, y) {
  var z1:Int = z

  def move(a:Int, b:Int, c:Int): Unit = {
    x1+=a
    y1+=b
    z1+=c
  }

  override def print() : Unit = {
    println("x="+x1+";y="+y1+";z="+z1)
  }
}

object Lesson3 {

  def main(args: Array[String]): Unit = {

    var p1 : Point = new Point(2,3)
    p1.move(4,4)
    p1.print()

    var l1 : Position = new Position(2,3,4)
    l1.print()
    l1.move(4,4,4)
    l1.print()
  }

}
