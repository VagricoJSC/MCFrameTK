\encoding UTF-8

ALTER TABLE mam_xpns_purc_alc_all
 ADD CONSTRAINT mam_xpns_purc_alc_all_ck05 CHECK (sno1_flg IN ('0', '1'));

