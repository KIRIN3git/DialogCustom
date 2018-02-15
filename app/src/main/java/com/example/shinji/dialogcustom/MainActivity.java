package com.example.shinji.dialogcustom;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		LayoutInflater inflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);
		View layout = inflater.inflate(R.layout.custom_dialog, (ViewGroup) findViewById(R.id.layout_root));

		android.app.AlertDialog.Builder dialog = new android.app.AlertDialog.Builder(this);
		TextView tv = new TextView(this);
		dialog.setView(tv);
		dialog.setTitle("title");
		dialog.setView(layout);

		((TextView) layout.findViewById(R.id.tv1)).setText("http://google.co.jp/");


		dialog.setCancelable(false);
		dialog.setPositiveButton(getString(R.string.app_name),
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int whichButton) {
					}
				});
		dialog.setNegativeButton(android.R.string.no,
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int whichButton) {
					}
				});
		dialog.create();
		dialog.show();
	}
}
