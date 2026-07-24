\encoding UTF-8

ALTER TABLE mam_ext_sys_all
 ADD CONSTRAINT mam_ext_sys_all_ck11 CHECK (del_flg IN ('0', '1'));

