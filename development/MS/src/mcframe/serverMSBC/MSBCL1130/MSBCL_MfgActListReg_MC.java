package mcframe.serverMSBC.MSBCL1130;

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
import mcframe.serverMSBC.MSBCL6050.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBC.MSBCL1130.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBC.MSBCL6110.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeAfterValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverMSBC.MSBCL1130.Query.*;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
import static mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil.*;
import mcframe.serverMSBC.MSBCL6050.*;
import mcframe.serverMSBC.MSBCL6090.*;
import mcframe.serverMSBC.MSBCL6110.*;
import mcframe.serverMSBF.MSBFL5210.Lot_Chk02_CndR;
import mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndR;
import mcframe.serverMSBI.MSBIL5010.MSBIL_ClService;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.param.MCParam;
import java.util.*;
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverMSUC.MSUCL0110.MSUCL_StrLnUtil;
import mcframe.serverMSUC.MSUCL0110.StrLnUtil_Srch01_CndR;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_MfgActListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_MfgActListReg_MC extends MSBCL_MfgActListReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBCL_MfgActListReg_MC_A.Srch01 {
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editUp();
			selectRslt();
		}

		/**
		 * 上り電文の編集
		 * 
		 */
		protected void editUp() {
			if (isDispOper()) {
				up0().addStringColumn("tmp_disp_oper", toTrueStr(true));
			}
			if (up0().cmpl_flg()) {
				up0().addStringColumn("tmp_sts_cmpl_str", MSC_MFG_STS_TYP.CMPL.value());
			}
			if (up0().stt_flg()) {
				up0().addStringColumn("tmp_sts_stt_str", MSC_MFG_STS_TYP.STT.value());
			}
			if (up0().ord_flg()) {
				up0().addStringColumn("tmp_sts_ord_str", MSC_MFG_STS_TYP.ORD.value());
			}

			up0().addStringColumn("tmp_bkf_not_ref_flg_str", toTrueStr(up0().bkf_not_ref_flg()));
			up0().addStringColumn("tmp_inpt_not_comp_flg_str", toTrueStr(up0().inpt_not_comp_flg()));
			up0().addStringColumn("tmp_wk_not_comp_flg_str", toTrueStr(up0().wk_not_comp_flg()));

			// 記録書発行
			if (up0().act_prnt_flg() && up0().not_act_prnt_flg()) {
				// 両方trueなら何もしない
			}
			else if (up0().act_prnt_flg()) {
				up0().addStringColumn("tmp_act_prnt_flg_str", toTrueStr(true));
			}
			else if (up0().not_act_prnt_flg()) {
				up0().addStringColumn("tmp_act_prnt_flg_str", toFalseStr(false));
			}
			
			// 現品票発行
			if (up0().stk_lst_issue_flg() && up0().not_stk_lst_issue_flg()) {
				// 両方trueなら何もしない
			}
			else if (up0().stk_lst_issue_flg()) {
				up0().addStringColumn("tmp_stk_lst_issue_flg_str", toTrueStr(true));
			}
			else if (up0().not_stk_lst_issue_flg()) {
				up0().addStringColumn("tmp_stk_lst_issue_flg_str", toFalseStr(false));
			}
			
			if (isPrntStklstMode()) {
				// 現品票発行種別
				up0().addStringColumn("tmp_stk_lst_flg_str", toTrueStr(true));
			}
			
			// ＭＥＳ対象
			if (up0().mes_tgt_flg() && up0().not_mes_tgt_flg()) {
				// 両方trueなら何もしない
			}
			else if (up0().mes_tgt_flg()){
				up0().addStringColumn("tmp_mes_tgt_flg_str", toTrueStr(true));
			}
			else if (up0().not_mes_tgt_flg()) {
				up0().addStringColumn("tmp_mes_tgt_flg_str", toFalseStr(false));
			}
			
			// 計画外実績抽出条件
			if (up0().unschd_act_flg() && up0().not_unschd_act_flg()) {
				// 両方trueなら何もしない
			}
			else if (up0().unschd_act_flg()) {
				up0().addStringColumn("tmp_unschd_act_flg_str", toTrueStr(true));
			}
			else if (up0().not_unschd_act_flg()) {
				up0().addStringColumn("tmp_unschd_act_flg_str", toFalseStr(false));
			}
			
			if (isAprvOrAprvDelMode()) {
				// 承認種別
				up0().addStringColumn("OPE_VAL", "1");
				up0().addStringColumn("tmp_aprv_usr", mcframe.serverCore.sys.MCSys.user.ID());
				up0().addDateColumn("tmp_today", getToday());
			}
			else {
				up0().addStringColumn("OPE_VAL", "0");
			}
		}
		
		protected boolean isDispOper() {
			if (isSame(up0().disp_unit(), "OPER")) {
				return true;
			}
			return false;
		}
		
		protected boolean isAprvOrAprvDelMode() {
			return isSame(up0().ope(), MSC_MFG_ACT_LIST_REG_OPE.OPE_APRV.value())
					|| isSame(up0().ope(), MSC_MFG_ACT_LIST_REG_OPE.OPE_APRV_DEL.value());
		}
		
		protected boolean isPrntStklstMode() {
			return isSame(up0().ope(), MSC_MFG_ACT_LIST_REG_OPE.OPE_PRNT_STKLST.value());
		}
		
		/**
		 *一覧（製造・工程実績）の検索
		 * 
		 */
		protected void selectRslt() {
			if (isDispOper()) {
				// 工程指図の検索
				if (isInstSrch()) {
					MCQueryPlan instHdrSql = MSBCL1130_MST_MFG_ACT_REM_S02();
					searchForDL(instHdrSql, up0(), down0(), Srch01_RsltR.$mfg_inst_no);
				}

				// 工程実績の検索
				MCQueryPlan actHdrSql = MSBCL1130_MST_MFG_ACT_S02();
				searchForDL(actHdrSql, up0(), down0(), Srch01_RsltR.$mfg_inst_no);
			}
			else {
				// 製造指図の検索
				if (isInstSrch()) {
					MCQueryPlan instHdrSql = MSBCL1130_MST_MFG_ACT_REM_S01();
					searchForDL(instHdrSql, up0(), down0());
				}

				// 製造実績の検索
				if (isActSrch()) {
					MCQueryPlan actHdrSql = MSBCL1130_MST_MFG_ACT_S01();
					searchForDL(actHdrSql, up0(), down0());
				}
			}
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			editRecvOper();
			selectRsltYieldByprod();
			setDown0();
			Map<MCNumber, MCList<Srch01_YieldByProdRsltR>> yieldMap = setDown1();
			setDown0LotNo(yieldMap);
		}

		protected void editRecvOper() {
			if (up0().mes_tgt_flg() && up0().not_mes_tgt_flg()) {
				return;
			}

			MCIndexKey idxkey = down0().createIndex(Srch01_RsltR.$mfg_sts_typ);
			MCList<Srch01_RsltR> rsltL = down0().subList(idxkey, MSC_MFG_STS_TYP.ORD.value());
			if (rsltL.isEmpty()) {
				return;
			}
			setPegNo(rsltL);
			MCList<Srch01_RsltR> tmpL = MCList.create(Srch01_RsltR.class);
			if (isDispOper()) {
				MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 ope = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();
				for (Srch01_RsltR rsltR : rsltL) {
					SCMLinkUtil_Srch01_CndR cndR = SCMLinkUtil_Srch01_CndR.create();
					cndR.peg_no(rsltR.peg_no());
					cndR.if_proc_typ(MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value());
					cndR.loc_cd(rsltR.mfg_loc_cd());
					cndR.itm_cd(rsltR.itm_cd());
					cndR.itm_sub1(rsltR.itm_sub1());
					cndR.itm_sub2(rsltR.itm_sub2());
					cndR.itm_sub3(rsltR.itm_sub3());
					cndR.oper_cd(rsltR.oper_cd());
					cndR.master_dt(getToday());

					ope.up0().add(cndR);
				}
				if (!ope.up0().isEmpty()) {
					ope.exec();
					if (up0().mes_tgt_flg()) {
						for (SCMLinkUtil_Srch01_CndR cndR : ope.down0()) {
							Srch01_RsltR rsltR = down0().getFirst(Srch01_RsltR.$peg_no, cndR.peg_no());
							if (!isNull(cndR.ext_sys_cd())) {
								tmpL.add(rsltR);
							}
						}
					}
					else if (up0().not_mes_tgt_flg()) {
						for (SCMLinkUtil_Srch01_CndR cndR : ope.down0()) {
							Srch01_RsltR rsltR = down0().getFirst(Srch01_RsltR.$peg_no, cndR.peg_no());
							if (isNull(cndR.ext_sys_cd())) {
								tmpL.add(rsltR);
							}
						}
					}
				}
			}
			else {
				MST_MFG_INST_R t1 = MST_MFG_INST_R.create("T1");
				MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");

				MCList<MST_OPER_INST_R> operL = MCList.create(MST_OPER_INST_R.class);
				MST_OPER_INST_R t = MST_OPER_INST_R.create("T");
				MCQueryApiBuilder operL_bldr = MCQueryApiBuilder.create(t);
				operL_bldr.setSelect(t.oper_cd, t.mfg_inst_no);
				operL_bldr.addSelect(t2.mfg_loc_cd);
				operL_bldr.addSelect(t2.itm_cd);
				operL_bldr.addSelect(t2.itm_sub1);
				operL_bldr.addSelect(t2.itm_sub2);
				operL_bldr.addSelect(t2.itm_sub3);
				operL_bldr.addInnerJoin(t1, bracket(t.mfg_inst_no.eq(t1.mfg_inst_no)));
				operL_bldr.addInnerJoin(t2,
						bracket(t1.itm_mfg_inst_no.eq(t2.itm_mfg_inst_no)));
				operL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
				dbSelect("MSBCL1130_MST_OPER_INST_S01", operL, operL_bldr, rsltL);
				
				operL.addNumberColumn("peg_no");
				operL.addStringColumn("ext_sys_cd");
				setPegNo(operL);
				MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 ope = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();
				for (MST_OPER_INST_R operR : operL) {
					SCMLinkUtil_Srch01_CndR cndR = SCMLinkUtil_Srch01_CndR.create();
					cndR.peg_no(operR.getNumberNE("peg_no"));
					cndR.if_proc_typ(MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value());
					cndR.loc_cd(operR.getStringNE("mfg_loc_cd"));
					cndR.itm_cd(operR.getStringNE("itm_cd"));
					cndR.itm_sub1(operR.getStringNE("itm_sub1"));
					cndR.itm_sub2(operR.getStringNE("itm_sub2"));
					cndR.itm_sub3(operR.getStringNE("itm_sub3"));
					cndR.oper_cd(operR.oper_cd());
					cndR.master_dt(getToday());

					ope.up0().add(cndR);
				}
				if (!ope.up0().isEmpty()) {
					ope.exec();
					
					String[] destCols = new String[] {"ext_sys_cd"};
					String[] srcCols = new String[] {SCMLinkUtil_Srch01_CndR.$ext_sys_cd};
					copyByPegNo(operL, destCols, ope.down0(), srcCols);
				}
				
				MCIndexKey operIdxkey = operL.createIndex(MST_OPER_INST_R.$mfg_inst_no);
				for (Srch01_RsltR rsltR : down0()) {
					MCList<MST_OPER_INST_R> subOperL = operL.subList(operIdxkey, rsltR.mfg_inst_no());
					if (up0().mes_tgt_flg()) {
						if (!subOperL.subList(r -> !isNull(r.getStringNE("ext_sys_cd"))).isEmpty()) {
							tmpL.add(rsltR);
						}
					}
					else if (up0().not_mes_tgt_flg()) {
						if (subOperL.subList(r -> !isNull(r.getStringNE("ext_sys_cd"))).isEmpty()) {
							tmpL.add(rsltR);
						}
					}
				}
				
			}
			
			if (isDispOper()) {
				//工程モードの場合、Query_MCで工順にソート済なので、down0の順番を変えないようにする
				//rsltLに含まれるデータのうち、tmpLに含まれているものはあらかじめ除外する
				MCList<Srch01_RsltR> tgtL = MCList.create(Srch01_RsltR.class);
				MCIndexKey tgtIdxkey = tmpL.createIndex(MST_OPER_INST_R.$oper_inst_no);
				for (Srch01_RsltR r : rsltL) {
					if (!isNull(tmpL.getFirst(tgtIdxkey, r.oper_inst_no()))) {
						tgtL.add(r);
					}
				}
				rsltL.removeAll(tgtL);
				down0().removeAll(rsltL);
			} else {
				down0().removeAll(rsltL);
				down0().addAll(tmpL);
			}
		}
		
		protected MCList<Srch01_YieldByProdRsltR> getRecvYieldSchd(MCList<Srch01_YieldByProdRsltR> yieldL) {
			if (!isSame(up0().ope(), MSC_MFG_ACT_LIST_REG_OPE.OPE_UPD.value())
					|| (up0().mes_tgt_flg() && up0().not_mes_tgt_flg())) {
				return yieldL;
			}
			MST_OPER_INST_R t1 = MST_OPER_INST_R.create("T1");
			MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");

			MCList<Srch01_YieldByProdRsltR> retL = MCList.create(Srch01_YieldByProdRsltR.class);
			MCList<MST_YIELD_SCHD_R> yieldSchdL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder yieldSchdL_bldr = MCQueryApiBuilder.create(t);
			yieldSchdL_bldr.setSelect(t.yield_schd_no, t.itm_cd, t.itm_sub1, t.itm_sub2,
					t.itm_sub3);
			yieldSchdL_bldr.addSelect(t1.oper_cd);
			yieldSchdL_bldr.addSelect(t2.mfg_loc_cd);
			yieldSchdL_bldr.addInnerJoin(t1, bracket(t.oper_inst_no.eq(t1.oper_inst_no)));
			yieldSchdL_bldr.addInnerJoin(t2,
					bracket(t.itm_mfg_inst_no.eq(t2.itm_mfg_inst_no)));
			dbSelectKey("MSBCL1130_MST_YIELD_SCHD_S01", yieldSchdL, yieldSchdL_bldr, yieldL);
			
			yieldSchdL.addNumberColumn("peg_no");
			yieldSchdL.addStringColumn("ext_sys_cd");
			setPegNo(yieldSchdL);
			
			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 ope = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();
			for (MST_YIELD_SCHD_R yieldR : yieldSchdL) {
				SCMLinkUtil_Srch01_CndR cndR = SCMLinkUtil_Srch01_CndR.create();
				cndR.peg_no(yieldR.getNumberNE("peg_no"));
				cndR.if_proc_typ(MAC_IF_PROC_TYP.MES_YIELD_ACT_RECV.value());
				cndR.loc_cd(yieldR.getStringNE("mfg_loc_cd"));
				cndR.itm_cd(yieldR.itm_cd());
				cndR.itm_sub1(yieldR.itm_sub1());
				cndR.itm_sub2(yieldR.itm_sub2());
				cndR.itm_sub3(yieldR.itm_sub3());
				cndR.oper_cd(yieldR.getStringNE("oper_cd"));
				cndR.master_dt(getToday());

				ope.up0().add(cndR);
			}
			if (!ope.up0().isEmpty()) {
				ope.exec();
				
				String[] destCols = new String[] {"ext_sys_cd"};
				String[] srcCols = new String[] {SCMLinkUtil_Srch01_CndR.$ext_sys_cd};
				copyByPegNo(yieldSchdL, destCols, ope.down0(), srcCols);
			}
			
			MCIndexKey idxkey = yieldSchdL.createIndex(MST_YIELD_SCHD_R.$yield_schd_no);
			for (Srch01_YieldByProdRsltR yieldR : yieldL) {
				MST_YIELD_SCHD_R yieldSchdR = yieldSchdL.getFirst(idxkey, yieldR.yield_schd_no());
				if (up0().mes_tgt_flg()) {
					if (!isNull(yieldSchdR.getStringNE("ext_sys_cd"))) {
						retL.add(yieldR);
					}
				}
				else if (up0().not_mes_tgt_flg()) {
					if (isNull(yieldSchdR.getStringNE("ext_sys_cd"))) {
						retL.add(yieldR);
					}
				}
			}
			
			return retL;
		}
		
		protected MCList<Srch01_YieldByProdRsltR> getRecvYieldAct(MCList<Srch01_YieldByProdRsltR> yieldL) {
			if (!isSame(up0().ope(), MSC_MFG_ACT_LIST_REG_OPE.OPE_UPD.value())
					|| (up0().mes_tgt_flg() && up0().not_mes_tgt_flg())) {
				return yieldL;
			}
			MCIndexKey idxkey = yieldL.createIndex(Srch01_YieldByProdRsltR.$mes_flg);
			MCList<Srch01_YieldByProdRsltR> retL = MCList.create(Srch01_YieldByProdRsltR.class);
			if (up0().mes_tgt_flg()) {
				retL = yieldL.subList(idxkey, true);
			}
			else if (up0().not_mes_tgt_flg()) {
				retL = yieldL.subList(idxkey, false);
			}
			return retL;
		}
		/**
		 * 一覧（出来高・副産品実績）の検索
		 * 
		 */
		protected void selectRsltYieldByprod() {
			// 出来高・副産品取得用にヘッダのワークテーブルを作成
			insHdrWk(down0());
			
			// 実績の検索
			MCList<Srch01_YieldByProdRsltR> yieldActL = MCList.create(Srch01_YieldByProdRsltR.class);
			executeQuery(yieldActL, MSBCL1130_MST_YIELD_ACT_S01());
			
			// 予定の検索
			if (!yieldActL.isEmpty()) {
				// 出来高実績済みの出来高実績残を取得しないようにするため、出来高実績のワークテーブルを作成（ワークテーブルに存在しない予定を取得する）
				insYieldRemWk(yieldActL);
			}
			MCList<Srch01_YieldByProdRsltR> yieldSchdL = MCList.create(Srch01_YieldByProdRsltR.class);
			executeQuery(yieldSchdL, MSBCL1130_MST_YIELD_ACT_REM_S01());
			for (Srch01_YieldByProdRsltR r : yieldSchdL) {
				// 数量がマイナスになった場合はゼロに変換
				if (r.base_unit_yield_schd_qty().isNegative()) {
					r.base_unit_yield_schd_qty(MCNumber.ZERO);
				}
				if (r.base_unit_yield_rem_qty().isNegative()) {
					r.base_unit_yield_rem_qty(MCNumber.ZERO);
				}
			}
			
			down1().addAll(getRecvYieldSchd(yieldSchdL));
			down1().addAll(getRecvYieldAct(yieldActL));
		}
		
		protected void insHdrWk(MCList<Srch01_RsltR> hdrL) {
			MCList<MST_MFG_ACT_R> actWkL = MCList.create(MST_MFG_ACT_R.class);
			MCList<MST_MFG_ACT_REM_R> actRemWkL = MCList.create(MST_MFG_ACT_REM_R.class);
			
			MCList<MST_OPER_ACT_R> operActWkL = MCList.create(MST_OPER_ACT_R.class);
			MCList<MST_OPER_ACT_REM_R> operRemWkL = MCList.create(MST_OPER_ACT_REM_R.class);
			
			for (Srch01_RsltR hdrR : hdrL) {
				// 製造実績ＮＯのワーク
				if (!isNull(hdrR.mfg_act_no())) {
					MST_MFG_ACT_R actWkR = MST_MFG_ACT_R.create();
					actWkR.mfg_act_no(hdrR.mfg_act_no());
					actWkL.add(actWkR);
				}
				// 製造指図ＮＯ、分割連番のワーク
				MST_MFG_ACT_REM_R actRemWkR = MST_MFG_ACT_REM_R.create();
				
				actRemWkR.mfg_inst_no(hdrR.mfg_inst_no());
				if (isNull(hdrR.mfg_act_no())) {
					actRemWkR.div_seq(MCNumber.ZERO);
				}
				else {
					actRemWkR.div_seq(hdrR.div_seq());
				}
				actRemWkL.add(actRemWkR);
				
				if (isDispOper()) {
					// 工程実績ＮＯのワーク
					if (!isNull(hdrR.oper_act_no())) {
						MST_OPER_ACT_R operActWkR = MST_OPER_ACT_R.create();
						operActWkR.oper_act_no(hdrR.oper_act_no());
						operActWkL.add(operActWkR);
					}
					
					// 工程指図ＮＯのワーク
					MST_OPER_ACT_REM_R operRemWkR = MST_OPER_ACT_REM_R.create();
					operRemWkR.oper_inst_no(hdrR.oper_inst_no());
					operRemWkL.add(operRemWkR);
				}
			}

			if (!actWkL.isEmpty()) {
				MCQueryApiBuilder actWkL_bldr = MCQueryApiBuilder.create(MST_MFG_ACT_R.create("T"));
				dbWkDelete("MSBCL1130_MSW_MFG_ACT_D01", actWkL_bldr.getBaseDbc());
				dbWkInsert("MSBCL1130_MSW_MFG_ACT_I01",
						actWkL.groupBy(MST_MFG_ACT_R.$mfg_act_no), actWkL_bldr.getBaseDbc());
			}
			if (!actRemWkL.isEmpty()) {
				MCQueryApiBuilder actRemWkL_bldr = MCQueryApiBuilder.create(MST_MFG_ACT_REM_R.create("T"));
				dbWkDelete("MSBCL1130_MSW_MFG_ACT_REM_D01", actRemWkL_bldr.getBaseDbc());
				dbWkInsert("MSBCL1130_MSW_MFG_ACT_REM_I01",
						actRemWkL.groupBy(MST_MFG_ACT_REM_R.$mfg_inst_no, MST_MFG_ACT_REM_R.$div_seq), actRemWkL_bldr.getBaseDbc());
			}
			
			if (!operActWkL.isEmpty()) {
				MCQueryApiBuilder operActWkL_bldr = MCQueryApiBuilder.create(MST_OPER_ACT_R.create("T"));
				dbWkDelete("MSBCL1130_MSW_OPER_ACT_D01", operActWkL_bldr.getBaseDbc());
				dbWkInsert("MSBCL1130_MSW_OPER_ACT_I01", operActWkL, operActWkL_bldr.getBaseDbc());
			}
			if (!operRemWkL.isEmpty()) {
				MCQueryApiBuilder operRemWkL_bldr = MCQueryApiBuilder.create(MST_OPER_ACT_REM_R.create("T"));
				dbWkDelete("MSBCL1130_MSW_OPER_ACT_REM_D01", operRemWkL_bldr.getBaseDbc());
				dbWkInsert("MSBCL1130_MSW_OPER_ACT_REM_I01", operRemWkL, operRemWkL_bldr.getBaseDbc());
			}
		}
		
		protected void insYieldRemWk(MCList<Srch01_YieldByProdRsltR> yieldActL) {
			MCList<MST_YIELD_ACT_REM_R> remWkL = MCList.create(MST_YIELD_ACT_REM_R.class);
			for (Srch01_YieldByProdRsltR r : yieldActL) {
				MST_YIELD_ACT_REM_R remWkR = MST_YIELD_ACT_REM_R.create();
				remWkR.yield_schd_no(r.yield_schd_no());
				remWkR.div_seq(r.div_seq());
				remWkL.add(remWkR);
			}
			if (!remWkL.isEmpty()) {
				MCQueryApiBuilder remWkL_bldr = MCQueryApiBuilder.create(MST_YIELD_ACT_REM_R.create("T"));
				dbWkDelete("MSBCL1130_MSW_YIELD_ACT_REM_D01", remWkL_bldr.getBaseDbc());
				dbWkInsert("MSBCL1130_MSW_YIELD_ACT_REM_I01", remWkL, remWkL_bldr.getBaseDbc());
			}
		}

		// 業務データダウンロード対象の場合、フェッチの回数によってはeditListMainが複数回呼ばれる。
		// peg_noはdown0内で一意の番号でなければならないため、peg_noをインスタンス変数に格納しておく必要がある
		protected int _hdrPegNo = 0;
		/**
		 * 一覧（製造・工程実績）の編集
		 * 
		 */
		protected void setDown0() {
			for (Srch01_RsltR r : down0()) {
				r.peg_no(_hdrPegNo++);
				if (isDispOper()) {
					calcOperNum(r);
				}
			}
		}

		/**
		 * 一覧（出来高・副産品実績）の編集
		 * 
		 */
		protected Map<MCNumber, MCList<Srch01_YieldByProdRsltR>> setDown1() {
			String gdCd = getDefaultFeedStkGd().gd_cd();
			String gdNm = getDefaultFeedStkGd().gd_nm();
			
			MCIndexKey hdrIdxKey = down0().createIndex(Srch01_RsltR.$mfg_inst_no,Srch01_RsltR.$div_seq); 
			MCIndexKey hdrActIdxKey = down0().createIndex(Srch01_RsltR.$mfg_act_no); 
			MCIndexKey operRemIdxKey = down0().createIndex(Srch01_RsltR.$oper_inst_no,Srch01_RsltR.$div_seq);
			MCIndexKey operActIdxKey = down0().createIndex(Srch01_RsltR.$oper_act_no);
			
			Map<MCNumber, MCList<Srch01_YieldByProdRsltR>> ret = new HashMap<MCNumber, MCList<Srch01_YieldByProdRsltR>>();
			for (Srch01_YieldByProdRsltR r : down1()) {
				if (isNull(r.yield_act_no())) {
					r.gd_cd(gdCd);
					r.gd_nm(gdNm);
				}
				Srch01_RsltR rsltR = null;
				if (isDispOper()) {
					if (isNull(r.yield_act_no())) {
						rsltR = down0().getFirst(operRemIdxKey, r.oper_inst_no(), r.div_seq());
					}
					else {
						// 工程指図を行コピーして工程実績を登録することができる（この場合、工程実績残は割れない）ため、
						// 出来高実績とヘッダを紐つける際には工程実績ＮＯを使用する必要がある
						rsltR = down0().getFirst(operActIdxKey, r.oper_act_no());
					}
				}
				else {
					if (isNull(r.mfg_inst_no())) {
						rsltR = down0().getFirst(hdrActIdxKey, r.mfg_act_no());
					}
					else {
						rsltR = down0().getFirst(hdrIdxKey, r.mfg_inst_no(), r.div_seq());
					}
				}
				if (!isNull(rsltR)) {
					r.hdr_peg_no(rsltR.peg_no());
				}
				
				// hdr毎の出来高のリスト（副産品除く）を作成する　※後の処理で上部一覧にロットＮＯを設定するため
				if (!MAC_YIELD_TYP.isBYPROD(r.yield_typ())) {
					MCList<Srch01_YieldByProdRsltR> lst = ret.get(r.hdr_peg_no());
					if (lst == null) {
						lst = MCList.create(Srch01_YieldByProdRsltR.class);
						ret.put(r.hdr_peg_no(), lst);
					}
					lst.add(r);
				}
				setYieldTrdUnit(r);
			}
			
			return ret;
		}
		
		protected void setDown0LotNo(Map<MCNumber, MCList<Srch01_YieldByProdRsltR>> yieldMap) {
			for (Srch01_RsltR down0R : down0()) {
				MCList<Srch01_YieldByProdRsltR> yL = yieldMap.get(down0R.peg_no());
				if (!isNull(yL)) {
					MCList<Srch01_YieldByProdRsltR> lotL = yL.groupBy(
							Srch01_YieldByProdRsltR.$lot_no);
					if (lotL.size() == 1) {
						down0R.lot_no(lotL.get(0).lot_no());
					}
					
					MCList<Srch01_YieldByProdRsltR> sublotL = yL.groupBy(
							Srch01_YieldByProdRsltR.$lot_no,
							Srch01_YieldByProdRsltR.$sublot_no);
					if (sublotL.size() == 1) {
						down0R.sublot_no(sublotL.get(0).sublot_no());
					}
				}
			}
		}

		/**
		 * 工程単位指図数の計算
		 * @param actFlg
		 */
		protected void calcOperNum(Srch01_RsltR r) {
			MCNumber operUnitRemQty = null;
			MCNumber operUnitSchdQty = convQtyBaseToOper(r.base_unit_oper_schd_qty(),
					r.oper_conv_qty(), r.oper_std_qty(), r.oper_unit_dec_place(),
					r.oper_unit_conv_rnd_typ());

			if (!isNull(r.oper_act_no())) {
				operUnitRemQty = convQtyBaseToOper(r.base_unit_oper_rem_qty(),
						r.oper_conv_qty(), r.oper_std_qty(), r.oper_unit_dec_place(),
						r.oper_unit_conv_rnd_typ());
			} else {
				operUnitRemQty = operUnitSchdQty;
			}
			r.oper_unit_schd_qty(operUnitSchdQty);
			r.oper_unit_rem_qty(operUnitRemQty);
		}

		protected boolean isInstSrch() {
			if (!up0().ord_flg()) {
				return false;
			}
			// 両方trueのときのみ実行
			if (!up0().act_prnt_flg() || !up0().not_act_prnt_flg()) {
				return false;
			}
			// 両方trueのときのみ実行
			if (!up0().stk_lst_issue_flg() || !up0().not_stk_lst_issue_flg()) {
				return false;
			}
			if (up0().bkf_not_ref_flg() || up0().inpt_not_comp_flg() || up0().wk_not_comp_flg()) {
				return false;
			}
			
			if (!isNull(up0().st_act_dt_fr()) ||
					!isNull(up0().st_act_hm_fr()) ||
					!isNull(up0().st_act_dt_to()) ||
					!isNull(up0().st_act_hm_to()) ||
					!isNull(up0().st_ac_dt_fr()) ||
					!isNull(up0().st_ac_dt_to()) ||
					!isNull(up0().end_act_dt_fr()) ||
					!isNull(up0().end_act_hm_fr()) ||
					!isNull(up0().end_act_dt_to()) ||
					!isNull(up0().end_act_hm_to()) ||
					!isNull(up0().end_ac_dt_fr()) ||
					!isNull(up0().end_ac_dt_to()) ||
					!isNull(up0().aprv_dt_fr()) ||
					!isNull(up0().aprv_dt_to()) ||
					!isNull(up0().mfg_aprv_sts_typ()) ||
					!isNull(up0().act_usr_cd()) ||
					!isNull(up0().act_usr_nm()) ||
					!isNull(up0().act_dpt_cd()) ||
					!isNull(up0().act_dpt_nm()) ||
					!isNull(up0().aprv_usr_cd()) ||
					!isNull(up0().aprv_usr_nm()) ||
					!isNull(up0().aprv_dpt_cd()) ||
					!isNull(up0().aprv_dpt_nm()) ||
					!isNull(up0().mfg_act_no()) ||
					!isNull(up0().oper_act_no()) ||
					!isNull(up0().ext_oper_act_no()) ||
					!isNull(up0().act_rpt_rmrks()) ||
					!isNull(up0().act_intr_rmrks()) ||
					!isNull(up0().mfg_act_sub_char1()) ||
					!isNull(up0().mfg_act_sub_char2()) ||
					!isNull(up0().mfg_act_sub_char3()) ||
					!isNull(up0().oper_act_intr_rmrks()) ||
					!isNull(up0().oper_act_rpt_rmrks()) ||
					!isNull(up0().oper_act_sub_char1()) ||
					!isNull(up0().oper_act_sub_char2()) ||
					!isNull(up0().oper_act_sub_char3())) {
				return false;
			}

			return true;
		}
		
		protected boolean isActSrch() {
			if (!up0().stt_flg() && !up0().cmpl_flg()) {
				return false;
			}
			return true;
		}

		/**
		 * 出来高・副産品の取引単位を設定する。
		 * @param r
		 */
		protected void setYieldTrdUnit(Srch01_YieldByProdRsltR r) {

			// すでに出来高実績が登録されている場合は何もしない
			if (!isNull(r.yield_act_no())) {
				return;
			}
			
			// 基準単位数を取引単位数に変換し、また基準単位数に戻したとき、元の基準単位数に戻らない場合は基準単位を取引単位に設定
			MCNumber trdQty = rvrsBaseUnitConv(r.base_unit_yield_schd_qty(),
					r.conv_base_qty(), r.conv_qty(), r.trd_unit_dec_place(),
					r.trd_unit_conv_rnd_typ());
			MCNumber baseQty = convToBaseUnit(trdQty, r.conv_base_qty(), r.conv_qty(),
					r.base_unit_dec_place(), r.base_unit_conv_rnd_typ());

			if (!isSame(baseQty, r.base_unit_yield_schd_qty())) {
				r.trd_unit_cd(r.base_unit_cd());
				r.trd_unit_nm(r.base_unit_nm());
				r.trd_unit_conv_rnd_typ(r.base_unit_conv_rnd_typ());
				r.trd_unit_dec_place(r.base_unit_dec_place());
				r.conv_base_qty(1);
				r.conv_qty(1);
			}
		}
		
	}
	
	/**
	 * Upd02オペレーション.<p>
	 *
	 */
	public class Upd02 extends MSBCL_MfgActListReg_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editAprvUp(up0());

			callMfgInstActComUpd01(MSC_MFG_APRV_STS_TYP.ACT_ACPT.value(), up0());
			
			setDown();
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Upd02_DtlR>> list = splitAprvUp(up0(), getSplitRowCount());
			for (MCList<Upd02_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Upd02_DtlR> up0L = ((MCList<Upd02_DtlR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	/**
	 * Del02オペレーション.<p>
	 *
	 * 製造実績の承認取消を行う<br>
	 */
	public class Del02 extends MSBCL_MfgActListReg_MC_A.Del02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editAprvUp(up0());

			callMfgInstActComUpd01(MSC_MFG_APRV_STS_TYP.ACT_OPN.value(), up0());
			
			setDown();
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Upd02_DtlR>> list = splitAprvUp(up0(), getSplitRowCount());
			for (MCList<Upd02_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Upd02_DtlR> up0L = ((MCList<Upd02_DtlR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	/**
	 * 上り電文の編集
	 */
	protected void editAprvUp(MCList<Upd02_DtlR> upL) {
		setPegNo(Upd02_DtlR.$peg_no, upL);

		MCList<MST_MFG_ACT_R> actL = MCList.create(MST_MFG_ACT_R.class);
		dbSelectKey("MSBCL1130_MST_MFG_ACT_S01", actL,
				MCQueryApiBuilder.create(MST_MFG_ACT_R.create("T")), upL);

		MCIndexKey idKey = actL.createIndex(MST_MFG_ACT_R.$mfg_act_no);
		for (Upd02_DtlR r : upL) {
			MST_MFG_ACT_R actR = actL.getFirst(idKey, r.mfg_act_no());
			if (!isNull(actR)) {
				r.itm_mfg_inst_no(actR.itm_mfg_inst_no());
			}
		}
	}
	
	/**
	 * 製造指図・実績共通処理サービスの承認・承認取消処理の呼出
	 */
	protected void callMfgInstActComUpd01(String mfgAprvStsTyp, MCList<Upd02_DtlR> upL) {
		MSBCL_MfgInstActComService.MfgInstActCom_Upd01 ope = MSBCL_MfgInstActComService.crtMfgInstActCom_Upd01();
		ope.up0().lst_reg_flg(true);
		ope.up0().mfg_aprv_sts_typ(mfgAprvStsTyp);
		addAll(ope.up1(), upL ,createMap_MfgInstActCom_Chk01_DtlR_Upd02_DtlR());
		ope.exec();
		copyByPegNo(upL, new String[] {
				MfgInstActCom_Chk01_DtlR.$mfg_aprv_sts_typ,
				MfgInstActCom_Chk01_DtlR.$mfg_aprv_sts_typ_nm,
				MfgInstActCom_Chk01_DtlR.$rtn_sts_typ
		}, ope.down0(), new String[] {
				Upd02_DtlR.$mfg_aprv_sts_typ, Upd02_DtlR.$mfg_aprv_sts_typ_nm,
				Upd02_DtlR.$rtn_sts_typ
		});
	}

	protected Map_MfgInstActCom_Chk01_DtlR_Upd02_DtlR<MfgInstActCom_Chk01_DtlR,Upd02_DtlR> createMap_MfgInstActCom_Chk01_DtlR_Upd02_DtlR() {
		return new Map_MfgInstActCom_Chk01_DtlR_Upd02_DtlR<MfgInstActCom_Chk01_DtlR, Upd02_DtlR>();
	}

	public class Map_MfgInstActCom_Chk01_DtlR_Upd02_DtlR<D extends MfgInstActCom_Chk01_DtlR, S extends Upd02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$peg_no, Upd02_DtlR.$peg_no);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$mfg_inst_no, Upd02_DtlR.$mfg_inst_no);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$itm_mfg_inst_no, Upd02_DtlR.$itm_mfg_inst_no);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$div_seq, Upd02_DtlR.$div_seq);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$mfg_act_no, Upd02_DtlR.$mfg_act_no);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_dt, Upd02_DtlR.$aprv_dt);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_tm, Upd02_DtlR.$aprv_tm);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_dpt_cd, Upd02_DtlR.$aprv_dpt_cd);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_usr_cd, Upd02_DtlR.$aprv_usr_cd);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_rsn, Upd02_DtlR.$aprv_rsn);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$mfg_inst_upd_cntr, Upd02_DtlR.$mfg_inst_upd_cntr);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$mfg_act_upd_cntr, Upd02_DtlR.$mfg_act_upd_cntr);
		}
	}

	protected List<MCList<Upd02_DtlR>> splitAprvUp(MCList<Upd02_DtlR> list, int max) {
		List<MCList<Upd02_DtlR>> ret = new ArrayList<>();
		MCList<Upd02_DtlR>[] grpL = list.groupList(Upd02_DtlR.$itm_cd, 
				Upd02_DtlR.$itm_sub1, Upd02_DtlR.$itm_sub2, Upd02_DtlR.$itm_sub3);
		MCList<Upd02_DtlR> tmp = MCList.create(Upd02_DtlR.class);
		for (MCList<Upd02_DtlR> grp : grpL) {
			if (tmp.size() >= max) {
				ret.add(tmp);
				tmp = MCList.create(Upd02_DtlR.class);
			}
			tmp.addAll(grp);
		}
		if (!tmp.isEmpty()) {
			ret.add(tmp);
		}
		return ret;
	}
	
	/**
	 * Del01オペレーション.<p>
	 *
	 * 製造実績の取消を行う<br>
	 */
	public class Del01 extends MSBCL_MfgActListReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			
			callMfgActReg_Del01();
			
			setDown();
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Del01_HdrR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Del01_HdrR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Del01_HdrR> up0L = ((MCList<Del01_HdrR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		protected void editUp() {
			setPegNo(Del01_HdrR.$peg_no, up0());
		}

		protected void callMfgActReg_Del01() {
			MSBCL_MfgActRegService.MfgActReg_Del01 ope = MSBCL_MfgActRegService.crtMfgActReg_Del01();

			MCList<MfgActReg_Del01_HdrR> opeUp1 = MCList.create(MfgActReg_Del01_HdrR.class);

			MCList<MfgActReg_Del01_DtlInptR> opeUp2 = MCList.create(MfgActReg_Del01_DtlInptR.class);
			MCList<MST_INPT_ACT_R> inptL = MCList.create(MST_INPT_ACT_R.class);
			MST_INPT_ACT_R t1 = MST_INPT_ACT_R.create("T");
			MCQueryApiBuilder inptL_bldr = MCQueryApiBuilder.create(t1);
			inptL_bldr.setSelect(t1.inpt_act_no, t1.ac_dt);
			inptL_bldr.setWhere(t1.mfg_act_no.eq(bind("mfg_act_no")));
			dbSelect("MSBCL1130_MST_INPT_ACT_S01", inptL, inptL_bldr, up0());

			MCList<MfgActReg_Del01_DtlYieldR> opeUp3 = MCList.create(MfgActReg_Del01_DtlYieldR.class);
			MCList<MST_YIELD_ACT_R> yieldL = MCList.create(MST_YIELD_ACT_R.class);
			MST_YIELD_ACT_R t2 = MST_YIELD_ACT_R.create("T");
			MCQueryApiBuilder yieldL_bldr = MCQueryApiBuilder.create(t2);
			yieldL_bldr.setSelect(t2.yield_act_no, t2.ac_dt);
			yieldL_bldr.setWhere(t2.mfg_act_no.eq(bind("mfg_act_no")));
			yieldL_bldr.addWhereWithAnd(t2.yield_typ.neq(bind("1")), MAC_YIELD_TYP.BYPROD.value());
			dbSelect("MSBCL1130_MST_YIELD_ACT_S01", yieldL, yieldL_bldr, up0());

			MCList<MfgActReg_Del01_DtlByProdR> opeUp4 = MCList.create(MfgActReg_Del01_DtlByProdR.class);
			MCList<MST_YIELD_ACT_R> byProdL = MCList.create(MST_YIELD_ACT_R.class);
			MST_YIELD_ACT_R t3 = MST_YIELD_ACT_R.create("T");
			MCQueryApiBuilder byProdL_bldr = MCQueryApiBuilder.create(t3);
			byProdL_bldr.setSelect(t3.yield_act_no, t3.ac_dt);
			byProdL_bldr.setWhere(t3.mfg_act_no.eq(bind("mfg_act_no")));
			byProdL_bldr.addWhereWithAnd(t3.yield_typ.eq(bind("1")), MAC_YIELD_TYP.BYPROD.value());
			dbSelect("MSBCL1130_MST_YIELD_ACT_S02", byProdL, byProdL_bldr, up0());

			addAll(opeUp1, up0(), createMap_MfgActReg_Del01_HdrR_Del01_HdrR());
			addAll(opeUp2, inptL, createMap_MfgActReg_Del01_DtlInptR_MST_INPT_ACT_R());
			addAll(opeUp3, yieldL, createMap_MfgActReg_Del01_DtlYieldR_MST_YIELD_ACT_R());
			addAll(opeUp4, byProdL, createMap_MfgActReg_Del01_DtlByProdR_MST_YIELD_ACT_R());
			ope.up0().lst_del_flg(true);
			ope.up0().not_commit_flg(false);
			ope.up0().upd_cntr_chk_flg(true);
			ope.up1().addAll(opeUp1);
			ope.up2().addAll(opeUp2);
			ope.up3().addAll(opeUp3);
			ope.up4().addAll(opeUp4);
			ope.exec();
			
			String[] destCols = new String[] {Del01_HdrR.$rtn_sts_typ};
			String[] srcCols = new String[] {MfgActReg_Del01_HdrR.$rtn_sts_typ};
			copyByPegNo(up0(), destCols, ope.down0(), srcCols);
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Del01_HdrR>> splitUp(MCList<Del01_HdrR> list, int max) {
			List<MCList<Del01_HdrR>> ret = new ArrayList<>();
			MCList<Del01_HdrR>[] grpL = list.groupList(Del01_HdrR.$itm_cd
					, Del01_HdrR.$itm_sub1, Del01_HdrR.$itm_sub2, Del01_HdrR.$itm_sub3);
			MCList<Del01_HdrR> tmp = MCList.create(Del01_HdrR.class);
			for (MCList<Del01_HdrR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Del01_HdrR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		protected Map_MfgActReg_Del01_HdrR_Del01_HdrR<MfgActReg_Del01_HdrR,Del01_HdrR> createMap_MfgActReg_Del01_HdrR_Del01_HdrR() {
			return new Map_MfgActReg_Del01_HdrR_Del01_HdrR<MfgActReg_Del01_HdrR, Del01_HdrR>();
		}
		public class Map_MfgActReg_Del01_HdrR_Del01_HdrR<D extends MfgActReg_Del01_HdrR, S extends Del01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Del01_HdrR.$peg_no, Del01_HdrR.$peg_no);
				addColumnPathMap(MfgActReg_Del01_HdrR.$mfg_act_no, Del01_HdrR.$mfg_act_no);
				addColumnPathMap(MfgActReg_Del01_HdrR.$mfg_inst_upd_cntr, Del01_HdrR.$mfg_inst_upd_cntr);
				addColumnPathMap(MfgActReg_Del01_HdrR.$mfg_inst_pr_upd_cntr, Del01_HdrR.$mfg_inst_pr_upd_cntr);
				addColumnPathMap(MfgActReg_Del01_HdrR.$mfg_act_upd_cntr, Del01_HdrR.$mfg_act_upd_cntr);
				addColumnPathMap(MfgActReg_Del01_HdrR.$mfg_inst_no, Del01_HdrR.$mfg_inst_no);
				addColumnPathMap(MfgActReg_Del01_HdrR.$div_seq, Del01_HdrR.$div_seq);
			}
		}

		protected Map_MfgActReg_Del01_DtlInptR_MST_INPT_ACT_R<MfgActReg_Del01_DtlInptR,MST_INPT_ACT_R> createMap_MfgActReg_Del01_DtlInptR_MST_INPT_ACT_R() {
			return new Map_MfgActReg_Del01_DtlInptR_MST_INPT_ACT_R<MfgActReg_Del01_DtlInptR, MST_INPT_ACT_R>();
		}
		public class Map_MfgActReg_Del01_DtlInptR_MST_INPT_ACT_R<D extends MfgActReg_Del01_DtlInptR, S extends MST_INPT_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Del01_DtlInptR.$inpt_act_no, MST_INPT_ACT_R.$inpt_act_no);
				addColumnPathMap(MfgActReg_Del01_DtlInptR.$can_ac_dt, MST_INPT_ACT_R.$ac_dt);

			}
		}

		protected Map_MfgActReg_Del01_DtlYieldR_MST_YIELD_ACT_R<MfgActReg_Del01_DtlYieldR,MST_YIELD_ACT_R> createMap_MfgActReg_Del01_DtlYieldR_MST_YIELD_ACT_R() {
			return new Map_MfgActReg_Del01_DtlYieldR_MST_YIELD_ACT_R<MfgActReg_Del01_DtlYieldR, MST_YIELD_ACT_R>();
		}
		public class Map_MfgActReg_Del01_DtlYieldR_MST_YIELD_ACT_R<D extends MfgActReg_Del01_DtlYieldR, S extends MST_YIELD_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Del01_DtlYieldR.$yield_act_no, MST_YIELD_ACT_R.$yield_act_no);
				addColumnPathMap(MfgActReg_Del01_DtlYieldR.$can_ac_dt, MST_YIELD_ACT_R.$ac_dt);

			}
		}

		protected Map_MfgActReg_Del01_DtlByProdR_MST_YIELD_ACT_R<MfgActReg_Del01_DtlByProdR,MST_YIELD_ACT_R> createMap_MfgActReg_Del01_DtlByProdR_MST_YIELD_ACT_R() {
			return new Map_MfgActReg_Del01_DtlByProdR_MST_YIELD_ACT_R<MfgActReg_Del01_DtlByProdR, MST_YIELD_ACT_R>();
		}
		public class Map_MfgActReg_Del01_DtlByProdR_MST_YIELD_ACT_R<D extends MfgActReg_Del01_DtlByProdR, S extends MST_YIELD_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Del01_DtlByProdR.$yield_act_no, MST_YIELD_ACT_R.$yield_act_no);
				addColumnPathMap(MfgActReg_Del01_DtlByProdR.$can_ac_dt, MST_YIELD_ACT_R.$ac_dt);

			}
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 製造記録書を発行する。<br>
	 */
	public class Prnt01 extends MSBCL_MfgActListReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {

			editUp();

			// 製造帳票発行サービスの製造記録書発行
			callMfgRptServicePrnt02();

			// 下り電文設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Prnt01_DtlR.$peg_no, up0());
		}
		
		/**
		 * 製造記録書を発行する。
		 */
		protected void callMfgRptServicePrnt02() {
			MSBCL_MfgRptService.MfgRpt_Prnt02 prnt = MSBCL_MfgRptService.crtMfgRpt_Prnt02();

			addAll(prnt.up0(), up0(), createMap_MfgRpt_Prnt02_DtlR_Prnt01_DtlR());

			prnt.exec();

			String[] destCols = new String[] {Prnt01_DtlR.$act_prnt_flg, Prnt01_DtlR.$act_prnt_tm, Prnt01_DtlR.$err_flg};
			String[] srcCols = new String[] {MfgRpt_Prnt02_DtlR.$act_prnt_flg, MfgRpt_Prnt02_DtlR.$act_prnt_tm, MfgRpt_Prnt02_DtlR.$err_flg};
			copyByPegNo(up0(), destCols, prnt.down0(), srcCols);
			
			for (Prnt01_DtlR r : up0()) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		protected Map_MfgRpt_Prnt02_DtlR_Prnt01_DtlR<MfgRpt_Prnt02_DtlR,Prnt01_DtlR> createMap_MfgRpt_Prnt02_DtlR_Prnt01_DtlR() {
			return new Map_MfgRpt_Prnt02_DtlR_Prnt01_DtlR<MfgRpt_Prnt02_DtlR, Prnt01_DtlR>();
		}

		public class Map_MfgRpt_Prnt02_DtlR_Prnt01_DtlR<D extends MfgRpt_Prnt02_DtlR, S extends Prnt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgRpt_Prnt02_DtlR.$peg_no, Prnt01_DtlR.$peg_no);
				addColumnPathMap(MfgRpt_Prnt02_DtlR.$mfg_act_no, Prnt01_DtlR.$mfg_act_no);
				addColumnPathMap(MfgRpt_Prnt02_DtlR.$mfg_inst_no, Prnt01_DtlR.$mfg_inst_no);
				addColumnPathMap(MfgRpt_Prnt02_DtlR.$div_seq, Prnt01_DtlR.$div_seq);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 製造実績の登録・訂正を行う<br>
	 */
	public class Upd01 extends MSBCL_MfgActListReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			if (!up0().oper_unit_flg()) {
				// ヘッダ単位の実績
				callMfgActRegUpd02HdrMode();
				editDown();
			}
			else {
				// 工程単位の実績
				callMfgActRegUpd02OperMode();
				editDown();
			}
		}

		@Override
		protected <T extends MCRow> MCList<T> getSplitList(MCParam p) {
			MCList<T> ret = (MCList<T>) up1();
			return ret;
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up1().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<MfgActReg_Upd02_Hdr1R>> list = splitUp(up1(), getSplitRowCount());
			for (MCList<MfgActReg_Upd02_Hdr1R> l : list) {
				MCOperation ope = createInstance(lgc, p);
				Upd01_CtrlR up0R = (Upd01_CtrlR)ope.up(0);
				MCList<MfgActReg_Upd02_Hdr1R> up1L = ((MCList<MfgActReg_Upd02_Hdr1R>)ope.up(1));
				MCList<MfgActReg_Upd02_DtlYieldByProdR> up2L = ((MCList<MfgActReg_Upd02_DtlYieldByProdR>)ope.up(2));
				MCRow.copyall(up0R, up0());
				up1L.setAll(l);
				// ヘッダに対応する明細を設定
				MCIndexKey yieldIdx = up2().createIndex(MfgActReg_Upd02_DtlYieldByProdR.$hdr_peg_no);
				for (MfgActReg_Upd02_Hdr1R hdrR : l) {
					up2L.addAll(up2().subList(yieldIdx, hdrR.peg_no()));
				}
				opeL.add(ope);
			}
			return opeL;
		}

		protected void editUp() {
			setPegNo(up2());
			// up2のGUIIndexを変更する前に、下り電文にpeg_noと属性をコピーする（画面で下り電文を正しく表示するために必要）
			copyPegNoAndAttr(down1(), up2());
			
			MCIndexKey idxkey = up1().createIndex(MfgActReg_Upd02_Hdr1R.$peg_no);
			for (MfgActReg_Upd02_DtlYieldByProdR r : up2()) {
				MfgActReg_Upd02_Hdr1R hdrR = up1().getFirst(idxkey, r.hdr_peg_no());
				// メッセージ出力用に行番号のみを上段の行番号を設定する
				r.setGUIIndex(hdrR.getGUIIndex());
			}
		}
		
		
		protected void callMfgActRegUpd02HdrMode() {
			MSBCL_MfgActRegService.MfgActReg_Upd02 ope = MSBCL_MfgActRegService.crtMfgActReg_Upd02();
			ope.up0().oper_unit_flg(up0().oper_unit_flg());
			ope.up0().act_immed_prnt_flg(up0().act_immed_prnt_flg());
			ope.up0().not_bkf_upd_flg(up0().not_bkf_upd_flg());
			ope.up0().not_wk_cost_upd_calc_flg(up0().not_wk_cost_upd_calc_flg());
			ope.up0().upd_cntr_chk_flg(true);
			ope.up2().addAll(up1());
			ope.up3().addAll(up2());
			ope.exec();
			down0().addAll(ope.down1());
			// opeのdown2をaddAllしてしまうと、GUIIndexが書き換えられたrowが下ってしまうため、copyByPegNoで下り電文を設定する
			copyByPegNo(down1(), new String[] {
					MfgActReg_Upd02_DtlYieldByProdR.$hdr_peg_no,
					MfgActReg_Upd02_DtlYieldByProdR.$yield_act_no,
					MfgActReg_Upd02_DtlYieldByProdR.$lot_no,
					MfgActReg_Upd02_DtlYieldByProdR.$sublot_no
			}, ope.down2(), new String[] {
					MfgActReg_Upd02_DtlYieldByProdR.$hdr_peg_no,
					MfgActReg_Upd02_DtlYieldByProdR.$yield_act_no,
					MfgActReg_Upd02_DtlYieldByProdR.$lot_no,
					MfgActReg_Upd02_DtlYieldByProdR.$sublot_no
			});
		}

		protected void callMfgActRegUpd02OperMode() {
			MSBCL_MfgActRegService.MfgActReg_Upd02 ope = MSBCL_MfgActRegService.crtMfgActReg_Upd02();
			ope.up0().oper_unit_flg(up0().oper_unit_flg());
			ope.up0().act_immed_prnt_flg(up0().act_immed_prnt_flg());
			ope.up0().not_bkf_upd_flg(up0().not_bkf_upd_flg());
			ope.up0().upd_cntr_chk_flg(true);
			ope.up0().not_wk_cost_upd_calc_flg(up0().not_wk_cost_upd_calc_flg());
			ope.up1().addAll(up1());
			MCList<MST_OPER_ACT_R> wkL = MCList.create(MST_OPER_ACT_R.class);
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_OPER_ACT_R.create("T"));
			dbWkDelete("MSBCL1130_MSW_OPER_ACT_D02", wkL_bldr.getBaseDbc());
			for (MfgActReg_Upd02_Hdr1R r : ope.up1()) {
				if (!isNull(r.oper_act_no())) {
					MST_OPER_ACT_R wkR = MST_OPER_ACT_R.create();
					wkR.oper_act_no(r.oper_act_no());
					wkL.add(wkR);
				}
			}
			if (!wkL.isEmpty()) {
				dbWkInsert("MSBCL1130_MSW_OPER_ACT_I02",
						wkL.groupBy(wkL_bldr.getBaseDbc().getKeyColumn()), wkL_bldr.getBaseDbc());
			}
			
			// 処理対象の製造実績のうち、上り電文に存在しない＆終了実績日が設定されていない工程実績を持つものを抽出
			MCList<MST_MFG_ACT_R> dbL = MCList.create(MST_MFG_ACT_R.class);
			MST_MFG_ACT_R dbL_t = MST_MFG_ACT_R.create("T");
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(dbL_t);
			MST_OPER_ACT_R st1 = MST_OPER_ACT_R.create("T1");
			MSW_OPER_ACT_KEY_R S1W1 = MSW_OPER_ACT_KEY_R.create("W1");
			dbL_bldr.setSelect(dbL_t.mfg_inst_no, dbL_t.div_seq);
			dbL_bldr.addInnerJoin(st1, bracket(dbL_t.mfg_act_no.eq(st1.mfg_act_no)));
			dbL_bldr.setWhere(dbL_t.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbL_bldr.addWhereWithAnd(dbL_t.div_seq.eq(bind("div_seq")));
			dbL_bldr.addWhereWithAnd(st1.end_act_tm.isNull());
			dbL_bldr.addWhereWithAnd(notExists(subQuery().select(value(1)).from(S1W1)
					.where(st1.oper_act_no.eq(S1W1.oper_act_no))));
			dbSelect("MSBCL1130_MST_MFG_ACT_S02", dbL, dbL_bldr, ope.up1());
			MCIndexKey idx = dbL.createIndex(MST_MFG_ACT_R.$mfg_inst_no,
					MST_MFG_ACT_R.$div_seq);
			
			for (MfgActReg_Upd02_Hdr1R up01R : ope.up1()) {
				MST_MFG_ACT_R mfgActR = dbL.getFirst(idx, up01R.mfg_inst_no(), up01R.div_seq());
				// 処理対象の製造実績が上記の抽出結果に含まれる場合、未完了フラグをオンにする
				if (!isNull(mfgActR) && !isNull(up01R.end_act_tm())) {
					up01R.not_cmpl_flg(true);
				}
			}
			ope.up3().addAll(up2());
			ope.exec();
			down0().addAll(ope.down0());
			// opeのdown2をaddAllしてしまうと、GUIIndexが書き換えられたrowが下ってしまうため、copyByPegNoで下り電文を設定する
			copyByPegNo(down1(), new String[] {
					MfgActReg_Upd02_DtlYieldByProdR.$hdr_peg_no,
					MfgActReg_Upd02_DtlYieldByProdR.$yield_act_no,
					MfgActReg_Upd02_DtlYieldByProdR.$lot_no,
					MfgActReg_Upd02_DtlYieldByProdR.$sublot_no
			}, ope.down2(), new String[] {
					MfgActReg_Upd02_DtlYieldByProdR.$hdr_peg_no,
					MfgActReg_Upd02_DtlYieldByProdR.$yield_act_no,
					MfgActReg_Upd02_DtlYieldByProdR.$lot_no,
					MfgActReg_Upd02_DtlYieldByProdR.$sublot_no
			});
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<MfgActReg_Upd02_Hdr1R>> splitUp(MCList<MfgActReg_Upd02_Hdr1R> list, int max) {
			List<MCList<MfgActReg_Upd02_Hdr1R>> ret = new ArrayList<>();
			MCList<MfgActReg_Upd02_Hdr1R>[] grpL = list.groupList(MfgActReg_Upd02_Hdr1R.$itm_cd
					, MfgActReg_Upd02_Hdr1R.$itm_sub1, MfgActReg_Upd02_Hdr1R.$itm_sub2, MfgActReg_Upd02_Hdr1R.$itm_sub3);
			MCList<MfgActReg_Upd02_Hdr1R> tmp = MCList.create(MfgActReg_Upd02_Hdr1R.class);
			for (MCList<MfgActReg_Upd02_Hdr1R> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(MfgActReg_Upd02_Hdr1R.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		protected void editDown() {
			MCIndexKey idxkey = down1().createIndex(MfgActReg_Upd02_DtlYieldByProdR.$hdr_peg_no);
			for (MfgActReg_Upd02_Hdr1R downR : down0()) {
				// 出来高一覧にも処理結果状況区分を設定 
				// ※クライアントのshowMergeでエラー行はマージしない動作とするために、処理結果状況区分が必要なので
				MCList<MfgActReg_Upd02_DtlYieldByProdR> subL = down1().subList(idxkey, downR.peg_no());
				for (MfgActReg_Upd02_DtlYieldByProdR subR : subL) {
					subR.rtn_sts_typ(downR.rtn_sts_typ());
				}
				
				if (MAC_RTN_STS_TYP.isERR(downR.rtn_sts_typ())) {
					// エラー行はそのまま
					continue;
				}
				
				// 登録処理が正常終了したとしても、全件投入できたわけではない場合があるので、バックフラッシュ結果によって処理結果を変更する
				if (!isSame(downR.bkf_tgt_cnt(), downR.bkf_success_cnt())) {
					downR.rtn_sts_typ(MAC_RTN_STS_TYP.WRN.value());
					MCMessagePool.add(downR, null, MSBCL1085, downR.bkf_tgt_cnt(),
							downR.bkf_success_cnt(), downR.bkf_failure_cnt(), toDispGUIIndex(downR));
				}
			}
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 出来高・副産品一覧のロットＮＯを発番する<br>
	 */
	public class Sprt01 extends MSBCL_MfgActListReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
		

		@Override
		protected void doIt() {
			editUp();
			callLotIssueSrv();
			setDown();
		}
		
		protected void editUp() {
			int cnt = 0;
			
			// up1は製造実績画面の上部一覧に相当するため、一行しか設定されない想定
			MfgInstActCom_Sprt01_HdrR up1R = up1().get(0);
			up1R.peg_no(MCNumber.ONE);
			for (MfgInstActCom_Sprt01_HdrR yieldR : up2()) {
				yieldR.peg_no(cnt++);
				yieldR.hdr_peg_no(up1R.peg_no());
				yieldR.lot_issue_flg(up0().lot_issue_flg());
				yieldR.sublot_issue_flg(up0().sublot_issue_flg());
				yieldR.sppl_cd(up1R.sppl_cd());
				yieldR.mfg_loc_cd(up1R.mfg_loc_cd());
				yieldR.mfg_loc_wg_cd(up1R.mfg_loc_wg_cd());
				yieldR.mfg_loc_site_cd(up1R.mfg_loc_site_cd());
				yieldR.yield_dt_label_nm(getLabel(yieldR, MfgInstActCom_Sprt01_HdrR.$yield_dt));
			}
			setPegNo(up2());

			Sprt01_DtlInpt().addAll(getInpt());
			Sprt01_DtlInpt().setAttributes(up1R);
			for (MfgInstActCom_Sprt01_DtlR inptR : Sprt01_DtlInpt()) {
				inptR.hdr_peg_no(up1R.peg_no());
			}
		}
		
		protected MCList<MfgInstActCom_Sprt01_DtlR> getInpt() {
			MST_MFG_INST_R instR = MST_MFG_INST_R.create();
			MST_MFG_INST_R t0 = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder instR_bldr = MCQueryApiBuilder.create(t0);
			instR_bldr.setSelect(t0.mfg_inst_unit_typ);
			dbSelectKey("MSBCL1130_MST_MFG_INST_S01", instR, instR_bldr, up0().mfg_inst_no());
			
			// 投入実績を取得
			MCList<MST_INPT_ACT_R> iaL = MCList.create(MST_INPT_ACT_R.class);
			MST_INPT_ACT_R t1 = MST_INPT_ACT_R.create("T");
			MCQueryApiBuilder iaL_bldr = MCQueryApiBuilder.create(t1);
			MSVT_LOT_LIST_R t2 = MSVT_LOT_LIST_R.create("T2");
			MST_INPT_SCHD_R t3 = MST_INPT_SCHD_R.create("T3");
			iaL_bldr.setSelect(t1.lot_no);
			iaL_bldr.addSelect(t1.sublot_no);
			iaL_bldr.addSelect(t2.vld_dt);
			iaL_bldr.addSelect(t2.first_gr_dt);
			iaL_bldr.addSelect(t2.lot_seq);
			iaL_bldr.addInnerJoin(t2,
					bracket(t1.itm_cd.eq(t2.itm_cd)
							.and(t1.itm_sub1.eq(t2.itm_sub1))
							.and(t1.itm_sub2.eq(t2.itm_sub2))
							.and(t1.itm_sub3.eq(t2.itm_sub3))
							.and(t1.lot_no.eq(t2.lot_no))
							.and(t1.sublot_no.eq(t2.sublot_no))));
			iaL_bldr.addInnerJoin(t3, bracket(t1.inpt_schd_no.eq(t3.inpt_schd_no)));
			iaL_bldr.setWhere(t3.main_itm_flg.eq(value(true)));
			if (MAC_MFG_INST_UNIT_TYP.isOPER(instR.mfg_inst_unit_typ())) {
				iaL_bldr.addWhereWithAnd(t1.itm_mfg_inst_no.eq(bind("1")),
						up0().itm_mfg_inst_no());
				dbSelect("MSBCL1130_MST_INPT_ACT_S02", iaL, iaL_bldr);
			}
			else {
				iaL_bldr.addWhereWithAnd(t1.mfg_act_no.eq(bind("1")), up0().mfg_act_no());
				if (!isNull(up0().mfg_act_no())) {
					dbSelect("MSBCL1130_MST_INPT_ACT_S03", iaL, iaL_bldr);
				}
			}
			
			MCList<MfgInstActCom_Sprt01_DtlR> retL = MCList.create(MfgInstActCom_Sprt01_DtlR.class);
			if (!iaL.isEmpty()) {
				for (MST_INPT_ACT_R iaR : iaL) {
					MfgInstActCom_Sprt01_DtlR retR = MfgInstActCom_Sprt01_DtlR.create();
					retR.lot_no(iaR.lot_no());
					retR.sublot_no(iaR.sublot_no());
					retR.main_itm_flg(true);
					retR.vld_dt(iaR.getDateNE("vld_dt"));
					retR.first_gr_dt(iaR.getDateNE("first_gr_dt"));
					retR.lot_seq(iaR.getStringNE("lot_seq"));
					retL.add(retR);
				}
				return retL;
			}
			
			// 投入実績が存在しない場合は投入予定を取得
			MCList<MST_INPT_SCHD_R> isL = MCList.create(MST_INPT_SCHD_R.class);
			MST_INPT_SCHD_R t4 = MST_INPT_SCHD_R.create("T");
			MCQueryApiBuilder isL_bldr = MCQueryApiBuilder.create(t4);
			MSVT_LOT_LIST_R t5 = MSVT_LOT_LIST_R.create("T2");
			isL_bldr.setSelect(t4.lot_no);
			isL_bldr.addSelect(t4.sublot_no);
			isL_bldr.addSelect(t5.vld_dt);
			isL_bldr.addSelect(t5.first_gr_dt);
			isL_bldr.addSelect(t5.lot_seq);
			isL_bldr.addInnerJoin(t5,
					bracket(t4.itm_cd.eq(t5.itm_cd)
							.and(t4.itm_sub1.eq(t5.itm_sub1))
							.and(t4.itm_sub2.eq(t5.itm_sub2))
							.and(t4.itm_sub3.eq(t5.itm_sub3))
							.and(t4.lot_no.eq(t5.lot_no))
							.and(t4.sublot_no.eq(t5.sublot_no))));
			isL_bldr.setWhere(t4.main_itm_flg.eq(value(true)));
			isL_bldr.addWhereWithAnd(t4.can_flg.eq(value(false)));
			if (MAC_MFG_INST_UNIT_TYP.isOPER(instR.mfg_inst_unit_typ())) {
				isL_bldr.addWhereWithAnd(t4.itm_mfg_inst_no.eq(bind("1")),
						up0().itm_mfg_inst_no());
				dbSelect("MSBCL1130_MST_INPT_SCHD_S01", isL, isL_bldr);
			}
			else {
				isL_bldr.addWhereWithAnd(t4.mfg_inst_no.eq(bind("1")),
						up0().mfg_inst_no());
				if (!isNull(up0().mfg_inst_no())) {
					dbSelect("MSBCL1130_MST_INPT_SCHD_S02", isL, isL_bldr);
				}
			}
			
			if (!isL.isEmpty()) {
				for (MST_INPT_SCHD_R isR : isL) {
					MfgInstActCom_Sprt01_DtlR retR = MfgInstActCom_Sprt01_DtlR.create();
					retR.lot_no(isR.lot_no());
					retR.sublot_no(isR.sublot_no());
					retR.main_itm_flg(true);
					retR.vld_dt(isR.getDateNE("vld_dt"));
					retR.first_gr_dt(isR.getDateNE("first_gr_dt"));
					retR.lot_seq(isR.getStringNE("lot_seq"));
					retL.add(retR);
				}
			}
			return retL;
		}
		
		protected void callLotIssueSrv() {
			MSBCL_MfgInstActComService.MfgInstActCom_Sprt01 o = MSBCL_MfgInstActComService.crtMfgInstActCom_Sprt01();
			o.up0().addAll(up2());
			o.up1().addAll(Sprt01_DtlInpt());
			o.exec();
			copyByPegNo(up2(), new String[] {
					MfgInstActCom_Sprt01_HdrR.$lot_no, MfgInstActCom_Sprt01_HdrR.$sublot_no,
			}, o.down0(), new String[] {
					MfgInstActCom_Sprt01_HdrR.$lot_no, MfgInstActCom_Sprt01_HdrR.$sublot_no,
			});
		}
		
		protected void setDown() {
			down0().addAll(up2());
		}
	}
	
	/**
	 * Sprt02オペレーション.<p>
	 *
	 * 出来高一覧のロットＮＯを発番する（計画外実績用）<br>
	 */
	public class Sprt02 extends MSBCL_MfgActListReg_MC_A.Sprt02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			callLotIssueSrv();
			setDown();
		}
		
		protected void editUp() {
			int cnt = 0;
			
			// up1は製造実績画面の上部一覧に相当するため、一行しか設定されない想定
			MfgInstActCom_Sprt01_HdrR up1R = up1().get(0);
			up1R.peg_no(MCNumber.ONE);
			for (MfgInstActCom_Sprt01_HdrR yieldR : up2()) {
				yieldR.peg_no(cnt++);
				yieldR.hdr_peg_no(up1R.peg_no());
				yieldR.lot_issue_flg(up0().lot_issue_flg());
				yieldR.sublot_issue_flg(up0().sublot_issue_flg());
				yieldR.mfg_loc_cd(up1R.mfg_loc_cd());
				yieldR.mfg_loc_wg_cd(up1R.mfg_loc_wg_cd());
				yieldR.mfg_loc_site_cd(up1R.mfg_loc_site_cd());
				yieldR.yield_dt_label_nm(getLabel(yieldR, MfgInstActCom_Sprt01_HdrR.$yield_dt));
			}
		}
		
		protected void callLotIssueSrv() {
			MSBCL_MfgInstActComService.MfgInstActCom_Sprt01 o = MSBCL_MfgInstActComService.crtMfgInstActCom_Sprt01();
			o.up0().addAll(up2());
			o.exec();
			copyByPegNo(up2(), new String[] {
					MfgInstActCom_Sprt01_HdrR.$lot_no, MfgInstActCom_Sprt01_HdrR.$sublot_no,
			}, o.down0(), new String[] {
					MfgInstActCom_Sprt01_HdrR.$lot_no, MfgInstActCom_Sprt01_HdrR.$sublot_no,
			});
		}
		
		protected void setDown() {
			down0().addAll(up2());
		}
	}
	
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 計画外製造実績の登録を行う<br>
	 */
	public class Ins01 extends MSBCL_MfgActListReg_MC_A.Ins01 {
		// 製造実績登録サービスの結果保持
		protected MCList<MfgActReg_Upd01_HdrR> _downL;
		protected MCIndexKey _downLIdxKey;
		
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up1());
			}
			catch (Exception e) {
				handleEx(e, up1());
			}
			finally {
				down0().setAll(up1());
				down1().setAll(up2());
			}
		}
		
		protected void handleSuccess(MCList<Chk01_HdrR> l) {
			dbTran().commit();
			for (Chk01_HdrR r : l) {
				if (!r.err_flg()) {
					MfgActReg_Upd01_HdrR downR = _downL.getFirst(_downLIdxKey, r.peg_no());
					if (isNull(downR.bkf_tgt_cnt())) {
						r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
					}
					else {
						if (!isSame(downR.bkf_tgt_cnt(), downR.bkf_success_cnt())) {
							r.rtn_sts_typ(MAC_RTN_STS_TYP.WRN.value());
							MCMessagePool.add(r, null, MSBCL1085, downR.bkf_tgt_cnt(),
									downR.bkf_success_cnt(), downR.bkf_failure_cnt(), toDispGUIIndex(r));
						}
						else {
							r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
						}
					}
				}
			}
		}
		
		protected void handleEx(Exception e, MCList<Chk01_HdrR> l) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException) e;
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
		
		@Override
		protected void doIt() {
			
			// チェック・補完処理呼出
			callThisChk01();
			
			// 紐づきＮＯ編集
			editUp();
			
			// 製造実績登録サービス呼出
			callMfgActService();
			
			// 下り電文のための編集
			editUpForDown();
		}
		
		/**
		 * 下り電文のための電文編集
		 */
		protected void editUpForDown() {
			// ヘッダのロット・サブロットＮＯのNULL文字編集
			for (Chk01_HdrR up1R : up1()) {
				up1R.unschd_lot_no(nullValToNull(up1R.unschd_lot_no()));
				up1R.unschd_sublot_no(nullValToNull(up1R.unschd_sublot_no()));
			}
			
			// 出来高のロット・サブロットＮＯのNULL文字編集
			for (Chk01_DtlYieldByProdR up2R : up2()) {
				up2R.unschd_lot_no(nullValToNull(up2R.unschd_lot_no()));
				up2R.unschd_sublot_no(nullValToNull(up2R.unschd_sublot_no()));
			}
		}
		
		/**
		 * 紐づきＮＯ編集
		 */
		protected void editUp() {
			copyPegNoAndAttr(down0(), up1());
			copyPegNoAndAttr(down1(), up2());
		}
		
		/**
		 * チェック補完処理呼出
		 */
		protected void callThisChk01() {
			MSBCL_MfgActListReg.Chk01 chkOpe = MSBCL_MfgActListReg.crtChk01();
			
			chkOpe.up0().addAll(up1());
			chkOpe.up1().addAll(up2());
			
			if (!chkOpe.up0().isEmpty()) {
				chkOpe.exec();
				
				up1().setAll(chkOpe.down0());
				up2().setAll(chkOpe.down1());
			}
		}
		
		/**
		 * 製造実績登録サービス呼出
		 */
		protected void callMfgActService() {
			MSBCL_MfgActRegService.MfgActReg_Upd01 ope = MSBCL_MfgActRegService.crtMfgActReg_Upd01();
			MCIndexKey idxKey = up2().createIndex(Chk01_DtlYieldByProdR.$hdr_peg_no);
			
			for (Chk01_HdrR hdrR : up1()) {
				
				// チェックエラー行は除外
				if (hdrR.err_flg()) {
					continue;
				}
				
				// ヘッダに紐づく上り電文の出来高実績
				MCList<Chk01_DtlYieldByProdR> yieldL = up2().subList(idxKey, hdrR.peg_no());
				yieldL.sort(Chk01_DtlYieldByProdR.$disp_seq);
				
				// 製造実績登録サービス電文作成
				// ヘッダ
				ope.up0().add(makeMfgActRegUp0(hdrR, yieldL));
				// 出来高
				ope.up5().addAll(makeMfgActRegUp5(hdrR, yieldL));
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
				
				// 下り電文に実績ＮＯをセット
				copyByPegNo(up1(), new String[] {
						Chk01_HdrR.$peg_no,
						Chk01_HdrR.$mfg_act_no
						
				}, ope.down0(), new String[] {
						MfgActReg_Upd01_HdrR.$peg_no,
						MfgActReg_Upd01_HdrR.$mfg_act_no
				});
				copyByPegNo(up2(), new String[] {
						Chk01_DtlYieldByProdR.$hdr_peg_no,
						Chk01_DtlYieldByProdR.$peg_no,
						Chk01_DtlYieldByProdR.$yield_act_no
						
				}, ope.down5(), new String[] {
						MfgActReg_Upd01_DtlYieldR.$hdr_peg_no,
						MfgActReg_Upd01_DtlYieldR.$peg_no,
						MfgActReg_Upd01_DtlYieldR.$yield_act_no
				});
				
				_downL = ope.down0();
				_downLIdxKey = _downL.createIndex(MfgActReg_Upd01_HdrR.$peg_no);
			}
		}
		
		/**
		 * 製造実績登録サービス用電文作成（出来高）
		 * @param hdrR
		 * @param yieldL
		 * @return
		 */
		protected MCList<MfgActReg_Upd01_DtlYieldR> makeMfgActRegUp5(Chk01_HdrR hdrR, MCList<Chk01_DtlYieldByProdR> yieldL) {
			MCList<MfgActReg_Upd01_DtlYieldR> mfgActYieldL = MCList.create(MfgActReg_Upd01_DtlYieldR.class);
			
			for (Chk01_DtlYieldByProdR yieldR : yieldL) {
				MfgActReg_Upd01_DtlYieldR mfgActYieldR = MfgActReg_Upd01_DtlYieldR.create();
				
				mfgActYieldR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				mfgActYieldR.hdr_peg_no(yieldR.hdr_peg_no());
				mfgActYieldR.peg_no(yieldR.peg_no());
				mfgActYieldR.yield_typ(yieldR.unschd_yield_typ());
				mfgActYieldR.trd_unit_yield_act_qty(yieldR.unschd_trd_unit_yield_act_qty());
				mfgActYieldR.trd_unit_cd(yieldR.unschd_trd_unit_cd());
				mfgActYieldR.base_unit_yield_act_qty(yieldR.unschd_base_unit_yield_act_qty());
				mfgActYieldR.base_unit_cd(yieldR.unschd_base_unit_cd());
				mfgActYieldR.act_tm(yieldR.unschd_act_tm());
				mfgActYieldR.ac_dt(yieldR.unschd_ac_dt());
				mfgActYieldR.lot_no(yieldR.unschd_lot_no());
				mfgActYieldR.sublot_no(yieldR.unschd_sublot_no());
				mfgActYieldR.same_lot_flg(yieldR.unschd_same_lot_flg());
				mfgActYieldR.yield_rsn_cd(yieldR.unschd_yield_rsn_cd());
				mfgActYieldR.gd_cd(yieldR.unschd_gd_cd());
				mfgActYieldR.strg_loc_cd(yieldR.unschd_strg_loc_cd());
				mfgActYieldR.strg_str_ln_cd(yieldR.unschd_strg_str_ln_cd());
				mfgActYieldR.yield_rate(yieldR.yield_rate());
				mfgActYieldR.insp_cnt_rmrks(yieldR.insp_cnt_rmrks());
				mfgActYieldR.yield_act_intr_rmrks(yieldR.yield_act_intr_rmrks());
				mfgActYieldR.yield_act_rpt_rmrks(yieldR.yield_act_rpt_rmrks());
				mfgActYieldR.trd_rmrks(yieldR.trd_rmrks());
				mfgActYieldR.yield_act_sub_char1(yieldR.yield_act_sub_char1());
				mfgActYieldR.yield_act_sub_char2(yieldR.yield_act_sub_char2());
				mfgActYieldR.yield_act_sub_char3(yieldR.yield_act_sub_char3());
				mfgActYieldR.stk_lst_prnt_flg(false);
				mfgActYieldR.pack_flg(yieldR.pack_flg());
				mfgActYieldR.sublot_ctl_flg(yieldR.unschd_same_lot_flg());
				mfgActYieldR.not_stk_flg(yieldR.not_stk_flg());
				mfgActYieldR.abort_flg(false);
				mfgActYieldL.add(mfgActYieldR);
			}
			return mfgActYieldL;
		}
		
		/**
		 * 製造実績登録サービス用電文作成（ヘッダ）
		 * @param hdrR
		 * @param yieldL
		 * @return
		 */
		protected MfgActReg_Upd01_HdrR makeMfgActRegUp0(Chk01_HdrR hdrR, MCList<Chk01_DtlYieldByProdR> yieldL) {
			MfgActReg_Upd01_HdrR mfgActR = MfgActReg_Upd01_HdrR.create();
			
			mfgActR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			mfgActR.peg_no(hdrR.peg_no());
			mfgActR.mfg_sts_typ(hdrR.mfg_sts_typ());
			mfgActR.itm_cd(hdrR.unschd_itm_cd());
			mfgActR.itm_sub1(hdrR.unschd_itm_sub1());
			mfgActR.itm_sub2(hdrR.unschd_itm_sub2());
			mfgActR.itm_sub3(hdrR.unschd_itm_sub3());
			mfgActR.itm_nm(hdrR.unschd_itm_nm());
			mfgActR.sno1(hdrR.unschd_sno1());
			mfgActR.sno2(hdrR.unschd_sno2());
			mfgActR.sno3(hdrR.unschd_sno3());
			mfgActR.sno4(hdrR.unschd_sno4());
			mfgActR.sno1_mng_typ(hdrR.unschd_sno1_mng_typ());
			mfgActR.sno2_mng_typ(hdrR.unschd_sno2_mng_typ());
			mfgActR.sno3_mng_typ(hdrR.unschd_sno3_mng_typ());
			mfgActR.sno4_mng_typ(hdrR.unschd_sno4_mng_typ());
			mfgActR.st_act_tm(hdrR.st_act_tm());
			mfgActR.st_ac_dt(hdrR.st_ac_dt());
			mfgActR.end_act_tm(hdrR.end_act_tm());
			mfgActR.end_ac_dt(hdrR.end_ac_dt());
			mfgActR.itm_mfg_inst_qty(hdrR.unschd_base_unit_yield_act_qty());
			mfgActR.base_unit_st_act_qty(hdrR.unschd_base_unit_yield_act_qty());
			mfgActR.rem_abort_flg(false);
			mfgActR.base_unit_dec_place(hdrR.unschd_base_unit_dec_place());
			mfgActR.base_unit_conv_rnd_typ(hdrR.unschd_base_unit_conv_rnd_typ());
			
			if (!isNull(yieldL)) {
				MCList<Chk01_DtlYieldByProdR> goodL = yieldL.subList(Chk01_DtlYieldByProdR.$unschd_yield_typ, MAC_YIELD_TYP.GOOD.value());
				MCList<Chk01_DtlYieldByProdR> dfctL = yieldL.subList(Chk01_DtlYieldByProdR.$unschd_yield_typ, MAC_YIELD_TYP.DFCT.value());
				if (!isNull(goodL)) {
					mfgActR.base_unit_yield_qty(goodL.sum(Chk01_DtlYieldByProdR.$unschd_base_unit_yield_act_qty));
				}
				else {
					mfgActR.base_unit_yield_qty(0);
				}
				if (!isNull(dfctL)) {
					mfgActR.base_unit_dfct_qty(dfctL.sum(Chk01_DtlYieldByProdR.$unschd_base_unit_yield_act_qty));
				}
				else {
					mfgActR.base_unit_dfct_qty(0);
				}
			}
			
			mfgActR.base_unit_cd(hdrR.unschd_base_unit_cd());
			mfgActR.act_usr_cd(hdrR.act_usr_cd());
			mfgActR.act_dpt_cd(hdrR.act_usr_dpt_cd());
			mfgActR.act_rpt_rmrks(hdrR.mfg_act_rpt_rmrks());
			mfgActR.intr_rmrks(hdrR.mfg_act_intr_rmrks());
			mfgActR.mfg_act_sub_char1(hdrR.mfg_act_sub_char1());
			mfgActR.mfg_act_sub_char2(hdrR.mfg_act_sub_char2());
			mfgActR.mfg_act_sub_char3(hdrR.mfg_act_sub_char3());
			mfgActR.act_prnt_flg(false);
			mfgActR.mfg_mtd_typ(MSC_MFG_MTD_TYP.INTNL.value());
			mfgActR.mfg_inst_unit_typ(hdrR.mfg_inst_unit_typ());
			mfgActR.mfg_loc_cd(hdrR.unschd_mfg_loc_cd());
			mfgActR.mfg_str_ln_cd(hdrR.unschd_mfg_str_ln_cd());
			mfgActR.bom_ptn(hdrR.unschd_bom_ptn());
			mfgActR.site_cd(hdrR.unschd_mfg_loc_site_cd());
			mfgActR.wg_cd(hdrR.unschd_mfg_loc_wg_cd());
			mfgActR.div_seq(1);
			mfgActR.aprv_flg(false);
			mfgActR.trd_cd(getDefaultTrdCd(MAC_TRD_PTN_TYP.MFG.value()));
			mfgActR.lot_mng_typ(hdrR.unschd_lot_mng_typ());
			mfgActR.lot_no_typ(hdrR.unschd_lot_no_typ());
			mfgActR.lot_no_ptn_cd(hdrR.unschd_lot_no_ptn_cd());
			mfgActR.sublot_mng_typ(hdrR.unschd_sublot_mng_typ());
			mfgActR.sublot_no_typ(hdrR.unschd_sublot_no_typ());
			mfgActR.sublot_no_ptn_cd(hdrR.unschd_sublot_no_ptn_cd());
			mfgActR.arr_purc_auto_reg_flg(false);
			mfgActR.act_immed_prnt_flg(up0().act_immed_prnt_flg());
			mfgActR.is_src_outsrc_srv_flg(false);
			mfgActR.lst_reg_flg(true);
			mfgActR.is_src_batch_flg(false);
			mfgActR.unschd_act_flg(true);
			mfgActR.oper_ptn(hdrR.unschd_oper_ptn());
			mfgActR.master_dt(hdrR.unschd_master_dt());
			mfgActR.mfg_str_ln_cd_none_flg(hdrR.unschd_mfg_str_ln_cd_none_flg());
			mfgActR.strg_loc_cd(hdrR.unschd_strg_loc_cd());
			mfgActR.strg_str_ln_cd(hdrR.unschd_strg_str_ln_cd());
			mfgActR.strg_str_ln_cd_none_flg(hdrR.unschd_strg_str_ln_cd_none_flg());
			mfgActR.not_bkf_upd_flg(up0().not_bkf_upd_flg());
			mfgActR.not_wk_cost_upd_calc_flg(up0().not_wk_cost_upd_calc_flg());
			
			return mfgActR;
		}
	}
	
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 計画外製造実績のチェックを行う<br>
	 */
	public class Chk01 extends MSBCL_MfgActListReg_MC_A.Chk01 {

		/** 品目マスタのキャッシュ **/
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItmL = null;
		/** 品目詳細マスタのキャッシュ **/
		protected MCList<MAM_ITM_DTL_R> _cacheItmDtlL = null;
		/** 品目マスタ（工場・物流倉庫）コンテナキャッシュ */
		protected FXUCL_MCDbcCache<MAM_ITM_SITE_R> _cacheItmSiteL = null;
		/** 場所マスタ（格納場所：出来高）キャッシュ */
		protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLocYield = null;
		/** 案件手配紐付情報  */
		protected MCList<MST_WRK_SNO_R> _wrkSnoL = MCList.create(MST_WRK_SNO_R.class);
		/** 案件  */
		protected MCList<MST_WRK_R> _wrkL = MCList.create(MST_WRK_R.class);
		
		/** インデックス */
		protected MCIndexKey _idxWrkSnoL = null;
		protected MCIndexKey _idxWrkL = null;
		protected MCIndexKey _idxItmDtlCache = null;
		protected MCIndexKey _idxlotDup = null;
		protected MCIndexKey _idxsublotDup = null;
		protected String[] _idxlotInfoKeyCols = null;
		protected String[] _idxsublotInfoKeyCols = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 上り電文編集
			editUp();
			
			super.doIt();
			
			// 下り電文編集
			setDown();
		}
		
		/**
		 * 上り電文編集
		 */
		protected void editUp() {
			setPegNo(up1());
			setPegNo(up2());
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			// キャッシュ作成
			createCache();
			
			// 条件付き必須チェック
			msgL.addAll(checkReqSub());
			
			// その他固有チェック
			msgL.addAll(checkOther());
			
			// 計上日
			msgL.addAll(checkClosingDate());
			
			// 補完処理
			compData();
			
			if (!up2().file_imp_flg()) {
				// 手入力時は下表チェックを実施する
				msgL.addAll(chechUnschdStrgLocWG());
				msgL.addAll(checkClosingDateYield());
				msgL.addAll(checkYieldLotDupl());
			}
			else {
				msgL.addAll(checkImpLotDupl());
			}
			
			copyErrFlg(up0(), up1(), Chk01_HdrR.$peg_no, Chk01_DtlYieldByProdR.$hdr_peg_no);
			
			return msgL;
		}
		
		/**
		 * キャッシュ作成
		 */
		protected void createCache() {
			createItmMstCache();
			createItmDtlCache();
			createItmSiteCache();
			createCacheWrkSno();
			createCacheWrk();
			createLocCacheYield();
		}
		
		/**
		 * 補完処理
		 */
		protected void compData() {
			// ヘッダ情報の補完
			for (Chk01_HdrR hdrR : up0()) {
				if (!isSame(hdrR.unschd_trd_unit_cd(), hdrR.unschd_base_unit_cd()))  {
					// 基準単位換算
					hdrR.unschd_base_unit_yield_act_qty(
							convToBaseUnit(
									hdrR.unschd_trd_unit_yield_act_qty(),
									hdrR.unschd_conv_base_qty(), hdrR.unschd_conv_qty(),
									hdrR.unschd_base_unit_dec_place(), hdrR.unschd_base_unit_conv_rnd_typ()));
				}
				else {
					hdrR.unschd_base_unit_yield_act_qty(hdrR.unschd_trd_unit_yield_act_qty());
				}
				
				if (up2().file_imp_flg()) {
					// ファイル入力で製造状況区分が「着手中」の場合、終了実績日時、終了計上日はクリア
					if (!isNull(hdrR.mfg_sts_typ()) && MSC_MFG_STS_TYP.isSTT(hdrR.mfg_sts_typ())) {
						hdrR.end_act_tm(null);
						hdrR.end_ac_dt(null);
					}
					
					// ロット、サブロット、手配ＮＯを管理しない場合はクリア
					MAM_ITM_R itmR = _cacheItmL.get(hdrR.unschd_itm_cd(),
							hdrR.unschd_itm_sub1(), hdrR.unschd_itm_sub2(),
							hdrR.unschd_itm_sub3(), hdrR.unschd_mfg_loc_cd());
					if (MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())
							|| (!MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())
									&& MAC_LOT_NO_TYP.isAUTO(itmR.lot_no_typ()))) {
						hdrR.unschd_lot_no(null);
					}
					if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())
							|| (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())
									&& MAC_LOT_NO_TYP.isAUTO(itmR.sublot_no_typ()))) {
						hdrR.unschd_sublot_no(null);
					}
					
					if (MAC_SNO_MNG_TYP.isNOT_MNG(itmR.sno1_mng_typ())) {
						hdrR.unschd_sno1(null);
					}
					if (MAC_SNO_MNG_TYP.isNOT_MNG(itmR.sno2_mng_typ())) {
						hdrR.unschd_sno2(null);
					}
					if (MAC_SNO_MNG_TYP.isNOT_MNG(itmR.sno3_mng_typ())) {
						hdrR.unschd_sno3(null);
					}
					if (MAC_SNO_MNG_TYP.isNOT_MNG(itmR.sno4_mng_typ())) {
						hdrR.unschd_sno4(null);
					}
				}
				
				if (!isNullOrNullVal(hdrR.unschd_sno1())) {
					// 案件の補完
					MST_WRK_SNO_R wrkSnoR = _wrkSnoL.getFirst(_idxWrkSnoL, hdrR.unschd_sno1());
					if (!isNull(wrkSnoR)) {
						MST_WRK_R wrkR = _wrkL.getFirst(_idxWrkL, wrkSnoR.wrk_no());
						hdrR.unschd_wrk_no(wrkSnoR.wrk_no());
						if (!isNull(wrkR)) {
							hdrR.unschd_wrk_nm(wrkR.wrk_nm());
						}
					}
				}
				
				// 棚・ライン無の補完　
				if (hdrR.unschd_strg_str_ln_tgt_flg() && !hdrR.unschd_strg_str_ln_cd_none_flg() && isNullOrNullVal(hdrR.unschd_strg_str_ln_cd())) {
					hdrR.unschd_strg_str_ln_cd_none_flg(true);
				}
				if (hdrR.unschd_mfg_str_ln_tgt_flg() && !hdrR.unschd_mfg_str_ln_cd_none_flg() && isNullOrNullVal(hdrR.unschd_mfg_str_ln_cd())) {
					hdrR.unschd_mfg_str_ln_cd_none_flg(true);
				}
				
				// 下表の補完
				if (up2().file_imp_flg() && !hdrR.err_flg()) {
					Chk01_DtlYieldByProdR yieldR = Chk01_DtlYieldByProdR.create();
					yieldR.unschd_yield_typ(MAC_YIELD_TYP.GOOD.value());
					yieldR.unschd_yield_typ_nm(MAC_YIELD_TYP.GOOD.name());
					yieldR.unschd_itm_cd(hdrR.unschd_itm_cd());
					yieldR.unschd_itm_sub1(hdrR.unschd_itm_sub1());
					yieldR.unschd_itm_sub2(hdrR.unschd_itm_sub2());
					yieldR.unschd_itm_sub3(hdrR.unschd_itm_sub3());
					yieldR.unschd_itm_nm(hdrR.unschd_itm_nm());
					yieldR.unschd_lot_no(hdrR.unschd_lot_no());
					yieldR.unschd_sublot_no(hdrR.unschd_sublot_no());
					yieldR.unschd_lot_mng_typ(hdrR.unschd_lot_mng_typ());
					yieldR.unschd_lot_no_typ(hdrR.unschd_lot_no_typ());
					yieldR.unschd_lot_no_ptn_cd(hdrR.unschd_lot_no_ptn_cd());
					yieldR.unschd_sublot_mng_typ(hdrR.unschd_sublot_mng_typ());
					yieldR.unschd_sublot_no_typ(hdrR.unschd_sublot_no_typ());
					yieldR.unschd_sublot_no_ptn_cd(hdrR.unschd_sublot_no_ptn_cd());
					yieldR.unschd_trd_unit_cd(hdrR.unschd_trd_unit_cd());
					yieldR.unschd_trd_unit_nm(hdrR.unschd_trd_unit_nm());
					yieldR.unschd_trd_unit_yield_act_qty(hdrR.unschd_trd_unit_yield_act_qty());
					yieldR.unschd_trd_unit_dec_place(hdrR.unschd_trd_unit_dec_place());
					yieldR.unschd_trd_unit_conv_rnd_typ(hdrR.unschd_trd_unit_rnd_typ());
					yieldR.unschd_base_unit_cd(hdrR.unschd_base_unit_cd());
					yieldR.unschd_base_unit_nm(hdrR.unschd_base_unit_nm());
					yieldR.unschd_base_unit_yield_act_qty(hdrR.unschd_base_unit_yield_act_qty());
					yieldR.unschd_base_unit_dec_place(hdrR.unschd_base_unit_dec_place());
					yieldR.unschd_base_unit_conv_rnd_typ(hdrR.unschd_base_unit_conv_rnd_typ());
					yieldR.unschd_conv_base_qty(hdrR.unschd_conv_base_qty());
					yieldR.unschd_conv_qty(hdrR.unschd_conv_qty());
					yieldR.unschd_act_tm(nvl(hdrR.end_act_tm(), hdrR.st_act_tm()));
					yieldR.unschd_ac_dt(nvl(hdrR.end_ac_dt(), hdrR.st_ac_dt()));
					yieldR.unschd_yield_rsn_cd(null);
					yieldR.unschd_yield_rsn_nm(null);
					yieldR.unschd_gd_cd(getDefaultFeedStkGd().gd_cd());
					yieldR.unschd_gd_nm(getDefaultFeedStkGd().gd_nm());
					yieldR.unschd_strg_loc_cd(hdrR.unschd_strg_loc_cd());
					yieldR.unschd_strg_loc_nm(hdrR.unschd_strg_loc_nm());
					yieldR.unschd_strg_str_ln_tgt_flg(hdrR.unschd_strg_str_ln_tgt_flg());
					yieldR.unschd_strg_str_ln_cd(hdrR.unschd_strg_str_ln_cd());
					yieldR.unschd_strg_str_ln_nm(hdrR.unschd_strg_str_ln_nm());
					yieldR.unschd_strg_str_ln_cd_none_flg(hdrR.unschd_strg_str_ln_cd_none_flg());
					yieldR.disp_seq(1);
					yieldR.hdr_peg_no(hdrR.peg_no());
					yieldR.peg_no(hdrR.peg_no());
					up1().add(yieldR);
				}
			}
			
			// 出来高情報の補完
			for (Chk01_DtlYieldByProdR yieldR : up1()) {
				Chk01_HdrR hdrR = up0().getFirst(Chk01_HdrR.$peg_no, yieldR.hdr_peg_no());
				
				// 基準単位換算関連項目セット
				yieldR.unschd_base_unit_cd(hdrR.unschd_base_unit_cd());
				yieldR.unschd_base_unit_dec_place(hdrR.unschd_base_unit_dec_place());
				yieldR.unschd_base_unit_conv_rnd_typ(hdrR.unschd_base_unit_conv_rnd_typ());
				
				if (!isSame(yieldR.unschd_trd_unit_cd(), yieldR.unschd_base_unit_cd())) {
					// 基準単位換算
					yieldR.unschd_base_unit_yield_act_qty(
							convToBaseUnit(
									yieldR.unschd_trd_unit_yield_act_qty(),
									yieldR.unschd_conv_base_qty(), yieldR.unschd_conv_qty(),
									yieldR.unschd_base_unit_dec_place(), yieldR.unschd_base_unit_conv_rnd_typ()));
				}
				else {
					yieldR.unschd_base_unit_yield_act_qty(yieldR.unschd_trd_unit_yield_act_qty());
				}
				
				// 格納棚・ラインＣＤ
				if (isNull(yieldR.unschd_strg_str_ln_cd())) {
					yieldR.unschd_strg_str_ln_cd(MAC_STR.NULL_VAL.value());
				}
			}
			// ロットＮＯ発番
			setLotNo();
		}
		
		/**
		 * ロットＮＯ発番
		 */
		protected void setLotNo() {
			
			// 上段のロット/サブロットNOがあった場合で、下段がNULLまたはNULL文字の場合は、上段のロット・サブロットを下段に反映
			for (Chk01_HdrR hdrR : up0()) {
				MCList<Chk01_DtlYieldByProdR> up1L = up1().subList(Chk01_DtlYieldByProdR.$hdr_peg_no, hdrR.peg_no());
				if (!isNull(up1L)) {
					for (int i = 0; i < up1L.size(); i++) {
						if (!isNullOrNullVal(hdrR.unschd_lot_no()) && isNullOrNullVal(up1L.get(0).unschd_lot_no())) {
							up1L.get(i).unschd_lot_no(hdrR.unschd_lot_no());
						}
						if (!isNullOrNullVal(hdrR.unschd_sublot_no()) && isNullOrNullVal(up1L.get(0).unschd_sublot_no())) {
							up1L.get(i).unschd_sublot_no(hdrR.unschd_sublot_no());
						}
					}
				}
			}
			
			// 製造指図・実績共通処理サービスでロット・サブロットを発番する
			MSBCL_MfgInstActComService.MfgInstActCom_Sprt01 o = MSBCL_MfgInstActComService.crtMfgInstActCom_Sprt01();
			
			for (Chk01_DtlYieldByProdR yieldR : up1()) {
				if (yieldR.err_flg()) {
					continue;
				}
				
				Chk01_HdrR up0R = up0().getFirst(Chk01_HdrR.$peg_no, yieldR.hdr_peg_no());
				if (up0R.err_flg()) {
					continue;
				}
				
				yieldR.unschd_lot_mng_typ(up0R.unschd_lot_mng_typ());
				yieldR.unschd_lot_no_typ(up0R.unschd_lot_no_typ());
				yieldR.unschd_lot_no_ptn_cd(up0R.unschd_lot_no_ptn_cd());
				yieldR.unschd_sublot_mng_typ(up0R.unschd_sublot_mng_typ());
				yieldR.unschd_sublot_no_typ(up0R.unschd_sublot_no_typ());
				yieldR.unschd_sublot_no_ptn_cd(up0R.unschd_sublot_no_ptn_cd());
				
				if (MAC_LOT_MNG_TYP.isNOT_MNG(yieldR.unschd_lot_mng_typ()) && MAC_SUBLOT_MNG_TYP.isNOT_MNG(yieldR.unschd_sublot_mng_typ())) {
					continue;
				}
				
				MfgInstActCom_Sprt01_HdrR sprt01HdrR = MfgInstActCom_Sprt01_HdrR.create();
				sprt01HdrR.peg_no(yieldR.peg_no());
				sprt01HdrR.hdr_peg_no(yieldR.hdr_peg_no());
				if (!MAC_LOT_MNG_TYP.isNOT_MNG(yieldR.unschd_lot_mng_typ()) && isNullOrNullVal(yieldR.unschd_lot_no())) {
					sprt01HdrR.lot_issue_flg(true);
					sprt01HdrR.lot_no(null);
				}
				else {
					sprt01HdrR.lot_issue_flg(false);
					sprt01HdrR.lot_no(up0R.unschd_lot_no());
				}
				
				if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(yieldR.unschd_sublot_mng_typ()) && isNullOrNullVal(yieldR.unschd_sublot_no())) {
					sprt01HdrR.sublot_issue_flg(true);
					sprt01HdrR.sublot_no(null);
				}
				else {
					sprt01HdrR.sublot_issue_flg(false);
					sprt01HdrR.sublot_no(up0R.unschd_sublot_no());
				}
				if (sprt01HdrR.lot_issue_flg() == false && sprt01HdrR.sublot_issue_flg() == false) {
					continue;
				}
				sprt01HdrR.itm_cd(yieldR.unschd_itm_cd());
				sprt01HdrR.itm_sub1(yieldR.unschd_itm_sub1());
				sprt01HdrR.itm_sub2(yieldR.unschd_itm_sub2());
				sprt01HdrR.itm_sub3(yieldR.unschd_itm_sub3());
				sprt01HdrR.sno1(up0R.unschd_sno1());
				sprt01HdrR.sno2(up0R.unschd_sno2());
				sprt01HdrR.sno3(up0R.unschd_sno3());
				sprt01HdrR.sno4(up0R.unschd_sno4());
				sprt01HdrR.lot_mng_typ(up0R.unschd_lot_mng_typ());
				sprt01HdrR.sublot_mng_typ(up0R.unschd_sublot_mng_typ());
				sprt01HdrR.lot_no_ptn_cd(up0R.unschd_lot_no_ptn_cd());
				sprt01HdrR.sublot_no_ptn_cd(up0R.unschd_sublot_no_ptn_cd());
				sprt01HdrR.yield_dt_label_nm(getLabel(yieldR, Chk01_DtlYieldByProdR.$unschd_act_tm));
				sprt01HdrR.yield_dt(yieldR.unschd_act_tm());
				sprt01HdrR.mfg_loc_cd(up0R.unschd_mfg_loc_cd());
				sprt01HdrR.mfg_loc_wg_cd(up0R.unschd_mfg_loc_wg_cd());
				sprt01HdrR.mfg_loc_site_cd(up0R.unschd_mfg_loc_site_cd());
				sprt01HdrR.no_exception_flg(true);
				sprt01HdrR.no_err_msg_flg(true);
				
				o.up0().add(sprt01HdrR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
				
				MCIndexKey downKey = o.down0().createIndex(MfgInstActCom_Sprt01_HdrR.$hdr_peg_no, MfgInstActCom_Sprt01_HdrR.$peg_no);
				for (Chk01_DtlYieldByProdR yieldR : up1()) {
					MfgInstActCom_Sprt01_HdrR downHdrR = o.down0().getFirst(downKey, yieldR.hdr_peg_no(), yieldR.peg_no());
					if (isNull(downHdrR)) {
						continue;
					}
					if (downHdrR.err_flg()) {
						MCMessagePool.add(yieldR, null, MSBCL1311,
								toDispItm(yieldR.unschd_itm_cd(), yieldR.unschd_itm_sub1(),
										yieldR.unschd_itm_sub2(), yieldR.unschd_itm_sub3()),
								toDispGUIIndex(yieldR));
						yieldR.err_flg(true);
						continue;
					}
					if (isNull(downHdrR.lot_no())) {
						yieldR.unschd_lot_no(MAC_STR.NULL_VAL.value());
					}
					else {
						yieldR.unschd_lot_no(downHdrR.lot_no());
					}
					if (isNull(downHdrR.sublot_no())) {
						yieldR.unschd_sublot_no(MAC_STR.NULL_VAL.value());
					}
					else {
						yieldR.unschd_sublot_no(downHdrR.sublot_no());
					}
				}
				copyErrFlg(up0(), up1(), Chk01_HdrR.$peg_no, Chk01_DtlYieldByProdR.$hdr_peg_no);
				setErrToRtnStsTyp();
			}
			
			// 上段：下段が１：１の場合
			// ・上段のロット/サブロットNOがNULLまたはNULL文字の場合は、下段で採番したロット・サブロットを上段に反映
			for (Chk01_HdrR hdrR : up0()) {
				MCList<Chk01_DtlYieldByProdR> up1L = up1().subList(Chk01_DtlYieldByProdR.$hdr_peg_no, hdrR.peg_no());
				if (!isNull(up1L) && up1L.size() == 1) {
					if (!isNullOrNullVal(up1L.get(0).unschd_lot_no()) && isNullOrNullVal(hdrR.unschd_lot_no())) {
						hdrR.unschd_lot_no(up1L.get(0).unschd_lot_no());
					}
					if (!isNullOrNullVal(up1L.get(0).unschd_sublot_no()) && isNullOrNullVal(hdrR.unschd_sublot_no())) {
						hdrR.unschd_sublot_no(up1L.get(0).unschd_sublot_no());
					}
				}
			}
		}
		
		/**
		 * 	条件付き必須チェック
		 * @return
		 */
		protected MCMessageList checkReqSub() {
			MCMessageList msgL = new MCMessageList();
			for (Chk01_HdrR hdrR : up0()) {
				if (hdrR.err_flg()) {
					continue;
				}
				MAM_ITM_R itmR = _cacheItmL.get(hdrR.unschd_itm_cd(),
						hdrR.unschd_itm_sub1(), hdrR.unschd_itm_sub2(),
						hdrR.unschd_itm_sub3(), hdrR.unschd_mfg_loc_cd());
				
				// 終了実績日時・終了計上日
				if (!isNullOrNullVal(hdrR.mfg_sts_typ()) && MSC_MFG_STS_TYP.isCMPL(hdrR.mfg_sts_typ())) {
					if (isNull(hdrR.end_act_tm())) {
						msgL.addAll(check(hdrR, Chk01_HdrR.$end_act_tm, new FXUCL_RequiredValidater()));
					}
					if (isNull(hdrR.end_ac_dt())) {
						msgL.addAll(check(hdrR, Chk01_HdrR.$end_ac_dt, new FXUCL_RequiredValidater()));
					}
				}
				
				// ロット及びサブロットNo
				if (!MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())
						&& isNullOrNullVal(hdrR.unschd_lot_no())
						&& MAC_LOT_NO_TYP.isMANUAL(itmR.lot_no_typ())) {
					MCList<Chk01_DtlYieldByProdR> yieldL = up1().subList(Chk01_DtlYieldByProdR.$hdr_peg_no, hdrR.peg_no());
					if (up2().file_imp_flg() || (!isNull(yieldL) && !yieldL.isEmpty() && yieldL.size() == 1)) {
						hdrR.unschd_lot_no(nullValToNull(hdrR.unschd_lot_no()));
						msgL.addAll(check(hdrR, Chk01_HdrR.$unschd_lot_no, new FXUCL_RequiredValidater()));
					}
				}
				if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())
						&& isNullOrNullVal(hdrR.unschd_sublot_no())
						&& MAC_LOT_NO_TYP.isMANUAL(itmR.sublot_no_typ())) {
					MCList<Chk01_DtlYieldByProdR> yieldL = up1().subList(Chk01_DtlYieldByProdR.$hdr_peg_no, hdrR.peg_no());
					if (up2().file_imp_flg() || (!isNull(yieldL) && !yieldL.isEmpty() && yieldL.size() == 1)) {
						hdrR.unschd_sublot_no(nullValToNull(hdrR.unschd_sublot_no()));
						msgL.addAll(check(hdrR, Chk01_HdrR.$unschd_sublot_no, new FXUCL_RequiredValidater()));
					}
				}
				
				// 手配1-4
				if (MAC_SNO_MNG_TYP.isMNG_REQ(itmR.sno1_mng_typ()) && isNullOrNullVal(hdrR.unschd_sno1())) {
					hdrR.unschd_sno1(nullValToNull(hdrR.unschd_sno1()));
					msgL.addAll(check(hdrR, Chk01_HdrR.$unschd_sno1, new FXUCL_RequiredValidater()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(itmR.sno2_mng_typ()) && isNullOrNullVal(hdrR.unschd_sno2())) {
					hdrR.unschd_sno2(nullValToNull(hdrR.unschd_sno2()));
					msgL.addAll(check(hdrR, Chk01_HdrR.$unschd_sno2, new FXUCL_RequiredValidater()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(itmR.sno3_mng_typ()) && isNullOrNullVal(hdrR.unschd_sno3())) {
					hdrR.unschd_sno3(nullValToNull(hdrR.unschd_sno3()));
					msgL.addAll(check(hdrR, Chk01_HdrR.$unschd_sno3, new FXUCL_RequiredValidater()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(itmR.sno4_mng_typ()) && isNullOrNullVal(hdrR.unschd_sno4())) {
					hdrR.unschd_sno4(nullValToNull(hdrR.unschd_sno4()));
					msgL.addAll(check(hdrR, Chk01_HdrR.$unschd_sno4, new FXUCL_RequiredValidater()));
				}
				
				if (!up2().file_imp_flg()) {
					// ファイル入力時は実施しない
					MCList<Chk01_DtlYieldByProdR> yieldL = up1().subList(Chk01_DtlYieldByProdR.$hdr_peg_no, hdrR.peg_no());
					if (!isNull(yieldL) && !yieldL.isEmpty()) {
						for(Chk01_DtlYieldByProdR yieldR : yieldL) {
							
							// 格納棚・ラインＣＤ
							MAM_LOC_R locR = _cacheLocYield.get(yieldR.unschd_strg_loc_cd());
							if (!isNull(locR) && locR.str_ln_tgt_flg()) {
								if (!yieldR.unschd_strg_str_ln_cd_none_flg() && isNull(yieldR.unschd_strg_str_ln_cd())) {
									msgL.addAll(check(yieldR, Chk01_DtlYieldByProdR.$unschd_strg_str_ln_cd, new FXUCL_RequiredValidater()));
									yieldR.err_flg(true);
								}
							}
							
							// 出来高理由
							if (isNullOrNullVal(yieldR.unschd_yield_rsn_cd())) {
								if (!isNullOrNullVal(yieldR.unschd_yield_typ()) && MAC_YIELD_TYP.isDFCT(yieldR.unschd_yield_typ())) {
									msgL.addAll(check(yieldR, Chk01_DtlYieldByProdR.$unschd_yield_rsn_cd, new FXUCL_RequiredValidater()));
									yieldR.err_flg(true);
								}
							}
						}
					}
				}
			}
			copyErrFlg(up0(), up1(), Chk01_HdrR.$peg_no, Chk01_DtlYieldByProdR.$hdr_peg_no);
			return msgL;
		}
		
		/**
		 * その他固有チェック
		 * @return
		 */
		protected MCMessageList checkOther() {
			MCMessageList msgL = new MCMessageList();
			// 承認対象外チェック、製造品チェック、外注品チェック
			for (Chk01_HdrR hdrR : up0()) {
				if (hdrR.err_flg()) {
					continue;
				}
				if (!MSC_MFG_STS_TYP.isCMPL(hdrR.mfg_sts_typ()) && !MSC_MFG_STS_TYP.isSTT(hdrR.mfg_sts_typ())) {
					msgL.add(new MCMessage(hdrR, Chk01_HdrR.$mfg_sts_typ, MSBCL1301, toDispGUIIndex(hdrR)));
					hdrR.err_flg(true);
				}
				
				MAM_ITM_R itmR = _cacheItmL.get(hdrR.unschd_itm_cd(), hdrR.unschd_itm_sub1(), hdrR.unschd_itm_sub2(), hdrR.unschd_itm_sub3());
				MAM_ITM_SITE_R siteR = _cacheItmSiteL.get(hdrR.unschd_itm_cd(), hdrR.unschd_itm_sub1(), hdrR.unschd_itm_sub2(), hdrR.unschd_itm_sub3(), hdrR.unschd_mfg_loc_site_cd());
				MAM_ITM_DTL_R itmDtlR = _cacheItmDtlL.getFirst(_idxItmDtlCache, hdrR.unschd_itm_cd(), 
						hdrR.unschd_itm_sub1(), hdrR.unschd_itm_sub2(), hdrR.unschd_itm_sub3(), 
						hdrR.unschd_mfg_loc_cd(), hdrR.unschd_mfg_loc_wg_cd(), hdrR.unschd_bom_ptn());
				
				// 製造承認対象チェック
					if(isSame(getSysParm("MFG_APRV_ENABLE_FLG"),"1") && siteR.mfg_aprv_flg() && !itmDtlR.no_mfg_aprv_flg()) {
					msgL.add(new MCMessage(hdrR, Chk01_HdrR.$unschd_itm_cd, MSBCL1302, 
							toDispItm(hdrR.unschd_itm_cd(), hdrR.unschd_itm_sub1(), hdrR.unschd_itm_sub2(), hdrR.unschd_itm_sub3()), toDispGUIIndex(hdrR)));
					hdrR.err_flg(true);
				}
				
				// 外注品チェック
				if (!isNull(hdrR.unschd_sppl_cd())) {
					msgL.add(new MCMessage(hdrR, Chk01_HdrR.$unschd_itm_cd, MSBCL1305, 
							toDispItm(hdrR.unschd_itm_cd(), hdrR.unschd_itm_sub1(), hdrR.unschd_itm_sub2(), hdrR.unschd_itm_sub3()), hdrR.unschd_mfg_loc_cd(), toDispGUIIndex(hdrR)));
					hdrR.err_flg(true);
				}
				
				// ロット発番パタン子品目引継ぎチェック
				if (MAC_ELM_TYP.isCHD_LOT(itmR.getStringNE("LOT_ELM_TYP1")) || MAC_ELM_TYP.isCHD_LOT(itmR.getStringNE("SUBLOT_ELM_TYP1"))) {
					msgL.add(new MCMessage(hdrR, Chk01_HdrR.$unschd_itm_cd, MSBCL1304, 
							toDispItm(hdrR.unschd_itm_cd(), hdrR.unschd_itm_sub1(), hdrR.unschd_itm_sub2(), hdrR.unschd_itm_sub3()), toDispGUIIndex(hdrR)));
					hdrR.err_flg(true);
				}
			}
			
			if (!up2().file_imp_flg()) {
				// 出来高
				for (Chk01_DtlYieldByProdR yieldR : up1()) {
					// 着手計上日≦計上日
					if (!isNull(yieldR.unschd_ac_dt())) {
						Chk01_HdrR hdrR = up0().getFirst(Chk01_HdrR.$peg_no, yieldR.hdr_peg_no());
						yieldR.st_ac_dt(hdrR.st_ac_dt());
						
						MCMessageList tmpMsgL = check(yieldR, new String[] {Chk01_DtlYieldByProdR.$st_ac_dt, Chk01_DtlYieldByProdR.$unschd_ac_dt}, new FXUCL_BeforeAfterValidater());
						if (tmpMsgL.size() > 0) {
							tmpMsgL.get(0).setCauseRow(yieldR, Chk01_DtlYieldByProdR.$unschd_ac_dt);
							msgL.addAll(tmpMsgL);
							hdrR.err_flg(true);
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 着手・終了計上日が締処理より後であること
		 * @return
		 */
		protected MCMessageList checkClosingDate() {
			MCMessageList msgL = new MCMessageList();
			MSBIL_ClService.Cl_Chk03 st = MSBIL_ClService.crtCl_Chk03();
			MSBIL_ClService.Cl_Chk03 end = MSBIL_ClService.crtCl_Chk03();
			
			for (Chk01_HdrR hdrR : up0()) {
				if (hdrR.err_flg()) {
					continue;
				}
				if (!isNull(hdrR.st_ac_dt())) {
					Cl_Chk03_CndR oUpR = Cl_Chk03_CndR.create();
					oUpR.peg_no(hdrR.peg_no());
					oUpR.ac_dt(hdrR.st_ac_dt());
					oUpR.stk_cls_chk_flg(true);
					oUpR.io_lmt_skip_flg(true);
					st.up0().add(oUpR);
					st.up1().no_msg_flg(true);
				}
				if (!isNullOrNullVal(hdrR.mfg_sts_typ()) && MSC_MFG_STS_TYP.isCMPL(hdrR.mfg_sts_typ())) {
					if (!isNull(hdrR.end_ac_dt())) {
						Cl_Chk03_CndR oUpR = Cl_Chk03_CndR.create();
						oUpR.peg_no(hdrR.peg_no());
						oUpR.ac_dt(hdrR.end_ac_dt());
						oUpR.stk_cls_chk_flg(true);
						oUpR.io_lmt_skip_flg(true);
						end.up0().add(oUpR);
						end.up1().no_msg_flg(true);
					}
				}
			}
			
			if (!st.up0().isEmpty()) {
				st.exec();
			}
			if (!end.up0().isEmpty()) {
				end.exec();
			}
			MCIndexKey stkey = st.down0().createIndex(Cl_Chk03_CndR.$peg_no);
			MCIndexKey endkey = end.down0().createIndex(Cl_Chk03_CndR.$peg_no);
			
			for (Chk01_HdrR hdrR : up0()) {
				
				Cl_Chk03_CndR stR = st.down0().getFirst(stkey, hdrR.peg_no());
				if (!isNull(stR) && stR.err_flg()) {
					msgL.add(new MCMessage(hdrR, Chk01_HdrR.$st_ac_dt,
							MSBCL1067, toYMDString(hdrR.st_ac_dt()), null,
							hdrR.mfg_act_no(), toDispGUIIndex(hdrR)));
					hdrR.err_flg(true);
				}
				
				Cl_Chk03_CndR endR = end.down0().getFirst(endkey, hdrR.peg_no());
				if (!isNull(endR) && endR.err_flg()) {
					msgL.add(new MCMessage(hdrR, Chk01_HdrR.$end_ac_dt,
							MSBCL1068, toYMDString(hdrR.end_ac_dt()), null,
							hdrR.mfg_act_no(), toDispGUIIndex(hdrR)));
					hdrR.err_flg(true);
				}
			}
			return msgL;
		}
		
		/**
		 * 出来高表の計上日が締処理より後であること
		 * @return
		 */
		protected MCMessageList checkClosingDateYield() {
			MCMessageList msgL = new MCMessageList();
			for (Chk01_HdrR hdrR : up0()) {
				if (hdrR.err_flg()) {
					continue;
				}
				MCList<Chk01_DtlYieldByProdR> yieldL = up1().subList(Chk01_DtlYieldByProdR.$hdr_peg_no, hdrR.peg_no());
				if (!isNull(yieldL) && !yieldL.isEmpty()) {
					MSBIL_ClService.Cl_Chk03 st = MSBIL_ClService.crtCl_Chk03();
					for(Chk01_DtlYieldByProdR yieldR : yieldL) {
						if (yieldR.err_flg()) {
							continue;
						}
						if (!isNull(yieldR.unschd_ac_dt())) {
							Cl_Chk03_CndR oUpR = Cl_Chk03_CndR.create();
							oUpR.peg_no(yieldR.peg_no());
							oUpR.ac_dt(yieldR.unschd_ac_dt());
							oUpR.loc_cd(yieldR.unschd_strg_loc_cd());
							oUpR.itm_cd(yieldR.unschd_itm_cd());
							oUpR.itm_sub1(yieldR.unschd_itm_sub1());
							oUpR.itm_sub2(yieldR.unschd_itm_sub2());
							oUpR.itm_sub3(yieldR.unschd_itm_sub3());
							oUpR.stk_cls_chk_flg(true);
							oUpR.io_lmt_skip_flg(false);
							oUpR.setAttributes(yieldR);
							st.up0().add(oUpR);
							st.up1().no_msg_flg(false);
						}
					}
					if (!st.up0().isEmpty()) {
						st.exec();
						copyErrFlg(yieldL, st.down0());
					}
				}
			}
			copyErrFlg(up0(), up1(), Chk01_HdrR.$peg_no, Chk01_DtlYieldByProdR.$hdr_peg_no);
			return msgL;
		}
		
		/**
		 * ロット重複チェック：下表のみでチェックをかける
		 * 手動登録時のみ
		 * @return
		 */
		protected MCMessageList checkYieldLotDupl() {
			MCMessageList msgL = new MCMessageList();
			
			// ロット情報取得
			MCList<MST_LOT_R> dupChkL = getLotForDupChkIns();
			
			_idxlotDup = dupChkL.createIndex(MST_LOT_R.$itm_cd,
					MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3,
					MST_LOT_R.$lot_no);
			_idxsublotDup = dupChkL.createIndex(MST_LOT_R.$itm_cd,
					MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3,
					MST_LOT_R.$lot_no, MST_LOT_R.$sublot_no);
			_idxlotInfoKeyCols = new String[] {
					Chk01_DtlYieldByProdR.$unschd_itm_cd, Chk01_DtlYieldByProdR.$unschd_itm_sub1,
					Chk01_DtlYieldByProdR.$unschd_itm_sub2, Chk01_DtlYieldByProdR.$unschd_itm_sub3,
					Chk01_DtlYieldByProdR.$unschd_lot_no
			};
			
			_idxsublotInfoKeyCols = new String[] {
					Chk01_DtlYieldByProdR.$unschd_itm_cd, Chk01_DtlYieldByProdR.$unschd_itm_sub1,
					Chk01_DtlYieldByProdR.$unschd_itm_sub2, Chk01_DtlYieldByProdR.$unschd_itm_sub3,
					Chk01_DtlYieldByProdR.$unschd_lot_no, Chk01_DtlYieldByProdR.$unschd_sublot_no
			};
			
			for (Chk01_HdrR hdrR : up0()) {
				if (hdrR.err_flg()) {
					continue;
				}
				
				if (!MAC_LOT_MNG_TYP.isUNIQ(hdrR.unschd_lot_mng_typ()) && !MAC_SUBLOT_MNG_TYP.isUNIQ(hdrR.unschd_sublot_mng_typ())) {
					continue;
				}
				
				MCList<Chk01_DtlYieldByProdR> yieldL = up1().subList(Chk01_DtlYieldByProdR.$hdr_peg_no, hdrR.peg_no());
				
				for (Chk01_DtlYieldByProdR yieldR : yieldL) {
					if (yieldR.err_flg()) {
						continue;
					}
					
					if (MAC_LOT_MNG_TYP.isUNIQ(hdrR.unschd_lot_mng_typ())) {
						MCList<Chk01_DtlYieldByProdR> sameLotList = up1().subList(_idxlotInfoKeyCols, 
								new String[] { yieldR.unschd_itm_cd(), yieldR.unschd_itm_sub1(), yieldR.unschd_itm_sub2(), yieldR.unschd_itm_sub3(), yieldR.unschd_lot_no()})
								.subList(r -> {
									return !r.unschd_same_lot_flg() && !isNullOrNullVal(r.unschd_lot_no());
								});
						MCList<Chk01_DtlYieldByProdR> sameLotListOtherHdr = up1().subList(_idxlotInfoKeyCols, 
								new String[] { yieldR.unschd_itm_cd(), yieldR.unschd_itm_sub1(), yieldR.unschd_itm_sub2(), yieldR.unschd_itm_sub3(), yieldR.unschd_lot_no()})
								.subList(r -> {
									return !isSame(yieldR.hdr_peg_no(), r.hdr_peg_no()) && !isNullOrNullVal(r.unschd_lot_no());
								});
						
						if (!sameLotList.isEmpty() && sameLotList.size() > 1) {
							// 画面内より同一ロットがないか。
							msgL.add(new MCMessage(hdrR, null, MSBFL0033, toDispItm(
									yieldR.unschd_itm_cd(), yieldR.unschd_itm_sub1(), yieldR.unschd_itm_sub2(), yieldR.unschd_itm_sub3()),
									yieldR.unschd_lot_no(), yieldR.unschd_sublot_no(), toDispGUIIndex(hdrR)));
							yieldR.err_flg(true);
							continue;
						}
						else if (!sameLotListOtherHdr.isEmpty()) {
							// 画面内より他のヘッダに同一ロットがないか。
							msgL.add(new MCMessage(hdrR, null, MSBFL0033, toDispItm(
									yieldR.unschd_itm_cd(), yieldR.unschd_itm_sub1(), yieldR.unschd_itm_sub2(), yieldR.unschd_itm_sub3()),
									yieldR.unschd_lot_no(), yieldR.unschd_sublot_no(), toDispGUIIndex(hdrR)));
							yieldR.err_flg(true);
							continue;
						}
						else if (!isNull(dupChkL.getFirst(_idxlotDup, yieldR.unschd_itm_cd(),
								yieldR.unschd_itm_sub1(), yieldR.unschd_itm_sub2(), yieldR.unschd_itm_sub3(),
								yieldR.unschd_lot_no()))) {
							// ロット情報より同一ロットチェック
							msgL.add(new MCMessage(hdrR, null, MSBFL0033, toDispItm(
									yieldR.unschd_itm_cd(), yieldR.unschd_itm_sub1(), yieldR.unschd_itm_sub2(), yieldR.unschd_itm_sub3()),
									yieldR.unschd_lot_no(), yieldR.unschd_sublot_no(), toDispGUIIndex(hdrR)));
							yieldR.err_flg(true);
							continue;
						}
					}
					
					if (MAC_SUBLOT_MNG_TYP.isUNIQ(hdrR.unschd_sublot_mng_typ())) {
						MCList<Chk01_DtlYieldByProdR> sameLotList = up1().subList(_idxsublotInfoKeyCols, 
								new String[] { yieldR.unschd_itm_cd(), yieldR.unschd_itm_sub1(), yieldR.unschd_itm_sub2(), yieldR.unschd_itm_sub3(), yieldR.unschd_lot_no(), yieldR.unschd_sublot_no()})
								.subList(r -> {
									return !r.unschd_same_lot_flg() && !isNullOrNullVal(r.unschd_sublot_no());
								});
						MCList<Chk01_DtlYieldByProdR> sameLotListOtherHdr = up1().subList(_idxsublotInfoKeyCols, 
								new String[] { yieldR.unschd_itm_cd(), yieldR.unschd_itm_sub1(), yieldR.unschd_itm_sub2(), yieldR.unschd_itm_sub3(), yieldR.unschd_lot_no(), yieldR.unschd_sublot_no()})
								.subList(r -> {
									return !isSame(yieldR.hdr_peg_no(), r.hdr_peg_no()) && !isNullOrNullVal(r.unschd_sublot_no());
								});
						
						if (!sameLotList.isEmpty() && sameLotList.size() > 1) {
							// 画面内より同一ロットがないか。
							msgL.add(new MCMessage(hdrR, null, MSBFL0034, toDispItm(
									yieldR.unschd_itm_cd(), yieldR.unschd_itm_sub1(), yieldR.unschd_itm_sub2(), yieldR.unschd_itm_sub3()),
									yieldR.unschd_lot_no(), yieldR.unschd_sublot_no(), toDispGUIIndex(hdrR)));
							yieldR.err_flg(true);
							continue;
						}
						else if (!sameLotListOtherHdr.isEmpty()) {
							// 画面内より他のヘッダに同一ロットがないか。
							msgL.add(new MCMessage(hdrR, null, MSBFL0034, toDispItm(
									yieldR.unschd_itm_cd(), yieldR.unschd_itm_sub1(), yieldR.unschd_itm_sub2(), yieldR.unschd_itm_sub3()),
									yieldR.unschd_lot_no(), yieldR.unschd_sublot_no(), toDispGUIIndex(hdrR)));
							yieldR.err_flg(true);
							continue;
						}
						else if (!isNull(dupChkL.getFirst(_idxsublotDup, yieldR.unschd_itm_cd(),
								yieldR.unschd_itm_sub1(), yieldR.unschd_itm_sub2(), yieldR.unschd_itm_sub3(),
								yieldR.unschd_lot_no(), yieldR.unschd_sublot_no()))) {
							msgL.add(new MCMessage(hdrR, null, MSBFL0034, toDispItm(
									yieldR.unschd_itm_cd(), yieldR.unschd_itm_sub1(), yieldR.unschd_itm_sub2(), yieldR.unschd_itm_sub3()),
									yieldR.unschd_lot_no(), yieldR.unschd_sublot_no(), toDispGUIIndex(hdrR)));
							yieldR.err_flg(true);
							continue;
						}
					}
				}
			}
			copyErrFlg(up0(), up1(), Chk01_HdrR.$peg_no, Chk01_DtlYieldByProdR.$hdr_peg_no);
			return msgL;
		}
		
		/**
		 * 製造場所・格納場所WG相違チェック
		 * @return
		 */
		protected MCMessageList chechUnschdStrgLocWG() {
			MCMessageList msgL = new MCMessageList();
			for (Chk01_HdrR hdrR : up0()) {
				if (hdrR.err_flg()) {
					continue;
				}

				MCList<Chk01_DtlYieldByProdR> yieldL = up1()
						.subList(Chk01_DtlYieldByProdR.$hdr_peg_no, hdrR.peg_no());

				for (Chk01_DtlYieldByProdR yieldR : yieldL) {
					if (yieldR.err_flg()) {
						continue;
					}
					//  製造場所・格納場所WG相違チェック
					if (!isNull(yieldR.unschd_strg_loc_cd())) {
						MAM_LOC_R locR = _cacheLocYield.get(yieldR.unschd_strg_loc_cd());
						if (!isSame(hdrR.unschd_mfg_loc_wg_cd(), locR.wg_cd())) {
							msgL.add(new MCMessage(hdrR, null, MSBCL1306,
									hdrR.unschd_mfg_loc_cd(), hdrR.unschd_mfg_loc_wg_cd(),
									yieldR.unschd_strg_loc_cd(), locR.wg_cd(),
									toDispGUIIndex(yieldR)));
							yieldR.err_flg(true);
							continue;
						}
					}
				}
			}
			copyErrFlg(up0(), up1(), Chk01_HdrR.$peg_no,
					Chk01_DtlYieldByProdR.$hdr_peg_no);
			return msgL;
		}
		
		/**
		 * ロット重複チェック
		 * ファイル入力時のみ
		 * @return
		 */
		protected MCMessageList checkImpLotDupl() {
			MCMessageList msgL = new MCMessageList();
			
			setSublot();
			MCList<MST_LOT_R> dupChkL = getLotForDupChkImp();
			
			_idxlotDup = dupChkL.createIndex(MST_LOT_R.$itm_cd,
					MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3,
					MST_LOT_R.$lot_no);
			_idxsublotDup = dupChkL.createIndex(MST_LOT_R.$itm_cd,
					MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3,
					MST_LOT_R.$lot_no, MST_LOT_R.$sublot_no);
			_idxlotInfoKeyCols = new String[] {
					Chk01_HdrR.$unschd_itm_cd, Chk01_HdrR.$unschd_itm_sub1,
					Chk01_HdrR.$unschd_itm_sub2, Chk01_HdrR.$unschd_itm_sub3,
					Chk01_HdrR.$unschd_lot_no
			};
			_idxsublotInfoKeyCols = new String[] {
					Chk01_HdrR.$unschd_itm_cd, Chk01_HdrR.$unschd_itm_sub1,
					Chk01_HdrR.$unschd_itm_sub2, Chk01_HdrR.$unschd_itm_sub3,
					Chk01_HdrR.$unschd_lot_no, Chk01_HdrR.$unschd_sublot_no
			};
			
			for (Chk01_HdrR hdrR : up0()) {
				if (hdrR.err_flg()) {
					continue;
				}
				
				if (!MAC_LOT_MNG_TYP.isUNIQ(hdrR.unschd_lot_mng_typ()) && !MAC_SUBLOT_MNG_TYP.isUNIQ(hdrR.unschd_sublot_mng_typ())) {
					continue;
				}
				
				if (MAC_LOT_MNG_TYP.isUNIQ(hdrR.unschd_lot_mng_typ())) {
					
					if (isNullOrNullVal(hdrR.unschd_lot_no())) {
						continue;
					}
					MCList<Chk01_HdrR> sameLotList = up0().subList(_idxlotInfoKeyCols, 
							new String[] { hdrR.unschd_itm_cd(), hdrR.unschd_itm_sub1(), hdrR.unschd_itm_sub2(), hdrR.unschd_itm_sub3(), hdrR.unschd_lot_no()});
					
					if (!sameLotList.isEmpty() && sameLotList.size() > 1) {
						msgL.add(new MCMessage(hdrR, null, MSBFL0033, toDispItm(
								hdrR.unschd_itm_cd(), hdrR.unschd_itm_sub1(), hdrR.unschd_itm_sub2(), hdrR.unschd_itm_sub3()),
								hdrR.unschd_lot_no(), hdrR.unschd_sublot_no(), toDispGUIIndex(hdrR)));
						hdrR.err_flg(true);
						continue;
					}
					else if (!isNull(dupChkL.getFirst(_idxlotDup, hdrR.unschd_itm_cd(),
							hdrR.unschd_itm_sub1(), hdrR.unschd_itm_sub2(), hdrR.unschd_itm_sub3(),
							hdrR.unschd_lot_no()))) {
						msgL.add(new MCMessage(hdrR, null, MSBFL0033, toDispItm(
								hdrR.unschd_itm_cd(), hdrR.unschd_itm_sub1(), hdrR.unschd_itm_sub2(), hdrR.unschd_itm_sub3()),
								hdrR.unschd_lot_no(), hdrR.unschd_sublot_no(), toDispGUIIndex(hdrR)));
						hdrR.err_flg(true);
						continue;
					}
					
				}
				
				if (MAC_SUBLOT_MNG_TYP.isUNIQ(hdrR.unschd_sublot_mng_typ())) {
					
					if (isNullOrNullVal(hdrR.unschd_sublot_no())) {
						continue;
					}
					MCList<Chk01_HdrR> sameLotList = up0().subList(_idxsublotInfoKeyCols, 
							new String[] { hdrR.unschd_itm_cd(), hdrR.unschd_itm_sub1(), hdrR.unschd_itm_sub2(), hdrR.unschd_itm_sub3(), hdrR.unschd_lot_no(), hdrR.unschd_sublot_no()});
					
					if (!sameLotList.isEmpty() && sameLotList.size() > 1) {
						msgL.add(new MCMessage(hdrR, null, MSBFL0034, toDispItm(
								hdrR.unschd_itm_cd(), hdrR.unschd_itm_sub1(), hdrR.unschd_itm_sub2(), hdrR.unschd_itm_sub3()),
								hdrR.unschd_lot_no(), hdrR.unschd_sublot_no(), toDispGUIIndex(hdrR)));
						hdrR.err_flg(true);
						continue;
					}
					else if (!isNull(dupChkL.getFirst(_idxsublotDup, hdrR.unschd_itm_cd(),
							hdrR.unschd_itm_sub1(), hdrR.unschd_itm_sub2(), hdrR.unschd_itm_sub3(),
							hdrR.unschd_lot_no(), hdrR.unschd_sublot_no()))) {
						msgL.add(new MCMessage(hdrR, null, MSBFL0034, toDispItm(
								hdrR.unschd_itm_cd(), hdrR.unschd_itm_sub1(), hdrR.unschd_itm_sub2(), hdrR.unschd_itm_sub3()),
								hdrR.unschd_lot_no(), hdrR.unschd_sublot_no(), toDispGUIIndex(hdrR)));
						hdrR.err_flg(true);
						continue;
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 品目マスタのキャッシュ作成
		 */
		protected void createItmMstCache() {
			if (up0().isEmpty()) {
				return;
			}
			
			// 品目マスタのキャッシュ
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbcItmL_bldr = MCQueryApiBuilder.create(t);
			MAM_NUM_PTN_R m2 = MAM_NUM_PTN_R.create("M2");
			MAM_NUM_PTN_R m3 = MAM_NUM_PTN_R.create("M3");
			dbcItmL_bldr.setSelect(t.itm_cd);
			dbcItmL_bldr.addSelect(t.itm_sub1);
			dbcItmL_bldr.addSelect(t.itm_sub2);
			dbcItmL_bldr.addSelect(t.itm_sub3);
			dbcItmL_bldr.addSelect(t.unit_cd);
			dbcItmL_bldr.addSelect(t.dec_place);
			dbcItmL_bldr.addSelect(t.rnd_typ);
			dbcItmL_bldr.addSelect(t.lot_mng_typ);
			dbcItmL_bldr.addSelect(t.lot_no_typ);
			dbcItmL_bldr.addSelect(t.lot_no_ptn_cd);
			dbcItmL_bldr.addSelect(t.sublot_mng_typ);
			dbcItmL_bldr.addSelect(t.sublot_no_typ);
			dbcItmL_bldr.addSelect(t.sublot_no_ptn_cd);
			dbcItmL_bldr.addSelect(t.sno1_mng_typ);
			dbcItmL_bldr.addSelect(t.sno2_mng_typ);
			dbcItmL_bldr.addSelect(t.sno3_mng_typ);
			dbcItmL_bldr.addSelect(t.sno4_mng_typ);
			dbcItmL_bldr.addSelect(t.itm_typ);
			dbcItmL_bldr.addSelect(m2.elm_typ1.as("lot_elm_typ1")); // ロットＮＯの発番パタンマスタの要素区分１
			dbcItmL_bldr.addSelect(m3.elm_typ1.as("sublot_elm_typ1")); // サブロットＮＯの発番パタンマスタの要素区分１  
			dbcItmL_bldr.addLeftOuterJoin(m2,
					bracket(m2.num_biz_typ.eq(value(MAC_NUM_BIZ_TYP.LOT.value()))
							.and(m2.num_ptn_cd.eq(t.lot_no_ptn_cd)))); // ロットＮＯ発番パタンと発番パタンマスタのJOIN
			dbcItmL_bldr.addLeftOuterJoin(m3,
					bracket(m3.num_biz_typ.eq(value(MAC_NUM_BIZ_TYP.SUBLOT.value()))
							.and(m3.num_ptn_cd.eq(t.sublot_no_ptn_cd)))); // サブロットＮＯ発番パタンと発番パタンマスタのJOIN

			_cacheItmL = new FXUCL_MCDbcCache<>(dbcItmL_bldr, up0(), new String[] {
					Chk01_HdrR.$unschd_itm_cd, Chk01_HdrR.$unschd_itm_sub1,
					Chk01_HdrR.$unschd_itm_sub2, Chk01_HdrR.$unschd_itm_sub3
			});
		}
		
		/**
		 * 品目詳細マスタのキャッシュ作製
		 */
		protected void createItmDtlCache() {
			_cacheItmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
			MCQueryApiBuilder cacheItmDtlL_bldr = MCQueryApiBuilder.create(t);
			cacheItmDtlL_bldr.setSelect(t.itm_cd, t.itm_sub1,
					t.itm_sub2, t.itm_sub3,
					t.mfg_loc_cd, t.wg_cd,
					t.bom_ptn, t.oper_ptn,
					t.no_mfg_aprv_flg);

			cacheItmDtlL_bldr.setWhere(t.itm_cd.eq(bind("unschd_itm_cd")));
			cacheItmDtlL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("unschd_itm_sub1")));
			cacheItmDtlL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("unschd_itm_sub2")));
			cacheItmDtlL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("unschd_itm_sub3")));
			cacheItmDtlL_bldr
					.addWhereWithAnd(t.mfg_loc_cd.eq(bind("unschd_mfg_loc_cd")));
			cacheItmDtlL_bldr.addWhereWithAnd(t.wg_cd.eq(bind("unschd_mfg_loc_wg_cd")));
			cacheItmDtlL_bldr.addWhereWithAnd(t.bom_ptn.eq(bind("unschd_bom_ptn")));
			cacheItmDtlL_bldr.addWhereWithAnd(t.oper_ptn.eq(bind("unschd_oper_ptn")));
			cacheItmDtlL_bldr
					.addWhereWithAnd(bind("unschd_master_dt").between(t.st_dt, t.end_dt));
			cacheItmDtlL_bldr
					.addConstWhereWithAnd(t.sppl_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.and(t.maker_cd.eq(value(MAC_STR.NULL_VAL.value())))
							.and(t.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value()))));
			dbSelect("MSBCL1130_MAM_ITM_DTL_S01", _cacheItmDtlL, cacheItmDtlL_bldr, up0(), null);
			_idxItmDtlCache = _cacheItmDtlL.createIndex(
					MAM_ITM_DTL_R.$itm_cd,
					MAM_ITM_DTL_R.$itm_sub1,
					MAM_ITM_DTL_R.$itm_sub2,
					MAM_ITM_DTL_R.$itm_sub3,
					MAM_ITM_DTL_R.$mfg_loc_cd,
					MAM_ITM_DTL_R.$wg_cd,
					MAM_ITM_DTL_R.$bom_ptn,
					MAM_ITM_DTL_R.$oper_ptn
					);
		}
		
		/**
		 * 品目マスタ（工場・物流倉庫）のキャッシュ作成
		 */
		protected void createItmSiteCache() {
			if (up0().isEmpty()) {
				return;
			}

			MAM_ITM_SITE_R t = MAM_ITM_SITE_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.mfg_aprv_flg);
			_cacheItmSiteL = new FXUCL_MCDbcCache<MAM_ITM_SITE_R>(dbc_bldr, up0(), new String[] {
					Chk01_HdrR.$unschd_itm_cd, Chk01_HdrR.$unschd_itm_sub1, 
					Chk01_HdrR.$unschd_itm_sub2, Chk01_HdrR.$unschd_itm_sub3,
					Chk01_HdrR.$unschd_mfg_loc_site_cd
			});
		}
		
		/**
		 * 場所マスタ（格納場所：出来高）のキャッシュ作成
		 */
		protected void createLocCacheYield() {
			if (up1().isEmpty()) {
				return;
			}

			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
			_cacheLocYield = new FXUCL_MCDbcCache<MAM_LOC_R>(locL_bldr, up1(), Chk01_DtlYieldByProdR.$unschd_strg_loc_cd);
		}
		
		/**
		 * キャッシュ作成（案件手配紐付情報）
		 */
		protected void createCacheWrkSno () {
			_wrkSnoL = MCList.create(MST_WRK_SNO_R.class);
			MST_WRK_SNO_R t = MST_WRK_SNO_R.create("T");
			MCQueryApiBuilder wrkSnoL_bldr = MCQueryApiBuilder.create(t);
			wrkSnoL_bldr.setWhere(t.sno1.eq(bind("unschd_sno1")));
			dbSelect("MSBCL1130_MST_WRK_SNO_S01", _wrkSnoL, wrkSnoL_bldr, up0());
			_idxWrkSnoL = _wrkSnoL.createIndex(MST_WRK_SNO_R.$sno1);
		}
		
		/**
		 * キャッシュ作成（案件）
		 */
		protected void createCacheWrk () {
			_wrkL = MCList.create(MST_WRK_R.class);
			MST_WRK_R t = MST_WRK_R.create("T");
			MCQueryApiBuilder wrkL_bldr = MCQueryApiBuilder.create(t);
			wrkL_bldr.setWhere(t.wrk_no.eq(bind("wrk_no")));
			dbSelect("MSBCL1130_MST_WRK_S01", _wrkL, wrkL_bldr, _wrkSnoL);
			_idxWrkL = _wrkL.createIndex(MST_WRK_R.$wrk_no);
		}
		
		/**
		 * ロット情報より取得
		 * 手入力登録時
		 * @return
		 */
		protected MCList<MST_LOT_R> getLotForDupChkIns(){
			
			MCList<Chk01_DtlYieldByProdR> gbL = up1().groupBy(Chk01_DtlYieldByProdR.$unschd_itm_cd, Chk01_DtlYieldByProdR.$unschd_lot_no,
					Chk01_DtlYieldByProdR.$unschd_itm_sub1, Chk01_DtlYieldByProdR.$unschd_itm_sub2, Chk01_DtlYieldByProdR.$unschd_itm_sub3);
			
			// ワークテーブルinsert
			MCList<MST_LOT_R> wkL = MCList.create(MST_LOT_R.class);
			for (Chk01_DtlYieldByProdR r : gbL) {
				if (isNullOr(r.unschd_itm_cd(), r.unschd_lot_no(), r.unschd_itm_sub1(), r.unschd_itm_sub2(), r.unschd_itm_sub3())) {
					continue;
				}
				
				MAM_ITM_R itmR = _cacheItmL.get(r.unschd_itm_cd(), r.unschd_itm_sub1(), r.unschd_itm_sub2(), r.unschd_itm_sub3());
				if (MAC_LOT_MNG_TYP.isUNIQ(itmR.lot_mng_typ())
						|| MAC_SUBLOT_MNG_TYP.isUNIQ(itmR.sublot_mng_typ())) {
					MST_LOT_R wkR = MST_LOT_R.create();
					wkR.itm_cd(r.unschd_itm_cd());
					wkR.itm_sub1(r.unschd_itm_sub1());
					wkR.itm_sub2(r.unschd_itm_sub2());
					wkR.itm_sub3(r.unschd_itm_sub3());
					wkR.lot_no(r.unschd_lot_no());
					wkR.sublot_no(MAC_STR.NULL_VAL.value());
					wkL.add(wkR);
				}
			}
			
			MCList<MST_LOT_R> retL = MCList.create(MST_LOT_R.class);
			if (!wkL.isEmpty()) {
				MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_LOT_R.create("T"));
				dbWkDelete("MSBCL1130_MSW_LOT_D01", wkL_bldr.getBaseDbc());
				dbWkInsert("MSBCL1130_MSW_LOT_I01", wkL, wkL_bldr.getBaseDbc());
				
				MST_LOT_R t1 = MST_LOT_R.create("T");
				MCQueryApiBuilder retL_bldr = MCQueryApiBuilder.create(t1);
				MSW_LOT_KEY_R t2 = MSW_LOT_KEY_R.create("T2");
				retL_bldr.setSelect(t1.itm_cd);
				retL_bldr.addSelect(t1.itm_sub1);
				retL_bldr.addSelect(t1.itm_sub2);
				retL_bldr.addSelect(t1.itm_sub3);
				retL_bldr.addSelect(t1.lot_no);
				retL_bldr.addSelect(t1.sublot_no);

				retL_bldr.addInnerJoin(t2, bracket(t1.itm_cd.eq(t2.itm_cd)
						.and(t1.itm_sub1.eq(t2.itm_sub1))
						.and(t1.itm_sub2.eq(t2.itm_sub2))
						.and(t1.itm_sub3.eq(t2.itm_sub3))
						.and(t1.lot_no.eq(t2.lot_no))));
				retL_bldr.setDistinct();
				dbSelect("MSBCL1130_MST_LOT_S01", retL, retL_bldr);
				
				dbWkDelete("MSBCL1130_MSW_LOT_D02", MCQueryApiBuilder.create(MST_LOT_R.create("T")).getBaseDbc());
			}
			return retL;
		}
		
		/**
		 * ロット情報より取得
		 * ファイル入力時
		 * @return
		 */
		protected MCList<MST_LOT_R> getLotForDupChkImp(){
			
			MCList<Chk01_HdrR> gbL = up0().groupBy(Chk01_HdrR.$unschd_itm_cd, Chk01_HdrR.$unschd_lot_no,
					Chk01_HdrR.$unschd_itm_sub1, Chk01_HdrR.$unschd_itm_sub2, Chk01_HdrR.$unschd_itm_sub3);
			
			// ワークテーブルinsert
			MCList<MST_LOT_R> wkL = MCList.create(MST_LOT_R.class);
			for (Chk01_HdrR r : gbL) {
				if (isNullOr(r.unschd_itm_cd(), r.unschd_lot_no(), r.unschd_itm_sub1(), r.unschd_itm_sub2(), r.unschd_itm_sub3())) {
					continue;
				}
				
				MAM_ITM_R itmR = _cacheItmL.get(r.unschd_itm_cd(), r.unschd_itm_sub1(), r.unschd_itm_sub2(), r.unschd_itm_sub3());
				if (MAC_LOT_MNG_TYP.isUNIQ(itmR.lot_mng_typ())
						|| MAC_SUBLOT_MNG_TYP.isUNIQ(itmR.sublot_mng_typ())) {
					MST_LOT_R wkR = MST_LOT_R.create();
					wkR.itm_cd(r.unschd_itm_cd());
					wkR.itm_sub1(r.unschd_itm_sub1());
					wkR.itm_sub2(r.unschd_itm_sub2());
					wkR.itm_sub3(r.unschd_itm_sub3());
					wkR.lot_no(r.unschd_lot_no());
					wkR.sublot_no(MAC_STR.NULL_VAL.value());
					wkL.add(wkR);
				}
			}
			
			MCList<MST_LOT_R> retL = MCList.create(MST_LOT_R.class);
			if (!wkL.isEmpty()) {
				MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_LOT_R.create("T"));
				dbWkDelete("MSBCL1130_MSW_LOT_D03", wkL_bldr.getBaseDbc());
				dbWkInsert("MSBCL1130_MSW_LOT_I02", wkL, wkL_bldr.getBaseDbc());
				
				MST_LOT_R t1 = MST_LOT_R.create("T");
				MCQueryApiBuilder retL_bldr = MCQueryApiBuilder.create(t1);
				MSW_LOT_KEY_R t2 = MSW_LOT_KEY_R.create("T2");
				retL_bldr.setSelect(t1.itm_cd);
				retL_bldr.addSelect(t1.itm_sub1);
				retL_bldr.addSelect(t1.itm_sub2);
				retL_bldr.addSelect(t1.itm_sub3);
				retL_bldr.addSelect(t1.lot_no);
				retL_bldr.addSelect(t1.sublot_no);

				retL_bldr.addInnerJoin(t2, bracket(t1.itm_cd.eq(t2.itm_cd)
						.and(t1.itm_sub1.eq(t2.itm_sub1))
						.and(t1.itm_sub2.eq(t2.itm_sub2))
						.and(t1.itm_sub3.eq(t2.itm_sub3))
						.and(t1.lot_no.eq(t2.lot_no))));
				retL_bldr.setDistinct();
				dbSelect("MSBCL1130_MST_LOT_S02", retL, retL_bldr);
				
				dbWkDelete("MSBCL1130_MSW_LOT_D04",
						MCQueryApiBuilder.create(MST_LOT_R.create("T")).getBaseDbc());
			}
			return retL;
		}
		
		protected void setSublot() {
			// サブロット管理区分：在庫のみサブロット管理するの場合の考慮
			for (Chk01_HdrR upR : up0()) {
				MAM_ITM_R itmR = _cacheItmL.get(upR.unschd_itm_cd(), upR.unschd_itm_sub1(), upR.unschd_itm_sub2(), upR.unschd_itm_sub3());
				
				if (!itmR.isEmpty() && MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
					upR.unschd_sublot_no(MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}
	}
	
	//　mapper
	protected Map_Lot_Chk02_CndR_Chk01_HdrR<Lot_Chk02_CndR, Chk01_HdrR> createMap_Lot_Chk02_CndR_Chk01_HdrR() {
		return new Map_Lot_Chk02_CndR_Chk01_HdrR<Lot_Chk02_CndR, Chk01_HdrR>();
	}
	
	public class Map_Lot_Chk02_CndR_Chk01_HdrR<D extends Lot_Chk02_CndR, S extends Chk01_HdrR> extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk02_CndR.$peg_no, Chk01_HdrR.$peg_no);
			addColumnPathMap(Lot_Chk02_CndR.$itm_cd, Chk01_HdrR.$unschd_itm_cd);
			addColumnPathMap(Lot_Chk02_CndR.$itm_sub1, Chk01_HdrR.$unschd_itm_sub1);
			addColumnPathMap(Lot_Chk02_CndR.$itm_sub2, Chk01_HdrR.$unschd_itm_sub2);
			addColumnPathMap(Lot_Chk02_CndR.$itm_sub3, Chk01_HdrR.$unschd_itm_sub3);
			addColumnPathMap(Lot_Chk02_CndR.$lot_no, Chk01_HdrR.$unschd_lot_no);
			addColumnPathMap(Lot_Chk02_CndR.$sublot_no, Chk01_HdrR.$unschd_sublot_no);
		}
	}
	
	//　mapper
	protected Map_Lot_Chk02_CndR_Chk01_DtlYieldByProdR<Lot_Chk02_CndR, Chk01_DtlYieldByProdR> createMap_Lot_Chk02_CndR_Chk01_DtlYieldByProdR() {
		return new Map_Lot_Chk02_CndR_Chk01_DtlYieldByProdR<Lot_Chk02_CndR, Chk01_DtlYieldByProdR>();
	}
	
	public class Map_Lot_Chk02_CndR_Chk01_DtlYieldByProdR<D extends Lot_Chk02_CndR, S extends Chk01_DtlYieldByProdR> extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk02_CndR.$peg_no, Chk01_DtlYieldByProdR.$hdr_peg_no);
			addColumnPathMap(Lot_Chk02_CndR.$itm_cd, Chk01_DtlYieldByProdR.$unschd_itm_cd);
			addColumnPathMap(Lot_Chk02_CndR.$itm_sub1, Chk01_DtlYieldByProdR.$unschd_itm_sub1);
			addColumnPathMap(Lot_Chk02_CndR.$itm_sub2, Chk01_DtlYieldByProdR.$unschd_itm_sub2);
			addColumnPathMap(Lot_Chk02_CndR.$itm_sub3, Chk01_DtlYieldByProdR.$unschd_itm_sub3);
			addColumnPathMap(Lot_Chk02_CndR.$lot_no, Chk01_DtlYieldByProdR.$unschd_lot_no);
			addColumnPathMap(Lot_Chk02_CndR.$sublot_no, Chk01_DtlYieldByProdR.$unschd_sublot_no);
		}
	}
	
	/**
	 * Imp01オペレーション.<p>
	 *
	 * 計画外製造実績のファイル入力を行う<br>
	 */
	public class Imp01 extends MSBCL_MfgActListReg_MC_A.Imp01 {
		/** 場所マスタキャッシュ */
		protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc = null;
		/** 出来高表の戻り保持 */
		protected MCList<Chk01_DtlYieldByProdR> _downYieldL;
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			setPegNo(up0());
			editUp();
			callThisChk01();
			clearNullVal();
			setDown();
		}

		protected void editUp() {
			createCache();
			complLoc();
			setDefStrLnCd();
		}

		/**
		 * キャッシュ作成
		 */
		protected void createCache() {
			createLocCache();
		}

		protected void complLoc() {
			for (Chk01_HdrR r : up0()) {
				MAM_LOC_R locR = getCacheLoc(r.unschd_strg_loc_cd());
				if (!isNull(locR)) {
					r.unschd_strg_str_ln_tgt_flg(locR.str_ln_tgt_flg());
				}
			}
		}

		/**
		 * 標準の棚・ラインCDを設定します。
		 */
		protected void setDefStrLnCd() {
			MSUCL_StrLnUtil.StrLnUtil_Srch01 ope = MSUCL_StrLnUtil.crtStrLnUtil_Srch01();
			for (Chk01_HdrR r : up0()) {
				if (!r.unschd_strg_str_ln_tgt_flg() || isNull(r.unschd_itm_cd()) || isNull(r.unschd_strg_loc_cd())) {
					continue;
				}
				StrLnUtil_Srch01_CndR cndR = StrLnUtil_Srch01_CndR.create();
				cndR.peg_no(r.peg_no());
				cndR.itm_cd(r.unschd_itm_cd());
				cndR.itm_sub1(nvl(r.unschd_itm_sub1(), MAC_STR.NULL_VAL.value()));
				cndR.itm_sub2(nvl(r.unschd_itm_sub2(), MAC_STR.NULL_VAL.value()));
				cndR.itm_sub3(nvl(r.unschd_itm_sub3(), MAC_STR.NULL_VAL.value()));
				cndR.loc_cd(r.unschd_strg_loc_cd());
				ope.up0().add(cndR);
			}
			ope.exec();
			MCIndexKey idxkey = ope.down0().createIndex(StrLnUtil_Srch01_CndR.$peg_no);
			for (Chk01_HdrR r : up0()) {
				StrLnUtil_Srch01_CndR downR = ope.down0().getFirst(idxkey, r.peg_no());
				if (!r.unschd_strg_str_ln_tgt_flg()) {
					r.unschd_strg_str_ln_cd_none_flg(false);
				}
				else if (!isNull(r.unschd_strg_str_ln_cd())) {
					r.unschd_strg_str_ln_cd_none_flg(false);
				}
				else if (!isNull(downR) && !isNullOrNullVal(downR.str_ln_cd())) {
					if (!r.unschd_strg_str_ln_cd_none_flg()) {
						r.unschd_strg_str_ln_cd(downR.str_ln_cd());
					}
				}
				else {
					r.unschd_strg_str_ln_cd_none_flg(false);
				}
			}
		}

		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(_downYieldL);
			editDown();
		}

		/**
		 * ファイル取り込み後のNULL文字クリア
		 */
		protected void editDown() {
			for (Chk01_HdrR down0R : down0()) {
				down0R.unschd_lot_no(nullValToNull(down0R.unschd_lot_no()));
				down0R.unschd_sublot_no(nullValToNull(down0R.unschd_sublot_no()));
				down0R.unschd_mfg_str_ln_cd(nullValToNull(down0R.unschd_mfg_str_ln_cd()));
				down0R.unschd_strg_str_ln_cd(nullValToNull(down0R.unschd_strg_str_ln_cd()));
				down0R.unschd_sno1(nullValToNull(down0R.unschd_sno1()));
				down0R.unschd_sno2(nullValToNull(down0R.unschd_sno2()));
				down0R.unschd_sno3(nullValToNull(down0R.unschd_sno3()));
				down0R.unschd_sno4(nullValToNull(down0R.unschd_sno4()));
			}
			
			for (Chk01_DtlYieldByProdR down1R : down1()) {
				down1R.unschd_lot_no(nullValToNull(down1R.unschd_lot_no()));
				down1R.unschd_sublot_no(nullValToNull(down1R.unschd_sublot_no()));
				down1R.unschd_strg_str_ln_cd(nullValToNull(down1R.unschd_strg_str_ln_cd()));
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBCL_MfgActListReg.Chk01 chk01 = MSBCL_MfgActListReg.crtChk01();
			chk01.up0().setAll(up0());
			chk01.up2().file_imp_flg(true);
			
			chk01.exec();
			up0().setAll(chk01.down0());
			_downYieldL  = chk01.down1();
		}

		protected void clearNullVal() {
			for (Chk01_HdrR hdrR : up0()) {
				nullValToNull(hdrR.unschd_lot_no());
				nullValToNull(hdrR.unschd_sublot_no());
				nullValToNull(hdrR.unschd_sno1());
				nullValToNull(hdrR.unschd_sno2());
				nullValToNull(hdrR.unschd_sno3());
				nullValToNull(hdrR.unschd_sno4());
				nullValToNull(hdrR.unschd_mfg_str_ln_cd());
				nullValToNull(hdrR.unschd_strg_str_ln_cd());
				nullValToNull(hdrR.unschd_oper_ptn());
			}
			
			for (Chk01_DtlYieldByProdR yieldR : _downYieldL) {
				nullValToNull(yieldR.unschd_lot_no());
				nullValToNull(yieldR.unschd_sublot_no());
				nullValToNull(yieldR.unschd_strg_str_ln_cd());
				yieldR.setStatus(Status.CREATE);
			}
		}

		protected void createLocCache() {
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(MAM_LOC_R.create("T"));
			_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(locL_bldr, up0(), Chk01_HdrR.$unschd_strg_loc_cd);
		}

		protected MAM_LOC_R getCacheLoc(String locCd) {
			return _cacheLoc.get(locCd);
		}
	}

	//FMCB CUSTOM END
}