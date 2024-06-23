package coroutine_basic

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main2() = runBlocking {
    launch {
        doWorld2()
    }
    println("Hello")
}

suspend fun doWorld2() {
    delay(1000)
    println("World!")
}