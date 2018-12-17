package hikmetanil.picassocolor;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import hikmetanil.picassocolor.adapter.P004ArrayAdapter;

public class P004ListViewPicss extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] flowerNames=getResources().getStringArray(R.array.flower_names);
        ArrayAdapter arrayAdapter=new P004ArrayAdapter(this,flowerNames);
        setListAdapter(arrayAdapter);

    }
}
