package recfun



object balance {
	println("oi")                             //> oi
	
	def countChangeRec(sum: Int, money: Int, coins: List[Int], depth:Int):Int = {
	
		println(depth)
		if(coins.isEmpty || sum>money) 0
		else if(sum == money) 1
		else
			countChangeRec(sum + coins.head, money, coins, depth+1) + countChangeRec(sum, money, coins.tail, depth+1)
		
	}                                         //> countChangeRec: (sum: Int, money: Int, coins: List[Int], depth: Int)Int
	
	countChangeRec(0, 5, List(2,1,3), 0)      //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 3
                                                  //| 4
                                                  //| 4
                                                  //| 5
                                                  //| 5
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 5
                                                  //| 6
                                                  //| 6
                                                  //| 4
                                                  //| 5
                                                  //| 5
                                                  //| 3
                                                  //| 4
                                                  //| 4
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 6
                                                  //| 7
                                                  //| 7
                                                  //| 5
                                                  //| 6
                                                  //| 6
                                                  //| 4
                                                  //| 5
                                                  //| 5
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 5
                                                  //| 4
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 4
                                                  //| 3
                                                  //| res0: Int = 5
}