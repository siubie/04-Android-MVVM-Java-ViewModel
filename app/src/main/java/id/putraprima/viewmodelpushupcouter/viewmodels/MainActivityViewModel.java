package id.putraprima.viewmodelpushupcouter.viewmodels;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import id.putraprima.viewmodelpushupcouter.models.PushupCount;

public class MainActivityViewModel extends ViewModel {
    public int pushupCount = 0;

    public void doPushup(){
        this.pushupCount = this.pushupCount+1;
    }

    public int getPushup(){
        return this.pushupCount;
    }

}
