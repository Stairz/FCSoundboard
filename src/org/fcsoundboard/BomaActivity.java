package org.fcsoundboard;

import org.sound.Sound;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class BomaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_boma);

        final Button buttonHello = (Button) findViewById(R.id.button_hello);
        final Button buttonCrack = (Button) findViewById(R.id.button_crack);
        
        buttonHello.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Sound.playSound(BomaActivity.this, R.raw.boma_hallo);
            }
        });
        
        buttonCrack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Sound.playSound(BomaActivity.this, R.raw.boma_crack);
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
