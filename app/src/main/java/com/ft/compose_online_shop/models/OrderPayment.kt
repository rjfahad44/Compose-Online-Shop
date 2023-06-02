package com.ft.compose_online_shop.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Entity(tableName = "order_payments")
@Serializable
data class OrderPayment(
    @PrimaryKey(autoGenerate = true) val orderPaymentId: Int? = null,
    val orderId: String,
    val providerId: String?,
)
