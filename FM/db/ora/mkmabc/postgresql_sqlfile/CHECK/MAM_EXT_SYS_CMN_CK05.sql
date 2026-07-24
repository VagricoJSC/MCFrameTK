\encoding UTF-8

ALTER TABLE mam_ext_sys_cmn
 ADD CONSTRAINT mam_ext_sys_cmn_ck05 CHECK (not_dup_imp_flg IN ('0', '1'));

