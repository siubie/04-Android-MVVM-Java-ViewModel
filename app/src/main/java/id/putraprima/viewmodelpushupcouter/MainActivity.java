package id.putraprima.viewmodelpushupcouter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import id.putraprima.viewmodelpushupcouter.databinding.ActivityMainBinding;
import id.putraprima.viewmodelpushupcouter.models.PushupCount;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        PushupCount pushupCount = new PushupCount(0);
        binding.setPushupCount(pushupCount);
        binding.setLifecycleOwner(this);
    }
}