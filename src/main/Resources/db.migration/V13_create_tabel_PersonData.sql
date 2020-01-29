CREATE TABLE PersonData (
    id_person int unsigned PRIMARY KEY auto_increment,
    Name varchar (15) not null,
    Surname varchar (25) not null,
    Age int not null,
    e_mail_adress varchar(25) not null,
    Numb_telephone Int not null,
    Trip_fk int foreign key REFERANCE Trip(id_Trip)

    )