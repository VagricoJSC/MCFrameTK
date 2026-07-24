\encoding UTF-8

ALTER TABLE mam_loc_all
 ADD CONSTRAINT mam_loc_all_ck03 CHECK (ddlv_prov_insp_flg IN ('0', '1'));

