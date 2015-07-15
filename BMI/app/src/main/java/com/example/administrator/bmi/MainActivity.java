package com.example.administrator.bmi;




import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    EditText editText;
    EditText editText2;
    TextView text_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        editText=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);
        text_result=(TextView)findViewById(R.id.text_result);
        findViewById(R.id.btn_calculation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shengao=editText.getText().toString();
                String tizhong=editText2.getText().toString();
                if(shengao.length()>0&&tizhong.length()>0){
                    double sg= Double.valueOf(shengao);
                    double tz= Double.valueOf(tizhong);
                    text_result.setText("BMI="+tz/(sg*sg)+"");
                }else{
                    text_result.setText(getResources().getString(R.string.textstr));
                }
            }

        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.my, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_about) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
