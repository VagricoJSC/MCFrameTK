\encoding UTF-8

ALTER TABLE mam_usr_cmn
 ADD CONSTRAINT mam_usr_cmn_ck02 CHECK (del_flg IN ('0', '1'));

