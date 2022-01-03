package com.inflearn.advancedgrammar

/* 1. Lambda
  1) value 처럼 다룰 수 있는 익명 함수
  2) 메소드의 파라미터로 넘겨줄 수 있다 -> ex) fun maxBy(a: Int)
  3) return 값으로 사용할 수 있다 */

/* Lambda 기본 정의
 val lambdaName: Type = { argumentList -> codeBody } */

// val square: (Int) -> (Int) = { number -> number * number }
val square = { number: Int -> number * number }
val nameAge = { name: String, age: Int ->
    "My name is ${name}, I'm ${age}"
}

fun main() {

    println(square(12))
    println(nameAge("jungi", 26))

    val a = "jungi said, "
    println(a.pizzaIsGreat())

    val b = "Android said, "
    println(b.pizzaIsGreat())

    println(extendString("jungi", 26))

    println(calculateGrade(95))
    println(calculateGrade(1000))

    val lambda = { number: Double ->
        number == 4.3213
    }
    println(invokeLambda(lambda))

//    println(invokeLambda({ it > 3.22 }))
    println(invokeLambda { it > 3.22 })

}

// Extension Functions

val pizzaIsGreat: String.() -> String = {
    this + "Pizza is great"
}

fun extendString(name: String, age: Int): String {
    val introduceMyself: String.(Int) -> String = { "I am ${this} and ${it} years old" }
    return name.introduceMyself(age)
}

// Lambda Return

val calculateGrade: (Int) -> String = {
    when (it) {
        in 0..10 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "error"
    }
}

// Lambda 표현 방법

fun invokeLambda(lambda: (Double) -> Boolean): Boolean {
    return lambda(5.2343)
}