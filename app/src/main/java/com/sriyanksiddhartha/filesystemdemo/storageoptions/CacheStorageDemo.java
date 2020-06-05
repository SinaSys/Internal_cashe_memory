package com.sriyanksiddhartha.filesystemdemo.storageoptions;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.sriyanksiddhartha.filesystemdemo.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CacheStorageDemo extends AppCompatActivity {

    private EditText etInternalCacheData;
    private TextView txvInternalCacheData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cache_storage);

        etInternalCacheData = (EditText) findViewById(R.id.etInternalCacheData);

        txvInternalCacheData = (TextView) findViewById(R.id.txvInternalCacheContent);
    }

    public void saveToInternalCache(View view) {

        String cacheData = etInternalCacheData.getText().toString();

        File cacheDir = getCacheDir();
        File myCacheFile = new File(cacheDir, "myInternalCacheFile.txt");

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(myCacheFile);
            fos.write(cacheData.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public void loadFromInternalCache(View view) {

        StringBuffer stringBuffer = new StringBuffer();

        File cacheDir = getCacheDir();
        File cacheFile = new File(cacheDir, "myInternalCacheFile.txt");

        FileInputStream fis = null;

        try {
            fis = new FileInputStream(cacheFile);

            int read;
            while ((read = fis.read()) != -1) {
                stringBuffer.append((char) read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        txvInternalCacheData.setText(stringBuffer);
    }

}
