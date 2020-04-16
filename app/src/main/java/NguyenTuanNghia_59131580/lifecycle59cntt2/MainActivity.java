package NguyenTuanNghia_59131580.lifecycle59cntt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView txtTG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Life Cycle","OnCreate called!");
        txtTG = findViewById(R.id.textTG);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life Cycle","OnStart called!");
        SimpleDateFormat spDF = new SimpleDateFormat("HH:mm:ss");
        String strDate = spDF.format(new Date());
        txtTG.setText(strDate);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life Cycle","OnResume called!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life Cycle","OnStop called!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life Cycle","OnRestart called!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life Cycle","OnDestroy called!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life Cycle","OnPause called!");

    }
}
