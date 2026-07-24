
COMMENT ON TABLE MST_ARR_ACT_ALL IS '入荷実績 // Receipt result';


COMMENT ON COLUMN MST_ARR_ACT_ALL.ARR_ACT_NO IS '入荷実績ＮＯ // #MA.ARR_ACT_NO // Receipt result No.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.ARR_ACT_REV IS '入荷実績改訂番号 // #MA.SLIP_REV // Receipt result rev. number';


COMMENT ON COLUMN MST_ARR_ACT_ALL.ARR_SCHD_NO IS '入荷予定ＮＯ // #MA.ARR_SCHD_NO // Receipt schedule No.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_ARR_ACT_ALL.PURC_ACT_IO_NO IS '仕入実績受払ＮＯ // #MA.PURC_ACT_IO_NO // Purchase result GR/GI No.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_ARR_ACT_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_ARR_ACT_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_ARR_ACT_ALL.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_ARR_ACT_ALL.RCPT_IV_ITM_NM IS '受領インボイス表記品名 // #MA.ITM_NM // Item name for purchase invoice';


COMMENT ON COLUMN MST_ARR_ACT_ALL.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.SNO1_MNG_TYP IS '手配ＮＯ１管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 1 management type';


COMMENT ON COLUMN MST_ARR_ACT_ALL.SNO2_MNG_TYP IS '手配ＮＯ２管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 2 management type';


COMMENT ON COLUMN MST_ARR_ACT_ALL.SNO3_MNG_TYP IS '手配ＮＯ３管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 3 management type';


COMMENT ON COLUMN MST_ARR_ACT_ALL.SNO4_MNG_TYP IS '手配ＮＯ４管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 4 management type';


COMMENT ON COLUMN MST_ARR_ACT_ALL.PURC_ID_TYP IS '購買識別区分 // #MA.PURC_ID_TYP // Purchase identification type';


COMMENT ON COLUMN MST_ARR_ACT_ALL.STK_MNG_TYP IS '在庫管理区分 // #MA.STK_MNG_TYP // Inventory management type';


COMMENT ON COLUMN MST_ARR_ACT_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_ARR_ACT_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_ARR_ACT_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_ARR_ACT_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_ARR_ACT_ALL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_ARR_ACT_ALL.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_ARR_ACT_ALL.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_ARR_ACT_ALL.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.SPPL_ITM_CD IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.SPPL_ITM_NM IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN MST_ARR_ACT_ALL.RQST_DPT_CD IS '依頼元部門ＣＤ // #MA.DPT_CD // Requesting dept. cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.RQST_USR_CD IS '依頼元担当者ＣＤ // #MA.USR_CD // Requesting PIC cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.ARR_DPT_CD IS '入荷部門ＣＤ // #MA.DPT_CD // Receipt dept. cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.ARR_USR_CD IS '入荷担当者ＣＤ // #MA.USR_CD // Receipt PIC cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.SRET_FR_CD IS '引取先ＣＤ // #MA.BP_CD // Pickup company cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.RET_LOC_CD IS '返品元場所ＣＤ // #MA.LOC_CD // Return-from location cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.RET_STR_LN_CD IS '返品元棚・ラインＣＤ // #MA.STR_LN_CD // Return-from rack/line cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.RET_GD_CD IS '返品元格付ＣＤ // #MA.STK_GD_CD // Return-from grading cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.BP_LOT_NO IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.BP_DLV_SLIP_NO IS '業者納品書ＮＯ // #MA.BP_DLV_SLIP_NO // Vendor delivery note No.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.BP_DLV_SLIP_D_NO IS '業者納品書明細ＮＯ // #MA.BP_DLV_SLIP_D_NO // Vendor delivery note details No.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.SHIP_FR_VALID_DT IS '出荷元期限 // #MA.DT // Shipping point deadline';


COMMENT ON COLUMN MST_ARR_ACT_ALL.LG_GRP_CD IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.ARR_LOC_CD IS '入荷場所ＣＤ // #MA.LOC_CD // Receipt location cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.ARR_TM IS '入荷日時 // #MA.TM // Receipt date and time';


COMMENT ON COLUMN MST_ARR_ACT_ALL.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_ARR_ACT_ALL.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.PACK_UNIT_QTY IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.PACK_UNIT_CD IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_ARR_ACT_ALL.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_ARR_ACT_ALL.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MST_ARR_ACT_ALL.BASE_CUR_TAX_AMT IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN MST_ARR_ACT_ALL.PTAX_CUR_AMT IS '納税通貨金額 // #MA.MONEY // Amount (Tax currency)';


COMMENT ON COLUMN MST_ARR_ACT_ALL.PTAX_CUR_TAX_AMT IS '納税通貨税額 // #MA.MONEY // Tax amount (Tax currency)';


COMMENT ON COLUMN MST_ARR_ACT_ALL.PURC_CONT_QTY IS '仕入有効成分 // #MA.PURC_CONT_QTY // Purchase active ingredient';


COMMENT ON COLUMN MST_ARR_ACT_ALL.RSN_CD IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.BD_WG_CD IS '負担ワーキンググループＣＤ // #MA.WG_CD // Charged WG cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.STK_LST_PRNT_FLG IS '現品票発行済ＦＬＧ // #MA.FLG // Identification tag issued flg.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.SYNC_FLG IS '同時計上ＦＬＧ // #MA.FLG // Simultaneous recording flg.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.EDI_FLG IS 'ＥＤＩＦＬＧ // #MA.FLG // EDI flg.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.EDI_BP_DLV_SLIP_NO IS 'ＥＤＩ業者納品書ＮＯ // #MA.BP_DLV_SLIP_NO // EDI vendor delivery note No.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.EDI_BP_DLV_SLIP_D_NO IS 'ＥＤＩ業者納品書明細ＮＯ // #MA.BP_DLV_SLIP_D_NO // EDI vendor delivery note details No.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.DLV_SLIP_NO IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.DLV_SLIP_D_NO IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.WMS_FLG IS 'ＷＭＳＦＬＧ // #MA.FLG // WMS flg.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.EXT_ARR_ACT_NO IS '外部入荷実績ＮＯ // #MA.EXT_ARR_ACT_NO // External receipt result No.';


COMMENT ON COLUMN MST_ARR_ACT_ALL.INSP_CNT_RMRKS IS '検査連絡備考 // #MS.INSP_CNT_RMRKS // Inspection contact remarks';


COMMENT ON COLUMN MST_ARR_ACT_ALL.INTR_RMRKS IS '内部備考 // #MS.ARR_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_ARR_ACT_ALL.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_ARR_ACT_ALL.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_ARR_ACT_ALL.SUB_CHAR1 IS '予備１ // #MS.ARR_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_ARR_ACT_ALL.SUB_CHAR2 IS '予備２ // #MS.ARR_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_ARR_ACT_ALL.SUB_CHAR3 IS '予備３ // #MS.ARR_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_ARR_ACT_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_ARR_ACT_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_ARR_ACT_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_ARR_ACT_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_ARR_ACT_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_ARR_ACT_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_ARR_ACT_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_ARR_ACT_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_ARR_ACT_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_ARR_ACT_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

