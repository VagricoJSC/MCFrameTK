package mcframe.serverMSBC.MSBCL5040;

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
import static mcframe.serverMSBC.MSBCL5040.Query.*;
import mcframe.serverCore.mcjdbc.MCCursor;
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil;
import mcframe.serverCore.resource.MCConst;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_LdCalcService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_LdCalcService_MC extends MSBCL_LdCalcService_MC_A{
	//FMCB CUSTOM START

	
	/**
	 * ItmOrdLd_Srch01オペレーション.<p>
	 *
	 */
	public class ItmOrdLd_Srch01 extends MSBCL_LdCalcService_MC_A.ItmOrdLd_Srch01 {
		
		protected ItmOrdLd_Srch01_CndR _cndR;
		
		protected MCList<MAM_LOC_R> _cacheLocL;
		
		protected MCIndexKey _idxLocL;
		
		protected FXUCL_MCDbcCacheStEnd<MAM_CAL_R> _cacheCalL;
		
		protected MCList<MAM_CAL_EXT_R> _cacheCalExtL;
		
		protected MCIndexKey _idxCalExtL;
		
		protected FXUCL_MCDbcCache<MAM_RSRC_R> _cacheRsrcL;
		
		protected FXUCL_MCDbcCacheStEnd<MAM_RSRC_LOC_R> _cacheRsrcLocL;
		
		protected FXUCL_Cache<MCList<ItmOrdLd_Srch01_SumRsltR>> _cacheSumL;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			// 上り電文が不正な場合、即時終了する
			if (isInvalidUp()) {
				return;
			}

			// 前処理
			editUp();
			
			// キャッシュ初期化
			crtCache();
			
			// 実際値の取得
			srchActQty();

			// 稼働日数、基準値、アラート閾値、負荷率、などの取得
			srchOthers();
			
		}
		
		
		/**
		 * 上り電文のチェック
		 * @return true 異常　<br> false 正常
		 */
		protected boolean isInvalidUp() {
			boolean boo = false;
			boo = boo || isNullOr(up0().dt_fr(), up0().dt_to()) || up0().dt_fr().gt(up0().dt_to());
			boo = boo || !MSC_LD_SUB_CALC_TYP.contains(up0().ld_sub_calc_typ());
			boo = boo || !MAC_PERIOD_TYP.contains(up0().period_typ());
			boo = boo || up1().isEmpty();
			return boo;
		}
		
		
		/**
		 * 前処理
		 */
		protected void editUp() {
			// 検索条件初期化
			crtCndR();
			
			// 会計締日を設定する
			getCndR().addNumberColumn("ac_cl_day", getCo().ac_cl_day());
			
			// 期間ＦＲＯＭと期間ＴＯを期間区分に応じた値に補正する
			getCndR().dt_fr(MAUCL_DateUtil.getPeriodStDt(getCndR().dt_fr(), getCndR().period_typ()));
			getCndR().dt_to(MAUCL_DateUtil.getPeriodEndDt(getCndR().dt_to(), getCndR().period_typ()));
			getCndR().dt_to(getCndR().dt_to().addDay(1));
			
			// SQLバインド値追加
			if (getCndR().opn_flg()) {
				getCndR().addStringColumn("w_opn", MSC_ITM_ORD_STS_TYP.OPN.value());
			}
			if (getCndR().sav_flg()) {
				getCndR().addStringColumn("w_sav", MSC_ITM_ORD_STS_TYP.SAV.value());
			}
			if (getCndR().fix_flg()) {
				getCndR().addStringColumn("w_fix", MSC_ITM_ORD_STS_TYP.FIX.value());
				getCndR().addStringColumn("w_fix_inst", MSC_ITM_ORD_STS_TYP.PART_INST.value());
			}
			
		}
		
		protected void crtCndR() {
			_cndR = up0().clone();
		}
		
		protected ItmOrdLd_Srch01_CndR getCndR() {
			return _cndR;
		}
		
		protected void crtCache() {
			// 場所マスタ
			_cacheLocL = MCList.create(MAM_LOC_R.class);
			MAM_BP_R m1 = MAM_BP_R.create("M1");
			MAM_LOC_R cacheLocL_t = MAM_LOC_R.create("T");
			MCQueryApiBuilder cacheLocL_bldr = MCQueryApiBuilder.create(cacheLocL_t);
			cacheLocL_bldr.setSelect(cacheLocL_t.loc_cd);
			cacheLocL_bldr.addSelect(cacheLocL_t.loc_nm);
			cacheLocL_bldr.addSelect(cacheLocL_t.rsrc_cd1);
			cacheLocL_bldr.addSelect(cacheLocL_t.rsrc_cd2);
			cacheLocL_bldr.addSelect(cacheLocL_t.sppl_cd);
			cacheLocL_bldr.addSelect(nvl(cacheLocL_t.cal_cd, m1.sppl_cal_cd).as("cal_cd"));
			cacheLocL_bldr.addLeftOuterJoin(m1, bracket(m1.bp_cd.eq(cacheLocL_t.sppl_cd)));
			cacheLocL_bldr.setWhere(cacheLocL_t.loc_cd.eq(bind("mfg_loc_cd")));
			dbSelect("MSBCL5040_MAM_LOC_S01", _cacheLocL, cacheLocL_bldr,
					up1().distinctNE(ItmOrdLd_Srch01_LocCndR.$mfg_loc_cd));
			_idxLocL = _cacheLocL.createIndex(MAM_LOC_R.$loc_cd);
			
			
			// カレンダマスタ
			for (MAM_LOC_R locR : _cacheLocL) {
				if (isNull(locR.cal_cd()) && isNull(locR.sppl_cd())) {
					locR.cal_cd(getCo().std_cal_cd());
				}
			}
			MCList<MAM_LOC_R> bindCalL = _cacheLocL.groupBy(MAM_LOC_R.$cal_cd);
			
			MAM_CAL_R t1 = MAM_CAL_R.create("T");
			MCQueryApiBuilder dbcCalL_bldr = MCQueryApiBuilder.create(t1);
			dbcCalL_bldr.setSelect(t1.cal_cd);
			dbcCalL_bldr.addSelect(t1.st_dt);
			dbcCalL_bldr.addSelect(t1.end_dt);
			dbcCalL_bldr.addSelect(t1.sun_off_flg);
			dbcCalL_bldr.addSelect(t1.mon_off_flg);
			dbcCalL_bldr.addSelect(t1.tue_off_flg);
			dbcCalL_bldr.addSelect(t1.wed_off_flg);
			dbcCalL_bldr.addSelect(t1.thu_off_flg);
			dbcCalL_bldr.addSelect(t1.fri_off_flg);
			dbcCalL_bldr.addSelect(t1.sat_off_flg);
			_cacheCalL = new FXUCL_MCDbcCacheStEnd<MAM_CAL_R>(dbcCalL_bldr, -1, bindCalL, MAM_LOC_R.$cal_cd);
			
			// 臨時カレンダマスタ
			_cacheCalExtL = MCList.create(MAM_CAL_EXT_R.class);
			MAM_CAL_EXT_R cacheCalExtL_t = MAM_CAL_EXT_R.create("T");
			MCQueryApiBuilder cacheCalExtL_bldr = MCQueryApiBuilder.create(cacheCalExtL_t);
			cacheCalExtL_bldr.setSelect(cacheCalExtL_t.cal_cd);
			cacheCalExtL_bldr.addSelect(cacheCalExtL_t.dt);
			cacheCalExtL_bldr.addSelect(cacheCalExtL_t.off_flg);
			cacheCalExtL_bldr.setWhere(cacheCalExtL_t.cal_cd.eq(bind("cal_cd")));
			cacheCalExtL_bldr.addConstWhereWithAnd(cacheCalExtL_t.del_flg.eq(value(false)));
			dbSelect("MSBCL5040_MAM_CAL_EXT_S01", _cacheCalExtL, cacheCalExtL_bldr, bindCalL);
			_idxCalExtL = _cacheCalExtL.createIndex(MAM_CAL_EXT_R.$cal_cd, MAM_CAL_EXT_R.$dt);
			
			
			// 資源マスタ
			MCList<MAM_RSRC_R> bindRsrcL = MCList.create(MAM_RSRC_R.class);
			for (MAM_LOC_R locR : _cacheLocL) {
				if (!isNull(locR.rsrc_cd1())) {
					MAM_RSRC_R r = MAM_RSRC_R.create();
					r.rsrc_cd(locR.rsrc_cd1());
					bindRsrcL.add(r);
				}
				if (!isNull(locR.rsrc_cd2())) {
					MAM_RSRC_R r = MAM_RSRC_R.create();
					r.rsrc_cd(locR.rsrc_cd2());
					bindRsrcL.add(r);
				}
			}
			MAM_RSRC_R t2 = MAM_RSRC_R.create("T");
			MCQueryApiBuilder dbcRsrcL_bldr = MCQueryApiBuilder.create(t2);
			dbcRsrcL_bldr.setSelect(t2.rsrc_cd);
			dbcRsrcL_bldr.addSelect(t2.rsrc_nm);
			dbcRsrcL_bldr.addSelect(t2.rsrc_unit_nm);
			dbcRsrcL_bldr.addSelect(t2.dec_place);
			dbcRsrcL_bldr.addSelect(t2.rnd_typ);
			_cacheRsrcL = new FXUCL_MCDbcCache<MAM_RSRC_R>(dbcRsrcL_bldr, -1, bindRsrcL, MAM_RSRC_R.$rsrc_cd);
			// 場所ＣＤと資源ＣＤが有効なもののみ下り電文作成対象とする
			for (MAM_LOC_R locR : _cacheLocL) {
				if (!isNull(locR.rsrc_cd1())) {
					MAM_RSRC_R r = _cacheRsrcL.get(locR.rsrc_cd1());
					if (isNull(r.rsrc_cd())) {
						locR.rsrc_cd1(null);
					}
				}
				if (!isNull(locR.rsrc_cd2())) {
					MAM_RSRC_R r = _cacheRsrcL.get(locR.rsrc_cd2());
					if (isNull(r.rsrc_cd())) {
						locR.rsrc_cd2(null);
					}
				}
			}
			
			
			// 場所別資源マスタ
			MCList<MAM_RSRC_LOC_R> bindRsrcLocL = MCList.create(MAM_RSRC_LOC_R.class);
			for (MAM_LOC_R locR : _cacheLocL) {
				if (!isNull(locR.rsrc_cd1())) {
					MAM_RSRC_LOC_R r = MAM_RSRC_LOC_R.create();
					r.mfg_loc_cd(locR.loc_cd());
					r.rsrc_cd(locR.rsrc_cd1());
					bindRsrcLocL.add(r);
				}
				if (!isNull(locR.rsrc_cd2())) {
					MAM_RSRC_LOC_R r = MAM_RSRC_LOC_R.create();
					r.mfg_loc_cd(locR.loc_cd());
					r.rsrc_cd(locR.rsrc_cd2());
					bindRsrcLocL.add(r);
				}
			}
			MAM_RSRC_LOC_R t3 = MAM_RSRC_LOC_R.create("T");
			MCQueryApiBuilder dbcRsrcLocL_bldr = MCQueryApiBuilder.create(t3);
			dbcRsrcLocL_bldr.setSelect(t3.mfg_loc_cd);
			dbcRsrcLocL_bldr.addSelect(t3.rsrc_cd);
			dbcRsrcLocL_bldr.addSelect(t3.st_dt);
			dbcRsrcLocL_bldr.addSelect(t3.end_dt);
			dbcRsrcLocL_bldr.addSelect(t3.rsrc_base_qty);
			dbcRsrcLocL_bldr.addSelect(t3.var_per);
			dbcRsrcLocL_bldr.addSelect(t3.alert_per);
			dbcRsrcLocL_bldr.addSelect(t3.del_flg);
			_cacheRsrcLocL = new FXUCL_MCDbcCacheStEnd<MAM_RSRC_LOC_R>(dbcRsrcLocL_bldr, -1,
					bindRsrcLocL, MAM_RSRC_LOC_R.$mfg_loc_cd, MAM_RSRC_LOC_R.$rsrc_cd);
			
			// 下り電文雛型
			_cacheSumL = new FXUCL_Cache<MCList<ItmOrdLd_Srch01_SumRsltR>>();
			_cacheSumL.setFixMaxCacheSize(-1);
			
			// 検索条件補正後の処理
			// 合計値行の雛型作成。トランにデータが存在しなくとも、ゼロレコードを作成する。
			for (MAM_LOC_R locR : _cacheLocL) {
				if (!isNull(locR.rsrc_cd1())) {
					getSumL(locR.loc_cd(), locR.rsrc_cd1());
				}
				if (!isNull(locR.rsrc_cd2())) {
					getSumL(locR.loc_cd(), locR.rsrc_cd2());
				}
			}
			
			// 以降、ワークテーブルのデータが削除されないようにすること ＊場所マスタのＤＢコンテナでＳＱＬ発行しない
			dbWkDelete("MSBCL5040_MAW_LOC_D01", cacheLocL_bldr.getBaseDbc());
			dbWkInsert("MSBCL5040_MAW_LOC_I01", _cacheLocL, cacheLocL_bldr.getBaseDbc());
		}
		
		protected MAM_LOC_R getLocR(String locCd) {
			MAM_LOC_R r = _cacheLocL.getFirst(_idxLocL, locCd);
			if (r == null) {
				r = MAM_LOC_R.create();
			}
			return r;
		}
		
		protected boolean isOn(String calCd, MCDate dt) {
			if (isNull(calCd)) {
				return true;
			}
			else {
				Comparable<?>[] vals = {calCd, dt};
				MAM_CAL_EXT_R extR =  _cacheCalExtL.getFirst(_idxCalExtL, vals);
				if (extR != null) {
					return !extR.off_flg();
				}
				else {
					MAM_CAL_R calR = _cacheCalL.get(dt, calCd);
					if (calR != null) {
						int day = dt.getDayOfWeek();
						if (day == MCCalendarDate.MONDAY) {
							return !calR.mon_off_flg();
						}
						if (day == MCCalendarDate.TUESDAY) {
							return !calR.tue_off_flg();
						}
						if (day == MCCalendarDate.WEDNESDAY) {
							return !calR.wed_off_flg();
						}
						if (day == MCCalendarDate.THURSDAY) {
							return !calR.thu_off_flg();
						}
						if (day == MCCalendarDate.FRIDAY) {
							return !calR.fri_off_flg();
						}
						if (day == MCCalendarDate.SATURDAY) {
							return !calR.sat_off_flg();
						}
						if (day == MCCalendarDate.SUNDAY) {
							return !calR.sun_off_flg();
						}
					}
				}
			}
			return true;
		}
		
		protected int getDecPlace(String rsrcCd) {
			MAM_RSRC_R r = _cacheRsrcL.getCache(rsrcCd);
			if (isNull(r.dec_place())) {
				return 0;
			}
			return r.dec_place().intValue();
		}
		
		protected MAC_RND_TYP getRndTyp(String rsrcCd) {
			MAM_RSRC_R r = _cacheRsrcL.getCache(rsrcCd);
			MAC_RND_TYP typ = MAC_RND_TYP.getNE(r.rnd_typ());
			if (typ == null) {
				return MAC_RND_TYP.RNDOFF;
			}
			else {
				return typ;
			}
		}
		
		protected MAM_RSRC_R getRsrcR(String rsrcCd) {
			return _cacheRsrcL.get(rsrcCd);
		}
		
		
		protected MCNumber getBaseQty(MCDate dt, String mfgLocCd, String rsrcCd) {
			MAM_RSRC_LOC_R rl = _cacheRsrcLocL.get(dt, mfgLocCd, rsrcCd);
			if (isNull(rl.var_per()) || rl.del_flg()) {
				return rl.rsrc_base_qty();
			}
			else {
				return rl.rsrc_base_qty().multiply(rl.var_per())
						.divide(100, getDecPlace(rsrcCd), getRndTyp(rsrcCd).toMC());
			}
		}
		
		protected MCNumber getAlertQty(MCDate dt, String mfgLocCd, String rsrcCd) {
			MAM_RSRC_LOC_R rl = _cacheRsrcLocL.get(dt, mfgLocCd, rsrcCd);
			if (isNull(rl.alert_per()) || rl.del_flg()) {
				return MCNumber.ZERO;
			}
			else {
				return getBaseQty(dt, mfgLocCd, rsrcCd).multiply(rl.alert_per()).divide(
						100, getDecPlace(rsrcCd), getRndTyp(rsrcCd).toMC());
			}
		}
		
		/**
		 * 実際値の取得
		 */
		protected void srchActQty() {
			if (getCndR().cmpl_flg()) {
				srchActQty(MSBCL5040_MST_MFG_ACT_S01());
			}
			if (getCndR().inst_flg()) {
				srchActQty(MSBCL5040_MST_MFG_INST_S01());
			}
			if (getCndR().fix_flg()) {
				srchActQty(MSBCL5040_MST_ITM_ORDER_S02());
			}
			if (getCndR().opn_flg() || getCndR().sav_flg() || getCndR().fix_flg()) {
				srchActQty(MSBCL5040_MST_ITM_ORDER_S01());
			}
			if (getCndR().prcd_flg()) {
				srchActQty(MSBCL5040_MST_PRCD_ITM_ORDER_S01());
			}
			if (getCndR().sim_flg() && !isNull(getCndR().sim_mrp_no())) {
				srchActQty(MSBCL5040_MST_SIM_ITM_ORDER_S01());
			}
		}
		
		
		protected void srchActQty(MCQueryPlan query) {
			MCCursor<ItmOrdLd_Srch01_SrchRsltR> cur = null;
			try {
				cur = openCursor(ItmOrdLd_Srch01_SrchRsltR.class, query, getCndR(), null, getFetchSize());
				
				while (cur.dbFetch() > 0) {
					MCList<ItmOrdLd_Srch01_SrchRsltR> lst = cur.getList();
					for (ItmOrdLd_Srch01_SrchRsltR r : lst) {
						MAM_LOC_R locR = getLocR(r.mfg_loc_cd());
						// 資源１
						if (!isNullOr(locR.rsrc_cd1())) {
							addActQtySumR(r.mfg_loc_cd(), locR.cal_cd(), locR.rsrc_cd1(), r.dt_fr(), r.dt_to(),
									r.act_qty1());
						}
						// 資源２
						if (!isNullOr(locR.rsrc_cd2())) {
							addActQtySumR(r.mfg_loc_cd(), locR.cal_cd(), locR.rsrc_cd2(), r.dt_fr(), r.dt_to(),
									r.act_qty2());
						}
					}
				}
			}
			finally {
				if (cur != null) {
					cur.dbCloseCur();
				}	
			}
		}
		
		protected int getFetchSize() {
			int fetchSize = MCConst.app.getInteger("MS.MSBCL5040.fetch_size", 1000);
			if (fetchSize <= 0) {
				fetchSize = 1000;
			}
			return fetchSize;
		}
		
		protected void addActQtySumR(String mfgLocCd, String calCd,
				String rsrcCd, MCDate dtFr, MCDate dtTo, MCNumber actQty) {
			if (isNull(actQty) || MCNumber.ZERO.eq(actQty)) {
				return ;
			}
			
			// １つの集計期間に属するケース
			if (isBelongOneBkt(dtFr, dtTo)) {
				addActQtySumR(mfgLocCd, rsrcCd, dtFr, actQty);
			}
			// 複数の集計期間に属するケース
			else {
				MCList<ItmOrdLd_Srch01_SrchRsltR> divL = MCList
						.create(ItmOrdLd_Srch01_SrchRsltR.class);
				MCDate dt = dtFr;
				while (dt.lte(dtTo)) {
					if (isOn(calCd, dt)) {
						ItmOrdLd_Srch01_SrchRsltR divR = ItmOrdLd_Srch01_SrchRsltR
								.create();
						divR.dt_fr(dt);
						divR.act_qty1(MCNumber.ONE);
						divL.add(divR);
					}
					dt = dt.addDay(1);
				}

				// 稼働日がない場合
				if (divL.isEmpty()) {
					addActQtySumR(mfgLocCd, rsrcCd, dtTo, actQty); // 最終日
				}
				// 稼働日がある場合
				else {
					FXUCC_Divide.propNE(divL, actQty, getDecPlace(rsrcCd),
							ItmOrdLd_Srch01_SrchRsltR.$act_qty1,
							ItmOrdLd_Srch01_SrchRsltR.$act_qty2);
					for (ItmOrdLd_Srch01_SrchRsltR divR : divL) {
						addActQtySumR(mfgLocCd, rsrcCd, divR.dt_fr(), divR.act_qty2());
					}
				}
			}
		}
		
		protected void addActQtySumR(String mfgLocCd, String rsrcCd, MCDate dtFr,
				MCNumber actQty) {
			ItmOrdLd_Srch01_SumRsltR sumR = getSumR(mfgLocCd, rsrcCd, dtFr);
			if (sumR == null) {
				return ;
			}
			sumR.act_qty(MCNumber.sum(sumR.act_qty(), actQty));
		}

		protected ItmOrdLd_Srch01_SumRsltR getSumR(String mfgLocCd, String rsrcCd,
				MCDate dtFr) {
			MCList<ItmOrdLd_Srch01_SumRsltR> sumL = getSumL(mfgLocCd, rsrcCd);
			for (ItmOrdLd_Srch01_SumRsltR sumR : sumL) {
				if (dtFr.gte(sumR.dt_fr()) && dtFr.lte(sumR.dt_to())) {
					return sumR;
				}
			}
			return null;
		}
		
		protected MCList<ItmOrdLd_Srch01_SumRsltR> getSumL(String mfgLocCd, String rsrcCd) {
			MCList<ItmOrdLd_Srch01_SumRsltR> sumL = _cacheSumL.getCache(mfgLocCd, rsrcCd);
			if (sumL == null) {
				sumL = crtSumL(mfgLocCd, rsrcCd);
				down0().addAll(sumL);
				_cacheSumL.putCache(new Comparable<?>[]{mfgLocCd,rsrcCd}, sumL);
			}
			return sumL;
		}
		
		protected MCList<ItmOrdLd_Srch01_SumRsltR> crtSumL(String mfgLocCd, String rsrcCd) {
			MCList<ItmOrdLd_Srch01_SumRsltR> sumL = MCList.create(ItmOrdLd_Srch01_SumRsltR.class);
			MCDate dt = getCndR().dt_fr();
			
			// getCndR.dt_to = up0.dt_to+1
			while (dt.lt(getCndR().dt_to())) {
				ItmOrdLd_Srch01_SumRsltR sumR = ItmOrdLd_Srch01_SumRsltR.create();
				setCrtCmmnVal(sumR, mfgLocCd, rsrcCd, dt);
				sumR.on_num(MCNumber.ZERO);
				sumR.base_qty(MCNumber.ZERO);
				sumR.alert_qty(MCNumber.ZERO);
				dt = sumR.dt_to().addDay(1);
				sumL.add(sumR);
			}
			return sumL;
		}
		
		protected void setCrtCmmnVal(ItmOrdLd_Srch01_SumRsltR sumR, String mfgLocCd,
				String rsrcCd, MCDate stDt) {
			sumR.mfg_loc_cd(mfgLocCd);
			sumR.mfg_loc_nm(getLocR(mfgLocCd).loc_nm());
			sumR.rsrc_cd(rsrcCd);
			MAM_RSRC_R rsrcR = getRsrcR(rsrcCd);
			sumR.rsrc_nm(rsrcR.rsrc_nm());
			sumR.rsrc_unit_nm(rsrcR.rsrc_unit_nm());
			sumR.rsrc_dec_place(getDecPlace(rsrcCd));
			sumR.act_qty(MCNumber.ZERO);
			sumR.dt_fr(stDt);
			sumR.dt_to(MAUCL_DateUtil.getPeriodEndDt(stDt, getCndR().period_typ()));
		}
		
		protected boolean isBelongOneBkt(MCDate dtFr, MCDate dtTo) {
			MCDate dt1 = MAUCL_DateUtil.getPeriodStDt(dtFr, getCndR().period_typ());
			MCDate dt2 = MAUCL_DateUtil.getPeriodStDt(dtTo, getCndR().period_typ());
			return isSame(dt1, dt2);
		}
		
		
		/**
		 * 稼働日数、基準値、アラート閾値、負荷率、などの取得
		 */
		protected void srchOthers() {
			// 合計値行：稼働日数、基準値、アラート閾値の算出
			setMstQty();
			
			// 合計値行と小計値行：負荷率の算出
			setLdRate();
		}
		
		protected void setMstQty() {
			for (ItmOrdLd_Srch01_SumRsltR sumR : down0()) {
				MAM_LOC_R locR = getLocR(sumR.mfg_loc_cd());
				String calCd = locR.cal_cd();
				
				MCDate dt = sumR.dt_fr();
				int onNum = 0;
				while (dt.lte(sumR.dt_to())) {
					if (isOn(calCd, dt)) {
						onNum++;
						sumR.base_qty(MCNumber.sum(sumR.base_qty(),
								getBaseQty(dt, sumR.mfg_loc_cd(), sumR.rsrc_cd())));
						sumR.alert_qty(MCNumber.sum(sumR.alert_qty(),
								getAlertQty(dt, sumR.mfg_loc_cd(), sumR.rsrc_cd())));
					}
					dt = dt.addDay(1);
				}
				sumR.on_num(onNum);
			}
		}
		
		protected void setLdRate() {
			for (ItmOrdLd_Srch01_SumRsltR sumR : down0()) {
				sumR.ld_rate(calcLdRate(sumR.act_qty(), sumR.base_qty()));
			}
		}
		
		protected MCNumber calcLdRate(MCNumber actQty , MCNumber stdQty) {
			if (isNullOr(actQty, stdQty) || stdQty.eq(0)) {
				return null;
			}
			
			return actQty.multiply(100).divide(stdQty,
					mcframe.commonMA.meta.MA_META.RATE.scale(),
					MAC_RND_TYP.RNDOFF.toMC());
		}
		
	}

	//FMCB CUSTOM END
}