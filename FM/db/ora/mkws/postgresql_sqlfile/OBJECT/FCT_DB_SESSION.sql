\encoding UTF-8

CREATE TABLE fct_db_session
(mcf_db_sid varchar (50) NOT NULL,
srv_req_no varchar (50) NULL,
login_seq varchar (50) NULL
);


ALTER TABLE fct_db_session
ADD CONSTRAINT fct_db_session_pk PRIMARY KEY(mcf_db_sid);

