\encoding UTF-8

ALTER TABLE mam_pre_alc_ctg_all
 ADD CONSTRAINT mam_pre_alc_ctg_all_ck01 CHECK (rate_coeff_flg IN ('0', '1'));

