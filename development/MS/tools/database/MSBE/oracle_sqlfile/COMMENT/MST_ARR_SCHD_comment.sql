
COMMENT ON TABLE MST_ARR_SCHD IS '入荷予定 // Receipt schedule';


COMMENT ON COLUMN MST_ARR_SCHD.ARR_SCHD_NO IS '入荷予定ＮＯ // #MA.ARR_SCHD_NO // Receipt schedule No.';


COMMENT ON COLUMN MST_ARR_SCHD.ARR_PR_NO IS '入荷進捗ＮＯ // #MA.ARR_PR_NO // Receipt progress No.';


COMMENT ON COLUMN MST_ARR_SCHD.PRMS_RCPT_D_NO IS '納期回答受領明細ＮＯ // #MA.PRMS_RCPT_D_NO // Order promising result received details No.';


COMMENT ON COLUMN MST_ARR_SCHD.DLV_INST_D_NO IS '納入指示明細ＮＯ // #MA.DLV_INST_D_NO // Delivery order details No.';


COMMENT ON COLUMN MST_ARR_SCHD.PURC_ACT_D_NO IS '仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Purchase result details No.';


COMMENT ON COLUMN MST_ARR_SCHD.RCPT_IV_NO IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN MST_ARR_SCHD.RCPT_IV_MNG_NO IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN MST_ARR_SCHD.PR_STS_TYP IS '進捗状況区分 // #MS.PR_STS_TYP // Progress status type';


COMMENT ON COLUMN MST_ARR_SCHD.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_ARR_SCHD.DLV_SLIP_NO IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN MST_ARR_SCHD.DLV_SLIP_MNG_NO IS '納品書管理ＮＯ // #MS.DLV_SLIP_MNG_NO // Delivery note management No.';


COMMENT ON COLUMN MST_ARR_SCHD.DLV_SLIP_MNG_SEQ IS '納品書管理連番 // #MA.SLIP_SEQ // Delivery note management sequence number';


COMMENT ON COLUMN MST_ARR_SCHD.DLV_SLIP_MNG_D_NO IS '納品書明細管理ＮＯ // #MS.DLV_SLIP_MNG_D_NO // Delivery note details management No.';


COMMENT ON COLUMN MST_ARR_SCHD.DLV_SLIP_MNG_D_SEQ IS '納品書明細管理連番 // #MA.SLIP_SEQ // Delivery note details management sequence number';


COMMENT ON COLUMN MST_ARR_SCHD.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MST_ARR_SCHD.ARR_PTN_TYP IS '入荷パタン区分 // #MA.ARR_PTN_TYP // Receipt pattern type';


COMMENT ON COLUMN MST_ARR_SCHD.ARR_SCHD_TM IS '入荷予定日時 // #MA.TM // Scheduled receipt date and time';


COMMENT ON COLUMN MST_ARR_SCHD.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_ARR_SCHD.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_ARR_SCHD.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_ARR_SCHD.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_ARR_SCHD.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_ARR_SCHD.RCPT_IV_ITM_NM IS '受領インボイス表記品名 // #MA.ITM_NM // Item name for purchase invoice';


COMMENT ON COLUMN MST_ARR_SCHD.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MST_ARR_SCHD.PURC_ID_TYP IS '購買識別区分 // #MA.PURC_ID_TYP // Purchase identification type';


COMMENT ON COLUMN MST_ARR_SCHD.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_ARR_SCHD.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_ARR_SCHD.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_ARR_SCHD.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_ARR_SCHD.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_ARR_SCHD.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_ARR_SCHD.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_ARR_SCHD.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MST_ARR_SCHD.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_ARR_SCHD.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_ARR_SCHD.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_ARR_SCHD.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_ARR_SCHD.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_ARR_SCHD.RET_LOC_CD IS '返品元場所ＣＤ // #MA.LOC_CD // Return-from location cd.';


COMMENT ON COLUMN MST_ARR_SCHD.RET_STR_LN_CD IS '返品元棚・ラインＣＤ // #MA.STR_LN_CD // Return-from rack/line cd.';


COMMENT ON COLUMN MST_ARR_SCHD.RET_GD_CD IS '返品元格付ＣＤ // #MA.STK_GD_CD // Return-from grading cd.';


COMMENT ON COLUMN MST_ARR_SCHD.SPPL_ITM_CD IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN MST_ARR_SCHD.SPPL_ITM_NM IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN MST_ARR_SCHD.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MST_ARR_SCHD.BP_LOT_NO IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN MST_ARR_SCHD.LG_GRP_CD IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN MST_ARR_SCHD.ARR_LOC_CD IS '入荷場所ＣＤ // #MA.LOC_CD // Receipt location cd.';


COMMENT ON COLUMN MST_ARR_SCHD.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_ARR_SCHD.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_ARR_SCHD.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_ARR_SCHD.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_ARR_SCHD.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_ARR_SCHD.ARR_QTY IS '入荷数量 // #MA.QTY // Receipt qty.';


COMMENT ON COLUMN MST_ARR_SCHD.PURC_QTY IS '仕入数量 // #MA.QTY // Purchase qty.';


COMMENT ON COLUMN MST_ARR_SCHD.SLS_RET_QTY IS '売上返品数量 // #MA.QTY // Sales return qty.';


COMMENT ON COLUMN MST_ARR_SCHD.ABORT_QTY IS '打切数量 // #MA.QTY // Cancelled remaining qty.';


COMMENT ON COLUMN MST_ARR_SCHD.ABORT_FLG IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN MST_ARR_SCHD.SLS_RET_SCHD_ABORT_QTY IS '売上返品予定打切数量 // #MA.QTY // Cancelled remaining sales return schedule qty.';


COMMENT ON COLUMN MST_ARR_SCHD.SLS_RET_SCHD_ABORT_FLG IS '売上返品予定打切ＦＬＧ // #MA.FLG // Cancel remaining sales return schedule flg.';


COMMENT ON COLUMN MST_ARR_SCHD.SYNC_FLG IS '同時計上ＦＬＧ // #MA.FLG // Simultaneous recording flg.';


COMMENT ON COLUMN MST_ARR_SCHD.CMPL_FLG IS '完了ＦＬＧ // #MA.FLG // Completed flg.';


COMMENT ON COLUMN MST_ARR_SCHD.SLS_RET_SCHD_CMPL_FLG IS '売上返品予定完了ＦＬＧ // #MA.FLG // Sales return schedule completion flg.';


COMMENT ON COLUMN MST_ARR_SCHD.ARR_SPLIT_FLG IS '入荷実績分割ＦＬＧ // #MA.FLG // Receipt result split flg.';


COMMENT ON COLUMN MST_ARR_SCHD.ARR_SKIP_FLG IS '入荷不要ＦＬＧ // #MA.FLG // Not receipt flg.';


COMMENT ON COLUMN MST_ARR_SCHD.RE_ARR_SCHD_FLG IS '再入荷予定ＦＬＧ // #MA.FLG // Scheduled re-receipt flg.';


COMMENT ON COLUMN MST_ARR_SCHD.OUTSRC_FLG IS '外注ＦＬＧ // #MA.FLG // Subcontracting flg.';


COMMENT ON COLUMN MST_ARR_SCHD.MFG_INST_NO IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN MST_ARR_SCHD.PRE_OUTSRC_ACT_FLG IS '外注実績先行ＦＬＧ // #MA.FLG // Subcontracting result prior flg.';


COMMENT ON COLUMN MST_ARR_SCHD.PRE_MFG_ACT_NO IS '先行製造実績ＮＯ // #MA.MFG_ACT_NO // Prior mfg. result No.';


COMMENT ON COLUMN MST_ARR_SCHD.WMS_FLG IS 'ＷＭＳＦＬＧ // #MA.FLG // WMS flg.';


COMMENT ON COLUMN MST_ARR_SCHD.INTR_RMRKS IS '内部備考 // #MS.ARR_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_ARR_SCHD.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_ARR_SCHD.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_ARR_SCHD.ARR_CNT_RMRKS IS '入荷連絡備考 // #MS.ARR_CNT_RMRKS // Receipt contact remarks';


COMMENT ON COLUMN MST_ARR_SCHD.DLV_SLIP_D_RMRKS IS '納品書明細備考 // #MA.TRD_D_RMRKS // Delivery note details remarks';


COMMENT ON COLUMN MST_ARR_SCHD.IO_SCHD_PR_NO IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN MST_ARR_SCHD.SUB_CHAR1 IS '予備１ // #MS.ARR_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_ARR_SCHD.SUB_CHAR2 IS '予備２ // #MS.ARR_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_ARR_SCHD.SUB_CHAR3 IS '予備３ // #MS.ARR_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_ARR_SCHD.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_ARR_SCHD.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_ARR_SCHD.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_ARR_SCHD.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_ARR_SCHD.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_ARR_SCHD.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_ARR_SCHD.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_ARR_SCHD.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_ARR_SCHD.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_ARR_SCHD.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

