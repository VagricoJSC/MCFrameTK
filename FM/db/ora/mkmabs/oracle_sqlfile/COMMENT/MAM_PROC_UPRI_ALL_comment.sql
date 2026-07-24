
COMMENT ON TABLE MAM_PROC_UPRI_ALL IS '加工単価マスタ // Subcontracting unit price master';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.UNIT_CD IS '単位ＣＤ // #MA.UNIT_CD // Unit cd.';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.LOT_QTY IS 'ロット数量 // #MA.QTY // Lot qty.';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.CUR_CD IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.PROC_UPRI_TYP IS '加工単価区分 // #MA.PROC_UPRI_TYP // Subcontracting unit price type';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.LOC_CD IS '納入場所ＣＤ // #MA.LOC_CD // Delivery location cd.';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.DLV_CD IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.UPRI IS '単価 // #MA.MONEY // Unit price';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.UPRI_BF IS '改定前単価 // #MA.MONEY // Unit price before revised';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.INTERIM_FLG IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.STD_WK_COST IS '標準工数 // #MA.WK_COST_QTY // Standard man-hour';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.STD_WK_COST_UPRI IS '標準工数単価 // #MA.MONEY // Standard man-hour unit price';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.NOT_COST_FLG IS '原価対象外ＦＬＧ // #MA.FLG // Not costing flg.';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.SUB_UPRI1 IS '予備単価１ // #MA.MONEY // Spare unit price 1';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.SUB_UPRI2 IS '予備単価２ // #MA.MONEY // Spare unit price 2';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.SUB_UPRI3 IS '予備単価３ // #MA.MONEY // Spare unit price 3';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_PROC_UPRI_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

