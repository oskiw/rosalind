import scala.io.Source._

/**
  * http://rosalind.info/problems/dna
  *
  * Created by oskiw on 20/11/2016.
  */
object DNA extends App {

  val emptyMoleculesMap = "ACGT".toCharArray.map(_ -> 0).toMap

  val dnaMoleculesMap =
    fromFile("datasets/rosalind_dna.txt")
      .mkString
      .toCharArray
      .groupBy(identity)
      .mapValues(_.length)

  println(
    emptyMoleculesMap
      .map({
        case (k, v) =>
          k -> (v + dnaMoleculesMap.getOrElse(k, 0))
      })
      .values
      .mkString(" ")
  )
}
