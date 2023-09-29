package ru.netology.hw_sql_hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataBaseRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<String> getPersonsByCity(String city) {
        String hql = "select name from PERSONS where city_of_living = '" + city + "'";
        var query = entityManager.createNativeQuery(hql);
        return query.getResultList();
    }
}
