\encoding UTF-8

CREATE TABLE mst_wrk_sno_all
(sno1 varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
wrk_no varchar (15) NOT NULL,
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


ALTER TABLE mst_wrk_sno_all
ADD CONSTRAINT mst_wrk_sno_all_pk PRIMARY KEY(sno1,co_cd);


CREATE INDEX mst_wrk_sno_all_ie01
ON mst_wrk_sno_all USING BTREE (wrk_no, co_cd);

