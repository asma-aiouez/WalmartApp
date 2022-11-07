package com.miu.walmartlogin.data

import java.io.Serializable

data class Product( val productId: Long, val title: String, val price: String, val color: String, val image: Int, val desc: String,
) : Serializable