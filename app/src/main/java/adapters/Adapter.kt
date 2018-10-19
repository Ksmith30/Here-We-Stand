package adapters

import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.kylesmith.herewestand.R

class MyAdapter(val myDataset: Array<String>) :
        RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        var sectionNumber: TextView = view.findViewById(R.id.section_number)
        var sectionText: TextView = view.findViewById(R.id.section_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
        val layout = LayoutInflater.from(parent.context)
                .inflate(R.layout.section_list_item, parent, false)
        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.sectionText.text = myDataset[position]
    }

    override fun getItemCount() = myDataset.size
}