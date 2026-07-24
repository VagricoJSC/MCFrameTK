\encoding UTF-8

ALTER TABLE mam_gp_bom_all
 ADD CONSTRAINT mam_gp_bom_all_ck09 CHECK (not_cost_flg IN ('0', '1'));

