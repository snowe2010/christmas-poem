package com.pany.holidays

import com.pany.holidays.Enums.*

class Weather(val frightful: Boolean = true)
class Fire(val delightful: Boolean = true, var hp: Int = 100, var buffs: List<Enums> = listOf(BLEEDING))
class Lights(val level: Enums = LOW)
class People(var hateStorm: Boolean = true, var warmth: Enums = LOW) {
    fun holdTight(p: People) = true
}

enum class Enums { CORN, LOW, HIGH, BLEEDING, KISS }

class LetItSnow {
    val weather = Weather()
    val fire = Fire()
    val places = listOf(fire)
    val signsOfStopping = false
    val lights = Lights()
    val event = KISS
    val i = People()
    val you = People()

    fun letItSnow() {
        if (weather.frightful
                && fire.delightful
                && places.isEmpty()) {
            repeat(3) {
                println("Let it snow!")
            }
        }

        if (!signsOfStopping
                && forPopping(CORN)
                && lights.level == LOW) {
            repeat(3) {
                println("Let it snow!")
            }
        }

        // refrain
        repeat(2) {
            when (event) {
                KISS -> {
                    i.hateStorm = true
                    if (you.holdTight(i)) {
                        i.warmth = HIGH
                    }
                    fire.hp = 5
                    fire.buffs = listOf(BLEEDING)
                    do {
                        goodbyeing()
                    } while (true)
                    if (loveMeSo(you)) {
                        repeat(3) {
                            println("Let it snow!")
                        }
                    }
                }
            }
        }
    }

    fun forPopping(enums: Enums) = true
    fun goodbyeing() = true
    fun loveMeSo(p: People) = true
}

fun main(args: Array<String>) {

}
