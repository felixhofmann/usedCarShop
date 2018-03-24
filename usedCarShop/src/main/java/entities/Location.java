package entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String locationName;
    private String locationNickName;

    public Location() {
    }

    public Location(String locationName, String locationNickName) {
        this.locationName = locationName;
        this.locationNickName = locationNickName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationNickName() {
        return locationNickName;
    }

    public void setLocationNickName(String locationNickName) {
        this.locationNickName = locationNickName;
    }
}
