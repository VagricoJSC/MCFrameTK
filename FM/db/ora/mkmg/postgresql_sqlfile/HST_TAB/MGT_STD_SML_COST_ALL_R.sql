\encoding UTF-8

CREATE TABLE mgt_std_sml_cost_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
calc_no varchar (15) NULL,
calc_grp_cd varchar (10) NULL,
top_rec_no numeric (9,0) NULL,
expns_cd varchar (20) NULL,
co_cd varchar (10) NULL,
std_cost numeric (21,8) NULL,
the_cost numeric (21,8) NULL,
expns_typ varchar (1) NULL,
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



ALTER TABLE mgt_std_sml_cost_all_r ADD CONSTRAINT mgt_std_sml_cost_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mgt_std_sml_cost_all_r', 'mgt_std_sml_cost_all', 'mgt_std_sml_cost_all_tr_r');

