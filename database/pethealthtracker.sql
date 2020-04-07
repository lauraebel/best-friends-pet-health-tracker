DROP TABLE IF EXISTS pet_medication;
DROP TABLE IF EXISTS pet_vaccine;
DROP TABLE IF EXISTS appointment;
DROP TABLE IF EXISTS pet;
DROP TABLE IF EXISTS medication;
DROP TABLE IF EXISTS owner;
DROP TABLE IF EXISTS vaccine;
DROP TABLE IF EXISTS veterinarian;

CREATE TABLE pet (
id SERIAL NOT NULL, 
name CHARACTER VARYING(255) NOT NULL, 
type CHARACTER VARYING(40) NOT NULL, 
breed CHARACTER VARYING(100) NOT NULL, 
age INTEGER NOT NULL, 
date_of_birth DATE, 
gender CHARACTER VARYING(10) NOT NULL, 
fixed varchar(3) NOT NULL, 
PRIMARY KEY (id)
);

CREATE TABLE owner (
id SERIAL NOT NULL, 
first_name CHARACTER VARYING(35) NOT NULL, 
last_name CHARACTER VARYING(35) NOT NULL, 
optional_secondary_first_name CHARACTER VARYING(35), 
optional_secondary_last_name CHARACTER VARYING(35), 
PRIMARY KEY (id)
);

CREATE TABLE veterinarian (
id SERIAL NOT NULL, 
company_name CHARACTER VARYING(255) NOT NULL, 
vet_first_name CHARACTER VARYING(35), 
vet_last_name CHARACTER VARYING(35), 
phone CHARACTER VARYING(20), 
street_address CHARACTER VARYING(100), 
city CHARACTER VARYING(70), 
state CHARACTER VARYING(20), 
postal_code CHARACTER VARYING(10), 
PRIMARY KEY (id)
);

CREATE TABLE medication (
id SERIAL NOT NULL, 
name CHARACTER VARYING(255) NOT NULL, 
PRIMARY KEY (id)
);

CREATE TABLE vaccine (
id SERIAL NOT NULL, 
name CHARACTER VARYING(255) NOT NULL, 
PRIMARY KEY (id)
);

CREATE TABLE appointment (
id SERIAL NOT NULL,
appointment_date DATE NOT NULL,
procedure varchar(100) NOT NULL,
cost INTEGER,
pet_id INTEGER NOT NULL,
CONSTRAINT fk_pet_appointment FOREIGN KEY (pet_id) references pet(id)
); 

CREATE TABLE pet_medication (
pet_id INTEGER NOT NULL,
medication_id INTEGER NOT NULL,
CONSTRAINT fk_pet_id_medication FOREIGN KEY (pet_id) references pet(id),
CONSTRAINT fk_medication_id_pet FOREIGN KEY (medication_id) references medication(id)
);

CREATE TABLE pet_vaccine (
pet_id INTEGER NOT NULL,
vaccine_id INTEGER NOT NULL,
CONSTRAINT fk_pet_id_vaccine FOREIGN KEY (pet_id) references pet(id),
CONSTRAINT fk_vaccine_id_pet FOREIGN KEY (vaccine_id) references vaccine(id)
);