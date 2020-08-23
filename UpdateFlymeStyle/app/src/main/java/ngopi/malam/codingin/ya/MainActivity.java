package ngopi.malam.codingin.ya;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.PopupMenu.*;
import android.content.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
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
			
			case R.id.exit_app:
			finishAndRemoveTask();
			return true;
				
		}
			
		
		return super.onOptionsItemSelected(item);
	}

	

	
	
	
	
}
