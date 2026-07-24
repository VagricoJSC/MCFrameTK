\encoding UTF-8

ALTER TABLE mam_aprv_cmn
 ADD CONSTRAINT mam_aprv_cmn_ck01 CHECK (aprv_upd_flg IN ('0', '1'));

