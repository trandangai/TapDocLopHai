package com.khtn.tapdoclophai.utility;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

/**
 * Created by Sayuri Kurata on 2016/08/12.
 */
public class ImageLoader {

    public static Bitmap load(String base64Encoded) {
        base64Encoded = base64Encoded.replace("data:image/png;base64,", "");
        byte[] decodedString = Base64.decode(base64Encoded, Base64.DEFAULT);
        Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);

        return decodedByte;
    }
}
