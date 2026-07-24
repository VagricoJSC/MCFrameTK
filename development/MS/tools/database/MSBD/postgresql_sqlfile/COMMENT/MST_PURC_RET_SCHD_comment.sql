\encoding UTF-8

COMMENT ON VIEW mst_purc_ret_schd IS '仕入返品予定ヘッダ // Purchase return schedule header';


COMMENT ON COLUMN mst_purc_ret_schd.purc_ret_schd_no IS '仕入返品予定ＮＯ // #MA.PURC_RET_SCHD_NO // Purchase return schedule No.';


COMMENT ON COLUMN mst_purc_ret_schd.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_purc_ret_schd.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_purc_ret_schd.purc_dpt_cd IS '購買部門ＣＤ // #MA.DPT_CD // Purchasing dept. cd.';


COMMENT ON COLUMN mst_purc_ret_schd.wg_cd IS 'ＷＧ ＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_purc_ret_schd.purc_usr_cd IS '購買担当者ＣＤ // #MA.USR_CD // Purchasing PIC cd.';


COMMENT ON COLUMN mst_purc_ret_schd.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_purc_ret_schd.sppl_cntct_dpt IS '発注先部署 // #MA.BP_CNTCT_DPT // Supplier dept.';


COMMENT ON COLUMN mst_purc_ret_schd.sppl_cntct_psn IS '発注先担当者 // #MA.BP_CNTCT_PSN // Supplier PIC';


COMMENT ON COLUMN mst_purc_ret_schd.sppl_zip_cd IS '発注先郵便番号 // #MA.ZIP_CD // Supplier zip code';


COMMENT ON COLUMN mst_purc_ret_schd.sppl_addr1 IS '発注先住所１ // #MA.ADDR // Supplier address 1';


COMMENT ON COLUMN mst_purc_ret_schd.sppl_addr2 IS '発注先住所２ // #MA.ADDR // Supplier address 2';


COMMENT ON COLUMN mst_purc_ret_schd.sppl_addr3 IS '発注先住所３ // #MA.ADDR // Supplier address 3';


COMMENT ON COLUMN mst_purc_ret_schd.sppl_addr4 IS '発注先住所４ // #MA.ADDR // Supplier address 4';


COMMENT ON COLUMN mst_purc_ret_schd.sppl_tel IS '発注先ＴＥＬ // #MA.TEL // Supplier TEL';


COMMENT ON COLUMN mst_purc_ret_schd.sppl_fax IS '発注先ＦＡＸ // #MA.TEL // Supplier FAX';


COMMENT ON COLUMN mst_purc_ret_schd.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_purc_ret_schd.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_purc_ret_schd.xrate_inpt_flg IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN mst_purc_ret_schd.ptax_xrate IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN mst_purc_ret_schd.ptax_xrate_inpt_flg IS '納税為替レート指定ＦＬＧ // #MA.FLG // Taxpaying exchange rate specification flg.';


COMMENT ON COLUMN mst_purc_ret_schd.ret_sppl_nm IS '返品先名 // #MA.BP_NM // Return-to name';


COMMENT ON COLUMN mst_purc_ret_schd.ret_sppl_cntct_dpt IS '返品先部署 // #MA.BP_CNTCT_DPT // Return-to dept.';


COMMENT ON COLUMN mst_purc_ret_schd.ret_sppl_cntct_psn IS '返品先担当者 // #MA.BP_CNTCT_PSN // Return-to PIC';


COMMENT ON COLUMN mst_purc_ret_schd.ret_sppl_cntct_psn_title IS '返品先担当者敬称 // #MA.BP_PSN_TITLE // Return-to PIC form of address';


COMMENT ON COLUMN mst_purc_ret_schd.ret_sppl_zip_cd IS '返品先郵便番号 // #MA.ZIP_CD // Return-to zip code';


COMMENT ON COLUMN mst_purc_ret_schd.ret_sppl_addr1 IS '返品先住所１ // #MA.ADDR // Return-to address 1';


COMMENT ON COLUMN mst_purc_ret_schd.ret_sppl_addr2 IS '返品先住所２ // #MA.ADDR // Return-to address 2';


COMMENT ON COLUMN mst_purc_ret_schd.ret_sppl_addr3 IS '返品先住所３ // #MA.ADDR // Return-to address 3';


COMMENT ON COLUMN mst_purc_ret_schd.ret_sppl_addr4 IS '返品先住所４ // #MA.ADDR // Return-to address 4';


COMMENT ON COLUMN mst_purc_ret_schd.ret_sppl_tel IS '返品先ＴＥＬ // #MA.TEL // Return-to TEL';


COMMENT ON COLUMN mst_purc_ret_schd.ret_sppl_fax IS '返品先ＦＡＸ // #MA.TEL // Return-to FAX';


COMMENT ON COLUMN mst_purc_ret_schd.reg_dt IS '登録日 // #MA.DT // Entry date';


COMMENT ON COLUMN mst_purc_ret_schd.schd_dt IS '仕入返品予定日 // #MA.DT // Scheduled purchase return date';


COMMENT ON COLUMN mst_purc_ret_schd.rcpt_iv_no IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN mst_purc_ret_schd.ref_rcpt_iv_no IS '対応受領インボイスＮＯ // #MA.IV_NO // Corresponding purchase I/V No.';


COMMENT ON COLUMN mst_purc_ret_schd.tterm_cd1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN mst_purc_ret_schd.tterm_rmrks1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN mst_purc_ret_schd.tterm_cd2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN mst_purc_ret_schd.tterm_rmrks2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN mst_purc_ret_schd.tterm_cd3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN mst_purc_ret_schd.tterm_rmrks3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN mst_purc_ret_schd.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_purc_ret_schd.intr_rmrks IS '内部備考 // #MS.PURC_RET_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_purc_ret_schd.purc_ret_print_rmrks IS '仕入返品票備考 // #MS.PURC_RET_PRINT_RMRKS // Purchase return slip remarks';


COMMENT ON COLUMN mst_purc_ret_schd.sub_char1 IS '予備１ // #MS.PURC_RET_SCHD_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_purc_ret_schd.sub_char2 IS '予備２ // #MS.PURC_RET_SCHD_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_purc_ret_schd.sub_char3 IS '予備３ // #MS.PURC_RET_SCHD_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_purc_ret_schd.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_purc_ret_schd.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_purc_ret_schd.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_purc_ret_schd.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_purc_ret_schd.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_purc_ret_schd.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_purc_ret_schd.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_purc_ret_schd.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_purc_ret_schd.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_purc_ret_schd.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

