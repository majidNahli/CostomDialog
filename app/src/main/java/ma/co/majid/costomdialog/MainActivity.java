package ma.co.majid.costomdialog;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import ma.co.majid.costomdialog.dialogs.CustomDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        ((TextView) findViewById(R.id.txt_show)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.txt_show : new CustomDialog(mContext);break;
            default: break;
        }
    }
}
