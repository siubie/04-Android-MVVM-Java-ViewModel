package id.putraprima.viewmodelpushupcouter.models;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import id.putraprima.viewmodelpushupcouter.BR;

public class PushupCount {
    private int count;

    public PushupCount() {
    }

    public PushupCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}
