\encoding UTF-8

CREATE TABLE mgt_non_mov_stk_all
(itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
wg_cd varchar (10) DEFAULT '*' NOT NULL,
co_cd varchar (10) NOT NULL,
non_mov_base_ym timestamp(0)  NOT NULL,
non_mov_gi_ym timestamp(0)  NULL,
non_mov_gr_ym timestamp(0)  NULL,
calc_ym timestamp(0)  NOT NULL,
rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
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


ALTER TABLE mgt_non_mov_stk_all
ADD CONSTRAINT mgt_non_mov_stk_all_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,wg_cd,co_cd);

