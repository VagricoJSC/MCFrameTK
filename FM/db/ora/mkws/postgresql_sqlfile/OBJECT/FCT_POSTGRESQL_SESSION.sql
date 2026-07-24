\encoding UTF-8

CREATE TABLE fct_postgresql_session
(mcf_db_sid varchar (50) NOT NULL,
pid numeric (10) NOT NULL
);


ALTER TABLE fct_postgresql_session
ADD CONSTRAINT fct_postgresql_session_pk PRIMARY KEY(mcf_db_sid);

