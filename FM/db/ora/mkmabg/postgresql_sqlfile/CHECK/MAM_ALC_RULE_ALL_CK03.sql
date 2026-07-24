\encoding UTF-8

ALTER TABLE mam_alc_rule_all
 ADD CONSTRAINT mam_alc_rule_all_ck03 CHECK (non_os_flg IN ('0', '1'));

