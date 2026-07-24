\encoding UTF-8

COMMENT ON TABLE mst_wg_rqst_all IS 'ＷＧ間依頼 // Inventory request from other WG';


COMMENT ON COLUMN mst_wg_rqst_all.wg_rqst_no IS 'ＷＧ間依頼ＮＯ // #MA.WG_RQST_NO // No. of inventory request from other WG';


COMMENT ON COLUMN mst_wg_rqst_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_wg_rqst_all.last_wg_rqst_no IS '前回ＷＧ間依頼ＮＯ // #MA.WG_RQST_NO // Last inventory request No. from other WG';


COMMENT ON COLUMN mst_wg_rqst_all.wg_rqst_typ IS 'ＷＧ間依頼種類区分 // #MS.WG_RQST_TYP // Inventory request from other WG classification type';


COMMENT ON COLUMN mst_wg_rqst_all.wg_rqst_src_typ IS 'ＷＧ間依頼作成元区分 // #MS.WG_RQST_SRC_TYP // Inventory request from other WG creating source type';


COMMENT ON COLUMN mst_wg_rqst_all.wg_rqst_src_no IS 'ＷＧ間依頼元識別ＮＯ // #MA.WG_RQST_SRC_NO // Source of inventory request from other WG identification No.';


COMMENT ON COLUMN mst_wg_rqst_all.wg_rqst_sts_typ IS 'ＷＧ間依頼状況区分 // #MS.WG_RQST_STS_TYP // Inventory request from other WG status type';


COMMENT ON COLUMN mst_wg_rqst_all.rqst_dt IS '依頼日 // #MA.DT // Request date';


COMMENT ON COLUMN mst_wg_rqst_all.prms_ntc_flg IS '回答通知ＦＬＧ // #MA.FLG // Replied flg.';


COMMENT ON COLUMN mst_wg_rqst_all.prms_dt IS '回答通知日 // #MA.DT // Replied date';


COMMENT ON COLUMN mst_wg_rqst_all.re_prms_ntc_flg IS '回答再通知ＦＬＧ // #MA.FLG // Re-replied flg.';


COMMENT ON COLUMN mst_wg_rqst_all.re_prms_dt IS '回答再通知日 // #MA.DT // Re-replied date';


COMMENT ON COLUMN mst_wg_rqst_all.prms_uncn_flg IS '回答未確認ＦＬＧ // #MA.FLG // Reply unchecked flg.';


COMMENT ON COLUMN mst_wg_rqst_all.re_rqst_flg IS '再調整依頼ＦＬＧ // #MA.FLG // Readjustment request flg.';


COMMENT ON COLUMN mst_wg_rqst_all.re_rqst_dt IS '再調整依頼日 // #MA.DT // Readjustment request date';


COMMENT ON COLUMN mst_wg_rqst_all.man_prms_flg IS '手動回答ＦＬＧ // #MA.FLG // Manual replied flg.';


COMMENT ON COLUMN mst_wg_rqst_all.rqst_crrct_flg IS '依頼元訂正ＦＬＧ // #MA.FLG // Edited by request source flg.';


COMMENT ON COLUMN mst_wg_rqst_all.dlv_inst_rcpt_flg IS '納入指示受領ＦＬＧ // #MA.FLG // Delivery order received flg.';


COMMENT ON COLUMN mst_wg_rqst_all.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_wg_rqst_all.rqst_fr_wg_cd IS '依頼元ワーキンググループＣＤ // #MA.WG_CD // Requesting WG cd.';


COMMENT ON COLUMN mst_wg_rqst_all.rqst_fr_dpt_cd IS '依頼元部門ＣＤ // #MA.DPT_CD // Requesting dept. cd.';


COMMENT ON COLUMN mst_wg_rqst_all.rqst_fr_usr_cd IS '依頼元担当者ＣＤ // #MA.USR_CD // Requesting PIC cd.';


COMMENT ON COLUMN mst_wg_rqst_all.gr_loc_wg_cd IS '入庫ワーキンググループＣＤ // #MA.WG_CD // GR WG cd.';


COMMENT ON COLUMN mst_wg_rqst_all.gr_lg_grp_cd IS '入庫物流グループＣＤ // #MA.LG_GRP_CD // GR distribution group cd.';


COMMENT ON COLUMN mst_wg_rqst_all.gr_loc_cd IS '入庫場所ＣＤ // #MA.LOC_CD // GR location cd.';


COMMENT ON COLUMN mst_wg_rqst_all.gr_str_ln_cd IS '入庫棚・ラインＣＤ // #MA.STR_LN_CD // GR rack/line cd.';


COMMENT ON COLUMN mst_wg_rqst_all.gr_rqst_tm IS '入庫依頼日時 // #MA.TM // GR request date and time';


COMMENT ON COLUMN mst_wg_rqst_all.rqst_to_wg_cd IS '依頼先ワーキンググループＣＤ // #MA.WG_CD // Requested WG cd.';


COMMENT ON COLUMN mst_wg_rqst_all.gi_loc_wg_cd IS '出庫ワーキンググループＣＤ // #MA.LG_GRP_CD // GI WG cd.';


COMMENT ON COLUMN mst_wg_rqst_all.gi_lg_grp_cd IS '出庫物流グループＣＤ // #MA.LG_GRP_CD // GI distribution group cd.';


COMMENT ON COLUMN mst_wg_rqst_all.gi_loc_cd IS '出庫場所ＣＤ // #MA.LOC_CD // GI location cd.';


COMMENT ON COLUMN mst_wg_rqst_all.gi_str_ln_cd IS '出庫棚・ラインＣＤ // #MA.STR_LN_CD // GI rack/line cd.';


COMMENT ON COLUMN mst_wg_rqst_all.gi_rqst_tm IS '出庫依頼日時 // #MA.TM // GI request date and time';


COMMENT ON COLUMN mst_wg_rqst_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_wg_rqst_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_wg_rqst_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_wg_rqst_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_wg_rqst_all.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_wg_rqst_all.iv_itm_nm IS 'インボイス表記品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN mst_wg_rqst_all.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mst_wg_rqst_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_wg_rqst_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_wg_rqst_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_wg_rqst_all.sno1_null_flg IS '手配ＮＯ１無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 1 flg.';


COMMENT ON COLUMN mst_wg_rqst_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_wg_rqst_all.sno2_null_flg IS '手配ＮＯ２無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 2 flg.';


COMMENT ON COLUMN mst_wg_rqst_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_wg_rqst_all.sno3_null_flg IS '手配ＮＯ３無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 3 flg.';


COMMENT ON COLUMN mst_wg_rqst_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_wg_rqst_all.sno4_null_flg IS '手配ＮＯ４無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 4 flg.';


COMMENT ON COLUMN mst_wg_rqst_all.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_wg_rqst_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_wg_rqst_all.vld_dt_fr IS '有効期限ＦＲＯＭ // #MA.DT // Expiration date FROM';


COMMENT ON COLUMN mst_wg_rqst_all.vld_dt_to IS '有効期限ＴＯ // #MA.DT // Expiration date TO';


COMMENT ON COLUMN mst_wg_rqst_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_wg_rqst_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_wg_rqst_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_wg_rqst_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_wg_rqst_all.not_cmpl_qty IS '基準単位依頼残数量 // #MA.QTY // Base unit remaining request qty.';


COMMENT ON COLUMN mst_wg_rqst_all.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_wg_rqst_all.maker_cd IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN mst_wg_rqst_all.io_schd_pr_no IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN mst_wg_rqst_all.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mst_wg_rqst_all.slo_d_no IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN mst_wg_rqst_all.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mst_wg_rqst_all.dlv_sundry_flg IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN mst_wg_rqst_all.dlv_nm IS '納品先名 // #MA.BP_NM // Delivery destination name';


COMMENT ON COLUMN mst_wg_rqst_all.dlv_cntct_dpt IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN mst_wg_rqst_all.dlv_cntct_psn IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN mst_wg_rqst_all.dlv_zip_cd IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN mst_wg_rqst_all.dlv_addr1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN mst_wg_rqst_all.dlv_addr2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN mst_wg_rqst_all.dlv_addr3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN mst_wg_rqst_all.dlv_addr4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN mst_wg_rqst_all.dlv_tel IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN mst_wg_rqst_all.dlv_fax IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN mst_wg_rqst_all.tdlv_cd IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN mst_wg_rqst_all.tdlv_sundry_flg IS '配送先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN mst_wg_rqst_all.tdlv_nm IS '配送先名 // #MA.BP_NM // Receiving point name';


COMMENT ON COLUMN mst_wg_rqst_all.tdlv_cntct_dpt IS '配送先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN mst_wg_rqst_all.tdlv_cntct_psn IS '配送先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN mst_wg_rqst_all.tdlv_zip_cd IS '配送先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN mst_wg_rqst_all.tdlv_addr1 IS '配送先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN mst_wg_rqst_all.tdlv_addr2 IS '配送先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN mst_wg_rqst_all.tdlv_addr3 IS '配送先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN mst_wg_rqst_all.tdlv_addr4 IS '配送先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN mst_wg_rqst_all.tdlv_tel IS '配送先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN mst_wg_rqst_all.tdlv_fax IS '配送先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN mst_wg_rqst_all.itm_ord_no IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN mst_wg_rqst_all.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mst_wg_rqst_all.bom_ptn IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN mst_wg_rqst_all.purc_rsn_cd IS '仕入理由ＣＤ // #MA.BIZ_RSN_CD // Purchase reason cd.';


COMMENT ON COLUMN mst_wg_rqst_all.xpns_po_flg IS '経費購買ＦＬＧ // #MA.FLG // Expenses purchasing flg.';


COMMENT ON COLUMN mst_wg_rqst_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_wg_rqst_all.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_wg_rqst_all.bd_itm_cd IS '負担品目ＣＤ // #MA.ITM_CD // Charged item cd.';


COMMENT ON COLUMN mst_wg_rqst_all.bd_itm_sub1 IS '負担枝番１ // #MA.ITM_SUB1 // Charged branch No. 1';


COMMENT ON COLUMN mst_wg_rqst_all.bd_itm_sub2 IS '負担枝番２ // #MA.ITM_SUB2 // Charged branch No. 2';


COMMENT ON COLUMN mst_wg_rqst_all.bd_itm_sub3 IS '負担枝番３ // #MA.ITM_SUB3 // Charged branch No. 3';


COMMENT ON COLUMN mst_wg_rqst_all.bd_sno1 IS '負担手配ＮＯ１ // #MA.SNO1 // Charged SEIBAN No. 1';


COMMENT ON COLUMN mst_wg_rqst_all.bd_sno2 IS '負担手配ＮＯ２ // #MA.SNO2 // Charged SEIBAN No. 2';


COMMENT ON COLUMN mst_wg_rqst_all.bd_sno3 IS '負担手配ＮＯ３ // #MA.SNO3 // Charged SEIBAN No. 3';


COMMENT ON COLUMN mst_wg_rqst_all.bd_sno4 IS '負担手配ＮＯ４ // #MA.SNO4 // Charged SEIBAN No. 4';


COMMENT ON COLUMN mst_wg_rqst_all.bd_lot_no IS '負担ロットＮＯ // #MA.LOT_NO // Charged lot No.';


COMMENT ON COLUMN mst_wg_rqst_all.bd_sublot_no IS '負担サブロットＮＯ // #MA.SUBLOT_NO // Charged sublot No.';


COMMENT ON COLUMN mst_wg_rqst_all.bd_loc_cd IS '負担場所ＣＤ // #MA.LOC_CD // Charged location cd.';


COMMENT ON COLUMN mst_wg_rqst_all.bd_dpt_cd IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN mst_wg_rqst_all.bd_ctg_cd IS '負担品群ＣＤ // #MA.COST_CTG_CD // Charged item category cd.';


COMMENT ON COLUMN mst_wg_rqst_all.bd_oper_cd IS '負担工程ＣＤ // #MA.OPER_CD // Charged operation cd.';


COMMENT ON COLUMN mst_wg_rqst_all.bd_slo_no IS '負担受注ＮＯ // #MA.SLO_NO // Charged sales No.';


COMMENT ON COLUMN mst_wg_rqst_all.bd_iv_no IS '負担インボイスＮＯ // #MA.IV_NO // Charged invoice No.';


COMMENT ON COLUMN mst_wg_rqst_all.bd_po_no IS '負担発注ＮＯ // #MA.PO_NO // Charged PO No.';


COMMENT ON COLUMN mst_wg_rqst_all.rqst_crrct_dt IS '依頼元訂正日 // #MA.DT // Date edited by request source';


COMMENT ON COLUMN mst_wg_rqst_all.rqst_can_dt IS '依頼元取消日 // #MA.DT // Request source cancellation date';


COMMENT ON COLUMN mst_wg_rqst_all.prms_can_dt IS '回答通知取消日 // #MA.DT // Reply cancelled date';


COMMENT ON COLUMN mst_wg_rqst_all.inst_dt IS '指図日 // #MA.DT // Order date';


COMMENT ON COLUMN mst_wg_rqst_all.inst_can_dt IS '指図取消日 // #MA.DT // Order cancellation date';


COMMENT ON COLUMN mst_wg_rqst_all.act_dt IS '実績日 // #MA.DT // Actual date';


COMMENT ON COLUMN mst_wg_rqst_all.act_can_dt IS '実績取消日 // #MA.DT // Result cancel date';


COMMENT ON COLUMN mst_wg_rqst_all.wg_rqst_cnt_rmrks IS '依頼連絡備考 // #MS.WG_RQST_CNT_RMRKS // Request contact remarks';


COMMENT ON COLUMN mst_wg_rqst_all.wg_re_rqst_cnt_rmrks IS '再調整依頼連絡備考 // #MS.WG_RE_RQST_CNT_RMRKS // Readjustment request contact remarks';


COMMENT ON COLUMN mst_wg_rqst_all.intr_rmrks IS '依頼元内部備考 // #MS.WG_RQST_INTR_RMRKS // Request source internal remarks';


COMMENT ON COLUMN mst_wg_rqst_all.comp_cng_flg IS '構成変更ＦＬＧ // #MA.FLG // Configuration changes flg.';


COMMENT ON COLUMN mst_wg_rqst_all.spec_cng_flg IS '仕様変更ＦＬＧ // #MA.FLG // Specification change flg.';


COMMENT ON COLUMN mst_wg_rqst_all.sub_char1 IS '予備１ // #MS.WG_RQST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_wg_rqst_all.sub_char2 IS '予備２ // #MS.WG_RQST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_wg_rqst_all.sub_char3 IS '予備３ // #MS.WG_RQST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_wg_rqst_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_wg_rqst_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_wg_rqst_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_wg_rqst_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_wg_rqst_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_wg_rqst_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_wg_rqst_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_wg_rqst_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_wg_rqst_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_wg_rqst_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

