\encoding UTF-8

ALTER TABLE mst_iv_all
 ADD CONSTRAINT mst_iv_all_ck05 CHECK (pl_reg_flg IN ('0', '1'));

