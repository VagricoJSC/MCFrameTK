
COMMENT ON TABLE MAM_COST_IO_CONF_CMN IS '原価個別受払表構成マスタ_（共通）_ // Custom T account configuration master_(Common)_';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.COST_IO_ID IS '受払表ＩＤ // #MA.COST_IO_ID // GR/GI list ID';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.IO_COL_CD IS '受払項目ＣＤ // #MA.IO_COL_CD // GR/GI column cd.';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.IO_COL_NM IS '受払項目名 // #MA.IO_COL_NM // GR/GI column name';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.IO_SEQ IS '表示順 // #MA.INT2 // Display order';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.IO_TGT_TYP IS '受払対象区分 // #MA.IO_TGT_TYP // GR/GI type';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.IO_SML_TYP IS '受払集計単位区分 // #MA.IO_SML_TYP // GR/GI aggregated unit type';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.UNIT_FLG IS '単価表示ＦＬＧ // #MA.FLG // Unit price display flg.';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.QTY_FLG IS '数量表示ＦＬＧ // #MA.FLG // Display qty. flg.';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.AMT_FLG IS '金額表示ＦＬＧ // #MA.FLG // Display amount flg.';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.STD_FLG IS '標準表示ＦＬＧ // #MA.FLG // Display standard flg.';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.DIFF_FLG IS '差異表示ＦＬＧ // #MA.FLG // Display variance flg.';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.BAL_CALC_TYP IS '差額計算区分 // #MA.BAL_CALC_TYP // Variance calculation type';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.MINUS_FLG IS 'マイナスＦＬＧ // #MA.FLG // Minus flg.';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.FG_R IS '前景色（Ｒ） // #MA.RGB // Foreground color (R)';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.FG_G IS '前景色（Ｇ） // #MA.RGB // Foreground color (G)';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.FG_B IS '前景色（Ｂ） // #MA.RGB // Foreground color (B)';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.BG_R IS '背景色（Ｒ） // #MA.RGB // Background color (R)';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.BG_G IS '背景色（Ｇ） // #MA.RGB // Background color (G)';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.BG_B IS '背景色（Ｂ） // #MA.RGB // Background color (B)';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.PROV_EXPNS_FLG IS '有償差額有ＦＬＧ // #MA.FLG // Gain or loss of chargeable supply flg.';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_COST_IO_CONF_CMN.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

