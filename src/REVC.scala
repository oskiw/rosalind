import scala.io.Source._

/**
  * http://rosalind.info/problems/revc/
  *
  * Created by oskiw on 24/11/2016.
  */
object REVC extends App {
  println(
    fromFile("datasets/rosalind_revc.txt")
      .mkString
      .reverse
      .toCharArray
      .map {
        case 'A' => 'T'
        case 'T' => 'A'
        case 'C' => 'G'
        case 'G' => 'C'
        case x => x
      }
      .mkString
  )
}
