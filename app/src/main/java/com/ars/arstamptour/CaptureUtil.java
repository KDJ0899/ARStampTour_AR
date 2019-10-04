package com.ars.arstamptour;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Environment;
import android.util.Log;
import android.view.View;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CaptureUtil {
    private static final String CAPTURE_PATH = "/CAPTURE_TEST";

    /**
     * 액티비티 전체 캡쳐
     * @param context
     */
    public static void captureActivity(Activity context) {
        Log.d("test", "inCaptureActivity");
        if (context == null) {
            Log.d("test", "return");
            return;
        }
        View root = context.getWindow().getDecorView().getRootView();
        root.setDrawingCacheEnabled(true);
        root.buildDrawingCache();
// 루트뷰의 캐시를 가져옴

        Bitmap screenshot = root.getDrawingCache();

// get view coordinates
        int[] location = new int[2];
        root.getLocationInWindow(location);

// 이미지를 자를 수 있으나 전체 화면을 캡쳐 하도록 함
        Bitmap bmp = Bitmap.createBitmap(screenshot, location[0], location[1], root.getWidth(), root.getHeight(), null, false);
        String strFolderPath = Environment.getExternalStorageDirectory().getAbsolutePath() + CAPTURE_PATH;
        File folder = new File(strFolderPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        String strFilePath = strFolderPath + "/" + System.currentTimeMillis() + ".jpg";
        File fileCacheItem = new File(strFilePath);
        OutputStream out = null;
        try {
            fileCacheItem.createNewFile();
            out = new FileOutputStream(fileCacheItem);
            bmp.compress(Bitmap.CompressFormat.JPEG, 100, out);

            Log.d("test", "Successs");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

