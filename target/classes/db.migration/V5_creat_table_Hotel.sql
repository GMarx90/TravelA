CREATE TABLE Hotel(

    id_Hotel int unsignet primary key auto_increment,
    Hotel_Name varchar (50) not null,
    Standard int (5) not null,
    Description varchar (500) not null
    City_fk int foreign key REFERENCE City(id_City),

    )