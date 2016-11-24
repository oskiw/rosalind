import scala.io.Source._

/**
  * http://rosalind.info/problems/rna/
  *
  * Created by oskiw on 24/11/2016.
  */
object RNA extends App {
  println(
    fromFile("datasets/rosalind_rna.txt")
      .mkString
      .replace("T", "U")
  )
}
