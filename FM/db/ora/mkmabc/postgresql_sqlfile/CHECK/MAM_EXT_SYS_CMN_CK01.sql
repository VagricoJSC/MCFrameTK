\encoding UTF-8

ALTER TABLE mam_ext_sys_cmn
 ADD CONSTRAINT mam_ext_sys_cmn_ck01 CHECK (web_api_flg IN ('0', '1'));

