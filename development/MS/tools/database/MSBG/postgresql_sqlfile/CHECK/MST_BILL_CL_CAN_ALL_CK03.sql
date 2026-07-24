\encoding UTF-8

ALTER TABLE mst_bill_cl_can_all
 ADD CONSTRAINT mst_bill_cl_can_all_ck03 CHECK (prnt_flg IN ('0', '1'));

