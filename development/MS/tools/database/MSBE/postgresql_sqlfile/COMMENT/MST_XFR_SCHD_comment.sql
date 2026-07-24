\encoding UTF-8

COMMENT ON VIEW mst_xfr_schd IS '移動・移送予定 // Movement/transport schedule';


COMMENT ON COLUMN mst_xfr_schd.xfr_schd_no IS '移動・移送予定ＮＯ // #MA.XFR_SCHD_NO // Movement/transport schedule No.';


COMMENT ON COLUMN mst_xfr_schd.xfr_src_typ IS '移動・移送元区分 // #MS.XFR_SRC_TYP // Source movement/transport type';


COMMENT ON COLUMN mst_xfr_schd.xfr_src_no IS '移動・移送元ＮＯ // #MA.XFR_SRC_NO // Source movement/transport No.';


COMMENT ON COLUMN mst_xfr_schd.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_xfr_schd.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_xfr_schd.gi_wg_cd IS '出庫ワーキンググループＣＤ // #MA.WG_CD // GI WG cd.';


COMMENT ON COLUMN mst_xfr_schd.gi_lg_grp_cd IS '出庫物流グループＣＤ // #MA.LG_GRP_CD // GI distribution group cd.';


COMMENT ON COLUMN mst_xfr_schd.gi_loc_cd IS '出庫場所ＣＤ // #MA.LOC_CD // GI location cd.';


COMMENT ON COLUMN mst_xfr_schd.gi_str_ln_cd IS '出庫棚・ラインＣＤ // #MA.STR_LN_CD // GI rack/line cd.';


COMMENT ON COLUMN mst_xfr_schd.gi_stk_arrv_bp_cd IS '出庫在庫着荷先ＣＤ // #MA.BP_CD // GI inventory arriving point cd.';


COMMENT ON COLUMN mst_xfr_schd.gr_wg_cd IS '入庫ワーキンググループＣＤ // #MA.WG_CD // GR WG cd.';


COMMENT ON COLUMN mst_xfr_schd.gr_lg_grp_cd IS '入庫物流グループＣＤ // #MA.LG_GRP_CD // GR distribution group cd.';


COMMENT ON COLUMN mst_xfr_schd.gr_loc_cd IS '入庫場所ＣＤ // #MA.LOC_CD // GR location cd.';


COMMENT ON COLUMN mst_xfr_schd.gr_str_ln_cd IS '入庫棚・ラインＣＤ // #MA.STR_LN_CD // GR rack/line cd.';


COMMENT ON COLUMN mst_xfr_schd.gr_stk_arrv_bp_cd IS '入庫在庫着荷先ＣＤ // #MA.BP_CD // GR inventory arriving point cd.';


COMMENT ON COLUMN mst_xfr_schd.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_xfr_schd.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_xfr_schd.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_xfr_schd.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_xfr_schd.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_xfr_schd.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_xfr_schd.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_xfr_schd.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_xfr_schd.sno1_null_flg IS '手配ＮＯ１無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 1 flg.';


COMMENT ON COLUMN mst_xfr_schd.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_xfr_schd.sno2_null_flg IS '手配ＮＯ２無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 2 flg.';


COMMENT ON COLUMN mst_xfr_schd.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_xfr_schd.sno3_null_flg IS '手配ＮＯ３無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 3 flg.';


COMMENT ON COLUMN mst_xfr_schd.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_xfr_schd.sno4_null_flg IS '手配ＮＯ４無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 4 flg.';


COMMENT ON COLUMN mst_xfr_schd.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_xfr_schd.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_xfr_schd.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_xfr_schd.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_xfr_schd.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_xfr_schd.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_xfr_schd.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_xfr_schd.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_xfr_schd.gi_rqst_tm IS '出庫希望日時 // #MA.TM // Desired GI date and time';


COMMENT ON COLUMN mst_xfr_schd.gr_rqst_tm IS '入庫希望日時 // #MA.TM // Desired GR date and time';


COMMENT ON COLUMN mst_xfr_schd.rcpt_dt IS '受付日 // #MA.DT // Receiving date';


COMMENT ON COLUMN mst_xfr_schd.rqst_usr_cd IS '依頼元担当者ＣＤ // #MA.USR_CD // Requesting PIC cd.';


COMMENT ON COLUMN mst_xfr_schd.rqst_dpt_cd IS '依頼元部門ＣＤ // #MA.DPT_CD // Requesting dept. cd.';


COMMENT ON COLUMN mst_xfr_schd.ship_term_cd IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN mst_xfr_schd.ship_inst_typ IS '出荷指図区分 // #MA.SHIP_INST_TYP // Shipping order type';


COMMENT ON COLUMN mst_xfr_schd.rsn_cd IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN mst_xfr_schd.bd_dpt_cd IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN mst_xfr_schd.ship_block_flg IS '出荷留めＦＬＧ // #MA.FLG // Pending shipping flg.';


COMMENT ON COLUMN mst_xfr_schd.ship_to_id_typ IS '送付先識別区分 // #MS.SHIP_TO_ID_TYP // Receiving point identification type';


COMMENT ON COLUMN mst_xfr_schd.ship_to_id_cd IS '送付先識別ＣＤ // #MS.SHIP_TO_ID_CD // Receiving point identification cd.';


COMMENT ON COLUMN mst_xfr_schd.ship_to_id_nm IS '送付先識別名 // #MS.SHIP_TO_ID_NM // Receiving point Identification name';


COMMENT ON COLUMN mst_xfr_schd.ship_to_zip_cd IS '送付先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN mst_xfr_schd.ship_to_addr1 IS '送付先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN mst_xfr_schd.ship_to_addr2 IS '送付先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN mst_xfr_schd.ship_to_addr3 IS '送付先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN mst_xfr_schd.ship_to_addr4 IS '送付先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN mst_xfr_schd.ship_to_cntct_dpt IS '送付先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN mst_xfr_schd.ship_to_cntct_psn IS '送付先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN mst_xfr_schd.ship_to_tel IS '送付先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN mst_xfr_schd.ship_to_fax IS '送付先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN mst_xfr_schd.ship_to_sundry_flg IS '送付先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN mst_xfr_schd.via_dlv_typ IS '配送先経由区分 // #MA.VIA_DLV_TYP // Receiving point stopover type';


COMMENT ON COLUMN mst_xfr_schd.itm_ord_no IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN mst_xfr_schd.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_xfr_schd.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN mst_xfr_schd.inpt_schd_no IS '投入予定ＮＯ // #MA.INPT_SCHD_NO // Input schedule No.';


COMMENT ON COLUMN mst_xfr_schd.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mst_xfr_schd.slo_d_no IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN mst_xfr_schd.cont_qty IS '投入有効成分 // #MA.CONT_QTY // Input active ingredient';


COMMENT ON COLUMN mst_xfr_schd.rqst_mod_flg IS '依頼元訂正ＦＬＧ // #MA.FLG // Edited by request source flg.';


COMMENT ON COLUMN mst_xfr_schd.rqst_can_flg IS '紐切れＦＬＧ // #MA.FLG // Unpegged flg.';


COMMENT ON COLUMN mst_xfr_schd.not_lot_mix_flg IS 'ロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed lots flg.';


COMMENT ON COLUMN mst_xfr_schd.not_sublot_mix_flg IS 'サブロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed sublots flg.';


COMMENT ON COLUMN mst_xfr_schd.vld_dt_fr IS '有効期限ＦＲＯＭ // #MA.DT // Expiration date FROM';


COMMENT ON COLUMN mst_xfr_schd.vld_dt_to IS '有効期限ＴＯ // #MA.DT // Expiration date TO';


COMMENT ON COLUMN mst_xfr_schd.prov_typ IS '支給区分 // #MA.PROV_TYP // Supply type';


COMMENT ON COLUMN mst_xfr_schd.prov_basis_typ IS '支給計上区分 // #MA.PROV_BASIS_TYP // Supply recording type';


COMMENT ON COLUMN mst_xfr_schd.xrate_inpt_flg IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN mst_xfr_schd.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_xfr_schd.ptax_xrate_inpt_flg IS '納税為替レート指定ＦＬＧ // #MA.FLG // Taxpaying exchange rate specification flg.';


COMMENT ON COLUMN mst_xfr_schd.ptax_xrate IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN mst_xfr_schd.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_xfr_schd.tax_fix_flg IS '税指定ＦＬＧ // #MA.FLG // Tax specified flg.';


COMMENT ON COLUMN mst_xfr_schd.tax_cd IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN mst_xfr_schd.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_xfr_schd.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_xfr_schd.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_xfr_schd.wtax_rate IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN mst_xfr_schd.wtax_amt IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN mst_xfr_schd.ret_prov_typ IS '支給区分（返品） // #MA.PROV_TYP // Supply type (Return)';


COMMENT ON COLUMN mst_xfr_schd.ret_prov_basis_typ IS '支給計上区分（返品） // #MA.PROV_BASIS_TYP // Supply recording type (Return)';


COMMENT ON COLUMN mst_xfr_schd.ret_xrate_inpt_flg IS '為替レート指定ＦＬＧ（返品） // #MA.FLG // Set exchange rate flg. (Return)';


COMMENT ON COLUMN mst_xfr_schd.ret_xrate IS '為替レート（返品） // #MA.MONEY // Exchange rate (Return)';


COMMENT ON COLUMN mst_xfr_schd.ret_ptax_xrate_inpt_flg IS '納税為替レート指定ＦＬＧ（返品） // #MA.FLG // Taxpaying exchange rate specification flg. (Return)';


COMMENT ON COLUMN mst_xfr_schd.ret_ptax_xrate IS '納税為替レート（返品） // #MA.MONEY // Taxpaying exchange rate (Return)';


COMMENT ON COLUMN mst_xfr_schd.ret_trd_cur_cd IS '取引通貨ＣＤ（返品） // #MA.CUR_CD // Transaction currency cd. (Return)';


COMMENT ON COLUMN mst_xfr_schd.ret_tax_fix_flg IS '税指定ＦＬＧ（返品） // #MA.FLG // Tax specified flg. (Return)';


COMMENT ON COLUMN mst_xfr_schd.ret_tax_cd IS '税ＣＤ（返品） // #MA.TAX_CD // Tax cd. (Return)';


COMMENT ON COLUMN mst_xfr_schd.ret_trd_cur_upri IS '取引通貨単価（返品） // #MA.MONEY // Unit price (Transaction currency) (Return)';


COMMENT ON COLUMN mst_xfr_schd.ret_trd_cur_amt IS '取引通貨金額（返品） // #MA.MONEY // Amount (Transaction currency) (Return)';


COMMENT ON COLUMN mst_xfr_schd.ret_trd_cur_tax_amt IS '取引通貨税額（返品） // #MA.MONEY // Tax amount (Transaction currency) (Return)';


COMMENT ON COLUMN mst_xfr_schd.ret_wtax_rate IS '源泉税率（返品） // #MA.WTAX_RATE // Withholding tax rate (Return)';


COMMENT ON COLUMN mst_xfr_schd.ret_wtax_amt IS '源泉税額（返品） // #MA.MONEY // Withholding tax (Return)';


COMMENT ON COLUMN mst_xfr_schd.io_schd_pr_no IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN mst_xfr_schd.base_dlv_slip_no IS '返品元納品書ＮＯ // #MA.DLV_SLIP_NO // Return-from delivery note No.';


COMMENT ON COLUMN mst_xfr_schd.base_prov_act_no IS '返品元支給実績ＮＯ // #MA.PROV_ACT_NO // Return-from supply result No.';


COMMENT ON COLUMN mst_xfr_schd.base_ac_dt IS '支給計上日（基） // #MA.DT // Supply recording date (Base)';


COMMENT ON COLUMN mst_xfr_schd.rqst_cnt_rmrks IS '依頼連絡備考 // #MS.RQST_CNT_RMRKS // Request contact remarks';


COMMENT ON COLUMN mst_xfr_schd.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_xfr_schd.ship_cnt_rmrks IS '出荷連絡備考 // #MS.SHIP_CNT_RMRKS // Shipping notification remarks';


COMMENT ON COLUMN mst_xfr_schd.intr_rmrks IS '内部備考 // #MS.XFR_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_xfr_schd.sub_char1 IS '予備１ // #MS.XFR_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_xfr_schd.sub_char2 IS '予備２ // #MS.XFR_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_xfr_schd.sub_char3 IS '予備３ // #MS.XFR_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_xfr_schd.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_xfr_schd.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_xfr_schd.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_xfr_schd.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_xfr_schd.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_xfr_schd.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_xfr_schd.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_xfr_schd.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_xfr_schd.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_xfr_schd.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

