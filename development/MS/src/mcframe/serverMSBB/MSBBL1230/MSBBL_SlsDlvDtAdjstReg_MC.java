package mcframe.serverMSBB.MSBBL1230;

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
import mcframe.serverMAUC.MAUCL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBB.MSBBL1230.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBB.MSBBL1230.Query.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mcframe.serverMSBE.MSBEL5040.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.serverMSBE.MSBEL5520.*;
import mcframe.serverMSBE.MSBEL5500.*;
import mcframe.serverMSBE.MSBEL5510.*;
import mcframe.serverMSBG.MSBGL5080.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import mcframe.serverMSLA.MSLAL5130.MSLAL_PrmsSendIfService;
import mcframe.serverMSLA.MSLAL5130.PrmsSendIf_Upd01_DtlR;
import mcframe.serverMSBA.MSBAL5100.*;
import mcframe.serverMSBB.MSBBL6070.*;
import mcframe.serverMSBB.MSBBL6080.MSBBL_SloStsRegService;
import mcframe.serverMSBB.MSBBL6080.SloSts_DtlR;
import mcframe.serverMSBB.MSBBL6220.MSBBL_SlsSchdService;
import mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd03_DtlR;
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverCore.sys.MCSys;
import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SlsDlvDtAdjstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SlsDlvDtAdjstReg_MC extends MSBBL_SlsDlvDtAdjstReg_MC_A{
	//FMCB CUSTOM START
	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSBBL_SlsDlvDtAdjstReg> CLAZZ = MSBBL_SlsDlvDtAdjstReg.class;

	/**
	 * 受注
	 */
	protected MST_SLO_R _oldSloR = null;

	/**
	 * 受注明細
	 */
	protected MST_SLO_D_R _oldSloDR = null;
	
	/**
	 * 受注明細キャッシュリスト
	 */
	protected MCList<MST_SLO_D_R> _cacheSloDL = null;

	/**
	 * 出荷進捗
	 */
	protected MST_SHIP_PR_R _oldShipPrR = null;

	/**
	 * 出荷進捗キャッシュリスト
	 */
	protected MCList<MST_SHIP_PR_R> _cacheShipPrL = null;

	/**
	 * 出荷予定
	 */
	protected MCList<MST_SHIP_SCHD_R> _oldShipSchdL = null;

	protected MCIndexKey _shipSchdKey = null;
	
	protected MCIndexKey _sloDKey = null;

	protected MCIndexKey _shipPrKey = null;
	
	/**
	 * 物流制御のキャッシュ
	 */
	protected MCList<MAM_LG_CTL_R> _cacheLgCtlList = null;

	protected MCIndexKey _lgCtlIdKey= null;

	/**
	 * 受注ヘッダコンテナを取得する。
	 * 
	 * @param rsltL キャッシュ条件
	 * @return 場所マスタコンテナ
	 */
	protected static void initSloCache(Upd01_SloR hdr) {
		object(CLAZZ)._initSloCache(hdr);
	}

	protected static void initSloDCache(MCList<Upd01_Slo_DR> dtlL) {
		object(CLAZZ)._initSloDCache(dtlL);
	}

	protected static void initShipPrCache(MCList<Upd01_Slo_DR> dtlL) {
		object(CLAZZ)._initShipPrCache(dtlL);
	}

	protected static void initShipSchdCache(MCList<Upd01_Ship_SchdR> dtl) {
		object(CLAZZ)._initShipSchdCache(dtl);
	}
	
	/**
	 * 受注引当格付マスタのキャッシュ
	 */
	protected MCList<MAM_SLO_ALLOC_GD_R> _cacheSloAllocGdL = null;

	protected MCIndexKey _sloAllocGdKey = null;
	
	protected static void initSloAllocGdCache(Upd01_SloR hdrR) {
		object(CLAZZ)._initSloAllocGdCache(hdrR);
	}
	
	protected void _initSloAllocGdCache(Upd01_SloR hdrR) {
		
		MST_SLO_R sloR = getOldSlo(hdrR);
		
		_cacheSloAllocGdL = MCList.create(MAM_SLO_ALLOC_GD_R.class);
		MAM_SLO_ALLOC_GD_R t = MAM_SLO_ALLOC_GD_R.create("T");
		MCQueryApiBuilder cacheSloAllocGdL_bldr = MCQueryApiBuilder.create(t);
		cacheSloAllocGdL_bldr.setWhere(t.cst_cd.eq(bind("cst_cd")));
		dbSelect("MSBBL1230_MAM_SLO_ALLOC_GD_S01", _cacheSloAllocGdL, cacheSloAllocGdL_bldr, sloR);
		_sloAllocGdKey = _cacheSloAllocGdL.createIndex(MAM_SLO_ALLOC_GD_R.$cst_cd, MAM_SLO_ALLOC_GD_R.$dlv_cd, MAM_SLO_ALLOC_GD_R.$gd_cd);
	}
	
	protected static MAM_SLO_ALLOC_GD_R getSloAllocGdCache(String... bind) {
		return object(CLAZZ)._getSloAllocGdCache(bind);
	}
	
	protected MAM_SLO_ALLOC_GD_R _getSloAllocGdCache(String... bind) {
		return _cacheSloAllocGdL.getFirst(_sloAllocGdKey, bind);
	}

	/**
	 * 受注ヘッダコンテナキャッシュを初期化する。
	 * 
	 * @param rsltL キャッシュ条件
	 */
	protected void _initSloCache(Upd01_SloR hdr) {
		_oldSloR = MST_SLO_R.create();
		MCQueryApiBuilder oldSloR_bldr = MCQueryApiBuilder.create(MST_SLO_R.create("T"));

		//受注ヘッダのロック
		dbSelectKeyForUpdateNoWait("MSBBL1230_MST_SLO_S01", _oldSloR, oldSloR_bldr, hdr);
	}

	protected void _initSloDCache(MCList<Upd01_Slo_DR> dtlL) {
		
		_cacheSloDL = MCList.create(MST_SLO_D_R.class);
		MAM_ITM_R m1 = MAM_ITM_R.create("M1");
		MST_SLO_D_R t = MST_SLO_D_R.create("T");
		MCQueryApiBuilder cacheSloDL_bldr = MCQueryApiBuilder.create(t);
		_cacheSloDL.addStringColumn(MAM_ITM_R.$itm_ship_grp_cd);
		cacheSloDL_bldr.addSelect(m1.itm_ship_grp_cd);
		cacheSloDL_bldr.addLeftOuterJoin(m1, t.itm_cd.eq(m1.itm_cd).and(t.itm_sub1.eq(m1.itm_sub1)).and(t.itm_sub2.eq(m1.itm_sub2)).and(t.itm_sub3.eq(m1.itm_sub3)));
		cacheSloDL_bldr.setLockTable(t.slo_d_no);
		dbSelectKeyForUpdateNoWait("MSBBL1230_MST_SLO_D_S01", _cacheSloDL, cacheSloDL_bldr, dtlL);
		
		_sloDKey = _cacheSloDL.createIndex(MST_SLO_D_R.$slo_d_no);
	}

	protected void _initShipPrCache(MCList<Upd01_Slo_DR> dtlL) {
		
		_cacheShipPrL = MCList.create(MST_SHIP_PR_R.class);
		MCQueryApiBuilder cacheShipPrL_bldr = MCQueryApiBuilder.create(MST_SHIP_PR_R.create("T"));
		dbSelectColumnForUpdateNoWait("MSBBL1230_MST_SHIP_PR_S01", _cacheShipPrL, cacheShipPrL_bldr, MST_SHIP_PR_R.$slo_d_no, dtlL, Upd01_Slo_DR.$slo_d_no);
		
		_shipPrKey = _cacheShipPrL.createIndex(MST_SHIP_PR_R.$slo_d_no);
	}

	protected void _initShipSchdCache(MCList<Upd01_Ship_SchdR> dtl) {
		MCList<Upd01_Ship_SchdR> bindL = dtl.subList(Status.MODIFY, Status.DELETE, Status.NONE);
		if (!bindL.isEmpty()) {
			_oldShipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			MCQueryApiBuilder oldShipSchdL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));

			dbSelectKeyForUpdate("MSBBL1230_MST_SHIP_SCHD_S01", _oldShipSchdL, oldShipSchdL_bldr, bindL);
			_shipSchdKey = _oldShipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
		}
	}

	protected static MST_SLO_R getOldSlo(Upd01_SloR hdr) {
		return object(CLAZZ)._getOldSlo(hdr);
	}

	protected MST_SLO_R _getOldSlo(Upd01_SloR hdr) {
		if (_oldSloR == null) {
			initSloCache(hdr);
		}
		return _oldSloR;
	}

	protected static MST_SLO_D_R getOldSloD(Upd01_Slo_DR dtl) {
		return object(CLAZZ)._getOldSloD(dtl);
	}

	protected MST_SLO_D_R _getOldSloD(Upd01_Slo_DR dtl) {
		
		_oldSloDR = _cacheSloDL.getFirst(_sloDKey, dtl.slo_d_no());
		return _oldSloDR;
	}

	protected static MST_SHIP_PR_R getOldShipPr(Upd01_Slo_DR dtl) {
		return object(CLAZZ)._getOldShipPr(dtl);
	}

	protected MST_SHIP_PR_R _getOldShipPr(Upd01_Slo_DR dtl) {
				
		_oldShipPrR = _cacheShipPrL.getFirst(_shipPrKey, dtl.slo_d_no());
		return _oldShipPrR;
	}

	protected static MST_SHIP_SCHD_R getFirstOldShipSchd(String ship_schd_no) {
		return object(CLAZZ)._getFirstOldShipSchd(ship_schd_no);
	}

	protected MST_SHIP_SCHD_R _getFirstOldShipSchd(String ship_schd_no) {
		return _oldShipSchdL.getFirst(_shipSchdKey, ship_schd_no);
	}
	protected static void initLgCtlCache(MCList<Upd01_Ship_SchdR> shipSchdL) {
		object(CLAZZ)._initLgCtlCache(shipSchdL);
	}
	
	protected void _initLgCtlCache(MCList<Upd01_Ship_SchdR> shipSchdL) {
		_cacheLgCtlList = MCList.create(MAM_LG_CTL_R.class);
		MAM_LG_CTL_R lgCtlR = MAM_LG_CTL_R.create("T");
		MCQueryApiBuilder lgCtlR_bldr = MCQueryApiBuilder.create(lgCtlR);

		MCList<MAM_LG_CTL_R> lgCtlList = MCList.create(MAM_LG_CTL_R.class);

		for (Upd01_Ship_SchdR r : shipSchdL) {
			MAM_LG_CTL_R param = MAM_LG_CTL_R.create();
			param.fr_lg_grp_cd(r.ship_fr_lg_grp_cd());
			if (!isNull(r.tdlv_cd()) || !isNull(_oldSloDR.tdlv_cd())) {
				param.to_lg_grp_cd(nvl(r.tdlv_lg_grp_cd(), _oldSloDR.tdlv_lg_grp_cd()));
			}
			else {
				param.to_lg_grp_cd(nvl(r.dlv_lg_grp_cd(), _oldSloDR.dlv_lg_grp_cd()));
			}
			param.ship_term_cd(r.ship_term_cd());
			lgCtlList.add(param);
		}

		lgCtlR_bldr.setSelect(lgCtlR.fr_lg_grp_cd, lgCtlR.to_lg_grp_cd,
				lgCtlR.ship_term_cd);
		lgCtlR_bldr.setWhere(lgCtlR.fr_lg_grp_cd.eq(bind("fr_lg_grp_cd"))
				.and(lgCtlR.to_lg_grp_cd.eq(bind("to_lg_grp_cd")))
				.and(lgCtlR.ship_term_cd.eq(bind("ship_term_cd"))
						.or(lgCtlR.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))));
		dbSelect("MSBBL1230_MAM_LG_CTL_S01", _cacheLgCtlList, lgCtlR_bldr, lgCtlList);
		_lgCtlIdKey = _cacheLgCtlList.createIndex(MAM_LG_CTL_R.$fr_lg_grp_cd,
				MAM_LG_CTL_R.$to_lg_grp_cd, MAM_LG_CTL_R.$ship_term_cd);
	}
	
	protected static MAM_LG_CTL_R getLgCtlCache(String frLgGrpCd, String dlvLgGrpCd, String shipTermCd) {
		return object(CLAZZ)._getLgCtlCache(frLgGrpCd, dlvLgGrpCd, shipTermCd);
	}

	protected MAM_LG_CTL_R _getLgCtlCache(String frLgGrpCd, String dlvLgGrpCd, String shipTermCd) {
		MAM_LG_CTL_R result = MAM_LG_CTL_R.create();
		 result = _cacheLgCtlList.getFirst(_lgCtlIdKey, frLgGrpCd, dlvLgGrpCd, shipTermCd);
		 if (isNull(result)) {
			result = _cacheLgCtlList.getFirst(_lgCtlIdKey, frLgGrpCd, dlvLgGrpCd, MAC_STR.NULL_VAL.value());
		}
		return result;
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 受注に関する各種情報を検索する<br>
	 */
	public class Srch01 extends MSBBL_SlsDlvDtAdjstReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 上り電文を編集
			editUpInfo();
			
			searchAll();
		}

		protected void editUpInfo() {
			// 運用日付
			up0().addDateColumn("today", getToday());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			calcBaseCur();
			
			setShipSchdQty();
			
			calcProfRate(down0(), down1());
			
			setShipSchdAllocStsTyp();
			
			setSloPrmsHNo();
			
		}

		@Override
		protected void doEditDown() {
			super.doEditDown();
			editSloPrms();
		}

		protected void searchAll() {
			//受注ヘッダの取得
			executeQuery(down0(), MSBBL1230_MST_SLO_S01(), up0());
			//受注明細の取得
			executeQuery(down1(), MSBBL1230_MST_SLO_D_S01(), up0());
			//出荷予定の取得
			executeQuery(down2(), MSBBL1230_MST_SHIP_SCHD_S01(), up0());
			//受注納期回答の取得
			executeQuery(down3(), MSBBL1230_MST_SLO_PRMS_S01(), up0());
			//受注状況の取得
			executeQuery(down4(), MSBBL1230_MST_SLO_STS_S01(), up0());
			//引当状況の取得
			executeQuery(down5(), MSBBL1230_MST_SHIP_ALLOC_STS_S01(), up0());
			//納入指示受領の取得
			executeQuery(down6(), MSBBL1230_MST_DLV_INST_RCPT_S01(), up0());
			//ＷＧ間依頼の取得
			executeQuery(down7(), MSBBL1230_MST_WG_RQST_S01(), up0());
			//ＷＧ間依頼回答の取得
			executeQuery(down8(), MSBBL1230_MST_WG_RQST_PRMS_S01(), up0());
			//出荷実績の取得
			executeQuery(down9(), MSBBL1230_MST_SHIP_ACT_D_S01(), up0());
			//受注納期回答履歴の取得
			executeQuery(down10(), MSBBL1230_MST_DW_SLO_PRMS_D_S01(), up0());
			//売上予定の取得
			executeQuery(down11(), MSBBL1230_MST_SLS_SCHD_S01(), up0());
		}

		/**
		 * 受注納期回答を編集する
		 */
		protected void editSloPrms() {
			MCIndexKey idx = down2().createIndex(Rslt_Dtl_Ship_SchdR.$slo_prms_no);
			for (Rslt_Dtl_Slo_PrmsR r : down3()) {
				Rslt_Dtl_Ship_SchdR down2R = down2().getFirst(idx, r.slo_prms_no());
				if (!isNull(down2R)) {
					r.trd_unit_cd(down2R.trd_unit_cd());
					r.trd_unit_dec_place(down2R.trd_unit_dec_place());
				}
			}
		}

		/**
		 * 基準通貨の単価・金額項目を算出する。
		 */
		protected void calcBaseCur() {
			
			String rndMode = getCo().xrate_rnd_typ();
			MCNumber baseAmtDecPlace = getBaseCur().amt_dec_place();
			MCNumber baseUpriDecPlace = getBaseCur().upri_dec_place();
			
			MCNumber ptaxAmtDecPlace = getPtaxCur().amt_dec_place();
			MCNumber ptaxUpriDecPlace = getPtaxCur().upri_dec_place();
			
			for (Rslt_DtlR rsltR : down1()) {
				
				rsltR.base_cur_upri(convToBaseCur(rsltR.trd_cur_upri(), down0().xrate(), baseUpriDecPlace, rndMode));
				rsltR.base_cur_amt(convToBaseCur(rsltR.trd_cur_amt(), down0().xrate(), baseAmtDecPlace, rndMode));
				rsltR.base_cur_tax_amt(convToBaseCur(rsltR.trd_cur_tax_amt(), down0().xrate(), baseAmtDecPlace, rndMode));
				rsltR.base_cur_inc_tax_amt(convToBaseCur(rsltR.trd_cur_inc_tax_amt(), down0().xrate(), baseAmtDecPlace, rndMode));
				
				rsltR.ptax_cur_upri(convToBaseCur(rsltR.trd_cur_upri(), down0().ptax_xrate(), ptaxUpriDecPlace, rndMode));
				rsltR.ptax_cur_amt(convToBaseCur(rsltR.trd_cur_amt(), down0().ptax_xrate(), ptaxAmtDecPlace, rndMode));
				rsltR.ptax_cur_tax_amt(convToBaseCur(rsltR.trd_cur_tax_amt(), down0().ptax_xrate(), ptaxAmtDecPlace, rndMode));
				rsltR.ptax_cur_inc_tax_amt(convToBaseCur(rsltR.trd_cur_inc_tax_amt(), down0().ptax_xrate(), ptaxAmtDecPlace, rndMode));
			}
			
			down0().trd_cur_amt(down1().sum(Rslt_DtlR.$trd_cur_amt));
			down0().trd_cur_inc_tax_amt(down1().sum(Rslt_DtlR.$trd_cur_inc_tax_amt));
		}
		
		/**
		 * 出荷予定の数量を受注明細に設定する。
		 */
		protected void setShipSchdQty() {

			for (Rslt_DtlR rsltR : down1()) {
				
				MCList<Rslt_Dtl_Ship_SchdR> shipSchdL = down2().subList(Rslt_Dtl_Ship_SchdR.$slo_d_no, rsltR.slo_d_no());
				rsltR.alloc_qty(shipSchdL.sum(Rslt_Dtl_Ship_SchdR.$alloc_qty));
				rsltR.wait_qty(shipSchdL.sum(Rslt_Dtl_Ship_SchdR.$wait_qty));
				rsltR.alloc_sts_typ(MSUCL_SlsUtil.getAllocStsTyp( rsltR.alloc_typ(), rsltR.ship_pr_base_unit_qty(), 
						rsltR.alloc_qty(), rsltR.ship_schd_abort_qty(), rsltR.can_flg()));
			}
		}
		
		/**
		 * 粗利率に関連する項目を設定する。
		 * @param hdr 受注ヘッダ
		 * @param dtlL 受注明細
		 */
		protected void calcProfRate(Rslt_HdrR hdr, MCList<Rslt_DtlR> dtlL) {
			
			MCNumber trdCurAmt = null;
			MCNumber ttlAmt = null;
			MCNumber ttlAmtNoCost = null;
			MCNumber baseCurTtlAmt = null;
			MCNumber costAmt = null;
			MCNumber trdCurIncTaxAmt = null;
			
			for (Rslt_DtlR dtlR : dtlL) {
				
				if (isNull(dtlR.trd_cur_amt()) || dtlR.can_flg()) {
					continue;
				}
				
				if (dtlR.dscnt_itm_flg()) {
					
					trdCurAmt = nvl(trdCurAmt, MCNumber.ZERO).subtract(dtlR.trd_cur_amt());
					trdCurIncTaxAmt = nvl(trdCurIncTaxAmt, MCNumber.ZERO).subtract(dtlR.trd_cur_inc_tax_amt());
				}
				else {
					
					trdCurAmt = nvl(trdCurAmt, MCNumber.ZERO).add(dtlR.trd_cur_amt());
					trdCurIncTaxAmt = nvl(trdCurIncTaxAmt, MCNumber.ZERO).add(dtlR.trd_cur_inc_tax_amt());
					if (!isNull(dtlR.cost_upri())) {
						
						ttlAmt = nvl(ttlAmt, MCNumber.ZERO).add(dtlR.trd_cur_amt());
						baseCurTtlAmt = nvl(baseCurTtlAmt, MCNumber.ZERO).add(dtlR.base_cur_amt());
						costAmt = nvl(costAmt, MCNumber.ZERO).add(dtlR.cost_amt());
					}
				}
				
				dtlR.prof_rate(MSUCL_SlsUtil.getProfRate(dtlR.base_cur_amt(), dtlR.cost_amt()));
			}
			
			if (!isNull(trdCurAmt)) {
				ttlAmtNoCost = trdCurAmt.subtract(nvl(ttlAmt, MCNumber.ZERO));
			}
			
			hdr.trd_cur_amt(trdCurAmt);
			hdr.trd_cur_inc_tax_amt(trdCurIncTaxAmt);
			hdr.ttl_amt(ttlAmt);
			hdr.ttl_amt_no_cost(ttlAmtNoCost);
			hdr.prof_rate(MSUCL_SlsUtil.getProfRate(baseCurTtlAmt, costAmt));
		}
		
		/**
		 * 出荷予定の引当状況区分に設定する。
		 */
		protected void setShipSchdAllocStsTyp() {

			MCIndexKey ik = down1().createIndex(Rslt_DtlR.$slo_d_no);
			for (Rslt_Dtl_Ship_SchdR shipSchdR : down2()) {
				Rslt_DtlR sloDR = down1().getFirst(ik, shipSchdR.slo_d_no());
				shipSchdR.alloc_sts_typ(MSUCL_SlsUtil.getAllocStsTyp( sloDR.alloc_typ(), shipSchdR.base_unit_qty(), 
						shipSchdR.alloc_qty(), null, false));
			}
		}

		/**
		 * 受注明細の受注納期回答ヘッダＮＯに設定する。
		 */
		protected void setSloPrmsHNo() {

			MCIndexKey ik = down3().createIndex(Rslt_Dtl_Slo_PrmsR.$slo_d_no);
			for (Rslt_DtlR sloDR : down1()) {
				Rslt_Dtl_Slo_PrmsR sloPrmsR = down3().getFirst(ik, sloDR.slo_d_no());
				if(!isNull(sloPrmsR)) {
					sloDR.slo_prms_h_no(sloPrmsR.slo_prms_h_no());
					sloDR.slo_prms_rev(sloPrmsR.slo_prms_rev());
				}
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 更新前のチェック処理<br>
	 */
	public class Chk01 extends MSBBL_SlsDlvDtAdjstReg_MC_A.Chk01 {
		
		/**
		 * 更新カウンタチェックエラー
		 */
		protected boolean _updCntrErr = false;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				//その他のサービスのチェックを呼出し
				chkCancelStkAlloc();
				chkShipSchd();
			}
			setDown();
		}

		/**
		 * .出荷予定サービスの呼び出し
		 */
		protected void chkShipSchd() {
			//出荷予定、出荷引当状況の作成,出荷進捗を更新しないため、出荷予定サービス.更新（出荷予定）（MSBEL5500.ShipSchd_Upd02）を実行する。
			MSBEL_ShipSchdService.ShipSchd_Chk02 op = MSBEL_ShipSchdService.crtShipSchd_Chk02();
			
			MCList<Upd01_Ship_SchdR> notErrL = getChkList(up2());
			
			for (Upd01_Ship_SchdR dtlR : notErrL) {
				if (dtlR.isStatusModify() || dtlR.isStatusCreate()) {
					ShipSchd_DtlR schdR = ShipSchd_DtlR.create();
					copy(schdR, _oldSloDR, dtlR, createMap_ShipSchd_DtlR_MST_SLO_D_R());
					if (dtlR.isStatusModify()) {
						//対応する更新前の出荷予定を取得する。
						MST_SHIP_SCHD_R oldShipR = getFirstOldShipSchd(dtlR.ship_schd_no());
						schdR.ship_inst_d_no(oldShipR.ship_inst_d_no()); //出荷指図明細ＮＯ
						schdR.inst_qty(oldShipR.ship_inst_qty()); //指図数量（基準単位）
						schdR.inst_unit_cd(oldShipR.base_unit_cd()); //指図単位ＣＤ
						
						if (!isSame(oldShipR.slo_prms_no(), dtlR.slo_prms_no()) && oldShipR.iv_schd_qty().isPositive()) {
							// インボイス登録済みの場合、納期回答を登録可能にするため、インボイスチェック不要にする。
							schdR.iv_chk_skip_flg(true);
						}
						schdR.is_src_sls_dlv_dt_adjst_flg(true);
					}
					op.up0().add(schdR);
				}
				//削除の場合
				if (dtlR.isStatusDelete()) {
					//対応する更新前の出荷予定を取得する。
					MST_SHIP_SCHD_R oldShipR = getFirstOldShipSchd(dtlR.ship_schd_no());
					//既存の出荷予定を削除するための上り電文の作成					
					ShipSchd_DtlR schdR = ShipSchd_DtlR.create();
					schdR.peg_no(dtlR.peg_no());
					schdR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					schdR.ship_pr_no(oldShipR.ship_pr_no());
					schdR.ship_schd_no(oldShipR.ship_schd_no());
					op.up0().add(schdR);					
				}
			}
			op.exec();
		}
		

		/**
		 * 引当解除前のチェック処理
		 */
		protected void chkCancelStkAlloc() {
			//出荷予定サービス.引当解除前のチェック処理。
			MSBEL_ShipSchdService.ShipSchd_Chk06 op = MSBEL_ShipSchdService.crtShipSchd_Chk06();

			MCList<Upd01_Ship_SchdR> notErrL = getChkList(up2());
			
			for (Upd01_Ship_SchdR dtlR : notErrL) {			
				if (dtlR.isStatusModify() || dtlR.isStatusDelete()) {
					//対応する更新前の出荷予定を取得する。
					MST_SHIP_SCHD_R oldShipR = getFirstOldShipSchd(dtlR.ship_schd_no());
					//引当数を算出
					MCNumber alcQty = oldShipR.alloc_qty();
					//出荷予定.データ更新区分=更新の場合、
					//・打切FLG＝オフ、且つ、数量、出荷予定日、納品予定日のいずれかを変更した場合、変更前は引当済みなら、引当解除を行う。
					//・打切FLG＝オンの場合、変更前は引当済みなら、引当解除を行う。
					if (dtlR.isStatusModify()) {
						if ((!dtlR.abort_flg()
								&& alcQty.gt(0))
								&& isChanged(dtlR, oldShipR)  
								|| (dtlR.abort_flg() && alcQty.gt(0))) {
							//指図、出荷、売上済みの場合、取消の対象外とする。
							if (oldShipR.ship_inst_qty().gt(0)
									|| oldShipR.ship_act_qty().gt(0)
									|| oldShipR.sls_qty().gt(0)) {
								continue;
							}							
							ShipSchd_Upd06_DtlR alcCanR = ShipSchd_Upd06_DtlR.create();
							alcCanR.peg_no(dtlR.peg_no());
							alcCanR.ship_schd_no(oldShipR.ship_schd_no());							
							op.up0().add(alcCanR);
						}
					}
					if (dtlR.isStatusDelete()) {
						if (alcQty.gt(0)) {							
							ShipSchd_Upd06_DtlR alcCanR = ShipSchd_Upd06_DtlR.create();
							alcCanR.peg_no(dtlR.peg_no());
							alcCanR.ship_schd_no(oldShipR.ship_schd_no());						
							op.up0().add(alcCanR);
						}
					}
				}
			}
			//引当解除のチェック処理を実行する
			if (!op.up0().isEmpty()) {
				op.exec();
			}
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().addAll(up1());
			down2().addAll(up2());
			down3().addAll(up3());
			down4().addAll(up4());
		}

		@Override
		protected MCMessageList doServerCheckBase() {

			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック、排他ロック獲得
			msgL.addAll(lockAndCheckBase());

			if (!_updCntrErr){
				
				// 補完処理
				crretDtl();
			}

			return msgL;
		}

		/**
		 * コンテナ属性でできないチェック処理
		 */
		@Override
		protected MCMessageList doServerCheckSub() {
			
			if (_updCntrErr) {
				return null;
			}
			
			MCMessageList msgL = super.doServerCheckSub();
			
			MCMessageList dacMsgl = new MCMessageList();
			// DACチェック			
			dacMsgl.addAll(checkWritableDptCdDac(_oldSloR, MST_SLO_R.$sls_dpt_cd));
			
			if (!dacMsgl.isEmpty()) {
				up0().dac_err_flg(true);
			}
			
			msgL.addAll(dacMsgl);
			
			MCList<Upd01_Ship_SchdR> notErrL = getChkList(up2());
			
			for (Upd01_Ship_SchdR shipSchdR : notErrL) {
				if (shipSchdR.isStatusCreate()) {
					//上り電文の再出荷ＦＬＧがオンかつ打切ＦＬＧがオン
					if (shipSchdR.re_ship_schd_flg() && shipSchdR.abort_flg()) {
						msgL.add(new MCMessage(shipSchdR, null, MSBBL0120,
								toDispGUIIndex(shipSchdR)));
					}
				}
			}
			
			if (!MAC_SLO_PROC_TYP.isPURC_DDLV(_oldSloDR.proc_typ())) {
				MCNumber totalQty = up2().subList(Status.CREATE, Status.MODIFY, Status.NONE)
						.subList(Upd01_Ship_SchdR.$re_ship_schd_flg, false)
						.sum(Upd01_Ship_SchdR.$base_unit_qty);
				
				//再出荷ＦＬＧがオフで、新規・更新・変更なしステータス行の数量の合計≠受注明細の数量
				if (!up2().isEmpty() && !isSame(_oldSloDR.base_unit_qty(), totalQty)) {
					msgL.add(new MCMessage(up2().get(0), null, MSBBL0121));
				}
			}
			msgL.addAll(chkReq());
			
			msgL.addAll(chkDlvInstRcptQty());
			
			msgL.addAll(chkSlsActQty());
			
			msgL.addAll(chkSloPrms());
			
			msgL.addAll(chkPrmsQty());
			
			msgL.addAll(chkReShipSchd());
			
			msgL.addAll(chkWgReRqst());
			
			msgL.addAll(chkShipToLgGrpChng());
			
			msgL.addAll(chkSloAllocGd());
			
			msgL.addAll(chkLgCtl());
			
			return msgL;
		}
		
		/**
		 * 納入指示受領の数量が一致するかチェックする。
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkDlvInstRcptQty() {
			
			MCMessageList msgL = new MCMessageList();
			
			if (!MAC_SLO_PROC_TYP.isPURC_DDLV(_oldSloDR.proc_typ())) {
			
				//受注明細に対応する納入指示明細を取得
				MCList<MST_DLV_INST_RCPT_R> instRcptL = MCList.create(MST_DLV_INST_RCPT_R.class);
				MST_DLV_INST_RCPT_R t = MST_DLV_INST_RCPT_R.create("T");
				MCQueryApiBuilder instRcptL_bldr = MCQueryApiBuilder.create(t);
				
				instRcptL_bldr.setWhere(t.slo_d_no.eq(bind("1")), _oldSloDR.slo_d_no());
				instRcptL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
				dbSelect("MSBBL1230_MST_DLV_INST_RCPT_S01", instRcptL, instRcptL_bldr);
				
				for (MST_DLV_INST_RCPT_R instRcptR : instRcptL) {
					
					MCList<Upd01_Ship_SchdR> shipSchdL = up2().subList(
							Upd01_Ship_SchdR.$dlv_inst_rcpt_no, instRcptR.dlv_inst_rcpt_no()).subList(
									Status.CREATE, Status.MODIFY, Status.NONE);
					
					MCNumber shipSchdQty = MCNumber.ZERO;
					if (!isNull(shipSchdL) && !shipSchdL.isEmpty()) {
						shipSchdQty = shipSchdL.sum(Upd01_Ship_SchdR.$trd_unit_qty);
					}
					
					if (!isSame(instRcptR.trd_unit_qty(), shipSchdQty)) {
						msgL.add(new MCMessage(
								up1().get(0),
								null,
								MSBBL0229, 
								instRcptR.dlv_inst_rcpt_no(),
								shipSchdQty, 
								instRcptR.trd_unit_qty()));
					}
				}
			
			}

			return msgL;
		}
		
		/**
		 * 売上実績の数量が一致するかチェックする。
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkSlsActQty() {
			
			MCMessageList msgL = new MCMessageList();
			
			if (!_oldSloDR.can_flg()) {
				
				// 変更前の売上実績数量を取得する。
				MCList<MST_SHIP_SCHD_R> oldshipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
				MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
				MCQueryApiBuilder oldshipSchdL_bldr = MCQueryApiBuilder.create(t);
				
				oldshipSchdL_bldr.setWhere(t.ship_pr_no.eq(bind("1")), _oldShipPrR.ship_pr_no());
				oldshipSchdL_bldr.addWhereWithAnd(t.sls_act_d_no.isNotNull());
				
				oldshipSchdL_bldr.setGroupBy(t.sls_act_d_no);
				oldshipSchdL_bldr.addGroupFunc(sum(t.trd_unit_qty), "trd_unit_qty");
				
				dbSelect("MSBBL1230_MST_SHIP_SCHD_S02", oldshipSchdL, oldshipSchdL_bldr);
				
				for (MST_SHIP_SCHD_R shipSchdR : oldshipSchdL) {
					
					MCList<Upd01_Ship_SchdR> shipSchdL = up2().subList(
							Upd01_Ship_SchdR.$sls_act_d_no, shipSchdR.sls_act_d_no()).subList(
									Status.CREATE, Status.MODIFY, Status.NONE);
					
					MCNumber shipSchdQty = MCNumber.ZERO;
					if (!isNull(shipSchdL) && !shipSchdL.isEmpty()) {
						shipSchdQty = shipSchdL.sum(Upd01_Ship_SchdR.$trd_unit_qty);
					}
					
					if (!isSame(shipSchdR.trd_unit_qty(), shipSchdQty)) {
						msgL.add(new MCMessage(
								up1().get(0),
								null,
								MSBBL0233, 
								shipSchdR.sls_act_d_no(),
								shipSchdR.trd_unit_qty(),
								shipSchdQty));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 出荷予定と納期回答の関係が正しいかチェックする。
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkSloPrms() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCIndexKey idxSloPrms = up3().createIndex(Upd01_Slo_PrmsR.$slo_d_no);
			MCIndexKey idxShipSchd = up2().createIndex(Upd01_Ship_SchdR.$slo_d_no);
			
			for (Upd01_Slo_DR sloR : up1()) {
				MCList<Upd01_Slo_PrmsR> sloPrmsL = up3().subList(idxSloPrms, sloR.slo_d_no());
				
				// 納期回答に変更がある場合にチェックする
				if (!sloPrmsL.statusChangedList().isEmpty()) {
					
					MCList<Upd01_Ship_SchdR> shipSchdL = up2().subList(idxShipSchd, sloR.slo_d_no());
					MCIndexKey idx = shipSchdL.createIndex(Upd01_Ship_SchdR.$slo_prms_no);
					
					for (Upd01_Slo_PrmsR sloPrmsR : sloPrmsL) {
						
						if (isNull(sloPrmsR.slo_prms_no()) || sloPrmsR.isStatusDelete()) {
							continue;
						}
						
						MCList<Upd01_Ship_SchdR> shipSchdSubL = shipSchdL.subList(idx, sloPrmsR.slo_prms_no());
						if (isNull(shipSchdSubL) || shipSchdSubL.size() != 1) {
							msgL.add(new MCMessage(
									sloPrmsR,
									null,
									MSBBL0512,
									sloPrmsR.slo_d_no(),
									sloPrmsR.slo_prms_no(),
									toDispGUIIndex(sloPrmsR)));
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 納期回答数量が出荷予定数量合計と一致するかチェックする。
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkPrmsQty() {

			MCMessageList msgL = new MCMessageList();
			
			if (!_oldSloDR.can_flg() && !_oldSloDR.abort_flg()) {
				
				MCIndexKey idxkey = up2().createIndex(Upd01_Ship_SchdR.$slo_prms_no, Upd01_Ship_SchdR.$abort_flg);
				MCIndexKey idxPrmsKey = up3().createIndex(Upd01_Ship_SchdR.$slo_prms_no);
				MCIndexKey idxShipSchd = up2().createIndex(Upd01_Ship_SchdR.$slo_d_no);
				MCIndexKey idxSloPrms = up3().createIndex(Upd01_Slo_PrmsR.$slo_d_no);
				
				for (Upd01_Slo_PrmsR sloPrmsR : up3().subList(Status.CREATE, Status.MODIFY, Status.NONE)) {
					
					Comparable<?>[] vals = new Comparable<?>[] {sloPrmsR.slo_prms_no(), false};
					
					MCList<Upd01_Ship_SchdR> shipSchdL = up2().subList(idxkey, vals).subList(
									Status.CREATE, Status.MODIFY, Status.NONE);
					MCList<Upd01_Slo_PrmsR> sloPrmsL = up3().subList(idxPrmsKey, sloPrmsR.slo_prms_no()).subList(
									Status.CREATE, Status.MODIFY, Status.NONE);
					
					//出荷予定枠、納期回答枠を変更していない受注明細についてはチェックしない
					if (!isChangedSloPrms(sloPrmsR, idxSloPrms) && !isChangedShipSchd(sloPrmsR, idxShipSchd)) {
						continue;
					}
					//同一受注納期回答ＮＯが存在する場合はチェックしない
					if (sloPrmsL.size() > 1) {
						continue;
					}
					
					MCNumber shipSchdQty = MCNumber.ZERO;
					if (!isNull(shipSchdL) && !shipSchdL.isEmpty()) {
						shipSchdQty = shipSchdL.sum(Upd01_Ship_SchdR.$trd_unit_qty);
					}
					
					if (!isSame(sloPrmsR.trd_unit_prms_qty(), shipSchdQty)) {
						msgL.add(new MCMessage(
								sloPrmsR, 
								Upd01_Slo_PrmsR.$trd_unit_prms_qty, 
								MSBBL0230, 
								sloPrmsR.trd_unit_prms_qty(), 
								shipSchdQty,
								toDispGUIIndex(sloPrmsR)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 未出荷状態で再出荷が存在するかどうかチェックする。
		 */
		protected MCMessageList chkReShipSchd() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<Upd01_Ship_SchdR> notErrL = getChkList(up2());
			
			notErrL = notErrL.subList(Upd01_Ship_SchdR.$re_ship_schd_flg, true).subList(Status.CREATE, Status.MODIFY, Status.NONE);
				
			if (!isNull(_oldShipPrR) && !isNull(_oldShipPrR.ship_act_qty()) && !_oldShipPrR.ship_act_qty().isPositive()) {
				
				for (Upd01_Ship_SchdR dtlR : notErrL) {
					
					msgL.add(new MCMessage(dtlR, Upd01_Ship_SchdR.$re_ship_schd_flg, MSBBL0246, toDispGUIIndex(dtlR)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 出荷予定の打切または削除と、ＷＧ間依頼の出荷依頼の再調整依頼は同時に行えないようにチェックする。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkWgReRqst() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<Upd01_Ship_SchdR> notErrL = getChkList(up2());
			
			MCList<MST_WG_RQST_R> wgRqstL = MCList.create(MST_WG_RQST_R.class);
			MST_WG_RQST_R t = MST_WG_RQST_R.create("T");
			MCQueryApiBuilder wgRqstL_bldr = MCQueryApiBuilder.create(t);
			wgRqstL_bldr.setWhere(t.slo_d_no.eq(bind("1")), _oldSloDR.slo_d_no());
			dbSelect("MSBBL1230_MST_WG_RQST_S01", wgRqstL, wgRqstL_bldr);
			MCIndexKey idxkey =  wgRqstL.createIndex(MST_WG_RQST_R.$wg_rqst_src_no);
			
			String causeCol = null;
				
			for (Upd01_Ship_SchdR dtlR : notErrL) {
				
				MST_SHIP_SCHD_R oldShipR = getFirstOldShipSchd(dtlR.ship_schd_no());
				if ((!isNull(oldShipR) && dtlR.abort_flg() && !oldShipR.abort_flg()) || MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					
					MCList<MST_WG_RQST_R> subWgRqstL = wgRqstL.subList(idxkey, dtlR.ship_schd_no());
					
					for (MST_WG_RQST_R wgRqstR : subWgRqstL) {
						
						Upd01_WG_RqstR up4R = up4().getFirst(Upd01_WG_RqstR.$wg_rqst_no, wgRqstR.wg_rqst_no());
						
						if (!isNull(up4R) 
								&& (!isSame(wgRqstR.re_rqst_flg(), up4R.re_rqst_flg()) 
										|| !isSame(wgRqstR.re_rqst_dt(), up4R.re_rqst_dt()) 
										|| !isSame(wgRqstR.wg_re_rqst_cnt_rmrks(), up4R.wg_re_rqst_cnt_rmrks())
										|| !isSame(wgRqstR.prms_uncn_flg(), up4R.prms_uncn_flg()))) {
							
							if (dtlR.abort_flg() && !oldShipR.abort_flg()) {
								causeCol = Upd01_Ship_SchdR.$abort_flg;
							}
							
							msgL.add(new MCMessage(dtlR, causeCol, MSBBL0272, dtlR.ship_schd_no()));
							break;
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 必須チェックを行う。
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkReq() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<Upd01_Ship_SchdR> notErrL = getChkList(up2());
			
			for (Upd01_Ship_SchdR r : notErrL) {
				
				if (MAC_DATA_CRUD_TYP.isDEL(r .data_crud_typ()) 
						|| MAC_SLO_PROC_TYP.isPURC_DDLV(_oldSloDR.proc_typ())) {
					continue;
				}
				
				if (!isNull(r.dlv_cd()) && r.dlv_sundry_flg()){
					msgL.addAll(check(r, Upd01_Ship_SchdR.$dlv_nm, new FXUCL_RequiredValidater()));
				}
				
				if (!isNull(r.tdlv_cd()) && r.tdlv_sundry_flg()){
					msgL.addAll(check(r, Upd01_Ship_SchdR.$tdlv_nm, new FXUCL_RequiredValidater()));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 出荷予定の納品先、配送先が変更された場合、物流Ｇから出荷可能かチェックする。
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkShipToLgGrpChng() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<Upd01_Ship_SchdR> notErrL = getChkList(up2());
			
			MCList<Upd01_Ship_SchdR> chkL = MCList.create(Upd01_Ship_SchdR.class);
			
			for (Upd01_Ship_SchdR r : notErrL) {
				if (needChkShipToLgGrpChng(r)) {
					chkL.add(r);
				}
			}
			
			if (!chkL.isEmpty()) {
				String strWgCd = _oldSloR.wg_cd();
				MSUCL_SlsUtil.SrchSloAlloc srchSloAlloc = MSUCL_SlsUtil.crtSrchSloAlloc(strWgCd);
				for (Upd01_Ship_SchdR r : chkL) {
					String strLgGrpCd;
					if (!isNull(r.tdlv_cd())) {
						strLgGrpCd = r.tdlv_lg_grp_cd();
					}
					else {
						strLgGrpCd = r.dlv_lg_grp_cd();
					}
					MCRow bindMsg = MCRow.create();
					MAM_SLO_ALLOC_R allInfR = srchSloAlloc.getSloAllocR(_oldSloDR, strWgCd, strLgGrpCd, bindMsg);
					if (isNull(allInfR)) {
						msgL.add(new MCMessage(r, null, MSBBL0172, strLgGrpCd, _oldSloDR.getStringNE("itm_ship_grp_cd"), strWgCd,
								bindMsg.getStringNE("loc_cd"),
								bindMsg.getStringNE("lg_grp_cd"),
								bindMsg.getStringNE("alloc_grp_cd"),
								toDispGUIIndex(r)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 物流Ｇのチェックを行う必要があるかを判定する。
		 * @param shipSchdR 出荷予定
		 * @return 出荷予定の送付先物流Ｇと受注時の送付先物流Ｇが違う場合はtrue、ただし仕入直送の場合は常にfalse
		 */
		protected boolean needChkShipToLgGrpChng(Upd01_Ship_SchdR shipSchdR) {
			
			String sloLgGrpCd = nvl(_oldSloDR.tdlv_lg_grp_cd(), _oldSloDR.dlv_lg_grp_cd());
			String shipSchdLgGrpCd = nvl(shipSchdR.tdlv_lg_grp_cd(), shipSchdR.dlv_lg_grp_cd());
			
			if (!MAC_SLO_PROC_TYP.isPURC_DDLV(_oldSloDR.proc_typ()) 
					&& !isNull(shipSchdLgGrpCd)
					&& !isSame(sloLgGrpCd, shipSchdLgGrpCd)) {
				return true;
			}
			
			return false;
		}
		
		/**
		 * 受注引当マスタを取得する。
		 * @return 受注引当マスタ
		 */
		protected MCList<MAM_SLO_ALLOC_R> getSloAlloc() {
			MCList<MAM_SLO_ALLOC_R> sloAllocL = MCList.create(MAM_SLO_ALLOC_R.class);
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_SLO_ALLOC_R t = MAM_SLO_ALLOC_R.create("T");
			MCQueryApiBuilder sloAllocL_bldr = MCQueryApiBuilder.create(t);
			
			sloAllocL.addStringColumn("loc_lg_grp_cd");
			
			sloAllocL_bldr.setSelect(t.to_lg_grp_cd, t.lg_grp_cd);
			sloAllocL_bldr.addSelect(m1.lg_grp_cd.as("loc_lg_grp_cd"));
			
			sloAllocL_bldr.setWhere(t.wg_cd.eq(bind("1")), _oldSloR.wg_cd());
			sloAllocL_bldr.addWhereWithAnd(bracket( t.itm_ship_grp_cd.eq(bind("1")) .or(t.itm_ship_grp_cd.eq(bind("2")))), _oldSloDR.getStringNE(MAM_ITM_R.$itm_ship_grp_cd), MAC_STR.NULL_VAL.value());
			
			sloAllocL_bldr.addLeftOuterJoin(m1, t.loc_cd.eq(m1.loc_cd));
			
			dbSelect("MSBBL1230_MAM_SLO_ALLOC_S01", sloAllocL, sloAllocL_bldr);
			
			return sloAllocL;
		}
		
		/**
		 * 変更後の物流Ｇへ出荷可能かを判定する。
		 * @param shipSchdR 出荷予定
		 * @param sloAllocL 受注引当マスタ
		 * @return 出荷可能の場合はtrue
		 */
		protected boolean shippableToNewLgGrp(Upd01_Ship_SchdR shipSchdR, MCList<MAM_SLO_ALLOC_R> sloAllocL) {
			
			String shipSchdLgGrpCd = nvl(shipSchdR.tdlv_lg_grp_cd(), shipSchdR.dlv_lg_grp_cd());
			
			MCList<MAM_SLO_ALLOC_R> subL = sloAllocL.subList(r -> (
					(isSame(r.to_lg_grp_cd(), shipSchdLgGrpCd) || MAC_STR.isNULL_VAL(r.to_lg_grp_cd())))
					&& (isSame(r.lg_grp_cd(), shipSchdR.ship_fr_lg_grp_cd()) 
							|| isSame(r.getStringNE("loc_lg_grp_cd"), shipSchdR.ship_fr_lg_grp_cd())
							|| (!isNull(r.lg_grp_cd()) && !isNull(r.alloc_grp_cd()))));
			
			if (!subL.isEmpty()) {
				return true;
			}
			
			return false;
		}
		
		/**
		 * 受注引当可能格付チェック
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkSloAllocGd() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<Upd01_Ship_SchdR> notErrL = getChkList(up2());
			
			for (Upd01_Ship_SchdR r : notErrL) {
				
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) || isNull(_oldSloDR.gd_cd())) {
					continue;
				}
				
				if (!isNull(r.dlv_cd()) 
						&& !isSame(r.dlv_cd(), _oldSloDR.dlv_cd())
						&& (isNull(getSloAllocGdCache(_oldSloR.cst_cd(), MAC_STR.NULL_VAL.value(), _oldSloDR.gd_cd()))
						&& isNull(getSloAllocGdCache(_oldSloR.cst_cd(), r.dlv_cd(), _oldSloDR.gd_cd())))
						&& (!isNull(getSloAllocGdCache(_oldSloR.cst_cd(), MAC_STR.NULL_VAL.value()))
								|| !isNull(getSloAllocGdCache(_oldSloR.cst_cd(), r.dlv_cd())))) {
					msgL.add(new MCMessage(r, Upd01_Ship_SchdR.$dlv_cd, MSBBL0403, _oldSloR.cst_cd(), r.dlv_cd(), _oldSloDR.gd_cd(), toDispGUIIndex(r)));
				}
			}
			
			return msgL;
		}

		protected MCMessageList chkLgCtl() {

			initLgCtlCache(up2());
			MCMessageList msgL = new MCMessageList();

			MCList<Upd01_Ship_SchdR> notErrShipSchdL = getChkList(up2());

			for (Upd01_Ship_SchdR shipSchdR : notErrShipSchdL) {
				if (shipSchdR.not_dt_calc_flg()
						&& !MAC_DATA_CRUD_TYP.isDEL(shipSchdR.data_crud_typ())) {
					String dlvLgGreCd;
					if (!isNull(shipSchdR.tdlv_cd()) || !isNull(_oldSloDR.tdlv_cd())) {
						dlvLgGreCd = nvl(shipSchdR.tdlv_lg_grp_cd(), _oldSloDR.tdlv_lg_grp_cd());
					}
					else {
						dlvLgGreCd = nvl(shipSchdR.dlv_lg_grp_cd(), _oldSloDR.dlv_lg_grp_cd());
					}
					MAM_LG_CTL_R lgCtlR = getLgCtlCache(shipSchdR.ship_fr_lg_grp_cd(),
							dlvLgGreCd, shipSchdR.ship_term_cd());

					if (isNull(lgCtlR)) {
						msgL.add(new MCMessage(shipSchdR, null, MSBEL0155, dlvLgGreCd,
								shipSchdR.ship_fr_lg_grp_cd(), shipSchdR.ship_term_cd()));
					}
				}
			}
			return msgL;
		}

		/**
		 * 更新カウンタチェック、排他ロック獲得
		 * @return
		 */
		protected MCMessageList lockAndCheckBase() {

			MCMessageList msgL = new MCMessageList();
			msgL.addAll(chkSlo());
			if (msgL.isEmpty()) {
				msgL.addAll(chkSloD());
			}
			if (msgL.isEmpty()) {
				msgL.addAll(chkShipPr());
			}
			if (msgL.isEmpty()) {
				lockShipSchd();
			}
			
			if (!msgL.isEmpty()) {
				up0().upd_cntr_err_flg(true);
				_updCntrErr = true;
			}
			
			return msgL;
		}

		/**
		 * 受注ヘッダのロック、更新カウンタチェック、空更新、値の補完
		 */
		protected MCMessageList chkSlo() {
			MCMessageList msgL = new MCMessageList();
			_oldSloR = getOldSlo(up0());
			//更新カウンタチェック
			msgL.addAll(checkUpdCntrNE(up0(), Upd01_SloR.$slo_upd_cntr, _oldSloR));

			return msgL;
		}

		protected MCMessageList chkSloD() {
			MCMessageList msgL = new MCMessageList();
			_oldSloDR = getOldSloD(up1().get(0));
			msgL.addAll(checkUpdCntrNE(up1().get(0), Upd01_Slo_DR.$slo_d_upd_cntr, _oldSloDR));
			
			return msgL;
		}

		/**
		 * 出荷進捗のロック、更新カウンタチェック、空更新
		 * @param hdrR
		 * @return
		 */
		protected MCMessageList chkShipPr() {
			
			MCMessageList msgL = new MCMessageList();
			
			if (!_oldSloDR.can_flg()) {
				_oldShipPrR = getOldShipPr(up1().get(0));
				msgL.addAll(checkUpdCntrNE(up1().get(0), Upd01_Slo_DR.$ship_pr_upd_cntr, _oldShipPrR));
			}
			return msgL;
		}

		protected void lockShipSchd() {
			initShipSchdCache(up2());
		}

		/**
		 * 出荷予定の補完チェック
		 */
		protected void crretDtl() {
			if(_oldSloDR.can_flg()) {
				return;
			}
			
			MCList<Upd01_Ship_SchdR> notErrShipSchdL = getChkList(up2());
			MCList<Upd01_Slo_PrmsR> notErrSloPrmsL = getChkList(up3());
			
			MAM_ITM_R itmR = MAM_ITM_R.create();
			MAM_ITM_R t1 = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmR_bldr = MCQueryApiBuilder.create(t1);
			itmR_bldr.setSelect(t1.dec_place, t1.rnd_typ, t1.release_flg, t1.stk_mng_typ);
			dbSelectKey("MSBBL1230_MAM_ITM_S01", itmR, itmR_bldr, _oldSloDR.itm_cd(), _oldSloDR.itm_sub1(), _oldSloDR.itm_sub2(), _oldSloDR.itm_sub3());
			
			if (isNull(itmR) || itmR.isEmpty() || !itmR.release_flg()) {
				notErrShipSchdL.setValue(Upd01_Ship_SchdR.$err_flg, true);
				notErrSloPrmsL.setValue(Upd01_Slo_PrmsR.$err_flg, true);
				
				MCMessagePool.add(MAUAL0189, 
						toDispItm(_oldSloDR.itm_cd(), _oldSloDR.itm_sub1(), _oldSloDR.itm_sub2(), _oldSloDR.itm_sub3()), 
						toDispGUIIndex(MCRow.create()));
			}
			else {
				up1().get(0).stk_mng_typ(itmR.stk_mng_typ());
			}
			
			MAVM_ITM_UNIT_R itmUnitR = MAVM_ITM_UNIT_R.create();
			MCQueryApiBuilder itmUnitR_bldr = MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T"));
			itmUnitR.itm_cd(_oldSloDR.itm_cd());
			itmUnitR.itm_sub1(_oldSloDR.itm_sub1());
			itmUnitR.itm_sub2(_oldSloDR.itm_sub2());
			itmUnitR.itm_sub3(_oldSloDR.itm_sub3());
			itmUnitR.unit_cd(_oldSloDR.trd_unit_cd());
			dbSelectKey("MSBBL1230_MAVM_ITM_UNIT_S01", itmUnitR, itmUnitR_bldr, itmUnitR);
			
			if (isNull(itmUnitR) || itmUnitR.isEmpty()) {
				notErrShipSchdL.setValue(Upd01_Ship_SchdR.$err_flg, true);
				notErrSloPrmsL.setValue(Upd01_Slo_PrmsR.$err_flg, true);
				MCMessagePool.add(MAUAL0242, 
						toDispItm(_oldSloDR.itm_cd(), _oldSloDR.itm_sub1(), _oldSloDR.itm_sub2(), _oldSloDR.itm_sub3()), 
						toDispGUIIndex(MCRow.create()));
			}
			
			createCacheBp(getBindBpL(notErrShipSchdL));
			
			for (Upd01_Ship_SchdR shipSchdR : notErrShipSchdL) {
				
				MCNumber convBaseQty = itmUnitR.conv_base_qty();
				MCNumber convQty = itmUnitR.conv_qty();
				
				//出荷進捗ＮＯ
				shipSchdR.ship_pr_no(_oldShipPrR.ship_pr_no());
				//基準単位ＣＤ
				shipSchdR.base_unit_cd(_oldSloDR.base_unit_cd());

				MST_SHIP_SCHD_R oldShipSchdR = getFirstOldShipSchd(shipSchdR.ship_schd_no());
				
				if (!isNull(oldShipSchdR) && !oldShipSchdR.isEmpty()) {
				
					if (shipSchdR.isStatusModify()) {
						
						// 打切り/打切り戻しの場合、変更前の数量に戻す。
						shipSchdR.org_abort_flg(oldShipSchdR.abort_flg());		
					}
					if (shipSchdR.not_dt_calc_flg()
							|| !(MAC_DATA_CRUD_TYP.isCRT(shipSchdR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(shipSchdR.data_crud_typ()))) {
						shipSchdR.ship_wk_cd(oldShipSchdR.ship_wk_cd());
					}
				}
				
				if (!isSame(_oldSloDR.trd_unit_cd(), shipSchdR.trd_unit_cd())) {
					//出荷予定の品目単位
					MAVM_ITM_UNIT_R itmUnitR1 = MAVM_ITM_UNIT_R.create();
					MCQueryApiBuilder itmUnitR1_bldr = MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T"));
					itmUnitR1.itm_cd(_oldSloDR.itm_cd());
					itmUnitR1.itm_sub1(_oldSloDR.itm_sub1());
					itmUnitR1.itm_sub2(_oldSloDR.itm_sub2());
					itmUnitR1.itm_sub3(_oldSloDR.itm_sub3());
					itmUnitR1.unit_cd(shipSchdR.trd_unit_cd());
					dbSelectKey("MSBBL1230_MAVM_ITM_UNIT_S02", itmUnitR1, itmUnitR1_bldr, itmUnitR1);
					
					convBaseQty = itmUnitR1.conv_base_qty();
					convQty = itmUnitR1.conv_qty();
				}
				
				MCNumber baseUnitQty = convToBaseUnit(shipSchdR.trd_unit_qty(), convBaseQty,
						convQty, itmR.dec_place(), itmR.rnd_typ());
				
				shipSchdR.base_unit_qty(baseUnitQty);
				
				if (!isNull(shipSchdR.dlv_cd())) {
					compDlvInfo(shipSchdR, shipSchdR.dlv_cd());
				}
				if (!isNull(shipSchdR.tdlv_cd())) {
					compTdlvInfo(shipSchdR, shipSchdR.tdlv_cd());
				}
			}

			MCIndexKey shipLIdx = notErrShipSchdL.createIndex(Upd01_Ship_SchdR.$slo_prms_no);
			for (Upd01_Slo_PrmsR sloPrmsR : notErrSloPrmsL) {
				sloPrmsR.slo_no(_oldSloDR.slo_no());
				sloPrmsR.slo_d_no(_oldSloDR.slo_d_no());
				if (sloPrmsR.isStatusDelete()) {
					continue;
				}
				
				MCNumber convBaseQty = itmUnitR.conv_base_qty();
				MCNumber convQty = itmUnitR.conv_qty();
				
				Upd01_Ship_SchdR shipSchdR = notErrShipSchdL.getFirst(shipLIdx, sloPrmsR.slo_prms_no());
				
				if (!isNull(shipSchdR) && !isSame(_oldSloDR.trd_unit_cd(), shipSchdR.trd_unit_cd())) {
					MAVM_ITM_UNIT_R shipSchdItmUnit = MAVM_ITM_UNIT_R.create();
					MCQueryApiBuilder shipSchdItmUnit_bldr = MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T"));
					shipSchdItmUnit.itm_cd(_oldSloDR.itm_cd());
					shipSchdItmUnit.itm_sub1(_oldSloDR.itm_sub1());
					shipSchdItmUnit.itm_sub2(_oldSloDR.itm_sub2());
					shipSchdItmUnit.itm_sub3(_oldSloDR.itm_sub3());
					shipSchdItmUnit.unit_cd(shipSchdR.trd_unit_cd());
					dbSelectKey("MSBBL1230_MAVM_ITM_UNIT_S06", shipSchdItmUnit, shipSchdItmUnit_bldr, shipSchdItmUnit);
					
					convBaseQty = shipSchdItmUnit.conv_base_qty();
					convQty = shipSchdItmUnit.conv_qty();
				}
				
				MCNumber baseUnitQty = convToBaseUnit(sloPrmsR.trd_unit_prms_qty(), convBaseQty,
						convQty, itmR.dec_place(), itmR.rnd_typ());
				sloPrmsR.base_unit_prms_qty(baseUnitQty);
			}
		}
		
		/**
		 * 出荷予定が変更されたかをチェックする。
		 * @return 変更されてない場合はtrue
		 */
		protected boolean checkShipSchdSame(Upd01_Ship_SchdR shipSchdR) {
			
			boolean isSame = false;
			
			if (!isNull(shipSchdR.ship_schd_no())) {
				
				MST_SHIP_SCHD_R oldShipR = getFirstOldShipSchd(shipSchdR.ship_schd_no());
				if (!isNull(oldShipR) && !oldShipR.isEmpty() && isColSame(shipSchdR, oldShipR, getCheckShipSchdSameCols())) {
					isSame = true;
				}
			}
			
			return isSame;
		}
		
		/**
		 * 出荷予定の変更されたかをチェックするカラムを返す。
		 * @return チェックするカラム
		 */
		protected String[] getCheckShipSchdSameCols() {
			
			return new String[] {
				Upd01_Ship_SchdR.$dlv_inst_rcpt_no,
				Upd01_Ship_SchdR.$slo_prms_no,
				Upd01_Ship_SchdR.$trd_unit_cd,
				Upd01_Ship_SchdR.$trd_unit_qty,
				Upd01_Ship_SchdR.$base_unit_cd,
				Upd01_Ship_SchdR.$base_unit_qty,
				Upd01_Ship_SchdR.$fix_flg,
				Upd01_Ship_SchdR.$re_ship_schd_flg,
				Upd01_Ship_SchdR.$ship_rqst_tm,
				Upd01_Ship_SchdR.$pd_inst_dlv_tm,
				Upd01_Ship_SchdR.$not_dt_calc_flg,
				Upd01_Ship_SchdR.$ship_schd_tm,
				Upd01_Ship_SchdR.$dlv_schd_tm,
				Upd01_Ship_SchdR.$ship_block_flg,
				Upd01_Ship_SchdR.$ship_term_cd,
				Upd01_Ship_SchdR.$ship_wk_cd,
				Upd01_Ship_SchdR.$ship_fr_lg_grp_cd,
				Upd01_Ship_SchdR.$trd_d_rmrks,
				Upd01_Ship_SchdR.$ship_cnt_rmrks,
				Upd01_Ship_SchdR.$sub_char1,
				Upd01_Ship_SchdR.$sub_char2,
				Upd01_Ship_SchdR.$sub_char3,

			};
		}
		
		protected boolean isChangedSloPrms(Upd01_Slo_PrmsR sloPrmsR, MCIndexKey idxSloPrms) {
			MCList<Upd01_Slo_PrmsR> sloPrmsSubL = up3().subList(idxSloPrms, sloPrmsR.slo_d_no());
			if (sloPrmsSubL.statusChangedList().isEmpty()) {
				return false;
			}
			return true;
		}
		
		protected boolean isChangedShipSchd(Upd01_Slo_PrmsR sloPrmsR, MCIndexKey idxShipSchd) {
			MCList<Upd01_Ship_SchdR> shipSchdSubL = up2().subList(idxShipSchd, sloPrmsR.slo_d_no());
			if (shipSchdSubL.statusChangedList().isEmpty()) {
				return false;
			}
			return true;
		}
		
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
		protected FXUCL_MCDbcCacheStEnd<MAM_BP_SUB_R> _cacheBpSub;
		protected void createCacheBp(MCList<MAM_BP_R> bindBpL) {
			if (bindBpL.isEmpty()) {
				return;
			}
			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
			MAM_BP_R bp = MAM_BP_R.create("T");
			MCQueryApiBuilder bp_bldr = MCQueryApiBuilder.create(bp);
			bp_bldr.addSelect(bp.zip_cd);
			bp_bldr.addSelect(bp.addr1);
			bp_bldr.addSelect(bp.addr2);
			bp_bldr.addSelect(bp.addr3);
			bp_bldr.addSelect(bp.addr4);
			bp_bldr.addSelect(bp.tel);
			bp_bldr.addSelect(bp.fax);
			bp_bldr.addSelect(bp.dlv_cntct_dpt);
			bp_bldr.addSelect(bp.dlv_cntct_psn);
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(bpL, bp_bldr, bindBpL, MAM_BP_R.$bp_cd);
			
			_cacheBpSub = new FXUCL_MCDbcCacheStEnd<MAM_BP_SUB_R>(
					MCQueryApiBuilder.create(MAM_BP_SUB_R.create("T")),
					bindBpL, MAM_BP_R.$bp_cd);
		}
		
		protected MCList<MAM_BP_R> getBindBpL(MCList<Upd01_Ship_SchdR> shipSchdL) {
			MCList<MAM_BP_R> bindBpL = MCList.create(MAM_BP_R.class);
			for (Upd01_Ship_SchdR r : shipSchdL) {
				if (!isNull(r.dlv_cd())) {
					MAM_BP_R bpR = MAM_BP_R.create();
					bpR.bp_cd(r.dlv_cd());
					bindBpL.add(bpR);
				}
				if (!isNull(r.tdlv_cd())) {
					MAM_BP_R bpR = MAM_BP_R.create();
					bpR.bp_cd(r.tdlv_cd());
					bindBpL.add(bpR);
				}
			}
			return bindBpL.groupBy(MAM_BP_R.$bp_cd);
		}
		
		protected void setDlvAddr(Upd01_Ship_SchdR r, MAM_BP_R bpR, MAM_BP_SUB_R bpSubR) {
			if (bpSubR.isEmpty()) {
				r.dlv_zip_cd(bpR.getStringNE("zip_cd"));
				r.dlv_addr1(bpR.getStringNE("addr1"));
				r.dlv_addr2(bpR.getStringNE("addr2"));
				r.dlv_addr3(bpR.getStringNE("addr3"));
				r.dlv_addr4(bpR.getStringNE("addr4"));
				r.dlv_tel(bpR.getStringNE("tel"));
				r.dlv_fax(bpR.getStringNE("fax"));
				r.dlv_cntct_dpt(bpR.getStringNE("dlv_cntct_dpt"));
				r.dlv_cntct_psn(bpR.getStringNE("dlv_cntct_psn"));
			}
			else {
				r.dlv_zip_cd(bpSubR.zip_cd());
				r.dlv_addr1(bpSubR.addr1());
				r.dlv_addr2(bpSubR.addr2());
				r.dlv_addr3(bpSubR.addr3());
				r.dlv_addr4(bpSubR.addr4());
				r.dlv_tel(bpSubR.tel());
				r.dlv_fax(bpSubR.fax());
				r.dlv_cntct_dpt(bpSubR.dlv_cntct_dpt());
				r.dlv_cntct_psn(bpSubR.dlv_cntct_psn());
			}
		}
		
		protected void setTdlvAddr(Upd01_Ship_SchdR r, MAM_BP_R bpR, MAM_BP_SUB_R bpSubR) {
			if (bpSubR.isEmpty()) {
				r.tdlv_zip_cd(bpR.getStringNE("zip_cd"));
				r.tdlv_addr1(bpR.getStringNE("addr1"));
				r.tdlv_addr2(bpR.getStringNE("addr2"));
				r.tdlv_addr3(bpR.getStringNE("addr3"));
				r.tdlv_addr4(bpR.getStringNE("addr4"));
				r.tdlv_tel(bpR.getStringNE("tel"));
				r.tdlv_fax(bpR.getStringNE("fax"));
				r.tdlv_cntct_dpt(bpR.getStringNE("dlv_cntct_dpt"));
				r.tdlv_cntct_psn(bpR.getStringNE("dlv_cntct_psn"));
			}
			else {
				r.tdlv_zip_cd(bpSubR.zip_cd());
				r.tdlv_addr1(bpSubR.addr1());
				r.tdlv_addr2(bpSubR.addr2());
				r.tdlv_addr3(bpSubR.addr3());
				r.tdlv_addr4(bpSubR.addr4());
				r.tdlv_tel(bpSubR.tel());
				r.tdlv_fax(bpSubR.fax());
				r.tdlv_cntct_dpt(bpSubR.dlv_cntct_dpt());
				r.tdlv_cntct_psn(bpSubR.dlv_cntct_psn());
			}
		}
		
		protected void compDlvInfo(Upd01_Ship_SchdR r, String bp) {
			MAM_BP_R bpR = MAM_BP_R.create();
			MAM_BP_SUB_R bpSubR = MAM_BP_SUB_R.create();
			bpR = _cacheBp.get(bp);
			if (!bpR.dlv_sundry_flg()) {
				bpSubR = _cacheBpSub.get(_oldSloR.slo_dt(), bp);
				setDlvAddr(r, bpR, bpSubR);
			}
		}
		
		protected void compTdlvInfo(Upd01_Ship_SchdR r, String bp) {
			MAM_BP_R bpR = MAM_BP_R.create();
			MAM_BP_SUB_R bpSubR = MAM_BP_SUB_R.create();
			bpR = _cacheBp.get(bp);
			if (!bpR.dlv_sundry_flg()) {
				bpSubR = _cacheBpSub.get(_oldSloR.slo_dt(), bp);
				setTdlvAddr(r, bpR, bpSubR);
			}
		}
	}	

	protected boolean isChanged(Upd01_Ship_SchdR dtlR, MST_SHIP_SCHD_R oldShipR) {
		boolean isChged = false;
		
		// 送付先物流グループ
		String shipToLgGrp = null;
		if (!isNull(dtlR.tdlv_lg_grp_cd())) {
			shipToLgGrp = dtlR.tdlv_lg_grp_cd();
		}
		else if (MSC_SHIP_TO_ID_TYP.isDLV(_oldShipPrR.ship_to_id_typ()) && !isNull(dtlR.dlv_lg_grp_cd())) {
			shipToLgGrp = dtlR.dlv_lg_grp_cd();
		}
		else {
			shipToLgGrp = _oldShipPrR.ship_to_lg_grp_cd();
		}
		
		// 変更前の送付先物流グループ
		String bfShipToLgGrp = null;
		if (!isNull(oldShipR.tdlv_lg_grp_cd())) {
			bfShipToLgGrp = oldShipR.tdlv_lg_grp_cd();
		}
		else if (MSC_SHIP_TO_ID_TYP.isDLV(_oldShipPrR.ship_to_id_typ()) && !isNull(oldShipR.dlv_lg_grp_cd())) {
			bfShipToLgGrp = oldShipR.dlv_lg_grp_cd();
		}
		else {
			bfShipToLgGrp = _oldShipPrR.ship_to_lg_grp_cd();
		}
		//数量、出荷予定日、納品予定日のいずれかを変更した場合,trueとする
		if (!isSame(dtlR.trd_unit_qty(), oldShipR.trd_unit_qty())
				|| !isSame(dtlR.dlv_schd_tm().startTimeOfDay(), oldShipR.dlv_schd_tm().startTimeOfDay())
				|| !isSame(dtlR.dlv_cd(), nvl(oldShipR.dlv_cd(), _oldSloDR.dlv_cd()))
				|| !isSame(shipToLgGrp ,bfShipToLgGrp)
				|| (!_oldSloDR.sls_cststk_flg() && !isSame(dtlR.ship_schd_tm().startTimeOfDay(), oldShipR.ship_schd_tm().startTimeOfDay()))
				|| !isSame(dtlR.ship_fr_lg_grp_cd(), oldShipR.ship_fr_lg_grp_cd())) {
			isChged = true;
		}
		return isChged;
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 受注に関する各種情報を更新する<br>
	 */
	public class Upd01 extends MSBBL_SlsDlvDtAdjstReg_MC_A.Upd01 {
		
		/**
		 * 引当保留の出荷引当状況
		 */
		MCList<MST_SHIP_ALLOC_STS_R> _waitShipAllocStsL = null;
		
		/**
		 * 引当解除マップ（出荷物流Ｇ単位の引当解除数量合計）
		 */
		protected Map<String, MCNumber> _allocRelMap = null;
		
		/**
		 * 引当結果リスト
		 */
		protected MCList<Srch_RsltR> _allocRsltL = null;
		
		/**
		 * 引当結果リスト(引当保留分)
		 */
		protected MCList<Srch_RsltR> _waitAllocRsltL = null;
		
		/**
		 * 引当解除オペレーション
		 */
		protected MSBEL_ShipSchdService.ShipSchd_Upd06 _stkAllocRelOpe = null;
		
		/**
		 * 引当オペレーション（引当解除分）
		 */
		protected MSBEL_AllocMngService.Alloc_Srch01 _stkAllocForRelOpe = null;
		
		/**
		 * 受注納期回答改訂番号
		 */
		protected MCNumber _sloPrmsRev = null;
		
		/*
		 * 納期回答書発行対象
		 */
		protected MCList<SloPrms_Prnt01_HdrR> _printHdrL = null;
		
		/*
		 * 納期回答書対象の項目が変わったかを判定
		 */
		protected boolean _isUpdFlg =true;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			setPegNo(up1());
			setPegNo(up2());
			setPegNo(up3());
			setPegNo(up4());
			setPegNo(up5());
			
			MCList<Upd01_Slo_DR> up1L = up1().clone();
			MCList<Upd01_Ship_SchdR> up2L = up2().clone();
			MCList<Upd01_Slo_PrmsR> up3L = up3().clone();
			MCList<Upd01_WG_RqstR> up4L = up4().clone();
			MCList<Upd01_Sls_SchdR> up5L = up5().clone();
			
			initSloCache(up0());
			initSloDCache(up1L);
			initShipPrCache(up1L);
			initSloAllocGdCache(up0());
			initSloPrmsCache(up3L);
			
			for (Upd01_Slo_DR sloDR : up1L) {
				
				up1().clear();
				up1().add(sloDR);
				
				up2().setAll(up2L.subList(Upd01_Ship_SchdR.$slo_d_no, sloDR.slo_d_no()));
				up3().setAll(up3L.subList(Upd01_Slo_PrmsR.$slo_d_no, sloDR.slo_d_no()));
				up4().setAll(up4L.subList(Upd01_WG_RqstR.$slo_d_no, sloDR.slo_d_no()));
				up5().setAll(up5L.subList(Upd01_Sls_SchdR.$slo_d_no, sloDR.slo_d_no()));
				
				_oldSloR = getOldSlo(up0());
				_oldSloDR = getOldSloD(sloDR);
				_oldShipPrR = getOldShipPr(sloDR);
				
				editUp();
				
				//出荷予定日、納品予定日計算
				//Chk01でも使用するため、呼び出し前に計算する。
				callShipSchdDtService();
				
				// チェック処理の呼出
				callThisChk01();
				if (hasErrMsg()) {
					
					if (chk01.down0().upd_cntr_err_flg() || chk01.down0().dac_err_flg()) {
						break;
					}
					else {
						continue;
					}
				}
				setSloPrmsHNo();
				_sloPrmsRev = getSloPrmsRev(sloDR);
				// 引当保留の出荷引当状況を取得する。
				getWaitShipAllocSts();
				//有効期限チェック、ロット逆転チェック
				checkLotLimitRevise();
				//品目の有効期限FROM,TOを取得
				getItmValidDt();
				//引当処理の呼び出し
				callStkAlloc();
				//受注の更新
				updSlo();
				//受注明細の更新
				updSloD();
				//改訂履歴データ更新サービス呼出（受注改訂履歴テーブル更新）
				updSloPR();
				//受注納期回答の更新
				updSloPrms();
				//受注納期回答ヘッダの更新処理
				updSloPrmsH();
				//出荷進捗の更新
				updShipPr();
				//出荷予定サービスを呼出(打切解除)
				callShipSchdServiceAbortRet();
				//WG間依頼の再調整依頼の反映
				updWgRqst();
				//出荷予定サービスを呼出
				callShipSchdService();
				//与信の更新
				updCred();
				callSlsSchdService();
				callShipSchdServiceForSlsSchdAbort();
				//EDI納期回答送信IFデータ作成
				createEdiSendData();
				//納期回答書発行対象データ補完
				setPrint();
				//受注状況の登録
				callSloStsRegServiceIns01();
				//下り電文の設定
				setDown();
			}
			//納期回答書発行
			callPrint();
			
			chkNoPick();
			
			throwUpdErr();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			//データ更新区分の設定
			for (Upd01_Ship_SchdR shipSchdR : up2()) {
				if (shipSchdR.isStatusCreate()) {
					shipSchdR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				if (shipSchdR.isStatusModify()) {
					shipSchdR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				if (shipSchdR.isStatusDelete()) {
					shipSchdR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
			}
			
			setupSloPrmsNo();
			for (Upd01_Slo_PrmsR sloPrmsR : up3()) {
				
				if (sloPrmsR.isStatusCreate()) {
					
					for (Upd01_Ship_SchdR shipSchdR : up2()) {
						if ((!isNull(sloPrmsR.ship_schd_no()) && isSame(sloPrmsR.ship_schd_no(), shipSchdR.ship_schd_no()))
								|| (!isNull(sloPrmsR.slo_prms_index()) && isSame(sloPrmsR.slo_prms_index(), shipSchdR.slo_prms_index()))){
							shipSchdR.slo_prms_no(sloPrmsR.slo_prms_no());
							break;
						}
					}
				}
			}
		}

		/**
		 * 	Chk01オペレーションの呼出
		 */
		protected void callThisChk01() {
			
			chk01.up0().clear();
			chk01.up1().clear();
			chk01.up2().clear();
			chk01.up3().clear();
			chk01.up4().clear();
			chk01.up5().clear();
			
			chk01.clear();
			
			mapUpContainers(CALL_OPE);
			chk01.call();
			
			up2().setAll(chk01.down2());
			up3().setAll(chk01.down3());
		}

		/**
		 * 出荷予定日計算サービス実行
		 * @param hdr
		 * @param dL
		 */
		protected void callShipSchdDtService() {
			
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(_oldSloDR.proc_typ())
					|| MAC_SHIP_INST_TYP.isNO_PICK(_oldSloDR.ship_inst_typ())) {
				// 仕入直送またはピッキングなしの場合は対象外とする
				return;
			}
			
			//出荷予定日計算サービス.出荷予定日計算（ロット提案なし）
			MSBEL_ShipSchdDtCalcService.ShipSchdDt_Srch01 op = MSBEL_ShipSchdDtCalcService.crtShipSchdDt_Srch01();
			for (Upd01_Ship_SchdR r : up2()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					//出荷予定日計算サービス.出荷予定日計算（ロット提案なし）の電文設定
					//自動計算しないＦＬＧ=OFF
					if (!r.not_dt_calc_flg()) {
						if (!MAC_SLO_PROC_TYP.isPURC_DDLV(_oldSloDR.proc_typ())){					
							MSW_SHIP_SCHD_DT_CALC_R cndR = MSW_SHIP_SCHD_DT_CALC_R.create();
							copy(cndR,_oldSloDR, r,createMap_MSW_SHIP_SCHD_DT_CALC_R_MST_SLO_D_R());
							cndR.base_dt(_oldSloR.slo_dt());
							op.up0().add(cndR);
						}	
					}
				}
			}
			if (!op.up0().isEmpty()){
				op.exec();
			}
			//計算結果を一覧に設定する
			for (Upd01_Ship_SchdR r : up2()) {
				for (MSW_SHIP_SCHD_DT_CALC_R dowR : op.down0()){
					if (isSame(r.peg_no(), dowR.peg_no())) {
						r.ship_schd_tm(dowR.ship_schd_tm());
						r.dlv_schd_tm(dowR.dlv_schd_tm());
						r.ship_wk_cd(dowR.ship_wk_cd());
					}
				}
			}
		}

		/**
		 * 有効期限チェック、ロット逆転チェック
		 */
		protected void checkLotLimitRevise() {
			
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(_oldSloDR.proc_typ())
					|| MAC_SHIP_INST_TYP.isNO_PICK(_oldSloDR.ship_inst_typ())) {
				// 仕入直送またはピッキングなしの場合は対象外とする
				return;
			}
			
			//有効期限チェック,	ロット逆転チェックを実行する。
			MSBEL_ShipLotChkService.ShipLotChk_Chk01 shipLotChk = MSBEL_ShipLotChkService
					.crtShipLotChk_Chk01();
			for (Upd01_Ship_SchdR dtlR : up2()) {
				//削除の場合、チェックしない
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					if (!isNullOrNullVal(_oldSloDR.lot_no())) {
						//明細のロットを指定した場合、ロットの有効期限が有効期限制御の条件を満たすかチェックする。
						ShipLot_DtlR lotR = ShipLot_DtlR.create();
						lotR.peg_no(dtlR.peg_no()); //紐付けＮＯ
						lotR.cst_cd(_oldSloR.cst_cd()); //得意先ＣＤ
						lotR.dlv_cd(nvl(dtlR.dlv_cd(), _oldSloDR.dlv_cd())); //納品先ＣＤ
						lotR.itm_cd(_oldSloDR.itm_cd()); //品目ＣＤ
						lotR.itm_sub1(_oldSloDR.itm_sub1()); //枝番１
						lotR.itm_sub2(_oldSloDR.itm_sub2()); //枝番２
						lotR.itm_sub3(_oldSloDR.itm_sub3()); //枝番３
						lotR.base_dt(dtlR.dlv_schd_tm().startTimeOfDay()); //基準日	
						lotR.lot_no(_oldSloDR.lot_no()); //ロットＮＯ
						lotR.sublot_no(_oldSloDR.sublot_no()); //サブロットＮＯ
						if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
							lotR.slo_d_no(dtlR.slo_d_no());
						}
						else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
							lotR.ship_schd_no(dtlR.ship_schd_no());
						}
						shipLotChk.up0().add(lotR);
					}
				}
			}
			if (shipLotChk.up0().isEmpty()) {
				return;
			}
			shipLotChk.exec();
			throwUpdErr();
		}

		/**
		 * 品目の有効期限の取得
		 * @param hdr
		 * @param dtl
		 */
		protected void getItmValidDt() {
			
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(_oldSloDR.proc_typ())
					|| MAC_SHIP_INST_TYP.isNO_PICK(_oldSloDR.ship_inst_typ())) {
				// 仕入直送またはピッキングなしの場合は対象外とする
				return;
			}
			
			//品目の有効期限の取得
			MSBEL_ShipLotChkService.ShipLotChk_Srch01 shipLotSv = MSBEL_ShipLotChkService
					.crtShipLotChk_Srch01();
			for (Upd01_Ship_SchdR dtlR : up2()) {
				//手配区分＝在庫引当、手配依頼、引当後手配の場合
				if (MAC_SLO_PROC_TYP.isALLOC(_oldSloDR.proc_typ())
						|| MAC_SLO_PROC_TYP.isPROC(_oldSloDR.proc_typ())
						|| MAC_SLO_PROC_TYP.isALLOC_PROC(_oldSloDR.proc_typ())) {
					ShipLot_DtlR lotR = ShipLot_DtlR.create();
					lotR.peg_no(dtlR.peg_no()); //紐付けＮＯ
					lotR.cst_cd(_oldSloR.cst_cd()); //得意先ＣＤ
					lotR.dlv_cd(nvl(dtlR.dlv_cd(), _oldSloDR.dlv_cd())); //納品先ＣＤ
					lotR.itm_cd(_oldSloDR.itm_cd()); //品目ＣＤ
					lotR.itm_sub1(_oldSloDR.itm_sub1()); //枝番１
					lotR.itm_sub2(_oldSloDR.itm_sub2()); //枝番２
					lotR.itm_sub3(_oldSloDR.itm_sub3()); //枝番３
					lotR.base_dt(dtlR.dlv_schd_tm().startTimeOfDay()); //基準日	
					lotR.lock_flg(false);
					lotR.lot_no(null);
					lotR.sublot_no(null);
					shipLotSv.up0().add(lotR);
				}
			}
			if (shipLotSv.up0().isEmpty()) {
				return;
			}
			shipLotSv.exec();
			//下り電文を取得
			MCList<ShipLot_DtlR> retDL = shipLotSv.down0();
			for (ShipLot_DtlR retR : retDL) {
				//対応する受注明細を取得
				Upd01_Ship_SchdR dlR = up2().subList(Upd01_Ship_SchdR.$peg_no,
						retR.peg_no()).get(0);
				//有効期限（下限）
				dlR.valid_dt_fr(retR.valid_dt_fr());
				//有効期限（下限）継承Ｇ
				dlR.valid_dt_fr_grp(retR.valid_dt_fr_grp());
				//有効期限（上限）
				dlR.valid_dt_to(retR.valid_dt_to());
			}
		}
		
		/**
		 * 引当処理を実行する。
		 */
		protected void callStkAlloc() {
			
			initStkAlloc();
			
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(_oldSloDR.proc_typ())
					|| MAC_SHIP_INST_TYP.isNO_PICK(_oldSloDR.ship_inst_typ())) {
				// 仕入直送またはピッキングなしの場合は対象外とする
				return;
			}
			
			//在庫管理区分=在庫管理するの場合のみ引当の対象とする。
			if (MAC_STK_MNG_TYP.isMNG(up1().get(0).stk_mng_typ())) {
				return;
			}
			
			crtStkAllocRel();
			
			crtStkAllocForRel();
			
			callAllocLock();
			
			callStkAllocForWait();
			
			callStkAllocRel();
			
			callStkAllocForRel();
		}
		
		/**
		 * 引当の初期化処理
		 */
		protected void initStkAlloc() {
			
			_allocRelMap = new HashMap<String, MCNumber>();
			
			_allocRsltL = MCList.create(Srch_RsltR.class);
			
			_waitAllocRsltL = MCList.create(Srch_RsltR.class);
		}

		/**
		 * 引当解除処理の上り電文を作成する。
		 */
		protected void crtStkAllocRel() {
			
			//出荷予定サービス.引当解除(MSBEL5500.ShipSchd_Upd06）のサービスを実行して、引当解除を行う。
			_stkAllocRelOpe = MSBEL_ShipSchdService.crtShipSchd_Upd06();
			
			for (Upd01_Ship_SchdR dtlR : up2()) {
				
				if (!isNull(dtlR.sls_act_d_no())) {
					continue;
				}
				if (dtlR.isStatusModify() || dtlR.isStatusDelete()) {
					//対応する更新前の出荷予定を取得する。
					MST_SHIP_SCHD_R oldShipR = getFirstOldShipSchd(dtlR.ship_schd_no());
					//引当数を算出
					MCNumber alcQty = oldShipR.alloc_qty();
					//出荷予定.データ更新区分=更新の場合、
					//・打切FLG＝オフ、且つ、数量、出荷予定日、納品予定日のいずれかを変更した場合、変更前は引当済みなら、引当解除を行う。
					//・打切FLG＝オンの場合、変更前は引当済みなら、引当解除を行う。
					if (dtlR.isStatusModify()) {
						if ((!dtlR.abort_flg() 
								&& alcQty.gt(0))
								&& isChanged(dtlR, oldShipR) 
								|| (dtlR.abort_flg() && alcQty.gt(0))) {
							//指図、出荷、売上済みの場合、取消の対象外とする。
							if (oldShipR.ship_inst_qty().gt(0)
									|| oldShipR.ship_act_qty().gt(0)
									|| oldShipR.sls_qty().gt(0)) {
								continue;
							}
							
							dtlR.alloc_rel_flg(true);
							
							ShipSchd_Upd06_DtlR alcCanR = ShipSchd_Upd06_DtlR.create();
							alcCanR.peg_no(dtlR.peg_no());
							alcCanR.ship_schd_no(oldShipR.ship_schd_no());						
							_stkAllocRelOpe.up0().add(alcCanR);
						}
					}
					else if (dtlR.isStatusDelete()) {
						
						if (alcQty.gt(0)) {
							
							dtlR.alloc_rel_flg(true);
							
							ShipSchd_Upd06_DtlR alcCanR = ShipSchd_Upd06_DtlR.create();
							alcCanR.peg_no(dtlR.peg_no());
							alcCanR.ship_schd_no(oldShipR.ship_schd_no());							
							_stkAllocRelOpe.up0().add(alcCanR);
						}
					}
					
					if (dtlR.alloc_rel_flg()) {
						
						_allocRelMap.put(dtlR.ship_fr_lg_grp_cd(), sum(alcQty, nvl(_allocRelMap.get(dtlR.ship_fr_lg_grp_cd()), 0)));
					}
				}
			}
		}
		
		/**
		 * 引当解除を実行する
		 */
		protected void callStkAllocRel() {
			
			if (!_stkAllocRelOpe.up0().isEmpty()) {
				_stkAllocRelOpe.exec();
			}
		}
		
		/**
		 * 引当処理の前にロック処理を実行する。
		 */
		protected void callAllocLock() {
			
			MSBEL_AllocMngService.Alloc_Lock_Upd01 ope = MSBEL_AllocMngService.crtAlloc_Lock_Upd01();
			
			MST_SHIP_SCHD_R oldShipSchdR = null;
			
			for (Upd01_Ship_SchdR dtlR : up2()) {
				
				if (!isNull(dtlR.sls_act_d_no()) || dtlR.abort_flg() || dtlR.isStatusDelete()) {
					continue;
				}
				
				oldShipSchdR = getFirstOldShipSchd(dtlR.ship_schd_no());
				
				//新規　 または　更新かつ引当解除または変更前未引当の場合のみ引当を行う
				if (dtlR.isStatusCreate() 
						|| (dtlR.isStatusModify() && (dtlR.alloc_rel_flg() || oldShipSchdR.alloc_qty().isZero()))) {
	
						MSW_ALLOC_LOC_MAP_R lockR = MSW_ALLOC_LOC_MAP_R.create();
						copy(lockR, _oldSloDR, createMap_MSW_ALLOC_LOC_MAP_R_MST_SLO_D_R());
						ope.up0().add(lockR);
				}
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		
		/**
		 * 引当処理の上り電文(引当解除分)を作成。<br>
		 * 出荷予定の変更前に引当数量を保持する。
		 */
		protected void crtStkAllocForRel() {
			
			_stkAllocForRelOpe = MSBEL_AllocMngService.crtAlloc_Srch01();
			
			// 引当解除した出荷予定を再引当
			for (Upd01_Ship_SchdR dtlR : up2()) {
				
				if (!isNull(dtlR.sls_act_d_no()) || dtlR.abort_flg() || dtlR.isStatusDelete() || !dtlR.alloc_rel_flg()) {
					continue;
				}
				
				//対応する更新前の出荷予定を取得する。
				MST_SHIP_SCHD_R oldShipSchdR = getFirstOldShipSchd(dtlR.ship_schd_no());
				
				Srch_TgtR alcR = Srch_TgtR.create();
				copy(alcR, _oldSloDR, dtlR, createMap_Srch_TgtR_MST_SLO_D_R());
				
				alcR.base_unit_qty(oldShipSchdR.alloc_qty().gte(dtlR.base_unit_qty()) ? dtlR.base_unit_qty() : oldShipSchdR.alloc_qty());
				
				setPackUnitQty(alcR);
				
				alcR.cst_cd(_oldSloR.cst_cd());
				
				_stkAllocForRelOpe.up1().add(alcR);
					
				_allocRelMap.put(dtlR.ship_fr_lg_grp_cd(), nvl(_allocRelMap.get(dtlR.ship_fr_lg_grp_cd()), MCNumber.ZERO).subtract(alcR.base_unit_qty()));
			}
			
			// 引当解除で余った数量を出荷予定日順で引当する
			MCList<Upd01_Ship_SchdR> up2L = up2().clone();
			up2L.sort(SortType.ASC, Upd01_Ship_SchdR.$ship_schd_tm, Upd01_Ship_SchdR.$ship_rqst_tm);
			
			for (Upd01_Ship_SchdR dtlR : up2L) {
				
				if (!isNull(dtlR.sls_act_d_no()) 
						|| dtlR.abort_flg() 
						|| dtlR.isStatusDelete() 
						|| !_allocRelMap.containsKey(dtlR.ship_fr_lg_grp_cd()) 
						|| !_allocRelMap.get(dtlR.ship_fr_lg_grp_cd()).isPositive()) {
					
					continue;
				}
				
				//対応する更新前の出荷予定を取得する。
				MST_SHIP_SCHD_R oldShipSchdR = getFirstOldShipSchd(dtlR.ship_schd_no());
				
				MCNumber allocQty = null;
				
				//新規　 または　更新かつ全数引当になってない(基準数量>引当済数量)
				if (dtlR.isStatusCreate() 
						|| (dtlR.isStatusModify() && dtlR.base_unit_qty().gt(oldShipSchdR.alloc_qty()))) {
					
					MCNumber allocRelQty = _allocRelMap.get(dtlR.ship_fr_lg_grp_cd());
					
					if (dtlR.alloc_rel_flg()) {
						
						Srch_TgtR alcR = _stkAllocForRelOpe.up1().getFirst(Srch_TgtR.$peg_no, dtlR.peg_no());
						
						allocQty = dtlR.base_unit_qty().subtract(oldShipSchdR.alloc_qty());
						
						alcR.base_unit_qty(sum(alcR.base_unit_qty(), allocRelQty.gte(allocQty) ? allocQty : allocRelQty));
						
						setPackUnitQty(alcR);
					}
					else {
						
						Srch_TgtR alcR = Srch_TgtR.create();
						copy(alcR, _oldSloDR, dtlR, createMap_Srch_TgtR_MST_SLO_D_R());
							
						allocQty = allocRelQty.gte(dtlR.base_unit_qty()) ? dtlR.base_unit_qty() : allocRelQty;
						alcR.base_unit_qty(allocQty);
							
						setPackUnitQty(alcR);
							
						alcR.cst_cd(_oldSloR.cst_cd());
						
						_stkAllocForRelOpe.up1().add(alcR);
					}
					
					_allocRelMap.put(dtlR.ship_fr_lg_grp_cd(), allocRelQty.subtract(allocQty));
				}
			}
			
			if (!_stkAllocForRelOpe.up1().isEmpty()) {
				
				_stkAllocForRelOpe.up0().stk_flg(false);
				_stkAllocForRelOpe.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
				_stkAllocForRelOpe.up0().lot_prop_typ(MSC_LOT_PROP_TYP.LOT.value());
				//引当保留除外FLGをオンにする
				_stkAllocForRelOpe.up0().except_alloc_wait_flg(true);
				_stkAllocForRelOpe.up0().nm_srch_flg(false);
			}
		}
		
		/**
		 * 引当処理の実行(引当解除分)<br>
		 * 出荷予定の変更前に引当数量を保持する。
		 */
		protected void callStkAllocForRel() {

			//引当を実行する
			if (!_stkAllocForRelOpe.up1().isEmpty()) {
				
				_stkAllocForRelOpe.exec();
				
				_allocRsltL.addAll(_stkAllocForRelOpe.down0());
			}
		}

		/**
		 * 引当処理(引当保留分)を実行する。<br>
		 * 引当解除を行うと、受払予定が更新されるため、引当解除の前に実行する必要がある。
		 */
		protected void callStkAllocForWait() {
			
			MSBEL_AllocMngService.Alloc_Srch01 ope = MSBEL_AllocMngService.crtAlloc_Srch01();
			
			MCList<Upd01_Ship_SchdR> up2L = up2().clone();
			up2L.sort(SortType.ASC, Upd01_Ship_SchdR.$ship_schd_tm, Upd01_Ship_SchdR.$ship_rqst_tm);
			
			for (Upd01_Ship_SchdR dtlR : up2L) {
				
				Srch_TgtR srchTgtForRelR = _stkAllocForRelOpe.up1().getFirst(Srch_TgtR.$peg_no, dtlR.peg_no());
				
				if (!isNull(dtlR.sls_act_d_no()) 
						|| dtlR.abort_flg() 
						|| dtlR.isStatusDelete() 
						|| (!isNull(srchTgtForRelR) && isSame(srchTgtForRelR.base_unit_qty(), dtlR.base_unit_qty()))) {
					
					continue;
				}
				
				//対応する更新前の出荷予定を取得する。
				MST_SHIP_SCHD_R oldShipR = getFirstOldShipSchd(dtlR.ship_schd_no());
				
				//新規　 または　更新かつ引当解除または変更前未引当の場合のみ引当を行う
				if (dtlR.isStatusCreate() 
						|| (dtlR.isStatusModify() && (dtlR.alloc_rel_flg() || oldShipR.alloc_qty().isZero()))) {
					
					//・以下の条件に合致する明細は引当処理の対象とする。	
					//引当区分=即引当,手配区分=在庫引当OR引当後手配OR手配依頼
					if (MAC_ALLOC_TYP.isIMMED(_oldSloDR.alloc_typ()) 
							&& (MAC_SLO_PROC_TYP.isALLOC(_oldSloDR.proc_typ())
									|| MAC_SLO_PROC_TYP.isALLOC_PROC(_oldSloDR.proc_typ())
									|| MAC_SLO_PROC_TYP.isPROC(_oldSloDR.proc_typ()))) {
						
						Srch_TgtR alcR = Srch_TgtR.create();
						
						copy(alcR, _oldSloDR, dtlR, createMap_Srch_TgtR_MST_SLO_D_R());
							
						if (!isNull(srchTgtForRelR)) {
							
							alcR.base_unit_qty(dtlR.base_unit_qty().subtract(srchTgtForRelR.base_unit_qty()));
						}
						else {
							alcR.base_unit_qty(dtlR.base_unit_qty());
						}
						
						setPackUnitQty(alcR);
						
						alcR.cst_cd(_oldSloR.cst_cd());
						
						ope.up1().add(alcR);
					}
				}
			}
			
			//引当を実行する
			if (!ope.up1().isEmpty()) {
				
				ope.up0().stk_flg(false);
				ope.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
				ope.up0().lot_prop_typ(MSC_LOT_PROP_TYP.LOT.value());
				//引当保留除外FLGをオフにする
				ope.up0().except_alloc_wait_flg(false);
				ope.up0().nm_srch_flg(false);
				
				Srch_Io_SchdR up3R = null;
				
				for (MST_SHIP_ALLOC_STS_R waitR : _waitShipAllocStsL) {
					
					up3R = Srch_Io_SchdR.create();
					
					if (MAC_TRD_PTN_TYP.isSLS(_oldSloR.trd_ptn_typ())) {
						
						up3R.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value()); 
						up3R.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SLO.value());
					}
					else {
						up3R.io_schd_typ(MSC_IO_SCHD_TYP.SHIP_OUT.value());
						up3R.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
					}
					
					up3R.io_schd_no(waitR.ship_alloc_sts_no());
					
					ope.up3().add(up3R);
				}
				MCSavepoint sp = dbTran().setSavepoint();
				
				//引当前に、該当受注自身の引当保留となっている受払予定を削除する（引当対象のみ）
				delIoSchdAllocWait();
				
				ope.exec();
				dbTran().rollback(sp);
				
				// 追加引当分のみ出荷引当状況を作成するため
				_waitAllocRsltL.setAll(ope.down0());
				
				_allocRsltL.addAll(ope.down0());
			}
		}
		
		/**
		 * 引当前に、該当受注自身の引当保留となっている受払予定を削除する。（引当対象のみ）
		 */
		protected void delIoSchdAllocWait() {
			
			MCList<MST_SHIP_ALLOC_STS_R> allocWaitL = getAllocWait();
			
			MCList<MSW_IO_SCHD_DEL_R> ioSchdDelL = MCList.create(MSW_IO_SCHD_DEL_R.class);
			
			MSW_IO_SCHD_DEL_R ioSchdDelR = null;
			
			for (MST_SHIP_ALLOC_STS_R allocWaitR : allocWaitL) {
				
				ioSchdDelR = MSW_IO_SCHD_DEL_R.create();
				
				String trdPtnTyp = null;
				
				if (MAC_TRD_PTN_TYP.isSHIP(_oldSloR.trd_ptn_typ()) 
						|| _oldSloDR.vmi_flg()) {
					
					// 貸出出荷
					ioSchdDelR.io_schd_typ(MSC_IO_SCHD_TYP.SHIP_OUT.value());
					trdPtnTyp = MAC_TRD_PTN_TYP.SHIP.value();
				}
				else if (MAC_TRD_PTN_TYP.isSLS(_oldSloR.trd_ptn_typ())) {
					
					// 売上
					ioSchdDelR.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value());
					trdPtnTyp = MAC_TRD_PTN_TYP.SLS.value();
				}
				
				// 仕入直送の場合、引当対象外（引当保留にならない）のため、引数のpurcDdlvFlgが必ずfalseになる
				ioSchdDelR.io_schd_sts_typ(getIoSchdStsTypForShip(
						trdPtnTyp, 
						allocWaitR.getStringNE(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no), 
						allocWaitR.getStringNE(MST_SHIP_SCHD_R.$slo_prms_no), 
						MAC_SLO_PROC_TYP.isPURC_DDLV(_oldSloDR.proc_typ()),
						false, 
						false, 
						false));

				ioSchdDelR.io_schd_no(allocWaitR.ship_alloc_sts_no());
				
				ioSchdDelL.add(ioSchdDelR);
			}

			if (!ioSchdDelL.isEmpty()) {
				
				MSBEL_IoSchdService.IoSchd_Del01 ope = MSBEL_IoSchdService.crtIoSchd_Del01();
				
				ope.up0().setAll(ioSchdDelL);
				
				ope.exec();
			}
		}
		
		/**
		 * 引当保留の出荷引当状況を取得する。（引当対象のみ）<br>
		 * 引当解除を実行すると、引当保留が生じるため、再検索を行う。
		 * @param allocSloDL 引当対象の受注明細
		 * @return 引当保留の出荷引当状況リスト
		 */
		protected MCList<MST_SHIP_ALLOC_STS_R> getAllocWait() {
			
			MCList<MST_SHIP_ALLOC_STS_R> allocWaitL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
			MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");
			MST_SLO_D_R t3 = MST_SLO_D_R.create("T3");
			MCQueryApiBuilder allocWait_bldr = MCQueryApiBuilder.create(t);
			
			allocWaitL.addStringColumn(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no);
			allocWaitL.addStringColumn(MST_SHIP_SCHD_R.$slo_prms_no);
			allocWaitL.addStringColumn(MST_SLO_D_R.$slo_d_no);
			
			allocWait_bldr.setSelect(t.ship_alloc_sts_no);
			allocWait_bldr.addSelect(t1.dlv_inst_rcpt_no);
			allocWait_bldr.addSelect(t1.slo_prms_no);
			
			allocWait_bldr.addInnerJoin(t1, t1.ship_schd_no.eq(t.ship_schd_no));
			allocWait_bldr.addInnerJoin(t2, t2.ship_pr_no.eq(t1.ship_pr_no));
			allocWait_bldr.addInnerJoin(t3, t3.slo_d_no.eq(t2.slo_d_no));
			
			allocWait_bldr.setWhere(t3.slo_d_no.eq(bind("1")), _oldSloDR.slo_d_no());
			allocWait_bldr.addWhereWithAnd(t.alloc_wait_flg.eq(value(true)));
			
			dbSelect("MSBBL1230_MST_SHIP_ALLOC_STS_S03", allocWaitL, allocWait_bldr);
			
			return allocWaitL;
		}
		
		/**
		 * 荷姿単位数量を設定する。
		 * @param alcR 引当情報
		 */
		protected void setPackUnitQty(Srch_TgtR alcR) {
			
			if (!isNull(alcR.pack_unit_cd())) {
				
				if (!isSame(alcR.pack_unit_cd(), alcR.base_unit_cd())) {
					
					MAVM_ITM_UNIT_R packItmUnitR = getItmUnit(
							alcR.itm_cd(), 
							alcR.itm_sub1(), 
							alcR.itm_sub2(), 
							alcR.itm_sub3(), 
							alcR.pack_unit_cd());

					alcR.pack_unit_qty(rvrsBaseUnitConv(
							alcR.base_unit_qty(), 
							packItmUnitR.conv_base_qty(), 
							packItmUnitR.conv_qty(), 
							packItmUnitR.dec_place(), 
							packItmUnitR.rnd_typ()));
				}
				else {
					alcR.pack_unit_qty(alcR.base_unit_qty());
				}
			}
		}

		protected void updSlo() {
			Upd01_SloR sloR = up0();
			
			if (sloR.isStatusModify()) {
				
				MST_SLO_R slo = MST_SLO_R.create();
				slo.slo_no(sloR.slo_no());
				slo.can_rsn_cd(sloR.can_rsn_cd());
				slo.can_rmrks(sloR.can_rmrks());
				
				MST_SLO_R t2 = MST_SLO_R.create("T");
				MCQueryApiBuilder slo_bldr = MCQueryApiBuilder.create(t2);
				slo_bldr.setSet(t2.can_rsn_cd, t2.can_rmrks);
				dbUpdateKey("MSBBL1230_MST_SLO_U01", slo, slo_bldr);
			}
			else {
				
				//空更新
				MST_SLO_R t3 = MST_SLO_R.create("T");
				MCQueryApiBuilder oldSloR_bldr = MCQueryApiBuilder.create(t3);
				dbTsUpdateKey("MSBBL1230_MST_SLO_U02", _oldSloR, oldSloR_bldr.getBaseDbc());
			}
		}

		protected void updSloPrmsH() {
			Upd01_Slo_DR sloDR = up1().get(0);
			MST_SLO_PRMS_H_R sloPrmsHR = MST_SLO_PRMS_H_R.create();
			MST_SLO_PRMS_H_R t = MST_SLO_PRMS_H_R.create("T");
			MCQueryApiBuilder sloPrmsHR_bldr = MCQueryApiBuilder.create(t);
			sloPrmsHR_bldr.addWhereWithAnd(t.slo_d_no.eq(bind("slo_d_no")));
			sloPrmsHR_bldr.addWhereWithAnd(t.slo_prms_h_no.eq(bind("slo_prms_h_no")));
			sloPrmsHR_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			int cnt = dbSelect("MSBBL1230_MST_SLO_PRMS_H_S02", sloPrmsHR, sloPrmsHR_bldr, sloDR);
			if (!up3().statusChangedList().isEmpty()) {
				// 受注納期回答ヘッダの更新処理
				if (cnt == 0) {
					_isUpdFlg  = true;
					sloPrmsHR.slo_prms_h_no(sloDR.slo_prms_h_no());
					sloPrmsHR.slo_prms_rev(_sloPrmsRev);
					sloPrmsHR.slo_d_no(sloDR.slo_d_no());
					sloPrmsHR.edi_prms_flg(sloDR.edi_prms_flg());
					dbInsertEx("MSBBL1230_MST_SLO_PRMS_H_I01", sloPrmsHR, sloPrmsHR_bldr);
				}
				else {
					sloPrmsHR.edi_prms_flg(sloDR.edi_prms_flg());
					sloPrmsHR_bldr.addSet(t.edi_prms_flg);
					
					_isUpdFlg = isUpdSloPrms(up3());
					if(_isUpdFlg) {
						sloPrmsHR.prms_prnt_tm(null);
						sloPrmsHR_bldr.addSet(t.prms_prnt_tm);
						sloPrmsHR.slo_prms_prnt_flg(false);
						sloPrmsHR_bldr.addSet(t.slo_prms_prnt_flg);
					}
					
					if(up3().subList(Status.DELETE).size() != 0 && isCan()) {
						_isUpdFlg = true;
						sloPrmsHR.can_flg(true);
						sloPrmsHR_bldr.addSet(t.can_flg);
						sloPrmsHR.prms_prnt_tm(null);
						sloPrmsHR_bldr.addSet(t.prms_prnt_tm);
						sloPrmsHR.slo_prms_prnt_flg(false);
						sloPrmsHR_bldr.addSet(t.slo_prms_prnt_flg);
					}
					else {
						sloPrmsHR.slo_prms_rev(_sloPrmsRev);
						sloPrmsHR_bldr.addSet(t.slo_prms_rev);
					}
					
					dbUpdateKey("MSBBL1230_MST_SLO_PRMS_H_U01", sloPrmsHR, sloPrmsHR_bldr);
				}
			}
		}

		/**
		 * 改訂履歴データ更新サービスの改訂履歴データ更新リスト登録処理を呼び出す。
		 * 受注改訂履歴テーブルを更新する。
		 */
		protected void updSloPR() {
			Upd01_SloR r = up0();
			MST_SLO_R sloR = MST_SLO_R.create();
			MCQueryApiBuilder sloR_bldr = MCQueryApiBuilder.create(MST_SLO_R.create("T"));
			dbSelectKey("MSBBL1230_MST_SLO_S02", sloR, sloR_bldr, r.slo_no());

			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
			opeR.rev_data_src_no(sloR.slo_no());
			opeR.rev_no(sloR.slo_rev());
			opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SLO.value());
			ope.up0().add(opeR);
			ope.exec();
		}

		protected void updSloD() {
			Upd01_Slo_DR sloDR = up1().get(0);
			if (sloDR.isStatusModify()) {
				MST_SLO_D_R sloD = MST_SLO_D_R.create();
				sloD.slo_d_no(sloDR.slo_d_no());
				sloD.can_rsn_cd(sloDR.can_rsn_cd());
				sloD.slo_d_can_rmkrs(sloDR.slo_d_can_rmkrs());
				
				MST_SLO_D_R t1 = MST_SLO_D_R.create("T");
				MCQueryApiBuilder sloD_bldr = MCQueryApiBuilder.create(t1);
				sloD_bldr.setSet(t1.can_rsn_cd, t1.slo_d_can_rmkrs);
				dbUpdateKey("MSBBL1230_MST_SLO_D_U01", sloD, sloD_bldr);
			}
			else {
				MCQueryApiBuilder _oldSloDR_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
				dbTsUpdateKey("MSBBL1230_MST_SLO_D_U02", _oldSloDR, _oldSloDR_bldr.getBaseDbc());
			}
		}
		
		/**
		 * 出荷進捗の納入指示受領日を更新する。
		 */
		protected void updShipPr() {
			if (_oldSloDR.can_flg()) {
				return;
			}
			
			MST_SHIP_PR_R t = MST_SHIP_PR_R.create("T");
			MCQueryApiBuilder oldShipPrR_bldr = MCQueryApiBuilder.create(t);
			if (!up3().statusChangedList().isEmpty()) {
				
				// 納期回答情報を取得する。
				MCList<MST_SLO_PRMS_R> prmsL = getSloPrmsL(_oldSloDR.slo_d_no());
				
				// 受注/納入指示に対応する回答情報を抽出する。
				MCList<MST_SLO_PRMS_R> sloPrmsL = MCList.create(MST_SLO_PRMS_R.class);
				MCList<MST_SLO_PRMS_R> dlvInstPrmsL = MCList.create(MST_SLO_PRMS_R.class);
				for (MST_SLO_PRMS_R sloPrmsR : prmsL) {
					
					if (!isNull(sloPrmsR.dlv_inst_rcpt_no())) {
						dlvInstPrmsL.add(sloPrmsR.clone());
					}
					else {
						sloPrmsL.add(sloPrmsR.clone());
					}
				}
				
				if (!isNull(_oldShipPrR) && !_oldShipPrR.isEmpty()) {
					
					MCNumber baseUnitPrmsQty = prmsL.sum(MST_SLO_PRMS_R.$base_unit_prms_qty);
					MCDate maxPrmsDlvTm = (MCDate)prmsL.max(MST_SLO_PRMS_R.$prms_dlv_tm);
					
					_oldShipPrR.ship_pr_no(_oldShipPrR.ship_pr_no());
					_oldShipPrR.prms_dlv_dt(prmsL.size() > 0 && isSame(baseUnitPrmsQty, up2().sum(Upd01_Ship_SchdR.$base_unit_qty)) ? maxPrmsDlvTm : null);
					oldShipPrR_bldr.setSet(t.prms_dlv_dt);
					
					// 受注に対する回答情報が変わっているか確認する。
					boolean sloPrmsChng = false;
					for (Upd01_Slo_PrmsR up3R : up3().statusChangedList()) {
						if (isNull(up3R.dlv_inst_rcpt_no())) {
							sloPrmsChng = true;
							break;
						}
					}
					
					if (sloPrmsChng) {
						_oldShipPrR.prms_dt(sloPrmsL.size() > 0 ? getToday() : null);
						_oldShipPrR.prms_qty(sloPrmsL.size() > 0 ? sloPrmsL.sum(MST_SLO_PRMS_R.$base_unit_prms_qty) : MCNumber.ZERO);
						oldShipPrR_bldr.addSet(t.prms_dt, t.prms_qty);
					}
					
					// 納入指示に対する回答情報が変わっているか確認する。
					boolean dlvInstRcptPrmsChng = false;
					for (Upd01_Slo_PrmsR up3R : up3().statusChangedList()) {
						if (!isNull(up3R.dlv_inst_rcpt_no())) {
							dlvInstRcptPrmsChng = true;
							break;
						}
					}
					
					if (dlvInstRcptPrmsChng) {
						
						_oldShipPrR.dlv_inst_prms_dt(dlvInstPrmsL.size() > 0 ? getToday() : null);
						_oldShipPrR.dlv_inst_prms_qty(dlvInstPrmsL.size() > 0 ? dlvInstPrmsL.sum(MST_SLO_PRMS_R.$base_unit_prms_qty) : MCNumber.ZERO);
						
						oldShipPrR_bldr.addSet(t.dlv_inst_prms_dt, t.dlv_inst_prms_qty);
					}
				}
				
				dbUpdateKey("MSBBL1230_MST_SHIP_PR_U01", _oldShipPrR, oldShipPrR_bldr);
			}
			else {
				dbTsUpdateKey("MSBBL1230_MST_SHIP_PR_U02", _oldShipPrR, oldShipPrR_bldr.getBaseDbc());
			}
		}

		/**
		 * .出荷予定サービスの呼び出し
		 */
		protected void callShipSchdService() {
			
			if (MAC_SHIP_INST_TYP.isNO_PICK(_oldSloDR.ship_inst_typ())) {
				//　ピッキングなしの場合は対象外とする
				return;
			}
			
			//出荷予定、出荷引当状況の作成,出荷進捗を更新しないため、出荷予定サービス.更新（出荷予定）（MSBEL5500.ShipSchd_Upd02）を実行する。
			MSBEL_ShipSchdService.ShipSchd_Upd02 op = MSBEL_ShipSchdService.crtShipSchd_Upd02();

			for (Upd01_Ship_SchdR dtlR : up2()) {
				
				//対応する更新前の出荷予定を取得する。
				MST_SHIP_SCHD_R oldShipR = getFirstOldShipSchd(dtlR.ship_schd_no());
				
				if (dtlR.isStatusModify() 
						|| dtlR.isStatusCreate() 
						|| (!isNull(dtlR.sls_act_d_no()) && oldShipR.ship_inst_qty().isZero() && oldShipR.ship_act_qty().isZero())) {
					
					// 売上済みの場合は、出荷引当状況のロットＮＯを調整するため、常に渡す。
					ShipSchd_DtlR schdR = ShipSchd_DtlR.create();
					_oldSloDR.setStringNE("cst_cd", _oldSloR.cst_cd());
					copy(schdR, _oldSloDR, dtlR, createMap_ShipSchd_DtlR_MST_SLO_D_R());
					schdR.trd_rmrks(_oldSloR.trd_rmrks()); //取引備考
					
					if (!isNull(oldShipR)) {
						schdR.quality_typ(nvl(oldShipR.quality_typ(), MAC_QUALITY_TYP.GOOD.value())); //良品区分
						schdR.stk_id_typ(nvl(oldShipR.stk_id_typ(), MSC_STK_ID_TYP.COSTK.value())); //在庫識別区分
						schdR.stk_bp_cd(nvl(oldShipR.stk_bp_cd(), MAC_STR.NULL_VAL.value())); //在庫取引先ＣＤ
					}
					else if(!isNull(schdR.sls_act_d_no())) {
						schdR.stk_id_typ(MSC_STK_ID_TYP.CSTSTK.value()); //在庫識別区分
						schdR.stk_bp_cd(_oldSloR.cst_cd()); //在庫取引先ＣＤ
					}
					
					if (dtlR.isStatusModify()) {
						schdR.ship_inst_d_no(oldShipR.ship_inst_d_no()); //出荷指図明細ＮＯ						
						schdR.inst_qty(oldShipR.ship_inst_qty()); //指図数量（基準単位）
						schdR.inst_unit_cd(oldShipR.base_unit_cd()); //指図単位ＣＤ
					}
					op.up1().add(schdR);
				}
				//削除の場合
				if (dtlR.isStatusDelete()) {
					//既存の出荷予定を削除するための上り電文の作成					
					ShipSchd_DtlR schdR = ShipSchd_DtlR.create();
					schdR.peg_no(dtlR.peg_no());
					schdR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					schdR.ship_pr_no(oldShipR.ship_pr_no());
					schdR.ship_schd_no(oldShipR.ship_schd_no());
					op.up1().add(schdR);
				}
			}
			//上り電文（Alloc_Rslt）の設定
			if (!_allocRsltL.isEmpty()) {
				for (Srch_RsltR alRstR : _allocRsltL) {
					
					Alloc_RsltR alR = Alloc_RsltR.create();
					alR.alloc(alRstR);
					
					//受注明細の引当範囲区分＝通常場所引当または総量引当、且つ引当数＞０の場合、場所引当ＦＬＧをオンにする。
					if ((MAC_ALLOC_SCOPE_TYP.isLOC(_oldSloDR.alloc_scope_typ()) 
							|| MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(_oldSloDR.alloc_scope_typ()))
							&& alRstR.base_unit_qty().gt(0)) {
						alR.alloc_flg(true);
					}
					else {
						alR.alloc_flg(false);
					}
					op.up2().add(alR);
				}
			}
			
			op.up2().addAll(getNoChngAllocSts(op.up1()));
			
			for (ShipSchd_DtlR shipSchdR : op.up1()) {
				shipSchdR.is_src_sls_dlv_dt_adjst_flg(true);
				
				Alloc_RsltR allocR = op.up2().getFirst(Alloc_RsltR.$peg_no, shipSchdR.peg_no());
				if (!isNull(allocR)) {
					shipSchdR.gd_cd(allocR.gd_cd());
					shipSchdR.quality_typ(allocR.quality_typ());
					shipSchdR.stk_id_typ(allocR.stk_id_typ());
					shipSchdR.stk_bp_cd(allocR.stk_bp_cd());
				}
			}
			
			checkShipLotForslsCststk(op.up1(), op.up2());
			
			op.up0().lot_chk_flg(false);
			op.exec();
			
			copyByPegNo(up2(), new String[] {Upd01_Ship_SchdR.$ship_schd_no}, op.down0(), new String[] {ShipSchd_DtlR.$ship_schd_no});
		}
		
		/**
		 * 預り売上の場合、売上時にロットＮＯが設定されるため、有効期限チェック、ロット逆転チェックを行う。
		 */
		protected void checkShipLotForslsCststk(MCList<ShipSchd_DtlR> shipSchdL, MCList<Alloc_RsltR> allocRsltL) {
			
			MSBEL_ShipLotChkService.ShipLotChk_Chk01 shipLotChk = MSBEL_ShipLotChkService.crtShipLotChk_Chk01();
			for (Alloc_RsltR allocRsltR : allocRsltL) {
				
				if (isNullOrNullVal(allocRsltR.lot_no()) && isNullOrNullVal(allocRsltR.sublot_no())) {
					continue;
				}
				
				ShipSchd_DtlR shipSchdR = shipSchdL.getFirst(ShipSchd_DtlR.$peg_no, allocRsltR.peg_no());
				
				if (!isNull(shipSchdR) && !isNull(shipSchdR.sls_act_d_no()) 
						&& (MAC_DATA_CRUD_TYP.isCRT(shipSchdR.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(shipSchdR.data_crud_typ()))) {
						
					if (_oldSloDR.sls_cststk_flg() && !isNull(shipSchdR.dlv_cd())) {
						ShipLot_DtlR lotR = ShipLot_DtlR.create();
						lotR.peg_no(shipSchdR.peg_no());
						lotR.cst_cd(_oldSloR.cst_cd());
						lotR.dlv_cd(shipSchdR.dlv_cd());
						lotR.itm_cd(_oldSloDR.itm_cd());
						lotR.itm_sub1(_oldSloDR.itm_sub1());
						lotR.itm_sub2(_oldSloDR.itm_sub2());
						lotR.itm_sub3(_oldSloDR.itm_sub3());
						lotR.base_dt(shipSchdR.dlv_schd_tm().startTimeOfDay());
						lotR.lot_no(allocRsltR.lot_no());
						lotR.sublot_no(allocRsltR.sublot_no());
						shipLotChk.up0().add(lotR);
					}
				}
			}
			if (!shipLotChk.up0().isEmpty()) {
				shipLotChk.exec();
				throwUpdErr();
			}
		}
		
		/**
		 * 出荷予定サービスの呼び出し（引当戻しの場合のみ実行する） <br>
		 * 打切解除の場合、引当済にするため、出荷予定サービスを２回を呼び出す。
		 */
		protected void callShipSchdServiceAbortRet() {
			
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(_oldSloDR.proc_typ())
					|| MAC_SHIP_INST_TYP.isNO_PICK(_oldSloDR.ship_inst_typ())) {
				// 仕入直送またはピッキングなしの場合は対象外とする
				return;
			}
			
			MSBEL_ShipSchdService.ShipSchd_Upd02 op = MSBEL_ShipSchdService.crtShipSchd_Upd02();

			for (Upd01_Ship_SchdR dtlR : up2()) {
				
				MST_SHIP_SCHD_R oldShipR = getFirstOldShipSchd(dtlR.ship_schd_no());
				
				ShipSchd_DtlR schdR = null;
						
				if (dtlR.isStatusModify() 
						|| dtlR.isStatusCreate() 
						|| (!isNull(dtlR.sls_act_d_no()) && oldShipR.ship_inst_qty().isZero() && oldShipR.ship_act_qty().isZero())) {
					
					if (!dtlR.abort_flg() && dtlR.org_abort_flg()) {
						
						schdR = ShipSchd_DtlR.create();
						copy(schdR, _oldSloDR, dtlR, createMap_ShipSchd_DtlR_MST_SLO_D_R());
						if (!isNull(oldShipR)) {
							schdR.quality_typ(nvl(oldShipR.quality_typ(), MAC_QUALITY_TYP.GOOD.value())); //良品区分
							schdR.stk_id_typ(nvl(oldShipR.stk_id_typ(), MSC_STK_ID_TYP.COSTK.value())); //在庫識別区分
							schdR.stk_bp_cd(nvl(oldShipR.stk_bp_cd(), MAC_STR.NULL_VAL.value())); //在庫取引先ＣＤ
						}
						op.up1().add(schdR);
						
						dtlR.org_abort_flg(false);
					}
				}
			}
			
			if (!op.up1().isEmpty()) {
				op.up0().lot_chk_flg(false);
				
				// 預り売上済みの場合、売上時に指定した情報を保持するため、出荷引当状況を渡すよ
				MCList<MST_SHIP_ALLOC_STS_R> slsActShipAllocStsL = getSlsActAllocSts();
				
				Alloc_RsltR allocRsltR = null;
				
				for (ShipSchd_DtlR shipSchdDtlR : op.up1()) {
					
					shipSchdDtlR.is_src_sls_dlv_dt_adjst_flg(true);
					if (!isNull(shipSchdDtlR.sls_act_d_no())) {
						
						MCIndexKey idxkey = slsActShipAllocStsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_schd_no);
						
						MCList<MST_SHIP_ALLOC_STS_R>	slsActAllocStsL = slsActShipAllocStsL.subList(idxkey, shipSchdDtlR.ship_schd_no());
						for (MST_SHIP_ALLOC_STS_R allocStsR : slsActAllocStsL) {
							
							allocRsltR = Alloc_RsltR.create();
							copy(allocRsltR, allocStsR, createMap_Alloc_RsltR_MST_SHIP_ALLOC_STS_R());
							allocRsltR.alloc_flg(true);
							allocRsltR.peg_no(shipSchdDtlR.peg_no());
							
							op.up2().add(allocRsltR);
						}
					}
				}
				
				op.exec();
			}
		}
		
		/**
		 * 変更なし出荷引当状況を返す。
		 * @param shipSchdDtlL 出荷予定リスト
		 * @return 出荷引当状況リスト
		 */
		protected MCList<Alloc_RsltR> getNoChngAllocSts(MCList<ShipSchd_DtlR> shipSchdDtlL) {
			
			MCList<Alloc_RsltR> allocRsltL = MCList.create(Alloc_RsltR.class);
			
			MCList<MST_SHIP_ALLOC_STS_R> allocStsL = getAllocSts();
			
			MCList<MST_SHIP_ALLOC_STS_R> slsActAllocStsL = allocStsL.createInstance();
			MCList<MST_SHIP_ALLOC_STS_R> shipSchdAllocStsL = allocStsL.createInstance();
			
			for (MST_SHIP_ALLOC_STS_R allocStsR: allocStsL) {
				if (!isNull(allocStsR.getStringNE("sls_act_d_no"))) {
					slsActAllocStsL.add(allocStsR.clone());
				}
				else {
					shipSchdAllocStsL.add(allocStsR.clone());
				}
			}
			
			if (!slsActAllocStsL.isEmpty()) {
				allocRsltL.addAll(getSlsActAllocSts(shipSchdDtlL, slsActAllocStsL));
			}
			
			if (!shipSchdAllocStsL.isEmpty()) {
				allocRsltL.addAll(getShipSchdAllocSts(shipSchdDtlL, shipSchdAllocStsL));
			}
			
			MCGroupByPolicy policy = new MCGroupByPolicy(getAllocGrpItm());
			policy.sum(Alloc_RsltR.$pack_unit_qty,
					Alloc_RsltR.$base_unit_qty);
			
			return allocRsltL.groupBy(policy);
		}
		
		/**
		 * 変更なし出荷予定の（預り売上実績済み以外)の出荷引当状況を分割する。
		 * @param shipSchdDtlL 出荷予定リスト
		 * @param shipSchdAllocStsL 出荷引当状況(預り売上済みを除く)
		 * @return 出荷引当状況
		 */
		protected MCList<Alloc_RsltR> getShipSchdAllocSts(MCList<ShipSchd_DtlR> shipSchdDtlL, MCList<MST_SHIP_ALLOC_STS_R> shipSchdAllocStsL) {
			
			MCList<Alloc_RsltR> allocRsltL = MCList.create(Alloc_RsltR.class);
			
			MCList<Alloc_RsltR> subAllocRsltL = null;
			
			MCIndexKey idxkey = _allocRsltL.createIndex(Srch_RsltR.$peg_no);
			for (ShipSchd_DtlR shipSchdDtlR : shipSchdDtlL) {
				
				if (MAC_DATA_CRUD_TYP.isDEL(shipSchdDtlR.data_crud_typ()) 
						|| !isNull(shipSchdDtlR.sls_act_d_no())
						|| _allocRsltL.contains(idxkey, shipSchdDtlR.peg_no())) {
					continue;
				}
				
				subAllocRsltL = MCList.create(Alloc_RsltR.class);
				
				setAll(subAllocRsltL, 
						shipSchdAllocStsL.subList(MST_SHIP_ALLOC_STS_R.$ship_schd_no, shipSchdDtlR.ship_schd_no()), 
						createMap_Alloc_RsltR_MST_SHIP_ALLOC_STS_R());
				subAllocRsltL.setValueNE(Alloc_RsltR.$peg_no, shipSchdDtlR.peg_no());
				
				allocRsltL.addAll(subAllocRsltL);
			}
			
			allocRsltL.setValueNE(Alloc_RsltR.$itm_cd, _oldSloDR.itm_cd());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub1, _oldSloDR.itm_sub1());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub2, _oldSloDR.itm_sub2());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub3, _oldSloDR.itm_sub3());
			
			return allocRsltL;
		}
		
		/**
		 * 預り売上実績済みの出荷引当状況を分割する。
		 * @param shipSchdDtlL 出荷予定リスト
		 * @param slsActAllocStsL 預り売上済み出荷引当状況
		 * @return 出荷引当状況
		 */
		protected MCList<Alloc_RsltR> getSlsActAllocSts(MCList<ShipSchd_DtlR> shipSchdDtlL, MCList<MST_SHIP_ALLOC_STS_R> slsActAllocStsL) {
			
			MCIndexKey idxShipSchd = slsActAllocStsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_schd_no);
			MCIndexKey idxSlsActD = slsActAllocStsL.createIndex("sls_act_d_no");
			
			MCList<Alloc_RsltR> allocRsltL = MCList.create(Alloc_RsltR.class);
			
			MCList<ShipSchd_DtlR> wkShipSchdDtlL = shipSchdDtlL.clone();
			wkShipSchdDtlL.sort(ShipSchd_DtlR.$ship_schd_tm);
			
			// 出荷予定ＮＯに紐づく出荷引当状況を設定する
			for (ShipSchd_DtlR shipSchdDtlR : wkShipSchdDtlL) {
				
				if (MAC_DATA_CRUD_TYP.isDEL(shipSchdDtlR.data_crud_typ()) 
						|| isNull(shipSchdDtlR.sls_act_d_no())) {
					continue;
				}
				
				MCList<MST_SHIP_ALLOC_STS_R> slsActAllocStsSubL = slsActAllocStsL.subList(idxShipSchd, shipSchdDtlR.ship_schd_no());
				slsActAllocStsSubL.sort(SortType.ASC,
						MST_SHIP_ALLOC_STS_R.$vld_dt_fr,
						MST_SHIP_ALLOC_STS_R.$vld_dt_to,
						MST_SHIP_ALLOC_STS_R.$lot_no);
				
				setAllocRslt(allocRsltL, shipSchdDtlR, slsActAllocStsSubL);
			}
			
			// 出荷予定ＮＯに紐づかない出荷引当状況を設定する
			for (ShipSchd_DtlR shipSchdDtlR : wkShipSchdDtlL) {
				
				if (MAC_DATA_CRUD_TYP.isDEL(shipSchdDtlR.data_crud_typ())
						|| isNull(shipSchdDtlR.sls_act_d_no())
						|| shipSchdDtlR.base_unit_qty().isZero()){
					continue;
				}
				
				MCList<MST_SHIP_ALLOC_STS_R> slsActAllocStsSubL = slsActAllocStsL.subList(idxSlsActD, shipSchdDtlR.sls_act_d_no());
				slsActAllocStsSubL.sort(SortType.ASC,
						MST_SHIP_ALLOC_STS_R.$vld_dt_fr,
						MST_SHIP_ALLOC_STS_R.$vld_dt_to,
						MST_SHIP_ALLOC_STS_R.$lot_no);
				
				setAllocRslt(allocRsltL, shipSchdDtlR, slsActAllocStsSubL);
			}
			
			allocRsltL.setValueNE(Alloc_RsltR.$itm_cd, _oldSloDR.itm_cd());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub1, _oldSloDR.itm_sub1());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub2, _oldSloDR.itm_sub2());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub3, _oldSloDR.itm_sub3());
			
			return allocRsltL;
		}
		
		/**
		 * 出荷引当状況を設定する。
		 * @param allocRsltL 出荷引当状況
		 * @param shipSchdDtlR 出荷予定
		 * @param slsActAllocStsSubL 預り売上済み出荷引当状況
		 */
		protected void setAllocRslt(MCList<Alloc_RsltR> allocRsltL,
				ShipSchd_DtlR shipSchdDtlR, MCList<MST_SHIP_ALLOC_STS_R> slsActAllocStsSubL) {
			
			Alloc_RsltR allocRsltR = null;
			MCNumber shipSchdQty = null;
			
			shipSchdQty = shipSchdDtlR.base_unit_qty();
			
			for (MST_SHIP_ALLOC_STS_R allocStsR : slsActAllocStsSubL) {
				
				if (allocStsR.base_unit_qty().isZero()) {
					continue;
				}
				
				if (shipSchdQty.isZero()) {
					break;
				}
				
				allocRsltR = Alloc_RsltR.create();
				copy(allocRsltR, allocStsR, createMap_Alloc_RsltR_MST_SHIP_ALLOC_STS_R());
				allocRsltR.alloc_scope_typ(allocStsR.alloc_scope_typ());
				allocRsltR.peg_no(shipSchdDtlR.peg_no());
				
				if (shipSchdQty.gte(allocStsR.base_unit_qty())) {
					
					shipSchdQty = shipSchdQty.subtract(allocStsR.base_unit_qty());
					allocStsR.trd_unit_qty(MCNumber.ZERO);
					allocStsR.base_unit_qty(MCNumber.ZERO);
				}
				else {
					
					allocRsltR.base_unit_qty(shipSchdQty);
					
					if (!isSame(allocRsltR.pack_unit_cd(), allocRsltR.base_unit_cd())) {
						
						MAVM_ITM_UNIT_R packItmUnitR = getItmUnit(
								_oldSloDR.itm_cd(), 
								_oldSloDR.itm_sub1(), 
								_oldSloDR.itm_sub2(), 
								_oldSloDR.itm_sub3(), 
								allocRsltR.pack_unit_cd());
						
						MCNumber packUnitQty = rvrsBaseUnitConv(
								allocRsltR.base_unit_qty(), 
								packItmUnitR.conv_base_qty(), 
								packItmUnitR.conv_qty(), 
								packItmUnitR.dec_place(), 
								packItmUnitR.rnd_typ(), 
								true);
						
						if (isNull(packUnitQty)) {
							
							throw new MCAppException(MSBBL0235,
									shipSchdDtlR.ship_schd_no(),
									allocRsltR.base_unit_qty(), 
									allocRsltR.pack_unit_cd(), 
									packItmUnitR.conv_base_qty(), 
									packItmUnitR.conv_qty(), 
									packItmUnitR.dec_place());
						}
						else {
							allocRsltR.pack_unit_qty(packUnitQty);
						}
					}
					else {
						allocRsltR.pack_unit_qty(allocRsltR.base_unit_qty());
					}
					
					allocStsR.base_unit_qty(allocStsR.base_unit_qty().subtract(allocRsltR.base_unit_qty()));
					allocStsR.pack_unit_qty(allocStsR.pack_unit_qty().subtract(allocRsltR.pack_unit_qty()));
					
					shipSchdQty = MCNumber.ZERO;
				}
				
				allocRsltL.add(allocRsltR);
			}
			
			shipSchdDtlR.base_unit_qty(shipSchdQty);
		}
		
		/**
		 * 売上済の出荷引当状況を取得する。
		 * @return 出荷引当状況
		 */
		protected MCList<MST_SHIP_ALLOC_STS_R> getSlsActAllocSts() {
			
			MCList<MST_SHIP_ALLOC_STS_R> slsActShipAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			
			if (!_oldSloDR.can_flg()) {
				MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
				MCQueryApiBuilder slsActShipAllocStsL_bldr = MCQueryApiBuilder.create(t);
				MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
				MAM_LOC_R m1 = MAM_LOC_R.create("M1");
				slsActShipAllocStsL_bldr.addSelect(t2.ship_fr_lg_grp_cd);
				slsActShipAllocStsL_bldr.addSelect(t2.sls_act_d_no);
				slsActShipAllocStsL_bldr.setWhere(t2.ship_pr_no.eq(bind("1")), _oldShipPrR.ship_pr_no());
				slsActShipAllocStsL_bldr.addWhereWithAnd(t2.sls_act_d_no.isNotNull());
				slsActShipAllocStsL_bldr.addWhereWithAnd(t.alloc_flg.eq(value(false)));
				slsActShipAllocStsL_bldr.addWhereWithAnd(t2.ship_inst_qty.eq(value(0)));
				slsActShipAllocStsL_bldr.addWhereWithAnd(t2.ship_act_qty.eq(value(0)));
				slsActShipAllocStsL_bldr.addInnerJoin(t2, t2.ship_schd_no.eq(t.ship_schd_no));
				slsActShipAllocStsL_bldr.addLeftOuterJoin(m1, m1.loc_cd.eq(t.ship_loc_cd));
				dbSelect("MSBBL1230_MST_SHIP_ALLOC_STS_S01", slsActShipAllocStsL, slsActShipAllocStsL_bldr);
			}
			
			return slsActShipAllocStsL;
		}
		
		/**
		 * 引当済の出荷引当状況を取得する。
		 * @return 出荷引当状況
		 */
		protected MCList<MST_SHIP_ALLOC_STS_R> getAllocSts() {
			
			MCList<MST_SHIP_ALLOC_STS_R> allocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			
			if (!_oldSloDR.can_flg()) {
				MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
				MCQueryApiBuilder allocStsL_bldr = MCQueryApiBuilder.create(t);
				MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
				MAM_LOC_R m1 = MAM_LOC_R.create("M1");
				allocStsL_bldr.addSelect(t2.ship_fr_lg_grp_cd);
				allocStsL_bldr.addSelect(t2.sls_act_d_no);
				allocStsL_bldr.setWhere(t2.ship_pr_no.eq(bind("1")), _oldShipPrR.ship_pr_no());
				allocStsL_bldr.addWhereWithAnd(t.alloc_flg.eq(value(true)));
				allocStsL_bldr.addWhereWithAnd(t2.ship_inst_qty.eq(value(0)));
				allocStsL_bldr.addWhereWithAnd(t2.ship_act_qty.eq(value(0)));
				allocStsL_bldr.addInnerJoin(t2, t2.ship_schd_no.eq(t.ship_schd_no));
				allocStsL_bldr.addLeftOuterJoin(m1, m1.loc_cd.eq(t.ship_loc_cd));
				dbSelect("MSBBL1230_MST_SHIP_ALLOC_STS_S02", allocStsL, allocStsL_bldr);
			}
			
			return allocStsL;
		}
		
		/**
		 * 引当保留の出荷引当状況を取得する。
		 */
		protected void getWaitShipAllocSts() {
			
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(_oldSloDR.proc_typ())
					|| MAC_SHIP_INST_TYP.isNO_PICK(_oldSloDR.ship_inst_typ())) {
				// 仕入直送またはピッキングなしの場合は対象外とする
				return;
			}
			
			if (_oldSloDR.can_flg()) {
				return;
			}
			
			_waitShipAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
			MCQueryApiBuilder waitShipAllocStsL_bldr = MCQueryApiBuilder.create(t);
			
			waitShipAllocStsL_bldr.setSelect(t.ship_alloc_sts_no, t.io_schd_pr_no);
			
			waitShipAllocStsL_bldr.addInnerJoin(t1, t1.ship_schd_no.eq(t.ship_schd_no));
			
			waitShipAllocStsL_bldr.setWhere(t1.ship_pr_no.eq(bind("1")), _oldShipPrR.ship_pr_no());
			waitShipAllocStsL_bldr.addWhereWithAnd(t.alloc_flg.eq(value(false)));
			waitShipAllocStsL_bldr.addWhereWithAnd(t.alloc_wait_flg.eq(value(true)));
			dbSelect("MSBBL1230_MST_SHIP_SCHD_S03", _waitShipAllocStsL, waitShipAllocStsL_bldr);
		}
		
		/**
		 * 出荷引当状況の集計項目を返す。
		 * @return　出荷引当状況の集計項目
		 */
		protected String[] getAllocGrpItm() {
			
			return new String [] {
					Alloc_RsltR.$peg_no,
					Alloc_RsltR.$itm_cd,
					Alloc_RsltR.$itm_sub1,
					Alloc_RsltR.$itm_sub2,
					Alloc_RsltR.$itm_sub3,
					Alloc_RsltR.$stk_loc_cd,
					Alloc_RsltR.$stk_str_ln_cd,
					Alloc_RsltR.$stk_lg_grp_cd,
					Alloc_RsltR.$quality_typ,
					Alloc_RsltR.$stk_insp_typ,
					Alloc_RsltR.$stk_id_typ,
					Alloc_RsltR.$stk_arrv_bp_cd,
					Alloc_RsltR.$stk_bp_cd,
					Alloc_RsltR.$gd_cd,
					Alloc_RsltR.$lot_no,
					Alloc_RsltR.$sublot_no,
					Alloc_RsltR.$sno1,
					Alloc_RsltR.$sno2,
					Alloc_RsltR.$sno3,
					Alloc_RsltR.$sno4,
					Alloc_RsltR.$ver_no,
					Alloc_RsltR.$pack_unit_cd,
					Alloc_RsltR.$base_unit_cd,
					Alloc_RsltR.$vld_dt_fr,
					Alloc_RsltR.$vld_dt_to,
					Alloc_RsltR.$alloc_flg,
					Alloc_RsltR.$alloc_wait_flg,
					Alloc_RsltR.$alloc_scope_typ,
					Alloc_RsltR.$ent_unit_cd };
		}
		

		protected void updCred() {
			
			if (_oldSloDR.can_flg()) {
				return;
			}
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(_oldSloDR.proc_typ())
					|| MAC_SHIP_INST_TYP.isNO_PICK(_oldSloDR.ship_inst_typ())) {
				// 仕入直送またはピッキングなしの場合は対象外とする
				return;
			}
			
			//取引区分が「売上」の場合、与信サービス.与信更新（売掛）（MSBGL5080.Cred_Upd01）を呼出し
			if (MAC_TRD_PTN_TYP.isSLS(_oldSloR.trd_ptn_typ()) && !_oldSloDR.vmi_flg()) {
				
				// インボイス取引の場合に、売上予定サービスで与信を更新するため、販売納期調整で更新不要とする。
				if (getBpR(_oldSloR.cst_cd()).cst_iv_flg()
						&& !_oldShipPrR.purc_ddlv_flg()) {
					return;
				}
				
				//対応する更新前の受注明細を取得する。
				//MST_SLO_D_R oldSloDR = _oldSloDL.get(0);
				MCNumber decPlace = getAmtDecPlace(_oldSloR.trd_cur_cd());
				String rndTyp = getRndTyp(_oldSloR.cst_cd());
				MSBGL_CredService.Cred_Upd01 ope = MSBGL_CredService.crtCred_Upd01();
				Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
				credR.cst_cd(_oldSloR.cst_cd());//得意先CD
				credR.cur_cd(_oldSloR.trd_cur_cd());//取引通貨ＣＤ.
				credR.trd_ptn_typ(_oldSloR.trd_ptn_typ());//取引パタン区分
				MCNumber credRAmt = MCNumber.ZERO;
				MCNumber crdQty = MCNumber.ZERO;
				for (Upd01_Ship_SchdR dtlR : up2()) {
					//再出荷FLG
					if (dtlR.re_ship_schd_flg()) {
						if (dtlR.isStatusCreate()) {
							crdQty = crdQty.add(dtlR.trd_unit_qty());
						}
						if (dtlR.isStatusDelete()) {
							crdQty = crdQty.subtract(dtlR.trd_unit_qty());
						}
						if (dtlR.isStatusModify()) {
							//対応する更新前の出荷予定を取得する。
							MST_SHIP_SCHD_R oldShipR = getFirstOldShipSchd(dtlR
									.ship_schd_no());
							//打切りの場合、与信更新対象外
							if (dtlR.abort_flg()) {
								continue;
							}
							//打切り取消の場合、与信更新対象外
							if (!dtlR.abort_flg() && oldShipR.abort_flg()) {
								continue;
							}
							crdQty = crdQty.subtract(oldShipR.trd_unit_qty());
							crdQty = crdQty.add(dtlR.trd_unit_qty());
						}
					}
				}
				if (crdQty.isZero()) {
					return;
				}
				credRAmt = (_oldSloDR.trd_cur_amt().add(_oldSloDR.trd_cur_tax_amt()))
						.multiply(crdQty).divide(_oldSloDR.trd_unit_qty(),
								decPlace.intValue(), MAC_RND_TYP.toMC(rndTyp));
				credR.amt(credRAmt);//与信額	
				if (credRAmt.gt(0)) {
					credR.cred_upd_typ(MSC_CRED_UPD_TYP.UPD_CHK.value());
				}
				else {
					credR.cred_upd_typ(MSC_CRED_UPD_TYP.UPD.value());
				}
				ope.up0().add(credR);
				ope.exec();
				if (!ope.down1().isEmpty()) {
					MCMessage msg = new MCMessage(MSBBL0124,
							ope.down1().get(0).cred_cd(), ope.down1().get(0).cur_cd(),
							ope.down1().get(0).cred_amt(), ope.down1().get(0)
									.cred_limit());
					throw new MCAppException(msg);
				}
			}
		}
		
		/**
		 * 取引先マスタを取得する。
		 * @param bpCd 取引先ＣＤ
		 * @return
		 */
		protected MAM_BP_R getBpR(String bpCd) {
			
			MAM_BP_R bpR = MAM_BP_R.create();
			MCQueryApiBuilder bpR_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("T"));
			dbSelectKey("MSBBL1230_MAM_BP_S01", bpR, bpR_bldr, bpCd);
			
			return bpR;
		}

		/**
		 * 受注納期回答の更新をおこなう
		 */
		protected void updSloPrms() {
			
			if (!up3().statusChangedList().isEmpty()) {
				
				MCList<MST_SLO_PRMS_R> insL = MCList.create(MST_SLO_PRMS_R.class);
				MCList<MST_SLO_PRMS_R> updL = MCList.create(MST_SLO_PRMS_R.class);
				MCList<MST_SLO_PRMS_R> delL = MCList.create(MST_SLO_PRMS_R.class);
				
				MST_SLO_PRMS_R sloPrmsR = null;
				Upd01_Slo_DR sloDR = up1().get(0);
				
				for (Upd01_Slo_PrmsR dtlR : up3()) {
					
					sloPrmsR = MST_SLO_PRMS_R.create();
					copy(sloPrmsR, dtlR, createMap_MST_SLO_PRMS_R_Upd01_Slo_PrmsR());
					
					sloPrmsR.slo_prms_h_no(sloDR.slo_prms_h_no());
					dtlR.slo_prms_h_no(sloDR.slo_prms_h_no());
					
					if (dtlR.isStatusCreate()) {
						insL.add(sloPrmsR);
					}
					else if (dtlR.isStatusNone() || dtlR.isStatusModify()) {
						updL.add(sloPrmsR);
					}
					else if (dtlR.isStatusDelete())  {
						sloPrmsR.can_flg(true);
						delL.add(sloPrmsR);
					}
				}
				
				if (!insL.isEmpty()) {
					MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_SLO_PRMS_R.create("T"));
					dbInsertEx("MSBBL1230_MST_SLO_PRMS_I01", insL, insL_bldr);
					// 改訂履歴データ更新サービス呼出（受注納期回答改訂履歴テーブル更新）
					updSloPrmsPR(insL);
				}
				
				if (!updL.isEmpty()) {
					
					MST_SLO_PRMS_R dbc = MST_SLO_PRMS_R.create("T");
					execDbUpdate("MSBBL1230_MST_SLO_PRMS_U01", dbc, updL, dbc.slo_prms_no.eq(bindEx("slo_prms_no")));
					// 改訂履歴データ更新サービス呼出（受注納期回答改訂履歴テーブル更新）
					updSloPrmsPR(updL);
				}
				
				if (!delL.isEmpty()) {
					MST_SLO_PRMS_R t = MST_SLO_PRMS_R.create("T");
					MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(t);
					delL_bldr.setSet(t.can_flg);
					dbUpdateKey("MSBBL1230_MST_SLO_PRMS_U02", delL, delL_bldr);
					if (isCan()) {
						updSloPrmsPR(delL);
					}
				}
			}
		}

		/**
		 * 改訂履歴データ更新サービスの改訂履歴データ更新リスト登録処理を呼び出す。
		 * 受注納期回答改訂履歴テーブルを更新する。
		 * @param sloPrmsL 受注納期回答リスト 
		 */
		protected void updSloPrmsPR(MCList<MST_SLO_PRMS_R> sloPrmsL) {
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			if (sloPrmsL.size() > 0) {
				for (MST_SLO_PRMS_R r : sloPrmsL) {
					RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
					opeR.rev_data_src_no(r.slo_prms_no());
					opeR.rev_no(r.slo_prms_rev());
					opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SLO_PRMS.value());
					ope.up0().add(opeR);
					ope.exec();
				}
			}
		}

		/**
		 * 受注納期回答改訂番号を取得する。
		 * @return  受注納期回答改訂番号
		 */
		protected MCNumber getSloPrmsRev(Upd01_Slo_DR dtl) {
					
			MST_SLO_PRMS_R sloPrmsR = MST_SLO_PRMS_R.create();

			executeQuery(sloPrmsR, MSBBL1230_MST_SLO_PRMS_S02(), dtl);
			
			MCNumber maxRev = nvl(sloPrmsR.slo_prms_rev(), MCNumber.ZERO);
			
			if (!up3().statusChangedList().isEmpty()) {
				
				if (up3().subList(Status.DELETE).size() != 0 && isCan()) {
					return maxRev;
				}
				maxRev = maxRev.add(1);
				
				for (Upd01_Slo_PrmsR up3R : up3()) {
					
					up3R.slo_prms_rev(maxRev);
				}
			}
			
			return maxRev;
		}
		
		/**
		 * WG間依頼の再調整依頼の反映
		 */
		protected void updWgRqst() {
			
			if (MAC_SHIP_INST_TYP.isNO_PICK(_oldSloDR.ship_inst_typ())) {
				// ピッキングなしの場合は対象外とする
				return;
			}
			
			MSBAL_WgRqstService.WgRqst_Upd04 op = MSBAL_WgRqstService.crtWgRqst_Upd04();
			for (Upd01_WG_RqstR dtlR : up4()) {
				if (!dtlR.isStatusNone()) {
					WgRqst_Upd04_DtlR upR = WgRqst_Upd04_DtlR.create();
					upR.wg_rqst_no(dtlR.wg_rqst_no());
					upR.re_rqst_flg(dtlR.re_rqst_flg());
					upR.re_rqst_dt(dtlR.re_rqst_dt());
					upR.wg_re_rqst_cnt_rmrks(dtlR.wg_re_rqst_cnt_rmrks());
					upR.prms_uncn_flg(dtlR.prms_uncn_flg());
					MST_WG_RQST_R wrR = MST_WG_RQST_R.create();
					MST_WG_RQST_R t = MST_WG_RQST_R.create("T");
					MCQueryApiBuilder wrR_bldr = MCQueryApiBuilder.create(t);
					wrR_bldr.setSelect(t.dlv_inst_rcpt_flg);
					dbSelectKey("MSBBL1230_MST_WG_RQST_S02", wrR, wrR_bldr, dtlR.wg_rqst_no());
					upR.dlv_inst_rcpt_flg(wrR.dlv_inst_rcpt_flg());
					op.up0().add(upR);
				}
			}

			if (!op.up0().isEmpty()) {
				op.exec();
			}
		}
		
		/**
		 * 受注状況更新サービスの受注状況登録処理を呼び出す。
		 */
		protected void callSloStsRegServiceIns01() {
			
			if (MAC_SHIP_INST_TYP.isNO_PICK(_oldSloDR.ship_inst_typ())) {
				// ピッキングなしの場合は対象外とする
				return;
			}
			
			MSBBL_SloStsRegService.SloSts_Ins01 op = MSBBL_SloStsRegService.crtSloSts_Ins01();
			
			createShipSchdSloSts(op);
			
			createSloPrmsSloSts(op);
			
			createAllocSloSts(op);

			if (!op.up0().isEmpty()) {
				op.exec();
			}
		}
		
		/**
		 * 出荷予定に関連する受注状況を作成する。
		 * @param ins01Serv 受注状況登録サービス
		 */
		protected void createShipSchdSloSts(MSBBL_SloStsRegService.SloSts_Ins01 ins01Serv) {
			
			boolean shipSchdUpd = false;
			
			SloSts_DtlR sloStsR = null;
			
			for (Upd01_Ship_SchdR shipSchdR : up2()) {
				
				if (shipSchdR.isStatusCreate() || shipSchdR.isStatusDelete()) {
					// 出荷予定変更
					shipSchdUpd = true;
				}
				else if (shipSchdR.isStatusModify()){
					MST_SHIP_SCHD_R oldShipSchdR = getFirstOldShipSchd(shipSchdR.ship_schd_no());
					
					if (!isNull(oldShipSchdR)) {
						
						if (shipSchdR.abort_flg() && !oldShipSchdR.abort_flg()) {
							// 出荷予定打切
							
							sloStsR = SloSts_DtlR.create();
							sloStsR.slo_d_no(_oldSloDR.slo_d_no());
							sloStsR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_SCHD_ABORT.value());
							sloStsR.unit_cd(shipSchdR.trd_unit_cd());
							sloStsR.qty(shipSchdR.trd_unit_qty());
							ins01Serv.up0().add(sloStsR);
						}
						else if (!shipSchdR.abort_flg() && oldShipSchdR.abort_flg()) {
							// 出荷予定打切取消
							
							sloStsR = SloSts_DtlR.create();
							sloStsR.slo_d_no(_oldSloDR.slo_d_no());
							sloStsR.unit_cd(shipSchdR.trd_unit_cd());
							sloStsR.qty(shipSchdR.trd_unit_qty());
							sloStsR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_SCHD_ABORT_CAN.value());
							ins01Serv.up0().add(sloStsR);
						}
						else if (!isSame(shipSchdR.ship_rqst_tm(), oldShipSchdR.ship_rqst_tm())
								|| !isSame(shipSchdR.pd_inst_dlv_tm(), oldShipSchdR.pd_inst_dlv_tm())
								|| !isSame(shipSchdR.not_dt_calc_flg(), oldShipSchdR.not_dt_calc_flg())
								|| (shipSchdR.not_dt_calc_flg() && !isSame(shipSchdR.ship_schd_tm(), oldShipSchdR.ship_schd_tm()))
								|| (shipSchdR.not_dt_calc_flg() && !isSame(shipSchdR.dlv_schd_tm(), oldShipSchdR.dlv_schd_tm()))
								|| !isSame(shipSchdR.ship_term_cd(), oldShipSchdR.ship_term_cd())
								|| !isSame(shipSchdR.trd_unit_qty(), oldShipSchdR.trd_unit_qty())
								|| !isSame(shipSchdR.fix_flg(), oldShipSchdR.fix_flg())
								|| !isSame(shipSchdR.re_ship_schd_flg(), oldShipSchdR.re_ship_schd_flg())
								|| !isSame(shipSchdR.ship_block_flg(), oldShipSchdR.ship_block_flg())
								|| !isSame(shipSchdR.trd_d_rmrks(), oldShipSchdR.trd_d_rmrks())
								|| !isSame(shipSchdR.ship_cnt_rmrks(), oldShipSchdR.ship_cnt_rmrks())
								|| !isSame(shipSchdR.sub_char1(), oldShipSchdR.sub_char1())
								|| !isSame(shipSchdR.sub_char2(), oldShipSchdR.sub_char2())
								|| !isSame(shipSchdR.sub_char3(), oldShipSchdR.sub_char3()))  {

							// 出荷予定変更
							shipSchdUpd = true;
						}
					}
				}
			}
			
			if (shipSchdUpd) {
				
				sloStsR = SloSts_DtlR.create();
				sloStsR.slo_d_no(_oldSloDR.slo_d_no());
				sloStsR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_SCHD_UPD.value());
				ins01Serv.up0().add(sloStsR);
			}
		}
		
		/**
		 * 納期回答に関連する受注状況を作成する。
		 * @param ins01Serv 受注状況登録サービス
		 */
		protected void createSloPrmsSloSts(MSBBL_SloStsRegService.SloSts_Ins01 ins01Serv) {

			if (!up3().statusChangedList().isEmpty()) {
				
				// 納期回答
				SloSts_DtlR sloStsR = SloSts_DtlR.create();
				sloStsR.slo_d_no(_oldSloDR.slo_d_no());
				sloStsR.slo_sts_typ(MSC_SLO_STS_TYP.SLO_PRMS.value());
				ins01Serv.up0().add(sloStsR);
			}
		}
		/**
		 * 売上予定サービスを実行し、売上予定タブで訂正した情報を売上予定に反映する。
		 */
		protected void callSlsSchdService() {
			
			MSBBL_SlsSchdService.Sls_Schd_Upd03 ope = MSBBL_SlsSchdService.crtSls_Schd_Upd03();
			
			Sls_Schd_Upd03_DtlR up0R= null;
			
			for (Upd01_Sls_SchdR slsSchdR : up5()) {
				
				if (slsSchdR.isStatusModify()) {
					
					up0R = Sls_Schd_Upd03_DtlR.create();
					
					up0R.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					up0R.sls_schd_no(slsSchdR.sls_schd_no());
					up0R.abort_flg(slsSchdR.abort_flg());
					// 基準単位売上数量は売上予定に加算する数量なので、常に0を設定する。
					up0R.base_unit_sls_qty(0);
					up0R.sls_schd_dt(slsSchdR.sls_schd_dt());
					up0R.manual_upd_flg(true);
					
					ope.up0().add(up0R);
				}
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		/**
		 * 出荷予定サービスを実行し、売上予定タブで訂正した情報を出荷進捗・出荷予定に反映する。
		 */
		protected void callShipSchdServiceForSlsSchdAbort() {
			
			MSBEL_ShipSchdService.ShipSchd_Chk02 ope02Chk = MSBEL_ShipSchdService.crtShipSchd_Chk02();
			MSBEL_ShipSchdService.ShipSchd_Upd02 ope02 = MSBEL_ShipSchdService.crtShipSchd_Upd02();

			MSBEL_ShipSchdService.ShipSchd_Upd05 ope05 = MSBEL_ShipSchdService.crtShipSchd_Upd05();
			
			for (Upd01_Sls_SchdR up5R : up5()) {
				
				if (up5R.isStatusModify()) {
					
					MST_SLS_SCHD_R t2 = MST_SLS_SCHD_R.create("T2");
					MST_SHIP_SCHD_R shipSchdR = MST_SHIP_SCHD_R.create();
					MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
					MCQueryApiBuilder shipSchdR_bldr = MCQueryApiBuilder.create(t);
					shipSchdR_bldr.addInnerJoin(t2, bracket( t.ship_schd_no.eq(t2.ship_schd_no)));
					shipSchdR_bldr.addSelect(t2.purc_act_d_no);
					shipSchdR_bldr.setWhere(t2.sls_schd_no.eq(bind("1")), up5R.sls_schd_no());
					dbSelect("MSBBL1230_MST_SHIP_SCHD_S03", shipSchdR, shipSchdR_bldr);
					
					// 仕入直送売上で打切ＦＬＧの変更がある場合、出荷予定の打切も更新する。
					// 売上予定と出荷予定は1:1の関係で、打切ＦＬＧも同期されている。
					if (!isNull(shipSchdR.getStringNE("purc_act_d_no"))) {
						if (!isSame(up5R.abort_flg(), shipSchdR.abort_flg())) {
							ShipSchd_DtlR ope02ChkUpR = ShipSchd_DtlR.create();
							
							copy(ope02ChkUpR, shipSchdR, createMap_ShipSchd_DtlR_MST_SHIP_SCHD_R());
							
							ope02ChkUpR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
							ope02ChkUpR.abort_flg(up5R.abort_flg());
							
							ope02Chk.up0().add(ope02ChkUpR);
						}
					}
					
					// 出荷進捗のステータスを更新する
					ShipSchd_Upd05_DtlR ope05Up0R = ShipSchd_Upd05_DtlR.create();
					ope05Up0R.ship_schd_no(shipSchdR.ship_schd_no());
					ope05.up0().add(ope05Up0R);
				}
			}
			
			if (!ope02Chk.up0().isEmpty()) {
				ope02Chk.exec();
				
				ope02.up1().setAll(ope02Chk.up0());
				ope02.exec();
			}
			
			if (!ope05.up0().isEmpty()) {
				ope05.exec();
			}
		}
		
		protected Map_ShipSchd_DtlR_MST_SHIP_SCHD_R<ShipSchd_DtlR, MST_SHIP_SCHD_R> createMap_ShipSchd_DtlR_MST_SHIP_SCHD_R() {
			return new Map_ShipSchd_DtlR_MST_SHIP_SCHD_R<ShipSchd_DtlR, MST_SHIP_SCHD_R>();
		}

		public class Map_ShipSchd_DtlR_MST_SHIP_SCHD_R<D extends ShipSchd_DtlR, S extends MST_SHIP_SCHD_R>
				extends MCRowMapper<D, S> {

			@Override
			public void valueCopy(D dest, S src) {
				dest.peg_no(src.getNumberNE("peg_no")); //データ紐付けＮＯ
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value()); //データ更新区分
				dest.ship_schd_no(src.ship_schd_no()); //出荷予定ＮＯ
				dest.ship_pr_no(src.ship_pr_no()); //出荷進捗ＮＯ
				dest.ship_inst_d_no(src.ship_inst_d_no()); //出荷指図明細ＮＯ
				dest.dlv_inst_rcpt_no(src.dlv_inst_rcpt_no()); //納入指示受領ＮＯ
				dest.slo_prms_no(src.slo_prms_no()); //受注納期回答ＮＯ
				dest.ship_fr_lg_grp_cd(src.ship_fr_lg_grp_cd()); //出荷元物流グループＣＤ
				dest.wg_cd(src.wg_cd()); //ワーキンググループＣＤ
				dest.pd_inst_dlv_tm(src.pd_inst_dlv_tm()); //納品依頼日時
				dest.ship_rqst_tm(src.ship_rqst_tm()); //出荷希望日時
				dest.ship_schd_tm(src.ship_schd_tm()); //出荷予定日時
				dest.dlv_schd_tm(src.dlv_schd_tm()); //納品予定日時
				dest.ship_term_cd(src.ship_term_cd()); //出荷条件ＣＤ
				dest.ship_wk_cd(src.ship_wk_cd()); //出荷作業ＣＤ
				dest.itm_cd(src.itm_cd()); //品目ＣＤ
				dest.itm_sub1(src.itm_sub1()); //枝番１
				dest.itm_sub2(src.itm_sub2()); //枝番２
				dest.itm_sub3(src.itm_sub3()); //枝番３
				dest.itm_nm(src.itm_nm()); //品名
				dest.iv_itm_nm(src.iv_itm_nm()); //インボイス表記用品名
				dest.sundry_itm_flg(src.sundry_itm_flg()); //諸口品ＦＬＧ
				dest.sno1(src.sno1()); //手配ＮＯ１
				dest.sno1_null_flg(src.sno1_null_flg()); //手配ＮＯ１無し可ＦＬＧ
				dest.sno2(src.sno2()); //手配ＮＯ２
				dest.sno2_null_flg(src.sno2_null_flg()); //手配ＮＯ２無し可ＦＬＧ
				dest.sno3(src.sno3()); //手配ＮＯ３
				dest.sno3_null_flg(src.sno3_null_flg()); //手配ＮＯ３無し可ＦＬＧ
				dest.sno4(src.sno4()); //手配ＮＯ４
				dest.sno4_null_flg(src.sno4_null_flg()); //手配ＮＯ４無し可ＦＬＧ
				dest.lot_no(src.lot_no()); //ロットＮＯ
				dest.sublot_no(src.sublot_no()); //サブロットＮＯ
				dest.ver_no(src.ver_no()); //版ＮＯ			
				dest.stk_arrv_bp_cd(src.stk_arrv_bp_cd()); //在庫着荷先ＣＤ
				dest.gd_cd(src.gd_cd()); //格付ＣＤ
				dest.quality_typ(src.quality_typ()); //良品区分			
				dest.stk_id_typ(src.stk_id_typ()); //在庫識別区分			
				dest.stk_bp_cd(src.stk_bp_cd()); //在庫取引先ＣＤ
				dest.trd_unit_qty(src.trd_unit_qty()); //取引単位数量
				dest.trd_unit_cd(src.trd_unit_cd()); //取引単位ＣＤ
				dest.base_unit_qty(src.base_unit_qty()); //基準単位数量
				dest.base_unit_cd(src.base_unit_cd()); //基準単位ＣＤ
				dest.abort_flg(src.abort_flg()); //打切ＦＬＧ
				dest.fix_flg(src.fix_flg()); //確定ＦＬＧ			
				dest.ship_block_flg(src.ship_block_flg());//出荷留めＦＬＧ
				dest.inst_bndl_flg(src.inst_bndl_flg()); //指図まとめＦＬＧ
				dest.not_lot_mix_flg(src.not_lot_mix_flg()); //ロット混在ＦＬＧ
				dest.not_sublot_mix_flg(src.not_sublot_mix_flg()); //サブロット混在ＦＬＧ
				dest.vld_dt_fr(src.vld_dt_fr()); //有効期限ＦＲＯＭ
				dest.vld_dt_to(src.vld_dt_to()); //有効期限ＴＯ
				dest.re_ship_schd_flg(src.re_ship_schd_flg()); //再出荷予定ＦＬＧ
				dest.intr_rmrks(src.intr_rmrks()); //内部備考
				dest.trd_rmrks(src.trd_rmrks()); //取引備考
				dest.trd_d_rmrks(src.trd_d_rmrks()); //取引明細備考
				dest.ship_cnt_rmrks(src.ship_cnt_rmrks()); //出荷連絡備考
				dest.sub_char1(src.sub_char1()); //予備１
				dest.sub_char2(src.sub_char2()); //予備２
				dest.sub_char3(src.sub_char3()); //予備３
				dest.inst_qty(null); //指図数量（基準単位）
				dest.inst_unit_cd(null); //指図単位ＣＤ
				dest.inst_ship_schd_tm(null); //指図出荷予定日時
				dest.inst_dlv_schd_tm(null); //指図納品予定日時			
				dest.ship_schd_split_flg(false); //出荷予定分割ＦＬＧ
			}
		}
		
		/**
		 * 引当に関連する受注状況を作成する。
		 * @param ins01Serv 受注状況登録サービス
		 */
		protected void createAllocSloSts(MSBBL_SloStsRegService.SloSts_Ins01 ins01Serv) {
			
			if (!_waitAllocRsltL.isEmpty()) {
				
				List<String> grpColL = new ArrayList<>();
				
				grpColL.add(Srch_RsltR.$stk_lg_grp_cd);
				grpColL.add(Srch_RsltR.$stk_loc_cd);
				grpColL.add(Srch_RsltR.$pack_unit_cd);
				
				if (!isNull(_oldShipPrR.alloc_grp_cd())) {
					grpColL.add(Srch_RsltR.$stk_alloc_grp_cd);
				}
	
				MCGroupByPolicy gp = new MCGroupByPolicy(grpColL.toArray(new String[0]));
				
				gp.sum(Srch_RsltR.$pack_unit_qty);
				MCList<Srch_RsltR> allocGrpL = _waitAllocRsltL.groupBy(gp);
				
				SloSts_DtlR sloStsR = null;
						
				for (Srch_RsltR rsltR : allocGrpL) {
					
					sloStsR = SloSts_DtlR.create();
					
					sloStsR.slo_sts_typ(MSC_SLO_STS_TYP.ALLOC.value());
					sloStsR.slo_d_no(_oldShipPrR.slo_d_no());
					sloStsR.alloc_grp_cd(rsltR.stk_alloc_grp_cd());
					sloStsR.ship_lg_grp_cd(rsltR.stk_lg_grp_cd());
					sloStsR.loc_cd(rsltR.stk_loc_cd());
					sloStsR.unit_cd(rsltR.pack_unit_cd());
					sloStsR.qty(rsltR.pack_unit_qty());
				}
				
				ins01Serv.up0().add(sloStsR);
			}
		}

		/**
		 * EDI納期回答送信
		 */
		protected void createEdiSendData() {
			
			if (MAC_SHIP_INST_TYP.isNO_PICK(_oldSloDR.ship_inst_typ())) {
				// ピッキングなしの場合は対象外とする
				return;
			}
			
			//EDI納期回答送信ＩＦサービス.書込
			//MSBBL6110.PrmsSendIf_Upd01
			if (up1().get(0).edi_prms_flg() && !up3().statusChangedList().isEmpty()) {
				
				for (Upd01_Slo_PrmsR sloPrmsR : up3()) {
					if (sloPrmsR.isStatusCreate()) {
						sloPrmsR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					}
					else if (sloPrmsR.isStatusModify()) {
						sloPrmsR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					}
					else if (sloPrmsR.isStatusDelete()) {
						sloPrmsR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
				}
				
				MSLAL_PrmsSendIfService.PrmsSendIf_Upd01 ope = MSLAL_PrmsSendIfService.crtPrmsSendIf_Upd01();
				
				PrmsSendIf_Upd01_DtlR upR = null;

				for (MCList<Upd01_Slo_PrmsR> sloPrmsGrpL: up3().groupList(Upd01_Slo_PrmsR.$slo_d_no)) {
					boolean delFlg = true;
					upR = PrmsSendIf_Upd01_DtlR.create();
					Upd01_Slo_PrmsR sloPrmsR = sloPrmsGrpL.get(0);
					
					upR.slo_d_no(sloPrmsR.slo_d_no());
					
					//更新対象の受注納期回答NOのリストを取得する
					MCList<MST_SLO_PRMS_R> sloPrmsL = getSloPrms(sloPrmsR.slo_d_no());
					
					if(sloPrmsL.isEmpty()) {
						//更新対象外のみの場合、データの作成自体を行わないためスキップ
						return;
					}
					else {
						for(MST_SLO_PRMS_R r : sloPrmsL) {
							for(Upd01_Slo_PrmsR r1 : up3()) {
								if(isSame(r.slo_prms_no(), r1.slo_prms_no())) {
									//更新対象行のデータ更新区分≠削除の場合、ＦＬＧ=オン
									if(!MAC_DATA_CRUD_TYP.isDEL(r1.data_crud_typ())) {
										delFlg = false;
										break;
									}
								}
							}
						}
						if(delFlg) {
							upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							upR.del_prms_rev(sloPrmsR.slo_prms_rev());
						}
						else {
							MCList<Upd01_Slo_PrmsR> grpL = sloPrmsGrpL.groupBy(Upd01_Slo_PrmsR.$data_crud_typ);
							
							if (grpL.size() > 1) {
								upR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
							}
							else if (grpL.size() == 1) {
								
								upR.data_crud_typ(grpL.get(0).data_crud_typ());
								
								if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
									upR.del_prms_rev(sloPrmsR.slo_prms_rev());
								}
							}
						}
					}

					ope.up0().add(upR);
				}
				
				if (ope.up0().size() > 0) {
					ope.exec();
				}
			}
		}

		protected void callPrint() {
			if (isNull(_printHdrL)) {
				return;
			}
			MSBBL_SloPrmsPrntService.SloPrms_Prnt01 ope = MSBBL_SloPrmsPrntService.crtSloPrms_Prnt01();
			ope.up0().addAll(_printHdrL);
			ope.exec();
		}

		protected void setPrint() {
			if (!up6().prnt_out_flg() || !_isUpdFlg) {
				return;
			}
			
			if (!up3().statusChangedList().isEmpty()) {
				if (isNull(_printHdrL)) {
					_printHdrL = MCList.create(SloPrms_Prnt01_HdrR.class);
				}
				
				for (Upd01_Slo_PrmsR r : up3()) {
					SloPrms_Prnt01_HdrR hdrR = SloPrms_Prnt01_HdrR.create();
					copy(hdrR, r, createMap_SloPrms_Prnt01_HdrR_Upd01_Slo_PrmsR());
					_printHdrL.add(hdrR);
				}
			}
		}

		/**
		 * 取引通貨に対応する通貨マスタ.金額小数部有効桁数を取得する
		 * @param trdCurCd 通貨CD
		 * @return　通貨マスタ.金額小数部有効桁数
		 */
		protected MCNumber getAmtDecPlace(String trdCurCd) {
			MAM_CUR_R curR = MAM_CUR_R.create();
			MAM_CUR_R t = MAM_CUR_R.create("T");
			MCQueryApiBuilder curR_bldr = MCQueryApiBuilder.create(t);
			curR_bldr.setSelect(t.amt_dec_place);
			dbSelectKey("MSBBL1230_MAM_CUR_S01", curR, curR_bldr, trdCurCd);
			return curR.amt_dec_place();
		}

		/**
		 * 得意先CDに対応する取引先マスタ.売上金額端数処理区分
		 * @param cstCd　取引先CD
		 * @return　取引先マスタ.売上金額端数処理区分
		 */
		protected String getRndTyp(String cstCd) {
			MAM_BP_R bpR = MAM_BP_R.create();
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpR_bldr = MCQueryApiBuilder.create(t);
			bpR_bldr.setSelect(t.sls_amt_rnd_typ);
			dbSelectKey("MSBBL1230_MAM_BP_S02", bpR, bpR_bldr, cstCd);
			return bpR.sls_amt_rnd_typ();
		}

		protected void setDown() {
			
			setDtHmDown(up2());
			setShipWkNmDown(up2());
			down0().addAll(up2());
			down1().addAll(up3());
		}
		
		/**
		 * 出荷指図に纏めない「2：ピッキングなし」の明細が存在するか確認する。
		 */
		protected void chkNoPick() {
			
			MCList<MST_SLO_D_R> noPickL = MCList.create(MST_SLO_D_R.class);
			executeQuery(noPickL, MSBBL1230_MST_SLO_D_S02(), up0());
			
			for (MST_SLO_D_R noPickR : noPickL) {
				if (!isNull(noPickR.tdlv_cd())) {
					MCMessagePool.add(new MCMessage(MSBBL0404, noPickR.slo_no(), noPickR.slo_d_no(), noPickR.tdlv_cd()));
				}
				else {
					MCMessagePool.add(new MCMessage(MSBBL0405, noPickR.slo_no(), noPickR.slo_d_no(), noPickR.dlv_cd()));
				}
			}
		}
		
		/**
		 * 出荷予定日/時刻、納品予定日/時刻を設定する。
		 * @param shipSchdL 出荷予定リスト
		 */
		protected void setDtHmDown(MCList<Upd01_Ship_SchdR> shipSchdL) {

			for (Upd01_Ship_SchdR shipShcdR : shipSchdL) {
				
				if (!isNull(shipShcdR.ship_schd_tm())) {
					shipShcdR.ship_schd_dt(shipShcdR.ship_schd_tm().startTimeOfDay());
				}
				shipShcdR.ship_schd_hm(shipShcdR.ship_schd_tm());
				
				if (!isNull(shipShcdR.dlv_schd_tm())) {
					shipShcdR.dlv_schd_dt(shipShcdR.dlv_schd_tm().startTimeOfDay());
				}
				shipShcdR.dlv_schd_hm(shipShcdR.dlv_schd_tm());
			}
			doCompTime(shipSchdL, false);
		}
		
		/**
		 * 出荷作業名を設定する。
		 * @param shipSchdL 出荷予定リスト
		 */
		protected void setShipWkNmDown(MCList<Upd01_Ship_SchdR> shipSchdL) {

			MCList<MAM_SHIP_WK_R> shipWkL = MCList.create(MAM_SHIP_WK_R.class);
			MAM_SHIP_WK_R t = MAM_SHIP_WK_R.create("T");
			MCQueryApiBuilder shipWkL_bldr = MCQueryApiBuilder.create(t);
			
			shipWkL_bldr.setSelect(t.ship_wk_cd, t.ship_wk_nm);
			
			dbSelectKey("MSBBL1230_MAM_SHIP_WK_S01", shipWkL, shipWkL_bldr, shipSchdL);
			
			MAM_SHIP_WK_R shipWkR = null;
			for (Upd01_Ship_SchdR shipShcdR : shipSchdL) {
				
				shipWkR = shipWkL.getFirst(Upd01_Ship_SchdR.$ship_wk_cd, shipShcdR.ship_wk_cd());
				
				if (!isNull(shipWkR) && !shipWkR.isEmpty()) {
					shipShcdR.ship_wk_nm(shipWkR.ship_wk_nm());
				}
			}
		}
		/**
		 * 受注納期回答を取得する。
		 */
		protected MCList<MST_SLO_PRMS_R> getSloPrms(String slo_d_no) {
			boolean flg;
			
			MCList<MST_SLO_PRMS_R> sloPrmsL = MCList.create(MST_SLO_PRMS_R.class);
			
			//ヘッダの条件をチェックする
			MST_SLO_D_R sloDR = MST_SLO_D_R.create();
			MST_SLO_D_R t1 = MST_SLO_D_R.create("T");
			MCQueryApiBuilder sloDR_bldr = MCQueryApiBuilder.create(t1);
			MST_SLO_R t2 = MST_SLO_R.create("T3");
			MST_SLO_PRMS_H_R t3 = MST_SLO_PRMS_H_R.create("T7");
			
			sloDR_bldr.setDistinct();
			sloDR_bldr.setSelect(t1.proc_typ);
			sloDR_bldr.addSelect(t1.slo_d_no);
			sloDR_bldr.addInnerJoin(t2, t1.slo_no.eq(t2.slo_no));
			sloDR_bldr.addInnerJoin(t3, t1.slo_d_no.eq(t3.slo_d_no));
			sloDR_bldr.setWhere(t1.can_flg.eq(value(false)));
			sloDR_bldr.addWhereWithAnd(t1.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NO_PICK.value())));
			sloDR_bldr.addWhereWithAnd(t3.edi_prms_flg.eq(value(true)));
			sloDR_bldr.addWhereWithAnd(t2.cst_po_no.isNotNull());
			sloDR_bldr.addWhereWithAnd(t1.slo_d_no.eq(bind("1")), slo_d_no);
			dbSelect("MSBBL1230_MST_SLO_D_S02", sloDR, sloDR_bldr);
			
			//パラメータ行インデックスをキーに出荷予定情報を取得
			if(!sloDR.isEmpty()) {
				for(Upd01_Ship_SchdR r2:up2()) {
					for(Upd01_Slo_PrmsR r3:up3()) {
						if(isSame(r2.param_row_index(),r3.param_row_index()) 
								|| isSame(r2.slo_prms_no(), r3.slo_prms_no())) {
							flg = false;
							MST_SHIP_SCHD_R shipSchdR = MST_SHIP_SCHD_R.create();
							MCQueryApiBuilder shipSchdR_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
							dbSelectKey("MSBBL1230_MST_SHIP_SCHD_S04", shipSchdR, shipSchdR_bldr, r2);
							
							if(!shipSchdR.isEmpty()) {
								// インボイス登録後も納期回答送信ＩＦを作成するとする
								if(shipSchdR.ship_act_qty().eq(0) && !shipSchdR.abort_flg()) {
									if(MAC_SLO_PROC_TYP.isPURC_DDLV(sloDR.getStringNE(MST_SLO_D_R.$proc_typ))) {
										flg = true;
										MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
										MST_SLS_SCHD_R t5 = MST_SLS_SCHD_R.create("T");
										MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(t5);
										slsSchdL_bldr.setWhere(t5.ship_schd_no.eq(bind("1")), r2.ship_schd_no());
										dbSelect("MSBBL1230_MST_SLS_SCHD_S01", slsSchdL, slsSchdL_bldr);
										for(MST_SLS_SCHD_R row : slsSchdL) {
											if(!isNull(row.purc_act_d_no())) {
												flg = false;
												break;
											}
										}
									}
									else {
										flg = true;
									}
								}
								if(flg) {
									MST_SLO_PRMS_R sloPrmsR = MST_SLO_PRMS_R.create();
									sloPrmsR.setStringNE(MST_SLO_PRMS_R.$slo_prms_no, r3.slo_prms_no());
									sloPrmsL.add(sloPrmsR);
								}
							}
						}
					}
				}
			}
			
			return sloPrmsL;
		}
		protected String[] _sloPrmsUpdCols;
		protected boolean isUpdSloPrms(MCList<Upd01_Slo_PrmsR> up3L) {
			
			if (_sloPrmsUpdCols == null) {
				_sloPrmsUpdCols = new String[] {
						MST_SLO_PRMS_R.$prms_dlv_tm
						, MST_SLO_PRMS_R.$trd_unit_prms_qty
						, MST_SLO_PRMS_R.$prms_rmrks 
				};
			}

			MCIndexKey idxkey = _sloPrmsL.createIndex(MST_SLO_PRMS_R.$slo_prms_no);
			MCList<Upd01_Slo_PrmsR> modSloPrmsL = MCList.create(Upd01_Slo_PrmsR.class);
			MCList<MST_SLO_PRMS_R> oldSloPrmsL = MCList.create(MST_SLO_PRMS_R.class);
			
			for (Upd01_Slo_PrmsR sloPrmsR : up3L) {
				if (sloPrmsR.isStatusModify()) {
					modSloPrmsL.add(sloPrmsR);
					oldSloPrmsL.add(_sloPrmsL.getFirst(idxkey, sloPrmsR.slo_prms_no()));
				}
				else if (sloPrmsR.isStatusDelete() || sloPrmsR.isStatusCreate()) {
					return true;
				}
				
			}
			
			if (!isNull(modSloPrmsL)) {
				modSloPrmsL.sort(Upd01_Slo_PrmsR.$slo_prms_no);
				oldSloPrmsL.sort(MST_SLO_PRMS_R.$slo_prms_no);
				
				if (!isSame(modSloPrmsL.size(), oldSloPrmsL.size())) {
					return true;
				}
				
				for (int i = 0; i < modSloPrmsL.size(); i++) {
					if (!isColSame(modSloPrmsL.get(i), oldSloPrmsL.get(i), _sloPrmsUpdCols)) {
						return true;
					}
				}
			}
			
			return false;
		}
		/**
		 * 受注納期回答ＮＯを設定する。
		 */
		protected void setupSloPrmsNo() {
			
			MCList<ElmArgsR> argsL = MCList.create(ElmArgsR.class);
			for (Upd01_Slo_PrmsR sloPrmsR : up3()) {
				
				if (sloPrmsR.isStatusCreate()) {
					
					ElmArgsR argsR = ElmArgsR.create();
					argsR.bp_cd(_oldSloR.cst_cd());
					argsR.trd_cd(_oldSloR.trd_cd());
					argsR.dpt_cd(_oldSloR.sls_dpt_cd());
					argsR.co_cd(getCo().co_cd());
					argsR.dt(sloPrmsR.prms_dlv_tm());
					argsR.wg_cd(_oldSloR.wg_cd());
					argsR.itm_cd(_oldSloDR.itm_cd());
					argsR.itm_sub1(_oldSloDR.itm_sub1());
					argsR.itm_sub2(_oldSloDR.itm_sub2());
					argsR.itm_sub3(_oldSloDR.itm_sub3());
					argsR.peg_no(sloPrmsR.peg_no());
					argsL.add(argsR);
				}
			}
			
			setNum(MAC_NUM_BIZ_TYP.SLOPRMS, argsL);
			String[] srcCols = {ElmArgsR.$new_no};
			String[] destCols = {Upd01_Slo_PrmsR.$slo_prms_no};
			copyByPegNo(up3(), destCols, argsL, srcCols);
		}
		/**
		 * 受注納期回答ヘッダＮＯを設定する。
		 */
		protected void setSloPrmsHNo() {
			
			if (!up3().statusChangedList().isEmpty()) {
				
				MCList<Upd01_Slo_DR> sloDL =  up1().subList(r->isNull(r.slo_prms_h_no()));
				if(sloDL.size() > 0) {
					
					MCList<ElmArgsR> argsL = MCList.create(ElmArgsR.class);
					
					for (Upd01_Slo_DR dtlR : sloDL) {
						
						ElmArgsR argsR = ElmArgsR.create();
						argsR.bp_cd(_oldSloR.cst_cd());
						argsR.trd_cd(_oldSloR.trd_cd());
						argsR.dpt_cd(_oldSloR.sls_dpt_cd());
						argsR.co_cd(getCo().co_cd());
						argsR.dt(getToday());
						argsR.wg_cd(_oldSloR.wg_cd());
						argsR.peg_no(dtlR.peg_no());
						argsL.add(argsR);
					}
					
					setNum(MAC_NUM_BIZ_TYP.SLOPRMSH, argsL);
					String[] srcCols = {ElmArgsR.$new_no};
					String[] destCols = {Upd01_Slo_DR.$slo_prms_h_no};
					copyByPegNo(up1(), destCols, argsL, srcCols);
				}
			}
		}
		/**
		 * 受注明細に紐づく納期回答をすべて削除したか判断する。
		 * @return すべて削除した場合true
		 */
		protected boolean isCan() {
			MCList<MST_SLO_PRMS_R> prmsL = getSloPrmsL(_oldSloDR.slo_d_no());
			MCList<MST_SLO_PRMS_R> sloPrmsL = MCList.create(MST_SLO_PRMS_R.class);
			MCList<Upd01_Slo_PrmsR> up3L = MCList.create(Upd01_Slo_PrmsR.class);
			MCIndexKey idxkey = prmsL.createIndex(Upd01_Slo_PrmsR.$slo_prms_no, Upd01_Slo_PrmsR.$slo_prms_rev);
			
			for (Upd01_Slo_PrmsR up3R : up3()) {
				
				MST_SLO_PRMS_R prmsR = prmsL.getFirst(idxkey, up3R.slo_prms_no(), up3R.slo_prms_rev());
				
				if (!up3R.isStatusDelete()) {
					if(!isNull(prmsR)){
						sloPrmsL.add(prmsR);
					}
					else {
						up3L.add(up3R);
					}
				}
			}
			
			if (sloPrmsL.subList(MST_SLO_PRMS_R.$can_flg, false).size() != 0) {
				return false;
			}
			if (!isNull(up3L)) {
				return false;
			}
			
			return true;
		}
		
		/**
		 * 受注納期回答キャッシュリスト
		 */
		protected MCList<MST_SLO_PRMS_R> _sloPrmsL = null;
		protected MCIndexKey _sloPrmsKey = null;
		protected void initSloPrmsCache(MCList<Upd01_Slo_PrmsR> up3L) {
			_sloPrmsL = MCList.create(MST_SLO_PRMS_R.class);
			MST_SLO_PRMS_R t = MST_SLO_PRMS_R.create("T");
			MCQueryApiBuilder sloPrmsBldr = MCQueryApiBuilder.create(t);
			sloPrmsBldr.setWhere(t.slo_prms_no.eq(bind("slo_prms_no")));
			sloPrmsBldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBBL1230_MST_SLO_PRMS_S01", _sloPrmsL, sloPrmsBldr, up3L);
			_sloPrmsKey = _sloPrmsL.createIndex(MST_SLO_PRMS_R.$slo_prms_no);
		}
	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 納期回答書を発行する<br>
	 */
	public class Prnt01 extends MSBBL_SlsDlvDtAdjstReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCList<SloPrms_Prnt01_HdrR> hdrL = MCList.create(SloPrms_Prnt01_HdrR.class);
			for (Prnt01_Slo_PrmsR r : up1()) {
				SloPrms_Prnt01_HdrR hdrR = SloPrms_Prnt01_HdrR.create();
				copy(hdrR, r, createMap_SloPrms_Prnt01_HdrR_Prnt01_Slo_PrmsR());
				hdrR.slo_no(up0().slo_no());
				hdrL.add(hdrR);
			}
			
			callSloPrmsPrntServicePrnt01(hdrL);
		}
	}
	
	/**
	 * 納期回答情報を取得する。
	 * @param sloDNo 受注ＮＯ
	 * @return
	 */
	protected MCList<MST_SLO_PRMS_R> getSloPrmsL(String sloDNo) {

		MCList<MST_SLO_PRMS_R> prmsL = MCList.create(MST_SLO_PRMS_R.class);
		MST_SLO_PRMS_R t = MST_SLO_PRMS_R.create("T");
		MCQueryApiBuilder prmsL_bldr = MCQueryApiBuilder.create(t);
		prmsL_bldr.setWhere(t.slo_d_no.eq(bind("1")), sloDNo);
		prmsL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelect("MSBBL1230_MST_SLO_PRMS_S02", prmsL, prmsL_bldr);
		
		return prmsL;
	}
	
	/**
	 * 取引単位CD,取引単位数を元に、基準単位数を取得する
	 * @param trd_unit_qty
	 * @param trd_unit_cd
	 * @param itm_cd
	 * @param itm_sub1
	 * @param itm_sub2
	 * @param itm_sub3
	 * @return
	 */
	protected MCNumber getBaseUnitQty(MCNumber trd_unit_qty, String trd_unit_cd,
			String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3) {
		MAVM_ITM_UNIT_R itmUnitR = MAVM_ITM_UNIT_R.create();
		MCQueryApiBuilder itmUnitR_bldr = MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T"));
		itmUnitR.itm_cd(itm_cd);
		itmUnitR.itm_sub1(itm_sub1);
		itmUnitR.itm_sub2(itm_sub2);
		itmUnitR.itm_sub3(itm_sub3);
		itmUnitR.unit_cd(trd_unit_cd);
		dbSelectKey("MSBBL1230_MAVM_ITM_UNIT_S02", itmUnitR, itmUnitR_bldr, itmUnitR);
		//基準単位の小数部有効桁数、基準単位の単位換算端数処理区分の取得
		MAVM_ITM_UNIT_R itmBaseUnitR = MAVM_ITM_UNIT_R.create();
		MAVM_ITM_UNIT_R t2 = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder itmBaseUnitR_bldr = MCQueryApiBuilder.create(t2);
		MAM_ITM_R t3 = MAM_ITM_R.create("T1");
		itmBaseUnitR_bldr.addInnerJoin(t3, bracket( t2.itm_cd.eq(t3.itm_cd) .and(t2.itm_sub1.eq(t3.itm_sub1)) .and(t2.itm_sub2.eq(t3.itm_sub2)) .and(t2.itm_sub3.eq(t3.itm_sub3)) .and(t2.unit_cd.eq(t3.unit_cd))));
		itmBaseUnitR_bldr.setWhere(t3.itm_cd.eq(bind("1")), itm_cd);
		itmBaseUnitR_bldr.addWhereWithAnd(t3.itm_sub1.eq(bind("1")), itm_sub1);
		itmBaseUnitR_bldr.addWhereWithAnd(t3.itm_sub2.eq(bind("1")), itm_sub2);
		itmBaseUnitR_bldr.addWhereWithAnd(t3.itm_sub3.eq(bind("1")), itm_sub3);
		dbSelect("MSBBL1230_MAVM_ITM_UNIT_S03", itmBaseUnitR, itmBaseUnitR_bldr);
		MCNumber base_unit_qty = convToBaseUnit(trd_unit_qty,
				itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
				itmBaseUnitR.dec_place(), itmBaseUnitR.rnd_typ());
		return base_unit_qty;
	}
	
	/**
	 * 納期回答書発行サービスの帳票出力処理を呼び出す。
	 */
	protected void callSloPrmsPrntServicePrnt01(MCList<SloPrms_Prnt01_HdrR> hdrL) {
		
		MSBBL_SloPrmsPrntService.SloPrms_Prnt01 ope = MSBBL_SloPrmsPrntService.crtSloPrms_Prnt01();
		ope.up0().addAll(hdrL);
		ope.exec();
	}
	
	protected Map_MSW_SHIP_SCHD_DT_CALC_R_MST_SLO_D_R<MSW_SHIP_SCHD_DT_CALC_R, MST_SLO_D_R, Upd01_Ship_SchdR> createMap_MSW_SHIP_SCHD_DT_CALC_R_MST_SLO_D_R() {
		return new Map_MSW_SHIP_SCHD_DT_CALC_R_MST_SLO_D_R<MSW_SHIP_SCHD_DT_CALC_R, MST_SLO_D_R, Upd01_Ship_SchdR>();
	}

	public class Map_MSW_SHIP_SCHD_DT_CALC_R_MST_SLO_D_R<D extends MSW_SHIP_SCHD_DT_CALC_R, S extends MST_SLO_D_R, W extends Upd01_Ship_SchdR>
			extends MAUCC_RowMapperWith<D, S, W> {
		protected W _dtlR;

		@Override
		public void setWith(W dtlR) {
			this._dtlR = dtlR;
		}
		
		@Override
		public void valueCopy(D dest, S src) {
			dest.peg_no(_dtlR.peg_no());  //紐付けＮＯ
			if (!isNull(src.tdlv_cd()) || !isNull(_dtlR.tdlv_cd())) {
				dest.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.TDLV.value());  //送付先識別区分
				dest.ship_to_id_cd(nvl(_dtlR.tdlv_cd(), src.tdlv_cd()));  //送付先識別ＣＤ
				dest.ship_to_lg_grp_cd(nvl(_dtlR.tdlv_lg_grp_cd(), src.tdlv_lg_grp_cd()));  //出荷先物流グループＣＤ
			}
			else {
				dest.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.DLV.value());  //送付先識別区分
				dest.ship_to_id_cd(nvl(_dtlR.dlv_cd(), src.dlv_cd()));  //送付先識別ＣＤ
				dest.ship_to_lg_grp_cd(nvl(_dtlR.dlv_lg_grp_cd(), src.dlv_lg_grp_cd()));  //出荷先物流グループＣＤ
			}
			dest.ship_fr_lg_grp_cd(_dtlR.ship_fr_lg_grp_cd());  //出荷元物流グループＣＤ
			dest.ship_term_cd(_dtlR.ship_term_cd());  //出荷条件ＣＤ
			dest.dlv_rqst_tm(_dtlR.pd_inst_dlv_tm());  //納入希望日時
			dest.dlv_day_week_typ(nvl(_dtlR.dlv_day_week_typ(), src.dlv_day_week_typ()));  //着曜日
			dest.ship_rqst_tm(_dtlR.ship_rqst_tm());  //出荷希望日時			
			dest.ship_inst_typ(src.ship_inst_typ());  //出荷指図区分			
			dest.cl_time_chk_flg(true);  //締時間チェックＦＬＧ
			dest.ship_dt_chk_flg(true);  //出荷日チェックＦＬＧ
			dest.ship_cal_cd_chk_flg(true);
			dest.early_ship_dt_add_days_chk_flg(true);
		}
	}

	protected Map_MST_SLO_PRMS_R_Upd01_Slo_PrmsR<MST_SLO_PRMS_R, Upd01_Slo_PrmsR, MST_SLO_R> createMap_MST_SLO_PRMS_R_Upd01_Slo_PrmsR() {
		return new Map_MST_SLO_PRMS_R_Upd01_Slo_PrmsR<MST_SLO_PRMS_R, Upd01_Slo_PrmsR, MST_SLO_R>();
	}

	public class Map_MST_SLO_PRMS_R_Upd01_Slo_PrmsR<D extends MST_SLO_PRMS_R, S extends Upd01_Slo_PrmsR, W extends MST_SLO_R>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {
			dest.slo_prms_no(src.slo_prms_no()); //受注納期回答ＮＯ
			dest.slo_prms_rev(src.slo_prms_rev()); //受注納期回答改訂番号
			dest.slo_no(src.slo_no()); //受注ＮＯ
			dest.slo_d_no(src.slo_d_no()); //受注明細ＮＯ
			dest.dlv_inst_rcpt_no(src.dlv_inst_rcpt_no()); //納入指示受領ＮＯ
			dest.prms_dlv_tm(src.prms_dlv_tm()); //回答納入日時
			dest.trd_unit_prms_qty(src.trd_unit_prms_qty()); //取引単位回答数量
			dest.base_unit_prms_qty(src.base_unit_prms_qty()); //基準単位回答数量
			dest.prms_rmrks(src.prms_rmrks()); //回答備考
			dest.intr_rmrks(src.intr_rmrks()); //内部備考
			dest.sub_char1(src.sub_char1()); //予備１
			dest.sub_char2(src.sub_char2()); //予備２
			dest.sub_char3(src.sub_char3()); //予備３
		}
	}

	protected Map_MSW_ALLOC_LOC_MAP_R_MST_SLO_D_R<MSW_ALLOC_LOC_MAP_R, MST_SLO_D_R, MST_SLO_R> createMap_MSW_ALLOC_LOC_MAP_R_MST_SLO_D_R() {
		return new Map_MSW_ALLOC_LOC_MAP_R_MST_SLO_D_R<MSW_ALLOC_LOC_MAP_R, MST_SLO_D_R, MST_SLO_R>();
	}

	public class Map_MSW_ALLOC_LOC_MAP_R_MST_SLO_D_R<D extends MSW_ALLOC_LOC_MAP_R, S extends MST_SLO_D_R, W extends MST_SLO_R>
			extends MCRowMapper<D, S> {

		@Override
		public void valueCopy(D dest, S src) {
			dest.itm_cd(src.itm_cd());
			dest.itm_sub1(src.itm_sub1());
			dest.itm_sub2(src.itm_sub2());
			dest.itm_sub3(src.itm_sub3());
			dest.gi_loc_cd(src.loc_cd());
			dest.gi_lg_grp_cd(src.ship_lg_grp_cd());
			dest.alloc_grp_cd(src.alloc_grp_cd());
			dest.alloc_scope_typ(src.alloc_scope_typ()); //引当範囲区分
		}
	}

	/**
	 * 品目の取引単位は荷姿単位かを調べる
	 * @param itmCd
	 * @param itmSub1
	 * @param itmSub2
	 * @param itmSub3
	 * @param trdUnitCd
	 * @return
	 */
	protected boolean isPack(String itmCd, String itmSub1, String itmSub2,
			String itmSub3, String trdUnitCd) {
		MAVM_ITM_UNIT_R itmUnitR = MAVM_ITM_UNIT_R.create();
		MCQueryApiBuilder itmUnitR_bldr = MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T"));
		itmUnitR.itm_cd(itmCd);
		itmUnitR.itm_sub1(itmSub1);
		itmUnitR.itm_sub2(itmSub2);
		itmUnitR.itm_sub3(itmSub3);
		itmUnitR.unit_cd(trdUnitCd);
		dbSelectKey("MSBBL1230_MAVM_ITM_UNIT_S04", itmUnitR, itmUnitR_bldr, itmUnitR);
		return itmUnitR.pack_flg();
	}
	
	/**
	 * 品目単位を取得する。
	 * @param itmCd 品目ＣＤ
	 * @param itmSub1 枝番１
	 * @param itmSub2 枝番２
	 * @param itmSub3 枝番３
	 * @param unitCd 単位ＣＤ 
	 * @return 品目単位マスタ
	 */
	protected MAVM_ITM_UNIT_R getItmUnit(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
		
		MAVM_ITM_UNIT_R itmUnitR = MAVM_ITM_UNIT_R.create();
		MCQueryApiBuilder itmUnitR_bldr = MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T"));
		itmUnitR.itm_cd(itmCd);
		itmUnitR.itm_sub1(itmSub1);
		itmUnitR.itm_sub2(itmSub2);
		itmUnitR.itm_sub3(itmSub3);
		itmUnitR.unit_cd(unitCd);
		
		dbSelectKey("MSBBL1230_MAVM_ITM_UNIT_S05", itmUnitR, itmUnitR_bldr, itmUnitR);
		
		return itmUnitR;
	}

	protected Map_Srch_TgtR_MST_SLO_D_R<Srch_TgtR, MST_SLO_D_R, Upd01_Ship_SchdR> createMap_Srch_TgtR_MST_SLO_D_R() {
		return new Map_Srch_TgtR_MST_SLO_D_R<Srch_TgtR, MST_SLO_D_R, Upd01_Ship_SchdR>();
	}

	public class Map_Srch_TgtR_MST_SLO_D_R<D extends Srch_TgtR, S extends MST_SLO_D_R, W extends Upd01_Ship_SchdR>
			extends MAUCC_RowMapperWith<D, S, W> {
		protected W _dtlR;

		@Override
		public void setWith(W dtl) {
			this._dtlR = dtl;
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.peg_no(_dtlR.peg_no()); //紐付けＮＯ
			dest.inpt_schd_dt(null); //投入予定日
			
			if (src.sls_cststk_flg()) {
				// 預り売上の場合は、売上予定日を出庫予定日とする。
				dest.gi_schd_dt(src.sls_schd_dt());
			}
			else {
				dest.gi_schd_dt(_dtlR.ship_schd_tm().startTimeOfDay()); //出庫予定日
			}
			dest.gr_schd_dt(_dtlR.dlv_schd_tm().startTimeOfDay()); //入庫予定日
			dest.itm_cd(src.itm_cd()); //品目ＣＤ
			dest.itm_sub1(src.itm_sub1()); //枝番１
			dest.itm_sub2(src.itm_sub2()); //枝番２
			dest.itm_sub3(src.itm_sub3()); //枝番３
			dest.ver_no(src.ver_no()); //版ＮＯ			
			if (!isNull(src.tdlv_cd()) || !isNull(_dtlR.tdlv_cd())) {
				dest.dlv_lg_grp_cd(nvl(_dtlR.tdlv_lg_grp_cd(), src.tdlv_lg_grp_cd()));
			}
			else {
				dest.dlv_lg_grp_cd(nvl(_dtlR.dlv_lg_grp_cd(), src.dlv_lg_grp_cd()));
			}
			dest.alloc_grp_cd(src.alloc_grp_cd()); //総量引当場所グループＣＤ
			dest.gi_lg_grp_cd(_dtlR.ship_fr_lg_grp_cd()); //出庫物流グループ
			dest.gi_loc_cd(src.loc_cd()); //出庫場所ＣＤ
			dest.gi_str_ln_cd(src.str_ln_cd()); //出庫棚・ラインＣＤ
			dest.quality_typ(MAC_QUALITY_TYP.GOOD.value()); //良品区分
			dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value()); //在庫識別区分
			dest.stk_bp_cd(MAC_STR.NULL_VAL.value()); //在庫取引先ＣＤ
			dest.gd_cd(src.gd_cd()); //格付ＣＤ
			dest.lot_no(src.lot_no()); //ロットＮＯ
			dest.sublot_no(src.sublot_no()); //サブロットＮＯ
			dest.sno1(src.sno1()); //手配ＮＯ１
			dest.sno1_null_flg(src.sno1_null_flg()); //手配ＮＯ１無し可ＦＬＧ
			dest.sno2(src.sno2()); //手配ＮＯ２
			dest.sno2_null_flg(src.sno2_null_flg()); //手配ＮＯ２無し可ＦＬＧ
			dest.sno3(src.sno3()); //手配ＮＯ３
			dest.sno3_null_flg(src.sno3_null_flg()); //手配ＮＯ３無し可ＦＬＧ
			dest.sno4(src.sno4()); //手配ＮＯ４
			dest.sno4_null_flg(src.sno4_null_flg()); //手配ＮＯ４無し可ＦＬＧ
			//荷姿かどうかを判断
			if (isPack(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3(), src.trd_unit_cd())) {
				
				dest.pack_unit_cd(_dtlR.trd_unit_cd()); //荷姿単位ＣＤ
			}
			dest.base_unit_cd(_dtlR.base_unit_cd()); //基準単位ＣＤ
			dest.cont_qty(null); //有効成分
			dest.not_lot_fix_flg(isNull(src.lot_no()) ? true : false); //ロット指定なしＦＬＧ
			dest.not_lot_mix_flg(src.not_lot_mix_flg()); //ロット混在不可ＦＬＧ
			dest.not_sublot_mix_flg(src.not_sublot_mix_flg()); //サブロット混在不可ＦＬＧ
			dest.vld_dt_fr(_dtlR.valid_dt_fr()); //有効期限ＦＲＯＭ
			dest.vld_dt_fr_grp(_dtlR.valid_dt_fr_grp()); //有効期限ＦＲＯＭ継承Ｇ
			dest.vld_dt_to(_dtlR.valid_dt_to()); //有効期限ＴＯ
			if (MAC_TRD_PTN_TYP.isSLS(_oldSloR.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value()); //受払予定区分
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SLO.value()); //受払予定状況区分
			}
			else {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.SHIP_OUT.value()); //受払予定区分
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value()); //受払予定状況区分
			}
			dest.stk_alloc_flg(false); //在庫優先引当ＦＬＧ
			dest.alloc_scope_typ(src.alloc_scope_typ()); //引当範囲区分
			dest.ship_term_cd(src.ship_term_cd()); //出荷条件ＣＤ
		}
	}

	protected Map_ShipSchd_DtlR_MST_SLO_D_R<ShipSchd_DtlR, MST_SLO_D_R, Upd01_Ship_SchdR> createMap_ShipSchd_DtlR_MST_SLO_D_R() {
		return new Map_ShipSchd_DtlR_MST_SLO_D_R<ShipSchd_DtlR, MST_SLO_D_R, Upd01_Ship_SchdR>();
	}

	public class Map_ShipSchd_DtlR_MST_SLO_D_R<D extends ShipSchd_DtlR, S extends MST_SLO_D_R, W extends Upd01_Ship_SchdR>
			extends MAUCC_RowMapperWith<D, S, W> {
		protected W _dtlR;

		@Override
		public void setWith(W dtlR) {
			this._dtlR = dtlR;
		}

		@Override
		public void valueCopy(D dest, S src) {
			
			dest.peg_no(_dtlR.peg_no()); //データ紐付けＮＯ
			dest.data_crud_typ(_dtlR.data_crud_typ()); //データ更新区分
			dest.ship_schd_no(_dtlR.ship_schd_no()); //出荷予定ＮＯ
			dest.ship_pr_no(_dtlR.ship_pr_no()); //出荷進捗ＮＯ
			dest.abort_flg(_dtlR.abort_flg()); //打切ＦＬＧ
			dest.ship_inst_d_no(null); //出荷指図明細ＮＯ
			dest.dlv_inst_rcpt_no(_dtlR.dlv_inst_rcpt_no()); //納入指示受領ＮＯ
			dest.slo_prms_no(_dtlR.slo_prms_no()); //受注納期回答ＮＯ
			dest.sls_act_d_no(_dtlR.sls_act_d_no()); //売上実績明細ＮＯ
			dest.ship_fr_lg_grp_cd(_dtlR.ship_fr_lg_grp_cd()); //出荷元物流グループＣＤ
			dest.wg_cd(_dtlR.ship_fr_lg_grp_wg_cd());
			dest.pd_inst_dlv_tm(_dtlR.pd_inst_dlv_tm()); //納品依頼日時
			dest.ship_rqst_tm(_dtlR.ship_rqst_tm()); //出荷希望日時
			dest.ship_schd_tm(_dtlR.ship_schd_tm()); //出荷予定日時
			dest.dlv_schd_tm(_dtlR.dlv_schd_tm()); //納品予定日時
			dest.ship_term_cd(_dtlR.ship_term_cd()); //出荷条件ＣＤ
			dest.ship_wk_cd(_dtlR.ship_wk_cd()); //出荷作業ＣＤ
			dest.itm_cd(src.itm_cd()); //品目ＣＤ
			dest.itm_sub1(src.itm_sub1()); //枝番１
			dest.itm_sub2(src.itm_sub2()); //枝番２
			dest.itm_sub3(src.itm_sub3()); //枝番３
			dest.itm_nm(src.itm_nm()); //品名
			dest.iv_itm_nm(src.iv_itm_nm()); //インボイス表記用品名
			dest.sundry_itm_flg(src.sundry_itm_flg()); //諸口品ＦＬＧ
			dest.sno1(src.sno1()); //手配ＮＯ１
			dest.sno1_null_flg(src.sno1_null_flg()); //手配ＮＯ１無し可ＦＬＧ
			dest.sno2(src.sno2()); //手配ＮＯ２
			dest.sno2_null_flg(src.sno2_null_flg()); //手配ＮＯ２無し可ＦＬＧ
			dest.sno3(src.sno3()); //手配ＮＯ３
			dest.sno3_null_flg(src.sno3_null_flg()); //手配ＮＯ３無し可ＦＬＧ
			dest.sno4(src.sno4()); //手配ＮＯ４
			dest.sno4_null_flg(src.sno4_null_flg()); //手配ＮＯ４無し可ＦＬＧ
			dest.lot_no(src.lot_no()); //ロットＮＯ
			dest.sublot_no(src.sublot_no()); //サブロットＮＯ
			dest.ver_no(src.ver_no()); //版ＮＯ			
			dest.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value()); //在庫着荷先ＣＤ
			dest.gd_cd(src.gd_cd()); //格付ＣＤ
			dest.quality_typ(MAC_QUALITY_TYP.GOOD.value()); //良品区分
			dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value()); //在庫識別区分
			dest.stk_bp_cd(MAC_STR.NULL_VAL.value()); //在庫取引先ＣＤ
			dest.trd_unit_qty(_dtlR.trd_unit_qty()); //取引単位数量
			dest.trd_unit_cd(_dtlR.trd_unit_cd()); //取引単位ＣＤ
			dest.base_unit_qty(_dtlR.base_unit_qty()); //基準単位数量
			dest.base_unit_cd(_dtlR.base_unit_cd()); //基準単位ＣＤ
			dest.abort_flg(_dtlR.abort_flg()); //打切ＦＬＧ
			dest.fix_flg(_dtlR.fix_flg()); //確定ＦＬＧ		
			dest.ship_block_flg(_dtlR.ship_block_flg());
			dest.inst_bndl_flg(false); //指図まとめＦＬＧ
			dest.not_lot_mix_flg(src.not_lot_mix_flg()); //ロット混在ＦＬＧ
			dest.not_sublot_mix_flg(src.not_sublot_mix_flg()); //サブロット混在ＦＬＧ
			dest.vld_dt_fr(_dtlR.valid_dt_fr()); //有効期限ＦＲＯＭ
			dest.vld_dt_to(_dtlR.valid_dt_to()); //有効期限ＴＯ
			dest.re_ship_schd_flg(_dtlR.re_ship_schd_flg()); //再出荷予定ＦＬＧ
			dest.intr_rmrks(src.intr_rmrks()); //内部備考
			dest.trd_rmrks(null); //取引備考
			dest.trd_d_rmrks(_dtlR.trd_d_rmrks()); //取引明細備考
			dest.ship_cnt_rmrks(_dtlR.ship_cnt_rmrks()); //出荷連絡備考
			dest.dlv_upd_flg(true);
			dest.dlv_cd(_dtlR.dlv_cd());
			dest.dlv_sundry_flg(_dtlR.dlv_sundry_flg());
			dest.dlv_nm(_dtlR.dlv_nm());
			dest.dlv_cntct_dpt(_dtlR.dlv_cntct_dpt());
			dest.dlv_cntct_psn(_dtlR.dlv_cntct_psn());
			dest.dlv_zip_cd(_dtlR.dlv_zip_cd());
			dest.dlv_addr1(_dtlR.dlv_addr1());
			dest.dlv_addr2(_dtlR.dlv_addr2());
			dest.dlv_addr3(_dtlR.dlv_addr3());
			dest.dlv_addr4(_dtlR.dlv_addr4());
			dest.dlv_tel(_dtlR.dlv_tel());
			dest.dlv_fax(_dtlR.dlv_fax());
			dest.dlv_lg_grp_cd(_dtlR.dlv_lg_grp_cd());
			dest.pri_prnt_flg(_dtlR.pri_prnt_flg());
			dest.tdlv_cd(_dtlR.tdlv_cd());
			dest.tdlv_sundry_flg(_dtlR.tdlv_sundry_flg());
			dest.tdlv_nm(_dtlR.tdlv_nm());
			dest.via_dlv_typ(_dtlR.via_dlv_typ());
			dest.tdlv_cntct_dpt(_dtlR.tdlv_cntct_dpt());
			dest.tdlv_cntct_psn(_dtlR.tdlv_cntct_psn());
			dest.tdlv_zip_cd(_dtlR.tdlv_zip_cd());
			dest.tdlv_addr1(_dtlR.tdlv_addr1());
			dest.tdlv_addr2(_dtlR.tdlv_addr2());
			dest.tdlv_addr3(_dtlR.tdlv_addr3());
			dest.tdlv_addr4(_dtlR.tdlv_addr4());
			dest.tdlv_tel(_dtlR.tdlv_tel());
			dest.tdlv_fax(_dtlR.tdlv_fax());
			dest.tdlv_lg_grp_cd(_dtlR.tdlv_lg_grp_cd());
			dest.dlv_day_week_typ(_dtlR.dlv_day_week_typ());
			dest.sub_char1(_dtlR.sub_char1()); //予備１
			dest.sub_char2(_dtlR.sub_char2()); //予備２
			dest.sub_char3(_dtlR.sub_char3()); //予備３
			dest.inst_qty(null); //指図数量（基準単位）
			dest.inst_unit_cd(null); //指図単位ＣＤ
			dest.inst_ship_schd_tm(null); //指図出荷予定日時
			dest.inst_dlv_schd_tm(null); //指図納品予定日時
			dest.not_dt_calc_flg(_dtlR.not_dt_calc_flg());
			dest.ship_schd_split_flg(false); //出荷予定分割ＦＬＧ
		}
	}
			
	protected Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_R<Alloc_RsltR,MST_SHIP_ALLOC_STS_R> createMap_Alloc_RsltR_MST_SHIP_ALLOC_STS_R() {
		return new Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_R<Alloc_RsltR, MST_SHIP_ALLOC_STS_R>();
	}

	public class Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_R<D extends Alloc_RsltR, S extends MST_SHIP_ALLOC_STS_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			
			addColumnPathMap(Alloc_RsltR.$stk_loc_cd, MST_SHIP_ALLOC_STS_R.$ship_loc_cd);
			addColumnPathMap(Alloc_RsltR.$stk_str_ln_cd, MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd);
			addColumnPathMap(Alloc_RsltR.$quality_typ, MST_SHIP_ALLOC_STS_R.$quality_typ);
			addColumnPathMap(Alloc_RsltR.$stk_insp_typ, MST_SHIP_ALLOC_STS_R.$stk_insp_typ);
			addColumnPathMap(Alloc_RsltR.$stk_id_typ, MST_SHIP_ALLOC_STS_R.$stk_id_typ);
			addColumnPathMap(Alloc_RsltR.$stk_bp_cd, MST_SHIP_ALLOC_STS_R.$stk_bp_cd);
			addColumnPathMap(Alloc_RsltR.$gd_cd, MST_SHIP_ALLOC_STS_R.$gd_cd);
			addColumnPathMap(Alloc_RsltR.$lot_no, MST_SHIP_ALLOC_STS_R.$lot_no);
			addColumnPathMap(Alloc_RsltR.$sublot_no, MST_SHIP_ALLOC_STS_R.$sublot_no);
			addColumnPathMap(Alloc_RsltR.$sno1, MST_SHIP_ALLOC_STS_R.$sno1);
			addColumnPathMap(Alloc_RsltR.$sno2, MST_SHIP_ALLOC_STS_R.$sno2);
			addColumnPathMap(Alloc_RsltR.$sno3, MST_SHIP_ALLOC_STS_R.$sno3);
			addColumnPathMap(Alloc_RsltR.$sno4, MST_SHIP_ALLOC_STS_R.$sno4);
			addColumnPathMap(Alloc_RsltR.$ver_no, MST_SHIP_ALLOC_STS_R.$ver_no);
			addColumnPathMap(Alloc_RsltR.$pack_unit_cd, MST_SHIP_ALLOC_STS_R.$pack_unit_cd);
			addColumnPathMap(Alloc_RsltR.$pack_unit_qty, MST_SHIP_ALLOC_STS_R.$pack_unit_qty);
			addColumnPathMap(Alloc_RsltR.$base_unit_cd, MST_SHIP_ALLOC_STS_R.$base_unit_cd);
			addColumnPathMap(Alloc_RsltR.$base_unit_qty, MST_SHIP_ALLOC_STS_R.$base_unit_qty);
			addColumnPathMap(Alloc_RsltR.$vld_dt_fr, MST_SHIP_ALLOC_STS_R.$vld_dt_fr);
			addColumnPathMap(Alloc_RsltR.$vld_dt_to, MST_SHIP_ALLOC_STS_R.$vld_dt_to);
			addColumnPathMap(Alloc_RsltR.$alloc_flg, MST_SHIP_ALLOC_STS_R.$alloc_flg);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.stk_lg_grp_cd(src.getStringNE("ship_fr_lg_grp_cd"));
		}
	}
	
	protected Map_SloPrms_Prnt01_HdrR_Upd01_Slo_PrmsR<SloPrms_Prnt01_HdrR,Upd01_Slo_PrmsR> createMap_SloPrms_Prnt01_HdrR_Upd01_Slo_PrmsR() {
		return new Map_SloPrms_Prnt01_HdrR_Upd01_Slo_PrmsR<SloPrms_Prnt01_HdrR, Upd01_Slo_PrmsR>();
	}
	
	public class Map_SloPrms_Prnt01_HdrR_Upd01_Slo_PrmsR<D extends SloPrms_Prnt01_HdrR, S extends Upd01_Slo_PrmsR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SloPrms_Prnt01_HdrR.$slo_prms_h_no, Upd01_Slo_PrmsR.$slo_prms_h_no);
			addColumnPathMap(SloPrms_Prnt01_HdrR.$slo_prms_rev, Upd01_Slo_PrmsR.$slo_prms_rev);
			addColumnPathMap(SloPrms_Prnt01_HdrR.$slo_d_no, Upd01_Slo_PrmsR.$slo_d_no);
			addColumnPathMap(SloPrms_Prnt01_HdrR.$slo_no, Upd01_Slo_PrmsR.$slo_no);
			addColumnPathMap(SloPrms_Prnt01_HdrR.$err_flg, Upd01_Slo_PrmsR.$err_flg);
		}
	}
	
	protected Map_SloPrms_Prnt01_HdrR_Prnt01_Slo_PrmsR<SloPrms_Prnt01_HdrR,Prnt01_Slo_PrmsR> createMap_SloPrms_Prnt01_HdrR_Prnt01_Slo_PrmsR() {
		return new Map_SloPrms_Prnt01_HdrR_Prnt01_Slo_PrmsR<SloPrms_Prnt01_HdrR, Prnt01_Slo_PrmsR>();
	}
	
	public class Map_SloPrms_Prnt01_HdrR_Prnt01_Slo_PrmsR<D extends SloPrms_Prnt01_HdrR, S extends Prnt01_Slo_PrmsR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SloPrms_Prnt01_HdrR.$slo_prms_h_no, Prnt01_Slo_PrmsR.$slo_prms_h_no);
			addColumnPathMap(SloPrms_Prnt01_HdrR.$slo_prms_rev, Prnt01_Slo_PrmsR.$slo_prms_rev);
			addColumnPathMap(SloPrms_Prnt01_HdrR.$slo_d_no, Prnt01_Slo_PrmsR.$slo_d_no);
		}
	}
	
	/**
	 * RevUpd01オペレーション.<p>
	 *
	 * 受注納期回答改訂履歴テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	public class RevUpd01 extends MSBBL_SlsDlvDtAdjstReg_MC_A.RevUpd01 {

		MCList<MST_SLO_PRMS_R> _dCurrentL = MCList.create(MST_SLO_PRMS_R.class);
		MCList<MST_SLO_PRMS_P_R> _dRevL = MCList.create(MST_SLO_PRMS_P_R.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			wkInsert();
			selectCurrent();
			revisionInsOrUpd();
		}

		/**
		 * 上り電文の項目を本体・改訂履歴明細のワークテーブルに設定
		 */
		protected void wkInsert() {
			MCList<MST_SLO_PRMS_R> wkL = MCList.create(MST_SLO_PRMS_R.class);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_SLO_PRMS_R wkR = MST_SLO_PRMS_R.create();
				wkR.slo_prms_no(r.rev_data_src_no());
				wkR.slo_prms_rev(r.rev_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SLO_PRMS_R.create("T"));
			dbWkDelete("MSBBL1230_MSW_SLO_PRMS_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBBL1230_MSW_SLO_PRMS_I01",
					wkL.groupBy(wkL_bldr.getBaseDbc().getKeyColumn()), MCQueryApiBuilder.create(MST_SLO_PRMS_R.create("T")).getBaseDbc());
			
			MCList<MST_SLO_PRMS_P_R> wkpL = MCList.create(MST_SLO_PRMS_P_R.class);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_SLO_PRMS_P_R wkpR = MST_SLO_PRMS_P_R.create();
				wkpR.slo_prms_no(r.rev_data_src_no());
				wkpR.slo_prms_rev(r.rev_no());
				wkpL.add(wkpR);
			}
			MCQueryApiBuilder wkpL_bldr = MCQueryApiBuilder.create(MST_SLO_PRMS_P_R.create("T"));
			dbWkDelete("MSBBL1230_MSW_SLO_PRMS_P_D01", wkpL_bldr.getBaseDbc());
			dbWkInsert("MSBBL1230_MSW_SLO_PRMS_P_I01",
					wkpL.groupBy(wkpL_bldr.getBaseDbc().getKeyColumn()), MCQueryApiBuilder.create(MST_SLO_PRMS_P_R.create("T")).getBaseDbc());
		}

		/**
		 * 本体テーブルと改訂履歴テーブルからリストを取得
		 */
		protected void selectCurrent() {
			MST_SLO_PRMS_R t1 = MST_SLO_PRMS_R.create("T");
			MCQueryApiBuilder dCurrentL_bldr = MCQueryApiBuilder.create(t1);
			MSW_SLO_PRMS_KEY_R w1 = MSW_SLO_PRMS_KEY_R.create("W");
			dCurrentL_bldr.addInnerJoin(w1, bracket( t1.slo_prms_no.eq(w1.slo_prms_no)));
			dbSelect("MSBBL1230_MST_SLO_PRMS_S03", _dCurrentL, dCurrentL_bldr);

			MST_SLO_PRMS_P_R t2 = MST_SLO_PRMS_P_R.create("T");
			MCQueryApiBuilder dRevL_bldr = MCQueryApiBuilder.create(t2);
			MSW_SLO_PRMS_P_KEY_R w2 = MSW_SLO_PRMS_P_KEY_R.create("W");
			dRevL_bldr.addInnerJoin(w2, bracket( t2.slo_prms_no.eq(w2.slo_prms_no) .and(t2.slo_prms_rev.eq(w2.slo_prms_rev))));
			dbSelect("MSBBL1230_MST_SLO_PRMS_P_S01", _dRevL, dRevL_bldr);
		}

		/**
		 * 本番テーブルのデータを元に、改訂履歴テーブルを追加または更新する。
		 */
		protected void revisionInsOrUpd() {
			// 明細の改訂履歴テーブルを追加または更新する。
			MCIndexKey dRevIdx = _dRevL.createIndex(MST_SLO_PRMS_P_R.$slo_prms_no, MST_SLO_PRMS_P_R.$slo_prms_rev);
			MCList<MST_SLO_PRMS_P_R> dUpd = MCList.create(MST_SLO_PRMS_P_R.class);
			MCList<MST_SLO_PRMS_P_R> dIns = MCList.create(MST_SLO_PRMS_P_R.class);

			for (MST_SLO_PRMS_R dcurrentR : _dCurrentL) {
				MST_SLO_PRMS_P_R tempRevR = MST_SLO_PRMS_P_R.create();
				tempRevR.setByName(dcurrentR);
				if (_dRevL == null ||isNull(_dRevL.getFirst(dRevIdx, tempRevR.slo_prms_no(), tempRevR.slo_prms_rev()))) {
					dIns.add(tempRevR);
				}
				else {
					dUpd.add(tempRevR);
				}
			}
			if (!isNull(dIns)) {
				MCQueryApiBuilder dIns_bldr = MCQueryApiBuilder.create(MST_SLO_PRMS_P_R.create("T"));
				dbInsert("MSBBL1230_MST_SLO_PRMS_P_I01", dIns, dIns_bldr);
			}
			if (!isNull(dUpd)) {
				MCQueryApiBuilder dUpd_bldr = MCQueryApiBuilder.create(MST_SLO_PRMS_P_R.create("T"));
				dUpd_bldr.removeSet(dUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBBL1230_MST_SLO_PRMS_P_U01", dUpd, dUpd_bldr);
			}
		}
	}

	//FMCB CUSTOM END
}