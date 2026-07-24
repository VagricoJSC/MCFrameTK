\encoding UTF-8

CREATE TABLE mam_view_definition
(table_name varchar (100) NOT NULL,
view_definition text  NULL,
mst_nm varchar (30) NOT NULL
);


ALTER TABLE mam_view_definition
ADD CONSTRAINT mam_view_definition_pk PRIMARY KEY(table_name);

