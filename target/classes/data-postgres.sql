
INSERT INTO flight (flight_id, flight_name, no_of_business_seats, no_of_economy_seats, no_of_first_class_seats) VALUES
(1, 'Boeing', 35, 195, 20),
(2, 'Airbus', 0, 145, 0),
(3, 'Airbus V1', 25, 156, 0);


INSERT INTO hibernate_sequence (next_val) VALUES
(4),
(4);

INSERT INTO scheduledflights (schedflight_id, arrival_time, departure_date, departure_time, destination, flight_id, source, total_avaliable_seats) VALUES
(1, '9:30 am', '03-09-2019', '8:00 am', 'Bangalore', 1, 'Hyderabad', 230),
(2, '3:30 pm', '03-09-2019', '2:00 pm', 'Bangalore', 1, 'Hyderabad', 230),
(3, '9:30 am', '03-09-2019', '8:00 am', 'Bangalore', 2, 'Chennai', 156),
(4, '2:30 pm', '03-09-2019', '1:00 pm', 'Bangalore', 2, 'Chennai', 156),
(5, '4:00 pm', '03-09-2019', '2:00 pm', 'Bangalore', 3, 'Delhi', 181),
(6, '11:00 pm ', '03-09-2019', '9:00 pm', 'Bangalore', 3, 'Delhi', 181);

INSERT INTO scheduledflighttravelclass (schedflight_id, noofseats, price, travel_class) VALUES
(1, 195, 6000, 'Economy'),
(1, 35, 14000, 'BusinessClass'),
(1, 20, 20000, 'FirstClass'),
(2, 195, 6000, 'Economy'),
(2, 20, 13000, 'BusinessClass'),
(2, 8, 20000, 'FirstClass'),
(3, 0, 0, 'FirstClass'),
(3, 0, 0, 'BusinessClass'),
(3, 145, 5000, 'Economy'),
(4, 154, 5000, 'Economy'),
(4, 0, 0, 'FirstClass'),
(5, 0, 0, 'BusinessClass');