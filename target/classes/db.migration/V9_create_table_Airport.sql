CREATE TABLE Airport(

    id_Airport int unsigned primary key auto_increment,
    Airport_Name varchar (50) not null,
    City_Airport_fk int foreigne key REFERENCE CityAirport(id_City_Airport)
)
