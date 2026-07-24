\encoding UTF-8

ALTER TABLE mst_insp_act_all
 ADD CONSTRAINT mst_insp_act_all_ck02 CHECK (lims_flg IN ('0', '1'));

