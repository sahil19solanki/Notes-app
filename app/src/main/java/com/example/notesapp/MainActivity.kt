//just steps to remember me and you guys also:
//1. creating our Notes schema(Model)
//2. Dao creation to communicate with the database
//  a.)  Making insert and delete suspend to run in a background thread rather than UI thread
//  b.) Making getAllNotes List <Notes>   LiveData to get realtime changes from any Activity or fragment
//3. Making a single Instance of our database using the 💥companion object  💥and use of synchronized while
// creating to avoid multiple threads access.
//
//4. Creating the Repository (Single source directory to handle  all type of data like offline or online )


package com.example.notesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}