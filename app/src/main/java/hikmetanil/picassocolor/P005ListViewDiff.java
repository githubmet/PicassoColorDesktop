package hikmetanil.picassocolor;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import hikmetanil.picassocolor.adapter.P005ArrayAdapter;

public class P005ListViewDiff extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] flowerNames=getResources().getStringArray(R.array.flower_names);
        ArrayAdapter arrayAdapter=new P005ArrayAdapter(this,flowerNames);
        setListAdapter(arrayAdapter);
    }
}
