\encoding UTF-8

ALTER TABLE mst_insp_act_d_all
 ADD CONSTRAINT mst_insp_act_d_all_ck01 CHECK (lims_flg IN ('0', '1'));

