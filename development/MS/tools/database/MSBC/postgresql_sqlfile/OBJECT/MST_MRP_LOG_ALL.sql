\encoding UTF-8

CREATE TABLE mst_mrp_log_all
(wg_cd varchar (10) NOT NULL,
mrp_calc_no varchar (15) NOT NULL,
seq_no numeric (9,0) NOT NULL,
co_cd varchar (10) NOT NULL,
mrp_typ varchar (1) NOT NULL,
log_time varchar (15) NULL,
msg_id varchar (10) NULL,
msg varchar (1000) NULL,
gp_batch_grp_cd varchar (50) NULL,
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


ALTER TABLE mst_mrp_log_all
ADD CONSTRAINT mst_mrp_log_all_pk PRIMARY KEY(wg_cd,mrp_calc_no,seq_no,co_cd);


CREATE INDEX mst_mrp_log_all_ie01
ON mst_mrp_log_all USING BTREE (mrp_typ,co_cd);


CREATE INDEX mst_mrp_log_all_ie02
ON mst_mrp_log_all USING BTREE (gp_batch_grp_cd,co_cd);


CREATE INDEX mst_mrp_log_all_ie03
ON mst_mrp_log_all USING BTREE (msg_id,co_cd);

