\encoding UTF-8

COMMENT ON VIEW mst_dlv_inst_d IS '納入指示明細 // Delivery order details';


COMMENT ON COLUMN mst_dlv_inst_d.dlv_inst_d_no IS '納入指示明細ＮＯ // #MA.DLV_INST_D_NO // Delivery order details No.';


COMMENT ON COLUMN mst_dlv_inst_d.dlv_inst_no IS '納入指示ＮＯ // #MA.DLV_INST_NO // Delivery order No.';


COMMENT ON COLUMN mst_dlv_inst_d.dlv_inst_seq IS '納入指示連番 // #MA.SLIP_SEQ // Delivery order sequence number';


COMMENT ON COLUMN mst_dlv_inst_d.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_dlv_inst_d.purc_act_d_no IS '仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Purchase result details No.';


COMMENT ON COLUMN mst_dlv_inst_d.dlv_rqst_tm IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN mst_dlv_inst_d.purc_schd_dt IS '仕入予定日 // #MA.DT // Scheduled purchase date';


COMMENT ON COLUMN mst_dlv_inst_d.sync_flg IS '同時計上ＦＬＧ // #MA.FLG // Simultaneous recording flg.';


COMMENT ON COLUMN mst_dlv_inst_d.in_to_loc_cd IS '納入場所ＣＤ // #MA.LOC_CD // Delivery location cd.';


COMMENT ON COLUMN mst_dlv_inst_d.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_dlv_inst_d.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_dlv_inst_d.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_dlv_inst_d.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_dlv_inst_d.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_dlv_inst_d.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_dlv_inst_d.dlv_inst_print_d_rmrks IS '納入指示書明細備考 // #MS.DLV_INST_PRINT_D_RMRKS // Delivery order details remarks';


COMMENT ON COLUMN mst_dlv_inst_d.intr_rmrks IS '内部明細備考 // #MS.DLV_INST_D_INTR_RMRKS // Internal details remarks';


COMMENT ON COLUMN mst_dlv_inst_d.dlv_slip_d_rmrks IS '納品書明細備考 // #MA.TRD_D_RMRKS // Delivery note details remarks';


COMMENT ON COLUMN mst_dlv_inst_d.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mst_dlv_inst_d.dlv_sundry_flg IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN mst_dlv_inst_d.dlv_nm IS '納品先名 // #MA.BP_NM // Delivery destination name';


COMMENT ON COLUMN mst_dlv_inst_d.dlv_cntct_dpt IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN mst_dlv_inst_d.dlv_cntct_psn IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN mst_dlv_inst_d.dlv_zip_cd IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN mst_dlv_inst_d.dlv_addr1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN mst_dlv_inst_d.dlv_addr2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN mst_dlv_inst_d.dlv_addr3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN mst_dlv_inst_d.dlv_addr4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN mst_dlv_inst_d.dlv_tel IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN mst_dlv_inst_d.dlv_fax IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN mst_dlv_inst_d.dlv_lg_grp_cd IS '納品先物流グループＣＤ // #MA.LG_GRP_CD // Delivery destination distribution group cd.';


COMMENT ON COLUMN mst_dlv_inst_d.pri_prnt_flg IS '価格印字ＦＬＧ // #MA.FLG // Print price flg.';


COMMENT ON COLUMN mst_dlv_inst_d.tdlv_cd IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN mst_dlv_inst_d.tdlv_sundry_flg IS '配送先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN mst_dlv_inst_d.tdlv_nm IS '配送先名 // #MA.BP_NM // Receiving point name';


COMMENT ON COLUMN mst_dlv_inst_d.tdlv_cntct_dpt IS '配送先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN mst_dlv_inst_d.tdlv_cntct_psn IS '配送先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN mst_dlv_inst_d.tdlv_zip_cd IS '配送先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN mst_dlv_inst_d.tdlv_addr1 IS '配送先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN mst_dlv_inst_d.tdlv_addr2 IS '配送先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN mst_dlv_inst_d.tdlv_addr3 IS '配送先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN mst_dlv_inst_d.tdlv_addr4 IS '配送先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN mst_dlv_inst_d.tdlv_tel IS '配送先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN mst_dlv_inst_d.tdlv_fax IS '配送先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN mst_dlv_inst_d.tdlv_lg_grp_cd IS '配送先物流グループＣＤ // #MA.LG_GRP_CD // Receiving point distribution group cd.';


COMMENT ON COLUMN mst_dlv_inst_d.sub_char1 IS '予備１ // #MS.DLV_INST_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_dlv_inst_d.sub_char2 IS '予備２ // #MS.DLV_INST_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_dlv_inst_d.sub_char3 IS '予備３ // #MS.DLV_INST_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_dlv_inst_d.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_dlv_inst_d.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_dlv_inst_d.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_dlv_inst_d.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_dlv_inst_d.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_dlv_inst_d.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_dlv_inst_d.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_dlv_inst_d.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_dlv_inst_d.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_dlv_inst_d.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

