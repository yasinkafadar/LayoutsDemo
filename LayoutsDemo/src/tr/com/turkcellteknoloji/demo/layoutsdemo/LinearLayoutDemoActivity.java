package tr.com.turkcellteknoloji.demo.layoutsdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LinearLayoutDemoActivity extends Activity {

	public static final int HORIZANTAL_EXAMPLE = 0;
	public static final int VERTICAL_EXAMPLE = 1;
	public static final int WEIGHT_EXAMPLE = 2;
	public static final int GRAVITY_EXAMPLE = 3;
	public static final int COMPLEX_EXAMPLE = 4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_linear_layout_demo);

		Button showHorizantalExample = (Button) findViewById(R.id.btn_show_horizantal_example);
		showHorizantalExample.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				showExample(HORIZANTAL_EXAMPLE);
			}
		});

		Button showVerticalExample = (Button) findViewById(R.id.btn_show_vertical_example);
		showVerticalExample.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				showExample(VERTICAL_EXAMPLE);
			}
		});

		Button showWeightExample = (Button) findViewById(R.id.btn_show_weight_example);
		showWeightExample.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				showExample(WEIGHT_EXAMPLE);
			}
		});

		Button showGravityExample = (Button) findViewById(R.id.btn_show_gravity_example);
		showGravityExample.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				showExample(GRAVITY_EXAMPLE);
			}
		});

		Button showComplexExample = (Button) findViewById(R.id.btn_show_complex_example);
		showComplexExample.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				showExample(COMPLEX_EXAMPLE);
			}
		});
	}

	private void showExample(int exampleId) {
		Intent intent = new Intent(LinearLayoutDemoActivity.this,
				LinearLayoutExampleActivity.class);
		intent.putExtra("exampleId", exampleId);
		startActivity(intent);
	}
}
