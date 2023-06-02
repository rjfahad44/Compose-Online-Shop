package com.ft.compose_online_shop.models

import androidx.room.Embedded
import androidx.room.Relation

data class OrderPaymentDetails(
    @Embedded
    val orderPayment: OrderPayment,
    @Relation(
        parentColumn = "providerId",
        entityColumn = "providerId",
        entity = UserPaymentProvider::class,
    )
    val userPaymentProviderDetails: UserPaymentProviderDetails,
)
