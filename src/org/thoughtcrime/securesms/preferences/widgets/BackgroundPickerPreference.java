package org.thoughtcrime.securesms.preferences.widgets;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.DialogPreference;
import android.preference.PreferenceManager;
import android.util.AttributeSet;

import org.thoughtcrime.securesms.recipients.Recipient;

public class BackgroundPickerPreference extends DialogPreference {

    private Activity context;

    public BackgroundPickerPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = (Activity) context;
    }

    public BackgroundPickerPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = (Activity) context;
    }

    public void pickBackgroundFromGallery(){
        Intent pickPhoto = new Intent(Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        context.startActivityForResult(pickPhoto , 1);
    }

    public void pickBackgroundFromCamera(){

    }

    public void setChatBackground(Recipient recipient, int value){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this.getContext());
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(String.format("chat_background_%s%n", recipient.getProfileName()), value);
        editor.commit();
    }
}
