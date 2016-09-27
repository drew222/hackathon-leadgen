package hackathon

import akka.actor.UntypedActor

object Greeter {

  object Msg extends Enumeration {
    type Msg = Value
    val GREET, DONE = Value
  }

}

class Greeter extends UntypedActor {
  def onReceive(msg: Any) {
    msg match {
      case Greeter.Msg.GREET =>
        System.out.println("Hello World!")
        getSender.tell(Greeter.Msg.DONE, getSelf)
      case _ => unhandled(msg)
    }
  }
}