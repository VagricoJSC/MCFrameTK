package mcframe.serverMSBF.MSBFL0060;

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
import mcframe.serverMSBF.MSBFL0060.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBF.MSBFL5010.*;
import mcframe.serverMSBF.MSBFL5050.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSBF.MSBFL5330.*;
import static mcframe.serverMSBF.MSBFL0060.Query.*;
import mcframe.commonCore.param.MCParam;

import java.util.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_InspActLstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_InspActLstReg_MC extends MSBFL_InspActLstReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検査指図、検査予定、検査抜取実績を検索する<br>
	 */
	public class Srch01 extends MSBFL_InspActLstReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();

			// 業務データダウンロード画面から呼ばれた場合の検索条件設定
			beforeSearchForBizDatDLCmn();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 検索条件設定
			setUpTmpCol();

			MCQueryPlan sql = MSBFL0060_MST_INSP_INST_S01();
			searchForDL(sql, up0(), down0());
		}

		@Override
		protected void doSearchSub() {
			super.doSearchSub();

			// 全数検査明細取得
			srchTtl();
			// 抜取検査明細取得
			srchSmpl();
		}

		/**
		 * 業務データダウンロード画面から呼ばれた場合の検索条件設定
		 * @param up
		 */
		protected void beforeSearchForBizDatDLCmn() {
			// 品目分類
			up0().itm_grp_flg1(true);
			up0().itm_grp_flg2(true);
			up0().itm_grp_flg3(true);
			up0().itm_grp_flg4(true);
			up0().itm_grp_flg5(true);
			up0().itm_grp_flg6(true);
			up0().itm_grp_flg7(true);
			up0().itm_grp_flg8(true);
			up0().itm_grp_flg9(true);
			up0().itm_grp_flg10(true);
			// 検査状況区分
			up0().ord_flg(true);
			up0().stt_flg(true);
			up0().cmpl_flg(true);
			// 検査成績書発行
			up0().insp_rslt_not_prnt_flg(true);
			up0().insp_rslt_prnt_flg(true);
			// 規格検査確認
			up0().cnf_cmpl_flg(true);
			up0().cnf_not_cmpl_flg(true);
		}

		/**
		 * 検索条件に対する一時カラムを設定する
		 */
		protected void setUpTmpCol() {
			setCnf();
			setInspStsTyp();
			setInspRsltPrntFlg();
			setOpe();
			setLims();
		}
		
		protected void setCnf() {
			if (up0().cnf_cmpl_flg() && up0().cnf_not_cmpl_flg()) {
				up0().addStringColumn("TMP_CNF_CMPL_FLG_CUTOFF", toFalseStr(true));
				up0().addStringColumn("TMP_CNF_NOT_CMPL_FLG_CUTOFF", toFalseStr(true));
			} 
			else if (!up0().cnf_cmpl_flg() && !up0().cnf_not_cmpl_flg()) {
				up0().addStringColumn("TMP_CNF_CMPL_FLG_CUTOFF", toFalseStr(true));
				up0().addStringColumn("TMP_CNF_NOT_CMPL_FLG_CUTOFF", toFalseStr(true));
			}
			else if (up0().cnf_cmpl_flg()) {
				up0().addStringColumn("TMP_CNF_CMPL_FLG_CUTOFF", toFalseStr(false));
			} 
			else if (up0().cnf_not_cmpl_flg()) {
				up0().addStringColumn("TMP_CNF_NOT_CMPL_FLG_CUTOFF", toFalseStr(false));
			}
		}
		
		/**
		 * 検査状況区分を設定する。
		 */
		protected void setInspStsTyp() {
			if (up0().ord_flg()) {
				up0().addStringColumn("TMP_INSP_STS_TYP_ORD", MSC_INSP_STS_TYP.ORD.value());
			}
			if (up0().stt_flg()) {
				up0().addStringColumn("TMP_INSP_STS_TYP_STR", MSC_INSP_STS_TYP.STR.value());
			}
			if (up0().cmpl_flg()) {
				up0().addStringColumn("TMP_INSP_STS_TYP_CMPL", MSC_INSP_STS_TYP.JDG.value());
			}
		}
		
		protected void setInspRsltPrntFlg() {
			if (up0().insp_rslt_prnt_flg() && up0().insp_rslt_not_prnt_flg()) {
				up0().addStringColumn("TMP_RSLT_PRNT_FLG_CUTOFF", toFalseStr(true));
			} 
			else if (!up0().insp_rslt_prnt_flg() && !up0().insp_rslt_not_prnt_flg()) {
				up0().addStringColumn("TMP_RSLT_PRNT_FLG_CUTOFF", toFalseStr(true));
			}
			else if (up0().insp_rslt_prnt_flg()) {
				up0().addStringColumn("TMP_RSLT_PRNT_FLG_CUTOFF", toTrueStr(true));
			}
			else if (up0().insp_rslt_not_prnt_flg()) {
				up0().addStringColumn("TMP_RSLT_PRNT_FLG_CUTOFF", toFalseStr(false));
			}
		}
		
		protected void setOpe() {
			// 検索時に動的にDACを設定するための条件
			if (isSame(up0().ope(), MSC_INSP_ACT_LIST_REG_OPE.OPE_JUDG.value()) || isSame(up0().ope(), MSC_INSP_ACT_LIST_REG_OPE.OPE_DEL_JUDG.value())) {
				up0().addStringColumn("OPE_JUDG", "1");
				up0().addStringColumn("OPE_NOT_JUDG", "0");
				up0().login_usr_cd(mcframe.serverCore.sys.MCSys.user.ID());
				up0().dt(getToday());
			}
			else {
				up0().addStringColumn("OPE_JUDG", "0");
				up0().addStringColumn("OPE_NOT_JUDG", "1");
			}
		}
		
		/**
		 * LIMSを設定する。
		 */
		protected void setLims() {
			if (up0().lims_flg()) {
				up0().addStringColumn("TMP_LIMS_T", toTrueStr(true));
			}
			if (up0().not_lims_flg()) {
				up0().addStringColumn("TMP_LIMS_F", toTrueStr(true));
			}
			up0().addDateColumn("TODAY", getToday());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();

			editInspAct();
			getItmInsp();
			getInspStdInst();
			getInspStdAct();
			editLmtDtFrm();
		}

		/**
		 * 下り電文を編集する。
		 */
		protected void editInspAct() {
			for (Srch01_RsltR r : down0()) {
				if (MSC_INSP_TYP.isPRCD(r.insp_typ())) {
					// 先行検査の場合、MST_LOTから取得した項目をnullで上書き。
					// ※先行検査の場合、ロット、サブロット、手配ＮＯにNULL文字が
					// ※設定されている。偶然MST_LOTにそのようなデータが存在し、
					// ※MSBFL0060_MST_INSP_INST_S01で取得してしまった場合を考慮している。
					r.ver_no(null);
					r.vld_dt_now(null);
					r.lot_rmrks(null);
				}
				if (MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
					r.smpl_inst_qty(null);
					r.smpl_inst_unit_cd(null);
					r.smpl_inst_unit_nm(null);
					r.smpl_inst_unit_dec_place(null);
				}
			}
		}

		/**
		 * 品管関連情報を補完する。
		 */
		protected void getItmInsp() {
			MSBFL_InspSchdService.InspSchd_Srch01 o = MSBFL_InspSchdService.crtInspSchd_Srch01();
			setPegNo(down0());
			
			for (Srch01_RsltR r : down0()) {
				InspSchd_Srch01_CndR oR = InspSchd_Srch01_CndR.create();
				oR.peg_no(r.peg_no());
				oR.itm_cd(r.itm_cd());
				oR.itm_sub1(r.itm_sub1());
				oR.itm_sub2(r.itm_sub2());
				oR.itm_sub3(r.itm_sub3());
				oR.mfg_loc_cd(r.mfg_loc_cd());
				oR.sppl_cd(r.sppl_cd());
				oR.maker_cd(r.maker_cd());
				oR.base_dt(r.master_dt());
				oR.insp_typ(r.insp_typ());
				oR.insp_ptn_cd(r.insp_ptn_cd());
				oR.no_insp_srch_flg(true);
				oR.to_site_cd(r.to_site_cd());
				o.up0().add(oR);
			}

			o.exec();

			MCIndexKey idx = o.down0().createIndex(InspSchd_Srch01_CndR.$peg_no);
			for (Srch01_RsltR r : down0()) {
				InspSchd_Srch01_CndR itmInspR = o.down0().getFirst(idx, r.peg_no());
				
				if (isNull(itmInspR)) {
					continue;
				}
				
				r.lmt_pd(itmInspR.lmt_pd());
				r.calc_pd_typ(itmInspR.calc_pd_typ());
				if (MSC_INSP_TYP.isLOT(r.insp_typ())) {
					r.vld_pd(nvl(itmInspR.lot_insp_vld_pd(), itmInspR.vld_pd()));
					r.lmt_dt_frm_typ(nvl(itmInspR.lot_insp_lmt_dt_frm_typ(), MAC_LMT_DT_FRM_TYP.INSP_JUDG.value()));
				}
				else {
					r.vld_pd(itmInspR.vld_pd());
					r.lmt_dt_frm_typ(nvl(r.lmt_dt_frm_typ(), itmInspR.lmt_dt_frm_typ()));
				}
			}
		}

		/**
		 * 起算日を計算する。
		 */
		protected void editLmtDtFrm() {
			// 操作種別は「登録・訂正」、「判定」以外の場合、計算しない
			if (!isSame(up0().ope(), MSC_INSP_ACT_LIST_REG_OPE.OPE_UPD.value()) && !isSame(up0().ope(), MSC_INSP_ACT_LIST_REG_OPE.OPE_JUDG.value())) {
				return;
			}
			MSBFL_LotService.Lot_Srch02 o = MSBFL_LotService.crtLot_Srch02();
			setPegNo(down0());
			for (Srch01_RsltR r : down0()) {
				if (isValidDtUpdFlgTrue(r) 
						&& isNull(r.vld_dt_now())
						&& !MAC_LMT_DT_FRM_TYP.isVALID_DT(r.lmt_dt_frm_typ())
						&& !MAC_LMT_DT_FRM_TYP.isINSP_JUDG(r.lmt_dt_frm_typ())) {
					Lot_Srch02_CndR cndR = Lot_Srch02_CndR.create();
					cndR.peg_no(r.peg_no());
					cndR.insp_no(r.insp_no());
					cndR.lmt_dt_frm(r.lmt_dt_frm());
					o.up0().add(cndR);
				}
			}
			if (!o.up0().isEmpty()) {
				o.exec();
				String[] destCols = new String[] {Srch01_RsltR.$lmt_dt_frm, Srch01_RsltR.$vld_dt, Srch01_RsltR.$lmt_dt};
				String[] srcCols = new String[] {Lot_Srch02_RsltR.$lmt_dt_frm, Lot_Srch02_RsltR.$vld_dt, Lot_Srch02_RsltR.$lmt_dt};
				copyByPegNo(down0(), destCols, o.down0(), srcCols);
			}
		}

		/**
		 * 使用期限を更新するフラグをtrueにすべきかどうか
		 * @return
		 */
		protected boolean isValidDtUpdFlgTrue(Srch01_RsltR r) {
			boolean ret = false;
			
			if (!r.lmt_ctl_flg()) {
				// 期限管理対象外の場合はfalse
			}
			else if (MSC_INSP_TYP.isLOT(r.insp_typ())
					|| MSC_INSP_TYP.isPRDCT(r.insp_typ())
					|| MSC_INSP_TYP.isACCPT(r.insp_typ())) {
				
				if (r.lmt_up_flg()) {
					ret = true;
				}
				else {
					ret = isNull(r.vld_dt_now());
				}
			}
			
			return ret;
		}

		/**
		 * 規格検査指図情報を取得する。
		 */
		protected void getInspStdInst() {
			MCList<MST_STD_INSP_INST_R> stdInspL = MCList.create(MST_STD_INSP_INST_R.class);
			MST_STD_INSP_INST_R t = MST_STD_INSP_INST_R.create("T");
			MCQueryApiBuilder stdInspL_bldr = MCQueryApiBuilder.create(t);
			stdInspL_bldr.setSelect(t.insp_no);
			stdInspL_bldr.addSelect(t.insp_point_cd);
			stdInspL_bldr.addSelect(t.insp_qlqn_typ);
			stdInspL_bldr.setWhere(t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL0060_MST_STD_INSP_INST_S01", stdInspL, stdInspL_bldr, down0());
			MCIndexKey idx = stdInspL.createIndex(MST_STD_INSP_INST_R.$insp_no);
			
			for (Srch01_RsltR r : down0()) {
				if (MAC_INSP_MTD_TYP.isSPEC(r.insp_mtd_typ())) {

					MCList<MST_STD_INSP_INST_R> substdInspL = stdInspL.subList(idx, r.insp_no());
					
					if (isNull(substdInspL)) {
						r.std_insp_point_cnt(MCNumber.ZERO);
					} else {
						r.std_insp_point_cnt(substdInspL.size());
					}
				}
			}
		}

		/**
		 * 規格検査実績情報を取得する。
		 */
		protected void getInspStdAct() {
			MCList<MST_STD_INSP_ACT_R> stdActL = MCList.create(MST_STD_INSP_ACT_R.class);
			MST_STD_INSP_ACT_R t = MST_STD_INSP_ACT_R.create("T");
			MCQueryApiBuilder stdActL_bldr = MCQueryApiBuilder.create(t);
			stdActL_bldr.setSelect(t.insp_no);
			stdActL_bldr.addSelect(t.std_insp_inst_no);
			stdActL_bldr.addSelect(t.std_insp_rslt_typ);
			stdActL_bldr.addSelect(t.cnf_flg);
			stdActL_bldr.setWhere(t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL0060_MST_STD_INSP_ACT_S01", stdActL, stdActL_bldr, down0());
			MCIndexKey idx = stdActL.createIndex(MST_STD_INSP_ACT_R.$insp_no);
			
			MCList<MST_STD_INSP_INST_R> stdInstL = MCList.create(MST_STD_INSP_INST_R.class);
			MST_STD_INSP_INST_R StdInspInstR = MST_STD_INSP_INST_R.create("STDINSPINST");
			MCQueryApiBuilder stdInstL_bldr = MCQueryApiBuilder.create(StdInspInstR);
			stdInstL_bldr.setSelect(StdInspInstR.insp_no);
			stdInstL_bldr.addSelect(StdInspInstR.std_insp_inst_no);
			stdInstL_bldr.setWhere(StdInspInstR.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_STD_INSP_INST_S01", stdInstL, stdInstL_bldr, down0());
			
			MCIndexKey stdActIdx = stdActL.createIndex(MST_STD_INSP_ACT_R.$std_insp_inst_no);
			
			MCList<MST_STD_INSP_INST_R> notStdActL = MCList.create(MST_STD_INSP_INST_R.class);
			for (MST_STD_INSP_INST_R stdInstR : stdInstL) {
				MCList<MST_STD_INSP_ACT_R> actL = stdActL.subList(stdActIdx, stdInstR.std_insp_inst_no());
				if (actL.isEmpty()) {
					notStdActL.add(stdInstR);
				}
			}
			
			MCIndexKey notStdActIdx = notStdActL.createIndex(MST_STD_INSP_INST_R.$insp_no);

			MCList<MST_STD_INSP_ACT_R> subStdActL = null;
			MCList<MST_STD_INSP_ACT_R> stdNotRsltL = null;
			MCList<MST_STD_INSP_ACT_R> stdNotCnfL = null;
			MCList<MST_STD_INSP_INST_R> tgtNotStdActL = null;
			
			for (Srch01_RsltR r : down0()) {
				if (MAC_INSP_MTD_TYP.isSPEC(r.insp_mtd_typ())) {
					r.std_insp_flg(true);
					subStdActL = stdActL.subList(idx, r.insp_no());
					tgtNotStdActL = notStdActL.subList(notStdActIdx, r.insp_no());

					r.std_insp_cmpl_cnt(MCNumber.ZERO);
					r.std_insp_cnf_cmpl_cnt(MCNumber.ZERO);
					if (!isNull(subStdActL)) {
						// 規格検査項目の完了情報を設定する（規格検査結果区分に指定ありのを完了とみなす）
						stdNotRsltL = subStdActL.subList(MST_STD_INSP_ACT_R.$std_insp_rslt_typ, null);
						if (isNull(stdNotRsltL)) {
							r.std_cmpl_flg(true);
							r.std_insp_cmpl_cnt(subStdActL.size());
						} else {
							r.std_insp_cmpl_cnt(subStdActL.size() - stdNotRsltL.size());
						}

						// 規格検査項目の確認済情報を設定する。
						stdNotCnfL = subStdActL.subList(MST_STD_INSP_ACT_R.$cnf_flg, false);
						if (isNull(stdNotCnfL)) {
							r.std_cnf_cmpl_flg(true);
							r.std_insp_cnf_cmpl_cnt(subStdActL.size());
						} else {
							r.std_insp_cnf_cmpl_cnt(subStdActL.size() - stdNotCnfL.size());
						}
						
						if (!tgtNotStdActL.isEmpty()) {
							r.std_cmpl_flg(false);
							r.std_cnf_cmpl_flg(false);
						}

						// 規格検査項目の規格検査結果区分にＮＧや特採があるかどうかをチェックする
						if (!isNull(subStdActL.getFirst(MST_STD_INSP_ACT_R.$std_insp_rslt_typ, MSC_STD_INSP_RSLT_TYP.NG.value()))) {
							r.std_insp_ng_flg(true);
						}
						if (!isNull(subStdActL.getFirst(MST_STD_INSP_ACT_R.$std_insp_rslt_typ, MSC_STD_INSP_RSLT_TYP.SP.value()))) {
							r.std_insp_sp_flg(true);
						}
					}
				}
			}
		}

		/**
		 * 全数検査実績明細情報を取得する
		 */
		protected void srchTtl() {
			MCList<Srch01_RsltR> tgtHdrL = down0().subList(Srch01_RsltR.$insp_mtd_typ, MAC_INSP_MTD_TYP.TTL.value());
			
			if (!tgtHdrL.isEmpty()) {
				srchTtlMain(tgtHdrL);
			}
		}

		protected void srchTtlMain(MCList<Srch01_RsltR> hdrL) {

			MCList<Srch01_RsltR> ordHdrL = hdrL.subList(Srch01_RsltR.$insp_sts_typ, MSC_INSP_STS_TYP.ORD.value());
			MCList<Srch01_RsltR> dtlDHdrL = hdrL.subList(r -> isActDRow(r));
			MCList<Srch01_RsltR> judgHdrL = hdrL.subList(r -> isJudgRow(r));
			// 残数の初期値設定
			hdrL.setNumberNE(Srch01_RsltR.$rem_base_unit_qty, MCNumber.ZERO);
			// 検査状況区分：指図済の場合、現状在庫情報を取得する
			down1().addAll(getStkL(ordHdrL));
			// 検査承認状況区分：判定済でない場合、検査実績明細情報を取得する
			down1().addAll(getInspActDL(dtlDHdrL));
			down1().addAll(getStkL(dtlDHdrL));
			// 検査承認状況区分：判定済の場合でも、検査実績明細情報を取得する
			// ただし、計上日が判定明細の計上日で表示されている
			down1().addAll(getInspJudgDL(judgHdrL));
		}

		protected boolean isJudgRow(Srch01_RsltR r) {
			if (MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(r.insp_aprv_sts_typ())) {
				return true;
			}
			return false;
		}

		protected boolean isActDRow(Srch01_RsltR r) {
			if (!MSC_INSP_STS_TYP.isORD(r.insp_sts_typ()) && !MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(r.insp_aprv_sts_typ())) {
				return true;
			}
			return false;
		}

		protected MCList<Srch01_RsltTtlR> getStkL(MCList<Srch01_RsltR> hdrL) {
			MCList<Srch01_RsltTtlR> retL = MCList.create(Srch01_RsltTtlR.class);
			for (Srch01_RsltR hdrR : hdrL) {
				MCList<MST_INSP_SCHD_R> schdL = getInspSchdL(hdrR);
				MCList<MST_STK_R> stkL = MCList.create(MST_STK_R.class);
				MST_STK_R t = MST_STK_R.create("T");
				MCQueryApiBuilder stkL_bldr = MCQueryApiBuilder.create(t);
				MSVT_WRK_SNO_R t2 = MSVT_WRK_SNO_R.create("T2");
				MAM_LOC_R m1 = MAM_LOC_R.create("M1");
				MAM_STR_LN_R m2 = MAM_STR_LN_R.create("M2");
				MAM_BP_R m3 = MAM_BP_R.create("M3");
				MAM_STK_GD_R m4 = MAM_STK_GD_R.create("M4");
				MAM_BP_R m5 = MAM_BP_R.create("M5");
				MAM_UNIT_R m6 = MAM_UNIT_R.create("M6");
				MAVM_ITM_UNIT_R m7 = MAVM_ITM_UNIT_R.create("M7");
				stkL_bldr.addSelect(m1.loc_nm);
				stkL_bldr.addSelect(m1.str_ln_tgt_flg);
				stkL_bldr.addSelect(m2.str_ln_nm);
				stkL_bldr.addSelect(m3.bp_nm.as("stk_arrv_bp_nm"));
				stkL_bldr.addSelect(m4.gd_nm);
				stkL_bldr.addSelect(m5.bp_nm.as("stk_bp_nm"));
				stkL_bldr.addSelect(t2.wrk_no);
				stkL_bldr.addSelect(m6.unit_nm.as("stk_pack_unit_nm"));
				stkL_bldr.addSelect(m7.dec_place.as("stk_pack_unit_dec_place"));
				stkL_bldr.addSelect(m7.conv_base_qty.as("stk_pack_unit_dmn_qty"));
				stkL_bldr.addSelect(m7.conv_qty.as("stk_pack_unit_conv_qty"));
				stkL_bldr.addSelect(m7.rnd_typ.as("stk_pack_unit_rnd_typ"));
				stkL_bldr.addLeftOuterJoin(t2, bracket(t.sno1.eq(t2.sno1)));
				stkL_bldr.addLeftOuterJoin(m1, bracket(t.loc_cd.eq(m1.loc_cd)));
				stkL_bldr.addLeftOuterJoin(m2, bracket(t.loc_cd.eq(m2.loc_cd)
								.and(t.str_ln_cd.eq(m2.str_ln_cd))));
				stkL_bldr.addLeftOuterJoin(m3, bracket(t.stk_arrv_bp_cd.eq(m3.bp_cd)));
				stkL_bldr.addLeftOuterJoin(m4, bracket(t.gd_cd.eq(m4.gd_cd)));
				stkL_bldr.addLeftOuterJoin(m5, bracket(t.stk_bp_cd.eq(m5.bp_cd)));
				stkL_bldr.addLeftOuterJoin(m6, bracket(t.pack_unit_cd.eq(m6.unit_cd)));
				stkL_bldr.addLeftOuterJoin(m7, bracket(t.itm_cd.eq(m7.itm_cd)
								.and(t.itm_sub1.eq(m7.itm_sub1))
								.and(t.itm_sub2.eq(m7.itm_sub2))
								.and(t.itm_sub3.eq(m7.itm_sub3))
								.and(t.pack_unit_cd.eq(m7.unit_cd))));
				stkL_bldr.setWhere(t.fix_no_typ.eq(bind("fix_no_typ")));
				stkL_bldr.addWhereWithAnd(t.fix_no.eq(bind("fix_no")));
				if ((MSC_INSP_STS_TYP.isSTR(hdrR.insp_sts_typ()) && MSC_INSP_APRV_STS_TYP.isINST_ACPT(hdrR.insp_aprv_sts_typ()))
						|| (MSC_INSP_STS_TYP.isJDG(hdrR.insp_sts_typ()) && MSC_INSP_APRV_STS_TYP.isJUDG_OPN(hdrR.insp_aprv_sts_typ()))) {
					stkL_bldr.addWhereWithAnd(t.stk_insp_typ.neq(value(MSC_STK_INSP_TYP.WAIT_JUDG.value())));
				}
				if (MSC_INSP_TYP.isACCPT(hdrR.insp_typ()) && MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ())) {
					stkL_bldr.addWhereWithAnd(t.stk_insp_typ.neq(value(MSC_STK_INSP_TYP.FIN.value())));
				}
				dbSelect("MSBFL0060_MST_STK_S01", stkL, stkL_bldr, schdL);

				setRemQty(stkL, hdrR);

				MCList<Srch01_RsltTtlR> rsltTtlL = MCList.create(Srch01_RsltTtlR.class);
				setRsltTtlL(rsltTtlL, stkL, hdrR);
				retL.addAll(rsltTtlL);
			}
			
			return retL;
		}
		
		protected void setRemQty(MCList<MST_STK_R> stkL, Srch01_RsltR hdrR) {
			if (!stkL.isEmpty()) {
				hdrR.rem_base_unit_qty(stkL.sum(MST_STK_R.$base_unit_qty));
			}
			else {
				hdrR.rem_base_unit_qty(MCNumber.ZERO);
			}
		}
		
		protected MCList<Srch01_RsltTtlR> getInspActDL(MCList<Srch01_RsltR> hdrL) {
			MCList<MST_INSP_ACT_D_R> actDL = MCList.create(MST_INSP_ACT_D_R.class);
			MST_INSP_ACT_D_R t = MST_INSP_ACT_D_R.create("T");
			MCQueryApiBuilder actDL_bldr = MCQueryApiBuilder.create(t);
			MST_INSP_ACT_R t2 = MST_INSP_ACT_R.create("T2");
			MSVT_WRK_SNO_R t3 = MSVT_WRK_SNO_R.create("T3");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_STR_LN_R m2 = MAM_STR_LN_R.create("M2");
			MAM_BP_R m3 = MAM_BP_R.create("M3");
			MAM_STK_GD_R m4 = MAM_STK_GD_R.create("M4");
			MAM_BP_R m5 = MAM_BP_R.create("M5");
			MAM_UNIT_R m6 = MAM_UNIT_R.create("M6");
			MAM_UNIT_R m7 = MAM_UNIT_R.create("M7");
			MAM_UNIT_R m8 = MAM_UNIT_R.create("M8");
			MAM_UNIT_R m9 = MAM_UNIT_R.create("M9");
			MAM_BIZ_RSN_R m10 = MAM_BIZ_RSN_R.create("M10");
			MAVM_ITM_UNIT_R m11 = MAVM_ITM_UNIT_R.create("M11");
			MAVM_ITM_UNIT_R m12 = MAVM_ITM_UNIT_R.create("M12");
			MAM_ITM_R m13 = MAM_ITM_R.create("M13");
			MAM_EXT_SYS_R m14 = MAM_EXT_SYS_R.create("EXT");
			actDL_bldr.addSelect(t2.insp_no);
			actDL_bldr.addSelect(m1.loc_nm);
			actDL_bldr.addSelect(m1.str_ln_tgt_flg);
			actDL_bldr.addSelect(m2.str_ln_nm);
			actDL_bldr.addSelect(m3.bp_nm.as("stk_arrv_bp_nm"));
			actDL_bldr.addSelect(m4.gd_nm);
			actDL_bldr.addSelect(m5.bp_nm.as("stk_bp_nm"));
			actDL_bldr.addSelect(t3.wrk_no);
			actDL_bldr.addSelect(t3.wrk_nm);
			actDL_bldr.addSelect(m6.unit_nm.as("pack_unit_nm"));
			actDL_bldr.addSelect(m11.dec_place.as("pack_unit_dec_place"));
			actDL_bldr.addSelect(m11.conv_base_qty.as("pack_unit_dmn_qty"));
			actDL_bldr.addSelect(m11.conv_qty.as("pack_unit_conv_qty"));
			actDL_bldr.addSelect(m11.rnd_typ.as("pack_unit_rnd_typ"));
			actDL_bldr.addSelect(m7.unit_nm.as("base_unit_nm"));
			actDL_bldr.addSelect(m13.dec_place.as("base_unit_dec_place"));
			actDL_bldr.addSelect(m13.rnd_typ.as("base_unit_rnd_typ"));
			actDL_bldr.addSelect(m8.unit_nm.as("pack_xfr_pack_unit_nm"));
			actDL_bldr.addSelect(m12.dec_place.as("pack_xfr_pack_unit_dec_place"));
			actDL_bldr.addSelect(m12.conv_base_qty.as("pack_xfr_pack_unit_dmn_qty"));
			actDL_bldr.addSelect(m12.conv_qty.as("pack_xfr_pack_unit_conv_qty"));
			actDL_bldr.addSelect(m9.unit_nm.as("pack_xfr_base_unit_nm"));
			actDL_bldr.addSelect(m13.dec_place.as("pack_xfr_base_unit_dec_place"));
			actDL_bldr.addSelect(m13.rnd_typ.as("pack_xfr_base_unit_rnd_typ"));
			actDL_bldr.addSelect(m10.biz_rsn_nm.as("dfct_rsn_nm"));
			actDL_bldr.addSelect(m14.ext_sys_nm);

			actDL_bldr.addInnerJoin(t2, bracket(t.insp_act_no.eq(t2.insp_act_no)));
			actDL_bldr.addLeftOuterJoin(t3, bracket(t.sno1.eq(t3.sno1)));
			actDL_bldr.addLeftOuterJoin(m1, bracket(t.loc_cd.eq(m1.loc_cd)));
			actDL_bldr.addLeftOuterJoin(m2, bracket(t.loc_cd.eq(m2.loc_cd)
							.and(t.str_ln_cd.eq(m2.str_ln_cd))));
			actDL_bldr.addLeftOuterJoin(m3, bracket(t.stk_arrv_bp_cd.eq(m3.bp_cd)));
			actDL_bldr.addLeftOuterJoin(m4, bracket(t.gd_cd.eq(m4.gd_cd)));
			actDL_bldr.addLeftOuterJoin(m5, bracket(t.stk_bp_cd.eq(m5.bp_cd)));
			actDL_bldr.addLeftOuterJoin(m6, bracket(t.pack_unit_cd.eq(m6.unit_cd)));
			actDL_bldr.addLeftOuterJoin(m7, bracket(t.base_unit_cd.eq(m7.unit_cd)));
			actDL_bldr.addLeftOuterJoin(m8, bracket(t.pack_xfr_pack_unit_cd.eq(m8.unit_cd)));
			actDL_bldr.addLeftOuterJoin(m9, bracket(t.pack_xfr_base_unit_cd.eq(m9.unit_cd)));
			actDL_bldr.addLeftOuterJoin(m10, bracket(t.dfct_rsn_cd.eq(m10.biz_rsn_cd)));
			actDL_bldr.addLeftOuterJoin(m11, bracket(t.itm_cd.eq(m11.itm_cd)
							.and(t.itm_sub1.eq(m11.itm_sub1))
							.and(t.itm_sub2.eq(m11.itm_sub2))
							.and(t.itm_sub3.eq(m11.itm_sub3))
							.and(t.pack_unit_cd.eq(m11.unit_cd))));
			actDL_bldr.addLeftOuterJoin(m12, bracket(t.itm_cd.eq(m12.itm_cd)
							.and(t.itm_sub1.eq(m12.itm_sub1))
							.and(t.itm_sub2.eq(m12.itm_sub2))
							.and(t.itm_sub3.eq(m12.itm_sub3))
							.and(t.pack_xfr_pack_unit_cd.eq(m12.unit_cd))));
			actDL_bldr.addLeftOuterJoin(m13, bracket(t.itm_cd.eq(m13.itm_cd)
							.and(t.itm_sub1.eq(m13.itm_sub1))
							.and(t.itm_sub2.eq(m13.itm_sub2))
							.and(t.itm_sub3.eq(m13.itm_sub3))));
			actDL_bldr.addLeftOuterJoin(m14, bracket(t.ext_sys_cd.eq(m14.ext_sys_cd)));

			actDL_bldr.setWhere(t.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL0060_MST_INSP_ACT_D_S01", actDL, actDL_bldr, hdrL);

			MCList<Srch01_RsltTtlR> rsltTtlL = MCList.create(Srch01_RsltTtlR.class);
			setRsltTtlL(rsltTtlL, actDL);
			return rsltTtlL;
		}

		protected MCList<Srch01_RsltTtlR> getInspJudgDL(MCList<Srch01_RsltR> hdrL) {
			
			MCList<MST_INSP_JUDG_D_R> judgDL = MCList.create(MST_INSP_JUDG_D_R.class);
			MST_INSP_JUDG_D_R t = MST_INSP_JUDG_D_R.create("T");
			MCQueryApiBuilder judgDL_bldr = MCQueryApiBuilder.create(t);
			judgDL_bldr.setSelect(t.insp_act_no, t.fix_no, t.fix_no_typ, t.ac_dt);
			judgDL_bldr.setWhere(t.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL0060_MST_INSP_JUDG_D_S01", judgDL, judgDL_bldr, hdrL);

			MCList<Srch01_RsltTtlR> rsltTtlL = MCList.create(Srch01_RsltTtlR.class);
			rsltTtlL.setAll(getInspActDL(hdrL));
			MCIndexKey idxkey = judgDL.createIndex(MST_INSP_JUDG_D_R.$insp_act_no);
			for (MCList<Srch01_RsltTtlR> subL : rsltTtlL.groupList(Srch01_RsltTtlR.$insp_act_no)) {
				MCList<MST_INSP_JUDG_D_R> subJudgDL = judgDL.subList(idxkey, subL.get(0).insp_act_no());
				MCIndexKey judgIdxkey = subJudgDL.createIndex(MST_INSP_JUDG_D_R.$fix_no, MST_INSP_JUDG_D_R.$fix_no_typ);
				for (Srch01_RsltTtlR ttlR : subL) {
					MST_INSP_JUDG_D_R judgDR = subJudgDL.getFirst(judgIdxkey, ttlR.fix_no(), ttlR.fix_no_typ());
					if (!isNull(judgDR)) {
						ttlR.ac_dt(judgDR.ac_dt());
					}
				}
			}
			return rsltTtlL;
		}

		protected void setRsltTtlL(MCList<Srch01_RsltTtlR> rsltTtlL, MCList<MST_STK_R> stkL, Srch01_RsltR hdrR) {
			for (MST_STK_R stkR : stkL) {
				Srch01_RsltTtlR rsltTtlR = Srch01_RsltTtlR.create();
				
				rsltTtlR.insp_no(hdrR.insp_no());
				rsltTtlR.itm_cd(stkR.itm_cd());
				rsltTtlR.itm_sub1(stkR.itm_sub1());
				rsltTtlR.itm_sub2(stkR.itm_sub2());
				rsltTtlR.itm_sub3(stkR.itm_sub3());
				rsltTtlR.loc_cd(stkR.loc_cd());
				rsltTtlR.loc_nm(stkR.getStringNE(Srch01_RsltTtlR.$loc_nm));
				rsltTtlR.str_ln_tgt_flg(isSame(stkR.getStringNE(Srch01_RsltTtlR.$str_ln_tgt_flg), "1"));
				rsltTtlR.str_ln_cd(stkR.str_ln_cd());
				rsltTtlR.str_ln_nm(stkR.getStringNE(Srch01_RsltTtlR.$str_ln_nm));
				rsltTtlR.stk_arrv_bp_cd(stkR.stk_arrv_bp_cd());
				rsltTtlR.stk_arrv_bp_nm(stkR.getStringNE(Srch01_RsltTtlR.$stk_arrv_bp_nm));
				rsltTtlR.gd_cd(stkR.gd_cd());
				rsltTtlR.gd_nm(stkR.getStringNE(Srch01_RsltTtlR.$gd_nm));
				rsltTtlR.quality_typ(stkR.quality_typ());
				rsltTtlR.stk_insp_typ(stkR.stk_insp_typ());
				rsltTtlR.stk_id_typ(stkR.stk_id_typ());
				rsltTtlR.stk_bp_cd(stkR.stk_bp_cd());
				rsltTtlR.stk_bp_nm(stkR.getStringNE(Srch01_RsltTtlR.$stk_bp_nm));
				rsltTtlR.lot_no(stkR.lot_no());
				rsltTtlR.sublot_no(stkR.sublot_no());
				rsltTtlR.sno1(stkR.sno1());
				rsltTtlR.sno2(stkR.sno2());
				rsltTtlR.sno3(stkR.sno3());
				rsltTtlR.sno4(stkR.sno4());
				rsltTtlR.stk_pack_unit_qty(stkR.pack_unit_qty());
				rsltTtlR.stk_pack_unit_cd(stkR.pack_unit_cd());
				rsltTtlR.stk_pack_unit_nm(stkR.getStringNE(Srch01_RsltTtlR.$stk_pack_unit_nm));
				rsltTtlR.stk_pack_unit_dec_place(stkR.getNumberNE(Srch01_RsltTtlR.$stk_pack_unit_dec_place));
				rsltTtlR.stk_pack_unit_dmn_qty(stkR.getNumberNE(Srch01_RsltTtlR.$stk_pack_unit_dmn_qty));
				rsltTtlR.stk_pack_unit_conv_qty(stkR.getNumberNE(Srch01_RsltTtlR.$stk_pack_unit_conv_qty));
				rsltTtlR.stk_pack_unit_rnd_typ(stkR.getStringNE(Srch01_RsltTtlR.$stk_pack_unit_rnd_typ));
				rsltTtlR.stk_base_unit_qty(stkR.base_unit_qty());
				rsltTtlR.stk_base_unit_cd(hdrR.inst_base_unit_cd());
				rsltTtlR.stk_base_unit_nm(hdrR.inst_base_unit_nm());
				rsltTtlR.stk_base_unit_dec_place(hdrR.inst_base_unit_dec_place());
				rsltTtlR.stk_base_unit_rnd_typ(hdrR.inst_base_unit_rnd_typ());
				rsltTtlR.fix_no_typ(stkR.fix_no_typ());
				rsltTtlR.fix_no(stkR.fix_no());
				rsltTtlR.pack_unit_cd(stkR.pack_unit_cd());
				rsltTtlR.pack_unit_nm(stkR.getStringNE(Srch01_RsltTtlR.$stk_pack_unit_nm));
				rsltTtlR.pack_unit_dec_place(stkR.getNumberNE(Srch01_RsltTtlR.$stk_pack_unit_dec_place));
				rsltTtlR.pack_unit_dmn_qty(stkR.getNumberNE(Srch01_RsltTtlR.$stk_pack_unit_dmn_qty));
				rsltTtlR.pack_unit_conv_qty(stkR.getNumberNE(Srch01_RsltTtlR.$stk_pack_unit_conv_qty));
				rsltTtlR.pack_unit_rnd_typ(stkR.getStringNE(Srch01_RsltTtlR.$stk_pack_unit_rnd_typ));
				rsltTtlR.base_unit_cd(hdrR.inst_base_unit_cd());
				rsltTtlR.base_unit_nm(hdrR.inst_base_unit_nm());
				rsltTtlR.base_unit_dec_place(hdrR.inst_base_unit_dec_place());
				rsltTtlR.base_unit_rnd_typ(hdrR.inst_base_unit_rnd_typ());
				rsltTtlR.pack_xfr_pack_unit_qty(null);
				rsltTtlR.pack_xfr_pack_unit_cd(stkR.pack_unit_cd());
				rsltTtlR.pack_xfr_pack_unit_nm(stkR.getStringNE(Srch01_RsltTtlR.$stk_pack_unit_nm));
				rsltTtlR.pack_xfr_pack_unit_dec_place(stkR.getNumberNE(Srch01_RsltTtlR.$stk_pack_unit_dec_place));
				rsltTtlR.pack_xfr_pack_unit_dmn_qty(stkR.getNumberNE(Srch01_RsltTtlR.$stk_pack_unit_dmn_qty));
				rsltTtlR.pack_xfr_pack_unit_conv_qty(stkR.getNumberNE(Srch01_RsltTtlR.$stk_pack_unit_conv_qty));
				rsltTtlR.pack_xfr_base_unit_qty(null);
				rsltTtlR.pack_xfr_base_unit_cd(hdrR.inst_base_unit_cd());
				rsltTtlR.pack_xfr_base_unit_nm(hdrR.inst_base_unit_nm());
				rsltTtlR.pack_xfr_base_unit_dec_place(hdrR.inst_base_unit_dec_place());
				rsltTtlR.pack_xfr_base_unit_rnd_typ(hdrR.inst_base_unit_rnd_typ());
				
				rsltTtlL.add(rsltTtlR);
			}
		}

		protected void setRsltTtlL(MCList<Srch01_RsltTtlR> rsltTtlL, MCList<MST_INSP_ACT_D_R> actDL) {
			for (MST_INSP_ACT_D_R actDR : actDL) {
				Srch01_RsltTtlR rsltTtlR = Srch01_RsltTtlR.create();
				
				rsltTtlR.insp_no(actDR.getStringNE(Srch01_RsltTtlR.$insp_no));
				rsltTtlR.itm_cd(actDR.itm_cd());
				rsltTtlR.itm_sub1(actDR.itm_sub1());
				rsltTtlR.itm_sub2(actDR.itm_sub2());
				rsltTtlR.itm_sub3(actDR.itm_sub3());
				rsltTtlR.loc_cd(actDR.loc_cd());
				rsltTtlR.loc_nm(actDR.getStringNE(Srch01_RsltTtlR.$loc_nm));
				rsltTtlR.str_ln_tgt_flg(isSame(actDR.getStringNE(Srch01_RsltTtlR.$str_ln_tgt_flg), "1"));
				rsltTtlR.str_ln_cd(actDR.str_ln_cd());
				rsltTtlR.str_ln_nm(actDR.getStringNE(Srch01_RsltTtlR.$str_ln_nm));
				rsltTtlR.stk_arrv_bp_cd(actDR.stk_arrv_bp_cd());
				rsltTtlR.stk_arrv_bp_nm(actDR.getStringNE(Srch01_RsltTtlR.$stk_arrv_bp_nm));
				rsltTtlR.gd_cd(actDR.gd_cd());
				rsltTtlR.gd_nm(actDR.getStringNE(Srch01_RsltTtlR.$gd_nm));
				rsltTtlR.quality_typ(actDR.quality_typ());
				rsltTtlR.stk_insp_typ(actDR.stk_insp_typ());
				rsltTtlR.stk_id_typ(actDR.stk_id_typ());
				rsltTtlR.stk_bp_cd(actDR.stk_bp_cd());
				rsltTtlR.stk_bp_nm(actDR.getStringNE(Srch01_RsltTtlR.$stk_bp_nm));
				rsltTtlR.lot_no(actDR.lot_no());
				rsltTtlR.sublot_no(actDR.sublot_no());
				rsltTtlR.sno1(actDR.sno1());
				rsltTtlR.sno2(actDR.sno2());
				rsltTtlR.sno3(actDR.sno3());
				rsltTtlR.sno4(actDR.sno4());
				rsltTtlR.wrk_no(actDR.getStringNE(Srch01_RsltTtlR.$wrk_no));
				rsltTtlR.wrk_nm(actDR.getStringNE(Srch01_RsltTtlR.$wrk_nm));
				rsltTtlR.fix_no_typ(actDR.fix_no_typ());
				rsltTtlR.fix_no(actDR.fix_no());
				rsltTtlR.pack_unit_qty(actDR.pack_unit_qty());
				rsltTtlR.pack_unit_cd(actDR.pack_unit_cd());
				rsltTtlR.pack_unit_nm(actDR.getStringNE(Srch01_RsltTtlR.$pack_unit_nm));
				rsltTtlR.pack_unit_dec_place(actDR.getNumberNE(Srch01_RsltTtlR.$pack_unit_dec_place));
				rsltTtlR.pack_unit_dmn_qty(actDR.getNumberNE(Srch01_RsltTtlR.$pack_unit_dmn_qty));
				rsltTtlR.pack_unit_conv_qty(actDR.getNumberNE(Srch01_RsltTtlR.$pack_unit_conv_qty));
				rsltTtlR.pack_unit_rnd_typ(actDR.getStringNE(Srch01_RsltTtlR.$pack_unit_rnd_typ));
				rsltTtlR.base_unit_qty(actDR.base_unit_qty());
				rsltTtlR.base_unit_cd(actDR.base_unit_cd());
				rsltTtlR.base_unit_nm(actDR.getStringNE(Srch01_RsltTtlR.$base_unit_nm));
				rsltTtlR.base_unit_dec_place(actDR.getNumberNE(Srch01_RsltTtlR.$base_unit_dec_place));
				rsltTtlR.base_unit_rnd_typ(actDR.getStringNE(Srch01_RsltTtlR.$base_unit_rnd_typ));
				rsltTtlR.pack_xfr_pack_unit_qty(actDR.pack_xfr_pack_unit_qty());
				rsltTtlR.pack_xfr_pack_unit_cd(actDR.pack_xfr_pack_unit_cd());
				rsltTtlR.pack_xfr_pack_unit_nm(actDR.getStringNE(Srch01_RsltTtlR.$pack_xfr_pack_unit_nm));
				rsltTtlR.pack_xfr_pack_unit_dec_place(actDR.getNumberNE(Srch01_RsltTtlR.$pack_xfr_pack_unit_dec_place));
				rsltTtlR.pack_xfr_pack_unit_dmn_qty(actDR.getNumberNE(Srch01_RsltTtlR.$pack_xfr_pack_unit_dmn_qty));
				rsltTtlR.pack_xfr_pack_unit_conv_qty(actDR.getNumberNE(Srch01_RsltTtlR.$pack_xfr_pack_unit_conv_qty));
				rsltTtlR.pack_xfr_base_unit_qty(actDR.pack_xfr_base_unit_qty());
				rsltTtlR.pack_xfr_base_unit_cd(actDR.pack_xfr_base_unit_cd());
				rsltTtlR.pack_xfr_base_unit_nm(actDR.getStringNE(Srch01_RsltTtlR.$pack_xfr_base_unit_nm));
				rsltTtlR.pack_xfr_base_unit_dec_place(actDR.getNumberNE(Srch01_RsltTtlR.$pack_xfr_base_unit_dec_place));
				rsltTtlR.pack_xfr_base_unit_rnd_typ(actDR.getStringNE(Srch01_RsltTtlR.$pack_xfr_base_unit_rnd_typ));
				rsltTtlR.dfct_rsn_cd(actDR.dfct_rsn_cd());
				rsltTtlR.dfct_rsn_nm(actDR.getStringNE(Srch01_RsltTtlR.$dfct_rsn_nm));
				rsltTtlR.ac_dt(actDR.ac_dt());
				rsltTtlR.insp_act_d_no(actDR.insp_act_d_no());
				rsltTtlR.insp_act_no(actDR.insp_act_no());
				rsltTtlR.intr_rmrks(actDR.intr_rmrks());
				rsltTtlR.sub_char1(actDR.sub_char1());
				rsltTtlR.sub_char2(actDR.sub_char2());
				rsltTtlR.sub_char3(actDR.sub_char3());
				rsltTtlR.lims_flg(actDR.lims_flg());
				rsltTtlR.ext_sys_cd(actDR.ext_sys_cd());
				rsltTtlR.ext_sys_nm(actDR.getStringNE(Srch01_RsltTtlR.$ext_sys_nm));
				rsltTtlR.ext_insp_act_d_no(actDR.ext_insp_act_d_no());
				
				rsltTtlL.add(rsltTtlR);
			}
		}


		/**
		 * 抜取検査実績情報を取得する。
		 */
		protected void srchSmpl() {
			MCList<Srch01_RsltR> tgtHdrL = MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : down0()) {
				if (MSC_INSP_TYP.isPRCD(r.insp_typ()) || MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
					continue;
				}
				
				tgtHdrL.add(r);
			}
			
			if (!tgtHdrL.isEmpty()) {
				srchSmplMain(tgtHdrL);
			}
		}
		
		protected void srchSmplMain(MCList<Srch01_RsltR> hdrL) {
			
			// 登録済の検査抜取実績を取得する。
			MCList<MST_INSP_SMPL_ACT_R> smplL = getSmplL(hdrL);
			MCIndexKey smplIdx = smplL.createIndex(MST_INSP_SMPL_ACT_R.$insp_schd_no);
			if (!smplL.isEmpty()) {
				setSmplL(smplL);
			}
			
			// 紐づく在庫のない検査に対して、検査抜取実績登録時の入力補助として検査予定を下り電文として返す。
			MCList<MST_INSP_SCHD_R> schdL = getInspSchdL(hdrL);
			MCList<MST_INSP_SCHD_R> tmpschdL = MCList.create(MST_INSP_SCHD_R.class);
			MCIndexKey fix_no_typIdx = smplL.createIndex(MST_INSP_SMPL_ACT_R.$fix_no_typ, MST_INSP_SMPL_ACT_R.$fix_no);
			for (MST_INSP_SCHD_R r : schdL) {
				MST_INSP_SMPL_ACT_R tmpR = smplL.getFirst(smplIdx, r.insp_schd_no());
				if (!isNull(tmpR)) {
					continue;
				}
				// 検査予定NO <-> 検査予定NO
				// 確定NO <-> 検査予定NO
				// 確定NO <-> 作成元NO4
				// 確定NO <-> 作成元NO4
				// これらのいずれにも紐づかなかった場合、対応する抜取検査実績がないと判断し、
				// 検査抜取実績登録時の入力補助用の空行を追加する。
				MST_INSP_SMPL_ACT_R fix_no_insp_schd_no_tmpR = null;
				if (!isNull(r.insp_schd_no())) {
					fix_no_insp_schd_no_tmpR = smplL.getFirst(fix_no_typIdx, MSC_FIX_NO_TYP.INSP_SCHD_NO.value(), r.insp_schd_no());
				}
				if (!isNull(fix_no_insp_schd_no_tmpR)) {
					continue;
				}
				MST_INSP_SMPL_ACT_R fix_no_arr_act_no_tmpR = null;
				MST_INSP_SMPL_ACT_R fix_no_yield_adt_no_tmpR = null;
				if (!isNull(r.src_no4())) {
					if (MSC_INSP_TYP.isACCPT(r.insp_typ())) {
						fix_no_arr_act_no_tmpR = smplL.getFirst(fix_no_typIdx, MSC_FIX_NO_TYP.ARR_ACT_NO.value(), r.src_no4());
					}
					else if (MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
						fix_no_yield_adt_no_tmpR = smplL.getFirst(fix_no_typIdx, MSC_FIX_NO_TYP.YIELD_ACT_NO.value(), r.src_no4());
					}
				}
				if (!isNull(fix_no_arr_act_no_tmpR) || !isNull(fix_no_yield_adt_no_tmpR)) {
					continue;
				}

				tmpschdL.add(r);
			}
			
			if (!tmpschdL.isEmpty()) {
				setInspSchdL(hdrL, tmpschdL);
			}
		}
		
		protected MCList<MST_INSP_SMPL_ACT_R> getSmplL(MCList<Srch01_RsltR> hdrL) {
			MCList<MST_INSP_SMPL_ACT_R> smplL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			smplL.addStringColumn("BASE_UNIT_NM");
			smplL.addNumberColumn("BASE_UNIT_DEC_PLACE");
			smplL.addStringColumn("PACK_XFR_PACK_UNIT_NM");
			smplL.addNumberColumn("PACK_XFR_PACK_UNIT_DEC_PLACE");
			smplL.addNumberColumn("PACK_XFR_PACK_UNIT_DMN_QTY");
			smplL.addNumberColumn("PACK_XFR_PACK_UNIT_CONV_QTY");
			smplL.addStringColumn("PACK_XFR_BASE_UNIT_NM");
			smplL.addNumberColumn("PACK_XFR_BASE_UNIT_DEC_PLACE");
			smplL.addStringColumn("PACK_XFR_BASE_UNIT_RND_TYP");
			smplL.addStringColumn("LOC_NM");
			smplL.addStringColumn("STR_LN_TGT_FLG");
			smplL.addStringColumn("STR_LN_NM");
			smplL.addStringColumn("STK_ARRV_BP_NM");
			smplL.addStringColumn("GD_NM");
			smplL.addStringColumn("STK_BP_NM");
			smplL.addStringColumn("BD_DPT_NM");
			smplL.addStringColumn("WRK_NO");
			smplL.addStringColumn("WRK_NM");
			smplL.addStringColumn("INSP_NO");
			smplL.addStringColumn("EXT_SYS_NM");
			
			MST_INSP_SMPL_ACT_R t = MST_INSP_SMPL_ACT_R.create("T");
			MCQueryApiBuilder smplL_bldr = MCQueryApiBuilder.create(t);
			MST_INSP_ACT_R t1 = MST_INSP_ACT_R.create("T1");
			MSVT_WRK_SNO_R t2 = MSVT_WRK_SNO_R.create("T2");
			MAM_UNIT_R m1 = MAM_UNIT_R.create("M1");
			MAM_UNIT_R m2 = MAM_UNIT_R.create("M2");
			MAM_UNIT_R m3 = MAM_UNIT_R.create("M3");
			MAM_LOC_R m4 = MAM_LOC_R.create("M4");
			MAM_STR_LN_R m5 = MAM_STR_LN_R.create("M5");
			MAM_BP_R m6 = MAM_BP_R.create("M6");
			MAM_STK_GD_R m7 = MAM_STK_GD_R.create("M7");
			MAM_BP_R m8 = MAM_BP_R.create("M8");
			MAM_DPT_R m9 = MAM_DPT_R.create("M9");
			MAVM_ITM_UNIT_R m10 = MAVM_ITM_UNIT_R.create("M10");
			MAM_ITM_R m11 = MAM_ITM_R.create("M11");
			MAM_EXT_SYS_R m12 = MAM_EXT_SYS_R.create("EXT");

			smplL_bldr.setWhere(t.insp_act_no.eq(bind("insp_act_no")));
			smplL_bldr.addSelect(m1.unit_nm.as("base_unit_nm"));
			smplL_bldr.addSelect(m11.dec_place.as("base_unit_dec_place"));
			smplL_bldr.addSelect(m2.unit_nm.as("pack_xfr_pack_unit_nm"));
			smplL_bldr.addSelect(m10.dec_place.as("pack_xfr_pack_unit_dec_place"));
			smplL_bldr.addSelect(m10.conv_base_qty.as("pack_xfr_pack_unit_dmn_qty"));
			smplL_bldr.addSelect(m10.conv_qty.as("pack_xfr_pack_unit_conv_qty"));
			smplL_bldr.addSelect(m3.unit_nm.as("pack_xfr_base_unit_nm"));
			smplL_bldr.addSelect(m11.dec_place.as("pack_xfr_base_unit_dec_place"));
			smplL_bldr.addSelect(m11.rnd_typ.as("pack_xfr_base_unit_rnd_typ"));
			smplL_bldr.addSelect(m4.loc_nm);
			smplL_bldr.addSelect(m4.wg_cd);
			smplL_bldr.addSelect(m4.str_ln_tgt_flg);
			smplL_bldr.addSelect(m5.str_ln_nm);
			smplL_bldr.addSelect(m6.bp_nm.as("stk_arrv_bp_nm"));
			smplL_bldr.addSelect(m7.gd_nm);
			smplL_bldr.addSelect(m8.bp_nm.as("stk_bp_nm"));
			smplL_bldr.addSelect(m9.dpt_nm.as("bd_dpt_nm"));
			smplL_bldr.addSelect(t2.wrk_no);
			smplL_bldr.addSelect(t2.wrk_nm);
			smplL_bldr.addSelect(t1.insp_no);
			smplL_bldr.addSelect(m12.ext_sys_nm);
			smplL_bldr.addLeftOuterJoin(t1, bracket(t.insp_act_no.eq(t1.insp_act_no)));
			smplL_bldr.addLeftOuterJoin(t2, bracket(t.sno1.eq(t2.sno1)));
			smplL_bldr.addLeftOuterJoin(m1, bracket(t.base_unit_cd.eq(m1.unit_cd)));
			smplL_bldr.addLeftOuterJoin(m2, bracket(t.pack_xfr_pack_unit_cd.eq(m2.unit_cd)));
			smplL_bldr.addLeftOuterJoin(m3, bracket(t.pack_xfr_base_unit_cd.eq(m3.unit_cd)));
			smplL_bldr.addLeftOuterJoin(m4, bracket(t.loc_cd.eq(m4.loc_cd)));
			smplL_bldr.addLeftOuterJoin(m5, bracket(t.loc_cd.eq(m5.loc_cd)
							.and(t.str_ln_cd.eq(m5.str_ln_cd))));
			smplL_bldr.addLeftOuterJoin(m6, bracket(t.stk_arrv_bp_cd.eq(m6.bp_cd)));
			smplL_bldr.addLeftOuterJoin(m7, bracket(t.gd_cd.eq(m7.gd_cd)));
			smplL_bldr.addLeftOuterJoin(m8, bracket(t.stk_bp_cd.eq(m8.bp_cd)));
			smplL_bldr.addLeftOuterJoin(m9, bracket(t.bd_dpt_cd.eq(m9.dpt_cd)
							.and(t.ac_dt.gte(m9.st_dt))
							.and(t.ac_dt.lte(m9.end_dt))));
			smplL_bldr.addLeftOuterJoin(m10, bracket(t.itm_cd.eq(m10.itm_cd)
							.and(t.itm_sub1.eq(m10.itm_sub1))
							.and(t.itm_sub2.eq(m10.itm_sub2))
							.and(t.itm_sub3.eq(m10.itm_sub3))
							.and(t.pack_xfr_pack_unit_cd.eq(m10.unit_cd))));
			smplL_bldr.addLeftOuterJoin(m11, bracket(t.itm_cd.eq(m11.itm_cd)
							.and(t.itm_sub1.eq(m11.itm_sub1))
							.and(t.itm_sub2.eq(m11.itm_sub2))
							.and(t.itm_sub3.eq(m11.itm_sub3))));
			smplL_bldr.addLeftOuterJoin(m12, bracket(t.ext_sys_cd.eq(m12.ext_sys_cd)));
			dbSelect("MSBFL0060_MST_INSP_SMPL_ACT_S01", smplL, smplL_bldr, hdrL);
			
			return smplL;
		}
		
		protected void setSmplL(MCList<MST_INSP_SMPL_ACT_R> smplL) {
			for (MST_INSP_SMPL_ACT_R smplR : smplL) {
				Srch01_RsltSmplR downR = Srch01_RsltSmplR.create();
				
				downR.itm_cd(smplR.itm_cd());
				downR.itm_sub1(smplR.itm_sub1());
				downR.itm_sub2(smplR.itm_sub2());
				downR.itm_sub3(smplR.itm_sub3());
				downR.so_qty(smplR.so_qty());
				downR.smpl_qty(smplR.smpl_qty());
				downR.base_unit_cd(smplR.base_unit_cd());
				downR.base_unit_nm(smplR.getStringNE(Srch01_RsltSmplR.$base_unit_nm));
				downR.base_unit_dec_place(smplR.getNumberNE(Srch01_RsltSmplR.$base_unit_dec_place));
				downR.base_unit_rnd_typ(smplR.getStringNE(Srch01_RsltSmplR.$base_unit_rnd_typ));
				downR.pack_xfr_pack_unit_qty(smplR.pack_xfr_pack_unit_qty());
				downR.pack_xfr_pack_unit_cd(smplR.pack_xfr_pack_unit_cd());
				downR.pack_xfr_pack_unit_nm(smplR.getStringNE(Srch01_RsltSmplR.$pack_xfr_pack_unit_nm));
				downR.pack_xfr_pack_unit_dec_place(smplR.getNumberNE(Srch01_RsltSmplR.$pack_xfr_pack_unit_dec_place));
				downR.pack_xfr_pack_unit_dmn_qty(smplR.getNumberNE(Srch01_RsltSmplR.$pack_xfr_pack_unit_dmn_qty));
				downR.pack_xfr_pack_unit_conv_qty(smplR.getNumberNE(Srch01_RsltSmplR.$pack_xfr_pack_unit_conv_qty));
				downR.pack_xfr_base_unit_qty(smplR.pack_xfr_base_unit_qty());
				downR.pack_xfr_base_unit_cd(smplR.pack_xfr_base_unit_cd());
				downR.pack_xfr_base_unit_nm(smplR.getStringNE(Srch01_RsltSmplR.$pack_xfr_base_unit_nm));
				downR.pack_xfr_base_unit_dec_place(smplR.getNumberNE(Srch01_RsltSmplR.$pack_xfr_base_unit_dec_place));
				downR.pack_xfr_base_unit_rnd_typ(smplR.getStringNE(Srch01_RsltSmplR.$pack_xfr_base_unit_rnd_typ));
				downR.so_cmpl_flg(smplR.so_cmpl_flg());
				downR.loc_cd(smplR.loc_cd());
				downR.loc_nm(smplR.getStringNE(Srch01_RsltSmplR.$loc_nm));
				downR.wg_cd(smplR.getStringNE(Srch01_RsltSmplR.$wg_cd));
				downR.str_ln_tgt_flg(isSame(smplR.getStringNE(Srch01_RsltSmplR.$str_ln_tgt_flg), "1"));
				downR.str_ln_cd(smplR.str_ln_cd());
				downR.str_ln_nm(smplR.getStringNE(Srch01_RsltSmplR.$str_ln_nm));
				downR.stk_arrv_bp_cd(smplR.stk_arrv_bp_cd());
				downR.stk_arrv_bp_nm(smplR.getStringNE(Srch01_RsltSmplR.$stk_arrv_bp_nm));
				downR.gd_cd(smplR.gd_cd());
				downR.gd_nm(smplR.getStringNE(Srch01_RsltSmplR.$gd_nm));
				downR.quality_typ(smplR.quality_typ());
				downR.stk_insp_typ(smplR.stk_insp_typ());
				downR.stk_id_typ(smplR.stk_id_typ());
				downR.stk_bp_cd(smplR.stk_bp_cd());
				downR.stk_bp_nm(smplR.getStringNE(Srch01_RsltSmplR.$stk_bp_nm));
				downR.lot_no(smplR.lot_no());
				downR.sublot_no(smplR.sublot_no());
				downR.sno1(smplR.sno1());
				downR.sno2(smplR.sno2());
				downR.sno3(smplR.sno3());
				downR.sno4(smplR.sno4());
				downR.fix_no_typ(smplR.getStringNE(Srch01_RsltSmplR.$fix_no_typ));
				downR.fix_no(smplR.getStringNE(Srch01_RsltSmplR.$fix_no));
				downR.act_dt(smplR.act_tm());
				downR.act_hm(smplR.act_tm());
				downR.ac_dt(smplR.ac_dt());
				downR.bd_dpt_cd(smplR.bd_dpt_cd());
				downR.bd_dpt_nm(smplR.getStringNE(Srch01_RsltSmplR.$bd_dpt_nm));
				downR.insp_smpl_act_no(smplR.insp_smpl_act_no());
				downR.insp_no(smplR.getStringNE(Srch01_RsltSmplR.$insp_no));
				downR.insp_schd_no(smplR.insp_schd_no());
				downR.insp_act_no(smplR.insp_act_no());
				downR.trd_rmrks(smplR.trd_rmrks());
				downR.intr_rmrks(smplR.intr_rmrks());
				downR.sub_char1(smplR.sub_char1());
				downR.sub_char2(smplR.sub_char2());
				downR.sub_char3(smplR.sub_char3());
				downR.lims_flg(smplR.lims_flg());
				downR.ext_sys_cd(smplR.ext_sys_cd());
				downR.ext_sys_nm(smplR.getStringNE(Srch01_RsltSmplR.$ext_sys_nm));
				downR.ext_insp_smpl_act_no(smplR.ext_insp_smpl_act_no());
				
				down2().add(downR);
			}
		}

		protected MCList<MST_INSP_SCHD_R> getInspSchdL(Srch01_RsltR hdrR) {
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			schdL_bldr.setSelect(t.insp_schd_no);
			schdL_bldr.addSelect(t.src_no4);
			schdL_bldr.addSelect(t.insp_typ);
			schdL_bldr.addSelect(t.base_unit_cd);
			schdL_bldr.setWhere(t.insp_no.eq(bind("1")), hdrR.insp_no());
			dbSelect("MSBFL0060_MST_INSP_SCHD_S01", schdL, schdL_bldr);
			
			for (MST_INSP_SCHD_R schdR : schdL) {
				if (MSC_INSP_TYP.isACCPT(schdR.insp_typ())) {
					schdR.addStringColumn(Srch01_RsltTtlR.$fix_no_typ, MSC_FIX_NO_TYP.ARR_ACT_NO.value());
					schdR.addStringColumn(Srch01_RsltTtlR.$fix_no, schdR.src_no4());
				}
				else if (MSC_INSP_TYP.isPRDCT(schdR.insp_typ())) {
					schdR.addStringColumn(Srch01_RsltTtlR.$fix_no_typ, MSC_FIX_NO_TYP.YIELD_ACT_NO.value());
					schdR.addStringColumn(Srch01_RsltTtlR.$fix_no, schdR.src_no4());
				}
				else if (MSC_INSP_TYP.isLOT(schdR.insp_typ())) {
					schdR.addStringColumn(Srch01_RsltTtlR.$fix_no_typ, MSC_FIX_NO_TYP.INSP_SCHD_NO.value());
					schdR.addStringColumn(Srch01_RsltTtlR.$fix_no, schdR.insp_schd_no());
				}
			}
			
			return schdL;
		}

		protected MCList<MST_INSP_SCHD_R> getInspSchdL(MCList<Srch01_RsltR> hdrL) {
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			MSVT_WRK_SNO_R t2 = MSVT_WRK_SNO_R.create("T2");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_STR_LN_R m2 = MAM_STR_LN_R.create("M2");
			MAM_BP_R m3 = MAM_BP_R.create("M3");
			MAM_STK_GD_R m4 = MAM_STK_GD_R.create("M4");
			MAM_BP_R m5 = MAM_BP_R.create("M5");
			MAM_UNIT_R m6 = MAM_UNIT_R.create("M6");
			MAM_UNIT_R m7 = MAM_UNIT_R.create("M7");
			MAVM_ITM_UNIT_R m8 = MAVM_ITM_UNIT_R.create("M8");
			MAM_ITM_R m9 = MAM_ITM_R.create("M9");
			schdL_bldr.addSelect(m1.loc_nm);
			schdL_bldr.addSelect(m1.str_ln_tgt_flg);
			schdL_bldr.addSelect(m2.str_ln_nm);
			schdL_bldr.addSelect(m3.bp_nm.as("stk_arrv_bp_nm"));
			schdL_bldr.addSelect(m4.gd_nm);
			schdL_bldr.addSelect(m5.bp_nm.as("stk_bp_nm"));
			schdL_bldr.addSelect(t2.wrk_no);
			schdL_bldr.addSelect(t2.wrk_nm);
			schdL_bldr.addSelect(m6.unit_nm.as("base_unit_nm"));
			schdL_bldr.addSelect(m9.dec_place.as("base_unit_dec_place"));
			schdL_bldr.addSelect(m9.rnd_typ.as("base_unit_rnd_typ"));
			schdL_bldr.addSelect(m7.unit_nm.as("pack_xfr_pack_unit_nm"));
			schdL_bldr.addSelect(m8.dec_place.as("pack_xfr_pack_unit_dec_place"));
			schdL_bldr.addSelect(m8.conv_base_qty.as("pack_xfr_pack_unit_dmn_qty"));
			schdL_bldr.addSelect(m8.conv_qty.as("pack_xfr_pack_unit_conv_qty"));
			schdL_bldr.addLeftOuterJoin(t2, bracket(t.sno1.eq(t2.sno1)));
			schdL_bldr.addLeftOuterJoin(m1, bracket(t.loc_cd.eq(m1.loc_cd)));
			schdL_bldr.addLeftOuterJoin(m2, bracket(t.loc_cd.eq(m2.loc_cd)
					.and(t.str_ln_cd.eq(m2.str_ln_cd))));
			schdL_bldr.addLeftOuterJoin(m3, bracket(t.stk_arrv_bp_cd.eq(m3.bp_cd)));
			schdL_bldr.addLeftOuterJoin(m4, bracket(t.gd_cd.eq(m4.gd_cd)));
			schdL_bldr.addLeftOuterJoin(m5, bracket(t.stk_bp_cd.eq(m5.bp_cd)));
			schdL_bldr.addLeftOuterJoin(m6, bracket(t.base_unit_cd.eq(m6.unit_cd)));
			schdL_bldr.addLeftOuterJoin(m7, bracket(t.pack_unit_cd.eq(m7.unit_cd)));
			schdL_bldr.addLeftOuterJoin(m8, bracket(t.itm_cd.eq(m8.itm_cd)
					.and(t.itm_sub1.eq(m8.itm_sub1))
					.and(t.itm_sub2.eq(m8.itm_sub2))
					.and(t.itm_sub3.eq(m8.itm_sub3))
					.and(t.pack_unit_cd.eq(m8.unit_cd))));
			schdL_bldr.addLeftOuterJoin(m9, bracket(t.itm_cd.eq(m9.itm_cd)
					.and(t.itm_sub1.eq(m9.itm_sub1))
					.and(t.itm_sub2.eq(m9.itm_sub2))
					.and(t.itm_sub3.eq(m9.itm_sub3))));
			schdL_bldr.setWhere(t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL0060_MST_INSP_SCHD_S02", schdL, schdL_bldr, hdrL);

			return schdL;
		}
		
		protected void setInspSchdL(MCList<Srch01_RsltR> hdrL, MCList<MST_INSP_SCHD_R> schdL) {
			
			MCIndexKey schdIdx = schdL.createIndex(MST_INSP_SCHD_R.$insp_no);
			for (Srch01_RsltR hdrR : hdrL) {
				if (MSC_INSP_STS_TYP.isJDG(hdrR.insp_sts_typ()) && MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(hdrR.insp_aprv_sts_typ())) {
					continue;
				}
				MCList<MST_INSP_SCHD_R> tgtSchdL = schdL.subList(schdIdx, hdrR.insp_no());
				
				if (!tgtSchdL.isEmpty()) {
					for (MST_INSP_SCHD_R schdR : tgtSchdL) {
						Srch01_RsltSmplR downR = Srch01_RsltSmplR.create();
						
						downR.wg_cd(hdrR.wg_cd());
						downR.itm_cd(schdR.itm_cd());
						downR.itm_sub1(schdR.itm_sub1());
						downR.itm_sub2(schdR.itm_sub2());
						downR.itm_sub3(schdR.itm_sub3());
						downR.so_qty(null);
						downR.smpl_qty(null);
						downR.base_unit_cd(schdR.base_unit_cd());
						downR.base_unit_nm(schdR.getStringNE(Srch01_RsltSmplR.$base_unit_nm));
						downR.base_unit_dec_place(schdR.getNumberNE(Srch01_RsltSmplR.$base_unit_dec_place));
						downR.base_unit_rnd_typ(schdR.getStringNE(Srch01_RsltSmplR.$base_unit_rnd_typ));
						downR.pack_xfr_pack_unit_qty(null);
						downR.pack_xfr_pack_unit_cd(schdR.pack_unit_cd());
						downR.pack_xfr_pack_unit_nm(schdR.getStringNE(Srch01_RsltSmplR.$pack_xfr_pack_unit_nm));
						downR.pack_xfr_pack_unit_dec_place(schdR.getNumberNE(Srch01_RsltSmplR.$pack_xfr_pack_unit_dec_place));
						downR.pack_xfr_pack_unit_dmn_qty(schdR.getNumberNE(Srch01_RsltSmplR.$pack_xfr_pack_unit_dmn_qty));
						downR.pack_xfr_pack_unit_conv_qty(schdR.getNumberNE(Srch01_RsltSmplR.$pack_xfr_pack_unit_conv_qty));
						downR.pack_xfr_base_unit_qty(null);
						downR.pack_xfr_base_unit_cd(schdR.base_unit_cd());
						downR.pack_xfr_base_unit_nm(schdR.getStringNE(Srch01_RsltSmplR.$base_unit_nm));
						downR.pack_xfr_base_unit_dec_place(schdR.getNumberNE(Srch01_RsltSmplR.$base_unit_dec_place));
						downR.pack_xfr_base_unit_rnd_typ(schdR.getStringNE(Srch01_RsltSmplR.$base_unit_rnd_typ));
						downR.loc_cd(schdR.loc_cd());
						downR.loc_nm(schdR.getString(Srch01_RsltSmplR.$loc_nm));
						downR.str_ln_tgt_flg(isSame(schdR.getStringNE(Srch01_RsltSmplR.$str_ln_tgt_flg), "1"));
						downR.str_ln_cd(schdR.str_ln_cd());
						downR.str_ln_nm(schdR.getString(Srch01_RsltSmplR.$str_ln_nm));
						downR.stk_arrv_bp_cd(schdR.stk_arrv_bp_cd());
						downR.stk_arrv_bp_nm(schdR.getString(Srch01_RsltSmplR.$stk_arrv_bp_nm));
						downR.gd_cd(schdR.gd_cd());
						downR.gd_nm(schdR.getString(Srch01_RsltSmplR.$gd_nm));
						downR.quality_typ(schdR.quality_typ());
						downR.stk_insp_typ(schdR.stk_insp_typ());
						downR.stk_id_typ(schdR.stk_id_typ());
						downR.stk_bp_cd(schdR.stk_bp_cd());
						downR.stk_bp_nm(schdR.getString(Srch01_RsltSmplR.$stk_bp_nm));
						downR.lot_no(schdR.lot_no());
						downR.sublot_no(schdR.sublot_no());
						downR.sno1(schdR.sno1());
						downR.sno2(schdR.sno2());
						downR.sno3(schdR.sno3());
						downR.sno4(schdR.sno4());
						downR.act_dt(null);
						downR.act_hm(null);
						downR.ac_dt(null);
						downR.bd_dpt_cd(null);
						downR.bd_dpt_nm(null);
						downR.insp_smpl_act_no(null);
						downR.insp_no(schdR.insp_no());
						downR.insp_schd_no(schdR.insp_schd_no());
						downR.insp_act_no(null);
						downR.trd_rmrks(null);
						downR.intr_rmrks(null);
						downR.sub_char1(null);
						downR.sub_char2(null);
						downR.sub_char3(null);
						downR.lims_flg(false);
						downR.ext_sys_cd(null);
						downR.ext_sys_nm(null);
						downR.ext_insp_smpl_act_no(null);
						
						if (MSC_INSP_TYP.isACCPT(schdR.insp_typ())) {
							// 受入検査の場合、検査予定の在庫識別区分は仕入検収前で固定だが、
							// 抜取実績前までに仕入実績を計上された場合を考慮し、自社在庫で固定とする。
							if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(schdR.stk_id_typ())) {
								downR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
								downR.stk_bp_cd(MAC_STR.NULL_VAL.value());
							}
							if (schdR.in_prmt_insp_flg()) {
								downR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
								downR.fix_no(MAC_STR.NULL_VAL.value());
								downR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
							}
							else {
								downR.fix_no_typ(MSC_FIX_NO_TYP.ARR_ACT_NO.value());
								downR.fix_no(schdR.src_no4());
							}
						}
						else if (MSC_INSP_TYP.isPRDCT(schdR.insp_typ())) {
							if (schdR.in_prmt_insp_flg()) {
								downR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
								downR.fix_no(MAC_STR.NULL_VAL.value());
								downR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
							}
							else {
								downR.fix_no_typ(MSC_FIX_NO_TYP.YIELD_ACT_NO.value());
								downR.fix_no(schdR.src_no4());
							}
						}
						else if (MSC_INSP_TYP.isLOT(schdR.insp_typ())) {
							if (hdrR.lmt_up_flg()) {
								downR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
								downR.fix_no(MAC_STR.NULL_VAL.value());
								downR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
							}
							else {
								downR.fix_no_typ(MSC_FIX_NO_TYP.INSP_SCHD_NO.value());
								downR.fix_no(schdR.insp_schd_no());
							}
						}
						down2().add(downR);
					}
				}
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 画面で起算日を変更した場合に、有効期限、使用期限を取得する<br>
	 */
	public class Srch02 extends MSBFL_InspActLstReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			
			callLotSrv();
			
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * ロット管理情報を取得する。
		 */
		protected void callLotSrv() {
			MSBFL_LotService.Lot_Srch02 o = MSBFL_LotService.crtLot_Srch02();
			addAll(o.up0(), up0(), createMap_Lot_Srch02_CndR_Srch02_CndR());
			o.exec();
			
			String[] destCols = new String[] {Srch02_CndR.$lmt_dt_frm, Srch02_CndR.$vld_dt, Srch02_CndR.$lmt_dt};
			String[] srcCols = new String[] {Lot_Srch02_RsltR.$lmt_dt_frm, Lot_Srch02_RsltR.$vld_dt, Lot_Srch02_RsltR.$lmt_dt};
			copyByPegNo(up0(), destCols, o.down0(), srcCols);
		}

		protected Map_Lot_Srch02_CndR_Srch02_CndR<Lot_Srch02_CndR, Srch02_CndR> createMap_Lot_Srch02_CndR_Srch02_CndR() {
			return new Map_Lot_Srch02_CndR_Srch02_CndR<Lot_Srch02_CndR, Srch02_CndR>();
		}

		public class Map_Lot_Srch02_CndR_Srch02_CndR<D extends Lot_Srch02_CndR, S extends Srch02_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Srch02_CndR.$peg_no, Srch02_CndR.$peg_no);
				addColumnPathMap(Lot_Srch02_CndR.$insp_no, Srch02_CndR.$insp_no);
				addColumnPathMap(Lot_Srch02_CndR.$lmt_dt_frm, Srch02_CndR.$lmt_dt_frm);
			}
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 検査実績ヘッダを登録・訂正する前に、チェックを実行する<br>
	 */
	public class Chk01 extends MSBFL_InspActLstReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			
			MCList<Chk01_HdrR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callInspActServiceChk01(notErrL);
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査指図の更新カウンタチェック
			msgL.addAll(chkInstUpdCnt());

			// 検査実績の更新カウンタチェック
			msgL.addAll(chkActUpdCnt());

			// データ補完
			compData();

			setRsltSubErrFlg();

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk01_HdrR> notErrL = getChkList(up0());

			// 場所の更新権限のチェック
			msgL.addAll(dacChk(notErrL));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			setHdrErrFlg();
			down0().setAll(up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}

		/**
		 * ヘッダ電文のエラーＦＬＧを設定する。
		 */
		protected void setHdrErrFlg() {
			
			MCList<Chk01_DtlR> subDtlL = up1().subList(Chk01_DtlR.$err_flg, true);
			MCList<Chk01_RsltSmplR> subSmplL = up2().subList(Chk01_RsltSmplR.$err_flg, true);
			String inspNo = null;
			MCIndexKey idxkey = up0().createIndex(Chk01_HdrR.$insp_no);
			for (Chk01_DtlR r : subDtlL) {
				if (!isSame(inspNo, r.insp_no())) {
					up0().getFirst(idxkey, r.insp_no()).err_flg(true);
					inspNo = r.insp_no();
				}
			}
			inspNo = null;
			for (Chk01_RsltSmplR r : subSmplL) {
				if (!isSame(inspNo, r.insp_no())) {
					up0().getFirst(idxkey, r.insp_no()).err_flg(true);
					inspNo = r.insp_no();
				}
			}
		}

		/**
		 * ヘッダにエラーがある場合、対する明細にerr_flgを設定する。
		 */
		protected void setRsltSubErrFlg() {
			MCIndexKey dtlIdxkey = up1().createIndex(Chk01_DtlR.$insp_no);
			MCIndexKey smplIdxkey = up2().createIndex(Chk01_RsltSmplR.$insp_no);
			for (Chk01_HdrR hdrR : up0()) {
				if (hdrR.err_flg()) {
					MCList<Chk01_DtlR> subDtlL = up1().subList(dtlIdxkey, hdrR.insp_no());
					if (!subDtlL.isEmpty()) {
						subDtlL.setValueNE(Chk01_DtlR.$err_flg, true);
					}
					MCList<Chk01_RsltSmplR> subSmplL = up2().subList(smplIdxkey, hdrR.insp_no());
					if (!subSmplL.isEmpty()) {
						subSmplL.setValueNE(Chk01_RsltSmplR.$err_flg, true);
					}
				}
			}
		}

		/**
		 * 検査指図更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkInstUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_INSP_INST_R> selectL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.insp_no);

			MCList<Chk01_HdrR> bindL = up0().groupBy(Chk01_HdrR.$insp_no);
			bindL.sort(Chk01_HdrR.$insp_no);

			dbSelectKeyForUpdateNoWait("MSBFL0060_MST_INSP_INST_S01", selectL, selectL_bldr, bindL);

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_INST_R.$insp_no);
			for (Chk01_HdrR r : up0()) {
				MST_INSP_INST_R selectR = selectL.getFirst(idxkey, r.insp_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_HdrR.$inst_upd_cntr, selectR));
				setErrFlg(r, msgL);
				if (!isNull(selectR)) {
					// データ補完
					r.insp_freq(selectR.insp_freq());
					r.src_no1(selectR.src_no1());
					r.src_no2(selectR.src_no2());
					r.insp_typ(selectR.insp_typ());
					r.insp_mtd_typ(selectR.insp_mtd_typ());
					r.insp_sts_typ(selectR.insp_sts_typ());
					r.insp_aprv_sts_typ(selectR.insp_aprv_sts_typ());
					r.lot_no(selectR.lot_no());
					r.sublot_no(selectR.sublot_no());
					r.sppl_cd(selectR.sppl_cd());
					r.maker_cd(selectR.maker_cd());
					r.mfg_loc_cd(selectR.mfg_loc_cd());
					r.from_site_cd(selectR.from_site_cd());
					r.base_unit_qty(selectR.base_unit_qty());
					r.base_unit_cd(selectR.base_unit_cd());
					r.lmt_up_flg(selectR.lmt_up_flg());

					if (!isSame(r.itm_cd(), selectR.itm_cd())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_HdrR.$itm_cd, selectR.itm_cd(), r));
					}
					if (!isSame(r.itm_sub1(), selectR.itm_sub1())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_HdrR.$itm_sub1, selectR.itm_sub1(), r));
					}
					if (!isSame(r.itm_sub2(), selectR.itm_sub2())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_HdrR.$itm_sub2, selectR.itm_sub2(), r));
					}
					if (!isSame(r.itm_sub3(), selectR.itm_sub3())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_HdrR.$itm_sub3, selectR.itm_sub3(), r));
					}
				}
			}

			return msgL;
		}

		/**
		 * 検査実績更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkActUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_HdrR> subL = MCList.create(Chk01_HdrR.class);
			for (Chk01_HdrR r : up0()) {
				if (!r.err_flg() && !isNull(r.insp_act_no())) {
					subL.add(r);
				}
			}

			if (subL.isEmpty()) {
				return msgL;
			}

			MCList<MST_INSP_ACT_R> selectL = MCList.create(MST_INSP_ACT_R.class);
			MST_INSP_ACT_R t = MST_INSP_ACT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.insp_act_no);

			MCList<Chk01_HdrR> bindL = subL.groupBy(Chk01_HdrR.$insp_act_no);
			bindL.sort(Chk01_HdrR.$insp_act_no);

			dbSelectKeyForUpdateNoWait("MSBFL0060_MST_INSP_ACT_S01", selectL, selectL_bldr, bindL);

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_ACT_R.$insp_act_no);
			for (Chk01_HdrR r : subL) {
				MST_INSP_ACT_R selectR = selectL.getFirst(idxkey, r.insp_act_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_HdrR.$act_upd_cntr, selectR));
				r.stt_can_ac_dt(r.st_tm());
			}

			return msgL;
		}

		/**
		 * 場所の更新権限のチェックをします。
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList dacChk(MCList<Chk01_HdrR> upL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk01_HdrR r : upL) {
				if (MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
					msgL.addAll(checkWritableLocCdDac(r, Chk01_HdrR.$mfg_loc_cd));
				}
				else {
					MCMessageList msgTmpL = new MCMessageList();
					MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
					MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
					MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
					schdL_bldr.setWhere(t.insp_no.eq(bind("insp_no")), r);
					dbSelect("MSBFL0060_MST_INSP_SCHD_S03", schdL, schdL_bldr);
					for (MST_INSP_SCHD_R schdR : schdL) {
						schdR.setAttributes(r);
						msgTmpL.addAll(checkWritableLocCdDac(schdR, MST_INSP_SCHD_R.$loc_cd));
					}
					if (!schdL.isEmpty() && schdL.size() == msgTmpL.size()) {
						r.err_flg(true);
						msgL.addAll(msgTmpL);
					}
				}
			}

			return msgL;
		}

		/**
		 * データ補完
		 */
		protected void compData() {

			// 検査実績明細
			compDataDtl();

			// 抜取検査明細
			compDataSmpl();
			
			// 抜取検査明細から検査予定ＮＯを除外する
			rmvInspSchdNoFromDataSmpl();

		}

		/**
		 * 検査実績明細を補完する。
		 */
		protected void compDataDtl() {
			MCList<Chk01_DtlR> dtlL = MCList.create(Chk01_DtlR.class);
			
			MCList<Chk01_HdrR> subUpL = up0().subList(r -> isNotTtlRow(r));
			if (!subUpL.isEmpty()) {
				MCList<MST_INSP_SCHD_R> schdL = getInspSchdL(subUpL);
				dtlL.addAll(getDtlIns(subUpL, schdL));
				
				MCList<MST_INSP_ACT_D_R> actdL = getActDL(subUpL);
				if (!actdL.isEmpty()) {
					dtlL.addAll(getDtlUpd(subUpL, actdL));
				}

				up1().addAll(dtlL);
				setPegNo(up1());
			}
		}

		protected boolean isNotTtlRow(Chk01_HdrR r) {
			if (isNull(r.insp_mtd_typ()) || MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
				return false;
			}

			return true;
		}

		/**
		 * 抜取検査実績を補完する。
		 */
		protected void compDataSmpl() {
			MCList<MST_INSP_SCHD_R> schdBindL = MCList.create(MST_INSP_SCHD_R.class);
			MCList<MST_INSP_SMPL_ACT_R> inspSmplActBindL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			for (Chk01_RsltSmplR r : up2()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					MST_INSP_SCHD_R schdBindR = MST_INSP_SCHD_R.create();
					schdBindR.insp_schd_no(r.insp_schd_no());
					schdBindL.add(schdBindR);
				}
				else if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MST_INSP_SMPL_ACT_R inspSmplActBindR = MST_INSP_SMPL_ACT_R.create();
					inspSmplActBindR.insp_smpl_act_no(r.insp_smpl_act_no());
					inspSmplActBindL.add(inspSmplActBindR);
				}
			}

			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			dbSelectKey("MSBFL0060_MST_INSP_SCHD_S04", schdL,
					MCQueryApiBuilder.create(MST_INSP_SCHD_R.create("T")), schdBindL);
			MCList<MST_INSP_SMPL_ACT_R> inspSmplActL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			dbSelectKey("MSBFL0060_MST_INSP_SMPL_ACT_S02", inspSmplActL,
					MCQueryApiBuilder.create(MST_INSP_SMPL_ACT_R.create("T")),
					inspSmplActBindL);

			for (MST_INSP_SCHD_R schdR : schdL) {
				if (MSC_INSP_TYP.isACCPT(schdR.insp_typ())) {
					schdR.addStringColumn(Chk01_RsltSmplR.$fix_no_typ, MSC_FIX_NO_TYP.ARR_ACT_NO.value());
					schdR.addStringColumn(Chk01_RsltSmplR.$fix_no, schdR.src_no4());
				}
			}

			MCList<MST_STK_R> stkL = MCList.create(MST_STK_R.class);
			MST_STK_R stkL_t = MST_STK_R.create("T");
			MCQueryApiBuilder stkL_bldr = MCQueryApiBuilder.create(stkL_t);
			stkL_bldr.setWhere(stkL_t.fix_no_typ.eq(bind("fix_no_typ")));
			stkL_bldr.addWhereWithAnd(stkL_t.fix_no.eq(bind("fix_no")));
			dbSelect("MSBFL0060_MST_STK_S02", stkL, stkL_bldr, schdL);

			MCList<MST_ARR_ACT_R> arrL = MCList.create(MST_ARR_ACT_R.class);
			MST_ARR_ACT_R arrL_t = MST_ARR_ACT_R.create("T");
			MCQueryApiBuilder arrL_bldr = MCQueryApiBuilder.create(arrL_t);
			arrL_bldr.setSelect(arrL_t.arr_act_no);
			arrL_bldr.setWhere(arrL_t.arr_act_no.eq(bind("fix_no")));
			arrL_bldr.addWhereWithAnd(arrL_t.sync_flg.eq(value(true)));
			dbSelect("MSBFL0060_MST_ARR_ACT_S01", arrL, arrL_bldr, schdL);

			MCList<MST_INSP_ACT_D_R> actDL = MCList.create(MST_INSP_ACT_D_R.class);
			MST_INSP_ACT_D_R actDL_t = MST_INSP_ACT_D_R.create("T");
			MCQueryApiBuilder actDL_bldr = MCQueryApiBuilder.create(actDL_t);
			actDL_bldr.setWhere(actDL_t.fix_no_typ.eq(bind("fix_no_typ")));
			actDL_bldr.addWhereWithAnd(actDL_t.fix_no.eq(bind("fix_no")));
			dbSelect("MSBFL0060_MST_INSP_ACT_D_S03", actDL, actDL_bldr, schdL);

			MCIndexKey schdIdxkey = schdL.createIndex(MST_INSP_SCHD_R.$insp_schd_no);
			MCIndexKey inspSmplActIdxkey = inspSmplActL.createIndex(MST_INSP_SMPL_ACT_R.$insp_smpl_act_no);
			MCIndexKey stkIdxkey = stkL.createIndex(MST_STK_R.$fix_no_typ, MST_STK_R.$fix_no);
			MCIndexKey hdrIdxkey = up0().createIndex(Chk01_HdrR.$insp_no);
			MCIndexKey arrIdxkey = arrL.createIndex(MST_ARR_ACT_R.$arr_act_no);
			MCIndexKey actDIdxkey = actDL.createIndex(MST_INSP_ACT_D_R.$fix_no_typ, MST_INSP_ACT_D_R.$fix_no);

			for (Chk01_RsltSmplR r : up2()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					Chk01_HdrR hdrR = up0().getFirst(hdrIdxkey, r.insp_no());
					MST_INSP_SCHD_R schdR = schdL.getFirst(schdIdxkey, r.insp_schd_no());
					if (!isNull(schdR)) {
						r.itm_cd(schdR.itm_cd());
						r.itm_sub1(schdR.itm_sub1());
						r.itm_sub2(schdR.itm_sub2());
						r.itm_sub3(schdR.itm_sub3());
						r.base_unit_cd(schdR.base_unit_cd());
						r.pack_xfr_base_unit_cd(schdR.base_unit_cd());
						r.quality_typ(schdR.quality_typ());
						if (MSC_INSP_STS_TYP.isJDG(hdrR.insp_sts_typ())) {
							if (MSC_INSP_APRV_STS_TYP.isJUDG_OPN(hdrR.insp_aprv_sts_typ())) {
								r.stk_insp_typ(MSC_STK_INSP_TYP.WAIT_JUDG.value());
							}
							else {
								r.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
							}
						}
						else {
							r.stk_insp_typ(MSC_STK_INSP_TYP.ING.value());
						}
						r.stk_id_typ(schdR.stk_id_typ());
						r.stk_bp_cd(schdR.stk_bp_cd());
						r.gd_cd(schdR.gd_cd());
						r.stk_arrv_bp_cd(schdR.stk_arrv_bp_cd());
						r.lot_no(schdR.lot_no());
						r.sublot_no(schdR.sublot_no());
						r.sno1(schdR.sno1());
						r.sno1_mng_typ(schdR.sno1_mng_typ());
						r.sno2(schdR.sno2());
						r.sno2_mng_typ(schdR.sno2_mng_typ());
						r.sno3(schdR.sno3());
						r.sno3_mng_typ(schdR.sno3_mng_typ());
						r.sno4(schdR.sno4());
						r.sno4_mng_typ(schdR.sno4_mng_typ());
						if (MSC_INSP_TYP.isACCPT(schdR.insp_typ())) {
							MST_STK_R stkR = stkL.getFirst(stkIdxkey, MSC_FIX_NO_TYP.ARR_ACT_NO.value(), schdR.src_no4());
							if (isNull(stkR)) {
								// 現状在庫が存在しない場合は何もしない（検査予定の値がそのまま設定される）
								
								// 入荷実績で仕入同時計上している場合
								MST_ARR_ACT_R arrR = arrL.getFirst(arrIdxkey, schdR.src_no4());
								if (!isNull(arrR)) {
									r.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
									r.stk_bp_cd(MAC_STR.NULL_VAL.value());
								}
								// 仕入実績登録後に、検査実績を登録していて、抜取実績を後から登録する場合
								MST_INSP_ACT_D_R actDR = actDL.getFirst(actDIdxkey, MSC_FIX_NO_TYP.ARR_ACT_NO.value(), schdR.src_no4());
								if (!isNull(actDR)) {
									r.stk_id_typ(actDR.stk_id_typ());
									r.stk_bp_cd(actDR.stk_bp_cd());
								}
							}
							else {
								r.stk_id_typ(stkR.stk_id_typ());
								r.stk_bp_cd(stkR.stk_bp_cd());
								r.stk_arrv_bp_cd(stkR.stk_arrv_bp_cd());
							}
							if (schdR.in_prmt_insp_flg()) {
								if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(schdR.stk_id_typ())) {
									r.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
									r.stk_bp_cd(MAC_STR.NULL_VAL.value());
								}
								r.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
								r.fix_no(MAC_STR.NULL_VAL.value());
								r.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
							}
							else {
								r.fix_no_typ(MSC_FIX_NO_TYP.ARR_ACT_NO.value());
								r.fix_no(schdR.src_no4());
							}
						}
						else if (MSC_INSP_TYP.isPRDCT(schdR.insp_typ())) {
							if (schdR.in_prmt_insp_flg()) {
								r.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
								r.fix_no(MAC_STR.NULL_VAL.value());
								r.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
							}
							else {
								r.fix_no_typ(MSC_FIX_NO_TYP.YIELD_ACT_NO.value());
								r.fix_no(schdR.src_no4());
							}
						}
						else if (MSC_INSP_TYP.isLOT(schdR.insp_typ())) {
							if (hdrR.lmt_up_flg()) {
								r.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
								r.fix_no(MAC_STR.NULL_VAL.value());
								r.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
							}
							else {
								r.fix_no_typ(MSC_FIX_NO_TYP.INSP_SCHD_NO.value());
								r.fix_no(schdR.insp_schd_no());
							}
						}
					}
				}
				else if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MST_INSP_SMPL_ACT_R inspSmplActR = inspSmplActL.getFirst(inspSmplActIdxkey, r.insp_smpl_act_no());
					if (!isNull(inspSmplActR)) {
						r.itm_cd(inspSmplActR.itm_cd());
						r.itm_sub1(inspSmplActR.itm_sub1());
						r.itm_sub2(inspSmplActR.itm_sub2());
						r.itm_sub3(inspSmplActR.itm_sub3());
						r.base_unit_cd(inspSmplActR.base_unit_cd());
						if (!isNull(inspSmplActR.pack_xfr_base_unit_cd())) {
							r.pack_xfr_base_unit_cd(inspSmplActR.pack_xfr_base_unit_cd());
						}
						else {
							r.pack_xfr_base_unit_cd(inspSmplActR.base_unit_cd());
						}
						r.quality_typ(inspSmplActR.quality_typ());
						r.stk_insp_typ(inspSmplActR.stk_insp_typ());
						r.stk_id_typ(inspSmplActR.stk_id_typ());
						r.stk_bp_cd(inspSmplActR.stk_bp_cd());
						r.gd_cd(inspSmplActR.gd_cd());
						r.stk_arrv_bp_cd(inspSmplActR.stk_arrv_bp_cd());
						r.lot_no(inspSmplActR.lot_no());
						r.sublot_no(inspSmplActR.sublot_no());
						r.sno1(inspSmplActR.sno1());
						r.sno1_mng_typ(inspSmplActR.sno1_mng_typ());
						r.sno2(inspSmplActR.sno2());
						r.sno2_mng_typ(inspSmplActR.sno2_mng_typ());
						r.sno3(inspSmplActR.sno3());
						r.sno3_mng_typ(inspSmplActR.sno3_mng_typ());
						r.sno4(inspSmplActR.sno4());
						r.sno4_mng_typ(inspSmplActR.sno4_mng_typ());
						r.fix_no_typ(inspSmplActR.fix_no_typ());
						r.fix_no(inspSmplActR.fix_no());
						r.can_ac_dt(inspSmplActR.ac_dt());
					}
				}
			}
		}
		
		// 紐づく現状在庫がある(出来高前検査実績でなく、検査中使用許可品でもない)場合に、
		// 抜取検査実績の新規行の検査予定ＮＯを上り電文から除外する
		// (検索時に設定された値が登録時にそのまま登録されてしまうため)
		protected void rmvInspSchdNoFromDataSmpl() {
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R schdContainer = MST_INSP_SCHD_R.create();
			MCQueryApiBuilder schd_bldr = MCQueryApiBuilder.create(schdContainer);
			schd_bldr.setWhere(schdContainer.insp_no.eq(bind(Chk01_HdrR.$insp_no)));
			dbSelect("MSBFL0060_MST_INSP_SCHD_S08", schdL, schd_bldr, up0());

			for (MST_INSP_SCHD_R schdR : schdL) {
				if (MSC_INSP_TYP.isACCPT(schdR.insp_typ())) {
					schdR.addStringColumn(Chk01_DtlR.$fix_no_typ, MSC_FIX_NO_TYP.ARR_ACT_NO.value());
					schdR.addStringColumn(Chk01_DtlR.$fix_no, schdR.src_no4());
				}
				else if (MSC_INSP_TYP.isPRDCT(schdR.insp_typ())) {
					schdR.addStringColumn(Chk01_DtlR.$fix_no_typ, MSC_FIX_NO_TYP.YIELD_ACT_NO.value());
					schdR.addStringColumn(Chk01_DtlR.$fix_no, schdR.src_no4());
				}
				else if (MSC_INSP_TYP.isLOT(schdR.insp_typ())) {
					schdR.addStringColumn(Chk01_DtlR.$fix_no_typ, MSC_FIX_NO_TYP.INSP_SCHD_NO.value());
					schdR.addStringColumn(Chk01_DtlR.$fix_no, schdR.insp_schd_no());
				}
			}

			MCList<MST_STK_R> stkL = MCList.create(MST_STK_R.class);
			MST_STK_R stkContainer = MST_STK_R.create();
			MCQueryApiBuilder stk_bldr = MCQueryApiBuilder.create(stkContainer);
			stk_bldr.setWhere(stkContainer.fix_no_typ.eq(bind(Chk01_DtlR.$fix_no_typ)));
			stk_bldr.addWhereWithAnd(stkContainer.fix_no.eq(bind(Chk01_DtlR.$fix_no)));
			dbSelect("MSBFL0060_MST_STK_S05", stkL, stk_bldr, schdL);

			MCIndexKey schdIdxkey = schdL.createIndex(MST_INSP_SCHD_R.$insp_schd_no);
			MCIndexKey stkIdxkey = stkL.createIndex(MST_STK_R.$fix_no_typ, MST_STK_R.$fix_no);
			for (Chk01_RsltSmplR r : up2()) {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					continue;
				}

				MST_INSP_SCHD_R schdR = schdL.getFirst(schdIdxkey, r.insp_schd_no());
				MST_STK_R stkR = null;
				if (!isNull(schdR.src_no4()) && MSC_INSP_TYP.isACCPT(schdR.insp_typ())) {
					stkR = stkL.getFirst(stkIdxkey, MSC_FIX_NO_TYP.ARR_ACT_NO.value(), schdR.src_no4());
				}
				if (!isNull(schdR.src_no4()) && MSC_INSP_TYP.isPRDCT(schdR.insp_typ())) {
					stkR = stkL.getFirst(stkIdxkey, MSC_FIX_NO_TYP.YIELD_ACT_NO.value(), schdR.src_no4());
				}
				if (!isNull(schdR.insp_schd_no()) && MSC_INSP_TYP.isLOT(schdR.insp_typ())) {
					stkR = stkL.getFirst(stkIdxkey, MSC_FIX_NO_TYP.INSP_SCHD_NO.value(), schdR.insp_schd_no());
				}

				if (!isNull(stkR)) {
					r.insp_schd_no(null);
				}
			}
		}

		protected MCList<MST_INSP_SCHD_R> getInspSchdL(MCList<Chk01_HdrR> hdrL) {
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			schdL_bldr.setWhere(t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL0060_MST_INSP_SCHD_S05", schdL, schdL_bldr, hdrL);
			return schdL;
		}
		
		protected MCList<Chk01_DtlR> getDtlIns(MCList<Chk01_HdrR> hdrL, MCList<MST_INSP_SCHD_R> schdL) {
			MCList<Chk01_DtlR> dtlL = MCList.create(Chk01_DtlR.class);
			MCIndexKey idxkey = schdL.createIndex(MST_INSP_SCHD_R.$insp_no);
			MCList<MST_INSP_STT_D_R> sttL = MCList.create(MST_INSP_STT_D_R.class);
			MST_INSP_STT_D_R sttL_t = MST_INSP_STT_D_R.create("T");
			MCQueryApiBuilder sttL_bldr = MCQueryApiBuilder.create(sttL_t);
			sttL_bldr.setSelect(sttL_t.fix_no, sttL_t.fix_no_typ, sttL_t.ac_dt);
			sttL_bldr.setWhere(sttL_t.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL0060_MST_INSP_STT_D_S01", sttL, sttL_bldr, hdrL);
			MCIndexKey sttIdxkey = sttL.createIndex(MST_INSP_STT_D_R.$fix_no, MST_INSP_STT_D_R.$fix_no_typ);
			for (Chk01_HdrR hdrR : hdrL) {
				MCList<MST_INSP_SCHD_R> tmpSchdL = schdL.subList(idxkey, hdrR.insp_no());
				if (tmpSchdL.isEmpty()) {
					continue;
				}
				if (MSC_INSP_TYP.isPRCD(hdrR.insp_typ())
						|| hdrR.lmt_up_flg()
						|| tmpSchdL.get(0).in_prmt_insp_flg()
						|| MSC_INSP_STS_TYP.isJDG(hdrR.insp_sts_typ())) {
					continue;
				}

				MCList<MST_STK_R> stkL = MCList.create(MST_STK_R.class);
				MST_STK_R stkL_t = MST_STK_R.create("T");
				MCQueryApiBuilder stkL_bldr = MCQueryApiBuilder.create(stkL_t);
				if (MSC_INSP_TYP.isACCPT(hdrR.insp_typ())) {
					stkL_bldr.setWhere(stkL_t.fix_no_typ.eq(bind("1")), MSC_FIX_NO_TYP.ARR_ACT_NO.value());
					stkL_bldr.addWhereWithAnd(stkL_t.fix_no.eq(bind("src_no4")));
				}
				else if (MSC_INSP_TYP.isPRDCT(hdrR.insp_typ())) {
					stkL_bldr.setWhere(stkL_t.fix_no_typ.eq(bind("1")), MSC_FIX_NO_TYP.YIELD_ACT_NO.value());
					stkL_bldr.addWhereWithAnd(stkL_t.fix_no.eq(bind("src_no4")));
				}
				else if (MSC_INSP_TYP.isLOT(hdrR.insp_typ())) {
					stkL_bldr.setWhere(stkL_t.fix_no_typ.eq(bind("1")), MSC_FIX_NO_TYP.INSP_SCHD_NO.value());
					stkL_bldr.addWhereWithAnd(stkL_t.fix_no.eq(bind("insp_schd_no")));
				}
				stkL_bldr.addWhereWithAnd(bracket(stkL_t.stk_insp_typ.eq(value(MSC_STK_INSP_TYP.YET.value())).or(stkL_t.stk_insp_typ
								.eq(value(MSC_STK_INSP_TYP.ING.value())))));
				dbSelect("MSBFL0060_MST_STK_S03", stkL, stkL_bldr, tmpSchdL);

				
				for (MST_STK_R stkR : stkL) {
					MST_INSP_STT_D_R sttR = sttL.getFirst(sttIdxkey, stkR.fix_no(), stkR.fix_no_typ());
					Chk01_DtlR dtlR = Chk01_DtlR.create();
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					dtlR.insp_act_no(hdrR.insp_act_no());
					dtlR.insp_no(hdrR.insp_no());
					dtlR.itm_cd(stkR.itm_cd());
					dtlR.itm_sub1(stkR.itm_sub1());
					dtlR.itm_sub2(stkR.itm_sub2());
					dtlR.itm_sub3(stkR.itm_sub3());
					dtlR.loc_cd(stkR.loc_cd());
					dtlR.str_ln_cd(stkR.str_ln_cd());
					dtlR.stk_arrv_bp_cd(stkR.stk_arrv_bp_cd());
					dtlR.gd_cd(hdrR.gd_cd());
					dtlR.quality_typ(hdrR.quality_typ());
					dtlR.dfct_rsn_cd(hdrR.dfct_rsn_cd());
					dtlR.stk_insp_typ(stkR.stk_insp_typ());
					dtlR.stk_id_typ(stkR.stk_id_typ());
					dtlR.stk_bp_cd(stkR.stk_bp_cd());
					dtlR.lot_no(stkR.lot_no());
					dtlR.sublot_no(stkR.sublot_no());
					dtlR.sno1(stkR.sno1());
					dtlR.sno2(stkR.sno2());
					dtlR.sno3(stkR.sno3());
					dtlR.sno4(stkR.sno4());
					dtlR.fix_no_typ(stkR.fix_no_typ());
					dtlR.fix_no(stkR.fix_no());
					dtlR.pack_unit_qty(stkR.pack_unit_qty());
					dtlR.pack_unit_cd(stkR.pack_unit_cd());
					dtlR.base_unit_qty(stkR.base_unit_qty());
					dtlR.base_unit_cd(hdrR.base_unit_cd());
					dtlR.pack_xfr_pack_unit_cd(stkR.pack_unit_cd());
					dtlR.pack_xfr_base_unit_cd(hdrR.base_unit_cd());
					dtlR.ac_dt(getAcDt(nvl(hdrR.end_tm(), hdrR.st_tm())));
					// 着手明細の計上日で上り電文の取消計上日を補完する
					if (!isNull(sttR)) {
						dtlR.can_ac_dt(sttR.ac_dt());
					}
					
					dtlL.add(dtlR);
				}
			}
			
			return dtlL;
		}

		/**
		 * 検査実績明細情報を取得する。
		 * 
		 * @param hdrL
		 * @return
		 */
		protected MCList<MST_INSP_ACT_D_R> getActDL(MCList<Chk01_HdrR> hdrL) {
			MCList<MST_INSP_ACT_D_R> actdL = MCList.create(MST_INSP_ACT_D_R.class);
			MST_INSP_ACT_D_R t = MST_INSP_ACT_D_R.create("T");
			MCQueryApiBuilder actdL_bldr = MCQueryApiBuilder.create(t);
			actdL_bldr.setWhere(t.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL0060_MST_INSP_ACT_D_S02", actdL, actdL_bldr, hdrL);
			return actdL;
		}

		/**
		 * 実績明細を作成する。
		 * 
		 * @param hdrL
		 * @param actdL
		 * @return
		 */
		protected MCList<Chk01_DtlR> getDtlUpd(MCList<Chk01_HdrR> hdrL, MCList<MST_INSP_ACT_D_R> actdL) {
			MCList<Chk01_DtlR> dtlL = MCList.create(Chk01_DtlR.class);
			MCIndexKey idx = actdL.createIndex(MST_INSP_ACT_D_R.$insp_act_no);
			
			for (Chk01_HdrR hdrR : hdrL) {
				if (MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ())) {
					continue;
				}
				MCList<MST_INSP_ACT_D_R> tmpActdL = actdL.subList(idx, hdrR.insp_act_no());
				
				for (MST_INSP_ACT_D_R actdR : tmpActdL) {
					Chk01_DtlR dtlR = Chk01_DtlR.create();
					
					dtlR.insp_act_no(actdR.insp_act_no());
					dtlR.insp_act_d_no(actdR.insp_act_d_no());
					dtlR.insp_no(hdrR.insp_no());
					dtlR.itm_cd(actdR.itm_cd());
					dtlR.itm_sub1(actdR.itm_sub1());
					dtlR.itm_sub2(actdR.itm_sub2());
					dtlR.itm_sub3(actdR.itm_sub3());
					dtlR.loc_cd(actdR.loc_cd());
					dtlR.str_ln_cd(actdR.str_ln_cd());
					dtlR.stk_arrv_bp_cd(actdR.stk_arrv_bp_cd());
					if (!isNull(hdrR.end_tm())) {
						dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						dtlR.gd_cd(hdrR.gd_cd());
						dtlR.quality_typ(hdrR.quality_typ());
						dtlR.dfct_rsn_cd(hdrR.dfct_rsn_cd());
						dtlR.base_unit_cd(hdrR.base_unit_cd());
					}
					else {
						dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					dtlR.stk_insp_typ(actdR.stk_insp_typ());
					dtlR.stk_id_typ(actdR.stk_id_typ());
					dtlR.stk_bp_cd(actdR.stk_bp_cd());
					dtlR.lot_no(actdR.lot_no());
					dtlR.sublot_no(actdR.sublot_no());
					dtlR.sno1(actdR.sno1());
					dtlR.sno2(actdR.sno2());
					dtlR.sno3(actdR.sno3());
					dtlR.sno4(actdR.sno4());
					dtlR.fix_no_typ(actdR.fix_no_typ());
					dtlR.fix_no(actdR.fix_no());
					dtlR.pack_unit_qty(actdR.pack_unit_qty());
					dtlR.pack_unit_cd(actdR.pack_unit_cd());
					dtlR.base_unit_qty(actdR.base_unit_qty());
					dtlR.pack_xfr_pack_unit_cd(actdR.pack_xfr_pack_unit_cd());
					dtlR.pack_xfr_base_unit_cd(actdR.pack_xfr_base_unit_cd());
					dtlR.can_ac_dt(actdR.ac_dt());
					dtlR.ac_dt(getAcDt(nvl(hdrR.end_tm(), hdrR.st_tm())));
					
					dtlL.add(dtlR);
				}
			}
			
			return dtlL;
		}

		protected void callInspActServiceChk01(MCList<Chk01_HdrR> notErrL) {
			MSBFL_InspActService.InspAct_Chk01 o = MSBFL_InspActService.crtInspAct_Chk01();
			
			MCIndexKey dtlIdx = up1().createIndex(Chk01_DtlR.$insp_no);
			MCIndexKey smplIdx = up2().createIndex(Chk01_RsltSmplR.$insp_no);
			for (Chk01_HdrR r : notErrL) {
				InspAct_Chk01_HdrR hdr = InspAct_Chk01_HdrR.create();
				copy(hdr, r, createMap_InspAct_Chk01_HdrR_Chk01_HdrR());
				o.up0().add(hdr);
				addAll(o.up1(), up1().subList(dtlIdx, r.insp_no()), createMap_InspAct_Chk01_DtlR_Chk01_DtlR());
				addAll(o.up2(), up2().subList(smplIdx, r.insp_no()), createMap_InspAct_Chk01_SmplR_Chk01_RsltSmplR());
			}
			
			o.exec();
			
			String[] dest0Cols = new String[] {Chk01_HdrR.$base_unit_qty, Chk01_HdrR.$err_flg};
			String[] src0Cols = new String[] {InspAct_Chk01_HdrR.$base_unit_qty, InspAct_Chk01_HdrR.$err_flg};
			copyByPegNo(notErrL, dest0Cols, o.down0(), src0Cols);
			String[] dest1Cols = new String[] {Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub2,
					Chk01_DtlR.$itm_sub3, Chk01_DtlR.$lot_no, Chk01_DtlR.$sublot_no,
					Chk01_DtlR.$base_unit_cd, Chk01_DtlR.$pack_xfr_base_unit_cd, Chk01_DtlR.$ac_dt,
					Chk01_DtlR.$sno1_mng_typ, Chk01_DtlR.$sno2_mng_typ, Chk01_DtlR.$sno3_mng_typ,
					Chk01_DtlR.$sno4_mng_typ, Chk01_DtlR.$rmrks_upd_flg, Chk01_DtlR.$err_flg};
			String[] src1Cols = new String[] {InspAct_Chk01_DtlR.$itm_cd, InspAct_Chk01_DtlR.$itm_sub1, InspAct_Chk01_DtlR.$itm_sub2,
					InspAct_Chk01_DtlR.$itm_sub3, InspAct_Chk01_DtlR.$lot_no, InspAct_Chk01_DtlR.$sublot_no, 
					InspAct_Chk01_DtlR.$base_unit_cd, InspAct_Chk01_DtlR.$pack_xfr_base_unit_cd, InspAct_Chk01_DtlR.$ac_dt,
					InspAct_Chk01_DtlR.$sno1_mng_typ, InspAct_Chk01_DtlR.$sno2_mng_typ, InspAct_Chk01_DtlR.$sno3_mng_typ,
					InspAct_Chk01_DtlR.$sno4_mng_typ, InspAct_Chk01_DtlR.$rmrks_upd_flg, InspAct_Chk01_DtlR.$err_flg};
			copyByPegNo(up1(), dest1Cols, o.down1(), src1Cols);
			String[] dest2Cols = new String[] {Chk01_RsltSmplR.$itm_cd, Chk01_RsltSmplR.$itm_sub1, Chk01_RsltSmplR.$itm_sub2,
					Chk01_RsltSmplR.$itm_sub3, Chk01_RsltSmplR.$lot_no, Chk01_RsltSmplR.$sublot_no, Chk01_RsltSmplR.$base_unit_cd,
					Chk01_RsltSmplR.$sno1_mng_typ, Chk01_RsltSmplR.$sno2_mng_typ, Chk01_RsltSmplR.$sno3_mng_typ,
					Chk01_RsltSmplR.$sno4_mng_typ, Chk01_RsltSmplR.$str_ln_cd, Chk01_RsltSmplR.$rmrks_upd_flg, Chk01_RsltSmplR.$err_flg};
			String[] src2Cols = new String[] {InspAct_Chk01_SmplR.$itm_cd, InspAct_Chk01_SmplR.$itm_sub1, InspAct_Chk01_SmplR.$itm_sub2,
					InspAct_Chk01_SmplR.$itm_sub3, InspAct_Chk01_SmplR.$lot_no, InspAct_Chk01_SmplR.$sublot_no, InspAct_Chk01_SmplR.$base_unit_cd,
					InspAct_Chk01_SmplR.$sno1_mng_typ, InspAct_Chk01_SmplR.$sno2_mng_typ, InspAct_Chk01_SmplR.$sno3_mng_typ,
					InspAct_Chk01_SmplR.$sno4_mng_typ, InspAct_Chk01_SmplR.$str_ln_cd, InspAct_Chk01_SmplR.$rmrks_upd_flg, InspAct_Chk01_SmplR.$err_flg};
			copyByPegNo(up2(), dest2Cols, o.down2(), src2Cols);
		}
		
		protected Map_InspAct_Chk01_HdrR_Chk01_HdrR<InspAct_Chk01_HdrR,Chk01_HdrR> createMap_InspAct_Chk01_HdrR_Chk01_HdrR() {
			return new Map_InspAct_Chk01_HdrR_Chk01_HdrR<InspAct_Chk01_HdrR, Chk01_HdrR>();
		}
		
		public class Map_InspAct_Chk01_HdrR_Chk01_HdrR<D extends InspAct_Chk01_HdrR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk01_HdrR.$peg_no, Chk01_HdrR.$peg_no);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_no, Chk01_HdrR.$insp_no);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_act_no, Chk01_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_freq, Chk01_HdrR.$insp_freq);
				addColumnPathMap(InspAct_Chk01_HdrR.$src_no1, Chk01_HdrR.$src_no1);
				addColumnPathMap(InspAct_Chk01_HdrR.$src_no2, Chk01_HdrR.$src_no2);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_typ, Chk01_HdrR.$insp_typ);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_mtd_typ, Chk01_HdrR.$insp_mtd_typ);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_sts_typ, Chk01_HdrR.$insp_sts_typ);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_aprv_sts_typ, Chk01_HdrR.$insp_aprv_sts_typ);
				addColumnPathMap(InspAct_Chk01_HdrR.$itm_cd, Chk01_HdrR.$itm_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$itm_sub1, Chk01_HdrR.$itm_sub1);
				addColumnPathMap(InspAct_Chk01_HdrR.$itm_sub2, Chk01_HdrR.$itm_sub2);
				addColumnPathMap(InspAct_Chk01_HdrR.$itm_sub3, Chk01_HdrR.$itm_sub3);
				addColumnPathMap(InspAct_Chk01_HdrR.$lot_no, Chk01_HdrR.$lot_no);
				addColumnPathMap(InspAct_Chk01_HdrR.$sublot_no, Chk01_HdrR.$sublot_no);
				addColumnPathMap(InspAct_Chk01_HdrR.$quality_typ, Chk01_HdrR.$quality_typ);
				addColumnPathMap(InspAct_Chk01_HdrR.$gd_cd, Chk01_HdrR.$gd_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$dfct_rsn_cd, Chk01_HdrR.$dfct_rsn_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$sppl_cd, Chk01_HdrR.$sppl_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$maker_cd, Chk01_HdrR.$maker_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$mfg_loc_cd, Chk01_HdrR.$mfg_loc_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$from_site_cd, Chk01_HdrR.$from_site_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$base_unit_qty, Chk01_HdrR.$base_unit_qty);
				addColumnPathMap(InspAct_Chk01_HdrR.$base_unit_cd, Chk01_HdrR.$base_unit_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$st_tm, Chk01_HdrR.$st_tm);
				addColumnPathMap(InspAct_Chk01_HdrR.$end_tm, Chk01_HdrR.$end_tm);
				addColumnPathMap(InspAct_Chk01_HdrR.$act_usr_cd, Chk01_HdrR.$act_usr_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$act_dpt_cd, Chk01_HdrR.$act_dpt_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$lmt_dt_frm_typ, Chk01_HdrR.$lmt_dt_frm_typ);
				addColumnPathMap(InspAct_Chk01_HdrR.$lmt_dt_frm, Chk01_HdrR.$lmt_dt_frm);
				addColumnPathMap(InspAct_Chk01_HdrR.$vld_dt, Chk01_HdrR.$vld_dt);
				addColumnPathMap(InspAct_Chk01_HdrR.$lmt_dt, Chk01_HdrR.$lmt_dt);
				addColumnPathMap(InspAct_Chk01_HdrR.$act_cont_fctr, Chk01_HdrR.$act_cont_fctr);
				addColumnPathMap(InspAct_Chk01_HdrR.$intr_rmrks, Chk01_HdrR.$act_intr_rmrks);
				addColumnPathMap(InspAct_Chk01_HdrR.$sub_char1, Chk01_HdrR.$sub_char1);
				addColumnPathMap(InspAct_Chk01_HdrR.$sub_char2, Chk01_HdrR.$sub_char2);
				addColumnPathMap(InspAct_Chk01_HdrR.$sub_char3, Chk01_HdrR.$sub_char3);
				addColumnPathMap(InspAct_Chk01_HdrR.$inst_upd_cntr, Chk01_HdrR.$inst_upd_cntr);
				addColumnPathMap(InspAct_Chk01_HdrR.$vld_dt_upd_flg, Chk01_HdrR.$vld_dt_upd_flg);
			}
		}
		
		protected Map_InspAct_Chk01_DtlR_Chk01_DtlR<InspAct_Chk01_DtlR,Chk01_DtlR> createMap_InspAct_Chk01_DtlR_Chk01_DtlR() {
			return new Map_InspAct_Chk01_DtlR_Chk01_DtlR<InspAct_Chk01_DtlR, Chk01_DtlR>();
		}
		
		public class Map_InspAct_Chk01_DtlR_Chk01_DtlR<D extends InspAct_Chk01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(InspAct_Chk01_DtlR.$insp_no, Chk01_DtlR.$insp_no);
				addColumnPathMap(InspAct_Chk01_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(InspAct_Chk01_DtlR.$insp_act_d_no, Chk01_DtlR.$insp_act_d_no);
				addColumnPathMap(InspAct_Chk01_DtlR.$insp_act_no, Chk01_DtlR.$insp_act_no);
				addColumnPathMap(InspAct_Chk01_DtlR.$loc_cd, Chk01_DtlR.$loc_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$str_ln_cd, Chk01_DtlR.$str_ln_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$quality_typ, Chk01_DtlR.$quality_typ);
				addColumnPathMap(InspAct_Chk01_DtlR.$stk_insp_typ, Chk01_DtlR.$stk_insp_typ);
				addColumnPathMap(InspAct_Chk01_DtlR.$stk_id_typ, Chk01_DtlR.$stk_id_typ);
				addColumnPathMap(InspAct_Chk01_DtlR.$stk_bp_cd, Chk01_DtlR.$stk_bp_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$gd_cd, Chk01_DtlR.$gd_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$stk_arrv_bp_cd, Chk01_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$sno1, Chk01_DtlR.$sno1);
				addColumnPathMap(InspAct_Chk01_DtlR.$sno2, Chk01_DtlR.$sno2);
				addColumnPathMap(InspAct_Chk01_DtlR.$sno3, Chk01_DtlR.$sno3);
				addColumnPathMap(InspAct_Chk01_DtlR.$sno4, Chk01_DtlR.$sno4);
				addColumnPathMap(InspAct_Chk01_DtlR.$fix_no_typ, Chk01_DtlR.$fix_no_typ);
				addColumnPathMap(InspAct_Chk01_DtlR.$fix_no, Chk01_DtlR.$fix_no);
				addColumnPathMap(InspAct_Chk01_DtlR.$pack_unit_qty, Chk01_DtlR.$pack_unit_qty);
				addColumnPathMap(InspAct_Chk01_DtlR.$pack_unit_cd, Chk01_DtlR.$pack_unit_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
				addColumnPathMap(InspAct_Chk01_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$pack_xfr_pack_unit_qty, Chk01_DtlR.$pack_xfr_pack_unit_qty);
				addColumnPathMap(InspAct_Chk01_DtlR.$pack_xfr_pack_unit_cd, Chk01_DtlR.$pack_xfr_pack_unit_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$pack_xfr_base_unit_qty, Chk01_DtlR.$pack_xfr_base_unit_qty);
				addColumnPathMap(InspAct_Chk01_DtlR.$pack_xfr_base_unit_cd, Chk01_DtlR.$pack_xfr_base_unit_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$dfct_rsn_cd, Chk01_DtlR.$dfct_rsn_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$ac_dt, Chk01_DtlR.$ac_dt);
				addColumnPathMap(InspAct_Chk01_DtlR.$can_ac_dt, Chk01_DtlR.$can_ac_dt);
				addColumnPathMap(InspAct_Chk01_DtlR.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
				addColumnPathMap(InspAct_Chk01_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
				addColumnPathMap(InspAct_Chk01_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
				addColumnPathMap(InspAct_Chk01_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
			}
		}
		
		protected Map_InspAct_Chk01_SmplR_Chk01_RsltSmplR<InspAct_Chk01_SmplR,Chk01_RsltSmplR> createMap_InspAct_Chk01_SmplR_Chk01_RsltSmplR() {
			return new Map_InspAct_Chk01_SmplR_Chk01_RsltSmplR<InspAct_Chk01_SmplR, Chk01_RsltSmplR>();
		}
		
		public class Map_InspAct_Chk01_SmplR_Chk01_RsltSmplR<D extends InspAct_Chk01_SmplR, S extends Chk01_RsltSmplR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk01_SmplR.$peg_no, Chk01_RsltSmplR.$peg_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$insp_no, Chk01_RsltSmplR.$insp_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$data_crud_typ, Chk01_RsltSmplR.$data_crud_typ);
				addColumnPathMap(InspAct_Chk01_SmplR.$insp_smpl_act_no, Chk01_RsltSmplR.$insp_smpl_act_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$insp_act_no, Chk01_RsltSmplR.$insp_act_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$insp_schd_no, Chk01_RsltSmplR.$insp_schd_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$so_qty, Chk01_RsltSmplR.$so_qty);
				addColumnPathMap(InspAct_Chk01_SmplR.$smpl_qty, Chk01_RsltSmplR.$smpl_qty);
				addColumnPathMap(InspAct_Chk01_SmplR.$base_unit_cd, Chk01_RsltSmplR.$base_unit_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$pack_xfr_pack_unit_qty, Chk01_RsltSmplR.$pack_xfr_pack_unit_qty);
				addColumnPathMap(InspAct_Chk01_SmplR.$pack_xfr_pack_unit_cd, Chk01_RsltSmplR.$pack_xfr_pack_unit_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$pack_xfr_base_unit_qty, Chk01_RsltSmplR.$pack_xfr_base_unit_qty);
				addColumnPathMap(InspAct_Chk01_SmplR.$pack_xfr_base_unit_cd, Chk01_RsltSmplR.$pack_xfr_base_unit_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$loc_cd, Chk01_RsltSmplR.$loc_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$str_ln_cd, Chk01_RsltSmplR.$str_ln_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$quality_typ, Chk01_RsltSmplR.$quality_typ);
				addColumnPathMap(InspAct_Chk01_SmplR.$stk_insp_typ, Chk01_RsltSmplR.$stk_insp_typ);
				addColumnPathMap(InspAct_Chk01_SmplR.$stk_id_typ, Chk01_RsltSmplR.$stk_id_typ);
				addColumnPathMap(InspAct_Chk01_SmplR.$stk_bp_cd, Chk01_RsltSmplR.$stk_bp_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$gd_cd, Chk01_RsltSmplR.$gd_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$stk_arrv_bp_cd, Chk01_RsltSmplR.$stk_arrv_bp_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$sno1, Chk01_RsltSmplR.$sno1);
				addColumnPathMap(InspAct_Chk01_SmplR.$sno2, Chk01_RsltSmplR.$sno2);
				addColumnPathMap(InspAct_Chk01_SmplR.$sno3, Chk01_RsltSmplR.$sno3);
				addColumnPathMap(InspAct_Chk01_SmplR.$sno4, Chk01_RsltSmplR.$sno4);
				addColumnPathMap(InspAct_Chk01_SmplR.$fix_no_typ, Chk01_RsltSmplR.$fix_no_typ);
				addColumnPathMap(InspAct_Chk01_SmplR.$fix_no, Chk01_RsltSmplR.$fix_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$act_tm, Chk01_RsltSmplR.$act_tm);
				addColumnPathMap(InspAct_Chk01_SmplR.$ac_dt, Chk01_RsltSmplR.$ac_dt);
				addColumnPathMap(InspAct_Chk01_SmplR.$can_ac_dt, Chk01_RsltSmplR.$can_ac_dt);
				addColumnPathMap(InspAct_Chk01_SmplR.$bd_dpt_cd, Chk01_RsltSmplR.$bd_dpt_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$trd_rmrks, Chk01_RsltSmplR.$trd_rmrks);
				addColumnPathMap(InspAct_Chk01_SmplR.$intr_rmrks, Chk01_RsltSmplR.$intr_rmrks);
				addColumnPathMap(InspAct_Chk01_SmplR.$sub_char1, Chk01_RsltSmplR.$sub_char1);
				addColumnPathMap(InspAct_Chk01_SmplR.$sub_char2, Chk01_RsltSmplR.$sub_char2);
				addColumnPathMap(InspAct_Chk01_SmplR.$sub_char3, Chk01_RsltSmplR.$sub_char3);
			}
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 検査実績ヘッダを判定する前に、チェックを実行する<br>
	 */
	public class Chk02 extends MSBFL_InspActLstReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			MCList<Chk02_HdrR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callInspActServiceChk02(notErrL);
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査指図の更新カウンタチェック
			msgL.addAll(chkInstUpdCnt());

			// 検査実績の更新カウンタチェック
			msgL.addAll(chkActUpdCnt());

			// データ補完
			compDataDtl();

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			return super.doServerCheckSub();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}

		/**
		 * 検査指図更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkInstUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_INSP_INST_R> selectL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.insp_no);

			MCList<Chk02_HdrR> bindL = up0().groupBy(Chk02_HdrR.$insp_no);
			bindL.sort(Chk02_HdrR.$insp_no);

			dbSelectKeyForUpdateNoWait("MSBFL0060_MST_INSP_INST_S02", selectL, selectL_bldr, bindL);

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_INST_R.$insp_no);
			for (Chk02_HdrR r : up0()) {
				MST_INSP_INST_R selectR = selectL.getFirst(idxkey, r.insp_no());
				msgL.addAll(checkUpdCntrNE(r, Chk02_HdrR.$inst_upd_cntr, selectR));
				setErrFlg(r, msgL);
				if (!isNull(selectR)) {

					// データ補完
					r.insp_typ(selectR.insp_typ());
					r.insp_sts_typ(selectR.insp_sts_typ());
					r.insp_aprv_sts_typ(selectR.insp_aprv_sts_typ());
					r.lot_no(selectR.lot_no());
					r.sublot_no(selectR.sublot_no());

					if (!isSame(r.itm_cd(), selectR.itm_cd())) {
						msgL.addAll(getRecordInvalidMsg(Chk02_HdrR.$itm_cd, selectR.itm_cd(), r));
					}
					if (!isSame(r.itm_sub1(), selectR.itm_sub1())) {
						msgL.addAll(getRecordInvalidMsg(Chk02_HdrR.$itm_sub1, selectR.itm_sub1(), r));
					}
					if (!isSame(r.itm_sub2(), selectR.itm_sub2())) {
						msgL.addAll(getRecordInvalidMsg(Chk02_HdrR.$itm_sub2, selectR.itm_sub2(), r));
					}
					if (!isSame(r.itm_sub3(), selectR.itm_sub3())) {
						msgL.addAll(getRecordInvalidMsg(Chk02_HdrR.$itm_sub3, selectR.itm_sub3(), r));
					}
				}
			}

			return msgL;
		}

		/**
		 * 検査実績更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkActUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk02_HdrR> notErrL = up0().subList(Chk02_HdrR.$err_flg, false);

			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MST_INSP_ACT_R> selectL = MCList.create(MST_INSP_ACT_R.class);
			MST_INSP_ACT_R t = MST_INSP_ACT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.insp_act_no);

			MCList<Chk02_HdrR> bindL = notErrL.groupBy(Chk02_HdrR.$insp_act_no);
			bindL.sort(Chk02_HdrR.$insp_act_no);

			dbSelectKeyForUpdateNoWait("MSBFL0060_MST_INSP_ACT_S02", selectL, selectL_bldr, bindL);

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_ACT_R.$insp_act_no);
			for (Chk02_HdrR r : notErrL) {
				MST_INSP_ACT_R selectR = selectL.getFirst(idxkey, r.insp_act_no());
				msgL.addAll(checkUpdCntrNE(r, Chk02_HdrR.$act_upd_cntr, selectR));
			}

			return msgL;
		}

		/**
		 * 検査実績明細を補完する。
		 */
		protected void compDataDtl() {
			MCList<Chk02_DtlR> dtlL = MCList.create(Chk02_DtlR.class);
			
			MCList<MST_INSP_SCHD_R> schdL = getInspSchdL();
			dtlL.addAll(getDtlIns(schdL));
			up1().setAll(dtlL);

			setPegNo(up1());
		}
		
		protected MCList<MST_INSP_SCHD_R> getInspSchdL() {
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			schdL_bldr.setWhere(t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL0060_MST_INSP_SCHD_S06", schdL, schdL_bldr, up0());
			return schdL;
		}
		
		protected MCList<Chk02_DtlR> getDtlIns(MCList<MST_INSP_SCHD_R> schdL) {
			MCList<Chk02_DtlR> dtlL = MCList.create(Chk02_DtlR.class);
			
			MCList<MST_INSP_ACT_D_R> inspActDL = MCList.create(MST_INSP_ACT_D_R.class);
			MST_INSP_ACT_D_R inspActD = MST_INSP_ACT_D_R.create("inspActD");
			MST_INSP_ACT_R inspAct = MST_INSP_ACT_R.create("inspAct");
			MCQueryApiBuilder actDL_bldr = MCQueryApiBuilder.create(inspActD);
			actDL_bldr.addInnerJoin(inspAct, inspAct.insp_act_no.eq(inspActD.insp_act_no));
			actDL_bldr.setWhere(inspAct.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL0060_MST_INSP_ACT_D_S04", inspActDL, actDL_bldr, up0());
			
			for (Chk02_HdrR hdrR : up0()) {
				MCList<MST_INSP_ACT_D_R> inspActDSubL = inspActDL.subList(MST_INSP_ACT_D_R.$insp_act_no, hdrR.insp_act_no());
				for (MST_INSP_ACT_D_R inspActDR : inspActDSubL) {
					if (!isNull(inspActDR) && inspActDR.base_unit_qty().isZero()) {
						Chk02_DtlR dtlR = Chk02_DtlR.create();
						dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						dtlR.insp_act_no(hdrR.insp_act_no());
						dtlR.insp_no(hdrR.insp_no());
						dtlR.itm_cd(inspActDR.itm_cd());
						dtlR.itm_sub1(inspActDR.itm_sub1());
						dtlR.itm_sub2(inspActDR.itm_sub2());
						dtlR.itm_sub3(inspActDR.itm_sub3());
						dtlR.loc_cd(inspActDR.loc_cd());
						dtlR.str_ln_cd(inspActDR.str_ln_cd());
						dtlR.stk_arrv_bp_cd(inspActDR.stk_arrv_bp_cd());
						dtlR.gd_cd(inspActDR.gd_cd());
						dtlR.quality_typ(inspActDR.quality_typ());
						dtlR.stk_insp_typ(inspActDR.stk_insp_typ());
						dtlR.stk_id_typ(inspActDR.stk_id_typ());
						dtlR.stk_bp_cd(inspActDR.stk_bp_cd());
						dtlR.lot_no(inspActDR.lot_no());
						dtlR.sublot_no(inspActDR.sublot_no());
						dtlR.sno1(inspActDR.sno1());
						dtlR.sno1_mng_typ(inspActDR.sno1_mng_typ());
						dtlR.sno2(inspActDR.sno2());
						dtlR.sno2_mng_typ(inspActDR.sno2_mng_typ());
						dtlR.sno3(inspActDR.sno3());
						dtlR.sno3_mng_typ(inspActDR.sno3_mng_typ());
						dtlR.sno4(inspActDR.sno4());
						dtlR.sno4_mng_typ(inspActDR.sno4_mng_typ());
						dtlR.fix_no_typ(inspActDR.fix_no_typ());
						dtlR.fix_no(inspActDR.fix_no());
						dtlR.pack_unit_qty(inspActDR.pack_unit_qty());
						dtlR.pack_unit_cd(inspActDR.pack_unit_cd());
						dtlR.base_unit_qty(inspActDR.base_unit_qty());
						dtlR.base_unit_cd(inspActDR.base_unit_cd());
						dtlR.ac_dt(hdrR.judg_dt());
						
						dtlL.add(dtlR);
					}
				}
				MCList<MST_STK_R> stkL = MCList.create(MST_STK_R.class);
				MST_STK_R t = MST_STK_R.create("T");
				MCQueryApiBuilder stkL_bldr = MCQueryApiBuilder.create(t);
				MCList<MST_INSP_SCHD_R> tmpSchdL = schdL.subList(MST_INSP_SCHD_R.$insp_no, hdrR.insp_no());
				if (MSC_INSP_TYP.isACCPT(hdrR.insp_typ())) {
					stkL_bldr.setWhere(t.fix_no_typ.eq(bind("1")), MSC_FIX_NO_TYP.ARR_ACT_NO.value());
					stkL_bldr.addWhereWithAnd(t.fix_no.eq(bind("src_no4")));
				}
				else if (MSC_INSP_TYP.isPRDCT(hdrR.insp_typ())) {
					stkL_bldr.setWhere(t.fix_no_typ.eq(bind("1")), MSC_FIX_NO_TYP.YIELD_ACT_NO.value());
					stkL_bldr.addWhereWithAnd(t.fix_no.eq(bind("src_no4")));
				}
				else if (MSC_INSP_TYP.isLOT(hdrR.insp_typ())) {
					stkL_bldr.setWhere(t.fix_no_typ.eq(bind("1")), MSC_FIX_NO_TYP.INSP_SCHD_NO.value());
					stkL_bldr.addWhereWithAnd(t.fix_no.eq(bind("insp_schd_no")));
				}
				dbSelect("MSBFL0060_MST_STK_S04", stkL, stkL_bldr, tmpSchdL);

				for (MST_STK_R stkR : stkL) {
					Chk02_DtlR dtlR = Chk02_DtlR.create();
					MST_INSP_SCHD_R schdR = null;
					if (MSC_FIX_NO_TYP.isARR_ACT_NO(stkR.fix_no_typ())
							|| MSC_FIX_NO_TYP.isYIELD_ACT_NO(stkR.fix_no_typ())) {
						schdR = schdL.getFirst(MST_INSP_SCHD_R.$src_no4, stkR.fix_no());
					}
					else if (MSC_FIX_NO_TYP.isINSP_SCHD_NO(stkR.fix_no_typ())) {
						schdR = schdL.getFirst(MST_INSP_SCHD_R.$insp_schd_no, stkR.fix_no());
					}
					
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					dtlR.insp_act_no(hdrR.insp_act_no());
					dtlR.insp_no(hdrR.insp_no());
					dtlR.itm_cd(stkR.itm_cd());
					dtlR.itm_sub1(stkR.itm_sub1());
					dtlR.itm_sub2(stkR.itm_sub2());
					dtlR.itm_sub3(stkR.itm_sub3());
					dtlR.loc_cd(stkR.loc_cd());
					dtlR.str_ln_cd(stkR.str_ln_cd());
					dtlR.stk_arrv_bp_cd(stkR.stk_arrv_bp_cd());
					dtlR.gd_cd(stkR.gd_cd());
					dtlR.quality_typ(stkR.quality_typ());
					dtlR.stk_insp_typ(stkR.stk_insp_typ());
					dtlR.stk_id_typ(stkR.stk_id_typ());
					dtlR.stk_bp_cd(stkR.stk_bp_cd());
					dtlR.lot_no(stkR.lot_no());
					dtlR.sublot_no(stkR.sublot_no());
					dtlR.sno1(stkR.sno1());
					dtlR.sno1_mng_typ(schdR.sno1_mng_typ());
					dtlR.sno2(stkR.sno2());
					dtlR.sno2_mng_typ(schdR.sno2_mng_typ());
					dtlR.sno3(stkR.sno3());
					dtlR.sno3_mng_typ(schdR.sno3_mng_typ());
					dtlR.sno4(stkR.sno4());
					dtlR.sno4_mng_typ(schdR.sno4_mng_typ());
					dtlR.fix_no_typ(stkR.fix_no_typ());
					dtlR.fix_no(stkR.fix_no());
					dtlR.pack_unit_qty(stkR.pack_unit_qty());
					dtlR.pack_unit_cd(stkR.pack_unit_cd());
					dtlR.base_unit_qty(stkR.base_unit_qty());
					dtlR.base_unit_cd(schdR.base_unit_cd());
					dtlR.ac_dt(hdrR.judg_dt());
					
					dtlL.add(dtlR);
				}
			}
			
			return dtlL;
		}

		protected void callInspActServiceChk02(MCList<Chk02_HdrR> notErrL) {
			MSBFL_InspActService.InspAct_Chk02 o = MSBFL_InspActService.crtInspAct_Chk02();
			
			MCIndexKey dtlIdx = up1().createIndex(Chk02_DtlR.$insp_no);
			for (Chk02_HdrR r : notErrL) {
				InspAct_Chk02_HdrR hdr = InspAct_Chk02_HdrR.create();
				copy(hdr, r, createMap_InspAct_Chk02_HdrR_Chk02_HdrR());
				o.up0().add(hdr);
				addAll(o.up1(), up1().subList(dtlIdx, r.insp_no()), createMap_InspAct_Chk02_DtlR_Chk02_DtlR());
			}
			
			o.exec();
			
			copyErrFlg(notErrL, o.down0());
		}
		
		protected Map_InspAct_Chk02_HdrR_Chk02_HdrR<InspAct_Chk02_HdrR,Chk02_HdrR> createMap_InspAct_Chk02_HdrR_Chk02_HdrR() {
			return new Map_InspAct_Chk02_HdrR_Chk02_HdrR<InspAct_Chk02_HdrR, Chk02_HdrR>();
		}
		
		public class Map_InspAct_Chk02_HdrR_Chk02_HdrR<D extends InspAct_Chk02_HdrR, S extends Chk02_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk02_HdrR.$peg_no, Chk02_HdrR.$peg_no);
				addColumnPathMap(InspAct_Chk02_HdrR.$insp_no, Chk02_HdrR.$insp_no);
				addColumnPathMap(InspAct_Chk02_HdrR.$insp_act_no, Chk02_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Chk02_HdrR.$insp_typ, Chk02_HdrR.$insp_typ);
				addColumnPathMap(InspAct_Chk02_HdrR.$insp_sts_typ, Chk02_HdrR.$insp_sts_typ);
				addColumnPathMap(InspAct_Chk02_HdrR.$insp_aprv_sts_typ, Chk02_HdrR.$insp_aprv_sts_typ);
				addColumnPathMap(InspAct_Chk02_HdrR.$itm_cd, Chk02_HdrR.$itm_cd);
				addColumnPathMap(InspAct_Chk02_HdrR.$itm_sub1, Chk02_HdrR.$itm_sub1);
				addColumnPathMap(InspAct_Chk02_HdrR.$itm_sub2, Chk02_HdrR.$itm_sub2);
				addColumnPathMap(InspAct_Chk02_HdrR.$itm_sub3, Chk02_HdrR.$itm_sub3);
				addColumnPathMap(InspAct_Chk02_HdrR.$lot_no, Chk02_HdrR.$lot_no);
				addColumnPathMap(InspAct_Chk02_HdrR.$sublot_no, Chk02_HdrR.$sublot_no);
				addColumnPathMap(InspAct_Chk02_HdrR.$judg_dt, Chk02_HdrR.$judg_dt);
				addColumnPathMap(InspAct_Chk02_HdrR.$insp_judg_rslt_typ, Chk02_HdrR.$insp_judg_rslt_typ);
				addColumnPathMap(InspAct_Chk02_HdrR.$judg_dpt_cd, Chk02_HdrR.$judg_dpt_cd);
				addColumnPathMap(InspAct_Chk02_HdrR.$judg_usr_cd, Chk02_HdrR.$judg_usr_cd);
				addColumnPathMap(InspAct_Chk02_HdrR.$judg_rsn, Chk02_HdrR.$judg_rsn);
				addColumnPathMap(InspAct_Chk02_HdrR.$intr_rmrks, Chk02_HdrR.$act_intr_rmrks);
				addColumnPathMap(InspAct_Chk02_HdrR.$lot_rmrks, Chk02_HdrR.$lot_rmrks);
				addColumnPathMap(InspAct_Chk02_HdrR.$sub_char1, Chk02_HdrR.$sub_char1);
				addColumnPathMap(InspAct_Chk02_HdrR.$sub_char2, Chk02_HdrR.$sub_char2);
				addColumnPathMap(InspAct_Chk02_HdrR.$sub_char3, Chk02_HdrR.$sub_char3);
				addColumnPathMap(InspAct_Chk02_HdrR.$inst_upd_cntr, Chk02_HdrR.$inst_upd_cntr);
				addColumnPathMap(InspAct_Chk02_HdrR.$vld_dt_upd_flg, Chk02_HdrR.$vld_dt_upd_flg);
				addColumnPathMap(InspAct_Chk02_HdrR.$lmt_dt_frm_typ, Chk02_HdrR.$lmt_dt_frm_typ);
				addColumnPathMap(InspAct_Chk02_HdrR.$lmt_dt_frm, Chk02_HdrR.$lmt_dt_frm);
				addColumnPathMap(InspAct_Chk02_HdrR.$vld_dt, Chk02_HdrR.$vld_dt);
				addColumnPathMap(InspAct_Chk02_HdrR.$lmt_dt, Chk02_HdrR.$lmt_dt);
			}
		}
		
		protected Map_InspAct_Chk02_DtlR_Chk02_DtlR<InspAct_Chk02_DtlR,Chk02_DtlR> createMap_InspAct_Chk02_DtlR_Chk02_DtlR() {
			return new Map_InspAct_Chk02_DtlR_Chk02_DtlR<InspAct_Chk02_DtlR, Chk02_DtlR>();
		}
		
		public class Map_InspAct_Chk02_DtlR_Chk02_DtlR<D extends InspAct_Chk02_DtlR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk02_DtlR.$peg_no, Chk02_DtlR.$peg_no);
				addColumnPathMap(InspAct_Chk02_DtlR.$data_crud_typ, Chk02_DtlR.$data_crud_typ);
				addColumnPathMap(InspAct_Chk02_DtlR.$insp_no, Chk02_DtlR.$insp_no);
				addColumnPathMap(InspAct_Chk02_DtlR.$insp_act_no, Chk02_DtlR.$insp_act_no);
				addColumnPathMap(InspAct_Chk02_DtlR.$itm_cd, Chk02_DtlR.$itm_cd);
				addColumnPathMap(InspAct_Chk02_DtlR.$itm_sub1, Chk02_DtlR.$itm_sub1);
				addColumnPathMap(InspAct_Chk02_DtlR.$itm_sub2, Chk02_DtlR.$itm_sub2);
				addColumnPathMap(InspAct_Chk02_DtlR.$itm_sub3, Chk02_DtlR.$itm_sub3);
				addColumnPathMap(InspAct_Chk02_DtlR.$loc_cd, Chk02_DtlR.$loc_cd);
				addColumnPathMap(InspAct_Chk02_DtlR.$str_ln_cd, Chk02_DtlR.$str_ln_cd);
				addColumnPathMap(InspAct_Chk02_DtlR.$quality_typ, Chk02_DtlR.$quality_typ);
				addColumnPathMap(InspAct_Chk02_DtlR.$stk_insp_typ, Chk02_DtlR.$stk_insp_typ);
				addColumnPathMap(InspAct_Chk02_DtlR.$stk_id_typ, Chk02_DtlR.$stk_id_typ);
				addColumnPathMap(InspAct_Chk02_DtlR.$stk_bp_cd, Chk02_DtlR.$stk_bp_cd);
				addColumnPathMap(InspAct_Chk02_DtlR.$gd_cd, Chk02_DtlR.$gd_cd);
				addColumnPathMap(InspAct_Chk02_DtlR.$stk_arrv_bp_cd, Chk02_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(InspAct_Chk02_DtlR.$lot_no, Chk02_DtlR.$lot_no);
				addColumnPathMap(InspAct_Chk02_DtlR.$sublot_no, Chk02_DtlR.$sublot_no);
				addColumnPathMap(InspAct_Chk02_DtlR.$sno1, Chk02_DtlR.$sno1);
				addColumnPathMap(InspAct_Chk02_DtlR.$sno2, Chk02_DtlR.$sno2);
				addColumnPathMap(InspAct_Chk02_DtlR.$sno3, Chk02_DtlR.$sno3);
				addColumnPathMap(InspAct_Chk02_DtlR.$sno4, Chk02_DtlR.$sno4);
				addColumnPathMap(InspAct_Chk02_DtlR.$fix_no_typ, Chk02_DtlR.$fix_no_typ);
				addColumnPathMap(InspAct_Chk02_DtlR.$fix_no, Chk02_DtlR.$fix_no);
				addColumnPathMap(InspAct_Chk02_DtlR.$pack_unit_qty, Chk02_DtlR.$pack_unit_qty);
				addColumnPathMap(InspAct_Chk02_DtlR.$pack_unit_cd, Chk02_DtlR.$pack_unit_cd);
				addColumnPathMap(InspAct_Chk02_DtlR.$base_unit_qty, Chk02_DtlR.$base_unit_qty);
				addColumnPathMap(InspAct_Chk02_DtlR.$base_unit_cd, Chk02_DtlR.$base_unit_cd);
				addColumnPathMap(InspAct_Chk02_DtlR.$ac_dt, Chk02_DtlR.$ac_dt);
				addColumnPathMap(InspAct_Chk02_DtlR.$intr_rmrks, Chk02_DtlR.$intr_rmrks);
				addColumnPathMap(InspAct_Chk02_DtlR.$sub_char1, Chk02_DtlR.$sub_char1);
				addColumnPathMap(InspAct_Chk02_DtlR.$sub_char2, Chk02_DtlR.$sub_char2);
				addColumnPathMap(InspAct_Chk02_DtlR.$sub_char3, Chk02_DtlR.$sub_char3);
			}
		}
	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 検査実績ヘッダを取り消す前に、チェックを実行する<br>
	 */
	public class Chk03 extends MSBFL_InspActLstReg_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			MCList<Chk03_HdrR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callInspActChkSrv(notErrL);
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査指図の更新カウンタチェック
			msgL.addAll(chkInstUpdCnt());

			// 検査実績の更新カウンタチェック
			msgL.addAll(chkActUpdCnt());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk03_HdrR> notErrL = getChkList(up0());

			// 場所の更新権限のチェック
			msgL.addAll(dacChk(notErrL));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 検査指図更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkInstUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_INSP_INST_R> selectL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.insp_no);

			MCList<Chk03_HdrR> bindL = up0().groupBy(Chk03_HdrR.$insp_no);
			bindL.sort(Chk03_HdrR.$insp_no);

			dbSelectKeyForUpdateNoWait("MSBFL0060_MST_INSP_INST_S03", selectL, selectL_bldr, bindL);

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_INST_R.$insp_no);
			for (Chk03_HdrR r : up0()) {
				MST_INSP_INST_R selectR = selectL.getFirst(idxkey, r.insp_no());
				msgL.addAll(checkUpdCntrNE(r, Chk03_HdrR.$inst_upd_cntr, selectR));
				setErrFlg(r, msgL);
				if (!isNull(selectR)) {
					if (!isSame(r.itm_cd(), selectR.itm_cd())) {
						msgL.addAll(getRecordInvalidMsg(Chk03_HdrR.$itm_cd, selectR.itm_cd(), r));
					}
					if (!isSame(r.itm_sub1(), selectR.itm_sub1())) {
						msgL.addAll(getRecordInvalidMsg(Chk03_HdrR.$itm_sub1, selectR.itm_sub1(), r));
					}
					if (!isSame(r.itm_sub2(), selectR.itm_sub2())) {
						msgL.addAll(getRecordInvalidMsg(Chk03_HdrR.$itm_sub2, selectR.itm_sub2(), r));
					}
					if (!isSame(r.itm_sub3(), selectR.itm_sub3())) {
						msgL.addAll(getRecordInvalidMsg(Chk03_HdrR.$itm_sub3, selectR.itm_sub3(), r));
					}

					// データ補完
					r.insp_sts_typ(selectR.insp_sts_typ());
					r.insp_aprv_sts_typ(selectR.insp_aprv_sts_typ());
					r.insp_typ(selectR.insp_typ());
					r.mfg_loc_cd(selectR.mfg_loc_cd());
				}
			}

			return msgL;
		}

		/**
		 * 検査実績更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkActUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk03_HdrR> notErrL = up0().subList(Chk03_HdrR.$err_flg, false);

			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MST_INSP_ACT_R> selectL = MCList.create(MST_INSP_ACT_R.class);
			MST_INSP_ACT_R t = MST_INSP_ACT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.insp_act_no);

			MCList<Chk03_HdrR> bindL = notErrL.groupBy(Chk03_HdrR.$insp_act_no);
			bindL.sort(Chk03_HdrR.$insp_act_no);

			dbSelectKeyForUpdateNoWait("MSBFL0060_MST_INSP_ACT_S03", selectL, selectL_bldr, bindL);

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_ACT_R.$insp_act_no);
			for (Chk03_HdrR r : notErrL) {
				MST_INSP_ACT_R selectR = selectL.getFirst(idxkey, r.insp_act_no());
				msgL.addAll(checkUpdCntrNE(r, Chk03_HdrR.$act_upd_cntr, selectR));
			}

			return msgL;
		}

		/**
		 * 場所の更新権限のチェックをします。
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList dacChk(MCList<Chk03_HdrR> upL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk03_HdrR r : upL) {
				if (MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
					msgL.addAll(checkWritableLocCdDac(r, Chk01_HdrR.$mfg_loc_cd));
				}
				else {
					MCMessageList msgTmpL = new MCMessageList();
					MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
					MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
					MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
					schdL_bldr.setWhere(t.insp_no.eq(bind("insp_no")), r);
					dbSelect("MSBFL0060_MST_INSP_SCHD_S07", schdL, schdL_bldr);
					for (MST_INSP_SCHD_R schdR : schdL) {
						schdR.setAttributes(r);
						msgTmpL.addAll(checkWritableLocCdDac(schdR, MST_INSP_SCHD_R.$loc_cd));
					}
					if (!schdL.isEmpty() && schdL.size() == msgTmpL.size()) {
						r.err_flg(true);
						msgL.addAll(msgTmpL);
					}
				}
			}

			return msgL;
		}

		/**
		 * 検査実績サービスの取消前チェック処理を行う。
		 */
		protected void callInspActChkSrv(MCList<Chk03_HdrR> notErrL) {
			MSBFL_InspActService.InspAct_Chk04 o = MSBFL_InspActService.crtInspAct_Chk04();
			addAll(o.up0(), notErrL, createMap_InspAct_Chk04_HdrR_Chk03_HdrR());
			o.exec();
			
			copyErrFlg(notErrL, o.down0());
		}
		
		protected Map_InspAct_Chk04_HdrR_Chk03_HdrR<InspAct_Chk04_HdrR,Chk03_HdrR> createMap_InspAct_Chk04_HdrR_Chk03_HdrR() {
			return new Map_InspAct_Chk04_HdrR_Chk03_HdrR<InspAct_Chk04_HdrR, Chk03_HdrR>();
		}
		
		public class Map_InspAct_Chk04_HdrR_Chk03_HdrR<D extends InspAct_Chk04_HdrR, S extends Chk03_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk04_HdrR.$peg_no, Chk03_HdrR.$peg_no);
				addColumnPathMap(InspAct_Chk04_HdrR.$insp_no, Chk03_HdrR.$insp_no);
				addColumnPathMap(InspAct_Chk04_HdrR.$insp_act_no, Chk03_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Chk04_HdrR.$insp_sts_typ, Chk03_HdrR.$insp_sts_typ);
				addColumnPathMap(InspAct_Chk04_HdrR.$insp_aprv_sts_typ, Chk03_HdrR.$insp_aprv_sts_typ);
				addColumnPathMap(InspAct_Chk04_HdrR.$inst_upd_cntr, Chk03_HdrR.$inst_upd_cntr);
			}
		}
	}
	/**
	 * Chk04オペレーション.<p>
	 *
	 * 検査実績ヘッダを判定取り消す前に、チェックを実行する<br>
	 */
	public class Chk04 extends MSBFL_InspActLstReg_MC_A.Chk04 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			MCList<Chk04_HdrR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callInspActChkSrv(notErrL);
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査指図の更新カウンタチェック
			msgL.addAll(chkInstUpdCnt());

			// 検査実績の更新カウンタチェック
			msgL.addAll(chkActUpdCnt());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			return super.doServerCheckSub();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 検査指図更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkInstUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_INSP_INST_R> selectL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.insp_no);

			MCList<Chk04_HdrR> bindL = up0().groupBy(Chk04_HdrR.$insp_no);
			bindL.sort(Chk04_HdrR.$insp_no);

			dbSelectKeyForUpdateNoWait("MSBFL0060_MST_INSP_INST_S04", selectL, selectL_bldr, bindL);

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_INST_R.$insp_no);
			for (Chk04_HdrR r : up0()) {
				MST_INSP_INST_R selectR = selectL.getFirst(idxkey, r.insp_no());
				msgL.addAll(checkUpdCntrNE(r, Chk04_HdrR.$inst_upd_cntr, selectR));
				setErrFlg(r, msgL);
				if (!isNull(selectR)) {
					r.insp_sts_typ(selectR.insp_sts_typ());
					r.insp_aprv_sts_typ(selectR.insp_aprv_sts_typ());
					if (!isSame(r.itm_cd(), selectR.itm_cd())) {
						msgL.addAll(getRecordInvalidMsg(Chk04_HdrR.$itm_cd, selectR.itm_cd(), r));
					}
					if (!isSame(r.itm_sub1(), selectR.itm_sub1())) {
						msgL.addAll(getRecordInvalidMsg(Chk04_HdrR.$itm_sub1, selectR.itm_sub1(), r));
					}
					if (!isSame(r.itm_sub2(), selectR.itm_sub2())) {
						msgL.addAll(getRecordInvalidMsg(Chk04_HdrR.$itm_sub2, selectR.itm_sub2(), r));
					}
					if (!isSame(r.itm_sub3(), selectR.itm_sub3())) {
						msgL.addAll(getRecordInvalidMsg(Chk04_HdrR.$itm_sub3, selectR.itm_sub3(), r));
					}
				}
			}

			return msgL;
		}

		/**
		 * 検査実績更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkActUpdCnt() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk04_HdrR> notErrL = up0().subList(Chk04_HdrR.$err_flg, false);

			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MST_INSP_ACT_R> selectL = MCList.create(MST_INSP_ACT_R.class);
			MST_INSP_ACT_R t = MST_INSP_ACT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.insp_act_no);

			MCList<Chk04_HdrR> bindL = notErrL.groupBy(Chk04_HdrR.$insp_act_no);
			bindL.sort(Chk04_HdrR.$insp_act_no);

			dbSelectKeyForUpdateNoWait("MSBFL0060_MST_INSP_ACT_S04", selectL, selectL_bldr, bindL);

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_ACT_R.$insp_act_no);
			for (Chk04_HdrR r : notErrL) {
				MST_INSP_ACT_R selectR = selectL.getFirst(idxkey, r.insp_act_no());
				r.insp_judg_rslt_typ(selectR.insp_judg_rslt_typ());
				msgL.addAll(checkUpdCntrNE(r, Chk04_HdrR.$act_upd_cntr, selectR));
			}

			return msgL;
		}

		protected void callInspActChkSrv(MCList<Chk04_HdrR> notErrL) {
			MSBFL_InspActService.InspAct_Chk04 o = MSBFL_InspActService.crtInspAct_Chk04();
			addAll(o.up0(), notErrL, createMap_InspAct_Chk04_HdrR_Chk04_HdrR());
			o.exec();
			
			copyErrFlg(notErrL, o.down0());
		}
		
		protected Map_InspAct_Chk04_HdrR_Chk04_HdrR<InspAct_Chk04_HdrR,Chk04_HdrR> createMap_InspAct_Chk04_HdrR_Chk04_HdrR() {
			return new Map_InspAct_Chk04_HdrR_Chk04_HdrR<InspAct_Chk04_HdrR, Chk04_HdrR>();
		}
		
		public class Map_InspAct_Chk04_HdrR_Chk04_HdrR<D extends InspAct_Chk04_HdrR, S extends Chk04_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk04_HdrR.$peg_no, Chk04_HdrR.$peg_no);
				addColumnPathMap(InspAct_Chk04_HdrR.$insp_no, Chk04_HdrR.$insp_no);
				addColumnPathMap(InspAct_Chk04_HdrR.$insp_act_no, Chk04_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Chk04_HdrR.$insp_sts_typ, Chk04_HdrR.$insp_sts_typ);
				addColumnPathMap(InspAct_Chk04_HdrR.$insp_aprv_sts_typ, Chk04_HdrR.$insp_aprv_sts_typ);
				addColumnPathMap(InspAct_Chk04_HdrR.$insp_judg_rslt_typ, Chk04_HdrR.$insp_judg_rslt_typ);
				addColumnPathMap(InspAct_Chk04_HdrR.$judg_rsn, Chk04_HdrR.$judg_rsn);
				addColumnPathMap(InspAct_Chk04_HdrR.$inst_upd_cntr, Chk04_HdrR.$inst_upd_cntr);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 検査実績ヘッダの一括登録・訂正を行う<br>
	 */
	public class Upd01 extends MSBFL_InspActLstReg_MC_A.Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {

			editUp();

			// 前チェック処理
			callThisChk01();

			MCList<Chk01_HdrR> notErrL = up0().subList(Chk01_HdrR.$err_flg, false);
			if (notErrL.size() != 0) {

				// 検査実績の一括登録
				callInspActServiceUpd01(notErrL);
			}
		}

		protected void editDown() {
			MCIndexKey idxkeyDtl = down1().createIndex(Chk01_DtlR.$insp_no);
			MCIndexKey idxkeySmpl = down2().createIndex(Chk01_RsltSmplR.$insp_no);
			for (Chk01_HdrR downR : down0()) {
				if (MAC_RTN_STS_TYP.isERR(downR.rtn_sts_typ())) {
					// エラー行はそのまま
					continue;
				}

				// 全数検査明細にも処理結果状況区分を設定 
				// ※クライアントのshowMergeでエラー行はマージしない動作とするために、処理結果状況区分が必要なので
				MCList<Chk01_DtlR> subDtlL = down1().subList(idxkeyDtl, downR.insp_no());
				for (Chk01_DtlR subDtlR : subDtlL) {
					subDtlR.rtn_sts_typ(downR.rtn_sts_typ());
				}

				// 抜取明細にも処理結果状況区分を設定 
				// ※クライアントのshowMergeでエラー行はマージしない動作とするために、処理結果状況区分が必要なので
				MCList<Chk01_RsltSmplR> subSmplL = down2().subList(idxkeySmpl, downR.insp_no());
				for (Chk01_RsltSmplR subSmplR : subSmplL) {
					subSmplR.rtn_sts_typ(downR.rtn_sts_typ());
				}
			}
		}

		@Override
		protected <T extends MCRow> MCList<T> getSplitList(MCParam p) {
			MCList<T> ret = (MCList<T>) up0();
			return ret;
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_HdrR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_HdrR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_HdrR> up0L = ((MCList<Chk01_HdrR>)ope.up(0));
				MCList<Chk01_DtlR> up1L = ((MCList<Chk01_DtlR>)ope.up(1));
				MCList<Chk01_RsltSmplR> up2L = ((MCList<Chk01_RsltSmplR>)ope.up(2));
				
				up0L.setAll(l);

				// ヘッダに対応する明細を設定
				MCIndexKey dtlIdx = up1().createIndex(Chk01_DtlR.$insp_no);
				MCIndexKey smplIdx = up2().createIndex(Chk01_RsltSmplR.$insp_no);
				for (Chk01_HdrR hdrR : l) {
					up1L.addAll(up1().subList(dtlIdx, hdrR.insp_no()));
					up2L.addAll(up2().subList(smplIdx, hdrR.insp_no()));
				}

				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk01_HdrR>> splitUp(MCList<Chk01_HdrR> list, int max) {
			List<MCList<Chk01_HdrR>> ret = new ArrayList<>();
			MCList<Chk01_HdrR>[] grpL = list.groupList(Chk01_HdrR.$itm_cd,
					Chk01_HdrR.$itm_sub1, Chk01_HdrR.$itm_sub2, Chk01_HdrR.$itm_sub3);
			MCList<Chk01_HdrR> tmp = MCList.create(Chk01_HdrR.class);
			for (MCList<Chk01_HdrR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk01_HdrR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());
			setPegNo(up1());
			setPegNo(up2());

			setCRUDTyp();
		}

		/**
		 * データ更新区分を設定する。
		 */
		protected void setCRUDTyp() {
			MCIndexKey idxkey = up0().createIndex(Chk01_HdrR.$insp_no);
			for (Chk01_DtlR r : up1()) {
				if (r.isStatusCreate()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (r.isStatusDelete()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else if (r.isStatusModify())  {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				Chk01_HdrR hdrR = up0().getFirst(idxkey, r.insp_no());
				r.setGUIIndex(hdrR.getGUIIndex());
			}

			for (Chk01_RsltSmplR r : up2()) {
				if (r.isStatusCreate()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (r.isStatusDelete()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else if (r.isStatusModify())  {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				Chk01_HdrR hdrR = up0().getFirst(idxkey, r.insp_no());
				r.setGUIIndex(hdrR.getGUIIndex());
			}
		}

		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
			down2().setAll(up2());
			editDown();
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBFL_InspActLstReg.Chk01 ope = MSBFL_InspActLstReg.crtChk01();
			
			ope.up0().setAll(up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());

			ope.exec();

			up0().setAll(ope.down0());
			up1().setAll(ope.down1());
			up2().setAll(ope.down2());
		}

		/**
		 * 検査実績を登録・訂正する。
		 * @param notErrL
		 * @param dtlL
		 */
		protected void callInspActServiceUpd01(MCList<Chk01_HdrR> notErrL) {
			MSBFL_InspActService.InspAct_Upd01 o = MSBFL_InspActService.crtInspAct_Upd01();

			MCList<Chk01_DtlR> subDtlL = MCList.create(Chk01_DtlR.class);
			MCList<Chk01_RsltSmplR> subSmplL = MCList.create(Chk01_RsltSmplR.class);
			for (Chk01_HdrR hdrR : notErrL) {
				subDtlL.addAll(up1().subList(Chk01_DtlR.$insp_no, hdrR.insp_no()));
				subSmplL.addAll(up2().subList(Chk01_RsltSmplR.$insp_no, hdrR.insp_no()));
			}

			addAll(o.up0(), notErrL, createMap_InspAct_Upd01_HdrR_Chk01_HdrR());
			addAll(o.up1(), subDtlL, createMap_InspAct_Upd01_DtlR_Chk01_DtlR());
			addAll(o.up2(), subSmplL, createMap_InspAct_Upd01_SmplR_Chk01_RsltSmplR());
			
			o.exec();
			
			String[] hdrDestCols = new String[] {Chk01_HdrR.$insp_no, Chk01_HdrR.$insp_act_no, Chk01_HdrR.$insp_sts_typ, Chk01_HdrR.$insp_sts_typ_nm, Chk01_HdrR.$insp_aprv_sts_typ, Chk01_HdrR.$insp_aprv_sts_typ_nm};
			String[] hdrSrcCols = new String[] {InspAct_Upd01_HdrR.$insp_no, InspAct_Upd01_HdrR.$insp_act_no, InspAct_Upd01_HdrR.$insp_sts_typ, InspAct_Upd01_HdrR.$insp_sts_typ_nm, InspAct_Upd01_HdrR.$insp_aprv_sts_typ, InspAct_Upd01_HdrR.$insp_aprv_sts_typ_nm};
			copyByPegNo(notErrL, hdrDestCols, o.down0(), hdrSrcCols);
			
			String[] dtlDestCols = new String[] {Chk01_DtlR.$insp_act_d_no, Chk01_DtlR.$insp_act_no};
			String[] dtlSrcCols = new String[] {InspAct_Upd01_DtlR.$insp_act_d_no, InspAct_Upd01_DtlR.$insp_act_no};
			copyByPegNo(subDtlL, dtlDestCols, o.down1(), dtlSrcCols);
			
			String[] smplDestCols = new String[] {Chk01_RsltSmplR.$insp_smpl_act_no, Chk01_RsltSmplR.$insp_act_no};
			String[] smplSrcCols = new String[] {InspAct_Upd01_SmplR.$insp_smpl_act_no, InspAct_Upd01_SmplR.$insp_act_no};
			copyByPegNo(subSmplL, smplDestCols, o.down2(), smplSrcCols);
		}

		/**
		 * 処理結果状態区分を設定する。
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk01_HdrR> l) {
			dbTran().commit();
			for (Chk01_HdrR r : l) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * エラーハンドルを設定する。
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e, MCList<Chk01_HdrR> l) {
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
			for (Chk01_HdrR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		protected Map_InspAct_Upd01_HdrR_Chk01_HdrR<InspAct_Upd01_HdrR, Chk01_HdrR> createMap_InspAct_Upd01_HdrR_Chk01_HdrR() {
			return new Map_InspAct_Upd01_HdrR_Chk01_HdrR<InspAct_Upd01_HdrR, Chk01_HdrR>();
		}
		
		public class Map_InspAct_Upd01_HdrR_Chk01_HdrR<D extends InspAct_Upd01_HdrR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Upd01_HdrR.$peg_no, Chk01_HdrR.$peg_no);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_no, Chk01_HdrR.$insp_no);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_act_no, Chk01_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_freq, Chk01_HdrR.$insp_freq);
				addColumnPathMap(InspAct_Upd01_HdrR.$src_no1, Chk01_HdrR.$src_no1);
				addColumnPathMap(InspAct_Upd01_HdrR.$src_no2, Chk01_HdrR.$src_no2);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_typ, Chk01_HdrR.$insp_typ);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_mtd_typ, Chk01_HdrR.$insp_mtd_typ);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_sts_typ, Chk01_HdrR.$insp_sts_typ);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_aprv_sts_typ, Chk01_HdrR.$insp_aprv_sts_typ);
				addColumnPathMap(InspAct_Upd01_HdrR.$itm_cd, Chk01_HdrR.$itm_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$itm_sub1, Chk01_HdrR.$itm_sub1);
				addColumnPathMap(InspAct_Upd01_HdrR.$itm_sub2, Chk01_HdrR.$itm_sub2);
				addColumnPathMap(InspAct_Upd01_HdrR.$itm_sub3, Chk01_HdrR.$itm_sub3);
				addColumnPathMap(InspAct_Upd01_HdrR.$lot_no, Chk01_HdrR.$lot_no);
				addColumnPathMap(InspAct_Upd01_HdrR.$sublot_no, Chk01_HdrR.$sublot_no);
				addColumnPathMap(InspAct_Upd01_HdrR.$quality_typ, Chk01_HdrR.$quality_typ);
				addColumnPathMap(InspAct_Upd01_HdrR.$gd_cd, Chk01_HdrR.$gd_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$dfct_rsn_cd, Chk01_HdrR.$dfct_rsn_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$sppl_cd, Chk01_HdrR.$sppl_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$maker_cd, Chk01_HdrR.$maker_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$mfg_loc_cd, Chk01_HdrR.$mfg_loc_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$from_site_cd, Chk01_HdrR.$from_site_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$base_unit_qty, Chk01_HdrR.$base_unit_qty);
				addColumnPathMap(InspAct_Upd01_HdrR.$base_unit_cd, Chk01_HdrR.$base_unit_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$st_tm, Chk01_HdrR.$st_tm);
				addColumnPathMap(InspAct_Upd01_HdrR.$end_tm, Chk01_HdrR.$end_tm);
				addColumnPathMap(InspAct_Upd01_HdrR.$stt_can_ac_dt, Chk01_HdrR.$stt_can_ac_dt);
				addColumnPathMap(InspAct_Upd01_HdrR.$act_usr_cd, Chk01_HdrR.$act_usr_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$act_dpt_cd, Chk01_HdrR.$act_dpt_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$lmt_dt_frm_typ, Chk01_HdrR.$lmt_dt_frm_typ);
				addColumnPathMap(InspAct_Upd01_HdrR.$lmt_dt_frm, Chk01_HdrR.$lmt_dt_frm);
				addColumnPathMap(InspAct_Upd01_HdrR.$vld_dt, Chk01_HdrR.$vld_dt);
				addColumnPathMap(InspAct_Upd01_HdrR.$lmt_dt, Chk01_HdrR.$lmt_dt);
				addColumnPathMap(InspAct_Upd01_HdrR.$act_cont_fctr, Chk01_HdrR.$act_cont_fctr);
				addColumnPathMap(InspAct_Upd01_HdrR.$intr_rmrks, Chk01_HdrR.$act_intr_rmrks);
				addColumnPathMap(InspAct_Upd01_HdrR.$lot_rmrks, Chk01_HdrR.$lot_rmrks);
				addColumnPathMap(InspAct_Upd01_HdrR.$sub_char1, Chk01_HdrR.$sub_char1);
				addColumnPathMap(InspAct_Upd01_HdrR.$sub_char2, Chk01_HdrR.$sub_char2);
				addColumnPathMap(InspAct_Upd01_HdrR.$sub_char3, Chk01_HdrR.$sub_char3);
				addColumnPathMap(InspAct_Upd01_HdrR.$vld_dt_upd_flg, Chk01_HdrR.$vld_dt_upd_flg);
			}
		}
		
		protected Map_InspAct_Upd01_DtlR_Chk01_DtlR<InspAct_Upd01_DtlR, Chk01_DtlR> createMap_InspAct_Upd01_DtlR_Chk01_DtlR() {
			return new Map_InspAct_Upd01_DtlR_Chk01_DtlR<InspAct_Upd01_DtlR, Chk01_DtlR>();
		}
		
		public class Map_InspAct_Upd01_DtlR_Chk01_DtlR<D extends InspAct_Upd01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Upd01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$insp_no, Chk01_DtlR.$insp_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$insp_act_d_no, Chk01_DtlR.$insp_act_d_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$insp_act_no, Chk01_DtlR.$insp_act_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(InspAct_Upd01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(InspAct_Upd01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(InspAct_Upd01_DtlR.$loc_cd, Chk01_DtlR.$loc_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$str_ln_cd, Chk01_DtlR.$str_ln_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$quality_typ, Chk01_DtlR.$quality_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$stk_insp_typ, Chk01_DtlR.$stk_insp_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$stk_id_typ, Chk01_DtlR.$stk_id_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$stk_bp_cd, Chk01_DtlR.$stk_bp_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$gd_cd, Chk01_DtlR.$gd_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$stk_arrv_bp_cd, Chk01_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$lot_no, Chk01_DtlR.$lot_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$sublot_no, Chk01_DtlR.$sublot_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno1, Chk01_DtlR.$sno1);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno1_mng_typ, Chk01_DtlR.$sno1_mng_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno2, Chk01_DtlR.$sno2);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno2_mng_typ, Chk01_DtlR.$sno2_mng_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno3, Chk01_DtlR.$sno3);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno3_mng_typ, Chk01_DtlR.$sno3_mng_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno4, Chk01_DtlR.$sno4);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno4_mng_typ, Chk01_DtlR.$sno4_mng_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$fix_no_typ, Chk01_DtlR.$fix_no_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$fix_no, Chk01_DtlR.$fix_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$pack_unit_qty, Chk01_DtlR.$pack_unit_qty);
				addColumnPathMap(InspAct_Upd01_DtlR.$pack_unit_cd, Chk01_DtlR.$pack_unit_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
				addColumnPathMap(InspAct_Upd01_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$pack_xfr_pack_unit_qty, Chk01_DtlR.$pack_xfr_pack_unit_qty);
				addColumnPathMap(InspAct_Upd01_DtlR.$pack_xfr_pack_unit_cd, Chk01_DtlR.$pack_xfr_pack_unit_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$pack_xfr_base_unit_qty, Chk01_DtlR.$pack_xfr_base_unit_qty);
				addColumnPathMap(InspAct_Upd01_DtlR.$pack_xfr_base_unit_cd, Chk01_DtlR.$pack_xfr_base_unit_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$dfct_rsn_cd, Chk01_DtlR.$dfct_rsn_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$ac_dt, Chk01_DtlR.$ac_dt);
				addColumnPathMap(InspAct_Upd01_DtlR.$can_ac_dt, Chk01_DtlR.$can_ac_dt);
				addColumnPathMap(InspAct_Upd01_DtlR.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
				addColumnPathMap(InspAct_Upd01_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
				addColumnPathMap(InspAct_Upd01_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
				addColumnPathMap(InspAct_Upd01_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
				addColumnPathMap(InspAct_Upd01_DtlR.$rmrks_upd_flg, Chk01_DtlR.$rmrks_upd_flg);
			}
		}
		
		protected Map_InspAct_Upd01_SmplR_Chk01_RsltSmplR<InspAct_Upd01_SmplR,Chk01_RsltSmplR> createMap_InspAct_Upd01_SmplR_Chk01_RsltSmplR() {
			return new Map_InspAct_Upd01_SmplR_Chk01_RsltSmplR<InspAct_Upd01_SmplR, Chk01_RsltSmplR>();
		}
		
		public class Map_InspAct_Upd01_SmplR_Chk01_RsltSmplR<D extends InspAct_Upd01_SmplR, S extends Chk01_RsltSmplR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Upd01_SmplR.$peg_no, Chk01_RsltSmplR.$peg_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$insp_no, Chk01_RsltSmplR.$insp_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$data_crud_typ, Chk01_RsltSmplR.$data_crud_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$insp_smpl_act_no, Chk01_RsltSmplR.$insp_smpl_act_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$insp_schd_no, Chk01_RsltSmplR.$insp_schd_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$insp_act_no, Chk01_RsltSmplR.$insp_act_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$itm_cd, Chk01_RsltSmplR.$itm_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$itm_sub1, Chk01_RsltSmplR.$itm_sub1);
				addColumnPathMap(InspAct_Upd01_SmplR.$itm_sub2, Chk01_RsltSmplR.$itm_sub2);
				addColumnPathMap(InspAct_Upd01_SmplR.$itm_sub3, Chk01_RsltSmplR.$itm_sub3);
				addColumnPathMap(InspAct_Upd01_SmplR.$so_qty, Chk01_RsltSmplR.$so_qty);
				addColumnPathMap(InspAct_Upd01_SmplR.$smpl_qty, Chk01_RsltSmplR.$smpl_qty);
				addColumnPathMap(InspAct_Upd01_SmplR.$base_unit_cd, Chk01_RsltSmplR.$base_unit_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$pack_xfr_pack_unit_qty, Chk01_RsltSmplR.$pack_xfr_pack_unit_qty);
				addColumnPathMap(InspAct_Upd01_SmplR.$pack_xfr_pack_unit_cd, Chk01_RsltSmplR.$pack_xfr_pack_unit_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$pack_xfr_base_unit_qty, Chk01_RsltSmplR.$pack_xfr_base_unit_qty);
				addColumnPathMap(InspAct_Upd01_SmplR.$pack_xfr_base_unit_cd, Chk01_RsltSmplR.$pack_xfr_base_unit_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$loc_cd, Chk01_RsltSmplR.$loc_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$str_ln_cd, Chk01_RsltSmplR.$str_ln_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$quality_typ, Chk01_RsltSmplR.$quality_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$stk_insp_typ, Chk01_RsltSmplR.$stk_insp_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$stk_id_typ, Chk01_RsltSmplR.$stk_id_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$stk_bp_cd, Chk01_RsltSmplR.$stk_bp_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$gd_cd, Chk01_RsltSmplR.$gd_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$stk_arrv_bp_cd, Chk01_RsltSmplR.$stk_arrv_bp_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$lot_no, Chk01_RsltSmplR.$lot_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$sublot_no, Chk01_RsltSmplR.$sublot_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno1, Chk01_RsltSmplR.$sno1);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno1_mng_typ, Chk01_RsltSmplR.$sno1_mng_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno2, Chk01_RsltSmplR.$sno2);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno2_mng_typ, Chk01_RsltSmplR.$sno2_mng_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno3, Chk01_RsltSmplR.$sno3);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno3_mng_typ, Chk01_RsltSmplR.$sno3_mng_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno4, Chk01_RsltSmplR.$sno4);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno4_mng_typ, Chk01_RsltSmplR.$sno4_mng_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$fix_no_typ, Chk01_RsltSmplR.$fix_no_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$fix_no, Chk01_RsltSmplR.$fix_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$act_tm, Chk01_RsltSmplR.$act_tm);
				addColumnPathMap(InspAct_Upd01_SmplR.$ac_dt, Chk01_RsltSmplR.$ac_dt);
				addColumnPathMap(InspAct_Upd01_SmplR.$can_ac_dt, Chk01_RsltSmplR.$can_ac_dt);
				addColumnPathMap(InspAct_Upd01_SmplR.$bd_dpt_cd, Chk01_RsltSmplR.$bd_dpt_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$trd_rmrks, Chk01_RsltSmplR.$trd_rmrks);
				addColumnPathMap(InspAct_Upd01_SmplR.$intr_rmrks, Chk01_RsltSmplR.$intr_rmrks);
				addColumnPathMap(InspAct_Upd01_SmplR.$sub_char1, Chk01_RsltSmplR.$sub_char1);
				addColumnPathMap(InspAct_Upd01_SmplR.$sub_char2, Chk01_RsltSmplR.$sub_char2);
				addColumnPathMap(InspAct_Upd01_SmplR.$sub_char3, Chk01_RsltSmplR.$sub_char3);
				addColumnPathMap(InspAct_Upd01_SmplR.$rmrks_upd_flg, Chk01_RsltSmplR.$rmrks_upd_flg);
			}
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 検査実績ヘッダの一括判定を行う<br>
	 */
	public class Upd02 extends MSBFL_InspActLstReg_MC_A.Upd02 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {

			editUp();

			// 必要
			MCList<Chk02_DtlR> dtlL = MCList.create(Chk02_DtlR.class);

			// 判定前チェック
			callThisChk02(dtlL);

			MCList<Chk02_HdrR> notErrL = up0().subList(Chk02_HdrR.$err_flg, false);
			if (notErrL.size() != 0) {
				// 検査実績判定
				callInspActServiceUpd02(notErrL, dtlL);
			}
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk02_HdrR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk02_HdrR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk02_HdrR> up0L = ((MCList<Chk02_HdrR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk02_HdrR>> splitUp(MCList<Chk02_HdrR> list, int max) {
			List<MCList<Chk02_HdrR>> ret = new ArrayList<>();
			MCList<Chk02_HdrR>[] grpL = list.groupList(Chk02_HdrR.$itm_cd,
					Chk02_HdrR.$itm_sub1, Chk02_HdrR.$itm_sub2, Chk02_HdrR.$itm_sub3);
			MCList<Chk02_HdrR> tmp = MCList.create(Chk02_HdrR.class);
			for (MCList<Chk02_HdrR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk02_HdrR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02(MCList<Chk02_DtlR> dtlL) {
			MSBFL_InspActLstReg.Chk02 ope = MSBFL_InspActLstReg.crtChk02();
			
			ope.up0().setAll(up0());
			ope.up1().setAll(dtlL);

			ope.exec();

			up0().setAll(ope.down0());
			dtlL.setAll(ope.down1());
		}
		
		/**
		 * 検査実績を判定する。
		 * 
		 * @param notErrL
		 * @param dtlL
		 */
		protected void callInspActServiceUpd02(MCList<Chk02_HdrR> notErrL, MCList<Chk02_DtlR> dtlL) {
			MSBFL_InspActService.InspAct_Upd02 o = MSBFL_InspActService.crtInspAct_Upd02();
			
			MCList<Chk02_DtlR> subDtlL = MCList.create(Chk02_DtlR.class);
			for (Chk02_HdrR hdrR : notErrL) {
				subDtlL.addAll(dtlL.subList(Chk02_DtlR.$insp_no, hdrR.insp_no()));
			}

			addAll(o.up0(), notErrL, createMap_InspAct_Upd02_HdrR_Chk02_HdrR());
			addAll(o.up1(), subDtlL, createMap_InspAct_Upd02_DtlR_Chk02_DtlR());
			
			o.exec();
			
			String[] hdrDestCols = new String[] {Chk02_HdrR.$insp_no, Chk02_HdrR.$insp_act_no, Chk02_HdrR.$insp_aprv_sts_typ, Chk02_HdrR.$insp_aprv_sts_typ_nm};
			String[] hdrSrcCols = new String[] {InspAct_Upd02_HdrR.$insp_no, InspAct_Upd02_HdrR.$insp_act_no, InspAct_Upd02_HdrR.$insp_aprv_sts_typ, InspAct_Upd02_HdrR.$insp_aprv_sts_typ_nm};
			copyByPegNo(notErrL, hdrDestCols, o.down0(), hdrSrcCols);
			
			String[] dtlDestCols = new String[] {Chk02_DtlR.$insp_judg_d_no, Chk02_DtlR.$insp_act_no};
			String[] dtlSrcCols = new String[] {InspAct_Upd02_DtlR.$insp_judg_d_no, InspAct_Upd02_DtlR.$insp_act_no};
			copyByPegNo(subDtlL, dtlDestCols, o.down1(), dtlSrcCols);
		}

		/**
		 * 処理結果状態区分を設定する。
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk02_HdrR> l) {
			dbTran().commit();
			for (Chk02_HdrR r : l) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * エラーハンドルを設定する。
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e, MCList<Chk02_HdrR> l) {
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
			for (Chk02_HdrR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		
		protected Map_InspAct_Upd02_HdrR_Chk02_HdrR<InspAct_Upd02_HdrR, Chk02_HdrR> createMap_InspAct_Upd02_HdrR_Chk02_HdrR() {
			return new Map_InspAct_Upd02_HdrR_Chk02_HdrR<InspAct_Upd02_HdrR, Chk02_HdrR>();
		}
		
		public class Map_InspAct_Upd02_HdrR_Chk02_HdrR<D extends InspAct_Upd02_HdrR, S extends Chk02_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Upd02_HdrR.$peg_no, Chk02_HdrR.$peg_no);
				addColumnPathMap(InspAct_Upd02_HdrR.$insp_no, Chk02_HdrR.$insp_no);
				addColumnPathMap(InspAct_Upd02_HdrR.$insp_act_no, Chk02_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Upd02_HdrR.$insp_typ, Chk02_HdrR.$insp_typ);
				addColumnPathMap(InspAct_Upd02_HdrR.$insp_sts_typ, Chk02_HdrR.$insp_sts_typ);
				addColumnPathMap(InspAct_Upd02_HdrR.$insp_aprv_sts_typ, Chk02_HdrR.$insp_aprv_sts_typ);
				addColumnPathMap(InspAct_Upd02_HdrR.$itm_cd, Chk02_HdrR.$itm_cd);
				addColumnPathMap(InspAct_Upd02_HdrR.$itm_sub1, Chk02_HdrR.$itm_sub1);
				addColumnPathMap(InspAct_Upd02_HdrR.$itm_sub2, Chk02_HdrR.$itm_sub2);
				addColumnPathMap(InspAct_Upd02_HdrR.$itm_sub3, Chk02_HdrR.$itm_sub3);
				addColumnPathMap(InspAct_Upd02_HdrR.$lot_no, Chk02_HdrR.$lot_no);
				addColumnPathMap(InspAct_Upd02_HdrR.$sublot_no, Chk02_HdrR.$sublot_no);
				addColumnPathMap(InspAct_Upd02_HdrR.$judg_dt, Chk02_HdrR.$judg_dt);
				addColumnPathMap(InspAct_Upd02_HdrR.$insp_judg_rslt_typ, Chk02_HdrR.$insp_judg_rslt_typ);
				addColumnPathMap(InspAct_Upd02_HdrR.$judg_dpt_cd, Chk02_HdrR.$judg_dpt_cd);
				addColumnPathMap(InspAct_Upd02_HdrR.$judg_usr_cd, Chk02_HdrR.$judg_usr_cd);
				addColumnPathMap(InspAct_Upd02_HdrR.$judg_rsn, Chk02_HdrR.$judg_rsn);
				addColumnPathMap(InspAct_Upd02_HdrR.$lmt_dt_frm_typ, Chk02_HdrR.$lmt_dt_frm_typ);
				addColumnPathMap(InspAct_Upd02_HdrR.$lmt_dt_frm, Chk02_HdrR.$lmt_dt_frm);
				addColumnPathMap(InspAct_Upd02_HdrR.$vld_dt, Chk02_HdrR.$vld_dt);
				addColumnPathMap(InspAct_Upd02_HdrR.$lmt_dt, Chk02_HdrR.$lmt_dt);
				addColumnPathMap(InspAct_Upd02_HdrR.$act_cont_fctr, Chk02_HdrR.$act_cont_fctr);
				addColumnPathMap(InspAct_Upd02_HdrR.$vld_dt_upd_flg, Chk02_HdrR.$vld_dt_upd_flg);
				addColumnPathMap(InspAct_Upd02_HdrR.$intr_rmrks, Chk02_HdrR.$act_intr_rmrks);
				addColumnPathMap(InspAct_Upd02_HdrR.$lot_rmrks, Chk02_HdrR.$lot_rmrks);
				addColumnPathMap(InspAct_Upd02_HdrR.$sub_char1, Chk02_HdrR.$sub_char1);
				addColumnPathMap(InspAct_Upd02_HdrR.$sub_char2, Chk02_HdrR.$sub_char2);
				addColumnPathMap(InspAct_Upd02_HdrR.$sub_char3, Chk02_HdrR.$sub_char3);
			}
		}
		
		protected Map_InspAct_Upd02_DtlR_Chk02_DtlR<InspAct_Upd02_DtlR, Chk02_DtlR> createMap_InspAct_Upd02_DtlR_Chk02_DtlR() {
			return new Map_InspAct_Upd02_DtlR_Chk02_DtlR<InspAct_Upd02_DtlR, Chk02_DtlR>();
		}
		
		public class Map_InspAct_Upd02_DtlR_Chk02_DtlR<D extends InspAct_Upd02_DtlR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Upd02_DtlR.$peg_no, Chk02_DtlR.$peg_no);
				addColumnPathMap(InspAct_Upd02_DtlR.$data_crud_typ, Chk02_DtlR.$data_crud_typ);
				addColumnPathMap(InspAct_Upd02_DtlR.$insp_no, Chk02_DtlR.$insp_no);
				addColumnPathMap(InspAct_Upd02_DtlR.$insp_act_no, Chk02_DtlR.$insp_act_no);
				addColumnPathMap(InspAct_Upd02_DtlR.$itm_cd, Chk02_DtlR.$itm_cd);
				addColumnPathMap(InspAct_Upd02_DtlR.$itm_sub1, Chk02_DtlR.$itm_sub1);
				addColumnPathMap(InspAct_Upd02_DtlR.$itm_sub2, Chk02_DtlR.$itm_sub2);
				addColumnPathMap(InspAct_Upd02_DtlR.$itm_sub3, Chk02_DtlR.$itm_sub3);
				addColumnPathMap(InspAct_Upd02_DtlR.$loc_cd, Chk02_DtlR.$loc_cd);
				addColumnPathMap(InspAct_Upd02_DtlR.$str_ln_cd, Chk02_DtlR.$str_ln_cd);
				addColumnPathMap(InspAct_Upd02_DtlR.$quality_typ, Chk02_DtlR.$quality_typ);
				addColumnPathMap(InspAct_Upd02_DtlR.$stk_insp_typ, Chk02_DtlR.$stk_insp_typ);
				addColumnPathMap(InspAct_Upd02_DtlR.$stk_id_typ, Chk02_DtlR.$stk_id_typ);
				addColumnPathMap(InspAct_Upd02_DtlR.$stk_bp_cd, Chk02_DtlR.$stk_bp_cd);
				addColumnPathMap(InspAct_Upd02_DtlR.$gd_cd, Chk02_DtlR.$gd_cd);
				addColumnPathMap(InspAct_Upd02_DtlR.$stk_arrv_bp_cd, Chk02_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(InspAct_Upd02_DtlR.$lot_no, Chk02_DtlR.$lot_no);
				addColumnPathMap(InspAct_Upd02_DtlR.$sublot_no, Chk02_DtlR.$sublot_no);
				addColumnPathMap(InspAct_Upd02_DtlR.$sno1, Chk02_DtlR.$sno1);
				addColumnPathMap(InspAct_Upd02_DtlR.$sno1_mng_typ, Chk02_DtlR.$sno1_mng_typ);
				addColumnPathMap(InspAct_Upd02_DtlR.$sno2, Chk02_DtlR.$sno2);
				addColumnPathMap(InspAct_Upd02_DtlR.$sno2_mng_typ, Chk02_DtlR.$sno2_mng_typ);
				addColumnPathMap(InspAct_Upd02_DtlR.$sno3, Chk02_DtlR.$sno3);
				addColumnPathMap(InspAct_Upd02_DtlR.$sno3_mng_typ, Chk02_DtlR.$sno3_mng_typ);
				addColumnPathMap(InspAct_Upd02_DtlR.$sno4, Chk02_DtlR.$sno4);
				addColumnPathMap(InspAct_Upd02_DtlR.$sno4_mng_typ, Chk02_DtlR.$sno4_mng_typ);
				addColumnPathMap(InspAct_Upd02_DtlR.$fix_no_typ, Chk02_DtlR.$fix_no_typ);
				addColumnPathMap(InspAct_Upd02_DtlR.$fix_no, Chk02_DtlR.$fix_no);
				addColumnPathMap(InspAct_Upd02_DtlR.$pack_unit_qty, Chk02_DtlR.$pack_unit_qty);
				addColumnPathMap(InspAct_Upd02_DtlR.$pack_unit_cd, Chk02_DtlR.$pack_unit_cd);
				addColumnPathMap(InspAct_Upd02_DtlR.$base_unit_qty, Chk02_DtlR.$base_unit_qty);
				addColumnPathMap(InspAct_Upd02_DtlR.$base_unit_cd, Chk02_DtlR.$base_unit_cd);
				addColumnPathMap(InspAct_Upd02_DtlR.$ac_dt, Chk02_DtlR.$ac_dt);
				addColumnPathMap(InspAct_Upd02_DtlR.$intr_rmrks, Chk02_DtlR.$intr_rmrks);
				addColumnPathMap(InspAct_Upd02_DtlR.$sub_char1, Chk02_DtlR.$sub_char1);
				addColumnPathMap(InspAct_Upd02_DtlR.$sub_char2, Chk02_DtlR.$sub_char2);
				addColumnPathMap(InspAct_Upd02_DtlR.$sub_char3, Chk02_DtlR.$sub_char3);
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 検査実績ヘッダの一括取消を行う<br>
	 */
	public class Del01 extends MSBFL_InspActLstReg_MC_A.Del01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {

			editUp();

			// 前チェック処理
			callThisChk03();

			MCList<Chk03_HdrR> notErrL = up0().subList(Chk03_HdrR.$err_flg, false);
			if (notErrL.size() != 0) {

				// 検査実績の取消
				callInspActServiceDel01(notErrL);
			}
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk03_HdrR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk03_HdrR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk03_HdrR> up0L = ((MCList<Chk03_HdrR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk03_HdrR>> splitUp(MCList<Chk03_HdrR> list, int max) {
			List<MCList<Chk03_HdrR>> ret = new ArrayList<>();
			MCList<Chk03_HdrR>[] grpL = list.groupList(Chk03_HdrR.$itm_cd,
					Chk03_HdrR.$itm_sub1, Chk03_HdrR.$itm_sub2, Chk03_HdrR.$itm_sub3);
			MCList<Chk03_HdrR> tmp = MCList.create(Chk03_HdrR.class);
			for (MCList<Chk03_HdrR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk03_HdrR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MSBFL_InspActLstReg.Chk03 ope = MSBFL_InspActLstReg.crtChk03();

			ope.up0().setAll(up0());

			ope.exec();

			up0().setAll(ope.down0());
		}
		
		/**
		 * 検査実績を取り消す。
		 * 
		 * @param notErrL
		 */
		protected void callInspActServiceDel01(MCList<Chk03_HdrR> notErrL) {
			MSBFL_InspActService.InspAct_Del01 o = MSBFL_InspActService.crtInspAct_Del01();

			addAll(o.up0(), notErrL, createMap_InspAct_Del01_CndR_Chk03_HdrR());

			o.exec();

			String[] destCols = new String[] {Chk03_HdrR.$insp_no,
					Chk03_HdrR.$insp_act_no, Chk03_HdrR.$insp_sts_typ, Chk03_HdrR.$insp_sts_typ_nm, Chk03_HdrR.$insp_aprv_sts_typ, Chk03_HdrR.$insp_aprv_sts_typ_nm};
			String[] srcCols = new String[] {InspAct_Del01_CndR.$insp_no,
					InspAct_Del01_CndR.$insp_act_no, InspAct_Del01_CndR.$insp_sts_typ, InspAct_Del01_CndR.$insp_sts_typ_nm, InspAct_Del01_CndR.$insp_aprv_sts_typ, InspAct_Del01_CndR.$insp_aprv_sts_typ_nm};

			copyByPegNo(notErrL, destCols, o.down0(), srcCols);
		}

		/**
		 * 処理結果状態区分を設定する。
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk03_HdrR> l) {
			dbTran().commit();
			for (Chk03_HdrR r : l) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * エラーハンドルを設定する。
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e, MCList<Chk03_HdrR> l) {
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
			for (Chk03_HdrR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		protected Map_InspAct_Del01_CndR_Chk03_HdrR<InspAct_Del01_CndR, Chk03_HdrR> createMap_InspAct_Del01_CndR_Chk03_HdrR() {
			return new Map_InspAct_Del01_CndR_Chk03_HdrR<InspAct_Del01_CndR, Chk03_HdrR>();
		}
		
		public class Map_InspAct_Del01_CndR_Chk03_HdrR<D extends InspAct_Del01_CndR, S extends Chk03_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Del01_CndR.$peg_no, Chk03_HdrR.$peg_no);
				addColumnPathMap(InspAct_Del01_CndR.$insp_no, Chk03_HdrR.$insp_no);
				addColumnPathMap(InspAct_Del01_CndR.$insp_act_no, Chk03_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Del01_CndR.$insp_sts_typ, Chk03_HdrR.$insp_sts_typ);
				addColumnPathMap(InspAct_Del01_CndR.$insp_aprv_sts_typ, Chk03_HdrR.$insp_aprv_sts_typ);
			}
		}
	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 検査実績ヘッダの一括判定取消を行う<br>
	 */
	public class Del02 extends MSBFL_InspActLstReg_MC_A.Del02 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {

			editUp();

			// 前チェック処理
			callThisChk04();

			MCList<Chk04_HdrR> notErrL = up0().subList(Chk04_HdrR.$err_flg, false);
			if (notErrL.size() != 0) {

				// 検査実績の判定取消
				callInspActServiceDel01(notErrL);
			}
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk04() {
			MSBFL_InspActLstReg.Chk04 o = MSBFL_InspActLstReg.crtChk04();
			o.up0().setAll(up0());
			o.exec();
		}

		/**
		 * 検査実績判定を取り消す。
		 * 
		 * @param notErrL
		 */
		protected void callInspActServiceDel01(MCList<Chk04_HdrR> notErrL) {
			MSBFL_InspActService.InspAct_Del01 o = MSBFL_InspActService.crtInspAct_Del01();
			addAll(o.up0(), notErrL, createMap_InspAct_Del01_CndR_Chk04_HdrR());
			o.exec();

			String[] destCols = new String[] {Chk04_HdrR.$insp_no,
					Chk04_HdrR.$insp_act_no, Chk04_HdrR.$insp_sts_typ, Chk04_HdrR.$insp_aprv_sts_typ, Chk04_HdrR.$insp_aprv_sts_typ_nm};
			String[] srcCols = new String[] {InspAct_Del01_CndR.$insp_no,
					InspAct_Del01_CndR.$insp_act_no, InspAct_Del01_CndR.$insp_sts_typ, InspAct_Del01_CndR.$insp_aprv_sts_typ, InspAct_Del01_CndR.$insp_aprv_sts_typ_nm};
			copyByPegNo(notErrL, destCols, o.down0(), srcCols);
		}

		/**
		 * 処理結果状態区分を設定する。
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk04_HdrR> l) {
			dbTran().commit();
			for (Chk04_HdrR r : l) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * エラーハンドルを設定する。
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e, MCList<Chk04_HdrR> l) {
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
			for (Chk04_HdrR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		protected Map_InspAct_Del01_CndR_Chk04_HdrR<InspAct_Del01_CndR, Chk04_HdrR> createMap_InspAct_Del01_CndR_Chk04_HdrR() {
			return new Map_InspAct_Del01_CndR_Chk04_HdrR<InspAct_Del01_CndR, Chk04_HdrR>();
		}
		
		public class Map_InspAct_Del01_CndR_Chk04_HdrR<D extends InspAct_Del01_CndR, S extends Chk04_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Del01_CndR.$peg_no, Chk04_HdrR.$peg_no);
				addColumnPathMap(InspAct_Del01_CndR.$insp_no, Chk04_HdrR.$insp_no);
				addColumnPathMap(InspAct_Del01_CndR.$insp_act_no, Chk04_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Del01_CndR.$insp_sts_typ, Chk04_HdrR.$insp_sts_typ);
				addColumnPathMap(InspAct_Del01_CndR.$insp_aprv_sts_typ, Chk04_HdrR.$insp_aprv_sts_typ);
				addColumnPathMap(InspAct_Del01_CndR.$insp_judg_rslt_typ, Chk04_HdrR.$insp_judg_rslt_typ);
				addColumnPathMap(InspAct_Del01_CndR.$judg_rsn, Chk04_HdrR.$judg_rsn);
			}
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk04_HdrR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk04_HdrR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk04_HdrR> up0L = ((MCList<Chk04_HdrR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk04_HdrR>> splitUp(MCList<Chk04_HdrR> list, int max) {
			List<MCList<Chk04_HdrR>> ret = new ArrayList<>();
			MCList<Chk04_HdrR>[] grpL = list.groupList(Chk04_HdrR.$itm_cd,
					Chk04_HdrR.$itm_sub1, Chk04_HdrR.$itm_sub2, Chk04_HdrR.$itm_sub3);
			MCList<Chk04_HdrR> tmp = MCList.create(Chk04_HdrR.class);
			for (MCList<Chk04_HdrR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk04_HdrR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 検査成績書を発行する<br>
	 */
	public class Prnt01 extends MSBFL_InspActLstReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();

			// 検査成績書発行
			callInspRptServicePrnt02();

			// 処理結果状況区分設定
			setRtnStsTyp();

			// 下り電文設定
			setDown();
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 処理結果状況区分を設定する。
		 */
		protected void setRtnStsTyp() {
			for (Prnt01_HdrR r : up0()) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * 検査成績書を発行する。
		 */
		protected void callInspRptServicePrnt02() {
			MSBFL_InspRptService.InspRpt_Prnt02 o = MSBFL_InspRptService.crtInspRpt_Prnt02();
			addAll(o.up0(), up0(), createMap_InspRpt_Prnt02_DtlR_Prnt01_HdrR());
			o.exec();

			String[] destCols = new String[] {Prnt01_HdrR.$insp_no, Prnt01_HdrR.$insp_rslt_prnt_flg, Prnt01_HdrR.$insp_rslt_prnt_tm, Prnt01_HdrR.$err_flg};
			String[] srcCols = new String[] {InspRpt_Prnt02_DtlR.$insp_no, InspRpt_Prnt02_DtlR.$insp_rslt_prnt_flg, InspRpt_Prnt02_DtlR.$insp_rslt_prnt_tm, Prnt01_HdrR.$err_flg};
			copyByPegNo(up0(), destCols, o.down0(), srcCols);
		}

		protected Map_InspRpt_Prnt02_DtlR_Prnt01_HdrR<InspRpt_Prnt02_DtlR, Prnt01_HdrR> createMap_InspRpt_Prnt02_DtlR_Prnt01_HdrR() {
			return new Map_InspRpt_Prnt02_DtlR_Prnt01_HdrR<InspRpt_Prnt02_DtlR, Prnt01_HdrR>();
		}
		
		public class Map_InspRpt_Prnt02_DtlR_Prnt01_HdrR<D extends InspRpt_Prnt02_DtlR, S extends Prnt01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspRpt_Prnt02_DtlR.$peg_no, Prnt01_HdrR.$peg_no);
				addColumnPathMap(InspRpt_Prnt02_DtlR.$insp_no, Prnt01_HdrR.$insp_no);
			}
		}
	}

	//FMCB CUSTOM END
}