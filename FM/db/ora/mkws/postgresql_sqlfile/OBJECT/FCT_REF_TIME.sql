\encoding UTF-8

CREATE TABLE fct_ref_time
(co_cd varchar (10) NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL,
req_no varchar (50) NULL,
thread_no varchar (5) NULL,
table_name varchar (30) NULL,
ref_time timestamp(3)  NOT NULL
);



CREATE INDEX fct_ref_time_ie01
ON fct_ref_time USING BTREE (co_cd,ext_attr1, ext_attr2, ext_attr3);

