package hikmetanil.picassocolor;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class P007Ghost extends Activity {
    ImageView imageViewTopP007;
    ImageView imageViewBottomAlphaP007;
    ImageView imageViewBottomNormalP007;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p007ghost);
        imageViewTopP007= findViewById(R.id.imageViewTopP007);
        imageViewBottomAlphaP007= findViewById(R.id.imageViewBottomAlphaP007);
        imageViewBottomNormalP007=findViewById(R.id.imageViewBottomNormalP007);

        Picasso.Builder builder=new Picasso.Builder(this);
        builder.listener(new Picasso.Listener() {
            @Override
            public void onImageLoadFailed(Picasso picasso, Uri uri, Exception exception) {
                Toast.makeText(P007Ghost.this, R.string.network_error, Toast.LENGTH_SHORT).show();
            }
        }).build()
                .load("http://services.hanselandpetal.com/photos/aloe_vera.jpg")
                .resize(200,200)
                .into(imageViewTopP007);

    }

    public void onClickMtdAlphaP007(View view) {

        Drawable drawable= imageViewTopP007.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawable).getBitmap();
        int xV=bitmapSource.getWidth();
        int yV=bitmapSource.getHeight();

        Bitmap bitmapDestination= Bitmap.createBitmap(bitmapSource,0,0,xV,yV);
        int pixelV;
        int alphaV;
        int redV;
        int greenV;
        int blueV;

        for(int y=0;y<yV;y++){
            for(int x=0;x<xV;x++){
                 pixelV= bitmapSource.getPixel(x,y);
                 alphaV= 255-Color.alpha(pixelV);
                redV= 255-Color.red(pixelV);
                greenV= 255-Color.green(pixelV);
                blueV= 255-Color.blue(pixelV);

                bitmapDestination.setPixel(x,y,Color.argb(alphaV,redV,greenV,blueV));
            }
        }

        imageViewBottomAlphaP007.setImageBitmap(bitmapDestination);

    }

    public void onClickMtdNormalP007(View view) {

        Drawable drawable= imageViewTopP007.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawable).getBitmap();

        imageViewBottomNormalP007.setImageBitmap(createBitmapGost(bitmapSource));

    }
    private Bitmap createBitmapGost(Bitmap bitmapReal) {
        Bitmap bitmapSkeleton= Bitmap.createBitmap(bitmapReal.getWidth(), bitmapReal.getHeight(), bitmapReal.getConfig());
        int R,G,B;
        int x=bitmapReal.getWidth();
        int y=bitmapReal.getHeight();
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                int tinyPixel= bitmapReal.getPixel(i,j);
                R= 255- Color.red(tinyPixel);
                G=255-Color.green(tinyPixel);
                B=255-Color.blue(tinyPixel);

                bitmapSkeleton.setPixel(i,j,Color.rgb(R,G,B));
            }
        }
        return bitmapSkeleton;
    }
}
