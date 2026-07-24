\encoding UTF-8

ALTER TABLE mam_dmnd_div_all
 ADD CONSTRAINT mam_dmnd_div_all_ck01 CHECK (del_flg IN ('0', '1'));

