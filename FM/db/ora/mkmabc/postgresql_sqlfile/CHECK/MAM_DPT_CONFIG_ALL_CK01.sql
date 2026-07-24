\encoding UTF-8

ALTER TABLE mam_dpt_config_all
 ADD CONSTRAINT mam_dpt_config_all_ck01 CHECK (oper_null_flg IN ('0', '1'));

