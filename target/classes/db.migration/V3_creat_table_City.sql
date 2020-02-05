   CREATE TABLE City(

    id_City int unsigned primary key auto_increment,
    City_Name varchar (50) not null,
    Country_fk int foreign key REFERENCE Country(id_Country)

        )