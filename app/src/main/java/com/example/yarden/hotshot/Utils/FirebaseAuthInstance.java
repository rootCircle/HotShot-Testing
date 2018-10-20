package com.example.yarden.hotshot.Utils;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseAuthInstance {

    private static String uid = null;
    private static FirebaseAuth firebaseAuth = null;
    private static DatabaseReference databaseReference = null;
    private static FirebaseUser firebaseUser = null;

    private FirebaseAuthInstance(){}

    public static String getUid()
    {
        if(uid == null)
        {
            uid = FirebaseAuth.getInstance().getCurrentUser().getUid();
        }
        return uid;
    }

    public static  FirebaseAuth  getFirebaseAuth()
    {
        if(uid == null)
        {
            firebaseAuth = FirebaseAuth.getInstance();
        }
        return firebaseAuth;
    }

    public static  FirebaseUser  getFirebaseUser()
    {
        if(uid == null)
        {
            firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        }
        return firebaseUser;
    }

    public static void setFirebaseUser(FirebaseUser _firebaseUser)
    {
        firebaseUser=_firebaseUser;
    }

    public static DatabaseReference getDatabaseRef(){
        if(databaseReference == null)
        {
            databaseReference = FirebaseDatabase.getInstance().getReference();
        }
        return databaseReference;
    }



}
