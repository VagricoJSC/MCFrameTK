\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck38 CHECK (purc_input_flg IN ('0', '1'));

