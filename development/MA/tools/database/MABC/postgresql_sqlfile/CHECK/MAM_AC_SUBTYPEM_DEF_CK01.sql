\encoding UTF-8

ALTER TABLE mam_ac_subtypem_def
 ADD CONSTRAINT mam_ac_subtypem_def_ck01 CHECK (del_flg IN ('0', '1'));

