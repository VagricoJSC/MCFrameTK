package mcframe.serverMSBD.MSBDL5040;

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
import java.math.*;
import java.util.*;

import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverMABS.MABSL5020.*;
import mcframe.serverMSBC.MSBCL6120.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverMSBF.MSBFL5010.*;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMSUC.MSUCL0020.MSUCL_ConvQtyAmtUtil.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcUtil_MC extends MSBDL_PurcUtil_MC_A{
	//FMCB CUSTOM START
	protected static final Class<MSBDL_PurcUtil> CLAZZ = MSBDL_PurcUtil.class;
	

	/**
	 * PurcUtil_Srch01オペレーション.<p>
	 *
	 * 各予定日を取得する<br>
	 */
	public class PurcUtil_Srch01 extends MSBDL_PurcUtil_MC_A.PurcUtil_Srch01 {

		protected FXUCL_MCDbcCache<MAM_LOC_R> _locL = null;
		protected MCList<MAM_ITM_DTL_R> _cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);
		MCIndexKey _idxItmDtl = null;
		protected MCList<MAM_PURC_DDLV_LT_R> _cachePurcDdlvLt = MCList.create(MAM_PURC_DDLV_LT_R.class);
		MCIndexKey _idxPurcDdlvLt = null;
		protected FXUCL_MCDbcCacheStEnd<MAM_ITM_DTL_R> _itmDtlL = null;
		protected FXUCL_MCDbcCacheStEnd<MAM_PURC_DDLV_LT_R> _purcDdlvL = null;
		protected FXUCL_MCDbcCache<MAM_LOC_R> _locLDlvBase = null;
		protected MCList<InspSchd_Srch03_CndR> _inspL = null;
		protected MCIndexKey _inspKey;

		protected void initLoc() {
			MAM_BP_R m1 = MAM_BP_R.create("M1");
			MCList<MAM_LOC_R> dbcL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL.addStringColumn("sppl_cal_cd");
			dbcL_bldr.addSelect(m1.sppl_cal_cd);
			dbcL_bldr.addLeftOuterJoin(m1, t.sppl_cd.eq(m1.bp_cd));
			_locL = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL, dbcL_bldr, up0(), PurcUtil_Srch01_DtlR.$mfg_loc_cd);
		}

		protected void initItmDtl() {
			_cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);
			MCList<PurcUtil_Srch01_DtlR> bindL = up0().groupBy(
					PurcUtil_Srch01_DtlR.$itm_cd, PurcUtil_Srch01_DtlR.$itm_sub1,
					PurcUtil_Srch01_DtlR.$itm_sub2, PurcUtil_Srch01_DtlR.$itm_sub3,
					PurcUtil_Srch01_DtlR.$mfg_loc_cd,
					PurcUtil_Srch01_DtlR.$itm_dtl_sppl_cd, PurcUtil_Srch01_DtlR.$maker_cd,
					PurcUtil_Srch01_DtlR.$wg_cd, PurcUtil_Srch01_DtlR.$bom_ptn);
			MAM_ITM_DTL_R cacheItmDtl_t = MAM_ITM_DTL_R.create("T");
			MCQueryApiBuilder cacheItmDtl_bldr = MCQueryApiBuilder.create(cacheItmDtl_t);
			cacheItmDtl_bldr.setWhere(cacheItmDtl_t.itm_cd.eq(bind("itm_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.itm_sub1.eq(bind("itm_sub1")));
			cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.itm_sub2.eq(bind("itm_sub2")));
			cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.itm_sub3.eq(bind("itm_sub3")));
			cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.mfg_loc_cd.eq(bind("mfg_loc_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.sppl_cd.eq(bind("itm_dtl_sppl_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.maker_cd.eq(bind("maker_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.wg_cd.eq(bind("wg_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.bom_ptn.eq(bind("bom_ptn")));
			dbSelect("MSBDL5040_MAM_ITM_DTL_S01", _cacheItmDtl, cacheItmDtl_bldr, bindL);
			_idxItmDtl = _cacheItmDtl.createIndex(MAM_ITM_DTL_R.$itm_cd,
					MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2,
					MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$mfg_loc_cd,
					MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$maker_cd, MAM_ITM_DTL_R.$wg_cd,
					MAM_ITM_DTL_R.$bom_ptn);
		}

		protected void initPurcDdlvLt() {
			_cachePurcDdlvLt = MCList.create(MAM_PURC_DDLV_LT_R.class);
			MCList<PurcUtil_Srch01_DtlR> bindL = up0().groupBy(
					PurcUtil_Srch01_DtlR.$sppl_cd, PurcUtil_Srch01_DtlR.$lg_grp_cd,
					PurcUtil_Srch01_DtlR.$itm_cd, PurcUtil_Srch01_DtlR.$itm_sub1,
					PurcUtil_Srch01_DtlR.$itm_sub2, PurcUtil_Srch01_DtlR.$itm_sub3);
			MAM_PURC_DDLV_LT_R cachePurcDdlvLt_t = MAM_PURC_DDLV_LT_R.create("T");
			MCQueryApiBuilder cachePurcDdlvLt_bldr = MCQueryApiBuilder.create(cachePurcDdlvLt_t);
			cachePurcDdlvLt_bldr.setWhere(cachePurcDdlvLt_t.sppl_cd.eq(bind("sppl_cd")));
			cachePurcDdlvLt_bldr.addWhereWithAnd(cachePurcDdlvLt_t.lg_grp_cd.eq(bind("lg_grp_cd")));
			cachePurcDdlvLt_bldr.addWhereWithAnd(cachePurcDdlvLt_t.itm_cd.eq(bind("itm_cd")));
			cachePurcDdlvLt_bldr.addWhereWithAnd(cachePurcDdlvLt_t.itm_sub1.eq(bind("itm_sub1")));
			cachePurcDdlvLt_bldr.addWhereWithAnd(cachePurcDdlvLt_t.itm_sub2.eq(bind("itm_sub2")));
			cachePurcDdlvLt_bldr.addWhereWithAnd(cachePurcDdlvLt_t.itm_sub3.eq(bind("itm_sub3")));
			dbSelect("MSBDL5040_MAM_PURC_DDLV_LT_S01", _cachePurcDdlvLt, cachePurcDdlvLt_bldr, bindL);
			_idxPurcDdlvLt = _cachePurcDdlvLt.createIndex(MAM_PURC_DDLV_LT_R.$sppl_cd,
					MAM_PURC_DDLV_LT_R.$lg_grp_cd, MAM_PURC_DDLV_LT_R.$itm_cd,
					MAM_PURC_DDLV_LT_R.$itm_sub1, MAM_PURC_DDLV_LT_R.$itm_sub2,
					MAM_PURC_DDLV_LT_R.$itm_sub3);
		}

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			String sysParm = getSysParm("MASTER_DT_BASE");
			if (!isNullOrNullVal(sysParm) && isSame(sysParm , "1")) {
				// 納期ベースの計算の場合
				initMasterDataDlvBase();
				calcDateDlvBase();
			} else {
				// 着手日ベースの計算の場合
				initMasterData();
				calcDate();
			}
			setDown();
		}
		
		protected void editUp() {
			for (PurcUtil_Srch01_DtlR r : up0()) {
				if (isNullOrNullVal(r.mfg_loc_cd())) {
					// 購買品
					r.itm_dtl_sppl_cd(r.sppl_cd());
					
				}
				else {
					// 外注品
					r.itm_dtl_sppl_cd(MAC_STR.NULL_VAL.value());
					r.maker_cd(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.base_unit_qty())) {
					r.base_unit_qty(MCNumber.ZERO);
				}
				if (isNull(r.bom_ptn())) {
					r.bom_ptn(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.mfg_loc_cd())) {
					r.mfg_loc_cd(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.maker_cd())) {
					r.maker_cd(MAC_STR.NULL_VAL.value());
				}
			}
		}

		protected void initMasterData() {
			initLoc();
			initItmDtl();
			initPurcDdlvLt();
		}

		protected void initMasterDataDlvBase() {
			initItmDtlCache();
			initPurcDdlvCache();
			initLoc();
			initInsp();
		}
		protected void initItmDtlCache() {
			up0().setString(PurcUtil_Srch01_DtlR.$rqst_loc_cd, MAC_STR.NULL_VAL.value());
			MAM_ITM_DTL_R ItmDtl_t = MAM_ITM_DTL_R.create("T");
			MAM_LOC_R loc = MAM_LOC_R.create("LOC");
			MCQueryApiBuilder ItmDtl_bldr = MCQueryApiBuilder.create(ItmDtl_t);
			ItmDtl_bldr.addSelect(loc.sppl_cd.as("mfg_loc_sppl_cd"));
			ItmDtl_bldr.addLeftOuterJoin(loc, loc.loc_cd.eq(ItmDtl_t.mfg_loc_cd));

			_itmDtlL = new FXUCL_MCDbcCacheStEnd<MAM_ITM_DTL_R>(ItmDtl_bldr, up0(),
					new String[] { PurcUtil_Srch01_DtlR.$itm_cd, PurcUtil_Srch01_DtlR.$itm_sub1, PurcUtil_Srch01_DtlR.$itm_sub2, PurcUtil_Srch01_DtlR.$itm_sub3,
							PurcUtil_Srch01_DtlR.$mfg_loc_cd, PurcUtil_Srch01_DtlR.$itm_dtl_sppl_cd, PurcUtil_Srch01_DtlR.$maker_cd, PurcUtil_Srch01_DtlR.$rqst_loc_cd,
							PurcUtil_Srch01_DtlR.$wg_cd, PurcUtil_Srch01_DtlR.$bom_ptn });
		}
		protected void initPurcDdlvCache() {
			MAM_PURC_DDLV_LT_R PurcDdlvLt_t = MAM_PURC_DDLV_LT_R.create("T");
			MCQueryApiBuilder PurcDdlvLt_bldr = MCQueryApiBuilder.create(PurcDdlvLt_t);

			_purcDdlvL = new FXUCL_MCDbcCacheStEnd<MAM_PURC_DDLV_LT_R>(PurcDdlvLt_bldr, up0(), new String[] { PurcUtil_Srch01_DtlR.$sppl_cd, PurcUtil_Srch01_DtlR.$lg_grp_cd, PurcUtil_Srch01_DtlR.$itm_cd,
					PurcUtil_Srch01_DtlR.$itm_sub1, PurcUtil_Srch01_DtlR.$itm_sub2, PurcUtil_Srch01_DtlR.$itm_sub3 });

		}
		protected void initInsp() {
			MSBFL_InspSchdService.InspSchd_Srch03 ope = MSBFL_InspSchdService.crtInspSchd_Srch03();
			addAll(ope.up0(), up0(), createMap_InspSchd_Srch03_CndR_PurcUtil_Srch01_DtlR());
			ope.exec();
			_inspL = ope.down0();
			_inspKey = _inspL.createIndex(InspSchd_Srch03_CndR.$peg_no);
		}
		protected Map_InspSchd_Srch03_CndR_PurcUtil_Srch01_DtlR<InspSchd_Srch03_CndR, PurcUtil_Srch01_DtlR> createMap_InspSchd_Srch03_CndR_PurcUtil_Srch01_DtlR() {
			return new Map_InspSchd_Srch03_CndR_PurcUtil_Srch01_DtlR<InspSchd_Srch03_CndR, PurcUtil_Srch01_DtlR>();
		}

		public class Map_InspSchd_Srch03_CndR_PurcUtil_Srch01_DtlR<D extends InspSchd_Srch03_CndR, S extends PurcUtil_Srch01_DtlR> extends
				MCRowMapper<D, S> {

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
				if (!isNullOrNullVal(src.mfg_loc_cd())) {
					MAM_LOC_R locR = _locL.get(src.mfg_loc_cd());
					dest.sppl_cd(locR.sppl_cd());
				}
				else {
					dest.sppl_cd(src.sppl_cd());
				}
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch03_CndR.$peg_no, PurcUtil_Srch01_DtlR.$peg_no);
				addColumnPathMap(InspSchd_Srch03_CndR.$itm_cd, PurcUtil_Srch01_DtlR.$itm_cd);
				addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub1, PurcUtil_Srch01_DtlR.$itm_sub1);
				addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub2, PurcUtil_Srch01_DtlR.$itm_sub2);
				addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub3, PurcUtil_Srch01_DtlR.$itm_sub3);
				addColumnPathMap(InspSchd_Srch03_CndR.$mfg_loc_cd, PurcUtil_Srch01_DtlR.$mfg_loc_cd);
				addColumnPathMap(InspSchd_Srch03_CndR.$maker_cd, PurcUtil_Srch01_DtlR.$maker_cd);
				addColumnPathMap(InspSchd_Srch03_CndR.$schd_gr_dt, PurcUtil_Srch01_DtlR.$dlv_rqst_dt);
				addColumnPathMap(InspSchd_Srch03_CndR.$to_loc_cd, PurcUtil_Srch01_DtlR.$in_to_loc_cd);
			}
		}
		/**
		 *上り電文の依頼元納入希望日、納入希望日、発注予定日、仕入予定日のうち、値が設定されていた日付をもとにして他の日付を計算する。
		 *2つ以上の日付に値が設定されていても（想定外）、以下の優先順で最初に設定された日付をもとにした計算のみ実施する。<BR>
		 *パターン１．依頼元納入希望日から納入希望日、発注予定日、仕入予定日を計算<BR>
		 *パターン２．納入希望日から発注予定日、仕入予定日を計算<BR>
		 *パターン３．発注予定日から納入希望日、仕入予定日を計算<BR>
		 *パターン４．仕入予定日から納入希望日、発注予定日を計算<BR>
		 */
		protected void calcDateDlvBase() {
			for (PurcUtil_Srch01_DtlR upR : up0()) {
				upR.in_to_loc_cal_cd(nvl(upR.in_to_loc_cal_cd(), getCo().std_cal_cd()));
				if (isNull(upR.base_dt())) {
					setBaseDtDlvBase(upR);
				}
				// 品目詳細
				MAM_ITM_DTL_R itmDtlR = getItmDtlR(upR);
				// 仕入直送ＬＴ
				MAM_PURC_DDLV_LT_R purcDdlvR = MAM_PURC_DDLV_LT_R.create();
				if (isDdlv(upR) || upR.prov_ddlv_flg()) {
					purcDdlvR = getPurcDdlvR(upR);	
				}
				String calCd = isNullOrNullVal(upR.mfg_loc_cd()) ? upR.sppl_cal_cd() : _locL.get(upR.mfg_loc_cd()).getStringNE("sppl_cal_cd");
				//パターン１
				if (!isNull(upR.rqst_dlv_rqst_dt())) {
					if (isDdlv(upR)) {
						upR.dlv_rqst_dt(upR.rqst_dlv_rqst_dt());
						upR.po_schd_dt(getCalDate(upR.rqst_dlv_rqst_dt(), getPurcLt(purcDdlvR, itmDtlR, upR.dlv_cd(), upR.prov_ddlv_flg(), upR.base_unit_qty()).negate(), false, calCd, false));
						upR.purc_schd_dt(upR.rqst_dlv_rqst_dt());
					}
					//それ以外
					else {
						MCNumber accptLt = getAccptLt(upR);
						setSchdDt(upR, accptLt, true);
						upR.po_schd_dt(getCalDate(upR.dlv_rqst_dt(), getPurcLt(purcDdlvR, itmDtlR, upR.dlv_cd(), upR.prov_ddlv_flg(), upR.base_unit_qty()).negate(), false, calCd, false));
					}
					upR.po_schd_dt(getCalDateLoc(upR.po_schd_dt(), MCNumber.ZERO, false, upR.in_to_loc_cd(), false));

				}
				//パターン２
				else if (!isNull(upR.dlv_rqst_dt())) {
					if (isDdlv(upR)) {
						upR.po_schd_dt(getCalDate(upR.dlv_rqst_dt(), getPurcLt(purcDdlvR, itmDtlR, upR.dlv_cd(), upR.prov_ddlv_flg(), upR.base_unit_qty()).negate(), false, calCd, false));
						upR.purc_schd_dt(upR.dlv_rqst_dt());
					}
					else {
						MCNumber accptLt = getAccptLt(upR);
						MCNumber inspLt = getInspLt(upR);
						upR.rqst_dlv_rqst_dt(getCalDate(upR.dlv_rqst_dt(), MCNumber.max(accptLt, inspLt), false, upR.in_to_loc_cal_cd(), false));
						upR.po_schd_dt(getCalDate(upR.dlv_rqst_dt(), getPurcLt(purcDdlvR, itmDtlR, upR.dlv_cd(), upR.prov_ddlv_flg(), upR.base_unit_qty()).negate(), false, calCd, false));
						upR.purc_schd_dt(getCalDateLoc(upR.dlv_rqst_dt(), accptLt, true, upR.in_to_loc_cd(), false));
					}
					upR.po_schd_dt(getCalDateLoc(upR.po_schd_dt(), MCNumber.ZERO, false, upR.in_to_loc_cd(), false));
				}
				//パターン３
				else if (!isNull(upR.po_schd_dt())) {
					if (isDdlv(upR)) {
						upR.dlv_rqst_dt(getCalDate(upR.po_schd_dt(), getPurcLt(purcDdlvR, itmDtlR, upR.dlv_cd(), upR.prov_ddlv_flg(), upR.base_unit_qty()), true, upR.dlv_cal_cd(), false));
						upR.purc_schd_dt(upR.dlv_rqst_dt());
					}
					else {
						MCNumber accptLt = getAccptLt(upR);
						upR.dlv_rqst_dt(getCalDate(upR.po_schd_dt(), getPurcLt(purcDdlvR, itmDtlR, upR.dlv_cd(), upR.prov_ddlv_flg(), upR.base_unit_qty()), true, upR.in_to_loc_cal_cd(), false));
						MCNumber inspLt = getInspLt(upR);
						upR.rqst_dlv_rqst_dt(getCalDate(upR.dlv_rqst_dt(), MCNumber.max(accptLt, inspLt), false, upR.in_to_loc_cal_cd(), false));
						upR.purc_schd_dt(getCalDateLoc(upR.dlv_rqst_dt(), accptLt, true, upR.in_to_loc_cd(), false));
					}
				}
				//パターン４
				else if (!isNull(upR.purc_schd_dt())) {
					if (isDdlv(upR)) {
						upR.dlv_rqst_dt(upR.purc_schd_dt());
						upR.po_schd_dt(getCalDate(upR.dlv_rqst_dt(), getPurcLt(purcDdlvR, itmDtlR, upR.dlv_cd(), upR.prov_ddlv_flg(), upR.base_unit_qty()).negate(), false, calCd, false));
					}
					else {
						upR.dlv_rqst_dt(getCalDate(upR.purc_schd_dt(), getAccptLt(upR).negate(), false, upR.in_to_loc_cal_cd(), false));
						upR.po_schd_dt(getCalDate(upR.dlv_rqst_dt(), getPurcLt(purcDdlvR, itmDtlR, upR.dlv_cd(), upR.prov_ddlv_flg(), upR.base_unit_qty()).negate(), false, calCd, false));
					}
					upR.po_schd_dt(getCalDateLoc(upR.po_schd_dt(), MCNumber.ZERO, false, upR.in_to_loc_cd(), false));
				}
			}
		}
		protected void setBaseDtDlvBase(PurcUtil_Srch01_DtlR upR) {
			if (!isNull(upR.rqst_dlv_rqst_dt())) {
				upR.base_dt(upR.rqst_dlv_rqst_dt());
				return;
			}
			if (isDdlv(upR) && !isNull(upR.dlv_rqst_dt())) {
				upR.rqst_dlv_rqst_dt(upR.dlv_rqst_dt());
				upR.base_dt(upR.dlv_rqst_dt());
				return;
			}
			MCList<MAM_ITM_DTL_R> itmDtlL = _itmDtlL.getCache(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3(), upR.mfg_loc_cd(), upR.itm_dtl_sppl_cd(), upR.maker_cd(), upR.rqst_loc_cd(),
					upR.wg_cd(), upR.bom_ptn());
			MCSortPolicy sp = new MCSortPolicy(MCList.SortType.DESC,
					MAM_ITM_DTL_R.$st_dt);
			itmDtlL.sort(sp);
			MCNumber inspLt = getInspLt(upR);
			for (MAM_ITM_DTL_R itmDtlR : itmDtlL) {
				MCNumber accptLt =  itmDtlR.accpt_insp_lt();
				MCDate rqst_dlv_rqst_dt = getCalDate(upR.dlv_rqst_dt(), MCNumber.max(accptLt, inspLt), false, upR.in_to_loc_cal_cd(), false);
				if (checkMstDtDlvBase(rqst_dlv_rqst_dt, itmDtlR)) {
					upR.rqst_dlv_rqst_dt(rqst_dlv_rqst_dt);
					upR.base_dt(rqst_dlv_rqst_dt);
					return;
				}
			}
		}
		protected boolean checkMstDtDlvBase(MCDate rqstDlvRqstDt, MAM_ITM_DTL_R itmDtlR) {
			if (itmDtlR.st_dt().gt(rqstDlvRqstDt) || itmDtlR.end_dt().lt(rqstDlvRqstDt)) {
				return false;
			}
			return true;
		}
		protected MAM_ITM_DTL_R getItmDtlR(PurcUtil_Srch01_DtlR upR) {
			MAM_ITM_DTL_R itmDtlR = _itmDtlL.get(upR.base_dt(), upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3(), upR.mfg_loc_cd(), upR.itm_dtl_sppl_cd(), upR.maker_cd(), upR.rqst_loc_cd(),
					upR.wg_cd(), upR.bom_ptn());
			if (!MAC_STR.isNULL_VAL(itmDtlR.mfg_loc_cd())
					&& isNull(itmDtlR.getStringNE("mfg_loc_sppl_cd"))) {
				return MAM_ITM_DTL_R.create();
			}
			return itmDtlR;
		}

		protected MAM_PURC_DDLV_LT_R getPurcDdlvR(PurcUtil_Srch01_DtlR upR) {
			return _purcDdlvL.get(upR.base_dt(), upR.sppl_cd(), upR.lg_grp_cd(), upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3());
		}
		protected MCNumber getAccptLt(PurcUtil_Srch01_DtlR upR) {
			MAM_ITM_DTL_R itmDtlR = getItmDtlR(upR);
			return itmDtlR.isEmpty() ? MCNumber.ZERO : isNull(itmDtlR.accpt_insp_lt()) ? MCNumber.ZERO : itmDtlR.accpt_insp_lt();
		}
		protected MCNumber getInspLt(PurcUtil_Srch01_DtlR upR) {
			InspSchd_Srch03_CndR inspR = _inspL.getFirst(_inspKey, upR.peg_no());

			if (isNullOr(inspR, inspR.schd_gr_dt(), inspR.st_dt())) {
				return MCNumber.ZERO;
			}
			MCNumber inspOffst = getCalDays(inspR.schd_gr_dt(), inspR.st_dt(), upR.in_to_loc_cal_cd()).subtract(MCNumber.ONE);
			MCNumber inspLt = getCalDays(inspR.st_dt(), inspR.end_dt(), upR.in_to_loc_cal_cd()).subtract(MCNumber.ONE);
			return inspLt.add(inspOffst);
		}
		protected MCList<MAM_ITM_DTL_R> getItmDtlL(PurcUtil_Srch01_DtlR upR) {
			MCList<MAM_ITM_DTL_R> itmDtlL = _cacheItmDtl.subList(_idxItmDtl,
					upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3(),
					upR.mfg_loc_cd(), upR.itm_dtl_sppl_cd(), upR.maker_cd(), upR.wg_cd(),
					upR.bom_ptn());
			MCSortPolicy sp = new MCSortPolicy(MCList.SortType.DESC,
					MAM_ITM_DTL_R.$st_dt);
			itmDtlL.sort(sp);
			return itmDtlL;
		}

		protected MCList<MAM_PURC_DDLV_LT_R> getPurcDdlvLtL(PurcUtil_Srch01_DtlR upR) {
			MCList<MAM_PURC_DDLV_LT_R> purcDdlvLtL = _cachePurcDdlvLt.subList(_idxPurcDdlvLt,
					upR.sppl_cd(), upR.lg_grp_cd(), upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3());
			MCSortPolicy sp = new MCSortPolicy(MCList.SortType.DESC,
					MAM_PURC_DDLV_LT_R.$st_dt);
			purcDdlvLtL.sort(sp);
			return purcDdlvLtL;
		}

		/**
		 * 仕入直送か
		 */
		protected boolean isDdlv(PurcUtil_Srch01_DtlR upR) {
			return !isNull(upR.dlv_cd());
		}

		protected void calcDate() {
			for (PurcUtil_Srch01_DtlR upR : up0()) {
				upR.in_to_loc_cal_cd(nvl(upR.in_to_loc_cal_cd(), getCo().std_cal_cd()));
				String calCd = isNullOrNullVal(upR.mfg_loc_cd()) ? upR.sppl_cal_cd() : _locL.get(upR.mfg_loc_cd()).getStringNE("sppl_cal_cd");
				MCList<MAM_ITM_DTL_R> itmDtlL = getItmDtlL(upR);
				MCList<MAM_PURC_DDLV_LT_R> purcDdlvLtL = MCList.create(MAM_PURC_DDLV_LT_R.class);
				if (isDdlv(upR) || upR.prov_ddlv_flg()) {
					purcDdlvLtL = getPurcDdlvLtL(upR);
				}
				boolean setFlg = false;
				loop: for (MAM_ITM_DTL_R itmDtlR : itmDtlL) {
					if (purcDdlvLtL.isEmpty()) {
						if (setCalcDate(upR, itmDtlR, MAM_PURC_DDLV_LT_R.create(), calCd)) {
							setFlg = true;
							break loop;
						}
					}
					else {
						for (MAM_PURC_DDLV_LT_R purcDdlvLtR : purcDdlvLtL) {
							if (setCalcDate(upR, itmDtlR, purcDdlvLtR, calCd)) {
								setFlg = true;
								break loop;
							}
						}
					}
				}
				//対象となるマスタが無かった場合はマスタを参照せず（購入ＬＴ＝０）に日付を設定
				if (!setFlg) {
					setCalcDateMain(upR, MAM_ITM_DTL_R.create(), MAM_PURC_DDLV_LT_R.create(), calCd);
					upR.err_flg(true);
				}
			}
		}

		protected boolean setCalcDate(PurcUtil_Srch01_DtlR upR, MAM_ITM_DTL_R itmDtlR, MAM_PURC_DDLV_LT_R purcDdlvLtR, String calCd) {
			//パタン３のとき発注予定日は決まっているので、先にマスタの適用日チェックを行いＯＫならupRに直接設定
			if (isNullAnd(upR.rqst_dlv_rqst_dt(), upR.dlv_rqst_dt()) && !isNull(upR.po_schd_dt())) {
				if (!checkMstDt(upR.po_schd_dt(), itmDtlR, purcDdlvLtR)) {
					return false;
				}
				setCalcDateMain(upR, itmDtlR, purcDdlvLtR, calCd);
				return true;
			}

			//クローン行に計算した日付を仮設定
			PurcUtil_Srch01_DtlR tmpUpR = upR.clone();
			setCalcDateMain(tmpUpR, itmDtlR, purcDdlvLtR, calCd);

			//取得した発注予定日がマスタの適用日に含まれるかチェック
			MCDate poSchdDt = tmpUpR.po_schd_dt();
			if (!checkMstDt(poSchdDt, itmDtlR, purcDdlvLtR)) {
				return false;
			}

			//チェックがＯＫならクローン行から各日付を設定
			upR.rqst_dlv_rqst_dt(tmpUpR.rqst_dlv_rqst_dt());
			upR.dlv_rqst_dt(tmpUpR.dlv_rqst_dt());
			upR.po_schd_dt(poSchdDt);
			upR.purc_schd_dt(tmpUpR.purc_schd_dt());

			return true;
		}

		/**
		 *発注予定日がマスタの適用日に含まれるかチェック
		 */
		protected boolean checkMstDt(MCDate poSchdDt, MAM_ITM_DTL_R itmDtlR, MAM_PURC_DDLV_LT_R purcDdlvLtR) {
			if (itmDtlR.st_dt().gt(poSchdDt) || itmDtlR.end_dt().lt(poSchdDt)) {
				return false;
			}
			if (!purcDdlvLtR.isEmpty() && (purcDdlvLtR.st_dt().gt(poSchdDt) || purcDdlvLtR.end_dt().lt(poSchdDt))) {
				return false;
			}
			return true;
		}

		/**
		 *上り電文の依頼元納入希望日、納入希望日、発注予定日、仕入予定日のうち、値が設定されていた日付をもとにして他の日付を計算する。
		 *2つ以上の日付に値が設定されていても（想定外）、以下の優先順で最初に設定された日付をもとにした計算のみ実施する。<BR>
		 *パターン１．依頼元納入希望日から納入希望日、発注予定日、仕入予定日を計算<BR>
		 *パターン２．納入希望日から発注予定日、仕入予定日を計算<BR>
		 *パターン３．発注予定日から納入希望日、仕入予定日を計算<BR>
		 *パターン４．仕入予定日から納入希望日、発注予定日を計算<BR>
		 */
		protected void setCalcDateMain(PurcUtil_Srch01_DtlR upR, MAM_ITM_DTL_R itmDtlR, MAM_PURC_DDLV_LT_R purcDdlvLtR, String calCd) {
			MCNumber purcLt = getPurcLt(purcDdlvLtR, itmDtlR, upR.dlv_cd(), upR.prov_ddlv_flg(), upR.base_unit_qty());

			//パターン１
			if (!isNull(upR.rqst_dlv_rqst_dt())) {
				if (isDdlv(upR)) {
					upR.dlv_rqst_dt(upR.rqst_dlv_rqst_dt());
					upR.purc_schd_dt(upR.rqst_dlv_rqst_dt());
				}
				else {
					setSchdDt(upR, getAccptLt(itmDtlR), true);
				}
				upR.po_schd_dt(getCalDate(upR.dlv_rqst_dt(), purcLt.negate(), false, calCd, false));
				upR.po_schd_dt(getCalDate(upR.po_schd_dt(), MCNumber.ZERO, false, upR.in_to_loc_cal_cd(), false));
			}
			//パターン２
			else if (!isNull(upR.dlv_rqst_dt())) {
				if (isDdlv(upR)) {
					upR.purc_schd_dt(upR.dlv_rqst_dt());
				}
				else {
					setSchdDt(upR, getAccptLt(itmDtlR), false);
				}
				upR.po_schd_dt(getCalDate(upR.dlv_rqst_dt(), purcLt.negate(), false, calCd, false));
				upR.po_schd_dt(getCalDate(upR.po_schd_dt(), MCNumber.ZERO, false, upR.in_to_loc_cal_cd(), false));
			}
			//パターン３
			else if (!isNull(upR.po_schd_dt())) {
				if (isDdlv(upR)) {
					upR.dlv_rqst_dt(getCalDate(upR.po_schd_dt(), purcLt, true, calCd, false));
					upR.dlv_rqst_dt(getCalDate(upR.dlv_rqst_dt(), MCNumber.ZERO, true, upR.dlv_cal_cd(), false));
					upR.purc_schd_dt(upR.dlv_rqst_dt());
				}
				else {
					upR.dlv_rqst_dt(getCalDate(upR.po_schd_dt(), purcLt, true, calCd, false));
					upR.dlv_rqst_dt(getCalDate(upR.dlv_rqst_dt(), MCNumber.ZERO, true, upR.in_to_loc_cal_cd(), false));
					// 納入希望日がセットされてから実行
					setSchdDt(upR, getAccptLt(itmDtlR), false);
				}
			}
			//パターン４
			else if (!isNull(upR.purc_schd_dt())) {
				if (isDdlv(upR)) {
					upR.dlv_rqst_dt(upR.purc_schd_dt());
				}
				else {
					upR.dlv_rqst_dt(getCalDate(upR.purc_schd_dt(), getAccptLt(itmDtlR).negate(), false, upR.in_to_loc_cal_cd(), false));
				}
				upR.po_schd_dt(getCalDate(upR.dlv_rqst_dt(), purcLt.negate(), false, calCd, false));
				upR.po_schd_dt(getCalDate(upR.po_schd_dt(), MCNumber.ZERO, false, upR.in_to_loc_cal_cd(), false));
			}
		}

		protected MCNumber getAccptLt(MAM_ITM_DTL_R itmDtlR) {
			return itmDtlR.isEmpty() ? MCNumber.ZERO : isNull(itmDtlR.accpt_insp_lt()) ? MCNumber.ZERO : itmDtlR.accpt_insp_lt();
		}

		/**
		 *検査予定登録サービスで予定日を計算してupRに設定する<br>
		 *reverseFlg＝オフ：納入希望日から依頼元納入希望日を求めて設定（パタン２，３）<br>
		 *reverseFlg＝オン：依頼元納入希望日から納入希望日を求めて設定（パタン１）<br>
		 *共通：納入希望日から仕入予定日を求めて設定
		 */
		protected void setSchdDt(PurcUtil_Srch01_DtlR upR, MCNumber accptLt, boolean reverseFlg) {
			MSBFL_InspSchdService.InspSchd_Srch01 ope = MSBFL_InspSchdService.crtInspSchd_Srch01();
			InspSchd_Srch01_CndR row = InspSchd_Srch01_CndR.create();
			row.peg_no(upR.peg_no());
			row.itm_cd(upR.itm_cd());
			row.itm_sub1(upR.itm_sub1());
			row.itm_sub2(upR.itm_sub2());
			row.itm_sub3(upR.itm_sub3());
			row.mfg_loc_cd(upR.mfg_loc_cd());
			row.sppl_cd(upR.sppl_cd());
			row.maker_cd(upR.maker_cd());
			row.to_site_cd(upR.site_cd());
			row.to_loc_cd(upR.in_to_loc_cd());
			row.insp_typ(MSC_INSP_TYP.ACCPT.value());
			row.accpt_insp_lt(accptLt);
			if (reverseFlg) {
				row.avl_schd_dt(upR.rqst_dlv_rqst_dt());
			}
			else {
				row.base_dt(upR.dlv_rqst_dt());
			}
			ope.up0().add(row);
			ope.exec();

			if (reverseFlg) {
				if (ope.down0().isEmpty()) {
					upR.dlv_rqst_dt(getCalDate(upR.rqst_dlv_rqst_dt(), MCNumber.max(accptLt, MCNumber.ZERO).negate(), false, upR.in_to_loc_cal_cd(), false));
				}
				else {
					upR.dlv_rqst_dt(ope.down0().get(0).strg_schd_dt());
				}
				upR.purc_schd_dt(getCalDate(upR.dlv_rqst_dt(), accptLt, true, upR.in_to_loc_cal_cd(), false));
			}
			else {
				upR.purc_schd_dt(getCalDate(upR.dlv_rqst_dt(), accptLt, true, upR.in_to_loc_cal_cd(), false));

				if (ope.down0().isEmpty()) {
					upR.rqst_dlv_rqst_dt(getCalDate(upR.dlv_rqst_dt(), MCNumber.max(accptLt, MCNumber.ZERO), true, upR.in_to_loc_cal_cd(), false));
				}
				else {
					InspSchd_Srch01_CndR downR = ope.down0().get(0);
					MCDate inspEndDt;
					if (downR.in_prmt_insp_flg()) {
						//検査中ロット使用許可ＦＬＧ＝オンのとき、検査オフセットも検査ＬＴも０とする
						inspEndDt = getCalDate(upR.dlv_rqst_dt(), MCNumber.ZERO, true, upR.in_to_loc_cal_cd(), false);
					}
					else {
						//検査オフセット（製造検査以外でマスタ値が正のときは０とする）（要符号反転）
						MCNumber inspOffst = MCNumber.min(nvl(downR.insp_offst(), MCNumber.ZERO), MCNumber.ZERO).negate();
						//検査ＬＴ
						MCNumber inspLt = nvl(downR.insp_lt(), MCNumber.ZERO);
						//検査終了日
						MCDate inspStDt = getCalDate(upR.dlv_rqst_dt(), inspOffst, true, upR.in_to_loc_cal_cd(), false);
						inspEndDt = getCalDate(inspStDt, inspLt, true, upR.in_to_loc_cal_cd(), false);
					}
					//検収予定日（＝仕入予定日）
					MCDate accptDt = upR.purc_schd_dt();
					//大きいほうをセット
					upR.rqst_dlv_rqst_dt(inspEndDt.gt(accptDt) ? inspEndDt : accptDt);
				}
			}
		}

		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * 購入ＬＴ取得
	 * @param purcDdlvR 対応する仕入直送ＬＴマスタレコード
	 * @param itmDtlR 対応する品目詳細マスタレコード
	 * @param dlvCd 納品先
	 * @param provDdlvFlg 支給直送
	 * @param baseUnitQty 基準単位数
	 * @return
	 */
	public static MCNumber getPurcLt(MAM_PURC_DDLV_LT_R purcDdlvR, MAM_ITM_DTL_R itmDtlR, String dlvCd, boolean provDdlvFlg, MCNumber baseUnitQty) {
		return object(CLAZZ)._getPurcLt(purcDdlvR, itmDtlR, dlvCd, provDdlvFlg, baseUnitQty);
	}
	/**
	 * 購入ＬＴ取得
	 * @param purcDdlvR 対応する仕入直送ＬＴマスタレコード
	 * @param itmDtlR 対応する品目詳細マスタレコード
	 * @param dlvCd 納品先
	 * @param provDdlvFlg 支給直送
	 * @param baseUnitQty 基準単位数
	 * @return
	 */
	protected MCNumber _getPurcLt(MAM_PURC_DDLV_LT_R purcDdlvR, MAM_ITM_DTL_R itmDtlR, String dlvCd, boolean provDdlvFlg, MCNumber baseUnitQty) {
		MCNumber purcLt;
		// 仕入直送
		if (!isNull(dlvCd) || provDdlvFlg) {
			if (!purcDdlvR.isEmpty()) {
				MCNumber ltAddDay = isNull(purcDdlvR.purc_lt_add_qty()) ? MCNumber.ZERO : baseUnitQty.divide(
						purcDdlvR.purc_lt_add_qty(), 0, RoundingMode.DOWN);
				purcLt = purcDdlvR.purc_lt().add(ltAddDay);
			}
			else {
				purcLt = getPurcLtByItmDtl(itmDtlR, baseUnitQty);
			}
		}
		// 仕入直送以外
		else {
			purcLt = getPurcLtByItmDtl(itmDtlR, baseUnitQty);
		}
		return purcLt;
	}
	/**
	 * 購入ＬＴ取得
	 * @param itmDtlR　対応する品目詳細マスタレコード
	 * @param baseUnitQty 基準単位数
	 * @return
	 */
	public static MCNumber getPurcLtByItmDtl(MAM_ITM_DTL_R itmDtlR, MCNumber baseUnitQty) {
		return object(CLAZZ)._getPurcLtByItmDtl(itmDtlR, baseUnitQty);
	}
	/**
	 * 購入ＬＴ取得
	 * @param itmDtlR　対応する品目詳細マスタレコード
	 * @param baseUnitQty 基準単位数
	 * @return
	 */
	protected MCNumber _getPurcLtByItmDtl(MAM_ITM_DTL_R itmDtlR, MCNumber baseUnitQty) {
		if (!isNull(itmDtlR) && !itmDtlR.isEmpty() && !isNull(itmDtlR.purc_lt())) {
			MCNumber ltAddDay = isNull(itmDtlR.purc_lt_add_qty()) ? MCNumber.ZERO : baseUnitQty.divide(
					itmDtlR.purc_lt_add_qty(), 0, RoundingMode.DOWN);
			return itmDtlR.purc_lt().add(ltAddDay);
		}
		else {
			// マスタが取得できない場合はリードタイムを「0」とみなす
			return MCNumber.ZERO;
		}
	}
	
	
	
	/**
	 * 回答納入日遅れ取得
	 * @param poDNo 発注明細ＮＯ
	 * @return 回答納入日遅れの場合にtrue。回答納入日遅れでない場合にfalse。
	 */
	public static boolean srchPrmsRcptOverDue(MCList<MST_PO_D_R> poDL) {
		return object(CLAZZ)._srchPrmsRcptOverDue(poDL);
	}
	
	/**
	 * 回答納入日遅れ取得
	 * @param poDNo 発注明細ＮＯ
	 * @return 回答納入日遅れの場合にtrue。回答納入日遅れでない場合にfalse。
	 */
	protected boolean _srchPrmsRcptOverDue(MCList<MST_PO_D_R> poDL) {

		boolean ans = false;
		MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(MST_PO_D_R.create("T"));
		insPodWk(poDL, poDL_bldr);
		MCList<MST_ARR_PR_R> arrPrL = srchArrPr();
		MCList<MST_PRMS_RCPT_D_R> prmsL = srchPrms();
		MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(MST_ARR_PR_R.create("T"));
		insPrWk(arrPrL, arrPrL_bldr);
		MCList<MST_ARR_ACT_R> arrActL = srchAct();

		MCIndexKey arrPrIdx = arrPrL.createIndex(MST_ARR_PR_R.$po_d_no);
		MCIndexKey prmsRcptIdx = prmsL.createIndex("PO_D_NO");
		MCIndexKey arrActIdx = arrActL.createIndex("PO_D_NO");
		
		poDL.addBooleanColumn("prms_rcpt_over_flg");
		
		for (MST_PO_D_R poDR : poDL) {

			String poDNo = poDR.po_d_no();
			
			MST_ARR_PR_R arrPrR = arrPrL.getFirst(arrPrIdx, poDNo);
			if (!(arrPrR.arr_cmpl_flg() && arrPrR.purc_cmpl_flg())) {
				continue;
			}
			MCList<MST_PRMS_RCPT_D_R> subPrmsL = prmsL.subList(prmsRcptIdx, poDNo);
			MCIndexKey prmsKey = subPrmsL.createIndex(MST_PRMS_RCPT_D_R.$prms_dlv_tm);
			
			MCList<MST_ARR_ACT_R> subArrActL = arrActL.subList(arrActIdx, poDNo);
			MCIndexKey actKey = subArrActL.createIndex(MST_ARR_ACT_R.$arr_tm);

			Set<MCDate> dtSet = new TreeSet<MCDate>();
			subPrmsL.forEach(prmsR -> dtSet.add(prmsR.prms_dlv_tm()));
			subArrActL.forEach(actR -> dtSet.add(actR.arr_tm()));
			MCNumber prmsQty = MCNumber.ZERO;
			MCNumber actQty = MCNumber.ZERO;
			
			for (MCDate dt : dtSet) {
				prmsQty = prmsQty.add(nvl(subPrmsL.subList(prmsKey, dt)
						.sum(MST_PRMS_RCPT_D_R.$base_unit_qty), MCNumber.ZERO));
				actQty = actQty.add(nvl(subArrActL.subList(actKey, dt)
						.sum(MST_ARR_ACT_R.$base_unit_qty), MCNumber.ZERO));
				if (actQty.lt(prmsQty)) {
					poDR.setBooleanNE("prms_rcpt_over_flg", true);
					ans = true;
					break;
				}
			}
		}

		dbWkDelete("MSBDL5040_MSW_PO_D_D01", poDL_bldr.getBaseDbc());
		dbWkDelete("MSBDL5040_MSW_ARR_PR_D01", arrPrL_bldr.getBaseDbc());
		return ans;
	}
	
	protected void insPodWk(MCList<MST_PO_D_R> poDL, MCQueryApiBuilder poDL_bldr) {

		dbWkDelete("MSBDL5040_MSW_PO_D_D02", poDL_bldr.getBaseDbc());
		dbWkInsert("MSBDL5040_MSW_PO_D_I01", poDL, poDL_bldr.getBaseDbc());
	}

	protected void insPrWk(MCList<MST_ARR_PR_R> prL, MCQueryApiBuilder prL_bldr) {

		dbWkDelete("MSBDL5040_MSW_ARR_PR_D02", prL_bldr.getBaseDbc());
		dbWkInsert("MSBDL5040_MSW_ARR_PR_I01", prL, prL_bldr.getBaseDbc());
	}

	protected static MCList<MST_ARR_PR_R> srchArrPr() {
		MSW_PO_D_KEY_R wk = MSW_PO_D_KEY_R.create("WK");
		MCList<MST_ARR_PR_R> arrPrL = MCList.create(MST_ARR_PR_R.class);
		MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
		MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(t);
		arrPrL_bldr.addInnerJoin(wk, wk.po_d_no.eq(t.po_d_no));
		dbSelect("MSBDL5040_MST_ARR_PR_S01", arrPrL, arrPrL_bldr);
		return arrPrL;
	}

	protected static MCList<MST_PRMS_RCPT_D_R> srchPrms() {
		MST_PRMS_RCPT_R rcpt = MST_PRMS_RCPT_R.create("RCPT");
		MSW_PO_D_KEY_R wk = MSW_PO_D_KEY_R.create("WK");
		MCList<MST_PRMS_RCPT_D_R> prmsL = MCList.create(MST_PRMS_RCPT_D_R.class);
		MST_PRMS_RCPT_D_R t = MST_PRMS_RCPT_D_R.create("T");
		MCQueryApiBuilder prmsL_bldr = MCQueryApiBuilder.create(t);
		prmsL_bldr.addSelect(wk.po_d_no);
		prmsL_bldr.addInnerJoin(rcpt, t.prms_rcpt_no.eq(rcpt.prms_rcpt_no));
		prmsL_bldr.addInnerJoin(wk, wk.po_d_no.eq(rcpt.po_d_no));
		prmsL_bldr.addWhereWithAnd(rcpt.arr_schd_refl_flg.eq(value(true)));
		dbSelect("MSBDL5040_MST_PRMS_RCPT_D_S01", prmsL, prmsL_bldr);
		return prmsL;
	}

	protected static MCList<MST_ARR_ACT_R> srchAct() {
		MST_ARR_SCHD_R schd = MST_ARR_SCHD_R.create("SCHD");
		MSW_ARR_PR_KEY_R wk = MSW_ARR_PR_KEY_R.create("WK");
		MST_ARR_PR_R pr = MST_ARR_PR_R.create("PR");
		MCList<MST_ARR_ACT_R> actL = MCList.create(MST_ARR_ACT_R.class);
		MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
		MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t);
		actL_bldr.addSelect(pr.po_d_no);
		actL_bldr.addInnerJoin(schd, t.arr_schd_no.eq(schd.arr_schd_no));
		actL_bldr.addInnerJoin(wk, wk.arr_pr_no.eq(schd.arr_pr_no));
		actL_bldr.addInnerJoin(pr, pr.arr_pr_no.eq(wk.arr_pr_no));
		actL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelect("MSBDL5040_MST_ARR_ACT_S01", actL, actL_bldr);
		return actL;
	}
	
	/**
	 * 発注の訂正、取消が可能か。訂正は、備考、表示順のみの更新を除く。
	 * 発注に紐づく入荷進捗が以下の条件を満たす場合に訂正、取消不可とする。<BR>
	 * 入荷進捗.輸入インボイス数量!=0 OR<BR>
	 * 入荷進捗.仕入数量!=0 OR<BR>
	 * 入荷進捗.入荷数量!=0 OR<BR>
	 * 入荷進捗.検収不良数量!=0 OR<BR>
	 * 入荷進捗.入荷予定打切数量!=0 OR(※1)<BR>
	 * 入荷進捗.仕入予定打切数量!=0 OR(※1)<BR>
	 * ※1:chkAbortStsがtrueの場合のみ
	 * @param poNo 発注ＮＯ（poNo、poDNoのどちらか片方のみ渡す）
	 * @param poDNo 発注明細ＮＯ
	 * @param chkAbortSts 打切状況の確認を行うか否か 
	 * @return 次処理済の場合にtrue
	 */
	public static boolean isPoNotUpd(String poNo, String poDNo, boolean chkAbortSts) {
		return object(CLAZZ)._isPoNotUpd(poNo, poDNo, chkAbortSts);
	}
	protected boolean _isPoNotUpd(String poNo, String poDNo, boolean chkAbortSts) {
		MCList<MST_ARR_PR_R> prL = srchPr(poNo, poDNo);
		for (MST_ARR_PR_R prR : prL) {
			if (_chkPoNotUpd(prR, chkAbortSts)) {
				return true;
			}
		}
		return false;

	}
	
	/**
	 * 発注の承認次処理が行われているか。
	 * 発注に紐づく入荷進捗が以下の条件を満たす場合に次処理済とする。<BR>
	 * 入荷進捗.納入指示日!=NULL OR<BR>
	 * 入荷進捗.納期回答受領日!=NULL OR<BR>
	 * 入荷進捗.納入指示回答受領日!=NULL OR<BR>
	 * 入荷進捗.輸入インボイス数量!=0 OR<BR>
	 * 入荷進捗.仕入数量!=0 OR<BR>
	 * 入荷進捗.入荷数量!=0 OR<BR>
	 * 入荷進捗.検収不良数量!=0 OR<BR>
	 * 入荷進捗.入荷予定打切数量!=0 OR<BR>
	 * 入荷進捗.仕入予定打切数量!=0 OR<BR>
	 * @param poNo 発注ＮＯ（poNo、poDNoのどちらか片方のみ渡す）
	 * @param poDNo 発注明細ＮＯ
	 * @return 次処理済の場合にtrue
	 */
	public static boolean isAprvNextOpr(String poNo, String poDNo) {
		return object(CLAZZ)._isAprvNextOpr(poNo, poDNo);
	}	
	protected boolean _isAprvNextOpr(String poNo, String poDNo) {
		MCList<MST_ARR_PR_R> prL = srchPr(poNo, poDNo);
		for (MST_ARR_PR_R prR : prL) {
			if (_isAprvNextOpr(prR)) {
				return true;
			}
		}
		return false;
	}


	protected MCList<MST_ARR_PR_R> srchPr(String poNo, String poDNo) {

		MST_PO_D_R pod = MST_PO_D_R.create("POD");
		MST_PO_R po = MST_PO_R.create("PO");
		MCList<MST_ARR_PR_R> prL = MCList.create(MST_ARR_PR_R.class);
		MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
		MCQueryApiBuilder prL_bldr = MCQueryApiBuilder.create(t);
		prL_bldr.addInnerJoin(pod, t.po_d_no.eq(pod.po_d_no));
		if (!isNull(poNo)) {
			prL_bldr.addInnerJoin(po, po.po_no.eq(pod.po_no));
			prL_bldr.addWhereWithAnd(po.po_no.eq(bind("1")), poNo);
		}
		if (!isNull(poDNo)) {
			prL_bldr.addWhereWithAnd(pod.po_d_no.eq(bind("1")), poDNo);
		}
		dbSelect("MSBDL5040_MST_ARR_PR_S02", prL, prL_bldr);
		return prL;
	}
	
	
	/**
	 * 発注の訂正、取消が可能か。訂正は、備考、表示順のみの更新を除く。
	 * 発注に紐づく入荷進捗が以下の条件を満たす場合に訂正、取消不可とする。<BR>
	 * 入荷進捗.輸入インボイス数量!=0 OR<BR>
	 * 入荷進捗.仕入数量!=0 OR<BR>
	 * 入荷進捗.入荷数量!=0 OR<BR>
	 * 入荷進捗.検収不良数量!=0 OR<BR>
	 * 入荷進捗.入荷予定打切数量!=0 OR(※1)<BR>
	 * 入荷進捗.仕入予定打切数量!=0 OR(※1)<BR>
	 * ※1:chkAbortStsがtrueの場合のみ
	 * @param poNo 発注ＮＯ（poNo、poDNoのどちらか片方のみ渡す）
	 * @param poDNo 発注明細ＮＯ
	 * @param chkAbortSts 打切状況の確認を行うか否か 
	 * @return 次処理済の場合にtrue
	 */
	public static boolean chkPoNotUpd(MST_ARR_PR_R prR, boolean chkAbortSts) {
		return object(CLAZZ)._chkPoNotUpd(prR, chkAbortSts);
	}
	
	protected boolean _chkPoNotUpd(MST_ARR_PR_R prR, boolean chkAbortSts) {
		if (!isNullOrZero(prR.rcpt_iv_qty()) || !isNullOrZero(prR.purc_qty()) || !isNullOrZero(prR.arr_qty()) || !isNullOrZero(prR.accpt_dfct_qty())) {
			return true;
		}
		if (chkAbortSts) {
			if (!isNullOrZero(prR.arr_schd_abort_qty()) || !isNullOrZero(prR.purc_schd_abort_qty())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 発注の承認次処理が行われているか。
	 * 発注に紐づく入荷進捗が以下の条件を満たす場合に次処理済とする。<BR>
	 * 入荷進捗.納入指示日!=NULL OR<BR>
	 * 入荷進捗.納期回答受領日!=NULL OR<BR>
	 * 入荷進捗.納入指示回答受領日!=NULL OR<BR>
	 * 入荷進捗.輸入インボイス数量!=0 OR<BR>
	 * 入荷進捗.仕入数量!=0 OR<BR>
	 * 入荷進捗.入荷数量!=0 OR<BR>
	 * 入荷進捗.検収不良数量!=0 OR<BR>
	 * @param prR 入荷進捗
	 * @return 次処理済の場合にtrue
	 */
	public static boolean isAprvNextOpr(MST_ARR_PR_R prR){
		return object(CLAZZ)._isAprvNextOpr(prR);
	}
	protected boolean _isAprvNextOpr(MST_ARR_PR_R prR){
		// 新規で入荷進捗がまだ登録されていない
		if(isNull(prR)){
			return false;
		}
		if (!isNull(prR.dlv_inst_dt()) || !isNull(prR.prms_rcpt_dt()) || !isNull(prR.dlv_inst_prms_rcpt_dt())
				|| !isNullOrZero(prR.rcpt_iv_qty()) || !isNullOrZero(prR.purc_qty()) || !isNullOrZero(prR.arr_qty()) 
				|| !isNullOrZero(prR.accpt_dfct_qty())) {
			return true;
		}
		return false;
	}
	
	protected boolean isNullOrZero(MCNumber num){
		return isNull(num) || num.isZero();
	}
	
	/**
	 * 値がNull,またはNull文字かチェックします
	 * @param val チェックする値
	 * @return 値がNull,またはNull文字の場合にtrue
	 */
	public static boolean isNullOrNullStr(Comparable<?> val) {
		return object(CLAZZ)._isNullOrNullStr(val);
	}
	protected boolean _isNullOrNullStr(Comparable<?> val) {
		return isNull(val) || MAC_STR.isNULL_VAL((String)val);
	}
	
	/**
	 * 在庫管理区分, 資産管理区分, 経費購買FLGを見て在庫更新区分を返します
	 * @param stkMngTyp 在庫管理区分
	 * @param assetMngTyp 資産管理区分
	 * @param xpnsPurcFlg 経費購買FLG
	 * @return 在庫更新対象の場合は「在庫管理する」が、在庫更新対象外の場合は「在庫管理しない」を返します
	 */
	public static String getStkMngTypForTran(String stkMngTyp, String assetMngTyp, boolean xpnsPurcFlg) {
		return object(CLAZZ)._getStkMngTypForTran(stkMngTyp, assetMngTyp, xpnsPurcFlg);
		
	}
	protected String _getStkMngTypForTran(String stkMngTyp, String assetMngTyp, boolean xpnsPurcFlg) {
		
		if (isUpdStk(stkMngTyp, assetMngTyp, xpnsPurcFlg)) {
			return MAC_STK_MNG_TYP.MNG.value();
		}
		else {
			return MAC_STK_MNG_TYP.NOT_MNG.value();
		}
		
	}
	/**
	 * 在庫管理区分, 資産管理区分, 経費購買FLGを見て在庫更新するか判断します
	 * @param stkMngTyp 在庫管理区分
	 * @param assetMngTyp 資産管理区分
	 * @param xpnsPurcFlg 経費購買FLG
	 * @return 在庫更新対象の場合にtrue
	 */
	public static boolean isUpdStk(String stkMngTyp, String assetMngTyp, boolean xpnsPurcFlg) {
		return object(CLAZZ)._isUpdStk(stkMngTyp, assetMngTyp, xpnsPurcFlg);
	}
	protected boolean _isUpdStk(String stkMngTyp, String assetMngTyp, boolean xpnsPurcFlg) {
		if (MAC_STK_MNG_TYP.isMNG(stkMngTyp)) {
			if (MAC_ASSET_MNG_TYP.isMNG(assetMngTyp)) {
				// 品目マスタ.在庫管理区分・資産管理区分が「在庫管理する」・「資産管理する」
				if (xpnsPurcFlg) {
					// 経費購買FLGがオンの場合は、在庫を更新しない
					return false;
				}
				else {
					// 経費購買FLGがオフの場合は、在庫を更新する
					return true;
				}
			}
			else {
				// 品目マスタ.在庫管理区分・資産管理区分が「在庫管理する」・「資産管理しない」の場合
				// 在庫を更新する
				return true;
			}
		}
		else {
			// 品目マスタ・在庫管理区分が「在庫管理する」以外の場合は、在庫を更新しない
			return false;
		}	
	}
	/**
	 * 取引通貨・基準通貨・納税通貨での金額情報を計算し、dtlRに設定します(一覧形式用)
	 * @param dtlR 明細項目
	 * @see #setAmtInfo(MCRow hdr, MCRow dtlR)
	 */
	public static void setAmtInfo(MCRow dtlR) {
		object(CLAZZ)._setAmtInfo(dtlR);
	}
	protected void _setAmtInfo(MCRow dtlR) {
		setTrdCurInfo(dtlR);
		setBaseCurInfo(dtlR);
		setPtaxCurInfo(dtlR);
		setWtaxInfo(dtlR);
	}
	
	/**
	 * 取引通貨・基準通貨・納税通貨での金額情報を計算し、dtlRに設定します(単票形式用)
	 * @param hdr ヘッダ項目
	 * @param dtlR　明細項目
	 * @see #setTrdCurInfo(MCRow hdrR, MCRow dtlR)
	 * @see #setBaseCurInfo(MCRow hdrR, MCRow dtlR)
	 * @see #setPtaxCurInfo(MCRow hdrR, MCRow dtlR)
	 * @see #setWtaxInfo(MCRow hdrR, MCRow dtlR)
	 */
	public static void setAmtInfo(MCRow hdr, MCRow dtlR) {
		object(CLAZZ)._setAmtInfo(hdr, dtlR);
	}
	protected void _setAmtInfo(MCRow hdr, MCRow dtlR) {
		setTrdCurInfo(hdr, dtlR);
		setBaseCurInfo(hdr, dtlR);
		setPtaxCurInfo(hdr, dtlR);
		setWtaxInfo(hdr, dtlR);
	}
	
	/**
	 * 取引通貨での金額情報を計算し、dtlRに設定します(一覧形式用)
  	 * @param dtlR　明細項目
 	 * @see #setTrdCurInfo(MCRow hdrR, MCRow dtlR)
	 */
	public static void setTrdCurInfo(MCRow dtlR) {
		object(CLAZZ)._setTrdCurInfo(dtlR);
	}
	protected void _setTrdCurInfo(MCRow dtlR) {
		MCRow hdr = MCRow.create();		
		hdr.setNumberNE("trd_cur_amt_dec_place", dtlR.getNumberNE("trd_cur_amt_dec_place"));
		hdr.setStringNE("purc_amt_rnd_typ", dtlR.getStringNE("purc_amt_rnd_typ"));
		hdr.setStringNE("purc_tax_rnd_typ", dtlR.getStringNE("purc_tax_rnd_typ"));
		hdr.setNumberNE("trd_cur_dscnt_amt", dtlR.getNumberNE("trd_cur_dscnt_amt"));
		setTrdCurInfo(hdr, dtlR);
	}
	
	/**
	 * 取引通貨での金額情報を計算し、dtlRに設定します(単票形式用)<br>
	 * <br>
	 * hdrRには以下の項目が設定されている必要があります。<br>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>trd_cur_amt_dec_place</td><td>取引通貨金額小数部有効桁数</td></tr>
	 * <tr><td>purc_amt_rnd_typ</td><td>仕入金額端数処理区分</td></tr>
	 * <tr><td>purc_tax_rnd_typ</td><td>仕入税端数処理区分</td></tr>
	 * </table>
	 * <br>
	 * dtlRには以下の項目が設定されている必要があります。<br>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>tax_rate</td><td>税率</td></tr>
	 * <tr><td>inc_tax_flg</td><td>内税ＦＬＧ</td></tr>
	 * <tr><td>trd_unit_qty</td><td>取引単位数量</td></tr>
	 * <tr><td>trd_cur_upri</td><td>取引通貨単価</td></tr>
	 * <tr><td>trd_cur_proc_upri</td><td>取引通貨加工単価</td></tr>
	 * <tr><td>trd_cur_onr_prov_upri</td><td>取引通貨有償支給単価</td></tr>
	 * <tr><td>trd_cur_dscnt_amt</td><td>取引通貨値引金額</td></tr>
	 * </table>
	 * <br>
	 * @param hdrR ヘッダ項目
	 * @param dtlR　明細項目
	 */
	public static void setTrdCurInfo(MCRow hdrR, MCRow dtlR) {
		object(CLAZZ)._setTrdCurInfo(hdrR, dtlR);
	}
	
	protected void _setTrdCurInfo(MCRow hdrR, MCRow dtlR) {
		// 金額小数部有効桁数・端数処理区分
		MCNumber trd_cur_amt_dec_place = hdrR.getNumber("trd_cur_amt_dec_place");
		String purc_amt_rnd_typ = hdrR.getString("purc_amt_rnd_typ");
		String purc_tax_rnd_typ = hdrR.getString("purc_tax_rnd_typ");
		// 税
		MCNumber tax_rate = dtlR.getNumber("tax_rate");
		Boolean inc_tax_flg = dtlR.getBoolean("inc_tax_flg");
		// 数量
		MCNumber trd_unit_qty = dtlR.getNumber("trd_unit_qty");
		// 単価
		MCNumber trd_cur_upri = dtlR.getNumber("trd_cur_upri");
		MCNumber trd_cur_proc_upri = dtlR.getNumberNE("trd_cur_proc_upri");
		MCNumber trd_cur_onr_prov_upri = dtlR.getNumberNE("trd_cur_onr_prov_upri");
		// 値引額
		MCNumber trd_cur_dscnt_amt = dtlR.getNumberNE("trd_cur_dscnt_amt");
		
		
		// 金額・税額・税込金額
		MCRow amtTax = MAUCL_AmtUtil.getAmtAndTax(
				  trd_cur_upri
				, trd_unit_qty
				, tax_rate
				, inc_tax_flg
				, trd_cur_amt_dec_place
				, purc_amt_rnd_typ
				, purc_tax_rnd_typ
				, trd_cur_dscnt_amt);
		
		dtlR.setNumber("trd_cur_amt", amtTax.getNumberNE("amt"));
		dtlR.setNumber("trd_cur_tax_amt", amtTax.getNumberNE("tax_amt"));
		dtlR.setNumberNE("trd_cur_inc_tax_amt", amtTax.getNumberNE("inc_tax_amt"));
		
		// 有償支給金額、加工金額：金額を有償支給単価・加工単価で案分する
		if(!isNull(dtlR.getNumberNE("trd_cur_amt"))) {
			MCList<MCRow> amtL = calcPropOutSrcUpri(dtlR.getNumberNE("trd_cur_amt"), trd_cur_amt_dec_place, trd_cur_onr_prov_upri, trd_cur_proc_upri, trd_cur_dscnt_amt);
			dtlR.setNumberNE("trd_cur_onr_prov_amt", amtL.get(0).getNumberNE("amt"));
			dtlR.setNumberNE("trd_cur_proc_amt", amtL.get(1).getNumberNE("amt"));
		}
	}
	
	/**
	 * 基準通貨での金額情報を計算し、dtlRに設定します(一覧形式用)
	 * @param dtlR　明細項目
	 * @see #setBaseCurInfo(MCRow hdrR, MCRow dtlR)
	 */
	public static void setBaseCurInfo(MCRow dtlR) {
		object(CLAZZ)._setBaseCurInfo(dtlR);
	}
	protected void _setBaseCurInfo(MCRow dtlR) {
		MCRow hdr = MCRow.create();
		hdr.setNumberNE("base_cur_amt_dec_place", dtlR.getNumber("base_cur_amt_dec_place"));
		hdr.setNumberNE("base_cur_upri_dec_place", dtlR.getNumber("base_cur_upri_dec_place"));
		hdr.setNumberNE("xrate", dtlR.getNumber("xrate"));
		hdr.setStringNE("xrate_rnd_typ", dtlR.getString("xrate_rnd_typ"));
		setBaseCurInfo(hdr, dtlR);
	}
	
	/**
	 * 基準通貨での金額情報を計算し、dtlRに設定します（単票形式用）
	 * <br>
	 * hdrRには以下の項目が設定されている必要があります。<br>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>base_cur_amt_dec_place</td><td>基準通貨金額小数部有効桁数</td></tr>
	 * <tr><td>base_cur_upri_dec_place</td><td>基準通貨単価小数部有効桁数</td></tr>
	 * <tr><td>purc_tax_rnd_typ</td><td>為替端数処理区分</td></tr>
	 * <tr><td>ptax_xrate</td><td>換算レート</td></tr>
	 * </table>
	 * <br>
	 * dtlRには以下の項目が設定されている必要があります。<br>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>trd_cur_upri</td><td>取引通貨単価</td></tr>
	 * <tr><td>trd_cur_amt</td><td>取引通貨金額</td></tr>
	 * <tr><td>trd_cur_tax_amt</td><td>取引通貨税額</td></tr>
	 * <tr><td>trd_cur_inc_tax_amt</td><td>取引通貨税込金額</td></tr>
	 * <tr><td>trd_cur_proc_upri</td><td>取引通貨加工単価</td></tr>
	 * <tr><td>trd_cur_proc_amt</td><td>取引通貨加工金額</td></tr>
	 * <tr><td>trd_cur_onr_prov_upri</td><td>取引通貨有償支給単価</td></tr>
	 * <tr><td>trd_cur_onr_prov_amt</td><td>取引通貨有償支給金額</td></tr>
	 * <tr><td>trd_cur_dscnt_amt</td><td>取引通貨値引額</td></tr>
	 * </table>
	 * <br>
	 * @param hdrR　ヘッダ項目
	 * @param dtlR　明細項目
	 */
	public static void setBaseCurInfo(MCRow hdrR, MCRow dtlR) {
		object(CLAZZ)._setBaseCurInfo(hdrR, dtlR);
	}	
	protected void _setBaseCurInfo(MCRow hdrR, MCRow dtlR) {
		// 金額小数部有効桁数・端数処理区分
		MCNumber base_cur_amt_dec_place = hdrR.getNumber("base_cur_amt_dec_place");
		MCNumber base_cur_upri_dec_place = hdrR.getNumber("base_cur_upri_dec_place");
		
		// 換算レート
		MCNumber xrate = hdrR.getNumber("xrate");
		String xrate_rnd_typ = hdrR.getString("xrate_rnd_typ");
		
		// 換算前項目
		MCNumber trd_cur_upri = dtlR.getNumber("trd_cur_upri");
		MCNumber trd_cur_amt = dtlR.getNumber("trd_cur_amt");
		MCNumber trd_cur_tax_amt = dtlR.getNumber("trd_cur_tax_amt");
		MCNumber trd_cur_inc_tax_amt = dtlR.getNumber("trd_cur_inc_tax_amt");
		MCNumber trd_cur_proc_upri = dtlR.getNumberNE("trd_cur_proc_upri");
		MCNumber trd_cur_proc_amt = dtlR.getNumber("trd_cur_proc_amt");
		MCNumber trd_cur_onr_prov_upri = dtlR.getNumberNE("trd_cur_onr_prov_upri");
		MCNumber trd_cur_onr_prov_amt = dtlR.getNumber("trd_cur_onr_prov_amt");
		MCNumber trd_cur_dscnt_amt = dtlR.getNumberNE("trd_cur_dscnt_amt");
		
		// 換算後項目
		MCNumber base_cur_upri = null;
		MCNumber base_cur_amt = null;
		MCNumber base_cur_tax_amt = null;
		MCNumber base_cur_inc_tax_amt = null;
		MCNumber base_cur_proc_upri = null;
		MCNumber base_cur_proc_amt = null;
		MCNumber base_cur_onr_prov_upri = null;
		MCNumber base_cur_onr_prov_amt = null;
		MCNumber base_cur_dscnt_amt = null;
		
		//　単価を換算する
		base_cur_upri = MAUCL_MCDataUtil.convToBaseCur(
				  trd_cur_upri
				, xrate
				, base_cur_upri_dec_place
				, xrate_rnd_typ);
		dtlR.setNumberNE("base_cur_upri", base_cur_upri);
		
		// 金額を換算する
		base_cur_amt = MAUCL_MCDataUtil.convToBaseCur(
				  trd_cur_amt
				, xrate
				, base_cur_amt_dec_place
				, xrate_rnd_typ);
		dtlR.setNumberNE("base_cur_amt", base_cur_amt);
		
		// 税額を換算する
		base_cur_tax_amt = MAUCL_MCDataUtil.convToBaseCur(
				trd_cur_tax_amt
				, xrate
				, base_cur_amt_dec_place
				, xrate_rnd_typ);
		dtlR.setNumberNE("base_cur_tax_amt", base_cur_tax_amt);
		
		// 税込金額を換算する
		base_cur_inc_tax_amt = MAUCL_MCDataUtil.convToBaseCur(
				trd_cur_inc_tax_amt
				, xrate
				, base_cur_amt_dec_place
				, xrate_rnd_typ);
		dtlR.setNumberNE("base_cur_inc_tax_amt", base_cur_inc_tax_amt);
		
		// 加工単価を換算する
		if (!isNull(trd_cur_proc_upri)) {
			base_cur_proc_upri = MAUCL_MCDataUtil.convToBaseCur(
					trd_cur_proc_upri
					, xrate
					, base_cur_upri_dec_place
					, xrate_rnd_typ);
			dtlR.setNumberNE("base_cur_proc_upri", base_cur_proc_upri);
			
			base_cur_proc_amt = MAUCL_MCDataUtil.convToBaseCur(
					trd_cur_proc_amt
					, xrate
					, base_cur_amt_dec_place
					, xrate_rnd_typ);
			dtlR.setNumberNE("base_cur_proc_amt", base_cur_proc_amt);
		}
		
		// 有償支給単価を換算する
		if (!isNull(trd_cur_onr_prov_upri)) {
			base_cur_onr_prov_upri = MAUCL_MCDataUtil.convToBaseCur(
					trd_cur_onr_prov_upri
					, xrate
					, base_cur_upri_dec_place
					, xrate_rnd_typ);
			dtlR.setNumberNE("base_cur_onr_prov_upri", base_cur_onr_prov_upri);
			
			base_cur_onr_prov_amt = MAUCL_MCDataUtil.convToBaseCur(
					trd_cur_onr_prov_amt
					, xrate
					, base_cur_amt_dec_place
					, xrate_rnd_typ);
			dtlR.setNumberNE("base_cur_onr_prov_amt", base_cur_onr_prov_amt);
		}
		
		// 値引額を換算する
		if (!isNull(trd_cur_dscnt_amt)) {
			base_cur_dscnt_amt = MAUCL_MCDataUtil.convToBaseCur(
					  trd_cur_dscnt_amt
					, xrate
					, base_cur_amt_dec_place
					, xrate_rnd_typ);
			dtlR.setNumberNE("base_cur_dscnt_amt", base_cur_dscnt_amt);
		}
	}
	
	/**
	 * 基準通貨での金額情報を計算し、dtlRに設定します（一覧形式用）
	 * @param dtlR
	 * @see #setPtaxCurInfo(MCRow hdrR, MCRow dtlR)
	 */
	public static void setPtaxCurInfo(MCRow dtlR) {
		object(CLAZZ)._setPtaxCurInfo(dtlR);
	}
	protected void _setPtaxCurInfo(MCRow dtlR) {
		MCRow hdr = MCRow.create();
		hdr.setNumberNE("ptax_cur_amt_dec_place", dtlR.getNumber("ptax_cur_amt_dec_place"));
		hdr.setNumberNE("ptax_cur_upri_dec_place", dtlR.getNumber("ptax_cur_upri_dec_place"));
		hdr.setNumberNE("ptax_xrate", dtlR.getNumber("ptax_xrate"));
		hdr.setStringNE("xrate_rnd_typ", dtlR.getString("xrate_rnd_typ"));
		setPtaxCurInfo(hdr, dtlR);
	}
	
	/**
	 * 基準通貨での金額情報を計算し、dtlRに設定します（単票形式用）
	 * <br>
	 * hdrRには以下の項目が設定されている必要があります。<br>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>ptax_cur_amt_dec_place</td><td>納税通貨金額小数部有効桁数</td></tr>
	 * <tr><td>ptax_cur_upri_dec_place</td><td>納税通貨単価小数部有効桁数</td></tr>
	 * <tr><td>purc_tax_rnd_typ</td><td>為替端数処理区分</td></tr>
	 * <tr><td>ptax_xrate</td><td>換算レート</td></tr>
	 * </table>
	 * <br>
	 * dtlRには以下の項目が設定されている必要があります。<br>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>trd_cur_upri</td><td>取引通貨単価</td></tr>
	 * <tr><td>trd_cur_amt</td><td>取引通貨金額</td></tr>
	 * <tr><td>trd_cur_tax_amt</td><td>取引通貨税額</td></tr>
	 * <tr><td>trd_cur_inc_tax_amt</td><td>取引通貨税込金額</td></tr>
	 * <tr><td>trd_cur_proc_upri</td><td>取引通貨加工単価</td></tr>
	 * <tr><td>trd_cur_proc_amt</td><td>取引通貨加工金額</td></tr>
	 * <tr><td>trd_cur_onr_prov_upri</td><td>取引通貨有償支給単価</td></tr>
	 * <tr><td>trd_cur_onr_prov_amt</td><td>取引通貨有償支給金額</td></tr>
	 * <tr><td>trd_cur_dscnt_amt</td><td>取引通貨値引額</td></tr>
	 * </table>
	 * <br>
	 * @param hdrR　ヘッダ項目
	 * @param dtlR　明細項目
	 */
	public static void setPtaxCurInfo(MCRow hdrR, MCRow dtlR) {
		object(CLAZZ)._setPtaxCurInfo(hdrR, dtlR);
	}	
	protected void _setPtaxCurInfo(MCRow hdrR, MCRow dtlR) {
		// 金額小数部有効桁数・端数処理区分
		MCNumber ptax_cur_amt_dec_place = hdrR.getNumber("ptax_cur_amt_dec_place");
		MCNumber ptax_cur_upri_dec_place = hdrR.getNumber("ptax_cur_upri_dec_place");
		
		// 換算レート
		MCNumber ptax_xrate = hdrR.getNumber("ptax_xrate");
		String xrate_rnd_typ = hdrR.getString("xrate_rnd_typ");
		
		// 換算前項目
		MCNumber trd_cur_upri = dtlR.getNumber("trd_cur_upri");
		MCNumber trd_cur_amt = dtlR.getNumber("trd_cur_amt");
		MCNumber trd_cur_tax_amt = dtlR.getNumber("trd_cur_tax_amt");
		MCNumber trd_cur_inc_tax_amt = dtlR.getNumber("trd_cur_inc_tax_amt");
		MCNumber trd_cur_proc_upri = dtlR.getNumberNE("trd_cur_proc_upri");
		MCNumber trd_cur_proc_amt = dtlR.getNumber("trd_cur_proc_amt");
		MCNumber trd_cur_onr_prov_upri = dtlR.getNumberNE("trd_cur_onr_prov_upri");
		MCNumber trd_cur_onr_prov_amt = dtlR.getNumber("trd_cur_onr_prov_amt");
		MCNumber trd_cur_dscnt_amt = dtlR.getNumberNE("trd_cur_dscnt_amt");
		
		// 換算後項目
		MCNumber ptax_cur_upri = null;
		MCNumber ptax_cur_amt = null;
		MCNumber ptax_cur_tax_amt = null;
		MCNumber ptax_cur_inc_tax_amt = null;
		MCNumber ptax_cur_proc_upri = null;
		MCNumber ptax_cur_proc_amt = null;
		MCNumber ptax_cur_onr_prov_upri = null;
		MCNumber ptax_cur_onr_prov_amt = null;
		MCNumber ptax_cur_dscnt_amt = null;
		
		//　単価を換算する
		ptax_cur_upri = MAUCL_MCDataUtil.convToBaseCur(
				  trd_cur_upri
				, ptax_xrate
				, ptax_cur_upri_dec_place
				, xrate_rnd_typ);
		dtlR.setNumberNE("ptax_cur_upri", ptax_cur_upri);
		
		// 金額を換算する
		ptax_cur_amt = MAUCL_MCDataUtil.convToBaseCur(
				  trd_cur_amt
				, ptax_xrate
				, ptax_cur_amt_dec_place
				, xrate_rnd_typ);
		dtlR.setNumberNE("ptax_cur_amt", ptax_cur_amt);
		
		// 税額を換算する
		ptax_cur_tax_amt = MAUCL_MCDataUtil.convToBaseCur(
				trd_cur_tax_amt
				, ptax_xrate
				, ptax_cur_amt_dec_place
				, xrate_rnd_typ);
		dtlR.setNumberNE("ptax_cur_tax_amt", ptax_cur_tax_amt);
		
		// 税込金額を換算する
		ptax_cur_inc_tax_amt = MAUCL_MCDataUtil.convToBaseCur(
				trd_cur_inc_tax_amt
				, ptax_xrate
				, ptax_cur_amt_dec_place
				, xrate_rnd_typ);
		dtlR.setNumberNE("ptax_cur_inc_tax_amt", ptax_cur_inc_tax_amt);
		
		// 加工単価を換算する
		if (!isNull(trd_cur_proc_upri)) {
			ptax_cur_proc_upri = MAUCL_MCDataUtil.convToBaseCur(
					trd_cur_proc_upri
					, ptax_xrate
					, ptax_cur_upri_dec_place
					, xrate_rnd_typ);
			dtlR.setNumberNE("ptax_cur_proc_upri", ptax_cur_proc_upri);
			
			ptax_cur_proc_amt = MAUCL_MCDataUtil.convToBaseCur(
					trd_cur_proc_amt
					, ptax_xrate
					, ptax_cur_amt_dec_place
					, xrate_rnd_typ);
			dtlR.setNumberNE("ptax_cur_proc_amt", ptax_cur_proc_amt);
		}
		
		// 有償支給単価を換算する
		if (!isNull(trd_cur_onr_prov_upri)) {
			ptax_cur_onr_prov_upri = MAUCL_MCDataUtil.convToBaseCur(
					trd_cur_onr_prov_upri
					, ptax_xrate
					, ptax_cur_upri_dec_place
					, xrate_rnd_typ);
			dtlR.setNumberNE("ptax_cur_onr_prov_upri", ptax_cur_onr_prov_upri);
			
			ptax_cur_onr_prov_amt = MAUCL_MCDataUtil.convToBaseCur(
					trd_cur_onr_prov_amt
					, ptax_xrate
					, ptax_cur_amt_dec_place
					, xrate_rnd_typ);
			dtlR.setNumberNE("ptax_cur_onr_prov_amt", ptax_cur_onr_prov_amt);
		}
		
		// 値引額を換算する
		if (!isNull(trd_cur_dscnt_amt)) {
			ptax_cur_dscnt_amt = MAUCL_MCDataUtil.convToBaseCur(
					  trd_cur_dscnt_amt
					, ptax_xrate
					, ptax_cur_amt_dec_place
					, xrate_rnd_typ);
			dtlR.setNumberNE("ptax_cur_dscnt_amt", ptax_cur_dscnt_amt);
		}
	}
	
	/**
	 * 源泉税率を計算し、dtlRに設定します（一覧形式用）
	 * @param dtlR　明細項目
	 * @see #setWtaxInfo (MCRow hdrR, MCRow dtlR)
	 */
	public static void setWtaxInfo (MCRow dtlR) {
		object(CLAZZ)._setWtaxInfo(dtlR);
	}
	protected void _setWtaxInfo (MCRow dtlR) {
		MCRow hdr = MCRow.create();
		if (isNull(dtlR.getNumberNE("wtax_rate"))) {
			return;
		}
		hdr.setNumberNE("trd_cur_amt_dec_place", dtlR.getNumber("trd_cur_amt_dec_place"));
		hdr.setStringNE("trd_cur_cd", dtlR.getString("trd_cur_cd"));
		hdr.setStringNE("base_cur_cd", dtlR.getString("base_cur_cd"));
		hdr.setStringNE("ptax_cur_cd", dtlR.getString("ptax_cur_cd"));
		hdr.setStringNE("wtax_rnd_typ", dtlR.getString("wtax_rnd_typ"));
		setWtaxInfo(hdr, dtlR);
	}
	/**
	 * 源泉税率を計算し、dtlRに設定します（単票形式用）
	 * hdrRには以下の項目が設定されている必要があります。<br>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>trd_cur_amt_dec_place</td><td>取引通貨金額小数部有効桁数</td></tr>
	 * <tr><td>wtax_rnd_typ</td><td>源泉徴収税端数処理区分</td></tr>
	 * <tr><td>trd_cur_cd</td><td>取引通貨ＣＤ</td></tr>
	 * <tr><td>base_cur_cd</td><td>基準通貨ＣＤ</td></tr>
	 * <tr><td>ptax_cur_cd</td><td>納税通貨ＣＤ</td></tr>
	 * </table>
	 * <br>
	 * dtlRには以下の項目が設定されている必要があります。<br>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>trd_cur_amt</td><td>金額</td></tr>
	 * <tr><td>wtax_rate</td><td>源泉税率</td></tr>
	 * </table>
	 * @param hdrR　ヘッダ項目
	 * @param dtlR　明細項目
	 */
	public static void setWtaxInfo (MCRow hdrR, MCRow dtlR) {
		object(CLAZZ)._setWtaxInfo(hdrR, dtlR);
	}
	protected void _setWtaxInfo (MCRow hdrR, MCRow dtlR) {
		// 税率
		MCNumber wtax_rate = dtlR.getNumberNE("wtax_rate");
		if (isNull(wtax_rate)) {
			return;
		}
		
		// 金額小数部有効桁数・端数処理区分
		MCNumber trd_cur_amt_dec_place = hdrR.getNumber("trd_cur_amt_dec_place");
		String wtax_rnd_typ = hdrR.getString("wtax_rnd_typ");
		// 通貨
		String trd_cur_cd = hdrR.getStringNE("trd_cur_cd");
		String base_cur_cd = hdrR.getStringNE("base_cur_cd");
		String ptax_cur_cd = hdrR.getStringNE("ptax_cur_cd");
		// 金額
		MCNumber trd_cur_amt = dtlR.getNumberNE("trd_cur_amt");
		
		
		if (isNullOr(trd_cur_cd, base_cur_cd, trd_cur_amt)) {
			return;
		}
		if (isSame(trd_cur_cd, base_cur_cd) && (isSame(trd_cur_cd, ptax_cur_cd) || isNull(ptax_cur_cd))) {
			//　基準通貨金額＝取引通貨金額＝納税通貨金額のとき、源泉税率を設定する（納税通貨がNULLの場合は比較対象からはずす）
			MCNumber wtax_amt = trd_cur_amt.multiply(wtax_rate.divide(100), trd_cur_amt_dec_place.intValue(), MAC_RND_TYP.toMC(wtax_rnd_typ));
			
			dtlR.setNumberNE("wtax_amt", wtax_amt);
		}
	}
	
	
	
	/**
	 * PurcUtil_Srch02オペレーション.<p>
	 *
	 */
	public class PurcUtil_Srch02 extends MSBDL_PurcUtil_MC_A.PurcUtil_Srch02 {
		
	
		@Override
		protected void call() {
			super.call();
		}
		

		@Override
		protected void doIt() {
			setNullVal();
			callUpriService();
			setDown();
		}


		protected void setNullVal() {
			for (PurcUtil_Srch02_DtlR upR : up0()) {
				upR.sno1(nvl(upR.sno1(), MAC_STR.NULL_VAL.value()));
				upR.sno2(nvl(upR.sno2(), MAC_STR.NULL_VAL.value()));
				upR.sno3(nvl(upR.sno3(), MAC_STR.NULL_VAL.value()));
				upR.sno4(nvl(upR.sno4(), MAC_STR.NULL_VAL.value()));
				upR.maker_cd(nvl(upR.maker_cd(), MAC_STR.NULL_VAL.value()));
			}

		}

		
		protected void setDown() {
			down0().setAll(up0());
		}

		protected void callUpriService() {
			MCList<PurcUtil_Srch02_DtlR> purcL = MCList.create(PurcUtil_Srch02_DtlR.class);
			MCList<PurcUtil_Srch02_DtlR> outsrcL = MCList.create(PurcUtil_Srch02_DtlR.class);
			for (PurcUtil_Srch02_DtlR upR : up0()) {
				// upR.purc_typは返品以外はNULL。
				//upR.purc_typがNULL（返品以外）か購買（返品）の場合、製造場所で判定
				if (isNull(upR.purc_typ()) || MAC_PURC_TYP.isPURC_ITM(upR.purc_typ())) {
					if (isNull(upR.mfg_loc_cd()) || MAC_STR.isNULL_VAL(upR.mfg_loc_cd())) {
						purcL.add(upR);
					}
					else {
						outsrcL.add(upR);
					}
				}
				// upR.purc_typが外注加工品（無償）、外注加工品（有償）
				else {
					outsrcL.add(upR);
				}
			}

			MABSL_PurcUpriService.PurcUpri_Sprt01 purcOpe = MABSL_PurcUpriService.crtPurcUpri_Sprt01();
			MSBCL_OutSrcInstService.OutSrcInst_Sprt01 procOpe = MSBCL_OutSrcInstService.crtOutSrcInst_Sprt01();

			addAll(purcOpe.up0(), purcL, createMap_PurcUpri_Sprt01_DtlR_PurcUtil_Srch02_DtlR());
			addAll(procOpe.up0(), outsrcL, createMap_OutSrcInst_Sprt01_DtlR_PurcUtil_Srch02_DtlR());
			if (purcOpe.up0().size() > 0) {
				purcOpe.exec();
			}
			if (procOpe.up0().size() > 0) {
				procOpe.exec();
			}
			
			// 購買品単価
			String[] destPurc = { PurcUtil_Srch02_DtlR.$trd_cur_upri, PurcUtil_Srch02_DtlR.$interim_flg };
			String[] srcPurc = { PurcUpri_Sprt01_DtlR.$upri, PurcUpri_Sprt01_DtlR.$interim_flg };
			copyByPegNo(up0(), destPurc, purcOpe.down0(), srcPurc);
			
			// 外注品単価
			String[] destProc = { PurcUtil_Srch02_DtlR.$trd_cur_upri, PurcUtil_Srch02_DtlR.$interim_flg, PurcUtil_Srch02_DtlR.$trd_cur_proc_upri, PurcUtil_Srch02_DtlR.$trd_cur_onr_prov_upri};
			String[] srcProc = { OutSrcInst_Sprt01_DtlR.$trd_cur_upri, OutSrcInst_Sprt01_DtlR.$interim_flg, OutSrcInst_Sprt01_DtlR.$trd_cur_proc_upri, OutSrcInst_Sprt01_DtlR.$trd_cur_onr_prov_upri};
			copyByPegNo(up0(), destProc, procOpe.down0(), srcProc);
			

		}
		
	

	}
	

	

	protected Map_PurcUpri_Sprt01_DtlR_PurcUtil_Srch02_DtlR<PurcUpri_Sprt01_DtlR, PurcUtil_Srch02_DtlR> createMap_PurcUpri_Sprt01_DtlR_PurcUtil_Srch02_DtlR() {
		return new Map_PurcUpri_Sprt01_DtlR_PurcUtil_Srch02_DtlR<PurcUpri_Sprt01_DtlR, PurcUtil_Srch02_DtlR>();
	}

	public class Map_PurcUpri_Sprt01_DtlR_PurcUtil_Srch02_DtlR<D extends PurcUpri_Sprt01_DtlR, S extends PurcUtil_Srch02_DtlR> extends
			MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcUpri_Sprt01_DtlR.$peg_no, PurcUtil_Srch02_DtlR.$peg_no);
			addColumnPathMap(PurcUpri_Sprt01_DtlR.$itm_cd, PurcUtil_Srch02_DtlR.$itm_cd);
			addColumnPathMap(PurcUpri_Sprt01_DtlR.$itm_sub1, PurcUtil_Srch02_DtlR.$itm_sub1);
			addColumnPathMap(PurcUpri_Sprt01_DtlR.$itm_sub2, PurcUtil_Srch02_DtlR.$itm_sub2);
			addColumnPathMap(PurcUpri_Sprt01_DtlR.$itm_sub3, PurcUtil_Srch02_DtlR.$itm_sub3);
			addColumnPathMap(PurcUpri_Sprt01_DtlR.$sppl_cd, PurcUtil_Srch02_DtlR.$sppl_cd);
			addColumnPathMap(PurcUpri_Sprt01_DtlR.$maker_cd, PurcUtil_Srch02_DtlR.$maker_cd);
			addColumnPathMap(PurcUpri_Sprt01_DtlR.$unit_cd, PurcUtil_Srch02_DtlR.$trd_unit_cd);
			addColumnPathMap(PurcUpri_Sprt01_DtlR.$qty, PurcUtil_Srch02_DtlR.$trd_unit_qty);
			addColumnPathMap(PurcUpri_Sprt01_DtlR.$cur_cd, PurcUtil_Srch02_DtlR.$cur_cd);
			addColumnPathMap(PurcUpri_Sprt01_DtlR.$loc_cd, PurcUtil_Srch02_DtlR.$in_to_loc_cd);
			addColumnPathMap(PurcUpri_Sprt01_DtlR.$dlv_cd, PurcUtil_Srch02_DtlR.$dlv_cd);
			addColumnPathMap(PurcUpri_Sprt01_DtlR.$wg_cd, PurcUtil_Srch02_DtlR.$wg_cd);
			addColumnPathMap(PurcUpri_Sprt01_DtlR.$dt, PurcUtil_Srch02_DtlR.$base_dt);
			addColumnPathMap(PurcUpri_Sprt01_DtlR.$grp_no, PurcUtil_Srch02_DtlR.$grp_no);		
		}
	}

	protected Map_OutSrcInst_Sprt01_DtlR_PurcUtil_Srch02_DtlR<OutSrcInst_Sprt01_DtlR,PurcUtil_Srch02_DtlR> createMap_OutSrcInst_Sprt01_DtlR_PurcUtil_Srch02_DtlR() {
		return new Map_OutSrcInst_Sprt01_DtlR_PurcUtil_Srch02_DtlR<OutSrcInst_Sprt01_DtlR, PurcUtil_Srch02_DtlR>();
	}

	public class Map_OutSrcInst_Sprt01_DtlR_PurcUtil_Srch02_DtlR<D extends OutSrcInst_Sprt01_DtlR, S extends PurcUtil_Srch02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.proc_upri_typ(MAC_PROC_UPRI_TYP.ITM.value());
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$peg_no, PurcUtil_Srch02_DtlR.$peg_no);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$grp_no, PurcUtil_Srch02_DtlR.$grp_no);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$itm_cd, PurcUtil_Srch02_DtlR.$itm_cd);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$itm_sub1, PurcUtil_Srch02_DtlR.$itm_sub1);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$itm_sub2, PurcUtil_Srch02_DtlR.$itm_sub2);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$itm_sub3, PurcUtil_Srch02_DtlR.$itm_sub3);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$sppl_cd, PurcUtil_Srch02_DtlR.$sppl_cd);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$maker_cd, PurcUtil_Srch02_DtlR.$maker_cd);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$trd_unit_cd, PurcUtil_Srch02_DtlR.$trd_unit_cd);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$trd_unit_qty, PurcUtil_Srch02_DtlR.$trd_unit_qty);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$in_to_loc_cd, PurcUtil_Srch02_DtlR.$in_to_loc_cd);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$dlv_cd, PurcUtil_Srch02_DtlR.$dlv_cd);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$base_unit_qty, PurcUtil_Srch02_DtlR.$base_unit_qty);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$base_dt, PurcUtil_Srch02_DtlR.$base_dt);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$tax_cd, PurcUtil_Srch02_DtlR.$tax_cd);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$outsrc_itm_ord_no, PurcUtil_Srch02_DtlR.$outsrc_itm_ord_no);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$mfg_inst_no, PurcUtil_Srch02_DtlR.$mfg_inst_no);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$bom_ptn, PurcUtil_Srch02_DtlR.$bom_ptn);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$mfg_loc_cd, PurcUtil_Srch02_DtlR.$mfg_loc_cd);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$sno1, PurcUtil_Srch02_DtlR.$sno1);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$sno2, PurcUtil_Srch02_DtlR.$sno2);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$sno3, PurcUtil_Srch02_DtlR.$sno3);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$sno4, PurcUtil_Srch02_DtlR.$sno4);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$trd_cur_cd, PurcUtil_Srch02_DtlR.$cur_cd);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$dlv_rqst_tm, PurcUtil_Srch02_DtlR.$rqst_dlv_rqst_dt);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$itmdtl_base_dt, PurcUtil_Srch02_DtlR.$itmdtl_base_dt);
			addColumnPathMap(OutSrcInst_Sprt01_DtlR.$not_add_up_qty_flg, PurcUtil_Srch02_DtlR.$not_add_up_qty_flg);
			
		}
	}
	/**
	 * PurcUtil_Srch03オペレーション.<p>
	 *
	 * 納品先情報を取得します<br>
	 */
	public class PurcUtil_Srch03 extends MSBDL_PurcUtil_MC_A.PurcUtil_Srch03 {
		protected FXUCL_MCDbcCache<MST_SLO_D_R> _sloDCache = null;
		protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache = null;
		protected FXUCL_MCDbcCache<MAM_STR_LN_R> _strLnCache = null;
		protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache = null;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// キャッシュの作成
			createCache();
			
			//　納品先情報取得処理
			for (PurcUtil_Srch03_DtlR r : up0()) {
				if(isNull(r.slo_d_no())) {
					continue;
				}
				MST_SLO_D_R sloDR = _sloDCache.get(r.slo_d_no());
				if (!MAC_SLO_PROC_TYP.isPURC_DDLV(sloDR.proc_typ())) {
					continue;
				}
				if (!isNull(sloDR)) {
					// 場所情報
					if (isNull(sloDR.loc_cd())) {
						r.in_to_loc_cd(sloDR.def_loc_cd());
					}
					else {
						r.in_to_loc_cd(sloDR.loc_cd());
					}
					// 棚・ライン
					if (isNull(sloDR.str_ln_cd())) {
						r.str_ln_cd(null);
					}
					else {
						r.str_ln_cd(sloDR.str_ln_cd());
					}
					
					// 場所に属する情報の補完
					MAM_LOC_R locR = _locCache.get(r.in_to_loc_cd());
					r.outsrc_sppl_cd(locR.sppl_cd());
					r.str_ln_tgt_flg(locR.str_ln_tgt_flg());
					r.loc_mng_typ(locR.loc_mng_typ());
					r.in_to_loc_cal_cd(locR.cal_cd());
					r.site_cd(locR.site_cd());
					r.lg_grp_cd(locR.lg_grp_cd());
					
					if (!isNull(sloDR.str_ln_cd()) && !MAC_STR.isNULL_VAL(sloDR.str_ln_cd())) {
						// 棚・ラインに属する情報の補完
						MAM_STR_LN_R strLnR = _strLnCache.get(sloDR.str_ln_cd());
						r.str_ln_nm(strLnR.str_ln_nm());
					}
					
					// 納品先情報
					MAM_BP_R dlvR = _bpCache.get(sloDR.dlv_cd());
					r.dlv_cd(sloDR.dlv_cd());
					r.dlv_sundry_flg(sloDR.dlv_sundry_flg());
					if (isNull(sloDR.dlv_nm())) {
						r.dlv_nm(dlvR.bp_nm());	
					}
					else {
						r.dlv_nm(sloDR.dlv_nm());	
					}
					r.dlv_cntct_dpt(sloDR.dlv_cntct_dpt());
					r.dlv_cntct_psn(sloDR.dlv_cntct_psn());
					r.dlv_zip_cd(sloDR.dlv_zip_cd());
					r.dlv_addr1(sloDR.dlv_addr1());
					r.dlv_addr2(sloDR.dlv_addr2());
					r.dlv_addr3(sloDR.dlv_addr3());
					r.dlv_addr4(sloDR.dlv_addr4());
					r.dlv_tel(sloDR.dlv_tel());
					r.dlv_fax(sloDR.dlv_fax());
					r.dlv_cal_cd(dlvR.dlv_cal_cd());
					r.dlv_lg_grp_cd(sloDR.dlv_lg_grp_cd());
					
					// 配送先情報
					MAM_BP_R tdlvR = _bpCache.get(sloDR.tdlv_cd());
					r.tdlv_cd(sloDR.tdlv_cd());
					r.tdlv_sundry_flg(sloDR.tdlv_sundry_flg());
					if (isNull(sloDR.tdlv_nm())) {
						r.tdlv_nm(tdlvR.bp_nm());
					}
					else {
						r.tdlv_nm(sloDR.tdlv_nm());
					}
					r.tdlv_cntct_dpt(sloDR.tdlv_cntct_dpt());
					r.tdlv_cntct_psn(sloDR.tdlv_cntct_psn());
					r.tdlv_zip_cd(sloDR.tdlv_zip_cd());
					r.tdlv_addr1(sloDR.tdlv_addr1());
					r.tdlv_addr2(sloDR.tdlv_addr2());
					r.tdlv_addr3(sloDR.tdlv_addr3());
					r.tdlv_addr4(sloDR.tdlv_addr4());
					r.tdlv_tel(sloDR.tdlv_tel());
					r.tdlv_fax(sloDR.tdlv_fax());
					r.tdlv_lg_grp_cd(sloDR.tdlv_lg_grp_cd());
				}
			}
			setDown();
		}
		
		/**
		 * キャッシュを作成します
		 */
		protected void createCache() {
			createSloDCache();
		}
		
		/**
		 * キャッシュ作成（受注明細）
		 */
		protected void createSloDCache() {
			MCList<PurcUtil_Srch03_DtlR> bindL = up0().groupBy(PurcUtil_Srch03_DtlR.$slo_d_no);
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
			_sloDCache = new FXUCL_MCDbcCache<MST_SLO_D_R>(sloDL, sloDL_bldr, bindL, PurcUtil_Srch03_DtlR.$slo_d_no);

			createBpCache(sloDL);
			createLocCache(sloDL);
		}
		/**
		 * キャッシュ作成（取引先マスタ）
		 */
		protected void createBpCache(MCList<MST_SLO_D_R> sloDL) {
			MCList<MAM_BP_R> bindL = MCList.create(MAM_BP_R.class);
			for (MST_SLO_D_R sloDR : sloDL) {
				MAM_BP_R dlvR = MAM_BP_R.create();
				dlvR.bp_cd(sloDR.dlv_cd());
				bindL.add(dlvR);
				
				MAM_BP_R tdlvR = MAM_BP_R.create();
				tdlvR.bp_cd(sloDR.tdlv_cd());
				bindL.add(tdlvR);
			}
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("T"));
			_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(bpL_bldr, bindL, MAM_BP_R.$bp_cd);
		}
		
		/**
		 * キャッシュ作成（場所マスタ）
		 * @param sloDL
		 */
		protected void createLocCache(MCList<MST_SLO_D_R> sloDL) {
			MCList<MST_SLO_D_R> bindL = sloDL.groupBy(MST_SLO_D_R.$loc_cd);
			MCList<MST_SLO_D_R> defLocBindL = sloDL.groupBy(MST_SLO_D_R.$def_loc_cd);
			
			MCIndexKey idxSloDL = sloDL.createIndex(MST_SLO_D_R.$loc_cd);
			for (MST_SLO_D_R r : defLocBindL) {
				if (!sloDL.contains(idxSloDL, r.def_loc_cd())) {
					MST_SLO_D_R tmpR = MST_SLO_D_R.create();
					tmpR.loc_cd(r.def_loc_cd());
					bindL.add(tmpR);
				}
			}
			
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
			_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(locL_bldr, bindL, MST_SLO_D_R.$loc_cd);
			createStrLnCache(sloDL);
		}
		
		/**
		 * キャッシュ作成（棚・ラインマスタ）
		 * @param locL
		 */
		protected void createStrLnCache(MCList<MST_SLO_D_R> sloDL) {
			MCQueryApiBuilder strLnL_bldr = MCQueryApiBuilder.create(MAM_STR_LN_R.create("T"));
			_strLnCache = new FXUCL_MCDbcCache<MAM_STR_LN_R>(strLnL_bldr, sloDL, MST_SLO_D_R.$loc_cd, MST_SLO_D_R.$str_ln_cd);
		}
		
		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
	}

	/**
	 * PurcUtil_Srch04オペレーション.<p>
	 *
	 * 購買状況区分を取得する<br>
	 */
	public class PurcUtil_Srch04 extends MSBDL_PurcUtil_MC_A.PurcUtil_Srch04 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			setPurcStsTyp();
			setDown();
			
		}

		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected void setPurcStsTyp(){

			MCList<MST_PO_D_R> wkPoDL = MCList.create(MST_PO_D_R.class);
			MCQueryApiBuilder wkPoDL_bldr = MCQueryApiBuilder.create(MST_PO_D_R.create("T"));
			dbWkDelete("MSBDL5040_MSW_PO_D_D03", wkPoDL_bldr.getBaseDbc());
			for(PurcUtil_Srch04_DtlR r : up0()){
				MST_PO_D_R dbR = MST_PO_D_R.create();
				dbR.po_d_no(r.po_d_no());
				wkPoDL.add(dbR);
			}
			dbWkInsert("MSBDL5040_MSW_PO_D_I02", wkPoDL, wkPoDL_bldr.getBaseDbc());
			
			MSW_PO_D_KEY_R key1 = MSW_PO_D_KEY_R.create("KEY1");
			MST_ARR_SCHD_R schd = MST_ARR_SCHD_R.create("SCHD");
			MCList<MST_ARR_PR_R> prL = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder prL_bldr = MCQueryApiBuilder.create(t);
			prL_bldr.addSelect(schd.arr_skip_flg);
			prL_bldr.addInnerJoin(key1, key1.po_d_no.eq(t.po_d_no));
			prL_bldr.addInnerJoin(schd, schd.arr_pr_no.eq(t.arr_pr_no));
			dbSelect("MSBDL5040_MST_ARR_PR_S03", prL, prL_bldr);
			dbWkDelete("MSBDL5040_MSW_PO_D_D04", wkPoDL_bldr.getBaseDbc());
			MCIndexKey key = prL.createIndex(MST_ARR_PR_R.$po_d_no);
				for (PurcUtil_Srch04_DtlR r : up0()) {
					// 発注明細に紐づく入荷予定全部
					MCList<MST_ARR_PR_R> schdL = prL.subList(key, r.po_d_no());
					// 入荷進捗情報は全行同じなのでget(0)
					MST_ARR_PR_R prR = schdL.get(0);
					//完了
					if (prR.purc_cmpl_flg() && prR.arr_cmpl_flg()) {
						r.purc_sts_typ(MSC_PURC_STS_TYP.COMPL.value());
						continue;
					}
					//仕入済（未着管理で仕入のみ完了）
					// 仕入対象外は除外。仕入数量が0でない、かつ仕入完了がオン、で判断する
					if (!prR.purc_qty().isZero() && prR.purc_cmpl_flg() && !prR.arr_cmpl_flg()) {
						r.purc_sts_typ(MSC_PURC_STS_TYP.PURC.value());
						continue;
					}
					//入荷済（通常管理で入荷のみ完了）
					//入荷不要の場合は入荷業務が行われないので、このステータスを使用しない 
				if (!prR.purc_cmpl_flg() && prR.arr_cmpl_flg() && !MCBooleanUtil.dbStringToBoolean(prR.getStringNE("arr_skip_flg"))) {
					r.purc_sts_typ(MSC_PURC_STS_TYP.ARR.value());
					continue;
				}

					//納入指示可能数を計算（＝入荷予定反映可能数）
					MCNumber subtractQty = MCNumber.ZERO;
					// 受領インボイス数量
					subtractQty = subtractQty.add(prR.rcpt_iv_qty());
					// 入荷数、仕入数のうち、大きいほう
					subtractQty = subtractQty.add(prR.arr_qty().lt(prR.purc_qty()) ? prR.purc_qty() : prR.arr_qty());
					// 入荷打切数、仕入打切数のうち、大きいほう
					subtractQty = subtractQty.add(prR.arr_schd_abort_qty().lt(prR.purc_schd_abort_qty()) ? prR.purc_schd_abort_qty() : prR.arr_schd_abort_qty());

				//残数
				MCNumber remQty = prR.base_unit_qty().subtract(subtractQty);
				// 残数以上（lte）としているのは、一部入荷、一部仕入が行われるとトランの状態として
				// 入荷予定反映可能な残数≦納入指示回答反映済数　となるため。
				
				//納入指示回答反映済
				if (!prR.dlv_inst_prms_refl_qty().isZero() && remQty.lte(prR.dlv_inst_prms_refl_qty())) {
					r.purc_sts_typ(MSC_PURC_STS_TYP.DLV_INST_PRMS_REFL.value());
					continue;
				}
				//納入指示回答受領済
				if (!prR.dlv_inst_prms_rcpt_qty().isZero() && remQty.lte(prR.dlv_inst_prms_rcpt_qty())) {
					r.purc_sts_typ(MSC_PURC_STS_TYP.DLV_INST_PRMS_RCPT.value());
					continue;
				}
				//納入指示済
				if (!prR.dlv_inst_qty().isZero() && remQty.lte(prR.dlv_inst_qty())) {
					r.purc_sts_typ(MSC_PURC_STS_TYP.DLV_INST.value());
					continue;
				}
				//納期回答反映済
				if (!prR.prms_refl_qty().isZero() && remQty.lte(prR.prms_refl_qty())) {
					r.purc_sts_typ(MSC_PURC_STS_TYP.PRMS_REFL.value());
					continue;
				}

				//納期回答受領済
				if (!prR.prms_rcpt_qty().isZero() && remQty.lte(prR.prms_rcpt_qty())) {
					r.purc_sts_typ(MSC_PURC_STS_TYP.PRMS_RCPT.value());
					continue;
				}

				r.purc_sts_typ(MSC_PURC_STS_TYP.PO.value());
			}
		}
		

	}

	/**
	 * 詳細が存在するかどうかを確認します。<p>
	 * 明細に対応する詳細が存在しない場合、メッセージを格納したリストを返します。<br>
	 * 明細にはpeg_no、詳細にはdtl_peg_noの項目が存在する必要があります。
	 * @param dtlL 明細行リスト
	 * @param ioL 詳細行リスト
	 * @return メッセージリスト
	 */
	public static MCMessageList checkAtLeastOneIo(MCList<? extends MCRow> dtlL, MCList<? extends MCRow> ioL) {
		return object(CLAZZ)._checkAtLeastOneIo(dtlL, ioL);
	}
	protected MCMessageList _checkAtLeastOneIo(MCList<? extends MCRow> dtlL, MCList<? extends MCRow> ioL) {
		MCMessageList msgL = new MCMessageList();
		
		MCIndexKey idxKey = ioL.createIndex("dtl_peg_no");
		for (MCRow dtlRow : dtlL) {
			if (dtlRow.isStatusDelete()) {
				continue;
			}
			MCList<?> tgtIoL = ioL.subList(idxKey, dtlRow.getNumber("peg_no"));
			
			int cnt = tgtIoL.subList(MCRow.Status.CREATE).size()
					+ tgtIoL.subList(MCRow.Status.MODIFY).size()
					+ tgtIoL.subList(MCRow.Status.NONE).size();
			
			if (isSame(cnt, 0)) {
				msgL.add(new MCMessage(dtlRow, null, MAUDL0012, toDispGUIIndex(dtlRow)));
			}
			
		}
		
		return msgL;
	}
	/**
	 * 値引額のチェックをします。
	 * @param MCRow 値引額を保持するコンテナ
	 * @param trdCurUpriCol 取引通貨単価のカラム名
	 * @param trdCurDscntAmtCol 取引通貨値引額のカラム名
	 * @return メッセージリスト
	 */
	public static MCMessageList checkDscntAmt(MCRow r, String trdCurUpriCol, String trdCurDscntAmtCol) {
		return object(CLAZZ)._checkDscntAmt(r, trdCurUpriCol, trdCurDscntAmtCol);
	}
	protected MCMessageList _checkDscntAmt(MCRow r, String trdCurUpriCol, String trdCurDscntAmtCol) {
		MCMessageList msgL = new MCMessageList();
		MCNumber da = r.getNumber(trdCurDscntAmtCol);
		if(!isNull(da) 
				&& MCNumber.ZERO.eq(r.getNumber(trdCurUpriCol))
				&& MCNumber.ZERO.lte(da)) {
				msgL.add(new MCMessage(r, trdCurDscntAmtCol, MSBDL0191, toDispGUIIndex(r)));
			}
		return msgL;
	}	
	/**
	 * 算出して設定する必要のある有効成分情報を設定します。<p>
	 * 以下の項目の値を使用します。<br>
	 * <li>有効成分対象：cont_fctr_flg
	 * <li>基準単位数量：base_unit_qty
	 * <li>標準有効成分係数：std_cont_fctr
	 * <li>有効成分小数部有効桁数：cont_fctr_dec_place
	 * <li>有効成分換算端数処理区分：cont_fctr_rnd_typ
	 * <li>仕入有効成分：purc_cont_qty
	 * <li>仕入有効成分係数：purc_cont_fctr
	 */
	public static void setCont(MCRow ioR) {
		object(CLAZZ)._setCont(ioR);
	}
	protected void _setCont(MCRow ioR) {
		if (ioR.getBooleanNE("cont_fctr_flg")) {
			ioR.setNumberNE("std_cont_qty", MAUCL_MCDataUtil.convToContFctrUnit(
					ioR.getNumberNE("base_unit_qty"), 
					ioR.getNumberNE("std_cont_fctr"), 
					ioR.getNumberNE("cont_fctr_dec_place"),
					ioR.getStringNE("cont_fctr_rnd_typ")));
			
			//仕入有効成分がない場合は標準有効成分を仕入有効成分として使用する。
			if (isNull(ioR.getNumberNE("purc_cont_qty"))) {
				ioR.setNumberNE("purc_cont_fctr", ioR.getNumberNE("std_cont_fctr"));
				ioR.setNumberNE("purc_cont_qty", ioR.getNumberNE("std_cont_qty"));
			}
			else {
				ioR.setNumberNE("purc_cont_fctr", MAUCL_MCDataUtil.calcContFctr(
						ioR.getNumberNE("base_unit_qty"), 
						ioR.getNumberNE("purc_cont_qty"), 
						ioR.getNumberNE("cont_fctr_dec_place")));	
			}
		}
	}
	

	/**
	 * 詳細の有効成分情報を明細に追加します。<p>
	 * 以下の項目の値を使用します。<br>
	 * <li>有効成分対象：cont_fctr_flg
	 * <li>基準単位数量：base_unit_qty
	 * <li>有効成分小数部有効桁数：cont_fctr_dec_place
	 * <li>有効成分換算端数処理区分：cont_fctr_rnd_typ
	 * <li>仕入有効成分：purc_cont_qty
	 * <li>仕入有効成分係数：purc_cont_fctr
	 * <li>標準有効成分：std_cont_qty
	 * <li>標準有効成分係数：std_cont_fctr
	 * <li>有効成分単位：cont_fctr_unit_cd
	 * <li>有効成分単位名：cont_fctr_unit_nm
	 */
	public static void addCont(MCRow dR, MCRow ioR) {
		object(CLAZZ)._addCont(dR, ioR);
	}
	protected void _addCont(MCRow dR, MCRow ioR) {
		Boolean cf = ioR.getBooleanNE("cont_fctr_flg");
		if (cf) {
			dR.setBooleanNE("cont_fctr_flg", cf);
			MCNumber sq = nvl(dR.getNumberNE("purc_cont_qty"), MCNumber.ZERO);
			dR.setNumberNE("std_cont_qty", sq.add(ioR.getNumberNE("std_cont_qty")));
			dR.setNumberNE("std_cont_fctr", ioR.getNumberNE("std_cont_fctr"));//固定
			
			MCNumber dq = nvl(dR.getNumberNE("purc_cont_qty"), MCNumber.ZERO);
			dR.setNumberNE("purc_cont_qty", dq.add(ioR.getNumberNE("purc_cont_qty")));
				
			dR.setStringNE("cont_fctr_unit_cd", ioR.getStringNE("cont_fctr_unit_cd"));
			dR.setStringNE("cont_fctr_unit_nm", ioR.getStringNE("cont_fctr_unit_nm"));
			dR.setNumberNE("cont_fctr_dec_place", ioR.getNumberNE("cont_fctr_dec_place"));
			dR.setStringNE("cont_fctr_rnd_typ", ioR.getStringNE("cont_fctr_rnd_typ"));
	
			MSBDL_PurcUtil.setCont(dR);
		}		
	}
	/**
	 * 基準単位数量から取引単位数量に換算します。<p>
	 * 換算時に余りが出る場合はnullを返します。<br>
	 * 基準単位の小数部有効桁数及び端数処理区分の項目名は以下の名称を使用します。<br>
	 * <li>小数部有効桁数：base_unit_dec_place
	 * <li>端数処理区分：base_unit_rnd_typ
	 */
	public static MCNumber cnvBaseToTrdUnitQty(
			MCNumber baseUnitQty, MCRow rsltR,
			MCNumber convBaseQty, MCNumber convQty, MCNumber decPlace, String rndTyp) {
		return object(CLAZZ)._cnvBaseToTrdUnitQty(baseUnitQty, rsltR, convBaseQty, convQty, decPlace, rndTyp);
	}
	protected MCNumber _cnvBaseToTrdUnitQty(
		MCNumber baseUnitQty, MCRow rsltR,
		MCNumber convBaseQty, MCNumber convQty, MCNumber decPlace, String rndTyp) {
		// 基準単位数量→取引単位数量
		MCNumber trdUnitQty
			= rvrsBaseUnitConv(
				baseUnitQty, convBaseQty, convQty, decPlace, rndTyp);
		// 取引単位数量→基準単位数量
		MCNumber cnvQty
			= convToBaseUnit(
				trdUnitQty, convBaseQty, convQty, 
				rsltR.getNumber("base_unit_dec_place"), rsltR.getString("base_unit_rnd_typ"));
		// 基準単位数量⇔取引単位数量に換算できた場合のみ、取引単位数量を返す
		if (baseUnitQty.eq(cnvQty)) {
			return trdUnitQty;
		}
		return null;
	}
	
	/**
	 * エラーをグループ内で展開します。<p>
	 * エラーではなかった行に以下を設定します。<br>
	 * <li>err_flg=true
	 * <li>rtn_sts_typ=ERR
	 * <li>メッセージプール=MSBDL0134<br>
	 * グループ項目がリストにない場合は例外をThrowします。
	 * @return グループリスト。グループ項目未指定またはリストがnullか空の場合はnull
	 */
	public static <R extends MCRow> MCList<R>[] expandErr(String[] grp, MCList<R> l) {
		return object(CLAZZ)._expandErr(grp, l);
	}
	protected <R extends MCRow> MCList<R>[]  _expandErr(String[] grp, MCList<R> l) {
		if (grp == null || grp.length <= 0 || l == null) {
			return null;
		}
		
		MCList<R>[] gls = l.groupList(grp);
		for (MCList<R> gl : gls) {
			boolean hasErr = false;
			for(R r : gl) {
				if (r.getBooleanNE("err_flg")) {
					hasErr = true;
					break;
				}
			}
			if (hasErr) {
				gl.forEach(r -> {
					if (!r.getBooleanNE("err_flg")) {
						MCMessagePool.add(new MCMessage(r, null, MSBDL0134, toDispGUIIndex(r)));
						r.setBooleanNE("err_flg", true);
						r.setStringNE("rtn_sts_typ", MAC_RTN_STS_TYP.ERR.value());
					}
				});
			}
		}
		return gls;
	}

	protected MCList<MST_PO_R> _poL = null;
	protected MCList<MST_SLO_R> _sloL = null;
	protected MCList<MSVT_LOT_LIST_R> _lotL = null;
	protected MCList<MST_IV_R> _ivL = null;
	protected MCList<MST_RCPT_IV_R> _rcptIvL = null;
	
	protected MCIndexKey _idxPoL = null;
	protected MCIndexKey _idxSloL = null;
	protected MCIndexKey _idxBdLotL = null;
	protected MCIndexKey _idxBdIvL = null;
	protected MCIndexKey _idxBdRcptIvL = null;
	
	/**
	 * 負担関連の項目に入力されたＮＯ，ロット等の存在チェックを行う為データを取得します。<br>
	 * 明細行の負担項目でない発注ＮＯ、受注ＮＯもデータ取得の対象になります。<br>
	 * @param paramL 以下のいずれかの項目を含む電文リスト<br>
	 * <li>発注ＮＯ<li>受注ＮＯ<li>負担発注ＮＯ<li>負担受注ＮＯ<li>負担ロットＮＯ(負担品目ＣＤ、負担枝番１～３がセットで必要です)
	 * <li>負担サブロットＮＯ(負担品目ＣＤ、負担枝番１～３、負担ロットＮＯがセットで必要です)<li>負担インボイスＮＯ
	 */
	public static void getDataForExistChk(MCList<?> paramL) {
		object(CLAZZ)._getDataForExistChk(paramL);
	}
	protected void _getDataForExistChk(MCList<?> paramL) {
		getPoList(paramL);
		getSloList(paramL);
		getLotList(paramL);
		getBdIvList(paramL);
		getBdRcptIvList(paramL);
	}

	/**
	 * 発注ヘッダのリストを取得します。<br>
	 * @param paramL 発注ＮＯを含む電文リスト
	 */
	public static void getPoList(MCList<?> paramL) {
		object(CLAZZ)._getPoList(paramL);
	}
	protected void _getPoList(MCList<?> paramL) {
		MCList<MST_PO_R> bindL = MCList.create(MST_PO_R.class);
		for (MCRow r : paramL) {
			String poNo = r.getStringNE("po_no");
			String bdPoNo = r.getStringNE("bd_po_no");
			if (!isNull(poNo)) {
				MST_PO_R bindR = MST_PO_R.create();
				bindR.po_no(poNo);
				bindL.add(bindR);
			}
			if (!isNull(bdPoNo)) {
				MST_PO_R bindR = MST_PO_R.create();
				bindR.po_no(bdPoNo);
				bindL.add(bindR);
			}
		}		
		_poL = MCList.create(MST_PO_R.class);
		MST_PO_R poL_t = MST_PO_R.create("T");
		MCQueryApiBuilder poL_bldr = MCQueryApiBuilder.create(poL_t);
		poL_bldr.setSelect(poL_t.po_no);
		poL_bldr.addWhereWithAnd(poL_t.can_flg.eq(value(false)));
		poL_bldr.addWhereWithAnd(poL_t.po_no.eq(bind("po_no")));
		dbSelect("MSBDL5040_MST_PO_S02", _poL, poL_bldr, bindL.groupBy(MST_PO_R.$po_no));
		_idxPoL = _poL.createIndex(MST_PO_R.$po_no);
	}
	
	/**
	 * 受注ヘッダのリストを取得します。<br>
	 * @param paramL 受注ＮＯを含む電文リスト
	 */
	public static void getSloList(MCList<?> paramL) {
		object(CLAZZ)._getSloList(paramL);
	}
	protected void _getSloList(MCList<?> paramL) {
		MCList<MST_SLO_R> bindL = MCList.create(MST_SLO_R.class);
		for (MCRow r : paramL) {
			String sloNo = r.getStringNE("slo_no");
			String bdSloNo = r.getStringNE("bd_slo_no");
			if (!isNull(sloNo)) {
				MST_SLO_R bindR = MST_SLO_R.create();
				bindR.slo_no(sloNo);
				bindL.add(bindR);
			}
			if (!isNull(bdSloNo)) {
				MST_SLO_R bindR = MST_SLO_R.create();
				bindR.slo_no(bdSloNo);
				bindL.add(bindR);
			}
		}
		_sloL = MCList.create(MST_SLO_R.class);
		MST_SLO_R sloL_t = MST_SLO_R.create("T");
		MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(sloL_t);
		sloL_bldr.setSelect(sloL_t.slo_no);
		sloL_bldr.addWhereWithAnd(sloL_t.can_flg.eq(value(false)));
		sloL_bldr.addWhereWithAnd(sloL_t.slo_no.eq(bind("slo_no")));
		dbSelect("MSBDL5040_MST_SLO_S01", _sloL, sloL_bldr, bindL.groupBy(MST_SLO_R.$slo_no));
		_idxSloL = _sloL.createIndex(MST_SLO_R.$slo_no);
	}
	
	/**
	 * ロット情報のリストを取得します。<br>
	 * @param paramL 負担品目、負担ロット、負担サブロットを含む電文リスト
	 */
	public static void getLotList(MCList<?> paramL) {
		object(CLAZZ)._getLotList(paramL);
	}
	protected void _getLotList(MCList<?> paramL) {
		_lotL = MCList.create(MSVT_LOT_LIST_R.class);
		MSVT_LOT_LIST_R lotL_t = MSVT_LOT_LIST_R.create("T");
		MCQueryApiBuilder lotL_bldr = MCQueryApiBuilder.create(lotL_t);
		lotL_bldr.addWhereWithAnd(lotL_t.itm_cd.eq(bind("bd_itm_cd")));
		lotL_bldr.addWhereWithAnd(lotL_t.itm_sub1.eq(bind("bd_itm_sub1")));
		lotL_bldr.addWhereWithAnd(lotL_t.itm_sub2.eq(bind("bd_itm_sub2")));
		lotL_bldr.addWhereWithAnd(lotL_t.itm_sub3.eq(bind("bd_itm_sub3")));
		lotL_bldr.addWhereWithAnd(lotL_t.lot_no.eq(bind("bd_lot_no")));
		lotL_bldr.addWhereWithAnd(lotL_t.sublot_no.eq(nvl(bind("bd_sublot_no"), value(MAC_STR.NULL_VAL.value()) )));
		dbSelect("MSBDL5040_MSVT_LOT_LIST_S01", _lotL, lotL_bldr, paramL);
		_idxBdLotL = _lotL.createIndex(lotL_bldr.getBaseDbc().getKeyColumn());		
	}
	
	/**
	 * インボイスのリストを取得します。<br>
	 * @param paramL 負担インボイスＮＯを含む電文リスト
	 */
	public static void getBdIvList(MCList<?> paramL) {
		object(CLAZZ)._getBdIvList(paramL);
	}
	protected void _getBdIvList(MCList<?> paramL) {
		_ivL = MCList.create(MST_IV_R.class);
		MST_IV_R ivL_t = MST_IV_R.create("T");
		MCQueryApiBuilder ivL_bldr = MCQueryApiBuilder.create(ivL_t);
		ivL_bldr.setSelect(ivL_t.iv_no);
		ivL_bldr.setWhere(ivL_t.iv_no.eq(bind("bd_iv_no")));
		dbSelect("MSBDL5040_MST_IV_S01", _ivL, ivL_bldr, paramL);
		_idxBdIvL = _ivL.createIndex(MST_IV_R.$iv_no);
	}
	
	/**
	 * 受領インボイスのリストを取得します。<br>
	 * @param paramL 負担インボイスＮＯを含む電文リスト
	 */
	public static void getBdRcptIvList(MCList<?> paramL) {
		object(CLAZZ)._getBdRcptIvList(paramL);
	}
	protected void _getBdRcptIvList(MCList<?> paramL) {
		_rcptIvL = MCList.create(MST_RCPT_IV_R.class);
		MST_RCPT_IV_R rcptIvL_t = MST_RCPT_IV_R.create("T");
		MCQueryApiBuilder rcptIvL_bldr = MCQueryApiBuilder.create(rcptIvL_t);
		rcptIvL_bldr.setSelect(rcptIvL_t.rcpt_iv_no);
		rcptIvL_bldr.setWhere(rcptIvL_t.rcpt_iv_no.eq(bind("bd_iv_no")));
		dbSelect("MSBDL5040_MST_RCPT_IV_S01", _rcptIvL, rcptIvL_bldr, paramL);
		_idxBdRcptIvL = _rcptIvL.createIndex(MST_RCPT_IV_R.$rcpt_iv_no);
	}
	
	/**
	 * 発注ＮＯが発注ヘッダに存在するかチェックします。<br>
	 * @param poNo チェック対象の発注ＮＯ
	 * @return 存在する場合はtrue, 存在しない場合はfalseを返します。
	 */
	public static boolean existsPoNo(String poNo) {
		return object(CLAZZ)._existsPoNo(poNo);
	}
	protected boolean _existsPoNo(String poNo) {
		MST_PO_R po = _poL.getFirst(_idxPoL, poNo);
		return isNull(po) ? false : true;
	}
	
	/**
	 * 受注ＮＯが受注ヘッダに存在するかチェックします。<br>
	 * @param sloNo チェック対象の受注ＮＯ
	 * @return 存在する場合はtrue, 存在しない場合はfalseを返します。
	 */
	public static boolean existsSloNo(String sloNo) {
		return object(CLAZZ)._existsSloNo(sloNo);
	}
	protected boolean _existsSloNo(String sloNo) {
		MST_SLO_R slo = _sloL.getFirst(_idxSloL, sloNo);
		return isNull(slo) ? false : true;
	}
	
	/**
	 * 負担インボイスＮＯがインボイス、または受領インボイスに存在するかチェックします。
	 * @param bdIvNo 負担インボイスＮＯ
	 * @return 存在する場合はtrue, 存在しない場合はfalseを返します。
	 */
	public static boolean existsBdIvNo(String bdIvNo) {
		return object(CLAZZ)._existsBdIvNo(bdIvNo);
	}
	protected boolean _existsBdIvNo(String bdIvNo) {
		if (isNull(_ivL.getFirst(_idxBdIvL, bdIvNo))) {
			if (isNull(_rcptIvL.getFirst(_idxBdRcptIvL, bdIvNo))) {
				return false;
			}
		}
		return true;
	}

	//FMCB CUSTOM END
}