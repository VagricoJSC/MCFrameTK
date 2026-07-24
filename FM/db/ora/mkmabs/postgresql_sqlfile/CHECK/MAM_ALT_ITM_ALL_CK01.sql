\encoding UTF-8

ALTER TABLE mam_alt_itm_all
 ADD CONSTRAINT mam_alt_itm_all_ck01 CHECK (not_cost_flg IN ('0', '1'));

