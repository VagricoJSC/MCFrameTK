\encoding UTF-8

ALTER TABLE mam_alc_other_all
 ADD CONSTRAINT mam_alc_other_all_ck02 CHECK (del_flg IN ('0', '1'));

