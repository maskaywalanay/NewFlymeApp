package ngopi.malam.codingin.ya;

import android.app.*;
import android.os.*;
import android.view.*;
import android.content.*;
import android.widget.*;
import android.view.View.*;

public class MainActivity extends Activity 
{
	 ProgressBar pb;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		pb = (ProgressBar)findViewById(R.id.progress);
		pb.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					p1.isClickable();
					Toast.makeText(getApplicationContext(),"Ini Adalah Progress Loading",Toast.LENGTH_SHORT).show();
					return ;
					
				}
				
			
		});
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// TODO: Implement this method
		getMenuInflater().inflate(R.menu.flyme_menu,menu);
		return super.onCreateOptionsMenu(menu);
	}

	

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch(item.getItemId()){
			case  R.id.kumpulan_flyme_00:
			startActivity(new Intent(this, FlymeUI00.class));
			return true;
			
			case R.id.kumpulan_flyme_01:
			// Comingsoon //
			Toast.makeText(getApplicationContext(),"Comingsoon",Toast.LENGTH_SHORT).show();
			return true;
			
			// Comingsoon //
			case R.id.kumpulan_flyme_02:
			Toast.makeText(getApplicationContext(),"Comingsoon",Toast.LENGTH_SHORT).show();
			return true;
			
			case R.id.kumpulan_flyme_03:
				Toast.makeText(getApplicationContext(),"Comingsoon",Toast.LENGTH_SHORT).show();
			return true;
			
			case R.id.kumpulan_flyme_04:
				Toast.makeText(getApplicationContext(),"Comingsoon",Toast.LENGTH_SHORT).show();
			return true;
			
			case R.id.kumpulan_flyme_05:
				Toast.makeText(getApplicationContext(),"Comingsoon",Toast.LENGTH_SHORT).show();
			return true;
			
			case R.id.exit_app:
			finishAndRemoveTask();
			return true;
			
			
		}
			
		
		return super.onOptionsItemSelected(item);
	}

	

	
	
	
	
}
