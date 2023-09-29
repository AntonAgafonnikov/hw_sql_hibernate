-- changeset agafonnikov:2

insert into PERSONS (name, surname, age, phone_number, city_of_living)
values
    ('Bob', 'Lame', 34, '+19877898888', 'BOSTON'),
    ('Denis', 'Kronov', 22, '+71345798854', 'MOSCOW'),
    ('Ivan', 'Dronov', 44, '+75654677742', 'MOSCOW'),
    ('Mike', 'Vane', 32, '+59999678666', 'LONDON'),
    ('Ron', 'Jole', 48, '+71345798854', 'MOSCOW'),
    ('Katar', 'Matar', 29, '+28767688868', 'ROME'),
    ('Grigoriy', 'Kinov', 19, '+71345798854', 'MOSCOW');

--rollback drop table PERSONS