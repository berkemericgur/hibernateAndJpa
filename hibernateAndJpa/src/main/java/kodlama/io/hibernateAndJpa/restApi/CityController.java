package kodlama.io.hibernateAndJpa.restApi;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import kodlama.io.hibernateAndJpa.Business.CityManager;
import kodlama.io.hibernateAndJpa.Business.ICityService;
import kodlama.io.hibernateAndJpa.Entities.City;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CityController {
    private ICityService cityService;
    private EntityManager entityManager;

    @Autowired
    public CityController(ICityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/cities")
    public List<City> get() {
        return cityService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody City city) {
        cityService.add(city);
    }

    @PostMapping("/update")
    public void update(@RequestBody City city){
        cityService.update(city);
    }
    @PostMapping("/delete")
    public void delete(@RequestBody City city){
        cityService.delete(city);
    }
    @GetMapping("/cities/{id}")
    public City getById(@PathVariable int id){
        return cityService.getById(id);
    }
}
