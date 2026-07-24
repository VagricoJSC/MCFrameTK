\encoding UTF-8

ALTER TABLE mam_ext_sys_all
 ADD CONSTRAINT mam_ext_sys_all_ck07 CHECK (null_val_if_flg IN ('0', '1'));

