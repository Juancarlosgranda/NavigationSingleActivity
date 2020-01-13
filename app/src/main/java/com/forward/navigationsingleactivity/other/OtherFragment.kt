package com.forward.navigationsingleactivity.other

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.forward.navigationsingleactivity.R
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_other.*

class OtherFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_other, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        logout_button.setOnClickListener {
            findNavController().navigate(R.id.action_c_to_a)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(requireContext(),"Other Fragment Destroy", Toast.LENGTH_SHORT).show()

    }

}