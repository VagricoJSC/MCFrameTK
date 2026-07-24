\encoding UTF-8

COMMENT ON VIEW mst_purc_ret_act_p IS '仕入返品実績ヘッダ（改訂履歴） // Purchase return result header (Rev. history)';


COMMENT ON COLUMN mst_purc_ret_act_p.purc_ret_act_no IS '仕入返品実績ＮＯ // #MA.PURC_RET_ACT_NO // Purchase return result No.';


COMMENT ON COLUMN mst_purc_ret_act_p.purc_ret_act_rev IS '仕入返品実績改訂番号 // #MA.SLIP_REV // Purchase return result rev. number';


COMMENT ON COLUMN mst_purc_ret_act_p.purc_ret_schd_no IS '仕入返品予定ＮＯ // #MA.PURC_RET_SCHD_NO // Purchase return schedule No.';


COMMENT ON COLUMN mst_purc_ret_act_p.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_purc_ret_act_p.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_purc_ret_act_p.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_purc_ret_act_p.purc_usr_cd IS '購買担当者ＣＤ // #MA.USR_CD // Purchasing PIC cd.';


COMMENT ON COLUMN mst_purc_ret_act_p.purc_dpt_cd IS '購買部門ＣＤ // #MA.DPT_CD // Purchasing dept. cd.';


COMMENT ON COLUMN mst_purc_ret_act_p.wg_cd IS 'ＷＧ ＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_purc_ret_act_p.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_purc_ret_act_p.sppl_cntct_dpt IS '発注先部署 // #MA.BP_CNTCT_DPT // Supplier dept.';


COMMENT ON COLUMN mst_purc_ret_act_p.sppl_cntct_psn IS '発注先担当者 // #MA.BP_CNTCT_PSN // Supplier PIC';


COMMENT ON COLUMN mst_purc_ret_act_p.sppl_zip_cd IS '発注先郵便番号 // #MA.ZIP_CD // Supplier zip code';


COMMENT ON COLUMN mst_purc_ret_act_p.sppl_addr1 IS '発注先住所１ // #MA.ADDR // Supplier address 1';


COMMENT ON COLUMN mst_purc_ret_act_p.sppl_addr2 IS '発注先住所２ // #MA.ADDR // Supplier address 2';


COMMENT ON COLUMN mst_purc_ret_act_p.sppl_addr3 IS '発注先住所３ // #MA.ADDR // Supplier address 3';


COMMENT ON COLUMN mst_purc_ret_act_p.sppl_addr4 IS '発注先住所４ // #MA.ADDR // Supplier address 4';


COMMENT ON COLUMN mst_purc_ret_act_p.sppl_tel IS '発注先ＴＥＬ // #MA.TEL // Supplier TEL';


COMMENT ON COLUMN mst_purc_ret_act_p.sppl_fax IS '発注先ＦＡＸ // #MA.TEL // Supplier FAX';


COMMENT ON COLUMN mst_purc_ret_act_p.ret_sppl_nm IS '返品先名 // #MA.BP_NM // Return-to name';


COMMENT ON COLUMN mst_purc_ret_act_p.ret_sppl_cntct_dpt IS '返品先部署 // #MA.BP_CNTCT_DPT // Return-to dept.';


COMMENT ON COLUMN mst_purc_ret_act_p.ret_sppl_cntct_psn IS '返品先担当者 // #MA.BP_CNTCT_PSN // Return-to PIC';


COMMENT ON COLUMN mst_purc_ret_act_p.ret_sppl_cntct_psn_title IS '返品先担当者敬称 // #MA.BP_PSN_TITLE // Return-to PIC form of address';


COMMENT ON COLUMN mst_purc_ret_act_p.ret_sppl_zip_cd IS '返品先郵便番号 // #MA.ZIP_CD // Return-to zip code';


COMMENT ON COLUMN mst_purc_ret_act_p.ret_sppl_addr1 IS '返品先住所１ // #MA.ADDR // Return-to address 1';


COMMENT ON COLUMN mst_purc_ret_act_p.ret_sppl_addr2 IS '返品先住所２ // #MA.ADDR // Return-to address 2';


COMMENT ON COLUMN mst_purc_ret_act_p.ret_sppl_addr3 IS '返品先住所３ // #MA.ADDR // Return-to address 3';


COMMENT ON COLUMN mst_purc_ret_act_p.ret_sppl_addr4 IS '返品先住所４ // #MA.ADDR // Return-to address 4';


COMMENT ON COLUMN mst_purc_ret_act_p.ret_sppl_tel IS '返品先ＴＥＬ // #MA.TEL // Return-to TEL';


COMMENT ON COLUMN mst_purc_ret_act_p.ret_sppl_fax IS '返品先ＦＡＸ // #MA.TEL // Return-to FAX';


COMMENT ON COLUMN mst_purc_ret_act_p.purc_ret_dt IS '仕入返品日 // #MA.DT // Purchase return date';


COMMENT ON COLUMN mst_purc_ret_act_p.purc_ret_print_dt IS '返品票発行日時 // #MA.TM // Return slip issue date and time';


COMMENT ON COLUMN mst_purc_ret_act_p.purc_ret_print_flg IS '返品票発行済ＦＬＧ // #MA.FLG // Return slip issued flg.';


COMMENT ON COLUMN mst_purc_ret_act_p.last_purc_ret_print_rev IS '最新返品票改訂番号 // #MA.SLIP_REV // Latest return slip rev. number';


COMMENT ON COLUMN mst_purc_ret_act_p.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_purc_ret_act_p.rcpt_iv_no IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN mst_purc_ret_act_p.ref_rcpt_iv_no IS '対応受領インボイスＮＯ // #MA.IV_NO // Corresponding purchase I/V No.';


COMMENT ON COLUMN mst_purc_ret_act_p.tterm_cd1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN mst_purc_ret_act_p.tterm_rmrks1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN mst_purc_ret_act_p.tterm_cd2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN mst_purc_ret_act_p.tterm_rmrks2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN mst_purc_ret_act_p.tterm_cd3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN mst_purc_ret_act_p.tterm_rmrks3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN mst_purc_ret_act_p.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_purc_ret_act_p.intr_rmrks IS '内部備考 // #MS.PURC_RET_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_purc_ret_act_p.purc_ret_print_rmrks IS '仕入返品票備考 // #MS.PURC_RET_PRINT_RMRKS // Purchase return slip remarks';


COMMENT ON COLUMN mst_purc_ret_act_p.sub_char1 IS '予備項目１ // #MS.PURC_RET_ACT_SUB_CHAR1 // Spare column 1';


COMMENT ON COLUMN mst_purc_ret_act_p.sub_char2 IS '予備項目２ // #MS.PURC_RET_ACT_SUB_CHAR2 // Spare column 2';


COMMENT ON COLUMN mst_purc_ret_act_p.sub_char3 IS '予備項目３ // #MS.PURC_RET_ACT_SUB_CHAR3 // Spare column 3';


COMMENT ON COLUMN mst_purc_ret_act_p.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_purc_ret_act_p.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_purc_ret_act_p.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_purc_ret_act_p.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_purc_ret_act_p.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_purc_ret_act_p.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_purc_ret_act_p.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_purc_ret_act_p.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_purc_ret_act_p.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_purc_ret_act_p.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

