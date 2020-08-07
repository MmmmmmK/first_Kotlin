fun initialize(countOfExp : Int = 0) : String{
    print("Введите количество выражений, которые собираетесь передать компилятору: ")
    var exp = readLine()!!
    while(exp.toInt() >= 100){
        print("WTF? Do it again! (Try one more: [0,100]) ")
        exp = readLine().toString()
    }
    return exp
}

fun initialize(countOfSymb : Double = 0.0) : String{
    print("Введите количество выражений, которые собираетесь передать компилятору: ")
    var symb = readLine()!!
    while (symb.toInt() >= 400){
        print("WTF? Do it again! (Required amount of symbols: [0,400]) ")
        symb = readLine().toString()
    }
    return symb
}

fun main(){

    val amOfExpr = initialize(countOfExp = 0).toInt()
    if (amOfExpr > 0) {
        val length : Int
    }
}
