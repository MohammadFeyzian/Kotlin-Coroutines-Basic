package coroutine_basic

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main3() = runBlocking {
    doWorld3()
}

suspend fun doWorld3() = coroutineScope {
    launch {
        delay(1000)
        println("World!")
    }
    println("Hello")
}