\encoding UTF-8

ALTER TABLE mam_ext_sys_all
 ADD CONSTRAINT mam_ext_sys_all_ck01 CHECK (web_api_flg IN ('0', '1'));

