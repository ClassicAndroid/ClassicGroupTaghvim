package com.classicgroup1400.taghvimfarsi;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;

import com.classicgroup1400.taghvimfarsi.util.UpdateUtils;
import com.classicgroup1400.taghvimfarsi.util.Utils;

public class Widget2x2 extends AppWidgetProvider {
    @Override
    public void onReceive(Context context, Intent intent) {
        Utils.startEitherServiceOrWorker(context);
        UpdateUtils.update(context, false);
    }
}
