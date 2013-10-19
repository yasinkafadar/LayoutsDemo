package tr.com.turkcellteknoloji.demo.layoutsdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button showLinearLayoutDemo = (Button) (findViewById(R.id.btn_show_linear_layouts));
		showLinearLayoutDemo.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, LinearLayoutDemoActivity.class));
			}
		});
		
		Button showRelativeLayoutDemo = (Button) (findViewById(R.id.btn_show_relative_layouts));
		showRelativeLayoutDemo.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, RelativeLayoutDemoActivity.class));
			}
		});
	}

}
