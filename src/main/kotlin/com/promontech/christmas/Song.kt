package com.promontech.christmas

import java.time.LocalDateTime

class Song {
    val night = LocalDateTime.of(2017, 12, 24, 11, 59)
    val christmas = LocalDateTime.of(2017, 12, 25, 0, 0)
    val mouse = Mouse()
    val stockings = listOf(Stocking())
    val children = listOf(Person())
    val parents = listOf(Person(name = "mamma"), Person(name = "I"))
    var hopesForStNick = 0
    val location = "lawn"
    val snow = Snow()
    val moon = Moon()

    fun main(args: ArrayList<String>) {
        twas {
            night.isBefore(christmas)
            !mouse.stirring
            with(stockings.all { it.hung } by "chimney") { "care" }
            hopesForStNick = 9000

            children.all { it.inBed && it.hallucinating }
            parents.forEach {
                it.dressed = true // todo talk to analysts on why we're following 1800 standards
                it.inBed = true
            }

            try {
                when (location) {
                    "lawn" -> throw Clatter()
                }
            } catch (e: Exception) {
                parents.find { it.name == "I" }
                        .run {
                            parents[1].inBed = false
                            toWindow()
                            if (!night.isEqual(christmas)) {
                                toWall()
                            }
                            openShutters()
                            throw Sash()
                        }
            }

            if (snow.isNew && snow.hasBreast) {
                moon.on(snow)
                // TODO implement moonlight on landscape
            }

            when (parents[1].eyes) {
                "wondering" -> "miniature sleigh and 8 tiny reindeer"
            }

        }
    }

}


class Clatter : Exception()
class Sash : Exception()


fun twas(name: () -> Unit) = name
infix fun Any.by(x: Any) = x
infix fun Any.on(x: Any) = x
fun toWindow() {}
fun toWall() {}
fun emergency() {}
fun openShutters() {}

data class Mouse(val stirring: Boolean = false)
class Stocking(val hung: Boolean = true)
class Person(val name: String = "", var inBed: Boolean = true, var hallucinating: Boolean = true, var dressed: Boolean = false, val eyes: String = "wondering eyes")
class Snow(val isNew: Boolean = true, val hasBreast: Boolean = true)
class Moon
