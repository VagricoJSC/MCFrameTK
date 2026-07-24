\encoding UTF-8

COMMENT ON TABLE mst_slo_d_p_all IS '受注明細（改訂履歴） // Sales order details (Rev. history)';


COMMENT ON COLUMN mst_slo_d_p_all.slo_d_no IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN mst_slo_d_p_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_slo_d_p_all.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mst_slo_d_p_all.slo_rev IS '受注改訂番号 // #MA.SLIP_REV // Sales order rev. number';


COMMENT ON COLUMN mst_slo_d_p_all.disp_seq IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN mst_slo_d_p_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_slo_d_p_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_slo_d_p_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_slo_d_p_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_slo_d_p_all.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_slo_d_p_all.iv_itm_nm IS 'インボイス表記品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN mst_slo_d_p_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_slo_d_p_all.sno1_null_flg IS '手配ＮＯ１無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 1 flg.';


COMMENT ON COLUMN mst_slo_d_p_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_slo_d_p_all.sno2_null_flg IS '手配ＮＯ２無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 2 flg.';


COMMENT ON COLUMN mst_slo_d_p_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_slo_d_p_all.sno3_null_flg IS '手配ＮＯ３無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 3 flg.';


COMMENT ON COLUMN mst_slo_d_p_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_slo_d_p_all.sno4_null_flg IS '手配ＮＯ４無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 4 flg.';


COMMENT ON COLUMN mst_slo_d_p_all.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_slo_d_p_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_slo_d_p_all.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mst_slo_d_p_all.sls_itm_no IS '販売品目ＮＯ // #MA.SLS_ITM_NO // Sales item No.';


COMMENT ON COLUMN mst_slo_d_p_all.ship_inst_typ IS '出荷指図区分 // #MA.SHIP_INST_TYP // Shipping order type';


COMMENT ON COLUMN mst_slo_d_p_all.ship_schd_split_typ IS '出荷予定分割区分 // #MA.SHIP_SCHD_SPLIT_TYP // Shipping schedule split type';


COMMENT ON COLUMN mst_slo_d_p_all.cntry_org_cd IS '原産地ＣＤ // #MA.CNTRY_CD // Place of origin cd.';


COMMENT ON COLUMN mst_slo_d_p_all.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mst_slo_d_p_all.dlv_sundry_flg IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN mst_slo_d_p_all.dlv_nm IS '納品先名 // #MA.BP_NM // Delivery destination name';


COMMENT ON COLUMN mst_slo_d_p_all.dlv_cntct_dpt IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN mst_slo_d_p_all.dlv_cntct_psn IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN mst_slo_d_p_all.dlv_zip_cd IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN mst_slo_d_p_all.dlv_addr1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN mst_slo_d_p_all.dlv_addr2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN mst_slo_d_p_all.dlv_addr3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN mst_slo_d_p_all.dlv_addr4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN mst_slo_d_p_all.dlv_tel IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN mst_slo_d_p_all.dlv_fax IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN mst_slo_d_p_all.dlv_lg_grp_cd IS '納品先物流グループＣＤ // #MA.LG_GRP_CD // Delivery destination distribution group cd.';


COMMENT ON COLUMN mst_slo_d_p_all.pri_prnt_flg IS '価格印字ＦＬＧ // #MA.FLG // Print price flg.';


COMMENT ON COLUMN mst_slo_d_p_all.dest_cd1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN mst_slo_d_p_all.dest_cd2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN mst_slo_d_p_all.dest_cd3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN mst_slo_d_p_all.tdlv_cd IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN mst_slo_d_p_all.tdlv_sundry_flg IS '配送先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN mst_slo_d_p_all.tdlv_nm IS '配送先名 // #MA.BP_NM // Receiving point name';


COMMENT ON COLUMN mst_slo_d_p_all.via_dlv_typ IS '配送先経由区分 // #MA.VIA_DLV_TYP // Receiving point stopover type';


COMMENT ON COLUMN mst_slo_d_p_all.tdlv_cntct_dpt IS '配送先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN mst_slo_d_p_all.tdlv_cntct_psn IS '配送先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN mst_slo_d_p_all.tdlv_zip_cd IS '配送先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN mst_slo_d_p_all.tdlv_addr1 IS '配送先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN mst_slo_d_p_all.tdlv_addr2 IS '配送先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN mst_slo_d_p_all.tdlv_addr3 IS '配送先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN mst_slo_d_p_all.tdlv_addr4 IS '配送先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN mst_slo_d_p_all.tdlv_tel IS '配送先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN mst_slo_d_p_all.tdlv_fax IS '配送先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN mst_slo_d_p_all.tdlv_lg_grp_cd IS '配送先物流グループＣＤ // #MA.LG_GRP_CD // Receiving point distribution group cd.';


COMMENT ON COLUMN mst_slo_d_p_all.dlv_day_week_typ IS '着曜日 // #MA.DAY_WEEK_TYP // Arrival day of week';


COMMENT ON COLUMN mst_slo_d_p_all.sls_cststk_flg IS '預り売上ＦＬＧ // #MA.FLG // Sales keeping customer inventory flg.';


COMMENT ON COLUMN mst_slo_d_p_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_slo_d_p_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_slo_d_p_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_slo_d_p_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_slo_d_p_all.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_slo_d_p_all.upri_not_tgt_flg IS '単価再取得対象外ＦＬＧ // #MA.FLG // Not to reacquire unit price flg.';


COMMENT ON COLUMN mst_slo_d_p_all.cost_upri IS '原価単価 // #MA.MONEY // Unit cost';


COMMENT ON COLUMN mst_slo_d_p_all.cost_amt IS '原価金額 // #MA.MONEY // Total cost';


COMMENT ON COLUMN mst_slo_d_p_all.interim_flg IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN mst_slo_d_p_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_slo_d_p_all.trd_cur_dscnt_amt IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN mst_slo_d_p_all.dscnt_rsn_cd IS '値引理由ＣＤ // #MA.BIZ_RSN_CD // Discount reason cd.';


COMMENT ON COLUMN mst_slo_d_p_all.iv_upri IS 'インボイス表記単価 // #MA.MONEY // Unit price for invoice';


COMMENT ON COLUMN mst_slo_d_p_all.iv_amt IS 'インボイス表記金額 // #MA.MONEY // Amount for invoice';


COMMENT ON COLUMN mst_slo_d_p_all.tax_fix_flg IS '税指定ＦＬＧ // #MA.FLG // Tax specified flg.';


COMMENT ON COLUMN mst_slo_d_p_all.tax_cd IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN mst_slo_d_p_all.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_slo_d_p_all.proc_typ IS '手配区分 // #MA.SLO_PROC_TYP // Procurement type';


COMMENT ON COLUMN mst_slo_d_p_all.sls_upri_req_typ IS '販売単価取得区分 // #MA.SLS_UPRI_REQ_TYP // Sales unit price acquisition type';


COMMENT ON COLUMN mst_slo_d_p_all.set_itm_grp_no IS '品揃グループＮＯ // #MA.SET_ITM_GRP_NO // Assortment group No.';


COMMENT ON COLUMN mst_slo_d_p_all.ship_rqst_tm IS '出荷希望日時 // #MA.TM // Desired shipping date and time';


COMMENT ON COLUMN mst_slo_d_p_all.dlv_rqst_tm IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN mst_slo_d_p_all.sls_schd_dt IS '売上予定日 // #MA.DT // Scheduled sales date';


COMMENT ON COLUMN mst_slo_d_p_all.accpt_schd_dt IS '検収予定日 // #MA.DT // Scheduled acceptance date';


COMMENT ON COLUMN mst_slo_d_p_all.prms_flg IS '納期回答ＦＬＧ // #MA.FLG // Order promising flg.';


COMMENT ON COLUMN mst_slo_d_p_all.rqst_to_loc_cd IS '依頼先場所ＣＤ // #MA.LOC_CD // Requested location cd.';


COMMENT ON COLUMN mst_slo_d_p_all.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_slo_d_p_all.maker_cd IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN mst_slo_d_p_all.alloc_scope_typ IS '引当範囲区分 // #MA.ALLOC_SCOPE_TYP // Allocation range type';


COMMENT ON COLUMN mst_slo_d_p_all.alloc_typ IS '引当区分 // #MA.ALLOC_TYP // Allocation type';


COMMENT ON COLUMN mst_slo_d_p_all.alloc_grp_cd IS '総量引当場所グループＣＤ // #MA.ALLOC_GRP_CD // Gross allocation location group cd.';


COMMENT ON COLUMN mst_slo_d_p_all.ship_lg_grp_cd IS '出荷物流グループＣＤ // #MA.LG_GRP_CD // Shipping distribution group cd.';


COMMENT ON COLUMN mst_slo_d_p_all.def_loc_cd IS 'デフォルト場所ＣＤ // #MA.LOC_CD // Default location cd.';


COMMENT ON COLUMN mst_slo_d_p_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_slo_d_p_all.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_slo_d_p_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_slo_d_p_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_slo_d_p_all.vmi_flg IS '貸出ＦＬＧ // #MA.FLG // Consignment flg.';


COMMENT ON COLUMN mst_slo_d_p_all.wtax_rate IS '源泉税率 // #MA.TAX_RATE // Withholding tax rate';


COMMENT ON COLUMN mst_slo_d_p_all.wtax_amt IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN mst_slo_d_p_all.wg_rqst_cnt_rmrks IS '依頼連絡備考 // #MS.WG_RQST_CNT_RMRKS // Request contact remarks';


COMMENT ON COLUMN mst_slo_d_p_all.ship_term_cd IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN mst_slo_d_p_all.bill_crryovr_times IS '請求繰越回数 // #MA.CRRYOVR_TIMES // Billing carry-over count';


COMMENT ON COLUMN mst_slo_d_p_all.cst_po_d_no IS '得意先注文明細ＮＯ // #MA.CST_PO_D_NO // Customer order details No.';


COMMENT ON COLUMN mst_slo_d_p_all.cst_itm_cd IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN mst_slo_d_p_all.cst_itm_nm IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN mst_slo_d_p_all.cst_po_d_rmrks IS '得意先注文明細備考 // #MS.CST_PO_D_RMRKS // Customer order details remarks';


COMMENT ON COLUMN mst_slo_d_p_all.sls_rsn_cd IS '売上理由ＣＤ // #MA.BIZ_RSN_CD // Sales reason cd.';


COMMENT ON COLUMN mst_slo_d_p_all.bd_dpt_cd IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN mst_slo_d_p_all.rqst_dt IS '依頼日 // #MA.DT // Request date';


COMMENT ON COLUMN mst_slo_d_p_all.rqst_dlv_rqst_dt IS '依頼納入希望日 // #MA.DT // Request desired delivery date';


COMMENT ON COLUMN mst_slo_d_p_all.rqst_prms_dt IS '依頼回答日 // #MA.DT // Request replied date';


COMMENT ON COLUMN mst_slo_d_p_all.rqst_prms_dlv_dt IS '依頼回答納入日 // #MA.DT // Request replied delivery date';


COMMENT ON COLUMN mst_slo_d_p_all.rqst_unit_cd IS '依頼単位ＣＤ // #MA.UNIT_CD // Request unit cd.';


COMMENT ON COLUMN mst_slo_d_p_all.rqst_qty IS '依頼数量 // #MA.QTY // Request qty.';


COMMENT ON COLUMN mst_slo_d_p_all.slo_sum_base_dt IS '受注集計基準日 // #MA.DT // Sales order aggregated base date';


COMMENT ON COLUMN mst_slo_d_p_all.qtn_no IS '見積ＮＯ // #MA.QTN_NO // Quotation No.';


COMMENT ON COLUMN mst_slo_d_p_all.qtn_rev IS '見積改訂番号 // #MA.SLIP_REV // Quotation rev. number';


COMMENT ON COLUMN mst_slo_d_p_all.qtn_d_no IS '見積明細ＮＯ // #MA.QTN_D_NO // Quotation details No.';


COMMENT ON COLUMN mst_slo_d_p_all.ship_cnt_rmrks IS '出荷連絡備考 // #MS.SHIP_CNT_RMRKS // Shipping notification remarks';


COMMENT ON COLUMN mst_slo_d_p_all.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_slo_d_p_all.intr_rmrks IS '内部備考 // #MS.SLO_D_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_slo_d_p_all.io_schd_pr_no IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN mst_slo_d_p_all.sub_char1 IS '予備１ // #MS.SLO_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_slo_d_p_all.sub_char2 IS '予備２ // #MS.SLO_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_slo_d_p_all.sub_char3 IS '予備３ // #MS.SLO_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_slo_d_p_all.itm_comp_seq IS '構成表連番 // #MA.PRNT_SEQ // Configuration table sequence number';


COMMENT ON COLUMN mst_slo_d_p_all.itm_spec_seq IS '仕様表連番 // #MA.PRNT_SEQ // Specification table sequence number';


COMMENT ON COLUMN mst_slo_d_p_all.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_slo_d_p_all.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_slo_d_p_all.can_rsn_cd IS '取消理由ＣＤ // #MS.SLO_RSN_CD // Canceling reason cd.';


COMMENT ON COLUMN mst_slo_d_p_all.slo_d_can_rmkrs IS '明細取消備考 // #MS.SLO_D_CAN_RMKRS // Details cancel remarks';


COMMENT ON COLUMN mst_slo_d_p_all.edi_sub_d_char1 IS 'ＥＤＩ明細予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // EDI details spare CHAR column 1';


COMMENT ON COLUMN mst_slo_d_p_all.edi_sub_d_char2 IS 'ＥＤＩ明細予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // EDI details spare CHAR column 2';


COMMENT ON COLUMN mst_slo_d_p_all.edi_sub_d_char3 IS 'ＥＤＩ明細予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // EDI details spare CHAR column 3';


COMMENT ON COLUMN mst_slo_d_p_all.edi_sub_d_char4 IS 'ＥＤＩ明細予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // EDI details spare CHAR column 4';


COMMENT ON COLUMN mst_slo_d_p_all.edi_sub_d_char5 IS 'ＥＤＩ明細予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // EDI details spare CHAR column 5';


COMMENT ON COLUMN mst_slo_d_p_all.edi_sub_d_num1 IS 'ＥＤＩ明細予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // EDI details spare NUM column 1';


COMMENT ON COLUMN mst_slo_d_p_all.edi_sub_d_dt1 IS 'ＥＤＩ明細予備ＤＡＴＥ項目１ // #MA.DT // EDI details spare DATE column 1';


COMMENT ON COLUMN mst_slo_d_p_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_slo_d_p_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_slo_d_p_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_slo_d_p_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_slo_d_p_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_slo_d_p_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_slo_d_p_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_slo_d_p_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_slo_d_p_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_slo_d_p_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mst_slo_d_p_all.not_lg_mix_flg IS '物流グループ混在不可ＦＬＧ // #MA.FLG // Prohibit mixed distribution group flg.';


COMMENT ON COLUMN mst_slo_d_p_all.not_lot_mix_flg IS 'ロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed lots flg.';


COMMENT ON COLUMN mst_slo_d_p_all.not_sublot_mix_flg IS 'サブロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed sublots flg.';

