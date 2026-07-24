\encoding UTF-8

ALTER TABLE mam_bp_itm_all
 ADD CONSTRAINT mam_bp_itm_all_ck01 CHECK (def_flg IN ('0', '1'));

