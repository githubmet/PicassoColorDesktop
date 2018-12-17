package hikmetanil.picassocolor;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import hikmetanil.picassocolor.adapter.P006PagerAdapter;

public class P006ViewPager extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ViewPager viewPager=new ViewPager(this);
        String[] flowerNames=getResources().getStringArray(R.array.flower_names);
        PagerAdapter pagerAdapter=new P006PagerAdapter(this,flowerNames);
        viewPager.setAdapter(pagerAdapter);

        setContentView(viewPager);
    }
}
