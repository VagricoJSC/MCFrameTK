\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck26 CHECK (purc_dlv_slip_flg IN ('0', '1'));

