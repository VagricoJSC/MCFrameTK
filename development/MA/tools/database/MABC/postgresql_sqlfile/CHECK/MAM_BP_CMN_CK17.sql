\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck17 CHECK (sls_tax_cd_prio_flg IN ('0', '1'));

