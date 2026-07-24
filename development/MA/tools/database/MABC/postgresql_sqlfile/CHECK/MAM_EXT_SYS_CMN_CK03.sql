\encoding UTF-8

ALTER TABLE mam_ext_sys_cmn
 ADD CONSTRAINT mam_ext_sys_cmn_ck03 CHECK (real_imp_flg IN ('0', '1'));

