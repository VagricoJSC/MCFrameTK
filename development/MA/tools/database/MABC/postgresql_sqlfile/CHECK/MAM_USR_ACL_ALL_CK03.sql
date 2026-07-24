\encoding UTF-8

ALTER TABLE mam_usr_acl_all
 ADD CONSTRAINT mam_usr_acl_all_ck03 CHECK (del_flg IN ('0', '1'));

