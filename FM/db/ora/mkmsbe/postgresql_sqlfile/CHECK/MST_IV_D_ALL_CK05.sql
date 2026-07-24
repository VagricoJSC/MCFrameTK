\encoding UTF-8

ALTER TABLE mst_iv_d_all
 ADD CONSTRAINT mst_iv_d_all_ck05 CHECK (tax_fix_flg IN ('0', '1'));

