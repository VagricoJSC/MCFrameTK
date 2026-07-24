\encoding UTF-8

ALTER TABLE mam_usr_acl_all
 ADD CONSTRAINT mam_usr_acl_all_ck02 CHECK (cl_usr_flg IN ('0', '1'));

