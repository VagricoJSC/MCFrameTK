\encoding UTF-8

ALTER TABLE mam_ac_rsn_all
 ADD CONSTRAINT mam_ac_rsn_all_ck03 CHECK (del_flg IN ('0', '1'));

