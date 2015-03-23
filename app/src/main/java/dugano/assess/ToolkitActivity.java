package dugano.assess;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class ToolkitActivity extends Activity {

    int[] assessIds = {
            R.drawable.assess_toolkitgraphics_01, R.drawable.assess_toolkitgraphics_02,
            R.drawable.assess_toolkitgraphics_03, R.drawable.assess_toolkitgraphics_04,
            R.drawable.assess_toolkitgraphics_05, R.drawable.assess_toolkitgraphics_06,
            R.drawable.assess_toolkitgraphics_07, R.drawable.assess_toolkitgraphics_08,
            R.drawable.assess_toolkitgraphics_09, R.drawable.assess_toolkitgraphics_13
    };

    int[] actIds= {
            R.drawable.act1, R.drawable.act2,
            R.drawable.act3, R.drawable.act4,
            R.drawable.act5, R.drawable.act6,
            R.drawable.act7, R.drawable.act8
    };

    int[] auditIds = {
            R.drawable.audit1, R.drawable.audit2,
            R.drawable.audit3, R.drawable.audit4,
            R.drawable.audit5, R.drawable.audit6,
            R.drawable.audit7
    };

    ToolkitItem[] assesItems;





    @Override
    protected void onCreate(Bundle savedInstanceState) {

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width=dm.widthPixels;
        int height=dm.heightPixels;

        //choose which array to use



        super.onCreate(savedInstanceState);
        setContentView(R.layout.gird_view);

        Intent intent = getIntent();
        int displayKit = intent.getIntExtra("position", 0);

        GridView gridView = (GridView) findViewById(R.id.grid_view);


        //test the fetch

        //wtf
       switch (displayKit){
           case 0: setAssesArr();
               break;
           case 1: setActArr();
               break;
           case 2: setAuditArr();
               break;
       }

        gridView.setAdapter(new ImageAdapter(this, assesItems,width, height));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(ToolkitActivity.this, "" + assesItems[position].imageViewId, Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    void setAssesArr(){
        assesItems = new ToolkitItem[assessIds.length];
        for (int i = 0; i < assessIds.length; i++){
            assesItems[i] = new ToolkitItem();
            assesItems[i].imageViewId = assessIds[i];
        }
    }

    void setActArr(){
        assesItems = new ToolkitItem[actIds.length];
        for (int i = 0; i < actIds.length; i++){
            assesItems[i] = new ToolkitItem();
            assesItems[i].imageViewId = actIds[i];
        }
    }

    void setAuditArr(){
        assesItems = new ToolkitItem[auditIds.length];
        for (int i = 0; i < auditIds.length; i++){
            assesItems[i] = new ToolkitItem();
            assesItems[i].imageViewId = auditIds[i];
        }
    }
}
