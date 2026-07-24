\encoding UTF-8

ALTER TABLE mst_bill_all
 ADD CONSTRAINT mst_bill_all_ak01 UNIQUE (bcst_cd,bill_cl_dt,bill_no,iv_no,trd_cur_cd,wrk_no,bill_dpt_cd,co_cd);

CREATE UNIQUE INDEX mst_bill_all_ak01_ie ON mst_bill_all (bcst_cd,bill_cl_dt,bill_no,iv_no,trd_cur_cd,COALESCE(wrk_no,''),bill_dpt_cd,co_cd);

