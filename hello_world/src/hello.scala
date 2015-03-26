/**
 * @author Mr_Moshi
 */

package hello
 
import java.util.{Date, Locale};
import java.text.DateFormat;
import java.text.DateFormat._;
import myClass.Complex;
import myClass.Person;

object main {
  def main(args: Array[String]){
    frenchDate
    addition
    //val fred = new Complex(1.5, 2.3)
    //println(fred.im())
    
	val bob = new Person("Bob", 25);
	println(bob.age)
	bob.getOlder();
	println(bob.age)
	
	timerAnonymous
  }
}

/*
* Printing the date with French Date format
*/
object frenchDate { 
  val now = new Date
  val df = getDateInstance(LONG, Locale.FRANCE)
  println(df format now)
}

/*
* Adding 2 integers together
*/ 
object addition { 
  val total = 1.+(2)
  println(total)
}

/**TIMER TUTORIAL, Not my work**/

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