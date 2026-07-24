
COMMENT ON TABLE MST_INSP_ACT IS '検査実績ヘッダ // Inspection result header';


COMMENT ON COLUMN MST_INSP_ACT.INSP_ACT_NO IS '検査実績ＮＯ // #MA.INSP_ACT_NO // Inspection result No.';


COMMENT ON COLUMN MST_INSP_ACT.INSP_NO IS '検査ＮＯ // #MA.INSP_NO // Inspection No.';


COMMENT ON COLUMN MST_INSP_ACT.INSP_FREQ IS '検査回数 // #MS.INSP_FREQ // Number of inspections';


COMMENT ON COLUMN MST_INSP_ACT.SRC_NO1 IS '作成元ＮＯ１ // #MA.SRC_NO // Source No. 1';


COMMENT ON COLUMN MST_INSP_ACT.SRC_NO2 IS '作成元ＮＯ２ // #MA.SRC_NO // Source No. 2';


COMMENT ON COLUMN MST_INSP_ACT.INSP_TYP IS '検査種類区分 // #MS.INSP_TYP // Inspection classification type';


COMMENT ON COLUMN MST_INSP_ACT.INSP_MTD_TYP IS '検査方法区分 // #MA.INSP_MTD_TYP // Inspection method type';


COMMENT ON COLUMN MST_INSP_ACT.DFCT_RSN_CD IS '不良理由ＣＤ // #MA.BIZ_RSN_CD // Defective reason cd.';


COMMENT ON COLUMN MST_INSP_ACT.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_INSP_ACT.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_INSP_ACT.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_INSP_ACT.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_INSP_ACT.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_INSP_ACT.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_INSP_ACT.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_INSP_ACT.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_INSP_ACT.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_INSP_ACT.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MST_INSP_ACT.MFG_LOC_CD IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN MST_INSP_ACT.FROM_SITE_CD IS '出荷元工場・物流倉庫ＣＤ // #MA.SITE_CD // Shipping point factory/distribution warehouse cd.';


COMMENT ON COLUMN MST_INSP_ACT.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_INSP_ACT.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_INSP_ACT.GOOD_QTY IS '良品数量 // #MA.QTY // Conforming qty.';


COMMENT ON COLUMN MST_INSP_ACT.DFCT_QTY IS '不良品数量 // #MA.QTY // Defective qty.';


COMMENT ON COLUMN MST_INSP_ACT.ST_TM IS '検査開始日時 // #MA.TM // Inspection start date and time';


COMMENT ON COLUMN MST_INSP_ACT.END_TM IS '検査終了日時 // #MA.TM // Inspection finish date and time';


COMMENT ON COLUMN MST_INSP_ACT.ACT_USR_CD IS '実施担当者ＣＤ // #MA.USR_CD // Implementation PIC cd.';


COMMENT ON COLUMN MST_INSP_ACT.ACT_DPT_CD IS '実施部門ＣＤ // #MA.DPT_CD // Implement dept. cd.';


COMMENT ON COLUMN MST_INSP_ACT.JUDG_DT IS '判定日 // #MA.DT // Decision date';


COMMENT ON COLUMN MST_INSP_ACT.JUDG_TM IS '判定日時 // #MA.TM // Decision date and time';


COMMENT ON COLUMN MST_INSP_ACT.INSP_JUDG_RSLT_TYP IS '検査判定結果区分 // #MS.INSP_JUDG_RSLT_TYP // Inspection decision result type';


COMMENT ON COLUMN MST_INSP_ACT.JUDG_DPT_CD IS '判定部門ＣＤ // #MA.DPT_CD // Decision dept. cd.';


COMMENT ON COLUMN MST_INSP_ACT.JUDG_USR_CD IS '判定者ＣＤ // #MA.USR_CD // Decision PIC cd.';


COMMENT ON COLUMN MST_INSP_ACT.JUDG_RSN IS '判定理由 // #MS.INSP_JUDG_RSN // Decision reason';


COMMENT ON COLUMN MST_INSP_ACT.LMT_DT_FRM_TYP IS '期限起算日区分 // #MA.LMT_DT_FRM_TYP // Expiration base date type';


COMMENT ON COLUMN MST_INSP_ACT.LMT_DT_FRM IS '起算日 // #MA.DT // Base date';


COMMENT ON COLUMN MST_INSP_ACT.VLD_DT IS '有効期限 // #MA.DT // Expiration date';


COMMENT ON COLUMN MST_INSP_ACT.LMT_DT IS '使用期限 // #MA.DT // Usage expiration date';


COMMENT ON COLUMN MST_INSP_ACT.NOT_UPD_STK_FLG IS '在庫更新不要ＦＬＧ // #MA.FLG // Inventory update not necessary flg.';


COMMENT ON COLUMN MST_INSP_ACT.INTR_RMRKS IS '内部備考 // #MS.INSP_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_INSP_ACT.SUB_CHAR1 IS '予備１ // #MS.INSP_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_INSP_ACT.SUB_CHAR2 IS '予備２ // #MS.INSP_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_INSP_ACT.SUB_CHAR3 IS '予備３ // #MS.INSP_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_INSP_ACT.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_INSP_ACT.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_INSP_ACT.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_INSP_ACT.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_INSP_ACT.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_INSP_ACT.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_INSP_ACT.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_INSP_ACT.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_INSP_ACT.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_INSP_ACT.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MST_INSP_ACT.LIMS_FLG IS 'ＬＩＭＳＦＬＧ // #MA.FLG // LIMS flg.';


COMMENT ON COLUMN MST_INSP_ACT.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_INSP_ACT.EXT_INSP_ACT_NO IS '外部検査実績ＮＯ // #MA.EXT_INSP_ACT_NO // External inspection result No.';

