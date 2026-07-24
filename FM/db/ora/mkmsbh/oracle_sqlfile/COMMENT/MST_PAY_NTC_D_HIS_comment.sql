
COMMENT ON TABLE MST_PAY_NTC_D_HIS IS '支払通知書明細履歴 // Payment notice details history';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.PAY_NTC_D_HIS_NO IS '支払通知書明細履歴ＮＯ // #MA.PAY_NTC_D_HIS_NO // Payment notice details history No.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.PAY_NTC_HIS_NO IS '支払通知書履歴ＮＯ // #MA.PAY_NTC_HIS_NO // Payment notice history No.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.AP_D_NO IS '買掛明細ＮＯ // #MA.AP_D_NO // AP details No.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.PAY_ACT_NO IS '支払実績ＮＯ // #MA.PAY_ACT_NO // Payment result No.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.PAY_ACT_SEQ IS '支払実績連番 // #MA.SLIP_SEQ // Payment result sequence No.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.PAY_ACT_D_NO IS '支払実績明細ＮＯ // #MA.PAY_ACT_D_NO // Payment result details No.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.PAY_ACT_D_SEQ IS '支払実績明細連番 // #MA.SLIP_SEQ // Payment result details sequence number';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.ADV_PAY_ACT_NO IS '前渡金実績ＮＯ // #MA.PAY_ACT_NO // Advance payment result No.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.ADV_PAY_ACT_SEQ IS '前渡金実績連番 // #MA.SLIP_SEQ // Advance payment result sequence number';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.PAY_NTC_D_HIS_TYP IS '支払通知書明細履歴区分 // #MA.PAY_NTC_D_HIS_TYP // Payment notice details history type';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.PO_D_NO IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.PURC_ACT_NO IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.PURC_ACT_REV IS '仕入実績改訂番号 // #MA.SLIP_REV // Purchase result rev. number';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.PURC_ACT_D_NO IS '仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Purchase result details No.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.BP_DLV_SLIP_NO IS '業者納品書ＮＯ // #MA.BP_DLV_SLIP_NO // Vendor delivery note No.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.BP_DLV_SLIP_D_NO IS '業者納品書明細ＮＯ // #MA.BP_DLV_SLIP_D_NO // Vendor delivery note details No.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.SLIP_STS_TYP IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.ASPPL_CD IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.ACT_DT IS '実績日 // #MA.DT // Actual date';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.SPPL_ITM_CD IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.SPPL_ITM_NM IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.INTERIM_FLG IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.BASE_CUR_UPRI IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.BASE_CUR_TAX_AMT IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.BASE_CUR_DSCNT_AMT IS '基準通貨値引額 // #MA.MONEY // Discount amount (Base currency)';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.PAY_MTD_TYP IS '支払方式区分 // #MS.PAY_MTD_TYP // Payment method type';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.BASE_PURC_AC_DT IS '仕入計上日（基） // #MA.DT // Purchase recording date (Base)';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.PAY_NTC_D_PRINT_RMRKS IS '支払通知書明細備考 // #MS.PAY_NTC_D_PRINT_RMRKS // Payment notice details remarks';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.AP_STTL_CD IS '債務決済方法ＣＤ // #MA.STTL_CD // AP settlement method cd.';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.PAY_ACT_DT IS '支払実績日 // #MA.DT // Actual payment date';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.AP_D_SUB_CHAR1 IS '買掛明細予備１ // #MS.AP_D_SUB_CHAR1 // AP details spare 1';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.AP_D_SUB_CHAR2 IS '買掛明細予備２ // #MS.AP_D_SUB_CHAR2 // AP details spare 2';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.AP_D_SUB_CHAR3 IS '買掛明細予備３ // #MS.AP_D_SUB_CHAR3 // AP details spare 3';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.PAY_ACT_D_SUB_CHAR1 IS '支払実績明細予備１ // #MS.PAY_ACT_D_SUB_CHAR1 // Payment result details spare 1';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.PAY_ACT_D_SUB_CHAR2 IS '支払実績明細予備２ // #MS.PAY_ACT_D_SUB_CHAR2 // Payment result details spare 2';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.PAY_ACT_D_SUB_CHAR3 IS '支払実績明細予備３ // #MS.PAY_ACT_D_SUB_CHAR3 // Payment result details spare 3';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.ADV_PAY_ACT_SUB_CHAR1 IS '前渡金実績予備１ // #MS.ADV_PAY_ACT_SUB_CHAR1 // Advance payment details spare 1';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.ADV_PAY_ACT_SUB_CHAR2 IS '前渡金実績予備２ // #MS.ADV_PAY_ACT_SUB_CHAR2 // Advance payment details spare 2';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.ADV_PAY_ACT_SUB_CHAR3 IS '前渡金実績予備３ // #MS.ADV_PAY_ACT_SUB_CHAR3 // Advance payment details spare 3';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_PAY_NTC_D_HIS.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

