\encoding UTF-8

COMMENT ON VIEW mst_bill_d_his IS '請求書明細履歴 // Invoice details history';


COMMENT ON COLUMN mst_bill_d_his.bill_d_his_no IS '請求書明細履歴ＮＯ // #MA.BILL_D_HIS_NO // Invoice details history No.';


COMMENT ON COLUMN mst_bill_d_his.bill_his_no IS '請求書履歴ＮＯ // #MA.BILL_HIS_NO // Invoice history No.';


COMMENT ON COLUMN mst_bill_d_his.bill_d_no IS '請求明細ＮＯ // #MA.BILL_D_NO // Billing details No.';


COMMENT ON COLUMN mst_bill_d_his.bill_d_his_typ IS '請求書明細履歴区分 // #MA.BILL_D_HIS_TYP // Invoice details history type';


COMMENT ON COLUMN mst_bill_d_his.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_bill_d_his.slip_sts_typ IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN mst_bill_d_his.act_no IS 'ヘッダ実績ＮＯ // #MA.ACT_NO // Header result No.';


COMMENT ON COLUMN mst_bill_d_his.act_seq IS 'ヘッダ実績連番 // #MA.SLIP_SEQ // Header result sequence number';


COMMENT ON COLUMN mst_bill_d_his.act_rev IS 'ヘッダ実績改訂番号 // #MA.SLIP_REV // Header result rev. number';


COMMENT ON COLUMN mst_bill_d_his.act_d_no IS '明細実績ＮＯ // #MA.ACT_D_NO // Details result No.';


COMMENT ON COLUMN mst_bill_d_his.act_d_seq IS '明細実績連番 // #MA.SLIP_SEQ // Details result sequence number';


COMMENT ON COLUMN mst_bill_d_his.rcv_mtd_cd IS '入金方法ＣＤ // #MA.STTL_CD // Payment received method cd.';


COMMENT ON COLUMN mst_bill_d_his.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_bill_d_his.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mst_bill_d_his.dlv_dt IS '納品日 // #MA.DT // Delivery date';


COMMENT ON COLUMN mst_bill_d_his.base_sls_ac_dt IS '売上計上日（基） // #MA.DT // Sales recording date (Base)';


COMMENT ON COLUMN mst_bill_d_his.rcv_dt IS '入金日 // #MA.DT // Payment received date';


COMMENT ON COLUMN mst_bill_d_his.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_bill_d_his.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_bill_d_his.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_bill_d_his.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_bill_d_his.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_bill_d_his.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mst_bill_d_his.cst_itm_cd IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN mst_bill_d_his.cst_itm_nm IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN mst_bill_d_his.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_bill_d_his.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_bill_d_his.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_bill_d_his.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_bill_d_his.trd_cur_dscnt_amt IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN mst_bill_d_his.interim_flg IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN mst_bill_d_his.base_cur_upri IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN mst_bill_d_his.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mst_bill_d_his.base_cur_dscnt_amt IS '基準通貨値引額 // #MA.MONEY // Discount amount (Base currency)';


COMMENT ON COLUMN mst_bill_d_his.tax_cd IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN mst_bill_d_his.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_bill_d_his.base_cur_tax_amt IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN mst_bill_d_his.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_bill_d_his.bill_d_rmrks IS '請求書明細備考 // #MS.BILL_D_RMRKS // Invoice details remarks';


COMMENT ON COLUMN mst_bill_d_his.dlv_slip_no IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN mst_bill_d_his.dlv_slip_d_no IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN mst_bill_d_his.ship_dlv_slip_no IS '出荷時納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No. at shipping';


COMMENT ON COLUMN mst_bill_d_his.ship_dlv_slip_d_no IS '出荷時納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No. at shipping';


COMMENT ON COLUMN mst_bill_d_his.ship_dlv_slip_multi_flg IS '出荷時納品書明細複数ＦＬＧ // #MA.FLG // Multiple delivery note details at shipping flg.';


COMMENT ON COLUMN mst_bill_d_his.bill_mtd_typ IS '請求方式区分 // #MS.BILL_MTD_TYP // Billing method type';


COMMENT ON COLUMN mst_bill_d_his.sub_char1 IS '予備１ // #MS.BILL_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_bill_d_his.sub_char2 IS '予備２ // #MS.BILL_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_bill_d_his.sub_char3 IS '予備３ // #MS.BILL_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_bill_d_his.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_bill_d_his.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_bill_d_his.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_bill_d_his.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_bill_d_his.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_bill_d_his.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_bill_d_his.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_bill_d_his.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_bill_d_his.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_bill_d_his.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

