\encoding UTF-8

ALTER TABLE mst_iv_all
 ADD CONSTRAINT mst_iv_all_ck04 CHECK (ptax_xrate_inpt_flg IN ('0', '1'));

