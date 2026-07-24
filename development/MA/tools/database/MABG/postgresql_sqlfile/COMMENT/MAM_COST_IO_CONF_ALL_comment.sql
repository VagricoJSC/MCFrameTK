\encoding UTF-8

COMMENT ON TABLE mam_cost_io_conf_all IS '原価個別受払表構成マスタ_（全社）_ // Custom T account configuration master_(Company-wide)_';


COMMENT ON COLUMN mam_cost_io_conf_all.cost_io_id IS '受払表ＩＤ // #MA.COST_IO_ID // GR/GI list ID';


COMMENT ON COLUMN mam_cost_io_conf_all.io_col_cd IS '受払項目ＣＤ // #MA.IO_COL_CD // GR/GI column cd.';


COMMENT ON COLUMN mam_cost_io_conf_all.io_col_nm IS '受払項目名 // #MA.IO_COL_NM // GR/GI column name';


COMMENT ON COLUMN mam_cost_io_conf_all.io_seq IS '表示順 // #MA.INT2 // Display order';


COMMENT ON COLUMN mam_cost_io_conf_all.io_tgt_typ IS '受払対象区分 // #MA.IO_TGT_TYP // GR/GI type';


COMMENT ON COLUMN mam_cost_io_conf_all.io_sml_typ IS '受払集計単位区分 // #MA.IO_SML_TYP // GR/GI aggregated unit type';


COMMENT ON COLUMN mam_cost_io_conf_all.unit_flg IS '単価表示ＦＬＧ // #MA.FLG // Unit price display flg.';


COMMENT ON COLUMN mam_cost_io_conf_all.qty_flg IS '数量表示ＦＬＧ // #MA.FLG // Display qty. flg.';


COMMENT ON COLUMN mam_cost_io_conf_all.amt_flg IS '金額表示ＦＬＧ // #MA.FLG // Display amount flg.';


COMMENT ON COLUMN mam_cost_io_conf_all.std_flg IS '標準表示ＦＬＧ // #MA.FLG // Display standard flg.';


COMMENT ON COLUMN mam_cost_io_conf_all.diff_flg IS '差異表示ＦＬＧ // #MA.FLG // Display variance flg.';


COMMENT ON COLUMN mam_cost_io_conf_all.bal_calc_typ IS '差額計算区分 // #MA.BAL_CALC_TYP // Variance calculation type';


COMMENT ON COLUMN mam_cost_io_conf_all.minus_flg IS 'マイナスＦＬＧ // #MA.FLG // Minus flg.';


COMMENT ON COLUMN mam_cost_io_conf_all.fg_r IS '前景色（Ｒ） // #MA.RGB // Foreground color (R)';


COMMENT ON COLUMN mam_cost_io_conf_all.fg_g IS '前景色（Ｇ） // #MA.RGB // Foreground color (G)';


COMMENT ON COLUMN mam_cost_io_conf_all.fg_b IS '前景色（Ｂ） // #MA.RGB // Foreground color (B)';


COMMENT ON COLUMN mam_cost_io_conf_all.bg_r IS '背景色（Ｒ） // #MA.RGB // Background color (R)';


COMMENT ON COLUMN mam_cost_io_conf_all.bg_g IS '背景色（Ｇ） // #MA.RGB // Background color (G)';


COMMENT ON COLUMN mam_cost_io_conf_all.bg_b IS '背景色（Ｂ） // #MA.RGB // Background color (B)';


COMMENT ON COLUMN mam_cost_io_conf_all.prov_expns_flg IS '有償差額有ＦＬＧ // #MA.FLG // Gain or loss of chargeable supply flg.';


COMMENT ON COLUMN mam_cost_io_conf_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_cost_io_conf_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_cost_io_conf_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_cost_io_conf_all.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_cost_io_conf_all.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_cost_io_conf_all.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_cost_io_conf_all.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_cost_io_conf_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_cost_io_conf_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_cost_io_conf_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_cost_io_conf_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_cost_io_conf_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_cost_io_conf_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_cost_io_conf_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_cost_io_conf_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_cost_io_conf_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_cost_io_conf_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mam_cost_io_conf_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';

