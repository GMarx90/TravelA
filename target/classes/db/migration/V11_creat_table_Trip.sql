CREAT TABLE Trip (
    id_Trip int unsignet primary key auto_increment,
    hotel_fk int foreign key REFERENCE Hotel(id_Hotel),
    /*City_fk int foreign key REFERENCE City(id_City),
    Country_fk int foreign key REFERENCE Country(id_Country),*/
    Type varchar (15) not null,
    price double not null,
    airport_fk int foreign key REFERNCE Airports(id_Airport),
    depart_Date date not null,
    return_Date date not null,
    places_Left int not null
    )