
COMMENT ON TABLE MST_OPER_ACT IS '工程実績 // Operation result';


COMMENT ON COLUMN MST_OPER_ACT.OPER_ACT_NO IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN MST_OPER_ACT.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MST_OPER_ACT.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MST_OPER_ACT.OPER_INST_NO IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN MST_OPER_ACT.DIV_SEQ IS '分割連番 // #MS.DIV_SEQ // Split sequence number';


COMMENT ON COLUMN MST_OPER_ACT.ARR_ACT_NO IS '入荷実績ＮＯ // #MA.ARR_ACT_NO // Receipt result No.';


COMMENT ON COLUMN MST_OPER_ACT.PURC_ACT_IO_NO IS '仕入実績受払ＮＯ // #MA.PURC_ACT_IO_NO // Purchase result GR/GI No.';


COMMENT ON COLUMN MST_OPER_ACT.DISP_SEQ IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN MST_OPER_ACT.ST_ACT_TM IS '着手実績日時 // #MA.TM // Actual start date and time';


COMMENT ON COLUMN MST_OPER_ACT.END_ACT_TM IS '終了実績日時 // #MA.TM // Actual end date and time';


COMMENT ON COLUMN MST_OPER_ACT.BASE_UNIT_QTY IS '基準単位実績数量 // #MA.QTY // Base unit result qty.';


COMMENT ON COLUMN MST_OPER_ACT.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_OPER_ACT.OPER_UNIT_QTY IS '工程単位実績数量 // #MA.QTY // Operation unit result qty.';


COMMENT ON COLUMN MST_OPER_ACT.OPER_UNIT_CD IS '工程単位ＣＤ // #MA.UNIT_CD // Operation unit cd.';


COMMENT ON COLUMN MST_OPER_ACT.BKF_CTL_FLG IS 'バックフラッシュ更新許可ＦＬＧ // #MA.FLG // Allow backflush update flg.';


COMMENT ON COLUMN MST_OPER_ACT.WK_COST_CALC_CTL_FLG IS '自動工数計算更新許可ＦＬＧ // #MA.FLG // Auto man-hour calculation update permission flg.';


COMMENT ON COLUMN MST_OPER_ACT.OPER_YIELD IS '工程実際収率 // #MA.YIELD // Operation actual yield';


COMMENT ON COLUMN MST_OPER_ACT.BKF_NOT_REF_FLG IS 'バックフラッシュ未反映ＦＬＧ // #MA.FLG // Not applied backflush flg.';


COMMENT ON COLUMN MST_OPER_ACT.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MST_OPER_ACT.MES_ID IS 'ＭＥＳＩＤ // #MS.MES_ID // MES ID';


COMMENT ON COLUMN MST_OPER_ACT.MES_FLG IS 'ＭＥＳＦＬＧ // #MA.FLG // MES flg.';


COMMENT ON COLUMN MST_OPER_ACT.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_OPER_ACT.EXT_OPER_ACT_NO IS '外部工程実績ＮＯ // #MA.EXT_OPER_ACT_NO // External operation result No.';


COMMENT ON COLUMN MST_OPER_ACT.IF_AUTO_REG_FLG IS 'ＩＦ自動作成ＦＬＧ // #MA.FLG // IF auto-create flg.';


COMMENT ON COLUMN MST_OPER_ACT.INTR_RMRKS IS '内部備考 // #MS.OPER_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_OPER_ACT.ACT_RPT_RMRKS IS '記録書備考 // #MS.OPER_ACT_RPT_RMRKS // Record sheet remarks';


COMMENT ON COLUMN MST_OPER_ACT.SUB_CHAR1 IS '予備１ // #MS.OPER_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_OPER_ACT.SUB_CHAR2 IS '予備２ // #MS.OPER_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_OPER_ACT.SUB_CHAR3 IS '予備３ // #MS.OPER_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_OPER_ACT.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_OPER_ACT.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_OPER_ACT.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_OPER_ACT.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_OPER_ACT.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_OPER_ACT.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_OPER_ACT.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_OPER_ACT.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_OPER_ACT.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_OPER_ACT.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

