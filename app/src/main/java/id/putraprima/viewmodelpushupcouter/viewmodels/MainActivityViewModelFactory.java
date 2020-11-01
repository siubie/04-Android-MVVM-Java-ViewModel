package id.putraprima.viewmodelpushupcouter.viewmodels;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import id.putraprima.viewmodelpushupcouter.models.PushupCount;

public class MainActivityViewModelFactory implements ViewModelProvider.Factory {
    private PushupCount pushupCount;

    public MainActivityViewModelFactory(PushupCount pushupCount) {
        this.pushupCount = pushupCount;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(MainActivityViewModel.class)){
            return (T) new MainActivityViewModel(pushupCount);
        }
        throw new IllegalArgumentException("Viewmodel Yang Diminta MainActivityViewModel");
    }
}
