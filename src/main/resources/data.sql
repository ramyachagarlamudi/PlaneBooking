
INSERT INTO flight (flight_id, flight_name, no_of_business_seats, no_of_economy_seats, no_of_first_class_seats) VALUES
(1, Boeing, 35, 195, 20),
(2, Airbus, 0, 145, 0),
(3, Airbus V1, 25, 156, 0);


INSERT INTO hibernate_sequence (next_val) VALUES
(4),
(4);



INSERT INTO passenger (passenger_id, address, email, full_name, mobile_number) VALUES
(1, Plot 18, siva.ecm9@gmai.com, sambasivarao Doppalapudi, 9849204988),
(2, Plot 18, siva.ecm9@gmail.com, sambasivarao Doppalapudi, 9849204988),
(3, Plot 18, Tirumala Hills, Puppalaguda, Manikonda, CHAGARLA.RAM@GMAIL.COM, ramya C, 9985588834),
(4, 8604 valley ranch parkway west, apt#3015, siva.ecm9@gmai.com, bhanu kishore, 9849204988);



INSERT INTO reservation (reservation_code, arrival_time, departure_date, departure_time, destination, flight_name, full_name, passenger_id, price, sched_id, selected_class, source) VALUES
(1, 2:00 pm, 03-09-2019, 3:30 pm, Bangalore, Airbus, sambasivarao Doppalapudi, 1, 9600, 2, Economy, Hyderabad),
(2, 2:00 pm, 03-09-2019, 3:30 pm, Bangalore, Airbus, sambasivarao Doppalapudi, 1, 9600, 2, Economy, Hyderabad),
(3, 2:00 pm, 03-09-2019, 3:30 pm, Bangalore, Airbus, sambasivarao Doppalapudi, 1, 9600, 2, Economy, Hyderabad),
(4, 8:00 am, 03-09-2019, 9:30 am, Bangalore, Boeing, sambasivarao Doppalapudi, 1, 9600, 1, Economy, Hyderabad),
(5, 8:00 am, 03-09-2019, 9:30 am, Bangalore, Boeing, sambasivarao Doppalapudi, 2, 9600, 1, Economy, Hyderabad),
(6, 8:00 am, 03-09-2019, 9:30 am, Bangalore, Boeing, ramya C, 3, 9600, 1, Economy, Hyderabad),
(7, 2:00 pm, 03-09-2019, 3:30 pm, Bangalore, Airbus, sambasivarao Doppalapudi, 1, 9600, 2, Economy, Hyderabad),
(8, 8:00 am, 03-09-2019, 9:30 am, Bangalore, Boeing, ramya C, 3, 9600, 1, Economy, Hyderabad),
(9, 2:00 pm, 03-09-2019, 3:30 pm, Bangalore, Airbus, sambasivarao Doppalapudi, 1, 9600, 2, Economy, Hyderabad),
(10, 8:00 am, 03-09-2019, 9:30 am, Bangalore, Boeing, bhanu kishore, 4, 9600, 1, Economy, Hyderabad),
(11, 2:00 pm, 03-09-2019, 3:30 pm, Bangalore, Airbus, ramya C, 3, 9600, 2, Economy, Hyderabad),
(12, 8:00 am, 03-09-2019, 9:30 am, Bangalore, Boeing, ramya C, 3, 9600, 1, Economy, Hyderabad);

INSERT INTO scheduledflights (schedflight_id, arrival_time, departure_date, departure_time, destination, flight_id, source, total_avaliable_seats) VALUES
(1, 9:30 am, 03-09-2019, 8:00 am, Bangalore, 1, Hyderabad, 230),
(2, 3:30 pm, 03-09-2019, 2:00 pm, Bangalore, 1, Hyderabad, 230),
(3, 9:30 am, 03-09-2019, 8:00 am, Bangalore, 2, Chennai, 156),
(4, 2:30 pm, 03-09-2019, 1:00 pm, Bangalore, 2, Chennai, 156),
(5, 4:00 pm, 03-09-2019, 2:00 pm, Bangalore, 3, Delhi, 181),
(6, 11:00 pm , 03-09-2019, 9:00 pm, Bangalore, 3, Delhi, 181);


INSERT INTO scheduledflighttravelclass (schedflight_id, noofseats, price, travel_class) VALUES
(1, 195, 6000, Economy),
(1, 35, 14000, BusinessClass),
(1, 20, 20000, FirstClass),
(2, 195, 6000, Economy),
(2, 20, 13000, BusinessClass),
(2, 8, 20000, FirstClass),
(3, 0, 0, FirstClass),
(3, 0, 0, BusinessClass),
(3, 145, 5000, Economy),
(4, 154, 5000, Economy),
(4, 0, 0, FirstClass),
(5, 0, 0, BusinessClass);

