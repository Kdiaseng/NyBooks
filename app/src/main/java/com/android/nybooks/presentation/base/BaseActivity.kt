package com.android.nybooks.presentation.base


import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


// open --> para definir que essa classe pode ser herdada
open class BaseActivity : AppCompatActivity(){
    protected  fun setupToobar(toolbar: Toolbar, titleIdRes: Int, showBackButton: Boolean = false){
        toolbar.title = getString(titleIdRes)
        setSupportActionBar(toolbar)

        if(showBackButton){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }


    }
}