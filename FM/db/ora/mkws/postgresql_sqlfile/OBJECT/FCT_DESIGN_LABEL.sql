\encoding UTF-8

CREATE TABLE fct_design_label
(design_no varchar (20) NOT NULL,
level_id varchar (20) NOT NULL,
label_id varchar (20) NOT NULL,
label_idx varchar (20) NOT NULL,
label_text varchar (1000) NULL,
description_text varchar (1000) NULL,
horizontal_index numeric (10) NULL,
vertical_index numeric (10) NULL,
font_size numeric (21,8) NULL,
label_color varchar (100) NULL,
fill_color varchar (100) NULL,
cal_date timestamp(3)  NULL,
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


ALTER TABLE fct_design_label
ADD CONSTRAINT fct_design_label_pk PRIMARY KEY(design_no,level_id,label_id,label_idx);

