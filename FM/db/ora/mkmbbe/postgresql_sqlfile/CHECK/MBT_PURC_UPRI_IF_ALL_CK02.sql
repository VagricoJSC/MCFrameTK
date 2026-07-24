\encoding UTF-8

ALTER TABLE mbt_purc_upri_if_all
 ADD CONSTRAINT mbt_purc_upri_if_all_ck02 CHECK (interim_flg IN ('0', '1'));

