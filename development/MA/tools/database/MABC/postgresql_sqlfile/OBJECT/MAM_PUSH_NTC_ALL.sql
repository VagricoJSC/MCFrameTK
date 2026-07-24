\encoding UTF-8

CREATE TABLE mam_push_ntc_all
(push_ntc_typ varchar (50) NOT NULL,
ntc_wg_cd varchar (10) NULL,
ntc_dpt_cd varchar (20) NULL,
ntc_aprv_role_cd varchar (10) NULL,
st_dt timestamp(0)  NOT NULL,
co_cd varchar (10) NOT NULL,
end_dt timestamp(0)  NOT NULL,
msg_imp_typ varchar (1) NOT NULL,
push_typ varchar (1) NOT NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
del_flg char (1) DEFAULT '0' NOT NULL,
del_usr_id varchar (500) NULL,
del_usr_nm varchar (100) NULL,
del_ts timestamp(3)  NULL,
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


ALTER TABLE mam_push_ntc_all
ADD CONSTRAINT mam_push_ntc_all_pk UNIQUE(push_ntc_typ,ntc_wg_cd,ntc_dpt_cd,ntc_aprv_role_cd,st_dt,co_cd);


CREATE UNIQUE INDEX mam_push_ntc_all_pk_ie ON mam_push_ntc_all (push_ntc_typ,COALESCE(ntc_wg_cd,''),COALESCE(ntc_dpt_cd,''),COALESCE(ntc_aprv_role_cd,''),st_dt,co_cd);

