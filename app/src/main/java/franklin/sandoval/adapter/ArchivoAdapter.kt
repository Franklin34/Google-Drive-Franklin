package franklin.sandoval.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import franklin.sandoval.R
import franklin.sandoval.entity.Archivo

class ArchivoAdapter(context: Context, archivos: List<Archivo>): ArrayAdapter<Archivo>(context,0, archivos) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater: LayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val rowView = inflater.inflate(R.layout.archivo_item, parent, false)

        val nombre = rowView.findViewById<TextView>(R.id.archivo_id)
        val puesto = rowView.findViewById<TextView>(R.id.archivo_name)

        val archivo = getItem(position)

        nombre.setText(archivo?.id)
        puesto.setText(archivo?.name)

        return rowView
    }
}