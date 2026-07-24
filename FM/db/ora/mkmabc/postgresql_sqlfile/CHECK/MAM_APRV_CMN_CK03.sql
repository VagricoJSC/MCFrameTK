\encoding UTF-8

ALTER TABLE mam_aprv_cmn
 ADD CONSTRAINT mam_aprv_cmn_ck03 CHECK (del_flg IN ('0', '1'));

