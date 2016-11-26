import scala.io.Source._

/**
  * http://rosalind.info/problems/gc/
  *
  * Created by oskiw on 26/11/2016.
  */
object GC extends App {
  println(
    fromFile("datasets/rosalind_gc.txt")
      .mkString
      .split(">")
      .drop(1)
      .map(_.split("\\r?\\n"))
      .map(dna => (dna.head, dna.tail.mkString))
      .map {
        case (label, dna) =>
          (label,
            (dna.count(x => "GC".contains(x)).toDouble / dna.length) * 100
          )
      }
      .foldLeft(("noLabel", -0.1))((acc, x) =>
        if (x._2 > acc._2)
          x
        else
          acc
      )
      .productIterator
      .mkString("\n")
  )
}
