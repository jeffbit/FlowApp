package icondev.application.flowapp.util

sealed class Results<out T> {
    data class Success<out T>(val data: T) : Results<T>()
    data class Failure(val errors: Errors) : Results<Nothing>()

}