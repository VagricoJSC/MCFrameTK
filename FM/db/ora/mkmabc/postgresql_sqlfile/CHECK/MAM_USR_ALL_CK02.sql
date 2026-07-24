\encoding UTF-8

ALTER TABLE mam_usr_all
 ADD CONSTRAINT mam_usr_all_ck02 CHECK (del_flg IN ('0', '1'));

