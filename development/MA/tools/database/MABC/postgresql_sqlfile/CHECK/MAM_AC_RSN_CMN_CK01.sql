\encoding UTF-8

ALTER TABLE mam_ac_rsn_cmn
 ADD CONSTRAINT mam_ac_rsn_cmn_ck01 CHECK (ac_invalid_flg IN ('0', '1'));

