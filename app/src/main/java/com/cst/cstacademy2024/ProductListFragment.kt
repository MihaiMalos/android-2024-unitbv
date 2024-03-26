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
import com.cst.cstacademy2024.models.CartItemModel
import com.cst.cstacademy2024.models.CategoryModel
import com.cst.cstacademy2024.models.ProductModel

class ProductListFragment : Fragment() {
    private val itemList = ArrayList<CartItemModel>()
    private val adapter = ProductListAdapter(itemList)
    private val arguments: ProductListFragmentArgs by navArgs()

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



        view?.findViewById<RecyclerView>(R.id.product_list)?.apply {
            this.layoutManager = layoutManager
            this.adapter = this@ProductListFragment.adapter
        }
    }

    private fun getCarItems() {

    }
}