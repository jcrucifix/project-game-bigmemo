package jproject.game.android.bigmemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class Play extends Activity {
	private GridView gridViewGame;
	private FrameLayout frmLytImage;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);        
        
        gridViewGame = (GridView) findViewById(R.id.gridViewGame);
        gridViewGame.setAdapter(new ImageAdapter(this));        
        
        gridViewGame.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
            	ImageView imageV = (ImageView) v;
            	
            	imageV.setPressed(true);
            	
            	switch (Integer.parseInt(String.valueOf(id))){
            		case R.drawable.blue_dark: imageV.setImageResource(R.drawable.blue_clear);
            			break;
            		case R.drawable.red_dark: imageV.setImageResource(R.drawable.red_clear);
            			break;
            		case R.drawable.brown_dark: imageV.setImageResource(R.drawable.brown_clear);
            			break;
            		case R.drawable.grey_dark: imageV.setImageResource(R.drawable.grey_clear);
            			break;
            		case R.drawable.green_dark: imageV.setImageResource(R.drawable.green_clear);
            			break;
            		case R.drawable.yellow_dark: imageV.setImageResource(R.drawable.yellow_clear);
            			break;
            		case R.drawable.white_dark: imageV.setImageResource(R.drawable.white_clear);
            			break;
            		case R.drawable.pink_dark: imageV.setImageResource(R.drawable.pink_clear);
            			break;
            		case R.drawable.orange_dark: imageV.setImageResource(R.drawable.orange_clear);
            			break;
            	}
            }
        });
        

//        frmLytImage = (FrameLayout)findViewById(R.id.frmLytImage);
        
    }
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_menu,  menu);
		return true;
	}

}