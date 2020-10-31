package id.putraprima.viewmodelpushupcouter.models;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import id.putraprima.viewmodelpushupcouter.BR;

public class PushupCount extends BaseObservable {
    private int count;

    public PushupCount(int count) {
        this.count = count;
    }

    @Bindable
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        notifyPropertyChanged(BR.count);
    }

    public void doPushup(){
        this.count = this.count+1;
        setCount(this.count);
    }

}
