class Rectangle(var length: Int, var breadth: Int){
	def area(): Int = {
		return length * breadth
	}
	def perimeter: Int = {
		return 2 * (length + breadth)
	}
}
object RectangleDemo extends App{
 val input1 :Int = args(0).toInt
 val input2 :Int = args(1).toInt
 var obj = new Rectangle(input1, input2)
 print(obj.area())
 print(obj.perimeter())
 //write your code here
}