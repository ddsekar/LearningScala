package com.dhan.learnscala.ch1

package Pack {
  class Lesson6 {
    class Inner {
      private def f() {}
      protected def f1() {}
      def f2() {}
      f()
      f1()
      f2()
      class InnerMost {
        f()
        f1()
        f2()
      }
    }

    class ExtendedInner extends Inner {
      f1()
      f2()
    }

    class Outer {
//      (new Inner)f() // Error
//      (new Inner).f1()
      (new Inner).f2()
    }
//    (new Inner)f() // Error
//    (new Inner).f1()
  }

  package p2 {
    class Executive {
      private[Pack] var workDetails = null
      private[p2] var friends = null
      private[this] var secrets = null

      def help(another : Executive) {
        println(another.workDetails)
        println(another.friends)
//        println(another.secrets) //ERROR
//        TODO: secrets can be accessible only in Implicit object
      }
    }
  }

}


