\encoding UTF-8

ALTER TABLE mst_arr_act_all
 ADD CONSTRAINT mst_arr_act_all_ck05 CHECK (edi_flg IN ('0', '1'));

