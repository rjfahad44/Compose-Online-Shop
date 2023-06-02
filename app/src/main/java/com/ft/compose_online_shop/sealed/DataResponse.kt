package com.ft.compose_online_shop.sealed

sealed class DataResponse<T>(
    var data: T? = null,
    var error: com.ft.compose_online_shop.sealed.Error? = null,
) {
    class Success<T>(data: T) : DataResponse<T>(data = data)
    class Error<T>(error: com.ft.compose_online_shop.sealed.Error) : DataResponse<T>(error = error)
}