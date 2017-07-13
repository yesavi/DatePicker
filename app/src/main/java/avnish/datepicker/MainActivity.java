package avnish.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker=(DatePicker) findViewById(R.id.datePicker);
        Calendar calendar=Calendar.getInstance();
        datePicker.init(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),new DatePicker.OnDateChangedListener(){
                    @Override
                    public  void  onDateChanged(DatePicker datePicker,int i, int i1,int i2){
                        Toast.makeText(getApplicationContext(),datePicker.getDayOfMonth()+
                                "-"+datePicker.getMonth()+"-"+datePicker.getYear(),Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
