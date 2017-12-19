package com.dhan.learnscala.ch1

object Ch7OptionSome {

  def toInt(s:String) : Option[Int] = {
    try {
      Some(s.toInt)
    } catch {
      case e : NumberFormatException => None
    }
  }

  @throws(classOf[NumberFormatException])
  def toNumber(s:String) : Int = s.toInt

  def main(args: Array[String]): Unit = {

    try {
      println(toNumber("10a"))
    } catch {
      case exception : NumberFormatException => {
        println(exception)
      }
    }


    println(toInt("10").getOrElse(0))
    println(toInt("sa").getOrElse(0))

    val x = toInt("33").getOrElse(0);
    println(x)

    toInt("sssw") match {
      case Some(n) => println(n)
      case None => println("boon")
    }
  }
}
