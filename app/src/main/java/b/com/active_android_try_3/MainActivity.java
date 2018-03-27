package b.com.active_android_try_3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.activeandroid.ActiveAndroid;

public class MainActivity extends AppCompatActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

        ActiveAndroid.initialize(this);


        Location location = new Location();
        location.name="pokhara";
        location.description="cherapunji";

        Coordinate coordinate= new Coordinate();
        location.coordinate=coordinate;
        location.coordinate.latitude=80.12;
        location.coordinate.longitude=80.21;


        location.save();
        location.coordinate.save();




}

}
