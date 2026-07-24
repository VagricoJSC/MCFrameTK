
COMMENT ON TABLE MAM_BOM_ALL IS 'ＢＯＭマスタ // BOM master';


COMMENT ON COLUMN MAM_BOM_ALL.BOM_KEY IS 'ＢＯＭキー // #MA.BOM_KEY // BOM key';


COMMENT ON COLUMN MAM_BOM_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MAM_BOM_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MAM_BOM_ALL.PAR_ITM_CD IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN MAM_BOM_ALL.PAR_ITM_SUB1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN MAM_BOM_ALL.PAR_ITM_SUB2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN MAM_BOM_ALL.PAR_ITM_SUB3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN MAM_BOM_ALL.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MAM_BOM_ALL.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MAM_BOM_ALL.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MAM_BOM_ALL.CHD_ITM_CD IS '子品目ＣＤ // #MA.ITM_CD // Child item cd.';


COMMENT ON COLUMN MAM_BOM_ALL.CHD_ITM_SUB1 IS '子枝番１ // #MA.ITM_SUB1 // Child branch No. 1';


COMMENT ON COLUMN MAM_BOM_ALL.CHD_ITM_SUB2 IS '子枝番２ // #MA.ITM_SUB2 // Child branch No. 2';


COMMENT ON COLUMN MAM_BOM_ALL.CHD_ITM_SUB3 IS '子枝番３ // #MA.ITM_SUB3 // Child branch No. 3';


COMMENT ON COLUMN MAM_BOM_ALL.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MAM_BOM_ALL.PH_FLG IS '架空ＦＬＧ // #MA.FLG // Phantom flg.';


COMMENT ON COLUMN MAM_BOM_ALL.PH_BOM_PTN IS '架空構成パタン // #MA.BOM_PTN // Phantom BOM pattern';


COMMENT ON COLUMN MAM_BOM_ALL.ALT_ITM_FLG IS '代替品目ＦＬＧ // #MA.FLG // Alternative item flg.';


COMMENT ON COLUMN MAM_BOM_ALL.ALT_GRP_CD IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN MAM_BOM_ALL.ALT_ITM_TYP IS '代替品目選択区分 // #MA.ALT_ITM_TYP // Alternative item selection type';


COMMENT ON COLUMN MAM_BOM_ALL.ALT_ITM_RATIO IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN MAM_BOM_ALL.ALT_ALLOC_PRIO IS '引当優先順 // #MA.INT // Allocation priority';


COMMENT ON COLUMN MAM_BOM_ALL.SNO_TYP1 IS '手配ＮＯ１区分 // #MA.SNO_TYP // SEIBAN No. 1 type';


COMMENT ON COLUMN MAM_BOM_ALL.SNO_TYP2 IS '手配ＮＯ２区分 // #MA.SNO_TYP // SEIBAN No. 2 type';


COMMENT ON COLUMN MAM_BOM_ALL.SNO_TYP3 IS '手配ＮＯ３区分 // #MA.SNO_TYP // SEIBAN No. 3 type';


COMMENT ON COLUMN MAM_BOM_ALL.SNO_TYP4 IS '手配ＮＯ４区分 // #MA.SNO_TYP // SEIBAN No. 4 type';


COMMENT ON COLUMN MAM_BOM_ALL.MIN_SNO1 IS '下限手配ＮＯ１ // #MA.SNO1 // Min. SEIBAN No. 1';


COMMENT ON COLUMN MAM_BOM_ALL.MAX_SNO1 IS '上限手配ＮＯ１ // #MA.SNO1 // Max. SEIBAN No. 1';


COMMENT ON COLUMN MAM_BOM_ALL.MIN_SNO2 IS '下限手配ＮＯ２ // #MA.SNO2 // Min. SEIBAN No. 2';


COMMENT ON COLUMN MAM_BOM_ALL.MAX_SNO2 IS '上限手配ＮＯ２ // #MA.SNO2 // Max. SEIBAN No. 2';


COMMENT ON COLUMN MAM_BOM_ALL.MIN_SNO3 IS '下限手配ＮＯ３ // #MA.SNO3 // Min. SEIBAN No. 3';


COMMENT ON COLUMN MAM_BOM_ALL.MAX_SNO3 IS '上限手配ＮＯ３ // #MA.SNO3 // Max. SEIBAN No. 3';


COMMENT ON COLUMN MAM_BOM_ALL.MIN_SNO4 IS '下限手配ＮＯ４ // #MA.SNO4 // Min. SEIBAN No. 4';


COMMENT ON COLUMN MAM_BOM_ALL.MAX_SNO4 IS '上限手配ＮＯ４ // #MA.SNO4 // Max. SEIBAN No. 4';


COMMENT ON COLUMN MAM_BOM_ALL.PAR_INST_QTY IS '親指図数量 // #MA.QTY // Parent order qty.';


COMMENT ON COLUMN MAM_BOM_ALL.CHD_INPT_QTY IS '子投入数量 // #MA.QTY // Child input qty.';


COMMENT ON COLUMN MAM_BOM_ALL.CHD_RQMT_QTY IS '子必要数量 // #MA.QTY // Child required qty.';


COMMENT ON COLUMN MAM_BOM_ALL.FXD_CHD_RQMT_QTY IS '子固定必要数量 // #MA.QTY // Child fixed required qty.';


COMMENT ON COLUMN MAM_BOM_ALL.BYPROD_FLG IS '副産品ＦＬＧ // #MA.FLG // By-product flg.';


COMMENT ON COLUMN MAM_BOM_ALL.IN_OFFST_TYP IS '投入オフセット区分 // #MA.OFFST_TYP // Input offset type';


COMMENT ON COLUMN MAM_BOM_ALL.IN_OFFST IS '投入オフセット // #MA.OFFST // Input offset';


COMMENT ON COLUMN MAM_BOM_ALL.BKF_TYP IS 'バックフラッシュ区分 // #MA.BKF_TYP // Backflush type';


COMMENT ON COLUMN MAM_BOM_ALL.INST_LOT_FIX_FLG IS '指図時ロット指定ＦＬＧ // #MA.FLG // Lot specification at order flg.';


COMMENT ON COLUMN MAM_BOM_ALL.LOT_MIX_FLG IS 'ロット混在ＦＬＧ // #MA.FLG // Lot mixed flg.';


COMMENT ON COLUMN MAM_BOM_ALL.SUBLOT_MIX_FLG IS 'サブロット混在ＦＬＧ // #MA.FLG // Sublot mixed flg.';


COMMENT ON COLUMN MAM_BOM_ALL.ALLOC_CTL_TYP IS '引当制御区分 // #MA.ALLOC_CTL_TYP // Allocation control type';


COMMENT ON COLUMN MAM_BOM_ALL.MAIN_ITM_FLG IS '引継対象子品目ＦＬＧ // #MA.FLG // Copy-from child item flg.';


COMMENT ON COLUMN MAM_BOM_ALL.YIELD_CALC_FLG IS '収率計算用ＦＬＧ // #MA.FLG // Yield calculation flg.';


COMMENT ON COLUMN MAM_BOM_ALL.INPT_CTL_TYP IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN MAM_BOM_ALL.DISP_SEQ IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN MAM_BOM_ALL.CHNG_NO IS '変更ＮＯ // #MA.CHNG_NO // Change No.';


COMMENT ON COLUMN MAM_BOM_ALL.EXT_SYS_NO_BOM IS '外部システムＮＯ // #MA.EXT_SYS_NO_BOM // External system No.';


COMMENT ON COLUMN MAM_BOM_ALL.NOT_COST_FLG IS '原価対象外ＦＬＧ // #MA.FLG // Not costing flg.';


COMMENT ON COLUMN MAM_BOM_ALL.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MAM_BOM_ALL.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MAM_BOM_ALL.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_BOM_ALL.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_BOM_ALL.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_BOM_ALL.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_BOM_ALL.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_BOM_ALL.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_BOM_ALL.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_BOM_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_BOM_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_BOM_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_BOM_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_BOM_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_BOM_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_BOM_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_BOM_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_BOM_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_BOM_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

