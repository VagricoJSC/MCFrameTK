
COMMENT ON TABLE MST_STKTK IS '棚卸制御管理 // Inventory count control';


COMMENT ON COLUMN MST_STKTK.CTRL_TGT_DT IS '制御対象日 // #MA.DT // Control target date';


COMMENT ON COLUMN MST_STKTK.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MST_STKTK.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_STKTK.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_STKTK.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_STKTK.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_STKTK.STKTK_TYP IS '棚卸種別区分 // #MS.STKTK_TYP // Inventory count classification type';


COMMENT ON COLUMN MST_STKTK.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_STKTK.STKTK_STS_TYP IS '棚卸状況区分 // #MS.STKTK_STS_TYP // Inventory count status type';


COMMENT ON COLUMN MST_STKTK.STKTK_ST_TM IS '棚卸開始日時 // #MA.TM // Inventory count start date and time';


COMMENT ON COLUMN MST_STKTK.DIFF_UPD_TM IS '在庫確定日時 // #MA.TM // Inventory firm date and time';


COMMENT ON COLUMN MST_STKTK.ACT_DPT_CD IS '実施部門ＣＤ // #MA.DPT_CD // Implement dept. cd.';


COMMENT ON COLUMN MST_STKTK.ACT_USR_CD IS '実施担当者ＣＤ // #MA.USR_CD // Implementation PIC cd.';


COMMENT ON COLUMN MST_STKTK.IO_CTRL_FLG IS '入出庫制御中ＦＬＧ // #MA.FLG // GR/GI control flg.';


COMMENT ON COLUMN MST_STKTK.ACT_QTY_KEEP_FLG IS '実棚数量保持ＦＬＧ // #MA.FLG // Keep counted qty. flg.';


COMMENT ON COLUMN MST_STKTK.STKTK_RPT_PRNT_FLG IS '棚卸表発行済ＦＬＧ // #MA.FLG // Inventory count sheet issued flg.';


COMMENT ON COLUMN MST_STKTK.DIFF_RPT_PRNT_FLG IS '差異リスト発行済ＦＬＧ // #MA.FLG // Variance list issued flg.';


COMMENT ON COLUMN MST_STKTK.STKTK_RPT_RMRKS IS '棚卸表備考 // #MS.STKTK_RPT_RMRKS // Inventory count sheet remarks';


COMMENT ON COLUMN MST_STKTK.INTR_RMRKS IS '内部備考 // #MS.STKTK_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_STKTK.SUB_CHAR1 IS '予備１ // #MS.STKTK_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_STKTK.SUB_CHAR2 IS '予備２ // #MS.STKTK_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_STKTK.SUB_CHAR3 IS '予備３ // #MS.STKTK_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_STKTK.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_STKTK.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_STKTK.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_STKTK.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_STKTK.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_STKTK.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_STKTK.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_STKTK.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_STKTK.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_STKTK.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

