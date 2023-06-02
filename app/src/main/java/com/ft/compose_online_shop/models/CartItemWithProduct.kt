package com.ft.compose_online_shop.models

import androidx.room.Embedded
import androidx.room.Relation

data class CartItemWithProduct(
    @Embedded
    val details: CartItem,
    @Relation(parentColumn = "productId", entityColumn = "id", entity = Product::class)
    val product: LocalProduct,
)
