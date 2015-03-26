package myClass

/*
* sample class I found to understand importing
*/
class Complex(real: Double, imaginary: Double) { 
	def re() = real
	def im() = imaginary
}

/*
* Test class to practice importing
*/
class Person(newName: String, newAge: Integer) {
	var name = newName 
	var age = newAge
	
	def getOlder() {
		this.age += 1
	}
}