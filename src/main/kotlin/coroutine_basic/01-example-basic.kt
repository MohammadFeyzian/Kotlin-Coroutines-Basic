package coroutine_basic

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main1() = runBlocking {

    launch {
        delay(1000)
        println("world!")
    }
    println("Hello")
}