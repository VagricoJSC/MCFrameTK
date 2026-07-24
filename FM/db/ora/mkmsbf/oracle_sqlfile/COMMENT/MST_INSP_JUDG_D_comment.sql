
COMMENT ON TABLE MST_INSP_JUDG_D IS '検査判定明細 // Inspection decision details';


COMMENT ON COLUMN MST_INSP_JUDG_D.INSP_JUDG_D_NO IS '検査判定明細ＮＯ // #MA.INSP_JUDG_D_NO // Inspection decision details No.';


COMMENT ON COLUMN MST_INSP_JUDG_D.INSP_ACT_NO IS '検査実績ＮＯ // #MA.INSP_ACT_NO // Inspection result No.';


COMMENT ON COLUMN MST_INSP_JUDG_D.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_INSP_JUDG_D.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_INSP_JUDG_D.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_INSP_JUDG_D.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_INSP_JUDG_D.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MST_INSP_JUDG_D.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_INSP_JUDG_D.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MST_INSP_JUDG_D.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_INSP_JUDG_D.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_INSP_JUDG_D.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_INSP_JUDG_D.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_INSP_JUDG_D.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_INSP_JUDG_D.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_INSP_JUDG_D.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_INSP_JUDG_D.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_INSP_JUDG_D.SNO1_MNG_TYP IS '手配ＮＯ１管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 1 management type';


COMMENT ON COLUMN MST_INSP_JUDG_D.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_INSP_JUDG_D.SNO2_MNG_TYP IS '手配ＮＯ２管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 2 management type';


COMMENT ON COLUMN MST_INSP_JUDG_D.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_INSP_JUDG_D.SNO3_MNG_TYP IS '手配ＮＯ３管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 3 management type';


COMMENT ON COLUMN MST_INSP_JUDG_D.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_INSP_JUDG_D.SNO4_MNG_TYP IS '手配ＮＯ４管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 4 management type';


COMMENT ON COLUMN MST_INSP_JUDG_D.FIX_NO_TYP IS '確定ＮＯ区分 // #MS.FIX_NO_TYP // Firm No. type';


COMMENT ON COLUMN MST_INSP_JUDG_D.FIX_NO IS '確定ＮＯ // #MA.FIX_NO // Firm No.';


COMMENT ON COLUMN MST_INSP_JUDG_D.PACK_UNIT_QTY IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN MST_INSP_JUDG_D.PACK_UNIT_CD IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN MST_INSP_JUDG_D.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_INSP_JUDG_D.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_INSP_JUDG_D.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_INSP_JUDG_D.SUB_CHAR1 IS '予備１ // #MS.INSP_JUDG_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_INSP_JUDG_D.SUB_CHAR2 IS '予備２ // #MS.INSP_JUDG_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_INSP_JUDG_D.SUB_CHAR3 IS '予備３ // #MS.INSP_JUDG_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_INSP_JUDG_D.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_INSP_JUDG_D.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_INSP_JUDG_D.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_INSP_JUDG_D.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_INSP_JUDG_D.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_INSP_JUDG_D.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_INSP_JUDG_D.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_INSP_JUDG_D.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_INSP_JUDG_D.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_INSP_JUDG_D.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

