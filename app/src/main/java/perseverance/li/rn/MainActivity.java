package perseverance.li.rn;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.start_hw).setOnClickListener(this);
        findViewById(R.id.start_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this, RNActivity.class);
        if (id == R.id.start_hw) {
            intent.putExtra(RNActivity.JS_BUNDLE_NAME, "index_hello_world.bundle");
            intent.putExtra(RNActivity.JS_MODULE_NAME, "HelloWorld");
            startActivity(intent);
        } else if (id == R.id.start_button) {

        }
    }

}
