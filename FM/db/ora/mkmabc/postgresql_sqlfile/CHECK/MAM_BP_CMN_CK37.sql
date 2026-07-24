\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck37 CHECK (purc_tax_cd_prio_flg IN ('0', '1'));

