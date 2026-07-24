\encoding UTF-8

ALTER TABLE mam_gp_alc_cmn
 ADD CONSTRAINT mam_gp_alc_cmn_ck01 CHECK (del_flg IN ('0', '1'));

