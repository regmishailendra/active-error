package b.com.active_android_try_3;


import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "coordinate")
public class Coordinate extends Model{


    @Column(name = "location_latitude") public double latitude;
    @Column(name = "location_longitude") public double longitude;


}
