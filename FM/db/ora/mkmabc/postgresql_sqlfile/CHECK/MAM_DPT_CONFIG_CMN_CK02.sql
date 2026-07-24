\encoding UTF-8

ALTER TABLE mam_dpt_config_cmn
 ADD CONSTRAINT mam_dpt_config_cmn_ck02 CHECK (del_flg IN ('0', '1'));

