CREATE TABLE PersonData (
    id_person int unsigned PRIMARY KEY auto_increment,
    nname varchar (15) not null,
    surname varchar (25) not null,
    age int not null,
    e_mail_adress varchar(25) not null,
    numb_telephone Int not null,
    trip_fk int foreign key REFERANCE Trip(id_Trip)

    )