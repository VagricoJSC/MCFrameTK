
COMMENT ON TABLE MST_RCPT_IV_D_P IS '受領インボイス明細（改訂履歴） // Purchase invoice details (Rev. history)';


COMMENT ON COLUMN MST_RCPT_IV_D_P.RCPT_IV_D_NO IS '受領インボイス明細ＮＯ // #MA.RCPT_IV_D_NO // Purchase invoice details No.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.RCPT_IV_MNG_NO IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.RCPT_IV_REV IS '受領インボイス改訂番号 // #MA.SLIP_REV // Purchase invoice rev. number';


COMMENT ON COLUMN MST_RCPT_IV_D_P.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.PO_D_NO IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.PURC_SCHD_NO IS '仕入予定ＮＯ // #MA.PURC_SCHD_NO // Purchase schedule No.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BNDL_FLG IS 'まとめＦＬＧ // #MA.FLG // Aggregation flg.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_RCPT_IV_D_P.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_RCPT_IV_D_P.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_RCPT_IV_D_P.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_RCPT_IV_D_P.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_RCPT_IV_D_P.IV_ITM_NM IS 'インボイス表記品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN MST_RCPT_IV_D_P.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_RCPT_IV_D_P.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_RCPT_IV_D_P.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_RCPT_IV_D_P.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_RCPT_IV_D_P.PURC_RSN_CD IS '仕入理由ＣＤ // #MA.BIZ_RSN_CD // Purchase reason cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.PURC_ID_TYP IS '購買識別区分 // #MA.PURC_ID_TYP // Purchase identification type';


COMMENT ON COLUMN MST_RCPT_IV_D_P.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.SPPL_ITM_CD IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.SPPL_ITM_NM IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN MST_RCPT_IV_D_P.AP_DPT_CD IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_RCPT_IV_D_P.TRD_CUR_PROC_UPRI IS '取引通貨加工単価 // #MA.MONEY // Subcontracting unit price (Transaction currency)';


COMMENT ON COLUMN MST_RCPT_IV_D_P.TRD_CUR_ONR_PROV_UPRI IS '取引通貨有償支給単価 // #MA.MONEY // Chargeable supply unit price (Transaction currency)';


COMMENT ON COLUMN MST_RCPT_IV_D_P.UPRI_NOT_TGT_FLG IS '単価再取得対象外ＦＬＧ // #MA.FLG // Not to reacquire unit price flg.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.INTERIM_FLG IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_RCPT_IV_D_P.TRD_CUR_PROC_AMT IS '取引通貨加工金額 // #MA.MONEY // Subcontracting amount (Transaction currency)';


COMMENT ON COLUMN MST_RCPT_IV_D_P.TRD_CUR_ONR_PROV_AMT IS '取引通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Transaction currency)';


COMMENT ON COLUMN MST_RCPT_IV_D_P.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_RCPT_IV_D_P.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_RCPT_IV_D_P.DSCNT_RSN_CD IS '値引理由ＣＤ // #MA.BIZ_RSN_CD // Discount reason cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.TAX_FIX_FLG IS '税指定ＦＬＧ // #MA.FLG // Tax specified flg.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.WTAX_RATE IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN MST_RCPT_IV_D_P.WTAX_AMT IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN MST_RCPT_IV_D_P.MANUAL_ADD_FLG IS 'マニュアル追加ＦＬＧ // #MA.FLG // Manual addition flg.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.PURC_DPT_CD IS '購買部門ＣＤ // #MA.DPT_CD // Purchasing dept. cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.WG_CD IS 'ＷＧ ＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.PURC_USR_CD IS '購買担当者ＣＤ // #MA.USR_CD // Purchasing PIC cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.SLO_D_NO IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BD_ITM_CD IS '負担品目ＣＤ // #MA.ITM_CD // Charged item cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BD_ITM_SUB1 IS '負担枝番１ // #MA.ITM_SUB1 // Charged branch No. 1';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BD_ITM_SUB2 IS '負担枝番２ // #MA.ITM_SUB2 // Charged branch No. 2';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BD_ITM_SUB3 IS '負担枝番３ // #MA.ITM_SUB3 // Charged branch No. 3';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BD_SNO1 IS '負担手配ＮＯ１ // #MA.SNO1 // Charged SEIBAN No. 1';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BD_SNO2 IS '負担手配ＮＯ２ // #MA.SNO2 // Charged SEIBAN No. 2';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BD_SNO3 IS '負担手配ＮＯ３ // #MA.SNO3 // Charged SEIBAN No. 3';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BD_SNO4 IS '負担手配ＮＯ４ // #MA.SNO4 // Charged SEIBAN No. 4';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BD_LOC_CD IS '負担場所ＣＤ // #MA.LOC_CD // Charged location cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BD_LOT_NO IS '負担ロットＮＯ // #MA.LOT_NO // Charged lot No.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BD_SUBLOT_NO IS '負担サブロットＮＯ // #MA.SUBLOT_NO // Charged sublot No.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BD_WG_CD IS '負担ＷＧ ＣＤ // #MA.WG_CD // Charged WG cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BD_CTG_CD IS '負担品群ＣＤ // #MA.COST_CTG_CD // Charged item category cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BD_OPER_CD IS '負担工程ＣＤ // #MA.OPER_CD // Charged operation cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BD_SLO_NO IS '負担受注ＮＯ // #MA.SLO_NO // Charged sales No.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BD_IV_NO IS '負担インボイスＮＯ // #MA.IV_NO // Charged invoice No.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BD_PO_NO IS '負担発注ＮＯ // #MA.PO_NO // Charged PO No.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.BD_BP_CD IS '負担取引先ＣＤ // #MA.BP_CD // Charged BP cd.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.INTR_D_RMRKS IS '内部明細備考 // #MS.RCPT_IV_INTR_D_RMRKS // Internal details remarks';


COMMENT ON COLUMN MST_RCPT_IV_D_P.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_RCPT_IV_D_P.RCPT_IV_D_RMRKS IS '受領インボイス明細備考 // #MS.IV_D_RMRKS // Purchase invoice details remarks';


COMMENT ON COLUMN MST_RCPT_IV_D_P.REF_PRMS_RCPT_D_NO IS '参照納期回答受領明細ＮＯ // #MA.PRMS_RCPT_D_NO // Reference order promising result received details No.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.REF_DLV_INST_D_NO IS '参照納入指示明細ＮＯ // #MA.DLV_INST_D_NO // Reference delivery order details No.';


COMMENT ON COLUMN MST_RCPT_IV_D_P.SUB_CHAR1 IS '予備１ // #MS.RCPT_IV_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_RCPT_IV_D_P.SUB_CHAR2 IS '予備２ // #MS.RCPT_IV_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_RCPT_IV_D_P.SUB_CHAR3 IS '予備３ // #MS.RCPT_IV_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_RCPT_IV_D_P.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_RCPT_IV_D_P.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_RCPT_IV_D_P.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_RCPT_IV_D_P.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_RCPT_IV_D_P.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_RCPT_IV_D_P.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_RCPT_IV_D_P.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_RCPT_IV_D_P.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_RCPT_IV_D_P.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_RCPT_IV_D_P.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

