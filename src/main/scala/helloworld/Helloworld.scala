package helloworld
 
import scalanative.native._, stdlib._
 
object Main {
 
  def main(args: Array[String]): Unit = {
    fprintf(__stdoutp, c"Hello World: Scala Native!!!")
  }
}
