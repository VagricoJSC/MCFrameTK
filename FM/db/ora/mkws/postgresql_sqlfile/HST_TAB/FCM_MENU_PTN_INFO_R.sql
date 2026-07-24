\encoding UTF-8

CREATE TABLE fcm_menu_ptn_info_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
menu_ptn_id varchar (50) NULL,
org_parent_menu_id varchar (4000) NULL,
org_menu_order numeric (9,0) DEFAULT 0 NULL,
parent_menu_id varchar (4000) NULL,
menu_id varchar (256) NULL,
menu_order numeric (9,0) DEFAULT 0 NULL,
menu_type varchar (10) NULL,
menu_title varchar (1000) NULL,
module_id varchar (3) NULL,
menu_image numeric  NULL,
menu_index varchar (15) NULL,
co_cd varchar (10) NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL
);



ALTER TABLE fcm_menu_ptn_info_r ADD CONSTRAINT fcm_menu_ptn_info_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fcm_menu_ptn_info_r', 'fcm_menu_ptn_info', 'fcm_menu_ptn_info_tr_r');

