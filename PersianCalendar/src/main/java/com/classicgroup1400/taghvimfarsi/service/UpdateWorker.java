//package com.classicgroup1400.taghvimfarsi.service;
//
//import com.classicgroup1400.taghvimfarsi.util.UpdateUtils;
//import com.classicgroup1400.taghvimfarsi.util.Utils;
//
//import androidx.work.Worker;
//
//public class UpdateWorker extends Worker {
//    @Override
//    public Worker.Result doWork() {
//        Utils.setChangeDateWorker();
//        Utils.updateStoredPreference(getApplicationContext());
//        UpdateUtils.update(getApplicationContext(), true);
//        return Result.SUCCESS;
//    }
//}