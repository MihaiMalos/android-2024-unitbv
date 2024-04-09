package com.cst.cstacademy2024.data.tasks

import android.os.AsyncTask
import com.cst.cstacademy2024.ApplicationController
import com.cst.cstacademy2024.models.ProductAPIResponse

class InsertAllProductTask(
    private val onSuccess: () -> Unit,
) : AsyncTask<List<ProductAPIResponse>, Unit, Unit>() {
    override fun doInBackground(vararg params: List<ProductAPIResponse>) {
        params.getOrNull(0)?.let {
            ApplicationController.instance.appDatabase.productsDao.insertAll(it)
        }
    }

    override fun onPostExecute(result: Unit?) {
        onSuccess.invoke()
    }
}