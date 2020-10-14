abstract class Expression
case class Var(name: String) extends Expression
case class Number(num: Double) extends Expression
case class UnOp(operator: String, arg: Expression) extends Expression
case class BinOp(operator: String, left: Expression, right: Expression) extends Expression
object CaseClassMatching extends App {
   val op = BinOp("+", Number(1), Number(4))
    describe(op)
	def describe(obj1: Expression) {
		obj1 match {
			case Number(num) => println("It is a number")
			case Var(name) => println("It is a string expression")
			case UnOp(operator, arg) => println("It is a unary operation")
			case BinOp(operator, left, right) => println("It is a binary operation")
			case _ => println("Invalid Expression")
		}
	}
}