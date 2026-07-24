\encoding UTF-8

ALTER TABLE mbt_aprv_all
 ADD CONSTRAINT mbt_aprv_all_ck02 CHECK (aprv_upd_flg IN ('0', '1'));

