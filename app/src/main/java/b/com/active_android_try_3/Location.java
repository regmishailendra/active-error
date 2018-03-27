package b.com.active_android_try_3;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Locations")
public class Location extends Model{


@Column(name = "location_name")
public String name;
    @Column(name = "location_description")
    public String description;
    @Column(name = "coordinate")
    public Coordinate coordinate;




}
