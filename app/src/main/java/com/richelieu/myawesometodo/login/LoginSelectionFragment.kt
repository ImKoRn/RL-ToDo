package com.richelieu.myawesometodo.login

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.richelieu.myawesometodo.R

class LoginSelectionFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.login_selection_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val loginButton: Button = view.findViewById(R.id.loginButton)

        loginButton.setOnClickListener { showLoginFragment() }
    }

    fun showLoginFragment() {
        fragmentManager
                ?.beginTransaction()
                ?.replace(R.id.container, LoginFragment())
                ?.addToBackStack(null)
                ?.commit()
    }
}
