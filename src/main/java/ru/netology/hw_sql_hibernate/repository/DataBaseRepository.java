package ru.netology.hw_sql_hibernate.repository;

import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netology.hw_sql_hibernate.model.Person;

import java.util.List;
import java.util.Optional;

@Repository
public interface DataBaseRepository extends JpaRepository<Person, Long> {
    List<Person> findByCity(String city);
    List<Person> findByAgeLessThanOrderByAgeAsc(int age);
    Optional<Person> findByNameAndSurname(String name, String surname);
}
