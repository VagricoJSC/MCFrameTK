\encoding UTF-8

COMMENT ON VIEW mst_ship_inst IS '出荷指図ヘッダ // Shipping order header';


COMMENT ON COLUMN mst_ship_inst.ship_inst_no IS '出荷指図ＮＯ // #MA.SHIP_INST_NO // Shipping order No.';


COMMENT ON COLUMN mst_ship_inst.ship_inst_rev IS '出荷指図改訂番号 // #MA.SLIP_REV // Shipping order rev. number';


COMMENT ON COLUMN mst_ship_inst.ship_fr_lg_grp_cd IS '出荷元物流グループＣＤ // #MA.LG_GRP_CD // Shipping point distribution group cd.';


COMMENT ON COLUMN mst_ship_inst.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_ship_inst.ship_schd_tm IS '出荷予定日時 // #MA.TM // Scheduled shipping date and time';


COMMENT ON COLUMN mst_ship_inst.dlv_schd_tm IS '納品予定日時 // #MA.TM // Scheduled delivery date and time';


COMMENT ON COLUMN mst_ship_inst.ship_wk_cd IS '出荷作業ＣＤ // #MA.SHIP_WK_CD // Shipping operation cd.';


COMMENT ON COLUMN mst_ship_inst.ship_term_cd IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN mst_ship_inst.inst_dpt_cd IS '指図部門ＣＤ // #MA.DPT_CD // Order dept. cd.';


COMMENT ON COLUMN mst_ship_inst.inst_usr_cd IS '指図担当者ＣＤ // #MA.USR_CD // Order PIC cd.';


COMMENT ON COLUMN mst_ship_inst.ship_inst_tm IS '出荷指図日時 // #MA.TM // Shipping order date and time';


COMMENT ON COLUMN mst_ship_inst.ship_to_lg_grp_cd IS '出荷先物流グループＣＤ // #MA.LG_GRP_CD // Receiving point distribution group cd.';


COMMENT ON COLUMN mst_ship_inst.ship_to_id_typ IS '送付先識別区分 // #MS.SHIP_TO_ID_TYP // Receiving point identification type';


COMMENT ON COLUMN mst_ship_inst.ship_to_id_cd IS '送付先識別ＣＤ // #MS.SHIP_TO_ID_CD // Receiving point identification cd.';


COMMENT ON COLUMN mst_ship_inst.ship_to_id_nm IS '送付先識別名 // #MS.SHIP_TO_ID_NM // Receiving point Identification name';


COMMENT ON COLUMN mst_ship_inst.ship_to_zip_cd IS '送付先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN mst_ship_inst.ship_to_addr1 IS '送付先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN mst_ship_inst.ship_to_addr2 IS '送付先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN mst_ship_inst.ship_to_addr3 IS '送付先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN mst_ship_inst.ship_to_addr4 IS '送付先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN mst_ship_inst.ship_to_cntct_dpt IS '送付先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN mst_ship_inst.ship_to_cntct_psn IS '送付先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN mst_ship_inst.ship_to_tel IS '送付先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN mst_ship_inst.ship_to_fax IS '送付先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN mst_ship_inst.ship_to_sundry_flg IS '送付先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN mst_ship_inst.via_dlv_typ IS '配送先経由区分 // #MA.VIA_DLV_TYP // Receiving point stopover type';


COMMENT ON COLUMN mst_ship_inst.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_ship_inst.pick_prnt_flg IS 'ピッキングリスト発行済ＦＬＧ // #MA.FLG // Picking list issued flg.';


COMMENT ON COLUMN mst_ship_inst.pick_prnt_tm IS 'ピッキングリスト発行日時 // #MA.TM // Picking list issue date and time';


COMMENT ON COLUMN mst_ship_inst.ship_inst_prnt_flg IS '出荷指図書発行済ＦＬＧ // #MA.FLG // Shipping order sheet issued flg.';


COMMENT ON COLUMN mst_ship_inst.ship_inst_prnt_tm IS '出荷指図書発行日時 // #MA.TM // Shipping order sheet issued date and time';


COMMENT ON COLUMN mst_ship_inst.ship_adv_prnt_flg IS '出荷案内書発行済ＦＬＧ // #MA.FLG // Shipping guide issued flg.';


COMMENT ON COLUMN mst_ship_inst.ship_adv_prnt_tm IS '出荷案内書発行日時 // #MA.TM // Shipping guide issue date and time';


COMMENT ON COLUMN mst_ship_inst.dlv_prnt_flg IS '納品書発行済ＦＬＧ // #MA.FLG // Delivery note issued flg.';


COMMENT ON COLUMN mst_ship_inst.dlv_prnt_tm IS '納品書発行日時 // #MA.TM // Delivery note issue date and time';


COMMENT ON COLUMN mst_ship_inst.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_ship_inst.intr_rmrks IS '内部備考 // #MS.SHIP_INST_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_ship_inst.inst_rmrks IS '指図備考 // #MS.SHIP_INST_RMRKS // Order remarks';


COMMENT ON COLUMN mst_ship_inst.sub_char1 IS '予備１ // #MS.SHIP_INST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_ship_inst.sub_char2 IS '予備２ // #MS.SHIP_INST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_ship_inst.sub_char3 IS '予備３ // #MS.SHIP_INST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_ship_inst.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_ship_inst.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_ship_inst.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_ship_inst.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_ship_inst.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_ship_inst.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_ship_inst.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_ship_inst.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_ship_inst.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_ship_inst.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

