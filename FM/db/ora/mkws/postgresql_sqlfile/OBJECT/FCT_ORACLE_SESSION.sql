\encoding UTF-8

CREATE TABLE fct_oracle_session
(mcf_db_sid varchar (50) NOT NULL,
sid numeric  NOT NULL,
serial numeric  NOT NULL,
inst_id numeric (9,0) NOT NULL
);


ALTER TABLE fct_oracle_session
ADD CONSTRAINT fct_oracle_session_pk PRIMARY KEY(mcf_db_sid);

