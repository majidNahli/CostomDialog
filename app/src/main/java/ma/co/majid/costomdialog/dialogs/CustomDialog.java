package ma.co.majid.costomdialog.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import ma.co.majid.costomdialog.R;

/**
 * Created by Majid on 20/02/2017.
 */

public class CustomDialog extends Dialog implements View.OnClickListener{

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_custom);


        ((TextView) findViewById(R.id.txt_cancel)).setOnClickListener(this);
    }

    public CustomDialog(Context context) {
        super(context);
        this.context = context;
        show();
    }

    public CustomDialog(Context context, int themeResId) {
        super(context, themeResId);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.txt_cancel : this.dismiss();break;
            default: break;
        }
    }
}
