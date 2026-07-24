
COMMENT ON TABLE MST_INSP_SCHD IS '検査予定 // Inspection schedule';


COMMENT ON COLUMN MST_INSP_SCHD.INSP_SCHD_NO IS '検査予定ＮＯ // #MA.INSP_SCHD_NO // Inspection schedule No.';


COMMENT ON COLUMN MST_INSP_SCHD.SRC_NO1 IS '作成元ＮＯ１ // #MA.SRC_NO // Source No. 1';


COMMENT ON COLUMN MST_INSP_SCHD.SRC_NO2 IS '作成元ＮＯ２ // #MA.SRC_NO // Source No. 2';


COMMENT ON COLUMN MST_INSP_SCHD.SRC_NO3 IS '作成元ＮＯ３ // #MA.SRC_NO // Source No. 3';


COMMENT ON COLUMN MST_INSP_SCHD.SRC_NO4 IS '作成元ＮＯ４ // #MA.SRC_NO // Source No. 4';


COMMENT ON COLUMN MST_INSP_SCHD.INSP_TYP IS '検査種類区分 // #MS.INSP_TYP // Inspection classification type';


COMMENT ON COLUMN MST_INSP_SCHD.INSP_MTD_TYP IS '検査方法区分 // #MA.INSP_MTD_TYP // Inspection method type';


COMMENT ON COLUMN MST_INSP_SCHD.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_INSP_SCHD.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_INSP_SCHD.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_INSP_SCHD.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_INSP_SCHD.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MST_INSP_SCHD.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_INSP_SCHD.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MST_INSP_SCHD.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_INSP_SCHD.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_INSP_SCHD.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_INSP_SCHD.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_INSP_SCHD.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_INSP_SCHD.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_INSP_SCHD.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_INSP_SCHD.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_INSP_SCHD.SNO1_MNG_TYP IS '手配ＮＯ１管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 1 management type';


COMMENT ON COLUMN MST_INSP_SCHD.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_INSP_SCHD.SNO2_MNG_TYP IS '手配ＮＯ２管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 2 management type';


COMMENT ON COLUMN MST_INSP_SCHD.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_INSP_SCHD.SNO3_MNG_TYP IS '手配ＮＯ３管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 3 management type';


COMMENT ON COLUMN MST_INSP_SCHD.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_INSP_SCHD.SNO4_MNG_TYP IS '手配ＮＯ４管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 4 management type';


COMMENT ON COLUMN MST_INSP_SCHD.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_INSP_SCHD.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MST_INSP_SCHD.MFG_LOC_CD IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN MST_INSP_SCHD.FROM_SITE_CD IS '出荷元工場・物流倉庫ＣＤ // #MA.SITE_CD // Shipping point factory/distribution warehouse cd.';


COMMENT ON COLUMN MST_INSP_SCHD.BP_LOT_NO IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN MST_INSP_SCHD.MASTER_DT IS 'マスタ適用日 // #MA.DT // Master application date';


COMMENT ON COLUMN MST_INSP_SCHD.ST_TM IS '開始予定日時 // #MA.TM // Scheduled start date and time';


COMMENT ON COLUMN MST_INSP_SCHD.END_TM IS '終了予定日時 // #MA.TM // Scheduled end date and time';


COMMENT ON COLUMN MST_INSP_SCHD.PACK_UNIT_QTY IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN MST_INSP_SCHD.PACK_UNIT_CD IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN MST_INSP_SCHD.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_INSP_SCHD.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_INSP_SCHD.SMPL_SCHD_QTY IS '抜取予定数量 // #MA.QTY // Sampling scheduled qty.';


COMMENT ON COLUMN MST_INSP_SCHD.SMPL_INST_QTY IS '抜取指図数量 // #MA.QTY // Sampling order qty.';


COMMENT ON COLUMN MST_INSP_SCHD.OWN_INSP_NO IS '参照検査ＮＯ // #MA.INSP_NO // Reference inspection No.';


COMMENT ON COLUMN MST_INSP_SCHD.OWN_INSP_SCHD_NO IS '参照検査予定ＮＯ // #MA.INSP_SCHD_NO // Reference inspection schedule No.';


COMMENT ON COLUMN MST_INSP_SCHD.ORG_INSP_SCHD_NO IS '初回検査予定ＮＯ // #MA.INSP_SCHD_NO // Initial inspection schedule No.';


COMMENT ON COLUMN MST_INSP_SCHD.LATEST_FLG IS '最新ＦＬＧ // #MA.FLG // Latest flg.';


COMMENT ON COLUMN MST_INSP_SCHD.INSP_FREQ IS '検査回数 // #MS.INSP_FREQ // Number of inspections';


COMMENT ON COLUMN MST_INSP_SCHD.LMT_UP_FLG IS '期限再検査ＦＬＧ // #MA.FLG // Re-inspection for expiration flg.';


COMMENT ON COLUMN MST_INSP_SCHD.INSP_SCHD_STS_TYP IS '検査予定状況区分 // #MS.INSP_STS_TYP // Inspection schedule status type';


COMMENT ON COLUMN MST_INSP_SCHD.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_INSP_SCHD.INSP_NO IS '検査ＮＯ // #MA.INSP_NO // Inspection No.';


COMMENT ON COLUMN MST_INSP_SCHD.ITM_ORD_NO IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN MST_INSP_SCHD.IN_PRMT_INSP_FLG IS '検査中使用許可ＦＬＧ // #MA.FLG // Allow inspecting use flg.';


COMMENT ON COLUMN MST_INSP_SCHD.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_INSP_SCHD.INSP_BIND_TYP IS '検査実施単位区分 // #MA.INSP_BIND_TYP // Inspection implementation unit type';


COMMENT ON COLUMN MST_INSP_SCHD.INSP_LT IS '検査ＬＴ // #MA.LT // Inspection LT';


COMMENT ON COLUMN MST_INSP_SCHD.INSP_OFFST IS '検査オフセット // #MA.OFFST // Inspection offset';


COMMENT ON COLUMN MST_INSP_SCHD.INSP_CNT_RMRKS IS '検査連絡備考 // #MS.INSP_CNT_RMRKS // Inspection contact remarks';


COMMENT ON COLUMN MST_INSP_SCHD.SUB_CHAR1 IS '予備１ // #MS.INSP_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_INSP_SCHD.SUB_CHAR2 IS '予備２ // #MS.INSP_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_INSP_SCHD.SUB_CHAR3 IS '予備３ // #MS.INSP_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_INSP_SCHD.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_INSP_SCHD.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_INSP_SCHD.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_INSP_SCHD.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_INSP_SCHD.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_INSP_SCHD.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_INSP_SCHD.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_INSP_SCHD.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_INSP_SCHD.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_INSP_SCHD.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

