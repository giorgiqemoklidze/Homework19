package com.example.homework19.fragments

import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.example.homework19.Models.User
import com.example.homework19.databinding.MainFragmentBinding
import com.example.homework19.viewModels.MainViewModel

class MainFragment : Fragment() {



    private lateinit var binding : MainFragmentBinding

    private val viewModel: MainViewModel  by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MainFragmentBinding.inflate(inflater,container,false)
        init()
        return binding.root
    }

    private fun init(){
        clickListeners()

    }

    private fun clickListeners(){
        binding.registerBtn.setOnClickListener {
            register()

        }

        binding.loginBtn.setOnClickListener{
            logIn()
        }
    }

    private fun register(){

        if (binding.email.text.toString().trim().isEmpty()){
            binding.email.error = "sheiyvanet Email"
            binding.email.requestFocus()
            return
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(binding.email.text.toString().trim()).matches()){
            binding.email.error = "sheiyvanet swori Email"
            binding.email.requestFocus()
            return
        }
        if (binding.password.text.toString().trim().isEmpty()){
            binding.password.error = "sheiyvanet Password"
            binding.password.requestFocus()
            return
        }



        if (binding.password.text.toString().trim().length < 6){
            binding.password.error = "sheiyvanet minimum 6 simbolo"
            binding.password.requestFocus()
            return
        }


        viewModel.register(binding.email.text.toString().trim(),binding.password.text.toString().trim())

    }

    private fun logIn(){

        if (binding.email.text.toString().trim().isEmpty()){
            binding.email.error = "sheiyvanet Email"
            binding.email.requestFocus()
            return
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(binding.email.text.toString().trim()).matches()){
            binding.email.error = "sheiyvanet swori Email"
            binding.email.requestFocus()
            return
        }
        if (binding.password.text.toString().trim().isEmpty()){
            binding.password.error = "sheiyvanet Password"
            binding.password.requestFocus()
            return
        }



        if (binding.password.text.toString().trim().length < 6){
            binding.password.error = "sheiyvanet minimum 6 simbolo"
            binding.password.requestFocus()
            return
        }


        viewModel.logIn(binding.email.text.toString().trim(),binding.password.text.toString().trim())
        Toast.makeText(requireActivity(), "LogIn SUCSSESFULL", Toast.LENGTH_SHORT).show()

    }




}