package com.example.kmm_search_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform