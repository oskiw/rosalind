import scala.io.Source._

/**
  * http://rosalind.info/problems/med/
  *
  * Created by oskiw on 24/01/2017.
  */
object MED extends App {

  println(
    fromFile("datasets/rosalind_med.txt")
      .getLines()
      .map(_.
        split(' ')
        .toSeq
        .map(_.toInt)
      ).toList match {
        case n :: a :: k :: Nil => a.sorted.apply(k.head - 1);
        case _ => ""
      }
  )
}