fun main(args: Array<String>) {
    println("hello world")
    println(sum1(10,4))
    println(sum2(10,5))
    println(maxOf(20,50))
    println(stringSum("hi","juntaek"))
    println(stringSum1("hi","juny"))
    println(whileLoopSum(5))
    println(describe(50))
    ramdaTest()
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
fun getStringLength(obj : Any) : Int?{ // Any는 Object와 같이 최상위 클래스 느낌임.
    if(obj is String){ // obj가 String 객체라면 자동 타입 변환을 함.
                        // 타입 캐스팅 할 때 발생할 수 있엇던 오류를 줄일 수 있음.
        return obj.length
    }
    return null
}

fun whileLoopSum(a:Int):Int{ // while loop : java와 동일.
    var i :Int = 1
    var sum : Int = 0
    while(i <= a){
        sum += i++
    }
    return sum
}

//when expression : java의 switch 같은 것인데,
//다양한 타입을 받을 수 잇음.
fun describe(obj : Any):String =
    when(obj){
        1 -> "one"
        "hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "Unknown"
    }

//range를 이용한 for loop 가능, if 문도 가능....
fun range(a : Int, b : Int) : Unit{
    var x : Int
    for(x in a..b){
        println(x)
    }
    if(a in 1..5){//a가 1~5사이에 있는지.
        println("a is in from 1 to 5")
    }
}

fun collections(){// collection활용 가능.
// arraylist, linkedList, Hashset,treeset, hashmap,treemap 등등
    val items1 = listOf("apple","banana","kiwi")
    for(item in items1){
        println(item)
    }
    val items2 = setOf("apple","banana","kiwi")
    when{
        "apple" in items2 -> "apple is exist"
        "orange" in items2 -> "apple is exist"
    }

}

fun ramdaTest(){
    val fruits = listOf("banana","avocado","apple","kiwi")
    fruits.filter{it.startsWith("a")}.sortedBy { it }.map { it.toUpperCase() }.forEach{println(it)}
}

// + 람다식을 이용해 filter, map 등의 연산이 가능하다.