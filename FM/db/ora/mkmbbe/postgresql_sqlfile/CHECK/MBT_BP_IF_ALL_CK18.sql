\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck18 CHECK (sls_tax_cd_prio_flg IN ('0', '1'));

