\encoding UTF-8

ALTER TABLE mam_if_cd_rule_cmn
 ADD CONSTRAINT mam_if_cd_rule_cmn_ck01 CHECK (del_flg IN ('0', '1'));

