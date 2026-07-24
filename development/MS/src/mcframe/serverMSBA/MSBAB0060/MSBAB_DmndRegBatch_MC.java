package mcframe.serverMSBA.MSBAB0060;

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
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil;
import mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil;
import mcframe.serverMSBA.MSBAL5120.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0170.*;

import java.util.ArrayList;
import java.util.List;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBAB_DmndRegBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBAB_DmndRegBatch_MC extends MSBAB_DmndRegBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * DmndReg_Upd01オペレーション.<p>
	 *
	 * 需要情報を登録・削除する<br>
	 */
	public class DmndReg_Upd01 extends MSBAB_DmndRegBatch_MC_A.DmndReg_Upd01 {
		
		/** 対象件数 */
		protected int _totalCnt;
		/** 正常終了件数 */
		protected int _successCnt;
		/** エラー件数 */
		protected int _errorCnt;
		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initLogger();
				writeStartLog();
				execMain();
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				writeEndLog();
			}
		}
		
		/**
		 * バッチログを初期化する。
		 */
		protected void initLogger() {
			getConcurrentLogger();
		}
		
		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {
			logger().writeStartLog(MSBAL0004);
			pushStartLog(logger());
		}
		
		/**
		 * 需要情報作成処理のメイン処理
		 */
		protected void execMain() {
			_totalCnt = 0;
			_successCnt = 0;
			_errorCnt = 0;

			chk();
			if(!hasErrMsg()) {
				MCList<MST_DMND_R> dmndL = getData();
				if(dmndL.isEmpty()) {
					return;
				}
				
				// 組織変更対応
				for (MST_DMND_R r : dmndL) {
					r.setValueNE("PERIOD_ST_DT", MAUCL_DateUtil.getPeriodStDt(r.dmnd_st_dt(), MAC_PERIOD_TYP.MONTHLY.value()));
				}
				execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_DPT$F_GET_DPT_CD_NE", "01"), MABCFunction.getFunctionExecuter("MAPA_DPT$F_GET_DPT_CD_NE"), "NEW_DPT_CD", dmndL, MST_DMND_R.$dmnd_dpt_cd, "PERIOD_ST_DT");
				
				// 部門が取得できない場合は対象外にする
				MCList<MST_DMND_R> errDmndL = MCList.create(MST_DMND_R.class);
				MCList<MST_DMND_R> notErrDmndL = MCList.create(MST_DMND_R.class);
				notErrDmndL.addStringColumn("NEW_DPT_CD");
				for (MST_DMND_R r : dmndL) {
					if (isNull(r.getStringNE("NEW_DPT_CD"))) {
						errDmndL.add(r);
					}
					else {
						notErrDmndL.add(r);
					}
				}
				if (!errDmndL.isEmpty()) {
					for (MCList<MST_DMND_R> errL : errDmndL.groupList("PERIOD_ST_DT", MST_DMND_R.$dmnd_dpt_cd)) {
						logger().writeProcessLog(MSBAL0034, toYMDString(errL.get(0).getDate("PERIOD_ST_DT")), errL.get(0).dmnd_dpt_cd());
					}
				}
				
				MCList<MST_DMND_R> tmpDmndL = MCList.create(MST_DMND_R.class);
				MCIndexKey key = notErrDmndL.createIndex(MST_DMND_R.$itm_cd, MST_DMND_R.$itm_sub1, MST_DMND_R.$itm_sub2, MST_DMND_R.$itm_sub3);
				for (MST_DMND_R dmndR : notErrDmndL.groupBy(MST_DMND_R.$itm_cd, MST_DMND_R.$itm_sub1, MST_DMND_R.$itm_sub2, MST_DMND_R.$itm_sub3, MST_DMND_R.$dmnd_dpt_cd, "NEW_DPT_CD")) {
					// 件数は品目のみで同件数とする
					MCList<MST_DMND_R> tmpL = notErrDmndL.subList(key, dmndR.itm_cd(), dmndR.itm_sub1(), dmndR.itm_sub2(), dmndR.itm_sub3());
					dmndR.addNumberColumn("CNT", MCNumber.valueOf(tmpL.size()));
					tmpDmndL.add(dmndR);
				}
				MCSortPolicy sortPolicy = new MCSortPolicy();
				sortPolicy.add(MCList.SortType.DESC, "CNT");
				sortPolicy.add(MCList.SortType.ASC, MST_DMND_R.$itm_cd);
				sortPolicy.add(MCList.SortType.ASC, MST_DMND_R.$itm_sub1);
				sortPolicy.add(MCList.SortType.ASC, MST_DMND_R.$itm_sub2);
				sortPolicy.add(MCList.SortType.ASC, MST_DMND_R.$itm_sub3);
				sortPolicy.add(MCList.SortType.ASC, "NEW_DPT_CD");
				sortPolicy.add(MCList.SortType.ASC, MST_DMND_R.$dmnd_dpt_cd);
				tmpDmndL.sort(sortPolicy);
				
				List<MSBAB_DmndRegBatch.DmndReg_Upd02> opeL = new ArrayList<>();
				for (MCList<DmndReg_Upd02_CndR> cndL : splitTgt(tmpDmndL)) {
					MSBAB_DmndRegBatch.DmndReg_Upd02 ope = MSBAB_DmndRegBatch.crtDmndReg_Upd02();
					ope.up0().addAll(cndL);
					opeL.add(ope);
				}
				if (!opeL.isEmpty()) {
					if(MCServerThreadManager.getLimitThreadSize() == 1) {
						MCServerThreadManager.setUseMainDBTran(true);
					}
					MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
				}
				
				for (MSBAB_DmndRegBatch.DmndReg_Upd02 ope : opeL) {
					for (DmndReg_Upd02_RsltR downR : ope.down0()) {
						_totalCnt += downR.total_cnt().intValue();
						_successCnt += downR.success_cnt().intValue();
						_errorCnt += downR.error_cnt().intValue();
					}
				}
			}
		}
		
		/**
		 * 上り電文のチェック
		 */
		protected void chk() {
			MCMessagePool.addAll(check(up0(), DmndReg_Upd01_CndR.$reg_st_dt, new FXUCL_RequiredValidater()));
			MCMessagePool.addAll(check(up0(), DmndReg_Upd01_CndR.$reg_end_dt, new FXUCL_RequiredValidater()));
			String[] cols = {DmndReg_Upd01_CndR.$reg_st_dt, DmndReg_Upd01_CndR.$reg_end_dt};
			MCMessagePool.addAll(check(up0(), cols, new FXUCL_BeforeAfterValidater()));
			if(!MCMessagePool.getMessageList().isEmpty()) {
				logger().writeDataLog(MCMessagePool.getMessageList());
			}
		}
		
		/**
		 * 対象の需要データを取得する。
		 * @return 対象の需要データ
		 */
		protected MCList<MST_DMND_R> getData() {
			MCList<MST_DMND_R> dmndL = MCList.create(MST_DMND_R.class);
			dmndL.addAll(getDmnd());
			dmndL.addAll(getSpln());
			dmndL.addAll(getCstFrcst());
			dmndL.addAll(getSlo());
			
			dmndL.addDateColumn("PERIOD_ST_DT");
			dmndL.addStringColumn("NEW_DPT_CD");
			return dmndL;
		}

		protected MCList<MST_DMND_R> getDmnd() {
			MCList<MST_DMND_R> dmndL = MCList.create(MST_DMND_R.class);
			MST_DMND_R t = MST_DMND_R.create("T");
			MCQueryApiBuilder dmndL_bldr = MCQueryApiBuilder.create(t);
			dmndL_bldr.setSelect(t.dmnd_dpt_cd);
			dmndL_bldr.addSelect(t.itm_cd);
			dmndL_bldr.addSelect(t.itm_sub1);
			dmndL_bldr.addSelect(t.itm_sub2);
			dmndL_bldr.addSelect(t.itm_sub3);
			dmndL_bldr.addSelect(t.dlv_schd_st_dt.as("dmnd_st_dt"));
			dmndL_bldr.setWhere(t.dlv_schd_end_dt.gte(bind("1")), up0().reg_st_dt());
			dbSelect("MSBAB0060_MST_DMND_S01", dmndL, dmndL_bldr);
			
			return dmndL;
		}
		
		/**
		 * 販売計画を取得
		 * @return
		 */
		protected MCList<MST_DMND_R> getSpln() {
			MAM_DPT_R m1 = MAM_DPT_R.create("M1");
			MST_SPLN_SUM_ITM_NEW_R S1TMP = MST_SPLN_SUM_ITM_NEW_R.create("TMP");
			MCList<MST_SPLN_SUM_ITM_NEW_R> splnSumItmNewL = MCList.create(MST_SPLN_SUM_ITM_NEW_R.class);
			MST_SPLN_SUM_ITM_NEW_R t = MST_SPLN_SUM_ITM_NEW_R.create("T");
			MCQueryApiBuilder splnSumItmNewL_bldr = MCQueryApiBuilder.create(t);
			MCList<MST_DMND_R> dmndL = MCList.create(MST_DMND_R.class);
			
			splnSumItmNewL_bldr.setSelect(t.dpt_cd);
			splnSumItmNewL_bldr.addSelect(t.itm_cd);
			splnSumItmNewL_bldr.addSelect(t.itm_sub1);
			splnSumItmNewL_bldr.addSelect(t.itm_sub2);
			splnSumItmNewL_bldr.addSelect(t.itm_sub3);
			splnSumItmNewL_bldr.addSelect(t.spln_ym.as("dmnd_st_dt"));
			splnSumItmNewL_bldr.addInnerJoin(m1, bracket(
					m1.dpt_cd.eq(t.dpt_cd).and(t.spln_ym.between(m1.st_dt, m1.end_dt))));
			splnSumItmNewL_bldr.setWhere(t.spln_ym.between(bind("1"), bind("2")),
					MAUCL_DateUtil.getPeriodStDt(up0().reg_st_dt(),
							MAC_PERIOD_TYP.MONTHLY.value()),
					MAUCL_DateUtil.getPeriodEndDt(up0().reg_end_dt(),
							MAC_PERIOD_TYP.MONTHLY.value()));
			splnSumItmNewL_bldr.addWhereWithAnd(t.ym.in(subQuery().select(max(S1TMP.ym))
					.from(S1TMP)
					.where(value(0).eq(value(0))
							.and(S1TMP.dpt_cd.eq(t.dpt_cd))
							.and(S1TMP.cst_cd.eq(t.cst_cd))
							.and(S1TMP.wrk_no.eq(t.wrk_no))
							.and(S1TMP.spln_itm_cd.eq(t.spln_itm_cd))
							.and(S1TMP.itm_cd.eq(t.itm_cd))
							.and(S1TMP.itm_sub1.eq(t.itm_sub1))
							.and(S1TMP.itm_sub2.eq(t.itm_sub2))
							.and(S1TMP.itm_sub3.eq(t.itm_sub3))
							.and(S1TMP.cur_cd.eq(t.cur_cd))
							.and(S1TMP.spln_ym.eq(t.spln_ym)))));
			dbSelect("MSBAB0060_MST_SPLN_SUM_ITM_NEW_S01", splnSumItmNewL, splnSumItmNewL_bldr);

			for(MST_SPLN_SUM_ITM_NEW_R r : splnSumItmNewL) {
				MST_DMND_R dmndR = MST_DMND_R.create();
				dmndR.itm_cd(r.itm_cd());
				dmndR.itm_sub1(r.itm_sub1());
				dmndR.itm_sub2(r.itm_sub2());
				dmndR.itm_sub3(r.itm_sub3());
				dmndR.dmnd_dpt_cd(r.dpt_cd());
				dmndR.dmnd_st_dt(r.getDateNE("DMND_ST_DT"));
				dmndL.add(dmndR);
			}
			
			return dmndL;
		}
		
		/**
		 * 顧客期間内示を取得
		 * @return
		 */
		protected MCList<MST_DMND_R> getCstFrcst() {
			MST_CST_FRCST_H_R t2 = MST_CST_FRCST_H_R.create("T2");
			MST_CST_FRCST_D_R S1TMP = MST_CST_FRCST_D_R.create("TMP");
			MST_CST_FRCST_H_R S1TMP2 = MST_CST_FRCST_H_R.create("TMP2");
			MCList<MST_CST_FRCST_D_R> cstFrcstDL = MCList.create(MST_CST_FRCST_D_R.class);
			MST_CST_FRCST_D_R t = MST_CST_FRCST_D_R.create("T");
			MCQueryApiBuilder cstFrcstDL_bldr = MCQueryApiBuilder.create(t);
			MCList<MST_DMND_R> dmndL = MCList.create(MST_DMND_R.class);
			cstFrcstDL_bldr.addSelect(t.itm_cd);
			cstFrcstDL_bldr.addSelect(t.itm_sub1);
			cstFrcstDL_bldr.addSelect(t.itm_sub2);
			cstFrcstDL_bldr.addSelect(t.itm_sub3);
			cstFrcstDL_bldr.addSelect(t2.frcst_dpt_cd);
			cstFrcstDL_bldr.addSelect(t.frcst_st_dt.as("dmnd_st_dt"));
			cstFrcstDL_bldr.addInnerJoin(t2, bracket( t2.cst_frcst_no.eq(t.cst_frcst_no)));

			cstFrcstDL_bldr.setWhere(t.frcst_st_dt.lte(bind("1")), up0().reg_end_dt());
			cstFrcstDL_bldr.addWhereWithAnd(t.frcst_end_dt.gte(bind("1")),
					up0().reg_st_dt());
			cstFrcstDL_bldr.addWhereWithAnd(t2.can_flg.eq(value(false)));
			cstFrcstDL_bldr.addWhereWithAnd(t2.rcpt_dt.in(subQuery()
					.select(max(S1TMP2.rcpt_dt))
					.from(S1TMP.innerJoin(S1TMP2)
							.on(bracket(S1TMP2.cst_frcst_no.eq(S1TMP.cst_frcst_no))))
					.where(value(0).eq(value(0))
							.and(S1TMP2.can_flg.eq(value(false)))
							.and(S1TMP2.cst_cd.eq(t2.cst_cd))
							.and(S1TMP2.dlv_cd.eq(t2.dlv_cd)
									.or(S1TMP2.dlv_cd.isNull()
											.and(t2.dlv_cd.isNull())))
							.and(S1TMP2.wrk_no.eq(t2.wrk_no)
									.or(S1TMP2.wrk_no.isNull()
											.and(t2.wrk_no.isNull())))
							.and(S1TMP2.frcst_dpt_cd.eq(t2.frcst_dpt_cd))
							.and(S1TMP2.frcst_usr_cd.eq(t2.frcst_usr_cd)
									.or(S1TMP2.frcst_usr_cd.isNull()
											.and(t2.frcst_usr_cd.isNull())))
							.and(S1TMP.itm_cd.eq(t.itm_cd))
							.and(S1TMP.itm_sub1.eq(t.itm_sub1))
							.and(S1TMP.itm_sub2.eq(t.itm_sub2))
							.and(S1TMP.itm_sub3.eq(t.itm_sub3))
							.and(S1TMP.frcst_period_typ.eq(t.frcst_period_typ))
							.and(S1TMP.frcst_dt.eq(t.frcst_dt)))));
			dbSelect("MSBAB0060_MST_CST_FRCST_D_S01", cstFrcstDL, cstFrcstDL_bldr);

			for(MST_CST_FRCST_D_R r : cstFrcstDL) {
				MST_DMND_R dmndR = MST_DMND_R.create();
				dmndR.itm_cd(r.itm_cd());
				dmndR.itm_sub1(r.itm_sub1());
				dmndR.itm_sub2(r.itm_sub2());
				dmndR.itm_sub3(r.itm_sub3());
				dmndR.dmnd_dpt_cd(r.getStringNE("FRCST_DPT_CD"));
				dmndR.dmnd_st_dt(r.getDateNE("DMND_ST_DT"));
				dmndL.add(dmndR);
			}

			return dmndL;
		}
		
		/**
		 * 受注を取得
		 * @return
		 */
		protected MCList<MST_DMND_R> getSlo() {
			MST_SLO_R t2 = MST_SLO_R.create("T2");
			MST_SHIP_PR_R t3 = MST_SHIP_PR_R.create("T3");
			MST_SHIP_SCHD_R t4 = MST_SHIP_SCHD_R.create("T4");
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t);
			MCList<MST_DMND_R> dmndL = MCList.create(MST_DMND_R.class);
			
			sloDL_bldr.addSelect(t.itm_cd);
			sloDL_bldr.addSelect(t.itm_sub1);
			sloDL_bldr.addSelect(t.itm_sub2);
			sloDL_bldr.addSelect(t.itm_sub3);
			sloDL_bldr.addSelect(t2.sls_dpt_cd);
			sloDL_bldr.addSelect(t4.ship_schd_tm.as("dmnd_st_dt"));
			sloDL_bldr.addInnerJoin(t2, bracket( t2.slo_no.eq(t.slo_no)));
			sloDL_bldr.addInnerJoin(t3, bracket(t3.slo_d_no.eq(t.slo_d_no)));
			sloDL_bldr.addInnerJoin(t4, bracket(t4.ship_pr_no.eq(t3.ship_pr_no)));
			sloDL_bldr.setWhere(t4.ship_schd_tm.between(bind("1"), bind("2")), up0().reg_st_dt(), up0().reg_end_dt());
			sloDL_bldr.addWhereWithAnd(t.abort_flg.eq(value(false))
					.or(bracket(t.abort_flg.eq(value(true)).and(t3.ship_schd_abort_qty.lt(t3.base_unit_qty)))));
			sloDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			sloDL_bldr.addWhereWithAnd(t2.can_flg.eq(value(false)));
			dbSelect("MSBAB0060_MST_SLO_D_R_S01", sloDL, sloDL_bldr);

			for(MST_SLO_D_R r : sloDL) {
				MST_DMND_R dmndR = MST_DMND_R.create();
				dmndR.itm_cd(r.itm_cd());
				dmndR.itm_sub1(r.itm_sub1());
				dmndR.itm_sub2(r.itm_sub2());
				dmndR.itm_sub3(r.itm_sub3());
				dmndR.dmnd_dpt_cd(r.getStringNE("SLS_DPT_CD"));
				dmndR.dmnd_st_dt(r.getDateNE("DMND_ST_DT"));
				dmndL.add(dmndR);
			}
			
			return dmndL;
		}
		
		/**
		 * スレッドサイズを考慮して上り電文を分割する
		 * @param list
		 * @return
		 */
		protected List<MCList<DmndReg_Upd02_CndR>> splitTgt(MCList<MST_DMND_R> list) {
			List<MCList<DmndReg_Upd02_CndR>> ret = new ArrayList<>();
			if (list.isEmpty()) {
				return ret;
			}
			int thread = MCServerThreadManager.getThreadCount(list.size());
			list.addNumberColumn("thred_num");
			int rowNum = 0;
			MST_DMND_R bfRow = null;
			for (MST_DMND_R row : list) {
				// 前行と同一キーの場合は同一スレッドで処理
				if (bfRow != null && (!isSame(row.itm_cd(), bfRow.itm_cd())
						|| !isSame(row.itm_sub1(), bfRow.itm_sub1())
						|| !isSame(row.itm_sub2(), bfRow.itm_sub2())
						|| !isSame(row.itm_sub3(), bfRow.itm_sub3())
						|| (!isSame(row.getStringNE("NEW_DPT_CD"),
								bfRow.getStringNE("NEW_DPT_CD"))
								&& !isSame(row.dmnd_dpt_cd(), bfRow.dmnd_dpt_cd())))
				) {
					rowNum++;
				}
				row.setNumberNE("thred_num", MCNumber.valueOf(rowNum%thread));
				bfRow = row;
			}

			MCList<DmndReg_Upd02_CndR> tmp = MCList.create(DmndReg_Upd02_CndR.class);
			for (int i = 0; i < thread; i++) {
				tmp = MCList.create(DmndReg_Upd02_CndR.class);
				for (MST_DMND_R row : list.subList("thred_num", MCNumber.valueOf(i)) ) {
					DmndReg_Upd02_CndR cndR = DmndReg_Upd02_CndR.create();
					cndR.reg_st_dt(up0().reg_st_dt());
					cndR.reg_end_dt(up0().reg_end_dt());
					cndR.dly_dmnd_reg_flg(up0().dly_dmnd_reg_flg());
					cndR.date_div_flg(up0().date_div_flg());
					cndR.itm_cd(row.itm_cd());
					cndR.itm_sub1(row.itm_sub1());
					cndR.itm_sub2(row.itm_sub2());
					cndR.itm_sub3(row.itm_sub3());
					cndR.dpt_cd(row.dmnd_dpt_cd());
					cndR.new_dpt_cd(row.getStringNE("NEW_DPT_CD"));
					tmp.add(cndR);
	        	}
				if (!tmp.isEmpty()) {
					ret.add(tmp);
				}
	        }
	        return ret;
	    }
		
		/**
		 * 例外処理
		 * @param ex
		 */
        protected void handleEx(Exception ex) {
            MCException mcex;
            if (ex instanceof MCException) {
                mcex = (MCException) ex;
            }
            else {
                mcex = new MCException(ex);
            }
            logger().writeProcessLog(mcex);
            
            _exceptionFlg = true;

            throw mcex;
        }
        
        /**
         * 終了ログを出力する。
        */
        protected void writeEndLog() {
            if (_errorCnt > 0 || _exceptionFlg) {
                logger().writeProcessLog(MAUDL0009);
                MCMessagePool.add(MAUDL0009);
                pushErrorLog(logger());
            }
            else if (_totalCnt == 0) {
                logger().writeProcessLog(MAUDL0008);
                MCMessagePool.add(MAUDL0008);
            }
            logger().writeEndLog(MSBAL0005);
            pushEndLog(logger());
            logger().close();
        }
	}
	/**
	 * DmndReg_Upd02オペレーション.<p>
	 *
	 * 需要情報を登録・削除する(マルチスレッド用)<br>
	 */
	public class DmndReg_Upd02 extends MSBAB_DmndRegBatch_MC_A.DmndReg_Upd02 {
		/** 下り電文に設定する全処理件数 */
		protected int _totalCnt;
		/** 下り電文に設定する正常終了件数 */
		protected int _successCnt;
		/** 下り電文に設定するエラー件数 */
		protected int _errorCnt;
		/**
		 * バッチログのlogger<br>
		 * DmndReg_Upd01バッチ呼び出しオペレーションから引き継ぐ
		 */
		protected FXBAL_BatchLogger _logger = null;

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			try {
				initLogger();
				
				execMain();
				setDown();
			}
			finally {
				closeLogger();
			}
		}
		
		/**
		 * バッチログのインスタンスを取得する
		 */
		protected void initLogger() {
			if (MCServerThreadManager.isUseMainDBTran()) {
				_logger = logger();
			}
			else {
				_logger = logger().clone();
			}
		}
		
		/**
		 * バッチログをクローズする
		 */
		protected void closeLogger() {
			if (!MCServerThreadManager.isUseMainDBTran()) {
				_logger.close();
			}
		}
		
		
		/**
		 * 需要情報の削除・作成のメイン処理
		 */
		protected void execMain() {
			_totalCnt = 0;
			_successCnt = 0;
			_errorCnt = 0;
			
			delDmnd();
			insDmnd();
			delDlyDmnd();
		}
		
		/**
		 * 需要情報の削除
		 */
		protected void delDmnd() {
			// その他需要以外は削除
			MCList<MST_DMND_R> dmndL = MCList.create(MST_DMND_R.class);
			MST_DMND_R t = MST_DMND_R.create("T");
			MCQueryApiBuilder dmndL_bldr = MCQueryApiBuilder.create(t);
			dmndL_bldr.setSelect(t.dmnd_no);
			dmndL_bldr.setWhere(t.dlv_schd_end_dt.gte(bind("reg_st_dt")));
			dmndL_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
			dmndL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			dmndL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			dmndL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			dmndL_bldr.addWhereWithAnd(t.dmnd_dpt_cd.in( bind("dpt_cd"), bind("new_dpt_cd")));
			dmndL_bldr.addWhereWithAnd(t.dmnd_typ.neq(value(MSC_DMND_TYP.MISC.value())));
			dbSelectForUpdate("MSBAB0060_MST_DMND_S02", dmndL, dmndL_bldr, up0());
			
			if(!dmndL.isEmpty()) {
				_totalCnt += dmndL.size();
				dbDeleteKey("MSBAB0060_MST_DMND_D01", dmndL, dmndL_bldr);
				_successCnt += dmndL.size();
				
				delDmndRecMap(dmndL);
			}
		}
		
		/**
		 * 不要となった需要情報消込マップを削除
		 */
		protected void delDmndRecMap(MCList<MST_DMND_R> dmndL) {
			// 消込先需要ＮＯに対する需要情報がない需要情報消込マップを削除
			MCList<MST_DMND_REC_MAP_R> delDmndRecMapL = MCList.create(MST_DMND_REC_MAP_R.class);
			MST_DMND_REC_MAP_R t = MST_DMND_REC_MAP_R.create("T");
			MCQueryApiBuilder delDmndRecMapL_bldr = MCQueryApiBuilder.create(t);
			delDmndRecMapL_bldr.setSelect(t.fr_dmnd_no);
			delDmndRecMapL_bldr.addSelect(t.to_dmnd_no);
			delDmndRecMapL_bldr.setWhere(t.to_dmnd_no.eq(bind("dmnd_no")));
			dbSelectForUpdate("MSBAB0060_MST_DMND_REC_MAP_S01", delDmndRecMapL, delDmndRecMapL_bldr, dmndL);
			
			if(!delDmndRecMapL.isEmpty()) {
				dbDeleteKey("MSBAB0060_MST_DMND_REC_MAP_D01", delDmndRecMapL, delDmndRecMapL_bldr);
			}
			
			// 消込元需要ＮＯに対する需要情報がない需要情報消込マップを削除
			delDmndRecMapL = MCList.create(MST_DMND_REC_MAP_R.class);
			delDmndRecMapL_bldr = MCQueryApiBuilder.create(t);
			delDmndRecMapL_bldr.setWhere(t.fr_dmnd_no.eq(bind("dmnd_no")));
			dbSelectForUpdate("MSBAB0060_MST_DMND_REC_MAP_S02", delDmndRecMapL, delDmndRecMapL_bldr, dmndL);
			
			if(!delDmndRecMapL.isEmpty()) {
				dbDeleteKey("MSBAB0060_MST_DMND_REC_MAP_D02", delDmndRecMapL, delDmndRecMapL_bldr);
			}
			
			// 消込先需要ＮＯに対する需要情報の消込数を更新
			MCList<MST_DMND_REC_MAP_R> bindDmndRecMapL = MCList.create(MST_DMND_REC_MAP_R.class);
			for(MST_DMND_REC_MAP_R r : delDmndRecMapL) {
				if(!r.rec_qty().isZero()) {
					bindDmndRecMapL.add(r);
				}
			}
			
			if(!bindDmndRecMapL.isEmpty()) {
				MCList<MST_DMND_R> tgtDmndL = MCList.create(MST_DMND_R.class);
				MST_DMND_R t2 = MST_DMND_R.create("T");
				MCQueryApiBuilder tgtDmndL_bldr = MCQueryApiBuilder.create(t2);
				MCList<MST_DMND_R> updDmndL = MCList.create(MST_DMND_R.class);
				tgtDmndL_bldr.setWhere(t2.dmnd_no.eq(bind("to_dmnd_no")));
				dbSelectForUpdate("MSBAB0060_MST_DMND_REC_MAP_S03", tgtDmndL, tgtDmndL_bldr, bindDmndRecMapL);
				
				if(tgtDmndL.isEmpty()) {
					return;
				}
				
				MCIndexKey dmndKey = tgtDmndL.createIndex(MST_DMND_R.$dmnd_no);
				
				for(MST_DMND_REC_MAP_R dmndRecMapR : bindDmndRecMapL) {
					MST_DMND_R tgtDmndR = tgtDmndL.getFirst(dmndKey, dmndRecMapR.to_dmnd_no());
					if(!isNull(tgtDmndR)) {
						tgtDmndR.rec_qty(tgtDmndR.rec_qty().subtract(dmndRecMapR.rec_qty()));
						tgtDmndR.dmnd_qty(tgtDmndR.dmnd_qty().add(dmndRecMapR.rec_qty()));
						updDmndL.add(tgtDmndR);
					}
				}
				
				if(!updDmndL.isEmpty()) {
					MST_DMND_R t3 = MST_DMND_R.create("T");
					MCQueryApiBuilder updDmndL_bldr = MCQueryApiBuilder.create(t3);
					editUpdSetStmt(updDmndL, t3 , updDmndL_bldr);
					dbUpdateKey("MSBAB0060_MST_DMND_REC_MAP_U01", updDmndL, updDmndL_bldr);
				}
			}
		}

		/**
		 * 更新時のset句の編集
		 */

		protected void editUpdSetStmt(MCList<MST_DMND_R> updL, MST_DMND_R list, MCQueryApiBuilder builder) {
			builder.setSet(list.dmnd_qty, list.rec_qty);
		}
		
		/**
		 * 需要情報の追加
		 */
		protected void insDmnd() {
			MCList<MST_DMND_R> dmndL = MCList.create(MST_DMND_R.class);
			MSBAL_DlyDmndCrtService.DlyDmndCrt_Upd01 dlyDmndCrtUpd01 = MSBAL_DlyDmndCrtService.crtDlyDmndCrt_Upd01();

			up0().addDateColumn("stYM");
			up0().addDateColumn("endYM");
			DmndReg_Upd02_CndR up0 = up0().get(0);
			MCDate stYm = MAUCL_DateUtil.getPeriodStDt(up0.reg_st_dt(), MAC_PERIOD_TYP.MONTHLY.value());
			MCDate endYm = MAUCL_DateUtil.getPeriodEndDt(up0.reg_end_dt(), MAC_PERIOD_TYP.MONTHLY.value());
			up0().setDate("stYM", stYm);
			up0().setDate("endYM", endYm);

			dmndL.addStringColumn("LG_GRP_CD");
			dmndL.addStringColumn("ITM_SHIP_GRP_CD");
			dmndL.addStringColumn("WG_CD");
			dmndL.addStringColumn("LOC_WG_CD");
			dmndL.addStringColumn("SHIP_WG_CD");
			dmndL.addStringColumn("LOC_LG_GRP_CD");
			dmndL.addBooleanColumn("RQMT_SNO1_FLG");
			dmndL.addBooleanColumn("RQMT_SNO2_FLG");
			dmndL.addBooleanColumn("RQMT_SNO3_FLG");
			dmndL.addBooleanColumn("RQMT_SNO4_FLG");
			dmndL.addStringColumn("SNO1_PTN_CD");
			dmndL.addStringColumn("SNO2_PTN_CD");
			dmndL.addStringColumn("SNO3_PTN_CD");
			dmndL.addStringColumn("SNO4_PTN_CD");
			dmndL.addStringColumn("SHIP_LG_GRP_CD");
			dmndL.addStringColumn("SHIP_TERM_CD");
			
			dmndL.addAll(getSpln());
			dmndL.addAll(getCstFrcst());
			dmndL.addAll(getSlo());
			
			// 組織変更対応
			dmndL.addDateColumn("PERIOD_ST_DT");
			for (MST_DMND_R r : dmndL) {
				r.setValueNE("PERIOD_ST_DT", MAUCL_DateUtil.getPeriodStDt(r.dmnd_st_dt(), MAC_PERIOD_TYP.MONTHLY.value()));
			}
			MAUCL_DptUtil.setDpt(dmndL, MST_DMND_R.$dmnd_dpt_cd, "PERIOD_ST_DT");
			
			// 手配ＮＯ発番を行う
			setSno(dmndL);
			
			MCIndexKey upKey = up0().createIndex(DmndReg_Upd02_CndR.$itm_cd,
					DmndReg_Upd02_CndR.$itm_sub1, DmndReg_Upd02_CndR.$itm_sub2,
					DmndReg_Upd02_CndR.$itm_sub3, DmndReg_Upd02_CndR.$new_dpt_cd);

			if(!dmndL.isEmpty()) {
				dmndL.sort(MST_DMND_R.$itm_cd, MST_DMND_R.$itm_sub1, MST_DMND_R.$itm_sub2, MST_DMND_R.$itm_sub3, MST_DMND_R.$dmnd_dpt_cd, MST_DMND_R.$dmnd_period_typ, MST_DMND_R.$dmnd_dt);

				setDmndLoc(dmndL);
				calcDmndDt(dmndL);
				
				// 需要日ばらし月数を取得
				MCList<MAVM_ITM_WG_R> itmWgL = MCList.create(MAVM_ITM_WG_R.class);
				MAVM_ITM_WG_R t = MAVM_ITM_WG_R.create("T");
				MCQueryApiBuilder itmWgL_bldr = MCQueryApiBuilder.create(t);
				itmWgL_bldr.setSelect(t.itm_cd);
				itmWgL_bldr.addSelect(t.itm_sub1);
				itmWgL_bldr.addSelect(t.itm_sub2);
				itmWgL_bldr.addSelect(t.itm_sub3);
				itmWgL_bldr.addSelect(t.wg_cd);
				itmWgL_bldr.addSelect(t.dmnd_date_div_mons);
				itmWgL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
				itmWgL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
				itmWgL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
				itmWgL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
				itmWgL_bldr.addWhereWithAnd(t.wg_cd.eq(bind("ship_wg_cd")));
				dbSelect("MSBAB0060_MAVM_ITM_WG_S01", itmWgL, itmWgL_bldr, dmndL);
				MCIndexKey itmWgKey = itmWgL.createIndex(MAVM_ITM_WG_R.$itm_cd, MAVM_ITM_WG_R.$itm_sub1, MAVM_ITM_WG_R.$itm_sub2, MAVM_ITM_WG_R.$itm_sub3, MAVM_ITM_WG_R.$wg_cd);

				for(MST_DMND_R dmndR : dmndL) {
					MAVM_ITM_WG_R itmWgR = itmWgL.getFirst(itmWgKey, dmndR.itm_cd(), dmndR.itm_sub1(), dmndR.itm_sub2(), dmndR.itm_sub3(), dmndR.getStringNE("SHIP_WG_CD"));
					if (!isNull(itmWgR)
							&& !isNull(itmWgR.dmnd_date_div_mons())) {

						if (itmWgR.dmnd_date_div_mons().isPositive()
								&& dmndR.dmnd_st_dt()
										.lte(MAUCL_DateUtil.getPeriodEndDt(
												getToday()
														.addMonth(
																itmWgR.dmnd_date_div_mons())
														.addMonth(-1),
												MAC_PERIOD_TYP.MONTHLY.value()))) {
							
							dmndR.dly_div_flg(true);							
						}
						else {
							dmndR.dly_div_flg(false);
						}
					}
					// 需要日ばらし月数が設定されていない場合は上り電文の設定に従う
					else {
						DmndReg_Upd02_CndR tgtR = up0().getFirst(upKey, dmndR.itm_cd(), dmndR.itm_sub1(), dmndR.itm_sub2(), dmndR.itm_sub3(), dmndR.dmnd_dpt_cd());
						dmndR.dly_div_flg(tgtR.date_div_flg());
					}
				}

				MCList<MST_DMND_R> insDmndL = MCList.create(MST_DMND_R.class);
				for (MST_DMND_R row : dmndL) {
					if (!row.input_qty().isZero()) {
						insDmndL.add(row);
					}
				};
				
				doSeqCache(MSC_NUM_SYS_TYP.DMND, insDmndL.size());
				for(MST_DMND_R row : insDmndL) {
					row.dmnd_no(getStrSeq(MSC_NUM_SYS_TYP.DMND));
				}
				_totalCnt += insDmndL.size();
				MST_DMND_R t2 = MST_DMND_R.create("T");
				MCQueryApiBuilder insDmndL_bldr = MCQueryApiBuilder.create(t2);
				dbInsert("MSBAB0060_MST_DMND_I01", insDmndL, insDmndL_bldr);
				_successCnt += insDmndL.size();
								
				// 日ばらしサービスの実行
				for(MST_DMND_R row : dmndL.groupBy(MST_DMND_R.$itm_cd, MST_DMND_R.$itm_sub1, MST_DMND_R.$itm_sub2, MST_DMND_R.$itm_sub3, MST_DMND_R.$dmnd_dpt_cd)) {
					DlyDmndCrt_Upd01_DtlR dlyDmndCrtUpd01DtlR = DlyDmndCrt_Upd01_DtlR.create();
					DmndReg_Upd02_CndR tgtR = up0().getFirst(upKey, row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(), row.dmnd_dpt_cd());
					dlyDmndCrtUpd01DtlR.st_dt(tgtR.reg_st_dt());
					dlyDmndCrtUpd01DtlR.end_dt(tgtR.reg_end_dt());
					dlyDmndCrtUpd01DtlR.reg_flg(tgtR.dly_dmnd_reg_flg());
					dlyDmndCrtUpd01DtlR.itm_cd(row.itm_cd());
					dlyDmndCrtUpd01DtlR.itm_sub1(row.itm_sub1());
					dlyDmndCrtUpd01DtlR.itm_sub2(row.itm_sub2());
					dlyDmndCrtUpd01DtlR.itm_sub3(row.itm_sub3());
					dlyDmndCrtUpd01DtlR.dpt_cd(row.dmnd_dpt_cd());
					dlyDmndCrtUpd01.up0().add(dlyDmndCrtUpd01DtlR);
				}
				if(!dlyDmndCrtUpd01.up0().isEmpty()) {
					dlyDmndCrtUpd01.exec();
				}
			}
			
			// 対象の需要情報がない場合は顧客期間内示集計を削除する
			MCIndexKey dmndKey = dmndL.createIndex(MST_DMND_R.$itm_cd, MST_DMND_R.$itm_sub1, MST_DMND_R.$itm_sub2, MST_DMND_R.$itm_sub3, MST_DMND_R.$dmnd_dpt_cd);
			MCList<DmndReg_Upd02_CndR> delTgtL = MCList.create(DmndReg_Upd02_CndR.class);
			for(DmndReg_Upd02_CndR r : up0()) {
				MST_DMND_R tgtR = dmndL.getFirst(dmndKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dpt_cd());
				if(isNull(tgtR)) {
					delTgtL.add(r);
				}
			}
			
			if(!delTgtL.isEmpty()) {
				MST_FRCST_SUM_R t = MST_FRCST_SUM_R.create("T");

				MCList<MST_FRCST_SUM_R> frcstSumL = MCList.create(MST_FRCST_SUM_R.class);
				MCQueryApiBuilder frcstSumL_bldr = MCQueryApiBuilder.create(t);
				frcstSumL_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.sls_dpt_cd, t.ym);
				frcstSumL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
				frcstSumL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
				frcstSumL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
				frcstSumL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
				frcstSumL_bldr.addWhereWithAnd(t.sls_dpt_cd.eq(bind("dpt_cd")));
				frcstSumL_bldr.addWhereWithAnd(t.ym.gte(bind("stym")));
				frcstSumL_bldr.addWhereWithCutOffAnd(t.ym.lte(bind("endym")));
				dbSelectForUpdate("MSBAB0060_MST_FRCST_SUM_S01", frcstSumL, frcstSumL_bldr, delTgtL);
				
				if(!frcstSumL.isEmpty()) {
					execDbDelete("MSBAB0060_MST_FRCST_SUM_D01", t, t.itm_cd.eq(bind("itm_cd")).and(t.itm_sub1.eq(bind("itm_sub1"))).and(t.itm_sub2.eq(bind("itm_sub2"))).and(t.itm_sub3.eq(bind("itm_sub3"))).and(t.sls_dpt_cd.eq(bind("sls_dpt_cd"))).and(t.ym.eq(bind("ym"))), frcstSumL);
				}
			}
		}

		/**
		 * 販売計画を取得
		 * @return
		 */
		protected MCList<MST_DMND_R> getSpln() {
			MAM_DPT_R m1 = MAM_DPT_R.create("M1");
			MAM_ITM_R m2 = MAM_ITM_R.create("M2");
			MST_SPLN_SUM_ITM_NEW_R S1TMP = MST_SPLN_SUM_ITM_NEW_R.create("TMP");

			MCList<MST_SPLN_SUM_ITM_NEW_R> splnSumItmNewL = MCList.create(MST_SPLN_SUM_ITM_NEW_R.class);
			MST_SPLN_SUM_ITM_NEW_R t = MST_SPLN_SUM_ITM_NEW_R.create("T");
			MCQueryApiBuilder splnSumItmNewL_bldr = MCQueryApiBuilder.create(t);
			MCList<MST_DMND_R> dmndL = MCList.create(MST_DMND_R.class);
			
			splnSumItmNewL.addBooleanColumn("RQMT_SNO1_FLG");
			splnSumItmNewL.addBooleanColumn("RQMT_SNO2_FLG");
			splnSumItmNewL.addBooleanColumn("RQMT_SNO3_FLG");
			splnSumItmNewL.addBooleanColumn("RQMT_SNO4_FLG");
			
			splnSumItmNewL_bldr.setSelect(t.dpt_cd);
			splnSumItmNewL_bldr.addSelect(t.cst_cd);
			splnSumItmNewL_bldr.addSelect(t.wrk_no);
			splnSumItmNewL_bldr.addSelect(t.itm_cd);
			splnSumItmNewL_bldr.addSelect(t.itm_sub1);
			splnSumItmNewL_bldr.addSelect(t.itm_sub2);
			splnSumItmNewL_bldr.addSelect(t.itm_sub3);
			splnSumItmNewL_bldr.addSelect(t.spln_ym);
			splnSumItmNewL_bldr.addSelect(t.spln_itm_cd);
			splnSumItmNewL_bldr.addSelect(t.spln_qty);
			splnSumItmNewL_bldr.addSelect(t.ym);
			splnSumItmNewL_bldr.addSelect(t.cur_cd);
			splnSumItmNewL_bldr.addSelect(t.spln_vers);
			splnSumItmNewL_bldr.addSelect(m1.wg_cd);
			splnSumItmNewL_bldr.addSelect(nvl( m2.itm_ship_grp_cd, value(MAC_STR.NULL_VAL.value())).as("itm_ship_grp_cd"));
			splnSumItmNewL_bldr.addSelect(m2.dec_place.as("dec_place"));
			splnSumItmNewL_bldr.addSelect(m2.rqmt_sno1_flg);
			splnSumItmNewL_bldr.addSelect(m2.sno1_ptn_cd);
			splnSumItmNewL_bldr.addSelect(m2.rqmt_sno2_flg);
			splnSumItmNewL_bldr.addSelect(m2.sno2_ptn_cd);
			splnSumItmNewL_bldr.addSelect(m2.rqmt_sno3_flg);
			splnSumItmNewL_bldr.addSelect(m2.sno3_ptn_cd);
			splnSumItmNewL_bldr.addSelect(m2.rqmt_sno4_flg);
			splnSumItmNewL_bldr.addSelect(m2.sno4_ptn_cd);
			splnSumItmNewL_bldr.addSelect(nvl( m2.ship_term_cd, value(MAC_STR.NULL_VAL.value())).as("ship_term_cd"));
			splnSumItmNewL_bldr.addInnerJoin(m1, bracket( m1.dpt_cd.eq(t.dpt_cd) .and(t.spln_ym.between(m1.st_dt, m1.end_dt))));
			splnSumItmNewL_bldr.addInnerJoin(m2, bracket( m2.itm_cd.eq(t.itm_cd) .and(m2.itm_sub1.eq(t.itm_sub1)) .and(m2.itm_sub2.eq(t.itm_sub2)) .and(m2.itm_sub3.eq(t.itm_sub3)) .and(m2.stk_mng_typ.eq(value(MAC_STK_MNG_TYP.MNG.value())))));
			splnSumItmNewL_bldr.setWhere(t.spln_ym.between(bind("stym"), bind("endym")));
			splnSumItmNewL_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
			splnSumItmNewL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			splnSumItmNewL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			splnSumItmNewL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			splnSumItmNewL_bldr.addWhereWithAnd(t.dpt_cd.eq(bind("dpt_cd")));
			splnSumItmNewL_bldr.addWhereWithAnd(t.ym.in(subQuery().select(max(S1TMP.ym))
					.from(S1TMP)
					.where(value(0).eq(value(0))
							.and(S1TMP.dpt_cd.eq(t.dpt_cd))
							.and(S1TMP.cst_cd.eq(t.cst_cd))
							.and(S1TMP.wrk_no.eq(t.wrk_no))
							.and(S1TMP.spln_itm_cd.eq(t.spln_itm_cd))
							.and(S1TMP.itm_cd.eq(t.itm_cd))
							.and(S1TMP.itm_sub1.eq(t.itm_sub1))
							.and(S1TMP.itm_sub2.eq(t.itm_sub2))
							.and(S1TMP.itm_sub3.eq(t.itm_sub3))
							.and(S1TMP.cur_cd.eq(t.cur_cd))
							.and(S1TMP.spln_ym.eq(t.spln_ym)))));
			splnSumItmNewL_bldr.setOrderByAsc(t.dpt_cd, t.cst_cd, t.wrk_no, t.spln_itm_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.cur_cd, t.spln_ym);
			dbSelect("MSBAB0060_MST_SPLN_SUM_ITM_NEW_S02", splnSumItmNewL, splnSumItmNewL_bldr, up0());

			for(MST_SPLN_SUM_ITM_NEW_R row : splnSumItmNewL) {
				MST_DMND_R dmndR = MST_DMND_R.create();
				dmndR.dmnd_dt(MAUCL_DateUtil.getPeriodStDt(row.spln_ym(), MAC_PERIOD_TYP.MONTHLY.value()));
				dmndR.dmnd_st_dt(MAUCL_DateUtil.getPeriodStDt(row.spln_ym(), MAC_PERIOD_TYP.MONTHLY.value()));
				dmndR.dmnd_end_dt(MAUCL_DateUtil.getPeriodEndDt(row.spln_ym(), MAC_PERIOD_TYP.MONTHLY.value()));
				dmndR.dmnd_period_typ(MAC_PERIOD_TYP.MONTHLY.value());
				dmndR.itm_cd(row.itm_cd());
				dmndR.itm_sub1(row.itm_sub1());
				dmndR.itm_sub2(row.itm_sub2());
				dmndR.itm_sub3(row.itm_sub3());
				dmndR.spln_itm_cd(row.spln_itm_cd());
				dmndR.dmnd_typ(MSC_DMND_TYP.PLN_SLS.value());
				dmndR.dmnd_qty(row.spln_qty());
				dmndR.input_qty(row.spln_qty());
				dmndR.rec_qty(MCNumber.ZERO);
				dmndR.dmnd_dpt_cd(row.dpt_cd());
				dmndR.wrk_no(row.wrk_no());
				dmndR.cst_cd(row.cst_cd());
				dmndR.ym(row.ym());
				dmndR.spln_vers(row.spln_vers());
				dmndR.cur_cd(row.cur_cd());
				dmndR.sno1(MAC_STR.NULL_VAL.value());
				dmndR.sno2(MAC_STR.NULL_VAL.value());
				dmndR.sno3(MAC_STR.NULL_VAL.value());
				dmndR.sno4(MAC_STR.NULL_VAL.value());
				dmndR.setStringNE("WG_CD", row.getStringNE("WG_CD"));
				dmndR.setStringNE("LOC_WG_CD", null);
				dmndR.setStringNE("ITM_SHIP_GRP_CD", row.getStringNE("ITM_SHIP_GRP_CD"));
				dmndR.setStringNE("LG_GRP_CD", MAC_STR.NULL_VAL.value());
				dmndR.setNumberNE("DEC_PLACE", row.getNumberNE("DEC_PLACE"));
				dmndR.setBooleanNE("RQMT_SNO1_FLG", row.getBooleanNE("RQMT_SNO1_FLG"));
				dmndR.setStringNE("SNO1_PTN_CD", row.getStringNE("SNO1_PTN_CD"));
				dmndR.setBooleanNE("RQMT_SNO2_FLG", row.getBooleanNE("RQMT_SNO2_FLG"));
				dmndR.setStringNE("SNO2_PTN_CD", row.getStringNE("SNO2_PTN_CD"));
				dmndR.setBooleanNE("RQMT_SNO3_FLG", row.getBooleanNE("RQMT_SNO3_FLG"));
				dmndR.setStringNE("SNO3_PTN_CD", row.getStringNE("SNO3_PTN_CD"));
				dmndR.setBooleanNE("RQMT_SNO4_FLG", row.getBooleanNE("RQMT_SNO4_FLG"));
				dmndR.setStringNE("SNO4_PTN_CD", row.getStringNE("SNO4_PTN_CD"));
				dmndR.dlv_schd_st_dt(dmndR.dmnd_st_dt());
				dmndR.dlv_schd_end_dt(dmndR.dmnd_end_dt());
				dmndR.setStringNE("SHIP_TERM_CD", row.getStringNE("SHIP_TERM_CD"));

				dmndL.add(dmndR);
			}
			
			return dmndL;
		}
		
		/**
		 * 販売計画の集計キー項目となる配列を取得
		 * @return
		 */
		protected String[] getSplnGroupByKeys() {
			return new String[] {MST_SPLN_SUM_ITM_NEW_R.$dpt_cd
								, MST_SPLN_SUM_ITM_NEW_R.$cst_cd
								, MST_SPLN_SUM_ITM_NEW_R.$wrk_no
								, MST_SPLN_SUM_ITM_NEW_R.$itm_cd
								, MST_SPLN_SUM_ITM_NEW_R.$itm_sub1
								, MST_SPLN_SUM_ITM_NEW_R.$itm_sub2
								, MST_SPLN_SUM_ITM_NEW_R.$itm_sub3
								, MST_SPLN_SUM_ITM_NEW_R.$spln_ym
			};
		}

		/**
		 * 顧客期間内示を取得
		 * @return
		 */
		protected MCList<MST_DMND_R> getCstFrcst() {
			MST_CST_FRCST_H_R t2 = MST_CST_FRCST_H_R.create("T2");
			MAM_DPT_R m1 = MAM_DPT_R.create("M1");
			MAM_ITM_R m2 = MAM_ITM_R.create("M2");
			MAM_BP_R m3 = MAM_BP_R.create("M3");
			MAM_LOC_R m4 = MAM_LOC_R.create("M4");
			MST_CST_FRCST_D_R S1TMP = MST_CST_FRCST_D_R.create("TMP");
			MST_CST_FRCST_H_R S1TMP2 = MST_CST_FRCST_H_R.create("TMP2");

			MCList<MST_CST_FRCST_D_R> cstFrcstDL = MCList.create(MST_CST_FRCST_D_R.class);
			MST_CST_FRCST_D_R t = MST_CST_FRCST_D_R.create("T");
			MCQueryApiBuilder cstFrcstDL_bldr = MCQueryApiBuilder.create(t);
			MCList<MST_DMND_R> dmndL = MCList.create(MST_DMND_R.class);
			
			cstFrcstDL.addBooleanColumn("RQMT_SNO1_FLG");
			cstFrcstDL.addBooleanColumn("RQMT_SNO2_FLG");
			cstFrcstDL.addBooleanColumn("RQMT_SNO3_FLG");
			cstFrcstDL.addBooleanColumn("RQMT_SNO4_FLG");

			cstFrcstDL_bldr.setSelect(t.cst_frcst_d_no);
			cstFrcstDL_bldr.addSelect(t.cst_frcst_no);
			cstFrcstDL_bldr.addSelect(t.itm_cd);
			cstFrcstDL_bldr.addSelect(t.itm_sub1);
			cstFrcstDL_bldr.addSelect(t.itm_sub2);
			cstFrcstDL_bldr.addSelect(t.itm_sub3);
			cstFrcstDL_bldr.addSelect(t.frcst_period_typ);
			cstFrcstDL_bldr.addSelect(t.frcst_dt);
			cstFrcstDL_bldr.addSelect(t.frcst_st_dt);
			cstFrcstDL_bldr.addSelect(t.frcst_end_dt);
			cstFrcstDL_bldr.addSelect(t.base_unit_qty);
			cstFrcstDL_bldr.addSelect(t2.cst_cd);
			cstFrcstDL_bldr.addSelect(t2.dlv_cd);
			cstFrcstDL_bldr.addSelect(t2.frcst_dpt_cd);
			cstFrcstDL_bldr.addSelect(t2.frcst_usr_cd);
			cstFrcstDL_bldr.addSelect(nvl( t2.wrk_no, value(MAC_STR.NULL_VAL.value())).as("wrk_no"));
			cstFrcstDL_bldr.addSelect(t.gi_loc_cd);
			cstFrcstDL_bldr.addSelect(m1.wg_cd);
			cstFrcstDL_bldr.addSelect(m4.wg_cd.as("loc_wg_cd"));
			cstFrcstDL_bldr.addSelect(m4.lg_grp_cd.as("loc_lg_grp_cd"));
			cstFrcstDL_bldr.addSelect(nvl( m2.itm_ship_grp_cd, value(MAC_STR.NULL_VAL.value())).as("itm_ship_grp_cd"));
			cstFrcstDL_bldr.addSelect(nvl( m3.lg_grp_cd, value(MAC_STR.NULL_VAL.value())).as("lg_grp_cd"));
			cstFrcstDL_bldr.addSelect(nvl( m2.dec_place, value(0)).as("dec_place"));
			cstFrcstDL_bldr.addSelect(m2.rqmt_sno1_flg);
			cstFrcstDL_bldr.addSelect(m2.sno1_ptn_cd);
			cstFrcstDL_bldr.addSelect(m2.rqmt_sno2_flg);
			cstFrcstDL_bldr.addSelect(m2.sno2_ptn_cd);
			cstFrcstDL_bldr.addSelect(m2.rqmt_sno3_flg);
			cstFrcstDL_bldr.addSelect(m2.sno3_ptn_cd);
			cstFrcstDL_bldr.addSelect(m2.rqmt_sno4_flg);
			cstFrcstDL_bldr.addSelect(m2.sno4_ptn_cd);
			cstFrcstDL_bldr.addSelect(nvl( m2.ship_term_cd, value(MAC_STR.NULL_VAL.value())).as("ship_term_cd"));
			cstFrcstDL_bldr.addInnerJoin(t2, bracket( t2.cst_frcst_no.eq(t.cst_frcst_no)));
			cstFrcstDL_bldr.addInnerJoin(m1, bracket( m1.dpt_cd.eq(t2.frcst_dpt_cd) .and(t2.rcpt_dt.between(m1.st_dt, m1.end_dt))));
			cstFrcstDL_bldr.addInnerJoin(m2, bracket( m2.itm_cd.eq(t.itm_cd) .and(m2.itm_sub1.eq(t.itm_sub1)) .and(m2.itm_sub2.eq(t.itm_sub2)) .and(m2.itm_sub3.eq(t.itm_sub3)) .and(m2.stk_mng_typ.eq(value(MAC_STK_MNG_TYP.MNG.value())))));
			cstFrcstDL_bldr.addLeftOuterJoin(m3, bracket( m3.bp_cd.eq(t2.dlv_cd)));
			cstFrcstDL_bldr.addLeftOuterJoin(m4, bracket( m4.loc_cd.eq(t.gi_loc_cd)));

			cstFrcstDL_bldr.setWhere(t.frcst_st_dt.lte(bind("reg_end_dt")));
			cstFrcstDL_bldr.addWhereWithAnd(t.frcst_end_dt.gte(bind("reg_st_dt")));
			cstFrcstDL_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
			cstFrcstDL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			cstFrcstDL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			cstFrcstDL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			cstFrcstDL_bldr.addWhereWithAnd(t2.frcst_dpt_cd.eq(bind("dpt_cd")));
			cstFrcstDL_bldr.addWhereWithAnd(t2.can_flg.eq(value(false)));
			cstFrcstDL_bldr.addWhereWithAnd(t.frcst_stop_flg.eq(value(false)));
			cstFrcstDL_bldr.addWhereWithAnd(t2.rcpt_dt.in(subQuery()
					.select(max(S1TMP2.rcpt_dt))
					.from(S1TMP.innerJoin(S1TMP2)
							.on(bracket(S1TMP2.cst_frcst_no.eq(S1TMP.cst_frcst_no))))
					.where(value(0).eq(value(0))
							.and(S1TMP2.can_flg.eq(value(false)))
							.and(S1TMP2.cst_cd.eq(t2.cst_cd))
							.and(S1TMP2.dlv_cd.eq(t2.dlv_cd)
									.or(S1TMP2.dlv_cd.isNull()
											.and(t2.dlv_cd.isNull())))
							.and(S1TMP2.wrk_no.eq(t2.wrk_no)
									.or(S1TMP2.wrk_no.isNull()
											.and(t2.wrk_no.isNull())))
							.and(S1TMP2.frcst_dpt_cd.eq(t2.frcst_dpt_cd))
							.and(S1TMP2.frcst_usr_cd.eq(t2.frcst_usr_cd)
									.or(S1TMP2.frcst_usr_cd.isNull()
											.and(t2.frcst_usr_cd.isNull())))
							.and(S1TMP.itm_cd.eq(t.itm_cd))
							.and(S1TMP.itm_sub1.eq(t.itm_sub1))
							.and(S1TMP.itm_sub2.eq(t.itm_sub2))
							.and(S1TMP.itm_sub3.eq(t.itm_sub3))
							.and(S1TMP.frcst_period_typ.eq(t.frcst_period_typ))
							.and(S1TMP.frcst_dt.eq(t.frcst_dt)))));
			cstFrcstDL_bldr.setOrderByAsc(t.cst_frcst_no, t.cst_frcst_d_no);
			dbSelect("MSBAB0060_MST_CST_FRCST_D_S02", cstFrcstDL, cstFrcstDL_bldr, up0());

			for(MST_CST_FRCST_D_R row : cstFrcstDL) {
				MST_DMND_R dmndR = MST_DMND_R.create();
				dmndR.dmnd_dt(row.frcst_dt());
				dmndR.dmnd_st_dt(row.frcst_st_dt());
				dmndR.dmnd_end_dt(row.frcst_end_dt());
				dmndR.dmnd_period_typ(row.frcst_period_typ());
				dmndR.itm_cd(row.itm_cd());
				dmndR.itm_sub1(row.itm_sub1());
				dmndR.itm_sub2(row.itm_sub2());
				dmndR.itm_sub3(row.itm_sub3());
				dmndR.dmnd_typ(MSC_DMND_TYP.CST_FRCST.value());
				dmndR.dmnd_qty(row.base_unit_qty());
				dmndR.input_qty(row.base_unit_qty());
				dmndR.rec_qty(MCNumber.ZERO);
				dmndR.dmnd_dpt_cd(row.getStringNE("FRCST_DPT_CD"));
				dmndR.dmnd_usr_cd(row.getStringNE("FRCST_USR_CD"));
				dmndR.wrk_no(row.getStringNE("WRK_NO"));
				dmndR.cst_cd(row.getStringNE("CST_CD"));
				dmndR.dlv_cd(row.getStringNE("DLV_CD"));
				dmndR.cst_frcst_d_no(row.cst_frcst_d_no());
				dmndR.cst_frcst_no(row.cst_frcst_no());
				dmndR.dmnd_loc_cd(row.gi_loc_cd());
				dmndR.sno1(MAC_STR.NULL_VAL.value());
				dmndR.sno2(MAC_STR.NULL_VAL.value());
				dmndR.sno3(MAC_STR.NULL_VAL.value());
				dmndR.sno4(MAC_STR.NULL_VAL.value());
				dmndR.setStringNE("WG_CD", row.getStringNE("WG_CD"));
				dmndR.setStringNE("LOC_WG_CD", row.getStringNE("LOC_WG_CD"));
				dmndR.setStringNE("LOC_LG_GRP_CD", row.getStringNE("LOC_LG_GRP_CD"));
				dmndR.setStringNE("ITM_SHIP_GRP_CD", row.getStringNE("ITM_SHIP_GRP_CD"));
				dmndR.setStringNE("LG_GRP_CD", row.getStringNE("LG_GRP_CD"));
				dmndR.setNumberNE("DEC_PLACE", row.getNumberNE("DEC_PLACE"));
				dmndR.setBooleanNE("RQMT_SNO1_FLG", row.getBooleanNE("RQMT_SNO1_FLG"));
				dmndR.setStringNE("SNO1_PTN_CD", row.getStringNE("SNO1_PTN_CD"));
				dmndR.setBooleanNE("RQMT_SNO2_FLG", row.getBooleanNE("RQMT_SNO2_FLG"));
				dmndR.setStringNE("SNO2_PTN_CD", row.getStringNE("SNO2_PTN_CD"));
				dmndR.setBooleanNE("RQMT_SNO3_FLG", row.getBooleanNE("RQMT_SNO3_FLG"));
				dmndR.setStringNE("SNO3_PTN_CD", row.getStringNE("SNO3_PTN_CD"));
				dmndR.setBooleanNE("RQMT_SNO4_FLG", row.getBooleanNE("RQMT_SNO4_FLG"));
				dmndR.setStringNE("SNO4_PTN_CD", row.getStringNE("SNO4_PTN_CD"));
				dmndR.dlv_schd_st_dt(dmndR.dmnd_st_dt());
				dmndR.dlv_schd_end_dt(dmndR.dmnd_end_dt());
				dmndR.setStringNE("SHIP_TERM_CD", row.getStringNE("SHIP_TERM_CD"));
				
				dmndL.add(dmndR);
			}

			return dmndL;
		}
		
		/**
		 * 受注を取得
		 * @return
		 */
		protected MCList<MST_DMND_R> getSlo() {
			MST_SLO_R t2 = MST_SLO_R.create("T2");
			MST_SHIP_PR_R t5 = MST_SHIP_PR_R.create("T5");
			MST_SHIP_SCHD_R t4 = MST_SHIP_SCHD_R.create("T4");
			MSVT_WRK_SNO_R t3 = MSVT_WRK_SNO_R.create("T3");
			MAM_DPT_R m1 = MAM_DPT_R.create("M1");
			MAM_ITM_R m2 = MAM_ITM_R.create("M2");
			MAM_BP_R m3 = MAM_BP_R.create("M3");
			MAM_LOC_R m4 = MAM_LOC_R.create("M4");
			MAM_LOC_R m5 = MAM_LOC_R.create("M5");

			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t);
			MCList<MST_DMND_R> dmndL = MCList.create(MST_DMND_R.class);
			
			sloDL_bldr.setSelect(t.slo_d_no);
			sloDL_bldr.addSelect(t.slo_no);
			sloDL_bldr.addSelect(t.itm_cd);
			sloDL_bldr.addSelect(t.itm_sub1);
			sloDL_bldr.addSelect(t.itm_sub2);
			sloDL_bldr.addSelect(t.itm_sub3);
			sloDL_bldr.addSelect(t.sno1);
			sloDL_bldr.addSelect(t.sno2);
			sloDL_bldr.addSelect(t.sno3);
			sloDL_bldr.addSelect(t.sno4);
			sloDL_bldr.addSelect(nvl( t4.dlv_cd, t.dlv_cd).as("dlv_cd"));
			sloDL_bldr.addSelect(t4.base_unit_qty);
			sloDL_bldr.addSelect(t.loc_cd);
			sloDL_bldr.addSelect(m5.loc_cd.as("lg_def_loc_cd"));
			sloDL_bldr.addSelect(t4.ship_schd_tm.as("dlv_rqst_tm"));
			sloDL_bldr.addSelect(t2.sls_usr_cd);
			sloDL_bldr.addSelect(t2.sls_dpt_cd);
			sloDL_bldr.addSelect(nvl( t3.wrk_no, value(MAC_STR.NULL_VAL.value())).as("wrk_no"));
			sloDL_bldr.addSelect(t2.cst_cd);
			sloDL_bldr.addSelect(t2.slo_typ);
			sloDL_bldr.addSelect(m1.wg_cd);
			sloDL_bldr.addSelect(m4.wg_cd.as("loc_wg_cd"));
			sloDL_bldr.addSelect(nvl( m2.itm_ship_grp_cd, value(MAC_STR.NULL_VAL.value())).as("itm_ship_grp_cd"));
			sloDL_bldr.addSelect(nvl( m3.lg_grp_cd, value(MAC_STR.NULL_VAL.value())).as("lg_grp_cd"));
			sloDL_bldr.addSelect(m2.dec_place);
			sloDL_bldr.addInnerJoin(t2, bracket( t2.slo_no.eq(t.slo_no)));
			sloDL_bldr.addInnerJoin(t5, bracket( t5.slo_d_no.eq(t.slo_d_no)));
			sloDL_bldr.addInnerJoin(t4, bracket( t4.ship_pr_no.eq(t5.ship_pr_no)));
			sloDL_bldr.addLeftOuterJoin(t3, bracket( t3.sno1.eq(t.sno1)));
			sloDL_bldr.addInnerJoin(m1, bracket( m1.dpt_cd.eq(t2.sls_dpt_cd) .and(t2.slo_dt.between(m1.st_dt, m1.end_dt))));
			sloDL_bldr.addInnerJoin(m2, bracket( m2.itm_cd.eq(t.itm_cd) .and(m2.itm_sub1.eq(t.itm_sub1)) .and(m2.itm_sub2.eq(t.itm_sub2)) .and(m2.itm_sub3.eq(t.itm_sub3)) .and(m2.stk_mng_typ.eq(value(MAC_STK_MNG_TYP.MNG.value())))));
			sloDL_bldr.addLeftOuterJoin(m3, bracket( m3.bp_cd.eq(nvl( t4.dlv_cd, t.dlv_cd ) )));
			sloDL_bldr.addLeftOuterJoin(m4, bracket( m4.loc_cd.eq(nvl( t.loc_cd, t.def_loc_cd ) )));
			sloDL_bldr.addLeftOuterJoin(m5, bracket( m5.lg_grp_cd.eq(t4.ship_fr_lg_grp_cd) .and(m5.lg_def_flg.eq(value(true)))));

			sloDL_bldr.setWhere(t4.ship_schd_tm.between(bind("reg_st_dt"), bind("reg_end_dt")));
			sloDL_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
			sloDL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			sloDL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			sloDL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			sloDL_bldr.addWhereWithAnd(t2.sls_dpt_cd.eq(bind("dpt_cd")));
			sloDL_bldr.addWhereWithAnd(t.abort_flg.eq(value(false))
					.or(bracket(t.abort_flg.eq(value(true)).and(t5.ship_schd_abort_qty.lt(t5.base_unit_qty)))));
			sloDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			sloDL_bldr.addWhereWithAnd(t2.can_flg.eq(value(false)));
			sloDL_bldr.setOrderByAsc(t.slo_no, t.slo_d_no, t4.ship_schd_no);
			dbSelect("MSBAB0060_MST_SLO_D_S01", sloDL, sloDL_bldr, up0());

			for(MST_SLO_D_R row : sloDL) {
				MST_DMND_R dmndR = MST_DMND_R.create();
				dmndR.dmnd_dt(row.dlv_rqst_tm());
				dmndR.dmnd_st_dt(row.dlv_rqst_tm());
				dmndR.dmnd_end_dt(row.dlv_rqst_tm());
				dmndR.dlv_schd_st_dt(dmndR.dmnd_st_dt());
				dmndR.dlv_schd_end_dt(dmndR.dmnd_end_dt());
				dmndR.dmnd_period_typ(MAC_PERIOD_TYP.DAILY.value());
				dmndR.itm_cd(row.itm_cd());
				dmndR.itm_sub1(row.itm_sub1());
				dmndR.itm_sub2(row.itm_sub2());
				dmndR.itm_sub3(row.itm_sub3());
				if(MSC_SLO_TYP.isSLO(row.getStringNE("SLO_TYP"))) {
					dmndR.dmnd_typ(MSC_DMND_TYP.SLO.value());					
				}
				else if(MSC_SLO_TYP.isPRE_SLO(row.getStringNE("SLO_TYP"))) {
					dmndR.dmnd_typ(MSC_DMND_TYP.PRE_SLO.value());
				}
				dmndR.dmnd_qty(row.base_unit_qty());
				dmndR.input_qty(row.base_unit_qty());
				dmndR.rec_qty(MCNumber.ZERO);
				dmndR.dmnd_dpt_cd(row.getStringNE("SLS_DPT_CD"));
				dmndR.dmnd_usr_cd(row.getStringNE("SLS_USR_CD"));
				dmndR.wrk_no(row.getStringNE("WRK_NO"));
				dmndR.cst_cd(row.getStringNE("CST_CD"));
				dmndR.dlv_cd(row.dlv_cd());
				dmndR.slo_d_no(row.slo_d_no());
				dmndR.slo_no(row.slo_no());
				if(isNull(row.loc_cd())) {
					//受注時の引当範囲区分が総量引当の場合は、場所が設定されていないので物流標準場所を設定する
					dmndR.dmnd_loc_cd(row.getStringNE("LG_DEF_LOC_CD"));
				}
				else {
					dmndR.dmnd_loc_cd(row.loc_cd());
				}
				dmndR.sno1(row.sno1());
				dmndR.sno2(row.sno2());
				dmndR.sno3(row.sno3());
				dmndR.sno4(row.sno4());
				dmndR.setStringNE("WG_CD", row.getStringNE("WG_CD"));
				dmndR.setStringNE("LOC_WG_CD", row.getStringNE("LOC_WG_CD"));
				dmndR.setStringNE("ITM_SHIP_GRP_CD", row.getStringNE("ITM_SHIP_GRP_CD"));
				dmndR.setStringNE("LG_GRP_CD", row.getStringNE("LG_GRP_CD"));
				dmndR.setNumberNE("DEC_PLACE", row.getNumberNE("DEC_PLACE"));
				dmndL.add(dmndR);
			}
			
			return dmndL;
		}
		
		/**
		 * 手配ＮＯ１～４を発番する
		 * @param dmndL
		 */
		protected void setSno(MCList<MST_DMND_R> dmndL) {
			MCList<MST_DMND_R> tgtDmndL = MCList.create(MST_DMND_R.class);
			// 発番対象を抽出する
			for(MST_DMND_R r : dmndL) {
				if (MSC_DMND_TYP.isPLN_SLS(r.dmnd_typ()) || MSC_DMND_TYP.isCST_FRCST(r.dmnd_typ())) {
					if (r.getBooleanNE("RQMT_SNO1_FLG")
							|| r.getBooleanNE("RQMT_SNO2_FLG")
							|| r.getBooleanNE("RQMT_SNO3_FLG")
							|| r.getBooleanNE("RQMT_SNO4_FLG")
					) {
						tgtDmndL.add(r);
					}
				}
			}
			
			if (!tgtDmndL.isEmpty()) {
				// 部門マスタの取得
				MAM_DPT_R t = MAM_DPT_R.create("T");
				MCQueryApiBuilder dptL_bldr = MCQueryApiBuilder.create(t);
				dptL_bldr.setSelect(t.wg_cd);
				FXUCL_MCDbcCacheStEnd<MAM_DPT_R> dptCacheL = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dptL_bldr, tgtDmndL, MST_DMND_R.$dmnd_dpt_cd);
				
				for (MST_DMND_R r : tgtDmndL) {
					ElmArgsR argsR = ElmArgsR.create();
					argsR.dpt_cd(r.dmnd_dpt_cd());
					argsR.co_cd(getCo().co_cd());
					argsR.bp_cd(r.cst_cd());
					argsR.wg_cd(dptCacheL.get(r.getDateNE("PERIOD_ST_DT"), r.dmnd_dpt_cd()).wg_cd());
					argsR.trd_cd(null);
					argsR.dt(r.getDateNE("PERIOD_ST_DT"));
					argsR.str(null);
					argsR.str2(null);
					argsR.str3(r.wrk_no());
					argsR.itm_cd(r.itm_cd());
					argsR.itm_sub1(r.itm_sub1());
					argsR.itm_sub2(r.itm_sub2());
					argsR.itm_sub3(r.itm_sub3());
					
					if (r.getBooleanNE("RQMT_SNO1_FLG")) {
						argsR.num_ptn_cd(r.getStringNE("SNO1_PTN_CD"));
						r.sno1(getNum(MAC_NUM_BIZ_TYP.SNO, argsR));						
					}
					if (r.getBooleanNE("RQMT_SNO2_FLG")) {
						argsR.num_ptn_cd(r.getStringNE("SNO2_PTN_CD"));
						r.sno2(getNum(MAC_NUM_BIZ_TYP.SNO, argsR));						
					}
					if (r.getBooleanNE("RQMT_SNO3_FLG")) {
						argsR.num_ptn_cd(r.getStringNE("SNO3_PTN_CD"));
						r.sno3(getNum(MAC_NUM_BIZ_TYP.SNO, argsR));
					}
					if (r.getBooleanNE("RQMT_SNO4_FLG")) {
						argsR.num_ptn_cd(r.getStringNE("SNO4_PTN_CD"));
						r.sno4(getNum(MAC_NUM_BIZ_TYP.SNO, argsR));
					}
				}
			}
		}
		
		/**
		 * 需要場所を設定し、需要情報を分割する
		 * @param dmndL
		 */
		protected void setDmndLoc(MCList<MST_DMND_R> dmndL) {
			MCList<MAM_DMND_DIV_R> dmndDivL = MCList.create(MAM_DMND_DIV_R.class);
			MCList<MAM_DMND_DIV_R> bindDmndDivL = MCList.create(MAM_DMND_DIV_R.class);
			MCList<MAM_SLO_ALLOC_R> sloAllocL = MCList.create(MAM_SLO_ALLOC_R.class);
			MCList<MAM_SLO_ALLOC_R> bindSloAllocL = MCList.create(MAM_SLO_ALLOC_R.class);
			MCList<MST_DMND_R> tmpL = dmndL.clone();
			
			for (MST_DMND_R r : dmndL.groupBy("LG_GRP_CD", MST_DMND_R.$itm_cd,
					MST_DMND_R.$itm_sub1, MST_DMND_R.$itm_sub2, MST_DMND_R.$itm_sub3,
					"WG_CD", MST_DMND_R.$dmnd_dpt_cd)) {
				
				MAM_DMND_DIV_R dmndDivR = MAM_DMND_DIV_R.create();
				
				// 物流グループ・品目・売上部門指定
				dmndDivR.to_lg_grp_cd(r.getStringNE("LG_GRP_CD"));
				dmndDivR.itm_ship_grp_cd(MAC_STR.NULL_VAL.value());
				dmndDivR.itm_cd(r.itm_cd());
				dmndDivR.itm_sub1(r.itm_sub1());
				dmndDivR.itm_sub2(r.itm_sub2());
				dmndDivR.itm_sub3(r.itm_sub3());
				dmndDivR.wg_cd(MAC_STR.NULL_VAL.value());
				dmndDivR.sls_dpt_cd(r.dmnd_dpt_cd());
				bindDmndDivL.add(dmndDivR);
				
				// 品目・売上部門指定
				dmndDivR = dmndDivR.clone();
				dmndDivR.to_lg_grp_cd(MAC_STR.NULL_VAL.value());
				bindDmndDivL.add(dmndDivR);
				
				// 物流グループ・品目・ワーキンググループ指定
				dmndDivR = dmndDivR.clone();
				dmndDivR.to_lg_grp_cd(r.getStringNE("LG_GRP_CD"));
				dmndDivR.wg_cd(r.getStringNE("WG_CD"));
				dmndDivR.sls_dpt_cd(MAC_STR.NULL_VAL.value());
				bindDmndDivL.add(dmndDivR);
				
				// 品目・ワーキンググループ指定
				dmndDivR = dmndDivR.clone();
				dmndDivR.to_lg_grp_cd(MAC_STR.NULL_VAL.value());
				bindDmndDivL.add(dmndDivR);
			}
			for(MST_DMND_R r : dmndL.groupBy("LG_GRP_CD", "ITM_SHIP_GRP_CD", "WG_CD", MST_DMND_R.$dmnd_dpt_cd)) {
				MAM_DMND_DIV_R dmndDivR = MAM_DMND_DIV_R.create();

				// 物流グループ・品目出荷グループ・売上部門指定
				dmndDivR.to_lg_grp_cd(r.getStringNE("LG_GRP_CD"));
				dmndDivR.itm_ship_grp_cd(r.getStringNE("ITM_SHIP_GRP_CD"));
				dmndDivR.itm_cd(MAC_STR.NULL_VAL.value());
				dmndDivR.itm_sub1(MAC_STR.NULL_VAL.value());
				dmndDivR.itm_sub2(MAC_STR.NULL_VAL.value());
				dmndDivR.itm_sub3(MAC_STR.NULL_VAL.value());
				dmndDivR.wg_cd(MAC_STR.NULL_VAL.value());
				dmndDivR.sls_dpt_cd(r.dmnd_dpt_cd());
				bindDmndDivL.add(dmndDivR);
				
				// 品目出荷グループ・売上部門指定
				dmndDivR = dmndDivR.clone();
				dmndDivR.to_lg_grp_cd(MAC_STR.NULL_VAL.value());
				bindDmndDivL.add(dmndDivR);
				
				// 物流グループ・品目出荷グループ・ワーキンググループ指定
				dmndDivR = dmndDivR.clone();
				dmndDivR.to_lg_grp_cd(r.getStringNE("LG_GRP_CD"));
				dmndDivR.wg_cd(r.getStringNE("WG_CD"));
				dmndDivR.sls_dpt_cd(MAC_STR.NULL_VAL.value());
				bindDmndDivL.add(dmndDivR);
				
				// 品目出荷グループ・ワーキンググループ指定
				dmndDivR = dmndDivR.clone();
				dmndDivR.to_lg_grp_cd(MAC_STR.NULL_VAL.value());
				bindDmndDivL.add(dmndDivR);
				
				// 受注引当マスタ　物流グループ・品目出荷グループ・ワーキンググループ指定
				MAM_SLO_ALLOC_R sloAllocR = MAM_SLO_ALLOC_R.create();
				sloAllocR.to_lg_grp_cd(r.getStringNE("LG_GRP_CD"));
				sloAllocR.itm_ship_grp_cd(r.getStringNE("ITM_SHIP_GRP_CD"));
				sloAllocR.wg_cd(r.getStringNE("WG_CD"));
				bindSloAllocL.add(sloAllocR);

				// 受注引当マスタ　物流グループ・ワーキンググループ指定
				sloAllocR = sloAllocR.clone();
				sloAllocR.itm_ship_grp_cd(MAC_STR.NULL_VAL.value());
				bindSloAllocL.add(sloAllocR);

				// 受注引当マスタ　品目出荷グループ・ワーキンググループ指定
				sloAllocR = sloAllocR.clone();
				sloAllocR.to_lg_grp_cd(MAC_STR.NULL_VAL.value());
				sloAllocR.itm_ship_grp_cd(r.getStringNE("ITM_SHIP_GRP_CD"));
				bindSloAllocL.add(sloAllocR);
			}
			for(MST_DMND_R r : dmndL.groupBy("LG_GRP_CD", "WG_CD", MST_DMND_R.$dmnd_dpt_cd)) {
				MAM_DMND_DIV_R dmndDivR = MAM_DMND_DIV_R.create();
				
				// 物流グループ・売上部門指定
				dmndDivR.to_lg_grp_cd(r.getStringNE("LG_GRP_CD"));
				dmndDivR.itm_ship_grp_cd(MAC_STR.NULL_VAL.value());
				dmndDivR.itm_cd(MAC_STR.NULL_VAL.value());
				dmndDivR.itm_sub1(MAC_STR.NULL_VAL.value());
				dmndDivR.itm_sub2(MAC_STR.NULL_VAL.value());
				dmndDivR.itm_sub3(MAC_STR.NULL_VAL.value());
				dmndDivR.wg_cd(MAC_STR.NULL_VAL.value());
				dmndDivR.sls_dpt_cd(r.dmnd_dpt_cd());
				bindDmndDivL.add(dmndDivR);
				
				// 物流グループ・ワーキンググループ指定
				dmndDivR = dmndDivR.clone();
				dmndDivR.wg_cd(r.getStringNE("WG_CD"));
				dmndDivR.sls_dpt_cd(MAC_STR.NULL_VAL.value());
				bindDmndDivL.add(dmndDivR);
			}
			for(MST_DMND_R r : dmndL.groupBy("ITM_SHIP_GRP_CD", "WG_CD", MST_DMND_R.$dmnd_dpt_cd)) {
				MAM_DMND_DIV_R dmndDivR = MAM_DMND_DIV_R.create();
				
				// 品目出荷グループ・売上部門指定
				dmndDivR.to_lg_grp_cd(MAC_STR.NULL_VAL.value());
				dmndDivR.itm_ship_grp_cd(r.getStringNE("ITM_SHIP_GRP_CD"));
				dmndDivR.itm_cd(MAC_STR.NULL_VAL.value());
				dmndDivR.itm_sub1(MAC_STR.NULL_VAL.value());
				dmndDivR.itm_sub2(MAC_STR.NULL_VAL.value());
				dmndDivR.itm_sub3(MAC_STR.NULL_VAL.value());
				dmndDivR.wg_cd(MAC_STR.NULL_VAL.value());
				dmndDivR.sls_dpt_cd(r.dmnd_dpt_cd());
				bindDmndDivL.add(dmndDivR);
				
				// 品目出荷グループ・ワーキンググループ指定
				dmndDivR = dmndDivR.clone();
				dmndDivR.wg_cd(r.getStringNE("WG_CD"));
				dmndDivR.sls_dpt_cd(MAC_STR.NULL_VAL.value());
				bindDmndDivL.add(dmndDivR);
			}
			for(MST_DMND_R r : dmndL.groupBy("WG_CD", MST_DMND_R.$dmnd_dpt_cd)) {
				MAM_DMND_DIV_R dmndDivR = MAM_DMND_DIV_R.create();
				
				// 売上部門指定
				dmndDivR.to_lg_grp_cd(MAC_STR.NULL_VAL.value());
				dmndDivR.itm_ship_grp_cd(MAC_STR.NULL_VAL.value());
				dmndDivR.itm_cd(MAC_STR.NULL_VAL.value());
				dmndDivR.itm_sub1(MAC_STR.NULL_VAL.value());
				dmndDivR.itm_sub2(MAC_STR.NULL_VAL.value());
				dmndDivR.itm_sub3(MAC_STR.NULL_VAL.value());
				dmndDivR.wg_cd(MAC_STR.NULL_VAL.value());
				dmndDivR.sls_dpt_cd(r.dmnd_dpt_cd());
				bindDmndDivL.add(dmndDivR);
				
				// 品目出荷グループ・ワーキンググループ指定
				dmndDivR = dmndDivR.clone();
				dmndDivR.wg_cd(r.getStringNE("WG_CD"));
				dmndDivR.sls_dpt_cd(MAC_STR.NULL_VAL.value());
				bindDmndDivL.add(dmndDivR);
				
				// 受注引当マスタ　ワーキンググループ指定
				MAM_SLO_ALLOC_R sloAllocR = MAM_SLO_ALLOC_R.create();
				sloAllocR.to_lg_grp_cd(MAC_STR.NULL_VAL.value());
				sloAllocR.itm_ship_grp_cd(MAC_STR.NULL_VAL.value());
				sloAllocR.wg_cd(r.getStringNE("WG_CD"));
				bindSloAllocL.add(sloAllocR);
			}
			
			bindDmndDivL = bindDmndDivL.groupBy(getDmndDivGroupByKeys());
			bindSloAllocL = bindSloAllocL.groupBy(getSloAllocGroupByKeys());
			
			// 需要情報分割マスタの取得
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");

			MAM_DMND_DIV_R t = MAM_DMND_DIV_R.create("T");
			MCQueryApiBuilder dmndDivL_bldr = MCQueryApiBuilder.create(t);
			dmndDivL_bldr.addSelect(m1.wg_cd.as("ship_wg_cd"));
			dmndDivL_bldr.addSelect(m1.lg_grp_cd.as("ship_lg_grp_cd"));
			dmndDivL_bldr.addInnerJoin(m1, bracket( m1.loc_cd.eq(t.ship_loc_cd)));
			dmndDivL_bldr.setWhere(t.to_lg_grp_cd.eq(bind("to_lg_grp_cd")));
			dmndDivL_bldr.addWhereWithAnd(t.itm_ship_grp_cd.eq(bind("itm_ship_grp_cd")));
			dmndDivL_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
			dmndDivL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			dmndDivL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			dmndDivL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			dmndDivL_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			dmndDivL_bldr.addWhereWithAnd(t.sls_dpt_cd.eq(bind("sls_dpt_cd")));
			dbSelect("MSBAB0060_MAM_DMND_DIV_S01", dmndDivL, dmndDivL_bldr, bindDmndDivL);
			MCIndexKey dmndDivKey = dmndDivL.createIndex(getDmndDivGroupByKeys());

			// 受注引当マスタの取得
			MAM_LOC_R m2 = MAM_LOC_R.create("M1");

			MAM_SLO_ALLOC_R t2 = MAM_SLO_ALLOC_R.create("T");
			MCQueryApiBuilder sloAllocL_bldr = MCQueryApiBuilder.create(t2);
			sloAllocL_bldr.addSelect(m2.wg_cd.as("ship_wg_cd"));
			sloAllocL_bldr.addSelect(m2.lg_grp_cd.as("ship_lg_grp_cd"));
			sloAllocL_bldr.addInnerJoin(m2, bracket(m2.loc_cd.eq(t2.ship_loc_cd)));
			sloAllocL_bldr.setWhere(t2.to_lg_grp_cd.eq(bind("to_lg_grp_cd")));
			sloAllocL_bldr.addWhereWithAnd(t2.itm_ship_grp_cd.eq(bind("itm_ship_grp_cd")));
			sloAllocL_bldr.addWhereWithAnd(t2.wg_cd.eq(bind("wg_cd")));
			sloAllocL_bldr.addWhereWithAnd(t2.def_flg.eq(value(true)));
			dbSelect("MSBAB0060_MAM_SLO_ALLOC_S01", sloAllocL, sloAllocL_bldr, bindSloAllocL);
			MCIndexKey sloAllocKey = sloAllocL.createIndex(getSloAllocGroupByKeys());
			
			dmndL.clear();
			for(MST_DMND_R r : tmpL) {
				if(!isNull(r.dmnd_loc_cd())) {
					r.addStringColumn("SHIP_WG_CD", r.getStringNE("LOC_WG_CD"));
					r.addStringColumn("SHIP_LG_GRP_CD", r.getStringNE("LOC_LG_GRP_CD"));
					dmndL.add(r);
					continue;
				}
				
				boolean exists = false;
				
				// 需要情報分割マスタによる需要場所の決定
				// 物流グループ・品目・売上部門一致
				MCList<MAM_DMND_DIV_R> tmpDmndDivL = dmndDivL.subList(dmndDivKey,
						r.getStringNE("LG_GRP_CD"), MAC_STR.NULL_VAL.value(), r.itm_cd(),
								r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
								MAC_STR.NULL_VAL.value(), r.dmnd_dpt_cd());

				if(!isNull(tmpDmndDivL)) {
					exists = divideQty(tmpDmndDivL, r, dmndL);
					if(exists) {
						continue;
					}
				}
				
				// 物流グループ・品目・ワーキンググループ一致
				tmpDmndDivL = dmndDivL.subList(dmndDivKey,
						r.getStringNE("LG_GRP_CD"), MAC_STR.NULL_VAL.value(), r.itm_cd(),
								r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
								r.getStringNE("WG_CD"), MAC_STR.NULL_VAL.value());

				if(!isNull(tmpDmndDivL)) {
					exists = divideQty(tmpDmndDivL, r, dmndL);
					if(exists) {
						continue;
					}
				}

				// 品目・売上部門一致
				tmpDmndDivL = dmndDivL.subList(dmndDivKey,
						MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), r.itm_cd(),
								r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
								MAC_STR.NULL_VAL.value(), r.dmnd_dpt_cd());

				if(!isNull(tmpDmndDivL)) {
					exists = divideQty(tmpDmndDivL, r, dmndL);
					if(exists) {
						continue;
					}
				}
				
				// 品目・ワーキンググループ一致
				tmpDmndDivL = dmndDivL.subList(dmndDivKey,
						MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), r.itm_cd(),
								r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
								r.getStringNE("WG_CD"), MAC_STR.NULL_VAL.value());

				if(!isNull(tmpDmndDivL)) {
					exists = divideQty(tmpDmndDivL, r, dmndL);
					if(exists) {
						continue;
					}
				}

				// 物流グループ・品目出荷グループ・売上部門一致
				tmpDmndDivL = dmndDivL.subList(dmndDivKey,
						r.getStringNE("LG_GRP_CD"), r.getStringNE("ITM_SHIP_GRP_CD"), MAC_STR.NULL_VAL.value(),
								MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
								MAC_STR.NULL_VAL.value(), r.dmnd_dpt_cd());

				if(!isNull(tmpDmndDivL)) {
					exists = divideQty(tmpDmndDivL, r, dmndL);
					if(exists) {
						continue;
					}
				}

				// 物流グループ・品目出荷グループ・ワーキンググループ一致
				tmpDmndDivL = dmndDivL.subList(dmndDivKey,
						r.getStringNE("LG_GRP_CD"), r.getStringNE("ITM_SHIP_GRP_CD"), MAC_STR.NULL_VAL.value(),
								MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
								r.getStringNE("WG_CD"), MAC_STR.NULL_VAL.value());

				if(!isNull(tmpDmndDivL)) {
					exists = divideQty(tmpDmndDivL, r, dmndL);
					if(exists) {
						continue;
					}
				}

				// 品目出荷グループ・売上部門一致
				tmpDmndDivL = dmndDivL.subList(dmndDivKey,
						MAC_STR.NULL_VAL.value(), r.getStringNE("ITM_SHIP_GRP_CD"), MAC_STR.NULL_VAL.value(),
								MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
								MAC_STR.NULL_VAL.value(), r.dmnd_dpt_cd());

				if(!isNull(tmpDmndDivL)) {
					exists = divideQty(tmpDmndDivL, r, dmndL);
					if(exists) {
						continue;
					}
				}

				// 品目出荷グループ・ワーキンググループ一致
				tmpDmndDivL = dmndDivL.subList(dmndDivKey,
						MAC_STR.NULL_VAL.value(), r.getStringNE("ITM_SHIP_GRP_CD"), MAC_STR.NULL_VAL.value(),
								MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
								r.getStringNE("WG_CD"), MAC_STR.NULL_VAL.value());

				if(!isNull(tmpDmndDivL)) {
					exists = divideQty(tmpDmndDivL, r, dmndL);
					if(exists) {
						continue;
					}
				}

				// 物流グループ・売上部門一致
				tmpDmndDivL = dmndDivL.subList(dmndDivKey,
						r.getStringNE("LG_GRP_CD"), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
								MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
								MAC_STR.NULL_VAL.value(), r.dmnd_dpt_cd());

				if(!isNull(tmpDmndDivL)) {
					exists = divideQty(tmpDmndDivL, r, dmndL);
					if(exists) {
						continue;
					}
				}

				// 物流グループ・ワーキンググループ一致
				tmpDmndDivL = dmndDivL.subList(dmndDivKey,
						r.getStringNE("LG_GRP_CD"), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
								MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
								r.getStringNE("WG_CD"), MAC_STR.NULL_VAL.value());

				if(!isNull(tmpDmndDivL)) {
					exists = divideQty(tmpDmndDivL, r, dmndL);
					if(exists) {
						continue;
					}
				}

				// 売上部門一致
				tmpDmndDivL = dmndDivL.subList(dmndDivKey,
						MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
								MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
								MAC_STR.NULL_VAL.value(), r.dmnd_dpt_cd());

				if(!isNull(tmpDmndDivL)) {
					exists = divideQty(tmpDmndDivL, r, dmndL);
					if(exists) {
						continue;
					}
				}

				// ワーキンググループ一致
				tmpDmndDivL = dmndDivL.subList(dmndDivKey,
						MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
								MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
								r.getStringNE("WG_CD"), MAC_STR.NULL_VAL.value());

				if(!isNull(tmpDmndDivL)) {
					exists = divideQty(tmpDmndDivL, r, dmndL);
					if(exists) {
						continue;
					}
				}

				// 受注引当マスタによる需要場所の決定
				// 物流グループ・品目出荷グループ・ワーキンググループ指定
				MAM_SLO_ALLOC_R sloAllocR = sloAllocL.getFirst(sloAllocKey,
						r.getStringNE("LG_GRP_CD"), r.getStringNE("ITM_SHIP_GRP_CD"),
						r.getStringNE("WG_CD"));

				if(!isNull(sloAllocR)) {
					r.dmnd_loc_cd(sloAllocR.ship_loc_cd());
					r.addStringColumn("SHIP_WG_CD", sloAllocR.getStringNE("SHIP_WG_CD"));
					r.addStringColumn("SHIP_LG_GRP_CD", sloAllocR.getStringNE("SHIP_LG_GRP_CD"));
					dmndL.add(r);
					continue;
				}

				// 品目出荷グループ・ワーキンググループ指定
				sloAllocR = sloAllocL.getFirst(sloAllocKey,
						MAC_STR.NULL_VAL.value(), r.getStringNE("ITM_SHIP_GRP_CD"),
						r.getStringNE("WG_CD"));

				if(!isNull(sloAllocR)) {
					r.dmnd_loc_cd(sloAllocR.ship_loc_cd());
					r.addStringColumn("SHIP_WG_CD", sloAllocR.getStringNE("SHIP_WG_CD"));
					r.addStringColumn("SHIP_LG_GRP_CD", sloAllocR.getStringNE("SHIP_LG_GRP_CD"));
					dmndL.add(r);
					continue;
				}

				// 物流グループ・ワーキンググループ指定
				sloAllocR = sloAllocL.getFirst(sloAllocKey,
						r.getStringNE("LG_GRP_CD"), MAC_STR.NULL_VAL.value(),
						r.getStringNE("WG_CD"));

				if(!isNull(sloAllocR)) {
					r.dmnd_loc_cd(sloAllocR.ship_loc_cd());
					r.addStringColumn("SHIP_WG_CD", sloAllocR.getStringNE("SHIP_WG_CD"));
					r.addStringColumn("SHIP_LG_GRP_CD", sloAllocR.getStringNE("SHIP_LG_GRP_CD"));
					dmndL.add(r);
					continue;
				}

				// ワーキンググループ指定
				sloAllocR = sloAllocL.getFirst(sloAllocKey,
						MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
						r.getStringNE("WG_CD"));

				if(!isNull(sloAllocR)) {
					r.dmnd_loc_cd(sloAllocR.ship_loc_cd());
					r.addStringColumn("SHIP_WG_CD", sloAllocR.getStringNE("SHIP_WG_CD"));
					r.addStringColumn("SHIP_LG_GRP_CD", sloAllocR.getStringNE("SHIP_LG_GRP_CD"));
					dmndL.add(r);
					continue;
				}

				// 該当マスタが取得できない場合はエラー
				_logger.writeDataLog(MSBAL0006, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), r.getStringNE("ITM_SHIP_GRP_CD"), r.getStringNE("LG_GRP_CD"), r.getStringNE("WG_CD"), r.dmnd_dpt_cd(), toYMDString(r.dmnd_dt()));
				_errorCnt++;
				
			}
		}
		/**
		 * 物流制御マスタ、取引先マスタの出荷ＬＴを加味した需要期間を設定する
		 * @param dmndL
		 */
		protected void calcDmndDt(MCList<MST_DMND_R> dmndL) {
			// 販売計画、顧客期間内示の需要情報を取得
			MCList<MST_DMND_R> tgtDmndL = dmndL
					.subList(r -> MSC_DMND_TYP.isCST_FRCST(r.dmnd_typ())
							|| MSC_DMND_TYP.isPLN_SLS(r.dmnd_typ()));
			if (tgtDmndL.isEmpty()) {
				return;
			}
			
			// 取引先マスタの出荷ＬＴを取得
			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t);
			bpL_bldr.setSelect(t.bp_cd, t.ship_lt);
			bpL_bldr.setWhere(t.bp_cd.eq(bind("cst_cd")));
			dbSelect("MSBAB0060_MAM_BP_S01", bpL, bpL_bldr, tgtDmndL);
			MCIndexKey bpKey = bpL.createIndex(MAM_BP_R.$bp_cd);

			// 物流制御マスタの移動ＬＴを取得
			MCList<MST_DMND_R> bindDmndL = MCList.create(MST_DMND_R.class);
			for (MST_DMND_R r : tgtDmndL.groupBy("SHIP_LG_GRP_CD", "LG_GRP_CD", "SHIP_TERM_CD")) {
				if (isNullOrNullVal(r.getStringNE("SHIP_LG_GRP_CD")) || isNullOrNullVal(r.getStringNE("LG_GRP_CD"))) {
					continue;
				}
				bindDmndL.add(r);
				
				// 出荷条件は一致するものがない場合はNULL文字のものを取得する必要があるため、対象に追加
				if (!MAC_STR.isNULL_VAL(r.getStringNE("SHIP_TERM_CD"))) {
					MST_DMND_R copyR = r.clone();
					copyR.setStringNE("SHIP_TERM_CD", MAC_STR.NULL_VAL.value());
					bindDmndL.add(copyR);
				}
			}
			MCList<MAM_LG_CTL_R> lgCtlL = MCList.create(MAM_LG_CTL_R.class);
			MAM_LG_CTL_R t2 = MAM_LG_CTL_R.create("T2");
			MCQueryApiBuilder lgCtlL_bldr = MCQueryApiBuilder.create(t2);
			lgCtlL_bldr.setSelect(t2.fr_lg_grp_cd, t2.to_lg_grp_cd, t2.ship_term_cd, t2.xfr_lt, t2.non_dmnd_lt_flg);
			lgCtlL_bldr.setWhere(t2.fr_lg_grp_cd.eq(bind("ship_lg_grp_cd")));
			lgCtlL_bldr.addWhereWithAnd(t2.to_lg_grp_cd.eq(bind("lg_grp_cd")));
			lgCtlL_bldr.addWhereWithAnd(t2.ship_term_cd.eq(bind("ship_term_cd")));
			dbSelect("MSBAB0060_MAM_LG_CTL_S01", lgCtlL, lgCtlL_bldr, bindDmndL);
			MCIndexKey lgCtlKey = lgCtlL.createIndex(MAM_LG_CTL_R.$fr_lg_grp_cd, MAM_LG_CTL_R.$to_lg_grp_cd, MAM_LG_CTL_R.$ship_term_cd);
			
			for (MST_DMND_R r : tgtDmndL) {
				MAM_LG_CTL_R lgCtlR = lgCtlL.getFirst(lgCtlKey, r.getStringNE("SHIP_LG_GRP_CD"), r.getStringNE("LG_GRP_CD"), r.getStringNE("SHIP_TERM_CD"));
				if (!isNull(lgCtlR)) {
					if (!lgCtlR.non_dmnd_lt_flg()) {
						r.dmnd_st_dt(r.dlv_schd_st_dt().addDay(lgCtlR.xfr_lt().negate()));
						r.dmnd_end_dt(r.dlv_schd_end_dt().addDay(lgCtlR.xfr_lt().negate()));
					}
				}
				else {
					lgCtlR = lgCtlL.getFirst(lgCtlKey, r.getStringNE("SHIP_LG_GRP_CD"), r.getStringNE("LG_GRP_CD"), MAC_STR.NULL_VAL.value());
					if (!isNull(lgCtlR)) {
						if (!lgCtlR.non_dmnd_lt_flg()) {
							r.dmnd_st_dt(r.dlv_schd_st_dt().addDay(lgCtlR.xfr_lt().negate()));
							r.dmnd_end_dt(r.dlv_schd_end_dt().addDay(lgCtlR.xfr_lt().negate()));
						}
					}
				}
				
				if (!isNullOrNullVal(r.getStringNE("LG_GRP_CD"))) {
					continue;
				}
				MAM_BP_R bpR = bpL.getFirst(bpKey, r.cst_cd());
				if (!isNull(bpR) && !isNull(bpR.ship_lt())) {
					r.dmnd_st_dt(r.dlv_schd_st_dt().addDay(bpR.ship_lt().negate()));
					r.dmnd_end_dt(r.dlv_schd_end_dt().addDay(bpR.ship_lt().negate()));
				}
			}
		}
		
		protected String[] getDmndDivGroupByKeys() {
			return new String[] {
					MAM_DMND_DIV_R.$to_lg_grp_cd, MAM_DMND_DIV_R.$itm_ship_grp_cd,
					MAM_DMND_DIV_R.$itm_cd, MAM_DMND_DIV_R.$itm_sub1,
					MAM_DMND_DIV_R.$itm_sub2, MAM_DMND_DIV_R.$itm_sub3,
					MAM_DMND_DIV_R.$wg_cd, MAM_DMND_DIV_R.$sls_dpt_cd
			};
		}

		protected String[] getSloAllocGroupByKeys() {
			return new String[] {
					MAM_SLO_ALLOC_R.$to_lg_grp_cd, MAM_SLO_ALLOC_R.$itm_ship_grp_cd,
					MAM_SLO_ALLOC_R.$wg_cd
			};
		}

		/**
		 * 需要情報の数量を分割する。
		 * @param tmpDmndDivL　需要情報分割マスタの結果
		 * @param r　該当の需要情報
		 * @param dmndL　需要情報のリスト
		 * @return マスタが取得できたか否か 
		 */
		protected boolean divideQty(MCList<MAM_DMND_DIV_R> tmpDmndDivL, MST_DMND_R r, MCList<MST_DMND_R> dmndL) {
			MCList<MST_DMND_R> tmpDivL = MCList.create(MST_DMND_R.class);
			boolean exists = false;
			
			for(MAM_DMND_DIV_R dmndDivR : tmpDmndDivL) {
				if(r.dmnd_dt().gte(dmndDivR.st_dt()) && r.dmnd_dt().lte(dmndDivR.end_dt())) {
					MST_DMND_R copyR = r.clone();
					copyR.dmnd_loc_cd(dmndDivR.ship_loc_cd());
					copyR.addStringColumn("SHIP_WG_CD", dmndDivR.getStringNE("SHIP_WG_CD"));
					copyR.addStringColumn("SHIP_LG_GRP_CD", dmndDivR.getStringNE("SHIP_LG_GRP_CD"));
					copyR.addNumberColumn("DMND_DIV_RATIO", dmndDivR.dmnd_div_ratio());
					tmpDivL.add(copyR);
					exists = true;
				}
			}
			
			// 按分処理
			if(exists) {
				if(tmpDmndDivL.size() == 1) {
					dmndL.add(tmpDivL.get(0));
				}
				else {
					FXUCC_Divide.prop(tmpDivL, r.input_qty(),
							r.getNumberNE("DEC_PLACE").intValue(),
							"DMND_DIV_RATIO",
							MST_DMND_R.$input_qty);
					
					for(MST_DMND_R tmpR : tmpDivL) {
						MST_DMND_R copyR = tmpR.clone();
						copyR.dmnd_qty(copyR.input_qty());
						dmndL.add(copyR);
					}
				}
			}
			
			return exists;
		}

		/**
		 * 元となる需要情報がない日次需要情報を削除
		 */
		protected void delDlyDmnd() {
			MST_DMND_R t2 = MST_DMND_R.create("T2");

			// 元となる需要の判断に需要ＮＯは使えない。
			// 日次需要作成ＦＬＧがオフの場合に、需要情報のみ新しいＮＯになっているため。
			MCList<MST_DLY_DMND_R> dlyDmndL = MCList.create(MST_DLY_DMND_R.class);
			MST_DLY_DMND_R t = MST_DLY_DMND_R.create("T");
			MCQueryApiBuilder dlyDmndL_bldr = MCQueryApiBuilder.create(t);
			dlyDmndL_bldr.setSelect(t.dly_dmnd_no);
			dlyDmndL_bldr.addLeftOuterJoin(t2, bracket( t2.itm_cd.eq(t.itm_cd) .and(t2.itm_sub1.eq(t.itm_sub1)) .and(t2.itm_sub2.eq(t.itm_sub2)) .and(t2.itm_sub3.eq(t.itm_sub3)) .and( nvl( t2.spln_itm_cd, value(MAC_STR.NULL_VAL.value()) ).eq(nvl( t.spln_itm_cd, value(MAC_STR.NULL_VAL.value()) ) ) ) .and(t2.dmnd_typ.eq(t.dmnd_typ)) .and(t2.dmnd_dpt_cd.eq(t.dmnd_dpt_cd)) .and( nvl( t2.slo_d_no, value(MAC_STR.NULL_VAL.value()) ).eq(nvl( t.slo_d_no, value(MAC_STR.NULL_VAL.value()) ) ) ) .and( nvl( t2.slo_no, value(MAC_STR.NULL_VAL.value()) ).eq(nvl( t.slo_no, value(MAC_STR.NULL_VAL.value()) ) ) ) .and( nvl( t2.cst_frcst_d_no, value(MAC_STR.NULL_VAL.value()) ).eq(nvl( t.cst_frcst_d_no, value(MAC_STR.NULL_VAL.value()) ) ) ) .and( nvl( t2.cst_frcst_no, value(MAC_STR.NULL_VAL.value()) ).eq(nvl( t.cst_frcst_no, value(MAC_STR.NULL_VAL.value()) ) ) ) .and( t2.ym.eq(t.ym) .or( t2.ym.isNull() .and(t.ym.isNull()) ) ) .and( nvl( t2.spln_vers, value(MAC_STR.NULL_VAL.value()) ).eq(nvl( t.spln_vers, value(MAC_STR.NULL_VAL.value()) ) ) ) .and( nvl( t2.cur_cd, value(MAC_STR.NULL_VAL.value()) ).eq(nvl( t.cur_cd, value(MAC_STR.NULL_VAL.value()) ) ) )));
			dlyDmndL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			dlyDmndL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			dlyDmndL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			dlyDmndL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			dlyDmndL_bldr.addWhereWithAnd(t.dmnd_dpt_cd.eq(bind("dpt_cd")));
			dlyDmndL_bldr.addConstWhereWithAnd(t2.dmnd_no.isNull());
			dbSelect("MSBAB0060_MST_DLY_DMND_S01", dlyDmndL, dlyDmndL_bldr, up0(), null);
			
			if(!dlyDmndL.isEmpty()) {
				_totalCnt += dlyDmndL.size();
				dbDeleteKey("MSBAB0060_MST_DLY_DMND_D01", dlyDmndL, dlyDmndL_bldr);
				_successCnt += dlyDmndL.size();
			}
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			DmndReg_Upd02_RsltR downR = DmndReg_Upd02_RsltR.create();
			downR.total_cnt(_totalCnt);
			downR.success_cnt(_successCnt);
			downR.error_cnt(_errorCnt);
			down0().add(downR);
		}
	}

	//FMCB CUSTOM END
}