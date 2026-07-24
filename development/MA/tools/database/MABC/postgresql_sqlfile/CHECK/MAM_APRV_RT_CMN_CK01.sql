\encoding UTF-8

ALTER TABLE mam_aprv_rt_cmn
 ADD CONSTRAINT mam_aprv_rt_cmn_ck01 CHECK (del_flg IN ('0', '1'));

