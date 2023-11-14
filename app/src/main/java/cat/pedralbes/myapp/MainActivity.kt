package cat.pedralbes.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.list)
        var mAdapter = MovieAdapter(getMovies())
        recyclerView.adapter = mAdapter
    }

    fun getMovies(): ArrayList<Movie>{
        var movies:ArrayList<Movie> = ArrayList()
        movies.add(Movie("Spiderman", R.drawable.akashi))
        movies.add(Movie("Daredevil", R.drawable.akashi))
        movies.add(Movie("Wolverine", R.drawable.akashi))
        movies.add(Movie("Batman", R.drawable.akashi))
        return movies
    }
}