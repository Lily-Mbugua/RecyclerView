import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ke.co.myrecyclerview.R
import kotlinx.android.synthetic.main.row_name_adapter.view.*


class NamesRecyclerViewAdapter(val namesList: MutableList<students>) :
    RecyclerView.Adapter<NamesRecyclerViewAdapter.NamesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_name_adapter, parent, false)
        return NamesViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return namesList.size
    }
    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        val item:students =namesList[position]
        holder.rowView.etcomrades.text= item.name
        holder.rowView.etcomrades.text= item.age
        holder.rowView.etcomrades.text= item.dateOfBirth
    }
    class NamesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)
}