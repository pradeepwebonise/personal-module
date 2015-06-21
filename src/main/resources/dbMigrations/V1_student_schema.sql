create table student ( 
   roll_number INT NOT NULL AUTO_INCREMENT,
   first_name  VARCHAR(100),
   last_name  VARCHAR(40) ,
   address VARCHAR(40) ,
   age  INT,
   gender  VARCHAR(40),
   PRIMARY KEY ( roll_number )
);

insert into student (first_name, last_name, address, age, gender) values ('PP', 'AA', 'Baner', 22 , 'Male');