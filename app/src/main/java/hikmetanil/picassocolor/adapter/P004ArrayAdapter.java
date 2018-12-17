package hikmetanil.picassocolor.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import hikmetanil.picassocolor.R;


public class P004ArrayAdapter extends ArrayAdapter<String> {

    Context context;
    String[] flowerNames;
    public P004ArrayAdapter(Context context,String[] flowerNames){    //int resource) {
        super(context,R.layout.p004custom_row,flowerNames);
        this.context=context;
        this.flowerNames=flowerNames;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view= layoutInflater.inflate(R.layout.p004custom_row,parent,false);
        ImageView imageViewCustomP004= view.findViewById(R.id.imageViewCustomP004);


        Picasso.with(context)
                .load("http://services.hanselandpetal.com/photos/"+flowerNames[position])
                .resize(400,400)
                .into(imageViewCustomP004);

        return view; //super.getView(position, convertView, parent);
    }
}
