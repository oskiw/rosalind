import scala.io.Source._

/**
  * http://rosalind.info/problems/ins/
  *
  * Created by oskiw on 24/01/2017.
  */
object INS extends App {

  def countSwaps(list: List[Int]): Int = list match {
    case Nil => 0;
    case head :: tail => tail.count(_ < head) + countSwaps(tail);
  }

  println(
    fromFile("datasets/rosalind_ins.txt")
      .getLines()
      .map(_.
        split(' ')
        .toList
        .map(_.toInt)
      ).toList match {
        case n :: a :: Nil => countSwaps(a)
        case _ => ""
      }
  )
}