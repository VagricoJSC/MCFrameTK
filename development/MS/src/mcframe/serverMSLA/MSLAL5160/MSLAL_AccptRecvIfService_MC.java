package mcframe.serverMSLA.MSLAL5160;

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
import mcframe.serverMSBB.MSBBL6010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBE.MBBEL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFUD.PFUDL0040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R;
import mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR;
import mcframe.serverMSUC.MSUCL0020.MSUCL_ConvQtyAmtUtil;
import static mcframe.serverMSLA.MSLAL5160.Query.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.serverMSBB.MSBBL6220.*;
import mcframe.serverMSBD.MSBDL5180.*;
import mcframe.serverMSBE.MSBEL5010.MSBEL_IoActService;
import mcframe.serverMSBE.MSBEL5500.*;
import mcframe.serverMSBE.MSBEL5710.*;
import mcframe.serverMSBG.MSBGL5080.*;
import mcframe.serverMSBI.MSBIL5010.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverCore.resource.MCConst;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverMBBC.MBBCL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_AccptRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_AccptRecvIfService_MC extends MSLAL_AccptRecvIfService_MC_A{
	//FMCB CUSTOM START
	protected MCList<ConvQtyAmtUtil_Calc01_HdrR> _calc01HdrL = MCList.create(ConvQtyAmtUtil_Calc01_HdrR.class);
	protected MCIndexKey _idxCalc01HdrKey;
	protected static final String LIST_INDEX_KEY_NM = "sls_schd_no";
	protected void initCalc01Hdr() {
		_calc01HdrL.addNumberColumn("sls_schd_qty");
		_calc01HdrL.addNumberColumn("base_unit_cmpl_qty");
		_calc01HdrL.addStringColumn("base_unit_cd");
		_calc01HdrL.addStringColumn("sls_schd_no");
	}
	
	/**
	 * エラーになったキーの組み合わせを保持する
	 */
	protected Set<List<String>> _errSet = new HashSet<List<String>>();
	
	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSLAL_AccptRecvIfService> CLAZZ = MSLAL_AccptRecvIfService.class;
	
	/** 部門マスタのキャッシュ */
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _dpt;
	
	/**
	 * 部門ＣＤと適用日に対応した部門マスタを取得する。<br>
	 * キャッシュに存在する場合、キャッシュから取得して返却する。
	 * 
	 * @param dptCd 部門ＣＤ
	 * @param stDt 適用開始日
	 * 
	 * @return 部門マスタ情報
	 */
	public static MAM_DPT_R getDpt(String dptCd, MCDate stDt) {
		return object(CLAZZ)._getDptCache().get(stDt, dptCd);
	}
	
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _getDptCache() {
		MCList<MCRow> bindL = MCList.create(MCRow.class);
		if (_dpt == null){
			_dpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(MCQueryApiBuilder.create(MAM_DPT_R.create("T")), bindL, MAM_DPT_R.$dpt_cd);
		}
		return _dpt;
	}
	
	/** 場所マスタのキャッシュ */
	protected FXUCL_MCDbcCache<MAM_LOC_R> _loc;
	
	protected MAM_LOC_R getLocR(String locCd) {
		if (_loc == null) {
			_loc = new FXUCL_MCDbcCache<MAM_LOC_R>(MCQueryApiBuilder.create(MAM_LOC_R.create("T")));
		}
		return _loc.get(locCd);
	}
	
	/** 
	 * 税マスタキャッシュ 
	 */
	protected FXUCL_MCDbcCache<MAM_TAX_R> _slsTaxCache = null;
	protected FXUCL_MCDbcCache<MAM_TAX_R> _slsIncTaxCache = null;
	protected FXUCL_MCDbcCache<MAM_TAX_R> _orgTaxCache = null;
	protected void initOrgTaxCache(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
		object(CLAZZ)._initOrgTaxCache(accptRecvIfL);
	}
	protected void _initOrgTaxCache(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
		MCList<MAM_TAX_R> taxL = MCList.create(MAM_TAX_R.class);
		for (AccptRecvIf_Chk01_DtlR accptRecvIfR : accptRecvIfL) {
			MAM_TAX_R orgTaxR = MAM_TAX_R.create();
			orgTaxR.tax_cd(accptRecvIfR.org_tax_cd());
			taxL.add(orgTaxR);
			if (!isSame(accptRecvIfR.org_tax_cd(), accptRecvIfR.fix_tax_cd())) {
				MAM_TAX_R fixTaxR = MAM_TAX_R.create();
				fixTaxR.tax_cd(accptRecvIfR.fix_tax_cd());
				taxL.add(fixTaxR);
			}
		}
		_orgTaxCache = new FXUCL_MCDbcCache<MAM_TAX_R>(
				MCQueryApiBuilder.create(MAM_TAX_R.create("MAM_TAX")),
				taxL.groupBy(MAM_TAX_R.$tax_cd),
				MAM_TAX_R.$tax_cd);
	}
	protected MAM_TAX_R getOrgTaxCache(String taxCd) {
		return object(CLAZZ)._getOrgTaxCache(taxCd);
	}
	protected MAM_TAX_R _getOrgTaxCache(String taxCd) {
		if (_orgTaxCache == null) {
			_orgTaxCache = new FXUCL_MCDbcCache<MAM_TAX_R>(
					MCQueryApiBuilder.create(MAM_TAX_R.create("MAM_TAX")));
		}
		return _orgTaxCache.get(taxCd);
	}
	protected FXUCL_MCDbcCache<MAM_TAX_R> _tax = null;
	
	protected MAM_TAX_R getTaxR(String taxCd) {
		if (_tax == null) {
			_tax = new FXUCL_MCDbcCache<MAM_TAX_R>(MCQueryApiBuilder.create(MAM_TAX_R.create("T")));
		}
		return _tax.get(taxCd);
	}
	
	/**
	 * 税率、税区分から税ＣＤを取得する。
	 * 
	 * @param accptRecvIfR 取込み対象行
	 * @return 税ＣＤ
	 */
	protected MAM_TAX_R _getSlsTaxCd(AccptRecvIf_Chk01_DtlR accptRecvIfR) {
		
		if (_slsTaxCache == null) {
			_slsTaxCache = new FXUCL_MCDbcCache<MAM_TAX_R>(MCQueryApiBuilder.create(MAM_TAX_R.create("T")));
		}
		Comparable<?>[] in = new Comparable[]{accptRecvIfR.tax_rate(), accptRecvIfR.tax_typ(), accptRecvIfR.inc_tax_flg()};
		
		MAM_TAX_R cache = _slsTaxCache.getCache(in);
		if (cache == null) {
			
			MCList<MAM_TAX_R> ctaxL = MCList.create(MAM_TAX_R.class);
			MAM_TAX_R t = MAM_TAX_R.create("T");
			MCQueryApiBuilder ctaxL_bldr = MCQueryApiBuilder.create(t);
			ctaxL_bldr.setSelect(t.tax_cd);
			ctaxL_bldr.addSelect(t.inc_tax_flg);
			ctaxL_bldr.addWhereWithAnd(t.tax_rate.eq(bind("1")), accptRecvIfR.tax_rate());
			ctaxL_bldr.addWhereWithAnd(t.tax_typ.eq(bind("1")), accptRecvIfR.tax_typ());
			ctaxL_bldr.addWhereWithAnd(t.inc_tax_flg.eq(bind("1")),
					MCBooleanUtil.booleanToDBString(accptRecvIfR.inc_tax_flg()));
			ctaxL_bldr.addWhereWithAnd(t.sls_flg.eq(value(true)));

			dbSelect("MSLAL5160_MAM_TAX_S01", ctaxL, ctaxL_bldr);
			cache = getSlsTaxRow(accptRecvIfR, ctaxL);
			
			_slsTaxCache.putCache(in, cache);
		}
		
		return isNull(cache.isEmpty()) ? null : cache;
	}
	protected MAM_TAX_R getSlsTaxRow(AccptRecvIf_Chk01_DtlR accptRecvIfR, MCList<MAM_TAX_R> taxL) {

		if (taxL.isEmpty()) {
			return MAM_TAX_R.create();
		}
		
		MAM_TAX_R orgTaxR = taxL.getFirst(MAM_TAX_R.$tax_cd, accptRecvIfR.org_tax_cd());
		if (isNull(orgTaxR)) {
			return taxL.get(0);
		}
		else {
			return orgTaxR;
		}
	}
	
	/**
	 * 税ＣＤから内税ＦＬＧを取得する。
	 * 
	 * @param accptRecvIfR 取込み対象行
	 * @return 内税ＦＬＧ
	 */
	protected boolean _getSlsIncTaxFlg(AccptRecvIf_Chk01_DtlR accptRecvIfR) {
		
		if (_slsIncTaxCache == null) {
			_slsIncTaxCache = new FXUCL_MCDbcCache<MAM_TAX_R>(MCQueryApiBuilder.create(MAM_TAX_R.create("T")));
		}
		Comparable<?>[] in = new Comparable[]{accptRecvIfR.fix_tax_cd()};
		
		MAM_TAX_R cache = _slsIncTaxCache.getCache(in);
		if (cache == null) {
			
			MCList<MAM_TAX_R> ctaxL = MCList.create(MAM_TAX_R.class);
			MAM_TAX_R t = MAM_TAX_R.create("T");
			MCQueryApiBuilder ctaxL_bldr = MCQueryApiBuilder.create(t);
			ctaxL_bldr.setSelect(t.inc_tax_flg);
			ctaxL_bldr.addWhereWithAnd(t.tax_cd.eq(bind("1")), accptRecvIfR.fix_tax_cd());
			ctaxL_bldr.addWhereWithAnd(t.sls_flg.eq(value(true)));
			int cnt = dbSelect("MSLAL5160_MAM_TAX_S02", ctaxL, ctaxL_bldr);
			
			if (cnt == 1) {
				cache = ctaxL.get(0);
			}
			else {
				cache = MAM_TAX_R.create();
			}
			
			_slsIncTaxCache.putCache(in, cache);
		}
		
		return cache.inc_tax_flg();
	}
	
	/**
	 * 税率、税区分から税を取得する。
	 * 
	 * @param accptRecvIfR 取込み対象行
	 * @return 税ＣＤ
	 */
	public static MAM_TAX_R getSlsTaxCd(AccptRecvIf_Chk01_DtlR accptRecvIfR) {
		return object(CLAZZ)._getSlsTaxCd(accptRecvIfR);
	}
	
	/**
	 * 税率、税区分から内税ＦＬＧを取得する。
	 * 
	 * @param accptRecvIfR 取込み対象行
	 * @return 内税ＦＬＧ
	 */
	public static boolean getSlsIncTaxFlg(AccptRecvIf_Chk01_DtlR accptRecvIfR) {
		return object(CLAZZ)._getSlsIncTaxFlg(accptRecvIfR);
	}

	/**
	 * ワーキンググループＣＤ取得<br />
	 * 部門ＣＤと適用開始日をもとに部門マスタからワーキンググループＣＤを取得する
	 * 
	 * @param dptCd 部門ＣＤ
	 * @param dt 適用開始日
	 * 
	 * @return ワーキンググループＣＤ
	 */
	public static String getWgCd(String dptCd, MCDate dt) {
		return object(CLAZZ)._getWgCd(dptCd, dt);
	}
	
	protected String _getWgCd(String dptCd, MCDate dt) {
		return getDpt(dptCd, dt).wg_cd();
	}
	
	// 通貨のキャッシュ
	protected FXUCL_MCDbcCache<MAM_CUR_R> _curCache = null;
	
	protected static MAM_CUR_R getCur(String curCd) {
		return object(CLAZZ)._getCur(curCd);
	}
	
	protected MAM_CUR_R _getCur(String curCd) {
		if (_curCache == null) {
			_curCache = new FXUCL_MCDbcCache<MAM_CUR_R>(MCQueryApiBuilder.create(MAM_CUR_R.create("T")));
		}
		return _curCache.get(curCd);
	}
	
	// 品目マスタのキャッシュ
	protected MCList<MAM_ITM_R> _itmCache = null;
	MCIndexKey _itmCacheIdx = null;
	
	protected static void initItmCache(MCList<AccptRecvIf_Chk01_DtlR> dtlL) {
		object(CLAZZ)._initItmCache(dtlL);
	}
	
	protected void _initItmCache(MCList<AccptRecvIf_Chk01_DtlR> dtlL) {
		_itmCache = MCList.create(MAM_ITM_R.class);
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder itmCache_bldr = MCQueryApiBuilder.create(t);
		itmCache_bldr.setSelect(
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.lot_mng_typ,
				t.lot_no_ptn_cd,
				t.lot_no_typ,
				t.sublot_mng_typ,
				t.sublot_no_ptn_cd,
				t.sublot_no_typ,
				t.stk_mng_typ,
				t.dscnt_itm_flg,
				t.itm_jnl_cd
				);
		itmCache_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
		itmCache_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
		itmCache_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
		itmCache_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
		dbSelect("MSLAL5160_MAM_ITM_S01", _itmCache, itmCache_bldr, dtlL);
		_itmCacheIdx = _itmCache.createIndex(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1,
				MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
	}
	
	// 品目マスタのキャッシュからの取得
	protected static MAM_ITM_R getItmCache(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return object(CLAZZ)._getItmCache(itmCd, itmSub1, itmSub2, itmSub3);
	}
	
	protected MAM_ITM_R _getItmCache(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return _itmCache.getFirst(_itmCacheIdx, itmCd, itmSub1, itmSub2, itmSub3);
	}
	
	/**
	 * AccptRecvIf_Upd01オペレーション.<p>
	 *
	 * 検収受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	public class AccptRecvIf_Upd01 extends MSLAL_AccptRecvIfService_MC_A.AccptRecvIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			callAccptRecvIfUpd02();
		}
		
		/**
		 * 検収受信ＩＦ取込２を実行する。
		 */
		protected void callAccptRecvIfUpd02() {
			MSLAL_AccptRecvIfService.AccptRecvIf_Upd02 ope = MSLAL_AccptRecvIfService.crtAccptRecvIf_Upd02();
			setAll(ope.up0(), up0(), createMap_IfDataImp_Upd01_DtlR_Upd01_DtlR());
			ope.exec();
		}
		
		protected Map_IfDataImp_Upd01_DtlR_Upd01_DtlR<IfDataImp_Upd01_DtlR,Upd01_DtlR> createMap_IfDataImp_Upd01_DtlR_Upd01_DtlR() {
			return new Map_IfDataImp_Upd01_DtlR_Upd01_DtlR<IfDataImp_Upd01_DtlR, Upd01_DtlR>();
		}

		public class Map_IfDataImp_Upd01_DtlR_Upd01_DtlR<D extends IfDataImp_Upd01_DtlR, S extends Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IfDataImp_Upd01_DtlR.$data_no, Upd01_DtlR.$data_no);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$ext_data_no, Upd01_DtlR.$ext_data_no);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$ext_sys_cd, Upd01_DtlR.$ext_sys_cd);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$bp_cd, Upd01_DtlR.$bp_cd);

			}
		}
	}
	
	/**
	 * AccptRecvIf_Upd02オペレーション.<p>
	 *
	 * 検収受信ＩＦ取込を行う。（ＩＦデータ確認、および検収受信ＩＦ取込バッチから呼び出される）<br>
	 */
	public class AccptRecvIf_Upd02 extends MSLAL_AccptRecvIfService_MC_A.AccptRecvIf_Upd02 {
		/**
		 * 処理対象件数 
		 */
		protected int _totalNum = 0;
		
		/**
		 * 登録件数（正常終了件数）
		 */
		protected int _okNum = 0;
		
		/**
		 * エラー件数
		 */
		protected int _errNum = 0;
		
		/**
		 * スキップ件数
		 */
		protected int _skipNum = 0;
		
		/**
		 * 例外発生フラグ
		 */
		protected boolean _exceptionFlg = false;
		/** ロガー作成ＦＬＧ **/
		protected boolean _crtNewLogger = false;
		
		/**
		 * 検収受信ＩＦリスト 
		 */
		MCList<MST_ACCPT_RECV_IF_R> _accptRecvIfL = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			try {
				initProc();
				writeStartLog();
				preSrch();
				exe();
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				writeEndLog();
			}
		}
		
		/**
		 * 初期処理
		 */
		protected void initProc() {
			
			initLogger();
		}
		
		/**
		 * バッチログを初期化する。
		 */
		protected void initLogger() {
			
			// カレントLoggerがnullの場合（呼出元からLoggerを引き継がない場合）は新規
			if (loggerNE() == null) {
				_crtNewLogger = true;
			}
			getConcurrentLogger();
		}
		
		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {
			logger().writeStartLog(MSLAL0400);
			pushStartLog(logger());
		}
		
		/**
		 * 例外処理
		 * 
		 * @param ex 例外
		 */
		protected void handleEx(Exception ex) {
			
			MCException mcEx;
			if (ex instanceof MCException) {
				mcEx = (MCException) ex;
			}
			else {
				mcEx = new MCException(ex);
			}
			logger().writeProcessLog(mcEx);

			_exceptionFlg = true;

			throw mcEx;
		}
		
		/**
		 * 終了ログを出力する。
		*/
		protected void writeEndLog() {
			
			if (_errNum > 0 || _exceptionFlg) {
				
				logger().writeProcessLog(MAUDL0009);
				MCMessagePool.add(MAUDL0009);
				pushErrorLog(logger());
			}
			else if (_totalNum == 0) {
				
				logger().writeProcessLog(MAUDL0008);
				MCMessagePool.add(MAUDL0008);
			}
			
			logger().writeEndLog(MSLAL0401, _totalNum, _okNum, _errNum, _skipNum);
			pushEndLog(logger());
			// Loggerを新規作成した場合（呼出元からLoggerを引き継がない場合）のみクローズ
			if (_crtNewLogger) {
				logger().close();
			}
		}
		
		/**
		 * 検収受信ＩＦデータを取得する。
		 */
		protected void preSrch() {
			_accptRecvIfL = MCList.create(MST_ACCPT_RECV_IF_R.class);
			MST_ACCPT_RECV_IF_R t = MST_ACCPT_RECV_IF_R.create("T");
			MCQueryApiBuilder accptRecvIfL_bldr = MCQueryApiBuilder.create(t);
			MAM_EDI_IF_CTL_R m1 = MAM_EDI_IF_CTL_R.create("M1");
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");
			_accptRecvIfL.addStringColumn("cred_cd");
			
			accptRecvIfL_bldr.addSelect(MAPA_BP$F_GET_CRED_OF_CST(t.cst_cd).as("cred_cd"));
			
			accptRecvIfL_bldr.addInnerJoin(m1, bracket(t.cst_cd.eq(m1.bp_cd)
					.and(m1.if_proc_typ.eq(value(MAC_IF_PROC_TYP.ACCPT_RECV.value())))
					.and(m1.st_dt.lte(t.recv_dt))
					.and(m1.end_dt.gte(t.recv_dt))));
			accptRecvIfL_bldr.addLeftOuterJoin(t2, t.data_no.eq(t2.data_no));
			
			accptRecvIfL_bldr.setWhere(value(0).eq(value(0)));
			accptRecvIfL_bldr.addWhereWithAnd(bracket(t2.sdrv_sts_typ.isNull()
					.or(t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			accptRecvIfL_bldr.addWhereWithAnd(t.imp_flg.eq(value(true)));
			
			if (!up0().isEmpty()) {
				accptRecvIfL_bldr.addWhereWithCutOffAnd(t.data_no.eq(bind("data_no")));
				accptRecvIfL_bldr.addWhereWithCutOffAnd(t.ext_data_no.eq(bind("ext_data_no")));
				accptRecvIfL_bldr.addWhereWithCutOffAnd(t.ext_sys_cd.eq(bind("ext_sys_cd")));
				accptRecvIfL_bldr.addWhereWithCutOffAnd(t.cst_cd.eq(bind("bp_cd")));
				dbSelect("MSLAL5160_MST_ACCPT_RECV_IF_S01", _accptRecvIfL, accptRecvIfL_bldr, up0());
			}
			else {
				dbSelect("MSLAL5160_MST_ACCPT_RECV_IF_S02", _accptRecvIfL, accptRecvIfL_bldr);
			}
		}
		
		/**
		 * バッチ用メイン処理
		 */
		protected void exe() {
			callAccptRecvIfUpd03();
		}
		
		/**
		 * スレッドを分割し、各スレッドごとに検収受信ＩＦ取込３を実行する。
		 */
		protected void callAccptRecvIfUpd03() {
			
			int no = 0;
			
			MSLAL_AccptRecvIfService.AccptRecvIf_Upd03 upd03 = null;
			List<MSLAL_AccptRecvIfService.AccptRecvIf_Upd03> opeL = new ArrayList<MSLAL_AccptRecvIfService.AccptRecvIf_Upd03>();
			
			for (MCList<MST_ACCPT_RECV_IF_R> credGrpL : _accptRecvIfL.groupList("cred_cd")) {
				
				// 与信管理先がある場合は、与信管理先でスレッドを分ける。
				if(!isNull(credGrpL.get(0).getStringNE("cred_cd"))) {
					upd03 = MSLAL_AccptRecvIfService.crtAccptRecvIf_Upd03();
					upd03._no = ++no;
					setAll(upd03.up0(), credGrpL, createMap_AccptRecvIf_Upd03_DtlR_MST_ACCPT_RECV_IF_R());
					opeL.add(upd03);
				}
				// 与信管理先がない場合は、得意先でスレッドを分ける。
				else {
					for (MCList<MST_ACCPT_RECV_IF_R> cstGrpL : credGrpL.groupList(MST_ACCPT_RECV_IF_R.$cst_cd)) {
						upd03 = MSLAL_AccptRecvIfService.crtAccptRecvIf_Upd03();
						upd03._no = ++no;
						setAll(upd03.up0(), cstGrpL, createMap_AccptRecvIf_Upd03_DtlR_MST_ACCPT_RECV_IF_R());
						opeL.add(upd03);
					}
				}
			}
			
			if (!opeL.isEmpty()) {
				if (MCServerThreadManager.getLimitThreadSize() <= 1) {
					MCServerThreadManager.setUseMainDBTran(true);
					MCServerThreadManager.invokeAndWait(1, opeL, FXBAL_BatchLogManager.class);
				}
				else {
					
					MCServerThreadManager.setCommitAndRollback(true);
					
					// 件数の多いスレッドを優先に実行する。
					Collections.sort(opeL, new Comparator<MSLAL_AccptRecvIfService.AccptRecvIf_Upd03>() {
						public int compare(MSLAL_AccptRecvIfService.AccptRecvIf_Upd03 o1, MSLAL_AccptRecvIfService.AccptRecvIf_Upd03 o2) {
							return (o1.up0().size() - o2.up0().size()) * -1;	// 降順
						}
					});
					
					MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
				}
				
				for (MSLAL_AccptRecvIfService.AccptRecvIf_Upd03 ope : opeL) {
					_totalNum += ope.down0().total_num().intValue();
					_okNum += ope.down0().ok_num().intValue();
					_errNum += ope.down0().err_num().intValue();
					_skipNum += ope.down0().skip_num().intValue();
				}
			}
		}
		
		protected Map_AccptRecvIf_Upd03_DtlR_MST_ACCPT_RECV_IF_R<AccptRecvIf_Upd03_DtlR,MST_ACCPT_RECV_IF_R> createMap_AccptRecvIf_Upd03_DtlR_MST_ACCPT_RECV_IF_R() {
			return new Map_AccptRecvIf_Upd03_DtlR_MST_ACCPT_RECV_IF_R<AccptRecvIf_Upd03_DtlR, MST_ACCPT_RECV_IF_R>();
		}

		public class Map_AccptRecvIf_Upd03_DtlR_MST_ACCPT_RECV_IF_R<D extends AccptRecvIf_Upd03_DtlR, S extends MST_ACCPT_RECV_IF_R> extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src) {
				dest.accpt(src);
			}
		}
	}
	
	/**
	 * AccptRecvIf_Upd03オペレーション.<p>
	 *
	 * 検収受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	public class AccptRecvIf_Upd03 extends MSLAL_AccptRecvIfService_MC_A.AccptRecvIf_Upd03 {
		
		/**
		 * 検収受信ＩＦ取込４を呼び出す際にデータＮＯ、得意先の組み合わせを何件ずつ渡すかのパラメータ
		 */
		protected int _loopCnt = MCConst.app.getInteger("MS.MSLAL5160.loop_size", 100);
		
		/**
		 * 処理対象件数
		 */
		protected int _totalNum = 0;
		
		/**
		 * 登録件数（正常終了件数）
		 */
		protected int _okNum = 0;
		
		/**
		 * エラー件数
		 */
		protected int _errNum = 0;
		
		/**
		 * スキップ件数
		 */
		protected int _skipNum = 0;
		
		/**
		 * バッチログのlogger<br>
		 * AccptRecvIf_Upd04バッチ呼び出しオペレーションから引き継ぐ
		 */
		protected FXBAL_BatchLogger _logger = null;
		
		/**
		 * インスタンス生成元（AccptRecvIf_Upd03）でスレッド間でユニークな値を設定
		 */
		protected int _no = 0;
		
		/**
		 * AccptRecvIf_Upd04の実行結果リスト
		 */
		protected MCList<AccptRecvIf_Upd04_DtlR> _exeRslt = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			try {
				
				initProc();
				
				exe();
				
				setDown();
			}
			finally {
				
				closeLogger();
			}
		}
		
		/**
		 * 初期化処理
		 */
		protected void initProc() {
			initLogger();
		}
		
		/**
		 * バッチログのインスタンスを取得する。
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
		 * バッチログをクローズする。
		 */
		protected void closeLogger() {
			if (!MCServerThreadManager.isUseMainDBTran()) {
				if (_logger != null) {
					_logger.close();
				}
			}
		}
		
		/**
		 * 検収受信ＩＦ取込処理を実行する。
		 */
		protected void exe() {

			int cnt = 0;
			
			MCList<MST_ACCPT_RECV_IF_R> tgtL = MCList.create(MST_ACCPT_RECV_IF_R.class);
			MST_ACCPT_RECV_IF_R oldR = MST_ACCPT_RECV_IF_R.create();
			
			for (AccptRecvIf_Upd03_DtlR dtlR : up0()) {
				MST_ACCPT_RECV_IF_R keyR = dtlR.accpt();
				if (isNextData(oldR, keyR)) {
					if (!tgtL.isEmpty() && _loopCnt <= cnt) {
						callAccptRecvIfUpd04(tgtL);
						cnt = 0;
						tgtL.clear();
					}
				}
				oldR = keyR;
				cnt++;
				tgtL.add(keyR);
			}
			
			if (!tgtL.isEmpty()) {
				callAccptRecvIfUpd04(tgtL);
			}
		}
		/**
		 * 検収受信ＩＦを実行する。
		 * 
		 * @param accptRecvIfL 検収受信ＩＦリスト
		 */
		protected void callAccptRecvIfUpd04(MCList<MST_ACCPT_RECV_IF_R> accptRecvIfL) {
			crtAccptRecvIfWk(accptRecvIfL);
			
			MCList<MST_ACCPT_RECV_IF_R> exeL = srchLockAccptRecvIf();
			
			Set<List<String>> afterExtDataSet = srchAfterExtData(exeL);
			
			MSLAL_AccptRecvIfService.AccptRecvIf_Upd04 ope = MSLAL_AccptRecvIfService.crtAccptRecvIf_Upd04();
			
			AccptRecvIf_Upd04_DtlR upR = null;
			MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
			MST_SLS_ACT_D_R t = MST_SLS_ACT_D_R.create("T");
			MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(t);
			MST_SLS_ACT_R t1 = MST_SLS_ACT_R.create("T1");
			MST_SLS_ACT_R S1W = MST_SLS_ACT_R.create("W");
			slsActDL_bldr.setSelect(t.sls_act_d_no, t.ext_sys_cd, t.ext_purc_act_d_no);
			slsActDL_bldr.addInnerJoin(t1,
					bracket(t1.sls_act_no.eq(t.sls_act_no)
							.and(t1.sls_act_seq.eq(t.sls_act_seq))
							.and(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							.and(t1.sls_act_seq.eq(subQuery()
									.select(max(S1W.sls_act_seq))
									.from(S1W)
									.where(S1W.sls_act_no.eq(t.sls_act_no))))));
			slsActDL_bldr.setWhere(t.ext_purc_act_d_no.eq(bind("ext_purc_act_d_no")));
			slsActDL_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("ext_sys_cd")));
			dbSelect("MSLAL5160_MST_SLS_ACT_D_S01", slsActDL, slsActDL_bldr, exeL);
			MCIndexKey idxKey = slsActDL.createIndex(MST_SLS_ACT_D_R.$ext_purc_act_d_no, MST_SLS_ACT_D_R.$ext_sys_cd);
			
			MCList<MST_ACCPT_RECV_IF_R> skipL = MCList.create(MST_ACCPT_RECV_IF_R.class);
			for (MST_ACCPT_RECV_IF_R exeR : exeL) {
				boolean skipFLg = false;
				if (MAC_DATA_CRUD_TYP.isUPD(exeR.data_crud_typ()) && !isNull(exeR.ext_sys_cd()) && !isNull(exeR.ext_purc_act_d_no()) && exeR.accpt_dfct_flg()) {
					MST_SLS_ACT_D_R slsActDR = slsActDL.getFirst(idxKey, exeR.ext_purc_act_d_no(), exeR.ext_sys_cd());
					if (isNull(slsActDR)) {
						skipFLg = true;
					}
					else {
						exeR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
				}
				
				// データ更新区分が新規で検収不良はスキップ
				// データ更新区分が更新で更新対象の売上実績が存在せず検収不良もスキップ
				if (exeR.accpt_dfct_flg() && MAC_DATA_CRUD_TYP.isCRT(exeR.data_crud_typ()) || skipFLg) {
					setSkipSts(exeR);
					MCMessagePool.add(
							exeR,
							null,
							MSLAL0411,
							exeR.data_no(),
							exeR.data_lno(),
							exeR.cst_cd(),
							exeR.dlv_slip_no(),
							exeR.dlv_slip_d_no(),
							exeR.cst_po_no(),
							exeR.cst_po_d_no());
					skipL.add(exeR);
				}
				// 同一の得意先、納品書ＮＯ、得意先注文ＮＯでエラーが発生している場合、それ以降のデータは処理しない
				else if (isPrevErr(exeR)) {
					setErrSts(exeR);
					MCMessagePool.add(
							exeR,
							null,
							MSLAL0412,
							exeR.data_no(),
							exeR.data_lno(),
							exeR.cst_cd(),
							exeR.dlv_slip_no(),
							exeR.cst_po_no());
					skipL.add(exeR);
				}
				// 同一の得意先、納品書ＮＯ，得意先注文ＮＯで、新しいデータが既に処理されている場合、スキップする
				else if (isOkSkip(exeR, afterExtDataSet)) {
					setSkipSts(exeR);
					MCMessagePool.add(
							exeR,
							null,
							MSLAL0413,
							exeR.data_no(),
							exeR.data_lno(),
							exeR.ext_sys_cd(),
							exeR.ext_purc_act_d_no());
					skipL.add(exeR);
				}
				else {
					upR = AccptRecvIf_Upd04_DtlR.create();
					upR.accpt(exeR);
					upR.setParamIndex(exeR.getParamIndex());
					upR.setParamRowIndex(exeR.getParamRowIndex());
					ope.up0().add(upR);
				}
			}
			if (!ope.up0().isEmpty()) {
				ope.up0().sort(AccptRecvIf_Upd04_DtlR.$data_no, AccptRecvIf_Upd04_DtlR.$data_lno);
				ope.exec();
			}
			mergeExeRslt(skipL, ope.down0());
			afterCall(exeL);
			delAccptRecvIfWk(accptRecvIfL);
		}
		
		/**
		 * 同一キーで新しいデータが既に処理済みかどうか。
		 * 
		 * @param exeR 取込対象行
		 * @return 処理済みの場合はtrue
		 */
		protected boolean isOkSkip(MST_ACCPT_RECV_IF_R exeR, Set<List<String>> afterExtDataSet) {
			return afterExtDataSet.contains(createOKSkipSetKey(exeR));
		}
		
		/**
		 * 検収受信ＩＦのワークテーブルにデータを登録する。
		 * @param accptRecvIfL 検収受信ＩＦ
		 */
		protected void crtAccptRecvIfWk(MCList<MST_ACCPT_RECV_IF_R> accptRecvIfL) {
			MCQueryApiBuilder accptRecvIfL_bldr = MCQueryApiBuilder.create(MST_ACCPT_RECV_IF_R.create("T"));
			dbWkDelete("MSLAL5160_MSW_ACCPT_RECV_IF_D01", accptRecvIfL_bldr.getBaseDbc());
			dbWkInsert("MSLAL5160_MSW_ACCPT_RECV_IF_I01", accptRecvIfL, accptRecvIfL_bldr.getBaseDbc());
		}
		
		/**
		 * 検収受信ＩＦをロックする。
		 */
		protected MCList<MST_ACCPT_RECV_IF_R> srchLockAccptRecvIf() {
			MCList<MST_ACCPT_RECV_IF_R> exeL = MCList.create(MST_ACCPT_RECV_IF_R.class);
			MST_ACCPT_RECV_IF_R t = MST_ACCPT_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);
			MSW_ACCPT_RECV_IF_KEY_R w1 = MSW_ACCPT_RECV_IF_KEY_R.create("W1");
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");
			
			exeL_bldr.addInnerJoin(w1, bracket(t.data_lno.eq(w1.data_lno)));
			exeL_bldr.addLeftOuterJoin(t2, t.data_no.eq(t2.data_no));
			
			exeL_bldr.setWhere(value(0).eq(value(0)));
			exeL_bldr.addWhereWithAnd(bracket(t2.sdrv_sts_typ.isNull()
					.or(t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			exeL_bldr.addWhereWithAnd(t.imp_flg.eq(value(true)));
			exeL_bldr.addOrderByAsc(t.ext_data_no, t.cst_cd);
			exeL_bldr.setLockTable(t.data_lno);
			
			dbSelectForUpdate("MSLAL5160_MST_ACCPT_RECV_IF_S03", exeL, exeL_bldr);
			
			for (MST_ACCPT_RECV_IF_R exeR : exeL) {
				// log_sub_key1にスレッド間でユニークな値を設定
				exeR.setParamIndex(_no);
			}
			
			_logger.setLogKey(exeL,
					MST_ACCPT_RECV_IF_R.$batch_log_no,
					MST_ACCPT_RECV_IF_R.$log_sub_key1,
					MST_ACCPT_RECV_IF_R.$log_sub_key2);
			
			return exeL;
		}
		
		/**
		 * 同一キーで取込対象より新しいかつ処理済みのデータを取得する。
		 * 
		 * @param exeL 取込対象リスト
		 * @return 処理済みデータリスト
		 */
		protected Set<List<String>> srchAfterExtData(MCList<MST_ACCPT_RECV_IF_R> exeL) {
			MCList<MST_ACCPT_RECV_IF_R> afterL = MCList.create(MST_ACCPT_RECV_IF_R.class);
			MST_ACCPT_RECV_IF_R t = MST_ACCPT_RECV_IF_R.create("T");
			MCQueryApiBuilder afterL_bldr = MCQueryApiBuilder.create(t);
			MST_ACCPT_RECV_IF_R S1ST = MST_ACCPT_RECV_IF_R.create("ST");
			
			afterL_bldr.setSelect(t.ext_sys_cd, t.ext_purc_act_d_no);
			afterL_bldr.addConstWhereWithAnd(exists(subQuery()
					.select(value("X"))
					.from(S1ST)
					.where(t.ext_data_no.lt(S1ST.ext_data_no)
							.and(t.ext_sys_cd.eq(S1ST.ext_sys_cd))
							.and(t.ext_purc_act_d_no.eq(S1ST.ext_purc_act_d_no))
							.and(S1ST.exe_sts_typ.in(value(MAC_EXE_STS_TYP.OK.value()),
									value(MAC_EXE_STS_TYP.SKP.value()))))));
		
			dbSelectColumn("MSLAL5160_MST_ACCPT_RECV_IF_S04", afterL, afterL_bldr, exeL, MST_ACCPT_RECV_IF_R.$data_lno);

			Set<List<String>> set = new HashSet<List<String>>();
			for (MST_ACCPT_RECV_IF_R afterR : afterL) {
				List<String> l = createOKSkipSetKey(afterR);
				if (!set.contains(l)) {
					set.add(l);
				}
			}
			return set;
		}
		
		/**
		 * 取込結果をマージする。
		 * 
		 * @param skipL スキップリスト
		 * @param downL AccptRecvIf_Upd04の下り電文
		 */
		protected void mergeExeRslt(MCList<MST_ACCPT_RECV_IF_R> skipL, MCList<AccptRecvIf_Upd04_DtlR> downL) {
			_exeRslt = MCList.create(AccptRecvIf_Upd04_DtlR.class);
			_exeRslt.setAll(downL);
			
			AccptRecvIf_Upd04_DtlR dtlR = null;
			
			for (MST_ACCPT_RECV_IF_R skipR : skipL) {
				dtlR = AccptRecvIf_Upd04_DtlR.create();
				dtlR.data_lno(skipR.data_lno());
				dtlR.exe_sts_typ(skipR.exe_sts_typ());
				_exeRslt.add(dtlR);
			}
		}
		
		/**
		 * 検収受信ＩＦ取込の後処理。
		 * 
		 * @param exeL 取込対象リスト
		 */
		protected void afterCall(MCList<MST_ACCPT_RECV_IF_R> exeL) {
			
			rsltCnt(exeL);
			
			updIf(exeL);
			
			MCMessageList msgList = MCMessagePool.getMessageList();
			_logger.writeDataLog(msgList);
			
			pushAlertMsg(msgList);
			
			dbTran().commit();
			
			msgList.clear();
		}
		
		/**
		 * エラーメッセージをプッシュ通知する
		 * 
		 * @param msgList
		 */
		protected void pushAlertMsg(MCMessageList msgList) {
			
			if (msgList.isEmpty()) {
				return;
			}
			
			Map<List<String>, MCMessageList> map = new HashMap<List<String>, MCMessageList>();
			
			MCIndexKey ik = _exeRslt.createIndex(MST_ACCPT_RECV_IF_R.$log_sub_key1, MST_ACCPT_RECV_IF_R.$log_sub_key2);
			
			for (MCMessage msg : msgList) {
				MCRow causeRow = msg.getCauseRow();
				if (causeRow == null) {
					continue;
				}
				
				AccptRecvIf_Upd04_DtlR exeR;
				if (causeRow instanceof AccptRecvIf_Upd04_DtlR) {
					exeR = (AccptRecvIf_Upd04_DtlR)causeRow;
				}
				else {
					MCNumber paramIndex = MCNumber.valueOf(causeRow.getParamIndex());
					MCNumber paramRowIndex = MCNumber.valueOf(causeRow.getParamRowIndex());
					
					exeR = _exeRslt.getFirst(ik, paramIndex, paramRowIndex);
				}
				
				if (exeR != null && !isNull(exeR.cst_cd())) {
					List<String> keyList = new ArrayList<String>();
					keyList.add(exeR.cst_cd());
					keyList.add(exeR.wg_cd());
					keyList.add(exeR.sls_usr_cd());
					
					if (map.containsKey(keyList)) {
						MCMessageList list = map.get(keyList);
						list.add(msg);
					}
					else {
						MCMessageList list = new MCMessageList();
						list.add(msg);
						map.put(keyList, list);
					}
				}
			}
			
			for (Entry<List<String>, MCMessageList> entry : map.entrySet()) {
				String cstCd = entry.getKey().get(0);
				String wgCd = entry.getKey().get(1);
				String usrCd = entry.getKey().get(2);
				
				pushAlert(null, wgCd, cstCd, usrCd,
						MODULE_ID, LOGIC_ID, OPERATION_ID,
						entry.getValue(), _logger,
						MSLAL0205,
						MCConst.lgclbl.getLabel(MODULE_ID, LOGIC_ID, null),
						MCDate.sysnow().toString("yyyy/MM/dd HH:mm:ss"),
						getCo().co_cd(), wgCd, cstCd);
			}
		}
		
		/**
		 * 検収受信ＩＦを更新する。
		 * 
		 * @param exeL 取込対象リスト
		 */
		protected void updIf(MCList<MST_ACCPT_RECV_IF_R> exeL) {
			MST_ACCPT_RECV_IF_R t = MST_ACCPT_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);
			exeL_bldr.setSet(t.imp_flg, t.exe_sts_typ, t.batch_log_no, t.log_sub_key1, t.log_sub_key2);
			
			dbUpdateKey("MSLAL5160_MST_ACCPT_RECV_IF_U01", exeL, exeL_bldr);
		}
		
		/**
		 * 取込結果の件数を算出する。
		 * 
		 * @param exeL 取込対象リスト
		 */
		protected void rsltCnt(MCList<MST_ACCPT_RECV_IF_R> exeL) {
			
			MCIndexKey idxkey = _exeRslt.createIndex(AccptRecvIf_Upd03_DtlR.$data_lno);
			
			for (MST_ACCPT_RECV_IF_R exeR : exeL) {
				AccptRecvIf_Upd04_DtlR exeRslt = _exeRslt.getFirst(idxkey, exeR.data_lno());
				
				if (MAC_EXE_STS_TYP.isOK(exeRslt.exe_sts_typ())) {
					exeR.imp_flg(false);
					exeR.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
					_okNum++;
					_totalNum++;
				}
				else if (MAC_EXE_STS_TYP.isERR(exeRslt.exe_sts_typ())) {
					exeR.imp_flg(true);
					setErrSts(exeR);
					_errNum++;
					_totalNum++;
				}
				else if (MAC_EXE_STS_TYP.isSKP(exeRslt.exe_sts_typ())) {
					exeR.imp_flg(false);
					exeR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
					_skipNum++;
					_totalNum++;
				}
			}
		}
		
		/**
		 * 処理結果区分にスキップを設定する。
		 * 
		 * @param exeR 取込対象行
		 */
		protected void setSkipSts(MST_ACCPT_RECV_IF_R exeR) {
			exeR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
		}
		
		/**
		 * 処理結果区分にエラーを設定する。
		 * 
		 * @param exeR 取込対象行
		 */
		protected void setErrSts(MST_ACCPT_RECV_IF_R exeR) {
			exeR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
			setErrSet(exeR);
		}
		
		/**
		 * 同一取込グループでエラーが発生した場合に、エラーリスト設定に追加する。
		 * 
		 * @param accptRecvIfR 検収受信ＩＦ
		 */
		protected void setErrSet(MST_ACCPT_RECV_IF_R accptRecvIfR) {
			List<String> lst = createErrSetKey(accptRecvIfR);
			if (!object(CLAZZ)._errSet.contains(lst)) {
				object(CLAZZ)._errSet.add(lst);
			}
		}
		
		/**
		 * 引数で渡された比較対象が同一取込単位かどうか。
		 * 
		 * @param preR 前の取込対象
		 * @param exeR　取込対象
		 * @return 取込単位のいずれかが異なる場合はtrue
		 */
		protected boolean isNextData(MST_ACCPT_RECV_IF_R preR, MST_ACCPT_RECV_IF_R exeR) {
			if (exeR.iv_flg()) {
				return !(isSame(preR.ext_data_no(), exeR.ext_data_no())
						&& isSame(preR.cst_cd(), exeR.cst_cd())
						&& isSame(preR.dlv_slip_no(), exeR.dlv_slip_no()));
			}
			
			return !(isSame(preR.ext_data_no(), exeR.ext_data_no())
					&& isSame(preR.cst_cd(), exeR.cst_cd())
					&& isSame(preR.cst_po_no(), exeR.cst_po_no()));
		}
		
		/**
		 * 検収受信ＩＦワークテーブルのデータを削除する。
		 * 
		 * @param accptRecvIfL 検収受信ＩＦリスト
		 */
		protected void delAccptRecvIfWk(MCList<MST_ACCPT_RECV_IF_R> accptRecvIfL) {
			MCQueryApiBuilder accptRecvIfL_bldr = MCQueryApiBuilder.create(MST_ACCPT_RECV_IF_R.create("T"));
			dbWkDelete("MSLAL5160_MSW_ACCPT_RECV_IF_D02", accptRecvIfL_bldr.getBaseDbc());
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().total_num(_totalNum);
			down0().ok_num(_okNum);
			down0().err_num(_errNum);
			down0().skip_num(_skipNum);
		}
		
	}
	
	/**
	 * AccptRecvIf_Upd04オペレーション.<p>
	 *
	 * 検収受信ＩＦ取込を行う。（売上実績サービスを呼び出す本処理）<br>
	 */
	public class AccptRecvIf_Upd04 extends MSLAL_AccptRecvIfService_MC_A.AccptRecvIf_Upd04 {
		
		/**
		 * 検収受信ＩＦ取込チェックオペレーション
		 */
		protected MSLAL_AccptRecvIfService.AccptRecvIf_Chk01 _accptRecvIfChk = null;
		
		/**
		 * 売上実績SV用電文
		 */
		MCList<SlsAct_Upd01_HdrR> _slsActUpd01L = MCList.create(SlsAct_Upd01_HdrR.class);
		MCList<SlsAct_Upd01_DtlR> _slsActDUpd01L = MCList.create(SlsAct_Upd01_DtlR.class);
		MCList<SlsAct_Upd01_IoR> _slsActIoUpd01L = MCList.create(SlsAct_Upd01_IoR.class);
		MCIndexKey _slsActDIdx = null;
		MCIndexKey _slsActDCrudIdx = null;
		MCIndexKey _slsActIoIdx = null;
		MCIndexKey _slsActDCrudSchdIdx = null;
		MCList<AccptRecvIf_Chk01_DtlR> _chk01L = MCList.create(AccptRecvIf_Chk01_DtlR.class);
		protected final String $CST_PO_NO_KEY = "_cst_po_no_";
		
		/**
		 * 売上実績SV登録結果（売上実績ヘッダ）
		 */
		MCList<SlsAct_Upd01_RsltR> _rsltL = MCList.create(SlsAct_Upd01_RsltR.class);
		/**
		 * 売上実績SV登録結果（売上実績明細）
		 */
		MCList<SlsAct_Upd01_Rslt_DtlR> _rsltDL = MCList.create(SlsAct_Upd01_Rslt_DtlR.class);
		/**
		 * 売上実績ヘッダ削除リスト
		 */
		MCList<SlsAct_Upd01_HdrR> _hdrDelL = MCList.create(SlsAct_Upd01_HdrR.class);
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			initProc();
			
			proc();
			
			setDown();
		}
		
		/**
		 * 初期化処理
		 */
		protected void initProc() {
			// ＰＧ実行状況区分は一旦すべて未処理に設定してから本処理の結果に応じてエラーや処理済に変更する
			up0().setString(AccptRecvIf_Upd04_DtlR.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
			// インボイス取引対象でない場合のみ、$CST_PO_NO_KEYに値を設定する
			up0().addStringColumn($CST_PO_NO_KEY);
			up0().subList(r -> !r.accpt().iv_flg()).forEach(r -> {
				r.setString($CST_PO_NO_KEY, r.cst_po_no());
			});
			up0().addStringColumn(MST_ACCPT_RECV_IF_R.$ext_sys_cd);
			up0().forEach(r -> {
				r.setString(MST_ACCPT_RECV_IF_R.$ext_sys_cd, r.accpt().ext_sys_cd());
			});
			up0().sort(getGrpKey());
		}
		
		/**
		 * 登録処理
		 */
		protected void proc() {
			
			MCSavepoint sp = null;
			MCList<AccptRecvIf_Upd04_DtlR>[] grp = getGrp();
			
			MCMessageList msgList = new MCMessageList();
			msgList.addAll(MCMessagePool.getMessageList());
			
			for (MCList<AccptRecvIf_Upd04_DtlR> accptRecvIfL : grp) {
				
				MCMessagePool.clear();
				
				callThisChk01(accptRecvIfL);
				
				// 同一処理グループ（得意先、納品書ＮＯ、得意先注文ＮＯ）でエラーになっていた場合は処理対象から除外
				MCList<AccptRecvIf_Upd04_DtlR> execL = MCList.create(AccptRecvIf_Upd04_DtlR.class);
				boolean removeFlg = false;
				for (AccptRecvIf_Upd04_DtlR ifR : accptRecvIfL) {
					if (!MAC_EXE_STS_TYP.isERR(ifR.accpt().exe_sts_typ())) {
						execL.add(ifR);
					}
					else {
						for (int idx = 0; idx < _slsActUpd01L.size(); idx++) {
							SlsAct_Upd01_HdrR hdrR = _slsActUpd01L.get(idx);
							if (isRemoveSlsList(ifR, hdrR)) {
								_slsActUpd01L.remove(idx);
								removeFlg =  true;
								break;
							}
						}
					}
				}
				
				if (removeFlg) {
					MCList<SlsAct_Upd01_DtlR> tmpSlsActDUpd01L = MCList.create(SlsAct_Upd01_DtlR.class);
					for (SlsAct_Upd01_DtlR slsActDtlR : _slsActDUpd01L) {
						SlsAct_Upd01_HdrR hdrR = _slsActUpd01L.getFirst(SlsAct_Upd01_HdrR.$hdr_peg_no, slsActDtlR.hdr_peg_no());
						if (!isNull(hdrR)) {
							tmpSlsActDUpd01L.add(slsActDtlR);
						}
					}
					_slsActDUpd01L.clear();
					_slsActDUpd01L.addAll(tmpSlsActDUpd01L);
					_slsActDUpd01L.addNumberColumn("upd_purc_peg_no");
					
					MCList<SlsAct_Upd01_IoR> tmpSlsActIoUpd01L = MCList.create(SlsAct_Upd01_IoR.class);
					for (SlsAct_Upd01_IoR slsActIoR : _slsActIoUpd01L) {
						SlsAct_Upd01_HdrR hdrR = _slsActUpd01L.getFirst(SlsAct_Upd01_HdrR.$hdr_peg_no, slsActIoR.hdr_peg_no());
						if (!isNull(hdrR)) {
							tmpSlsActIoUpd01L.add(slsActIoR);
						}
					}
					_slsActIoUpd01L.clear();
					_slsActIoUpd01L.addAll(tmpSlsActIoUpd01L);
				}
				
				if (execL.isEmpty()) {
					msgList.addAll(MCMessagePool.getMessageList());
					continue;
				}
				
				try {
					sp = setSavepoint();
					
					// 売上予定/出荷予定サービス呼出（仕入直送の打切解除）
					cancelAbort();
					
					// 売上実績サービス呼出（取消）
					callSlsActServiceDel(accptRecvIfL);
					
					// 与信サービス呼出（取消）
					callCredSvUpd01Del();
					
					// 仕入実績登録サービス呼出
					callPurcActSvUpd02();
					
					// 輸出実績サービス呼出
					callExActSvUpd02();
					
					// 与信サービス呼出（新規）
					callCredSvUpd01();
					
					// 売上実績サービス呼出（新規）
					callSlsActServiceCrt(accptRecvIfL);
					
					// 受払実績サービス呼出
					callIoActSvUpd01();
					
					// 添付帳票登録サービス呼出（新規）
					callAttachServiceUpd(accptRecvIfL);
					
					// 添付帳票登録サービス呼出（取消）
					callAttachServiceDel();
				}
				catch (Exception ex) {
					handleEx(ex, sp, accptRecvIfL);
				}
				finally {
					sp = null;
					msgList.addAll(lnkMsgToIf(MCMessagePool.getMessageList(), accptRecvIfL));
				}
			}
			
			MCMessagePool.clear();
			MCMessagePool.addAll(msgList);
		}
		
		protected boolean isRemoveSlsList(AccptRecvIf_Upd04_DtlR ifR, SlsAct_Upd01_HdrR hdrR) {
			
			for (SlsAct_Upd01_DtlR slsActDtlR : _slsActDUpd01L) {
				if (isSame(hdrR.hdr_peg_no(), slsActDtlR.hdr_peg_no()) 
						&& isSame(ifR.accpt().ext_purc_act_d_no(), slsActDtlR.ext_purc_act_d_no())
						&& isSame(ifR.accpt().ext_sys_cd(), slsActDtlR.ext_sys_cd())) {
					return true;
				}
			}
			
			return false;
		}
		
		/**
		 * 売上予定/出荷予定サービス呼出（仕入直送の打切解除）
		 */
		protected void cancelAbort() {
			MSBBL_SlsSchdService.Sls_Schd_Upd03 opeSls = MSBBL_SlsSchdService.crtSls_Schd_Upd03();
			MSBEL_ShipSchdService.ShipSchd_Upd02 opeShip = MSBEL_ShipSchdService.crtShipSchd_Upd02();
			MCList<Sls_Schd_Upd03_DtlR> upd03L = MCList.create(Sls_Schd_Upd03_DtlR.class);
			
			int pegNo = 0;
			for (SlsAct_Upd01_DtlR slsActDR : _slsActDUpd01L) {
				if (MAC_DATA_CRUD_TYP.isDEL(slsActDR.data_crud_typ())) {
					MST_SLS_SCHD_R slsSchdR = MST_SLS_SCHD_R.create();
					MST_SLS_SCHD_R slsSchdR_t = MST_SLS_SCHD_R.create("T");
					MCQueryApiBuilder slsSchdR_bldr = MCQueryApiBuilder.create(slsSchdR_t);
					slsSchdR_bldr.setSelect(slsSchdR_t.abort_flg);
					dbSelectKey("MSLAL5160_MST_SLS_SCHD_S01", slsSchdR, slsSchdR_bldr, slsActDR);
					if (!isNull(slsActDR) && !isNull(slsActDR.purc_ddlv_po_no()) && slsSchdR.abort_flg()) {
						Sls_Schd_Upd03_DtlR upd03R = Sls_Schd_Upd03_DtlR.create();
						ShipSchd_DtlR shipSchdDtlR = ShipSchd_DtlR.create();
						upd03R.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						upd03R.sls_schd_no(slsActDR.sls_schd_no());
						upd03R.abort_flg(false);
						upd03R.base_unit_sls_qty(null);
						upd03L.add(upd03R);
						shipSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						shipSchdDtlR.peg_no(pegNo);
						shipSchdDtlR.ship_schd_no(slsActDR.ship_schd_no());
						shipSchdDtlR.abort_flg(false);
						shipSchdDtlR.cred_no_up_flg(true);
						MST_SHIP_SCHD_R shipSchdR = MST_SHIP_SCHD_R.create();
						MST_SHIP_SCHD_R shipSchdR_t = MST_SHIP_SCHD_R.create("T");
						MCQueryApiBuilder shipSchdR_bldr = MCQueryApiBuilder.create(shipSchdR_t);
						shipSchdR_bldr.setSelect(shipSchdR_t.ship_pr_no);
						dbSelectKey("MSLAL5160_MST_SHIP_SCHD_S01", shipSchdR, shipSchdR_bldr, slsActDR);
						shipSchdDtlR.ship_pr_no(shipSchdR.ship_pr_no());
						opeShip.up1().add(shipSchdDtlR);
						pegNo++;
					}
				}
			}
			
			if (upd03L.size() > 0) {
				String[] keys = new String[] {
						Sls_Schd_Upd03_DtlR.$data_crud_typ,
						Sls_Schd_Upd03_DtlR.$sls_schd_no,
						Sls_Schd_Upd03_DtlR.$abort_flg,
						Sls_Schd_Upd03_DtlR.$base_unit_sls_qty
				};
				MCList<Sls_Schd_Upd03_DtlR> tmpUpd03L = MCList.create(Sls_Schd_Upd03_DtlR.class);
				for (Sls_Schd_Upd03_DtlR upd03R : upd03L) {
					if (isNull(upd03R.base_unit_sls_qty())) {
						Comparable<?>[] vals = new Comparable[] {
								upd03R.data_crud_typ(),
								upd03R.sls_schd_no(),
								upd03R.abort_flg(),
								null
						};
						if (tmpUpd03L.subList(keys, vals).size() == 0) {
							tmpUpd03L.add(upd03R);
						}
					}
					else {
						tmpUpd03L.add(upd03R);
					}
				}
				opeSls.up0().setAll(tmpUpd03L);
				opeSls.exec();
			}
			
			if (!opeShip.up1().isEmpty()) {
				opeShip.up0().lot_chk_flg(false);
				opeShip.exec();
			}
			
		}
		
		/**
		 * 	与信サービス呼出（取消）
		 */
		protected void callCredSvUpd01Del() {
			
			MSBGL_CredService.Cred_Upd01 ope = MSBGL_CredService.crtCred_Upd01();
			
			Cred_Upd01_CndR up0R = null;
			MCNumber credAmtSum = null;
			MCNumber credAmt = null;
			
			_slsActDCrudIdx = _slsActDUpd01L.createIndex(SlsAct_Upd01_DtlR.$data_crud_typ, SlsAct_Upd01_DtlR.$ext_purc_act_d_no, SlsAct_Upd01_DtlR.$ext_sys_cd);
			_slsActDCrudSchdIdx = _slsActDUpd01L.createIndex(SlsAct_Upd01_DtlR.$data_crud_typ, SlsAct_Upd01_DtlR.$sls_schd_no);
			
			MCList<AccptRecvIf_Chk01_DtlR> tgtChk01L = MCList.create(AccptRecvIf_Chk01_DtlR.class);
			for (AccptRecvIf_Chk01_DtlR chk01R : _chk01L) {
				if (!MAC_DATA_CRUD_TYP.isCRT(chk01R.data_crud_typ())) {
					SlsAct_Upd01_DtlR slsActDR = _slsActDUpd01L.getFirst(_slsActDCrudIdx, MAC_DATA_CRUD_TYP.DEL.value(), chk01R.ext_purc_act_d_no(), chk01R.ext_sys_cd());
					if (!isNull(slsActDR) && !isNull(slsActDR.slo_no())) {
						tgtChk01L.add(chk01R);
					}
				}
			}
			
			if (tgtChk01L.size() > 0) {
				MCIndexKey sloDIdx = _slsActDUpd01L.createIndex(SlsAct_Upd01_DtlR.$data_crud_typ, SlsAct_Upd01_DtlR.$slo_d_no, SlsAct_Upd01_DtlR.$ext_purc_act_d_no, SlsAct_Upd01_DtlR.$ext_sys_cd);
				initCstCache(_slsActUpd01L);
				MCIndexKey idxkey = tgtChk01L.createIndex(AccptRecvIf_Chk01_DtlR.$err_flg, AccptRecvIf_Chk01_DtlR.$cst_cd, AccptRecvIf_Chk01_DtlR.$fix_trd_cur_cd, AccptRecvIf_Chk01_DtlR.$fix_trd_ptn_typ);
				
				for (AccptRecvIf_Chk01_DtlR grpR : tgtChk01L.groupBy(AccptRecvIf_Chk01_DtlR.$cst_cd, AccptRecvIf_Chk01_DtlR.$fix_trd_cur_cd, AccptRecvIf_Chk01_DtlR.$fix_trd_ptn_typ)) {
					
					credAmtSum = MCNumber.ZERO;
					up0R = Cred_Upd01_CndR.create();
					
					up0R.cst_cd(grpR.cst_cd());
					up0R.cur_cd(grpR.fix_trd_cur_cd());
					up0R.trd_ptn_typ(grpR.fix_trd_ptn_typ());
					up0R.cred_upd_typ(MSC_CRED_UPD_TYP.UPD.value());
					
					MCList<AccptRecvIf_Chk01_DtlR> subDtlL = tgtChk01L.subList(idxkey, false, grpR.cst_cd(), grpR.fix_trd_cur_cd(), grpR.fix_trd_ptn_typ());
					
					for (AccptRecvIf_Chk01_DtlR dtlR : subDtlL) {
						if (dtlR.iv_flg() && !dtlR.ddlvTgtFlg()) {
							continue;
						}
						if (!isNull(dtlR.fix_slo_no())) {
							if (dtlR.ddlvTgtFlg() && !dtlR.iv_flg()) {
								MCList<SlsAct_Upd01_DtlR> tmpL = _slsActDUpd01L.subList(sloDIdx, MAC_DATA_CRUD_TYP.DEL.value(), dtlR.fix_slo_d_no(), dtlR.ext_purc_act_d_no(), dtlR.ext_sys_cd());
								
								for (SlsAct_Upd01_DtlR tmpR : tmpL) {
									credAmtSum = credAmtSum.add(tmpR.trd_cur_tax_amt());
									credAmtSum = credAmtSum.add(tmpR.trd_cur_amt());
								}
							}
							else if (!isNull(dtlR.fix_sls_schd_no())){
								credAmt = calcCredAmt(dtlR.fix_sls_schd_no(), null,
										dtlR.sync_flg(), dtlR.ddlvTgtFlg(), MAC_DATA_CRUD_TYP.DEL.value(), dtlR.ext_sys_cd(), dtlR.ext_purc_act_d_no());
								
								credAmtSum = credAmtSum.add(dtlR.dscnt_itm_flg() ? credAmt.negate() : credAmt);
							}
						}
					}
					
					up0R.amt(credAmtSum);
					
					ope.up0().add(up0R);
				}
				
				if (!ope.up0().isEmpty()) {
					ope.exec();
				}
			}
		}
		
		/**
		 * 	受払実績サービス呼出
		 */
		protected void callIoActSvUpd01() {
			MSBEL_IoActService.crtIoAct_Upd01().exec();
		}
		
		/**
		 * 	与信サービス呼出（受注紐付き）
		 */
		protected void callCredSvUpd01() {
			
			MSBGL_CredService.Cred_Upd01 ope = MSBGL_CredService.crtCred_Upd01();
			
			Cred_Upd01_CndR up0R = null;
			MCNumber credAmtSum = null;
			MCNumber credAmt = null;
			
			MCList<AccptRecvIf_Chk01_DtlR> tgtChk01L = MCList.create(AccptRecvIf_Chk01_DtlR.class);
			for (AccptRecvIf_Chk01_DtlR chk01R : _chk01L) {
				if (!MAC_DATA_CRUD_TYP.isDEL(chk01R.data_crud_typ()) && !isNull(chk01R.fix_slo_no()) && !chk01R.accpt_dfct_flg() && !chk01R.err_flg()) {
					tgtChk01L.add(chk01R);
				}
			}
			
			MCIndexKey idxkey = tgtChk01L.createIndex(AccptRecvIf_Chk01_DtlR.$err_flg, AccptRecvIf_Chk01_DtlR.$cst_cd, AccptRecvIf_Chk01_DtlR.$fix_trd_cur_cd, AccptRecvIf_Chk01_DtlR.$fix_trd_ptn_typ);
			_slsActDCrudIdx = _slsActDUpd01L.createIndex(SlsAct_Upd01_DtlR.$data_crud_typ, SlsAct_Upd01_DtlR.$ext_purc_act_d_no, SlsAct_Upd01_DtlR.$ext_sys_cd);
			MCIndexKey sloDIdx = _slsActDUpd01L.createIndex(SlsAct_Upd01_DtlR.$data_crud_typ, SlsAct_Upd01_DtlR.$slo_d_no, SlsAct_Upd01_DtlR.$ext_purc_act_d_no, SlsAct_Upd01_DtlR.$ext_sys_cd);
			initCstCache(_slsActUpd01L);
			
			for (AccptRecvIf_Chk01_DtlR grpR : tgtChk01L.groupBy(AccptRecvIf_Chk01_DtlR.$cst_cd, AccptRecvIf_Chk01_DtlR.$fix_trd_cur_cd, AccptRecvIf_Chk01_DtlR.$fix_trd_ptn_typ)) {
				
				credAmtSum = MCNumber.ZERO;
				up0R = Cred_Upd01_CndR.create();
				
				up0R.cst_cd(grpR.cst_cd());
				up0R.cur_cd(grpR.fix_trd_cur_cd());
				up0R.trd_ptn_typ(grpR.fix_trd_ptn_typ());
				up0R.cred_upd_typ(MSC_CRED_UPD_TYP.UPD.value());
				
				MCList<AccptRecvIf_Chk01_DtlR> subDtlL = tgtChk01L.subList(idxkey, false, grpR.cst_cd(), grpR.fix_trd_cur_cd(), grpR.fix_trd_ptn_typ());
				
				for (AccptRecvIf_Chk01_DtlR dtlR : subDtlL) {
					if (!isNull(dtlR.fix_sls_schd_no()) && !isNull(dtlR.fix_slo_no()) && (!dtlR.ddlvTgtFlg())) {
						credAmt = calcCredAmt(dtlR.fix_sls_schd_no(), dtlR.fix_base_unit_qty(),
								dtlR.sync_flg(), dtlR.ddlvTgtFlg(), dtlR.data_crud_typ(), dtlR.ext_sys_cd(), dtlR.ext_purc_act_d_no());
						
						credAmtSum = credAmtSum.add(dtlR.dscnt_itm_flg() ? credAmt.negate() : credAmt);
					}
					else {	
						MCList<SlsAct_Upd01_DtlR> tmpL = _slsActDUpd01L.subList(sloDIdx, MAC_DATA_CRUD_TYP.CRT.value(), dtlR.fix_slo_d_no(), dtlR.ext_purc_act_d_no(), dtlR.ext_sys_cd());
						for (SlsAct_Upd01_DtlR tmpR : tmpL) {
							SlsAct_Upd01_HdrR hdrR = _slsActUpd01L.getFirst(SlsAct_Upd01_HdrR.$hdr_peg_no, tmpR.hdr_peg_no());
							MAM_CUR_R trdCurR = getCur(hdrR.trd_cur_cd());
							MAM_BP_R tmpBpR = getCstCache(hdrR.cst_cd());
							MCRow amtR = MAUCL_AmtUtil.getAmtAndTax(
									tmpR.trd_cur_upri(),
									tmpR.trd_unit_qty(),
									tmpR.tax_rate(),
									tmpR.inc_tax_flg(),
									trdCurR.amt_dec_place(),
									tmpBpR.sls_amt_rnd_typ(),
									tmpBpR.sls_tax_rnd_typ(),
									tmpR.trd_cur_dscnt_amt());
							credAmtSum = credAmtSum.add(amtR.getNumber("inc_tax_amt").multiply(-1));
						}
					}
				}
				
				up0R.amt(credAmtSum);
				
				ope.up0().add(up0R);
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		protected MCMessageList lnkMsgToIf(MCMessageList msgPool, MCList<AccptRecvIf_Upd04_DtlR> accptRecvIfL) {
			// メッセージを紐付ける対象はエラーが発生していないＩＦデータのみ
			MCList<AccptRecvIf_Upd04_DtlR> ifL = accptRecvIfL.subList(r -> !isErr(r.accpt()));
			if (ifL.isEmpty()) {
				return msgPool;
			}
			
			// 発生したメッセージをＩＦデータに紐付ける			
			MCMessageList msgL = new MCMessageList();
			for (MCMessage msg : msgPool) {
				if (isCredMsg(msg) || isInterimMsg(msg)) {
					ifL.forEach(ifR -> {
						msgL.add(new MCMessage(ifR, null, msg.getID(), (Object[])msg.getBindArray()));
					});
				}
				else {
					msgL.add(msg);
				}
			}
			return msgL;
		}
		protected boolean isCredMsg(MCMessage msg) {
			return isSame(msg.getID(), MSBGL0026);
		}
		protected boolean isInterimMsg(MCMessage msg) {
			return isSame(msg.getID(), MSBBL0642);
		}
		
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
		protected MAM_BP_R getCstCache(String cst_cd) {
			return _cacheBp.get(cst_cd);
		}
		protected void initCstCache(MCList<SlsAct_Upd01_HdrR> hdrL) {
			_cacheBp = null;
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(MCQueryApiBuilder.create(MAM_BP_R.create("T")), hdrL, SlsAct_Upd01_HdrR.$cst_cd);
		}
		
		/**
		 * 与信戻し金額の算出
		 */
		protected MCNumber calcCredAmt(String slsSchdNo, MCNumber baseUnitQty, boolean sync_flg, boolean ddlvTgtFlg, String dataCrudTyp, String extSysCd, String extPurcActDNo) {
			
			MCNumber credAmt = MCNumber.ZERO;
			MCNumber oldBaseUnitQty = MCNumber.ZERO;
			MCNumber baseCmplQty = MCNumber.ZERO;
			
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();
			
			ConvQtyAmtUtil_Calc01_HdrR up0R = ConvQtyAmtUtil_Calc01_HdrR.create();
			
			getCredSrcBySlsSchd(up0R, slsSchdNo);
			
			if (isNull(baseUnitQty) && MAC_DATA_CRUD_TYP.isDEL(dataCrudTyp)) {
				baseUnitQty = MCNumber.ZERO;
				oldBaseUnitQty = _slsActDUpd01L.getFirst(_slsActDCrudIdx, MAC_DATA_CRUD_TYP.DEL.value(), extPurcActDNo, extSysCd).base_unit_qty();
			}
			
			if (MAC_DATA_CRUD_TYP.isUPD(dataCrudTyp)) {
				SlsAct_Upd01_DtlR slsActDR = _slsActDUpd01L.getFirst(_slsActDCrudIdx, MAC_DATA_CRUD_TYP.DEL.value(), extPurcActDNo, extSysCd);
				if (!isNull(slsActDR)) {
					baseCmplQty = up0R.getNumber("base_unit_cmpl_qty").subtract(slsActDR.base_unit_qty());
					oldBaseUnitQty = MCNumber.ZERO;
					if (isNull(baseUnitQty)) {
						baseUnitQty = slsActDR.base_unit_qty();
					}
				}
				else {
					baseCmplQty = up0R.getNumber("base_unit_cmpl_qty");
					if (isNull(baseUnitQty)) {
						SlsAct_Upd01_DtlR crtSlsActDR = _slsActDUpd01L.getFirst(_slsActDCrudIdx, MAC_DATA_CRUD_TYP.UPD.value(), extPurcActDNo, extSysCd);
						if (!isNull(crtSlsActDR)) {
							baseUnitQty = crtSlsActDR.base_unit_qty();
						}
					}
				}
			}
			else {
				baseCmplQty = up0R.getNumber("base_unit_cmpl_qty");
			}
			
			MCNumber retQty = MCNumber.ZERO;
			if (sync_flg && ddlvTgtFlg) {
				retQty = MCNumber.max(baseUnitQty, up0R.getNumber("sls_schd_qty"));
			}
			else {
				retQty = up0R.getNumber("sls_schd_qty");
			}
			
			MCNumber credRetQty = calcCredRetQty(retQty, baseCmplQty, baseUnitQty, oldBaseUnitQty);
			
			if (!credRetQty.isZero()) {
					
				setPegNo(up0R);
				
				ConvQtyAmtUtil_Calc01_Dtl1R up1R = ConvQtyAmtUtil_Calc01_Dtl1R.create();
				
				up1R.hdr_peg_no(up0R.peg_no());
				setPegNo(up1R);
				
				up1R.trd_unit_qty(credRetQty);
				up1R.trd_unit_cd(up0R.getString("base_unit_cd"));
				up1R.trd_unit_conv_base_qty(1);
				up1R.trd_unit_conv_qty(1);
				
				ope.up0().add(up0R);
				ope.up1().add(up1R);
				
				ope.exec();
				
				if (!ope.down0().isEmpty()) {
					credAmt = ope.down0().get(0).trd_cur_inc_tax_amt();
				}
			}
			
			return credAmt;
		}
		
		/**
		 * 与信戻し数量の算出
		 */
		protected MCNumber calcCredRetQty(MCNumber slsSchdQty, MCNumber cmplQty, MCNumber baseUnitQty, MCNumber oldBaseUnitQty) {
			
			MCNumber oldSlsRemQty = slsSchdQty.subtract(cmplQty);
			oldSlsRemQty = oldSlsRemQty.isNegative() ? MCNumber.ZERO : oldSlsRemQty;
			
			MCNumber slsRemQty = slsSchdQty.subtract(cmplQty.add(baseUnitQty.subtract(oldBaseUnitQty)));
			slsRemQty = slsRemQty.isNegative() ? MCNumber.ZERO : slsRemQty;
			
			return slsRemQty.subtract(oldSlsRemQty);
		}
		
		/**
		 * 輸出実績サービス呼出
		 */
		protected void callExActSvUpd02() {
			MSBEL_ExActService.ExAct_Upd02 ope = MSBEL_ExActService.crtExAct_Upd02();
			ExAct_Upd02_DtlR oUp0;
			MCList<AccptRecvIf_Chk01_DtlR> ivGrL = _chk01L.groupBy(
					AccptRecvIf_Chk01_DtlR.$err_flg,
					AccptRecvIf_Chk01_DtlR.$data_crud_typ,
					AccptRecvIf_Chk01_DtlR.$ivDdlvTgtFlg,
					AccptRecvIf_Chk01_DtlR.$peg_no,
					AccptRecvIf_Chk01_DtlR.$iv_flg,
					AccptRecvIf_Chk01_DtlR.$dlv_slip_no,
					AccptRecvIf_Chk01_DtlR.$via_dlv_typ);
			for (AccptRecvIf_Chk01_DtlR dtlR : ivGrL) {
				if (!dtlR.err_flg() && dtlR.iv_flg() && !isNullOrNullVal(dtlR.dlv_slip_no()) && !MAC_VIA_DLV_TYP.isVIA(dtlR.via_dlv_typ())) {
					oUp0 = ExAct_Upd02_DtlR.create();
					oUp0.peg_no(dtlR.peg_no());
					oUp0.iv_no(dtlR.dlv_slip_no());
					if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						oUp0.cmpl_flg(false);
					}
					else {
						oUp0.cmpl_flg(true);
					}
					ope.up0().add(oUp0);
				}
			}
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		
		/**
		 * 仕入実績登録サービス呼出
		 */
		protected void callPurcActSvUpd02() {
			MSBDL_PurcActRegService.Purc_Upd02 ope = MSBDL_PurcActRegService.crtPurc_Upd02();
			
			// 仕入実績登録サービス呼出電文作成
			makeOpeData(ope);
			// 仕入実績登録サービス呼出
			callOpe(ope);
		}
		
		/**
		 * 仕入実績登録サービス呼出電文作成
		 */
		protected void makeOpeData(MSBDL_PurcActRegService.Purc_Upd02 ope) {
			int hdrPegNo = 0;
			MCIndexKey idx = _slsActDUpd01L.createIndex(SlsAct_Upd01_DtlR.$data_crud_typ, SlsAct_Upd01_DtlR.$ext_purc_act_d_no, SlsAct_Upd01_DtlR.$ext_sys_cd);
			for (AccptRecvIf_Chk01_DtlR chkR : _chk01L) {
				if (!chkR.err_flg() && chkR.sync_flg()) {
					String dataCrudTyp =  MAC_DATA_CRUD_TYP.CRT.value();
					if (MAC_DATA_CRUD_TYP.isDEL(chkR.data_crud_typ())) {
						dataCrudTyp = MAC_DATA_CRUD_TYP.DEL.value();
					}
					MCList<SlsAct_Upd01_DtlR> slsActDtlL = _slsActDUpd01L.subList(idx, dataCrudTyp, chkR.ext_purc_act_d_no(), chkR.ext_sys_cd());
					String[] sameKeys = new String[] {
							AccptRecvIf_Chk01_DtlR.$ext_sys_cd, AccptRecvIf_Chk01_DtlR.$ext_purc_act_d_no
					};
					for (SlsAct_Upd01_DtlR tmpSlsActDR : _slsActDUpd01L) {
						if (tmpSlsActDR.getBooleanNE("addFlg")) {
							continue;
						}
						if (isNull(tmpSlsActDR.getNumberNE("upd_purc_peg_no"))) {
							continue;
						}
						Comparable<?>[] sameVals = new Comparable[] {
								tmpSlsActDR.ext_sys_cd(), tmpSlsActDR.ext_purc_act_d_no()
						};
						if (MAC_DATA_CRUD_TYP.isCRT(tmpSlsActDR.data_crud_typ()) 
								&& ((isSame(tmpSlsActDR.ext_sys_cd(), chkR.ext_sys_cd()) && !isSame(tmpSlsActDR.ext_purc_act_d_no(), chkR.ext_purc_act_d_no()))
								|| (!isSame(tmpSlsActDR.ext_sys_cd(), chkR.ext_sys_cd()) && isSame(tmpSlsActDR.ext_purc_act_d_no(), chkR.ext_purc_act_d_no())))
								&& isNull(_chk01L.subList(sameKeys, sameVals))
								&& isSame(tmpSlsActDR.slo_no(), chkR.fix_slo_no())) {
							slsActDtlL.add(tmpSlsActDR);
							tmpSlsActDR.setBooleanNE("addFlg", true);
						}
					}
					slsActDtlL.sort("upd_purc_peg_no");
					slsActDtlL.addNumberColumn("purcPegNo");
					for (SlsAct_Upd01_DtlR slsActDtlR : slsActDtlL) {
						if (isNull(slsActDtlR.purc_ddlv_po_no())) {
							continue;
						}
						Purc_Ins01_HdrR opeHdr = ope.up1().createRow();
						opeHdr.peg_no(hdrPegNo);
						ope.up1().add(opeHdr);
						
						Purc_Ins01_DtlR opeDtl = ope.up2().createRow();
						opeDtl.peg_no(hdrPegNo);
						ope.up2().add(opeDtl);
						
						Purc_Ins01_IoR opeIo = ope.up3().createRow();
						opeIo.peg_no(hdrPegNo);
						ope.up3().add(opeIo);
						slsActDtlR.setNumberNE("purcPegNo", hdrPegNo);
						hdrPegNo++;
					}
					if (MAC_DATA_CRUD_TYP.isUPD(chkR.data_crud_typ())) {
						int delCnt = _slsActDUpd01L.subList(idx, MAC_DATA_CRUD_TYP.DEL.value(), chkR.ext_purc_act_d_no(), chkR.ext_sys_cd()).size();
						int updCnt = _slsActDUpd01L.subList(idx, MAC_DATA_CRUD_TYP.CRT.value(), chkR.ext_purc_act_d_no(), chkR.ext_sys_cd()).size();
						int diffCnt = delCnt - updCnt;
						if (diffCnt > 0) {
							for (int i = 0; i < diffCnt; i++) {
								Purc_Ins01_HdrR opeHdr = ope.up1().createRow();
								opeHdr.peg_no(hdrPegNo);
								ope.up1().add(opeHdr);
								
								Purc_Ins01_DtlR opeDtl = ope.up2().createRow();
								opeDtl.peg_no(hdrPegNo);
								ope.up2().add(opeDtl);
								
								Purc_Ins01_IoR opeIo = ope.up3().createRow();
								opeIo.peg_no(hdrPegNo);
								ope.up3().add(opeIo);
								hdrPegNo++;
							}
						}
					}
				}
			}
		}
		
		/**
		 * 仕入実績登録サービス呼出メイン
		 */
		protected void callOpe(MSBDL_PurcActRegService.Purc_Upd02 ope) {
			if (!ope.up1().isEmpty()) {
				ope.up0().purc_ddlv_reg_exec_flg(true);
				ope.up0().amt_calc_flg(true);
				// 仕入実績登録サービス呼出
				ope.exec();
				// 仕入実績登録サービス呼出結果取得
				setAfterCall(ope);
			}
		}
		
		/**
		 * 仕入実績登録サービス呼出結果取得
		 */
		protected void setAfterCall(MSBDL_PurcActRegService.Purc_Upd02 ope) {
			MCIndexKey ioIdx = _slsActIoUpd01L.createIndex(SlsAct_Upd01_IoR.$hdr_peg_no, SlsAct_Upd01_IoR.$dtl_peg_no);
			// 売上実績明細・詳細に仕入実績サービスからの下り電文の値をコピーする
			MCList<AccptRecvIf_Chk01_DtlR> tmpL = MCList.create(AccptRecvIf_Chk01_DtlR.class);
			String[] sameKeys = new String[] {
					SlsAct_Upd01_DtlR.$ext_sys_cd, SlsAct_Upd01_DtlR.$ext_purc_act_d_no
			};
			for (AccptRecvIf_Chk01_DtlR chkR : _chk01L) {
				if (chkR.err_flg() || chkR.accpt_dfct_flg() || !MAC_DATA_CRUD_TYP.isCRT(chkR.data_crud_typ())) {
					continue;
				}
				Comparable<?>[] sameVals = new Comparable[] {
						chkR.ext_sys_cd(), chkR.ext_purc_act_d_no()
				};
				if (chkR.ddlvTgtFlg() && chkR.sync_flg()) {
					MCList<SlsAct_Upd01_DtlR> slsActDtlL = _slsActDUpd01L.subList(sameKeys, sameVals);
					for (SlsAct_Upd01_DtlR slsActDtlR : slsActDtlL) {
						for (Purc_Ins01_HdrR purcHdrR : ope.down0()) {
							if (isSame(slsActDtlR.getNumberNE("purcPegNo"), purcHdrR.peg_no())) {
								slsActDtlR.purc_act_no(purcHdrR.purc_act_no());
							}
						}
						for (Purc_Ins01_DtlR purcDtlR : ope.down1()) {
							if (isSame(slsActDtlR.getNumberNE("purcPegNo"), purcDtlR.peg_no())) {
								slsActDtlR.purc_act_d_no(purcDtlR.purc_act_d_no());
							}
						}
						MCList<SlsAct_Upd01_IoR> slsActIoL = _slsActIoUpd01L.subList(ioIdx, slsActDtlR.hdr_peg_no(), slsActDtlR.dtl_peg_no());
						for (SlsAct_Upd01_IoR slsActIoR : slsActIoL) {
							for (Purc_Ins01_IoR purcIoR : ope.down2()) {
								if (isSame(slsActDtlR.getNumberNE("purcPegNo"), purcIoR.peg_no())) {
									slsActIoR.purc_act_io_no(purcIoR.purc_act_io_no());
									slsActIoR.arr_act_no(purcIoR.arr_act_no());
									slsActIoR.sync_flg(true);
								}
							}
						}
						AccptRecvIf_Chk01_DtlR tmpR = AccptRecvIf_Chk01_DtlR.create();
						tmpR.fix_slo_d_no(chkR.fix_slo_d_no());
						tmpR.purc_act_d_no(slsActDtlR.purc_act_d_no());
						tmpL.add(tmpR);
					}
				}
			}
			if (!isNull(tmpL)) {
				MCList<MST_SLS_SCHD_R> tmpSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
				MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
				MCQueryApiBuilder tmpSlsSchdL_bldr = MCQueryApiBuilder.create(t);
				tmpSlsSchdL_bldr.setSelect(t.sls_schd_no);
				tmpSlsSchdL_bldr.addSelect(t.ship_schd_no);
				tmpSlsSchdL_bldr.addSelect(t.purc_act_d_no);
				tmpSlsSchdL_bldr.addSelect(t.slo_d_no);
				tmpSlsSchdL_bldr.setWhere(t.purc_act_d_no.eq(bind("purc_act_d_no")));
				tmpSlsSchdL_bldr.addWhereWithAnd(t.slo_d_no.eq(bind("fix_slo_d_no")));
				dbSelect("MSLAL5160_MST_SLS_SCHD_S02", tmpSlsSchdL, tmpSlsSchdL_bldr, tmpL);
				
				MCIndexKey tgtSlsActDIdx = _slsActDUpd01L.createIndex(SlsAct_Upd01_DtlR.$data_crud_typ, SlsAct_Upd01_DtlR.$purc_act_d_no);
				for (MST_SLS_SCHD_R tmpSlsSchdR : tmpSlsSchdL) {
					SlsAct_Upd01_DtlR slsActDR = _slsActDUpd01L.getFirst(tgtSlsActDIdx, MAC_DATA_CRUD_TYP.CRT.value(), tmpSlsSchdR.purc_act_d_no());
					slsActDR.ship_schd_no(tmpSlsSchdR.ship_schd_no());
					slsActDR.sls_schd_no(tmpSlsSchdR.sls_schd_no());
				}
			}
			
			boolean updFlg = false;
			for (SlsAct_Upd01_DtlR slsActDR : _slsActDUpd01L) {
				if (MAC_DATA_CRUD_TYP.isCRT(slsActDR.data_crud_typ()) && !isNull(slsActDR.getNumberNE("purcPegNo")) && !isNull(slsActDR.getNumberNE("upd_purc_peg_no"))) {
					updFlg = true;
					for (Purc_Ins01_DtlR purcDtlR : ope.down1()) {
						if (isSame(slsActDR.getNumberNE("upd_purc_peg_no"), purcDtlR.peg_no())) {
							slsActDR.purc_act_no(purcDtlR.purc_act_no());
							slsActDR.purc_act_d_no(purcDtlR.purc_act_d_no());
						}
					}
					
					for (Purc_Ins01_IoR purcIoR : ope.down2()) {
						if (isSame(slsActDR.getNumberNE("upd_purc_peg_no"), purcIoR.peg_no())) {
							SlsAct_Upd01_IoR slsActIoR = _slsActIoUpd01L.getFirst(_slsActIoIdx, slsActDR.hdr_peg_no(), slsActDR.dtl_peg_no());
							slsActIoR.purc_act_io_no(purcIoR.purc_act_io_no());
							slsActIoR.arr_act_no(purcIoR.arr_act_no());
							slsActIoR.sync_flg(true);
						}
					}
				}
			}
			
			if (updFlg) {
				MCIndexKey tgtIdx = _slsActDUpd01L.createIndex(SlsAct_Upd01_DtlR.$data_crud_typ);
				MCList<SlsAct_Upd01_DtlR> tgtslsActDL = _slsActDUpd01L.subList(tgtIdx, MAC_DATA_CRUD_TYP.CRT.value());
				
				MCList<MST_SLS_SCHD_R> tmpSlsSchdUpd = MCList.create(MST_SLS_SCHD_R.class);
				MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
				MCQueryApiBuilder tmpSlsSchdUpd_bldr = MCQueryApiBuilder.create(t);
				tmpSlsSchdUpd_bldr.setSelect(t.sls_schd_no);
				tmpSlsSchdUpd_bldr.addSelect(t.ship_schd_no);
				tmpSlsSchdUpd_bldr.addSelect(t.purc_act_d_no);
				tmpSlsSchdUpd_bldr.addSelect(t.slo_d_no);
				tmpSlsSchdUpd_bldr.setWhere(t.purc_act_d_no.eq(bind("purc_act_d_no")));
				tmpSlsSchdUpd_bldr.addWhereWithAnd(t.slo_d_no.eq(bind("slo_d_no")));
				dbSelect("MSLAL5160_MST_SLS_SCHD_S03", tmpSlsSchdUpd, tmpSlsSchdUpd_bldr, tgtslsActDL);
				
				MCIndexKey tmpSlsSchedUpdKey = tmpSlsSchdUpd.createIndex(MST_SLS_SCHD_R.$slo_d_no, MST_SLS_SCHD_R.$purc_act_d_no);
				
				for (SlsAct_Upd01_DtlR slsActDR : tgtslsActDL) {
					if (!isNull(slsActDR.getNumberNE("upd_purc_peg_no"))) {
						MST_SLS_SCHD_R tmpSlsSchdR = tmpSlsSchdUpd.getFirst(tmpSlsSchedUpdKey, slsActDR.slo_d_no(), slsActDR.purc_act_d_no());
						if (!isNull(tmpSlsSchdR)) {
							slsActDR.ship_schd_no(tmpSlsSchdR.ship_schd_no());
							slsActDR.sls_schd_no(tmpSlsSchdR.sls_schd_no());
						}
					}
				}
			}
		}
		
		/**
		 * 検収受信ＩＦ取込チェックを実行
		 */
		protected void callThisChk01(MCList<AccptRecvIf_Upd04_DtlR> accptRecvIfL) {
			_accptRecvIfChk = MSLAL_AccptRecvIfService.crtAccptRecvIf_Chk01();
			setAll(_accptRecvIfChk.up0(), accptRecvIfL, createMap_AccptRecvIf_Chk01_DtlR_AccptRecvIf_Upd04_DtlR());
			_accptRecvIfChk.exec();
			
			MCIndexKey idxkey = _accptRecvIfChk.down0().createIndex(AccptRecvIf_Chk01_DtlR.$data_lno);
			
			for (AccptRecvIf_Upd04_DtlR dtlR : accptRecvIfL) {
				AccptRecvIf_Chk01_DtlR chkRsltR = _accptRecvIfChk.down0().getFirst(idxkey, dtlR.data_lno());
				
				if (chkRsltR.err_flg()) {
					setErrSts(dtlR.accpt());
				}
				
				// プッシュ通知用
				dtlR.sls_usr_cd(chkRsltR.sls_usr_cd());
				dtlR.wg_cd(chkRsltR.wg_cd());
			}
			
			chkGrpErr(accptRecvIfL);
			chkPrevErr(accptRecvIfL);
			
			_chk01L.clear();
			_slsActUpd01L.clear();
			_slsActDUpd01L.clear();
			_slsActIoUpd01L.clear();
			
			_chk01L.addAll(_accptRecvIfChk.down0());
			_slsActUpd01L.addAll(_accptRecvIfChk.down1());
			_slsActUpd01L.setBoolean(SlsAct_Upd01_HdrR.$amt_calc_flg, true);
			_slsActDUpd01L.addNumberColumn("upd_purc_peg_no");
			for (AccptRecvIf_Chk01_SlsAct_Upd01_DtlR dtlR : _accptRecvIfChk.down2()) {
				SlsAct_Upd01_DtlR dtlUpdR = SlsAct_Upd01_DtlR.create();
				copy(dtlUpdR, dtlR, createMap_SlsAct_Upd01_DtlR_AccptRecvIf_Chk01_SlsAct_Upd01_DtlR());
				_slsActDUpd01L.add(dtlUpdR);
			}
			_slsActIoUpd01L.addAll(_accptRecvIfChk.down3());
			
			_slsActDIdx = _slsActDUpd01L.createIndex(SlsAct_Upd01_DtlR.$ext_purc_act_d_no, SlsAct_Upd01_DtlR.$ext_sys_cd);
			_slsActDCrudIdx = _slsActDUpd01L.createIndex(SlsAct_Upd01_DtlR.$data_crud_typ, SlsAct_Upd01_DtlR.$ext_purc_act_d_no, SlsAct_Upd01_DtlR.$ext_sys_cd);
			_slsActIoIdx = _slsActIoUpd01L.createIndex(SlsAct_Upd01_IoR.$hdr_peg_no, SlsAct_Upd01_IoR.$dtl_peg_no);
			makeCalcHdr01L(_accptRecvIfChk.down4());
		}
		
		protected void chkPrevErr(MCList<AccptRecvIf_Upd04_DtlR> list) {
			
			for (AccptRecvIf_Upd04_DtlR row : list) {
				if (!isErr(row.accpt())) {
					if (object(CLAZZ)._errSet.contains(createErrSetKey(row.accpt()))) {
						setErrSts(row.accpt());
						MCMessagePool.add(row, null, MSLAL0412, row.data_no(),
								row.data_lno(), row.cst_cd(), row.dlv_slip_no(),
								row.cst_po_no());
					}
				}
			}
		}
		
		protected Map_SlsAct_Upd01_DtlR_AccptRecvIf_Chk01_SlsAct_Upd01_DtlR<SlsAct_Upd01_DtlR,AccptRecvIf_Chk01_SlsAct_Upd01_DtlR> createMap_SlsAct_Upd01_DtlR_AccptRecvIf_Chk01_SlsAct_Upd01_DtlR() {
			return new Map_SlsAct_Upd01_DtlR_AccptRecvIf_Chk01_SlsAct_Upd01_DtlR<SlsAct_Upd01_DtlR, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR>();
		}

		public class Map_SlsAct_Upd01_DtlR_AccptRecvIf_Chk01_SlsAct_Upd01_DtlR<D extends SlsAct_Upd01_DtlR, S extends AccptRecvIf_Chk01_SlsAct_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_DtlR.$hdr_peg_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dtl_peg_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dtl_peg_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$data_crud_typ, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$data_crud_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_seq, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$disp_seq, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$disp_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cd, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_sundry_flg, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_sundry_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_nm, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_zip_cd, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_zip_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr1, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_addr1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr2, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_addr2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr3, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_addr3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr4, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_addr4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_dpt, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_cntct_dpt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_psn, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_cntct_psn);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_tel, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_tel);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_fax, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_fax);
				addColumnPathMap(SlsAct_Upd01_DtlR.$pri_prnt_flg, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$pri_prnt_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd1, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dest_cd1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd2, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dest_cd2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd3, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dest_cd3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cd, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_sundry_flg, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_sundry_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_nm, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_zip_cd, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_zip_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr1, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_addr1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr2, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_addr2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr3, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_addr3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr4, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_addr4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_tel, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_tel);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_fax, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_fax);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cntct_dpt, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_cntct_dpt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cntct_psn, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_cntct_psn);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_cd, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub1, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub2, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub3, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sno1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sno2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sno3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sno4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_nm, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$iv_itm_nm, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$iv_itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cntry_org_cd, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$cntry_org_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$loc_cd, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$loc_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$str_ln_cd, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$str_ln_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$lot_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$lot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sublot_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$gd_cd, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$gd_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_cd, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_qty, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_cd, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_qty, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_upri, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$trd_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_amt, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$trd_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$upri_not_tgt_flg, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$upri_not_tgt_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$interim_flg, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$interim_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_cd, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tax_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$inc_tax_flg, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$inc_tax_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_rate, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tax_rate);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_typ, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tax_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_tax_amt, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$trd_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cost_upri, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$cost_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cost_amt, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$cost_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_dscnt_amt, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$trd_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bill_crryovr_times, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$bill_crryovr_times);
				addColumnPathMap(SlsAct_Upd01_DtlR.$stk_mng_typ, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$stk_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sundry_itm_flg, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sundry_itm_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1_mng_typ, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sno1_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2_mng_typ, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sno2_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3_mng_typ, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sno3_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4_mng_typ, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sno4_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_jnl_cd, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$itm_jnl_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_po_d_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$cst_po_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_cd, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$cst_itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_nm, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$cst_itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_d_rmrks, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$trd_d_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$intr_rmrks, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$intr_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$rsn_cd, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bd_dpt_cd, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$bd_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_rate, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$wtax_rate);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$slo_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_d_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$slo_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_ret_schd_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sls_ret_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_ret_schd_d_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sls_ret_schd_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_schd_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$ship_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_schd_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sls_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$qtn_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_rev, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$qtn_rev);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_d_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$qtn_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$purc_ddlv_po_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_d_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$purc_ddlv_po_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$purc_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_d_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$purc_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$iv_d_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$iv_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char1, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char2, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char3, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dscnt_rsn_cd, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dscnt_rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$ref_sls_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_seq, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$ref_sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_d_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$ref_sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_d_seq, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$ref_sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_slip_d_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_slip_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_schd_abort_flg, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sls_schd_abort_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ext_purc_act_d_no, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$ext_purc_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ext_sys_cd, AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$ext_sys_cd);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.setNumberNE("upd_purc_peg_no", src.upd_purc_peg_no());
				dest.ship_dlv_slip_d_no(src.getStringNE("ship_dlv_slip_d_no"));
				dest.ship_dlv_slip_multi_flg(src.getBooleanNE("ship_dlv_slip_multi_flg"));
				dest.purc_ddlv_dlv_slip_d_no(src.getStringNE("purc_ddlv_dlv_slip_d_no"));
			}
		}
		
		protected void makeCalcHdr01L(MCList<AccptRecvIf_Chk01_Calc01HdrR> down4L) {
			
			initCalc01Hdr();
			for (AccptRecvIf_Chk01_Calc01HdrR down4R : down4L) {
				ConvQtyAmtUtil_Calc01_HdrR calc01HdrR = ConvQtyAmtUtil_Calc01_HdrR.create();
				copy(calc01HdrR, down4R, createMap_ConvQtyAmtUtil_Calc01_HdrR_AccptRecvIf_Chk01_Calc01HdrR());
				_calc01HdrL.add(calc01HdrR);
			}
			_calc01HdrL.sort(AccptRecvIf_Chk01_Calc01HdrR.$sls_schd_no);
			_idxCalc01HdrKey = _calc01HdrL.createIndex(LIST_INDEX_KEY_NM);
		}
		
		protected Map_ConvQtyAmtUtil_Calc01_HdrR_AccptRecvIf_Chk01_Calc01HdrR<ConvQtyAmtUtil_Calc01_HdrR,AccptRecvIf_Chk01_Calc01HdrR> createMap_ConvQtyAmtUtil_Calc01_HdrR_AccptRecvIf_Chk01_Calc01HdrR() {
			return new Map_ConvQtyAmtUtil_Calc01_HdrR_AccptRecvIf_Chk01_Calc01HdrR<ConvQtyAmtUtil_Calc01_HdrR, AccptRecvIf_Chk01_Calc01HdrR>();
		}
		
		public class Map_ConvQtyAmtUtil_Calc01_HdrR_AccptRecvIf_Chk01_Calc01HdrR<D extends ConvQtyAmtUtil_Calc01_HdrR, S extends AccptRecvIf_Chk01_Calc01HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$peg_no, AccptRecvIf_Chk01_Calc01HdrR.$peg_no);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$slip_each_lot_typ, AccptRecvIf_Chk01_Calc01HdrR.$slip_each_lot_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_cd, AccptRecvIf_Chk01_Calc01HdrR.$trd_unit_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_qty, AccptRecvIf_Chk01_Calc01HdrR.$trd_unit_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_upri, AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_upri);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_dscnt_amt, AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_dscnt_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_proc_upri, AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_proc_upri);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_onr_prov_upri, AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_onr_prov_upri);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_amt, AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_proc_amt, AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_proc_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_onr_prov_amt, AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_onr_prov_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_tax_amt, AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_tax_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_inc_tax_amt, AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_inc_tax_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$wtax_amt, AccptRecvIf_Chk01_Calc01HdrR.$wtax_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_dec_place, AccptRecvIf_Chk01_Calc01HdrR.$base_unit_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_rnd_typ, AccptRecvIf_Chk01_Calc01HdrR.$base_unit_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_qty, AccptRecvIf_Chk01_Calc01HdrR.$trd_unit_conv_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_base_qty, AccptRecvIf_Chk01_Calc01HdrR.$trd_unit_conv_base_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_cd, AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$tax_rate, AccptRecvIf_Chk01_Calc01HdrR.$tax_rate);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$wtax_rate, AccptRecvIf_Chk01_Calc01HdrR.$wtax_rate);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$inc_tax_flg, AccptRecvIf_Chk01_Calc01HdrR.$inc_tax_flg);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$act_tax_rate, AccptRecvIf_Chk01_Calc01HdrR.$act_tax_rate);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$act_inc_tax_flg, AccptRecvIf_Chk01_Calc01HdrR.$act_inc_tax_flg);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$amt_dec_place, AccptRecvIf_Chk01_Calc01HdrR.$amt_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$upri_dec_place, AccptRecvIf_Chk01_Calc01HdrR.$upri_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$amt_rnd_typ, AccptRecvIf_Chk01_Calc01HdrR.$amt_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$tax_rnd_typ, AccptRecvIf_Chk01_Calc01HdrR.$tax_rnd_typ);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.setNumberNE("sls_schd_qty", src.sls_schd_qty());
				dest.setNumberNE("base_unit_cmpl_qty", src.base_unit_cmpl_qty());
				dest.setStringNE("base_unit_cd", src.base_unit_cd());
				dest.setStringNE("sls_schd_no", src.sls_schd_no());
			}
		}
		
		/**
		 * 売上実績サービス呼出（取消）
		 * 
		 * @param accptRecvIfL 検収受信ＩＦリスト
		 */
		protected void callSlsActServiceDel(MCList<AccptRecvIf_Upd04_DtlR> accptRecvIfL) {
			MCIndexKey slsActUpd01Idxkey = _slsActUpd01L.createIndex(SlsAct_Upd01_HdrR.$data_crud_typ);
			MCIndexKey slsActDUpd01Idxkey = _slsActDUpd01L.createIndex(SlsAct_Upd01_DtlR.$data_crud_typ);
			MCIndexKey slsActIoUpd01Idxkey = _slsActIoUpd01L.createIndex(SlsAct_Upd01_IoR.$data_crud_typ);
			
			MSBBL_SlsActService.SlsAct_Upd01 opeDel = MSBBL_SlsActService.crtSlsAct_Upd01();
			opeDel.up0().addAll(_slsActUpd01L.subList(slsActUpd01Idxkey, MAC_DATA_CRUD_TYP.DEL.value()));
			opeDel.up1().addAll(_slsActDUpd01L.subList(slsActDUpd01Idxkey, MAC_DATA_CRUD_TYP.DEL.value()));
			opeDel.up2().addAll(_slsActIoUpd01L.subList(slsActIoUpd01Idxkey, MAC_DATA_CRUD_TYP.DEL.value()));
			_hdrDelL = opeDel.up0().clone();
			if (opeDel.up0().size() > 0) { 
				opeDel.exec();
			}
			
			setOk(accptRecvIfL);
		}
		
		/**
		 * 売上実績サービス呼出（新規）
		 * 
		 * @param accptRecvIfL 検収受信ＩＦリスト
		 */
		protected void callSlsActServiceCrt(MCList<AccptRecvIf_Upd04_DtlR> accptRecvIfL) {
			MCIndexKey slsActUpd01Idxkey = _slsActUpd01L.createIndex(SlsAct_Upd01_HdrR.$data_crud_typ);
			MCIndexKey slsActDUpd01Idxkey = _slsActDUpd01L.createIndex(SlsAct_Upd01_DtlR.$data_crud_typ);
			MCIndexKey slsActIoUpd01Idxkey = _slsActIoUpd01L.createIndex(SlsAct_Upd01_IoR.$data_crud_typ);
			
			MSBBL_SlsActService.SlsAct_Upd01 ope = MSBBL_SlsActService.crtSlsAct_Upd01();
			ope.up0().addAll(_slsActUpd01L.subList(slsActUpd01Idxkey, MAC_DATA_CRUD_TYP.CRT.value()));
			ope.up1().addAll(_slsActDUpd01L.subList(slsActDUpd01Idxkey, MAC_DATA_CRUD_TYP.CRT.value()));
			ope.up2().addAll(_slsActIoUpd01L.subList(slsActIoUpd01Idxkey, MAC_DATA_CRUD_TYP.CRT.value()));
			if (ope.up0().size() > 0) { 
				ope.exec();
			}
			_rsltL.setAll(ope.down0());
			_rsltDL.setAll(ope.down1());
			
			setOk(accptRecvIfL);
		}
		
		/**
		 * 更新処理例外発生時の後処理を行う。
		 * 
		 * @param ex 例外
		 * @param sp セーブポイント
		 * @param accptRecvIfL 検収受信ＩＦリスト
		 */
		protected void handleEx(Exception ex, MCSavepoint sp, MCList<AccptRecvIf_Upd04_DtlR> accptRecvIfL) {
			
			String msgId = null;
			String msg = null;
			MCMessageList causeMsgList = null;
			
			if (ex instanceof MCException) {
				
				MCException mcex = (MCException) ex;
				msgId = mcex.getID();
				msg = mcex.getMCMessage().toString();
				causeMsgList = mcex.getCauseMessageList();
			}
			else {
				
				msgId = ex instanceof MCException ? ((MCException) ex).getID() : null;
				msg = ex.toString();
				causeMsgList = new MCMessageList();
			}
			
			for (AccptRecvIf_Upd04_DtlR opeRow : accptRecvIfL) {
				
				MCMessagePool.add(opeRow, null, MSLAL0417, opeRow.data_no(), opeRow.data_lno(), msgId, msg);
				for (MCMessage causeMsg : causeMsgList) {
					MCMessage newMsg = new MCMessage(opeRow, null, causeMsg.getID(), (Object[])causeMsg.getBindArray());
					MCMessagePool.add(newMsg);
				}
				
				setErr(opeRow.accpt());
			}
			
			if (sp != null) {
				
				dbTran().rollback(sp);
			}
		}
		
		/**
		 * 同一取込単位のうち、エラーが存在するかどうかチェックする。<br>
		 * 一部でもエラーがあったら全てエラーとする。
		 * 
		 * @param accptRecvIfL 検収受信ＩＦリスト
		 */
		protected void chkGrpErr(MCList<AccptRecvIf_Upd04_DtlR> accptRecvIfL) {
			
			MCList<AccptRecvIf_Upd04_DtlR>[] grp = groupList(accptRecvIfL, getGrpKey());
			for (MCList<AccptRecvIf_Upd04_DtlR> grpL : grp) {
				AccptRecvIf_Upd04_DtlR errR = grpL.getFirst(AccptRecvIf_Upd04_DtlR.$exe_sts_typ, MAC_EXE_STS_TYP.ERR.value());
				if (errR != null) {
					for (AccptRecvIf_Upd04_DtlR accptRecvIfR : grpL) {
						if (!isErr(accptRecvIfR.accpt())) {
							MCMessagePool.add(accptRecvIfR, null, MSLAL0418, accptRecvIfR.data_no(), accptRecvIfR.data_lno(), accptRecvIfR.cst_cd(), accptRecvIfR.dlv_slip_no(), accptRecvIfR.cst_po_no());
							setErr(accptRecvIfR.accpt());
						}
					}
				}
			}
		}
		
		/**
		 * セーブポイントを作成する。
		 * 
		 * @return セーブポイント
		 */
		protected MCSavepoint setSavepoint() {
			return dbTran().setSavepoint();
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		/**
		 * 取込単位で検収受信ＩＦ情報をグループ化する。
		 * 
		 * @return 取込単位のグループ
		 */
		@SuppressWarnings("unchecked")	// 総称配列の警告回避
		protected MCList<AccptRecvIf_Upd04_DtlR>[] getGrp() {
			MCList<AccptRecvIf_Upd04_DtlR>[] arr = groupList(up0(), getGrpKey());
			List<MCList<AccptRecvIf_Upd04_DtlR>> ret = mergeNewDtlL(arr);
			return ret.toArray(new MCList[ret.size()]);
		}
		
		protected List<MCList<AccptRecvIf_Upd04_DtlR>> mergeNewDtlL(
				MCList<AccptRecvIf_Upd04_DtlR>[] arr) {
			List<MCList<AccptRecvIf_Upd04_DtlR>> ret = new ArrayList<>();
			MCList<AccptRecvIf_Upd04_DtlR> mergeDestL = MCList
					.create(AccptRecvIf_Upd04_DtlR.class);
			boolean isMerging = false;
			
			for (MCList<AccptRecvIf_Upd04_DtlR> l : arr) {
				if (isMergeGrp(l, mergeDestL) && isNewDtlOnly(l) && isNotAbortMix(l, arr)) {
					mergeDestL.addAll(l);
					isMerging = true;
				}
				else {
					if (isMerging) {
						ret.add(mergeDestL);
						isMerging = false;
						mergeDestL = MCList.create(AccptRecvIf_Upd04_DtlR.class);
					}
					ret.add(l);
				}
			}

			if (isMerging) {
				ret.add(mergeDestL);// IFデータが全て新規の場合
			}
			return ret;
		}
		
		protected boolean isMergeGrp(MCList<AccptRecvIf_Upd04_DtlR> tgtL, MCList<AccptRecvIf_Upd04_DtlR> mergeDestL) {
			if (mergeDestL.isEmpty()) {
				return true;
			}
			
			for (AccptRecvIf_Upd04_DtlR tgtR : tgtL) {
				for (AccptRecvIf_Upd04_DtlR mergrDestR : mergeDestL) {
					if (!isSame(mergrDestR.accpt().ext_sys_cd(), tgtR.accpt().ext_sys_cd())) {
						return false;
					}
					
					if (isSame(mergrDestR.cst_cd(), tgtR.cst_cd()) &&
						isSame(mergrDestR.dlv_slip_no(), tgtR.dlv_slip_no()) &&
						isSame(mergrDestR.cst_po_no(), tgtR.cst_po_no())) {
							return false;
					}
				}
			}
			
			return true;
		}
		
		protected boolean isNotAbortMix(MCList<AccptRecvIf_Upd04_DtlR> l, MCList<AccptRecvIf_Upd04_DtlR>[] arr) {
			for (AccptRecvIf_Upd04_DtlR r : l) {
				for (MCList<AccptRecvIf_Upd04_DtlR> tmpL : arr) {
					for (AccptRecvIf_Upd04_DtlR tmpR : tmpL) {
						// 同一処理グループ内に異なる外部システムデータNOで同一の明細に対し打切オン・オフが混在する場合
						if (!isSame(r.ext_data_no(), tmpR.ext_data_no())
								&& isSame(r.dlv_slip_no(), tmpR.dlv_slip_no())
								&& isSame(r.dlv_slip_d_no(), tmpR.dlv_slip_d_no())
								&& isSame(r.cst_cd(), tmpR.cst_cd())
								&& isSame(r.cst_po_no(), tmpR.cst_po_no())
								&& isSame(r.cst_po_d_no(), tmpR.cst_po_d_no())
								&& isSame(r.accpt().ext_sys_cd(), tmpR.accpt().ext_sys_cd())
								&& !isSame(r.accpt().ext_purc_act_d_no(), tmpR.accpt().ext_purc_act_d_no())
								&& !isSame(r.accpt().abort_flg(), tmpR.accpt().abort_flg())) {
							return false;
						}
					}
				}
			}
			return true;
		}
		
		protected boolean isNewDtlOnly(MCList<AccptRecvIf_Upd04_DtlR> l) {
			for (AccptRecvIf_Upd04_DtlR r : l) {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					return false;
				}
			}
			return true;
		}
		
		/**
		 * 引数のキーの順番を意識したグループリストを取得する。
		 * 
		 * @param accptRecvIfL 検収受信ＩＦリスト
		 * @param key グループ化の基準カラム名
		 * @return　取込単位のグループ
		 */
		protected MCList<AccptRecvIf_Upd04_DtlR>[] groupList(MCList<AccptRecvIf_Upd04_DtlR> accptRecvIfL, String[] key) {
			
			MCList<AccptRecvIf_Upd04_DtlR>[] arr = accptRecvIfL.groupList(key);
			
			Arrays.sort(arr, new Comparator<MCList<AccptRecvIf_Upd04_DtlR>>() {
				
				public int compare(MCList<AccptRecvIf_Upd04_DtlR> o1, MCList<AccptRecvIf_Upd04_DtlR> o2) {
					
					AccptRecvIf_Upd04_DtlR r1 = o1.get(0), r2 = o2.get(0);
					
					int val = r1.ext_data_no().compareTo(r2.ext_data_no());
					
					if (val == 0) {
						val = r1.cst_cd().compareTo(r2.cst_cd());
						
						if (val == 0) {
							val = nvl(r1.dlv_slip_no(), NULL_VAL).compareTo(nvl(r2.dlv_slip_no(), NULL_VAL));
							
							if (val == 0) {
								val = nvl(r1.cst_po_no(), NULL_VAL).compareTo(nvl(r2.cst_po_no(), NULL_VAL));
								
								if (val == 0) {
									if (!MAC_DATA_CRUD_TYP.isCRT(r1.data_crud_typ()) && MAC_DATA_CRUD_TYP.isCRT(r2.data_crud_typ())) {
										val = -1;
									}
								}
							}
						}
						
					}
					
					return val;
				}
			});
			
			return arr;
		}
		
		/**
		 * 処理結果区分に処理済を設定する。
		 * 
		 * @param accptRecvIfL 検収受信ＩＦリスト
		 */
		protected void setOk(MCList<AccptRecvIf_Upd04_DtlR> accptRecvIfL) {
			
			for (AccptRecvIf_Upd04_DtlR accptRecvIfR : accptRecvIfL) {
				if (!isErr(accptRecvIfR.accpt())) {
					accptRecvIfR.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
				}
			}
		}
		
		/**
		 * 処理結果区分にエラーを設定する。
		 * 
		 * @param accptRecvIfR 検収受信ＩＦ
		 */
		protected void setErr(MST_ACCPT_RECV_IF_R accptRecvIfR) {
			setErrSts(accptRecvIfR);
		}
		
		/**
		 * 検収受信ＩＦの処理結果区分がエラーかどうか。
		 * 
		 * @param accptRecvIfR 検収受信ＩＦ
		 * @return 処理結果区分がエラーはtrue
		 */
		protected boolean isErr(MST_ACCPT_RECV_IF_R accptRecvIfR) {
			return MAC_EXE_STS_TYP.isERR(accptRecvIfR.exe_sts_typ());
		}
		
		/**
		 * 同一取込グループのキーを返す。
		 * 
		 * @return 同一取込グループのキー
		 */
		protected String[] getGrpKey() {
			return new String[] { 
					MST_ACCPT_RECV_IF_R.$ext_sys_cd,
					MST_ACCPT_RECV_IF_R.$ext_data_no,
					MST_ACCPT_RECV_IF_R.$cst_cd,
					MST_ACCPT_RECV_IF_R.$dlv_slip_no,
					$CST_PO_NO_KEY};
		}
		
		protected Map_AccptRecvIf_Chk01_DtlR_AccptRecvIf_Upd04_DtlR<AccptRecvIf_Chk01_DtlR,AccptRecvIf_Upd04_DtlR> createMap_AccptRecvIf_Chk01_DtlR_AccptRecvIf_Upd04_DtlR() {
			return new Map_AccptRecvIf_Chk01_DtlR_AccptRecvIf_Upd04_DtlR<AccptRecvIf_Chk01_DtlR, AccptRecvIf_Upd04_DtlR>();
		}
		
		public class Map_AccptRecvIf_Chk01_DtlR_AccptRecvIf_Upd04_DtlR<D extends AccptRecvIf_Chk01_DtlR, S extends AccptRecvIf_Upd04_DtlR> extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src) {
				
				dest.accpt(src.accpt());
				dest.setParamIndex(src.accpt().getParamIndex());
				dest.setParamRowIndex(src.accpt().getParamRowIndex());
			}
		}
		/**
		 * 添付帳票登録サービス呼出（新規）
		 * @param accptRecvIfL 検収受信ＩＦリスト
		 */
		protected void callAttachServiceUpd(MCList<AccptRecvIf_Upd04_DtlR> accptRecvIfL) {
			MBBCL_AttachService.Attach_Upd01 opAttc = MBBCL_AttachService.crtAttach_Upd01();
			
			MCIndexKey idxSlsAct = _slsActUpd01L.createIndex(SlsAct_Upd01_HdrR.$hdr_peg_no);
			MCIndexKey idxSlsActD = _slsActDUpd01L.createIndex(SlsAct_Upd01_DtlR.$hdr_peg_no);
			MCIndexKey idxSlsActDExt = _slsActDUpd01L.createIndex(SlsAct_Upd01_DtlR.$data_crud_typ, SlsAct_Upd01_DtlR.$ext_purc_act_d_no);
			MCIndexKey idxRslt = _rsltL.createIndex(SlsAct_Upd01_RsltR.$hdr_peg_no);
			MCIndexKey idxRsltD = _rsltDL.createIndex(SlsAct_Upd01_Rslt_DtlR.$dtl_peg_no);
			MCIndexKey idxHdrDel = _hdrDelL.createIndex(SlsAct_Upd01_HdrR.$hdr_peg_no);
			
			String[] up0Key = new String[]{Attach_Chk01_DtlR.$biz_key1, Attach_Chk01_DtlR.$biz_key2};
			
			// up1電文
			opAttc.up1().upd_cntr_chk_flg(false);
			
			for (AccptRecvIf_Upd04_DtlR accptRecvIfR : accptRecvIfL) {
				SlsAct_Upd01_RsltR rsltR = null;
				SlsAct_Upd01_HdrR hdrR = null;
				
				// データ更新区分が削除の場合、削除データから紐づくヘッダ情報と登録結果情報を取得する
				if (MAC_DATA_CRUD_TYP.isDEL(accptRecvIfR.data_crud_typ())) {
					// 削除データに紐づく明細データを取得する
					SlsAct_Upd01_DtlR delR = _slsActDUpd01L.getFirst(idxSlsActDExt, MAC_DATA_CRUD_TYP.DEL.value(), accptRecvIfR.ext_purc_act_d_no());
					MCList<SlsAct_Upd01_DtlR> dtlDelL = _slsActDUpd01L.subList(idxSlsActD, delR.hdr_peg_no());
					
					// ヘッダ情報を取得する
					hdrR = _hdrDelL.getFirst(idxHdrDel, delR.hdr_peg_no());
					
					// 明細データに紐づく登録情報を取得する
					for (SlsAct_Upd01_DtlR dtlDelR : dtlDelL) {
						SlsAct_Upd01_DtlR dtlR = _slsActDUpd01L.getFirst(idxSlsActDExt, MAC_DATA_CRUD_TYP.CRT.value(), dtlDelR.ext_purc_act_d_no());
						if (!isNull(dtlR)) {
							hdrR = _slsActUpd01L.getFirst(idxSlsAct, dtlR.hdr_peg_no());
							rsltR = _rsltL.getFirst(idxRslt, _rsltDL.getFirst(idxRsltD, dtlR.dtl_peg_no()).hdr_peg_no());
							break;
						}
					}
				}
				// データ更新区分が登録・更新の場合、明細データに紐づくヘッダ情報と登録結果情報を取得する
				else {
					SlsAct_Upd01_DtlR dtlR = _slsActDUpd01L.getFirst(idxSlsActDExt, MAC_DATA_CRUD_TYP.CRT.value(), accptRecvIfR.ext_purc_act_d_no());
					hdrR = _slsActUpd01L.getFirst(idxSlsAct, dtlR.hdr_peg_no());
					rsltR = _rsltL.getFirst(idxRslt, _rsltDL.getFirst(idxRsltD, dtlR.dtl_peg_no()).hdr_peg_no());
				}
				
				// up2(List2)電文
				Attach_Upd01_Dtl2R up2 = Attach_Upd01_Dtl2R .create();
				up2.biz_typ(MAC_BIZ_TYP.ACCPT_SLS_EDI.value());
				up2.report_id("MSLAR0060");
				up2.biz_key1(isNull(rsltR) ? hdrR.sls_act_no() : rsltR.sls_act_no());
				up2.biz_key2(isNull(rsltR) ? hdrR.sls_act_rev().toString() : rsltR.sls_act_rev().toString());
				up2.data_lno(accptRecvIfR.data_lno());
				opAttc.up2().add(up2);
				
				// 売上実績ＮＯ、売上実績改訂番号で既に設定されている場合、up0は対象外とする
				if (isNull(opAttc.up0().getFirst(up0Key, up2.toArray(up0Key)))) {
					MCList<SlsAct_Upd01_DtlR> slsActDL = _slsActDUpd01L.subList(idxSlsActD, hdrR.hdr_peg_no());
					// up0(List1)電文
					Attach_Chk01_DtlR up0 = Attach_Chk01_DtlR.create();
					up0.biz_typ(MAC_BIZ_TYP.ACCPT_SLS_EDI.value());
					up0.report_id("MSLAR0060");
					up0.biz_key1(up2.biz_key1());
					up0.biz_key2(up2.biz_key2());
					up0.dt(accptRecvIfR.recv_dt());
					up0.bp_cd(hdrR.cst_cd());
					up0.amt(slsActDL.sum(SlsAct_Upd01_DtlR.$trd_cur_amt).add(nvl(slsActDL.sum(SlsAct_Upd01_DtlR.$trd_cur_tax_amt), MCNumber.ZERO)));
					up0.cur_cd(hdrR.trd_cur_cd());
					up0.wg_cd(hdrR.wg_cd());
					up0.sls_dpt_cd(hdrR.sls_dpt_cd());
					up0.if_proc_typ(MAC_IF_PROC_TYP.ACCPT_RECV.value());
					opAttc.up0().add(up0);
				}
			}
			
			if (opAttc.up0().size() > 0) {
				opAttc.exec();
			}
		}
		
		/**
		 * 添付帳票登録サービス呼出（取消）
		 */
		protected void callAttachServiceDel() {
			MBBCL_AttachService.Attach_Del01 opAttc = MBBCL_AttachService.crtAttach_Del01();
			
			for (SlsAct_Upd01_HdrR hdrDelR : _hdrDelL) {
				Attach_Chk02_DtlR up0 = Attach_Chk02_DtlR.create();
				up0.biz_typ(MAC_BIZ_TYP.ACCPT_SLS_EDI.value());
				up0.report_id("MSLAR0060");
				up0.biz_key1(hdrDelR.sls_act_no());
				up0.biz_key2(hdrDelR.sls_act_rev().toString());
				opAttc.up0().add(up0);
			}
			
			if (opAttc.up0().size() > 0) {
				opAttc.exec();
			}
		}
	}
	
	/**
	 * AccptRecvIf_Chk01オペレーション.<p>
	 *
	 * 検収受信ＩＦ取込を行う前のチェック処理<br>
	 */
	public class AccptRecvIf_Chk01 extends MSLAL_AccptRecvIfService_MC_A.AccptRecvIf_Chk01 {
		/**
		 * 納品伝票情報
		 */
		protected MCList<MST_DLV_SLIP_R> _dlvSlipL = null;
		protected MCList<MST_DLV_SLIP_D_R> _dlvSlipDL = null;
		protected MCIndexKey _dlvSlipIdxkey = null;
		protected MCIndexKey _dlvSlipDIdxkey = null;
		protected MCIndexKey _dlvSlipDSlipNoIdxkey = null;
		
		/**
		 * インボイス情報
		 */
		protected MCList<MST_IV_R> _ivL = null;
		protected MCList<MST_IV_D_R> _ivDL = null;
		protected MCIndexKey _ivIdxkey = null;
		protected MCIndexKey _ivDIdxkey = null;
		protected MCIndexKey _ivDIvMngNoIdxkey = null;
		
		/**
		 * 受注情報
		 */
		protected MCList<MST_SLO_R> _sloL = null;
		protected MCList<MST_SLO_D_R> _sloDL = null;
		protected MCList<MST_SLO_D_R> _sloDAllL = null;
		protected MCIndexKey _sloIdxkey = null;
		protected MCIndexKey _sloSloNoIdxkey = null;
		protected MCIndexKey _sloDSloNoIdxkey = null;
		protected MCIndexKey _sloDSloDNoIdxkey = null;
		protected MCIndexKey _sloDCstDNoIdxkey = null;
		protected MCIndexKey _sloDAllSloDNoIdxkey = null;
		protected MCIndexKey getSloDAllSloDNoIdxkey() {
			if (null == _sloDAllSloDNoIdxkey || !_sloDAllL.containsIndex(_sloDAllSloDNoIdxkey)) {
				_sloDAllSloDNoIdxkey = _sloDAllL.createIndex(MST_SLO_D_R.$slo_d_no);
				return _sloDAllSloDNoIdxkey;
			}
			else {
				return _sloDAllSloDNoIdxkey;
			}
		}
		
		/**
		 * 受注情報（納品書紐づき）
		 */
		protected MCList<MST_SLO_R> _dlvSlipSloL = null;
		protected MCIndexKey _dlvSlipSloIdxkey = null;
		
		/**
		 * 出荷実績明細
		 */
		protected MCList<MST_SHIP_ACT_D_R> _shipActDL = null;
		protected MCIndexKey _shipActDIdxkey = null;
		
		/**
		 * 売上予定
		 */
		protected MCList<MST_SLS_SCHD_R> _slsSchdL = null;
		protected MCIndexKey _slsSchdIvDIdxkey = null;
		protected MCIndexKey _slsSchdIvDCmplIdxkey = null;
		protected MCIndexKey _slsSchdDlvSlipCmplIdxkey = null;
		protected MCIndexKey _slsSchdSloDCmplIdxkey = null;
		protected MCIndexKey _slsSchdSlipDIdxkey = null;
		protected MCIndexKey _slsSchdSloDIdxkey = null;
		protected MCIndexKey _slsSchdNoIdxkey = null;
		
		/**
		 * 売上実績情報
		 */
		protected MCList<MST_SLS_ACT_R> _slsActL = null;
		protected MCList<MST_SLS_ACT_D_R> _slsActDL = null;
		protected MCList<MST_SLS_ACT_IO_R> _slsActIoL = null;
		protected MCIndexKey _slsActIdxkey = null;
		protected MCIndexKey _slsActIvIdxKey = null;
		protected MCIndexKey _slsActDExtPurcDNoIdxkey = null;
		protected MCIndexKey _slsActDSlsActNoIdxkey = null;
		protected MCIndexKey _slsActIoIdxkey = null;
		protected MCIndexKey _slsActIoSyncIdxkey = null;
		protected MCIndexKey _slsActIoSyncSlsSchdIdxkey = null;
		protected MCList<MST_DLV_SLIP_R> _dlvSlipShipActL = null;
		protected MCIndexKey _dlvSlipShipActIdx = null;
		protected MCList<MST_IV_SHIP_ACT_D_R> _ivShipActDL = null;
		protected MCIndexKey _ivShipActDIdx = null;
		protected MCList<MST_IV_MAP_R> _ivMapL = null;
		protected MCIndexKey _ivMapIdx = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initUpSub() {
			super.initUpSub();
			
			preProc(up0());
			
			setItmSub(up0());
			
			getInfo();
			
			lockSlsSchd();
			
			initCstCache(up0());
			
			initItmUnitCache(up0());
			
			setPegNo(up0());
			
		}
		
		/**
		 * 処理対象の売上予定をロック
		 */
		protected void lockSlsSchd() {
			if (!isNull(_slsSchdL) && !_slsSchdL.isEmpty()) {
				MCList<MST_SLS_SCHD_R> lockSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
				MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
				MCQueryApiBuilder lockSlsSchdL_bldr = MCQueryApiBuilder.create(t);
				lockSlsSchdL_bldr.setSelect(t.sls_schd_no, t.upd_cntr);
				dbSelectKeyForUpdate("MSLAL5160_MST_SLS_SCHD_S04", lockSlsSchdL, lockSlsSchdL_bldr, _slsSchdL);
			}
		}
		
		protected void preProc(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			for (AccptRecvIf_Chk01_DtlR accptRecvIfR : accptRecvIfL) {
				accptRecvIfR.org_dlv_slip_no(accptRecvIfR.dlv_slip_no());
				accptRecvIfR.org_dlv_slip_d_no(accptRecvIfR.dlv_slip_d_no());
			}
		}
		
		/**
		 * リストロジックチェックを行う前に、品目の枝番、手配ＮＯをセット
		 * 
		 * @param accptRecvIfL 検収受信ＩＦリスト
		 */
		protected void setItmSub(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			
			for (AccptRecvIf_Chk01_DtlR accptRecvIfR : accptRecvIfL) {
				if (!isNull(accptRecvIfR.itm_cd())) {
					accptRecvIfR.itm_sub1(nvl(accptRecvIfR.itm_sub1(), MAC_STR.NULL_VAL.value()));
					accptRecvIfR.itm_sub2(nvl(accptRecvIfR.itm_sub2(), MAC_STR.NULL_VAL.value()));
					accptRecvIfR.itm_sub3(nvl(accptRecvIfR.itm_sub3(), MAC_STR.NULL_VAL.value()));
					
					accptRecvIfR.sno1(nvl(accptRecvIfR.sno1(), MAC_STR.NULL_VAL.value()));
					accptRecvIfR.sno2(nvl(accptRecvIfR.sno2(), MAC_STR.NULL_VAL.value()));
					accptRecvIfR.sno3(nvl(accptRecvIfR.sno3(), MAC_STR.NULL_VAL.value()));
					accptRecvIfR.sno4(nvl(accptRecvIfR.sno4(), MAC_STR.NULL_VAL.value()));
				}
			}
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			setSloInfo(up0());
			
			// 売上実績サービス用電文データ作成
			makeSlsActSvData(up0());
			
			setDown();
		}
		
		protected void setSloInfo(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			
			// 与信更新のための情報をセット
			for (AccptRecvIf_Chk01_DtlR dtlR : accptRecvIfL) {
				if (dtlR.err_flg()) {
					continue;
				}
				if (!isNull(dtlR.fix_slo_no())) {
					if (dtlR.iv_flg()) {
						MST_IV_R tmpIvR = _ivL.getFirst(_ivIdxkey, dtlR.fix_dlv_slip_no());
						if (!isNull(tmpIvR)) {
							dtlR.fix_trd_ptn_typ(tmpIvR.trd_ptn_typ());
							dtlR.fix_trd_cur_cd(tmpIvR.trd_cur_cd());
						}
					}
					else {
						MST_SLO_R sloR = MST_SLO_R.create();
						if (!isNull(_sloL)) {
							sloR = _sloL.getFirst(_sloSloNoIdxkey, dtlR.fix_slo_no());
						}
						if ((isNull(sloR) || isNull(sloR.slo_no())) && !isNull(_dlvSlipSloL)) {
							sloR = _dlvSlipSloL.getFirst(_dlvSlipSloIdxkey, dtlR.fix_slo_no());
						}
						dtlR.fix_trd_ptn_typ(sloR.trd_ptn_typ());
						dtlR.fix_trd_cur_cd(sloR.trd_cur_cd());
					}
				}
			}
		}
		
		/**
		 * 売上実績サービス用電文データ作成
		 */
		protected void makeSlsActSvData(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			MCList<AccptRecvIf_Chk01_DtlR> tgtL = accptRecvIfL.subList(AccptRecvIf_Chk01_DtlR.$err_flg, false);
			
			// 売上実績サービス用電文
			MCList<SlsAct_Upd01_HdrR> hdrL = MCList.create(SlsAct_Upd01_HdrR.class);
			MCList<SlsAct_Upd01_DtlR> dtlL = MCList.create(SlsAct_Upd01_DtlR.class);
			dtlL.addNumberColumn("upd_purc_peg_no");
			MCList<SlsAct_Upd01_IoR> ioL = MCList.create(SlsAct_Upd01_IoR.class);
			MCNumber hdrPegNo = MCNumber.ZERO;
			
			// 取消データ作成
			hdrPegNo = makeDelSlsActData(hdrPegNo, hdrL, dtlL, ioL);
			
			// 検収基準売上（インボイス対象外）
			hdrPegNo = makeDlvSlipSlsData(hdrPegNo, tgtL, hdrL, dtlL, ioL);
			
			// インボイス対象
			hdrPegNo = makeIvSlsData(hdrPegNo, tgtL, hdrL, dtlL, ioL);
			
			// 仕入直送売上（インボイス対象外）
			hdrPegNo = makeDdlvSlsData(hdrPegNo, tgtL, hdrL, dtlL, ioL);
			
			if (hdrL.size() > 0) {
				// 下り電文にセット
				down1().addAll(hdrL);
				for (SlsAct_Upd01_DtlR dtlR : dtlL) {
					AccptRecvIf_Chk01_SlsAct_Upd01_DtlR down2R = AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.create();
					copy(down2R, dtlR, createMap_AccptRecvIf_Chk01_SlsAct_Upd01_DtlR_SlsAct_Upd01_DtlR());
					down2().add(down2R);
				}
				down3().addAll(ioL);
			}
		}
		
		protected Map_AccptRecvIf_Chk01_SlsAct_Upd01_DtlR_SlsAct_Upd01_DtlR<AccptRecvIf_Chk01_SlsAct_Upd01_DtlR,SlsAct_Upd01_DtlR> createMap_AccptRecvIf_Chk01_SlsAct_Upd01_DtlR_SlsAct_Upd01_DtlR() {
			return new Map_AccptRecvIf_Chk01_SlsAct_Upd01_DtlR_SlsAct_Upd01_DtlR<AccptRecvIf_Chk01_SlsAct_Upd01_DtlR, SlsAct_Upd01_DtlR>();
		}

		public class Map_AccptRecvIf_Chk01_SlsAct_Upd01_DtlR_SlsAct_Upd01_DtlR<D extends AccptRecvIf_Chk01_SlsAct_Upd01_DtlR, S extends SlsAct_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$hdr_peg_no, SlsAct_Upd01_DtlR.$hdr_peg_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dtl_peg_no, SlsAct_Upd01_DtlR.$dtl_peg_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$data_crud_typ, SlsAct_Upd01_DtlR.$data_crud_typ);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sls_act_d_no, SlsAct_Upd01_DtlR.$sls_act_d_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sls_act_d_seq, SlsAct_Upd01_DtlR.$sls_act_d_seq);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$disp_seq, SlsAct_Upd01_DtlR.$disp_seq);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_cd, SlsAct_Upd01_DtlR.$dlv_cd);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_sundry_flg, SlsAct_Upd01_DtlR.$dlv_sundry_flg);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_nm, SlsAct_Upd01_DtlR.$dlv_nm);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_zip_cd, SlsAct_Upd01_DtlR.$dlv_zip_cd);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_addr1, SlsAct_Upd01_DtlR.$dlv_addr1);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_addr2, SlsAct_Upd01_DtlR.$dlv_addr2);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_addr3, SlsAct_Upd01_DtlR.$dlv_addr3);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_addr4, SlsAct_Upd01_DtlR.$dlv_addr4);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_cntct_dpt, SlsAct_Upd01_DtlR.$dlv_cntct_dpt);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_cntct_psn, SlsAct_Upd01_DtlR.$dlv_cntct_psn);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_tel, SlsAct_Upd01_DtlR.$dlv_tel);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_fax, SlsAct_Upd01_DtlR.$dlv_fax);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$pri_prnt_flg, SlsAct_Upd01_DtlR.$pri_prnt_flg);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dest_cd1, SlsAct_Upd01_DtlR.$dest_cd1);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dest_cd2, SlsAct_Upd01_DtlR.$dest_cd2);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dest_cd3, SlsAct_Upd01_DtlR.$dest_cd3);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_cd, SlsAct_Upd01_DtlR.$tdlv_cd);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_sundry_flg, SlsAct_Upd01_DtlR.$tdlv_sundry_flg);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_nm, SlsAct_Upd01_DtlR.$tdlv_nm);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_zip_cd, SlsAct_Upd01_DtlR.$tdlv_zip_cd);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_addr1, SlsAct_Upd01_DtlR.$tdlv_addr1);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_addr2, SlsAct_Upd01_DtlR.$tdlv_addr2);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_addr3, SlsAct_Upd01_DtlR.$tdlv_addr3);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_addr4, SlsAct_Upd01_DtlR.$tdlv_addr4);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_tel, SlsAct_Upd01_DtlR.$tdlv_tel);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_fax, SlsAct_Upd01_DtlR.$tdlv_fax);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_cntct_dpt, SlsAct_Upd01_DtlR.$tdlv_cntct_dpt);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tdlv_cntct_psn, SlsAct_Upd01_DtlR.$tdlv_cntct_psn);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$itm_cd, SlsAct_Upd01_DtlR.$itm_cd);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$itm_sub1, SlsAct_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$itm_sub2, SlsAct_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$itm_sub3, SlsAct_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sno1, SlsAct_Upd01_DtlR.$sno1);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sno2, SlsAct_Upd01_DtlR.$sno2);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sno3, SlsAct_Upd01_DtlR.$sno3);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sno4, SlsAct_Upd01_DtlR.$sno4);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$itm_nm, SlsAct_Upd01_DtlR.$itm_nm);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$iv_itm_nm, SlsAct_Upd01_DtlR.$iv_itm_nm);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$cntry_org_cd, SlsAct_Upd01_DtlR.$cntry_org_cd);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$loc_cd, SlsAct_Upd01_DtlR.$loc_cd);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$str_ln_cd, SlsAct_Upd01_DtlR.$str_ln_cd);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$lot_no, SlsAct_Upd01_DtlR.$lot_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sublot_no, SlsAct_Upd01_DtlR.$sublot_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$gd_cd, SlsAct_Upd01_DtlR.$gd_cd);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$trd_unit_cd, SlsAct_Upd01_DtlR.$trd_unit_cd);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$trd_unit_qty, SlsAct_Upd01_DtlR.$trd_unit_qty);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$base_unit_cd, SlsAct_Upd01_DtlR.$base_unit_cd);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$base_unit_qty, SlsAct_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$trd_cur_upri, SlsAct_Upd01_DtlR.$trd_cur_upri);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$trd_cur_amt, SlsAct_Upd01_DtlR.$trd_cur_amt);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$upri_not_tgt_flg, SlsAct_Upd01_DtlR.$upri_not_tgt_flg);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$interim_flg, SlsAct_Upd01_DtlR.$interim_flg);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tax_cd, SlsAct_Upd01_DtlR.$tax_cd);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$inc_tax_flg, SlsAct_Upd01_DtlR.$inc_tax_flg);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tax_rate, SlsAct_Upd01_DtlR.$tax_rate);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$tax_typ, SlsAct_Upd01_DtlR.$tax_typ);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$trd_cur_tax_amt, SlsAct_Upd01_DtlR.$trd_cur_tax_amt);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$cost_upri, SlsAct_Upd01_DtlR.$cost_upri);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$cost_amt, SlsAct_Upd01_DtlR.$cost_amt);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$trd_cur_dscnt_amt, SlsAct_Upd01_DtlR.$trd_cur_dscnt_amt);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$bill_crryovr_times, SlsAct_Upd01_DtlR.$bill_crryovr_times);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$stk_mng_typ, SlsAct_Upd01_DtlR.$stk_mng_typ);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sundry_itm_flg, SlsAct_Upd01_DtlR.$sundry_itm_flg);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sno1_mng_typ, SlsAct_Upd01_DtlR.$sno1_mng_typ);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sno2_mng_typ, SlsAct_Upd01_DtlR.$sno2_mng_typ);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sno3_mng_typ, SlsAct_Upd01_DtlR.$sno3_mng_typ);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sno4_mng_typ, SlsAct_Upd01_DtlR.$sno4_mng_typ);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$itm_jnl_cd, SlsAct_Upd01_DtlR.$itm_jnl_cd);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$cst_po_d_no, SlsAct_Upd01_DtlR.$cst_po_d_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$cst_itm_cd, SlsAct_Upd01_DtlR.$cst_itm_cd);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$cst_itm_nm, SlsAct_Upd01_DtlR.$cst_itm_nm);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$trd_d_rmrks, SlsAct_Upd01_DtlR.$trd_d_rmrks);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$intr_rmrks, SlsAct_Upd01_DtlR.$intr_rmrks);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$rsn_cd, SlsAct_Upd01_DtlR.$rsn_cd);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$bd_dpt_cd, SlsAct_Upd01_DtlR.$bd_dpt_cd);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$wtax_rate, SlsAct_Upd01_DtlR.$wtax_rate);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$slo_no, SlsAct_Upd01_DtlR.$slo_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$slo_d_no, SlsAct_Upd01_DtlR.$slo_d_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sls_ret_schd_no, SlsAct_Upd01_DtlR.$sls_ret_schd_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sls_ret_schd_d_no, SlsAct_Upd01_DtlR.$sls_ret_schd_d_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$ship_schd_no, SlsAct_Upd01_DtlR.$ship_schd_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sls_schd_no, SlsAct_Upd01_DtlR.$sls_schd_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$qtn_no, SlsAct_Upd01_DtlR.$qtn_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$qtn_rev, SlsAct_Upd01_DtlR.$qtn_rev);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$qtn_d_no, SlsAct_Upd01_DtlR.$qtn_d_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$purc_ddlv_po_no, SlsAct_Upd01_DtlR.$purc_ddlv_po_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$purc_ddlv_po_d_no, SlsAct_Upd01_DtlR.$purc_ddlv_po_d_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$purc_act_no, SlsAct_Upd01_DtlR.$purc_act_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$purc_act_d_no, SlsAct_Upd01_DtlR.$purc_act_d_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$iv_d_no, SlsAct_Upd01_DtlR.$iv_d_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sub_char1, SlsAct_Upd01_DtlR.$sub_char1);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sub_char2, SlsAct_Upd01_DtlR.$sub_char2);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sub_char3, SlsAct_Upd01_DtlR.$sub_char3);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dscnt_rsn_cd, SlsAct_Upd01_DtlR.$dscnt_rsn_cd);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$ref_sls_act_no, SlsAct_Upd01_DtlR.$ref_sls_act_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$ref_sls_act_seq, SlsAct_Upd01_DtlR.$ref_sls_act_seq);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$ref_sls_act_d_no, SlsAct_Upd01_DtlR.$ref_sls_act_d_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$ref_sls_act_d_seq, SlsAct_Upd01_DtlR.$ref_sls_act_d_seq);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$dlv_slip_d_no, SlsAct_Upd01_DtlR.$dlv_slip_d_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$sls_schd_abort_flg, SlsAct_Upd01_DtlR.$sls_schd_abort_flg);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$ext_purc_act_d_no, SlsAct_Upd01_DtlR.$ext_purc_act_d_no);
				addColumnPathMap(AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.$ext_sys_cd, SlsAct_Upd01_DtlR.$ext_sys_cd);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.upd_purc_peg_no(src.getNumberNE("upd_purc_peg_no"));
				dest.setStringNE("ship_dlv_slip_d_no", src.ship_dlv_slip_d_no());
				dest.setBooleanNE("ship_dlv_slip_multi_flg", src.ship_dlv_slip_multi_flg());
				dest.setStringNE("purc_ddlv_dlv_slip_d_no", src.purc_ddlv_dlv_slip_d_no());
			}
			
		}
		
		/**
		 * 外部仕入実績明細ＮＯに紐づく売上実績がある場合、取消データを作成
		 */
		protected MCNumber makeDelSlsActData (
				MCNumber hdrPegNo,
				MCList<SlsAct_Upd01_HdrR> hdrL,
				MCList<SlsAct_Upd01_DtlR> dtlL,
				MCList<SlsAct_Upd01_IoR> ioL) {
			
			MCList<MST_SLS_ACT_D_R> insSlsActDL = MCList.create(MST_SLS_ACT_D_R.class);
			insSlsActDL.addNumberColumn("upd_purc_peg_no");
			
			if (!isNull(_slsActL)) {
				// 取消データ作成
				hdrPegNo = makeDelSlsData(hdrPegNo, hdrL, dtlL, ioL, insSlsActDL);
				
				// 再登録データ作成
				hdrPegNo = makeReCrtSlsData(hdrPegNo, hdrL, dtlL, ioL, insSlsActDL);
			}
			
			return hdrPegNo;
		}
		
		/**
		 * 外部仕入実績明細ＮＯに紐づく売上実績サービスの再登録電文データ作成処理（ヘッダ・明細部）
		 */
		protected MCNumber makeReCrtSlsData(
				MCNumber hdrPegNo,
				MCList<SlsAct_Upd01_HdrR> hdrL,
				MCList<SlsAct_Upd01_DtlR> dtlL,
				MCList<SlsAct_Upd01_IoR> ioL,
				MCList<MST_SLS_ACT_D_R> insSlsActDL) {
			
			// 更新・取消対象ではない売上実績の再登録用データ作成
			MCList<MST_SLS_ACT_R> insSlsActL = MCList.create(MST_SLS_ACT_R.class);
			MCList<MST_SLS_ACT_IO_R> insSlsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
			MCIndexKey insSlsActDLIdx = insSlsActDL.createIndex(MST_SLS_ACT_D_R.$sls_act_no);
			
			MCList<AccptRecvIf_Chk01_DtlR> itmCacheL = MCList.create(AccptRecvIf_Chk01_DtlR.class);
			for (MST_SLS_ACT_D_R slsActDR : insSlsActDL) {
				AccptRecvIf_Chk01_DtlR itmCacheR = AccptRecvIf_Chk01_DtlR.create();
				itmCacheR.itm_cd(slsActDR.itm_cd());
				itmCacheR.itm_sub1(slsActDR.itm_sub1());
				itmCacheR.itm_sub2(slsActDR.itm_sub2());
				itmCacheR.itm_sub3(slsActDR.itm_sub3());
				itmCacheL.add(itmCacheR);
			}
			initItmCache(itmCacheL);
			
			if (!insSlsActDL.isEmpty()) {
				for (MST_SLS_ACT_D_R slsActDR : insSlsActDL) {
					MST_SLS_ACT_R tmpSlsActR = _slsActL.getFirst(_slsActIdxkey, slsActDR.sls_act_no());
					MST_SLS_ACT_R isnSlsActR = insSlsActL.getFirst(MST_SLS_ACT_R.$sls_act_no, tmpSlsActR.sls_act_no());
					if (isNull(isnSlsActR)) {
						insSlsActL.add(tmpSlsActR);
					}
					MCList<MST_SLS_ACT_IO_R> slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
					slsActIoL = _slsActIoL.subList(_slsActIoIdxkey, slsActDR.sls_act_d_no());
					insSlsActIoL.addAll(slsActIoL);
				}
				
				MCIndexKey insSlsActIoLIdx = insSlsActIoL.createIndex(MST_SLS_ACT_IO_R.$sls_act_d_no);
				for (MST_SLS_ACT_R slsActR : insSlsActL) {
					SlsAct_Upd01_HdrR hdrR = SlsAct_Upd01_HdrR.create();
					copy(hdrR, slsActR, createMap_SlsAct_Upd01_HdrR_MST_SLS_ACT_R_Ins());
					hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					hdrR.setStatus(Status.CREATE);
					hdrR.hdr_peg_no(hdrPegNo);
					hdrR.xrate_rnd_typ(getCo().xrate_rnd_typ());
					hdrR.can_ac_dt(null);
					hdrR.aprv_flg(false);
					hdrR.lot_chk_off_flg(true);
					hdrR.ship_act_service_via_flg(false);
					
					if (hdrR.ddlv_sls_flg()) {
						hdrR.ship_act_service_exec_flg(true);
						hdrR.slip_split_non_flg(false);
					}
					else {
						hdrR.ship_act_no(slsActR.ship_act_no());
						hdrR.slip_split_non_flg(true);
					}
					
					MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
					slsActDL = insSlsActDL.subList(insSlsActDLIdx, slsActR.sls_act_no());
					
					int dtlPegNo = 0;
					boolean existTgtFlg = false;
					int dispCnt = 0;
					for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
						SlsAct_Upd01_DtlR dtlR = SlsAct_Upd01_DtlR.create();
						dtlR.addNumberColumn("upd_purc_peg_no");
						existTgtFlg = true;
						copy(dtlR, slsActDR, createMap_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R_Ins());
						dtlR.hdr_peg_no(hdrR.hdr_peg_no());
						dtlR.setNumberNE("upd_purc_peg_no", slsActDR.getNumber("upd_purc_peg_no"));
						dtlR.dtl_peg_no(dtlPegNo++);
						dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						dtlR.setStatus(Status.CREATE);
						dtlR.disp_seq(++dispCnt);
						MAM_TAX_R tmpTaxR = getTaxR(dtlR.tax_cd());
						dtlR.inc_tax_flg(tmpTaxR.inc_tax_flg());
						dtlR.tax_rate(tmpTaxR.tax_rate());
						dtlR.tax_typ(tmpTaxR.tax_typ());
						MAM_ITM_R tmpItmR = getItmCache(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
						dtlR.itm_jnl_cd(tmpItmR.itm_jnl_cd());
						
						MCList<MST_SLS_ACT_IO_R> slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
						slsActIoL = insSlsActIoL.subList(insSlsActIoLIdx, slsActDR.sls_act_d_no());
						makeSlsIoData(hdrR.hdr_peg_no(), dtlR.dtl_peg_no(), slsActIoL, ioL, false);
						MST_SLS_SCHD_R slsSchdR = _slsSchdL.getFirst(_slsSchdNoIdxkey, dtlR.sls_schd_no());
						if (!isNull(slsSchdR) && isSame(dtlR.trd_unit_qty(), slsSchdR.trd_unit_qty())) {
							slsSchdR.setBooleanNE("use_flg", true);
						}
						dtlL.add(dtlR);
					}
					if (existTgtFlg) {
						hdrL.add(hdrR);
						hdrPegNo = hdrPegNo.add(1);
					}
				}
			}
			
			return hdrPegNo;
		}
		
		/**
		 * 外部仕入実績明細ＮＯに紐づく売上実績サービスの削除電文データ作成処理（ヘッダ・明細部）
		 */
		protected MCNumber makeDelSlsData(
				MCNumber hdrPegNo,
				MCList<SlsAct_Upd01_HdrR> hdrL,
				MCList<SlsAct_Upd01_DtlR> dtlL,
				MCList<SlsAct_Upd01_IoR> ioL,
				MCList<MST_SLS_ACT_D_R> insSlsActDL) {
			
			MCIndexKey up0Idx = up0().createIndex(AccptRecvIf_Chk01_DtlR.$ext_purc_act_d_no, AccptRecvIf_Chk01_DtlR.$ext_sys_cd);
			
			for (MST_SLS_ACT_R slsActR : _slsActL) {
				MAM_BP_R tmpBpR = getCstCache(slsActR.cst_cd());
				if (tmpBpR.cst_iv_flg()) {
					continue;
				}
				
				SlsAct_Upd01_HdrR hdrR = SlsAct_Upd01_HdrR.create();
				copy(hdrR, slsActR, createMap_SlsAct_Upd01_HdrR_MST_SLS_ACT_R());
				hdrR.hdr_peg_no(hdrPegNo);
				if (hdrR.ddlv_sls_flg()) {
					hdrR.ship_act_service_exec_flg(true);
				}
				MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
				slsActDL = _slsActDL.subList(_slsActDSlsActNoIdxkey, hdrR.sls_act_no());
				
				int dtlPegNo = 0;
				boolean existTgtFlg = false;
				for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
					AccptRecvIf_Chk01_DtlR tmpUp0R = up0().getFirst(up0Idx, slsActDR.ext_purc_act_d_no(), slsActDR.ext_sys_cd());
					if (isNull(slsActDR.iv_d_no()) && (isNull(tmpUp0R) || (isNull(slsActDR.ext_sys_cd()) && isNull(slsActDR.ext_purc_act_d_no())))) {
						insSlsActDL.add(slsActDR);
					}
					if (dtlPegNo == 0) {
						MCDate tgtDt = null;
						if (isNull(tmpUp0R)) {
							tgtDt = slsActR.ac_dt();
						}
						else {
							tgtDt = tmpUp0R.accpt_dt();
						}
						boolean isSlsClose = callClChk(tgtDt, false);
						hdrR.can_ac_dt(getFixDt(tgtDt, isSlsClose));
					}
					
					SlsAct_Upd01_DtlR dtlR = SlsAct_Upd01_DtlR.create();
					dtlR.addNumberColumn("upd_purc_peg_no");
					existTgtFlg = true;
					copy(dtlR, slsActDR, createMap_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R());
					dtlR.hdr_peg_no(hdrR.hdr_peg_no());
					dtlR.dtl_peg_no(dtlPegNo++);
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					dtlR.setStatus(Status.DELETE);
					dtlR.setNumberNE("upd_purc_peg_no", slsActDR.getNumberNE("upd_purc_peg_no"));
					
					dtlL.add(dtlR);
					
					MCList<MST_SLS_ACT_IO_R> slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
					slsActIoL = _slsActIoL.subList(_slsActIoIdxkey, dtlR.sls_act_d_no());
					makeSlsIoData(hdrR.hdr_peg_no(), dtlR.dtl_peg_no(), slsActIoL, ioL, true);
				}
				if (existTgtFlg) {
					hdrL.add(hdrR);
					hdrPegNo = hdrPegNo.add(1);
				}
			}
			
			return hdrPegNo;
		}
		
		/**
		 * 外部仕入実績明細ＮＯに紐づく売上実績サービスの削除・再登録電文データ作成処理（詳細部）
		 */
		protected void makeSlsIoData(
				MCNumber hdrPegNo,
				MCNumber dtlPegNo,
				MCList<MST_SLS_ACT_IO_R> slsActIoL,
				MCList<SlsAct_Upd01_IoR> ioL,
				boolean delFlg) {
			int ioPegNo = 0;
			for (MST_SLS_ACT_IO_R slsActIoR : slsActIoL) {
				SlsAct_Upd01_IoR ioR = SlsAct_Upd01_IoR.create();
				copy(ioR, slsActIoR, createMap_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R_Ins());
				ioR.hdr_peg_no(hdrPegNo);
				ioR.dtl_peg_no(dtlPegNo);
				ioR.io_peg_no(ioPegNo++);
				if (delFlg) {
					ioR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					ioR.setStatus(Status.DELETE);
				}
				else {
					ioR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					ioR.setStatus(Status.CREATE);
				}
				ioL.add(ioR);
			}
		}
		
		protected Map_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R_Ins<SlsAct_Upd01_IoR,MST_SLS_ACT_IO_R> createMap_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R_Ins() {
			return new Map_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R_Ins<SlsAct_Upd01_IoR, MST_SLS_ACT_IO_R>();
		}
		
		public class Map_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R_Ins<D extends SlsAct_Upd01_IoR, S extends MST_SLS_ACT_IO_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_IoR.$iv_ship_act_d_no, MST_SLS_ACT_IO_R.$iv_ship_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$arr_act_no, MST_SLS_ACT_IO_R.$arr_act_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$purc_act_io_no, MST_SLS_ACT_IO_R.$purc_act_io_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno1, MST_SLS_ACT_IO_R.$sno1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno2, MST_SLS_ACT_IO_R.$sno2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno3, MST_SLS_ACT_IO_R.$sno3);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno4, MST_SLS_ACT_IO_R.$sno4);
				addColumnPathMap(SlsAct_Upd01_IoR.$gd_cd, MST_SLS_ACT_IO_R.$gd_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$loc_cd, MST_SLS_ACT_IO_R.$loc_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$str_ln_cd, MST_SLS_ACT_IO_R.$str_ln_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$lot_no, MST_SLS_ACT_IO_R.$lot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sublot_no, MST_SLS_ACT_IO_R.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_cd, MST_SLS_ACT_IO_R.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_qty, MST_SLS_ACT_IO_R.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_cd, MST_SLS_ACT_IO_R.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_qty, MST_SLS_ACT_IO_R.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_cd, MST_SLS_ACT_IO_R.$pack_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_qty, MST_SLS_ACT_IO_R.$pack_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$sync_flg, MST_SLS_ACT_IO_R.$sync_flg);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char1, MST_SLS_ACT_IO_R.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char2, MST_SLS_ACT_IO_R.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char3, MST_SLS_ACT_IO_R.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_IoR.$ship_act_d_no, MST_SLS_ACT_IO_R.$ship_act_d_no);
				
			}
		}
		
		protected Map_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R_Ins<SlsAct_Upd01_DtlR,MST_SLS_ACT_D_R> createMap_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R_Ins() {
			return new Map_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R_Ins<SlsAct_Upd01_DtlR, MST_SLS_ACT_D_R>();
		}
		
		public class Map_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R_Ins<D extends SlsAct_Upd01_DtlR, S extends MST_SLS_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cd, MST_SLS_ACT_D_R.$dlv_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_sundry_flg, MST_SLS_ACT_D_R.$dlv_sundry_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_nm, MST_SLS_ACT_D_R.$dlv_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_zip_cd, MST_SLS_ACT_D_R.$dlv_zip_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr1, MST_SLS_ACT_D_R.$dlv_addr1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr2, MST_SLS_ACT_D_R.$dlv_addr2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr3, MST_SLS_ACT_D_R.$dlv_addr3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr4, MST_SLS_ACT_D_R.$dlv_addr4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_dpt, MST_SLS_ACT_D_R.$dlv_cntct_dpt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_psn, MST_SLS_ACT_D_R.$dlv_cntct_psn);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_tel, MST_SLS_ACT_D_R.$dlv_tel);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_fax, MST_SLS_ACT_D_R.$dlv_fax);
				addColumnPathMap(SlsAct_Upd01_DtlR.$pri_prnt_flg, MST_SLS_ACT_D_R.$pri_prnt_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd1, MST_SLS_ACT_D_R.$dest_cd1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd2, MST_SLS_ACT_D_R.$dest_cd2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd3, MST_SLS_ACT_D_R.$dest_cd3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cd, MST_SLS_ACT_D_R.$tdlv_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_sundry_flg, MST_SLS_ACT_D_R.$tdlv_sundry_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_nm, MST_SLS_ACT_D_R.$tdlv_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_zip_cd, MST_SLS_ACT_D_R.$tdlv_zip_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr1, MST_SLS_ACT_D_R.$tdlv_addr1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr2, MST_SLS_ACT_D_R.$tdlv_addr2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr3, MST_SLS_ACT_D_R.$tdlv_addr3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr4, MST_SLS_ACT_D_R.$tdlv_addr4);
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
				addColumnPathMap(SlsAct_Upd01_DtlR.$cntry_org_cd, MST_SLS_ACT_D_R.$cntry_org_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$loc_cd, MST_SLS_ACT_D_R.$loc_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$str_ln_cd, MST_SLS_ACT_D_R.$str_ln_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$lot_no, MST_SLS_ACT_D_R.$lot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sublot_no, MST_SLS_ACT_D_R.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$gd_cd, MST_SLS_ACT_D_R.$gd_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_cd, MST_SLS_ACT_D_R.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_qty, MST_SLS_ACT_D_R.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_cd, MST_SLS_ACT_D_R.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_qty, MST_SLS_ACT_D_R.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_upri, MST_SLS_ACT_D_R.$trd_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$upri_not_tgt_flg, MST_SLS_ACT_D_R.$upri_not_tgt_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$interim_flg, MST_SLS_ACT_D_R.$interim_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_cd, MST_SLS_ACT_D_R.$tax_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cost_upri, MST_SLS_ACT_D_R.$cost_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cost_amt, MST_SLS_ACT_D_R.$cost_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_dscnt_amt, MST_SLS_ACT_D_R.$trd_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bill_crryovr_times, MST_SLS_ACT_D_R.$bill_crryovr_times);
				addColumnPathMap(SlsAct_Upd01_DtlR.$stk_mng_typ, MST_SLS_ACT_D_R.$stk_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sundry_itm_flg, MST_SLS_ACT_D_R.$sundry_itm_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1_mng_typ, MST_SLS_ACT_D_R.$sno1_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2_mng_typ, MST_SLS_ACT_D_R.$sno2_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3_mng_typ, MST_SLS_ACT_D_R.$sno3_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4_mng_typ, MST_SLS_ACT_D_R.$sno4_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_po_d_no, MST_SLS_ACT_D_R.$cst_po_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_cd, MST_SLS_ACT_D_R.$cst_itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_nm, MST_SLS_ACT_D_R.$cst_itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_d_rmrks, MST_SLS_ACT_D_R.$trd_d_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$intr_rmrks, MST_SLS_ACT_D_R.$intr_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$rsn_cd, MST_SLS_ACT_D_R.$rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bd_dpt_cd, MST_SLS_ACT_D_R.$bd_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_rate, MST_SLS_ACT_D_R.$wtax_rate);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_amt, MST_SLS_ACT_D_R.$wtax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_no, MST_SLS_ACT_D_R.$slo_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_d_no, MST_SLS_ACT_D_R.$slo_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_ret_schd_no, MST_SLS_ACT_D_R.$sls_ret_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_ret_schd_d_no, MST_SLS_ACT_D_R.$sls_ret_schd_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_schd_no, MST_SLS_ACT_D_R.$ship_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_schd_no, MST_SLS_ACT_D_R.$sls_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_no, MST_SLS_ACT_D_R.$qtn_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_rev, MST_SLS_ACT_D_R.$qtn_rev);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_d_no, MST_SLS_ACT_D_R.$qtn_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_no, MST_SLS_ACT_D_R.$purc_ddlv_po_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_d_no, MST_SLS_ACT_D_R.$purc_ddlv_po_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_no, MST_SLS_ACT_D_R.$purc_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_d_no, MST_SLS_ACT_D_R.$purc_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$iv_d_no, MST_SLS_ACT_D_R.$iv_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char1, MST_SLS_ACT_D_R.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char2, MST_SLS_ACT_D_R.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char3, MST_SLS_ACT_D_R.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dscnt_rsn_cd, MST_SLS_ACT_D_R.$dscnt_rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_no, MST_SLS_ACT_D_R.$ref_sls_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_seq, MST_SLS_ACT_D_R.$ref_sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_d_no, MST_SLS_ACT_D_R.$ref_sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_d_seq, MST_SLS_ACT_D_R.$ref_sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wrk_no, MST_SLS_ACT_D_R.$wrk_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_dtl_upd_flg, MST_SLS_ACT_D_R.$sls_dtl_upd_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ext_purc_act_d_no, MST_SLS_ACT_D_R.$ext_purc_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ext_sys_cd, MST_SLS_ACT_D_R.$ext_sys_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_slip_d_no, MST_SLS_ACT_D_R.$dlv_slip_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_dlv_slip_d_no, MST_SLS_ACT_D_R.$ship_dlv_slip_d_no);
				
			}
		}
		
		protected Map_SlsAct_Upd01_HdrR_MST_SLS_ACT_R_Ins<SlsAct_Upd01_HdrR,MST_SLS_ACT_R> createMap_SlsAct_Upd01_HdrR_MST_SLS_ACT_R_Ins() {
			return new Map_SlsAct_Upd01_HdrR_MST_SLS_ACT_R_Ins<SlsAct_Upd01_HdrR, MST_SLS_ACT_R>();
		}
		
		public class Map_SlsAct_Upd01_HdrR_MST_SLS_ACT_R_Ins<D extends SlsAct_Upd01_HdrR, S extends MST_SLS_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cd, MST_SLS_ACT_R.$trd_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_ptn_typ, MST_SLS_ACT_R.$trd_ptn_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ac_dt, MST_SLS_ACT_R.$ac_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_usr_cd, MST_SLS_ACT_R.$sls_usr_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dpt_cd, MST_SLS_ACT_R.$sls_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$wg_cd, MST_SLS_ACT_R.$wg_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dt, MST_SLS_ACT_R.$sls_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_tm, MST_SLS_ACT_R.$ship_tm);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_tm, MST_SLS_ACT_R.$dlv_tm);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_cd, MST_SLS_ACT_R.$cst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ref_iv_no, MST_SLS_ACT_R.$ref_iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcpt_iv_mng_no, MST_SLS_ACT_R.$rcpt_iv_mng_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcpt_iv_no, MST_SLS_ACT_R.$rcpt_iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd1, MST_SLS_ACT_R.$tterm_cd1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks1, MST_SLS_ACT_R.$tterm_rmrks1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd2, MST_SLS_ACT_R.$tterm_cd2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks2, MST_SLS_ACT_R.$tterm_rmrks2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd3, MST_SLS_ACT_R.$tterm_cd3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks3, MST_SLS_ACT_R.$tterm_rmrks3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_no, MST_SLS_ACT_R.$lc_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_dt, MST_SLS_ACT_R.$lc_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_rmrks, MST_SLS_ACT_R.$lc_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcv_schd_dt, MST_SLS_ACT_R.$rcv_schd_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bill_basis_dt, MST_SLS_ACT_R.$bill_basis_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cred_cd, MST_SLS_ACT_R.$cred_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bcst_cd, MST_SLS_ACT_R.$bcst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$acst_cd, MST_SLS_ACT_R.$acst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ar_dpt_cd, MST_SLS_ACT_R.$ar_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_po_no, MST_SLS_ACT_R.$cst_po_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cur_cd, MST_SLS_ACT_R.$trd_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$base_cur_cd, MST_SLS_ACT_R.$base_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate_cd, MST_SLS_ACT_R.$xrate_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate, MST_SLS_ACT_R.$xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_cur_cd, MST_SLS_ACT_R.$ptax_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_xrate, MST_SLS_ACT_R.$ptax_xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_rmrks, MST_SLS_ACT_R.$trd_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$intr_rmrks, MST_SLS_ACT_R.$intr_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$slo_no, MST_SLS_ACT_R.$slo_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_ret_schd_no, MST_SLS_ACT_R.$sls_ret_schd_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_no, MST_SLS_ACT_R.$qtn_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_rev, MST_SLS_ACT_R.$qtn_rev);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_flg, MST_SLS_ACT_R.$aprv_flg);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_no, MST_SLS_ACT_R.$aprv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_sts_typ, MST_SLS_ACT_R.$aprv_sts_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_basis_typ, MST_SLS_ACT_R.$sls_basis_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$adjst_tgt_dt, MST_SLS_ACT_R.$adjst_tgt_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_adjst_typ, MST_SLS_ACT_R.$sls_adjst_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$adjst_mtd_typ, MST_SLS_ACT_R.$adjst_mtd_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char1, MST_SLS_ACT_R.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char2, MST_SLS_ACT_R.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char3, MST_SLS_ACT_R.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_act_sync_flg, MST_SLS_ACT_R.$ship_act_sync_flg);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ac_ym, MST_SLS_ACT_R.$ac_ym);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ddlv_sls_flg, MST_SLS_ACT_R.$ddlv_sls_flg);
				addColumnPathMap(SlsAct_Upd01_HdrR.$edi_flg, MST_SLS_ACT_R.$edi_flg);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_slip_no, MST_SLS_ACT_R.$dlv_slip_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_dlv_slip_no, MST_SLS_ACT_R.$ship_dlv_slip_no);
			}
		}
		
		/**
		 * 仕入直送売上の売上実績ＳＶ用電文データ作成
		 */
		protected MCNumber makeDdlvSlsData(
				MCNumber hdrPegNo,
				MCList<AccptRecvIf_Chk01_DtlR> tgtL,
				MCList<SlsAct_Upd01_HdrR> hdrL,
				MCList<SlsAct_Upd01_DtlR> dtlL,
				MCList<SlsAct_Upd01_IoR> ioL) {
			
			MCIndexKey ddlvIdx = tgtL.createIndex(
					AccptRecvIf_Chk01_DtlR.$imp_flg,
					AccptRecvIf_Chk01_DtlR.$iv_flg,
					AccptRecvIf_Chk01_DtlR.$accpt_dfct_flg,
					AccptRecvIf_Chk01_DtlR.$ddlvTgtFlg
					);
			
			MCList<AccptRecvIf_Chk01_DtlR> ddlvL = tgtL.subList(ddlvIdx, true, false, false, true);
			MCIndexKey ddlvLIdx = ddlvL.createIndex(AccptRecvIf_Chk01_DtlR.$fix_slo_d_no);
			MCList<AccptRecvIf_Chk01_DtlR> ddlvGrpL = ddlvL.groupBy(AccptRecvIf_Chk01_DtlR.$fix_slo_no);
			
			MCList<SlsAct_Upd01_HdrR> tmpHdrL = MCList.create(SlsAct_Upd01_HdrR.class);
			MCList<SlsAct_Upd01_HdrR> addHdrL = MCList.create(SlsAct_Upd01_HdrR.class);
			MCList<SlsAct_Upd01_DtlR> tmpDtlL = MCList.create(SlsAct_Upd01_DtlR.class);
			tmpDtlL.addStringColumn(SlsAct_Upd01_HdrR.$purc_ddlv_dlv_slip_no);
			
			MCNumber maxHdrPegNo = hdrPegNo;
			
			// 仕入直送売上
			for (AccptRecvIf_Chk01_DtlR ddlvGrpR : ddlvGrpL) {
				// 売上実績SV用ヘッダ電文作成
				SlsAct_Upd01_HdrR slsActHdrR = SlsAct_Upd01_HdrR.create();
				executeQuery(slsActHdrR, MSLAL5160_MST_SLO_S01(), ddlvGrpR);
				ddlvGrpR.wg_cd(slsActHdrR.wg_cd());
				slsActHdrR.hdr_peg_no(hdrPegNo);
				slsActHdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				slsActHdrR.setStatus(Status.CREATE);
				slsActHdrR.can_ac_dt(null);
				slsActHdrR.aprv_flg(false);
				slsActHdrR.ship_act_service_via_flg(false);
				slsActHdrR.ship_act_service_exec_flg(true);
				slsActHdrR.slip_split_non_flg(false);
				slsActHdrR.lot_chk_off_flg(true);
				slsActHdrR.xrate_rnd_typ(getCo().xrate_rnd_typ());
				slsActHdrR.edi_flg(true);
				slsActHdrR.ddlv_sls_flg(true);
				
				tmpHdrL.add(slsActHdrR);
				
				maxHdrPegNo = makeSlsActDL(tmpDtlL, slsActHdrR, ddlvL, ddlvLIdx, tmpHdrL, maxHdrPegNo, hdrPegNo);
				hdrPegNo = maxHdrPegNo.add(1);
			}
			
			// 仕入直送納品書ＮＯごとに売上実績SV用ヘッダ電文を再作成
			hdrPegNo = makeDdlvSlsData(addHdrL, dtlL, tmpHdrL, tmpDtlL, hdrPegNo);
			
			// 詳細データ作成
			makeDdlvSlsIo(hdrL, dtlL, ioL, addHdrL);
			
			return hdrPegNo;
		}
		protected MCNumber makeDdlvSlsData(
				MCList<SlsAct_Upd01_HdrR> slsHdrL,
				MCList<SlsAct_Upd01_DtlR> slsDtlL,
				MCList<SlsAct_Upd01_HdrR> tmpHdrL,
				MCList<SlsAct_Upd01_DtlR> tmpDtlL,
				MCNumber hdrPegNo) {
			
			if (tmpHdrL.isEmpty() || tmpDtlL.isEmpty()) {
				return hdrPegNo;
			}
			
			// ヘッダ紐付けＮＯを付け替えるため、いったん退避
			Map<MCNumber, SlsAct_Upd01_HdrR> hdrMap = new HashMap<>();
			tmpHdrL.forEach(r -> {
				hdrMap.put(r.hdr_peg_no(), r);
			});
			
			// 仕入直送納品書ＮＯごとに売上実績SV用ヘッダ電文を再作成
			hdrPegNo = ((MCNumber)tmpHdrL.min(SlsAct_Upd01_HdrR.$hdr_peg_no));
			for (MCList<SlsAct_Upd01_DtlR> dtlL : groupList(tmpDtlL, SlsAct_Upd01_HdrR.$purc_ddlv_dlv_slip_no)) {
				SlsAct_Upd01_DtlR dtlR = dtlL.get(0);
				SlsAct_Upd01_HdrR hdrR = hdrMap.get(dtlR.hdr_peg_no()).clone();
				
				dtlL.setNumber(SlsAct_Upd01_DtlR.$hdr_peg_no, hdrPegNo);
				hdrR.hdr_peg_no(hdrPegNo);
				hdrR.dlv_slip_no(dtlR.getStringNE(SlsAct_Upd01_HdrR.$purc_ddlv_dlv_slip_no));
				hdrR.purc_ddlv_dlv_slip_no(dtlR.getStringNE(SlsAct_Upd01_HdrR.$purc_ddlv_dlv_slip_no));
				
				slsHdrL.add(hdrR);
				slsDtlL.addAll(dtlL);
				
				hdrPegNo = hdrPegNo.add(1);
			}
			
			return hdrPegNo;
		}
		/**
		 * 上り電文の順番を意識したグループリストを取得する
		 */
		protected MCList<SlsAct_Upd01_DtlR>[] groupList(MCList<SlsAct_Upd01_DtlR> lst, String... key) {
			MCList<SlsAct_Upd01_DtlR>[] arr = lst.groupList(key);
			// 上り電文の順番を優先に並び替える
			for (int i=0; i<arr.length; i++) {
				arr[i].sort(SlsAct_Upd01_DtlR.$dtl_peg_no);
			}
			java.util.Arrays.sort(arr, new java.util.Comparator<MCList<SlsAct_Upd01_DtlR>>() {
				public int compare(MCList<SlsAct_Upd01_DtlR> o1, MCList<SlsAct_Upd01_DtlR> o2) {
					return o1.get(0).hdr_peg_no().compareTo(o2.get(0).hdr_peg_no());
				}
			});
			return arr;
		}
		
		/**
		 * 仕入直送売上の売上実績サービス用電文データ作成（詳細部）
		 */
		protected void makeDdlvSlsIo(
				MCList<SlsAct_Upd01_HdrR> hdrL,
				MCList<SlsAct_Upd01_DtlR> dtlL,
				MCList<SlsAct_Upd01_IoR> ioL,
				MCList<SlsAct_Upd01_HdrR> addHdrL) {
			MCIndexKey dtlLHdrPegNoIdx = dtlL.createIndex(SlsAct_Upd01_DtlR.$hdr_peg_no);
			for (SlsAct_Upd01_HdrR hdrR : addHdrL) {
				MAM_BP_R tmpBpR = getCstCache(hdrR.cst_cd());
				if (tmpBpR.cst_iv_flg()) {
					continue;
				}
				
				MCList<SlsAct_Upd01_DtlR> tgtDtlL = dtlL.subList(dtlLHdrPegNoIdx, hdrR.hdr_peg_no());
				tgtDtlL.addDateColumn(SlsAct_Upd01_HdrR.$ac_dt);
				tgtDtlL.addBooleanColumn("err_flg");
				tgtDtlL.setDateNE(SlsAct_Upd01_HdrR.$ac_dt, hdrR.ac_dt());
				// 組織変更・源泉税額要否設定
				dptChgAndWtax(hdrR, tgtDtlL);
				
				hdrL.add(hdrR);
				
				// 売上実績SV用詳細電文作成
				MCList<SlsAct_Upd01_IoR> slsActIoL = MCList.create(SlsAct_Upd01_IoR.class);
				
				int dispCnt = 0;
				int ioCnt = 0;
				for (SlsAct_Upd01_DtlR slsActDtlR : tgtDtlL) {
					dispCnt++;
					if (isNull(slsActDtlR.data_crud_typ())) {
						slsActDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					}
					
					slsActDtlR.disp_seq(dispCnt);
					if (!isNull(slsActDtlR.slo_d_no())) {
						slsActDtlR.upri_not_tgt_flg(true);
					}
					if (!hdrR.getBooleanNE("wtaxRateFlg")) {
						slsActDtlR.wtax_rate(null);
					}
					
					// 原価金額
					if (!isNull(slsActDtlR.cost_upri())) {
						slsActDtlR.cost_amt(
								MSUCL_SlsUtil.getCostAmt(
										slsActDtlR.cost_upri(),
										slsActDtlR.base_unit_qty(),
										getBaseCur().amt_dec_place()));
					}
					
					// 明細に紐づく売上実績SV用詳細電文も作成
					MCList<SlsAct_Upd01_IoR> tmpIoL = MCList.create(SlsAct_Upd01_IoR.class);
					tmpIoL.addDateColumn("ac_dt");
					boolean sepIoFlg = false;
					
					// 仕入後の場合（仕入後があるのは新規の場合のみ）
					if (MAC_DATA_CRUD_TYP.isCRT(slsActDtlR.data_crud_typ()) && !slsActDtlR.getBooleanNE("sync_flg") ) {
						executeQuery(tmpIoL, MSLAL5160_MST_ARR_ACT_S01(), slsActDtlR);
						
						if (tmpIoL.size() == 1) {
							tmpIoL.get(0).trd_unit_cd(slsActDtlR.trd_unit_cd());
							tmpIoL.get(0).trd_unit_qty(slsActDtlR.trd_unit_qty());
							tmpIoL.get(0).base_unit_cd(slsActDtlR.base_unit_cd());
							tmpIoL.get(0).base_unit_qty(slsActDtlR.base_unit_qty());
							if (isPack(slsActDtlR.itm_cd(), slsActDtlR.itm_sub1(), slsActDtlR.itm_sub2(), slsActDtlR.itm_sub3(), slsActDtlR.trd_unit_cd())) {
								tmpIoL.get(0).pack_unit_cd(slsActDtlR.trd_unit_cd());
								tmpIoL.get(0).pack_unit_qty(slsActDtlR.trd_unit_qty());
							}
							else {
								tmpIoL.get(0).pack_unit_cd(tmpIoL.get(0).base_unit_cd());
								tmpIoL.get(0).pack_unit_qty(tmpIoL.get(0).base_unit_qty());
							}
							if (isNull(slsActDtlR.loc_cd())) {
								slsActDtlR.loc_cd(tmpIoL.get(0).loc_cd());
							}
							if (isNull(slsActDtlR.str_ln_cd())) {
								slsActDtlR.str_ln_cd(tmpIoL.get(0).str_ln_cd());
							}
							if (isNull(slsActDtlR.lot_no())) {
								slsActDtlR.lot_no(tmpIoL.get(0).lot_no());
							}
							if (isNull(slsActDtlR.sublot_no())) {
								slsActDtlR.sublot_no(tmpIoL.get(0).sublot_no());
							}
						}
						else {
							sepIoFlg = true;
						}
					}
					else {
						SlsAct_Upd01_IoR tmpIoR = SlsAct_Upd01_IoR.create();
						copy(tmpIoR, slsActDtlR, createMap_SlsAct_Upd01_IoR_SlsAct_Upd01_DtlR());
						tmpIoR.sync_flg(slsActDtlR.getBooleanNE("sync_flg"));
						
						tmpIoL.add(tmpIoR);
					}
					
					tmpIoL.sort("ac_dt", SlsAct_Upd01_IoR.$arr_act_no);
					MCNumber tmpBaseUnitQty = slsActDtlR.base_unit_qty();
					for (SlsAct_Upd01_IoR tmpIoR : tmpIoL) {
						// 仕入済で複数行詳細がある場合は基準単位で消込を行う
						if (sepIoFlg) {
							tmpIoR.trd_unit_cd(tmpIoR.base_unit_cd());
							if (tmpBaseUnitQty.lte(MCNumber.ZERO)) {
								break;
							}
							if (tmpIoR.base_unit_qty().gt(tmpBaseUnitQty)) {
								tmpIoR.trd_unit_qty(tmpBaseUnitQty);
								tmpIoR.base_unit_qty(tmpBaseUnitQty);
							}
							else {
								tmpIoR.trd_unit_qty(tmpIoR.base_unit_qty());
							}
							tmpBaseUnitQty = tmpBaseUnitQty.subtract(tmpIoR.base_unit_qty());
						}
						
						tmpIoR.hdr_peg_no(hdrR.hdr_peg_no());
						tmpIoR.dtl_peg_no(slsActDtlR.dtl_peg_no());
						tmpIoR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						tmpIoR.setStatus(Status.CREATE);
						tmpIoR.io_peg_no(++ioCnt);
						
						if (isPack(slsActDtlR.itm_cd(), slsActDtlR.itm_sub1(), slsActDtlR.itm_sub2(), slsActDtlR.itm_sub3(), slsActDtlR.trd_unit_cd())) {
							// 取引単位数量を荷姿にする
							tmpIoR.pack_unit_cd(tmpIoR.trd_unit_cd());
							tmpIoR.pack_unit_qty(tmpIoR.trd_unit_qty());
						}
						else {
							// 基準単位数量を荷姿にする
							tmpIoR.pack_unit_cd(tmpIoR.base_unit_cd());
							tmpIoR.pack_unit_qty(tmpIoR.base_unit_qty());
						}
						
						slsActIoL.add(tmpIoR);
					}
				}
				// 新規の場合に追加（訂正の場合も新規扱いになる）
				if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
					ioL.addAll(slsActIoL);
				}
			}
		}
		
		/**
		 * 組織変更・源泉税額要否設定処理
		 */
		protected void dptChgAndWtax(
				SlsAct_Upd01_HdrR hdrR,
				MCList<SlsAct_Upd01_DtlR> tgtDtlL) {
			// 売上部門
			MAUCL_DptUtil.setDpt(hdrR, SlsAct_Upd01_HdrR.$sls_dpt_cd, null, SlsAct_Upd01_HdrR.$ac_dt, true);
			if (hdrR.getBooleanNE("err_flg")) {
				throwDptErr();
			}
			// ＷＧ取得
			hdrR.wg_cd(getWgCd(hdrR.sls_dpt_cd(), hdrR.ac_dt()));
			
			// 債権部門
			MAUCL_DptUtil.setDpt(hdrR, SlsAct_Upd01_HdrR.$ar_dpt_cd, null, SlsAct_Upd01_HdrR.$ac_dt, true);
			if (hdrR.getBooleanNE("err_flg")) {
				throwDptErr();
			}
			
			// 負担部門
			MAUCL_DptUtil.setDpt(tgtDtlL, SlsAct_Upd01_DtlR.$bd_dpt_cd, null, SlsAct_Upd01_HdrR.$ac_dt, true);
			if (tgtDtlL.subList("err_flg", true).size() > 0) {
				throwDptErr();
			}
			
			hdrR.addBooleanColumn("wtaxRateFlg");
			// 取引通貨＝基準通貨＝納税通貨または取引通貨＝基準通貨かつ納税通貨NULLの場合源泉税額を指定
			if ((isSame(hdrR.trd_cur_cd(), hdrR.base_cur_cd()) && 
				isSame(hdrR.trd_cur_cd(), hdrR.ptax_cur_cd())) ||
				(isSame(hdrR.trd_cur_cd(), hdrR.base_cur_cd()) && 
				isNull(hdrR.ptax_cur_cd()))) {
				hdrR.setBooleanNE("wtaxRateFlg", true);
			}
		}
		
		/**
		 * 売上実績サービス用明細電文作成
		 */
		protected MCNumber makeSlsActDL(MCList<SlsAct_Upd01_DtlR> dtlL,
				SlsAct_Upd01_HdrR slsActHdrR, MCList<AccptRecvIf_Chk01_DtlR> ddlvL,
				MCIndexKey ddlvLIdx, MCList<SlsAct_Upd01_HdrR> tmpHdrL,
				MCNumber maxHdrPegNo, MCNumber hdrPegNo) {
			// 売上実績サービス用明細電文作成
			MCList<SlsAct_Upd01_DtlR> slsActDtlL = MCList.create(SlsAct_Upd01_DtlR.class);
			slsActDtlL.addNumberColumn("upd_purc_peg_no");
			MCList<SlsAct_Upd01_DtlR> tmpSlsActDtlL = MCList.create(SlsAct_Upd01_DtlR.class);
			executeQuery(tmpSlsActDtlL, MSLAL5160_MST_SLO_D_S01(), slsActHdrR);
			tmpSlsActDtlL.addBooleanColumn("sync_flg");
			
			MCIndexKey tmpIdx = _slsActDL.createIndex(MST_SLS_ACT_D_R.$ext_purc_act_d_no, MST_SLS_ACT_D_R.$ext_sys_cd, MST_SLS_ACT_D_R.$sls_schd_no);
			
			int dtlPegNo = 0;
			for (SlsAct_Upd01_DtlR tmpSlsActDtlR : tmpSlsActDtlL) {
				MCList<AccptRecvIf_Chk01_DtlR> tgtDdlvL = ddlvL.subList(ddlvLIdx, tmpSlsActDtlR.slo_d_no());
				MCIndexKey extPurcActDNoIdxkey = ddlvL.createIndex(AccptRecvIf_Chk01_DtlR.$ext_purc_act_d_no);
				MCIndexKey extSysCdIdxkey = ddlvL.createIndex(AccptRecvIf_Chk01_DtlR.$ext_sys_cd);
				for (AccptRecvIf_Chk01_DtlR tgtDdlvR : tgtDdlvL) {
					if (isDel(tgtDdlvR) || tgtDdlvR.accpt_dfct_flg()) {
						continue;
					}
					if (dtlPegNo == 0) {
						setSlsHdrDt(slsActHdrR, tgtDdlvR.accpt_dt(), tgtDdlvR.ext_purc_act_d_no(), tgtDdlvR.ext_sys_cd(), true);
						setSlsHdrXrate(slsActHdrR);
					}
					
					MST_SLS_SCHD_R slsSchdR = _slsSchdL.getFirst(_slsSchdNoIdxkey, tgtDdlvR.fix_sls_schd_no());
					SlsAct_Upd01_DtlR addSlsActDtlR = SlsAct_Upd01_DtlR.create();
					addSlsActDtlR.addNumberColumn("upd_purc_peg_no");
					MCRow.copyall(addSlsActDtlR, tmpSlsActDtlR);
					addSlsActDtlR.hdr_peg_no(hdrPegNo);
					maxHdrPegNo = hdrPegNo;
					
					// 複数の未売上の売上予定がある場合、IFで指定された数量を満たす分だけ売上明細を登録する
					if (tgtDdlvR.sls_schd_mult_flg()) {
						MCIndexKey tmpSchdIdx = _slsSchdL.createIndex(
								MST_SLS_SCHD_R.$slo_d_no
								);
						boolean updFlg = false;
						MST_SLS_ACT_R slsAct = MST_SLS_ACT_R.create("SLSACT");
						MST_SLS_ACT_D_R slsActD1 = MST_SLS_ACT_D_R.create("SLSACTD1");
						MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
						MCQueryApiBuilder slsActD_bldr = MCQueryApiBuilder.create(slsActD1);
						slsActD_bldr.addInnerJoin(slsAct, bracket(slsAct.sls_act_no.eq(slsActD1.sls_act_no)).and(slsAct.sls_act_seq.eq(slsActD1.sls_act_seq)));
						slsActD_bldr.setWhere(slsActD1.slo_d_no.eq(bind("1")), tgtDdlvR.fix_slo_d_no());
						slsActD_bldr.addWhereWithAnd(slsAct.slip_sts_typ.eq(bind("1")), MAC_SLIP_STS_TYP.CRT.value());
						dbSelect("MSLAL5160_MST_SLS_ACT_D_S05", slsActDL, slsActD_bldr);
						
						MST_SLS_ACT_D_R slsActD2 = MST_SLS_ACT_D_R.create("SLSACTD2");
						MST_SLS_ACT_IO_R slsActIo = MST_SLS_ACT_IO_R.create("SLSACTIO");
						MCList<MST_SLS_ACT_IO_R> slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
						MCQueryApiBuilder slsActIoL_bldr = MCQueryApiBuilder.create(slsActIo);
						slsActIoL.addStringColumn(MST_SLS_ACT_D_R.$sls_schd_no);
						slsActIoL_bldr.addSelect(slsActD2.sls_schd_no);
						slsActIoL_bldr.addInnerJoin(slsActD2, bracket(slsActD2.sls_act_d_no.eq(slsActIo.sls_act_d_no)).and(slsActD2.sls_act_d_seq.eq(slsActIo.sls_act_d_seq)));
						slsActIoL_bldr.setWhere(slsActIo.sls_act_d_no.eq(bind("sls_act_d_no")));
						slsActIoL_bldr.addWhereWithAnd(slsActIo.sls_act_d_seq.eq(bind("sls_act_d_seq")));
						dbSelect("MSLAL5160_MST_SLS_ACT_IO_S02", slsActIoL, slsActIoL_bldr, slsActDL);
						
						MCIndexKey slsActIoSlsSchdNoIdxkey = slsActIoL.createIndex(MST_SLS_ACT_D_R.$sls_schd_no);
						if (isUpd(tgtDdlvR) && !isNull(_slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, tgtDdlvR.ext_purc_act_d_no(), tgtDdlvR.ext_sys_cd()))) {
							updFlg = true;
						}
						MCList<MST_SLS_SCHD_R> tmpSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
						int cnt = 0;
						for (MST_SLS_SCHD_R tmpSlsSchdR : filterSlsSchd(_slsSchdL.subList(tmpSchdIdx, tgtDdlvR.fix_slo_d_no()), tgtDdlvR)) {
							cnt++;
							if (!updFlg) {
								if (!tmpSlsSchdR.cmpl_flg()) {
									if (tgtDdlvR.sync_flg()) {
										if (isNull(tmpSlsSchdR.purc_act_d_no()) && !tmpSlsSchdR.getBooleanNE("use_flg")) {
											tmpSlsSchdL.add(tmpSlsSchdR);
										}
										else if (isSyncExcessSlsQty(tmpSlsSchdR, tgtDdlvR, cnt, tmpSchdIdx)) {
											tmpSlsSchdR.setBooleanNE("use_flg", false);
											tmpSlsSchdR.trd_unit_qty(tgtDdlvR.trd_unit_qty());
											tmpSlsSchdL.add(tmpSlsSchdR);
										}
									}
									else {
										if (!isNull(tmpSlsSchdR.purc_act_d_no())) {
											tmpSlsSchdL.add(tmpSlsSchdR);
										}
									}
								}
							}
							else {
								if (isSame(tmpSlsSchdR.sls_schd_no(), tgtDdlvR.fix_sls_schd_no()) && tmpSlsSchdR.cmpl_flg()) {
									tmpSlsSchdL.add(tmpSlsSchdR);
								}
								else {
									if (tgtDdlvR.sync_flg()) {
										boolean existFlg = false;
										MCList<MST_SLS_ACT_D_R> updSlsActDL = _slsActDL.subList(_slsActDExtPurcDNoIdxkey, tgtDdlvR.ext_purc_act_d_no(), tgtDdlvR.ext_sys_cd());
										for (MST_SLS_ACT_D_R updSlsActDR : updSlsActDL) {
											if (isSame(tmpSlsSchdR.sls_schd_no(), updSlsActDR.sls_schd_no())) {
												existFlg = true;
												break;
											}
										}
										if (!existFlg) {
											continue;
										}
									}
									MST_SLS_ACT_IO_R slsActIoR = slsActIoL.getFirst(slsActIoSlsSchdNoIdxkey, tmpSlsSchdR.sls_schd_no());
									if (tmpSlsSchdR.cmpl_flg()) {
										if (isSame(tgtDdlvR.sync_flg(), slsActIoR.sync_flg())) {
											tmpSlsSchdL.add(tmpSlsSchdR);
										}
									}
									else if (!tmpSlsSchdR.cmpl_flg()) {
										if (!tgtDdlvR.sync_flg() && !isNull(tmpSlsSchdR.purc_act_d_no())) {
											tmpSlsSchdL.add(tmpSlsSchdR);
										}
									}
								}
							}
						}
						if (!updFlg && isNull(tmpSlsSchdL)) {
							tmpSlsSchdL.addAll(filterSlsSchd(_slsSchdL.subList(tmpSchdIdx, tgtDdlvR.fix_slo_d_no()), tgtDdlvR));
						}
						// 売上実績明細データ作成（売上予定複数存在）
						dtlPegNo = makeDdlvSlsActDtlDataMulti(dtlPegNo, ddlvL,
								slsActHdrR, tmpSlsSchdL, tgtDdlvR,
								slsActDL, addSlsActDtlR, tmpSlsActDtlR, slsActDtlL,
								tmpIdx, extPurcActDNoIdxkey, extSysCdIdxkey);
					}
					else {
						// 売上実績明細データ作成
						dtlPegNo = makeDdlvSlsActDtlData(dtlPegNo, slsActHdrR, tgtDdlvR,
								addSlsActDtlR, tmpSlsActDtlR, slsActDtlL, slsSchdR);
					}
				}
			}
			
			dtlL.addAll(slsActDtlL);
			return maxHdrPegNo;
		}
		
		protected void setSlsHdrXrate(SlsAct_Upd01_HdrR slsActHdrR) {
			if (isNull(slsActHdrR.xrate())) {
				slsActHdrR.xrate(execFuncNumber(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_SLS_XRATE", "01"),
						MAPA_XCHNG$F_GET_SLS_XRATE( bind("trd_cur_cd"), bind("sls_dt")), slsActHdrR));
			}
			if (isNull(slsActHdrR.ptax_cur_cd())) {
				slsActHdrR.ptax_xrate(null);
			}
			else if (isNull(slsActHdrR.ptax_xrate())) {
				slsActHdrR.ptax_xrate(execFuncNumber(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_XRATE", "01"),
						MAPA_XCHNG$F_GET_XRATE(bind("trd_cur_cd"), bind("ptax_cur_cd"), bind("xrate_cd"), bind("sls_dt")), slsActHdrR));
			}
		}
		
		/**
		 * 数量超過分を売上計上対象としてよい売上予定かどうか判断（売上実績用）
		 */
		protected boolean isSyncExcessSlsQty(
				MST_SLS_SCHD_R tmpSlsSchdR,
				AccptRecvIf_Chk01_DtlR tgtDdlvR,
				int cnt,
				MCIndexKey tmpSchdIdx) {
			if (isNull(tmpSlsSchdR.purc_act_d_no()) && tmpSlsSchdR.getBooleanNE("use_flg")) {
				if (MAC_DATA_CRUD_TYP.isCRT(tgtDdlvR.data_crud_typ())
					&& cnt == filterSlsSchd(_slsSchdL.subList(tmpSchdIdx, tgtDdlvR.fix_slo_d_no()), tgtDdlvR).size()) {
					return true;
				}
			}
			return false;
		}
		
		/**
		 * 売上実績サービス用明細電文作成（明細部）
		 */
		protected int makeDdlvSlsActDtlData(
				int dtlPegNo,
				SlsAct_Upd01_HdrR slsActHdrR,
				AccptRecvIf_Chk01_DtlR tgtDdlvR,
				SlsAct_Upd01_DtlR addSlsActDtlR,
				SlsAct_Upd01_DtlR tmpSlsActDtlR,
				MCList<SlsAct_Upd01_DtlR> slsActDtlL,
				MST_SLS_SCHD_R slsSchdR) {
			addSlsActDtlR.dtl_peg_no(dtlPegNo++);
			addSlsActDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			addSlsActDtlR.setStatus(Status.CREATE);
			addSlsActDtlR.pri_prnt_flg(true);
			addSlsActDtlR.tax_cd(tgtDdlvR.fix_tax_cd());
			MAM_TAX_R tmpTaxR = getTaxR(tgtDdlvR.fix_tax_cd());
			addSlsActDtlR.inc_tax_flg(tmpTaxR.inc_tax_flg());
			addSlsActDtlR.tax_rate(tmpTaxR.tax_rate());
			addSlsActDtlR.tax_typ(tmpTaxR.tax_typ());
			addSlsActDtlR.trd_cur_upri(tgtDdlvR.fix_trd_cur_upri());
			addSlsActDtlR.trd_unit_cd(tgtDdlvR.trd_unit_cd());
			addSlsActDtlR.trd_unit_qty(tgtDdlvR.trd_unit_qty());
			addSlsActDtlR.base_unit_qty(tgtDdlvR.fix_base_unit_qty());
			addSlsActDtlR.sls_schd_abort_flg(tgtDdlvR.abort_flg());
			addSlsActDtlR.loc_cd(tgtDdlvR.loc_cd());
			addSlsActDtlR.str_ln_cd(tgtDdlvR.str_ln_cd());
			addSlsActDtlR.lot_no(tgtDdlvR.lot_no());
			addSlsActDtlR.sublot_no(tgtDdlvR.sublot_no());
			addSlsActDtlR.stk_mng_typ(tgtDdlvR.stk_mng_typ());
			addSlsActDtlR.ext_purc_act_d_no(tgtDdlvR.ext_purc_act_d_no());	// 外部仕入実績明細ＮＯ
			addSlsActDtlR.ext_sys_cd(tgtDdlvR.ext_sys_cd());	// 外部システムＣＤ
			addSlsActDtlR.setBooleanNE("sync_flg", tgtDdlvR.sync_flg());
			addSlsActDtlR.purc_act_no(slsSchdR.getStringNE("purc_act_no"));
			addSlsActDtlR.purc_act_d_no(slsSchdR.purc_act_d_no());
			addSlsActDtlR.sls_schd_no(slsSchdR.sls_schd_no());
			slsSchdR.setBooleanNE("use_flg", true);
			addSlsActDtlR.ship_schd_no(slsSchdR.ship_schd_no());
			addSlsActDtlR.base_unit_cd(slsSchdR.base_unit_cd());
			addSlsActDtlR.purc_ddlv_po_no(slsSchdR.getStringNE("purc_ddlv_po_no"));
			addSlsActDtlR.purc_ddlv_po_d_no(slsSchdR.getStringNE("purc_ddlv_po_d_no"));
			addSlsActDtlR.dlv_slip_d_no(
				slsSchdR.getStringNE(MST_PURC_DLV_SLIP_D_R.$purc_ddlv_dlv_slip_d_no)
			);
			addSlsActDtlR.purc_ddlv_dlv_slip_d_no(
				slsSchdR.getStringNE(MST_PURC_DLV_SLIP_D_R.$purc_ddlv_dlv_slip_d_no)
			);
			addSlsActDtlR.setStringNE(
				SlsAct_Upd01_HdrR.$purc_ddlv_dlv_slip_no,
				slsSchdR.getStringNE(MST_PURC_DLV_SLIP_D_R.$purc_ddlv_dlv_slip_no)
			);
			
			// 基準単位数
			if (isSame(addSlsActDtlR.trd_unit_cd(), addSlsActDtlR.base_unit_cd())) {
				addSlsActDtlR.base_unit_qty(addSlsActDtlR.trd_unit_qty());
			}
			else {
				addSlsActDtlR.base_unit_qty(getBaseUnitQty(
						addSlsActDtlR.trd_unit_qty(),
						addSlsActDtlR.trd_unit_cd(),
						addSlsActDtlR.base_unit_cd(),
						addSlsActDtlR.itm_cd(),
						addSlsActDtlR.itm_sub1(),
						addSlsActDtlR.itm_sub2(),
						addSlsActDtlR.itm_sub3()));
			}
			
			if (addSlsActDtlR.sundry_itm_flg()) {
				addSlsActDtlR.itm_nm(nvl(tgtDdlvR.itm_nm(), tmpSlsActDtlR.itm_nm()));
			}
			else {
				addSlsActDtlR.itm_nm(null);
			}
			
			if (!isNull(_slsActDL)) {
				MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, tgtDdlvR.ext_purc_act_d_no(), tgtDdlvR.ext_sys_cd());
				if (!isNull(slsActDR)) {
					addSlsActDtlR.setNumberNE("upd_purc_peg_no", slsActDR.getNumberNE("upd_purc_peg_no"));
					addSlsActDtlR.loc_cd(slsActDR.loc_cd());
					addSlsActDtlR.str_ln_cd(slsActDR.str_ln_cd());
					addSlsActDtlR.cst_po_d_no(slsActDR.cst_po_d_no());
					addSlsActDtlR.purc_ddlv_po_no(slsActDR.purc_ddlv_po_no());
				}
			}
			if (!isNull(tgtDdlvR.fix_trd_cur_dscnt_amt()) && !tgtDdlvR.fix_trd_cur_dscnt_amt().isZero()) {
				addSlsActDtlR.trd_cur_dscnt_amt(tgtDdlvR.fix_trd_cur_dscnt_amt());
			}
			else if (isNull(tgtDdlvR.fix_trd_cur_dscnt_amt()) && !isNull(addSlsActDtlR.trd_cur_dscnt_amt())) {
				MST_SLO_D_R sloDR = _sloDL.getFirst(MST_SLO_D_R.$slo_d_no, tgtDdlvR.fix_slo_d_no());
				MAM_CUR_R trdCurR = getCur(slsActHdrR.trd_cur_cd());
				addSlsActDtlR.trd_cur_dscnt_amt(sloDR.trd_cur_dscnt_amt().divide(sloDR.trd_unit_qty())
				.multiply(addSlsActDtlR.trd_unit_qty(), trdCurR.amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCstCache(slsActHdrR.cst_cd()).sls_amt_rnd_typ())));
			}
			
			if (useIfData()) {
				addSlsActDtlR.interim_flg(tgtDdlvR.interim_flg());
			}
			
			slsActDtlL.add(addSlsActDtlR);
			
			return dtlPegNo;
		}
		
		/**
		 * 売上実績サービス用明細電文作成（明細部・複数売上予定対象）
		 */
		protected int makeDdlvSlsActDtlDataMulti(
				int dtlPegNo,
				MCList<AccptRecvIf_Chk01_DtlR> ddlvL,
				SlsAct_Upd01_HdrR slsActHdrR,
				MCList<MST_SLS_SCHD_R> tmpSlsSchdL,
				AccptRecvIf_Chk01_DtlR tgtDdlvR,
				MCList<MST_SLS_ACT_D_R> slsActDL,
				SlsAct_Upd01_DtlR addSlsActDtlR,
				SlsAct_Upd01_DtlR tmpSlsActDtlR,
				MCList<SlsAct_Upd01_DtlR> slsActDtlL,
				MCIndexKey tmpIdx,
				MCIndexKey extPurcActDNoIdxkey,
				MCIndexKey extSysCdIdxkey) {
			int schdSize = tmpSlsSchdL.subList("use_flg", false).size();
			tmpSlsSchdL.sort(MST_SLS_SCHD_R.$sls_schd_dt, MST_SLS_SCHD_R.$sls_schd_no);
			MCNumber trdUnitQty = tgtDdlvR.trd_unit_qty();
			int cnt = 0;
			for (MST_SLS_SCHD_R tmpSlsSchdR : tmpSlsSchdL) {
				if (tmpSlsSchdR.getBooleanNE("use_flg") == true) {
					continue;
				}
				cnt++;
				if (trdUnitQty.isZero()) {
					break;
				}
				
				SlsAct_Upd01_DtlR addTmpSlsActDtlR = SlsAct_Upd01_DtlR.create();
				addTmpSlsActDtlR.addNumberColumn("upd_purc_peg_no");
				MCRow.copyall(addTmpSlsActDtlR, addSlsActDtlR);
				
				addTmpSlsActDtlR.dtl_peg_no(dtlPegNo++);
				addTmpSlsActDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				addTmpSlsActDtlR.setStatus(Status.CREATE);
				addTmpSlsActDtlR.pri_prnt_flg(true);
				addTmpSlsActDtlR.tax_cd(tgtDdlvR.fix_tax_cd());
				MAM_TAX_R tmpTaxR = getTaxR(tgtDdlvR.fix_tax_cd());
				addTmpSlsActDtlR.inc_tax_flg(tmpTaxR.inc_tax_flg());
				addTmpSlsActDtlR.tax_rate(tmpTaxR.tax_rate());
				addTmpSlsActDtlR.tax_typ(tmpTaxR.tax_typ());
				MST_SLO_D_R sloDR = _sloDL.getFirst(MST_SLO_D_R.$slo_d_no, tgtDdlvR.fix_slo_d_no());
				if (isNull(tgtDdlvR.fix_trd_cur_upri())) {
					// 対象受注明細の単価を取得
					addTmpSlsActDtlR.trd_cur_upri(sloDR.trd_cur_upri());
				}
				else {
					addTmpSlsActDtlR.trd_cur_upri(tgtDdlvR.fix_trd_cur_upri());
				}
				
				addTmpSlsActDtlR.trd_unit_cd(tgtDdlvR.trd_unit_cd());
				
				// 数量消込
				trdUnitQty = allocSlsSchdQty(trdUnitQty, cnt, schdSize, tmpSlsSchdL,
						ddlvL, tgtDdlvR, addTmpSlsActDtlR, tmpSlsSchdR, slsActDL,
						extPurcActDNoIdxkey, extSysCdIdxkey);
				
				// 売上予定の数量で案分して、各売上数量を計算する
				if (!isNull(sloDR.trd_cur_dscnt_amt()) && !sloDR.trd_cur_dscnt_amt().isZero()) {
					MAM_CUR_R trdCurR = getCur(slsActHdrR.trd_cur_cd());
					addTmpSlsActDtlR.trd_cur_dscnt_amt(sloDR.trd_cur_dscnt_amt().divide(sloDR.trd_unit_qty())
					.multiply(addTmpSlsActDtlR.trd_unit_qty(), trdCurR.amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCstCache(slsActHdrR.cst_cd()).sls_amt_rnd_typ())));
				}
				
				addTmpSlsActDtlR.loc_cd(tgtDdlvR.loc_cd());
				addTmpSlsActDtlR.str_ln_cd(tgtDdlvR.str_ln_cd());
				addTmpSlsActDtlR.lot_no(nvl(tmpSlsSchdR.getStringNE("tgt_lot_no"), tmpSlsSchdR.lot_no()));
				addTmpSlsActDtlR.sublot_no(tmpSlsSchdR.sublot_no());
				addTmpSlsActDtlR.stk_mng_typ(tgtDdlvR.stk_mng_typ());
				addTmpSlsActDtlR.ext_purc_act_d_no(tgtDdlvR.ext_purc_act_d_no());	// 外部仕入実績明細ＮＯ
				addTmpSlsActDtlR.ext_sys_cd(tgtDdlvR.ext_sys_cd());	// 外部システムＣＤ
				addTmpSlsActDtlR.setBooleanNE("sync_flg", tgtDdlvR.sync_flg());
				addTmpSlsActDtlR.purc_act_no(tmpSlsSchdR.getStringNE("purc_act_no"));
				addTmpSlsActDtlR.purc_act_d_no(tmpSlsSchdR.purc_act_d_no());
				addTmpSlsActDtlR.sls_schd_no(tmpSlsSchdR.sls_schd_no());
				addTmpSlsActDtlR.ship_schd_no(tmpSlsSchdR.ship_schd_no());
				addTmpSlsActDtlR.base_unit_cd(tmpSlsSchdR.base_unit_cd());
				addTmpSlsActDtlR.purc_ddlv_po_no(tmpSlsSchdR.getStringNE("purc_ddlv_po_no"));
				addTmpSlsActDtlR.purc_ddlv_po_d_no(tmpSlsSchdR.getStringNE("purc_ddlv_po_d_no"));
				addTmpSlsActDtlR.dlv_slip_d_no(
					tmpSlsSchdR.getStringNE(MST_PURC_DLV_SLIP_D_R.$purc_ddlv_dlv_slip_d_no)
				);
				addTmpSlsActDtlR.purc_ddlv_dlv_slip_d_no(
					tmpSlsSchdR.getStringNE(MST_PURC_DLV_SLIP_D_R.$purc_ddlv_dlv_slip_d_no)
				);
				addTmpSlsActDtlR.setStringNE(
					SlsAct_Upd01_HdrR.$purc_ddlv_dlv_slip_no,
					tmpSlsSchdR.getStringNE(MST_PURC_DLV_SLIP_D_R.$purc_ddlv_dlv_slip_no)
				);
				
				// 基準単位数
				if (isSame(addTmpSlsActDtlR.trd_unit_cd(), addTmpSlsActDtlR.base_unit_cd())) {
					addTmpSlsActDtlR.base_unit_qty(addTmpSlsActDtlR.trd_unit_qty());
				}
				else {
					addTmpSlsActDtlR.base_unit_qty(getBaseUnitQty(
							addTmpSlsActDtlR.trd_unit_qty(),
							addTmpSlsActDtlR.trd_unit_cd(),
							addTmpSlsActDtlR.base_unit_cd(),
							addTmpSlsActDtlR.itm_cd(),
							addTmpSlsActDtlR.itm_sub1(),
							addTmpSlsActDtlR.itm_sub2(),
							addTmpSlsActDtlR.itm_sub3()));
				}
				
				if (tgtDdlvR.abort_flg() && addTmpSlsActDtlR.base_unit_qty().lt(tmpSlsSchdR.base_unit_qty())) {
					addTmpSlsActDtlR.sls_schd_abort_flg(true);
				}
				else {
					addTmpSlsActDtlR.sls_schd_abort_flg(false);
				}
				
				if (addTmpSlsActDtlR.sundry_itm_flg()) {
					addTmpSlsActDtlR.itm_nm(nvl(tgtDdlvR.itm_nm(), tmpSlsActDtlR.itm_nm()));
				}
				else {
					addTmpSlsActDtlR.itm_nm(null);
				}
				
				if (!isNull(_slsActDL)) {
					MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(tmpIdx, tgtDdlvR.ext_purc_act_d_no(), tgtDdlvR.ext_sys_cd(), addTmpSlsActDtlR.sls_schd_no());
					if (!isNull(slsActDR)) {
						addTmpSlsActDtlR.setNumberNE("upd_purc_peg_no", slsActDR.getNumberNE("upd_purc_peg_no"));
						addTmpSlsActDtlR.loc_cd(slsActDR.loc_cd());
						addTmpSlsActDtlR.str_ln_cd(slsActDR.str_ln_cd());
						addTmpSlsActDtlR.cst_po_d_no(slsActDR.cst_po_d_no());
						addTmpSlsActDtlR.purc_ddlv_po_no(slsActDR.purc_ddlv_po_no());
					}
				}
				
				if (useIfData()) {
					addTmpSlsActDtlR.interim_flg(tgtDdlvR.interim_flg());
				}
				
				slsActDtlL.add(addTmpSlsActDtlR);
			}
			return dtlPegNo;
		}
		
		/**
		 * 複数売上予定対象に対する数量消込処理
		 */
		protected MCNumber allocSlsSchdQty(
				MCNumber trdUnitQty,
				int cnt,
				int schdSize,
				MCList<MST_SLS_SCHD_R> tmpSlsSchdL,
				MCList<AccptRecvIf_Chk01_DtlR> ddlvL,
				AccptRecvIf_Chk01_DtlR tgtDdlvR,
				SlsAct_Upd01_DtlR addTmpSlsActDtlR,
				MST_SLS_SCHD_R tmpSlsSchdR,
				MCList<MST_SLS_ACT_D_R> slsActDL,
				MCIndexKey extPurcActDNoIdxkey,
				MCIndexKey extSysCdIdxkey) {
			if (!tgtDdlvR.sync_flg()) {

				// 取引単位数量を計算する
				MCNumber schdQty = tmpSlsSchdR.trd_unit_qty();
				MCNumber applyQty = nvl(tmpSlsSchdR.getNumberNE("apply_trd_unit_qty"), MCNumber.ZERO);
				schdQty = schdQty.subtract(applyQty);
				// 
				for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
					if (isSame(slsActDR.sls_schd_no(), tmpSlsSchdR.sls_schd_no())
							&& !(ddlvL.contains(extPurcActDNoIdxkey, slsActDR.ext_purc_act_d_no()) && ddlvL.contains(extSysCdIdxkey, slsActDR.ext_sys_cd()))) {
						schdQty = schdQty.subtract(slsActDR.trd_unit_qty());
					}
				}

				if (trdUnitQty.eq(schdQty)) {
					addTmpSlsActDtlR.trd_unit_qty(trdUnitQty);
					trdUnitQty = MCNumber.ZERO;
					tmpSlsSchdR.setBooleanNE("use_flg", true);
				}
				else if (trdUnitQty.lt(schdQty)) {
					tmpSlsSchdR.setNumberNE("apply_trd_unit_qty", applyQty.add(trdUnitQty));
					addTmpSlsActDtlR.trd_unit_qty(trdUnitQty);
					trdUnitQty = MCNumber.ZERO;
				}
				else {
					trdUnitQty = trdUnitQty.subtract(schdQty);
					if (trdUnitQty.isPositive() && isSame(schdSize, cnt)) {
						addTmpSlsActDtlR.trd_unit_qty(schdQty.add(trdUnitQty));
						trdUnitQty = MCNumber.ZERO;
					}
					else {
						addTmpSlsActDtlR.trd_unit_qty(schdQty);
					}
					tmpSlsSchdR.setBooleanNE("use_flg", true);
				}
			}
			else {
				if (trdUnitQty.gt(tmpSlsSchdR.trd_unit_qty())) {
					if (tmpSlsSchdL.size() == cnt) {
						addTmpSlsActDtlR.trd_unit_qty(trdUnitQty);
						trdUnitQty = MCNumber.ZERO;
					}
					else {
						addTmpSlsActDtlR.trd_unit_qty(tmpSlsSchdR.trd_unit_qty());
						trdUnitQty = trdUnitQty.subtract(tmpSlsSchdR.trd_unit_qty());
					}
					tmpSlsSchdR.setBooleanNE("use_flg", true);
				}
				else {
					if (trdUnitQty.eq(tmpSlsSchdR.trd_unit_qty())) {
						tmpSlsSchdR.setBooleanNE("use_flg", true);
					}
					tmpSlsSchdR.trd_unit_qty(tmpSlsSchdR.trd_unit_qty().subtract(trdUnitQty));
					addTmpSlsActDtlR.trd_unit_qty(trdUnitQty);
					trdUnitQty = MCNumber.ZERO;
				}
				tmpSlsSchdR.setStringNE("tgt_lot_no", nvl(tgtDdlvR.lot_no(), tmpSlsSchdR.lot_no()));
			}
			
			return trdUnitQty;
		}
		
		protected void setSlsHdrDt(SlsAct_Upd01_HdrR slsActHdrR, MCDate ifAccptDt, String extPurcActDNo , String extSysCd, boolean isDdlv) {
			MST_SLS_ACT_D_R updSlsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, extPurcActDNo, extSysCd);
			boolean isSlsClose = callClChk(ifAccptDt, false);
			MCDate fixDt = getFixDt(ifAccptDt, isSlsClose);
			if (isNull(ifAccptDt) || isSetIfDtOrToday(ifAccptDt, isSlsClose)) {
				slsActHdrR.ac_dt(fixDt);
				slsActHdrR.bill_basis_dt(fixDt);
			}
			else {
				slsActHdrR.ac_dt(ifAccptDt);
				slsActHdrR.bill_basis_dt(ifAccptDt);
			}
			
			if (isNull(updSlsActDR)) {
				slsActHdrR.sls_dt(getToday());
				// 仕入直送売上（仕入同時計上）の場合
				if (isDdlv) {
					slsActHdrR.ship_tm(getToday());
					slsActHdrR.dlv_tm(getToday());
				}
			}
			else {
				MST_SLS_ACT_R updSlsActR = _slsActL.getFirst(_slsActIdxkey, updSlsActDR.sls_act_no());
				slsActHdrR.can_ac_dt(fixDt);
				slsActHdrR.sls_dt(updSlsActR.sls_dt());
				// 仕入直送売上（仕入同時計上）の場合
				if (isDdlv) {
					slsActHdrR.ship_tm(updSlsActR.ship_tm());
					slsActHdrR.dlv_tm(updSlsActR.dlv_tm());
				}
			}
		}
		
		protected boolean isSetIfDtOrToday(MCDate tgtDt, boolean isClose) {
			// 対象年月が締済の場合
			if (isClose) {
				// エラーとする場合
				if(isSame(getSysParm("ACCPT_RECV_IF_CLOSE_ERR_FLG"), "1")) {
					return false;
				}
				// エラーとしない場合
				return true;
			}
			return true;
		}
		
		protected MCDate getFixDt(MCDate tgtDt, boolean isClose) {
			if (isNull(tgtDt)) {
				return getToday();
			}
			// 対象年月が締済の場合
			if (isClose) {
				return getToday();
			}
			
			return tgtDt;
		}
		
		protected boolean callClChk(MCDate tgtDt, boolean isPurc) {
			// 締処理サービス
			MSBIL_ClService.Cl_Chk03 op = MSBIL_ClService.crtCl_Chk03();
			Cl_Chk03_CndR cndR = Cl_Chk03_CndR.create();
			
			cndR.ac_dt(tgtDt);
			if (isPurc) {
				// 仕入締チェック
				cndR.purc_cls_chk_flg(true);
			}
			else {
				// 売上締チェック
				cndR.sls_cls_chk_flg(true);
			}
			op.up0().add(cndR);
			op.up1().no_msg_flg(true);
			op.exec();
			
			return op.down0().get(0).err_flg();
		}
		
		protected MCMessageList ddlvTgtChk(MCList<AccptRecvIf_Chk01_DtlR> chkL) {
			MCMessageList msgL = new MCMessageList();
			for (AccptRecvIf_Chk01_DtlR chkR : chkL) {
				if (chkR.err_flg() || (isUpd(chkR) && chkR.accpt_dfct_flg()) || !chkR.ddlvTgtFlg() || !chkR.sync_flg() || !chkR.sls_schd_mult_flg() || !isNull(chkR.fix_sls_schd_no()) || chkR.iv_flg()) {
					continue;
				}
				MST_SLS_ACT_D_R updSlsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, chkR.ext_purc_act_d_no(), chkR.ext_sys_cd());
				if (isCrt(chkR) || isUpd(chkR) && isNull(updSlsActDR)) {
					if (isNull(chkR.lot_no()) && isNull(chkR.str_ln_cd())) {
						msgL.add(new MCMessage(chkR, null, MSLAL0402,
								chkR.data_no(), chkR.data_lno(),
								chkR.cst_cd(), chkR.cst_po_no(),
								chkR.cst_po_d_no()));
						chkR.err_flg(true);
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 	ロットＮＯ発番処理
		 */
		protected MCMessageList setLotNo(MCList<AccptRecvIf_Chk01_DtlR> ddlvL) {
			MCMessageList msgL = new MCMessageList();
			initItmCache(ddlvL);
			
			// 品目情報セット
			for (AccptRecvIf_Chk01_DtlR ddlvR : ddlvL) {
				if (isDel(ddlvR) || !ddlvR.ddlvTgtFlg() || ddlvR.accpt_dfct_flg() || ddlvR.err_flg()) {
					continue;
				}
				MAM_ITM_R tmpItm = getItmCache(ddlvR.itm_cd(), ddlvR.itm_sub1(), ddlvR.itm_sub2(), ddlvR.itm_sub3());
				ddlvR.lot_mng_typ(tmpItm.lot_mng_typ());
				ddlvR.lot_no_ptn_cd(tmpItm.lot_no_ptn_cd());
				ddlvR.lot_no_typ(tmpItm.lot_no_typ());
				ddlvR.sublot_mng_typ(tmpItm.sublot_mng_typ());
				ddlvR.sublot_no_ptn_cd(tmpItm.sublot_no_ptn_cd());
				ddlvR.sublot_no_typ(tmpItm.sublot_no_typ());
				ddlvR.stk_mng_typ(tmpItm.stk_mng_typ());
				ddlvR.dscnt_itm_flg(tmpItm.dscnt_itm_flg());
				if (!MAC_LOT_MNG_TYP.req_lot(ddlvR.lot_mng_typ())) {
					ddlvR.lot_no(MAC_STR.NULL_VAL.value());
					ddlvR.crt_lot_flg(false);
				}
				else {
					if (MAC_LOT_NO_TYP.isAUTO(ddlvR.lot_no_typ())) {
						ddlvR.lot_no(null);
					}
					else {
						ddlvR.lot_no(nullValToNull(ddlvR.lot_no()));
					}
				}
			}
			
			// ロットＮＯ、サブロットＮＯ発番対象リスト
			MCList<ElmArgsR> lotNoL = MCList.create(ElmArgsR.class);
			MCList<ElmArgsR> subLotNoL = MCList.create(ElmArgsR.class);
			ddlvL.addStringColumn("sppl_cd");
			
			MCList<ElmArgsR> mltLotNoL = MCList.create(ElmArgsR.class);
			MCList<ElmArgsR> mltSubLotNoL = MCList.create(ElmArgsR.class);
			
			MCIndexKey slsActDPurcActDIdx = _slsActDL.createIndex(MST_SLS_ACT_D_R.$ext_purc_act_d_no, MST_SLS_ACT_D_R.$ext_sys_cd, MST_SLS_ACT_D_R.$purc_act_d_no);
			int slsSchdPegNo = 0;
			for (AccptRecvIf_Chk01_DtlR rsltR : ddlvL) {
				if (!rsltR.ddlvTgtFlg() || rsltR.err_flg() || isDel(rsltR) || (isNull(rsltR.fix_sls_schd_no()) && !rsltR.sls_schd_mult_flg()) || rsltR.accpt_dfct_flg()) {
					continue;
				}
				if (!isNull(rsltR.fix_sls_schd_no()) && !rsltR.sls_schd_mult_flg()) {
					makeCrtLotL(lotNoL, subLotNoL, rsltR, msgL);
				}
				else {
					slsSchdPegNo = makeCrtLotLMulti(slsSchdPegNo, mltLotNoL, mltSubLotNoL, rsltR, msgL, slsActDPurcActDIdx);
				}
			}
			
			// ロットＮＯ発番・セット
			if (!isNull(lotNoL) && !lotNoL.isEmpty()) {
				setNum(MAC_NUM_BIZ_TYP.LOT, lotNoL);
				String[] srcCols = new String[]{ElmArgsR.$new_no};
				String[] destCols = new String[]{AccptRecvIf_Chk01_DtlR.$lot_no};
				copyByPegNo(ddlvL, lotNoL, AccptRecvIf_Chk01_DtlR.$peg_no, destCols, ElmArgsR.$peg_no, srcCols);
			}
			
			// サブロットＮＯ発番・セット
			if (!isNull(subLotNoL) && !subLotNoL.isEmpty()) {
				setNum(MAC_NUM_BIZ_TYP.SUBLOT, subLotNoL);
				String[] srcCols = new String[]{ElmArgsR.$new_no};
				String[] destCols = new String[]{AccptRecvIf_Chk01_DtlR.$sublot_no};
				copyByPegNo(ddlvL, subLotNoL, AccptRecvIf_Chk01_DtlR.$peg_no, destCols, ElmArgsR.$peg_no, srcCols);
			}
			return msgL;
		}
		
		/**
		 * ロットＮＯ発番対象リスト作成（売上予定が一意）
		 */
		protected void makeCrtLotL(
				MCList<ElmArgsR> lotNoL,
				MCList<ElmArgsR> subLotNoL,
				AccptRecvIf_Chk01_DtlR rsltR,
				MCMessageList msgL) {
			MST_SLO_D_R sloDR = _sloDL.getFirst(_sloDSloDNoIdxkey, rsltR.fix_slo_d_no());
			rsltR.setStringNE("sppl_cd", sloDR.sppl_cd());
			MST_SLS_SCHD_R slsSchdR = _slsSchdL.getFirst(_slsSchdNoIdxkey, rsltR.fix_sls_schd_no());
			
			// 入荷予定にロットＮＯが設定されている場合、そのロットＮＯを採用するのでロットＮＯを発番しない
			MST_PURC_SCHD_R schdR = getPurcSchdR(slsSchdR);
			if (!isNull(schdR) && !isNull(schdR.getStringNE("lot_no"))) {
				rsltR.lot_no(schdR.getStringNE("lot_no"));
				rsltR.sublot_no(nvl(schdR.getStringNE("sublot_no"), MAC_STR.NULL_VAL.value()));
				rsltR.crt_lot_flg(false);
				slsSchdR.setBooleanNE("existLotFlg", true);
				return;
			}
			
			if (!rsltR.sync_flg() && rsltR.ddlvTgtFlg() && !isNull(slsSchdR.purc_act_d_no())) {
				MST_PURC_ACT_D_R purcActDR = getPurcActR(slsSchdR);
				if (!isNull(purcActDR) && !isNull(purcActDR.lot_no())) {
					rsltR.lot_no(purcActDR.lot_no());
					rsltR.sublot_no(nvl(purcActDR.sublot_no(), MAC_STR.NULL_VAL.value()));
					rsltR.crt_lot_flg(false);
					slsSchdR.setBooleanNE("existLotFlg", true);
					return;
				}
			}
			
			if (!isUpd(rsltR) && !MAC_LOT_MNG_TYP.isNOT_MNG(rsltR.lot_mng_typ()) && MAC_LOT_NO_TYP.isMANUAL(rsltR.lot_no_typ()) && isNullOrNullVal(rsltR.lot_no())) {
				msgL.add(new MCMessage(rsltR, null, MSLAL0463,
						rsltR.data_no(), rsltR.data_lno(),
						rsltR.cst_cd(), rsltR.org_dlv_slip_no(),
						rsltR.org_dlv_slip_d_no(), rsltR.cst_po_no(),
						rsltR.cst_po_d_no(),
						toDispItm(rsltR.itm_cd(), rsltR.itm_sub1(), rsltR.itm_sub2(), rsltR.itm_sub3())));
				rsltR.err_flg(true);
				return;
			}
			if (!isUpd(rsltR) && !MAC_SUBLOT_MNG_TYP.isNOT_MNG(rsltR.sublot_mng_typ()) && MAC_LOT_NO_TYP.isMANUAL(rsltR.sublot_no_typ()) && isNullOrNullVal(rsltR.sublot_no())) {
				msgL.add(new MCMessage(rsltR, null, MSLAL0463,
						rsltR.data_no(), rsltR.data_lno(),
						rsltR.cst_cd(), rsltR.org_dlv_slip_no(),
						rsltR.org_dlv_slip_d_no(), rsltR.cst_po_no(),
						rsltR.cst_po_d_no(),
						toDispItm(rsltR.itm_cd(), rsltR.itm_sub1(), rsltR.itm_sub2(), rsltR.itm_sub3())));
				rsltR.err_flg(true);
				return;
			}
			
			MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, rsltR.ext_purc_act_d_no(), rsltR.ext_sys_cd());
			if (isUpd(rsltR) && !isNull(slsActDR)) {
				if (MAC_LOT_NO_TYP.isAUTO(rsltR.lot_no_typ())) {
					rsltR.lot_no(slsActDR.lot_no());
					rsltR.sublot_no(slsActDR.sublot_no());
					rsltR.crt_lot_flg(false);
				}
				else if (isNullOrNullVal(rsltR.lot_no())) {
					rsltR.lot_no(slsActDR.lot_no());
					rsltR.sublot_no(slsActDR.sublot_no());
					rsltR.crt_lot_flg(false);
				}
				else {
					if (!MAC_LOT_NO_TYP.isAUTO(rsltR.sublot_no_typ())) {
						rsltR.sublot_no(slsActDR.sublot_no());
					}
					else {
						rsltR.sublot_no(null);
						ElmArgsR subLotArgs = getSubLotElmArgs(rsltR, MAC_NUM_BIZ_TYP.SUBLOT, schdR);
						subLotNoL.add(subLotArgs);
					}
					rsltR.crt_lot_flg(true);
				}
			}
			else {
				if (!MAC_LOT_MNG_TYP.isNOT_MNG(rsltR.lot_mng_typ()) || !MAC_SUBLOT_MNG_TYP.isNOT_MNG(rsltR.sublot_mng_typ())) {
					rsltR.crt_lot_flg(true);
				}
				
				// ロットＮＯ発番対象リスト登録
				if (isCrtLotNo(rsltR)) {
					ElmArgsR lotArgs = getLotElmArgs(rsltR, MAC_NUM_BIZ_TYP.LOT, schdR);
					lotNoL.add(lotArgs);
				}
				
				// サブロットＮＯ発番対象リスト登録
				if (isCrtSubLotNo(rsltR)) {
					ElmArgsR subLotArgs = getSubLotElmArgs(rsltR, MAC_NUM_BIZ_TYP.SUBLOT, schdR);
					subLotNoL.add(subLotArgs);
				}
				else if (isNull(rsltR.sublot_no())) {
					rsltR.sublot_no(MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		/**
		 *  ロットＮＯ発番対象リスト作成（複数売上予定）
		 */
		protected int makeCrtLotLMulti(
				int slsSchdPegNo,
				MCList<ElmArgsR> mltLotNoL,
				MCList<ElmArgsR> mltSubLotNoL,
				AccptRecvIf_Chk01_DtlR rsltR,
				MCMessageList msgL,
				MCIndexKey slsActDPurcActDIdx) {
			MST_SLO_D_R sloDR = _sloDL.getFirst(_sloDSloDNoIdxkey, rsltR.fix_slo_d_no());
			rsltR.setStringNE("sppl_cd", sloDR.sppl_cd());
			MCList<MST_SLS_SCHD_R> slsSchdL = filterSlsSchd(_slsSchdL.subList(_slsSchdSloDIdxkey, rsltR.fix_slo_d_no()), rsltR);
			slsSchdL.sort(MST_SLS_SCHD_R.$sls_schd_dt, MST_SLS_SCHD_R.$sls_schd_no);
			slsSchdL.addBooleanColumn("crt_lot_flg");
			slsSchdL.addNumberColumn("slsSchdPegNo");
			for (MST_SLS_SCHD_R slsSchdR : slsSchdL) {
				if (slsSchdR.getBooleanNE("existLotFlg")) {
					continue;
				}
				
				// 入荷予定にロットＮＯが設定されている場合、そのロットＮＯを採用するのでロットＮＯを発番しない
				MST_PURC_SCHD_R schdR = getPurcSchdR(slsSchdR);
				if (!isNull(schdR) && !isNull(schdR.getStringNE("lot_no"))) {
					slsSchdR.lot_no(schdR.getStringNE("lot_no"));
					slsSchdR.sublot_no(nvl(schdR.getStringNE("sublot_no"), MAC_STR.NULL_VAL.value()));
					slsSchdR.setBooleanNE("crt_lot_flg", false);
					continue;
				}
				if (rsltR.sync_flg()) {
					if (!MAC_LOT_MNG_TYP.isNOT_MNG(rsltR.lot_mng_typ()) && !MAC_LOT_NO_TYP.isAUTO(rsltR.lot_no_typ()) && !isNullOrNullVal(rsltR.lot_no())) {
						slsSchdR.setBooleanNE("crt_lot_flg", true);
						rsltR.crt_lot_flg(true);
						continue;
					}
				}
				if (!isNull(slsSchdR.purc_act_d_no()) && !slsSchdR.cmpl_flg() && !isNull(slsSchdR.lot_no())) {
					continue;
				}
				
				if (!rsltR.sync_flg() && rsltR.ddlvTgtFlg() && !isNull(slsSchdR.purc_act_d_no())) {
					MST_PURC_ACT_D_R purcActDR = getPurcActR(slsSchdR);
					if (!isNull(purcActDR) && !isNull(purcActDR.lot_no())) {
						rsltR.lot_no(purcActDR.lot_no());
						rsltR.sublot_no(nvl(purcActDR.sublot_no(), MAC_STR.NULL_VAL.value()));
						rsltR.crt_lot_flg(false);
						continue;
					}
				}
				
				if (!MAC_LOT_MNG_TYP.isNOT_MNG(rsltR.lot_mng_typ()) && MAC_LOT_NO_TYP.isMANUAL(rsltR.lot_no_typ()) && isNullOrNullVal(slsSchdR.lot_no())) {
					msgL.add(new MCMessage(rsltR, null, MSLAL0463,
							rsltR.data_no(), rsltR.data_lno(),
							rsltR.cst_cd(), rsltR.org_dlv_slip_no(),
							rsltR.org_dlv_slip_d_no(), rsltR.cst_po_no(),
							rsltR.cst_po_d_no(),
							toDispItm(rsltR.itm_cd(), rsltR.itm_sub1(), rsltR.itm_sub2(), rsltR.itm_sub3())));
					rsltR.err_flg(true);
					continue;
				}
				if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(rsltR.sublot_mng_typ()) && MAC_LOT_NO_TYP.isMANUAL(rsltR.sublot_no_typ()) && isNullOrNullVal(slsSchdR.sublot_no())) {
					msgL.add(new MCMessage(rsltR, null, MSLAL0463,
							rsltR.data_no(), rsltR.data_lno(),
							rsltR.cst_cd(), rsltR.org_dlv_slip_no(),
							rsltR.org_dlv_slip_d_no(), rsltR.cst_po_no(),
							rsltR.cst_po_d_no(),
							toDispItm(rsltR.itm_cd(), rsltR.itm_sub1(), rsltR.itm_sub2(), rsltR.itm_sub3())));
					rsltR.err_flg(true);
					continue;
				}
				
				MCList<MST_SLS_ACT_D_R> tmpSlsActDL = _slsActDL.subList(_slsActDExtPurcDNoIdxkey, rsltR.ext_purc_act_d_no(), rsltR.ext_sys_cd());
				if (isUpd(rsltR) && !isNull(tmpSlsActDL)) {
					MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(slsActDPurcActDIdx, rsltR.ext_purc_act_d_no(), rsltR.ext_sys_cd(), slsSchdR.purc_act_d_no());
					if(!isNull(slsActDR)) {
						slsSchdR.lot_no(slsActDR.lot_no());
						slsSchdR.sublot_no(slsActDR.sublot_no());
						slsSchdR.setBooleanNE("crt_lot_flg", false);
					}
				}
				else {
					slsSchdR.setNumber("slsSchdPegNo", slsSchdPegNo);
					if (!MAC_LOT_MNG_TYP.isNOT_MNG(rsltR.lot_mng_typ()) || !MAC_SUBLOT_MNG_TYP.isNOT_MNG(rsltR.sublot_mng_typ())) {
						slsSchdR.setBooleanNE("crt_lot_flg", true);
					}
					
					// ロットＮＯ発番対象リスト登録
					if (isCrtLotNo(rsltR, slsSchdR)) {
						ElmArgsR lotArgs = getLotElmArgs(rsltR, MAC_NUM_BIZ_TYP.LOT, schdR, slsSchdR);
						mltLotNoL.add(lotArgs);
					}
					
					// サブロットＮＯ発番対象リスト登録
					if (isCrtSubLotNo(rsltR, slsSchdR)) {
						ElmArgsR subLotArgs = getSubLotElmArgs(rsltR, MAC_NUM_BIZ_TYP.SUBLOT, schdR, slsSchdR);
						mltSubLotNoL.add(subLotArgs);
					}
					else if (isNull(slsSchdR.sublot_no())) {
						slsSchdR.sublot_no(MAC_STR.NULL_VAL.value());
					}
					slsSchdPegNo++;
				}
			}
			// ロットＮＯ発番・セット
			if (!isNull(mltLotNoL) && !mltLotNoL.isEmpty()) {
				setNum(MAC_NUM_BIZ_TYP.LOT, mltLotNoL);
				String[] srcCols = new String[]{ElmArgsR.$new_no};
				String[] destCols = new String[]{MST_SLS_SCHD_R.$lot_no};
				copyByPegNo(slsSchdL, mltLotNoL, "slsSchdPegNo", destCols, ElmArgsR.$peg_no, srcCols);
			}
			
			// サブロットＮＯ発番・セット
			if (!isNull(mltSubLotNoL) && !mltSubLotNoL.isEmpty()) {
				setNum(MAC_NUM_BIZ_TYP.SUBLOT, mltSubLotNoL);
				String[] srcCols = new String[]{ElmArgsR.$new_no};
				String[] destCols = new String[]{MST_SLS_SCHD_R.$sublot_no};
				copyByPegNo(slsSchdL, mltSubLotNoL, "slsSchdPegNo", destCols, ElmArgsR.$peg_no, srcCols);
			}
			
			return slsSchdPegNo;
		}
		
		/**
		 * 仕入予定に紐づく入荷予定取得
		 */
		protected MST_PURC_SCHD_R getPurcSchdR(MST_SLS_SCHD_R slsSchdR) {
			MST_PURC_SCHD_R schdR = MST_PURC_SCHD_R.create();
			MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
			MCQueryApiBuilder schdR_bldr = MCQueryApiBuilder.create(t);
			MST_ARR_SCHD_R arrschd = MST_ARR_SCHD_R.create("ARRSCHD");
			schdR_bldr.setSelect(t.purc_schd_no);
			schdR_bldr.addLeftOuterJoin(arrschd,
					bracket(t.arr_schd_no.eq(arrschd.arr_schd_no)));
			schdR_bldr.addSelect(arrschd.lot_no.as("lot_no"),
					arrschd.sublot_no.as("sublot_no"),
					arrschd.arr_loc_cd.as("arr_loc_cd"),
					arrschd.bp_lot_no);
			schdR_bldr.setWhere(t.purc_schd_no.eq(bind("1")), slsSchdR.purc_schd_no());
			dbSelect("MSLAL5160_MST_PURC_SCHD_S01", schdR, schdR_bldr);
			return schdR;
		}
		
		/**
		 * 仕入実績取得
		 */
		protected MST_PURC_ACT_D_R getPurcActR(MST_SLS_SCHD_R slsSchdR) {
			MST_PURC_ACT_D_R purcActDR = MST_PURC_ACT_D_R.create();
			MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder purcActDR_bldr = MCQueryApiBuilder.create(t);
			MST_PURC_ACT_R t2 = MST_PURC_ACT_R.create("T2");
			purcActDR_bldr.setSelect(t.lot_no, t.sublot_no);
			purcActDR_bldr.addInnerJoin(t2, bracket(t2.purc_act_no.eq(t.purc_act_no)
					.and(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
			purcActDR_bldr.setWhere(t.purc_act_d_no.eq(bind("1")),
					slsSchdR.purc_act_d_no());
			purcActDR_bldr.addWhereWithAnd(t.purc_act_seq.eq(t2.purc_act_seq));
			dbSelect("MSLAL5160_MST_PURC_ACT_D_S01", purcActDR, purcActDR_bldr);
			return purcActDR;
		}		
		
		/**
		 * ロットＮＯの発番要素を取得する
		 * 
		 * @return 発番要素
		 */
		protected ElmArgsR getLotElmArgs(AccptRecvIf_Chk01_DtlR r, MAC_NUM_BIZ_TYP numBizTyp, MST_PURC_SCHD_R schdR, MST_SLS_SCHD_R slsSchdR) {
			
			// 発番要素の設定
			ElmArgsR arg = ElmArgsR.create();
			arg.co_cd(getCo().co_cd());
			arg.num_ptn_cd(r.lot_no_ptn_cd());
			arg.bp_cd(r.getStringNE("sppl_cd"));
			arg.itm_cd(r.itm_cd());
			arg.itm_sub1(r.itm_sub1());
			arg.itm_sub2(r.itm_sub2());
			arg.itm_sub3(r.itm_sub3());
			arg.loc_cd(schdR.getStringNE("arr_loc_cd"));
			arg.wg_cd(getLocR(schdR.getStringNE("arr_loc_cd")).wg_cd());
			arg.site_cd(getLocR(schdR.getStringNE("arr_loc_cd")).site_cd());
			arg.dt(getToday());
			arg.bp_lot_no(schdR.getStringNE("bp_lot_no"));
			arg.sno1(r.sno1());
			arg.sno2(r.sno2());
			arg.sno3(r.sno3());
			arg.sno4(r.sno4());
			arg.peg_no(slsSchdR.getNumberNE("slsSchdPegNo"));
			
			return arg;
		}
		
		/**
		 * サブロットＮＯの発番要素を取得する
		 * 
		 * @return 発番要素
		 */
		protected ElmArgsR getSubLotElmArgs(AccptRecvIf_Chk01_DtlR r, MAC_NUM_BIZ_TYP numBizTyp, MST_PURC_SCHD_R schdR, MST_SLS_SCHD_R slsSchdR) {
			
			// 発番要素の設定
			ElmArgsR arg = ElmArgsR.create();
			arg.co_cd(getCo().co_cd());
			arg.num_ptn_cd(r.sublot_no_ptn_cd());
			arg.itm_cd(r.itm_cd());
			arg.itm_sub1(r.itm_sub1());
			arg.itm_sub2(r.itm_sub2());
			arg.itm_sub3(r.itm_sub3());
			arg.loc_cd(schdR.getStringNE("arr_loc_cd"));
			arg.wg_cd(getLocR(schdR.getStringNE("arr_loc_cd")).wg_cd());
			arg.site_cd(getLocR(schdR.getStringNE("arr_loc_cd")).site_cd());
			arg.dt(getToday());
			arg.bp_lot_no(schdR.getStringNE("bp_lot_no"));
			arg.sno1(r.sno1());
			arg.sno2(r.sno2());
			arg.sno3(r.sno3());
			arg.sno4(r.sno4());
			arg.lot_no(slsSchdR.lot_no());
			arg.peg_no(slsSchdR.getNumberNE("slsSchdPegNo"));
			
			return arg;
		}
		
		/**
		 * [ロット管理区分：ロット管理しない]以外の場合、かつ、<br>
		 * [ロットＮＯ発番区分：手動]以外の場合、かつ、<br>
		 * ロット作成ＦＬＧがTrueの場合、ロットＮＯの発番対象とする。
		 * 
		 * @param rstlR 明細行
		 * @return 発番する場合はtrue
		 */
		protected boolean isCrtLotNo(AccptRecvIf_Chk01_DtlR rstlR, MST_SLS_SCHD_R slsSchdR) {
			
			return !MAC_LOT_MNG_TYP.isNOT_MNG(rstlR.lot_mng_typ())
					&& !MAC_LOT_NO_TYP.isMANUAL(rstlR.lot_no_typ())
					&& slsSchdR.getBooleanNE("crt_lot_flg")
					&& isNull(rstlR.lot_no());
		}
		
		/**
		 * [サブロット管理区分：ロット管理しない]以外の場合、かつ、<br>
		 * [サブロットＮＯ発番区分：手動]以外の場合、かつ、<br>
		 * ロット作成ＦＬＧがTrueの場合、サブロットＮＯの発番対象とする。
		 * 
		 * @param rstlR 明細行
		 * @return 発番する場合はtrue
		 */
		protected boolean isCrtSubLotNo(AccptRecvIf_Chk01_DtlR rstlR, MST_SLS_SCHD_R slsSchdR) {
			
			return 	!MAC_SUBLOT_MNG_TYP.isNOT_MNG(rstlR.sublot_mng_typ())
					&& !MAC_LOT_NO_TYP.isMANUAL(rstlR.sublot_no_typ())
					&& (slsSchdR.getBooleanNE("crt_lot_flg") || MAC_SUBLOT_MNG_TYP.isSTK(rstlR.sublot_mng_typ()))
					&& isNull(slsSchdR.sublot_no());
		}
		
		/**
		 * ロットＮＯの発番要素を取得する
		 * 
		 * @return 発番要素
		 */
		protected ElmArgsR getLotElmArgs(AccptRecvIf_Chk01_DtlR r, MAC_NUM_BIZ_TYP numBizTyp, MST_PURC_SCHD_R schdR) {
			
			// 発番要素の設定
			ElmArgsR arg = ElmArgsR.create();
			arg.co_cd(getCo().co_cd());
			arg.num_ptn_cd(r.lot_no_ptn_cd());
			arg.bp_cd(r.getStringNE("sppl_cd"));
			arg.itm_cd(r.itm_cd());
			arg.itm_sub1(r.itm_sub1());
			arg.itm_sub2(r.itm_sub2());
			arg.itm_sub3(r.itm_sub3());
			arg.loc_cd(schdR.getStringNE("arr_loc_cd"));
			arg.wg_cd(getLocR(schdR.getStringNE("arr_loc_cd")).wg_cd());
			arg.site_cd(getLocR(schdR.getStringNE("arr_loc_cd")).site_cd());
			arg.dt(getToday());
			arg.bp_lot_no(schdR.getStringNE("bp_lot_no"));
			arg.sno1(r.sno1());
			arg.sno2(r.sno2());
			arg.sno3(r.sno3());
			arg.sno4(r.sno4());
			arg.peg_no(r.peg_no());
			
			return arg;
		}
		
		/**
		 * サブロットＮＯの発番要素を取得する
		 * 
		 * @return 発番要素
		 */
		protected ElmArgsR getSubLotElmArgs(AccptRecvIf_Chk01_DtlR r, MAC_NUM_BIZ_TYP numBizTyp, MST_PURC_SCHD_R schdR) {
			
			// 発番要素の設定
			ElmArgsR arg = ElmArgsR.create();
			arg.co_cd(getCo().co_cd());
			arg.num_ptn_cd(r.sublot_no_ptn_cd());
			arg.itm_cd(r.itm_cd());
			arg.itm_sub1(r.itm_sub1());
			arg.itm_sub2(r.itm_sub2());
			arg.itm_sub3(r.itm_sub3());
			arg.loc_cd(schdR.getStringNE("arr_loc_cd"));
			arg.wg_cd(getLocR(schdR.getStringNE("arr_loc_cd")).wg_cd());
			arg.site_cd(getLocR(schdR.getStringNE("arr_loc_cd")).site_cd());
			arg.dt(getToday());
			arg.bp_lot_no(schdR.getStringNE("bp_lot_no"));
			arg.sno1(r.sno1());
			arg.sno2(r.sno2());
			arg.sno3(r.sno3());
			arg.sno4(r.sno4());
			arg.lot_no(r.lot_no());
			arg.peg_no(r.peg_no());
			
			return arg;
		}
		
		/**
		 * [ロット管理区分：ロット管理しない]以外の場合、かつ、<br>
		 * [ロットＮＯ発番区分：手動]以外の場合、かつ、<br>
		 * ロット作成ＦＬＧがTrueの場合、ロットＮＯの発番対象とする。
		 * 
		 * @param rstlR 明細行
		 * @return 発番する場合はtrue
		 */
		protected boolean isCrtLotNo(AccptRecvIf_Chk01_DtlR rstlR) {
			
			return !MAC_LOT_MNG_TYP.isNOT_MNG(rstlR.lot_mng_typ())
					&& !MAC_LOT_NO_TYP.isMANUAL(rstlR.lot_no_typ())
					&& rstlR.crt_lot_flg()
					&& isNull(rstlR.lot_no());
		}
		
		/**
		 * [サブロット管理区分：ロット管理しない]以外の場合、かつ、<br>
		 * [サブロットＮＯ発番区分：手動]以外の場合、かつ、<br>
		 * ロット作成ＦＬＧがTrueの場合、サブロットＮＯの発番対象とする。
		 * 
		 * @param rstlR 明細行
		 * @return 発番する場合はtrue
		 */
		protected boolean isCrtSubLotNo(AccptRecvIf_Chk01_DtlR rstlR) {
			
			return 	!MAC_SUBLOT_MNG_TYP.isNOT_MNG(rstlR.sublot_mng_typ())
					&& !MAC_LOT_NO_TYP.isMANUAL(rstlR.sublot_no_typ())
					&& (rstlR.crt_lot_flg() || MAC_SUBLOT_MNG_TYP.isSTK(rstlR.sublot_mng_typ()))
					&& isNull(rstlR.sublot_no());
		}
		
		/**
		 * 検収基準売上（インボイス対象外）の売上実績ＳＶ用電文データ作成
		 */
		protected MCNumber makeDlvSlipSlsData(
				MCNumber hdrPegNo,
				MCList<AccptRecvIf_Chk01_DtlR> tgtL,
				MCList<SlsAct_Upd01_HdrR> hdrL,
				MCList<SlsAct_Upd01_DtlR> dtlL,
				MCList<SlsAct_Upd01_IoR> ioL) {
			
			MCIndexKey dlvIdx = tgtL.createIndex(
					AccptRecvIf_Chk01_DtlR.$imp_flg,
					AccptRecvIf_Chk01_DtlR.$iv_flg,
					AccptRecvIf_Chk01_DtlR.$accpt_dfct_flg,
					AccptRecvIf_Chk01_DtlR.$ddlvTgtFlg
					);
			
			MCList<AccptRecvIf_Chk01_DtlR> dlvSlipL = tgtL.subList(dlvIdx, true, false, false, false);
			MCIndexKey dlvSlipDNoLIdx = dlvSlipL.createIndex(AccptRecvIf_Chk01_DtlR.$fix_dlv_slip_d_no);
			MCList<AccptRecvIf_Chk01_DtlR> dlvSlipGrpL = dlvSlipL.groupBy(AccptRecvIf_Chk01_DtlR.$fix_dlv_slip_no);
			
			MCList<SlsAct_Upd01_HdrR> tmpHdrL = MCList.create(SlsAct_Upd01_HdrR.class);
			MCList<SlsAct_Upd01_HdrR> addHdrL = MCList.create(SlsAct_Upd01_HdrR.class);
			MCNumber maxHdrPegNo = hdrPegNo;
			
			if (isNull(tgtL) || tgtL.isEmpty() || isNull(dlvSlipL) || dlvSlipL.isEmpty()) {
				return hdrPegNo;
			}
			
			for (AccptRecvIf_Chk01_DtlR dlvSlipGrpR : dlvSlipGrpL) {
				// 売上実績SV用ヘッダ電文作成
				SlsAct_Upd01_HdrR slsActHdrR = SlsAct_Upd01_HdrR.create();
				executeQuery(slsActHdrR, MSLAL5160_MST_DLV_SLIP_S01(), dlvSlipGrpR);
				
				dlvSlipGrpR.dlv_slip_seq(slsActHdrR.dlv_slip_seq());
				dlvSlipGrpR.wg_cd(slsActHdrR.wg_cd());
				slsActHdrR.hdr_peg_no(hdrPegNo);
				slsActHdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				slsActHdrR.setStatus(Status.CREATE);
				
				// 納税通貨ＣＤが取得できていなければ納税為替レートもクリア
				if (isNull(slsActHdrR.ptax_cur_cd())) {
					slsActHdrR.ptax_xrate(null);
				}
				slsActHdrR.ship_dlv_slip_no(slsActHdrR.dlv_slip_no());
				slsActHdrR.can_ac_dt(null);
				slsActHdrR.aprv_flg(false);
				slsActHdrR.ship_act_service_via_flg(false);
				slsActHdrR.slip_split_non_flg(true);
				slsActHdrR.lot_chk_off_flg(true);
				slsActHdrR.xrate_rnd_typ(getCo().xrate_rnd_typ());
				slsActHdrR.edi_flg(true);
				tmpHdrL.add(slsActHdrR);
				
				// 明細データ作成
				maxHdrPegNo = makeDlvSlipSlsDtl(hdrPegNo, maxHdrPegNo, dtlL, slsActHdrR,
						dlvSlipL, tmpHdrL, dlvSlipDNoLIdx);
				hdrPegNo = maxHdrPegNo.add(1);
			}
			
			// ヘッダに紐づく明細が存在しない場合は対象外
			MCIndexKey dtlIdxkey = dtlL.createIndex(SlsAct_Upd01_DtlR.$hdr_peg_no);
			for (SlsAct_Upd01_HdrR tmpHdrR : tmpHdrL) {
				MCList<SlsAct_Upd01_DtlR> tmpDtlL = dtlL.subList(dtlIdxkey, tmpHdrR.hdr_peg_no());
				if (!isNull(tmpDtlL)) {
					addHdrL.add(tmpHdrR);
				}
			}
			
			// 詳細データ作成
			makeDlvSlipSlsIo(hdrL, dtlL, ioL, addHdrL);
			
			return hdrPegNo;
		}
		
		/**
		 * 検収基準売上の売上実績サービス用電文データ作成（明細部）
		 */
		protected MCNumber makeDlvSlipSlsDtl(
				MCNumber hdrPegNo,
				MCNumber maxHdrPegNo,
				MCList<SlsAct_Upd01_DtlR> dtlL,
				SlsAct_Upd01_HdrR slsActHdrR,
				MCList<AccptRecvIf_Chk01_DtlR> dlvSlipL,
				MCList<SlsAct_Upd01_HdrR> tmpHdrL,
				MCIndexKey dlvSlipDNoLIdx) {
			// 売上実績SV用明細電文作成
			MCList<SlsAct_Upd01_DtlR> slsActDtlL = MCList.create(SlsAct_Upd01_DtlR.class);
			MCList<SlsAct_Upd01_DtlR> tmpSlsActDtlL = MCList.create(SlsAct_Upd01_DtlR.class);
			executeQuery(tmpSlsActDtlL, MSLAL5160_MST_DLV_SLIP_D_S01(), slsActHdrR);
			
			int dtlPegNo = 0;
			for (SlsAct_Upd01_DtlR tmpSlsActDtlR : tmpSlsActDtlL) {
				MCList<AccptRecvIf_Chk01_DtlR> tgtDlvSlipL = dlvSlipL.subList(dlvSlipDNoLIdx, tmpSlsActDtlR.dlv_slip_d_no());
				tgtDlvSlipL.sort(AccptRecvIf_Chk01_DtlR.$data_lno);
				for (AccptRecvIf_Chk01_DtlR tgtDlvSlipR : tgtDlvSlipL) {
					if (MAC_DATA_CRUD_TYP.isDEL(tgtDlvSlipR.data_crud_typ()) || tgtDlvSlipR.accpt_dfct_flg()) {
						continue;
					}
					if (dtlPegNo == 0) {
						setSlsHdrDt(slsActHdrR, tgtDlvSlipR.accpt_dt(), tgtDlvSlipR.ext_purc_act_d_no(), tgtDlvSlipR.ext_sys_cd(), false);
					}
					SlsAct_Upd01_DtlR addSlsActDtlR = SlsAct_Upd01_DtlR.create();
					MCRow.copyall(addSlsActDtlR, tmpSlsActDtlR);
					// 同一納品書明細ＮＯに対して複数の新規登録がある場合は、別売上実績とする
					boolean existFlg = false;
					MCNumber existHdrPegNo = null;
					slsActDtlL.sort(SlsAct_Upd01_DtlR.$hdr_peg_no, SlsAct_Upd01_DtlR.$dtl_peg_no, SlsAct_Upd01_DtlR.$dlv_slip_d_no);
					for (SlsAct_Upd01_DtlR slsActDtlR : slsActDtlL) {
						if (isSame(slsActDtlR.dlv_slip_d_no(), tmpSlsActDtlR.dlv_slip_d_no())) {
							existHdrPegNo = slsActDtlR.hdr_peg_no();
							existFlg = true;
						}
					}
					if (existFlg) {
						SlsAct_Upd01_HdrR existHdrR = tmpHdrL.getFirst(SlsAct_Upd01_HdrR.$hdr_peg_no, existHdrPegNo.add(1));
						if (isNull(existHdrR)) {
							SlsAct_Upd01_HdrR addSlsActHdrR = SlsAct_Upd01_HdrR.create();
							MCRow.copyall(addSlsActHdrR, slsActHdrR);
							addSlsActHdrR.hdr_peg_no(existHdrPegNo.add(1));
							tmpHdrL.add(addSlsActHdrR);
							maxHdrPegNo = existHdrPegNo.add(1);
						}
						addSlsActDtlR.hdr_peg_no(existHdrPegNo.add(1));
					}
					else {
						addSlsActDtlR.hdr_peg_no(hdrPegNo);
						maxHdrPegNo = hdrPegNo;
					}
					
					addSlsActDtlR.dtl_peg_no(dtlPegNo++);
					addSlsActDtlR.trd_unit_qty(tgtDlvSlipR.trd_unit_qty());
					addSlsActDtlR.base_unit_qty(tgtDlvSlipR.fix_base_unit_qty());
					addSlsActDtlR.sls_schd_abort_flg(tgtDlvSlipR.abort_flg());
					if (!isNull(tgtDlvSlipR.fix_trd_cur_dscnt_amt()) && !tgtDlvSlipR.fix_trd_cur_dscnt_amt().isZero()) {
						addSlsActDtlR.trd_cur_dscnt_amt(tgtDlvSlipR.fix_trd_cur_dscnt_amt());
					}
					addSlsActDtlR.trd_unit_cd(tgtDlvSlipR.trd_unit_cd());
					addSlsActDtlR.trd_cur_upri(tgtDlvSlipR.fix_trd_cur_upri());
					addSlsActDtlR.tax_cd(tgtDlvSlipR.fix_tax_cd());
					addSlsActDtlR.tax_typ(tgtDlvSlipR.tax_typ());
					addSlsActDtlR.tax_rate(tgtDlvSlipR.tax_rate());
					addSlsActDtlR.inc_tax_flg(tgtDlvSlipR.inc_tax_flg());
					addSlsActDtlR.ext_purc_act_d_no(tgtDlvSlipR.ext_purc_act_d_no());	// 外部仕入実績明細ＮＯ
					addSlsActDtlR.ext_sys_cd(tgtDlvSlipR.ext_sys_cd());	// 外部システムＣＤ
					addSlsActDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					addSlsActDtlR.setStatus(Status.CREATE);
					addSlsActDtlR.pri_prnt_flg(true);
					addSlsActDtlR.ship_dlv_slip_d_no(addSlsActDtlR.dlv_slip_d_no());
					
					// 納品書明細ＮＯに紐づく出荷予定ＮＯ、売上予定ＮＯの設定
					MCList<SlsAct_Upd01_DtlR> tmpL = MCList.create(SlsAct_Upd01_DtlR.class);
					executeQuery(tmpL, MSLAL5160_MST_SLS_SCHD_S01(), addSlsActDtlR);
					if (!isNull(tmpL)) {
						if (tmpL.size() == 1) {
							addSlsActDtlR.sls_schd_no(tmpL.get(0).sls_schd_no());
							addSlsActDtlR.ship_schd_no(tmpL.get(0).ship_schd_no());
						}
					}
					// 納品書明細ＮＯに紐づく出荷実績明細の情報設定
					MCList<MST_SHIP_ACT_D_R> shipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
					MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
					MCQueryApiBuilder shipActDL_bldr = MCQueryApiBuilder.create(t);
					shipActDL_bldr.setWhere(t.dlv_slip_d_no.eq(bind("1")), addSlsActDtlR.dlv_slip_d_no());
					shipActDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
					dbSelect("MSLAL5160_MST_SHIP_ACT_D_S01", shipActDL, shipActDL_bldr);
					if (!isNull(shipActDL)) {
						if (shipActDL.size() == 1) {
							addSlsActDtlR.loc_cd(shipActDL.get(0).ship_loc_cd());
							addSlsActDtlR.str_ln_cd(shipActDL.get(0).ship_str_ln_cd());
							addSlsActDtlR.gd_cd(shipActDL.get(0).gd_cd());
							addSlsActDtlR.stk_mng_typ(shipActDL.get(0).stk_mng_typ());
							addSlsActDtlR.sundry_itm_flg(shipActDL.get(0).sundry_itm_flg());
						}
						else {
							addSlsActDtlR.stk_mng_typ(shipActDL.get(0).stk_mng_typ());
							addSlsActDtlR.sundry_itm_flg(shipActDL.get(0).sundry_itm_flg());
						}
						if (isNull(addSlsActDtlR.rsn_cd())) {
							addSlsActDtlR.rsn_cd(shipActDL.get(0).rsn_cd());
						}
						if (isNull(addSlsActDtlR.bd_dpt_cd())) {
							addSlsActDtlR.bd_dpt_cd(shipActDL.get(0).bd_dpt_cd());
						}
					}
					
					if (addSlsActDtlR.sundry_itm_flg()) {
						addSlsActDtlR.itm_nm(nvl(tgtDlvSlipR.itm_nm(), tmpSlsActDtlR.itm_nm()));
					}
					else {
						addSlsActDtlR.itm_nm(null);
					}
					
					if (useIfData()) {
						addSlsActDtlR.interim_flg(tgtDlvSlipR.interim_flg());
					}
					
					slsActDtlL.add(addSlsActDtlR);
				}
			}
			
			dtlL.addAll(slsActDtlL);
			
			return maxHdrPegNo;
		}
		
		/**
		 * 検収基準売上の売上実績サービス用電文データ作成（詳細部）
		 */
		protected void makeDlvSlipSlsIo(
			MCList<SlsAct_Upd01_HdrR> hdrL,
			MCList<SlsAct_Upd01_DtlR> dtlL,
			MCList<SlsAct_Upd01_IoR> ioL,
			MCList<SlsAct_Upd01_HdrR> addHdrL) {
			MCIndexKey dtlLHdrPegNoIdx = dtlL.createIndex(SlsAct_Upd01_DtlR.$hdr_peg_no);
			for (SlsAct_Upd01_HdrR hdrR : addHdrL) {
				MCList<SlsAct_Upd01_DtlR> tgtDtlL = dtlL.subList(dtlLHdrPegNoIdx, hdrR.hdr_peg_no());
				tgtDtlL.addDateColumn(SlsAct_Upd01_HdrR.$ac_dt);
				tgtDtlL.addBooleanColumn("err_flg");
				tgtDtlL.setDateNE(SlsAct_Upd01_HdrR.$ac_dt, hdrR.ac_dt());
				// 組織変更・源泉税額要否設定
				dptChgAndWtax(hdrR, tgtDtlL);
				
				hdrL.add(hdrR);
				
				// 売上実績SV用明細電文作成
				MCList<SlsAct_Upd01_IoR> slsActIoL = MCList.create(SlsAct_Upd01_IoR.class);
				
				int dispCnt = 0;
				int ioCnt = 0;
				for (SlsAct_Upd01_DtlR slsActDtlR : tgtDtlL) {
					dispCnt++;
					if (isNull(slsActDtlR.data_crud_typ())) {
						slsActDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					}
					
					slsActDtlR.disp_seq(dispCnt);
					if (!isNull(slsActDtlR.slo_d_no())) {
						slsActDtlR.upri_not_tgt_flg(true);
					}
					if (!hdrR.getBooleanNE("wtaxRateFlg")) {
						slsActDtlR.wtax_rate(null);
					}
					
					// 原価金額
					if (!isNull(slsActDtlR.cost_upri())) {
						slsActDtlR.cost_amt(
								MSUCL_SlsUtil.getCostAmt(
										slsActDtlR.cost_upri(),
										slsActDtlR.base_unit_qty(),
										getBaseCur().amt_dec_place()));
					}
					
					// 明細に紐づく売上実績SV用詳細電文も作成
					MCList<SlsAct_Upd01_IoR> tmpIoL = MCList.create(SlsAct_Upd01_IoR.class);
					
					executeQuery(tmpIoL, MSLAL5160_MST_SHIP_ACT_D_S01(), slsActDtlR);
					
					MCNumber tmpDtlTrdUnitQty = slsActDtlR.trd_unit_qty();
					MCNumber tmpDtlBaseUnitQty = slsActDtlR.base_unit_qty();
					boolean diffTrdUnitCd = isDiffTrdUnitCd(slsActDtlR, tmpIoL);
					
					for (SlsAct_Upd01_IoR tmpIoR : tmpIoL) {
						if (diffTrdUnitCd) {
							MCNumber tmpIoQty = getBaseUnitQty(
									tmpIoR.trd_unit_qty(),
									tmpIoR.trd_unit_cd(),
									slsActDtlR.base_unit_cd(),
									slsActDtlR.itm_cd(),
									slsActDtlR.itm_sub1(),
									slsActDtlR.itm_sub2(),
									slsActDtlR.itm_sub3());
							tmpIoR.trd_unit_qty(tmpIoQty);
							tmpIoR.trd_unit_cd(slsActDtlR.base_unit_cd());
							if (tmpIoQty.gte(tmpDtlBaseUnitQty)) {
								tmpIoR.trd_unit_qty(tmpDtlBaseUnitQty);
							}
							else {
								tmpDtlBaseUnitQty = tmpDtlBaseUnitQty.subtract(tmpIoQty);
							}
						}
						else {
							if (tmpIoR.trd_unit_qty().gte(tmpDtlTrdUnitQty)) {
								tmpIoR.trd_unit_qty(tmpDtlTrdUnitQty);
							}
							else {
								tmpDtlTrdUnitQty = tmpDtlTrdUnitQty.subtract(tmpIoR.trd_unit_qty());
							}
						}
						tmpIoR.base_unit_qty(getBaseUnitQty(
								tmpIoR.trd_unit_qty(),
								tmpIoR.trd_unit_cd(),
								tmpIoR.base_unit_cd(),
								slsActDtlR.itm_cd(),
								slsActDtlR.itm_sub1(),
								slsActDtlR.itm_sub2(),
								slsActDtlR.itm_sub3()));
						tmpIoR.hdr_peg_no(hdrR.hdr_peg_no());
						tmpIoR.dtl_peg_no(slsActDtlR.dtl_peg_no());
						tmpIoR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						tmpIoR.setStatus(Status.CREATE);
						tmpIoR.io_peg_no(++ioCnt);
						
						if (isPack(slsActDtlR.itm_cd(), slsActDtlR.itm_sub1(), slsActDtlR.itm_sub2(), slsActDtlR.itm_sub3(), slsActDtlR.trd_unit_cd())) {
							tmpIoR.pack_unit_cd(tmpIoR.trd_unit_cd());
							tmpIoR.pack_unit_qty(tmpIoR.trd_unit_qty());
						}
						else {
							tmpIoR.pack_unit_cd(tmpIoR.base_unit_cd());
							tmpIoR.pack_unit_qty(tmpIoR.base_unit_qty());
						}
						
						slsActIoL.add(tmpIoR);
					}
				}
				ioL.addAll(slsActIoL);
			}
		}
		
		protected boolean isDiffTrdUnitCd(SlsAct_Upd01_DtlR slsActDtlR, MCList<SlsAct_Upd01_IoR> tmpIoL) {
			String trdUnitCd = null;
			// 売上実績受払の単位を確認
			for (SlsAct_Upd01_IoR tmpIoR : tmpIoL) {
				if (isNull(trdUnitCd)) {
					trdUnitCd = tmpIoR.trd_unit_cd();
				}
				// 売上実績受払の中で単位が異なる場合
				else if (!isSame(trdUnitCd, tmpIoR.trd_unit_cd())) {
					return true;
				}
				// 売上実績明細の単位と異なる場合
				if (!isSame(trdUnitCd, slsActDtlR.trd_unit_cd())) {
					return true;
				}
			}
			return false;
		}
		
		protected Map_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R<SlsAct_Upd01_IoR,MST_SLS_ACT_IO_R> createMap_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R() {
			return new Map_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R<SlsAct_Upd01_IoR, MST_SLS_ACT_IO_R>();
		}
		
		public class Map_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R<D extends SlsAct_Upd01_IoR, S extends MST_SLS_ACT_IO_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_no, MST_SLS_ACT_IO_R.$sls_act_io_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_seq, MST_SLS_ACT_IO_R.$sls_act_io_seq);
				addColumnPathMap(SlsAct_Upd01_IoR.$ship_act_d_no, MST_SLS_ACT_IO_R.$ship_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$iv_ship_act_d_no, MST_SLS_ACT_IO_R.$iv_ship_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$arr_act_no, MST_SLS_ACT_IO_R.$arr_act_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$purc_act_io_no, MST_SLS_ACT_IO_R.$purc_act_io_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno1, MST_SLS_ACT_IO_R.$sno1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno2, MST_SLS_ACT_IO_R.$sno2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno3, MST_SLS_ACT_IO_R.$sno3);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno4, MST_SLS_ACT_IO_R.$sno4);
				addColumnPathMap(SlsAct_Upd01_IoR.$gd_cd, MST_SLS_ACT_IO_R.$gd_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$loc_cd, MST_SLS_ACT_IO_R.$loc_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$str_ln_cd, MST_SLS_ACT_IO_R.$str_ln_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$lot_no, MST_SLS_ACT_IO_R.$lot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sublot_no, MST_SLS_ACT_IO_R.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_cd, MST_SLS_ACT_IO_R.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_qty, MST_SLS_ACT_IO_R.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_cd, MST_SLS_ACT_IO_R.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_qty, MST_SLS_ACT_IO_R.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_cd, MST_SLS_ACT_IO_R.$pack_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_qty, MST_SLS_ACT_IO_R.$pack_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$sync_flg, MST_SLS_ACT_IO_R.$sync_flg);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char1, MST_SLS_ACT_IO_R.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char2, MST_SLS_ACT_IO_R.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char3, MST_SLS_ACT_IO_R.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_d_no, MST_SLS_ACT_IO_R.$sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_d_seq, MST_SLS_ACT_IO_R.$sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_cur_upri, MST_SLS_ACT_IO_R.$trd_cur_upri);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_cur_amt, MST_SLS_ACT_IO_R.$trd_cur_amt);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_cur_dscnt_amt, MST_SLS_ACT_IO_R.$trd_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_cur_tax_amt, MST_SLS_ACT_IO_R.$trd_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_cur_upri, MST_SLS_ACT_IO_R.$base_cur_upri);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_cur_amt, MST_SLS_ACT_IO_R.$base_cur_amt);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_cur_dscnt_amt, MST_SLS_ACT_IO_R.$base_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_cur_tax_amt, MST_SLS_ACT_IO_R.$base_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_IoR.$ptax_cur_upri, MST_SLS_ACT_IO_R.$ptax_cur_upri);
				addColumnPathMap(SlsAct_Upd01_IoR.$ptax_cur_amt, MST_SLS_ACT_IO_R.$ptax_cur_amt);
				addColumnPathMap(SlsAct_Upd01_IoR.$ptax_cur_dscnt_amt, MST_SLS_ACT_IO_R.$ptax_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_IoR.$ptax_cur_tax_amt, MST_SLS_ACT_IO_R.$ptax_cur_tax_amt);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.ship_alloc_sts_no(src.getStringNE(MST_SHIP_ACT_D_R.$ship_alloc_sts_no));
			}
		}
		
		protected Map_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R<SlsAct_Upd01_DtlR,MST_SLS_ACT_D_R> createMap_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R() {
			return new Map_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R<SlsAct_Upd01_DtlR, MST_SLS_ACT_D_R>();
		}
		
		public class Map_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R<D extends SlsAct_Upd01_DtlR, S extends MST_SLS_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_no, MST_SLS_ACT_D_R.$sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_seq, MST_SLS_ACT_D_R.$sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$disp_seq, MST_SLS_ACT_D_R.$disp_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cd, MST_SLS_ACT_D_R.$dlv_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_sundry_flg, MST_SLS_ACT_D_R.$dlv_sundry_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_nm, MST_SLS_ACT_D_R.$dlv_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_zip_cd, MST_SLS_ACT_D_R.$dlv_zip_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr1, MST_SLS_ACT_D_R.$dlv_addr1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr2, MST_SLS_ACT_D_R.$dlv_addr2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr3, MST_SLS_ACT_D_R.$dlv_addr3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr4, MST_SLS_ACT_D_R.$dlv_addr4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_dpt, MST_SLS_ACT_D_R.$dlv_cntct_dpt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_psn, MST_SLS_ACT_D_R.$dlv_cntct_psn);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_tel, MST_SLS_ACT_D_R.$dlv_tel);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_fax, MST_SLS_ACT_D_R.$dlv_fax);
				addColumnPathMap(SlsAct_Upd01_DtlR.$pri_prnt_flg, MST_SLS_ACT_D_R.$pri_prnt_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd1, MST_SLS_ACT_D_R.$dest_cd1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd2, MST_SLS_ACT_D_R.$dest_cd2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd3, MST_SLS_ACT_D_R.$dest_cd3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cd, MST_SLS_ACT_D_R.$tdlv_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_sundry_flg, MST_SLS_ACT_D_R.$tdlv_sundry_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_nm, MST_SLS_ACT_D_R.$tdlv_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_zip_cd, MST_SLS_ACT_D_R.$tdlv_zip_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr1, MST_SLS_ACT_D_R.$tdlv_addr1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr2, MST_SLS_ACT_D_R.$tdlv_addr2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr3, MST_SLS_ACT_D_R.$tdlv_addr3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr4, MST_SLS_ACT_D_R.$tdlv_addr4);
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
				addColumnPathMap(SlsAct_Upd01_DtlR.$cntry_org_cd, MST_SLS_ACT_D_R.$cntry_org_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$loc_cd, MST_SLS_ACT_D_R.$loc_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$str_ln_cd, MST_SLS_ACT_D_R.$str_ln_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$lot_no, MST_SLS_ACT_D_R.$lot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sublot_no, MST_SLS_ACT_D_R.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$gd_cd, MST_SLS_ACT_D_R.$gd_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_cd, MST_SLS_ACT_D_R.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_qty, MST_SLS_ACT_D_R.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_cd, MST_SLS_ACT_D_R.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_qty, MST_SLS_ACT_D_R.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_upri, MST_SLS_ACT_D_R.$trd_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_amt, MST_SLS_ACT_D_R.$trd_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$upri_not_tgt_flg, MST_SLS_ACT_D_R.$upri_not_tgt_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$interim_flg, MST_SLS_ACT_D_R.$interim_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_cd, MST_SLS_ACT_D_R.$tax_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_tax_amt, MST_SLS_ACT_D_R.$trd_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cost_upri, MST_SLS_ACT_D_R.$cost_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cost_amt, MST_SLS_ACT_D_R.$cost_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_dscnt_amt, MST_SLS_ACT_D_R.$trd_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bill_crryovr_times, MST_SLS_ACT_D_R.$bill_crryovr_times);
				addColumnPathMap(SlsAct_Upd01_DtlR.$stk_mng_typ, MST_SLS_ACT_D_R.$stk_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sundry_itm_flg, MST_SLS_ACT_D_R.$sundry_itm_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1_mng_typ, MST_SLS_ACT_D_R.$sno1_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2_mng_typ, MST_SLS_ACT_D_R.$sno2_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3_mng_typ, MST_SLS_ACT_D_R.$sno3_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4_mng_typ, MST_SLS_ACT_D_R.$sno4_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_po_d_no, MST_SLS_ACT_D_R.$cst_po_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_cd, MST_SLS_ACT_D_R.$cst_itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_nm, MST_SLS_ACT_D_R.$cst_itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_d_rmrks, MST_SLS_ACT_D_R.$trd_d_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$intr_rmrks, MST_SLS_ACT_D_R.$intr_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$rsn_cd, MST_SLS_ACT_D_R.$rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bd_dpt_cd, MST_SLS_ACT_D_R.$bd_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_rate, MST_SLS_ACT_D_R.$wtax_rate);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_amt, MST_SLS_ACT_D_R.$wtax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_no, MST_SLS_ACT_D_R.$slo_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_d_no, MST_SLS_ACT_D_R.$slo_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_ret_schd_no, MST_SLS_ACT_D_R.$sls_ret_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_ret_schd_d_no, MST_SLS_ACT_D_R.$sls_ret_schd_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_schd_no, MST_SLS_ACT_D_R.$ship_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_schd_no, MST_SLS_ACT_D_R.$sls_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_no, MST_SLS_ACT_D_R.$qtn_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_rev, MST_SLS_ACT_D_R.$qtn_rev);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_d_no, MST_SLS_ACT_D_R.$qtn_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_no, MST_SLS_ACT_D_R.$purc_ddlv_po_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_d_no, MST_SLS_ACT_D_R.$purc_ddlv_po_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_no, MST_SLS_ACT_D_R.$purc_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_d_no, MST_SLS_ACT_D_R.$purc_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$iv_d_no, MST_SLS_ACT_D_R.$iv_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char1, MST_SLS_ACT_D_R.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char2, MST_SLS_ACT_D_R.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char3, MST_SLS_ACT_D_R.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dscnt_rsn_cd, MST_SLS_ACT_D_R.$dscnt_rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_no, MST_SLS_ACT_D_R.$ref_sls_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_seq, MST_SLS_ACT_D_R.$ref_sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_d_no, MST_SLS_ACT_D_R.$ref_sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_d_seq, MST_SLS_ACT_D_R.$ref_sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_slip_d_no, MST_SLS_ACT_D_R.$dlv_slip_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_no, MST_SLS_ACT_D_R.$sls_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_seq, MST_SLS_ACT_D_R.$sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_upri, MST_SLS_ACT_D_R.$base_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_amt, MST_SLS_ACT_D_R.$base_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_tax_amt, MST_SLS_ACT_D_R.$base_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_upri, MST_SLS_ACT_D_R.$ptax_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_amt, MST_SLS_ACT_D_R.$ptax_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_tax_amt, MST_SLS_ACT_D_R.$ptax_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_dscnt_amt, MST_SLS_ACT_D_R.$base_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_dscnt_amt, MST_SLS_ACT_D_R.$ptax_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wrk_no, MST_SLS_ACT_D_R.$wrk_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ar_typ, MST_SLS_ACT_D_R.$ar_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_dtl_upd_flg, MST_SLS_ACT_D_R.$sls_dtl_upd_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ext_purc_act_d_no, MST_SLS_ACT_D_R.$ext_purc_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ext_sys_cd, MST_SLS_ACT_D_R.$ext_sys_cd);
				
			}
		}
		
		protected Map_SlsAct_Upd01_HdrR_MST_SLS_ACT_R<SlsAct_Upd01_HdrR,MST_SLS_ACT_R> createMap_SlsAct_Upd01_HdrR_MST_SLS_ACT_R() {
			return new Map_SlsAct_Upd01_HdrR_MST_SLS_ACT_R<SlsAct_Upd01_HdrR, MST_SLS_ACT_R>();
		}
		
		public class Map_SlsAct_Upd01_HdrR_MST_SLS_ACT_R<D extends SlsAct_Upd01_HdrR, S extends MST_SLS_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_no, MST_SLS_ACT_R.$sls_act_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_seq, MST_SLS_ACT_R.$sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_rev, MST_SLS_ACT_R.$sls_act_rev);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cd, MST_SLS_ACT_R.$trd_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_ptn_typ, MST_SLS_ACT_R.$trd_ptn_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ac_dt, MST_SLS_ACT_R.$ac_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_usr_cd, MST_SLS_ACT_R.$sls_usr_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dpt_cd, MST_SLS_ACT_R.$sls_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$wg_cd, MST_SLS_ACT_R.$wg_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dt, MST_SLS_ACT_R.$sls_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_tm, MST_SLS_ACT_R.$ship_tm);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_tm, MST_SLS_ACT_R.$dlv_tm);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_cd, MST_SLS_ACT_R.$cst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$iv_no, MST_SLS_ACT_R.$iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ref_iv_no, MST_SLS_ACT_R.$ref_iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcpt_iv_mng_no, MST_SLS_ACT_R.$rcpt_iv_mng_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcpt_iv_no, MST_SLS_ACT_R.$rcpt_iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd1, MST_SLS_ACT_R.$tterm_cd1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks1, MST_SLS_ACT_R.$tterm_rmrks1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd2, MST_SLS_ACT_R.$tterm_cd2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks2, MST_SLS_ACT_R.$tterm_rmrks2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd3, MST_SLS_ACT_R.$tterm_cd3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks3, MST_SLS_ACT_R.$tterm_rmrks3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_no, MST_SLS_ACT_R.$lc_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_dt, MST_SLS_ACT_R.$lc_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_rmrks, MST_SLS_ACT_R.$lc_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcv_schd_dt, MST_SLS_ACT_R.$rcv_schd_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bill_basis_dt, MST_SLS_ACT_R.$bill_basis_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cred_cd, MST_SLS_ACT_R.$cred_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bcst_cd, MST_SLS_ACT_R.$bcst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$acst_cd, MST_SLS_ACT_R.$acst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ar_dpt_cd, MST_SLS_ACT_R.$ar_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_po_no, MST_SLS_ACT_R.$cst_po_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cur_cd, MST_SLS_ACT_R.$trd_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$base_cur_cd, MST_SLS_ACT_R.$base_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate_cd, MST_SLS_ACT_R.$xrate_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate, MST_SLS_ACT_R.$xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_cur_cd, MST_SLS_ACT_R.$ptax_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_xrate, MST_SLS_ACT_R.$ptax_xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_rmrks, MST_SLS_ACT_R.$trd_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$intr_rmrks, MST_SLS_ACT_R.$intr_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_act_no, MST_SLS_ACT_R.$ship_act_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$slo_no, MST_SLS_ACT_R.$slo_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_ret_schd_no, MST_SLS_ACT_R.$sls_ret_schd_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_no, MST_SLS_ACT_R.$qtn_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_rev, MST_SLS_ACT_R.$qtn_rev);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_slip_no, MST_SLS_ACT_R.$dlv_slip_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_flg, MST_SLS_ACT_R.$aprv_flg);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_no, MST_SLS_ACT_R.$aprv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_sts_typ, MST_SLS_ACT_R.$aprv_sts_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_basis_typ, MST_SLS_ACT_R.$sls_basis_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$adjst_tgt_dt, MST_SLS_ACT_R.$adjst_tgt_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_adjst_typ, MST_SLS_ACT_R.$sls_adjst_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$adjst_mtd_typ, MST_SLS_ACT_R.$adjst_mtd_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char1, MST_SLS_ACT_R.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char2, MST_SLS_ACT_R.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char3, MST_SLS_ACT_R.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_act_sync_flg, MST_SLS_ACT_R.$ship_act_sync_flg);
				addColumnPathMap(SlsAct_Upd01_HdrR.$slip_form_cd, MST_SLS_ACT_R.$slip_form_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cur_amt, MST_SLS_ACT_R.$trd_cur_amt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cur_tax_amt, MST_SLS_ACT_R.$trd_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$base_cur_amt, MST_SLS_ACT_R.$base_cur_amt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$base_cur_tax_amt, MST_SLS_ACT_R.$base_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$slip_sts_typ, MST_SLS_ACT_R.$slip_sts_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ac_ym, MST_SLS_ACT_R.$ac_ym);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ddlv_sls_flg, MST_SLS_ACT_R.$ddlv_sls_flg);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_lg_grp_cd, MST_SLS_ACT_R.$ship_lg_grp_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$edi_flg, MST_SLS_ACT_R.$edi_flg);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dest.setStatus(Status.DELETE);
			}
		}
		
		/**
		 * インボイス対象の売上実績ＳＶ用電文データ作成
		 */
		protected MCNumber makeIvSlsData(
				MCNumber hdrPegNo,
				MCList<AccptRecvIf_Chk01_DtlR> tgtL,
				MCList<SlsAct_Upd01_HdrR> hdrL,
				MCList<SlsAct_Upd01_DtlR> dtlL,
				MCList<SlsAct_Upd01_IoR> ioL) {
			
			MCIndexKey ivIdx = tgtL.createIndex(
					AccptRecvIf_Chk01_DtlR.$imp_flg,
					AccptRecvIf_Chk01_DtlR.$iv_flg
					);
			
			MCList<AccptRecvIf_Chk01_DtlR> ivL = tgtL.subList(ivIdx, true, true);
			MCIndexKey ivDNoLIdx = ivL.createIndex(AccptRecvIf_Chk01_DtlR.$fix_dlv_slip_d_no);
			MCList<AccptRecvIf_Chk01_DtlR> ivGrpL = ivL.groupBy(
					AccptRecvIf_Chk01_DtlR.$data_crud_typ,
					AccptRecvIf_Chk01_DtlR.$fix_dlv_slip_no,
					AccptRecvIf_Chk01_DtlR.$rcv_schd_dt,
					AccptRecvIf_Chk01_DtlR.$via_dlv_typ,
					AccptRecvIf_Chk01_DtlR.$bill_cl_typ,
					AccptRecvIf_Chk01_DtlR.$accpt_dfct_flg);
			
			if (isNull(tgtL) || tgtL.isEmpty() || isNull(ivL) || ivL.isEmpty()) {
				return hdrPegNo;
			}
			
			for (AccptRecvIf_Chk01_DtlR ivGrpR : ivGrpL) {
				if (ivGrpR.accpt_dfct_flg() && !isCrt(ivGrpR)) {
					ivGrpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				MCList<SlsAct_Upd02_IvLR> ivDtlL = MCList.create(SlsAct_Upd02_IvLR.class);
				ivDtlL.addStringColumn(MST_SLS_ACT_D_R.$ext_purc_act_d_no);
				ivDtlL.addStringColumn(MST_SLS_ACT_D_R.$ext_sys_cd);
				ivDtlL.addStringColumn(MST_IV_R.$sls_basis_typ);
				ivDtlL.addStringColumn(MST_IV_R.$iv_src_typ);
				
				if (!isCrt(ivGrpR)) {
					// 削除データ作成
					hdrPegNo = makeIvSlsDelData(hdrPegNo, hdrL, dtlL, ioL, ivGrpR,
							ivDtlL, ivL, ivDNoLIdx);
				}
				
				if (!isDel(ivGrpR)) {
					// 登録データ作成
					hdrPegNo = makeIvSlsCrtData(hdrPegNo, hdrL, dtlL, ioL, ivGrpR,
							ivDtlL, ivL, ivDNoLIdx);
				}
			}
			
			return hdrPegNo;
		}
		
		/**
		 * インボイス対象の売上実績サービス用電文データ作成（削除）
		 */
		protected MCNumber makeIvSlsDelData(
				MCNumber hdrPegNo,
				MCList<SlsAct_Upd01_HdrR> hdrL,
				MCList<SlsAct_Upd01_DtlR> dtlL,
				MCList<SlsAct_Upd01_IoR> ioL,
				AccptRecvIf_Chk01_DtlR ivGrpR,
				MCList<SlsAct_Upd02_IvLR> ivDtlL,
				MCList<AccptRecvIf_Chk01_DtlR> ivL,
				MCIndexKey ivDNoLIdx) {
			MCIndexKey up0Idx = up0().createIndex(AccptRecvIf_Chk01_DtlR.$ext_purc_act_d_no, AccptRecvIf_Chk01_DtlR.$ext_sys_cd);
			
			executeQuery(ivDtlL, MSLAL5160_MST_IV_S03(), ivGrpR);
			for (SlsAct_Upd02_IvLR ivDtlR : ivDtlL) {
				AccptRecvIf_Chk01_DtlR tgtIvR = ivL.getFirst(ivDNoLIdx, ivDtlR.iv_d_no());
				if (!isNull(tgtIvR)) {
					ivDtlR.setStringNE(MST_SLS_ACT_D_R.$ext_purc_act_d_no, tgtIvR.ext_purc_act_d_no());
					ivDtlR.setStringNE(MST_SLS_ACT_D_R.$ext_sys_cd, tgtIvR.ext_sys_cd());
				}
			}
			
			MCList<MST_SLS_ACT_R> slsActL = _slsActL.subList(_slsActIvIdxKey, ivGrpR.fix_dlv_slip_no());
			
			int dtlCnt = 0;
			int ioCnt = 0;
			for (MST_SLS_ACT_R slsActR : slsActL) {
				
				SlsAct_Upd01_HdrR tmpSlsActHdrR = SlsAct_Upd01_HdrR.create();
				tmpSlsActHdrR.hdr_peg_no(hdrPegNo);
				tmpSlsActHdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				tmpSlsActHdrR.sls_act_no(slsActR.sls_act_no());
				tmpSlsActHdrR.sls_act_seq(slsActR.sls_act_seq());
				tmpSlsActHdrR.sls_act_rev(slsActR.sls_act_rev());
				tmpSlsActHdrR.trd_cd(slsActR.trd_cd());
				tmpSlsActHdrR.trd_ptn_typ(slsActR.trd_ptn_typ());
				tmpSlsActHdrR.sls_dpt_cd(slsActR.sls_dpt_cd());
				tmpSlsActHdrR.wg_cd(slsActR.wg_cd());
				tmpSlsActHdrR.cst_cd(slsActR.cst_cd());
				tmpSlsActHdrR.trd_cur_cd(slsActR.trd_cur_cd());
				tmpSlsActHdrR.iv_no(ivGrpR.fix_dlv_slip_no());
				tmpSlsActHdrR.slip_split_non_flg(true);
				tmpSlsActHdrR.no_cred_upd_flg(true);
				tmpSlsActHdrR.edi_flg(true);
				
				// 売上実績明細電文
				MCList<MST_SLS_ACT_D_R> slsActDL = _slsActDL.subList(_slsActDSlsActNoIdxkey, slsActR.sls_act_no());
				for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
					SlsAct_Upd01_DtlR slsActDtlR = SlsAct_Upd01_DtlR.create();
					AccptRecvIf_Chk01_DtlR tmpUpR = up0().getFirst(up0Idx, slsActDR.ext_purc_act_d_no(), slsActDR.ext_sys_cd());
					boolean isSlsClose = callClChk(tmpUpR.accpt_dt(), false);
					tmpSlsActHdrR.can_ac_dt(getFixDt(tmpUpR.accpt_dt(), isSlsClose));
					slsActDtlR.hdr_peg_no(tmpSlsActHdrR.hdr_peg_no());
					slsActDtlR.dtl_peg_no(++dtlCnt);
					slsActDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					slsActDtlR.sls_act_d_no(slsActDR.sls_act_d_no());
					slsActDtlR.sls_act_d_seq(slsActDR.sls_act_d_seq());
					slsActDtlR.trd_cur_amt(slsActDR.trd_cur_amt());
					slsActDtlR.ship_schd_no(slsActDR.ship_schd_no());
					slsActDtlR.sls_schd_no(slsActDR.sls_schd_no());
					slsActDtlR.ext_purc_act_d_no(slsActDR.ext_purc_act_d_no());
					slsActDtlR.ext_sys_cd(slsActDR.ext_sys_cd());
					slsActDtlR.base_unit_qty(slsActDR.base_unit_qty());
					slsActDtlR.slo_no(slsActDR.slo_no());
					slsActDtlR.setStatus(Status.DELETE);
					
					if (tmpUpR.ddlvTgtFlg()) {
						tmpSlsActHdrR.dlv_slip_no(slsActR.dlv_slip_no());
						tmpSlsActHdrR.ship_act_service_exec_flg(true);
						tmpSlsActHdrR.no_cred_upd_flg(false);
						slsActDtlR.purc_ddlv_po_no(slsActDR.purc_ddlv_po_no());
					}
					
					dtlL.add(slsActDtlR);
					
					// 売上実績受払電文
					MCList<MST_SLS_ACT_IO_R> slsActIoL = _slsActIoL.subList(_slsActIoIdxkey, slsActDR.sls_act_d_no());
					for (MST_SLS_ACT_IO_R tmpSlsActIoR : slsActIoL) {
						SlsAct_Upd01_IoR slsActIoR = SlsAct_Upd01_IoR.create();
						slsActIoR.hdr_peg_no(tmpSlsActHdrR.hdr_peg_no());
						slsActIoR.dtl_peg_no(slsActDtlR.dtl_peg_no());
						slsActIoR.io_peg_no(++ioCnt);
						slsActIoR.sls_act_io_no(tmpSlsActIoR.sls_act_io_no());
						slsActIoR.sls_act_io_seq(tmpSlsActIoR.sls_act_io_seq());
						slsActIoR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						
						if (tmpUpR.ddlvTgtFlg()) {
							copy(slsActIoR, tmpSlsActIoR, createMap_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R_IvDdlvDel());
							slsActIoR.ship_act_d_no(tmpSlsActIoR.ship_act_d_no());
							slsActIoR.ship_alloc_sts_no(tmpSlsActIoR.getStringNE("ship_alloc_sts_no"));
						}
						slsActIoR.setStatus(Status.DELETE);
						ioL.add(slsActIoR);
					}
				}
				
				hdrL.add(tmpSlsActHdrR);
				hdrPegNo = hdrPegNo.add(1);
			}
			
			return hdrPegNo;
		}
		
		/**
		 * インボイス対象の売上実績サービス用電文データ作成（新規登録）
		 */
		protected MCNumber makeIvSlsCrtData(
				MCNumber hdrPegNo,
				MCList<SlsAct_Upd01_HdrR> hdrL,
				MCList<SlsAct_Upd01_DtlR> dtlL,
				MCList<SlsAct_Upd01_IoR> ioL,
				AccptRecvIf_Chk01_DtlR ivGrpR,
				MCList<SlsAct_Upd02_IvLR> ivDtlL,
				MCList<AccptRecvIf_Chk01_DtlR> ivL,
				MCIndexKey ivDNoLIdx) {
			if (MAC_VIA_DLV_TYP.isVIA(ivGrpR.via_dlv_typ())) {
				executeQuery(ivDtlL, MSLAL5160_MST_IV_S01(), ivGrpR);
			}
			else {
				executeQuery(ivDtlL, MSLAL5160_MST_IV_S02(), ivGrpR);
			}
			for (SlsAct_Upd02_IvLR ivDtlR : ivDtlL) {
				AccptRecvIf_Chk01_DtlR tgtIvR = ivL.getFirst(ivDNoLIdx, ivDtlR.iv_d_no());
				if (!isNull(tgtIvR)) {
					ivDtlR.setStringNE(MST_SLS_ACT_D_R.$ext_purc_act_d_no, tgtIvR.ext_purc_act_d_no());
					ivDtlR.setStringNE(MST_SLS_ACT_D_R.$ext_sys_cd, tgtIvR.ext_sys_cd());
				}
			}
			
			SlsAct_Upd01_HdrR slsActHdrR = null;
			SlsAct_Upd02_IvLR prevRow = SlsAct_Upd02_IvLR.create();
			int dtlCnt = 0;
			// 取得した単位で売上実績を作成
			for (SlsAct_Upd02_IvLR ivDtlR : ivDtlL) {
				
				AccptRecvIf_Chk01_DtlR tmpUpR = up0().getFirst(AccptRecvIf_Chk01_DtlR.$fix_dlv_slip_d_no, ivDtlR.iv_d_no());
				
				if (isUpd(ivGrpR)) {
					// 対応する売上実績情報を取得
					MST_SLS_ACT_D_R tmpSlsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, ivDtlR.getStringNE(MST_SLS_ACT_D_R.$ext_purc_act_d_no), ivDtlR.getStringNE(MST_SLS_ACT_D_R.$ext_sys_cd));
					if (!isNull(tmpSlsActDR)) {
						ivDtlR.sls_act_no(tmpSlsActDR.sls_act_no());
						ivDtlR.sls_act_seq(tmpSlsActDR.sls_act_seq());
						ivDtlR.sls_act_d_no(tmpSlsActDR.sls_act_d_no());
						ivDtlR.sls_act_d_seq(tmpSlsActDR.sls_act_d_seq());
						tmpUpR.loc_cd(tmpSlsActDR.loc_cd());
						tmpUpR.str_ln_cd(tmpSlsActDR.str_ln_cd());
					}
				}
				
				if (!prevRow.equalColumns(ivDtlR, getHdrKey())) {
					slsActHdrR = SlsAct_Upd01_HdrR.create();
					MCRow.copyall(prevRow, ivDtlR);
					// 売上実績ヘッダ電文作成
					hdrPegNo = crtIvSlsActHdr(hdrPegNo, hdrL, ivGrpR, slsActHdrR, ivDtlR, tmpUpR);
				}
				
				// 明細・詳細データ作成
				dtlCnt = makeIvSlsCrtDtlData(dtlCnt, dtlL, ioL, tmpUpR, ivGrpR, ivDtlL, ivDtlR, slsActHdrR);
				
			}
			
			return hdrPegNo;
		}
		
		protected String[] getHdrKey() {
			return new String[]{
					SlsAct_Upd02_IvLR.$trd_cd,
					SlsAct_Upd02_IvLR.$trd_ptn_typ,
					SlsAct_Upd02_IvLR.$sls_usr_cd,
					SlsAct_Upd02_IvLR.$sls_dpt_cd,
					SlsAct_Upd02_IvLR.$ar_dpt_cd,
					SlsAct_Upd02_IvLR.$cst_po_no,
					SlsAct_Upd02_IvLR.$trd_rmrks,
					SlsAct_Upd02_IvLR.$slo_no
			};
		}
		
		/**
		 * インボイス対象の売上実績サービス用電文データ作成（新規登録のヘッダ部）
		 */
		protected MCNumber crtIvSlsActHdr(
				MCNumber hdrPegNo,
				MCList<SlsAct_Upd01_HdrR> hdrL,
				AccptRecvIf_Chk01_DtlR ivGrpR,
				SlsAct_Upd01_HdrR slsActHdrR,
				SlsAct_Upd02_IvLR ivDtlR,
				AccptRecvIf_Chk01_DtlR tmpUpR
				) {
			// 売上実績ヘッダ電文
			copy(slsActHdrR, ivDtlR, createMap_SlsAct_Upd01_HdrR_SlsAct_Upd02_IvLR());
			setSlsHdrDt(slsActHdrR, tmpUpR.accpt_dt(),
					ivDtlR.getStringNE(MST_SLS_ACT_D_R.$ext_purc_act_d_no),
					ivDtlR.getStringNE(MST_SLS_ACT_D_R.$ext_sys_cd), false);
			slsActHdrR.hdr_peg_no(hdrPegNo);
			slsActHdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			if (MAC_BILL_CL_TYP.isEACH_SLS(ivGrpR.bill_cl_typ())) {
				slsActHdrR.rcv_schd_dt(ivGrpR.rcv_schd_dt());
			}
			if (isSame(ivDtlR.base_cur_cd(), ivDtlR.trd_cur_cd())) {
				slsActHdrR.xrate(1);
			}
			if (isSame(ivDtlR.ptax_cur_cd(), ivDtlR.trd_cur_cd())) {
				slsActHdrR.ptax_xrate(1);
			}
			
			if (!isNull(tmpUpR) && !tmpUpR.ddlvTgtFlg()) {
				slsActHdrR.slip_split_non_flg(false);
			}
			else {
				slsActHdrR.ship_tm(slsActHdrR.sls_dt());
				slsActHdrR.dlv_tm(slsActHdrR.sls_dt());
				slsActHdrR.slip_split_non_flg(false);
				slsActHdrR.lot_chk_off_flg(false);
				slsActHdrR.ship_act_service_exec_flg(true);
				slsActHdrR.xrate_rnd_typ(getCo().xrate_rnd_typ());
			}
			
			slsActHdrR.no_cred_upd_flg(false);
			slsActHdrR.edi_flg(true);
			slsActHdrR.sls_basis_typ(ivDtlR.getStringNE(MST_IV_R.$sls_basis_typ));
			slsActHdrR.cst_iv_flg(true);
			slsActHdrR.iv_src_typ(ivDtlR.getStringNE(MST_IV_R.$iv_src_typ));
			
			// 売上部門
			MAUCL_DptUtil.setDpt(slsActHdrR, SlsAct_Upd01_HdrR.$sls_dpt_cd, null, SlsAct_Upd01_HdrR.$ac_dt, true);
			if (slsActHdrR.getBooleanNE("err_flg")) {
				throwDptErr();
			}
			
			// ＷＧ取得
			slsActHdrR.wg_cd(getWgCd(slsActHdrR.sls_dpt_cd(), slsActHdrR.ac_dt()));
			
			// 債権部門
			MAUCL_DptUtil.setDpt(slsActHdrR, SlsAct_Upd01_HdrR.$ar_dpt_cd, null, SlsAct_Upd01_HdrR.$ac_dt, true);
			if (slsActHdrR.getBooleanNE("err_flg")) {
				throwDptErr();
			}
			
			slsActHdrR.setValue(SlsAct_Upd01_HdrR.$sls_act_no, null);
			slsActHdrR.setValue(SlsAct_Upd01_HdrR.$sls_act_seq, null);
			slsActHdrR.setValue(SlsAct_Upd01_HdrR.$sls_act_rev, null);
			
			hdrL.add(slsActHdrR);
			
			return hdrPegNo.add(1);
		}
		
		/**
		 * インボイス対象の売上実績サービス用電文データ作成（新規登録の明細部・詳細部）
		 */
		protected int makeIvSlsCrtDtlData(
				int dtlCnt,
				MCList<SlsAct_Upd01_DtlR> dtlL,
				MCList<SlsAct_Upd01_IoR> ioL,
				AccptRecvIf_Chk01_DtlR tmpUpR,
				AccptRecvIf_Chk01_DtlR ivGrpR,
				MCList<SlsAct_Upd02_IvLR> ivDtlL,
				SlsAct_Upd02_IvLR ivDtlR,
				SlsAct_Upd01_HdrR slsActHdrR) {
			
			// 売上実績明細電文
			SlsAct_Upd01_DtlR slsActDtlR = SlsAct_Upd01_DtlR.create();
			slsActDtlR.addNumberColumn("upd_purc_peg_no");
			copy(slsActDtlR, ivDtlR, createMap_SlsAct_Upd01_DtlR_SlsAct_Upd02_IvLR());
			slsActDtlR.hdr_peg_no(slsActHdrR.hdr_peg_no());
			slsActDtlR.dtl_peg_no(++dtlCnt);
			slsActDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			slsActDtlR.disp_seq(dtlCnt);
			slsActDtlR.ext_purc_act_d_no(ivDtlR.getStringNE(MST_SLS_ACT_D_R.$ext_purc_act_d_no));
			slsActDtlR.ext_sys_cd(ivDtlR.getStringNE(MST_SLS_ACT_D_R.$ext_sys_cd));
			slsActDtlR.pri_prnt_flg(true);
			if (!isNull(ivDtlR.slo_d_no())) {
				slsActDtlR.upri_not_tgt_flg(true);
			}
			
			if (!tmpUpR.ddlvTgtFlg()) {
				if (MAC_VIA_DLV_TYP.isVIA(ivDtlR.via_dlv_typ())) {
					MCList<MST_IV_SHIP_ACT_D_R> ivShipActDL = _ivShipActDL.subList(_ivShipActDIdx, ivDtlR.iv_no(), ivDtlR.iv_d_no());
					boolean isNotMulti = ivShipActDL.groupList("dlv_slip_no").length == 1;
					boolean isMulti = ivShipActDL.groupList("dlv_slip_no", "dlv_slip_d_no").length > 1;
					if (isMulti) {
						slsActDtlR.ship_dlv_slip_multi_flg(true);
						if (isNotMulti) {
							slsActHdrR.ship_dlv_slip_no(ivShipActDL.get(0).getString("dlv_slip_no"));
						}
					}
					else {
						slsActHdrR.ship_dlv_slip_no(ivShipActDL.get(0).getString("dlv_slip_no"));
						slsActDtlR.ship_dlv_slip_d_no(ivShipActDL.get(0).getString("dlv_slip_d_no"));
					}
				}
				else {
					MCList<MST_IV_MAP_R> ivMapL = _ivMapL.subList(_ivMapIdx, ivDtlR.iv_d_no());
					if (!isNull(ivMapL)) {
						boolean isMulti = ivMapL.groupList("dlv_slip_no", "dlv_slip_d_no").length > 1;
						slsActHdrR.ship_dlv_slip_no(ivMapL.get(0).getString("dlv_slip_no"));
						if (isMulti) {
							slsActDtlR.ship_dlv_slip_multi_flg(true);
						}
						else {
							slsActDtlR.ship_dlv_slip_d_no(ivMapL.get(0).getString("dlv_slip_d_no"));
						}
					}
				}
			}
			
			// 原価金額
			if (!isNull(slsActDtlR.cost_upri())) {
				slsActDtlR.cost_amt(
						MSUCL_SlsUtil.getCostAmt(
								slsActDtlR.cost_upri(),
								slsActDtlR.base_unit_qty(),
								getBaseCur().amt_dec_place()));
			}
			
			// 仕入直送売上
			if (tmpUpR.ddlvTgtFlg()) {
				MST_SLS_SCHD_R slsSchdR = _slsSchdL.getFirst(_slsSchdNoIdxkey, tmpUpR.fix_sls_schd_no());
				MST_IV_R tmpIvR = _ivL.getFirst(_ivIdxkey, tmpUpR.fix_dlv_slip_no());
				MST_IV_D_R tmpIvDR = _ivDL.getFirst(_ivDIdxkey, tmpUpR.fix_dlv_slip_d_no());
				copy(slsActDtlR, tmpIvR, createMap_SlsAct_Upd01_DtlR_MST_IV_R());
				slsActDtlR.sls_schd_abort_flg(tmpUpR.abort_flg());
				slsActDtlR.loc_cd(tmpUpR.loc_cd());
				slsActDtlR.str_ln_cd(tmpUpR.str_ln_cd());
				if (tmpUpR.sls_schd_mult_flg()) {
					slsActDtlR.lot_no(slsSchdR.lot_no());
					slsActDtlR.sublot_no(slsSchdR.sublot_no());
				}
				else {
					slsActDtlR.lot_no(tmpUpR.lot_no());
					slsActDtlR.sublot_no(tmpUpR.sublot_no());
				}
				slsActDtlR.stk_mng_typ(tmpUpR.stk_mng_typ());
				slsActDtlR.ext_purc_act_d_no(tmpUpR.ext_purc_act_d_no());
				slsActDtlR.ext_sys_cd(tmpUpR.ext_sys_cd());
				slsActDtlR.setBooleanNE("sync_flg", tmpUpR.sync_flg());
				slsActDtlR.purc_act_no(slsSchdR.getStringNE("purc_act_no"));
				slsActDtlR.purc_act_d_no(slsSchdR.purc_act_d_no());
				slsActDtlR.sls_schd_no(slsSchdR.sls_schd_no());
				slsActDtlR.ship_schd_no(slsSchdR.ship_schd_no());
				slsActDtlR.base_unit_cd(slsSchdR.base_unit_cd());
				slsActDtlR.purc_ddlv_po_no(slsSchdR.getStringNE("purc_ddlv_po_no"));
				slsActDtlR.purc_ddlv_po_d_no(slsSchdR.getStringNE("purc_ddlv_po_d_no"));
				slsActDtlR.gd_cd(tmpIvDR.gd_cd());
				
				MCList<SlsAct_Upd01_IoR> tmpIoL = MCList.create(SlsAct_Upd01_IoR.class);
				// 仕入後の場合（仕入後があるのは新規の場合のみ）
				if (MAC_DATA_CRUD_TYP.isCRT(slsActDtlR.data_crud_typ()) && !slsActDtlR.getBooleanNE("sync_flg") ) {
					executeQuery(tmpIoL, MSLAL5160_MST_ARR_ACT_S01(), slsActDtlR);
					
					if (tmpIoL.size() == 1) {
						if (isNull(slsActDtlR.loc_cd())) {
							slsActDtlR.loc_cd(tmpIoL.get(0).loc_cd());
						}
						if (isNull(slsActDtlR.str_ln_cd())) {
							slsActDtlR.str_ln_cd(tmpIoL.get(0).str_ln_cd());
						}
						if (isNull(slsActDtlR.lot_no())) {
							slsActDtlR.lot_no(tmpIoL.get(0).lot_no());
						}
						if (isNull(slsActDtlR.sublot_no())) {
							slsActDtlR.sublot_no(tmpIoL.get(0).sublot_no());
						}
						tmpUpR.arr_act_no(tmpIoL.get(0).arr_act_no());
						tmpUpR.purc_act_io_no(tmpIoL.get(0).purc_act_io_no());
					}
				}
				
				if (isUpd(ivGrpR)) {
					MST_SLS_ACT_D_R tmpSlsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, ivDtlR.getStringNE(MST_SLS_ACT_D_R.$ext_purc_act_d_no), ivDtlR.getStringNE(MST_SLS_ACT_D_R.$ext_sys_cd));
					if (!isNull(tmpSlsActDR)) {
						slsActDtlR.setNumberNE("upd_purc_peg_no", tmpSlsActDR.getNumberNE("upd_purc_peg_no"));
					}
				}
				// 明細と同等の内容を詳細として取得
				SlsAct_Upd01_IoR tmpIoR = SlsAct_Upd01_IoR.create();
				copy(tmpIoR, slsActDtlR, createMap_SlsAct_Upd01_IoR_SlsAct_Upd01_DtlR());
				
				if (isUpd(ivGrpR)) {
					MST_SLS_ACT_IO_R tmpUpdIoR = _slsActIoL.getFirst(_slsActIoIdxkey, slsActDtlR.sls_act_d_no());
					if (!isNull(tmpUpdIoR)) {
						tmpIoR.sls_act_io_no(tmpUpdIoR.sls_act_io_no());
						tmpIoR.arr_act_no(tmpUpdIoR.arr_act_no());
						tmpIoR.sync_flg(tmpUpdIoR.sync_flg());
					}
				}
				
				if (isPack(slsActDtlR.itm_cd(), slsActDtlR.itm_sub1(), slsActDtlR.itm_sub2(), slsActDtlR.itm_sub3(), slsActDtlR.trd_unit_cd())) {
					tmpIoR.pack_unit_cd(slsActDtlR.trd_unit_cd());
					tmpIoR.pack_unit_qty(slsActDtlR.trd_unit_qty());
				}
				else {
					tmpIoR.pack_unit_cd(tmpIoR.base_unit_cd());
					tmpIoR.pack_unit_qty(tmpIoR.base_unit_qty());
				}
				
				if (isNull(tmpIoR.arr_act_no())) {
					tmpIoR.arr_act_no(tmpUpR.arr_act_no());
				}
				if (isNull(tmpIoR.purc_act_io_no())) {
					tmpIoR.purc_act_io_no(tmpUpR.purc_act_io_no());
				}
				
				ioL.add(tmpIoR);
			}
			else {
				if (MAC_VIA_DLV_TYP.isVIA(ivDtlR.via_dlv_typ())) {
					MCList<SlsAct_Upd02_IoLR> tmpIoL = MCList.create(SlsAct_Upd02_IoLR.class);
					executeQuery(tmpIoL, MSLAL5160_MST_IV_SHIP_ACT_D_S01(), ivDtlR);
					
					ioL.addAll(makeIoL(ivGrpR, slsActHdrR, slsActDtlR, tmpIoL, ivDtlR));
					
				}
				else if (isNull(ivDtlR.ship_schd_no())) {
					MCList<SlsAct_Upd02_IoLR> tmpIoL = MCList.create(SlsAct_Upd02_IoLR.class);
					executeQuery(tmpIoL, MSLAL5160_MST_SHIP_ACT_D_S03(), ivDtlR);
					
					if (isNull(tmpIoL)) {
						ioL.add(makeUnplanIoR(slsActDtlR, ivGrpR));
					}
					else {
						ioL.addAll(makeIoL(ivGrpR, slsActHdrR, slsActDtlR, tmpIoL, ivDtlR));
					}
				}
				else {
					// 出荷予定ＮＯより出荷引当情報の取得
					MCList<MST_SHIP_ALLOC_STS_R> shipAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
					MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
					MCQueryApiBuilder shipAllocStsL_bldr = MCQueryApiBuilder.create(t);
					shipAllocStsL_bldr.setWhere(t.ship_schd_no.eq(bind("1")), ivDtlR.ship_schd_no());
					dbSelect("MSLAL5160_MST_SHIP_ALLOC_STS_S01", shipAllocStsL, shipAllocStsL_bldr);
					
					if (!isNull(shipAllocStsL)) {
						// 取得した出荷引当状況ＮＯより出荷実績明細を取得
						for (MST_SHIP_ALLOC_STS_R shipAllocStsR : shipAllocStsL) {
							MCList<SlsAct_Upd02_IoLR> tmpIoL = MCList.create(SlsAct_Upd02_IoLR.class);
							executeQuery(tmpIoL, MSLAL5160_MST_SHIP_ACT_D_S02(), shipAllocStsR);
							
							ioL.addAll(makeIoL(ivGrpR, slsActHdrR, slsActDtlR, tmpIoL, ivDtlR));
						}
					}
					else {
						ioL.add(makeUnplanIoR(slsActDtlR, ivGrpR));
					}
				}
			}
			
			slsActDtlR.addDateColumn(SlsAct_Upd01_HdrR.$ac_dt);
			slsActDtlR.setDateNE(SlsAct_Upd01_HdrR.$ac_dt, slsActHdrR.ac_dt());
			// 負担部門
			MAUCL_DptUtil.setDpt(slsActDtlR, SlsAct_Upd01_DtlR.$bd_dpt_cd, null, SlsAct_Upd01_HdrR.$ac_dt, true);
			if (slsActDtlR.getBooleanNE("err_flg")) {
				throwDptErr();
			}
			
			slsActDtlR.setValue(SlsAct_Upd01_DtlR.$sls_act_d_no, null);
			slsActDtlR.setValue(SlsAct_Upd01_DtlR.$sls_act_d_seq, null);
			slsActDtlR.setValue(SlsAct_Upd01_DtlR.$sls_act_no, null);
			slsActDtlR.setValue(SlsAct_Upd01_DtlR.$sls_act_seq, null);
			
			if (useIfData()) {
				slsActDtlR.interim_flg(tmpUpR.interim_flg());
			}
			
			dtlL.add(slsActDtlR);
			
			return dtlCnt;
		}
		
		protected SlsAct_Upd01_IoR makeUnplanIoR(SlsAct_Upd01_DtlR slsActDtlR, AccptRecvIf_Chk01_DtlR ivGrpR) {
			SlsAct_Upd01_IoR tmpIoR = SlsAct_Upd01_IoR.create();
			copy(tmpIoR, slsActDtlR, createMap_SlsAct_Upd01_IoR_SlsAct_Upd01_DtlR());
			
			if (isUpd(ivGrpR)) {
				MST_SLS_ACT_IO_R tmpUpdIoR = _slsActIoL.getFirst(_slsActIoIdxkey, slsActDtlR.sls_act_d_no());
				tmpIoR.sls_act_io_no(tmpUpdIoR.sls_act_io_no());
			}
			if (isPack(slsActDtlR.itm_cd(), slsActDtlR.itm_sub1(), slsActDtlR.itm_sub2(), slsActDtlR.itm_sub3(), slsActDtlR.trd_unit_cd())){
				tmpIoR.pack_unit_cd(tmpIoR.trd_unit_cd());
				tmpIoR.pack_unit_qty(tmpIoR.trd_unit_qty());
			}
			else {
				tmpIoR.pack_unit_cd(tmpIoR.base_unit_cd());
				tmpIoR.pack_unit_qty(tmpIoR.base_unit_qty());
			}
			
			return tmpIoR;
		}
		
		protected Map_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R<SlsAct_Upd01_IoR,MST_SLS_ACT_IO_R> createMap_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R_IvDdlvDel() {
			return new Map_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R<SlsAct_Upd01_IoR, MST_SLS_ACT_IO_R>();
		}
		
		public class Map_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R_IvDdlvDel<D extends SlsAct_Upd01_IoR, S extends MST_SLS_ACT_IO_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_IoR.$ship_act_d_no, MST_SLS_ACT_IO_R.$ship_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$iv_ship_act_d_no, MST_SLS_ACT_IO_R.$iv_ship_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$arr_act_no, MST_SLS_ACT_IO_R.$arr_act_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$purc_act_io_no, MST_SLS_ACT_IO_R.$purc_act_io_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno1, MST_SLS_ACT_IO_R.$sno1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno2, MST_SLS_ACT_IO_R.$sno2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno3, MST_SLS_ACT_IO_R.$sno3);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno4, MST_SLS_ACT_IO_R.$sno4);
				addColumnPathMap(SlsAct_Upd01_IoR.$gd_cd, MST_SLS_ACT_IO_R.$gd_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$loc_cd, MST_SLS_ACT_IO_R.$loc_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$str_ln_cd, MST_SLS_ACT_IO_R.$str_ln_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$lot_no, MST_SLS_ACT_IO_R.$lot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sublot_no, MST_SLS_ACT_IO_R.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_cd, MST_SLS_ACT_IO_R.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_qty, MST_SLS_ACT_IO_R.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_cd, MST_SLS_ACT_IO_R.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_qty, MST_SLS_ACT_IO_R.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_cd, MST_SLS_ACT_IO_R.$pack_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_qty, MST_SLS_ACT_IO_R.$pack_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$sync_flg, MST_SLS_ACT_IO_R.$sync_flg);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_d_no, MST_SLS_ACT_IO_R.$sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_d_seq, MST_SLS_ACT_IO_R.$sls_act_d_seq);
			}
		}
		
		protected Map_SlsAct_Upd01_DtlR_MST_IV_R<SlsAct_Upd01_DtlR,MST_IV_R> createMap_SlsAct_Upd01_DtlR_MST_IV_R() {
			return new Map_SlsAct_Upd01_DtlR_MST_IV_R<SlsAct_Upd01_DtlR, MST_IV_R>();
		}
		
		public class Map_SlsAct_Upd01_DtlR_MST_IV_R<D extends SlsAct_Upd01_DtlR, S extends MST_IV_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cd, MST_IV_R.$tdlv_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_sundry_flg, MST_IV_R.$tdlv_sundry_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_nm, MST_IV_R.$tdlv_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_zip_cd, MST_IV_R.$tdlv_zip_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr1, MST_IV_R.$tdlv_addr1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr2, MST_IV_R.$tdlv_addr2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr3, MST_IV_R.$tdlv_addr3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr4, MST_IV_R.$tdlv_addr4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_tel, MST_IV_R.$tdlv_tel);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_fax, MST_IV_R.$tdlv_fax);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cntct_dpt, MST_IV_R.$tdlv_cntct_dpt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cntct_psn, MST_IV_R.$tdlv_cntct_psn);
			}
		}
		
		/**
		 * 売上実績詳細部作成
		 */
		protected MCList<SlsAct_Upd01_IoR> makeIoL(
				AccptRecvIf_Chk01_DtlR ivGrpR,
				SlsAct_Upd01_HdrR slsActHdrR,
				SlsAct_Upd01_DtlR slsActDtlR,
				MCList<SlsAct_Upd02_IoLR> ioL,
				SlsAct_Upd02_IvLR ivDtlR) {
			
			MCList<SlsAct_Upd01_IoR> slsActIoL = MCList.create(SlsAct_Upd01_IoR.class);
			
			MCList<MST_SLS_ACT_IO_R> tmpIoL = MCList.create(MST_SLS_ACT_IO_R.class);
			MCIndexKey idxShipAct = null;
			MCIndexKey idxIVShipAct = null;
			
			if (!isCrt(ivGrpR)) {
				tmpIoL = _slsActIoL.subList(_slsActIoIdxkey, ivDtlR.sls_act_d_no());
				idxShipAct = tmpIoL.createIndex(MST_SLS_ACT_IO_R.$ship_act_d_no);
				idxIVShipAct = tmpIoL.createIndex(MST_SLS_ACT_IO_R.$iv_ship_act_d_no);
			}
			
			for (SlsAct_Upd02_IoLR ioR : ioL) {
				SlsAct_Upd01_IoR slsActIoR = SlsAct_Upd01_IoR.create();
				if (!isCrt(ivGrpR)) {
					if (!isNull(ioR.iv_ship_act_d_no())) {
						MST_SLS_ACT_IO_R tmpIoR = tmpIoL.getFirst(idxIVShipAct, ioR.iv_ship_act_d_no());
						if (!isNull(tmpIoR)) {
							ioR.sls_act_io_no(tmpIoR.sls_act_io_no());
						}
					}
					else {
						if (!isNull(tmpIoL)) {
							MST_SLS_ACT_IO_R tmpIoR = tmpIoL.getFirst(idxShipAct, ioR.ship_act_d_no());
							if (!isNull(tmpIoR)) {
								ioR.sls_act_io_no(tmpIoR.sls_act_io_no());
							}
						}
					}
				}
				
				copy(slsActIoR, ioR, createMap_SlsAct_Upd01_IoR_SlsAct_Upd02_IoLR());
				slsActIoR.hdr_peg_no(slsActHdrR.hdr_peg_no());
				slsActIoR.dtl_peg_no(slsActDtlR.dtl_peg_no());
				slsActIoR.io_peg_no(++_ioCnt);
				
				if (!isDel(ivGrpR)) {
					slsActIoR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					slsActIoR.setStatus(Status.CREATE);
				}
				else {
					slsActIoR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					slsActIoR.setStatus(Status.DELETE);
				}
				
				slsActIoL.add(slsActIoR);
			}
			
			if (ioL.size() > 0) {
				slsActDtlR.stk_mng_typ(ioL.get(0).stk_mng_typ());
			}
			
			return slsActIoL;
		}
		
		protected Map_SlsAct_Upd01_IoR_SlsAct_Upd02_IoLR<SlsAct_Upd01_IoR,SlsAct_Upd02_IoLR> createMap_SlsAct_Upd01_IoR_SlsAct_Upd02_IoLR() {
			return new Map_SlsAct_Upd01_IoR_SlsAct_Upd02_IoLR<SlsAct_Upd01_IoR, SlsAct_Upd02_IoLR>();
		}
		
		public class Map_SlsAct_Upd01_IoR_SlsAct_Upd02_IoLR<D extends SlsAct_Upd01_IoR, S extends SlsAct_Upd02_IoLR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_no, SlsAct_Upd02_IoLR.$sls_act_io_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_seq, SlsAct_Upd02_IoLR.$sls_act_io_seq);
				addColumnPathMap(SlsAct_Upd01_IoR.$ship_act_d_no, SlsAct_Upd02_IoLR.$ship_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$iv_ship_act_d_no, SlsAct_Upd02_IoLR.$iv_ship_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno1, SlsAct_Upd02_IoLR.$sno1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno2, SlsAct_Upd02_IoLR.$sno2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno3, SlsAct_Upd02_IoLR.$sno3);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno4, SlsAct_Upd02_IoLR.$sno4);
				addColumnPathMap(SlsAct_Upd01_IoR.$gd_cd, SlsAct_Upd02_IoLR.$gd_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$loc_cd, SlsAct_Upd02_IoLR.$loc_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$str_ln_cd, SlsAct_Upd02_IoLR.$str_ln_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$lot_no, SlsAct_Upd02_IoLR.$lot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sublot_no, SlsAct_Upd02_IoLR.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_cd, SlsAct_Upd02_IoLR.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_qty, SlsAct_Upd02_IoLR.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_cd, SlsAct_Upd02_IoLR.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_qty, SlsAct_Upd02_IoLR.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_cd, SlsAct_Upd02_IoLR.$pack_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_qty, SlsAct_Upd02_IoLR.$pack_unit_qty);
				
			}
		}
		
		protected int _ioCnt = 0;
		
		protected Map_SlsAct_Upd01_IoR_SlsAct_Upd01_DtlR<SlsAct_Upd01_IoR,SlsAct_Upd01_DtlR> createMap_SlsAct_Upd01_IoR_SlsAct_Upd01_DtlR() {
			return new Map_SlsAct_Upd01_IoR_SlsAct_Upd01_DtlR<SlsAct_Upd01_IoR, SlsAct_Upd01_DtlR>();
		}
		
		public class Map_SlsAct_Upd01_IoR_SlsAct_Upd01_DtlR<D extends SlsAct_Upd01_IoR, S extends SlsAct_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_IoR.$hdr_peg_no, SlsAct_Upd01_DtlR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$dtl_peg_no, SlsAct_Upd01_DtlR.$dtl_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$data_crud_typ, SlsAct_Upd01_DtlR.$data_crud_typ);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno1, SlsAct_Upd01_DtlR.$sno1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno2, SlsAct_Upd01_DtlR.$sno2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno3, SlsAct_Upd01_DtlR.$sno3);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno4, SlsAct_Upd01_DtlR.$sno4);
				addColumnPathMap(SlsAct_Upd01_IoR.$gd_cd, SlsAct_Upd01_DtlR.$gd_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$loc_cd, SlsAct_Upd01_DtlR.$loc_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$str_ln_cd, SlsAct_Upd01_DtlR.$str_ln_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$lot_no, SlsAct_Upd01_DtlR.$lot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sublot_no, SlsAct_Upd01_DtlR.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_cd, SlsAct_Upd01_DtlR.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_qty, SlsAct_Upd01_DtlR.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_cd, SlsAct_Upd01_DtlR.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_qty, SlsAct_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_schd_abort_flg, SlsAct_Upd01_DtlR.$sls_schd_abort_flg);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char1, SlsAct_Upd01_DtlR.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char2, SlsAct_Upd01_DtlR.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char3, SlsAct_Upd01_DtlR.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_IoR.$new_hdr_peg_no, SlsAct_Upd01_DtlR.$new_hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_d_no, SlsAct_Upd01_DtlR.$sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_d_seq, SlsAct_Upd01_DtlR.$sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_cur_upri, SlsAct_Upd01_DtlR.$trd_cur_upri);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_cur_amt, SlsAct_Upd01_DtlR.$trd_cur_amt);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_cur_dscnt_amt, SlsAct_Upd01_DtlR.$trd_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_cur_tax_amt, SlsAct_Upd01_DtlR.$trd_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_cur_upri, SlsAct_Upd01_DtlR.$base_cur_upri);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_cur_amt, SlsAct_Upd01_DtlR.$base_cur_amt);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_cur_dscnt_amt, SlsAct_Upd01_DtlR.$base_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_cur_tax_amt, SlsAct_Upd01_DtlR.$base_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_IoR.$ptax_cur_upri, SlsAct_Upd01_DtlR.$ptax_cur_upri);
				addColumnPathMap(SlsAct_Upd01_IoR.$ptax_cur_amt, SlsAct_Upd01_DtlR.$ptax_cur_amt);
				addColumnPathMap(SlsAct_Upd01_IoR.$ptax_cur_dscnt_amt, SlsAct_Upd01_DtlR.$ptax_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_IoR.$ptax_cur_tax_amt, SlsAct_Upd01_DtlR.$ptax_cur_tax_amt);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (isNull(src.lot_no())) {
					dest.lot_no(MAC_STR.NULL_VAL.value());
					dest.sublot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					addColumnPathMap(SlsAct_Upd01_IoR.$lot_no, SlsAct_Upd01_DtlR.$lot_no);
				}
				if (isNull(src.sublot_no())) {
					dest.sublot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					addColumnPathMap(SlsAct_Upd01_IoR.$sublot_no, SlsAct_Upd01_DtlR.$sublot_no);
				}
				dest.io_peg_no(++_ioCnt);
			}
		}
		
		protected Map_SlsAct_Upd01_DtlR_SlsAct_Upd02_IvLR<SlsAct_Upd01_DtlR,SlsAct_Upd02_IvLR> createMap_SlsAct_Upd01_DtlR_SlsAct_Upd02_IvLR() {
			return new Map_SlsAct_Upd01_DtlR_SlsAct_Upd02_IvLR<SlsAct_Upd01_DtlR, SlsAct_Upd02_IvLR>();
		}
		
		public class Map_SlsAct_Upd01_DtlR_SlsAct_Upd02_IvLR<D extends SlsAct_Upd01_DtlR, S extends SlsAct_Upd02_IvLR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_no, SlsAct_Upd02_IvLR.$sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_seq, SlsAct_Upd02_IvLR.$sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cd, SlsAct_Upd02_IvLR.$dlv_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_sundry_flg, SlsAct_Upd02_IvLR.$dlv_sundry_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_nm, SlsAct_Upd02_IvLR.$dlv_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_zip_cd, SlsAct_Upd02_IvLR.$dlv_zip_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr1, SlsAct_Upd02_IvLR.$dlv_addr1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr2, SlsAct_Upd02_IvLR.$dlv_addr2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr3, SlsAct_Upd02_IvLR.$dlv_addr3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr4, SlsAct_Upd02_IvLR.$dlv_addr4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_dpt, SlsAct_Upd02_IvLR.$dlv_cntct_dpt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_psn, SlsAct_Upd02_IvLR.$dlv_cntct_psn);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_tel, SlsAct_Upd02_IvLR.$dlv_tel);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_fax, SlsAct_Upd02_IvLR.$dlv_fax);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd1, SlsAct_Upd02_IvLR.$dest_cd1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd2, SlsAct_Upd02_IvLR.$dest_cd2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd3, SlsAct_Upd02_IvLR.$dest_cd3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cd, SlsAct_Upd02_IvLR.$tdlv_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_nm, SlsAct_Upd02_IvLR.$tdlv_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_sundry_flg, SlsAct_Upd02_IvLR.$tdlv_sundry_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_zip_cd, SlsAct_Upd02_IvLR.$tdlv_zip_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr1, SlsAct_Upd02_IvLR.$tdlv_addr1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr2, SlsAct_Upd02_IvLR.$tdlv_addr2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr3, SlsAct_Upd02_IvLR.$tdlv_addr3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr4, SlsAct_Upd02_IvLR.$tdlv_addr4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_tel, SlsAct_Upd02_IvLR.$tdlv_tel);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_fax, SlsAct_Upd02_IvLR.$tdlv_fax);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cntct_dpt, SlsAct_Upd02_IvLR.$tdlv_cntct_dpt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cntct_psn, SlsAct_Upd02_IvLR.$tdlv_cntct_psn);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_cd, SlsAct_Upd02_IvLR.$itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub1, SlsAct_Upd02_IvLR.$itm_sub1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub2, SlsAct_Upd02_IvLR.$itm_sub2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub3, SlsAct_Upd02_IvLR.$itm_sub3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1, SlsAct_Upd02_IvLR.$sno1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2, SlsAct_Upd02_IvLR.$sno2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3, SlsAct_Upd02_IvLR.$sno3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4, SlsAct_Upd02_IvLR.$sno4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cntry_org_cd, SlsAct_Upd02_IvLR.$cntry_org_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_cd, SlsAct_Upd02_IvLR.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_qty, SlsAct_Upd02_IvLR.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_cd, SlsAct_Upd02_IvLR.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_qty, SlsAct_Upd02_IvLR.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_upri, SlsAct_Upd02_IvLR.$trd_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$inc_tax_flg, SlsAct_Upd02_IvLR.$inc_tax_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_rate, SlsAct_Upd02_IvLR.$tax_rate);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_typ, SlsAct_Upd02_IvLR.$tax_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cost_upri, SlsAct_Upd02_IvLR.$cost_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cost_amt, SlsAct_Upd02_IvLR.$cost_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_dscnt_amt, SlsAct_Upd02_IvLR.$trd_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bill_crryovr_times, SlsAct_Upd02_IvLR.$bill_crryovr_times);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sundry_itm_flg, SlsAct_Upd02_IvLR.$sundry_itm_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1_mng_typ, SlsAct_Upd02_IvLR.$sno1_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2_mng_typ, SlsAct_Upd02_IvLR.$sno2_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3_mng_typ, SlsAct_Upd02_IvLR.$sno3_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4_mng_typ, SlsAct_Upd02_IvLR.$sno4_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_jnl_cd, SlsAct_Upd02_IvLR.$itm_jnl_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_po_d_no, SlsAct_Upd02_IvLR.$cst_po_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_cd, SlsAct_Upd02_IvLR.$cst_itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_nm, SlsAct_Upd02_IvLR.$cst_itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_d_rmrks, SlsAct_Upd02_IvLR.$trd_d_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$rsn_cd, SlsAct_Upd02_IvLR.$rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bd_dpt_cd, SlsAct_Upd02_IvLR.$bd_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_rate, SlsAct_Upd02_IvLR.$wtax_rate);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_no, SlsAct_Upd02_IvLR.$slo_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_d_no, SlsAct_Upd02_IvLR.$slo_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_schd_no, SlsAct_Upd02_IvLR.$ship_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_schd_no, SlsAct_Upd02_IvLR.$sls_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_no, SlsAct_Upd02_IvLR.$qtn_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_rev, SlsAct_Upd02_IvLR.$qtn_rev);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_d_no, SlsAct_Upd02_IvLR.$qtn_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$iv_d_no, SlsAct_Upd02_IvLR.$iv_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dscnt_rsn_cd, SlsAct_Upd02_IvLR.$dscnt_rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_no, SlsAct_Upd02_IvLR.$sls_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_seq, SlsAct_Upd02_IvLR.$sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_cd, SlsAct_Upd02_IvLR.$tax_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$interim_flg, SlsAct_Upd02_IvLR.$interim_flg);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (src.sundry_itm_flg()) {
					dest.itm_nm(src.itm_nm());
					dest.iv_itm_nm(src.iv_itm_nm());
				}
				
				if (src.dlv_sundry_flg()) {
					dest.dlv_nm(src.dlv_nm());
				}
			}
		}
		
		protected Map_SlsAct_Upd01_HdrR_SlsAct_Upd02_IvLR<SlsAct_Upd01_HdrR,SlsAct_Upd02_IvLR> createMap_SlsAct_Upd01_HdrR_SlsAct_Upd02_IvLR() {
			return new Map_SlsAct_Upd01_HdrR_SlsAct_Upd02_IvLR<SlsAct_Upd01_HdrR, SlsAct_Upd02_IvLR>();
		}
		
		public class Map_SlsAct_Upd01_HdrR_SlsAct_Upd02_IvLR<D extends SlsAct_Upd01_HdrR, S extends SlsAct_Upd02_IvLR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_no, SlsAct_Upd02_IvLR.$sls_act_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_seq, SlsAct_Upd02_IvLR.$sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cd, SlsAct_Upd02_IvLR.$trd_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_ptn_typ, SlsAct_Upd02_IvLR.$trd_ptn_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ac_dt, SlsAct_Upd02_IvLR.$ac_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dt, SlsAct_Upd02_IvLR.$sls_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_usr_cd, SlsAct_Upd02_IvLR.$sls_usr_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dpt_cd, SlsAct_Upd02_IvLR.$sls_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$wg_cd, SlsAct_Upd02_IvLR.$wg_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$eta_dt, SlsAct_Upd02_IvLR.$eta_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_cd, SlsAct_Upd02_IvLR.$cst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$iv_no, SlsAct_Upd02_IvLR.$iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcpt_iv_mng_no, SlsAct_Upd02_IvLR.$rcpt_iv_mng_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcpt_iv_no, SlsAct_Upd02_IvLR.$rcpt_iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd1, SlsAct_Upd02_IvLR.$tterm_cd1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks1, SlsAct_Upd02_IvLR.$tterm_rmrks1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd2, SlsAct_Upd02_IvLR.$tterm_cd2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks2, SlsAct_Upd02_IvLR.$tterm_rmrks2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd3, SlsAct_Upd02_IvLR.$tterm_cd3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks3, SlsAct_Upd02_IvLR.$tterm_rmrks3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_no, SlsAct_Upd02_IvLR.$lc_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_dt, SlsAct_Upd02_IvLR.$lc_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_rmrks, SlsAct_Upd02_IvLR.$lc_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcv_schd_dt, SlsAct_Upd02_IvLR.$rcv_schd_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bill_basis_dt, SlsAct_Upd02_IvLR.$bill_basis_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cred_cd, SlsAct_Upd02_IvLR.$cred_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bcst_cd, SlsAct_Upd02_IvLR.$bcst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$acst_cd, SlsAct_Upd02_IvLR.$acst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ar_dpt_cd, SlsAct_Upd02_IvLR.$ar_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_po_no, SlsAct_Upd02_IvLR.$cst_po_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cur_cd, SlsAct_Upd02_IvLR.$trd_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$base_cur_cd, SlsAct_Upd02_IvLR.$base_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate_cd, SlsAct_Upd02_IvLR.$xrate_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate, SlsAct_Upd02_IvLR.$xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_cur_cd, SlsAct_Upd02_IvLR.$ptax_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_xrate, SlsAct_Upd02_IvLR.$ptax_xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_rmrks, SlsAct_Upd02_IvLR.$trd_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$slo_no, SlsAct_Upd02_IvLR.$slo_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_no, SlsAct_Upd02_IvLR.$qtn_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_rev, SlsAct_Upd02_IvLR.$qtn_rev);
				
			}
		}
		
		protected void throwDptErr() {
			MCAppException ex = new MCAppException(MCMessagePool.getMessageList().get(0));
			MCMessagePool.removeAll(MCMessagePool.getMessageList());
			throw ex;
		}
		
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _cacheItmUnit;
		
		/**
		 * 取引先マスタの取得
		 */
		protected MAM_BP_R getCstCache(String cst_cd) {
			return _cacheBp.get(cst_cd);
		}
		
		/**
		 * 品目単位マスタの取得
		 */
		protected MAVM_ITM_UNIT_R getItmUnitCache(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, String unit_cd) {
			return _cacheItmUnit.get(itm_cd, itm_sub1, itm_sub2, itm_sub3, unit_cd);
		}
		
		protected void initCstCache(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			_cacheBp = null;
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(MCQueryApiBuilder.create(MAM_BP_R.create("T")), accptRecvIfL, AccptRecvIf_Chk01_DtlR.$cst_cd);
		}
		
		protected void initItmUnitCache(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			_cacheItmUnit = null;
			_cacheItmUnit = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")), accptRecvIfL, AccptRecvIf_Chk01_DtlR.$itm_cd, AccptRecvIf_Chk01_DtlR.$itm_sub1, AccptRecvIf_Chk01_DtlR.$itm_sub2, AccptRecvIf_Chk01_DtlR.$itm_sub3, AccptRecvIf_Chk01_DtlR.$trd_unit_cd);
		}
		
		
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			
			sortDtl(up0());
			
			msgL.addAll(chkReq(up0()));
			
			return msgL;
		}
		
		/**
		 * 処理対象の明細をソートする。
		 * 
		 * @param accptRecvIfL 検収受信ＩＦリスト
		 */
		protected void sortDtl(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			
			accptRecvIfL.sort(
					AccptRecvIf_Chk01_DtlR.$cst_cd,
					AccptRecvIf_Chk01_DtlR.$dlv_slip_no,
					AccptRecvIf_Chk01_DtlR.$dlv_slip_d_no,
					AccptRecvIf_Chk01_DtlR.$cst_po_no,
					AccptRecvIf_Chk01_DtlR.$cst_po_d_no,
					AccptRecvIf_Chk01_DtlR.$iv_flg,
					AccptRecvIf_Chk01_DtlR.$data_lno);
		}
		
		/**
		 * 条件付き必須チェックを行う。
		 * 
		 * @param accptRecvIfL 検収受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkReq(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (AccptRecvIf_Chk01_DtlR accptRecvIfR : accptRecvIfL) {
				if (accptRecvIfR.accpt_dfct_flg()) {
					continue;
				}
				if (isCrt(accptRecvIfR) || isUpd(accptRecvIfR)) {
					msgL.addAll(check(accptRecvIfR, AccptRecvIf_Chk01_DtlR.$cst_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(accptRecvIfR, AccptRecvIf_Chk01_DtlR.$trd_unit_qty, new FXUCL_RequiredValidater()));
					if (!accptRecvIfR.tax_not_chk_flg() && !isTaxInfoNull(accptRecvIfR)) {
						msgL.addAll(check(accptRecvIfR, AccptRecvIf_Chk01_DtlR.$tax_typ, new FXUCL_RequiredValidater()));
						msgL.addAll(check(accptRecvIfR, AccptRecvIf_Chk01_DtlR.$tax_rate, new FXUCL_RequiredValidater()));
					}
				}
				
				if (isNull(accptRecvIfR.dlv_slip_no()) && isNull(accptRecvIfR.cst_po_no())) {
					msgL.add(new MCMessage(accptRecvIfR, null, MSLAL0458,
							accptRecvIfR.data_no(), accptRecvIfR.data_lno(),
							accptRecvIfR.cst_cd()));
					accptRecvIfR.err_flg(true);
				}
			}
			
			return msgL;
		}
		
		protected boolean isTaxInfoNull(AccptRecvIf_Chk01_DtlR accptRecvIfR) {
			return isNull(accptRecvIfR.tax_typ()) && isNull(accptRecvIfR.tax_rate()) && !accptRecvIfR.inc_tax_flg();
		}
		
		/**
		 * 指定された検収受信ＩＦが新規かどうか。
		 * 
		 * @param accptRecvIfR 検収受信ＩＦ
		 * @return　新規の場合はtrue
		 */
		protected boolean isCrt(AccptRecvIf_Chk01_DtlR accptRecvIfR) {
			
			return MAC_DATA_CRUD_TYP.isCRT(accptRecvIfR.data_crud_typ());
		}
		
		/**
		 * 指定された検収受信ＩＦが更新かどうか。
		 * 
		 * @param accptRecvIfR 検収受信ＩＦ
		 * @return　更新の場合はtrue
		 */
		protected boolean isUpd(AccptRecvIf_Chk01_DtlR accptRecvIfR) {
			
			return MAC_DATA_CRUD_TYP.isUPD(accptRecvIfR.data_crud_typ());
		}
		
		/**
		 * 指定された検収受信ＩＦが取消かどうか。
		 * 
		 * @param accptRecvIfR 検収受信ＩＦ
		 * @return　取消の場合はtrue
		 */
		protected boolean isDel(AccptRecvIf_Chk01_DtlR accptRecvIfR) {
			
			return MAC_DATA_CRUD_TYP.isDEL(accptRecvIfR.data_crud_typ());
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			
			MCMessageList msgL = super.doServerCheckSub();
			MSBDL_PurcActRegService.Purc_Chk03 opeIns = MSBDL_PurcActRegService.crtPurc_Chk03();
			MSBDL_PurcActRegService.Purc_Chk03 opeDel = MSBDL_PurcActRegService.crtPurc_Chk03();
			MSBDL_PurcActRegService.Purc_Chk03 opeUpd = MSBDL_PurcActRegService.crtPurc_Chk03();
			MSBDL_PurcActRegService.Purc_Chk03 opeAll = MSBDL_PurcActRegService.crtPurc_Chk03();
			MSBEL_ExActService.ExAct_Chk02 exOpe = MSBEL_ExActService.crtExAct_Chk02();
			
			sortUp0(up0());
			
			// 取消対象の売上実績存在チェック＆打切未解除取消チェック
			msgL.addAll(existSlsActChk(up0()));
			
			// 新規対象で同一外部仕入実績明細ＮＯ存在チェック
			msgL.addAll(existExtPurcActDCrtChk(up0()));
			
			// 同一処理グループ内で同一処理区分での同一外部仕入実績明細ＮＯ存在チェック
			msgL.addAll(dplExtPurcActDChk(up0()));
			
			// 補完
			msgL.addAll(complChk(up0()));
			
			// 売上計上区分チェック
			msgL.addAll(slsBasisChk(up0()));
			
			msgL.addAll(chkShipAcDtAcDt(up0()));
			
			// 入金予定日チェック
			msgL.addAll(rcvSchdDtChk(up0()));
			
			// 売上禁止チェック
			msgL.addAll(slsStopChk(up0()));

			msgL.addAll(chkForCred(up0()));
			
			msgL.addAll(chkTax(up0()));
			
			// 元情報との相違チェック
			msgL.addAll(baseDataChk(up0()));
			
			// 仕入済チェック
			msgL.addAll(purcCmplChk(up0()));
			
			msgL.addAll(chkTaxAmt(up0()));
			
			// インボイス明細件数チェック
			msgL.addAll(ivCntChk(up0()));
			
			// 数量関連チェック
			msgL.addAll(qtyChk(up0()));
			
			// ロットＮＯ発番処理
			msgL.addAll(setLotNo(up0()));
			
			// 仕入実績サービス呼出電文作成
			opeDel = makePurcActRegSvChk03Del(up0());
			opeUpd = makePurcActRegSvChk03Upd(up0(), opeDel.up0().size());
			opeIns = makePurcActRegSvChk03(up0(), opeDel.up0().size() + opeUpd.up0().size());
			msgL.addAll(ddlvTgtChk(up0()));
			
			// 削除・訂正・取消で作った電文をまとめる
			opeAll.up0().addAll(opeDel.up0());
			opeAll.up1().addAll(opeDel.up1());
			opeAll.up2().addAll(opeDel.up2());
			opeAll.up0().addAll(opeUpd.up0());
			opeAll.up1().addAll(opeUpd.up1());
			opeAll.up2().addAll(opeUpd.up2());
			opeAll.up0().addAll(opeIns.up0());
			opeAll.up1().addAll(opeIns.up1());
			opeAll.up2().addAll(opeIns.up2());
			
			// 仕入実績登録チェックサービス呼出
			callPurcActRegSvChk03(opeAll);
			
			// 輸出実績サービス：インボイス更新前チェック呼出電文作成
			exOpe = makeExActSvChk02(up0());
			
			// 輸出実績サービス：インボイス更新前チェック呼出
			callExActSvChk02(exOpe);
				
			return msgL;
		}
		
		/**
		 * 税額のチェック処理
		 * 
		 * @param accptRecvIfL
		 * @return
		 */
		protected MCMessageList chkTaxAmt(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			for (AccptRecvIf_Chk01_DtlR accptRecvIfR : accptRecvIfL) {
				if (isDel(accptRecvIfR) || accptRecvIfR.err_flg() || accptRecvIfR.accpt_dfct_flg()) {
					continue;
				}
				MCRow amtR = getAmtAndTax(accptRecvIfR, nvl(accptRecvIfR.fix_trd_cur_dscnt_amt(), accptRecvIfR.trd_cur_dscnt_amt()));
				MCNumber mstTaxAmt = amtR.getNumberNE("tax_amt");
				if (!accptRecvIfR.tax_not_chk_flg()) {
					if (!isNull(accptRecvIfR.trd_cur_tax_amt()) && !isSame(accptRecvIfR.trd_cur_tax_amt(), mstTaxAmt)) {
						msgL.add(new MCMessage(accptRecvIfR, null, MSLAL0459, accptRecvIfR.data_no(), accptRecvIfR.data_lno(), accptRecvIfR.trd_cur_tax_amt(), mstTaxAmt));
						accptRecvIfR.err_flg(true);
					}
				}
				accptRecvIfR.trd_cur_tax_amt(mstTaxAmt);
			}
			return msgL;
		}
		
		protected void setTaxCd(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			
			MCList<AccptRecvIf_Chk01_DtlR> newTaxAccptRecvIfL = srchValidSlsTaxCd(accptRecvIfL);
			
			MST_SLO_D_R tmpSloDR = MST_SLO_D_R.create();
			MST_IV_D_R tmpIvDR = MST_IV_D_R.create();
			MST_DLV_SLIP_D_R tmpDlvSlipDR = MST_DLV_SLIP_D_R.create();
			MCIndexKey sloDAllSloDNoIdxkey = getSloDAllSloDNoIdxkey();
			MCIndexKey pegNoIdxkey = newTaxAccptRecvIfL.createIndex(AccptRecvIf_Chk01_DtlR.$peg_no);
			for (AccptRecvIf_Chk01_DtlR accptRecvIfR : accptRecvIfL) {
				if (isDel(accptRecvIfR) || accptRecvIfR.err_flg() || accptRecvIfR.accpt_dfct_flg()) {
					continue;
				}
				
				AccptRecvIf_Chk01_DtlR newTaxAccptRecvIfR = newTaxAccptRecvIfL.getFirst(pegNoIdxkey, accptRecvIfR.peg_no());
				
				if (accptRecvIfR.iv_flg() && !isNull(accptRecvIfR.fix_dlv_slip_d_no())) {
					tmpIvDR = _ivDL.getFirst(_ivDIdxkey, accptRecvIfR.fix_dlv_slip_d_no());
					accptRecvIfR.org_tax_cd(tmpIvDR.tax_cd());
					accptRecvIfR.fix_tax_cd(tmpIvDR.tax_cd());
				}
				else {
					if (isNull(accptRecvIfR.fix_slo_d_no())) {
						accptRecvIfR.fix_tax_cd(newTaxAccptRecvIfR.fix_tax_cd());
					}
					else {
						tmpSloDR = _sloDAllL.getFirst(sloDAllSloDNoIdxkey, accptRecvIfR.fix_slo_d_no());
						if (tmpSloDR.tax_fix_flg()) {
							accptRecvIfR.fix_tax_cd(tmpSloDR.tax_cd());
						}
						else {
							accptRecvIfR.fix_tax_cd(newTaxAccptRecvIfR.fix_tax_cd());
						}
					}
					if (accptRecvIfR.ddlvTgtFlg() && !isNull(accptRecvIfR.fix_slo_d_no())) {
						tmpSloDR = _sloDL.getFirst(_sloDSloDNoIdxkey, accptRecvIfR.fix_slo_d_no());
						accptRecvIfR.org_tax_cd(tmpSloDR.tax_cd());
					}
					else if (!isNull(accptRecvIfR.fix_dlv_slip_d_no())) {
						tmpDlvSlipDR = _dlvSlipDL.getFirst(_dlvSlipDIdxkey, accptRecvIfR.fix_dlv_slip_d_no());
						accptRecvIfR.org_tax_cd(tmpDlvSlipDR.tax_cd());
					}
				}
			}
			initOrgTaxCache(accptRecvIfL);
		}
		
		protected MCList<AccptRecvIf_Chk01_DtlR> srchValidSlsTaxCd(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			
			MCList<AccptRecvIf_Chk01_DtlR> newTaxAccptRecvIfL = accptRecvIfL.clone();
			String[] key = new String[]{
					AccptRecvIf_Chk01_DtlR.$itm_cd,
					AccptRecvIf_Chk01_DtlR.$itm_sub1,
					AccptRecvIf_Chk01_DtlR.$itm_sub2,
					AccptRecvIf_Chk01_DtlR.$itm_sub3,
					AccptRecvIf_Chk01_DtlR.$cst_cd,
					"baseDt"};

			newTaxAccptRecvIfL.addDateColumn("baseDt");
			for (AccptRecvIf_Chk01_DtlR newTaxAccptRecvIfR : newTaxAccptRecvIfL) {
				MST_SLS_ACT_D_R updSlsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, newTaxAccptRecvIfR.ext_purc_act_d_no(), newTaxAccptRecvIfR.ext_sys_cd());
				if (!isNull(updSlsActDR)) {
					MST_SLS_ACT_R updSlsActR = _slsActL.getFirst(_slsActIdxkey, updSlsActDR.sls_act_no());
					if (!isNull(updSlsActR)) {
						newTaxAccptRecvIfR.setDate("baseDt", updSlsActR.sls_dt());
					}
					else {
						newTaxAccptRecvIfR.setDate("baseDt", getToday());
					}
				}
				else {
					newTaxAccptRecvIfR.setDate("baseDt", getToday());
				}
			}

			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_SLS_TAX_CD", "01"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_SLS_TAX_CD"),
					AccptRecvIf_Chk01_DtlR.$fix_tax_cd, newTaxAccptRecvIfL, key);
			
			return newTaxAccptRecvIfL;
		}
		
		/**
		 * 同一処理グループ内でのソート処理
		 */
		protected void sortUp0(MCList<AccptRecvIf_Chk01_DtlR> up0) {
			MCList<AccptRecvIf_Chk01_DtlR> tmpUp0Del = MCList.create(AccptRecvIf_Chk01_DtlR.class);
			MCList<AccptRecvIf_Chk01_DtlR> tmpUp0Upd = MCList.create(AccptRecvIf_Chk01_DtlR.class);
			MCList<AccptRecvIf_Chk01_DtlR> tmpUp0Ins = MCList.create(AccptRecvIf_Chk01_DtlR.class);
			MCList<AccptRecvIf_Chk01_DtlR> tmpUp0ALL = MCList.create(AccptRecvIf_Chk01_DtlR.class);
			for (AccptRecvIf_Chk01_DtlR up0R : up0) {
				if (MAC_DATA_CRUD_TYP.isDEL(up0R.data_crud_typ())) {
					tmpUp0Del.add(up0R);
				}
				else if (MAC_DATA_CRUD_TYP.isCRT(up0R.data_crud_typ())) {
					tmpUp0Ins.add(up0R);
				}
				else {
					MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, up0R.ext_purc_act_d_no(), up0R.ext_sys_cd());
					if (!isNull(slsActDR)) {
						tmpUp0Upd.add(up0R);
					}
					else {
						tmpUp0Ins.add(up0R);
					}
				}
			}
			tmpUp0ALL.addAll(tmpUp0Del);
			tmpUp0ALL.addAll(tmpUp0Upd);
			tmpUp0ALL.addAll(tmpUp0Ins);
			up0.clear();
			up0.addAll(tmpUp0ALL);
		}
		
		/**
		 * 輸出実績サービス呼出
		 */
		protected void callExActSvChk02(MSBEL_ExActService.ExAct_Chk02 ope) {
			if (!ope.up0().isEmpty()) {
				ope.exec();
				copyErrFlg(up0(), ope.down0());
			}
		}
		
		/**
		 * 輸出実績サービス呼出電文作成
		 */
		protected MSBEL_ExActService.ExAct_Chk02 makeExActSvChk02(MCList<AccptRecvIf_Chk01_DtlR> chkL) {
			MSBEL_ExActService.ExAct_Chk02 ope = MSBEL_ExActService.crtExAct_Chk02();
			ExAct_Upd02_DtlR oUp0;
			MCList<AccptRecvIf_Chk01_DtlR> ivGrL = chkL.groupBy(
					AccptRecvIf_Chk01_DtlR.$err_flg,
					AccptRecvIf_Chk01_DtlR.$data_crud_typ,
					AccptRecvIf_Chk01_DtlR.$ivDdlvTgtFlg,
					AccptRecvIf_Chk01_DtlR.$peg_no,
					AccptRecvIf_Chk01_DtlR.$iv_flg,
					AccptRecvIf_Chk01_DtlR.$dlv_slip_no,
					AccptRecvIf_Chk01_DtlR.$via_dlv_typ);
			for (AccptRecvIf_Chk01_DtlR chkR : ivGrL) {
				if (!chkR.err_flg() && chkR.iv_flg() && !isNullOrNullVal(chkR.dlv_slip_no()) && !MAC_VIA_DLV_TYP.isVIA(chkR.via_dlv_typ())) {
					oUp0 = ExAct_Upd02_DtlR.create();
					oUp0.peg_no(chkR.peg_no());
					oUp0.iv_no(chkR.dlv_slip_no());
					if (isDel(chkR)) {
						oUp0.cmpl_flg(false);
					}
					else {
						oUp0.cmpl_flg(true);
					}
					ope.up0().add(oUp0);
				}
			}
			
			return ope;
		}
		
		/**
		 * 	仕入実績登録チェックサービス呼出電文作成（取消用）
		 */
		protected MSBDL_PurcActRegService.Purc_Chk03 makePurcActRegSvChk03Del(MCList<AccptRecvIf_Chk01_DtlR> chkL) {
			MSBDL_PurcActRegService.Purc_Chk03 ope = MSBDL_PurcActRegService.crtPurc_Chk03();
			
			MCList<AccptRecvIf_Chk01_PurcActIoR> slsActIoL = null;
			Purc_Chk03_HdrR oUp0Del;
			Purc_Chk03_DtlR oUp1Del;
			Purc_Chk03_IoR oUp2Del;
			
			int purcPegNo = 0;
			for (AccptRecvIf_Chk01_DtlR chkR : chkL) {
				MCList<MST_SLS_ACT_D_R> slsActDL = _slsActDL.subList(_slsActDExtPurcDNoIdxkey, chkR.ext_purc_act_d_no(), chkR.ext_sys_cd());
				for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
					if (((isUpd(chkR) && chkR.accpt_dfct_flg()) || isDel(chkR)) && !isNull(slsActDR)) {
						MST_SLS_ACT_IO_R slsActIoR = _slsActIoL.getFirst(_slsActIoSyncIdxkey, true, slsActDR.sls_act_d_no());
						if (!isNull(slsActIoR)) {
							chkR.sync_flg(true);
							chkR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							break;
						}
					}
				}
				
				if (isNull(slsActDL) || chkR.err_flg() || !chkR.sync_flg() || isCrt(chkR) || (isUpd(chkR) && !chkR.accpt_dfct_flg())) {
					continue;
				}
				
				slsActIoL = MCList.create(AccptRecvIf_Chk01_PurcActIoR.class);
				// ヘッダ情報の設定
				executeQuery(slsActIoL, MSLAL5160_MST_SLS_ACT_D_S01(), chkR);
				boolean isSlsClose = callClChk(chkR.accpt_dt(), false);
				for (AccptRecvIf_Chk01_PurcActIoR slsActIoR : slsActIoL) {
					oUp0Del = ope.up0().createRow();
					oUp1Del = ope.up1().createRow();
					oUp2Del = ope.up2().createRow();
					
					copy(oUp0Del, slsActIoR, createMap_Purc_Chk03_HdrR_AccptRecvIf_Chk01_PurcActIoR());
					oUp0Del.peg_no(purcPegNo);
					oUp0Del.can_ac_dt(getFixDt(chkR.accpt_dt(), isSlsClose));
					ope.up0().add(oUp0Del);
					
					// 明細情報の設定
					copy(oUp1Del, slsActIoR, createMap_Purc_Chk03_DtlR_AccptRecvIf_Chk01_PurcActIoR());
					oUp1Del.hdr_peg_no(purcPegNo);
					oUp1Del.peg_no(purcPegNo);
					ope.up1().add(oUp1Del);
					
					// 詳細情報の設定
					copy(oUp2Del, slsActIoR, createMap_Purc_Chk03_IoR_AccptRecvIf_Chk01_PurcActIoR());
					oUp2Del.peg_no(purcPegNo);
					oUp2Del.dtl_peg_no(purcPegNo);
					ope.up2().add(oUp2Del);
					purcPegNo++;
				}
			}
			
			return ope;
		}
		
		/**
		 * 	仕入実績登録チェックサービス呼出電文作成（訂正用）
		 */
		protected MSBDL_PurcActRegService.Purc_Chk03 makePurcActRegSvChk03Upd(MCList<AccptRecvIf_Chk01_DtlR> chkL, int delSize) {
			MCIndexKey idxKey = chkL.createIndex(AccptRecvIf_Chk01_DtlR.$data_crud_typ, AccptRecvIf_Chk01_DtlR.$ext_purc_act_d_no, AccptRecvIf_Chk01_DtlR.$ext_sys_cd);
			
			MSBDL_PurcActRegService.Purc_Chk03 ope = MSBDL_PurcActRegService.crtPurc_Chk03();
			
			MCNumber updPegNo = new MCNumber(delSize);
			_slsActDL.setBooleanNE("use_flg", false);
			for (AccptRecvIf_Chk01_DtlR chkR : chkL) {
				MCList<MST_SLS_ACT_D_R> slsActDExtL = _slsActDL.subList(_slsActDExtPurcDNoIdxkey, chkR.ext_purc_act_d_no(), chkR.ext_sys_cd());
				if (slsActDExtL.size() == 1) {
					MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, chkR.ext_purc_act_d_no(), chkR.ext_sys_cd());
					if (isNull(slsActDR) || chkR.err_flg() || isDel(chkR) || !chkR.sync_flg() || (isUpd(chkR) && chkR.accpt_dfct_flg())) {
						continue;
					}
					boolean existFlg = false;
					MCList<MST_SLS_ACT_D_R> tmpSlsActDL = _slsActDL.subList(MST_SLS_ACT_D_R.$sls_act_no, slsActDR.sls_act_no());
					for (MST_SLS_ACT_D_R tmpSlsActDR : tmpSlsActDL) {
						if (tmpSlsActDR.getBooleanNE("use_flg")) {
							existFlg = true;
							break;
						}
					}
					
					slsActDR.setBooleanNE("use_flg", true);
					if (existFlg) {
						continue;
					}
					
					// 仕入実績登録サービス用電文作成
					updPegNo = crtUpdPurcChk03Ope(ope, updPegNo, slsActDR, chkL, chkR, idxKey, false);
				}
				else {
					slsActDExtL.sort(MST_SLS_ACT_D_R.$sls_act_no);
					for (MST_SLS_ACT_D_R slsActDR : slsActDExtL) {
						if (chkR.err_flg() || isDel(chkR) || !chkR.sync_flg() || (isUpd(chkR) && chkR.accpt_dfct_flg())) {
							continue;
						}
						
						boolean existFlg = false;
						MCList<MST_SLS_ACT_D_R> tmpSlsActDL = _slsActDL.subList(MST_SLS_ACT_D_R.$sls_act_no, slsActDR.sls_act_no());
						for (MST_SLS_ACT_D_R tmpSlsActDR : tmpSlsActDL) {
							if (tmpSlsActDR.getBooleanNE("use_flg")) {
								existFlg = true;
								break;
							}
						}
						
						slsActDR.setBooleanNE("use_flg", true);
						if (existFlg) {
							continue;
						}
						
						// 仕入実績登録サービス用電文作成
						updPegNo = crtUpdPurcChk03Ope(ope, updPegNo, slsActDR, chkL, chkR, idxKey, true);
					}
				}
			}
			for (AccptRecvIf_Chk01_DtlR chkR : chkL) { 
				// 訂正時数量割当
				setUpdQty(chkR, ope);
			}
			
			return ope;
		}
		
		/**
		 * 仕入実績登録サービス用電文作成（更新用）
		 */
		protected MCNumber crtUpdPurcChk03Ope(MSBDL_PurcActRegService.Purc_Chk03 ope,
				MCNumber updPegNo, MST_SLS_ACT_D_R slsActDR,
				MCList<AccptRecvIf_Chk01_DtlR> chkL, AccptRecvIf_Chk01_DtlR chkR,
				MCIndexKey idxKey, boolean mltFlg) {
			// 削除対象となった売上実績に紐づく同時計上の仕入直送を更新
			MCList<MST_SLS_ACT_D_R> slsActDL = _slsActDL.subList(_slsActDSlsActNoIdxkey, slsActDR.sls_act_no());
			slsActDL.addBooleanColumn("abort_flg");
			slsActDL.sort(MST_SLS_ACT_D_R.$sls_act_d_no);
			
			MCList<MST_SLS_SCHD_R> wkL = MCList.create(MST_SLS_SCHD_R.class);
			for (MST_SLS_ACT_D_R updTgtR : slsActDL) {
				MST_SLS_SCHD_R wkR = MST_SLS_SCHD_R.create();
				wkR.sls_schd_no(updTgtR.sls_schd_no());
				wkL.add(wkR);
			}
			
			if (wkL.isEmpty()) {
				return updPegNo;
			}
			
			initItmCache(chkL);
			
			MCList<Purc_Chk03_HdrR> oUp0L = MCList.create(Purc_Chk03_HdrR.class);
			oUp0L.addBooleanColumn("sppl_iv_flg");
			oUp0L.addBooleanColumn("pay_spot_flg");
			MCList<Purc_Chk03_DtlR> oUp1L = MCList.create(Purc_Chk03_DtlR.class);
			oUp1L.addNumberColumn("po_base_unit_qty");
			oUp1L.addStringColumn("purc_amt_rnd_typ");
			oUp1L.addStringColumn("ship_pr_loc_cd");
			oUp1L.addStringColumn("ship_pr_str_ln_cd");
			oUp1L.addStringColumn("pr_loc_wg_cd");
			MCIndexKey ikUp0 = null;
			MCIndexKey ikUp1 = null;
			
			if (!wkL.isEmpty()) {
				MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T"));
				dbWkDelete("MSLAL5160_MSW_SLS_SCHD_D01", wkL_bldr.getBaseDbc());
				dbWkInsert("MSLAL5160_MSW_SLS_SCHD_I01", wkL, wkL_bldr.getBaseDbc());
				
				MCRow row = MCRow.create();
				MST_SLS_ACT_R updSlsActR = _slsActL.getFirst(_slsActIdxkey, slsActDR.sls_act_no());
				row.addDateColumn("today", updSlsActR.sls_dt());
				
				executeQuery(oUp0L, MSLAL5160_MST_SLS_SCHD_S03(), row);
				executeQuery(oUp1L, MSLAL5160_MST_PO_D_S01(), row);
				
				ikUp0 = oUp0L.createIndex(MST_SLS_SCHD_R.$sls_schd_no);
				ikUp1 = oUp1L.createIndex(MST_SLS_SCHD_R.$sls_schd_no);
				
				dbWkDelete("MSLAL5160_MSW_SLS_SCHD_D02", wkL_bldr.getBaseDbc());
			}
			chkR.setBooleanNE("isSlsClose", callClChk(chkR.accpt_dt(), false));
			chkR.setBooleanNE("isPurcClose", callClChk(chkR.accpt_dt(), true));
			
			for (MST_SLS_ACT_D_R tmpSlsActDR : slsActDL) {
				MST_SLS_ACT_IO_R slsActIoR = _slsActIoL.getFirst(_slsActIoSyncIdxkey, true, tmpSlsActDR.sls_act_d_no());
				if (!isNull(slsActIoR)) {
					AccptRecvIf_Chk01_DtlR tmpDelChkR = chkL.getFirst(idxKey, MAC_DATA_CRUD_TYP.DEL.value(), tmpSlsActDR.ext_purc_act_d_no(), tmpSlsActDR.ext_sys_cd());
					if (!isNull(tmpDelChkR)) {
						if (isSame(chkR.ext_purc_act_d_no(), tmpDelChkR.ext_purc_act_d_no())) {
							chkR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						}
						continue;
					}
					if (!isSame(chkR.ext_purc_act_d_no(), tmpSlsActDR.ext_purc_act_d_no())) {
						AccptRecvIf_Chk01_DtlR tmpUpdChkR = chkL.getFirst(idxKey, MAC_DATA_CRUD_TYP.UPD.value(), tmpSlsActDR.ext_purc_act_d_no(), tmpSlsActDR.ext_sys_cd());
						if (!isNull(tmpUpdChkR)) {
							chkR = tmpUpdChkR;
						}
					}
					Purc_Chk03_HdrR tmpUp0 = oUp0L.getFirst(ikUp0, tmpSlsActDR.sls_schd_no());
					Purc_Chk03_DtlR tmpUp1 = oUp1L.getFirst(ikUp1, tmpSlsActDR.sls_schd_no());
					Purc_Chk03_HdrR oUp0 = ope.up0().createRow();
					Purc_Chk03_DtlR oUp1 = ope.up1().createRow();
					Purc_Chk03_IoR oUp2 = ope.up2().createRow();
					MCRow.copyall(oUp0, tmpUp0);
					MCRow.copyall(oUp1, tmpUp1);
					
					// ヘッダ情報の設定
					makePurcChkHdr(updPegNo, ope, tmpUp0, oUp0, chkR, tmpSlsActDR, mltFlg);
					
					// 明細情報の設定
					makePurcChkDtl(ope, oUp0, oUp1, chkL, chkR, tmpSlsActDR, idxKey, mltFlg);
					
					// 詳細情報の設定
					makePurcChkIo(ope, oUp0, oUp1, oUp2, chkR, tmpSlsActDR, slsActIoR);
					
					tmpSlsActDR.setNumberNE("upd_purc_peg_no", updPegNo);
					updPegNo = updPegNo.add(1);
				}
			}
			
			return updPegNo;
		}
		
		/**
		 * 仕入実績登録サービス用電文作成（更新用・ヘッダ部）
		 */
		protected void makePurcChkHdr(
				MCNumber updPegNo,
				MSBDL_PurcActRegService.Purc_Chk03 ope,
				Purc_Chk03_HdrR tmpUp0,
				Purc_Chk03_HdrR oUp0,
				AccptRecvIf_Chk01_DtlR chkR,
				MST_SLS_ACT_D_R tmpSlsActDR,
				boolean mltFlg) {
			// ヘッダ情報の設定
			copy(oUp0, tmpSlsActDR, chkR, createMap_Purc_Chk03_HdrR_MST_SLS_ACT_D_R());
			oUp0.setBooleanNE("mltFlg", mltFlg);
			oUp0.peg_no(updPegNo);
			if (tmpUp0.getBooleanNE("sppl_iv_flg")) {
				if (tmpUp0.getBooleanNE("pay_spot_flg")) {
					if (!isNull(chkR.rcv_schd_dt())) {
						oUp0.pay_schd_dt(chkR.rcv_schd_dt());
					}
					else {
						oUp0.pay_schd_dt(tmpUp0.pa().pay_schd_dt());
					}
					oUp0.pay_basis_dt(null);
				}
				else {
					oUp0.pay_basis_dt(tmpUp0.pa().pay_basis_dt());
				}
			}
			if (isSameExtPurcActNo(chkR, tmpSlsActDR)) {
				oUp0.setStringNE("extPurcActDNo", chkR.ext_purc_act_d_no());
			}
			else {
				oUp0.setStringNE("extPurcActDNo", tmpSlsActDR.ext_purc_act_d_no());
			}
			ope.up0().add(oUp0);
		}
		
		/**
		 * 仕入実績登録サービス用電文作成（更新用・詳細部）
		 */
		protected void makePurcChkIo(
				MSBDL_PurcActRegService.Purc_Chk03 ope,
				Purc_Chk03_HdrR oUp0,
				Purc_Chk03_DtlR oUp1,
				Purc_Chk03_IoR oUp2,
				AccptRecvIf_Chk01_DtlR chkR,
				MST_SLS_ACT_D_R tmpSlsActDR,
				MST_SLS_ACT_IO_R slsActIoR) {
			// 詳細情報の設定
			copy(oUp2, oUp1, createMap_Purc_Chk03_IoR_Purc_Chk03_DtlR_Upd());
			
			if (chkR.crt_lot_flg()) {
				oUp2.crt_lot_flg(true);
			}
			oUp2.dtl_peg_no(oUp1.peg_no());
			oUp2.peg_no(oUp2.dtl_peg_no());
			
			if (!oUp0.getBooleanNE("mltFlg")) {
				if (isPack(oUp1.itm_cd(), oUp1.itm_sub1(), oUp1.itm_sub2(), oUp1.itm_sub3(), oUp1.trd_unit_cd())){
					oUp2.pack_unit_cd(oUp1.trd_unit_cd());
					oUp2.pack_unit_qty(oUp1.trd_unit_qty());
				}
				else {
					oUp2.pack_unit_cd(oUp2.base_unit_cd());
					oUp2.pack_unit_qty(oUp2.base_unit_qty());
				}
			}
			
			oUp2.gi_loc_cd(oUp1.getStringNE("ship_pr_loc_cd"));
			oUp2.gi_str_ln_cd(oUp1.getStringNE("str_ln_cd"));
			oUp2.gi_wg_cd(oUp1.getStringNE("pr_loc_wg_cd"));
			oUp2.from_gd_cd(oUp1.gd_cd());
			oUp2.purc_act_io_no(slsActIoR.purc_act_io_no());
			oUp2.purc_act_io_seq(tmpSlsActDR.getNumberNE("purc_act_d_seq"));
			oUp2.purc_act_d_no(tmpSlsActDR.purc_act_d_no());
			oUp2.purc_act_d_seq(tmpSlsActDR.getNumberNE("purc_act_d_seq"));
			ope.up2().add(oUp2);
		}
		
		/**
		 * 仕入実績登録サービス用電文作成（更新用・明細部）
		 */
		protected void makePurcChkDtl(
				MSBDL_PurcActRegService.Purc_Chk03 ope,
				Purc_Chk03_HdrR oUp0,
				Purc_Chk03_DtlR oUp1,
				MCList<AccptRecvIf_Chk01_DtlR> chkL,
				AccptRecvIf_Chk01_DtlR chkR,
				MST_SLS_ACT_D_R tmpSlsActDR,
				MCIndexKey idxKey,
				boolean mltFlg) {
			// 明細情報の設定
			AccptRecvIf_Chk01_DtlR tmpChkR = chkL.getFirst(idxKey, MAC_DATA_CRUD_TYP.UPD.value(), tmpSlsActDR.ext_purc_act_d_no(), tmpSlsActDR.ext_sys_cd());
			copy(oUp1, tmpSlsActDR, createMap_Purc_Chk03_DtlR_MST_SLS_ACT_D_R());
			if (!isNull(tmpChkR)) {
				tmpSlsActDR.setBooleanNE("abort_flg", tmpChkR.abort_flg());
				if (!isNull(tmpChkR.trd_unit_cd())) {
					oUp1.trd_unit_cd(tmpChkR.trd_unit_cd());
				}
				if ( _slsSchdL.subList(MST_SLS_SCHD_R.$slo_d_no, tmpSlsActDR.slo_d_no()).size() == 1 ) {
					oUp1.trd_unit_qty(tmpChkR.trd_unit_qty());
					oUp0.setBooleanNE("mltFlg", false);
				}
				else {
					if (tmpChkR.sls_schd_mult_flg()) {
						oUp0.setBooleanNE("mltFlg", true);
					}
					else {
						if (isSame(tmpSlsActDR.ext_sys_cd(), tmpChkR.ext_sys_cd()) && isSame(tmpSlsActDR.ext_purc_act_d_no(), tmpChkR.ext_purc_act_d_no())) {
							oUp1.trd_unit_qty(tmpChkR.trd_unit_qty());
						}
						oUp0.setBooleanNE("mltFlg", false);
					}
				}
				oUp1.abort_flg(tmpChkR.abort_flg());
			}
			else {
				MST_SLS_SCHD_R slsSchdR = _slsSchdL.getFirst(_slsSchdNoIdxkey, tmpSlsActDR.sls_schd_no());
				tmpSlsActDR.setBooleanNE("abort_flg", slsSchdR.abort_flg());
				if (isSame(chkR.ext_sys_cd(), tmpSlsActDR.ext_sys_cd()) && isSame(chkR.ext_purc_act_d_no(), tmpSlsActDR.ext_purc_act_d_no())) {
					if (!isNull(chkR.trd_unit_cd())) {
						oUp1.trd_unit_cd(chkR.trd_unit_cd());
					}
					if (mltFlg == false) {
						oUp1.trd_unit_qty(chkR.trd_unit_qty());
					}
				}
				else {
					oUp0.setBooleanNE("mltFlg", false);
				}
				if (isSameExtPurcActNo(chkR, tmpSlsActDR)) {
					oUp1.abort_flg(chkR.abort_flg());
				}
			}
			
			MCList<MST_SLS_ACT_IO_R> slsIoL = _slsActIoL.subList(_slsActIoIdxkey, tmpSlsActDR.sls_act_d_no());
			
			if (slsIoL.groupBy(MST_SLS_ACT_IO_R.$lot_no).size() == 1) {
				if (isSameExtPurcActNo(chkR, tmpSlsActDR) && chkR.crt_lot_flg()) {
					oUp1.lot_no(chkR.lot_no());
				}
				else {
					oUp1.lot_no(slsIoL.get(0).lot_no());
				}
			}
			if (slsIoL.groupBy(MST_SLS_ACT_IO_R.$sublot_no).size() == 1) {
				if (isSameExtPurcActNo(chkR, tmpSlsActDR) && chkR.crt_lot_flg()) {
					oUp1.sublot_no(chkR.sublot_no());
				}
				else {
					oUp1.sublot_no(slsIoL.get(0).sublot_no());
				}
			}
			if (slsIoL.groupBy(MST_ARR_ACT_R.$ver_no).size() == 1) {
				oUp1.ver_no(slsIoL.get(0).getStringNE(MST_ARR_ACT_R.$ver_no));
			}
			if (slsIoL.groupBy(MST_ARR_ACT_R.$bp_lot_no).size() == 1) {
				oUp1.bp_lot_no(slsIoL.get(0).getStringNE(MST_ARR_ACT_R.$bp_lot_no));
			}
			if (slsIoL.groupBy(MST_ARR_ACT_R.$bp_dlv_slip_no).size() == 1) {
				oUp1.bp_dlv_slip_no(slsIoL.get(0).getStringNE(MST_ARR_ACT_R.$bp_dlv_slip_no));
			}
			if (slsIoL.groupBy(MST_ARR_ACT_R.$bp_dlv_slip_d_no).size() == 1) {
				oUp1.bp_dlv_slip_d_no(slsIoL.get(0).getStringNE(MST_ARR_ACT_R.$bp_dlv_slip_d_no));
			}
			if (slsIoL.groupBy(MST_ARR_ACT_R.$ship_fr_valid_dt).size() == 1) {
				oUp1.ship_fr_valid_dt(slsIoL.get(0).getDateNE(MST_ARR_ACT_R.$ship_fr_valid_dt));
			}
			
			oUp1.hdr_peg_no(oUp0.peg_no());
			oUp1.peg_no(oUp0.peg_no());
			
			if (!oUp0.getBooleanNE("mltFlg")) {
				// 基準単位数
				if (isSame(oUp1.trd_unit_cd(), oUp1.base_unit_cd())) {
					oUp1.base_unit_qty(oUp1.trd_unit_qty());
				}
				else {
					oUp1.base_unit_qty(getBaseUnitQty(
							oUp1.trd_unit_qty(),
							oUp1.trd_unit_cd(),
							oUp1.base_unit_cd(),
							oUp1.itm_cd(),
							oUp1.itm_sub1(),
							oUp1.itm_sub2(),
							oUp1.itm_sub3()));
				}
				
				// 取引通貨明細値引金額
				MAM_CUR_R trdCurR = getCur(chkR.trd_cur_cd());
				if (!isNull(oUp1.trd_cur_dscnt_amt())) {
					oUp1.trd_cur_dscnt_amt(
						oUp1.trd_cur_dscnt_amt().multiply(oUp1.base_unit_qty())
						.divide(oUp1.getNumberNE("po_base_unit_qty"), trdCurR.amt_dec_place().intValue(), MAC_RND_TYP.toMC(oUp1.getStringNE("purc_amt_rnd_typ")))
					);
				}
			}
			oUp1.setAttributes(chkR);
			ope.up1().add(oUp1);
		}
		/**
		 * IFデータと売上実績明細の外部仕入実績明細ＮＯが同一か判断
		 */
		protected boolean isSameExtPurcActNo(
				AccptRecvIf_Chk01_DtlR chkR,
				MST_SLS_ACT_D_R tmpSlsActDR) {
			if (isSame(chkR.ext_sys_cd(), tmpSlsActDR.ext_sys_cd()) && isSame(chkR.ext_purc_act_d_no(), tmpSlsActDR.ext_purc_act_d_no())) {
				return true;
			}
			return false;
		}
		
		/**
		 * 訂正時数量割当
		 */
		protected void setUpdQty(AccptRecvIf_Chk01_DtlR chkR, MSBDL_PurcActRegService.Purc_Chk03 ope) {
			// 訂正時の数量を割り当てていく。不足した仕入実績は削除扱いに変更する
			MCNumber chkQty = chkR.trd_unit_qty();
			int cnt = 0;
			String befSloDNo = null;
			ope.up0().sort("slo_d_no", "sls_schd_dt", "sls_schd_no");
			MCIndexKey up0Idx = ope.up0().createIndex(Purc_Chk03_HdrR.$data_crud_typ, "extPurcActDNo");
			for (Purc_Chk03_HdrR purcUp0R : ope.up0()) {
				if (!purcUp0R.getBooleanNE("mltFlg")) {
					continue;
				}
				if (!isSame(chkR.ext_purc_act_d_no(), purcUp0R.getStringNE("extPurcActDNo"))) {
					continue;
				}
				if (!isNull(chkR.fix_slo_d_no()) && !isSame(chkR.fix_slo_d_no(), purcUp0R.getStringNE("slo_d_no"))) {
					continue;
				}
				Purc_Chk03_DtlR purcUp1R = ope.up1().getFirst(Purc_Chk03_DtlR.$purc_act_no, purcUp0R.purc_act_no());
				Purc_Chk03_IoR purcUp2R = ope.up2().getFirst(Purc_Chk03_IoR.$purc_act_d_no, purcUp1R.purc_act_d_no());
				if (!isNull(befSloDNo) && !isSame(befSloDNo, purcUp0R.getStringNE("slo_d_no"))) {
					break;
				}
				befSloDNo = purcUp0R.getStringNE("slo_d_no");
				if (chkQty.isZero()) {
					purcUp0R.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					purcUp0R.setStatus(Status.DELETE);
					purcUp1R.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					purcUp1R.setStatus(Status.DELETE);
					purcUp2R.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					purcUp2R.setStatus(Status.DELETE);
					continue;
				}
				cnt++;
				
				if (chkQty.gt(purcUp1R.trd_unit_qty())) {
					chkQty = chkQty.subtract(purcUp1R.trd_unit_qty());
				}
				else {
					purcUp1R.trd_unit_qty(chkQty);
					purcUp2R.trd_unit_qty(purcUp1R.trd_unit_qty());
					chkQty = MCNumber.ZERO;
				}
				MCList<Purc_Chk03_HdrR> tmpUp0L = ope.up0().subList(up0Idx, MAC_DATA_CRUD_TYP.UPD.value(), chkR.ext_purc_act_d_no());
				if (!chkQty.isZero() && isSame(cnt, tmpUp0L.size())) {
					purcUp1R.trd_unit_qty(purcUp1R.trd_unit_qty().add(chkQty));
					purcUp2R.trd_unit_qty(purcUp1R.trd_unit_qty());
					chkQty = MCNumber.ZERO;
				}
				
				// 基準単位数
				if (isSame(purcUp1R.trd_unit_cd(), purcUp1R.base_unit_cd())) {
					purcUp1R.base_unit_qty(purcUp1R.trd_unit_qty());
					purcUp2R.base_unit_qty(purcUp1R.base_unit_qty());
				}
				else {
					purcUp1R.base_unit_qty(getBaseUnitQty(
							purcUp1R.trd_unit_qty(),
							purcUp1R.trd_unit_cd(),
							purcUp1R.base_unit_cd(),
							purcUp1R.itm_cd(),
							purcUp1R.itm_sub1(),
							purcUp1R.itm_sub2(),
							purcUp1R.itm_sub3()));
					purcUp2R.base_unit_qty(purcUp1R.base_unit_qty());
				}
				
				// 取引通貨明細値引金額
				MAM_CUR_R trdCurR = getCur(chkR.trd_cur_cd());
				if (!isNull(purcUp1R.trd_cur_dscnt_amt())) {
					purcUp1R.trd_cur_dscnt_amt(
							purcUp1R.trd_cur_dscnt_amt().divide(purcUp1R.getNumberNE("po_base_unit_qty"))
							.multiply(purcUp1R.base_unit_qty(), trdCurR.amt_dec_place().intValue(), MAC_RND_TYP.toMC(purcUp1R.getStringNE("purc_amt_rnd_typ")))
					);
				}
				
				if (isPack(purcUp1R.itm_cd(), purcUp1R.itm_sub1(), purcUp1R.itm_sub2(), purcUp1R.itm_sub3(), purcUp1R.trd_unit_cd())){
					purcUp2R.pack_unit_cd(purcUp1R.trd_unit_cd());
					purcUp2R.pack_unit_qty(purcUp1R.trd_unit_qty());
				}
				else {
					purcUp2R.pack_unit_cd(purcUp2R.base_unit_cd());
					purcUp2R.pack_unit_qty(purcUp2R.base_unit_qty());
				}
			}
			ope.up0().sort(Purc_Chk03_HdrR.$peg_no);
		}
		
		protected Map_Purc_Chk03_IoR_Purc_Chk03_DtlR_Upd<Purc_Chk03_IoR,Purc_Chk03_DtlR> createMap_Purc_Chk03_IoR_Purc_Chk03_DtlR_Upd() {
			return new Map_Purc_Chk03_IoR_Purc_Chk03_DtlR_Upd<Purc_Chk03_IoR, Purc_Chk03_DtlR>();
		}
		
		public class Map_Purc_Chk03_IoR_Purc_Chk03_DtlR_Upd<D extends Purc_Chk03_IoR, S extends Purc_Chk03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_IoR.$trd_unit_cd, Purc_Chk03_DtlR.$trd_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$trd_unit_qty, Purc_Chk03_DtlR.$trd_unit_qty);
				addColumnPathMap(Purc_Chk03_IoR.$base_unit_cd, Purc_Chk03_DtlR.$base_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$base_unit_qty, Purc_Chk03_DtlR.$base_unit_qty);
				addColumnPathMap(Purc_Chk03_IoR.$ver_no, Purc_Chk03_DtlR.$ver_no);
				addColumnPathMap(Purc_Chk03_IoR.$gd_cd, Purc_Chk03_DtlR.$gd_cd);
				addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_cd, Purc_Chk03_DtlR.$dlv_loc_cd);
				addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_wg_cd, Purc_Chk03_DtlR.$dlv_loc_wg_cd);
				addColumnPathMap(Purc_Chk03_IoR.$str_ln_cd, Purc_Chk03_DtlR.$str_ln_cd);
				addColumnPathMap(Purc_Chk03_IoR.$lot_no, Purc_Chk03_DtlR.$lot_no);
				addColumnPathMap(Purc_Chk03_IoR.$sublot_no, Purc_Chk03_DtlR.$sublot_no);
				addColumnPathMap(Purc_Chk03_IoR.$quality_typ, Purc_Chk03_DtlR.$quality_typ);
				addColumnPathMap(Purc_Chk03_IoR.$stk_insp_typ, Purc_Chk03_DtlR.$stk_insp_typ);
				addColumnPathMap(Purc_Chk03_IoR.$stk_id_typ, Purc_Chk03_DtlR.$stk_id_typ);
				addColumnPathMap(Purc_Chk03_IoR.$stk_bp_cd, Purc_Chk03_DtlR.$stk_bp_cd);
				addColumnPathMap(Purc_Chk03_IoR.$bp_lot_no, Purc_Chk03_DtlR.$bp_lot_no);
				addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_no, Purc_Chk03_DtlR.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_d_no, Purc_Chk03_DtlR.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Chk03_IoR.$ship_fr_valid_dt, Purc_Chk03_DtlR.$ship_fr_valid_dt);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				dest.setStatus(Status.MODIFY);
			}
		}
		
		protected Map_Purc_Chk03_DtlR_MST_SLS_ACT_D_R<Purc_Chk03_DtlR,MST_SLS_ACT_D_R> createMap_Purc_Chk03_DtlR_MST_SLS_ACT_D_R() {
			return new Map_Purc_Chk03_DtlR_MST_SLS_ACT_D_R<Purc_Chk03_DtlR, MST_SLS_ACT_D_R>();
		}

		public class Map_Purc_Chk03_DtlR_MST_SLS_ACT_D_R<D extends Purc_Chk03_DtlR, S extends MST_SLS_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_no, MST_SLS_ACT_D_R.$purc_act_d_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_no, MST_SLS_ACT_D_R.$purc_act_no);
				addColumnPathMap(Purc_Chk03_DtlR.$lot_no, MST_SLS_ACT_D_R.$lot_no);
				addColumnPathMap(Purc_Chk03_DtlR.$sublot_no, MST_SLS_ACT_D_R.$sublot_no);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_cd, MST_SLS_ACT_D_R.$trd_unit_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_qty, MST_SLS_ACT_D_R.$trd_unit_qty);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				dest.setStatus(Status.MODIFY);
				dest.purc_act_seq(src.getNumberNE("purc_act_seq"));
				dest.purc_act_d_seq(src.getNumberNE("purc_act_d_seq"));
				dest.ship_fr_valid_dt(src.getDateNE("ship_fr_valid_dt"));
				dest.ver_no(src.getStringNE("ver_no"));
				dest.bp_lot_no(src.getStringNE("bp_lot_no"));
				dest.bp_dlv_slip_no(src.getStringNE("bp_dlv_slip_no"));
				dest.bp_dlv_slip_d_no(src.getStringNE("bp_dlv_slip_d_no"));
				dest.abort_flg(src.getBooleanNE("abort_flg"));
				dest.disp_seq(1);
				dest.purc_id_typ(MAC_PURC_ID_TYP.PURC.value());
			}
		}
		
		protected Map_Purc_Chk03_HdrR_MST_SLS_ACT_D_R<Purc_Chk03_HdrR,MST_SLS_ACT_D_R,AccptRecvIf_Chk01_DtlR> createMap_Purc_Chk03_HdrR_MST_SLS_ACT_D_R() {
			return new Map_Purc_Chk03_HdrR_MST_SLS_ACT_D_R<Purc_Chk03_HdrR, MST_SLS_ACT_D_R, AccptRecvIf_Chk01_DtlR>();
		}

		public class Map_Purc_Chk03_HdrR_MST_SLS_ACT_D_R<D extends Purc_Chk03_HdrR, S extends MST_SLS_ACT_D_R, W extends AccptRecvIf_Chk01_DtlR> extends MAUCC_RowMapperWith<D,S,W>{
			protected W _ifR;
			
			@Override
			public void setWith(W ifR) {
				this._ifR = ifR;
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_HdrR.$purc_act_no, MST_SLS_ACT_D_R.$purc_act_no);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				dest.setStatus(Status.MODIFY);
				dest.purc_act_seq(src.getNumberNE("purc_act_seq"));
				MST_SLS_ACT_R updSlsActR = _slsActL.getFirst(_slsActIdxkey, src.sls_act_no());
				boolean isSlsClose = _ifR.getBooleanNE("isSlsClose");
				boolean isPurcClose = _ifR.getBooleanNE("isPurcClose");
				MCDate fixDt = getFixDt(_ifR.accpt_dt(), isSlsClose);
				
				if (isNull(_ifR.accpt_dt()) || isSetIfDtOrToday(_ifR.accpt_dt(), isPurcClose)) {
					dest.ac_dt(fixDt);
					dest.pay_basis_dt(fixDt);
					dest.ptax_dt(fixDt);
				}	
				else {	
					dest.ac_dt(_ifR.accpt_dt());
					dest.pay_basis_dt(_ifR.accpt_dt());
					dest.ptax_dt(_ifR.accpt_dt());
				}
				
				if (isNull(updSlsActR)) {
					dest.purc_dt(getToday());
				}
				else {
					dest.can_ac_dt(fixDt);
					dest.purc_dt(updSlsActR.sls_dt());
				}
			}
		}
		
		/**
		 * 仕入実績登録チェックサービス呼出（取消）
		 */
		protected void callPurcActRegSvChk03Del(MSBDL_PurcActRegService.Purc_Chk03 ope) {
			if (!ope.up0().isEmpty()) {
				ope.up3().crt_param_cache_flg(true);
				ope.up3().purc_ddlv_reg_exec_flg(true);
				ope.exec();
				copyErrFlg(up0(), ope.down0());
				copyErrFlg(up0(), ope.down1());
				copyErrFlg(up0(), ope.down2());
			}
		}
		
		/**
		 * 仕入実績登録チェックサービス呼出（訂正取消）
		 */
		protected void callPurcActRegSvChk03Upd(MSBDL_PurcActRegService.Purc_Chk03 ope) {
			if (!ope.up0().isEmpty()) {
				ope.up3().crt_param_cache_flg(true);
				ope.up3().purc_ddlv_reg_exec_flg(true);
				ope.exec();
				copyErrFlg(up0(), ope.down0());
				copyErrFlg(up0(), ope.down1());
				copyErrFlg(up0(), ope.down2());
			}
		}
		
		/**
		 * 仕入実績登録チェックサービス呼出（登録）
		 */
		protected void callPurcActRegSvChk03(MSBDL_PurcActRegService.Purc_Chk03 ope) {
			if (!ope.up0().isEmpty()) {
				ope.up3().crt_param_cache_flg(true);
				ope.up3().purc_ddlv_reg_exec_flg(true);
				ope.exec();
				copyErrFlg(up0(), ope.down0());
				copyErrFlg(up0(), ope.down1());
				copyErrFlg(up0(), ope.down2());
			}
		}
		
		/**
		 * 同一処理グループ・同一データ更新区分で同一外部仕入実績明細ＮＯ存在チェック
		 */
		protected MCMessageList dplExtPurcActDChk(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			MCIndexKey chkIdx = accptRecvIfL.createIndex(AccptRecvIf_Chk01_DtlR.$data_crud_typ, AccptRecvIf_Chk01_DtlR.$ext_purc_act_d_no, AccptRecvIf_Chk01_DtlR.$ext_sys_cd);
			
			for (AccptRecvIf_Chk01_DtlR dtlR : accptRecvIfL) {
				if (dtlR.err_flg()) {
					continue;
				}
				
				MCList<AccptRecvIf_Chk01_DtlR> tmpL = accptRecvIfL.subList(chkIdx, dtlR.data_crud_typ(), dtlR.ext_purc_act_d_no(), dtlR.ext_sys_cd());
				if (tmpL.size() > 1) {
					msgL.add(new MCMessage(dtlR, null, MSLAL0461, dtlR.data_no(),
							dtlR.data_lno(), dtlR.cst_cd(), dtlR.org_dlv_slip_no(),
							dtlR.org_dlv_slip_d_no(), dtlR.cst_po_no(),
							dtlR.cst_po_d_no(), dtlR.ext_sys_cd(), dtlR.ext_purc_act_d_no()));
					dtlR.err_flg(true);
				}
			}
			
			return msgL;
		}
		
		/**
		 * 外部仕入実績明細ＮＯ登録済チェック
		 */
		protected MCMessageList existExtPurcActDCrtChk(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MST_SLS_ACT_D_R> tmpSlsActDL = MCList.create(MST_SLS_ACT_D_R.class);
			MST_SLS_ACT_D_R t = MST_SLS_ACT_D_R.create("T");
			MCQueryApiBuilder tmpSlsActDL_bldr = MCQueryApiBuilder.create(t);
			MST_SLS_ACT_R t2 = MST_SLS_ACT_R.create("T2");
			tmpSlsActDL_bldr.setWhere(t.ext_purc_act_d_no.eq(bind("ext_purc_act_d_no")));
			tmpSlsActDL_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("ext_sys_cd")));
			tmpSlsActDL_bldr.addWhereWithAnd(t.sls_act_seq.eq(t2.sls_act_seq));
			tmpSlsActDL_bldr.addInnerJoin(t2,
					bracket(t2.sls_act_no.eq(t.sls_act_no)
							.and(t2.edi_flg.eq(value(true)))
							.and(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							.and(t2.cst_cd.eq(bind("cst_cd")))));
			dbSelect("MSLAL5160_MST_SLS_ACT_D_S02", tmpSlsActDL, tmpSlsActDL_bldr, up0());
			MCIndexKey tmpSlsActDExtPurcDNoIdxkey = tmpSlsActDL.createIndex(MST_SLS_ACT_D_R.$ext_purc_act_d_no, MST_SLS_ACT_D_R.$ext_sys_cd);
			
			for (AccptRecvIf_Chk01_DtlR dtlR : accptRecvIfL) {
				if (dtlR.err_flg()) {
					continue;
				}
				_slsActDL.sort(MST_SLS_ACT_D_R.$sls_act_no, MST_SLS_ACT_D_R.$sls_act_seq, MST_SLS_ACT_D_R.$sls_act_d_no, MST_SLS_ACT_D_R.$sls_act_d_seq);
				MST_SLS_ACT_D_R updSlsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, dtlR.ext_purc_act_d_no(), dtlR.ext_sys_cd());
				if (isCrt(dtlR) || isUpd(dtlR) && isNull(updSlsActDR)) {
					MST_SLS_ACT_D_R slsActDR = tmpSlsActDL.getFirst(tmpSlsActDExtPurcDNoIdxkey, dtlR.ext_purc_act_d_no(), dtlR.ext_sys_cd());
					if (!isNull(slsActDR)) {
						msgL.add(new MCMessage(dtlR, null, MSLAL0457, dtlR.data_no(),
								dtlR.data_lno(), dtlR.cst_cd(), dtlR.org_dlv_slip_no(),
								dtlR.org_dlv_slip_d_no(), dtlR.cst_po_no(),
								dtlR.cst_po_d_no(), dtlR.ext_sys_cd(), dtlR.ext_purc_act_d_no(),
								slsActDR.sls_act_no()));
						dtlR.err_flg(true);
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 	仕入実績登録チェックサービス呼出電文作成
		 */
		protected MSBDL_PurcActRegService.Purc_Chk03 makePurcActRegSvChk03(MCList<AccptRecvIf_Chk01_DtlR> chkL, int delUpdSize) {
			
			MSBDL_PurcActRegService.Purc_Chk03 ope = MSBDL_PurcActRegService.crtPurc_Chk03();
			
			MCList<MST_SLS_SCHD_R> wkL = MCList.create(MST_SLS_SCHD_R.class);
			wkL.addStringColumn("tgt_lot_no");
			_slsSchdL.addNumberColumn("rem_trd_unit_qty");
			MCIndexKey tmpSchdIdx = _slsSchdL.createIndex(
					MST_SLS_SCHD_R.$slo_d_no,
					MST_SLS_SCHD_R.$purc_act_d_no,
					MST_SLS_SCHD_R.$cmpl_flg
					);
			boolean execFlg = false;
			for (AccptRecvIf_Chk01_DtlR chkR : chkL) {
				if (isAllocQtyTgt(chkR)) {
					// 数量割当処理（仕入同時計上）
					execFlg = allocQty(wkL, chkL, chkR, tmpSchdIdx, execFlg);
				}
			}
			if (wkL.isEmpty()) {
				return ope;
			}
			
			initItmCache(chkL);
			
			// 電文作成
			makePurcChkData(delUpdSize, ope, wkL, chkL, execFlg);
			
			if (!isNull(_slsSchdL)) {
				_slsSchdL.setBooleanNE("use_flg", false);
			}
			
			return ope;
		}
		/**
		 * 数量割当処理を呼び出す対象か判断
		 */
		protected boolean isAllocQtyTgt(AccptRecvIf_Chk01_DtlR chkR) {
			MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, chkR.ext_purc_act_d_no(), chkR.ext_sys_cd());
			if (isUpd(chkR) && !chkR.accpt_dfct_flg() && !isNull(slsActDR)) {
				chkR.addStringColumn("tgt_sls_schd_no", slsActDR.sls_schd_no());
				return false;
			}
			if (chkR.err_flg() || (isUpd(chkR) && chkR.accpt_dfct_flg())) {
				return false;
			}
			if (!chkR.sync_flg()) {
				return false;
			}
			return true;
		}
		
		/**
		 * 仕入同時計上での数量割当処理
		 */
		protected boolean allocQty(
				MCList<MST_SLS_SCHD_R> wkL,
				MCList<AccptRecvIf_Chk01_DtlR> chkL,
				AccptRecvIf_Chk01_DtlR chkR,
				MCIndexKey tmpSchdIdx,
				boolean execFlg) {
			if (chkR.sls_schd_mult_flg()) {
				execFlg = allocQtyMain( execFlg, tmpSchdIdx, chkR, wkL, chkL);
			}
			else {
				MST_SLS_SCHD_R wkR = MST_SLS_SCHD_R.create();
				wkR.sls_schd_no(chkR.fix_sls_schd_no());
				wkL.add(wkR);
				MST_SLS_SCHD_R fixSlsSchdR = _slsSchdL.getFirst(MST_SLS_SCHD_R.$sls_schd_no, chkR.fix_sls_schd_no());
				fixSlsSchdR.setNumberNE("rem_trd_unit_qty", fixSlsSchdR.trd_unit_qty().subtract(chkR.trd_unit_qty()));
				if (fixSlsSchdR.getNumberNE("rem_trd_unit_qty").isZero()) {
					fixSlsSchdR.setBooleanNE("use_flg", true);
				}
			}
			
			return execFlg;
		}
		/**
		 * 仕入同時計上での数量割当メイン処理
		 */
		protected boolean allocQtyMain(
				boolean execFlg,
				MCIndexKey tmpSchdIdx,
				AccptRecvIf_Chk01_DtlR chkR,
				MCList<MST_SLS_SCHD_R> wkL,
				MCList<AccptRecvIf_Chk01_DtlR> chkL) {
			
			if(isDel(chkR)) {
				return execFlg;
			}
			
			int cnt = 0;
			int loopCnt = 0;
			MCNumber trdUnitQty = chkR.trd_unit_qty();
			MCList<MST_SLS_SCHD_R> tmpSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			
			tmpSlsSchdL = _slsSchdL.subList(tmpSchdIdx, chkR.fix_slo_d_no(), null, false);
			if (isNull(tmpSlsSchdL)) {
				tmpSlsSchdL = _slsSchdL.subList(MST_SLS_SCHD_R.$slo_d_no, chkR.fix_slo_d_no());
			}
			tmpSlsSchdL = filterSlsSchd(tmpSlsSchdL, chkR);
			tmpSlsSchdL.sort(MST_SLS_SCHD_R.$sls_schd_dt, MST_SLS_SCHD_R.$sls_schd_no);
			int schdSize = tmpSlsSchdL.subList("use_flg", false).size();
			
			for (MST_SLS_SCHD_R tmpSlsSchdR : tmpSlsSchdL) {
				loopCnt++;
				if (isNull(tmpSlsSchdR.getNumberNE("rem_trd_unit_qty"))) {
					tmpSlsSchdR.setNumberNE("rem_trd_unit_qty", tmpSlsSchdR.trd_unit_qty());
					for (AccptRecvIf_Chk01_DtlR tmpChkR : chkL) {
						String tmpSlsSchdNo = tmpChkR.getStringNE("tgt_sls_schd_no");
						if (!isNull(tmpSlsSchdNo) && isSame(tmpSlsSchdR.sls_schd_no(), tmpSlsSchdNo)) {
							tmpSlsSchdR.setNumberNE("rem_trd_unit_qty", tmpSlsSchdR.getNumberNE("rem_trd_unit_qty").subtract(tmpChkR.trd_unit_qty()));
							if (tmpSlsSchdR.trd_unit_qty().isZero() || tmpSlsSchdR.getNumberNE("rem_trd_unit_qty").isZero()) {
								tmpSlsSchdR.setBooleanNE("use_flg", true);
							}
						}
					}
				}
				MST_SLS_SCHD_R wkR = MST_SLS_SCHD_R.create();
				if (chkR.iv_flg()) {
					if (isSame(tmpSlsSchdR.sls_schd_no(), chkR.fix_sls_schd_no())) {
						wkR.sls_schd_no(tmpSlsSchdR.sls_schd_no());
						wkR.trd_unit_qty(tmpSlsSchdR.trd_unit_qty());
						wkL.add(wkR);
						execFlg = true;
					}
				}
				else {
					if (tmpSlsSchdR.getBooleanNE("use_flg") == true) {
						if (isSyncExcessPurcQty(schdSize, loopCnt, chkR, tmpSlsSchdL)) {
							tmpSlsSchdR.setNumber("rem_trd_unit_qty", chkR.trd_unit_qty());
						}
						else {
							continue;
						}
					}
					cnt++;
					if (trdUnitQty.isZero()) {
						break;
					}
					
					if (chkL.subList(AccptRecvIf_Chk01_DtlR.$fix_slo_d_no, chkR.fix_slo_d_no()).size() == 1) {
						if (trdUnitQty.lte(tmpSlsSchdR.trd_unit_qty())) {
							wkR.sls_schd_no(tmpSlsSchdR.sls_schd_no());
							wkR.trd_unit_qty(trdUnitQty);
							trdUnitQty = MCNumber.ZERO;
							tmpSlsSchdR.setBooleanNE("use_flg", true);
						}
						else {
							wkR.trd_unit_qty(tmpSlsSchdR.trd_unit_qty());
							trdUnitQty = trdUnitQty.subtract(tmpSlsSchdR.trd_unit_qty());
							if (trdUnitQty.isPositive() && isSame(schdSize, cnt)) {
								wkR.trd_unit_qty(wkR.trd_unit_qty().add(trdUnitQty));
								trdUnitQty = MCNumber.ZERO;
							}
							wkR.sls_schd_no(tmpSlsSchdR.sls_schd_no());
							tmpSlsSchdR.setBooleanNE("use_flg", true);
						}
					}
					else {
						MCNumber tmpTrdUnitQty = tmpSlsSchdR.getNumberNE("rem_trd_unit_qty");
						if (trdUnitQty.gte(tmpTrdUnitQty)) {
							if (trdUnitQty.eq(tmpTrdUnitQty)) {
								wkR.trd_unit_qty(tmpTrdUnitQty);
								trdUnitQty = MCNumber.ZERO;
							}
							else {
								if (isSame(schdSize, cnt)) {
									wkR.trd_unit_qty(trdUnitQty);
									trdUnitQty = MCNumber.ZERO;
								}
								else {
									wkR.trd_unit_qty(tmpTrdUnitQty);
									trdUnitQty = trdUnitQty.subtract(tmpTrdUnitQty);
								}
							}
							tmpSlsSchdR.setBooleanNE("use_flg", true);
						}
						else {
							wkR.trd_unit_qty(trdUnitQty);
							trdUnitQty = MCNumber.ZERO;
						}
						tmpSlsSchdR.setNumberNE("rem_trd_unit_qty", tmpTrdUnitQty.subtract(wkR.trd_unit_qty()));
						wkR.sls_schd_no(tmpSlsSchdR.sls_schd_no());
						wkR.setStringNE("tgt_lot_no", chkR.lot_no());
					}
					wkL.add(wkR);
					execFlg = true;
				}
			}
			return execFlg;
		}
		/**
		 * 数量超過分を売上計上対象としてよい売上予定かどうか判断（仕入実績用）
		 */
		protected boolean isSyncExcessPurcQty(
				int schdSize,
				int loopCnt,
				AccptRecvIf_Chk01_DtlR chkR,
				MCList<MST_SLS_SCHD_R> tmpSlsSchdL) {
			if (schdSize == 0 && MAC_DATA_CRUD_TYP.isCRT(chkR.data_crud_typ()) && loopCnt == tmpSlsSchdL.size()) {
				return true;
			}
			return false;
		}
		
		/**
		 * 仕入実績登録チェックサービス呼出電文作成処理
		 */
		protected void makePurcChkData(
				int delUpdSize,
				MSBDL_PurcActRegService.Purc_Chk03 ope,
				MCList<MST_SLS_SCHD_R> wkL,
				MCList<AccptRecvIf_Chk01_DtlR> chkL,
				boolean execFlg) {
			MCList<Purc_Chk03_HdrR> oUp0L = MCList.create(Purc_Chk03_HdrR.class);
			oUp0L.addBooleanColumn("sppl_iv_flg");
			oUp0L.addBooleanColumn("pay_spot_flg");
			oUp0L.addStringColumn("slo_d_no");
			oUp0L.addDateColumn("sls_schd_dt");
			MCList<Purc_Chk03_DtlR> oUp1L = MCList.create(Purc_Chk03_DtlR.class);
			oUp1L.addNumberColumn("po_base_unit_qty");
			oUp1L.addStringColumn("purc_amt_rnd_typ");
			oUp1L.addStringColumn("ship_pr_loc_cd");
			oUp1L.addStringColumn("ship_pr_str_ln_cd");
			oUp1L.addStringColumn("pr_loc_wg_cd");
			MCIndexKey ikUp0 = null;
			MCIndexKey ikUp1 = null;
			MCIndexKey ikUp0Slod = null;
			
			if (!wkL.isEmpty()) {
				MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T"));
				dbWkDelete("MSLAL5160_MSW_SLS_SCHD_D03", wkL_bldr.getBaseDbc());
				dbWkInsert("MSLAL5160_MSW_SLS_SCHD_I02", wkL, wkL_bldr.getBaseDbc());
				
				MCRow row = MCRow.create();
				row.addDateColumn("today", getToday());
				
				executeQuery(oUp0L, MSLAL5160_MST_SLS_SCHD_S03(), row);
				executeQuery(oUp1L, MSLAL5160_MST_PO_D_S01(), row);
				
				ikUp0 = oUp0L.createIndex(MST_SLS_SCHD_R.$sls_schd_no);
				oUp0L.setBooleanNE("use_flg", false);
				ikUp0Slod = oUp0L.createIndex(MST_SLS_SCHD_R.$slo_d_no, "use_flg");
				ikUp1 = oUp1L.createIndex(MST_SLS_SCHD_R.$sls_schd_no);
				
				dbWkDelete("MSLAL5160_MSW_SLS_SCHD_D04", wkL_bldr.getBaseDbc());
			}
			
			int hdrPegNo = delUpdSize;
			for (AccptRecvIf_Chk01_DtlR chkR : chkL) {
				MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, chkR.ext_purc_act_d_no(), chkR.ext_sys_cd());
				if (isUpd(chkR) && !chkR.accpt_dfct_flg() && isNull(slsActDR)) {
					chkR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				
				if (chkR.err_flg() || isUpd(chkR) || isDel(chkR) || (isNull(chkR.fix_sls_schd_no()) && !execFlg) || (isUpd(chkR) && chkR.accpt_dfct_flg())) {
					continue;
				}
				
				if (!isDel(chkR) && chkR.sync_flg()) {
					chkR.setBooleanNE("isSlsClose", callClChk(chkR.accpt_dt(), false));
					// 売上予定が分割されていた場合
					if (chkR.sls_schd_mult_flg() && execFlg) {
						oUp0L.sort(MST_SLS_SCHD_R.$sls_schd_dt, MST_SLS_SCHD_R.$sls_schd_no);
						MCList<Purc_Chk03_HdrR> tmpUp0L = MCList.create(Purc_Chk03_HdrR.class);
						if (chkL.subList(AccptRecvIf_Chk01_DtlR.$fix_slo_d_no, chkR.fix_slo_d_no()).size() == 1) {
							tmpUp0L = oUp0L.subList(ikUp0Slod, chkR.fix_slo_d_no(), false);
						}
						else {
							for (Purc_Chk03_HdrR tmpUp0R : oUp0L) {
								if (isSame(tmpUp0R.getStringNE("slo_d_no"), chkR.fix_slo_d_no()) && tmpUp0R.getBooleanNE("use_flg") == false) {
									tmpUp0L.add(tmpUp0R);
									tmpUp0R.setBooleanNE("use_flg", true);
								}
							}
							if (isNull(tmpUp0L)) {
								for (int i = 0; i < oUp0L.size(); i++) {
									Purc_Chk03_HdrR tmpUp0R = oUp0L.get(i);
									if (tmpUp0R.getBooleanNE("use_flg") == true && i == oUp0L.size() - 1) {
										tmpUp0L.add(tmpUp0R);
									}
								}
								if (isNull(tmpUp0L)) {
									MCList<AccptRecvIf_Chk01_DtlR> tmpChkL = chkL.subList(AccptRecvIf_Chk01_DtlR.$fix_slo_d_no, chkR.fix_slo_d_no());
									for (AccptRecvIf_Chk01_DtlR tmpChkR : tmpChkL) {
										if (!isSame(tmpChkR.data_lno(), chkR.data_lno()) && !isNull(tmpChkR.loc_cd())) {
											chkR.loc_cd(tmpChkR.loc_cd());
											chkR.str_ln_cd(tmpChkR.str_ln_cd());
											break;
										}
									}
								}
							}
						}
						tmpUp0L.sort(MST_SLS_SCHD_R.$sls_schd_dt, MST_SLS_SCHD_R.$sls_schd_no);
						// 明細はヘッダの売上予定NOに紐づくデータを追加
						MCList<Purc_Chk03_DtlR> tmpUp1L = MCList.create(Purc_Chk03_DtlR.class);
						for (Purc_Chk03_HdrR tmpUp0R : tmpUp0L) {
							MCList<Purc_Chk03_DtlR> tmpSchdL = oUp1L.subList(ikUp1, tmpUp0R.getStringNE("sls_schd_no"));
							MCList<MST_SLS_SCHD_R> tmpWkL = wkL.subList(MST_SLS_SCHD_R.$sls_schd_no, tmpUp0R.getStringNE("sls_schd_no"));
							
							for (MST_SLS_SCHD_R tmpWkR : tmpWkL) {
								if(isNull(tmpWkR.trd_unit_qty()) || tmpWkR.trd_unit_qty().isZero()) {
									continue;
								}
								Purc_Chk03_DtlR tmpSchdR = tmpSchdL.getFirst(MST_SLS_SCHD_R.$sls_schd_no, tmpUp0R.getStringNE("sls_schd_no"));
								tmpSchdR.trd_unit_qty(tmpWkR.trd_unit_qty());
								tmpSchdR.setStringNE("tgt_lot_no", tmpWkR.getStringNE("tgt_lot_no"));
								tmpUp1L.add(tmpSchdR);
								
								Purc_Chk03_HdrR oUp0 = ope.up0().createRow();
								Purc_Chk03_DtlR oUp1 = ope.up1().createRow();
								
								MCRow.copyall(oUp0, tmpUp0R);
								MCRow.copyall(oUp1, tmpSchdR);
								
								if (tmpWkR.getBooleanNE("add_flg")) {
									chkR.loc_cd(oUp1.dlv_loc_cd());
									chkR.str_ln_cd(oUp1.str_ln_cd());
									continue;
								}
								// 仕入実績登録サービス用電文作成
								hdrPegNo = crtInsPurcChk03Ope(ope, oUp0, oUp1, chkR, hdrPegNo, tmpUp0R, slsActDR, tmpSchdR, true);
								tmpWkR.setBooleanNE("add_flg", true);
							}
						}
					}
					else {
						Purc_Chk03_HdrR tmpUp0 = oUp0L.getFirst(ikUp0, chkR.fix_sls_schd_no());
						Purc_Chk03_DtlR tmpUp1 = oUp1L.getFirst(ikUp1, chkR.fix_sls_schd_no());
						Purc_Chk03_HdrR oUp0 = ope.up0().createRow();
						Purc_Chk03_DtlR oUp1 = ope.up1().createRow();
						
						MCRow.copyall(oUp0, tmpUp0);
						MCRow.copyall(oUp1, tmpUp1);
						
						// 仕入実績登録サービス用電文作成
						hdrPegNo = crtInsPurcChk03Ope(ope, oUp0, oUp1, chkR, hdrPegNo, tmpUp0, slsActDR, null, false);
					}
				}
			}
		}
		
		/**
		 * 仕入実績登録サービス用電文作成（新規用）
		 */
		protected int crtInsPurcChk03Ope(MSBDL_PurcActRegService.Purc_Chk03 ope,
				Purc_Chk03_HdrR oUp0, Purc_Chk03_DtlR oUp1, AccptRecvIf_Chk01_DtlR chkR,
				int hdrPegNo, Purc_Chk03_HdrR tmpUp0R, MST_SLS_ACT_D_R slsActDR,
				Purc_Chk03_DtlR tmpUp1R, boolean mltFlg) {
			// ヘッダ情報の設定
			copy(oUp0, chkR, createMap_Purc_Chk03_HdrR_AccptRecvIf_Chk01_DtlR());
			oUp0.peg_no(hdrPegNo);
			if (tmpUp0R.getBooleanNE("sppl_iv_flg")) {
				if (tmpUp0R.getBooleanNE("pay_spot_flg")) {
					if (!isNull(chkR.rcv_schd_dt())) {
						oUp0.pay_schd_dt(chkR.rcv_schd_dt());
					}
					else {
						oUp0.pay_schd_dt(tmpUp0R.pa().pay_schd_dt());
					}
					oUp0.pay_basis_dt(null);
				}
				else {
					oUp0.pay_basis_dt(tmpUp0R.pa().pay_basis_dt());
				}
			}
			ope.up0().add(oUp0);
			
			// 明細情報の設定
			copy(oUp1, chkR, createMap_Purc_Chk03_DtlR_AccptRecvIf_Chk01_DtlR());
			MST_SLS_SCHD_R slsSchdR = MST_SLS_SCHD_R.create();
			if (mltFlg) {
				slsSchdR = _slsSchdL.getFirst(_slsSchdNoIdxkey, tmpUp0R.getStringNE("sls_schd_no"));
			}
			else {
				slsSchdR = _slsSchdL.getFirst(_slsSchdNoIdxkey, chkR.fix_sls_schd_no());
			}
			if (isCrt(chkR) || (isUpd(chkR) && isNull(slsActDR))) {
				oUp1.sublot_no(nvl(chkR.sublot_no(), slsSchdR.sublot_no()));
				oUp1.ver_no(slsSchdR.getStringNE(MST_ARR_SCHD_R.$ver_no));
				oUp1.trd_unit_cd(chkR.trd_unit_cd());
				if (mltFlg) {
					oUp1.lot_no(nvl(nvl(tmpUp1R.getStringNE("tgt_lot_no"), chkR.lot_no()), slsSchdR.lot_no()));
					oUp1.trd_unit_qty(tmpUp1R.trd_unit_qty());
				}
				else {
					oUp1.lot_no(nvl(chkR.lot_no(), slsSchdR.lot_no()));
					oUp1.trd_unit_qty(chkR.trd_unit_qty());
				}
			}
			else {
				MCList<MST_SLS_ACT_IO_R> slsIoL = _slsActIoL.subList(_slsActIoIdxkey, slsActDR.sls_act_d_no());
				
				if (slsIoL.groupBy(MST_SLS_ACT_IO_R.$lot_no).size() == 1) {
					oUp1.lot_no(slsIoL.get(0).lot_no());
				}
				if (slsIoL.groupBy(MST_SLS_ACT_IO_R.$sublot_no).size() == 1) {
					oUp1.sublot_no(slsIoL.get(0).sublot_no());
				}
				if (slsIoL.groupBy(MST_ARR_ACT_R.$ver_no).size() == 1) {
					oUp1.ver_no(slsIoL.get(0).getStringNE(MST_ARR_ACT_R.$ver_no));
				}
				if (slsIoL.groupBy(MST_ARR_ACT_R.$bp_lot_no).size() == 1) {
					oUp1.bp_lot_no(slsIoL.get(0).getStringNE(MST_ARR_ACT_R.$bp_lot_no));
				}
				if (slsIoL.groupBy(MST_ARR_ACT_R.$bp_dlv_slip_no).size() == 1) {
					oUp1.bp_dlv_slip_no(slsIoL.get(0).getStringNE(MST_ARR_ACT_R.$bp_dlv_slip_no));
				}
				if (slsIoL.groupBy(MST_ARR_ACT_R.$bp_dlv_slip_d_no).size() == 1) {
					oUp1.bp_dlv_slip_d_no(slsIoL.get(0).getStringNE(MST_ARR_ACT_R.$bp_dlv_slip_d_no));
				}
				if (slsIoL.groupBy(MST_ARR_ACT_R.$ship_fr_valid_dt).size() == 1) {
					oUp1.ship_fr_valid_dt(slsIoL.get(0).getDateNE(MST_ARR_ACT_R.$ship_fr_valid_dt));
				}
			}
			chkR.loc_cd(oUp1.dlv_loc_cd());
			chkR.str_ln_cd(oUp1.str_ln_cd());
			oUp1.hdr_peg_no(oUp0.peg_no());
			oUp1.peg_no(oUp0.peg_no());
			
			// 基準単位数
			if (isSame(oUp1.trd_unit_cd(), oUp1.base_unit_cd())) {
				oUp1.base_unit_qty(oUp1.trd_unit_qty());
			}
			else {
				oUp1.base_unit_qty(getBaseUnitQty(
						oUp1.trd_unit_qty(),
						oUp1.trd_unit_cd(),
						oUp1.base_unit_cd(),
						oUp1.itm_cd(),
						oUp1.itm_sub1(),
						oUp1.itm_sub2(),
						oUp1.itm_sub3()));
			}
			
			// 取引通貨明細値引金額
			MAM_CUR_R trdCurR = getCur(chkR.trd_cur_cd());
			if (!isNull(oUp1.trd_cur_dscnt_amt())) {
				oUp1.trd_cur_dscnt_amt(
					oUp1.trd_cur_dscnt_amt().multiply(oUp1.base_unit_qty())
					.divide(oUp1.getNumberNE("po_base_unit_qty"), trdCurR.amt_dec_place().intValue(), MAC_RND_TYP.toMC(oUp1.getStringNE("purc_amt_rnd_typ")))
				);
			}
			ope.up1().add(oUp1);
			
			// 詳細情報の設定
			Purc_Chk03_IoR oUp2 = ope.up2().createRow();
			copy(oUp2, oUp1, createMap_Purc_Chk03_IoR_Purc_Chk03_DtlR());
			
			// ロット作成
			if (mltFlg) {
				if (slsSchdR.getBooleanNE("crt_lot_flg")) {
					oUp2.crt_lot_flg(true);
				}
			}
			else {
				if (chkR.crt_lot_flg()) {
					oUp2.crt_lot_flg(true);
				}
			}
			
			oUp2.dtl_peg_no(oUp1.peg_no());
			oUp2.peg_no(oUp2.dtl_peg_no());
			
			if (isPack(oUp1.itm_cd(), oUp1.itm_sub1(), oUp1.itm_sub2(), oUp1.itm_sub3(), oUp1.trd_unit_cd())){
				oUp2.pack_unit_cd(oUp1.trd_unit_cd());
				oUp2.pack_unit_qty(oUp1.trd_unit_qty());
			}
			else {
				oUp2.pack_unit_cd(oUp2.base_unit_cd());
				oUp2.pack_unit_qty(oUp2.base_unit_qty());
			}
			
			oUp2.gi_loc_cd(oUp1.getStringNE("ship_pr_loc_cd"));
			oUp2.gi_str_ln_cd(oUp1.getStringNE("str_ln_cd"));
			oUp2.gi_wg_cd(oUp1.getStringNE("pr_loc_wg_cd"));
			oUp2.from_gd_cd(oUp1.gd_cd());
			
			ope.up2().add(oUp2);
			
			hdrPegNo++;
			
			return hdrPegNo;
		}
		
		protected Map_Purc_Chk03_IoR_AccptRecvIf_Chk01_PurcActIoR<Purc_Chk03_IoR,AccptRecvIf_Chk01_PurcActIoR> createMap_Purc_Chk03_IoR_AccptRecvIf_Chk01_PurcActIoR() {
			return new Map_Purc_Chk03_IoR_AccptRecvIf_Chk01_PurcActIoR<Purc_Chk03_IoR, AccptRecvIf_Chk01_PurcActIoR>();
		}
		
		public class Map_Purc_Chk03_IoR_AccptRecvIf_Chk01_PurcActIoR<D extends Purc_Chk03_IoR, S extends AccptRecvIf_Chk01_PurcActIoR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_no, AccptRecvIf_Chk01_PurcActIoR.$purc_act_io_no);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_seq, AccptRecvIf_Chk01_PurcActIoR.$purc_act_io_seq);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_d_no, AccptRecvIf_Chk01_PurcActIoR.$purc_act_d_no);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_d_seq, AccptRecvIf_Chk01_PurcActIoR.$purc_act_d_seq);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		
		protected Map_Purc_Chk03_DtlR_AccptRecvIf_Chk01_PurcActIoR<Purc_Chk03_DtlR,AccptRecvIf_Chk01_PurcActIoR> createMap_Purc_Chk03_DtlR_AccptRecvIf_Chk01_PurcActIoR() {
			return new Map_Purc_Chk03_DtlR_AccptRecvIf_Chk01_PurcActIoR<Purc_Chk03_DtlR, AccptRecvIf_Chk01_PurcActIoR>();
		}
		
		public class Map_Purc_Chk03_DtlR_AccptRecvIf_Chk01_PurcActIoR<D extends Purc_Chk03_DtlR, S extends AccptRecvIf_Chk01_PurcActIoR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_no, AccptRecvIf_Chk01_PurcActIoR.$purc_act_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_seq, AccptRecvIf_Chk01_PurcActIoR.$purc_act_seq);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_no, AccptRecvIf_Chk01_PurcActIoR.$purc_act_d_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_seq, AccptRecvIf_Chk01_PurcActIoR.$purc_act_d_seq);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_schd_no, AccptRecvIf_Chk01_PurcActIoR.$purc_schd_no);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		
		protected Map_Purc_Chk03_HdrR_AccptRecvIf_Chk01_PurcActIoR<Purc_Chk03_HdrR,AccptRecvIf_Chk01_PurcActIoR> createMap_Purc_Chk03_HdrR_AccptRecvIf_Chk01_PurcActIoR() {
			return new Map_Purc_Chk03_HdrR_AccptRecvIf_Chk01_PurcActIoR<Purc_Chk03_HdrR, AccptRecvIf_Chk01_PurcActIoR>();
		}
		
		public class Map_Purc_Chk03_HdrR_AccptRecvIf_Chk01_PurcActIoR<D extends Purc_Chk03_HdrR, S extends AccptRecvIf_Chk01_PurcActIoR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_HdrR.$purc_act_no, AccptRecvIf_Chk01_PurcActIoR.$purc_act_no);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_act_seq, AccptRecvIf_Chk01_PurcActIoR.$purc_act_seq);
				addColumnPathMap(Purc_Chk03_HdrR.$trd_cd, AccptRecvIf_Chk01_PurcActIoR.$trd_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$trd_ptn_typ, AccptRecvIf_Chk01_PurcActIoR.$trd_ptn_typ);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		
		protected Map_Purc_Chk03_IoR_Purc_Chk03_DtlR<Purc_Chk03_IoR,Purc_Chk03_DtlR> createMap_Purc_Chk03_IoR_Purc_Chk03_DtlR() {
			return new Map_Purc_Chk03_IoR_Purc_Chk03_DtlR<Purc_Chk03_IoR, Purc_Chk03_DtlR>();
		}
		
		public class Map_Purc_Chk03_IoR_Purc_Chk03_DtlR<D extends Purc_Chk03_IoR, S extends Purc_Chk03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_IoR.$trd_unit_cd, Purc_Chk03_DtlR.$trd_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$trd_unit_qty, Purc_Chk03_DtlR.$trd_unit_qty);
				addColumnPathMap(Purc_Chk03_IoR.$base_unit_cd, Purc_Chk03_DtlR.$base_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$base_unit_qty, Purc_Chk03_DtlR.$base_unit_qty);
				addColumnPathMap(Purc_Chk03_IoR.$ver_no, Purc_Chk03_DtlR.$ver_no);
				addColumnPathMap(Purc_Chk03_IoR.$gd_cd, Purc_Chk03_DtlR.$gd_cd);
				addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_cd, Purc_Chk03_DtlR.$dlv_loc_cd);
				addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_wg_cd, Purc_Chk03_DtlR.$dlv_loc_wg_cd);
				addColumnPathMap(Purc_Chk03_IoR.$str_ln_cd, Purc_Chk03_DtlR.$str_ln_cd);
				addColumnPathMap(Purc_Chk03_IoR.$lot_no, Purc_Chk03_DtlR.$lot_no);
				addColumnPathMap(Purc_Chk03_IoR.$sublot_no, Purc_Chk03_DtlR.$sublot_no);
				addColumnPathMap(Purc_Chk03_IoR.$quality_typ, Purc_Chk03_DtlR.$quality_typ);
				addColumnPathMap(Purc_Chk03_IoR.$stk_insp_typ, Purc_Chk03_DtlR.$stk_insp_typ);
				addColumnPathMap(Purc_Chk03_IoR.$stk_id_typ, Purc_Chk03_DtlR.$stk_id_typ);
				addColumnPathMap(Purc_Chk03_IoR.$stk_bp_cd, Purc_Chk03_DtlR.$stk_bp_cd);
				addColumnPathMap(Purc_Chk03_IoR.$bp_lot_no, Purc_Chk03_DtlR.$bp_lot_no);
				addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_no, Purc_Chk03_DtlR.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_d_no, Purc_Chk03_DtlR.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Chk03_IoR.$ship_fr_valid_dt, Purc_Chk03_DtlR.$ship_fr_valid_dt);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
		}
		
		protected Map_Purc_Chk03_DtlR_AccptRecvIf_Chk01_DtlR<Purc_Chk03_DtlR,AccptRecvIf_Chk01_DtlR> createMap_Purc_Chk03_DtlR_AccptRecvIf_Chk01_DtlR() {
			return new Map_Purc_Chk03_DtlR_AccptRecvIf_Chk01_DtlR<Purc_Chk03_DtlR, AccptRecvIf_Chk01_DtlR>();
		}
		
		public class Map_Purc_Chk03_DtlR_AccptRecvIf_Chk01_DtlR<D extends Purc_Chk03_DtlR, S extends AccptRecvIf_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_cd, AccptRecvIf_Chk01_DtlR.$trd_unit_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_qty, AccptRecvIf_Chk01_DtlR.$trd_unit_qty);
				addColumnPathMap(Purc_Chk03_DtlR.$abort_flg, AccptRecvIf_Chk01_DtlR.$abort_flg);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.disp_seq(1);
				dest.purc_id_typ(MAC_PURC_ID_TYP.PURC.value());
			}
		}
		
		protected Map_Purc_Chk03_HdrR_AccptRecvIf_Chk01_DtlR<Purc_Chk03_HdrR,AccptRecvIf_Chk01_DtlR> createMap_Purc_Chk03_HdrR_AccptRecvIf_Chk01_DtlR() {
			return new Map_Purc_Chk03_HdrR_AccptRecvIf_Chk01_DtlR<Purc_Chk03_HdrR, AccptRecvIf_Chk01_DtlR>();
		}
		
		public class Map_Purc_Chk03_HdrR_AccptRecvIf_Chk01_DtlR<D extends Purc_Chk03_HdrR, S extends AccptRecvIf_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				boolean isSlsClose = src.getBooleanNE("isSlsClose");
				MCDate fixDt = getFixDt(src.accpt_dt(), isSlsClose);
				dest.ac_dt(fixDt);
				dest.pay_basis_dt(fixDt);
				dest.ptax_dt(fixDt);
				dest.purc_dt(getToday());
			}
		}
		
		protected MCNumber getBaseUnitQty(MCNumber trd_unit_qty, String trd_unit_cd, String base_unit_cd,
				String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3) {
			MAVM_ITM_UNIT_R itmUnitR = getItmUnitCache(itm_cd, itm_sub1, itm_sub2, itm_sub3, trd_unit_cd);
			MAVM_ITM_UNIT_R itmBaseUnitR = getItmUnitCache(itm_cd, itm_sub1, itm_sub2, itm_sub3, base_unit_cd);
			
			MCNumber base_unit_qty = convToBaseUnit(trd_unit_qty, itmUnitR.conv_base_qty(),
					itmUnitR.conv_qty(), itmBaseUnitR.dec_place(), itmBaseUnitR.rnd_typ());
			return base_unit_qty;
		}
		
		protected boolean isPack(String itmCd, String itmSub1, String itmSub2,
				String itmSub3, String trdUnitCd) {
			MAVM_ITM_UNIT_R itmUnitR = getItmUnitCache(itmCd, itmSub1, itmSub2, itmSub3, trdUnitCd);
			return itmUnitR.pack_flg();
		}
		
		/**
		 * 仕入済チェック
		 */
		protected MCMessageList purcCmplChk(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<AccptRecvIf_Chk01_DtlR> tgtL = accptRecvIfL.subList(AccptRecvIf_Chk01_DtlR.$err_flg, false);
			MCIndexKey ddlvIdx = tgtL.createIndex(
					AccptRecvIf_Chk01_DtlR.$imp_flg,
					AccptRecvIf_Chk01_DtlR.$iv_flg,
					AccptRecvIf_Chk01_DtlR.$accpt_dfct_flg,
					AccptRecvIf_Chk01_DtlR.$ddlvTgtFlg
					);
			MCList<AccptRecvIf_Chk01_DtlR> ddlvL = tgtL.subList(ddlvIdx, true, false, false, true);
			MCIndexKey ddlvLIdx = ddlvL.createIndex(AccptRecvIf_Chk01_DtlR.$fix_slo_no);
			MCList<AccptRecvIf_Chk01_DtlR> ddlvGrpL = ddlvL.groupBy(AccptRecvIf_Chk01_DtlR.$fix_slo_no);
			MAVM_ITM_UNIT_R itmUnitR = null;
			
			MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			for (AccptRecvIf_Chk01_DtlR ddlvGrpR : ddlvGrpL) {
				MCList<AccptRecvIf_Chk01_DtlR> tgtDdlvL = ddlvL.subList(ddlvLIdx, ddlvGrpR.fix_slo_no());
				MCIndexKey tgtDdlvIdx = tgtDdlvL.createIndex(
						AccptRecvIf_Chk01_DtlR.$cst_cd,
						AccptRecvIf_Chk01_DtlR.$cst_po_no,
						AccptRecvIf_Chk01_DtlR.$cst_po_d_no,
						AccptRecvIf_Chk01_DtlR.$dlv_slip_no,
						AccptRecvIf_Chk01_DtlR.$dlv_slip_d_no);
				for (AccptRecvIf_Chk01_DtlR tgtDdlvR : tgtDdlvL) {
					
					if (tgtDdlvR.err_flg() || isDel(tgtDdlvR)) {
						continue;
					}
					
					MST_SLS_ACT_D_R updSlsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, tgtDdlvR.ext_purc_act_d_no(), tgtDdlvR.ext_sys_cd());
					
					slsSchdL.clear();
					MST_SLS_SCHD_R slsSchdR = MST_SLS_SCHD_R.create();
					
					if (tgtDdlvR.sls_schd_mult_flg()) {
						if (isCrt(tgtDdlvR) || (isUpd(tgtDdlvR) && isNull(updSlsActDR))) {
							slsSchdL.addAll(filterSlsSchd(_slsSchdL.subList(_slsSchdSloDCmplIdxkey, false, tgtDdlvR.fix_slo_d_no()), tgtDdlvR));
						}
						else {
							slsSchdL.addAll(filterSlsSchd(_slsSchdL.subList(_slsSchdSloDIdxkey, tgtDdlvR.fix_slo_d_no()), tgtDdlvR));

							boolean syscFlg = _slsActIoL.contains(_slsActIoSyncIdxkey, true, updSlsActDR.sls_act_d_no());
							// 同時計上対象の売上予定を抽出
							MCList<MST_SLS_SCHD_R> tmpSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
							for (MST_SLS_SCHD_R r : slsSchdL) {
								if (_slsActIoL.contains(_slsActIoSyncSlsSchdIdxkey, true, r.sls_schd_no())
										|| isNull(r.purc_act_d_no())) {
									tmpSlsSchdL.add(r);
								}
							}

							if (syscFlg) {
								slsSchdL.setAll(tmpSlsSchdL);
							}
							else {
								slsSchdL.removeAll(tmpSlsSchdL);
							}
						}
					}
					else if (!isNull(tgtDdlvR.fix_sls_schd_no())) {
						// 売上予定が一意に特定
						slsSchdR = _slsSchdL.getFirst(_slsSchdNoIdxkey, tgtDdlvR.fix_sls_schd_no());
						slsSchdL.add(slsSchdR);
					}
					
					MCList<MST_SLS_SCHD_R> slsSchdGrpL = slsSchdL.groupBy(
							MST_SLS_SCHD_R.$sls_schd_no,
							MST_SLS_SCHD_R.$slo_d_no,
							MST_SLS_SCHD_R.$dlv_slip_d_no,
							MST_SLS_SCHD_R.$iv_no,
							MST_SLS_SCHD_R.$iv_d_no,
							MST_SLS_SCHD_R.$purc_act_d_no,
							MST_SLS_SCHD_R.$sls_schd_dt,
							MST_SLS_SCHD_R.$trd_unit_cd,
							MST_SLS_SCHD_R.$base_unit_cd,
							MST_SLS_SCHD_R.$base_unit_qty,
							MST_SLS_SCHD_R.$base_unit_abort_qty,
							MST_SLS_SCHD_R.$base_unit_sls_qty
							);
					
					boolean syncFlg = false;
					MCNumber canSlsQty = null;
					MCNumber remQty = MCNumber.ZERO;
					MCList<AccptRecvIf_Chk01_DtlR> tmpL = tgtDdlvL.subList(
							tgtDdlvIdx,
							tgtDdlvR.cst_cd(),
							tgtDdlvR.cst_po_no(),
							tgtDdlvR.cst_po_d_no(),
							tgtDdlvR.dlv_slip_no(),
							tgtDdlvR.dlv_slip_d_no());
					for (MST_SLS_SCHD_R slsSchdGrpR : slsSchdGrpL) {
						
						if (isCrt(tgtDdlvR) || (isUpd(tgtDdlvR) && isNull(updSlsActDR))) {
							if (isNull(slsSchdGrpR.purc_act_d_no())) {
								syncFlg = true;
							}
							else {
								syncFlg = tgtDdlvR.sync_flg();
							}
						}
						else {
							MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, tgtDdlvR.ext_purc_act_d_no(), tgtDdlvR.ext_sys_cd());
							if (!isNull(slsActDR)) {
								MST_SLS_ACT_IO_R slsActIoR = _slsActIoL.getFirst(_slsActIoSyncIdxkey, true, slsActDR.sls_act_d_no());
								if (!isNull(slsActIoR)) {
									syncFlg = true;
								}
							}
							else {
								if (isNull(slsSchdGrpR.purc_act_d_no())) {
									syncFlg = true;
								}
							}
						}
						
						if (isNull(canSlsQty)) {
							canSlsQty = MCNumber.ZERO;
						}
						canSlsQty = canSlsQty.add(slsSchdGrpR.base_unit_qty().subtract(slsSchdGrpR.base_unit_sls_qty().add(slsSchdGrpR.base_unit_abort_qty())));
						// 更新対象の場合、自分自身の売上済数量を売上可能数に戻す（同一得意先注文明細ＮＯの検収データがない場合）
						if (isUpd(tgtDdlvR) && tmpL.size() == 1) {
							MCList<MST_SLS_ACT_D_R> slsActDL = _slsActDL.subList(MST_SLS_ACT_D_R.$sls_schd_no, slsSchdGrpR.sls_schd_no());
							if(!isNull(slsActDL)) {
								canSlsQty = canSlsQty.add(slsActDL.sum(MST_SLS_ACT_D_R.$base_unit_qty));
							}
						}
					}
					// 更新対象の場合、自分自身の売上済数量を売上可能数に戻す（同一得意先注文明細ＮＯの検収データが複数ある場合）
					if (isUpd(tgtDdlvR) && tmpL.size() != 1) {
						MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
						for (AccptRecvIf_Chk01_DtlR tmpR : tmpL) {
							if (isSame(syncFlg, tmpR.sync_flg())) {
								slsActDL.addAll(_slsActDL.subList(_slsActDExtPurcDNoIdxkey, tmpR.ext_purc_act_d_no(), tmpR.ext_sys_cd()));
							}
						}
						if(!isNull(slsActDL)) {
							canSlsQty = canSlsQty.add(slsActDL.sum(MST_SLS_ACT_D_R.$base_unit_qty));
						}
					}
					// 仕入同時計上となる場合
					if (syncFlg) {
						tgtDdlvR.sync_flg(true);
					}
					MST_SLO_D_R tmpSloDR = _sloDL.getFirst(_sloDSloDNoIdxkey, tgtDdlvR.fix_slo_d_no());
					if (!isNull(tmpSloDR) && !isNull(canSlsQty)) {
						MCNumber trdUnitQty;
						if (tmpL.size() != 1) {
							trdUnitQty = tmpL.subList(AccptRecvIf_Chk01_DtlR.$sync_flg, syncFlg).sum(AccptRecvIf_Chk01_DtlR.$trd_unit_qty);
						}
						else {
							trdUnitQty = tgtDdlvR.trd_unit_qty();
						}
						// ＩＦの取引単位と受注の基準単位が同じ場合
						if (isSame(tgtDdlvR.trd_unit_cd(), tmpSloDR.base_unit_cd())) {
							// 売上予定の総売上可能数を超過する数量の場合
							if (!syncFlg && trdUnitQty.gt(canSlsQty)) {
								// 売上予定数＝仕入実績数を超過する場合
								msgL.add(new MCMessage(tgtDdlvR, null, MSLAL0444,
										tgtDdlvR.data_no(), tgtDdlvR.data_lno(),
										tgtDdlvR.cst_cd(), tgtDdlvR.cst_po_no(),
										tgtDdlvR.cst_po_d_no(), tgtDdlvR.fix_slo_no(),
										tgtDdlvR.fix_slo_d_no(), canSlsQty,
										trdUnitQty));
								tgtDdlvR.err_flg(true);
							}
							remQty = canSlsQty.subtract(tgtDdlvR.trd_unit_qty());
							tgtDdlvR.fix_base_unit_qty(tgtDdlvR.trd_unit_qty());
						}
						else {
							itmUnitR = getItmUnitCache(tmpSloDR.itm_cd(), tmpSloDR.itm_sub1(), tmpSloDR.itm_sub2(), tmpSloDR.itm_sub3(), tgtDdlvR.trd_unit_cd());
							// 売上予定の総売上可能数を超過する数量の場合
							MCNumber tmpQty = convToBaseUnit(trdUnitQty, itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
									tmpSloDR.getNumberNE("base_unit_dec_place"), tmpSloDR.getStringNE("base_unit_rnd_typ"));
							if (!syncFlg && tmpQty.gt(canSlsQty)) {
								// 売上予定数＝仕入実績数を超過する場合
								msgL.add(new MCMessage(tgtDdlvR, null, MSLAL0444,
										tgtDdlvR.data_no(), tgtDdlvR.data_lno(),
										tgtDdlvR.cst_cd(), tgtDdlvR.cst_po_no(),
										tgtDdlvR.cst_po_d_no(), tgtDdlvR.fix_slo_no(),
										tgtDdlvR.fix_slo_d_no(), canSlsQty, tmpQty));
								tgtDdlvR.err_flg(true);
							}
							if (tmpL.size() == 1) {
								tmpQty = convToBaseUnit(tgtDdlvR.trd_unit_qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
										tmpSloDR.getNumberNE("base_unit_dec_place"), tmpSloDR.getStringNE("base_unit_rnd_typ"));
							}
							remQty = canSlsQty.subtract(tmpQty);
							tgtDdlvR.fix_base_unit_qty(tmpQty);
						}
						
						// 打切チェック
						if (tgtDdlvR.abort_flg()) {
							if (remQty.lte(MCNumber.ZERO)) {
								msgL.add(new MCMessage(tgtDdlvR, null, MSLAL0447,
										tgtDdlvR.data_no(), tgtDdlvR.data_lno(),
										tgtDdlvR.cst_cd(), tgtDdlvR.cst_po_no(),
										tgtDdlvR.cst_po_d_no(), tgtDdlvR.fix_slo_no(),
										tgtDdlvR.fix_slo_d_no()));
								tgtDdlvR.err_flg(true);
							}
						}
					}
				}
			}
			
			MCIndexKey tmpIdx = accptRecvIfL.createIndex(AccptRecvIf_Chk01_DtlR.$cst_cd, AccptRecvIf_Chk01_DtlR.$cst_po_no, AccptRecvIf_Chk01_DtlR.$cst_po_d_no);
			
			for (AccptRecvIf_Chk01_DtlR dtlR : accptRecvIfL) {
				if (dtlR.err_flg() || !dtlR.ddlvTgtFlg() || (isCrt(dtlR) && dtlR.accpt_dfct_flg())) {
					continue;
				}
				MST_SLS_ACT_D_R updSlsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, dtlR.ext_purc_act_d_no(), dtlR.ext_sys_cd());
				if ((isUpd(dtlR) && !isNull(updSlsActDR)) || isDel(dtlR)) {
					MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, dtlR.ext_purc_act_d_no(), dtlR.ext_sys_cd());
					if (!isNull(slsActDR)) {
						// 紐づく詳細の同時計上ＦＬＧがオンのレコードが存在した場合、同時計上
						MST_SLS_ACT_IO_R slsActIoR = _slsActIoL.getFirst(_slsActIoSyncIdxkey, true, slsActDR.sls_act_d_no());
						if (!isNull(slsActIoR)) {
							dtlR.sync_flg(true);
						}
						if (isDel(dtlR)) {
							continue;
						}
						else {
							if (!dtlR.sls_schd_mult_flg()) {
								dtlR.fix_sls_schd_no(slsActDR.sls_schd_no());
							}
						}
					}
					else {
						dtlR.sync_flg(true);
					}
				}
				
				// 売上予定を取得し、仕入済・未完了のレコードがあったら数量をチェック
				if (!isNull(dtlR.fix_sls_schd_no())) {
					// 売上予定が確定している＝分割なし
					MST_SLS_SCHD_R slsSchdR = _slsSchdL.getFirst(_slsSchdNoIdxkey, dtlR.fix_sls_schd_no());
					if (!isNull(slsSchdR.purc_act_d_no()) && !slsSchdR.cmpl_flg() && (isCrt(dtlR) || (isUpd(dtlR) && isNull(updSlsActDR)))) {
						// 仕入後計上
						dtlR.sync_flg(false);
					}
				}
				else if (dtlR.sls_schd_mult_flg()) {
					MCList<MST_SLS_SCHD_R> mltSlsSchdL = filterSlsSchd(_slsSchdL.subList(_slsSchdSloDIdxkey, dtlR.fix_slo_d_no()), dtlR);
					MCIndexKey idxKey = mltSlsSchdL.createIndex(MST_SLS_SCHD_R.$purc_act_d_no, MST_SLS_SCHD_R.$cmpl_flg);
					mltSlsSchdL.sort(MST_SLS_SCHD_R.$sls_schd_dt, MST_SLS_SCHD_R.$sls_schd_no);
					if (accptRecvIfL.subList(tmpIdx, dtlR.cst_cd(), dtlR.cst_po_no(), dtlR.cst_po_d_no()).size() != 1) {
						for (MST_SLS_SCHD_R slsSchdR : mltSlsSchdL) {
							if (!isNull(slsSchdR.purc_act_d_no()) && !slsSchdR.cmpl_flg()) {
								if (!isNull(accptRecvIfL.subList(AccptRecvIf_Chk01_DtlR.$fix_sls_schd_no, slsSchdR.sls_schd_no()))) {
									continue;
								}
								if (isSame(slsSchdR.base_unit_qty(), dtlR.fix_base_unit_qty())) {
									// 仕入後計上
									if (isCrt(dtlR) || (isUpd(dtlR) && isNull(updSlsActDR))) {
										dtlR.sync_flg(false);
										dtlR.fix_sls_schd_no(slsSchdR.sls_schd_no());
										dtlR.sls_schd_mult_flg(false);
										break;
									}
								}
							}
							MCList<MST_SLS_SCHD_R> tmpL = mltSlsSchdL.subList(idxKey, null, false);
							MST_SLS_SCHD_R tmpR = tmpL.getFirst(MST_SLS_SCHD_R.$sls_schd_no, slsSchdR.sls_schd_no());
							if (isNull(tmpR)) {
								if (!isNull(slsSchdR.purc_act_d_no()) && slsSchdR.cmpl_flg()
										&& (isCrt(dtlR) || (isUpd(dtlR) && isNull(updSlsActDR)))) {
									AccptRecvIf_Chk01_DtlR tmpIfR = accptRecvIfL.getFirst(AccptRecvIf_Chk01_DtlR.$fix_sls_schd_no, slsSchdR.sls_schd_no());
									if (!isNull(tmpIfR) && !isCrt(tmpIfR)) {
										String maxSlsSchdNo = (String)mltSlsSchdL.max(MST_SLS_SCHD_R.$sls_schd_no);
										if (isSame(slsSchdR.sls_schd_no(), maxSlsSchdNo)) {
											dtlR.sync_flg(true);
											dtlR.fix_sls_schd_no(slsSchdR.sls_schd_no());
											dtlR.sls_schd_mult_flg(false);
											break;
										}
									}
								}
								continue;
							}
							else {
								if (isNull(slsSchdR.purc_act_d_no()) && !slsSchdR.cmpl_flg()) {
									dtlR.sync_flg(true);
								}
							}
						}
					}
					else {
						MCNumber tmpQty = MCNumber.ZERO;
						for (MST_SLS_SCHD_R slsSchdR : mltSlsSchdL) {
							if (!isNull(slsSchdR.purc_act_d_no())) {
								if ((isCrt(dtlR) || (isUpd(dtlR) && isNull(updSlsActDR))) && !slsSchdR.cmpl_flg()) {
									tmpQty = tmpQty.add(slsSchdR.base_unit_qty().subtract(slsSchdR.base_unit_sls_qty().add(slsSchdR.base_unit_abort_qty())));
								}
								else if (isUpd(dtlR) && !isNull(updSlsActDR)){
									tmpQty = tmpQty.add(slsSchdR.base_unit_qty());
								}
							}
						}
						
						if (isSame(tmpQty, dtlR.fix_base_unit_qty())) {
							// 仕入後計上
							if (isCrt(dtlR) || (isUpd(dtlR) && isNull(updSlsActDR))) {
								dtlR.sync_flg(false);
							}
						}
						else if (!tmpQty.isZero() && tmpQty.lt(dtlR.fix_base_unit_qty()) && !dtlR.sync_flg()){
							msgL.add(new MCMessage(dtlR, null, MSLAL0456, dtlR.data_no(),
									dtlR.data_lno(), dtlR.cst_cd(), dtlR.cst_po_no(),
									dtlR.cst_po_d_no(), tmpQty,
									dtlR.fix_base_unit_qty()));
							dtlR.err_flg(true);
						}
					}
				}
			}
			
			for (AccptRecvIf_Chk01_DtlR dtlR : accptRecvIfL) {
				itmUnitR = getItmUnitCache(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.trd_unit_cd());
				if (!isNull(itmUnitR.itm_cd()) && !useIfUpri(dtlR)) {
					dtlR.trd_unit_conv_qty(itmUnitR.conv_qty());
					dtlR.trd_unit_conv_base_qty(itmUnitR.conv_base_qty());
					calcTrdCurUpri(dtlR);
				}
			}
			
			return msgL;
		}
		
		/**
		 * 売上禁止チェック（得意先、品目）
		 */
		protected MCMessageList slsStopChk(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			accptRecvIfL.setValue(AccptRecvIf_Chk01_DtlR.$base_dt, getToday());
			
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_BP$F_IS_SLS_STOP", "01"),
					MABSFunction.getFunctionExecuter("MAPA_BP$F_IS_SLS_STOP"),
					AccptRecvIf_Chk01_DtlR.$cst_sls_stop_flg, accptRecvIfL,
					AccptRecvIf_Chk01_DtlR.$cst_cd, AccptRecvIf_Chk01_DtlR.$base_dt);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_ITM$F_IS_SLS_STOP", "01"),
					MABSFunction.getFunctionExecuter("MAPA_ITM$F_IS_SLS_STOP"),
					AccptRecvIf_Chk01_DtlR.$itm_sls_stop_flg, accptRecvIfL,
					AccptRecvIf_Chk01_DtlR.$itm_cd, AccptRecvIf_Chk01_DtlR.$itm_sub1,
					AccptRecvIf_Chk01_DtlR.$itm_sub2, AccptRecvIf_Chk01_DtlR.$itm_sub3,
					AccptRecvIf_Chk01_DtlR.$base_dt);
			
			for (AccptRecvIf_Chk01_DtlR chkR : accptRecvIfL) {
				if (isDel(chkR) || chkR.err_flg()) {
					continue;
				}
				if (chkR.cst_sls_stop_flg()) {
					msgL.add(new MCMessage(chkR, AccptRecvIf_Chk01_DtlR.$cst_cd,
							MSLAL0454, chkR.data_no(), chkR.data_lno(), chkR.cst_cd(),
							chkR.org_dlv_slip_no(), chkR.org_dlv_slip_d_no(),
							chkR.cst_po_no(), chkR.cst_po_d_no(),
							toYMDString(chkR.base_dt()), toDispGUIIndex(chkR)));
					chkR.err_flg(true);
				}
				if (chkR.itm_sls_stop_flg()) {
					msgL.add(new MCMessage(chkR, AccptRecvIf_Chk01_DtlR.$itm_cd,
							MSLAL0455, chkR.data_no(), chkR.data_lno(), chkR.cst_cd(),
							chkR.org_dlv_slip_no(), chkR.org_dlv_slip_d_no(),
							chkR.cst_po_no(), chkR.cst_po_d_no(),
							toDispItm(chkR.itm_cd(), chkR.itm_sub1(), chkR.itm_sub2(), chkR.itm_sub3()),
							toYMDString(chkR.base_dt()), toDispGUIIndex(chkR)));
					chkR.err_flg(true);
				}
			}
			
			return msgL;
		}
		
		/**
		 * 取消対象の売上実績存在チェックおよび打切未解除取消チェック
		 */
		protected MCMessageList existSlsActChk(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			for (AccptRecvIf_Chk01_DtlR dtlR : accptRecvIfL) {
				if (dtlR.err_flg()) {
					continue;
				}
				if (isDel(dtlR)) {
					MST_SLS_ACT_D_R tmpSlsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, dtlR.ext_purc_act_d_no(), dtlR.ext_sys_cd());
					if (isNull(tmpSlsActDR)) {
						msgL.add(new MCMessage(dtlR, null, MSLAL0452, dtlR.data_no(),
								dtlR.data_lno(), dtlR.cst_cd(), dtlR.org_dlv_slip_no(),
								dtlR.org_dlv_slip_d_no(), dtlR.cst_po_no(),
								dtlR.cst_po_d_no(),
								toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
								toDispSno(dtlR.sno1(), dtlR.sno2(), dtlR.sno3(), dtlR.sno4()),
								dtlR.ext_sys_cd(), dtlR.ext_purc_act_d_no()));
						dtlR.err_flg(true);
					}
					else {
						MST_SLS_SCHD_R slsSchdR = _slsSchdL.getFirst(_slsSchdNoIdxkey, tmpSlsActDR.sls_schd_no());
						if (slsSchdR.abort_flg()) {
							msgL.add(new MCMessage(dtlR, null, MSLAL0453, dtlR.data_no(),
									dtlR.data_lno(), dtlR.cst_cd(),
									dtlR.org_dlv_slip_no(), dtlR.org_dlv_slip_d_no(),
									dtlR.cst_po_no(), dtlR.cst_po_d_no()));
							dtlR.err_flg(true);
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * インボイス明細件数チェック
		 */
		protected MCMessageList ivCntChk(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<AccptRecvIf_Chk01_DtlR> tgtL = accptRecvIfL.subList(AccptRecvIf_Chk01_DtlR.$err_flg, false);
			
			MCIndexKey ivIdx = tgtL.createIndex(
					AccptRecvIf_Chk01_DtlR.$imp_flg,
					AccptRecvIf_Chk01_DtlR.$iv_flg
					);
			
			MCList<AccptRecvIf_Chk01_DtlR> ivL = tgtL.subList(ivIdx, true, true);
			MCList<AccptRecvIf_Chk01_DtlR> ivGrpL = ivL.groupBy(AccptRecvIf_Chk01_DtlR.$data_crud_typ, AccptRecvIf_Chk01_DtlR.$fix_dlv_slip_no);
			MCIndexKey ivLIdx = ivL.createIndex(AccptRecvIf_Chk01_DtlR.$fix_dlv_slip_no);
			
			for (AccptRecvIf_Chk01_DtlR ivGrpR : ivGrpL) {
				if (!isNull(ivGrpR.fix_dlv_slip_no())) {
					MST_IV_R ivR = _ivL.getFirst(_ivIdxkey, ivGrpR.fix_dlv_slip_no());
					MCList<MST_IV_D_R> ivDL = _ivDL.subList(_ivDIvMngNoIdxkey, ivR.iv_mng_no());
					MCList<AccptRecvIf_Chk01_DtlR> tgtIvL = ivL.subList(ivLIdx, ivGrpR.fix_dlv_slip_no());
					
					if (!isSame(ivDL.size(), tgtIvL.size())) {
						for (AccptRecvIf_Chk01_DtlR tgtIvR : tgtIvL) {
							msgL.add(new MCMessage(tgtIvR, null, MSLAL0450,
									tgtIvR.data_no(), tgtIvR.data_lno(), tgtIvR.cst_cd(),
									tgtIvR.org_dlv_slip_no(), tgtIvR.org_dlv_slip_d_no(),
									tgtIvR.cst_po_no(), tgtIvR.cst_po_d_no(),
									tgtIvR.ext_sys_cd(), tgtIvR.ext_purc_act_d_no()));
							tgtIvR.err_flg(true);
						}
						break;
					}
					
					if (isUpd(ivGrpR)) {
						MCList<MST_SLS_ACT_R> tmpSlsActL = _slsActL.subList(_slsActIvIdxKey, ivGrpR.fix_dlv_slip_no());
						int ttlSize = 0;
						for (MST_SLS_ACT_R tmpSlsActR : tmpSlsActL) {
							ttlSize += _slsActDL.subList(_slsActDSlsActNoIdxkey, tmpSlsActR.sls_act_no()).size();
						}
						
						if (!isNull(tmpSlsActL) && !isSame(tgtIvL.size(), ttlSize)) {
							for (AccptRecvIf_Chk01_DtlR tgtIvR : tgtIvL) {
								msgL.add(new MCMessage(tgtIvR, null, MSLAL0450,
										tgtIvR.data_no(), tgtIvR.data_lno(),
										tgtIvR.cst_cd(), tgtIvR.org_dlv_slip_no(),
										tgtIvR.org_dlv_slip_d_no(), tgtIvR.cst_po_no(),
										tgtIvR.cst_po_d_no(),
										tgtIvR.ext_sys_cd(), tgtIvR.ext_purc_act_d_no()));
								tgtIvR.err_flg(true);
							}
						}
					}
				}
			}
			
			for (AccptRecvIf_Chk01_DtlR tgtR : tgtL) {
				if (isCrt(tgtR)) {
					continue;
				}
				MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, tgtR.ext_purc_act_d_no(), tgtR.ext_sys_cd());
				if (isDel(tgtR) && isNull(slsActDR)) {
					msgL.add(new MCMessage(tgtR, null, MSLAL0462, tgtR.data_no(),
							tgtR.data_lno(), tgtR.cst_cd(), tgtR.org_dlv_slip_no(),
							tgtR.org_dlv_slip_d_no(), tgtR.cst_po_no(),
							tgtR.cst_po_d_no(), tgtR.ext_sys_cd(), tgtR.ext_purc_act_d_no()));
					tgtR.err_flg(true);
				}
			}
			
			return msgL;
		}
		
		/**
		 * 数量関連チェック
		 */
		protected MCMessageList qtyChk(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<AccptRecvIf_Chk01_DtlR> tgtL = accptRecvIfL.subList(AccptRecvIf_Chk01_DtlR.$err_flg, false);
			
			MCIndexKey dlvIdx = tgtL.createIndex(
					AccptRecvIf_Chk01_DtlR.$imp_flg,
					AccptRecvIf_Chk01_DtlR.$iv_flg,
					AccptRecvIf_Chk01_DtlR.$accpt_dfct_flg,
					AccptRecvIf_Chk01_DtlR.$ddlvTgtFlg
					);
			MCIndexKey ivIdx = tgtL.createIndex(
					AccptRecvIf_Chk01_DtlR.$imp_flg,
					AccptRecvIf_Chk01_DtlR.$iv_flg,
					AccptRecvIf_Chk01_DtlR.$accpt_dfct_flg,
					AccptRecvIf_Chk01_DtlR.$ddlvTgtFlg
					);
			MCIndexKey ddlvIvIdx = tgtL.createIndex(
					AccptRecvIf_Chk01_DtlR.$imp_flg,
					AccptRecvIf_Chk01_DtlR.$iv_flg,
					AccptRecvIf_Chk01_DtlR.$accpt_dfct_flg,
					AccptRecvIf_Chk01_DtlR.$ddlvTgtFlg
					);
			
			MCList<AccptRecvIf_Chk01_DtlR> dlvSlipL = tgtL.subList(dlvIdx, true, false, false, false);
			MCList<AccptRecvIf_Chk01_DtlR> ivL = tgtL.subList(ivIdx, true, true, false, false);
			MCList<AccptRecvIf_Chk01_DtlR> ddlvIvL = tgtL.subList(ddlvIvIdx, true, true, false, true);
			MCIndexKey dlvSlipLIdx = dlvSlipL.createIndex(AccptRecvIf_Chk01_DtlR.$fix_dlv_slip_no);
			MCIndexKey ivLIdx = ivL.createIndex(AccptRecvIf_Chk01_DtlR.$fix_dlv_slip_no);
			
			MCList<AccptRecvIf_Chk01_DtlR> ivGrpL = ivL.groupBy(AccptRecvIf_Chk01_DtlR.$fix_dlv_slip_no);
			MCList<AccptRecvIf_Chk01_DtlR> dlvSlipGrpL = dlvSlipL.groupBy(AccptRecvIf_Chk01_DtlR.$fix_dlv_slip_no);
			
			MAVM_ITM_UNIT_R itmUnitR = null;
			
			MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			
			// 仕入直送売上（インボイス対象）
			chkForDdlvIvQty(msgL, ddlvIvL);
			
			// 検収基準売上（インボイス対象）
			chkForIvQty(msgL, ivGrpL, ivL, ivLIdx);
			
			// 検収基準売上（インボイス対象外）
			chkForDlivSlipQty(msgL, dlvSlipGrpL, dlvSlipL, slsSchdL, itmUnitR, dlvSlipLIdx);
			
			return msgL;
		}
		
		/**
		 * 仕入直送売上（インボイス対象）の数量チェック処理
		 */
		protected void chkForDdlvIvQty(
				MCMessageList msgL,
				MCList<AccptRecvIf_Chk01_DtlR> ddlvIvL) {
			// 仕入直送売上（インボイス対象）
			for (AccptRecvIf_Chk01_DtlR ddlvIvR : ddlvIvL) {
				if (ddlvIvR.err_flg() || isDel(ddlvIvR)) {
					continue;
				}
				if (!isNull(ddlvIvR.fix_sls_schd_no())) {
					// 売上予定が一意に特定
					MST_SLS_SCHD_R tmpSlsSchdR = _slsSchdL.getFirst(_slsSchdNoIdxkey, ddlvIvR.fix_sls_schd_no());
					
					if (isNull(tmpSlsSchdR.purc_act_d_no())) {
						ddlvIvR.sync_flg(true);
					}
					
					if (!isCrt(ddlvIvR)) {
						MST_SLS_ACT_D_R tmpSlsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, ddlvIvR.ext_purc_act_d_no(), ddlvIvR.ext_sys_cd());
						if (!isNull(tmpSlsActDR)) {
							MST_SLS_ACT_IO_R slsActIoR = _slsActIoL.getFirst(_slsActIoSyncIdxkey, true, tmpSlsActDR.sls_act_d_no());
							if (!isNull(slsActIoR)) {
								ddlvIvR.sync_flg(true);
							}
						}
					}
					
					MST_IV_D_R tmpIvDR = _ivDL.getFirst(_ivDIdxkey, tmpSlsSchdR.iv_d_no());
					if (!isNull(tmpIvDR)) {
						// インボイス明細の数量と異なる場合
						if (!isSame(ddlvIvR.trd_unit_qty(), tmpIvDR.trd_unit_qty())) {
							msgL.add(new MCMessage(ddlvIvR, null, MSLAL0445,
									ddlvIvR.data_no(), ddlvIvR.data_lno(),
									ddlvIvR.cst_cd(), ddlvIvR.org_dlv_slip_no(),
									ddlvIvR.org_dlv_slip_d_no(), ddlvIvR.cst_po_no(),
									ddlvIvR.cst_po_d_no(), tmpIvDR.trd_unit_qty(),
									ddlvIvR.trd_unit_qty()));
							ddlvIvR.err_flg(true);
						}
						// 打切チェック
						if (ddlvIvR.abort_flg()) {
							msgL.add(new MCMessage(ddlvIvR, null, MSLAL0448,
									ddlvIvR.data_no(), ddlvIvR.data_lno(),
									ddlvIvR.cst_cd(), ddlvIvR.org_dlv_slip_no(),
									ddlvIvR.org_dlv_slip_d_no(), ddlvIvR.cst_po_no(),
									ddlvIvR.cst_po_d_no()));
							ddlvIvR.err_flg(true);
						}
						ddlvIvR.fix_base_unit_qty(tmpIvDR.base_unit_qty());
					}
				}
			}
		}
		
		/**
		 * 検収基準売上（インボイス対象）の数量チェック処理
		 */
		protected void chkForIvQty(
				MCMessageList msgL,
				MCList<AccptRecvIf_Chk01_DtlR> ivGrpL,
				MCList<AccptRecvIf_Chk01_DtlR> ivL,
				MCIndexKey ivLIdx) {
			// 検収基準売上（インボイス対象）
			for (AccptRecvIf_Chk01_DtlR ivGrpR : ivGrpL) {
				MCList<AccptRecvIf_Chk01_DtlR> tgtIvL = ivL.subList(ivLIdx, ivGrpR.fix_dlv_slip_no());
				for (AccptRecvIf_Chk01_DtlR tgtIvR : tgtIvL) {
					if (isDel(tgtIvR) || tgtIvR.err_flg() || isNull(tgtIvR.fix_dlv_slip_d_no())) {
						continue;
					}
					MST_IV_D_R tmpIvDR = _ivDL.getFirst(_ivDIdxkey, tgtIvR.fix_dlv_slip_d_no());
					if (!isNull(tmpIvDR)) {
						// インボイス明細の数量と異なる場合
						if (!isSame(tgtIvR.trd_unit_qty(), tmpIvDR.trd_unit_qty())) {
							msgL.add(new MCMessage(tgtIvR, null, MSLAL0445,
									tgtIvR.data_no(), tgtIvR.data_lno(), tgtIvR.cst_cd(),
									tgtIvR.org_dlv_slip_no(), tgtIvR.org_dlv_slip_d_no(),
									tgtIvR.cst_po_no(), tgtIvR.cst_po_d_no(),
									tmpIvDR.trd_unit_qty(), tgtIvR.trd_unit_qty()));
							tgtIvR.err_flg(true);
						}
						// 打切チェック
						if (tgtIvR.abort_flg()) {
							msgL.add(new MCMessage(tgtIvR, null, MSLAL0448,
									tgtIvR.data_no(), tgtIvR.data_lno(), tgtIvR.cst_cd(),
									tgtIvR.org_dlv_slip_no(), tgtIvR.org_dlv_slip_d_no(),
									tgtIvR.cst_po_no(), tgtIvR.cst_po_d_no()));
							tgtIvR.err_flg(true);
						}
						tgtIvR.fix_base_unit_qty(tmpIvDR.base_unit_qty());
					}
				}
			}
		}
		
		/**
		 * 検収基準売上（インボイス対象外）の数量チェック処理
		 */
		protected void chkForDlivSlipQty(
				MCMessageList msgL,
				MCList<AccptRecvIf_Chk01_DtlR> dlvSlipGrpL,
				MCList<AccptRecvIf_Chk01_DtlR> dlvSlipL,
				MCList<MST_SLS_SCHD_R> slsSchdL,
				MAVM_ITM_UNIT_R itmUnitR,
				MCIndexKey dlvSlipLIdx) {
			// 検収基準売上（インボイス対象外）
			for (AccptRecvIf_Chk01_DtlR dlvSlipGrpR : dlvSlipGrpL) {
				MCList<AccptRecvIf_Chk01_DtlR> tgtDlvSlipL = dlvSlipL.subList(dlvSlipLIdx, dlvSlipGrpR.fix_dlv_slip_no());
				tgtDlvSlipL.sort(AccptRecvIf_Chk01_DtlR.$fix_dlv_slip_d_no, AccptRecvIf_Chk01_DtlR.$data_lno);
				String befDlvSlipDNo = null;
				MCNumber useQty = MCNumber.ZERO;
				for (AccptRecvIf_Chk01_DtlR tgtDlvSlipR : tgtDlvSlipL) {
					if (isDel(tgtDlvSlipR) || tgtDlvSlipR.err_flg() || isNull(tgtDlvSlipR.fix_dlv_slip_no())) {
						continue;
					}
					if (isNull(befDlvSlipDNo)) {
						befDlvSlipDNo = tgtDlvSlipR.fix_dlv_slip_d_no();
					}
					else {
						if (!isSame(befDlvSlipDNo, tgtDlvSlipR.fix_dlv_slip_d_no())) {
							useQty = MCNumber.ZERO;
						}
					}
					slsSchdL.clear();
					MST_SLS_SCHD_R slsSchdR = MST_SLS_SCHD_R.create();
					if (!isNull(tgtDlvSlipR.fix_sls_schd_no())) {
						slsSchdR = _slsSchdL.getFirst(_slsSchdNoIdxkey, tgtDlvSlipR.fix_sls_schd_no());
						slsSchdL.add(slsSchdR);
					}
					else if (tgtDlvSlipR.sls_schd_mult_flg()) {
						slsSchdL.addAll(_slsSchdL.subList(_slsSchdSloDIdxkey, tgtDlvSlipR.fix_dlv_slip_d_no()));
					}
					
					MCList<MST_SLS_SCHD_R> slsSchdGrpL = slsSchdL.groupBy(
							MST_SLS_SCHD_R.$sls_schd_no,
							MST_SLS_SCHD_R.$slo_d_no,
							MST_SLS_SCHD_R.$dlv_slip_d_no,
							MST_SLS_SCHD_R.$iv_no,
							MST_SLS_SCHD_R.$iv_d_no,
							MST_SLS_SCHD_R.$purc_act_d_no,
							MST_SLS_SCHD_R.$sls_schd_dt,
							MST_SLS_SCHD_R.$trd_unit_cd,
							MST_SLS_SCHD_R.$base_unit_cd,
							MST_SLS_SCHD_R.$base_unit_qty,
							MST_SLS_SCHD_R.$base_unit_abort_qty,
							MST_SLS_SCHD_R.$base_unit_sls_qty
							);
					
					MCNumber canSlsQty = null;
					MCNumber remQty = MCNumber.ZERO;
					// 売上可能数量の算出
					for (MST_SLS_SCHD_R slsSchdGrpR : slsSchdGrpL) {
						if (isNull(canSlsQty)) {
							canSlsQty = MCNumber.ZERO;
						}
						if (useQty.isZero()) {
							canSlsQty = canSlsQty.add(slsSchdGrpR.base_unit_qty().subtract(slsSchdGrpR.base_unit_sls_qty()));
						}
						else {
							canSlsQty = canSlsQty.add(slsSchdGrpR.base_unit_qty().subtract(useQty));
						}
					}
					
					// 更新対象の場合、自分自身の売上済数量を売上可能数に戻す
					if (isUpd(tgtDlvSlipR)) {
						MST_SLS_ACT_D_R tmpSlsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, tgtDlvSlipR.ext_purc_act_d_no(), tgtDlvSlipR.ext_sys_cd());
						if (!isNull(tmpSlsActDR)) {
							canSlsQty = canSlsQty.add(tmpSlsActDR.base_unit_qty());
						}
					}
					
					MST_DLV_SLIP_D_R tmpDlvSlipDR = _dlvSlipDL.getFirst(_dlvSlipDIdxkey, tgtDlvSlipR.fix_dlv_slip_d_no());
					if (!isNull(tmpDlvSlipDR) && !isNull(canSlsQty)) {
						// 取引単位＝基準単位
						if (isSame(tmpDlvSlipDR.trd_unit_cd(), tmpDlvSlipDR.base_unit_cd())
							&& isSame(tmpDlvSlipDR.trd_unit_cd(), tgtDlvSlipR.trd_unit_cd())) {
							// 売上予定の総売上可能数を超過する数量の場合
							if (tgtDlvSlipR.trd_unit_qty().gt(canSlsQty)) {
								msgL.add(new MCMessage(tgtDlvSlipR, null, MSLAL0446,
										tgtDlvSlipR.data_no(), tgtDlvSlipR.data_lno(),
										tgtDlvSlipR.cst_cd(),
										tgtDlvSlipR.org_dlv_slip_no(),
										tgtDlvSlipR.org_dlv_slip_d_no(),
										tgtDlvSlipR.cst_po_no(),
										tgtDlvSlipR.cst_po_d_no(),
										canSlsQty,
										tgtDlvSlipR.trd_unit_qty()));
								tgtDlvSlipR.err_flg(true);
							}
							remQty = canSlsQty.subtract(tgtDlvSlipR.trd_unit_qty());
							useQty = tgtDlvSlipR.trd_unit_qty();
							tgtDlvSlipR.fix_base_unit_qty(tgtDlvSlipR.trd_unit_qty());
						}
						else {
							itmUnitR = getItmUnitCache(tgtDlvSlipR.itm_cd(), tgtDlvSlipR.itm_sub1(), tgtDlvSlipR.itm_sub2(), tgtDlvSlipR.itm_sub3(), tgtDlvSlipR.trd_unit_cd());
							// 売上予定の総売上可能数を超過する数量の場合
							MCNumber tmpQty = convToBaseUnit(tgtDlvSlipR.trd_unit_qty(),
									itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
									tmpDlvSlipDR.getNumberNE("base_unit_dec_place"), tmpDlvSlipDR.getStringNE("base_unit_rnd_typ"));
							if (tmpQty.gt(canSlsQty)) {
								msgL.add(new MCMessage(tgtDlvSlipR, null, MSLAL0446,
										tgtDlvSlipR.data_no(), tgtDlvSlipR.data_lno(),
										tgtDlvSlipR.cst_cd(),
										tgtDlvSlipR.org_dlv_slip_no(),
										tgtDlvSlipR.org_dlv_slip_d_no(),
										tgtDlvSlipR.cst_po_no(),
										tgtDlvSlipR.cst_po_d_no(),
										canSlsQty,
										tmpQty));
								tgtDlvSlipR.err_flg(true);
							}
							remQty = canSlsQty.subtract(tmpQty);
							useQty = tmpQty;
							tgtDlvSlipR.fix_base_unit_qty(tmpQty);
						}
						
						// 打切チェック
						if (tgtDlvSlipR.abort_flg()) {
							if (remQty.lte(MCNumber.ZERO)) {
								msgL.add(new MCMessage(tgtDlvSlipR, null, MSLAL0449,
										tgtDlvSlipR.data_no(), tgtDlvSlipR.data_lno(),
										tgtDlvSlipR.cst_cd(),
										tgtDlvSlipR.org_dlv_slip_no(),
										tgtDlvSlipR.org_dlv_slip_d_no(),
										tgtDlvSlipR.cst_po_no(),
										tgtDlvSlipR.cst_po_d_no()
										));
								tgtDlvSlipR.err_flg(true);
							}
						}
					}
				}
			}
		}
		
		/**
		 * 処理グループエラーチェック
		 */
		protected MCMessageList grpErrChk(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			MCIndexKey dlvIdx = accptRecvIfL.createIndex(
					AccptRecvIf_Chk01_DtlR.$imp_flg,
					AccptRecvIf_Chk01_DtlR.$accpt_dfct_flg,
					AccptRecvIf_Chk01_DtlR.$ddlvTgtFlg
					);
			MCIndexKey ivIdx = accptRecvIfL.createIndex(
					AccptRecvIf_Chk01_DtlR.$imp_flg,
					AccptRecvIf_Chk01_DtlR.$iv_flg,
					AccptRecvIf_Chk01_DtlR.$accpt_dfct_flg,
					AccptRecvIf_Chk01_DtlR.$ddlvTgtFlg
					);
			MCIndexKey ddlvIdx = accptRecvIfL.createIndex(
					AccptRecvIf_Chk01_DtlR.$imp_flg,
					AccptRecvIf_Chk01_DtlR.$iv_flg,
					AccptRecvIf_Chk01_DtlR.$accpt_dfct_flg,
					AccptRecvIf_Chk01_DtlR.$ddlvTgtFlg
					);
			
			MCList<AccptRecvIf_Chk01_DtlR> dlvSlipL = accptRecvIfL.subList(dlvIdx, true, false, false);
			MCList<AccptRecvIf_Chk01_DtlR> ivL = accptRecvIfL.subList(ivIdx, true, true, false, false, false);
			MCList<AccptRecvIf_Chk01_DtlR> ddlvL = accptRecvIfL.subList(ddlvIdx, true, false, false,true);
			MCIndexKey dlvSlipLIdx = dlvSlipL.createIndex(AccptRecvIf_Chk01_DtlR.$err_flg, AccptRecvIf_Chk01_DtlR.$fix_dlv_slip_no);
			MCIndexKey ivLIdx = ivL.createIndex(AccptRecvIf_Chk01_DtlR.$err_flg, AccptRecvIf_Chk01_DtlR.$fix_dlv_slip_no);
			MCIndexKey ddlvLIdx = ddlvL.createIndex(AccptRecvIf_Chk01_DtlR.$err_flg, AccptRecvIf_Chk01_DtlR.$fix_slo_no);
			
			for (AccptRecvIf_Chk01_DtlR dtlR : accptRecvIfL) {
				if (dtlR.err_flg() || dtlR.accpt_dfct_flg()) {
					continue;
				}
				// 仕入直送売上
				if (dtlR.ddlvTgtFlg() && !isNull(dtlR.fix_slo_no())) {
					AccptRecvIf_Chk01_DtlR ddlvR = ddlvL.getFirst(ddlvLIdx, true, dtlR.fix_slo_no());
					if (!isNull(ddlvR)) {
						msgL.add(new MCMessage(dtlR, null, MSLAL0441, dtlR.data_no(),
								dtlR.data_lno(), dtlR.cst_cd(), dtlR.cst_po_no(),
								dtlR.cst_po_d_no(), dtlR.fix_slo_no()));
						dtlR.err_flg(true);
					}
				}
				// 検収基準売上（インボイス対象）
				else if (dtlR.iv_flg() && !isNull(dtlR.fix_dlv_slip_no())) {
					AccptRecvIf_Chk01_DtlR ivR = ivL.getFirst(ivLIdx, true, dtlR.fix_dlv_slip_no());
					if (!isNull(ivR)) {
						msgL.add(new MCMessage(dtlR, null, MSLAL0442, dtlR.data_no(),
								dtlR.data_lno(), dtlR.org_dlv_slip_no()));
						dtlR.err_flg(true);
					}
				}
				// 検収基準売上（インボイス対象外）
				else {
					if (!isNull(dtlR.fix_dlv_slip_no())) {
						AccptRecvIf_Chk01_DtlR dlvSlipR = dlvSlipL.getFirst(dlvSlipLIdx, true, dtlR.fix_dlv_slip_no());
						if (!isNull(dlvSlipR)) {
							msgL.add(new MCMessage(dtlR, null, MSLAL0443, dtlR.data_no(),
									dtlR.data_lno(), dtlR.cst_cd(), dtlR.org_dlv_slip_no()));
							dtlR.err_flg(true);
						}
					}
				}
			}
			
			return msgL;
		}
		
		protected MCMessageList chkForCred(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (AccptRecvIf_Chk01_DtlR accptRecvIfR : accptRecvIfL) {
				if (isDel(accptRecvIfR) || accptRecvIfR.err_flg() || accptRecvIfR.accpt_dfct_flg()) {
					continue;
				}
				MAM_TAX_R orgTaxR = getOrgTaxCache(accptRecvIfR.org_tax_cd());
				if (orgTaxR.isEmpty()) {
					msgL.add(orgTaxCdNotExistMsg(accptRecvIfR));
					accptRecvIfR.err_flg(true);
				}
			}
			return msgL;
		}
		/**
		 * 税に関連するチェック処理
		 */
		protected MCMessageList chkTax(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			MCIndexKey sloDAllSloDNoIdxkey = getSloDAllSloDNoIdxkey();
			
			for (AccptRecvIf_Chk01_DtlR accptRecvIfR : accptRecvIfL) {
				if (isDel(accptRecvIfR) || accptRecvIfR.err_flg() || accptRecvIfR.accpt_dfct_flg()) {
					continue;
				}
				
				MAM_TAX_R ifTaxR = MAM_TAX_R.create();
				MAM_TAX_R fixTaxR = getOrgTaxCache(accptRecvIfR.fix_tax_cd());
				
				if (isTaxInfoNull(accptRecvIfR)) {
					if (fixTaxR.isEmpty()) {
						msgL.add(new MCMessage(accptRecvIfR, null, MSLAL0933,
								accptRecvIfR.data_no(), accptRecvIfR.data_lno(),
								accptRecvIfR.fix_tax_cd()));
						accptRecvIfR.err_flg(true);
						continue;
					}
					ifTaxR = fixTaxR;
				}
				else {
					ifTaxR = getSlsTaxCd(accptRecvIfR);
				}
				if (!accptRecvIfR.tax_not_chk_flg()) {
					if (ifTaxR.isEmpty()) {
						msgL.add(new MCMessage(accptRecvIfR, null, MSLAL0013,
								accptRecvIfR.data_no(), accptRecvIfR.data_lno(),
								accptRecvIfR.tax_rate(), accptRecvIfR.tax_typ(),
								accptRecvIfR.inc_tax_flg()));
						accptRecvIfR.err_flg(true);
					}
					if (fixTaxR.isEmpty()) {
						msgL.add(new MCMessage(accptRecvIfR, null, MSLAL0933,
								accptRecvIfR.data_no(), accptRecvIfR.data_lno(),
								accptRecvIfR.fix_tax_cd()));
						accptRecvIfR.err_flg(true);
					}
					if (!isTaxInfoNull(accptRecvIfR) && !accptRecvIfR.err_flg()
							&& (!isSame(fixTaxR.tax_rate(), accptRecvIfR.tax_rate())
									|| !isSame(fixTaxR.tax_typ(), accptRecvIfR.tax_typ())
									|| !isSame(fixTaxR.inc_tax_flg(), accptRecvIfR.inc_tax_flg()))){
						msgL.add(diffTaxRateMsg(accptRecvIfR, ifTaxR));
						accptRecvIfR.err_flg(true);
					}
				} 
				else {
					MST_SLO_D_R tmpSloDR = _sloDAllL.getFirst(sloDAllSloDNoIdxkey, accptRecvIfR.fix_slo_d_no());
					if (!accptRecvIfR.err_flg() && useIfData() && !tmpSloDR.tax_fix_flg() && !ifTaxR.isEmpty()) {
						complTaxInfo(accptRecvIfR, ifTaxR.tax_cd());
						continue;
					}
					if (fixTaxR.isEmpty()) {
						msgL.add(new MCMessage(accptRecvIfR, null, MSLAL0933,
								accptRecvIfR.data_no(), accptRecvIfR.data_lno(),
								accptRecvIfR.fix_tax_cd()));
						accptRecvIfR.err_flg(true);
						continue;
					}
				}
				complTaxInfo(accptRecvIfR, fixTaxR.tax_cd());
			}
			
			return msgL;
		}
		protected void complTaxInfo(AccptRecvIf_Chk01_DtlR accptRecvIfR, String taxCd) {
			MAM_TAX_R taxR = getTaxR(taxCd);
			accptRecvIfR.fix_tax_cd(taxCd);
			accptRecvIfR.tax_rate(taxR.tax_rate());
			accptRecvIfR.tax_typ(taxR.tax_typ());
			accptRecvIfR.inc_tax_flg(taxR.inc_tax_flg());
		}
		protected MCMessage diffTaxRateMsg(AccptRecvIf_Chk01_DtlR accptRecvIfR, MAM_TAX_R taxR) {
			if (accptRecvIfR.iv_flg()) {
				return (new MCMessage(accptRecvIfR, null, MSLAL0438,
						accptRecvIfR.data_no(), accptRecvIfR.data_lno(),
						accptRecvIfR.cst_cd(),
						accptRecvIfR.org_dlv_slip_no(),
						accptRecvIfR.org_dlv_slip_d_no(),
						accptRecvIfR.cst_po_no(),
						accptRecvIfR.cst_po_d_no(),
						accptRecvIfR.fix_tax_cd(),
						taxR.tax_cd()));
			}
			else {
				return (new MCMessage(accptRecvIfR, null, MSLAL0934,
						accptRecvIfR.data_no(), accptRecvIfR.data_lno(),
						accptRecvIfR.fix_tax_cd(),
						taxR.tax_cd()));
			}
		}
		protected MCMessage orgTaxCdNotExistMsg(AccptRecvIf_Chk01_DtlR accptRecvIfR) {
			if (!accptRecvIfR.ddlvTgtFlg() || accptRecvIfR.ivDdlvTgtFlg()) {
				if (accptRecvIfR.iv_flg()) {
					return (new MCMessage(accptRecvIfR, null, MSLAL0654,
							accptRecvIfR.data_no(), accptRecvIfR.data_lno(),
							accptRecvIfR.cst_cd(),
							accptRecvIfR.org_dlv_slip_no(),
							accptRecvIfR.org_dlv_slip_d_no(),
							accptRecvIfR.cst_po_no(),
							accptRecvIfR.cst_po_d_no(),
							accptRecvIfR.org_tax_cd()));
				}
				else {
					return (new MCMessage(accptRecvIfR, null, MSLAL0655,
							accptRecvIfR.data_no(), accptRecvIfR.data_lno(),
							accptRecvIfR.cst_cd(),
							accptRecvIfR.org_dlv_slip_no(),
							accptRecvIfR.org_dlv_slip_d_no(),
							accptRecvIfR.org_tax_cd()));
				}
			}
			else {
				return (new MCMessage(accptRecvIfR, null, MSLAL0653,
						accptRecvIfR.data_no(), accptRecvIfR.data_lno(),
						accptRecvIfR.cst_cd(),
						accptRecvIfR.cst_po_no(),
						accptRecvIfR.cst_po_d_no(),
						accptRecvIfR.fix_slo_no(),
						accptRecvIfR.fix_slo_d_no(),
						accptRecvIfR.org_tax_cd()));
			}
		}
		protected MCIndexKey _sloDAllIdx = null;
		protected MCRow getAmtAndTax(AccptRecvIf_Chk01_DtlR accptRecvIfR, MCNumber dscmtAmt) {
			MAM_TAX_R fixTaxR = getOrgTaxCache(accptRecvIfR.fix_tax_cd());
			MAM_BP_R tmpCstR = getCstCache(accptRecvIfR.cst_cd());
			MAM_CUR_R trdCurR = getCur(accptRecvIfR.trd_cur_cd());
			
			MCRow amtR = MAUCL_AmtUtil.getAmtAndTax(
					accptRecvIfR.fix_trd_cur_upri(), 
					accptRecvIfR.trd_unit_qty(),
					fixTaxR.tax_rate(),
					fixTaxR.inc_tax_flg(),
					trdCurR.amt_dec_place(),
					tmpCstR.sls_amt_rnd_typ(),
					tmpCstR.sls_tax_rnd_typ(),
					dscmtAmt);
			
			return amtR;
		}
		
		/**
		 * ＩＦデータの税率、税区分から内税ＦＬＧを取得する。
		 * 
		 * @return 内税ＦＬＧ
		 */
		protected boolean getSlsIncTaxFlgByIf(AccptRecvIf_Chk01_DtlR accptRecvIfR) {
			return getSlsIncTaxFlg(accptRecvIfR);
		}
		
		/**
		 * 納品書/インボイス/受注の各元情報とＩＦ情報との相違チェック
		 */
		protected MCMessageList baseDataChk(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			MST_SLO_R tmpSloR = MST_SLO_R.create();
			MST_SLO_D_R tmpSloDR = MST_SLO_D_R.create();
			MST_IV_R tmpIvR = MST_IV_R.create();
			MST_IV_D_R tmpIvDR = MST_IV_D_R.create();
			MST_DLV_SLIP_R tmpDlvSlipR = MST_DLV_SLIP_R.create();
			MST_DLV_SLIP_D_R tmpDlvSlipDR = MST_DLV_SLIP_D_R.create();
			
			initItmCache(accptRecvIfL);
			
			for (AccptRecvIf_Chk01_DtlR dtlR : accptRecvIfL) {
				
				if (isDel(dtlR) || dtlR.err_flg() || dtlR.accpt_dfct_flg()) {
					continue;
				}
				MAM_ITM_R itmR = getItmCache(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
				if (!isNull(itmR) && !isNull(itmR.itm_cd())) {
					dtlR.dscnt_itm_flg(itmR.dscnt_itm_flg());
				}
				
				MAVM_ITM_UNIT_R itmUnitR = null;
				// 仕入直送売上
				if (!dtlR.err_flg() && dtlR.ddlvTgtFlg() && !isNull(dtlR.fix_slo_no()) && !isNull(dtlR.fix_slo_d_no())) {
					chkForDdlvSls(msgL, dtlR, tmpSloR, tmpSloDR, itmUnitR);
				}
				// 検収基準売上（インボイス対象）
				else if (dtlR.iv_flg() && !dtlR.err_flg() && !isNull(dtlR.fix_dlv_slip_no()) && !isNull(dtlR.fix_dlv_slip_d_no())) {
					chkForIvSls(msgL, dtlR, tmpIvR, tmpIvDR, itmUnitR);
				}
				// 検収基準売上（インボイス対象外）
				else {
					chkForDlvSlipSls(msgL, dtlR, tmpDlvSlipR, tmpDlvSlipDR, itmUnitR);
				}
			}
			return msgL;
		}
		
		/**
		 * 仕入直送売上用の元情報相違チェック
		 */
		protected void chkForDdlvSls(
				MCMessageList msgL,
				AccptRecvIf_Chk01_DtlR dtlR,
				MST_SLO_R tmpSloR,
				MST_SLO_D_R tmpSloDR,
				MAVM_ITM_UNIT_R itmUnitR) {
			// 受注と比較
			tmpSloR = _sloL.getFirst(_sloSloNoIdxkey, dtlR.fix_slo_no());
			tmpSloDR = _sloDL.getFirst(_sloDSloDNoIdxkey, dtlR.fix_slo_d_no());
			
			if (isNull(tmpSloR) || isNull(tmpSloDR)) {
				return;
			}
			
			// 単位チェック
			if (!dtlR.dscnt_itm_flg() && !isNull(dtlR.trd_unit_cd())) {
				itmUnitR = getItmUnitCache(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.trd_unit_cd());
				if (isNull(itmUnitR.itm_cd())) {
					msgL.add(new MCMessage(dtlR, null, MSLAL0421,
							dtlR.data_no(), dtlR.data_lno(), dtlR.cst_cd(),
							dtlR.org_dlv_slip_no(), dtlR.org_dlv_slip_d_no(),
							dtlR.cst_po_no(), dtlR.cst_po_d_no(), dtlR.trd_unit_cd()));
					dtlR.err_flg(true);
				}
			}
			else {
				dtlR.trd_unit_cd(tmpSloDR.trd_unit_cd());
			}
			
			// 取引単位数量桁数チェック
			itmUnitR = getItmUnitCache(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.trd_unit_cd());
			if (!dtlR.dscnt_itm_flg() && !isNull(itmUnitR) && !isNull(itmUnitR.itm_cd()) && (dtlR.trd_unit_qty().scale() > itmUnitR.dec_place().intValue())) {
				msgL.add(new MCMessage(dtlR, null, MSLAL0460, dtlR.data_no(),
						dtlR.data_lno(), dtlR.cst_cd(), dtlR.dlv_slip_no(),
						dtlR.dlv_slip_d_no(), dtlR.cst_po_no(),
						dtlR.cst_po_d_no(), dtlR.trd_unit_cd(),
						dtlR.trd_unit_qty(), itmUnitR.dec_place().intValue()));
				dtlR.err_flg(true);
			}
			
			// 通貨チェック
			if (!isNull(dtlR.trd_cur_cd())) {
				if (!isNull(tmpSloR) && !isSame(dtlR.trd_cur_cd(), tmpSloR.trd_cur_cd())) {
					msgL.add(new MCMessage(dtlR, null, MSLAL0422, dtlR.data_no(),
							dtlR.data_lno(), dtlR.cst_cd(), dtlR.cst_po_no(),
							dtlR.cst_po_d_no(), dtlR.fix_slo_no(),
							tmpSloR.trd_cur_cd(), dtlR.trd_cur_cd()));
					dtlR.err_flg(true);
				}
			}
			
			// 単価チェック
			if (!isNull(dtlR.trd_cur_upri()) && !isNull(dtlR.fix_trd_cur_upri()) && !isSame(dtlR.trd_cur_upri(), dtlR.fix_trd_cur_upri())  && !dtlR.upri_not_chk_flg()) {
				msgL.add(new MCMessage(dtlR, null, MSLAL0425, dtlR.data_no(),
						dtlR.data_lno(), dtlR.cst_cd(), dtlR.cst_po_no(),
						dtlR.cst_po_d_no(), dtlR.fix_slo_no(),
						dtlR.fix_slo_d_no(), dtlR.fix_trd_cur_upri(),
						dtlR.trd_cur_upri()));
				dtlR.err_flg(true);
			}
			dtlR.fix_trd_cur_upri(getAdoptTrdCurUpri(dtlR));
			
			// 基準単位数量に換算
			MCNumber trdBaseUnitQty = convToBaseUnit(dtlR.trd_unit_qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
					tmpSloDR.getNumberNE("base_unit_dec_place"),  tmpSloDR.getStringNE("base_unit_rnd_typ"));
			dtlR.fix_base_unit_qty(trdBaseUnitQty);
			MAM_BP_R tmpCstR = getCstCache(dtlR.cst_cd());
			MAC_RND_TYP typ = MAC_RND_TYP.getNE(tmpCstR.sls_amt_rnd_typ());
			MCNumber tmpDscntAmt = MCNumber.ZERO;
			
			if (!dtlR.err_flg() && !isNull(tmpSloDR.trd_cur_dscnt_amt())) {
				tmpDscntAmt = tmpSloDR.trd_cur_dscnt_amt().multiply(trdBaseUnitQty).divide(tmpSloDR.base_unit_qty(), tmpSloDR.getNumberNE("amt_dec_place").intValue(), typ.toMC());
			}
			
			if (!isNull(dtlR.fix_trd_cur_upri())) {
				dtlR.setNumberNE("trd_to_base_unit_qty", trdBaseUnitQty);
				MCRow amtR = getAmtAndTax(dtlR, nvl(dtlR.trd_cur_dscnt_amt(), tmpDscntAmt));
				MCNumber tmpCalcAmt = amtR.getNumberNE("amt");
				
				if (!isNull(dtlR.trd_cur_amt()) && !isSame(dtlR.trd_cur_amt(), tmpCalcAmt)  && !dtlR.amt_not_chk_flg()) {
					msgL.add(new MCMessage(dtlR, null, MSLAL0428, dtlR.data_no(),
							dtlR.data_lno(), dtlR.cst_cd(), dtlR.cst_po_no(),
							dtlR.cst_po_d_no(), dtlR.fix_slo_no(),
							dtlR.fix_slo_d_no(), tmpCalcAmt, dtlR.trd_cur_amt()));
					dtlR.err_flg(true);
				}
				dtlR.fix_trd_cur_amt(tmpCalcAmt);
				
				// 値引額チェック
				if (!dtlR.err_flg() && !isNull(dtlR.trd_cur_dscnt_amt()) && !isSame(dtlR.trd_cur_dscnt_amt(), tmpDscntAmt)  && !dtlR.amt_not_chk_flg()) {
					msgL.add(new MCMessage(dtlR, null, MSLAL0431, dtlR.data_no(),
							dtlR.data_lno(), dtlR.cst_cd(), dtlR.cst_po_no(),
							dtlR.cst_po_d_no(), dtlR.fix_slo_no(),
							dtlR.fix_slo_d_no(), tmpDscntAmt,
							dtlR.trd_cur_dscnt_amt()));
					dtlR.err_flg(true);
				}
				dtlR.fix_trd_cur_dscnt_amt(tmpDscntAmt);
			}
			
			// 値引理由チェック
			if (!isNull(dtlR.dscnt_rsn_cd())) {
				if (!isNull(tmpSloDR) && !isSame(dtlR.dscnt_rsn_cd(), tmpSloDR.dscnt_rsn_cd())) {
					msgL.add(new MCMessage(dtlR, null, MSLAL0434, dtlR.data_no(),
							dtlR.data_lno(), dtlR.cst_cd(), dtlR.cst_po_no(),
							dtlR.cst_po_d_no(), dtlR.fix_slo_no(),
							dtlR.fix_slo_d_no(), tmpSloDR.dscnt_rsn_cd(),
							dtlR.dscnt_rsn_cd()));
					dtlR.err_flg(true);
				}
			}
		}
		
		protected boolean useIfData() {
			if (isSame(getSysParm("ACCPT_RECV_UPRI_CHK_PTN_FLG"),"1") || isSame(getSysParm("ACCPT_RECV_UPRI_CHK_PTN_FLG"),"3")){
				return true;
			}
			return false;
		}
		
		/**
		 * 検収基準売上（インボイス対象）用の元情報相違チェック
		 */
		protected void chkForIvSls(
				MCMessageList msgL,
				AccptRecvIf_Chk01_DtlR dtlR,
				MST_IV_R tmpIvR,
				MST_IV_D_R tmpIvDR,
				MAVM_ITM_UNIT_R itmUnitR) {
			tmpIvR = _ivL.getFirst(_ivIdxkey, dtlR.fix_dlv_slip_no());
			tmpIvDR = _ivDL.getFirst(_ivDIdxkey, dtlR.fix_dlv_slip_d_no());
			
			if (isNull(tmpIvR) || isNull(tmpIvDR)) {
				return;
			}
			
			// 単位チェック
			if (!isNull(dtlR.trd_unit_cd())) {
				if (!dtlR.dscnt_itm_flg() && !isNull(tmpIvDR) && !isSame(dtlR.trd_unit_cd(), tmpIvDR.trd_unit_cd())) {
					msgL.add(new MCMessage(dtlR, null, MSLAL0420, dtlR.data_no(),
							dtlR.data_lno(), dtlR.cst_cd(),
							dtlR.org_dlv_slip_no(), dtlR.org_dlv_slip_d_no(),
							tmpIvDR.trd_unit_cd(), dtlR.trd_unit_cd()));
					dtlR.err_flg(true);
				}
			}
			
			// 取引単位数量桁数チェック
			itmUnitR = getItmUnitCache(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.trd_unit_cd());
			if (!dtlR.dscnt_itm_flg() && !isNull(itmUnitR) && !isNull(itmUnitR.itm_cd()) && (dtlR.trd_unit_qty().scale() > itmUnitR.dec_place().intValue())) {
				msgL.add(new MCMessage(dtlR, null, MSLAL0460, dtlR.data_no(),
						dtlR.data_lno(), dtlR.cst_cd(), dtlR.dlv_slip_no(),
						dtlR.dlv_slip_d_no(), dtlR.cst_po_no(),
						dtlR.cst_po_d_no(), dtlR.trd_unit_cd(),
						dtlR.trd_unit_qty(), itmUnitR.dec_place().intValue()));
				dtlR.err_flg(true);
			}
			
			// 通貨チェック
			if (!isNull(dtlR.trd_cur_cd())) {
				if (!isNull(tmpIvR) && !isSame(dtlR.trd_cur_cd(), tmpIvR.trd_cur_cd())) {
					msgL.add(new MCMessage(dtlR, null, MSLAL0423, dtlR.data_no(),
							dtlR.data_lno(), dtlR.cst_cd(),
							dtlR.org_dlv_slip_no(), tmpIvR.trd_cur_cd(),
							dtlR.trd_cur_cd()));
					dtlR.err_flg(true);
				}
			}
			// 単価チェック
			if (!isNull(dtlR.trd_cur_upri()) && !dtlR.upri_not_chk_flg()) {
				if (!isNull(tmpIvDR) && !isSame(dtlR.trd_cur_upri(), tmpIvDR.trd_cur_upri())) {
					msgL.add(new MCMessage(dtlR, null, MSLAL0426, dtlR.data_no(),
							dtlR.data_lno(), dtlR.cst_cd(),
							dtlR.org_dlv_slip_no(), dtlR.org_dlv_slip_d_no(),
							tmpIvDR.trd_cur_upri(), dtlR.trd_cur_upri()));
					dtlR.err_flg(true);
				}
			}
			// 金額チェック
			if (!isNull(dtlR.trd_cur_amt()) && !dtlR.amt_not_chk_flg()) {
				if (!isNull(tmpIvDR) && !isSame(dtlR.trd_cur_amt(), tmpIvDR.trd_cur_amt())) {
					msgL.add(new MCMessage(dtlR, null, MSLAL0429, dtlR.data_no(),
							dtlR.data_lno(), dtlR.cst_cd(),
							dtlR.org_dlv_slip_no(), dtlR.org_dlv_slip_d_no(),
							tmpIvDR.trd_cur_amt(), dtlR.trd_cur_amt()));
					dtlR.err_flg(true);
				}
			}
			// 値引額チェック
			if (!isNull(dtlR.trd_cur_dscnt_amt()) && !dtlR.amt_not_chk_flg()) {
				if (!isNull(tmpIvDR) && !isSame(dtlR.trd_cur_dscnt_amt(), tmpIvDR.trd_cur_dscnt_amt())) {
					msgL.add(new MCMessage(dtlR, null, MSLAL0432, dtlR.data_no(),
							dtlR.data_lno(), dtlR.cst_cd(),
							dtlR.org_dlv_slip_no(), dtlR.org_dlv_slip_d_no(),
							tmpIvDR.trd_cur_dscnt_amt(),
							dtlR.trd_cur_dscnt_amt()));
					dtlR.err_flg(true);
				}
				dtlR.fix_trd_cur_dscnt_amt(dtlR.trd_cur_dscnt_amt());
			}
			// 値引理由チェック
			if (!isNull(dtlR.dscnt_rsn_cd())) {
				if (!isNull(tmpIvDR) && !isSame(dtlR.dscnt_rsn_cd(), tmpIvDR.dscnt_rsn_cd())) {
					msgL.add(new MCMessage(dtlR, null, MSLAL0435, dtlR.data_no(),
							dtlR.data_lno(), dtlR.cst_cd(),
							dtlR.org_dlv_slip_no(), dtlR.org_dlv_slip_d_no(),
							tmpIvDR.dscnt_rsn_cd(), dtlR.dscnt_rsn_cd()));
					dtlR.err_flg(true);
				}
			}
		}
		
		/**
		 * 検収基準売上（インボイス対象外）用の元情報相違チェック
		 */
		protected void chkForDlvSlipSls(
				MCMessageList msgL,
				AccptRecvIf_Chk01_DtlR dtlR,
				MST_DLV_SLIP_R tmpDlvSlipR,
				MST_DLV_SLIP_D_R tmpDlvSlipDR,
				MAVM_ITM_UNIT_R itmUnitR) {
			if (!dtlR.err_flg() && !isNull(dtlR.fix_dlv_slip_no()) && !isNull(dtlR.fix_dlv_slip_d_no())) {
				tmpDlvSlipR = _dlvSlipL.getFirst(_dlvSlipIdxkey, dtlR.fix_dlv_slip_no());
				tmpDlvSlipDR = _dlvSlipDL.getFirst(_dlvSlipDIdxkey, dtlR.fix_dlv_slip_d_no());
				if (isNull(tmpDlvSlipR) || isNull(tmpDlvSlipDR)) {
					return;
				}
				
				// 単位チェック
				if (!isNull(dtlR.trd_unit_cd())) {
					if (!dtlR.dscnt_itm_flg() && !isNull(tmpDlvSlipDR) && !isSame(dtlR.trd_unit_cd(), tmpDlvSlipDR.trd_unit_cd())) {
						itmUnitR = getItmUnitCache(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.trd_unit_cd());
						if (isNull(itmUnitR) || isNull(itmUnitR.itm_cd())) {
							msgL.add(new MCMessage(dtlR, null, MSLAL0421,
									dtlR.data_no(), dtlR.data_lno(),
									dtlR.cst_cd(), dtlR.org_dlv_slip_no(),
									dtlR.org_dlv_slip_d_no(),
									dtlR.cst_po_no(), dtlR.cst_po_d_no(),
									dtlR.trd_unit_cd()));
							dtlR.err_flg(true);
						}
					}
				}
				else {
					dtlR.trd_unit_cd(tmpDlvSlipDR.trd_unit_cd());
				}
				
				// 取引単位数量桁数チェック
				itmUnitR = getItmUnitCache(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.trd_unit_cd());
				if (!dtlR.dscnt_itm_flg() && !isNull(itmUnitR) && !isNull(itmUnitR.itm_cd()) && (dtlR.trd_unit_qty().scale() > itmUnitR.dec_place().intValue())) {
					msgL.add(new MCMessage(dtlR, null, MSLAL0460, dtlR.data_no(),
							dtlR.data_lno(), dtlR.cst_cd(), dtlR.dlv_slip_no(),
							dtlR.dlv_slip_d_no(), dtlR.cst_po_no(),
							dtlR.cst_po_d_no(), dtlR.trd_unit_cd(),
							dtlR.trd_unit_qty(),
							itmUnitR.dec_place().intValue()));
					dtlR.err_flg(true);
				}
				
				// 通貨チェック
				if (!isNull(dtlR.trd_cur_cd())) {
					if (!isNull(tmpDlvSlipR) && !isSame(dtlR.trd_cur_cd(), tmpDlvSlipR.trd_cur_cd())) {
						msgL.add(new MCMessage(dtlR, null, MSLAL0424,
								dtlR.data_no(), dtlR.data_lno(), dtlR.cst_cd(),
								dtlR.org_dlv_slip_no(), tmpDlvSlipR.trd_cur_cd(),
								dtlR.trd_cur_cd()));
						dtlR.err_flg(true);
					}
				}
				// 単価チェック
				if (!isNull(dtlR.trd_cur_upri()) && !isNull(dtlR.fix_trd_cur_upri()) && !isSame(dtlR.trd_cur_upri(), dtlR.fix_trd_cur_upri())  && !dtlR.upri_not_chk_flg()) {
					msgL.add(new MCMessage(dtlR, null, MSLAL0427, dtlR.data_no(),
							dtlR.data_lno(), dtlR.cst_cd(),
							dtlR.org_dlv_slip_no(), dtlR.org_dlv_slip_d_no(),
							tmpDlvSlipDR.trd_cur_upri(), dtlR.trd_cur_upri()));
					dtlR.err_flg(true);
				}
				dtlR.fix_trd_cur_upri(getAdoptTrdCurUpri(dtlR));
				
				// 基準単位数量に換算
				MCNumber trdBaseUnitQty = convToBaseUnit(dtlR.trd_unit_qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
						tmpDlvSlipDR.getNumberNE("base_unit_dec_place"),  tmpDlvSlipDR.getStringNE("base_unit_rnd_typ"));
				MAM_BP_R tmpCstR = getCstCache(dtlR.cst_cd());
				MAC_RND_TYP typ = MAC_RND_TYP.getNE(tmpCstR.sls_amt_rnd_typ());
				MCNumber tmpDscntAmt = MCNumber.ZERO;
				
				if (!dtlR.err_flg() && !isNull(tmpDlvSlipDR.trd_cur_dscnt_amt())) {
					tmpDscntAmt = tmpDlvSlipDR.trd_cur_dscnt_amt().multiply(trdBaseUnitQty).divide(tmpDlvSlipDR.base_unit_qty(), tmpDlvSlipDR.getNumberNE("amt_dec_place").intValue(), typ.toMC());
				}
				
				if (!isNull(dtlR.fix_trd_cur_upri())) { 
					dtlR.setNumberNE("trd_to_base_unit_qty", trdBaseUnitQty);
					MCRow amtR = getAmtAndTax(dtlR, nvl(dtlR.trd_cur_dscnt_amt(), tmpDscntAmt));
					MCNumber tmpCalcAmt = amtR.getNumberNE("amt");
					
					if (!isNull(dtlR.trd_cur_amt()) && !isSame(dtlR.trd_cur_amt(), tmpCalcAmt)  && !dtlR.amt_not_chk_flg()) {
						msgL.add(new MCMessage(dtlR, null, MSLAL0430,
								dtlR.data_no(), dtlR.data_lno(), dtlR.cst_cd(),
								dtlR.org_dlv_slip_no(), dtlR.org_dlv_slip_d_no(),
								tmpCalcAmt, dtlR.trd_cur_amt()));
						dtlR.err_flg(true);
					}
					dtlR.fix_trd_cur_amt(tmpCalcAmt);
					
					// 値引額チェック
					if (!dtlR.err_flg() && !isNull(dtlR.trd_cur_dscnt_amt()) && !isSame(dtlR.trd_cur_dscnt_amt(), tmpDscntAmt)  && !dtlR.amt_not_chk_flg()) {
						msgL.add(new MCMessage(dtlR, null, MSLAL0433,
								dtlR.data_no(), dtlR.data_lno(), dtlR.cst_cd(),
								dtlR.org_dlv_slip_no(), dtlR.org_dlv_slip_d_no(),
								tmpDscntAmt, dtlR.trd_cur_dscnt_amt()));
						dtlR.err_flg(true);
					}
					dtlR.fix_trd_cur_dscnt_amt(tmpDscntAmt);
				}
				
				// 値引理由チェック
				if (!isNull(dtlR.dscnt_rsn_cd())) {
					if (!isNull(tmpDlvSlipDR) && !isSame(dtlR.dscnt_rsn_cd(), tmpDlvSlipDR.getStringNE(MST_SLO_D_R.$dscnt_rsn_cd))) {
						msgL.add(new MCMessage(dtlR, null, MSLAL0436,
								dtlR.data_no(), dtlR.data_lno(), dtlR.cst_cd(),
								dtlR.org_dlv_slip_no(), dtlR.org_dlv_slip_d_no(),
								dtlR.fix_slo_no(), dtlR.fix_slo_d_no(),
								tmpDlvSlipDR.getStringNE(MST_SLO_D_R.$dscnt_rsn_cd),
								dtlR.dscnt_rsn_cd()));
						dtlR.err_flg(true);
					}
				}
				else {
					dtlR.dscnt_rsn_cd(tmpDlvSlipDR.getStringNE(MST_SLO_D_R.$dscnt_rsn_cd));
				}
				
				if (tmpDlvSlipDR.trd_cur_upri().isZero()) {
					if (isNull(tmpDlvSlipDR.rsn_cd())) {
						msgL.add(new MCMessage(dtlR, null, MSLAL0440,
								dtlR.data_no(), dtlR.data_lno(), dtlR.cst_cd(),
								dtlR.org_dlv_slip_no(),
								dtlR.org_dlv_slip_d_no()));
						dtlR.err_flg(true);
					}
				}
			}
		}
		
		protected MCNumber getAdoptTrdCurUpri(AccptRecvIf_Chk01_DtlR accptRecvIfR) {
			if (useIfUpri(accptRecvIfR)) {
				return accptRecvIfR.trd_cur_upri();
			}
			return accptRecvIfR.fix_trd_cur_upri();
		}
		
		protected boolean useIfUpri(AccptRecvIf_Chk01_DtlR accptRecvIfR) {
			return !isNull(accptRecvIfR.trd_cur_upri()) && accptRecvIfR.upri_not_chk_flg() && useIfData();
		}
		protected MCMessageList chkShipAcDtAcDt(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			MCMessageList msgL = new MCMessageList();

			for (AccptRecvIf_Chk01_DtlR dtlR : accptRecvIfL) {
				if (dtlR.ddlvTgtFlg() || dtlR.err_flg() || isDel(dtlR)) {
					continue;
				}

				if (dtlR.iv_flg()) {
					if (MAC_VIA_DLV_TYP.isVIA(dtlR.via_dlv_typ())) {
						MCList<MST_IV_SHIP_ACT_D_R> ivShipActDL = _ivShipActDL.subList(_ivShipActDIdx, dtlR.dlv_slip_no(), dtlR.dlv_slip_d_no());

						for (MST_IV_SHIP_ACT_D_R ivShipActDR : ivShipActDL) {
							msgL = chkAcDt(ivShipActDR, dtlR, msgL);
						}
					}
					else {
						MST_IV_MAP_R ivMapR = _ivMapL.getFirst(_ivMapIdx, dtlR.dlv_slip_d_no());
						msgL = chkAcDt(ivMapR, dtlR, msgL);
					}
				}
				else {
					MST_DLV_SLIP_R dlvSlipR = _dlvSlipShipActL.getFirst(_dlvSlipShipActIdx, dtlR.dlv_slip_no());
					msgL = chkAcDt(dlvSlipR, dtlR, msgL);
				}
			}

			return msgL;
		}

		protected MCMessageList chkAcDt(MCRow row, AccptRecvIf_Chk01_DtlR dtlR, MCMessageList msgL) {
			if (!isNull(row) && getToday().lt(row.getDate("ac_dt"))) {
				msgL.add(new MCMessage(dtlR, null, MSBEL1067,
						toYMDString(row.getDate("ac_dt")), toYMDString(getToday()),
						toDispGUIIndex(dtlR)));
				dtlR.err_flg(true);
			}

			return msgL;
		}
		
		/**
		 * 入金予定日チェック（売上都度請求のインボイス対象のみ）
		 */
		protected MCMessageList rcvSchdDtChk(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			MCIndexKey idx = accptRecvIfL.createIndex(AccptRecvIf_Chk01_DtlR.$dlv_slip_no);
			
			for (AccptRecvIf_Chk01_DtlR dtlR : accptRecvIfL) {
				if ((dtlR.ddlvTgtFlg() && !dtlR.ivDdlvTgtFlg()) || !dtlR.iv_flg() || isDel(dtlR) || dtlR.err_flg()) {
					continue;
				}
				
				if (MAC_BILL_CL_TYP.isEACH_SLS(dtlR.bill_cl_typ())) {
					if (isNull(dtlR.rcv_schd_dt())) {
						MST_IV_R tmpIvR = _ivL.getFirst(_ivIdxkey, dtlR.fix_dlv_slip_no());
						if (!isNull(tmpIvR) && !isNull(tmpIvR.rcv_schd_dt())) {
							dtlR.rcv_schd_dt(tmpIvR.rcv_schd_dt());
						}
						else {
							msgL.add(new MCMessage(dtlR, null, MSLAL0416, dtlR.data_no(),
									dtlR.data_lno(), dtlR.cst_cd(), dtlR.org_dlv_slip_no(),
									dtlR.org_dlv_slip_d_no(), dtlR.cst_po_no(),
									dtlR.cst_po_d_no()));
							dtlR.err_flg(true);
						}
					}
					else {
						MCList<AccptRecvIf_Chk01_DtlR> tmpIvL = accptRecvIfL.subList(idx, dtlR.dlv_slip_no());
						int grpSize = tmpIvL.groupBy(AccptRecvIf_Chk01_DtlR.$rcv_schd_dt).size();
						if (grpSize != 1) {
							msgL.add(new MCMessage(dtlR, null, MSLAL0451, dtlR.data_no(),
									dtlR.data_lno(), dtlR.cst_cd(),
									dtlR.org_dlv_slip_no(), dtlR.org_dlv_slip_d_no(),
									dtlR.cst_po_no(), dtlR.cst_po_d_no()));
							dtlR.err_flg(true);
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 売上計上区分チェック
		 */
		protected MCMessageList slsBasisChk(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			for (AccptRecvIf_Chk01_DtlR dtlR : accptRecvIfL) {
				if (dtlR.ddlvTgtFlg() || dtlR.err_flg() || isDel(dtlR)) {
					continue;
				}
				
				if (dtlR.iv_flg() && !isNull(dtlR.fix_dlv_slip_no())) {
					MCList<MST_IV_R> tmpIvL = _ivL.subList(_ivIdxkey, dtlR.fix_dlv_slip_no());
					if (!tmpIvL.isEmpty() && (MAC_SLS_BASIS_TYP.isSHIP_BASIS(tmpIvL.get(0).sls_basis_typ()) || isNull(tmpIvL.get(0).sls_basis_typ()))) {
						msgL.add(new MCMessage(dtlR, null, MSLAL0415, dtlR.data_no(),
								dtlR.data_lno(), dtlR.cst_cd(), dtlR.org_dlv_slip_no()));
						dtlR.err_flg(true);
					}
				}
				else {
					if (!isNull(dtlR.fix_slo_no()) && !isNull(_dlvSlipSloL)) {
						MCList<MST_SLO_R> tmpSloL = _dlvSlipSloL.subList(_dlvSlipSloIdxkey, dtlR.fix_slo_no());
						if (!tmpSloL.isEmpty()) {
							if(MAC_SLS_BASIS_TYP.isSHIP_BASIS(tmpSloL.get(0).sls_basis_typ()) || isNull(tmpSloL.get(0).sls_basis_typ())) {
								msgL.add(new MCMessage(dtlR, null, MSLAL0414,
										dtlR.data_no(), dtlR.data_lno(), dtlR.cst_cd(),
										dtlR.org_dlv_slip_no()));
								dtlR.err_flg(true);
							}
						}
					}
					else {
						if (!isNull(dtlR.fix_dlv_slip_no())) {
							MAM_BP_R tmpBpR = getCstCache(dtlR.cst_cd());
							if (!isNull(tmpBpR) && (MAC_SLS_BASIS_TYP.isSHIP_BASIS(tmpBpR.sls_basis_typ()) || isNull(tmpBpR.sls_basis_typ()))) {
								msgL.add(new MCMessage(dtlR, null, MSLAL0414,
										dtlR.data_no(), dtlR.data_lno(), dtlR.cst_cd(),
										dtlR.org_dlv_slip_no()));
								dtlR.err_flg(true);
							}
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 補完および事前チェック
		 * 
		 * @param accptRecvIfL 検収受信ＩＦリスト
		 */
		protected MCMessageList complChk(MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			for (AccptRecvIf_Chk01_DtlR dtlR : accptRecvIfL) {
				if (dtlR.err_flg()) {
					continue;
				}
				MAM_BP_R tmpBpR = getCstCache(dtlR.cst_cd());
				if (!isSame(tmpBpR.cst_iv_flg(), dtlR.iv_flg())) {
					msgL.add(new MCMessage(dtlR, null, MSLAL0419, dtlR.data_no(),
							dtlR.data_lno(), dtlR.cst_cd(), dtlR.cst_po_no(),
							dtlR.cst_po_d_no(),
							toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
							toDispSno(dtlR.sno1(), dtlR.sno2(), dtlR.sno3(), dtlR.sno4())));
					dtlR.err_flg(true);
				}
				// 仕入直送売上の場合
				if (dtlR.ddlvTgtFlg() && !dtlR.iv_flg()) {
					complChkDdlvSlsTgt(msgL, dtlR, accptRecvIfL);
				}
				// 検収基準売上（インボイス対象）の場合
				else if (dtlR.iv_flg()) {
					complChkIvSlsTgt(msgL, dtlR);
				}
				// 検収基準売上（インボイス対象外）の場合
				else {
					complChkDlvSlipSlsTgt(msgL, dtlR);
				}
			}
			
			MCList<MST_SLS_SCHD_R> wkKeyL = MCList.create(MST_SLS_SCHD_R.class);
			for (MST_SLS_SCHD_R slsSchdR : _slsSchdL) {
				MST_SLS_SCHD_R wkKeyR = MST_SLS_SCHD_R.create();
				wkKeyR.sls_schd_no(slsSchdR.sls_schd_no());
				wkKeyL.add(wkKeyR);
			}
			MCQueryApiBuilder wkKeyL_bldr = MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T"));
			dbWkInsert("MSLAL5160_MSW_SLS_SCHD_I03", wkKeyL, wkKeyL_bldr.getBaseDbc());
			
			initCalc01Hdr();
			executeQuery(_calc01HdrL, MSLAL5160_MST_SLS_SCHD_S02());
			_idxCalc01HdrKey = _calc01HdrL.createIndex(LIST_INDEX_KEY_NM);
			
			initItmCache(accptRecvIfL);
			for (AccptRecvIf_Chk01_DtlR dtlR : accptRecvIfL) {
				MAVM_ITM_UNIT_R itmUnitR = getItmUnitCache(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.trd_unit_cd());
				if (!isNull(itmUnitR.itm_cd())) {
					dtlR.trd_unit_conv_qty(itmUnitR.conv_qty());
					dtlR.trd_unit_conv_base_qty(itmUnitR.conv_base_qty());
					calcTrdCurUpri(dtlR);
				}
				if (isDel(dtlR)) {
					MAM_ITM_R tmpItmR = getItmCache(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
					if (!isNull(tmpItmR) && !isNull(tmpItmR.itm_cd())) {
						dtlR.dscnt_itm_flg(tmpItmR.dscnt_itm_flg());
					}
				}
			}
			setTaxCd(accptRecvIfL);
			
			return msgL;
		}
		
		/**
		 * 検収基準売上（インボイス対象外）用の補完および事前チェック
		 */
		protected void complChkDlvSlipSlsTgt(MCMessageList msgL, AccptRecvIf_Chk01_DtlR dtlR) {
			if (isNull(dtlR.dlv_slip_no())) {
				msgL.add(new MCMessage(dtlR, null, MSLAL0419, dtlR.data_no(),
						dtlR.data_lno(), dtlR.cst_cd(), dtlR.cst_po_no(),
						dtlR.cst_po_d_no(),
						toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
						toDispSno(dtlR.sno1(), dtlR.sno2(), dtlR.sno3(), dtlR.sno4())));
				dtlR.err_flg(true);
			}
			else {
				MCList<MST_DLV_SLIP_R> dlvSlipL = _dlvSlipL.subList(_dlvSlipIdxkey, dtlR.dlv_slip_no());
				if (!isNull(dlvSlipL) && dlvSlipL.size() > 0) {
					MCList<MST_DLV_SLIP_D_R> dlvSlipDL = MCList.create(MST_DLV_SLIP_D_R.class);
					for (MST_DLV_SLIP_R dlvSlipR : dlvSlipL) {
						dtlR.sls_dpt_cd(dlvSlipR.dpt_cd());
						dtlR.dpt_base_dt(dlvSlipR.ac_dt());
						MAM_DPT_R tmpDptR = getDpt(dtlR.sls_dpt_cd(), dtlR.dpt_base_dt());
						if (!isNull(tmpDptR)) {
							dtlR.wg_cd(tmpDptR.wg_cd());
						}
						dtlR.sls_usr_cd(dlvSlipR.usr_cd());
						if (!isNull(dtlR.cst_po_no()) && !isSame(dlvSlipR.cst_po_no(), dtlR.cst_po_no())) {
							continue;
						}
						dlvSlipDL.addAll(_dlvSlipDL.subList(_dlvSlipDSlipNoIdxkey, dlvSlipR.dlv_slip_no()));
						if (isNull(dtlR.trd_cur_cd())) {
							dtlR.trd_cur_cd(dlvSlipR.trd_cur_cd());
						}
					}
					MCList<MST_DLV_SLIP_D_R> tgtDlvSlipDL = MCList.create(MST_DLV_SLIP_D_R.class);
					for (MST_DLV_SLIP_D_R dlvSlipDR : dlvSlipDL) {
						if (!isNull(dtlR.dlv_slip_d_no()) && !isSame(dlvSlipDR.dlv_slip_d_no(), dtlR.dlv_slip_d_no())) {
							continue;
						}
						if (!isNull(dtlR.cst_po_d_no()) && !isSame(dlvSlipDR.cst_po_d_no(), dtlR.cst_po_d_no())) {
							continue;
						}
						if (!isNull(dtlR.itm_cd()) && !isSame(dlvSlipDR.itm_cd(), dtlR.itm_cd())) {
							continue;
						}
						if (!isNull(dtlR.itm_sub1()) && !isSame(dlvSlipDR.itm_sub1(), dtlR.itm_sub1())) {
							continue;
						}
						if (!isNull(dtlR.itm_sub2()) && !isSame(dlvSlipDR.itm_sub2(), dtlR.itm_sub2())) {
							continue;
						}
						if (!isNull(dtlR.itm_sub3()) && !isSame(dlvSlipDR.itm_sub3(), dtlR.itm_sub3())) {
							continue;
						}
						if (!isNull(dtlR.sno1()) && !isSame(dlvSlipDR.sno1(), dtlR.sno1())) {
							continue;
						}
						if (!isNull(dtlR.sno2()) && !isSame(dlvSlipDR.sno2(), dtlR.sno2())) {
							continue;
						}
						if (!isNull(dtlR.sno3()) && !isSame(dlvSlipDR.sno3(), dtlR.sno3())) {
							continue;
						}
						if (!isNull(dtlR.sno4()) && !isSame(dlvSlipDR.sno4(), dtlR.sno4())) {
							continue;
						}
						tgtDlvSlipDL.add(dlvSlipDR);
					}
					
					if (tgtDlvSlipDL.size() > 0) {
						if (tgtDlvSlipDL.size() == 1) {
							dtlR.fix_slo_no(dlvSlipL.get(0).slo_no());
							dtlR.fix_slo_d_no(tgtDlvSlipDL.get(0).slo_d_no());
							dtlR.fix_dlv_slip_no(tgtDlvSlipDL.get(0).dlv_slip_no());
							dtlR.fix_dlv_slip_d_no(tgtDlvSlipDL.get(0).dlv_slip_d_no());
							if (isNull(dtlR.trd_unit_cd())) {
								dtlR.trd_unit_cd(tgtDlvSlipDL.get(0).trd_unit_cd());
							}
							if (isNull(dtlR.itm_cd())) {
								dtlR.itm_cd(tgtDlvSlipDL.get(0).itm_cd());
							}
							if (isNull(dtlR.itm_sub1())) {
								dtlR.itm_sub1(tgtDlvSlipDL.get(0).itm_sub1());
							}
							if (isNull(dtlR.itm_sub2())) {
								dtlR.itm_sub2(tgtDlvSlipDL.get(0).itm_sub2());
							}
							if (isNull(dtlR.itm_sub3())) {
								dtlR.itm_sub3(tgtDlvSlipDL.get(0).itm_sub3());
							}
							if (isNull(dtlR.sno1())) {
								dtlR.sno1(tgtDlvSlipDL.get(0).sno1());
							}
							if (isNull(dtlR.sno2())) {
								dtlR.sno2(tgtDlvSlipDL.get(0).sno2());
							}
							if (isNull(dtlR.sno3())) {
								dtlR.sno3(tgtDlvSlipDL.get(0).sno3());
							}
							if (isNull(dtlR.sno4())) {
								dtlR.sno4(tgtDlvSlipDL.get(0).sno4());
							}
							
							// 売上予定
							MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
							if (isCrt(dtlR)) {
								slsSchdL = _slsSchdL.subList(_slsSchdDlvSlipCmplIdxkey, false, dtlR.fix_dlv_slip_d_no());
							}
							else {
								slsSchdL = _slsSchdL.subList(_slsSchdSlipDIdxkey, dtlR.fix_dlv_slip_d_no(), false);
							}
							if (slsSchdL.size() > 0) {
								if (slsSchdL.size() == 1) {
									dtlR.fix_sls_schd_no(slsSchdL.get(0).sls_schd_no());
								}
								else {
									dtlR.sls_schd_mult_flg(true);
								}
							}
							else {
								msgL.add(new MCMessage(dtlR, null, MSLAL0404,
										dtlR.data_no(), dtlR.data_lno(),
										dtlR.cst_cd(), dtlR.org_dlv_slip_no(),
										dtlR.org_dlv_slip_d_no()));
								dtlR.err_flg(true);
							}
						}
						else {
							// 納品書明細が特定できない（複数該当）
							msgL.add(new MCMessage(
									dtlR,
									null,
									MSLAL0410,
									dtlR.data_no(),
									dtlR.data_lno(),
									dtlR.cst_cd(),
									dtlR.org_dlv_slip_no(),
									dtlR.org_dlv_slip_d_no(),
									dtlR.cst_po_no(),
									dtlR.cst_po_d_no(),
									toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
									toDispSno(dtlR.sno1(), dtlR.sno2(), dtlR.sno3(), dtlR.sno4())));
							dtlR.err_flg(true);
						}
					}
					else {
						msgL.add(new MCMessage(dtlR, null, MSLAL0409,
								dtlR.data_no(), dtlR.data_lno(), dtlR.cst_cd(),
								dtlR.org_dlv_slip_no(), dtlR.org_dlv_slip_d_no(),
								dtlR.cst_po_no(), dtlR.cst_po_d_no(),
								toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
								toDispSno(dtlR.sno1(), dtlR.sno2(), dtlR.sno3(), dtlR.sno4())));
						dtlR.err_flg(true);
					}
				}
				else {
					msgL.add(new MCMessage(dtlR, null, MSLAL0409, dtlR.data_no(),
							dtlR.data_lno(), dtlR.cst_cd(),
							dtlR.org_dlv_slip_no(), dtlR.org_dlv_slip_d_no(),
							dtlR.cst_po_no(), dtlR.cst_po_d_no(),
							toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
							toDispSno(dtlR.sno1(), dtlR.sno2(), dtlR.sno3(), dtlR.sno4())));
					dtlR.err_flg(true);
				}
			}
		}
		
		/**
		 * 検収基準売上（インボイス対象）用の補完および事前チェック
		 */
		protected void complChkIvSlsTgt(MCMessageList msgL, AccptRecvIf_Chk01_DtlR dtlR) {
			if (isNull(dtlR.dlv_slip_no())) {
				msgL.add(new MCMessage(dtlR, null, MSLAL0419, dtlR.data_no(),
						dtlR.data_lno(), dtlR.cst_cd(), dtlR.cst_po_no(),
						dtlR.cst_po_d_no(),
						toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
						toDispSno(dtlR.sno1(), dtlR.sno2(), dtlR.sno3(), dtlR.sno4())));
				dtlR.err_flg(true);
			}
			else {
				MCList<MST_IV_R> ivL = _ivL.subList(_ivIdxkey, dtlR.dlv_slip_no());
				if (!isNull(ivL) && ivL.size() > 0) {
					MCList<MST_IV_D_R> ivDL = MCList.create(MST_IV_D_R.class);
					for (MST_IV_R ivR : ivL) {
						ivDL.addAll(_ivDL.subList(_ivDIvMngNoIdxkey, ivR.iv_mng_no()));
						dtlR.via_dlv_typ(ivR.via_dlv_typ());
						if (isNull(dtlR.trd_cur_cd())) {
							dtlR.trd_cur_cd(ivR.trd_cur_cd());
						}
						dtlR.dpt_base_dt(ivR.iv_dt());
					}
					
					MCList<MST_IV_D_R> tgtIvDL = MCList.create(MST_IV_D_R.class);
					for (MST_IV_D_R ivDR : ivDL) {
						if (!isNull(dtlR.dlv_slip_d_no()) && !isSame(ivDR.iv_d_no(), dtlR.dlv_slip_d_no())) {
							continue;
						}
						if (!isNull(dtlR.cst_po_no()) && !isSame(ivDR.cst_po_no(), dtlR.cst_po_no())) {
							continue;
						}
						if (!isNull(dtlR.cst_po_d_no()) && !isSame(ivDR.cst_po_d_no(), dtlR.cst_po_d_no())) {
							continue;
						}
						if (!isNull(dtlR.itm_cd()) && !isSame(ivDR.itm_cd(), dtlR.itm_cd())) {
							continue;
						}
						if (!isNull(dtlR.itm_sub1()) && !isSame(ivDR.itm_sub1(), dtlR.itm_sub1())) {
							continue;
						}
						if (!isNull(dtlR.itm_sub2()) && !isSame(ivDR.itm_sub2(), dtlR.itm_sub2())) {
							continue;
						}
						if (!isNull(dtlR.itm_sub3()) && !isSame(ivDR.itm_sub3(), dtlR.itm_sub3())) {
							continue;
						}
						if (!isNull(dtlR.sno1()) && !isSame(ivDR.sno1(), dtlR.sno1())) {
							continue;
						}
						if (!isNull(dtlR.sno2()) && !isSame(ivDR.sno2(), dtlR.sno2())) {
							continue;
						}
						if (!isNull(dtlR.sno3()) && !isSame(ivDR.sno3(), dtlR.sno3())) {
							continue;
						}
						if (!isNull(dtlR.sno4()) && !isSame(ivDR.sno4(), dtlR.sno4())) {
							continue;
						}
						tgtIvDL.add(ivDR);
					}
					
					if (tgtIvDL.size() > 0) {
						if (tgtIvDL.size() == 1) {
							dtlR.fix_slo_no(tgtIvDL.get(0).slo_no());
							dtlR.fix_slo_d_no(tgtIvDL.get(0).slo_d_no());
							dtlR.fix_dlv_slip_no(dtlR.dlv_slip_no());
							dtlR.fix_dlv_slip_d_no(tgtIvDL.get(0).iv_d_no());
							dtlR.bill_cl_typ(tgtIvDL.get(0).getStringNE(MAM_BP_R.$bill_cl_typ));
							if (MAC_SLO_PROC_TYP.isPURC_DDLV(tgtIvDL.get(0).getStringNE(MST_SLO_D_R.$proc_typ))) {
								dtlR.ivDdlvTgtFlg(true);
								dtlR.ddlvTgtFlg(true);
							}
							if (isNull(dtlR.trd_unit_cd())) {
								dtlR.trd_unit_cd(tgtIvDL.get(0).trd_unit_cd());
							}
							dtlR.sls_dpt_cd(tgtIvDL.get(0).sls_dpt_cd());
							MAM_DPT_R tmpDptR = getDpt(dtlR.sls_dpt_cd(), dtlR.dpt_base_dt());
							if (!isNull(tmpDptR)) {
								dtlR.wg_cd(tmpDptR.wg_cd());
							}
							dtlR.sls_usr_cd(tgtIvDL.get(0).sls_usr_cd());
							
							MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
							if (isCrt(dtlR)) {
								slsSchdL = _slsSchdL.subList(_slsSchdIvDCmplIdxkey, false, dtlR.fix_dlv_slip_d_no());
							}
							else {
								slsSchdL = _slsSchdL.subList(_slsSchdIvDIdxkey, dtlR.fix_dlv_slip_d_no());
							}
							if (slsSchdL.size() > 0) {
								if (slsSchdL.size() == 1) {
									dtlR.fix_sls_schd_no(slsSchdL.get(0).sls_schd_no());
								}
								else {
									dtlR.sls_schd_mult_flg(true);
								}
							}
							else {
								msgL.add(new MCMessage(dtlR, null, MSLAL0403,
										dtlR.data_no(), dtlR.data_lno(),
										dtlR.cst_cd(), dtlR.org_dlv_slip_no(),
										dtlR.org_dlv_slip_d_no()));
								dtlR.err_flg(true);
							}
							if (isNull(dtlR.itm_cd())) {
								dtlR.itm_cd(tgtIvDL.get(0).itm_cd());
							}
							if (isNull(dtlR.itm_sub1())) {
								dtlR.itm_sub1(tgtIvDL.get(0).itm_sub1());
							}
							if (isNull(dtlR.itm_sub2())) {
								dtlR.itm_sub2(tgtIvDL.get(0).itm_sub2());
							}
							if (isNull(dtlR.itm_sub3())) {
								dtlR.itm_sub3(tgtIvDL.get(0).itm_sub3());
							}
							if (isNull(dtlR.sno1())) {
								dtlR.sno1(tgtIvDL.get(0).sno1());
							}
							if (isNull(dtlR.sno2())) {
								dtlR.sno2(tgtIvDL.get(0).sno2());
							}
							if (isNull(dtlR.sno3())) {
								dtlR.sno3(tgtIvDL.get(0).sno3());
							}
							if (isNull(dtlR.sno4())) {
								dtlR.sno4(tgtIvDL.get(0).sno4());
							}
						}
						else {
							msgL.add(new MCMessage(
									dtlR,
									null,
									MSLAL0408,
									dtlR.data_no(),
									dtlR.data_lno(),
									dtlR.cst_cd(),
									dtlR.org_dlv_slip_no(),
									dtlR.org_dlv_slip_d_no(),
									dtlR.cst_po_no(),
									dtlR.cst_po_d_no(),
									toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
									toDispSno(dtlR.sno1(), dtlR.sno2(), dtlR.sno3(), dtlR.sno4())));
							dtlR.err_flg(true);
						}
					}
					else {
						msgL.add(new MCMessage(dtlR, null, MSLAL0407,
								dtlR.data_no(), dtlR.data_lno(), dtlR.cst_cd(),
								dtlR.org_dlv_slip_no(), dtlR.org_dlv_slip_d_no(),
								dtlR.cst_po_no(), dtlR.cst_po_d_no(),
								toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
								toDispSno(dtlR.sno1(), dtlR.sno2(), dtlR.sno3(), dtlR.sno4())));
						dtlR.err_flg(true);
					}
				}
				else {
					msgL.add(new MCMessage(dtlR, null, MSLAL0407, dtlR.data_no(),
							dtlR.data_lno(), dtlR.cst_cd(),
							dtlR.org_dlv_slip_no(), dtlR.org_dlv_slip_d_no(),
							dtlR.cst_po_no(), dtlR.cst_po_d_no(),
							toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
							toDispSno(dtlR.sno1(), dtlR.sno2(), dtlR.sno3(), dtlR.sno4())));
					dtlR.err_flg(true);
				}
			}
		}
		
		/**
		 * 仕入直送売上用の補完および事前チェック
		 */
		protected void complChkDdlvSlsTgt(
				MCMessageList msgL,
				AccptRecvIf_Chk01_DtlR dtlR,
				MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL) {
			MCList<MST_SLO_R> sloL = _sloL.subList(_sloIdxkey, dtlR.cst_po_no());
			if (!isNull(sloL) && sloL.size() > 0) {
				MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
				for (MST_SLO_R sloR : sloL) {
					sloDL.addAll(_sloDL.subList(_sloDSloNoIdxkey, sloR.slo_no()));
					dtlR.sls_dpt_cd(sloR.sls_dpt_cd());
					dtlR.dpt_base_dt(sloR.slo_dt());
					MAM_DPT_R tmpDptR = getDpt(dtlR.sls_dpt_cd(), dtlR.base_dt());
					if (!isNull(tmpDptR)) {
						dtlR.wg_cd(tmpDptR.wg_cd());
					}
					dtlR.sls_usr_cd(sloR.sls_usr_cd());
					if (isNull(dtlR.trd_cur_cd())) {
						dtlR.trd_cur_cd(sloR.trd_cur_cd());
						dtlR.fix_trd_cur_cd(sloR.trd_cur_cd());
					}
				}
				
				MCList<MST_SLO_D_R> tgtSloDL = MCList.create(MST_SLO_D_R.class);
				for (MST_SLO_D_R sloDR : sloDL) {
					if (!isNull(dtlR.cst_po_d_no()) && !isSame(sloDR.cst_po_d_no(), dtlR.cst_po_d_no())) {
						continue;
					}
					if (!isNull(dtlR.itm_cd()) && !isSame(sloDR.itm_cd(), dtlR.itm_cd())) {
						continue;
					}
					if (!isNull(dtlR.itm_sub1()) && !isSame(sloDR.itm_sub1(), dtlR.itm_sub1())) {
						continue;
					}
					if (!isNull(dtlR.itm_sub2()) && !isSame(sloDR.itm_sub2(), dtlR.itm_sub2())) {
						continue;
					}
					if (!isNull(dtlR.itm_sub3()) && !isSame(sloDR.itm_sub3(), dtlR.itm_sub3())) {
						continue;
					}
					if (!isNull(dtlR.sno1()) && !isSame(sloDR.sno1(), dtlR.sno1())) {
						continue;
					}
					if (!isNull(dtlR.sno2()) && !isSame(sloDR.sno2(), dtlR.sno2())) {
						continue;
					}
					if (!isNull(dtlR.sno3()) && !isSame(sloDR.sno3(), dtlR.sno3())) {
						continue;
					}
					if (!isNull(dtlR.sno4()) && !isSame(sloDR.sno4(), dtlR.sno4())) {
						continue;
					}
					
					tgtSloDL.add(sloDR);
				}
				
				if (tgtSloDL.size() > 0) {
					if (tgtSloDL.size() == 1) {
						dtlR.fix_slo_no(tgtSloDL.get(0).slo_no());
						dtlR.fix_slo_d_no(tgtSloDL.get(0).slo_d_no());
						if (isNull(dtlR.itm_cd())) {
							dtlR.itm_cd(tgtSloDL.get(0).itm_cd());
						}
						if (isNull(dtlR.itm_sub1())) {
							dtlR.itm_sub1(tgtSloDL.get(0).itm_sub1());
						}
						if (isNull(dtlR.itm_sub2())) {
							dtlR.itm_sub2(tgtSloDL.get(0).itm_sub2());
						}
						if (isNull(dtlR.itm_sub3())) {
							dtlR.itm_sub3(tgtSloDL.get(0).itm_sub3());
						}
						if (isNull(dtlR.trd_unit_cd())) {
							dtlR.trd_unit_cd(tgtSloDL.get(0).trd_unit_cd());
						}
						if (isNull(dtlR.sno1())) {
							dtlR.sno1(tgtSloDL.get(0).sno1());
						}
						if (isNull(dtlR.sno2())) {
							dtlR.sno2(tgtSloDL.get(0).sno2());
						}
						if (isNull(dtlR.sno3())) {
							dtlR.sno3(tgtSloDL.get(0).sno3());
						}
						if (isNull(dtlR.sno4())) {
							dtlR.sno4(tgtSloDL.get(0).sno4());
						}
						
						MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
						slsSchdL = filterSlsSchd(_slsSchdL.subList(_slsSchdSloDIdxkey, dtlR.fix_slo_d_no()), dtlR);
						MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(_slsActDExtPurcDNoIdxkey, dtlR.ext_purc_act_d_no(), dtlR.ext_sys_cd());
						
						if (slsSchdL.size() > 0) {
							if (isCrt(dtlR) || (isUpd(dtlR) && isNull(slsActDR))) {
								MCList<MST_SLS_SCHD_R> slsSchdLNotCmpl = slsSchdL.subList(MST_SLS_SCHD_R.$cmpl_flg, false);
								if (slsSchdLNotCmpl.size() == 1) {
									if (slsSchdLNotCmpl.get(0).cmpl_flg()) {
										msgL.add(new MCMessage(dtlR, null, MSLAL0402,
												dtlR.data_no(), dtlR.data_lno(),
												dtlR.cst_cd(), dtlR.cst_po_no(),
												dtlR.cst_po_d_no()));
										dtlR.err_flg(true);
									}
									else {
										if (!isNullOrNullVal(slsSchdL.get(0).iv_d_no())) {
											 if (dtlR.iv_flg()) {
												 dtlR.fix_sls_schd_no(slsSchdLNotCmpl.get(0).sls_schd_no());
											 }
										}
										else {
											dtlR.fix_sls_schd_no(slsSchdLNotCmpl.get(0).sls_schd_no());
										}
										
										if (!isNull(dtlR.fix_sls_schd_no())) {
											if (isNull(slsSchdLNotCmpl.get(0).purc_act_d_no())) {
												dtlR.sync_flg(true);
											}
										}
										else {
											msgL.add(new MCMessage(dtlR, null, MSLAL0402,
													dtlR.data_no(), dtlR.data_lno(),
													dtlR.cst_cd(), dtlR.cst_po_no(),
													dtlR.cst_po_d_no()));
											dtlR.err_flg(true);
										}
									}
								}
								else {
									if (slsSchdLNotCmpl.size() == 0) {
										if (isSameDdlvTgt(accptRecvIfL, dtlR)) {
											dtlR.sync_flg(true);
											MCList<MST_SLS_SCHD_R> slsSchdLCmpl = slsSchdL.subList(MST_SLS_SCHD_R.$cmpl_flg, true);
											if (slsSchdLCmpl.size() == 1) {
												dtlR.fix_sls_schd_no(slsSchdLCmpl.get(0).sls_schd_no());
											}
											else {
												dtlR.sls_schd_mult_flg(true);
											}
										}
										else {
											msgL.add(new MCMessage(dtlR, null, MSLAL0402,
													dtlR.data_no(), dtlR.data_lno(),
													dtlR.cst_cd(), dtlR.cst_po_no(),
													dtlR.cst_po_d_no()));
											dtlR.err_flg(true);
										}
									}
									else {
										MCList<AccptRecvIf_Chk01_DtlR> tmpL = accptRecvIfL.clone();
										tmpL.sort(SortType.DESC, AccptRecvIf_Chk01_DtlR.$fix_sls_schd_no);
										for (AccptRecvIf_Chk01_DtlR tmpR : tmpL) {
											if (MAC_DATA_CRUD_TYP.isUPD(tmpR.data_crud_typ())
													&& !isNull(tmpR.fix_sls_schd_no())
													&& isSame(tmpR.cst_po_no(), dtlR.cst_po_no())
													&& isSame(tmpR.cst_po_d_no(), dtlR.cst_po_d_no())
													&& isSame(tmpR.ext_sys_cd(), dtlR.ext_sys_cd())
													&& !isSame(tmpR.ext_purc_act_d_no(), dtlR.ext_purc_act_d_no())) {
												dtlR.fix_sls_schd_no(tmpR.fix_sls_schd_no());
												dtlR.sync_flg(true);
												break;
											}
										}
										if (isNull(dtlR.fix_sls_schd_no())) {
											dtlR.sls_schd_mult_flg(true);
										}
									}
								}
							}
							else {
								if (!isNull(slsActDR)) {
									dtlR.fix_sls_schd_no(slsActDR.sls_schd_no());
									if (slsSchdL.size() != 1) {
										MCList<MST_SLS_ACT_D_R> slsActDL = _slsActDL.subList(_slsActDExtPurcDNoIdxkey, dtlR.ext_purc_act_d_no(), dtlR.ext_sys_cd());
										boolean syncFlg = _slsActIoL.contains(_slsActIoSyncIdxkey, true, slsActDR.sls_act_d_no());
										dtlR.sync_flg(syncFlg);
										if (!syncFlg || (syncFlg && slsActDL.size() != 1)) {
											dtlR.sls_schd_mult_flg(true);
											dtlR.fix_sls_schd_no(null);
										}
									}
								}
							}
						}
						else {
							msgL.add(new MCMessage(dtlR, null, MSLAL0402,
									dtlR.data_no(), dtlR.data_lno(),
									dtlR.cst_cd(), dtlR.cst_po_no(),
									dtlR.cst_po_d_no()));
							dtlR.err_flg(true);
						}
						if (dtlR.iv_flg()) {
							dtlR.ivDdlvTgtFlg(true);
						}
					}
					else {
						msgL.add(new MCMessage(
								dtlR,
								null,
								MSLAL0406,
								dtlR.data_no(),
								dtlR.data_lno(),
								dtlR.cst_cd(),
								dtlR.cst_po_no(),
								toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
								toDispSno(dtlR.sno1(), dtlR.sno2(), dtlR.sno3(), dtlR.sno4())));
						dtlR.err_flg(true);
					}
				}
				else {
					msgL.add(new MCMessage(dtlR, null, MSLAL0405, dtlR.data_no(),
							dtlR.data_lno(), dtlR.cst_cd(), dtlR.cst_po_no(),
							dtlR.cst_po_d_no(),
							toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
							toDispSno(dtlR.sno1(), dtlR.sno2(), dtlR.sno3(), dtlR.sno4())));
					dtlR.err_flg(true);
				}
			}
			else {
				msgL.add(new MCMessage(dtlR, null, MSLAL0405, dtlR.data_no(),
						dtlR.data_lno(), dtlR.cst_cd(), dtlR.cst_po_no(),
						dtlR.cst_po_d_no(),
						toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
						toDispSno(dtlR.sno1(), dtlR.sno2(), dtlR.sno3(), dtlR.sno4())));
				dtlR.err_flg(true);
			}
		}
		
		/**
		 * 仕入同時計上で、同一処理グループ内に同一処理対象となる更新・削除のデータが存在するか判断
		 */
		protected boolean isSameDdlvTgt(
				MCList<AccptRecvIf_Chk01_DtlR> accptRecvIfL,
				AccptRecvIf_Chk01_DtlR dtlR) {
			boolean sameTgtFlg= false;
			for (AccptRecvIf_Chk01_DtlR accptRecvIfR : accptRecvIfL) {
				if (!MAC_DATA_CRUD_TYP.isCRT(accptRecvIfR.data_crud_typ())
					&& isSame(accptRecvIfR.cst_po_no(), dtlR.cst_po_no())
					&& isSame(accptRecvIfR.cst_po_d_no(), dtlR.cst_po_d_no())
					&& isSame(accptRecvIfR.ext_sys_cd(), dtlR.ext_sys_cd())
					&& !isSame(accptRecvIfR.ext_purc_act_d_no(), dtlR.ext_purc_act_d_no())
						) {
					MCList<MST_SLS_ACT_D_R> slsActDL = _slsActDL.subList(_slsActDExtPurcDNoIdxkey, accptRecvIfR.ext_purc_act_d_no(), dtlR.ext_sys_cd());
					boolean syncFlg = _slsActIoL.contains(_slsActIoSyncIdxkey, true, slsActDL.get(0).sls_act_d_no());
					if (syncFlg) {
						sameTgtFlg = true;
						break;
					}
				}
			}
			return sameTgtFlg;
		}
		
		/**
		 * 取引通貨単価を算出する。
		 */
		protected void calcTrdCurUpri(AccptRecvIf_Chk01_DtlR dtlR) {
			
			if (isNull(dtlR.fix_sls_schd_no()) && !dtlR.sls_schd_mult_flg()) {
				return;
			}
			if (isNull(dtlR.fix_sls_schd_no()) && dtlR.sls_schd_mult_flg() && !isNull(dtlR.fix_slo_d_no())) {
				dtlR.fix_trd_cur_upri(_sloDAllL.getFirst(MST_SLO_D_R.$slo_d_no, dtlR.fix_slo_d_no()).trd_cur_upri());
				return;
			}
			
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();
			
			ConvQtyAmtUtil_Calc01_HdrR up0R = null;
			ConvQtyAmtUtil_Calc01_Dtl1R up1R = null;
			
			up0R = ConvQtyAmtUtil_Calc01_HdrR.create();
			getCredSrcBySlsSchd(up0R, dtlR.fix_sls_schd_no());
			
			up1R = ConvQtyAmtUtil_Calc01_Dtl1R.create();
			copy(up1R, dtlR, createMap_ConvQtyAmtUtil_Calc01_Dtl1R_AccptRecvIf_Chk01_DtlR());
			
			ope.up0().add(up0R);
			ope.up1().add(up1R);
			
			if (!ope.up0().isEmpty()) {
				
				setPegNo(ope.up0());
				
				setPegNo(ope.up1());
				setPegNo(ConvQtyAmtUtil_Calc01_Dtl1R.$hdr_peg_no, ope.up1());
				
				ope.exec();
				
				dtlR.fix_trd_cur_upri(ope.down0().get(0).trd_cur_upri());
			}
		}
		
		protected Map_ConvQtyAmtUtil_Calc01_Dtl1R_AccptRecvIf_Chk01_DtlR<ConvQtyAmtUtil_Calc01_Dtl1R,AccptRecvIf_Chk01_DtlR> createMap_ConvQtyAmtUtil_Calc01_Dtl1R_AccptRecvIf_Chk01_DtlR() {
			return new Map_ConvQtyAmtUtil_Calc01_Dtl1R_AccptRecvIf_Chk01_DtlR<ConvQtyAmtUtil_Calc01_Dtl1R, AccptRecvIf_Chk01_DtlR>();
		}
		
		public class Map_ConvQtyAmtUtil_Calc01_Dtl1R_AccptRecvIf_Chk01_DtlR<D extends ConvQtyAmtUtil_Calc01_Dtl1R, S extends AccptRecvIf_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_qty, AccptRecvIf_Chk01_DtlR.$trd_unit_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_cd, AccptRecvIf_Chk01_DtlR.$trd_unit_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_qty, AccptRecvIf_Chk01_DtlR.$trd_unit_conv_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_base_qty, AccptRecvIf_Chk01_DtlR.$trd_unit_conv_base_qty);
				
			}
		}
		
		protected void getInfo() {
			
			MCList<AccptRecvIf_Chk01_DtlR> getSloInfoL = MCList.create(AccptRecvIf_Chk01_DtlR.class);
			MCList<AccptRecvIf_Chk01_DtlR> getIvInfoL = MCList.create(AccptRecvIf_Chk01_DtlR.class);
			MCList<AccptRecvIf_Chk01_DtlR> getDlvSlipInfoL = MCList.create(AccptRecvIf_Chk01_DtlR.class);
			MCList<AccptRecvIf_Chk01_DtlR> getSloSlsSchdInfoL = MCList.create(AccptRecvIf_Chk01_DtlR.class);
			MCList<AccptRecvIf_Chk01_DtlR> getDlvSlipNoL = MCList.create(AccptRecvIf_Chk01_DtlR.class);
			MCList<AccptRecvIf_Chk01_DtlR> getDlvSlipDL = MCList.create(AccptRecvIf_Chk01_DtlR.class);
			_sloDAllL = MCList.create(MST_SLO_D_R.class);
			
			for (AccptRecvIf_Chk01_DtlR dtlR : up0()) {
				if (!dtlR.imp_flg() || (isNull(dtlR.dlv_slip_no()) && isNull(dtlR.cst_po_no()))) {
					continue;
				}
				
				if (!isNull(dtlR.dlv_slip_no())) {
					// インボイス情報取得対象
					if (dtlR.iv_flg()) {
						getIvInfoL.add(dtlR);
					}
					else if (isPurcDlvSlip(dtlR)) {
						// 受注情報取得
						getSloInfoL.add(dtlR);
					}
					// 納品伝票情報取得対象
					else {
						getDlvSlipInfoL.add(dtlR);
					}
				}
				else {
					// 受注情報取得
					getSloInfoL.add(dtlR);
				}
			}
			
			// 受注情報取得
			if (!isNull(getSloInfoL) && getSloInfoL.size() > 0) {
				getSloInfo(getSloInfoL);
			}
			
			// 確定可能な受注ＮＯの取得、売上対象情報の取得
			fixSloNoAndGetSlsSchdInfo(getSloInfoL, getSloSlsSchdInfoL);
			
			// 確定可能な納品書ＮＯの取得、重複する受注明細情報の削除
			fixSlipNoAndRemoveSloDL(getDlvSlipNoL, getSloSlsSchdInfoL, getIvInfoL);
			
			for (AccptRecvIf_Chk01_DtlR dtlR : getSloInfoL) {
				if (isNull(dtlR.fix_slo_no()) && !dtlR.iv_flg()) {
					getDlvSlipDL.add(dtlR);
				}
			}
			
			// 得意先注文ＮＯ/得意先注文明細ＮＯに紐づく納品伝票の納品書ＮＯを設定
			if (getDlvSlipDL.size() > 0) {
				setDlvSlipNoFrCstPO(getDlvSlipDL, getDlvSlipInfoL);
			}
			
			// 納品書ＮＯ特定
			if (getDlvSlipNoL.size() > 0) {
				setDlvSlipNo(getDlvSlipNoL, getDlvSlipInfoL);
			}
			
			// 納品伝票情報取得
			if (!isNull(getDlvSlipInfoL) && getDlvSlipInfoL.size() > 0) {
				getDlvSlipInfo(getDlvSlipInfoL);
			}
			// インボイス情報取得
			if (!isNull(getIvInfoL) && getIvInfoL.size() > 0) {
				getIvInfo(getIvInfoL);
			}
			
			// 売上予定情報取得
			getSlsSchdInfo();
			
			// 売上実績情報取得
			getSlsActInfo();
		}
		
		/**
		 * 確定可能な受注ＮＯの取得、売上対象情報の取得処理
		 */
		protected void fixSloNoAndGetSlsSchdInfo(
				MCList<AccptRecvIf_Chk01_DtlR> getSloInfoL,
				MCList<AccptRecvIf_Chk01_DtlR> getSloSlsSchdInfoL) {
			for (AccptRecvIf_Chk01_DtlR dtlR : getSloInfoL) {
				MCList<MST_SLO_R> tmpSloL = _sloL.subList(_sloIdxkey, dtlR.cst_po_no());
				if (!isNull(tmpSloL)) {
					if(tmpSloL.size() == 1) {
						MCList<MST_SLO_D_R> tmpSloDL = _sloDL.subList(_sloDSloNoIdxkey, tmpSloL.get(0).slo_no());
						for (MST_SLO_D_R tmpSloDR : tmpSloDL) {
							if (!isNull(dtlR.cst_po_d_no()) && !isSame(dtlR.cst_po_d_no(), tmpSloDR.cst_po_d_no())) {
								continue;
							}
							if (!isNull(dtlR.itm_cd()) && !isSame(dtlR.itm_cd(), tmpSloDR.itm_cd())) {
								continue;
							}
							if (!isNull(dtlR.itm_sub1()) && !isSame(dtlR.itm_sub1(), tmpSloDR.itm_sub1())) {
								continue;
							}
							if (!isNull(dtlR.itm_sub2()) && !isSame(dtlR.itm_sub2(), tmpSloDR.itm_sub2())) {
								continue;
							}
							if (!isNull(dtlR.itm_sub3()) && !isSame(dtlR.itm_sub3(), tmpSloDR.itm_sub3())) {
								continue;
							}
							if (!isNull(dtlR.sno1()) && !isSame(dtlR.sno1(), tmpSloDR.sno1())) {
								continue;
							}
							if (!isNull(dtlR.sno2()) && !isSame(dtlR.sno2(), tmpSloDR.sno2())) {
								continue;
							}
							if (!isNull(dtlR.sno3()) && !isSame(dtlR.sno3(), tmpSloDR.sno3())) {
								continue;
							}
							if (!isNull(dtlR.sno4()) && !isSame(dtlR.sno4(), tmpSloDR.sno4())) {
								continue;
							}
							dtlR.fix_slo_no(tmpSloL.get(0).slo_no());
							dtlR.fix_slo_d_no(tmpSloDR.slo_d_no());
							if (MAC_SLO_PROC_TYP.isPURC_DDLV(tmpSloDR.proc_typ())) {
								dtlR.ddlvTgtFlg(true);
								if (dtlR.iv_flg()) {
									getSloSlsSchdInfoL.add(dtlR);
								}
							}
							else {
								getSloSlsSchdInfoL.add(dtlR);
							}
							break;
						}
					}
				}
			}
		}
		
		/**
		 * 確定可能な納品書ＮＯの取得、重複する受注明細情報の削除
		 */
		protected void fixSlipNoAndRemoveSloDL(
				MCList<AccptRecvIf_Chk01_DtlR> getDlvSlipNoL,
				MCList<AccptRecvIf_Chk01_DtlR> getSloSlsSchdInfoL,
				MCList<AccptRecvIf_Chk01_DtlR> getIvInfoL) {
			boolean removeSloDFlg = false;
			if (getSloSlsSchdInfoL.size() > 0) {
				getSloSlsShcdInfo(getSloSlsSchdInfoL);
				for (AccptRecvIf_Chk01_DtlR dtlR : getSloSlsSchdInfoL) {
					if (!isNull(dtlR.fix_slo_d_no())) {
						MCList<MST_SLS_SCHD_R> tmpSlsSchdL = null;
						if (isCrt(dtlR)) {
							tmpSlsSchdL = _slsSchdL.subList(_slsSchdSloDCmplIdxkey, false, dtlR.fix_slo_d_no());
						}
						else {
							tmpSlsSchdL = _slsSchdL.subList(_slsSchdSloDIdxkey, dtlR.fix_slo_d_no());
						}
						if (!isNull(tmpSlsSchdL)) {
							if (tmpSlsSchdL.size() == 1) {
								if (dtlR.iv_flg()) {
									dtlR.dlv_slip_no(tmpSlsSchdL.get(0).iv_no());
									dtlR.dlv_slip_d_no(tmpSlsSchdL.get(0).iv_d_no());
									dtlR.fix_dlv_slip_no(tmpSlsSchdL.get(0).iv_no());
									dtlR.fix_dlv_slip_d_no(tmpSlsSchdL.get(0).iv_d_no());
									getIvInfoL.add(dtlR);
								}
								else {
									dtlR.dlv_slip_no(null);
									dtlR.dlv_slip_d_no(tmpSlsSchdL.get(0).dlv_slip_d_no());
								}
							}
							else {
								MCList<MST_SLS_SCHD_R> tmpAddSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
								tmpSlsSchdL.sort(MST_SLS_SCHD_R.$sls_schd_dt, MST_SLS_SCHD_R.$sls_schd_no);
								boolean existFlg = false;
								for (MST_SLS_SCHD_R tmpSlsSchdR : tmpSlsSchdL) {
									if (tmpSlsSchdR.getBoolean("use_flg") == false) {
										if (!dtlR.iv_flg() || !isSame(tmpSlsSchdR.trd_unit_qty(), dtlR.trd_unit_qty())) {
											continue;
										}
										tmpAddSlsSchdL.add(tmpSlsSchdR);
										if (dtlR.iv_flg()) {
											dtlR.dlv_slip_no(tmpSlsSchdR.iv_no());
											dtlR.dlv_slip_d_no(tmpSlsSchdR.iv_d_no());
											dtlR.fix_dlv_slip_no(tmpSlsSchdR.iv_no());
											dtlR.fix_dlv_slip_d_no(tmpSlsSchdR.iv_d_no());
											getIvInfoL.add(dtlR);
										}
										else {
											dtlR.dlv_slip_no(null);
											dtlR.dlv_slip_d_no(tmpSlsSchdR.dlv_slip_d_no());
										}
										tmpSlsSchdR.setBooleanNE("use_flg", true);
										dtlR.sls_schd_mult_flg(true);
										existFlg = true;
										break;
									}
								}
								if (!existFlg) {
									dtlR.fix_slo_no(null);
									dtlR.fix_slo_d_no(null);
									dtlR.fix_sls_schd_no(null);
									dtlR.dlv_slip_no(null);
									dtlR.dlv_slip_d_no(null);
								}
								else {
									if (!isNull(tmpAddSlsSchdL)) {
										tmpSlsSchdL.clear();
										tmpSlsSchdL = tmpAddSlsSchdL;
									}
								}
							}
						}
					}
					if (isNull(dtlR.dlv_slip_no()) && !isNull(dtlR.dlv_slip_d_no())) {
						getDlvSlipNoL.add(dtlR);
						// 受注明細のリストからは対象外とする
						for (int idx = 0; idx < _sloDL.size(); idx++) {
							MST_SLO_D_R sloDR = _sloDL.get(idx); 
							if (isSame(dtlR.fix_slo_d_no(), sloDR.slo_d_no())) {
								_sloDL.remove(idx);
								removeSloDFlg = true;
								break;
							}
						}
					}
				}
			}
			
			if (removeSloDFlg) {
				_sloDL.sort(MST_SLO_D_R.$slo_no, MST_SLO_D_R.$disp_seq);
				_sloDSloNoIdxkey = _sloDL.createIndex(MST_SLO_D_R.$slo_no);
				_sloDSloDNoIdxkey = _sloDL.createIndex(MST_SLO_D_R.$slo_d_no);
				_sloDCstDNoIdxkey = _sloDL.createIndex(MST_SLO_D_R.$cst_po_d_no);
			}
		}
		
		/**
		 * 得意先注文ＮＯ/得意先注文明細ＮＯに紐づく納品伝票の納品書ＮＯを設定
		 */
		protected void setDlvSlipNoFrCstPO(MCList<AccptRecvIf_Chk01_DtlR> getDlvSlipDL, MCList<AccptRecvIf_Chk01_DtlR> getDlvSlipInfoL) {
			MCList<MST_DLV_SLIP_D_R> dlvSlipDL = MCList.create(MST_DLV_SLIP_D_R.class);
			MST_DLV_SLIP_D_R t = MST_DLV_SLIP_D_R.create("T");
			MCQueryApiBuilder dlvSlipDL_bldr = MCQueryApiBuilder.create(t);
			MST_DLV_SLIP_R t2 = MST_DLV_SLIP_R.create("T2");
			MST_SHIP_ACT_D_R t3 = MST_SHIP_ACT_D_R.create("T3");
			dlvSlipDL.addStringColumn(MST_DLV_SLIP_R.$cst_po_no);
			dlvSlipDL_bldr.setSelect(t.dlv_slip_no);
			dlvSlipDL_bldr.addSelect(t2.cst_po_no);
			dlvSlipDL_bldr.addInnerJoin(t2, bracket(t2.dlv_slip_no.eq(t.dlv_slip_no)
					.and(t2.dlv_slip_seq.eq(t.dlv_slip_seq))
					.and(t2.cst_po_no.eq(bind("cst_po_no")))
					.and(t2.bp_cd.eq(bind("cst_cd")))));
			dlvSlipDL_bldr.addInnerJoin(t3,
				t3.dlv_slip_no.eq(t.dlv_slip_no)
					.and(t3.dlv_slip_seq.eq(t.dlv_slip_seq))
					.and(t3.dlv_slip_d_no.eq(t.dlv_slip_d_no))
					.and(t3.can_flg.eq(value(false))));
			dlvSlipDL_bldr.setWhere(value(0).eq(value(0)));
			dlvSlipDL_bldr.addWhereWithCutOffAnd(t.cst_po_d_no.eq(bind("cst_po_d_no")));
			dbSelect("MSLAL5160_MST_DLV_SLIP_D_S01", dlvSlipDL, dlvSlipDL_bldr, getDlvSlipDL);
			
			if (dlvSlipDL.size() > 0) {
				MCList<MST_DLV_SLIP_D_R> dlvSlipDGrpL = dlvSlipDL.groupBy(MST_DLV_SLIP_D_R.$dlv_slip_no, MST_DLV_SLIP_R.$cst_po_no);
				
				for (MST_DLV_SLIP_D_R dlvSlipDR : dlvSlipDL) {
					for (AccptRecvIf_Chk01_DtlR dtlR : getDlvSlipDL) {
						// 同一得意先注文ＮＯに紐づく納品伝票ヘッダが複数ある場合は特定できない
						if (dlvSlipDGrpL.subList(MST_DLV_SLIP_R.$cst_po_no, dtlR.cst_po_no()).size() != 1) {
							continue;
						}
						
						if (isSame(dtlR.cst_po_no(), dlvSlipDR.getStringNE("cst_po_no"))) {
							dtlR.dlv_slip_no(dlvSlipDR.dlv_slip_no());
							getDlvSlipInfoL.add(dtlR);
							break;
						}
					}
				}
			}
		}
		
		/**
		 * 納品書ＮＯ特定
		 */
		protected void setDlvSlipNo(MCList<AccptRecvIf_Chk01_DtlR> getDlvSlipNoL, MCList<AccptRecvIf_Chk01_DtlR> getDlvSlipInfoL) {
			// 納品書ＮＯを特定
			MCList<MST_DLV_SLIP_D_R> dlvSlipDL = MCList.create(MST_DLV_SLIP_D_R.class);
			MST_DLV_SLIP_D_R t = MST_DLV_SLIP_D_R.create("T");
			MCQueryApiBuilder dlvSlipDL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_ACT_D_R t2 = MST_SHIP_ACT_D_R.create("T2");
			dlvSlipDL_bldr.setSelect(t.dlv_slip_no);
			dlvSlipDL_bldr.addSelect(t.dlv_slip_d_no);
			dlvSlipDL_bldr.setWhere(t.dlv_slip_d_no.eq(bind("dlv_slip_d_no")));
			dlvSlipDL_bldr.addInnerJoin(t2,
				t2.dlv_slip_no.eq(t.dlv_slip_no)
					.and(t2.dlv_slip_seq.eq(t.dlv_slip_seq))
					.and(t2.dlv_slip_d_no.eq(t.dlv_slip_d_no))
					.and(t2.can_flg.eq(value(false))));
			dbSelect("MSLAL5160_MST_DLV_SLIP_D_S02", dlvSlipDL, dlvSlipDL_bldr, getDlvSlipNoL);
			MCIndexKey idx = dlvSlipDL.createIndex(MST_DLV_SLIP_D_R.$dlv_slip_d_no);
			
			if (!isNull(dlvSlipDL) && dlvSlipDL.size() > 0) {
				for (AccptRecvIf_Chk01_DtlR dtlR : getDlvSlipNoL) {
					MST_DLV_SLIP_D_R dlvSlipR = dlvSlipDL.getFirst(idx, dtlR.dlv_slip_d_no());
					if (!isNull(dlvSlipR)) {
						dtlR.dlv_slip_no(dlvSlipR.dlv_slip_no());
						getDlvSlipInfoL.add(dtlR);
					}
				}
			}
		}
		
		/**
		 * 売上予定情報取得
		 */
		protected void getSloSlsShcdInfo(MCList<AccptRecvIf_Chk01_DtlR> dtlL) {
			if (isNull(_slsSchdL)) {
				_slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			}
			_slsSchdL.addStringColumn(MST_ARR_SCHD_R.$ver_no);
			_slsSchdL.addStringColumn("purc_ddlv_po_no");
			_slsSchdL.addStringColumn("purc_ddlv_po_d_no");
			_slsSchdL.addStringColumn("purc_act_no");
			
			// 受注明細に紐づく売上予定
			if (!isNull(dtlL) && dtlL.size() > 0) {
				MCList<MST_SLS_SCHD_R> addSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
				MCList<MST_SLS_SCHD_R> sloSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
				MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
				MCQueryApiBuilder sloSlsSchdL_bldr = MCQueryApiBuilder.create(t);
				MST_PURC_SCHD_R t2 = MST_PURC_SCHD_R.create("T2");
				MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
				MST_PO_SCHD_R t4 = MST_PO_SCHD_R.create("T4");
				MST_PO_D_R t5 = MST_PO_D_R.create("T5");
				MST_PURC_ACT_D_R t6 = MST_PURC_ACT_D_R.create("T6");
				MST_PURC_ACT_D_R S1W = MST_PURC_ACT_D_R.create("W");
				sloSlsSchdL_bldr.addSelect(t3.ver_no);
				sloSlsSchdL_bldr.addSelect(t4.po_no.as("purc_ddlv_po_no"));
				sloSlsSchdL_bldr.addSelect(t5.po_d_no.as("purc_ddlv_po_d_no"));
				sloSlsSchdL_bldr.addSelect(t6.purc_act_no);
				sloSlsSchdL_bldr.setWhere(t.slo_d_no.eq(bind("slo_d_no")));
				sloSlsSchdL_bldr.addWhereWithAnd(t.sls_ac_abl_flg.eq(value(true)));
				sloSlsSchdL_bldr.addLeftOuterJoin(t2, bracket(t2.purc_schd_no.eq(t.purc_schd_no)));
				sloSlsSchdL_bldr.addLeftOuterJoin(t3, bracket(t3.arr_schd_no.eq(t2.arr_schd_no)));
				sloSlsSchdL_bldr.addLeftOuterJoin(t4, bracket(t4.po_schd_no.eq(t.po_schd_no)));
				sloSlsSchdL_bldr.addLeftOuterJoin(t5, bracket(t.slo_d_no.eq(t5.slo_d_no)
						.and(t.po_schd_no.eq(t5.po_schd_no))
						.and(t5.po_no.eq(t4.po_no))
						.and(t5.can_flg.eq(value(false)))));
				sloSlsSchdL_bldr.addLeftOuterJoin(t6, bracket(t6.purc_act_d_no.eq(t.purc_act_d_no)
						.and(t6.purc_act_seq.eq(subQuery()
								.select(max(S1W.purc_act_seq))
								.from(S1W)
								.where(S1W.purc_act_d_no.eq(t.purc_act_d_no))))));
				dbSelect("MSLAL5160_MST_SLS_SCHD_S05", sloSlsSchdL, sloSlsSchdL_bldr, _sloDL);
				if (_slsSchdL.size() > 0) {
					for (MST_SLS_SCHD_R slsSchdR : sloSlsSchdL) {
						MST_SLS_SCHD_R tmpSlsSchdR = _slsSchdL.getFirst(_slsSchdNoIdxkey, slsSchdR.sls_schd_no());
						if (isNull(tmpSlsSchdR)) {
							addSlsSchdL.add(tmpSlsSchdR);
						}
					}
					_slsSchdL.addAll(addSlsSchdL);
				}
				else {
					_slsSchdL.addAll(sloSlsSchdL);
				}
			}
			if (!isNull(_slsSchdL)) {
				_slsSchdL.setBooleanNE("use_flg", false);
			}
			_slsSchdSloDIdxkey = _slsSchdL.createIndex(MST_SLS_SCHD_R.$slo_d_no);
			_slsSchdSloDCmplIdxkey = _slsSchdL.createIndex(MST_SLS_SCHD_R.$cmpl_flg, MST_SLS_SCHD_R.$slo_d_no);
		}
		
		/**
		 * 売上実績情報取得
		 */
		protected void getSlsActInfo() {
			// 外部仕入実績明細ＮＯに紐づく売上実績情報を取得
			_slsActL = MCList.create(MST_SLS_ACT_R.class);
			_slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
			_slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);

			MST_SLS_ACT_R t2 = MST_SLS_ACT_R.create("T2");
			MST_PURC_ACT_R s1t2 = MST_PURC_ACT_R.create("S1T2");
			MST_PURC_ACT_R s1W = MST_PURC_ACT_R.create("W");
			MST_PURC_ACT_D_R s1t3 = MST_PURC_ACT_D_R.create("S1T3");
			MST_ARR_ACT_R s2t2 = MST_ARR_ACT_R.create("S2T2");
			MST_SHIP_ACT_D_R s2t3 = MST_SHIP_ACT_D_R.create("S2T3");
			MST_SLS_ACT_D_R s2t4 = MST_SLS_ACT_D_R.create("S2T4");
			
			MCList<MST_SLS_ACT_D_R> tmpSlsActDL = MCList.create(MST_SLS_ACT_D_R.class);
			MST_SLS_ACT_D_R tmpSlsActDL_t = MST_SLS_ACT_D_R.create("T");
			MCQueryApiBuilder tmpSlsActDL_bldr = MCQueryApiBuilder.create(tmpSlsActDL_t);
			tmpSlsActDL_bldr.setWhere(tmpSlsActDL_t.ext_purc_act_d_no.eq(bind("ext_purc_act_d_no")));
			tmpSlsActDL_bldr.addWhereWithAnd(tmpSlsActDL_t.ext_sys_cd.eq(bind("ext_sys_cd")));
			tmpSlsActDL_bldr.addWhereWithAnd(tmpSlsActDL_t.sls_act_seq.eq(t2.sls_act_seq));
			tmpSlsActDL_bldr.addWhereWithCutOffAnd(tmpSlsActDL_t.slo_no.eq(bind("fix_slo_no")));
			tmpSlsActDL_bldr.addWhereWithCutOffAnd(tmpSlsActDL_t.slo_d_no.eq(bind("fix_slo_d_no")));
			tmpSlsActDL_bldr.addInnerJoin(t2,
					bracket(t2.sls_act_no.eq(tmpSlsActDL_t.sls_act_no)
							.and(t2.edi_flg.eq(value(true)))
							.and(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							.and(t2.cst_cd.eq(bind("cst_cd")))));
			dbSelect("MSLAL5160_MST_SLS_ACT_D_S03", tmpSlsActDL, tmpSlsActDL_bldr, up0());

			MST_SLS_ACT_R slsActL_t = MST_SLS_ACT_R.create("T");
			MCQueryApiBuilder slsActL_bldr = MCQueryApiBuilder.create(slsActL_t);
			slsActL_bldr.setWhere(slsActL_t.sls_act_no.eq(bind("sls_act_no")));
			slsActL_bldr.addWhereWithAnd(slsActL_t.sls_act_seq.eq(bind("sls_act_seq")));
			slsActL_bldr.addOrderBy(slsActL_t.sls_act_no.asc(), slsActL_t.sls_act_seq.asc());
			dbSelectForUpdate("MSLAL5160_MST_SLS_ACT_S01", _slsActL, slsActL_bldr, tmpSlsActDL.groupBy(MST_SLS_ACT_D_R.$sls_act_no, MST_SLS_ACT_D_R.$sls_act_seq));
			_slsActIdxkey =_slsActL.createIndex(MST_SLS_ACT_R.$sls_act_no);
			_slsActIvIdxKey = _slsActL.createIndex(MST_SLS_ACT_R.$iv_no);

			_slsActDL.addNumberColumn("upd_purc_peg_no");
			_slsActDL.addNumberColumn("purc_act_seq");
			_slsActDL.addNumberColumn("purc_act_d_seq");
			_slsActDL.addDateColumn("ship_fr_valid_dt");
			_slsActDL.addStringColumn("ver_no");
			_slsActDL.addStringColumn("bp_lot_no");
			_slsActDL.addStringColumn("bp_dlv_slip_no");
			_slsActDL.addStringColumn("bp_dlv_slip_d_no");

			MST_SLS_ACT_D_R slsActDL_t = MST_SLS_ACT_D_R.create("T");
			MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(slsActDL_t);
			slsActDL_bldr.addSelect(s1t2.purc_act_seq);
			slsActDL_bldr.addSelect(s1t3.purc_act_d_seq);
			slsActDL_bldr.setWhere(slsActDL_t.sls_act_no.eq(bind("sls_act_no")));
			slsActDL_bldr.addWhereWithAnd(slsActDL_t.sls_act_seq.eq(bind("sls_act_seq")));
			slsActDL_bldr.addLeftOuterJoin(s1t2, bracket(s1t2.purc_act_no
					.eq(slsActDL_t.purc_act_no)
					.and(s1t2.purc_act_seq.eq(subQuery()
							.select(max(s1W.purc_act_seq))
							.from(s1W)
							.where(s1W.purc_act_no.eq(slsActDL_t.purc_act_no)
									.and(s1W.slip_sts_typ.eq(
											value(MAC_SLIP_STS_TYP.CRT.value()))))))));
			slsActDL_bldr.addLeftOuterJoin(s1t3,
					bracket(s1t3.purc_act_no.eq(slsActDL_t.purc_act_no)
							.and(s1t3.purc_act_d_no.eq(slsActDL_t.purc_act_d_no))
							.and(s1t3.purc_act_seq.eq(s1t2.purc_act_seq))));
			slsActDL_bldr.addOrderBy(slsActDL_t.sls_act_d_no.asc(), slsActDL_t.sls_act_d_seq.asc());
			dbSelect("MSLAL5160_MST_SLS_ACT_D_S04", _slsActDL, slsActDL_bldr, _slsActL);
			_slsActDExtPurcDNoIdxkey = _slsActDL.createIndex(MST_SLS_ACT_D_R.$ext_purc_act_d_no, MST_SLS_ACT_D_R.$ext_sys_cd);
			_slsActDSlsActNoIdxkey = _slsActDL.createIndex(MST_SLS_ACT_D_R.$sls_act_no);
			
			_slsActIoL.addStringColumn(MST_SHIP_ACT_D_R.$ship_alloc_sts_no);
			_slsActIoL.addStringColumn(MST_ARR_ACT_R.$ver_no);
			_slsActIoL.addStringColumn(MST_ARR_ACT_R.$bp_lot_no);
			_slsActIoL.addStringColumn(MST_ARR_ACT_R.$bp_dlv_slip_no);
			_slsActIoL.addStringColumn(MST_ARR_ACT_R.$bp_dlv_slip_d_no);
			_slsActIoL.addDateColumn(MST_ARR_ACT_R.$ship_fr_valid_dt);
			_slsActIoL.addStringColumn(MST_SLS_ACT_D_R.$sls_schd_no);

			MST_SLS_ACT_IO_R slsActIoL_t = MST_SLS_ACT_IO_R.create("T");
			MCQueryApiBuilder slsActIoL_bldr = MCQueryApiBuilder.create(slsActIoL_t);
			slsActIoL_bldr.addSelect(s2t2.ver_no);
			slsActIoL_bldr.addSelect(s2t2.bp_lot_no);
			slsActIoL_bldr.addSelect(s2t2.bp_dlv_slip_no);
			slsActIoL_bldr.addSelect(s2t2.bp_dlv_slip_d_no);
			slsActIoL_bldr.addSelect(s2t2.ship_fr_valid_dt);
			slsActIoL_bldr.addSelect(s2t3.ship_alloc_sts_no);
			slsActIoL_bldr.addSelect(s2t4.sls_schd_no);
			slsActIoL_bldr.setWhere(slsActIoL_t.sls_act_d_no.eq(bind("sls_act_d_no")));
			slsActIoL_bldr.addWhereWithAnd(slsActIoL_t.sls_act_d_seq.eq(bind("sls_act_d_seq")));
			slsActIoL_bldr.addLeftOuterJoin(s2t2,
					bracket(s2t2.arr_act_no.eq(slsActIoL_t.arr_act_no)
							.and(s2t2.can_flg.eq(value(false)))));
			slsActIoL_bldr.addLeftOuterJoin(s2t3,
					bracket(s2t3.ship_act_d_no.eq(slsActIoL_t.ship_act_d_no)
							.and(s2t3.can_flg.eq(value(false)))));
			slsActIoL_bldr.addLeftOuterJoin(s2t4,
					bracket(s2t4.sls_act_d_no.eq(slsActIoL_t.sls_act_d_no)
							.and(s2t4.sls_act_d_seq.eq(slsActIoL_t.sls_act_d_seq))));
			slsActIoL_bldr.addOrderBy(slsActIoL_t.sls_act_io_no.asc(), slsActIoL_t.sls_act_io_seq.asc());
			dbSelect("MSLAL5160_MST_SLS_ACT_IO_S01", _slsActIoL, slsActIoL_bldr, _slsActDL);
			_slsActIoIdxkey = _slsActIoL.createIndex(MST_SLS_ACT_IO_R.$sls_act_d_no);
			_slsActIoSyncIdxkey = _slsActIoL.createIndex(MST_SLS_ACT_IO_R.$sync_flg, MST_SLS_ACT_IO_R.$sls_act_d_no);
			_slsActIoSyncSlsSchdIdxkey = _slsActIoL.createIndex(MST_SLS_ACT_IO_R.$sync_flg, MST_SLS_ACT_D_R.$sls_schd_no);
		}
		
		/**
		 * 納品伝票情報取得
		 */
		protected void getDlvSlipInfo(MCList<AccptRecvIf_Chk01_DtlR> dlvSlipL) {
			MCList<AccptRecvIf_Chk01_DtlR> dlvSlipGrpL = dlvSlipL.groupBy(AccptRecvIf_Chk01_DtlR.$dlv_slip_no, AccptRecvIf_Chk01_DtlR.$cst_cd);
			
			// 納品伝票ヘッダ情報
			_dlvSlipL = MCList.create(MST_DLV_SLIP_R.class);
			MST_DLV_SLIP_R dlvSlipL_t = MST_DLV_SLIP_R.create("T");
			MST_DLV_SLIP_R w1 = MST_DLV_SLIP_R.create("W1");
			MCQueryApiBuilder dlvSlipL_bldr = MCQueryApiBuilder.create(dlvSlipL_t);
			dlvSlipL_bldr.setWhere(dlvSlipL_t.dlv_slip_no.eq(bind("dlv_slip_no")));
			dlvSlipL_bldr.addWhereWithAnd(dlvSlipL_t.dlv_slip_seq.eq(
				subQuery()
				.select(max(w1.dlv_slip_seq))
				.from(w1)
				.where(
					w1.dlv_slip_no.eq(dlvSlipL_t.dlv_slip_no)
					.and(w1.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
					.and(w1.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
				)
			));
			dlvSlipL_bldr.addWhereWithAnd(dlvSlipL_t.bp_cd.eq(bind("cst_cd")));
			dlvSlipL_bldr.setOrderByAsc(dlvSlipL_t.dlv_slip_no);
			dbSelectForUpdate("MSLAL5160_MST_DLV_SLIP_S01", _dlvSlipL, dlvSlipL_bldr, dlvSlipGrpL);
			_dlvSlipIdxkey = _dlvSlipL.createIndex(MST_DLV_SLIP_R.$dlv_slip_no);
			
			// 納品伝票明細情報
			_dlvSlipDL = MCList.create(MST_DLV_SLIP_D_R.class);
			MST_DLV_SLIP_D_R dlvSlipDL_t = MST_DLV_SLIP_D_R.create("T");
			MCQueryApiBuilder dlvSlipDL_bldr = MCQueryApiBuilder.create(dlvSlipDL_t);
			MST_DLV_SLIP_R t2 = MST_DLV_SLIP_R.create("T2");
			MST_SLO_D_R t3 = MST_SLO_D_R.create("T3");
			MAM_UNIT_R m1 = MAM_UNIT_R.create("M1");
			MAVM_ITM_UNIT_R m2 = MAVM_ITM_UNIT_R.create("M2");
			MAM_CUR_R m3 = MAM_CUR_R.create("M3");
			MAM_TAX_R m4 = MAM_TAX_R.create("M4");
			_dlvSlipDL.addNumberColumn("base_unit_dec_place");
			_dlvSlipDL.addStringColumn("base_unit_rnd_typ");
			_dlvSlipDL.addNumberColumn("trd_unit_conv_base_qty");
			_dlvSlipDL.addNumberColumn("trd_unit_conv_qty");
			_dlvSlipDL.addStringColumn(MST_SLO_D_R.$dscnt_rsn_cd);
			_dlvSlipDL.addNumberColumn(MAM_CUR_R.$amt_dec_place);
			_dlvSlipDL.addNumberColumn(MAM_TAX_R.$tax_rate);
			dlvSlipDL_bldr.addSelect(t3.dscnt_rsn_cd);
			dlvSlipDL_bldr.addSelect(m1.dec_place.as("base_unit_dec_place"));
			dlvSlipDL_bldr.addSelect(m1.rnd_typ.as("base_unit_rnd_typ"));
			dlvSlipDL_bldr.addSelect(m2.conv_base_qty.as("trd_unit_conv_base_qty"));
			dlvSlipDL_bldr.addSelect(m2.conv_qty.as("trd_unit_conv_qty"));
			dlvSlipDL_bldr.addSelect(m3.amt_dec_place);
			dlvSlipDL_bldr.addSelect(m4.tax_rate);
			_dlvSlipDL.addNumberColumn("amt_dec_place");
			dlvSlipDL_bldr.setWhere(dlvSlipDL_t.dlv_slip_no.eq(bind("dlv_slip_no")));
			dlvSlipDL_bldr.addWhereWithAnd(dlvSlipDL_t.dlv_slip_seq.eq(bind("dlv_slip_seq")));
			dlvSlipDL_bldr.addLeftOuterJoin(t2,
					bracket(t2.dlv_slip_no.eq(dlvSlipDL_t.dlv_slip_no)
							.and(t2.dlv_slip_seq.eq(dlvSlipDL_t.dlv_slip_seq))));
			dlvSlipDL_bldr.addLeftOuterJoin(t3,
					bracket(t3.slo_d_no.eq(dlvSlipDL_t.slo_d_no)));
			dlvSlipDL_bldr.addLeftOuterJoin(m1,
					m1.unit_cd.eq(dlvSlipDL_t.base_unit_cd));
			dlvSlipDL_bldr.addLeftOuterJoin(m2,
					bracket(m2.itm_cd.eq(dlvSlipDL_t.itm_cd)
							.and(m2.itm_sub1.eq(dlvSlipDL_t.itm_sub1))
							.and(m2.itm_sub2.eq(dlvSlipDL_t.itm_sub2))
							.and(m2.itm_sub3.eq(dlvSlipDL_t.itm_sub3))
							.and(m2.unit_cd.eq(dlvSlipDL_t.trd_unit_cd))));
			dlvSlipDL_bldr.addLeftOuterJoin(m3, m3.cur_cd.eq(t2.trd_cur_cd));
			dlvSlipDL_bldr.addLeftOuterJoin(m4, m4.tax_cd.eq(dlvSlipDL_t.tax_cd));
			dlvSlipDL_bldr.setOrderByAsc(dlvSlipDL_t.dlv_slip_no, dlvSlipDL_t.dlv_slip_d_no);
			dbSelect("MSLAL5160_MST_DLV_SLIP_D_S03", _dlvSlipDL, dlvSlipDL_bldr, _dlvSlipL);
			_dlvSlipDIdxkey = _dlvSlipDL.createIndex(MST_DLV_SLIP_D_R.$dlv_slip_d_no);
			_dlvSlipDSlipNoIdxkey = _dlvSlipDL.createIndex(MST_DLV_SLIP_D_R.$dlv_slip_no);
			
			getDlvSlipShipActL();
			
			// 出荷実績明細情報
			_shipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
			MST_SHIP_ACT_D_R shipActDL_t = MST_SHIP_ACT_D_R.create("T");
			MCQueryApiBuilder shipActDL_bldr = MCQueryApiBuilder.create(shipActDL_t);
			shipActDL_bldr.setWhere(shipActDL_t.dlv_slip_d_no.eq(bind("dlv_slip_d_no")));
			shipActDL_bldr.addWhereWithAnd(shipActDL_t.dlv_slip_no.eq(bind("dlv_slip_no")));
			shipActDL_bldr.addWhereWithAnd(shipActDL_t.dlv_slip_d_no.eq(bind("dlv_slip_d_no")));
			shipActDL_bldr.addWhereWithAnd(shipActDL_t.can_flg.eq(value(false)));
			shipActDL_bldr.setOrderByAsc(shipActDL_t.dlv_slip_no,
					shipActDL_t.dlv_slip_d_no, shipActDL_t.disp_seq);
			dbSelect("MSLAL5160_MST_SHIP_ACT_D_S02", _shipActDL, shipActDL_bldr, _dlvSlipDL);
			_shipActDIdxkey = _shipActDL.createIndex(MST_SHIP_ACT_D_R.$dlv_slip_no,
					MST_SHIP_ACT_D_R.$dlv_slip_d_no);
			// 受注情報取得
			_dlvSlipSloL = MCList.create(MST_SLO_R.class);
			MST_SLO_R dlvSlipSloL_t = MST_SLO_R.create("T");
			MCQueryApiBuilder dlvSlipSloL_bldr = MCQueryApiBuilder.create(dlvSlipSloL_t);
			dlvSlipSloL_bldr.setWhere(dlvSlipSloL_t.slo_no.eq(bind("slo_no")));
			dbSelect("MSLAL5160_MST_SLO_S01", _dlvSlipSloL, dlvSlipSloL_bldr, _dlvSlipL);
			_dlvSlipSloIdxkey = _dlvSlipSloL.createIndex(MST_SLO_R.$slo_no);
			// getSloInfoでは、受注明細を取得するときに有効桁数や換算数もまとめて取得しているが、
			// このリスト（_sloDAllL）を利用するときはそれらの項目は使用しないので、ここでは取得しない
			_sloDAllL.merge(getSloDL(_dlvSlipSloL), MST_SLO_D_R.$slo_d_no);
		}
		protected MCList<MST_SLO_D_R> getSloDL(MCList<?> lst) {
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setWhere(t.slo_no.eq(bind("slo_no")));
			bldr.addConstWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSLAL5160_MST_SLO_S04", sloDL, bldr, lst);
			return sloDL;
		}
		protected void getDlvSlipShipActL() {
			_dlvSlipShipActL = MCList.create(MST_DLV_SLIP_R.class);
			MST_DLV_SLIP_R dlvSlipR = MST_DLV_SLIP_R.create("SLIP");
			MST_DLV_SLIP_R w1 = MST_DLV_SLIP_R.create("SLIP_W1");
			MCQueryApiBuilder dlvSlipBldr = MCQueryApiBuilder.create(dlvSlipR);
			dlvSlipBldr.setSelect(dlvSlipR.dlv_slip_no);
			dlvSlipBldr.addSelect(dlvSlipR.ac_dt);
			dlvSlipBldr.setWhere(dlvSlipR.dlv_slip_no.eq(bind("dlv_slip_no")));
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
			dbSelect("MSLAL5160_MST_DLV_SLIP_S02", _dlvSlipShipActL, dlvSlipBldr, _dlvSlipL);
			_dlvSlipShipActIdx = _dlvSlipShipActL.createIndex(MST_DLV_SLIP_R.$dlv_slip_no);
		}
		
		/**
		 * インボイス情報取得
		 */
		protected void getIvInfo(MCList<AccptRecvIf_Chk01_DtlR> ivL) {
			MCList<AccptRecvIf_Chk01_DtlR> ivGrpL = ivL.groupBy(AccptRecvIf_Chk01_DtlR.$dlv_slip_no, AccptRecvIf_Chk01_DtlR.$cst_cd);
			
			MST_SLO_R t2 = MST_SLO_R.create("T2");
			MST_IV_R t3 = MST_IV_R.create("T3");
			MST_SLO_D_R t4 = MST_SLO_D_R.create("T4");
			MAM_UNIT_R m1 = MAM_UNIT_R.create("M1");
			MAVM_ITM_UNIT_R m2 = MAVM_ITM_UNIT_R.create("M2");
			MAM_CUR_R m3 = MAM_CUR_R.create("M3");
			MAM_TAX_R m4 = MAM_TAX_R.create("M4");
			MAM_BP_R cst = MAM_BP_R.create("CST");
			MAM_BP_R acst = MAM_BP_R.create("ACST");
			MAM_BP_R bcst = MAM_BP_R.create("BCST");
			
			// インボイスヘッダ情報
			_ivL = MCList.create(MST_IV_R.class);
			MST_IV_R ivL_t = MST_IV_R.create("T");
			MCQueryApiBuilder ivL_bldr = MCQueryApiBuilder.create(ivL_t);
			ivL_bldr.setWhere(ivL_t.iv_no.eq(bind("dlv_slip_no")));
			ivL_bldr.addWhereWithCutOffAnd(ivL_t.iv_no.eq(bind("fix_dlv_slip_no")));
			ivL_bldr.addWhereWithAnd(ivL_t.ship_rqst_id_typ.eq(value(MSC_SHIP_RQST_ID_TYP.CST.value())));
			ivL_bldr.addWhereWithAnd(ivL_t.ship_rqst_id_cd.eq(bind("cst_cd")));
			ivL_bldr.setOrderByAsc(ivL_t.iv_mng_no);
			dbSelectForUpdate("MSLAL5160_MST_IV_S01", _ivL, ivL_bldr, ivGrpL);
			_ivIdxkey = _ivL.createIndex(MST_IV_R.$iv_no);
			
			// インボイス明細情報
			_ivDL = MCList.create(MST_IV_D_R.class);
			MST_IV_D_R ivDL_t = MST_IV_D_R.create("T");
			MCQueryApiBuilder ivDL_bldr = MCQueryApiBuilder.create(ivDL_t);
			_ivDL.addStringColumn(MST_SLO_R.$sls_basis_typ);
			_ivDL.addStringColumn(MST_SLO_D_R.$proc_typ);
			_ivDL.addNumberColumn("base_unit_dec_place");
			_ivDL.addStringColumn("base_unit_rnd_typ");
			_ivDL.addNumberColumn("trd_unit_conv_base_qty");
			_ivDL.addNumberColumn("trd_unit_conv_qty");
			_ivDL.addNumberColumn(MAM_CUR_R.$amt_dec_place);
			_ivDL.addNumberColumn(MAM_TAX_R.$tax_rate);
			_ivDL.addStringColumn(MAM_BP_R.$bill_cl_typ);
			ivDL_bldr.addSelect(t2.sls_basis_typ);
			ivDL_bldr.addSelect(t4.proc_typ);
			ivDL_bldr.addSelect(m1.dec_place.as("base_unit_dec_place"));
			ivDL_bldr.addSelect(m1.rnd_typ.as("base_unit_rnd_typ"));
			ivDL_bldr.addSelect(m2.conv_base_qty.as("trd_unit_conv_base_qty"));
			ivDL_bldr.addSelect(m2.conv_qty.as("trd_unit_conv_qty"));
			ivDL_bldr.addSelect(m3.amt_dec_place);
			ivDL_bldr.addSelect(m4.tax_rate);
			ivDL_bldr.addSelect(bcst.bill_cl_typ);
			ivDL_bldr.setWhere(ivDL_t.iv_mng_no.eq(bind("iv_mng_no")));
			ivDL_bldr.addLeftOuterJoin(t2, bracket(t2.slo_no.eq(ivDL_t.slo_no)));
			ivDL_bldr.addLeftOuterJoin(t3, bracket(t3.iv_mng_no.eq(ivDL_t.iv_mng_no)));
			ivDL_bldr.addLeftOuterJoin(t4, bracket(t4.slo_d_no.eq(ivDL_t.slo_d_no)));
			ivDL_bldr.addLeftOuterJoin(m1, m1.unit_cd.eq(ivDL_t.base_unit_cd));
			ivDL_bldr.addLeftOuterJoin(m2, bracket(m2.itm_cd.eq(ivDL_t.itm_cd)
					.and(m2.itm_sub1.eq(ivDL_t.itm_sub1))
					.and(m2.itm_sub2.eq(ivDL_t.itm_sub2))
					.and(m2.itm_sub3.eq(ivDL_t.itm_sub3))
					.and(m2.unit_cd.eq(ivDL_t.trd_unit_cd))));
			ivDL_bldr.addLeftOuterJoin(m3, m3.cur_cd.eq(t3.trd_cur_cd));
			ivDL_bldr.addLeftOuterJoin(m4, m4.tax_cd.eq(ivDL_t.tax_cd));
			ivDL_bldr.addLeftOuterJoin(cst, bracket(t3.ship_rqst_id_cd.eq(cst.bp_cd)));
			ivDL_bldr.addLeftOuterJoin(acst, bracket(cst.acst_cd.eq(acst.bp_cd)));
			ivDL_bldr.addLeftOuterJoin(bcst, bracket(acst.bcst_cd.eq(bcst.bp_cd)));
			ivDL_bldr.setOrderByAsc(ivDL_t.iv_mng_no, ivDL_t.iv_d_no, ivDL_t.disp_seq);
			dbSelect("MSLAL5160_MST_IV_D_S01", _ivDL, ivDL_bldr, _ivL);
			_ivDIdxkey = _ivDL.createIndex(MST_IV_D_R.$iv_d_no);
			_ivDIvMngNoIdxkey = _ivDL.createIndex(MST_IV_D_R.$iv_mng_no);
			
			getIvShipActL();
			getShipActL();
			
			// インボイスに紐づく受注明細の手配区分が仕入直送の場合、受注情報を取得
			getSloIvDdlv();
			
			// getSloInfoでは、受注明細を取得するときに有効桁数や換算数もまとめて取得しているが、
			// このリスト（_sloDAllL）を利用するときはそれらの項目は使用しないので、ここでは取得しない
			_sloDAllL.merge(getSloDL(_ivDL), MST_SLO_D_R.$slo_d_no);
			
		}
		
		/**
		 * インボイスに紐づく受注明細の手配区分が仕入直送の場合、受注情報を取得
		 */
		protected void getSloIvDdlv() {
			MST_SLO_R t2 = MST_SLO_R.create("T2");
			MAM_UNIT_R m1 = MAM_UNIT_R.create("M1");
			MAVM_ITM_UNIT_R m2 = MAVM_ITM_UNIT_R.create("M2");
			MAM_CUR_R m3 = MAM_CUR_R.create("M3");
			MAM_TAX_R m4 = MAM_TAX_R.create("M4");
			
			// インボイスに紐づく受注明細の手配区分が仕入直送の場合、受注情報を取得
			MCList<MST_IV_D_R> ivDSloGrpL = _ivDL.groupBy(MST_IV_D_R.$slo_no, MST_SLO_D_R.$proc_typ).subList(MST_SLO_D_R.$proc_typ, MAC_SLO_PROC_TYP.PURC_DDLV.value());
			MCList<MST_SLO_R> ivSloL = MCList.create(MST_SLO_R.class);
			MCList<MST_SLO_D_R> ivSloDL = MCList.create(MST_SLO_D_R.class);
			
			if (!isNull(ivDSloGrpL) && ivDSloGrpL.size() > 0) { 
				if (isNull(_sloL)) { 
					_sloL = MCList.create(MST_SLO_R.class);
				}
				MST_SLO_R ivSloL_t = MST_SLO_R.create("T");
				MCQueryApiBuilder ivSloL_bldr = MCQueryApiBuilder.create(ivSloL_t);
				ivSloL_bldr.setWhere(ivSloL_t.slo_no.eq(bind("slo_no")));
				ivSloL_bldr.addWhereWithAnd(ivSloL_t.can_flg.eq(value(false)));
				ivSloL_bldr.setOrderByAsc(ivSloL_t.slo_no);
				dbSelect("MSLAL5160_MST_SLO_S02", ivSloL, ivSloL_bldr, ivDSloGrpL);
				
				MCList<MST_SLO_R> addSloL = MCList.create(MST_SLO_R.class);
				if (_sloL.size() > 0) {
					for (MST_SLO_R sloR : ivSloL) {
						MST_SLO_R tmpSloR = _sloL.getFirst(_sloSloNoIdxkey, sloR.slo_no());
						if (isNull(tmpSloR)) {
							addSloL.add(sloR);
						}
					}
					_sloL.addAll(addSloL);
				}
				else {
					addSloL = ivSloL;
					_sloL.addAll(ivSloL);
				}
				
				_sloIdxkey = _sloL.createIndex(MST_SLO_R.$cst_po_no);
				_sloSloNoIdxkey = _sloL.createIndex(MST_SLO_R.$slo_no);
				
				if (isNull(_sloDL)) {
					_sloDL = MCList.create(MST_SLO_D_R.class);
				}
				ivSloDL.addNumberColumn("base_unit_dec_place");
				ivSloDL.addStringColumn("base_unit_rnd_typ");
				ivSloDL.addNumberColumn("trd_unit_conv_base_qty");
				ivSloDL.addNumberColumn("trd_unit_conv_qty");
				ivSloDL.addNumberColumn(MAM_CUR_R.$amt_dec_place);
				ivSloDL.addNumberColumn(MAM_TAX_R.$tax_rate);
				
				MST_SLO_D_R ivSloDL_t = MST_SLO_D_R.create("T");
				MCQueryApiBuilder ivSloDL_bldr = MCQueryApiBuilder.create(ivSloDL_t);
				ivSloDL_bldr.addSelect(m1.dec_place.as("base_unit_dec_place"));
				ivSloDL_bldr.addSelect(m1.rnd_typ.as("base_unit_rnd_typ"));
				ivSloDL_bldr.addSelect(m2.conv_base_qty.as("trd_unit_conv_base_qty"));
				ivSloDL_bldr.addSelect(m2.conv_qty.as("trd_unit_conv_qty"));
				ivSloDL_bldr.addSelect(m3.amt_dec_place);
				ivSloDL_bldr.addSelect(m4.tax_rate);
				ivSloDL_bldr.setWhere(ivSloDL_t.slo_no.eq(bind("slo_no")));
				ivSloDL_bldr.addWhereWithAnd(ivSloDL_t.slo_rev.eq(bind("slo_rev")));
				ivSloDL_bldr.addWhereWithAnd(ivSloDL_t.can_flg.eq(value(false)));
				ivSloDL_bldr.addLeftOuterJoin(t2, t2.slo_no.eq(ivSloDL_t.slo_no));
				ivSloDL_bldr.addLeftOuterJoin(m1, m1.unit_cd.eq(ivSloDL_t.base_unit_cd));
				ivSloDL_bldr.addLeftOuterJoin(m2,
						bracket(m2.itm_cd.eq(ivSloDL_t.itm_cd)
								.and(m2.itm_sub1.eq(ivSloDL_t.itm_sub1))
								.and(m2.itm_sub2.eq(ivSloDL_t.itm_sub2))
								.and(m2.itm_sub3.eq(ivSloDL_t.itm_sub3))
								.and(m2.unit_cd.eq(ivSloDL_t.trd_unit_cd))));
				ivSloDL_bldr.addLeftOuterJoin(m3, m3.cur_cd.eq(t2.trd_cur_cd));
				ivSloDL_bldr.addLeftOuterJoin(m4, m4.tax_cd.eq(ivSloDL_t.tax_cd));
				ivSloDL_bldr.setOrderByAsc(ivSloDL_t.slo_no, ivSloDL_t.slo_d_no, ivSloDL_t.cst_po_d_no);
				if (!addSloL.isEmpty()) {
					dbSelect("MSLAL5160_MST_SLO_D_S01", ivSloDL, ivSloDL_bldr, addSloL);
				}
				_sloDL.addAll(ivSloDL);
				
				_sloDL.sort(MST_SLO_D_R.$slo_no, MST_SLO_D_R.$disp_seq);
				_sloDSloNoIdxkey = _sloDL.createIndex(MST_SLO_D_R.$slo_no);
				_sloDSloDNoIdxkey = _sloDL.createIndex(MST_SLO_D_R.$slo_d_no);
				_sloDCstDNoIdxkey = _sloDL.createIndex(MST_SLO_D_R.$cst_po_d_no);
			}
		}
		
		protected void getIvShipActL() {
			_ivShipActDL = MCList.create(MST_IV_SHIP_ACT_D_R.class);
			MST_SHIP_ACT_R shipActR = MST_SHIP_ACT_R.create("SHIPACT");
			MST_SHIP_ACT_D_R shipActDR = MST_SHIP_ACT_D_R.create("SHIPACTD");
			MST_IV_R ivR = MST_IV_R.create("IV");
			MST_IV_SHIP_ACT_D_R ivShipActDR = MST_IV_SHIP_ACT_D_R.create("IVSHIPACTD");
			MCQueryApiBuilder ivShipActDBldr = MCQueryApiBuilder.create(ivShipActDR);
			ivShipActDBldr.setSelect(ivShipActDR.iv_no);
			ivShipActDBldr.addSelect(ivShipActDR.iv_d_no);
			ivShipActDBldr.addSelect(shipActR.ac_dt.as("ac_dt"));
			ivShipActDBldr.addSelect(shipActDR.dlv_slip_no.as("dlv_slip_no"));
			ivShipActDBldr.addSelect(shipActDR.dlv_slip_d_no.as("dlv_slip_d_no"));
			ivShipActDBldr.addInnerJoin(ivR, ivShipActDR.iv_no.eq(ivR.iv_no));
			ivShipActDBldr.addInnerJoin(shipActDR, ivShipActDR.ship_act_d_no.eq(shipActDR.ship_act_d_no));
			ivShipActDBldr.addInnerJoin(shipActR, shipActDR.ship_act_no.eq(shipActR.ship_act_no));
			ivShipActDBldr.setWhere(ivShipActDR.iv_d_no.eq(bind("iv_d_no")));
			ivShipActDBldr.addWhereWithAnd(ivR.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.VIA.value())));
			ivShipActDBldr.addWhereWithAnd(shipActR.can_flg.eq(value(false)));
			dbSelect("MSLAL5160_MST_IV_SHIP_ACT_D_S02", _ivShipActDL, ivShipActDBldr, _ivDL);
			_ivShipActDIdx = _ivShipActDL.createIndex(MST_IV_SHIP_ACT_D_R.$iv_no, MST_IV_SHIP_ACT_D_R.$iv_d_no);
		}
		
		protected void getShipActL() {
			_ivMapL = MCList.create(MST_IV_MAP_R.class);
			MST_SHIP_ACT_R shipActR = MST_SHIP_ACT_R.create("SHIPACT");
			MST_SHIP_ACT_D_R shipActDR = MST_SHIP_ACT_D_R.create("SHIPACTD");
			MST_IV_R ivR = MST_IV_R.create("IV");
			MST_IV_D_R ivDR = MST_IV_D_R.create("IVD");
			MST_IV_MAP_R ivMapR = MST_IV_MAP_R.create("IVMAP");
			MST_SHIP_ALLOC_STS_R allocStsR = MST_SHIP_ALLOC_STS_R.create("ALLOCSTS");
			MCQueryApiBuilder ivMapBldr = MCQueryApiBuilder.create(ivMapR);
			ivMapBldr.setSelect(ivMapR.iv_d_no);
			ivMapBldr.addSelect(shipActR.ac_dt.as("ac_dt"));
			ivMapBldr.addSelect(shipActDR.dlv_slip_no.as("dlv_slip_no"));
			ivMapBldr.addSelect(shipActDR.dlv_slip_d_no.as("dlv_slip_d_no"));
			ivMapBldr.addInnerJoin(ivDR, ivMapR.iv_d_no.eq(ivDR.iv_d_no));
			ivMapBldr.addInnerJoin(ivR, ivDR.iv_mng_no.eq(ivR.iv_mng_no));
			ivMapBldr.addInnerJoin(allocStsR, ivMapR.ship_schd_no.eq(allocStsR.ship_schd_no));
			ivMapBldr.addInnerJoin(shipActDR, allocStsR.ship_alloc_sts_no.eq(shipActDR.ship_alloc_sts_no));
			ivMapBldr.addInnerJoin(shipActR, shipActDR.ship_act_no.eq(shipActR.ship_act_no));
			ivMapBldr.setWhere(ivMapR.iv_d_no.eq(bind("iv_d_no")));
			ivMapBldr.addWhereWithAnd(ivR.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value())));
			ivMapBldr.addWhereWithAnd(shipActR.can_flg.eq(value(false)));
			dbSelect("MSLAL5160_MST_IV_MAP_S01", _ivMapL, ivMapBldr, _ivDL);
			_ivMapIdx = _ivMapL.createIndex(MST_IV_MAP_R.$iv_d_no);
		}
		
		/**
		 * 受注情報取得
		 */
		protected void getSloInfo(MCList<AccptRecvIf_Chk01_DtlR> ddlvL) {
			MCList<AccptRecvIf_Chk01_DtlR> ddlvGrpL = ddlvL.groupBy(AccptRecvIf_Chk01_DtlR.$cst_po_no, AccptRecvIf_Chk01_DtlR.$cst_cd);
			
			MCList<MST_SLO_R> sloL = MCList.create(MST_SLO_R.class);
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			
			// 受注ヘッダ情報
			if (isNull(_sloL)) { 
				_sloL = MCList.create(MST_SLO_R.class);
			}
			MST_SLO_R sloL_t = MST_SLO_R.create("T");
			MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(sloL_t);
			sloL_bldr.setWhere(sloL_t.cst_po_no.eq(bind("cst_po_no")));
			sloL_bldr.addWhereWithAnd(sloL_t.cst_cd.eq(bind("cst_cd")));
			sloL_bldr.addWhereWithAnd(sloL_t.can_flg.eq(value(false)));
			sloL_bldr.setOrderByAsc(sloL_t.slo_no);
			dbSelectForUpdate("MSLAL5160_MST_SLO_S03", sloL, sloL_bldr, ddlvGrpL);
			
			MCList<MST_SLO_R> addSloL = MCList.create(MST_SLO_R.class);
			if (_sloL.size() > 0) {
				for (MST_SLO_R sloR : sloL) {
					MST_SLO_R tmpSloR = _sloL.getFirst(_sloSloNoIdxkey, sloR.slo_no());
					if (isNull(tmpSloR)) {
						addSloL.add(sloR);
					}
				}
				_sloL.addAll(addSloL);
			}
			else {
				_sloL.addAll(sloL);
			}
			
			_sloIdxkey = _sloL.createIndex(MST_SLO_R.$cst_po_no);
			_sloSloNoIdxkey = _sloL.createIndex(MST_SLO_R.$slo_no);
			
			//　受注明細情報
			if (isNull(_sloDL)) {
				_sloDL = MCList.create(MST_SLO_D_R.class);
			}
			sloDL.addNumberColumn("base_unit_dec_place");
			sloDL.addStringColumn("base_unit_rnd_typ");
			sloDL.addNumberColumn("trd_unit_conv_base_qty");
			sloDL.addNumberColumn("trd_unit_conv_qty");
			sloDL.addNumberColumn(MAM_CUR_R.$amt_dec_place);
			sloDL.addNumberColumn(MAM_TAX_R.$tax_rate);
			
			MST_SLO_D_R sloDL_t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(sloDL_t);
			MST_SLO_R t2 = MST_SLO_R.create("T2");
			MAM_UNIT_R m1 = MAM_UNIT_R.create("M1");
			MAVM_ITM_UNIT_R m2 = MAVM_ITM_UNIT_R.create("M2");
			MAM_CUR_R m3 = MAM_CUR_R.create("M3");
			MAM_TAX_R m4 = MAM_TAX_R.create("M4");
			sloDL_bldr.addSelect(m1.dec_place.as("base_unit_dec_place"));
			sloDL_bldr.addSelect(m1.rnd_typ.as("base_unit_rnd_typ"));
			sloDL_bldr.addSelect(m2.conv_base_qty.as("trd_unit_conv_base_qty"));
			sloDL_bldr.addSelect(m2.conv_qty.as("trd_unit_conv_qty"));
			sloDL_bldr.addSelect(m3.amt_dec_place);
			sloDL_bldr.addSelect(m4.tax_rate);
			sloDL_bldr.setWhere(sloDL_t.slo_no.eq(bind("slo_no")));
			sloDL_bldr.addWhereWithAnd(sloDL_t.slo_rev.eq(bind("slo_rev")));
			sloDL_bldr.addWhereWithAnd(sloDL_t.can_flg.eq(value(false)));
			sloDL_bldr.addLeftOuterJoin(t2, t2.slo_no.eq(sloDL_t.slo_no));
			sloDL_bldr.addLeftOuterJoin(m1, m1.unit_cd.eq(sloDL_t.base_unit_cd));
			sloDL_bldr.addLeftOuterJoin(m2, bracket(m2.itm_cd.eq(sloDL_t.itm_cd)
					.and(m2.itm_sub1.eq(sloDL_t.itm_sub1))
					.and(m2.itm_sub2.eq(sloDL_t.itm_sub2))
					.and(m2.itm_sub3.eq(sloDL_t.itm_sub3))
					.and(m2.unit_cd.eq(sloDL_t.trd_unit_cd))));
			sloDL_bldr.addLeftOuterJoin(m3, m3.cur_cd.eq(t2.trd_cur_cd));
			sloDL_bldr.addLeftOuterJoin(m4, m4.tax_cd.eq(sloDL_t.tax_cd));
			sloDL_bldr.setOrderByAsc(sloDL_t.slo_no, sloDL_t.slo_d_no, sloDL_t.cst_po_d_no);
			dbSelect("MSLAL5160_MST_SLO_D_S02", sloDL, sloDL_bldr, _sloL);
			
			_sloDL.addAll(sloDL);
			// _sloDL はここで取得した明細が削除されることがあるので、別のリストに退避する
			_sloDAllL = _sloDL.shallowClone();
			
			_sloDL.sort(MST_SLO_D_R.$slo_no, MST_SLO_D_R.$disp_seq);
			_sloDSloNoIdxkey = _sloDL.createIndex(MST_SLO_D_R.$slo_no);
			_sloDSloDNoIdxkey = _sloDL.createIndex(MST_SLO_D_R.$slo_d_no);
			_sloDCstDNoIdxkey = _sloDL.createIndex(MST_SLO_D_R.$cst_po_d_no);
		}
		
		/**
		 * 売上予定情報取得
		 */
		protected void getSlsSchdInfo() {
			_slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			_slsSchdL.addStringColumn(MST_ARR_SCHD_R.$ver_no);
			_slsSchdL.addStringColumn("purc_ddlv_po_no");
			_slsSchdL.addStringColumn("purc_ddlv_po_d_no");
			_slsSchdL.addStringColumn("purc_act_no");
			_slsSchdL.addStringColumn(MST_PURC_DLV_SLIP_D_R.$purc_ddlv_dlv_slip_no);
			_slsSchdL.addStringColumn(MST_PURC_DLV_SLIP_D_R.$purc_ddlv_dlv_slip_d_no);
			
			// 納品書明細に紐づく売上予定取得
			getSlsSchdDlvSlip();
			
			// インボイス明細に紐づく売上予定取得
			getSlsSchdIv();
			
			// 受注明細に紐づく売上予定取得
			getSlsSchdSloD();
			
			if (!isNull(_slsSchdL)) {
				_slsSchdL.setBooleanNE("use_flg", false);
			}
			
			_slsSchdSlipDIdxkey = _slsSchdL.createIndex(MST_SLS_SCHD_R.$dlv_slip_d_no, MST_SLS_SCHD_R.$abort_flg);
			_slsSchdIvDIdxkey = _slsSchdL.createIndex(MST_SLS_SCHD_R.$iv_d_no);
			_slsSchdIvDCmplIdxkey = _slsSchdL.createIndex(MST_SLS_SCHD_R.$cmpl_flg, MST_SLS_SCHD_R.$iv_d_no);
			_slsSchdDlvSlipCmplIdxkey = _slsSchdL.createIndex(MST_SLS_SCHD_R.$cmpl_flg, MST_SLS_SCHD_R.$dlv_slip_d_no);
			_slsSchdSloDIdxkey = _slsSchdL.createIndex(MST_SLS_SCHD_R.$slo_d_no);
			_slsSchdSloDCmplIdxkey = _slsSchdL.createIndex(MST_SLS_SCHD_R.$cmpl_flg, MST_SLS_SCHD_R.$slo_d_no);
			_slsSchdNoIdxkey = _slsSchdL.createIndex(MST_SLS_SCHD_R.$sls_schd_no);
		}
		
		/**
		 * 納品書明細に紐づく売上予定取得
		 */
		protected void getSlsSchdDlvSlip() {
			_slsSchdL.addStringColumn("purc_act_no");
			// 納品書明細に紐づく売上予定
			if (!isNull(_dlvSlipDL) && _dlvSlipDL.size() > 0) {
				MCList<MST_SLS_SCHD_R> addSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
				MCList<MST_SLS_SCHD_R> divSlipSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
				MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
				MCQueryApiBuilder divSlipSlsSchdL_bldr = MCQueryApiBuilder.create(t);
				divSlipSlsSchdL_bldr.setWhere(t.dlv_slip_d_no.eq(bind("dlv_slip_d_no")));
				divSlipSlsSchdL_bldr.addWhereWithAnd(t.sls_ac_abl_flg.eq(value(true)));
				dbSelect("MSLAL5160_MST_SLS_SCHD_S06", divSlipSlsSchdL, divSlipSlsSchdL_bldr, _dlvSlipDL);
				
				if (!isNull(_slsSchdL) && _slsSchdL.size() > 0) {
					for (MST_SLS_SCHD_R slsSchdR : divSlipSlsSchdL) {
						MST_SLS_SCHD_R tmpSlsSchdR = _slsSchdL.getFirst(_slsSchdNoIdxkey, slsSchdR.sls_schd_no());
						if (isNull(tmpSlsSchdR)) {
							addSlsSchdL.add(slsSchdR);
						}
					}
					_slsSchdL.addAll(addSlsSchdL);
				}
				else {
					_slsSchdL.addAll(divSlipSlsSchdL);
				}
				_slsSchdNoIdxkey = _slsSchdL.createIndex(MST_SLS_SCHD_R.$sls_schd_no);
			}
		}
		
		/**
		 * インボイス明細に紐づく売上予定取得
		 */
		protected void getSlsSchdIv() {
			MST_PURC_SCHD_R t2 = MST_PURC_SCHD_R.create("T2");
			MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
			MST_PO_SCHD_R t4 = MST_PO_SCHD_R.create("T4");
			MST_PO_D_R t5 = MST_PO_D_R.create("T5");
			MST_PURC_ACT_D_R t6 = MST_PURC_ACT_D_R.create("T6");
			MST_PURC_ACT_D_R S1W = MST_PURC_ACT_D_R.create("W");
			
			// インボイス明細に紐づく売上予定
			if (!isNull(_ivDL) && _ivDL.size() > 0) {
				MCList<MST_SLS_SCHD_R> addSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
				MCList<MST_SLS_SCHD_R> ivSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
				MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
				MCQueryApiBuilder ivSlsSchdL_bldr = MCQueryApiBuilder.create(t);
				ivSlsSchdL_bldr.addSelect(t3.ver_no);
				ivSlsSchdL_bldr.addSelect(t4.po_no.as("purc_ddlv_po_no"));
				ivSlsSchdL_bldr.addSelect(t5.po_d_no.as("purc_ddlv_po_d_no"));
				ivSlsSchdL_bldr.addSelect(t6.purc_act_no);
				ivSlsSchdL_bldr.setWhere(t.iv_d_no.eq(bind("iv_d_no")));
				ivSlsSchdL_bldr.addWhereWithCutOffAnd(t.slo_d_no.eq(bind("slo_d_no")));
				ivSlsSchdL_bldr.addWhereWithAnd(t.sls_ac_abl_flg.eq(value(true)));
				ivSlsSchdL_bldr.addLeftOuterJoin(t2, bracket(t2.purc_schd_no.eq(t.purc_schd_no)));
				ivSlsSchdL_bldr.addLeftOuterJoin(t3, bracket(t3.arr_schd_no.eq(t2.arr_schd_no)));
				ivSlsSchdL_bldr.addLeftOuterJoin(t4, bracket(t4.po_schd_no.eq(t.po_schd_no)));
				ivSlsSchdL_bldr.addLeftOuterJoin(t5, bracket(t.slo_d_no.eq(t5.slo_d_no)
						.and(t.po_schd_no.eq(t5.po_schd_no))
						.and(t5.po_no.eq(t4.po_no))
						.and(t5.can_flg.eq(value(false)))));
				ivSlsSchdL_bldr.addLeftOuterJoin(t6,
						bracket(t6.purc_act_d_no.eq(t.purc_act_d_no)
								.and(t6.purc_act_seq.eq(subQuery()
										.select(max(S1W.purc_act_seq))
										.from(S1W)
										.where(S1W.purc_act_d_no.eq(t.purc_act_d_no))))));
				dbSelect("MSLAL5160_MST_SLS_SCHD_S07", ivSlsSchdL, ivSlsSchdL_bldr, _ivDL);
				
				if (!isNull(_slsSchdL) && _slsSchdL.size() > 0) {
					for (MST_SLS_SCHD_R slsSchdR : ivSlsSchdL) {
						MST_SLS_SCHD_R tmpSlsSchdR = _slsSchdL.getFirst(_slsSchdNoIdxkey, slsSchdR.sls_schd_no());
						if (isNull(tmpSlsSchdR)) {
							addSlsSchdL.add(slsSchdR);
						}
					}
					_slsSchdL.addAll(addSlsSchdL);
				}
				else {
					_slsSchdL.addAll(ivSlsSchdL);
				}
				_slsSchdNoIdxkey = _slsSchdL.createIndex(MST_SLS_SCHD_R.$sls_schd_no);
			}
		}
		
		/**
		 * 受注明細に紐づく売上予定取得
		 */
		protected void getSlsSchdSloD() {
			MST_PURC_SCHD_R t2 = MST_PURC_SCHD_R.create("T2");
			MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
			MST_PO_SCHD_R t4 = MST_PO_SCHD_R.create("T4");
			MST_PO_D_R t5 = MST_PO_D_R.create("T5");
			MST_PURC_ACT_D_R t6 = MST_PURC_ACT_D_R.create("T6");
			MST_PURC_DLV_SLIP_D_R t7 = MST_PURC_DLV_SLIP_D_R.create("T7");
			MST_PURC_ACT_D_R S1W = MST_PURC_ACT_D_R.create("W");
			
			// 受注明細に紐づく売上予定
			if (!isNull(_sloDL) && _sloDL.size() > 0) {
				MCList<MST_SLS_SCHD_R> addSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
				MCList<MST_SLS_SCHD_R> sloSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
				MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
				MCQueryApiBuilder sloSlsSchdL_bldr = MCQueryApiBuilder.create(t);
				sloSlsSchdL_bldr.addSelect(t3.ver_no);
				sloSlsSchdL_bldr.addSelect(t4.po_no.as("purc_ddlv_po_no"));
				sloSlsSchdL_bldr.addSelect(t5.po_d_no.as("purc_ddlv_po_d_no"));
				sloSlsSchdL_bldr.addSelect(t6.purc_act_no);
				sloSlsSchdL_bldr.addSelect(t7.purc_ddlv_dlv_slip_no, t7.purc_ddlv_dlv_slip_d_no);
				sloSlsSchdL_bldr.setWhere(t.slo_d_no.eq(bind("slo_d_no")));
				sloSlsSchdL_bldr.addWhereWithAnd(t.sls_ac_abl_flg.eq(value(true)));
				sloSlsSchdL_bldr.addLeftOuterJoin(t2, bracket(t2.purc_schd_no.eq(t.purc_schd_no)));
				sloSlsSchdL_bldr.addLeftOuterJoin(t3, bracket(t3.arr_schd_no.eq(t2.arr_schd_no)));
				sloSlsSchdL_bldr.addLeftOuterJoin(t4, bracket(t4.po_schd_no.eq(t.po_schd_no)));
				sloSlsSchdL_bldr.addLeftOuterJoin(t5, bracket(t.slo_d_no.eq(t5.slo_d_no)
						.and(t.po_schd_no.eq(t5.po_schd_no))
						.and(t5.po_no.eq(t4.po_no))
						.and(t5.can_flg.eq(value(false)))));
				sloSlsSchdL_bldr.addLeftOuterJoin(t6,
						bracket(t6.purc_act_d_no.eq(t.purc_act_d_no)
								.and(t6.purc_act_seq.eq(subQuery()
										.select(max(S1W.purc_act_seq))
										.from(S1W)
										.where(S1W.purc_act_d_no.eq(t.purc_act_d_no))))));
				sloSlsSchdL_bldr.addLeftOuterJoin(t7, bracket(
					t7.dlv_slip_mng_d_no.eq(t3.dlv_slip_mng_d_no)
					.and(t7.dlv_slip_mng_d_seq.eq(t3.dlv_slip_mng_d_seq))
				));
				dbSelect("MSLAL5160_MST_SLS_SCHD_S08", sloSlsSchdL, sloSlsSchdL_bldr, _sloDL);
				if (!isNull(_slsSchdL) && _slsSchdL.size() > 0) {
					for (MST_SLS_SCHD_R slsSchdR : sloSlsSchdL) {
						MST_SLS_SCHD_R tmpSlsSchdR = _slsSchdL.getFirst(_slsSchdNoIdxkey, slsSchdR.sls_schd_no());
						if (isNull(tmpSlsSchdR)) {
							addSlsSchdL.add(slsSchdR);
						}
					}
					_slsSchdL.addAll(addSlsSchdL);
				}
				else {
					_slsSchdL.addAll(sloSlsSchdL);
				}
			}
		}
		/**
		 * 引数の納品書ＮＯが、発注・納入指示・納期回答受領で作成された納品伝票か判定する<br>
		 */
		protected MCList<MST_DLV_SLIP_R> _purcDlvSlipL;
		protected MCIndexKey _purcDlvSlipIdx;
		protected boolean isPurcDlvSlip(AccptRecvIf_Chk01_DtlR dtlR) {
			if (_purcDlvSlipL == null) {
				_purcDlvSlipL = MCList.create(MST_DLV_SLIP_R.class);
				
				MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
				MST_DLV_SLIP_R w = MST_DLV_SLIP_R.create("W");
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
				bldr.setSelect(t.dlv_slip_no, t.trn_typ, t.cst_po_no);
				bldr.setWhere(t.dlv_slip_no.eq(bind("dlv_slip_no")));
				bldr.addConstWhereWithAnd(
					t.dlv_slip_seq.eq(
						subQuery()
						.select(max(w.dlv_slip_seq))
						.from(w)
						.where(w.dlv_slip_no.eq(t.dlv_slip_no)
						.and(w.trn_typ.eq(value(MSC_TRN_TYP.PURC.value())))))
				);
				
				_purcDlvSlipL = MCList.create(MST_DLV_SLIP_R.class);
				dbSelect(
					"MSLAL5160_MST_DLV_SLIP_S03",
					_purcDlvSlipL, bldr,
					up0().subList(r -> !isNull(r.dlv_slip_no()))
						.distinctNE(AccptRecvIf_Chk01_DtlR.$dlv_slip_no)
				);
				_purcDlvSlipIdx = _purcDlvSlipL.createIndex(MST_DLV_SLIP_R.$dlv_slip_no);
			}
			
			// 仕入直送を取り込む場合、得意先注文ＮＯは必須
			// そのため、特定した納品書とＩＦデータの得意先注文ＮＯが一致しているか、まで条件に含めて判定する
			MST_DLV_SLIP_R dlvSlipR = _purcDlvSlipL.getFirst(_purcDlvSlipIdx, dtlR.dlv_slip_no());
			return
				!isNull(dlvSlipR)
				&& !isNull(dtlR.cst_po_no())
				&& isSame(dlvSlipR.cst_po_no(), dtlR.cst_po_no());
		}
		/**
		 * 消込候補の売上予定をIFデータの納品書（仕入直送の納品書に限定）で絞り込む
		 */
		protected MCList<MST_SLS_SCHD_R> filterSlsSchd(MCList<MST_SLS_SCHD_R> slsSchdL, AccptRecvIf_Chk01_DtlR dtlR) {
			if (dtlR.ddlvTgtFlg()) {
				if (!isNull(dtlR.dlv_slip_no())) {
					slsSchdL.removeIf(r -> !isSame(
						r.getStringNE(MST_PURC_DLV_SLIP_D_R.$purc_ddlv_dlv_slip_no), dtlR.dlv_slip_no()
					));
				}
				if (!isNull(dtlR.dlv_slip_d_no())) {
					slsSchdL.removeIf(r -> !isSame(
						r.getStringNE(MST_PURC_DLV_SLIP_D_R.$purc_ddlv_dlv_slip_d_no), dtlR.dlv_slip_d_no()
					));
				}
			}
			return slsSchdL;
		}
		
		/**
		 * 下り電文を設定
		 */
		protected void setDown() {
			
			down0().setAll(up0());
			makeDonw4();
		}
		
		protected void makeDonw4() {
			for (ConvQtyAmtUtil_Calc01_HdrR calc01HdrR : _calc01HdrL) {
				AccptRecvIf_Chk01_Calc01HdrR down4R = AccptRecvIf_Chk01_Calc01HdrR.create();
				copy(down4R, calc01HdrR, createMap_AccptRecvIf_Chk01_Calc01HdrR_ConvQtyAmtUtil_Calc01_HdrR());
				down4().add(down4R);
			}
		}
		
		protected Map_AccptRecvIf_Chk01_Calc01HdrR_ConvQtyAmtUtil_Calc01_HdrR<AccptRecvIf_Chk01_Calc01HdrR,ConvQtyAmtUtil_Calc01_HdrR> createMap_AccptRecvIf_Chk01_Calc01HdrR_ConvQtyAmtUtil_Calc01_HdrR() {
			return new Map_AccptRecvIf_Chk01_Calc01HdrR_ConvQtyAmtUtil_Calc01_HdrR<AccptRecvIf_Chk01_Calc01HdrR, ConvQtyAmtUtil_Calc01_HdrR>();
		}
		
		public class Map_AccptRecvIf_Chk01_Calc01HdrR_ConvQtyAmtUtil_Calc01_HdrR<D extends AccptRecvIf_Chk01_Calc01HdrR, S extends ConvQtyAmtUtil_Calc01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$peg_no, ConvQtyAmtUtil_Calc01_HdrR.$peg_no);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$slip_each_lot_typ, ConvQtyAmtUtil_Calc01_HdrR.$slip_each_lot_typ);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$trd_unit_cd, ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_cd);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$trd_unit_qty, ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_qty);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_upri, ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_upri);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_dscnt_amt, ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_dscnt_amt);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_proc_upri, ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_proc_upri);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_onr_prov_upri, ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_onr_prov_upri);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_amt, ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_amt);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_proc_amt, ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_proc_amt);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_onr_prov_amt, ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_onr_prov_amt);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_tax_amt, ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_tax_amt);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_inc_tax_amt, ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_inc_tax_amt);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$wtax_amt, ConvQtyAmtUtil_Calc01_HdrR.$wtax_amt);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$base_unit_dec_place, ConvQtyAmtUtil_Calc01_HdrR.$base_unit_dec_place);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$base_unit_rnd_typ, ConvQtyAmtUtil_Calc01_HdrR.$base_unit_rnd_typ);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$trd_unit_conv_qty, ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_qty);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$trd_unit_conv_base_qty, ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_base_qty);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$trd_cur_cd, ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_cd);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$tax_rate, ConvQtyAmtUtil_Calc01_HdrR.$tax_rate);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$wtax_rate, ConvQtyAmtUtil_Calc01_HdrR.$wtax_rate);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$inc_tax_flg, ConvQtyAmtUtil_Calc01_HdrR.$inc_tax_flg);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$act_tax_rate, ConvQtyAmtUtil_Calc01_HdrR.$act_tax_rate);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$act_inc_tax_flg, ConvQtyAmtUtil_Calc01_HdrR.$act_inc_tax_flg);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$amt_dec_place, ConvQtyAmtUtil_Calc01_HdrR.$amt_dec_place);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$upri_dec_place, ConvQtyAmtUtil_Calc01_HdrR.$upri_dec_place);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$amt_rnd_typ, ConvQtyAmtUtil_Calc01_HdrR.$amt_rnd_typ);
				addColumnPathMap(AccptRecvIf_Chk01_Calc01HdrR.$tax_rnd_typ, ConvQtyAmtUtil_Calc01_HdrR.$tax_rnd_typ);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.sls_schd_qty(src.getNumberNE("sls_schd_qty"));
				dest.base_unit_cmpl_qty(src.getNumberNE("base_unit_cmpl_qty"));
				dest.base_unit_cd(src.getStringNE("base_unit_cd"));
				dest.sls_schd_no(src.getStringNE("sls_schd_no"));
			}
		}
	}
	
	/**
	 * 処理結果区分にエラーを設定
	 */
	protected void setErrSts(MST_ACCPT_RECV_IF_R accptRecvIfR) {
		accptRecvIfR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
		setErrSet(accptRecvIfR);
	}
	
	/**
	 * 同一取込グループでエラーが発生した場合に、エラーリスト設定に追加する。
	 */
	protected void setErrSet(MST_ACCPT_RECV_IF_R accptRecvIfR) {
		List<String> lst = createErrSetKey(accptRecvIfR);
		if (!object(CLAZZ)._errSet.contains(lst)) {
			object(CLAZZ)._errSet.add(lst);
		}
	}
	
	/**
	 * 同一取込単位で先に処理したデータでエラーが発生したかどうか。
	 * 
	 * @return エラーが発生した場合はtrue
	 */
	protected boolean isPrevErr(MST_ACCPT_RECV_IF_R accptRecvIfR) {
		return object(CLAZZ)._errSet.contains(createErrSetKey(accptRecvIfR));
	}
	
	/**
	 * 同一取込グループのキー項目のリストを作成する。
	 * 
	 * @return エラーキー項目のリスト
	 */
	protected List<String> createErrSetKey(MST_ACCPT_RECV_IF_R accptRecvIfR) {
		List<String> lst = new ArrayList<String>();
		if (!isNull(accptRecvIfR)) {
			lst.add(accptRecvIfR.cst_cd());
			lst.add(accptRecvIfR.dlv_slip_no());
			lst.add(accptRecvIfR.cst_po_no());
		}
		return lst;
	}
	
	protected List<String> createOKSkipSetKey(MST_ACCPT_RECV_IF_R accptRecvIfR) {
		List<String> lst = new ArrayList<String>();
		if (!isNull(accptRecvIfR)) {
			lst.add(accptRecvIfR.ext_sys_cd());
			lst.add(accptRecvIfR.ext_purc_act_d_no());
		}
		return lst;
	}
	
	/**
	 * 売上予定ＮＯで売上予定の元情報(インボイス明細⇒納品書明細⇒受注明細の優先順)を取得する。
	 * 
	 * @param calc01HdrR 単位・金額の計算ヘッダ（売上予定元情報を格納）
	 * @param slsSchdNo 売上予定ＮＯ
	 */
	protected void getCredSrcBySlsSchd(ConvQtyAmtUtil_Calc01_HdrR calc01HdrR, String slsSchdNo) {
		// 取得済リストより処理対象となる売上予定ＮＯのデータを取得
		ConvQtyAmtUtil_Calc01_HdrR tmpCalc01HdrR = _calc01HdrL.getFirst(_idxCalc01HdrKey, slsSchdNo);
		MCRow.copyvalue(calc01HdrR, tmpCalc01HdrR);
		calc01HdrR.trd_cur_inc_tax_amt(sum(tmpCalc01HdrR.trd_cur_amt(), tmpCalc01HdrR.trd_cur_tax_amt()));
		calc01HdrR.schd_base_unit_qty(tmpCalc01HdrR.getNumberNE("sls_schd_qty"));
	}

	//FMCB CUSTOM END
}