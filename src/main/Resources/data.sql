
INSERT INTO Country (country_Name) values ('Hiszpania');
INSERT INTO Country (country_Name) values ('Grecja');
INSERT INTO Country (country_Name) values ('Francja');
INSERT INTO Country (country_Name) values ('Chorwacja');
INSERT INTO Country (country_Name) values ('Portugalia');
INSERT INTO Country (country_Name) values ('Włochy');
INSERT INTO Country (country_Name) values ('Egipt');
INSERT INTO Country (country_Name) values ('Kuba');
INSERT INTO Country (country_Name) values ('Tajlandia');
INSERT INTO Country (country_Name) values ('Brazylia');
INSERT INTO Country (country_Name) values ('Turcja');
INSERT INTO Country (country_Name) values ('Tunezja');

INSERT INTO City (city_Name, country_fk) values ('Barcelona', 1);
INSERT INTO City (city_Name, country_fk) values ('Valencia', 1);
INSERT INTO City (city_Name, country_fk) values ('Malaga', 1);
INSERT INTO City (city_Name, country_fk) values ('Ibiza', 1);
INSERT INTO City (city_Name, country_fk) values ('Saloniki', 2);
INSERT INTO City (city_Name, country_fk) values ('Platamonas', 2);
INSERT INTO City (city_Name, country_fk) values ('Santorini', 2);
INSERT INTO City (city_Name, country_fk) values ('Nicea', 3);
INSERT INTO City (city_Name, country_fk) values ('Saint Tropez', 3);
INSERT INTO City (city_Name, country_fk) values ('Paryż', 3);
INSERT INTO City (city_Name, country_fk) values ('Cannes', 3);
INSERT INTO City (city_Name, country_fk) values ('Dubrownik', 4);
INSERT INTO City (city_Name, country_fk) values ('Split', 4);
INSERT INTO City (city_Name, country_fk) values ('Marina', 4);
INSERT INTO City (city_Name, country_fk) values ('Pula', 4);
INSERT INTO City (city_Name, country_fk) values ('Lizbona', 5);
INSERT INTO City (city_Name, country_fk) values ('Porto', 5);
INSERT INTO City (city_Name, country_fk) values ('Faro', 5);
INSERT INTO City (city_Name, country_fk) values ('Fatima', 5);
INSERT INTO City (city_Name, country_fk) values ('Rzym', 6);
INSERT INTO City (city_Name, country_fk) values ('Wenecja', 6);
INSERT INTO City (city_Name, country_fk) values ('Bari', 6);
INSERT INTO City (city_Name, country_fk) values ('Palermo', 6);
INSERT INTO City (city_Name, country_fk) values ('Hurgada', 7);
INSERT INTO City (city_Name, country_fk) values ('Taba', 7);
INSERT INTO City (city_Name, country_fk) values ('Marsa Alam', 7);
INSERT INTO City (city_Name, country_fk) values ('Izmir', 8);
INSERT INTO City (city_Name, country_fk) values ('Hawana', 10);
INSERT INTO City (city_Name, country_fk) values ('Antalya', 8);
INSERT INTO City (city_Name, country_fk) values ('Pattaya', 11);
INSERT INTO City (city_Name, country_fk) values ('Tunis', 9);
INSERT INTO City (city_Name, country_fk) values ('Rio de Janeiro', 12);


INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Catalonia Atenas', 4.8 ,'AllInclusive', 'tu wpisać opis', 1);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Ilunion Aqua 3', 4.8 ,'    B&B     ', 'tu wpisać opis', 2);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Hotel Sur Malaga', 4.9 ,'AllInclusive', 'tu wpisać opis', 3);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Hotel Cartago', 4.9 ,'AllInclusive', 'tu wpisać opis', 4);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Hotel El Greco', 4.6 ,'AllInclusive', 'tu wpisać opis', 5);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Porto Marine Hotel', 4.9 ,'AllInclusive', 'tu wpisać opis', 6);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Phoenix', 4.8 ,'AllInclusive', 'tu wpisać opis', 7);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Hotel Apogia Nice', 4.8 ,'    B&B     ', 'tu wpisać opis', 8);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('La Bastide Du Port', 4.7 ,'AllInclusive', 'tu wpisać opis', 9);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Hotel De Reims', 4.8 ,'AllInclusive', 'tu wpisać opis', 10);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('L Esterel', 4.6 ,'AllInclusive', 'tu wpisać opis', 11);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Hotel Adria', 4.9 ,'AllInclusive', 'tu wpisać opis', 12);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Apartment Bart', 4.8 ,'AllInclusive', 'tu wpisać opis', 13);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Villa Drago', 4.6 ,'AllInclusive', 'tu wpisać opis', 14);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Resort del Mar', 4.7 ,'AllInclusive', 'tu wpisać opis', 15);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Costa do Castelo', 4.5 ,'AllInclusive', 'tu wpisać opis', 16);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Vincci Porto', 4.9 ,'AllInclusive', 'tu wpisać opis', 17);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Eva Senses Hotel', 4.8 ,'AllInclusive', 'tu wpisać opis', 18);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Ribeiro Hotel', 4.6 ,'AllInclusive', 'tu wpisać opis', 19);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Vatican Walls Rooms', 4.8 ,'AllInclusive', 'tu wpisać opis', 20);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Hotel Palazzo Vitturi', 4.6 ,'AllInclusive', 'tu wpisać opis', 21);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Barion Hotel & Congressi', 4.9 ,'AllInclusive', 'tu wpisać opis', 22);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Astoria Palace Hotel', 4.9 ,'AllInclusive', 'tu wpisać opis', 23);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Sunrise Aqua Joy Hotel', 4.8 ,'AllInclusive', 'tu wpisać opis', 24);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('The Bayview Taba Heights Resort', 4.9 ,'AllInclusive', 'tu wpisać opis', 25);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Jaz Grand Marsa', 4.8 ,'     B&B    ', 'tu wpisać opis', 26);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Hilton Izmir ', 4.7 ,'AllInclusive', 'tu wpisać opis', 27);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Hotel Lido', 4.7 ,'AllInclusive', 'tu wpisać opis', 28);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Akra Hotel', 4.7 ,'AllInclusive', 'tu wpisać opis', 29);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Baboona Beachfront Living', 4.9 ,'     B&B    ', 'tu wpisać opis', 30);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Hotel Carlton', 4.8 ,'AllInclusive', 'tu wpisać opis', 31);
INSERT INTO Hotel (name, stars, allimentation, description, city_fk) values ('Hotel Atlantico Prime', 4.6 ,'AllInclusive', 'tu wpisać opis', 32);



--INSERT INTO Trip (hotel_fk, depart_Date, return_Date, placeOfAirport, price ) values ('Rio de Janeiro', 12);


--INSERT INTO Trip_Order () values ();


INSERT INTO City_Airport (city_Airport_Name) values ('KRAKÓW');
INSERT INTO City_Airport (city_Airport_Name) values ('WARSZAWA');
INSERT INTO City_Airport (city_Airport_Name) values ('KATOWICE');
INSERT INTO City_Airport (city_Airport_Name) values ('WROCŁAW');
INSERT INTO City_Airport (city_Airport_Name) values ('GDAŃSK');
INSERT INTO City_Airport (city_Airport_Name) values ('POZNAŃ');


INSERT INTO Airport (airport_name, city_airport_fk) values ('KRA', 1);
INSERT INTO Airport (airport_name, city_airport_fk) values ('WAW', 2);
INSERT INTO Airport (airport_name, city_airport_fk) values ('KTW', 3);
INSERT INTO Airport (airport_name, city_airport_fk) values ('WRO', 4);
INSERT INTO Airport (airport_name, city_airport_fk) values ('GDN', 5);
INSERT INTO Airport (airport_name, city_airport_fk) values ('POZ', 6);

INSERT INTO Trip (hotel_fk, depart_Date, return_Date, airport_fk, price ) values (1, '2020-08-01', '2020-08-15', 3, 1299.99);
INSERT INTO Trip (hotel_fk, depart_Date, return_Date, airport_fk, price ) values (1, '2020-08-07', '2020-08-15', 3, 899.99);
INSERT INTO Trip (hotel_fk, depart_Date, return_Date, airport_fk, price ) values (2, '2020-08-23', '2020-09-07', 3, 1399.99);
INSERT INTO Trip (hotel_fk, depart_Date, return_Date, airport_fk, price ) values (5, '2020-08-01', '2020-08-15', 3, 999.99);
INSERT INTO Trip (hotel_fk, depart_Date, return_Date, airport_fk, price ) values (8, '2020-08-07', '2020-08-15', 3, 699.99);
INSERT INTO Trip (hotel_fk, depart_Date, return_Date, airport_fk, price ) values (32,'2020-08-07', '2020-08-15', 3, 899.99);
INSERT INTO Trip (hotel_fk, depart_Date, return_Date, airport_fk, price ) values (18,'2020-08-23', '2020-09-07', 3, 799.99);
INSERT INTO Trip (hotel_fk, depart_Date, return_Date, airport_fk, price ) values (24,'2020-08-01', '2020-08-15', 3, 1299.99);
INSERT INTO Trip (hotel_fk, depart_Date, return_Date, airport_fk, price ) values (7, '2020-08-01', '2020-08-15', 3, 1199.99);
INSERT INTO Trip (hotel_fk, depart_Date, return_Date, airport_fk, price ) values (14,'2020-08-01', '2020-08-15', 3, 1099.99);
INSERT INTO Trip (hotel_fk, depart_Date, return_Date, airport_fk, price ) values (30,'2020-08-01', '2020-08-15', 3, 999.99);
INSERT INTO Trip (hotel_fk, depart_Date, return_Date, airport_fk, price ) values (27,'2020-08-01', '2020-08-15', 3, 499.99);
INSERT INTO Trip (hotel_fk, depart_Date, return_Date, airport_fk, price ) values (6, '2020-08-01', '2020-08-15', 3, 899.99);
INSERT INTO Trip (hotel_fk, depart_Date, return_Date, airport_fk, price ) values (20,'2020-08-01', '2020-08-15', 3, 1599.99);
INSERT INTO Trip (hotel_fk, depart_Date, return_Date, airport_fk, price ) values (5, '2020-08-01', '2020-08-15', 3, 899.99);
INSERT INTO Trip (hotel_fk, depart_Date, return_Date, airport_fk, price ) values (1, '2020-08-01', '2020-08-15', 3, 699.99);
INSERT INTO Trip (hotel_fk, depart_Date, return_Date, airport_fk, price ) values (5, '2020-08-01', '2020-08-15', 3, 799.99);
