package mcframe.serverMSBE.MSBEL5220;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5220.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5200.*;
import mcframe.serverMSBD.MSBDL5190.*;
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBE.MSBEL5550.*;
import mcframe.serverMSBE.MSBEL5270.*;
import mcframe.serverMSBF.MSBFL5100.*;
import mcframe.serverMSBF.MSBFL5200.*;
import mcframe.serverMSBI.MSBIL5010.*;
import mcframe.serverMAUC.MAUCL1060.*;
import mcframe.serverFXUC.FXUCL0030.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBE.MSBEL5040.*;
import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverMSUC.MSUCL0010.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSBA.MSBAL5100.*;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSBB.MSBBL6080.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import java.util.Map;
import java.util.HashMap;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_XfrActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_XfrActService_MC extends MSBEL_XfrActService_MC_A{
	//FMCB CUSTOM START

	/**
	 * XfrAct_Chk01オペレーション.<p>
	 *
	 * 移動実績が更新可能かチェックする<br>
	 */
	public class XfrAct_Chk01 extends MSBEL_XfrActService_MC_A.XfrAct_Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// キャッシュの取得
			initCache(up0(), true);
			initCache(up0(), false);
			chkXfrAct(up0());
			// ロットのチェック
			chkLot(up0());
			// 移動引当状況のチェック
			chkXfrAlloc(up0());
			// 支給実績サービスのチェック（返品）
			chkProvRtnActSv(up0());
			// VMI計上サービスのチェック
			chkVmiSv(up0());
			// 支給実績サービスのチェック
			chkProvActSv(up0());
			// 締日チェック
			chkCl(up0());
			// 出荷時構成チェック
			chkLotTrace(up0());
			// 出荷可能チェック
			chkPlntAprv(up0());
			// 在庫・入庫予定存在チェック
			// ※このチェックはすべてのチェックが完了してから実施する必要があります。カスタマイズ等でチェックを追加する場合は、これより前に追加してください。
			chkMinusStk(up0(), up1());
			// 下り電文の設定
			setDown(up0(), down0());
		}
	}

	/**
	 * XfrAct_Chk02オペレーション.<p>
	 *
	 * 移動実績が更新可能かチェックする<br>
	 */
	public class XfrAct_Chk02 extends MSBEL_XfrActService_MC_A.XfrAct_Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCList<XfrActChk_HdrDtlR> chkL = MCList.create(XfrActChk_HdrDtlR.class);

			// キャッシュの取得
			initCache(up0(), true);
			// チェック対象の取得
			getChkL(up0(), chkL);
			// キャッシュの取得
			initCache(chkL, false);

			// 移動引当状況のチェック
			chkXfrAlloc(chkL);
			// 支給実績サービスのチェック（返品）
			chkProvRtnActSv(chkL);
			// VMI計上サービスのチェック
			chkVmiSv(chkL);
			// 支給実績サービスのチェック
			chkProvActSv(chkL);
			// 締日チェック
			chkCl(chkL);
			// 下り電文の設定
			setDown(chkL, down0());
		}

		protected void getChkL(MCList<XfrActChk_HdrDtlR> up0, MCList<XfrActChk_HdrDtlR> chkL) {
			for (XfrActChk_HdrDtlR upR :up0) {
				MST_XFR_ACT_R hdrR = getXfrActCache().get(upR.xfr_act_no());

				for (MST_XFR_ACT_D_R dtlR :getXfrActDtlCache().getByActNo(upR.xfr_act_no())) {
					XfrActChk_HdrDtlR r = chkL.add();
					r.peg_no(upR.peg_no());
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					r.xfr_alloc_sts_no(dtlR.xfr_alloc_sts_no());
					r.xfr_act_d_no(dtlR.xfr_act_d_no());
					r.wg_cd(hdrR.wg_cd());
					r.lg_grp_cd(hdrR.lg_grp_cd());
					r.gi_loc_cd(dtlR.gi_loc_cd());
					r.gr_loc_cd(hdrR.gr_loc_cd());
					r.xfr_dt(hdrR.xfr_dt());
					r.ac_dt(hdrR.ac_dt());
					r.can_ac_dt(upR.can_ac_dt());
					r.rsn_cd(dtlR.rsn_cd());
					r.itm_cd(dtlR.itm_cd());
					r.itm_sub1(dtlR.itm_sub1());
					r.itm_sub2(dtlR.itm_sub2());
					r.itm_sub3(dtlR.itm_sub3());
					r.stk_id_typ(dtlR.stk_id_typ());
					r.stk_bp_cd(dtlR.stk_bp_cd());
					r.trd_unit_cd(dtlR.trd_unit_cd());
					r.trd_unit_qty(dtlR.trd_unit_qty());
				}
			}
		}
	}

	protected void initCache(MCList<XfrActChk_HdrDtlR> up0, boolean flg) {
		if (flg) {
			initXfrActCache(up0);
			initXfrActDtlCache(up0);
		}
		else {
			initGiLocCache(up0);
			initGrLocCache(up0);

			initProvActCache(up0);
			initPurcActDCache(up0);
		}
	}

	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSBEL_XfrActService> CLAZZ = MSBEL_XfrActService.class;

	//- 場所マスタ検索（出庫場所） ---------------------------------------------
	protected MAM_LOC_R getGiLoc(XfrAct_DtlR dtlR) {
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MAM_LOC_R dbc = MAM_LOC_R.create();
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.wg_cd);
		dbSelectKey("MSBEL5220_MAM_LOC_S01", dbc, dbc_bldr, dtlR.gi_loc_cd());
		
		return dbc;
	}
	
	protected static void initGiLocCache(MCList<? extends MCRow> dtlL) {
		object(CLAZZ)._initGiLocCache(dtlL);
	}
	protected FXUCL_MCDbcCache<MAM_LOC_R> _giLocCache = null;
	protected void _initGiLocCache(MCList<? extends MCRow> dtlL) {
		MAM_LOC_R t = MAM_LOC_R.create("T");

		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		MAM_BP_R m = MAM_BP_R.create("M");
		dbcL_bldr.setSelect(t.wg_cd, t.sppl_cd, t.gi_vmi_flg, t.site_cd, t.loc_mng_typ, m.repurc_obli_flg);
		dbcL_bldr.addLeftOuterJoin(m, bracket(t.sppl_cd.eq(m.bp_cd)));
		
		MCRow tmpR = dtlL.createRow();
		if (tmpR instanceof XfrActChk_HdrDtlR) {
			_giLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, dtlL, XfrActChk_HdrDtlR.$gi_loc_cd);
		}
		else if (tmpR instanceof XfrAct_HdrDtlR) {
			_giLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, dtlL, XfrActChk_HdrDtlR.$gi_loc_cd);
		}
	}
	protected static FXUCL_MCDbcCache<MAM_LOC_R> getGiLocCache() {
		return object(CLAZZ)._giLocCache;
	}

	//- 場所マスタ検索（入庫場所） ---------------------------------------------
	protected static void initGrLocCache(MCList<XfrActChk_HdrDtlR> dtlL) {
		object(CLAZZ)._initGrLocCache(dtlL);
	}
	protected FXUCL_MCDbcCache<MAM_LOC_R> _grLocCache = null;
	protected void _initGrLocCache(MCList<XfrActChk_HdrDtlR> dtlL) {
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.loc_nm, t.sppl_cd, t.site_cd, t.loc_mng_typ, MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("xfr_dt"), value(MAC_LOC_ADDR_TYP.ZIP_CD.value()), nullValue()).as("dlv_zip_cd"), MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("xfr_dt"), value(MAC_LOC_ADDR_TYP.ADDR1.value()), nullValue()).as("dlv_addr1"), MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("xfr_dt"), value(MAC_LOC_ADDR_TYP.ADDR2.value()), nullValue()).as("dlv_addr2"), MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("xfr_dt"), value(MAC_LOC_ADDR_TYP.ADDR3.value()), nullValue()).as("dlv_addr3"), MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("xfr_dt"), value(MAC_LOC_ADDR_TYP.ADDR4.value()), nullValue()).as("dlv_addr4"), MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("xfr_dt"), value(MAC_LOC_ADDR_TYP.TEL.value()), nullValue()).as("dlv_tel"), MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("xfr_dt"), value(MAC_LOC_ADDR_TYP.FAX.value()), nullValue()).as("dlv_fax"));

		_grLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, dtlL, XfrActChk_HdrDtlR.$gr_loc_cd);
	}
	protected static FXUCL_MCDbcCache<MAM_LOC_R> getGrLocCache() {
		return object(CLAZZ)._grLocCache;
	}

	//- 移動実績を検索 ---------------------------------------------
	protected static void initXfrActCache(MCList<XfrActChk_HdrDtlR> dtlL) {
		object(CLAZZ)._initXfrActCache(dtlL);
	}
	protected FXUCL_MCDbcCache<MST_XFR_ACT_R> _xfrActCache = null;
	protected void _initXfrActCache(MCList<XfrActChk_HdrDtlR> dtlL) {
		_xfrActCache = new FXUCL_MCDbcCache<MST_XFR_ACT_R>(MCQueryApiBuilder.create(MST_XFR_ACT_R.create("T")),
				dtlL, XfrActChk_HdrDtlR.$xfr_act_no);
	}
	protected static FXUCL_MCDbcCache<MST_XFR_ACT_R> getXfrActCache() {
		return object(CLAZZ)._xfrActCache;
	}

	//- 移動実績明細を検索 ---------------------------------------------
	protected XfrActDtlCache _xfrActDtlCache = null;
	protected static void initXfrActDtlCache(MCList<XfrActChk_HdrDtlR> dtlL) {
		object(CLAZZ)._initXfrActDtlCache(dtlL);
	}
	protected void _initXfrActDtlCache(MCList<XfrActChk_HdrDtlR> dtlL) {
		_xfrActDtlCache = new XfrActDtlCache(dtlL);
	}

	protected static XfrActDtlCache getXfrActDtlCache() {
		return object(CLAZZ)._xfrActDtlCache;
	}

	public class XfrActDtlCache {
		protected MCIndexKey _xfrActDtlByActNoIdx = null;
		protected MCIndexKey _xfrActDtlByActDNoIdx = null;
		protected MCIndexKey _xfrActDtlByDlvSlipNoIdx = null;
		protected MCList<MST_XFR_ACT_D_R> _xfrActDtlCache = MCList.create(MST_XFR_ACT_D_R.class);
		protected XfrActDtlCache(MCList<XfrActChk_HdrDtlR> dtlL) {
			MST_XFR_ACT_D_R t = MST_XFR_ACT_D_R.create("T");
			MCQueryApiBuilder _xfrActDtlCache_bldr = MCQueryApiBuilder.create(t);
			_xfrActDtlCache_bldr.addWhereWithAnd(t.xfr_act_no.eq(bind("xfr_act_no")));
			dbSelect("MSBEL5220_MST_XFR_ACT_D_S01", _xfrActDtlCache, _xfrActDtlCache_bldr, dtlL.groupBy(XfrActChk_HdrDtlR.$xfr_act_no));
			_xfrActDtlByActNoIdx = _xfrActDtlCache.createIndex(XfrActChk_HdrDtlR.$xfr_act_no);
			_xfrActDtlByActDNoIdx = _xfrActDtlCache.createIndex(XfrActChk_HdrDtlR.$xfr_act_d_no);
			_xfrActDtlByDlvSlipNoIdx = _xfrActDtlCache.createIndex(MST_XFR_ACT_D_R.$dlv_slip_no);
		}

		protected MCList<MST_XFR_ACT_D_R> getByActNo(String xfr_act_no) {
			return _xfrActDtlCache.subList(_xfrActDtlByActNoIdx, xfr_act_no);
		}
		protected MST_XFR_ACT_D_R getByActDNo(String xfr_act_d_no) {
			return _xfrActDtlCache.getFirst(_xfrActDtlByActDNoIdx, xfr_act_d_no);
		}
		protected MCList<MST_XFR_ACT_D_R> getByDlvSlipNo(String dlv_slip_no) {
			return _xfrActDtlCache.subList(_xfrActDtlByDlvSlipNoIdx, dlv_slip_no);
		}
	}

	//- 支給実績を検索 ---------------------------------------------
	protected ProvActCache _provActCache = null;
	protected static void initProvActCache(MCList<XfrActChk_HdrDtlR> dtlL) {
		object(CLAZZ)._initProvActCache(dtlL);
	}
	protected void _initProvActCache(MCList<XfrActChk_HdrDtlR> dtlL) {
		_provActCache = new ProvActCache(dtlL);
	}

	protected static ProvActCache getProvActCache() {
		return object(CLAZZ)._provActCache;
	}

	public class ProvActCache {
		protected MCIndexKey _provActIdx = null;
		protected MCList<MST_PROV_ACT_R> _provActCache = MCList.create(MST_PROV_ACT_R.class);
		protected ProvActCache(MCList<XfrActChk_HdrDtlR> dtlL) {
			MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder _provActCache_bldr = MCQueryApiBuilder.create(t);
			_provActCache_bldr.addWhereWithAnd(t.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.XFR.value()))
					.and(t.prov_src_act_no.eq(bind("xfr_act_d_no")))
					.and(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))));
			dbSelect("MSBEL5220_MST_PROV_ACT_S01", _provActCache, _provActCache_bldr, dtlL.groupBy(XfrActChk_HdrDtlR.$xfr_act_d_no));
			_provActIdx = _provActCache.createIndex(MST_PROV_ACT_R.$prov_src_act_no, MST_PROV_ACT_R.$trd_ptn_typ);
		}

		protected MST_PROV_ACT_R get(String xfr_act_no, String trd_ptn_typ) {
			return _provActCache.getFirst(_provActIdx, xfr_act_no, trd_ptn_typ);
		}
	}
	//- 品目マスタ検索 ---------------------------------------------
	protected FXUCL_MCDbcCache<MAM_ITM_R> _chkItmCache = null;
	protected void selectChkItmL(MCList<XfrActChk_HdrDtlR> dtlL) {
		MAM_ITM_R t = MAM_ITM_R.create("T");

		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.minus_stk_flg, t.lot_mng_typ, t.sublot_mng_typ);
		_chkItmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbcL_bldr, dtlL,
				XfrActChk_HdrDtlR.$itm_cd, XfrActChk_HdrDtlR.$itm_sub1,
				XfrActChk_HdrDtlR.$itm_sub2, XfrActChk_HdrDtlR.$itm_sub3);
	}

	//- 品目単位マスタ検索 ---------------------------------------------
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _chkItmUnitCache = null;
	protected void selectChkItmUnitL(MCList<XfrActChk_HdrDtlR> dtlL) {
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");

		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.pack_flg);
		dbcL_bldr.addSelect(t.conv_base_qty);
		dbcL_bldr.addSelect(t.conv_qty);
		dbcL_bldr.addSelect(t.dec_place);
		dbcL_bldr.addSelect(t.rnd_typ);
		_chkItmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbcL_bldr, dtlL,
				XfrActChk_HdrDtlR.$itm_cd, XfrActChk_HdrDtlR.$itm_sub1,
				XfrActChk_HdrDtlR.$itm_sub2, XfrActChk_HdrDtlR.$itm_sub3,
				XfrActChk_HdrDtlR.$trd_unit_cd);
	}

	//- 物流Ｇマスタ検索 ---------------------------------------------
	protected FXUCL_MCDbcCache<MAM_LG_GRP_R> _chkLgGrpCache = null;
	protected void selectChkLgGrpL(MCList<XfrActChk_HdrDtlR> dtlL) {
		MAM_LG_GRP_R t = MAM_LG_GRP_R.create("T");

		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.gi_minus_stk_chk_flg);
		_chkLgGrpCache = new FXUCL_MCDbcCache<MAM_LG_GRP_R>(dbcL_bldr, dtlL,
				XfrActChk_HdrDtlR.$lg_grp_cd);
	}

	//- 場所マスタ（出庫）検索 ---------------------------------------------
	protected FXUCL_MCDbcCache<MAM_LOC_R> _chkGiLocCache = null;
	protected void selectChkGiLocL(MCList<MST_XFR_ACT_D_R> dtlL) {
		MAM_LOC_R t = MAM_LOC_R.create("T");

		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.loc_mng_typ);
		_chkGiLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, dtlL, MST_XFR_ACT_D_R.$gi_loc_cd);
	}
	
	protected void chkXfrAct(MCList<XfrActChk_HdrDtlR> chkL) {
		for(XfrActChk_HdrDtlR r : chkL) {
			if (r.immd_dlv_prnt_flg()) {
				if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ()))  {
					if (isNull(r.base_ac_dt())) {
						MCMessagePool.add(new MCMessage(r, null, MSBEL1105, toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}
		}
	}
	/**
	 * ロット情報チェック
	 * @param chkL 上り電文
	 */
	protected void chkLot(MCList<XfrActChk_HdrDtlR> chkL) {
		
		MCMessageList msgList = new MCMessageList();
		
		selectChkItmL(chkL);
		
		for (XfrActChk_HdrDtlR r : chkL) {
			
			MAM_ITM_R itmR = _chkItmCache.getEx(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			// ロットＮＯ
			if (!MAC_LOT_MNG_TYP.req_lot(itmR.lot_mng_typ())) {
				r.lot_no(MAC_STR.NULL_VAL.value());
			}
			else {
				r.lot_no(nullValToNull(r.lot_no()));
			}
			// サブロットＮＯ
			if (!MAC_SUBLOT_MNG_TYP.req_lot(itmR.sublot_mng_typ())) {
				r.sublot_no(MAC_STR.NULL_VAL.value());
			}
			else {
				r.sublot_no(nullValToNull(r.sublot_no()));
			}
			
			if (isNull(r.lot_no())) {
				msgList.addAll(check(r, XfrActChk_HdrDtlR.$lot_no, new FXUCL_RequiredValidater()));
				r.err_flg(true);
			}
			
			if (isNull(r.sublot_no())) {
				msgList.addAll(check(r, XfrActChk_HdrDtlR.$sublot_no, new FXUCL_RequiredValidater()));
				r.err_flg(true);
			}
		}
		
		MCMessagePool.addAll(msgList);
		
		callLotChk03(chkL);
	}
	
	/**
	 * ロット情報サービス.ロット存在チェック
	 * @param chkL 上り電文
	 */
	protected void callLotChk03(MCList<XfrActChk_HdrDtlR> chkL) {
		
		MCList<XfrActChk_HdrDtlR> l = MCList.create(XfrActChk_HdrDtlR.class);
		for (XfrActChk_HdrDtlR r : chkL) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) || r.err_flg()) {
				continue;
			}
			l.add(r);
		}
		if (l.isEmpty()) return ;
		MSBFL_LotService.Lot_Chk03 o = MSBFL_LotService.crtLot_Chk03();
		setAll(o.up0(), l, createMap_Lot_Chk03_CndR_XfrActChk_HdrDtlR());
		o.exec();
		copyErrFlg(l, o.down0());
		chkLotQualityTyp(chkL, o.down0());
	}
	
	protected void chkLotQualityTyp(MCList<XfrActChk_HdrDtlR> chkL, MCList<Lot_Chk03_CndR> lotL) {
		MCIndexKey lotIdx = lotL.createIndex(Lot_Chk03_CndR.$peg_no);
		for (XfrActChk_HdrDtlR r : chkL) {
			if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
					|| !MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
				continue;
			}
			Lot_Chk03_CndR lotR = lotL.getFirst(lotIdx, r.peg_no());
			if (!isNull(lotR) && (MAC_QUALITY_TYP.isDFCT_INSP(lotR.quality_typ())
							|| MAC_QUALITY_TYP.isDFCT_OPER(lotR.quality_typ()))) {
				MCMessagePool.add(new MCMessage(r, r.lot_no(), MSBEL1074,
						r.trd_cd(), r.trd_ptn_typ(), toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						r.lot_no(), r.sublot_no(), toDispGUIIndex(r)));
				r.err_flg(true);
			}
		}
	}
	
	protected Map_Lot_Chk03_CndR_XfrActChk_HdrDtlR<Lot_Chk03_CndR,XfrActChk_HdrDtlR> createMap_Lot_Chk03_CndR_XfrActChk_HdrDtlR() {
		return new Map_Lot_Chk03_CndR_XfrActChk_HdrDtlR<Lot_Chk03_CndR, XfrActChk_HdrDtlR>();
	}

	public class Map_Lot_Chk03_CndR_XfrActChk_HdrDtlR<D extends Lot_Chk03_CndR, S extends XfrActChk_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk03_CndR.$peg_no, XfrActChk_HdrDtlR.$peg_no);
			addColumnPathMap(Lot_Chk03_CndR.$itm_cd, XfrActChk_HdrDtlR.$itm_cd);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, XfrActChk_HdrDtlR.$itm_sub1);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, XfrActChk_HdrDtlR.$itm_sub2);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, XfrActChk_HdrDtlR.$itm_sub3);
			addColumnPathMap(Lot_Chk03_CndR.$lot_no, XfrActChk_HdrDtlR.$lot_no);
			addColumnPathMap(Lot_Chk03_CndR.$sublot_no, XfrActChk_HdrDtlR.$sublot_no);

		}
	}

	protected void chkXfrAlloc(MCList<XfrActChk_HdrDtlR> chkL) {
		MSBEL_XfrSchdService.XfrSchd_Chk02 o = MSBEL_XfrSchdService.crtXfrSchd_Chk02();
		addAll(o.up0(),
				chkL.subList(r -> (!isNull(r.xfr_alloc_sts_no()) && !MAC_STR.isNULL_VAL(r.xfr_alloc_sts_no())))
					.groupBy(XfrActChk_HdrDtlR.$xfr_alloc_sts_no, XfrActChk_HdrDtlR.$itm_cd, XfrActChk_HdrDtlR.$itm_sub1, XfrActChk_HdrDtlR.$itm_sub2, XfrActChk_HdrDtlR.$itm_sub3),
				createMap_XfrSchdChk02_DtlR_XfrActChk_HdrDtlR());

		if (!o.up0().isEmpty()) {
			setPegNo(o.up0());
			o.up1().act_flg(true);
			o.exec();

			MCIndexKey pegIdx = o.up0().createIndex(XfrSchdChk02_DtlR.$peg_no);
			MCIndexKey noIdx = chkL.createIndex(XfrActChk_HdrDtlR.$xfr_alloc_sts_no);
			for (XfrSchdChk02_DtlR r :o.down0().subList(XfrSchdChk02_DtlR.$err_flg, true)) {
				chkL.subList(noIdx, o.up0().getFirst(pegIdx, r.peg_no()).xfr_alloc_sts_no()).setBoolean(XfrActChk_HdrDtlR.$err_flg, true);
			}
		}
	}

	protected void chkProvRtnActSv(MCList<XfrActChk_HdrDtlR> chkL) {
		MSBEL_ProvActService.ProvAct_Chk01 o = MSBEL_ProvActService.crtProvAct_Chk01();
		MCList<XfrActChk_HdrDtlR> noErrL = getChkList(chkL);

		String prspplCd;
		for (XfrActChk_HdrDtlR r :noErrL) {
			if (isNull(r.gi_loc_cd())) {
				continue;
			}

			ProvActChk01_DtlR upR = ProvActChk01_DtlR.create();
			copy(upR, r, createMap_ProvActChk01_DtlR_XfrActChk_HdrDtlR());

			upR.prov_schd_no(r.ret_prov_schd_no());
			upR.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.XFR.value());
			upR.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.XFR.value());
			upR.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV_RTN.value());
			upR.loc_cd(r.gi_loc_cd());
			upR.prov_typ(r.ret_prov_typ());
			upR.wg_cd(getGiLocCache().get(r.gi_loc_cd()).wg_cd());

			prspplCd = getGiLocCache().getEx(r.gi_loc_cd()).sppl_cd();
			upR.prsppl_cd(prspplCd);

			MST_PROV_ACT_R pa = getProvActCache().get(r.xfr_act_d_no(), MAC_TRD_PTN_TYP.PROV_RTN.value());
			if (isNull(pa) || pa.isEmpty()) {
				if (isNull(prspplCd)) {
					continue;
				}
				// 同一発注先間の外注直送は支給実績を作らない
				else if (isSame(prspplCd, getGrLocCache().getEx(r.gr_loc_cd()).sppl_cd())) {
					continue;
				}
				// 使用基準の在庫の場合は支給実績を作らない
				else if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ()) && MAC_STR.isNULL_VAL(r.stk_arrv_bp_cd())) {
					continue;
				}
				else {
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					else {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					}
				}
			}
			else {
				if (isNull(prspplCd)) {
					upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				// 同一発注先間の外注直送は支給実績を作らない
				else if (isSame(prspplCd, getGrLocCache().getEx(r.gr_loc_cd()).sppl_cd())) {
					upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				// 使用基準の在庫の場合は支給実績を作らない
				else if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ()) && MAC_STR.isNULL_VAL(r.stk_arrv_bp_cd())) {
					upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					else {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					}
				}
				upR.prov_typ(pa.prov_typ());
				upR.prov_basis_typ(pa.prov_basis_typ());
			}

			o.up0().add(upR);
		}
		if (!o.up0().isEmpty()) {
			o.exec();
			copyErrFlg(noErrL, o.down0());
		}
	}

	protected void chkVmiSv(MCList<XfrActChk_HdrDtlR> chkL) {
		MSBDL_VmiService.Vmi_Chk01 o = MSBDL_VmiService.crtVmi_Chk01();
		MCList<XfrActChk_HdrDtlR> noErrL = getChkList(chkL);

		for (XfrActChk_HdrDtlR r :noErrL) {
			if (MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ())) {
				String crudTyp = getVmiDataCrudTyp(r);
				if (!isNull(crudTyp)) {
					Vmi_Chk01_DtlR upR = o.up0().add();
					copy(upR, r, createMap_Vmi_Chk01_DtlR_XfrActChk_HdrDtlR());
					upR.data_crud_typ(crudTyp);
				}
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
			copyErrFlg(noErrL, o.down0());
			setVmiDownCache(o.down0());
		}
	}
	protected String getVmiDataCrudTyp(XfrAct_HdrR up0, XfrAct_DtlR up1) {
		XfrActChk_HdrDtlR chkR = XfrActChk_HdrDtlR.create();
		chkR.gr_loc_cd(up0.gr_loc_cd());
		chkR.gi_loc_cd(up1.gi_loc_cd());
		chkR.xfr_act_d_no(up1.xfr_act_d_no());
		chkR.data_crud_typ(up1.data_crud_typ());
		return getVmiDataCrudTyp(chkR);
	}
	protected String getVmiDataCrudTyp(XfrActChk_HdrDtlR r) {
		if (getGiLocCache().getEx(r.gi_loc_cd()).gi_vmi_flg() || !isNull(getGrLocCache().getEx(r.gr_loc_cd()).sppl_cd())) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				if (!getPurcActDCache().exists(r.xfr_act_d_no())) {
					// 削除だが仕入実績がない⇒何もしない
					return null;
				}
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				if (!getPurcActDCache().exists(r.xfr_act_d_no())) {
					// 更新だが仕入実績がない⇒新規
					return MAC_DATA_CRUD_TYP.CRT.value();
				}
			}
			return r.data_crud_typ();
		}
		else {
			if (!getPurcActDCache().exists(r.xfr_act_d_no())) {
				// 仕入実績がない⇒何もしない
				return null;
			}
			// VMI計上フラグがオフだが、仕入実績がある⇒削除
			return MAC_DATA_CRUD_TYP.DEL.value();
		}
	}
	//- VMI計上サービスの下り電文をキャッシュ---------------------------------------------
	protected VmiDownCache _vmiDownCache = null;
	protected static void setVmiDownCache(MCList<Vmi_Chk01_DtlR> dtlL) {
		object(CLAZZ)._setVmiDownCache(dtlL);
	}
	protected void _setVmiDownCache(MCList<Vmi_Chk01_DtlR> dtlL) {
		_vmiDownCache = new VmiDownCache(dtlL);
	}

	protected static VmiDownCache getVmiDownCache() {
		return object(CLAZZ)._vmiDownCache;
	}

	public class VmiDownCache {
		protected MCIndexKey _vmiDownIdx = null;
		protected MCList<Vmi_Chk01_DtlR> _vmiDownCache = MCList.create(Vmi_Chk01_DtlR.class);
		protected VmiDownCache(MCList<Vmi_Chk01_DtlR> dtlL) {
			_vmiDownCache.addAll(dtlL);
			_vmiDownIdx = _vmiDownCache.createIndex(Vmi_Chk01_DtlR.$peg_no);
		}

		protected Vmi_Chk01_DtlR get(MCNumber peg_no) {
			return _vmiDownCache.getFirst(_vmiDownIdx, peg_no);
		}
	}

	//- 仕入実績をキャッシュ---------------------------------------------
	protected PurcActDCache _purcActDCache = null;
	protected static void initPurcActDCache(MCList<XfrActChk_HdrDtlR> dtlL) {
		object(CLAZZ)._initPurcActDCache(dtlL);
	}
	protected void _initPurcActDCache(MCList<XfrActChk_HdrDtlR> dtlL) {
		_purcActDCache = new PurcActDCache(dtlL);
	}
	protected static PurcActDCache getPurcActDCache() {
		return object(CLAZZ)._purcActDCache;
	}
	public class PurcActDCache {
		protected MCList<MST_PURC_ACT_D_R> _purcActDL = null;
		protected MCIndexKey _purcActDIdx = null;
		protected PurcActDCache(MCList<XfrActChk_HdrDtlR> dtlL) {
			_purcActDL = MCList.create(MST_PURC_ACT_D_R.class);
			MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
			MST_PURC_ACT_R t1 = MST_PURC_ACT_R.create("T1");
			MCQueryApiBuilder _purcActDL_bldr = MCQueryApiBuilder.create(t);
			_purcActDL_bldr.setSelect(t.purc_src_no);
			_purcActDL_bldr.addInnerJoin(t1, bracket( t1.purc_act_no.eq(t.purc_act_no)
					.and(t1.purc_act_seq.eq(t.purc_act_seq))
					.and(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
			_purcActDL_bldr.setWhere(t.purc_src_typ.eq(value(MSC_PURC_SRC_TYP.XFR.value())));
			_purcActDL_bldr.addWhereWithAnd(t.purc_src_no.eq(bind("xfr_act_d_no")));
			dbSelect("MSBEL5220_MST_PURC_ACT_D_S01", _purcActDL, _purcActDL_bldr, dtlL);
			_purcActDIdx = _purcActDL.createIndex(MST_PURC_ACT_D_R.$purc_src_no);
		}
		protected boolean exists(String xfrActDNo) {
			return !isNull(_purcActDL.getFirst(_purcActDIdx, xfrActDNo));
		}
	}


	protected void chkProvActSv(MCList<XfrActChk_HdrDtlR> chkL) {
		MSBEL_ProvActService.ProvAct_Chk01 o = MSBEL_ProvActService.crtProvAct_Chk01();
		MCList<XfrActChk_HdrDtlR> noErrL = getChkList(chkL);

		String prspplCd;
		for (XfrActChk_HdrDtlR r :noErrL) {
			ProvActChk01_DtlR upR = ProvActChk01_DtlR.create();
			copy(upR, r, createMap_ProvActChk01_DtlR_XfrActChk_HdrDtlR());

			upR.prov_schd_no(r.prov_schd_no());
			upR.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.XFR.value());
			upR.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.XFR.value());
			upR.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV.value());
			upR.loc_cd(r.gr_loc_cd());
			upR.prov_typ(r.prov_typ());

			prspplCd = getGrLocCache().getEx(r.gr_loc_cd()).sppl_cd();
			upR.prsppl_cd(prspplCd);

			MST_PROV_ACT_R pa = getProvActCache().get(r.xfr_act_d_no(), MAC_TRD_PTN_TYP.PROV.value());
			if (isNull(pa) || pa.isEmpty()) {
				if (isNull(prspplCd)) {
					continue;
				}
				// 同一発注先間の外注直送は支給実績を作らない
				else if (isSame(prspplCd, getGiLocCache().getEx(r.gi_loc_cd()).sppl_cd())) {
					continue;
				}
				else {
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					else {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					}
				}
			}
			else {
				if (isNull(prspplCd)) {
					upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				// 同一発注先間の外注直送は支給実績を作らない
				else if (isSame(prspplCd, getGiLocCache().getEx(r.gi_loc_cd()).sppl_cd())) {
					upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					else {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					}
				}
				upR.prov_typ(pa.prov_typ());
				upR.prov_basis_typ(pa.prov_basis_typ());
			}

			o.up0().add(upR);
		}
		if (!o.up0().isEmpty()) {
			o.exec();
			copyErrFlg(noErrL, o.down0());
		}
	}

	protected void chkCl(MCList<XfrActChk_HdrDtlR> chkL) {
		MSBIL_ClService.Cl_Chk03 o = MSBIL_ClService.crtCl_Chk03();
		MCList<XfrActChk_HdrDtlR> noErrL = getChkList(chkL);

		// 出庫場所
		for (XfrActChk_HdrDtlR r :noErrL) {
			Cl_Chk03_CndR upR = o.up0().add();
			copy(upR, r, createMap_Cl_Chk03_CndR_XfrActChk_HdrDtlR());
			upR.stk_cls_chk_flg(true);
			upR.loc_cd(r.gi_loc_cd());
			upR.old_loc_cd(r.gi_loc_cd());
		}
		// 入庫場所
		for (XfrActChk_HdrDtlR r :noErrL) {
			Cl_Chk03_CndR upR = o.up0().add();
			copy(upR, r, createMap_Cl_Chk03_CndR_XfrActChk_HdrDtlR());
			upR.stk_cls_chk_flg(true);
			upR.loc_cd(r.gr_loc_cd());
			upR.old_loc_cd(r.gr_loc_cd());
		}
		o.exec();
		copyErrFlg(noErrL, o.down0());
	}

	protected void chkLotTrace(MCList<XfrActChk_HdrDtlR> chkL) {
		MSBFL_LotTraceService.LotTrace_Chk01 o = MSBFL_LotTraceService.crtLotTrace_Chk01();
		MCList<XfrActChk_HdrDtlR> noErrL = getChkList(chkL);

		for (XfrActChk_HdrDtlR r :noErrL) {
			MAM_LOC_R gi_loc = getGiLocCache().getEx(r.gi_loc_cd());
			MAM_LOC_R gr_loc = getGrLocCache().getEx(r.gr_loc_cd());

			if (!isNullAnd(gi_loc.sppl_cd(), gr_loc.sppl_cd())) {
				continue;
			}
			if (isSame(gi_loc.site_cd(), gr_loc.site_cd())) {
				continue;
			}
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				continue;
			}

			LotTrace_Chk01_RsltR upR = o.up0().add();
			copy(upR, r, createMap_LotTrace_Chk01_RsltR_XfrActChk_HdrDtlR());
			upR.plnt_aprv_flg(false);
			upR.site_cd(gi_loc.site_cd());
		}
		if (!o.up0().isEmpty()) {
			o.exec();
			copyErrFlg(noErrL, o.down0());
		}
	}

	protected void chkPlntAprv(MCList<XfrActChk_HdrDtlR> chkL) {
		MSBFL_PlntAprvService.PlntAprv_Chk02 o = MSBFL_PlntAprvService.crtPlntAprv_Chk02();
		MCList<XfrActChk_HdrDtlR> noErrL = getChkList(chkL);

		for (XfrActChk_HdrDtlR r :noErrL) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				continue;
			}
			if (MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
				continue;
			}

			MAM_LOC_R gi_loc = getGiLocCache().getEx(r.gi_loc_cd());
			MAM_LOC_R gr_loc = getGrLocCache().getEx(r.gr_loc_cd());

			if (MAC_LOC_MNG_TYP.isPRD(gi_loc.loc_mng_typ())) {
				if (!isSame(gi_loc.site_cd(), gr_loc.site_cd())
						|| MAC_LOC_MNG_TYP.isSLS(gr_loc.loc_mng_typ())) {
					PlntAprv_Chk02_RsltR upR = o.up0().add();
					copy(upR, r, createMap_PlntAprv_Chk02_RsltR_XfrActChk_HdrDtlR());
				}
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
			copyErrFlg(noErrL, o.down0());
		}
	}
	/**
	 * 引当管理サービスを実行し、移動対象の在庫が存在するか（マイナス在庫許可品の場合は在庫または入庫予定が存在するか）チェックします。
	 * 受払実績サービスでもマイナス在庫チェックを実施していますが、マイナス在庫許可品の場合は実施されないため、当機能でチェックする必要があります。
	 * マイナス在庫許可品のみチェックするか、またはすべての品目をチェックするかどうかは、物流Ｇマスタの出庫時マイナス在庫確認フラグにより制御します。（オンの場合はすべての品目）
	 * フラグをオフにすると、マイナス在庫許可品以外のチェックは受払実績サービスで実施されますが、その場合は行単位にチェックが行われず、マイナス在庫が発生すると全行がエラーとなります。
	 * フラグをオンにして当機能でチェックを実施すれば、どの行でエラーとなったか判断することができ、エラーとならなかった行は登録されます。
	 * @param chkL チェック対象の移動実績
	 * @param delL 呼出元で削除された移動実績（引当可能在庫として移動元場所に復活させる）
	 */
	protected void chkMinusStk(MCList<XfrActChk_HdrDtlR> chkL, MCList<XfrActChk_DelDtlR> delL) {
		MCList<XfrActChk_HdrDtlR> tgtL = MCList.create(XfrActChk_HdrDtlR.class);
		MCList<XfrActChk_HdrDtlR> delIoL = MCList.create(XfrActChk_HdrDtlR.class);
		MCList<MST_XFR_ACT_D_R> crtStkL = MCList.create(MST_XFR_ACT_D_R.class);

		// 対象行の品目マスタ、品目単位マスタ、物流Ｇマスタをキャッシュ
		// chkLotで品目マスタをキャッシュを作成しているため、ここではselectChkItmLを呼び出す必要がなくなる
		selectChkItmUnitL(chkL);
		selectChkLgGrpL(chkL);

		for (XfrActChk_HdrDtlR r : chkL) {
			// エラー行は対象外
			if (r.err_flg()) {
				continue;
			}
			// 物流グループに設定された出庫時マイナス在庫確認フラグがオフの場合、マイナス在庫許可品のみ対象とする
			MAM_LG_GRP_R lgGrp = _chkLgGrpCache.getEx(r.lg_grp_cd());
			if (!lgGrp.gi_minus_stk_chk_flg()) {
				if (!isMinusStkItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())) {
					continue;
				}
			}
			// 削除行以外（新規行、更新行）はチェック対象
			if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				tgtL.add(r);
			}
			// 新規行以外（更新行、削除行）は引当可能在庫として戻す対象
			if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				// キャッシュから更新前のレコードを取得する
				crtStkL.add(getXfrActDtlCache().getByActDNo(r.xfr_act_d_no()));
			}
			// 実績登録より前（指図時など）に引当が行われている場合、受払予定を削除する対象
			if (!isNullOrNullVal(r.xfr_alloc_sts_no())) {
				delIoL.add(r);
			}
		}

		if (tgtL.isEmpty()) {
			return;
		}

		// 引当管理サービスの引当ロックを実行
		callAllocLockSv(tgtL);

		// セーブポイントの設定
		MCSavepoint sp = dbTran().setSavepoint();

		// 受払予定サービスの受払予定削除を実行
		callIoSchdSv(delIoL);

		// 削除対象リストが設定されている場合、移動実績明細を取得して引当可能在庫として戻す対象にする
		crtStkL.addAll(getStkFromXfrActD(delL));
		
		// 在庫検査区分が検査済以外の在庫数をチェックする
		chkStkNotFin(tgtL, crtStkL);

		// 引当管理サービスのロット提案を実行
		callAllocSrchSv(tgtL, crtStkL);

		// セーブポイントまでロールバック
		dbTran().rollback(sp);
	}

	/**
	 * マイナス在庫許可品かどうか判断する
	 * @param itmCd 品目ＣＤ
	 * @param itmSub1 枝番１
	 * @param itmSub2 枝番２
	 * @param itmSub3 枝番３
	 * @return マイナス在庫許可の場合はtrue
	 */
	protected boolean isMinusStkItm(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		// システムパラメータの移動実績マイナス在庫許可フラグがオンでない場合は不許可
		if (!isSame(getSysParm("MINUS_STK_XFR_FLG"), "1")) {
			return false;
		}
		MAM_ITM_R itm = _chkItmCache.getEx(itmCd, itmSub1, itmSub2, itmSub3);
		// 移動実績マイナス在庫許可フラグがオンの場合は品目マスタのマイナス在庫許可フラグに従う
		return itm.minus_stk_flg();
	}

	/**
	 * 引当管理サービスの引当ロックを実行する
	 * @param tgtL 引当対象リスト
	 */
	protected void callAllocLockSv(MCList<XfrActChk_HdrDtlR> tgtL) {
		// 品目、枝番、出庫場所で引当ロックサービスを実行
		String[] lockKeys = new String[] {
				XfrActChk_HdrDtlR.$itm_cd, XfrActChk_HdrDtlR.$itm_sub1,
				XfrActChk_HdrDtlR.$itm_sub2, XfrActChk_HdrDtlR.$itm_sub3,
				XfrActChk_HdrDtlR.$gi_loc_cd
		};
		MCList<XfrActChk_HdrDtlR> lockL = tgtL.groupBy(lockKeys);
		MSBEL_AllocMngService.Alloc_Lock_Upd01 o = MSBEL_AllocMngService.crtAlloc_Lock_Upd01();
		addAll(o.up0(), lockL, createMap_MSW_ALLOC_LOC_MAP_R_XfrActChk_HdrDtlR());
		o.exec();
	}

	/**
	 * 受払予定サービスの受払予定削除を実行する
	 * @param delIoL 削除対象リスト
	 */
	protected void callIoSchdSv(MCList<XfrActChk_HdrDtlR> delIoL) {
		if (delIoL.isEmpty()) {
			return;
		}

		// 受払予定の削除対象となる移動引当状況を取得
		MCList<MST_XFR_ALLOC_STS_R> dbcL = MCList.create(MST_XFR_ALLOC_STS_R.class);
		MST_XFR_ALLOC_STS_R t = MST_XFR_ALLOC_STS_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.xfr_alloc_sts_no, t.pr_sts_typ);
		dbcL_bldr.setWhere(t.xfr_alloc_sts_no.eq(bind("xfr_alloc_sts_no")));
		dbSelect("MSBEL5220_MST_XFR_ALLOC_STS_S01", dbcL, dbcL_bldr, delIoL);
		MCIndexKey idx = dbcL.createIndex(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);

		// 移動引当状況から受払予定の削除リストを作成
		MCList<MSW_IO_SCHD_DEL_R> ioL = MCList.create(MSW_IO_SCHD_DEL_R.class);
		for (XfrActChk_HdrDtlR r : delIoL) {
			MST_XFR_ALLOC_STS_R stsR = dbcL.getFirst(idx, r.xfr_alloc_sts_no());
			MSW_IO_SCHD_DEL_R ioR = MSW_IO_SCHD_DEL_R.create();
			ioR.io_schd_no(r.xfr_alloc_sts_no());
			ioR.io_schd_typ(getIoSchdTypForMove(r.trd_ptn_typ()));
			if (MSC_PR_STS_TYP.isNOT_INST(stsR.pr_sts_typ())) {
				ioR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
			}
			else {
				ioR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD.value());
			}
			ioL.add(ioR);
		}
		
		// 受払予定サービスの受払予定削除を実行
		MSBEL_IoSchdService.IoSchd_Del01 o = MSBEL_IoSchdService.crtIoSchd_Del01();
		o.up0().setAll(ioL);
		o.exec();
	}

	MCList<Srch_StkR> _minusStkL = MCList.create(Srch_StkR.class);
	/**
	 * 在庫検査区分が検査済以外の在庫数をチェックする
	 * @param tgtL 引当対象リスト
	 * @param crtStkL 引当可能在庫とみなすリスト
	 */
	protected void chkStkNotFin(MCList<XfrActChk_HdrDtlR> tgtL, MCList<MST_XFR_ACT_D_R> crtStkL) {
		
		// 引当可能在庫として戻すリストの出庫場所の場所マスタをキャッシュ（資産区分の設定に管轄区分を使用するため）
		selectChkGiLocL(crtStkL);
		
		// tgtLから在庫検査区分が検査済以外をchkLにセット
		MCList<Srch_StkR> chkL = MCList.create(Srch_StkR.class);
		for (XfrActChk_HdrDtlR tgtR : tgtL) {
			if (!MSC_STK_INSP_TYP.isFIN(tgtR.stk_insp_typ())) {
				Srch_StkR r = chkL.add();
				copy(r, tgtR, createMap_Srch_StkR_XfrActChk_HdrDtlR());
			}
		}
		
		if (chkL.isEmpty()) return;
		
		// 在庫からchkLに該当する在庫を取得
		MCQueryApiBuilder wBldr = MCQueryApiBuilder.create(MST_STK_R.create("T"));
		dbWkDelete("MSBEL5220_MSW_STK_D01", wBldr.getBaseDbc());
		dbWkInsert("MSBEL5220_MSW_STK_I01", chkL, wBldr.getBaseDbc());
		
		MCList<Srch_StkR> dbcL = MCList.create(Srch_StkR.class);
		MST_STK_R t = MST_STK_R.create("T");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
		MSW_STK_KEY_R stkWK = MSW_STK_KEY_R.create("STKWK");
		bldr.addInnerJoin(stkWK, bracket(
				t.itm_cd.eq(stkWK.itm_cd)
				.and(t.itm_sub1.eq(stkWK.itm_sub1))
				.and(t.itm_sub2.eq(stkWK.itm_sub2))
				.and(t.itm_sub3.eq(stkWK.itm_sub3))
				.and(t.loc_cd.eq(stkWK.loc_cd))
				.and(t.str_ln_cd.eq(stkWK.str_ln_cd))
				.and(t.stk_arrv_bp_cd.eq(stkWK.stk_arrv_bp_cd))
				.and(t.lot_no.eq(stkWK.lot_no))
				.and(t.sublot_no.eq(stkWK.sublot_no))
				.and(t.sno1.eq(stkWK.sno1))
				.and(t.sno2.eq(stkWK.sno2))
				.and(t.sno3.eq(stkWK.sno3))
				.and(t.sno4.eq(stkWK.sno4))
				.and(t.pack_unit_cd.eq(stkWK.pack_unit_cd))
				.and(t.gd_cd.eq(stkWK.gd_cd))
				.and(t.in_xfr_typ.eq(stkWK.in_xfr_typ))
				.and(t.quality_typ.eq(stkWK.quality_typ))
				.and(t.asst_typ.eq(stkWK.asst_typ))
				.and(t.stk_insp_typ.eq(stkWK.stk_insp_typ))
				.and(t.stk_id_typ.eq(stkWK.stk_id_typ))
				.and(t.stk_bp_cd.eq(stkWK.stk_bp_cd))));
		bldr.setOrderByAsc(wBldr.getBaseDbc().getKeyColumn$());
		
		dbSelectForUpdate("MSBEL5220_MST_STK_S01", dbcL, bldr);
		dbWkDelete("MSBEL5220_MSW_STK_D02", wBldr.getBaseDbc());
		
		// 取得した在庫にcrtStkLを追加
		addAll(dbcL, crtStkL, createMap_Srch_StkR_MST_XFR_ACT_D_R());
		
		boolean isChkLAllErr = false;
		MCList<Srch_StkR> dbcLGroup = MCList.create(Srch_StkR.class);
		MCGroupByPolicy gp = new MCGroupByPolicy();
		gp.addKey(getStkKey());
		MCIndexKey idx = null;
		if (!dbcL.isEmpty()) {
			gp.sum(Srch_StkR.$pack_unit_qty);
			dbcLGroup = dbcL.groupBy(gp);
			idx = dbcLGroup.createIndex(getStkKey());
		}
		else {
			isChkLAllErr = true;
		}
		
		MCMessageList msgList = new MCMessageList();
		MCList<XfrActChk_HdrDtlR> tgtRemoveL = MCList.create(XfrActChk_HdrDtlR.class);
		MCIndexKey tgtLIdx = tgtL.createIndex(XfrActChk_HdrDtlR.$peg_no);
		for (Srch_StkR chkR : chkL) {
			Srch_StkR stkR = null;
			if (!isChkLAllErr) {
				stkR = dbcLGroup.getFirst(idx, chkR.toArray(getStkKey()));
				
				if (!isNull(stkR)) {
					stkR.pack_unit_qty(stkR.pack_unit_qty().subtract(chkR.getNumber("pack_unit_qty")));
				}
			}
			
			XfrActChk_HdrDtlR tgtR = tgtL.getFirst(tgtLIdx, chkR.getNumberNE("peg_no"));
			// 数量不足のエラー
			if (isNull(stkR) || stkR.pack_unit_qty().isNegative()) {
				tgtR.err_flg(true);
				if (isMinusStkItm(chkR.itm_cd(), chkR.itm_sub1(), chkR.itm_sub2(), chkR.itm_sub3())) {
					// マイナス在庫許可の場合のエラーメッセージ
					msgList.add(new MCMessage(tgtR, null, MSBEL1031,
							toDispItm(tgtR.itm_cd(), tgtR.itm_sub1(), tgtR.itm_sub2(),
									tgtR.itm_sub3()),
							tgtR.gi_loc_cd(), tgtR.gi_str_ln_cd(), tgtR.lot_no(), tgtR.sublot_no(),
							toDispSno(tgtR.sno1(), tgtR.sno2(), tgtR.sno3(), tgtR.sno4()),
							tgtR.trd_unit_cd(), tgtR.gd_cd(), tgtR.quality_typ(), tgtR.stk_id_typ(),
							tgtR.stk_bp_cd(), toDispGUIIndex(tgtR)));
				}
				else {
					// マイナス在庫許可でない場合のエラーメッセージ
					msgList.add(new MCMessage(tgtR, null, MSBEL1030,
							toDispItm(tgtR.itm_cd(), tgtR.itm_sub1(), tgtR.itm_sub2(),
									tgtR.itm_sub3()),
							tgtR.gi_loc_cd(), tgtR.gi_str_ln_cd(), tgtR.lot_no(), tgtR.sublot_no(),
							toDispSno(tgtR.sno1(), tgtR.sno2(), tgtR.sno3(), tgtR.sno4()),
							tgtR.trd_unit_cd(), tgtR.gd_cd(), tgtR.quality_typ(), tgtR.stk_id_typ(),
							tgtR.stk_bp_cd(), toDispGUIIndex(tgtR)));
				}
			}
			else {
				if (isMinusStkItm(chkR.itm_cd(), chkR.itm_sub1(), chkR.itm_sub2(), chkR.itm_sub3())) {
					Srch_StkR minusStkR = chkR.clone();
					minusStkR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
					minusStkR.pack_unit_qty(chkR.pack_unit_qty().negate());
					minusStkR.base_unit_qty(chkR.base_unit_qty().negate());
					_minusStkL.add(minusStkR);
				}
			}
			tgtRemoveL.add(tgtR);
		}
		
		if (!tgtRemoveL.isEmpty()) {
			tgtL.removeAll(tgtRemoveL);
		}
		
		if (!msgList.isEmpty()) {
			MCMessagePool.addAll(msgList);
		}
	}

	protected String[] getStkKey() {
		return new String[]{
				Srch_StkR.$itm_cd,
				Srch_StkR.$itm_sub1,
				Srch_StkR.$itm_sub2,
				Srch_StkR.$itm_sub3,
				Srch_StkR.$loc_cd,
				Srch_StkR.$str_ln_cd,
				Srch_StkR.$stk_arrv_bp_cd,
				Srch_StkR.$lot_no,
				Srch_StkR.$sublot_no,
				Srch_StkR.$sno1,
				Srch_StkR.$sno2,
				Srch_StkR.$sno3,
				Srch_StkR.$sno4,
				Srch_StkR.$pack_unit_cd,
				Srch_StkR.$gd_cd,
				Srch_StkR.$in_xfr_typ,
				Srch_StkR.$quality_typ,
				Srch_StkR.$asst_typ,
				Srch_StkR.$stk_insp_typ,
				Srch_StkR.$stk_id_typ,
				Srch_StkR.$stk_bp_cd};
	}

	protected MCList<Srch_TgtR> setStkAlloc(MCList<XfrActChk_HdrDtlR> tgtL) {
		MCList<Srch_TgtR> alcL = MCList.create(Srch_TgtR.create());
		// 対象行の移動引当状況をキャッシュ
		selectXfrAllocOnlyStsL(tgtL);
		for (XfrActChk_HdrDtlR dtlR : tgtL) {
			
			MST_XFR_ALLOC_STS_R xfrAlloc = _xfrAllocStsOnlyCache.get(dtlR.xfr_alloc_sts_no());
			
			Srch_TgtR alcR = Srch_TgtR.create();
			copy(alcR, dtlR, createMap_Srch_TgtR_XfrActChk_HdrDtlR());
			
			if (isNull(xfrAlloc.xfr_alloc_sts_no())) {
				alcL.add(alcR);
				continue;
			}
			
			// 変更前数量＜変更後数量の場合の設定
			if (dtlR.base_unit_qty().gt(xfrAlloc.base_unit_qty())) {
				alcR.base_unit_qty(xfrAlloc.base_unit_qty());
				if (xfrAlloc.alloc_flg()) {
					alcR.except_alloc_wait_flg(true);
				} else {
					alcR.except_alloc_wait_flg(false);
				}
				
				MAVM_ITM_UNIT_R itmUnit = _chkItmUnitCache.getEx(
						dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.trd_unit_cd());
				
				if (itmUnit.pack_flg()) {
					alcR.pack_unit_qty(rvrsBaseUnitConv(alcR.base_unit_qty(), itmUnit.conv_base_qty(), itmUnit.conv_qty(),
							itmUnit.dec_place(), itmUnit.rnd_typ()));
				}
				
				Srch_TgtR alcWaitR = alcR.clone();
				alcWaitR.base_unit_qty(dtlR.base_unit_qty().subtract(xfrAlloc.base_unit_qty()));
				alcWaitR.except_alloc_wait_flg(false);
				
				if (itmUnit.pack_flg()) {
					alcWaitR.pack_unit_qty(rvrsBaseUnitConv(alcWaitR.base_unit_qty(), itmUnit.conv_base_qty(), itmUnit.conv_qty(),
							itmUnit.dec_place(), itmUnit.rnd_typ()));
				}
				alcL.add(alcWaitR);
			} else {
				// 変更前数量＞＝変更後数量の場合の設定
				if (xfrAlloc.alloc_flg()) {
					alcR.except_alloc_wait_flg(true);
				} else {
					alcR.except_alloc_wait_flg(false);
				}
			}
			alcL.add(alcR);
		}
		return alcL;
	}

	/**
	 * 引当管理サービスのロット提案を実行する
	 * @param tgtL ロット提案対象リスト
	 * @param crtStkL 引当可能在庫とみなすリスト
	 */
	protected void callAllocSrchSv(MCList<XfrActChk_HdrDtlR> tgtL,
			MCList<MST_XFR_ACT_D_R> crtStkL) {
		
		// ロット提案を実行
		MSBEL_AllocMngService.Alloc_Srch01 o = MSBEL_AllocMngService.crtAlloc_Srch01();
		o.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value()); //不足時処理区分は1:継続
		o.up0().addBooleanColumn("minus_stk_chk_flg", true); //マイナス在庫確認
		o.up1().addAll(setStkAlloc(tgtL)); // ロット提案対象
		for (MST_XFR_ACT_D_R crtStkR : crtStkL) {
			if (isMinusStkItm(crtStkR.itm_cd(), crtStkR.itm_sub1(), crtStkR.itm_sub2(), crtStkR.itm_sub3())) {
				crtStkR.setValueNE(MST_XFR_ACT_D_R.$stk_insp_typ, MSC_STK_INSP_TYP.FIN.value());
			}
		}
		addAll(o.up2(), crtStkL, createMap_Srch_StkR_MST_XFR_ACT_D_R()); // 引当可能在庫として戻すリスト
		o.up2().addAll(getGr(tgtL)); // 移動実績の入庫情報を在庫として渡す
		o.up2().addAll(_minusStkL);
		o.exec();
		
		// 引当に失敗したレコードが存在する場合はエラー
		if (!o.down2().isEmpty()) {
			MCMessageList msgList = new MCMessageList();
			MCIndexKey idx = tgtL.createIndex(XfrActChk_HdrDtlR.$peg_no);
			for (Srch_TgtR errR : o.down2()) {
				XfrActChk_HdrDtlR r = tgtL.getFirst(idx, errR.peg_no());
				if (r.err_flg()) continue;
				r.err_flg(true);
				if (isMinusStkItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())) {
					// マイナス在庫許可の場合のエラーメッセージ
					msgList.add(new MCMessage(r, null, MSBEL1031,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
									r.itm_sub3()),
							r.gi_loc_cd(), r.gi_str_ln_cd(), r.lot_no(), r.sublot_no(),
							toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4()),
							r.trd_unit_cd(), r.gd_cd(), r.quality_typ(), r.stk_id_typ(),
							r.stk_bp_cd(), toDispGUIIndex(r)));
				}
				else {
					// マイナス在庫許可でない場合のエラーメッセージ
					msgList.add(new MCMessage(r, null, MSBEL1030,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
									r.itm_sub3()),
							r.gi_loc_cd(), r.gi_str_ln_cd(), r.lot_no(), r.sublot_no(),
							toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4()),
							r.trd_unit_cd(), r.gd_cd(), r.quality_typ(), r.stk_id_typ(),
							r.stk_bp_cd(), toDispGUIIndex(r)));
				}
			}
			MCMessagePool.addAll(msgList);
		}
	}
	
	/**
	 * 削除対象リストの移動実績明細を抽出し、引当可能在庫として戻すためのリストを作成する
	 * @param delL 削除対象リスト
	 * @return 引当可能在庫リスト
	 */
	protected MCList<MST_XFR_ACT_D_R> getStkFromXfrActD(MCList<XfrActChk_DelDtlR> delL) {
		MCList<MST_XFR_ACT_D_R> dbcL = MCList.create(MST_XFR_ACT_D_R.class);

		if (delL.isEmpty()) {
			return dbcL;
		}

		MST_XFR_ACT_D_R t = MST_XFR_ACT_D_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.gi_loc_cd, t.gi_str_ln_cd, t.gi_stk_arrv_bp_cd, t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4, t.trd_unit_qty, t.trd_unit_cd, t.gd_cd, t.quality_typ, t.stk_id_typ, t.stk_bp_cd, t.base_unit_qty, t.stk_insp_typ);
		dbcL_bldr.setWhere(t.xfr_act_d_no.eq(bind("xfr_act_d_no")));
		dbSelect("MSBEL5220_MST_XFR_ACT_D_S02", dbcL, dbcL_bldr, delL);
		return dbcL;
	}

	/**
	 * 移動実績明細から入庫実績の在庫情報を作成する
	 * @param tgtL
	 * @return
	 */
	protected MCList<Srch_StkR> getGr(MCList<XfrActChk_HdrDtlR> tgtL) {
		MCList<Srch_StkR> stkL = MCList.create(Srch_StkR.class);

		// 入庫情報補完ユーティリティを実行
		MCList<GiGr_LocR> giGrL = MCList.create(GiGr_LocR.class);
		setAll(giGrL, tgtL, createMap_GiGr_LocR_XfrActChk_HdrDtlR());
		MSUCL_GiGrLocUtil.setLocInfo(giGrL);
		
		MCIndexKey giGrKey = giGrL.createIndex(GiGr_LocR.$peg_no);

		for (XfrActChk_HdrDtlR r : tgtL) {
			Srch_StkR stkR = Srch_StkR.create();
			MAVM_ITM_UNIT_R itmUnit = _chkItmUnitCache.getEx(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd());

			// ユーティリティの実行結果から移動先の在庫情報を設定
			GiGr_LocR giGrR = giGrL.getFirst(giGrKey, r.peg_no());

			stkR.itm_cd(r.itm_cd());
			stkR.itm_sub1(r.itm_sub1());
			stkR.itm_sub2(r.itm_sub2());
			stkR.itm_sub3(r.itm_sub3());
			stkR.loc_cd(giGrR.gr_loc_cd());
			stkR.str_ln_cd(giGrR.gr_str_ln_cd());
			stkR.stk_arrv_bp_cd(giGrR.gr_stk_arrv_bp_cd());
			stkR.lot_no(r.lot_no());
			stkR.sublot_no(r.sublot_no());
			stkR.sno1(r.sno1());
			stkR.sno2(r.sno2());
			stkR.sno3(r.sno3());
			stkR.sno4(r.sno4());
			stkR.gd_cd(r.gd_cd());
			stkR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			stkR.quality_typ(r.quality_typ());
			stkR.asst_typ(giGrR.gr_asst_typ());
			stkR.stk_insp_typ(r.stk_insp_typ());
			stkR.stk_id_typ(giGrR.gr_stk_id_typ());
			stkR.stk_bp_cd(giGrR.gr_stk_bp_cd());
			
			if (itmUnit.pack_flg()) {
				stkR.pack_unit_qty(r.trd_unit_qty());
				stkR.pack_unit_cd(r.trd_unit_cd());
			}
			else {
				stkR.pack_unit_qty(r.base_unit_qty());
				stkR.pack_unit_cd(r.base_unit_cd());
			}
			stkR.base_unit_qty(r.base_unit_qty());

			stkL.add(stkR);
		}
		
		return stkL;
	}
	
	protected Map_MSW_ALLOC_LOC_MAP_R_XfrActChk_HdrDtlR<MSW_ALLOC_LOC_MAP_R,XfrActChk_HdrDtlR> createMap_MSW_ALLOC_LOC_MAP_R_XfrActChk_HdrDtlR() {
		return new Map_MSW_ALLOC_LOC_MAP_R_XfrActChk_HdrDtlR<MSW_ALLOC_LOC_MAP_R, XfrActChk_HdrDtlR>();
	}

	public class Map_MSW_ALLOC_LOC_MAP_R_XfrActChk_HdrDtlR<D extends MSW_ALLOC_LOC_MAP_R, S extends XfrActChk_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_cd, XfrActChk_HdrDtlR.$itm_cd);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub1, XfrActChk_HdrDtlR.$itm_sub1);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub2, XfrActChk_HdrDtlR.$itm_sub2);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub3, XfrActChk_HdrDtlR.$itm_sub3);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$gi_loc_cd, XfrActChk_HdrDtlR.$gi_loc_cd);
		}
	}

	protected Map_Srch_TgtR_XfrActChk_HdrDtlR<Srch_TgtR,XfrActChk_HdrDtlR> createMap_Srch_TgtR_XfrActChk_HdrDtlR() {
		return new Map_Srch_TgtR_XfrActChk_HdrDtlR<Srch_TgtR, XfrActChk_HdrDtlR>();
	}

	public class Map_Srch_TgtR_XfrActChk_HdrDtlR<D extends Srch_TgtR, S extends XfrActChk_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch_TgtR.$peg_no, XfrActChk_HdrDtlR.$peg_no);
			addColumnPathMap(Srch_TgtR.$gi_schd_dt, XfrActChk_HdrDtlR.$xfr_dt);
			addColumnPathMap(Srch_TgtR.$itm_cd, XfrActChk_HdrDtlR.$itm_cd);
			addColumnPathMap(Srch_TgtR.$itm_sub1, XfrActChk_HdrDtlR.$itm_sub1);
			addColumnPathMap(Srch_TgtR.$itm_sub2, XfrActChk_HdrDtlR.$itm_sub2);
			addColumnPathMap(Srch_TgtR.$itm_sub3, XfrActChk_HdrDtlR.$itm_sub3);
			addColumnPathMap(Srch_TgtR.$gi_loc_cd, XfrActChk_HdrDtlR.$gi_loc_cd);
			addColumnPathMap(Srch_TgtR.$gi_str_ln_cd, XfrActChk_HdrDtlR.$gi_str_ln_cd);
			addColumnPathMap(Srch_TgtR.$gi_stk_arrv_bp_cd, XfrActChk_HdrDtlR.$stk_arrv_bp_cd);
			addColumnPathMap(Srch_TgtR.$quality_typ, XfrActChk_HdrDtlR.$quality_typ);
			addColumnPathMap(Srch_TgtR.$stk_id_typ, XfrActChk_HdrDtlR.$stk_id_typ);
			addColumnPathMap(Srch_TgtR.$stk_bp_cd, XfrActChk_HdrDtlR.$stk_bp_cd);
			addColumnPathMap(Srch_TgtR.$gd_cd, XfrActChk_HdrDtlR.$gd_cd);
			addColumnPathMap(Srch_TgtR.$lot_no, XfrActChk_HdrDtlR.$lot_no);
			addColumnPathMap(Srch_TgtR.$sublot_no, XfrActChk_HdrDtlR.$sublot_no);
			addColumnPathMap(Srch_TgtR.$sno1, XfrActChk_HdrDtlR.$sno1);
			addColumnPathMap(Srch_TgtR.$sno2, XfrActChk_HdrDtlR.$sno2);
			addColumnPathMap(Srch_TgtR.$sno3, XfrActChk_HdrDtlR.$sno3);
			addColumnPathMap(Srch_TgtR.$sno4, XfrActChk_HdrDtlR.$sno4);
			addColumnPathMap(Srch_TgtR.$base_unit_cd, XfrActChk_HdrDtlR.$base_unit_cd);
			addColumnPathMap(Srch_TgtR.$base_unit_qty, XfrActChk_HdrDtlR.$base_unit_qty);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			MAVM_ITM_UNIT_R itmUnit = _chkItmUnitCache.getEx(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3(), src.trd_unit_cd());

			if (itmUnit.pack_flg()) {
				dest.pack_unit_qty(src.trd_unit_qty());
				dest.pack_unit_cd(src.trd_unit_cd());
			}
			else {
				dest.pack_unit_qty(src.base_unit_qty());
				dest.pack_unit_cd(src.base_unit_cd());
			}
			
			// マイナス在庫許可の場合は入庫予定を提案対象とするため、在庫提案ＦＬＧはfalse
			dest.stk_flg(!isMinusStkItm(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3()));
			
			// 在庫提案ＦＬＧがfalseの場合は、入庫予定を参照する必要があるため在庫優先引当ＦＬＧをfalseに
			dest.stk_alloc_flg(dest.stk_flg());
		}
	}
	
	protected Map_Srch_StkR_XfrActChk_HdrDtlR<Srch_StkR,XfrActChk_HdrDtlR> createMap_Srch_StkR_XfrActChk_HdrDtlR() {
		return new Map_Srch_StkR_XfrActChk_HdrDtlR<Srch_StkR, XfrActChk_HdrDtlR>();
	}

	public class Map_Srch_StkR_XfrActChk_HdrDtlR<D extends Srch_StkR, S extends XfrActChk_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch_StkR.$itm_cd, XfrActChk_HdrDtlR.$itm_cd);
			addColumnPathMap(Srch_StkR.$itm_sub1, XfrActChk_HdrDtlR.$itm_sub1);
			addColumnPathMap(Srch_StkR.$itm_sub2, XfrActChk_HdrDtlR.$itm_sub2);
			addColumnPathMap(Srch_StkR.$itm_sub3, XfrActChk_HdrDtlR.$itm_sub3);
			addColumnPathMap(Srch_StkR.$stk_arrv_bp_cd, XfrActChk_HdrDtlR.$stk_arrv_bp_cd);
			addColumnPathMap(Srch_StkR.$lot_no, XfrActChk_HdrDtlR.$lot_no);
			addColumnPathMap(Srch_StkR.$sublot_no, XfrActChk_HdrDtlR.$sublot_no);
			addColumnPathMap(Srch_StkR.$sno1, XfrActChk_HdrDtlR.$sno1);
			addColumnPathMap(Srch_StkR.$sno2, XfrActChk_HdrDtlR.$sno2);
			addColumnPathMap(Srch_StkR.$sno3, XfrActChk_HdrDtlR.$sno3);
			addColumnPathMap(Srch_StkR.$sno4, XfrActChk_HdrDtlR.$sno4);
			addColumnPathMap(Srch_StkR.$gd_cd, XfrActChk_HdrDtlR.$gd_cd);
			addColumnPathMap(Srch_StkR.$quality_typ, XfrActChk_HdrDtlR.$quality_typ);
			addColumnPathMap(Srch_StkR.$stk_insp_typ, XfrActChk_HdrDtlR.$stk_insp_typ);
			addColumnPathMap(Srch_StkR.$stk_id_typ, XfrActChk_HdrDtlR.$stk_id_typ);
			addColumnPathMap(Srch_StkR.$stk_bp_cd, XfrActChk_HdrDtlR.$stk_bp_cd);
			addColumnPathMap(Srch_StkR.$base_unit_qty, XfrActChk_HdrDtlR.$base_unit_qty);
			addColumnPathMap(Srch_StkR.$loc_cd, XfrActChk_HdrDtlR.$gi_loc_cd);
			addColumnPathMap(Srch_StkR.$str_ln_cd, XfrActChk_HdrDtlR.$gi_str_ln_cd);
			addColumnPathMap("peg_no", XfrActChk_HdrDtlR.$peg_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (isNull(src.stk_arrv_bp_cd())) {
				dest.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
			}
			MAVM_ITM_UNIT_R itmUnit = _chkItmUnitCache.getEx(src.itm_cd(), src.itm_sub1(),
					src.itm_sub2(), src.itm_sub3(), src.trd_unit_cd());
			if (itmUnit.pack_flg()) {
				dest.pack_unit_qty(src.trd_unit_qty());
				dest.pack_unit_cd(src.trd_unit_cd());
			}
			else {
				dest.pack_unit_qty(src.base_unit_qty());
				dest.pack_unit_cd(src.base_unit_cd());
			}
			dest.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			
			if (!MSC_STK_ID_TYP.isCOSTK(src.stk_id_typ())) {
				if (!isNull(src.gi_loc_cd())) {
					MAM_LOC_R locR = getGiLocCache().getEx(src.gi_loc_cd());
					if (!isNull(locR) && MSC_STK_ID_TYP.isONR_PROV(src.stk_id_typ())
							&& isSame(locR.getStringNE(MAM_BP_R.$repurc_obli_flg), "1")) {
						dest.asst_typ(MAC_ASST_TYP.CO_PROD.value());
					}
					else {
						dest.asst_typ(MAC_ASST_TYP.OTH.value());
					}
				}
				else {
					dest.asst_typ(MAC_ASST_TYP.OTH.value());
				}
			}
			else {
				MAM_LOC_R loc = _chkGiLocCache.getEx(src.gi_loc_cd());
				if (MAC_LOC_MNG_TYP.isPRD(loc.loc_mng_typ())){
					dest.asst_typ(MAC_ASST_TYP.CO_PROD.value());
				}
				else {
					dest.asst_typ(MAC_ASST_TYP.CO_SLS.value());
				}
			}
		}
	}

	protected Map_Srch_StkR_MST_XFR_ACT_D_R<Srch_StkR,MST_XFR_ACT_D_R> createMap_Srch_StkR_MST_XFR_ACT_D_R() {
		return new Map_Srch_StkR_MST_XFR_ACT_D_R<Srch_StkR, MST_XFR_ACT_D_R>();
	}

	public class Map_Srch_StkR_MST_XFR_ACT_D_R<D extends Srch_StkR, S extends MST_XFR_ACT_D_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch_StkR.$itm_cd, MST_XFR_ACT_D_R.$itm_cd);
			addColumnPathMap(Srch_StkR.$itm_sub1, MST_XFR_ACT_D_R.$itm_sub1);
			addColumnPathMap(Srch_StkR.$itm_sub2, MST_XFR_ACT_D_R.$itm_sub2);
			addColumnPathMap(Srch_StkR.$itm_sub3, MST_XFR_ACT_D_R.$itm_sub3);
			addColumnPathMap(Srch_StkR.$loc_cd, MST_XFR_ACT_D_R.$gi_loc_cd);
			addColumnPathMap(Srch_StkR.$str_ln_cd, MST_XFR_ACT_D_R.$gi_str_ln_cd);
			addColumnPathMap(Srch_StkR.$stk_arrv_bp_cd, MST_XFR_ACT_D_R.$gi_stk_arrv_bp_cd);
			addColumnPathMap(Srch_StkR.$lot_no, MST_XFR_ACT_D_R.$lot_no);
			addColumnPathMap(Srch_StkR.$sublot_no, MST_XFR_ACT_D_R.$sublot_no);
			addColumnPathMap(Srch_StkR.$sno1, MST_XFR_ACT_D_R.$sno1);
			addColumnPathMap(Srch_StkR.$sno2, MST_XFR_ACT_D_R.$sno2);
			addColumnPathMap(Srch_StkR.$sno3, MST_XFR_ACT_D_R.$sno3);
			addColumnPathMap(Srch_StkR.$sno4, MST_XFR_ACT_D_R.$sno4);
			addColumnPathMap(Srch_StkR.$gd_cd, MST_XFR_ACT_D_R.$gd_cd);
			addColumnPathMap(Srch_StkR.$quality_typ, MST_XFR_ACT_D_R.$quality_typ);
			addColumnPathMap(Srch_StkR.$stk_insp_typ, MST_XFR_ACT_D_R.$stk_insp_typ);
			addColumnPathMap(Srch_StkR.$stk_id_typ, MST_XFR_ACT_D_R.$stk_id_typ);
			addColumnPathMap(Srch_StkR.$stk_bp_cd, MST_XFR_ACT_D_R.$stk_bp_cd);
			addColumnPathMap(Srch_StkR.$base_unit_qty, MST_XFR_ACT_D_R.$base_unit_qty);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			MAVM_ITM_UNIT_R itmUnit = _chkItmUnitCache.getEx(src.itm_cd(), src.itm_sub1(),
					src.itm_sub2(), src.itm_sub3(), src.trd_unit_cd());
			if (itmUnit.pack_flg()) {
				dest.pack_unit_qty(src.trd_unit_qty());
				dest.pack_unit_cd(src.trd_unit_cd());
			}
			else {
				dest.pack_unit_qty(src.base_unit_qty());
				dest.pack_unit_cd(src.base_unit_cd());
			}
			dest.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());

			if (!MSC_STK_ID_TYP.isCOSTK(src.stk_id_typ())) {
				if (!isNull(src.gi_loc_cd())) {
					MAM_LOC_R locR = getGiLocCache().getEx(src.gi_loc_cd());
					if (!isNull(locR) && MSC_STK_ID_TYP.isONR_PROV(src.stk_id_typ())
							&& isSame(locR.getStringNE(MAM_BP_R.$repurc_obli_flg), "1")) {
						dest.asst_typ(MAC_ASST_TYP.CO_PROD.value());
					}
					else {
						dest.asst_typ(MAC_ASST_TYP.OTH.value());
					}
				}
				else {
					dest.asst_typ(MAC_ASST_TYP.OTH.value());
				}
			}
			else {
				MAM_LOC_R loc = _chkGiLocCache.getEx(src.gi_loc_cd());
				if (MAC_LOC_MNG_TYP.isPRD(loc.loc_mng_typ())){
					dest.asst_typ(MAC_ASST_TYP.CO_PROD.value());
				}
				else {
					dest.asst_typ(MAC_ASST_TYP.CO_SLS.value());
				}
			}
		}
	}

	protected Map_GiGr_LocR_XfrActChk_HdrDtlR<GiGr_LocR,XfrActChk_HdrDtlR> createMap_GiGr_LocR_XfrActChk_HdrDtlR() {
		return new Map_GiGr_LocR_XfrActChk_HdrDtlR<GiGr_LocR, XfrActChk_HdrDtlR>();
	}

	public class Map_GiGr_LocR_XfrActChk_HdrDtlR<D extends GiGr_LocR, S extends XfrActChk_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(GiGr_LocR.$peg_no, XfrActChk_HdrDtlR.$peg_no);
			addColumnPathMap(GiGr_LocR.$itm_cd, XfrActChk_HdrDtlR.$itm_cd);
			addColumnPathMap(GiGr_LocR.$itm_sub1, XfrActChk_HdrDtlR.$itm_sub1);
			addColumnPathMap(GiGr_LocR.$itm_sub2, XfrActChk_HdrDtlR.$itm_sub2);
			addColumnPathMap(GiGr_LocR.$itm_sub3, XfrActChk_HdrDtlR.$itm_sub3);
			addColumnPathMap(GiGr_LocR.$gi_loc_cd, XfrActChk_HdrDtlR.$gi_loc_cd);
			addColumnPathMap(GiGr_LocR.$gi_str_ln_cd, XfrActChk_HdrDtlR.$gi_str_ln_cd);
			addColumnPathMap(GiGr_LocR.$gi_schd_dt, XfrActChk_HdrDtlR.$xfr_dt);
			addColumnPathMap(GiGr_LocR.$gi_stk_arrv_bp_cd, XfrActChk_HdrDtlR.$stk_arrv_bp_cd);
			addColumnPathMap(GiGr_LocR.$gi_stk_id_typ, XfrActChk_HdrDtlR.$stk_id_typ);
			addColumnPathMap(GiGr_LocR.$gi_stk_bp_cd, XfrActChk_HdrDtlR.$stk_bp_cd);
			addColumnPathMap(GiGr_LocR.$gr_loc_cd, XfrActChk_HdrDtlR.$gr_loc_cd);
			addColumnPathMap(GiGr_LocR.$gr_str_ln_cd, XfrActChk_HdrDtlR.$gr_str_ln_cd);
			addColumnPathMap(GiGr_LocR.$gr_schd_dt, XfrActChk_HdrDtlR.$xfr_dt);
		}
	}

	protected void setDown(MCList<XfrActChk_HdrDtlR> chkL, MCList<XfrActChk_HdrDtlR> down0) {
		// エラーＦＬＧがオンのレコードと移動引当状況ＮＯが同一のレコードはエラーＦＬＧをオンにする
		MCIndexKey idx = chkL.createIndex(XfrActChk_HdrDtlR.$xfr_alloc_sts_no);
		for (XfrActChk_HdrDtlR r :chkL.subList(XfrActChk_HdrDtlR.$err_flg, true).groupBy(XfrActChk_HdrDtlR.$xfr_alloc_sts_no)) {
			if (!isNull(r.xfr_alloc_sts_no()) && !MAC_STR.isNULL_VAL(r.xfr_alloc_sts_no())) {
				chkL.subList(idx, r.xfr_alloc_sts_no()).setBoolean(XfrActChk_HdrDtlR.$err_flg, true);
			}
		}
		down0.setAll(chkL);
	}

	protected Map_XfrSchdChk02_DtlR_XfrActChk_HdrDtlR<XfrSchdChk02_DtlR,XfrActChk_HdrDtlR> createMap_XfrSchdChk02_DtlR_XfrActChk_HdrDtlR() {
		return new Map_XfrSchdChk02_DtlR_XfrActChk_HdrDtlR<XfrSchdChk02_DtlR, XfrActChk_HdrDtlR>();
	}

	public class Map_XfrSchdChk02_DtlR_XfrActChk_HdrDtlR<D extends XfrSchdChk02_DtlR, S extends XfrActChk_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrSchdChk02_DtlR.$xfr_alloc_sts_no, XfrActChk_HdrDtlR.$xfr_alloc_sts_no);
			addColumnPathMap(XfrSchdChk02_DtlR.$itm_cd, XfrActChk_HdrDtlR.$itm_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$itm_sub1, XfrActChk_HdrDtlR.$itm_sub1);
			addColumnPathMap(XfrSchdChk02_DtlR.$itm_sub2, XfrActChk_HdrDtlR.$itm_sub2);
			addColumnPathMap(XfrSchdChk02_DtlR.$itm_sub3, XfrActChk_HdrDtlR.$itm_sub3);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
		}
	}

	protected Map_Vmi_Chk01_DtlR_XfrActChk_HdrDtlR<Vmi_Chk01_DtlR,XfrActChk_HdrDtlR> createMap_Vmi_Chk01_DtlR_XfrActChk_HdrDtlR() {
		return new Map_Vmi_Chk01_DtlR_XfrActChk_HdrDtlR<Vmi_Chk01_DtlR, XfrActChk_HdrDtlR>();
	}

	public class Map_Vmi_Chk01_DtlR_XfrActChk_HdrDtlR<D extends Vmi_Chk01_DtlR, S extends XfrActChk_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Vmi_Chk01_DtlR.$peg_no, XfrActChk_HdrDtlR.$peg_no);
			addColumnPathMap(Vmi_Chk01_DtlR.$data_crud_typ, XfrActChk_HdrDtlR.$data_crud_typ);
			addColumnPathMap(Vmi_Chk01_DtlR.$purc_src_no, XfrActChk_HdrDtlR.$xfr_act_d_no);
			addColumnPathMap(Vmi_Chk01_DtlR.$purc_dt, XfrActChk_HdrDtlR.$xfr_dt);
			addColumnPathMap(Vmi_Chk01_DtlR.$ac_dt, XfrActChk_HdrDtlR.$ac_dt);
			addColumnPathMap(Vmi_Chk01_DtlR.$can_ac_dt, XfrActChk_HdrDtlR.$can_ac_dt);
			addColumnPathMap(Vmi_Chk01_DtlR.$stk_bp_cd, XfrActChk_HdrDtlR.$stk_bp_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$itm_cd, XfrActChk_HdrDtlR.$itm_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$itm_sub1, XfrActChk_HdrDtlR.$itm_sub1);
			addColumnPathMap(Vmi_Chk01_DtlR.$itm_sub2, XfrActChk_HdrDtlR.$itm_sub2);
			addColumnPathMap(Vmi_Chk01_DtlR.$itm_sub3, XfrActChk_HdrDtlR.$itm_sub3);
			addColumnPathMap(Vmi_Chk01_DtlR.$trd_unit_cd, XfrActChk_HdrDtlR.$trd_unit_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$trd_unit_qty, XfrActChk_HdrDtlR.$trd_unit_qty);
			addColumnPathMap(Vmi_Chk01_DtlR.$loc_cd, XfrActChk_HdrDtlR.$gi_loc_cd);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PURC_VMI.value());
			dest.purc_src_typ(MSC_PURC_SRC_TYP.XFR.value());
		}
	}

	protected Map_ProvActChk01_DtlR_XfrActChk_HdrDtlR<ProvActChk01_DtlR,XfrActChk_HdrDtlR> createMap_ProvActChk01_DtlR_XfrActChk_HdrDtlR() {
		return new Map_ProvActChk01_DtlR_XfrActChk_HdrDtlR<ProvActChk01_DtlR, XfrActChk_HdrDtlR>();
	}

	public class Map_ProvActChk01_DtlR_XfrActChk_HdrDtlR<D extends ProvActChk01_DtlR, S extends XfrActChk_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ProvActChk01_DtlR.$peg_no, XfrActChk_HdrDtlR.$peg_no);
			addColumnPathMap(ProvActChk01_DtlR.$data_crud_typ, XfrActChk_HdrDtlR.$data_crud_typ);
			addColumnPathMap(ProvActChk01_DtlR.$accpt_dt, XfrActChk_HdrDtlR.$xfr_dt);
			addColumnPathMap(ProvActChk01_DtlR.$ac_dt, XfrActChk_HdrDtlR.$ac_dt);
			addColumnPathMap(ProvActChk01_DtlR.$can_ac_dt, XfrActChk_HdrDtlR.$can_ac_dt);
			addColumnPathMap(ProvActChk01_DtlR.$prov_src_schd_no1, XfrActChk_HdrDtlR.$xfr_alloc_sts_no);
			addColumnPathMap(ProvActChk01_DtlR.$prov_src_act_no, XfrActChk_HdrDtlR.$xfr_act_d_no);
			addColumnPathMap(ProvActChk01_DtlR.$itm_cd, XfrActChk_HdrDtlR.$itm_cd);
			addColumnPathMap(ProvActChk01_DtlR.$itm_sub1, XfrActChk_HdrDtlR.$itm_sub1);
			addColumnPathMap(ProvActChk01_DtlR.$itm_sub2, XfrActChk_HdrDtlR.$itm_sub2);
			addColumnPathMap(ProvActChk01_DtlR.$itm_sub3, XfrActChk_HdrDtlR.$itm_sub3);
			addColumnPathMap(ProvActChk01_DtlR.$wg_cd, XfrActChk_HdrDtlR.$wg_cd);
			addColumnPathMap(ProvActChk01_DtlR.$stk_id_typ, XfrActChk_HdrDtlR.$stk_id_typ);
		}
	}

	protected Map_Cl_Chk03_CndR_XfrActChk_HdrDtlR<Cl_Chk03_CndR,XfrActChk_HdrDtlR> createMap_Cl_Chk03_CndR_XfrActChk_HdrDtlR() {
		return new Map_Cl_Chk03_CndR_XfrActChk_HdrDtlR<Cl_Chk03_CndR, XfrActChk_HdrDtlR>();
	}

	public class Map_Cl_Chk03_CndR_XfrActChk_HdrDtlR<D extends Cl_Chk03_CndR, S extends XfrActChk_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Cl_Chk03_CndR.$peg_no, XfrActChk_HdrDtlR.$peg_no);
			addColumnPathMap(Cl_Chk03_CndR.$ac_dt, XfrActChk_HdrDtlR.$ac_dt);
			addColumnPathMap(Cl_Chk03_CndR.$can_ac_dt, XfrActChk_HdrDtlR.$can_ac_dt);
			addColumnPathMap(Cl_Chk03_CndR.$itm_cd, XfrActChk_HdrDtlR.$itm_cd);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub1, XfrActChk_HdrDtlR.$itm_sub1);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub2, XfrActChk_HdrDtlR.$itm_sub2);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub3, XfrActChk_HdrDtlR.$itm_sub3);
			addColumnPathMap(Cl_Chk03_CndR.$old_itm_cd, XfrActChk_HdrDtlR.$itm_cd);
			addColumnPathMap(Cl_Chk03_CndR.$old_itm_sub1, XfrActChk_HdrDtlR.$itm_sub1);
			addColumnPathMap(Cl_Chk03_CndR.$old_itm_sub2, XfrActChk_HdrDtlR.$itm_sub2);
			addColumnPathMap(Cl_Chk03_CndR.$old_itm_sub3, XfrActChk_HdrDtlR.$itm_sub3);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
				dest.ac_dt(null);
			}
		}
	}

	protected Map_LotTrace_Chk01_RsltR_XfrActChk_HdrDtlR<LotTrace_Chk01_RsltR,XfrActChk_HdrDtlR> createMap_LotTrace_Chk01_RsltR_XfrActChk_HdrDtlR() {
		return new Map_LotTrace_Chk01_RsltR_XfrActChk_HdrDtlR<LotTrace_Chk01_RsltR, XfrActChk_HdrDtlR>();
	}

	public class Map_LotTrace_Chk01_RsltR_XfrActChk_HdrDtlR<D extends LotTrace_Chk01_RsltR, S extends XfrActChk_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(LotTrace_Chk01_RsltR.$peg_no, XfrActChk_HdrDtlR.$peg_no);
			addColumnPathMap(LotTrace_Chk01_RsltR.$skip_chk_ship_flg, XfrActChk_HdrDtlR.$skip_chk_ship_flg);
			addColumnPathMap(LotTrace_Chk01_RsltR.$loc_cd, XfrActChk_HdrDtlR.$gi_loc_cd);
			addColumnPathMap(LotTrace_Chk01_RsltR.$itm_cd, XfrActChk_HdrDtlR.$itm_cd);
			addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub1, XfrActChk_HdrDtlR.$itm_sub1);
			addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub2, XfrActChk_HdrDtlR.$itm_sub2);
			addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub3, XfrActChk_HdrDtlR.$itm_sub3);
			addColumnPathMap(LotTrace_Chk01_RsltR.$lot_no, XfrActChk_HdrDtlR.$lot_no);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sublot_no, XfrActChk_HdrDtlR.$sublot_no);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sno1, XfrActChk_HdrDtlR.$sno1);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sno2, XfrActChk_HdrDtlR.$sno2);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sno3, XfrActChk_HdrDtlR.$sno3);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sno4, XfrActChk_HdrDtlR.$sno4);
		}
	}

	protected Map_PlntAprv_Chk02_RsltR_XfrActChk_HdrDtlR<PlntAprv_Chk02_RsltR,XfrActChk_HdrDtlR> createMap_PlntAprv_Chk02_RsltR_XfrActChk_HdrDtlR() {
		return new Map_PlntAprv_Chk02_RsltR_XfrActChk_HdrDtlR<PlntAprv_Chk02_RsltR, XfrActChk_HdrDtlR>();
	}

	public class Map_PlntAprv_Chk02_RsltR_XfrActChk_HdrDtlR<D extends PlntAprv_Chk02_RsltR, S extends XfrActChk_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PlntAprv_Chk02_RsltR.$peg_no, XfrActChk_HdrDtlR.$peg_no);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$itm_cd, XfrActChk_HdrDtlR.$itm_cd);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$itm_sub1, XfrActChk_HdrDtlR.$itm_sub1);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$itm_sub2, XfrActChk_HdrDtlR.$itm_sub2);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$itm_sub3, XfrActChk_HdrDtlR.$itm_sub3);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$lot_no, XfrActChk_HdrDtlR.$lot_no);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$sublot_no, XfrActChk_HdrDtlR.$sublot_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.pre_inst_flg(false);
		}
	}

	/**
	 * XfrAct_Upd01オペレーション.<p>
	 *
	 * 移動実績のデータを更新・削除する。<br>
	 */
	public class XfrAct_Upd01 extends MSBEL_XfrActService_MC_A.XfrAct_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			_typ = _upd;

			editUpDtl(up0());
			aggregatedHeader(up0(), null);

			// キャッシュの取得
			getCacheDtl(up0());
			// ＮＯの発番
			setXfrActNoDtl(up0());
			// 移動引当状況の更新
			callXfrAllocStsSvDtl(up0());
			// 支給実績サービスの呼び出し（返品）
			callProvRtnActSvDtl(up0());
			// VMI計上サービスの呼び出し
			callVmiSvDtl(up0());
			// 受払実績サービスの呼び出し
			callIoActInsSvDtl(up0());
			// 支給実績サービスの呼び出し
			callProvActSvDtl(up0());
			// 出荷帳票発行サービスの呼び出し
			callShipRprtPrntSvDtl(up0(), up1());
			// 移動実績ヘッダの更新
			updXfrAct(up0());
			// 移動実績明細の更新
			updXfrActDtl(up0());
			// 受払実績サービスの呼び出し
			callIoActUpdSv();
			MCList<MCRow> list = getXfrSchdNo(getXfrActDtl(up0()));
			if (!isNull(list)) {
				// オーダ登録サービスの呼出
				callOrdRegSrv(list);
				// ＷＧ間依頼サービスの呼出（ステータス更新）
				callWgRqstSrv(list);
				// 受注状況サービスの呼出
				callSloStsRegSrv(up0(), list);
			}
			// 下り電文の設定
			setDownDtl(up0(), down0());
		}

		protected void updXfrAct(MCList<XfrAct_HdrDtlR> up0) {
			MCList<MST_XFR_ACT_R> dbc = MCList.create(MST_XFR_ACT_R.class);
			MST_XFR_ACT_R t = MST_XFR_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			for (XfrAct_HdrDtlR upR :_aggL) {
				dbc.add(upR.xauh().xah());
			}
			dbUpdateKey("MSBEL5220_MST_XFR_ACT_U01", dbc, dbc_bldr);
		}

		protected void updXfrActDtl(MCList<XfrAct_HdrDtlR> up0) {

			MCList<MST_XFR_ACT_D_R> ins = MCList.create(MST_XFR_ACT_D_R.class);
			MCList<MST_XFR_ACT_D_R> upd = MCList.create(MST_XFR_ACT_D_R.class);
			MCList<MST_XFR_ACT_D_R> del = MCList.create(MST_XFR_ACT_D_R.class);

			for (XfrAct_HdrDtlR upR :up0) {
				if (MAC_DATA_CRUD_TYP.isCRT(upR.data_crud_typ())) {
					ins.add(upR.xaud().xad());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ())) {
					upd.add(upR.xaud().xad());
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
					del.add(upR.xaud().xad());
				}
			}

			if (!ins.isEmpty()) {
				MCQueryApiBuilder ins_bldr = MCQueryApiBuilder.create(MST_XFR_ACT_D_R.create("T"));
				dbInsertEx("MSBEL5220_MST_XFR_ACT_D_I01", ins, ins_bldr);
			}
			if (!upd.isEmpty()) {
				MCQueryApiBuilder upd_bldr = MCQueryApiBuilder.create(MST_XFR_ACT_D_R.create("T"));
				upd_bldr.removeSet(MST_XFR_ACT_D_R.$wms_flg);
				upd_bldr.removeSet(MST_XFR_ACT_D_R.$ext_sys_cd);
				upd_bldr.removeSet(MST_XFR_ACT_D_R.$ext_xfr_act_no);
				dbUpdateKey("MSBEL5220_MST_XFR_ACT_D_U01", upd, upd_bldr);
			}
			if (!del.isEmpty()) {
				MCQueryApiBuilder del_bldr = MCQueryApiBuilder.create(MST_XFR_ACT_D_R.create("T"));
				dbDeleteKey("MSBEL5220_MST_XFR_ACT_D_D01", del, del_bldr);
			}
		}
	}

	/**
	 * XfrAct_Ins01オペレーション.<p>
	 *
	 * 移動実績にデータを追加する。<br>
	 */
	public class XfrAct_Ins01 extends MSBEL_XfrActService_MC_A.XfrAct_Ins01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			_typ = _ins;

			editUpDtl(up0());
			aggregatedHeader(up0(), up1());

			// キャッシュの取得
			getCacheDtl(up0());
			// ＮＯの発番
			setXfrActNoDtl(up0());
			// 移動引当状況の更新
			callXfrAllocStsSvDtl(up0());
			// 支給実績サービスの呼び出し（返品）
			callProvRtnActSvDtl(up0());
			// VMI計上サービスの呼び出し
			callVmiSvDtl(up0());
			// 受払実績サービスの呼び出し
			callIoActInsSvDtl(up0());
			// 支給実績サービスの呼び出し
			callProvActSvDtl(up0());
			// 出荷帳票発行サービスの呼び出し
			callShipRprtPrntSvDtl(up0(), up1());
			// 移動実績ヘッダの作成
			crtXfrAct(up0());
			// 移動実績明細の作成
			crtXfrActDtl(up0());
			// 受払実績サービスの呼び出し
			callIoActUpdSv();
			MCList<MCRow> list = getXfrSchdNo(getXfrActDtl(up0()));
			if (!isNull(list)) {
				// オーダ登録サービスの呼出
				callOrdRegSrv(list);
				// ＷＧ間依頼サービスの呼出（ステータス更新）
				callWgRqstSrv(list);
				// 受注状況サービスの呼出
				callSloStsRegSrv(up0(), list);
			}
			// 下り電文の設定
			setDownDtl(up0(), down0());
		}

		protected void crtXfrAct(MCList<XfrAct_HdrDtlR> up0) {
			MCList<MST_XFR_ACT_R> dbc = MCList.create(MST_XFR_ACT_R.class);
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_XFR_ACT_R.create("T"));
			for (XfrAct_HdrDtlR upR :_aggL) {
				dbc.add(upR.xauh().xah());
			}
			dbInsertEx("MSBEL5220_MST_XFR_ACT_I01", dbc, dbc_bldr);
		}

		protected void crtXfrActDtl(MCList<XfrAct_HdrDtlR> up0) {
			MCList<MST_XFR_ACT_D_R> dbc = MCList.create(MST_XFR_ACT_D_R.class);
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_XFR_ACT_D_R.create("T"));
			for (XfrAct_HdrDtlR r : up0) {
				MST_XFR_ALLOC_STS_R xasR = _xfrAllocStsCache.get(r.xfr_alloc_sts_no());
				r.trd_d_rmrks(xasR.trd_d_rmrks());
			}
			for (XfrAct_HdrDtlR upR :up0) {
				dbc.add(upR.xaud().xad());
			}
			dbInsertEx("MSBEL5220_MST_XFR_ACT_D_I02", dbc, dbc_bldr);
		}
	}

	/**
	 * XfrAct_Del01オペレーション.<p>
	 *
	 * 移動実績のデータを削除する。<br>
	 */
	public class XfrAct_Del01 extends MSBEL_XfrActService_MC_A.XfrAct_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			_typ = _del;

			// 移動実績ヘッダの削除
			delXfrAct(up0());
			// 移動実績明細の削除
			delXfrActDtl(up0());

			aggregatedHeader(up0(), null);

			// キャッシュの取得
			getCacheDtl(up0());
			// 移動引当状況の更新
			callXfrAllocStsSvDtl(up0());
			// 支給実績サービスの呼び出し（返品）
			callProvRtnActSvDtl(up0());
			// VMI計上サービスの呼び出し
			callVmiSvDtl(up0());
			// 受払実績サービスの呼び出し
			callIoActInsSvDtl(up0());
			// 支給実績サービスの呼び出し
			callProvActSvDtl(up0());
			// 出荷帳票発行サービスの呼び出し
			callShipRprtPrntSvDtl(up0(), up1());
			// 受払実績サービスの呼び出し
			callIoActUpdSv();
			MCList<MCRow> list = getXfrSchdNo(getXfrActDtl(up0()));
			if (!isNull(list)) {
				// オーダ登録サービスの呼出
				callOrdRegSrv(list);
				// ＷＧ間依頼サービスの呼出（ステータス更新）
				callWgRqstSrv(list);
				// 受注状況サービスの呼出
				callSloStsRegSrv(up0(), list);
			}
			// 下り電文の設定
			setDownDtl(up0(), down0());
		}

		protected void delXfrAct(MCList<XfrAct_HdrDtlR> up0) {
			MCList<MST_XFR_ACT_R> dbc = MCList.create(MST_XFR_ACT_R.class);
			for (XfrAct_HdrDtlR upR :up0) {
				MCRow.copyall(upR.xauh().xah(), getXfrActCache().get(upR.xfr_act_no()));
				dbc.add(upR.xauh().xah());
			}
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_XFR_ACT_R.create("T"));
			dbDeleteKey("MSBEL5220_MST_XFR_ACT_D01", dbc, dbc_bldr);
		}

		protected void delXfrActDtl(MCList<XfrAct_HdrDtlR> up0) {
			MCList<XfrAct_HdrDtlR> hdL = MCList.create(XfrAct_HdrDtlR.class);
			MCList<MST_XFR_ACT_D_R> dbc = MCList.create(MST_XFR_ACT_D_R.class);
			for (XfrAct_HdrDtlR upR :up0) {
				for (MST_XFR_ACT_D_R r :getXfrActDtlCache().getByActNo(upR.xfr_act_no())) {
					XfrAct_HdrDtlR hdR = upR.clone();
					MCRow.copyall(hdR.xauh().xah(), getXfrActCache().get(upR.xfr_act_no()));
					MCRow.copyall(hdR.xaud().xad(), r);
					hdR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					hdR.gi_sppl_cd(getGiLocCache().get(r.gi_loc_cd()).sppl_cd());
					hdL.add(hdR);
					dbc.add(r);
				}
			}
			up0.setAll(hdL);
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_XFR_ACT_D_R.create("T"));
			dbDeleteKey("MSBEL5220_MST_XFR_ACT_D_D02", dbc, dbc_bldr);
		}
	}

	protected void editUpDtl(MCList<XfrAct_HdrDtlR> up0) {
		for(XfrAct_HdrDtlR upR : up0) {
			// ヘッダ関連
			if (isNull(upR.xfr_inst_no())) upR.xfr_inst_no(MAC_STR.NULL_VAL.value()); 
			if (isNull(upR.gr_stk_arrv_bp_cd())) upR.gr_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());

			// 明細関連
			if (isSame(_typ, _ins)) upR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			if (isNull(upR.xfr_alloc_sts_no())) upR.xfr_alloc_sts_no(MAC_STR.NULL_VAL.value());
			if (isNull(upR.xfr_inst_d_no())) upR.xfr_inst_d_no(MAC_STR.NULL_VAL.value());
			if (isNull(upR.gi_str_ln_cd())) upR.gi_str_ln_cd(MAC_STR.NULL_VAL.value());
			if (isNull(upR.gi_stk_arrv_bp_cd())) upR.gi_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
			if (isNull(upR.gr_str_ln_cd())) upR.gr_str_ln_cd(MAC_STR.NULL_VAL.value());
			if (isNull(upR.lot_no())) upR.lot_no(MAC_STR.NULL_VAL.value());
			if (isNull(upR.sublot_no())) upR.sublot_no(MAC_STR.NULL_VAL.value());
			if (isNull(upR.sno1())) upR.sno1(MAC_STR.NULL_VAL.value());
			if (isNull(upR.sno2())) upR.sno2(MAC_STR.NULL_VAL.value());
			if (isNull(upR.sno3())) upR.sno3(MAC_STR.NULL_VAL.value());
			if (isNull(upR.sno4())) upR.sno4(MAC_STR.NULL_VAL.value());
			if (isNull(upR.gd_cd())) upR.gd_cd(getDefaultFeedStkGd().gd_cd());
			if (isNull(upR.quality_typ())) upR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			if (isNull(upR.stk_id_typ())) upR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			if (isNull(upR.stk_bp_cd())) upR.stk_bp_cd(MAC_STR.NULL_VAL.value());
//			if (isNull(upR.dlv_slip_no())) upR.dlv_slip_no(MAC_STR.NULL_VAL.value());	必ず発番されるので補完は不要
//			if (isNull(upR.dlv_slip_d_no())) upR.dlv_slip_d_no(MAC_STR.NULL_VAL.value());	必ず発番されるので補完は不要
			if (isNull(upR.io_schd_pr_no())) upR.io_schd_pr_no(MAC_STR.NULL_VAL.value());
			upR.io_stk_arrv_bp_cd(upR.gi_stk_arrv_bp_cd());
			upR.io_stk_id_typ(upR.stk_id_typ());
			upR.io_stk_bp_cd(upR.stk_bp_cd());

			// 補完
			upR.gi_sppl_cd(getGiLocCache().get(upR.gi_loc_cd()).sppl_cd());
		}
	}

	protected String[] _grp = null;
	protected MCList<XfrAct_HdrDtlR> _aggL = MCList.create(XfrAct_HdrDtlR.class);
	protected MCIndexKey _aggIdx = null;
	protected final String _ins = "1";
	protected final String _upd = "2";
	protected final String _del = "3";
	protected String _typ;
	protected void aggregatedHeader(MCList<XfrAct_HdrDtlR> up0, XfrAct_AggCndR up1) {
		// まとめ条件の設定
		if (isSame(_typ, _ins)) {
			_grp = aggCnd(up1.agg_gi_loc_flg());
		}
		else if (isSame(_typ, _upd) || isSame(_typ, _del)) {
			_grp = new String[] {XfrAct_HdrDtlR.$xfr_act_no};
		}

		// まとめ条件でまとめる
		MCList<XfrAct_HdrDtlR> hdrL = up0.groupBy(_grp);

		// まとめ条件以外の項目を元に戻す
		MCIndexKey upIdx = up0.createIndex(_grp);

		for(XfrAct_HdrDtlR hdrR : hdrL) {
			_aggL.add(up0.getFirst(upIdx, hdrR.toArray(_grp)).clone());
		}
		_aggIdx = up0.createIndex(_grp);
	}

	protected String[] aggCnd(boolean agg_gi_loc_flg) {
		if (agg_gi_loc_flg) {
			return new String[] {
					XfrAct_HdrDtlR.$xfr_inst_no,
					XfrAct_HdrDtlR.$slo_no,
					XfrAct_HdrDtlR.$trd_cd,
					XfrAct_HdrDtlR.$xfr_dt,
					XfrAct_HdrDtlR.$gr_loc_cd,
					XfrAct_HdrDtlR.$gi_loc_cd};
		}
		else {
			return new String[] {
					XfrAct_HdrDtlR.$xfr_inst_no,
					XfrAct_HdrDtlR.$slo_no,
					XfrAct_HdrDtlR.$trd_cd,
					XfrAct_HdrDtlR.$xfr_dt,
					XfrAct_HdrDtlR.$gr_loc_cd,
					XfrAct_HdrDtlR.$gi_sppl_cd};
		}
	}

	protected void getCacheDtl(MCList<XfrAct_HdrDtlR> up0) {
		MCList<XfrAct_DtlR> dtlL = MCList.create(XfrAct_DtlR.class);
		for (XfrAct_HdrDtlR r :up0) {
			dtlL.add(r.xaud());
		}
		selectXfrAllocStsL(dtlL);
		selectItmL(dtlL);
		if (!isSame(_typ, _del)) {
			selectItmUnitL(dtlL);
		} 

		MCList<XfrAct_HdrR> hdrL = MCList.create(XfrAct_HdrR.class);
		for (XfrAct_HdrDtlR r :up0) {
			hdrL.add(r.xauh());
		}
		selectXfrAllocStsByInstL(hdrL);
	}

	protected void setXfrActNoDtl(MCList<XfrAct_HdrDtlR> up0) {
		initGiLocCache(_aggL);
		MCList<ElmArgsR> args = MCList.create(ElmArgsR.class);
		for (XfrAct_HdrDtlR r: _aggL.subList(XfrAct_HdrDtlR.$xfr_act_no, null)) {
			ElmArgsR elmR = args.add();
			elmR.co_cd(getCo().co_cd());
			elmR.wg_cd(getGiLocCache().get(r.gi_loc_cd()).wg_cd());
			elmR.dt(r.xfr_dt());
			elmR.peg_no(r.peg_no());
		}
		setNum(MAC_NUM_BIZ_TYP.XFRACT, args);
		String[] srcCols = new String[]{ElmArgsR.$new_no};
		String[] destCols = new String[]{XfrAct_HdrDtlR.$xfr_act_no};
		copyByPegNo(_aggL, destCols, args, srcCols);

		doSeqCache(MSC_NUM_SYS_TYP.XFRACTD, up0.subList(XfrAct_HdrDtlR.$xfr_act_d_no, null).size());
		int disp_seq;
		for (XfrAct_HdrDtlR hdrR: _aggL) {
			disp_seq = 1;
			for (XfrAct_HdrDtlR dtlR :up0.subList(_aggIdx, hdrR.toArray(_grp))) {
				if (isNull(dtlR.xfr_act_d_no())) dtlR.xfr_act_d_no(getStrSeq(MSC_NUM_SYS_TYP.XFRACTD));
				dtlR.xfr_act_no(hdrR.xfr_act_no());
				dtlR.xfr_act_no_dtl(hdrR.xfr_act_no());
				dtlR.disp_seq(disp_seq++);
			}
		}
	}

	protected void callXfrAllocStsSvDtl(MCList<XfrAct_HdrDtlR> up0) {
		MCList<XfrAct_DtlR> dtlL = MCList.create(XfrAct_DtlR.class);
		for (XfrAct_HdrDtlR r: _aggL) {
			dtlL.addAll(getDtl(r, up0));
		}

		MSBEL_XfrSchdService.XfrSchd_Upd02 o = MSBEL_XfrSchdService.crtXfrSchd_Upd02();
		callXfrAllocStsSvSub(dtlL, o);

		if (!o.up0().isEmpty()) {
			o.up1().act_flg(true);
			o.exec();
		}
	}

	protected void callProvRtnActSvDtl(MCList<XfrAct_HdrDtlR> up0) {
		MSBEL_ProvActService.ProvAct_Upd01 o = MSBEL_ProvActService.crtProvAct_Upd01();
		for (XfrAct_HdrDtlR r: _aggL) {
			callProvRtnActSvSub(r.xauh(), getDtl(r, up0), o);
		}
		if (!o.up0().isEmpty()) {
			o.exec();
			// 支給返品後の在庫着荷先ＣＤ、在庫識別区分、在庫取引先ＣＤを設定しておく
			String[] srcCols = new String[]{ProvActUpd01_DtlR.$stk_arrv_bp_cd, ProvActUpd01_DtlR.$stk_id_typ,
					ProvActUpd01_DtlR.$stk_bp_cd, ProvActUpd01_DtlR.$prov_typ, ProvActUpd01_DtlR.$prov_act_no};
			String[] destCols = new String[]{XfrAct_HdrDtlR.$io_stk_arrv_bp_cd, XfrAct_HdrDtlR.$io_stk_id_typ,
					XfrAct_HdrDtlR.$io_stk_bp_cd, XfrAct_HdrDtlR.$ret_prov_typ, XfrAct_DtlR.$ret_prov_act_no};
			copyByPegNo(up0, destCols, o.down0(), srcCols);
		}
	}

	protected void callVmiSvDtl(MCList<XfrAct_HdrDtlR> up0) {
		MSBDL_VmiService.Vmi_Upd01 o = MSBDL_VmiService.crtVmi_Upd01();
		for (XfrAct_HdrDtlR r: _aggL) {
			callVmiSvSub(r.xauh(), getDtl(r, up0), o);
		}
		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}

	protected void callIoActInsSvDtl(MCList<XfrAct_HdrDtlR> up0) {
		MSBEL_IoActService.IoAct_Ins01 o = MSBEL_IoActService.crtIoAct_Ins01();
		for (XfrAct_HdrDtlR r: _aggL) {
			callIoActInsSvSub(r.xauh(), getDtl(r, up0), o);
		}
		o.exec();
	}

	protected void callProvActSvDtl(MCList<XfrAct_HdrDtlR> up0) {
		MSBEL_ProvActService.ProvAct_Upd01 o = MSBEL_ProvActService.crtProvAct_Upd01();
		for (XfrAct_HdrDtlR r: _aggL) {
			callProvActSvSub(r.xauh(), getDtl(r, up0), o);
		}
		if (!o.up0().isEmpty()) {
			o.exec();
			String[] srcCols = new String[]{ProvActUpd01_DtlR.$prov_typ, ProvActUpd01_DtlR.$prov_act_no};
			String[] destCols = new String[]{XfrAct_HdrDtlR.$prov_typ, XfrAct_HdrDtlR.$prov_act_no};
			copyByPegNo(up0, destCols, o.down0(), srcCols);
		}
	}

	protected void callShipRprtPrntSvDtl(MCList<XfrAct_HdrDtlR> up0, XfrAct_AggCndR cndR) {
		MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o = MSBEL_ShipRprtPrntService.crtShipRprt_Upd01();
		int i = 1;
		for (XfrAct_HdrDtlR r: _aggL) {
			callShipRprtPrntSvSub(r.xauh(), getDtl(r, up0), o, i);
			MCNumber no = (MCNumber)o.up0().max(ShipRprt_Upd01_HdrR.$hdr_peg_no); 
			if (!isNull(no)) {
				i = no.add(1).intValue();
			}
		}
		if (!o.up0().isEmpty()) {
			o.up2().bndl_prnt_flg(cndR.bndl_prnt_flg());
			o.exec();
			if (!isSame(_typ, _del)) {
				MCIndexKey idx = o.down0().createIndex(ShipRprt_Upd01_DtlR.$dtl_uniq_no);
				for (XfrAct_HdrDtlR hdrR : _aggL) {
					for (XfrAct_HdrDtlR r :up0.subList(_aggIdx, hdrR.toArray(_grp))) {
						if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
							ShipRprt_Upd01_DtlR srR = o.down0().getFirst(idx, r.xfr_act_d_no());
							r.dlv_slip_no(srR.dlv_slip_no());
							r.dlv_slip_d_no(srR.dlv_slip_d_no());
							r.dlv_slip_seq(srR.dlv_slip_seq());
							
							hdrR.setBooleanNE(ShipRprt_Upd01_DtlR.$upded_flg,
								hdrR.getBooleanNE(ShipRprt_Upd01_DtlR.$upded_flg) || srR.upded_flg());
							if (hdrR.immd_dlv_prnt_flg()) {
								hdrR.setBooleanNE(ShipRprt_Upd01_DtlR.$dlv_slip_prnted_flg,
									hdrR.getBooleanNE(ShipRprt_Upd01_DtlR.$dlv_slip_prnted_flg) || srR.dlv_slip_prnted_flg());
							}
						}
					}
					// 発行済み
					if (hdrR.getBooleanNE(ShipRprt_Upd01_DtlR.$dlv_slip_prnted_flg)) {
						hdrR.dlv_prnt_flg(true);
						hdrR.dlv_prnt_tm(getToday());
					}
					// 未発行かつ登録対象
					else if (hdrR.getBooleanNE(ShipRprt_Upd01_DtlR.$upded_flg)) {
						hdrR.dlv_prnt_flg(false);
						MST_XFR_ACT_R bfrR = getXfrActCache().get(hdrR.xfr_act_no());
						if (!isNull(bfrR)) {
							hdrR.dlv_prnt_tm(bfrR.dlv_prnt_tm());
						}
						else {
							hdrR.dlv_prnt_tm(null);
						}
					}
					// 未発行かつ登録対象外
					else {
						// 更新前のと同じ
						MST_XFR_ACT_R bfrR = getXfrActCache().get(hdrR.xfr_act_no());
						if (!isNull(bfrR)) {
							hdrR.dlv_prnt_flg(bfrR.dlv_prnt_flg());
							hdrR.dlv_prnt_tm(bfrR.dlv_prnt_tm());
						}
					}
				}
			}
		}
	}

	protected void setDownDtl(MCList<XfrAct_HdrDtlR> up0, MCList<XfrAct_HdrDtlR> down0) {
		down0.setAll(up0);
	}

	protected MCList<XfrAct_DtlR> getDtl(XfrAct_HdrDtlR aggR, MCList<XfrAct_HdrDtlR> up0) {
		MCList<XfrAct_DtlR> retL = MCList.create(XfrAct_DtlR.class);
		for (XfrAct_HdrDtlR r :up0.subList(_aggIdx, aggR.toArray(_grp))) {
			retL.add(r.xaud());
		}
		return retL;
	}

	/**
	 * XfrAct_Upd02オペレーション.<p>
	 *
	 * 移動実績のデータを更新・削除する。<br>
	 */
	public class XfrAct_Upd02 extends MSBEL_XfrActService_MC_A.XfrAct_Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			_typ = _upd;

			editUpHdr(up0(), up1());
			// キャッシュの取得
			getCacheHdr(up0(), up1());
			// ＮＯの発番
			setXfrActNoHdr(up0(), up1());
			// 移動引当状況の更新
			callXfrAllocStsSvHdr(up0(), up1());
			// 支給実績サービスの呼び出し（返品）
			callProvRtnActSvHdr(up0(), up1());
			// VMI計上サービスの呼び出し
			callVmiSvHdr(up0(), up1());
			// 受払実績サービスの呼び出し
			callIoActInsSvHdr(up0(), up1());
			// 支給実績サービスの呼び出し
			callProvActSvHdr(up0(), up1());
			// 出荷帳票発行サービスの呼び出し
			callShipRprtPrntSvHdr(up0(), up1(), up2());
			// 移動実績ヘッダの更新
			updXfrAct(up0(), up1());
			// 移動実績明細の更新
			updXfrActDtl(up0(), up1());
			// 受払実績サービスの呼び出し
			callIoActUpdSv();
			MCList<MCRow> list = getXfrSchdNo(up1());
			if (!isNull(list)) {
				// オーダ登録サービスの呼出
				callOrdRegSrv(list);
				// ＷＧ間依頼サービスの呼出（ステータス更新）
				callWgRqstSrv(list);
				// 受注状況サービスの呼出
				callSloStsRegSrv(up0(), up1(), list);
			}
			// 下り電文の設定
			setDownHdr(up0(), up1(), down0(), down1());
		}

		protected void updXfrAct(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1) {
			MST_XFR_ACT_R xah = up0.xah();
			MCQueryApiBuilder xah_bldr = MCQueryApiBuilder.create(xah);
			if (up0.getBooleanNE(ShipRprt_Upd01_DtlR.$dlv_slip_prnted_flg)) {
				// 発行済み（更新する）
			}
			else if (up0.getBooleanNE(ShipRprt_Upd01_DtlR.$upded_flg)) {
				// 未発行かつ登録対象（発行日時を引き継ぐ）
				xah_bldr.removeSet(xah.dlv_prnt_tm);
			}
			else {
				// 未発行かつ登録対象外（更新前と同じなので更新対象から外す）
				xah_bldr.removeSet(xah.dlv_prnt_flg, xah.dlv_prnt_tm);
			}
			dbUpdateKey("MSBEL5220_MST_XFR_ACT_U02", xah, xah_bldr);
		}

		protected void updXfrActDtl(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1) {
			MCList<MST_XFR_ACT_D_R> ins = MCList.create(MST_XFR_ACT_D_R.class);
			MCList<MST_XFR_ACT_D_R> upd = MCList.create(MST_XFR_ACT_D_R.class);
			MCList<MST_XFR_ACT_D_R> del = MCList.create(MST_XFR_ACT_D_R.class);

			for (XfrAct_DtlR upR :up1) {
				if (MAC_DATA_CRUD_TYP.isCRT(upR.data_crud_typ())) {
					ins.add(upR.xad());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ())) {
					upd.add(upR.xad());
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
					del.add(upR.xad());
				}
			}

			if (!ins.isEmpty()) {
				MCQueryApiBuilder ins_bldr = MCQueryApiBuilder.create(MST_XFR_ACT_D_R.create("T"));
				dbInsertEx("MSBEL5220_MST_XFR_ACT_D_I03", ins, ins_bldr);
			}
			if (!upd.isEmpty()) {
				MCQueryApiBuilder upd_bldr = MCQueryApiBuilder.create(MST_XFR_ACT_D_R.create("T"));
				upd_bldr.removeSet(MST_XFR_ACT_D_R.$wms_flg);
				upd_bldr.removeSet(MST_XFR_ACT_D_R.$ext_sys_cd);
				upd_bldr.removeSet(MST_XFR_ACT_D_R.$ext_xfr_act_no);
				dbUpdateKey("MSBEL5220_MST_XFR_ACT_D_U02", upd, upd_bldr);
			}
			if (!del.isEmpty()) {
				MCQueryApiBuilder del_bldr = MCQueryApiBuilder.create(MST_XFR_ACT_D_R.create("T"));
				dbDeleteKey("MSBEL5220_MST_XFR_ACT_D_D03", del, del_bldr);
			}
		}
	}

	/**
	 * XfrAct_Ins02オペレーション.<p>
	 *
	 * 移動実績にデータを追加する。<br>
	 */
	public class XfrAct_Ins02 extends MSBEL_XfrActService_MC_A.XfrAct_Ins02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			_typ = _ins;

			editUpHdr(up0(), up1());
			// キャッシュの取得
			getCacheHdr(up0(), up1());
			// ＮＯの発番
			setXfrActNoHdr(up0(), up1());
			// 移動引当状況の更新
			callXfrAllocStsSvHdr(up0(), up1());
			// 支給実績サービスの呼び出し（返品）
			callProvRtnActSvHdr(up0(), up1());
			// VMI計上サービスの呼び出し
			callVmiSvHdr(up0(), up1());
			// 受払実績サービスの呼び出し
			callIoActInsSvHdr(up0(), up1());
			// 支給実績サービスの呼び出し
			callProvActSvHdr(up0(), up1());
			// 出荷帳票発行サービスの呼び出し
			callShipRprtPrntSvHdr(up0(), up1(), up2());
			// 移動実績ヘッダの作成
			crtXfrAct(up0(), up1());
			// 移動実績明細の作成
			crtXfrActDtl(up0(), up1());
			// 受払実績サービスの呼び出し
			callIoActUpdSv();
			MCList<MCRow> list = getXfrSchdNo(up1());
			if (!isNull(list)) {
				// オーダ登録サービスの呼出
				callOrdRegSrv(list);
				// ＷＧ間依頼サービスの呼出（ステータス更新）
				callWgRqstSrv(list);
				// 受注状況サービスの呼出
				callSloStsRegSrv(up0(), up1(), list);
			}
			// 下り電文の設定
			setDownHdr(up0(), up1(), down0(), down1());
		}

		protected void crtXfrAct(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1) {
			MST_XFR_ACT_R xah = up0.xah();
			MCQueryApiBuilder xah_bldr = MCQueryApiBuilder.create(xah);
			dbInsertEx("MSBEL5220_MST_XFR_ACT_I02", xah, xah_bldr);
		}

		protected void crtXfrActDtl(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1) {
			MCList<MST_XFR_ACT_D_R> dbc = MCList.create(MST_XFR_ACT_D_R.class);
			for (XfrAct_DtlR upR :up1) {
				dbc.add(upR.xad());
			}
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_XFR_ACT_D_R.create("T"));
			dbInsertEx("MSBEL5220_MST_XFR_ACT_D_I04", dbc, dbc_bldr);
		}
	}

	/**
	 * XfrAct_Del02オペレーション.<p>
	 *
	 * 移動実績のデータを削除する。<br>
	 */
	public class XfrAct_Del02 extends MSBEL_XfrActService_MC_A.XfrAct_Del02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			_typ = _del;

			MCList<XfrAct_DtlR> up1 = MCList.create(XfrAct_DtlR.class);

			// 移動実績ヘッダの削除
			delXfrAct(up0(), up1);
			// 移動実績明細の削除
			delXfrActDtl(up0(), up1);
			// キャッシュの取得
			getCacheHdr(up0(), up1);
			// 移動引当状況の更新
			callXfrAllocStsSvHdr(up0(), up1);
			// 支給実績サービスの呼び出し（返品）
			callProvRtnActSvHdr(up0(), up1);
			// VMI計上サービスの呼び出し
			callVmiSvHdr(up0(), up1);
			// 受払実績サービスの呼び出し
			callIoActInsSvHdr(up0(), up1);
			// 支給実績サービスの呼び出し
			callProvActSvHdr(up0(), up1);
			// 出荷帳票発行サービスの呼び出し
			callShipRprtPrntSvHdr(up0(), up1, up1());
			// 受払実績サービスの呼び出し
			callIoActUpdSv();
			MCList<MCRow> list = getXfrSchdNo(up1);
			if (!isNull(list)) {
				// オーダ登録サービスの呼出
				callOrdRegSrv(list);
				// ＷＧ間依頼サービスの呼出（ステータス更新）
				callWgRqstSrv(list);
				// 受注状況サービスの呼出
				callSloStsRegSrv(up0(), up1, list);
			}
			// 下り電文の設定
			setDownHdr(up0(), up1, down0(), null);
		}

		protected void delXfrAct(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1) {
			MCRow.copyall(up0.xah(), getXfrActCache().get(up0.xfr_act_no()));
			MST_XFR_ACT_R xah = up0.xah();
			MCQueryApiBuilder xah_bldr = MCQueryApiBuilder.create(xah);
			dbDeleteKey("MSBEL5220_MST_XFR_ACT_D02", xah, xah_bldr);
		}

		protected void delXfrActDtl(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1) {
			MCList<MST_XFR_ACT_D_R> dbc = MCList.create(MST_XFR_ACT_D_R.class);
			for (MST_XFR_ACT_D_R r :getXfrActDtlCache().getByActNo(up0.xfr_act_no())) {
				XfrAct_DtlR upR = up1.add();
				MCRow.copyall(upR.xad(), r);
				upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				upR.gi_sppl_cd(getGiLocCache().get(upR.gi_loc_cd()).sppl_cd());
				dbc.add(r);
			}
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_XFR_ACT_D_R.create("T"));
			dbDeleteKey("MSBEL5220_MST_XFR_ACT_D_D04", dbc, dbc_bldr);
		}
	}

	protected void editUpHdr(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1) {

		// ヘッダ関連
		if (isNull(up0.xfr_inst_no())) up0.xfr_inst_no(MAC_STR.NULL_VAL.value()); 
		if (isNull(up0.gr_stk_arrv_bp_cd())) up0.gr_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());

		// 明細関連
		for(XfrAct_DtlR upR : up1) {
			if (isSame(_typ, _ins)) upR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			if (isNull(upR.xfr_alloc_sts_no())) upR.xfr_alloc_sts_no(MAC_STR.NULL_VAL.value());
			if (isNull(upR.xfr_inst_d_no())) upR.xfr_inst_d_no(MAC_STR.NULL_VAL.value());
			if (isNull(upR.gi_str_ln_cd())) upR.gi_str_ln_cd(MAC_STR.NULL_VAL.value());
			if (isNull(upR.gi_stk_arrv_bp_cd())) upR.gi_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
			if (isNull(upR.gr_str_ln_cd())) upR.gr_str_ln_cd(MAC_STR.NULL_VAL.value());
			if (isNull(upR.lot_no())) upR.lot_no(MAC_STR.NULL_VAL.value());
			if (isNull(upR.sublot_no())) upR.sublot_no(MAC_STR.NULL_VAL.value());
			if (isNull(upR.sno1())) upR.sno1(MAC_STR.NULL_VAL.value());
			if (isNull(upR.sno2())) upR.sno2(MAC_STR.NULL_VAL.value());
			if (isNull(upR.sno3())) upR.sno3(MAC_STR.NULL_VAL.value());
			if (isNull(upR.sno4())) upR.sno4(MAC_STR.NULL_VAL.value());
			if (isNull(upR.gd_cd())) upR.gd_cd(getDefaultFeedStkGd().gd_cd());
			if (isNull(upR.quality_typ())) upR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			if (isNull(upR.stk_id_typ())) upR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			if (isNull(upR.stk_bp_cd())) upR.stk_bp_cd(MAC_STR.NULL_VAL.value());
//			if (isNull(upR.dlv_slip_no())) upR.dlv_slip_no(MAC_STR.NULL_VAL.value());	必ず発番されるので補完は不要
//			if (isNull(upR.dlv_slip_d_no())) upR.dlv_slip_d_no(MAC_STR.NULL_VAL.value());	必ず発番されるので補完は不要
			if (isNull(upR.io_schd_pr_no())) upR.io_schd_pr_no(MAC_STR.NULL_VAL.value());
			upR.io_stk_arrv_bp_cd(upR.gi_stk_arrv_bp_cd());
			upR.io_stk_id_typ(upR.stk_id_typ());
			upR.io_stk_bp_cd(upR.stk_bp_cd());

			// 補完
			upR.gi_sppl_cd(getGiLocCache().get(upR.gi_loc_cd()).sppl_cd());
		}
	}

	protected void getCacheHdr(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1) {
		selectXfrAllocStsL(up1);
		selectItmL(up1);
		if (!isSame(_typ, _del)) {
			selectItmUnitL(up1);
		}

		MCList<XfrAct_HdrR> hdrL = MCList.create(XfrAct_HdrR.class);
		hdrL.add(up0);
		selectXfrAllocStsByInstL(hdrL);
	}

	//- 品目マスタ検索 ---------------------------------------------
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
	protected void selectItmL(MCList<XfrAct_DtlR> dtlL) {
		MAM_ITM_R t = MAM_ITM_R.create("T");

		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.stk_mng_typ, t.sundry_itm_flg, t.sno1_mng_typ, t.sno2_mng_typ, t.sno3_mng_typ, t.sno4_mng_typ);
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbcL_bldr, dtlL, XfrAct_DtlR.$itm_cd,
				XfrAct_DtlR.$itm_sub1, XfrAct_DtlR.$itm_sub2, XfrAct_DtlR.$itm_sub3);
	}

	//- 品目単位マスタ検索 ---------------------------------------------
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;;
	protected void selectItmUnitL(MCList<XfrAct_DtlR> up) {
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");

		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.pack_flg);
		_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbc_bldr, up,
				XfrAct_DtlR.$itm_cd,
				XfrAct_DtlR.$itm_sub1,
				XfrAct_DtlR.$itm_sub2,
				XfrAct_DtlR.$itm_sub3,
				XfrAct_DtlR.$trd_unit_cd);
	}

	//- 移動引当状況ＮＯから移動引当状況、移動・移送予定、移動指図明細、支給予定を検索 ---------------------------------------------
	protected FXUCL_MCDbcCache<MST_XFR_ALLOC_STS_R> _xfrAllocStsCache = null;
	protected void selectXfrAllocStsL(MCList<XfrAct_DtlR> dtlL) {
		MST_XFR_SCHD_R t2 = MST_XFR_SCHD_R.create("T2");
		MST_XFR_INST_D_R t3 = MST_XFR_INST_D_R.create("T3");
		MST_PROV_SCHD_R t4 = MST_PROV_SCHD_R.create("T4");
		MST_PROV_SCHD_R t5 = MST_PROV_SCHD_R.create("T5");

		MST_XFR_ALLOC_STS_R t = MST_XFR_ALLOC_STS_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.addSelect(nvl( t3.itm_cd, t2.itm_cd).as("itm_cd"));
		dbc_bldr.addSelect(nvl( t3.itm_sub1, t2.itm_sub1).as("itm_sub1"));
		dbc_bldr.addSelect(nvl( t3.itm_sub2, t2.itm_sub2).as("itm_sub2"));
		dbc_bldr.addSelect(nvl( t3.itm_sub3, t2.itm_sub3).as("itm_sub3"));
		dbc_bldr.addSelect(t2.cont_qty);
		dbc_bldr.addSelect(t4.accpt_schd_dt);
		dbc_bldr.addSelect(t4.prov_typ);
		dbc_bldr.addSelect(t4.prov_basis_typ);
		dbc_bldr.addSelect(t4.xrate_inpt_flg);
		dbc_bldr.addSelect(t4.xrate);
		dbc_bldr.addSelect(t4.ptax_xrate_inpt_flg);
		dbc_bldr.addSelect(t4.ptax_xrate);
		dbc_bldr.addSelect(t4.trd_cur_cd);
		dbc_bldr.addSelect(t4.tax_fix_flg);
		dbc_bldr.addSelect(t4.tax_cd);
		dbc_bldr.addSelect(t4.trd_cur_upri);
		dbc_bldr.addSelect(t4.wtax_rate);
		dbc_bldr.addSelect(t5.accpt_schd_dt.as("ret_accpt_schd_dt"));
		dbc_bldr.addSelect(t5.prov_typ.as("ret_prov_typ"));
		dbc_bldr.addSelect(t5.prov_basis_typ.as("ret_prov_basis_typ"));
		dbc_bldr.addSelect(t5.xrate_inpt_flg.as("ret_xrate_inpt_flg"));
		dbc_bldr.addSelect(t5.xrate.as("ret_xrate"));
		dbc_bldr.addSelect(t5.ptax_xrate_inpt_flg.as("ret_ptax_xrate_inpt_flg"));
		dbc_bldr.addSelect(t5.ptax_xrate.as("ret_ptax_xrate"));
		dbc_bldr.addSelect(t5.trd_cur_cd.as("ret_trd_cur_cd"));
		dbc_bldr.addSelect(t5.tax_fix_flg.as("ret_tax_fix_flg"));
		dbc_bldr.addSelect(t5.tax_cd.as("ret_tax_cd"));
		dbc_bldr.addSelect(t5.trd_cur_upri.as("ret_trd_cur_upri"));
		dbc_bldr.addSelect(t5.wtax_rate.as("ret_wtax_rate"));
		dbc_bldr.addLeftOuterJoin(t2, bracket( t.xfr_schd_no.eq(t2.xfr_schd_no)));
		dbc_bldr.addLeftOuterJoin(t3, bracket( t.xfr_inst_d_no.eq(t3.xfr_inst_d_no)));
		dbc_bldr.addLeftOuterJoin(t4, bracket( t4.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value()))
				.and(t4.prov_src_schd_no1.eq(t.xfr_alloc_sts_no))
				.and(t4.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))));
		dbc_bldr.addLeftOuterJoin(t5, bracket( t5.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value()))
				.and(t5.prov_src_schd_no1.eq(t.xfr_alloc_sts_no))
				.and(t5.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))));

		_xfrAllocStsCache = new FXUCL_MCDbcCache<MST_XFR_ALLOC_STS_R>(dbc_bldr, dtlL, MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);
	}
	//- 移動引当状況ＮＯから移動引当状況を検索 ---------------------------------------------
	protected FXUCL_MCDbcCache<MST_XFR_ALLOC_STS_R> _xfrAllocStsOnlyCache = null;
	protected void selectXfrAllocOnlyStsL (MCList<XfrActChk_HdrDtlR> chkL) {
		MST_XFR_ALLOC_STS_R t = MST_XFR_ALLOC_STS_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		_xfrAllocStsOnlyCache = new FXUCL_MCDbcCache<MST_XFR_ALLOC_STS_R>(dbc_bldr, chkL, MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);
	}
	protected MCList<MST_XFR_ALLOC_STS_R> _xfrAllocStsByInstCache = MCList.create(MST_XFR_ALLOC_STS_R.class);
	protected MCIndexKey _xfrAllocStsByInstIdx = null;
	protected void selectXfrAllocStsByInstL(MCList<XfrAct_HdrR> HdrL) {
		MST_XFR_ALLOC_STS_R t = MST_XFR_ALLOC_STS_R.create("T");
		MST_XFR_INST_D_R t1 = MST_XFR_INST_D_R.create("T1");
		MCQueryApiBuilder _xfrAllocStsByInstCache_bldr = MCQueryApiBuilder.create(t);

		_xfrAllocStsByInstCache_bldr.addSelect(t1.itm_cd,t1.itm_sub1,t1.itm_sub2,t1.itm_sub3,t1.xfr_inst_no.as("xfr_inst_no"));
		_xfrAllocStsByInstCache_bldr.addInnerJoin(t1, bracket( t1.xfr_inst_d_no.eq(t.xfr_inst_d_no)));
		_xfrAllocStsByInstCache_bldr.addWhereWithAnd(t1.xfr_inst_no.eq(bind("xfr_inst_no")));
		dbSelect("MSBEL5220_MST_XFR_ALLOC_STS_S02", _xfrAllocStsByInstCache, _xfrAllocStsByInstCache_bldr, HdrL.groupBy(XfrAct_HdrR.$xfr_inst_no));
		_xfrAllocStsByInstIdx = _xfrAllocStsByInstCache.createIndex("xfr_inst_no");
	}

	protected void setXfrActNoHdr(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1) {
		String actNo;
		if (isNull(up0.xfr_act_no())) {
			ElmArgsR elmR = ElmArgsR.create();
			elmR.co_cd(getCo().co_cd());
			elmR.wg_cd(getGiLoc(up1.get(0)).wg_cd());
			elmR.dt(up0.xfr_dt());
			actNo = getNum(MAC_NUM_BIZ_TYP.XFRACT, elmR);
			up0.xfr_act_no(actNo);
		}
		else {
			actNo = up0.xfr_act_no();
		}

		doSeqCache(MSC_NUM_SYS_TYP.XFRACTD, up1.subList(XfrAct_DtlR.$xfr_act_d_no, null).size());
		for (XfrAct_DtlR upR : up1) {
			if (isNull(upR.xfr_act_d_no())) upR.xfr_act_d_no(getStrSeq(MSC_NUM_SYS_TYP.XFRACTD));
			upR.xfr_act_no_dtl(actNo);
		}
	}

	protected void callXfrAllocStsSvHdr(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1) {
		MSBEL_XfrSchdService.XfrSchd_Upd02 o = MSBEL_XfrSchdService.crtXfrSchd_Upd02();
		callXfrAllocStsSvSub(up1, o);
		if (!o.up0().isEmpty()) {
			o.up1().act_flg(true);
			o.exec();
		}
	}

	protected void callProvRtnActSvHdr(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1) {
		MSBEL_ProvActService.ProvAct_Upd01 o = MSBEL_ProvActService.crtProvAct_Upd01();
		callProvRtnActSvSub(up0, up1, o);
		if (!o.up0().isEmpty()) {
			o.exec();
			// 支給返品後の在庫着荷先ＣＤ、在庫識別区分、在庫取引先ＣＤを設定しておく
			String[] srcCols = new String[]{ProvActUpd01_DtlR.$stk_arrv_bp_cd, ProvActUpd01_DtlR.$stk_id_typ,
					ProvActUpd01_DtlR.$stk_bp_cd, ProvActUpd01_DtlR.$prov_typ, ProvActUpd01_DtlR.$prov_act_no};
			String[] destCols = new String[]{XfrAct_DtlR.$io_stk_arrv_bp_cd, XfrAct_DtlR.$io_stk_id_typ,
					XfrAct_DtlR.$io_stk_bp_cd, XfrAct_DtlR.$ret_prov_typ, XfrAct_DtlR.$ret_prov_act_no};
			copyByPegNo(up1, destCols, o.down0(), srcCols);
		}
	}

	protected void callVmiSvHdr(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1) {
		MSBDL_VmiService.Vmi_Upd01 o = MSBDL_VmiService.crtVmi_Upd01();
		callVmiSvSub(up0, up1, o);
		if (!o.up0().isEmpty()) {
			o.exec();;
		}
	}

	protected void callIoActInsSvHdr(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1) {
		MSBEL_IoActService.IoAct_Ins01 o = MSBEL_IoActService.crtIoAct_Ins01();
		callIoActInsSvSub(up0, up1, o);
		o.exec();
	}

	protected void callProvActSvHdr(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1) {
		MSBEL_ProvActService.ProvAct_Upd01 o = MSBEL_ProvActService.crtProvAct_Upd01();
		callProvActSvSub(up0, up1, o);
		if (!o.up0().isEmpty()) {
			o.exec();
			String[] srcCols = new String[]{ProvActUpd01_DtlR.$prov_typ, ProvActUpd01_DtlR.$prov_act_no};
			String[] destCols = new String[]{XfrAct_DtlR.$prov_typ, XfrAct_DtlR.$prov_act_no};
			copyByPegNo(up1, destCols, o.down0(), srcCols);
		}
	}

	protected void callShipRprtPrntSvHdr(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1, XfrAct_CndR up2) {
		MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o = MSBEL_ShipRprtPrntService.crtShipRprt_Upd01();
		callShipRprtPrntSvSub(up0, up1, o, 1);
		if (!o.up0().isEmpty()) {
			o.up2().bndl_prnt_flg(up2.bndl_prnt_flg());
			o.exec();
			if (!isSame(_typ, _del)) {
				MCIndexKey idx = o.down0().createIndex(ShipRprt_Upd01_DtlR.$dtl_uniq_no);
				for (XfrAct_DtlR r :up1) {
					if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						ShipRprt_Upd01_DtlR srR = o.down0().getFirst(idx, r.xfr_act_d_no());
						r.dlv_slip_no(srR.dlv_slip_no());
						r.dlv_slip_d_no(srR.dlv_slip_d_no());
						r.dlv_slip_seq(srR.dlv_slip_seq());
						
						up0.setBooleanNE(ShipRprt_Upd01_DtlR.$upded_flg,
							up0.getBooleanNE(ShipRprt_Upd01_DtlR.$upded_flg) || srR.upded_flg());
						if (up0.immd_dlv_prnt_flg()) {
							up0.setBooleanNE(ShipRprt_Upd01_DtlR.$dlv_slip_prnted_flg,
								up0.getBooleanNE(ShipRprt_Upd01_DtlR.$dlv_slip_prnted_flg) || srR.dlv_slip_prnted_flg());
						}
					}
				}
				// 発行済み
				if (up0.getBooleanNE(ShipRprt_Upd01_DtlR.$dlv_slip_prnted_flg)) {
					up0.dlv_prnt_flg(true);
					up0.dlv_prnt_tm(getToday());
				}
				else {
					up0.dlv_prnt_flg(false);
					up0.dlv_prnt_tm(null);
				}
			}
		}
	}

	protected void setDownHdr(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1, XfrAct_HdrR down0, MCList<XfrAct_DtlR> down1) {
		MCRow.copyall(down0, up0);
		if (!isSame(_typ, _del)) down1.setAll(up1);
	}

	protected void callXfrAllocStsSvSub(MCList<XfrAct_DtlR> up1, MSBEL_XfrSchdService.XfrSchd_Upd02 o) {

		// 移動引当状況ＮＯが設定してあるレコードを抽出する
		MCList<XfrAct_DtlR> up1Tmp = MCList.create(XfrAct_DtlR.class);
		for (XfrAct_DtlR r :up1) {
			if (isNull(r.xfr_alloc_sts_no()) || MAC_STR.isNULL_VAL(r.xfr_alloc_sts_no())) {
				r.pr_sts_typ(MSC_PR_STS_TYP.COMP.value());
			}
			else {
				XfrAct_DtlR rTmp = r.clone();
				up1Tmp.add(rTmp);
			}
		}

		// base_unit_qtyに今回変更された実績数量を格納する
		for (XfrAct_DtlR r :up1Tmp) {
			// 削除の場合は数量が減少する
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				r.base_unit_qty(r.base_unit_qty().negate());
			}
			// 更新の場合は差分の数量のみとする
			else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				r.base_unit_qty(r.base_unit_qty().subtract(getXfrActDtlCache().getByActDNo(r.xfr_act_d_no()).base_unit_qty()));
			}
		}

		// 移動引当状況ＮＯごとに集計する
		MCGroupByPolicy policy = new MCGroupByPolicy();
		policy.addKey(XfrAct_DtlR.$xfr_alloc_sts_no);
		policy.sum(XfrAct_DtlR.$base_unit_qty);
		policy.min(XfrAct_DtlR.$peg_no);
		policy.max(XfrAct_DtlR.$abort_flg);
		MCList<XfrAct_DtlR> up1Sum = up1Tmp.groupBy(policy);

		// 電文の設定
		MCIndexKey idx2 = up1.createIndex(MST_XFR_ACT_D_R.$xfr_alloc_sts_no);
		for (XfrAct_DtlR r :up1Sum) {
			MST_XFR_ALLOC_STS_R xasR = _xfrAllocStsCache.getEx(r.xfr_alloc_sts_no());

			XfrPr_DtlR upR = o.up0().add();
			copy(upR, xasR, createMap_XfrPr_DtlR_MST_XFR_ALLOC_STS_R());
			upR.peg_no(r.peg_no());
			upR.act_qty(upR.act_qty().add(r.base_unit_qty()));
			upR.abort_flg(r.abort_flg());

			// 進捗状況区分の判定
			if (xasR.base_unit_qty().lte(upR.act_qty())) {
				upR.pr_sts_typ(MSC_PR_STS_TYP.COMP.value());
				upR.cmpl_flg(true);
			}
			else {
				if (upR.act_qty().isZero()) {
					if (MAC_STR.isNULL_VAL(xasR.xfr_inst_d_no())) {
						upR.pr_sts_typ(MSC_PR_STS_TYP.NOT_INST.value());
					}
					else {
						upR.pr_sts_typ(MSC_PR_STS_TYP.INST.value());
					}
				}
				else {
					upR.pr_sts_typ(MSC_PR_STS_TYP.PART_COMP.value());
				}
			}

			// 進捗状況区分を下り電文に返す
			for (XfrAct_DtlR r2 :up1.subList(idx2, r.xfr_alloc_sts_no())) {
				r2.pr_sts_typ(upR.pr_sts_typ());
			}
		}
	}

	protected void callProvRtnActSvSub(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1, MSBEL_ProvActService.ProvAct_Upd01 o) {
		String prspplCd = getGrLocCache().getEx(up0.gr_loc_cd()).sppl_cd();

		for (XfrAct_DtlR r :up1) {
			ProvActUpd01_DtlR upR = ProvActUpd01_DtlR.create();
			copy(upR, r, createMap_ProvActUpd01_DtlR_XfrAct_DtlR());

			upR.prov_schd_no(r.ret_prov_schd_no());
			upR.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.XFR.value());
			upR.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV_RTN.value());
			upR.accpt_dt(up0.xfr_dt());
			upR.ac_dt(up0.ac_dt());
			upR.wg_cd(getGiLocCache().get(r.gi_loc_cd()).wg_cd());
			upR.prsppl_cd(r.gi_sppl_cd());
			upR.prov_typ(r.ret_prov_typ());
			upR.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.XFR.value());
			upR.can_ac_dt(up0.can_ac_dt());
			upR.loc_cd(r.gi_loc_cd());
			upR.str_ln_cd(r.gi_str_ln_cd());
			upR.stk_arrv_bp_cd(r.gi_stk_arrv_bp_cd());

			MST_PROV_ACT_R pa = getProvActCache().get(r.xfr_act_d_no(), MAC_TRD_PTN_TYP.PROV_RTN.value());
			if (isNull(pa) || pa.isEmpty()) {
				if (isNull(r.gi_sppl_cd())) {
					continue;
				}
				// 同一発注先間の外注直送は支給実績を作らない
				else if (isSame(r.gi_sppl_cd(), prspplCd)) {
					continue;
				}
				// 使用基準の在庫の場合は支給実績を作らない
				else if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ()) && MAC_STR.isNULL_VAL(r.gi_stk_arrv_bp_cd())) {
					continue;
				}
				else {
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					else {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					}
				}
			}
			else {
				if (isNull(r.gi_sppl_cd())) {
					upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				// 同一発注先間の外注直送は支給実績を作らない
				else if (isSame(r.gi_sppl_cd(), prspplCd)) {
					upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				// 使用基準の在庫の場合は支給実績を作らない
				else if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ()) && MAC_STR.isNULL_VAL(r.gi_stk_arrv_bp_cd())) {
					upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					else {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					}
				}
				upR.prov_typ(pa.prov_typ());
				upR.prov_basis_typ(pa.prov_basis_typ());
			}
			upR.trd_cd(up0.trd_cd());
			MST_XFR_ALLOC_STS_R xasR = _xfrAllocStsCache.get(r.xfr_alloc_sts_no());
			if(!isNull(xasR)) {
				upR.addBooleanColumn("alloc_flg", xasR.alloc_flg());
			}

			o.up0().add(upR);
		}
	}

	protected void callVmiSvSub(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1, MSBDL_VmiService.Vmi_Upd01 o) {

		for (XfrAct_DtlR r :up1) {
			if (MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ())) {

				String crudTyp = getVmiDataCrudTyp(up0, r);
				if (isNull(crudTyp)) {
					continue;
				}
				Vmi_Chk01_DtlR upR = o.up0().add();
				copy(upR, r, createMap_Vmi_Chk01_DtlR_XfrAct_DtlR());
				upR.data_crud_typ(crudTyp);

				upR.trd_ptn_typ(MAC_TRD_PTN_TYP.PURC_VMI.value());
				upR.purc_src_typ(MSC_PURC_SRC_TYP.XFR.value());
				upR.purc_dt(up0.xfr_dt());
				upR.ac_dt(up0.ac_dt());
				upR.can_ac_dt(up0.can_ac_dt());

				if (!isSame(_typ, _del)) {
					Vmi_Chk01_DtlR cacheR = getVmiDownCache().get(r.peg_no());
					if (!isNull(cacheR)) {
						upR.interim_flg(cacheR.interim_flg());
						upR.trd_cur_upri(cacheR.trd_cur_upri());
					}
				}

				// ＶＭＩ仕入後は自社在庫になる
				if (!MAC_DATA_CRUD_TYP.isDEL(crudTyp)) {
					r.io_stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					r.io_stk_bp_cd(MAC_STR.NULL_VAL.value());
				}
			}
		}
	}

	protected void callIoActInsSvSub(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1, MSBEL_IoActService.IoAct_Ins01 o) {

		String ioActTyp;
		if (MAC_TRD_PTN_TYP.isXFR(up0.trd_ptn_typ())) {
			ioActTyp = MSC_IO_ACT_TYP.XFR_GI.value();
		}
		else {
			ioActTyp = MSC_IO_ACT_TYP.XFR_RTN_GI.value();
		}

		for (XfrAct_DtlR r :up1) {
			IoAct_Ins01_DtlR upR = o.up0().add();
			copy(upR, r, createMap_IoAct_Ins01_DtlR_XfrAct_DtlR());

			upR.ac_dt(up0.ac_dt());
			upR.can_ac_dt(up0.can_ac_dt());
			upR.act_tm(up0.xfr_dt());
			upR.trd_cd(up0.trd_cd());
			upR.trd_ptn_typ(up0.trd_ptn_typ());
			upR.trn_typ(MSC_TRN_TYP.XFR.value());
			upR.io_act_typ(ioActTyp);
			MST_XFR_ALLOC_STS_R xasR = _xfrAllocStsCache.get(r.xfr_alloc_sts_no());
			if(!isNull(xasR) && xasR.alloc_flg()) {
				upR.no_gi_alloc_flg(true);
			}

			if (!isNull(r.itm_cd()) && !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				MAM_ITM_R itm = _itmCache.getEx(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());

				upR.gi_wg_cd(getGiLocCache().get(r.gi_loc_cd()).wg_cd());
				upR.gr_wg_cd(up0.wg_cd());
				upR.act_dpt_cd(up0.act_dpt_cd());
				upR.act_usr_cd(up0.act_usr_cd());
				upR.stk_mng_typ(itm.stk_mng_typ());
				upR.sundry_itm_flg(itm.sundry_itm_flg());
				upR.gr_loc_cd(up0.gr_loc_cd());
				upR.sno1_mng_typ(itm.sno1_mng_typ());
				upR.sno2_mng_typ(itm.sno2_mng_typ());
				upR.sno3_mng_typ(itm.sno3_mng_typ());
				upR.sno4_mng_typ(itm.sno4_mng_typ());
				upR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				if (_itmUnitCache.getEx(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3(), upR.trd_unit_cd()).pack_flg()) {
					upR.pack_unit_qty(upR.trd_unit_qty());
					upR.pack_unit_cd(upR.trd_unit_cd());
				}
				else {
					upR.pack_unit_qty(upR.base_unit_qty());
					upR.pack_unit_cd(upR.base_unit_cd());
				}
				upR.trd_rmrks(up0.trd_rmrks());
			}
		}
	}

	protected void callProvActSvSub(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1, MSBEL_ProvActService.ProvAct_Upd01 o) {
		String prspplCd = getGrLocCache().getEx(up0.gr_loc_cd()).sppl_cd();

		for (XfrAct_DtlR r :up1) {
			ProvActUpd01_DtlR upR = ProvActUpd01_DtlR.create();
			copy(upR, r, createMap_ProvActUpd01_DtlR_XfrAct_DtlR());

			upR.prov_schd_no(r.prov_schd_no());
			upR.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.XFR.value());
			upR.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV.value());
			upR.accpt_dt(up0.xfr_dt());
			upR.ac_dt(up0.ac_dt());
			upR.wg_cd(up0.wg_cd());
			upR.prsppl_cd(prspplCd);
			upR.prov_typ(r.prov_typ());
			upR.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.XFR.value());
			upR.can_ac_dt(up0.can_ac_dt());
			upR.loc_cd(up0.gr_loc_cd());
			upR.str_ln_cd(r.gr_str_ln_cd());
			upR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());

			MST_PROV_ACT_R pa = getProvActCache().get(r.xfr_act_d_no(), MAC_TRD_PTN_TYP.PROV.value());
			if (isNull(pa) || pa.isEmpty()) {
				if (isNull(prspplCd)) {
					continue;
				}
				// 同一発注先間の外注直送は支給実績を作らない
				else if (isSame(r.gi_sppl_cd(), prspplCd)) {
					continue;
				}
				else {
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					else {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					}
				}
			}
			else {
				if (isNull(prspplCd)) {
					upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				// 同一発注先間の外注直送は支給実績を作らない
				else if (isSame(r.gi_sppl_cd(), prspplCd)) {
					upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					else {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					}
				}
				upR.prov_typ(pa.prov_typ());
				upR.prov_basis_typ(pa.prov_basis_typ());
			}
			upR.trd_cd(up0.trd_cd());

			o.up0().add(upR);
		}
	}

	protected void callShipRprtPrntSvSub(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1, MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o, int i) {

		MCList<XfrAct_DtlR> up1LTmp = up1.subList(XfrAct_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value()).clone();

		// 更新では上り電文に含まれない登録済みのレコードを取得する
		if (isSame(_typ, _upd)) {
			MCIndexKey xadIdx = up1.createIndex(XfrAct_DtlR.$xfr_act_d_no);

			for (MST_XFR_ACT_D_R r :getXfrActDtlCache().getByActNo(up0.xfr_act_no())) {
				XfrAct_DtlR up1RTmp = XfrAct_DtlR.create();

				XfrAct_DtlR xadR = up1.getFirst(xadIdx, r.xfr_act_d_no());
				if (isNull(xadR)) {
					MCRow.copyall(up1RTmp.xad(), r);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(xadR.data_crud_typ())) {
					continue;
				}
				else {
					MCRow.copyall(up1RTmp, xadR);
				}
				up1LTmp.add(up1RTmp);
			}
		}

		// 上り電文の設定
		ShipRprt_Upd01_HdrR up0R = ShipRprt_Upd01_HdrR.create();
		copy(up0R, up0, createMap_ShipRprt_Upd01_HdrR_XfrAct_HdrR());

		up0R.hdr_peg_no(i);
		if (isSame(_typ, _ins)) {
			up0R.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
		}
		else if (isSame(_typ, _upd)) {
			up0R.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
		}
		else if (isSame(_typ, _del)) {
			up0R.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			o.up0().add(up0R);
			return;
		}
		if (MAC_TRD_PTN_TYP.isPROV(up0R.trd_ptn_typ())) {
			up0R.bp_cd(getGrLocCache().get(up0.gr_loc_cd()).sppl_cd());
		}
		
		java.util.ArrayList<MCList<XfrAct_DtlR>> arr =new java.util.ArrayList<>();
		if (MAC_TRD_PTN_TYP.isPROV_RTN(up0R.trd_ptn_typ())) {
			// 支給返品の場合は出庫場所ごとにヘッダを分ける
			if (up1LTmp.groupList(XfrAct_DtlR.$gi_loc_cd).length > 1) {
				for (MCList<XfrAct_DtlR> g : up1LTmp.groupList(XfrAct_DtlR.$gi_loc_cd)) {
					arr.add(g);
				}
			}
			else {
				arr.add(up1LTmp);
			}
		}
		else {
			arr.add(up1LTmp);
		}
		
		_xfrActDlvSlip = null;
		for (MCList<XfrAct_DtlR> l : arr) {
			ShipRprt_Upd01_HdrR hdrR = up0R.clone();
			if (MAC_TRD_PTN_TYP.isPROV_RTN(up0R.trd_ptn_typ())) {
				if (!isNull(l) && l.size() > 0) {
					hdrR.bp_cd(l.get(0).gi_sppl_cd());
					hdrR.xfr_loc_cd(l.get(0).gi_loc_cd());
				}
			}
			o.up0().add(hdrR);
			
			for (XfrAct_DtlR r : l) {
				ShipRprt_Upd01_DtlR up1R = o.up1().add();
				copy(up1R, r, createMap_ShipRprt_Upd01_DtlR_XfrAct_DtlR());
				up1R.hdr_peg_no(hdrR.hdr_peg_no());
	
				if (isSame(_typ, _ins)) {
						if(!isNullOrNullVal(r.xfr_alloc_sts_no())) {
							MST_XFR_ALLOC_STS_R xasR = _xfrAllocStsCache.getEx(r.xfr_alloc_sts_no());
							if (!isNullOrNullVal(xasR.dlv_slip_no())
								&& canUseDlvSlipNo(xasR.dlv_slip_no(), up0R.hdr_peg_no(), up1LTmp)) {
							up1R.dlv_slip_no(xasR.dlv_slip_no());
							up1R.dlv_slip_d_no(xasR.dlv_slip_d_no());
								hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
							}
						}
				}
				else {
					MST_XFR_ACT_D_R xadR = getXfrActDtlCache().getByActDNo(r.xfr_act_d_no());
					if (!isNull(xadR)) {
						up1R.dlv_slip_no(xadR.dlv_slip_no());
						up1R.dlv_slip_d_no(xadR.dlv_slip_d_no());
					}
				}
			}
			up0R.hdr_peg_no(up0R.hdr_peg_no().add(1));
		}
	}
	protected MCList<MST_XFR_ACT_D_R> _xfrActDlvSlip;
	protected MCIndexKey _xfrActDlvSlipIdx;
	protected Map<String, MCNumber> _usedDlvSlip;
	protected boolean canUseDlvSlipNo(String dlvSlipNo, MCNumber hdrPegNo, MCList<XfrAct_DtlR> up1L) {
		// 指図時に発番した納品書ＮＯが使用可能か判定する
		// 本メソッドは移動実績の新規登録時のみ使用する想定で、それ以外の状態で使用すると正しく判定できない
		if (_xfrActDlvSlip == null || _usedDlvSlip == null) {
			initCanUseDlvSlip(up1L);
		}
		
		MST_XFR_ACT_D_R actDR = _xfrActDlvSlip.getFirst(_xfrActDlvSlipIdx, dlvSlipNo);
		if (!isNull(actDR)) {
			// 既に登録されている場合は使用不可
			return false;
		}
		if (_usedDlvSlip.containsKey(dlvSlipNo)) {
			if (!isSame(hdrPegNo, _usedDlvSlip.get(dlvSlipNo))) {
				// 異なるヘッダで使用されている場合も使用不可
				return false;
			}
		}
		else {
			_usedDlvSlip.put(dlvSlipNo, hdrPegNo);
		}
		
		// 使用可
		return true;
	}
	protected void initCanUseDlvSlip(MCList<XfrAct_DtlR> up1L) {
		_xfrActDlvSlip = MCList.create(MST_XFR_ACT_D_R.class);
		if (_usedDlvSlip == null) {
			_usedDlvSlip = new HashMap<>();
		}
		
		MCList<MST_XFR_ALLOC_STS_R> bindL = MCList.create(MST_XFR_ALLOC_STS_R.class);
		up1L.forEach(r -> {
			if (!isNullOrNullVal(r.xfr_alloc_sts_no())) {
				bindL.add(_xfrAllocStsCache.getEx(r.xfr_alloc_sts_no()));
			}
		});
	
		MST_XFR_ACT_D_R t = MST_XFR_ACT_D_R.create("T");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
		bldr.setDistinct();
		bldr.setSelect(t.xfr_act_no, t.dlv_slip_no);
		bldr.setWhere(t.dlv_slip_no.eq(bind("dlv_slip_no")));
		
		dbSelect("MSBEL5220_MST_XFR_ACT_D_S03",
			_xfrActDlvSlip, bldr, bindL.groupBy(MST_XFR_ALLOC_STS_R.$dlv_slip_no));
		_xfrActDlvSlipIdx = _xfrActDlvSlip.createIndex(MST_XFR_ACT_D_R.$dlv_slip_no);
	}

	protected void callIoActUpdSv() {
		MSBEL_IoActService.IoAct_Upd01 o = MSBEL_IoActService.crtIoAct_Upd01();
		o.exec();
	}
	protected MCList<XfrAct_DtlR> getXfrActDtl(MCList<XfrAct_HdrDtlR> up) {
		MCList<XfrAct_DtlR> list = MCList.create(XfrAct_DtlR.class);
		addAll(list, up, createMap_XfrAct_DtlR_XfrAct_HdrDtlR());
		return list;
	}
	
	protected MCList<XfrAct_HdrR> getXfrActHdr(MCList<XfrAct_HdrDtlR> up) {
		MCList<XfrAct_HdrR> list = MCList.create(XfrAct_HdrR.class);
		addAll(list, up, createMap_XfrAct_HdrR_XfrAct_HdrDtlR());
		return list;		
	}

	protected MCList<MCRow> getXfrSchdNo(MCList<XfrAct_DtlR> up) {
		MCList<MCRow> list = MCList.create(MCRow.class);
		list.addStringColumn("xfr_schd_no");

		for (XfrAct_DtlR r : up) {
			MST_XFR_ALLOC_STS_R xasR = _xfrAllocStsCache.get(r.xfr_alloc_sts_no());
			if (!xasR.isEmpty()) {
				MCRow row = MCRow.create();
				row.setStringNE("xfr_schd_no", xasR.xfr_schd_no());
				list.add(row);
			}
		}

		if (isNull(list)) {
			return null;
		}
		doXfrSchdCache(list.distinctNE("xfr_schd_no"));

		return list.distinctNE("xfr_schd_no");
	}

	/**
	 * オーダ登録サービスを実行する
	 */
	protected void callOrdRegSrv(MCList<MCRow> list) {
		MSBCL_OrdRegService.Ord_Upd04 o = MSBCL_OrdRegService.crtOrd_Upd04();

		for (MCRow r : list.distinctNE("xfr_schd_no")) {
			if (!isNull(r.getStringNE("xfr_schd_no"))) {
				MST_XFR_SCHD_R xfrR = getXfrSchdR(r.getStringNE("xfr_schd_no"));
				if (isNull(xfrR)
						|| isNull(xfrR.itm_ord_no())) {
					continue;
				}
				copy(o.up0().add(), xfrR, createMap_Ord_Upd04_DtlR_MST_XFR_SCHD_R());
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}

	/**
	 * ＷＧ間依頼サービスを実行する（ステータス更新）
	 */
	protected void callWgRqstSrv(MCList<MCRow> list) {

		// ＷＧ間依頼のステータス更新
		MSBAL_WgRqstService.WgRqst_Upd03 o = MSBAL_WgRqstService.crtWgRqst_Upd03();

		for (MCRow r : list.distinctNE("xfr_schd_no")) {
			if (!isNull(r.getStringNE("xfr_schd_no"))) {
				MST_XFR_SCHD_R xfrR = getXfrSchdR(r.getStringNE("xfr_schd_no"));
				if (!MSC_XFR_SRC_TYP.isWG_RQST(xfrR.xfr_src_typ())) {
					continue;
				}
				copy(o.up0().add(), xfrR, createMap_WgRqst_Upd03_DtlR_MST_XFR_SCHD_R());
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}

	/**
	 * 受注状況更新サービスを実行する
	 */
	protected void callSloStsRegSrv(XfrAct_HdrR up0, MCList<XfrAct_DtlR> up1, MCList<MCRow> list) {
		MSBBL_SloStsRegService.SloSts_Ins01 o = MSBBL_SloStsRegService.crtSloSts_Ins01();
		Map_SloSts_DtlR_MST_XFR_ACT_D_R<SloSts_DtlR,MST_XFR_ACT_D_R> mpr = createMap_SloSts_DtlR_MST_XFR_ACT_D_R();

		MCList<MST_XFR_ACT_D_R> delL = MCList.create(MST_XFR_ACT_D_R.class);
		delL.addStringColumn("slo_d_no");
		delL.addDateColumn("xfr_dt");
		delL.addDateColumn("ac_dt");
		delL.addStringColumn("xfr_inst_no");
		MCList<MST_XFR_ACT_D_R> crtL = delL.clone();

		// 登録前データ
		MST_XFR_ACT_R actHdr = getXfrActCache().get(up0.xfr_act_no());
		MCList<MST_XFR_ACT_D_R> actDtl = getXfrActDtlCache().getByActNo(up0.xfr_act_no());

		MCIndexKey idx = actDtl.createIndex(MST_XFR_ACT_D_R.$xfr_act_d_no);

		for (XfrAct_DtlR r : up1) {

			MST_XFR_ALLOC_STS_R xasR = _xfrAllocStsCache.get(r.xfr_alloc_sts_no());
			MST_XFR_SCHD_R xfrR = getXfrSchdR(xasR.xfr_schd_no());
			String sloDNo = null;
			if (!isNull(xfrR)  && !isNull(xfrR.slo_d_no())) {
				sloDNo = xfrR.slo_d_no();
			}

			if (isNull(sloDNo) || xfrR.rqst_can_flg()) {
				continue;
			}

			MST_XFR_ACT_D_R tmpR = MST_XFR_ACT_D_R.create();
			tmpR.addStringColumn("slo_d_no");
			tmpR.addDateColumn("xfr_dt");
			tmpR.addDateColumn("ac_dt");
			tmpR.addStringColumn("xfr_inst_no");
			// 訂正・削除分
			if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				tmpR = actDtl.getFirst(idx, r.xfr_act_d_no()).clone();
				tmpR.setStringNE("slo_d_no", sloDNo);
				tmpR.setDateNE("xfr_dt", actHdr.xfr_dt());
				tmpR.setDateNE("ac_dt", actHdr.ac_dt());
				tmpR.setStringNE("xfr_inst_no", actHdr.xfr_inst_no());
				delL.add(tmpR);
			}
			// 新規・訂正分
			if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				// 新規分
				if (isNull(actDtl.getFirst(idx, r.xfr_act_d_no()))) {
					tmpR.trd_unit_cd(r.trd_unit_cd());
					tmpR.trd_unit_qty(r.trd_unit_qty());
					tmpR.gi_loc_cd(r.gi_loc_cd());
					tmpR.xfr_inst_d_no(r.xfr_inst_d_no());
					tmpR.xfr_act_no(up0.xfr_act_no());
					tmpR.xfr_act_d_no(r.xfr_act_d_no());
					tmpR.setStringNE("slo_d_no", sloDNo);
					tmpR.setDateNE("xfr_dt", actHdr.xfr_dt());
					tmpR.setDateNE("ac_dt", actHdr.ac_dt());
					tmpR.setStringNE("xfr_inst_no", actHdr.xfr_inst_no());
					
				}
				// 訂正分
				else {
					tmpR = actDtl.getFirst(idx, r.xfr_act_d_no()).clone();
					tmpR.trd_unit_cd(r.trd_unit_cd());
					tmpR.trd_unit_qty(r.trd_unit_qty());
					tmpR.gi_loc_cd(r.gi_loc_cd());
					tmpR.setStringNE("slo_d_no", sloDNo);
					tmpR.setDateNE("xfr_dt", actHdr.xfr_dt());
					tmpR.setDateNE("ac_dt", actHdr.ac_dt());
					tmpR.setStringNE("xfr_inst_no", actHdr.xfr_inst_no());
				}
				crtL.add(tmpR);
			}
		}

		// 訂正・削除分
		if (!delL.isEmpty()) {
			delL = delL.groupBy(groupByForSloSts());
			delL.forEach(r -> r.trd_unit_qty(r.trd_unit_qty().negate())); // 符号反転
			addAll(o.up0(), delL, mpr);
		}
		// 新規・訂正分
		if (!crtL.isEmpty()) {
			crtL = crtL.groupBy(groupByForSloSts());
			addAll(o.up0(), crtL, mpr);
		}
		if (!o.up0().isEmpty())	{
			o.exec();
		}
	}
	
	protected void callSloStsRegSrv(MCList<XfrAct_HdrDtlR> up, MCList<MCRow> list) {
		for(XfrAct_HdrR row : getXfrActHdr(up).groupBy(groupByForHdrR())) {
			callSloStsRegSrv(row, getXfrActDtl(up.subList("xaud.xad.xfr_act_no", row.xfr_act_no())), list);
		}
	}

	/**
	 * GroupByPolicy
	 */
	protected MCGroupByPolicy groupByForHdrR() {
		MCGroupByPolicy gp = new MCGroupByPolicy(XfrAct_HdrR.$xfr_act_no);
		gp.max(XfrAct_HdrR.$xfr_dt);
		return gp;
	}
	
	protected MCGroupByPolicy groupByForSloSts() {
		MCGroupByPolicy gp = new MCGroupByPolicy("slo_d_no", 
				MST_XFR_ACT_D_R.$trd_unit_cd, MST_XFR_ACT_D_R.$gi_loc_cd,
				"xfr_inst_no", MST_XFR_ACT_D_R.$xfr_inst_d_no,
				MST_XFR_ACT_D_R.$xfr_act_no, MST_XFR_ACT_D_R.$xfr_act_d_no,
				"xfr_dt", "ac_dt");
		gp.sum(MST_XFR_ACT_D_R.$trd_unit_qty);
		return gp;
	}

	/**
	 * ブロック分割のマッパー
	 */
	protected Map_XfrAct_DtlR_XfrAct_HdrDtlR<XfrAct_DtlR, XfrAct_HdrDtlR> createMap_XfrAct_DtlR_XfrAct_HdrDtlR() {
		return new Map_XfrAct_DtlR_XfrAct_HdrDtlR<XfrAct_DtlR, XfrAct_HdrDtlR>();
	}

	public class Map_XfrAct_DtlR_XfrAct_HdrDtlR<D extends XfrAct_DtlR, S extends XfrAct_HdrDtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrAct_DtlR.$peg_no, XfrAct_HdrDtlR.$peg_no);
			addColumnPathMap(XfrAct_DtlR.$data_crud_typ, XfrAct_HdrDtlR.$data_crud_typ);
			addColumnPathMap(XfrAct_DtlR.$xfr_alloc_sts_no,	XfrAct_HdrDtlR.$xfr_alloc_sts_no);
			addColumnPathMap(XfrAct_DtlR.$trd_unit_cd, XfrAct_HdrDtlR.$trd_unit_cd);
			addColumnPathMap(XfrAct_DtlR.$trd_unit_qty, XfrAct_HdrDtlR.$trd_unit_qty);
			addColumnPathMap(XfrAct_DtlR.$gi_loc_cd, XfrAct_HdrDtlR.$gi_loc_cd);
			addColumnPathMap(XfrAct_DtlR.$xfr_inst_d_no, XfrAct_HdrDtlR.$xfr_inst_d_no);
			addColumnPathMap(XfrAct_DtlR.$xfr_act_d_no, XfrAct_HdrDtlR.$xfr_act_d_no);
			}
	}

	protected Map_XfrAct_HdrR_XfrAct_HdrDtlR<XfrAct_HdrR, XfrAct_HdrDtlR> createMap_XfrAct_HdrR_XfrAct_HdrDtlR() {
		return new Map_XfrAct_HdrR_XfrAct_HdrDtlR<XfrAct_HdrR, XfrAct_HdrDtlR>();
	}

	public class Map_XfrAct_HdrR_XfrAct_HdrDtlR<D extends XfrAct_HdrR, S extends XfrAct_HdrDtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrAct_HdrR.$peg_no, XfrAct_HdrDtlR.$peg_no);
			addColumnPathMap(XfrAct_HdrR.$xfr_dt, XfrAct_HdrDtlR.$xfr_dt);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.xfr_act_no(src.xaud().xad().xfr_act_no());
		}
	}

	/**
	 * オーダ登録サービス用のマッパー
	 */
	protected Map_Ord_Upd04_DtlR_MST_XFR_SCHD_R<Ord_Upd04_DtlR, MST_XFR_SCHD_R> createMap_Ord_Upd04_DtlR_MST_XFR_SCHD_R() {
		return new Map_Ord_Upd04_DtlR_MST_XFR_SCHD_R<Ord_Upd04_DtlR, MST_XFR_SCHD_R>();
	}

	public class Map_Ord_Upd04_DtlR_MST_XFR_SCHD_R<D extends Ord_Upd04_DtlR, S extends MST_XFR_SCHD_R>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Upd04_DtlR.$itm_ord_no, MST_XFR_SCHD_R.$itm_ord_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.itm_ord_typ(MSC_ITM_ORD_TYP.XFR.value());
		}
	}

	/**
	 * ＷＧ間依頼サービス用のマッパー
	 */
	protected Map_WgRqst_Upd03_DtlR_MST_XFR_SCHD_R<WgRqst_Upd03_DtlR, MST_XFR_SCHD_R> createMap_WgRqst_Upd03_DtlR_MST_XFR_SCHD_R() {
		return new Map_WgRqst_Upd03_DtlR_MST_XFR_SCHD_R<WgRqst_Upd03_DtlR, MST_XFR_SCHD_R>();
	}

	public class Map_WgRqst_Upd03_DtlR_MST_XFR_SCHD_R<D extends WgRqst_Upd03_DtlR, S extends MST_XFR_SCHD_R>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(WgRqst_Upd03_DtlR.$wg_rqst_prms_no, MST_XFR_SCHD_R.$xfr_src_no);

		}
	}
	
	/**
	 * 受注状況更新サービス用のマッパー
	 */
	protected Map_SloSts_DtlR_MST_XFR_ACT_D_R<SloSts_DtlR,MST_XFR_ACT_D_R> createMap_SloSts_DtlR_MST_XFR_ACT_D_R() {
		return new Map_SloSts_DtlR_MST_XFR_ACT_D_R<SloSts_DtlR, MST_XFR_ACT_D_R>();
	}

	public class Map_SloSts_DtlR_MST_XFR_ACT_D_R<D extends SloSts_DtlR, S extends MST_XFR_ACT_D_R> extends MCRowMapper<D,S>{

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SloSts_DtlR.$unit_cd, MST_XFR_ACT_D_R.$trd_unit_cd);
			addColumnPathMap(SloSts_DtlR.$qty, MST_XFR_ACT_D_R.$trd_unit_qty);
			addColumnPathMap(SloSts_DtlR.$loc_cd, MST_XFR_ACT_D_R.$gi_loc_cd);
			addColumnPathMap(SloSts_DtlR.$xfr_inst_d_no, MST_XFR_ACT_D_R.$xfr_inst_d_no);
			addColumnPathMap(SloSts_DtlR.$xfr_act_no, MST_XFR_ACT_D_R.$xfr_act_no);	
			addColumnPathMap(SloSts_DtlR.$xfr_act_d_no, MST_XFR_ACT_D_R.$xfr_act_d_no);				
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.slo_sts_typ(MSC_SLO_STS_TYP.XFR.value());
			dest.slo_d_no(src.getStringNE("slo_d_no"));
			dest.biz_tm(src.getDateNE("xfr_dt"));
			dest.ac_dt(src.getDateNE("ac_dt"));
			dest.xfr_inst_no(src.getStringNE("xfr_inst_no"));
		}
	}

	/**
	 * 移動・移送予定のキャッシュ
	 */
	protected FXUCL_MCDbcCache<MST_XFR_SCHD_R> _cacheXfrSchdL = null;

	protected void doXfrSchdCache(MCList<MCRow> list) {
		MST_XFR_SCHD_R t = MST_XFR_SCHD_R.create("T");

		MCList<MST_XFR_SCHD_R> dbc = MCList.create(MST_XFR_SCHD_R.class);
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.xfr_src_no);
		dbc_bldr.addSelect(t.xfr_src_typ);
		dbc_bldr.addSelect(t.itm_ord_no);
		dbc_bldr.addSelect(t.slo_d_no);
		dbc_bldr.addSelect(t.rqst_can_flg);
		
		if (object(CLAZZ)._cacheXfrSchdL == null) {
			// 対象がなくてもキャッシュのインスタンスは作成するので、ひとまず空リストで作成する
			object(CLAZZ)._cacheXfrSchdL = new FXUCL_MCDbcCache<MST_XFR_SCHD_R>(dbc, dbc_bldr, -1,
					dbc, MST_XFR_SCHD_R.$xfr_schd_no);
		}

		MCList<MCRow> cndL = list.createInstance();
		for (MCRow r : list) {
			if (!isNull(r.getStringNE("xfr_schd_no"))) {
				cndL.add(r);
			}
		}
		if (!cndL.isEmpty()) {
			dbSelectKey("MSBEL5220_MST_XFR_SCHD_S01", dbc, dbc_bldr, cndL);
			dbc.forEach(r -> { object(CLAZZ)._cacheXfrSchdL .putCache(r.toArray(MST_XFR_SCHD_R.$xfr_schd_no), r); });
		}
	}

	protected MST_XFR_SCHD_R getXfrSchdR(String xfrSchdNo) {
		return object(CLAZZ)._cacheXfrSchdL.get(xfrSchdNo);
	}

	protected Map_XfrPr_DtlR_MST_XFR_ALLOC_STS_R<XfrPr_DtlR,MST_XFR_ALLOC_STS_R> createMap_XfrPr_DtlR_MST_XFR_ALLOC_STS_R() {
		return new Map_XfrPr_DtlR_MST_XFR_ALLOC_STS_R<XfrPr_DtlR, MST_XFR_ALLOC_STS_R>();
	}

	public class Map_XfrPr_DtlR_MST_XFR_ALLOC_STS_R<D extends XfrPr_DtlR, S extends MST_XFR_ALLOC_STS_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrPr_DtlR.$xfr_alloc_sts_no, MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);
			addColumnPathMap(XfrPr_DtlR.$act_qty, MST_XFR_ALLOC_STS_R.$act_qty);
			addColumnPathMap(XfrPr_DtlR.$itm_cd, MST_XFR_SCHD_R.$itm_cd);
			addColumnPathMap(XfrPr_DtlR.$itm_sub1, MST_XFR_SCHD_R.$itm_sub1);
			addColumnPathMap(XfrPr_DtlR.$itm_sub2, MST_XFR_SCHD_R.$itm_sub2);
			addColumnPathMap(XfrPr_DtlR.$itm_sub3, MST_XFR_SCHD_R.$itm_sub3);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
		}
	}

	protected Map_Vmi_Chk01_DtlR_XfrAct_DtlR<Vmi_Chk01_DtlR,XfrAct_DtlR> createMap_Vmi_Chk01_DtlR_XfrAct_DtlR() {
		return new Map_Vmi_Chk01_DtlR_XfrAct_DtlR<Vmi_Chk01_DtlR, XfrAct_DtlR>();
	}

	public class Map_Vmi_Chk01_DtlR_XfrAct_DtlR<D extends Vmi_Chk01_DtlR, S extends XfrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Vmi_Chk01_DtlR.$peg_no, XfrAct_DtlR.$peg_no);
			addColumnPathMap(Vmi_Chk01_DtlR.$data_crud_typ, XfrAct_DtlR.$data_crud_typ);
			addColumnPathMap(Vmi_Chk01_DtlR.$purc_src_no, XfrAct_DtlR.$xfr_act_d_no);
			addColumnPathMap(Vmi_Chk01_DtlR.$stk_bp_cd, XfrAct_DtlR.$stk_bp_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$itm_cd, XfrAct_DtlR.$itm_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$itm_sub1, XfrAct_DtlR.$itm_sub1);
			addColumnPathMap(Vmi_Chk01_DtlR.$itm_sub2, XfrAct_DtlR.$itm_sub2);
			addColumnPathMap(Vmi_Chk01_DtlR.$itm_sub3, XfrAct_DtlR.$itm_sub3);
			addColumnPathMap(Vmi_Chk01_DtlR.$trd_unit_cd, XfrAct_DtlR.$trd_unit_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$trd_unit_qty, XfrAct_DtlR.$trd_unit_qty);
			addColumnPathMap(Vmi_Chk01_DtlR.$base_unit_cd, XfrAct_DtlR.$base_unit_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$base_unit_qty, XfrAct_DtlR.$base_unit_qty);
			addColumnPathMap(Vmi_Chk01_DtlR.$gd_cd, XfrAct_DtlR.$gd_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$sno1, XfrAct_DtlR.$sno1);
			addColumnPathMap(Vmi_Chk01_DtlR.$sno2, XfrAct_DtlR.$sno2);
			addColumnPathMap(Vmi_Chk01_DtlR.$sno3, XfrAct_DtlR.$sno3);
			addColumnPathMap(Vmi_Chk01_DtlR.$sno4, XfrAct_DtlR.$sno4);
			addColumnPathMap(Vmi_Chk01_DtlR.$loc_cd, XfrAct_DtlR.$gi_loc_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$str_ln_cd, XfrAct_DtlR.$gi_str_ln_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$lot_no, XfrAct_DtlR.$lot_no);
			addColumnPathMap(Vmi_Chk01_DtlR.$sublot_no, XfrAct_DtlR.$sublot_no);
			addColumnPathMap(Vmi_Chk01_DtlR.$quality_typ, XfrAct_DtlR.$quality_typ);
			addColumnPathMap(Vmi_Chk01_DtlR.$stk_insp_typ, XfrAct_DtlR.$stk_insp_typ);
		}
	}

	protected Map_IoAct_Ins01_DtlR_XfrAct_DtlR<IoAct_Ins01_DtlR,XfrAct_DtlR> createMap_IoAct_Ins01_DtlR_XfrAct_DtlR() {
		return new Map_IoAct_Ins01_DtlR_XfrAct_DtlR<IoAct_Ins01_DtlR, XfrAct_DtlR>();
	}

	public class Map_IoAct_Ins01_DtlR_XfrAct_DtlR<D extends IoAct_Ins01_DtlR, S extends XfrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(IoAct_Ins01_DtlR.$data_crud_typ, XfrAct_DtlR.$data_crud_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$act_no, XfrAct_DtlR.$xfr_act_no_dtl);
			addColumnPathMap(IoAct_Ins01_DtlR.$act_d_no, XfrAct_DtlR.$xfr_act_d_no);
			addColumnPathMap(IoAct_Ins01_DtlR.$rsn_cd, XfrAct_DtlR.$rsn_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$bd_dpt_cd, XfrAct_DtlR.$bd_dpt_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_cd, XfrAct_DtlR.$itm_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub1, XfrAct_DtlR.$itm_sub1);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub2, XfrAct_DtlR.$itm_sub2);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub3, XfrAct_DtlR.$itm_sub3);
			addColumnPathMap(IoAct_Ins01_DtlR.$gi_loc_cd, XfrAct_DtlR.$gi_loc_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$gi_str_ln_cd, XfrAct_DtlR.$gi_str_ln_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$gr_str_ln_cd, XfrAct_DtlR.$gr_str_ln_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$stk_arrv_bp_cd, XfrAct_DtlR.$io_stk_arrv_bp_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$lot_no, XfrAct_DtlR.$lot_no);
			addColumnPathMap(IoAct_Ins01_DtlR.$sublot_no, XfrAct_DtlR.$sublot_no);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno1, XfrAct_DtlR.$sno1);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno2, XfrAct_DtlR.$sno2);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno3, XfrAct_DtlR.$sno3);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno4, XfrAct_DtlR.$sno4);
			addColumnPathMap(IoAct_Ins01_DtlR.$gi_gd_cd, XfrAct_DtlR.$gd_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$gr_gd_cd, XfrAct_DtlR.$gd_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$quality_typ, XfrAct_DtlR.$quality_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$stk_insp_typ, XfrAct_DtlR.$stk_insp_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$stk_id_typ, XfrAct_DtlR.$io_stk_id_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$stk_bp_cd, XfrAct_DtlR.$io_stk_bp_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_qty, XfrAct_DtlR.$trd_unit_qty);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_cd, XfrAct_DtlR.$trd_unit_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_qty, XfrAct_DtlR.$base_unit_qty);
			addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_cd, XfrAct_DtlR.$base_unit_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_d_rmrks, XfrAct_DtlR.$trd_d_rmrks);
		}
	}

	protected Map_ProvActUpd01_DtlR_XfrAct_DtlR<ProvActUpd01_DtlR,XfrAct_DtlR> createMap_ProvActUpd01_DtlR_XfrAct_DtlR() {
		return new Map_ProvActUpd01_DtlR_XfrAct_DtlR<ProvActUpd01_DtlR, XfrAct_DtlR>();
	}

	public class Map_ProvActUpd01_DtlR_XfrAct_DtlR<D extends ProvActUpd01_DtlR, S extends XfrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ProvActUpd01_DtlR.$peg_no, XfrAct_DtlR.$peg_no);
			addColumnPathMap(ProvActUpd01_DtlR.$prov_src_act_no, XfrAct_DtlR.$xfr_act_d_no);
			addColumnPathMap(ProvActUpd01_DtlR.$xfr_rsn_cd, XfrAct_DtlR.$rsn_cd);
			addColumnPathMap(ProvActUpd01_DtlR.$base_unit_cd, XfrAct_DtlR.$base_unit_cd);
			addColumnPathMap(ProvActUpd01_DtlR.$base_unit_qty, XfrAct_DtlR.$base_unit_qty);
			addColumnPathMap(ProvActUpd01_DtlR.$prov_src_schd_no1, XfrAct_DtlR.$xfr_alloc_sts_no);
			addColumnPathMap(ProvActUpd01_DtlR.$trd_unit_cd, XfrAct_DtlR.$trd_unit_cd);
			addColumnPathMap(ProvActUpd01_DtlR.$trd_unit_qty, XfrAct_DtlR.$trd_unit_qty);
			addColumnPathMap(ProvActUpd01_DtlR.$itm_cd, XfrAct_DtlR.$itm_cd);
			addColumnPathMap(ProvActUpd01_DtlR.$itm_sub1, XfrAct_DtlR.$itm_sub1);
			addColumnPathMap(ProvActUpd01_DtlR.$itm_sub2, XfrAct_DtlR.$itm_sub2);
			addColumnPathMap(ProvActUpd01_DtlR.$itm_sub3, XfrAct_DtlR.$itm_sub3);
			addColumnPathMap(ProvActUpd01_DtlR.$lot_no, XfrAct_DtlR.$lot_no);
			addColumnPathMap(ProvActUpd01_DtlR.$sublot_no, XfrAct_DtlR.$sublot_no);
			addColumnPathMap(ProvActUpd01_DtlR.$sno1, XfrAct_DtlR.$sno1);
			addColumnPathMap(ProvActUpd01_DtlR.$sno2, XfrAct_DtlR.$sno2);
			addColumnPathMap(ProvActUpd01_DtlR.$sno3, XfrAct_DtlR.$sno3);
			addColumnPathMap(ProvActUpd01_DtlR.$sno4, XfrAct_DtlR.$sno4);
			addColumnPathMap(ProvActUpd01_DtlR.$gd_cd, XfrAct_DtlR.$gd_cd);
			addColumnPathMap(ProvActUpd01_DtlR.$quality_typ, XfrAct_DtlR.$quality_typ);
			addColumnPathMap(ProvActUpd01_DtlR.$stk_insp_typ, XfrAct_DtlR.$stk_insp_typ);
			addColumnPathMap(ProvActUpd01_DtlR.$stk_id_typ, XfrAct_DtlR.$io_stk_id_typ);
			addColumnPathMap(ProvActUpd01_DtlR.$stk_bp_cd, XfrAct_DtlR.$io_stk_bp_cd);
			addColumnPathMap(ProvActUpd01_DtlR.$base_ac_dt, XfrAct_DtlR.$base_ac_dt);
		}
	}

	protected Map_ShipRprt_Upd01_HdrR_XfrAct_HdrR<ShipRprt_Upd01_HdrR,XfrAct_HdrR> createMap_ShipRprt_Upd01_HdrR_XfrAct_HdrR() {
		return new Map_ShipRprt_Upd01_HdrR_XfrAct_HdrR<ShipRprt_Upd01_HdrR, XfrAct_HdrR>();
	}

	public class Map_ShipRprt_Upd01_HdrR_XfrAct_HdrR<D extends ShipRprt_Upd01_HdrR, S extends XfrAct_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Upd01_HdrR.$can_ac_dt, XfrAct_HdrR.$can_ac_dt);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_slip_prnt_flg, XfrAct_HdrR.$immd_dlv_prnt_flg);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_slip_inst_no, XfrAct_HdrR.$xfr_inst_no);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_slip_act_no, XfrAct_HdrR.$xfr_act_no);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dpt_cd, XfrAct_HdrR.$act_dpt_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$usr_cd, XfrAct_HdrR.$act_usr_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$ship_tm, XfrAct_HdrR.$xfr_dt);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_tm, XfrAct_HdrR.$xfr_dt);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$ac_dt, XfrAct_HdrR.$ac_dt);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_cd, XfrAct_HdrR.$trd_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_ptn_typ, XfrAct_HdrR.$trd_ptn_typ);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_id_cd, XfrAct_HdrR.$gr_loc_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$ship_fr_lg_grp_cd, XfrAct_HdrR.$lg_grp_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$wg_cd, XfrAct_HdrR.$wg_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_rmrks, XfrAct_HdrR.$trd_rmrks);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$sub_char1, XfrAct_HdrR.$sub_char1);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$sub_char2, XfrAct_HdrR.$sub_char2);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$sub_char3, XfrAct_HdrR.$sub_char3);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.split_flg(true);
			dest.trn_typ(MSC_TRN_TYP.XFR.value());
			if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPROV_RTN(src.trd_ptn_typ())) {
				dest.pri_prnt_flg(true);
			}
			else {
				dest.pri_prnt_flg(false);
			}
			MAM_LOC_R grLoc = getGrLocCache().getEx(src.gr_loc_cd());
			dest.dlv_id_typ(MSC_DLV_ID_TYP.LOC.value());
			dest.dlv_id_nm(grLoc.loc_nm());
			dest.dlv_sundry_flg(false);
			dest.dlv_zip_cd(grLoc.getStringNE("dlv_zip_cd"));
			dest.dlv_addr1(grLoc.getStringNE("dlv_addr1"));
			dest.dlv_addr2(grLoc.getStringNE("dlv_addr2"));
			dest.dlv_addr3(grLoc.getStringNE("dlv_addr3"));
			dest.dlv_addr4(grLoc.getStringNE("dlv_addr4"));
			dest.dlv_tel(grLoc.getStringNE("dlv_tel"));
			dest.dlv_fax(grLoc.getStringNE("dlv_fax"));
			dest.adjst_slip_flg(false);
		}
	}

	protected Map_ShipRprt_Upd01_DtlR_XfrAct_DtlR<ShipRprt_Upd01_DtlR,XfrAct_DtlR> createMap_ShipRprt_Upd01_DtlR_XfrAct_DtlR() {
		return new Map_ShipRprt_Upd01_DtlR_XfrAct_DtlR<ShipRprt_Upd01_DtlR, XfrAct_DtlR>();
	}

	public class Map_ShipRprt_Upd01_DtlR_XfrAct_DtlR<D extends ShipRprt_Upd01_DtlR, S extends XfrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Upd01_DtlR.$dtl_uniq_no, XfrAct_DtlR.$xfr_act_d_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_d_no, XfrAct_DtlR.$dlv_slip_d_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_no, XfrAct_DtlR.$dlv_slip_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_cd, XfrAct_DtlR.$itm_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub1, XfrAct_DtlR.$itm_sub1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub2, XfrAct_DtlR.$itm_sub2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub3, XfrAct_DtlR.$itm_sub3);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno1, XfrAct_DtlR.$sno1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno2, XfrAct_DtlR.$sno2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno3, XfrAct_DtlR.$sno3);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno4, XfrAct_DtlR.$sno4);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$lot_no, XfrAct_DtlR.$lot_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sublot_no, XfrAct_DtlR.$sublot_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_unit_qty, XfrAct_DtlR.$trd_unit_qty);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_unit_cd, XfrAct_DtlR.$trd_unit_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_unit_qty, XfrAct_DtlR.$base_unit_qty);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_unit_cd, XfrAct_DtlR.$base_unit_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$rsn_cd, XfrAct_DtlR.$rsn_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$bd_dpt_cd, XfrAct_DtlR.$bd_dpt_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_d_rmrks, XfrAct_DtlR.$trd_d_rmrks);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char1, XfrAct_DtlR.$sub_char1_dtl);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char2, XfrAct_DtlR.$sub_char2_dtl);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char3, XfrAct_DtlR.$sub_char3_dtl);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_ac_dt, XfrAct_DtlR.$base_ac_dt);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.sundry_itm_flg(_itmCache.getEx(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3()).sundry_itm_flg());
		}
	}

	//FMCB CUSTOM END
}