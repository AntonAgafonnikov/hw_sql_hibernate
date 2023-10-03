package ru.netology.hw_sql_hibernate.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.netology.hw_sql_hibernate.model.Person;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface DataBaseRepository extends CrudRepository<Person, Long> {

    @Query("select p from Person p where p.city = :city")
    List<Person> findByCity(@Param("city") String city);

    @Query("select p from Person p where p.age < :age order by p.age asc")
    List<Person> findByAgeLessThanOrderByAgeAsc(@Param("age") int age);

    @Query("select p from Person p where p.name = :name and p.surname = :surname")
    Optional<Person> findByNameAndSurname(@Param("name") String name,
                                          @Param("surname") String surname);
}
