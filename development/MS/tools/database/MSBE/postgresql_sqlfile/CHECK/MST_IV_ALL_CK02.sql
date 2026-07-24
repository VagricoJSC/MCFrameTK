\encoding UTF-8

ALTER TABLE mst_iv_all
 ADD CONSTRAINT mst_iv_all_ck02 CHECK (dlv_sundry_flg IN ('0', '1'));

