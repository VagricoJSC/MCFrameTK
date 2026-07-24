\encoding UTF-8

ALTER TABLE mst_iv_d_all
 ADD CONSTRAINT mst_iv_d_all_ck03 CHECK (interim_flg IN ('0', '1'));

