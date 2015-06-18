package com.github.androidatelier.lunchin.receiver;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.github.androidatelier.lunchin.LunchOutDetectionReceiver;
import com.github.androidatelier.lunchin.notification.NotificationUtil;

/**
 * Created by Kelly Shuster on 6/17/15.
 */
public class LunchOutUiReceiver extends LunchOutDetectionReceiver {
    private Context mContext;

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("KIO", "app: onRecieve");
        mContext = context;
        super.onReceive(context,intent);
    }

    @Override
    public void onPossibleLunchOut() {
        Log.d("KIO", "app: sendNotification");
        NotificationUtil.showLunchOutNotification(mContext, LunchOutUiReceiver.class);
    }
}