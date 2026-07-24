\encoding UTF-8

ALTER TABLE mst_oper_inst_p_all
 ADD CONSTRAINT mst_oper_inst_p_all_ck09 CHECK (mes_flg IN ('0', '1'));

