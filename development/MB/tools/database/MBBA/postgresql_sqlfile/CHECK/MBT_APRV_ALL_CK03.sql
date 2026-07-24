\encoding UTF-8

ALTER TABLE mbt_aprv_all
 ADD CONSTRAINT mbt_aprv_all_ck03 CHECK (aprv_can_flg IN ('0', '1'));

