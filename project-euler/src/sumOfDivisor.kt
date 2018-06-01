
fun main(args :Array<String>){
   var sum =0;
    var startNum=3
    val endNum = 1000
    while(startNum<endNum){
        if(startNum%3==0){
            sum+=startNum
        }
        else if(startNum % 5 ==0){
            sum+=startNum
        }
        startNum++
    }
    println("$sum")
}