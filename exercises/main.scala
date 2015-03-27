package main;

import java.lang.String;

/****************************
*		@author MWindle		*
****************************/

object main { 
	def main(args: Array[String]){
		println("Hello world!!")
		println()
		val input = "ABCDEFG"
		println(substring.subString(input))
		println(add(2, 2))
	}

	def add(int1: Int, int2: Int) : Int = int1 + int2
}

/*
* WIP: Trying to understand substrings 
* and the String class in Scala
*/ 
object substring{
	def subString(output: String) : String = { 
		val sub1 = output.substring(2)
		val sub2 = output.substring(0,2)
		sub1.concat(sub2)
	}
} 