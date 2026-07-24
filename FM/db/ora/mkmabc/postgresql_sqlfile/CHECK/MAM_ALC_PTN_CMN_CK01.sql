\encoding UTF-8

ALTER TABLE mam_alc_ptn_cmn
 ADD CONSTRAINT mam_alc_ptn_cmn_ck01 CHECK (del_flg IN ('0', '1'));

