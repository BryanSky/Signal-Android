package org.thoughtcrime.securesms.preferences.widgets;

import android.os.Bundle;
import android.support.v7.preference.PreferenceDialogFragmentCompat;

public class BackgroundPickerPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    public static BackgroundPickerPreferenceDialogFragmentCompat newInstance(String key) {
        BackgroundPickerPreferenceDialogFragmentCompat fragment = new BackgroundPickerPreferenceDialogFragmentCompat();
        Bundle b = new Bundle(1);
        b.putString(PreferenceDialogFragmentCompat.ARG_KEY, key);
        fragment.setArguments(b);
        return fragment;
    }

    @Override
    public void onDialogClosed(boolean b) {

    }
}
