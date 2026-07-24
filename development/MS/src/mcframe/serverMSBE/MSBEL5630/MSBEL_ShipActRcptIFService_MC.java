package mcframe.serverMSBE.MSBEL5630;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMSBE.MSBEL5630.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5540.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ShipActRcptIFService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ShipActRcptIFService_MC extends MSBEL_ShipActRcptIFService_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 出荷実績オペレーション用のチェック処理です。<br>
	 */
	public class Chk01 extends MSBEL_ShipActRcptIFService_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			// 明細にエラーがある場合、ヘッダのフラグを立てる
			setHdrErrFlg(up1(), up2(), up3());
		
			// この時点でエラーがある場合は、以降の処理（チェック処理、および取込処理）を中断する
			if (!up0().err_flg()) {
				MCList<ShipActIF_HdrR> l = up1().subList(ShipActIF_HdrR.$err_flg, false);

				// 出荷実績チェック処理
				// 削除用チェック処理でエラーとならなかった行のみを登録・更新用チェックに渡すため、削除用チェックを先に実行する
				callShipActChk02Srv(l);
				callShipActChk01Srv(l);
			}
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック
			msgL.addAll(chkUpdCntrShipAct());
			msgL.addAll(chkUpdCntrShipPr());

			// 明細に対するデータ補完
			msgL.addAll(cmplShipActD());

			// DACチェック
			if (!up0().is_src_batch_flg()) {
				// バッチから実行した場合に、ＤＡＣの更新権限チェックを行わない
				msgL.addAll(chkLgGrpDac());
			}

			return msgL;
		}

		/**
		 * 出荷元物流Ｇに対するDACチェック
		 */
		protected MCMessageList chkLgGrpDac() {
			MCList<ShipActIF_HdrR> l = up1().subList(ShipActIF_HdrR.$err_flg, false);
			return checkWritableLgGrpCdDac(l, ShipActIF_HdrR.$ship_fr_lg_grp_cd);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// 条件付必須チェック
			msgL.addAll(chkReq());

			// 条件付妥当性チェック
			msgL.addAll(chkValid());

			return msgL;
		}

		@Override
		protected MCMessageList updCntChkReq() {
			MCMessageList msgL = super.updCntChkReq();
			MCIndexKey idx = up3().createIndex(ShipActIF_DtlR.$hdr_dtl_peg_no);
			up1().forEach(r -> {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					msgL.addAll(check(r, ShipActIF_HdrR.$ship_act_no, new FXUCL_RequiredValidater()));
					if (up0().upd_cntr_chk_flg()) {
						msgL.addAll(check(r, ShipActIF_HdrR.$ship_act_upd_cntr, new FXUCL_RequiredValidater()));
					}
				}
				if (up0().upd_cntr_chk_flg() && !r.uplnd_flg()) {
					MCList<ShipActIF_CntrR> upL = up3().subList(idx, r.hdr_dtl_peg_no());
					if (upL != null && !upL.isEmpty()) {
						msgL.addAll(check(upL, ShipActIF_CntrR.$ship_alloc_sts_no, new FXUCL_RequiredValidater()));
						msgL.addAll(check(upL, ShipActIF_CntrR.$ship_pr_no, new FXUCL_RequiredValidater()));
						msgL.addAll(check(upL, ShipActIF_CntrR.$ship_pr_upd_cntr, new FXUCL_RequiredValidater()));
					}
				}
			});
			return msgL;
		}

		/**
		 * 条件付必須チェック
		 */
		protected MCMessageList chkReq() {
			MCMessageList msgL = new MCMessageList();
			for (ShipActIF_DtlR r : up2()) {
				// 後続の出荷実績SVとチェック仕様が異なるのでここでチェックする
				if (isNull(r.ship_alloc_sts_no())
					&& MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					msgL.addAll(check(r, ShipActIF_DtlR.$trd_ptn_typ, new FXUCL_RequiredValidater()));
				}
			}
			return msgL;
		}

		/**
		 * 条件付妥当性チェック
		 */
		protected MCMessageList chkValid() {
			MCMessageList msgL = new MCMessageList();
			for (ShipActIF_DtlR r : up2()) {
				// 後続の出荷実績SVとチェック仕様が異なるのでここでチェックする
				if (isNull(r.ship_alloc_sts_no())
					&& MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
					&& isNull(r.trd_cd())
					&& !isNull(r.trd_ptn_typ())) {
					if (isNull(getDefTrdR(r.trd_ptn_typ()))) {
						msgL.add(new MCMessage(r, null, MSBEL0252, r.trd_ptn_typ(), toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}

		/**
		 * 出荷進捗に対する更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntrShipPr() {
			MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
			MST_SHIP_ACT_D_R t2 = MST_SHIP_ACT_D_R.create("T2");
			MST_SHIP_ALLOC_STS_R t3 = MST_SHIP_ALLOC_STS_R.create("T3");
			MST_SHIP_SCHD_R t4 = MST_SHIP_SCHD_R.create("T4");
			MST_SHIP_PR_R t5 = MST_SHIP_PR_R.create("T5");
			
			MCMessageList msgL = new MCMessageList();
			MCList<ShipActIF_HdrR> hdrL = up1().subList(ShipActIF_HdrR.$err_flg, false);

			// 更新カウンタチェック
			if (up0().upd_cntr_chk_flg()) {
				if (hdrL.isEmpty()) {
					return msgL;
				}
				MCList<ShipActIF_CntrR> cntrL = MCList.create(ShipActIF_CntrR.class);
				MCIndexKey cntrIdx = up3().createIndex(ShipActIF_CntrR.$hdr_dtl_peg_no);
				hdrL.forEach(r -> {
					cntrL.addAll(up3().subList(cntrIdx, r.hdr_dtl_peg_no()));
				});
				MCList<MST_SHIP_PR_R> l = MCList.create(MST_SHIP_PR_R.class);
				MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t1);
				l_bldr.setSelect(t1.ship_pr_no, t1.upd_cntr);
				dbSelectKeyForUpdateNoWait("MSBEL5630_MST_SHIP_PR_S01", l, l_bldr, cntrL);

				MCIndexKey idx = l.createIndex(MST_SHIP_PR_R.$ship_pr_no);
				for (ShipActIF_CntrR r :cntrL) {
					msgL.addAll(checkUpdCntrNE(r, ShipActIF_CntrR.$ship_pr_upd_cntr, l.getFirst(idx, r.ship_pr_no())));
				}
			}
			else {
				// カウンタチェックしない場合は、ヘッダの出荷実績NOをもとに出荷進捗をロックする
				MCList<ShipActIF_HdrR> uplndL = hdrL.subList(ShipActIF_HdrR.$uplnd_flg, false);
				if (uplndL.isEmpty()) {
					return msgL;
				}
				MCList<MST_SHIP_ACT_D_R> dbc = MCList.create(MST_SHIP_ACT_D_R.class);
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t2);
				dbc_bldr.setSelect(t2.ship_act_no, t3.ship_alloc_sts_no, t5.ship_pr_no);
				dbc_bldr.addInnerJoin(t3, t3.ship_alloc_sts_no.eq(t2.ship_alloc_sts_no));
				dbc_bldr.addInnerJoin(t4, t4.ship_inst_d_no.eq(t3.ship_inst_d_no).or(t4.ship_schd_no.eq(t3.ship_schd_no)));
				dbc_bldr.addInnerJoin(t5, t5.ship_pr_no.eq(t4.ship_pr_no));
				dbc_bldr.setWhere(t2.ship_act_no.eq(bind("ship_act_no")));
				dbc_bldr.setLockTable(t5.ship_pr_no);
				dbSelectForUpdateNoWait("MSBEL5630_MST_SHIP_ACT_D_S01", dbc, dbc_bldr, uplndL);

				// ShipAct_InptChk01、02でのチェック回避の為、up3()に設定する
				MCIndexKey idx = dbc.createIndex("ship_act_no");
				uplndL.forEach(r -> {
					MCList<MST_SHIP_ACT_D_R> actDL = dbc.subList(idx, r.ship_act_no());
					actDL.forEach(rr -> {
						ShipActIF_CntrR cntrR = up3().add();
						cntrR.hdr_dtl_peg_no(r.hdr_dtl_peg_no());
						cntrR.ship_alloc_sts_no(rr.ship_alloc_sts_no());
						cntrR.ship_pr_no(rr.getString("ship_pr_no"));
					});
				});
			}
			return msgL;
		}

		/**
		 * 出荷実績に対する更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntrShipAct() {
			MST_SHIP_ACT_R t = MST_SHIP_ACT_R.create("T");
			MCMessageList msgL = new MCMessageList();

			// 新規以外
			MCList<ShipActIF_HdrR> upL = up1().subList(r -> !MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()));
			if (upL.isEmpty()) {
				return msgL;
			}
			MCList<MST_SHIP_ACT_R> dbc = MCList.create(MST_SHIP_ACT_R.class);
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.ship_act_no, t.intr_rmrks, t.sub_char1, t.sub_char2, t.sub_char3, t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBEL5630_MST_SHIP_ACT_S01", dbc, dbc_bldr, upL);

			// 更新カウンタチェック
			if (up0().upd_cntr_chk_flg() ) {
				MCIndexKey idx = dbc.createIndex(MST_SHIP_ACT_R.$ship_act_no);
				for (ShipActIF_HdrR r :upL) {
					msgL.addAll(checkUpdCntrNE(r, ShipActIF_HdrR.$ship_act_upd_cntr, dbc.getFirst(idx, r.ship_act_no())));
				}
			}

			// xxx更新フラグに対応する項目に対して、データ補完を行う
			MCIndexKey idx = dbc.createIndex(MST_SHIP_ACT_R.$ship_act_no);
			upL.forEach(r -> {
				MST_SHIP_ACT_R actR = dbc.getFirst(idx, r.ship_act_no());
				// データ補完
				r.intr_rmrks(compVal(r.intr_rmrks_upd_flg(), r.intr_rmrks(), actR.intr_rmrks(), null));
				r.sub_char1(compVal(r.sub_char1_upd_flg(), r.sub_char1(), actR.sub_char1(), null));
				r.sub_char2(compVal(r.sub_char2_upd_flg(), r.sub_char2(), actR.sub_char2(), null));
				r.sub_char3(compVal(r.sub_char3_upd_flg(), r.sub_char3(), actR.sub_char3(), null));
			});
			// 出荷実績、出荷進捗の両方で更新カウンタエラーになるのを回避するためエラーFLGをセットする
			setErrFlg(msgL);
			
			return msgL;
		}

		/**
		 * 上り電文項目に対してデータ補完を行う
		 */
		protected MCMessageList cmplShipActD() {
			MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
			MCMessageList msgL = new MCMessageList();

			// 更新のみ
			MCList<ShipActIF_DtlR> upL = up2().subList(r -> MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()));
			if (!upL.isEmpty()) {
				MCList<MST_SHIP_ACT_D_R> dbc = MCList.create(MST_SHIP_ACT_D_R.class);
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setSelect(t.ship_act_d_no, t.intr_d_rmrks, t.sub_char1, t.sub_char2, t.sub_char3);
				dbSelectKey("MSBEL5630_MST_SHIP_ACT_D_S02", dbc, dbc_bldr, upL);

				// xxx更新フラグに対応する項目に対して、データ補完を行う
				MCIndexKey idx = dbc.createIndex(MST_SHIP_ACT_D_R.$ship_act_d_no);
				upL.forEach(r -> {
					MST_SHIP_ACT_D_R actDR = dbc.getFirst(idx, r.ship_act_d_no());
					// データ補完
					r.arr_cnt_rmrks(compVal(r.arr_cnt_rmrks_upd_flg(), r.arr_cnt_rmrks(), actDR.arr_cnt_rmrks(), null));
					r.intr_d_rmrks(compVal(r.intr_d_rmrks_upd_flg(), r.intr_d_rmrks(), actDR.intr_d_rmrks(), null));
					r.sub_char1(compVal(r.sub_char1_upd_flg(), r.sub_char1(), actDR.sub_char1(), null));
					r.sub_char2(compVal(r.sub_char2_upd_flg(), r.sub_char2(), actDR.sub_char2(), null));
					r.sub_char3(compVal(r.sub_char3_upd_flg(), r.sub_char3(), actDR.sub_char3(), null));
				});
			}

			// NULLに対する補完
			for (ShipActIF_DtlR r : up2()) {
				if (isNull(r.ship_alloc_sts_no())
					&& MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
					&& isNull(r.trd_cd())
					&& !isNull(r.trd_ptn_typ())) {
					MAM_TRD_R trdR = getDefTrdR(r.trd_ptn_typ());
					if (!isNull(trdR)) {
						r.trd_cd(trdR.trd_cd());
					}
				}
				r.ship_str_ln_cd(nvl(r.ship_str_ln_cd(), MAC_STR.NULL_VAL.value()));
				r.dlv_str_ln_cd(nvl(r.dlv_str_ln_cd(), MAC_STR.NULL_VAL.value()));
				r.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
				r.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
				r.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
				r.sno1(nvl(r.sno1(), MAC_STR.NULL_VAL.value()));
				r.sno2(nvl(r.sno2(), MAC_STR.NULL_VAL.value()));
				r.sno3(nvl(r.sno3(), MAC_STR.NULL_VAL.value()));
				r.sno4(nvl(r.sno4(), MAC_STR.NULL_VAL.value()));
				r.stk_arrv_bp_cd(nvl(r.stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
				r.gd_cd(nvl(r.gd_cd(), getDefaultFeedStkGd().gd_cd()));
				r.stk_bp_cd(nvl(r.stk_bp_cd(), MAC_STR.NULL_VAL.value()));
			}
			return msgL;
		}

		/**
		 * 更新ＦＬＧに従い、上り電文の値、または、更新前の値を更新結果に決めます。
		 */
		private String compVal(boolean updFlg, String upVal, String dbVal, String defVal) {
			if (updFlg){
				return nvl(upVal, defVal);
			}
			return dbVal;
		}

		/**
		 * 出荷実績SV 登録・更新前チェック処理を実行する
		 */
		protected void callShipActChk01Srv(MCList<ShipActIF_HdrR> l) {
			// 新規、更新が対象
			MCList<ShipActIF_HdrR> hdrL = l.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			if (hdrL.isEmpty()) {
				return;
			}

			MCIndexKey dtlIdx = up2().createIndex(ShipActIF_DtlR.$hdr_dtl_peg_no);
			MCIndexKey cntrIdx = up3().createIndex(ShipActIF_CntrR.$hdr_dtl_peg_no);
			MCList<ShipActIF_DtlR> dtlL = MCList.create(ShipActIF_DtlR.class);
			MCList<ShipActIF_CntrR> cntrL = MCList.create(ShipActIF_CntrR.class);
			hdrL.sort(ShipActIF_HdrR.$row_seq);	// 上りの順に並び替え
			hdrL.forEach(r -> {
				dtlL.addAll(up2().subList(dtlIdx, r.hdr_dtl_peg_no()));
				cntrL.addAll(up3().subList(cntrIdx, r.hdr_dtl_peg_no()));
			});
			dtlL.sort(ShipActIF_DtlR.$row_seq);	// 上りの順に並び替え
			
			// InptChk01の上り電文を設定
			up_SA_v0_0(v0_up0, hdrL);
			up_SA_v0_1(v0_up1, dtlL);
			up_SA_v0_2(v0_up2, cntrL);
			// 削除用チェックでエラーとならなかった削除行をup3に設定する（マイナス在庫チェック時に使用可能在庫として扱われる）
			MCList<ShipActIF_HdrR> delL = l.subList(r -> MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && !r.err_flg());
			MCList<ShipActIF_DtlR> delDtlL = MCList.create(ShipActIF_DtlR.class);
			delL.forEach(r -> {
				delDtlL.addAll(up2().subList(dtlIdx, r.hdr_dtl_peg_no()));
			});
			up_SA_v0_3(v0_up3, delDtlL);

			if (!v0.up0().isEmpty()) {
				v0.exec();

				// InptChk01の下り電文に置き換える
				String[] destColsHdr = {
						ShipActIF_HdrR.$data_crud_typ, ShipActIF_HdrR.$ship_act_no,
						ShipActIF_HdrR.$ship_inst_no, ShipActIF_HdrR.$ac_dt,
						ShipActIF_HdrR.$ship_tm, ShipActIF_HdrR.$dlv_tm,
						ShipActIF_HdrR.$can_ac_dt, ShipActIF_HdrR.$rqst_dpt_cd,
						ShipActIF_HdrR.$rqst_usr_cd, ShipActIF_HdrR.$ship_fr_lg_grp_cd,
						ShipActIF_HdrR.$wg_cd, ShipActIF_HdrR.$ship_term_cd,
						ShipActIF_HdrR.$ship_dpt_cd, ShipActIF_HdrR.$ship_usr_cd,
						ShipActIF_HdrR.$ship_to_lg_grp_cd, ShipActIF_HdrR.$cst_cd,
						ShipActIF_HdrR.$ship_to_id_typ, ShipActIF_HdrR.$ship_to_id_cd,
						ShipActIF_HdrR.$ship_to_id_nm, ShipActIF_HdrR.$ship_to_zip_cd,
						ShipActIF_HdrR.$ship_to_addr1, ShipActIF_HdrR.$ship_to_addr2,
						ShipActIF_HdrR.$ship_to_addr3, ShipActIF_HdrR.$ship_to_addr4,
						ShipActIF_HdrR.$ship_to_cntct_dpt,
						ShipActIF_HdrR.$ship_to_cntct_psn, ShipActIF_HdrR.$ship_to_tel,
						ShipActIF_HdrR.$ship_to_fax, ShipActIF_HdrR.$ship_to_sundry_flg,
						ShipActIF_HdrR.$via_dlv_typ, ShipActIF_HdrR.$iv_no,
						ShipActIF_HdrR.$dlv_slip_no, ShipActIF_HdrR.$uplnd_flg,
						ShipActIF_HdrR.$intr_rmrks, ShipActIF_HdrR.$sub_char1,
						ShipActIF_HdrR.$sub_char2, ShipActIF_HdrR.$sub_char3,
						ShipActIF_HdrR.$dlv_slip_prnt_flg,
						ShipActIF_HdrR.$ship_adv_prnt_flg,
						ShipActIF_HdrR.$lot_chk_off_flg,
				};
				String[] srcColsHdr = {
						ShipAct_InptChk01_HdrR.$data_crud_typ,
						ShipAct_InptChk01_HdrR.$ship_act_no,
						ShipAct_InptChk01_HdrR.$ship_inst_no,
						ShipAct_InptChk01_HdrR.$ac_dt, ShipAct_InptChk01_HdrR.$ship_tm,
						ShipAct_InptChk01_HdrR.$dlv_tm, ShipAct_InptChk01_HdrR.$can_ac_dt,
						ShipAct_InptChk01_HdrR.$rqst_dpt_cd,
						ShipAct_InptChk01_HdrR.$rqst_usr_cd,
						ShipAct_InptChk01_HdrR.$ship_fr_lg_grp_cd,
						ShipAct_InptChk01_HdrR.$wg_cd,
						ShipAct_InptChk01_HdrR.$ship_term_cd,
						ShipAct_InptChk01_HdrR.$ship_dpt_cd,
						ShipAct_InptChk01_HdrR.$ship_usr_cd,
						ShipAct_InptChk01_HdrR.$ship_to_lg_grp_cd,
						ShipAct_InptChk01_HdrR.$cst_cd,
						ShipAct_InptChk01_HdrR.$ship_to_id_typ,
						ShipAct_InptChk01_HdrR.$ship_to_id_cd,
						ShipAct_InptChk01_HdrR.$ship_to_id_nm,
						ShipAct_InptChk01_HdrR.$ship_to_zip_cd,
						ShipAct_InptChk01_HdrR.$ship_to_addr1,
						ShipAct_InptChk01_HdrR.$ship_to_addr2,
						ShipAct_InptChk01_HdrR.$ship_to_addr3,
						ShipAct_InptChk01_HdrR.$ship_to_addr4,
						ShipAct_InptChk01_HdrR.$ship_to_cntct_dpt,
						ShipAct_InptChk01_HdrR.$ship_to_cntct_psn,
						ShipAct_InptChk01_HdrR.$ship_to_tel,
						ShipAct_InptChk01_HdrR.$ship_to_fax,
						ShipAct_InptChk01_HdrR.$ship_to_sundry_flg,
						ShipAct_InptChk01_HdrR.$via_dlv_typ,
						ShipAct_InptChk01_HdrR.$iv_no,
						ShipAct_InptChk01_HdrR.$dlv_slip_no,
						ShipAct_InptChk01_HdrR.$uplnd_flg,
						ShipAct_InptChk01_HdrR.$intr_rmrks,
						ShipAct_InptChk01_HdrR.$sub_char1,
						ShipAct_InptChk01_HdrR.$sub_char2,
						ShipAct_InptChk01_HdrR.$sub_char3,
						ShipAct_InptChk01_HdrR.$dlv_slip_prnt_flg,
						ShipAct_InptChk01_HdrR.$ship_adv_prnt_flg,
						ShipAct_InptChk01_HdrR.$lot_chk_off_flg,
				};
				copyByPegNo(hdrL, v0.down0(), ShipActIF_HdrR.$hdr_dtl_peg_no, destColsHdr, ShipAct_InptChk01_HdrR.$peg_no, srcColsHdr);
				copyErrFlg(hdrL, v0.down0(), ShipActIF_HdrR.$hdr_dtl_peg_no, ShipAct_InptChk01_HdrR.$peg_no);

				String[] destColsDtl = {
						ShipActIF_DtlR.$data_crud_typ, ShipActIF_DtlR.$ship_act_d_no,
						ShipActIF_DtlR.$disp_seq, ShipActIF_DtlR.$ship_alloc_sts_no,
						ShipActIF_DtlR.$trd_cd, ShipActIF_DtlR.$trd_ptn_typ,
						ShipActIF_DtlR.$ship_loc_cd, ShipActIF_DtlR.$ship_str_ln_cd,
						ShipActIF_DtlR.$dlv_id_typ, ShipActIF_DtlR.$dlv_id_cd,
						ShipActIF_DtlR.$dlv_id_nm, ShipActIF_DtlR.$dlv_zip_cd,
						ShipActIF_DtlR.$dlv_addr1, ShipActIF_DtlR.$dlv_addr2,
						ShipActIF_DtlR.$dlv_addr3, ShipActIF_DtlR.$dlv_addr4,
						ShipActIF_DtlR.$dlv_cntct_dpt, ShipActIF_DtlR.$dlv_cntct_psn,
						ShipActIF_DtlR.$dlv_tel, ShipActIF_DtlR.$dlv_fax,
						ShipActIF_DtlR.$dlv_sundry_flg, ShipActIF_DtlR.$dlv_str_ln_cd,
						ShipActIF_DtlR.$pri_prnt_flg, ShipActIF_DtlR.$itm_cd,
						ShipActIF_DtlR.$itm_sub1, ShipActIF_DtlR.$itm_sub2,
						ShipActIF_DtlR.$itm_sub3, ShipActIF_DtlR.$itm_nm,
						ShipActIF_DtlR.$iv_itm_nm, ShipActIF_DtlR.$sundry_itm_flg,
						ShipActIF_DtlR.$stk_mng_typ, ShipActIF_DtlR.$sno1_mng_typ,
						ShipActIF_DtlR.$sno2_mng_typ, ShipActIF_DtlR.$sno3_mng_typ,
						ShipActIF_DtlR.$sno4_mng_typ, ShipActIF_DtlR.$sno1,
						ShipActIF_DtlR.$sno2, ShipActIF_DtlR.$sno3, ShipActIF_DtlR.$sno4,
						ShipActIF_DtlR.$lot_no, ShipActIF_DtlR.$sublot_no,
						ShipActIF_DtlR.$ver_no, ShipActIF_DtlR.$stk_arrv_bp_cd,
						ShipActIF_DtlR.$gd_cd, ShipActIF_DtlR.$quality_typ,
						ShipActIF_DtlR.$stk_id_typ, ShipActIF_DtlR.$stk_bp_cd,
						ShipActIF_DtlR.$trd_unit_qty, ShipActIF_DtlR.$trd_unit_cd,
						ShipActIF_DtlR.$base_unit_qty, ShipActIF_DtlR.$base_unit_cd,
						ShipActIF_DtlR.$skip_chk_ship_flg, ShipActIF_DtlR.$rsn_cd,
						ShipActIF_DtlR.$bd_dpt_cd, ShipActIF_DtlR.$bd_dpt_nm,
						ShipActIF_DtlR.$cst_po_no, ShipActIF_DtlR.$cst_po_d_no,
						ShipActIF_DtlR.$cst_dlv_inst_no,
						ShipActIF_DtlR.$cst_dlv_inst_d_no, ShipActIF_DtlR.$cst_itm_cd,
						ShipActIF_DtlR.$cst_itm_nm, ShipActIF_DtlR.$arr_cnt_rmrks,
						ShipActIF_DtlR.$trd_rmrks, ShipActIF_DtlR.$trd_d_rmrks,
						ShipActIF_DtlR.$intr_d_rmrks, ShipActIF_DtlR.$io_schd_pr_no,
						ShipActIF_DtlR.$sub_char1, ShipActIF_DtlR.$sub_char2,
						ShipActIF_DtlR.$sub_char3, ShipActIF_DtlR.$dlv_slip_d_no,
						ShipActIF_DtlR.$dlv_slip_no, ShipActIF_DtlR.$abort_flg,
						ShipActIF_DtlR.$non_upd_flg, ShipActIF_DtlR.$prov_typ,
						ShipActIF_DtlR.$prov_basis_typ, ShipActIF_DtlR.$wms_flg,
						ShipActIF_DtlR.$ext_sys_cd, ShipActIF_DtlR.$ext_ship_act_no,
				};
				String[] srcColsDtl = {
						ShipAct_InptChk01_DtlR.$data_crud_typ,
						ShipAct_InptChk01_DtlR.$ship_act_d_no,
						ShipAct_InptChk01_DtlR.$disp_seq,
						ShipAct_InptChk01_DtlR.$ship_alloc_sts_no,
						ShipAct_InptChk01_DtlR.$trd_cd,
						ShipAct_InptChk01_DtlR.$trd_ptn_typ,
						ShipAct_InptChk01_DtlR.$ship_loc_cd,
						ShipAct_InptChk01_DtlR.$ship_str_ln_cd,
						ShipAct_InptChk01_DtlR.$dlv_id_typ,
						ShipAct_InptChk01_DtlR.$dlv_id_cd,
						ShipAct_InptChk01_DtlR.$dlv_id_nm,
						ShipAct_InptChk01_DtlR.$dlv_zip_cd,
						ShipAct_InptChk01_DtlR.$dlv_addr1,
						ShipAct_InptChk01_DtlR.$dlv_addr2,
						ShipAct_InptChk01_DtlR.$dlv_addr3,
						ShipAct_InptChk01_DtlR.$dlv_addr4,
						ShipAct_InptChk01_DtlR.$dlv_cntct_dpt,
						ShipAct_InptChk01_DtlR.$dlv_cntct_psn,
						ShipAct_InptChk01_DtlR.$dlv_tel, ShipAct_InptChk01_DtlR.$dlv_fax,
						ShipAct_InptChk01_DtlR.$dlv_sundry_flg,
						ShipAct_InptChk01_DtlR.$dlv_str_ln_cd,
						ShipAct_InptChk01_DtlR.$pri_prnt_flg,
						ShipAct_InptChk01_DtlR.$itm_cd, ShipAct_InptChk01_DtlR.$itm_sub1,
						ShipAct_InptChk01_DtlR.$itm_sub2,
						ShipAct_InptChk01_DtlR.$itm_sub3, ShipAct_InptChk01_DtlR.$itm_nm,
						ShipAct_InptChk01_DtlR.$iv_itm_nm,
						ShipAct_InptChk01_DtlR.$sundry_itm_flg,
						ShipAct_InptChk01_DtlR.$stk_mng_typ,
						ShipAct_InptChk01_DtlR.$sno1_mng_typ,
						ShipAct_InptChk01_DtlR.$sno2_mng_typ,
						ShipAct_InptChk01_DtlR.$sno3_mng_typ,
						ShipAct_InptChk01_DtlR.$sno4_mng_typ,
						ShipAct_InptChk01_DtlR.$sno1, ShipAct_InptChk01_DtlR.$sno2,
						ShipAct_InptChk01_DtlR.$sno3, ShipAct_InptChk01_DtlR.$sno4,
						ShipAct_InptChk01_DtlR.$lot_no, ShipAct_InptChk01_DtlR.$sublot_no,
						ShipAct_InptChk01_DtlR.$ver_no,
						ShipAct_InptChk01_DtlR.$stk_arrv_bp_cd,
						ShipAct_InptChk01_DtlR.$gd_cd,
						ShipAct_InptChk01_DtlR.$quality_typ,
						ShipAct_InptChk01_DtlR.$stk_id_typ,
						ShipAct_InptChk01_DtlR.$stk_bp_cd,
						ShipAct_InptChk01_DtlR.$trd_unit_qty,
						ShipAct_InptChk01_DtlR.$trd_unit_cd,
						ShipAct_InptChk01_DtlR.$base_unit_qty,
						ShipAct_InptChk01_DtlR.$base_unit_cd,
						ShipAct_InptChk01_DtlR.$skip_chk_ship_flg,
						ShipAct_InptChk01_DtlR.$rsn_cd, ShipAct_InptChk01_DtlR.$bd_dpt_cd,
						ShipAct_InptChk01_DtlR.$bd_dpt_nm,
						ShipAct_InptChk01_DtlR.$cst_po_no,
						ShipAct_InptChk01_DtlR.$cst_po_d_no,
						ShipAct_InptChk01_DtlR.$cst_dlv_inst_no,
						ShipAct_InptChk01_DtlR.$cst_dlv_inst_d_no,
						ShipAct_InptChk01_DtlR.$cst_itm_cd,
						ShipAct_InptChk01_DtlR.$cst_itm_nm,
						ShipAct_InptChk01_DtlR.$arr_cnt_rmrks,
						ShipAct_InptChk01_DtlR.$trd_rmrks,
						ShipAct_InptChk01_DtlR.$trd_d_rmrks,
						ShipAct_InptChk01_DtlR.$intr_d_rmrks,
						ShipAct_InptChk01_DtlR.$io_schd_pr_no,
						ShipAct_InptChk01_DtlR.$sub_char1,
						ShipAct_InptChk01_DtlR.$sub_char2,
						ShipAct_InptChk01_DtlR.$sub_char3,
						ShipAct_InptChk01_DtlR.$dlv_slip_d_no,
						ShipAct_InptChk01_DtlR.$dlv_slip_no,
						ShipAct_InptChk01_DtlR.$abort_flg,
						ShipAct_InptChk01_DtlR.$non_upd_flg,
						ShipAct_InptChk01_DtlR.$prov_typ,
						ShipAct_InptChk01_DtlR.$prov_basis_typ,
						ShipAct_InptChk01_DtlR.$wms_flg,
						ShipAct_InptChk01_DtlR.$ext_sys_cd,
						ShipAct_InptChk01_DtlR.$ext_ship_act_no,
				};
				MCIndexKey destIdx = up2().createIndex(ShipActIF_DtlR.$hdr_dtl_peg_no);
				MCIndexKey srcIdx = v0.down1().createIndex(ShipAct_InptChk01_DtlR.$hdr_peg_no);
				// hdr_peg_no単位に値とエラーフラグを取得する
				for (ShipActIF_HdrR hdrR : hdrL) {
					MCList<ShipActIF_DtlR> dest = up2().subList(destIdx, hdrR.hdr_dtl_peg_no());
					MCList<ShipAct_InptChk01_DtlR> src = v0.down1().subList(srcIdx, hdrR.hdr_dtl_peg_no());
					copyByPegNo(dest, destColsDtl, src, srcColsDtl);
					copyErrFlg(dest, src);
				}
			}
		}

		/**
		 * 出荷実績SV 削除前チェック処理を実行する
		 */
		protected void callShipActChk02Srv(MCList<ShipActIF_HdrR> l) {
			// 削除が対象
			MCList<ShipActIF_HdrR> hdrL = l.subList(r -> MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			if (hdrL.isEmpty()) {
				return;
			}

			MCIndexKey cntrIdx = up3().createIndex(ShipActIF_CntrR.$hdr_dtl_peg_no);
			MCList<ShipActIF_CntrR> cntrL = MCList.create(ShipActIF_CntrR.class);
			hdrL.sort(ShipActIF_HdrR.$row_seq);	// 上りの順に並び替え
			hdrL.forEach(r -> {
				cntrL.addAll(up3().subList(cntrIdx, r.hdr_dtl_peg_no()));
			});
			
			// InptChk02の上り電文を設定
			up_SA_v1_0(v1_up0, hdrL);
			up_SA_v1_1(v1_up1, cntrL);
			
			if (!v1.up0().isEmpty()) {
				v1.exec();

				// InptChk02の下り電文に置き換える
				String[] destCols = {
						ShipActIF_HdrR.$data_crud_typ, ShipActIF_HdrR.$ship_act_no,
						ShipActIF_HdrR.$can_ac_dt, ShipActIF_HdrR.$dlv_slip_prnt_flg
				};
				String[] srcCols = {
						ShipAct_InptChk02_HdrR.$data_crud_typ,
						ShipAct_InptChk02_HdrR.$ship_act_no,
						ShipAct_InptChk02_HdrR.$can_ac_dt,
						ShipAct_InptChk02_HdrR.$dlv_slip_prnt_flg
				};
				copyByPegNo(hdrL, v1.down0(), ShipActIF_HdrR.$hdr_dtl_peg_no, destCols, ShipAct_InptChk02_HdrR.$peg_no, srcCols);
				copyErrFlg(hdrL, v1.down0(), ShipActIF_HdrR.$hdr_dtl_peg_no, ShipAct_InptChk02_HdrR.$peg_no);
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().err_flg(up0().err_flg());
			down1().setAll(up1());
			down2().setAll(up2());
			down3().setAll(up3());
			setHdrErrFlg(down1(), down2(), down3());
		}
		
		/**
		 * 明細にエラーがある場合、ヘッダのフラグを立てる
		 */
		protected void setHdrErrFlg(MCList<ShipActIF_HdrR> hdrL, MCList<ShipActIF_DtlR> dtlL, MCList<ShipActIF_CntrR> cntrL) {
			MCIndexKey
				dtrIdx = dtlL.createIndex(ShipActIF_DtlR.$hdr_dtl_peg_no, ShipActIF_DtlR.$err_flg),
				cntrIdx = cntrL.createIndex(ShipActIF_CntrR.$hdr_dtl_peg_no, ShipActIF_CntrR.$err_flg);
			hdrL.forEach(r -> {
				if (!isNull(dtlL.getFirst(dtrIdx, r.hdr_dtl_peg_no(), true))
					|| !isNull(cntrL.getFirst(cntrIdx, r.hdr_dtl_peg_no(), true))) {
					r.err_flg(true);
				}
			});
		}
	}

	/**
	 * ShipActIF_Upd01オペレーション.<p>
	 *
	 * 外部システムから出荷実績の登録、更新、取消を行います。<br>
	 */
	public class ShipActIF_Upd01 extends MSBEL_ShipActRcptIFService_MC_A.ShipActIF_Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess();
			}
			catch (Exception e) {
				if (up0().is_src_batch_flg()) {
					// バッチ実行の場合は呼出元でハンドリングする
					throw e;
				}
				handleEx(e);
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {

			// 初期処理
			editUp();

			// チェック処理
			callThisChk01();
			throwOpeErr();

			// メイン処理
			callShipActSrv();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			// 上り電文の順序を保持
			setPegNo(ShipActIF_HdrR.$row_seq, up1());
			setPegNo(ShipActIF_DtlR.$row_seq, up2());
			
			// 固定値
			up1().setBoolean(ShipActIF_HdrR.$dlv_slip_flg, true);
			up1().setBoolean(ShipActIF_HdrR.$io_act_flg, true);
			up1().setBoolean(ShipActIF_HdrR.$sls_act_flg, true);
			
			for (ShipActIF_HdrR r : up1()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					r.setStatus(MCRow.CREATE);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					r.setStatus(MCRow.MODIFY);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.setStatus(MCRow.DELETE);
				}
				else {
					r.setStatus(MCRow.NONE);
				}
			}
			for (ShipActIF_DtlR r : up2()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					r.setStatus(MCRow.CREATE);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					r.setStatus(MCRow.MODIFY);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.setStatus(MCRow.DELETE);
				}
				else {
					r.setStatus(MCRow.NONE);
				}
			}
		}

		/**
		 * 登録前チェック処理を実行する
		 */
		protected void callThisChk01() {

			MSBEL_ShipActRcptIFService.Chk01 o = MSBEL_ShipActRcptIFService.crtChk01();
			MCRow.copyall(o.up0(), up0());
			o.up1().setAll(up1());
			o.up2().setAll(up2());
			o.up3().setAll(up3());
			o.exec();

			up0().err_flg(o.down0().err_flg());
			up1().setAll(o.down1());
			up2().setAll(o.down2());
		}

		/**
		 * IF更新区分を考慮し、更新対象のヘッダを取得する
		 */
		protected MCList<ShipActIF_HdrR> getUpdTgtL() {
			MCList<ShipActIF_HdrR> tgtL = MCList.create(ShipActIF_HdrR.class);
			MCIndexKey errIdx = up1().createIndex(ShipActIF_HdrR.$err_flg);
			MCList<ShipActIF_HdrR> errtgtL = up1().subList(errIdx, true);
			MCIndexKey shipInstIdx = errtgtL.createIndex(ShipActIF_HdrR.$ship_inst_no);

			// 1：すべて登録しない
			// 2：エラーを無視して登録
			// 3：エラー行まで登録
			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())
				&& !isNull(up1().getFirst(ShipActIF_HdrR.$err_flg, true))) {
				// エラーあり、かつ「1：すべて登録しない」の場合、空のリストを返す
				return tgtL;
			}
			up1().sort(ShipActIF_HdrR.$row_seq);
			for (ShipActIF_HdrR r : up1()) {
				if (!r.err_flg()) {
					// 同一出荷指図ＮＯのエラー1件でもあった場合に、すべてエラーとする。
					if (isNull(r.ship_inst_no()) || !errtgtL.contains(shipInstIdx, r.ship_inst_no())) {
						tgtL.add(r);
					}
				}
				else if (MAC_IF_UPD_TYP.isSTOP_ERROR(up0().if_upd_typ())) {
					// 「3：エラー行まで登録」の場合、ここまでで蓄積したリストを更新対象とする
					break;
				}
			}
			return tgtL;
		}

		/**
		 * 出荷実績SVを呼び出す
		 */
		protected void callShipActSrv() {			
			MCList<ShipActIF_HdrR> tgtL = getUpdTgtL();
			MCIndexKey
				actIdx = tgtL.createIndex(ShipActIF_HdrR.$hdr_dtl_peg_no),
				actDIdx = up2().createIndex(ShipActIF_DtlR.$hdr_dtl_peg_no);

			// 出荷実績サービス実行
			up_SA_v2_0(v2.up2(), up0());
			up_SA_v2_1(v2.up0(), tgtL);
			
			// 上りの順に処理
			up1().sort(ShipActIF_HdrR.$row_seq);
			for (ShipActIF_HdrR r : up1()) {
				if (isNull(tgtL.getFirst(actIdx, r.hdr_dtl_peg_no()))) {
					r.rtn_sts_typ(
						r.err_flg() ? MAC_RTN_STS_TYP.ERR.value() : MAC_RTN_STS_TYP.NOT_EXE.value());
					continue;
				}

				// 表示順を考慮し、上り電文の順でサービスに設定する
				MCList<ShipActIF_DtlR> dtlL = up2().subList(actDIdx, r.hdr_dtl_peg_no());
				dtlL.sort(ShipActIF_DtlR.$row_seq);
				up_SA_v2_2(v2.up1(), dtlL);
			}

			if (!v2.up0().isEmpty()) {
				// チェックOKのレコードを登録するため、エラーメッセージをクリアする。
				MCMessageList msgList = new MCMessageList();
				msgList.addAll(MCMessagePool.getMessageList());
				MCMessagePool.clear();
				
				v2.exec();
				
				msgList.addAll(MCMessagePool.getMessageList());
				MCMessagePool.clear();
				MCMessagePool.addAll(msgList);
				MCIndexKey
					idx0 = v2.down0().createIndex(ShipAct_HdrR.$peg_no),
					idx1 = v2.down1().createIndex(ShipAct_DtlR.$hdr_peg_no, ShipAct_DtlR.$peg_no);
				@SuppressWarnings("unchecked")
				MCRowMapper<ShipActIF_HdrR,ShipAct_HdrR> mprH = createMap_down_SA_v2_0();
				@SuppressWarnings("unchecked")
				MCRowMapper<ShipActIF_DtlR,ShipAct_DtlR> mprD = createMap_down_SA_v2_1();
				tgtL.forEach(r -> {
					copy(r, v2.down0().getFirst(idx0, r.hdr_dtl_peg_no()), mprH);
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				});
				up2().forEach(r -> {
					copy(r, v2.down1().getFirst(idx1, r.hdr_dtl_peg_no(), r.peg_no()), mprD);
				});
			}
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up1());
		}

		protected void handleSuccess() {
			if (up0().not_commit_flg()) {
				// コミットしない（バッチ実行）の場合は呼出元でトランを管理する
				return;
			}
			dbTran().commit();
		}
		
		protected void handleEx(Exception e) {
			dbTran().rollback();

			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);

			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
		}

		protected void throwOpeErr() {
			if (up0().err_flg()) {
				throwErr(msgOpeErr());
			}
		}
	}

	/**
	 * デフォルト格付ＣＤキャッシュ
	 */
	protected String _defGdCd = null;
	protected String getDefGdCd() {
		if (isNull(_defGdCd)) {
			MAM_STK_GD_R t = MAM_STK_GD_R.create("T");
			MAM_STK_GD_R S1W = MAM_STK_GD_R.create("W");
			MAM_STK_GD_R dbc = MAM_STK_GD_R.create();
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.gd_cd);
			dbc_bldr.setWhere(t.sort_seq.eq(subQuery() .select(min(S1W.sort_seq)) .from(S1W)));
			dbSelect("MSBEL5630_MAM_STK_GD_S01", dbc, dbc_bldr);
			_defGdCd = dbc.gd_cd();
		}
		return _defGdCd;
	}

	/**
	 * デフォルト取引キャッシュ
	 */
	protected MCList<MAM_TRD_R> _trdL = null;
	protected MCIndexKey _trdLIdx = null;
	protected MAM_TRD_R getDefTrdR(String trdPtnTyp) {
		if (isNull(_trdL)) {
			MAM_TRD_R t = MAM_TRD_R.create("T");
			_trdL = MCList.create(MAM_TRD_R.class);
			MCQueryApiBuilder _trdL_bldr = MCQueryApiBuilder.create(t);
			_trdL_bldr.setSelect(t.trd_cd, t.trd_ptn_typ, t.auto_adopt_flg);
			_trdL_bldr.setWhere(t.trd_ptn_typ.in( value(MAC_TRD_PTN_TYP.SLS.value()), value(MAC_TRD_PTN_TYP.SHIP.value()), value(MAC_TRD_PTN_TYP.XFR.value()), value(MAC_TRD_PTN_TYP.XFR_RTN.value()), value(MAC_TRD_PTN_TYP.PROV.value()), value(MAC_TRD_PTN_TYP.PROV_RTN.value())));
			dbSelect("MSBEL5630_MAM_TRD_S01", _trdL, _trdL_bldr);
			_trdLIdx = _trdL.createIndex(MAM_TRD_R.$trd_ptn_typ, MAM_TRD_R.$auto_adopt_flg);
		}
		MAM_TRD_R trdR = _trdL.getFirst(_trdLIdx, trdPtnTyp, true);
		if (isNull(trdR)) {
			trdR = _trdL.getFirst(_trdLIdx, trdPtnTyp, false);
		}
		return trdR;
	}

	//FMCB CUSTOM END
}