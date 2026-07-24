\encoding UTF-8

ALTER TABLE mam_attach_info_cmn
 ADD CONSTRAINT mam_attach_info_cmn_ck01 CHECK (del_flg IN ('0', '1'));

