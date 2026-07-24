\encoding UTF-8

ALTER TABLE mam_aprv_all
 ADD CONSTRAINT mam_aprv_all_ck03 CHECK (del_flg IN ('0', '1'));

