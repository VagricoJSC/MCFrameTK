\encoding UTF-8

ALTER TABLE mst_io_act_if_all
 ADD CONSTRAINT mst_io_act_if_all_ck09 CHECK (bi_not_send_flg IN ('0', '1'));

