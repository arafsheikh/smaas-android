package com.smaas.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class ProcessDataService extends Service {
    public ProcessDataService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
