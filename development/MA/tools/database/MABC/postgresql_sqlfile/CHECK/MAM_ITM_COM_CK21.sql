\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck21 CHECK (comp_rev_at_slo_flg IN ('0', '1'));

