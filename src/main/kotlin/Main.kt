fun main() {
    greet("GitHub Actions 👌🏼 !!!")
    greet("GitHub CI 🤘🏼 !!!")
    greet("Add new greeting")
}

private fun greet(message: String) {
    println("Hello $message")
}