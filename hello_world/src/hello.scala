

/**
 * @author Mr_Moshi
 */
import java.util.{Date, Locale};
import java.text.DateFormat;
import java.text.DateFormat._;

object main {
  def main(args: Array[String]){
    frenchDate
    addition
    //timerAnonymous
    val fred = new Complex(1.5, 2.3);
    println(fred.im())
  }
}

object frenchDate { 
  val now = new Date
  val df = getDateInstance(LONG, Locale.FRANCE)
  println(df format now)
}

object addition { 
  val total = 1.+(2)
  println(total)
}

/**TIMER TUTORIAL**/

object timer {
  def oncePerSecond (callback: () => Unit) {
    while(true) { callback(); Thread sleep 1000}
  }
  
  def timeFlies() {
    println("time flies like an arrow . . . ");
  }
  
  oncePerSecond(timeFlies)
}

object timerAnonymous {
  def oncePerSecond (callback: () => Unit) { 
    while(true) { callback(); Thread sleep 1000}
  }
  
  oncePerSecond(() => println("time flies like an arrow ~> . . "))
}

class Complex(real: Double, imaginary: Double) { 
  def re() = real
  def im() = imaginary
}