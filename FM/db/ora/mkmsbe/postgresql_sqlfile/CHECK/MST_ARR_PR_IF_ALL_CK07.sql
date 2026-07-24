\encoding UTF-8

ALTER TABLE mst_arr_pr_if_all
 ADD CONSTRAINT mst_arr_pr_if_all_ck07 CHECK (bi_not_send_flg IN ('0', '1'));

