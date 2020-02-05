CREAT TABLE Trip (
    id_Trip int unsignet primary key auto_increment,
    Hotel_fk int foreign key REFERENCE Hotel(id_Hotel),
    /*City_fk int foreign key REFERENCE City(id_City),
    Country_fk int foreign key REFERENCE Country(id_Country),*/
    Type varchar (15) not null,
    Price double not null,
    Airport_fk int foreign key REFERNCE Airports(id_Airport),
    Depart_Date varchar not null,
    Return_Date varchar not null,
    Places_Left int not null
    )