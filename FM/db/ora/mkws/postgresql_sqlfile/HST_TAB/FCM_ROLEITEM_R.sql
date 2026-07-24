\encoding UTF-8

CREATE TABLE fcm_roleitem_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
iid numeric (15) NULL,
rid varchar (50) NULL,
type_cd varchar (1) NULL,
actype varchar (50) NULL,
chk_pw char (1) NULL,
chk_id char (1) DEFAULT '0' NULL,
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



ALTER TABLE fcm_roleitem_r ADD CONSTRAINT fcm_roleitem_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fcm_roleitem_r', 'fcm_roleitem', 'fcm_roleitem_tr_r');

