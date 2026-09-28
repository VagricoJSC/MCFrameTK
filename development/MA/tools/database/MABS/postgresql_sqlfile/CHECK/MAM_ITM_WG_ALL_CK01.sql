\encoding UTF-8

ALTER TABLE mam_itm_wg_all
 ADD CONSTRAINT mam_itm_wg_all_ck01 CHECK (unit_exp_flg IN ('0', '1'));

