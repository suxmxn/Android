package com.example.androidlab

val square : (Int) -> (Int) = {number -> number*number}

val nameAge = {name : String, age : Int ->
    "my name is ${name} I'm ${age}"
}

fun main(){
    println(square(12))
    println(nameAge("sumin", 23))

    val a = "joyce said"
    val b = "mac said"

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("sumin", 23))

    println(calculateGrade(971))


    val lamda = {number : Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))
    println(invokeLamda({it > 3.22}))

    println(invokeLamda { it > 3.22 })  //마지막 파라미터가 람다식일때 쓸 수 있음


}

//확장함수

val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name : String, age : Int) : String {
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

//람다의 Return

val calculateGrade : (Int) -> String = {
    when(it){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

//람다를 표현하는 여러가지 방법

fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}

