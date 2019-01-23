package com.richelieu.myawesometodo.manager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.richelieu.myawesometodo.R
import com.richelieu.myawesometodo.login.LoginFragment
import com.richelieu.myawesometodo.login.LoginSelectionFragment
import com.richelieu.myawesometodo.login.RegistrationFragment

object ToDoFragmentManager {

    private lateinit var fragmentManager: FragmentManager

    fun init(fragmentManager: FragmentManager) {
        this.fragmentManager = fragmentManager
    }

    fun showLoginSelectionFragment() {
        showFragment(
                LoginSelectionFragment()
        )
    }

    fun showRegistrationFragment() {
        showFragment(RegistrationFragment())
    }

    fun showLoginFragment() {
        showFragment(LoginFragment())
    }

    fun showPreviousFragment(): Boolean {
        fragmentManager.popBackStackImmediate()
        return if (fragmentManager.backStackEntryCount > 0) {
            val fragment = fragmentManager.fragments.last()
            showFragment(fragment)
            true
        } else {
            false
        }
    }

    private fun showFragment(fragment: Fragment) {
        fragmentManager
                .beginTransaction()
                .replace(R.id.container, fragment)
                .addToBackStack(null)
                .commit()
    }
}
