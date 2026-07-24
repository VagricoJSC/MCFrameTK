\encoding UTF-8

COMMENT ON TABLE mst_sls_ret_schd_d_all IS '売上返品予定明細 // Sales return schedule details';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sls_ret_schd_d_no IS '売上返品予定明細ＮＯ // #MA.SLS_RET_SCHD_D_NO // Sales return schedule details No.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sls_ret_schd_no IS '売上返品予定ＮＯ // #MA.SLS_RET_SCHD_NO // Sales return schedule No.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.disp_seq IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sret_fr_cd IS '引取先ＣＤ // #MA.BP_CD // Pickup company cd.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sret_fr_sundry_flg IS '引取先諸口ＦＬＧ // #MA.FLG // Miscellaneous pickup company flg.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sret_fr_nm IS '引取先名 // #MA.BP_NM // Pickup company name';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sret_fr_cntct_dpt IS '引取先部署 // #MA.BP_CNTCT_DPT // Pickup company dept.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sret_fr_cntct_psn IS '引取先担当者 // #MA.BP_CNTCT_PSN // Pickup company PIC';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sret_fr_zip_cd IS '引取先郵便番号 // #MA.ZIP_CD // Pickup company zip code';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sret_fr_addr1 IS '引取先住所１ // #MA.ADDR // Pickup company address 1';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sret_fr_addr2 IS '引取先住所２ // #MA.ADDR // Pickup company address 2';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sret_fr_addr3 IS '引取先住所３ // #MA.ADDR // Pickup company address 3';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sret_fr_addr4 IS '引取先住所４ // #MA.ADDR // Pickup company address 4';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sret_fr_tel IS '引取先ＴＥＬ // #MA.TEL // Pickup company TEL';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sret_fr_fax IS '引取先ＦＡＸ // #MA.TEL // Pickup company FAX';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.pri_prnt_flg IS '価格印字ＦＬＧ // #MA.FLG // Print price flg.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.dest_cd1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.dest_cd2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.dest_cd3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.tdlv_cd IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.cnsgn_gd_cd IS '貸出格付ＣＤ // #MA.STK_GD_CD // Consignment grading cd.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.upri_not_tgt_flg IS '単価再取得対象外ＦＬＧ // #MA.FLG // Not to reacquire unit price flg.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.interim_flg IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.trd_cur_dscnt_amt IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.dscnt_rsn_cd IS '値引理由ＣＤ // #MA.BIZ_RSN_CD // Discount reason cd.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.cnsgn_loc_cd IS '貸出場所ＣＤ // #MA.LOC_CD // Consignment location cd.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.cnsgn_str_ln_cd IS '貸出棚・ラインＣＤ // #MA.STR_LN_CD // Consignment rack/line cd.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.vmi_flg IS '貸出ＦＬＧ // #MA.FLG // Consignment flg.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.tax_fix_flg IS '税指定ＦＬＧ // #MA.FLG // Tax specified flg.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.tax_cd IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.cost_upri IS '原価単価 // #MA.MONEY // Unit cost';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.cost_amt IS '原価金額 // #MA.MONEY // Total cost';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.cst_po_d_no IS '得意先注文明細ＮＯ // #MA.CST_PO_D_NO // Customer order details No.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.cst_itm_cd IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.cst_itm_nm IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.intr_rmrks IS '内部備考 // #MS.SLS_RET_SCHD_D_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.arr_cnt_rmrks IS '入荷連絡備考 // #MS.ARR_CNT_RMRKS // Receipt contact remarks';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.bill_crryovr_times IS '請求繰越回数 // #MA.CRRYOVR_TIMES // Billing carry-over count';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.ret_rsn_cd IS '返品理由ＣＤ // #MA.BIZ_RSN_CD // Return reason cd.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.bd_dpt_cd IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.wtax_rate IS '源泉税率 // #MA.TAX_RATE // Withholding tax rate';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.wtax_amt IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.cntry_org_cd IS '原産地ＣＤ // #MA.CNTRY_CD // Place of origin cd.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.iv_itm_nm IS 'インボイス表記品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.ref_dlv_slip_no IS '参照納品書ＮＯ // #MA.DLV_SLIP_NO // Reference delivery note No.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.ref_dlv_slip_d_no IS '参照納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Reference delivery note details No.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.ref_sls_act_no IS '参照売上実績ＮＯ // #MA.SLS_ACT_NO // Reference sales result No.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.ref_sls_act_seq IS '参照売上実績連番 // #MA.SLIP_SEQ // Reference sales result sequence number';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.ref_sls_act_d_no IS '参照売上実績明細ＮＯ // #MA.SLS_ACT_D_NO // Reference sales result details No.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.ref_sls_act_d_seq IS '参照売上実績明細連番 // #MA.SLIP_SEQ // Reference sales result details sequence number';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.base_sls_ac_dt IS '売上計上日（基） // #MA.DT // Sales recording date (Base)';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.slo_d_no IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.io_schd_pr_no IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.cmpl_flg IS '完了ＦＬＧ // #MA.FLG // Completed flg.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.base_unit_abort_qty IS '基準単位打切数量 // #MA.QTY // Base unit cancelled remaining qty.';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sub_char1 IS '予備１ // #MS.SLS_RET_SCHD_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sub_char2 IS '予備２ // #MS.SLS_RET_SCHD_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.sub_char3 IS '予備３ // #MS.SLS_RET_SCHD_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_sls_ret_schd_d_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

