\encoding UTF-8

CREATE TABLE fcm_menu_ptn_info
(menu_ptn_id varchar (50) NOT NULL,
org_parent_menu_id varchar (4000) NULL,
org_menu_order numeric (9,0) DEFAULT 0 NULL,
parent_menu_id varchar (4000) NULL,
menu_id varchar (256) NOT NULL,
menu_order numeric (9,0) DEFAULT 0 NOT NULL,
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



INSERT INTO fcm_delete_binary (table_name, column_name)
VALUES ('fcm_menu_ptn_info','menu_image');

