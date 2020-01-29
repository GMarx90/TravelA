   CREATE TABLE City(

    id_City int unsigned primary key auto_increment,
    city_Name varchar (50) not null,
    country_fk int foreign key REFERENCE Country(id_Country)

        )