package org.arh.mikmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform