package mcframe.serverMSBF.MSBFL0080;

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
import mcframe.serverMSBF.MSBFL0080.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBF.MSBFL0080.Query.*;
import mcframe.serverMSBF.MSBFL5110.*;
import mcframe.serverMSBF.MSBFL5200.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSBF.MSBFL5330.*;
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverMAUC.MAUCL5010.*;
import mcframe.commonCore.param.MCParam;
import java.util.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_PlntAprvReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_PlntAprvReg_MC extends MSBFL_PlntAprvReg_MC_A{
	//FMCB CUSTOM START
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 工場出荷承認情報を取得する。<br>
	 */
	public class Srch01 extends MSBFL_PlntAprvReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 検索条件設定
			setUpTmpCol(up0());

			MCQueryPlan inspSchdSql = MSBFL0080_MST_PLNT_APRV_S01();
			searchForDL(inspSchdSql, up0(), down0());

		}

		@Override
		protected void editListMain() {
			super.editListMain();

			// 工場出荷承認明細に関連する項目の設定
			setPlntAprvDtlItms();

			// ロットトレース結果表示がオンの場合、ロットトレース結果設定
			if (up0().trace_disp_flg()) {

				setPegNo(down0());

				// ロットトレース情報サービスの出荷時構成チェック実行
				callLotTraceServiceChk01();
			}
		}

		/**
		 * 工場出荷承認明細に関連する項目を設定する。
		 */
		protected void setPlntAprvDtlItms() {
			MST_PLNT_APRV_D_R t = MST_PLNT_APRV_D_R.create("T");
			MST_INSP_ACT_R t2 = MST_INSP_ACT_R.create("T2");

			MCList<MST_PLNT_APRV_D_R> aprvDL = MCList.create(MST_PLNT_APRV_D_R.class);
			MCQueryApiBuilder aprvDL_bldr = MCQueryApiBuilder.create(t);
			aprvDL_bldr.setSelect(t.insp_no);
			aprvDL_bldr.addSelect(t.insp_typ);
			aprvDL_bldr.addSelect(t.plnt_aprv_no);
			aprvDL_bldr.addSelect(t.base_unit_qty);
			aprvDL_bldr.addSelect(t2.judg_dt);
			aprvDL_bldr.addSelect(t2.insp_mtd_typ);
			aprvDL_bldr.addInnerJoin(t2, bracket( t.insp_no.eq(t2.insp_no)));
			aprvDL_bldr.setWhere(t.plnt_aprv_no.eq(bind("plnt_aprv_no")));
			aprvDL_bldr.setOrderByAsc(t.plnt_aprv_no);
			if (isSame(getSysParm("PLNT_APRV_LATEST_QTY_FLG"), "1")) {
				aprvDL_bldr.addOrderByDesc(t.plnt_aprv_d_no);
			}
			else {
				aprvDL_bldr.addOrderByDesc(t2.judg_dt, t.insp_no);
			}
			dbSelect("MSBFL0080_MST_PLNT_APRV_D_S01", aprvDL, aprvDL_bldr, down0());

			MCIndexKey idxkey = aprvDL.createIndex(MST_PLNT_APRV_D_R.$plnt_aprv_no);
			for (Srch01_RsltR rsltR : down0()) {
				MCList<MST_PLNT_APRV_D_R> selectDL = aprvDL.subList(idxkey, rsltR.plnt_aprv_no());

				if (isNull(selectDL)) {
					continue;
				}

				MST_PLNT_APRV_D_R selectR = selectDL.get(0);
				rsltR.insp_no(selectR.insp_no());
				rsltR.insp_typ(selectR.insp_typ());
				rsltR.judg_dt(selectR.getDateNE(MST_INSP_ACT_R.$judg_dt));
				rsltR.insp_mtd_typ(selectR.getStringNE(MST_INSP_ACT_R.$insp_mtd_typ));
				if (isSame(getSysParm("PLNT_APRV_LATEST_QTY_FLG"), "1")) {
					rsltR.base_unit_qty(selectR.base_unit_qty());
				}
			}
		}

		/**
		 * 検索条件に対する一時カラムを設定する
		 * @param up
		 */
		protected void setUpTmpCol(Srch01_CndR up) {
			// 工場出荷承認状況区分
			if (up.opn_flg()) {
				up.addStringColumn("TMP_STS_OPN", MSC_PLNT_APRV_STS_TYP.OPN.value());
			}
			if (up.acpt_flg()) {
				up.addStringColumn("TMP_STS_ACPT", MSC_PLNT_APRV_STS_TYP.ACPT.value());
			}
			if (up.rjct_flg()) {
				up.addStringColumn("TMP_STS_RJCT", MSC_PLNT_APRV_STS_TYP.RJCT.value());
			}

			// 工場出荷記録書発行
			if (up.prnt_flg() && up.not_prnt_flg()) {
				up.addStringColumn("TMP_PRNT_FLG_CUTOFF", toTrueStr(false));
			} 
			else if (!up.prnt_flg() && !up.not_prnt_flg()) {
				up.addStringColumn("TMP_PRNT_FLG_CUTOFF", toFalseStr(true));
			}
			else if (up.prnt_flg()) {
				up.addStringColumn("TMP_PRNT_FLG_CUTOFF", toTrueStr(true));
			}
			else if (up.not_prnt_flg()) {
				up.addStringColumn("TMP_PRNT_FLG_CUTOFF", toFalseStr(false));
			}

			// 承認役割チェック
			// ログインユーザ
			up.addStringColumn("TMP_LOGIN_USR_ID", mcframe.serverCore.sys.MCSys.user.ID());
			// 運用日付
			up.addDateColumn("TMP_TODAY", getToday());
		}

		/**
		 * ロットトレース情報サービスの出荷時構成チェックを行う。
		 */
		protected void callLotTraceServiceChk01() {

			MSBFL_LotTraceService.LotTrace_Chk01 ope = MSBFL_LotTraceService.crtLotTrace_Chk01();

			addAll(ope.up0(), down0(), createMap_LotTrace_Chk01_RsltR_Srch01_RsltR());

			ope.exec();

			String[] destCols = new String[] {Srch01_RsltR.$comp_itm_insp_typ, Srch01_RsltR.$comp_itm_mfg_aprv_typ, Srch01_RsltR.$comp_itm_quality_typ};
			String[] srcCols = new String[] {LotTrace_Chk01_RsltR.$comp_itm_insp_typ, LotTrace_Chk01_RsltR.$comp_itm_mfg_aprv_typ, LotTrace_Chk01_RsltR.$comp_itm_quality_typ};
			copyByPegNo(down0(), destCols, ope.down0(), srcCols);
		}

		protected Map_LotTrace_Chk01_RsltR_Srch01_RsltR<LotTrace_Chk01_RsltR,Srch01_RsltR> createMap_LotTrace_Chk01_RsltR_Srch01_RsltR() {
			return new Map_LotTrace_Chk01_RsltR_Srch01_RsltR<LotTrace_Chk01_RsltR, Srch01_RsltR>();
		}

		public class Map_LotTrace_Chk01_RsltR_Srch01_RsltR<D extends LotTrace_Chk01_RsltR, S extends Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(LotTrace_Chk01_RsltR.$peg_no, Srch01_RsltR.$peg_no);
				addColumnPathMap(LotTrace_Chk01_RsltR.$skip_chk_ship_flg, Srch01_RsltR.$skip_chk_ship_flg);
				addColumnPathMap(LotTrace_Chk01_RsltR.$itm_cd, Srch01_RsltR.$itm_cd);
				addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub1);
				addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub2, Srch01_RsltR.$itm_sub2);
				addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub3, Srch01_RsltR.$itm_sub3);
				addColumnPathMap(LotTrace_Chk01_RsltR.$lot_no, Srch01_RsltR.$lot_no);
				addColumnPathMap(LotTrace_Chk01_RsltR.$sublot_no, Srch01_RsltR.$sublot_no);
				addColumnPathMap(LotTrace_Chk01_RsltR.$site_cd, Srch01_RsltR.$site_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.plnt_aprv_flg(true);
				dest.no_chk_flg(true);
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 承認・却下前チェックを行う。<br>
	 */
	public class Chk01 extends MSBFL_PlntAprvReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				// 構成品チェック
				callLotTraceServiceChk01(notErrL);
			}
			notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				// 市場出荷判定情報サービスの市場出荷判定作成前チェック
				callMrktJudgServiceChk01(notErrL);
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 工場出荷承認ヘッダの更新カウンタチェック
			msgL.addAll(chkPlntApvUpdCnt());

			// データ補完
			compData();

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			// 条件付チェック
			msgL.addAll(chkItmsWithCnd(notErrL));

			// 製造指図完了チェック
			msgL.addAll(chkMfgInstCmpl(notErrL));

			// 承認役割チェック
			msgL.addAll(chkAprvRole(notErrL));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkPlntApvUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_PLNT_APRV_R> selectL = MCList.create(MST_PLNT_APRV_R.class);
			MST_PLNT_APRV_R t = MST_PLNT_APRV_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.plnt_aprv_no);

			dbSelectKeyForUpdateNoWait("MSBFL0080_MST_PLNT_APRV_S01", selectL, selectL_bldr, up0());

			MCList<MST_PLNT_APRV_D_R> bindL = MCList.create(MST_PLNT_APRV_D_R.class);
			for (Chk01_RsltR r : up0()) {
				MST_PLNT_APRV_D_R bindR = MST_PLNT_APRV_D_R.create();
				bindR.plnt_aprv_no(r.plnt_aprv_no());
				bindL.add(bindR);
			}
			MCList<MST_PLNT_APRV_D_R> selectDL = MCList.create(MST_PLNT_APRV_D_R.class);
			MST_PLNT_APRV_D_R t1 = MST_PLNT_APRV_D_R.create("T1");
			MCQueryApiBuilder selectDL_bldr = MCQueryApiBuilder.create(t1);
			selectDL_bldr.setOrderByAsc(t1.plnt_aprv_no);
			dbSelectColumn("MSBFL0080_MST_PLNT_APRV_D_S02", selectDL, selectDL_bldr, bindL, MST_PLNT_APRV_D_R.$plnt_aprv_no);

			MCIndexKey idxkey = selectL.createIndex(MST_PLNT_APRV_R.$plnt_aprv_no);
			MCIndexKey idxkeyD = selectDL.createIndex(MST_PLNT_APRV_D_R.$plnt_aprv_no);
			for (Chk01_RsltR r : up0()) {
				MST_PLNT_APRV_R selectR = selectL.getFirst(idxkey, r.plnt_aprv_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));

				if (!isNull(selectR)) {
					if (!isSame(r.itm_cd(), selectR.itm_cd())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_cd, selectR.itm_cd(), r));
					}
					if (!isSame(r.itm_sub1(), selectR.itm_sub1())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub1, selectR.itm_sub1(), r));
					}
					if (!isSame(r.itm_sub2(), selectR.itm_sub2())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub2, selectR.itm_sub2(), r));
					}
					if (!isSame(r.itm_sub3(), selectR.itm_sub3())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub3, selectR.itm_sub3(), r));
					}

					// データ補完
					r.plnt_aprv_role_cd(selectR.plnt_aprv_role_cd());
					r.lot_no(selectR.lot_no());
					r.sublot_no(selectR.sublot_no());
					r.site_cd(selectR.site_cd());
					MCList<MST_PLNT_APRV_D_R> subDL = selectDL.subList(idxkeyD, r.plnt_aprv_no());
					if (!isNull(subDL)) {
						r.base_unit_qty(subDL.sum(MST_PLNT_APRV_D_R.$base_unit_qty));
						r.base_unit_cd(subDL.get(0).base_unit_cd());
					}
				}
			}

			return msgL;
		}

		/**
		 * データ補完
		 */
		protected void compData() {
			setInspActJudgDt();
			setMgfActAprvDt();
		}

		/**
		 * 検査実績の判定日を設定する。
		 */
		protected void setInspActJudgDt() {
			MST_PLNT_APRV_D_R t = MST_PLNT_APRV_D_R.create("T");
			MST_INSP_ACT_R t2 = MST_INSP_ACT_R.create("T2");

			MCList<MST_PLNT_APRV_D_R> plntDL = MCList.create(MST_PLNT_APRV_D_R.class);
			MCQueryApiBuilder plntDL_bldr = MCQueryApiBuilder.create(t);
			plntDL_bldr.setSelect(t.plnt_aprv_no);
			plntDL_bldr.addSelect(t2.judg_dt);
			plntDL_bldr.addSelect(t2.end_tm);
			plntDL_bldr.setDistinct();
			plntDL_bldr.addLeftOuterJoin(t2, bracket( t.insp_no.eq(t2.insp_no)));
			plntDL_bldr.setWhere(t.plnt_aprv_no.eq(bind("plnt_aprv_no")));
			dbSelect("MSBFL0080_MST_PLNT_APRV_D_S03", plntDL, plntDL_bldr, up0());

			MCIndexKey idxkey = plntDL.createIndex(MST_PLNT_APRV_D_R.$plnt_aprv_no);

			for (Chk01_RsltR upR : up0()) {
				MST_PLNT_APRV_D_R plntDR = plntDL.getFirst(idxkey, upR.plnt_aprv_no());
				if (!isNull(plntDR)) {
					upR.insp_act_judg_dt(plntDR.getDateNE("JUDG_DT"));
					if (!isNull(plntDR.getDateNE("END_TM"))) {
						upR.insp_act_end_tm(plntDR.getDateNE("END_TM").trunc(MCDateFieldType.DAY));
					}
				}
			}
		}

		/**
		 * 製造実績の承認日を設定する。
		 */
		protected void setMgfActAprvDt() {
			MST_PLNT_APRV_D_R t = MST_PLNT_APRV_D_R.create("T");
			MST_YIELD_ACT_R t2 = MST_YIELD_ACT_R.create("T2");
			MST_MFG_ACT_R t3 = MST_MFG_ACT_R.create("T3");

			MCList<MST_PLNT_APRV_D_R> plntDL = MCList.create(MST_PLNT_APRV_D_R.class);
			MCQueryApiBuilder plntDL_bldr = MCQueryApiBuilder.create(t);
			plntDL_bldr.setSelect(t.plnt_aprv_no);
			plntDL_bldr.addSelect(t3.aprv_dt);
			plntDL_bldr.setDistinct();
			plntDL_bldr.addLeftOuterJoin(t2, bracket( t.src_no4.eq(t2.yield_act_no)));
			plntDL_bldr.addLeftOuterJoin(t3, bracket( t2.mfg_act_no.eq(t3.mfg_act_no)));
			plntDL_bldr.setWhere(t.plnt_aprv_no.eq(bind("plnt_aprv_no")));
			plntDL_bldr.addWhereWithAnd(t.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())));
			plntDL_bldr.addWhereWithAnd(t.src_no4.isNotNull());
			dbSelect("MSBFL0080_MST_PLNT_APRV_D_S04", plntDL, plntDL_bldr, up0());

			MCIndexKey idxkey = plntDL.createIndex(MST_PLNT_APRV_D_R.$plnt_aprv_no);

			for (Chk01_RsltR upR : up0()) {
				MST_PLNT_APRV_D_R plntDR = plntDL.getFirst(idxkey, upR.plnt_aprv_no());
				if (!isNull(plntDR)) {
					upR.mfg_act_aprv_dt(plntDR.getDateNE("APRV_DT"));
				}
			}
		}

		/**
		 * 条件付チェックを実行する。
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList chkItmsWithCnd(MCList<Chk01_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk01_RsltR r : upL) {
				// 日付前後チェック
				if (!isNull(r.insp_act_judg_dt())) {
					msgL.addAll(check(r, new String[] {Chk01_RsltR.$insp_act_judg_dt, Chk01_RsltR.$aprv_dt}, new FXUCL_BeforeAfterValidater()));
				}
				else {
					msgL.addAll(check(r, new String[] {Chk01_RsltR.$insp_act_end_tm, Chk01_RsltR.$aprv_dt}, new FXUCL_BeforeAfterValidater()));
				}
				if (!isNull(r.mfg_act_aprv_dt())) {
					msgL.addAll(check(r, new String[] {Chk01_RsltR.$mfg_act_aprv_dt, Chk01_RsltR.$aprv_dt}, new FXUCL_BeforeAfterValidater()));
				}
			}

			return msgL;
		}

		/**
		 * 製造指図完了チェックを行う。
		 * 
		 * @param upL チェック対象
		 * @return メッセージリスト
		 */
		protected MCMessageList chkMfgInstCmpl(MCList<Chk01_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();

			MCList<MSVT_MFG_INST_PR_R> remL = MCList.create(MSVT_MFG_INST_PR_R.class);
			MSVT_MFG_INST_PR_R t = MSVT_MFG_INST_PR_R.create("T");
			MST_PLNT_APRV_D_R t2 = MST_PLNT_APRV_D_R.create("T2");
			MCQueryApiBuilder remL_bldr = MCQueryApiBuilder.create(t);
			remL_bldr.setSelect(t.mfg_sts_typ);
			remL_bldr.addSelect(t2.plnt_aprv_no);
			remL_bldr.addInnerJoin(t2, bracket( t.mfg_inst_no.eq(t2.src_no1)));
			remL_bldr.setWhere(t2.plnt_aprv_no.eq(bind("plnt_aprv_no")));
			remL_bldr.addWhereWithAnd(t2.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())));
			remL_bldr.addOrderByAsc(t2.plnt_aprv_no);
			dbSelect("MSBFL0080_MSVT_MFG_INST_PR_S01", remL, remL_bldr, upL);
			
			for (Chk01_RsltR upR : upL) {
				MCList<MSVT_MFG_INST_PR_R> subL = remL.subList(MST_PLNT_APRV_D_R.$plnt_aprv_no, upR.plnt_aprv_no());

				if (!subL.isEmpty()) {
					if (!isSame(subL.size(), 
							subL.subList(MSVT_MFG_INST_PR_R.$mfg_sts_typ, MSC_MFG_STS_TYP.CMPL.value()).size())) {
						msgL.add(new MCMessage(upR, null, MSBFL0013
								, toDispItm(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3())
								, upR.lot_no(), upR.sublot_no()
								, toDispGUIIndex(upR)));
					}
				}
			}
			return msgL;
		}

		/**
		 * 承認役割権限チェックを実行する。
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList chkAprvRole(MCList<Chk01_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk01_RsltR upR : upL) {

				// 権限チェック
				if (!isAprvUsrR(upR.plnt_aprv_role_cd())) {
					msgL.add(new MCMessage(upR, null, MSBFL0010, toDispGUIIndex(upR)));
				}
			}

			return msgL;
		}

		/**
		 * ロットトレース情報サービスの出荷時構成チェックを行う。
		 */
		protected void callLotTraceServiceChk01(MCList<Chk01_RsltR> notErrL) {
			MCList<Chk01_RsltR> chkL = notErrL.subList(r -> isChkShipRow(r));
			if (chkL.isEmpty()) {
				return ;
			}
			MSBFL_LotTraceService.LotTrace_Chk01 ope = MSBFL_LotTraceService.crtLotTrace_Chk01();

			addAll(ope.up0(), chkL, createMap_LotTrace_Chk01_RsltR_Chk01_RsltR());

			ope.exec();

			copyErrFlg(chkL, ope.down0());
		}

		/**
		 * 出荷時構成チェック対象を判定する。
		 * @param r
		 * @return
		 */
		protected boolean isChkShipRow(Chk01_RsltR r) {
			if (r.acpt_flg()) {
				return true;
			}
			return false;
		}

		/**
		 * 市場出荷判定情報サービスの市場出荷判定作成前チェックを呼び出す。
		 */
		protected void callMrktJudgServiceChk01(MCList<Chk01_RsltR> notErrL) {
			MCList<MST_PLNT_APRV_D_R> bindL = MCList.create(MST_PLNT_APRV_D_R.class);
			for (Chk01_RsltR r : notErrL) {
				MST_PLNT_APRV_D_R bindR = MST_PLNT_APRV_D_R.create();
				bindR.plnt_aprv_no(r.plnt_aprv_no());
				bindL.add(bindR);
			}

			MST_PLNT_APRV_D_R t = MST_PLNT_APRV_D_R.create("T");
			MCList<MST_PLNT_APRV_D_R> selectDL = MCList.create(MST_PLNT_APRV_D_R.class);
			MCQueryApiBuilder selectDL_bldr = MCQueryApiBuilder.create(t);
			
			selectDL_bldr.setOrderByAsc(t.plnt_aprv_no, t.plnt_aprv_d_no);
			dbSelectColumn("MSBFL0080_MST_PLNT_APRV_D_S05", selectDL, selectDL_bldr, bindL, MST_PLNT_APRV_D_R.$plnt_aprv_no);

			String strPlntAprvNo = null;
			Chk01_RsltR upR = null;
			MSBFL_MrktJudgService.MrktJudg_Chk01 ope = MSBFL_MrktJudgService.crtMrktJudg_Chk01();
			for (MST_PLNT_APRV_D_R selectDR : selectDL) {
				if (!isSame(strPlntAprvNo, selectDR.plnt_aprv_no())) {
					upR = notErrL.getFirst(Chk01_RsltR.$plnt_aprv_no, selectDR.plnt_aprv_no());
				}
				MrktJudg_Chk01_RsltR mrktR = MrktJudg_Chk01_RsltR.create();
				copy(mrktR, upR, createMap_MrktJudg_Chk01_RsltR_Chk01_RsltR());
				mrktR.mrkt_judg_src_no(selectDR.plnt_aprv_d_no());
				mrktR.base_unit_cd(selectDR.base_unit_cd());
				mrktR.base_unit_qty(selectDR.base_unit_qty());
				ope.up0().add(mrktR);
			}

			ope.exec();

			copyErrFlg(notErrL, ope.down0());
		}

		protected Map_LotTrace_Chk01_RsltR_Chk01_RsltR<LotTrace_Chk01_RsltR,Chk01_RsltR> createMap_LotTrace_Chk01_RsltR_Chk01_RsltR() {
			return new Map_LotTrace_Chk01_RsltR_Chk01_RsltR<LotTrace_Chk01_RsltR, Chk01_RsltR>();
		}

		public class Map_LotTrace_Chk01_RsltR_Chk01_RsltR<D extends LotTrace_Chk01_RsltR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(LotTrace_Chk01_RsltR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(LotTrace_Chk01_RsltR.$skip_chk_ship_flg, Chk01_RsltR.$skip_chk_ship_flg);
				addColumnPathMap(LotTrace_Chk01_RsltR.$site_cd, Chk01_RsltR.$site_cd);
				addColumnPathMap(LotTrace_Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(LotTrace_Chk01_RsltR.$lot_no, Chk01_RsltR.$lot_no);
				addColumnPathMap(LotTrace_Chk01_RsltR.$sublot_no, Chk01_RsltR.$sublot_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.plnt_aprv_flg(true);
			}
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 更新前チェックを行う。<br>
	 */
	public class Chk02 extends MSBFL_PlntAprvReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 工場出荷承認ヘッダの更新カウンタチェック
			msgL.addAll(chkPlntApvUpdCnt());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk02_RsltR> notErrL = getChkList(up0());

			// 承認役割チェック
			msgL.addAll(chkAprvRole(notErrL));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkPlntApvUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_PLNT_APRV_R> selectL = MCList.create(MST_PLNT_APRV_R.class);
			MST_PLNT_APRV_R t = MST_PLNT_APRV_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.plnt_aprv_no);

			dbSelectKeyForUpdateNoWait("MSBFL0080_MST_PLNT_APRV_S02", selectL, selectL_bldr, up0());

			MCIndexKey idxkey = selectL.createIndex(MST_PLNT_APRV_R.$plnt_aprv_no);
			for (Chk02_RsltR r : up0()) {
				MST_PLNT_APRV_R selectR = selectL.getFirst(idxkey, r.plnt_aprv_no());
				msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));

				if (!isNull(selectR)) {
					if (!isSame(r.itm_cd(), selectR.itm_cd())) {
						msgL.addAll(getRecordInvalidMsg(Chk02_RsltR.$itm_cd, selectR.itm_cd(), r));
					}
					if (!isSame(r.itm_sub1(), selectR.itm_sub1())) {
						msgL.addAll(getRecordInvalidMsg(Chk02_RsltR.$itm_sub1, selectR.itm_sub1(), r));
					}
					if (!isSame(r.itm_sub2(), selectR.itm_sub2())) {
						msgL.addAll(getRecordInvalidMsg(Chk02_RsltR.$itm_sub2, selectR.itm_sub2(), r));
					}
					if (!isSame(r.itm_sub3(), selectR.itm_sub3())) {
						msgL.addAll(getRecordInvalidMsg(Chk02_RsltR.$itm_sub3, selectR.itm_sub3(), r));
					}

					// データ補完
					r.plnt_aprv_role_cd(selectR.plnt_aprv_role_cd());
					r.plnt_aprv_prnt_flg(selectR.plnt_aprv_prnt_flg());
					r.seq(selectR.seq());
				}
			}

			return msgL;
		}

		/**
		 * 承認役割権限チェックを実行する。
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList chkAprvRole(MCList<Chk02_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk02_RsltR upR : upL) {

				// 権限チェック
				if (!isAprvUsrR(upR.plnt_aprv_role_cd())) {
					msgL.add(new MCMessage(upR, null, MSBFL0010, toDispGUIIndex(upR)));
				}
			}

			return msgL;
		}
	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 取消前チェックを行う。<br>
	 */
	public class Chk03 extends MSBFL_PlntAprvReg_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk03_RsltR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				// 市場出荷判定情報サービスの市場出荷判定作成前チェック
				callMrktJudgServiceChk01(notErrL);
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 工場出荷承認ヘッダの更新カウンタチェック
			msgL.addAll(chkPlntApvUpdCnt());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk03_RsltR> notErrL = getChkList(up0());

			// 承認役割チェック
			msgL.addAll(chkAprvRole(notErrL));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkPlntApvUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_PLNT_APRV_R> selectL = MCList.create(MST_PLNT_APRV_R.class);
			MST_PLNT_APRV_R t = MST_PLNT_APRV_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.plnt_aprv_no);

			dbSelectKeyForUpdateNoWait("MSBFL0080_MST_PLNT_APRV_S03", selectL, selectL_bldr, up0());

			MCIndexKey idxkey = selectL.createIndex(MST_PLNT_APRV_R.$plnt_aprv_no);
			for (Chk03_RsltR r : up0()) {
				MST_PLNT_APRV_R selectR = selectL.getFirst(idxkey, r.plnt_aprv_no());
				msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));

				if (!isNull(selectR)) {
					if (!isSame(r.itm_cd(), selectR.itm_cd())) {
						msgL.addAll(getRecordInvalidMsg(Chk03_RsltR.$itm_cd, selectR.itm_cd(), r));
					}
					if (!isSame(r.itm_sub1(), selectR.itm_sub1())) {
						msgL.addAll(getRecordInvalidMsg(Chk03_RsltR.$itm_sub1, selectR.itm_sub1(), r));
					}
					if (!isSame(r.itm_sub2(), selectR.itm_sub2())) {
						msgL.addAll(getRecordInvalidMsg(Chk03_RsltR.$itm_sub2, selectR.itm_sub2(), r));
					}
					if (!isSame(r.itm_sub3(), selectR.itm_sub3())) {
						msgL.addAll(getRecordInvalidMsg(Chk03_RsltR.$itm_sub3, selectR.itm_sub3(), r));
					}

					// データ補完
					r.plnt_aprv_role_cd(selectR.plnt_aprv_role_cd());
					r.lot_no(selectR.lot_no());
					r.sublot_no(selectR.sublot_no());
					r.plnt_aprv_sts_typ(MSC_PLNT_APRV_STS_TYP.OPN.value());
					r.plnt_aprv_sts_typ_db(selectR.plnt_aprv_sts_typ());
					r.seq(selectR.seq());
					r.aprv_dt(selectR.aprv_dt());
					if (selectR.plnt_aprv_prnt_flg()) {
						r.seq(selectR.seq().add(MCNumber.ONE));
					}
				}
			}

			return msgL;
		}

		/**
		 * 承認役割権限チェックを実行する。
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList chkAprvRole(MCList<Chk03_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk03_RsltR upR : upL) {

				// 権限チェック
				if (!isAprvUsrR(upR.plnt_aprv_role_cd())) {
					msgL.add(new MCMessage(upR, null, MSBFL0010, toDispGUIIndex(upR)));
				}
			}

			return msgL;
		}

		/**
		 * 市場出荷判定情報サービスの市場出荷判定作成前チェックを呼び出す。
		 */
		protected void callMrktJudgServiceChk01(MCList<Chk03_RsltR> notErrL) {
			MCList<Chk03_RsltR> acptSubL = notErrL.subList(Chk03_RsltR.$plnt_aprv_sts_typ_db, MSC_PLNT_APRV_STS_TYP.ACPT.value());
			if (acptSubL.isEmpty()) {
				return;
			}

			MCList<MST_PLNT_APRV_D_R> bindL = MCList.create(MST_PLNT_APRV_D_R.class);
			for (Chk03_RsltR r : acptSubL) {
				MST_PLNT_APRV_D_R bindR = MST_PLNT_APRV_D_R.create();
				bindR.plnt_aprv_no(r.plnt_aprv_no());
				bindL.add(bindR);
			}
			MST_PLNT_APRV_D_R t = MST_PLNT_APRV_D_R.create("T");
			MCList<MST_PLNT_APRV_D_R> selectDL = MCList.create(MST_PLNT_APRV_D_R.class);
			MCQueryApiBuilder selectDL_bldr = MCQueryApiBuilder.create(t);
			
			selectDL_bldr.setOrderByAsc(t.plnt_aprv_no, t.plnt_aprv_d_no);
			dbSelectColumn("MSBFL0080_MST_PLNT_APRV_D_S06", selectDL, selectDL_bldr, bindL, MST_PLNT_APRV_D_R.$plnt_aprv_no);

			String strPlntAprvNo = null;
			Chk03_RsltR upR = null;
			MSBFL_MrktJudgService.MrktJudg_Chk01 ope = MSBFL_MrktJudgService.crtMrktJudg_Chk01();
			for (MST_PLNT_APRV_D_R selectDR : selectDL) {
				if (!isSame(strPlntAprvNo, selectDR.plnt_aprv_no())) {
					upR = notErrL.getFirst(Chk03_RsltR.$plnt_aprv_no, selectDR.plnt_aprv_no());
				}
				MrktJudg_Chk01_RsltR mrktR = MrktJudg_Chk01_RsltR.create();
				copy(mrktR, upR, createMap_MrktJudg_Chk01_RsltR_Chk03_RsltR());
				mrktR.mrkt_judg_src_no_del(selectDR.plnt_aprv_d_no());
				ope.up0().add(mrktR);
			}

			ope.exec();

			copyErrFlg(notErrL, ope.down0());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 工場出荷の承認・却下を行う。<br>
	 */
	public class Upd01 extends MSBFL_PlntAprvReg_MC_A.Upd01 {
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

			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {

				// 工場出荷承認情報更新
				updPlntAprv(notErrL);
				
				// ロット情報サービスの区分更新
				callLotServiceUpd05(notErrL);
				
				// 市場出荷判定情報サービスの市場出荷判定作成
				callMrktJudgServiceUpd01(notErrL);
				
				// 工場出荷記録書発行
				callInspRptServicePrnt03(notErrL);

				// プッシュ通知
				callPushNtc(notErrL);
			}
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = ((MCList<Chk01_RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			up0().sort(Chk01_RsltR.$plnt_aprv_no);
			setPegNo(Chk01_RsltR.$peg_no, up0());
			for (Chk01_RsltR r : up0()) {
				if (r.acpt_flg()) {
					r.plnt_aprv_sts_typ(MSC_PLNT_APRV_STS_TYP.ACPT.value());
				}
				else if (r.rjct_flg()) {
					r.plnt_aprv_sts_typ(MSC_PLNT_APRV_STS_TYP.RJCT.value());
				}
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			// 定数名設定
			putNames();
			down0().setAll(up0());
		}

		/**
		 * 定数名を設定する。
		 */
		protected void putNames() {
			MSC_PLNT_APRV_STS_TYP.putNameNE(up0(), Chk01_RsltR.$plnt_aprv_sts_typ, Chk01_RsltR.$plnt_aprv_sts_typ_nm, getUsrLocale());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBFL_PlntAprvReg.Chk01 ope = MSBFL_PlntAprvReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
		}

		/**
		 * 工場出荷承認ヘッダを更新する。
		 * 
		 * @param notErrL
		 */
		protected void updPlntAprv(MCList<Chk01_RsltR> notErrL) {
			MCList<MST_PLNT_APRV_R> updL = MCList.create(MST_PLNT_APRV_R.class);

			addAll(updL, notErrL, createMap_MST_PLNT_APRV_R_Chk01_RsltR());

			if (!updL.isEmpty()) {
				MST_PLNT_APRV_R t = MST_PLNT_APRV_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				// 更新項目設定
				editPlntAprvLSetStmt(updL, t, updL_bldr);

				dbUpdateKey("MSBFL0080_MST_PLNT_APRV_U01", updL, updL_bldr);
			}
		}

		/**
		 * ロット情報サービスの区分更新を呼び出す。
		 * 
		 * @param notErrL
		 */
		protected void callLotServiceUpd05(MCList<Chk01_RsltR> notErrL) {
			MSBFL_LotService.Lot_Upd05 upd = MSBFL_LotService.crtLot_Upd05();

			addAll(upd.up0(), notErrL, createMap_Lot_Upd05_CndR_Chk01_RsltR());

			upd.exec();
		}

		/**
		 * 市場出荷判定情報サービスの市場出荷判定作成を呼び出す。
		 * 
		 * @param notErrL
		 */
		protected void callMrktJudgServiceUpd01(MCList<Chk01_RsltR> notErrL) {
			MCList<Chk01_RsltR> acptSubL = notErrL.subList(Chk01_RsltR.$plnt_aprv_sts_typ, MSC_PLNT_APRV_STS_TYP.ACPT.value());
			if (acptSubL.isEmpty()) {
				return;
			}

			MCList<MST_PLNT_APRV_D_R> selectDL = MCList.create(MST_PLNT_APRV_D_R.class);
			MCList<MST_PLNT_APRV_D_R> bindL = MCList.create(MST_PLNT_APRV_D_R.class);
			for (Chk01_RsltR r : acptSubL) {
				MST_PLNT_APRV_D_R bindR = MST_PLNT_APRV_D_R.create();
				bindR.plnt_aprv_no(r.plnt_aprv_no());
				bindL.add(bindR);
			}
			MST_PLNT_APRV_D_R t = MST_PLNT_APRV_D_R.create("T");
			MCQueryApiBuilder selectDL_bldr = MCQueryApiBuilder.create(t);
			
			selectDL_bldr.setOrderByAsc(t.plnt_aprv_no, t.plnt_aprv_d_no);
			dbSelectColumn("MSBFL0080_MST_PLNT_APRV_D_S07", selectDL, selectDL_bldr, bindL, MST_PLNT_APRV_D_R.$plnt_aprv_no);

			String strPlntAprvNo = null;
			Chk01_RsltR upR = null;
			MCIndexKey idxkey = acptSubL.createIndex(Chk01_RsltR.$plnt_aprv_no);
			MSBFL_MrktJudgService.MrktJudg_Upd01 upd = MSBFL_MrktJudgService.crtMrktJudg_Upd01();
			for (MST_PLNT_APRV_D_R selectDR : selectDL) {
				if (!isSame(strPlntAprvNo, selectDR.plnt_aprv_no())) {
					upR = acptSubL.getFirst(idxkey, selectDR.plnt_aprv_no());
				}
				MrktJudg_Chk01_RsltR mrktR = MrktJudg_Chk01_RsltR.create();
				copy(mrktR, upR, createMap_MrktJudg_Chk01_RsltR_Chk01_RsltR());
				mrktR.mrkt_judg_src_no(selectDR.plnt_aprv_d_no());
				mrktR.base_unit_cd(selectDR.base_unit_cd());
				mrktR.base_unit_qty(selectDR.base_unit_qty());
				upd.up0().add(mrktR);
			}

			upd.exec();
		}

		/**
		 * プッシュ通知を実行する。
		 * 
		 * @param notErrL
		 */
		protected void callPushNtc(MCList<Chk01_RsltR> notErrL) {
			MCList<MST_PLNT_APRV_D_R> bindL = MCList.create(MST_PLNT_APRV_D_R.class);
			for (Chk01_RsltR rsltR : notErrL) {
				if (MSC_PLNT_APRV_STS_TYP.isACPT(rsltR.plnt_aprv_sts_typ())) {
					MST_PLNT_APRV_D_R bindR = MST_PLNT_APRV_D_R.create();
					bindR.plnt_aprv_no(rsltR.plnt_aprv_no());
					bindL.add(bindR);
				}
			}

			if (!bindL.isEmpty()) {
				
				MCList<Chk01_RsltR> pushTmpL = MCList.create(Chk01_RsltR.class);

				// 検査判定部門 または 実績部門にプッシュ通知情報作成
				pushTmpL.addAll(crtPushNtcInfoForInsp(bindL));

				// 製造承認部門にプッシュ通知情報作成
				pushTmpL.addAll(crtPushNtcInfoForMfg(bindL));

				MCIndexKey idxkey = pushTmpL.createIndex(Chk01_RsltR.$push_dpt_cd, Chk01_RsltR.$aprv_dt);
				for (Chk01_RsltR rsltR : pushTmpL.groupBy(Chk01_RsltR.$push_dpt_cd, Chk01_RsltR.$aprv_dt)) {
					MCList<Chk01_RsltR> tmpL = pushTmpL.subList(idxkey, rsltR.push_dpt_cd(), rsltR.aprv_dt());
					int cnt = tmpL.groupBy(Chk01_RsltR.$plnt_aprv_no).size();

					MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();

					MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.PLNT_APRV_RESULT);
					info.setMsg(new MCMessage(MSBFL0095, cnt));
					info.addDpt(rsltR.push_dpt_cd(), nvl(rsltR.aprv_dt(), getToday()));
					info.addScrBind(MSC_PLNT_APRV_REG_OPE.OPE_REF.value(), false, true, true, toYMDString(rsltR.aprv_dt()), toYMDString(rsltR.aprv_dt()), null, null);

					mgr.exec();
				}
			}
		}

		/**
		 * 検査判定部門 または 実績部門にプッシュ通知情報を作成する。
		 * 
		 * @param bindL
		 * @return
		 */
		protected MCList<Chk01_RsltR> crtPushNtcInfoForInsp(MCList<MST_PLNT_APRV_D_R> bindL) {

			MCList<Chk01_RsltR> pushTmpL = MCList.create(Chk01_RsltR.class);
			MCList<MST_PLNT_APRV_D_R> selectL = getPlntAprvDLForInsp(bindL);

			if (selectL.isEmpty()) {
				return pushTmpL;
			}

			MCIndexKey idxkey = selectL.createIndex(MST_PLNT_APRV_D_R.$plnt_aprv_no);
			for (Chk01_RsltR rsltR : up0()) {
				MST_PLNT_APRV_D_R selectR = selectL.getFirst(idxkey, rsltR.plnt_aprv_no());
				if (isNull(selectR)) {
					continue;
				}
				if (isSame(selectR.getStringNE("INSP_APRV_FLG"), "1")) {
					if (!isNull(selectR.getStringNE("JUDG_DPT_CD"))) {
						Chk01_RsltR newR = Chk01_RsltR.create();
						newR.push_dpt_cd(selectR.getStringNE("JUDG_DPT_CD"));
						newR.plnt_aprv_no(selectR.plnt_aprv_no());
						newR.aprv_dt(rsltR.aprv_dt());
						pushTmpL.add(newR);
					}
				}
				else {
					if (!isNull(selectR.getStringNE("ACT_DPT_CD"))) {
						Chk01_RsltR newR = Chk01_RsltR.create();
						newR.push_dpt_cd(selectR.getStringNE("ACT_DPT_CD"));
						newR.plnt_aprv_no(selectR.plnt_aprv_no());
						newR.aprv_dt(rsltR.aprv_dt());
						pushTmpL.add(newR);
					}
				}
			}

			return pushTmpL;
		}

		/**
		 * 製造承認部門にプッシュ通知情報を作成する。
		 * 
		 * @param bindL
		 * @return
		 */
		protected MCList<Chk01_RsltR> crtPushNtcInfoForMfg(MCList<MST_PLNT_APRV_D_R> bindL) {

			MCList<Chk01_RsltR> pushTmpL = MCList.create(Chk01_RsltR.class);
			MCList<MST_PLNT_APRV_D_R> selectL = getPlntAprvDLForMfg(bindL);

			if (selectL.isEmpty()) {
				return pushTmpL;
			}

			MCIndexKey idxkey = selectL.createIndex(MST_PLNT_APRV_D_R.$plnt_aprv_no);
			for (Chk01_RsltR rsltR : up0()) {
				MST_PLNT_APRV_D_R selectR = selectL.getFirst(idxkey, rsltR.plnt_aprv_no());
				if (isNull(selectR)) {
					continue;
				}
				if (isSame(selectR.getStringNE("APRV_FLG"), "1")) {
					if (!isNull(selectR.getStringNE("APRV_DPT_CD"))) {
						Chk01_RsltR newR = Chk01_RsltR.create();
						newR.push_dpt_cd(selectR.getStringNE("APRV_DPT_CD"));
						newR.plnt_aprv_no(selectR.plnt_aprv_no());
						newR.aprv_dt(rsltR.aprv_dt());
						pushTmpL.add(newR);
					}
				}
				else {
					if (!isNull(selectR.getStringNE("ACT_DPT_CD"))) {
						Chk01_RsltR newR = Chk01_RsltR.create();
						newR.push_dpt_cd(selectR.getStringNE("ACT_DPT_CD"));
						newR.plnt_aprv_no(selectR.plnt_aprv_no());
						newR.aprv_dt(rsltR.aprv_dt());
						pushTmpL.add(newR);
					}
				}
			}

			return pushTmpL;
		}

		/**
		 * 工場出荷記録書を発行する。
		 * @param notErrL
		 */
		protected void callInspRptServicePrnt03(MCList<Chk01_RsltR> notErrL) {
			MSBFL_InspRptService.InspRpt_Prnt03 prnt = MSBFL_InspRptService.crtInspRpt_Prnt03();

			addAll(prnt.up0(), notErrL.subList(Chk01_RsltR.$aprv_prnt_flg, true), createMap_InspRpt_Prnt03_DtlR_Chk01_RsltR());

			prnt.exec();

			String[] destCols = new String[] {Chk01_RsltR.$plnt_aprv_prnt_flg, Chk01_RsltR.$plnt_aprv_prnt_tm};
			String[] srcCols = new String[] {InspRpt_Prnt03_DtlR.$plnt_aprv_prnt_flg, InspRpt_Prnt03_DtlR.$plnt_aprv_prnt_tm};
			copyByPegNo(notErrL, destCols, prnt.down0(), srcCols);;
		}

		/**
		 * 工場出荷承認ヘッダ更新用のdbContainerのset句を編集する。
		 * @param updL 更新用リスト
		 */
		protected void editPlntAprvLSetStmt(MCList<MST_PLNT_APRV_R> updL, MST_PLNT_APRV_R t, MCQueryApiBuilder updL_bldr) {

			updL_bldr.setSet(t.plnt_aprv_sts_typ);
			updL_bldr.addSet(t.skip_chk_ship_flg);
			updL_bldr.addSet(t.aprv_dt);
			updL_bldr.addSet(t.aprv_usr_cd);
			updL_bldr.addSet(t.aprv_dpt_cd);
			updL_bldr.addSet(t.aprv_rsn);
			updL_bldr.addSet(t.intr_rmrks);
			updL_bldr.addSet(t.sub_char1);
			updL_bldr.addSet(t.sub_char2);
			updL_bldr.addSet(t.sub_char3);
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk01_RsltR>> splitUp(MCList<Chk01_RsltR> list, int max) {
			List<MCList<Chk01_RsltR>> ret = new ArrayList<>();

			MCList<Chk01_RsltR>[] grpL = list.groupList(Chk01_RsltR.$itm_cd
					, Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub3);
			MCList<Chk01_RsltR> tmp = MCList.create(Chk01_RsltR.class);
			for (MCList<Chk01_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk01_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		/**
		 * 処理結果状態区分を設定する。
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk01_RsltR> l) {
			dbTran().commit();
			for (Chk01_RsltR r : l) {
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
		protected void handleEx(Exception e, MCList<Chk01_RsltR> l) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			// 画面にエラー内容を表示するために、メッセージプールにaddしているが、Exceptionと上り電文の行との対応付けはできないので、
			// causeRowは設定しない
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk01_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		protected Map_MST_PLNT_APRV_R_Chk01_RsltR<MST_PLNT_APRV_R,Chk01_RsltR> createMap_MST_PLNT_APRV_R_Chk01_RsltR() {
			return new Map_MST_PLNT_APRV_R_Chk01_RsltR<MST_PLNT_APRV_R, Chk01_RsltR>();
		}

		public class Map_MST_PLNT_APRV_R_Chk01_RsltR<D extends MST_PLNT_APRV_R, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PLNT_APRV_R.$plnt_aprv_no, Chk01_RsltR.$plnt_aprv_no);
				addColumnPathMap(MST_PLNT_APRV_R.$skip_chk_ship_flg, Chk01_RsltR.$skip_chk_ship_flg);
				addColumnPathMap(MST_PLNT_APRV_R.$plnt_aprv_sts_typ, Chk01_RsltR.$plnt_aprv_sts_typ);
				addColumnPathMap(MST_PLNT_APRV_R.$aprv_dt, Chk01_RsltR.$aprv_dt);
				addColumnPathMap(MST_PLNT_APRV_R.$aprv_dpt_cd, Chk01_RsltR.$aprv_dpt_cd);
				addColumnPathMap(MST_PLNT_APRV_R.$aprv_usr_cd, Chk01_RsltR.$aprv_usr_cd);
				addColumnPathMap(MST_PLNT_APRV_R.$aprv_rsn, Chk01_RsltR.$aprv_rsn);
				addColumnPathMap(MST_PLNT_APRV_R.$intr_rmrks, Chk01_RsltR.$intr_rmrks);
				addColumnPathMap(MST_PLNT_APRV_R.$sub_char1, Chk01_RsltR.$sub_char1);
				addColumnPathMap(MST_PLNT_APRV_R.$sub_char2, Chk01_RsltR.$sub_char2);
				addColumnPathMap(MST_PLNT_APRV_R.$sub_char3, Chk01_RsltR.$sub_char3);
			}
		}

		protected Map_Lot_Upd05_CndR_Chk01_RsltR<Lot_Upd05_CndR,Chk01_RsltR> createMap_Lot_Upd05_CndR_Chk01_RsltR() {
			return new Map_Lot_Upd05_CndR_Chk01_RsltR<Lot_Upd05_CndR, Chk01_RsltR>();
		}

		public class Map_Lot_Upd05_CndR_Chk01_RsltR<D extends Lot_Upd05_CndR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd05_CndR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(Lot_Upd05_CndR.$lot_no, Chk01_RsltR.$lot_no);
				addColumnPathMap(Lot_Upd05_CndR.$sublot_no, Chk01_RsltR.$sublot_no);
				addColumnPathMap(Lot_Upd05_CndR.$plnt_aprv_sts_typ, Chk01_RsltR.$plnt_aprv_sts_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.plnt_aprv_flg(true);
			}
		}

		protected Map_InspRpt_Prnt03_DtlR_Chk01_RsltR<InspRpt_Prnt03_DtlR,Chk01_RsltR> createMap_InspRpt_Prnt03_DtlR_Chk01_RsltR() {
			return new Map_InspRpt_Prnt03_DtlR_Chk01_RsltR<InspRpt_Prnt03_DtlR, Chk01_RsltR>();
		}

		public class Map_InspRpt_Prnt03_DtlR_Chk01_RsltR<D extends InspRpt_Prnt03_DtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspRpt_Prnt03_DtlR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(InspRpt_Prnt03_DtlR.$plnt_aprv_no, Chk01_RsltR.$plnt_aprv_no);
			}
		}
	}

	/**
	 * Upd02オペレーション.<p>
	 *
	 * 承認・却下の工場出荷情報を更新する。<br>
	 */
	public class Upd02 extends MSBFL_PlntAprvReg_MC_A.Upd02 {
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
			callThisChk02();

			MCList<Chk02_RsltR> notErrL = up0().subList(Chk02_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {

				// 工場出荷承認情報更新
				updPlntAprv(notErrL);
			}
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk02_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk02_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk02_RsltR> up0L = ((MCList<Chk02_RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			up0().sort(Chk02_RsltR.$plnt_aprv_no);
			setPegNo(Chk02_RsltR.$peg_no, up0());
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
		protected void callThisChk02() {
			MSBFL_PlntAprvReg.Chk02 ope = MSBFL_PlntAprvReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
		}

		/**
		 * 工場出荷承認ヘッダを更新する。
		 */
		protected void updPlntAprv(MCList<Chk02_RsltR> notErrL) {
			MCList<MST_PLNT_APRV_R> updL = MCList.create(MST_PLNT_APRV_R.class);

			addAll(updL, notErrL, createMap_MST_PLNT_APRV_R_Chk02_RsltR());

			if (!updL.isEmpty()) {
				MST_PLNT_APRV_R t = MST_PLNT_APRV_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				// 更新項目設定
				editPlntAprvLSetStmt(updL, t, updL_bldr);

				dbUpdateKey("MSBFL0080_MST_PLNT_APRV_U02", updL, updL_bldr);
			}
		}

		/**
		 * 工場出荷承認ヘッダ更新用のdbContainerのset句を編集する。
		 * @param updL 更新用リスト
		 */
		protected void editPlntAprvLSetStmt(MCList<MST_PLNT_APRV_R> updL, MST_PLNT_APRV_R t, MCQueryApiBuilder updL_bldr) {
			updL_bldr.setSet(t.intr_rmrks);
			updL_bldr.addSet(t.sub_char1);
			updL_bldr.addSet(t.sub_char2);
			updL_bldr.addSet(t.sub_char3);
			updL_bldr.addSet(t.plnt_aprv_prnt_flg);
			updL_bldr.addSet(t.plnt_aprv_prnt_tm);
			updL_bldr.addSet(t.seq);
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk02_RsltR>> splitUp(MCList<Chk02_RsltR> list, int max) {
			List<MCList<Chk02_RsltR>> ret = new ArrayList<>();

			MCList<Chk02_RsltR>[] grpL = list.groupList(Chk02_RsltR.$itm_cd
					, Chk02_RsltR.$itm_sub1, Chk02_RsltR.$itm_sub2, Chk02_RsltR.$itm_sub3);
			MCList<Chk02_RsltR> tmp = MCList.create(Chk02_RsltR.class);
			for (MCList<Chk02_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk02_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		/**
		 * 処理結果状態区分を設定する。
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk02_RsltR> l) {
			dbTran().commit();
			for (Chk02_RsltR r : l) {
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
		protected void handleEx(Exception e, MCList<Chk02_RsltR> l) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			// 画面にエラー内容を表示するために、メッセージプールにaddしているが、Exceptionと上り電文の行との対応付けはできないので、
			// causeRowは設定しない
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk02_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		protected Map_MST_PLNT_APRV_R_Chk02_RsltR<MST_PLNT_APRV_R,Chk02_RsltR> createMap_MST_PLNT_APRV_R_Chk02_RsltR() {
			return new Map_MST_PLNT_APRV_R_Chk02_RsltR<MST_PLNT_APRV_R, Chk02_RsltR>();
		}

		public class Map_MST_PLNT_APRV_R_Chk02_RsltR<D extends MST_PLNT_APRV_R, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PLNT_APRV_R.$plnt_aprv_no, Chk02_RsltR.$plnt_aprv_no);
				addColumnPathMap(MST_PLNT_APRV_R.$intr_rmrks, Chk02_RsltR.$intr_rmrks);
				addColumnPathMap(MST_PLNT_APRV_R.$sub_char1, Chk02_RsltR.$sub_char1);
				addColumnPathMap(MST_PLNT_APRV_R.$sub_char2, Chk02_RsltR.$sub_char2);
				addColumnPathMap(MST_PLNT_APRV_R.$sub_char3, Chk02_RsltR.$sub_char3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (src.plnt_aprv_prnt_flg()) {
					dest.seq(src.seq().add(MCNumber.ONE));
				}
				else {
					dest.seq(src.seq());
				}
				dest.plnt_aprv_prnt_flg(false);
				dest.plnt_aprv_prnt_tm(null);
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 承認・却下を取り消す。<br>
	 */
	public class Del01 extends MSBFL_PlntAprvReg_MC_A.Del01 {
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

			MCList<Chk03_RsltR> notErrL = up0().subList(Chk03_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {

				// 工場出荷承認情報更新
				updPlntAprv(notErrL);
	
				// ロット情報サービスの区分更新
				callLotServiceUpd05(notErrL);
	
				// 市場出荷判定情報サービスの市場出荷判定作成
				callMrktJudgServiceUpd01(notErrL);

				// プッシュ通知
				callPushNtc(notErrL);
			}
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk03_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk03_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk03_RsltR> up0L = ((MCList<Chk03_RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			up0().sort(Chk03_RsltR.$plnt_aprv_no);
			setPegNo(Chk03_RsltR.$peg_no, up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			putNames();
			down0().setAll(up0());
		}

		/**
		 * 定数名を設定する。
		 */
		protected void putNames() {
			MSC_PLNT_APRV_STS_TYP.putNameNE(up0(), Chk03_RsltR.$plnt_aprv_sts_typ, Chk03_RsltR.$plnt_aprv_sts_typ_nm, getUsrLocale());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MSBFL_PlntAprvReg.Chk03 ope = MSBFL_PlntAprvReg.crtChk03();
			ope.up0().setAll(up0());
			ope.exec();
		}

		/**
		 * 工場出荷承認ヘッダを更新する。
		 * 
		 * @param notErrL
		 */
		protected void updPlntAprv(MCList<Chk03_RsltR> notErrL) {
			MCList<MST_PLNT_APRV_R> updL = MCList.create(MST_PLNT_APRV_R.class);

			addAll(updL, notErrL, createMap_MST_PLNT_APRV_R_Chk03_RsltR());

			if (!updL.isEmpty()) {
				MST_PLNT_APRV_R t = MST_PLNT_APRV_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				// 更新項目設定
				editPlntAprvLSetStmt(updL, t, updL_bldr);

				dbUpdateKey("MSBFL0080_MST_PLNT_APRV_U03", updL, updL_bldr);
			}
		}

		/**
		 * ロット情報サービスの区分更新を呼び出す。
		 * 
		 * @param notErrL
		 */
		protected void callLotServiceUpd05(MCList<Chk03_RsltR> notErrL) {
			MSBFL_LotService.Lot_Upd05 upd = MSBFL_LotService.crtLot_Upd05();
			addAll(upd.up0(), notErrL, createMap_Lot_Upd05_CndR_Chk03_RsltR());

			upd.exec();
		}

		/**
		 * 市場出荷判定情報サービスの市場出荷判定作成を呼び出す。
		 * 
		 * @param notErrL
		 */
		protected void callMrktJudgServiceUpd01(MCList<Chk03_RsltR> notErrL) {
			MCList<Chk03_RsltR> acptSubL = notErrL.subList(Chk03_RsltR.$plnt_aprv_sts_typ_db, MSC_PLNT_APRV_STS_TYP.ACPT.value());
			if (acptSubL.isEmpty()) {
				return;
			}

			MCList<MST_PLNT_APRV_D_R> bindL = MCList.create(MST_PLNT_APRV_D_R.class);
			for (Chk03_RsltR r : acptSubL) {
				MST_PLNT_APRV_D_R bindR = MST_PLNT_APRV_D_R.create();
				bindR.plnt_aprv_no(r.plnt_aprv_no());
				bindL.add(bindR);
			}

			MST_PLNT_APRV_D_R t = MST_PLNT_APRV_D_R.create("T");
			MCList<MST_PLNT_APRV_D_R> selectDL = MCList.create(MST_PLNT_APRV_D_R.class);
			MCQueryApiBuilder selectDL_bldr = MCQueryApiBuilder.create(t);
			selectDL_bldr.setOrderByAsc(t.plnt_aprv_no, t.plnt_aprv_d_no);
			dbSelectColumn("MSBFL0080_MST_PLNT_APRV_D_S08", selectDL, selectDL_bldr, bindL, MST_PLNT_APRV_D_R.$plnt_aprv_no);

			String strPlntAprvNo = null;
			Chk03_RsltR upR = null;
			MCIndexKey idxkey = acptSubL.createIndex(Chk03_RsltR.$plnt_aprv_no);
			MSBFL_MrktJudgService.MrktJudg_Upd01 upd = MSBFL_MrktJudgService.crtMrktJudg_Upd01();
			for (MST_PLNT_APRV_D_R selectDR : selectDL) {
				if (!isSame(strPlntAprvNo, selectDR.plnt_aprv_no())) {
					upR = acptSubL.getFirst(idxkey, selectDR.plnt_aprv_no());
				}
				MrktJudg_Chk01_RsltR mrktR = MrktJudg_Chk01_RsltR.create();
				copy(mrktR, upR, createMap_MrktJudg_Chk01_RsltR_Chk03_RsltR());
				mrktR.mrkt_judg_src_no_del(selectDR.plnt_aprv_d_no());
				upd.up0().add(mrktR);
			}

			upd.exec();
		}

		/**
		 * プッシュ通知を実行する。
		 * 
		 * @param bindL
		 */
		protected void callPushNtc(MCList<Chk03_RsltR> notErrL) {
			MCList<MST_PLNT_APRV_D_R> bindL = MCList.create(MST_PLNT_APRV_D_R.class);
			for (Chk03_RsltR rsltR : notErrL) {
				MST_PLNT_APRV_D_R bindR = MST_PLNT_APRV_D_R.create();
				bindR.plnt_aprv_no(rsltR.plnt_aprv_no());
				bindL.add(bindR);
			}

			if (!bindL.isEmpty()) {
				MCList<Chk03_RsltR> pushTmpL = MCList.create(Chk03_RsltR.class);

				// 検査判定部門 または 実績部門にプッシュ通知情報作成
				pushTmpL.addAll(crtPushNtcInfoForInsp(bindL));

				// 製造承認部門にプッシュ通知情報作成
				pushTmpL.addAll(crtPushNtcInfoForMfg(bindL));

				MCIndexKey idxkey = pushTmpL.createIndex(Chk03_RsltR.$push_dpt_cd, Chk03_RsltR.$aprv_dt);
				for (Chk03_RsltR rsltR : pushTmpL.groupBy(Chk03_RsltR.$push_dpt_cd, Chk03_RsltR.$aprv_dt)) {
					MCList<Chk03_RsltR> tmpL = pushTmpL.subList(idxkey, rsltR.push_dpt_cd(), rsltR.aprv_dt());
					int cnt = tmpL.groupBy(Chk03_RsltR.$plnt_aprv_no).size();

					MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();

					MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.PLNT_APRV_RESULT);
					info.setMsg(new MCMessage(MSBFL0096, cnt));
					info.addDpt(rsltR.push_dpt_cd(), nvl(rsltR.aprv_dt(), getToday()));
					info.addScrBind(MSC_PLNT_APRV_REG_OPE.OPE_REF.value(), true, false, false, null, null, toYMDHMSString(getToday()), toYMDHMSString(getToday().endTimeOfDay()));

					mgr.exec();
				}
			}
		}

		/**
		 * 検査実績部門のプッシュ通知情報を作成する。
		 * 
		 * @param bindL
		 * @return
		 */
		protected MCList<Chk03_RsltR> crtPushNtcInfoForInsp(MCList<MST_PLNT_APRV_D_R> bindL) {
			MCList<Chk03_RsltR> pushTmpL = MCList.create(Chk03_RsltR.class);
			// 検査実績の部門情報を取得する
			MCList<MST_PLNT_APRV_D_R> selectL = getPlntAprvDLForInsp(bindL);
			if (selectL.isEmpty()) {
				return pushTmpL;
			}

			MCIndexKey idxkey = selectL.createIndex(MST_PLNT_APRV_D_R.$plnt_aprv_no);
			for (Chk03_RsltR rsltR : up0()) {
				MST_PLNT_APRV_D_R selectR = selectL.getFirst(idxkey, rsltR.plnt_aprv_no());
				if (isNull(selectR)) {
					continue;
				}
				Chk03_RsltR newR = Chk03_RsltR.create();
				if (isSame(selectR.getStringNE("INSP_APRV_FLG"), "1")) {
					newR.push_dpt_cd(selectR.getStringNE("JUDG_DPT_CD"));
				}
				else {
					newR.push_dpt_cd(selectR.getStringNE("ACT_DPT_CD"));
				}
				newR.plnt_aprv_no(selectR.plnt_aprv_no());
				newR.aprv_dt(rsltR.aprv_dt());
				pushTmpL.add(newR);
			}
			return pushTmpL;
		}

		/**
		 * 製造承認部門 または 実績部門にプッシュ通知情報を作成する。
		 * 
		 * @param bindL
		 * @return
		 */
		protected MCList<Chk03_RsltR> crtPushNtcInfoForMfg(MCList<MST_PLNT_APRV_D_R> bindL) {
			MCList<Chk03_RsltR> pushTmpL = MCList.create(Chk03_RsltR.class);

			MCList<MST_PLNT_APRV_D_R> selectL = getPlntAprvDLForMfg(bindL);
			if (selectL.isEmpty()) {
				return pushTmpL;
			}

			MCIndexKey idxkey = selectL.createIndex(MST_PLNT_APRV_D_R.$plnt_aprv_no);
			for (Chk03_RsltR rsltR : up0()) {
				MST_PLNT_APRV_D_R selectR = selectL.getFirst(idxkey, rsltR.plnt_aprv_no());
				if (isNull(selectR)) {
					continue;
				}
				Chk03_RsltR newR = Chk03_RsltR.create();
				if (isSame(selectR.getStringNE("APRV_FLG"), "1")) {
					newR.push_dpt_cd(selectR.getStringNE("APRV_DPT_CD"));
				}
				else {
					newR.push_dpt_cd(selectR.getStringNE("ACT_DPT_CD"));
				}
				newR.plnt_aprv_no(selectR.plnt_aprv_no());
				newR.aprv_dt(rsltR.aprv_dt());
				pushTmpL.add(newR);
			}

			return pushTmpL;
		}

		/**
		 * 工場出荷承認ヘッダ更新用のdbContainerのset句を編集する。
		 * @param updL 更新用リスト
		 */
		protected void editPlntAprvLSetStmt(MCList<MST_PLNT_APRV_R> updL, MST_PLNT_APRV_R t, MCQueryApiBuilder updL_bldr) {
			updL_bldr.setSet(t.plnt_aprv_sts_typ);
			updL_bldr.addSet(t.skip_chk_ship_flg);
			updL_bldr.addSet(t.aprv_dt);
			updL_bldr.addSet(t.aprv_usr_cd);
			updL_bldr.addSet(t.aprv_dpt_cd);
			updL_bldr.addSet(t.plnt_aprv_prnt_flg);
			updL_bldr.addSet(t.plnt_aprv_prnt_tm);
			updL_bldr.addSet(t.seq);
			updL_bldr.addSet(t.aprv_rsn);
			updL_bldr.addSet(t.intr_rmrks);
			updL_bldr.addSet(t.sub_char1);
			updL_bldr.addSet(t.sub_char2);
			updL_bldr.addSet(t.sub_char3);
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk03_RsltR>> splitUp(MCList<Chk03_RsltR> list, int max) {
			List<MCList<Chk03_RsltR>> ret = new ArrayList<>();

			MCList<Chk03_RsltR>[] grpL = list.groupList(Chk03_RsltR.$itm_cd
					, Chk03_RsltR.$itm_sub1, Chk03_RsltR.$itm_sub2, Chk03_RsltR.$itm_sub3);
			MCList<Chk03_RsltR> tmp = MCList.create(Chk03_RsltR.class);
			for (MCList<Chk03_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk03_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		/**
		 * 処理結果状態区分を設定する。
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk03_RsltR> l) {
			dbTran().commit();
			for (Chk03_RsltR r : l) {
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
		protected void handleEx(Exception e, MCList<Chk03_RsltR> l) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			// 画面にエラー内容を表示するために、メッセージプールにaddしているが、Exceptionと上り電文の行との対応付けはできないので、
			// causeRowは設定しない
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk03_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		protected Map_MST_PLNT_APRV_R_Chk03_RsltR<MST_PLNT_APRV_R,Chk03_RsltR> createMap_MST_PLNT_APRV_R_Chk03_RsltR() {
			return new Map_MST_PLNT_APRV_R_Chk03_RsltR<MST_PLNT_APRV_R, Chk03_RsltR>();
		}

		public class Map_MST_PLNT_APRV_R_Chk03_RsltR<D extends MST_PLNT_APRV_R, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PLNT_APRV_R.$plnt_aprv_no, Chk03_RsltR.$plnt_aprv_no);
				addColumnPathMap(MST_PLNT_APRV_R.$plnt_aprv_sts_typ, Chk03_RsltR.$plnt_aprv_sts_typ);
				addColumnPathMap(MST_PLNT_APRV_R.$seq, Chk03_RsltR.$seq);
				addColumnPathMap(MST_PLNT_APRV_R.$aprv_rsn, Chk03_RsltR.$aprv_rsn);
				addColumnPathMap(MST_PLNT_APRV_R.$intr_rmrks, Chk03_RsltR.$intr_rmrks);
				addColumnPathMap(MST_PLNT_APRV_R.$sub_char1, Chk03_RsltR.$sub_char1);
				addColumnPathMap(MST_PLNT_APRV_R.$sub_char2, Chk03_RsltR.$sub_char2);
				addColumnPathMap(MST_PLNT_APRV_R.$sub_char3, Chk03_RsltR.$sub_char3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.skip_chk_ship_flg(false);
				dest.aprv_dt(null);
				dest.aprv_usr_cd(null);
				dest.aprv_dpt_cd(null);
				dest.plnt_aprv_prnt_flg(false);
				dest.plnt_aprv_prnt_tm(null);
			}
		}

		protected Map_Lot_Upd05_CndR_Chk03_RsltR<Lot_Upd05_CndR,Chk03_RsltR> createMap_Lot_Upd05_CndR_Chk03_RsltR() {
			return new Map_Lot_Upd05_CndR_Chk03_RsltR<Lot_Upd05_CndR, Chk03_RsltR>();
		}

		public class Map_Lot_Upd05_CndR_Chk03_RsltR<D extends Lot_Upd05_CndR, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd05_CndR.$itm_cd, Chk03_RsltR.$itm_cd);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub1, Chk03_RsltR.$itm_sub1);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub2, Chk03_RsltR.$itm_sub2);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub3, Chk03_RsltR.$itm_sub3);
				addColumnPathMap(Lot_Upd05_CndR.$lot_no, Chk03_RsltR.$lot_no);
				addColumnPathMap(Lot_Upd05_CndR.$sublot_no, Chk03_RsltR.$sublot_no);
				addColumnPathMap(Lot_Upd05_CndR.$plnt_aprv_sts_typ, Chk03_RsltR.$plnt_aprv_sts_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.plnt_aprv_flg(true);
			}
		}
	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 工場出荷記録書を発行する。<br>
	 */
	public class Prnt01 extends MSBFL_PlntAprvReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {

			editUp();

			// 工場出荷記録書発行
			callInspRptServicePrnt03();

			// 処理結果状況区分設定
			setRtnStsTyp();

			// 下り電文設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Prnt01_RsltR.$peg_no, up0());
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
			for (Prnt01_RsltR r : up0()) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * 工場出荷記録書を発行する。
		 */
		protected void callInspRptServicePrnt03() {
			MSBFL_InspRptService.InspRpt_Prnt03 prnt = MSBFL_InspRptService.crtInspRpt_Prnt03();

			addAll(prnt.up0(), up0(), createMap_InspRpt_Prnt03_DtlR_Prnt01_RsltR());

			prnt.exec();

			String[] destCols = new String[] {Prnt01_RsltR.$plnt_aprv_prnt_flg, Prnt01_RsltR.$plnt_aprv_prnt_tm, Prnt01_RsltR.$err_flg};
			String[] srcCols = new String[] {InspRpt_Prnt03_DtlR.$plnt_aprv_prnt_flg, InspRpt_Prnt03_DtlR.$plnt_aprv_prnt_tm, InspRpt_Prnt03_DtlR.$err_flg};
			copyByPegNo(up0(), destCols, prnt.down0(), srcCols);;
		}

		protected Map_InspRpt_Prnt03_DtlR_Prnt01_RsltR<InspRpt_Prnt03_DtlR,Prnt01_RsltR> createMap_InspRpt_Prnt03_DtlR_Prnt01_RsltR() {
			return new Map_InspRpt_Prnt03_DtlR_Prnt01_RsltR<InspRpt_Prnt03_DtlR, Prnt01_RsltR>();
		}

		public class Map_InspRpt_Prnt03_DtlR_Prnt01_RsltR<D extends InspRpt_Prnt03_DtlR, S extends Prnt01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspRpt_Prnt03_DtlR.$peg_no, Prnt01_RsltR.$peg_no);
				addColumnPathMap(InspRpt_Prnt03_DtlR.$plnt_aprv_no, Prnt01_RsltR.$plnt_aprv_no);
			}
		}
	}

	/**
	 * 検査実績の部門情報を取得する。
	 * 
	 * @param bindL
	 * @return
	 */
	protected MCList<MST_PLNT_APRV_D_R> getPlntAprvDLForInsp(MCList<MST_PLNT_APRV_D_R> bindL) {
		if (bindL.isEmpty()) {
			return bindL;
		}

		MST_PLNT_APRV_D_R t = MST_PLNT_APRV_D_R.create("T");
		MST_INSP_INST_R t2 = MST_INSP_INST_R.create("T2");
		MST_INSP_ACT_R t3 = MST_INSP_ACT_R.create("T3");
		MCList<MST_PLNT_APRV_D_R> selectL = MCList.create(MST_PLNT_APRV_D_R.class);
		MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
		selectL_bldr.setSelect(t.plnt_aprv_no);
		selectL_bldr.addSelect(t2.insp_aprv_flg);
		selectL_bldr.addSelect(t3.act_dpt_cd);
		selectL_bldr.addSelect(t3.judg_dpt_cd);
		selectL_bldr.addLeftOuterJoin(t2, bracket( t.insp_no.eq(t2.insp_no)));
		selectL_bldr.addLeftOuterJoin(t3, bracket( t.insp_no.eq(t3.insp_no)));
		selectL_bldr.setDistinct();
		selectL_bldr.setWhere(t.plnt_aprv_no.eq(bind("plnt_aprv_no")));
		dbSelect("MSBFL0080_MST_PLNT_APRV_D_S09", selectL, selectL_bldr, bindL);

		return selectL;
	}


	/**
	 * 製造実績の部門情報を取得する。
	 * 
	 * @param bindL
	 * @return
	 */
	protected MCList<MST_PLNT_APRV_D_R> getPlntAprvDLForMfg(MCList<MST_PLNT_APRV_D_R> bindL) {
		if (bindL.isEmpty()) {
			return bindL;
		}

		MST_PLNT_APRV_D_R t = MST_PLNT_APRV_D_R.create("T");
		MST_YIELD_ACT_R t2 = MST_YIELD_ACT_R.create("T2");
		MST_MFG_ACT_R t3 = MST_MFG_ACT_R.create("T3");
		MST_MFG_INST_R t4 = MST_MFG_INST_R.create("T4");
		MCList<MST_PLNT_APRV_D_R> selectL = MCList.create(MST_PLNT_APRV_D_R.class);
		MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
		selectL_bldr.setSelect(t.plnt_aprv_no);
		selectL_bldr.addSelect(t4.aprv_flg);
		selectL_bldr.addSelect(t3.act_dpt_cd);
		selectL_bldr.addSelect(t3.aprv_dpt_cd);
		selectL_bldr.addLeftOuterJoin(t2, bracket( t.src_no4.eq(t2.yield_act_no)));
		selectL_bldr.addLeftOuterJoin(t3, bracket( t2.mfg_act_no.eq(t3.mfg_act_no)));
		selectL_bldr.addLeftOuterJoin(t4, bracket( t3.mfg_inst_no.eq(t4.mfg_inst_no)));
		selectL_bldr.setDistinct();
		selectL_bldr.setWhere(t.plnt_aprv_no.eq(bind("plnt_aprv_no")));
		selectL_bldr.addWhereWithAnd(t.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())));
		selectL_bldr.addWhereWithAnd(t.src_no4.isNotNull());
		dbSelect("MSBFL0080_MST_PLNT_APRV_D_S10", selectL, selectL_bldr, bindL);

		return selectL;
	}

	/**
	 * ログインユーザの承認役割権限チェックを行う。
	 * 
	 * @param roleCd 役割ＣＤ
	 * @return 
	 */
	protected boolean isAprvUsrR(String roleCd) {
		String loginUsrId = mcframe.serverCore.sys.MCSys.user.ID();

		MAVM_APRV_USR_R t = MAVM_APRV_USR_R.create("T");
		int cnt = execDbCount("MSBFL0080_MAVM_APRV_USR_S01", t, t.aprv_role_cd.eq(bind("1"))
				.and(t.usr_cd.eq(bind("2")))
				.and(t.st_dt.lte(bind("3")))
				.and( t.end_dt.isNull()
					.or(t.end_dt.gte(bind("3")))), roleCd, loginUsrId, getToday());

		return cnt > 0;
	}

	// Mapper
	protected Map_MrktJudg_Chk01_RsltR_Chk01_RsltR<MrktJudg_Chk01_RsltR,Chk01_RsltR> createMap_MrktJudg_Chk01_RsltR_Chk01_RsltR() {
		return new Map_MrktJudg_Chk01_RsltR_Chk01_RsltR<MrktJudg_Chk01_RsltR, Chk01_RsltR>();
	}

	public class Map_MrktJudg_Chk01_RsltR_Chk01_RsltR<D extends MrktJudg_Chk01_RsltR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MrktJudg_Chk01_RsltR.$peg_no, Chk01_RsltR.$peg_no);
			addColumnPathMap(MrktJudg_Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_cd);
			addColumnPathMap(MrktJudg_Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub1);
			addColumnPathMap(MrktJudg_Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub2);
			addColumnPathMap(MrktJudg_Chk01_RsltR.$itm_sub3, Chk01_RsltR.$itm_sub3);
			addColumnPathMap(MrktJudg_Chk01_RsltR.$lot_no, Chk01_RsltR.$lot_no);
			addColumnPathMap(MrktJudg_Chk01_RsltR.$sublot_no, Chk01_RsltR.$sublot_no);
			addColumnPathMap(MrktJudg_Chk01_RsltR.$site_cd, Chk01_RsltR.$site_cd);
			addColumnPathMap(MrktJudg_Chk01_RsltR.$upd_dt, Chk01_RsltR.$aprv_dt);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.mrkt_judg_src_typ(MSC_MRKT_JUDG_SRC_TYP.PLNT_APRV.value());
		}
	}

	protected Map_MrktJudg_Chk01_RsltR_Chk03_RsltR<MrktJudg_Chk01_RsltR,Chk03_RsltR> createMap_MrktJudg_Chk01_RsltR_Chk03_RsltR() {
		return new Map_MrktJudg_Chk01_RsltR_Chk03_RsltR<MrktJudg_Chk01_RsltR, Chk03_RsltR>();
	}

	public class Map_MrktJudg_Chk01_RsltR_Chk03_RsltR<D extends MrktJudg_Chk01_RsltR, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MrktJudg_Chk01_RsltR.$peg_no, Chk03_RsltR.$peg_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.mrkt_judg_src_typ(MSC_MRKT_JUDG_SRC_TYP.PLNT_APRV.value());
		}
	}

	//FMCB CUSTOM END
}