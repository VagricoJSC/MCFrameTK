\encoding UTF-8

ALTER TABLE mam_itm_comp_grp_cmn
 ADD CONSTRAINT mam_itm_comp_grp_cmn_ck03 CHECK (del_flg IN ('0', '1'));

