package org.parte_12

fun companionObjetct() {
    BigBen.getBongs(12)
}

class BigBen {
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            repeat(nTimes) { print("BONG ") }
        }
    }
}