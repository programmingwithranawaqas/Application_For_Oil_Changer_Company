package com.example.v2_quiz_1;

import android.app.Application;

import java.util.ArrayList;

public class WorkerData extends Application {
    public static ArrayList<Worker> data;

    public static String getWorkerName(int index) {
        return data.get(index).getWorkerName();
    }

    public static boolean addWorker(Worker w)
    {
        data.add(w);
        return true;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        data = new ArrayList<>();
    }

    public static int existDriver(long id, long pin)
    {
        for(int i=0; i<data.size(); i++)
        {
            if(id == data.get(i).getId() && pin == data.get(i).getPin())
                return i;
        }
        return -1;
    }
}
