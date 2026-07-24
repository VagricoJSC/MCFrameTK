
COMMENT ON TABLE MST_INSP_INST IS '検査指図 // Inspection order';


COMMENT ON COLUMN MST_INSP_INST.INSP_NO IS '検査ＮＯ // #MA.INSP_NO // Inspection No.';


COMMENT ON COLUMN MST_INSP_INST.INSP_FREQ IS '検査回数 // #MS.INSP_FREQ // Number of inspections';


COMMENT ON COLUMN MST_INSP_INST.SRC_NO1 IS '作成元ＮＯ１ // #MA.SRC_NO // Source No. 1';


COMMENT ON COLUMN MST_INSP_INST.SRC_NO2 IS '作成元ＮＯ２ // #MA.SRC_NO // Source No. 2';


COMMENT ON COLUMN MST_INSP_INST.INSP_TYP IS '検査種類区分 // #MS.INSP_TYP // Inspection classification type';


COMMENT ON COLUMN MST_INSP_INST.INSP_MTD_TYP IS '検査方法区分 // #MA.INSP_MTD_TYP // Inspection method type';


COMMENT ON COLUMN MST_INSP_INST.INSP_STS_TYP IS '検査状況区分 // #MS.INSP_STS_TYP // Inspection status type';


COMMENT ON COLUMN MST_INSP_INST.INSP_BIND_TYP IS '検査実施単位区分 // #MA.INSP_BIND_TYP // Inspection implementation unit type';


COMMENT ON COLUMN MST_INSP_INST.COL_SCHD_FLG IS '予定まとめＦＬＧ // #MA.FLG // Schedule aggregation flg.';


COMMENT ON COLUMN MST_INSP_INST.INSP_LST_PRNT_FLG IS '検査指図リスト発行済ＦＬＧ // #MA.FLG // Inspection order list issued flg.';


COMMENT ON COLUMN MST_INSP_INST.INSP_LST_PRNT_TM IS '検査指図リスト発行日時 // #MA.TM // Inspection order list issue date and time';


COMMENT ON COLUMN MST_INSP_INST.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_INSP_INST.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_INSP_INST.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_INSP_INST.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_INSP_INST.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_INSP_INST.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_INSP_INST.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_INSP_INST.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_INSP_INST.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MST_INSP_INST.MFG_LOC_CD IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN MST_INSP_INST.FROM_SITE_CD IS '出荷元工場・物流倉庫ＣＤ // #MA.SITE_CD // Shipping point factory/distribution warehouse cd.';


COMMENT ON COLUMN MST_INSP_INST.TO_SITE_CD IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN MST_INSP_INST.BP_LOT_NO IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN MST_INSP_INST.PACK_UNIT_QTY IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN MST_INSP_INST.PACK_UNIT_CD IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN MST_INSP_INST.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_INSP_INST.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_INSP_INST.INSP_LST_NO IS '検査指図リストＮＯ // #MA.INSP_LST_NO // Inspection order list No.';


COMMENT ON COLUMN MST_INSP_INST.INST_DT IS '指図日 // #MA.DT // Order date';


COMMENT ON COLUMN MST_INSP_INST.INST_DPT_CD IS '指図部門ＣＤ // #MA.DPT_CD // Order dept. cd.';


COMMENT ON COLUMN MST_INSP_INST.INST_USR_CD IS '指図担当者ＣＤ // #MA.USR_CD // Order PIC cd.';


COMMENT ON COLUMN MST_INSP_INST.MASTER_DT IS 'マスタ適用日 // #MA.DT // Master application date';


COMMENT ON COLUMN MST_INSP_INST.ST_TM IS '開始予定日時 // #MA.TM // Scheduled start date and time';


COMMENT ON COLUMN MST_INSP_INST.END_TM IS '終了予定日時 // #MA.TM // Scheduled end date and time';


COMMENT ON COLUMN MST_INSP_INST.INSP_PTN_CD IS '検査パタンＣＤ // #MA.INSP_PTN_CD // Inspection pattern cd.';


COMMENT ON COLUMN MST_INSP_INST.STD_REQ_FLG IS '規格検査必須ＦＬＧ // #MA.FLG // Specific inspection required flg.';


COMMENT ON COLUMN MST_INSP_INST.STD_CNF_REQ_FLG IS '規格実績確認必須ＦＬＧ // #MA.FLG // Specific result check required flg.';


COMMENT ON COLUMN MST_INSP_INST.INSP_STD_NO IS '規格書ＮＯ // #MA.INSP_STD_NO // Specific inspection No.';


COMMENT ON COLUMN MST_INSP_INST.PLNT_APRV_FLG IS '工場出荷承認対象ＦＬＧ // #MA.FLG // For factory release approval flg.';


COMMENT ON COLUMN MST_INSP_INST.INSP_RSLT_PRNT_FLG IS '検査成績書発行済ＦＬＧ // #MA.FLG // Inspection report printed flg.';


COMMENT ON COLUMN MST_INSP_INST.INSP_RSLT_PRNT_TM IS '検査成績書発行日時 // #MA.TM // Inspection report printed date and time';


COMMENT ON COLUMN MST_INSP_INST.SEQ IS '検査成績書連番 // #MA.PRNT_SEQ // Inspection report sequence number';


COMMENT ON COLUMN MST_INSP_INST.LMT_UP_FLG IS '期限再検査ＦＬＧ // #MA.FLG // Re-inspection for expiration flg.';


COMMENT ON COLUMN MST_INSP_INST.INSP_APRV_FLG IS '検査承認対象ＦＬＧ // #MA.FLG // For inspection approval flg.';


COMMENT ON COLUMN MST_INSP_INST.INSP_APRV_STS_TYP IS '検査承認状況区分 // #MS.INSP_APRV_STS_TYP // Inspection approval status type';


COMMENT ON COLUMN MST_INSP_INST.APRV_DT IS '承認日 // #MA.DT // Approval date';


COMMENT ON COLUMN MST_INSP_INST.INSP_APRV_ROLE_CD IS '検査承認役割ＣＤ // #MA.APRV_ROLE_CD // Inspection approval role cd.';


COMMENT ON COLUMN MST_INSP_INST.APRV_DPT_CD IS '承認部門ＣＤ // #MA.DPT_CD // Approval dept. cd.';


COMMENT ON COLUMN MST_INSP_INST.APRV_USR_CD IS '承認者ＣＤ // #MA.USR_CD // Approver cd.';


COMMENT ON COLUMN MST_INSP_INST.APRV_TM IS '承認日時 // #MA.TM // Approval date and time';


COMMENT ON COLUMN MST_INSP_INST.APRV_RSN IS '承認理由 // #MS.INSP_INST_APRV_RSN // Approval reason';


COMMENT ON COLUMN MST_INSP_INST.ACT_CONT_FCTR IS '実際有効成分係数 // #MA.ACT_CONT_FCTR // Actual active ingredient coefficient';


COMMENT ON COLUMN MST_INSP_INST.INTR_RMRKS IS '内部備考 // #MS.INSP_INST_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_INSP_INST.SUB_CHAR1 IS '予備１ // #MS.INSP_INST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_INSP_INST.SUB_CHAR2 IS '予備２ // #MS.INSP_INST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_INSP_INST.SUB_CHAR3 IS '予備３ // #MS.INSP_INST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_INSP_INST.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_INSP_INST.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_INSP_INST.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_INSP_INST.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_INSP_INST.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_INSP_INST.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_INSP_INST.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_INSP_INST.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_INSP_INST.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_INSP_INST.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MST_INSP_INST.LIMS_FLG IS 'ＬＩＭＳＦＬＧ // #MA.FLG // LIMS flg.';

