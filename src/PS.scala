import scala.io.Source._

/**
  * http://rosalind.info/problems/ps/
  *
  * Created by oskiw on 24/01/2017.
  */
object PS extends App {

  println(
    fromFile("datasets/rosalind_ps.txt")
      .getLines()
      .map(_.
        split(' ')
        .toList
        .map(_.toInt)
      ).toList match {
        case n :: a :: k :: Nil => a.sorted.take(k.head).mkString(" ");
        case _ => ""
      }
  )
}