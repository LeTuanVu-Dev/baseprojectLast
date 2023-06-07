package com.mobiai.srcbase.ui.dialog


import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import com.mobiai.srcbase.R
import com.mobiai.srcbase.language.LanguageUtil

open class BaseDialog(context: Context) : Dialog(context, com.facebook.R.style.Theme_AppCompat_Dialog) {
    init {
        LanguageUtil.setupLanguage(context)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
    }


    override fun show() {
        super.show()
//        CheckAdsResume.isDialogOpen = true
    }

    override fun dismiss() {
        super.dismiss()
//        CheckAdsResume.isDialogOpen = false
    }
    protected fun showKeyBoard(){
        window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
    }

}
