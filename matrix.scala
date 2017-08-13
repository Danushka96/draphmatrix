var n:Int=scala.io.StdIn.readLine("Enter the Number of Nodes: ").toInt
var m=new Array[Array[Int]](n)
var q=new Array[String](n)

for (i <- 1 to n){
  var v=scala.io.StdIn.readLine("Enter Vertex: ")
  q(i-1)=v
  var p=new Array[Int](n)
  m(i-1)=p
}

def Inputme(){
  println()
  println("Enter Vertex in order to the connection")
  var vi:String=scala.io.StdIn.readLine("Enter the (vi) vertex: ")
  var vj:String=scala.io.StdIn.readLine("Enter the (vj) vertex: ")
  var valu:Int=scala.io.StdIn.readLine("Enter the edge Value: ").toInt

  var ii=q.indexOf(vi)
  var jj=q.indexOf(vj)

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
