\encoding UTF-8

ALTER TABLE mam_itm_comp_grp_cmn
 ADD CONSTRAINT mam_itm_comp_grp_cmn_ck01 CHECK (multi_sel_flg IN ('0', '1'));

