package kodlama.io.hibernateAndJpa.Business;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import kodlama.io.hibernateAndJpa.DataAccess.ICityDal;
import kodlama.io.hibernateAndJpa.Entities.City;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class CityManager implements ICityService {
    private ICityDal cityDal;

    @Autowired
    public CityManager(ICityDal cityDal) {
        this.cityDal = cityDal;
    }

    @Override
    @Transactional
    public List<City> getAll() {
        return this.cityDal.getAll();
    }

    @Override
    @Transactional
    @PostMapping("/add")
    public void add(City city) {
        //Business
        this.cityDal.add(city);
    }

    @Override
    @Transactional
    public void update(City city) {
        //Business
        this.cityDal.update(city);
    }

    @Override
    @Transactional
    public void delete(City city) {
        //Business
        this.cityDal.delete(city);

    }

    @Override
    @Transactional
    public City getById(int id) {
        //Business
        return cityDal.getById(id);
    }
}
