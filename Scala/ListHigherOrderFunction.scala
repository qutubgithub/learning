object ListHigherOrderFunction{
 def main(args :Array[String]){
  val input = args(0).toInt
  val intList :List[Int] = List.range(1,input+1)
  def factorial(n: Int): Int = {  
      if (n <= 1)
         1  
      else    
      n * factorial(n - 1)
  }
  def myHigherOrderFunction(argFn: Int => Int, argVal: List[Int]): Any = {
	  argVal.map(argFn).foreach(println)
  }	  //complete the code
  myHigherOrderFunction(factorial, intList)
 }
}