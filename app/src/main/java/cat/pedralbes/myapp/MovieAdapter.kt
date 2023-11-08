package cat.pedralbes.myapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(movies: ArrayList<Movie>, context: Context) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    lateinit var data: ArrayList<Movie>
    lateinit var context: Context

    // Constructor
    fun MovieAdapter(data : ArrayList<Movie>,context: Context ){
        this.data = data
        this.context = context;
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.bind(data[position], context)
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item, viewGroup, false)

        return ViewHolder(view)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = data.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title = view.findViewById(R.id.title) as TextView
        val photo = view.findViewById(R.id.image) as ImageView

        fun bind(movie: Movie, context: Context) {
            title.text = movie.name
            photo.setBackgroundResource(movie.photo)
        }
    }
}