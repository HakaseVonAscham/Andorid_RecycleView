package cat.pedralbes.myapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val movies: List<Movie>) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

        val photoMovie = itemView.findViewById<ImageView>(R.id.MovieImage)
        val titleMovie : TextView = itemView.findViewById<TextView>(R.id.MovieTitle)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MovieAdapter.ViewHolder, position: Int) {
        val movie:Movie = movies.get(position)
        holder.titleMovie.text = movie.name;
        holder.photoMovie.setImageResource(movie.photo)

    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.ViewHolder {
        // Create a new view, which defines the UI of the list item
        val context = parent?.context;
        val inflater = LayoutInflater.from(context)
        val viewMovie = inflater.inflate(R.layout.item, parent, false)
        return ViewHolder(viewMovie)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount(): Int {
        return movies.size
    }
}