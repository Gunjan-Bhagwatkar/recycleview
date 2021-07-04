package org.codeway.recyclev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)

        val users = ArrayList<user>()
        users.add(user("komal","7683546982",2))
        users.add(user("Mohini","9876543285",2))
        users.add(user("Gunjan","7005649823",2))
        users.add(user("Nomesh","8099456285",1))
        users.add(user("Yash", "9774287459",1))
        users.add(user("Sakshi","9822170678",3))
        users.add(user("Shreya","7756063452",2))
        users.add(user("Anmol","8888764530",1))
        users.add(user("Mom","7683546975",3))
        users.add(user("Dad","9876554882",1))



        val adapter = CustomAdapter(users)
        recyclerView.adapter = adapter
    }
}