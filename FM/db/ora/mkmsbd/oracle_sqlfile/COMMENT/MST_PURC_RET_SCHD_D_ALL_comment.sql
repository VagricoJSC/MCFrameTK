
COMMENT ON TABLE MST_PURC_RET_SCHD_D_ALL IS '仕入返品予定明細 // Purchase return schedule details';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.PURC_RET_SCHD_D_NO IS '仕入返品予定明細ＮＯ // #MA.PURC_RET_SCHD_D_NO // Purchase return schedule details No.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.PURC_RET_SCHD_NO IS '仕入返品予定ＮＯ // #MA.PURC_RET_SCHD_NO // Purchase return schedule No.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.DISP_SEQ IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.IV_ITM_NM IS 'インボイス表記用品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BP_LOT_NO IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.PURC_TYP IS '購買区分 // #MA.PURC_TYP // Purchase type';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.IN_XFR_TYP IS '積送品区分 // #MS.IN_XFR_TYP // In-transit type';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.STK_ARRV_BP_CD IS '在庫着荷先 // #MA.BP_CD // Inventory arriving point';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.AP_DPT_CD IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.PAY_CRRYOVR_TIMES IS '支払繰越回数 // #MA.CRRYOVR_TIMES // Payment carry-over count';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.RET_RSN_CD IS '返品理由ＣＤ // #MA.BIZ_RSN_CD // Return reason cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.SPPL_ITM_CD IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.SPPL_ITM_NM IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.PURC_RET_LOC_WG_CD IS '仕入返品元場所ＷＧ ＣＤ // #MA.WG_CD // Purchase return-from location WG cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.PURC_RET_LOC_CD IS '仕入返品元場所ＣＤ // #MA.LOC_CD // Purchase return-from location cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.INTERIM_FLG IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.TAX_FIX_FLG IS '税指定ＦＬＧ // #MA.FLG // Tax specified flg.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.UPRI_NOT_TGT_FLG IS '単価再取得対象外ＦＬＧ // #MA.FLG // Not to reacquire unit price flg.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.DSCNT_RSN_CD IS '値引理由ＣＤ // #MA.BIZ_RSN_CD // Discount reason cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.TRD_CUR_PROC_AMT IS '取引通貨加工金額 // #MA.MONEY // Subcontracting amount (Transaction currency)';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.TRD_CUR_ONR_PROV_AMT IS '取引通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Transaction currency)';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.TRD_CUR_PROC_UPRI IS '取引通貨加工単価 // #MA.MONEY // Subcontracting unit price (Transaction currency)';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.TRD_CUR_ONR_PROV_UPRI IS '取引通貨有償支給単価 // #MA.MONEY // Chargeable supply unit price (Transaction currency)';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BASE_CUR_TAX_AMT IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.PTAX_CUR_TAX_AMT IS '納税通貨税額 // #MA.MONEY // Tax amount (Tax currency)';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.WTAX_RATE IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.WTAX_AMT IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.PURC_ID_TYP IS '購買識別区分 // #MA.PURC_ID_TYP // Purchase identification type';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.PURC_CONT_QTY IS '仕入有効成分 // #MA.PURC_CONT_QTY // Purchase active ingredient';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.ABORT_FLG IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.CMPL_FLG IS '完了ＦＬＧ // #MA.FLG // Completed flg.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.REF_PURC_ACT_NO IS '参照仕入実績ＮＯ // #MA.PURC_ACT_NO // Reference purchase result No.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.REF_PURC_ACT_SEQ IS '参照仕入実績連番 // #MA.SLIP_SEQ // Reference purchase result sequence number';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.REF_PURC_ACT_D_NO IS '参照仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Reference purchase result details No.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.REF_PURC_ACT_D_SEQ IS '参照仕入実績明細連番 // #MA.SLIP_SEQ // Reference purchase result details sequence number';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BASE_PURC_AC_DT IS '仕入計上日（基） // #MA.DT // Purchase recording date (Base)';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BD_ITM_CD IS '負担品目ＣＤ // #MA.ITM_CD // Charged item cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BD_ITM_SUB1 IS '負担枝番１ // #MA.ITM_SUB1 // Charged branch No. 1';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BD_ITM_SUB2 IS '負担枝番２ // #MA.ITM_SUB2 // Charged branch No. 2';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BD_ITM_SUB3 IS '負担枝番３ // #MA.ITM_SUB3 // Charged branch No. 3';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BD_SNO1 IS '負担手配ＮＯ１ // #MA.SNO1 // Charged SEIBAN No. 1';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BD_SNO2 IS '負担手配ＮＯ２ // #MA.SNO2 // Charged SEIBAN No. 2';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BD_SNO3 IS '負担手配ＮＯ３ // #MA.SNO3 // Charged SEIBAN No. 3';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BD_SNO4 IS '負担手配ＮＯ４ // #MA.SNO4 // Charged SEIBAN No. 4';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BD_LOC_CD IS '負担場所ＣＤ // #MA.LOC_CD // Charged location cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BD_LOT_NO IS '負担ロットＮＯ // #MA.LOT_NO // Charged lot No.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BD_SUBLOT_NO IS '負担サブロットＮＯ // #MA.SUBLOT_NO // Charged sublot No.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.MFG_INST_NO IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BD_WG_CD IS '負担ＷＧ ＣＤ // #MA.WG_CD // Charged WG cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BD_CTG_CD IS '負担品群ＣＤ // #MA.COST_CTG_CD // Charged item category cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BD_OPER_CD IS '負担工程ＣＤ // #MA.OPER_CD // Charged operation cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BD_PO_NO IS '負担発注ＮＯ // #MA.PO_NO // Charged PO No.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BD_SLO_NO IS '負担受注ＮＯ // #MA.SLO_NO // Charged sales No.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BD_IV_NO IS '負担インボイスＮＯ // #MA.IV_NO // Charged invoice No.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BD_BP_CD IS '負担取引先ＣＤ // #MA.BP_CD // Charged BP cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.INTR_RMRKS IS '内部明細備考 // #MS.PURC_RET_SCHD_D_INTR_RMRKS // Internal details remarks';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.PURC_RET_PRINT_D_RMRKS IS '仕入返品票明細備考 // #MS.PURC_RET_PRINT_D_RMRKS // Purchase return slip details remarks';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.SUB_CHAR1 IS '予備１ // #MS.PURC_RET_SCHD_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.SUB_CHAR2 IS '予備２ // #MS.PURC_RET_SCHD_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.SUB_CHAR3 IS '予備３ // #MS.PURC_RET_SCHD_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MST_PURC_RET_SCHD_D_ALL.BASE_AC_DT IS '支給計上日（基） // #MA.DT // Supply recording date (Base)';

