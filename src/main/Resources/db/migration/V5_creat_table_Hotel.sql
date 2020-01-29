CREATE TABLE Hotel(

    id_Hotel int unsignet primary key auto_increment,
    hotel_Name varchar (50) not null,
    standard int (5) not null,
    description varchar (500) not null
    city_fk int foreign key REFERENCE City(id_City),

    )