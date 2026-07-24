\encoding UTF-8

COMMENT ON VIEW mst_note IS '手形 // Notes';


COMMENT ON COLUMN mst_note.note_mng_no IS '手形管理ＮＯ // #MA.NOTE_MNG_NO // Note management No.';


COMMENT ON COLUMN mst_note.note_no IS '手形番号 // #MA.NOTE_NO // Note number';


COMMENT ON COLUMN mst_note.note_typ IS '手形区分 // #MA.NOTE_TYP // Note type';


COMMENT ON COLUMN mst_note.draw_dt IS '振出日 // #MA.DT // Drawing date';


COMMENT ON COLUMN mst_note.due_dt IS '支払期日 // #MA.DT // Payment due date';


COMMENT ON COLUMN mst_note.drawer_nm IS '振出人名 // #MA.DRAWER_NM // Drawer name';


COMMENT ON COLUMN mst_note.draw_bank_cd IS '振出銀行ＣＤ // #MA.BANK_CD // Drawing bank cd.';


COMMENT ON COLUMN mst_note.draw_branch_cd IS '振出支店ＣＤ // #MA.BANK_BRANCH_CD // Drawing branch cd.';


COMMENT ON COLUMN mst_note.endrsr IS '裏書人 // #MA.NOTE_ENDRSR // Endorser';


COMMENT ON COLUMN mst_note.accptr IS '引受人 // #MA.NOTE_ACCPTR // Accepted by';


COMMENT ON COLUMN mst_note.note_rsn_cd IS '手形理由ＣＤ // #MA.NOTE_RSN_CD // Note reason cd.';


COMMENT ON COLUMN mst_note.note_amt IS '手形額 // #MA.MONEY // Note amount';


COMMENT ON COLUMN mst_note.appl_amt IS '消込額 // #MA.MONEY // Reconciled amount';


COMMENT ON COLUMN mst_note.not_appl_bal IS '未消込残高 // #MA.MONEY // Unreconciled balance';


COMMENT ON COLUMN mst_note.susp_amt IS '仮受処理額 // #MA.MONEY // Suspense received process amount';


COMMENT ON COLUMN mst_note.adv_amt IS '前受処理額 // #MA.MONEY // Processed as advance received amount';


COMMENT ON COLUMN mst_note.mat_flg IS '決済ＦＬＧ // #MA.FLG // Settlement flg.';


COMMENT ON COLUMN mst_note.sub_char1 IS '予備１ // #MS.NOTE_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_note.sub_char2 IS '予備２ // #MS.NOTE_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_note.sub_char3 IS '予備３ // #MS.NOTE_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_note.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_note.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_note.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_note.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_note.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_note.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_note.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_note.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_note.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_note.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_note.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

