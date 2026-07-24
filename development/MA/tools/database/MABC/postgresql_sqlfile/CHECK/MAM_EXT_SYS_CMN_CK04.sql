\encoding UTF-8

ALTER TABLE mam_ext_sys_cmn
 ADD CONSTRAINT mam_ext_sys_cmn_ck04 CHECK (not_send_upd_flg IN ('0', '1'));

