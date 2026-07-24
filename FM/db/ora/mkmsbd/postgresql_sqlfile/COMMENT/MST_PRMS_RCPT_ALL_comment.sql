\encoding UTF-8

COMMENT ON TABLE mst_prms_rcpt_all IS '納期回答受領ヘッダ // Order promising result received header';


COMMENT ON COLUMN mst_prms_rcpt_all.prms_rcpt_no IS '納期回答受領ＮＯ // #MA.PRMS_RCPT_NO // Order promising result received No.';


COMMENT ON COLUMN mst_prms_rcpt_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_prms_rcpt_all.prms_rcpt_rev IS '納期回答受領改訂番号 // #MA.SLIP_REV // Order promising result received rev. number';


COMMENT ON COLUMN mst_prms_rcpt_all.prms_rcpt_grp_no IS '納期回答受領ＧＮＯ // #MS.PRMS_RCPT_GRP_NO // Order promising result received G No.';


COMMENT ON COLUMN mst_prms_rcpt_all.po_d_no IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN mst_prms_rcpt_all.arr_schd_refl_flg IS '入荷予定反映済ＦＬＧ // #MA.FLG // Receipt schedule applied flg.';


COMMENT ON COLUMN mst_prms_rcpt_all.arr_schd_refl_dt IS '入荷予定反映日 // #MA.DT // Receipt schedule applied date';


COMMENT ON COLUMN mst_prms_rcpt_all.prms_rcpt_dt IS '納期回答受領日 // #MA.DT // Order promising result received date';


COMMENT ON COLUMN mst_prms_rcpt_all.edi_flg IS 'ＥＤＩ　ＦＬＧ // #MA.FLG // EDI flg.';


COMMENT ON COLUMN mst_prms_rcpt_all.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_prms_rcpt_all.intr_rmrks IS '内部備考 // #MS.PRMS_RCPT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_prms_rcpt_all.sub_char1 IS '予備１ // #MS.PRMS_RCPT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_prms_rcpt_all.sub_char2 IS '予備２ // #MS.PRMS_RCPT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_prms_rcpt_all.sub_char3 IS '予備３ // #MS.PRMS_RCPT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_prms_rcpt_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_prms_rcpt_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_prms_rcpt_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_prms_rcpt_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_prms_rcpt_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_prms_rcpt_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_prms_rcpt_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_prms_rcpt_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_prms_rcpt_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_prms_rcpt_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

