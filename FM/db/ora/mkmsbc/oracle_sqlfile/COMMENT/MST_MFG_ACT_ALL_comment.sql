
COMMENT ON TABLE MST_MFG_ACT_ALL IS '製造実績 // Mfg. result';


COMMENT ON COLUMN MST_MFG_ACT_ALL.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MST_MFG_ACT_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_MFG_ACT_ALL.MFG_INST_NO IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN MST_MFG_ACT_ALL.DIV_SEQ IS '分割連番 // #MS.DIV_SEQ // Split sequence number';


COMMENT ON COLUMN MST_MFG_ACT_ALL.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MST_MFG_ACT_ALL.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_MFG_ACT_ALL.ST_ACT_TM IS '着手実績日時 // #MA.TM // Actual start date and time';


COMMENT ON COLUMN MST_MFG_ACT_ALL.END_ACT_TM IS '終了実績日時 // #MA.TM // Actual end date and time';


COMMENT ON COLUMN MST_MFG_ACT_ALL.BASE_UNIT_YIELD_QTY IS '基準単位良品数量 // #MA.QTY // Base unit conforming qty.';


COMMENT ON COLUMN MST_MFG_ACT_ALL.BASE_UNIT_DFCT_QTY IS '基準単位不良数量 // #MA.QTY // Base unit defective qty.';


COMMENT ON COLUMN MST_MFG_ACT_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_MFG_ACT_ALL.ST_AC_DT IS '着手計上日 // #MA.DT // Start recording date';


COMMENT ON COLUMN MST_MFG_ACT_ALL.END_AC_DT IS '終了計上日 // #MA.DT // End recording date';


COMMENT ON COLUMN MST_MFG_ACT_ALL.ITM_YIELD IS '品目実際収率 // #MA.YIELD // Item actual yield';


COMMENT ON COLUMN MST_MFG_ACT_ALL.MFG_APRV_STS_TYP IS '製造承認状況区分 // #MS.MFG_APRV_STS_TYP // Mfg. approval status type';


COMMENT ON COLUMN MST_MFG_ACT_ALL.APRV_DT IS '承認日 // #MA.DT // Approval date';


COMMENT ON COLUMN MST_MFG_ACT_ALL.APRV_DPT_CD IS '承認部門ＣＤ // #MA.DPT_CD // Approval dept. cd.';


COMMENT ON COLUMN MST_MFG_ACT_ALL.APRV_USR_CD IS '承認者ＣＤ // #MA.USR_CD // Approver cd.';


COMMENT ON COLUMN MST_MFG_ACT_ALL.APRV_TM IS '承認日時 // #MA.TM // Approval date and time';


COMMENT ON COLUMN MST_MFG_ACT_ALL.APRV_RSN IS '承認理由 // #MS.APRV_RSN // Approval reason';


COMMENT ON COLUMN MST_MFG_ACT_ALL.ACT_PRNT_FLG IS '製造記録書発行済ＦＬＧ // #MA.FLG // Mfg. record sheet issued flg.';


COMMENT ON COLUMN MST_MFG_ACT_ALL.ACT_PRNT_TM IS '製造記録書発行日時 // #MA.TM // Mfg. record sheet issued date and time';


COMMENT ON COLUMN MST_MFG_ACT_ALL.SEQ IS '製造記録書連番 // #MA.PRNT_SEQ // Mfg. record sheet sequence number';


COMMENT ON COLUMN MST_MFG_ACT_ALL.ACT_DPT_CD IS '実績部門ＣＤ // #MA.DPT_CD // Result dept. cd.';


COMMENT ON COLUMN MST_MFG_ACT_ALL.ACT_USR_CD IS '実績責任者ＣＤ // #MA.USR_CD // Result management PIC cd.';


COMMENT ON COLUMN MST_MFG_ACT_ALL.ARR_PURC_AUTO_REG_FLG IS '入荷・仕入時自動作成ＦＬＧ // #MA.FLG // Auto-create flg. at receipt/purchase';


COMMENT ON COLUMN MST_MFG_ACT_ALL.INTR_RMRKS IS '内部備考 // #MS.MFG_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_MFG_ACT_ALL.ACT_RPT_RMRKS IS '記録書備考 // #MS.MFG_ACT_RPT_RMRKS // Record sheet remarks';


COMMENT ON COLUMN MST_MFG_ACT_ALL.SUB_CHAR1 IS '予備１ // #MS.MFG_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_MFG_ACT_ALL.SUB_CHAR2 IS '予備２ // #MS.MFG_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_MFG_ACT_ALL.SUB_CHAR3 IS '予備３ // #MS.MFG_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_MFG_ACT_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_MFG_ACT_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_MFG_ACT_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_MFG_ACT_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_MFG_ACT_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_MFG_ACT_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_MFG_ACT_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_MFG_ACT_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_MFG_ACT_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_MFG_ACT_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

