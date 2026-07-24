\encoding UTF-8

ALTER TABLE mam_ext_sys_cmn
 ADD CONSTRAINT mam_ext_sys_cmn_ck07 CHECK (null_val_if_flg IN ('0', '1'));

