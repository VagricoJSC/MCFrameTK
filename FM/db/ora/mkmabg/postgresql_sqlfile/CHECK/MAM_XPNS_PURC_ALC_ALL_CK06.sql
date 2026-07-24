\encoding UTF-8

ALTER TABLE mam_xpns_purc_alc_all
 ADD CONSTRAINT mam_xpns_purc_alc_all_ck06 CHECK (sno2_flg IN ('0', '1'));

