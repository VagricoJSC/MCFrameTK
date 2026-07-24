\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck36 CHECK (sls_input_flg IN ('0', '1'));

