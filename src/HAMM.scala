import scala.io.Source._

/**
  * http://rosalind.info/problems/hamm/
  *
  * Created by oskiw on 26/11/2016.
  */
object HAMM extends App {

  val inputDna =
    fromFile("datasets/rosalind_hamm.txt")
      .getLines()
      .map(_.toList)
        .toList

  println(
    inputDna
      .head
      .zip(inputDna.tail.head)
      .foldLeft(0)((acc, x) =>
        if (!x._1.equals(x._2))
          acc + 1
        else
          acc
      )
  )
}
