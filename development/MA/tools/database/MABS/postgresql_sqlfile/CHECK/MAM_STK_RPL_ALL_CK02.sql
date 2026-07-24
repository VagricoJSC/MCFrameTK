\encoding UTF-8

ALTER TABLE mam_stk_rpl_all
 ADD CONSTRAINT mam_stk_rpl_all_ck02 CHECK (lot_sizing_flg IN ('0', '1'));

