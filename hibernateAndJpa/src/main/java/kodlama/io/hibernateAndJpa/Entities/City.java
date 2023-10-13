package kodlama.io.hibernateAndJpa.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GeneratedValue- ID primary key
                                                        // GenerationType.IDENTITY - ID autoincrement
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "CountryCode")
    private String countryCode;
    @Column(name = "District")
    private String district;
    @Column(name = "Info")
    @JsonProperty("Info")
    private String info;

    @Autowired
    public City(int id, String name, String countryCode, String district, String info) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.info = info;
    }

    public City() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
