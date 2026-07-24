
COMMENT ON TABLE MAM_GP_BOM_ALL IS '汎用ＢＯＭマスタ // General purpose BOM master';


COMMENT ON COLUMN MAM_GP_BOM_ALL.BOM_TYP IS 'ＢＯＭ区分 // #MA.BOM_TYP // BOM type';


COMMENT ON COLUMN MAM_GP_BOM_ALL.BOM_KEY IS 'ＢＯＭキー // #MA.BOM_KEY // BOM key';


COMMENT ON COLUMN MAM_GP_BOM_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.PAR_ITM_CD IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.PAR_ITM_SUB1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN MAM_GP_BOM_ALL.PAR_ITM_SUB2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN MAM_GP_BOM_ALL.PAR_ITM_SUB3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN MAM_GP_BOM_ALL.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MAM_GP_BOM_ALL.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MAM_GP_BOM_ALL.CHD_ITM_CD IS '子品目ＣＤ // #MA.ITM_CD // Child item cd.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.CHD_ITM_SUB1 IS '子枝番１ // #MA.ITM_SUB1 // Child branch No. 1';


COMMENT ON COLUMN MAM_GP_BOM_ALL.CHD_ITM_SUB2 IS '子枝番２ // #MA.ITM_SUB2 // Child branch No. 2';


COMMENT ON COLUMN MAM_GP_BOM_ALL.CHD_ITM_SUB3 IS '子枝番３ // #MA.ITM_SUB3 // Child branch No. 3';


COMMENT ON COLUMN MAM_GP_BOM_ALL.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.PH_FLG IS '架空ＦＬＧ // #MA.FLG // Phantom flg.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.PH_BOM_PTN IS '架空構成パタン // #MA.BOM_PTN // Phantom BOM pattern';


COMMENT ON COLUMN MAM_GP_BOM_ALL.ALT_ITM_FLG IS '代替品目ＦＬＧ // #MA.FLG // Alternative item flg.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.ALT_GRP_CD IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.ALT_ITM_TYP IS '代替品目選択区分 // #MA.ALT_ITM_TYP // Alternative item selection type';


COMMENT ON COLUMN MAM_GP_BOM_ALL.ALT_ITM_RATIO IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN MAM_GP_BOM_ALL.ALT_ALLOC_PRIO IS '引当優先順 // #MA.INT // Allocation priority';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SNO_TYP1 IS '手配ＮＯ１区分 // #MA.SNO_TYP // SEIBAN No. 1 type';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SNO_TYP2 IS '手配ＮＯ２区分 // #MA.SNO_TYP // SEIBAN No. 2 type';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SNO_TYP3 IS '手配ＮＯ３区分 // #MA.SNO_TYP // SEIBAN No. 3 type';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SNO_TYP4 IS '手配ＮＯ４区分 // #MA.SNO_TYP // SEIBAN No. 4 type';


COMMENT ON COLUMN MAM_GP_BOM_ALL.MIN_SNO1 IS '下限手配ＮＯ１ // #MA.SNO1 // Min. SEIBAN No. 1';


COMMENT ON COLUMN MAM_GP_BOM_ALL.MAX_SNO1 IS '上限手配ＮＯ１ // #MA.SNO1 // Max. SEIBAN No. 1';


COMMENT ON COLUMN MAM_GP_BOM_ALL.MIN_SNO2 IS '下限手配ＮＯ２ // #MA.SNO2 // Min. SEIBAN No. 2';


COMMENT ON COLUMN MAM_GP_BOM_ALL.MAX_SNO2 IS '上限手配ＮＯ２ // #MA.SNO2 // Max. SEIBAN No. 2';


COMMENT ON COLUMN MAM_GP_BOM_ALL.MIN_SNO3 IS '下限手配ＮＯ３ // #MA.SNO3 // Min. SEIBAN No. 3';


COMMENT ON COLUMN MAM_GP_BOM_ALL.MAX_SNO3 IS '上限手配ＮＯ３ // #MA.SNO3 // Max. SEIBAN No. 3';


COMMENT ON COLUMN MAM_GP_BOM_ALL.MIN_SNO4 IS '下限手配ＮＯ４ // #MA.SNO4 // Min. SEIBAN No. 4';


COMMENT ON COLUMN MAM_GP_BOM_ALL.MAX_SNO4 IS '上限手配ＮＯ４ // #MA.SNO4 // Max. SEIBAN No. 4';


COMMENT ON COLUMN MAM_GP_BOM_ALL.PAR_INST_QTY IS '親指図数量 // #MA.QTY // Parent order qty.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.CHD_INPT_QTY IS '子投入数量 // #MA.QTY // Child input qty.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.CHD_RQMT_QTY IS '子必要数量 // #MA.QTY // Child required qty.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.FXD_CHD_RQMT_QTY IS '子固定必要数量 // #MA.QTY // Child fixed required qty.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.BYPROD_FLG IS '副産品ＦＬＧ // #MA.FLG // By-product flg.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.IN_OFFST_TYP IS '投入オフセット区分 // #MA.OFFST_TYP // Input offset type';


COMMENT ON COLUMN MAM_GP_BOM_ALL.IN_OFFST IS '投入オフセット // #MA.OFFST // Input offset';


COMMENT ON COLUMN MAM_GP_BOM_ALL.BKF_TYP IS 'バックフラッシュ区分 // #MA.BKF_TYP // Backflush type';


COMMENT ON COLUMN MAM_GP_BOM_ALL.INST_LOT_FIX_FLG IS '指図時ロット指定ＦＬＧ // #MA.FLG // Lot specification at order flg.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.LOT_MIX_FLG IS 'ロット混在ＦＬＧ // #MA.FLG // Lot mixed flg.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUBLOT_MIX_FLG IS 'サブロット混在ＦＬＧ // #MA.FLG // Sublot mixed flg.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.ALLOC_CTL_TYP IS '引当制御区分 // #MA.ALLOC_CTL_TYP // Allocation control type';


COMMENT ON COLUMN MAM_GP_BOM_ALL.MAIN_ITM_FLG IS '引継対象子品目ＦＬＧ // #MA.FLG // Copy-from child item flg.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.YIELD_CALC_FLG IS '収率計算用ＦＬＧ // #MA.FLG // Yield calculation flg.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.INPT_CTL_TYP IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN MAM_GP_BOM_ALL.DISP_SEQ IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN MAM_GP_BOM_ALL.CHNG_NO IS '変更ＮＯ // #MA.CHNG_NO // Change No.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.EXT_SYS_NO_BOM IS '外部システムＮＯ // #MA.EXT_SYS_NO_BOM // External system No.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.NOT_COST_FLG IS '原価対象外ＦＬＧ // #MA.FLG // Not costing flg.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MAM_GP_BOM_ALL.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MAM_GP_BOM_ALL.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_GP_BOM_ALL.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_GP_BOM_ALL.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_GP_BOM_ALL.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_GP_BOM_ALL.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_GP_BOM_ALL.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_GP_BOM_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_GP_BOM_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_GP_BOM_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_GP_BOM_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_GP_BOM_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_GP_BOM_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_GP_BOM_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_GP_BOM_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_GP_BOM_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_GP_BOM_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.BOM_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.BOM_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.BOM_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.BOM_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.BOM_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.BOM_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.BOM_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.BOM_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.BOM_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.BOM_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR11 IS '予備ＣＨＡＲ項目１１ // #MA.BOM_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR12 IS '予備ＣＨＡＲ項目１２ // #MA.BOM_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR13 IS '予備ＣＨＡＲ項目１３ // #MA.BOM_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR14 IS '予備ＣＨＡＲ項目１４ // #MA.BOM_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR15 IS '予備ＣＨＡＲ項目１５ // #MA.BOM_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR16 IS '予備ＣＨＡＲ項目１６ // #MA.BOM_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR17 IS '予備ＣＨＡＲ項目１７ // #MA.BOM_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR18 IS '予備ＣＨＡＲ項目１８ // #MA.BOM_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR19 IS '予備ＣＨＡＲ項目１９ // #MA.BOM_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR20 IS '予備ＣＨＡＲ項目２０ // #MA.BOM_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR21 IS '予備ＣＨＡＲ項目２１ // #MA.BOM_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR22 IS '予備ＣＨＡＲ項目２２ // #MA.BOM_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR23 IS '予備ＣＨＡＲ項目２３ // #MA.BOM_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR24 IS '予備ＣＨＡＲ項目２４ // #MA.BOM_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR25 IS '予備ＣＨＡＲ項目２５ // #MA.BOM_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR26 IS '予備ＣＨＡＲ項目２６ // #MA.BOM_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR27 IS '予備ＣＨＡＲ項目２７ // #MA.BOM_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR28 IS '予備ＣＨＡＲ項目２８ // #MA.BOM_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR29 IS '予備ＣＨＡＲ項目２９ // #MA.BOM_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_CHAR30 IS '予備ＣＨＡＲ項目３０ // #MA.BOM_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.BOM_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.BOM_SUB_NUM1 // Spare NUM column 2';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.BOM_SUB_NUM1 // Spare NUM column 3';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_NUM4 IS '予備ＮＵＭ項目４ // #MA.BOM_SUB_NUM1 // Spare NUM column 4';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_NUM5 IS '予備ＮＵＭ項目５ // #MA.BOM_SUB_NUM1 // Spare NUM column 5';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.BOM_SUB_DT1 // Spare DATE column 1';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.BOM_SUB_DT2 // Spare DATE column 2';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.BOM_SUB_DT3 // Spare DATE column 3';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_DT4 IS '予備ＤＡＴＥ項目４ // #MA.BOM_SUB_DT4 // Spare DATE column 4';


COMMENT ON COLUMN MAM_GP_BOM_ALL.SUB_DT5 IS '予備ＤＡＴＥ項目５ // #MA.BOM_SUB_DT5 // Spare DATE column 5';

