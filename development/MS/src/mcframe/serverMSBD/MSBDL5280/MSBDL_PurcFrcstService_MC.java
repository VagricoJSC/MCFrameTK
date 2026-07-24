package mcframe.serverMSBD.MSBDL5280;

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
import mcframe.serverMSBD.MSBDL5280.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBD.MSBDL5280.Query.*;
import mcframe.commonCore.report.container.*;
import mcframe.serverCore.report.MCServerReportManager;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.commonMSBD.MSBDR0010.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverCore.sys.MCSys;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Map.*;
import mcframe.serverMSUC.MSUCL0120.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcFrcstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcFrcstService_MC extends MSBDL_PurcFrcstService_MC_A{
	//FMCB CUSTOM START

	/**
	 * PurcFrcst_Srch01オペレーション.<p>
	 *
	 * 購買内示情報（最新内示日）を検索する。<br>
	 */
	public class PurcFrcst_Srch01 extends MSBDL_PurcFrcstService_MC_A.PurcFrcst_Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			MCList<PurcFrcst_Srch01_RsltR> rsltL = srch();
			editDown(rsltL);
		}
		/**
		 * 最新購買内示データ検索
		 */
		protected MCList<PurcFrcst_Srch01_RsltR> srch() {
			if (!isNull(up1())){
				return srch2();
			}
			else if (!isNull(up0().ymd_fr())) {
				return srch1();
			}
			return null;
		}

		/**
		 * 最新購買内示データ検索（条件１）
		 */
		protected MCList<PurcFrcst_Srch01_RsltR> srch1() {
			MCList<PurcFrcst_Srch01_RsltR> rsltL = MCList.create(PurcFrcst_Srch01_RsltR.class);
			MCQueryPlan sql = MSBDL5280_MST_PURC_FRCST_H_S04();
			executeQuery(rsltL, sql, up0());
			return rsltL;
		}

		/**
		 * 最新購買内示データ検索（条件２）
		 */
		protected MCList<PurcFrcst_Srch01_RsltR> srch2() {
			MCList<PurcFrcst_Srch01_RsltR> rsltL = MCList.create(PurcFrcst_Srch01_RsltR.class);

			MST_PURC_FRCST_H_R t1 = MST_PURC_FRCST_H_R.create("T1");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			
			MCList<MST_PURC_FRCST_FIX_R> fixL = MCList.create(MST_PURC_FRCST_FIX_R.class);
			MST_PURC_FRCST_FIX_R t = MST_PURC_FRCST_FIX_R.create("T");
			MCQueryApiBuilder fixL_bldr = MCQueryApiBuilder.create(t);
			
			fixL_bldr.setSelect(t.purc_frcst_fix_no);
			fixL_bldr.addInnerJoin(t1, bracket(t1.purc_frcst_no.eq(t.purc_frcst_no)));
			fixL_bldr.addInnerJoin(m1,
					bracket(m1.itm_cd.eq(t.itm_cd)
							.and(m1.itm_sub1.eq(t.itm_sub1))
							.and(m1.itm_sub2.eq(t.itm_sub2))
							.and(m1.itm_sub3.eq(t.itm_sub3))));
			fixL_bldr.addWhereWithAnd(t1.sppl_cd.eq(bind("sppl_cd")));
			fixL_bldr.addWhereWithAnd(t1.wg_cd.eq(bind("wg_cd")));
			fixL_bldr.addWhereWithAnd(t1.del_flg.eq(value(false)));
			fixL_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
			fixL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			fixL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			fixL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			fixL_bldr.addWhereWithAnd(t.fix_flg.eq(value(true)));
			dbSelect("MSBDL5280_MST_PURC_FRCST_FIX_S01", fixL, fixL_bldr, up1());
			if (!isNull(fixL)) {
				dbWkDelete("MSBDL5280_MSW_PURC_FRCST_FIX_D01", fixL_bldr.getBaseDbc());
				dbWkInsert("MSBDL5280_MSW_PURC_FRCST_FIX_I01", fixL, fixL_bldr.getBaseDbc());
				MCQueryPlan sql = MSBDL5280_MST_PURC_FRCST_H_S05();
				executeQuery(rsltL, sql, up0());
			}
			return rsltL;
		}

		/**
		 * 下り電文編集
		 */
		protected void editDown(MCList<PurcFrcst_Srch01_RsltR> rsltL) {
			if (isNull(rsltL)) {
				return;
			}
			String[] keys = new String[] {
					PurcFrcst_Srch01_RsltR.$sppl_cd,
					PurcFrcst_Srch01_RsltR.$itm_cd,
					PurcFrcst_Srch01_RsltR.$itm_sub1,
					PurcFrcst_Srch01_RsltR.$itm_sub2,
					PurcFrcst_Srch01_RsltR.$itm_sub3,
					PurcFrcst_Srch01_RsltR.$wg_cd,
					PurcFrcst_Srch01_RsltR.$pf_period_typ,
					PurcFrcst_Srch01_RsltR.$pf_period_st_dt};
			for (MCList<PurcFrcst_Srch01_RsltR> subL : rsltL.groupList(keys)) {
				subL.sort(SortType.DESC, PurcFrcst_Srch01_RsltR.$pf_dt);
				down0().add(subL.get(0));
			}
		}
	}
	/**
	 * PurcFrcst_Srch02オペレーション.<p>
	 *
	 * 納入予定日基準で発注データを検索する。<br>
	 */
	public class PurcFrcst_Srch02 extends MSBDL_PurcFrcstService_MC_A.PurcFrcst_Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srch();
		}
		/**
		 * 発注データ検索
		 */
		protected void srch() {
			MCList<MST_PURC_FRCST_BAL_R> wkL = MCList.create(MST_PURC_FRCST_BAL_R.class);
			String[] grpKeys = new String[] {
				PurcFrcst_Srch02_CndR.$sppl_cd,
				PurcFrcst_Srch02_CndR.$wg_cd,
				PurcFrcst_Srch02_CndR.$itm_cd,
				PurcFrcst_Srch02_CndR.$itm_sub1,
				PurcFrcst_Srch02_CndR.$itm_sub2,
				PurcFrcst_Srch02_CndR.$itm_sub3};
			// 検索条件FROMの会計月度開始日
			MCDate acfrd = getYmStDt(up1().ym_fr());
			// 検索条件TOの会計月度終了日
			MCDate actod = getYmEndDt(up1().ym_to());
			
			// 期間開始（月）
			MCDate frm = getPeriodStDt(acfrd, MAC_PERIOD_TYP.MONTHLY.value());
			// 期間開始（週）
			MCDate frd = execFuncDate(createSqlId(LOGIC_ID, "MAPA_DT$F_GET_YM_ST_DT_NE1", "01"),
					MAPA_DT$F_GET_YM_ST_DT_NE1(value(up1().ym_fr()),
							value(MAC_PERIOD_TYP.WEEKLY.value()),
							value(getCo().ac_cl_day()), value(getCo().ac_cl_mon_base())));
			// 期間終了（月）
			MCDate tom = getPeriodEndDt(actod, MAC_PERIOD_TYP.MONTHLY.value());
			// 期間終了（週）
			MCDate tod = execFuncDate(createSqlId(LOGIC_ID, "MAPA_DT$F_GET_YM_END_DT_NE1", "01"),
					MAPA_DT$F_GET_YM_END_DT_NE1(value(up1().ym_to()),
							value(MAC_PERIOD_TYP.WEEKLY.value()),
							value(getCo().ac_cl_day()), value(getCo().ac_cl_mon_base())));
		
			// 月・週の開始日・終了日を比較し、日付の早いほうが検索期間開始日、遅いほうが検索期間終了日
			MCDate wkFrd = frd.lt(frm) ? frd : frm;
			MCDate wkTod = tod.gt(tom) ? tod : tom;
			
			for (MCList<PurcFrcst_Srch02_CndR> subL: up0().groupList(grpKeys)) {
				MST_PURC_FRCST_BAL_R wkFr = MST_PURC_FRCST_BAL_R.create();
				PurcFrcst_Srch02_CndR subR = subL.get(0);
				copy(wkFr, subR, createMap_MST_PURC_FRCST_BAL_R_PurcFrcst_Srch02_CndR());
				wkFr.ym(wkFrd);
				wkL.add(wkFr);
				MST_PURC_FRCST_BAL_R wkTo = MST_PURC_FRCST_BAL_R.create();
				copy(wkTo, subL.get(0), createMap_MST_PURC_FRCST_BAL_R_PurcFrcst_Srch02_CndR());
				wkTo.ym(wkTod);
				wkL.add(wkTo);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_PURC_FRCST_BAL_R.create("T"));
			dbWkDelete("MSBDL5280_MSW_PURC_FRCST_BAL_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBDL5280_MSW_PURC_FRCST_BAL_I01", wkL, wkL_bldr.getBaseDbc());
			executeQuery(down0(), MSBDL5280_MST_PO_S01());
		}

		
		protected Map_MST_PURC_FRCST_BAL_R_PurcFrcst_Srch02_CndR<MST_PURC_FRCST_BAL_R,PurcFrcst_Srch02_CndR> createMap_MST_PURC_FRCST_BAL_R_PurcFrcst_Srch02_CndR() {
			return new Map_MST_PURC_FRCST_BAL_R_PurcFrcst_Srch02_CndR<MST_PURC_FRCST_BAL_R, PurcFrcst_Srch02_CndR>();
		}
		public class Map_MST_PURC_FRCST_BAL_R_PurcFrcst_Srch02_CndR<D extends MST_PURC_FRCST_BAL_R, S extends PurcFrcst_Srch02_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PURC_FRCST_BAL_R.$sppl_cd, PurcFrcst_Srch02_CndR.$sppl_cd);
				addColumnPathMap(MST_PURC_FRCST_BAL_R.$wg_cd, PurcFrcst_Srch02_CndR.$wg_cd);
				addColumnPathMap(MST_PURC_FRCST_BAL_R.$itm_cd, PurcFrcst_Srch02_CndR.$itm_cd);
				addColumnPathMap(MST_PURC_FRCST_BAL_R.$itm_sub1, PurcFrcst_Srch02_CndR.$itm_sub1);
				addColumnPathMap(MST_PURC_FRCST_BAL_R.$itm_sub2, PurcFrcst_Srch02_CndR.$itm_sub2);
				addColumnPathMap(MST_PURC_FRCST_BAL_R.$itm_sub3, PurcFrcst_Srch02_CndR.$itm_sub3);
			}
		}

	}

	/**
	 * PurcFrcst_Chk01オペレーション.<p>
	 *
	 * 更新前チェック<br>
	 */
	public class PurcFrcst_Chk01 extends MSBDL_PurcFrcstService_MC_A.PurcFrcst_Chk01 {
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
			return super.doServerCheckBase();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (!hasErrFlgOn(up0(), up1(), up2())) {
				msgL.addAll(checkHdrUpdCntr());
				msgL.addAll(checkFixUpdCntr());
				msgL.addAll(chkDecPlace());
				msgL.addAll(chkFixPeriod());
			}
			return msgL;
		}

		/**
		 * 更新カウンタチェック
		 */
		protected MCMessageList checkHdrUpdCntr() {
			MCMessageList msgL = new MCMessageList();
			if (isNull(up0())) {
				return msgL;
			}
			MCIndexKey idxKey = up0().createIndex(PurcFrcst_Chk01_HdrR.$purc_frcst_no);
			MCList<MST_PURC_FRCST_H_R> dbcL = srchHdr();
			for (MST_PURC_FRCST_H_R dbcR: dbcL) {
				PurcFrcst_Chk01_HdrR upR = up0().getFirst(idxKey, dbcR.purc_frcst_no());
				if (!isNull(upR)) {
					msgL.addAll(checkUpdCntrNE(upR, PurcFrcst_Chk01_HdrR.$upd_cntr, dbcR));
				}
			}
			return msgL;
		}

		/**
		 * 更新カウンタチェック
		 */
		protected MCMessageList checkFixUpdCntr() {
			MCMessageList msgL = new MCMessageList();
			if (isNull(up1())) {
				return msgL;
			}
			MCIndexKey idxKey = up1().createIndex(PurcFrcst_Chk01_FixR.$purc_frcst_fix_no);
			MCList<MST_PURC_FRCST_FIX_R> dbcFixItmL = srchFix();
			for (MST_PURC_FRCST_FIX_R dbcR: dbcFixItmL) {
				PurcFrcst_Chk01_FixR upR = up1().getFirst(idxKey, dbcR.purc_frcst_fix_no());
				if (!isNull(upR)) {
					msgL.addAll(checkUpdCntrNE(upR, PurcFrcst_Chk01_FixR.$upd_cntr, dbcR));
				}
			}
			return msgL;
		}

		/**
		 * 小数有効桁数チェック
		 */
		protected MCMessageList chkDecPlace() {
			MCMessageList msgL = new MCMessageList();
			if (isNull(up2())) {
				return msgL;
			}
			for (PurcFrcst_Chk01_DtlR r: up2()) {
				if (!isNull(r.trd_unit_pf_qty())) {
					msgL.addAll(checkDecPlace(r, PurcFrcst_Chk01_DtlR.$trd_unit_dec_place, PurcFrcst_Chk01_DtlR.$trd_unit_pf_qty));
					r.base_unit_pf_qty(convToBaseUnit(r.trd_unit_pf_qty(),
							r.trd_unit_conv_base_qty(),
							r.trd_unit_conv_qty(),
							r.base_unit_dec_place(),
							r.base_unit_rnd_typ()));
				}
				if (!isNull(r.trd_unit_prms_qty())) {
					msgL.addAll(checkDecPlace(r, PurcFrcst_Chk01_DtlR.$trd_unit_dec_place, PurcFrcst_Chk01_DtlR.$trd_unit_prms_qty));
					r.base_unit_prms_qty(convToBaseUnit(r.trd_unit_prms_qty(),
							r.trd_unit_conv_base_qty(),
							r.trd_unit_conv_qty(),
							r.base_unit_dec_place(),
							r.base_unit_rnd_typ()));
				}
			}
			return msgL;
		}

		/**
		 * 確定期間チェック
		 */
		protected MCMessageList chkFixPeriod() {
			MCMessageList msgL = new MCMessageList();
			if (isNull(up2())) {
				return msgL;
			}
			MCIndexKey fixIdx = up1().createIndex(PurcFrcst_Chk01_FixR.$purc_frcst_fix_no);
			for (MCList<PurcFrcst_Chk01_DtlR> subL: up2().groupList(MST_PURC_FRCST_FIX_R.$purc_frcst_fix_no)) {
				subL.sort(PurcFrcst_Chk01_DtlR.$pf_period_typ, PurcFrcst_Chk01_DtlR.$pf_period_st_dt);
				PurcFrcst_Chk01_DtlR r0 = subL.get(0);
				PurcFrcst_Chk01_FixR fixR = up1().getFirst(fixIdx, r0.purc_frcst_fix_no());
				if (isNull(fixR)) {
					// 上り電文の不整合によるエラー、基本的に発生しないと想定する。
					subL.setBoolean(PurcFrcst_Chk01_DtlR.$err_flg, true);
					msgL.add(new MCMessage(MSBDL0064, r0.purc_frcst_no()));
					continue;
				}
				MCList<PurcFrcst_Chk01_DtlR> fixOffL = MCList.create(PurcFrcst_Chk01_DtlR.class);
				for (PurcFrcst_Chk01_DtlR r: subL) {
					if (isSame(r0.pf_period_typ(), r.pf_period_typ())) {
						if (!r.fix_period_flg()) {
							fixOffL.add(r);
						}
						if (r.fix_period_flg()) {
							for (PurcFrcst_Chk01_DtlR fixOffR: fixOffL) {
								fixOffR.err_flg(true);
								msgL.add(new MCMessage(fixOffR, null, MSBDL0062,
										toYMDString(fixR.pf_dt()),
										fixR.sppl_cd(),
										fixR.wg_cd(),
										toDispItm(fixR.itm_cd(), fixR.itm_sub1(), fixR.itm_sub2(), fixR.itm_sub3()),
										toYMDString(fixOffR.pf_period_st_dt()),
										toYMDString(fixOffR.pf_period_end_dt()),
										toDispGUIIndex(fixOffR)));
							}
							fixOffL.clear();
						}
					}
					else {
						if (r.fix_period_flg()) {
							r.err_flg(true);
							msgL.add(new MCMessage(r, null, MSBDL0063,
									toYMDString(fixR.pf_dt()),
									fixR.sppl_cd(),
									fixR.wg_cd(),
									toDispItm(fixR.itm_cd(), fixR.itm_sub1(), fixR.itm_sub2(), fixR.itm_sub3()),
									toYMDString(r.pf_period_st_dt()),
									toYMDString(r.pf_period_end_dt()),
									toDispGUIIndex(r)));
							break;
						}
					}
				}
			}
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}

		/**
		 * ヘッダ検索
		 */
		protected MCList<MST_PURC_FRCST_H_R> srchHdr() {
			MCList<MST_PURC_FRCST_H_R> dbcL = MCList.create(MST_PURC_FRCST_H_R.class);
			MST_PURC_FRCST_H_R t = MST_PURC_FRCST_H_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.purc_frcst_no);
			dbcL_bldr.addSelect(t.upd_cntr);
			dbSelectKey("MSBDL5280_MST_PURC_FRCST_H_S01", dbcL, dbcL_bldr, up0());
			return dbcL;
		}

		/**
		 * 確定検索
		 */
		protected MCList<MST_PURC_FRCST_FIX_R> srchFix() {
			MCList<MST_PURC_FRCST_FIX_R> dbcL = MCList.create(MST_PURC_FRCST_FIX_R.class);
			MST_PURC_FRCST_FIX_R t = MST_PURC_FRCST_FIX_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.purc_frcst_fix_no);
			dbcL_bldr.addSelect(t.upd_cntr);
			dbSelectKey("MSBDL5280_MST_PURC_FRCST_FIX_S02", dbcL, dbcL_bldr, up1());
			return dbcL;
		}
	}

	/**
	 * PurcFrcst_Chk02オペレーション.<p>
	 *
	 * 取消前チェック<br>
	 */
	public class PurcFrcst_Chk02 extends MSBDL_PurcFrcstService_MC_A.PurcFrcst_Chk02 {
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
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (!hasErrFlgOn(up0())) {
				 msgL.addAll(checkHdrUpdCntr());
			}
			return msgL;
		}

		/**
		 * 更新カウンタチェック
		 */
		protected MCMessageList checkHdrUpdCntr() {
			MCMessageList msgL = new MCMessageList();
			if (isNull(up0())) {
				return msgL;
			}
			MCIndexKey idxKey = up0().createIndex(PurcFrcst_Chk01_HdrR.$purc_frcst_no);
			MCList<MST_PURC_FRCST_H_R> dbcL = srchHdr();
			for (MST_PURC_FRCST_H_R dbcR: dbcL) {
				PurcFrcst_Chk02_HdrR upR = up0().getFirst(idxKey, dbcR.purc_frcst_no());
				if (!isNull(upR)) {
					msgL.addAll(checkUpdCntrNE(upR, PurcFrcst_Chk01_HdrR.$upd_cntr, dbcR));
				}
			}
			return msgL;
		}

		/**
		 * 更新対象検索（ヘッダ）
		 */
		protected MCList<MST_PURC_FRCST_H_R> srchHdr() {
			MCList<MST_PURC_FRCST_H_R> dbcL = MCList.create(MST_PURC_FRCST_H_R.class);
			MST_PURC_FRCST_H_R t = MST_PURC_FRCST_H_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.purc_frcst_no);
			dbcL_bldr.addSelect(t.upd_cntr);
			dbcL_bldr.setWhere(t.purc_frcst_no.eq(bind("purc_frcst_no")));
			dbSelect("MSBDL5280_MST_PURC_FRCST_H_S02", dbcL, dbcL_bldr, up0());
			return dbcL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * PurcFrcst_Chk03オペレーション.<p>
	 *
	 * 取消中止前チェック<br>
	 */
	public class PurcFrcst_Chk03 extends MSBDL_PurcFrcstService_MC_A.PurcFrcst_Chk03 {
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
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (!hasErrFlgOn(up0())) {
				msgL.addAll(checkHdrUpdCntr());
			}
			return msgL;
		}

		/**
		 * 更新カウンタチェック
		 */
		protected MCMessageList checkHdrUpdCntr() {
			MCMessageList msgL = new MCMessageList();
			if (isNull(up0())) {
				return msgL;
			}
			MCIndexKey idxKey = up0().createIndex(PurcFrcst_Chk01_HdrR.$purc_frcst_no);
			MCList<MST_PURC_FRCST_H_R> dbcL = srchHdr();
			for (MST_PURC_FRCST_H_R dbcR: dbcL) {
				PurcFrcst_Chk03_HdrR upR = up0().getFirst(idxKey, dbcR.purc_frcst_no());
				if (!isNull(upR)) {
					msgL.addAll(checkUpdCntrNE(upR, PurcFrcst_Chk01_HdrR.$upd_cntr, dbcR));
				}
				if (dbcR.del_flg() && dbcR.pf_rpt_flg() && !dbcR.del_pf_rpt_flg()) {
					msgL.add(new MCMessage(upR, null, MSBDL0078, upR.pf_rpt_no(), toDispGUIIndex(upR)));
				}
			}
			return msgL;
		}

		/**
		 * 更新対象検索（ヘッダ）
		 */
		protected MCList<MST_PURC_FRCST_H_R> srchHdr() {
			MCList<MST_PURC_FRCST_H_R> dbcL = MCList.create(MST_PURC_FRCST_H_R.class);
			MST_PURC_FRCST_H_R t = MST_PURC_FRCST_H_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.purc_frcst_no);
			dbcL_bldr.addSelect(t.pf_rpt_flg);
			dbcL_bldr.addSelect(t.del_pf_rpt_flg);
			dbcL_bldr.addSelect(t.del_flg);
			dbcL_bldr.addSelect(t.upd_cntr);
			dbcL_bldr.setWhere(t.purc_frcst_no.eq(bind("purc_frcst_no")));
			dbSelect("MSBDL5280_MST_PURC_FRCST_H_S03", dbcL, dbcL_bldr, up0());
			return dbcL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * PurcFrcst_Upd01オペレーション.<p>
	 *
	 * 購買内示情報を更新する<br>
	 */
	public class PurcFrcst_Upd01 extends MSBDL_PurcFrcstService_MC_A.PurcFrcst_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			srchHdrSts();
			updPfHdr();
			updPfFix();
			updPfDtl();
		}

		MCList<MST_PURC_FRCST_H_R> _dbcHdrL;
		MCIndexKey _hdrIdxKey;

		/**
		 * ヘッダ検索
		 */
		protected void srchHdrSts() {
			MCList<MST_PURC_FRCST_H_R> updL = MCList.create(MST_PURC_FRCST_H_R.class);
			for (PurcFrcst_Chk01_HdrR r : up0()) {
				MST_PURC_FRCST_H_R hdr = MST_PURC_FRCST_H_R.create();
				hdr.purc_frcst_no(r.purc_frcst_no());
				updL.add(hdr);
			}
			for (PurcFrcst_Chk01_FixR r : up1().groupBy(PurcFrcst_Chk01_FixR.$purc_frcst_no)) {
				MST_PURC_FRCST_H_R hdr = MST_PURC_FRCST_H_R.create();
				hdr.purc_frcst_no(r.purc_frcst_no());
				updL.add(hdr);
			}
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(MST_PURC_FRCST_H_R.create("T"));
			dbWkDelete("MSBDL5280_MSW_PURC_FRCST_H_D01", updL_bldr.getBaseDbc());
			dbWkInsert("MSBDL5280_MSW_PURC_FRCST_H_I01", updL, updL_bldr.getBaseDbc());
			
			_dbcHdrL = MCList.create(MST_PURC_FRCST_H_R.class);
			MST_PURC_FRCST_H_R dbcHdrL_t = MST_PURC_FRCST_H_R.create("T");
			MCQueryApiBuilder dbcHdrL_bldr = MCQueryApiBuilder.create(dbcHdrL_t);
			
			MSW_PURC_FRCST_H_KEY_R wk = MSW_PURC_FRCST_H_KEY_R.create("WK");
			dbcHdrL_bldr.setSelect(dbcHdrL_t.purc_frcst_no);
			dbcHdrL_bldr.addSelect(dbcHdrL_t.pf_rpt_flg);
			dbcHdrL_bldr.addSelect(dbcHdrL_t.del_flg);
			dbcHdrL_bldr.addInnerJoin(wk, bracket(wk.purc_frcst_no.eq(dbcHdrL_t.purc_frcst_no)));
			dbSelect("MSBDL5280_MST_PURC_FRCST_H_S04", _dbcHdrL, dbcHdrL_bldr);
			_hdrIdxKey = _dbcHdrL.createIndex(MST_PURC_FRCST_H_R.$purc_frcst_no);
		}

		/**
		 * ヘッダ更新
		 */
		protected void updPfHdr() {
			if (isNull(up0())) {
				return;
			}
			MCList<MST_PURC_FRCST_H_R> updL = MCList.create(MST_PURC_FRCST_H_R.class);
			addAll(updL, up0(), createMap_MST_PURC_FRCST_H_R_PurcFrcst_Chk01_HdrR());
			MCList<MST_PURC_FRCST_H_R> updL1 = MCList.create(MST_PURC_FRCST_H_R.class);
			MCList<MST_PURC_FRCST_H_R> updL2 = MCList.create(MST_PURC_FRCST_H_R.class);
			for (MST_PURC_FRCST_H_R r: updL) {
				MST_PURC_FRCST_H_R dbcR = _dbcHdrL.getFirst(_hdrIdxKey, r.purc_frcst_no());
				if (!dbcR.pf_rpt_flg()) {
					updL1.add(r);
				}
				else {
					updL2.add(r);
				}
			}
			MST_PURC_FRCST_H_R t = MST_PURC_FRCST_H_R.create("T");
			if (!isNull(updL1)) {
				MCQueryApiBuilder updL1_bldr = MCQueryApiBuilder.create(t);
				updL1_bldr.setSet(t.pf_usr_cd);
				updL1_bldr.addSet(t.pf_dpt_cd);
				updL1_bldr.addSet(t.rpt_rmrks);
				updL1_bldr.addSet(t.intr_rmrks);
				updL1_bldr.addSet(t.sub_char1);
				updL1_bldr.addSet(t.sub_char2);
				updL1_bldr.addSet(t.sub_char3);
				dbUpdateKey("MSBDL5280_MST_PURC_FRCST_H_U01", updL1, updL1_bldr);
			}
			if (!isNull(updL2)) {
				MCQueryApiBuilder updL2_bldr = MCQueryApiBuilder.create(t);
				updL2_bldr.setSet(t.intr_rmrks);
				updL2_bldr.addSet(t.sub_char1);
				updL2_bldr.addSet(t.sub_char2);
				updL2_bldr.addSet(t.sub_char3);
				dbUpdateKey("MSBDL5280_MST_PURC_FRCST_H_U02", updL2, updL2_bldr);
			}
		}

		/**
		 * 確定トラン更新
		 */
		protected void updPfFix() {
			if (isNull(up1())) {
				return;
			}
			MCList<MST_PURC_FRCST_FIX_R> updL = MCList.create(MST_PURC_FRCST_FIX_R.class);
			addAll(updL, up1(), createMap_MST_PURC_FRCST_FIX_R_PurcFrcst_Chk01_FixR());
			MCList<MST_PURC_FRCST_FIX_R> updL1 = MCList.create(MST_PURC_FRCST_FIX_R.class);
			MCList<MST_PURC_FRCST_FIX_R> updL2 = MCList.create(MST_PURC_FRCST_FIX_R.class);
			for (MST_PURC_FRCST_FIX_R r: updL) {
				MST_PURC_FRCST_H_R dbcR = _dbcHdrL.getFirst(_hdrIdxKey, r.purc_frcst_no());
				if (!dbcR.pf_rpt_flg()) {
					updL1.add(r);
				}
				else {
					updL2.add(r);
				}
			}
			MST_PURC_FRCST_FIX_R t = MST_PURC_FRCST_FIX_R.create("T");
			if (!isNull(updL1)) {
				MCQueryApiBuilder updL1_bldr = MCQueryApiBuilder.create(t);
				updL1_bldr.setSet(t.fix_flg);
				updL1_bldr.addSet(t.rpt_rmrks);
				updL1_bldr.addSet(t.intr_rmrks);
				updL1_bldr.addSet(t.sub_char1);
				updL1_bldr.addSet(t.sub_char2);
				updL1_bldr.addSet(t.sub_char3);
				dbUpdateKey("MSBDL5280_MST_PURC_FRCST_FIX_U01", updL1, updL1_bldr);
			}
			if (!isNull(updL2)) {
				MCQueryApiBuilder updL2_bldr = MCQueryApiBuilder.create(t);
				updL2_bldr.setSet(t.intr_rmrks);
				updL2_bldr.addSet(t.sub_char1);
				updL2_bldr.addSet(t.sub_char2);
				updL2_bldr.addSet(t.sub_char3);
				dbUpdateKey("MSBDL5280_MST_PURC_FRCST_FIX_U02", updL2, updL2_bldr);
			}
		}

		/**
		 * 明細トラン更新
		 */
		protected void updPfDtl() {
			if (isNull(up2())) {
				return;
			}
			MCList<MST_PURC_FRCST_D_R> updL = MCList.create(MST_PURC_FRCST_D_R.class);
			addAll(updL, up2(), createMap_MST_PURC_FRCST_D_R_PurcFrcst_Chk01_DtlR());
			MCList<MST_PURC_FRCST_D_R> updL1 = MCList.create(MST_PURC_FRCST_D_R.class);
			MCList<MST_PURC_FRCST_D_R> updL2 = MCList.create(MST_PURC_FRCST_D_R.class);
			MCList<MST_PURC_FRCST_D_R> updL3 = MCList.create(MST_PURC_FRCST_D_R.class);
			for (MCList<MST_PURC_FRCST_D_R> l: updL.groupList(MST_PURC_FRCST_D_R.$purc_frcst_no)) {
				MST_PURC_FRCST_H_R dbcR = _dbcHdrL.getFirst(_hdrIdxKey, l.get(0).purc_frcst_no());
				if (!dbcR.pf_rpt_flg()) {
					if (!dbcR.del_flg()) {
						updL1.addAll(l);
					}
					else {
						updL2.addAll(l);;
					}
				}
				else {
					if (!dbcR.del_flg()) {
						updL3.addAll(l);;
					}
				}
			}
			MST_PURC_FRCST_D_R t = MST_PURC_FRCST_D_R.create("T");
			if (!isNull(updL1)) {
				MCQueryApiBuilder updL1_bldr = MCQueryApiBuilder.create(t);
				updL1_bldr.setSet(t.fix_period_flg);
				updL1_bldr.addSet(t.trd_unit_pf_qty);
				updL1_bldr.addSet(t.base_unit_pf_qty);
				updL1_bldr.addSet(t.trd_unit_prms_qty);
				updL1_bldr.addSet(t.base_unit_prms_qty);
				dbUpdateKey("MSBDL5280_MST_PURC_FRCST_D_U01", updL1, updL1_bldr);
			}
			if (!isNull(updL2)) {
				MCQueryApiBuilder updL2_bldr = MCQueryApiBuilder.create(t);
				updL2_bldr.setSet(t.trd_unit_pf_qty);
				updL2_bldr.addSet(t.base_unit_pf_qty);
				updL2_bldr.addSet(t.trd_unit_prms_qty);
				updL2_bldr.addSet(t.base_unit_prms_qty);
				dbUpdateKey("MSBDL5280_MST_PURC_FRCST_D_U02", updL2, updL2_bldr);
			}
			if (!isNull(updL3)) {
				MCQueryApiBuilder updL3_bldr = MCQueryApiBuilder.create(t);
				updL3_bldr.setSet(t.trd_unit_prms_qty);
				updL3_bldr.addSet(t.base_unit_prms_qty);
				dbUpdateKey("MSBDL5280_MST_PURC_FRCST_D_U03", updL3, updL3_bldr);
			}
		}

		protected Map_MST_PURC_FRCST_H_R_PurcFrcst_Chk01_HdrR<MST_PURC_FRCST_H_R,PurcFrcst_Chk01_HdrR> createMap_MST_PURC_FRCST_H_R_PurcFrcst_Chk01_HdrR() {
			return new Map_MST_PURC_FRCST_H_R_PurcFrcst_Chk01_HdrR<MST_PURC_FRCST_H_R, PurcFrcst_Chk01_HdrR>();
		}
		public class Map_MST_PURC_FRCST_H_R_PurcFrcst_Chk01_HdrR<D extends MST_PURC_FRCST_H_R, S extends PurcFrcst_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PURC_FRCST_H_R.$purc_frcst_no, PurcFrcst_Chk01_HdrR.$purc_frcst_no);
				addColumnPathMap(MST_PURC_FRCST_H_R.$pf_usr_cd, PurcFrcst_Chk01_HdrR.$pf_usr_cd);
				addColumnPathMap(MST_PURC_FRCST_H_R.$pf_dpt_cd, PurcFrcst_Chk01_HdrR.$pf_dpt_cd);
				addColumnPathMap(MST_PURC_FRCST_H_R.$rpt_rmrks, PurcFrcst_Chk01_HdrR.$rpt_rmrks);
				addColumnPathMap(MST_PURC_FRCST_H_R.$intr_rmrks, PurcFrcst_Chk01_HdrR.$intr_rmrks);
				addColumnPathMap(MST_PURC_FRCST_H_R.$sub_char1, PurcFrcst_Chk01_HdrR.$sub_char1);
				addColumnPathMap(MST_PURC_FRCST_H_R.$sub_char2, PurcFrcst_Chk01_HdrR.$sub_char2);
				addColumnPathMap(MST_PURC_FRCST_H_R.$sub_char3, PurcFrcst_Chk01_HdrR.$sub_char3);
			}
		}

		protected Map_MST_PURC_FRCST_FIX_R_PurcFrcst_Chk01_FixR<MST_PURC_FRCST_FIX_R,PurcFrcst_Chk01_FixR> createMap_MST_PURC_FRCST_FIX_R_PurcFrcst_Chk01_FixR() {
			return new Map_MST_PURC_FRCST_FIX_R_PurcFrcst_Chk01_FixR<MST_PURC_FRCST_FIX_R, PurcFrcst_Chk01_FixR>();
		}
		public class Map_MST_PURC_FRCST_FIX_R_PurcFrcst_Chk01_FixR<D extends MST_PURC_FRCST_FIX_R, S extends PurcFrcst_Chk01_FixR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PURC_FRCST_FIX_R.$purc_frcst_fix_no, PurcFrcst_Chk01_FixR.$purc_frcst_fix_no);
				addColumnPathMap(MST_PURC_FRCST_FIX_R.$purc_frcst_no, PurcFrcst_Chk01_FixR.$purc_frcst_no);
				addColumnPathMap(MST_PURC_FRCST_FIX_R.$fix_flg, PurcFrcst_Chk01_FixR.$fix_flg);
				addColumnPathMap(MST_PURC_FRCST_FIX_R.$rpt_rmrks, PurcFrcst_Chk01_FixR.$rpt_rmrks);
				addColumnPathMap(MST_PURC_FRCST_FIX_R.$intr_rmrks, PurcFrcst_Chk01_FixR.$intr_rmrks);
				addColumnPathMap(MST_PURC_FRCST_FIX_R.$sub_char1, PurcFrcst_Chk01_FixR.$sub_char1);
				addColumnPathMap(MST_PURC_FRCST_FIX_R.$sub_char2, PurcFrcst_Chk01_FixR.$sub_char2);
				addColumnPathMap(MST_PURC_FRCST_FIX_R.$sub_char3, PurcFrcst_Chk01_FixR.$sub_char3);
			}
		}

		protected Map_MST_PURC_FRCST_D_R_PurcFrcst_Chk01_DtlR<MST_PURC_FRCST_D_R,PurcFrcst_Chk01_DtlR> createMap_MST_PURC_FRCST_D_R_PurcFrcst_Chk01_DtlR() {
			return new Map_MST_PURC_FRCST_D_R_PurcFrcst_Chk01_DtlR<MST_PURC_FRCST_D_R, PurcFrcst_Chk01_DtlR>();
		}
		public class Map_MST_PURC_FRCST_D_R_PurcFrcst_Chk01_DtlR<D extends MST_PURC_FRCST_D_R, S extends PurcFrcst_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PURC_FRCST_D_R.$purc_frcst_d_no, PurcFrcst_Chk01_DtlR.$purc_frcst_d_no);
				addColumnPathMap(MST_PURC_FRCST_D_R.$purc_frcst_no, PurcFrcst_Chk01_DtlR.$purc_frcst_no);
				addColumnPathMap(MST_PURC_FRCST_D_R.$fix_period_flg, PurcFrcst_Chk01_DtlR.$fix_period_flg);
				addColumnPathMap(MST_PURC_FRCST_D_R.$trd_unit_pf_qty, PurcFrcst_Chk01_DtlR.$trd_unit_pf_qty);
				addColumnPathMap(MST_PURC_FRCST_D_R.$base_unit_pf_qty, PurcFrcst_Chk01_DtlR.$base_unit_pf_qty);
				addColumnPathMap(MST_PURC_FRCST_D_R.$trd_unit_prms_qty, PurcFrcst_Chk01_DtlR.$trd_unit_prms_qty);
				addColumnPathMap(MST_PURC_FRCST_D_R.$base_unit_prms_qty, PurcFrcst_Chk01_DtlR.$base_unit_prms_qty);
			}
		}
	}

	/**
	 * PurcFrcst_Del01オペレーション.<p>
	 *
	 * 購買内示情報を取消する。<br>
	 */
	public class PurcFrcst_Del01 extends MSBDL_PurcFrcstService_MC_A.PurcFrcst_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			delPfHdr();
		}

		/**
		 * 取消処理
		 */
		protected void delPfHdr() {
			MCList<MST_PURC_FRCST_H_R> hdrL = MCList.create(MST_PURC_FRCST_H_R.class);
			for (PurcFrcst_Chk02_HdrR r : up0()) {
				MST_PURC_FRCST_H_R hdrR = MST_PURC_FRCST_H_R.create();
				hdrR.purc_frcst_no(r.purc_frcst_no());
				hdrL.add(hdrR);
			}
			MST_PURC_FRCST_H_R t = MST_PURC_FRCST_H_R.create("T");
			MCQueryApiBuilder hdrL_bldr = MCQueryApiBuilder.create(t);
			hdrL_bldr.setSetVL(t.del_flg, value(true));
			dbUpdateKey("MSBDL5280_MST_PURC_FRCST_H_U03", hdrL, hdrL_bldr);
		}
	}

	/**
	 * PurcFrcst_Del02オペレーション.<p>
	 *
	 * 購買内示情報を有効に更新する。<br>
	 */
	public class PurcFrcst_Del02 extends MSBDL_PurcFrcstService_MC_A.PurcFrcst_Del02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			updPfHdr();
		}
		/**
		 * 取消処理
		 */
		protected void updPfHdr() {
			MCList<MST_PURC_FRCST_H_R> hdrL = MCList.create(MST_PURC_FRCST_H_R.class);
			
			for(PurcFrcst_Chk03_HdrR r : up0()){
				MST_PURC_FRCST_H_R hdrR = MST_PURC_FRCST_H_R.create();
				hdrR.purc_frcst_no(r.purc_frcst_no());
				hdrL.add(hdrR);
			}
			if (!isNull(hdrL)) {
				MST_PURC_FRCST_H_R t = MST_PURC_FRCST_H_R.create("T");
				MCQueryApiBuilder hdrL_bldr = MCQueryApiBuilder.create(t);
				hdrL_bldr.setSetVL(t.del_flg, value(false));
				hdrL_bldr.addSetVL(t.del_pf_rpt_flg, value(false));
				hdrL_bldr.addSetVL(t.pf_rpt_flg, value(false));
				hdrL_bldr.addSetVL(t.pf_rpt_no, nullValue());
				hdrL_bldr.addSetVL(t.pf_rpt_id, nullValue());
				hdrL_bldr.addSetVL(t.pf_rpt_dt, nullValue());
				hdrL_bldr.addSetVL(t.del_pf_rpt_id, nullValue());
				hdrL_bldr.addSetVL(t.del_pf_rpt_dt, nullValue());
				dbUpdateKey("MSBDL5280_MST_PURC_FRCST_H_U04", hdrL, hdrL_bldr);
			}
			
		}
	}

	/**
	 * PurcFrcst_Prnt01オペレーション.<p>
	 *
	 * 内示書、取消内示書を発行する。<br>
	 */
	public class PurcFrcst_Prnt01 extends MSBDL_PurcFrcstService_MC_A.PurcFrcst_Prnt01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			srch();
			prnt();
			updPfHdr();
			setDown();
		}

		//注文書の発行リスト
		protected Map<List<String>, List<MSBDR_PfRpt>> _pfPrntMap = new LinkedHashMap<List<String>, List<MSBDR_PfRpt>>();
		//内示書の再発行リスト
		protected Map<String, MCReportInfoR> _pfReprntMap = new LinkedHashMap<String, MCReportInfoR>();
		/**　内示書発行分ヘッダ */
		protected MCList<MST_PURC_FRCST_H_R> _updHdrL1 = MCList.create(MST_PURC_FRCST_H_R.class);
		protected MST_PURC_FRCST_H_R _updHdrL1_t = MST_PURC_FRCST_H_R.create("T");
		protected MCQueryApiBuilder _updHdrL1_bldr = MCQueryApiBuilder.create(_updHdrL1_t);
		/**　取消内示書発行分ヘッダ */
		protected MCList<MST_PURC_FRCST_H_R> _updHdrL2 = MCList.create(MST_PURC_FRCST_H_R.class);
		protected MST_PURC_FRCST_H_R _updHdrL2_t = MST_PURC_FRCST_H_R.create("T");
		protected MCQueryApiBuilder _updHdrL2_bldr = MCQueryApiBuilder.create(_updHdrL2_t);
		
		protected MCDate _prntHm = MCDate.now();
		
		protected MCList<BpUtil_Sprt01_DtlR> _bpUtil = MCList.create(BpUtil_Sprt01_DtlR.class);
		protected MCIndexKey _bpUtilkey;
		
		/**
		 * 帳票データ検索
		 */
		protected void srch() {
			MCList<MST_PURC_FRCST_H_R> tgtHdrL = srchHdr();
			MCIndexKey tgtHdrIdxKey = tgtHdrL.createIndex(MST_PURC_FRCST_H_R.$purc_frcst_no);
			MCIndexKey up0Key = up0().createIndex(PurcFrcst_Prnt01_HdrR.$purc_frcst_no);
			for (PurcFrcst_Prnt01_HdrR upR: up0()) {
				MCReportSet reportSet = MSBDR_PfRpt.create();
				MST_PURC_FRCST_H_R tgtHdr = tgtHdrL.getFirst(tgtHdrIdxKey, upR.purc_frcst_no());
				if (!tgtHdr.del_flg()) {
					// 内示書再発行
					if (tgtHdr.pf_rpt_flg()) {
						setPfBizInfo(reportSet, tgtHdr);
						upR.pf_rpt_no(tgtHdr.pf_rpt_no());
						MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(reportSet, false);
						setReRptMap(tgtHdr, infoL);
						continue;
					}
					// 内示書新規発行
					else {
						tgtHdr.pf_rpt_dt(_prntHm);
						tgtHdr.pf_rpt_flg(true);
						_updHdrL1.add(tgtHdr);
						continue;
					}
				}
				else {
					// 取消内示書再発行
					if (tgtHdr.del_pf_rpt_flg()) {
						setDelPfBizInfo(reportSet, tgtHdr);
						MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(reportSet, false);
						upR.pf_rpt_no(tgtHdr.pf_rpt_no());
						setReRptMap(tgtHdr, infoL);
						continue;
					}
					// 取消内示書新規発行
					// （内示書未発行の場合を除く）
					else if(tgtHdr.pf_rpt_flg()){
						tgtHdr.del_pf_rpt_dt(_prntHm);
						tgtHdr.del_pf_rpt_flg(true);
						_updHdrL2.add(tgtHdr);
						continue;
					}
				}
			}

			MCMessageList msgL = new MCMessageList();
			if (!isNull(_updHdrL1)) {
				// 内示書新規発行
				doSeqCache(MSC_NUM_SYS_TYP.PFRPTID, _updHdrL1.size());
				sortHdr(_updHdrL1);
				dbWkDelete("MSBDL5280_MSW_PURC_FRCST_H_D02", _updHdrL1_bldr.getBaseDbc());
				dbWkInsert("MSBDL5280_MSW_PURC_FRCST_H_I02", _updHdrL1, _updHdrL1_bldr.getBaseDbc());
				MCList<PfRptHdrR> rptHdrL = srchRptHdr();
				MCIndexKey rptHdrIdxKey = rptHdrL.createIndex(MST_PURC_FRCST_H_R.$purc_frcst_no);
				MCList<PfRptDtlR> rptDtlL = srchRptDtl();
				MCIndexKey rptDtlIdxKey = rptDtlL.createIndex(MST_PURC_FRCST_H_R.$purc_frcst_no);

				for (MST_PURC_FRCST_H_R tgtHdr : _updHdrL1) {

					tgtHdr.pf_rpt_no(getPfRptNo(tgtHdr));
					tgtHdr.pf_rpt_id(getStrSeq(MSC_NUM_SYS_TYP.PFRPTID));

					PfRptHdrR rptHdr = rptHdrL.getFirst(rptHdrIdxKey, tgtHdr.purc_frcst_no());
					rptHdr.rpt_sts_typ(MAC_RPT_STS_TYP.CRT.value());
					rptHdr.rpt_sts_typ_nm(MAC_RPT_STS_TYP.CRT.name(MCSys.user.locale()));
					rptHdr.print_hm(_prntHm);
					rptHdr.pf_rpt_no(tgtHdr.pf_rpt_no());

					MCList<PfRptDtlR> rptDtl = rptDtlL.subList(rptDtlIdxKey, tgtHdr.purc_frcst_no());
					if (isNull(rptDtl) || rptDtl.isEmpty()) {
						PurcFrcst_Prnt01_HdrR up0R = up0().getFirst(up0Key, tgtHdr.purc_frcst_no());
						msgL.add(new MCMessage(up0R, null, MSBDL0075, toYMDString(tgtHdr.pf_dt()), tgtHdr.sppl_cd(), tgtHdr.wg_cd(), toDispGUIIndex(up0R)));
					}
					sortDtl(rptDtl);
					MCReportSet reportSet = MSBDR_PfRpt.create();
					setData(reportSet, tgtHdr, rptHdr, rptDtl);
					MCServerReportManager.request(reportSet, false);
					setNewRptMap(tgtHdr, reportSet);
				}

			}

			if(!msgL.isEmpty()){
				MCMessagePool.addAll(msgL);
				throw new MCAppException(MSBDL0156);
			}
					
			if (!isNull(_updHdrL2)) {
				// 取消内示書新規発行
				doSeqCache(MSC_NUM_SYS_TYP.PFRPTID, _updHdrL2.size());
				sortHdr(_updHdrL2);
				for (MST_PURC_FRCST_H_R tgtHdr : _updHdrL2) {
					MCReportSet reportSet = MSBDR_PfRpt.create();
					setPfBizInfo(reportSet, tgtHdr);
					MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(reportSet, false);
					if (infoL == null || infoL.isEmpty()) {
						continue;
					}
					tgtHdr.del_pf_rpt_id(getStrSeq(MSC_NUM_SYS_TYP.PFRPTID));
					setNewRptMap(tgtHdr, getCanPf(infoL.get(0), tgtHdr));
				}
			}
		}

		protected MSBDR_PfRpt getCanPf(MCReportInfoR infoR, MST_PURC_FRCST_H_R pfHdr) {
			MSBDR_PfRpt repSet = (MSBDR_PfRpt) MCServerReportManager.toReportSet(infoR);
			String bt = repSet.getBlockType(PfRptHdrR.create());
			String btd = repSet.getBlockType(PfRptDtlR.create());
			@SuppressWarnings("unchecked")
			MCList<MCRow> hdrL = repSet.getAll(bt);
			@SuppressWarnings("unchecked")
			MCList<MCRow> dtlL = repSet.getAll(btd);
			if (hdrL == null || hdrL.isEmpty()) {
				return null;
			}
			if (dtlL == null || dtlL.isEmpty()) {
				return null;
			}

			PfRptHdrR hdrR = (PfRptHdrR) hdrL.get(0);

			MSBDR_PfRpt newRepSet = MSBDR_PfRpt.create();

			hdrR.print_hm(_prntHm);
			hdrR.rpt_sts_typ(MAC_RPT_STS_TYP.CAN.value());
			MAC_RPT_STS_TYP.putNameNE(hdrR, PfRptHdrR.$rpt_sts_typ, PfRptHdrR.$rpt_sts_typ_nm, repSet.getLocale());
			newRepSet.addRow(hdrR);
			newRepSet.addAll(dtlL);
			newRepSet.setLocale(repSet.getLocale());
			setBizInfo(newRepSet, pfHdr, hdrR);
			MCServerReportManager.request(newRepSet, false);
			return newRepSet;

		}
		
		/**
		 * 帳票出力
		 */
		protected void prnt() {
			prntAll();
		}

		/**
		 * 下り電文をセット
		 */
		protected void setDown() {
			MCList<PurcFrcst_Prnt01_HdrR> downL = MCList.create(PurcFrcst_Prnt01_HdrR.class);
			downL.setAll(up0());
			if (!isNull(_updHdrL1)) {
				MCIndexKey idxKey = _updHdrL1.createIndex(MST_PURC_FRCST_H_R.$purc_frcst_no);
				for (PurcFrcst_Prnt01_HdrR r: downL) {
					MST_PURC_FRCST_H_R hdrR = _updHdrL1.getFirst(idxKey, r.purc_frcst_no());
					if (!isNull(hdrR)) {
						r.pf_rpt_no(hdrR.pf_rpt_no());
					}
				}
			}
			down0().addAll(downL);
		}

		/**
		 * 発行対象の購買内示ヘッダ検索
		 */
		protected MCList<MST_PURC_FRCST_H_R> srchHdr() {
			MCList<MST_PURC_FRCST_H_R> dbcL = MCList.create(MST_PURC_FRCST_H_R.class);
			MST_PURC_FRCST_H_R t = MST_PURC_FRCST_H_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.purc_frcst_no);
			dbcL_bldr.addSelect(t.pf_dt);
			dbcL_bldr.addSelect(t.sppl_cd);
			dbcL_bldr.addSelect(t.wg_cd);
			dbcL_bldr.addSelect(t.pf_usr_cd);
			dbcL_bldr.addSelect(t.pf_dpt_cd);
			dbcL_bldr.addSelect(t.pf_rpt_no);
			dbcL_bldr.addSelect(t.pf_rpt_id);
			dbcL_bldr.addSelect(t.pf_rpt_dt);
			dbcL_bldr.addSelect(t.pf_rpt_flg);
			dbcL_bldr.addSelect(t.del_flg);
			dbcL_bldr.addSelect(t.del_pf_rpt_id);
			dbcL_bldr.addSelect(t.del_pf_rpt_dt);
			dbcL_bldr.addSelect(t.del_pf_rpt_flg);
			dbcL_bldr.setWhere(t.purc_frcst_no.eq(bind("purc_frcst_no")));
			dbSelect("MSBDL5280_MST_PURC_FRCST_H_S05", dbcL, dbcL_bldr, up0());
			return dbcL;
		}

		/**
		 * ヘッダ印字項目検索
		 */
		protected MCList<PfRptHdrR> srchRptHdr() {
			MCList<PfRptHdrR> rptHdrL = MCList.create(PfRptHdrR.class);
			executeQuery(rptHdrL, MSBDL5280_MST_PURC_FRCST_H_S01());
			rptHdrL.setString(PfRptHdrR.$co_cd, getCo().co_cd());
			rptHdrL.setString(PfRptHdrR.$co_nm, getCo().co_nm());
			
			editRptHdr(rptHdrL);
			return rptHdrL;
		}
		
		protected void editRptHdr(MCList<PfRptHdrR> l) {

			for (PfRptHdrR r : l) {
				r.sppl_addr(concatAddress(r.sppl_addr1(), r.sppl_addr2(), r.sppl_addr3(), r.sppl_addr4()));
				r.dpt_addr(concatAddress(r.dpt_addr1(), r.dpt_addr2(), r.dpt_addr3(), r.dpt_addr4()));
			}
		}

		/**
		 * 明細印字項目検索
		 */
		protected MCList<PfRptDtlR> srchRptDtl() {
			MCList<PfRptDtlR> rptDtlL = MCList.create(PfRptDtlR.class);
			srchPfDtl(rptDtlL);
			srchPrePfDtl(rptDtlL);
			srchPo(rptDtlL);	
			return rptDtlL;
		}

		/**
		 * 今回購買内示明細データ検索
		 */
		protected void srchPfDtl(MCList<PfRptDtlR> rptDtlL) {
			executeQuery(rptDtlL, MSBDL5280_MST_PURC_FRCST_H_S02());
			MAC_PERIOD_TYP.putNameNE(rptDtlL, PfRptDtlR.$pf_period_typ, PfRptDtlR.$pf_period_typ_nm, getUsrLocale());
		}

		/**
		 * 前回購買内示明細データ検索
		 */
		protected void srchPrePfDtl(MCList<PfRptDtlR> rptDtlL) {
			MCList<PfRptDtlR> preDtlL = MCList.create(PfRptDtlR.class);
			executeQuery(preDtlL, MSBDL5280_MST_PURC_FRCST_H_S03());
			if (isNull(preDtlL)) {
				return;
			}
			MAC_PERIOD_TYP.putNameNE(preDtlL, PfRptDtlR.$pf_period_typ, PfRptDtlR.$pf_period_typ_nm, getUsrLocale());
			String[] keys = new String[] {
					MST_PURC_FRCST_D_R.$purc_frcst_no,
					PfRptDtlR.$itm_cd,
					PfRptDtlR.$itm_sub1_data,
					PfRptDtlR.$itm_sub2_data,
					PfRptDtlR.$itm_sub3_data,
					PfRptDtlR.$pf_period_typ,
					PfRptDtlR.$pf_period_st_dt,
					PfRptDtlR.$pf_period_end_dt};
			MCIndexKey idxKey = rptDtlL.createIndex(keys);

			String[] gKeys = new String[] {
					MST_PURC_FRCST_D_R.$purc_frcst_no,
					PfRptDtlR.$itm_cd,
					PfRptDtlR.$itm_sub1_data,
					PfRptDtlR.$itm_sub2_data,
					PfRptDtlR.$itm_sub3_data};
			MCList<PfRptDtlR> subPreL1 = MCList.create(PfRptDtlR.class);
			MCList<PfRptDtlR> subPreL2 = MCList.create(PfRptDtlR.class);
			
			MCIndexKey rptKey = rptDtlL.createIndex(gKeys);
			MCIndexKey preKey = preDtlL.createIndex(gKeys);
			
			for (PfRptDtlR preR: preDtlL.groupBy(gKeys)) {
				MCList<PfRptDtlR> subDtlL = rptDtlL.subList(rptKey, getVals(gKeys, preR));
				MCList<PfRptDtlR> subPreL = preDtlL.subList(preKey, getVals(gKeys, preR));
				String unitCd = null;
				if (!isNull(subDtlL)) {
					unitCd = subDtlL.getString(0, PfRptDtlR.$unit_cd);
				}
				for (MCList<PfRptDtlR> ul: subPreL.groupList(PfRptDtlR.$unit_cd)) {
					String unitCd2 = ul.getString(0, PfRptDtlR.$unit_cd);
					if (!isSame(unitCd2, unitCd)) {
						subPreL2.addAll(ul);
						continue;
					}
					String pfRptDRmrks = null;
					for (PfRptDtlR preDtlR: ul) {
						PfRptDtlR dtlR = rptDtlL.getFirst(idxKey, getVals(keys, preDtlR));
						if (!isNull(dtlR)) {
							dtlR.pre_ym_flg(preDtlR.pre_ym_flg());
							dtlR.pre_qty(preDtlR.pre_qty());
							// 明細備考は最新のみ表示
							pfRptDRmrks = dtlR.pf_rpt_d_rmrks();
						}
						else {
							preDtlR.disp_seq(1);
							subPreL1.add(preDtlR);
						}
					}
					ul.setString("pf_rpt_d_rmrks", pfRptDRmrks);
				}
			}
			rptDtlL.addAll(subPreL1);
			rptDtlL.addAll(subPreL2);
		}

		/**
		 * 発注済データ検索
		 */
		protected void srchPo(MCList<PfRptDtlR> rptDtlL) {
			MCList<MST_PURC_FRCST_H_R> wkL = MCList.create(MST_PURC_FRCST_H_R.class);
			for (PfRptDtlR r: rptDtlL.groupBy(MST_PURC_FRCST_H_R.$purc_frcst_no)) {
				MST_PURC_FRCST_H_R wkR = MST_PURC_FRCST_H_R.create();
				wkR.purc_frcst_no(r.getString(MST_PURC_FRCST_H_R.$purc_frcst_no));
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_PURC_FRCST_H_R.create("T"));
			dbWkDelete("MSBDL5280_MSW_PURC_FRCST_H_D03", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBDL5280_MSW_PURC_FRCST_H_I03", wkL, wkL_bldr.getBaseDbc());
			MCList<PfRptDtlR> poDtlL = MCList.create(PfRptDtlR.class);
			executeQuery(poDtlL, MSBDL5280_MST_PO_S02());
			if (isNull(poDtlL)) {
				return;
			}
			// 品目マスタ
			FXUCL_MCDbcCache<MAM_ITM_R> cacheItm;
			MAM_ITM_R t1 = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbcItmL_bldr = MCQueryApiBuilder.create(t1);
			dbcItmL_bldr.setSelect(t1.itm_cd);
			dbcItmL_bldr.addSelect(t1.itm_sub1);
			dbcItmL_bldr.addSelect(t1.itm_sub2);
			dbcItmL_bldr.addSelect(t1.itm_sub3);
			dbcItmL_bldr.addSelect(t1.unit_cd);
			dbcItmL_bldr.addSelect(t1.dec_place);
			dbcItmL_bldr.addSelect(t1.rnd_typ);
			cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(dbcItmL_bldr, poDtlL,
				new String[] {
					PfRptDtlR.$itm_cd,
					PfRptDtlR.$itm_sub1_data,
					PfRptDtlR.$itm_sub2_data,
					PfRptDtlR.$itm_sub3_data
				});
			// 品目単位マスタ
			FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> cacheItmUnit;
			MAVM_ITM_UNIT_R t2 = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder dbcItemUnitL_bldr = MCQueryApiBuilder.create(t2);
			dbcItemUnitL_bldr.setSelect(t2.itm_cd);
			dbcItemUnitL_bldr.addSelect(t2.itm_sub1);
			dbcItemUnitL_bldr.addSelect(t2.itm_sub2);
			dbcItemUnitL_bldr.addSelect(t2.itm_sub3);
			dbcItemUnitL_bldr.addSelect(t2.unit_cd);
			dbcItemUnitL_bldr.addSelect(t2.conv_base_qty);
			dbcItemUnitL_bldr.addSelect(t2.conv_qty);
			dbcItemUnitL_bldr.addSelect(t2.dec_place);
			dbcItemUnitL_bldr.addSelect(t2.rnd_typ);
			cacheItmUnit = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbcItemUnitL_bldr, rptDtlL,
					new String[] {
							PfRptDtlR.$itm_cd,
							PfRptDtlR.$itm_sub1_data,
							PfRptDtlR.$itm_sub2_data,
							PfRptDtlR.$itm_sub3_data,
							PfRptDtlR.$unit_cd
					});

			String[] keys = new String[] {
					PfRptDtlR.$itm_cd,
					PfRptDtlR.$itm_sub1_data,
					PfRptDtlR.$itm_sub2_data,
					PfRptDtlR.$itm_sub3_data,
					PfRptDtlR.$pf_period_typ,
					PfRptDtlR.$pf_period_st_dt,
					PfRptDtlR.$pf_period_end_dt};
			MCIndexKey idxKey = rptDtlL.createIndex(keys);
			for (PfRptDtlR poDtlR: poDtlL) {
				MCList<PfRptDtlR> subDtlL = rptDtlL.subList(idxKey, getVals(keys, poDtlR));
				for (PfRptDtlR dtlR: subDtlL) {
					if (isSame(poDtlR.unit_cd(), dtlR.unit_cd())) {
						dtlR.po_qty(poDtlR.po_qty());
					}
					else {
						MAM_ITM_R itm = cacheItm.get(poDtlR.itm_cd(), poDtlR.itm_sub1_data(), poDtlR.itm_sub2_data(), poDtlR.itm_sub3_data());
						MAVM_ITM_UNIT_R itmUnit = cacheItmUnit.get(dtlR.itm_cd(), dtlR.itm_sub1_data(), dtlR.itm_sub2_data(), dtlR.itm_sub3_data(), dtlR.unit_cd());
						dtlR.po_qty(convToPurcUnit(poDtlR.po_qty(), dtlR.unit_cd(), itm, itmUnit));
					}
				}
			}
		}

		protected MCNumber convToPurcUnit (MCNumber baseQty, String purcUnitCd, MAM_ITM_R itm, MAVM_ITM_UNIT_R itmUnit) {
			MCNumber rsltQty = baseQty;
			if (isSame(purcUnitCd, itm.unit_cd())) {
				return rsltQty;
			}
			rsltQty = rvrsBaseUnitConv(baseQty,
					itmUnit.conv_base_qty(),
					itmUnit.conv_qty(),
					itmUnit.dec_place(),
					itmUnit.rnd_typ());
			if (isNull(rsltQty)) {
				return MCNumber.ZERO;
			}
			return rsltQty;
		}

		/**
		 * ヘッダソート
		 */
		protected void sortHdr(MCList<MST_PURC_FRCST_H_R> hdrL) {
			hdrL.sort(MST_PURC_FRCST_H_R.$pf_dt,
					MST_PURC_FRCST_H_R.$sppl_cd,
					MST_PURC_FRCST_H_R.$wg_cd,
					MST_PURC_FRCST_H_R.$purc_frcst_no);
		}

		/**
		 * 明細ソート
		 */
		protected void sortDtl(MCList<PfRptDtlR> dtlL) {
			MCSortPolicy sp = new MCSortPolicy();
			sp.add(SortType.ASC, PfRptDtlR.$itm_cd);
			sp.add(SortType.ASC, PfRptDtlR.$itm_sub1_data);
			sp.add(SortType.ASC, PfRptDtlR.$itm_sub2_data);
			sp.add(SortType.ASC, PfRptDtlR.$itm_sub3_data);
			sp.add(SortType.ASC, PfRptDtlR.$disp_seq);
			sp.add(SortType.ASC, PfRptDtlR.$pf_period_end_dt);
			sp.add(SortType.ASC, PfRptDtlR.$pf_period_typ);
			dtlL.sort(sp);
			for (int i = 0; i < dtlL.size(); i ++) {
				dtlL.get(i).disp_seq(i);
			}
		}

		/**
		 * MCReportSetのListをもとに帳票を発行する。
		 */
		protected <E extends MCReportSet> void prntAll() {
			if (_pfPrntMap == null) {
				return;
			}
			int cnt = _pfPrntMap.size();
			if (cnt == 0) {
				return;
			}

			// 画面の個別発行フラグがオフの場合、個別発行フラグ取得
			if (!up1().indiv_prnt_flg()) {
				getIndivPrnt();
			}
			
			// 発注先ごとにMapを作成
			Map<String, List<MSBDR_PfRpt>> lclMap = new LinkedHashMap<String, List<MSBDR_PfRpt>>();
			for (Map.Entry<List<String>, List<MSBDR_PfRpt>> en : _pfPrntMap.entrySet()) {
				boolean isInit = false;
				List<MSBDR_PfRpt> lst = null;
				for (MSBDR_PfRpt pf : en.getValue()) {
					if (!isInit) {
						lst = lclMap.get(pf.getAppToCd1());
						if (lst == null) {
							lst = new ArrayList<MSBDR_PfRpt>();
							lclMap.put(pf.getAppToCd1(), lst);
						}
						isInit = true;
					}
					lst.add(pf);
				}
			}
			
			// ソート処理
			lclMap = pfMapSort(lclMap);
			
			for (Map.Entry<String, List<MSBDR_PfRpt>> en : lclMap.entrySet()) {
				MCReportInfoR pfReprntInfo = null;
				MCReportSet allRs = null;
				boolean isPfInit = false;
				boolean indivPrntFlg = false;
				
				if (!up1().indiv_prnt_flg()) {
					BpUtil_Sprt01_DtlR bpR = _bpUtil.getFirst(_bpUtilkey, en.getKey());
					indivPrntFlg = bpR.indiv_prnt_flg();
				}
				
				if (up1().indiv_prnt_flg() || indivPrntFlg) {
					// 個別発行
					String oldPf = null;
					for (MSBDR_PfRpt pf : en.getValue()) {
						if (isSame(pf.getAppReportNo1(), oldPf)) {
							allRs.addAll(pf.getAll());
						}
						else {
							if (allRs != null) {
								allRs.setRegister(false);
								MCServerReportManager.request(allRs);
							}
							pfReprntInfo =getPfReprntInfo(pf);
							if (isNull(pfReprntInfo)) {
								allRs = pf.createInstance();
								allRs.setLocale(pf.getLocale());
								allRs.addAll(pf.getAll());
								oldPf = pf.getAppReportNo1();
							}
							else {
								allRs = null;
								MCServerReportManager.reprint(pfReprntInfo);
							}
						}
					}
					if (allRs != null) {
						allRs.setRegister(false);
						MCServerReportManager.request(allRs);
					}
				}
				else {
					// まとめ発行
					for (MSBDR_PfRpt pf : en.getValue()) {
						if (!isPfInit) {
							allRs = pf.createInstance();
							allRs.setLocale(pf.getLocale());
							isPfInit = true;
						}
						pfReprntInfo =getPfReprntInfo(pf);
						if (isNull(pfReprntInfo)) {
							allRs.addAll(pf.getAll());
						}
					}
					if (allRs.size() != 0) {
						MCServerReportManager.request(allRs);
					}
					for (Map.Entry<String, MCReportInfoR> reprntPf : _pfReprntMap.entrySet()) {
						if(isSame(reprntPf.getValue().app_to_cd1(), en.getKey())) {
							MCServerReportManager.reprint(reprntPf.getValue());
						}
					}
				}
			}
		}

		protected MCReportInfoR getPfReprntInfo(MSBDR_PfRpt pf) {
			MCReportInfoR info = pf.getReportInfo();
			return _pfReprntMap.get(info.app_report_no1());
		}

		/**
		 * 取得した値を編集し、レポートセットにセットする
		 */
		protected void setData(MCReportSet reportSet,
				MST_PURC_FRCST_H_R pfHdr,
				PfRptHdrR prntHdr,
				MCList<PfRptDtlR> prntDtl) {

			putNumStr(reportSet, prntDtl,
					PfRptDtlR.$s_int_pre_qty,
					PfRptDtlR.$s_dec_pre_qty,
					PfRptDtlR.$pre_qty,
					"dec_place");
			putNumStr(reportSet, prntDtl,
					PfRptDtlR.$s_pre_qty,
					PfRptDtlR.$pre_qty,
					"dec_place");
			putNumStr(reportSet, prntDtl,
					PfRptDtlR.$s_int_qty,
					PfRptDtlR.$s_dec_qty,
					PfRptDtlR.$qty,
					"dec_place");
			putNumStr(reportSet, prntDtl,
					PfRptDtlR.$s_qty,
					PfRptDtlR.$qty,
					"dec_place");
			putNumStr(reportSet, prntDtl,
					PfRptDtlR.$s_int_po_qty,
					PfRptDtlR.$s_dec_po_qty,
					PfRptDtlR.$po_qty,
					"dec_place");
			putNumStr(reportSet, prntDtl,
					PfRptDtlR.$s_po_qty,
					PfRptDtlR.$po_qty,
					"dec_place");
			putPrntItmSub1(prntDtl, PfRptDtlR.$itm_sub1_view, PfRptDtlR.$itm_sub1_data);
			putPrntItmSub2(prntDtl, PfRptDtlR.$itm_sub2_view, PfRptDtlR.$itm_sub2_data);
			putPrntItmSub3(prntDtl, PfRptDtlR.$itm_sub3_view, PfRptDtlR.$itm_sub3_data);

			reportSet.addRow(prntHdr);
			reportSet.addAll(prntDtl);
			setBizInfo(reportSet, pfHdr, prntHdr);
		}

		/**
		 * 業務情報を設定する
		 */
		protected void setBizInfo(MCReportSet reportSet, MST_PURC_FRCST_H_R pfHdr, PfRptHdrR prntHdr) {
			if (isSame(prntHdr.rpt_sts_typ(), MAC_RPT_STS_TYP.CRT.value())) {
				reportSet.setAppReportNo1(pfHdr.pf_rpt_id());
			}
			else {
				reportSet.setAppReportNo1(pfHdr.del_pf_rpt_id());
			}
			reportSet.setAppReportNo2(pfHdr.pf_rpt_no());
			reportSet.setAppUsrCd1(prntHdr.pf_dpt_cd());
			reportSet.setAppUsrNm1(prntHdr.pf_dpt_nm());
			reportSet.setAppUsrCd2(prntHdr.pf_usr_cd());
			reportSet.setAppUsrNm2(prntHdr.pf_usr_nm());
			reportSet.setAppReportSts1(prntHdr.rpt_sts_typ());
			reportSet.setAppReportStsNm1(prntHdr.rpt_sts_typ_nm());
			reportSet.setAppFromCd1(prntHdr.wg_cd());
			reportSet.setAppFromNm1(prntHdr.wg_nm());
			reportSet.setAppToCd1(prntHdr.sppl_cd());
			reportSet.setAppToNm1(prntHdr.sppl_nm());
			reportSet.setAppToNm2(prntHdr.sppl_cntct_dpt());
		}

		/**
		 * 内示書の業務情報を設定する
		 */
		protected void setPfBizInfo(MCReportSet reportSet, MST_PURC_FRCST_H_R pfHdr ) {
			reportSet.setAppReportNo1(pfHdr.pf_rpt_id());
		}

		/**
		 * 取消内示書の業務情報を設定する
		 */
		protected void setDelPfBizInfo(MCReportSet reportSet, MST_PURC_FRCST_H_R pfHdr ) {
			reportSet.setAppReportNo1(pfHdr.del_pf_rpt_id());
		}

		protected void updPfHdr() {
			if (!isNull(_updHdrL1)) {
				_updHdrL1_bldr.setSet(_updHdrL1_t.pf_rpt_no);
				_updHdrL1_bldr.addSet(_updHdrL1_t.pf_rpt_id);
				_updHdrL1_bldr.addSet(_updHdrL1_t.pf_rpt_dt);
				_updHdrL1_bldr.addSet(_updHdrL1_t.pf_rpt_flg);
				dbUpdateKey("MSBDL5280_MST_PURC_FRCST_H_U05", _updHdrL1, _updHdrL1_bldr);
			}
			if (!isNull(_updHdrL2)) {
				_updHdrL2_bldr.setSet(_updHdrL2_t.del_pf_rpt_id);
				_updHdrL2_bldr.addSet(_updHdrL2_t.del_pf_rpt_dt);
				_updHdrL2_bldr.addSet(_updHdrL2_t.del_pf_rpt_flg);
				dbUpdateKey("MSBDL5280_MST_PURC_FRCST_H_U06", _updHdrL2, _updHdrL2_bldr);
			}
		}
		/**
		 * 新規発行情報をマップに設定する
		 */
		protected void setNewRptMap(MST_PURC_FRCST_H_R r, MCReportSet reportSet) {
			MSBDR_PfRpt rs = MSBDR_PfRpt.create();
			rs.addAll(reportSet.getAll());
			rs.setAppToCd1(reportSet.getAppToCd1());
			rs.setAppReportNo1(reportSet.getAppReportNo1());
			
			List<MSBDR_PfRpt> l = _pfPrntMap.get(Arrays.asList(new String[] {r.purc_frcst_no()}));
			if (null == l) {
				l = new ArrayList<MSBDR_PfRpt>(Arrays.asList(new MSBDR_PfRpt[] {rs}));
			}
			else {
				l.add(rs);
			}
			_pfPrntMap.put(Arrays.asList(new String[] {r.purc_frcst_no()}), l);
		}
		
		/**
		 * 再発行情報をマップに設定する
		 */
		protected void setReRptMap(MST_PURC_FRCST_H_R r, MCList<MCReportInfoR> infoL) {
			MSBDR_PfRpt repSetNew = (MSBDR_PfRpt) MCServerReportManager.toReportSet(infoL.get(0));
			List<MSBDR_PfRpt> l = _pfPrntMap.get(Arrays.asList(new String[] {r.purc_frcst_no()}));
			if (null == l) {
				l = new ArrayList<MSBDR_PfRpt>(Arrays.asList(new MSBDR_PfRpt[] {repSetNew}));
			}
			else {
				l.add(repSetNew);
			}
			_pfPrntMap.put(Arrays.asList(new String[] {r.purc_frcst_no()}), l);
			if (r.del_pf_rpt_flg()) {
				_pfReprntMap.put(r.del_pf_rpt_id(), infoL.get(0));
			}
			else {
				_pfReprntMap.put(r.pf_rpt_id(), infoL.get(0));
			}
		}
		
		/**
		 * 個別発行取得の呼び出し
		 */
		protected void getIndivPrnt() {
			// 内示書の購買内示ＮＯから発注先を検索→発注先を個別発行処理に連携→フラグ取得
			// 購買内示ヘッダの取得
			MCList<MST_PURC_FRCST_H_R> purcFrcstHL = MCList.create(MST_PURC_FRCST_H_R.class);
			MST_PURC_FRCST_H_R t = MST_PURC_FRCST_H_R.create("T");
			MCQueryApiBuilder purcFrcstHL_bldr = MCQueryApiBuilder.create(t);
			purcFrcstHL_bldr.setSelect(t.sppl_cd);
			purcFrcstHL_bldr.setWhere(t.purc_frcst_no.eq(bind("purc_frcst_no")));
			dbSelect("MSBDL5280_MST_PURC_FRCST_H_S06", purcFrcstHL, purcFrcstHL_bldr, up0());
			
			MSUCL_BpUtil.BpUtil_Sprt01 ope = MSUCL_BpUtil.crtBpUtil_Sprt01();
			ope.up0().bp_typ(MAC_BP_IS_SRCH_TYP.SPPL.value());
			for (MST_PURC_FRCST_H_R purcFrcstHR : purcFrcstHL.groupBy(MST_PURC_FRCST_H_R.$sppl_cd)) {
				BpUtil_Sprt01_DtlR dtlR = BpUtil_Sprt01_DtlR.create();
				dtlR.bp_cd(purcFrcstHR.sppl_cd());
				ope.up1().add(dtlR);
			}
			ope.exec();
			
			_bpUtil = ope.down0();
			_bpUtilkey = _bpUtil.createIndex(BpUtil_Sprt01_DtlR.$bp_cd);
		}
		
		/**
		 * 内示書ソート
		 * @param map
		 * @return
		 */
		protected Map<String, List<MSBDR_PfRpt>> pfMapSort(Map<String, List<MSBDR_PfRpt>> map) {
			// 内示書ReportSetマップソート（発注先順）
			List<Entry<String, List<MSBDR_PfRpt>>> entries = new ArrayList<Entry<String, List<MSBDR_PfRpt>>>(map.entrySet());
			Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
			
			LinkedHashMap<String, List<MSBDR_PfRpt>> result = new LinkedHashMap<>();
			for (Map.Entry<String, List<MSBDR_PfRpt>> entry : entries) {
				result.put(entry.getKey(), entry.getValue());
			}

			return result;
		}
	}

	/**
	 * 内示書NO発番
	 */
	protected String getPfRptNo(MST_PURC_FRCST_H_R hdrR) {
		ElmArgsR args = ElmArgsR.create();
		args.bp_cd(hdrR.sppl_cd());
		args.co_cd(getCo().co_cd());
		args.dt(hdrR.pf_dt());
		args.dpt_cd(hdrR.pf_dpt_cd());
		args.wg_cd(hdrR.wg_cd());
		return getNum(MAC_NUM_BIZ_TYP.PFRPT, args);
	}

	protected Comparable[] getVals(String[] keys, MCRow cndR) {
		Comparable[] vals = new Comparable[keys.length];
		for (int i = 0; i < vals.length; i++) {
			vals[i] = cndR.getValueNE(keys[i]);
		}
		return vals;
	}

	//FMCB CUSTOM END
}