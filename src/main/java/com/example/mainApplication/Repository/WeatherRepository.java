package com.example.mainApplication.Repository;

import com.example.mainApplication.dto.Person;
import com.example.mainApplication.dto.Weather;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface WeatherRepository extends CrudRepository<Weather,Integer> {
}
