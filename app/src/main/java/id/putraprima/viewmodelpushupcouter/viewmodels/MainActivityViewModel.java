package id.putraprima.viewmodelpushupcouter.viewmodels;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import id.putraprima.viewmodelpushupcouter.models.PushupCount;

public class MainActivityViewModel extends ViewModel {
    public MutableLiveData<PushupCount> pushupCountMutableLiveData = new MutableLiveData<>();
    public PushupCount pushupCount;

    public MainActivityViewModel(PushupCount pushupCount) {
        this.pushupCount = pushupCount;
        this.pushupCountMutableLiveData.setValue(pushupCount);
    }

    public void doPushup(){
        this.pushupCount.setCount(this.pushupCount.getCount()+1);
        this.pushupCountMutableLiveData.setValue(pushupCount);
    }
}
