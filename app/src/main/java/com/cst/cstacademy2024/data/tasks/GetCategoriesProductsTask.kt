package com.cst.cstacademy2024.data.tasks

import android.os.AsyncTask
import com.cst.cstacademy2024.ApplicationController
import com.cst.cstacademy2024.models.ProductAPIResponse

class GetCategoriesProductsTask(
    private val onSuccess: () -> Unit,
) : AsyncTask<Unit, Unit, Unit>() {
    override fun doInBackground(vararg params: Unit) {
        ApplicationController.instance.appDatabase.productsDao.getCategoryWithProducts()
    }

    override fun onPostExecute(result: Unit?) {
        onSuccess.invoke()
    }
}