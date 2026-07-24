\encoding UTF-8

ALTER TABLE mam_usr_acl_all
 ADD CONSTRAINT mam_usr_acl_all_ck01 CHECK (pre_cl_usr_flg IN ('0', '1'));

