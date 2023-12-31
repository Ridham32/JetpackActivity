package com.ridhamsharma.jetpackactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.ridhamsharma.jetpackactivity.databinding.FragmentThirdBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ThirdFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ThirdFragment : Fragment() {
    // TODO: Rename and change types of parameters
    lateinit var binding: FragmentThirdBinding
    private var param1: String? = null
    private var param2: String? = null
    lateinit var btn3rdBack: Button
    lateinit var btnBackToFirst:Button
    var tvname3rd: TextView?=null
    var tvrollno3rd: TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentThirdBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn3rdBack= view.findViewById(R.id.btn3rdBack)
        btnBackToFirst=view.findViewById(R.id.btnBackToFirst)
        tvname3rd=view.findViewById(R.id.tvname3rd)
        tvname3rd?.setText("name")
        tvrollno3rd=view.findViewById((R.id.tvrollno3rd))
        tvrollno3rd?.setText("rollno".toString())
        btn3rdBack.setOnClickListener {
            findNavController().popBackStack() //take to second fragment
        }
        btnBackToFirst.setOnClickListener {
            findNavController().popBackStack(R.id.firstFragment, true)
        }


    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ThirdFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ThirdFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}