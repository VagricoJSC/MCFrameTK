\encoding UTF-8

CREATE TABLE fct_hst_login
(user_id varchar (500) NOT NULL,
login_seq varchar (50) NOT NULL,
hst_typ varchar (6) NULL,
arc_cd varchar (3) NOT NULL,
clt_id varchar (50) NOT NULL,
hst_tm timestamp(3)  NULL,
co_cd varchar (10) NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL,
prod varchar (1000) NULL,
user_nm varchar (40) NULL,
row_id varchar (500) NULL,
clt_type varchar (1) NULL
);

