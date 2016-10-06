package coroutines

import kotlinx.coroutines.generate

fun main(args: Array<String>) {
    val sequence = generate<Int> {
        for (i in 1..5) {
            yield(i)
        }
    }
    println(sequence.joinToString(" "))
}

