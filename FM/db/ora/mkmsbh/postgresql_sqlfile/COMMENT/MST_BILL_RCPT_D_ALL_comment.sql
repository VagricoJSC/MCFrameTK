\encoding UTF-8

COMMENT ON TABLE mst_bill_rcpt_d_all IS '請求受領明細 // Billing receipt details';


COMMENT ON COLUMN mst_bill_rcpt_d_all.bill_rcpt_d_no IS '請求受領明細ＮＯ // #MA.BILL_RCPT_D_NO // Billing receipt details No.';


COMMENT ON COLUMN mst_bill_rcpt_d_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_bill_rcpt_d_all.bill_rcpt_no IS '請求受領ＮＯ // #MA.BILL_RCPT_NO // Billing receipt No.';


COMMENT ON COLUMN mst_bill_rcpt_d_all.bill_d_no IS '請求明細ＮＯ // #MA.BILL_D_NO // Billing details No.';


COMMENT ON COLUMN mst_bill_rcpt_d_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_bill_rcpt_d_all.dlv_slip_no IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN mst_bill_rcpt_d_all.dlv_slip_d_no IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN mst_bill_rcpt_d_all.ship_dlv_slip_no IS '出荷時納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No. at shipping';


COMMENT ON COLUMN mst_bill_rcpt_d_all.ship_dlv_slip_d_no IS '出荷時納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No. at shipping';


COMMENT ON COLUMN mst_bill_rcpt_d_all.act_no IS 'ヘッダ実績ＮＯ // #MA.ACT_NO // Header result No.';


COMMENT ON COLUMN mst_bill_rcpt_d_all.act_rev IS 'ヘッダ実績改訂番号 // #MA.SLIP_REV // Header result rev. number';


COMMENT ON COLUMN mst_bill_rcpt_d_all.act_d_no IS '明細実績ＮＯ // #MA.ACT_D_NO // Details result No.';


COMMENT ON COLUMN mst_bill_rcpt_d_all.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mst_bill_rcpt_d_all.po_d_no IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN mst_bill_rcpt_d_all.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_bill_rcpt_d_all.dlv_dt IS '納品日 // #MA.DT // Delivery date';


COMMENT ON COLUMN mst_bill_rcpt_d_all.rcv_dt IS '入金日 // #MA.DT // Payment received date';


COMMENT ON COLUMN mst_bill_rcpt_d_all.bill_basis_dt IS '請求起算日 // #MA.DT // Billing base date';


COMMENT ON COLUMN mst_bill_rcpt_d_all.base_ac_dt IS '計上日（基） // #MA.DT // Recording date (Base)';


COMMENT ON COLUMN mst_bill_rcpt_d_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_bill_rcpt_d_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_bill_rcpt_d_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_bill_rcpt_d_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_bill_rcpt_d_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_bill_rcpt_d_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_bill_rcpt_d_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_bill_rcpt_d_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_bill_rcpt_d_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_bill_rcpt_d_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_bill_rcpt_d_all.interim_flg IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN mst_bill_rcpt_d_all.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_bill_rcpt_d_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_bill_rcpt_d_all.trd_cur_dscnt_amt IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN mst_bill_rcpt_d_all.tax_cd IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN mst_bill_rcpt_d_all.tax_rate IS '税率 // #MA.TAX_RATE // Tax rate';


COMMENT ON COLUMN mst_bill_rcpt_d_all.inc_tax_flg IS '内税ＦＬＧ // #MA.FLG // Tax inclusive flg.';


COMMENT ON COLUMN mst_bill_rcpt_d_all.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_bill_rcpt_d_all.trd_d_rmrks IS '明細備考 // #MA.TRD_D_RMRKS // Details remarks';


COMMENT ON COLUMN mst_bill_rcpt_d_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_bill_rcpt_d_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_bill_rcpt_d_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_bill_rcpt_d_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_bill_rcpt_d_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_bill_rcpt_d_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_bill_rcpt_d_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_bill_rcpt_d_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_bill_rcpt_d_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_bill_rcpt_d_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

