package com.cst.cstacademy2024

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cst.cstacademy2024.adapters.ProductListAdapter
import com.cst.cstacademy2024.helpers.extensions.logErrorMessage
import com.cst.cstacademy2024.models.CategoryModel
import com.cst.cstacademy2024.models.ProductModel

class ProductListFragment : Fragment() {
    val arguments: ProductListFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_product_list, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val token = arguments.token
        token.logErrorMessage()
    }

    private fun setupProductList() {
        val layoutManager = LinearLayoutManager(context)
        val productList = listOf(
            ProductModel(1, "Product 1", "Description 1"),
            ProductModel(2, "Product 2", "Description 2"),
            ProductModel(3, "Product 3", "Description 3"),
            ProductModel(4, "Product 4", "Description 4"),
            ProductModel(5, "Product 5", "Description 5"),
            ProductModel(6, "Product 6", "Description 6"),
            ProductModel(7, "Product 7", "Description 7"),
            ProductModel(8, "Product 8", "Description 8"),
            ProductModel(9, "Product 9", "Description 9"),
            CategoryModel(99, "Category", "Description"),
            ProductModel(10, "Product 10", "Description 10"),
            ProductModel(11, "Product 11", "Description 1"),
            ProductModel(12, "Product 12", "Description 2"),
            ProductModel(13, "Product 13", "Description 3"),
            CategoryModel(111, "Category", "Description"),
            ProductModel(14, "Product 14", "Description 4"),
            ProductModel(15, "Product 15", "Description 5"),
            ProductModel(16, "Product 16", "Description 6"),
            ProductModel(17, "Product 17", "Description 7"),
            ProductModel(18, "Product 18", "Description 8"),
            ProductModel(19, "Product 19", "Description 9"),
            ProductModel(20, "Product 20", "Description 10"),
        )

        val adapter = ProductListAdapter(productList)

        view?.findViewById<RecyclerView>(R.id.product_list)?.apply {
            this.layoutManager = layoutManager
            this.adapter = adapter
        }
    }
}