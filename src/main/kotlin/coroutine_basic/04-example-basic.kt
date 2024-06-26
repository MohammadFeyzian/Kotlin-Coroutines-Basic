package coroutine_basic

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// Sequentially executes doWorld followed by "Done"
fun main() = runBlocking {
    doWorld4()
    println("Done")
}

// Concurrently executes both sections
suspend fun doWorld4() = coroutineScope {

    launch {
        delay(2000)
        println("World 2")
    }

    launch {
        delay(1000)
        println("World 1")
    }

    println("Hello")
}