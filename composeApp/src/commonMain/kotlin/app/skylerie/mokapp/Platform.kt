package app.skylerie.mokapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform