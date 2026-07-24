\encoding UTF-8

ALTER TABLE mam_rsrc_cmn
 ADD CONSTRAINT mam_rsrc_cmn_ck01 CHECK (del_flg IN ('0', '1'));

