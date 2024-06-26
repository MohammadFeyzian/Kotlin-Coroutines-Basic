package coroutine_basic

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main5() = runBlocking {
    val job = launch { // launch a new coroutine and keep a reference to its Job
        delay(1000)
        println("World!")
    }
    println("Hello")
    job.join() // wait until child coroutine completes
    println("Done")
}