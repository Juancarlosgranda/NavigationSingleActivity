package com.forward.navigationsingleactivity.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.forward.navigationsingleactivity.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (false){
            findNavController().navigate(R.id.homeFragment)
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        login.setOnClickListener {
            findNavController().navigate(R.id.action_a_to_b)
        }
        recover_button.setOnClickListener {
            findNavController().navigate(R.id.action_nav_home_to_recoverPasswordFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(requireContext(),"onDestroy Login Fragment",Toast.LENGTH_SHORT).show()
    }

}