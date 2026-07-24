\encoding UTF-8

ALTER TABLE mam_edi_if_ctl_all
 ADD CONSTRAINT mam_edi_if_ctl_all_ck01 CHECK (not_onr_prov_flg IN ('0', '1'));

