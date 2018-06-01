
fun main(args : Array<String>){
    val endLimit = 4000000
    var start=1
    var start2=2
    var curFib =0
    var sum=0
    while(curFib<endLimit){
        curFib = start + start2
        start =start2
        start2 = curFib
        if(curFib %2==0){
            sum+=curFib
        }

    }
    println("$sum")
}