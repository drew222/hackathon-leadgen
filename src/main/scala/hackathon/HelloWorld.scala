package hackathon

import akka.actor.Props
import akka.actor.UntypedActor
import akka.actor.ActorRef

class HelloWorld extends UntypedActor {
  override def preStart {
    val greeter: ActorRef = getContext.actorOf(Props.create(classOf[Greeter]), "greeter")
    greeter.tell(Greeter.Msg.GREET, getSelf)
  }

  def onReceive(msg: Any) {
    msg match {
      case Greeter.Msg.DONE => getContext.stop(getSelf)
      case _ => unhandled(msg)
    }
  }
}