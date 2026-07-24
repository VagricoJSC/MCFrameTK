\encoding UTF-8

ALTER TABLE mam_ac_rsn_cmn
 ADD CONSTRAINT mam_ac_rsn_cmn_ck02 CHECK (cost_invalid_flg IN ('0', '1'));

