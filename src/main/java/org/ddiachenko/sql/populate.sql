INSERT INTO CLIENT (NAME)
VALUES ('Biedronka'),
       ('Tesco'),
       ('ATB'),
       ('Silpo'),
       ('Lidl');

INSERT INTO WORKER (NAME, BIRTHDATE, LEVEL, SALARY)
VALUES ('Dmytro', '1996-05-13', 'Junior', 700),
       ('Wlad', '2004-07-11', 'Middle', 1400),
       ('Serhii', '2002-05-05', 'Senior', 2800),
       ('Gregori', '1992-12-12', 'Trainee', 500),
       ('Max', '1993-11-15', 'Junior', 750),
       ('Marta', '2014-07-25', 'Middle', 5000),
       ('Wiktor', '1973-01-02', 'Senior', 9000),
       ('Masza', '1967-12-18', 'Middle', 9000),
       ('Kaka', '1982-01-18', 'Senior', 8500),
       ('Ernest', '1995-02-11', 'Junior', 550);

INSERT INTO PROJECT (CLIENT_ID, NAME, START_DATE, FINISH_DATE)
VALUES (1, 'Project A',  CURRENT_DATE, CURRENT_DATE + INTERVAL '10 months'),
       (2, 'Project B',  CURRENT_DATE, CURRENT_DATE + INTERVAL '12 months'),
       (1, 'Project C',  CURRENT_DATE, CURRENT_DATE + INTERVAL '3 months'),
       (4, 'Project D',  CURRENT_DATE, CURRENT_DATE + INTERVAL '6 months'),
       (5, 'Project E',  CURRENT_DATE, CURRENT_DATE + INTERVAL '8 months'),
       (1, 'Project F',  CURRENT_DATE, CURRENT_DATE + INTERVAL '11 months'),
       (2, 'Project J', CURRENT_DATE, CURRENT_DATE + INTERVAL '6 months'),
       (3, 'Project K',  CURRENT_DATE, CURRENT_DATE + INTERVAL '11 months'),
       (5, 'Project L',  CURRENT_DATE, CURRENT_DATE + INTERVAL '15 months'),
       (5, 'Project M', CURRENT_DATE, CURRENT_DATE + INTERVAL '10 months');

INSERT INTO PROJECT_WORKER (PROJECT_ID, WORKER_ID)
VALUES (21, 21),
       (21, 22),
       (21, 30),
       (21, 24),
       (21, 25),
       (22, 26),
       (22, 27),
       (22, 28),
       (22, 29),
       (22, 30),
       (23, 23),
       (24, 21),
       (24, 22),
       (24, 23),
       (24, 24),
       (25, 30),
       (25, 29),
       (26, 28),
       (26, 27),
       (28, 21),
       (29, 22),
       (29, 23),
       (22, 24);