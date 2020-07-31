package icondev.application.flowapp.util


private val TAG = Results::class.simpleName

sealed class Results<out T> {
    data class Success<out T>(val data: T) : Results<T>()
    data class Failure(val errors: Errors) : Results<Nothing>()

}

//    handles calling the api and return results

//fun requestApiInfo(): Results<T> = try {
//    //val call =
//    //Results.Success()
//} catch (e: IOException) {
//    Log.e(TAG, "requestApiInfo: IOException - ${e.message}")
//    Results.Failure(Errors.ExceptionError(e))
//} catch (e: NetworkErrorException) {
//    Log.e(TAG, "requestApiInfo: NetworkErrorException - ${e.message}")
//    Results.Failure(Errors.NetworkError())
//}
//}