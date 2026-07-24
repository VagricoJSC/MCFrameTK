\encoding UTF-8

COMMENT ON VIEW mst_ship_pr IS '出荷進捗 // Shipping progress';


COMMENT ON COLUMN mst_ship_pr.ship_pr_no IS '出荷進捗ＮＯ // #MA.SHIP_PR_NO // Shipping progress No.';


COMMENT ON COLUMN mst_ship_pr.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_ship_pr.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_ship_pr.slo_d_no IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN mst_ship_pr.xfr_schd_no IS '移動・移送予定ＮＯ // #MA.XFR_SCHD_NO // Movement/transport schedule No.';


COMMENT ON COLUMN mst_ship_pr.rqst_dpt_cd IS '依頼元部門ＣＤ // #MA.DPT_CD // Requesting dept. cd.';


COMMENT ON COLUMN mst_ship_pr.rqst_usr_cd IS '依頼元担当者ＣＤ // #MA.USR_CD // Requesting PIC cd.';


COMMENT ON COLUMN mst_ship_pr.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_ship_pr.ship_rqst_tm IS '出荷希望日時 // #MA.TM // Desired shipping date and time';


COMMENT ON COLUMN mst_ship_pr.dlv_rqst_tm IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN mst_ship_pr.prms_dt IS '納期回答日 // #MA.DT // order promising date';


COMMENT ON COLUMN mst_ship_pr.prms_dlv_dt IS '回答納入日 // #MA.DT // Replied delivery date';


COMMENT ON COLUMN mst_ship_pr.dlv_inst_rcpt_dt IS '納入指示受領日 // #MA.DT // Delivery order received date';


COMMENT ON COLUMN mst_ship_pr.dlv_inst_prms_dt IS '納入指示回答日 // #MA.DT // Delivery order replied date';


COMMENT ON COLUMN mst_ship_pr.ship_schd_tm IS '出荷予定日時 // #MA.TM // Scheduled shipping date and time';


COMMENT ON COLUMN mst_ship_pr.dlv_schd_tm IS '納品予定日時 // #MA.TM // Scheduled delivery date and time';


COMMENT ON COLUMN mst_ship_pr.ship_tm IS '出荷日時 // #MA.TM // Shipping date and time';


COMMENT ON COLUMN mst_ship_pr.dlv_tm IS '納品日時 // #MA.TM // Delivery date and time';


COMMENT ON COLUMN mst_ship_pr.sls_dt IS '売上日 // #MA.DT // Sales date';


COMMENT ON COLUMN mst_ship_pr.ship_to_lg_grp_cd IS '出荷先物流グループＣＤ // #MA.LG_GRP_CD // Receiving point distribution group cd.';


COMMENT ON COLUMN mst_ship_pr.dlv_id_typ IS '納品先識別区分 // #MS.DLV_ID_TYP // Delivery destination identification type';


COMMENT ON COLUMN mst_ship_pr.dlv_id_cd IS '納品先識別ＣＤ // #MS.DLV_ID_CD // Delivery destination identification cd.';


COMMENT ON COLUMN mst_ship_pr.dlv_id_nm IS '納品先識別名 // #MS.DLV_ID_NM // Delivery destination identification name';


COMMENT ON COLUMN mst_ship_pr.dlv_zip_cd IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN mst_ship_pr.dlv_addr1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN mst_ship_pr.dlv_addr2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN mst_ship_pr.dlv_addr3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN mst_ship_pr.dlv_addr4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN mst_ship_pr.dlv_cntct_dpt IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN mst_ship_pr.dlv_cntct_psn IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN mst_ship_pr.dlv_tel IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN mst_ship_pr.dlv_fax IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN mst_ship_pr.dlv_sundry_flg IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN mst_ship_pr.dlv_str_ln_cd IS '納品棚・ラインＣＤ // #MA.STR_LN_CD // Delivery rack/line cd.';


COMMENT ON COLUMN mst_ship_pr.ship_to_id_typ IS '送付先識別区分 // #MS.SHIP_TO_ID_TYP // Receiving point identification type';


COMMENT ON COLUMN mst_ship_pr.ship_to_id_cd IS '送付先識別ＣＤ // #MS.SHIP_TO_ID_CD // Receiving point identification cd.';


COMMENT ON COLUMN mst_ship_pr.ship_to_id_nm IS '送付先識別名 // #MS.SHIP_TO_ID_NM // Receiving point Identification name';


COMMENT ON COLUMN mst_ship_pr.ship_to_zip_cd IS '送付先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN mst_ship_pr.ship_to_addr1 IS '送付先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN mst_ship_pr.ship_to_addr2 IS '送付先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN mst_ship_pr.ship_to_addr3 IS '送付先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN mst_ship_pr.ship_to_addr4 IS '送付先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN mst_ship_pr.ship_to_cntct_dpt IS '送付先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN mst_ship_pr.ship_to_cntct_psn IS '送付先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN mst_ship_pr.ship_to_tel IS '送付先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN mst_ship_pr.ship_to_fax IS '送付先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN mst_ship_pr.ship_to_sundry_flg IS '送付先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN mst_ship_pr.via_dlv_typ IS '配送先経由区分 // #MA.VIA_DLV_TYP // Receiving point stopover type';


COMMENT ON COLUMN mst_ship_pr.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_ship_pr.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_ship_pr.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_ship_pr.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_ship_pr.prms_qty IS '納期回答数量 // #MA.QTY // Order promising qty.';


COMMENT ON COLUMN mst_ship_pr.dlv_inst_rcpt_qty IS '納入指示受領数量 // #MA.QTY // Delivery order received qty.';


COMMENT ON COLUMN mst_ship_pr.dlv_inst_prms_qty IS '納入指示回答数量 // #MA.QTY // Delivery order replied qty.';


COMMENT ON COLUMN mst_ship_pr.re_ship_schd_qty IS '再出荷予定数量 // #MA.QTY // Scheduled re-shipping qty.';


COMMENT ON COLUMN mst_ship_pr.ship_inst_qty IS '出荷指図数量 // #MA.QTY // Shipping order qty.';


COMMENT ON COLUMN mst_ship_pr.ship_act_qty IS '出荷実績数量 // #MA.QTY // Shipping result qty.';


COMMENT ON COLUMN mst_ship_pr.iv_schd_qty IS 'インボイス出荷予定数量 // #MA.QTY // Invoice shipping scheduled qty.';


COMMENT ON COLUMN mst_ship_pr.iv_act_qty IS 'インボイス出荷実績数量 // #MA.QTY // Invoice shipping result qty.';


COMMENT ON COLUMN mst_ship_pr.sls_qty IS '売上数量 // #MA.QTY // Sales qty.';


COMMENT ON COLUMN mst_ship_pr.dlv_qty IS '納品数量 // #MA.QTY // Delivery qty.';


COMMENT ON COLUMN mst_ship_pr.ship_ret_qty IS '出荷返品数量 // #MA.QTY // Shipping return qty.';


COMMENT ON COLUMN mst_ship_pr.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_ship_pr.ship_schd_abort_qty IS '出荷予定打切数量 // #MA.QTY // Cancelled remaining shipping schedule qty.';


COMMENT ON COLUMN mst_ship_pr.sls_schd_abort_qty IS '売上予定打切数量 // #MA.QTY // Cancelled remaining sales schedule qty.';


COMMENT ON COLUMN mst_ship_pr.act_dlv_lt IS '納品ＬＴ // #MA.LT // Delivery LT';


COMMENT ON COLUMN mst_ship_pr.rsn_cd IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN mst_ship_pr.bd_dpt_cd IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN mst_ship_pr.ship_term_cd IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN mst_ship_pr.ship_inst_typ IS '出荷指図区分 // #MA.SHIP_INST_TYP // Shipping order type';


COMMENT ON COLUMN mst_ship_pr.purc_ddlv_flg IS '仕入直送ＦＬＧ // #MA.FLG // Direct delivery flg.';


COMMENT ON COLUMN mst_ship_pr.ship_schd_split_typ IS '出荷予定分割区分 // #MA.SHIP_SCHD_SPLIT_TYP // Shipping schedule split type';


COMMENT ON COLUMN mst_ship_pr.alloc_scope_typ IS '引当範囲区分 // #MA.ALLOC_SCOPE_TYP // Allocation range type';


COMMENT ON COLUMN mst_ship_pr.alloc_typ IS '引当区分 // #MA.ALLOC_TYP // Allocation type';


COMMENT ON COLUMN mst_ship_pr.alloc_grp_cd IS '総量引当場所グループＣＤ // #MA.ALLOC_GRP_CD // Gross allocation location group cd.';


COMMENT ON COLUMN mst_ship_pr.ship_lg_grp_cd IS '出荷物流グループＣＤ // #MA.LG_GRP_CD // Shipping distribution group cd.';


COMMENT ON COLUMN mst_ship_pr.def_loc_cd IS 'デフォルト場所ＣＤ // #MA.LOC_CD // Default location cd.';


COMMENT ON COLUMN mst_ship_pr.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_ship_pr.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_ship_pr.period_block_flg IS '引当期間保留ＦＬＧ // #MA.FLG // Allocation period pending flg.';


COMMENT ON COLUMN mst_ship_pr.sls_sts_typ IS '販売状況区分 // #MS.SLS_STS_TYP // Sales status type';


COMMENT ON COLUMN mst_ship_pr.prms_dlv_dt_overdue_flg IS '回答納入日遅れＦＬＧ // #MA.FLG // Replied delivery date delay flg.';


COMMENT ON COLUMN mst_ship_pr.dlv_rqst_dt_overdue_flg IS '納入希望日遅れＦＬＧ // #MA.FLG // Delivery dates delayed flg.';


COMMENT ON COLUMN mst_ship_pr.ship_schd_split_flg IS '出荷予定分割ＦＬＧ // #MA.FLG // Shipping schedule split flg.';


COMMENT ON COLUMN mst_ship_pr.ship_cmpl_flg IS '出荷完了ＦＬＧ // #MA.FLG // Shipping completion flg.';


COMMENT ON COLUMN mst_ship_pr.sls_cmpl_flg IS '売上完了ＦＬＧ // #MA.FLG // Sales completed flg.';


COMMENT ON COLUMN mst_ship_pr.dlv_cmpl_flg IS '納品完了ＦＬＧ // #MA.FLG // Delivery completion flg.';


COMMENT ON COLUMN mst_ship_pr.ship_cnt_rmrks IS '出荷連絡備考 // #MS.SHIP_CNT_RMRKS // Shipping notification remarks';


COMMENT ON COLUMN mst_ship_pr.io_schd_pr_no IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN mst_ship_pr.sub_char1 IS '予備１ // #MS.SHIP_PR_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_ship_pr.sub_char2 IS '予備２ // #MS.SHIP_PR_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_ship_pr.sub_char3 IS '予備３ // #MS.SHIP_PR_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_ship_pr.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_ship_pr.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_ship_pr.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_ship_pr.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_ship_pr.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_ship_pr.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_ship_pr.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_ship_pr.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_ship_pr.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_ship_pr.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mst_ship_pr.not_lg_mix_flg IS '物流グループ混在不可ＦＬＧ // #MA.FLG // Prohibit mixed distribution group flg.';

