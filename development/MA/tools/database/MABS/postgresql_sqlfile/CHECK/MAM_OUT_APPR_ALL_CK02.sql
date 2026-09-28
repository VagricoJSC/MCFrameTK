\encoding UTF-8

ALTER TABLE mam_out_appr_all
 ADD CONSTRAINT mam_out_appr_all_ck02 CHECK (del_flg IN ('0', '1'));

