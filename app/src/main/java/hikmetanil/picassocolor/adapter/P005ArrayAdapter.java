package hikmetanil.picassocolor.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import hikmetanil.picassocolor.R;

public class P005ArrayAdapter extends ArrayAdapter {
    Context context;
    String[] flowerNames;
    public P005ArrayAdapter(Context context,String[] flowerNames){    //, int resource) {
        super(context, android.R.layout.simple_list_item_1,flowerNames);
        this.context=context;
        this.flowerNames=flowerNames;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView=new ImageView(context);

        Picasso.Builder builder=new Picasso.Builder(context);
        builder.listener(new Picasso.Listener() {
            @Override
            public void onImageLoadFailed(Picasso picasso, Uri uri, Exception exception) {
                Toast.makeText(context, R.string.network_error, Toast.LENGTH_SHORT).show();
            }
        }).build()
                .load("http://services.hanselandpetal.com/photos/"+flowerNames[position])
                .into(imageView);

        return imageView;  //super.getView(position, convertView, parent);
    }
}
