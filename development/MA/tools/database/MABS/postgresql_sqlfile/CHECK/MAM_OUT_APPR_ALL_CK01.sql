\encoding UTF-8

ALTER TABLE mam_out_appr_all
 ADD CONSTRAINT mam_out_appr_all_ck01 CHECK (main_appr_flg IN ('0', '1'));

