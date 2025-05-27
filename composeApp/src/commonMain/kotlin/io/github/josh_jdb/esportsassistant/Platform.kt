package io.github.josh_jdb.esportsassistant

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform