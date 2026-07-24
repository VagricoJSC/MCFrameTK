\encoding UTF-8

ALTER TABLE mst_insp_inst_all
 ADD CONSTRAINT mst_insp_inst_all_ck09 CHECK (lims_flg IN ('0', '1'));

