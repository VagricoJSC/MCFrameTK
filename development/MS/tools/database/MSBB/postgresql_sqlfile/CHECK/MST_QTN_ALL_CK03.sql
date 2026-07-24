\encoding UTF-8

ALTER TABLE mst_qtn_all
 ADD CONSTRAINT mst_qtn_all_ck03 CHECK (xrate_inpt_flg IN ('0', '1'));

