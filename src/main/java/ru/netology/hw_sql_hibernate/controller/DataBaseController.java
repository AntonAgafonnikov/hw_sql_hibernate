package ru.netology.hw_sql_hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hw_sql_hibernate.service.DataBaseService;

import java.util.List;

@RestController
public class DataBaseController {
    DataBaseService dataBaseService;

    public DataBaseController(DataBaseService dataBaseService) {
        this.dataBaseService = dataBaseService;
    }

    @GetMapping("/persons/by-city")
    public List<String> getPersonsByCity(@RequestParam("city") String city) {
        return dataBaseService.getPersonsByCity(city);
    }
}
