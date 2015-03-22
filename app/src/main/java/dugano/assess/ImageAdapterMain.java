package dugano.assess;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by dell on 3/20/2015.
 */
public class ImageAdapterMain extends BaseAdapter {
    int HEIGHT;
    int WIDTH;
    private int[] mainIcons = {R.drawable.assess_toolkit, R.drawable.act_toolkit, R.drawable.audit_toolkit};

    private Context mContext;

    public ImageAdapterMain(Context c){
        mContext = c;
        DisplayMetrics metrics = c.getResources().getDisplayMetrics();
        HEIGHT = metrics.heightPixels;
        WIDTH = metrics.widthPixels;
    }

    @Override
    public int getCount() {
        return mainIcons.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(WIDTH,(HEIGHT/3)-85));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(80, 50, 80, 50);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mainIcons[position]);
        return imageView;
    }
}
