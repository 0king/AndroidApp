package g.m;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class PhotoActivity extends AppCompatActivity {

	//screen timer
	private static int TIME_OUT = 10000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_photo);

		//todo pre fetch data

		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				// This method will be executed once the timer is over
				Intent i = new Intent(PhotoActivity.this, QuestionsActivity.class);
				startActivity(i);

				//close this activity
				finish();
			}
		}, TIME_OUT);

	}
}
