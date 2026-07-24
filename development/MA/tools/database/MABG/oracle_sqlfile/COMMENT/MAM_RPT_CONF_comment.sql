
COMMENT ON TABLE MAM_RPT_CONF IS '原価レポート構成マスタ // Cost report structure master';


COMMENT ON COLUMN MAM_RPT_CONF.RPT_PTN_CD IS 'レポートパタンＣＤ // #MA.RPT_PTN_CD // Report pattern cd.';


COMMENT ON COLUMN MAM_RPT_CONF.RPT_ROW_CD IS 'レポート行ＣＤ // #MA.RPT_ROW_CD // Report row cd.';


COMMENT ON COLUMN MAM_RPT_CONF.RPT_PRE_WORD IS '接頭語 // #MA.RPT_PRE_WORD // Prefix';


COMMENT ON COLUMN MAM_RPT_CONF.RPT_ROW_NM IS 'レポート行名 // #MA.RPT_ROW_NM // Report row name';


COMMENT ON COLUMN MAM_RPT_CONF.BASE_RPT_ROW_NM IS 'レポート行名（ベース） // #MA.RPT_ROW_NM // Report row name(Base)';


COMMENT ON COLUMN MAM_RPT_CONF.RPT_SEQ IS '表示順 // #MA.INT3 // Display order';


COMMENT ON COLUMN MAM_RPT_CONF.SML_FLG IS '集計行ＦＬＧ // #MA.FLG // Aggregated row flg.';


COMMENT ON COLUMN MAM_RPT_CONF.HDN_FLG IS '非表示ＦＬＧ // #MA.FLG // Hide flg.';


COMMENT ON COLUMN MAM_RPT_CONF.RPT_TGT_TYP IS 'レポート対象区分 // #MA.RPT_TGT_TYP // Report type';


COMMENT ON COLUMN MAM_RPT_CONF.COST_IO_TYP IS '原価入出庫区分 // #MA.COST_IO_TYP // Cost GR/GI type';


COMMENT ON COLUMN MAM_RPT_CONF.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MAM_RPT_CONF.STD_FLG IS '標準ＦＬＧ // #MA.FLG // Standard flg.';


COMMENT ON COLUMN MAM_RPT_CONF.QTY_UNIT_TYP IS '数量単位区分 // #MA.QTY_UNIT_TYP // Quantity unit type';


COMMENT ON COLUMN MAM_RPT_CONF.ALC_AC_GRP_CD1 IS '配賦科目グループ１ // #MA.ALC_AC_GRP_CD // Allocation account group 1';


COMMENT ON COLUMN MAM_RPT_CONF.ALC_AC_GRP_CD2 IS '配賦科目グループ２ // #MA.ALC_AC_GRP_CD // Allocation account group 2';


COMMENT ON COLUMN MAM_RPT_CONF.ALC_AC_GRP_CD3 IS '配賦科目グループ３ // #MA.ALC_AC_GRP_CD // Allocation account group 3';


COMMENT ON COLUMN MAM_RPT_CONF.ALC_AC_CD IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN MAM_RPT_CONF.AC_SLIP_TYP IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN MAM_RPT_CONF.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MAM_RPT_CONF.ITM_JNL_CD IS '品目仕訳ＣＤ // #MA.ITM_JNL_CD // Item journal cd.';


COMMENT ON COLUMN MAM_RPT_CONF.ITM_GRP_CD1 IS '品目分類ＣＤ１ // #MA.ITM_GRP_CD // Item classification cd. 1';


COMMENT ON COLUMN MAM_RPT_CONF.ITM_GRP_CD2 IS '品目分類ＣＤ２ // #MA.ITM_GRP_CD // Item classification cd. 2';


COMMENT ON COLUMN MAM_RPT_CONF.ITM_GRP_CD3 IS '品目分類ＣＤ３ // #MA.ITM_GRP_CD // Item classification cd. 3';


COMMENT ON COLUMN MAM_RPT_CONF.ITM_GRP_CD4 IS '品目分類ＣＤ４ // #MA.ITM_GRP_CD // Item classification cd. 4';


COMMENT ON COLUMN MAM_RPT_CONF.ITM_GRP_CD5 IS '品目分類ＣＤ５ // #MA.ITM_GRP_CD // Item classification cd. 5';


COMMENT ON COLUMN MAM_RPT_CONF.ITM_GRP_CD6 IS '品目分類ＣＤ６ // #MA.ITM_GRP_CD // Item classification cd. 6';


COMMENT ON COLUMN MAM_RPT_CONF.ITM_GRP_CD7 IS '品目分類ＣＤ７ // #MA.ITM_GRP_CD // Item classification cd. 7';


COMMENT ON COLUMN MAM_RPT_CONF.ITM_GRP_CD8 IS '品目分類ＣＤ８ // #MA.ITM_GRP_CD // Item classification cd. 8';


COMMENT ON COLUMN MAM_RPT_CONF.ITM_GRP_CD9 IS '品目分類ＣＤ９ // #MA.ITM_GRP_CD // Item classification cd. 9';


COMMENT ON COLUMN MAM_RPT_CONF.ITM_GRP_CD10 IS '品目分類ＣＤ１０ // #MA.ITM_GRP_CD // Item classification cd. 10';


COMMENT ON COLUMN MAM_RPT_CONF.EXPNS_TYP IS '費目区分 // #MA.EXPNS_TYP // Cost element type';


COMMENT ON COLUMN MAM_RPT_CONF.DIRECT_TYP IS '直間区分 // #MA.DIRECT_TYP // Direct/Indirect type';


COMMENT ON COLUMN MAM_RPT_CONF.VAR_TYP IS '固変区分 // #MA.VAR_TYP // Constant/variable type';


COMMENT ON COLUMN MAM_RPT_CONF.EXPNS_GRP_CD IS '費目グループＣＤ // #MA.EXPNS_GRP_CD // Cost element group cd.';


COMMENT ON COLUMN MAM_RPT_CONF.EXPNS_CD IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN MAM_RPT_CONF.FG_R IS '前景色（Ｒ） // #MA.RGB // Foreground color (R)';


COMMENT ON COLUMN MAM_RPT_CONF.FG_G IS '前景色（Ｇ） // #MA.RGB // Foreground color (G)';


COMMENT ON COLUMN MAM_RPT_CONF.FG_B IS '前景色（Ｂ） // #MA.RGB // Foreground color (B)';


COMMENT ON COLUMN MAM_RPT_CONF.BG_R IS '背景色（Ｒ） // #MA.RGB // Background color (R)';


COMMENT ON COLUMN MAM_RPT_CONF.BG_G IS '背景色（Ｇ） // #MA.RGB // Background color (G)';


COMMENT ON COLUMN MAM_RPT_CONF.BG_B IS '背景色（Ｂ） // #MA.RGB // Background color (B)';


COMMENT ON COLUMN MAM_RPT_CONF.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_RPT_CONF.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_RPT_CONF.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_RPT_CONF.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_RPT_CONF.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_RPT_CONF.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_RPT_CONF.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_RPT_CONF.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_RPT_CONF.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_RPT_CONF.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_RPT_CONF.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_RPT_CONF.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_RPT_CONF.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_RPT_CONF.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_RPT_CONF.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_RPT_CONF.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_RPT_CONF.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

