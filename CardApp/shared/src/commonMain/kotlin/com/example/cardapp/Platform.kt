package com.example.cardapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform