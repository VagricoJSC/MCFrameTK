\encoding UTF-8

CREATE TABLE fct_dbversion
(product_id varchar (128) NOT NULL,
product_nm varchar (128) NULL,
module_id varchar (3) NOT NULL,
product_version varchar (128) NOT NULL,
sort_no numeric (3) NULL
);


ALTER TABLE fct_dbversion
ADD CONSTRAINT fct_dbversion_pk PRIMARY KEY(product_id);

