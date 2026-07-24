\encoding UTF-8

ALTER TABLE mbt_purc_upri_if_all
 ADD CONSTRAINT mbt_purc_upri_if_all_ck03 CHECK (not_cost_flg IN ('0', '1'));

