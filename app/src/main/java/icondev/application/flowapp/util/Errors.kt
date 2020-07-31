package icondev.application.flowapp.util

sealed class Errors {
//used to catch specific failures in Result class
    data class NetworkError(val error: String = "No Network Connect") : Errors()
    data class ExceptionError(val exception: Exception) : Errors()
    data class ResponseError(val error: String) : Errors()
}