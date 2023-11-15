package cat.pedralbes.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.list)
        val movies = ArrayList<Movie>()
        movies.add(Movie("Spiderman", R.drawable.akashi))
        movies.add(Movie("Daredevil", R.drawable.bg1))
        movies.add(Movie("Wolverine", R.drawable.bg2))
        movies.add(Movie("Batman", R.drawable.bg3))
        movies.add(Movie("Peanuts", R.drawable.bg4))
        movies.add(Movie("FNAF", R.drawable.bg5))
        movies.add(Movie("Nemo", R.drawable.bg6))
        movies.add(Movie("Superman", R.drawable.bg7))

        recyclerView.adapter = MovieAdapter(movies)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}