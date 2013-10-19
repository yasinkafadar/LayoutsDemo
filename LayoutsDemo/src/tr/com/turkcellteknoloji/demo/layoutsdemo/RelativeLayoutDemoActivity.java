package tr.com.turkcellteknoloji.demo.layoutsdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RelativeLayoutDemoActivity extends Activity {

	public static final int POSITIONS_BY_GIVEN_ID_1 = 0;
	public static final int POSITIONS_BY_GIVEN_ID_2 = 1;
	public static final int POSITIONS_BY_PARENT = 2;
	public static final int COMPLEX_EXAMPLE = 3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_relative_layout_demo);
		
		Button showPositionsByGivenId1 = (Button) findViewById(R.id.btn_show_position1_example);
		showPositionsByGivenId1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				showExample(POSITIONS_BY_GIVEN_ID_1);
			}
		});
		
		Button showPositionsByGivenId2 = (Button) findViewById(R.id.btn_show_position2_example);
		showPositionsByGivenId2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				showExample(POSITIONS_BY_GIVEN_ID_2);
			}
		});
		
		Button showPositionsByParent = (Button) findViewById(R.id.btn_show_parent_example);
		showPositionsByParent.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				showExample(POSITIONS_BY_PARENT);
			}
		});
		
		Button showHorizantalExample = (Button) findViewById(R.id.btn_show_complex_example);
		showHorizantalExample.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				showExample(COMPLEX_EXAMPLE);
			}
		});
	}
	
	private void showExample(int exampleId) {
		Intent intent = new Intent(RelativeLayoutDemoActivity.this, RelativeLayoutExampleActivity.class);
		intent.putExtra("exampleId", exampleId);
		startActivity(intent);
	}
}
