package net.studymongolian.mongollibrarydemo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import net.studymongolian.mongollibrary.MongolToast;



public class MongolToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mongol_toast);
    }

    public void toastClick(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG);
        toast.show();
    }

    public void mongolToastClick(View view) {

        String text = "ᠰᠠᠢᠨ ᠪᠠᠢᠨ᠎ᠠ ᠤᠤ ︖";
        MongolToast mongolToast = MongolToast.makeText(getApplicationContext(), text, MongolToast.LENGTH_LONG);
        mongolToast.show();

        // or
        // MongolToast.makeText(getApplicationContext(), text, MongolToast.LENGTH_LONG).show();
    }

    public void mongolToastFromXmlClick(View view) {
        MongolToast.makeText(getApplicationContext(), R.string.xml_string, MongolToast.LENGTH_LONG).show();
    }
}
