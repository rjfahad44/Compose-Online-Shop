package com.ft.compose_online_shop.models

import androidx.room.Entity
import kotlinx.serialization.Serializable

@Entity(tableName = "productCopies", primaryKeys = ["productId","colorName"])
@Serializable
data class ProductColor(
    val productId: Int,
    val colorName: String,
    val image: Int,
)
