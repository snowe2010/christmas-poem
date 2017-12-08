package com.promontech.christmas

import com.promontech.christmas.DreidelMaterial.CLAY
import com.promontech.christmas.DreidelMaterial.WOOD
import com.promontech.christmas.DreidelMaterial.GLASS
import com.promontech.christmas.DreidelMaterial.GOLD

fun say(v: String) {}
fun make(v: String): Dreidel = Dreidel()
infix fun Dreidel.outOf(x: DreidelMaterial) = apply { ready = x }
fun play(v: String? = null) {}
fun Unit.exists(): Boolean = true

fun dreidel() {
    if (dreidel().exists()) {
        repeat(4) {
            repeat(3, { say("dreidel") })
            listOf(CLAY, WOOD, GLASS, GOLD).forEach { material ->
                val dreidel = make("dreidel") outOf material
                when (dreidel.ready) {
                    CLAY, WOOD -> play()
                    GLASS -> play("on grass")
                    GOLD -> play("in cold")
                }
            }
        }
    }
}

enum class DreidelMaterial {
    CLAY, WOOD, GLASS, GOLD
}

class Dreidel(var ready: DreidelMaterial? = null)
