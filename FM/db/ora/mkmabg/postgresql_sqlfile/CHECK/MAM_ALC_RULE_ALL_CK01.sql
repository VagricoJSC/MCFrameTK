\encoding UTF-8

ALTER TABLE mam_alc_rule_all
 ADD CONSTRAINT mam_alc_rule_all_ck01 CHECK (coef_limit_flg IN ('0', '1'));

