package com.example.team11

import androidx.multidex.MultiDexApplication
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase

class MyApplication : MultiDexApplication(){
    companion object{
        lateinit var db : FirebaseFirestore

        lateinit var auth : FirebaseAuth
        var email:String? = null
        fun checkAuth() : Boolean{
            var currentUser = auth.currentUser
            return currentUser?.let{
                email = currentUser.email
                if(currentUser.isEmailVerified) true
                else false
            } ?: false

        }

    }
    override fun onCreate() {
        super.onCreate()

        auth = Firebase.auth
        db = FirebaseFirestore.getInstance() // 하나의 컬렉션을 만들겠다.
    }
}