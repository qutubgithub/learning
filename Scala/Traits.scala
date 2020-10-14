trait ArithmeticOperations { //complete the code
	var x: Int
	var y: Int
	def add
	def subtract
	def multiply
	def divide
}
class Variables(var x: Int, var y: Int) extends ArithmeticOperations { //complete the code
	def add(): Int = {
		return x + y
	}
	def subtract(): Int = {
		return x - y
	}
	def multiply(): Int = {
		return x * y
	}
	def divide(): Int = {
		return x / y
	}
}
object TraitExample extends App{
 val input1 = args(0).toInt
 val input2 = args(1).toInt
 var variable = new Variables(input1, input2)
 println(variable.add())
 println(variable.subtract())
 println(variable.multiply())
 println(variable.divide())
}