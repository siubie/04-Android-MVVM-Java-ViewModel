package id.putraprima.viewmodelpushupcouter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import id.putraprima.viewmodelpushupcouter.databinding.ActivityMainBinding;
import id.putraprima.viewmodelpushupcouter.models.PushupCount;
import id.putraprima.viewmodelpushupcouter.viewmodels.MainActivityViewModel;
import id.putraprima.viewmodelpushupcouter.viewmodels.MainActivityViewModelFactory;

public class MainActivity extends AppCompatActivity {

    private MainActivityViewModel mainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityViewModelFactory mainActivityViewModelFactory = new MainActivityViewModelFactory(new PushupCount(10));
        mainActivityViewModel = new ViewModelProvider(this, mainActivityViewModelFactory).get(MainActivityViewModel.class);
        binding.setViewModel(mainActivityViewModel);
        binding.setLifecycleOwner(this);
    }
}