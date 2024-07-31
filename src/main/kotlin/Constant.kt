const val APP_VERSION = "1.0.0"

object Constant {
    fun  displayAppVersion(appVersion: String): String {
        return appVersion.also {value ->
            println("Value App version: $value")
        }
    }
}

fun main() {
    Constant.displayAppVersion(APP_VERSION)
}