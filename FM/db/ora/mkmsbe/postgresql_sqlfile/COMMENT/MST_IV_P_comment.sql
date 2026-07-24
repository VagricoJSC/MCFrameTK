\encoding UTF-8

COMMENT ON VIEW mst_iv_p IS 'インボイスヘッダ（改訂履歴） // Invoice header (Rev. history)';


COMMENT ON COLUMN mst_iv_p.iv_mng_no IS 'インボイス管理ＮＯ // #MA.IV_MNG_NO // Invoice management No.';


COMMENT ON COLUMN mst_iv_p.iv_rev IS 'インボイス改訂番号 // #MA.SLIP_REV // Invoice rev. number';


COMMENT ON COLUMN mst_iv_p.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_iv_p.iv_src_typ IS 'インボイス作成元区分 // #MS.IV_SRC_TYP // Invoice creating source type';


COMMENT ON COLUMN mst_iv_p.cmpl_schd_dt IS '完了予定日 // #MA.DT // Scheduled completion date';


COMMENT ON COLUMN mst_iv_p.trd_schd_dt IS '取引予定日 // #MA.DT // Scheduled transaction date';


COMMENT ON COLUMN mst_iv_p.cmpl_dt IS '完了日 // #MA.DT // Completion date';


COMMENT ON COLUMN mst_iv_p.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_iv_p.iv_dt IS 'インボイス日付 // #MA.DT // Invoice date';


COMMENT ON COLUMN mst_iv_p.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_iv_p.ship_rqst_id_typ IS '出荷依頼先識別区分 // #MS.SHIP_RQST_ID_TYP // Shipping requested identification type';


COMMENT ON COLUMN mst_iv_p.ship_rqst_id_cd IS '出荷依頼先識別ＣＤ // #MS.SHIP_RQST_ID_CD // Shipping requested alias cd.';


COMMENT ON COLUMN mst_iv_p.tdlv_cd IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN mst_iv_p.tdlv_nm IS '配送先名 // #MA.BP_NM // Receiving point name';


COMMENT ON COLUMN mst_iv_p.tdlv_sundry_flg IS '配送先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN mst_iv_p.via_dlv_typ IS '配送先経由区分 // #MA.VIA_DLV_TYP // Receiving point stopover type';


COMMENT ON COLUMN mst_iv_p.tdlv_cntct_dpt IS '配送先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN mst_iv_p.tdlv_cntct_psn IS '配送先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN mst_iv_p.tdlv_zip_cd IS '配送先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN mst_iv_p.tdlv_addr1 IS '配送先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN mst_iv_p.tdlv_addr2 IS '配送先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN mst_iv_p.tdlv_addr3 IS '配送先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN mst_iv_p.tdlv_addr4 IS '配送先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN mst_iv_p.tdlv_tel IS '配送先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN mst_iv_p.tdlv_fax IS '配送先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN mst_iv_p.tdlv_lg_grp_cd IS '配送先物流グループＣＤ // #MA.LG_GRP_CD // Receiving point distribution group cd.';


COMMENT ON COLUMN mst_iv_p.dlv_id_typ IS '納品先識別区分 // #MS.DLV_ID_TYP // Delivery destination identification type';


COMMENT ON COLUMN mst_iv_p.dlv_id_cd IS '納品先識別ＣＤ // #MS.DLV_ID_CD // Delivery destination identification cd.';


COMMENT ON COLUMN mst_iv_p.dlv_id_nm IS '納品先識別名 // #MS.DLV_ID_NM // Delivery destination identification name';


COMMENT ON COLUMN mst_iv_p.dlv_cntct_dpt IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN mst_iv_p.dlv_cntct_psn IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN mst_iv_p.dlv_zip_cd IS '納品先ＺＩＰ // #MA.ZIP_CD // ZIP (Delivery destination)';


COMMENT ON COLUMN mst_iv_p.dlv_addr1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN mst_iv_p.dlv_addr2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN mst_iv_p.dlv_addr3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN mst_iv_p.dlv_addr4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN mst_iv_p.dlv_tel IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN mst_iv_p.dlv_fax IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN mst_iv_p.dlv_cntry_cd IS '納品先国ＣＤ // #MA.CNTRY_CD // Delivery destination country cd.';


COMMENT ON COLUMN mst_iv_p.dlv_sundry_flg IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN mst_iv_p.trnspt_cd IS '輸送方法ＣＤ // #MA.TRNSPT_CD // Transportation method cd.';


COMMENT ON COLUMN mst_iv_p.vssl_flght IS '船名／便名 // #MA.VSSL_FLGHT // Ship/flight name';


COMMENT ON COLUMN mst_iv_p.load_port_cd IS '船積港ＣＤ // #MA.PORT_CD // Loading port cd.';


COMMENT ON COLUMN mst_iv_p.etd_dt IS '船積予定日 // #MA.DT // Estimated date of loading';


COMMENT ON COLUMN mst_iv_p.dschrg_port_cd IS '船卸港ＣＤ // #MA.PORT_CD // Unloading port cd.';


COMMENT ON COLUMN mst_iv_p.eta_dt IS '船卸予定日 // #MA.DT // Estimated date of unloading';


COMMENT ON COLUMN mst_iv_p.via_port_cd IS '経由地ＣＤ // #MA.PORT_CD // Stopover point cd.';


COMMENT ON COLUMN mst_iv_p.via_schd_dt IS '経由予定日 // #MA.DT // Estimated stopover date';


COMMENT ON COLUMN mst_iv_p.sls_basis_typ IS '売上計上区分 // #MA.SLS_BASIS_TYP // Revenue recording type';


COMMENT ON COLUMN mst_iv_p.prov_basis_typ IS '支給計上区分 // #MA.PROV_BASIS_TYP // Supply recording type';


COMMENT ON COLUMN mst_iv_p.tterm_cd1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN mst_iv_p.tterm_rmrks1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN mst_iv_p.tterm_cd2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN mst_iv_p.tterm_rmrks2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN mst_iv_p.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_iv_p.ptax_cur_cd IS '納税通貨ＣＤ // #MA.CUR_CD // Taxpaying currency cd.';


COMMENT ON COLUMN mst_iv_p.tterm_cd3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN mst_iv_p.tterm_rmrks3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN mst_iv_p.bill_basis_dt IS '請求起算日 // #MA.DT // Billing base date';


COMMENT ON COLUMN mst_iv_p.rcv_schd_dt IS '入金予定日 // #MA.DT // Scheduled payment receipt date';


COMMENT ON COLUMN mst_iv_p.ttl_trd_cur_amt IS '取引通貨金額合計 // #MA.MONEY // Amount total (Transaction currency)';


COMMENT ON COLUMN mst_iv_p.xrate_inpt_flg IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN mst_iv_p.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_iv_p.ptax_xrate_inpt_flg IS '納税為替レート指定FLG // #MA.FLG // Taxpaying exchange rate specification flg.';


COMMENT ON COLUMN mst_iv_p.ptax_xrate IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN mst_iv_p.ttl_net_wt IS '純重量合計 // #MA.WT // Net weight total';


COMMENT ON COLUMN mst_iv_p.ttl_grss_wt IS '総重量合計 // #MA.WT // Total gross weight';


COMMENT ON COLUMN mst_iv_p.ttl_dim IS '容積合計 // #MA.DIM // Total volume';


COMMENT ON COLUMN mst_iv_p.iv_rmrks IS 'インボイス備考 // #MS.IV_RMRKS // Invoice remarks';


COMMENT ON COLUMN mst_iv_p.pl_rmrks IS 'パッキングリスト備考 // #MS.PL_RMRKS // Packing list remarks';


COMMENT ON COLUMN mst_iv_p.case_mrk1 IS 'ケースマーク１ // #MS.CASE_MRK // Case mark 1';


COMMENT ON COLUMN mst_iv_p.case_mrk2 IS 'ケースマーク２ // #MS.CASE_MRK // Case mark 2';


COMMENT ON COLUMN mst_iv_p.case_mrk3 IS 'ケースマーク３ // #MS.CASE_MRK // Case mark 3';


COMMENT ON COLUMN mst_iv_p.case_mrk4 IS 'ケースマーク４ // #MS.CASE_MRK // Case mark 4';


COMMENT ON COLUMN mst_iv_p.case_mrk5 IS 'ケースマーク５ // #MS.CASE_MRK // Case mark 5';


COMMENT ON COLUMN mst_iv_p.case_mrk6 IS 'ケースマーク６ // #MS.CASE_MRK // Case mark 6';


COMMENT ON COLUMN mst_iv_p.lc_no IS 'Ｌ／ＣＮＯ // #MA.LC_NO // L/C No.';


COMMENT ON COLUMN mst_iv_p.lc_dt IS 'Ｌ／Ｃ日付 // #MA.DT // L/C Date';


COMMENT ON COLUMN mst_iv_p.lc_rmrks IS 'Ｌ／Ｃ備考 // #MS.LC_RMRKS // L/C remarks';


COMMENT ON COLUMN mst_iv_p.bl_no IS 'Ｂ／ＬＮＯ // #MA.BL_NO // B/L No.';


COMMENT ON COLUMN mst_iv_p.bl_dt IS 'Ｂ／Ｌ日付 // #MA.DT // B/L date';


COMMENT ON COLUMN mst_iv_p.bl_rmrks IS 'Ｂ／Ｌ備考 // #MS.BL_RMRKS // B/L remarks';


COMMENT ON COLUMN mst_iv_p.ship_fr_lg_grp_cd IS '出荷元物流グループＣＤ // #MA.LG_GRP_CD // Shipping point distribution group cd.';


COMMENT ON COLUMN mst_iv_p.pl_reg_flg IS 'パッキングリスト登録ＦＬＧ // #MA.FLG // Packing list entry flg.';


COMMENT ON COLUMN mst_iv_p.pl_skip_flg IS 'パッキングリスト省略ＦＬＧ // #MA.FLG // Packing list omission flg.';


COMMENT ON COLUMN mst_iv_p.cmpl_flg IS '完了ＦＬＧ // #MA.FLG // Completed flg.';


COMMENT ON COLUMN mst_iv_p.non_cmpl_flg IS '完了対象外ＦＬＧ // #MA.FLG // Not to complete flg.';


COMMENT ON COLUMN mst_iv_p.iv_ship_flg IS 'インボイス単位出荷ＦＬＧ // #MA.FLG // Shipping invoice unit flg.';


COMMENT ON COLUMN mst_iv_p.iv_prnt_flg IS 'インボイス発行済ＦＬＧ // #MA.FLG // Invoice issued flg.';


COMMENT ON COLUMN mst_iv_p.pl_prnt_flg IS 'パッキングリスト発行済ＦＬＧ // #MA.FLG // Packing list issued flg.';


COMMENT ON COLUMN mst_iv_p.rcpt_iv_mng_no IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN mst_iv_p.rcpt_iv_no IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN mst_iv_p.pre_rcpt_iv_flg IS '受領インボイス仮登録ＦＬＧ // #MA.FLG // Purchase invoice temporary entry flg.';


COMMENT ON COLUMN mst_iv_p.intr_rmrks IS '内部備考 // #MS.IV_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_iv_p.sub_char1 IS '予備１ // #MS.IV_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_iv_p.sub_char2 IS '予備２ // #MS.IV_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_iv_p.sub_char3 IS '予備３ // #MS.IV_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_iv_p.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_iv_p.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_iv_p.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_iv_p.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_iv_p.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_iv_p.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_iv_p.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_iv_p.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_iv_p.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_iv_p.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

