package com.example.recycleview07


import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.example.recycleview07.ui.theme.RecycleView07Theme
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {

    private lateinit var newRecylerview : RecyclerView
    private  lateinit var newArrayList : ArrayList<News>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.wq1,
            R.drawable.wq2,
            R.drawable.wq4,
            R.drawable.wq5,
            R.drawable.wq6
        )

        heading = arrayOf(
            "sdlgknsdgndsfnfsdnbjfd",
            "sdfgdsfhgsdhngfsnhsgfnfg",
            "dfgfdgfdgdfbdfdfnfdn",
            "dsfgdfgdfgsfdgsfdgdsfgfd",
            "sdgfdgdsfgdsfgdsfgh"
        )

        newRecylerview = findViewById(R.id.recyclerView)
        newRecylerview.layoutManager = LinearLayoutManager(this)
        newRecylerview.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        getUserdata()
    }

    private fun getUserdata() {
        for(i in imageId.indices){

            val news = News(imageId[i],heading[i])
            newArrayList.add(news)
        }

        newRecylerview.adapter = MyAdapter(newArrayList)
    }
}