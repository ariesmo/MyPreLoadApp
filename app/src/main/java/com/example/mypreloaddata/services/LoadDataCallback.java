package com.example.mypreloaddata.services;

interface LoadDataCallback {
    void onPreLoad();
    void onProgressUpdate(long progress);
    void onLoadSuccess();
    void onLoadFailed();
    void onLoadCancel();
}
