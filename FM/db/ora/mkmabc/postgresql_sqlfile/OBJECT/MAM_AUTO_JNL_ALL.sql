\encoding UTF-8

CREATE TABLE mam_auto_jnl_all
(ac_slip_typ varchar (5) NOT NULL,
auto_jnl_key_cd varchar (5) NULL,
auto_jnl_grp varchar (5) NOT NULL,
jnl_ptn_cd varchar (20) NOT NULL,
prio numeric (9,0) NOT NULL,
ac_if_typ varchar (1) NOT NULL,
id_typ varchar (1) NOT NULL,
slip_cnt_id varchar (3) NULL,
std_rnd_typ varchar (1) NULL,
cls_jnl_typ varchar (1) NULL,
compound_jnl_typ varchar (1) NULL,
alloc_jnl_flg char (1) DEFAULT '0' NOT NULL,
minus_flg char (1) DEFAULT '0' NOT NULL,
rev_flg char (1) DEFAULT '0' NOT NULL,
minus_rev_flg char (1) DEFAULT '0' NOT NULL,
default_flg char (1) DEFAULT '0' NOT NULL,
abs_typ varchar (1) NOT NULL,
abstract1 varchar (40) NULL,
st_dt timestamp(0)  NOT NULL,
end_dt timestamp(0)  NOT NULL,
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
upd_srv_req_no varchar (50) NULL,
co_cd varchar (10) NOT NULL
);


ALTER TABLE mam_auto_jnl_all
ADD CONSTRAINT mam_auto_jnl_all_pk UNIQUE(ac_slip_typ,auto_jnl_key_cd,auto_jnl_grp,jnl_ptn_cd,co_cd);


CREATE UNIQUE INDEX mam_auto_jnl_all_pk_ie ON mam_auto_jnl_all (ac_slip_typ,COALESCE(auto_jnl_key_cd,''),auto_jnl_grp,jnl_ptn_cd,co_cd);

