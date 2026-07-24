
COMMENT ON TABLE MST_PROV_ACT_ALL IS '支給実績 // Supply result';


COMMENT ON COLUMN MST_PROV_ACT_ALL.PROV_ACT_NO IS '支給実績ＮＯ // #MA.PROV_ACT_NO // Supply result No.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.PROV_ACT_SEQ IS '支給実績連番 // #MA.SLIP_SEQ // Supply result sequence number';


COMMENT ON COLUMN MST_PROV_ACT_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.PROV_ACT_REV IS '支給実績改訂番号 // #MA.SLIP_REV // Supply result rev. number';


COMMENT ON COLUMN MST_PROV_ACT_ALL.SLIP_STS_TYP IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN MST_PROV_ACT_ALL.PROV_SCHD_NO IS '支給予定ＮＯ // #MA.PROV_SCHD_NO // Supply schedule No.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.PROV_SRC_ACT_TYP IS '支給元実績区分 // #MS.PROV_SRC_ACT_TYP // Supply-from result type';


COMMENT ON COLUMN MST_PROV_ACT_ALL.PROV_SRC_ACT_NO IS '支給元実績ＮＯ // #MA.PROV_SRC_ACT_NO // Supply-from result No.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_PROV_ACT_ALL.XFR_RSN_CD IS '移送理由ＣＤ // #MA.BIZ_RSN_CD // Transport reason cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.STK_MNG_TYP IS '在庫管理区分 // #MA.STK_MNG_TYP // Inventory management type';


COMMENT ON COLUMN MST_PROV_ACT_ALL.SNO1_MNG_TYP IS '手配ＮＯ１管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 1 management type';


COMMENT ON COLUMN MST_PROV_ACT_ALL.SNO2_MNG_TYP IS '手配ＮＯ２管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 2 management type';


COMMENT ON COLUMN MST_PROV_ACT_ALL.SNO3_MNG_TYP IS '手配ＮＯ３管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 3 management type';


COMMENT ON COLUMN MST_PROV_ACT_ALL.SNO4_MNG_TYP IS '手配ＮＯ４管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 4 management type';


COMMENT ON COLUMN MST_PROV_ACT_ALL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.PACK_UNIT_CD IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.PACK_UNIT_QTY IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.ACCPT_DT IS '検収日 // #MA.DT // Acceptance date';


COMMENT ON COLUMN MST_PROV_ACT_ALL.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_PROV_ACT_ALL.AC_YM IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN MST_PROV_ACT_ALL.DLV_SLIP_NO IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.DLV_SLIP_D_NO IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.PRSPPL_CD IS '支給先ＣＤ // #MA.BP_CD // Subcontractor cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.AP_DPT_CD IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.PROV_TYP IS '支給区分 // #MA.PROV_TYP // Supply type';


COMMENT ON COLUMN MST_PROV_ACT_ALL.PROV_BASIS_TYP IS '支給計上区分 // #MA.PROV_BASIS_TYP // Supply recording type';


COMMENT ON COLUMN MST_PROV_ACT_ALL.XRATE_CD IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_PROV_ACT_ALL.PTAX_XRATE IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN MST_PROV_ACT_ALL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.BASE_CUR_CD IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.PTAX_CUR_CD IS '納税通貨ＣＤ // #MA.CUR_CD // Taxpaying currency cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_PROV_ACT_ALL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_PROV_ACT_ALL.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_PROV_ACT_ALL.BASE_CUR_UPRI IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN MST_PROV_ACT_ALL.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MST_PROV_ACT_ALL.BASE_CUR_TAX_AMT IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN MST_PROV_ACT_ALL.PTAX_CUR_UPRI IS '納税通貨単価 // #MA.MONEY // Unit price (Tax currency)';


COMMENT ON COLUMN MST_PROV_ACT_ALL.PTAX_CUR_AMT IS '納税通貨金額 // #MA.MONEY // Amount (Tax currency)';


COMMENT ON COLUMN MST_PROV_ACT_ALL.PTAX_CUR_TAX_AMT IS '納税通貨税額 // #MA.MONEY // Tax amount (Tax currency)';


COMMENT ON COLUMN MST_PROV_ACT_ALL.WTAX_RATE IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN MST_PROV_ACT_ALL.WTAX_AMT IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN MST_PROV_ACT_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_PROV_ACT_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_PROV_ACT_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_PROV_ACT_ALL.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_PROV_ACT_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_PROV_ACT_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_PROV_ACT_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_PROV_ACT_ALL.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_PROV_ACT_ALL.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_PROV_ACT_ALL.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_PROV_ACT_ALL.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.UPD_FLG IS '更新ＦＬＧ // #MA.FLG // Update flg.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.INTR_RMRKS IS '内部備考 // #MS.PROV_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_PROV_ACT_ALL.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_PROV_ACT_ALL.SUB_CHAR1 IS '予備１ // #MS.PROV_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_PROV_ACT_ALL.SUB_CHAR2 IS '予備２ // #MS.PROV_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_PROV_ACT_ALL.SUB_CHAR3 IS '予備３ // #MS.PROV_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_PROV_ACT_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_PROV_ACT_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_PROV_ACT_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_PROV_ACT_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_PROV_ACT_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_PROV_ACT_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_PROV_ACT_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_PROV_ACT_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_PROV_ACT_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_PROV_ACT_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MST_PROV_ACT_ALL.BASE_AC_DT IS '支給計上日（基） // #MA.DT // Supply recording date (Base)';

