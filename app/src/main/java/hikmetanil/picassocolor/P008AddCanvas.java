package hikmetanil.picassocolor;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.squareup.picasso.Picasso;

import hikmetanil.picassocolor.view.P008View;

public class P008AddCanvas extends Activity {

    ImageView imageViewTopP008;
    RelativeLayout relativeLayoutP008;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p008add_canvas);

        imageViewTopP008= findViewById(R.id.imageViewTopP008);
        relativeLayoutP008= findViewById(R.id.relativeLayoutP008);

        Picasso.with(this)
                .load("http://services.hanselandpetal.com/photos/aloe_vera.jpg")
                .resize(400,400)
                .into(imageViewTopP008);
    }

    public void onClickMtdP008(View view) {
        Drawable drawable= imageViewTopP008.getDrawable();
        Bitmap bitmap=((BitmapDrawable)drawable).getBitmap();

        relativeLayoutP008.addView(new P008View(this,bitmap));
    }
}
