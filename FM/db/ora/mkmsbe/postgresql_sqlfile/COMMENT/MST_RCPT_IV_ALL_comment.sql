\encoding UTF-8

COMMENT ON TABLE mst_rcpt_iv_all IS '受領インボイス // Purchase invoice';


COMMENT ON COLUMN mst_rcpt_iv_all.rcpt_iv_mng_no IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN mst_rcpt_iv_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_rcpt_iv_all.rcpt_iv_rev IS '受領インボイス改訂番号 // #MA.SLIP_REV // Purchase invoice rev. number';


COMMENT ON COLUMN mst_rcpt_iv_all.rcpt_iv_no IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN mst_rcpt_iv_all.rcpt_iv_src_typ IS 'インボイス作成元区分 // #MS.RCPT_IV_SRC_TYP // Invoice creating source type';


COMMENT ON COLUMN mst_rcpt_iv_all.purc_schd_dt IS '仕入予定日 // #MA.DT // Scheduled purchase date';


COMMENT ON COLUMN mst_rcpt_iv_all.purc_dt IS '仕入日 // #MA.DT // Purchase date';


COMMENT ON COLUMN mst_rcpt_iv_all.iv_dt IS 'インボイス日付 // #MA.DT // Invoice date';


COMMENT ON COLUMN mst_rcpt_iv_all.purc_ac_schd_dt IS '仕入計上予定日 // #MA.DT // Scheduled purchase recording date';


COMMENT ON COLUMN mst_rcpt_iv_all.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_rcpt_iv_all.in_to_id_typ IS '納入先識別区分 // #MS.IN_TO_ID_TYP // Delivery destination identification type';


COMMENT ON COLUMN mst_rcpt_iv_all.in_to_id_cd IS '納入先識別ＣＤ // #MS.IN_TO_ID_CD // Delivery destination identification cd.';


COMMENT ON COLUMN mst_rcpt_iv_all.in_to_id_nm IS '納入先識別名 // #MS.IN_TO_ID_NM // Delivery destination identification name';


COMMENT ON COLUMN mst_rcpt_iv_all.in_to_zip_cd IS '納入先ＺＩＰ // #MA.ZIP_CD // Delivery destination ZIP';


COMMENT ON COLUMN mst_rcpt_iv_all.in_to_addr1 IS '納入先住所１ // #MA.ADDR // Delivery destination address1';


COMMENT ON COLUMN mst_rcpt_iv_all.in_to_addr2 IS '納入先住所２ // #MA.ADDR // Delivery destination address2';


COMMENT ON COLUMN mst_rcpt_iv_all.in_to_addr3 IS '納入先住所３ // #MA.ADDR // Delivery destination address3';


COMMENT ON COLUMN mst_rcpt_iv_all.in_to_addr4 IS '納入先住所４ // #MA.ADDR // Delivery destination address4';


COMMENT ON COLUMN mst_rcpt_iv_all.in_to_cntct_dpt IS '納入先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN mst_rcpt_iv_all.in_to_cntct_psn IS '納入先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN mst_rcpt_iv_all.in_to_tel IS '納入先ＴＥＬ // #MA.TEL // Delivery destination TEL';


COMMENT ON COLUMN mst_rcpt_iv_all.in_to_fax IS '納入先ＦＡＸ // #MA.TEL // Delivery destination FAX';


COMMENT ON COLUMN mst_rcpt_iv_all.in_to_cntry_cd IS '納入先国ＣＤ // #MA.CNTRY_CD // Delivery destination country cd.';


COMMENT ON COLUMN mst_rcpt_iv_all.in_to_sundry_flg IS '納入先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN mst_rcpt_iv_all.trnspt_cd IS '輸送方法ＣＤ // #MA.TRNSPT_CD // Transportation method cd.';


COMMENT ON COLUMN mst_rcpt_iv_all.vssl_flght IS '船名／便名 // #MA.VSSL_FLGHT // Ship/flight name';


COMMENT ON COLUMN mst_rcpt_iv_all.load_port_cd IS '船積港ＣＤ // #MA.PORT_CD // Loading port cd.';


COMMENT ON COLUMN mst_rcpt_iv_all.etd_dt IS '船積予定日 // #MA.DT // Estimated date of loading';


COMMENT ON COLUMN mst_rcpt_iv_all.dschrg_port_cd IS '船卸港ＣＤ // #MA.PORT_CD // Unloading port cd.';


COMMENT ON COLUMN mst_rcpt_iv_all.eta_dt IS '船卸予定日 // #MA.DT // Estimated date of unloading';


COMMENT ON COLUMN mst_rcpt_iv_all.via_port_cd IS '経由地ＣＤ // #MA.PORT_CD // Stopover point cd.';


COMMENT ON COLUMN mst_rcpt_iv_all.via_schd_dt IS '経由予定日 // #MA.DT // Estimated stopover date';


COMMENT ON COLUMN mst_rcpt_iv_all.tterm_cd1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN mst_rcpt_iv_all.tterm_rmrks1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN mst_rcpt_iv_all.tterm_cd2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN mst_rcpt_iv_all.tterm_rmrks2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN mst_rcpt_iv_all.tterm_cd3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN mst_rcpt_iv_all.tterm_rmrks3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN mst_rcpt_iv_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_rcpt_iv_all.ptax_cur_cd IS '納税通貨ＣＤ // #MA.CUR_CD // Taxpaying currency cd.';


COMMENT ON COLUMN mst_rcpt_iv_all.xrate_inpt_flg IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN mst_rcpt_iv_all.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_rcpt_iv_all.ptax_xrate IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN mst_rcpt_iv_all.ptax_xrate_inpt_flg IS '納税為替レート指定ＦＬＧ // #MA.FLG // Taxpaying exchange rate specification flg.';


COMMENT ON COLUMN mst_rcpt_iv_all.pay_basis_dt IS '支払起算日 // #MA.DT // Payment base date';


COMMENT ON COLUMN mst_rcpt_iv_all.pay_schd_dt IS '支払予定日 // #MA.DT // Scheduled payment date';


COMMENT ON COLUMN mst_rcpt_iv_all.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_rcpt_iv_all.rcpt_iv_rmrks IS '受領インボイス備考 // #MS.IV_RMRKS // Purchase invoice remarks';


COMMENT ON COLUMN mst_rcpt_iv_all.intr_rmrks IS '内部備考 // #MS.RCPT_IV_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_rcpt_iv_all.purc_cmpl_flg IS '仕入完了ＦＬＧ // #MA.FLG // Purchase completion flg.';


COMMENT ON COLUMN mst_rcpt_iv_all.sub_char1 IS '予備１ // #MS.RCPT_IV_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_rcpt_iv_all.sub_char2 IS '予備２ // #MS.RCPT_IV_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_rcpt_iv_all.sub_char3 IS '予備３ // #MS.RCPT_IV_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_rcpt_iv_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_rcpt_iv_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_rcpt_iv_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_rcpt_iv_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_rcpt_iv_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_rcpt_iv_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_rcpt_iv_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_rcpt_iv_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_rcpt_iv_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_rcpt_iv_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

