\encoding UTF-8

ALTER TABLE mst_iv_all
 ADD CONSTRAINT mst_iv_all_ck11 CHECK (pl_prnt_flg IN ('0', '1'));

