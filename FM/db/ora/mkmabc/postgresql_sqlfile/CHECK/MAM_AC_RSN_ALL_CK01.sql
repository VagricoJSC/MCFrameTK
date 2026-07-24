\encoding UTF-8

ALTER TABLE mam_ac_rsn_all
 ADD CONSTRAINT mam_ac_rsn_all_ck01 CHECK (ac_invalid_flg IN ('0', '1'));

