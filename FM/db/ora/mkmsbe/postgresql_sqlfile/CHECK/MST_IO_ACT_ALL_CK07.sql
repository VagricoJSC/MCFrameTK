\encoding UTF-8

ALTER TABLE mst_io_act_all
 ADD CONSTRAINT mst_io_act_all_ck07 CHECK (accrual_flg IN ('0', '1'));

