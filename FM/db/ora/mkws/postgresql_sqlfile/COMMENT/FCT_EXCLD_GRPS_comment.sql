\encoding UTF-8

COMMENT ON TABLE fct_excld_grps IS '排他中グループ // Excluded group';


COMMENT ON COLUMN fct_excld_grps.req_no IS 'サーバ処理番号 // #FC.SRV_REQ_NO // Server process number';


COMMENT ON COLUMN fct_excld_grps.ope_id IS 'オペレーションＩＤ // #FC.PARA_ITM_PTN // Operation ID';


COMMENT ON COLUMN fct_excld_grps.gid IS '内部グループＩＤ // #FC.ROW_ID // Internal group ID';


COMMENT ON COLUMN fct_excld_grps.man_flg IS '手動ＦＬＧ // #FC.FLG // Manual flg.';

