\encoding UTF-8

ALTER TABLE mst_pay_chk_all
 ADD CONSTRAINT mst_pay_chk_all_ck03 CHECK (batch_pay_schd_cl_flg IN ('0', '1'));

