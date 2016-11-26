import scala.io.Source._

/**
  * http://rosalind.info/problems/fib/
  *
  * Created by oskiw on 26/11/2016.
  */
object FIB extends App {

  def fib(monthsLeft: Int, reproductionMultiplier: Int): (Long, Long) = monthsLeft match {
    case 1 => (1, 0)
    case x =>
      val previous = fib(monthsLeft - 1, reproductionMultiplier)
      (reproductionMultiplier * previous._2, previous._1 + previous._2)
  }

  val Array(n, k) =
    fromFile("datasets/rosalind_fib.txt")
      .mkString
      .split(" ")
      .map(_.toInt)

  println(fib(n, k) match {
    case (newborn, adult) => newborn + adult
  })
}
