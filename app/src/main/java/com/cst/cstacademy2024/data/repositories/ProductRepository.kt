package com.cst.cstacademy2024.data.repositories

import com.cst.cstacademy2024.data.tasks.InsertProductTask
import com.cst.cstacademy2024.models.ProductAPIResponse

object ProductRepository {
    fun insertProduct(product: ProductAPIResponse, onSuccess: () -> Unit) {
        InsertProductTask(onSuccess).execute(product)
    }

    fun insertAllProduct(products: List<ProductAPIResponse>, onSuccess: () -> Unit) {
        InsertProductTask(onSuccess).execute(*products.toTypedArray())
    }
}