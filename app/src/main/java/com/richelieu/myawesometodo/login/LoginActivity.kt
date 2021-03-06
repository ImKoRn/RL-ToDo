package com.richelieu.myawesometodo.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.richelieu.myawesometodo.R
import com.richelieu.myawesometodo.manager.ToDoFragmentManager

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        ToDoFragmentManager.init(supportFragmentManager)
        ToDoFragmentManager.showLoginSelectionFragment()
    }

    override fun onBackPressed() {
        if (!ToDoFragmentManager.showPreviousFragment()) {
            super.onBackPressed()
        }
    }
}
