package hikmetanil.picassocolor.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class P006PagerAdapter extends PagerAdapter {

    Context context;
    String[] flowerNames;
    public P006PagerAdapter(Context context,String[] flowerNames) {
        this.context=context;
        this.flowerNames=flowerNames;
    }

    @Override
    public int getCount() {
        return flowerNames.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        FrameLayout frameLayout=new FrameLayout(context);
        ImageView imageView=new ImageView(context);

        Picasso.with(context)
                .load("http://services.hanselandpetal.com/photos/"+flowerNames[position])
                .into(imageView);
        frameLayout.addView(imageView);
        container.addView(frameLayout);

        return frameLayout; //super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((FrameLayout)object);
        //super.destroyItem(container, position, object);
    }
}
