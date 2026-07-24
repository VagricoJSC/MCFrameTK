\encoding UTF-8

ALTER TABLE mam_xpns_purc_alc_all
 ADD CONSTRAINT mam_xpns_purc_alc_all_ck04 CHECK (sublot_no_flg IN ('0', '1'));

