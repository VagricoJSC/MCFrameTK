\encoding UTF-8

ALTER TABLE mst_bill_acst_all
 ADD CONSTRAINT mst_bill_acst_all_ak01 UNIQUE (bill_mng_no,acst_cd,ar_dpt_cd,ar_typ,co_cd);

