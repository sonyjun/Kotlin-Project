fun main(args: Array<String>) {
    println("hello world")
    println(sum1(10,4))
    println(sum2(10,5))
    println(maxOf(20,50))
    println(stringSum("hi","juntaek"))
    println(stringSum1("hi","juny"))
}
fun sum1(a : Int, b: Int):Int{
    return a+b
}
fun sum2(a:Int,b:Int) = a+b

fun maxOf(a:Int,b:Int) = if(a>b) a else b

fun stringSum(a : String , b: String) : String{
    var temp = "first argument is '$a'"
    var change = "${temp.replace("first","second")} '$b'"
    return "$temp $change"
}
fun stringSum1(a : String,b: String) = "$a $b"

fun parseInt(str:String):Int?{ // ?는 null이라는 값이 나올 수도 있다는 것을 명시
                                // ?를 안쓰고 null이라는 값이 나오면 컴파일 에러.
                                // return값을 받는 측은 반드시 null 체크를 하고 사용해야됨.
    return Integer.parseInt(str)
}

fun testFunc(a : String, b: String):Int{
    var x : Int? = parseInt(a) // null체크 반드시 필요.
    var y : Int? = parseInt(b) // null체크 반드시 필요.

    if(x != null && y != null)
        return x+y
    else{
        println("there is null")
        return 0;
    }
}
//
fun getStringLength(obj : Any) : Int?{
    if(obj is String){
        return obj.length
    }
    return null
}