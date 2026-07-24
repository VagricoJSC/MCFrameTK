
COMMENT ON TABLE MST_BILL_D_HIS_ALL IS '請求書明細履歴 // Invoice details history';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.BILL_D_HIS_NO IS '請求書明細履歴ＮＯ // #MA.BILL_D_HIS_NO // Invoice details history No.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.BILL_HIS_NO IS '請求書履歴ＮＯ // #MA.BILL_HIS_NO // Invoice history No.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.BILL_D_NO IS '請求明細ＮＯ // #MA.BILL_D_NO // Billing details No.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.BILL_D_HIS_TYP IS '請求書明細履歴区分 // #MA.BILL_D_HIS_TYP // Invoice details history type';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.SLIP_STS_TYP IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.ACT_NO IS 'ヘッダ実績ＮＯ // #MA.ACT_NO // Header result No.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.ACT_SEQ IS 'ヘッダ実績連番 // #MA.SLIP_SEQ // Header result sequence number';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.ACT_REV IS 'ヘッダ実績改訂番号 // #MA.SLIP_REV // Header result rev. number';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.ACT_D_NO IS '明細実績ＮＯ // #MA.ACT_D_NO // Details result No.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.ACT_D_SEQ IS '明細実績連番 // #MA.SLIP_SEQ // Details result sequence number';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.RCV_MTD_CD IS '入金方法ＣＤ // #MA.STTL_CD // Payment received method cd.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.DLV_CD IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.DLV_DT IS '納品日 // #MA.DT // Delivery date';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.BASE_SLS_AC_DT IS '売上計上日（基） // #MA.DT // Sales recording date (Base)';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.RCV_DT IS '入金日 // #MA.DT // Payment received date';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.CST_ITM_CD IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.CST_ITM_NM IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.INTERIM_FLG IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.BASE_CUR_UPRI IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.BASE_CUR_DSCNT_AMT IS '基準通貨値引額 // #MA.MONEY // Discount amount (Base currency)';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.BASE_CUR_TAX_AMT IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.BILL_D_RMRKS IS '請求書明細備考 // #MS.BILL_D_RMRKS // Invoice details remarks';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.DLV_SLIP_NO IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.DLV_SLIP_D_NO IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.SHIP_DLV_SLIP_NO IS '出荷時納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No. at shipping';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.SHIP_DLV_SLIP_D_NO IS '出荷時納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No. at shipping';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.SHIP_DLV_SLIP_MULTI_FLG IS '出荷時納品書明細複数ＦＬＧ // #MA.FLG // Multiple delivery note details at shipping flg.';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.BILL_MTD_TYP IS '請求方式区分 // #MS.BILL_MTD_TYP // Billing method type';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.SUB_CHAR1 IS '予備１ // #MS.BILL_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.SUB_CHAR2 IS '予備２ // #MS.BILL_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.SUB_CHAR3 IS '予備３ // #MS.BILL_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_BILL_D_HIS_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

