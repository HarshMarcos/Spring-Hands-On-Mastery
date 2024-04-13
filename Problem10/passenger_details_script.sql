USE passenger;
CREATE TABLE passenger_details (
    Passenger_id INT PRIMARY KEY,
    Passenger_name VARCHAR(255) NOT NULL,
    Passenger_dob DATE,
    Passenger_phone VARCHAR(15),
    Passenger_email VARCHAR(255),
    UNIQUE (Passenger_email)
);

INSERT INTO passenger_details (Passenger_id, Passenger_name, Passenger_dob, Passenger_phone, Passenger_email)
VALUES 
    (1234, 'Anu', '2000-05-15', '9876543266', 'anu@gamil.com'),
    (1235, 'Vikas', '2001-08-25', '8876543266', 'vikas@gmail.com'),
    (1236, 'Sharmi', '2011-03-10', '9666543266', 'sharmi@example.com'),
    (1237, 'Sharmi', '1990-03-10', '9076543266', 'nikitha@example.com');
SELECT * FROM passenger_details;