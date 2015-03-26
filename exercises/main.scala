package main;

import java.lang.String;

/****************************
*		@author MWindle		*
****************************/

object main { 
	def main(args: Array[String]){
		println("Hello world!!")
		println()
		println(subString())
	}
}

/*
* WIP: Trying to understand substrings 
* and the String class in Scala
*/
def subString(output: String) { 
	val notes = "ABCDEFG"
	val sub1 = notes.substring(2)
	val sub2 = notes.substring(0,2)
	output = sub1.concat(sub2)
}