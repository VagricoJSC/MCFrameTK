package mcframe.serverMSBC.MSBCL0290;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBC.MSBCL0290.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBC.MSBCL0290.Query.*;
import mcframe.serverCore.mcjdbc.MCCursor;
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverCore.resource.MCConst;
import java.math.RoundingMode;

import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_ItmOrdGanttChart"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_ItmOrdGanttChart_MC extends MSBCL_ItmOrdGanttChart_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBCL_ItmOrdGanttChart_MC_A.Srch01 {
		
		protected Srch01_CndR _cndR;
		
		protected MCDate _dt_fr;
		
		protected MCDate _dt_to;
		
		protected MCIndexKey _idxLocL;
		
		protected MCIndexKey _idxRsrcLocL;

		protected FXUCL_MCDbcCacheStEnd<MAM_CAL_R> _cacheCalL;
		
		protected MCList<MAM_CAL_EXT_R> _cacheCalExtL;
		
		protected MCIndexKey _idxCalExtL;

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
			
			// 上り電文を編集する
			editUp();
			
			// 検索対象の場所を取得する
			srchLocL();
			if (!hasLocL()) {
				return ;
			}
			
			// キャッシュ初期化
			crtCache();
			
			// 基準値の設定、表示順の設定
			setMstRsrcLoc();
			
			// 実際値の取得
			srchActQty();
			
			if (!hasData()) {
				doNoDataFound();
				return ;
			}
			
			// 引当予定の取得
			srchAllocPln();
			
			// 休日の取得
			setMstQty();
			
			// オーダのない場所情報を除去
			trimLocNoOrder();
		}
		
		/**
		 * 上り電文のチェック
		 * @return true 異常　<br> false 正常
		 */
		protected boolean isInvalidUp() {
			boolean boo = false;
			boo = isNullOr(up0().dt_fr(), up0().dt_to()) || up0().dt_fr().gt(up0().dt_to());
			return boo;
		}
		
		/**
		 * 検索対象の場所を取得する
		 */
		protected void srchLocL() {
			executeQuery(down1(), MSBCL0290_MAM_RSRC_LOC_S01(), getCndR());
			_idxLocL = down1().createIndex(Srch01_RsltR.$mfg_loc_cd);
		}

		protected boolean hasLocL() {
			return !isNull(down1());
		}
		
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			// 検索条件初期化
			crtCndR();
			
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

			// 時刻項目対応：期間ＴＯ
			getCndR().dt_to(getCndR().dt_to().addDay(1));
			
			// 製造開始日の最小値、製造終了日の最大値の取得
			setDtFrDtTo();
			
		}
		
		protected void crtCndR() {
			String DefWgCd = getSysParm("DEF_WG_CD");
			if (!isNullOrNullVal(DefWgCd)) {
				up0().wg_cd(DefWgCd);
			}
			_cndR = up0().clone();
		}
		
		protected Srch01_CndR getCndR() {
			return _cndR;
		}
		
		protected boolean hasData() {
			return !isNull(down0());
		}
		
		protected void doNoDataFound() {
			down1().clear();
			down2().clear();
		}
		
		protected void crtCache() {
			// 処理対象場所
			// マスタ取得などの後処理でも使用するので、ワークテーブルのデータを削除しないように注意すること
			MCList<MAM_LOC_R> locWkL = MCList.create(MAM_LOC_R.class);
			MCQueryApiBuilder locWkL_bldr = MCQueryApiBuilder.create(MAM_LOC_R.create("T"));
			for (Srch01_LocR r : down1()) {
				MAM_LOC_R dbc = MAM_LOC_R.create();
				dbc.loc_cd(r.mfg_loc_cd());
				locWkL.add(dbc);
			}
			
			dbWkDelete("MSBCL0290_MAW_LOC_D01", locWkL_bldr.getBaseDbc());
			dbWkInsert("MSBCL0290_MAW_LOC_I01", locWkL, locWkL_bldr.getBaseDbc());
			

			// カレンダマスタ
			for (Srch01_LocR locR : down1()) {
				if (isNull(locR.cal_cd()) && isNull(locR.sppl_cd())) {
					locR.cal_cd(getCo().std_cal_cd());
				}
			}
			MCList<Srch01_LocR> bindCalL = down1().groupBy(MAM_LOC_R.$cal_cd);
			
			MAM_CAL_R t2 = MAM_CAL_R.create("T");
			MCQueryApiBuilder dbcCalL_bldr = MCQueryApiBuilder.create(t2);
			dbcCalL_bldr.setSelect(t2.cal_cd);
			dbcCalL_bldr.addSelect(t2.st_dt);
			dbcCalL_bldr.addSelect(t2.end_dt);
			dbcCalL_bldr.addSelect(t2.sun_off_flg);
			dbcCalL_bldr.addSelect(t2.mon_off_flg);
			dbcCalL_bldr.addSelect(t2.tue_off_flg);
			dbcCalL_bldr.addSelect(t2.wed_off_flg);
			dbcCalL_bldr.addSelect(t2.thu_off_flg);
			dbcCalL_bldr.addSelect(t2.fri_off_flg);
			dbcCalL_bldr.addSelect(t2.sat_off_flg);
			_cacheCalL = new FXUCL_MCDbcCacheStEnd<MAM_CAL_R>(dbcCalL_bldr, -1, bindCalL,
					MAM_LOC_R.$cal_cd);
			
			// 臨時カレンダマスタ
			_cacheCalExtL = MCList.create(MAM_CAL_EXT_R.class);
			MAM_CAL_EXT_R t3 = MAM_CAL_EXT_R.create("T");
			MCQueryApiBuilder _cacheCalExtL_bldr = MCQueryApiBuilder.create(t3);
			_cacheCalExtL_bldr.setSelect(t3.cal_cd);
			_cacheCalExtL_bldr.addSelect(t3.dt);
			_cacheCalExtL_bldr.addSelect(t3.off_flg);
			_cacheCalExtL_bldr.setWhere(t3.cal_cd.eq(bind("cal_cd")));
			_cacheCalExtL_bldr.addConstWhereWithAnd(t3.del_flg.eq(value(false)));
			dbSelect("MSBCL0290_MAM_CAL_EXT_S01", _cacheCalExtL, _cacheCalExtL_bldr, bindCalL);
			_idxCalExtL = _cacheCalExtL.createIndex(MAM_CAL_EXT_R.$cal_cd, MAM_CAL_EXT_R.$dt);
			
		}
		
		protected Srch01_LocR getLocR(String mfgLocCd) {
			return down1().getFirst(_idxLocL, mfgLocCd);
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
		
		/**
		 * 製造開始日の最小値、製造終了日の最大値の取得<br>
		 */
		protected void setDtFrDtTo() {
			_dt_fr = getCndR().dt_fr();
			_dt_to = getCndR().dt_to();
			MCList<MCRow> tmpL = MCList.create(MCRow.class);
			if (getCndR().cmpl_flg()) {
				int cnt = executeQuery(tmpL, MSBCL0290_MST_MFG_ACT_S02(), getCndR());
				setDtFrDtTo(cnt, tmpL);
			}
			if (getCndR().inst_flg()) {
				int cnt = executeQuery(tmpL, MSBCL0290_MST_MFG_INST_S02(), getCndR());
				setDtFrDtTo(cnt, tmpL);
			}
			if (getCndR().fix_flg()) {
				int cnt = executeQuery(tmpL, MSBCL0290_MST_ITM_ORDER_S04(), getCndR());
				setDtFrDtTo(cnt, tmpL);
			}
			if (getCndR().opn_flg() || getCndR().sav_flg() || getCndR().fix_flg()) {
				int cnt = executeQuery(tmpL, MSBCL0290_MST_ITM_ORDER_S03(), getCndR());
				setDtFrDtTo(cnt, tmpL);
			}
			if (getCndR().prcd_flg()) {
				int cnt = executeQuery(tmpL, MSBCL0290_MST_PRCD_ITM_ORDER_S02(), getCndR());
				setDtFrDtTo(cnt, tmpL);
			}
			if (getCndR().sim_flg() && !isNull(getCndR().sim_mrp_no())) {
				int cnt = executeQuery(tmpL, MSBCL0290_MST_SIM_ITM_ORDER_S02(), getCndR());
				setDtFrDtTo(cnt, tmpL);
			}
			getCndR().setDateNE("wk_dt_fr", _dt_fr);
			getCndR().setDateNE("wk_dt_to", _dt_to);
		}
		
		protected void setDtFrDtTo(int cnt, MCList<MCRow> tmpL) {
			if (cnt > 0) {
				if (_dt_fr.gtDate(tmpL.get(0).getDateNE("min_mfg_st_dt"))) {
					_dt_fr = tmpL.get(0).getDateNE("min_mfg_st_dt");
				}
				if (_dt_to.ltDate(tmpL.get(0).getDateNE("max_mfg_end_dt"))) {
					_dt_to = tmpL.get(0).getDateNE("max_mfg_end_dt");
				}
			}
		}
		
		/**
		 * 基準値の設定、表示順の設定
		 */
		protected void setMstRsrcLoc() {
			// 場所別資源マスタ
			MCList<MAM_RSRC_LOC_R> bindRsrcLocL = MCList.create(MAM_RSRC_LOC_R.class);
			for (Srch01_LocR locR : down1()) {
				if (!isNull(locR.rsrc_cd1())) {
					MAM_RSRC_LOC_R r = MAM_RSRC_LOC_R.create();
					r.mfg_loc_cd(locR.mfg_loc_cd());
					r.rsrc_cd(locR.rsrc_cd1());
					bindRsrcLocL.add(r);
				}
				if (!isNull(locR.rsrc_cd2())) {
					MAM_RSRC_LOC_R r = MAM_RSRC_LOC_R.create();
					r.mfg_loc_cd(locR.mfg_loc_cd());
					r.rsrc_cd(locR.rsrc_cd2());
					bindRsrcLocL.add(r);
				}
			}
			
			MAM_RSRC_LOC_R t = MAM_RSRC_LOC_R.create("T");
			MCQueryApiBuilder dbcRsrcLocL_bldr = MCQueryApiBuilder.create(t);
			dbcRsrcLocL_bldr.setSelect(t.mfg_loc_cd);
			dbcRsrcLocL_bldr.addSelect(t.rsrc_cd);
			dbcRsrcLocL_bldr.addSelect(t.st_dt);
			dbcRsrcLocL_bldr.addSelect(t.end_dt);
			dbcRsrcLocL_bldr.addSelect(t.rsrc_base_qty);
			dbcRsrcLocL_bldr.addSelect(t.var_per);
			dbcRsrcLocL_bldr.addSelect(t.alert_per);
			dbcRsrcLocL_bldr.addSelect(t.disp_seq);
			dbcRsrcLocL_bldr.addSelect(t.del_flg);
			FXUCL_MCDbcCacheStEnd<MAM_RSRC_LOC_R> cacheRsrcLocL = new FXUCL_MCDbcCacheStEnd<MAM_RSRC_LOC_R>(
					dbcRsrcLocL_bldr, -1, bindRsrcLocL, MAM_RSRC_LOC_R.$mfg_loc_cd,
					MAM_RSRC_LOC_R.$rsrc_cd);

			
			// 基準値の設定
			for (Srch01_LocR locR : down1()) {
				addMstQty(locR.mfg_loc_cd(), locR.cal_cd(), locR.rsrc_cd1(),
						locR.rsrc_dec_place1(), locR.rsrc_rnd_typ1(), cacheRsrcLocL);
				addMstQty(locR.mfg_loc_cd(), locR.cal_cd(), locR.rsrc_cd2(),
						locR.rsrc_dec_place2(), locR.rsrc_rnd_typ2(), cacheRsrcLocL);
			}
			_idxRsrcLocL = down2().createIndex(Srch01_RsrcLocR.$mfg_loc_cd,
					Srch01_RsrcLocR.$rsrc_cd, Srch01_RsrcLocR.$dt);			
			
			// 表示順の設定
			for (Srch01_LocR locR : down1()) {
				if (!isNull(locR.rsrc_cd1())) {
					MAM_RSRC_LOC_R dispR = cacheRsrcLocL.get(getCndR().dt_fr(),
							locR.mfg_loc_cd(), locR.rsrc_cd1());
					locR.disp_seq(dispR.disp_seq());
				}
			}
			
			MCSortPolicy spMfgLoc = new MCSortPolicy();
			spMfgLoc.add(SortType.ASC, Srch01_LocR.$disp_seq);
			spMfgLoc.add(SortType.ASC, Srch01_LocR.$mfg_loc_cd);
			down1().sort(spMfgLoc);
			
			for (int i = 0; i < down1().size(); i++) {
				down1().get(i).disp_seq(i);
			}
		}
		
		protected void addMstQty(String mfgLocCd, String calCd, String rsrcCd,
				MCNumber decPlace, String rndTyp, FXUCL_MCDbcCacheStEnd<MAM_RSRC_LOC_R> cacheRsrcLocL) {
			if (isNullOr(mfgLocCd, rsrcCd)) {
				return ;
			}
			MCDate dt = _dt_fr;
			MCDate dt_to = _dt_to;
			// dt_toには時刻対応のためeditUpで＋1日しているので、条件をlteでなくてltにする
			while (dt.lt(dt_to)) {
				Srch01_RsrcLocR r = Srch01_RsrcLocR.create();
				r.mfg_loc_cd(mfgLocCd);
				r.rsrc_cd(rsrcCd);
				r.dt(dt);
				if (isOn(calCd, dt)) {
					MAM_RSRC_LOC_R m = cacheRsrcLocL.get(dt, mfgLocCd, rsrcCd);
					MCNumber baseQty = null;
					if (m.del_flg()) {
						baseQty = MCNumber.ZERO;
					}
					else if (isNull(m.var_per())) {
						baseQty = nvl(m.rsrc_base_qty(), MCNumber.ZERO);
					}
					else {
						baseQty = m
								.rsrc_base_qty()
								.multiply(m.var_per())
								.divide(100, toDecPlace(decPlace), toRoundingMode(rndTyp));
					}
					r.base_qty(baseQty);
				}
				else {
					r.base_qty(0);
				}
				r.act_qty(0);
				down2().add(r);
				dt = dt.addDay(1);
			}
		}
		
		/**
		 * 実際値の取得 <br>
		 * 負荷計算サービス（MSBCL5040）と整合性をとること
		 */
		protected void srchActQty() {
			if (getCndR().cmpl_flg()) {
				srchActQty(MSBCL0290_MST_MFG_ACT_S01());
			}
			if (getCndR().inst_flg()) {
				srchActQty(MSBCL0290_MST_MFG_INST_S01());
			}
			if (getCndR().fix_flg()) {
				srchActQty(MSBCL0290_MST_ITM_ORDER_S02());
			}
			if (getCndR().opn_flg() || getCndR().sav_flg() || getCndR().fix_flg()) {
				srchActQty(MSBCL0290_MST_ITM_ORDER_S01());
			}
			if (getCndR().prcd_flg()) {
				srchActQty(MSBCL0290_MST_PRCD_ITM_ORDER_S01());
			}
			if (getCndR().sim_flg() && !isNull(getCndR().sim_mrp_no())) {
				srchActQty(MSBCL0290_MST_SIM_ITM_ORDER_S01());
			}
		}

		protected void srchActQty(MCQueryPlan query) {
			MCCursor<Srch01_RsltR> cur = null;
			try {
				cur = openCursor(Srch01_RsltR.class, query, getCndR(), null, getFetchSize());
				
				while (cur.dbFetch() > 0) {
					MCList<Srch01_RsltR> lst = cur.getList();
					setActQty(lst);
				}
			}
			finally {
				if (cur != null) {
					cur.dbCloseCur();
				}	
			}
		}
		
		protected int getFetchSize() {
			int fetchSize = MCConst.app.getInteger("MS.MSBCL0290.fetch_size", 1000);
			if (fetchSize <= 0) {
				fetchSize = 1000;
			}
			return fetchSize;
		}

		protected void setActQty(MCList<Srch01_RsltR> lst) {
			for (Srch01_RsltR r : lst) {
				if (isHiddenLst(r)) {
					addHiddenActQty(r);
				}
				else {
					down0().add(r);
				}
			}
		}
		
		protected boolean isHiddenLst(Srch01_RsltR r) {
			if (getCndR().itm_grp_flg1()) {
				if (!isNull(getCndR().itm_grp_cd1())
						&& !isLike(r.itm_grp_cd1(), getCndR().itm_grp_cd1())) {
					return true;
				}
				if (!isNull(getCndR().itm_grp_nm1())
						&& !isLike(r.itm_grp_nm1(), getCndR().itm_grp_nm1())) {
					return true;
				}
			}
			if (getCndR().itm_grp_flg2()) {
				if (!isNull(getCndR().itm_grp_cd2())
						&& !isLike(r.itm_grp_cd2(), getCndR().itm_grp_cd2())) {
					return true;
				}
				if (!isNull(getCndR().itm_grp_nm2())
						&& !isLike(r.itm_grp_nm2(), getCndR().itm_grp_nm2())) {
					return true;
				}
			}
			if (getCndR().itm_grp_flg3()) {
				if (!isNull(getCndR().itm_grp_cd3())
						&& !isLike(r.itm_grp_cd3(), getCndR().itm_grp_cd3())) {
					return true;
				}
				if (!isNull(getCndR().itm_grp_nm3())
						&& !isLike(r.itm_grp_nm3(), getCndR().itm_grp_nm3())) {
					return true;
				}
			}
			if (getCndR().itm_grp_flg4()) {
				if (!isNull(getCndR().itm_grp_cd4())
						&& !isLike(r.itm_grp_cd4(), getCndR().itm_grp_cd4())) {
					return true;
				}
				if (!isNull(getCndR().itm_grp_nm4())
						&& !isLike(r.itm_grp_nm4(), getCndR().itm_grp_nm4())) {
					return true;
				}
			}
			if (getCndR().itm_grp_flg5()) {
				if (!isNull(getCndR().itm_grp_cd5())
						&& !isLike(r.itm_grp_cd5(), getCndR().itm_grp_cd5())) {
					return true;
				}
				if (!isNull(getCndR().itm_grp_nm5())
						&& !isLike(r.itm_grp_nm5(), getCndR().itm_grp_nm5())) {
					return true;
				}
			}
			if (getCndR().itm_grp_flg6()) {
				if (!isNull(getCndR().itm_grp_cd6())
						&& !isLike(r.itm_grp_cd6(), getCndR().itm_grp_cd6())) {
					return true;
				}
				if (!isNull(getCndR().itm_grp_nm6())
						&& !isLike(r.itm_grp_nm6(), getCndR().itm_grp_nm6())) {
					return true;
				}
			}
			if (getCndR().itm_grp_flg7()) {
				if (!isNull(getCndR().itm_grp_cd7())
						&& !isLike(r.itm_grp_cd7(), getCndR().itm_grp_cd7())) {
					return true;
				}
				if (!isNull(getCndR().itm_grp_nm7())
						&& !isLike(r.itm_grp_nm7(), getCndR().itm_grp_nm7())) {
					return true;
				}
			}
			if (getCndR().itm_grp_flg8()) {
				if (!isNull(getCndR().itm_grp_cd8())
						&& !isLike(r.itm_grp_cd8(), getCndR().itm_grp_cd8())) {
					return true;
				}
				if (!isNull(getCndR().itm_grp_nm8())
						&& !isLike(r.itm_grp_nm8(), getCndR().itm_grp_nm8())) {
					return true;
				}
			}
			if (getCndR().itm_grp_flg9()) {
				if (!isNull(getCndR().itm_grp_cd9())
						&& !isLike(r.itm_grp_cd9(), getCndR().itm_grp_cd9())) {
					return true;
				}
				if (!isNull(getCndR().itm_grp_nm9())
						&& !isLike(r.itm_grp_nm9(), getCndR().itm_grp_nm9())) {
					return true;
				}
			}
			if (getCndR().itm_grp_flg10()) {
				if (!isNull(getCndR().itm_grp_cd10())
						&& !isLike(r.itm_grp_cd10(), getCndR().itm_grp_cd10())) {
					return true;
				}
				if (!isNull(getCndR().itm_grp_nm10())
						&& !isLike(r.itm_grp_nm10(), getCndR().itm_grp_nm10())) {
					return true;
				}
			}

			return false;
		}
		
		protected void addHiddenActQty(Srch01_RsltR r) {
			Srch01_LocR locR = getLocR(r.mfg_loc_cd());
			addHiddenActQty(locR.mfg_loc_cd(), locR.cal_cd(), r.mfg_st_dt(),
					r.mfg_end_dt(),  r.rsrc_cd1(),r.rsrc_act_qty1(),
					r.rsrc_dec_place1(), r.rsrc_rnd_typ1());
			addHiddenActQty(locR.mfg_loc_cd(), locR.cal_cd(), r.mfg_st_dt(),
					r.mfg_end_dt(),  r.rsrc_cd2(),r.rsrc_act_qty2(),
					r.rsrc_dec_place2(), r.rsrc_rnd_typ2());
		}
		
		protected void addHiddenActQty(String mfgLocCd, String calCd, MCDate dtFr,
				MCDate dtTo, String rsrcCd, MCNumber actQty, MCNumber decPlace,
				String rndTyp) {
			if (isNullOr(mfgLocCd, dtFr, dtTo, actQty, rsrcCd)) {
				return ;
			}
			
			MCList<Srch01_RsrcLocR> divL = MCList.create(Srch01_RsrcLocR.class);
			MCDate dt = dtFr;
			while (dt.lte(dtTo)) {
				if (isOn(calCd, dt)) {
					Srch01_RsrcLocR divR = Srch01_RsrcLocR.create();
					divR.dt(dt);
					divR.base_qty(MCNumber.ONE);
					divL.add(divR);
				}
				dt = dt.addDay(1);
			}
			
			// 稼働日がない場合
			if (divL.isEmpty()) {
				addHiddenActQty(mfgLocCd, rsrcCd, dtTo, actQty); // 最終日
			}
			// 稼働日がある場合
			else {
				FXUCC_Divide.propNE(divL, actQty, toDecPlace(decPlace),
						Srch01_RsrcLocR.$base_qty,
						Srch01_RsrcLocR.$act_qty);
				for (Srch01_RsrcLocR divR : divL) {
					addHiddenActQty(mfgLocCd, rsrcCd, divR.dt(), divR.act_qty());
				}
			}
		}
		
		protected void addHiddenActQty(String mfgLocCd, String rsrcCd, MCDate dt,
				MCNumber actQty) {
			Srch01_RsrcLocR r = down2().getFirst(_idxRsrcLocL, mfgLocCd, rsrcCd, dt);
			if (!isNull(r)) {
				r.act_qty(MCNumber.sum(r.act_qty(), actQty));
			}
		}
		
		
		/**
		 * 引当予定の取得
		 */
		protected void srchAllocPln() {
			MCQueryPlan sql = null;
			if (MSC_MRP_TYP.isMRP(getCndR().alloc_pln_mrp_typ())) {
				sql = MSBCL0290_MST_ALLOC_PLN_S01();
			}
			else if (MSC_MRP_TYP.isSIM(getCndR().alloc_pln_mrp_typ())) {
				sql = MSBCL0290_MST_SIM_ALLOC_PLN_S01();
			}
			else if (MSC_MRP_TYP.isPRCD(getCndR().alloc_pln_mrp_typ())) {
				sql = MSBCL0290_MST_PRCD_ALLOC_PLN_S01();
			}
			
			if (sql != null) {
				MCList<MSW_IO_SCHD_PR_R> ioSchdPrWkL = MCList.create(MSW_IO_SCHD_PR_R.class);
				for (Srch01_RsltR r : down0().groupBy(Srch01_RsltR.$io_schd_pr_no)) {
					MSW_IO_SCHD_PR_R tmp = MSW_IO_SCHD_PR_R.create();
					tmp.io_schd_pr_no(r.io_schd_pr_no());
					ioSchdPrWkL.add(tmp);
				}
				MSW_IO_SCHD_PR_R S0T = MSW_IO_SCHD_PR_R.create("T");
				execDbWkDelete("MSBCL0290_MSW_IO_SCHD_PR_D01", S0T);
				dbInsert("MSBCL0290_MSW_IO_SCHD_PR_I01", ioSchdPrWkL, MCQueryApiBuilder.create(MSW_IO_SCHD_PR_R.create("T")));
				
				executeQuery(down4(), sql, up0());
			}
		}
		
		
		/**
		 * 休日の取得
		 */
		protected void setMstQty() {
			// 休日の取得
			setMstOffDay();
			
		}
		
		protected void setMstOffDay() {
			for (Srch01_LocR calR : down1().groupBy(Srch01_LocR.$cal_cd)) {
				MCDate dt = _dt_fr;
				while (dt.lt(_dt_to)) {
					if (!isOn(calR.cal_cd(), dt)) {
						Srch01_CalR tmp = Srch01_CalR.create();
						tmp.cal_cd(calR.cal_cd());
						tmp.off_dt(dt);
						down3().add(tmp);
					}
					dt = dt.addDay(1);
				}
			}
		}
		
		protected int toDecPlace(MCNumber num) {
			if (isNull(num)) {
				return 0;
			}
			else {
				return num.intValue();
			}
		}
		
		protected RoundingMode toRoundingMode(String rndTyp) {
			MAC_RND_TYP typ = MAC_RND_TYP.getNE(rndTyp);
			if (typ == null) {
				return MAC_RND_TYP.RNDOFF.toMC();
			}
			else {
				return typ.toMC();
			}
		}
		
		protected void trimLocNoOrder() {
			MCList<Srch01_RsltR> locLst = down0().groupBy(Srch01_RsltR.$mfg_loc_cd);
			MCIndexKey idx = locLst.createIndex(Srch01_RsltR.$mfg_loc_cd);
			
			down1().setAll(down1().subList(r -> !isNull(locLst.getFirst(idx, r.mfg_loc_cd()))));
			down2().setAll(down2().subList(r -> !isNull(locLst.getFirst(idx, r.mfg_loc_cd()))));
		}
	}
	
	
	/**
	 * Chk01オペレーション.<p>
	 *
	 */
	public class Chk01 extends MSBCL_ItmOrdGanttChart_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt(){
			super.doIt();
			if (!hasErr()) {
				// 品目オーダ情報補完
				setOrdInfo();
				
				if (!hasErr()) {
					// オーダ更新前チェック
					callOrdUpdChkSrv();
				}
			}
			// 下り電文の設定
			setDown();
			
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chkEditable());
			msgL.addAll(chkItmOrd());
			return msgL;
		}
		
		protected MCMessageList chkEditable() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			for (Chk01_RsltR r : notErrL) {
				if (!isEditable(r)) {
					msgL.add(new MCMessage(r, Chk01_RsltR.$itm_ord_ld_sts_typ, MSBCL0097,
							r.old_itm_ord_ld_sts_typ(), r.itm_ord_ld_sts_typ()));
					r.err_flg(true);
				}
			}
			return msgL;
		}
		
		protected boolean isEditable(Chk01_RsltR r) {
			if (MSC_ITM_ORD_LD_STS_TYP.isOPN(r.old_itm_ord_ld_sts_typ())
					|| MSC_ITM_ORD_LD_STS_TYP.isSAV(r.old_itm_ord_ld_sts_typ())) {
				if (MSC_ITM_ORD_LD_STS_TYP.isOPN(r.itm_ord_ld_sts_typ())
						|| MSC_ITM_ORD_LD_STS_TYP.isSAV(r.itm_ord_ld_sts_typ())) {
					return true;
				}
			}
			return false;
		}
		
		protected MCMessageList chkItmOrd() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			MCList<Chk01_RsltR> nrmlL = MCList.create(Chk01_RsltR.class);
			for (Chk01_RsltR r : notErrL) {
				if (MSC_ITM_ORD_LD_STS_TYP.is_nrml(r.old_itm_ord_ld_sts_typ())) {
					nrmlL.add(r);
				}
			}
			if (isNull(nrmlL)) {
				return msgL;
			}
			
			MCList<MST_ITM_ORDER_R> selectL = MCList.create(MST_ITM_ORDER_R.class);
			MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			crtNrmlDbc(selectL_bldr, t);
			nrmlL.sort(Chk01_RsltR.$itm_ord_no);
			dbSelectForUpdateNoWait("MSBCL0290_MST_ITM_ORDER_S01", selectL, selectL_bldr, nrmlL);
			
			MCIndexKey idx = selectL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			for (Chk01_RsltR r : nrmlL) {
				MST_ITM_ORDER_R selectR = selectL.getFirst(idx, r.itm_ord_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
				if (selectR != null) {
					// ＤＡＣチェック
					selectR.setAttributes(r);
					msgL.addAll(checkWritableLocCdDac(selectR, MST_ITM_ORDER_R.$strg_loc_cd));
					
					// データ補完
					copyDb2Up(r, selectR);
				}
			}
			
			return msgL;
		}
		
		protected void crtNrmlDbc(
				MCQueryApiBuilder selectL_bldr, MST_ITM_ORDER_R t) {
			selectL_bldr.setWhere(t.itm_ord_no.eq(bind("itm_ord_no")));
			selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());
		}
		
		protected void copyDb2Up(Chk01_RsltR r, MST_ITM_ORDER_R selectR) {
			// 品目オーダ補完処理を呼び出す対象に目印を設定する
			r.ord_sprt_flg(isOrdSprtCall(r, selectR));
			
			// 変更対象項目を設定する
			selectR.mfg_st_schd_dt(r.mfg_st_schd_dt());
			selectR.mfg_end_schd_dt(r.mfg_end_schd_dt());
			selectR.inst_po_cnt_rmrks(r.inst_po_cnt_rmrks());
			selectR.intr_rmrks(r.intr_rmrks());
			selectR.sub_char1(r.sub_char1());
			selectR.sub_char2(r.sub_char2());
			selectR.sub_char3(r.sub_char3());
			
			// 変更対象外項目を上り電文に設定する
			r.ord(selectR);
		}
		protected boolean isOrdSprtCall(Chk01_RsltR r, MST_ITM_ORDER_R selectR) {
			if (!isSame(r.mfg_st_schd_dt(), selectR.mfg_st_schd_dt())
					|| !isSame(r.mfg_end_schd_dt(), selectR.mfg_end_schd_dt())) {
				return true;
			}
			return false;
		}
		
		/**
		 * 品目オーダ補完サービスの呼出
		 */
		protected void setOrdInfo(){
			MCList<Chk01_RsltR> mapperL = up0().subList(r->r.ord_sprt_flg());
			if (!isNull(mapperL)){
				MSBCL_OrdRegService.Ord_Sprt04 ope = MSBCL_OrdRegService.crtOrd_Sprt04();
				addAll(ope.up0(), mapperL, createMap_Ord_Upd01_Dtl1R_Chk01_RsltR_Sprt04());
				ope.exec();
				
				MCJoinKey<MCList<Ord_Upd01_Dtl1R>> jk = mapperL.join(Chk01_RsltR.$peg_no , ope.down0() , Ord_Upd01_Dtl1R.$peg_no);
				join(mapperL,jk, createMap_Chk01_RsltR_Ord_Upd01_Dtl1R_Sprt04());
			}
		}
		
		/**
		 * オーダ更新前チェックサービスの呼出
		 */
		protected void callOrdUpdChkSrv(){

			MSBCL_OrdRegService.Ord_Chk01 ope = MSBCL_OrdRegService.crtOrd_Chk01();
			addAll(ope.up0(), up0(), createMap_Ord_Upd01_Dtl1R_Chk01_RsltR_Chk());
			ope.exec();

			copyErrFlg(up0(), ope.down0());
			
			String[] destCols = new String[]{Chk01_RsltR.$unit_cd, Chk01_RsltR.$lot_mng_typ, Chk01_RsltR.$sublot_mng_typ, Chk01_RsltR.$purc_lt, Chk01_RsltR.$mfg_lt};
			String[] srcCols = new String[]{Ord_Upd01_Dtl1R.$unit_cd, Ord_Upd01_Dtl1R.$lot_mng_typ, Ord_Upd01_Dtl1R.$sublot_mng_typ, Ord_Upd01_Dtl1R.$purc_lt, Ord_Upd01_Dtl1R.$mfg_lt};
			copyByPegNo(up0(), destCols,  ope.down0(), srcCols);
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		/** Chk01_RsltR → Ord_Upd01_Dtl1R */
		protected Map_Ord_Upd01_Dtl1R_Chk01_RsltR_Sprt04<Ord_Upd01_Dtl1R,Chk01_RsltR> createMap_Ord_Upd01_Dtl1R_Chk01_RsltR_Sprt04() {
			return new Map_Ord_Upd01_Dtl1R_Chk01_RsltR_Sprt04<Ord_Upd01_Dtl1R, Chk01_RsltR>();
		}
		public class Map_Ord_Upd01_Dtl1R_Chk01_RsltR_Sprt04<D extends Ord_Upd01_Dtl1R, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_typ, Chk01_RsltR.$itm_ord_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ver_no, Chk01_RsltR.$ver_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_loc_cd, Chk01_RsltR.$strg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_loc_cd, Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sppl_cd, Chk01_RsltR.$sppl_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$maker_cd, Chk01_RsltR.$maker_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_loc_cd, Chk01_RsltR.$rqst_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$bom_ptn, Chk01_RsltR.$bom_ptn);
				addColumnPathMap(Ord_Upd01_Dtl1R.$inst_qty, Chk01_RsltR.$inst_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$yield_schd_qty, Chk01_RsltR.$yield_schd_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_st_schd_dt, Chk01_RsltR.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_end_schd_dt, Chk01_RsltR.$mfg_end_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$master_dt, Chk01_RsltR.$master_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno1, Chk01_RsltR.$sno1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno2, Chk01_RsltR.$sno2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno3, Chk01_RsltR.$sno3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno4, Chk01_RsltR.$sno4);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqmt_no, Chk01_RsltR.$rqmt_no);
			}
			
		}
		
		
		/** Ord_Upd01_Dtl1R → Chk01_RsltR  */
		protected Map_Chk01_RsltR_Ord_Upd01_Dtl1R_Sprt04<Chk01_RsltR,Ord_Upd01_Dtl1R> createMap_Chk01_RsltR_Ord_Upd01_Dtl1R_Sprt04() {
			return new Map_Chk01_RsltR_Ord_Upd01_Dtl1R_Sprt04<Chk01_RsltR, Ord_Upd01_Dtl1R>();
		}
		public class Map_Chk01_RsltR_Ord_Upd01_Dtl1R_Sprt04<D extends Chk01_RsltR, S extends Ord_Upd01_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_RsltR.$err_flg, Ord_Upd01_Dtl1R.$err_flg);
				// 開始予定日、終了予定日は補完サービスの値を使わず、上り電文の値のままとする
				// addColumnPathMap(Chk01_RsltR.$mfg_st_schd_dt, Ord_Upd01_Dtl1R.$mfg_st_schd_dt);
				// addColumnPathMap(Chk01_RsltR.$mfg_end_schd_dt, Ord_Upd01_Dtl1R.$mfg_end_schd_dt);
				addColumnPathMap(Chk01_RsltR.$oper_ptn, Ord_Upd01_Dtl1R.$oper_ptn);
				addColumnPathMap(Chk01_RsltR.$rqst_wg_cd, Ord_Upd01_Dtl1R.$rqst_wg_cd);
				addColumnPathMap(Chk01_RsltR.$inst_qty, Ord_Upd01_Dtl1R.$inst_qty);
				addColumnPathMap(Chk01_RsltR.$yield_schd_qty, Ord_Upd01_Dtl1R.$yield_schd_qty);
				addColumnPathMap(Chk01_RsltR.$nmr_qty, Ord_Upd01_Dtl1R.$nmr_qty);
				addColumnPathMap(Chk01_RsltR.$dnm_qty, Ord_Upd01_Dtl1R.$dnm_qty);
				addColumnPathMap(Chk01_RsltR.$fxd_yield_qty, Ord_Upd01_Dtl1R.$fxd_yield_qty);
				addColumnPathMap(Chk01_RsltR.$itm_ord_sts_typ, Ord_Upd01_Dtl1R.$itm_ord_sts_typ);
				addColumnPathMap(Chk01_RsltR.$po_schd_dt, Ord_Upd01_Dtl1R.$po_schd_dt);
				addColumnPathMap(Chk01_RsltR.$purc_lt, Ord_Upd01_Dtl1R.$purc_lt);
				addColumnPathMap(Chk01_RsltR.$mfg_lt, Ord_Upd01_Dtl1R.$mfg_lt);
				addColumnPathMap(Chk01_RsltR.$gi_schd_dt, Ord_Upd01_Dtl1R.$gi_schd_dt);
				addColumnPathMap(Chk01_RsltR.$strg_schd_dt, Ord_Upd01_Dtl1R.$strg_schd_dt);
				addColumnPathMap(Chk01_RsltR.$xfr_lt, Ord_Upd01_Dtl1R.$xfr_lt);
				addColumnPathMap(Chk01_RsltR.$accpt_schd_dt, Ord_Upd01_Dtl1R.$accpt_schd_dt);
				addColumnPathMap(Chk01_RsltR.$accpt_insp_lt, Ord_Upd01_Dtl1R.$accpt_insp_lt);
				addColumnPathMap(Chk01_RsltR.$insp_st_schd_dt, Ord_Upd01_Dtl1R.$insp_st_schd_dt);
				addColumnPathMap(Chk01_RsltR.$insp_end_schd_dt, Ord_Upd01_Dtl1R.$insp_end_schd_dt);
				addColumnPathMap(Chk01_RsltR.$insp_lt, Ord_Upd01_Dtl1R.$insp_lt);
				addColumnPathMap(Chk01_RsltR.$insp_offst, Ord_Upd01_Dtl1R.$insp_offst);
				addColumnPathMap(Chk01_RsltR.$avl_schd_dt, Ord_Upd01_Dtl1R.$avl_schd_dt);
				addColumnPathMap(Chk01_RsltR.$ord_fix_pd, Ord_Upd01_Dtl1R.$ord_fix_pd);
				addColumnPathMap(Chk01_RsltR.$unit_cd, Ord_Upd01_Dtl1R.$unit_cd);
			}
		}
		
	}
	
	
	/**
	 * Upd01オペレーション.<p>
	 *
	 */
	public class Upd01 extends MSBCL_ItmOrdGanttChart_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// 上り電文の編集
			editUp();
			
			// 更新前チェック
			callThisChk01();
			
			// エラー時は即時終了
			throwUpdErr();

			// オーダ更新サービス実行
			callOrdUpdSrv();
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());
			for (Chk01_RsltR r : up0()) {
				if (r.isStatusModify()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else if (r.isStatusDelete()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					r.setStatus(MCRow.NONE);
				}
			}
		}

		/**
		 * オーダ更新時のチェック処理
		 */
		protected void callThisChk01() {
			MSBCL_ItmOrdGanttChart.Chk01 ope = MSBCL_ItmOrdGanttChart.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
		}
		
		/**
		 * オーダ更新サービスを実行する
		 */
		protected void callOrdUpdSrv() {
			MSBCL_OrdRegService.Ord_Upd01 ope = MSBCL_OrdRegService.crtOrd_Upd01();
			addAll(ope.up0(), up0(), createMap_Ord_Upd01_Dtl1R_Chk01_RsltR_Chk());
			ope.exec();
		}
	}

	/** Chk01_RsltR → Ord_Upd01_Dtl1R  */
	protected Map_Ord_Upd01_Dtl1R_Chk01_RsltR_Chk<Ord_Upd01_Dtl1R,Chk01_RsltR> createMap_Ord_Upd01_Dtl1R_Chk01_RsltR_Chk() {
		return new Map_Ord_Upd01_Dtl1R_Chk01_RsltR_Chk<Ord_Upd01_Dtl1R, Chk01_RsltR>();
	}
	public class Map_Ord_Upd01_Dtl1R_Chk01_RsltR_Chk<D extends Ord_Upd01_Dtl1R, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Chk01_RsltR.$peg_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, Chk01_RsltR.$data_crud_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, Chk01_RsltR.$itm_ord_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_typ, Chk01_RsltR.$itm_ord_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$ord_gnrt_typ, Chk01_RsltR.$ord_gnrt_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_cd, Chk01_RsltR.$itm_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub1, Chk01_RsltR.$itm_sub1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub2, Chk01_RsltR.$itm_sub2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub3, Chk01_RsltR.$itm_sub3);
			addColumnPathMap(Ord_Upd01_Dtl1R.$ver_no, Chk01_RsltR.$ver_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$strg_loc_cd, Chk01_RsltR.$strg_loc_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_loc_cd, Chk01_RsltR.$mfg_loc_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sppl_cd, Chk01_RsltR.$sppl_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$maker_cd, Chk01_RsltR.$maker_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_loc_cd, Chk01_RsltR.$rqst_loc_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_wg_cd, Chk01_RsltR.$rqst_wg_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$bom_ptn, Chk01_RsltR.$bom_ptn);
			addColumnPathMap(Ord_Upd01_Dtl1R.$oper_ptn, Chk01_RsltR.$oper_ptn);
			addColumnPathMap(Ord_Upd01_Dtl1R.$inst_qty, Chk01_RsltR.$inst_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$yield_schd_qty, Chk01_RsltR.$yield_schd_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$nmr_qty, Chk01_RsltR.$nmr_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$dnm_qty, Chk01_RsltR.$dnm_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$fxd_yield_qty, Chk01_RsltR.$fxd_yield_qty);

			addColumnPathMap(Ord_Upd01_Dtl1R.$po_schd_dt, Chk01_RsltR.$po_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$purc_lt, Chk01_RsltR.$purc_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_st_schd_dt, Chk01_RsltR.$mfg_st_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_lt, Chk01_RsltR.$mfg_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_end_schd_dt, Chk01_RsltR.$mfg_end_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$strg_schd_dt, Chk01_RsltR.$strg_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$xfr_lt, Chk01_RsltR.$xfr_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$accpt_schd_dt, Chk01_RsltR.$accpt_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$accpt_insp_lt, Chk01_RsltR.$accpt_insp_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$insp_st_schd_dt, Chk01_RsltR.$insp_st_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$insp_end_schd_dt, Chk01_RsltR.$insp_end_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$insp_lt, Chk01_RsltR.$insp_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$insp_offst, Chk01_RsltR.$insp_offst);
			addColumnPathMap(Ord_Upd01_Dtl1R.$avl_schd_dt, Chk01_RsltR.$avl_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$master_dt, Chk01_RsltR.$master_dt);

			addColumnPathMap(Ord_Upd01_Dtl1R.$sno1, Chk01_RsltR.$sno1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ1, Chk01_RsltR.$sno_typ1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno2, Chk01_RsltR.$sno2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ2, Chk01_RsltR.$sno_typ2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno3, Chk01_RsltR.$sno3);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ3, Chk01_RsltR.$sno_typ3);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno4, Chk01_RsltR.$sno4);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ4, Chk01_RsltR.$sno_typ4);
			addColumnPathMap(Ord_Upd01_Dtl1R.$lmt_dt, Chk01_RsltR.$lmt_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$wg_cd, Chk01_RsltR.$wg_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$ord_fix_pd, Chk01_RsltR.$ord_fix_pd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$rqmt_no, Chk01_RsltR.$rqmt_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$inst_po_cnt_rmrks, Chk01_RsltR.$inst_po_cnt_rmrks);
			addColumnPathMap(Ord_Upd01_Dtl1R.$intr_rmrks, Chk01_RsltR.$intr_rmrks);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sub_char1, Chk01_RsltR.$sub_char1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sub_char2, Chk01_RsltR.$sub_char2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sub_char3, Chk01_RsltR.$sub_char3);
			addColumnPathMap(Ord_Upd01_Dtl1R.$io_schd_pr_no, Chk01_RsltR.$io_schd_pr_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$unit_cd, Chk01_RsltR.$unit_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$not_fix_flg, Chk01_RsltR.$not_fix_flg);
			addColumnPathMap(Ord_Upd01_Dtl1R.$lot_mng_typ, Chk01_RsltR.$lot_mng_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sublot_mng_typ, Chk01_RsltR.$sublot_mng_typ);
		}
		
		@Override
		protected void valueCopy(D dest, S src){
			dest.mrp_typ(MSC_MRP_TYP.MRP.value());
			if (MSC_ITM_ORD_LD_STS_TYP.isOPN(src.itm_ord_ld_sts_typ())){
				dest.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.OPN.value());
			}
			else if (MSC_ITM_ORD_LD_STS_TYP.isSAV(src.itm_ord_ld_sts_typ())){
				dest.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.SAV.value());
			}
			
			dest.oper_ord_pr_flg(true);
			dest.io_schd_pr_flg(true);

		}
	}

	//FMCB CUSTOM END
}