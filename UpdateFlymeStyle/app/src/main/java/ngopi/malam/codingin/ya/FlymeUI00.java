package ngopi.malam.codingin.ya;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;

public class FlymeUI00 extends Activity
{
	// Fixing Onclick ImageView
	ImageView btn_exit0;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kumpulan_flyme_00);
		
		btn_exit0 = (ImageView)findViewById(R.id.button_exit);
		btn_exit0.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					finishAndRemoveTask();
				}
				
			
		});
	}
	
	
	
}
