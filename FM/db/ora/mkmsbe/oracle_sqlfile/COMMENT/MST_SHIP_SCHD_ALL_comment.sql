
COMMENT ON TABLE MST_SHIP_SCHD_ALL IS '出荷予定 // Shipping schedule';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SHIP_SCHD_NO IS '出荷予定ＮＯ // #MA.SHIP_SCHD_NO // Shipping schedule No.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.PR_STS_TYP IS '進捗状況区分 // #MS.PR_STS_TYP // Progress status type';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SHIP_PR_NO IS '出荷進捗ＮＯ // #MA.SHIP_PR_NO // Shipping progress No.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SHIP_INST_D_NO IS '出荷指図明細ＮＯ // #MA.SHIP_INST_D_NO // Shipping order details No.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.DLV_INST_RCPT_NO IS '納入指示受領ＮＯ // #MA.DLV_INST_RCPT_NO // Delivery order received No.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SLO_PRMS_NO IS '受注納期回答ＮＯ // #MA.SLO_PRMS_NO // Sales order promising No.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SLS_ACT_D_NO IS '売上実績明細ＮＯ // #MA.SLS_ACT_D_NO // Sales result details No.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SHIP_FR_LG_GRP_CD IS '出荷元物流グループＣＤ // #MA.LG_GRP_CD // Shipping point distribution group cd.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.PD_INST_DLV_TM IS '納品依頼日時 // #MA.TM // Delivery request date and time';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SHIP_RQST_TM IS '出荷希望日時 // #MA.TM // Desired shipping date and time';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SHIP_SCHD_TM IS '出荷予定日時 // #MA.TM // Scheduled shipping date and time';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.DLV_SCHD_TM IS '納品予定日時 // #MA.TM // Scheduled delivery date and time';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SHIP_TERM_CD IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SHIP_WK_CD IS '出荷作業ＣＤ // #MA.SHIP_WK_CD // Shipping operation cd.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.IV_ITM_NM IS 'インボイス表記用品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SNO1_NULL_FLG IS '手配ＮＯ１無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 1 flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SNO2_NULL_FLG IS '手配ＮＯ２無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 2 flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SNO3_NULL_FLG IS '手配ＮＯ３無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 3 flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SNO4_NULL_FLG IS '手配ＮＯ４無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 4 flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.ALLOC_QTY IS '引当数量 // #MA.QTY // Allocation qty.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.WAIT_QTY IS '保留数量 // #MA.QTY // Pending qty.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SHIP_INST_QTY IS '出荷指図数量 // #MA.QTY // Shipping order qty.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SHIP_ACT_QTY IS '出荷実績数量 // #MA.QTY // Shipping result qty.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.IV_SCHD_QTY IS 'インボイス出荷予定数量 // #MA.QTY // Invoice shipping scheduled qty.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.IV_ACT_QTY IS 'インボイス出荷実績数量 // #MA.QTY // Invoice shipping result qty.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SLS_QTY IS '売上数量 // #MA.QTY // Sales qty.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.DLV_QTY IS '納品数量 // #MA.QTY // Delivery qty.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SHIP_RET_QTY IS '出荷返品数量 // #MA.QTY // Shipping return qty.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.ABORT_QTY IS '打切数量 // #MA.QTY // Cancelled remaining qty.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.ABORT_FLG IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.NOT_DT_CALC_FLG IS '予定日計算対象外ＦＬＧ // #MA.FLG // Not to calculate scheduled date flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.FIX_FLG IS '確定ＦＬＧ // #MA.FLG // Firm flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.CMPL_FLG IS '完了ＦＬＧ // #MA.FLG // Completed flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.ALLOC_PRIO IS '引当順ＮＯ // #MS.STK_ALLOC_PRIO // Allocation sequence No.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SHIP_ABL_FLG IS '出荷判定ＦＬＧ // #MA.FLG // Shipping decision flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SHIP_LOT_CHK_TAR_FLG IS '出荷ロットチェックＦＬＧ // #MA.FLG // Shipping lot check flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SHIP_BLOCK_FLG IS '出荷留めＦＬＧ // #MA.FLG // Pending shipping flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.INST_BNDL_FLG IS '指図まとめＦＬＧ // #MA.FLG // Order aggregation flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.NOT_LOT_MIX_FLG IS 'ロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed lots flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.NOT_SUBLOT_MIX_FLG IS 'サブロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed sublots flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.VLD_DT_FR IS '有効期限ＦＲＯＭ // #MA.DT // Expiration date FROM';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.VLD_DT_TO IS '有効期限ＴＯ // #MA.DT // Expiration date TO';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SHIP_SKIP_FLG IS '出荷不要ＦＬＧ // #MA.FLG // Shipping unnecessary flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.RE_SHIP_SCHD_FLG IS '再出荷予定ＦＬＧ // #MA.FLG // Shipping re-schedule flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.INTR_RMRKS IS '内部備考 // #MS.SHIP_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SHIP_CNT_RMRKS IS '出荷連絡備考 // #MS.SHIP_CNT_RMRKS // Shipping notification remarks';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.DLV_CD IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.DLV_SUNDRY_FLG IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.DLV_NM IS '納品先名 // #MA.BP_NM // Delivery destination name';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.DLV_CNTCT_DPT IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.DLV_CNTCT_PSN IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.DLV_ZIP_CD IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.DLV_ADDR1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.DLV_ADDR2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.DLV_ADDR3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.DLV_ADDR4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.DLV_TEL IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.DLV_FAX IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.DLV_LG_GRP_CD IS '納品先物流グループＣＤ // #MA.LG_GRP_CD // Delivery destination distribution group cd.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.PRI_PRNT_FLG IS '価格印字ＦＬＧ // #MA.FLG // Print price flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.TDLV_CD IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.TDLV_SUNDRY_FLG IS '配送先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.TDLV_NM IS '配送先名 // #MA.BP_NM // Receiving point name';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.VIA_DLV_TYP IS '配送先経由区分 // #MA.VIA_DLV_TYP // Receiving point stopover type';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.TDLV_CNTCT_DPT IS '配送先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.TDLV_CNTCT_PSN IS '配送先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.TDLV_ZIP_CD IS '配送先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.TDLV_ADDR1 IS '配送先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.TDLV_ADDR2 IS '配送先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.TDLV_ADDR3 IS '配送先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.TDLV_ADDR4 IS '配送先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.TDLV_TEL IS '配送先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.TDLV_FAX IS '配送先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.TDLV_LG_GRP_CD IS '配送先物流グループＣＤ // #MA.LG_GRP_CD // Receiving point distribution group cd.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.DLV_DAY_WEEK_TYP IS '着曜日 // #MA.DAY_WEEK_TYP // Arrival day of week';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.BASE_DLV_SLIP_NO IS '返品元納品書ＮＯ // #MA.DLV_SLIP_NO // Return-from delivery note No.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.BASE_PROV_ACT_NO IS '返品元支給実績ＮＯ // #MA.PROV_ACT_NO // Return-from supply result No.';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.BASE_AC_DT IS '支給計上日（基） // #MA.DT // Supply recording date (Base)';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SUB_CHAR1 IS '予備１ // #MS.SHIP_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SUB_CHAR2 IS '予備２ // #MS.SHIP_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.SUB_CHAR3 IS '予備３ // #MS.SHIP_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_SHIP_SCHD_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

