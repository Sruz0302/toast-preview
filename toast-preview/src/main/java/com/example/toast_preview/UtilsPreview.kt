package com.example.toast_preview

import android.content.Context
import android.widget.Toast

class UtilsPreview {
    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

}