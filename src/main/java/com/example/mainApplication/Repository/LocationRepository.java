package com.example.mainApplication.Repository;

import com.example.mainApplication.dto.Location;
import com.example.mainApplication.dto.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LocationRepository extends CrudRepository<Location,Integer> {
}
