\encoding UTF-8

ALTER TABLE mst_insp_inst_send_if_all
 ADD CONSTRAINT mst_insp_inst_send_if_all_ck02 CHECK (insp_lst_prnt_flg IN ('0', '1'));

