package hikmetanil.picassocolor;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import hikmetanil.picassocolor.transform.P003Transform;

public class P003TransformationClass extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ImageView imageView=new ImageView(this);

        Picasso.with(this)
                .load("http://services.hanselandpetal.com/photos/aloe_vera.jpg")
                .transform(new P003Transform())
                .into(imageView);

        setContentView(imageView);
    }
}
