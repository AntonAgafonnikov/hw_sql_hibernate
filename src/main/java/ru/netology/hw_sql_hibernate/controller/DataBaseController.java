package ru.netology.hw_sql_hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hw_sql_hibernate.model.Person;
import ru.netology.hw_sql_hibernate.service.DataBaseService;

import java.util.List;
import java.util.Optional;

@RestController
public class DataBaseController {
    DataBaseService dataBaseService;

    public DataBaseController(DataBaseService dataBaseService) {
        this.dataBaseService = dataBaseService;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        return dataBaseService.getPersonsByCity(city);
    }

    @GetMapping("/persons/by-age")
    public List<Person> getPersonsByAge(@RequestParam("age") int age) {
        return dataBaseService.getPersonsByAge(age);
    }

    @GetMapping("/persons/by-name-and-surname")
    public Optional<Person> getPersonsByNameAndSurname(@RequestParam("name") String name,
                                                   @RequestParam("surname") String surname) {
        return dataBaseService.getPersonsByNameAndSurname(name, surname);
    }
}
