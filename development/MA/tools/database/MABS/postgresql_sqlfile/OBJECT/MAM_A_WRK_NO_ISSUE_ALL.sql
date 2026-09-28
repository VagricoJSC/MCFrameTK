\encoding UTF-8

CREATE TABLE mam_a_wrk_no_issue_all
(issue_typ varchar (1) NOT NULL,
dept_cd varchar (1) NULL,
prod_cd varchar (2) NULL,
ym varchar (4) NULL,
ope_typ varchar (2) NULL,
co_cd varchar (10) NOT NULL,
wrk_seq numeric (20,0) NOT NULL,
wrk_sub_seq numeric (9,0) NULL,
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


ALTER TABLE mam_a_wrk_no_issue_all
ADD CONSTRAINT mam_a_wrk_no_issue_all_pk UNIQUE(issue_typ,dept_cd,prod_cd,ym,ope_typ,co_cd);


CREATE UNIQUE INDEX mam_a_wrk_no_issue_all_pk_ie ON mam_a_wrk_no_issue_all (issue_typ,COALESCE(dept_cd,''),COALESCE(prod_cd,''),COALESCE(ym,''),COALESCE(ope_typ,''),co_cd);

