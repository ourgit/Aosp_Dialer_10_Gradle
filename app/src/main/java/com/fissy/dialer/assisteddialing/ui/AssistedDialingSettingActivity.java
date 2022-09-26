/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fissy.dialer.assisteddialing.ui;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.fissy.dialer.R;
import com.fissy.dialer.app.settings.ThemeOptionsSettingsFragment;
import com.fissy.dialer.main.impl.MainActivity;

/**
 * The Settings Activity for Assisted Dialing.
 */
public class AssistedDialingSettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        ThemeOptionsSettingsFragment.ThemeButtonBehavior mThemeBehavior = ThemeOptionsSettingsFragment.getThemeButtonBehavior(MainActivity.themeprefs);

        if (mThemeBehavior == ThemeOptionsSettingsFragment.ThemeButtonBehavior.DARK) {
            getTheme().applyStyle(R.style.DialerDark, true);
        }
        if (mThemeBehavior == ThemeOptionsSettingsFragment.ThemeButtonBehavior.LIGHT) {
            getTheme().applyStyle(R.style.DialerLight, true);
        }
        super.onCreate(bundle);

        getFragmentManager()
                .beginTransaction()
                .replace(android.R.id.content, new AssistedDialingSettingFragment())
                .commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
