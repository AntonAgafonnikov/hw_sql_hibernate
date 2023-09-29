package ru.netology.hw_sql_hibernate.service;

import org.springframework.stereotype.Service;
import ru.netology.hw_sql_hibernate.repository.DataBaseRepository;

import java.util.List;

@Service
public class DataBaseService {
    DataBaseRepository dataBaseRepository;

    public DataBaseService(DataBaseRepository dataBaseRepository) {
        this.dataBaseRepository = dataBaseRepository;
    }

    public List<String> getPersonsByCity(String city) {
        return dataBaseRepository.getPersonsByCity(city);
    }
}
