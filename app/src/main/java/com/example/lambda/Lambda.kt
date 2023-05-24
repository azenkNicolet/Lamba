package com.example.lambda

fun main()
{
    lambdas()
}

fun lambdas()
{
    //Add two numbers using lambda function
    val sum: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
    println(sum(10,5))

    //Shorter, more concise lambda
    val shorterSum = {a:Int, b:Int -> println(a + b)}
    shorterSum(10, 5)
}