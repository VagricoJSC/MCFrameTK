\encoding UTF-8

ALTER TABLE mbt_aprv_all
 ADD CONSTRAINT mbt_aprv_all_ck04 CHECK (can_flg IN ('0', '1'));

