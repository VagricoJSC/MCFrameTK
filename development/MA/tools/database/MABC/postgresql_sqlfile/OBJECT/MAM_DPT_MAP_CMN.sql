\encoding UTF-8

CREATE TABLE mam_dpt_map_cmn
(old_dpt_cd varchar (20) NOT NULL,
st_dt timestamp(0)  NOT NULL,
end_dt timestamp(0)  NOT NULL,
new_dpt_cd varchar (20) NOT NULL,
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


ALTER TABLE mam_dpt_map_cmn
ADD CONSTRAINT mam_dpt_map_cmn_pk PRIMARY KEY(old_dpt_cd,st_dt);

