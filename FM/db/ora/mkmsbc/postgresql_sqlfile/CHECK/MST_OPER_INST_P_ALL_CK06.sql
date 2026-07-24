\encoding UTF-8

ALTER TABLE mst_oper_inst_p_all
 ADD CONSTRAINT mst_oper_inst_p_all_ck06 CHECK (yield_oper_flg IN ('0', '1'));

