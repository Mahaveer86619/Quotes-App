package com.sev7en.quotesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.sev7en.quotesapp.screens.QuoteCard
import com.sev7en.quotesapp.screens.QuoteDetail

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuoteDetail(R.drawable.quote_icon, "If you watch a clock closely, it is just three for loops stuck in an infinite loop.", "Se7en")
            //QuoteCard(R.drawable.quote_icon, "If you watch a clock closely, it is just three for loops stuck in an infinite loop.", "Se7en")
        }
    }
}
