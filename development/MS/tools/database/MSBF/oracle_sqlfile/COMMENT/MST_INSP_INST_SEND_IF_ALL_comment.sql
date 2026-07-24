
COMMENT ON TABLE MST_INSP_INST_SEND_IF_ALL IS '検査指図送信ＩＦ // Inspection order export IF';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_NO IS '検査ＮＯ // #MA.INSP_NO // Inspection No.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_FREQ IS '検査回数 // #MS.INSP_FREQ // Number of inspections';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_TYP IS '検査種類区分 // #MS.INSP_TYP // Inspection classification type';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_MTD_TYP IS '検査方法区分 // #MA.INSP_MTD_TYP // Inspection method type';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_STS_TYP IS '検査状況区分 // #MS.INSP_STS_TYP // Inspection status type';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_BIND_TYP IS '検査実施単位区分 // #MA.INSP_BIND_TYP // Inspection implementation unit type';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.COL_SCHD_FLG IS '予定まとめＦＬＧ // #MA.FLG // Schedule aggregation flg.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_LST_PRNT_FLG IS '検査指図リスト発行済ＦＬＧ // #MA.FLG // Inspection order list issued flg.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_LST_PRNT_TM IS '検査指図リスト発行日時 // #MA.TM // Inspection order list issue date and time';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_ITM_CD IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_ITM_SUB1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_ITM_SUB2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_ITM_SUB3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.ARR_TM IS '入荷日時 // #MA.TM // Receipt date and time';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.FIRST_GR_DT IS '最古入庫日 // #MA.DT // Oldest GR date';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.VLD_DT IS '有効期限 // #MA.DT // Expiration date';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.LMT_DT IS '使用期限 // #MA.DT // Usage expiration date';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.LMT_DT_FRM IS '起算日 // #MA.DT // Base date';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_SPPL_CD IS 'ＩＦ発注先ＣＤ // #MA.IF_EXT_SYS_CD // IF supplier cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SPPL_NM IS '発注先名 // #MA.BP_NM // Supplier name';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_MAKER_CD IS 'ＩＦメーカＣＤ // #MA.IF_EXT_SYS_CD // IF maker cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.MAKER_NM IS 'メーカ名 // #MA.BP_NM // Maker name';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.MFG_LOC_CD IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_MFG_LOC_CD IS 'ＩＦ製造場所ＣＤ // #MA.IF_EXT_SYS_CD // IF mfg. location cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.MFG_LOC_NM IS '製造場所名 // #MA.LOC_NM // Mfg. location name';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.TO_SITE_CD IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_TO_SITE_CD IS 'ＩＦ工場・物流倉庫ＣＤ // #MA.IF_EXT_SYS_CD // IF factory/distribution warehouse cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.TO_SITE_NM IS '工場・物流倉庫名 // #MA.SITE_NM // Factory/Distribution warehouse name';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.BP_LOT_NO IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.PACK_UNIT_QTY IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.PACK_UNIT_CD IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_PACK_UNIT_CD IS 'ＩＦ荷姿単位ＣＤ // #MA.IF_EXT_SYS_CD // IF SKU cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.PACK_UNIT_NM IS '荷姿単位名 // #MA.UNIT_NM // SKU name';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_BASE_UNIT_CD IS 'ＩＦ基準単位ＣＤ // #MA.IF_EXT_SYS_CD // IF base unit cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.BASE_UNIT_NM IS '基準単位名 // #MA.UNIT_NM // Base unit name';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_LST_NO IS '検査指図リストＮＯ // #MA.INSP_LST_NO // Inspection order list No.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INST_DT IS '指図日 // #MA.DT // Order date';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INST_DPT_CD IS '指図部門ＣＤ // #MA.DPT_CD // Order dept. cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_INST_DPT_CD IS 'ＩＦ指図部門ＣＤ // #MA.IF_EXT_SYS_CD // IF order dept. cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INST_DPT_NM IS '指図部門名 // #MA.DPT_NM // Order dept. name';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INST_USR_CD IS '指図担当者ＣＤ // #MA.USR_CD // Order PIC cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_INST_USR_CD IS 'ＩＦ指図担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF order PIC cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INST_USR_NM IS '指図担当者名 // #MA.USR_NM // Order PIC name';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SRC_DPT_CD IS '作成元部門ＣＤ // #MA.DPT_CD // Creating source dept. cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_SRC_DPT_CD IS 'ＩＦ作成元部門ＣＤ // #MA.IF_EXT_SYS_CD // IF creating source dept. cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SRC_DPT_NM IS '作成元部門名 // #MA.DPT_NM // Creating source dept. name';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SRC_USR_CD IS '作成元担当者ＣＤ // #MA.USR_CD // Creating source PIC cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_SRC_USR_CD IS 'ＩＦ作成元担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF creating source PIC cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SRC_USR_NM IS '作成元担当者名 // #MA.USR_NM // Creating source PIC name';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.MASTER_DT IS 'マスタ適用日 // #MA.DT // Master application date';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.MFG_ST_SCHD_TM IS '製造着手予定日時 // #MA.TM // Scheduled mfg. start date and time';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.MFG_END_SCHD_TM IS '製造終了予定日時 // #MA.TM // Scheduled mfg. end date and time';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_ST_TM IS '検査開始予定日時 // #MA.TM // Scheduled inspection start date and time';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_END_TM IS '検査終了予定日時 // #MA.TM // Scheduled inspection end date and time';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_PTN_CD IS '検査パタンＣＤ // #MA.INSP_PTN_CD // Inspection pattern cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_PTN_NM IS '検査パタン名 // #MA.INSP_PTN_NM // Inspection pattern name';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STD_REQ_FLG IS '規格検査必須ＦＬＧ // #MA.FLG // Specific inspection required flg.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STD_CNF_REQ_FLG IS '規格実績確認必須ＦＬＧ // #MA.FLG // Specific result check required flg.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_STD_NO IS '規格書ＮＯ // #MA.INSP_STD_NO // Specific inspection No.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.PLNT_APRV_FLG IS '工場出荷承認対象ＦＬＧ // #MA.FLG // For factory release approval flg.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_RSLT_PRNT_FLG IS '検査成績書発行済ＦＬＧ // #MA.FLG // Inspection report printed flg.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_RSLT_PRNT_TM IS '検査成績書発行日時 // #MA.TM // Inspection report printed date and time';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SEQ IS '検査成績書連番 // #MA.PRNT_SEQ // Inspection report sequence number';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.LMT_UP_FLG IS '期限再検査ＦＬＧ // #MA.FLG // Re-inspection for expiration flg.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_APRV_FLG IS '検査承認対象ＦＬＧ // #MA.FLG // For inspection approval flg.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_APRV_STS_TYP IS '検査承認状況区分 // #MS.INSP_APRV_STS_TYP // Inspection approval status type';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.APRV_DT IS '承認日 // #MA.DT // Approval date';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_APRV_ROLE_CD IS '検査承認役割ＣＤ // #MA.APRV_ROLE_CD // Inspection approval role cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_APRV_ROLE_NM IS '検査承認役割名 // #MA.APRV_ROLE_NM // Inspection approval role name';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.APRV_DPT_CD IS '承認部門ＣＤ // #MA.DPT_CD // Approval dept. cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_APRV_DPT_CD IS 'ＩＦ承認部門ＣＤ // #MA.IF_EXT_SYS_CD // IF approval dept. cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.APRV_DPT_NM IS '承認部門名 // #MA.DPT_NM // Approval dept. name';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.APRV_USR_CD IS '承認者ＣＤ // #MA.USR_CD // Approver cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_APRV_USR_CD IS 'ＩＦ承認者ＣＤ // #MA.IF_EXT_SYS_CD // IF approver cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.APRV_USR_NM IS '承認者名 // #MA.USR_NM // Approver name';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.APRV_RSN IS '承認理由 // #MS.INSP_INST_APRV_RSN // Approval reason';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.ACT_CONT_FCTR IS '実際有効成分係数 // #MA.ACT_CONT_FCTR // Actual active ingredient coefficient';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INTR_RMRKS IS '内部備考 // #MS.INSP_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_SCHD_NO IS '検査予定ＮＯ // #MA.INSP_SCHD_NO // Inspection schedule No.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SRC_NO1 IS '作成元ＮＯ１ // #MA.SRC_NO // Source No. 1';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SRC_NO2 IS '作成元ＮＯ２ // #MA.SRC_NO // Source No. 2';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SRC_NO3 IS '作成元ＮＯ３ // #MA.SRC_NO // Source No. 3';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SRC_NO4 IS '作成元ＮＯ４ // #MA.SRC_NO // Source No. 4';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_LOC_CD IS '場所ＣＤ（予定） // #MA.LOC_CD // Location cd. (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_SCHD_LOC_CD IS 'ＩＦ場所ＣＤ（予定） // #MA.IF_EXT_SYS_CD // IF location cd. (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_LOC_NM IS '場所名（予定） // #MA.LOC_NM // Location name (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_STR_LN_CD IS '棚・ラインＣＤ（予定） // #MA.STR_LN_CD // Rack/Line cd. (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_SCHD_STR_LN_CD IS 'ＩＦ棚・ラインＣＤ（予定） // #MA.IF_EXT_SYS_CD // IF rack/line cd. (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_STR_LN_NM IS '棚・ライン名（予定） // #MA.STR_LN_NM // Rack/Line name (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_STK_ARRV_BP_CD IS '在庫着荷先ＣＤ（予定） // #MA.BP_CD // Inventory arriving point cd. (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_SCHD_STK_ARRV_BP_CD IS 'ＩＦ在庫着荷先ＣＤ（予定） // #MA.IF_EXT_SYS_CD // IF inventory arriving point cd. (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_STK_ARRV_BP_NM IS '在庫着荷先名（予定） // #MA.BP_NM // Inventory arriving point name (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_SNO1 IS '手配ＮＯ１（予定） // #MA.SNO1 // SEIBAN No. 1 (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_SNO2 IS '手配ＮＯ２（予定） // #MA.SNO2 // SEIBAN No. 2 (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_SNO3 IS '手配ＮＯ３（予定） // #MA.SNO3 // SEIBAN No. 3 (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_SNO4 IS '手配ＮＯ４（予定） // #MA.SNO4 // SEIBAN No. 4 (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_GD_CD IS '格付ＣＤ（予定） // #MA.STK_GD_CD // Grading cd. (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_SCHD_GD_CD IS 'ＩＦ格付ＣＤ（予定） // #MA.IF_EXT_SYS_CD // IF grading cd. (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_GD_NM IS '格付名（予定） // #MA.STK_GD_NM // Grading name (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_QUALITY_TYP IS '良品区分（予定） // #MA.QUALITY_TYP // Conforming type (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_STK_INSP_TYP IS '在庫検査区分（予定） // #MS.STK_INSP_TYP // Inventory inspection type (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_STK_ID_TYP IS '在庫識別区分（予定） // #MS.STK_ID_TYP // Inventory identification type (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_STK_BP_CD IS '在庫取引先ＣＤ（予定） // #MA.BP_CD // Inventory BP cd. (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_SCHD_STK_BP_CD IS 'ＩＦ在庫取引先ＣＤ（予定） // #MA.IF_EXT_SYS_CD // IF inventory BP cd. (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_STK_BP_NM IS '在庫取引先名（予定） // #MA.BP_NM // Inventory BP name (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_PACK_UNIT_QTY IS '荷姿単位数量（予定） // #MA.QTY // SKU qty. (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_PACK_UNIT_CD IS '荷姿単位ＣＤ（予定） // #MA.UNIT_CD // SKU cd. (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_SCHD_PACK_UNIT_CD IS 'ＩＦ荷姿単位ＣＤ（予定） // #MA.IF_EXT_SYS_CD // IF SKU cd. (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_PACK_UNIT_NM IS '荷姿単位名（予定） // #MA.UNIT_NM // SKU name (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_BASE_UNIT_QTY IS '基準単位数量（予定） // #MA.QTY // Base unit qty. (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_BASE_UNIT_CD IS '基準単位ＣＤ（予定） // #MA.UNIT_CD // Base unit cd. (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_SCHD_BASE_UNIT_CD IS 'ＩＦ基準単位ＣＤ（予定） // #MA.IF_EXT_SYS_CD // IF base unit cd. (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SCHD_BASE_UNIT_NM IS '基準単位名（予定） // #MA.UNIT_NM // Base unit name (Schedule)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_LOC_CD IS '場所ＣＤ（在庫） // #MA.LOC_CD // Location cd. (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_STK_LOC_CD IS 'ＩＦ場所ＣＤ（在庫） // #MA.IF_EXT_SYS_CD // IF location cd. (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_LOC_NM IS '場所名（在庫） // #MA.LOC_NM // Location name (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_STR_LN_CD IS '棚・ラインＣＤ（在庫） // #MA.STR_LN_CD // Rack/Line cd. (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_STK_STR_LN_CD IS 'ＩＦ棚・ラインＣＤ（在庫） // #MA.IF_EXT_SYS_CD // IF rack/line cd. (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_STR_LN_NM IS '棚・ライン名（在庫） // #MA.STR_LN_NM // Rack/Line name (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ（在庫） // #MA.BP_CD // Inventory arriving point cd. (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_STK_ARRV_BP_CD IS 'ＩＦ在庫着荷先ＣＤ（在庫） // #MA.IF_EXT_SYS_CD // IF inventory arriving point cd. (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_ARRV_BP_NM IS '在庫着荷先名（在庫） // #MA.BP_NM // Inventory arriving point name (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_SNO1 IS '手配ＮＯ１（在庫） // #MA.SNO1 // SEIBAN No. 1 (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_SNO2 IS '手配ＮＯ２（在庫） // #MA.SNO2 // SEIBAN No. 2 (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_SNO3 IS '手配ＮＯ３（在庫） // #MA.SNO3 // SEIBAN No. 3 (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_SNO4 IS '手配ＮＯ４（在庫） // #MA.SNO4 // SEIBAN No. 4 (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_FIX_NO_TYP IS '確定ＮＯ区分（在庫） // #MS.FIX_NO_TYP // Firm No. type (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_FIX_NO IS '確定ＮＯ（在庫） // #MA.FIX_NO // Firm No. (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_PACK_UNIT_CD IS '荷姿単位ＣＤ（在庫） // #MA.UNIT_CD // SKU cd. (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_STK_PACK_UNIT_CD IS 'ＩＦ荷姿単位ＣＤ（在庫） // #MA.IF_EXT_SYS_CD // IF SKU cd. (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_PACK_UNIT_NM IS '荷姿単位名（在庫） // #MA.UNIT_NM // SKU name (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_GD_CD IS '格付ＣＤ（在庫） // #MA.STK_GD_CD // Grading cd. (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_STK_GD_CD IS 'ＩＦ格付ＣＤ（在庫） // #MA.IF_EXT_SYS_CD // IF grading cd. (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_GD_NM IS '格付名（在庫） // #MA.STK_GD_NM // Grading name (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_QUALITY_TYP IS '良品区分（在庫） // #MA.QUALITY_TYP // Conforming type (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_INSP_TYP IS '在庫検査区分（在庫） // #MS.STK_INSP_TYP // Inventory inspection type (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_ID_TYP IS '在庫識別区分（在庫） // #MS.STK_ID_TYP // Inventory identification type (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_BP_CD IS '在庫取引先ＣＤ（在庫） // #MA.BP_CD // Inventory BP cd. (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_STK_BP_CD IS 'ＩＦ在庫取引先ＣＤ（在庫） // #MA.IF_EXT_SYS_CD // IF inventory BP cd. (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_BP_NM IS '在庫取引先名（在庫） // #MA.BP_NM // Inventory BP name (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_PACK_UNIT_QTY IS '荷姿単位数量（在庫） // #MA.QTY // SKU qty. (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.STK_BASE_UNIT_QTY IS '基準単位数量（在庫） // #MA.QTY // Base unit qty. (Inventory)';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SMPL_SCHD_QTY IS '抜取予定数量 // #MA.QTY // Sampling scheduled qty.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SMPL_INST_QTY IS '抜取指図数量 // #MA.QTY // Sampling order qty.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.OWN_INSP_NO IS '参照検査ＮＯ // #MA.INSP_NO // Reference inspection No.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.OWN_INSP_SCHD_NO IS '参照検査予定ＮＯ // #MA.INSP_SCHD_NO // Reference inspection schedule No.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.ORG_INSP_SCHD_NO IS '初回検査予定ＮＯ // #MA.INSP_SCHD_NO // Initial inspection schedule No.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.ITM_ORD_NO IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IN_PRMT_INSP_FLG IS '検査中使用許可ＦＬＧ // #MA.FLG // Allow inspecting use flg.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_TRD_CD IS 'ＩＦ取引ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.TRD_NM IS '取引名 // #MA.TRD_NM // Transaction name';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_LT IS '検査ＬＴ // #MA.LT // Inspection LT';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_OFFST IS '検査オフセット // #MA.OFFST // Inspection offset';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INSP_CNT_RMRKS IS '検査連絡備考 // #MS.INSP_CNT_RMRKS // Inspection contact remarks';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.IF_CO_CD IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.CO_NM IS '会社名 // #MA.CO_NM // Company name';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_CHAR30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_NUM4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_NUM5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_DT4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.SUB_DT5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_INSP_INST_SEND_IF_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

