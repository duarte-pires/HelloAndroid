import android.app.Activity;
import android.os.Bundle;

import pt.ipp.estg.first.helloandroid.R;

public class HelloAndroidActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_android);
    }
}
