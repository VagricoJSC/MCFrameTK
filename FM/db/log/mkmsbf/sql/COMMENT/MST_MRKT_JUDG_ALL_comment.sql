
COMMENT ON TABLE MST_MRKT_JUDG_ALL IS '市場出荷判定ヘッダ // Market release decision header';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.MRKT_JUDG_NO IS '市場出荷判定ＮＯ // #MA.MRKT_JUDG_NO // Market release decision No.';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.MRKT_JUDG_STS_TYP IS '市場出荷判定状況区分 // #MS.MRKT_JUDG_STS_TYP // Market release decision status type';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.MRKT_JUDG_UPD_ROLE_CD IS '市場出荷判定更新役割ＣＤ // #MA.APRV_ROLE_CD // Market release decision update role cd.';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.UPD_USR_CD IS '更新者ＣＤ // #MA.USR_CD // Updater cd.';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.UPD_DPT_CD IS '更新部門ＣＤ // #MA.DPT_CD // Update dept. cd.';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.UPD_DT IS '更新日 // #MA.DT // Update date';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.MRKT_JUDG_ROLE_CD IS '市場出荷判定承認役割ＣＤ // #MA.APRV_ROLE_CD // Market release decision approval role cd.';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.JUDG_USR_CD IS '判定者ＣＤ // #MA.USR_CD // Decision PIC cd.';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.MAIN_FLG IS '主担当ＦＬＧ // #MA.FLG // Main PIC flg.';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.JUDG_DPT_CD IS '判定部門ＣＤ // #MA.DPT_CD // Decision dept. cd.';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.JUDG_DT IS '判定日 // #MA.DT // Decision date';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.MFG_SO_APRV_TYP IS '製造所出荷承認結果区分 // #MS.MFG_SO_APRV_TYP // Shipping approval result type from mfg. site';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.QUALITY_MNG_TYP IS '品質管理結果区分 // #MS.QUALITY_MNG_TYP // Inspection management result type';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.MFG_MNG_TYP IS '製造管理結果区分 // #MS.MFG_MNG_TYP // Mfg. management result type';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.DEVIANT_TYP IS '逸脱区分 // #MS.DEVIANT_TYP // Deviation type';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.DEVIANT_MSR_TYP IS '逸脱措置区分 // #MS.DEVIANT_MSR_TYP // Deviation measure type';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.PROD_ITM_INFO_TYP IS '製品品質情報区分 // #MS.PROD_ITM_INFO_TYP // Product quality info. type';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.CHD_ITM_INFO_TYP IS '原材料品質情報区分 // #MS.CHD_ITM_INFO_TYP // Raw material quality info. type';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.MRKT_JUDG_PRNT_FLG IS '市場出荷判定記録書発行済ＦＬＧ // #MA.FLG // Record sheet of market release decision issued flg.';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.MRKT_JUDG_PRNT_TM IS '市場出荷判定記録書発行日時 // #MA.TM // Record sheet of market release decision issued date and time';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.SEQ IS '市場出荷判定記録書連番 // #MA.PRNT_SEQ // Market release decision record sheet sequence number';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.VLD_DT IS '有効期限 // #MA.DT // Expiration date';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.JUDG_RSN IS '判定理由 // #MS.MRKT_JUDG_RSN // Decision reason';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.SITE_CD IS '出荷元工場・物流倉庫ＣＤ // #MA.SITE_CD // Shipping point factory/distribution warehouse cd.';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.ADD_FLG IS '追加ＦＬＧ // #MA.FLG // Add flg.';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.NO_DEL_FLG IS '作成元取消不可ＦＬＧ // #MA.FLG // Do not allow source cancel flg.';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.INTR_RMRKS IS '内部備考 // #MS.MRKT_JUDG_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.SUB_CHAR1 IS '予備１ // #MS.MRKT_JUDG_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.SUB_CHAR2 IS '予備２ // #MS.MRKT_JUDG_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.SUB_CHAR3 IS '予備３ // #MS.MRKT_JUDG_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_MRKT_JUDG_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

