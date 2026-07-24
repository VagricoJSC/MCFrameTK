\encoding UTF-8

COMMENT ON TABLE mst_bill_d_all IS '請求明細 // Billing details';


COMMENT ON COLUMN mst_bill_d_all.bill_d_no IS '請求明細ＮＯ // #MA.BILL_D_NO // Billing details No.';


COMMENT ON COLUMN mst_bill_d_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_bill_d_all.bill_mng_no IS '請求管理ＮＯ // #MA.BILL_MNG_NO // Billing management No.';


COMMENT ON COLUMN mst_bill_d_all.bill_acst_no IS '売掛別請求ＮＯ // #MA.BILL_ACST_NO // Billing No. by AR customer';


COMMENT ON COLUMN mst_bill_d_all.bill_d_typ IS '請求明細区分 // #MS.BILL_D_TYP // Billing details type';


COMMENT ON COLUMN mst_bill_d_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_bill_d_all.slip_sts_typ IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN mst_bill_d_all.act_no IS 'ヘッダ実績ＮＯ // #MA.ACT_NO // Header result No.';


COMMENT ON COLUMN mst_bill_d_all.act_seq IS 'ヘッダ実績連番 // #MA.SLIP_SEQ // Header result sequence number';


COMMENT ON COLUMN mst_bill_d_all.act_rev IS 'ヘッダ実績改訂番号 // #MA.SLIP_REV // Header result rev. number';


COMMENT ON COLUMN mst_bill_d_all.act_d_no IS '明細実績ＮＯ // #MA.ACT_D_NO // Details result No.';


COMMENT ON COLUMN mst_bill_d_all.act_d_seq IS '明細実績連番 // #MA.SLIP_SEQ // Details result sequence number';


COMMENT ON COLUMN mst_bill_d_all.ar_trd_grp_typ IS '債権取引グループ区分 // #MA.AR_TRD_GRP_TYP // AR transaction group type';


COMMENT ON COLUMN mst_bill_d_all.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_bill_d_all.rcv_mtd_cd IS '入金方法ＣＤ // #MA.STTL_CD // Payment received method cd.';


COMMENT ON COLUMN mst_bill_d_all.rcv_typ IS '入金区分 // #MA.AR_STTL_TYP // Payment received type';


COMMENT ON COLUMN mst_bill_d_all.ar_typ IS '債権区分 // #MA.AR_TYP // AR type';


COMMENT ON COLUMN mst_bill_d_all.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_bill_d_all.sls_dpt_cd IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN mst_bill_d_all.sls_usr_cd IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN mst_bill_d_all.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_bill_d_all.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mst_bill_d_all.dlv_nm IS '納品先名 // #MA.BP_NM // Delivery destination name';


COMMENT ON COLUMN mst_bill_d_all.dlv_sundry_flg IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN mst_bill_d_all.dest_cd1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN mst_bill_d_all.dest_cd2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN mst_bill_d_all.dest_cd3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN mst_bill_d_all.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_bill_d_all.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mst_bill_d_all.dlv_dt IS '納品日 // #MA.DT // Delivery date';


COMMENT ON COLUMN mst_bill_d_all.base_sls_ac_dt IS '売上計上日（基） // #MA.DT // Sales recording date (Base)';


COMMENT ON COLUMN mst_bill_d_all.rcv_dt IS '入金日 // #MA.DT // Payment received date';


COMMENT ON COLUMN mst_bill_d_all.bill_basis_dt IS '請求起算日 // #MA.DT // Billing base date';


COMMENT ON COLUMN mst_bill_d_all.bill_crryovr_times IS '請求繰越回数 // #MA.CRRYOVR_TIMES // Billing carry-over count';


COMMENT ON COLUMN mst_bill_d_all.cst_po_no IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN mst_bill_d_all.cst_po_d_no IS '得意先注文明細ＮＯ // #MA.CST_PO_D_NO // Customer order details No.';


COMMENT ON COLUMN mst_bill_d_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_bill_d_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_bill_d_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_bill_d_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_bill_d_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_bill_d_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_bill_d_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_bill_d_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_bill_d_all.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_bill_d_all.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mst_bill_d_all.cst_itm_cd IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN mst_bill_d_all.cst_itm_nm IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN mst_bill_d_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_bill_d_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_bill_d_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_bill_d_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_bill_d_all.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_bill_d_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_bill_d_all.trd_cur_amt1 IS '取引通貨金額１ // #MA.MONEY // Amount 1 (Transaction currency)';


COMMENT ON COLUMN mst_bill_d_all.trd_cur_amt2 IS '取引通貨金額２ // #MA.MONEY // Amount 2 (Transaction currency)';


COMMENT ON COLUMN mst_bill_d_all.trd_cur_amt3 IS '取引通貨金額３ // #MA.MONEY // Amount 3 (Transaction currency)';


COMMENT ON COLUMN mst_bill_d_all.trd_cur_dscnt_amt IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN mst_bill_d_all.interim_flg IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN mst_bill_d_all.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_bill_d_all.base_cur_upri IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN mst_bill_d_all.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mst_bill_d_all.base_cur_amt1 IS '基準通貨金額１ // #MA.MONEY // Amount 1 (Base currency)';


COMMENT ON COLUMN mst_bill_d_all.base_cur_amt2 IS '基準通貨金額２ // #MA.MONEY // Amount 2 (Base currency)';


COMMENT ON COLUMN mst_bill_d_all.base_cur_amt3 IS '基準通貨金額３ // #MA.MONEY // Amount 3 (Base currency)';


COMMENT ON COLUMN mst_bill_d_all.base_cur_dscnt_amt IS '基準通貨値引額 // #MA.MONEY // Discount amount (Base currency)';


COMMENT ON COLUMN mst_bill_d_all.tax_cd IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN mst_bill_d_all.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_bill_d_all.base_cur_tax_amt IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN mst_bill_d_all.wtax_rate IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN mst_bill_d_all.wtax_amt IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN mst_bill_d_all.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_bill_d_all.bill_d_rmrks IS '請求書明細備考 // #MS.BILL_D_RMRKS // Invoice details remarks';


COMMENT ON COLUMN mst_bill_d_all.dlv_slip_no IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN mst_bill_d_all.dlv_slip_d_no IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN mst_bill_d_all.ship_dlv_slip_no IS '出荷時納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No. at shipping';


COMMENT ON COLUMN mst_bill_d_all.ship_dlv_slip_d_no IS '出荷時納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No. at shipping';


COMMENT ON COLUMN mst_bill_d_all.ship_dlv_slip_multi_flg IS '出荷時納品書明細複数ＦＬＧ // #MA.FLG // Multiple delivery note details at shipping flg.';


COMMENT ON COLUMN mst_bill_d_all.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mst_bill_d_all.slo_d_no IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN mst_bill_d_all.par_act_no IS '親実績ＮＯ // #MA.ACT_NO // Parent result No.';


COMMENT ON COLUMN mst_bill_d_all.par_act_seq IS '親実績連番 // #MA.SLIP_SEQ // Parent result sequence number';


COMMENT ON COLUMN mst_bill_d_all.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_bill_d_all.ref_iv_no IS '参照インボイスＮＯ // #MA.IV_NO // Reference invoice No.';


COMMENT ON COLUMN mst_bill_d_all.bill_prnt_tgt_flg IS '請求書出力対象ＦＬＧ // #MA.FLG // For invoice output flg.';


COMMENT ON COLUMN mst_bill_d_all.bill_mtd_typ IS '請求方式区分 // #MS.BILL_MTD_TYP // Billing method type';


COMMENT ON COLUMN mst_bill_d_all.crryovr_flg IS '繰越分ＦＬＧ // #MA.FLG // Carry-over flg.';


COMMENT ON COLUMN mst_bill_d_all.crryovr_bill_d_no IS '繰越請求明細ＮＯ // #MA.BILL_D_NO // Carry-over invoice details No.';


COMMENT ON COLUMN mst_bill_d_all.crryovr_src_bill_d_no IS '繰越元請求明細ＮＯ // #MA.BILL_D_NO // Carry-over-from invoice details No.';


COMMENT ON COLUMN mst_bill_d_all.valid_flg IS '有効ＦＬＧ // #MA.FLG // Valid flg.';


COMMENT ON COLUMN mst_bill_d_all.sub_char1 IS '予備１ // #MS.BILL_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_bill_d_all.sub_char2 IS '予備２ // #MS.BILL_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_bill_d_all.sub_char3 IS '予備３ // #MS.BILL_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_bill_d_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_bill_d_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_bill_d_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_bill_d_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_bill_d_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_bill_d_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_bill_d_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_bill_d_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_bill_d_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_bill_d_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

