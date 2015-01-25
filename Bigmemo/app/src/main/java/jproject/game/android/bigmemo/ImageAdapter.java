package jproject.game.android.bigmemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	private Context mContext;
    private Integer[] mThumbIds = {   
    		R.drawable.blue_dark, R.drawable.white_dark,
    		R.drawable.yellow_dark, R.drawable.red_dark,
    		R.drawable.brown_dark, R.drawable.pink_dark,
    		R.drawable.grey_dark, R.drawable.orange_dark,
    		R.drawable.green_dark
    };
    
	public ImageAdapter(Context iaContext) {
		// TODO Auto-generated constructor stub
		mContext = iaContext;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return mThumbIds.length;
	}

	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return mThumbIds[arg0];
	}

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }    
}
