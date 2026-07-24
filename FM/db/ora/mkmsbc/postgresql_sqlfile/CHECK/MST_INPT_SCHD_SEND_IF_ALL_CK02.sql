\encoding UTF-8

ALTER TABLE mst_inpt_schd_send_if_all
 ADD CONSTRAINT mst_inpt_schd_send_if_all_ck02 CHECK (sno2_null_flg IN ('0', '1'));

