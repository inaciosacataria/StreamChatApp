package com.plcoding.streamchatapp.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.viewbinding.ViewBinding
import com.plcoding.streamchatapp.R
import com.plcoding.streamchatapp.databinding.FragmentLoginBinding
import com.plcoding.streamchatapp.ui.BindingFragment
import com.plcoding.streamchatapp.util.Constants
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class LoginFragment : BindingFragment<FragmentLoginBinding>() {

    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentLoginBinding::inflate

    private val viewModel: LoginViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnConfirm.setOnClickListener {
            setupConnectingUiState()
        //    viewModel.connectUser(binding.etUsername.text.toString())
        }
    }

    private fun subscribeToEvents(){
        lifecycleScope.launchWhenStarted {
    //        viewModel.log{event->
    //            when(event){
     //               if LoginViewModel.LogInEvent.ErrorInputTooShort->{

           //         }
           //     }
            }
        }


    private fun setupConnectingUiState(){
       binding.progressBar.visibility= View.VISIBLE
      binding.btnConfirm.isEnabled =false

    }
    private fun setupIdleUiState(){
        binding.progressBar.visibility= View.INVISIBLE
        binding.btnConfirm.isEnabled =true

    }
}