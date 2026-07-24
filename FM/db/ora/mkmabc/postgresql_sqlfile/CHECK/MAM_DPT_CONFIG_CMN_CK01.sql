\encoding UTF-8

ALTER TABLE mam_dpt_config_cmn
 ADD CONSTRAINT mam_dpt_config_cmn_ck01 CHECK (oper_null_flg IN ('0', '1'));

