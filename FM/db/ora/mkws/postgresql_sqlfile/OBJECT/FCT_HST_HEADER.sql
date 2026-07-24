\encoding UTF-8

CREATE TABLE fct_hst_header
(hst_id numeric (24) NOT NULL,
table_name varchar (30) NOT NULL,
key_id numeric (24) NOT NULL,
action_id varchar (15) NULL,
hst_type varchar (2) NULL,
hst_time timestamp(0)  NULL,
hst_user_id varchar (500) NULL,
co_cd varchar (10) NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL
);


ALTER TABLE fct_hst_header
ADD CONSTRAINT fct_hst_header_pk PRIMARY KEY(hst_id);

