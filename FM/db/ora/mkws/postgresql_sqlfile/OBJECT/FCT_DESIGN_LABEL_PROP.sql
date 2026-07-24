\encoding UTF-8

CREATE TABLE fct_design_label_prop
(design_no varchar (20) NOT NULL,
level_id varchar (20) NOT NULL,
label_id varchar (20) NOT NULL,
label_idx varchar (20) NOT NULL,
property_key varchar (100) NOT NULL,
property_value varchar (1000) NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (40) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (40) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL
);


ALTER TABLE fct_design_label_prop
ADD CONSTRAINT fct_design_label_prop_pk PRIMARY KEY(design_no,level_id,label_id,label_idx,property_key);

