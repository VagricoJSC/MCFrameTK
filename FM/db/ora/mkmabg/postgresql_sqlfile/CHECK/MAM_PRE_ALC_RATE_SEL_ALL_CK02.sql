\encoding UTF-8

ALTER TABLE mam_pre_alc_rate_sel_all
 ADD CONSTRAINT mam_pre_alc_rate_sel_all_ck02 CHECK (del_flg IN ('0', '1'));

