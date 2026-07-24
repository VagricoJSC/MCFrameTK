\encoding UTF-8

CREATE TABLE fct_design_res_col
(resource_grp_cd varchar (100) NOT NULL,
resource_col_idx varchar (100) NOT NULL,
resource_col_cd varchar (100) NULL,
resource_col_nm varchar (1000) NULL,
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


ALTER TABLE fct_design_res_col
ADD CONSTRAINT fct_design_res_col_pk PRIMARY KEY(resource_grp_cd,resource_col_idx);

