\encoding UTF-8

CREATE TABLE fct_login
(user_id varchar (500) NOT NULL,
arc_cd varchar (3) NOT NULL,
login_seq varchar (50) NOT NULL,
clt_id varchar (50) NOT NULL,
login_tm timestamp(3)  NOT NULL,
last_req_tm timestamp(3)  NOT NULL,
exec_flg char (1) NOT NULL,
co_cd varchar (10) NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL,
prod varchar (1000) NULL,
user_nm varchar (40) NULL
);


ALTER TABLE fct_login
ADD CONSTRAINT fct_login_pk PRIMARY KEY(user_id,arc_cd,login_seq);

