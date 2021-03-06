package com.richelieu.myawesometodo.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.richelieu.myawesometodo.R
import com.richelieu.myawesometodo.manager.ToDoFragmentManager

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

        loginButton.setOnClickListener {
            ToDoFragmentManager.showLoginFragment()
        }
    }
}
