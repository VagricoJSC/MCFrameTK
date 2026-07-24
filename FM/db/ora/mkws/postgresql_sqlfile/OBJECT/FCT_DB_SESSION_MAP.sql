\encoding UTF-8

CREATE TABLE fct_db_session_map
(sid numeric  NOT NULL,
serial numeric  NOT NULL,
inst_id numeric (9,0) NOT NULL,
srv_req_no varchar (50) NULL,
login_seq varchar (50) NULL
);


ALTER TABLE fct_db_session_map
ADD CONSTRAINT fct_db_session_map_pk PRIMARY KEY(sid,serial,inst_id);

