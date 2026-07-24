\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck18 CHECK (wrk_ar_flg IN ('0', '1'));

