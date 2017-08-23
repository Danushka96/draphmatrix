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
  var rep:String=scala.io.StdIn.readLine("Do you want to Input anothor Value? (Y/N) ")
  if (rep.toUpperCase=="Y"){
    looper()
  }
  else{
    menu()
  }
}

def indegree(){
	var node:String=scala.io.StdIn.readLine("Enter the Vertex you want to find: ")
	var indexe:Int=q.indexOf(node)
	var count:Int=0
	var indeg:Int=0
	for (i <- m){
		for (j <- i){
			if ((count==indexe)&&(j!=0)){
				indeg+=1
			}
		count+=1
		}
		count=0
	}
	println("The number of Indegrees for this Node is "+indeg)
	menu()
}

def outdegree(){
	var node:String=scala.io.StdIn.readLine("Enter the Vertex you want to find: ")
	var indexe:Int=q.indexOf(node)
	var outdeg:Int=0
	var arr=m(indexe)
	for (i <- arr){
		if (i!=0){
			outdeg+=1
		}
	}
	println("The number of Outdegrees for this Node is "+outdeg)
	menu()
}

def isreachable(){
	var ii=scala.io.StdIn.readLine("Vertex From: ")
	var jj=scala.io.StdIn.readLine("Vertex to: ")
	var i=q.indexOf(ii)
	var j=q.indexOf(jj)

	var hit=m(i)(j)
	if (hit!=0){
		println("Reachable")
	}else{
		println("Unreachable to this vertex")
	}
	menu()
}

def addvertex()=0

def addedge()=0

def printme(){
	for (a <- m){
      for (b <- a){
        print(b)
      }
      println()
    }
    menu()
}

def interface(){

println("///////////////////////////////////////////////////////////////////////////////////////////////////////////")

println("#    ______                                __               ______                                			")         
println("#   /      |                              |  |             /      |                                        ")
println("#  |  $$$$$$|  ______   ______    ______  | $$____        |  $$$$$$|  ______    ______   ______   __    __ ")
println("#  | $$ __|$$ /      | |      |  /      | | $$    |       | $$__| $$ /      |  /      | |      | |  |  |  |")
println("#  | $$|    ||  $$$$$$| |$$$$$$||  $$$$$$|| $$$$$$$|      | $$    $$|  $$$$$$||  $$$$$$| |$$$$$$|| $$  | $$")
println("#  | $$ |$$$$| $$   |$$/      $$| $$  | $$| $$  | $$      | $$$$$$$$| $$   |$$| $$   |$$/      $$| $$  | $$")
println("#  | $$__| $$| $$     |  $$$$$$$| $$__/ $$| $$  | $$      | $$  | $$| $$      | $$     |  $$$$$$$| $$__/ $$")
println("#   |$$    $$| $$      | $$   $$| $$    $$| $$  | $$      | $$  | $$| $$      | $$      | $$   $$| $$    $$")
println("#    |$$$$$$  |$$       |$$$$$$$| $$$$$$$  |$$   |$$       |$$   |$$ |$$       |$$       |$$$$$$$ |$$$$$$$")
println("#                               | $$                                                             |  |__| $$")
println("#                               | $$                                                              |$$    $$")
println("#                               | $$                                                                |$$$$$$")

println("///////////////////////////////////////////////////////////////////////////////////////////////////////UCSC/")
println()

}

def menu(){
	println()
	println("Select the Command Number from the list and Enter it in the input area")
	println()
	println("///////////////////////////////////////////////////////////////////////////////////////////////////////////")
	println("1. Enter Data \t\t\t 2. Add new vertex \t 3. Add new Edge \t 4. Number of Indegrees")
	println("5. Number of Outdegrees \t 6. Check Reachability \t 7. Print matrix \t 8. Exit ")
	println("///////////////////////////////////////////////////////////////////////////////////////////////////////////")
	println()
	var ans:Int=scala.io.StdIn.readLine("Enter Command Number: ").toInt
	if (ans==1){
		looper()
	}else if(ans==2){
		addvertex()
	}else if(ans==3){
		Inputme()
	}else if(ans==4){
		indegree()
	}else if(ans==5){
		outdegree()
	}else if(ans==6){
		isreachable()
	}else if(ans==7){
		printme()
	}else if(ans==8){
		println("Bye!")
	}else{
		println("Invalied Input! Try Again")
		menu()
	}
}
interface()

var n:Int=scala.io.StdIn.readLine("Enter the Number of Nodes: ").toInt
var m=new Array[Array[Int]](n)
var q=new Array[String](n)

for (i <- 1 to n){
  var v=scala.io.StdIn.readLine("Enter Vertex: ")
  q(i-1)=v
  var p=new Array[Int](n)
  m(i-1)=p
}

menu()