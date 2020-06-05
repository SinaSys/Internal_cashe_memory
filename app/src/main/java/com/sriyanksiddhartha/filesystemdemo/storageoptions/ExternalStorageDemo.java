package com.sriyanksiddhartha.filesystemdemo.storageoptions;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.sriyanksiddhartha.filesystemdemo.R;

import java.io.File;


public class ExternalStorageDemo extends AppCompatActivity {

	private EditText etExternalPrivate, etExternalPublic;
	private TextView txvExternalPrivate, txvExternalPublic;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.external_storage);

		etExternalPrivate = (EditText) findViewById(R.id.etExternalPrivate);
		etExternalPublic = (EditText) findViewById(R.id.etExternalPublic);

		txvExternalPrivate = (TextView) findViewById(R.id.txvExternalPrivate);
		txvExternalPublic = (TextView) findViewById(R.id.txvExternalPublic);
	}

	public void saveToExternalPrivate(View view) {

	}

	public void saveToExternalPublic(View view) {

	}

	public void loadFromExternalPrivate(View view) {

	}

	public void loadFromExternalPublic(View view) {

	}

	private void writeData(File file, String cacheData) {

	}

	private String readData(File file) {

		return null;
	}
}
