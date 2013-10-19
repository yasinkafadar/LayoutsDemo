package tr.com.turkcellteknoloji.demo.layoutsdemo;

import android.app.Activity;
import android.os.Bundle;

public class RelativeLayoutExampleActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		int exampleId = getIntent().getIntExtra("exampleId", 0);
		
		switch (exampleId) {
		case RelativeLayoutDemoActivity.POSITIONS_BY_GIVEN_ID_1:
			setContentView(R.layout.activity_relative_layout_positions_1);
			break;
		case RelativeLayoutDemoActivity.POSITIONS_BY_GIVEN_ID_2:
			setContentView(R.layout.activity_relative_layout_positions_2);
			break;
		case RelativeLayoutDemoActivity.POSITIONS_BY_PARENT:
			setContentView(R.layout.activity_relative_layout_positions_parent);
			break;
		case RelativeLayoutDemoActivity.COMPLEX_EXAMPLE:
			setContentView(R.layout.activity_relative_layout_complex);
			break;

		default:
			break;
		}
	}
}
