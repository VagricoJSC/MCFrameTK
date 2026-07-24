\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck39 CHECK (insp_input_flg IN ('0', '1'));

