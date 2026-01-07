package com.brightly.interfacecmpapproach

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform