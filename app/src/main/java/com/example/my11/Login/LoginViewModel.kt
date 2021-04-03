package com.example.my11.Login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.my11.DataClass.User
import com.example.my11.Repository

class LoginViewModel: ViewModel() {
    private  val FirebaseDatabase= Repository()
    var userAdded : MutableLiveData<Boolean> = MutableLiveData()

    fun adduser(user: User){
        var userAdded = FirebaseDatabase.userUpload(user)
    }

}