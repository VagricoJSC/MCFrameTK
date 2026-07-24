\encoding UTF-8

CREATE TABLE mgt_usr_itm_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
usr_cd varchar (500) NULL,
calc_grp_cd varchar (10) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
co_cd varchar (10) NULL
);



ALTER TABLE mgt_usr_itm_all_r ADD CONSTRAINT mgt_usr_itm_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mgt_usr_itm_all_r', 'mgt_usr_itm_all', 'mgt_usr_itm_all_tr_r');

