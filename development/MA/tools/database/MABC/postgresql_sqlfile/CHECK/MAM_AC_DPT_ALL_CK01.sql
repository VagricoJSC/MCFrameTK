\encoding UTF-8

ALTER TABLE mam_ac_dpt_all
 ADD CONSTRAINT mam_ac_dpt_all_ck01 CHECK (del_flg IN ('0', '1'));

