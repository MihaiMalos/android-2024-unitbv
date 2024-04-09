package com.cst.cstacademy2024.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.cst.cstacademy2024.data.models.CategoryWithProducts
import com.cst.cstacademy2024.models.ProductAPIResponse

@Dao
interface ProductsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public fun insert(product: ProductAPIResponse)

    @Insert
    public fun insertAll(product: List<ProductAPIResponse>)

    @Query("SELECT * FROM products")
    public fun getAll(): List<ProductAPIResponse>

    @Query("SELECT * FROM categories")
    fun getCategoryWithProducts(): List<CategoryWithProducts>
}