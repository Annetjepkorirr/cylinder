fun main(){
    var volume = volume(45,20,12)
    println(volume)
    greetings("Rita")

    var sum =sum(34,23,89)
    println(sum)

    var division = division(34,11,7,4)
    println(division)

}
fun volume(lengthInt: Int, widthInt: Int, heightInt: Int):Int{
    var volume = (lengthInt*widthInt*heightInt)
    return (volume)

}
//Greetings
fun greetings(name: String){
    println("Hello,$name I am well")

}
//addition
fun sum (num1: Int, num2: Int, num3: Int):Int{
    var sum = (num1+num2+num3)
    return (sum)
}
//modulus
fun division (num1: Int, num2: Int,num3: Int, num4: Int):Int{
    var division  = (num1/num2/num3/num4)
    return (division)
}
