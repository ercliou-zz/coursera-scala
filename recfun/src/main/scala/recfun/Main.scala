package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = if (c==r || c == 0) 1 else pascal(c -1, r -1) + pascal(c, r-1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    
    def removeUselessChars(chars: List[Char]) : List[Char] = {
      if(!chars.isEmpty) {
  			  if(chars.head != '(' && chars.head != ')') removeUselessChars(chars.tail)
  			  else chars
      } else chars
    }
    
    def recursiveBalance(chars: List[Char], depth: Int):Boolean = {
      if(chars.isEmpty && depth!=0 || chars.head == ')' && depth == 0) false
      else {
         if(removeUselessChars(chars).head == '(') recursiveBalance(chars.tail, depth+1)
         else true
      }
    }
    
    recursiveBalance(chars, 0)
    
  }
    

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    
    def countChangeRec(sum: Int, money: Int, coins: List[Int]):Int = {

      if(coins.isEmpty || sum>money) 0
      else if(sum == money) 1
      else
        countChangeRec(sum + coins.head, money, coins) + countChangeRec(sum, money, coins.tail)
      
    }
    
    countChangeRec(0, money, coins)
    
  }
}
