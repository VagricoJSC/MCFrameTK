\encoding UTF-8

ALTER TABLE mbt_jnl_history_all
 ADD CONSTRAINT mbt_jnl_history_all_ck01 CHECK (rerun_flg IN ('0', '1'));

