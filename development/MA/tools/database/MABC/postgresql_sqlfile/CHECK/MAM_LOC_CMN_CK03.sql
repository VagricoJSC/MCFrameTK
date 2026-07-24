\encoding UTF-8

ALTER TABLE mam_loc_cmn
 ADD CONSTRAINT mam_loc_cmn_ck03 CHECK (ddlv_prov_insp_flg IN ('0', '1'));

