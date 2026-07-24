\encoding UTF-8

CREATE TABLE msc_io_schd_typ_map
(io_schd_typ varchar (5) NOT NULL,
rel_io_schd_typ varchar (5) NOT NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (100) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (100) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL
);


ALTER TABLE msc_io_schd_typ_map
ADD CONSTRAINT msc_io_schd_typ_map_pk PRIMARY KEY(io_schd_typ,rel_io_schd_typ);

