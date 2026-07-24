\encoding UTF-8

ALTER TABLE mam_aprv_all
 ADD CONSTRAINT mam_aprv_all_ck01 CHECK (aprv_upd_flg IN ('0', '1'));

