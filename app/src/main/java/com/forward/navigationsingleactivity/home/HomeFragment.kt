package com.forward.navigationsingleactivity.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.forward.navigationsingleactivity.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        other_fragment.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_otherFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(requireContext(),"onDestroy Home Fragment", Toast.LENGTH_SHORT).show()

    }

}