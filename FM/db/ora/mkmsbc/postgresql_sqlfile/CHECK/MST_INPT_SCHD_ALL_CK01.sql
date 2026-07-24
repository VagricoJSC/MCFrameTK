\encoding UTF-8

ALTER TABLE mst_inpt_schd_all
 ADD CONSTRAINT mst_inpt_schd_all_ck01 CHECK (sno1_null_flg IN ('0', '1'));

