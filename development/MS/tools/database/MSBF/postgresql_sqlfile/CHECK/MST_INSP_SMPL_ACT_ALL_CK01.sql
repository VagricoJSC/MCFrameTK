\encoding UTF-8

ALTER TABLE mst_insp_smpl_act_all
 ADD CONSTRAINT mst_insp_smpl_act_all_ck01 CHECK (so_cmpl_flg IN ('0', '1'));

