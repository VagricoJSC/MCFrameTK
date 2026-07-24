\encoding UTF-8

CREATE TABLE fcm_menu
(parent_menu_id varchar (4000) NULL,
menu_id varchar (256) NOT NULL,
menu_order numeric (9,0) DEFAULT 0 NOT NULL,
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
menu_visible char (1) DEFAULT 0 NOT NULL,
core_menu char (1) DEFAULT 0 NOT NULL,
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



INSERT INTO fcm_delete_binary (table_name, column_name)
VALUES ('fcm_menu','menu_image');

