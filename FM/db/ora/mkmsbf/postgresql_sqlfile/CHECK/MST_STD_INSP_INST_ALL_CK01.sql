\encoding UTF-8

ALTER TABLE mst_std_insp_inst_all
 ADD CONSTRAINT mst_std_insp_inst_all_ck01 CHECK (add_point_flg IN ('0', '1'));

