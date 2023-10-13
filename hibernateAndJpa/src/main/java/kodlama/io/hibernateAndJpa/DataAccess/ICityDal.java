package kodlama.io.hibernateAndJpa.DataAccess;

import kodlama.io.hibernateAndJpa.Entities.City;

import java.util.List;

public interface ICityDal {
    List<City> getAll();
    City getById(int id);
    void add(City city);
    void update(City city);
    void delete(City city);
}
