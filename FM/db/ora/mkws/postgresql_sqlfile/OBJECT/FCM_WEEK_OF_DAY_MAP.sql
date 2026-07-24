\encoding UTF-8

CREATE TABLE fcm_week_of_day_map
(territory varchar (80) NOT NULL,
db_day numeric (1) NOT NULL,
mc_day numeric (1) NOT NULL
);


ALTER TABLE fcm_week_of_day_map
ADD CONSTRAINT fcm_week_of_day_map_pk PRIMARY KEY(territory,db_day);

