CREATE TABLE scheduledflights
(
  schedflight_id int(11) NOT NULL,
  arrival_time varchar(255) DEFAULT NULL,
  departure_date varchar(255) DEFAULT NULL,
  departure_time varchar(255) DEFAULT NULL,
  destination varchar(255) DEFAULT NULL,
  flight_id int(11) NOT NULL,
  source varchar(255) DEFAULT NULL,
  total_avaliable_seats int(11) DEFAULT NULL,
  PRIMARY KEY(schedflight_id)
);

CREATE TABLE reservation
(
  reservation_code int(11) NOT NULL,
  arrival_time varchar(255) DEFAULT NULL,
  departure_date varchar(255) DEFAULT NULL,
  departure_time varchar(255) DEFAULT NULL,
  destination varchar(255) DEFAULT NULL,
  flight_name varchar(255) DEFAULT NULL,
  full_name varchar(255) DEFAULT NULL,
  passenger_id int(11) DEFAULT NULL,
  price int(11) DEFAULT NULL,
  sched_id int(11) DEFAULT NULL,
  selected_class varchar(255) DEFAULT NULL,
  source varchar(255) DEFAULT NULL,
  PRIMARY KEY(reservation_code)
);

CREATE TABLE flight
(
  flight_id int(11) NOT NULL,
  flight_name varchar(255) DEFAULT NULL,
  no_of_business_seats int(11) DEFAULT NULL,
  no_of_economy_seats int(11) DEFAULT NULL,
  no_of_first_class_seats int(11) DEFAULT NULL,
  PRIMARY KEY(flight_id)
);

CREATE TABLE passenger
(
  passenger_id int(11) NOT NULL,
  address varchar(255) DEFAULT NULL,
  email varchar(255) DEFAULT NULL,
  full_name varchar(255) DEFAULT NULL,
  mobile_number varchar(255) DEFAULT NULL,
  PRIMARY KEY(passenger_id)
);

CREATE TABLE hibernate_sequence(
  next_val bigint(20) DEFAULT NULL
);