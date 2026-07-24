\encoding UTF-8

ALTER TABLE mam_alc_rule_all
 ADD CONSTRAINT mam_alc_rule_all_ck02 CHECK (non_minus_flg IN ('0', '1'));

