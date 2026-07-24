\encoding UTF-8

CREATE TABLE fct_patchversion
(product_id varchar (128) NOT NULL,
module_id varchar (3) NOT NULL,
version varchar (128) NOT NULL,
branch varchar (128) NOT NULL,
ins_ts timestamp(3)  DEFAULT clock_timestamp() NULL
);

