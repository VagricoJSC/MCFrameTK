
COMMENT ON TABLE MAM_STK_RPL IS '在庫補充マスタ // Inventory replenishment master';


COMMENT ON COLUMN MAM_STK_RPL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MAM_STK_RPL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MAM_STK_RPL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MAM_STK_RPL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MAM_STK_RPL.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MAM_STK_RPL.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MAM_STK_RPL.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MAM_STK_RPL.BUF_QTY IS '安全在庫数量 // #MA.QTY // Fluctuation inventory qty.';


COMMENT ON COLUMN MAM_STK_RPL.RORD_STK_QTY IS '発注点在庫数量 // #MA.QTY // Reorder point inventory qty.';


COMMENT ON COLUMN MAM_STK_RPL.GI_SCHD_FLG IS '出庫予定含むＦＬＧ // #MA.FLG // GI schedule including flg.';


COMMENT ON COLUMN MAM_STK_RPL.RORD_RQST_QTY IS '発注点依頼数量 // #MA.QTY // Reorder point request qty.';


COMMENT ON COLUMN MAM_STK_RPL.LOT_SIZING_FLG IS 'ロットサイジングＦＬＧ // #MA.FLG // Lot sizing flg.';


COMMENT ON COLUMN MAM_STK_RPL.GI_LOC_CD IS '発注点出庫場所ＣＤ // #MA.LOC_CD // GI location at reorder point cd.';


COMMENT ON COLUMN MAM_STK_RPL.GI_STR_LN_CD IS '発注点出庫棚・ラインＣＤ // #MA.STR_LN_CD // GI rack/line at reorder point cd.';


COMMENT ON COLUMN MAM_STK_RPL.INPT_GI_LOC_CD IS '投入品出庫場所ＣＤ // #MA.LOC_CD // Input item GI location cd.';


COMMENT ON COLUMN MAM_STK_RPL.INPT_GI_STR_LN_CD IS '投入品出庫棚・ラインＣＤ // #MA.STR_LN_CD // Input item GI rack/line cd.';


COMMENT ON COLUMN MAM_STK_RPL.SHIP_GI_LOC_CD IS '出荷品出庫場所ＣＤ // #MA.LOC_CD // Shipping item GI location cd.';


COMMENT ON COLUMN MAM_STK_RPL.SHIP_GI_STR_LN_CD IS '出荷品出庫棚・ラインＣＤ // #MA.STR_LN_CD // Shipping item GI rack/line cd.';


COMMENT ON COLUMN MAM_STK_RPL.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_STK_RPL.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_STK_RPL.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_STK_RPL.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_STK_RPL.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_STK_RPL.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_STK_RPL.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_STK_RPL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_STK_RPL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_STK_RPL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_STK_RPL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_STK_RPL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_STK_RPL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_STK_RPL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_STK_RPL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_STK_RPL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_STK_RPL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

