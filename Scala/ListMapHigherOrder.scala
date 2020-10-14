object ListMapHigherOrder{
 def main(args :Array[String]){
  val intList: List[Int] = args.map(_.toInt).toList
  def isPerfectNumber(ipnumber: Int): String = {
        var sum: Int = 0
        for (i <- 1 to (ipnumber -1)){
                        val rem = ipnumber % i
                        if (rem == 0){sum = sum + i}
        }
        if (sum == ipnumber) {
            //println(“Entered Number is perfect number”)
            val res: String = "true"
            return res
        }
        else {
            val res: String = "false"
            return res
        }
  }
  def myHigherOrderFunction(argFn: Int => String, argVal: List[Int]): List[String] = {
          argVal.map(argFn)
  }       //complete the code
  println(myHigherOrderFunction(isPerfectNumber, intList))
  //println(intList)

  //println(intList.isInstanceOf[List[Int]])
 }
}