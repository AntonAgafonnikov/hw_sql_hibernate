package ru.netology.hw_sql_hibernate.service;

import org.springframework.stereotype.Service;
import ru.netology.hw_sql_hibernate.model.Person;
import ru.netology.hw_sql_hibernate.repository.DataBaseRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class DataBaseService {
    DataBaseRepository dataBaseRepository;

    public DataBaseService(DataBaseRepository dataBaseRepository) {
        this.dataBaseRepository = dataBaseRepository;
    }

    public List<Person> getPersonsByCity(String city) {
       return dataBaseRepository.findByCity(city);
    }

    public List<Person> getPersonsByAge(int age) {
        return dataBaseRepository.findByAgeLessThanOrderByAgeAsc(age);
    }
    public Optional<Person> getPersonsByNameAndSurname(String name, String surname) {
        return dataBaseRepository.findByNameAndSurname(name, surname);
    }
}
