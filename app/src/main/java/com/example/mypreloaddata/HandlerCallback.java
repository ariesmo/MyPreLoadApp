package com.example.mypreloaddata;

interface HandlerCallback {
    void preparation();
    void updateProgress(long progress);
    void loadSuccess();
    void loadFailed();
    void loadCancel();
}
