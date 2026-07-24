\encoding UTF-8

ALTER TABLE mam_itm_comp_grp_cmn
 ADD CONSTRAINT mam_itm_comp_grp_cmn_ck02 CHECK (req_flg IN ('0', '1'));

