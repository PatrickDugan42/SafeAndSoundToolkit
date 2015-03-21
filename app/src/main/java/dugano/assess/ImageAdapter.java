package dugano.assess;

import android.content.Context;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by wowdu_000 on 3/19/2015.
 */
public class ImageAdapter extends BaseAdapter {

    //changes
    Context context;
    ToolkitItem[] toolkitItems;
    int width;
    int height;

    public ImageAdapter (Context c, ToolkitItem[] items, int width, int height){
        context = c;
        toolkitItems = items;
        this.width = width;
        this.height = height;

    }

    @Override
    public int getCount() {
        return toolkitItems.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {



        ImageView imageView = new ImageView(context);
        imageView.setImageResource(toolkitItems[position].imageViewId);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setLayoutParams(new GridView.LayoutParams(width/3, height/5));
        imageView.setPadding(5,5,5,5);
        return imageView;
    }
}
