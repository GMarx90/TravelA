CREATE TABLE Airport(

    id_Airport int unsigned primary key auto_increment,
    airport_Name varchar (50) not null,
    city_Airport_fk int foreigne key REFERENCE CityAirport(id_City_Airport)
)
