package Aula01

fun main(){
    var exc1 = SubTwoInts(1, 2)
    var opp = OperateTwoInts()
    var a = 3; var b = 9

    println(exc1.getSub())
    println(opp.subTwoInts(a, b))
    println(opp.divideTwoInts(a.toFloat(), b.toFloat()))
    println(opp.multiplyTwoInts(a, b))
    println(opp.sumTwoInts(a, b))
}