\encoding UTF-8

ALTER TABLE mam_ac_itm_grp_cmn
 ADD CONSTRAINT mam_ac_itm_grp_cmn_ck01 CHECK (del_flg IN ('0', '1'));

