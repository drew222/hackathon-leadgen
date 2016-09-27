package hackathon

object Main {
  def main(args: Array[String]) {
    akka.Main.main(Array[String](classOf[HelloWorld].getName))
  }
}