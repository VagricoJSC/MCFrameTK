\encoding UTF-8

ALTER TABLE mam_ext_sys_all
 ADD CONSTRAINT mam_ext_sys_all_ck09 CHECK (amt_not_chk_flg IN ('0', '1'));

