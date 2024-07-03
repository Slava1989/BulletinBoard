package com.slava.myapplication.dialoghelper

import android.app.AlertDialog
import com.slava.myapplication.MainActivity
import com.slava.myapplication.R
import com.slava.myapplication.accounthelper.AccountHelper
import com.slava.myapplication.databinding.SignDialogBinding

class DialogHelper(act: MainActivity) {
    private val activity = act
    private  val accHelper = AccountHelper(activity)

    fun createSignDialog(index: Int) {
        val builder = AlertDialog.Builder(activity)
        val rootDialogElement = SignDialogBinding.inflate(activity.layoutInflater)
        val view = rootDialogElement.root

        if (index == DialogConst.SIGN_UP_STATE) {
            rootDialogElement.tvSignTitle.text = activity.resources.getString(R.string.ac_sign_up)
            rootDialogElement.btSignUp.text = activity.resources.getString(R.string.sign_up_action)
        } else {
            rootDialogElement.tvSignTitle.text = activity.resources.getString(R.string.ac_sign_in)
            rootDialogElement.btSignUp.text = activity.resources.getString(R.string.sign_in_action)
        }

        rootDialogElement.btSignUp.setOnClickListener {
            if (index == DialogConst.SIGN_UP_STATE) {
                accHelper.signUpWithEmail(
                    rootDialogElement.edSignEmail.text.toString(),
                    rootDialogElement.edPassword.text.toString())
            } else {
            }
        }

        builder.setView(view)
        builder.show()
    }
}