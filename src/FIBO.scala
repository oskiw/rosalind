import scala.io.Source._

/**
  * http://rosalind.info/problems/fibo/
  *
  * Created by oskiw on 26/11/2016.
  */
object FIBO extends App {

  def fib(n: Int): Int = n match {
    case 1 => 1
    case 2 => 1
    case x => fib(n - 1) + fib(n - 2)
  }

  println(
    fib(
      fromFile("datasets/rosalind_fibo.txt")
        .mkString
        .toInt
    )
  )
}
