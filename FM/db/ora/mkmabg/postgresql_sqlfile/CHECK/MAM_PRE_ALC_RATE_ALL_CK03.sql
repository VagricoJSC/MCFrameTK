\encoding UTF-8

ALTER TABLE mam_pre_alc_rate_all
 ADD CONSTRAINT mam_pre_alc_rate_all_ck03 CHECK (pln_rule_flg IN ('0', '1'));

