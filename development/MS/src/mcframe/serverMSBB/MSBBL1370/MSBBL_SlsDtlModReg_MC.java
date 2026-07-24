package mcframe.serverMSBB.MSBBL1370;

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
import mcframe.serverMSBB.MSBBL1370.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBB.MSBBL6010.*;
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBI.MSBIL5010.*;
import static mcframe.serverMSBB.MSBBL1370.Query.*;
import mcframe.commonCore.param.MCParam;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCFuncCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverMABS.MABSL5010.*;
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil;
import mcframe.serverMSUC.MSUCL0050.MSUCL_ClUtil;
import java.util.ArrayList;
import java.util.List;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeAfterValidater;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SlsDtlModReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SlsDtlModReg_MC extends MSBBL_SlsDtlModReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 売上実績情報の検索を行います。<br>
	 */
	public class Srch01 extends MSBBL_SlsDtlModReg_MC_A.Srch01 {

		/** 操作種別:参照 */
		protected static final String OPE_REF = "5";

		protected static final String DISP_UNIT_IO = "0";

		protected static final String DISP_UNIT_DTL = "1";

		protected static final String DISP_UNIT_HDR = "2";

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();

			// 業務DL取り込み画面から実行時のデフォルト検索条件を実装
			setGrpFlgTrue();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editCnd();

			MCQueryPlan sql = null;
			if (isSame(up0().disp_unit(), DISP_UNIT_IO)) {
				sql = MSBBL1370_MST_SLS_ACT_IO_S01();
			}
			else if (isSame(up0().disp_unit(), DISP_UNIT_DTL)) {
				sql = MSBBL1370_MST_SLS_ACT_D_S01();
			}
			else if (isSame(up0().disp_unit(), DISP_UNIT_HDR)) {
				sql = MSBBL1370_MST_SLS_ACT_S01();
			}
			searchForDL(sql, up0(), down0());
		}

		@Override
		protected void doEditDown() {
			super.doEditDown();

		}

		@Override
		protected void editListMain() {
			super.editListMain();
			boolean setSlsCloseFlg = isSame(up0().disp_unit(), DISP_UNIT_DTL);
			setPegNo(down0());
			for (Srch01_DtlR r : down0()) {
				//原価金額の計算
				if (!isNull(r.sls_cost_amt()) && isSame(up0().disp_unit(), DISP_UNIT_DTL)) {
					if (up0().sign_rev_flg()) {
						r.sls_cost_amt(r.sls_cost_amt().multiply(r.base_unit_qty().signum()));
						if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())) {
							r.sls_cost_amt(r.sls_cost_amt().multiply(-1));
						}
						if (r.dscnt_itm_flg()) {
							r.sls_cost_amt(r.sls_cost_amt().multiply(-1));
						}
					}
					//符号反転フラグがOFFなら、取消伝票の原価金額の符号を変更する
					else {
						if (MAC_SLIP_STS_TYP.isCAN(r.slip_sts_typ())) {
							r.sls_cost_amt(r.sls_cost_amt().multiply(-1));
						}
					}
				}
				
				// 返品・値引金額符号反転がオンの場合、符号を調整
				if (up0().sign_rev_flg() && !isSame(up0().disp_unit(), DISP_UNIT_HDR)) {
					r.trd_cur_upri(getUpriDispPm(r.trd_cur_upri(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.old_trd_cur_upri(getUpriDispPm(r.old_trd_cur_upri(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.trd_cur_amt(getAmtDispPm(r.trd_cur_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.trd_cur_inc_tax_amt(getAmtDispPm(r.trd_cur_inc_tax_amt(),r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.trd_cur_tax_amt(getAmtDispPm(r.trd_cur_tax_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));

					r.base_cur_upri(getUpriDispPm(r.base_cur_upri(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.base_cur_amt(getAmtDispPm(r.base_cur_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.base_cur_inc_tax_amt(getAmtDispPm(r.base_cur_inc_tax_amt(),r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.base_cur_tax_amt(getAmtDispPm(r.base_cur_tax_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));

					r.ptax_cur_upri(getUpriDispPm(r.ptax_cur_upri(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.ptax_cur_amt(getAmtDispPm(r.ptax_cur_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.ptax_cur_inc_tax_amt(getAmtDispPm(r.ptax_cur_inc_tax_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.ptax_cur_tax_amt(getAmtDispPm(r.ptax_cur_tax_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));

					r.wtax_amt(getAmtDispPm(r.wtax_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));

					r.trd_unit_qty(r.trd_unit_qty().multiply(MAC_TRD_PTN_TYP.qty_disp_pm(r.trd_ptn_typ())));
					r.base_unit_qty(r.base_unit_qty().multiply(MAC_TRD_PTN_TYP.qty_disp_pm(r.trd_ptn_typ())));
					
				}
				if (isSame(up0().disp_unit(), DISP_UNIT_DTL) && !isNull(r.base_cur_amt()) && !isNull(r.sls_cost_amt())) {
					// 粗利率・粗利額の設定
					r.prof_rate(MSUCL_SlsUtil.getProfRate(r.base_cur_amt(), r.sls_cost_amt()));
					r.prof_amt(r.base_cur_amt().subtract(r.sls_cost_amt()));
				}
				
				if (setSlsCloseFlg) {
					if (r.ac_ym().lte(MSUCL_ClUtil.getSlsClYm())) {
						r.sls_close_flg(true);
					}
				}
				if (isSame(up0().ope(), OPE_REF)) {
					r.trd_unit_qty_for_upri(null);
				}
				else {
					if (MAC_BILL_CL_TYP.isEACH_SLS(r.bill_cl_typ())) {
						if (r.cst_iv_flg()) {
							r.bill_basis_dt(null);
						}
						else {
							r.bill_basis_dt(r.ac_dt());
						}
					}
					if (!r.cst_iv_flg() || !MAC_BILL_CL_TYP.isEACH_SLS(r.bill_cl_typ())) {
						r.rcv_schd_dt(null);
					}
				}
			}
		}

		protected MCNumber getAmtDispPm(MCNumber val, String trdPtnTyp, boolean dscntItmFlg) {
			if (!isNull(val) && !isNull(trdPtnTyp)) {
				return val.multiply(MAUCL_TrdUtil.getAmtDispPm(trdPtnTyp, dscntItmFlg));
			}
			return val;
		}

		protected MCNumber getUpriDispPm(MCNumber val, String trdPtnTyp, boolean dscntItmFlg) {
			if (!isNull(val) && !isNull(trdPtnTyp)) {
				return val.multiply(MAUCL_TrdUtil.getUpriDispPm(trdPtnTyp, dscntItmFlg));
			}
			return val;
		}

		protected void editCnd() {

			Srch01_CndR cnd = up0();
			if (cnd.iv_tgt_flg() && !cnd.iv_not_tgt_flg()) {
				cnd.addStringColumn("cst_iv_flg_str", toTrueStr(cnd.iv_tgt_flg()));
			}
			else if (!cnd.iv_tgt_flg() && cnd.iv_not_tgt_flg()) {
				cnd.addStringColumn("cst_iv_flg_str", toFalseStr(cnd.iv_tgt_flg()));
			}

			if (cnd.interim_flg() && !cnd.not_interim_flg()) {
				cnd.addStringColumn("interim_flg_str", toTrueStr(cnd.interim_flg()));
			}
			else if (!cnd.interim_flg() && cnd.not_interim_flg()) {
				cnd.addStringColumn("interim_flg_str", toFalseStr(cnd.interim_flg()));
			}

			if (cnd.foreign_flg()) {
				cnd.addStringColumn("foreign_flg_str", toTrueStr(cnd.foreign_flg()));
			}
		}
		
		/**
		 * 分類ＦＬＧを設定する。
		 */
		protected void setGrpFlgTrue() {
			
			// 得意先
			up0().cst_grp_flg1(true);
			up0().cst_grp_flg2(true);
			up0().cst_grp_flg3(true);
			up0().cst_grp_flg4(true);
			up0().cst_grp_flg5(true);
			up0().cst_grp_flg6(true);
			up0().cst_grp_flg7(true);
			up0().cst_grp_flg8(true);
			up0().cst_grp_flg9(true);
			up0().cst_grp_flg10(true);
			// 納品先
			up0().dlv_grp_flg1(true);
			up0().dlv_grp_flg2(true);
			up0().dlv_grp_flg3(true);
			up0().dlv_grp_flg4(true);
			up0().dlv_grp_flg5(true);
			up0().dlv_grp_flg6(true);
			up0().dlv_grp_flg7(true);
			up0().dlv_grp_flg8(true);
			up0().dlv_grp_flg9(true);
			up0().dlv_grp_flg10(true);
			// 売掛先
			up0().acst_grp_flg1(true);
			up0().acst_grp_flg2(true);
			up0().acst_grp_flg3(true);
			up0().acst_grp_flg4(true);
			up0().acst_grp_flg5(true);
			up0().acst_grp_flg6(true);
			up0().acst_grp_flg7(true);
			up0().acst_grp_flg8(true);
			up0().acst_grp_flg9(true);
			up0().acst_grp_flg10(true);
			// 請求先
			up0().bcst_grp_flg1(true);
			up0().bcst_grp_flg2(true);
			up0().bcst_grp_flg3(true);
			up0().bcst_grp_flg4(true);
			up0().bcst_grp_flg5(true);
			up0().bcst_grp_flg6(true);
			up0().bcst_grp_flg7(true);
			up0().bcst_grp_flg8(true);
			up0().bcst_grp_flg9(true);
			up0().bcst_grp_flg10(true);
			// 品目
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
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 売上実績情報の訂正前チェックを行います。<br>
	 */
	public class Chk01 extends MSBBL_SlsDtlModReg_MC_A.Chk01 {

		MCList<MST_SLS_ACT_R> _slsActL;
		MST_SLS_ACT_R _slsActL_t;
		MCQueryApiBuilder _slsActL_bldr;

		MCList<MST_SLS_ACT_D_R> _slsActDL;

		MCList<MST_SLS_ACT_IO_R> _slsActIoL;

		// 発番用紐付けＮＯカウンタ
		protected int _currPegNo;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			setCurrPegNo();
			super.doIt();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			setCache();

			lock();

			// チェック処理はチェックＧＲＰＮＯ単位で行う
			// グループ内で１レコードでもエラーが発生した場合は、グループすべてのレコードをエラー扱いとする
			// チェックＧＲＰＮＯは、呼び出し元(Upd01)内でグループ単位に連番が設定済の前提とする

			MCList<Chk01_DtlR>[] chkGrpL = up0().groupList(Chk01_DtlR.$chk_grp_no);

			for (MCList<Chk01_DtlR> chkL : chkGrpL) {

				MCMessageList subMsgL = new MCMessageList();

				subMsgL.addAll(checkUpdCntr(chkL));

				setErrFlg(subMsgL);
				if (hasErrFlgOn(chkL)) {
					subMsgL.addAll(setErrChkGrp(chkL));
				}

				msgL.addAll(subMsgL);
			}
			return msgL;
		}
		
		protected void setCache() {
			_cacheSlsActL = new FXUCL_Cache<MCList<MST_SLS_ACT_R>>();
			object(CLAZZ)._cacheSlsActL.setFixMaxCacheSize(-1);
			_cacheSlsActDL = new FXUCL_Cache<MCList<MST_SLS_ACT_D_R>>();
			object(CLAZZ)._cacheSlsActDL.setFixMaxCacheSize(-1);
			_cacheSlsActIoL = new FXUCL_Cache<MCList<MST_SLS_ACT_IO_R>>();
			object(CLAZZ)._cacheSlsActIoL.setFixMaxCacheSize(-1);
		}

		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			
			// 品目マスタ存在チェック
			msgL.addAll(checkMamItm());
			
			// 同一処理グループで一件でもエラーがあった場合、その他のレコードもエラーにする
			setErrFlg(msgL);
			MCList<Chk01_DtlR>[] chkGrpL = up0().groupList(Chk01_DtlR.$chk_grp_no);
			for (MCList<Chk01_DtlR> chkL : chkGrpL) {
				if (hasErrFlgOn(chkL)) {
					msgL.addAll(setErrChkGrp(chkL));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 品目マスタ存在チェック
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkMamItm() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MAM_ITM_R> mamItmL = searchMamItm();
			MCIndexKey up0Idx = up0().createIndex(Chk01_DtlR.$sls_act_d_no);
			MCIndexKey up0Idx2 = up0().createIndex(Chk01_DtlR.$sls_act_no);
			MCIndexKey mamItmIdx = mamItmL.createIndex(MAM_ITM_R.create().getKeyColumn());
			
			for (MST_SLS_ACT_D_R slsActDR : _slsActDL) {
				if (isNull(mamItmL.getFirst(mamItmIdx, slsActDR.itm_cd(), slsActDR.itm_sub1(), slsActDR.itm_sub2(), slsActDR.itm_sub3()))) {
					Chk01_DtlR up0R = up0().getFirst(up0Idx, slsActDR.sls_act_d_no());
					
					if (!isNull(up0R)) {
						String itmInfo = toDispItm(slsActDR.itm_cd(), slsActDR.itm_sub1(), slsActDR.itm_sub2(), slsActDR.itm_sub3());
						msgL.add(new MCMessage(up0R, null, MAUAL0189, itmInfo, toDispGUIIndex(up0R)));
					}
					else {
						MCList<Chk01_DtlR> up0L =up0().subList(up0Idx2, slsActDR.sls_act_no());
						for (Chk01_DtlR up0R2 : up0L) {
							msgL.add(new MCMessage(up0R2, null, MSBBL0301, slsActDR.sls_act_d_no(), toDispGUIIndex(up0R2)));
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 品目マスタ取得
		 * @return 品目マスタの取得結果リスト
		 */
		protected MCList<MAM_ITM_R> searchMamItm() {
			MAM_ITM_R mamItmL_t = MAM_ITM_R.create("T");
			MCQueryApiBuilder mamItmL_bldr = MCQueryApiBuilder.create(mamItmL_t);
			MCList<MAM_ITM_R> mamItmL = MCList.create(MAM_ITM_R.class);
			
			mamItmL_bldr.setSelect(mamItmL_bldr.getBaseDbc().getKeyColumn$());
			mamItmL_bldr.setWhere(mamItmL_t.itm_cd.eq(bind("itm_cd")));
			mamItmL_bldr.addWhereWithAnd(mamItmL_t.itm_sub1.eq(bind("itm_sub1")));
			mamItmL_bldr.addWhereWithAnd(mamItmL_t.itm_sub2.eq(bind("itm_sub2")));
			mamItmL_bldr.addWhereWithAnd(mamItmL_t.itm_sub3.eq(bind("itm_sub3")));
			dbSelect("MSBBL1370_MAM_ITM_S01", mamItmL, mamItmL_bldr, _slsActDL);
			
			return mamItmL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckBase();

			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			setSlsActInfo(notErrL);
			initDbcCacheDlvSlip(notErrL);
			for (MCList<Chk01_DtlR> chkL : notErrL.groupList(Chk01_DtlR.$chk_grp_no)) {

				MCMessageList subMsgL = super.doServerCheckBase();

				// DAC更新権限チェック
				subMsgL.addAll(checkWritableDptCdDac(chkL, Chk01_DtlR.$sls_dpt_cd));

				// 変更前の売上部門に対しDAC更新権限チェック
				subMsgL.addAll(chkUpdDac(chkL));

				// 条件付き必須チェック
				subMsgL.addAll(checkReqSub(chkL));

				// 条件付き存在チェック
				subMsgL.addAll(checkExistsSub(chkL));

				// 固有チェック
				subMsgL.addAll(checkOther(chkL));

				setErrFlg(subMsgL);
				if (hasErrFlgOn(chkL)) {
					subMsgL.addAll(setErrChkGrp(chkL));
				}

				// 補完処理
				compSub(chkL);
				
				msgL.addAll(subMsgL);
			}
			
			setSlsCloseFlg();
			
			return msgL;
		}

		protected void setSlsCloseFlg() {
			for (Chk01_DtlR r : up0()) {
				MCDate acYm = getAcYm(r.ac_dt());
				if (acYm.lte(MSUCL_ClUtil.getSlsClYm())) {
					r.sls_close_flg(true);
				}
			}
		}
		
		protected void setCurrPegNo() {
			_currPegNo = ((MCNumber) up0().max(Chk01_DtlR.$peg_no)).intValue();
		}

		protected int nextPegNo() {
			return ++_currPegNo;
		}

		/**
		 * 	更新対象データを排他ロックで取得する
		 */
		protected void lock() {

			// 売上実績 
			_slsActL = MCList.create(MST_SLS_ACT_R.class);
			_slsActL_t = MST_SLS_ACT_R.create("T");
			_slsActL_bldr = MCQueryApiBuilder.create(_slsActL_t);
			MAM_BP_R cst = MAM_BP_R.create("CST");
			MAM_BP_R acst = MAM_BP_R.create("ACST");
			MAM_BP_R bcst = MAM_BP_R.create("BCST");
			_slsActL_bldr.setWhere(_slsActL_t.sls_act_no.eq(bind("sls_act_no"))
					.and(_slsActL_t.sls_act_seq.eq(bind("sls_act_seq"))));
			_slsActL_bldr.addWhereWithAnd(_slsActL_t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			_slsActL.addBooleanColumn(MAM_BP_R.$cst_iv_flg);
			_slsActL.addStringColumn(MAM_BP_R.$bill_cl_typ);
			_slsActL_bldr.addSelect(cst.cst_iv_flg);
			_slsActL_bldr.addSelect(bcst.bill_cl_typ);
			_slsActL_bldr.addSelect(cst.acst_cd.as("acst_cd"));
			_slsActL_bldr.addSelect(acst.bcst_cd.as("bcst_cd"));
			_slsActL_bldr.addSelect(bcst.ar_cred_cd.as("cred_cd"));
			_slsActL_bldr.addLeftOuterJoin(cst, bracket( _slsActL_t.cst_cd.eq(cst.bp_cd)));
			_slsActL_bldr.addLeftOuterJoin(acst, cst.acst_cd.eq(acst.bp_cd));
			_slsActL_bldr.addLeftOuterJoin(bcst, acst.bcst_cd.eq(bcst.bp_cd));
			_slsActL_bldr.setOrderByAsc(_slsActL_bldr.getBaseDbc().getKeyColumn$());
			_slsActL_bldr.setLockTable(_slsActL_t.sls_act_no);
			dbSelectForUpdateNoWait("MSBBL1370_MST_SLS_ACT_S01", _slsActL, _slsActL_bldr,
					up0().groupBy(MST_SLS_ACT_R.$iv_no, MST_SLS_ACT_R.$sls_act_no, MST_SLS_ACT_R.$sls_act_seq));
			_slsActL.addDateColumn("eta_dt");
			
			for (MST_SLS_ACT_R slsActR : _slsActL) {
				if (!isNullOrNullVal(slsActR.iv_no())) {
					MST_IV_R iv = MST_IV_R.create("T");
					MCQueryApiBuilder iv_bldr = MCQueryApiBuilder.create(iv);
					iv_bldr.setSelect(iv.eta_dt);
					iv_bldr.setWhere(iv.iv_no.eq(bind("1")), slsActR.iv_no());
					dbSelect("MSBBL1370_MST_IV_S01", iv, iv_bldr);
					slsActR.setDateNE("eta_dt", iv.eta_dt());
				}
			}
			
			// 売上実績明細
			_slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
			_slsActDL.addBooleanColumn("abort_flg");
			MST_SLS_ACT_D_R slsActDL_t = MST_SLS_ACT_D_R.create("T");
			MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(slsActDL_t);
			MAM_ITM_R itm = MAM_ITM_R.create("ITM");
			MAM_TAX_R tax = MAM_TAX_R.create("TAX");
			MST_SLO_D_R slod = MST_SLO_D_R.create("SLOD");
			MST_SLS_SCHD_R slsSchd = MST_SLS_SCHD_R.create("SLSSCHD");
			slsActDL_bldr.setSelectAll();
			slsActDL_bldr.addSelect(itm.itm_jnl_cd);
			slsActDL_bldr.addSelect(tax.inc_tax_flg);
			slsActDL_bldr.addSelect(tax.tax_rate);
			slsActDL_bldr.addSelect(tax.tax_typ);
			slsActDL_bldr.addSelect(slod.sls_cststk_flg);
			slsActDL_bldr.addSelect(slsSchd.abort_flg);
			slsActDL_bldr.addLeftOuterJoin(itm, bracket(slsActDL_t.itm_cd.eq(itm.itm_cd)
													.and(slsActDL_t.itm_sub1.eq(itm.itm_sub1))
													.and(slsActDL_t.itm_sub2.eq(itm.itm_sub2))
													.and(slsActDL_t.itm_sub3.eq(itm.itm_sub3))));
			slsActDL_bldr.addLeftOuterJoin(tax, bracket(slsActDL_t.tax_cd.eq(tax.tax_cd)));
			slsActDL_bldr.addLeftOuterJoin(slod, bracket(slsActDL_t.slo_d_no.eq(slod.slo_d_no)));
			slsActDL_bldr.addLeftOuterJoin(slsSchd, bracket(slsActDL_t.sls_schd_no.eq(slsSchd.sls_schd_no)));
			slsActDL_bldr.setWhere(slsActDL_t.sls_act_no.eq(bind("sls_act_no")));
			slsActDL_bldr.addWhereWithAnd(slsActDL_t.sls_act_seq.eq(bind("sls_act_seq")));
			slsActDL_bldr.setLockTable(slsActDL_t.sls_act_no);
			slsActDL_bldr.setOrderByAsc(slsActDL_bldr.getBaseDbc().getKeyColumn$());
			_slsActDL.addBooleanColumn("inc_tax_flg");
			_slsActDL.addBooleanColumn("sls_cststk_flg");
			dbSelectForUpdate("MSBBL1370_MST_SLS_ACT_D_S01", _slsActDL, slsActDL_bldr,
					_slsActL.groupBy(MST_SLS_ACT_D_R.$sls_act_no, MST_SLS_ACT_D_R.$sls_act_seq));

			// 売上実績受払
			_slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
			MST_SLS_ACT_IO_R slsActIoL_t = MST_SLS_ACT_IO_R.create("T");
			MCQueryApiBuilder slsActIoL_bldr = MCQueryApiBuilder.create(slsActIoL_t);
			MST_SLS_ACT_D_R t2 = MST_SLS_ACT_D_R.create("T2");
			slsActIoL_bldr.setSelectAll();
			slsActIoL_bldr.addSelect(t2.sls_act_no);
			slsActIoL_bldr.addSelect(t2.sls_act_seq);
			slsActIoL_bldr.addInnerJoin(t2, bracket(slsActIoL_t.sls_act_d_no.eq(t2.sls_act_d_no)
												.and(slsActIoL_t.sls_act_d_seq.eq(t2.sls_act_d_seq))));
			slsActIoL_bldr.setWhere(t2.sls_act_no.eq(bind("sls_act_no")));
			slsActIoL_bldr.addWhereWithAnd(t2.sls_act_seq.eq(bind("sls_act_seq")));
			slsActIoL_bldr.setLockTable(slsActIoL_t.sls_act_io_no);
			slsActIoL_bldr.setOrderByAsc(slsActIoL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdate("MSBBL1370_MST_SLS_ACT_IO_S01", _slsActIoL, slsActIoL_bldr,
					_slsActL.groupBy(MST_SLS_ACT_D_R.$sls_act_no, MST_SLS_ACT_D_R.$sls_act_seq));
		}

		/**
		 * 更新カウンタチェック
		 * @return
		 */
		protected MCMessageList checkUpdCntr(MCList<Chk01_DtlR> chkL) {

			MCMessageList msgL = new MCMessageList();

			MCList<MST_SLS_ACT_R> grpSlsActL = MCList.create(MST_SLS_ACT_R.class);
			MCList<MST_SLS_ACT_D_R> grpSlsActDL = MCList.create(MST_SLS_ACT_D_R.class);
			MCList<MST_SLS_ACT_IO_R> grpSlsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);

			Chk01_DtlR chk = chkL.get(0);

			// 売上実績ＮＯ、連番によるインデックスキー
			MCIndexKey idxkeyActLbyActNo = _slsActL.createIndex(_slsActL_t.getKeyColumn());
			MCIndexKey idxKeyActDbyActNo = _slsActDL.createIndex(_slsActL_t.getKeyColumn());
			MCIndexKey idxkeyActIobyActNo = _slsActIoL.createIndex(_slsActL_t
					.getKeyColumn());

			if (!isNullOrNullVal(chk.iv_no())) {
				// インボイスＮＯありの売上実績の場合、同一インボイスＮＯの売上実績をまとめて更新する。
				// この際、同一インボイスＮＯの売上実績は、上り電文に含まれない場合もあるので
				// 拾い上げて更新しなければいけない（ただしチェック処理は省略する）
				// また、検索条件などにより、同一売上実績ＮＯの明細が上り電文に含まれない場合も
				// 同様に拾い上げて同時に更新する必要がある
				MCIndexKey idxkeyActIvNo = _slsActL.createIndex(MST_SLS_ACT_R.$iv_no);
				grpSlsActL = _slsActL.subList(idxkeyActIvNo, chk.iv_no());
			}
			else {
				// インボイスＮＯなしの場合は売上実績単位で取得
				grpSlsActL = _slsActL.subList(idxkeyActLbyActNo,
						chk.toArray(_slsActL_t.getKeyColumn()));
			}

			// 更新カウンタチェック
			for (Chk01_DtlR r : chkL) {
				MST_SLS_ACT_R chkSlsAct = _slsActL.getFirst(idxkeyActLbyActNo,
						r.toArray(_slsActL_t.getKeyColumn()));
				msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$hdr_upd_cntr, chkSlsAct));
				if (!isNull(chkSlsAct)) {
					// 上り電文に補完
					r.trd_ptn_typ(chkSlsAct.trd_ptn_typ());
					r.cst_cd(chkSlsAct.cst_cd());
					r.aprv_flg(chkSlsAct.aprv_flg());
					r.aprv_sts_typ(chkSlsAct.aprv_sts_typ());
					r.acst_cd(chkSlsAct.acst_cd());
					r.sls_dt(chkSlsAct.sls_dt());
					r.cst_iv_flg(chkSlsAct.getBooleanNE(MAM_BP_R.$cst_iv_flg));
					r.bef_sls_dpt_cd(chkSlsAct.sls_dpt_cd());
					r.bill_cl_typ(chkSlsAct.getStringNE(MAM_BP_R.$bill_cl_typ));
					r.bef_sls_usr_cd(chkSlsAct.sls_usr_cd());
					r.bef_ac_dt(chkSlsAct.ac_dt());
				}
			}
			setErrFlg(msgL);

			// DACキー(売上部門CD)の変更はないため、更新前データのDAC更新権限チェックは省略

			// 取得した売上実績ヘッダに紐づく売上実績明細、売上実績受払を取得
			for (MST_SLS_ACT_R r : grpSlsActL) {

				String[] keyCols = r.getKeyColumn();

				// 売上実績明細の取得
				grpSlsActDL.addAll(_slsActDL.subList(idxKeyActDbyActNo, r.toArray(keyCols)));

				// 売上実績受払の取得
				grpSlsActIoL.addAll(_slsActIoL.subList(idxkeyActIobyActNo, r.toArray(keyCols)));
			}

			// 売上実績明細との突合せも念のためチェック
			MCList<Chk01_DtlR> notErrL = getChkList(chkL);
			for (Chk01_DtlR r : notErrL) {

				String[] keyCols = grpSlsActDL.createRow().getKeyColumn();

				MCIndexKey idxkeyActDKey = grpSlsActDL.createIndex(keyCols);
				MST_SLS_ACT_D_R chkSlsActD = grpSlsActDL.getFirst(idxkeyActDKey,
						r.toArray(keyCols));
				if (isNull(chkSlsActD)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(),
							grpSlsActDL.createRow().tableName(), grpSlsActDL.createRow().getKeyColumn(),
							r.toArray(keyCols), r));
				}
				
				// 上り電文に補完
				if (!isNull(chkSlsActD)) {
					r.bef_bd_dpt_cd(chkSlsActD.bd_dpt_cd());
				}
			}

			if (!hasErr()) {

				// チェックＧＲＰＮＯをキーとしてキャッシュに格納 (Upd01オペレーション他で共有する)
				putCacheSlsAct(chk.chk_grp_no(), grpSlsActL);
				putCacheSlsActDL(chk.chk_grp_no(), grpSlsActDL);
				putCacheSlsActIoL(chk.chk_grp_no(), grpSlsActIoL);
			}

			return msgL;
		}

		/**
		 * 	条件付必須チェック
		 * @return
		 */
		protected MCMessageList checkReqSub(MCList<Chk01_DtlR> chkL) {

			MCMessageList msgL = new MCMessageList();

			for (Chk01_DtlR r : chkL) {

				// 値引理由ＣＤ
				if (!isNull(r.trd_cur_dscnt_amt())) {
					msgL.addAll(check(r, Chk01_DtlR.$dscnt_rsn_cd,
							new FXUCL_RequiredValidater()));
				}

				// 理由ＣＤ
				if (isSls(r.trd_ptn_typ()) && isSame(r.trd_cur_upri(), MCNumber.ZERO)) {
					msgL.addAll(check(r, Chk01_DtlR.$biz_rsn_cd,
							new FXUCL_RequiredValidater()));
				}
				if (!isSls(r.trd_ptn_typ())) {
					msgL.addAll(check(r, Chk01_DtlR.$biz_rsn_cd,
							new FXUCL_RequiredValidater()));
				}
				
				// 請求起算日
				if (!MAC_BILL_CL_TYP.isEACH_SLS(r.bill_cl_typ())) {
					msgL.addAll(check(r, Chk01_DtlR.$bill_basis_dt,
							new FXUCL_RequiredValidater()));
				}
				
				// 入金予定日
				if (r.cst_iv_flg() && MAC_BILL_CL_TYP.isEACH_SLS(r.bill_cl_typ())) {
					msgL.addAll(check(r, Chk01_DtlR.$rcv_schd_dt,
							new FXUCL_RequiredValidater()));
				}

				//債権部門ＣＤ
				if (r.cst_iv_flg()) {

					msgL.addAll(check(r, Chk01_DtlR.$ar_dpt_cd,
							new FXUCL_RequiredValidater()));
				}

				// 負担部門ＣＤ
				if (r.sls_acxfr_flg() && !isSlsDscnt(r.trd_ptn_typ())) {
					msgL.addAll(check(r, Chk01_DtlR.$bd_dpt_cd,
							new FXUCL_RequiredValidater()));
				}
				
				// 締済の場合
				if (r.sls_close_flg()) {
					// 売上部門ＣＤ
					msgL.addAll(check(r, Chk01_DtlR.$sls_dpt_cd,
							new FXUCL_RequiredValidater()));
				}
			}

			return msgL;
		}

		/**
		 * 条件付存在チェック
		 * @param chkL
		 */
		protected MCMessageList checkExistsSub(MCList<Chk01_DtlR> chkL) {

			MCMessageList msgL = new MCMessageList();

			for (Chk01_DtlR r : chkL) {

				// 理由ＣＤは取引区分、単価の値により条件が決定するため
				// 定型処理のリストロジックでは条件なしで取得後、ここでマッチしない組み合わせはエラーにする
				// 実装仕様書のリストロジックが切り換え可能になれば、そちらで済ます
				if (!isNull(r.biz_rsn_nm())) {

					/**
					 * ・売上/貸出売上：売上ＦＬＧがオン
					 * ・売上返品：売上返品ＦＬＧがオン
					 * ・売上値引/売上値増：売上調整ＦＬＧがオン
					 * ・売上、売上返品で単価がゼロでない場合、販売他勘定ＦＬＧはオフ
					 */
					if (isSls(r.trd_ptn_typ()) && !r.sls_flg()
							|| isSlsRtn(r.trd_ptn_typ()) && !r.sls_rtn_flg()
							|| isSlsDscnt(r.trd_ptn_typ()) && !r.sls_dscnt_flg()
							|| !isSlsDscnt(r.trd_ptn_typ()) 
							&& !isSame(r.trd_cur_upri(), MCNumber.ZERO)
							&& r.sls_acxfr_flg()) {
						MAM_BIZ_RSN_R checkDbc = MAM_BIZ_RSN_R.create();
						msgL.addAll(getRecordNotFoundMsg("MA", checkDbc.tableName(),
								checkDbc.getKeyColumn(),
								r.toArray(checkDbc.getKeyColumn()), r));
					}
				}
			}

			return msgL;
		}

		/**
		 * 売上部門変更前のDAC
		 * @param chkL
		 * @return
		 */
		protected MCMessageList chkUpdDac(MCList<Chk01_DtlR> chkL) {
			MCMessageList msgL = new MCMessageList();
			for (Chk01_DtlR r : chkL) {
				if (!isSame(r.sls_dpt_cd(), r.bef_sls_dpt_cd())) {
					msgL.addAll(checkWritableDptCdDac(r, Chk01_DtlR.$bef_sls_dpt_cd));
				}
			}
			return msgL;
		}
		
		/**
		 * 	固有チェック
		 * @return
		 */
		protected MCMessageList checkOther(MCList<Chk01_DtlR> chkL) {

			MCMessageList msgL = new MCMessageList();

			for (Chk01_DtlR r : chkL) {

				// 売上都度請求以外、計上日≦請求起算日チェック
				if (!MAC_BILL_CL_TYP.isEACH_SLS(r.bill_cl_typ())) {
					msgL.addAll(check(r, new String[] {Chk01_DtlR.$ac_dt, Chk01_DtlR.$bill_basis_dt}, new FXUCL_BeforeAfterValidater()));
				}
				// 得意先禁止チェック
				msgL.addAll(checkStopCst(r));

				msgL.addAll(chkShipAcDtAcDt(r));
				
				// 承認状況チェック
				msgL.addAll(checkAprvSts(r));
				
				//売上締チェック
				msgL.addAll(checkSlsCl(r));
			}

			return msgL;
		}

		/**
		 * 	取引禁止チェック(得意先)
		 * @return
		 */
		protected MCMessageList checkStopCst(Chk01_DtlR r) {
			MCMessageList msgL = new MCMessageList();
			// 売上返品、値引・値増は除外
			if (isSlsRtn(r.trd_ptn_typ()) || isSlsDscnt(r.trd_ptn_typ())) {
				return msgL;
			}
			
			// 取引禁止チェック(得意先)
			boolean rslt = execFuncBoolean(createSqlId(LOGIC_ID, "MAPA_BP$F_IS_SLS_STOP", "01"),
					MAPA_BP$F_IS_SLS_STOP(bind("cst_cd"), bind("sls_dt")), r);
			if (rslt) {
				msgL.add(new MCMessage(r, r.cst_cd(), MSBBL0089, r.cst_cd(), toYMDString(r.sls_dt()), toDispGUIIndex(r)));
			}

			return msgL;
		}

		protected void setSlsActInfo(MCList<Chk01_DtlR> chkL) {
			chkL.addStringColumn("sls_basis_typ");
			chkL.addStringColumn("ship_dlv_slip_no");

			for (Chk01_DtlR chkR : chkL) {
				MCList<MST_SLS_ACT_R> slsActL = getSlsActCache(chkR.chk_grp_no());
				MST_SLS_ACT_R r = slsActL.getFirst(MST_SLS_ACT_R.$sls_act_no, chkR.sls_act_no());
				if (!isNull(r)) {
					chkR.setValue("sls_basis_typ", r.sls_basis_typ());
					chkR.setValue("ship_dlv_slip_no", r.ship_dlv_slip_no());
				}
			}
		}

		protected MCMessageList chkShipAcDtAcDt(Chk01_DtlR r) {
			MCMessageList msgL = new MCMessageList();
			
			if (MAC_SLS_BASIS_TYP.isIN_BASIS(r.getString("sls_basis_typ")) || MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(r.getString("sls_basis_typ"))) {
				MST_DLV_SLIP_R dlvSlipR = getFirstDlvSlipCache(r.getString("ship_dlv_slip_no"));
				
				if (!isNull(dlvSlipR) && r.ac_dt().lt(dlvSlipR.ac_dt())) {
					msgL.add(new MCMessage(r, Chk01_DtlR.$ac_dt, MSBEL1067, toYMDString(dlvSlipR.ac_dt()), toYMDString(r.ac_dt()), toDispGUIIndex(r)));
				}
			}
			
			return msgL;
		}

		/**
		 * 	承認状況チェック
		 * @return
		 */
		protected MCMessageList checkAprvSts(Chk01_DtlR r) {
			MCMessageList msgL = new MCMessageList();

			if (isSlsDscnt(r.trd_ptn_typ()) && r.aprv_flg()) {

				if (!MAC_APRV_STS_TYP.isACPT(r.aprv_sts_typ())) {
					msgL.add(new mcframe.commonCore.notice.MCMessage(r,
							Chk01_DtlR.$aprv_sts_typ, MSBBL0126, r.sls_act_no(),
							toDispGUIIndex(r)));
				}
			}

			return msgL;
		}
		/**
		 * 売上締チェック
		 * 
		 * @param r
		 * @return
		 */
		protected MCMessageList checkSlsCl(Chk01_DtlR r) {
			MCMessageList msgL = new MCMessageList();

			MCDate acYm = getAcYm(r.bef_ac_dt());
			if (!acYm.lte(MSUCL_ClUtil.getSlsClYm())) {
				if (!isSame(r.sls_dpt_cd(), r.bef_sls_dpt_cd())
						|| !isSame(r.sls_usr_cd(), r.bef_sls_usr_cd())
						|| !isSame(r.ac_dt(), r.bef_ac_dt())) {
					msgL.add(new MCMessage(r, null, MSBBL0304, toYMDString(r.bef_ac_dt()), toDispGUIIndex(r)));
				}
			}
			
			return msgL;
		}

		/**
		 * 	キャッシュから排他ロックで獲得したDBコンテナに対して上り電文の値をコピー（補完）する<br>
		 * 	Upd01オペレーションにて更新サービスの上り電文は、画面からの上り電文ではなくDBコンテナを元にして作成する<br>
		 * 	∵ 同一インボイスNo または 売上実績Noの明細を拾い上げてまとめて更新するため、更新対象が電文に存在しない場合もあるため
		 * @param chkL
		 */
		protected void compSub(MCList<Chk01_DtlR> chkL) {

			MCIndexKey idxkeyUpByActNo = chkL.createIndex(Chk01_DtlR.$sls_act_no);
			MCIndexKey idxkeyUpByActDNo = chkL.createIndex(Chk01_DtlR.$sls_act_d_no);
			MCNumber chkGrpNo = chkL.get(0).chk_grp_no();

			MCList<MST_SLS_ACT_R> grpSlsActL = getSlsActCache(chkGrpNo);
			MCList<MST_SLS_ACT_D_R> grpSlsActDL = getSlsActDCache(chkGrpNo);
			MCList<MST_SLS_ACT_IO_R> grpSlsActIoL = getSlsActIoCache(chkGrpNo);

			int dtlPegNo = up0().size();
			int ioPegNo = 0;
			for (MST_SLS_ACT_R slsAct : grpSlsActL) {

				Chk01_DtlR hdr = chkL.getFirst(idxkeyUpByActNo, slsAct.sls_act_no());
				if (!isNull(hdr)) {
					slsAct.ac_dt(hdr.ac_dt());
					slsAct.bill_basis_dt(hdr.bill_basis_dt());
					slsAct.rcv_schd_dt(hdr.rcv_schd_dt());
					slsAct.sls_usr_cd(hdr.sls_usr_cd());
					slsAct.sls_dpt_cd(hdr.sls_dpt_cd());
					slsAct.ar_dpt_cd(hdr.ar_dpt_cd());
					slsAct.xrate(hdr.xrate());
					slsAct.trd_rmrks(hdr.trd_rmrks());
					slsAct.intr_rmrks(hdr.intr_rmrks());
					slsAct.sub_char1(hdr.sub_char1());
					slsAct.sub_char2(hdr.sub_char2());
					slsAct.sub_char3(hdr.sub_char3());
					slsAct.setBooleanNE(SlsAct_Upd01_HdrR.$dlv_slip_prnt_flg,
							hdr.prnt_out_flg());
					slsAct.setNumberNE(SlsAct_Upd01_HdrR.$hdr_peg_no, hdr.peg_no());
					slsAct.setBooleanNE(SlsAct_Upd01_HdrR.$ship_act_service_exec_flg, false);
					slsAct.setDateNE(SlsAct_Upd01_HdrR.$can_ac_dt, hdr.can_ac_dt());
					slsAct.wg_cd(hdr.wg_cd());
				}
				else {
					// 上り電文に存在しない実績情報は紐付けＮＯを設定
					slsAct.setNumberNE(SlsAct_Upd01_DtlR.$hdr_peg_no, nextPegNo());
					slsAct.setBooleanNE(SlsAct_Upd01_HdrR.$ship_act_service_exec_flg, false);
				}

				// 紐づく明細も同様に補完
				for (MST_SLS_ACT_D_R slsActD : grpSlsActDL.subList(
						Chk01_DtlR.$sls_act_no, slsAct.sls_act_no())) {

					Chk01_DtlR dtl = chkL.getFirst(idxkeyUpByActDNo,
							slsActD.sls_act_d_no());
					if (!isNull(dtl)) {
						slsActD.trd_cur_upri(dtl.trd_cur_upri());
						slsActD.base_cur_upri(dtl.base_cur_upri());
						slsActD.base_cur_amt(dtl.base_cur_amt());
						slsActD.base_cur_tax_amt(dtl.base_cur_tax_amt());
						slsActD.base_cur_dscnt_amt(dtl.base_cur_dscnt_amt());
						slsActD.ptax_cur_upri(dtl.ptax_cur_upri());
						slsActD.ptax_cur_amt(dtl.ptax_cur_amt());
						slsActD.ptax_cur_tax_amt(dtl.ptax_cur_tax_amt());
						slsActD.ptax_cur_dscnt_amt(dtl.ptax_cur_dscnt_amt());
						slsActD.interim_flg(dtl.interim_flg());
						slsActD.tax_cd(dtl.tax_cd());
						slsActD.setBooleanNE(Chk01_DtlR.$inc_tax_flg, dtl.inc_tax_flg());
						slsActD.setNumberNE(Chk01_DtlR.$tax_rate, dtl.tax_rate());
						slsActD.setStringNE(Chk01_DtlR.$tax_typ, dtl.tax_typ());
						slsActD.trd_cur_amt(dtl.trd_cur_amt());
						slsActD.trd_cur_tax_amt(dtl.trd_cur_tax_amt());
						slsActD.bill_crryovr_times(dtl.bill_crryovr_times());
						slsActD.trd_d_rmrks(dtl.trd_d_rmrks());
						slsActD.intr_rmrks(dtl.intr_d_rmrks());
						slsActD.rsn_cd(dtl.biz_rsn_cd());
						slsActD.bd_dpt_cd(dtl.bd_dpt_cd());
						slsActD.wtax_rate(dtl.wtax_rate());
						slsActD.sub_char1(dtl.dtl_sub_char1());
						slsActD.sub_char2(dtl.dtl_sub_char2());
						slsActD.sub_char3(dtl.dtl_sub_char3());
						slsActD.setDateNE(Chk01_DtlR.$can_ac_dt, dtl.can_ac_dt());
						slsActD.trd_cur_dscnt_amt(dtl.trd_cur_dscnt_amt());
						slsActD.dscnt_rsn_cd(dtl.dscnt_rsn_cd());
						slsActD.cost_upri(dtl.sls_cost_upri());
						slsActD.cost_amt(MSUCL_SlsUtil.getCostAmt(dtl.sls_cost_upri(), slsActD.base_unit_qty(), getBaseCur().amt_dec_place())); //原価金額
						slsActD.setNumberNE(SlsAct_Upd01_DtlR.$dtl_peg_no, dtl.peg_no());
						slsActD.base_sls_ac_dt(dtl.base_sls_ac_dt());
						slsActD.setAttributes(dtl);
					}
					else {
						slsActD.setNumberNE(SlsAct_Upd01_DtlR.$dtl_peg_no, dtlPegNo++);
					}
					slsActD.setNumberNE(SlsAct_Upd01_DtlR.$hdr_peg_no,
							slsAct.getNumber(SlsAct_Upd01_DtlR.$hdr_peg_no));

					// 紐づく受払も同様に補完
					for (MST_SLS_ACT_IO_R slsActIo : grpSlsActIoL.subList(
							Chk01_DtlR.$sls_act_d_no, slsActD.sls_act_d_no())) {
						slsActIo.setNumberNE(SlsAct_Upd01_IoR.$hdr_peg_no,
								slsAct.getNumberNE(SlsAct_Upd01_DtlR.$hdr_peg_no));
						slsActIo.setNumberNE(SlsAct_Upd01_IoR.$dtl_peg_no,
								slsActD.getNumberNE(SlsAct_Upd01_DtlR.$dtl_peg_no));
						slsActIo.setNumberNE(SlsAct_Upd01_IoR.$io_peg_no, ioPegNo++);
					}
					
					if (isSls(slsAct.trd_ptn_typ())
						// 仕入直送 または インボイス取引以外の出荷基準売上の場合、出荷実績サービスを実行対象とする
						&& (!isNull(slsActD.purc_ddlv_po_no()) 
								|| (!hdr.cst_iv_flg() && MAC_SLS_BASIS_TYP.isSHIP_BASIS(slsAct.sls_basis_typ())))
						&& !MAC_TRD_PTN_TYP.isSLS_CNSGN(slsAct.trd_ptn_typ())
						&& (grpSlsActDL.subList(Chk01_DtlR.$sls_act_no, slsAct.sls_act_no()).subList("sls_cststk_flg", true).size() == 0)
						&& !slsAct.getBooleanNE(SlsAct_Upd01_HdrR.$ship_act_service_exec_flg)) {
						slsAct.setBooleanNE(SlsAct_Upd01_HdrR.$ship_act_service_exec_flg, true);
					}
				}
			}
		}

		/**
		 * 	チェックＧＲＰＮＯ単位のすべてのレコードのエラーＦＬＧをオンにする
		 * @param chkL
		 */
		protected MCMessageList setErrChkGrp(MCList<Chk01_DtlR> chkL) {

			MCMessageList msgL = new MCMessageList();

			Chk01_DtlR errDtl = chkL.getFirst(Chk01_DtlR.$err_flg, true);

			for (Chk01_DtlR r : chkL) {
				if (!r.err_flg()) {
					// 関連する行でエラーになりました。\nエラー行：{1}\n関連する行：{2}
					msgL.add(new MCMessage(r, null, MAUDL0013, toDispGUIIndex(r),
							toDispGUIIndex(errDtl)));
					r.err_flg(true);
				}
			}
			return msgL;
		}

		protected void setDown() {
			down0().addAll(up0());
		}

		/**
		 * 売上伝票か判定する<br>
		 * @param trdPtnTyp 取引パタン区分
		 * @return 取引パタン区分が「売上」「貸出売上」の場合true / 左記以外はfalse
		 */
		protected boolean isSls(String trdPtnTyp) {
			return (MAC_TRD_PTN_TYP.isSLS(trdPtnTyp) || MAC_TRD_PTN_TYP
					.isSLS_CNSGN(trdPtnTyp));
		}

		/**
		 * 売上返品伝票か判定する<br>
		 * @param trdPtnTyp 取引パタン区分
		 * @return 取引パタン区分が「売上返品」の場合true / 左記以外はfalse
		 */
		protected boolean isSlsRtn(String trdPtnTyp) {
			return MAC_TRD_PTN_TYP.isSLS_RTN(trdPtnTyp);
		}

		/**
		 * 売上値引伝票か判定する<br>
		 * @param trdPtnTyp 取引パタン区分
		 * @return　取引パタン区分が「売上値引」「売上値増」の場合true / 左記以外はfalse
		 */
		protected boolean isSlsDscnt(String trdPtnTyp) {
			return MAC_TRD_PTN_TYP.isSLS_DSCNT(trdPtnTyp)
					|| MAC_TRD_PTN_TYP.isSLS_XTRA(trdPtnTyp);
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 売上実績情報の訂正を行います。<br>
	 */
	public class Upd01 extends MSBBL_SlsDtlModReg_MC_A.Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				dbTran().commit();
				handleSuccess(chk01_down0);
			}
			catch (Exception e) {
				rollbackMessagePool();
				handleEx(e, chk01_down0);
			}
			finally {
				setDown();
			}
		}

		protected void setDown() {
			down0().setAll(chk01_down0);
		}

		@Override
		protected void doIt() {

			// 上り電文の編集
			editUp();

			// チェックオペレーションの呼び出し
			callThisChk01();
			
			// 更新処理でメッセージプールが追加された後に例外となった際に元に戻すための設定
			saveMessagePool();

			MCList<Chk01_DtlR> notErrL = chk01_down0.subList(Chk01_DtlR.$err_flg, false);
			if (!notErrL.isEmpty()) {
				// 売上実績サービス呼出
				callSlsActSvUpd01(notErrL);

				// 受払実績サービス呼出
				callIoActSvUpd01();
			}

			// 下り電文の設定
			setDown();
		}

		protected void editUp() {
			up0().sort(Chk01_DtlR.$iv_no, Chk01_DtlR.$sls_act_no);
			setPegNo(up0());

			/**
			 * チェックＧＲＰＮＯの設定
			 * チェックＧＲＰＮＯは、チェック処理単位をグルーピングするため揮発性ＮＯ (チェック処理単位で１レコードでもエラーがあれば、チェック単位すべてをエラーにする目的）
			 * チェック単位は以下のとおり
			 * 	1.インボイスＮＯ単位　(iv_noがnull以外の実績。 iv_noに対して売上実績が1:Nの関係となる)
			 * 	2.売上実績ＮＯ単位  (iv_noがnullの実績)
			 * 分割実単位も上記単位で分割済の前提
			 */
			MCList<Chk01_DtlR>[] ivNoGrpL = up0().groupList(Chk01_DtlR.$iv_no);
			int i = 0;
			for (MCList<Chk01_DtlR> ivNoL : ivNoGrpL) {
				if (!isNullOrNullVal(ivNoL.get(0).iv_no())) {
					ivNoL.setNumber(Chk01_DtlR.$chk_grp_no, i++);
				}
				else {
					MCList<Chk01_DtlR>[] slsActNoGrpL = ivNoL
							.groupList(Chk01_DtlR.$sls_act_no);
					for (MCList<Chk01_DtlR> slsActNoL : slsActNoGrpL) {
						slsActNoL.setNumber(Chk01_DtlR.$chk_grp_no, i++);
					}
				}
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			mapUpContainers(CALL_OPE);
			chk01.call();
		}

		protected void handleSuccess(MCList<Chk01_DtlR> l) {
			for (Chk01_DtlR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected void handleEx(Exception e, MCList<Chk01_DtlR> l) {
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
			for (Chk01_DtlR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		/**
		 * 	売上実績サービスの呼出
		 */
		protected void callSlsActSvUpd01(MCList<Chk01_DtlR> notErrL) {

			MSBBL_SlsActService.SlsAct_Upd01 ope = MSBBL_SlsActService.crtSlsAct_Upd01();

			for (MCList<Chk01_DtlR> chkGrpL : notErrL.groupList(Chk01_DtlR.$chk_grp_no)) {

				MCNumber chkGrpNo = chkGrpL.get(0).chk_grp_no();
				addAll(ope.up0(), getSlsActCache(chkGrpNo),
						createMap_SlsAct_Upd01_HdrR_MST_SLS_ACT_R());
				addAll(ope.up1(), getSlsActDCache(chkGrpNo),
						createMap_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R());
				addAll(ope.up2(), getSlsActIoCache(chkGrpNo),
						createMap_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R());
				
			}

			ope.up3().indiv_prnt_flg(up1().indiv_prnt_flg());
			ope.exec();

			MCIndexKey down0Key = ope.down0().createIndex(SlsAct_Upd01_RsltR.$hdr_peg_no);
			MCIndexKey down1Key = ope.down1().createIndex(SlsAct_Upd01_Rslt_DtlR.$dtl_peg_no);
			for (Chk01_DtlR notErrR : notErrL) {
				SlsAct_Upd01_Rslt_DtlR down1R = ope.down1().getFirst(down1Key, notErrR.peg_no());
				SlsAct_Upd01_RsltR down0R = ope.down0().getFirst(down0Key, down1R.hdr_peg_no());
				notErrR.sls_act_no(down0R.sls_act_no());
				notErrR.sls_act_rev(down0R.sls_act_rev());
				notErrR.dlv_slip_no(down0R.dlv_slip_no());
				notErrR.iv_no(down0R.iv_no());
				notErrR.sls_act_d_no(down1R.sls_act_d_no());
			}
		}

		/**
		 * 	受払実績サービスの呼出
		 */
		protected void callIoActSvUpd01() {

			// 上り電文なし。callするだけ
			MSBEL_IoActService.crtIoAct_Upd01().exec();
		}

		// 分割実行制御
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@SuppressWarnings("unchecked")
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();

			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>) ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * インボイスＮＯ、もしくは売上実績ＮＯが同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk01_DtlR>> splitUp(MCList<Chk01_DtlR> list, int max) {
			List<MCList<Chk01_DtlR>> ret = new ArrayList<>();
			MCList<Chk01_DtlR> tmp = MCList.create(Chk01_DtlR.class);
			MCIndexKey idxKeyUp = list.createIndex(Chk01_DtlR.$sls_act_no, Chk01_DtlR.$sls_act_seq);
			MCList<MST_SLS_ACT_R> slsActL = selectSlsAct(list);

			for(MST_SLS_ACT_R slsActR : slsActL) {
				MCList<Chk01_DtlR> sublist = list.subList(idxKeyUp, slsActR.sls_act_no(), slsActR.sls_act_seq());
				sublist.addStringColumn(MST_SLS_ACT_R.$cred_cd, slsActR.cred_cd());
				sublist.addStringColumn(MST_SLS_ACT_R.$bcst_cd, slsActR.bcst_cd());
			}

			// 与信管理先ＣＤ
			MCList<Chk01_DtlR>[] credCdGrpL = list
					.groupList(MST_SLS_ACT_R.$cred_cd);
			for (MCList<Chk01_DtlR> credCdL : credCdGrpL) {
				if (!isNull(credCdL.get(0).getString(MST_SLS_ACT_R.$cred_cd))) {
					if (tmp.size() >= max) {
						ret.add(tmp);
						tmp = MCList.create(Chk01_DtlR.class);
					}
					tmp.addAll(credCdL);
				}
				else {
					// 与信管理先ＣＤがなければ請求先ＣＤ
					MCList<Chk01_DtlR>[] bcstCdGrpL = credCdL
							.groupList(MST_SLS_ACT_R.$bcst_cd);
					for (MCList<Chk01_DtlR> bcstCdL : bcstCdGrpL) {
						if (tmp.size() >= max) {
							ret.add(tmp);
							tmp = MCList.create(Chk01_DtlR.class);
						}
						tmp.addAll(bcstCdL);
					}
				}
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}
	
		protected MCList<MST_SLS_ACT_R> selectSlsAct(MCList<Chk01_DtlR> list) {
			MCList<MST_SLS_ACT_R> slsActL = MCList.create(MST_SLS_ACT_R.class);
			for(Chk01_DtlR r : list.groupBy(Chk01_DtlR.$sls_act_no, Chk01_DtlR.$sls_act_seq)) {
				MST_SLS_ACT_R slsActR = slsActL.add();
				slsActR.sls_act_no(r.sls_act_no());
				slsActR.sls_act_seq(r.sls_act_seq());
			}

			MST_SLS_ACT_R slsActL_t = MST_SLS_ACT_R.create("T");
			MCQueryApiBuilder slsActL_bldr = MCQueryApiBuilder.create(slsActL_t);
			MSW_SLS_ACT_KEY_R wk = MSW_SLS_ACT_KEY_R.create("WK");
			dbWkDelete("MSBBL1370_MSW_SLS_ACT_D01", slsActL_bldr.getBaseDbc());
			dbWkInsert("MSBBL1370_MSW_SLS_ACT_I01", slsActL, slsActL_bldr.getBaseDbc());

			slsActL_bldr.setSelect(slsActL_t.sls_act_no, slsActL_t.sls_act_seq,
					slsActL_t.cred_cd, slsActL_t.bcst_cd);
			slsActL_bldr.addInnerJoin(wk,
					bracket(value(0).eq(value(0))
							.and(slsActL_t.sls_act_no.eq(wk.sls_act_no))
							.and(slsActL_t.sls_act_seq.eq(wk.sls_act_seq))));
			dbSelect("MSBBL1370_MST_SLS_ACT_S02", slsActL, slsActL_bldr);
			return slsActL;
		}

		/**
		 * 	売上実績ヘッダDBコンテナ(MST_SLS_ACT_R) -> 売上実績サービス.上り電文(SlsAct_Upd01_HdrR)
		 * @return
		 */
		protected Map_SlsAct_Upd01_HdrR_MST_SLS_ACT_R<SlsAct_Upd01_HdrR, MST_SLS_ACT_R> createMap_SlsAct_Upd01_HdrR_MST_SLS_ACT_R() {
			return new Map_SlsAct_Upd01_HdrR_MST_SLS_ACT_R<SlsAct_Upd01_HdrR, MST_SLS_ACT_R>();
		}

		public class Map_SlsAct_Upd01_HdrR_MST_SLS_ACT_R<D extends SlsAct_Upd01_HdrR, S extends MST_SLS_ACT_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_HdrR.$hdr_peg_no,
						SlsAct_Upd01_HdrR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_no, MST_SLS_ACT_R.$sls_act_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_seq,
						MST_SLS_ACT_R.$sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_rev,
						MST_SLS_ACT_R.$sls_act_rev);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cd, MST_SLS_ACT_R.$trd_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_ptn_typ,
						MST_SLS_ACT_R.$trd_ptn_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ac_dt, MST_SLS_ACT_R.$ac_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$can_ac_dt,
						SlsAct_Upd01_HdrR.$can_ac_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_usr_cd, MST_SLS_ACT_R.$sls_usr_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dpt_cd, MST_SLS_ACT_R.$sls_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$wg_cd, MST_SLS_ACT_R.$wg_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dt, MST_SLS_ACT_R.$sls_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_tm, MST_SLS_ACT_R.$ship_tm);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_tm, MST_SLS_ACT_R.$dlv_tm);
				addColumnPathMap(SlsAct_Upd01_HdrR.$eta_dt, SlsAct_Upd01_HdrR.$eta_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_cd, MST_SLS_ACT_R.$cst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$iv_no, MST_SLS_ACT_R.$iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ref_iv_no, MST_SLS_ACT_R.$ref_iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcpt_iv_mng_no,
						MST_SLS_ACT_R.$rcpt_iv_mng_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcpt_iv_no, MST_SLS_ACT_R.$rcpt_iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd1, MST_SLS_ACT_R.$tterm_cd1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks1,
						MST_SLS_ACT_R.$tterm_rmrks1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd2, MST_SLS_ACT_R.$tterm_cd2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks2,
						MST_SLS_ACT_R.$tterm_rmrks2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd3, MST_SLS_ACT_R.$tterm_cd3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks3,
						MST_SLS_ACT_R.$tterm_rmrks3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_no, MST_SLS_ACT_R.$lc_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_dt, MST_SLS_ACT_R.$lc_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_rmrks, MST_SLS_ACT_R.$lc_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcv_schd_dt,
						MST_SLS_ACT_R.$rcv_schd_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bill_basis_dt,
						MST_SLS_ACT_R.$bill_basis_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cred_cd, MST_SLS_ACT_R.$cred_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bcst_cd, MST_SLS_ACT_R.$bcst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$acst_cd, MST_SLS_ACT_R.$acst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ar_dpt_cd, MST_SLS_ACT_R.$ar_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_po_no, MST_SLS_ACT_R.$cst_po_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cur_cd, MST_SLS_ACT_R.$trd_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$base_cur_cd,
						MST_SLS_ACT_R.$base_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate_cd, MST_SLS_ACT_R.$xrate_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate, MST_SLS_ACT_R.$xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_cur_cd,
						MST_SLS_ACT_R.$ptax_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_xrate, MST_SLS_ACT_R.$ptax_xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_rmrks, MST_SLS_ACT_R.$trd_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$intr_rmrks, MST_SLS_ACT_R.$intr_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_act_no,
						MST_SLS_ACT_R.$ship_act_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$slo_no, MST_SLS_ACT_R.$slo_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_ret_schd_no,
						MST_SLS_ACT_R.$sls_ret_schd_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_no, MST_SLS_ACT_R.$qtn_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_rev, MST_SLS_ACT_R.$qtn_rev);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_slip_no,
						MST_SLS_ACT_R.$dlv_slip_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_flg, MST_SLS_ACT_R.$aprv_flg);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_no, MST_SLS_ACT_R.$aprv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_sts_typ,
						MST_SLS_ACT_R.$aprv_sts_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_basis_typ,
						MST_SLS_ACT_R.$sls_basis_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$adjst_tgt_dt,
						MST_SLS_ACT_R.$adjst_tgt_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_adjst_typ,
						MST_SLS_ACT_R.$sls_adjst_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$adjst_mtd_typ,
						MST_SLS_ACT_R.$adjst_mtd_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char1, MST_SLS_ACT_R.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char2, MST_SLS_ACT_R.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char3, MST_SLS_ACT_R.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_slip_prnt_flg,
						SlsAct_Upd01_HdrR.$dlv_slip_prnt_flg);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_act_service_exec_flg,
						SlsAct_Upd01_HdrR.$ship_act_service_exec_flg);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_dlv_slip_no, MST_SLS_ACT_R.$ship_dlv_slip_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				dest.sls_dtl_mod_flg(true);
				
				if (src.getBooleanNE(MAM_BP_R.$cst_iv_flg)) {
					dest.dlv_slip_prnt_flg(false);
				}
				dest.amt_calc_flg(false);
			}
		}

		/**
		 * 	売上実績明細DBコンテナ(MST_SLS_ACT_D_R) -> 売上実績サービス.上り電文(SlsAct_Upd01_DtlR)
		 * @return
		 */
		protected Map_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R<SlsAct_Upd01_DtlR, MST_SLS_ACT_D_R> createMap_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R() {
			return new Map_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R<SlsAct_Upd01_DtlR, MST_SLS_ACT_D_R>();
		}

		public class Map_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R<D extends SlsAct_Upd01_DtlR, S extends MST_SLS_ACT_D_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_DtlR.$hdr_peg_no,
						SlsAct_Upd01_DtlR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dtl_peg_no,
						SlsAct_Upd01_DtlR.$dtl_peg_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_no,
						MST_SLS_ACT_D_R.$sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_seq,
						MST_SLS_ACT_D_R.$sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$disp_seq, MST_SLS_ACT_D_R.$disp_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cd, MST_SLS_ACT_D_R.$dlv_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_sundry_flg,
						MST_SLS_ACT_D_R.$dlv_sundry_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_nm, MST_SLS_ACT_D_R.$dlv_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_zip_cd,
						MST_SLS_ACT_D_R.$dlv_zip_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr1, MST_SLS_ACT_D_R.$dlv_addr1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr2, MST_SLS_ACT_D_R.$dlv_addr2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr3, MST_SLS_ACT_D_R.$dlv_addr3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr4, MST_SLS_ACT_D_R.$dlv_addr4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_dpt,
						MST_SLS_ACT_D_R.$dlv_cntct_dpt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_psn,
						MST_SLS_ACT_D_R.$dlv_cntct_psn);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_tel, MST_SLS_ACT_D_R.$dlv_tel);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_fax, MST_SLS_ACT_D_R.$dlv_fax);
				addColumnPathMap(SlsAct_Upd01_DtlR.$pri_prnt_flg,
						MST_SLS_ACT_D_R.$pri_prnt_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd1, MST_SLS_ACT_D_R.$dest_cd1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd2, MST_SLS_ACT_D_R.$dest_cd2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd3, MST_SLS_ACT_D_R.$dest_cd3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cd, MST_SLS_ACT_D_R.$tdlv_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_sundry_flg,
						MST_SLS_ACT_D_R.$tdlv_sundry_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_nm, MST_SLS_ACT_D_R.$tdlv_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_zip_cd,
						MST_SLS_ACT_D_R.$tdlv_zip_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr1,
						MST_SLS_ACT_D_R.$tdlv_addr1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr2,
						MST_SLS_ACT_D_R.$tdlv_addr2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr3,
						MST_SLS_ACT_D_R.$tdlv_addr3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr4,
						MST_SLS_ACT_D_R.$tdlv_addr4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_tel, MST_SLS_ACT_D_R.$tdlv_tel);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_fax, MST_SLS_ACT_D_R.$tdlv_fax);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cntct_dpt, MST_SLS_ACT_D_R.$tdlv_cntct_dpt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cntct_psn, MST_SLS_ACT_D_R.$tdlv_cntct_psn);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_cd, MST_SLS_ACT_D_R.$itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub1, MST_SLS_ACT_D_R.$itm_sub1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub2, MST_SLS_ACT_D_R.$itm_sub2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub3, MST_SLS_ACT_D_R.$itm_sub3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1, MST_SLS_ACT_D_R.$sno1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2, MST_SLS_ACT_D_R.$sno2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3, MST_SLS_ACT_D_R.$sno3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4, MST_SLS_ACT_D_R.$sno4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_nm, MST_SLS_ACT_D_R.$itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$iv_itm_nm, MST_SLS_ACT_D_R.$iv_itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cntry_org_cd,
						MST_SLS_ACT_D_R.$cntry_org_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$loc_cd, MST_SLS_ACT_D_R.$loc_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$str_ln_cd, MST_SLS_ACT_D_R.$str_ln_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$lot_no, MST_SLS_ACT_D_R.$lot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sublot_no, MST_SLS_ACT_D_R.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$gd_cd, MST_SLS_ACT_D_R.$gd_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_cd,
						MST_SLS_ACT_D_R.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_qty,
						MST_SLS_ACT_D_R.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_cd,
						MST_SLS_ACT_D_R.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_qty,
						MST_SLS_ACT_D_R.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_upri,
						MST_SLS_ACT_D_R.$trd_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_amt,
						MST_SLS_ACT_D_R.$trd_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_upri, MST_SLS_ACT_D_R.$base_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_amt, MST_SLS_ACT_D_R.$base_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_tax_amt, MST_SLS_ACT_D_R.$base_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_dscnt_amt, MST_SLS_ACT_D_R.$base_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_upri, MST_SLS_ACT_D_R.$ptax_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_amt, MST_SLS_ACT_D_R.$ptax_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_tax_amt, MST_SLS_ACT_D_R.$ptax_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_dscnt_amt, MST_SLS_ACT_D_R.$ptax_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$upri_not_tgt_flg,
						MST_SLS_ACT_D_R.$upri_not_tgt_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$interim_flg,
						MST_SLS_ACT_D_R.$interim_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_cd, MST_SLS_ACT_D_R.$tax_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$inc_tax_flg,
						SlsAct_Upd01_DtlR.$inc_tax_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_rate, SlsAct_Upd01_DtlR.$tax_rate);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_typ, SlsAct_Upd01_DtlR.$tax_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_tax_amt,
						MST_SLS_ACT_D_R.$trd_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cost_upri, MST_SLS_ACT_D_R.$cost_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_dscnt_amt,
						MST_SLS_ACT_D_R.$trd_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bill_crryovr_times,
						MST_SLS_ACT_D_R.$bill_crryovr_times);
				addColumnPathMap(SlsAct_Upd01_DtlR.$stk_mng_typ,
						MST_SLS_ACT_D_R.$stk_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sundry_itm_flg,
						MST_SLS_ACT_D_R.$sundry_itm_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1_mng_typ,
						MST_SLS_ACT_D_R.$sno1_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2_mng_typ,
						MST_SLS_ACT_D_R.$sno2_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3_mng_typ,
						MST_SLS_ACT_D_R.$sno3_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4_mng_typ,
						MST_SLS_ACT_D_R.$sno4_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_jnl_cd,
						SlsAct_Upd01_DtlR.$itm_jnl_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_po_d_no,
						MST_SLS_ACT_D_R.$cst_po_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_cd,
						MST_SLS_ACT_D_R.$cst_itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_nm,
						MST_SLS_ACT_D_R.$cst_itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_d_rmrks,
						MST_SLS_ACT_D_R.$trd_d_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$intr_rmrks,
						MST_SLS_ACT_D_R.$intr_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$rsn_cd, MST_SLS_ACT_D_R.$rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bd_dpt_cd, MST_SLS_ACT_D_R.$bd_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_rate, MST_SLS_ACT_D_R.$wtax_rate);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_amt, MST_SLS_ACT_D_R.$wtax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_no, MST_SLS_ACT_D_R.$slo_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_d_no, MST_SLS_ACT_D_R.$slo_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_ret_schd_no,
						MST_SLS_ACT_D_R.$sls_ret_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_ret_schd_d_no,
						MST_SLS_ACT_D_R.$sls_ret_schd_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_schd_no,
						MST_SLS_ACT_D_R.$ship_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_schd_no,
						MST_SLS_ACT_D_R.$sls_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_no, MST_SLS_ACT_D_R.$qtn_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_rev, MST_SLS_ACT_D_R.$qtn_rev);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_d_no, MST_SLS_ACT_D_R.$qtn_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_no,
						MST_SLS_ACT_D_R.$purc_ddlv_po_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_d_no,
						MST_SLS_ACT_D_R.$purc_ddlv_po_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_no,
						MST_SLS_ACT_D_R.$purc_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_d_no,
						MST_SLS_ACT_D_R.$purc_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$iv_d_no, MST_SLS_ACT_D_R.$iv_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char1, MST_SLS_ACT_D_R.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char2, MST_SLS_ACT_D_R.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char3, MST_SLS_ACT_D_R.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dscnt_rsn_cd,
						MST_SLS_ACT_D_R.$dscnt_rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_no,
						MST_SLS_ACT_D_R.$ref_sls_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_seq,
						MST_SLS_ACT_D_R.$ref_sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_d_no,
						MST_SLS_ACT_D_R.$ref_sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_d_seq,
						MST_SLS_ACT_D_R.$ref_sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_slip_d_no,
						MST_SLS_ACT_D_R.$dlv_slip_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cost_upri,
						MST_SLS_ACT_D_R.$cost_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cost_amt,
						MST_SLS_ACT_D_R.$cost_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_dlv_slip_d_no, MST_SLS_ACT_D_R.$ship_dlv_slip_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_dlv_slip_multi_flg, MST_SLS_ACT_D_R.$ship_dlv_slip_multi_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ext_sys_cd,
						MST_SLS_ACT_D_R.$ext_sys_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ext_purc_act_d_no,
						MST_SLS_ACT_D_R.$ext_purc_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_sls_ac_dt,
						MST_SLS_ACT_D_R.$base_sls_ac_dt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				dest.sls_schd_abort_flg(src.getBooleanNE("abort_flg"));
			}
		}

		/**
		 * 	売上実績受払DBコンテナ(MST_SLS_ACT_IO_R) -> 売上実績サービス.上り電文(SlsAct_Upd01_IoR)
		 * @return
		 */
		protected Map_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R<SlsAct_Upd01_IoR, MST_SLS_ACT_IO_R> createMap_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R() {
			return new Map_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R<SlsAct_Upd01_IoR, MST_SLS_ACT_IO_R>();
		}

		public class Map_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R<D extends SlsAct_Upd01_IoR, S extends MST_SLS_ACT_IO_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_IoR.$hdr_peg_no,
						SlsAct_Upd01_IoR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$dtl_peg_no,
						SlsAct_Upd01_IoR.$dtl_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$io_peg_no, SlsAct_Upd01_IoR.$io_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_no,
						MST_SLS_ACT_IO_R.$sls_act_io_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_seq,
						MST_SLS_ACT_IO_R.$sls_act_io_seq);
				addColumnPathMap(SlsAct_Upd01_IoR.$ship_act_d_no,
						MST_SLS_ACT_IO_R.$ship_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$iv_ship_act_d_no,
						MST_SLS_ACT_IO_R.$iv_ship_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$arr_act_no,
						MST_SLS_ACT_IO_R.$arr_act_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$purc_act_io_no,
						MST_SLS_ACT_IO_R.$purc_act_io_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno1, MST_SLS_ACT_IO_R.$sno1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno2, MST_SLS_ACT_IO_R.$sno2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno3, MST_SLS_ACT_IO_R.$sno3);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno4, MST_SLS_ACT_IO_R.$sno4);
				addColumnPathMap(SlsAct_Upd01_IoR.$gd_cd, MST_SLS_ACT_IO_R.$gd_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$loc_cd, MST_SLS_ACT_IO_R.$loc_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$str_ln_cd, MST_SLS_ACT_IO_R.$str_ln_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$lot_no, MST_SLS_ACT_IO_R.$lot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sublot_no, MST_SLS_ACT_IO_R.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_cd,
						MST_SLS_ACT_IO_R.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_qty,
						MST_SLS_ACT_IO_R.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_cd,
						MST_SLS_ACT_IO_R.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_qty,
						MST_SLS_ACT_IO_R.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_cd,
						MST_SLS_ACT_IO_R.$pack_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_qty,
						MST_SLS_ACT_IO_R.$pack_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char1, MST_SLS_ACT_IO_R.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char2, MST_SLS_ACT_IO_R.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char3, MST_SLS_ACT_IO_R.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_IoR.$sync_flg, MST_SLS_ACT_IO_R.$sync_flg);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}

		}
	}

	protected static final Class<MSBBL_SlsDtlModReg> CLAZZ = MSBBL_SlsDtlModReg.class;

	/**
	 * 売上実績キャッシュ <br>
	 * 
	 */
	protected FXUCL_Cache<MCList<MST_SLS_ACT_R>> _cacheSlsActL = new FXUCL_Cache<>();

	protected static void putCacheSlsAct(MCNumber chkGrpNo,
			MCList<MST_SLS_ACT_R> tar) {
		object(CLAZZ)._putCacheSlsAct(chkGrpNo, tar);
	}

	protected void _putCacheSlsAct(MCNumber chkGrpNo, MCList<MST_SLS_ACT_R> tar) {
		Comparable<?>[] key = new Comparable<?>[] {
			chkGrpNo
		};
		_cacheSlsActL.putCache(key, tar);
	}

	protected static MCList<MST_SLS_ACT_R> getSlsActCache(MCNumber chkGrpNo) {
		return object(CLAZZ)._cacheSlsActL.getCache(chkGrpNo);
	}

	/**
	 * 	売上実績明細キャッシュ
	 */
	protected FXUCL_Cache<MCList<MST_SLS_ACT_D_R>> _cacheSlsActDL = new FXUCL_Cache<>();

	protected static void putCacheSlsActDL(MCNumber chkGrpNo,
			MCList<MST_SLS_ACT_D_R> tar) {
		object(CLAZZ)._putCacheSlsActDL(chkGrpNo, tar);
	}

	protected void _putCacheSlsActDL(MCNumber chkGrpNo,
			MCList<MST_SLS_ACT_D_R> tar) {
		Comparable<?>[] key = new Comparable<?>[] {
			chkGrpNo
		};
		_cacheSlsActDL.putCache(key, tar);
	}

	protected static MCList<MST_SLS_ACT_D_R> getSlsActDCache(MCNumber chkGrpNo) {
		return object(CLAZZ)._cacheSlsActDL.getCache(chkGrpNo);
	}

	/**
	 * 	売上実績受払キャッシュ
	 */
	protected FXUCL_Cache<MCList<MST_SLS_ACT_IO_R>> _cacheSlsActIoL = new FXUCL_Cache<>();

	protected static void putCacheSlsActIoL(MCNumber chkGrpNo,
			MCList<MST_SLS_ACT_IO_R> tar) {
		object(CLAZZ)._putCacheSlsActIoL(chkGrpNo, tar);
	}

	protected void _putCacheSlsActIoL(MCNumber chkGrpNo,
			MCList<MST_SLS_ACT_IO_R> tar) {
		Comparable<?>[] key = new Comparable<?>[] {
			chkGrpNo
		};
		_cacheSlsActIoL.putCache(key, tar);
	}

	protected MCList<MST_SLS_ACT_IO_R> getSlsActIoCache(MCNumber chkGrpNo) {
		return object(CLAZZ)._cacheSlsActIoL.getCache(chkGrpNo);
	}

	protected MCList<MST_DLV_SLIP_R> _cacheDlvSlipL = null;
	protected MCIndexKey _dlvSlipIdx = null;

	protected static void initDbcCacheDlvSlip(MCList<Chk01_DtlR> dtlL) {
		object(CLAZZ)._initDbcCacheDlvSlip(dtlL);
	}
	protected void _initDbcCacheDlvSlip(MCList<Chk01_DtlR> dtlL) {

		_cacheDlvSlipL = MCList.create(MST_DLV_SLIP_R.class);
		MST_DLV_SLIP_R dlvSlipR = MST_DLV_SLIP_R.create("SLIP");
		MST_DLV_SLIP_R w1 = MST_DLV_SLIP_R.create("SLIP_W1");
		MCQueryApiBuilder dlvSlipBldr = MCQueryApiBuilder.create(dlvSlipR);
		dlvSlipBldr.setSelect(dlvSlipR.dlv_slip_no);
		dlvSlipBldr.addSelect(dlvSlipR.ac_dt);
		dlvSlipBldr.setWhere(dlvSlipR.dlv_slip_no.eq(bind("ship_dlv_slip_no")));
		dlvSlipBldr.addWhereWithAnd(dlvSlipR.dlv_slip_seq.eq(
			subQuery()
			.select(max(w1.dlv_slip_seq))
			.from(w1)
			.where(
				w1.dlv_slip_no.eq(dlvSlipR.dlv_slip_no)
				.and(w1.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
				.and(w1.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
			)
		));
		dbSelect("MSBBL1370_MST_DLV_SLIP_S01", _cacheDlvSlipL, dlvSlipBldr, dtlL);

		_dlvSlipIdx = _cacheDlvSlipL.createIndex(MST_DLV_SLIP_R.$dlv_slip_no);
	}
	protected static MST_DLV_SLIP_R getFirstDlvSlipCache(String dlvSlipNo) {
		return object(CLAZZ)._getFirstDlvSlipCache(dlvSlipNo);
	}
	protected MST_DLV_SLIP_R _getFirstDlvSlipCache(String dlvSlipNo) {
		return _cacheDlvSlipL.getFirst(_dlvSlipIdx, dlvSlipNo);
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 単価を取得します<br>
	 */
	public class Sprt01 extends MSBBL_SlsDtlModReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editCnd();
			callSlsUpriSrch01();
		}

		protected void editCnd() {
			setPegNo(up0());
		}

		protected void callSlsUpriSrch01() {

			MABSL_SlsUpriService.SlsUpri_Sprt01 ope = MABSL_SlsUpriService
					.crtSlsUpri_Sprt01();
			ope.up0();
			addAll(ope.up0(), up0(), createMap_SlsUpri_Sprt01_DtlR_Sprt01_DtlR());
			ope.exec();
			String[] copyCols = new String[] {
				Sprt01_DtlR.$sls_upri,
				Sprt01_DtlR.$interim_flg
			};
			down0().setAll(up0());
			copyByPegNo(down0(), copyCols, ope.down0(), copyCols);
		}

		protected Map_SlsUpri_Sprt01_DtlR_Sprt01_DtlR<SlsUpri_Sprt01_DtlR, Sprt01_DtlR> createMap_SlsUpri_Sprt01_DtlR_Sprt01_DtlR() {
			return new Map_SlsUpri_Sprt01_DtlR_Sprt01_DtlR<SlsUpri_Sprt01_DtlR, Sprt01_DtlR>();
		}

		public class Map_SlsUpri_Sprt01_DtlR_Sprt01_DtlR<D extends SlsUpri_Sprt01_DtlR, S extends Sprt01_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$peg_no, Sprt01_DtlR.$peg_no);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$wg_cd, Sprt01_DtlR.$wg_cd);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_cd);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub1);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub2);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$itm_sub3, Sprt01_DtlR.$itm_sub3);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$cst_cd, Sprt01_DtlR.$cst_cd);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$dlv_cd, Sprt01_DtlR.$dlv_cd);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$dest_cd1, Sprt01_DtlR.$dest_cd1);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$dest_cd2, Sprt01_DtlR.$dest_cd2);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$dest_cd3, Sprt01_DtlR.$dest_cd3);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$unit_cd, Sprt01_DtlR.$trd_unit_cd);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$qty, Sprt01_DtlR.$trd_unit_qty);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$cur_cd, Sprt01_DtlR.$trd_cur_cd);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$dt, Sprt01_DtlR.$dt);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.sls_upri_flg(true);
				dest.grp_no(dest.peg_no().toString());
			}
		}
	}

	/**
	 * Sprt02オペレーション.<p>
	 *
	 * 為替レートを取得します<br>
	 */
	public class Sprt02 extends MSBBL_SlsDtlModReg_MC_A.Sprt02 {

		FXUCL_MCFuncCache<MCNumber> _xrateCache;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			if (_xrateCache == null) {
				_xrateCache = new FXUCL_MCFuncCache<>(in -> {
					return MAPA_XCHNG$F_GET_SLS_XRATE_NE(value((String) in[0]), value((MCDate) in[1]));
				});
			}

			for (Sprt02_DtlR r : up0()) {
				MCNumber xrate = _xrateCache.get(r.trd_cur_cd(), r.xrate_dt());
				r.xrate(xrate);
				down0().add(r);
			}
		}
	}

	/**
	 * Sprt03オペレーション.<p>
	 *
	 * 税を取得します<br>
	 */
	public class Sprt03 extends MSBBL_SlsDtlModReg_MC_A.Sprt03 {

		protected MCList<Sprt03_DtlR> _slsTax = null;
		protected MCIndexKey _slsTaxIdx = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			if (_slsTax == null) {
				getSlsTax(up0());
			}

			for (Sprt03_DtlR r : up0()) {
				String taxCd = null;
				Sprt03_DtlR slsTaxR = _slsTax.getFirst(_slsTaxIdx, r.toArray(_slsTaxIdx.getKeys()));
				if (!isNull(slsTaxR)) {
					taxCd = slsTaxR.tax_cd();
				}
				r.tax_cd(taxCd);
			}
			if (_taxCache == null) {
				initTaxCache(up0());
			}
			
			for (Sprt03_DtlR r : up0()) {
				setTaxInfo(r);
				down0().add(r);
			}
		}
		protected void getSlsTax(MCList<Sprt03_DtlR> taxL) {
			String[] key = new String[]{
					Sprt03_DtlR.$itm_cd,
					Sprt03_DtlR.$itm_sub1,
					Sprt03_DtlR.$itm_sub2,
					Sprt03_DtlR.$itm_sub3,
					Sprt03_DtlR.$cst_cd,
					Sprt03_DtlR.$tax_dt};
			_slsTax = MCList.create(Sprt03_DtlR.class);
			MCList<Sprt03_DtlR> grpL = taxL.groupBy(key);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_SLS_TAX_CD", "01"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_SLS_TAX_CD"),
					Sprt03_DtlR.$tax_cd, grpL, key);
			_slsTax.addAll(grpL);
			_slsTaxIdx = _slsTax.createIndex(key);
		}
		
		protected void setTaxInfo(Sprt03_DtlR r) {
			if (isNull(r.tax_cd())) {
				return;
			}
			MAM_TAX_R taxR = _taxCache.getCache(r.tax_cd());
			r.tax_nm(taxR.tax_nm());
			r.tax_typ(taxR.tax_typ());
			r.inc_tax_flg(taxR.inc_tax_flg());
			r.tax_rate(taxR.tax_rate());
		}
		
		FXUCL_MCDbcCache<MAM_TAX_R> _taxCache = null;
		
		protected void initTaxCache(MCList<Sprt03_DtlR> taxL) {
			MAM_TAX_R t = MAM_TAX_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.tax_cd, t.tax_nm, t.tax_typ, t.inc_tax_flg, t.tax_rate);
			_taxCache = new FXUCL_MCDbcCache<MAM_TAX_R>(dbc_bldr, taxL, MST_SLS_ACT_D_R.$tax_cd);
		}
	}

	//FMCB CUSTOM END
}