
COMMENT ON TABLE MST_XFR_ALLOC_STS_SV IS '移動引当状況_保存 // Movement allocation status_save';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.XFR_ALLOC_STS_NO IS '移動引当状況ＮＯ // #MA.XFR_ALLOC_STS_NO // Movement allocation status No.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.PR_STS_TYP IS '進捗状況区分 // #MS.PR_STS_TYP // Progress status type';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.XFR_SCHD_NO IS '移動・移送予定ＮＯ // #MA.XFR_SCHD_NO // Movement/transport schedule No.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.XFR_INST_D_NO IS '移動指図明細ＮＯ // #MA.XFR_INST_D_NO // Movement order details No.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.LG_GRP_CD IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.GI_LOC_CD IS '出庫場所ＣＤ // #MA.LOC_CD // GI location cd.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.GI_STR_LN_CD IS '出庫棚・ラインＣＤ // #MA.STR_LN_CD // GI rack/line cd.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.GI_STK_ARRV_BP_CD IS '出庫在庫着荷先ＣＤ // #MA.BP_CD // GI inventory arriving point cd.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.GR_LOC_CD IS '入庫場所ＣＤ // #MA.LOC_CD // GR location cd.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.GR_STR_LN_CD IS '入庫棚・ラインＣＤ // #MA.STR_LN_CD // GR rack/line cd.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.GR_STK_ARRV_BP_CD IS '入庫在庫着荷先ＣＤ // #MA.BP_CD // GR inventory arriving point cd.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.SNO1_NULL_FLG IS '手配ＮＯ１無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 1 flg.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.SNO2_NULL_FLG IS '手配ＮＯ２無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 2 flg.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.SNO3_NULL_FLG IS '手配ＮＯ３無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 3 flg.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.SNO4_NULL_FLG IS '手配ＮＯ４無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 4 flg.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.ALLOC_SNO1 IS '引当手配ＮＯ１ // #MA.SNO1 // Allocation SEIBAN No. 1';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.ALLOC_SNO2 IS '引当手配ＮＯ２ // #MA.SNO2 // Allocation SEIBAN No. 2';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.ALLOC_SNO3 IS '引当手配ＮＯ３ // #MA.SNO3 // Allocation SEIBAN No. 3';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.ALLOC_SNO4 IS '引当手配ＮＯ４ // #MA.SNO4 // Allocation SEIBAN No. 4';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.ACT_QTY IS '移動実績数量 // #MA.QTY // Movement result qty.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.XFR_SCHD_DT IS '移動予定日 // #MA.DT // Scheduled movement date';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.SHIP_INST_TYP IS '出荷指図区分 // #MA.SHIP_INST_TYP // Shipping order type';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.RSN_CD IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.INST_BNDL_FLG IS '指図まとめＦＬＧ // #MA.FLG // Order aggregation flg.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.FIX_FLG IS '確定ＦＬＧ // #MA.FLG // Firm flg.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.ABORT_FLG IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.CMPL_FLG IS '完了ＦＬＧ // #MA.FLG // Completed flg.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.ALLOC_FLG IS '場所引当ＦＬＧ // #MA.FLG // Location allocation flg.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.NOT_LOT_MIX_FLG IS 'ロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed lots flg.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.NOT_SUBLOT_MIX_FLG IS 'サブロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed sublots flg.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.VLD_DT_FR IS '有効期限ＦＲＯＭ // #MA.DT // Expiration date FROM';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.VLD_DT_TO IS '有効期限ＴＯ // #MA.DT // Expiration date TO';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.PROV_TYP IS '支給区分 // #MA.PROV_TYP // Supply type';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.PROV_BASIS_TYP IS '支給計上区分 // #MA.PROV_BASIS_TYP // Supply recording type';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.RET_PROV_TYP IS '支給区分（返品） // #MA.PROV_TYP // Supply type (Return)';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.RET_PROV_BASIS_TYP IS '支給計上区分（返品） // #MA.PROV_BASIS_TYP // Supply recording type (Return)';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.IO_SCHD_PR_NO IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.SUB_CHAR1 IS '予備１ // #MS.XFR_ALLOC_STS_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.SUB_CHAR2 IS '予備２ // #MS.XFR_ALLOC_STS_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.SUB_CHAR3 IS '予備３ // #MS.XFR_ALLOC_STS_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_XFR_ALLOC_STS_SV.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

