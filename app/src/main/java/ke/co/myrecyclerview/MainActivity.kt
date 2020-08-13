package ke.co.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView:RecyclerView=findViewById(R.id.rvNames)
        val lm = LinearLayoutManager(this)
        recyclerView.layoutManager=lm
        recyclerView.hasFixedSize()
        val people= mutableListOf<students>()
        people.add(students())


        val hello=NamesRecyclerVewAdapter(people)
        recyclerView.adapter = hello
    }
}