\encoding UTF-8

ALTER TABLE mam_rsn_ac_all
 ADD CONSTRAINT mam_rsn_ac_all_ck01 CHECK (del_flg IN ('0', '1'));

