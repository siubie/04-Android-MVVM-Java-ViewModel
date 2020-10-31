package id.putraprima.viewmodelpushupcouter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import id.putraprima.viewmodelpushupcouter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private int pushupCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.txtPushupCount.setText("0");
        binding.btnPushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pushupCount++;
                binding.txtPushupCount.setText(Integer.toString(pushupCount));
            }
        });
    }
}