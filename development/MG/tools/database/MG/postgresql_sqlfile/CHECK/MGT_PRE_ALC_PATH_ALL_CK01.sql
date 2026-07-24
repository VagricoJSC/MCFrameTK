\encoding UTF-8

ALTER TABLE mgt_pre_alc_path_all
 ADD CONSTRAINT mgt_pre_alc_path_all_ck01 CHECK (fin_flg IN ('0', '1'));

