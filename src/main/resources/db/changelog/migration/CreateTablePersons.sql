-- changeset agafonnikov:1

create table PERSONS (
                         name text,
                         surname text,
                         age integer,
                         phone_number text,
                         city_of_living text,
                         primary KEY (name, surname, age));
--rollback drop table PERSONS