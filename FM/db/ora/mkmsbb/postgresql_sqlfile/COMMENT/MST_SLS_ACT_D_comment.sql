\encoding UTF-8

COMMENT ON VIEW mst_sls_act_d IS '売上実績明細 // Sales result details';


COMMENT ON COLUMN mst_sls_act_d.sls_act_d_no IS '売上実績明細ＮＯ // #MA.SLS_ACT_D_NO // Sales result details No.';


COMMENT ON COLUMN mst_sls_act_d.sls_act_d_seq IS '売上実績明細連番 // #MA.SLIP_SEQ // Sales result details sequence number';


COMMENT ON COLUMN mst_sls_act_d.sls_act_no IS '売上実績ＮＯ // #MA.SLS_ACT_NO // Sales result No.';


COMMENT ON COLUMN mst_sls_act_d.sls_act_seq IS '売上実績連番 // #MA.SLIP_SEQ // Sales result sequence number';


COMMENT ON COLUMN mst_sls_act_d.disp_seq IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN mst_sls_act_d.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mst_sls_act_d.dlv_sundry_flg IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN mst_sls_act_d.dlv_nm IS '納品先名 // #MA.BP_NM // Delivery destination name';


COMMENT ON COLUMN mst_sls_act_d.dlv_zip_cd IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN mst_sls_act_d.dlv_addr1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN mst_sls_act_d.dlv_addr2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN mst_sls_act_d.dlv_addr3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN mst_sls_act_d.dlv_addr4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN mst_sls_act_d.dlv_cntct_dpt IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN mst_sls_act_d.dlv_cntct_psn IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN mst_sls_act_d.dlv_tel IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN mst_sls_act_d.dlv_fax IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN mst_sls_act_d.pri_prnt_flg IS '価格印字ＦＬＧ // #MA.FLG // Print price flg.';


COMMENT ON COLUMN mst_sls_act_d.dest_cd1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN mst_sls_act_d.dest_cd2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN mst_sls_act_d.dest_cd3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN mst_sls_act_d.tdlv_cd IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN mst_sls_act_d.tdlv_sundry_flg IS '配送先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN mst_sls_act_d.tdlv_nm IS '配送先名 // #MA.BP_NM // Receiving point name';


COMMENT ON COLUMN mst_sls_act_d.tdlv_zip_cd IS '配送先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN mst_sls_act_d.tdlv_addr1 IS '配送先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN mst_sls_act_d.tdlv_addr2 IS '配送先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN mst_sls_act_d.tdlv_addr3 IS '配送先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN mst_sls_act_d.tdlv_addr4 IS '配送先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN mst_sls_act_d.tdlv_cntct_dpt IS '配送先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN mst_sls_act_d.tdlv_cntct_psn IS '配送先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN mst_sls_act_d.tdlv_tel IS '配送先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN mst_sls_act_d.tdlv_fax IS '配送先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN mst_sls_act_d.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_sls_act_d.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_sls_act_d.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_sls_act_d.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_sls_act_d.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_sls_act_d.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_sls_act_d.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_sls_act_d.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_sls_act_d.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_sls_act_d.iv_itm_nm IS 'インボイス表記用品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN mst_sls_act_d.cntry_org_cd IS '原産地ＣＤ // #MA.CNTRY_CD // Place of origin cd.';


COMMENT ON COLUMN mst_sls_act_d.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_sls_act_d.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_sls_act_d.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_sls_act_d.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_sls_act_d.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_sls_act_d.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_sls_act_d.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_sls_act_d.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_sls_act_d.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_sls_act_d.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_sls_act_d.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_sls_act_d.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_sls_act_d.upri_not_tgt_flg IS '単価再取得対象外ＦＬＧ // #MA.FLG // Not to reacquire unit price flg.';


COMMENT ON COLUMN mst_sls_act_d.interim_flg IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN mst_sls_act_d.tax_cd IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN mst_sls_act_d.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_sls_act_d.base_cur_upri IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN mst_sls_act_d.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mst_sls_act_d.base_cur_tax_amt IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN mst_sls_act_d.ptax_cur_upri IS '納税通貨単価 // #MA.MONEY // Unit price (Tax currency)';


COMMENT ON COLUMN mst_sls_act_d.ptax_cur_amt IS '納税通貨金額 // #MA.MONEY // Amount (Tax currency)';


COMMENT ON COLUMN mst_sls_act_d.ptax_cur_tax_amt IS '納税通貨税額 // #MA.MONEY // Tax amount (Tax currency)';


COMMENT ON COLUMN mst_sls_act_d.cost_upri IS '原価単価 // #MA.MONEY // Unit cost';


COMMENT ON COLUMN mst_sls_act_d.cost_amt IS '原価金額 // #MA.MONEY // Total cost';


COMMENT ON COLUMN mst_sls_act_d.trd_cur_dscnt_amt IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN mst_sls_act_d.base_cur_dscnt_amt IS '基準通貨値引額 // #MA.MONEY // Discount amount (Base currency)';


COMMENT ON COLUMN mst_sls_act_d.ptax_cur_dscnt_amt IS '納税通貨値引額 // #MA.MONEY // Discount amount (Tax currency)';


COMMENT ON COLUMN mst_sls_act_d.dscnt_rsn_cd IS '値引理由ＣＤ // #MA.BIZ_RSN_CD // Discount reason cd.';


COMMENT ON COLUMN mst_sls_act_d.bill_crryovr_times IS '請求繰越回数 // #MA.CRRYOVR_TIMES // Billing carry-over count';


COMMENT ON COLUMN mst_sls_act_d.stk_mng_typ IS '在庫管理区分 // #MA.STK_MNG_TYP // Inventory management type';


COMMENT ON COLUMN mst_sls_act_d.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mst_sls_act_d.sno1_mng_typ IS '手配ＮＯ１管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 1 management type';


COMMENT ON COLUMN mst_sls_act_d.sno2_mng_typ IS '手配ＮＯ２管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 2 management type';


COMMENT ON COLUMN mst_sls_act_d.sno3_mng_typ IS '手配ＮＯ３管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 3 management type';


COMMENT ON COLUMN mst_sls_act_d.sno4_mng_typ IS '手配ＮＯ４管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 4 management type';


COMMENT ON COLUMN mst_sls_act_d.ar_typ IS '債権区分 // #MA.AR_TYP // AR type';


COMMENT ON COLUMN mst_sls_act_d.cst_po_d_no IS '得意先注文明細ＮＯ // #MA.CST_PO_D_NO // Customer order details No.';


COMMENT ON COLUMN mst_sls_act_d.cst_itm_cd IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN mst_sls_act_d.cst_itm_nm IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN mst_sls_act_d.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_sls_act_d.intr_rmrks IS '内部備考 // #MS.SLS_ACT_D_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_sls_act_d.rsn_cd IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN mst_sls_act_d.bd_dpt_cd IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN mst_sls_act_d.wtax_rate IS '源泉税率 // #MA.TAX_RATE // Withholding tax rate';


COMMENT ON COLUMN mst_sls_act_d.wtax_amt IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN mst_sls_act_d.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mst_sls_act_d.slo_d_no IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN mst_sls_act_d.sls_ret_schd_no IS '売上返品予定ＮＯ // #MA.SLS_RET_SCHD_NO // Sales return schedule No.';


COMMENT ON COLUMN mst_sls_act_d.sls_ret_schd_d_no IS '売上返品予定明細ＮＯ // #MA.SLS_RET_SCHD_D_NO // Sales return schedule details No.';


COMMENT ON COLUMN mst_sls_act_d.ship_schd_no IS '出荷予定ＮＯ // #MA.SHIP_SCHD_NO // Shipping schedule No.';


COMMENT ON COLUMN mst_sls_act_d.sls_schd_no IS '売上予定ＮＯ // #MA.SLS_SCHD_NO // Sales schedule No.';


COMMENT ON COLUMN mst_sls_act_d.qtn_no IS '見積ＮＯ // #MA.QTN_NO // Quotation No.';


COMMENT ON COLUMN mst_sls_act_d.qtn_rev IS '見積改訂番号 // #MA.SLIP_REV // Quotation rev. number';


COMMENT ON COLUMN mst_sls_act_d.qtn_d_no IS '見積明細ＮＯ // #MA.QTN_D_NO // Quotation details No.';


COMMENT ON COLUMN mst_sls_act_d.purc_ddlv_po_no IS '仕入直送発注ＮＯ // #MA.PO_NO // Direct delivery PO No.';


COMMENT ON COLUMN mst_sls_act_d.purc_ddlv_po_d_no IS '仕入直送発注明細ＮＯ // #MA.PO_D_NO // Direct delivery PO details No.';


COMMENT ON COLUMN mst_sls_act_d.purc_act_no IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN mst_sls_act_d.purc_act_d_no IS '仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Purchase result details No.';


COMMENT ON COLUMN mst_sls_act_d.dlv_slip_d_no IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN mst_sls_act_d.ship_dlv_slip_d_no IS '出荷時納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No. at shipping';


COMMENT ON COLUMN mst_sls_act_d.ship_dlv_slip_multi_flg IS '出荷時納品書明細複数ＦＬＧ // #MA.FLG // Multiple delivery note details at shipping flg.';


COMMENT ON COLUMN mst_sls_act_d.iv_d_no IS 'インボイス明細ＮＯ // #MA.IV_D_NO // Invoice details No.';


COMMENT ON COLUMN mst_sls_act_d.sls_dtl_upd_flg IS '明細訂正ＦＬＧ // #MA.FLG // Details correction flg.';


COMMENT ON COLUMN mst_sls_act_d.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_sls_act_d.ext_purc_act_d_no IS '外部仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // External purchase result details No.';


COMMENT ON COLUMN mst_sls_act_d.sub_char1 IS '予備１ // #MS.SLS_ACT_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_sls_act_d.sub_char2 IS '予備２ // #MS.SLS_ACT_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_sls_act_d.sub_char3 IS '予備３ // #MS.SLS_ACT_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_sls_act_d.ref_sls_act_no IS '参照売上実績ＮＯ // #MA.SLS_ACT_NO // Reference sales result No.';


COMMENT ON COLUMN mst_sls_act_d.ref_sls_act_seq IS '参照売上実績連番 // #MA.SLIP_SEQ // Reference sales result sequence number';


COMMENT ON COLUMN mst_sls_act_d.ref_sls_act_d_no IS '参照売上実績明細ＮＯ // #MA.SLS_ACT_D_NO // Reference sales result details No.';


COMMENT ON COLUMN mst_sls_act_d.ref_sls_act_d_seq IS '参照売上実績明細連番 // #MA.SLIP_SEQ // Reference sales result details sequence number';


COMMENT ON COLUMN mst_sls_act_d.base_sls_ac_dt IS '売上計上日（基） // #MA.DT // Sales recording date (Base)';


COMMENT ON COLUMN mst_sls_act_d.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_sls_act_d.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_sls_act_d.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_sls_act_d.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_sls_act_d.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_sls_act_d.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_sls_act_d.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_sls_act_d.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_sls_act_d.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_sls_act_d.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

