var n:Int=scala.io.StdIn.readLine("Enter the Number of Nodes: ").toInt
var m=new Array[Array[Int]](n)

for (i <- 1 to n){
  var p=new Array[Int](n)
  m(i-1)=p
}

def Inputme(){
  println("Enter i and J value")
  var ii:Int=scala.io.StdIn.readLine("Enter the i value: ").toInt
  var jj:Int=scala.io.StdIn.readLine("Enter the j value: ").toInt
  var valu:Int=scala.io.StdIn.readLine("Enter the edge Value: ").toInt

  m(ii)(jj)=valu
}

def looper(){
  Inputme()
  var rep:String=scala.io.StdIn.readLine("Do you want to Input anothor Value? (YES/NO) ")
  if (rep.toUpperCase=="YES"){
    looper()
  }
  else{
    for (a <- m){
      for (b <- a){
        print(b)
      }
      println()
    }
    println("Exit!")
  }
}


looper()
