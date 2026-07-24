
COMMENT ON TABLE MST_PURC_ACT_D IS '仕入実績明細 // Purchase result details';


COMMENT ON COLUMN MST_PURC_ACT_D.PURC_ACT_D_NO IS '仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Purchase result details No.';


COMMENT ON COLUMN MST_PURC_ACT_D.PURC_ACT_D_SEQ IS '仕入実績明細連番 // #MA.SLIP_SEQ // Purchase result details sequence number';


COMMENT ON COLUMN MST_PURC_ACT_D.PURC_ACT_NO IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN MST_PURC_ACT_D.PURC_ACT_SEQ IS '仕入実績連番 // #MA.SLIP_SEQ // Purchase result sequence number';


COMMENT ON COLUMN MST_PURC_ACT_D.DISP_SEQ IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN MST_PURC_ACT_D.PURC_SCHD_NO IS '仕入予定ＮＯ // #MA.PURC_SCHD_NO // Purchase schedule No.';


COMMENT ON COLUMN MST_PURC_ACT_D.PURC_SRC_TYP IS '仕入作成元区分 // #MS.PURC_SRC_TYP // Purchase source type';


COMMENT ON COLUMN MST_PURC_ACT_D.PURC_SRC_NO IS '仕入作成元ＮＯ // #MA.PURC_SRC_NO // Purchase source No.';


COMMENT ON COLUMN MST_PURC_ACT_D.SYNC_FLG IS '同時計上ＦＬＧ // #MA.FLG // Simultaneous recording flg.';


COMMENT ON COLUMN MST_PURC_ACT_D.PO_D_NO IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN MST_PURC_ACT_D.RCPT_IV_D_NO IS '受領インボイス明細ＮＯ // #MA.RCPT_IV_D_NO // Purchase invoice details No.';


COMMENT ON COLUMN MST_PURC_ACT_D.PURC_RET_ACT_D_NO IS '仕入返品実績明細ＮＯ // #MA.PURC_RET_ACT_D_NO // Purchase return result details No.';


COMMENT ON COLUMN MST_PURC_ACT_D.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_PURC_ACT_D.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_PURC_ACT_D.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_PURC_ACT_D.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_PURC_ACT_D.IV_ITM_NM IS 'インボイス表記品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN MST_PURC_ACT_D.AP_TYP IS '債務区分 // #MA.AP_TYP // AP type';


COMMENT ON COLUMN MST_PURC_ACT_D.PURC_ID_TYP IS '購買識別区分 // #MA.PURC_ID_TYP // Purchase identification type';


COMMENT ON COLUMN MST_PURC_ACT_D.PURC_TYP IS '購買区分 // #MA.PURC_TYP // Purchase type';


COMMENT ON COLUMN MST_PURC_ACT_D.MFG_INST_NO IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN MST_PURC_ACT_D.RSN_CD IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MST_PURC_ACT_D.SPPL_ITM_CD IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.SPPL_ITM_NM IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN MST_PURC_ACT_D.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_PURC_ACT_D.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_PURC_ACT_D.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_PURC_ACT_D.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_PURC_ACT_D.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_PURC_ACT_D.SNO1_MNG_TYP IS '手配ＮＯ１管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 1 management type';


COMMENT ON COLUMN MST_PURC_ACT_D.SNO2_MNG_TYP IS '手配ＮＯ２管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 2 management type';


COMMENT ON COLUMN MST_PURC_ACT_D.SNO3_MNG_TYP IS '手配ＮＯ３管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 3 management type';


COMMENT ON COLUMN MST_PURC_ACT_D.SNO4_MNG_TYP IS '手配ＮＯ４管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 4 management type';


COMMENT ON COLUMN MST_PURC_ACT_D.IN_TO_LOC_CD IS '納入場所ＣＤ // #MA.LOC_CD // Delivery location cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.IN_TO_LOC_WG_CD IS '納入場所ＷＧ ＣＤ // #MA.WG_CD // Delivery location WG cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_PURC_ACT_D.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_PURC_ACT_D.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_PURC_ACT_D.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_PURC_ACT_D.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_PURC_ACT_D.BP_LOT_NO IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN MST_PURC_ACT_D.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_PURC_ACT_D.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_PURC_ACT_D.UPRI_NOT_TGT_FLG IS '単価再取得対象外ＦＬＧ // #MA.FLG // Not to reacquire unit price flg.';


COMMENT ON COLUMN MST_PURC_ACT_D.INTERIM_FLG IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN MST_PURC_ACT_D.TEMP_AP_FLG IS '暫定買掛ＦＬＧ // #MA.FLG // Temporary AP flg.';


COMMENT ON COLUMN MST_PURC_ACT_D.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.PURC_DTL_UPD_FLG IS '明細訂正ＦＬＧ // #MA.FLG // Details correction flg.';


COMMENT ON COLUMN MST_PURC_ACT_D.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.TRD_CUR_PROC_UPRI IS '取引通貨加工単価 // #MA.MONEY // Subcontracting unit price (Transaction currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.TRD_CUR_ONR_PROV_UPRI IS '取引通貨有償支給単価 // #MA.MONEY // Chargeable supply unit price (Transaction currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.TRD_CUR_PROC_AMT IS '取引通貨加工金額 // #MA.MONEY // Subcontracting amount (Transaction currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.TRD_CUR_ONR_PROV_AMT IS '取引通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Transaction currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.BASE_CUR_UPRI IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.BASE_CUR_PROC_UPRI IS '基準通貨加工単価 // #MA.MONEY // Subcontracting unit price (Base currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.BASE_CUR_ONR_PROV_UPRI IS '基準通貨有償支給単価 // #MA.MONEY // Chargeable supply unit price (Base currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.BASE_CUR_DSCNT_AMT IS '基準通貨値引額 // #MA.MONEY // Discount amount (Base currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.BASE_CUR_PROC_AMT IS '基準通貨加工金額 // #MA.MONEY // Subcontracting amount (Base currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.BASE_CUR_ONR_PROV_AMT IS '基準通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Base currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.BASE_CUR_TAX_AMT IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.PTAX_CUR_UPRI IS '納税通貨単価 // #MA.MONEY // Unit price (Tax currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.PTAX_CUR_PROC_UPRI IS '納税通貨加工単価 // #MA.MONEY // Subcontracting unit price (Tax currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.PTAX_CUR_ONR_PROV_UPRI IS '納税通貨有償支給単価 // #MA.MONEY // Chargeable supply unit price (Tax currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.PTAX_CUR_DSCNT_AMT IS '納税通貨値引額 // #MA.MONEY // Discount amount (Tax currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.PTAX_CUR_PROC_AMT IS '納税通貨加工金額 // #MA.MONEY // Subcontracting amount (Tax currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.PTAX_CUR_ONR_PROV_AMT IS '納税通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Tax currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.PTAX_CUR_AMT IS '納税通貨金額 // #MA.MONEY // Amount (Tax currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.PTAX_CUR_TAX_AMT IS '納税通貨税額 // #MA.MONEY // Tax amount (Tax currency)';


COMMENT ON COLUMN MST_PURC_ACT_D.DSCNT_RSN_CD IS '値引理由ＣＤ // #MA.BIZ_RSN_CD // Discount reason cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.WTAX_RATE IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN MST_PURC_ACT_D.WTAX_AMT IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN MST_PURC_ACT_D.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.AP_DPT_CD IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.PAY_CRRYOVR_TIMES IS '支払繰越回数 // #MA.CRRYOVR_TIMES // Payment carry-over count';


COMMENT ON COLUMN MST_PURC_ACT_D.NCV_FLG IS '無償ＦＬＧ // #MA.FLG // Free of charge flg.';


COMMENT ON COLUMN MST_PURC_ACT_D.STK_MNG_TYP IS '在庫管理区分 // #MA.STK_MNG_TYP // Inventory management type';


COMMENT ON COLUMN MST_PURC_ACT_D.EDI_FLG IS 'ＥＤＩＦＬＧ // #MA.FLG // EDI flg.';


COMMENT ON COLUMN MST_PURC_ACT_D.ACCPT_DFCT_FLG IS '検収不良ＦＬＧ // #MA.FLG // Acceptance defective flg.';


COMMENT ON COLUMN MST_PURC_ACT_D.RE_ARR_FLG IS '再入荷ＦＬＧ // #MA.FLG // Re-receipt flg.';


COMMENT ON COLUMN MST_PURC_ACT_D.RE_ARR_SYNC_FLG IS '再入荷同時計上ＦＬＧ // #MA.FLG // Re-receipt simultaneously recording flg.';


COMMENT ON COLUMN MST_PURC_ACT_D.RE_ARR_LOC_CD IS '再入荷場所ＣＤ // #MA.LOC_CD // Re-receipt location cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.RE_ARR_LOC_WG_CD IS '再入荷場所ＷＧ ＣＤ // #MA.WG_CD // Re-receipt location WG cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.RE_ARR_STR_LN_CD IS '再入荷棚・ラインＣＤ // #MA.STR_LN_CD // Re-receipt rack/line cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.RE_ARR_RQST_TM IS '再入荷希望日時 // #MA.TM // Desired re-receipt date and time';


COMMENT ON COLUMN MST_PURC_ACT_D.RE_ARR_PURC_SCHD_DT IS '再入荷仕入予定日 // #MA.DT // Scheduled re-receipt purchase date';


COMMENT ON COLUMN MST_PURC_ACT_D.TRD_UNIT_RE_ARR_QTY IS '取引単位再入荷数量 // #MA.QTY // Transaction unit re-receipt qty.';


COMMENT ON COLUMN MST_PURC_ACT_D.BASE_UNIT_RE_ARR_QTY IS '基準単位再入荷数量 // #MA.QTY // Base unit re-receipt qty.';


COMMENT ON COLUMN MST_PURC_ACT_D.BD_ITM_CD IS '負担品目ＣＤ // #MA.ITM_CD // Charged item cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.BD_ITM_SUB1 IS '負担枝番１ // #MA.ITM_SUB1 // Charged branch No. 1';


COMMENT ON COLUMN MST_PURC_ACT_D.BD_ITM_SUB2 IS '負担枝番２ // #MA.ITM_SUB2 // Charged branch No. 2';


COMMENT ON COLUMN MST_PURC_ACT_D.BD_ITM_SUB3 IS '負担枝番３ // #MA.ITM_SUB3 // Charged branch No. 3';


COMMENT ON COLUMN MST_PURC_ACT_D.BD_SNO1 IS '負担手配ＮＯ１ // #MA.SNO1 // Charged SEIBAN No. 1';


COMMENT ON COLUMN MST_PURC_ACT_D.BD_SNO2 IS '負担手配ＮＯ２ // #MA.SNO2 // Charged SEIBAN No. 2';


COMMENT ON COLUMN MST_PURC_ACT_D.BD_SNO3 IS '負担手配ＮＯ３ // #MA.SNO3 // Charged SEIBAN No. 3';


COMMENT ON COLUMN MST_PURC_ACT_D.BD_SNO4 IS '負担手配ＮＯ４ // #MA.SNO4 // Charged SEIBAN No. 4';


COMMENT ON COLUMN MST_PURC_ACT_D.BD_LOC_CD IS '負担場所ＣＤ // #MA.LOC_CD // Charged location cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.BD_LOT_NO IS '負担ロットＮＯ // #MA.LOT_NO // Charged lot No.';


COMMENT ON COLUMN MST_PURC_ACT_D.BD_SUBLOT_NO IS '負担サブロットＮＯ // #MA.SUBLOT_NO // Charged sublot No.';


COMMENT ON COLUMN MST_PURC_ACT_D.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.BD_WG_CD IS '負担ＷＧ ＣＤ // #MA.WG_CD // Charged WG cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.BD_CTG_CD IS '負担品群ＣＤ // #MA.COST_CTG_CD // Charged item category cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.BD_OPER_CD IS '負担工程ＣＤ // #MA.OPER_CD // Charged operation cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.BD_SLO_NO IS '負担受注ＮＯ // #MA.SLO_NO // Charged sales No.';


COMMENT ON COLUMN MST_PURC_ACT_D.BD_IV_NO IS '負担インボイスＮＯ // #MA.IV_NO // Charged invoice No.';


COMMENT ON COLUMN MST_PURC_ACT_D.BD_PO_NO IS '負担発注ＮＯ // #MA.PO_NO // Charged PO No.';


COMMENT ON COLUMN MST_PURC_ACT_D.BD_BP_CD IS '負担取引先ＣＤ // #MA.BP_CD // Charged BP cd.';


COMMENT ON COLUMN MST_PURC_ACT_D.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MST_PURC_ACT_D.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MST_PURC_ACT_D.REF_PURC_ACT_NO IS '参照仕入実績ＮＯ // #MA.PURC_ACT_NO // Reference purchase result No.';


COMMENT ON COLUMN MST_PURC_ACT_D.REF_PURC_ACT_SEQ IS '参照仕入実績連番 // #MA.SLIP_SEQ // Reference purchase result sequence number';


COMMENT ON COLUMN MST_PURC_ACT_D.REF_PURC_ACT_D_NO IS '参照仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Reference purchase result details No.';


COMMENT ON COLUMN MST_PURC_ACT_D.REF_PURC_ACT_D_SEQ IS '参照仕入実績明細連番 // #MA.SLIP_SEQ // Reference purchase result details sequence number';


COMMENT ON COLUMN MST_PURC_ACT_D.BASE_PURC_AC_DT IS '仕入計上日（基） // #MA.DT // Purchase recording date (Base)';


COMMENT ON COLUMN MST_PURC_ACT_D.BP_DLV_SLIP_NO IS '業者納品書ＮＯ // #MA.BP_DLV_SLIP_NO // Vendor delivery note No.';


COMMENT ON COLUMN MST_PURC_ACT_D.BP_DLV_SLIP_D_NO IS '業者納品書明細ＮＯ // #MA.BP_DLV_SLIP_D_NO // Vendor delivery note details No.';


COMMENT ON COLUMN MST_PURC_ACT_D.INTR_RMRKS IS '内部明細備考 // #MS.PURC_ACT_D_INTR_RMRKS // Internal details remarks';


COMMENT ON COLUMN MST_PURC_ACT_D.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_PURC_ACT_D.SUB_CHAR1 IS '予備１ // #MS.PURC_ACT_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_PURC_ACT_D.SUB_CHAR2 IS '予備２ // #MS.PURC_ACT_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_PURC_ACT_D.SUB_CHAR3 IS '予備３ // #MS.PURC_ACT_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_PURC_ACT_D.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_PURC_ACT_D.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_PURC_ACT_D.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_PURC_ACT_D.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_PURC_ACT_D.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_PURC_ACT_D.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_PURC_ACT_D.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_PURC_ACT_D.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_PURC_ACT_D.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_PURC_ACT_D.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

