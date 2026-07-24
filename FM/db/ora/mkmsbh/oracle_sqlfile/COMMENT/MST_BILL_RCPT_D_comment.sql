
COMMENT ON TABLE MST_BILL_RCPT_D IS '請求受領明細 // Billing receipt details';


COMMENT ON COLUMN MST_BILL_RCPT_D.BILL_RCPT_D_NO IS '請求受領明細ＮＯ // #MA.BILL_RCPT_D_NO // Billing receipt details No.';


COMMENT ON COLUMN MST_BILL_RCPT_D.BILL_RCPT_NO IS '請求受領ＮＯ // #MA.BILL_RCPT_NO // Billing receipt No.';


COMMENT ON COLUMN MST_BILL_RCPT_D.BILL_D_NO IS '請求明細ＮＯ // #MA.BILL_D_NO // Billing details No.';


COMMENT ON COLUMN MST_BILL_RCPT_D.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_BILL_RCPT_D.DLV_SLIP_NO IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN MST_BILL_RCPT_D.DLV_SLIP_D_NO IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN MST_BILL_RCPT_D.SHIP_DLV_SLIP_NO IS '出荷時納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No. at shipping';


COMMENT ON COLUMN MST_BILL_RCPT_D.SHIP_DLV_SLIP_D_NO IS '出荷時納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No. at shipping';


COMMENT ON COLUMN MST_BILL_RCPT_D.ACT_NO IS 'ヘッダ実績ＮＯ // #MA.ACT_NO // Header result No.';


COMMENT ON COLUMN MST_BILL_RCPT_D.ACT_REV IS 'ヘッダ実績改訂番号 // #MA.SLIP_REV // Header result rev. number';


COMMENT ON COLUMN MST_BILL_RCPT_D.ACT_D_NO IS '明細実績ＮＯ // #MA.ACT_D_NO // Details result No.';


COMMENT ON COLUMN MST_BILL_RCPT_D.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MST_BILL_RCPT_D.PO_D_NO IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN MST_BILL_RCPT_D.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_BILL_RCPT_D.DLV_DT IS '納品日 // #MA.DT // Delivery date';


COMMENT ON COLUMN MST_BILL_RCPT_D.RCV_DT IS '入金日 // #MA.DT // Payment received date';


COMMENT ON COLUMN MST_BILL_RCPT_D.BILL_BASIS_DT IS '請求起算日 // #MA.DT // Billing base date';


COMMENT ON COLUMN MST_BILL_RCPT_D.BASE_AC_DT IS '計上日（基） // #MA.DT // Recording date (Base)';


COMMENT ON COLUMN MST_BILL_RCPT_D.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_BILL_RCPT_D.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_BILL_RCPT_D.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_BILL_RCPT_D.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_BILL_RCPT_D.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_BILL_RCPT_D.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_BILL_RCPT_D.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_BILL_RCPT_D.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_BILL_RCPT_D.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_BILL_RCPT_D.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_BILL_RCPT_D.INTERIM_FLG IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN MST_BILL_RCPT_D.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_BILL_RCPT_D.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_BILL_RCPT_D.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_BILL_RCPT_D.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_BILL_RCPT_D.TAX_RATE IS '税率 // #MA.TAX_RATE // Tax rate';


COMMENT ON COLUMN MST_BILL_RCPT_D.INC_TAX_FLG IS '内税ＦＬＧ // #MA.FLG // Tax inclusive flg.';


COMMENT ON COLUMN MST_BILL_RCPT_D.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_BILL_RCPT_D.TRD_D_RMRKS IS '明細備考 // #MA.TRD_D_RMRKS // Details remarks';


COMMENT ON COLUMN MST_BILL_RCPT_D.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_BILL_RCPT_D.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_BILL_RCPT_D.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_BILL_RCPT_D.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_BILL_RCPT_D.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_BILL_RCPT_D.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_BILL_RCPT_D.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_BILL_RCPT_D.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_BILL_RCPT_D.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_BILL_RCPT_D.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

