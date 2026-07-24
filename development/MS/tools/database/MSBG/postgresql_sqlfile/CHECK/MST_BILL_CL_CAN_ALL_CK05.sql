\encoding UTF-8

ALTER TABLE mst_bill_cl_can_all
 ADD CONSTRAINT mst_bill_cl_can_all_ck05 CHECK (rcv_schd_adjst_flg IN ('0', '1'));

