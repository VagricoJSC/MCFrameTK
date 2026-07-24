\encoding UTF-8

ALTER TABLE mam_itm_insp_ptn_all
 ADD CONSTRAINT mam_itm_insp_ptn_all_ck02 CHECK (std_cnf_req_flg IN ('0', '1'));

