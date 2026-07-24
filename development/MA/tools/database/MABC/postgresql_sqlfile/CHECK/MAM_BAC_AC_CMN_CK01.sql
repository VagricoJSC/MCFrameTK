\encoding UTF-8

ALTER TABLE mam_bac_ac_cmn
 ADD CONSTRAINT mam_bac_ac_cmn_ck01 CHECK (del_flg IN ('0', '1'));

