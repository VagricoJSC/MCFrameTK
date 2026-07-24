\encoding UTF-8

ALTER TABLE mam_purc_upri_all
 ADD CONSTRAINT mam_purc_upri_all_ck02 CHECK (not_cost_flg IN ('0', '1'));

