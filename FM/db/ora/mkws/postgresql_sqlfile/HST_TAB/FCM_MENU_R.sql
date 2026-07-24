\encoding UTF-8

CREATE TABLE fcm_menu_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
parent_menu_id varchar (4000) NULL,
menu_id varchar (256) NULL,
menu_order numeric (9,0) DEFAULT 0 NULL,
menu_type varchar (10) NULL,
menu_title varchar (1000) NULL,
module_id varchar (3) NULL,
screen_id varchar (10) NULL,
screen_mode varchar (10) NULL,
frame_type varchar (10) NULL,
per_grp_id varchar (512) NULL,
menu_class_id varchar (20) NULL,
menu_classname varchar (1000) NULL,
menu_method varchar (1000) NULL,
accesskey varchar (1) NULL,
shortcutkey varchar (1) NULL,
maskkey varchar (10) NULL,
ac varchar (50) NULL,
co_cd varchar (10) NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL,
menu_visible char (1) DEFAULT 0 NULL,
core_menu char (1) DEFAULT 0 NULL,
menu_image numeric  NULL,
menu_index varchar (15) NULL,
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



ALTER TABLE fcm_menu_r ADD CONSTRAINT fcm_menu_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fcm_menu_r', 'fcm_menu', 'fcm_menu_tr_r');

