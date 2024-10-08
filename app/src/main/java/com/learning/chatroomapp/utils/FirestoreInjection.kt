package com.learning.chatroomapp.utils

import com.google.firebase.firestore.FirebaseFirestore

object FirestoreInjection {
    private val instance: FirebaseFirestore by lazy {
        FirebaseFirestore.getInstance()
    }

    fun instance(): FirebaseFirestore {
        return instance
    }
}