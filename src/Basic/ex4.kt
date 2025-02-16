package Basic

fun main() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    var requested = "smtp"

    val isSupported = requested.uppercase() in SUPPORTED

    println("Support for $requested: $isSupported")
}