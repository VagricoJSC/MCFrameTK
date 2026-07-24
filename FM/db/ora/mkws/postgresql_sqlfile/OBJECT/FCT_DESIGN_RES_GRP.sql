\encoding UTF-8

CREATE TABLE fct_design_res_grp
(resource_grp_cd varchar (100) NOT NULL,
resource_grp_title varchar (1000) NULL,
description varchar (1000) NULL,
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


ALTER TABLE fct_design_res_grp
ADD CONSTRAINT fct_design_res_grp_pk PRIMARY KEY(resource_grp_cd);

