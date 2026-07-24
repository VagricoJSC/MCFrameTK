package mcframe.serverMSLA.MSLAL6220;

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
import mcframe.serverMBBE.MBBEL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFUD.PFUDL0040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSLA.MSLAL6220.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSLA.MSLAL6320.MSLAL_SCMActRecvIfService;
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMSUC.MSUCL0030.MSUCL_ProdListLogic;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;

import java.util.*;
import java.util.Map.Entry;

import static mcframe.serverMSLA.MSLAL6220.Query.*;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.commonCore.container.MCRow.Status;
import static mcframe.serverCore.database.MCSQLClause.LF;
import static mcframe.serverCore.database.MCSQLClause.WHERE;

import mcframe.serverCore.sys.MCSys;
import mcframe.serverMSBC.MSBCL6000.*;
import mcframe.serverMSBC.MSBCL6020.*;
import mcframe.serverMSBC.MSBCL6080.*; // 製造実績受信ＩＦサービス
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_MfgActRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_MfgActRecvIfService_MC extends MSLAL_MfgActRecvIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * MfgActRecvIf_Upd01オペレーション.<p>
	 *
	 * 製造実績（工程・投入・工数・出来高）受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	public class MfgActRecvIf_Upd01 extends MSLAL_MfgActRecvIfService_MC_A.MfgActRecvIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callMfgActRecvIfUpd02();
		}

		/**
		 * MfgActRecvIf_Upd02を実行する。
		 */
		protected void callMfgActRecvIfUpd02() {
			MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd02 ope = MSLAL_MfgActRecvIfService.crtMfgActRecvIf_Upd02();

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
				addColumnPathMap(IfDataImp_Upd01_DtlR.$if_proc_typ, Upd01_DtlR.$if_proc_typ);
			}
		}
	}

	/**
	 * MfgActRecvIf_Upd02オペレーション.<p>
	 *
	 * 製造実績（工程・投入・工数・出来高）受信ＩＦ取込を行う。（ＩＦデータ確認、および製造実績ＩＦ取込バッチから呼び出される）<br>
	 */
	public class MfgActRecvIf_Upd02 extends MSLAL_MfgActRecvIfService_MC_A.MfgActRecvIf_Upd02 {
		/** 処理対象件数 **/
		protected int _totalNum = 0;
		/** 登録件数（正常終了件数） **/
		protected int _okNum = 0;
		/** エラー件数 **/
		protected int _errNum = 0;
		/** スキップ **/
		protected int _skipNum = 0;
		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg = false;
		/** ロガー作成ＦＬＧ **/
		protected boolean _crtNewLogger = false;
		/** 受信実績エラーリスト **/
		protected MCList<MfgActRecvIf_Upd02_ActLstR> _errActL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
		/** エラー発生受信実績キーＭａｐ（キー：外部システムＣＤ、値：外部システムデータＮＯリスト「昇順」） **/
		protected Map<String, TreeSet<MCNumber>> _errKeyMap = new HashMap<String, TreeSet<MCNumber>>();

		/** 工程受信実績リスト **/
		protected MCList<MfgActRecvIf_Upd02_ActLstR> _operActL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
		/** 投入受信実績リスト **/
		protected MCList<MfgActRecvIf_Upd02_ActLstR> _inptActL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
		/** 工数受信実績リスト **/
		protected MCList<MfgActRecvIf_Upd02_ActLstR> _wkActL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
		/** 出来高受信実績リスト **/
		protected MCList<MfgActRecvIf_Upd02_ActLstR> _yieldActL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
		protected MCIndexKey _yieldActLIdx = null;
		protected MCIndexKey _unschdCrtYieldActIdx = null;
		
		/** 全て受信実績リスト **/
		protected MCList<MfgActRecvIf_Upd02_ActLstR> _allActL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
		/** 出来高実績リスト（ＤＢ） **/
		protected MCList<MST_YIELD_ACT_R> _yieldActDBL = MCList.create(MST_YIELD_ACT_R.class);
		protected MST_YIELD_ACT_R _yieldActDBL_t = MST_YIELD_ACT_R.create("T");
		protected MCQueryApiBuilder _yieldActDBL_bldr = MCQueryApiBuilder.create(_yieldActDBL_t);
		protected MCIndexKey _yieldActDBLIdx = null;
		protected MCIndexKey _yieldActDBLExtIdx = null;

		/** 外部実績と工程の関連MAP（外部実績代替キー：工程指図ＮＯ） **/
		protected Map<String, String> _extOperMap = new HashMap<String, String>();
		/** 業務データと工程の関連MAP（業務データ代替キー：工程指図ＮＯ） **/
		protected Map<String, String> _innOperMap = new HashMap<String, String>();
		/** 工程と業務データの関連MAP（工程指図ＮＯ：業務主要項目） **/
		protected Map<String, MfgActRecvIf_Upd02_ActLstR> _operCrtlMap = new HashMap<String, MfgActRecvIf_Upd02_ActLstR>();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				// 準備
				initProc();
				// 開始ログ
				writeStartLog();

				// 取得
				preSrch();
				// 登録
				procActReg();

				// 計画外製造実績の登録失敗時は、登録した製造指図を取り消す
				callMfgInstRegForUnschdErr();

				// 処理結果設定
				setDown();
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				// 終了ログ
				writeEndLog();
			}
		}
		
		/**
		 * 計画外製造実績の登録失敗時は、登録した製造指図を取り消す
		 * ※計画外製造実績の新規登録で製造指図登録後にエラーとなった場合
		 */
		protected void callMfgInstRegForUnschdErr() {
			// 削除対象を抽出
			MCIndexKey delIndexKey = _yieldActL.createIndex(MfgActRecvIf_Upd02_ActLstR.$data_crud_typ, MfgActRecvIf_Upd02_ActLstR.$err_flg);;
			MCList<MfgActRecvIf_Upd02_ActLstR> tmpInsErrL = _yieldActL.subList(delIndexKey, MAC_DATA_CRUD_TYP.CRT.value(), true);
			MCList<MfgActRecvIf_Upd02_ActLstR> insErrL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
			for (MfgActRecvIf_Upd02_ActLstR tmpInsErrR : tmpInsErrL) {
				if (tmpInsErrR.unschd_act_flg() && !isNull(tmpInsErrR.yield_schd_no())) {
					insErrL.add(tmpInsErrR);
				}
			}
			MCIndexKey skpIndexKey = _yieldActL.createIndex(MfgActRecvIf_Upd02_ActLstR.$data_crud_typ, MfgActRecvIf_Upd02_ActLstR.$skip_by_if_ctl_flg, MfgActRecvIf_Upd02_ActLstR.$err_flg);
			MCList<MfgActRecvIf_Upd02_ActLstR> tmpInsSkpL = _yieldActL.subList(skpIndexKey, MAC_DATA_CRUD_TYP.CRT.value(), true, false);
			for (MfgActRecvIf_Upd02_ActLstR tmpInsSkpR : tmpInsSkpL) {
				if (tmpInsSkpR.unschd_act_flg() && !isNull(tmpInsSkpR.yield_schd_no())) {
					insErrL.add(tmpInsSkpR);
				}
			}
			
			// 削除対象がなければ何もしない
			if (isNull(insErrL) || insErrL.isEmpty()) {
				return;
			}
			
			insErrL.sort(MfgActRecvIf_Upd02_ActLstR.$data_crud_typ, MfgActRecvIf_Upd02_ActLstR.$ext_yield_act_no);
			
			MCList<MfgActRecvIf_Upd02_ActLstR> tgtL = insErrL.subList(MfgActRecvIf_Upd02_ActLstR.$unschd_act_flg, true);
			if (isNull(tgtL) || tgtL.isEmpty()) {
				return;
			}
			
			MSBCL_MfgInstRegService.MfgInstReg_Del01 ope = MSBCL_MfgInstRegService.crtMfgInstReg_Del01();
			ope.up0().lst_del_flg(true);
			ope.up0().not_commit_flg(false);
			ope.up0().not_chk_cntr_flg(true);
			for (MfgActRecvIf_Upd02_ActLstR tgtR : tgtL) {
				MfgInstReg_Del01_HdrR hdrR = MfgInstReg_Del01_HdrR.create();
				hdrR.peg_no(tgtR.peg_no());
				hdrR.mfg_inst_no(tgtR.mfg_inst_no());
				ope.up1().add(hdrR);
			}
			
			if (!ope.up1().isEmpty()) {
				ope.exec();
			}
		}

		/**
		 * 受信データの取得処理
		 */
		protected void preSrch() {
			// 受信実績データの取得
			getOperActL();
			getInptActL();
			getWkActL();
			getYieldActL();
			
			// 投入実績、工数実績、出来高実績の外部出来高実績ＮＯに該当する出来高実績（ＤＢ）を取得
			getYieldActDBL();
			// 計画外出来高実績ＩＦに対応する製造指図の登録初期処理
			unschdInit();

			// 業務データ（キー）の特定
			specOperCriticalItems();
			specInptCriticalItems();
			specWkCriticalItems();
			specYieldCriticalItems();
		}

		/**
		 * 計画外出来高実績ＩＦに対応する製造指図の登録初期処理
		 */
		protected void unschdInit() {
			setPegNo(_yieldActL);
			
			// 計画外実績用マスタキャッシュ
			doMasterCacheForUnschdAct();
			
			// 製造指図登録および各ＩＦデータ補完
			makeSchdDataAndIFData();
		}
		
		protected FXUCL_MCDbcCache<MAM_LOC_R> _mfgLocCache;
		protected FXUCL_MCDbcCache<MAM_LOC_R> _strgLocCache;
		protected FXUCL_MCDbcCache<MAM_ITM_R> _unschdItmCache;
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _unschdItmUnitCache;
		protected MCList<MAM_ITM_DTL_R> _cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);
		protected MCIndexKey _idxItmDtlCache = null;
		protected MCList<MAM_UNIT_R> _cacheOperUnit = MCList.create(MAM_UNIT_R.class);
		protected MCIndexKey _idxOperUnitCache = null;
		
		/**
		 * 品目詳細マスタキャッシュ
		 */
		protected void crtItmDtlCache() {
			_cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);
			MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
			MCQueryApiBuilder cacheItmDtl_bldr = MCQueryApiBuilder.create(t);
			cacheItmDtl_bldr.setSelect(
					t.itm_cd,
					t.itm_sub1,
					t.itm_sub2,
					t.itm_sub3,
					t.mfg_loc_cd,
					t.wg_cd,
					t.bom_ptn,
					t.itm_lower_yield,
					t.itm_std_yield,
					t.itm_upper_yield
					);
			
			cacheItmDtl_bldr.setWhere(t.itm_cd.eq(bind("mfg_itm_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("mfg_itm_sub1")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("mfg_itm_sub2")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("mfg_itm_sub3")));
			cacheItmDtl_bldr.addWhereWithAnd(t.mfg_loc_cd.eq(bind("mfg_loc_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())));
			cacheItmDtl_bldr.addWhereWithAnd(t.maker_cd.eq(value(MAC_STR.NULL_VAL.value())));
			cacheItmDtl_bldr.addWhereWithAnd(t.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())));
			cacheItmDtl_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.bom_ptn.eq(bind("bom_ptn")));
			cacheItmDtl_bldr.addWhereWithAnd(bind("act_tm").between(t.st_dt, t.end_dt));
			dbSelect("MSLAL6220_MAM_ITM_DTL_S01", _cacheItmDtl, cacheItmDtl_bldr, _yieldActL
					.subList(_unschdCrtYieldActIdx, MAC_DATA_CRUD_TYP.CRT.value(), true));
			
			_idxItmDtlCache = _cacheItmDtl.createIndex(
					MAM_ITM_DTL_R.$itm_cd,
					MAM_ITM_DTL_R.$itm_sub1,
					MAM_ITM_DTL_R.$itm_sub2,
					MAM_ITM_DTL_R.$itm_sub3,
					MAM_ITM_DTL_R.$mfg_loc_cd,
					MAM_ITM_DTL_R.$wg_cd,
					MAM_ITM_DTL_R.$bom_ptn
					);
		}
		
		/**
		 * 単位マスタキャッシュ（工程用）
		 * @param operL
		 */
		protected void crtOperUnitCache(MCList<ReExp_Sprt05_RsltOperR> operL) {
			_cacheOperUnit = MCList.create(MAM_UNIT_R.class);
			MAM_UNIT_R t = MAM_UNIT_R.create("T");
			MCQueryApiBuilder cacheOperUnit_bldr = MCQueryApiBuilder.create(t);
			cacheOperUnit_bldr.setSelect(
					t.unit_cd,
					t.rnd_typ,
					t.dec_place
					);
			
			cacheOperUnit_bldr.setWhere(t.unit_cd.eq(bind("oper_unit_cd")));
			dbSelect("MSLAL6220_MAM_UNIT_S01", _cacheOperUnit, cacheOperUnit_bldr, operL);
			
			_idxOperUnitCache = _cacheOperUnit.createIndex(
					MAM_UNIT_R.$unit_cd
					);
		}
		
		/**
		 * 計画外実績用マスタキャッシュ
		 */
		protected void doMasterCacheForUnschdAct() {
			// 製造場所に対する場所マスタ
			MAM_LOC_R mfgLocL_t = MAM_LOC_R.create("T");
			MCQueryApiBuilder mfgLocL_bldr = MCQueryApiBuilder.create(mfgLocL_t);
			mfgLocL_bldr.setSelect(
					mfgLocL_t.wg_cd,
					mfgLocL_t.str_ln_tgt_flg,
					mfgLocL_t.site_cd
					);
			_mfgLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(mfgLocL_bldr, _yieldActL.subList(_unschdCrtYieldActIdx, MAC_DATA_CRUD_TYP.CRT.value(), true), MfgActRecvIf_Upd02_ActLstR.$mfg_loc_cd);
			
			// 格納場所に対する場所マスタ
			MAM_LOC_R strgLocL_t = MAM_LOC_R.create("T");
			MCQueryApiBuilder strgLocL_bldr = MCQueryApiBuilder.create(strgLocL_t);
			strgLocL_bldr.setSelect(
					strgLocL_t.str_ln_tgt_flg
					);
			_strgLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(strgLocL_bldr, _yieldActL.subList(_unschdCrtYieldActIdx, MAC_DATA_CRUD_TYP.CRT.value(), true), MfgActRecvIf_Upd02_ActLstR.$strg_loc_cd);
			
			// 品目マスタ
			MAM_ITM_R unschdItmL_t = MAM_ITM_R.create("T");
			MCQueryApiBuilder unschdItmL_bldr = MCQueryApiBuilder.create(unschdItmL_t);
			unschdItmL_bldr.setSelect(
					unschdItmL_t.dec_place,
					unschdItmL_t.rnd_typ,
					unschdItmL_t.lot_mng_typ,
					unschdItmL_t.lot_no_ptn_cd,
					unschdItmL_t.lot_no_typ,
					unschdItmL_t.sublot_mng_typ,
					unschdItmL_t.sublot_no_ptn_cd,
					unschdItmL_t.sublot_no_typ,
					unschdItmL_t.mfg_inst_unit_typ
					);
			_unschdItmCache = new FXUCL_MCDbcCache<>(unschdItmL_bldr, _yieldActL.subList(_unschdCrtYieldActIdx, MAC_DATA_CRUD_TYP.CRT.value(), true), new String[] {
					MfgActRecvIf_Upd02_ActLstR.$mfg_itm_cd, MfgActRecvIf_Upd02_ActLstR.$mfg_itm_sub1,
					MfgActRecvIf_Upd02_ActLstR.$mfg_itm_sub2, MfgActRecvIf_Upd02_ActLstR.$mfg_itm_sub3
			});
			
			// 品目単位マスタ
			MAVM_ITM_UNIT_R unschdItmUnitL_t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder unschdItmUnitL_bldr = MCQueryApiBuilder.create(unschdItmUnitL_t);
			unschdItmUnitL_bldr.setSelect(
					unschdItmUnitL_t.conv_base_qty,
					unschdItmUnitL_t.conv_qty
					);
			_unschdItmUnitCache = new FXUCL_MCDbcCache<>(unschdItmUnitL_bldr, _yieldActL.subList(_unschdCrtYieldActIdx, MAC_DATA_CRUD_TYP.CRT.value(), true), new String[] {
					MfgActRecvIf_Upd02_ActLstR.$mfg_itm_cd, MfgActRecvIf_Upd02_ActLstR.$mfg_itm_sub1,
					MfgActRecvIf_Upd02_ActLstR.$mfg_itm_sub2, MfgActRecvIf_Upd02_ActLstR.$mfg_itm_sub3, 
					MfgActRecvIf_Upd02_ActLstR.$trd_unit_cd
			});
		}
		
		/**
		 * 製造指図登録および各ＩＦデータ補完
		 * 出来高実績ＩＦと再展開サービスの結果より製造指図登録サービスを呼び出す
		 */
		protected void makeSchdDataAndIFData() {
			MSBCL_ReExpService.ReExp_Sprt05 reExpOpe = MSBCL_ReExpService.crtReExp_Sprt05();
			MSBCL_MfgInstRegService.MfgInstReg_Upd01 mfgInstOpe = MSBCL_MfgInstRegService.crtMfgInstReg_Upd01();
			
			// 計画外製造実績のためのチェック処理呼出
			callThisChk02();
			
			for (MfgActRecvIf_Upd02_ActLstR yieldActR : _yieldActL.subList(_unschdCrtYieldActIdx, MAC_DATA_CRUD_TYP.CRT.value(), true)) {
				if (yieldActR.err_flg()) {
					continue;
				}
				
				MAM_LOC_R mfgLocR = _mfgLocCache.getEx(yieldActR.mfg_loc_cd()); 
				MAM_LOC_R strgLocR = _strgLocCache.getEx(yieldActR.strg_loc_cd());
				MAM_ITM_R itmR = _unschdItmCache.getEx(yieldActR.mfg_itm_cd(), yieldActR.mfg_itm_sub1(), yieldActR.mfg_itm_sub2(), yieldActR.mfg_itm_sub3());
				MAVM_ITM_UNIT_R itmUnitR = _unschdItmUnitCache.getEx(yieldActR.mfg_itm_cd(), yieldActR.mfg_itm_sub1(), yieldActR.mfg_itm_sub2(), yieldActR.mfg_itm_sub3(), yieldActR.trd_unit_cd());
				
				ReExp_Sprt05_HdrR sprt05HdrR = ReExp_Sprt05_HdrR.create();
				
				sprt05HdrR.peg_no(yieldActR.peg_no());
				yieldActR.wg_cd(mfgLocR.wg_cd());
				sprt05HdrR.wg_cd(mfgLocR.wg_cd());
				sprt05HdrR.itm_cd(yieldActR.mfg_itm_cd());
				sprt05HdrR.itm_sub1(nvl(yieldActR.mfg_itm_sub1(), MAC_STR.NULL_VAL.value()));
				sprt05HdrR.itm_sub2(nvl(yieldActR.mfg_itm_sub2(), MAC_STR.NULL_VAL.value()));
				sprt05HdrR.itm_sub3(nvl(yieldActR.mfg_itm_sub3(), MAC_STR.NULL_VAL.value()));
				sprt05HdrR.oper_ptn(yieldActR.oper_ptn());
				sprt05HdrR.bom_ptn(yieldActR.bom_ptn());
				sprt05HdrR.strg_loc_cd(yieldActR.strg_loc_cd());
				sprt05HdrR.mfg_loc_cd(yieldActR.mfg_loc_cd());
				sprt05HdrR.sno1(nvl(yieldActR.sno1(), MAC_STR.NULL_VAL.value()));
				sprt05HdrR.sno2(nvl(yieldActR.sno2(), MAC_STR.NULL_VAL.value()));
				sprt05HdrR.sno3(nvl(yieldActR.sno3(), MAC_STR.NULL_VAL.value()));
				sprt05HdrR.sno4(nvl(yieldActR.sno4(), MAC_STR.NULL_VAL.value()));
				sprt05HdrR.master_dt(yieldActR.act_tm());
				sprt05HdrR.mfg_str_ln_cd(nvl(yieldActR.mfg_str_ln_cd(), MAC_STR.NULL_VAL.value()));
				if (mfgLocR.str_ln_tgt_flg() && isNullOrNullVal(yieldActR.mfg_str_ln_cd())) {
					sprt05HdrR.mfg_str_ln_cd_none_flg(true);
				}
				
				sprt05HdrR.strg_str_ln_cd(nvl(yieldActR.strg_str_ln_cd(), MAC_STR.NULL_VAL.value()));
				if (strgLocR.str_ln_tgt_flg() && isNullOrNullVal(yieldActR.strg_str_ln_cd())) {
					sprt05HdrR.strg_str_ln_cd_none_flg(true);
				}
				
				// 取引単位数量を基準単位換算・セットする
				MCNumber baseUnitQty = convToBaseUnit(yieldActR.trd_unit_qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmR.dec_place(), itmR.rnd_typ());
				sprt05HdrR.mfg_inst_qty(baseUnitQty);
				sprt05HdrR.yield_schd_qty(baseUnitQty);
				sprt05HdrR.itm_ord_typ(MSC_ITM_ORD_TYP.MFG.value());
				sprt05HdrR.mfg_st_schd_dt(yieldActR.act_tm());
				sprt05HdrR.mfg_end_schd_dt(yieldActR.act_tm());
				sprt05HdrR.not_bom_exp_flg(false);
				sprt05HdrR.not_wk_exp_flg(false);
				
				reExpOpe.up0().add(sprt05HdrR);
			}
			
			if (!reExpOpe.up0().isEmpty()) {
				// 再展開サービス呼出
				reExpOpe.exec();
				
				// 製造指図登録サービスの電文作成
				setReExpDown(reExpOpe, mfgInstOpe);
			}
			
			if (!mfgInstOpe.up0().isEmpty()) {
				// 製造指図登録サービス呼出
				mfgInstOpe.exec();
				
				// 製造指図登録後の各ＩＦデータ補完
				setMfgInstDown(mfgInstOpe);
				
				// 製造指図をコミット
				dbTran().commit();
			}
			
			// 投入実績IF、工数実績IFの補完
			compData();
		}
		
		/**
		 * 投入実績IF、工数実績IFの補完
		 */
		protected void compData() {
			
			if (!isNull(_yieldActDBL)) {
				// 投入実績ＩＦの補完
				for (MfgActRecvIf_Upd02_ActLstR inptActR : _inptActL) {
					if (MAC_DATA_CRUD_TYP.isCRT(inptActR.data_crud_typ()) && !isNull(inptActR.ext_yield_act_no())) {
						MST_YIELD_ACT_R yieldActDBR = _yieldActDBL.getFirst(_yieldActDBLExtIdx, inptActR.ext_yield_act_no());
						if (!isNull(yieldActDBR) && yieldActDBR.getBooleanNE("unschd_act_flg")) {
							inptActR.unschd_act_flg(true);
							if (isNull(inptActR.mfg_inst_no())) {
								inptActR.mfg_inst_no(yieldActDBR.getStringNE("mfg_inst_no"));
							}
							if (isNull(inptActR.oper_inst_no())) {
								inptActR.oper_inst_no(yieldActDBR.getStringNE("oper_inst_no"));
							}
						}
					}
				}
				
				// 工数実績ＩＦの補完
				for (MfgActRecvIf_Upd02_ActLstR wkActR : _wkActL) {
					if (MAC_DATA_CRUD_TYP.isCRT(wkActR.data_crud_typ()) && !isNull(wkActR.ext_yield_act_no())) {
						MST_YIELD_ACT_R yieldActDBR = _yieldActDBL.getFirst(_yieldActDBLExtIdx, wkActR.ext_yield_act_no());
						if (!isNull(yieldActDBR) && yieldActDBR.getBooleanNE("unschd_act_flg")) {
							wkActR.unschd_act_flg(true);
							if (isNull(wkActR.mfg_inst_no())) {
								wkActR.mfg_inst_no(yieldActDBR.getStringNE("mfg_inst_no"));
							}
							if (isNull(wkActR.oper_inst_no())) {
								wkActR.oper_inst_no(yieldActDBR.getStringNE("oper_inst_no"));
							}
						}
					}
				}
			}
		}
		
		/**
		 * 計画外製造実績のためのチェック処理
		 */
		protected void callThisChk02() {
			// チェック実行
			MfgActRecvIf_Chk02 chkOpe = MSLAL_MfgActRecvIfService.crtMfgActRecvIf_Chk02();
			int idx = 0;
			int rIdx = 0;
			
			for (MfgActRecvIf_Upd02_ActLstR yieldActR : _yieldActL.subList(_unschdCrtYieldActIdx, MAC_DATA_CRUD_TYP.CRT.value(), true)) {
				// paramIndex/paramRowIndexを設定する
				// 後続の処理で改めて設定されるため、ここでの設定は一時的なものとする
				yieldActR.setParamIndex(idx);
				yieldActR.setParamRowIndex(rIdx++);
				
				MfgActRecvIf_Chk02_ActLstR chkOpeR = MfgActRecvIf_Chk02_ActLstR.create();
				copy(chkOpeR, yieldActR, createMap_MfgActRecvIf_Chk02_ActLstR_MfgActRecvIf_Upd02_ActLstR());
				chkOpe.up0().add(chkOpeR);
			}
			
			if (!chkOpe.up0().isEmpty()) {
				chkOpe.exec();
				
				for (MfgActRecvIf_Chk02_ActLstR downR : chkOpe.down0()) {
					MfgActRecvIf_Upd02_ActLstR yieldActR = _yieldActL.getFirst(MfgActRecvIf_Upd02_ActLstR.$peg_no, downR.peg_no());
					if (downR.err_flg()) {
						setErrFlag(yieldActR);
						for (MCMessage msgRow : MCMessagePool.getMessageList()) {
							if (isSame(yieldActR.peg_no(), msgRow.getCauseRow().getNumberNE("peg_no"))) {
								msgRow.setCauseRow(yieldActR, null);
							}
						}
					}
					// 一時的に設定したparamIndex/paramRowIndexを元に戻す
					yieldActR.setParamIndex(-1);
					yieldActR.setParamRowIndex(-1);
				}
			}
		}
		
		protected Map_MfgActRecvIf_Chk02_ActLstR_MfgActRecvIf_Upd02_ActLstR<MfgActRecvIf_Chk02_ActLstR,MfgActRecvIf_Upd02_ActLstR> createMap_MfgActRecvIf_Chk02_ActLstR_MfgActRecvIf_Upd02_ActLstR() {
			return new Map_MfgActRecvIf_Chk02_ActLstR_MfgActRecvIf_Upd02_ActLstR<MfgActRecvIf_Chk02_ActLstR, MfgActRecvIf_Upd02_ActLstR>();
		}
		
		public class Map_MfgActRecvIf_Chk02_ActLstR_MfgActRecvIf_Upd02_ActLstR<D extends MfgActRecvIf_Chk02_ActLstR, S extends MfgActRecvIf_Upd02_ActLstR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$err_flg, MfgActRecvIf_Upd02_ActLstR.$err_flg);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$data_lno, MfgActRecvIf_Upd02_ActLstR.$data_lno);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$data_no, MfgActRecvIf_Upd02_ActLstR.$data_no);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$data_crud_typ, MfgActRecvIf_Upd02_ActLstR.$data_crud_typ);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$ext_sys_cd, MfgActRecvIf_Upd02_ActLstR.$ext_sys_cd);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$recv_dt, MfgActRecvIf_Upd02_ActLstR.$recv_dt);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$oper_inst_no, MfgActRecvIf_Upd02_ActLstR.$oper_inst_no);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$mfg_inst_no, MfgActRecvIf_Upd02_ActLstR.$mfg_inst_no);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$mfg_inst_rev, MfgActRecvIf_Upd02_ActLstR.$mfg_inst_rev);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$abort_flg, MfgActRecvIf_Upd02_ActLstR.$abort_flg);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$yield_schd_no, MfgActRecvIf_Upd02_ActLstR.$yield_schd_no);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$ext_yield_act_no, MfgActRecvIf_Upd02_ActLstR.$ext_yield_act_no);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$lot_no, MfgActRecvIf_Upd02_ActLstR.$lot_no);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$sublot_no, MfgActRecvIf_Upd02_ActLstR.$sublot_no);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$sno1, MfgActRecvIf_Upd02_ActLstR.$sno1);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$sno2, MfgActRecvIf_Upd02_ActLstR.$sno2);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$sno3, MfgActRecvIf_Upd02_ActLstR.$sno3);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$sno4, MfgActRecvIf_Upd02_ActLstR.$sno4);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$gd_cd, MfgActRecvIf_Upd02_ActLstR.$gd_cd);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$act_tm, MfgActRecvIf_Upd02_ActLstR.$act_tm);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$yield_typ, MfgActRecvIf_Upd02_ActLstR.$yield_typ);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$yield_rsn_cd, MfgActRecvIf_Upd02_ActLstR.$yield_rsn_cd);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$yield_rate, MfgActRecvIf_Upd02_ActLstR.$yield_rate);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$trd_unit_qty, MfgActRecvIf_Upd02_ActLstR.$trd_unit_qty);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$trd_unit_cd, MfgActRecvIf_Upd02_ActLstR.$trd_unit_cd);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$itm_yield, MfgActRecvIf_Upd02_ActLstR.$itm_yield);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$quality_typ, MfgActRecvIf_Upd02_ActLstR.$quality_typ);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$mfg_act_usr_cd, MfgActRecvIf_Upd02_ActLstR.$mfg_act_usr_cd);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$mfg_act_dpt_cd, MfgActRecvIf_Upd02_ActLstR.$mfg_act_dpt_cd);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$mfg_loc_cd, MfgActRecvIf_Upd02_ActLstR.$mfg_loc_cd);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$mfg_str_ln_cd, MfgActRecvIf_Upd02_ActLstR.$mfg_str_ln_cd);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$mfg_itm_cd, MfgActRecvIf_Upd02_ActLstR.$mfg_itm_cd);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$mfg_itm_sub1, MfgActRecvIf_Upd02_ActLstR.$mfg_itm_sub1);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$mfg_itm_sub2, MfgActRecvIf_Upd02_ActLstR.$mfg_itm_sub2);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$mfg_itm_sub3, MfgActRecvIf_Upd02_ActLstR.$mfg_itm_sub3);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$strg_loc_cd, MfgActRecvIf_Upd02_ActLstR.$strg_loc_cd);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$strg_str_ln_cd, MfgActRecvIf_Upd02_ActLstR.$strg_str_ln_cd);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$unschd_act_flg, MfgActRecvIf_Upd02_ActLstR.$unschd_act_flg);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$bom_ptn, MfgActRecvIf_Upd02_ActLstR.$bom_ptn);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$oper_ptn, MfgActRecvIf_Upd02_ActLstR.$oper_ptn);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$peg_no, MfgActRecvIf_Upd02_ActLstR.$peg_no);
				addColumnPathMap(MfgActRecvIf_Chk02_ActLstR.$wg_cd, MfgActRecvIf_Upd02_ActLstR.$wg_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.org_mfg_inst_no(src.mfg_inst_no());
				dest.org_mfg_inst_rev(src.mfg_inst_rev());
				dest.org_oper_inst_no(src.oper_inst_no());
				dest.org_yield_schd_no(src.yield_schd_no());
			}
		}
		
		/**
		 * 製造指図登録後の各ＩＦデータ補完
		 * @param mfgInstOpe
		 */
		protected void setMfgInstDown(MSBCL_MfgInstRegService.MfgInstReg_Upd01 mfgInstOpe) {
			// 出来高実績ＩＦの補完
			for (MfgInstReg_Upd01_DtlYieldR yieldInstR : mfgInstOpe.down4()) {
				MfgActRecvIf_Upd02_ActLstR yieldActR = _yieldActL.getFirst(MfgActRecvIf_Upd02_ActLstR.$peg_no, yieldInstR.hdr_peg_no());
				if (isNull(yieldActR.yield_schd_no())) {
					yieldActR.yield_schd_no(yieldInstR.yield_schd_no());
				}
				if (isNull(yieldActR.mfg_inst_no())) {
					yieldActR.mfg_inst_no(yieldInstR.mfg_inst_no());
				}
			}
			
			// 投入実績ＩＦの補完
			MCIndexKey instYieldIdx = mfgInstOpe.down4().createIndex(MfgInstReg_Upd01_DtlYieldR.$yield_schd_no);
			for (MfgActRecvIf_Upd02_ActLstR inptActR : _inptActL) {
				if (!MAC_DATA_CRUD_TYP.isCRT(inptActR.data_crud_typ()) || isNull(inptActR.ext_yield_act_no())) {
					continue;
				}
				MfgActRecvIf_Upd02_ActLstR yieldActR = _yieldActL.getFirst(_yieldActLIdx, inptActR.ext_yield_act_no(), true);
				if (!isNull(yieldActR)) {
					MfgInstReg_Upd01_DtlYieldR instYieldR = mfgInstOpe.down4().getFirst(instYieldIdx, yieldActR.yield_schd_no());
					if (isNull(inptActR.oper_inst_no())) {
						if (!isNull(instYieldR)) {
							inptActR.oper_inst_no(instYieldR.oper_inst_no());
						}
					}
					if (isNull(inptActR.mfg_inst_no())) {
						if (!isNull(instYieldR)) {
							inptActR.mfg_inst_no(instYieldR.mfg_inst_no());
						}
					}
				}
			}
			
			// 工数実績ＩＦの補完
			for (MfgActRecvIf_Upd02_ActLstR wkActR : _wkActL) {
				if (!MAC_DATA_CRUD_TYP.isCRT(wkActR.data_crud_typ()) || isNull(wkActR.ext_yield_act_no())) {
					continue;
				}
				MfgActRecvIf_Upd02_ActLstR yieldActR = _yieldActL.getFirst(_yieldActLIdx, wkActR.ext_yield_act_no(), true);
				if (!isNull(yieldActR)) {
					MfgInstReg_Upd01_DtlYieldR instYieldR = mfgInstOpe.down4().getFirst(instYieldIdx, yieldActR.yield_schd_no());
					if (isNull(wkActR.oper_inst_no())) {
						if (!isNull(instYieldR)) {
							wkActR.oper_inst_no(instYieldR.oper_inst_no());
						}
					}
					if (isNull(wkActR.mfg_inst_no())) {
						if (!isNull(instYieldR)) {
							wkActR.mfg_inst_no(instYieldR.mfg_inst_no());
						}
					}
				}
			}
		}
		
		/**
		 * 再展開サービスの結果を製造指図登録サービスの電文にセット
		 * @param reExpOpe
		 * @param mfgInstOpe
		 */
		protected void setReExpDown(MSBCL_ReExpService.ReExp_Sprt05 reExpOpe, MSBCL_MfgInstRegService.MfgInstReg_Upd01 mfgInstOpe) {
			
			// 品目詳細マスタキャッシュ
			crtItmDtlCache();
			
			// ヘッダ
			makeHdrUp0(mfgInstOpe.up0(), reExpOpe.up0());
			
			// 工程単位のマスタキャッシュ
			crtOperUnitCache(reExpOpe.down0());
			
			// 工程
			makeOperUp1(mfgInstOpe.up1(), reExpOpe.down0());
			
			// 投入
			makeInptUp2(mfgInstOpe.up2(), reExpOpe);
			
			// 工数
			makeWkUp3(mfgInstOpe.up3(), reExpOpe.down4());
			
			// 出来高
			makeYieldUp4(mfgInstOpe.up4(), reExpOpe.down1());
		}
		
		/**
		 * 製造指図登録サービスへの電文編集（出来高）
		 * @param yieldL
		 * @param downYieldL
		 */
		protected void makeYieldUp4(MCList<MfgInstReg_Upd01_DtlYieldR> yieldL, MCList<ReExp_Sprt03_RsltYieldR> downYieldL) {
			MCNumber pegNo = MCNumber.ZERO;
			for (ReExp_Sprt03_RsltYieldR downYieldR : downYieldL) {
				if (isNull(downYieldR.peg_no())) {
					downYieldR.peg_no(pegNo);
					pegNo = pegNo.add(1);
				}
				MfgInstReg_Upd01_DtlYieldR yieldR = MfgInstReg_Upd01_DtlYieldR.create();
				
				copy(yieldR, downYieldR, createMap_MfgInstReg_Upd01_DtlYieldR_ReExp_Sprt03_RsltYieldR());
				yieldL.add(yieldR);
			}
		}
		
		protected Map_MfgInstReg_Upd01_DtlYieldR_ReExp_Sprt03_RsltYieldR<MfgInstReg_Upd01_DtlYieldR,ReExp_Sprt03_RsltYieldR> createMap_MfgInstReg_Upd01_DtlYieldR_ReExp_Sprt03_RsltYieldR() {
			return new Map_MfgInstReg_Upd01_DtlYieldR_ReExp_Sprt03_RsltYieldR<MfgInstReg_Upd01_DtlYieldR, ReExp_Sprt03_RsltYieldR>();
		}
		
		public class Map_MfgInstReg_Upd01_DtlYieldR_ReExp_Sprt03_RsltYieldR<D extends MfgInstReg_Upd01_DtlYieldR, S extends ReExp_Sprt03_RsltYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$hdr_peg_no, ReExp_Sprt03_RsltYieldR.$hdr_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$oper_peg_no, ReExp_Sprt03_RsltYieldR.$oper_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$peg_no, ReExp_Sprt03_RsltYieldR.$peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$itm_cd, ReExp_Sprt03_RsltYieldR.$itm_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$itm_sub1, ReExp_Sprt03_RsltYieldR.$itm_sub1);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$itm_sub2, ReExp_Sprt03_RsltYieldR.$itm_sub2);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$itm_sub3, ReExp_Sprt03_RsltYieldR.$itm_sub3);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$trd_unit_cd, ReExp_Sprt03_RsltYieldR.$trd_unit_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$base_unit_cd, ReExp_Sprt03_RsltYieldR.$base_unit_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$strg_loc_cd, ReExp_Sprt03_RsltYieldR.$strg_loc_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$strg_str_ln_cd, ReExp_Sprt03_RsltYieldR.$strg_str_ln_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$disp_seq, ReExp_Sprt03_RsltYieldR.$disp_seq);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				MfgActRecvIf_Upd02_ActLstR yieldR = _yieldActL.getFirst(MfgActRecvIf_Upd02_ActLstR.$peg_no, src.hdr_peg_no());
				dest.sno1(nvl(yieldR.sno1(), MAC_STR.NULL_VAL.value()));
				dest.sno2(nvl(yieldR.sno2(), MAC_STR.NULL_VAL.value()));
				dest.sno3(nvl(yieldR.sno3(), MAC_STR.NULL_VAL.value()));
				dest.sno4(nvl(yieldR.sno4(), MAC_STR.NULL_VAL.value()));
				MAM_LOC_R mfgLocR = _mfgLocCache.getEx(yieldR.mfg_loc_cd());
				dest.mfg_loc_site_cd(mfgLocR.site_cd());
				dest.mfg_loc_cd(yieldR.mfg_loc_cd());
				dest.schd_tm(src.yield_schd_dt());
				dest.trd_unit_yield_qty(src.trd_unit_qty());
				dest.base_unit_yield_qty(src.base_unit_qty());
				dest.stk_lst_prnt_flg(false);
				dest.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
				dest.disp_seq_upd_flg(false);
				dest.inst_abort_flg(false);
				dest.old_inst_abort_flg(false);
				dest.not_frst_inst_can_flg(false);
			}
		}
		
		/**
		 * 製造指図登録サービスへの電文編集（工数）
		 * @param wkL
		 * @param downWkL
		 */
		protected void makeWkUp3(MCList<MfgInstReg_Upd01_DtlWkR> wkL, MCList<ReExp_Sprt02_RsltWkR> downWkL) {
			MCNumber pegNo = MCNumber.ZERO;
			for (ReExp_Sprt02_RsltWkR downWkR : downWkL) {
				if (isNull(downWkR.peg_no())) {
					downWkR.peg_no(pegNo);
					pegNo = pegNo.add(1);
				}
				MfgInstReg_Upd01_DtlWkR wkR = MfgInstReg_Upd01_DtlWkR.create();
				
				copy(wkR, downWkR, createMap_MfgInstReg_Upd01_DtlWkR_ReExp_Sprt02_RsltWkR());
				wkL.add(wkR);
			}
		}
		
		protected Map_MfgInstReg_Upd01_DtlWkR_ReExp_Sprt02_RsltWkR<MfgInstReg_Upd01_DtlWkR,ReExp_Sprt02_RsltWkR> createMap_MfgInstReg_Upd01_DtlWkR_ReExp_Sprt02_RsltWkR() {
			return new Map_MfgInstReg_Upd01_DtlWkR_ReExp_Sprt02_RsltWkR<MfgInstReg_Upd01_DtlWkR, ReExp_Sprt02_RsltWkR>();
		}
		
		public class Map_MfgInstReg_Upd01_DtlWkR_ReExp_Sprt02_RsltWkR<D extends MfgInstReg_Upd01_DtlWkR, S extends ReExp_Sprt02_RsltWkR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$hdr_peg_no, ReExp_Sprt02_RsltWkR.$hdr_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$oper_peg_no, ReExp_Sprt02_RsltWkR.$oper_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$peg_no, ReExp_Sprt02_RsltWkR.$peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$wk_cost_cd, ReExp_Sprt02_RsltWkR.$wk_cost_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$wk_cost, ReExp_Sprt02_RsltWkR.$wk_cost);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$fxd_wk_cost, ReExp_Sprt02_RsltWkR.$fxd_wk_cost);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$mst_wk_cost, ReExp_Sprt02_RsltWkR.$mst_wk_cost);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$mst_fxd_wk_cost, ReExp_Sprt02_RsltWkR.$mst_fxd_wk_cost);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$wk_cost_calc_flg, ReExp_Sprt02_RsltWkR.$wk_cost_calc_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$disp_seq, ReExp_Sprt02_RsltWkR.$disp_seq);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
				dest.disp_seq_upd_flg(false);
				dest.inst_abort_flg(false);
				dest.old_inst_abort_flg(false);
				dest.not_frst_inst_can_flg(false);
			}
		}
		
		/**
		 * 製造指図登録サービスへの電文編集（投入）
		 * @param inptL
		 * @param downInptL
		 */
		protected void makeInptUp2(MCList<MfgInstReg_Upd01_DtlInptR> inptL, MSBCL_ReExpService.ReExp_Sprt05 reExpOpe) {
			MCNumber pegNo = MCNumber.ZERO;
			MCNumber dispSeq = MCNumber.ONE;
			MCIndexKey operIdx = reExpOpe.down0().createIndex(ReExp_Sprt05_RsltOperR.$peg_no);
			
			for (ReExp_Sprt01_RsltInptR downInptR : reExpOpe.down2()) {
				
				// バックフラッシュ不許可の場合は作成しない
				ReExp_Sprt05_RsltOperR operR = reExpOpe.down0().getFirst(operIdx, downInptR.oper_peg_no());
				if (up1().not_bkf_upd_flg() || (!isNull(operR) && !operR.bkf_flg())) {
					continue;
				}
				
				if (isNull(downInptR.peg_no())) {
					downInptR.peg_no(pegNo);
					pegNo = pegNo.add(1);
				}
				MfgInstReg_Upd01_DtlInptR inptR = MfgInstReg_Upd01_DtlInptR.create();
				
				downInptR.disp_seq(dispSeq);
				
				copy(inptR, downInptR, createMap_MfgInstReg_Upd01_DtlInptR_ReExp_Sprt01_RsltInptR());
				inptL.add(inptR);
				
				dispSeq = dispSeq.add(1);
			}
		}
		
		protected Map_MfgInstReg_Upd01_DtlInptR_ReExp_Sprt01_RsltInptR<MfgInstReg_Upd01_DtlInptR,ReExp_Sprt01_RsltInptR> createMap_MfgInstReg_Upd01_DtlInptR_ReExp_Sprt01_RsltInptR() {
			return new Map_MfgInstReg_Upd01_DtlInptR_ReExp_Sprt01_RsltInptR<MfgInstReg_Upd01_DtlInptR, ReExp_Sprt01_RsltInptR>();
		}
		
		public class Map_MfgInstReg_Upd01_DtlInptR_ReExp_Sprt01_RsltInptR<D extends MfgInstReg_Upd01_DtlInptR, S extends ReExp_Sprt01_RsltInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$hdr_peg_no, ReExp_Sprt01_RsltInptR.$hdr_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$oper_peg_no, ReExp_Sprt01_RsltInptR.$oper_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$peg_no, ReExp_Sprt01_RsltInptR.$peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$alt_grp_cd, ReExp_Sprt01_RsltInptR.$alt_grp_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$alt_grp_seq, ReExp_Sprt01_RsltInptR.$alt_grp_seq);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_cd, ReExp_Sprt01_RsltInptR.$itm_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_sub1, ReExp_Sprt01_RsltInptR.$itm_sub1);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_sub2, ReExp_Sprt01_RsltInptR.$itm_sub2);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_sub3, ReExp_Sprt01_RsltInptR.$itm_sub3);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$ver_no, ReExp_Sprt01_RsltInptR.$ver_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$lot_mng_typ, ReExp_Sprt01_RsltInptR.$lot_mng_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sublot_mng_typ, ReExp_Sprt01_RsltInptR.$sublot_mng_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$base_unit_cd, ReExp_Sprt01_RsltInptR.$base_unit_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$cont_fctr_flg, ReExp_Sprt01_RsltInptR.$cont_fctr_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$act_cont_fctr, ReExp_Sprt01_RsltInptR.$act_cont_fctr);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$cont_inpt_qty, ReExp_Sprt01_RsltInptR.$cont_inpt_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$cont_rqmt_qty, ReExp_Sprt01_RsltInptR.$cont_rqmt_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$cont_fxd_rqmt_qty, ReExp_Sprt01_RsltInptR.$cont_fxd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$cont_fctr_unit_cd, ReExp_Sprt01_RsltInptR.$cont_fctr_unit_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$std_cont_fctr, ReExp_Sprt01_RsltInptR.$std_cont_fctr);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$inst_lot_fix_flg, ReExp_Sprt01_RsltInptR.$inst_lot_fix_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$lot_no, ReExp_Sprt01_RsltInptR.$lot_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sublot_no, ReExp_Sprt01_RsltInptR.$sublot_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$first_gr_dt, ReExp_Sprt01_RsltInptR.$first_gr_dt);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$lot_seq, ReExp_Sprt01_RsltInptR.$lot_seq);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno1, ReExp_Sprt01_RsltInptR.$sno1);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno1_null_flg, ReExp_Sprt01_RsltInptR.$sno1_null_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno2, ReExp_Sprt01_RsltInptR.$sno2);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno2_null_flg, ReExp_Sprt01_RsltInptR.$sno2_null_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno3, ReExp_Sprt01_RsltInptR.$sno3);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno3_null_flg, ReExp_Sprt01_RsltInptR.$sno3_null_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno4, ReExp_Sprt01_RsltInptR.$sno4);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno4_null_flg, ReExp_Sprt01_RsltInptR.$sno4_null_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$inpt_loc_cd, ReExp_Sprt01_RsltInptR.$inpt_loc_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$inpt_str_ln_cd, ReExp_Sprt01_RsltInptR.$inpt_str_ln_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$gd_cd, ReExp_Sprt01_RsltInptR.$gd_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$bkf_typ, ReExp_Sprt01_RsltInptR.$bkf_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$par_inst_qty, ReExp_Sprt01_RsltInptR.$par_inst_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$chd_inpt_qty, ReExp_Sprt01_RsltInptR.$chd_inpt_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$chd_rqmt_qty, ReExp_Sprt01_RsltInptR.$chd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$fxd_chd_rqmt_qty, ReExp_Sprt01_RsltInptR.$fxd_chd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$main_itm_flg, ReExp_Sprt01_RsltInptR.$main_itm_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$bom_memo1, ReExp_Sprt01_RsltInptR.$bom_memo1);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$bom_memo2, ReExp_Sprt01_RsltInptR.$bom_memo2);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$bom_memo3, ReExp_Sprt01_RsltInptR.$bom_memo3);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$yield_calc_flg, ReExp_Sprt01_RsltInptR.$yield_calc_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$inpt_ctl_typ, ReExp_Sprt01_RsltInptR.$inpt_ctl_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$in_offst_typ, ReExp_Sprt01_RsltInptR.$in_offst_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$in_offst, ReExp_Sprt01_RsltInptR.$in_offst);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$lot_mix_flg, ReExp_Sprt01_RsltInptR.$lot_mix_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sublot_mix_flg, ReExp_Sprt01_RsltInptR.$sublot_mix_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$stk_mng_typ, ReExp_Sprt01_RsltInptR.$stk_mng_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$prov_typ, ReExp_Sprt01_RsltInptR.$prov_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$alt_itm_typ, ReExp_Sprt01_RsltInptR.$alt_itm_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$alt_alloc_prio, ReExp_Sprt01_RsltInptR.$alt_alloc_prio);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$alt_itm_ratio, ReExp_Sprt01_RsltInptR.$alt_itm_ratio);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$disp_seq, ReExp_Sprt01_RsltInptR.$disp_seq);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.alt_itm_fix_flg(false);
				dest.base_unit_alt_qty(src.alt_qty());
				dest.base_unit_inpt_qty(src.inpt_qty());
				dest.base_unit_rqmt_qty(src.rqmt_qty());
				dest.base_unit_fxd_rqmt_qty(src.fxd_rqmt_qty());
				
				MfgActRecvIf_Upd02_ActLstR yieldR = _yieldActL.getFirst(MfgActRecvIf_Upd02_ActLstR.$peg_no, src.hdr_peg_no());
				dest.schd_tm(yieldR.act_tm());
				
				dest.alloc_flg(false);
				if (MAC_LOT_MNG_TYP.isNOT_MNG(src.lot_mng_typ())) {
					dest.no_lot_fix_flg(false);
				}
				else {
					dest.no_lot_fix_flg(true);
				}
				
				if (isNull(dest.lot_no())) {
					dest.lot_no(MAC_STR.NULL_VAL.value());
				}
				if (isNull(dest.sublot_no())) {
					dest.sublot_no(MAC_STR.NULL_VAL.value());
				}
				
				dest.bom_id_no(src.bom_id());
				dest.chd_itm_seq(src.itm_seq());
				dest.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
				dest.disp_seq_upd_flg(false);
				dest.xfr_inst_err_flg(false);
				dest.inst_abort_flg(false);
				dest.old_inst_abort_flg(false);
				dest.not_frst_inst_can_flg(false);
				dest.inst_lot_fix_flg(false);
				dest.alloc_ctl_typ(MAC_ALLOC_CTL_TYP.NO_ALLOC.value());
				if (isNull(dest.inpt_str_ln_cd())) {
					dest.inpt_str_ln_cd(MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		/**
		 * 製造指図登録サービスへの電文編集（工程）
		 * @param operL
		 * @param downOperL
		 */
		protected void makeOperUp1(MCList<MfgInstReg_Upd01_DtlOperR> operL, MCList<ReExp_Sprt05_RsltOperR> downOperL) {
			for (ReExp_Sprt05_RsltOperR downOperR : downOperL) {
				MfgInstReg_Upd01_DtlOperR operR = MfgInstReg_Upd01_DtlOperR.create();
				
				copy(operR, downOperR, createMap_MfgInstReg_Upd01_DtlOperR_ReExp_Sprt05_RsltOperR());
				operL.add(operR);
				
			}
		}
		
		protected Map_MfgInstReg_Upd01_DtlOperR_ReExp_Sprt05_RsltOperR<MfgInstReg_Upd01_DtlOperR,ReExp_Sprt05_RsltOperR> createMap_MfgInstReg_Upd01_DtlOperR_ReExp_Sprt05_RsltOperR() {
			return new Map_MfgInstReg_Upd01_DtlOperR_ReExp_Sprt05_RsltOperR<MfgInstReg_Upd01_DtlOperR, ReExp_Sprt05_RsltOperR>();
		}
		
		public class Map_MfgInstReg_Upd01_DtlOperR_ReExp_Sprt05_RsltOperR<D extends MfgInstReg_Upd01_DtlOperR, S extends ReExp_Sprt05_RsltOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$hdr_peg_no, ReExp_Sprt05_RsltOperR.$hdr_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$peg_no, ReExp_Sprt05_RsltOperR.$peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_cd, ReExp_Sprt05_RsltOperR.$oper_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_seq, ReExp_Sprt05_RsltOperR.$oper_seq);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$base_unit_qty, ReExp_Sprt05_RsltOperR.$base_unit_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$base_unit_cd, ReExp_Sprt05_RsltOperR.$base_unit_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_std_qty, ReExp_Sprt05_RsltOperR.$oper_std_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_conv_qty, ReExp_Sprt05_RsltOperR.$oper_conv_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_unit_cd, ReExp_Sprt05_RsltOperR.$oper_unit_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_loc_cd, ReExp_Sprt05_RsltOperR.$oper_loc_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_str_ln_cd, ReExp_Sprt05_RsltOperR.$oper_str_ln_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$disp_seq, ReExp_Sprt05_RsltOperR.$disp_seq);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$bkf_flg, ReExp_Sprt05_RsltOperR.$bkf_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$wk_cost_calc_flg, ReExp_Sprt05_RsltOperR.$wk_cost_calc_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_inst_grp, ReExp_Sprt05_RsltOperR.$oper_inst_grp);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_lt, ReExp_Sprt05_RsltOperR.$oper_lt);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_lt_add_qty, ReExp_Sprt05_RsltOperR.$oper_lt_add_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_offst_typ, ReExp_Sprt05_RsltOperR.$oper_offst_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_offst, ReExp_Sprt05_RsltOperR.$oper_offst);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_offst_add_qty, ReExp_Sprt05_RsltOperR.$oper_offst_add_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$lmt_fr_dt_flg, ReExp_Sprt05_RsltOperR.$lmt_fr_dt_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_lower_yield, ReExp_Sprt05_RsltOperR.$oper_lower_yield);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_std_yield, ReExp_Sprt05_RsltOperR.$oper_std_yield);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_upper_yield, ReExp_Sprt05_RsltOperR.$oper_upper_yield);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$wip_rate, ReExp_Sprt05_RsltOperR.$wip_rate);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_ord_no, ReExp_Sprt05_RsltOperR.$oper_ord_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$mfg_inst_no, ReExp_Sprt05_RsltOperR.$mfg_inst_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_inst_no, ReExp_Sprt05_RsltOperR.$oper_inst_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$yield_oper_flg, ReExp_Sprt05_RsltOperR.$yield_oper_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$yield_oper_ratio, ReExp_Sprt05_RsltOperR.$yield_oper_ratio);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$st_schd_tm, ReExp_Sprt05_RsltOperR.$st_schd_tm);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$end_schd_tm, ReExp_Sprt05_RsltOperR.$end_schd_tm);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.tgt_oper_flg(true);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				
				MAM_UNIT_R unitR = _cacheOperUnit.getFirst(_idxOperUnitCache, src.oper_unit_cd());
				if (!isNull(unitR)) {
					dest.oper_unit_conv_rnd_typ(unitR.rnd_typ());
					dest.oper_unit_dec_place(unitR.dec_place());
				}
				
				dest.oper_abort_flg(false);
				dest.not_oper_schd_qty(MCNumber.ZERO);
				dest.unschd_inst_flg(true);
				dest.unschd_act_flg(true);
				dest.hdr_mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
				dest.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
				dest.inst_abort_flg(false);
				dest.old_inst_abort_flg(false);
				dest.not_frst_inst_can_flg(false);
				dest.mes_flg(false);
				if (isNull(dest.oper_str_ln_cd())) {
					dest.oper_str_ln_cd(MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		/**
		 * 製造指図登録サービスへの電文編集（ヘッダ）
		 * @param hdrL
		 * @param reExpHdrL
		 */
		protected void makeHdrUp0(MCList<MfgInstReg_Upd01_HdrR> hdrL, MCList<ReExp_Sprt05_HdrR> reExpHdrL) {
			
			MCIndexKey idxKey = _yieldActL.createIndex(MfgActRecvIf_Upd02_ActLstR.$peg_no);
			for (ReExp_Sprt05_HdrR reExpHdrR : reExpHdrL) {
				MfgActRecvIf_Upd02_ActLstR upR = _yieldActL.getFirst(idxKey, reExpHdrR.peg_no());
				if (upR.err_flg()) {
					continue;
				}
				MfgInstReg_Upd01_HdrR hdrR = MfgInstReg_Upd01_HdrR.create();
				
				hdrR.mfg_inst_data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				hdrR.itm_mfg_inst_data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				hdrR.peg_no(reExpHdrR.peg_no());
				hdrR.mfg_mtd_typ(MSC_MFG_MTD_TYP.INTNL.value());
				hdrR.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
				hdrR.master_dt(reExpHdrR.master_dt());
				hdrR.itm_cd(reExpHdrR.itm_cd());
				hdrR.itm_sub1(reExpHdrR.itm_sub1());
				hdrR.itm_sub2(reExpHdrR.itm_sub2());
				hdrR.itm_sub3(reExpHdrR.itm_sub3());
				
				MAM_ITM_R itmR = _unschdItmCache.getEx(upR.mfg_itm_cd(), upR.mfg_itm_sub1(), upR.mfg_itm_sub2(), upR.mfg_itm_sub3());
				
				hdrR.lot_mng_typ(itmR.lot_mng_typ());
				hdrR.lot_no_typ(itmR.lot_no_typ());
				hdrR.lot_no_ptn_cd(itmR.lot_no_ptn_cd());
				hdrR.sublot_mng_typ(itmR.sublot_mng_typ());
				hdrR.sublot_no_typ(itmR.sublot_no_typ());
				hdrR.sublot_no_ptn_cd(itmR.sublot_no_ptn_cd());
				hdrR.mfg_loc_cd(reExpHdrR.mfg_loc_cd());
				hdrR.strg_loc_cd(reExpHdrR.strg_loc_cd());
				hdrR.bom_ptn(upR.bom_ptn());
				hdrR.lot_issue_typ(MAC_LOT_ISSUE_TYP.ON_CMPL.value());
				hdrR.base_unit_inst_qty(reExpHdrR.mfg_inst_qty());
				hdrR.base_unit_yield_qty(reExpHdrR.mfg_inst_qty());
				hdrR.base_unit_cd(reExpHdrR.base_unit_cd());
				hdrR.inst_dt(upR.act_tm());
				hdrR.st_schd_tm(upR.act_tm());
				hdrR.end_schd_tm(upR.act_tm());
				hdrR.oper_ptn(nvl(upR.oper_ptn(), MAC_STR.NULL_VAL.value()));
				hdrR.sno1(reExpHdrR.sno1());
				hdrR.sno2(reExpHdrR.sno2());
				hdrR.sno3(reExpHdrR.sno3());
				hdrR.sno4(reExpHdrR.sno4());
				hdrR.mfg_str_ln_cd(reExpHdrR.mfg_str_ln_cd());
				hdrR.strg_str_ln_cd(reExpHdrR.strg_str_ln_cd());
				hdrR.po_locked_flg(false);
				hdrR.inst_abort_flg(false);
				hdrR.inst_prnt_flg(false);
				hdrR.inst_immed_prnt_flg(false);
				hdrR.chg_list_immed_prnt_flg(false);
				hdrR.xfr_inst_del_enable_flg(false);
				hdrR.mfg_inst_unit_typ(itmR.mfg_inst_unit_typ());
				if (isNull(hdrR.mfg_inst_unit_typ())) {
					hdrR.mfg_inst_unit_typ(MAC_MFG_INST_UNIT_TYP.ITM.value());
				}
				hdrR.unschd_inst_flg(true);
				hdrR.unschd_act_flg(true);
				hdrR.schd_chg_flg(true);
				hdrR.base_unit_ord_qty(reExpHdrR.mfg_inst_qty());
				hdrR.base_unit_not_inst_qty(0);
				hdrR.ord_abort_flg(false);
				hdrR.mfg_loc_wg_cd(reExpHdrR.wg_cd());
				
				MAM_LOC_R mfgLocR = _mfgLocCache.getEx(upR.mfg_loc_cd());
				
				hdrR.mfg_loc_site_cd(mfgLocR.site_cd());
				
				MAM_ITM_DTL_R itmDtlR = _cacheItmDtl.getFirst(_idxItmDtlCache,
						upR.mfg_itm_cd(),
						upR.mfg_itm_sub1(),
						upR.mfg_itm_sub2(),
						upR.mfg_itm_sub3(),
						upR.mfg_loc_cd(),
						mfgLocR.wg_cd(),
						upR.bom_ptn());
				if (!isNull(itmDtlR)) {
					hdrR.itm_lower_yield(itmDtlR.itm_lower_yield());
					hdrR.itm_std_yield(itmDtlR.itm_std_yield());
					hdrR.itm_upper_yield(itmDtlR.itm_upper_yield());
				}
				
				hdrR.inst_rec_issue_flg(false);
				hdrR.po_auto_reg_flg(false);
				hdrR.no_mfg_aprv_flg(true);
				hdrR.old_aprv_flg(false);
				hdrR.old_inst_abort_flg(false);
				hdrR.is_src_outsrc_srv_flg(false);
				hdrR.lst_reg_flg(true);
				hdrR.not_frst_inst_can_flg(false);
				hdrR.not_frst_inst_reg_oper_flg(false);
				hdrR.re_alloc_mode_flg(false);
				hdrR.is_src_alloc_flg(false);
				hdrL.add(hdrR);
			}
		}
		
		/**
		 * 外部出来高実績ＮＯに該当する出来高実績データを取得する
		 */
		protected void getYieldActDBL() {
			MCList<MST_YIELD_ACT_R> tmpWKL = MCList.create(MST_YIELD_ACT_R.class);
			MCList<MST_YIELD_ACT_R> tmpInptL = MCList.create(MST_YIELD_ACT_R.class);
			MCList<MST_YIELD_ACT_R> tmpYieldL = MCList.create(MST_YIELD_ACT_R.class);
			MCList<MST_YIELD_ACT_R> bindL = MCList.create(MST_YIELD_ACT_R.class);
			
			// 計画外実績で工数実績ＩＦの外部出来高実績ＮＯリスト
			for (MfgActRecvIf_Upd02_ActLstR wkR : _wkActL.groupBy(MfgActRecvIf_Upd02_ActLstR.$ext_yield_act_no)) {
				MST_YIELD_ACT_R tmpWkR = MST_YIELD_ACT_R.create();
				tmpWkR.ext_yield_act_no(wkR.ext_yield_act_no());
				tmpWKL.add(tmpWkR);
			}
			
			// 計画外実績で投入実績ＩＦの外部出来高実績ＮＯリスト
			for (MfgActRecvIf_Upd02_ActLstR inptR : _inptActL.groupBy(MfgActRecvIf_Upd02_ActLstR.$ext_yield_act_no)) {
				MST_YIELD_ACT_R tmpInptR = MST_YIELD_ACT_R.create();
				tmpInptR.ext_yield_act_no(inptR.ext_yield_act_no());
				tmpInptL.add(tmpInptR);
			}
			
			// 計画外実績で出来高実績ＩＦの外部出来高実績ＮＯリスト
			for (MfgActRecvIf_Upd02_ActLstR yieldR : _yieldActL.groupBy(MfgActRecvIf_Upd02_ActLstR.$ext_yield_act_no)) {
				MST_YIELD_ACT_R tmpYieldR = MST_YIELD_ACT_R.create();
				tmpYieldR.ext_yield_act_no(yieldR.ext_yield_act_no());
				tmpYieldL.add(tmpYieldR);
			}
			
			// 対象をマージ（同一外部出来高実績ＮＯはひとつになる）
			bindL.merge(tmpWKL, MST_YIELD_ACT_R.$ext_yield_act_no);
			bindL.merge(tmpInptL, MST_YIELD_ACT_R.$ext_yield_act_no);
			bindL.merge(tmpYieldL, MST_YIELD_ACT_R.$ext_yield_act_no);
			
			if (bindL.isEmpty()) {
				return;
			}
			MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");
			MST_MFG_ACT_R t3 = MST_MFG_ACT_R.create("T3");
			MST_OPER_ACT_R t4 = MST_OPER_ACT_R.create("T4");
			
			_yieldActDBL.addStringColumn("mfg_inst_no");
			_yieldActDBL.addStringColumn("oper_inst_no");
			_yieldActDBL.addBooleanColumn("unschd_act_flg");
			_yieldActDBL_bldr.addSelect(t2.unschd_act_flg.as("unschd_act_flg"));
			_yieldActDBL_bldr.addSelect(t3.mfg_inst_no.as("mfg_inst_no"));
			_yieldActDBL_bldr.addSelect(t4.oper_inst_no.as("oper_inst_no"));
			_yieldActDBL_bldr.addInnerJoin(t2,
					bracket(t2.itm_mfg_inst_no.eq(_yieldActDBL_t.itm_mfg_inst_no)
							.and(t2.unschd_act_flg.eq(value(true)))
							.and(t2.can_flg.eq(value(false)))));
			_yieldActDBL_bldr.addInnerJoin(t3, bracket(t3.mfg_act_no.eq(_yieldActDBL_t.mfg_act_no)));
			_yieldActDBL_bldr.addInnerJoin(t4, bracket(t4.oper_act_no.eq(_yieldActDBL_t.oper_act_no)));
			_yieldActDBL_bldr.setWhere(_yieldActDBL_t.ext_yield_act_no.eq(bind("ext_yield_act_no")));
			dbSelect("MSLAL6220_MST_YIELD_ACT_S01", _yieldActDBL, _yieldActDBL_bldr, bindL);
			_yieldActDBLIdx = _yieldActDBL.createIndex(MST_YIELD_ACT_R.$yield_act_no);
			_yieldActDBLExtIdx = _yieldActDBL.createIndex(MST_YIELD_ACT_R.$ext_yield_act_no);
		}

		/**
		 * 工程実績受信データを取得する。
		 */
		protected void getOperActL() {
			MCList<IfDataImp_Upd01_DtlR> operL = up0().subList(IfDataImp_Upd01_DtlR.$if_proc_typ, MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value());
			MCList<IfDataImp_Upd01_DtlR> extSysL = up0().subList(r -> isNull(r.if_proc_typ()) && !isNull(r.ext_sys_cd()));

			MCList<MST_OPER_ACT_RECV_IF_R> recvL = getOperRecvL(operL);

			if (!isNull(recvL)) {
				executeQuery(_operActL, MSLAL6220_MST_OPER_ACT_RECV_IF_S01(), recvL);
			}
			else if (!isNull(operL)) {
				executeQuery(_operActL, MSLAL6220_MST_OPER_ACT_RECV_IF_S01(), operL);
			}
			else if (!isNull(extSysL)) {
				executeQuery(_operActL, MSLAL6220_MST_OPER_ACT_RECV_IF_S01(), extSysL);
			}
			else if (up0().isEmpty()) {
				executeQuery(_operActL, MSLAL6220_MST_OPER_ACT_RECV_IF_S01());
			}

			_totalNum += _operActL.size();
		}

		protected MCList<MST_OPER_ACT_RECV_IF_R> getOperRecvL(MCList<IfDataImp_Upd01_DtlR> operL) {
			MCList<MST_OPER_ACT_RECV_IF_R> recvL = MCList.create(MST_OPER_ACT_RECV_IF_R.class);
			MST_OPER_ACT_RECV_IF_R t = MST_OPER_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder recvL_bldr = MCQueryApiBuilder.create(t);

			// 実績一括受信バッチから処理単位区分「まとめない」で実行されてきた場合のみ
			// 同一外部システムデータNOのレコードをまとめて処理する
			if (!isNull(operL) && up1().src_actlumprecv_flg() && !up1().exe_unit_lump_flg()) {
				recvL_bldr.setDistinct();
				recvL_bldr.setSelect(t.ext_data_no, t.ext_sys_cd);
				recvL_bldr.setWhere(t.imp_flg.eq(value(true)));
				recvL_bldr.addWhereWithCutOffAnd(t.data_lno.eq(bind("data_lno")));
				recvL_bldr.addWhereWithCutOffAnd(t.data_no.eq(bind("data_no")));
				recvL_bldr.addWhereWithCutOffAnd(t.ext_data_no.eq(bind("ext_data_no")));
				recvL_bldr.addWhereWithCutOffAnd(t.ext_sys_cd.eq(bind("ext_sys_cd")));
				dbSelect("MSLAL6220_MST_OPER_ACT_RECV_IF_S01", recvL, recvL_bldr, operL);
			}

			return recvL;
		}

		/**
		 * 投入実績受信データを取得する。
		 */
		protected void getInptActL() {
			MCList<IfDataImp_Upd01_DtlR> inptL = up0().subList(IfDataImp_Upd01_DtlR.$if_proc_typ, MAC_IF_PROC_TYP.MES_INPT_ACT_RECV.value());
			MCList<IfDataImp_Upd01_DtlR> extSysL = up0().subList(r -> isNull(r.if_proc_typ()) && !isNull(r.ext_sys_cd()));

			MCList<MST_INPT_ACT_RECV_IF_R> recvL = getInptRecvL(inptL);

			if (!isNull(recvL)) {
				executeQuery(_inptActL, MSLAL6220_MST_INPT_ACT_RECV_IF_S02(), recvL);
			}
			else if (!isNull(inptL)) {
				executeQuery(_inptActL, MSLAL6220_MST_INPT_ACT_RECV_IF_S02(), inptL);
			}
			else if (!isNull(extSysL)) {
				executeQuery(_inptActL, MSLAL6220_MST_INPT_ACT_RECV_IF_S02(), extSysL);
			}
			else if (up0().isEmpty()) {
				executeQuery(_inptActL, MSLAL6220_MST_INPT_ACT_RECV_IF_S02());
			}

			_totalNum += _inptActL.size();
		}

		protected MCList<MST_INPT_ACT_RECV_IF_R> getInptRecvL(MCList<IfDataImp_Upd01_DtlR> inptL) {
			MCList<MST_INPT_ACT_RECV_IF_R> recvL = MCList.create(MST_INPT_ACT_RECV_IF_R.class);
			MST_INPT_ACT_RECV_IF_R t = MST_INPT_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder recvL_bldr = MCQueryApiBuilder.create(t);

			// 実績一括受信バッチから処理単位区分「まとめない」で実行されてきた場合のみ
			// 同一外部システムデータNOのレコードをまとめて処理する
			if (!isNull(inptL) && up1().src_actlumprecv_flg() && !up1().exe_unit_lump_flg()) {
				recvL_bldr.setDistinct();
				recvL_bldr.setSelect(t.ext_data_no, t.ext_sys_cd);
				recvL_bldr.setWhere(t.imp_flg.eq(value(true)));
				recvL_bldr.addWhereWithCutOffAnd(t.data_lno.eq(bind("data_lno")));
				recvL_bldr.addWhereWithCutOffAnd(t.data_no.eq(bind("data_no")));
				recvL_bldr.addWhereWithCutOffAnd(t.ext_data_no.eq(bind("ext_data_no")));
				recvL_bldr.addWhereWithCutOffAnd(t.ext_sys_cd.eq(bind("ext_sys_cd")));
				dbSelect("MSLAL6220_MST_INPT_ACT_RECV_IF_S01", recvL, recvL_bldr, inptL);
			}

			return recvL;
		}

		/**
		 * 工数実績受信データを取得する。
		 */
		protected void getWkActL() {
			MCList<IfDataImp_Upd01_DtlR> wkL = up0().subList(IfDataImp_Upd01_DtlR.$if_proc_typ, MAC_IF_PROC_TYP.MES_WK_ACT_RECV.value());
			MCList<IfDataImp_Upd01_DtlR> extSysL = up0().subList(r -> isNull(r.if_proc_typ()) && !isNull(r.ext_sys_cd()));

			MCList<MST_WK_ACT_RECV_IF_R> recvL = getWkRecvL(wkL);

			if (!isNull(recvL)) {
				executeQuery(_wkActL, MSLAL6220_MST_WK_ACT_RECV_IF_S03(), recvL);
			}
			else if (!isNull(wkL)) {
				executeQuery(_wkActL, MSLAL6220_MST_WK_ACT_RECV_IF_S03(), wkL);
			}
			else if (!isNull(extSysL)) {
				executeQuery(_wkActL, MSLAL6220_MST_WK_ACT_RECV_IF_S03(), extSysL);
			}
			else if (up0().isEmpty()) {
				executeQuery(_wkActL, MSLAL6220_MST_WK_ACT_RECV_IF_S03());
			}

			_totalNum += _wkActL.size();
		}

		protected MCList<MST_WK_ACT_RECV_IF_R> getWkRecvL(MCList<IfDataImp_Upd01_DtlR> wkL) {
			MCList<MST_WK_ACT_RECV_IF_R> recvL = MCList.create(MST_WK_ACT_RECV_IF_R.class);
			MST_WK_ACT_RECV_IF_R t = MST_WK_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder recvL_bldr = MCQueryApiBuilder.create(t);

			// 実績一括受信バッチから処理単位区分「まとめない」で実行されてきた場合のみ
			// 同一外部システムデータNOのレコードをまとめて処理する
			if (!isNull(wkL) && up1().src_actlumprecv_flg() && !up1().exe_unit_lump_flg()) {
				recvL_bldr.setDistinct();
				recvL_bldr.setSelect(t.ext_data_no, t.ext_sys_cd);
				recvL_bldr.setWhere(t.imp_flg.eq(value(true)));
				recvL_bldr.addWhereWithCutOffAnd(t.data_lno.eq(bind("data_lno")));
				recvL_bldr.addWhereWithCutOffAnd(t.data_no.eq(bind("data_no")));
				recvL_bldr.addWhereWithCutOffAnd(t.ext_data_no.eq(bind("ext_data_no")));
				recvL_bldr.addWhereWithCutOffAnd(t.ext_sys_cd.eq(bind("ext_sys_cd")));
				dbSelect("MSLAL6220_MST_WK_ACT_RECV_IF_S01", recvL, recvL_bldr, wkL);
			}

			return recvL;
		}

		/**
		 * 出来高実績受信データを取得する。
		 */
		protected void getYieldActL() {
			MCList<IfDataImp_Upd01_DtlR> yieldL = up0().subList(IfDataImp_Upd01_DtlR.$if_proc_typ, MAC_IF_PROC_TYP.MES_YIELD_ACT_RECV.value());
			MCList<IfDataImp_Upd01_DtlR> extSysL = up0().subList(r -> isNull(r.if_proc_typ()) && !isNull(r.ext_sys_cd()));

			MCList<MST_YIELD_ACT_RECV_IF_R> recvL = getYieldRecvL(yieldL);

			if (!isNull(recvL)) {
				executeQuery(_yieldActL, MSLAL6220_MST_YIELD_ACT_RECV_IF_S04(), recvL);
			}
			else if (!isNull(yieldL)) {
				executeQuery(_yieldActL, MSLAL6220_MST_YIELD_ACT_RECV_IF_S04(), yieldL);
			}
			else if (!isNull(extSysL)) {
				executeQuery(_yieldActL, MSLAL6220_MST_YIELD_ACT_RECV_IF_S04(), extSysL);
			}
			else if (up0().isEmpty()) {
				executeQuery(_yieldActL, MSLAL6220_MST_YIELD_ACT_RECV_IF_S04());
			}

			_totalNum += _yieldActL.size();
			
			_yieldActLIdx = _yieldActL.createIndex(MfgActRecvIf_Upd02_ActLstR.$ext_yield_act_no, MfgActRecvIf_Upd02_ActLstR.$unschd_act_flg);
			_unschdCrtYieldActIdx = _yieldActL.createIndex(MfgActRecvIf_Upd02_ActLstR.$data_crud_typ, MfgActRecvIf_Upd02_ActLstR.$unschd_act_flg); 
		}

		protected MCList<MST_YIELD_ACT_RECV_IF_R> getYieldRecvL(MCList<IfDataImp_Upd01_DtlR> yieldL) {
			MCList<MST_YIELD_ACT_RECV_IF_R> recvL = MCList.create(MST_YIELD_ACT_RECV_IF_R.class);
			MST_YIELD_ACT_RECV_IF_R t = MST_YIELD_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder recvL_bldr = MCQueryApiBuilder.create(t);

			// 実績一括受信バッチから処理単位区分「まとめない」で実行されてきた場合のみ
			// 同一外部システムデータNOのレコードをまとめて処理する
			if (!isNull(yieldL) && up1().src_actlumprecv_flg() && !up1().exe_unit_lump_flg()) {
				recvL_bldr.setDistinct();
				recvL_bldr.setSelect(t.ext_data_no, t.ext_sys_cd);
				recvL_bldr.setWhere(t.imp_flg.eq(value(true)));
				recvL_bldr.addWhereWithCutOffAnd(t.data_lno.eq(bind("data_lno")));
				recvL_bldr.addWhereWithCutOffAnd(t.data_no.eq(bind("data_no")));
				recvL_bldr.addWhereWithCutOffAnd(t.ext_data_no.eq(bind("ext_data_no")));
				recvL_bldr.addWhereWithCutOffAnd(t.ext_sys_cd.eq(bind("ext_sys_cd")));
				dbSelect("MSLAL6220_MST_YIELD_ACT_RECV_IF_S01", recvL, recvL_bldr, yieldL);
			}

			return recvL;
		}

		/**
		 * 工程実績受信データの親となる下記の業務項目を特定する。<br>
		 *   ・工程指図ＮＯ、製造指図ＮＯ（未受信の場合）<br>
		 *   ・製造場所ＣＤ、製造棚・ラインＣＤ、工場・物流倉庫ＣＤ、ＷＧＣＤ、生産方法区分<br>
		 */
		protected void specOperCriticalItems() {
			if (isNull(_operActL)) {
				return;
			}

			for (MfgActRecvIf_Upd02_ActLstR aR : _operActL) {
				// エラーとなった受信実績と同じ「外部システムＣＤ、外部システムデータＮＯ」の行もエラーにする。
				if (isExtDataNoHasErr(aR)) {
					MCMessagePool.add(aR, null, MSLAL0078, aR.if_proc_typ(), aR.data_no(), aR.data_lno());
					setErrFlag(aR);
					continue;
				}

				// ＩＦ更新区分：エラー行まで登録の場合、エラーとなった受信実績以降の行を飛ばす
				if (MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ()) && isAfterErrExtDataNo(aR)) {
					continue;
				}

				// 工程指図ＮＯを特定する。
				String operInstNo = specOperInstNo(aR);

				// 工程指図ＮＯが特定出来た場合、ＯＫで、業務項目を特定し、設定する。
				if (!isNull(operInstNo)) {
					aR.oper_inst_no(operInstNo);
					specMfgItemsByOper(aR);
					checkRecvActIntegrity(aR);
					continue;
				}

				// 工程指図ＮＯが特定できない場合、エラーとする。
				if (!aR.err_flg()) {
					MCMessagePool.add(aR, null, MSLAL0084, aR.if_proc_typ(), aR.data_no(), aR.data_lno());
					setRowErr(aR);
				}
			}
		}

		/**
		 * 投入実績受信データの親となる下記の業務項目を特定する。<br>
		 *   ・工程指図ＮＯ、製造指図ＮＯ（未受信の場合）<br>
		 *   ・製造場所ＣＤ、製造棚・ラインＣＤ、工場・物流倉庫ＣＤ、ＷＧＣＤ、生産方法区分<br>
		 */
		protected void specInptCriticalItems() {
			if (isNull(_inptActL)) {
				return;
			}

			for (MfgActRecvIf_Upd02_ActLstR aR : _inptActL) {
				// エラーとなった受信実績と同じ「外部システムＣＤ、外部システムデータＮＯ」の行もエラーにする。
				if (isExtDataNoHasErr(aR)) {
					MCMessagePool.add(aR, null, MSLAL0078, aR.if_proc_typ(), aR.data_no(), aR.data_lno());
					setErrFlag(aR);
					continue;
				}

				// ＩＦ更新区分：エラー行まで登録の場合、エラーとなった受信実績以降の行を飛ばす
				if (MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ()) && isAfterErrExtDataNo(aR)) {
					continue;
				}

				// 工程指図ＮＯを特定する。（エラーとなった場合、スキップする）
				String operInstNo = specOperInstNo(aR);

				// 工程指図ＮＯが特定出来た場合、ＯＫで、業務項目を特定し、設定する。
				if (!isNull(operInstNo)) {
					aR.oper_inst_no(operInstNo);
					specMfgItemsByOper(aR);
					checkRecvActIntegrity(aR);
					continue;
				}

				// 工程指図ＮＯが特定できない場合、エラーとする。
				if (!aR.err_flg()) {
					MCMessagePool.add(aR, null, MSLAL0084, aR.if_proc_typ(), aR.data_no(), aR.data_lno());
					setRowErr(aR);
				}
			}
		}

		/**
		 * 工数実績受信データの親となる下記の業務項目を特定する。<br>
		 *   ・工程指図ＮＯ、製造指図ＮＯ（未受信の場合）<br>
		 *   ・製造場所ＣＤ、製造棚・ラインＣＤ、工場・物流倉庫ＣＤ、ＷＧＣＤ、生産方法区分<br>
		 */
		protected void specWkCriticalItems() {
			if (isNull(_wkActL)) {
				return;
			}

			for (MfgActRecvIf_Upd02_ActLstR aR : _wkActL) {
				// 取込対象外工数の場合、飛ばす。
				if (isNotImportWk(aR)) {
					aR.oper_inst_no(null);
					continue;
				}

				// エラーとなった受信実績と同じ「外部システムＣＤ、外部システムデータＮＯ」の行もエラーにする。
				if (isExtDataNoHasErr(aR)) {
					MCMessagePool.add(aR, null, MSLAL0078, aR.if_proc_typ(), aR.data_no(), aR.data_lno());
					setErrFlag(aR);
					continue;
				}

				// ＩＦ更新区分：エラー行まで登録の場合、エラーとなった受信実績以降の行を飛ばす
				if (MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ()) && isAfterErrExtDataNo(aR)) {
					continue;
				}

				// 工程指図ＮＯを特定する。（エラーとなった場合、スキップする）
				String operInstNo = specOperInstNo(aR);

				// 工程指図ＮＯが特定出来た場合、ＯＫで、業務項目を特定し、設定する。
				if (!isNull(operInstNo)) {
					aR.oper_inst_no(operInstNo);
					specMfgItemsByOper(aR);
					checkRecvActIntegrity(aR);
					continue;
				}

				// 工程指図ＮＯが特定できない場合、エラーとする。
				if (!aR.err_flg()) {
					MCMessagePool.add(aR, null, MSLAL0084, aR.if_proc_typ(), aR.data_no(), aR.data_lno());
					setRowErr(aR);
				}
			}
		}

		/**
		 * 出来高実績受信データの親となる下記の業務項目を特定する。<br>
		 *   ・工程指図ＮＯ、製造指図ＮＯ（未受信の場合）<br>
		 *   ・製造場所ＣＤ、製造棚・ラインＣＤ、工場・物流倉庫ＣＤ、ＷＧＣＤ、生産方法区分<br>
		 */
		protected void specYieldCriticalItems() {
			if (isNull(_yieldActL)) {
				return;
			}

			for (MfgActRecvIf_Upd02_ActLstR aR : _yieldActL) {
				// エラーとなった受信実績と同じ「外部システムＣＤ、外部システムデータＮＯ」の行もエラーにする。
				if (isExtDataNoHasErr(aR)) {
					MCMessagePool.add(aR, null, MSLAL0078, aR.if_proc_typ(), aR.data_no(), aR.data_lno());
					setErrFlag(aR);
					continue;
				}

				// ＩＦ更新区分：エラー行まで登録の場合、エラーとなった受信実績以降の行を飛ばす
				if (MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ()) && isAfterErrExtDataNo(aR)) {
					continue;
				}

				// 工程指図ＮＯを特定する。（エラーとなった場合、スキップする）
				String operInstNo = specOperInstNo(aR);

				// 工程指図ＮＯが特定出来た場合、ＯＫで、業務項目を特定し、設定する。
				if (!isNull(operInstNo)) {
					aR.oper_inst_no(operInstNo);
					specMfgItemsByOper(aR);
					checkRecvActIntegrity(aR);
					continue;
				}

				// 工程指図ＮＯが特定できない場合、エラーとする。
				if (!aR.err_flg()) {
					MCMessagePool.add(aR, null, MSLAL0084, aR.if_proc_typ(), aR.data_no(), aR.data_lno());
					setRowErr(aR);
				}
			}
		}

		protected void specMfgItemsByOper(MfgActRecvIf_Upd02_ActLstR aR) {
			if (isNull(aR.oper_inst_no()) || aR.err_flg()) {
				return;
			}

			MfgActRecvIf_Upd02_ActLstR instR = _operCrtlMap.get(aR.oper_inst_no());
			if (isNull(instR)) {
				MCList<MfgActRecvIf_Upd02_ActLstR> instL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
				executeQuery(instL, MSLAL6220_MST_ITM_MFG_INST_S05(), aR);
				if (!isNull(instL)) {
					instR = instL.get(0);
					_operCrtlMap.put(aR.oper_inst_no(), instR);
				}
			}

			if (!isNull(instR)) {
				// 製造場所、製造品目、改訂番号、工程に対して、データ整合性チェックを行う。
				aR.mfg_loc_cd_lasted(instR.mfg_loc_cd_lasted());		// 製造場所ＣＤ（最新）
				aR.site_cd_lasted(instR.site_cd_lasted());				// 工場・物流倉庫ＣＤ（最新）
				aR.wg_cd_lasted(instR.wg_cd_lasted());					// ワーキンググループＣＤ（最新）
				aR.mfg_mtd_typ_lasted(instR.mfg_mtd_typ_lasted());		// 生産方法区分（最新）
				aR.mfg_str_ln_cd_lasted(instR.mfg_str_ln_cd_lasted());	// 製造棚・ラインＣＤ（最新）
				aR.mfg_itm_cd_lasted(instR.mfg_itm_cd_lasted());		// 製造品目ＣＤ（最新）
				aR.mfg_itm_sub1_lasted(instR.mfg_itm_sub1_lasted());	// 製造品目枝番１（最新）
				aR.mfg_itm_sub2_lasted(instR.mfg_itm_sub2_lasted());	// 製造品目枝番２（最新）
				aR.mfg_itm_sub3_lasted(instR.mfg_itm_sub3_lasted());	// 製造品目枝番３（最新）
				aR.mfg_inst_no_lasted(instR.mfg_inst_no_lasted());		// 製造指図ＮＯ（最新）
				aR.mfg_inst_rev_lasted(instR.mfg_inst_rev_lasted());	// 製造指図改訂番号（最新）
				aR.oper_cd_lasted(instR.oper_cd_lasted());				// 工程ＣＤ（最新）
				aR.oper_seq_lasted(instR.oper_seq_lasted());			// 工程連番（最新）
				aR.unschd_act_flg(instR.unschd_act_flg());				// 計画外実績ＦＬＧ
			}
			else {
				// 工程指図ＮＯが正しくありません。
				MCMessagePool.add(aR, null, MSLAL0086, aR.if_proc_typ(), aR.data_no(), aR.data_lno(), aR.oper_inst_no());
				setRowErr(aR);
			}
		}

		/**
		 * 受信データの整合性チェックを行う。
		 * @param aR 外部実績
		 */
		protected void checkRecvActIntegrity(MfgActRecvIf_Upd02_ActLstR aR) {
			if (aR.err_flg()) {
				return;
			}

			// 製造指図ＮＯ
			if (!isNull(aR.mfg_inst_no()) && !isSame(aR.mfg_inst_no(), aR.mfg_inst_no_lasted())) {
				MCMessagePool.add(aR, null, MSLAL0087, aR.if_proc_typ(), aR.data_no(), aR.data_lno(), aR.mfg_inst_no(), aR.mfg_inst_no_lasted());
				setRowErr(aR);
				return;
			}
			else if (isNull(aR.mfg_inst_no())) {
				aR.mfg_inst_no(aR.mfg_inst_no_lasted());
			}

			// 製造指図改訂番号
			if (!isNull(aR.mfg_inst_rev()) && !isSame(aR.mfg_inst_rev(), aR.mfg_inst_rev_lasted())) {
				MCMessagePool.add(aR, null, MSLAL0088, aR.if_proc_typ(), aR.data_no(), aR.data_lno(), aR.mfg_inst_rev(), aR.mfg_inst_rev_lasted(), aR.mfg_inst_no());
				setRowErr(aR);
				return;
			}
			else if (isNull(aR.mfg_inst_rev())) {
				aR.mfg_inst_rev(aR.mfg_inst_rev_lasted());
			}

			// 製造場所
			if (!isNull(aR.mfg_loc_cd()) && !isSame(aR.mfg_loc_cd(), aR.mfg_loc_cd_lasted())) {
				MCMessagePool.add(aR, null, MSLAL0144, aR.if_proc_typ(), aR.data_no(), aR.data_lno(), aR.mfg_loc_cd(), aR.mfg_loc_cd_lasted(), aR.mfg_inst_no());
				setRowErr(aR);
				return;
			}
			else if (isNull(aR.mfg_loc_cd())) {
				aR.mfg_loc_cd(aR.mfg_loc_cd_lasted());
			}

			// 製造品目
			if (!isNull(aR.mfg_itm_cd()) && 
					(!isSame(aR.mfg_itm_cd(), aR.mfg_itm_cd_lasted()) || !isSame(aR.mfg_itm_sub1(), aR.mfg_itm_sub1_lasted()) || 
					 !isSame(aR.mfg_itm_sub2(), aR.mfg_itm_sub2_lasted()) || !isSame(aR.mfg_itm_sub3(), aR.mfg_itm_sub3_lasted()))) {
				MCMessagePool.add(aR, null, MSLAL0145, aR.if_proc_typ(), aR.data_no(), aR.data_lno(), 
						toDispItm(aR.mfg_itm_cd(), aR.mfg_itm_sub1(), aR.mfg_itm_sub2(), aR.mfg_itm_sub3()), 
						toDispItm(aR.mfg_itm_cd_lasted(), aR.mfg_itm_sub1_lasted(), aR.mfg_itm_sub2_lasted(), aR.mfg_itm_sub3_lasted()), 
						aR.mfg_inst_no());
				setRowErr(aR);
				return;
			}
			else if (isNull(aR.mfg_itm_cd())) {
				aR.mfg_itm_cd(aR.mfg_itm_cd_lasted());
				aR.mfg_itm_sub1(aR.mfg_itm_sub1_lasted());
				aR.mfg_itm_sub2(aR.mfg_itm_sub2_lasted());
				aR.mfg_itm_sub3(aR.mfg_itm_sub3_lasted());
			}

			// 工程ＣＤ
			if (!isNull(aR.oper_cd()) && !isSame(aR.oper_cd(), aR.oper_cd_lasted())) {
				MCMessagePool.add(aR, null, MSLAL0089, aR.if_proc_typ(), aR.data_no(), aR.data_lno(), aR.oper_cd(), aR.oper_cd_lasted(), aR.oper_inst_no());
				setRowErr(aR);
				return;
			}
			else if (isNull(aR.oper_cd())) {
				aR.oper_cd(aR.oper_cd_lasted());
			}

			// 工程連番
			if (!isNull(aR.oper_seq()) && !isNull(aR.oper_seq_lasted()) && !isSame(aR.oper_seq(), aR.oper_seq_lasted())) {
				MCMessagePool.add(aR, null, MSLAL0090, aR.if_proc_typ(), aR.data_no(), aR.data_lno(), aR.oper_seq(), aR.oper_seq_lasted(), aR.oper_inst_no());
				setRowErr(aR);
				return;
			}
			else if (isNull(aR.oper_seq())) {
				aR.oper_seq(aR.oper_seq_lasted());
			}
		}

		protected String specOperInstNo(MfgActRecvIf_Upd02_ActLstR aR) {
			
			// 計画外の場合、外部出来高実績ＮＯに紐づく出来高実績より各ＮＯを取得
			if (aR.unschd_act_flg() && !isNull(aR.ext_yield_act_no())) {
				MST_YIELD_ACT_R yieldActDBR = _yieldActDBL.getFirst(_yieldActDBLExtIdx, aR.ext_yield_act_no());
				if (!isNull(yieldActDBR)) {
					// 工程指図ＮＯ
					if (isNull(aR.oper_inst_no())) {
						aR.oper_inst_no(yieldActDBR.getStringNE("oper_inst_no"));
					}
					// 製造指図ＮＯ
					if (isNull(aR.mfg_inst_no())) {
						aR.mfg_inst_no(yieldActDBR.getStringNE("mfg_inst_no"));
					}
					// 製造指図改訂番号
					if (isNull(aR.div_seq())) {
						aR.div_seq(yieldActDBR.div_seq());
					}
				}
			}

			// 0. 工程指図ＮＯが受信された場合、ＯＫ
			if (!isNull(aR.oper_inst_no())) {
				return aR.oper_inst_no();
			}

			// 1. 工程指図ＮＯが業務データ代替キーで特定済の場合、ＯＫ
			String operInstNo = _innOperMap.get(crtOperAltrKey(aR));
			if (!isNull(operInstNo)) {
				return operInstNo;
			}

			// 2. 工程指図ＮＯが外部実績代替キーで特定済の場合、ＯＫ
			operInstNo = _extOperMap.get(crtExtAltrKey(aR));
			if (!isNull(operInstNo)) {
				return operInstNo;
			}

			// 3. 工程指図ＮＯが各予定ＮＯから特定できた場合、ＯＫ
			operInstNo = specOperBySchdNo(aR);
			if (!isNull(operInstNo) || aR.err_flg()) {
				return operInstNo;
			}

			// 4. 工程指図ＮＯが業務データ代替キーでＤＢから特定出来た場合、ＯＫ
			operInstNo = specOperByMfgAltrKey(aR);
			if (!isNull(operInstNo) || aR.err_flg()) {
				return operInstNo;
			}

			// 5. 工程指図ＮＯが外部実績代替キーでＤＢから特定出来た場合、ＯＫ
			operInstNo = specOperByExtAltrKey(aR);
			if (!isNull(operInstNo)) {
				return operInstNo;
			}

			// 6. もう一度、各予定ＮＯから特定（更新・取消データの場合も取得）
			operInstNo = specOperBySchdNoAgain(aR);
			if (!isNull(operInstNo)) {
				return operInstNo;
			}

			return null;
		}

		/**
		 * 受信実績中に、出来高予定ＮＯ／投入予定ＮＯ／工数予定ＮＯがあれば、<br>
		 * それを検索条件として、各予定テーブルから工程指図ＮＯを特定する。
		 * @param aR 外部実績
		 * @return 工程指図ＮＯ
		 */
		protected String specOperBySchdNo(MfgActRecvIf_Upd02_ActLstR aR) {
			if (!MAC_DATA_CRUD_TYP.isCRT(aR.data_crud_typ())) {
				return null;
			}

			if (!isNull(aR.inpt_schd_no())) {
				return specOperByInptSchd(aR);
			}
			if (!isNull(aR.wk_schd_no())) {
				return specOperByWkSchd(aR);
			}
			if (!isNull(aR.yield_schd_no())) {
				return specOperByYieldSchd(aR);
			}

			// 製造指図ＮＯ、品目ＣＤがあり、かつ、出来高の場合
			// 出来高予定ＮＯの特定ができれば、工程指図ＮＯも特定する。
			if (!isNull(aR.mfg_inst_no()) && !isNull(aR.itm_cd())) {
				if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(aR.if_proc_typ())) {
					return specOperByYieldItm(aR);
				}
			}

			return null;
		}

		/**
		 * 更新・取消のデータはspecOperBySchdNoメソッドでの取得対象とならない。
		 * ※specOperByExtAltrKeyメソッドでの取得対象となるため。
		 * ただし、新規データと更新データをほぼ同時に別スレッドで処理した場合、新規データが登録される前に
		 * specOperBySchdNoメソッドが呼ばれることがある。
		 * そのため、specOperByExtAltrKeyメソッドで取得できない場合は、もう一度予定ＮＯから取得する。
		 * 
		 * @param aR 外部実績
		 * @return 工程指図ＮＯ
		 */
		protected String specOperBySchdNoAgain(MfgActRecvIf_Upd02_ActLstR aR) {

			if (!isNull(aR.inpt_schd_no())) {
				return specOperByInptSchd(aR);
			}
			if (!isNull(aR.wk_schd_no())) {
				return specOperByWkSchd(aR);
			}
			if (!isNull(aR.yield_schd_no())) {
				return specOperByYieldSchd(aR);
			}

			// 製造指図ＮＯ、品目ＣＤがあり、かつ、出来高の場合
			// 出来高予定ＮＯの特定ができれば、工程指図ＮＯも特定する。
			if (!isNull(aR.mfg_inst_no()) && !isNull(aR.itm_cd())) {
				if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(aR.if_proc_typ())) {
					return specOperByYieldItm(aR);
				}
			}

			return null;
		}

		protected String specOperByInptSchd(MfgActRecvIf_Upd02_ActLstR aR) {
			MST_INPT_SCHD_R schdR = MST_INPT_SCHD_R.create();
			MST_INPT_SCHD_R t = MST_INPT_SCHD_R.create("T");
			MCQueryApiBuilder schdR_bldr = MCQueryApiBuilder.create(t);
			schdR_bldr.setSelect(t.oper_inst_no);
			dbSelectKey("MSLAL6220_MST_INPT_SCHD_S01", schdR, schdR_bldr, aR.inpt_schd_no());
			if (!isNull(schdR.oper_inst_no()) && !schdR.can_flg()) {
				_extOperMap.put(crtExtAltrKey(aR), schdR.oper_inst_no());
				if (hasValidMfgAltrKey(aR)) {
					_innOperMap.put(crtOperAltrKey(aR), schdR.oper_inst_no());
				}

				return schdR.oper_inst_no();
			}

			// 投入予定が削除された場合、エラーとなる。
			MCMessagePool.add(aR, null, MSLAL0091, aR.data_no(), aR.data_lno(), aR.inpt_schd_no());
			setRowErr(aR);

			return null;
		}

		protected String specOperByWkSchd(MfgActRecvIf_Upd02_ActLstR aR) {
			MST_WK_SCHD_R schdR = MST_WK_SCHD_R.create();
			MST_WK_SCHD_R t = MST_WK_SCHD_R.create("T");
			MCQueryApiBuilder schdR_bldr = MCQueryApiBuilder.create(t);
			schdR_bldr.setSelect(t.oper_inst_no);
			dbSelectKey("MSLAL6220_MST_WK_SCHD_S01", schdR, schdR_bldr, aR.wk_schd_no());
			if (!isNull(schdR.oper_inst_no()) && !schdR.can_flg()) {
				_extOperMap.put(crtExtAltrKey(aR), schdR.oper_inst_no());
				if (hasValidMfgAltrKey(aR)) {
					_innOperMap.put(crtOperAltrKey(aR), schdR.oper_inst_no());
				}

				return schdR.oper_inst_no();
			}

			// 工数予定が削除された場合、エラーとなる。
			MCMessagePool.add(aR, null, MSLAL0092, aR.data_no(), aR.data_lno(), aR.wk_schd_no());
			setRowErr(aR);

			return null;
		}

		protected String specOperByYieldSchd(MfgActRecvIf_Upd02_ActLstR aR) {
			MST_YIELD_SCHD_R schdR = MST_YIELD_SCHD_R.create();
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder schdR_bldr = MCQueryApiBuilder.create(t);
			schdR_bldr.setSelect(t.oper_inst_no);
			dbSelectKey("MSLAL6220_MST_YIELD_SCHD_S01", schdR, schdR_bldr, aR.yield_schd_no());
			if (!isNull(schdR.oper_inst_no()) && !schdR.can_flg()) {
				_extOperMap.put(crtExtAltrKey(aR), schdR.oper_inst_no());
				if (hasValidMfgAltrKey(aR)) {
					_innOperMap.put(crtOperAltrKey(aR), schdR.oper_inst_no());
				}

				return schdR.oper_inst_no();
			}

			// 出来高予定が削除された場合、エラーとなる。
			MCMessagePool.add(aR, null, MSLAL0093, aR.data_no(), aR.data_lno(), aR.yield_schd_no());
			setRowErr(aR);

			return null;
		}

		protected String specOperByYieldItm(MfgActRecvIf_Upd02_ActLstR aR) {
			MCList<MST_YIELD_SCHD_R> schdL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			schdL_bldr.setSelect(t.yield_schd_no);
			schdL_bldr.addSelect(t.oper_inst_no);
			schdL_bldr.setWhere(value(0).eq(value(0)));
			schdL_bldr.addWhereWithAnd(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			schdL_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
			schdL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			schdL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			schdL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			schdL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));

			int cnt = dbSelect("MSLAL6220_MST_YIELD_SCHD_S02", schdL, schdL_bldr, aR);
			if (cnt > 0) {
				MST_YIELD_SCHD_R schdR = schdL.get(0);
				aR.yield_schd_no(schdR.yield_schd_no());
				_extOperMap.put(crtExtAltrKey(aR), schdR.oper_inst_no());
				if (hasValidMfgAltrKey(aR)) {
					_innOperMap.put(crtOperAltrKey(aR), schdR.oper_inst_no());
				}

				return schdR.oper_inst_no();
			}

			return null;
		}

		/**
		 * 業務データ代替キーを検索条件として、工程指図テーブルから１つだけの工程指図ＮＯを特定する。
		 * @param aR 外部実績
		 * @return 工程指図ＮＯ
		 */
		protected String specOperByMfgAltrKey(MfgActRecvIf_Upd02_ActLstR aR) {
			if (!hasValidMfgAltrKey(aR)) {
				return null;
			}

			MCList<MST_OPER_INST_R> oiL = MCList.create(MST_OPER_INST_R.class);
			MST_OPER_INST_R t = MST_OPER_INST_R.create("T");
			MCQueryApiBuilder oiL_bldr = MCQueryApiBuilder.create(t);
			oiL_bldr.setSelect(t.oper_inst_no);
			oiL_bldr.setWhere(value(0).eq(value(0)));
			oiL_bldr.addWhereWithAnd(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			oiL_bldr.addWhereWithAnd(t.oper_cd.eq(bind("oper_cd")));
			oiL_bldr.addWhereWithAnd(t.oper_seq.eq(bind("oper_seq")));
			oiL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));

			int cnt = dbSelect("MSLAL6220_MST_OPER_INST_S01", oiL, oiL_bldr, aR);
			if (cnt < 1) {
				return null;
			}
			if (cnt > 1) {
				MCMessagePool.add(aR, null, MSLAL0085, aR.if_proc_typ(), aR.data_no(), aR.data_lno());
				setRowErr(aR);
				return null;
			}

			String operInstNo = oiL.get(0).oper_inst_no();
			_innOperMap.put(crtOperAltrKey(aR), operInstNo);
			_extOperMap.put(crtExtAltrKey(aR), operInstNo);

			return operInstNo;
		}

		/**
		 * 外部実績代替キー（外部実績ＮＯ＋外部システムＣＤ）を検索条件として、<br>
		 * 各実績テーブルから１つだけの工程指図ＮＯを特定する。<br>
		 * なお、データ更新区分：新規の場合、使えないため、何もしない。
		 * @param aR 外部実績
		 * @return 工程指図ＮＯ
		 */
		protected String specOperByExtAltrKey(MfgActRecvIf_Upd02_ActLstR aR) {
			// データ更新区分：新規の場合、実績がないはず。（但し、ロスなら、実績があるかも）
			if (MAC_DATA_CRUD_TYP.isCRT(aR.data_crud_typ()) &&
					!(MSC_IF_INPT_TYP.isLOSS(aR.if_inpt_typ()) || MSC_IF_INPT_TYP.isFXD_LOSS(aR.if_inpt_typ()))) {
				return null;
			}

			String operInstNo = null;

			if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(aR.if_proc_typ())) {
				operInstNo = specOperFromOperAct(aR);
			}
			else if (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(aR.if_proc_typ())) {
				operInstNo = specOperFromInptAct(aR);
			}
			else if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(aR.if_proc_typ())) {
				operInstNo = specOperFromWkAct(aR);
			}
			else if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(aR.if_proc_typ())) {
				operInstNo = specOperFromYieldAct(aR);
			}

			if (!isNull(operInstNo)) {
				_extOperMap.put(crtExtAltrKey(aR), operInstNo);
				if (hasValidMfgAltrKey(aR)) {
					_innOperMap.put(crtOperAltrKey(aR), operInstNo);
				}
			}

			return operInstNo;
		}

		protected String specOperFromOperAct(MfgActRecvIf_Upd02_ActLstR aR) {
			String operInstNo = null;

			if (isNull(aR.oper_act_no())) {
				MCList<MST_OPER_ACT_R> operActL = MCList.create(MST_OPER_ACT_R.class);
				MST_OPER_ACT_R t = MST_OPER_ACT_R.create("T");
				MCQueryApiBuilder operActL_bldr = MCQueryApiBuilder.create(t);
				operActL_bldr.setSelect(t.oper_inst_no);
				operActL_bldr.addSelect(t.oper_act_no);
				operActL_bldr.setWhere(t.ext_oper_act_no.eq(bind("1")), aR.ext_oper_act_no());
				operActL_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), aR.ext_sys_cd());
				operActL_bldr.setOrderByAsc(t.oper_act_no);
				int cnt = dbSelect("MSLAL6220_MST_OPER_ACT_S01", operActL, operActL_bldr);
				if (cnt > 0) {
					aR.oper_act_no(operActL.get(0).oper_act_no());
					operInstNo = operActL.get(0).oper_inst_no();
				}
			}
			else {
				MST_OPER_ACT_R operActR = MST_OPER_ACT_R.create();
				MST_OPER_ACT_R t = MST_OPER_ACT_R.create("T");
				MCQueryApiBuilder operActR_bldr = MCQueryApiBuilder.create(t);
				operActR_bldr.setSelect(t.oper_inst_no);
				dbSelectKey("MSLAL6220_MST_OPER_ACT_S02", operActR, operActR_bldr, aR.oper_act_no());
				operInstNo = operActR.oper_inst_no();
			}

			return operInstNo;
		}

		protected String specOperFromInptAct(MfgActRecvIf_Upd02_ActLstR aR) {
			// 投入の工程実績ＮＯの特定
			MCList<MST_INPT_ACT_R> inptActL = MCList.create(MST_INPT_ACT_R.class);
			MST_INPT_ACT_R t = MST_INPT_ACT_R.create("T");
			MCQueryApiBuilder inptActL_bldr = MCQueryApiBuilder.create(t);
			inptActL_bldr.setSelect(t.inpt_act_no);
			inptActL_bldr.addSelect(t.oper_act_no);
			inptActL_bldr.addSelect(t.inpt_schd_no);
			inptActL_bldr.setWhere(t.ext_inpt_act_no.eq(bind("1")), aR.ext_inpt_act_no());
			inptActL_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), aR.ext_sys_cd());
			inptActL_bldr.setOrderByAsc(t.inpt_act_no);
			int cnt = dbSelect("MSLAL6220_MST_INPT_ACT_S01", inptActL, inptActL_bldr);

			if (cnt > 0) {
				MST_INPT_ACT_R inptActR = inptActL.get(0);
				aR.inpt_act_no(inptActR.inpt_act_no());
				aR.oper_act_no(inptActR.oper_act_no());
				aR.inpt_schd_no(inptActR.inpt_schd_no());
				return specOperFromOperAct(aR);
			}

			return null;
		}

		protected String specOperFromWkAct(MfgActRecvIf_Upd02_ActLstR aR) {
			// 工数の工程実績ＮＯの特定
			MCList<MST_WK_ACT_R> wkActL = MCList.create(MST_WK_ACT_R.class);
			MST_WK_ACT_R t = MST_WK_ACT_R.create("T");
			MCQueryApiBuilder wkActL_bldr = MCQueryApiBuilder.create(t);
			wkActL_bldr.setSelect(t.wk_act_no);
			wkActL_bldr.addSelect(t.oper_act_no);
			wkActL_bldr.addSelect(t.wk_schd_no);
			wkActL_bldr.setWhere(t.ext_wk_act_no.eq(bind("1")), aR.ext_wk_act_no());
			wkActL_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), aR.ext_sys_cd());
			wkActL_bldr.setOrderByAsc(t.wk_act_no);
			int cnt = dbSelect("MSLAL6220_MST_WK_ACT_S01", wkActL, wkActL_bldr);

			if (cnt > 0) {
				MST_WK_ACT_R wkActR = wkActL.get(0);
				aR.wk_act_no(wkActR.wk_act_no());
				aR.oper_act_no(wkActR.oper_act_no());
				aR.wk_schd_no(wkActR.wk_schd_no());
				return specOperFromOperAct(aR);
			}

			return null;
		}

		protected String specOperFromYieldAct(MfgActRecvIf_Upd02_ActLstR aR) {
			// 出来高の工程実績ＮＯの特定
			MCList<MST_YIELD_ACT_R> yieldActL = MCList.create(MST_YIELD_ACT_R.class);
			MST_YIELD_ACT_R t = MST_YIELD_ACT_R.create("T");
			MCQueryApiBuilder yieldActL_bldr = MCQueryApiBuilder.create(t);
			yieldActL_bldr.setSelect(t.yield_act_no);
			yieldActL_bldr.addSelect(t.oper_act_no);
			yieldActL_bldr.addSelect(t.yield_schd_no);
			yieldActL_bldr.setWhere(t.ext_yield_act_no.eq(bind("1")), aR.ext_yield_act_no());
			yieldActL_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), aR.ext_sys_cd());
			yieldActL_bldr.setOrderByAsc(t.yield_act_no);
			int cnt = dbSelect("MSLAL6220_MST_YIELD_ACT_S02", yieldActL, yieldActL_bldr);

			if (cnt > 0) {
				MST_YIELD_ACT_R yieldActR = yieldActL.get(0);
				aR.yield_act_no(yieldActR.yield_act_no());
				aR.oper_act_no(yieldActR.oper_act_no());
				aR.yield_schd_no(yieldActR.yield_schd_no());
				return specOperFromOperAct(aR);
			}

			return null;
		}

		/**
		 * 分割連番は「2」以上、または、指図外工数の場合、取込対象外とみなす。
		 * @param aR 外部工数実績
		 * @return true:取込外工数 , false:指図工数
		 */
		protected boolean isNotImportWk(MfgActRecvIf_Upd02_ActLstR aR) {
			// 分割連番は「2」以上のデータを無視する。
			if (!isNull(aR.div_seq()) && aR.div_seq().gt(MCNumber.ONE)) {
				return true;
			}

			if (!isNull(aR.wk_schd_no())) {
				return false;
			}
			if (!isNull(aR.oper_inst_no())) {
				return false;
			}
			if (!isNull(aR.mfg_inst_no())) {
				return false;
			}

			if (!MAC_DATA_CRUD_TYP.isCRT(aR.data_crud_typ())) {
				String operInstNo = specOperFromWkAct(aR);
				if (!isNull(operInstNo)) {
					aR.oper_inst_no(operInstNo);
					return false;
				}
			}
			


			return true;
		}

		/**
		 * 外部受信実績の代替キー（実績種類＋外部システムＣＤ＋外部実績ＮＯ）を生成する
		 * @param aR 外部実績
		 * @return 外部実績の代替キー
		 */
		protected String crtExtAltrKey(MfgActRecvIf_Upd02_ActLstR aR) {
			StringBuilder sb = new StringBuilder();

			sb.append(aR.if_proc_typ());
			sb.append(MAC_STR.CD_NM_DLM.value());
			sb.append(aR.ext_sys_cd());
			sb.append(MAC_STR.CD_NM_DLM.value());

			if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(aR.if_proc_typ())) {
				sb.append(aR.ext_oper_act_no());
			}
			else if (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(aR.if_proc_typ())) {
				sb.append(aR.ext_inpt_act_no());
			}
			else if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(aR.if_proc_typ())) {
				sb.append(aR.ext_wk_act_no());
			}
			else if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(aR.if_proc_typ())) {
				sb.append(aR.ext_yield_act_no());
			}

			return sb.toString();
		}

		/**
		 * 工程の業務データ代替キー（製造指図ＮＯ＋工程ＣＤ＋工程連番）を生成する。
		 * @param aR 外部実績
		 * @return 工程の業務データ代替キー
		 */
		protected String crtOperAltrKey(MfgActRecvIf_Upd02_ActLstR aR) {
			if (!hasValidMfgAltrKey(aR)) {
				return MAC_STR.NULL_VAL.value();
			}
			StringBuilder sb = new StringBuilder();

			sb.append(aR.mfg_inst_no());
			sb.append(MAC_STR.CD_NM_DLM.value());
			sb.append(aR.oper_cd());
			sb.append(MAC_STR.CD_NM_DLM.value());
			sb.append(aR.oper_seq().toSimpleString());

			return sb.toString();
		}

		/**
		 * 工程の有効な業務データ代替キーは存在しているかをチェックする。
		 * @param aR 外部実績
		 * @return boolean true: 有効な代替キーがあり, false: 有効な代替キーが存在しない
		 */
		protected boolean hasValidMfgAltrKey(MfgActRecvIf_Upd02_ActLstR aR) {
			if (aR == null || isNull(aR.mfg_inst_no()) || isNull(aR.oper_cd()) || isNull(aR.oper_seq())) {
				return false;
			}

			return true;
		}

		/**
		 * 受信データの登録処理
		 */
		protected void procActReg() {
			// 全登録実績対象を得る。
			getAllRegActLst();
			// 実績登録処理を実行する。
			callMfgActRecvIfUpd03();
		}

		/**
		 * すべての受信実績登録対象を得る。（スキップ行を除く）
		 */
		protected void getAllRegActLst() {
			getRegLstNoSkipRow(_operActL);
			getRegLstNoSkipRow(_inptActL);
			getRegLstNoSkipRow(_wkActL);
			getRegLstNoSkipRow(_yieldActL);

			setSkipForRecvExcluded();
		}

		protected void getRegLstNoSkipRow(MCList<MfgActRecvIf_Upd02_ActLstR> actL) {
			// エラーなし、かつ、工程指図ＮＯ、外部出来高実績ＮＯもない行を飛ばす。
			for (MfgActRecvIf_Upd02_ActLstR actR : actL) {
				// 1. 工数実績の場合、取込対象外の行を無視する。
				if (!actR.err_flg()
						&& ((isNull(actR.oper_inst_no())
								&& isNull(actR.ext_yield_act_no()))
						|| (!isNull(actR.ext_yield_act_no())
								&& isNull(actR.oper_inst_no())))) {
					_totalNum--;
					continue;
				}
				// 2. エラー行まで登録の場合、エラー行より後ろにある行
				if (MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ()) && isAfterErrExtDataNo(actR)) {
					_totalNum--;
					continue;
				}

				// エラーとなった受信実績と同じ「外部システムＣＤ、外部システムデータＮＯ」の行もエラーにする。
				if (!actR.err_flg() && isExtDataNoHasErr(actR)) {
					MCMessagePool.add(actR, null, MSLAL0078, actR.if_proc_typ(), actR.data_no(), actR.data_lno());
					setErrFlag(actR);
				}

				// 計画外実績の新規の投入実績ＩＦ、工数実績ＩＦの場合
				if (!actR.err_flg() && MAC_DATA_CRUD_TYP.isCRT(actR.data_crud_typ())
						&& (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(actR.if_proc_typ())
						|| MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(actR.if_proc_typ()))) {
					// 出来高実績IFで同一外部出来高実績ＮＯのレコードにエラーが起きていた場合はエラーにする
					if (isExtYieldActNoHasErr(actR)) {
						MCMessagePool.add(actR, null, MSLAL0631, actR.if_proc_typ(), actR.data_no(), actR.data_lno(), actR.ext_yield_act_no());
						setErrFlag(actR);
					}
				}

				if (actR.err_flg()) {
					_errActL.add(actR);
					continue;
				}

				_allActL.add(actR);
			}
		}

		/**
		 * 外部出来高実績ＮＯが同じ出来高実績ＩＦがエラーかチェック
		 * @param aR
		 * @return エラーの場合：true
		 */
		protected boolean isExtYieldActNoHasErr(MfgActRecvIf_Upd02_ActLstR aR) {
			if (!_yieldActL.isEmpty()) {
				// 計画外実績で同一外部出来高実績ＮＯを持つ出来高実績ＩＦがエラーの場合はエラー
				MfgActRecvIf_Upd02_ActLstR yieldActR = _yieldActL.getFirst(_yieldActLIdx, aR.ext_yield_act_no(), true);
				if (!isNull(yieldActR) && yieldActR.err_flg()) {
					return true;
				}
			}
			return false;
		}

		protected void writeErrLog() {
			MCMessageList msgList = MCMessagePool.getMessageList();
			logger().writeDataLog(msgList);
		}

		/**
		 * ＩＦ制御マスタの設定により、<br>
		 *  受信対象外の場合、スキップフラグを設定する。
		 */
		protected void setSkipForRecvExcluded() {
			if (isNull(_allActL)) {
				return;
			}

			MCList<MfgActRecvIf_Upd02_ActLstR> recvTgtL = getRecvTargetL(_allActL.groupBy(getRecvTgtGrpPolicy()));

			MCIndexKey rtIdx = recvTgtL.createIndex(getRecvTgtKeyCols());
			for (MfgActRecvIf_Upd02_ActLstR actR : _allActL) {
				MfgActRecvIf_Upd02_ActLstR rtR = recvTgtL.getFirst(rtIdx, getRecvTgtKeyVals(actR));
				if (rtR == null) {
					actR.skip_by_if_ctl_flg(true);
				}
			}
		}

		protected MCList<MfgActRecvIf_Upd02_ActLstR> getRecvTargetL(MCList<MfgActRecvIf_Upd02_ActLstR> dstctL) {
			MCList<MfgActRecvIf_Upd02_ActLstR> rtL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);

			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 ope = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

			MCNumber pegNo = MCNumber.ZERO;
			Map<MCNumber, MfgActRecvIf_Upd02_ActLstR> condM = new HashMap<MCNumber, MfgActRecvIf_Upd02_ActLstR>();
			for (MfgActRecvIf_Upd02_ActLstR dstctR : dstctL) {
				SCMLinkUtil_Srch01_CndR upR = ope.up0().add();
				upR.peg_no(pegNo);
				upR.if_proc_typ(dstctR.if_proc_typ());
				upR.loc_cd(dstctR.mfg_loc_cd());
				upR.oper_cd(dstctR.oper_cd());
				if (!MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(dstctR.if_proc_typ())) {
					upR.itm_cd(dstctR.mfg_itm_cd());
					upR.itm_sub1(dstctR.mfg_itm_sub1());
					upR.itm_sub2(dstctR.mfg_itm_sub2());
					upR.itm_sub3(dstctR.mfg_itm_sub3());
				}
				else {
					upR.wk_cost_cd(dstctR.wk_cost_cd());
				}
				upR.master_dt(dstctR.recv_dt());

				condM.put(pegNo, dstctR);
				pegNo = pegNo.add(1);
			}

			ope.exec();

			for (SCMLinkUtil_Srch01_CndR r : ope.down0()) {
				if (isNull(r.ext_sys_cd())) {
					continue;
				}

				if (condM.containsKey(r.peg_no())) {
					MfgActRecvIf_Upd02_ActLstR condR = condM.get(r.peg_no());
					rtL.add(condR);
				}
			}

			return rtL;
		}

		protected MCGroupByPolicy getRecvTgtGrpPolicy() {
			MCGroupByPolicy gbp = new MCGroupByPolicy(getRecvTgtKeyCols());

			return gbp;
		}

		protected String[] getRecvTgtKeyCols() {
			return new String[] {
					MfgActRecvIf_Upd02_ActLstR.$if_proc_typ
					, MfgActRecvIf_Upd02_ActLstR.$recv_dt
					, MfgActRecvIf_Upd02_ActLstR.$mfg_loc_cd
					, MfgActRecvIf_Upd02_ActLstR.$mfg_itm_cd
					, MfgActRecvIf_Upd02_ActLstR.$mfg_itm_sub1
					, MfgActRecvIf_Upd02_ActLstR.$mfg_itm_sub2
					, MfgActRecvIf_Upd02_ActLstR.$mfg_itm_sub3
					, MfgActRecvIf_Upd02_ActLstR.$oper_cd
					, MfgActRecvIf_Upd02_ActLstR.$wk_cost_cd
			};
		}

		protected Comparable<?>[] getRecvTgtKeyVals(MfgActRecvIf_Upd02_ActLstR actR) {
			return new Comparable<?>[] {
					actR.if_proc_typ()
					, actR.recv_dt()
					, actR.mfg_loc_cd()
					, actR.mfg_itm_cd()
					, actR.mfg_itm_sub1()
					, actR.mfg_itm_sub2()
					, actR.mfg_itm_sub3()
					, actR.oper_cd()
			};
		}

		/**
		 * 受信データの登録処理
		 */
		protected void callMfgActRecvIfUpd03() {
			if (isNull(_allActL) && isNull(_errActL)) {
				return;
			}

			// スレッドを分割しない
			if (!isMultiThread()) {
				callSnglMfgActRecvIfUpd03();
				return;
			}

			// マルチスレッド分割実行
			callMutliMfgActRecvIfUpd03();
		}

		protected boolean isMultiThread() {
			if (isNull(_allActL)) {
				return false;
			}

			if (MCServerThreadManager.getLimitThreadSize() <= 1) {
				return false;
			}

			// 実績一括受信バッチではIF更新区分が「エラーを無視して登録」の場合のみ、マルチスレッド実行を許可する
			if (up1().src_actlumprecv_flg() && MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ())) {
				return false;
			}

			return true;
		}

		protected void callSnglMfgActRecvIfUpd03() {
			List<MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd03> opeL = new ArrayList<>();

			// 並び替え
			sort();

			// 設定
			MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd03 upd03 = getOpe();
			upd03._no = object(MSLAL_SCMActRecvIfService.class)._execNo;
			upd03._errKeyMap = _errKeyMap;
			upd03._errActL = _errActL;
			upd03.up0().setAll(_allActL);
			upd03.up1().if_upd_typ(up1().if_upd_typ());
			upd03.up1().src_actlumprecv_flg(up1().src_actlumprecv_flg());
			upd03.up1().not_bkf_upd_flg(up1().not_bkf_upd_flg());

			opeL.add(upd03);

			// 実行
			MCServerThreadManager.setUseMainDBTran(true);
			MCServerThreadManager.invokeAndWait(1, opeL, FXBAL_BatchLogManager.class, MSLAL_SCMActRecvIfService.class);

			// 製造実績取込の結果：数量集計
			_okNum += opeL.get(0).down0().ok_num().intValue();
			_errNum += opeL.get(0).down0().err_num().intValue();
			_skipNum += opeL.get(0).down0().skip_num().intValue();
			_totalNum += opeL.get(0).down0().total_num().intValue();
		}

		protected void callMutliMfgActRecvIfUpd03() {
			int no = object(MSLAL_SCMActRecvIfService.class)._execNo;

			List<MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd03> opeL = new ArrayList<>();

			// 1. 製造実績取込の準備：親品目（par_itm_cd, par_itm_sub1-3）ごとにスレッドを分割する。
			boolean firstFlg = true;
			for (MCList<MfgActRecvIf_Upd02_ActLstR> grpL : _allActL.groupList(
																MfgActRecvIf_Upd02_ActLstR.$mfg_itm_cd, 
																MfgActRecvIf_Upd02_ActLstR.$mfg_itm_sub1, 
																MfgActRecvIf_Upd02_ActLstR.$mfg_itm_sub2, 
																MfgActRecvIf_Upd02_ActLstR.$mfg_itm_sub3)) {
				MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd03 upd03 = getOpe();

				// 設定
				upd03._no = no++;
				upd03._errKeyMap = _errKeyMap;
				if (firstFlg) {
					firstFlg = false;
					upd03._errActL = _errActL;
				}
				upd03.up0().setAll(grpL);
				upd03.up1().if_upd_typ(up1().if_upd_typ());
				upd03.up1().src_actlumprecv_flg(up1().src_actlumprecv_flg());
				upd03.up1().not_bkf_upd_flg(up1().not_bkf_upd_flg());

				opeL.add(upd03);
			}

			// 件数の多いスレッドを優先に実行する。
			Collections.sort(opeL, new Comparator<MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd03>() {
				public int compare(MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd03 o1, MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd03 o2) {
					return (o1.up0().size() - o2.up0().size()) * -1;	// 降順
				}
			});

			// 2. 製造実績取込の実行：マルチスレッド分割
			MCServerThreadManager.setCommitAndRollback(true);
			MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class, MSLAL_SCMActRecvIfService.class);

			// 3. 製造実績取込の結果：数量集計
			for (MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd03 ope : opeL) {
				_okNum += ope.down0().ok_num().intValue();
				_errNum += ope.down0().err_num().intValue();
				_skipNum += ope.down0().skip_num().intValue();
				_totalNum += ope.down0().total_num().intValue();
			}

			// 呼出元のサービス実行番号に戻す
			object(MSLAL_SCMActRecvIfService.class)._execNo = no;
		}

		protected MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd03 getOpe() {
			return MSLAL_MfgActRecvIfService.crtMfgActRecvIf_Upd03();
		}

		protected void setRowErr(MfgActRecvIf_Upd02_ActLstR aR) {
			setErrFlag(aR);
			setErrKeyMap(aR);
		}

		protected void setErrFlag(MfgActRecvIf_Upd02_ActLstR aR) {
			// エラーＦＬＧ設定
			aR.err_flg(true);
			aR.imp_flg(true);
			aR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
		}

		protected void setErrKeyMap(MfgActRecvIf_Upd02_ActLstR aR) {
			// エラー発生受信実績キーの設定
			TreeSet<MCNumber> valL = _errKeyMap.get(aR.ext_sys_cd());
			if (valL == null) {
				valL = new TreeSet<MCNumber>();
			}

			valL.add(aR.ext_data_no());
			_errKeyMap.put(aR.ext_sys_cd(), valL);
		}

		protected boolean isExtDataNoHasErr(MfgActRecvIf_Upd02_ActLstR aR) {
			TreeSet<MCNumber> valL = _errKeyMap.get(aR.ext_sys_cd());
			if (valL == null) {
				return false;
			}

			return valL.contains(aR.ext_data_no());
		}

		protected boolean isAfterErrExtDataNo(MfgActRecvIf_Upd02_ActLstR aR) {
			TreeSet<MCNumber> valL = _errKeyMap.get(aR.ext_sys_cd());
			if (valL == null || valL.isEmpty()) {
				return false;
			}

			return aR.ext_data_no().gt(valL.first());
		}

		/**
		 * 並び替え：<br>
		 * 「送信元レコード作成日時、外部システムＣＤ、外部システムデータＮＯ、外部システムデータ行ＮＯ」
		 */
		protected void sort() {
			// 並び順はＳＣＭ実績受信ＩＦ一括取込と合わせる
			_allActL.sort(
					MfgActRecvIf_Upd02_ActLstR.$data_make_dt,
					MfgActRecvIf_Upd02_ActLstR.$ext_sys_cd,
					MfgActRecvIf_Upd02_ActLstR.$ext_data_no,
					MfgActRecvIf_Upd02_ActLstR.$ext_data_lno
			);
		}

		/**
		 * 初期処理
		 */
		protected void initProc() {
			initLogger();

			editIfUpdTyp();

			checkUpItems();
		}

		/**
		 * バッチログを初期化する。
		 */
		protected void initLogger() {
			if (up1().src_actlumprecv_flg()) {
				return;
			}

			// カレントLoggerがnullの場合（呼出元からLoggerを引き継がない場合）は新規
			if (loggerNE() == null) {
				_crtNewLogger = true;
			}
			getConcurrentLogger();
		}

		/**
		 * ＩＦ更新区分：エラーを無視して登録かエラー行まで登録かにする。
		 */
		protected void editIfUpdTyp() {
			if (isNull(up1().if_upd_typ())) {
				up1().if_upd_typ(MAC_IF_UPD_TYP.SKIP_ERROR.value());
			}
			else if (!MAC_IF_UPD_TYP.isSKIP_ERROR(up1().if_upd_typ())) {
				up1().if_upd_typ(MAC_IF_UPD_TYP.STOP_ERROR.value());
			}
		}

		/**
		 * 上り電文の指定チェックを行う。
		 */
		protected void checkUpItems() {
			MCMessagePool.clear();

			for (IfDataImp_Upd01_DtlR uR : up0()) {
				if (!isNullAnd(uR.data_lno(), uR.data_no())) {
					// データ行ＮＯ、データＮＯのいずれかが設定されている場合、 ＩＦ処理区分の必須チェック
					MCMessagePool.addAll(check(uR, IfDataImp_Upd01_DtlR.$if_proc_typ, new FXUCL_RequiredValidater()));
				}

			}

			throwErr(msgOpeErr());
		}

		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {
			if (up1().src_actlumprecv_flg()) {
				return;
			}

			logger().writeStartLog(MSLAL0069);
			pushStartLog(logger());
		}

		/**
		 * 例外処理
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

			if (!up1().src_actlumprecv_flg()) {
				logger().writeProcessLog(mcEx);
			}

			_exceptionFlg = true;

			throw mcEx;
		}

		/**
		 * 終了ログを出力する。
		*/
		protected void writeEndLog() {
			if (up1().src_actlumprecv_flg()) {
				return;
			}

			if (_errNum > 0 || _exceptionFlg) {
				logger().writeProcessLog(MAUDL0009);
				MCMessagePool.add(MAUDL0009);
				pushErrorLog(logger());
			}
			else if (_totalNum == 0) {
				logger().writeProcessLog(MAUDL0008);
				MCMessagePool.add(MAUDL0008);
			}

			logger().writeEndLog(MSLAL0070, _totalNum, _okNum, _errNum, _skipNum);
			pushEndLog(logger());
			// Loggerを新規作成した場合（呼出元からLoggerを引き継がない場合）のみクローズ
			if (_crtNewLogger) {
				logger().close();
			}
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			// Upd02で発生したエラーメッセージを出力する（Upd03へMessagePoolが引き継がれないため）
			writeErrLog();
			down0().total_num(_totalNum);
			down0().ok_num(_okNum);
			down0().err_num(_errNum);
			down0().skip_num(_skipNum);
		}
	}

	/**
	 * MfgActRecvIf_Upd03オペレーション.<p>
	 *
	 * 製造実績（工程・投入・工数・出来高）受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	public class MfgActRecvIf_Upd03 extends MSLAL_MfgActRecvIfService_MC_A.MfgActRecvIf_Upd03 {
		/** 処理対象件数 **/
		protected int _totalNum = 0;
		/** 登録件数（正常終了件数） **/
		protected int _okNum = 0;
		/** エラー件数 **/
		protected int _errNum = 0;
		/** 未処理件数 **/
		protected int _skipNum = 0;

		/** エラー発生製造指図ＮＯセット **/
		protected Set<String> _errMfgInstNoS = new HashSet<String>();

		/**
		 * バッチログのlogger<br>
		 * MfgActRecvIf_Upd04バッチ呼び出しオペレーションから引き継ぐ
		 */
		protected FXBAL_BatchLogger _logger = null;

		/** 工程実績受信ＩＦ **/
		protected MCList<MST_OPER_ACT_RECV_IF_R> _operActIFL = null;
		protected MST_OPER_ACT_RECV_IF_R _operActIFL_t = MST_OPER_ACT_RECV_IF_R.create("T");
		protected MCQueryApiBuilder _operActIFL_bldr = MCQueryApiBuilder.create(_operActIFL_t);
		/** 工程実績受信ＩＦインデックス **/
		protected MCIndexKey _operActIFIdx = null;
		/** 投入実績受信ＩＦ **/
		protected MCList<MST_INPT_ACT_RECV_IF_R> _inptActIFL = null;
		protected MST_INPT_ACT_RECV_IF_R _inptActIFL_t = MST_INPT_ACT_RECV_IF_R.create("T");
		protected MCQueryApiBuilder _inptActIFL_bldr = MCQueryApiBuilder.create(_inptActIFL_t);
		/** 投入実績受信ＩＦインデックス **/
		protected MCIndexKey _inptActIFIdx = null;
		/** 工数実績受信ＩＦ **/
		protected MCList<MST_WK_ACT_RECV_IF_R> _wkActIFL = null;
		protected MST_WK_ACT_RECV_IF_R _wkActIFL_t = MST_WK_ACT_RECV_IF_R.create("T");
		protected MCQueryApiBuilder _wkActIFL_bldr = MCQueryApiBuilder.create(_wkActIFL_t);
		/** 工数実績受信ＩＦインデックス **/
		protected MCIndexKey _wkActIFIdx = null;
		/** 出来高実績受信ＩＦ **/
		protected MCList<MST_YIELD_ACT_RECV_IF_R> _yieldActIFL = null;
		protected MST_YIELD_ACT_RECV_IF_R _yieldActIFL_t = MST_YIELD_ACT_RECV_IF_R.create("T");
		protected MCQueryApiBuilder _yieldActIFL_bldr = MCQueryApiBuilder.create(_yieldActIFL_t);
		/** 出来高実績受信ＩＦインデックス **/
		protected MCIndexKey _yieldActIFIdx = null;

		/**
		 * インスタンス生成元（MfgActRecvIf_Upd03）でスレッド間でユニークな値を設定
		 */
		protected int _no = 0;

		/** 受信実績登録ＯＫリスト **/
		protected MCList<MfgActRecvIf_Upd02_ActLstR> _okActL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
		/** 受信実績スキップリスト **/
		protected MCList<MfgActRecvIf_Upd02_ActLstR> _skipActL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
		/** 受信実績エラーリスト **/
		protected MCList<MfgActRecvIf_Upd02_ActLstR> _errActL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
		/** エラー発生受信実績キーＭａｐ（キー：外部システムＣＤ、値：外部システムデータＮＯリスト「昇順」） **/
		protected Map<String, TreeSet<MCNumber>> _errKeyMap = new HashMap<String, TreeSet<MCNumber>>();

		/** 製造指図・製造実績マップ（キー：製造指図ＮＯ、値：製造実績ＮＯ） **/
		protected Map<String, String> _instActNoMap = new HashMap<String, String>();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initProc();

				// 実績登録
				procActReg();

				// 工程完了
				cmplOperAct();

				setDown();
			}
			finally {
				closeLogger();
			}
		}

		/**
		 * 製造実績受信ＩＦ取込処理を実行する。
		 */
		protected void procActReg() {
			if (up0().isEmpty()) {
				afterCall();
				return;
			}

			// 並び替えた方が後続の取込処理の効率が良いが、
			// 実績一括取込から「エラー行まで登録」で呼び出された場合は、取込順を優先するため並び替えない
			if ( !(up1().src_actlumprecv_flg() && MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ())) ) {
				up0().sort(getActRegSortPolicy());
			}

			// 実績登録処理の組み分け
			List<MCList<MfgActRecvIf_Upd02_ActLstR>> raArray = getRegActArray();
			if (raArray.isEmpty()) {
				afterCall();
				return;
			}

			// 実績登録処理の呼び出し
			for (MCList<MfgActRecvIf_Upd02_ActLstR> subL : raArray) {
				dealWithRegActArray(subL);
			}
		}

		/**
		 * まとめ可能なデータを集めてから、実績登録処理を呼び出す。
		 * @param subL 実績登録対象データの組
		 */
		protected void dealWithRegActArray(MCList<MfgActRecvIf_Upd02_ActLstR> subL) {
			// 製造指図ＮＯ、受信実績種類でソートする
			subL.sort(getMfgInstSortPolicy());

			MCList<MfgActRecvIf_Upd02_ActLstR> tgtL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);

			boolean isMfgOK = true;
			MfgActRecvIf_Upd02_ActLstR hdrR = MfgActRecvIf_Upd02_ActLstR.create();
			for (MfgActRecvIf_Upd02_ActLstR actR : subL) {
				// 同一キーで、新しいデータが取り込む場合、スキップする。
				if (isMfgOK && isUpdSkipOK(hdrR, actR)) {
					MCMessagePool.add(actR, null, MSLAL0072, actR.if_proc_typ(), actR.data_no(), actR.data_lno());
					setSkipFlag(actR);
					continue;
				}

				// 製造指図ＮＯが変わった場合、製造実績ＮＯを取得する。
				if (isNextMfgInstNo(hdrR, actR)) {
					isMfgOK = getMfgActNo(actR);
					hdrR = actR;
				}

				// ＩＦ処理区分が変わった場合、前の行を設定する。
				if (isNextIfProcTyp(hdrR, actR)) {
					actR.mfg_act_no(hdrR.mfg_act_no());
					hdrR = actR;
				}

				// 外部実績ＮＯが変わった場合、前の行を設定する。
				if (isNextExtActNo(hdrR, actR)) {
					actR.mfg_act_no(hdrR.mfg_act_no());
					hdrR = actR;
				}

				// 製造実績複数エラー／製造実績がないのに訂正・取消の場合、エラーとする
				if (!isMfgOK) {
					if (!actR.err_flg()) {
						MCMessagePool.add(actR, null, MSLAL0931, actR.if_proc_typ(), actR.data_no(), actR.data_lno(), actR.mfg_inst_no());
						setErrFlag(actR);
					}
					continue;
				}

				// エラーとなった受信実績と同じ「外部システムＣＤ、外部システムデータＮＯ」の行もエラーにする。
				if (isExtDataNoHasErr(actR)) {
					MCMessagePool.add(actR, null, MSLAL0078, actR.if_proc_typ(), actR.data_no(), actR.data_lno());
					setErrFlag(actR);
					continue;
				}

				// ＩＦ更新区分：エラーを無視して登録以外の場合、エラー行以降の行をスキップ対象とする。
				if (MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ()) && isAfterErrExtDataNo(actR)) {
					setAsNotImpl(actR);
					continue;
				}

				setBaseStatusItems(actR, hdrR.mfg_act_no());

				// 実績データをまとめる
				tgtL.add(actR);
			}

			// 受信実績を登録する。
			execMfgActReg(tgtL);
		}

		/**
		 * 同一キー（外部システムＣＤ、外部実績ＮＯ）で、新しいデータがある場合、<br>
		 * 古いデータ（外部システムデータＮＯが小さいほう）をスキップ可能かどうかを判断する。
		 * @param bfrR 前の行
		 * @param curR 現在行
		 * @return true: スキップ可能, false: スキップ不可
		 */
		protected boolean isUpdSkipOK(MfgActRecvIf_Upd02_ActLstR bfrR, MfgActRecvIf_Upd02_ActLstR curR) {
			// データ更新区分が「新規」、または、互いに違い場合、スキップ不可
			if (MAC_DATA_CRUD_TYP.isCRT(curR.data_crud_typ()) || !isSame(bfrR.data_crud_typ(), curR.data_crud_typ())) {
				return false;
			}

			// 工程、または、データ種類が違い場合、スキップ不可
			if (!isSame(bfrR.oper_inst_no(), curR.oper_inst_no())) {
				return false;
			}
			if (!isSame(bfrR.if_proc_typ(), curR.if_proc_typ())) {
				return false;
			}

			// 外部実績ＮＯが違い場合、スキップ不可
			if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(curR.if_proc_typ())) {
				if (!isSame(bfrR.ext_oper_act_no(), curR.ext_oper_act_no())) {
					return false;
				}
			}
			else if (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(curR.if_proc_typ())) {
				if (!isSame(bfrR.ext_inpt_act_no(), curR.ext_inpt_act_no())) {
					return false;
				}
				// 投入実績の種類、または、ロス理由が違い場合、スキップ不可
				if (!isSame(bfrR.if_inpt_typ(), curR.if_inpt_typ())) {
					return false;
				}
				if (!MSC_IF_INPT_TYP.isINPT(curR.if_inpt_typ())) {
					if (!isSame(bfrR.loss_rsn_cd(), curR.loss_rsn_cd())) {
						return false;
					}
				}
			}
			else if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(curR.if_proc_typ())) {
				if (!isSame(bfrR.ext_wk_act_no(), curR.ext_wk_act_no())) {
					return false;
				}
			}
			else if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(curR.if_proc_typ())) {
				if (!isSame(bfrR.ext_yield_act_no(), curR.ext_yield_act_no())) {
					return false;
				}
			}

			return true;
		}

		protected boolean isNextMfgInstNo(MfgActRecvIf_Upd02_ActLstR hdrR, MfgActRecvIf_Upd02_ActLstR curR) {
			// 製造指図ＮＯが変わった場合のみ、「true」を返す
			if (!isSame(hdrR.mfg_inst_no(), curR.mfg_inst_no())) {
				return true;
			}

			return false;
		}

		protected boolean isNextIfProcTyp(MfgActRecvIf_Upd02_ActLstR hdrR, MfgActRecvIf_Upd02_ActLstR curR) {
			// ＩＦ処理区分が変わった場合のみ、「true」を返す
			if (!isSame(hdrR.if_proc_typ(), curR.if_proc_typ())) {
				return true;
			}

			return false;
		}

		protected boolean isNextExtActNo(MfgActRecvIf_Upd02_ActLstR hdrR, MfgActRecvIf_Upd02_ActLstR curR) {
			// 外部実績ＮＯが変わった場合のみ、「true」を返す
			if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(curR.if_proc_typ())) {
				if (!isSame(hdrR.ext_oper_act_no(), curR.ext_oper_act_no())) {
					return true;
				}
			}
			else if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(curR.if_proc_typ())) {
				if (!isSame(hdrR.ext_yield_act_no(), curR.ext_yield_act_no())) {
					return true;
				}
			}
			else if (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(curR.if_proc_typ())) {
				if (!isSame(hdrR.ext_inpt_act_no(), curR.ext_inpt_act_no())) {
					return true;
				}
				// 投入実績の場合、ＩＦ投入区分、もしくはロス理由が変わった場合にも「true」を返す
				if (!isSame(hdrR.if_inpt_typ(), curR.if_inpt_typ())) {
					return true;
				}
				if (!MSC_IF_INPT_TYP.isINPT(curR.if_inpt_typ())) {
					if (!isSame(hdrR.loss_rsn_cd(), curR.loss_rsn_cd())) {
						return true;
					}
				}
			}
			else if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(curR.if_proc_typ())) {
				if (!isSame(hdrR.ext_wk_act_no(), curR.ext_wk_act_no())) {
					return true;
				}
			}

			return false;
		}

		protected boolean getMfgActNo(MfgActRecvIf_Upd02_ActLstR actR) {
			MCList<MST_MFG_ACT_R> maL = MCList.create(MST_MFG_ACT_R.class);
			MST_MFG_ACT_R t = MST_MFG_ACT_R.create("T");
			MCQueryApiBuilder maL_bldr = MCQueryApiBuilder.create(t);

			maL_bldr.setSelect(t.mfg_act_no);
			maL_bldr.addSelect(t.div_seq);
			maL_bldr.setWhere(t.mfg_inst_no.eq(bind("1")), actR.mfg_inst_no());

			int cnt = dbSelect("MSLAL6220_MST_MFG_ACT_S01", maL, maL_bldr);
			if (cnt == 0) {
				if (!MAC_DATA_CRUD_TYP.isCRT(actR.data_crud_typ())) {
					// 製造実績がないため、訂正や取消は出来ません。 
					MCMessagePool.add(actR, null, MSLAL0095, actR.if_proc_typ(), actR.data_no(), actR.data_lno(), actR.mfg_inst_no());
					setErrFlag(actR);
					return false;
				}
				return true;
			}
			if (cnt == 1 && maL.get(0).div_seq().eq(1)) {
				actR.mfg_act_no(maL.get(0).mfg_act_no());
				return true;
			}

			// 複数実績（製造分割）の場合、エラーとなる。
			MCMessagePool.add(actR, null, MSLAL0096, actR.if_proc_typ(), actR.data_no(), actR.data_lno(), actR.mfg_inst_no());
			setErrFlag(actR);

			return false;
		}

		protected void setBaseStatusItems(MfgActRecvIf_Upd02_ActLstR actR, String mfgActNo) {
			actR.mfg_act_no(mfgActNo);

			actR.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());

			if (MAC_DATA_CRUD_TYP.isCRT(actR.data_crud_typ())) {
				actR.setStatus(Status.CREATE);
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(actR.data_crud_typ())) {
				actR.setStatus(Status.MODIFY);
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(actR.data_crud_typ())) {
				actR.setStatus(Status.DELETE);
			}
		}

		/**
		 * 製造実績の登録（新規・訂正・取消）を行う。
		 * @param tgtL 製造実績登録対象
		 */
		protected void execMfgActReg(MCList<MfgActRecvIf_Upd02_ActLstR> tgtL) {
			MCList<MfgActRecvIf_Upd02_ActLstR> operL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);		// 工程
			MCList<MfgActRecvIf_Upd02_ActLstR> opDelL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);	// 工程取消
			MCList<MfgActRecvIf_Upd02_ActLstR> yieldL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);	// 出来高
			MCList<MfgActRecvIf_Upd02_ActLstR> inptL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);		// 投入
			MCList<MfgActRecvIf_Upd02_ActLstR> wkL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);		// 工数

			// 0. 受信ＩＦの初期化
			initMfgActRecvIf();

			// 1. 受信実績を「工程／出来高／投入／工数」に分ける。
			splitMfgActByIfProc(tgtL, operL, opDelL, yieldL, inptL, wkL);

			// 2. 受信ＩＦのロック
			lockMfgActRecvIf();

			// 3. ロックできない、または、更新された行を除外
			exceptNotLockData(operL, opDelL, yieldL, inptL, wkL);

			// 4. 工程・出来高の受信実績を登録する。
			callOperYieldRecvIfUpd04(operL, yieldL, opDelL);

			// 5. 投入・工数の受信実績を登録する。（削除工程も含む）
			inptL.addAll(0, opDelL);
			inptL.addAll(wkL);
			callInptWkRecvIfUpd04(inptL);

			// 6. 実績登録の後処理
			afterCall();

			// 7. ワークテーブルデータの削除
			delMfgActRecvIfWk();
		}

		protected void splitMfgActByIfProc(MCList<MfgActRecvIf_Upd02_ActLstR> tgtL, 
											MCList<MfgActRecvIf_Upd02_ActLstR> operL, MCList<MfgActRecvIf_Upd02_ActLstR> opDelL, 
											MCList<MfgActRecvIf_Upd02_ActLstR> yieldL, MCList<MfgActRecvIf_Upd02_ActLstR> inptL, 
											MCList<MfgActRecvIf_Upd02_ActLstR> wkL) {
			for (MfgActRecvIf_Upd02_ActLstR aR : tgtL) {
				if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(aR.if_proc_typ())) {
					// 現状、一括登録では、工程取消を対応できないため、工程リストを更新／取消に分ける
					if (!MAC_DATA_CRUD_TYP.isDEL(aR.data_crud_typ())) {
						operL.add(aR);
					}
					else {
						opDelL.add(aR);
					}
					addOperActRecvIF(aR);
				}
				else if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(aR.if_proc_typ())) {
					yieldL.add(aR);
					addYieldActRecvIF(aR);
				}
				else if (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(aR.if_proc_typ())) {
					inptL.add(aR);
					addInptActRecvIF(aR);
				}
				else if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(aR.if_proc_typ())) {
					wkL.add(aR);
					addWkActRecvIF(aR);
				}
			}
		}

		/**
		 * 工程・出来高の受信実績を登録（新規・訂正・取消）する。
		 * @param operL 工程実績
		 * @param yieldL 出来高実績
		 */
		protected void callOperYieldRecvIfUpd04(MCList<MfgActRecvIf_Upd02_ActLstR> operL, 
												MCList<MfgActRecvIf_Upd02_ActLstR> yieldL, 
												MCList<MfgActRecvIf_Upd02_ActLstR> opDelL) {
			if (operL.isEmpty() && yieldL.isEmpty()) {
				return;
			}

			// 1. 製造実績（工程・出来高）登録のインスタンスを生成する。
			MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd04 ope = getOpe();
			ope.up0().setAll(operL);
			ope.up0().addAll(yieldL);
			ope.up1().if_upd_typ(up1().if_upd_typ());
			ope.up1().src_actlumprecv_flg(up1().src_actlumprecv_flg());
			ope.up1().not_bkf_upd_flg(up1().not_bkf_upd_flg());
			ope.up1().addBooleanColumn("oper_yield_act_flg", true);

			// 2. 登録処理を呼び出す。
			ope.exec();

			// 3. 実行結果を設定する。
			mergeExeRslt(ope.down0());

			// 4. 出来高／副産品の削除により、追加した工程削除を戻す
			MCIndexKey idxkey = ope.down0().createIndex(MfgActRecvIf_Upd02_ActLstR.$if_proc_typ, 
														MfgActRecvIf_Upd02_ActLstR.$data_crud_typ, 
														MfgActRecvIf_Upd02_ActLstR.$chk_add_flg);
			opDelL.addAll( ope.down0().subList( idxkey, 
												MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value(), 
												MAC_DATA_CRUD_TYP.DEL.value(), 
												true)
						);
		}

		/**
		 * 投入・工数の受信実績を登録（新規・訂正・取消）する。
		 * @param dtlL 投入・工数の受信実績
		 */
		protected void callInptWkRecvIfUpd04(MCList<MfgActRecvIf_Upd02_ActLstR> dtlL) {
			// 1. 製造実績（投入・工数）登録のインスタンスを生成する。
			MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd04 ope = getOpe();
			ope.up1().if_upd_typ(up1().if_upd_typ());
			ope.up1().src_actlumprecv_flg(up1().src_actlumprecv_flg());
			ope.up1().not_bkf_upd_flg(up1().not_bkf_upd_flg());
			ope.up1().addBooleanColumn("oper_yield_act_flg", false);

			// 受信実績を上り電文に追加
			for (MfgActRecvIf_Upd02_ActLstR dtlR : dtlL) {
				
				if (_errMfgInstNoS.contains(dtlR.mfg_inst_no())) {
					// 同一指図の工程実績が取込エラーの場合、投入・工数を取り込まない。
					MCMessagePool.add(dtlR, null, MSLAL0932, dtlR.if_proc_typ(), dtlR.data_no(), dtlR.data_lno(), dtlR.mfg_inst_no());
					setErrFlag(dtlR);
					continue;
				}
				
				String mfgActNo = _instActNoMap.get(dtlR.mfg_inst_no());
				// 前の処理で、取消の場合、今回の取消はＯＫとみなす。
				if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) && !isNull(dtlR.mfg_act_no()) && MAC_STR.isNULL_VAL(mfgActNo)) {
					setOkFlag(dtlR);
					continue;
				}
				else if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(dtlR.if_proc_typ())
						&& MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())
						&& isNull(dtlR.mfg_act_no()) && MAC_STR.isNULL_VAL(mfgActNo)) {
					continue;
				}
				// 前の処理で、新規の場合、登録した製造実績ＮＯを設定する。
				if (isNull(dtlR.mfg_act_no()) && !isNull(mfgActNo) && !MAC_STR.isNULL_VAL(mfgActNo)) {
					dtlR.mfg_act_no(mfgActNo);
				}

				ope.up0().add(dtlR);
			}

			if (ope.up0().isEmpty()) {
				return;
			}

			// 2. 登録処理を呼び出す。
			ope.exec();

			// 3. 実行結果を設定する。
			mergeExeRslt(ope.down0());
		}

		protected MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd04 getOpe() {
			return MSLAL_MfgActRecvIfService.crtMfgActRecvIf_Upd04();
		}

		protected void mergeExeRslt(MCList<MfgActRecvIf_Upd02_ActLstR> execActL) {
			for (MfgActRecvIf_Upd02_ActLstR r : execActL) {
				// チェック補完行を処理不要
				if (r.chk_add_flg()) {
					continue;
				}

				// 処理エラー
				if (r.err_flg()) {
					if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(r.if_proc_typ())) {
						_errMfgInstNoS.add(r.mfg_inst_no());
					}
					setErrFlag(r);
					continue;
				}

				// 工程取消により処理スキップ行をＯＫとみなす。
				if (r.skip_by_oper_del_flg()) {
					setOkFlag(r);
					continue;
				}

				// 処理ＯＫ
				setOkFlag(r);

				// 実績ＮＯを記憶
				_instActNoMap.put(nvl(r.mfg_inst_no(), MAC_STR.NULL_VAL.value()), nvl(r.mfg_act_no(), MAC_STR.NULL_VAL.value()));
			}
		}

		/**
		 * 製造実績受信ＩＦデータをまとめて登録できる「新規／訂正／取消」の組に分ける。<br>
		 * なお、外部システムＣＤが変わる場合、別の組とする。
		 * @return 製造実績登録対象の組
		 */
		protected List<MCList<MfgActRecvIf_Upd02_ActLstR>> getRegActArray() {
			List<MCList<MfgActRecvIf_Upd02_ActLstR>> ret = new ArrayList<>();

			int pos = 0;
			String dataCrudTyp = null;
			MfgActRecvIf_Upd02_ActLstR bfmR = MfgActRecvIf_Upd02_ActLstR.create();
			for (MfgActRecvIf_Upd02_ActLstR actR : up0()) {
				// ＩＦ制御マスタによりスキップ行を更新しない
				if (actR.skip_by_if_ctl_flg()) {
					setAsNotImpl(actR);
					continue;
				}

				// 0. 初回
				if (ret.isEmpty()) {
					pos = 0;
					ret.add(crtNewActL(actR));
					dataCrudTyp = actR.data_crud_typ();
					bfmR = actR;
					continue;
				}

				// 1. 外部システムＣＤが変わる場合、別の組とする。
				if (!isSame(bfmR.ext_sys_cd(), actR.ext_sys_cd())) {
					pos++;
					ret.add(crtNewActL(actR));
					dataCrudTyp = actR.data_crud_typ();
				}
				// 2. データ更新区分が変わった場合、別の組とする。
				else if (!isSame(dataCrudTyp, actR.data_crud_typ())) {
					pos++;
					ret.add(crtNewActL(actR));
					dataCrudTyp = actR.data_crud_typ();
				}
				// 3. 同じデータ更新区分なら、同一組とする。
				else {
					ret.get(pos).add(actR);
				}

				// 比較のため、前の行を一時記憶する。
				bfmR = actR;
			}

			return ret;
		}

		protected MCList<MfgActRecvIf_Upd02_ActLstR> crtNewActL(MfgActRecvIf_Upd02_ActLstR actR) {
			MCList<MfgActRecvIf_Upd02_ActLstR> actL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
			actL.add(actR);
			return actL;
		}

		protected MCSortPolicy getActRegSortPolicy() {
			MCSortPolicy stPlcy = new MCSortPolicy();

			stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$ext_sys_cd);
			stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$ext_data_no);
			stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$data_crud_typ);
			stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$ext_data_lno);

			return stPlcy;
		}

		protected MCSortPolicy getMfgInstSortPolicy() {
			MCSortPolicy stPlcy = new MCSortPolicy();

			stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$mfg_inst_no);
			stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$oper_inst_no);
			stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$if_proc_typ);
			stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$if_inpt_typ);
			stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$loss_rsn_cd);
			stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$ext_oper_act_no);
			stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$ext_wk_act_no);
			stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$ext_inpt_act_no);
			stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$ext_yield_act_no);
			stPlcy.add(SortType.DESC, MfgActRecvIf_Upd02_ActLstR.$ext_data_no);
			stPlcy.add(SortType.DESC, MfgActRecvIf_Upd02_ActLstR.$ext_data_lno);

			return stPlcy;
		}

		protected void setOkFlag(MfgActRecvIf_Upd02_ActLstR aR) {
			aR.err_flg(false);
			aR.imp_flg(false);
			aR.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());

			// ok集計
			_okNum++;
			_okActL.add(aR);
		}

		protected void setSkipFlag(MfgActRecvIf_Upd02_ActLstR aR) {
			aR.err_flg(false);
			aR.imp_flg(false);
			aR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());

			// skip集計
			_skipNum++;
			_skipActL.add(aR);
		}

		protected void setAsNotImpl(MfgActRecvIf_Upd02_ActLstR aR) {
			// 「未処理のままにする」ため、総数から減らし、ＩＦテーブルも更新しない
			_totalNum--;
			aR.err_flg(false);
		}

		protected void setErrFlag(MfgActRecvIf_Upd02_ActLstR aR) {
			// エラーＦＬＧ設定
			aR.err_flg(true);
			aR.imp_flg(true);
			aR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());

			// エラー集計
			_errNum++;
			_errActL.add(aR);

			// エラーの外部システムデータＮＯを記憶
			setErrKeyMap(aR);
		}

		protected void setErrKeyMap(MfgActRecvIf_Upd02_ActLstR aR) {
			// エラー発生受信実績キーの設定
			TreeSet<MCNumber> valL = _errKeyMap.get(aR.ext_sys_cd());
			if (valL == null) {
				valL = new TreeSet<MCNumber>();
			}

			valL.add(aR.ext_data_no());
			_errKeyMap.put(aR.ext_sys_cd(), valL);
		}

		protected boolean isExtDataNoHasErr(MfgActRecvIf_Upd02_ActLstR aR) {
			TreeSet<MCNumber> valL = _errKeyMap.get(aR.ext_sys_cd());
			if (valL == null) {
				return false;
			}

			return valL.contains(aR.ext_data_no());
		}

		protected boolean isAfterErrExtDataNo(MfgActRecvIf_Upd02_ActLstR aR) {
			TreeSet<MCNumber> valL = _errKeyMap.get(aR.ext_sys_cd());
			if (valL == null || valL.isEmpty()) {
				return false;
			}

			return aR.ext_data_no().gt(valL.first());
		}

		/**
		 * 外部受信実績の代替キー（実績種類＋外部システムＣＤ＋外部実績ＮＯ）を生成する
		 * @param aR 外部実績
		 * @return 外部実績の代替キー
		 */
		protected String crtExtAltrKey(MfgActRecvIf_Upd02_ActLstR aR) {
			StringBuilder sb = new StringBuilder();

			sb.append(aR.if_proc_typ());
			sb.append(MAC_STR.CD_NM_DLM.value());
			sb.append(aR.ext_sys_cd());
			sb.append(MAC_STR.CD_NM_DLM.value());

			if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(aR.if_proc_typ())) {
				sb.append(aR.ext_oper_act_no());
			}
			else if (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(aR.if_proc_typ())) {
				sb.append(aR.ext_inpt_act_no());
			}
			else if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(aR.if_proc_typ())) {
				sb.append(aR.ext_wk_act_no());
			}
			else if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(aR.if_proc_typ())) {
				sb.append(aR.ext_yield_act_no());
			}

			return sb.toString();
		}

		protected void exceptNotLockData(MCList<MfgActRecvIf_Upd02_ActLstR> operL, MCList<MfgActRecvIf_Upd02_ActLstR> opDelL, 
										 MCList<MfgActRecvIf_Upd02_ActLstR> yieldL, MCList<MfgActRecvIf_Upd02_ActLstR> inptL, 
										 MCList<MfgActRecvIf_Upd02_ActLstR> wkL) {
			// 工程
			exceptNotLockOper(operL);
			exceptNotLockOper(opDelL);
			// 出来高
			exceptNotLockYield(yieldL);
			// 投入
			exceptNotLockInpt(inptL);
			// 工数
			exceptNotLockWk(wkL);
		}

		protected void exceptNotLockOper(MCList<MfgActRecvIf_Upd02_ActLstR> operL) {
			if (operL.isEmpty()) {
				return;
			}

			if (_operActIFL.isEmpty()) {
				_totalNum -= operL.size();
				operL.clear();
				return;
			}

			for (int i = operL.size() -1 ; i >= 0 ; i--) {
				MST_OPER_ACT_RECV_IF_R lockR = _operActIFL.getFirst(_operActIFIdx, operL.get(i).data_lno());
				if (!isNull(lockR)) {
					MfgActRecvIf_Upd02_ActLstR actR = operL.get(i);
					// ロック時に取得した値を更新対象行に設定する
					copyValue(actR, lockR, createMap_MfgActRecvIf_Upd02_ActLstR_MST_OPER_ACT_RECV_IF_R());
					if (!isChkUpdCntr(actR)) {
						continue;
					}
				}
				// ロックできない、または、更新された行を除外する（取り込まない）。
				_totalNum--;
				operL.remove(i);
			}
		}

		protected Map_MfgActRecvIf_Upd02_ActLstR_MST_OPER_ACT_RECV_IF_R<MfgActRecvIf_Upd02_ActLstR,MST_OPER_ACT_RECV_IF_R> createMap_MfgActRecvIf_Upd02_ActLstR_MST_OPER_ACT_RECV_IF_R() {
			return new Map_MfgActRecvIf_Upd02_ActLstR_MST_OPER_ACT_RECV_IF_R<MfgActRecvIf_Upd02_ActLstR, MST_OPER_ACT_RECV_IF_R>();
		}

		public class Map_MfgActRecvIf_Upd02_ActLstR_MST_OPER_ACT_RECV_IF_R<D extends MfgActRecvIf_Upd02_ActLstR, S extends MST_OPER_ACT_RECV_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$data_no, MST_OPER_ACT_RECV_IF_R.$data_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$exe_sts_typ, MST_OPER_ACT_RECV_IF_R.$exe_sts_typ);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$data_crud_typ, MST_OPER_ACT_RECV_IF_R.$data_crud_typ);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ext_sys_cd, MST_OPER_ACT_RECV_IF_R.$ext_sys_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ext_data_no, MST_OPER_ACT_RECV_IF_R.$ext_data_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ext_data_lno, MST_OPER_ACT_RECV_IF_R.$ext_data_lno);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$data_make_dt, MST_OPER_ACT_RECV_IF_R.$data_make_dt);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$imp_flg, MST_OPER_ACT_RECV_IF_R.$imp_flg);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$recv_dt, MST_OPER_ACT_RECV_IF_R.$recv_dt);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ext_oper_act_no, MST_OPER_ACT_RECV_IF_R.$ext_oper_act_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$intr_rmrks, MST_OPER_ACT_RECV_IF_R.$intr_rmrks);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$act_rpt_rmrks, MST_OPER_ACT_RECV_IF_R.$act_rpt_rmrks);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$not_cmpl_flg, MST_OPER_ACT_RECV_IF_R.$not_cmpl_flg);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$st_act_tm, MST_OPER_ACT_RECV_IF_R.$st_act_tm);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$end_act_tm, MST_OPER_ACT_RECV_IF_R.$end_act_tm);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$oper_unit_qty, MST_OPER_ACT_RECV_IF_R.$oper_unit_qty);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$bkf_ctl_flg, MST_OPER_ACT_RECV_IF_R.$bkf_ctl_flg);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$wk_cost_calc_ctl_flg, MST_OPER_ACT_RECV_IF_R.$wk_cost_calc_ctl_flg);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$oper_yield, MST_OPER_ACT_RECV_IF_R.$oper_yield);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char1, MST_OPER_ACT_RECV_IF_R.$sub_char1);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char2, MST_OPER_ACT_RECV_IF_R.$sub_char2);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char3, MST_OPER_ACT_RECV_IF_R.$sub_char3);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char4, MST_OPER_ACT_RECV_IF_R.$sub_char4);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char5, MST_OPER_ACT_RECV_IF_R.$sub_char5);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char6, MST_OPER_ACT_RECV_IF_R.$sub_char6);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char7, MST_OPER_ACT_RECV_IF_R.$sub_char7);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char8, MST_OPER_ACT_RECV_IF_R.$sub_char8);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char9, MST_OPER_ACT_RECV_IF_R.$sub_char9);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char10, MST_OPER_ACT_RECV_IF_R.$sub_char10);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char11, MST_OPER_ACT_RECV_IF_R.$sub_char11);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char12, MST_OPER_ACT_RECV_IF_R.$sub_char12);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char13, MST_OPER_ACT_RECV_IF_R.$sub_char13);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char14, MST_OPER_ACT_RECV_IF_R.$sub_char14);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char15, MST_OPER_ACT_RECV_IF_R.$sub_char15);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char16, MST_OPER_ACT_RECV_IF_R.$sub_char16);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char17, MST_OPER_ACT_RECV_IF_R.$sub_char17);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char18, MST_OPER_ACT_RECV_IF_R.$sub_char18);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char19, MST_OPER_ACT_RECV_IF_R.$sub_char19);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char20, MST_OPER_ACT_RECV_IF_R.$sub_char20);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char21, MST_OPER_ACT_RECV_IF_R.$sub_char21);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char22, MST_OPER_ACT_RECV_IF_R.$sub_char22);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char23, MST_OPER_ACT_RECV_IF_R.$sub_char23);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char24, MST_OPER_ACT_RECV_IF_R.$sub_char24);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char25, MST_OPER_ACT_RECV_IF_R.$sub_char25);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char26, MST_OPER_ACT_RECV_IF_R.$sub_char26);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char27, MST_OPER_ACT_RECV_IF_R.$sub_char27);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char28, MST_OPER_ACT_RECV_IF_R.$sub_char28);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char29, MST_OPER_ACT_RECV_IF_R.$sub_char29);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char30, MST_OPER_ACT_RECV_IF_R.$sub_char30);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num1, MST_OPER_ACT_RECV_IF_R.$sub_num1);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num2, MST_OPER_ACT_RECV_IF_R.$sub_num2);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num3, MST_OPER_ACT_RECV_IF_R.$sub_num3);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num4, MST_OPER_ACT_RECV_IF_R.$sub_num4);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num5, MST_OPER_ACT_RECV_IF_R.$sub_num5);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt1, MST_OPER_ACT_RECV_IF_R.$sub_dt1);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt2, MST_OPER_ACT_RECV_IF_R.$sub_dt2);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt3, MST_OPER_ACT_RECV_IF_R.$sub_dt3);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt4, MST_OPER_ACT_RECV_IF_R.$sub_dt4);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt5, MST_OPER_ACT_RECV_IF_R.$sub_dt5);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$upd_srv_req_no, MST_OPER_ACT_RECV_IF_R.$upd_srv_req_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$upd_cntr, MST_OPER_ACT_RECV_IF_R.$upd_cntr);
			}
		}

		protected void exceptNotLockYield(MCList<MfgActRecvIf_Upd02_ActLstR> yieldL) {
			if (yieldL.isEmpty()) {
				return;
			}

			if (_yieldActIFL.isEmpty()) {
				_totalNum -= yieldL.size();
				yieldL.clear();
				return;
			}

			for (int i = yieldL.size() -1 ; i >= 0 ; i--) {
				MST_YIELD_ACT_RECV_IF_R lockR = _yieldActIFL.getFirst(_yieldActIFIdx, yieldL.get(i).data_lno());
				if (!isNull(lockR)) {
					MfgActRecvIf_Upd02_ActLstR actR = yieldL.get(i);
					// ロック時に取得した値を更新対象行に設定する
					copyValue(actR, lockR, createMap_MfgActRecvIf_Upd02_ActLstR_MST_YIELD_ACT_RECV_IF_R());
					if (!isChkUpdCntr(actR)) {
						continue;
					}
				}
				// ロックできない、または、更新された行を除外する（取り込まない）。
				_totalNum--;
				yieldL.remove(i);
			}
		}

		protected Map_MfgActRecvIf_Upd02_ActLstR_MST_YIELD_ACT_RECV_IF_R<MfgActRecvIf_Upd02_ActLstR,MST_YIELD_ACT_RECV_IF_R> createMap_MfgActRecvIf_Upd02_ActLstR_MST_YIELD_ACT_RECV_IF_R() {
			return new Map_MfgActRecvIf_Upd02_ActLstR_MST_YIELD_ACT_RECV_IF_R<MfgActRecvIf_Upd02_ActLstR, MST_YIELD_ACT_RECV_IF_R>();
		}

		public class Map_MfgActRecvIf_Upd02_ActLstR_MST_YIELD_ACT_RECV_IF_R<D extends MfgActRecvIf_Upd02_ActLstR, S extends MST_YIELD_ACT_RECV_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$data_no, MST_YIELD_ACT_RECV_IF_R.$data_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$exe_sts_typ, MST_YIELD_ACT_RECV_IF_R.$exe_sts_typ);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$data_crud_typ, MST_YIELD_ACT_RECV_IF_R.$data_crud_typ);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ext_sys_cd, MST_YIELD_ACT_RECV_IF_R.$ext_sys_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ext_data_no, MST_YIELD_ACT_RECV_IF_R.$ext_data_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ext_data_lno, MST_YIELD_ACT_RECV_IF_R.$ext_data_lno);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$data_make_dt, MST_YIELD_ACT_RECV_IF_R.$data_make_dt);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$imp_flg, MST_YIELD_ACT_RECV_IF_R.$imp_flg);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$recv_dt, MST_YIELD_ACT_RECV_IF_R.$recv_dt);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ext_oper_act_no, MST_YIELD_ACT_RECV_IF_R.$ext_oper_act_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$mfg_act_intr_rmrks, MST_YIELD_ACT_RECV_IF_R.$mfg_act_intr_rmrks);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$mfg_act_rpt_rmrks, MST_YIELD_ACT_RECV_IF_R.$mfg_act_rpt_rmrks);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$trd_rmrks, MST_YIELD_ACT_RECV_IF_R.$trd_rmrks);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$yield_act_intr_rmrks, MST_YIELD_ACT_RECV_IF_R.$yield_act_intr_rmrks);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$yield_act_rpt_rmrks, MST_YIELD_ACT_RECV_IF_R.$yield_act_rpt_rmrks);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$abort_flg, MST_YIELD_ACT_RECV_IF_R.$abort_flg);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ext_yield_act_no, MST_YIELD_ACT_RECV_IF_R.$ext_yield_act_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$itm_cd, MST_YIELD_ACT_RECV_IF_R.$itm_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$itm_sub1, MST_YIELD_ACT_RECV_IF_R.$itm_sub1);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$itm_sub2, MST_YIELD_ACT_RECV_IF_R.$itm_sub2);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$itm_sub3, MST_YIELD_ACT_RECV_IF_R.$itm_sub3);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$lot_no, MST_YIELD_ACT_RECV_IF_R.$lot_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sublot_no, MST_YIELD_ACT_RECV_IF_R.$sublot_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sno1, MST_YIELD_ACT_RECV_IF_R.$sno1);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sno2, MST_YIELD_ACT_RECV_IF_R.$sno2);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sno3, MST_YIELD_ACT_RECV_IF_R.$sno3);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sno4, MST_YIELD_ACT_RECV_IF_R.$sno4);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$gd_cd, MST_YIELD_ACT_RECV_IF_R.$gd_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$act_tm, MST_YIELD_ACT_RECV_IF_R.$act_tm);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$all_oper_act_reg_flg, MST_YIELD_ACT_RECV_IF_R.$all_oper_act_reg_flg);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$yield_typ, MST_YIELD_ACT_RECV_IF_R.$yield_typ);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$yield_rsn_cd, MST_YIELD_ACT_RECV_IF_R.$yield_rsn_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$yield_rate, MST_YIELD_ACT_RECV_IF_R.$yield_rate);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$trd_unit_qty, MST_YIELD_ACT_RECV_IF_R.$trd_unit_qty);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$trd_unit_cd, MST_YIELD_ACT_RECV_IF_R.$trd_unit_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$same_lot_flg, MST_YIELD_ACT_RECV_IF_R.$same_lot_flg);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$itm_yield, MST_YIELD_ACT_RECV_IF_R.$itm_yield);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$strg_loc_cd, MST_YIELD_ACT_RECV_IF_R.$strg_loc_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$strg_str_ln_cd, MST_YIELD_ACT_RECV_IF_R.$strg_str_ln_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$insp_cnt_rmrks, MST_YIELD_ACT_RECV_IF_R.$insp_cnt_rmrks);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$quality_typ, MST_YIELD_ACT_RECV_IF_R.$quality_typ);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$mfg_act_usr_cd, MST_YIELD_ACT_RECV_IF_R.$mfg_act_usr_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$mfg_act_dpt_cd, MST_YIELD_ACT_RECV_IF_R.$mfg_act_dpt_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char1, MST_YIELD_ACT_RECV_IF_R.$sub_char1);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char2, MST_YIELD_ACT_RECV_IF_R.$sub_char2);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char3, MST_YIELD_ACT_RECV_IF_R.$sub_char3);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char4, MST_YIELD_ACT_RECV_IF_R.$sub_char4);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char5, MST_YIELD_ACT_RECV_IF_R.$sub_char5);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char6, MST_YIELD_ACT_RECV_IF_R.$sub_char6);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char7, MST_YIELD_ACT_RECV_IF_R.$sub_char7);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char8, MST_YIELD_ACT_RECV_IF_R.$sub_char8);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char9, MST_YIELD_ACT_RECV_IF_R.$sub_char9);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char10, MST_YIELD_ACT_RECV_IF_R.$sub_char10);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char11, MST_YIELD_ACT_RECV_IF_R.$sub_char11);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char12, MST_YIELD_ACT_RECV_IF_R.$sub_char12);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char13, MST_YIELD_ACT_RECV_IF_R.$sub_char13);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char14, MST_YIELD_ACT_RECV_IF_R.$sub_char14);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char15, MST_YIELD_ACT_RECV_IF_R.$sub_char15);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char16, MST_YIELD_ACT_RECV_IF_R.$sub_char16);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char17, MST_YIELD_ACT_RECV_IF_R.$sub_char17);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char18, MST_YIELD_ACT_RECV_IF_R.$sub_char18);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char19, MST_YIELD_ACT_RECV_IF_R.$sub_char19);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char20, MST_YIELD_ACT_RECV_IF_R.$sub_char20);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char21, MST_YIELD_ACT_RECV_IF_R.$sub_char21);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char22, MST_YIELD_ACT_RECV_IF_R.$sub_char22);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char23, MST_YIELD_ACT_RECV_IF_R.$sub_char23);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char24, MST_YIELD_ACT_RECV_IF_R.$sub_char24);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char25, MST_YIELD_ACT_RECV_IF_R.$sub_char25);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char26, MST_YIELD_ACT_RECV_IF_R.$sub_char26);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char27, MST_YIELD_ACT_RECV_IF_R.$sub_char27);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char28, MST_YIELD_ACT_RECV_IF_R.$sub_char28);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char29, MST_YIELD_ACT_RECV_IF_R.$sub_char29);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char30, MST_YIELD_ACT_RECV_IF_R.$sub_char30);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num1, MST_YIELD_ACT_RECV_IF_R.$sub_num1);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num2, MST_YIELD_ACT_RECV_IF_R.$sub_num2);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num3, MST_YIELD_ACT_RECV_IF_R.$sub_num3);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num4, MST_YIELD_ACT_RECV_IF_R.$sub_num4);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num5, MST_YIELD_ACT_RECV_IF_R.$sub_num5);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt1, MST_YIELD_ACT_RECV_IF_R.$sub_dt1);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt2, MST_YIELD_ACT_RECV_IF_R.$sub_dt2);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt3, MST_YIELD_ACT_RECV_IF_R.$sub_dt3);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt4, MST_YIELD_ACT_RECV_IF_R.$sub_dt4);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt5, MST_YIELD_ACT_RECV_IF_R.$sub_dt5);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$upd_srv_req_no, MST_YIELD_ACT_RECV_IF_R.$upd_srv_req_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$upd_cntr, MST_YIELD_ACT_RECV_IF_R.$upd_cntr);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.itm_sub1(nvl(src.itm_sub1(), MAC_STR.NULL_VAL.value()));
				dest.itm_sub2(nvl(src.itm_sub2(), MAC_STR.NULL_VAL.value()));
				dest.itm_sub3(nvl(src.itm_sub3(), MAC_STR.NULL_VAL.value()));
			}
		}

		protected void exceptNotLockInpt(MCList<MfgActRecvIf_Upd02_ActLstR> inptL) {
			if (inptL.isEmpty()) {
				return;
			}

			if (_inptActIFL.isEmpty()) {
				_totalNum -= inptL.size();
				inptL.clear();
				return;
			}

			for (int i = inptL.size() -1 ; i >= 0 ; i--) {
				MST_INPT_ACT_RECV_IF_R lockR = _inptActIFL.getFirst(_inptActIFIdx, inptL.get(i).data_lno());
				if (!isNull(lockR)) {
					MfgActRecvIf_Upd02_ActLstR actR = inptL.get(i);
					// ロック時に取得した値を更新対象行に設定する
					copyValue(actR, lockR, createMap_MfgActRecvIf_Upd02_ActLstR_MST_INPT_ACT_RECV_IF_R());
					if (!isChkUpdCntr(actR)) {
						continue;
					}
				}
				// ロックできない、または、更新された行を除外する（取り込まない）。
				_totalNum--;
				inptL.remove(i);
			}
		}

		protected Map_MfgActRecvIf_Upd02_ActLstR_MST_INPT_ACT_RECV_IF_R<MfgActRecvIf_Upd02_ActLstR,MST_INPT_ACT_RECV_IF_R> createMap_MfgActRecvIf_Upd02_ActLstR_MST_INPT_ACT_RECV_IF_R() {
			return new Map_MfgActRecvIf_Upd02_ActLstR_MST_INPT_ACT_RECV_IF_R<MfgActRecvIf_Upd02_ActLstR, MST_INPT_ACT_RECV_IF_R>();
		}

		public class Map_MfgActRecvIf_Upd02_ActLstR_MST_INPT_ACT_RECV_IF_R<D extends MfgActRecvIf_Upd02_ActLstR, S extends MST_INPT_ACT_RECV_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$data_no, MST_INPT_ACT_RECV_IF_R.$data_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$exe_sts_typ, MST_INPT_ACT_RECV_IF_R.$exe_sts_typ);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$data_crud_typ, MST_INPT_ACT_RECV_IF_R.$data_crud_typ);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ext_sys_cd, MST_INPT_ACT_RECV_IF_R.$ext_sys_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ext_data_no, MST_INPT_ACT_RECV_IF_R.$ext_data_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ext_data_lno, MST_INPT_ACT_RECV_IF_R.$ext_data_lno);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$data_make_dt, MST_INPT_ACT_RECV_IF_R.$data_make_dt);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$imp_flg, MST_INPT_ACT_RECV_IF_R.$imp_flg);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$recv_dt, MST_INPT_ACT_RECV_IF_R.$recv_dt);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ext_oper_act_no, MST_INPT_ACT_RECV_IF_R.$ext_oper_act_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$act_intr_rmrks, MST_INPT_ACT_RECV_IF_R.$act_intr_rmrks);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$inpt_act_rpt_rmrks, MST_INPT_ACT_RECV_IF_R.$inpt_act_rpt_rmrks);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$act_trd_rmrks, MST_INPT_ACT_RECV_IF_R.$act_trd_rmrks);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$abort_flg, MST_INPT_ACT_RECV_IF_R.$abort_flg);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ext_inpt_act_no, MST_INPT_ACT_RECV_IF_R.$ext_inpt_act_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$itm_cd, MST_INPT_ACT_RECV_IF_R.$itm_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$gd_cd, MST_INPT_ACT_RECV_IF_R.$gd_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$act_tm, MST_INPT_ACT_RECV_IF_R.$act_tm);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$if_inpt_typ, MST_INPT_ACT_RECV_IF_R.$if_inpt_typ);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$inpt_rsn_cd, MST_INPT_ACT_RECV_IF_R.$inpt_rsn_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$loss_rsn_cd, MST_INPT_ACT_RECV_IF_R.$loss_rsn_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$old_loss_rsn_cd, MST_INPT_ACT_RECV_IF_R.$old_loss_rsn_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$acxfr_qty, MST_INPT_ACT_RECV_IF_R.$acxfr_qty);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$acxfr_rsn_cd, MST_INPT_ACT_RECV_IF_R.$acxfr_rsn_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$acxfr_bd_dpt_cd, MST_INPT_ACT_RECV_IF_R.$acxfr_bd_dpt_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$stk_bp_cd, MST_INPT_ACT_RECV_IF_R.$stk_bp_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$stk_arrv_bp_cd, MST_INPT_ACT_RECV_IF_R.$stk_arrv_bp_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$stk_id_typ, MST_INPT_ACT_RECV_IF_R.$stk_id_typ);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$base_unit_inpt_qty, MST_INPT_ACT_RECV_IF_R.$base_unit_inpt_qty);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$inpt_loc_cd, MST_INPT_ACT_RECV_IF_R.$inpt_loc_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$inpt_str_ln_cd, MST_INPT_ACT_RECV_IF_R.$inpt_str_ln_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$cont_qty, MST_INPT_ACT_RECV_IF_R.$cont_qty);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$not_pd_chk_flg, MST_INPT_ACT_RECV_IF_R.$not_pd_chk_flg);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char1, MST_INPT_ACT_RECV_IF_R.$sub_char1);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char2, MST_INPT_ACT_RECV_IF_R.$sub_char2);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char3, MST_INPT_ACT_RECV_IF_R.$sub_char3);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char4, MST_INPT_ACT_RECV_IF_R.$sub_char4);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char5, MST_INPT_ACT_RECV_IF_R.$sub_char5);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char6, MST_INPT_ACT_RECV_IF_R.$sub_char6);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char7, MST_INPT_ACT_RECV_IF_R.$sub_char7);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char8, MST_INPT_ACT_RECV_IF_R.$sub_char8);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char9, MST_INPT_ACT_RECV_IF_R.$sub_char9);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char10, MST_INPT_ACT_RECV_IF_R.$sub_char10);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char11, MST_INPT_ACT_RECV_IF_R.$sub_char11);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char12, MST_INPT_ACT_RECV_IF_R.$sub_char12);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char13, MST_INPT_ACT_RECV_IF_R.$sub_char13);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char14, MST_INPT_ACT_RECV_IF_R.$sub_char14);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char15, MST_INPT_ACT_RECV_IF_R.$sub_char15);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char16, MST_INPT_ACT_RECV_IF_R.$sub_char16);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char17, MST_INPT_ACT_RECV_IF_R.$sub_char17);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char18, MST_INPT_ACT_RECV_IF_R.$sub_char18);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char19, MST_INPT_ACT_RECV_IF_R.$sub_char19);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char20, MST_INPT_ACT_RECV_IF_R.$sub_char20);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char21, MST_INPT_ACT_RECV_IF_R.$sub_char21);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char22, MST_INPT_ACT_RECV_IF_R.$sub_char22);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char23, MST_INPT_ACT_RECV_IF_R.$sub_char23);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char24, MST_INPT_ACT_RECV_IF_R.$sub_char24);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char25, MST_INPT_ACT_RECV_IF_R.$sub_char25);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char26, MST_INPT_ACT_RECV_IF_R.$sub_char26);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char27, MST_INPT_ACT_RECV_IF_R.$sub_char27);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char28, MST_INPT_ACT_RECV_IF_R.$sub_char28);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char29, MST_INPT_ACT_RECV_IF_R.$sub_char29);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char30, MST_INPT_ACT_RECV_IF_R.$sub_char30);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num1, MST_INPT_ACT_RECV_IF_R.$sub_num1);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num2, MST_INPT_ACT_RECV_IF_R.$sub_num2);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num3, MST_INPT_ACT_RECV_IF_R.$sub_num3);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num4, MST_INPT_ACT_RECV_IF_R.$sub_num4);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num5, MST_INPT_ACT_RECV_IF_R.$sub_num5);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt1, MST_INPT_ACT_RECV_IF_R.$sub_dt1);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt2, MST_INPT_ACT_RECV_IF_R.$sub_dt2);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt3, MST_INPT_ACT_RECV_IF_R.$sub_dt3);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt4, MST_INPT_ACT_RECV_IF_R.$sub_dt4);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt5, MST_INPT_ACT_RECV_IF_R.$sub_dt5);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$upd_srv_req_no, MST_INPT_ACT_RECV_IF_R.$upd_srv_req_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$upd_cntr, MST_INPT_ACT_RECV_IF_R.$upd_cntr);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.itm_sub1(nvl(src.itm_sub1(), MAC_STR.NULL_VAL.value()));
				dest.itm_sub2(nvl(src.itm_sub2(), MAC_STR.NULL_VAL.value()));
				dest.itm_sub3(nvl(src.itm_sub3(), MAC_STR.NULL_VAL.value()));
				dest.lot_no(nvl(src.lot_no(), MAC_STR.NULL_VAL.value()));
				dest.sublot_no(nvl(src.sublot_no(), MAC_STR.NULL_VAL.value()));
				dest.sno1(nvl(src.sno1(), MAC_STR.NULL_VAL.value()));
				dest.sno2(nvl(src.sno2(), MAC_STR.NULL_VAL.value()));
				dest.sno3(nvl(src.sno3(), MAC_STR.NULL_VAL.value()));
				dest.sno4(nvl(src.sno4(), MAC_STR.NULL_VAL.value()));
			}
		}

		protected void exceptNotLockWk(MCList<MfgActRecvIf_Upd02_ActLstR> wkL) {
			if (wkL.isEmpty()) {
				return;
			}

			if (_wkActIFL.isEmpty()) {
				_totalNum -= wkL.size();
				wkL.clear();
				return;
			}

			for (int i = wkL.size() -1 ; i >= 0 ; i--) {
				MST_WK_ACT_RECV_IF_R lockR = _wkActIFL.getFirst(_wkActIFIdx, wkL.get(i).data_lno());
				if (!isNull(lockR)) {
					MfgActRecvIf_Upd02_ActLstR actR = wkL.get(i);
					// ロック時に取得した値を更新対象行に設定する
					copyValue(actR, lockR, createMap_MfgActRecvIf_Upd02_ActLstR_MST_WK_ACT_RECV_IF_R());
					if (!isChkUpdCntr(actR)) {
						continue;
					}
				}
				// ロックできない、または、更新された行を除外する（取り込まない）。
				_totalNum--;
				wkL.remove(i);
			}
		}

		protected Map_MfgActRecvIf_Upd02_ActLstR_MST_WK_ACT_RECV_IF_R<MfgActRecvIf_Upd02_ActLstR,MST_WK_ACT_RECV_IF_R> createMap_MfgActRecvIf_Upd02_ActLstR_MST_WK_ACT_RECV_IF_R() {
			return new Map_MfgActRecvIf_Upd02_ActLstR_MST_WK_ACT_RECV_IF_R<MfgActRecvIf_Upd02_ActLstR, MST_WK_ACT_RECV_IF_R>();
		}

		public class Map_MfgActRecvIf_Upd02_ActLstR_MST_WK_ACT_RECV_IF_R<D extends MfgActRecvIf_Upd02_ActLstR, S extends MST_WK_ACT_RECV_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$data_no, MST_WK_ACT_RECV_IF_R.$data_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$exe_sts_typ, MST_WK_ACT_RECV_IF_R.$exe_sts_typ);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$data_crud_typ, MST_WK_ACT_RECV_IF_R.$data_crud_typ);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ext_sys_cd, MST_WK_ACT_RECV_IF_R.$ext_sys_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ext_data_no, MST_WK_ACT_RECV_IF_R.$ext_data_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ext_data_lno, MST_WK_ACT_RECV_IF_R.$ext_data_lno);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$data_make_dt, MST_WK_ACT_RECV_IF_R.$data_make_dt);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$imp_flg, MST_WK_ACT_RECV_IF_R.$imp_flg);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$recv_dt, MST_WK_ACT_RECV_IF_R.$recv_dt);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$div_seq, MST_WK_ACT_RECV_IF_R.$div_seq);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ext_oper_act_no, MST_WK_ACT_RECV_IF_R.$ext_oper_act_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$wk_intr_rmrks, MST_WK_ACT_RECV_IF_R.$intr_rmrks);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$abort_flg, MST_WK_ACT_RECV_IF_R.$abort_flg);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ext_wk_act_no, MST_WK_ACT_RECV_IF_R.$ext_wk_act_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$itm_cd, MST_WK_ACT_RECV_IF_R.$itm_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$itm_sub1, MST_WK_ACT_RECV_IF_R.$itm_sub1);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$itm_sub2, MST_WK_ACT_RECV_IF_R.$itm_sub2);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$itm_sub3, MST_WK_ACT_RECV_IF_R.$itm_sub3);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$lot_no, MST_WK_ACT_RECV_IF_R.$lot_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sublot_no, MST_WK_ACT_RECV_IF_R.$sublot_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sno1, MST_WK_ACT_RECV_IF_R.$sno1);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sno2, MST_WK_ACT_RECV_IF_R.$sno2);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sno3, MST_WK_ACT_RECV_IF_R.$sno3);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sno4, MST_WK_ACT_RECV_IF_R.$sno4);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$brk_pd, MST_WK_ACT_RECV_IF_R.$brk_pd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$wk_usr_dpt_cd, MST_WK_ACT_RECV_IF_R.$wk_usr_dpt_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$wk_usr_cd, MST_WK_ACT_RECV_IF_R.$wk_usr_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$wk_day_cd, MST_WK_ACT_RECV_IF_R.$wk_day_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$wk_cost, MST_WK_ACT_RECV_IF_R.$wk_cost);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$wk_rsn_cd, MST_WK_ACT_RECV_IF_R.$wk_rsn_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$wk_cost_cd, MST_WK_ACT_RECV_IF_R.$wk_cost_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$fclty, MST_WK_ACT_RECV_IF_R.$fclty);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$st_hm, MST_WK_ACT_RECV_IF_R.$st_hm);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$end_hm, MST_WK_ACT_RECV_IF_R.$end_hm);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$wk_cost_calc_upd_flg, MST_WK_ACT_RECV_IF_R.$wk_cost_calc_upd_flg);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$ac_dt, MST_WK_ACT_RECV_IF_R.$ac_dt);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$dpt_cd, MST_WK_ACT_RECV_IF_R.$dpt_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$loc_cd, MST_WK_ACT_RECV_IF_R.$loc_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$str_ln_cd, MST_WK_ACT_RECV_IF_R.$str_ln_cd);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char1, MST_WK_ACT_RECV_IF_R.$sub_char1);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char2, MST_WK_ACT_RECV_IF_R.$sub_char2);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char3, MST_WK_ACT_RECV_IF_R.$sub_char3);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char4, MST_WK_ACT_RECV_IF_R.$sub_char4);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char5, MST_WK_ACT_RECV_IF_R.$sub_char5);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char6, MST_WK_ACT_RECV_IF_R.$sub_char6);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char7, MST_WK_ACT_RECV_IF_R.$sub_char7);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char8, MST_WK_ACT_RECV_IF_R.$sub_char8);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char9, MST_WK_ACT_RECV_IF_R.$sub_char9);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char10, MST_WK_ACT_RECV_IF_R.$sub_char10);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char11, MST_WK_ACT_RECV_IF_R.$sub_char11);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char12, MST_WK_ACT_RECV_IF_R.$sub_char12);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char13, MST_WK_ACT_RECV_IF_R.$sub_char13);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char14, MST_WK_ACT_RECV_IF_R.$sub_char14);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char15, MST_WK_ACT_RECV_IF_R.$sub_char15);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char16, MST_WK_ACT_RECV_IF_R.$sub_char16);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char17, MST_WK_ACT_RECV_IF_R.$sub_char17);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char18, MST_WK_ACT_RECV_IF_R.$sub_char18);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char19, MST_WK_ACT_RECV_IF_R.$sub_char19);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char20, MST_WK_ACT_RECV_IF_R.$sub_char20);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char21, MST_WK_ACT_RECV_IF_R.$sub_char21);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char22, MST_WK_ACT_RECV_IF_R.$sub_char22);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char23, MST_WK_ACT_RECV_IF_R.$sub_char23);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char24, MST_WK_ACT_RECV_IF_R.$sub_char24);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char25, MST_WK_ACT_RECV_IF_R.$sub_char25);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char26, MST_WK_ACT_RECV_IF_R.$sub_char26);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char27, MST_WK_ACT_RECV_IF_R.$sub_char27);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char28, MST_WK_ACT_RECV_IF_R.$sub_char28);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char29, MST_WK_ACT_RECV_IF_R.$sub_char29);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_char30, MST_WK_ACT_RECV_IF_R.$sub_char30);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num1, MST_WK_ACT_RECV_IF_R.$sub_num1);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num2, MST_WK_ACT_RECV_IF_R.$sub_num2);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num3, MST_WK_ACT_RECV_IF_R.$sub_num3);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num4, MST_WK_ACT_RECV_IF_R.$sub_num4);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_num5, MST_WK_ACT_RECV_IF_R.$sub_num5);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt1, MST_WK_ACT_RECV_IF_R.$sub_dt1);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt2, MST_WK_ACT_RECV_IF_R.$sub_dt2);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt3, MST_WK_ACT_RECV_IF_R.$sub_dt3);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt4, MST_WK_ACT_RECV_IF_R.$sub_dt4);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$sub_dt5, MST_WK_ACT_RECV_IF_R.$sub_dt5);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$upd_srv_req_no, MST_WK_ACT_RECV_IF_R.$upd_srv_req_no);
				addColumnPathMap(MfgActRecvIf_Upd02_ActLstR.$upd_cntr, MST_WK_ACT_RECV_IF_R.$upd_cntr);
			}
		}

		protected void initMfgActRecvIf() {
			_operActIFIdx = null;
			_inptActIFIdx = null;
			_wkActIFIdx = null;
			_yieldActIFIdx = null;
			_operActIFL = MCList.create(MST_OPER_ACT_RECV_IF_R.class);
			_inptActIFL = MCList.create(MST_INPT_ACT_RECV_IF_R.class);
			_wkActIFL = MCList.create(MST_WK_ACT_RECV_IF_R.class);
			_yieldActIFL = MCList.create(MST_YIELD_ACT_RECV_IF_R.class);

			addSkipErrToRecvIF(_skipActL);
			addSkipErrToRecvIF(_errActL);
		}

		protected void lockMfgActRecvIf() {
			lockOperActRecvIf();
			lockInptActRecvIf();
			lockWkActRecvIf();
			lockYieldActRecvIf();
		}

		protected void delMfgActRecvIfWk() {
			delOperActRecvIfWk();
			delInptActRecvIfWk();
			delWkActRecvIfWk();
			delYieldActRecvIfWk();
		}

		protected void lockOperActRecvIf() {
			if (_operActIFL.isEmpty()) {
				return;
			}
			MSW_OPER_ACT_RECV_IF_KEY_R w1 = MSW_OPER_ACT_RECV_IF_KEY_R.create("W1");
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");

			dbWkDelete("MSLAL6220_MSW_OPER_ACT_RECV_IF_D01", _operActIFL_bldr.getBaseDbc());
			dbWkInsert("MSLAL6220_MSW_OPER_ACT_RECV_IF_I01", _operActIFL, _operActIFL_bldr.getBaseDbc());

			_operActIFL_bldr.addInnerJoin(w1, bracket(_operActIFL_t.data_lno.eq(w1.data_lno)));
			_operActIFL_bldr.addLeftOuterJoin(t2, _operActIFL_t.data_no.eq(t2.data_no));

			_operActIFL_bldr.setWhere(value(0).eq(value(0)));
			_operActIFL_bldr.addWhereWithAnd(bracket(t2.sdrv_sts_typ.isNull().or(
					t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			_operActIFL_bldr.addWhereWithAnd(_operActIFL_t.imp_flg.eq(value(true)));
			_operActIFL_bldr.addOrderByAsc(_operActIFL_t.data_lno);
			_operActIFL_bldr.setLockTable(_operActIFL_t.data_lno);
			
			dbSelectForUpdate("MSLAL6220_MST_OPER_ACT_RECV_IF_S02", _operActIFL, _operActIFL_bldr);

			_operActIFIdx = _operActIFL.createIndex(MST_OPER_ACT_RECV_IF_R.$data_lno);
		}

		protected void lockInptActRecvIf() {
			if (_inptActIFL.isEmpty()) {
				return;
			}
			MSW_INPT_ACT_RECV_IF_KEY_R w1 = MSW_INPT_ACT_RECV_IF_KEY_R.create("W1");
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");

			dbWkDelete("MSLAL6220_MSW_INPT_ACT_RECV_IF_D01", _inptActIFL_bldr.getBaseDbc());
			dbWkInsert("MSLAL6220_MSW_INPT_ACT_RECV_IF_I01", _inptActIFL, _inptActIFL_bldr.getBaseDbc());

			_inptActIFL_bldr.addInnerJoin(w1, bracket(_inptActIFL_t.data_lno.eq(w1.data_lno)));
			_inptActIFL_bldr.addLeftOuterJoin(t2, _inptActIFL_t.data_no.eq(t2.data_no));

			_inptActIFL_bldr.setWhere(value(0).eq(value(0)));
			_inptActIFL_bldr.addWhereWithAnd(bracket(t2.sdrv_sts_typ.isNull().or(
					t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			_inptActIFL_bldr.addWhereWithAnd(_inptActIFL_t.imp_flg.eq(value(true)));
			_inptActIFL_bldr.addOrderByAsc(_inptActIFL_t.data_lno);
			_inptActIFL_bldr.setLockTable(_inptActIFL_t.data_lno);

			dbSelectForUpdate("MSLAL6220_MSW_INPT_ACT_RECV_IF_S02", _inptActIFL, _inptActIFL_bldr);

			_inptActIFIdx = _inptActIFL.createIndex(MST_INPT_ACT_RECV_IF_R.$data_lno);
		}
		protected void lockWkActRecvIf() {
			if (_wkActIFL.isEmpty()) {
				return;
			}
			MSW_WK_ACT_RECV_IF_KEY_R w1 = MSW_WK_ACT_RECV_IF_KEY_R.create("W1");
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");

			dbWkDelete("MSLAL6220_MSW_WK_ACT_RECV_IF_D01", _wkActIFL_bldr.getBaseDbc());
			dbWkInsert("MSLAL6220_MSW_WK_ACT_RECV_IF_I01", _wkActIFL, _wkActIFL_bldr.getBaseDbc());

			_wkActIFL_bldr.addInnerJoin(w1, bracket(_wkActIFL_t.data_lno.eq(w1.data_lno)));
			_wkActIFL_bldr.addLeftOuterJoin(t2, _wkActIFL_t.data_no.eq(t2.data_no));

			_wkActIFL_bldr.setWhere(value(0).eq(value(0)));
			_wkActIFL_bldr.addWhereWithAnd(bracket(t2.sdrv_sts_typ.isNull().or(
					t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			_wkActIFL_bldr.addWhereWithAnd(_wkActIFL_t.imp_flg.eq(value(true)));
			_wkActIFL_bldr.addOrderByAsc(_wkActIFL_t.data_lno);
			_wkActIFL_bldr.setLockTable(_wkActIFL_t.data_lno);

			dbSelectForUpdate("MSLAL6220_MST_WK_ACT_RECV_IF_S02", _wkActIFL, _wkActIFL_bldr);

			_wkActIFIdx = _wkActIFL.createIndex(MST_WK_ACT_RECV_IF_R.$data_lno);
		}

		protected void lockYieldActRecvIf() {
			if (_yieldActIFL.isEmpty()) {
				return;
			}
			MSW_YIELD_ACT_RECV_IF_KEY_R w1 = MSW_YIELD_ACT_RECV_IF_KEY_R.create("W1");
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");

			dbWkDelete("MSLAL6220_MSW_YIELD_ACT_RECV_IF_D01", _yieldActIFL_bldr.getBaseDbc());
			dbWkInsert("MSLAL6220_MSW_YIELD_ACT_RECV_IF_I01", _yieldActIFL, _yieldActIFL_bldr.getBaseDbc());

			_yieldActIFL_bldr.addInnerJoin(w1, bracket(_yieldActIFL_t.data_lno.eq(w1.data_lno)));
			_yieldActIFL_bldr.addLeftOuterJoin(t2, _yieldActIFL_t.data_no.eq(t2.data_no));

			_yieldActIFL_bldr.setWhere(value(0).eq(value(0)));
			_yieldActIFL_bldr.addWhereWithAnd(bracket(t2.sdrv_sts_typ.isNull().or(
					t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			_yieldActIFL_bldr.addWhereWithAnd(_yieldActIFL_t.imp_flg.eq(value(true)));
			_yieldActIFL_bldr.addOrderByAsc(_yieldActIFL_t.data_lno);
			_yieldActIFL_bldr.setLockTable(_yieldActIFL_t.data_lno);
			
			dbSelectForUpdate("MSLAL6220_MST_YIELD_ACT_RECV_IF_S02", _yieldActIFL, _yieldActIFL_bldr);

			_yieldActIFIdx = _yieldActIFL.createIndex(MST_YIELD_ACT_RECV_IF_R.$data_lno);
		}

		protected void delOperActRecvIfWk() {
			if (_operActIFL.isEmpty()) {
				return;
			}

			dbWkDelete("MSLAL6220_MSW_OPER_ACT_RECV_IF_D02", _operActIFL_bldr.getBaseDbc());
		}

		protected void delInptActRecvIfWk() {
			if (_inptActIFL.isEmpty()) {
				return;
			}

			dbWkDelete("MSLAL6220_MSW_INPT_ACT_RECV_IF_D02", _inptActIFL_bldr.getBaseDbc());
		}

		protected void delWkActRecvIfWk() {
			if (_wkActIFL.isEmpty()) {
				return;
			}

			dbWkDelete("MSLAL6220_MSW_WK_ACT_RECV_IF_D02", _wkActIFL_bldr.getBaseDbc());
		}

		protected void delYieldActRecvIfWk() {
			if (_yieldActIFL.isEmpty()) {
				return;
			}

			dbWkDelete("MSLAL6220_MSW_YIELD_ACT_RECV_IF_D02", _yieldActIFL_bldr.getBaseDbc());
		}

		protected void addSkipErrToRecvIF(MCList<MfgActRecvIf_Upd02_ActLstR> ifL) {
			for (MfgActRecvIf_Upd02_ActLstR actR : ifL) {
				if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(actR.if_proc_typ())) {
					addOperActRecvIF(actR);
				}
				else if (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(actR.if_proc_typ())) {
					addInptActRecvIF(actR);
				}
				else if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(actR.if_proc_typ())) {
					addWkActRecvIF(actR);
				}
				else if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(actR.if_proc_typ())) {
					addYieldActRecvIF(actR);
				}
			}
		}

		protected void addOperActRecvIF(MfgActRecvIf_Upd02_ActLstR actR) {
			MST_OPER_ACT_RECV_IF_R ifR = MST_OPER_ACT_RECV_IF_R.create();
			ifR.data_lno(actR.data_lno());
			_operActIFL.add(ifR);
		}

		protected void addInptActRecvIF(MfgActRecvIf_Upd02_ActLstR actR) {
			MST_INPT_ACT_RECV_IF_R ifR = MST_INPT_ACT_RECV_IF_R.create();
			ifR.data_lno(actR.data_lno());
			_inptActIFL.add(ifR);
		}

		protected void addWkActRecvIF(MfgActRecvIf_Upd02_ActLstR actR) {
			MST_WK_ACT_RECV_IF_R ifR = MST_WK_ACT_RECV_IF_R.create();
			ifR.data_lno(actR.data_lno());
			_wkActIFL.add(ifR);
		}

		protected void addYieldActRecvIF(MfgActRecvIf_Upd02_ActLstR actR) {
			MST_YIELD_ACT_RECV_IF_R ifR = MST_YIELD_ACT_RECV_IF_R.create();
			ifR.data_lno(actR.data_lno());
			_yieldActIFL.add(ifR);
		}

		/**
		 * ＳＣＭ実績受信ＩＦ一括取込で取得した受信データが更新されていないか
		 * @param actR 取込対象行
		 * @return 更新された場合はtrue
		 */
		protected boolean isChkUpdCntr(MfgActRecvIf_Upd02_ActLstR actR) {
			if (!up1().src_actlumprecv_flg()) {
				return false;
			}

			// ＳＣＭ実績受信ＩＦ一括取込で取得したMESIF情報を取得する
			if (!isSame(actR.upd_srv_req_no(), MCSys.request.serverRequestNo())) {
				MCMessageList msgL = new MCMessageList();
				msgL.addAll(checkUpdCntrNE(actR, MSVT_MES_IF_R.$upd_cntr,
						MSLAL_SCMActRecvIfService.getMesIfR(actR.data_lno(),
								actR.data_no())));
				if (!msgL.isEmpty()) {
					MCMessagePool.addAll(msgL);
					// ＰＧ実行状況区分はエラーにしないが、エラー情報は積み上げる
					setErrFlag(actR);
					return true;
				}
			}
			return false;
		}

		/**
		 * 製造実績受信ＩＦ取込の後処理。
		 */
		protected void afterCall() {
			// 処理結果の保存
			updIf();

			// メッセージの出力
			MCMessageList msgList = MCMessagePool.getMessageList();
			_logger.writeDataLog(msgList);

			dbTran().commit();

			msgList.clear();
		}

		/**
		 * 製造実績受信ＩＦを更新する。
		 */
		protected void updIf() {
			// 更新対象テーブル
			MCList<MST_OPER_ACT_RECV_IF_R> operL = MCList.create(MST_OPER_ACT_RECV_IF_R.class);
			MST_OPER_ACT_RECV_IF_R operL_t = MST_OPER_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder operL_bldr = MCQueryApiBuilder.create(operL_t);
			MCList<MST_INPT_ACT_RECV_IF_R> inptL = MCList.create(MST_INPT_ACT_RECV_IF_R.class);
			MST_INPT_ACT_RECV_IF_R inptL_t = MST_INPT_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder inptL_bldr = MCQueryApiBuilder.create(inptL_t);
			MCList<MST_WK_ACT_RECV_IF_R> wkL = MCList.create(MST_WK_ACT_RECV_IF_R.class);
			MST_WK_ACT_RECV_IF_R wkL_t = MST_WK_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(wkL_t);
			MCList<MST_YIELD_ACT_RECV_IF_R> yieldL = MCList.create(MST_YIELD_ACT_RECV_IF_R.class);
			MST_YIELD_ACT_RECV_IF_R yieldL_t = MST_YIELD_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder yieldL_bldr = MCQueryApiBuilder.create(yieldL_t);

			// 更新データ設定
			setUpdIfData(operL, inptL, wkL, yieldL, _okActL);
			setUpdIfData(operL, inptL, wkL, yieldL, _errActL);
			setUpdIfData(operL, inptL, wkL, yieldL, _skipActL);

			// 更新処理の実行
			if (!isNull(operL)) {
				operL_bldr.setSet(
						operL_t.imp_flg,
						operL_t.exe_sts_typ,
						operL_t.batch_log_no,
						operL_t.log_sub_key1,
						operL_t.log_sub_key2
						);
				dbUpdateKey("MSLAL6220_MST_OPER_ACT_RECV_IF_U01", operL, operL_bldr);
			}
			if (!isNull(inptL)) {
				inptL_bldr.setSet(
						inptL_t.imp_flg,
						inptL_t.exe_sts_typ,
						inptL_t.batch_log_no,
						inptL_t.log_sub_key1,
						inptL_t.log_sub_key2)
				;
				dbUpdateKey("MSLAL6220_MST_INPT_ACT_RECV_IF_U01", inptL, inptL_bldr);
			}
			if (!isNull(wkL)) {
				wkL_bldr.setSet(
						wkL_t.imp_flg,
						wkL_t.exe_sts_typ,
						wkL_t.batch_log_no,
						wkL_t.log_sub_key1,
						wkL_t.log_sub_key2
						);
				dbUpdateKey("MSLAL6220_MST_WK_ACT_RECV_IF_U01", wkL, wkL_bldr);
			}
			if (!isNull(yieldL)) {
				yieldL_bldr.setSet(
						yieldL_t.imp_flg,
						yieldL_t.exe_sts_typ,
						yieldL_t.batch_log_no,
						yieldL_t.log_sub_key1,
						yieldL_t.log_sub_key2
						);
				dbUpdateKey("MSLAL6220_MST_YIELD_ACT_RECV_IF_U01", yieldL, yieldL_bldr);
			}

			_okActL.clear();
			_errActL.clear();
			_skipActL.clear();
		}

		protected String[] getOperUpdIfCols() {
			return new String[] {
					MST_OPER_ACT_RECV_IF_R.$imp_flg,
					MST_OPER_ACT_RECV_IF_R.$exe_sts_typ,
					MST_OPER_ACT_RECV_IF_R.$batch_log_no,
					MST_OPER_ACT_RECV_IF_R.$log_sub_key1,
					MST_OPER_ACT_RECV_IF_R.$log_sub_key2
			};
		}

		protected String[] getInptUpdIfCols() {
			return new String[] {
					MST_INPT_ACT_RECV_IF_R.$imp_flg,
					MST_INPT_ACT_RECV_IF_R.$exe_sts_typ,
					MST_INPT_ACT_RECV_IF_R.$batch_log_no,
					MST_INPT_ACT_RECV_IF_R.$log_sub_key1,
					MST_INPT_ACT_RECV_IF_R.$log_sub_key2
			};
		}

		protected String[] getWkUpdIfCols() {
			return new String[] {
					MST_WK_ACT_RECV_IF_R.$imp_flg,
					MST_WK_ACT_RECV_IF_R.$exe_sts_typ,
					MST_WK_ACT_RECV_IF_R.$batch_log_no,
					MST_WK_ACT_RECV_IF_R.$log_sub_key1,
					MST_WK_ACT_RECV_IF_R.$log_sub_key2
			};
		}

		protected String[] getYieldUpdIfCols() {
			return new String[] {
					MST_YIELD_ACT_RECV_IF_R.$imp_flg,
					MST_YIELD_ACT_RECV_IF_R.$exe_sts_typ,
					MST_YIELD_ACT_RECV_IF_R.$batch_log_no,
					MST_YIELD_ACT_RECV_IF_R.$log_sub_key1,
					MST_YIELD_ACT_RECV_IF_R.$log_sub_key2
			};
		}

		protected void setUpdIfData(MCList<MST_OPER_ACT_RECV_IF_R> operL, 
				MCList<MST_INPT_ACT_RECV_IF_R> inptL, 
				MCList<MST_WK_ACT_RECV_IF_R> wkL, 
									MCList<MST_YIELD_ACT_RECV_IF_R> yieldL, 
									MCList<MfgActRecvIf_Upd02_ActLstR> rstL) {
			if (isNull(rstL)) {
				return;
			}

			for (MfgActRecvIf_Upd02_ActLstR rstR : rstL) {
				if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(rstR.if_proc_typ())) {
					MST_OPER_ACT_RECV_IF_R uR = MST_OPER_ACT_RECV_IF_R.create();
					uR.data_lno(rstR.data_lno());
					uR.imp_flg(rstR.imp_flg());
					uR.exe_sts_typ(rstR.exe_sts_typ());
					uR.batch_log_no(rstR.batch_log_no());
					uR.log_sub_key1(rstR.log_sub_key1());
					uR.log_sub_key2(rstR.log_sub_key2());
					operL.add(uR);
				}
				else if (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(rstR.if_proc_typ())) {
					MST_INPT_ACT_RECV_IF_R uR = MST_INPT_ACT_RECV_IF_R.create();
					uR.data_lno(rstR.data_lno());
					uR.imp_flg(rstR.imp_flg());
					uR.exe_sts_typ(rstR.exe_sts_typ());
					uR.batch_log_no(rstR.batch_log_no());
					uR.log_sub_key1(rstR.log_sub_key1());
					uR.log_sub_key2(rstR.log_sub_key2());
					inptL.add(uR);
				}
				else if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(rstR.if_proc_typ())) {
					MST_WK_ACT_RECV_IF_R uR = MST_WK_ACT_RECV_IF_R.create();
					uR.data_lno(rstR.data_lno());
					uR.imp_flg(rstR.imp_flg());
					uR.exe_sts_typ(rstR.exe_sts_typ());
					uR.batch_log_no(rstR.batch_log_no());
					uR.log_sub_key1(rstR.log_sub_key1());
					uR.log_sub_key2(rstR.log_sub_key2());
					wkL.add(uR);
				}
				else if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(rstR.if_proc_typ())) {
					MST_YIELD_ACT_RECV_IF_R uR = MST_YIELD_ACT_RECV_IF_R.create();
					uR.data_lno(rstR.data_lno());
					uR.imp_flg(rstR.imp_flg());
					uR.exe_sts_typ(rstR.exe_sts_typ());
					uR.batch_log_no(rstR.batch_log_no());
					uR.log_sub_key1(rstR.log_sub_key1());
					uR.log_sub_key2(rstR.log_sub_key2());
					yieldL.add(uR);
				}
			}
		}

		protected void setMfgActLogKey(MCList<MfgActRecvIf_Upd02_ActLstR> actL) {
			if (actL.isEmpty()) {
				return;
			}

			for (MfgActRecvIf_Upd02_ActLstR actR : actL) {
				actR.setParamIndex(_no);
			}

			_logger.setLogKey(actL,
					MfgActRecvIf_Upd02_ActLstR.$batch_log_no,
					MfgActRecvIf_Upd02_ActLstR.$log_sub_key1,
					MfgActRecvIf_Upd02_ActLstR.$log_sub_key2);
		}

		/**
		 * 工程実績の完了処理を行う。
		 */
		protected void cmplOperAct() {
			if (getOperActInstNoM().isEmpty()) {
				return;
			}

			// インスタンス生成
			MSBCL_MfgActRcptIFService.MfgActIF_Upd04 upd04 = MSBCL_MfgActRcptIFService.crtMfgActIF_Upd04();
			upd04.up0().is_src_batch_flg(true);		// 呼出元バッチ処理
			upd04.up0().upd_cntr_chk_flg(false);	// 更新カウンタチェック
			upd04.up0().not_commit_flg(false);		// コミットしない

			MCList<MST_OPER_ACT_R> dbcL = MCList.create(MST_OPER_ACT_R.class);
			MST_OPER_ACT_R dbcL_t = MST_OPER_ACT_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(dbcL_t);
			// 対象工程実績を上り電文に設定
			MCNumber pegno = MCNumber.ZERO;
			for (Map.Entry<String, String> entry : getOperActInstNoM().entrySet()) {
				MfgActIF_Upd04_DtlOperR uoR = upd04.up1().add();
				uoR.peg_no(pegno);
				uoR.oper_act_no(entry.getKey());

				pegno = pegno.add(1);
				MST_OPER_ACT_R dbcR = MST_OPER_ACT_R.create();
				dbcR.oper_act_no(uoR.oper_act_no());
				dbcL.add(dbcR);
			}
			if (!dbcL.isEmpty()) {
				dbWkDelete("MSLAL6220_MSW_OPER_ACT_D01", dbcL_bldr.getBaseDbc());
				dbWkInsert("MSLAL6220_MSW_OPER_ACT_I01", dbcL, dbcL_bldr.getBaseDbc());
				
				// 処理対象の工程実績と同じ製造実績に紐付く工程実績を抽出（処理対象に含まれるものは除く）
				MCList<MST_OPER_ACT_R> operL = MCList.create(MST_OPER_ACT_R.class);
				MST_OPER_ACT_R operL_t = MST_OPER_ACT_R.create("T");
				MST_OPER_ACT_R t1 = MST_OPER_ACT_R.create("T1");
				MSW_OPER_ACT_KEY_R t2 = MSW_OPER_ACT_KEY_R.create("T2");
				MSW_OPER_ACT_KEY_R S1T3 = MSW_OPER_ACT_KEY_R.create("T3");
				MCQueryApiBuilder operL_bldr = MCQueryApiBuilder.create(operL_t);
				operL_bldr.setSelect(operL_t.oper_act_no);
				operL_bldr.addInnerJoin(t1, bracket(t1.mfg_act_no.eq(operL_t.mfg_act_no)));
				operL_bldr.addInnerJoin(t2, bracket(t2.oper_act_no.eq(t1.oper_act_no)));
				operL_bldr.addWhereWithAnd(notExists(subQuery()
											.select(S1T3.oper_act_no)
											.from(S1T3)
											.where(S1T3.oper_act_no.eq(operL_t.oper_act_no))));
				dbSelect("MSLAL6220_MST_OPER_ACT_S04", operL, operL_bldr);
				
				for (MST_OPER_ACT_R operR : operL) {
					MfgActIF_Upd04_DtlOperR uoR = upd04.up1().add();
					uoR.peg_no(pegno);
					uoR.oper_act_no(operR.oper_act_no());
					pegno = pegno.add(1);
				}
			}

			// 実行
			upd04.exec();

		}

		/**
		 * 初期化処理
		 */
		protected void initProc() {
			_errNum = _errActL.size();

			initLogger();

			setMfgActLogKey(_errActL);
			setMfgActLogKey(up0());
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
	 * MfgActRecvIf_Upd04オペレーション.<p>
	 *
	 * 製造実績（工程・投入・工数・出来高）受信ＩＦ取込を行う。（製造実績受信ＩＦサービスを呼び出す本処理）<br>
	 */
	public class MfgActRecvIf_Upd04 extends MSLAL_MfgActRecvIfService_MC_A.MfgActRecvIf_Upd04 {
		/** 工程・出来高の実績登録ＦＬＧ **/
		protected boolean _operYieldActFlg = false;

		/** 製造指図コンテナリスト **/
		protected MCList<MST_MFG_INST_R> _mfgInstL = MCList.create(MST_MFG_INST_R.class);
		protected MST_MFG_INST_R _mfgInstL_t = MST_MFG_INST_R.create("T");
		protected MCQueryApiBuilder _mfgInstL_bldr = MCQueryApiBuilder.create(_mfgInstL_t);
		/** 製造実績コンテナリスト **/
		protected MCList<MST_MFG_ACT_R> _mfgActL = MCList.create(MST_MFG_ACT_R.class);
		protected MST_MFG_ACT_R _mfgActL_t = MST_MFG_ACT_R.create("T");
		protected MCQueryApiBuilder _mfgActL_bldr = MCQueryApiBuilder.create(_mfgActL_t);
		/** 製造実績残コンテナリスト **/
		protected MCList<MST_MFG_ACT_REM_R> _mfgActRemL = MCList.create(MST_MFG_ACT_REM_R.class);
		protected MST_MFG_ACT_REM_R _mfgActRemL_t = MST_MFG_ACT_REM_R.create("T");
		protected MCQueryApiBuilder _mfgActRemL_bldr = MCQueryApiBuilder.create(_mfgActRemL_t);

		protected MCIndexKey _mfgInstIdx = null;
		protected MCIndexKey _mfgActIdx = null;
		protected MCIndexKey _mfgActRemIdx = null;

		/** 製造実績ＮＯ **/
		protected String _mfgActNo = null;
		/** 製造指図ＮＯ **/
		protected String _mfgInstNo = null;
		/** 製造指図コンテナ **/
		protected MST_MFG_INST_R _mfgInstR = null;
		/** 製造実績コンテナ **/
		protected MST_MFG_ACT_R _mfgActR = null;
		/** 製造実績残コンテナ **/
		protected MST_MFG_ACT_REM_R _mfgActRemR = null;

		/** 製造実績（投入・工数）の登録・訂正オペレーション **/
		protected MSBCL_MfgActRcptIFService.MfgActIF_Upd01 _mfgUpd01 = null;
		/** 製造実績（工程・出来高）の登録・訂正オペレーション **/
		protected MSBCL_MfgActRcptIFService.MfgActIF_Upd03 _mfgUpd03 = null;
		/** 製造実績の取消オペレーション **/
		protected MSBCL_MfgActRcptIFService.MfgActIF_Del01 _mfgDel01 = null;

		/** 製造実績ヘッダ **/
		protected MfgActIF_Upd01_HdrR _mfgHdrR = null;

		/** 受信実績スキップリスト（工程実績取消によるもの） **/
		protected MCList<MfgActRecvIf_Upd02_ActLstR> _skipByOpDelL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);

		/** 製造指図ヘッダ紐づけＮＯ **/
		protected MCNumber _hdrPegNo = MCNumber.ZERO;
		/** 製造紐づけＮＯと製造指図ＮＯの関連マップ **/
		protected Map<MCNumber, String> _mfgPegNoM = new HashMap<MCNumber, String>();
		/** 工程紐づけＮＯと工程指図ＮＯの関連マップ **/
		protected Map<MCNumber, String> _operPegNoM = new HashMap<MCNumber, String>();
		/** 製造実績登録結果「指図ＮＯ：実績ＮＯ」マップ **/
		protected Map<String, String> _regMfgRstM = new HashMap<String, String>();

		/** エラー発生製造指図ＮＯセット **/
		protected Set<String> _errMfgInstNoS = new HashSet<String>();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 準備
			initProc();
			// 実行
			procActReg();
			// 結果
			setDown();
		}

		/**
		 * 初期化処理
		 */
		protected void initProc() {
			// 工程・出来高の実績登録ＦＬＧ 
			_operYieldActFlg = up1().getBooleanNE("oper_yield_act_flg");

			// 製造ヘッダの取得、製造指図のロック
			lockMfgHdr();
		}

		protected void lockMfgHdr() {
			MCList<MfgActRecvIf_Upd02_ActLstR> instNoL = up0().groupBy(getMfgInstNoGrpPolicy());

			// 製造指図のロック
			if (!instNoL.isEmpty()) {
				dbSelectKeyForUpdate("MSLAL6220_MST_MFG_INST_S01", _mfgInstL, _mfgInstL_bldr, instNoL);
				_mfgInstIdx = _mfgInstL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			}

			// ロックしている間に他スレッドで製造実績が登録された場合を考慮し、製造実績ＮＯを取得し直す
			for (MfgActRecvIf_Upd02_ActLstR inR : up0()) {
				if (!isNull(inR.mfg_inst_no()) && isNull(inR.mfg_act_no())) {
					getMfgActNo(inR);
				}
			}
			
			instNoL = up0().groupBy(getMfgInstNoGrpPolicy());
			MCList<MfgActRecvIf_Upd02_ActLstR> actNoL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);

			for (MfgActRecvIf_Upd02_ActLstR inR : instNoL) {
				if (!isNull(inR.mfg_inst_no())) {
					actNoL.add(inR);
				}
			}
			// 製造実績のロック
			if (!actNoL.isEmpty()) {
				dbSelectKeyForUpdate("MSLAL6220_MST_MFG_ACT_REM_S02", _mfgActL, _mfgActL_bldr, actNoL);
				dbSelectKey("MSLAL6220_MST_MFG_ACT_REM_S01", _mfgActRemL, _mfgActRemL_bldr, _mfgActL);
				_mfgActIdx = _mfgActL.createIndex(MST_MFG_ACT_R.$mfg_act_no);
				_mfgActRemIdx = _mfgActRemL.createIndex(MST_MFG_ACT_REM_R.$mfg_inst_no, MST_MFG_ACT_REM_R.$div_seq);
			}
		}

		protected void getMfgActNo(MfgActRecvIf_Upd02_ActLstR actR) {
			MCList<MST_MFG_ACT_R> maL = MCList.create(MST_MFG_ACT_R.class);
			MST_MFG_ACT_R t = MST_MFG_ACT_R.create("T");
			MCQueryApiBuilder maL_bldr = MCQueryApiBuilder.create(t);

			maL_bldr.setSelect(t.mfg_act_no);
			maL_bldr.addSelect(t.div_seq);
			maL_bldr.setWhere(t.mfg_inst_no.eq(bind("1")), actR.mfg_inst_no());

			int cnt = dbSelect("MSLAL6220_MST_MFG_ACT_S01", maL, maL_bldr);
			if (cnt == 1 && maL.get(0).div_seq().eq(1)) {
				actR.mfg_act_no(maL.get(0).mfg_act_no());
			}
		}

		protected MCGroupByPolicy getMfgInstNoGrpPolicy() {
			MCGroupByPolicy gbp = new MCGroupByPolicy(MfgActRecvIf_Upd02_ActLstR.$mfg_inst_no);

			gbp.max(MfgActRecvIf_Upd02_ActLstR.$mfg_act_no);

			return gbp;
		}

		/**
		 * 登録処理
		 */
		protected void procActReg() {
			MCSavepoint sp = null;

			try {
				sp = setSavepoint();

				initCache(_mfgInstL, _mfgActL);

				callThisChk01();

				regMfgAct();
			}
			catch (Exception ex) {
				handleEx(ex, sp);
			}
			finally {
				sp = null;
				clearCache();
			}
		}

		protected void callThisChk01() {
			// チェック実行
			MSLAL_MfgActRecvIfService.MfgActRecvIf_Chk01 chkOpe = MSLAL_MfgActRecvIfService.crtMfgActRecvIf_Chk01();
			chkOpe.up0().setAll(up0());
			chkOpe.exec();

			// チェック結果
			up0().clear();
			for (MfgActRecvIf_Upd02_ActLstR dnR : chkOpe.down0()) {
				if (dnR.err_flg()) {
					down0().add(createDownR(dnR, false));
					continue;
				}

				up0().add(dnR);
			}
		}

		/**
		 * 受信実績のデータを登録する。
		 */
		protected void regMfgAct() {
			if (up0().isEmpty()) {
				return;
			}

			// 実績登録を行う。
			if (_operYieldActFlg) {
				regOperYieldAct();
			}
			else {
				regInptWkAct();
			}
		}

		protected void regOperYieldAct() {
			// 1. インスタンス生成
			crtUpd03Instance();
			crtDel01Instance();

			// 2. 電文データ生成
			crtOperYieldTelegram();

			// 3. 登録実行
			execUpd03MfgAct();
			execDel01MfgAct();

			// 4. 結果設定
			getUpd03ExecRst();
			getDel01ExecRst();
		}

		protected void crtOperYieldTelegram() {
			for (MCList<MfgActRecvIf_Upd02_ActLstR> mfgInstL : up0().groupList(MfgActRecvIf_Upd02_ActLstR.$mfg_inst_no)) {
				// 工程・出来高・品目の順でソートする
				mfgInstL.sort(getRegSortPolicy(true));

				getRegActTarget(mfgInstL.get(0));

				// 新規
				if (isInsMfgAct()) {
					makeUpd03InsMfgActData(mfgInstL);
					continue;
				}

				// 取消
				if (isDelAllYieldAllOper(mfgInstL)) {
					makeDel01MfgActData();
					continue;
				}

				// 訂正
				makeUpd03MdfMfgActData(mfgInstL);
			}
			editOperActData();
			
			// paramRowIndexの設定
			setParamRowIndexForOperYield();
		}

		/**
		 * 未完了ＦＬＧを、実績登録対象の工程指図ＮＯごとに最後に処理する未完了ＦＬＧに統一する
		 */
		protected void editOperActData() {
			for (MCList<MfgActIF_Upd03_Hdr1R> tgtL : _mfgUpd03.up1().groupList(MfgActIF_Upd03_Hdr1R.$oper_inst_no)) {
				MCNumber maxPegNo = (MCNumber)tgtL.max(MfgActIF_Upd03_Hdr1R.$peg_no);
				boolean latestNotCmplFlg = tgtL.getFirst(MfgActIF_Upd03_Hdr1R.$peg_no, maxPegNo).not_cmpl_flg();
				tgtL.setBooleanNE(MfgActIF_Upd03_Hdr1R.$not_cmpl_flg, latestNotCmplFlg);
			}
		}

		protected void regInptWkAct() {
			// 1. インスタンス生成
			crtUpd01Instance();
			crtDel01Instance();

			// 2. 電文データ生成
			crtInptWkTelegram();

			// 3. 登録実行
			execUpd01MfgAct();
			execDel01MfgAct();

			// 4. 結果設定
			getUpd01ExecRst();
			getDel01ExecRst();
		}

		protected void crtInptWkTelegram() {
			for (MCList<MfgActRecvIf_Upd02_ActLstR> mfgInstL : up0().groupList(MfgActRecvIf_Upd02_ActLstR.$mfg_inst_no)) {
				// 工程・投入・工数・品目の順でソートする
				mfgInstL.sort(getRegSortPolicy(false));

				getRegActTarget(mfgInstL.get(0));

				// 新規
				if (isInsMfgAct()) {
					makeUpd01InsMfgActData(mfgInstL);
					continue;
				}

				// 取消
				if (isDelMfgAct(mfgInstL)) {
					makeDel01MfgActData();
					continue;
				}

				// 訂正
				makeUpd01MdfMfgActData(mfgInstL);
			}
			
			// paramRowIndexの設定
			setParamRowIndexForInptWk();
		}
		
		/**
		 * paramIndex/paramRowIndex設定処理（工程・出来高実績用）
		 * 製造実績受信ＩＦサービスへの電文でparamIndex/paramRowIndexが未指定の場合はセットする
		 */
		protected void setParamRowIndexForOperYield() {
			List<MCContainer> upCL = new ArrayList<MCContainer>();
			upCL.add(_mfgUpd03.up0());
			upCL.add(_mfgUpd03.up1());
			upCL.add(_mfgUpd03.up2());
			upCL.add(_mfgUpd03.up3());
			setParamRowIndexBody(upCL);
		}
		
		/**
		 * paramIndex/paramRowIndex設定処理（投入・工数実績用）
		 * 製造実績受信ＩＦサービスへの電文でparamIndex/paramRowIndexが未指定の場合はセットする
		 */
		protected void setParamRowIndexForInptWk() {
			List<MCContainer> upCL = new ArrayList<MCContainer>();
			upCL.add(_mfgUpd01.up0());
			upCL.add(_mfgUpd01.up1());
			upCL.add(_mfgUpd01.up2());
			upCL.add(_mfgUpd01.up3());
			upCL.add(_mfgUpd01.up4());
			upCL.add(_mfgUpd01.up5());
			upCL.add(_mfgUpd01.up6());
			upCL.add(_mfgUpd01.up7());
			upCL.add(_mfgUpd01.up8());
			setParamRowIndexBody(upCL);
		}
		
		/**
		 * paramIndex/paramRowIndex設定処理本体
		 * @param upCL
		 */
		protected void setParamRowIndexBody(List<MCContainer> upCL) {
			int idx = 0;
			for (MCContainer upC : upCL) {
				int rIdx = 0;
				if (upC instanceof MCList) {
					for (Object o : (MCList<?>) upC) {
						if (o instanceof MCRow) {
							MCRow upR = (MCRow) o;
							if (upR.getParamIndex() < 0) {
								upR.setParamIndex(idx);
							}
							if (upR.getParamRowIndex() < 0) {
								upR.setParamRowIndex(rIdx++);
							}
						}
					}
				}
				idx++;
			}
		}

		protected MCSortPolicy getRegSortPolicy(boolean isOperYieldFlg) {
			MCSortPolicy stPlcy = new MCSortPolicy();

			stPlcy.add(SortType.ASC_NULL_AHEAD, MfgActRecvIf_Upd02_ActLstR.$oper_inst_no);

			if (isOperYieldFlg) {
				stPlcy.add(SortType.ASC_NULL_AHEAD, MfgActRecvIf_Upd02_ActLstR.$yield_typ);
				stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$oper_act_no);
				stPlcy.add(SortType.ASC_NULL_AHEAD, MfgActRecvIf_Upd02_ActLstR.$yield_schd_no);
				stPlcy.add(SortType.ASC_NULL_AHEAD, MfgActRecvIf_Upd02_ActLstR.$yield_act_no);
				stPlcy.add(SortType.ASC_NULL_AHEAD, MfgActRecvIf_Upd02_ActLstR.$ext_yield_act_no);
			}
			else {
				stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$oper_act_no);
				stPlcy.add(SortType.ASC_NULL_AHEAD, MfgActRecvIf_Upd02_ActLstR.$wk_schd_no);
				stPlcy.add(SortType.ASC_NULL_AHEAD, MfgActRecvIf_Upd02_ActLstR.$wk_act_no);
				stPlcy.add(SortType.ASC_NULL_AHEAD, MfgActRecvIf_Upd02_ActLstR.$ext_wk_act_no);
				stPlcy.add(SortType.ASC_NULL_AHEAD, MfgActRecvIf_Upd02_ActLstR.$inpt_schd_no);
				stPlcy.add(SortType.ASC_NULL_AHEAD, MfgActRecvIf_Upd02_ActLstR.$inpt_act_no);
				stPlcy.add(SortType.ASC_NULL_AHEAD, MfgActRecvIf_Upd02_ActLstR.$ext_inpt_act_no);
				stPlcy.add(SortType.ASC_NULL_AHEAD, MfgActRecvIf_Upd02_ActLstR.$if_inpt_typ);
			}

			stPlcy.add(SortType.ASC_NULL_AHEAD, MfgActRecvIf_Upd02_ActLstR.$itm_cd);
			stPlcy.add(SortType.ASC_NULL_AHEAD, MfgActRecvIf_Upd02_ActLstR.$itm_sub1);
			stPlcy.add(SortType.ASC_NULL_AHEAD, MfgActRecvIf_Upd02_ActLstR.$itm_sub2);
			stPlcy.add(SortType.ASC_NULL_AHEAD, MfgActRecvIf_Upd02_ActLstR.$itm_sub3);
			stPlcy.add(SortType.ASC_NULL_AHEAD, MfgActRecvIf_Upd02_ActLstR.$act_tm);

			return stPlcy;
		}

		protected void getRegActTarget(MfgActRecvIf_Upd02_ActLstR actR) {
			// 実績登録対象
			_mfgInstNo = actR.mfg_inst_no();
			_mfgActNo = actR.mfg_act_no();
			_mfgInstR = _mfgInstL.getFirst(_mfgInstIdx, _mfgInstNo);
			if (_mfgActNo != null) {
				_mfgActR = _mfgActL.getFirst(_mfgActIdx, _mfgActNo);
				_mfgActRemR = _mfgActRemL.getFirst(_mfgActRemIdx, _mfgActR.mfg_inst_no(), _mfgActR.div_seq());
			}
		}

		/**
		 * 製造実績の新規登録であるかどうか判断する。
		 * @return true: 製造実績新規登録, false: それ以外
		 */
		protected boolean isInsMfgAct() {
			if (_mfgActNo != null) {
				return false;
			}

			return true;
		}

		/**
		 * 全出来高を取消、かつ、出来高の全工程実績作成がオンの場合、
		 * 製造実績の全取消と判断する。
		 * @return true: 製造実績の全取消, false: それ以外
		 */
		protected boolean isDelAllYieldAllOper(MCList<MfgActRecvIf_Upd02_ActLstR> mfgInstL) {
			boolean delAllYield = true;
			boolean allOperFlg = false;

			// 受信した出来高実績は全て「取消」である。
			Set<String> yaDelS = new HashSet<String>();
			for (MfgActRecvIf_Upd02_ActLstR actR : mfgInstL) {
				if (!MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(actR.if_proc_typ())) {
					continue;
				}

				if (!MAC_DATA_CRUD_TYP.isDEL(actR.data_crud_typ())) {
					delAllYield = false;
					break;
				}

				if (actR.all_oper_act_reg_flg() || actR.unschd_act_flg()) {
					allOperFlg = true;
				}

				yaDelS.add(actR.yield_act_no());
			}

			// 全工程実績作成がオン、かつ、登録済の出来高実績を全て取り消す。
			if (delAllYield && allOperFlg) {
				MCList<MCRow> actDBL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_YIELD_ACT_RECV.value(), _mfgActNo));
				for (int ai = 0 ; ai < actDBL.size() ; ai++) {
					MST_YIELD_ACT_R actR = (MST_YIELD_ACT_R)actDBL.get(ai);
					if (MAC_YIELD_TYP.isBYPROD(actR.yield_typ())) {
						continue;
					}

					if (!yaDelS.contains(actR.yield_act_no()) && !actR.getBooleanNE("unschd_act_flg")) {
						delAllYield = false;
						break;
					}
				}
			}

			if (!delAllYield || !allOperFlg) {
				return false;
			}

			return true;
		}

		/**
		 * 製造実績の全取消であるかどうか判断する。<br>
		 * なお、工程取消の場合、配下の投入・工数受信実績をスキップ（無視）する。<br>
		 * （ＤＢ実績キャッシュで電文作成）
		 * @return true: 製造実績の全取消, false: それ以外
		 */
		protected boolean isDelMfgAct(MCList<MfgActRecvIf_Upd02_ActLstR> mfgInstL) {
			boolean isDelAll = true;

			// 取消工程の工程実績ＮＯSet
			Set<String> oaDelS = new HashSet<String>();

			// 1.1. 取消ではない工程実績を受信した場合、全取消ではないと判断する。
			for (MfgActRecvIf_Upd02_ActLstR actR : mfgInstL) {
				if (!MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(actR.if_proc_typ())) {
					continue;
				}

				if (MAC_DATA_CRUD_TYP.isDEL(actR.data_crud_typ())) {
					oaDelS.add(actR.oper_act_no());
				}
				else {
					isDelAll = false;
				}
			}

			// 1.2. 工程取消を受信した場合、工程実績配下の受信実績をスキップ（無視）する。（ＤＢ実績キャッシュで電文作成）
			for (int i = mfgInstL.size() -1 ; i >= 0 ; i--) {
				if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(mfgInstL.get(i).if_proc_typ())) {
					continue;
				}

				if (oaDelS.contains(mfgInstL.get(i).oper_act_no())) {
					MfgActRecvIf_Upd02_ActLstR skipR = mfgInstL.get(i);
					// 取消ではない行をスキップした場合は、スキップメッセージを作成
					if (!MAC_DATA_CRUD_TYP.isDEL(skipR.data_crud_typ())) {
						skipR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
						MCMessagePool.add(skipR, null, MSLAL0073, skipR.if_proc_typ(), skipR.data_no(), skipR.data_lno());
						_skipByOpDelL.add(mfgInstL.remove(i));
					}

					continue;
				}
			}

			if (isDelAll) {
				// 2.1. 登録済の工程実績、取消の受信データがない場合、全取消ではないと判断する。
				MCList<MCRow> actOperL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value(), _mfgActNo));
				for (int ai = 0 ; ai < actOperL.size() ; ai++) {
					if (!oaDelS.contains(((MST_OPER_ACT_R)actOperL.get(ai)).oper_act_no())) {
						isDelAll = false;
						break;
					}
				}
			}

			return isDelAll;
		}

		/**
		 * 工程・出来高の新規登録用電文を作成する。
		 */
		protected void makeUpd03InsMfgActData(MCList<MfgActRecvIf_Upd02_ActLstR> mfgInstL) {
			MCDate maxDate = null;
			MfgActRecvIf_Upd02_ActLstR yieldR = null;
			MCList<MfgActRecvIf_Upd02_ActLstR> yieldL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);

			for (MfgActRecvIf_Upd02_ActLstR actR : mfgInstL) {
				if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(actR.if_proc_typ())) {
					makeUpd03InsOperActData(actR);
				}
				else if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(actR.if_proc_typ())) {
					makeUpd03InsYieldActData(actR);

					maxDate = getMaxDate(maxDate, actR.act_tm(), MCDateFieldType.MINUTE);

					if (!MAC_YIELD_TYP.isBYPROD(actR.yield_typ())) {
						yieldL.add(actR);
					}
					if (yieldR == null) {
						if (!MAC_YIELD_TYP.isBYPROD(actR.yield_typ())) {
							yieldR = actR.clone();
						}
						continue;
					}

					setUpd03YieldValidHdrItems(yieldR, actR);
				}
			}

			// 出来高受信実績により、ヘッダ項目再設定や工程実績電文追加
			setUpd03InsOperActByYield(yieldR, yieldL);
		}

		protected void makeUpd03InsOperActData(MfgActRecvIf_Upd02_ActLstR actR) {
			_mfgUpd03.up1().add(makeUpd03InsOperActTelegram(actR, true));
		}

		protected MfgActIF_Upd03_Hdr1R makeUpd03InsOperActTelegram(MfgActRecvIf_Upd02_ActLstR actR, boolean isOper) {
			MfgActIF_Upd03_Hdr1R hdr1R = MfgActIF_Upd03_Hdr1R.create();

			MST_OPER_INST_R oiR = (MST_OPER_INST_R)getSchdRCache(
					getCacheKey(MAC_IF_PROC_TYP.MES_OPER_INST_SEND.value(), actR.oper_inst_no()));

			hdr1R.peg_no(_hdrPegNo);										// 工程紐付けＮＯ

			// ヘッダ紐付けＮＯと製造指図ＮＯの保持
			_mfgPegNoM.put(_hdrPegNo, _mfgInstNo);
			_hdrPegNo = _hdrPegNo.add(1);

			// 計画外製造実績において、工程のＭＥＳＦＬＧは常にオン
			if (actR.unschd_act_flg()) {
				hdr1R.mes_flg(true);										// ＭＥＳ
				hdr1R.ext_sys_cd(null);										// 外部システムＣＤ
				hdr1R.ext_oper_act_no(null);								// 外部工程実績ＮＯ
				hdr1R.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());			// 製造状況区分
			}
			else {
				hdr1R.mes_flg(true);										// ＭＥＳ
				hdr1R.ext_sys_cd(actR.ext_sys_cd());						// 外部システムＣＤ
				hdr1R.ext_oper_act_no(actR.ext_oper_act_no());				// 外部工程実績ＮＯ
				hdr1R.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());				// 製造状況区分
			}

			// 受信実績から設定する共通項目
			hdr1R.base_unit_st_act_qty(_mfgInstR.base_unit_inst_qty());		// 着手数量 ＝＞ 基準単位製造指図数量とする。
			hdr1R.rem_abort_flg(false);										// 残数打切
			hdr1R.oper_inst_no(actR.oper_inst_no());						// 工程指図ＮＯ
			hdr1R.mfg_inst_no(_mfgInstNo);									// 製造指図ＮＯ

			// 工程紐付けＮＯと工程指図ＮＯの記憶
			_operPegNoM.put(hdr1R.peg_no(), hdr1R.oper_inst_no());

			// 工程受信実績から設定
			if (isOper) {
				hdr1R.oper_unit_act_qty(actR.oper_unit_qty());				// 工程単位実績数量
				hdr1R.oper_yield(actR.oper_yield());						// 工程実際収率
				hdr1R.oper_act_intr_rmrks(actR.intr_rmrks());				// 内部備考
				hdr1R.oper_act_rpt_rmrks(actR.act_rpt_rmrks());				// 記録書備考
				hdr1R.st_act_tm(actR.st_act_tm());							// 着手実績日時
				hdr1R.end_act_tm(actR.end_act_tm());						// 終了実績日時
				hdr1R.not_cmpl_flg(actR.not_cmpl_flg());					// 未完了
				hdr1R.if_auto_reg_flg(false);								// ＩＦ自動作成
			}
			// 出来高受信実績から設定／工程指図から補完
			else {
				hdr1R.st_act_tm(actR.act_tm());								// 実績日時
				hdr1R.if_auto_reg_flg(true);								// ＩＦ自動作成
				if (!isNull(hdr1R.ext_oper_act_no())) {
					String extKey = crtExtAltrKey(MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value(), hdr1R.ext_sys_cd(), hdr1R.ext_oper_act_no(), hdr1R.if_auto_reg_flg());
					if (getExtActKeySet().contains(extKey)) {
						hdr1R.ext_oper_act_no(null);
					}
					else {
						getExtActKeySet().add(extKey);
					}
				}
			}

			if (isNull(hdr1R.oper_unit_act_qty())) {
				hdr1R.oper_unit_act_qty(convQtyBaseToOper(oiR.base_unit_qty(),
						oiR.oper_conv_qty(), oiR.oper_std_qty(), 
						oiR.oper_unit_dec_place(), 
						oiR.oper_unit_conv_rnd_typ()));						// 工程単位実績数量
			}

			// 計上日
			hdr1R.st_ac_dt(getAcDt(hdr1R.st_act_tm()));						// 着手計上日
			hdr1R.end_ac_dt(getAcDt(hdr1R.end_act_tm()));					// 終了計上日

			if (isOper) {
				hdr1R.setParamIndex(actR.getParamIndex());
				hdr1R.setParamRowIndex(actR.getParamRowIndex());
			}

			hdr1R.setStatus(Status.CREATE);

			return hdr1R;
		}

		protected void setUpd03MfgHdrItems(MfgActIF_Upd03_Hdr1R hdr1R, MfgActRecvIf_Upd02_ActLstR yieldR, 
											MCNumber yRate, MST_OPER_INST_R oiR) {
			// 1. 受信項目の設定
			hdr1R.act_usr_cd(yieldR.mfg_act_usr_cd());				// 実績責任者ＣＤ
			hdr1R.act_dpt_cd(yieldR.mfg_act_dpt_cd());				// 実績部門ＣＤ
			hdr1R.mfg_act_rpt_rmrks(yieldR.mfg_act_rpt_rmrks());	// 製造記録書備考
			hdr1R.mfg_act_intr_rmrks(yieldR.mfg_act_intr_rmrks());	// 内部備考
			hdr1R.itm_yield(yieldR.itm_yield());					// 品目実際収率

			// 2. 全工程実績作成の場合、工程の未完了フラグは常にオフにする
			if (yieldR.all_oper_act_reg_flg()) {
				hdr1R.not_cmpl_flg(false);
			}

			// 3.1. ＩＦ自動作成の工程実績で計画ありであれば、終了日時は常にＮＵＬＬ。計画外製造実績の場合は開始日を終了日にセット。
			if (hdr1R.if_auto_reg_flg()) {
				if (oiR.unschd_act_flg()) {
					if (isNull(hdr1R.end_act_tm())) {
						hdr1R.end_act_tm(hdr1R.st_act_tm());
					}
					if (isNull(hdr1R.end_ac_dt())) {
						hdr1R.end_ac_dt(hdr1R.st_ac_dt());
					}
				}
				else {
					hdr1R.end_act_tm(null);
					hdr1R.end_ac_dt(null);
				}
			}
			
			// 3.2. 出来高が打切となった、かつ、工程終了実績日時がない場合、出来高・副産品の実績日時を設定する。（現在、未使用）
			else if (yieldR.abort_flg() && isNull(hdr1R.end_act_tm()) && !isNull(yieldR.end_act_tm())) {
				hdr1R.end_act_tm(yieldR.end_act_tm());
				hdr1R.end_ac_dt(getAcDt(hdr1R.end_act_tm()));
			}

			// 4. IF自動作成、かつ、出来高計上工程の場合、出来高実績／出来高予定の比率で、工程実績数量を再算出する。
			if (oiR != null && oiR.yield_oper_flg() && hdr1R.if_auto_reg_flg() && !isNull(hdr1R.getStringNE("yield_typ")) && !isSame(hdr1R.getStringNE("yield_typ"), "3")) {
				MCNumber operInstQty = convQtyBaseToOper(oiR.base_unit_qty(),
						oiR.oper_conv_qty(), oiR.oper_std_qty(), oiR.oper_unit_dec_place(), oiR.oper_unit_conv_rnd_typ());
				hdr1R.oper_unit_act_qty(qtyMulti(operInstQty, yRate, oiR.oper_unit_dec_place(), oiR.oper_unit_conv_rnd_typ()));
			}
		}

		protected void makeUpd03InsYieldActData(MfgActRecvIf_Upd02_ActLstR actR) {
			_mfgUpd03.up3().add(makeUpd03InsYieldActTelegram(actR));
		}

		protected MfgActIF_Upd03_DtlYieldByProdR makeUpd03InsYieldActTelegram(MfgActRecvIf_Upd02_ActLstR actR) {
			MfgActIF_Upd03_DtlYieldByProdR yieldR = MfgActIF_Upd03_DtlYieldByProdR.create();

			// 親工程
			MfgActIF_Upd03_Hdr1R operR = getUpd03ParentOper(actR, true);

			MCNumber yieldPegNo = new MCNumber(_mfgUpd03.up3().size());

			yieldR.peg_no(yieldPegNo);									// 出来高紐付けＮＯ
			yieldR.hdr_peg_no(operR.peg_no());							// ヘッダ紐付けＮＯ
			yieldR.yield_typ(actR.yield_typ());							// 出来高区分
			yieldR.abort_flg(actR.abort_flg());							// 打切
			yieldR.mes_flg(true);										// ＭＥＳ
			yieldR.ext_sys_cd(actR.ext_sys_cd());						// 外部システムＣＤ
			yieldR.ext_yield_act_no(actR.ext_yield_act_no());			// 外部出来高実績ＮＯ
			yieldR.all_oper_act_reg_flg(actR.all_oper_act_reg_flg());	// 全工程実績作成

			yieldR.itm_cd(actR.itm_cd());								// 品目ＣＤ
			yieldR.itm_sub1(actR.itm_sub1());							// 枝番１
			yieldR.itm_sub2(actR.itm_sub2());							// 枝番２
			yieldR.itm_sub3(actR.itm_sub3());							// 枝番３
			yieldR.trd_unit_cd(actR.trd_unit_cd());						// 取引単位ＣＤ
			yieldR.trd_unit_yield_act_qty(actR.trd_unit_qty());			// 取引単位出来高数量
			yieldR.act_tm(actR.act_tm());								// 実績日
			yieldR.ac_dt(getAcDt(actR.act_tm()));						// 計上日
			yieldR.lot_no(actR.lot_no());								// ロットＮＯ
			yieldR.sublot_no(actR.sublot_no());							// サブロットＮＯ
			yieldR.same_lot_flg(actR.same_lot_flg());					// 同一ロット
			yieldR.sno1(actR.sno1());									// 手配ＮＯ１
			yieldR.sno2(actR.sno2());									// 手配ＮＯ２
			yieldR.sno3(actR.sno3());									// 手配ＮＯ３
			yieldR.sno4(actR.sno4());									// 手配ＮＯ４
			yieldR.yield_rsn_cd(actR.yield_rsn_cd());					// 出来高理由ＣＤ
			yieldR.quality_typ(actR.quality_typ());						// 良品区分
			yieldR.gd_cd(actR.gd_cd());									// 格付ＣＤ
			yieldR.strg_loc_cd(actR.strg_loc_cd());						// 格納場所ＣＤ
			yieldR.strg_str_ln_cd(actR.strg_str_ln_cd());				// 格納棚・ラインＣＤ
			yieldR.yield_rate(actR.yield_rate());						// 出来高進捗度
			yieldR.insp_cnt_rmrks(actR.insp_cnt_rmrks());				// 指図書備考
			yieldR.yield_act_intr_rmrks(actR.yield_act_intr_rmrks());	// 検査連絡備考
			yieldR.yield_act_rpt_rmrks(actR.yield_act_rpt_rmrks());		// 内部備考
			yieldR.trd_rmrks(actR.trd_rmrks());							// 記録書備考
			yieldR.yield_schd_no(actR.yield_schd_no());					// 出来高予定ＮＯ
			yieldR.oper_inst_no(actR.oper_inst_no());					// 工程指図ＮＯ

			yieldR.setParamIndex(actR.getParamIndex());
			yieldR.setParamRowIndex(actR.getParamRowIndex());

			yieldR.setStatus(Status.CREATE);

			return yieldR;
		}

		protected void setUpd03YieldValidHdrItems(MfgActRecvIf_Upd02_ActLstR yieldR, MfgActRecvIf_Upd02_ActLstR actR) {
			if (MAC_YIELD_TYP.isBYPROD(actR.yield_typ())) {
				return;
			}

			if (!isNull(actR.mfg_act_usr_cd()) ) {
				yieldR.mfg_act_usr_cd(actR.mfg_act_usr_cd());				// 実績責任者ＣＤ
			}
			if (!isNull(actR.mfg_act_dpt_cd()) ) {
				yieldR.mfg_act_dpt_cd(actR.mfg_act_dpt_cd());				// 実績部門ＣＤ
			}
			if (!isNull(actR.mfg_act_rpt_rmrks()) ) {
				yieldR.mfg_act_rpt_rmrks(actR.mfg_act_rpt_rmrks());			// 製造記録書備考
			}
			if (!isNull(actR.mfg_act_intr_rmrks()) ) {
				yieldR.mfg_act_intr_rmrks(actR.mfg_act_intr_rmrks());		// 内部備考
			}
			if (!isNull(actR.itm_yield()) ) {
				yieldR.itm_yield(actR.itm_yield());							// 品目実際収率
			}
			if (actR.all_oper_act_reg_flg()) {
				yieldR.all_oper_act_reg_flg(actR.all_oper_act_reg_flg());	// 全工程実績作成
			}
			if (actR.abort_flg()) {
				yieldR.abort_flg(actR.abort_flg());							// 打切
			}

			// 出来高基準単位数量を集計する。
			yieldR.base_unit_qty(MCNumber.sum(yieldR.base_unit_qty(), actR.base_unit_qty()));
		}

		/**
		 * 出来高受信実績により、製造ヘッダ項目の再設定を行う。<br>
		 * 全工程実績作成の出来高を受信した場合、未実績の工程について、工程実績を追加作成する。
		 */
		protected void setUpd03InsOperActByYield(MfgActRecvIf_Upd02_ActLstR yieldR, MCList<MfgActRecvIf_Upd02_ActLstR> yieldL) {
			if (yieldR == null) {
				return;
			}

			// 出来高実績と出来高予定の比率を算出する。
			MCNumber yRate = getYieldActRate(yieldR, yieldR.base_unit_qty());
			MCNumber yRateOrg = yRate;

			// 出来高受信実績により、製造ヘッダ項目の再設定
			Set<String> operInstNoSet = new HashSet<String>();
			for ( int pos = _mfgUpd03.up1().size() -1 ; pos >= 0 ; pos--) {
				MfgActIF_Upd03_Hdr1R hdr1R = _mfgUpd03.up1().get(pos);
				if (!isSame(yieldR.mfg_inst_no(), _mfgInstNo)) {
					break;
				}

				MST_OPER_INST_R oiR = (MST_OPER_INST_R)getSchdRCache(getCacheKey(MAC_IF_PROC_TYP.MES_OPER_INST_SEND.value(), hdr1R.oper_inst_no()));

				if (!isSame(hdr1R.mfg_inst_no(), yieldR.mfg_inst_no())) {
					continue;
				}
				// 工程に紐付く出来高実績が存在する場合、その出来高実績数量を合計してレートを算出しなおす
				MCNumber sumQty = MCNumber.ZERO;
				// 下記のif分岐に入らないと前回のyRateが使用されてしまうため、一旦元の値に戻す
				yRate = yRateOrg;
				MCList<MfgActIF_Upd03_DtlYieldByProdR> up3L = _mfgUpd03.up3().subList(MfgActIF_Upd03_DtlYieldByProdR.$hdr_peg_no, hdr1R.peg_no());
				if (!up3L.isEmpty()) {
					hdr1R.setStringNE("yield_typ", up3L.min(MfgActIF_Upd03_DtlYieldByProdR.$yield_typ).toString());
					for (MfgActIF_Upd03_DtlYieldByProdR r : up3L) {
						// _mfgUpd03に設定された外部出来高実績ＮＯからyieldL（受信データ）のレコードを特定
						MCList<MfgActRecvIf_Upd02_ActLstR> yL = yieldL.subList(MfgActRecvIf_Upd02_ActLstR.$ext_yield_act_no, r.ext_yield_act_no());
						for (MfgActRecvIf_Upd02_ActLstR yR : yL) {
							sumQty = sumQty.add(yR.base_unit_qty());
						}
					}
					yRate = getYieldActRate(yieldR, sumQty);
				}

				setUpd03MfgHdrItems(hdr1R, yieldR, yRate, oiR);

				operInstNoSet.add(hdr1R.oper_inst_no());
			}

			if (!yieldR.all_oper_act_reg_flg()) {
				return;
			}

			// 出来高受信実績により、全工程実績作成の場合、未実績の工程について、工程実績を追加作成する。
			MCList<MCRow> operInstL = getSchdLCache(getCacheKey(MAC_IF_PROC_TYP.MES_OPER_INST_SEND.value(), _mfgInstNo));
			for (int i=0 ; i < operInstL.size() ; i++) {
				MST_OPER_INST_R oiR = (MST_OPER_INST_R)operInstL.get(i);
				if (operInstNoSet.contains(oiR.oper_inst_no())) {
					continue;
				}

				yieldR.oper_inst_no(oiR.oper_inst_no());
				MfgActIF_Upd03_Hdr1R addHdr1R = makeUpd03InsOperActTelegram(yieldR, false);
				addHdr1R.ext_oper_act_no(null);
				addHdr1R.ext_sys_cd(null);
				setUpd03MfgHdrItems(addHdr1R, yieldR, yRate, oiR);
				_mfgUpd03.up1().add(addHdr1R);
			}
		}

		/**
		 * 工程・出来高の新規登録用電文を作成する。
		 */
		protected void makeUpd03MdfMfgActData(MCList<MfgActRecvIf_Upd02_ActLstR> mfgInstL) {
			MCDate maxDate = null;
			MfgActRecvIf_Upd02_ActLstR yieldR = null;
			MCList<MfgActRecvIf_Upd02_ActLstR> yieldL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);

			Set<String> yieldActNoS = new HashSet<String>();
			for (MfgActRecvIf_Upd02_ActLstR actR : mfgInstL) {
				if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(actR.if_proc_typ())) {
					makeUpd03MdfOperActData(actR);
				}
				else if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(actR.if_proc_typ())) {
					makeUpd03MdfYieldActData(actR, yieldActNoS);

					maxDate = getMaxDate(maxDate, actR.act_tm(), MCDateFieldType.MINUTE);
					if (!MAC_YIELD_TYP.isBYPROD(actR.yield_typ())) {
						yieldL.add(actR);
					}

					if (yieldR == null) {
						if (!MAC_YIELD_TYP.isBYPROD(actR.yield_typ())) {
							yieldR = actR.clone();
						}
						continue;
					}

					setUpd03YieldValidHdrItems(yieldR, actR);
				}
			}

			// 更新対象外の出来高受信実績も電文に追加
			addUpd03MdfNoneYieldAct(yieldR, yieldActNoS, yieldL);

			// 出来高受信実績により、ヘッダ項目再設定や工程実績電文追加
			setUpd03MdfOperActByYield(yieldR, yieldL);
		}

		protected void makeUpd03MdfOperActData(MfgActRecvIf_Upd02_ActLstR actR) {
			_mfgUpd03.up1().add(makeUpd03MdfOperActTelegram(actR, true));
		}

		protected MfgActIF_Upd03_Hdr1R makeUpd03MdfOperActTelegram(MfgActRecvIf_Upd02_ActLstR actR, boolean isOper) {
			MfgActIF_Upd03_Hdr1R hdr1R = MfgActIF_Upd03_Hdr1R.create();

			MST_OPER_INST_R oiR = (MST_OPER_INST_R)getSchdRCache(
					getCacheKey(MAC_IF_PROC_TYP.MES_OPER_INST_SEND.value(), actR.oper_inst_no()));

			MST_OPER_ACT_R dbR = getDBOperAct(actR.oper_act_no());
			if (isNull(dbR.oper_act_no())) {
				dbR = getDBOperAct(actR.mfg_act_no(), actR.oper_inst_no(), actR.ext_oper_act_no());
				// 工程を新規作成する場合、工程実績をクリアする
				if (crtNewOperAct(actR, dbR)) {
					dbR = MST_OPER_ACT_R.create();
				}
			}

			hdr1R.peg_no(_hdrPegNo);										// 工程紐付けＮＯ

			// ヘッダ紐付けＮＯと製造指図ＮＯの保持
			_mfgPegNoM.put(_hdrPegNo, _mfgInstNo);
			_hdrPegNo = _hdrPegNo.add(1);

			hdr1R.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());					// 製造状況区分

			hdr1R.oper_act_no(dbR.oper_act_no());							// 工程実績ＮＯ
			hdr1R.div_seq(_mfgActR.div_seq());								// 分割連番
			hdr1R.mfg_act_no(_mfgActR.mfg_act_no());						// 製造実績ＮＯ
			hdr1R.base_unit_st_act_qty(_mfgActRemR.base_unit_mfg_qty());	// 着手数量 ＝＞ 基準単位製造指図数量とする。
			hdr1R.mes_flg(true);											// ＭＥＳ
			hdr1R.rem_abort_flg(false);										// 残数打切
			hdr1R.oper_inst_no(actR.oper_inst_no());						// 工程指図ＮＯ
			hdr1R.mfg_inst_no(_mfgInstNo);									// 製造指図ＮＯ
			hdr1R.ext_sys_cd(actR.ext_sys_cd());							// 外部システムＣＤ
			hdr1R.ext_oper_act_no(actR.ext_oper_act_no());					// 外部工程実績ＮＯ
			// 工程紐付けＮＯと工程指図ＮＯの記憶
			_operPegNoM.put(hdr1R.peg_no(), hdr1R.oper_inst_no());

			if (!isNull(dbR.oper_act_no())) {
				hdr1R.oper_act_sub_char1(dbR.sub_char1());					// 工程予備１
				hdr1R.oper_act_sub_char2(dbR.sub_char2());					// 工程予備２
				hdr1R.oper_act_sub_char3(dbR.sub_char3());					// 工程予備３
			}

			// 工程受信実績から設定
			if (isOper) {
				hdr1R.oper_unit_act_qty(actR.oper_unit_qty());				// 工程単位実績数量
				hdr1R.oper_yield(actR.oper_yield());						// 工程実際収率
				hdr1R.oper_act_intr_rmrks(actR.intr_rmrks());				// 内部備考
				hdr1R.oper_act_rpt_rmrks(actR.act_rpt_rmrks());				// 記録書備考
				hdr1R.st_act_tm(actR.st_act_tm());							// 着手実績日時
				hdr1R.end_act_tm(actR.end_act_tm());						// 終了実績日時
				hdr1R.not_cmpl_flg(actR.not_cmpl_flg());					// 未完了
				hdr1R.if_auto_reg_flg(false);								// ＩＦ自動作成
			}
			// 出来高受信実績から設定／工程指図・工程実績から補完
			else {
				if (!isNull(dbR.oper_act_no())) {
					// 登録済の工程実績よりも過去日の場合は置き換える
					if (dbR.if_auto_reg_flg() && !isNull(actR.act_tm()) && actR.act_tm().lt(dbR.st_act_tm())) {
						hdr1R.st_act_tm(actR.act_tm());
					}
					else {
						hdr1R.st_act_tm(dbR.st_act_tm());
					}
					hdr1R.if_auto_reg_flg(dbR.if_auto_reg_flg());			// ＩＦ自動作成
					hdr1R.ext_sys_cd(dbR.ext_sys_cd());						// 外部システムＣＤ
					hdr1R.ext_oper_act_no(nvl(actR.ext_oper_act_no(), dbR.ext_oper_act_no())); // 外部工程実績ＮＯ
					hdr1R.oper_unit_act_qty(dbR.oper_unit_qty());			// 工程単位実績数量（実績から）
					hdr1R.oper_yield(dbR.oper_yield());						// 工程実際収率
					hdr1R.oper_act_intr_rmrks(dbR.intr_rmrks());			// 内部備考
					hdr1R.oper_act_rpt_rmrks(dbR.act_rpt_rmrks());			// 記録書備考
					if (!hdr1R.if_auto_reg_flg() || (actR.unschd_act_flg() && dbR.mes_flg())) {
						hdr1R.end_act_tm(dbR.end_act_tm());					// 終了実績日時
						hdr1R.not_cmpl_flg(isOperNotCmpl(oiR, dbR));		// 未完了
					}
				}
				else {
					hdr1R.st_act_tm(actR.act_tm());							// 実績日時
					hdr1R.if_auto_reg_flg(true);							// ＩＦ自動作成
					if (!isNull(hdr1R.ext_oper_act_no())) {
						String extKey = crtExtAltrKey(MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value(), hdr1R.ext_sys_cd(), hdr1R.ext_oper_act_no(), hdr1R.if_auto_reg_flg());
						if (getExtActKeySet().contains(extKey)) {
							hdr1R.ext_oper_act_no(null);
						}
						else {
							getExtActKeySet().add(extKey);
						}
					}
				}
			}

			if (isNull(hdr1R.oper_unit_act_qty())) {
				hdr1R.oper_unit_act_qty(convQtyBaseToOper(oiR.base_unit_qty(),
						oiR.oper_conv_qty(), oiR.oper_std_qty(), 
						oiR.oper_unit_dec_place(), 
						oiR.oper_unit_conv_rnd_typ()));						// 工程単位実績数量
			}

			// 計上日
			hdr1R.st_ac_dt(getAcDt(hdr1R.st_act_tm()));						// 着手計上日
			hdr1R.end_ac_dt(getAcDt(hdr1R.end_act_tm()));					// 終了計上日

			hdr1R.act_usr_cd(_mfgActR.act_usr_cd());						//実績責任者ＣＤ
			hdr1R.act_dpt_cd(_mfgActR.act_dpt_cd());						//実績部門ＣＤ
			hdr1R.itm_yield(_mfgActR.itm_yield());							//品目実際収率
			hdr1R.mfg_act_rpt_rmrks(_mfgActR.act_rpt_rmrks());				// 記録書備考
			hdr1R.mfg_act_intr_rmrks(_mfgActR.intr_rmrks());				// 内部備考
			hdr1R.mfg_act_sub_char1(_mfgActR.sub_char1());					// 製造実績予備１
			hdr1R.mfg_act_sub_char2(_mfgActR.sub_char2());					// 製造実績予備２
			hdr1R.mfg_act_sub_char3(_mfgActR.sub_char3());					// 製造実績予備３

			if (isOper) {
				hdr1R.setParamIndex(actR.getParamIndex());
				hdr1R.setParamRowIndex(actR.getParamRowIndex());
			}

			if (!isNull(dbR.oper_act_no())) {
				if (actR.unschd_act_flg() && MAC_DATA_CRUD_TYP.isDEL(actR.data_crud_typ())) {
					hdr1R.setStatus(Status.DELETE);
				}
				else {
					hdr1R.setStatus(Status.MODIFY);
				}
			}
			else {
				hdr1R.setStatus(Status.CREATE);
			}

			return hdr1R;
		}
		/**
		 * 出来高が紐付く工程指図に工程実績が登録されている場合に、その工程実績に出来高実績を紐付けるのか、新規に工程実績を作成するのか判断する。
		 * ※出来高実績から工程実績を自動作成する場合、出来高実績の件数分だけ工程実績を作成するために使用する。
		 * 
		 * @param actR 登録対象の出来高実績
		 * @param dbR テーブルから取得した工程実績
		 * @return 新規作成する場合はtrue
		 */
		protected boolean crtNewOperAct(MfgActRecvIf_Upd02_ActLstR actR, MST_OPER_ACT_R dbR) {

			// Chk01で工程実績ＮＯが補完されている場合、false
			if (!isNull(actR.oper_act_no())) {
				return false;
			}
			
			// 外部工程実績ＮＯが一致する場合、false
			if (!isNull(actR.ext_oper_act_no()) && isSame(actR.ext_oper_act_no(), dbR.ext_oper_act_no())) {
				return false;
			}
			
			// 工程実績が自動作成されている場合、true
			return dbR.if_auto_reg_flg();
		}

		// 未完了工程、配下の受信で更新された場合も未完了のままで
		protected boolean isOperNotCmpl(MST_OPER_INST_R oiR, MST_OPER_ACT_R oaR) {
			if (isNull(oaR.end_act_tm())) {
				return false;
			}
			if (MSC_MFG_STS_TYP.isCMPL(oaR.getStringNE("mfg_sts_typ"))) {
				return false;
			}

			return true;
		}

		protected void makeUpd03MdfYieldActData(MfgActRecvIf_Upd02_ActLstR actR, Set<String> yieldActNoS) {
			_mfgUpd03.up3().add(makeUpd03MdfYieldActTelegram(actR));

			if (!isNull(actR.yield_act_no())) {
				yieldActNoS.add(actR.yield_act_no());
			}
		}

		protected MfgActIF_Upd03_DtlYieldByProdR makeUpd03MdfYieldActTelegram(MfgActRecvIf_Upd02_ActLstR actR) {
			MfgActIF_Upd03_DtlYieldByProdR yieldR = MfgActIF_Upd03_DtlYieldByProdR.create();

			// 親工程
			MfgActIF_Upd03_Hdr1R operR = getUpd03ParentOper(actR, false);
			// 訂正・取消元の出来高実績
			MST_YIELD_ACT_R dbR = getDBYieldAct(actR.yield_act_no());

			MCNumber yieldPegNo = new MCNumber(_mfgUpd03.up3().size());

			yieldR.peg_no(yieldPegNo);										// 出来高紐付けＮＯ
			yieldR.hdr_peg_no(operR.peg_no());								// ヘッダ紐付けＮＯ
			yieldR.yield_typ(actR.yield_typ());								// 出来高区分
			yieldR.abort_flg(actR.abort_flg());								// 打切
			yieldR.mes_flg(true);											// ＭＥＳ
			yieldR.ext_sys_cd(actR.ext_sys_cd());							// 外部システムＣＤ
			yieldR.ext_yield_act_no(actR.ext_yield_act_no());				// 外部出来高実績ＮＯ
			yieldR.all_oper_act_reg_flg(actR.all_oper_act_reg_flg());		// 全工程実績作成
			yieldR.yield_schd_no(actR.yield_schd_no());						// 出来高予定ＮＯ
			yieldR.oper_inst_no(actR.oper_inst_no());						// 工程指図ＮＯ

			if (isNull(dbR.yield_act_no())) {
				yieldR.setStatus(Status.CREATE);
			}
			else {
				if (MAC_DATA_CRUD_TYP.isDEL(actR.data_crud_typ())) {
					yieldR.setStatus(Status.DELETE);
					if (!operR.not_cmpl_flg()) {
						operR.end_act_tm(null);
						operR.end_ac_dt(null);
					}
				}
				else {
					yieldR.setStatus(Status.MODIFY);
				}
				if (isNull(yieldR.yield_typ())) {
					yieldR.yield_typ(dbR.yield_typ());						// 出来高区分
				}
				yieldR.can_ac_dt(dbR.ac_dt());								// 取消計上日
				yieldR.yield_act_no(dbR.yield_act_no());					// 出来高実績ＮＯ
				yieldR.oper_act_no(dbR.oper_act_no());						// 工程実績ＮＯ
				yieldR.itm_cd(dbR.itm_cd());								// 品目ＣＤ
				yieldR.itm_sub1(dbR.itm_sub1());							// 枝番１
				yieldR.itm_sub2(dbR.itm_sub2());							// 枝番２
				yieldR.itm_sub3(dbR.itm_sub3());							// 枝番３
				yieldR.trd_unit_cd(dbR.trd_unit_cd());						// 取引単位ＣＤ
				yieldR.trd_unit_yield_act_qty(dbR.trd_unit_qty());			// 取引単位出来高数量
				yieldR.act_tm(dbR.act_tm());								// 実績日
				yieldR.ac_dt(dbR.ac_dt());									// 計上日
				yieldR.yield_act_sub_char1(dbR.sub_char1());				// 予備１（実績）
				yieldR.yield_act_sub_char2(dbR.sub_char2());				// 予備２（実績）
				yieldR.yield_act_sub_char3(dbR.sub_char3());				// 予備３（実績）
				yieldR.lot_no(dbR.lot_no());								// ロットＮＯ
				yieldR.sublot_no(dbR.sublot_no());							// サブロットＮＯ
				yieldR.sno1(dbR.sno1());									// 手配ＮＯ１
				yieldR.sno2(dbR.sno2());									// 手配ＮＯ２
				yieldR.sno3(dbR.sno3());									// 手配ＮＯ３
				yieldR.sno4(dbR.sno4());									// 手配ＮＯ４
				yieldR.yield_rsn_cd(dbR.yield_rsn_cd());					// 出来高理由ＣＤ
				yieldR.quality_typ(dbR.quality_typ());						// 良品区分
				yieldR.gd_cd(dbR.gd_cd());									// 格付ＣＤ
				yieldR.strg_loc_cd(dbR.strg_loc_cd());						// 格納場所ＣＤ
				yieldR.strg_str_ln_cd(dbR.strg_str_ln_cd());				// 格納棚・ラインＣＤ
			}

			if (!MAC_DATA_CRUD_TYP.isDEL(actR.data_crud_typ())) {
				yieldR.trd_unit_cd(actR.trd_unit_cd());						// 取引単位ＣＤ
				yieldR.trd_unit_yield_act_qty(actR.trd_unit_qty());			// 取引単位出来高数量
				if (!isNull(actR.itm_cd())) {
					yieldR.itm_cd(actR.itm_cd());							// 品目ＣＤ
					yieldR.itm_sub1(actR.itm_sub1());						// 枝番１
					yieldR.itm_sub2(actR.itm_sub2());						// 枝番２
					yieldR.itm_sub3(actR.itm_sub3());						// 枝番３
				}
				if (!isNull(actR.act_tm())) {
					yieldR.act_tm(actR.act_tm());							// 実績日
					yieldR.ac_dt(getAcDt(actR.act_tm()));					// 計上日
				}
				if (!isNull(actR.lot_no())) {
					yieldR.lot_no(actR.lot_no());							// ロットＮＯ
					yieldR.same_lot_flg(actR.same_lot_flg());				// 同一ロット
					yieldR.sno1(actR.sno1());								// 手配ＮＯ１
					yieldR.sno2(actR.sno2());								// 手配ＮＯ２
					yieldR.sno3(actR.sno3());								// 手配ＮＯ３
					yieldR.sno4(actR.sno4());								// 手配ＮＯ４
				}
				yieldR.sublot_no(actR.sublot_no());							// サブロットＮＯ
				yieldR.yield_rsn_cd(actR.yield_rsn_cd());					// 出来高理由ＣＤ
				yieldR.quality_typ(actR.quality_typ());						// 良品区分
				yieldR.gd_cd(actR.gd_cd());									// 格付ＣＤ
				yieldR.strg_loc_cd(actR.strg_loc_cd());						// 格納場所ＣＤ
				yieldR.strg_str_ln_cd(actR.strg_str_ln_cd());				// 格納棚・ラインＣＤ
				yieldR.yield_rate(actR.yield_rate());						// 出来高進捗度
				yieldR.insp_cnt_rmrks(actR.insp_cnt_rmrks());				// 指図書備考
				yieldR.yield_act_intr_rmrks(actR.yield_act_intr_rmrks());	// 検査連絡備考
				yieldR.yield_act_rpt_rmrks(actR.yield_act_rpt_rmrks());		// 内部備考
				yieldR.trd_rmrks(actR.trd_rmrks());							// 記録書備考
			}

			yieldR.setParamIndex(actR.getParamIndex());
			yieldR.setParamRowIndex(actR.getParamRowIndex());

			return yieldR;
		}

		protected MfgActIF_Upd03_DtlYieldByProdR makeUpd03MdfYieldActTelegram(MfgActRecvIf_Upd02_ActLstR actR, MST_YIELD_ACT_R dbR) {
			MfgActIF_Upd03_DtlYieldByProdR yieldR = MfgActIF_Upd03_DtlYieldByProdR.create();

			// 親工程
			MfgActIF_Upd03_Hdr1R operR = getUpd03ParentOper(actR, false);

			MCNumber yieldPegNo = new MCNumber(_mfgUpd03.up3().size());

			yieldR.peg_no(yieldPegNo);									// 出来高紐付けＮＯ
			yieldR.hdr_peg_no(operR.peg_no());							// ヘッダ紐付けＮＯ

			yieldR.yield_typ(dbR.yield_typ());							// 出来高区分
			yieldR.mes_flg(dbR.mes_flg());								// ＭＥＳ
			yieldR.ext_sys_cd(dbR.ext_sys_cd());						// 外部システムＣＤ
			yieldR.ext_yield_act_no(dbR.ext_yield_act_no());			// 外部出来高実績ＮＯ
			yieldR.yield_schd_no(dbR.yield_schd_no());					// 出来高予定ＮＯ
			yieldR.all_oper_act_reg_flg(actR.all_oper_act_reg_flg());	// 全工程実績作成
			yieldR.oper_inst_no(actR.oper_inst_no());					// 工程指図ＮＯ

			yieldR.itm_cd(dbR.itm_cd());								// 品目ＣＤ
			yieldR.itm_sub1(dbR.itm_sub1());							// 枝番１
			yieldR.itm_sub2(dbR.itm_sub2());							// 枝番２
			yieldR.itm_sub3(dbR.itm_sub3());							// 枝番３
			yieldR.trd_unit_cd(dbR.trd_unit_cd());						// 取引単位ＣＤ
			yieldR.trd_unit_yield_act_qty(dbR.trd_unit_qty());			// 取引単位出来高数量
			yieldR.act_tm(dbR.act_tm());								// 実績日
			yieldR.ac_dt(dbR.ac_dt());									// 計上日
			yieldR.lot_no(dbR.lot_no());								// ロットＮＯ
			yieldR.sublot_no(dbR.sublot_no());							// サブロットＮＯ
			yieldR.sno1(dbR.sno1());									// 手配ＮＯ１
			yieldR.sno2(dbR.sno2());									// 手配ＮＯ２
			yieldR.sno3(dbR.sno3());									// 手配ＮＯ３
			yieldR.sno4(dbR.sno4());									// 手配ＮＯ４
			yieldR.yield_rsn_cd(dbR.yield_rsn_cd());					// 出来高理由ＣＤ
			yieldR.quality_typ(dbR.quality_typ());						// 良品区分
			yieldR.gd_cd(dbR.gd_cd());									// 格付ＣＤ
			yieldR.strg_loc_cd(dbR.strg_loc_cd());						// 格納場所ＣＤ
			yieldR.strg_str_ln_cd(dbR.strg_str_ln_cd());				// 格納棚・ラインＣＤ
			yieldR.yield_rate(dbR.yield_rate());						// 出来高進捗度
			yieldR.insp_cnt_rmrks(dbR.insp_cnt_rmrks());				// 指図書備考
			yieldR.yield_act_intr_rmrks(dbR.intr_rmrks());				// 検査連絡備考
			yieldR.yield_act_rpt_rmrks(dbR.act_rpt_rmrks());			// 内部備考
			yieldR.trd_rmrks(dbR.trd_rmrks());							// 記録書備考
			yieldR.yield_act_sub_char1(dbR.sub_char1());				// 予備１（実績）
			yieldR.yield_act_sub_char2(dbR.sub_char2());				// 予備２（実績）
			yieldR.yield_act_sub_char3(dbR.sub_char3());				// 予備３（実績）

			yieldR.can_ac_dt(dbR.ac_dt());								// 取消計上日
			yieldR.yield_act_no(dbR.yield_act_no());					// 出来高実績ＮＯ
			yieldR.oper_act_no(dbR.oper_act_no());						// 工程実績ＮＯ
			yieldR.same_lot_flg(dbR.lot_ctl_flg());						// 同一ロット
			yieldR.setParamIndex(actR.getParamIndex());
			yieldR.setParamRowIndex(actR.getParamRowIndex());

			yieldR.setStatus(Status.MODIFY);

			return yieldR;
		}

		protected void addUpd03MdfNoneYieldAct(MfgActRecvIf_Upd02_ActLstR yieldR, Set<String> yieldActNoS, MCList<MfgActRecvIf_Upd02_ActLstR> yieldL) {
			if (yieldR == null) {
				return;
			}

			MCList<MCRow> actDBL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_YIELD_ACT_RECV.value(), _mfgActNo));
			if (actDBL == null || yieldActNoS.size() >= actDBL.size()) {
				return;
			}

			MCList<MfgActRecvIf_Upd02_ActLstR> yieldAddL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
			MCIndexKey idx = yieldL.createIndex(MfgActRecvIf_Upd02_ActLstR.$oper_act_no);
			MfgActRecvIf_Upd02_ActLstR operR = MfgActRecvIf_Upd02_ActLstR.create();
			operR.mfg_inst_no(yieldR.mfg_inst_no());
			operR.mfg_act_no(yieldR.mfg_act_no());
			for (int ai = 0 ; ai < actDBL.size() ; ai++) {
				MST_YIELD_ACT_R dbR = (MST_YIELD_ACT_R)actDBL.get(ai);
				if (MAC_YIELD_TYP.isBYPROD(dbR.yield_typ())) {
					continue;
				}
				if (yieldActNoS.contains(dbR.yield_act_no())) {
					continue;
				}
				// 更新対象レコードに工程実績ＮＯが含まれる場合のみ対象とする
				if (isNull(yieldL.getFirst(idx, dbR.oper_act_no()))) {
					continue;
				}

				// 出来高基準単位数量を集計する。
				yieldR.base_unit_qty(MCNumber.sum(yieldR.base_unit_qty(), dbR.base_unit_qty()));

				operR.oper_inst_no(getDBOperAct(dbR.oper_act_no()).oper_inst_no());
				operR.oper_act_no(dbR.oper_act_no());
				operR.yield_act_no(dbR.yield_act_no());
				operR.yield_schd_no(dbR.yield_schd_no());
				operR.all_oper_act_reg_flg(yieldR.all_oper_act_reg_flg());

				_mfgUpd03.up3().add(makeUpd03MdfYieldActTelegram(operR, dbR));
				// 工程実績数量計算時に使用するため、yieldLに追加する
				MfgActRecvIf_Upd02_ActLstR addR = MfgActRecvIf_Upd02_ActLstR.create();
				addR.ext_yield_act_no(dbR.ext_yield_act_no());
				addR.yield_act_no(dbR.yield_act_no());
				addR.base_unit_qty(dbR.base_unit_qty());
				yieldAddL.add(addR);
			}
			yieldL.addAll(yieldAddL);
		}

		/**
		 * 出来高受信実績により、製造ヘッダ項目の再設定を行う。<br>
		 * 全工程実績作成の出来高を受信した場合、未実績の工程について、工程実績を追加作成する。
		 */
		protected void setUpd03MdfOperActByYield(MfgActRecvIf_Upd02_ActLstR yieldR, MCList<MfgActRecvIf_Upd02_ActLstR> yieldL) {
			if (yieldR == null) {
				return;
			}

			// 出来高実績と出来高予定の比率を算出する。
			MCNumber yRate = getYieldActRate(yieldR, yieldR.base_unit_qty());
			MCNumber yRateOrg = yRate;

			// 出来高受信実績により、製造ヘッダ項目の再設定
			Set<String> operInstNoSet = new HashSet<String>();
			Set<String> operActNoSet = new HashSet<String>();
			for ( int pos = _mfgUpd03.up1().size() -1 ; pos >= 0 ; pos--) {
				MfgActIF_Upd03_Hdr1R hdr1R = _mfgUpd03.up1().get(pos);
				if (!isSame(yieldR.mfg_inst_no(), _mfgInstNo)) {
					break;
				}

				MST_OPER_INST_R oiR = (MST_OPER_INST_R)getSchdRCache(getCacheKey(MAC_IF_PROC_TYP.MES_OPER_INST_SEND.value(), hdr1R.oper_inst_no()));
				if (!isSame(hdr1R.mfg_inst_no(), yieldR.mfg_inst_no())) {
					continue;
				}
				// 工程に紐付く出来高実績が存在する場合、その出来高実績数量を合計してレートを算出しなおす
				MCNumber sumQty = MCNumber.ZERO;
				// 下記のif分岐に入らないと前回のyRateが使用されてしまうため、一旦元の値に戻す
				yRate = yRateOrg;
				MCList<MfgActIF_Upd03_DtlYieldByProdR> up3L = _mfgUpd03.up3().subList(MfgActIF_Upd03_DtlYieldByProdR.$hdr_peg_no, hdr1R.peg_no());
				if (!up3L.isEmpty()) {
					hdr1R.setStringNE("yield_typ", up3L.min(MfgActIF_Upd03_DtlYieldByProdR.$yield_typ).toString());
					for (MfgActIF_Upd03_DtlYieldByProdR r : up3L) {
						// _mfgUpd03に設定された外部出来高実績ＮＯからyieldL（受信データ）のレコードを特定
						MCList<MfgActRecvIf_Upd02_ActLstR> yL = null;
						if (isNull(r.ext_yield_act_no())) {
							yL = yieldL.subList(MfgActRecvIf_Upd02_ActLstR.$yield_act_no, r.yield_act_no());
						}
						else {
							yL = yieldL.subList(MfgActRecvIf_Upd02_ActLstR.$ext_yield_act_no, r.ext_yield_act_no());
						}
						for (MfgActRecvIf_Upd02_ActLstR yR : yL) {
							sumQty = sumQty.add(yR.base_unit_qty());
						}
					}
					yRate = getYieldActRate(yieldR, sumQty);
				}

				setUpd03MfgHdrItems(hdr1R, yieldR, yRate, oiR);

				operInstNoSet.add(hdr1R.oper_inst_no());
				if (!isNull(hdr1R.oper_act_no())) {
					operActNoSet.add(hdr1R.oper_act_no());
				}
			}

			if (!yieldR.all_oper_act_reg_flg()) {
				return;
			}

			Map<String, String> operNoMap = new HashMap<String, String>();
			MCList<MCRow> operActL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value(), _mfgActNo));
			if (!isNull(operActL)) {
				for (int oa=0 ; oa < operActL.size() ; oa++) {
					MST_OPER_ACT_R oaR = (MST_OPER_ACT_R)operActL.get(oa);
					if (!operActNoSet.contains(oaR.oper_act_no())) {
						MST_OPER_INST_R oiR = (MST_OPER_INST_R)getSchdRCache(getCacheKey(MAC_IF_PROC_TYP.MES_OPER_INST_SEND.value(), oaR.oper_inst_no()));
						yieldR.oper_inst_no(oaR.oper_inst_no());
						yieldR.oper_act_no(oaR.oper_act_no());
						yieldR.ext_oper_act_no(oaR.ext_oper_act_no());
						yieldR.ext_sys_cd(oaR.ext_sys_cd());

						MfgActIF_Upd03_Hdr1R addHdr1R = makeUpd03MdfOperActTelegram(yieldR, false);
						setUpd03MfgHdrItems(addHdr1R, yieldR, yRate, oiR);
						_mfgUpd03.up1().add(addHdr1R);

						operInstNoSet.add(oaR.oper_inst_no());
					}
					else {
						operNoMap.put(oaR.oper_inst_no(), oaR.oper_act_no());
					}
				}
			}

			// 出来高受信実績により、全工程実績作成の場合、未実績の工程について、工程実績を追加作成する。
			MCList<MCRow> operInstL = getSchdLCache(getCacheKey(MAC_IF_PROC_TYP.MES_OPER_INST_SEND.value(), _mfgInstNo));
			for (int oi=0 ; oi < operInstL.size() ; oi++) {
				MST_OPER_INST_R oiR = (MST_OPER_INST_R)operInstL.get(oi);
				if (operInstNoSet.contains(oiR.oper_inst_no())) {
					continue;
				}

				MST_OPER_ACT_R oadbR = getDBOperAct(operNoMap.get(oiR.oper_inst_no()));

				yieldR.oper_inst_no(oiR.oper_inst_no());
				yieldR.oper_act_no(oadbR.oper_act_no());
				yieldR.ext_oper_act_no(oadbR.ext_oper_act_no());
				yieldR.ext_sys_cd(oadbR.ext_sys_cd());

				MfgActIF_Upd03_Hdr1R addHdr1R = makeUpd03MdfOperActTelegram(yieldR, false);
				setUpd03MfgHdrItems(addHdr1R, yieldR, yRate, oiR);
				_mfgUpd03.up1().add(addHdr1R);
			}
		}

		/**
		 * 投入・工数の新規登録用電文を作成する。
		 */
		protected void makeUpd01InsMfgActData(MCList<MfgActRecvIf_Upd02_ActLstR> mfgInstL) {
			// 製造ヘッダの実績データを作成する。
			makeUpd01InsMfgActHdr();

			// 工程・投入・工数の実績データを作成する。（出来高はないはず）
			for (MfgActRecvIf_Upd02_ActLstR actR : mfgInstL) {
				if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(actR.if_proc_typ())) {
					makeUpd01InsOperActData(actR);
				}
				else if (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(actR.if_proc_typ())) {
					makeUpd01InsInptActData(actR);
				}
				else if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(actR.if_proc_typ())) {
					makeUpd01InsWkActData(actR);
				}
			}
		}

		/**
		 * 製造実績ヘッダ作成
		 */
		protected void makeUpd01InsMfgActHdr() {
			_mfgHdrR = MfgActIF_Upd01_HdrR.create();

			// 紐付けＮＯ（ヘッダ）
			_mfgHdrR.peg_no(_hdrPegNo);

			// ヘッダ紐付けＮＯと製造指図ＮＯの保持
			_mfgPegNoM.put(_hdrPegNo, _mfgInstNo);
			_hdrPegNo = _hdrPegNo.add(1);

			_mfgHdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());			// データ更新区分
			_mfgHdrR.mfg_inst_no(_mfgInstNo);								// 製造指図ＮＯ
			_mfgHdrR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());				// 製造状況区分
			_mfgHdrR.base_unit_st_act_qty(_mfgInstR.base_unit_inst_qty());	// 着手数量 ＝＞ 基準単位製造指図数量とする。
			_mfgHdrR.rem_abort_flg(false);									// 残数打切 ＝＞ 必要ない（全数着手のため）
			_mfgHdrR.is_src_batch_flg(true);								// 呼出元バッチ処理ＦＬＧ
			_mfgHdrR.upd_cntr_chk_flg(false);								// 更新カウンタチェック ＝＞ チェックしない
			_mfgHdrR.not_pd_chk_flg(false);									// （投入受信実績で設定）期限チェックしない
			_mfgHdrR.lst_reg_flg(true);										// 一括実行

			_mfgUpd01.up1().add(_mfgHdrR);
		}

		protected void setUpd01InsMdfStartTime(MCDate operDate) {
			if (isNull(_mfgHdrR.st_act_tm())) {
				_mfgHdrR.st_act_tm(operDate);
				_mfgHdrR.st_ac_dt(getAcDt(_mfgHdrR.st_act_tm()));
				return;
			}

			if (_mfgHdrR.st_act_tm().gt(operDate)) {
				_mfgHdrR.st_act_tm(operDate);
				_mfgHdrR.st_ac_dt(getAcDt(_mfgHdrR.st_act_tm()));
			}
		}

		protected void setUpd01InsMdfStartTime(MfgActIF_Upd01_DtlOperR poR) {
			if (isNull(_mfgHdrR.st_act_tm())) {
				_mfgHdrR.st_act_tm(poR.st_act_tm());
				_mfgHdrR.st_ac_dt(nvl(poR.ac_dt(), getAcDt(_mfgHdrR.st_act_tm())));
				return;
			}

			if (_mfgHdrR.st_act_tm().gt(poR.st_act_tm())) {
				_mfgHdrR.st_act_tm(poR.st_act_tm());
				_mfgHdrR.st_ac_dt(nvl(poR.ac_dt(), getAcDt(_mfgHdrR.st_act_tm())));
			}
		}

		protected void makeUpd01InsOperActData(MfgActRecvIf_Upd02_ActLstR actR) {
			// 工程実績上り電文の作成
			_mfgUpd01.up2().add(makeUpd01InsOperActTelegram(actR, true));
			// 製造実績ヘッダ着手日時の設定
			setUpd01InsMdfStartTime(actR.st_act_tm());
		}

		protected MfgActIF_Upd01_DtlOperR makeUpd01InsOperActTelegram(MfgActRecvIf_Upd02_ActLstR actR, boolean isOper) {
			MfgActIF_Upd01_DtlOperR operR = MfgActIF_Upd01_DtlOperR.create();
			operR.mfg_inst_no(actR.mfg_inst_no());							// 製造指図ＮＯ

			MST_OPER_INST_R oiR = (MST_OPER_INST_R)getSchdRCache(
					getCacheKey(MAC_IF_PROC_TYP.MES_OPER_INST_SEND.value(), actR.oper_inst_no()));

			MCNumber operPegNo = new MCNumber(_mfgUpd01.up2().size());

			operR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());				// データ更新区分
			operR.hdr_peg_no(_mfgHdrR.peg_no());							// ヘッダ紐付けＮＯ
			operR.peg_no(operPegNo);										// 工程紐付けＮＯ

			// 受信実績から設定する共通項目
			operR.mes_flg(true);											// ＭＥＳ
			operR.oper_inst_no(actR.oper_inst_no());						// 工程指図ＮＯ
			operR.ext_sys_cd(actR.ext_sys_cd());							// 外部システムＣＤ
			operR.ext_oper_act_no(actR.ext_oper_act_no());					// 外部工程実績ＮＯ
			// 工程紐付けＮＯと工程指図ＮＯの記憶
			_operPegNoM.put(operR.peg_no(), operR.oper_inst_no());

			// 工程受信実績から設定
			if (isOper) {
				operR.oper_unit_act_qty(actR.oper_unit_qty());				// 工程単位実績数量
				operR.oper_yield(actR.oper_yield());						// 工程実際収率
				operR.oper_act_intr_rmrks(actR.intr_rmrks());				// 内部備考
				operR.oper_act_rpt_rmrks(actR.act_rpt_rmrks());				// 記録書備考
				operR.bkf_upd_flg(actR.bkf_ctl_flg());						// バックフラッシュ更新許可
				operR.wk_cost_upd_calc_flg(actR.wk_cost_calc_ctl_flg());	// 自動工数計算更新許可
				operR.st_act_tm(actR.st_act_tm());							// 着手実績日時
				operR.end_act_tm(actR.end_act_tm());						// 終了実績日時
				operR.not_cmpl_flg(actR.not_cmpl_flg());					// 未完了
				operR.if_auto_reg_flg(false);								// ＩＦ自動作成
			}
			// 投入・工数・出来高受信実績から設定
			else {
				operR.st_act_tm(nvl(actR.act_tm(),nvl(actR.st_hm(),actR.ac_dt())));	// 実績日時（工数：計上日）

				// 工数実績、かつ着手時刻が設定されていない場合、ヘッダの着手計上日に計上日をそのまま設定するため、計上日を保持する
				if (isNull(actR.act_tm()) && isNull(actR.st_hm())) {
					operR.ac_dt(actR.ac_dt());
				}

				operR.if_auto_reg_flg(true);								// ＩＦ自動作成
				if (!isNull(operR.ext_oper_act_no())) {
					String extKey = crtExtAltrKey(MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value(), operR.ext_sys_cd(), operR.ext_oper_act_no(), operR.if_auto_reg_flg());
					if (getExtActKeySet().contains(extKey)) {
						operR.ext_oper_act_no(null);
					}
					else {
						getExtActKeySet().add(extKey);
					}
				}
			}

			// 工程指図から補完
			operR.disp_seq(oiR.disp_seq());									// 工順
			operR.oper_ord_no(oiR.oper_ord_no());							// 工程オーダＮＯ
			// 工程受信実績以外の場合
			if (!isOper) {
				operR.oper_unit_act_qty(convQtyBaseToOper(oiR.base_unit_qty(),
						oiR.oper_conv_qty(), oiR.oper_std_qty(), 
						oiR.oper_unit_dec_place(), 
						oiR.oper_unit_conv_rnd_typ()));						// 工程単位実績数量
				operR.bkf_upd_flg(oiR.bkf_flg());							// バックフラッシュ更新許可
				operR.wk_cost_upd_calc_flg(oiR.wk_cost_calc_flg());			// 自動工数計算更新許可
				operR.bkf_not_ref_flg(oiR.bkf_flg());						// バックフラッシュ未反映ＦＬＧ
			}

			if (isOper) {
				operR.setParamIndex(actR.getParamIndex());
				operR.setParamRowIndex(actR.getParamRowIndex());
			}

			return operR;
		}

		protected void makeUpd01InsInptActData(MfgActRecvIf_Upd02_ActLstR actR) {
			// 投入:投入実績電文を作成
			if (MSC_IF_INPT_TYP.isINPT(actR.if_inpt_typ())) {
				_mfgUpd01.up3().add(makeUpd01InsInptActTelegram(actR, true));
				// 期限チェックしない：ヘッダ単位に設定
				if (!_mfgHdrR.not_pd_chk_flg() && actR.not_pd_chk_flg()) {
					_mfgHdrR.not_pd_chk_flg(true);
				}
			}
			// ロス：親投入実績電文を探し出して、ロス実績電文を作成。（親投入がない場合、自動補完とする）
			else {
				_mfgUpd01.up4().add(makeUpd01InsLossActData(actR));
			}
		}

		protected MfgActIF_Upd01_DtlInptR makeUpd01InsInptActTelegram(MfgActRecvIf_Upd02_ActLstR actR, boolean isInpt) {
			MfgActIF_Upd01_DtlInptR inptR = MfgActIF_Upd01_DtlInptR.create();
			inptR.mfg_inst_no(actR.mfg_inst_no());							// 製造指図ＮＯ
			inptR.oper_inst_no(actR.oper_inst_no());						// 工程指図ＮＯ

			// 親工程
			MfgActIF_Upd01_DtlOperR operR = getUpd01ParentOper(actR, true);

			MCNumber inptPegNo = new MCNumber(_mfgUpd01.up3().size());

			inptR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());				// データ更新区分
			inptR.hdr_peg_no(_mfgHdrR.peg_no());							// ヘッダ紐付けＮＯ
			inptR.oper_peg_no(operR.peg_no());								// 工程紐付けＮＯ
			inptR.peg_no(inptPegNo);										// 投入紐付けＮＯ
			inptR.mes_flg(true);											// ＭＥＳ

			inptR.lot_no(actR.lot_no());									// ロットＮＯ
			inptR.sublot_no(actR.sublot_no());								// サブロットＮＯ
			inptR.ver_no(actR.ver_no());									// 版ＮＯ
			inptR.act_tm(actR.act_tm());									// 実績日時
			inptR.ac_dt(getAcDt(actR.act_tm()));							// 計上日
			inptR.abort_flg(actR.abort_flg());								// 打切
			inptR.ext_sys_cd(actR.ext_sys_cd());							// 外部システムＣＤ
			inptR.ext_inpt_act_no(actR.ext_inpt_act_no());					// 外部投入実績ＮＯ

			if (isInpt) {
				inptR.if_auto_reg_flg(false);								// ＩＦ自動作成
				inptR.base_unit_inpt_qty(actR.base_unit_inpt_qty());		// 基準単位投入数量
				inptR.cont_inpt_qty(actR.cont_qty());						// 有効成分（投入数量）
				inptR.inpt_rsn_cd(actR.inpt_rsn_cd());						// 投入理由ＣＤ
				inptR.acxfr_act_qty(actR.acxfr_qty());						// 他勘定振替数量
				inptR.acxfr_act_rsn_cd(actR.acxfr_rsn_cd());				// 他勘定振替理由ＣＤ
				inptR.acxfr_act_bd_dpt_cd(actR.acxfr_bd_dpt_cd());			// 他勘定振替負担部門ＣＤ
				inptR.inpt_act_intr_rmrks(actR.act_intr_rmrks());			// 内部備考
				inptR.inpt_act_rpt_rmrks(actR.inpt_act_rpt_rmrks());		// 記録書備考
				inptR.trd_rmrks(actR.act_trd_rmrks());						// 取引備考
			}
			else {
				inptR.if_auto_reg_flg(true);								// ＩＦ自動作成
				inptR.base_unit_inpt_qty(MCNumber.ZERO);					// 基準単位投入数量
				inptR.cont_inpt_qty(MCNumber.ZERO);							// 有効成分（投入数量）
				if (!isNull(inptR.ext_inpt_act_no())) {
					String extKey = crtExtAltrKey(MAC_IF_PROC_TYP.MES_INPT_ACT_RECV.value(), inptR.ext_sys_cd(), inptR.ext_inpt_act_no(), inptR.if_auto_reg_flg());
					if (getExtActKeySet().contains(extKey)) {
						inptR.ext_inpt_act_no(null);
					}
					else {
						getExtActKeySet().add(extKey);
					}
				}
			}

			inptR.itm_cd(actR.itm_cd());									// 品目ＣＤ
			inptR.itm_sub1(actR.itm_sub1());								// 枝番１
			inptR.itm_sub2(actR.itm_sub2());								// 枝番２
			inptR.itm_sub3(actR.itm_sub3());								// 枝番３
			inptR.sno1(actR.sno1());										// 手配ＮＯ１(実績)
			inptR.sno2(actR.sno2());										// 手配ＮＯ２(実績)
			inptR.sno3(actR.sno3());										// 手配ＮＯ３(実績)
			inptR.sno4(actR.sno4());										// 手配ＮＯ４(実績)
			inptR.gd_cd(actR.gd_cd());										// 格付ＣＤ
			inptR.inpt_loc_cd(actR.inpt_loc_cd());							// 投入場所ＣＤ
			inptR.inpt_str_ln_cd(actR.inpt_str_ln_cd());					// 投入棚・ラインＣＤ
			inptR.stk_id_typ(actR.stk_id_typ());							// 在庫識別区分
			inptR.stk_bp_cd(actR.stk_bp_cd());								// 取引先ＣＤ
			inptR.stk_arrv_bp_cd(actR.stk_arrv_bp_cd());					// 着荷先ＣＤ

			// 投入予定から補完
			if (!isNull(actR.inpt_schd_no())) {
				inptR.inpt_schd_no(actR.inpt_schd_no());					// 投入予定ＮＯ

				MST_INPT_SCHD_R ischdR = (MST_INPT_SCHD_R)getSchdRCache(
						getCacheKey(MAC_IF_PROC_TYP.MES_INPT_SCHD_SEND.value(), actR.inpt_schd_no()));
				if (ischdR != null && !isNull(ischdR.inpt_schd_no())) {
					if (!isNull(ischdR.lot_no()) &&
							(isNull(inptR.lot_no()) || MAC_STR.isNULL_VAL(inptR.lot_no()))) {
						inptR.lot_no(ischdR.lot_no());						// ロットＮＯ
						inptR.sublot_no(ischdR.sublot_no());				// サブロットＮＯ
					}
					if (!isNull(ischdR.ver_no()) && isNull(inptR.ver_no())) {
						inptR.ver_no(ischdR.ver_no());						// 版ＮＯ
					}
					if (isNull(inptR.inpt_loc_cd()) && !isNull(ischdR.inpt_loc_cd())) {
						inptR.inpt_loc_cd(ischdR.inpt_loc_cd());			// 投入場所ＣＤ
						inptR.inpt_str_ln_cd(ischdR.inpt_str_ln_cd());		// 投入棚・ラインＣＤ
					}
					if (isInpt && isNull(inptR.inpt_rsn_cd()) && !isNull(ischdR.inpt_rsn_cd())) {
						inptR.inpt_rsn_cd(ischdR.inpt_rsn_cd());			// 投入理由ＣＤ
					}
					if (isNull(inptR.gd_cd()) && !isNull(ischdR.gd_cd())) {
						inptR.gd_cd(ischdR.gd_cd());						// 格付ＣＤ：予定
					}
					inptR.prov_typ(ischdR.prov_typ());						// 支給区分
					// 在庫識別区分が未設定かつ支給区分が自給の場合、在庫識別区分も自給
					if (isNull(inptR.stk_id_typ()) && MAC_PROV_TYP.isSS(inptR.prov_typ())) {
						inptR.stk_id_typ(MSC_STK_ID_TYP.SLF_SUPPRT.value());
					}

					// 手配ＮＯが未受信の場合、指図から補完（引当手配ＮＯを優先する）
					if (!actR.sno_recv_flg()) {
						if (ischdR.getBooleanNE("has_alloc_sno_flg")) {
							inptR.sno1(ischdR.alloc_sno1());				// 引当手配ＮＯ１(指図)
							inptR.sno2(ischdR.alloc_sno2());				// 引当手配ＮＯ２(指図)
							inptR.sno3(ischdR.alloc_sno3());				// 引当手配ＮＯ３(指図)
							inptR.sno4(ischdR.alloc_sno4());				// 引当手配ＮＯ４(指図)
						}
						else {
							inptR.sno1(ischdR.sno1());						// 手配ＮＯ１(指図)
							inptR.sno2(ischdR.sno2());						// 手配ＮＯ２(指図)
							inptR.sno3(ischdR.sno3());						// 手配ＮＯ３(指図)
							inptR.sno4(ischdR.sno4());						// 手配ＮＯ４(指図)
						}
					}
					// 代替品目Gが設定されている場合は、代替品目指定フラグをオンに設定する
					if (!isNull(ischdR.alt_grp_cd())) {
						inptR.alt_itm_fix_flg(true);
					}
					inptR.bkf_upd_flg(getBkfUpdFlgInptSchd(actR, ischdR));	// バックフラッシュ更新
				}
			}

			if (isNull(inptR.gd_cd())) {
				inptR.gd_cd(getDefaultFeedStkGd().gd_cd());								// 格付ＣＤ：デフォルト格付
			}

			if (isInpt) {
				inptR.setParamIndex(actR.getParamIndex());
				inptR.setParamRowIndex(actR.getParamRowIndex());
			}

			return inptR;
		}

		protected MfgActIF_Upd01_DtlLossR makeUpd01InsLossActData(MfgActRecvIf_Upd02_ActLstR actR) {
			MfgActIF_Upd01_DtlLossR lossR = MfgActIF_Upd01_DtlLossR.create();

			// 親投入
			MfgActIF_Upd01_DtlInptR inptR = getUpd01ParentInpt(actR, true);

			inptR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());		// データ更新区分
			lossR.inpt_peg_no(inptR.peg_no());						// 投入紐付けＮＯ
			lossR.loss_rsn_cd(actR.loss_rsn_cd());					// ロス理由ＣＤ
			lossR.loss_qty(actR.base_unit_inpt_qty());				// ロス数量
			lossR.cont_loss_qty(actR.cont_qty());					// 有効成分（ロス数量）
			lossR.intr_rmrks(actR.act_intr_rmrks());				// 内部備考
			lossR.trd_rmrks(actR.act_trd_rmrks());					// 取引備考

			lossR.setParamIndex(actR.getParamIndex());
			lossR.setParamRowIndex(actR.getParamRowIndex());

			return lossR;
		}

		protected void makeUpd01InsWkActData(MfgActRecvIf_Upd02_ActLstR actR) {
			// 工数実績電文を作成する。必要に応じて、工数の算出を行う。
			MfgActIF_Upd01_DtlWkR wkR = makeUpd01InsWkActTelegram(actR);
			calcWkActCost(wkR);

			_mfgUpd01.up5().add(wkR);
		}

		protected MfgActIF_Upd01_DtlWkR makeUpd01InsWkActTelegram(MfgActRecvIf_Upd02_ActLstR actR) {
			MfgActIF_Upd01_DtlWkR wkR = MfgActIF_Upd01_DtlWkR.create();

			// 親工程
			MfgActIF_Upd01_DtlOperR operR = getUpd01ParentOper(actR, true);

			MCNumber wkPegNo = new MCNumber(_mfgUpd01.up5().size());

			wkR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());		// データ更新区分
			wkR.hdr_peg_no(_mfgHdrR.peg_no());						// ヘッダ紐付けＮＯ
			wkR.oper_peg_no(operR.peg_no());						// 工程紐付けＮＯ
			wkR.peg_no(wkPegNo);									// 工数紐付けＮＯ
			wkR.mes_flg(true);										// ＭＥＳ
			wkR.ext_sys_cd(actR.ext_sys_cd());						// 外部システムＣＤ
			wkR.ext_wk_act_no(actR.ext_wk_act_no());				// 外部工数実績ＮＯ

			wkR.wk_cost_cd(actR.wk_cost_cd());						// 工数管理ＣＤ
			wkR.act_wk_cost(actR.wk_cost());						// 工数
			wkR.abort_flg(actR.abort_flg());						// 打切
			wkR.ac_dt(actR.ac_dt());								// 計上日
			wkR.st_tm(actR.st_hm());								// 着手時刻
			wkR.end_tm(actR.end_hm());								// 終了時刻
			wkR.brk_pd(actR.brk_pd());								// 中断時間
			wkR.wk_day_cd(actR.wk_day_cd());						// 勤務種類ＣＤ
			wkR.wk_rsn_cd(actR.wk_rsn_cd());						// 工数理由ＣＤ
			wkR.wk_usr_cd(actR.wk_usr_cd());						// 作業担当者ＣＤ
			wkR.wk_usr_dpt_cd(actR.wk_usr_dpt_cd());				// 作業者部門ＣＤ
			wkR.fclty(actR.fclty());								// 設備
			wkR.wk_act_intr_rmrks(actR.wk_intr_rmrks());			// 内部備考
			wkR.wk_schd_no(actR.wk_schd_no());						// 工数予定ＮＯ
			wkR.wk_cost_calc_upd_flg(actR.wk_cost_calc_upd_flg());	// 自動工数計算更新許可

			wkR.setParamIndex(actR.getParamIndex());
			wkR.setParamRowIndex(actR.getParamRowIndex());

			return wkR;
		}


		/**
		 * 投入・工数の訂正用電文を作成する。
		 */
		protected void makeUpd01MdfMfgActData(MCList<MfgActRecvIf_Upd02_ActLstR> mfgInstL) {
			// 製造ヘッダの実績データを作成する。
			makeUpd01MdfMfgActHdr();

			// 工程・投入・工数の実績データを作成する。（出来高はないはず）
			for (MfgActRecvIf_Upd02_ActLstR actR : mfgInstL) {
				if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(actR.if_proc_typ())) {
					makeUpd01MdfOperActData(actR);
				}
				else if (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(actR.if_proc_typ())) {
					makeUpd01MdfInptActData(actR);
				}
				else if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(actR.if_proc_typ())) {
					makeUpd01MdfWkActData(actR);
				}
			}
		}

		/**
		 * 製造実績ヘッダ作成
		 */
		protected void makeUpd01MdfMfgActHdr() {
			_mfgHdrR = MfgActIF_Upd01_HdrR.create();

			// 紐付けＮＯ
			_mfgHdrR.peg_no(_hdrPegNo);

			// ヘッダ紐付けＮＯと製造指図ＮＯの保持
			_mfgPegNoM.put(_hdrPegNo, _mfgInstNo);
			_hdrPegNo = _hdrPegNo.add(1);

			_mfgHdrR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());				// データ更新区分
			_mfgHdrR.mfg_inst_no(_mfgInstNo);									// 製造指図ＮＯ
			_mfgHdrR.div_seq(_mfgActR.div_seq());								// 分割連番
			_mfgHdrR.mfg_act_no(_mfgActR.mfg_act_no());							// 製造実績ＮＯ
			_mfgHdrR.base_unit_st_act_qty(_mfgActRemR.base_unit_mfg_qty());		// 着手数量 ＝＞ 基準単位製造指図数量とする。
			_mfgHdrR.mfg_sts_typ(_mfgActRemR.mfg_sts_typ());					// 製造状況区分
			_mfgHdrR.end_act_tm(_mfgActR.end_act_tm());							// 終了実績日時
			_mfgHdrR.end_ac_dt(_mfgActR.end_ac_dt());							// 終了計上日
			_mfgHdrR.rem_abort_flg(false);										// 残数打切 ＝＞ 必要ない（全数着手のため）
			_mfgHdrR.is_src_batch_flg(true);									// 呼出元バッチ処理ＦＬＧ
			_mfgHdrR.upd_cntr_chk_flg(false);									// 更新カウンタチェック ＝＞ チェックしない
			_mfgHdrR.not_pd_chk_flg(false);										// 期限チェックしない
			_mfgHdrR.lst_reg_flg(true);											// 一括実行
			_mfgHdrR.st_act_tm(_mfgActR.st_act_tm());							// 着手実績日時
			_mfgHdrR.st_ac_dt(_mfgActR.st_ac_dt());								// 着手計上日
			_mfgHdrR.act_usr_cd(_mfgActR.act_usr_cd());							// 実績責任者ＣＤ
			_mfgHdrR.act_dpt_cd(_mfgActR.act_dpt_cd());							// 実績部門ＣＤ
			_mfgHdrR.act_rpt_rmrks(_mfgActR.act_rpt_rmrks());					// 製造記録書備考
			_mfgHdrR.intr_rmrks(_mfgActR.intr_rmrks());							// 内部備考
			_mfgHdrR.itm_yield(_mfgActR.itm_yield());							// 品目実際収率
			_mfgHdrR.mfg_act_sub_char1(_mfgActR.sub_char1());					// 製造実績予備１
			_mfgHdrR.mfg_act_sub_char2(_mfgActR.sub_char2());					// 製造実績予備２
			_mfgHdrR.mfg_act_sub_char3(_mfgActR.sub_char3());					// 製造実績予備３
			_mfgHdrR.trd_cd(_mfgActR.trd_cd());									// 取引ＣＤ

			_mfgUpd01.up1().add(_mfgHdrR);
		}

		protected void makeUpd01MdfOperActData(MfgActRecvIf_Upd02_ActLstR actR) {
			// 工程実績の取消電文の作成
			if (MAC_DATA_CRUD_TYP.isDEL(actR.data_crud_typ())) {
				makeUpd01DelOperActData(actR);
				return;
			}

			// 工程実績上り電文の作成
			_mfgUpd01.up2().add(makeUpd01MdfOperActTelegram(actR, true));
		}

		protected void makeUpd01DelOperActData(MfgActRecvIf_Upd02_ActLstR actR) {
			// 工程取消の電文作成
			MfgActIF_Upd01_DtlOperR operR = makeUpd01DelOperActTelegram(actR);
			_mfgUpd01.up2().add(operR);
			//　自動補完された工程の削除データを受け取る際は投入・工数・出来高の取消を行わない
			if (!getDBOperAct(operR.oper_act_no()).if_auto_reg_flg()) {
				// 投入・工数・出来高取消の電文作成
				makeUpd01DelInptActData(actR, operR);
				makeUpd01DelWkActData(actR, operR);
				makeUpd01DelYieldActData(actR, operR);
			}
			// 工程取消が発生した場合、製造を着手中へ戻す
			_mfgHdrR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());		// 製造状況区分
			_mfgHdrR.end_act_tm(null);								// 終了実績日時
			_mfgHdrR.end_ac_dt(null);								// 終了計上日
		}

		protected MfgActIF_Upd01_DtlOperR makeUpd01DelOperActTelegram(MfgActRecvIf_Upd02_ActLstR actR) {
			MfgActIF_Upd01_DtlOperR operR = MfgActIF_Upd01_DtlOperR.create();
			operR.mfg_inst_no(actR.mfg_inst_no());					// 製造指図ＮＯ

			MST_OPER_INST_R oiR = (MST_OPER_INST_R)getSchdRCache(
					getCacheKey(MAC_IF_PROC_TYP.MES_OPER_INST_SEND.value(), actR.oper_inst_no()));

			MST_OPER_ACT_R dbR = getDBOperAct(actR.oper_act_no());

			MCNumber operPegNo = new MCNumber(_mfgUpd01.up2().size());

			operR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());		// データ更新区分
			operR.hdr_peg_no(_mfgHdrR.peg_no());					// ヘッダ紐付けＮＯ
			operR.peg_no(operPegNo);								// 工程紐付けＮＯ

			operR.mes_flg(dbR.mes_flg());							// ＭＥＳ
			operR.oper_inst_no(dbR.oper_inst_no());					// 工程指図ＮＯ
			operR.oper_act_no(dbR.oper_act_no());					// 工程実績ＮＯ
			operR.ext_sys_cd(dbR.ext_sys_cd());						// 外部システムＣＤ
			operR.ext_oper_act_no(dbR.ext_oper_act_no());			// 外部工程実績ＮＯ
			// 工程紐付けＮＯと工程指図ＮＯの記憶
			_operPegNoM.put(operR.peg_no(), operR.oper_inst_no());

			operR.oper_unit_act_qty(dbR.oper_unit_qty());			// 工程単位実績数量
			operR.oper_yield(dbR.oper_yield());						// 工程実際収率
			operR.st_act_tm(dbR.st_act_tm());						// 着手実績日時
			operR.end_act_tm(dbR.end_act_tm());						// 終了実績日時
			operR.disp_seq(dbR.disp_seq());							// 工順

			// 工程指図から補完
			operR.oper_ord_no(oiR.oper_ord_no());					// 工程オーダＮＯ

			operR.setParamIndex(actR.getParamIndex());
			operR.setParamRowIndex(actR.getParamRowIndex());

			return operR;
		}

		protected void makeUpd01DelInptActData(MfgActRecvIf_Upd02_ActLstR actR, MfgActIF_Upd01_DtlOperR operR) {
			MCList<MCRow> actInptL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_INPT_ACT_RECV.value(), _mfgActNo));
			if (isNull(actInptL)) {
				return;
			}

			for (int ai = 0 ; ai < actInptL.size() ; ai++) {
				MST_INPT_ACT_R inptR = (MST_INPT_ACT_R)actInptL.get(ai);
				if (!isSame(actR.oper_act_no(), inptR.oper_act_no())) {
					continue;
				}

				_mfgUpd01.up3().add(makeUpd01DelInptActTelegram(actR, inptR, operR));
			}
		}

		protected MfgActIF_Upd01_DtlInptR makeUpd01DelInptActTelegram(MfgActRecvIf_Upd02_ActLstR actR, 
																	MST_INPT_ACT_R idbR, MfgActIF_Upd01_DtlOperR operR) {
			MfgActIF_Upd01_DtlInptR inptR = MfgActIF_Upd01_DtlInptR.create();
			inptR.mfg_inst_no(actR.mfg_inst_no());					// 製造指図ＮＯ
			inptR.oper_inst_no(actR.oper_inst_no());				// 工程指図ＮＯ

			// 親工程
			if (operR == null) {
				operR = getUpd01ParentOper(actR, false);
			}

			MCNumber inptPegNo = new MCNumber(_mfgUpd01.up3().size());

			inptR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());		// データ更新区分
			inptR.hdr_peg_no(_mfgHdrR.peg_no());					// ヘッダ紐付けＮＯ
			inptR.oper_peg_no(operR.peg_no());						// 工程紐付けＮＯ
			inptR.peg_no(inptPegNo);								// 投入紐付けＮＯ
			inptR.mes_flg(idbR.mes_flg());							// ＭＥＳ

			inptR.lot_no(idbR.lot_no());							// ロットＮＯ
			inptR.sublot_no(idbR.sublot_no());						// サブロットＮＯ
			inptR.ver_no(idbR.ver_no());							// 版ＮＯ
			inptR.act_tm(idbR.act_tm());							// 実績日時
			inptR.ac_dt(idbR.ac_dt());								// 計上日

			inptR.ext_sys_cd(idbR.ext_sys_cd());					// 外部システムＣＤ
			inptR.ext_inpt_act_no(idbR.ext_inpt_act_no());			// 外部投入実績ＮＯ
			inptR.if_auto_reg_flg(false);							// ＩＦ自動作成
			inptR.base_unit_inpt_qty(idbR.base_unit_inpt_qty());	// 基準単位投入数量
			inptR.cont_inpt_qty(idbR.cont_qty());					// 有効成分（投入数量）
			inptR.inpt_rsn_cd(actR.inpt_rsn_cd());					// 投入理由ＣＤ
			inptR.acxfr_act_qty(idbR.acxfr_qty());					// 他勘定振替数量
			inptR.acxfr_act_rsn_cd(idbR.acxfr_rsn_cd());			// 他勘定振替理由ＣＤ
			inptR.acxfr_act_bd_dpt_cd(idbR.acxfr_bd_dpt_cd());		// 他勘定振替負担部門ＣＤ

			inptR.itm_cd(idbR.itm_cd());							// 品目ＣＤ
			inptR.itm_sub1(idbR.itm_sub1());						// 枝番１
			inptR.itm_sub2(idbR.itm_sub2());						// 枝番２
			inptR.itm_sub3(idbR.itm_sub3());						// 枝番３
			inptR.sno1(idbR.sno1());								// 手配ＮＯ１(実績)
			inptR.sno2(idbR.sno2());								// 手配ＮＯ２(実績)
			inptR.sno3(idbR.sno3());								// 手配ＮＯ３(実績)
			inptR.sno4(idbR.sno4());								// 手配ＮＯ４(実績)
			inptR.gd_cd(idbR.gd_cd());								// 格付ＣＤ
			inptR.inpt_loc_cd(idbR.inpt_loc_cd());					// 投入場所ＣＤ
			inptR.inpt_str_ln_cd(idbR.inpt_str_ln_cd());			// 投入棚・ラインＣＤ
			inptR.stk_id_typ(idbR.stk_id_typ());					// 在庫識別区分
			inptR.stk_bp_cd(idbR.stk_bp_cd());						// 取引先ＣＤ
			inptR.stk_arrv_bp_cd(idbR.stk_arrv_bp_cd());			// 着荷先ＣＤ

			inptR.inpt_schd_no(idbR.inpt_schd_no());				// 投入予定ＮＯ
			inptR.inpt_act_no(idbR.inpt_act_no());					// 投入実績ＮＯ
			inptR.can_ac_dt(idbR.ac_dt());							// 取消計上日

			inptR.setParamIndex(actR.getParamIndex());
			inptR.setParamRowIndex(actR.getParamRowIndex());

			return inptR;
		}

		protected void makeUpd01DelWkActData(MfgActRecvIf_Upd02_ActLstR actR, MfgActIF_Upd01_DtlOperR operR) {
			MCList<MCRow> actWkL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_WK_ACT_RECV.value(), _mfgActNo));
			if (isNull(actWkL)) {
				return;
			}

			for (int ai = 0 ; ai < actWkL.size() ; ai++) {
				MST_WK_ACT_R wkR = (MST_WK_ACT_R)actWkL.get(ai);
				if (!isSame(actR.oper_act_no(), wkR.oper_act_no())) {
					continue;
				}

				_mfgUpd01.up5().add(makeUpd01DelWkActTelegram(actR, wkR, operR));
			}
		}

		protected MfgActIF_Upd01_DtlWkR makeUpd01DelWkActTelegram(MfgActRecvIf_Upd02_ActLstR actR, 
																MST_WK_ACT_R wdbR, MfgActIF_Upd01_DtlOperR operR) {
			MfgActIF_Upd01_DtlWkR wkR = MfgActIF_Upd01_DtlWkR.create();

			// 親工程
			if (operR == null) {
				operR = getUpd01ParentOper(actR, false);
			}

			MCNumber wkPegNo = new MCNumber(_mfgUpd01.up5().size());

			wkR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());		// データ更新区分
			wkR.hdr_peg_no(_mfgHdrR.peg_no());						// ヘッダ紐付けＮＯ
			wkR.oper_peg_no(operR.peg_no());						// 工程紐付けＮＯ
			wkR.peg_no(wkPegNo);									// 工数紐付けＮＯ
			wkR.mes_flg(wdbR.mes_flg());							// ＭＥＳ
			wkR.ext_sys_cd(wdbR.ext_sys_cd());						// 外部システムＣＤ
			wkR.ext_wk_act_no(wdbR.ext_wk_act_no());				// 外部工数実績ＮＯ

			wkR.wk_cost_cd(wdbR.wk_cost_cd());						// 工数管理ＣＤ
			wkR.act_wk_cost(wdbR.wk_cost());						// 工数
			wkR.ac_dt(wdbR.ac_dt());								// 計上日
			wkR.st_tm(wdbR.st_tm());								// 着手時刻
			wkR.end_tm(wdbR.end_tm());								// 終了時刻
			wkR.brk_pd(wdbR.brk_pd());								// 中断時間
			wkR.wk_day_cd(wdbR.wk_day_cd());						// 勤務種類ＣＤ
			wkR.wk_rsn_cd(wdbR.wk_rsn_cd());						// 工数理由ＣＤ
			wkR.wk_usr_cd(wdbR.wk_usr_cd());						// 作業担当者ＣＤ
			wkR.fclty(wdbR.fclty());								// 設備
			wkR.wk_usr_dpt_cd(wdbR.wk_usr_dpt_cd());				// 作業者部門ＣＤ
			wkR.wk_schd_no(wdbR.wk_schd_no());						// 工数予定ＮＯ
			wkR.wk_cost_calc_upd_flg(wdbR.wk_cost_calc_ctl_flg());	// 自動工数計算更新許可
			wkR.wk_act_no(wdbR.wk_act_no());						// 工数実績ＮＯ

			wkR.setParamIndex(actR.getParamIndex());
			wkR.setParamRowIndex(actR.getParamRowIndex());

			return wkR;
		}

		protected void makeUpd01DelYieldActData(MfgActRecvIf_Upd02_ActLstR actR, MfgActIF_Upd01_DtlOperR operR) {
			MCList<MCRow> actYieldL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_YIELD_ACT_RECV.value(), _mfgActNo));
			if (isNull(actYieldL)) {
				return;
			}

			for (int ai = 0 ; ai < actYieldL.size() ; ai++) {
				MST_YIELD_ACT_R yieldR = (MST_YIELD_ACT_R)actYieldL.get(ai);
				if (!isSame(actR.oper_act_no(), yieldR.oper_act_no())) {
					continue;
				}

				if (MAC_YIELD_TYP.isBYPROD(yieldR.yield_typ())) {
					_mfgUpd01.up7().add(makeUpd01DelByProdActTelegram(actR, yieldR, operR));
				}
				else {
					_mfgUpd01.up6().add(makeUpd01DelYieldActTelegram(actR, yieldR, operR));
				}
			}
		}

		protected MfgActIF_Upd01_DtlYieldR makeUpd01DelYieldActTelegram(MfgActRecvIf_Upd02_ActLstR actR, 
																		MST_YIELD_ACT_R ydbR, MfgActIF_Upd01_DtlOperR operR) {
			MfgActIF_Upd01_DtlYieldR yieldR = MfgActIF_Upd01_DtlYieldR.create();

			// 親工程
			if (operR == null) {
				operR = getUpd01ParentOper(actR, false);
			}

			MCNumber yieldPegNo = new MCNumber(_mfgUpd01.up6().size());

			yieldR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());	// データ更新区分
			yieldR.hdr_peg_no(_mfgHdrR.peg_no());					// ヘッダ紐付けＮＯ
			yieldR.oper_peg_no(operR.peg_no());						// 工程紐付けＮＯ
			yieldR.peg_no(yieldPegNo);								// 出来高紐付けＮＯ
			yieldR.mes_flg(ydbR.mes_flg());							// ＭＥＳ
			yieldR.ext_sys_cd(ydbR.ext_sys_cd());					// 外部システムＣＤ
			yieldR.ext_yield_act_no(ydbR.ext_yield_act_no());		// 外部出来高実績ＮＯ

			yieldR.yield_typ(ydbR.yield_typ());						// 出来高区分
			yieldR.base_unit_yield_act_qty(ydbR.base_unit_qty());	// 基準単位出来高数
			yieldR.base_unit_cd(ydbR.base_unit_cd());				// 基準単位ＣＤ
			yieldR.trd_unit_yield_act_qty(ydbR.trd_unit_qty());		// 出来高数
			yieldR.trd_unit_cd(ydbR.trd_unit_cd());					// 取引単位ＣＤ
			yieldR.act_tm(ydbR.act_tm());							// 出来高実績日
			yieldR.ac_dt(ydbR.ac_dt());								// 計上日
			yieldR.lot_no(ydbR.lot_no());							// ロットＮＯ
			yieldR.sublot_no(ydbR.sublot_no());						// サブロットＮＯ
			yieldR.yield_rsn_cd(ydbR.yield_rsn_cd());				// 出来高理由ＣＤ
			yieldR.gd_cd(ydbR.gd_cd());								// 格付ＣＤ
			yieldR.strg_loc_cd(ydbR.strg_loc_cd());					// 格納場所ＣＤ
			yieldR.strg_str_ln_cd(ydbR.strg_str_ln_cd());			// 格納棚・ラインＣＤ
			yieldR.yield_rate(ydbR.yield_rate());					// 出来高進捗度
			yieldR.insp_cnt_rmrks(ydbR.insp_cnt_rmrks());			// 検査連絡備考
			yieldR.yield_schd_no(ydbR.yield_schd_no());				// 出来高予定ＮＯ
			yieldR.yield_act_no(ydbR.yield_act_no());				// 出来高実績ＮＯ
			yieldR.can_ac_dt(ydbR.ac_dt());							// 取消計上日
			yieldR.stk_lst_prnt_flg(ydbR.stk_lst_prnt_flg());		// 現品票発行済

			yieldR.setParamIndex(actR.getParamIndex());
			yieldR.setParamRowIndex(actR.getParamRowIndex());

			return yieldR;
		}

		protected MfgActIF_Upd01_DtlByProdR makeUpd01DelByProdActTelegram(MfgActRecvIf_Upd02_ActLstR actR, 
																		MST_YIELD_ACT_R ydbR, MfgActIF_Upd01_DtlOperR operR) {
			MfgActIF_Upd01_DtlByProdR byprodR = MfgActIF_Upd01_DtlByProdR.create();

			// 親工程
			if (operR == null) {
				operR = getUpd01ParentOper(actR, false);
			}

			MCNumber byprodPegNo = new MCNumber(_mfgUpd01.up7().size());

			byprodR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());	// データ更新区分
			byprodR.hdr_peg_no(_mfgHdrR.peg_no());					// ヘッダ紐付けＮＯ
			byprodR.oper_peg_no(operR.peg_no());					// 工程紐付けＮＯ
			byprodR.peg_no(byprodPegNo);							// 出来高紐付けＮＯ
			byprodR.mes_flg(ydbR.mes_flg());						// ＭＥＳ
			byprodR.ext_sys_cd(ydbR.ext_sys_cd());					// 外部システムＣＤ
			byprodR.ext_yield_act_no(ydbR.ext_yield_act_no());		// 外部出来高実績ＮＯ

			byprodR.itm_cd(ydbR.itm_cd());							// 品目ＣＤ
			byprodR.itm_sub1(ydbR.itm_sub1());						// 枝番１
			byprodR.itm_sub2(ydbR.itm_sub2());						// 枝番２
			byprodR.itm_sub3(ydbR.itm_sub3());						// 枝番３
			byprodR.base_unit_yield_act_qty(ydbR.base_unit_qty());	// 基準単位出来高数
			byprodR.base_unit_cd(ydbR.base_unit_cd());				// 基準単位ＣＤ
			byprodR.trd_unit_yield_act_qty(ydbR.trd_unit_qty());	// 取引単位数量
			byprodR.trd_unit_cd(ydbR.trd_unit_cd());				// 取引単位ＣＤ
			byprodR.act_tm(ydbR.act_tm());							// 出来高実績日
			byprodR.ac_dt(ydbR.ac_dt());							// 計上日
			byprodR.lot_no(ydbR.lot_no());							// ロットＮＯ
			byprodR.sublot_no(ydbR.sublot_no());					// サブロットＮＯ
			byprodR.sno1(ydbR.sno1());								// 手配ＮＯ１
			byprodR.sno2(ydbR.sno2());								// 手配ＮＯ２
			byprodR.sno3(ydbR.sno3());								// 手配ＮＯ３
			byprodR.sno4(ydbR.sno4());								// 手配ＮＯ４
			byprodR.yield_rsn_cd(ydbR.yield_rsn_cd());				// 出来高理由ＣＤ
			byprodR.quality_typ(ydbR.quality_typ());				// 良品区分
			byprodR.gd_cd(ydbR.gd_cd());							// 格付ＣＤ
			byprodR.strg_loc_cd(ydbR.strg_loc_cd());				// 格納場所ＣＤ
			byprodR.strg_str_ln_cd(ydbR.strg_str_ln_cd());			// 格納棚・ラインＣＤ
			byprodR.yield_schd_no(ydbR.yield_schd_no());			// 出来高予定ＮＯ
			byprodR.yield_act_no(ydbR.yield_act_no());				// 出来高実績ＮＯ
			byprodR.can_ac_dt(ydbR.ac_dt());						// 取消計上日
			byprodR.stk_lst_prnt_flg(ydbR.stk_lst_prnt_flg());		// 現品票発行済

			byprodR.setParamIndex(actR.getParamIndex());
			byprodR.setParamRowIndex(actR.getParamRowIndex());

			return byprodR;
		}

		protected MfgActIF_Upd01_DtlOperR makeUpd01MdfOperActTelegram(MfgActRecvIf_Upd02_ActLstR actR, boolean isOper) {
			MfgActIF_Upd01_DtlOperR operR = MfgActIF_Upd01_DtlOperR.create();
			operR.mfg_inst_no(actR.mfg_inst_no());							// 製造指図ＮＯ

			MST_OPER_INST_R oiR = (MST_OPER_INST_R)getSchdRCache(
					getCacheKey(MAC_IF_PROC_TYP.MES_OPER_INST_SEND.value(), actR.oper_inst_no()));

			MST_OPER_ACT_R dbR = getDBOperAct(actR.oper_act_no());
			if (isNull(dbR.oper_act_no())) {
				dbR = getDBOperAct(actR.mfg_act_no(), actR.oper_inst_no(), actR.ext_oper_act_no());
			}

			MCNumber operPegNo = new MCNumber(_mfgUpd01.up2().size());

			operR.hdr_peg_no(_mfgHdrR.peg_no());							// ヘッダ紐付けＮＯ
			operR.peg_no(operPegNo);										// 工程紐付けＮＯ

			if (!isNull(dbR.oper_act_no())) {
				operR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());			// データ更新区分
				operR.mes_flg(dbR.mes_flg());								// ＭＥＳ
				operR.oper_inst_no(dbR.oper_inst_no());						// 工程指図ＮＯ
				operR.oper_act_no(dbR.oper_act_no());						// 工程実績ＮＯ
				operR.ext_sys_cd(dbR.ext_sys_cd());							// 外部システムＣＤ
				operR.ext_oper_act_no(dbR.ext_oper_act_no());				// 外部工程実績ＮＯ
				operR.st_act_tm(dbR.st_act_tm());							// 着手実績日時
				operR.if_auto_reg_flg(dbR.if_auto_reg_flg());				// ＩＦ自動作成
				operR.oper_act_sub_char1(dbR.sub_char1());					// 工程予備１
				operR.oper_act_sub_char2(dbR.sub_char2());					// 工程予備２
				operR.oper_act_sub_char3(dbR.sub_char3());					// 工程予備３
			}
			else {
				operR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());			// データ更新区分
				operR.oper_inst_no(actR.oper_inst_no());					// 工程指図ＮＯ
				operR.ext_sys_cd(actR.ext_sys_cd());						// 外部システムＣＤ
				operR.ext_oper_act_no(actR.ext_oper_act_no());				// 外部工程実績ＮＯ
			}

			// 工程紐付けＮＯと工程指図ＮＯの記憶
			_operPegNoM.put(operR.peg_no(), operR.oper_inst_no());

			// 工程実績を受信した場合、受信データを優先する。
			if (isOper) {
				operR.mes_flg(true);										// ＭＥＳ
				operR.ext_sys_cd(actR.ext_sys_cd());						// 外部システムＣＤ
				operR.ext_oper_act_no(actR.ext_oper_act_no());				// 外部工程実績ＮＯ
				operR.oper_unit_act_qty(actR.oper_unit_qty());				// 工程単位実績数量
				operR.oper_yield(actR.oper_yield());						// 工程実際収率
				operR.oper_act_intr_rmrks(actR.intr_rmrks());				// 内部備考
				operR.oper_act_rpt_rmrks(actR.act_rpt_rmrks());				// 記録書備考
				operR.bkf_upd_flg(actR.bkf_ctl_flg());						// バックフラッシュ更新許可
				operR.wk_cost_upd_calc_flg(actR.wk_cost_calc_ctl_flg());	// 自動工数計算更新許可
				operR.st_act_tm(actR.st_act_tm());							// 着手実績日時
				operR.end_act_tm(actR.end_act_tm());						// 終了実績日時
				operR.not_cmpl_flg(actR.not_cmpl_flg());					// 未完了
				operR.if_auto_reg_flg(false);								// ＩＦ自動作成
			}
			// 工程実績を受信しなかった、登録済の実績がある場合、実績から補完する。
			else if (!isNull(dbR.oper_act_no())) {
				operR.oper_unit_act_qty(dbR.oper_unit_qty());				// 工程単位実績数量
				operR.oper_yield(dbR.oper_yield());							// 工程実際収率
				operR.oper_act_intr_rmrks(dbR.intr_rmrks());				// 内部備考
				operR.oper_act_rpt_rmrks(dbR.act_rpt_rmrks());				// 記録書備考
				operR.bkf_upd_flg(dbR.bkf_ctl_flg());						// バックフラッシュ更新許可
				operR.wk_cost_upd_calc_flg(dbR.wk_cost_calc_ctl_flg());		// 自動工数計算更新許可
				// 登録済の工程実績よりも過去日の場合は置き換える
				MCDate actDt = nvl(actR.act_tm(),nvl(actR.st_hm(),actR.ac_dt()));
				if (dbR.if_auto_reg_flg() && !isNull(actDt) && actDt.lt(dbR.st_act_tm())) {
					operR.st_act_tm(actDt);
					// 工数実績、かつ着手時刻が設定されていない場合、ヘッダの着手計上日に計上日をそのまま設定するため、計上日を保持する
					if (isNull(actR.act_tm()) && isNull(actR.st_hm())) {
						operR.ac_dt(actR.ac_dt());
					}
				}
				else {
					operR.st_act_tm(dbR.st_act_tm());
				}
				if (!operR.if_auto_reg_flg()) {
					operR.end_act_tm(dbR.end_act_tm());						// 終了実績日時
					operR.not_cmpl_flg(isOperNotCmpl(oiR, dbR));			// 未完了
				}
				else if (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(actR.if_proc_typ())
						|| MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(actR.if_proc_typ())) {
					if (MSC_MFG_STS_TYP.isCMPL(dbR.getStringNE("mfg_sts_typ"))
							&& actR.abort_flg()) {
						operR.end_act_tm(dbR.end_act_tm());						// 終了実績日時
						operR.not_cmpl_flg(isOperNotCmpl(oiR, dbR));			// 未完了
					}
				}
				operR.bkf_not_ref_flg(dbR.bkf_not_ref_flg());				// バックフラッシュ未反映ＦＬＧ
			}
			// 工程実績がない場合、ＩＦ自動補完で作成する。（工程指図から補完あり）
			else {
				operR.st_act_tm(nvl(actR.act_tm(),nvl(actR.st_hm(),actR.ac_dt())));	// 実績日時（工数：計上日）

				// 工数実績、かつ着手時刻が設定されていない場合、ヘッダの着手計上日に計上日をそのまま設定するため、計上日を保持する
				if (isNull(actR.act_tm()) && isNull(actR.st_hm())) {
					operR.ac_dt(actR.ac_dt());
				}

				operR.if_auto_reg_flg(true);								// ＩＦ自動作成
				operR.oper_unit_act_qty(convQtyBaseToOper(oiR.base_unit_qty(),
						oiR.oper_conv_qty(), oiR.oper_std_qty(), 
						oiR.oper_unit_dec_place(), 
						oiR.oper_unit_conv_rnd_typ()));						// 工程単位実績数量
				operR.bkf_upd_flg(oiR.bkf_flg());							// バックフラッシュ更新許可
				operR.wk_cost_upd_calc_flg(oiR.wk_cost_calc_flg());			// 自動工数計算更新許可
				operR.mes_flg(true);
				if (!isNull(operR.ext_oper_act_no())) {
					String extKey = crtExtAltrKey(MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value(), operR.ext_sys_cd(), operR.ext_oper_act_no(), operR.if_auto_reg_flg());
					if (getExtActKeySet().contains(extKey)) {
						operR.ext_oper_act_no(null);
					}
					else {
						getExtActKeySet().add(extKey);
					}
				}
				operR.bkf_not_ref_flg(oiR.bkf_flg());						// バックフラッシュ未反映ＦＬＧ
			}
			
			if (actR.unschd_act_flg() && isNull(operR.end_act_tm()) && !isNull(dbR)) {
				operR.end_act_tm(dbR.end_act_tm());
			}

			operR.disp_seq(oiR.disp_seq());									// 工順
			operR.oper_ord_no(oiR.oper_ord_no());							// 工程オーダＮＯ

			if (isOper) {
				operR.setParamIndex(actR.getParamIndex());
				operR.setParamRowIndex(actR.getParamRowIndex());
			}

			return operR;
		}

		protected void makeUpd01MdfInptActData(MfgActRecvIf_Upd02_ActLstR actR) {
			// 投入:投入実績電文を作成
			if (MSC_IF_INPT_TYP.isINPT(actR.if_inpt_typ())) {
				// 投入電文作成
				if (MAC_DATA_CRUD_TYP.isDEL(actR.data_crud_typ())) {
					MST_INPT_ACT_R inptR = getDBInptAct(actR.inpt_act_no());
					_mfgUpd01.up3().add(makeUpd01DelInptActTelegram(actR, inptR, null));
				}
				else {
					_mfgUpd01.up3().add(makeUpd01MdfInptActTelegram(actR, true));
				}

				// 期限チェックしない：ヘッダ単位に設定
				if (!_mfgHdrR.not_pd_chk_flg() && actR.not_pd_chk_flg()) {
					_mfgHdrR.not_pd_chk_flg(true);
				}
			}
			// ロス：親投入実績電文を探し出して、ロス実績電文を作成。（親投入がない場合、自動補完とする）
			else {
				_mfgUpd01.up4().add(makeUpd01MdfLossActData(actR));
			}
		}

		protected MfgActIF_Upd01_DtlInptR makeUpd01MdfInptActTelegram(MfgActRecvIf_Upd02_ActLstR actR, boolean isInpt) {
			MfgActIF_Upd01_DtlInptR inptR = MfgActIF_Upd01_DtlInptR.create();
			inptR.mfg_inst_no(actR.mfg_inst_no());		// 製造指図ＮＯ
			inptR.oper_inst_no(actR.oper_inst_no());	// 工程指図ＮＯ

			// 親工程
			MfgActIF_Upd01_DtlOperR operR = getUpd01ParentOper(actR, false);

			MST_INPT_ACT_R dbR = getDBInptAct(actR.inpt_act_no());

			MCNumber inptPegNo = new MCNumber(_mfgUpd01.up3().size());

			inptR.hdr_peg_no(_mfgHdrR.peg_no());							// ヘッダ紐付けＮＯ
			inptR.oper_peg_no(operR.peg_no());								// 工程紐付けＮＯ
			inptR.peg_no(inptPegNo);										// 投入紐付けＮＯ

			if (!isNull(dbR.inpt_act_no())) {
				inptR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());			// データ更新区分
				inptR.mes_flg(dbR.mes_flg());								// ＭＥＳ
				inptR.if_auto_reg_flg(dbR.if_auto_reg_flg());				// ＩＦ自動作成
				inptR.inpt_act_no(dbR.inpt_act_no());						// 投入実績ＮＯ
				inptR.inpt_schd_no(dbR.inpt_schd_no());						// 投入予定ＮＯ
				inptR.can_ac_dt(dbR.ac_dt());								// 取消計上日
				inptR.ext_sys_cd(dbR.ext_sys_cd());							// 外部システムＣＤ
				inptR.ext_inpt_act_no(dbR.ext_inpt_act_no());				// 外部投入実績ＮＯ
				inptR.act_tm(dbR.act_tm());									// 実績日時
				inptR.ac_dt(dbR.ac_dt());									// 計上日
				inptR.itm_cd(dbR.itm_cd());									// 品目ＣＤ
				inptR.itm_sub1(dbR.itm_sub1());								// 枝番１
				inptR.itm_sub2(dbR.itm_sub2());								// 枝番２
				inptR.itm_sub3(dbR.itm_sub3());								// 枝番３
				inptR.lot_no(dbR.lot_no());									// ロットＮＯ
				inptR.sublot_no(dbR.sublot_no());							// サブロットＮＯ
				inptR.ver_no(dbR.ver_no());									// 版ＮＯ
				inptR.sno1(dbR.sno1());										// 手配ＮＯ１(実績)
				inptR.sno2(dbR.sno2());										// 手配ＮＯ２(実績)
				inptR.sno3(dbR.sno3());										// 手配ＮＯ３(実績)
				inptR.sno4(dbR.sno4());										// 手配ＮＯ４(実績)
				inptR.gd_cd(dbR.gd_cd());									// 格付ＣＤ
				inptR.inpt_rsn_cd(dbR.inpt_rsn_cd());						// 投入理由ＣＤ
				inptR.inpt_loc_cd(dbR.inpt_loc_cd());						// 投入場所ＣＤ
				inptR.inpt_str_ln_cd(dbR.inpt_str_ln_cd());					// 投入棚・ラインＣＤ
				inptR.stk_id_typ(dbR.stk_id_typ());							// 在庫識別区分
				inptR.stk_bp_cd(dbR.stk_bp_cd());							// 取引先ＣＤ
				inptR.stk_arrv_bp_cd(dbR.stk_arrv_bp_cd());					// 着荷先ＣＤ
				inptR.inpt_act_sub_char1(dbR.sub_char1());					// 予備１（実績）
				inptR.inpt_act_sub_char2(dbR.sub_char2());					// 予備２（実績）
				inptR.inpt_act_sub_char3(dbR.sub_char3());					// 予備３（実績）
			}
			else {
				inptR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());			// データ更新区分
				inptR.mes_flg(true);										// ＭＥＳ
				inptR.ext_sys_cd(actR.ext_sys_cd());						// 外部システムＣＤ
				inptR.ext_inpt_act_no(actR.ext_inpt_act_no());				// 外部投入実績ＮＯ
				inptR.lot_no(actR.lot_no());								// ロットＮＯ
				inptR.sublot_no(actR.sublot_no());							// サブロットＮＯ
				inptR.ver_no(actR.ver_no());								// 版ＮＯ
				inptR.sno1(actR.sno1());									// 手配ＮＯ１(実績)
				inptR.sno2(actR.sno2());									// 手配ＮＯ２(実績)
				inptR.sno3(actR.sno3());									// 手配ＮＯ３(実績)
				inptR.sno4(actR.sno4());									// 手配ＮＯ４(実績)
				inptR.act_tm(actR.act_tm());								// 実績日時
				inptR.ac_dt(getAcDt(actR.act_tm()));						// 計上日
				// 投入実績が再度新規作成の場合のみ、予備を引き継ぎとする。
				if (!isNull(actR.can_ac_dt()) || actR.chk_add_flg()) {
					inptR.inpt_act_sub_char1(dbR.sub_char1());				// 予備１（実績）
					inptR.inpt_act_sub_char2(dbR.sub_char2());				// 予備２（実績）
					inptR.inpt_act_sub_char3(dbR.sub_char3());				// 予備３（実績）
				}
			}

			if (isInpt) {
				inptR.ext_sys_cd(actR.ext_sys_cd());						// 外部システムＣＤ
				inptR.ext_inpt_act_no(actR.ext_inpt_act_no());				// 外部投入実績ＮＯ
				inptR.if_auto_reg_flg(actR.if_auto_reg_flg());				// ＩＦ自動作成
				inptR.base_unit_inpt_qty(actR.base_unit_inpt_qty());		// 基準単位投入数量
				inptR.cont_inpt_qty(actR.cont_qty());						// 有効成分（投入数量）
				// 投入取消＝＞訂正（ロス実績があるため）へ変更により、打切と予備をクリアし、それ以外は設定不要
				if (inptR.if_auto_reg_flg()) {
					inptR.abort_flg(false);									// 打切
					inptR.inpt_act_sub_char1(null);							// 予備１（実績）
					inptR.inpt_act_sub_char2(null);							// 予備２（実績）
					inptR.inpt_act_sub_char3(null);							// 予備３（実績）
				}
				else {
					inptR.abort_flg(actR.abort_flg());						// 打切
					if (!isNull(actR.act_tm())) {
						inptR.act_tm(actR.act_tm());						// 実績日時
						inptR.ac_dt(getAcDt(actR.act_tm()));				// 計上日
					}
					if (!isNull(actR.inpt_rsn_cd())) {
						inptR.inpt_rsn_cd(actR.inpt_rsn_cd());				// 投入理由ＣＤ
					}
					inptR.acxfr_act_qty(actR.acxfr_qty());					// 他勘定振替数量
					inptR.acxfr_act_rsn_cd(actR.acxfr_rsn_cd());			// 他勘定振替理由ＣＤ
					inptR.acxfr_act_bd_dpt_cd(actR.acxfr_bd_dpt_cd());		// 他勘定振替負担部門ＣＤ
					inptR.itm_cd(actR.itm_cd());							// 品目ＣＤ
					inptR.itm_sub1(actR.itm_sub1());						// 枝番１
					inptR.itm_sub2(actR.itm_sub2());						// 枝番２
					inptR.itm_sub3(actR.itm_sub3());						// 枝番３
					if (!isNull(actR.lot_no()) && !MAC_STR.isNULL_VAL(actR.lot_no())) {
						inptR.lot_no(actR.lot_no());						// ロットＮＯ
						inptR.sublot_no(actR.sublot_no());					// サブロットＮＯ
						inptR.ver_no(actR.ver_no());						// 版ＮＯ
					}
					if (actR.sno_recv_flg()) {
						inptR.sno1(actR.sno1());							// 手配ＮＯ１(実績)
						inptR.sno2(actR.sno2());							// 手配ＮＯ２(実績)
						inptR.sno3(actR.sno3());							// 手配ＮＯ３(実績)
						inptR.sno4(actR.sno4());							// 手配ＮＯ４(実績)
					}
					if (!isNull(actR.gd_cd())) {
						inptR.gd_cd(actR.gd_cd());							// 格付ＣＤ
					}
					if (!isNull(actR.inpt_loc_cd())) {
						inptR.inpt_loc_cd(actR.inpt_loc_cd());				// 投入場所ＣＤ
						inptR.inpt_str_ln_cd(actR.inpt_str_ln_cd());		// 投入棚・ラインＣＤ
					}
					if (!isNull(actR.stk_id_typ())) {
						inptR.stk_id_typ(actR.stk_id_typ());				// 在庫識別区分
					}
					if (!isNull(actR.stk_bp_cd())) {
						inptR.stk_bp_cd(actR.stk_bp_cd());					// 取引先ＣＤ
					}
					if (!isNull(actR.stk_arrv_bp_cd())) {
						inptR.stk_arrv_bp_cd(actR.stk_arrv_bp_cd());		// 着荷先ＣＤ
					}
					inptR.inpt_act_intr_rmrks(actR.act_intr_rmrks());		// 内部備考
					inptR.inpt_act_rpt_rmrks(actR.inpt_act_rpt_rmrks());	// 記録書備考
					inptR.trd_rmrks(actR.act_trd_rmrks());					// 取引備考
				}
			}
			else if (!isNull(dbR.inpt_act_no())) {
				inptR.base_unit_inpt_qty(dbR.base_unit_inpt_qty());			// 基準単位投入数量
				inptR.cont_inpt_qty(dbR.cont_qty());						// 有効成分（投入数量）
				inptR.abort_flg(actR.abort_flg());							// 打切
				inptR.inpt_rsn_cd(dbR.inpt_rsn_cd());						// 投入理由ＣＤ
				inptR.acxfr_act_qty(dbR.acxfr_qty());						// 他勘定振替数量
				inptR.acxfr_act_rsn_cd(dbR.acxfr_rsn_cd());					// 他勘定振替理由ＣＤ
				inptR.acxfr_act_bd_dpt_cd(dbR.acxfr_bd_dpt_cd());			// 他勘定振替負担部門ＣＤ
				inptR.itm_cd(dbR.itm_cd());									// 品目ＣＤ
				inptR.itm_sub1(dbR.itm_sub1());								// 枝番１
				inptR.itm_sub2(dbR.itm_sub2());								// 枝番２
				inptR.itm_sub3(dbR.itm_sub3());								// 枝番３
				inptR.inpt_act_intr_rmrks(dbR.intr_rmrks());				// 内部備考
				inptR.inpt_act_rpt_rmrks(dbR.act_rpt_rmrks());				// 記録書備考
				inptR.trd_rmrks(dbR.trd_rmrks());							// 取引備考
				inptR.bkf_upd_flg(getBkfUpdFlgInptAct(actR, dbR));			// バックフラッシュ更新
			}
			else {
				inptR.ext_sys_cd(actR.ext_sys_cd());						// 外部システムＣＤ
				inptR.ext_inpt_act_no(actR.ext_inpt_act_no());				// 外部投入実績ＮＯ
				inptR.if_auto_reg_flg(true);								// ＩＦ自動作成
				inptR.base_unit_inpt_qty(MCNumber.ZERO);					// 基準単位投入数量
				inptR.cont_inpt_qty(MCNumber.ZERO);							// 有効成分（投入数量）
				inptR.abort_flg(actR.abort_flg());							// 打切
				inptR.itm_cd(actR.itm_cd());								// 品目ＣＤ
				inptR.itm_sub1(actR.itm_sub1());							// 枝番１
				inptR.itm_sub2(actR.itm_sub2());							// 枝番２
				inptR.itm_sub3(actR.itm_sub3());							// 枝番３
				inptR.gd_cd(actR.gd_cd());									// 格付ＣＤ
				inptR.inpt_loc_cd(actR.inpt_loc_cd());						// 投入場所ＣＤ
				inptR.inpt_str_ln_cd(actR.inpt_str_ln_cd());				// 投入棚・ラインＣＤ
				inptR.stk_id_typ(actR.stk_id_typ());						// 在庫識別区分
				inptR.stk_bp_cd(actR.stk_bp_cd());							// 取引先ＣＤ
				inptR.stk_arrv_bp_cd(actR.stk_arrv_bp_cd());				// 着荷先ＣＤ
				if (!isNull(inptR.ext_inpt_act_no())) {
					String extKey = crtExtAltrKey(MAC_IF_PROC_TYP.MES_INPT_ACT_RECV.value(), inptR.ext_sys_cd(), inptR.ext_inpt_act_no(), inptR.if_auto_reg_flg());
					if (getExtActKeySet().contains(extKey)) {
						inptR.ext_inpt_act_no(null);
					}
					else {
						getExtActKeySet().add(extKey);
					}
				}
			}

			// 投入予定から補完
			if (isNull(dbR.inpt_act_no()) && !isNull(actR.inpt_schd_no())) {
				inptR.inpt_schd_no(actR.inpt_schd_no());				// 投入予定ＮＯ

				MST_INPT_SCHD_R ischdR = (MST_INPT_SCHD_R)getSchdRCache(
						getCacheKey(MAC_IF_PROC_TYP.MES_INPT_SCHD_SEND.value(), actR.inpt_schd_no()));
				if (ischdR != null && !isNull(ischdR.inpt_schd_no())) {
					if (!isInpt && !isNull(ischdR.lot_no()) && 
							(isNull(inptR.lot_no()) || MAC_STR.isNULL_VAL(inptR.lot_no()))) {
						inptR.lot_no(ischdR.lot_no());					// ロットＮＯ
						inptR.sublot_no(ischdR.sublot_no());			// サブロットＮＯ
					}
					if (!isNull(ischdR.ver_no()) && isNull(inptR.ver_no())) {
						inptR.ver_no(ischdR.ver_no());					// 版ＮＯ
					}
					if (isNull(inptR.inpt_loc_cd()) && !isNull(ischdR.inpt_loc_cd())) {
						inptR.inpt_loc_cd(ischdR.inpt_loc_cd());		// 投入場所ＣＤ
						inptR.inpt_str_ln_cd(ischdR.inpt_str_ln_cd());	// 投入棚・ラインＣＤ
					}
					if (isInpt && isNull(inptR.inpt_rsn_cd()) && !isNull(ischdR.inpt_rsn_cd())) {
						inptR.inpt_rsn_cd(ischdR.inpt_rsn_cd());		// 投入理由ＣＤ
					}
					if (isNull(inptR.gd_cd()) && !isNull(ischdR.gd_cd())) {
						inptR.gd_cd(ischdR.gd_cd());					// 格付ＣＤ：予定
					}
					inptR.prov_typ(ischdR.prov_typ());					// 支給区分
					// 在庫識別区分が未設定かつ支給区分が自給の場合、在庫識別区分も自給
					if (isNull(inptR.stk_id_typ()) && MAC_PROV_TYP.isSS(inptR.prov_typ())) {
						inptR.stk_id_typ(MSC_STK_ID_TYP.SLF_SUPPRT.value());
					}

					// 手配ＮＯが未受信の場合、指図から補完（引当手配ＮＯを優先する）
					if (!actR.sno_recv_flg()) {
						if (ischdR.getBooleanNE("has_alloc_sno_flg")) {
							inptR.sno1(ischdR.alloc_sno1());			// 引当手配ＮＯ１(指図)
							inptR.sno2(ischdR.alloc_sno2());			// 引当手配ＮＯ２(指図)
							inptR.sno3(ischdR.alloc_sno3());			// 引当手配ＮＯ３(指図)
							inptR.sno4(ischdR.alloc_sno4());			// 引当手配ＮＯ４(指図)
						}
						else {
							inptR.sno1(ischdR.sno1());					// 手配ＮＯ１(指図)
							inptR.sno2(ischdR.sno2());					// 手配ＮＯ２(指図)
							inptR.sno3(ischdR.sno3());					// 手配ＮＯ３(指図)
							inptR.sno4(ischdR.sno4());					// 手配ＮＯ４(指図)
						}
					}
					inptR.bkf_upd_flg(getBkfUpdFlgInptSchd(actR, ischdR));	// バックフラッシュ更新
				}
			}
			// 投入予定から補完
			if (!isNull(actR.inpt_schd_no())) {
				MST_INPT_SCHD_R ischdR = (MST_INPT_SCHD_R)getSchdRCache(
						getCacheKey(MAC_IF_PROC_TYP.MES_INPT_SCHD_SEND.value(), actR.inpt_schd_no()));
				if (ischdR != null && !isNull(ischdR.inpt_schd_no())) {
					// 代替品目Gが設定されている場合は、代替品目指定フラグをオンに設定する
					if (!isNull(ischdR.alt_grp_cd())) {
						inptR.alt_itm_fix_flg(true);
					}
				}
			}

			if (isNull(inptR.gd_cd())) {
				inptR.gd_cd(getDefaultFeedStkGd().gd_cd());							// 格付ＣＤ：デフォルト格付
			}

			if (isInpt) {
				inptR.setParamIndex(actR.getParamIndex());
				inptR.setParamRowIndex(actR.getParamRowIndex());
			}

			return inptR;
		}

		protected boolean getBkfUpdFlgInptSchd(MfgActRecvIf_Upd02_ActLstR actR, MST_INPT_SCHD_R ischdR) {
			// ロス実績のみが取込された場合、投入予定からバックフラッシュ更新ＦＬＧを補完する。
			if (!MSC_IF_INPT_TYP.isLOSS(actR.if_inpt_typ()) || MAC_BKF_TYP.isNO_BKF(ischdR.bkf_typ())) {
				return false;
			}
			MCList<MfgActRecvIf_Upd02_ActLstR> notLossL = up0().subList(r -> 
				isSame(r.ext_inpt_act_no(), actR.ext_inpt_act_no()) && isSame(r.inpt_act_no(), actR.inpt_act_no()) && !r.chk_add_flg() && !MSC_IF_INPT_TYP.isLOSS(r.if_inpt_typ())
			);
			if (notLossL.isEmpty()) {
				return true;
			}
			return false;
		}

		protected boolean getBkfUpdFlgInptAct(MfgActRecvIf_Upd02_ActLstR actR, MST_INPT_ACT_R dbR) {
			// ロス実績のみが取込された場合、投入実績からバックフラッシュ更新ＦＬＧを補完する。
			if (!MSC_IF_INPT_TYP.isLOSS(actR.if_inpt_typ()) || !dbR.bkf_ctl_flg()) {
				return false;
			}
			MCList<MfgActRecvIf_Upd02_ActLstR> notLossL = up0().subList(r -> 
				isSame(r.inpt_act_no(), actR.inpt_act_no()) && !r.chk_add_flg() && !MSC_IF_INPT_TYP.isLOSS(r.if_inpt_typ())
			);
			if (notLossL.isEmpty()) {
				return true;
			}
			return false;
		}

		protected MfgActIF_Upd01_DtlLossR makeUpd01MdfLossActData(MfgActRecvIf_Upd02_ActLstR actR) {
			MfgActIF_Upd01_DtlLossR lossR = MfgActIF_Upd01_DtlLossR.create();

			// 親投入
			MfgActIF_Upd01_DtlInptR inptR = getUpd01ParentInpt(actR, false);

			lossR.inpt_peg_no(inptR.peg_no());				// 投入紐付けＮＯ

			lossR.loss_act_no(actR.loss_act_no());			// ロス実績ＮＯ
			lossR.loss_rsn_cd(actR.loss_rsn_cd());			// ロス理由ＣＤ
			lossR.loss_qty(actR.base_unit_inpt_qty());		// ロス数量
			lossR.cont_loss_qty(actR.cont_qty());			// 有効成分（ロス数量）

			if (MAC_DATA_CRUD_TYP.isDEL(actR.data_crud_typ())) {
				lossR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
			else {
				if (!isNull(lossR.loss_act_no())) {
					lossR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else {
					lossR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				lossR.intr_rmrks(actR.act_intr_rmrks());	// 内部備考
				lossR.trd_rmrks(actR.act_trd_rmrks());		// 取引備考
				lossR.sub_char1(actR.sub_char1());			// 予備１
				lossR.sub_char2(actR.sub_char2());			// 予備２
				lossR.sub_char3(actR.sub_char3());			// 予備３
			}

			lossR.setParamIndex(actR.getParamIndex());
			lossR.setParamRowIndex(actR.getParamRowIndex());

			return lossR;
		}

		protected void makeUpd01MdfWkActData(MfgActRecvIf_Upd02_ActLstR actR) {
			if (MAC_DATA_CRUD_TYP.isDEL(actR.data_crud_typ())) {
				// 工数実績の取消電文を作成する。
				_mfgUpd01.up5().add(makeUpd01DelWkActTelegram(actR, getDBWkAct(actR.wk_act_no()), null));
			}
			else {
				// 工数実績の新規・訂正電文を作成する。必要に応じて、工数の算出を行う。
				MfgActIF_Upd01_DtlWkR wkR = makeUpd01MdfWkActTelegram(actR);
				calcWkActCost(wkR);
				_mfgUpd01.up5().add(wkR);
			}
		}

		protected MfgActIF_Upd01_DtlWkR makeUpd01MdfWkActTelegram(MfgActRecvIf_Upd02_ActLstR actR) {
			MfgActIF_Upd01_DtlWkR wkR = MfgActIF_Upd01_DtlWkR.create();

			// 親工程
			MfgActIF_Upd01_DtlOperR operR = getUpd01ParentOper(actR, false);

			MST_WK_ACT_R dbR = getDBWkAct(actR.wk_act_no());

			MCNumber wkPegNo = new MCNumber(_mfgUpd01.up5().size());

			wkR.hdr_peg_no(_mfgHdrR.peg_no());						// ヘッダ紐付けＮＯ
			wkR.oper_peg_no(operR.peg_no());						// 工程紐付けＮＯ
			wkR.peg_no(wkPegNo);									// 工数紐付けＮＯ

			if (!isNull(dbR.wk_act_no())) {
				wkR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());	// データ更新区分
				wkR.wk_act_no(dbR.wk_act_no());						// 工数実績ＮＯ
				wkR.wk_schd_no(actR.wk_schd_no());					// 工数予定ＮＯ
				wkR.wk_act_sub_char1(dbR.sub_char1());				// 予備１（実績）
				wkR.wk_act_sub_char2(dbR.sub_char2());				// 予備２（実績）
				wkR.wk_act_sub_char3(dbR.sub_char3());				// 予備３（実績）
			}
			else {
				wkR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());	// データ更新区分
				wkR.wk_schd_no(actR.wk_schd_no());					// 工数予定ＮＯ
			}

			wkR.mes_flg(true);										// ＭＥＳ
			wkR.ext_sys_cd(actR.ext_sys_cd());						// 外部システムＣＤ
			wkR.ext_wk_act_no(actR.ext_wk_act_no());				// 外部工数実績ＮＯ
			wkR.wk_cost_calc_upd_flg(actR.wk_cost_calc_upd_flg());	// 自動工数計算更新許可

			wkR.wk_cost_cd(actR.wk_cost_cd());						// 工数管理ＣＤ
			wkR.act_wk_cost(actR.wk_cost());						// 工数
			wkR.abort_flg(actR.abort_flg());						// 打切
			wkR.ac_dt(actR.ac_dt());								// 計上日
			wkR.st_tm(actR.st_hm());								// 着手時刻
			wkR.end_tm(actR.end_hm());								// 終了時刻
			wkR.brk_pd(actR.brk_pd());								// 中断時間
			wkR.wk_day_cd(actR.wk_day_cd());						// 勤務種類ＣＤ
			wkR.wk_rsn_cd(actR.wk_rsn_cd());						// 工数理由ＣＤ
			wkR.wk_usr_cd(actR.wk_usr_cd());						// 作業担当者ＣＤ
			wkR.wk_usr_dpt_cd(actR.wk_usr_dpt_cd());				// 作業者部門ＣＤ
			wkR.fclty(actR.fclty());								// 設備
			wkR.wk_act_intr_rmrks(actR.wk_intr_rmrks());			// 内部備考

			wkR.setParamIndex(actR.getParamIndex());
			wkR.setParamRowIndex(actR.getParamRowIndex());

			return wkR;
		}


		/**
		 * 製造実績の取消用電文を作成する。
		 */
		protected void makeDel01MfgActData() {
			// ヘッダ
			makeDel01MfgHdr();

			// 投入
			makeDel01InptDtls();

			// 出来高／副産品
			makeDel01YieldByProdDtls();
		}

		protected void makeDel01MfgHdr() {
			_mfgDel01.up1().add(makeDel01MfgHdrTelegram());
		}

		protected MfgActIF_Del01_HdrR makeDel01MfgHdrTelegram() {
			MfgActIF_Del01_HdrR delHdrR = MfgActIF_Del01_HdrR.create();

			delHdrR.peg_no(_hdrPegNo);

			// ヘッダ紐付けＮＯと製造指図ＮＯの保持
			_mfgPegNoM.put(_hdrPegNo, _mfgInstNo);
			_hdrPegNo = _hdrPegNo.add(1);

			delHdrR.mfg_act_no(_mfgActNo);
			delHdrR.upd_cntr_chk_flg(false);

			return delHdrR;
		}

		protected void makeDel01InptDtls() {
			MCList<MCRow> actDBL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_INPT_ACT_RECV.value(), _mfgActNo));
			if (isNull(actDBL)) {
				return;
			}

			for (int ai = 0 ; ai < actDBL.size() ; ai++) {
				_mfgDel01.up2().add(makeDel01InptDtlTelegram((MST_INPT_ACT_R)actDBL.get(ai)));
			}
		}

		protected MfgActIF_Del01_DtlInptR makeDel01InptDtlTelegram(MST_INPT_ACT_R actR) {
			MfgActIF_Del01_DtlInptR delInptR = MfgActIF_Del01_DtlInptR.create();

			delInptR.inpt_act_no(actR.inpt_act_no());
			delInptR.can_ac_dt(actR.ac_dt());

			return delInptR;
		}

		protected void makeDel01YieldByProdDtls() {
			MCList<MCRow> actDBL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_YIELD_ACT_RECV.value(), _mfgActNo));
			if (isNull(actDBL)) {
				return;
			}

			for (int ai = 0 ; ai < actDBL.size() ; ai++) {
				MST_YIELD_ACT_R actR = (MST_YIELD_ACT_R)actDBL.get(ai);
				if (!MAC_YIELD_TYP.isBYPROD(actR.yield_typ())) {
					_mfgDel01.up3().add(makeDel01YieldDtlTelegram(actR));
				}
				else {
					_mfgDel01.up4().add(makeDel01ByProdDtlTelegram(actR));
				}
			}
		}

		protected MfgActIF_Del01_DtlYieldR makeDel01YieldDtlTelegram(MST_YIELD_ACT_R actR) {
			MfgActIF_Del01_DtlYieldR delYieldR = MfgActIF_Del01_DtlYieldR.create();

			delYieldR.yield_act_no(actR.yield_act_no());
			delYieldR.can_ac_dt(actR.ac_dt());

			return delYieldR;
		}

		protected MfgActIF_Del01_DtlByProdR makeDel01ByProdDtlTelegram(MST_YIELD_ACT_R actR) {
			MfgActIF_Del01_DtlByProdR delByProdR = MfgActIF_Del01_DtlByProdR.create();

			delByProdR.yield_act_no(actR.yield_act_no());
			delByProdR.can_ac_dt(actR.ac_dt());

			return delByProdR;
		}


		/**
		 * 製造実績（工程・出来高）の登録・訂正インスタンスを生成する。
		 */
		protected void crtUpd03Instance() {
			if (_mfgUpd03 != null) {
				return;
			}

			_mfgUpd03 = MSBCL_MfgActRcptIFService.crtMfgActIF_Upd03();

			// 制御ブロックの設定
			_mfgUpd03.up0().if_upd_typ(up1().if_upd_typ());				// ＩＦ更新区分
			_mfgUpd03.up0().oper_unit_flg(true);						// 工程単位実績
			_mfgUpd03.up0().act_immed_prnt_flg(false);					// 記録書即時発行
			_mfgUpd03.up0().not_bkf_upd_flg(up1().not_bkf_upd_flg());	// ＢＦ更新しない
			_mfgUpd03.up0().not_wk_cost_upd_calc_flg(false);			// 自動工数計算しない
			_mfgUpd03.up0().not_io_act_srv_exec_flg(false);				// 受払実績サービス呼び出し不要
			_mfgUpd03.up0().upd_cntr_chk_flg(false);					// 更新カウンタチェック
			_mfgUpd03.up0().is_src_batch_flg(true);						// 呼出元バッチ処理
			_mfgUpd03.up0().not_commit_flg(true);						// コミットしない
		}

		protected void execUpd03MfgAct() {
			if (_mfgUpd03.up1().isEmpty()) {
				return;
			}

			_mfgUpd03.exec();
		}

		protected void getUpd03ExecRst() {
			if (_mfgUpd03.up1().isEmpty()) {
				return;
			}

			// 登録後、製造指図ＮＯ単位の処理結果を得る。
			for (MfgActIF_Upd03_Hdr1R dR : _mfgUpd03.down0()) {
				// 製造単位（最初行）の成功／失敗チェック
				if (_mfgPegNoM.containsKey(dR.peg_no())) {
					// 失敗
					if (MAC_RTN_STS_TYP.isERR(dR.rtn_sts_typ())) {
						_errMfgInstNoS.add(_mfgPegNoM.get(dR.peg_no()));
					}
					// 成功
					else {
						_regMfgRstM.put(_mfgPegNoM.get(dR.peg_no()), dR.mfg_act_no());
					}
				}

				// 工程の登録・訂正が成功した場合、工程実績ＮＯを記憶する。
				if (!MAC_RTN_STS_TYP.isERR(dR.rtn_sts_typ())) {
					if (!isNull(dR.oper_act_no())) {
						getOperActInstNoM().put(dR.oper_act_no(), nvl(_operPegNoM.get(dR.peg_no()), MAC_STR.NULL_VAL.value()));
					}
				}
			}
		}

		/**
		 * 製造実績（投入・工数）の登録・訂正インスタンスを生成する。
		 */
		protected void crtUpd01Instance() {
			if (_mfgUpd01 != null) {
				return;
			}

			_mfgUpd01 = MSBCL_MfgActRcptIFService.crtMfgActIF_Upd01();

			// 制御ブロックの設定
			_mfgUpd01.up0().if_upd_typ(up1().if_upd_typ());
			_mfgUpd01.up0().upd_cntr_chk_flg(false);
		}

		protected void execUpd01MfgAct() {
			if (_mfgUpd01.up1().isEmpty()) {
				return;
			}

			_mfgUpd01.exec();
		}

		protected void getUpd01ExecRst() {
			if (_mfgUpd01.up1().isEmpty()) {
				return;
			}

			// 登録後、製造指図ＮＯ単位の処理結果を得る。
			Set<MCNumber> errHdrS = new HashSet<MCNumber>();
			for (MfgActIF_Upd01_HdrR dR : _mfgUpd01.down0()) {
				if (_mfgPegNoM.containsKey(dR.peg_no())) {
					// 失敗
					if (MAC_RTN_STS_TYP.isERR(dR.rtn_sts_typ())) {
						_errMfgInstNoS.add(_mfgPegNoM.get(dR.peg_no()));
					}
					// 成功
					else {
						_regMfgRstM.put(_mfgPegNoM.get(dR.peg_no()), dR.mfg_act_no());
					}
				}

				if (MAC_RTN_STS_TYP.isERR(dR.rtn_sts_typ())) {
					errHdrS.add(dR.peg_no());
				}
			}

			// 工程の登録・訂正が成功した場合、工程実績ＮＯを記憶する。
			for (MfgActIF_Upd01_DtlOperR oR : _mfgUpd01.down1()) {
				if (errHdrS.contains(oR.hdr_peg_no())) {
					continue;
				}

				if (isNull(oR.oper_act_no())) {
					continue;
				}

				getOperActInstNoM().put(oR.oper_act_no(), nvl(_operPegNoM.get(oR.peg_no()), MAC_STR.NULL_VAL.value()));
			}
		}

		/**
		 * 製造実績（全体）の取消インスタンスを生成する。
		 */
		protected void crtDel01Instance() {
			if (_mfgDel01 != null) {
				return;
			}

			_mfgDel01 = MSBCL_MfgActRcptIFService.crtMfgActIF_Del01();

			// 制御ブロックの設定
			_mfgDel01.up0().if_upd_typ(up1().if_upd_typ());
			_mfgDel01.up0().upd_cntr_chk_flg(false);
			_mfgDel01.up0().lst_del_flg(false);
			_mfgDel01.up0().is_src_batch_flg(true);
			_mfgDel01.up0().not_commit_flg(true);
		}

		protected void execDel01MfgAct() {
			if (_mfgDel01.up1().isEmpty()) {
				return;
			}

			_mfgDel01.exec();
		}

		protected void getDel01ExecRst() {
			if (_mfgDel01.up1().isEmpty()) {
				return;
			}

			// 登録後、製造指図ＮＯ単位の処理結果を得る。
			for (MfgActIF_Del01_HdrR dR : _mfgDel01.down0()) {
				if (_mfgPegNoM.containsKey(dR.peg_no())) {
					// 失敗
					if (MAC_RTN_STS_TYP.isERR(dR.rtn_sts_typ())) {
						_errMfgInstNoS.add(_mfgPegNoM.get(dR.peg_no()));
					}
					// 成功
					else {
						_regMfgRstM.put(_mfgPegNoM.get(dR.peg_no()), MAC_STR.NULL_VAL.value());
					}
				}
			}
		}

		protected MCDate getMaxDate(MCDate dt1, MCDate dt2, MCDateFieldType dtTyp) {
			if (dt1 == null) {
				return dt2;
			}
			if (dt2 == null) {
				return dt1;
			}

			if (dt1.gt(dt2, dtTyp)) {
				return dt1;
			}

			return dt2;
		}

		protected void calcWkActCost(MfgActIF_Upd01_DtlWkR wkR) {
			if (!isNull(wkR.act_wk_cost()) && wkR.act_wk_cost().isPositive()) {
				return;
			}

			if (wkR.wk_cost_calc_upd_flg() && !isNull(wkR.end_tm()) && !isNull(wkR.st_tm())) {
				// 着手・終了時刻と中断時間から工数を求める
				wkR.act_wk_cost(wkR.end_tm().diffMinute(wkR.st_tm()));
				if (!isNull(wkR.brk_pd())) {
					wkR.act_wk_cost(wkR.act_wk_cost().subtract(wkR.brk_pd()));
				}
			}

			if (isNull(wkR.act_wk_cost())) {
				wkR.act_wk_cost(MCNumber.ZERO);
			}
		}

		protected MCNumber getYieldActRate(MfgActRecvIf_Upd02_ActLstR yieldR, MCNumber baseActQry) {
			String yieldSchdNo = yieldR.yield_schd_no();
			String operInstNo = yieldR.oper_inst_no();
			String mfgInstNo = yieldR.mfg_inst_no();
			MCNumber rateQty = MCNumber.ZERO;
			if (isNull(baseActQry) || !baseActQry.isPositive()) {
				return rateQty;
			}

			MST_YIELD_SCHD_R ysR = (MST_YIELD_SCHD_R)getSchdRCache(getCacheKey(MAC_IF_PROC_TYP.MES_YIELD_SCHD_SEND.value(), yieldSchdNo));
			if (ysR == null || isNull(ysR.yield_schd_no())) {
				return rateQty;
			}

			MCList<MCRow> ysL = getSchdLCache(getCacheKey(MAC_IF_PROC_TYP.MES_YIELD_SCHD_SEND.value(), mfgInstNo));
			MCList<MCRow> tgtYsL = ysL.subList(r -> isSame(r.getStringNE(MST_YIELD_SCHD_R.$oper_inst_no), operInstNo)
					&& !MAC_YIELD_TYP.isBYPROD(r.getStringNE(MST_YIELD_SCHD_R.$yield_typ)));

			rateQty = qtyDiv(baseActQry, tgtYsL.sum(MST_YIELD_SCHD_R.$base_unit_yield_qty), null , null);

			return rateQty;
		}

		protected MCNumber qtyMulti(MCNumber qty1, MCNumber qty2, MCNumber scale, String rndTyp) {
			if (isNull(qty1)) {
				qty1 = MCNumber.ZERO;
			}
			if (isNull(qty2)) {
				qty2 = MCNumber.ZERO;
			}
			if (scale == null) {
				scale = MCNumber.ONE;
			}
			if (rndTyp == null || !MAC_RND_TYP.contains(rndTyp)) {
				rndTyp = MAC_RND_TYP.RNDOFF.value();
			}

			MCNumber rstQty = qty1.multiply(qty2, scale.intValue(), MAC_RND_TYP.toMC(rndTyp));

			return rstQty;
		}

		protected MCNumber qtyDiv(MCNumber qty1, MCNumber qty2, MCNumber scale, String rndTyp) {
			if (isNull(qty1)) {
				qty1 = MCNumber.ZERO;
			}
			if (isNull(qty2) || qty2.isZero()) {
				qty2 = MCNumber.ONE;
			}
			if (scale == null) {
				scale = MCNumber.TEN;
			}
			if (rndTyp == null || !MAC_RND_TYP.contains(rndTyp)) {
				rndTyp = MAC_RND_TYP.RNDOFF.value();
			}

			MCNumber rstQty = qty1.divide(qty2, scale.intValue(), MAC_RND_TYP.toMC(rndTyp));

			return rstQty;
		}

		protected String crtExtAltrKey(String ifProcTyp, String extSysCd, String extActNo, boolean extAutoReg) {
			StringBuilder sb = new StringBuilder();

			sb.append(ifProcTyp);
			sb.append(MAC_STR.CD_NM_DLM.value());
			sb.append(extSysCd);
			sb.append(MAC_STR.CD_NM_DLM.value());
			sb.append(extActNo);
			sb.append(MAC_STR.CD_NM_DLM.value());
			sb.append(extAutoReg);

			return sb.toString();
		}

		protected MfgActIF_Upd01_DtlOperR getUpd01ParentOper(MfgActRecvIf_Upd02_ActLstR actR, boolean insMode) {
			MfgActIF_Upd01_DtlOperR poR = null;

			for ( int pos = _mfgUpd01.up2().size() -1 ; pos >= 0 ; pos--) {
				MfgActIF_Upd01_DtlOperR tmpR = _mfgUpd01.up2().get(pos);

				// 製造指図ＮＯが変わった場合、ループエンドとする。
				if (!isSame(actR.mfg_inst_no(), _mfgInstNo)) {
					break;
				}

				if (!isSame(actR.oper_inst_no(), tmpR.oper_inst_no())) {
					continue;
				}

				poR = tmpR;

				// 優先条件：工程実績ＮＯ
				if (!isNull(actR.oper_act_no()) && isSame(actR.oper_act_no(), tmpR.oper_act_no())) {
					break;
				}
				// 優先条件：外部工程実績ＮＯ
				if (isSame(actR.ext_oper_act_no(), poR.ext_oper_act_no())) {
					break;
				}
			}

			MCIndexKey idxkey = _mfgUpd01.up2().createIndex(MfgActIF_Upd01_DtlOperR.$ext_oper_act_no);
			if (!_mfgUpd01.up2().contains(idxkey, actR.ext_oper_act_no())) {
				poR = null;
			}
			if (poR == null) {
				// 工程実績上り電文の作成（自動補完）
				if (insMode) {
					poR = makeUpd01InsOperActTelegram(actR, false);
				}
				else {
					poR = makeUpd01MdfOperActTelegram(actR, false);
				}
				_mfgUpd01.up2().add(poR);
				// 製造実績ヘッダ着手日時の設定
				setUpd01InsMdfStartTime(poR);
				// 工程実績が完了でない（終了実績日が入っていない、または入っているが未完了フラグがオン）且つ、製造実績ヘッダが完了の場合は、
				// 製造実績ヘッダを着手中に戻す
				if (isNull(poR.end_act_tm()) || (!isNull(poR.end_act_tm()) && poR.not_cmpl_flg())) {
					if (MSC_MFG_STS_TYP.isCMPL(_mfgHdrR.mfg_sts_typ())) {
						_mfgHdrR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
						_mfgHdrR.end_act_tm(null);
						_mfgHdrR.end_ac_dt(null);
					}
				}
			}
			else {
				// ＩＦ自動作成工程実績の場合、工程着手日時をＭＩＮ（実績日時／計上日）にする。
				if (poR.if_auto_reg_flg()) {
					MCDate dt = nvl(actR.act_tm(),nvl(actR.st_hm(),actR.ac_dt()));
					if (poR.st_act_tm().gt(dt)) {
						poR.st_act_tm(dt);
						// 工数実績、かつ着手時刻が設定されていない場合、ヘッダの着手計上日に計上日をそのまま設定するため、計上日を保持する
						if (isNull(actR.act_tm()) && isNull(actR.st_hm())) {
							poR.ac_dt(actR.ac_dt());
						}
						setUpd01InsMdfStartTime(poR);
					}
					// 投入、工数実績の打切時は工程実績の終了実績日を維持するが、打切ではないレコードがあったら終了実績日をクリアする
					if (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(actR.if_proc_typ())
						|| MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(actR.if_proc_typ())) {
						if (!actR.abort_flg()) {
							poR.end_act_tm(null);
							
							// 工程実績が完了でない（終了実績日が入っていない、または入っているが未完了フラグがオン）且つ、製造実績ヘッダが完了の場合は、
							// 製造実績ヘッダを着手中に戻す
							if (MSC_MFG_STS_TYP.isCMPL(_mfgHdrR.mfg_sts_typ())) {
								_mfgHdrR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
								_mfgHdrR.end_act_tm(null);
								_mfgHdrR.end_ac_dt(null);
							}
						}
					}
				}
			}

			return poR;
		}

		protected MfgActIF_Upd01_DtlInptR getUpd01ParentInpt(MfgActRecvIf_Upd02_ActLstR actR, boolean insMode) {
			MfgActIF_Upd01_DtlInptR ioR = null;

			for ( int pos = _mfgUpd01.up3().size() -1 ; pos >= 0 ; pos--) {
				MfgActIF_Upd01_DtlInptR tmpR = _mfgUpd01.up3().get(pos);

				// 製造指図ＮＯが変わった場合、ループエンドとする。
				if (!isSame(actR.mfg_inst_no(), _mfgInstNo)) {
					break;
				}

				if (!isSame(actR.oper_inst_no(), tmpR.oper_inst_no())) {
					continue;
				}

				// 実績済の場合、投入実績ＮＯが同じであれば、親投入である
				if (!isNull(actR.inpt_act_no())) {
					if (isSame(actR.inpt_act_no(), tmpR.inpt_act_no())) {
						ioR = tmpR;
						break;
					}
				}
				// 未実績の場合、外部投入実績ＮＯが同じのデータを親投入とみなす。
				else {
					if (isNull(tmpR.inpt_act_no()) && isSame(actR.ext_inpt_act_no(), tmpR.ext_inpt_act_no())) {
						ioR = tmpR;
						break;
					}
				}
			}

			if (ioR == null) {
				// 投入実績上り電文の作成（自動補完）
				if (insMode) {
					ioR = makeUpd01InsInptActTelegram(actR, false);
				}
				else {
					ioR = makeUpd01MdfInptActTelegram(actR, false);
				}
				_mfgUpd01.up3().add(ioR);
			}

			return ioR;
		}

		protected MfgActIF_Upd03_Hdr1R getUpd03ParentOper(MfgActRecvIf_Upd02_ActLstR actR, boolean insMode) {
			MfgActIF_Upd03_Hdr1R poR = null;
			MfgActIF_Upd03_Hdr1R tmpR = null;

			for ( int pos = _mfgUpd03.up1().size() -1 ; pos >= 0 ; pos--) {
				String tmpMfgInstNo = _mfgUpd03.up1().get(pos).mfg_inst_no();
				// 製造指図ＮＯが変わった場合、ループエンドとする。
				if (!isSame(tmpMfgInstNo, _mfgInstNo)) {
					break;
				}
				tmpR = _mfgUpd03.up1().get(pos);

				if (!isSame(actR.oper_inst_no(), tmpR.oper_inst_no())) {
					continue;
				}

				// 優先条件：工程実績ＮＯ
				if (!isNull(actR.oper_act_no()) && isSame(actR.oper_act_no(), tmpR.oper_act_no())) {
					poR = tmpR;
					break;
				}
				// 優先条件：外部工程実績ＮＯ
				if (!isNull(actR.ext_oper_act_no()) && isSame(actR.ext_oper_act_no(), tmpR.ext_oper_act_no())) {
					poR = tmpR;
					break;
				}
			}
			if (isNull(poR) && reuseOperAct(actR, tmpR)) {
				poR = tmpR;
				if (!isSame(actR.mfg_inst_no(), tmpR.mfg_inst_no())) {
					poR = null;
				}
				if (!isSame(actR.oper_inst_no(), tmpR.oper_inst_no())) {
					poR = null;
				}
			}

			if (poR == null) {
				// 工程実績上り電文の作成（自動補完）
				if (insMode) {
					poR = makeUpd03InsOperActTelegram(actR, false);
				}
				else {
					poR = makeUpd03MdfOperActTelegram(actR, false);
				}
				_mfgUpd03.up1().add(poR);
			}
			else {
				// ＩＦ自動作成工程実績の場合、工程着手日時をＭＩＮ（実績日時／計上日）にする。
				if (poR.if_auto_reg_flg()) {
					MCDate dt = nvl(actR.act_tm(),nvl(actR.st_hm(),actR.ac_dt()));
					if (poR.st_act_tm().gt(dt)) {
						poR.st_act_tm(dt);
						poR.st_ac_dt(getAcDt(poR.st_act_tm()));
					}
				}
			}
			return poR;
		}
		/**
		 * _mfgUpd03.up1()に存在する工程実績を使うかどうかを判断する
		 * @param actR
		 * @return 使い回す場合はtrue
		 */
		protected boolean reuseOperAct(MfgActRecvIf_Upd02_ActLstR actR, MfgActIF_Upd03_Hdr1R tmpR) {

			// tmpRがnullの場合は使い回さない
			if (isNull(tmpR)) {
				return false;
			}

			// 外部工程実績ＮＯが設定されている場合は使い回さない（外部工程実績ＮＯ違いのレコードを採用したくない）
			if (!isNull(actR.ext_oper_act_no())) {
				return false;
			}
			
			// 出来高実績でない場合は使い回す
			if (!MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(actR.if_proc_typ())) {
				return true;
			}

			// 副産品実績、かつ外部工程実績ＮＯが設定されていない場合は使い回す
			if (MAC_YIELD_TYP.isBYPROD(actR.yield_typ()) && isNull(actR.ext_oper_act_no())) {
				return true;
			}
			
			// 自動補完された工程実績の場合は使い回さない
			return !tmpR.if_auto_reg_flg();
		}

		protected MST_OPER_ACT_R getDBOperAct(String operActNo) {
			if (isNull(operActNo)) {
				return MST_OPER_ACT_R.create();
			}

			MST_OPER_ACT_R oaR = (MST_OPER_ACT_R)getActRCache(getCacheKey(MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value(), operActNo));
			if (oaR == null) {
				oaR = MST_OPER_ACT_R.create();
			}

			return oaR;
		}

		protected MST_OPER_ACT_R getDBOperAct(String mfgActNo, String operInstNo, String extOperActNo) {
			MST_OPER_ACT_R oaR = MST_OPER_ACT_R.create();

			if (isNull(mfgActNo) || isNull(operInstNo)) {
				return oaR;
			}

			MCList<MCRow> actOperL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value(), mfgActNo));
			if (isNull(actOperL)) {
				return oaR;
			}

			for (int ai = 0 ; ai < actOperL.size() ; ai++) {
				MST_OPER_ACT_R dbR = (MST_OPER_ACT_R)actOperL.get(ai);
				if (!isSame(dbR.oper_inst_no(), operInstNo)) {
					continue;
				}

				if (isNull(extOperActNo)) {
					oaR = dbR;
					break;
				}
				else if (isSame(dbR.ext_oper_act_no(), extOperActNo)) {
					oaR = dbR;
					break;
				}
			}

			return oaR;
		}

		protected MST_INPT_ACT_R getDBInptAct(String inptActNo) {
			if (isNull(inptActNo)) {
				return MST_INPT_ACT_R.create();
			}

			MST_INPT_ACT_R oaR = (MST_INPT_ACT_R)getActRCache(getCacheKey(MAC_IF_PROC_TYP.MES_INPT_ACT_RECV.value(), inptActNo));
			if (oaR == null) {
				oaR = MST_INPT_ACT_R.create();
			}

			return oaR;
		}

		protected MST_WK_ACT_R getDBWkAct(String wkActNo) {
			if (isNull(wkActNo)) {
				return MST_WK_ACT_R.create();
			}

			MST_WK_ACT_R oaR = (MST_WK_ACT_R)getActRCache(getCacheKey(MAC_IF_PROC_TYP.MES_WK_ACT_RECV.value(), wkActNo));
			if (oaR == null) {
				oaR = MST_WK_ACT_R.create();
			}

			return oaR;
		}

		protected MST_YIELD_ACT_R getDBYieldAct(String yieldActNo) {
			if (isNull(yieldActNo)) {
				return MST_YIELD_ACT_R.create();
			}

			MST_YIELD_ACT_R oaR = (MST_YIELD_ACT_R)getActRCache(getCacheKey(MAC_IF_PROC_TYP.MES_YIELD_ACT_RECV.value(), yieldActNo));
			if (oaR == null) {
				oaR = MST_YIELD_ACT_R.create();
			}

			return oaR;
		}

		/**
		 * セーブポイントを作成する
		 */
		protected MCSavepoint setSavepoint() {
			return dbTran().setSavepoint();
		}

		/**
		 * 製造実績登録処理でエラーが発生した場合の処理。
		 */
		protected void handleEx(Exception ex, MCSavepoint sp) {
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

			for (MfgActRecvIf_Upd02_ActLstR opeRow : up0()) {
				opeRow.err_flg(true);
				opeRow.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
				MCMessagePool.add(opeRow, null, MSLAL0083, opeRow.if_proc_typ(), opeRow.data_no(), opeRow.data_lno(), msgId, msg);
				for (MCMessage causeMsg : causeMsgList) {
					MCMessage newMsg = new MCMessage(opeRow, null, causeMsg.getID(), (Object[])causeMsg.getBindArray());
					MCMessagePool.add(newMsg);
				}
			}

			if (sp != null) {
				try {
					dbTran().rollback(sp);
				}
				catch (Exception ex2) {
					boolean hasExceptionMsg = false;
					MCMessage exceptionMsg = new MCMessage(MSBCL1321);
					MCMessageList msgList = MCMessagePool.getMessageList();

					for (MCMessage message : msgList) {
						if (isSame(message.getID(), exceptionMsg.getID())) {
							hasExceptionMsg = true;
							break;
						}
					}

					
					if (ex2 instanceof MCException) {
						MCException mcex2 = (MCException) ex2;
						msgId = mcex2.getID();
					}
					else {
						msgId = ex2 instanceof MCException ? ((MCException) ex2).getID() : null;
					}

					if (isSame(msgId, "FCBCC0070") && hasExceptionMsg) {
						// なにもしない
					}
					else {
						ex2.printStackTrace();
						throw ex2;
					}
				}
			}

			ex.printStackTrace();
		}

		protected MfgActRecvIf_Upd02_ActLstR createDownR(MfgActRecvIf_Upd02_ActLstR upR, boolean skipByOperDelFlg) {
			MfgActRecvIf_Upd02_ActLstR dR = MfgActRecvIf_Upd02_ActLstR.create();

			dR.mfg_inst_no(upR.mfg_inst_no());									// 製造指図ＮＯ
			dR.mfg_act_no(nullValToNull(_regMfgRstM.get(upR.mfg_inst_no())));	// 製造実績ＮＯ
			dR.oper_inst_no(upR.oper_inst_no());								// 工程指図ＮＯ
			dR.oper_act_no(upR.oper_act_no());									// 工程実績ＮＯ
			dR.data_crud_typ(upR.data_crud_typ());								// データ更新区分

			dR.if_proc_typ(upR.if_proc_typ());									// ＩＦ処理区分
			dR.data_lno(upR.data_lno());										// データ行ＮＯ
			dR.data_no(upR.data_no());											// データＮＯ
			dR.exe_sts_typ(upR.exe_sts_typ());									// ＰＧ実行状況区分
			dR.ext_sys_cd(upR.ext_sys_cd());									// 外部システムＣＤ
			dR.ext_data_no(upR.ext_data_no());									// 外部システムデータＮＯ
			dR.ext_data_lno(upR.ext_data_lno());								// 外部システムデータ行ＮＯ
			dR.chk_add_flg(upR.chk_add_flg());									// チェック追加行

			dR.err_flg(upR.err_flg());											// エラーフラグ
			dR.skip_by_oper_del_flg(skipByOperDelFlg);							// 工程取消スキップ行

			dR.batch_log_no(upR.batch_log_no());								// ログＮＯ
			dR.log_sub_key1(upR.log_sub_key1());								// ログサブキー１
			dR.log_sub_key2(upR.log_sub_key2());								// ログサブキー２

			return dR;
		}

		protected void setDown() {
			for (MfgActRecvIf_Upd02_ActLstR uR : up0()) {
				if (_errMfgInstNoS.contains(uR.mfg_inst_no())) {
					uR.err_flg(true);
					uR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
					if (!uR.if_auto_reg_flg()) {
						MCMessagePool.add(uR, null, MSLAL0077, uR.if_proc_typ(), uR.data_no(), uR.data_lno(), uR.mfg_inst_no());
					}
				}

				down0().add(createDownR(uR, false));
			}
		}
	}

	/**
	 * MfgActRecvIf_Chk01オペレーション.<p>
	 *
	 * 製造実績（工程・投入・工数・出来高）受信ＩＦ取込を行う前のチェック処理を行う。<br>
	 */
	public class MfgActRecvIf_Chk01 extends MSLAL_MfgActRecvIfService_MC_A.MfgActRecvIf_Chk01 {
		/** 工程実績のインデックス（登録済） **/
		protected MCIndexKey _operActIdx = null;
		/** 工程実績のインデックス（ＭＥＳ） **/
		protected MCIndexKey _operMesIdx = null;
		/** 投入実績のインデックス（登録済） **/
		protected MCIndexKey _inptActIdx = null;
		/** 工数実績のインデックス（登録済） **/
		protected MCIndexKey _wkActIdx = null;
		/** 出来高実績のインデックス（登録済） **/
		protected MCIndexKey _yieldActIdx = null;

		/** 投入予定のインデックス **/
		protected MCIndexKey _inptSchdIdx = null;
		/** 工数予定のインデックス **/
		protected MCIndexKey _wkSchdIdx = null;
		/** 出来高予定のインデックス **/
		protected MCIndexKey _yieldSchdIdx = null;

		/** up0のインデックス **/
		protected MCIndexKey _up0Idx = null;

		/** ロス実績リスト **/
		protected MCList<MfgActRecvIf_Upd02_ActLstR> _lossActL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
		/** 投入実績リスト **/
		protected MCList<MfgActRecvIf_Upd02_ActLstR> _inptActL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
		/** 外部投入実績ＮＯセット（投入実績にロス実績を補完済） **/
		protected Set<String> _inptLossOKS = new HashSet<String>();

		// ロス実績チェック用分類マップ
		protected Map<String, MCList<MCRow>> _lossRsnMstMap = null;
		protected Map<String, MCList<MST_LOSS_ACT_R>> _lossActDBMap = null;
		protected Map<String, MCList<MfgActRecvIf_Upd02_ActLstR>> _lossActRecvMap = null;
		// 工程実績が他の出来高実績で使用されているかどうかをチェックするマップ
		protected Map<String, String> _usedOperMap = null;
		/** 品目マスタのキャッシュ **/
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItmL = null;
		/** 品目単位マスタのキャッシュ */
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _cacheItmUnitL = null;
		/** ロット管理情報のキャッシュ **/
		protected FXUCL_MCDbcCache<MST_LOT_R> _cacheLotL = null;

		/** エラー発生製造指図ＮＯセット **/
		protected Set<String> _errMfgInstNoS = new HashSet<String>();

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

			// ソート
			up0().sort(getChkSortPolicy());

			// 条件付き必須チェック
			msgL.addAll(checkReqByCond());

			// 登録可能チェック
			msgL.addAll(checkRegistrable());

			// 投入やロスの補完
			msgL.addAll(cmplInptAndLoss());

			// 投入実績・ロス実績:　ロット混在・サブロット混在・代替品混在チェック
			msgL.addAll(checkLotAltMix());

			return msgL;
		}

		protected MCSortPolicy getChkSortPolicy() {
			MCSortPolicy stPlcy = new MCSortPolicy();

			// 製造指図ＮＯ、工程指図ＮＯ、工程実績ＮＯ
			stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$mfg_inst_no);
			stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$oper_inst_no);
			stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$oper_act_no);
			stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$ext_data_no);
			stPlcy.add(SortType.ASC, MfgActRecvIf_Upd02_ActLstR.$ext_data_lno);

			return stPlcy;
		}

		/**
		 * 条件付き必須チェック
		 * @return チェックメッセージ
		 */
		protected MCMessageList checkReqByCond() {
			MCMessageList msgL = new MCMessageList();

			// 以下の必須チェックを行う。（ＤＢ定義上の必須項目は省略）
			// 工程実績の場合、外部工程実績ＮＯ、新規・訂正：　着手実績日
			// 投入実績の場合、外部投入実績ＮＯ、ＩＦ投入区分、新規・訂正：実績日、実績数量
			// ロス実績の場合、ロス数量
			// 工数実績の場合、外部工数実績ＮＯ、新規・訂正：計上日
			// 出来高実績の場合、外部出来高実績ＮＯ、新規・訂正：取引単位数量、取引単位ＣＤ、実績日
			for (int i = (up0().size() -1) ; i >=0 ; i--) {
				MfgActRecvIf_Upd02_ActLstR uR = up0().get(i);

				// ロス実績は単独処理する。
				if (MSC_IF_INPT_TYP.isLOSS(uR.if_inpt_typ()) || MSC_IF_INPT_TYP.isFXD_LOSS(uR.if_inpt_typ())) {
					if (!MAC_DATA_CRUD_TYP.isDEL(uR.data_crud_typ()) && isNull(uR.base_unit_inpt_qty()) && isNull(uR.cont_qty())) {
						// ロス実績の場合、ロス数量/有効成分はどちらか必須。
						setErrFlag(uR);
						msgL.add(new MCMessage(uR, null, MSLAL0097, uR.data_no(), uR.data_lno()));
					}

					_lossActL.add(up0().remove(i));
					continue;
				}

				// 実績取消の場合、チェック不要
				if (MAC_DATA_CRUD_TYP.isDEL(uR.data_crud_typ())) {
					continue;
				}

				if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(uR.if_proc_typ())) {
					if (isNull(uR.st_act_tm())) {
						// 着手実績日時
						setErrFlag(uR);
						msgL.add(new MCMessage(uR, null, MSLAL0098, uR.data_no(), uR.data_lno()));
					}
				}
				else if (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(uR.if_proc_typ())) {
					if (isNull(uR.act_tm())) {
						// 投入実績日時は必須
						setErrFlag(uR);
						msgL.add(new MCMessage(uR, null, MSLAL0099, uR.data_no(), uR.data_lno()));
					}
					if (isNull(uR.base_unit_inpt_qty()) && isNull(uR.cont_qty())) {
						// 投入数量/有効成分はどちらか
						setErrFlag(uR);
						msgL.add(new MCMessage(uR, null, MSLAL0100, uR.data_no(), uR.data_lno()));
					}
				}
				else if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(uR.if_proc_typ())) {
					if (isNull(uR.ac_dt())) {
						// 計上日
						setErrFlag(uR);
						msgL.add(new MCMessage(uR, null, MSLAL0101, uR.data_no(), uR.data_lno()));
					}
				}
				else if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(uR.if_proc_typ())) {
					if (isNull(uR.act_tm())) {
						// 実績日時
						setErrFlag(uR);
						msgL.add(new MCMessage(uR, null, MSLAL0102, uR.data_no(), uR.data_lno()));
					}
					if (isNull(uR.trd_unit_qty())) {
						// 取引単位数量
						setErrFlag(uR);
						msgL.add(new MCMessage(uR, null, MSLAL0103, uR.data_no(), uR.data_lno()));
					}
					if (isNull(uR.trd_unit_cd()) && uR.unschd_act_flg()) {
						// 取引単位ＣＤ
						setErrFlag(uR);
						msgL.add(new MCMessage(uR, null, MSLAL0104, uR.data_no(), uR.data_lno()));
					}
				}
			}

			return msgL;
		}

		protected void createActIndex(String mfgActNo) {
			_operActIdx = null;
			_operMesIdx = null;
			_inptActIdx = null;
			_wkActIdx = null;
			_yieldActIdx = null;
			if (isNull(mfgActNo)) {
				return;
			}

			// 工程実績のインデックス
			MCList<MCRow> actOperL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value(), mfgActNo));
			if (!isNull(actOperL)) {
				_operActIdx = actOperL.createIndex(MST_OPER_ACT_R.$ext_oper_act_no, MST_OPER_ACT_R.$ext_sys_cd);
				_operMesIdx = actOperL.createIndex(MST_OPER_ACT_R.$oper_inst_no, MST_OPER_ACT_R.$mes_flg);
			}

			// 投入実績のインデックス
			MCList<MCRow> actInptL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_INPT_ACT_RECV.value(), mfgActNo));
			if (!isNull(actInptL)) {
				_inptActIdx = actInptL.createIndex(MST_INPT_ACT_R.$ext_inpt_act_no, MST_INPT_ACT_R.$ext_sys_cd);
			}

			// 工数実績のインデックス
			MCList<MCRow> actWkL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_WK_ACT_RECV.value(), mfgActNo));
			if (!isNull(actWkL)) {
				_wkActIdx = actWkL.createIndex(MST_WK_ACT_R.$ext_wk_act_no, MST_WK_ACT_R.$ext_sys_cd);
			}

			// 出来高実績のインデックス
			MCList<MCRow> actYieldL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_YIELD_ACT_RECV.value(), mfgActNo));
			if (!isNull(actYieldL)) {
				_yieldActIdx = actYieldL.createIndex(MST_YIELD_ACT_R.$ext_yield_act_no, MST_YIELD_ACT_R.$ext_sys_cd);
			}
		}

		protected void createSchdIndex(String mfgInstNo) {
			_inptSchdIdx = null;
			_wkSchdIdx = null;
			_yieldSchdIdx = null;

			// 投入予定のインデックス
			MCList<MCRow> schdInptL = getSchdLCache(getCacheKey(MAC_IF_PROC_TYP.MES_INPT_SCHD_SEND.value(), mfgInstNo));
			if (!isNull(schdInptL)) {
				_inptSchdIdx = schdInptL.createIndex(MST_INPT_SCHD_R.$oper_inst_no, MST_INPT_SCHD_R.$itm_cd, MST_INPT_SCHD_R.$itm_sub1, MST_INPT_SCHD_R.$itm_sub2, MST_INPT_SCHD_R.$itm_sub3);
			}

			// 工数予定のインデックス
			MCList<MCRow> schdWkL = getSchdLCache(getCacheKey(null, mfgInstNo));
			if (!isNull(schdWkL)) {
				_wkSchdIdx = schdWkL.createIndex(MST_WK_SCHD_R.$oper_inst_no, MST_WK_SCHD_R.$wk_cost_cd);
			}

			// 出来高予定のインデックス
			MCList<MCRow> schdYieldL = getSchdLCache(getCacheKey(MAC_IF_PROC_TYP.MES_YIELD_SCHD_SEND.value(), mfgInstNo));
			if (!isNull(schdYieldL)) {
				_yieldSchdIdx = schdYieldL.createIndex(MST_YIELD_SCHD_R.$oper_inst_no, MST_YIELD_SCHD_R.$itm_cd, MST_YIELD_SCHD_R.$itm_sub1, MST_YIELD_SCHD_R.$itm_sub2, MST_YIELD_SCHD_R.$itm_sub3);
			}
		}

		/**
		 * 登録可能チェック
		 * @return チェックメッセージ
		 */
		protected MCMessageList checkRegistrable() {
			MCMessageList msgL = new MCMessageList();

			MCList<MfgActRecvIf_Upd02_ActLstR> yieldActL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
			_usedOperMap = new HashMap<String, String>(); // キー：工程実績ＮＯ　値：外部工程実績ＮＯ
			
			_up0Idx = up0().createIndex(
			MfgActRecvIf_Upd02_ActLstR.$ext_oper_act_no,
			MfgActRecvIf_Upd02_ActLstR.$if_proc_typ);
			
			// ロス実績以外
			String mfgInstNo = null;
			for (MfgActRecvIf_Upd02_ActLstR uR : up0()) {
				// 前の必須チェックでエラーとなった行はチェックしない
				if (uR.err_flg()) {
					continue;
				}

				// 製造指図ＮＯ毎に、キャッシュデータのインデックスを生成する。
				if (!isSame(mfgInstNo, uR.mfg_inst_no())) {
					mfgInstNo = uR.mfg_inst_no();
					createSchdIndex(mfgInstNo);
					createActIndex(uR.mfg_act_no());
				}

				// 1. 新規：排他チェック、登録対象の特定
				if (MAC_DATA_CRUD_TYP.isCRT(uR.data_crud_typ())) {
					msgL.addAll(checkCreateAct(uR));
				}
				// 2. 訂正：実績対象の特定
				else if (MAC_DATA_CRUD_TYP.isUPD(uR.data_crud_typ())) {
					msgL.addAll(checkModifyAct(uR));
				}
				// 3. 取消：実績対象の特定
				else if (MAC_DATA_CRUD_TYP.isDEL(uR.data_crud_typ())) {
					msgL.addAll(checkDeleteAct(uR));
				}

				// 投入実績をリスト記憶する。
				if (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(uR.if_proc_typ())) {
					_inptActL.add(uR);
				}
				// 出来高実績をリスト記憶する。（副産品以外）
				else if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(uR.if_proc_typ())) {
					if (!MAC_YIELD_TYP.isBYPROD(uR.yield_typ())) {
						yieldActL.add(uR);
					}
				}
			}
			//取引単位ＣＤの補完とチェック
			msgL.addAll(checkTrd_unit_cd());

			// ロス実績：親投入、ロス理由ＣＤをチェック・特定する。
			msgL.addAll(checkLossAct());

			// 出来高実績の基準単位数量を算出する。
			msgL.addAll(calcYieldBaseUnitQty(yieldActL));

			return msgL;
		}

		/**
		 * データ更新区分：新規の受信実績をチェックする。
		 * @param uR 受信実績
		 * @return チェックメッセージ
		 */
		protected MCMessageList checkCreateAct(MfgActRecvIf_Upd02_ActLstR uR) {
			MCMessageList msgL = new MCMessageList();

			if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(uR.if_proc_typ())) {
				msgL.addAll(checkCreateOperAct(uR));
			}
			else if (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(uR.if_proc_typ())) {
				msgL.addAll(checkCreateInptAct(uR));
			}
			else if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(uR.if_proc_typ())) {
				msgL.addAll(checkCreateWkAct(uR));
			}
			else if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(uR.if_proc_typ())) {
				msgL.addAll(checkCreateYieldAct(uR));
			}

			return msgL;
		}

		protected MCMessageList checkCreateOperAct(MfgActRecvIf_Upd02_ActLstR aR) {
			MCMessageList msgL = new MCMessageList();

			// 1. 受信実績自身の重複チェック
			if (isRecvDuplicate(aR)) {
				// 同じ外部工程実績ＮＯ、外部システムＣＤの工程実績を複数登録できません。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0105, aR.data_no(), aR.data_lno(), aR.ext_oper_act_no(), aR.ext_sys_cd()));
				return msgL;
			}

			// 2. 受信実績と登録済実績のチェック
			if (aR.ext_oper_act_cnt() != null && aR.ext_oper_act_cnt().gt(0)) {
				// 同じ外部工程実績ＮＯ、外部システムＣＤの工程実績は既に存在しているため、登録できません。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0106, aR.data_no(), aR.data_lno(), aR.ext_oper_act_no(), aR.ext_sys_cd()));
			}
			else if (_operActIdx != null && _operMesIdx != null) {
				MCList<MCRow> actL = getActLCache(getCacheKey(aR.if_proc_typ(), aR.mfg_act_no()));

				// 2.1. 重複チェック
				MST_OPER_ACT_R odbR = (MST_OPER_ACT_R)actL.getFirst(_operActIdx, aR.ext_oper_act_no(), aR.ext_sys_cd());
				if (odbR != null) {
					if (odbR.if_auto_reg_flg()) {
						aR.oper_act_no(odbR.oper_act_no());
						aR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						aR.setStatus(Status.MODIFY);
					}
					else {
						// 同じ外部工程実績ＮＯ、外部システムＣＤの工程実績は既に存在しているため、登録できません。
						setErrFlag(aR);
						msgL.add(new MCMessage(aR, null, MSLAL0106, aR.data_no(), aR.data_lno(), aR.ext_oper_act_no(), aR.ext_sys_cd()));
					}
				}

				// 2.2. 他処理によって登録済の工程実績があれば、エラーにする。
				MCRow otherR = actL.getFirst(_operMesIdx, aR.oper_inst_no(), false);
				if (otherR != null) {
					// ＭＥＳ送受信工程に、他処理で実績を登録しました。
					setErrFlag(aR);
					msgL.add(new MCMessage(aR, null, MSLAL0107, aR.data_no(), aR.data_lno(), aR.oper_inst_no()));
				}
			}

			// 3. 日付大小関係チェック
			if (!isNull(aR.end_act_tm()) && aR.end_act_tm().compareToLeft( aR.st_act_tm(), MCDateFieldType.MINUTE ) < 0) {
				// 工程の着手実績日時は終了実績日時以前に指定する必要があります。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0108, aR.data_no(), aR.data_lno(), toYMDHMString(aR.st_act_tm()), toYMDHMString(aR.end_act_tm())));
			}

			// 4. 重複取込不可チェック
			if (!aR.err_flg() && isNotDupImpOper(aR)) {
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0146, aR.data_no(), aR.data_lno(), aR.oper_inst_no()));
			}

			return msgL;
		}

		protected MCMessageList checkCreateInptAct(MfgActRecvIf_Upd02_ActLstR aR) {
			MCMessageList msgL = new MCMessageList();

			// 1. 受信実績自身の重複チェック
			if (isRecvDuplicate(aR)) {
				// 同じ外部投入実績ＮＯ、外部システムＣＤの投入実績を複数新規登録できません。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0109, aR.data_no(), aR.data_lno(), aR.ext_inpt_act_no(), aR.ext_sys_cd()));
				return msgL;
			}

			// 2. 受信実績と登録済実績重複チェック
			MST_INPT_ACT_R existR = (MST_INPT_ACT_R)getTargetInptAct(aR);
			if (aR.ext_act_cnt() != null && aR.ext_act_cnt().gt(0)) {
				if (existR != null && existR.if_auto_reg_flg()) {
					aR.inpt_act_no(existR.inpt_act_no());
					aR.inpt_schd_no(existR.inpt_schd_no());
					aR.oper_act_no(existR.oper_act_no());
					aR.ext_act_cnt(nvl(existR.getNumberNE("ext_act_cnt"), MCNumber.ZERO));
					aR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					aR.setStatus(Status.MODIFY);
				}
				else {
					// 同じ外部投入実績ＮＯ、外部システムＣＤの投入実績は既に登録したため、再度新規登録できません。
					// 取込対象の製造指図ＮＯ以外、他の製造指図に同じ外部投入実績ＮＯのデータがある場合。
					setErrFlag(aR);
					msgL.add(new MCMessage(aR, null, MSLAL0110, aR.data_no(), aR.data_lno(), aR.ext_inpt_act_no(), aR.ext_sys_cd()));
					return msgL;
				}
			}
			else if (_inptActIdx != null) {
				if (existR != null) {
					if (existR.if_auto_reg_flg()) {
						aR.inpt_act_no(existR.inpt_act_no());
						aR.inpt_schd_no(existR.inpt_schd_no());
						aR.oper_act_no(existR.oper_act_no());
						aR.ext_act_cnt(nvl(existR.getNumberNE("ext_act_cnt"), MCNumber.ZERO));
						aR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						aR.setStatus(Status.MODIFY);
					}
					else {
						// 同じ外部投入実績ＮＯ、外部システムＣＤの投入実績は既に登録したため、再度新規登録できません。
						setErrFlag(aR);
						msgL.add(new MCMessage(aR, null, MSLAL0110, aR.data_no(), aR.data_lno(), aR.ext_inpt_act_no(), aR.ext_sys_cd()));
						return msgL;
					}
				}
			}

			// 3. 親となる工程実績を特定する。
			msgL.add(specParentOperAct(aR));

			if (isNull(aR.inpt_schd_no())) {
				// 4. 投入予定ＮＯを特定する。（特定できない場合、追加投入とみなす）
				specInptSchdNo(aR);
			}
			else {
				// 4-2. 品目CDの補完
				specInptItmCd(aR);
			}

			// 実績登録可能な投入予定かどうかチェックする。
			if (!isNull(aR.inpt_schd_no())) {
				MST_INPT_SCHD_R schdR = (MST_INPT_SCHD_R)getSchdRCache(getCacheKey(MAC_IF_PROC_TYP.MES_INPT_SCHD_SEND.value(), aR.inpt_schd_no()));
				if (!isNull(schdR)) {
					msgL.add(checkCanActInptSchd(aR, schdR));
				}
			}

			// 5. 業務チェックを行う。
			msgL.addAll(checkCrtMdfInptBusiness(aR));

			// 6. 重複取込不可チェック
			if (!aR.err_flg() && isNotDupImpInpt(aR)) {
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0147, aR.data_no(), aR.data_lno(), aR.inpt_schd_no()));
			}

			// 同じ外部工程実績ＮＯの工程実績がある場合、[投入]外部工程実績ＮＯをクリア
			if (aR.ext_oper_act_cnt() != null && aR.ext_oper_act_cnt().gt(0) && isNull(aR.oper_act_no())) {
				aR.ext_oper_act_no(null);
			}

			return msgL;
		}

		protected boolean canActInptSchd(MST_INPT_SCHD_R schdR) {
			// 投入予定に対して実績計上が可能かどうかを返します
			// このメソッドを修正する場合、同時にcheckCanActInptSchdメソッドも修正してください
			// 投入数量、固定必要数量チェック
			if (schdR.base_unit_inpt_qty().isZero() && schdR.base_unit_fxd_rqmt_qty().isZero()) {
				return false;
			}
			// 指図書のみ品チェック
			if (MAC_INPT_CTL_TYP.isNO_MRP_INST(schdR.inpt_ctl_typ())) {
				return false;
			}
			return true;
		}

		protected MCMessage checkCanActInptSchd(MfgActRecvIf_Upd02_ActLstR aR, MST_INPT_SCHD_R schdR) {
			// 投入予定に対して実績計上が可能かどうかをチェックします
			// このメソッドを修正する場合、同時にcanActInptSchdメソッドも修正してください
			// 投入数量、固定必要数量チェック
			if (schdR.base_unit_inpt_qty().isZero() && schdR.base_unit_fxd_rqmt_qty().isZero()) {
				setErrFlag(aR);
				return new MCMessage(aR, null, MSLAL0222, aR.data_no(), aR.data_lno(), aR.inpt_schd_no());
			}
			// 指図書のみ品チェック
			if (MAC_INPT_CTL_TYP.isNO_MRP_INST(schdR.inpt_ctl_typ())) {
				setErrFlag(aR);
				return new MCMessage(aR, null, MSLAL0223, aR.data_no(), aR.data_lno(), aR.inpt_schd_no());
			}
			return null;
		}

		protected MCMessageList checkCrtMdfInptBusiness(MfgActRecvIf_Upd02_ActLstR aR) {
			MCMessageList msgL = new MCMessageList();

			if (isNull(aR.itm_cd()) && isNull(aR.inpt_schd_no())) {
				// 追加投入の場合、品目を指定する必要があります。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0111, aR.data_no(), aR.data_lno()));
			}

			if (!isNull(aR.inpt_schd_no()) && 
					getSchdRCache(getCacheKey(MAC_IF_PROC_TYP.MES_INPT_SCHD_SEND.value(), aR.inpt_schd_no())) == null) {
				// 指定された投入予定ＮＯが削除されました。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0091, aR.data_no(), aR.data_lno(), aR.inpt_schd_no()));
			}

			if (!isNull(aR.acxfr_qty()) && isNull(aR.acxfr_rsn_cd())) {
				// 他勘定振替数量がある場合、他勘定振替理由を指定する必要があります。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0112, aR.data_no(), aR.data_lno()));
			}

			if (!isNull(aR.acxfr_qty()) && isNull(aR.acxfr_bd_dpt_cd())) {
				// 他勘定振替数量がある場合、他勘定振替負担部門を指定する必要があります。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0113, aR.data_no(), aR.data_lno()));
			}

			return msgL;
		}

		protected void specInptSchdNo(MfgActRecvIf_Upd02_ActLstR aR) {
			if (!isNull(aR.inpt_schd_no()) || _inptSchdIdx == null || isNull(aR.itm_cd())) {
				return;
			}

			MCList<MCRow> schdInptL = getSchdLCache(getCacheKey(MAC_IF_PROC_TYP.MES_INPT_SCHD_SEND.value(), aR.mfg_inst_no()));

			// 同じ「工程指図ＮＯ＋品目・枝番」の投入予定から投入予定ＮＯを特定する。
			// a. 同じ「ロット、サブロット、引当手配ＮＯ１～４」の投入予定があれば、この投入予定を使用する。
			// b. 同じ「ロット、サブロット」の投入予定があれば、この投入予定を使用する。
			// c. 同じ品目の投入予定があれば、この投入予定を使用する。
			boolean noSameLotFlg = true;
			MCList<MCRow> schdL = schdInptL.subList(_inptSchdIdx, aR.oper_inst_no(), aR.itm_cd(), aR.itm_sub1(), aR.itm_sub2(), aR.itm_sub3());
			for (int i=0 ; i < schdL.size() ; i++) {
				MST_INPT_SCHD_R schdR = (MST_INPT_SCHD_R)schdL.get(i);
				if (!canActInptSchd(schdR)) {
					// 実績計上不可の投入予定からは補完しない
					continue;
				}

				if (schdL.size() == 1) {
					aR.inpt_schd_no(schdR.inpt_schd_no());
					break;
				}

				if (isSame(aR.lot_no(), schdR.lot_no()) && isSame(aR.sublot_no(), schdR.sublot_no())) {
					noSameLotFlg = false;
					aR.inpt_schd_no(schdR.inpt_schd_no());
					if (isSame(aR.sno1(), schdR.alloc_sno1()) && isSame(aR.sno2(), schdR.alloc_sno2()) &&
							isSame(aR.sno3(), schdR.alloc_sno3()) && isSame(aR.sno4(), schdR.alloc_sno4())) {
						break;
					}
				}
				else if (isNull(aR.inpt_schd_no())) {
					aR.inpt_schd_no(schdR.inpt_schd_no());
				}
				else if (noSameLotFlg && aR.inpt_schd_no().compareTo(schdR.inpt_schd_no()) > 0) {
					aR.inpt_schd_no(schdR.inpt_schd_no());
				}
			}
		}

		protected void specInptItmCd(MfgActRecvIf_Upd02_ActLstR aR) {
			if (isNull(aR.inpt_schd_no())) {
				return;
			}

			MST_INPT_SCHD_R schdR = (MST_INPT_SCHD_R)getSchdRCache(getCacheKey(MAC_IF_PROC_TYP.MES_INPT_SCHD_SEND.value(), aR.inpt_schd_no()));
			// 品目CDがない又は、実績計上不可の投入予定からは補完しない
			if (isNull(schdR) || isNull(schdR.itm_cd()) || !canActInptSchd(schdR)) {
				return;
			}
			
			aR.itm_cd(schdR.itm_cd());
			aR.itm_sub1(schdR.itm_sub1());
			aR.itm_sub2(schdR.itm_sub2());
			aR.itm_sub3(schdR.itm_sub3());
		}

		protected MCMessageList checkCreateWkAct(MfgActRecvIf_Upd02_ActLstR aR) {
			MCMessageList msgL = new MCMessageList();

			// 1. 受信実績自身の重複チェック
			if (isRecvDuplicate(aR)) {
				// 同じ外部工数実績ＮＯ、外部システムＣＤの工数実績を複数新規登録できません。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0114, aR.data_no(), aR.data_lno(), aR.ext_wk_act_no(), aR.ext_sys_cd()));
				return msgL;
			}

			// 2. 受信実績と登録済実績重複チェック
			if (aR.ext_act_cnt() != null && aR.ext_act_cnt().gt(0)) {
				// 同じ外部工数実績ＮＯ、外部システムＣＤの工数実績は既に登録したため、再度新規登録できません。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0115, aR.data_no(), aR.data_lno(), aR.ext_wk_act_no(), aR.ext_sys_cd()));
				return msgL;
			}

			// 3. 親となる工程実績を特定する。
			msgL.add(specParentOperAct(aR));

			// 4. 工数予定ＮＯを特定する。（特定できない場合、追加工数とみなす）
			specWkSchdNo(aR);

			// 5. 業務チェックを行う。
			msgL.addAll(checkCrtMdfWkBusiness(aR));

			// 6. 重複取込不可チェック
			if (!aR.err_flg() && isNotDupImpWk(aR)) {
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0148, aR.data_no(), aR.data_lno(), aR.wk_schd_no()));
			}

			// 同じ外部工程実績ＮＯの工程実績がある場合、[工数]外部工程実績ＮＯをクリア
			if (aR.ext_oper_act_cnt() != null && aR.ext_oper_act_cnt().gt(0) && isNull(aR.oper_act_no())) {
				aR.ext_oper_act_no(null);
			}

			return msgL;
		}

		protected MCMessageList checkCrtMdfWkBusiness(MfgActRecvIf_Upd02_ActLstR aR) {
			MCMessageList msgL = new MCMessageList();

			if (isNull(aR.wk_cost_cd()) && isNull(aR.wk_schd_no())) {
				// 追加工数の場合、工数管理ＣＤを指定する必要があります。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0116, aR.data_no(), aR.data_lno()));
			}

			if (!isNull(aR.wk_schd_no()) && 
					getSchdRCache(getCacheKey(null, aR.wk_schd_no())) == null) {
				// 指定された工数予定ＮＯが削除されました。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0092, aR.data_no(), aR.data_lno(), aR.wk_schd_no()));
			}

			if (!isNull(aR.st_hm()) && aR.st_hm().compareToLeft(aR.ac_dt(), MCDateFieldType.DAY) != 0 && aR.ac_dt().diffDay(aR.st_hm()) != 1) {
				// 工数の着手時刻は計上日と違う日になってしまいます。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0117, aR.data_no(), aR.data_lno(), toYMDString(aR.ac_dt()), toYMDHMString(aR.st_hm())));
			}

			if (!isNull(aR.end_hm()) && aR.end_hm().compareToLeft(aR.ac_dt(), MCDateFieldType.DAY) != 0) {
				// 工数の終了時刻は計上日と違う日になってしまいます。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0118, aR.data_no(), aR.data_lno(), toYMDString(aR.ac_dt()), toYMDHMString(aR.end_hm())));
			}

			return msgL;
		}

		protected void specWkSchdNo(MfgActRecvIf_Upd02_ActLstR aR) {
			if (!isNull(aR.wk_schd_no()) || _wkSchdIdx == null || isNull(aR.wk_cost_cd())) {
				return;
			}

			MCList<MCRow> schdWkL = getSchdLCache(getCacheKey(null, aR.mfg_inst_no()));

			// 同じ「工程指図ＮＯ＋工数管理ＣＤ」の工数予定から工数予定ＮＯを特定する。
			// 複数ある場合、一番小さい工数予定ＮＯを使用する。
			MCList<MCRow> schdL = schdWkL.subList(_wkSchdIdx, aR.oper_inst_no(), aR.wk_cost_cd());
			for (int i=0 ; i < schdL.size() ; i++) {
				MST_WK_SCHD_R schdR = (MST_WK_SCHD_R)schdL.get(i);

				if (isNull(aR.wk_schd_no())) {
					aR.wk_schd_no(schdR.wk_schd_no());
					continue;
				}

				if (aR.wk_schd_no().compareTo(schdR.wk_schd_no()) > 0) {
					aR.wk_schd_no(schdR.wk_schd_no());
				}
			}
		}

		protected MCMessageList checkCreateYieldAct(MfgActRecvIf_Upd02_ActLstR aR) {
			MCMessageList msgL = new MCMessageList();

			// 1. 受信実績自身の重複チェック
			if (isRecvDuplicate(aR)) {
				// 同じ外部出来高実績ＮＯ、外部システムＣＤの投入実績を複数新規登録できません。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0120, aR.data_no(), aR.data_lno(), aR.ext_yield_act_no(), aR.ext_sys_cd()));
				return msgL;
			}

			// 2. 受信実績と登録済実績重複チェック
			if (aR.ext_act_cnt() != null && aR.ext_act_cnt().gt(0)) {
				// 同じ外部出来高実績ＮＯ、外部システムＣＤの投入実績は既に登録したため、再度新規登録できません。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0121, aR.data_no(), aR.data_lno(), aR.ext_yield_act_no(), aR.ext_sys_cd()));
				return msgL;
			}

			// 3. 親となる工程実績を特定する。
			msgL.add(specParentOperAct(aR));

			// 4. 出来高予定ＮＯを特定する。
			//  特定できない場合、出来高ならエラー、副産品なら追加とみなす
			specYieldSchdNo(aR);
			if (isNull(aR.yield_schd_no()) && !MAC_YIELD_TYP.isBYPROD(aR.yield_typ())) {
				// 出来高の受信実績なのに、出来高予定ＮＯを特定できません。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0122, aR.data_no(), aR.data_lno()));
			}

			// 5. 業務チェックを行う。
			if (!aR.err_flg()) {
				msgL.addAll(checkCrtMdfYieldBusiness(aR));
			}

			// 6. 重複取込不可チェック
			if (!aR.err_flg() && isNotDupImpYield(aR)) {
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0149, aR.data_no(), aR.data_lno(), aR.yield_schd_no()));
			}

			// 同じ外部工程実績ＮＯの工程実績がある場合、[投入]外部工程実績ＮＯをクリア
			if (aR.ext_oper_act_cnt() != null && aR.ext_oper_act_cnt().gt(0) && isNull(aR.oper_act_no())) {
				aR.ext_oper_act_no(null);
			}

			return msgL;
		}

		protected MCMessageList checkCrtMdfYieldBusiness(MfgActRecvIf_Upd02_ActLstR aR) {
			MCMessageList msgL = new MCMessageList();

			MST_YIELD_SCHD_R ysR = null;
			if (!isNull(aR.yield_schd_no())) {
				ysR = (MST_YIELD_SCHD_R)getSchdRCache(getCacheKey(MAC_IF_PROC_TYP.MES_YIELD_SCHD_SEND.value(), aR.yield_schd_no()));
			}

			if (isNull(aR.itm_cd())) {
				// 追加副産品の場合、品目を指定する必要があります。
				if (ysR == null || isNull(ysR.yield_schd_no())) {
					setErrFlag(aR);
					msgL.add(new MCMessage(aR, null, MSLAL0123, aR.data_no(), aR.data_lno()));
				}
				else {
					aR.itm_cd(ysR.itm_cd());
					aR.itm_sub1(ysR.itm_sub1());
					aR.itm_sub2(ysR.itm_sub2());
					aR.itm_sub3(ysR.itm_sub3());
					aR.sno1(ysR.sno1());
					aR.sno2(ysR.sno2());
					aR.sno3(ysR.sno3());
					aR.sno4(ysR.sno4());
				}
			}

			if (isNull(aR.lot_no()) && ysR != null && !isNull(ysR.lot_no())) {
				aR.lot_no(ysR.lot_no());
				aR.sublot_no(ysR.sublot_no());
			}

			// 出来高区分
			if (isNull(aR.yield_typ())) {
				if (ysR != null) {
					aR.yield_typ(ysR.yield_typ());
				}
				else {
					aR.yield_typ(MAC_YIELD_TYP.BYPROD.value());
				}
			}

			if (isNull(aR.quality_typ())) {
				// 副産品の場合は「良品」固定
				if (MAC_YIELD_TYP.isBYPROD(aR.yield_typ())) {
					aR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				}
				else {
					if (MAC_YIELD_TYP.isDFCT(aR.yield_typ())) {
						aR.quality_typ(MAC_QUALITY_TYP.DFCT_OPER.value());
					}
					else {
						aR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
					}
				}
			}

			// 格付がない場合、デフォルト格付情報で補完
			if (isNull(aR.gd_cd())) {
				aR.gd_cd(getDefaultFeedStkGd().gd_cd());
			}

			// 格納場所の補完
			if (isNull(aR.strg_loc_cd())) {
				if (ysR != null) {
					aR.strg_loc_cd(ysR.strg_loc_cd());
					aR.strg_str_ln_cd(ysR.strg_str_ln_cd());
				}
				else if (!isNull(aR.mfg_strg_loc_cd())) {
					aR.strg_loc_cd(aR.mfg_strg_loc_cd());
					aR.strg_str_ln_cd(aR.mfg_strg_str_ln_cd());
				}
			}

			if (!isNull(aR.yield_schd_no()) && ysR == null) {
				// 指定された出来高予定ＮＯが削除されました。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0093, aR.data_no(), aR.data_lno(), aR.yield_schd_no()));
			}

			if (MAC_YIELD_TYP.isDFCT(aR.yield_typ()) && isNull(aR.yield_rsn_cd())) {
				// 出来高不良品の場合、出来高理由を指定する必要があります。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0125, aR.data_no(), aR.data_lno()));
			}

			return msgL;
		}

		protected void specYieldSchdNo(MfgActRecvIf_Upd02_ActLstR aR) {
			if (!isNull(aR.yield_schd_no()) || _yieldSchdIdx == null || isNull(aR.itm_cd())) {
				return;
			}

			MCList<MCRow> schdYieldL = getSchdLCache(getCacheKey(MAC_IF_PROC_TYP.MES_YIELD_SCHD_SEND.value(), aR.mfg_inst_no()));

			// 同じ「工程指図ＮＯ＋品目・枝番」の出来高予定から出来高予定ＮＯを特定する。
			// a. 同じ「ロット、サブロット、手配ＮＯ１～４」の出来高予定があれば、この出来高予定を使用する。
			// b. 同じ「ロット、サブロット」の出来高予定があれば、この出来高予定を使用する。
			// c. 同じ品目の出来高予定があれば、この出来高予定を使用する。
			boolean noSameLotFlg = true;
			MCList<MCRow> schdL = schdYieldL.subList(_yieldSchdIdx, aR.oper_inst_no(), aR.itm_cd(), aR.itm_sub1(), aR.itm_sub2(), aR.itm_sub3());
			for (int i=0 ; i < schdL.size() ; i++) {
				MST_YIELD_SCHD_R schdR = (MST_YIELD_SCHD_R)schdL.get(i);

				if (schdL.size() == 1) {
					aR.yield_schd_no(schdR.yield_schd_no());
					break;
				}

				if (isSame(aR.lot_no(), schdR.lot_no()) && isSame(aR.sublot_no(), schdR.sublot_no())) {
					noSameLotFlg = false;
					aR.yield_schd_no(schdR.yield_schd_no());
					if (isSame(aR.sno1(), schdR.sno1()) && isSame(aR.sno2(), schdR.sno2()) &&
						isSame(aR.sno3(), schdR.sno3()) && isSame(aR.sno4(), schdR.sno4())) {
						break;
					}
				}
				else if (isNull(aR.yield_schd_no())) {
					aR.yield_schd_no(schdR.yield_schd_no());
				}
				else if (noSameLotFlg && aR.yield_schd_no().compareTo(schdR.yield_schd_no()) > 0) {
					aR.yield_schd_no(schdR.yield_schd_no());
				}
			}
		}

		protected MCMessage specParentOperAct(MfgActRecvIf_Upd02_ActLstR aR) {
			if (_operMesIdx == null || !isNull(aR.oper_act_no())) {
				return null;
			}

			MCList<MCRow> actOperL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value(), aR.mfg_act_no()));

			// 親の工程実績ＮＯを特定する。
			// a. 受信工程実績IF内に、同じ外部工程実績ＮＯの工程実績があれば、工程実績NOはnullにする。
			// b. 同じ外部工程実績ＮＯの工程実績があれば、この工程実績を使用する。
			// c. 同じ外部工程実績ＮＯの工程実績がない場合、一番小さい工程実績ＮＯを使用する。
			MCList<MCRow> prntL = actOperL.subList(_operMesIdx, aR.oper_inst_no(), true);
			for (int i=0 ; i < prntL.size() ; i++) {
				MST_OPER_ACT_R prntR = (MST_OPER_ACT_R)prntL.get(i);

				if (!isNull(up0().getFirst(_up0Idx, aR.ext_oper_act_no(), MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value()))) {
					aR.oper_act_no(null);
					break;
				}

				if (!isNull(aR.ext_oper_act_no()) && isSame(aR.ext_oper_act_no(), prntR.ext_oper_act_no())) {
					aR.oper_act_no(prntR.oper_act_no());
					break;
				}

				if (isNull(aR.oper_act_no())) {
					aR.oper_act_no(prntR.oper_act_no());
				}
				else if (aR.oper_act_no().compareTo(prntR.oper_act_no()) > 0) {
					aR.oper_act_no(prntR.oper_act_no());
				}
			}
			if (isClearOperActNo(aR)) {
				aR.oper_act_no(null);
			}
			
			// 上記の処理で工程実績ＮＯが設定されない場合、ＭＥＳ対象外の工程実績から設定
			if (isNull(aR.oper_act_no())) {
				MST_OPER_ACT_R otherR = (MST_OPER_ACT_R)actOperL.getFirst(_operMesIdx, aR.oper_inst_no(), false);
				if (otherR != null) {
					aR.oper_act_no(otherR.oper_act_no());
				}
			}

			return null;
		}
		/**
		 * 出来高実績受信によって工程実績を自動作成する場合、出来高実績と工程実績が1:1になる。
		 * そのため、取得した工程実績ＮＯの工程実績が別の出来高実績と紐付いている場合は、その工程実績ＮＯを採用せず、
		 * 新たに工程実績を追加する必要がある。
		 * 当処理で工程実績ＮＯをクリアし、後続のUpd04で工程実績が新規追加されるようにする。
		 * 
		 * @param aR 実績IFデータ
		 * @return 工程実績ＮＯをクリアする場合はtrue
		 */
		protected boolean isClearOperActNo(MfgActRecvIf_Upd02_ActLstR aR) {

			// 工程実績ＮＯが未設定の場合はクリア不要
			if (isNull(aR.oper_act_no())) {
				return false;
			}

			// 工程実績ＮＯから工程実績を取得
			MST_OPER_ACT_R oaR = (MST_OPER_ACT_R)getActRCache(getCacheKey(MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value(), aR.oper_act_no()));

			// 外部工程実績ＮＯが一致する場合はクリアしない（工程実績を新規追加せず、取得した工程実績に紐付ける）
			if (!isNull(aR.ext_oper_act_no()) && isSame(aR.ext_oper_act_no(), oaR.ext_oper_act_no())) {
				return false;
			}

			// 工程実績が自動補完されたものでなければ（工程実績受信または画面から登録されたものであれば）クリアしない
			if (!oaR.if_auto_reg_flg()) {
				return false;
			}

			// 副産品実績・投入実績・工数実績の場合
			if ((MAC_YIELD_TYP.isBYPROD(aR.yield_typ())
					|| MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(aR.if_proc_typ())
					|| MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(aR.if_proc_typ()))) {
				// 外部工程実績ＮＯがNULLの場合にはクリアしない（工程実績を新規追加せず、取得した工程実績に紐付ける）
				if (isNull(aR.ext_oper_act_no())) {
					return false;
				}
				// 外部工程実績ＮＯが設定されている、かつ一致しない場合はクリアする
				else if (!isSame(aR.ext_oper_act_no(), oaR.ext_oper_act_no())) {
					return true;
				}
			}

			// 同一製造実績に紐付く出来高実績を取得
			MCList<MCRow> actDBL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_YIELD_ACT_RECV.value(), aR.mfg_act_no()));
			// 同一製造実績に紐付く投入実績を取得
			MCList<MCRow> inptActDBL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_INPT_ACT_RECV.value(), aR.mfg_act_no()));
			// 同一製造実績に紐付く工数実績を取得
			MCList<MCRow> wkActDBL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_WK_ACT_RECV.value(), aR.mfg_act_no()));

			if (isNull(actDBL) && isNull(inptActDBL) && isNull(wkActDBL)) {
				// 上り電文に存在する他の出来高実績がその工程実績を使用している場合はクリアする
				// ただし、外部工程実績ＮＯが一致する場合はクリアしない
				if (_usedOperMap.containsKey(aR.oper_act_no())) {
					String extOperActNo = _usedOperMap.get(aR.oper_act_no());
					if (isNull(extOperActNo) || !isSame(aR.ext_oper_act_no(), extOperActNo)) {
						return true;
					}
				}
				else {
					_usedOperMap.put(aR.oper_act_no(), aR.ext_oper_act_no());
				}
				// 出来高実績が存在しない場合はクリアしない
				return false;
			}

			if (!isNull(actDBL)) {
				for (int i=0 ; i < actDBL.size() ; i++) {
					MST_YIELD_ACT_R yaR = (MST_YIELD_ACT_R)actDBL.get(i);

					// 副産品実績は無視
					if (MAC_YIELD_TYP.isBYPROD(yaR.yield_typ()) && isNull(aR.ext_oper_act_no())) {
						continue;
					}
	
					// 同じ工程実績ＮＯを持つ出来高実績が存在する場合、クリアする
					if (isSame(yaR.oper_act_no(), oaR.oper_act_no())) {
						return true;
					}
				}
			}

			if (!isNull(inptActDBL)) {
				for (int i = 0 ; i < inptActDBL.size() ; i++) {
					// 外部工程実績ＮＯがNULLで一致する場合にはクリアしない（工程実績を新規追加せず、取得した工程実績に紐付ける）
					if (isNull(aR.ext_oper_act_no()) && isNull(oaR.ext_oper_act_no())) {
						return false;
					}

					MST_INPT_ACT_R iaR = (MST_INPT_ACT_R)inptActDBL.get(i);
					// 同じ工程実績ＮＯを持つ投入実績が存在する場合、クリアする
					if (isSame(iaR.oper_act_no(), oaR.oper_act_no())) {
						return true;
					}
				}
			}

			if (!isNull(wkActDBL)) {
				for (int i = 0 ; i < wkActDBL.size() ; i++) {
					// 外部工程実績ＮＯがNULLで一致する場合にはクリアしない（工程実績を新規追加せず、取得した工程実績に紐付ける）
					if (isNull(aR.ext_oper_act_no()) && isNull(oaR.ext_oper_act_no())) {
						return false;
					}

					MST_WK_ACT_R waR = (MST_WK_ACT_R)wkActDBL.get(i);
					// 同じ工程実績ＮＯを持つ工数実績が存在する場合、クリアする
					if (isSame(waR.oper_act_no(), oaR.oper_act_no())) {
						return true;
					}
				}
			}
			return false;
		}

		/**
		 * 受信実績中に、同じ「外部実績ＮＯ＋外部システムＣＤ」のデータは複数あるかどうかをチェックする。
		 * @param aR 受信実績
		 * @return true: 複数あり, false: それ以外
		 */
		protected boolean isRecvDuplicate(MfgActRecvIf_Upd02_ActLstR aR) {
			String extActKey = crtExtAltrKey(aR);
			if (getExtActKeySet().contains(extActKey)) {
				return true;
			}

			getExtActKeySet().add(extActKey);

			return false;
		}

		/**
		 * ＩＦ制御マスタ「重複取込不可」がオンの場合、<br>
		 * 同じ工程指図ＮＯにおいて、複数回（外部システムデータＮＯ＋外部システムＣＤ）実績の取り込みであるかどうか判断する。
		 * @param aR 実績対象
		 * @return true: 複数回取込, false: それ以外
		 */
		protected boolean isNotDupImpOper(MfgActRecvIf_Upd02_ActLstR aR) {
			if (!aR.not_dup_imp_flg()) {
				return false;
			}
			if (!MAC_DATA_CRUD_TYP.isCRT(aR.data_crud_typ()) || isNull(aR.oper_inst_no())) {
				return false;
			}

			MfgActRecvIf_Upd02_ActLstR bfR = getNotDupImpCache(getCacheKey(aR.if_proc_typ(), aR.oper_inst_no()));
			if (bfR == null) {
				setNotDupImpCache(getCacheKey(aR.if_proc_typ(), aR.oper_inst_no()), aR);
				return false;
			}

			if (isSame(bfR.ext_data_no(), aR.ext_data_no()) && isSame(bfR.ext_sys_cd(), aR.ext_sys_cd())) {
				return false;
			}

			return true;
		}

		/**
		 * ＩＦ制御マスタ「重複取込不可」がオンの場合、<br>
		 * 同じ投入予定ＮＯにおいて、複数回（外部システムデータＮＯ＋外部システムＣＤ）実績の取り込みであるかどうか判断する。
		 * @param aR 実績対象
		 * @return true: 複数回取込, false: それ以外
		 */
		protected boolean isNotDupImpInpt(MfgActRecvIf_Upd02_ActLstR aR) {
			if (!aR.not_dup_imp_flg()) {
				return false;
			}
			if (!MAC_DATA_CRUD_TYP.isCRT(aR.data_crud_typ()) || isNull(aR.inpt_schd_no())) {
				return false;
			}

			MfgActRecvIf_Upd02_ActLstR bfR = getNotDupImpCache(getCacheKey(aR.if_proc_typ(), aR.inpt_schd_no()));
			if (bfR == null) {
				setNotDupImpCache(getCacheKey(aR.if_proc_typ(), aR.inpt_schd_no()), aR);
				return false;
			}

			if (isSame(bfR.ext_data_no(), aR.ext_data_no()) && isSame(bfR.ext_sys_cd(), aR.ext_sys_cd())) {
				return false;
			}

			return true;
		}

		/**
		 * ＩＦ制御マスタ「重複取込不可」がオンの場合、<br>
		 * 同じ工数予定ＮＯにおいて、複数回（外部システムデータＮＯ＋外部システムＣＤ）実績の取り込みであるかどうか判断する。
		 * @param aR 実績対象
		 * @return true: 複数回取込, false: それ以外
		 */
		protected boolean isNotDupImpWk(MfgActRecvIf_Upd02_ActLstR aR) {
			if (!aR.not_dup_imp_flg()) {
				return false;
			}
			if (!MAC_DATA_CRUD_TYP.isCRT(aR.data_crud_typ()) || isNull(aR.wk_schd_no())) {
				return false;
			}

			MfgActRecvIf_Upd02_ActLstR bfR = getNotDupImpCache(getCacheKey(aR.if_proc_typ(), aR.wk_schd_no()));
			if (bfR == null) {
				setNotDupImpCache(getCacheKey(aR.if_proc_typ(), aR.wk_schd_no()), aR);
				return false;
			}

			if (isSame(bfR.ext_data_no(), aR.ext_data_no()) && isSame(bfR.ext_sys_cd(), aR.ext_sys_cd())) {
				return false;
			}

			return true;
		}

		/**
		 * ＩＦ制御マスタ「重複取込不可」がオンの場合、<br>
		 * 同じ出来高予定ＮＯにおいて、複数回（外部システムデータＮＯ＋外部システムＣＤ）実績の取り込みであるかどうか判断する。
		 * @param aR 実績対象
		 * @return true: 複数回取込, false: それ以外
		 */
		protected boolean isNotDupImpYield(MfgActRecvIf_Upd02_ActLstR aR) {
			if (!aR.not_dup_imp_flg()) {
				return false;
			}
			if (!MAC_DATA_CRUD_TYP.isCRT(aR.data_crud_typ()) || isNull(aR.yield_schd_no())) {
				return false;
			}

			MfgActRecvIf_Upd02_ActLstR bfR = getNotDupImpCache(getCacheKey(aR.if_proc_typ(), aR.yield_schd_no()));
			if (bfR == null) {
				setNotDupImpCache(getCacheKey(aR.if_proc_typ(), aR.yield_schd_no()), aR);
				return false;
			}

			if (isSame(bfR.ext_data_no(), aR.ext_data_no()) && isSame(bfR.ext_sys_cd(), aR.ext_sys_cd())) {
				return false;
			}

			return true;
		}

		/**
		 * データ更新区分：訂正の受信実績をチェックする。
		 * @param uR 受信実績
		 * @return チェックメッセージ
		 */
		protected MCMessageList checkModifyAct(MfgActRecvIf_Upd02_ActLstR uR) {
			MCMessageList msgL = new MCMessageList();

			if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(uR.if_proc_typ())) {
				msgL.addAll(checkModifyOperAct(uR));
			}
			else if (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(uR.if_proc_typ())) {
				msgL.addAll(checkModifyInptAct(uR));
			}
			else if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(uR.if_proc_typ())) {
				msgL.addAll(checkModifyWkAct(uR));
			}
			else if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(uR.if_proc_typ())) {
				msgL.addAll(checkModifyYieldAct(uR));
			}

			return msgL;
		}

		protected MCMessageList checkModifyOperAct(MfgActRecvIf_Upd02_ActLstR aR) {
			MCMessageList msgL = new MCMessageList();

			// 1. 実績存在チェック
			MST_OPER_ACT_R actR = (MST_OPER_ACT_R)getTargetOperAct(aR);
			if (actR == null) {
				// 訂正対象の工程実績が存在しません。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0126, aR.data_no(), aR.data_lno(), aR.ext_oper_act_no(), aR.ext_sys_cd()));
			}
			else {
				if (isNull(aR.oper_act_no())) {
					aR.oper_act_no(actR.oper_act_no());
				}
			}

			// 2. 日付大小関係チェック
			if (!isNull(aR.end_act_tm()) && aR.end_act_tm().compareToLeft( aR.st_act_tm(), MCDateFieldType.MINUTE ) < 0) {
				// 工程の着手実績日時は終了実績日時以前に指定する必要があります。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0108, aR.data_no(), aR.data_lno(), toYMDHMString(aR.st_act_tm()), toYMDHMString(aR.end_act_tm())));
			}

			return msgL;
		}

		protected MCMessageList checkModifyInptAct(MfgActRecvIf_Upd02_ActLstR aR) {
			MCMessageList msgL = new MCMessageList();

			// 1. 実績存在チェック
			MST_INPT_ACT_R actR = (MST_INPT_ACT_R)getTargetInptAct(aR);
			if (actR == null) {
				// 訂正対象の投入実績が存在しません。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0127, aR.data_no(), aR.data_lno(), aR.ext_inpt_act_no(), aR.ext_sys_cd()));
			}
			else {
				if (isNull(aR.inpt_act_no())) {
					aR.inpt_act_no(actR.inpt_act_no());
				}
				if (isNull(aR.oper_act_no())) {
					aR.oper_act_no(actR.oper_act_no());
				}
				if (isNull(aR.inpt_schd_no())) {
					aR.inpt_schd_no(actR.inpt_schd_no());
				}
				aR.itm_cd(actR.itm_cd());
				aR.itm_sub1(actR.itm_sub1());
				aR.itm_sub2(actR.itm_sub2());
				aR.itm_sub3(actR.itm_sub3());
				// 外部実績数を再設定
				aR.ext_act_cnt(nvl(actR.getNumberNE("ext_act_cnt"), MCNumber.ZERO));
			}

			// 2. 業務チェックを行う。
			msgL.addAll(checkCrtMdfInptBusiness(aR));

			return msgL;
		}

		protected MCMessageList checkModifyWkAct(MfgActRecvIf_Upd02_ActLstR aR) {
			MCMessageList msgL = new MCMessageList();

			// 1. 実績存在チェック
			MST_WK_ACT_R actR = (MST_WK_ACT_R)getTargetWkAct(aR);
			if (actR == null) {
				// 訂正対象の工数実績が存在しません。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0128, aR.data_no(), aR.data_lno(), aR.ext_wk_act_no(), aR.ext_sys_cd()));
			}
			else {
				if (isNull(aR.wk_act_no())) {
					aR.wk_act_no(actR.wk_act_no());
				}
				if (isNull(aR.oper_act_no())) {
					aR.oper_act_no(actR.oper_act_no());
				}
				if (isNull(aR.wk_schd_no())) {
					aR.wk_schd_no(actR.wk_schd_no());
				}
				if (isNull(aR.wk_cost_cd())) {
					aR.wk_cost_cd(actR.wk_cost_cd());
				}
			}

			// 2. 業務チェックを行う。
			msgL.addAll(checkCrtMdfWkBusiness(aR));

			return msgL;
		}

		protected MCMessageList checkModifyYieldAct(MfgActRecvIf_Upd02_ActLstR aR) {
			MCMessageList msgL = new MCMessageList();

			// 1. 実績存在チェック
			MST_YIELD_ACT_R actR = (MST_YIELD_ACT_R)getTargetYieldAct(aR);
			if (actR == null) {
				// 訂正対象の出来高実績が存在しません。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0129, aR.data_no(), aR.data_lno(), aR.ext_yield_act_no(), aR.ext_sys_cd()));
			}
			else {
				// キー項目
				if (isNull(aR.yield_act_no())) {
					aR.yield_act_no(actR.yield_act_no());
				}
				if (isNull(aR.oper_act_no())) {
					aR.oper_act_no(actR.oper_act_no());
				}
				if (isNull(aR.yield_schd_no())) {
					aR.yield_schd_no(actR.yield_schd_no());
				}
				if (isNull(aR.itm_cd())) {
					aR.itm_cd(actR.itm_cd());
					aR.itm_sub1(actR.itm_sub1());
					aR.itm_sub2(actR.itm_sub2());
					aR.itm_sub3(actR.itm_sub3());
					aR.sno1(actR.sno1());
					aR.sno2(actR.sno2());
					aR.sno3(actR.sno3());
					aR.sno4(actR.sno4());
				}
				if (isNull(aR.lot_no())) {
					aR.lot_no(actR.lot_no());
				}
				if (isNull(aR.sublot_no())) {
					aR.sublot_no(actR.sublot_no());
				}
				// 良品区分と格付
				if (isNull(aR.quality_typ())) {
					aR.quality_typ(actR.quality_typ());
				}
				if (isNull(aR.gd_cd())) {
					aR.gd_cd(actR.gd_cd());
				}
				// 格納場所
				if (isNull(aR.strg_loc_cd())) {
					aR.strg_loc_cd(actR.strg_loc_cd());
					aR.strg_str_ln_cd(actR.strg_str_ln_cd());
				}
			}

			// 2. 業務チェックを行う。
			msgL.addAll(checkCrtMdfYieldBusiness(aR));

			return msgL;
		}

		/**
		 * データ更新区分：取消の受信実績をチェックする。
		 * @param uR 受信実績
		 * @return チェックメッセージ
		 */
		protected MCMessageList checkDeleteAct(MfgActRecvIf_Upd02_ActLstR uR) {
			MCMessageList msgL = new MCMessageList();

			if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(uR.if_proc_typ())) {
				msgL.addAll(checkDeleteOperAct(uR));
			}
			else if (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(uR.if_proc_typ())) {
				msgL.addAll(checkDeleteInptAct(uR));
			}
			else if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(uR.if_proc_typ())) {
				msgL.addAll(checkDeleteWkAct(uR));
			}
			else if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(uR.if_proc_typ())) {
				msgL.addAll(checkDeleteYieldAct(uR));
			}

			return msgL;
		}

		protected MCMessageList checkDeleteOperAct(MfgActRecvIf_Upd02_ActLstR aR) {
			MCMessageList msgL = new MCMessageList();

			// 1. 実績存在チェック
			MST_OPER_ACT_R actR = (MST_OPER_ACT_R)getTargetOperAct(aR);
			if (actR == null) {
				// 取消対象の工程実績が存在しません。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0126, aR.data_no(), aR.data_lno(), aR.ext_oper_act_no(), aR.ext_sys_cd()));
			}
			else {
				if (isNull(aR.oper_act_no())) {
					aR.oper_act_no(actR.oper_act_no());
				}
			}

			return msgL;
		}

		protected MCMessageList checkDeleteInptAct(MfgActRecvIf_Upd02_ActLstR aR) {
			MCMessageList msgL = new MCMessageList();

			// 1. 実績存在チェック
			MST_INPT_ACT_R actR = (MST_INPT_ACT_R)getTargetInptAct(aR);
			if (actR == null) {
				// 取消対象の投入実績が存在しません。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0127, aR.data_no(), aR.data_lno(), aR.ext_inpt_act_no(), aR.ext_sys_cd()));
			}
			else {
				aR.can_ac_dt(actR.ac_dt());

				if (isNull(aR.inpt_act_no())) {
					aR.inpt_act_no(actR.inpt_act_no());
				}
				if (isNull(aR.oper_act_no())) {
					aR.oper_act_no(actR.oper_act_no());
				}
				if (isNull(aR.inpt_schd_no())) {
					aR.inpt_schd_no(actR.inpt_schd_no());
				}
				if (isNull(aR.itm_cd())) {
					aR.itm_cd(actR.itm_cd());
					aR.itm_sub1(actR.itm_sub1());
					aR.itm_sub2(actR.itm_sub2());
					aR.itm_sub3(actR.itm_sub3());
				}
				// 外部実績数を再設定
				aR.ext_act_cnt(nvl(actR.getNumberNE("ext_act_cnt"), MCNumber.ZERO));
			}

			return msgL;
		}

		protected MCMessageList checkDeleteWkAct(MfgActRecvIf_Upd02_ActLstR aR) {
			MCMessageList msgL = new MCMessageList();

			// 1. 実績存在チェック
			MST_WK_ACT_R actR = (MST_WK_ACT_R)getTargetWkAct(aR);
			if (actR == null) {
				// 取消対象の工数実績が存在しません。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0128, aR.data_no(), aR.data_lno(), aR.ext_wk_act_no(), aR.ext_sys_cd()));
			}
			else {
				if (isNull(aR.wk_act_no())) {
					aR.wk_act_no(actR.wk_act_no());
				}
				if (isNull(aR.oper_act_no())) {
					aR.oper_act_no(actR.oper_act_no());
				}
				if (isNull(aR.wk_schd_no())) {
					aR.wk_schd_no(actR.wk_schd_no());
				}
				if (isNull(aR.wk_cost_cd())) {
					aR.wk_cost_cd(actR.wk_cost_cd());
				}
			}

			return msgL;
		}

		protected MCMessageList checkDeleteYieldAct(MfgActRecvIf_Upd02_ActLstR aR) {
			MCMessageList msgL = new MCMessageList();

			// 1. 実績存在チェック
			MST_YIELD_ACT_R actR = (MST_YIELD_ACT_R)getTargetYieldAct(aR);
			if (actR == null) {
				// 取消対象の出来高実績が存在しません。
				setErrFlag(aR);
				msgL.add(new MCMessage(aR, null, MSLAL0129, aR.data_no(), aR.data_lno(), aR.ext_yield_act_no(), aR.ext_sys_cd()));
			}
			else {
				aR.can_ac_dt(actR.ac_dt());

				if (isNull(aR.yield_act_no())) {
					aR.yield_act_no(actR.yield_act_no());
				}
				if (isNull(aR.oper_act_no())) {
					aR.oper_act_no(actR.oper_act_no());
				}
				if (isNull(aR.yield_schd_no())) {
					aR.yield_schd_no(actR.yield_schd_no());
				}
				if (isNull(aR.itm_cd())) {
					aR.itm_cd(actR.itm_cd());
					aR.itm_sub1(actR.itm_sub1());
					aR.itm_sub2(actR.itm_sub2());
					aR.itm_sub3(actR.itm_sub3());
				}
				if (isNull(aR.yield_typ())) {
					aR.yield_typ(actR.yield_typ());
				}
				if (isNull(aR.yield_rsn_cd())) {
					aR.yield_rsn_cd(actR.yield_rsn_cd());
				}
			}

			return msgL;
		}

		protected MCRow getTargetOperAct(MfgActRecvIf_Upd02_ActLstR aR) {
			if (_operActIdx == null) {
				return null;
			}

			if (!isNull(aR.oper_act_no())) {
				return getActRCache(getCacheKey(aR.if_proc_typ(), aR.oper_act_no()));
			}

			MCList<MCRow> actL = getActLCache(getCacheKey(aR.if_proc_typ(), aR.mfg_act_no()));

			return actL.getFirst(_operActIdx, aR.ext_oper_act_no(), aR.ext_sys_cd());
		}

		protected MCRow getTargetInptAct(MfgActRecvIf_Upd02_ActLstR aR) {
			if (_inptActIdx == null) {
				return null;
			}

			MCList<MCRow> actL = getActLCache(getCacheKey(aR.if_proc_typ(), aR.mfg_act_no()));

			// 投入実績が複数に分割された場合、一番小さい投入実績ＮＯの実績を戻す。
			if (aR.ext_act_cnt() != null && aR.ext_act_cnt().gt(1)) {
				MCList<MCRow> subL = actL.subList(_inptActIdx, aR.ext_inpt_act_no(), aR.ext_sys_cd());
				if (!isNull(subL)) {
					subL.sort(MST_INPT_ACT_R.$inpt_act_no);
					return subL.get(0);
				}
			}

			return actL.getFirst(_inptActIdx, aR.ext_inpt_act_no(), aR.ext_sys_cd());
		}

		protected MCRow getTargetWkAct(MfgActRecvIf_Upd02_ActLstR aR) {
			if (_wkActIdx == null) {
				return null;
			}

			MCList<MCRow> actL = getActLCache(getCacheKey(aR.if_proc_typ(), aR.mfg_act_no()));

			return actL.getFirst(_wkActIdx, aR.ext_wk_act_no(), aR.ext_sys_cd());
		}

		protected MCRow getTargetYieldAct(MfgActRecvIf_Upd02_ActLstR aR) {
			if (_yieldActIdx == null) {
				return null;
			}

			MCList<MCRow> actL = getActLCache(getCacheKey(aR.if_proc_typ(), aR.mfg_act_no()));

			return actL.getFirst(_yieldActIdx, aR.ext_yield_act_no(), aR.ext_sys_cd());
		}


		/**
		 * 外部受信実績の代替キー（実績種類＋外部システムＣＤ＋外部実績ＮＯ）を生成する
		 * @param aR 外部実績
		 * @return 外部実績の代替キー
		 */
		protected String crtExtAltrKey(MfgActRecvIf_Upd02_ActLstR aR) {
			StringBuilder sb = new StringBuilder();

			sb.append(aR.if_proc_typ());
			sb.append(MAC_STR.CD_NM_DLM.value());
			sb.append(aR.ext_sys_cd());
			sb.append(MAC_STR.CD_NM_DLM.value());

			if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(aR.if_proc_typ())) {
				sb.append(aR.ext_oper_act_no());
			}
			else if (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(aR.if_proc_typ())) {
				sb.append(aR.ext_inpt_act_no());
			}
			else if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(aR.if_proc_typ())) {
				sb.append(aR.ext_wk_act_no());
			}
			else if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(aR.if_proc_typ())) {
				sb.append(aR.ext_yield_act_no());
			}

			return sb.toString();
		}

		protected String getLossItmKey(MfgActRecvIf_Upd02_ActLstR lossR) {
			StringBuilder sb = new StringBuilder();

			sb.append(lossR.itm_cd());
			sb.append(MAC_STR.DISP_ITM_DLM1.value());
			sb.append(lossR.itm_sub1());
			sb.append(MAC_STR.DISP_ITM_DLM2.value());
			sb.append(lossR.itm_sub2());
			sb.append(MAC_STR.DISP_ITM_DLM3.value());
			sb.append(lossR.itm_sub3());

			return sb.toString();
		}

		/**
		 * 出来高の基準単位実績数量を算出する。
		 * @param yieldActL 出来高実績リスト
		 * @return メッセージリスト
		 */
		protected MCMessageList calcYieldBaseUnitQty(MCList<MfgActRecvIf_Upd02_ActLstR> yieldActL) {
			if (isNull(yieldActL)) {
				return null;
			}

			MCMessageList msgL = new MCMessageList();

			// 計算対象を洗い出す。
			MCList<MfgActRecvIf_Upd02_ActLstR> srchL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
			for (MfgActRecvIf_Upd02_ActLstR yieldR : yieldActL) {
				yieldR.base_unit_qty(MCNumber.ZERO);
				if (yieldR.err_flg() || _errMfgInstNoS.contains(yieldR.mfg_inst_no())) {
					continue;
				}
				if (isNull(yieldR.trd_unit_cd()) || isNull(yieldR.trd_unit_qty())) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isDEL(yieldR.data_crud_typ())) {
					continue;
				}

				srchL.add(yieldR);
			}

			// 品目マスタ・品目単位マスタの定義を取得する。
			getItmMstCache(srchL);
			getItmUnitMstCache(srchL);

			// 基準単位数量を算出する。
			for (MfgActRecvIf_Upd02_ActLstR calcR : srchL) {
				MAM_ITM_R itmR = _cacheItmL.get(calcR.itm_cd(), calcR.itm_sub1(), calcR.itm_sub2(), calcR.itm_sub3());
				MAVM_ITM_UNIT_R itmUnitR = _cacheItmUnitL.get(calcR.itm_cd(), calcR.itm_sub1(), calcR.itm_sub2(), calcR.itm_sub3(), calcR.trd_unit_cd());
				if (itmR == null || isNull(itmR.itm_cd()) || 
					itmUnitR == null || isNull(itmUnitR.itm_cd())) {
					calcR.base_unit_qty(MCNumber.ZERO);
					continue;
				}

				calcR.base_unit_cd(itmR.unit_cd());
				if (isSame(calcR.trd_unit_cd(), calcR.base_unit_cd())) {
					calcR.base_unit_qty(calcR.trd_unit_qty());
				}
				else {
					calcR.base_unit_qty(convToBaseUnit(calcR.trd_unit_qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmR.dec_place(), itmR.rnd_typ()));
				}
			}

			return msgL;
		}

		/**
		 * 投入実績・ロス実績のロット混在・サブロット混在・代替品混在チェックを行う。
		 * MSBCL6060のUpd04にある「chkInptAfterLotProp」の混在チェック（ロット提案後の混在チェック）と同等の処理。
		 * 本オペレーションでチェックをしなくても、最終的に上記のチェックでエラーとなる。
		 * ただし、エラーとなった場合、同時に受信したすべてのレコードがエラーとなり、ロールバックされてしまう。
		 * 上記のチェックがChkではなくUpdで行われる理由は、Upd処理でロット提案を行っている（Chk段階ではロットや代替品が決まらない）ため。
		 * 投入実績受信で、IFデータにロット・サブロットや代替品が指定されている（ロット提案の必要がない）場合は、本オペレーションでチェックを行う。
		 * ロット・サブロットの指定がない場合は、上記の通りMSBCL6060のUpd04でロット提案を行った後、チェックを行う。
		 * 
		 * @return チェックメッセージ
		 */
		protected MCMessageList checkLotAltMix() {
			MCMessageList msgL = new MCMessageList();
			
			// 投入実績とロス実績をあわせて処理対象とする
			MCList<MfgActRecvIf_Upd02_ActLstR> inptL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
			inptL.addAll(_inptActL);
			inptL.addAll(_lossActL);
			
			// 処理対象の投入予定を取得
			MCList<MST_INPT_SCHD_R> schdL = MCList.create(MST_INPT_SCHD_R.class);
			MST_INPT_SCHD_R schdL_t = MST_INPT_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(schdL_t);
			schdL_bldr.setSelect(schdL_t.inpt_schd_no);
			schdL_bldr.addSelect(schdL_t.lot_mix_flg);
			schdL_bldr.addSelect(schdL_t.sublot_mix_flg);
			schdL_bldr.addSelect(schdL_t.alt_itm_typ);
			schdL_bldr.addSelect(schdL_t.alt_grp_cd);
			schdL_bldr.addSelect(schdL_t.alt_grp_seq);
			dbSelectKey("MSLAL6220_MST_INPT_SCHD_S02", schdL, schdL_bldr, inptL);
			MCIndexKey schdKey = schdL.createIndex(MST_INPT_SCHD_R.$inpt_schd_no);
			
			MCList<MfgActRecvIf_Upd02_ActLstR> crtUpdL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);    // 削除行を除外した対象リスト
			MCList<MfgActRecvIf_Upd02_ActLstR> lotTgtL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);    // ロット・サブロット混在チェック対象リスト
			MCList<MfgActRecvIf_Upd02_ActLstR> altItmTgtL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class); // 代替品目混在チェックリスト
			MCList<MfgActRecvIf_Upd02_ActLstR> excldL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);   // 投入実績の抽出対象外となるリスト

			// 代替品目チェック用の一時カラムを追加
			inptL.addStringColumn("alt_grp_cd");
			inptL.addNumberColumn("alt_grp_seq");
			inptL.addBooleanColumn("lot_mix_flg");
			inptL.addBooleanColumn("sublot_mix_flg");

			// チェック対象のリストを取得
			for (MfgActRecvIf_Upd02_ActLstR r : inptL) {
				
				// 投入実績ＮＯが設定されている行（更新・削除行）を投入実績の抽出対象外リストに追加
				if (!isNull(r.inpt_act_no())) {
					excldL.add(r);
				}
				
				// 削除行を除外
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				
				// 削除行を除外したリストに追加
				crtUpdL.add(r);
				
				// 計画外投入（投入予定ＮＯがnull）の場合は除外（混在チェックしない）
				if (isNull(r.inpt_schd_no())) {
					continue;
				}
				
				// 品目マスタを取得
				MAM_ITM_R itmR = MAM_ITM_R.create();
				if (_cacheItmL != null) {
					itmR = _cacheItmL.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				}
				
				// 投入予定を取得
				MST_INPT_SCHD_R schdR = schdL.getFirst(schdKey, r.inpt_schd_no());
				
				// 一時カラムに値を設定
				r.setString("alt_grp_cd", schdR.alt_grp_cd());
				r.setNumber("alt_grp_seq", schdR.alt_grp_seq());
				r.setBoolean("lot_mix_flg", schdR.lot_mix_flg());
				r.setBoolean("sublot_mix_flg", schdR.sublot_mix_flg());
				
				// ロット・サブロット混在チェック対象（ロット対象外ではなくロット混在不可、またはサブロット対象ではなくサブロット混在不可）の抽出
				// ロット・サブロットがnullの場合は後続（MSBCL6060）でロット提案されるため、チェック対象外
				if ((!MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ()) && !schdR.lot_mix_flg() && !isNullOrNullVal(r.lot_no()))
							|| (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())
									&& !schdR.sublot_mix_flg() && !isNullOrNullVal(r.sublot_no()))) {
					lotTgtL.add(r);
				}
				
				// 代替品目混在チェック対象（代替品目区分が混在不可（最古入庫日優先または引当優先順）かつ代替品目指定がオン）の抽出
				if (MAC_ALT_ITM_TYP.isMONO_FIFO(schdR.alt_itm_typ())
							|| MAC_ALT_ITM_TYP.isMONO_PRIO(schdR.alt_itm_typ())) {
					altItmTgtL.add(r);
				}
			}
			
			// ロット・サブロット混在チェック対象、代替品目混在チェック対象がいずれも存在しない場合、何もしない
			if (lotTgtL.isEmpty() && altItmTgtL.isEmpty()) {
				return msgL;
			}
			
			// 処理対象の投入実績ＮＯを投入実績のワークテーブルに格納
			MCList<MST_INPT_ACT_R> insL = MCList.create(MST_INPT_ACT_R.class);
			MST_INPT_ACT_R insL_t = MST_INPT_ACT_R.create("T");
			MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(insL_t);
			for(MfgActRecvIf_Upd02_ActLstR r : excldL.groupBy(MfgActRecvIf_Upd02_ActLstR.$inpt_act_no)) {
				MST_INPT_ACT_R dbcR = MST_INPT_ACT_R.create();
				dbcR.inpt_act_no(r.inpt_act_no());
				insL.add(dbcR);
			}
			if(!insL.isEmpty()) {
				dbWkDelete("MSLAL6220_MSW_INPT_ACT_D01", insL_bldr.getBaseDbc());
				dbWkInsert("MSLAL6220_MSW_INPT_ACT_I01", insL, insL_bldr.getBaseDbc());
			}

			// チェック対象の投入と同じ製造指図に紐付く投入実績を抽出（処理対象に含まれるものは除く）
			MCList<MST_INPT_ACT_R> dbcL = MCList.create(MST_INPT_ACT_R.class);
			MST_INPT_ACT_R dbcL_t = MST_INPT_ACT_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(dbcL_t);
			MST_INPT_SCHD_R t1 = MST_INPT_SCHD_R.create("T1");
			MSW_INPT_ACT_KEY_R S1T2 = MSW_INPT_ACT_KEY_R.create("T2");
			dbcL_bldr.setSelect(dbcL_t.div_seq, dbcL_t.itm_cd, dbcL_t.itm_sub1,
					dbcL_t.itm_sub2, dbcL_t.itm_sub3, dbcL_t.lot_no, dbcL_t.sublot_no,
					dbcL_t.base_unit_inpt_qty, dbcL_t.base_unit_loss_qty,
					dbcL_t.base_unit_fxd_loss_qty);
			dbcL_bldr.addSelect(t1.oper_inst_no, t1.alt_grp_cd, t1.alt_grp_seq);
			dbcL_bldr.addInnerJoin(t1, bracket(t1.inpt_schd_no.eq(dbcL_t.inpt_schd_no)));
			dbcL_bldr.addWhereWithAnd(notExists(subQuery().select(S1T2.inpt_act_no)
					.from(S1T2).where(S1T2.inpt_act_no.eq(dbcL_t.inpt_act_no))));
			dbcL_bldr.addWhereWithAnd(t1.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbSelect("MSLAL6220_MST_INPT_ACT_S02", dbcL, dbcL_bldr,
					inptL.groupBy(MfgActRecvIf_Upd02_ActLstR.$mfg_inst_no));
			
			// ロット・サブロット混在チェック
			if (!lotTgtL.isEmpty()) {
				msgL.addAll(chkLotMix(crtUpdL, dbcL, lotTgtL));
			}

			// 代替品目混在チェック
			if (!altItmTgtL.isEmpty()) {
				msgL.addAll(chkAltItmMix(crtUpdL, dbcL, altItmTgtL));
			}
			
			return msgL;
		}

		/**
		 * ロット・サブロット混在チェック
		 * @param crtUpdL 削除行を除外した処理対象リスト
		 * @param dbcL 投入実績のテーブルデータ（処理対象リストに存在するレコードは除く）
		 * @param tgtL 混在チェック対象リスト
		 * @return メッセージリスト
		 */
		protected MCMessageList chkLotMix(MCList<MfgActRecvIf_Upd02_ActLstR> crtUpdL,
				MCList<MST_INPT_ACT_R> dbcL,
				MCList<MfgActRecvIf_Upd02_ActLstR> tgtL) {

			MCMessageList msgL = new MCMessageList();

			// 同一工程指図ＮＯ、分割連番内の同一品目で上り電文のロット・サブロットの混在をチェックするためのindexKey
			MCIndexKey inptKey = crtUpdL.createIndex(
					MfgActRecvIf_Upd02_ActLstR.$oper_inst_no,
					MfgActRecvIf_Upd02_ActLstR.$div_seq,
					MfgActRecvIf_Upd02_ActLstR.$itm_cd,
					MfgActRecvIf_Upd02_ActLstR.$itm_sub1,
					MfgActRecvIf_Upd02_ActLstR.$itm_sub2,
					MfgActRecvIf_Upd02_ActLstR.$itm_sub3);

			// 同一工程指図ＮＯ、分割連番内の同一品目でテーブルのロット・サブロットの混在をチェックするためのindexKey
			MCIndexKey dbcKey = dbcL.createIndex(
					"oper_inst_no",
					MST_INPT_ACT_R.$div_seq,
					MST_INPT_ACT_R.$itm_cd,
					MST_INPT_ACT_R.$itm_sub1,
					MST_INPT_ACT_R.$itm_sub2,
					MST_INPT_ACT_R.$itm_sub3);

			// 上り電文に対するチェック
			for (MfgActRecvIf_Upd02_ActLstR r : tgtL) {
				if (r.base_unit_inpt_qty().isZero()) {
					continue;
				}
				
				// 上り電文から同一工程指図内の同一品目を抽出
				MCList<MfgActRecvIf_Upd02_ActLstR> crtUpdSubL = crtUpdL.subList(inptKey,
						r.oper_inst_no(), r.div_seq(), r.itm_cd(), r.itm_sub1(),
						r.itm_sub2(), r.itm_sub3());

				// テーブルから同一工程指図内の同一品目を抽出（IFは必ず分割連番=1）
				MCList<MST_INPT_ACT_R> dbcSubL = dbcL.subList(dbcKey,
						r.oper_inst_no(), MCNumber.ONE, r.itm_cd(), r.itm_sub1(),
						r.itm_sub2(), r.itm_sub3());

				// ロット混在チェック
				if (!r.getBoolean("lot_mix_flg")) {
					for (MfgActRecvIf_Upd02_ActLstR subR : crtUpdSubL) {
						if (subR.base_unit_inpt_qty().isZero()) {
							continue;
						}
						
						if (!isSame(r.lot_no(), subR.lot_no()) && !isNullOrNullVal(subR.lot_no())) {
							msgL.add(new MCMessage(r, null, MSLAL0465, r.data_no(), r.data_lno(), r.inpt_schd_no()));
							r.err_flg(true);
							break;
						}
					}
					for (MST_INPT_ACT_R subR : dbcSubL) {
						if (subR.base_unit_inpt_qty().isZero()) {
							continue;
						}
						
						if (!isSame(r.lot_no(), subR.lot_no())) {
							msgL.add(new MCMessage(r, null, MSLAL0465, r.data_no(), r.data_lno(), r.inpt_schd_no()));
							r.err_flg(true);
							break;
						}
					}
				}

				// サブロット混在チェック
				if (!r.getBoolean("sublot_mix_flg")) {
					for (MfgActRecvIf_Upd02_ActLstR subR : crtUpdSubL) {
						if (subR.base_unit_inpt_qty().isZero()) {
							continue;
						}
						
						if (isSame(r.lot_no(), subR.lot_no())
								&& !isSame(r.sublot_no(), subR.sublot_no()) && !isNullOrNullVal(subR.sublot_no())) {
							msgL.add(new MCMessage(r, null, MSLAL0466, r.data_no(), r.data_lno(), r.inpt_schd_no()));
							r.err_flg(true);
							break;
						}
					}
					for (MST_INPT_ACT_R subR : dbcSubL) {
						if (subR.base_unit_inpt_qty().isZero()) {
							continue;
						}
						
						if (isSame(r.lot_no(), subR.lot_no())
								&& !isSame(r.sublot_no(), subR.sublot_no())) {
							msgL.add(new MCMessage(r, null, MSLAL0466, r.data_no(), r.data_lno(), r.inpt_schd_no()));
							r.err_flg(true);
							break;
						}
					}
				}
			}
			return msgL;
		}

		/**
		 * 代替品目混在チェック
		 * @param crtUpdL 削除行を除外した処理対象リスト
		 * @param dbcL 投入実績のテーブルデータ（処理対象リストに存在するレコードは除く）
		 * @param tgtL 混在チェック対象リスト
		 * @return メッセージリスト
		 */
		protected MCMessageList chkAltItmMix(MCList<MfgActRecvIf_Upd02_ActLstR> crtUpdL,
				MCList<MST_INPT_ACT_R> dbcL,
				MCList<MfgActRecvIf_Upd02_ActLstR> tgtL) {

			MCMessageList msgL = new MCMessageList();

			// 同一工程指図内の代替Ｇで上り電文の品目の混在をチェックするためのindexKey
			MCIndexKey inptKey = crtUpdL.createIndex(
					MfgActRecvIf_Upd02_ActLstR.$oper_inst_no,
					MfgActRecvIf_Upd02_ActLstR.$div_seq,
					"alt_grp_cd",
					"alt_grp_seq");

			// 同一工程指図内の代替Ｇでテーブルの品目の混在をチェックするためのindexKey
			MCIndexKey dbcKey = dbcL.createIndex(
					"oper_inst_no",
					MST_INPT_ACT_R.$div_seq,
					"alt_grp_cd",
					"alt_grp_seq");

			// 上り電文に対するチェック
			for (MfgActRecvIf_Upd02_ActLstR r : tgtL) {
				if (r.base_unit_inpt_qty().isZero()) {
					continue;
				}
				// 上り電文から同一代替Ｇの品目を抽出
				MCList<MfgActRecvIf_Upd02_ActLstR> crtUpdSubL = crtUpdL.subList(inptKey,
						r.oper_inst_no(), r.div_seq(), r.getString("alt_grp_cd"), r.getNumber("alt_grp_seq"));

				// テーブルから同一代替Ｇの品目を抽出（IFは必ず分割連番=1）
				MCList<MST_INPT_ACT_R> dbcSubL = dbcL.subList(dbcKey,
						r.oper_inst_no(), MCNumber.ONE, r.getString("alt_grp_cd"), r.getNumber("alt_grp_seq"));

				// 代替Ｇ内の品目混在チェック
				for (MfgActRecvIf_Upd02_ActLstR subR : crtUpdSubL) {
					if (subR.base_unit_inpt_qty().isZero()) {
						continue;
					}
					if (!isSame(r.inpt_schd_no(), subR.inpt_schd_no())
							&& (!isSame(r.itm_cd(), subR.itm_cd())
									|| !isSame(r.itm_sub1(), subR.itm_sub1())
									|| !isSame(r.itm_sub2(), subR.itm_sub2())
									|| !isSame(r.itm_sub3(), subR.itm_sub3()))) {
						msgL.add(new MCMessage(r, null, MSLAL0467, r.data_no(), r.data_lno(), r.inpt_schd_no()));
						r.err_flg(true);
						break;
					}
				}
				for (MST_INPT_ACT_R subR : dbcSubL) {
					if (subR.base_unit_inpt_qty().isZero()) {
						continue;
					}
					if (!isSame(r.inpt_schd_no(), subR.inpt_schd_no())
							&& (!isSame(r.itm_cd(), subR.itm_cd())
									|| !isSame(r.itm_sub1(), subR.itm_sub1())
									|| !isSame(r.itm_sub2(), subR.itm_sub2())
									|| !isSame(r.itm_sub3(), subR.itm_sub3()))) {
						msgL.add(new MCMessage(r, null, MSLAL0467, r.data_no(), r.data_lno(), r.inpt_schd_no()));
						r.err_flg(true);
						break;
					}
				}
			}
			return msgL;
		}

		/**
		 * ロス実績の登録可能をチェックする。
		 * なお、親投入、ロス理由ＣＤを特定する必要があります。
		 * @return チェックメッセージ
		 */
		protected MCMessageList checkLossAct() {
			if (isNull(_lossActL)) {
				return null;
			}

			MCMessageList msgL = new MCMessageList();

			// 親の投入の特定
			msgL.addAll(specLossParent());

			// ロス理由ＣＤのチェックや特定
			msgL.addAll(checkLossRsnCd());

			return msgL;
		}

		/**
		 * ロス実績の親を特定する。
		 * @return チェックメッセージ
		 */
		protected MCMessageList specLossParent() {
			MCMessageList msgL = new MCMessageList();

			MCIndexKey inptIdx = null;
			if (!_inptActL.isEmpty()) {
				inptIdx = _inptActL.createIndex(MfgActRecvIf_Upd02_ActLstR.$ext_inpt_act_no, MfgActRecvIf_Upd02_ActLstR.$ext_sys_cd);
			}

			String mfgInstNo = null;
			for (MfgActRecvIf_Upd02_ActLstR lossR : _lossActL) {
				if (isNull(lossR.act_tm())) {
					lossR.act_tm(getToday());
				}

				// 製造指図ＮＯ毎に、キャッシュデータのインデックスを生成する。
				if (!isSame(mfgInstNo, lossR.mfg_inst_no())) {
					mfgInstNo = lossR.mfg_inst_no();
					createSchdIndex(mfgInstNo);
					createActIndex(lossR.mfg_act_no());
				}

				// 1. 親となる受信投入実績を特定する。
				if (specRecvParentInpt(lossR, inptIdx)) {
					continue;
				}

				// 2. 投入実績ＮＯを特定する。
				msgL.add(specLossInptActNo(lossR));
				if (!isNull(lossR.inpt_act_no())) {
					continue;
				}
				else if (!MAC_DATA_CRUD_TYP.isCRT(lossR.data_crud_typ()) ) {
					// 訂正や取消の場合、投入実績は必ず存在する。
					setErrFlag(lossR);
					msgL.add(new MCMessage(lossR, null, MSLAL0127, lossR.data_no(), lossR.data_lno(), lossR.ext_inpt_act_no(), lossR.ext_sys_cd()));
					continue;
				}

				// 3. 投入予定ＮＯを特定する。
				msgL.add(specLossInptSchdNo(lossR));
			}

			return msgL;
		}

		protected boolean specRecvParentInpt(MfgActRecvIf_Upd02_ActLstR lossR, MCIndexKey inptIdx) {
			if (inptIdx == null) {
				return false;
			}

			MfgActRecvIf_Upd02_ActLstR piR = _inptActL.getFirst(inptIdx, lossR.ext_inpt_act_no(), lossR.ext_sys_cd());
			if (piR == null) {
				return false;
			}

			lossR.inpt_schd_no(piR.inpt_schd_no());
			lossR.inpt_act_no(piR.inpt_act_no());
			lossR.itm_cd(piR.itm_cd());
			lossR.itm_sub1(piR.itm_sub1());
			lossR.itm_sub2(piR.itm_sub2());
			lossR.itm_sub3(piR.itm_sub3());
			lossR.oper_act_no(piR.oper_act_no());

			return true;
		}

		protected MCMessage specLossInptActNo(MfgActRecvIf_Upd02_ActLstR lossR) {
			MST_INPT_ACT_R actR = null;

			if (!isNull(lossR.inpt_act_no())) {
				actR = getDBInptAct(lossR.inpt_act_no());
			}
			else if (_inptActIdx != null) {
				actR = (MST_INPT_ACT_R)getTargetInptAct(lossR);
			}

			if (actR != null && !isNull(actR.inpt_act_no())) {
				// 投入実績ＮＯ
				lossR.inpt_act_no(actR.inpt_act_no());
				// 工程実績ＮＯ
				lossR.oper_act_no(actR.oper_act_no());
				// 外部実績数を再設定
				lossR.ext_act_cnt(nvl(actR.getNumberNE("ext_act_cnt"), MCNumber.ZERO));

				// 品目ＣＤ、枝番１～３
				if (isNull(lossR.itm_cd())) {
					lossR.itm_cd(actR.itm_cd());
					lossR.itm_sub1(actR.itm_sub1());
					lossR.itm_sub2(actR.itm_sub2());
					lossR.itm_sub3(actR.itm_sub3());
				}
				else if (!isSame(lossR.itm_cd(), actR.itm_cd()) || !isSame(lossR.itm_sub1(), actR.itm_sub1()) || 
						 !isSame(lossR.itm_sub2(), actR.itm_sub2()) || !isSame(lossR.itm_sub3(), actR.itm_sub3())) {
					// ロス品目と投入実績品目と一致しません。
					setErrFlag(lossR);
					return (new MCMessage(lossR, null, MSLAL0130, lossR.data_no(), lossR.data_lno(), 
											toDispItm(lossR.itm_cd(), lossR.itm_sub1(), lossR.itm_sub2(), lossR.itm_sub3()), 
											toDispItm(actR.itm_cd(), actR.itm_sub1(), actR.itm_sub2(), actR.itm_sub3())));
				}
			}

			return null;
		}

		protected MCMessage specLossInptSchdNo(MfgActRecvIf_Upd02_ActLstR lossR) {
			specInptSchdNo(lossR);
			if (!isNull(lossR.inpt_schd_no())) {
				MST_INPT_SCHD_R schdR = (MST_INPT_SCHD_R)getSchdRCache(getCacheKey(MAC_IF_PROC_TYP.MES_INPT_SCHD_SEND.value(), lossR.inpt_schd_no()));
				if (schdR == null || isNull(schdR.inpt_schd_no())) {
					// 指定された投入予定ＮＯが削除されました。
					setErrFlag(lossR);
					return (new MCMessage(lossR, null, MSLAL0091, lossR.data_no(), lossR.data_lno(), lossR.inpt_schd_no()));
				}
				// 実績計上可能な投入予定かどうかをチェック
				MCMessage msg = checkCanActInptSchd(lossR, schdR);
				if (msg != null) {
					return msg;
				}
				
				// 品目ＣＤ、枝番１～３
				if (isNull(lossR.itm_cd())) {
					lossR.itm_cd(schdR.itm_cd());
					lossR.itm_sub1(schdR.itm_sub1());
					lossR.itm_sub2(schdR.itm_sub2());
					lossR.itm_sub3(schdR.itm_sub3());
				}
				else if (!isSame(lossR.itm_cd(), schdR.itm_cd()) || !isSame(lossR.itm_sub1(), schdR.itm_sub1()) || 
						 !isSame(lossR.itm_sub2(), schdR.itm_sub2()) || !isSame(lossR.itm_sub3(), schdR.itm_sub3())) {
					// ロス品目と投入予定品目と一致しません。
					setErrFlag(lossR);
					return (new MCMessage(lossR, null, MSLAL0130, lossR.data_no(), lossR.data_lno(), 
							 lossR.itm_cd(), lossR.itm_sub1(), lossR.itm_sub2(), lossR.itm_sub3(), 
							 schdR.itm_cd(), schdR.itm_sub1(), schdR.itm_sub2(), schdR.itm_sub3()));
				}
			}
			else if (isNull(lossR.itm_cd())) {
				// 追加ロスのみの場合、品目を指定する必要があります。
				setErrFlag(lossR);
				return (new MCMessage(lossR, null, MSLAL0131, lossR.data_no(), lossR.data_lno()));
			}

			// 取込対象の製造指図ＮＯ以外、他の製造指図に同じ外部投入実績ＮＯのデータがある場合、エラーとする。
			if (MAC_DATA_CRUD_TYP.isCRT(lossR.data_crud_typ()) && lossR.ext_act_cnt() != null && lossR.ext_act_cnt().gt(0)) {
				setErrFlag(lossR);
				return (new MCMessage(lossR, null, MSLAL0110, lossR.data_no(), lossR.data_lno(), lossR.ext_inpt_act_no(), lossR.ext_sys_cd()));
			}

			return null;
		}

		/**
		 * ロス理由ＣＤの適性をチェックする。
		 * 
		 * @return
		 */
		protected MCMessageList checkLossRsnCd() {
			MCMessageList msgL = new MCMessageList();

			_lossRsnMstMap = new HashMap<String, MCList<MCRow>>();							// キー：品目ＣＤ、枝番１～３
			_lossActDBMap = new HashMap<String, MCList<MST_LOSS_ACT_R>>();			// キー：外部投入実績ＮＯ
			_lossActRecvMap = new HashMap<String, MCList<MfgActRecvIf_Upd02_ActLstR>>();	// キー：外部投入実績ＮＯ

			MCList<MfgActRecvIf_Upd02_ActLstR> errLossL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);

			for (MfgActRecvIf_Upd02_ActLstR lossR : _lossActL) {
				if (lossR.err_flg() || _errMfgInstNoS.contains(lossR.mfg_inst_no())) {
					errLossL.add(lossR);
					continue;
				}

				String lossItm = getLossItmKey(lossR);

				// 品目のロス理由定義情報を取得
				msgL.add(getLossRsnMstDef(lossR, lossItm));

				// 登録済のロス実績を取得
				getLossActInDB(lossR);

				// 受信したロス実績を「外部投入実績ＮＯ」でグループ化：
				grpLossActRecvData(lossR, lossR.ext_inpt_act_no());
			}

			// ロス実績の正確性をチェックする。
			_lossActL.setAll(errLossL);
			msgL.addAll(checkLossActAccuracy());

			return msgL;
		}

		protected MCMessage getLossRsnMstDef(MfgActRecvIf_Upd02_ActLstR lossR, String itmKey) {
			if (_lossRsnMstMap.containsKey(itmKey)) {
				return null;
			}

			MSUCL_ProdListLogic prodUtil = new MSUCL_ProdListLogic();
			MCList<MCRow> result = prodUtil._getLossRsnList(lossR);
			if (isNull(result)) {
				// 品目にロス理由定義がないため、ロス実績を登録できません。
				setErrFlag(lossR);
				return (new MCMessage(lossR, null, MSLAL0132, lossR.data_no(), lossR.data_lno(), 
										toDispItm(lossR.itm_cd(), lossR.itm_sub1(), lossR.itm_sub2(), lossR.itm_sub3())));
			}

			_lossRsnMstMap.put(itmKey, result);

			return null;
		}

		protected void getLossActInDB(MfgActRecvIf_Upd02_ActLstR lossR) {
			// 投入実績が存在しない場合、取得する必要がありません。
			if (isNull(lossR.inpt_act_no())) {
				return;
			}

			// 同じ外部投入実績ＮＯのロスは既に取得済みの場合、2度目以降は必要ない
			if (_lossActDBMap.containsKey(lossR.ext_inpt_act_no())) {
				return;
			}

			MCList<MST_LOSS_ACT_R> lossActL = getLossActL(lossR.ext_inpt_act_no());

			_lossActDBMap.put(lossR.ext_inpt_act_no(), lossActL);
		}

		protected MCList<MST_LOSS_ACT_R> getLossActL(String extInptActNo) {
			MCList<MST_LOSS_ACT_R> lossActL = MCList.create(MST_LOSS_ACT_R.class);
			MST_LOSS_ACT_R t = MST_LOSS_ACT_R.create("T");
			MCQueryApiBuilder lossActL_bldr = MCQueryApiBuilder.create(t);
			MST_INPT_ACT_R S1TI = MST_INPT_ACT_R.create("TI");

			lossActL_bldr.setSelect(t.loss_act_no);
			lossActL_bldr.addSelect(t.inpt_act_no);
			lossActL_bldr.addSelect(t.loss_rsn_cd);
			lossActL_bldr.addSelect(t.base_unit_qty);
			lossActL_bldr.addSelect(t.cont_qty);
			lossActL_bldr.addSelect(t.fxd_loss_flg);
			lossActL_bldr.addSelect(t.intr_rmrks);
			lossActL_bldr.addSelect(t.trd_rmrks);
			lossActL_bldr.addSelect(t.sub_char1);
			lossActL_bldr.addSelect(t.sub_char2);
			lossActL_bldr.addSelect(t.sub_char3);

			lossActL_bldr.setWhere(t.inpt_act_no.in(subQuery().select(S1TI.inpt_act_no).from(S1TI).where(S1TI.ext_inpt_act_no.eq(bind("1")))), extInptActNo);
			dbSelect("MSLAL6220_MST_LOSS_ACT_S01", lossActL, lossActL_bldr);

			return lossActL;
		}

		protected void grpLossActRecvData(MfgActRecvIf_Upd02_ActLstR lossR, String laKey) {
			MCList<MfgActRecvIf_Upd02_ActLstR> laL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);

			if (_lossActRecvMap.containsKey(laKey)) {
				laL = _lossActRecvMap.get(laKey);
			}

			// ロス実績の訂正、且つ、ロス理由ＣＤが変わった場合、「取消＋新規」へ置き換える
			if (!isNull(lossR.inpt_act_no()) && MAC_DATA_CRUD_TYP.isUPD(lossR.data_crud_typ()) && 
				!isNull(lossR.old_loss_rsn_cd()) && !isSame(lossR.old_loss_rsn_cd(), lossR.loss_rsn_cd())) {
				// 受信ロスにより、実績削除行を追加作成
				MfgActRecvIf_Upd02_ActLstR ldR = lossR.clone();
				ldR.loss_rsn_cd(lossR.old_loss_rsn_cd());
				ldR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				ldR.setStatus(Status.DELETE);
				ldR.chk_add_flg(true);
				laL.add(ldR);
				// 受信ロス実績の行
				lossR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				lossR.setStatus(Status.CREATE);
				laL.add(lossR);
			}
			else {
				laL.add(lossR);
			}

			_lossActRecvMap.put(laKey, laL);
		}

		/**
		 * ロス実績のデータ整合性チェック、及び、補完を行う。<br>
		 * 1. ロス理由ＣＤは重複なし, 2. ロス理由マスタにあり, 3. 新規・訂正・取消可能
		 * @return
		 */
		protected MCMessageList checkLossActAccuracy() {
			MCMessageList msgL = new MCMessageList();

			MCIndexKey inptIdx = null;
			if (!_inptActL.isEmpty()) {
				inptIdx = _inptActL.createIndex(MfgActRecvIf_Upd02_ActLstR.$inpt_act_no);
			}

			for (Map.Entry<String, MCList<MfgActRecvIf_Upd02_ActLstR>> entry : _lossActRecvMap.entrySet()) {
				// 1.1. 受信ロス実績
				MCList<MfgActRecvIf_Upd02_ActLstR> lossL = entry.getValue();
				MfgActRecvIf_Upd02_ActLstR lossRecvR = lossL.get(0);

				// 投入実績がロット提案により分割フラグ
				boolean isInptSplited = false;
				if (lossRecvR.ext_act_cnt() != null && lossRecvR.ext_act_cnt().gt(1)) {
					isInptSplited = true;
				}

				// 1.2. ロス理由マスタ定義
				MCList<MCRow> lrsnL = _lossRsnMstMap.get(getLossItmKey(lossRecvR));
				if (isNull(lrsnL)) {
					_lossActL.addAll(lossL);
					continue;
				}

				// 1.3. ＤＢロス実績（登録済）、親投入
				MST_INPT_ACT_R dbInptActR = null;
				MCList<MST_LOSS_ACT_R> ldbaL = null;
				MfgActRecvIf_Upd02_ActLstR inptRecvR = null;
				String inptActNo = lossRecvR.inpt_act_no();
				if (!isNull(inptActNo)) {
					// ＤＢロス実績
					ldbaL = _lossActDBMap.get(lossRecvR.ext_inpt_act_no());
					// ＤＢ投入実績
					dbInptActR = getDBInptAct(inptActNo);
					// 受信投入実績
					if (inptIdx != null) {
						inptRecvR = _inptActL.getFirst(inptIdx, inptActNo);
					}
					// ロス実績補完済とみなす。
					_inptLossOKS.add(lossRecvR.ext_inpt_act_no());
				}

				// 投入実績があり、かつ、受信がない場合、投入の取消追加は可能とする。
				boolean isDelAllLoss = false;
				if (!isNull(inptActNo) && inptRecvR == null) {
					isDelAllLoss = true;
				}

				// 2.0. ロス実績の整合性チェック
				boolean lossNoErr = true;
				Set<String> lossActNoS = new HashSet<String>();
				Map<String, MCNumber> crtMap = new HashMap<String, MCNumber>();
				Map<String, MCNumber> delMap = new HashMap<String, MCNumber>();
				for (MfgActRecvIf_Upd02_ActLstR lossR : lossL) {
					// 2.1. ロス理由ＣＤに対して、1. 補完、2. 存在チェック、3. 重複なしチェック
					msgL.add(checkLossRsnCdUnique(lossR, lrsnL, crtMap, delMap));
					// 2.2. 新規：同じロス理由のロス実績が存在しない。訂正・取消：ロス実績が存在し、ロス実績ＮＯを補完可能。
					msgL.add(checkLossActModifiable(lossR, ldbaL, crtMap, delMap));

					// 2.3. チェック結果１：ロス取消のみ受信判断
					if (isDelAllLoss && (lossR.err_flg() || !MAC_DATA_CRUD_TYP.isDEL(lossR.data_crud_typ()))) {
						isDelAllLoss = false;
					}
					// 2.3. チェック結果２：ロスエラーなしフラグ
					if (lossNoErr && lossR.err_flg()) {
						lossNoErr = false;
					}
					// 2.3. チェック結果１：訂正／取消のロス実績ＮＯを記憶（未受信のロス実績を補完するため）
					if (lossNoErr && !isNull(lossR.loss_act_no())) {
						lossActNoS.add(lossR.loss_act_no());
					}
				}

				// 3.0. 投入、または、ロスを補完する。
				// 3.1. ロス全取消を受信、親となる投入は未受信の場合、投入を取消として補完する。
				if (isDelAllLoss && !isNull(ldbaL) && delMap.size() == ldbaL.size()) {
					if (dbInptActR.if_auto_reg_flg()) {
						lossL.addAll(getInptActPrntRstL(lossRecvR, null, false));
					}
					else if (isInptSplited) {
						lossL.addAll(getInptActPrntRstL(lossRecvR, null, true));
					}
				}
				// 3.2. ロス全取消を受信、親となる投入も受信した場合、分割投入実績であれば、補完する。
				else if (lossNoErr && !isNull(ldbaL) && delMap.size() == ldbaL.size()) {
					if (inptRecvR != null && !isNull(inptRecvR.inpt_act_no()) && isInptSplited) {
						// 親投入の取消を受信した場合、全取消となる。
						if (MAC_DATA_CRUD_TYP.isDEL(inptRecvR.data_crud_typ())) {
							lossL.addAll(getInptActPrntRstL(inptRecvR, inptRecvR.inpt_act_no(), false));
						}
						// 親投入の訂正を受信した場合、既存の投入実績を全て取消、新規として登録する。
						else {
							lossL.addAll(getInptActPrntRstL(inptRecvR, null, false));
							changeInptToCreate(inptRecvR, dbInptActR);
						}
					}
				}
				// 3.3. 未受信のロス実績があれば、補完する。
				else if (lossNoErr) {
					// 3.3.1. 未受信のロス実績を補完する。
					lossL.addAll(getLossNotRecvL(lossRecvR, ldbaL, lossActNoS));

					// 3.3.2. 親となる投入は必要に応じて補完する。
					if (isInptSplited) {
						// 分割投入実績の場合、ＤＥＬ＝＞ＩＮＳへ変更。（なお、投入のみ受信について、以降で処理する）
						MCList<MfgActRecvIf_Upd02_ActLstR> rsltL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
						// ロスのみ受信、投入：ＤＥＬ＝＞ＩＮＳ、
						if (inptRecvR == null || isNull(inptRecvR.inpt_act_no())) {
							rsltL.addAll(getInptActPrntRstL(lossRecvR, null, true));
						}
						// ロス以外、投入も受信
						else {
							if (MAC_DATA_CRUD_TYP.isDEL(inptRecvR.data_crud_typ())) {
								rsltL.addAll(getInptActPrntRstL(lossRecvR, inptRecvR.inpt_act_no(), false));
							}
							else {
								rsltL.addAll(getInptActPrntRstL(lossRecvR, null, false));
								changeInptToCreate(inptRecvR, dbInptActR);
							}
						}
						// ロス：ＤＥＬ＝＞ＩＮＳ
						rsltL.addAll(getLossActDelL(lossRecvR, ldbaL, lossL));
						rsltL.addAll(getLossActCrtL(lossRecvR, lossL));

						// ＤＥＬ＝＞ＩＮＳの結果を取込対象とする。
						lossL.setAll(rsltL);
					}
					else {
						// 投入実績が未分割、取消で受信した場合、「0」実績の更新へ変える。
						if (inptRecvR != null && MAC_DATA_CRUD_TYP.isDEL(inptRecvR.data_crud_typ())) {
							inptRecvR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
							inptRecvR.base_unit_inpt_qty(MCNumber.ZERO);
							inptRecvR.cont_qty (MCNumber.ZERO);
							inptRecvR.if_auto_reg_flg(true);
						}
					}
				}

				_lossActL.addAll(lossL);
			}

			return msgL;
		}

		/**
		 * ロス実績の受信、または、ロット提案により分割となった投入実績を再度受信により、<br>
		 * 登録済の投入実績を一旦取消してから、再度新規作成とする。<br>
		 * 
		 * @param recvR 受信レコード（補完コピー元）
		 * @param inptActNo 投入実績ＮＯ（補完対象外）
		 * @param reCreateFlg 投入実績再作成フラグ
		 * @return 補完すべて投入実績リスト
		 */
		protected MCList<MfgActRecvIf_Upd02_ActLstR> getInptActPrntRstL(MfgActRecvIf_Upd02_ActLstR recvR, String inptActNo, boolean reCreateFlg) {
			MCList<MfgActRecvIf_Upd02_ActLstR> irstL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);

			// 0. 受信レコードと同じ「外部システムＣＤ、外部投入実績ＮＯ」の投入実績を得る。
			MCList<MCRow> objL = null;
			MCList<MCRow> actL = getActLCache(getCacheKey(recvR.if_proc_typ(), recvR.mfg_act_no()));
			if (!isNull(actL)) {
				MCIndexKey idx = actL.createIndex(MST_INPT_ACT_R.$ext_inpt_act_no, MST_INPT_ACT_R.$ext_sys_cd);
				objL = actL.subList(idx, recvR.ext_inpt_act_no(), recvR.ext_sys_cd());
			}
			if (isNull(objL)) {
				return irstL;
			}

			MST_INPT_ACT_R remR = null;

			// 1. 投入実績を一旦取り消す。
			for (int i=0 ; i < objL.size() ; i++) {
				MST_INPT_ACT_R dbR = (MST_INPT_ACT_R)objL.get(i);
				if (inptActNo != null && isSame(dbR.inpt_act_no(), inptActNo)) {
					continue;
				}

				if (reCreateFlg) {
					if (remR == null) {
						remR = dbR;
					}
					else {
						remR.base_unit_inpt_qty(MCNumber.sum(remR.base_unit_inpt_qty(), dbR.base_unit_inpt_qty()));
						remR.acxfr_qty(MCNumber.sum(remR.acxfr_qty(), dbR.acxfr_qty()));
					}
				}

				MfgActRecvIf_Upd02_ActLstR addpR = recvR.clone();
				addpR.if_inpt_typ(MSC_IF_INPT_TYP.INPT.value());
				addpR.loss_rsn_cd(null);
				addpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				addpR.setStatus(Status.DELETE);
				addpR.chk_add_flg(true);

				addpR.inpt_act_no(dbR.inpt_act_no());
				addpR.oper_act_no(dbR.oper_act_no());
				addpR.act_tm(dbR.act_tm());
				addpR.can_ac_dt(dbR.ac_dt());
				addpR.ext_sys_cd(dbR.ext_sys_cd());
				addpR.ext_inpt_act_no(dbR.ext_inpt_act_no());

				irstL.add(addpR);
			}

			// 2. 投入実績の再度新規作成（ロット提案）にする。
			if (remR != null && !isNull(remR.base_unit_inpt_qty()) && remR.base_unit_inpt_qty().isPositive()) {
				irstL.add(getRecreateInptAct(recvR, remR));
			}

			return irstL;
		}

		protected MfgActRecvIf_Upd02_ActLstR getRecreateInptAct(MfgActRecvIf_Upd02_ActLstR recvR, MST_INPT_ACT_R dbR) {
			MfgActRecvIf_Upd02_ActLstR icrtR = recvR.clone();

			icrtR.if_inpt_typ(MSC_IF_INPT_TYP.INPT.value());
			icrtR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			icrtR.setStatus(Status.CREATE);
			icrtR.chk_add_flg(true);

			icrtR.inpt_act_no(null);							// 投入実績ＮＯ
			icrtR.loss_rsn_cd(null);							// ロス理由ＣＤ
			icrtR.oper_act_no(dbR.oper_act_no());				// 工程実績ＮＯ
			icrtR.inpt_schd_no(dbR.inpt_schd_no());				// 投入予定ＮＯ
			icrtR.ext_sys_cd(dbR.ext_sys_cd());					// 外部システムＣＤ
			icrtR.ext_inpt_act_no(dbR.ext_inpt_act_no());		// 外部投入実績ＮＯ
			icrtR.act_tm(dbR.act_tm());							// 実績日時
			icrtR.ac_dt(dbR.ac_dt());							// 計上日
			icrtR.can_ac_dt(dbR.ac_dt());						// 取消計上日
			icrtR.itm_cd(dbR.itm_cd());							// 品目ＣＤ
			icrtR.itm_sub1(dbR.itm_sub1());						// 枝番１
			icrtR.itm_sub2(dbR.itm_sub2());						// 枝番２
			icrtR.itm_sub3(dbR.itm_sub3());						// 枝番３
			icrtR.gd_cd(dbR.gd_cd());							// 格付ＣＤ
			icrtR.inpt_rsn_cd(dbR.inpt_rsn_cd());				// 投入理由ＣＤ
			icrtR.inpt_loc_cd(dbR.inpt_loc_cd());				// 投入場所ＣＤ
			icrtR.inpt_str_ln_cd(dbR.inpt_str_ln_cd());			// 投入棚・ラインＣＤ
			icrtR.base_unit_inpt_qty(dbR.base_unit_inpt_qty());	// 基準単位投入数量
			icrtR.acxfr_qty(dbR.acxfr_qty());					// 他勘定振替数量
			icrtR.acxfr_rsn_cd(dbR.acxfr_rsn_cd());				// 他勘定振替理由ＣＤ
			icrtR.acxfr_bd_dpt_cd(dbR.acxfr_bd_dpt_cd());		// 他勘定振替負担部門ＣＤ
			icrtR.act_intr_rmrks(dbR.intr_rmrks());				// 内部備考
			icrtR.inpt_act_rpt_rmrks(dbR.act_rpt_rmrks());		// 記録書備考
			icrtR.trd_rmrks(dbR.trd_rmrks());					// 取引備考
			icrtR.sub_char1(dbR.sub_char1());					// 予備１（実績）
			icrtR.sub_char2(dbR.sub_char2());					// 予備２（実績）
			icrtR.sub_char3(dbR.sub_char3());					// 予備３（実績）
			icrtR.if_auto_reg_flg(dbR.if_auto_reg_flg());		// ＩＦ自動作成
			
			return icrtR;
		}

		protected void changeInptToCreate(MfgActRecvIf_Upd02_ActLstR inptRecvR, MST_INPT_ACT_R dbR) {
			inptRecvR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			inptRecvR.setStatus(Status.CREATE);
			inptRecvR.inpt_act_no(null);
			if (dbR != null) {
				inptRecvR.can_ac_dt(dbR.ac_dt());		// 取消計上日
				inptRecvR.sub_char1(dbR.sub_char1());	// 予備１（実績）
				inptRecvR.sub_char2(dbR.sub_char2());	// 予備２（実績）
				inptRecvR.sub_char3(dbR.sub_char3());	// 予備３（実績）
			}
		}

		protected MCList<MfgActRecvIf_Upd02_ActLstR> getLossNotRecvL(MfgActRecvIf_Upd02_ActLstR lossR, MCList<MST_LOSS_ACT_R> ldbaL, Set<String> lossActNoS) {
			MCList<MfgActRecvIf_Upd02_ActLstR> lossL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
			if (isNull(ldbaL)) {
				return lossL;
			}

			for (MST_LOSS_ACT_R dblsR : ldbaL) {
				if (lossActNoS.contains(dblsR.loss_act_no())) {
					continue;
				}

				MfgActRecvIf_Upd02_ActLstR ulR = lossR.clone();
				if (dblsR.fxd_loss_flg()) {
					ulR.if_inpt_typ(MSC_IF_INPT_TYP.FXD_LOSS.value());
				}
				else {
					ulR.if_inpt_typ(MSC_IF_INPT_TYP.LOSS.value());
				}
				ulR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				ulR.setStatus(Status.MODIFY);
				ulR.inpt_act_no(dblsR.inpt_act_no());
				ulR.loss_act_no(dblsR.loss_act_no());
				ulR.loss_rsn_cd(dblsR.loss_rsn_cd());
				ulR.base_unit_inpt_qty(dblsR.base_unit_qty());
				ulR.cont_qty (dblsR.cont_qty());
				ulR.sub_char1(dblsR.sub_char1());
				ulR.sub_char2(dblsR.sub_char2());
				ulR.sub_char3(dblsR.sub_char3());
				ulR.chk_add_flg(true);
				lossL.add(ulR);
			}

			return lossL;
		}

		protected MCList<MfgActRecvIf_Upd02_ActLstR> getLossActDelL(MfgActRecvIf_Upd02_ActLstR recvR, 
																	MCList<MST_LOSS_ACT_R> ldbaL, 
																	MCList<MfgActRecvIf_Upd02_ActLstR> lossL) {
			MCList<MfgActRecvIf_Upd02_ActLstR> delL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);

			// 取消として受信したロス実績をそのままとする。
			Set<String> lanSet = new HashSet<String>();
			if (!isNull(lossL)) {
				for (MfgActRecvIf_Upd02_ActLstR lossR : lossL) {
					if (MAC_DATA_CRUD_TYP.isDEL(lossR.data_crud_typ()) && !isNull(lossR.loss_act_no())) {
						delL.add(lossR);
						lanSet.add(lossR.loss_act_no());
					}
				}
			}

			// 未受信のロス実績があれば、取消データとして追加する。
			if (isNull(ldbaL)) {
				return delL;
			}

			for (MST_LOSS_ACT_R dblsR : ldbaL) {
				if (lanSet.contains(dblsR.loss_act_no())) {
					continue;
				}

				MfgActRecvIf_Upd02_ActLstR ulR = recvR.clone();

				if (dblsR.fxd_loss_flg()) {
					ulR.if_inpt_typ(MSC_IF_INPT_TYP.FXD_LOSS.value());
				}
				else {
					ulR.if_inpt_typ(MSC_IF_INPT_TYP.LOSS.value());
				}
				ulR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				ulR.setStatus(Status.DELETE);
				ulR.inpt_act_no(dblsR.inpt_act_no());
				ulR.loss_act_no(dblsR.loss_act_no());
				ulR.loss_rsn_cd(dblsR.loss_rsn_cd());
				ulR.base_unit_inpt_qty(dblsR.base_unit_qty());
				ulR.cont_qty (dblsR.cont_qty());
				ulR.chk_add_flg(true);

				delL.add(ulR);
			}

			return delL;
		}

		protected MCList<MfgActRecvIf_Upd02_ActLstR> getLossActCrtL(MfgActRecvIf_Upd02_ActLstR recvR, MCList<MfgActRecvIf_Upd02_ActLstR> lossL) {
			MCList<MfgActRecvIf_Upd02_ActLstR> crtL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
			if (isNull(lossL)) {
				return crtL;
			}

			for (MfgActRecvIf_Upd02_ActLstR lossR : lossL) {
				if (MAC_DATA_CRUD_TYP.isDEL(lossR.data_crud_typ())) {
					continue;
				}

				MfgActRecvIf_Upd02_ActLstR ulR = recvR.clone();
				ulR.if_inpt_typ(ulR.if_inpt_typ());
				ulR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				ulR.setStatus(Status.CREATE);
				ulR.inpt_act_no(null);
				ulR.loss_act_no(null);
				ulR.loss_rsn_cd(lossR.loss_rsn_cd());
				ulR.base_unit_inpt_qty(lossR.base_unit_inpt_qty());
				ulR.cont_qty(lossR.cont_qty());
				ulR.chk_add_flg(lossR.chk_add_flg());
				ulR.sub_char1(lossR.sub_char1());
				ulR.sub_char2(lossR.sub_char2());
				ulR.sub_char3(lossR.sub_char3());

				crtL.add(ulR);
			}

			return crtL;
		}

		protected MCList<MfgActRecvIf_Upd02_ActLstR> getLossActCrtL2(MfgActRecvIf_Upd02_ActLstR recvR, MCList<MST_LOSS_ACT_R> ldbaL) {
			MCList<MfgActRecvIf_Upd02_ActLstR> crtL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
			if (isNull(ldbaL)) {
				return crtL;
			}

			for (MST_LOSS_ACT_R dblsR : ldbaL) {
				MfgActRecvIf_Upd02_ActLstR ulR = recvR.clone();

				if (dblsR.fxd_loss_flg()) {
					ulR.if_inpt_typ(MSC_IF_INPT_TYP.FXD_LOSS.value());
				}
				else {
					ulR.if_inpt_typ(MSC_IF_INPT_TYP.LOSS.value());
				}
				ulR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				ulR.setStatus(Status.CREATE);
				ulR.inpt_act_no(null);
				ulR.loss_act_no(null);
				ulR.loss_rsn_cd(dblsR.loss_rsn_cd());
				ulR.base_unit_inpt_qty(dblsR.base_unit_qty());
				ulR.cont_qty (dblsR.cont_qty());
				ulR.sub_char1(dblsR.sub_char1());
				ulR.sub_char2(dblsR.sub_char2());
				ulR.sub_char3(dblsR.sub_char3());
				ulR.chk_add_flg(true);

				crtL.add(ulR);
			}

			return crtL;
		}

		protected MCMessage checkLossRsnCdUnique(MfgActRecvIf_Upd02_ActLstR lossR, MCList<MCRow> lrsnL, 
												Map<String, MCNumber> crtMap, Map<String, MCNumber> delMap) {
			if (isNull(lossR.loss_rsn_cd())) {
				lossR.loss_rsn_cd(specLossRsnCd(lrsnL, MSC_IF_INPT_TYP.isFXD_LOSS(lossR.if_inpt_typ())));
				if (isNull(lossR.loss_rsn_cd())) {
					// ロス理由ＣＤが指定されない、補完できないため、ロス実績を登録できません。
					lossR.err_flg(true);
					setErrFlag(lossR);
					return (new MCMessage(lossR, null, MSLAL0133, lossR.data_no(), lossR.data_lno()));
				}
			}
			else {
				if (!isLossRsnCdExist(lrsnL, lossR.loss_rsn_cd())) {
					// 指定されたロス理由ＣＤがマスタに定義されていません。
					lossR.err_flg(true);
					setErrFlag(lossR);
					return (new MCMessage(lossR, null, MSLAL0134, lossR.data_no(), lossR.data_lno(), lossR.loss_rsn_cd()));
				}
			}

			if (MAC_DATA_CRUD_TYP.isCRT(lossR.data_crud_typ())) {
				if (crtMap.containsKey(lossR.loss_rsn_cd())) {
					// 同じロス理由ＣＤで２回以上ロス実績を登録できません。
					lossR.err_flg(true);
					setErrFlag(lossR);
					return (new MCMessage(lossR, null, MSLAL0135, crtMap.get(lossR.loss_rsn_cd()), lossR.data_lno(), lossR.loss_rsn_cd()));
				}

				crtMap.put(lossR.loss_rsn_cd(), lossR.data_lno());
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(lossR.data_crud_typ())) {
				if (delMap.containsKey(lossR.loss_rsn_cd())) {
					// 同じロス理由ＣＤで２回以上ロス実績を取り消せません。
					lossR.err_flg(true);
					setErrFlag(lossR);
					return (new MCMessage(lossR, null, MSLAL0136, delMap.get(lossR.loss_rsn_cd()), lossR.data_lno(), lossR.loss_rsn_cd()));
				}

				delMap.put(lossR.loss_rsn_cd(), lossR.data_lno());
			}

			return null;
		}

		protected MCMessage checkLossActModifiable(MfgActRecvIf_Upd02_ActLstR lossR, MCList<MST_LOSS_ACT_R> ldbaL, 
												Map<String, MCNumber> mdfMap, Map<String, MCNumber> delMap) {
			if (lossR.err_flg()) {
				return null;
			}

			// 予備をクリア
			lossR.clear(MfgActRecvIf_Upd02_ActLstR.$sub_char1, 
						MfgActRecvIf_Upd02_ActLstR.$sub_char2, 
						MfgActRecvIf_Upd02_ActLstR.$sub_char3);

			// 新規可能チェック
			if (MAC_DATA_CRUD_TYP.isCRT(lossR.data_crud_typ())) {
				if (isNull(ldbaL) || delMap.containsKey(lossR.loss_rsn_cd()) || getLossActNo(ldbaL, lossR) == null) {
					return null;
				}

				// 同じロス理由のロス実績が既に存在しています。
				lossR.err_flg(true);
				setErrFlag(lossR);
				return (new MCMessage(lossR, null, MSLAL0137, lossR.data_no(), lossR.data_lno(), lossR.loss_rsn_cd()));
			}

			// 訂正・取消変更可能チェック
			if (!isNull(ldbaL)) {
				lossR.loss_act_no(getLossActNo(ldbaL, lossR));
			}
			if (isNull(lossR.loss_act_no())) {
				// 訂正・取消対象となるロス実績が存在しません。
				lossR.err_flg(true);
				setErrFlag(lossR);
				return (new MCMessage(lossR, null, MSLAL0138, lossR.data_no(), lossR.data_lno(), lossR.ext_inpt_act_no(), lossR.ext_sys_cd(), lossR.loss_rsn_cd()));
			}

			return null;
		}

		protected String specLossRsnCd(MCList<MCRow> lrsnL, boolean isFxdLoss) {
			for (MCRow lR : lrsnL) {
				// 固定ロス実績なら、固定ロスのロス理由CDで補完
				if (isFxdLoss && lR.getBooleanNE("fxd_loss_flg")) {
					return lR.getStringNE("loss_rsn_cd");
				}
				// 通常ロス実績なら、初期表示がオンの理由CDで補完
				if (!isFxdLoss && lR.getBooleanNE("def_disp_flg")) {
					return lR.getStringNE("loss_rsn_cd");
				}
			}

			// 上記以外、補完できない
			return null;
		}

		protected boolean isLossRsnCdExist(MCList<MCRow> lrsnL, String lossRsnCd) {
			for (MCRow lR : lrsnL) {
				if (isSame(lR.getStringNE("loss_rsn_cd"), lossRsnCd)) {
					return true;
				}
			}

			return false;
		}

		protected String getLossActNo(MCList<MST_LOSS_ACT_R> ldbaL, MfgActRecvIf_Upd02_ActLstR lossR) {
			for (MST_LOSS_ACT_R aR : ldbaL) {
				if (isSame(aR.loss_rsn_cd(), lossR.loss_rsn_cd())) {
					lossR.inpt_act_no(aR.inpt_act_no());
					lossR.sub_char1(aR.sub_char1());
					lossR.sub_char2(aR.sub_char2());
					lossR.sub_char3(aR.sub_char3());
					return aR.loss_act_no();
				}
			}

			return null;
		}

		/**
		 * 取引単位ＣＤの補完とチェック
		 * @return チェックメッセージ
		 */
		protected MCMessageList checkTrd_unit_cd() {
			MCMessageList msgL = new MCMessageList();
			for (MfgActRecvIf_Upd02_ActLstR uR : up0().subList(MfgActRecvIf_Upd02_ActLstR.$err_flg, false)) {
				if (!MAC_DATA_CRUD_TYP.isDEL(uR.data_crud_typ()) && !uR.unschd_act_flg() && MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(uR.if_proc_typ())) {
					MST_YIELD_SCHD_R yieldSchdDBR = (MST_YIELD_SCHD_R) getSchdRCache(getCacheKey(MAC_IF_PROC_TYP.MES_YIELD_SCHD_SEND.value(), uR.yield_schd_no()));
					if (!isNull(yieldSchdDBR) && isNull(uR.trd_unit_cd()) && !isNull(yieldSchdDBR.trd_unit_cd())) {
						uR.trd_unit_cd(yieldSchdDBR.trd_unit_cd());
					}
					if (isNull(uR.trd_unit_cd())) {
						setErrFlag(uR);
						msgL.add(new MCMessage(uR, null, MSLAL0104, uR.data_no(), uR.data_lno()));
					}
				}
			}
			return msgL;
		}

		/**
		 * 投入の版ＮＯ（版管理対象の場合）、実績数量（有効成分対象）を補完する。
		 * 補完できない場合、エラーメッセージを作成する。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList cmplInptAndLoss() {
			MCMessageList msgL = new MCMessageList();

			// ＤＢ登録済のロス実績を補完する。
			cmplNotRecvLoss();

			// 版ＮＯと数量の補完対象（エラーなし、取消以外）を洗い出す。
			MCList<MfgActRecvIf_Upd02_ActLstR> srchL = getCmplInptTgtLst();

			// 投入品目のマスタ情報取得
			getItmMstCache(srchL);
			getItmLotCache(srchL);

			// 投入・ロスの数量や版NOを補完する。
			msgL.addAll(cmplInptQtyVerNo(_inptActL));
			msgL.addAll(cmplInptQtyVerNo(_lossActL));

			return msgL;
		}

		protected MCList<MfgActRecvIf_Upd02_ActLstR> getCmplInptTgtLst() {
			MCList<MfgActRecvIf_Upd02_ActLstR> srchL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);

			for (MfgActRecvIf_Upd02_ActLstR inptR : _inptActL) {
				if (inptR.err_flg() || _errMfgInstNoS.contains(inptR.mfg_inst_no())) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isDEL(inptR.data_crud_typ())) {
					continue;
				}

				srchL.add(inptR);
			}

			for (MfgActRecvIf_Upd02_ActLstR inptR : _lossActL) {
				if (inptR.err_flg() || _errMfgInstNoS.contains(inptR.mfg_inst_no())) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isDEL(inptR.data_crud_typ())) {
					continue;
				}

				srchL.add(inptR);
			}

			return srchL;
		}

		protected MCMessageList cmplInptQtyVerNo(MCList<MfgActRecvIf_Upd02_ActLstR> inptL) {
			MCMessageList msgL = new MCMessageList();
			if (_cacheItmL == null || _cacheLotL == null) {
				return msgL;
			}

			for (MfgActRecvIf_Upd02_ActLstR inptR : inptL) {
				if (inptR.err_flg() || _errMfgInstNoS.contains(inptR.mfg_inst_no())) {
					continue;
				}
				if ( MAC_DATA_CRUD_TYP.isDEL(inptR.data_crud_typ())) {
					continue;
				}

				MAM_ITM_R itmR = _cacheItmL.get(inptR.itm_cd(), inptR.itm_sub1(), inptR.itm_sub2(), inptR.itm_sub3());
				if (itmR == null || isNull(itmR.itm_cd())) {
					// 投入品目が存在しません。
					setErrFlag(inptR);
					msgL.add(new MCMessage(inptR, null, MSLAL0139, inptR.data_no(), inptR.data_lno(), 
											toDispItm(inptR.itm_cd(), inptR.itm_sub1(), inptR.itm_sub2(), inptR.itm_sub3())));
					continue;
				}

				if (itmR.ver_flg() && !isNullOrNullVal(inptR.lot_no())) {
					MST_LOT_R lotVerR = _cacheLotL.get( inptR.itm_cd(), inptR.itm_sub1(), inptR.itm_sub2(), inptR.itm_sub3(), 
														inptR.lot_no(), inptR.sublot_no());
					if (lotVerR == null || isNull(lotVerR.itm_cd())) {
						// 投入品目のロット情報が存在しません。
						setErrFlag(inptR);
						msgL.add(new MCMessage(inptR, null, MSLAL0140, inptR.data_no(), inptR.data_lno(), 
												toDispItm(inptR.itm_cd(), inptR.itm_sub1(), inptR.itm_sub2(), inptR.itm_sub3())));
						continue;
					}
					else {
						inptR.ver_no(lotVerR.ver_no());
					}
				}

				if (itmR.cont_fctr_flg()) {
					MCNumber contFctr = itmR.std_cont_fctr();
					MST_LOT_R lotR = _cacheLotL.get(inptR.itm_cd(), inptR.itm_sub1(), inptR.itm_sub2(), inptR.itm_sub3(), 
													inptR.lot_no(), inptR.sublot_no());
					if (lotR != null && !isNull(lotR.act_cont_fctr())) {
						contFctr = lotR.act_cont_fctr();
					}

					if (isNull(inptR.base_unit_inpt_qty())) {
						inptR.base_unit_inpt_qty(convToBaseUnitFromContFctrUnit(inptR.cont_qty(), contFctr, itmR.dec_place(), itmR.rnd_typ()));
					}
					else if (isNull(inptR.cont_qty())) {
						inptR.cont_qty(convToContFctrUnit(inptR.base_unit_inpt_qty(), contFctr, itmR.cont_fctr_dec_place(), itmR.cont_fctr_rnd_typ()));
					}
				}
				else if (isNull(inptR.base_unit_inpt_qty())) {
					// 投入品目が有効成分対象外なのに、投入数量がありません。
					setErrFlag(inptR);
					msgL.add(new MCMessage(inptR, null, MSLAL0141, inptR.data_no(), inptR.data_lno()));
				}
				else if (!MSC_IF_INPT_TYP.isINPT(inptR.if_inpt_typ()) && !inptR.base_unit_inpt_qty().isPositive()) {
					// ロス実績の場合、正数であること。
					setErrFlag(inptR);
					msgL.add(new MCMessage(inptR, null, MSLAL0142, inptR.data_no(), inptR.data_lno()));
				}
			}

			return msgL;
		}

		protected void getItmMstCache(MCList<MfgActRecvIf_Upd02_ActLstR> srchL) {
			if (srchL.isEmpty()) {
				_cacheItmL = null;
				return;
			}

			// 品目マスタのキャッシュ
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbcItmL_bldr = MCQueryApiBuilder.create(t);
			dbcItmL_bldr.setSelect(t.itm_cd);
			dbcItmL_bldr.addSelect(t.itm_sub1);
			dbcItmL_bldr.addSelect(t.itm_sub2);
			dbcItmL_bldr.addSelect(t.itm_sub3);
			dbcItmL_bldr.addSelect(t.unit_cd);
			dbcItmL_bldr.addSelect(t.dec_place);
			dbcItmL_bldr.addSelect(t.rnd_typ);
			dbcItmL_bldr.addSelect(t.ver_flg);
			dbcItmL_bldr.addSelect(t.cont_fctr_flg);
			dbcItmL_bldr.addSelect(t.cont_fctr_rnd_typ);
			dbcItmL_bldr.addSelect(t.cont_fctr_dec_place);
			dbcItmL_bldr.addSelect(t.std_cont_fctr);
			dbcItmL_bldr.addSelect(t.cont_fctr_unit_cd);
			dbcItmL_bldr.addSelect(t.lot_mng_typ);
			dbcItmL_bldr.addSelect(t.sublot_mng_typ);
			dbcItmL_bldr.addSelect(t.sno1_mng_typ);
			dbcItmL_bldr.addSelect(t.sno2_mng_typ);
			dbcItmL_bldr.addSelect(t.sno3_mng_typ);
			dbcItmL_bldr.addSelect(t.sno4_mng_typ);

			_cacheItmL = new FXUCL_MCDbcCache<>(dbcItmL_bldr, srchL, new String[] {
					MfgActRecvIf_Upd02_ActLstR.$itm_cd, MfgActRecvIf_Upd02_ActLstR.$itm_sub1,
					MfgActRecvIf_Upd02_ActLstR.$itm_sub2, MfgActRecvIf_Upd02_ActLstR.$itm_sub3
			});
		}

		protected void getItmUnitMstCache(MCList<MfgActRecvIf_Upd02_ActLstR> srchL) {
			if (srchL.isEmpty()) {
				_cacheItmUnitL = null;
				return;
			}

			// 品目単位マスタのキャッシュ
			MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder dbcItmUnitL_bldr = MCQueryApiBuilder.create(t);
			dbcItmUnitL_bldr.setSelect(t.itm_cd);
			dbcItmUnitL_bldr.addSelect(t.itm_sub1);
			dbcItmUnitL_bldr.addSelect(t.itm_sub2);
			dbcItmUnitL_bldr.addSelect(t.itm_sub3);
			dbcItmUnitL_bldr.addSelect(t.unit_cd);
			dbcItmUnitL_bldr.addSelect(t.conv_base_qty);
			dbcItmUnitL_bldr.addSelect(t.conv_qty);
			dbcItmUnitL_bldr.addSelect(t.dec_place);
			dbcItmUnitL_bldr.addSelect(t.rnd_typ);
			dbcItmUnitL_bldr.addSelect(t.pack_flg);
			dbcItmUnitL_bldr.addSelect(t.pckg_flg);
			dbcItmUnitL_bldr.addSelect(t.base_unit_flg);
			dbcItmUnitL_bldr.addSelect(t.unit_dim);
			dbcItmUnitL_bldr.addSelect(t.unit_wt);

			_cacheItmUnitL = new FXUCL_MCDbcCache<>(dbcItmUnitL_bldr, srchL, new String[] {
					MfgActRecvIf_Upd02_ActLstR.$itm_cd, MfgActRecvIf_Upd02_ActLstR.$itm_sub1,
					MfgActRecvIf_Upd02_ActLstR.$itm_sub2, MfgActRecvIf_Upd02_ActLstR.$itm_sub3, 
					MfgActRecvIf_Upd02_ActLstR.$trd_unit_cd
			});
		}

		protected void getItmLotCache(MCList<MfgActRecvIf_Upd02_ActLstR> srchL) {
			if (srchL.isEmpty()) {
				_cacheLotL = null;
				return;
			}

			MST_LOT_R t = MST_LOT_R.create("T");
			MCQueryApiBuilder dbcLotL_bldr = MCQueryApiBuilder.create(t);
			dbcLotL_bldr.setSelect(t.itm_cd);
			dbcLotL_bldr.addSelect(t.itm_sub1);
			dbcLotL_bldr.addSelect(t.itm_sub2);
			dbcLotL_bldr.addSelect(t.itm_sub3);
			dbcLotL_bldr.addSelect(t.lot_no);
			dbcLotL_bldr.addSelect(t.sublot_no);
			dbcLotL_bldr.addSelect(t.ver_no);
			dbcLotL_bldr.addSelect(t.vld_dt);
			dbcLotL_bldr.addSelect(t.lmt_dt);

			_cacheLotL = new FXUCL_MCDbcCache<MST_LOT_R>(dbcLotL_bldr, srchL, 
					MfgActRecvIf_Upd02_ActLstR.$itm_cd, MfgActRecvIf_Upd02_ActLstR.$itm_sub1, 
					MfgActRecvIf_Upd02_ActLstR.$itm_sub2, MfgActRecvIf_Upd02_ActLstR.$itm_sub3, 
					MfgActRecvIf_Upd02_ActLstR.$lot_no, MfgActRecvIf_Upd02_ActLstR.$sublot_no);
		}

		/**
		 * 投入実績のみ受信し、配下にロス実績がある場合、ロス実績を補完する。<br>
		 * なお、投入実績の取消が受信し、配下にロス実績があれば、<br>
		 * ＝＞ 投入実績を取り消せなく、「0」実績、他勘定振替なし、ＩＦ自動作成に更新する。<br>
		 */
		protected void cmplNotRecvLoss() {
			// 1. 投入実績の補完対象を得る。（エラーなし、未補完）
			MCList<MfgActRecvIf_Upd02_ActLstR> inptL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
			for (MfgActRecvIf_Upd02_ActLstR inptR : _inptActL) {
				if (inptR.err_flg() || _errMfgInstNoS.contains(inptR.mfg_inst_no())) {
					continue;
				}
				if (isNull(inptR.inpt_act_no()) || _inptLossOKS.contains(inptR.ext_inpt_act_no())) {
					continue;
				}

				_inptLossOKS.add(inptR.ext_inpt_act_no());

				// ロット提案により分割された投入実績に対して、訂正・取消を受信した場合、実績を作り直す。
				if (inptR.ext_act_cnt() != null && inptR.ext_act_cnt().gt(1)) {
					cmplSplitedInptLoss(inptR);
					continue;
				}

				inptL.add(inptR);
			}

			if (inptL.isEmpty()) {
				return;
			}

			// 2. 登録済、補完となるロス実績を抽出する。
			MCList<MST_LOSS_ACT_R> lossActL = MCList.create(MST_LOSS_ACT_R.class);
			MST_LOSS_ACT_R t = MST_LOSS_ACT_R.create("T");
			MCQueryApiBuilder lossActL_bldr = MCQueryApiBuilder.create(t);
			lossActL_bldr.setSelect(t.loss_act_no);
			lossActL_bldr.addSelect(t.inpt_act_no);
			lossActL_bldr.addSelect(t.loss_rsn_cd);
			lossActL_bldr.addSelect(t.base_unit_qty);
			lossActL_bldr.addSelect(t.cont_qty);
			lossActL_bldr.setWhere(t.inpt_act_no.eq(bind("inpt_act_no")));
			int cnt = dbSelect("MSLAL6220_MST_LOSS_ACT_S02", lossActL, lossActL_bldr, inptL);
			if (cnt < 1) {
				return;
			}

			// 3. 補完する。
			MCIndexKey inptIdx = inptL.createIndex(MfgActRecvIf_Upd02_ActLstR.$inpt_act_no);
			for (MST_LOSS_ACT_R dblsR : lossActL) {
				MfgActRecvIf_Upd02_ActLstR ipR = inptL.getFirst(inptIdx, dblsR.inpt_act_no());
				if (isNull(ipR)) {
					continue;
				}

				// 投入取消を受信した場合、ロス実績があるため、更新へ変える。
				if (MAC_DATA_CRUD_TYP.isDEL(ipR.data_crud_typ())) {
					ipR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					ipR.base_unit_inpt_qty(MCNumber.ZERO);
					ipR.cont_qty (MCNumber.ZERO);
					ipR.if_auto_reg_flg(true);
				}

				MfgActRecvIf_Upd02_ActLstR ulR = ipR.clone();
				ulR.if_inpt_typ(MSC_IF_INPT_TYP.LOSS.value());
				ulR.loss_act_no(dblsR.loss_act_no());
				ulR.loss_rsn_cd(dblsR.loss_rsn_cd());
				ulR.base_unit_inpt_qty(dblsR.base_unit_qty());
				ulR.cont_qty (dblsR.cont_qty());
				ulR.sub_char1(dblsR.sub_char1());
				ulR.sub_char2(dblsR.sub_char2());
				ulR.sub_char3(dblsR.sub_char3());
				ulR.chk_add_flg(true);

				_lossActL.add(ulR);
			}
		}

		protected void cmplSplitedInptLoss(MfgActRecvIf_Upd02_ActLstR inptRecvR) {
			MCList<MfgActRecvIf_Upd02_ActLstR> rsltL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);

			// ＤＢロス実績を全て取得する。
			MCList<MST_LOSS_ACT_R> ldbaL = getLossActL(inptRecvR.ext_inpt_act_no());

			// 親投入の取消を受信した場合、全取消となる。
			if (MAC_DATA_CRUD_TYP.isDEL(inptRecvR.data_crud_typ())) {
				rsltL.addAll(getInptActPrntRstL(inptRecvR, inptRecvR.inpt_act_no(), false));
			}
			// 親投入の訂正を受信した場合、既存の投入実績を全て取消、新規として登録する。
			else {
				rsltL.addAll(getInptActPrntRstL(inptRecvR, null, false));
				MST_INPT_ACT_R dbInptActR = getDBInptAct(inptRecvR.inpt_act_no());
				changeInptToCreate(inptRecvR, dbInptActR);
			}

			// ＤＢロス実績：ＤＥＬ＝＞ＩＮＳへ変える。
			rsltL.addAll(getLossActDelL(inptRecvR, ldbaL, null));
			rsltL.addAll(getLossActCrtL2(inptRecvR, ldbaL));

			_lossActL.addAll(rsltL);
		}

		protected MST_INPT_ACT_R getDBInptAct(String inptActNo) {
			if (isNull(inptActNo)) {
				return MST_INPT_ACT_R.create();
			}

			MST_INPT_ACT_R oaR = (MST_INPT_ACT_R)getActRCache(getCacheKey(MAC_IF_PROC_TYP.MES_INPT_ACT_RECV.value(), inptActNo));
			if (oaR == null) {
				oaR = MST_INPT_ACT_R.create();
			}

			return oaR;
		}

		protected void setErrFlag(MfgActRecvIf_Upd02_ActLstR aR) {
			// エラーＦＬＧ設定
			aR.err_flg(true);
			aR.imp_flg(true);
			aR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());

			// エラー行の製造指図ＮＯを記憶する
			_errMfgInstNoS.add(aR.mfg_inst_no());
		}

		/**
		 * 製造実績の取消のみ受信した場合、<br>
		 * ＩＦ自動作成の工程実績が存在すれば、<br>
		 * 配下にある「投入・工数・出来高」を全て取消となったら、<br>
		 * 親となる工程実績も取り消す。
		 * @param mfgActNoS 製造実績ＮＯセット
		 * @param operActNoS 工程造実績ＮＯセット
		 */
		protected void addOperDelForIfAutoReg(Set<String> mfgActNoS, Set<String> operActNoS) {
			if (mfgActNoS.isEmpty()) {
				return;
			}

			// ＩＦ自動作成工程実績の取得
			Map<String, MST_OPER_ACT_R> iacMap = new HashMap<String, MST_OPER_ACT_R>();
			for (String mfgActNo : mfgActNoS) {
				MCList<MCRow> actOperL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value(), mfgActNo));
				if (isNull(actOperL)) {
					continue;
				}

				for (int ai = 0 ; ai < actOperL.size() ; ai++) {
					MST_OPER_ACT_R oaR = (MST_OPER_ACT_R)actOperL.get(ai);
					if (oaR.if_auto_reg_flg() && !operActNoS.contains(oaR.oper_act_no())) {
						iacMap.put(oaR.oper_act_no(), oaR);
					}
				}
			}

			if (iacMap.isEmpty()) {
				return;
			}

			// ＩＦ自動作成工程実績の配下を全て取消の場合、工程取消のデータを補完する。
			MCList<MfgActRecvIf_Upd02_ActLstR> delOperL = MCList.create(MfgActRecvIf_Upd02_ActLstR.class);
			MCIndexKey oaIdx = down0().createIndex(MfgActRecvIf_Upd02_ActLstR.$oper_act_no, MfgActRecvIf_Upd02_ActLstR.$err_flg);
			for (Entry<String, MST_OPER_ACT_R> entry : iacMap.entrySet()) {
				MCList<MfgActRecvIf_Upd02_ActLstR> ifActL = down0().subList(oaIdx, entry.getKey(), false);
				if (isNull(ifActL)) {
					continue;
				}

				if (!isAllActDel(ifActL, entry.getValue())) {
					continue;
				}

				delOperL.add(crtDelOperAct(ifActL.get(0), entry.getValue()));
			}

			down0().addAll(delOperL);
		}

		protected boolean isAllActDel(MCList<MfgActRecvIf_Upd02_ActLstR> ifActL, MST_OPER_ACT_R operActR) {
			Set<String> wkActNoS = new HashSet<String>();
			Set<String> inptActNoS = new HashSet<String>();
			Set<String> yieldActNoS = new HashSet<String>();

			for (MfgActRecvIf_Upd02_ActLstR iaR : ifActL) {
				if (!MAC_DATA_CRUD_TYP.isDEL(iaR.data_crud_typ())) {
					return false;
				}

				if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(iaR.if_proc_typ())) {
					return false;
				}

				if (MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(iaR.if_proc_typ())) {
					inptActNoS.add(iaR.inpt_act_no());
					continue;
				}
				if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(iaR.if_proc_typ())) {
					wkActNoS.add(iaR.wk_act_no());
					continue;
				}
				if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(iaR.if_proc_typ())) {
					yieldActNoS.add(iaR.yield_act_no());
					continue;
				}
			}

			if (!isAllYieldActDel(yieldActNoS, operActR)) {
				return false;
			}
			if (!isAllWkActDel(wkActNoS, operActR)) {
				return false;
			}
			if (!isAllInptActDel(inptActNoS, operActR)) {
				return false;
			}

			return true;
		}

		protected boolean isAllYieldActDel(Set<String> delActNoS, MST_OPER_ACT_R operActR) {
			MCList<MCRow> actDBL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_YIELD_ACT_RECV.value(), operActR.mfg_act_no()));
			if (isNull(actDBL)) {
				return true;
			}

			for (int ai = 0 ; ai < actDBL.size() ; ai++) {
				MST_YIELD_ACT_R actR = (MST_YIELD_ACT_R)actDBL.get(ai);
				if (!isSame(actR.oper_act_no(), operActR.oper_act_no())) {
					continue;
				}

				if (!delActNoS.contains(actR.yield_act_no())) {
					return false;
				}
			}

			return true;
		}

		protected boolean isAllWkActDel(Set<String> delActNoS, MST_OPER_ACT_R operActR) {
			MCList<MCRow> actDBL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_WK_ACT_RECV.value(), operActR.mfg_act_no()));
			if (isNull(actDBL)) {
				return true;
			}

			for (int ai = 0 ; ai < actDBL.size() ; ai++) {
				MST_WK_ACT_R actR = (MST_WK_ACT_R)actDBL.get(ai);
				if (!isSame(actR.oper_act_no(), operActR.oper_act_no())) {
					continue;
				}

				if (!delActNoS.contains(actR.wk_act_no()) && !actR.wk_cost_calc_ctl_flg()) {
					return false;
				}
			}

			return true;
		}

		protected boolean isAllInptActDel(Set<String> delActNoS, MST_OPER_ACT_R operActR) {
			MCList<MCRow> actDBL = getActLCache(getCacheKey(MAC_IF_PROC_TYP.MES_INPT_ACT_RECV.value(), operActR.mfg_act_no()));
			if (isNull(actDBL)) {
				return true;
			}

			for (int ai = 0 ; ai < actDBL.size() ; ai++) {
				MST_INPT_ACT_R actR = (MST_INPT_ACT_R)actDBL.get(ai);
				if (!isSame(actR.oper_act_no(), operActR.oper_act_no())) {
					continue;
				}

				if (!delActNoS.contains(actR.inpt_act_no()) && !actR.bkf_ctl_flg()) {
					return false;
				}
			}

			return true;
		}

		protected MfgActRecvIf_Upd02_ActLstR crtDelOperAct(MfgActRecvIf_Upd02_ActLstR subR, MST_OPER_ACT_R oaR) {
			MfgActRecvIf_Upd02_ActLstR addOperR = subR.clone();

			addOperR.if_proc_typ(MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value());
			addOperR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			addOperR.setStatus(Status.DELETE);
			addOperR.yield_schd_no(null);
			addOperR.yield_act_no(null);
			addOperR.ext_yield_act_no(null);
			addOperR.wk_schd_no(null);
			addOperR.wk_act_no(null);
			addOperR.ext_wk_act_no(null);
			addOperR.inpt_schd_no(null);
			addOperR.inpt_act_no(null);
			addOperR.ext_inpt_act_no(null);
			addOperR.if_inpt_typ(null);
			addOperR.loss_rsn_cd(null);
			addOperR.chk_add_flg(true);

			addOperR.oper_inst_no(oaR.oper_inst_no());
			addOperR.oper_act_no(oaR.oper_act_no());
			addOperR.mfg_act_no(oaR.mfg_act_no());
			addOperR.st_act_tm(oaR.st_act_tm());
			addOperR.ext_sys_cd(oaR.ext_sys_cd());
			addOperR.ext_oper_act_no(oaR.ext_oper_act_no());
			addOperR.if_auto_reg_flg(oaR.if_auto_reg_flg());

			return addOperR;
		}

		protected void setDown() {
			Set<String> mfgActNoS = new HashSet<String>();
			Set<String> operActNoS = new HashSet<String>();

			// ロスを上り電文に回復
			up0().addAll(_lossActL);

			// 下り電文の設定
			for (MfgActRecvIf_Upd02_ActLstR uR : up0()) {
				if (uR.err_flg()) {
					down0().add(uR);
					continue;
				}

				if (_errMfgInstNoS.contains(uR.mfg_inst_no())) {
					setErrFlag(uR);
					MCMessagePool.add(uR, null, MSLAL0077, uR.if_proc_typ(), uR.data_no(), uR.data_lno(), uR.mfg_inst_no());
					down0().add(uR);
					continue;
				}

				// 取消の製造実績ＮＯを記憶する
				if (MAC_DATA_CRUD_TYP.isDEL(uR.data_crud_typ()) && !isNull(uR.mfg_act_no())) {
					mfgActNoS.add(uR.mfg_act_no());
				}
				else {
					mfgActNoS.remove(uR.mfg_act_no());
				}

				// 受信した工程実績の工程実績ＮＯを記憶する
				if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(uR.if_proc_typ()) && !isNull(uR.oper_act_no())) {
					operActNoS.add(uR.oper_act_no());
				}

				down0().add(uR);
			}

			// 取消工程の追加
			addOperDelForIfAutoReg(mfgActNoS, operActNoS);
		}
	}

	protected static final Class<MSLAL_MfgActRecvIfService> CLAZZ = MSLAL_MfgActRecvIfService.class;

	protected FXUCL_Cache<MCRow> _actRCache = null;
	protected FXUCL_Cache<MCList<MCRow>> _actLCache = null;

	protected FXUCL_Cache<MCRow> _schdRCache = null;
	protected FXUCL_Cache<MCList<MCRow>> _schdLCache = null;

	/** 重複取込不可チェック用キャッシュ **/
	protected FXUCL_Cache<MfgActRecvIf_Upd02_ActLstR> _notDupImpCache = null;

	/** 外部受信実績のキー（重複チェック用） **/
	protected Set<String> _extActKeySet = new HashSet<String>();

	protected static Set<String> getExtActKeySet() {
		if (object(CLAZZ)._extActKeySet == null) {
			object(CLAZZ)._extActKeySet = new HashSet<String>();
		}

		return object(CLAZZ)._extActKeySet;
	}

	/** 工程実績・工程指図ＮＯのマップ（キー：工程実績ＮＯ、値：工程指図ＮＯ） **/
	protected Map<String, String> _operActInstNoM = null;

	protected static Map<String, String> getOperActInstNoM() {
		if (object(CLAZZ)._operActInstNoM == null) {
			object(CLAZZ)._operActInstNoM = new HashMap<String, String>();
		}

		return object(CLAZZ)._operActInstNoM;
	}

	protected static void initCache(MCList<MST_MFG_INST_R> mfgInstL, MCList<MST_MFG_ACT_R> mfgActL) {
		object(CLAZZ)._initCache(mfgInstL, mfgActL);
	}

	protected static void clearCache() {
		object(CLAZZ)._clearCache();
	}

	protected static MCRow getActRCache(String[] cacheKey) {
		return object(CLAZZ)._actRCache.getCache(cacheKey);
	}

	protected static MCList<MCRow> getActLCache(String[] cacheKey) {
		return object(CLAZZ)._actLCache.getCache(cacheKey);
	}

	protected static MCRow getSchdRCache(String[] cacheKey) {
		return object(CLAZZ)._schdRCache.getCache(cacheKey);
	}

	protected static MCList<MCRow> getSchdLCache(String[] cacheKey) {
		return object(CLAZZ)._schdLCache.getCache(cacheKey);
	}

	protected static void setActRCache(String[] cacheKey, MCRow rdb) {
		object(CLAZZ)._actRCache.putCache(cacheKey, rdb);
	}

	protected static void setActLCache(String[] cacheKey, MCList<MCRow> rdbL) {
		object(CLAZZ)._actLCache.putCache(cacheKey, rdbL);
	}

	protected static void setSchdRCache(String[] cacheKey, MCRow rdb) {
		object(CLAZZ)._schdRCache.putCache(cacheKey, rdb);
	}

	protected static void setSchdLCache(String[] cacheKey, MCList<MCRow> rdbL) {
		object(CLAZZ)._schdLCache.putCache(cacheKey, rdbL);
	}

	protected static void setNotDupImpCache(String[] cacheKey, MfgActRecvIf_Upd02_ActLstR esR) {
		object(CLAZZ)._notDupImpCache.putCache(cacheKey, esR);
	}

	protected static MfgActRecvIf_Upd02_ActLstR getNotDupImpCache(String[] cacheKey) {
		return object(CLAZZ)._notDupImpCache.getCache(cacheKey);
	}

	protected void _initCache(MCList<MST_MFG_INST_R> mfgInstL, MCList<MST_MFG_ACT_R> mfgActL) {

		object(CLAZZ)._actRCache = new FXUCL_Cache<MCRow>();
		object(CLAZZ)._actRCache.setFixMaxCacheSize(-1);
		object(CLAZZ)._actLCache = new FXUCL_Cache<MCList<MCRow>>();
		object(CLAZZ)._actLCache.setFixMaxCacheSize(-1);
		object(CLAZZ)._schdRCache = new FXUCL_Cache<MCRow>();
		object(CLAZZ)._schdRCache.setFixMaxCacheSize(-1);
		object(CLAZZ)._schdLCache = new FXUCL_Cache<MCList<MCRow>>();
		object(CLAZZ)._schdLCache.setFixMaxCacheSize(-1);

		object(CLAZZ)._notDupImpCache = new FXUCL_Cache<MfgActRecvIf_Upd02_ActLstR>();
		object(CLAZZ)._notDupImpCache.setFixMaxCacheSize(-1);
		
		MCQueryApiBuilder _mfgInstL_bldr = MCQueryApiBuilder.create(MST_MFG_INST_R.create("T"));
		MCQueryApiBuilder _mfgActL_bldr = MCQueryApiBuilder.create(MST_MFG_ACT_R.create("T"));
		// 実績のキャッシュデータ
		if (!mfgActL.isEmpty()) {
			dbWkDelete("MSLAL6220_MSW_MFG_ACT_D01", _mfgActL_bldr.getBaseDbc());
			dbWkInsert("MSLAL6220_MSW_MFG_ACT_I01", mfgActL, _mfgActL_bldr.getBaseDbc());
			initOperActCache();
			initInptActCache();
			initWkActCache();
			initYieldActCache();
			dbWkDelete("MSLAL6220_MSW_MFG_ACT_D02", _mfgActL_bldr.getBaseDbc());
		}

		// 指図・予定のキャッシュデータ
		dbWkDelete("MSLAL6220_MSW_MFG_INST_D01", _mfgInstL_bldr.getBaseDbc());
		dbWkInsert("MSLAL6220_MSW_MFG_INST_I01", mfgInstL, _mfgInstL_bldr.getBaseDbc());
		initOperInstCache();
		initInptSchdCache();
		initWkSchdCache();
		initYieldSchdCache();
		dbWkDelete("MSLAL6220_MSW_MFG_INST_D02", _mfgInstL_bldr.getBaseDbc());

	}

	protected void initOperActCache() {
		MCList<MST_OPER_ACT_R> oaL = MCList.create(MST_OPER_ACT_R.class);
		MST_OPER_ACT_R t = MST_OPER_ACT_R.create("T");
		MCQueryApiBuilder oaL_bldr = MCQueryApiBuilder.create(t);
		MST_OPER_ACT_REM_R t2 = MST_OPER_ACT_REM_R.create("T2");
		MSW_MFG_ACT_KEY_R w1 = MSW_MFG_ACT_KEY_R.create("W1");
		oaL.addStringColumn("mfg_sts_typ");

		oaL_bldr.setSelect(t.oper_act_no);
		oaL_bldr.addSelect(t.mfg_act_no);
		oaL_bldr.addSelect(t.itm_mfg_inst_no);
		oaL_bldr.addSelect(t.oper_inst_no);
		oaL_bldr.addSelect(t.div_seq);
		oaL_bldr.addSelect(t.arr_act_no);
		oaL_bldr.addSelect(t.purc_act_io_no);
		oaL_bldr.addSelect(t.disp_seq);
		oaL_bldr.addSelect(t.st_act_tm);
		oaL_bldr.addSelect(t.end_act_tm);
		oaL_bldr.addSelect(t.base_unit_qty);
		oaL_bldr.addSelect(t.base_unit_cd);
		oaL_bldr.addSelect(t.oper_unit_qty);
		oaL_bldr.addSelect(t.oper_unit_cd);
		oaL_bldr.addSelect(t.bkf_ctl_flg);
		oaL_bldr.addSelect(t.wk_cost_calc_ctl_flg);
		oaL_bldr.addSelect(t.oper_yield);
		oaL_bldr.addSelect(t.bkf_not_ref_flg);
		oaL_bldr.addSelect(t.data_no);
		oaL_bldr.addSelect(t.mes_id);
		oaL_bldr.addSelect(t.mes_flg);
		oaL_bldr.addSelect(t.ext_sys_cd);
		oaL_bldr.addSelect(t.ext_oper_act_no);
		oaL_bldr.addSelect(t.if_auto_reg_flg);
		oaL_bldr.addSelect(t.intr_rmrks);
		oaL_bldr.addSelect(t.act_rpt_rmrks);
		oaL_bldr.addSelect(t.sub_char1);
		oaL_bldr.addSelect(t.sub_char2);
		oaL_bldr.addSelect(t.sub_char3);
		oaL_bldr.addSelect(t2.mfg_sts_typ.as("mfg_sts_typ"));
		oaL_bldr.addLeftOuterJoin(t2, bracket(t2.oper_inst_no.eq(t.oper_inst_no)
				.and(t2.div_seq.eq(t.div_seq))));

		oaL_bldr.addInnerJoin(w1, bracket(t.mfg_act_no.eq(w1.mfg_act_no)));
		oaL_bldr.addWhereWithAnd(t.div_seq.eq(value(1)));

		oaL_bldr.setOrderByAsc(t.mfg_act_no, t.oper_inst_no, t.oper_act_no);

		dbSelect("MSLAL6220_MST_OPER_ACT_S03", oaL, oaL_bldr);

		String mfgActNo = null;
		String dataTyp = MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value();
		MCList<MCRow> cchL = MCList.create(MCRow.class);
		for (MST_OPER_ACT_R oaR : oaL) {
			if (!isSame(mfgActNo, oaR.mfg_act_no())) {
				if (!cchL.isEmpty()) {
					setActLCache(getCacheKey(dataTyp, mfgActNo), cchL);
					cchL = MCList.create(MCRow.class);
				}
				mfgActNo = oaR.mfg_act_no();
			}

			cchL.add(oaR);
			setActRCache(getCacheKey(dataTyp, oaR.oper_act_no()), oaR);

			if (oaR.mes_flg() && !isNull(oaR.ext_oper_act_no())) {
				MfgActRecvIf_Upd02_ActLstR csR = MfgActRecvIf_Upd02_ActLstR.create();
				csR.oper_inst_no(oaR.oper_inst_no());
				csR.oper_act_no(oaR.oper_act_no());
				csR.ext_sys_cd(oaR.ext_sys_cd());
				csR.ext_oper_act_no(oaR.ext_oper_act_no());
				setNotDupImpCache(getCacheKey(dataTyp, oaR.oper_inst_no()), csR);
			}
		}

		if (!cchL.isEmpty()) {
			setActLCache(getCacheKey(dataTyp, mfgActNo), cchL);
		}
	}

	protected void initInptActCache() {
		MCList<MST_INPT_ACT_R> iaL = MCList.create(MST_INPT_ACT_R.class);
		MST_INPT_ACT_R t = MST_INPT_ACT_R.create("T");
		MCQueryApiBuilder iaL_bldr = MCQueryApiBuilder.create(t);
		MST_INPT_ACT_R S1TI = MST_INPT_ACT_R.create("TI");
		MST_INPT_ACT_REM_R t2 = MST_INPT_ACT_REM_R.create("T2");
		MSW_MFG_ACT_KEY_R w1 = MSW_MFG_ACT_KEY_R.create("W1");
		iaL.addStringColumn("mfg_sts_typ");
		iaL.addStringColumn("oper_inst_no");
		iaL.addNumberColumn("ext_act_cnt");

		iaL_bldr.setSelect(t.inpt_act_no);
		iaL_bldr.addSelect(t.itm_cd);
		iaL_bldr.addSelect(t.itm_sub1);
		iaL_bldr.addSelect(t.itm_sub2);
		iaL_bldr.addSelect(t.itm_sub3);
		iaL_bldr.addSelect(t.ver_no);
		iaL_bldr.addSelect(t.mfg_act_no);
		iaL_bldr.addSelect(t.itm_mfg_inst_no);
		iaL_bldr.addSelect(t.oper_act_no);
		iaL_bldr.addSelect(t.inpt_schd_no);
		iaL_bldr.addSelect(t.div_seq);
		iaL_bldr.addSelect(t.inpt_loc_cd);
		iaL_bldr.addSelect(t.inpt_str_ln_cd);
		iaL_bldr.addSelect(t.quality_typ);
		iaL_bldr.addSelect(t.stk_insp_typ);
		iaL_bldr.addSelect(t.stk_id_typ);
		iaL_bldr.addSelect(t.stk_bp_cd);
		iaL_bldr.addSelect(t.stk_arrv_bp_cd);
		iaL_bldr.addSelect(t.gd_cd);
		iaL_bldr.addSelect(t.lot_no);
		iaL_bldr.addSelect(t.sublot_no);
		iaL_bldr.addSelect(t.sno1);
		iaL_bldr.addSelect(t.sno2);
		iaL_bldr.addSelect(t.sno3);
		iaL_bldr.addSelect(t.sno4);
		iaL_bldr.addSelect(t.base_unit_inpt_qty);
		iaL_bldr.addSelect(t.base_unit_loss_qty);
		iaL_bldr.addSelect(t.base_unit_fxd_loss_qty);
		iaL_bldr.addSelect(t.base_unit_cd);
		iaL_bldr.addSelect(t.act_tm);
		iaL_bldr.addSelect(t.ac_dt);
		iaL_bldr.addSelect(t.bkf_ctl_flg);
		iaL_bldr.addSelect(t.base_unit_std_qty);
		iaL_bldr.addSelect(t.cont_qty);
		iaL_bldr.addSelect(t.cont_loss_qty);
		iaL_bldr.addSelect(t.cont_fxd_loss_qty);
		iaL_bldr.addSelect(t.cont_fctr_unit_cd);
		iaL_bldr.addSelect(t.act_cont_fctr);
		iaL_bldr.addSelect(t.acxfr_qty);
		iaL_bldr.addSelect(t.acxfr_rsn_cd);
		iaL_bldr.addSelect(t.acxfr_bd_dpt_cd);
		iaL_bldr.addSelect(t.add_flg);
		iaL_bldr.addSelect(t.data_no);
		iaL_bldr.addSelect(t.mes_id);
		iaL_bldr.addSelect(t.mes_flg);
		iaL_bldr.addSelect(t.ext_sys_cd);
		iaL_bldr.addSelect(t.ext_inpt_act_no);
		iaL_bldr.addSelect(t.if_auto_reg_flg);
		iaL_bldr.addSelect(t.intr_rmrks);
		iaL_bldr.addSelect(t.act_rpt_rmrks);
		iaL_bldr.addSelect(t.trd_rmrks);
		iaL_bldr.addSelect(t.sub_char1);
		iaL_bldr.addSelect(t.sub_char2);
		iaL_bldr.addSelect(t.sub_char3);

		iaL_bldr.addSelect(t2.mfg_sts_typ.as("mfg_sts_typ"));
		iaL_bldr.addSelect(t2.oper_inst_no.as("oper_inst_no"));
		iaL_bldr.addSelect(
				bracket(subQuery().select(count(value("x"))).from(S1TI)
						.where(S1TI.ext_inpt_act_no.eq(t.ext_inpt_act_no)
								.and(S1TI.ext_sys_cd.eq(t.ext_sys_cd))))
										.as("ext_act_cnt"));
		iaL_bldr.addLeftOuterJoin(t2, bracket(
				t2.inpt_schd_no.eq(t.inpt_schd_no)
				.and(t2.div_seq.eq(t.div_seq))));

		iaL_bldr.addInnerJoin(w1, bracket(t.mfg_act_no.eq(w1.mfg_act_no)));
		iaL_bldr.addWhereWithAnd(t.div_seq.eq(value(1)));

		iaL_bldr.setOrderByAsc(t.mfg_act_no, t.inpt_schd_no, t.inpt_act_no);

		dbSelect("MSLAL6220_MST_INPT_ACT_S03", iaL, iaL_bldr);

		String mfgActNo = null;
		String dataTyp = MAC_IF_PROC_TYP.MES_INPT_ACT_RECV.value();
		MCList<MCRow> cchL = MCList.create(MCRow.class);
		for (MST_INPT_ACT_R iaR : iaL) {
			if (!isSame(mfgActNo, iaR.mfg_act_no())) {
				if (!cchL.isEmpty()) {
					setActLCache(getCacheKey(dataTyp, mfgActNo), cchL);
					cchL = MCList.create(MCRow.class);
				}
				mfgActNo = iaR.mfg_act_no();
			}

			cchL.add(iaR);
			setActRCache(getCacheKey(dataTyp, iaR.inpt_act_no()), iaR);

			if (iaR.mes_flg() && !isNull(iaR.ext_inpt_act_no()) && !isNull(iaR.inpt_schd_no())) {
				MfgActRecvIf_Upd02_ActLstR csR = MfgActRecvIf_Upd02_ActLstR.create();
				csR.inpt_schd_no(iaR.inpt_schd_no());
				csR.inpt_act_no(iaR.inpt_act_no());
				csR.ext_sys_cd(iaR.ext_sys_cd());
				csR.ext_inpt_act_no(iaR.ext_inpt_act_no());
				setNotDupImpCache(getCacheKey(dataTyp, iaR.inpt_schd_no()), csR);
			}
		}

		if (!cchL.isEmpty()) {
			setActLCache(getCacheKey(dataTyp, mfgActNo), cchL);
		}
	}

	protected void initWkActCache() {
		MCList<MST_WK_ACT_R> waL = MCList.create(MST_WK_ACT_R.class);
		MST_WK_ACT_R t = MST_WK_ACT_R.create("T");
		MCQueryApiBuilder waL_bldr = MCQueryApiBuilder.create(t);
		MST_WK_ACT_REM_R t2 = MST_WK_ACT_REM_R.create("T2");
		MSW_MFG_ACT_KEY_R w1 = MSW_MFG_ACT_KEY_R.create("W1");
		waL.addStringColumn("mfg_sts_typ");
		waL.addStringColumn("oper_inst_no");

		waL_bldr.setSelect(t.wk_act_no);
		waL_bldr.addSelect(t.mfg_act_no);
		waL_bldr.addSelect(t.itm_mfg_inst_no);
		waL_bldr.addSelect(t.oper_act_no);
		waL_bldr.addSelect(t.wk_schd_no);
		waL_bldr.addSelect(t.div_seq);
		waL_bldr.addSelect(t.wk_cost_cd);
		waL_bldr.addSelect(t.wk_cost);
		waL_bldr.addSelect(t.st_tm);
		waL_bldr.addSelect(t.end_tm);
		waL_bldr.addSelect(t.brk_pd);
		waL_bldr.addSelect(t.ac_dt);
		waL_bldr.addSelect(t.wk_rsn_cd);
		waL_bldr.addSelect(t.wk_cost_calc_ctl_flg);
		waL_bldr.addSelect(t.wk_day_cd);
		waL_bldr.addSelect(t.dpt_cd);
		waL_bldr.addSelect(t.loc_cd);
		waL_bldr.addSelect(t.str_ln_cd);
		waL_bldr.addSelect(t.wk_usr_dpt_cd);
		waL_bldr.addSelect(t.wk_usr_cd);
		waL_bldr.addSelect(t.fclty);
		waL_bldr.addSelect(t.oper_cd);
		waL_bldr.addSelect(t.sno1);
		waL_bldr.addSelect(t.sno2);
		waL_bldr.addSelect(t.sno3);
		waL_bldr.addSelect(t.sno4);
		waL_bldr.addSelect(t.itm_cd);
		waL_bldr.addSelect(t.itm_sub1);
		waL_bldr.addSelect(t.itm_sub2);
		waL_bldr.addSelect(t.itm_sub3);
		waL_bldr.addSelect(t.lot_no);
		waL_bldr.addSelect(t.sublot_no);
		waL_bldr.addSelect(t.dpt_wg_cd);
		waL_bldr.addSelect(t.loc_wg_cd);
		waL_bldr.addSelect(t.mes_flg);
		waL_bldr.addSelect(t.ext_sys_cd);
		waL_bldr.addSelect(t.ext_wk_act_no);
		waL_bldr.addSelect(t.intr_rmrks);
		waL_bldr.addSelect(t.sub_char1);
		waL_bldr.addSelect(t.sub_char2);
		waL_bldr.addSelect(t.sub_char3);

		waL_bldr.addSelect(t2.mfg_sts_typ.as("mfg_sts_typ"));
		waL_bldr.addSelect(t2.oper_inst_no.as("oper_inst_no"));
		waL_bldr.addLeftOuterJoin(t2, bracket(t2.wk_schd_no.eq(t.wk_schd_no)
				.and(t2.div_seq.eq(t.div_seq))));

		waL_bldr.addInnerJoin(w1, bracket(t.mfg_act_no.eq(w1.mfg_act_no)));
		waL_bldr.addWhereWithAnd(t.div_seq.eq(value(1)));

		waL_bldr.setOrderByAsc(t.mfg_act_no, t.wk_schd_no, t.wk_act_no);

		dbSelect("MSLAL6220_MST_WK_ACT_S02", waL, waL_bldr);

		String mfgActNo = null;
		String dataTyp = MAC_IF_PROC_TYP.MES_WK_ACT_RECV.value();
		MCList<MCRow> cchL = MCList.create(MCRow.class);
		for (MST_WK_ACT_R waR : waL) {
			if (!isSame(mfgActNo, waR.mfg_act_no())) {
				if (!cchL.isEmpty()) {
					setActLCache(getCacheKey(dataTyp, mfgActNo), cchL);
					cchL = MCList.create(MCRow.class);
				}
				mfgActNo = waR.mfg_act_no();
			}

			cchL.add(waR);
			setActRCache(getCacheKey(dataTyp, waR.wk_act_no()), waR);

			if (waR.mes_flg() && !isNull(waR.ext_wk_act_no()) && !isNull(waR.wk_schd_no())) {
				MfgActRecvIf_Upd02_ActLstR csR = MfgActRecvIf_Upd02_ActLstR.create();
				csR.wk_schd_no(waR.wk_schd_no());
				csR.wk_act_no(waR.wk_act_no());
				csR.ext_sys_cd(waR.ext_sys_cd());
				csR.ext_wk_act_no(waR.ext_wk_act_no());
				setNotDupImpCache(getCacheKey(dataTyp, waR.wk_schd_no()), csR);
			}
		}

		if (!cchL.isEmpty()) {
			setActLCache(getCacheKey(dataTyp, mfgActNo), cchL);
		}
	}

	protected void initYieldActCache() {
		MCList<MST_YIELD_ACT_R> yaL = MCList.create(MST_YIELD_ACT_R.class);
		MST_YIELD_ACT_R t = MST_YIELD_ACT_R.create("T");
		MCQueryApiBuilder yaL_bldr = MCQueryApiBuilder.create(t);
		MST_YIELD_ACT_REM_R t2 = MST_YIELD_ACT_REM_R.create("T2");
		MST_ITM_MFG_INST_R t3 = MST_ITM_MFG_INST_R.create("T3");
		MSW_MFG_ACT_KEY_R w1 = MSW_MFG_ACT_KEY_R.create("W1");
		yaL.addStringColumn("mfg_sts_typ");
		yaL.addStringColumn("oper_inst_no");
		yaL.addBooleanColumn("unschd_act_flg");

		yaL_bldr.setSelect(t.yield_act_no);
		yaL_bldr.addSelect(t.mfg_act_no);
		yaL_bldr.addSelect(t.itm_mfg_inst_no);
		yaL_bldr.addSelect(t.oper_act_no);
		yaL_bldr.addSelect(t.yield_schd_no);
		yaL_bldr.addSelect(t.div_seq);
		yaL_bldr.addSelect(t.mfg_mtd_typ);
		yaL_bldr.addSelect(t.itm_cd);
		yaL_bldr.addSelect(t.itm_sub1);
		yaL_bldr.addSelect(t.itm_sub2);
		yaL_bldr.addSelect(t.itm_sub3);
		yaL_bldr.addSelect(t.trd_unit_qty);
		yaL_bldr.addSelect(t.trd_unit_cd);
		yaL_bldr.addSelect(t.base_unit_qty);
		yaL_bldr.addSelect(t.base_unit_cd);
		yaL_bldr.addSelect(t.yield_typ);
		yaL_bldr.addSelect(t.yield_rate);
		yaL_bldr.addSelect(t.lot_no);
		yaL_bldr.addSelect(t.sublot_no);
		yaL_bldr.addSelect(t.sno1);
		yaL_bldr.addSelect(t.sno2);
		yaL_bldr.addSelect(t.sno3);
		yaL_bldr.addSelect(t.sno4);
		yaL_bldr.addSelect(t.quality_typ);
		yaL_bldr.addSelect(t.stk_insp_typ);
		yaL_bldr.addSelect(t.gd_cd);
		yaL_bldr.addSelect(t.yield_rsn_cd);
		yaL_bldr.addSelect(t.yield_loc_cd);
		yaL_bldr.addSelect(t.yield_str_ln_cd);
		yaL_bldr.addSelect(t.strg_loc_cd);
		yaL_bldr.addSelect(t.strg_str_ln_cd);
		yaL_bldr.addSelect(t.act_tm);
		yaL_bldr.addSelect(t.ac_dt);
		yaL_bldr.addSelect(t.bkf_ctl_flg);
		yaL_bldr.addSelect(t.lot_ctl_flg);
		yaL_bldr.addSelect(t.sublot_ctl_flg);
		yaL_bldr.addSelect(t.stk_lst_prnt_flg);
		yaL_bldr.addSelect(t.not_stk_flg);
		yaL_bldr.addSelect(t.data_no);
		yaL_bldr.addSelect(t.mes_id);
		yaL_bldr.addSelect(t.mes_flg);
		yaL_bldr.addSelect(t.ext_sys_cd);
		yaL_bldr.addSelect(t.ext_yield_act_no);
		yaL_bldr.addSelect(t.intr_rmrks);
		yaL_bldr.addSelect(t.act_rpt_rmrks);
		yaL_bldr.addSelect(t.insp_cnt_rmrks);
		yaL_bldr.addSelect(t.trd_rmrks);
		yaL_bldr.addSelect(t.sub_char1);
		yaL_bldr.addSelect(t.sub_char2);
		yaL_bldr.addSelect(t.sub_char3);

		yaL_bldr.addSelect(t2.mfg_sts_typ.as("mfg_sts_typ"));
		yaL_bldr.addSelect(t2.oper_inst_no.as("oper_inst_no"));
		yaL_bldr.addSelect(t3.unschd_act_flg.as("unschd_act_flg"));
		yaL_bldr.addLeftOuterJoin(t2, bracket(t2.yield_schd_no.eq(t.yield_schd_no)
				.and(t2.div_seq.eq(t.div_seq))));
		yaL_bldr.addLeftOuterJoin(t3, bracket(t3.itm_mfg_inst_no.eq(t.itm_mfg_inst_no)
				.and(t3.can_flg.eq(value(false)))));
		
		yaL_bldr.addInnerJoin(w1, bracket(t.mfg_act_no.eq(w1.mfg_act_no)));
		yaL_bldr.addWhereWithAnd(t.div_seq.eq(value(1)));

		yaL_bldr.setOrderByAsc(t.mfg_act_no, t.yield_schd_no, t.yield_act_no);

		dbSelect("MSLAL6220_MST_YIELD_ACT_S03", yaL, yaL_bldr);

		String mfgActNo = null;
		String dataTyp = MAC_IF_PROC_TYP.MES_YIELD_ACT_RECV.value();
		MCList<MCRow> cchL = MCList.create(MCRow.class);
		for (MST_YIELD_ACT_R yaR : yaL) {
			if (!isSame(mfgActNo, yaR.mfg_act_no())) {
				if (!cchL.isEmpty()) {
					setActLCache(getCacheKey(dataTyp, mfgActNo), cchL);
					cchL = MCList.create(MCRow.class);
				}
				mfgActNo = yaR.mfg_act_no();
			}

			cchL.add(yaR);
			setActRCache(getCacheKey(dataTyp, yaR.yield_act_no()), yaR);

			if (yaR.mes_flg() && !isNull(yaR.ext_yield_act_no()) && !isNull(yaR.yield_schd_no())) {
				MfgActRecvIf_Upd02_ActLstR csR = MfgActRecvIf_Upd02_ActLstR.create();
				csR.yield_schd_no(yaR.yield_schd_no());
				csR.yield_act_no(yaR.yield_act_no());
				csR.ext_sys_cd(yaR.ext_sys_cd());
				csR.ext_yield_act_no(yaR.ext_yield_act_no());
				setNotDupImpCache(getCacheKey(dataTyp, yaR.yield_schd_no()), csR);
			}
		}

		if (!cchL.isEmpty()) {
			setActLCache(getCacheKey(dataTyp, mfgActNo), cchL);
		}
	}

	protected void initOperInstCache() {
		MCList<MST_OPER_INST_R> oiL = MCList.create(MST_OPER_INST_R.class);
		MST_OPER_INST_R t = MST_OPER_INST_R.create("T");
		MCQueryApiBuilder oiL_bldr = MCQueryApiBuilder.create(t);
		MSW_MFG_INST_KEY_R w1 = MSW_MFG_INST_KEY_R.create("W1");
		oiL_bldr.setSelect(t.oper_inst_no);
		oiL_bldr.addSelect(t.mfg_inst_no);
		oiL_bldr.addSelect(t.itm_mfg_inst_no);
		oiL_bldr.addSelect(t.oper_ord_no);
		oiL_bldr.addSelect(t.disp_seq);
		oiL_bldr.addSelect(t.oper_cd);
		oiL_bldr.addSelect(t.oper_seq);
		oiL_bldr.addSelect(t.st_schd_tm);
		oiL_bldr.addSelect(t.end_schd_tm);
		oiL_bldr.addSelect(t.oper_loc_cd);
		oiL_bldr.addSelect(t.oper_str_ln_cd);
		oiL_bldr.addSelect(t.base_unit_qty);
		oiL_bldr.addSelect(t.base_unit_cd);
		oiL_bldr.addSelect(t.oper_std_qty);
		oiL_bldr.addSelect(t.oper_conv_qty);
		oiL_bldr.addSelect(t.oper_unit_cd);
		oiL_bldr.addSelect(t.oper_unit_conv_rnd_typ);
		oiL_bldr.addSelect(t.oper_unit_dec_place);
		oiL_bldr.addSelect(t.unschd_inst_flg);
		oiL_bldr.addSelect(t.unschd_act_flg);
		oiL_bldr.addSelect(t.bkf_flg);
		oiL_bldr.addSelect(t.wk_cost_calc_flg);
		oiL_bldr.addSelect(t.oper_inst_grp);
		oiL_bldr.addSelect(t.usr_cd);
		oiL_bldr.addSelect(t.oper_lt);
		oiL_bldr.addSelect(t.oper_lt_add_qty);
		oiL_bldr.addSelect(t.oper_offst_typ);
		oiL_bldr.addSelect(t.oper_offst);
		oiL_bldr.addSelect(t.oper_offst_add_qty);
		oiL_bldr.addSelect(t.lmt_fr_dt_flg);
		oiL_bldr.addSelect(t.oper_lower_yield);
		oiL_bldr.addSelect(t.oper_std_yield);
		oiL_bldr.addSelect(t.oper_upper_yield);
		oiL_bldr.addSelect(t.wip_rate);
		oiL_bldr.addSelect(t.yield_oper_flg);
		oiL_bldr.addSelect(t.yield_oper_ratio);
		oiL_bldr.addSelect(t.can_flg);
		oiL_bldr.addSelect(t.oper_abort_flg);
		oiL_bldr.addSelect(t.mes_flg);
		oiL_bldr.addSelect(t.intr_rmrks);
		oiL_bldr.addSelect(t.inst_rpt_rmrks);
		oiL_bldr.addSelect(t.sub_char1);
		oiL_bldr.addSelect(t.sub_char2);
		oiL_bldr.addSelect(t.sub_char3);

		oiL_bldr.addInnerJoin(w1, bracket(t.mfg_inst_no.eq(w1.mfg_inst_no)));
		oiL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));

		oiL_bldr.setOrderByAsc(t.mfg_inst_no, t.oper_inst_no);

		dbSelect("MSLAL6220_MST_OPER_INST_S02", oiL, oiL_bldr);

		String mfgInstNo = null;
		String dataTyp = MAC_IF_PROC_TYP.MES_OPER_INST_SEND.value();
		MCList<MCRow> cchL = MCList.create(MCRow.class);
		for (MST_OPER_INST_R oiR : oiL) {
			if (!isSame(mfgInstNo, oiR.mfg_inst_no())) {
				if (!cchL.isEmpty()) {
					setSchdLCache(getCacheKey(dataTyp, mfgInstNo), cchL);
					cchL = MCList.create(MCRow.class);
				}
				mfgInstNo = oiR.mfg_inst_no();
			}

			cchL.add(oiR);
			setSchdRCache(getCacheKey(dataTyp, oiR.oper_inst_no()), oiR);
		}

		if (!cchL.isEmpty()) {
			setSchdLCache(getCacheKey(dataTyp, mfgInstNo), cchL);
		}
	}

	protected void initInptSchdCache() {
		MCList<MST_INPT_SCHD_R> isL = MCList.create(MST_INPT_SCHD_R.class);
		MST_INPT_SCHD_R t = MST_INPT_SCHD_R.create("T");
		MCQueryApiBuilder isL_bldr = MCQueryApiBuilder.create(t);
		MSW_MFG_INST_KEY_R w1 = MSW_MFG_INST_KEY_R.create("W1");
		isL.addBooleanColumn("has_alloc_sno_flg");

		isL_bldr.setSelect(t.inpt_schd_no);
		isL_bldr.addSelect(t.mfg_inst_no);
		isL_bldr.addSelect(t.itm_mfg_inst_no);
		isL_bldr.addSelect(t.oper_inst_no);
		isL_bldr.addSelect(t.schd_tm);
		isL_bldr.addSelect(t.alt_grp_cd);
		isL_bldr.addSelect(t.alt_grp_seq);
		isL_bldr.addSelect(t.itm_cd);
		isL_bldr.addSelect(t.itm_sub1);
		isL_bldr.addSelect(t.itm_sub2);
		isL_bldr.addSelect(t.itm_sub3);
		isL_bldr.addSelect(t.ver_no);
		isL_bldr.addSelect(t.base_unit_inpt_qty);
		isL_bldr.addSelect(t.base_unit_rqmt_qty);
		isL_bldr.addSelect(t.base_unit_fxd_rqmt_qty);
		isL_bldr.addSelect(t.base_unit_cd);
		isL_bldr.addSelect(t.inpt_loc_cd);
		isL_bldr.addSelect(t.inpt_str_ln_cd);
		isL_bldr.addSelect(t.gd_cd);
		isL_bldr.addSelect(nvl( t.lot_no, value(MAC_STR.NULL_VAL.value())).as("lot_no"));
		isL_bldr.addSelect(nvl( t.sublot_no, value(MAC_STR.NULL_VAL.value())).as("sublot_no"));
		isL_bldr.addSelect(t.sno1);
		isL_bldr.addSelect(t.sno1_null_flg);
		isL_bldr.addSelect(t.sno2);
		isL_bldr.addSelect(t.sno2_null_flg);
		isL_bldr.addSelect(t.sno3);
		isL_bldr.addSelect(t.sno3_null_flg);
		isL_bldr.addSelect(t.sno4);
		isL_bldr.addSelect(t.sno4_null_flg);
		isL_bldr.addSelect(nvl(t.alloc_sno1, value(MAC_STR.NULL_VAL.value())).as("alloc_sno1"));
		isL_bldr.addSelect(nvl(t.alloc_sno2, value(MAC_STR.NULL_VAL.value())).as("alloc_sno2"));
		isL_bldr.addSelect(nvl(t.alloc_sno3, value(MAC_STR.NULL_VAL.value())).as("alloc_sno3"));
		isL_bldr.addSelect(nvl(t.alloc_sno4, value(MAC_STR.NULL_VAL.value())).as("alloc_sno4"));
		isL_bldr.addSelect(nvl2( coalesce(t.alloc_sno1, t.alloc_sno2, t.alloc_sno3, t.alloc_sno4 ), value(true), value(false)).as("has_alloc_sno_flg"));
		isL_bldr.addSelect(t.bkf_typ);
		isL_bldr.addSelect(t.cont_inpt_qty);
		isL_bldr.addSelect(t.cont_rqmt_qty);
		isL_bldr.addSelect(t.cont_fxd_rqmt_qty);
		isL_bldr.addSelect(t.cont_fctr_unit_cd);
		isL_bldr.addSelect(t.std_cont_fctr);
		isL_bldr.addSelect(t.act_cont_fctr);
		isL_bldr.addSelect(t.prov_typ);
		isL_bldr.addSelect(t.par_inst_qty);
		isL_bldr.addSelect(t.chd_inpt_qty);
		isL_bldr.addSelect(t.chd_rqmt_qty);
		isL_bldr.addSelect(t.fxd_chd_rqmt_qty);
		isL_bldr.addSelect(t.main_itm_flg);
		isL_bldr.addSelect(t.inst_lot_fix_flg);
		isL_bldr.addSelect(t.disp_seq);
		isL_bldr.addSelect(t.lot_mix_flg);
		isL_bldr.addSelect(t.sublot_mix_flg);
		isL_bldr.addSelect(t.bom_memo1);
		isL_bldr.addSelect(t.bom_memo2);
		isL_bldr.addSelect(t.bom_memo3);
		isL_bldr.addSelect(t.yield_calc_flg);
		isL_bldr.addSelect(t.alloc_flg);
		isL_bldr.addSelect(t.base_unit_alt_qty);
		isL_bldr.addSelect(t.alt_itm_fix_flg);
		isL_bldr.addSelect(t.alt_itm_typ);
		isL_bldr.addSelect(t.alt_alloc_prio);
		isL_bldr.addSelect(t.alt_itm_ratio);
		isL_bldr.addSelect(t.alloc_ctl_typ);
		isL_bldr.addSelect(t.inpt_ctl_typ);
		isL_bldr.addSelect(t.in_offst_typ);
		isL_bldr.addSelect(t.in_offst);
		isL_bldr.addSelect(t.bom_id_no);
		isL_bldr.addSelect(t.chd_itm_seq);
		isL_bldr.addSelect(t.recalc_grp);
		isL_bldr.addSelect(t.recalc_grp_seq);
		isL_bldr.addSelect(t.can_flg);
		isL_bldr.addSelect(t.intr_rmrks);
		isL_bldr.addSelect(t.inst_rpt_rmrks);
		isL_bldr.addSelect(t.sub_char1);
		isL_bldr.addSelect(t.sub_char2);
		isL_bldr.addSelect(t.sub_char3);

		isL_bldr.addInnerJoin(w1, bracket(t.mfg_inst_no.eq(w1.mfg_inst_no)));
		isL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));

		isL_bldr.setOrderByAsc(t.mfg_inst_no, t.oper_inst_no, t.itm_cd, t.inpt_schd_no);

		dbSelect("MSLAL6220_MST_INPT_SCHD_S03", isL, isL_bldr);

		String mfgInstNo = null;
		String dataTyp = MAC_IF_PROC_TYP.MES_INPT_SCHD_SEND.value();
		MCList<MCRow> cchL = MCList.create(MCRow.class);
		for (MST_INPT_SCHD_R isR : isL) {
			if (!isSame(mfgInstNo, isR.mfg_inst_no())) {
				if (!cchL.isEmpty()) {
					setSchdLCache(getCacheKey(dataTyp, mfgInstNo), cchL);
					cchL = MCList.create(MCRow.class);
				}
				mfgInstNo = isR.mfg_inst_no();
			}

			cchL.add(isR);
			setSchdRCache(getCacheKey(dataTyp, isR.inpt_schd_no()), isR);
		}

		if (!cchL.isEmpty()) {
			setSchdLCache(getCacheKey(dataTyp, mfgInstNo), cchL);
		}
	}

	protected void initWkSchdCache() {
		MCList<MST_WK_SCHD_R> wsL = MCList.create(MST_WK_SCHD_R.class);
		MST_WK_SCHD_R t = MST_WK_SCHD_R.create("T");
		MCQueryApiBuilder wsL_bldr = MCQueryApiBuilder.create(t);
		MSW_MFG_INST_KEY_R w1 = MSW_MFG_INST_KEY_R.create("W1");
		wsL_bldr.setSelect(t.wk_schd_no);
		wsL_bldr.addSelect(t.mfg_inst_no);
		wsL_bldr.addSelect(t.itm_mfg_inst_no);
		wsL_bldr.addSelect(t.oper_inst_no);
		wsL_bldr.addSelect(t.wk_cost_cd);
		wsL_bldr.addSelect(t.wk_cost_calc_flg);
		wsL_bldr.addSelect(t.fxd_wk_cost);
		wsL_bldr.addSelect(t.wk_cost);
		wsL_bldr.addSelect(t.mst_fxd_wk_cost);
		wsL_bldr.addSelect(t.mst_wk_cost);
		wsL_bldr.addSelect(t.disp_seq);
		wsL_bldr.addSelect(t.intr_rmrks);
		wsL_bldr.addSelect(t.sub_char1);
		wsL_bldr.addSelect(t.sub_char2);
		wsL_bldr.addSelect(t.sub_char3);

		wsL_bldr.addInnerJoin(w1, bracket(t.mfg_inst_no.eq(w1.mfg_inst_no)));
		wsL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));

		wsL_bldr.setOrderByAsc(t.mfg_inst_no, t.oper_inst_no, t.wk_cost_cd);

		dbSelect("MSLAL6220_MST_WK_SCHD_S02", wsL, wsL_bldr);

		String mfgInstNo = null;
		MCList<MCRow> cchL = MCList.create(MCRow.class);
		for (MST_WK_SCHD_R wsR : wsL) {
			if (!isSame(mfgInstNo, wsR.mfg_inst_no())) {
				if (!cchL.isEmpty()) {
					setSchdLCache(getCacheKey(null, mfgInstNo), cchL);
					cchL = MCList.create(MCRow.class);
				}
				mfgInstNo = wsR.mfg_inst_no();
			}

			cchL.add(wsR);
			setSchdRCache(getCacheKey(null, wsR.wk_schd_no()), wsR);
		}

		if (!cchL.isEmpty()) {
			setSchdLCache(getCacheKey(null, mfgInstNo), cchL);
		}
	}

	protected void initYieldSchdCache() {
		MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
		MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
		MCQueryApiBuilder ysL_bldr = MCQueryApiBuilder.create(t);
		MSW_MFG_INST_KEY_R w1 = MSW_MFG_INST_KEY_R.create("W1");
		ysL_bldr.setSelect(t.yield_schd_no);
		ysL_bldr.addSelect(t.mfg_inst_no);
		ysL_bldr.addSelect(t.itm_mfg_inst_no);
		ysL_bldr.addSelect(t.oper_inst_no);
		ysL_bldr.addSelect(t.io_schd_pr_no);
		ysL_bldr.addSelect(t.yield_typ);
		ysL_bldr.addSelect(t.schd_tm);
		ysL_bldr.addSelect(t.itm_cd);
		ysL_bldr.addSelect(t.itm_sub1);
		ysL_bldr.addSelect(t.itm_sub2);
		ysL_bldr.addSelect(t.itm_sub3);
		ysL_bldr.addSelect(t.trd_unit_yield_qty);
		ysL_bldr.addSelect(t.trd_unit_cd);
		ysL_bldr.addSelect(t.base_unit_yield_qty);
		ysL_bldr.addSelect(t.base_unit_cd);
		ysL_bldr.addSelect(t.lot_no);
		ysL_bldr.addSelect(t.sublot_no);
		ysL_bldr.addSelect(t.sno1);
		ysL_bldr.addSelect(t.sno2);
		ysL_bldr.addSelect(t.sno3);
		ysL_bldr.addSelect(t.sno4);
		ysL_bldr.addSelect(t.strg_loc_cd);
		ysL_bldr.addSelect(t.strg_str_ln_cd);
		ysL_bldr.addSelect(t.bkf_typ);
		ysL_bldr.addSelect(t.par_inst_qty);
		ysL_bldr.addSelect(t.chd_inpt_qty);
		ysL_bldr.addSelect(t.chd_rqmt_qty);
		ysL_bldr.addSelect(t.fxd_chd_rqmt_qty);
		ysL_bldr.addSelect(t.can_flg);
		ysL_bldr.addSelect(t.disp_seq);
		ysL_bldr.addSelect(t.intr_rmrks);
		ysL_bldr.addSelect(t.inst_rpt_rmrks);
		ysL_bldr.addSelect(t.insp_cnt_rmrks);
		ysL_bldr.addSelect(t.sub_char1);
		ysL_bldr.addSelect(t.sub_char2);
		ysL_bldr.addSelect(t.sub_char3);

		ysL_bldr.addInnerJoin(w1, bracket(t.mfg_inst_no.eq(w1.mfg_inst_no)));
		ysL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));

		ysL_bldr.setOrderByAsc(t.mfg_inst_no, t.oper_inst_no, t.itm_cd, t.yield_schd_no);

		dbSelect("MSLAL6220_MST_YIELD_SCHD_S03", ysL, ysL_bldr);

		String mfgInstNo = null;
		String dataTyp = MAC_IF_PROC_TYP.MES_YIELD_SCHD_SEND.value();
		MCList<MCRow> cchL = MCList.create(MCRow.class);
		for (MST_YIELD_SCHD_R ysR : ysL) {
			if (!isSame(mfgInstNo, ysR.mfg_inst_no())) {
				if (!cchL.isEmpty()) {
					setSchdLCache(getCacheKey(dataTyp, mfgInstNo), cchL);
					cchL = MCList.create(MCRow.class);
				}
				mfgInstNo = ysR.mfg_inst_no();
			}

			cchL.add(ysR);
			setSchdRCache(getCacheKey(dataTyp, ysR.yield_schd_no()), ysR);
		}

		if (!cchL.isEmpty()) {
			setSchdLCache(getCacheKey(dataTyp, mfgInstNo), cchL);
		}
	}

	protected void _clearCache() {
		if (object(CLAZZ)._actLCache != null) {
			object(CLAZZ)._actLCache = null;
		}
		if (object(CLAZZ)._actRCache != null) {
			object(CLAZZ)._actRCache = null;
		}
		if (object(CLAZZ)._schdLCache != null) {
			object(CLAZZ)._schdLCache = null;
		}
		if (object(CLAZZ)._schdRCache != null) {
			object(CLAZZ)._schdRCache = null;
		}
		if (object(CLAZZ)._notDupImpCache != null) {
			object(CLAZZ)._notDupImpCache = null;
		}
	}

	protected String[] getCacheKey(String dataTyp, String keyNo) {
		return new String[] {
				nvl(dataTyp, MAC_STR.NULL_VAL.value()),
				nvl(keyNo, MAC_STR.NULL_VAL.value())
		};
	}

	/**
	 * MfgActRecvIf_Chk02オペレーション.<p>
	 *
	 * 計画外実績登録チェック<br>
	 * 新規行を対象にチェックを行う
	 */
	public class MfgActRecvIf_Chk02 extends MSLAL_MfgActRecvIfService_MC_A.MfgActRecvIf_Chk02 {
		/** 品目マスタキャッシュ */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItmL = null;
		/** 品目マスタ（工場・物流倉庫）キャッシュ */
		protected FXUCL_MCDbcCache<MAM_ITM_SITE_R> _cacheItmSiteL = null;
		/** 品目詳細マスタキャッシュ **/
		protected MCList<MAM_ITM_DTL_R> _cacheItmDtlL = null;
		protected MCIndexKey _idxItmDtlCache = null;
		
		/** 出来高実績キャッシュ */
		protected MCList<MST_YIELD_ACT_R> _yieldActDBL = null;
		protected MCIndexKey _idxYieldActDBCache = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			setDown();
		}
		
		/**
		 * 各種キャッシュ作成
		 */
		protected void createCache() {
			createItmMstCache();
			createItmSiteCache();
			createItmDtlCache();
			createYieldActCache();
		}
		
		/**
		 * 出来高実績のキャッシュ作成
		 */
		protected void createYieldActCache() {
			if (up0().isEmpty()) {
				return;
			}
			
			// 出来高実績のキャッシュ
			_yieldActDBL = MCList.create(MST_YIELD_ACT_R.class);
			MST_YIELD_ACT_R t = MST_YIELD_ACT_R.create("T");
			MCQueryApiBuilder _yieldActDBL_bldr = MCQueryApiBuilder.create(t);
			_yieldActDBL_bldr.setSelect(t.ext_yield_act_no);
			_yieldActDBL_bldr.setWhere(t.ext_yield_act_no.eq(bind("ext_yield_act_no")));
			dbSelect("MSLAL6220_MST_YIELD_ACT_S04", _yieldActDBL, _yieldActDBL_bldr, up0());
			
			_idxYieldActDBCache = _yieldActDBL.createIndex(MST_YIELD_ACT_R.$ext_yield_act_no);
		}
		
		/**
		 * 品目マスタのキャッシュ作成
		 */
		protected void createItmMstCache() {
			if (up0().isEmpty()) {
				return;
			}
			
			// 品目マスタのキャッシュ
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbcItmL_bldr = MCQueryApiBuilder.create(t);
			MAM_NUM_PTN_R m2 = MAM_NUM_PTN_R.create("M2");
			MAM_NUM_PTN_R m3 = MAM_NUM_PTN_R.create("M3");
			dbcItmL_bldr.setSelect(t.itm_cd);
			dbcItmL_bldr.addSelect(t.itm_sub1);
			dbcItmL_bldr.addSelect(t.itm_sub2);
			dbcItmL_bldr.addSelect(t.itm_sub3);
			dbcItmL_bldr.addSelect(t.itm_typ);
			dbcItmL_bldr.addSelect(m2.elm_typ1.as("lot_elm_typ1"));
			dbcItmL_bldr.addSelect(m3.elm_typ1.as("sublot_elm_typ1"));
			dbcItmL_bldr.addLeftOuterJoin(m2,
					bracket(m2.num_biz_typ.eq(value(MAC_NUM_BIZ_TYP.LOT.value()))
							.and(m2.num_ptn_cd.eq(t.lot_no_ptn_cd)))); // ロットＮＯ発番パタンと発番パタンマスタのJOIN
			dbcItmL_bldr.addLeftOuterJoin(m3,
					bracket(m3.num_biz_typ.eq(value(MAC_NUM_BIZ_TYP.SUBLOT.value()))
							.and(m3.num_ptn_cd.eq(t.sublot_no_ptn_cd)))); // サブロットＮＯ発番パタンと発番パタンマスタのJOIN
			
			_cacheItmL = new FXUCL_MCDbcCache<>(dbcItmL_bldr, up0(), new String[] {
					MfgActRecvIf_Chk02_ActLstR.$mfg_itm_cd, MfgActRecvIf_Chk02_ActLstR.$mfg_itm_sub1,
					MfgActRecvIf_Chk02_ActLstR.$mfg_itm_sub2, MfgActRecvIf_Chk02_ActLstR.$mfg_itm_sub3
			});
		}
		
		/**
		 * 品目マスタ（工場・物流倉庫）のキャッシュ作成
		 */
		protected void createItmSiteCache() {
			if (up0().isEmpty()) {
				return;
			}
			
			MAM_ITM_SITE_R t = MAM_ITM_SITE_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(
					t.itm_cd,
					t.itm_sub1,
					t.itm_sub2,
					t.itm_sub3,
					t.mfg_aprv_flg
					);
			
			_cacheItmSiteL = new FXUCL_MCDbcCache<MAM_ITM_SITE_R>(dbc_bldr, up0(), new String[] {
					MfgActRecvIf_Chk02_ActLstR.$mfg_itm_cd, MfgActRecvIf_Chk02_ActLstR.$mfg_itm_sub1, 
					MfgActRecvIf_Chk02_ActLstR.$mfg_itm_sub2, MfgActRecvIf_Chk02_ActLstR.$mfg_itm_sub3,
					MfgActRecvIf_Chk02_ActLstR.$site_cd
			});
		}
		
		/**
		 * 品目詳細マスタのキャッシュ作製
		 */
		protected void createItmDtlCache() {
			_cacheItmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
			MCQueryApiBuilder cacheItmDtlL_bldr = MCQueryApiBuilder.create(t);
			cacheItmDtlL_bldr.setSelect(
					t.itm_cd,
					t.itm_sub1,
					t.itm_sub2,
					t.itm_sub3,
					t.mfg_loc_cd,
					t.wg_cd,
					t.bom_ptn,
					t.oper_ptn,
					t.no_mfg_aprv_flg
					);
			
			cacheItmDtlL_bldr.setWhere(t.itm_cd.eq(bind("mfg_itm_cd")));
			cacheItmDtlL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("mfg_itm_sub1")));
			cacheItmDtlL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("mfg_itm_sub2")));
			cacheItmDtlL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("mfg_itm_sub3")));
			cacheItmDtlL_bldr.addWhereWithAnd(t.mfg_loc_cd.eq(bind("mfg_loc_cd")));
			cacheItmDtlL_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			cacheItmDtlL_bldr.addWhereWithAnd(t.bom_ptn.eq(bind("bom_ptn")));
			cacheItmDtlL_bldr.addWhereWithAnd(t.oper_ptn.eq(bind("oper_ptn")));
			cacheItmDtlL_bldr.addWhereWithAnd(bind("act_tm").between(t.st_dt, t.end_dt));
			cacheItmDtlL_bldr.addConstWhereWithAnd(t.sppl_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.and(t.maker_cd.eq(value(MAC_STR.NULL_VAL.value())))
							.and(t.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value()))));
			dbSelect("MSLAL6220_MAM_ITM_DTL_S02", _cacheItmDtlL, cacheItmDtlL_bldr, up0(), null);
			
			_idxItmDtlCache = _cacheItmDtlL.createIndex(
					MAM_ITM_DTL_R.$itm_cd,
					MAM_ITM_DTL_R.$itm_sub1,
					MAM_ITM_DTL_R.$itm_sub2,
					MAM_ITM_DTL_R.$itm_sub3,
					MAM_ITM_DTL_R.$mfg_loc_cd,
					MAM_ITM_DTL_R.$wg_cd,
					MAM_ITM_DTL_R.$bom_ptn,
					MAM_ITM_DTL_R.$oper_ptn
					);
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			createCache();
			
			// 条件付き必須チェック
			msgL.addAll(checkReqByCond());
			
			// 登録可能チェック
			msgL.addAll(checkRegistrable());
			
			return msgL;
		}
		
		/**
		 * 条件付き必須チェック
		 * @return チェックメッセージ
		 */
		protected MCMessageList checkReqByCond() {
			MCMessageList msgL = new MCMessageList();
			
			for (MfgActRecvIf_Chk02_ActLstR upR : up0()) {
				
				// 不良品の場合、出来高理由は必須 
				if (MAC_YIELD_TYP.isDFCT(upR.yield_typ()) && isNull(upR.yield_rsn_cd())) {
					upR.err_flg(true);
					msgL.add(new MCMessage(upR, null, MSLAL0125, upR.data_no(), upR.data_lno()));
				}
				
				// ロット・サブロット
				if (!MAC_LOT_MNG_TYP.isNOT_MNG(upR.lot_mng_typ()) && MAC_LOT_NO_TYP.isMANUAL(upR.lot_no_typ()) && isNullOrNullVal(upR.lot_no())) {
					upR.err_flg(true);
					msgL.add(new MCMessage(upR, null, MSLAL0611, upR.data_no(), upR.data_lno()));
				}
				if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(upR.sublot_mng_typ()) && MAC_LOT_NO_TYP.isMANUAL(upR.sublot_no_typ()) && isNullOrNullVal(upR.sublot_no())) {
					upR.err_flg(true);
					msgL.add(new MCMessage(upR, null, MSLAL0612, upR.data_no(), upR.data_lno()));
				}
				
				// 手配管理品の場合の手配ＮＯ
				if (MAC_SNO_MNG_TYP.isMNG_REQ(upR.sno1_mng_typ()) && isNullOrNullVal(upR.sno1())) {
					upR.err_flg(true);
					msgL.add(new MCMessage(upR, null, MSLAL0613, upR.data_no(), upR.data_lno(), toDispItm(upR.mfg_itm_cd(), upR.mfg_itm_sub1(), upR.mfg_itm_sub2(), upR.mfg_itm_sub3())));
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(upR.sno2_mng_typ()) && isNullOrNullVal(upR.sno2())) {
					upR.err_flg(true);
					msgL.add(new MCMessage(upR, null, MSLAL0614, upR.data_no(), upR.data_lno(), toDispItm(upR.mfg_itm_cd(), upR.mfg_itm_sub1(), upR.mfg_itm_sub2(), upR.mfg_itm_sub3())));
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(upR.sno3_mng_typ()) && isNullOrNullVal(upR.sno3())) {
					upR.err_flg(true);
					msgL.add(new MCMessage(upR, null, MSLAL0615, upR.data_no(), upR.data_lno(), toDispItm(upR.mfg_itm_cd(), upR.mfg_itm_sub1(), upR.mfg_itm_sub2(), upR.mfg_itm_sub3())));
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(upR.sno4_mng_typ()) && isNullOrNullVal(upR.sno4())) {
					upR.err_flg(true);
					msgL.add(new MCMessage(upR, null, MSLAL0616, upR.data_no(), upR.data_lno(), toDispItm(upR.mfg_itm_cd(), upR.mfg_itm_sub1(), upR.mfg_itm_sub2(), upR.mfg_itm_sub3())));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 登録可能チェック
		 * @return チェックメッセージ
		 */
		protected MCMessageList checkRegistrable() {
			MCMessageList msgL = new MCMessageList();
			MCIndexKey dupChkIdx = up0().createIndex(MfgActRecvIf_Chk02_ActLstR.$ext_sys_cd, MfgActRecvIf_Chk02_ActLstR.$ext_yield_act_no);
			
			for (MfgActRecvIf_Chk02_ActLstR upR : up0()) {
				
				// 計画外ＮＯチェック
				if (!isNull(upR.org_yield_schd_no()) || !isNull(upR.org_oper_inst_no()) || !isNull(upR.org_mfg_inst_no()) || !isNull(upR.org_mfg_inst_rev())) {
					upR.err_flg(true);
					msgL.add(new MCMessage(upR, null, MSLAL0617, upR.data_no(), upR.data_lno()));
				}
				
				// 出来高区分チェック（副産品不可）
				if (MAC_YIELD_TYP.isBYPROD(upR.yield_typ())) {
					upR.err_flg(true);
					msgL.add(new MCMessage(upR, null, MSLAL0618, upR.data_no(), upR.data_lno()));
				}
				
				MAM_ITM_R itmR = _cacheItmL.get(upR.mfg_itm_cd(), upR.mfg_itm_sub1(), upR.mfg_itm_sub2(), upR.mfg_itm_sub3());
				if (!isNull(itmR) && !isNull(itmR.itm_cd())) {
					// ロット発番パタン子品目引継ぎチェック
					if (!MAC_LOT_MNG_TYP.isNOT_MNG(upR.lot_mng_typ()) && MAC_ELM_TYP.isCHD_LOT(itmR.getStringNE("LOT_ELM_TYP1"))) {
						upR.err_flg(true);
						msgL.add(new MCMessage(upR, null, MSLAL0621, upR.data_no(), upR.data_lno(), toDispItm(upR.mfg_itm_cd(), upR.mfg_itm_sub1(), upR.mfg_itm_sub2(), upR.mfg_itm_sub3())));
					}
					// サブロット発番パタン子品目引継ぎチェック
					if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(upR.sublot_mng_typ()) && MAC_ELM_TYP.isCHD_SUBLOT(itmR.getStringNE("SUBLOT_ELM_TYP1"))) {
						upR.err_flg(true);
						msgL.add(new MCMessage(upR, null, MSLAL0622, upR.data_no(), upR.data_lno(), toDispItm(upR.mfg_itm_cd(), upR.mfg_itm_sub1(), upR.mfg_itm_sub2(), upR.mfg_itm_sub3())));
					}
				}
				
				// 外注品チェック
				if (!isNull(upR.sppl_cd())) {
					upR.err_flg(true);
					msgL.add(new MCMessage(upR, null, MSLAL0624, upR.data_no(), upR.data_lno(), toDispItm(upR.mfg_itm_cd(), upR.mfg_itm_sub1(), upR.mfg_itm_sub2(), upR.mfg_itm_sub3()), upR.mfg_loc_cd()));
				}
				
				// 手配ＮＯ対象外チェック
				if (MAC_SNO_MNG_TYP.isNOT_MNG(upR.sno1_mng_typ()) && !isNullOrNullVal(upR.sno1())) {
					upR.err_flg(true);
					msgL.add(new MCMessage(upR, null, MSLAL0625, upR.data_no(), upR.data_lno(), toDispItm(upR.mfg_itm_cd(), upR.mfg_itm_sub1(), upR.mfg_itm_sub2(), upR.mfg_itm_sub3())));
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(upR.sno2_mng_typ()) && !isNullOrNullVal(upR.sno2())) {
					upR.err_flg(true);
					msgL.add(new MCMessage(upR, null, MSLAL0626, upR.data_no(), upR.data_lno(), toDispItm(upR.mfg_itm_cd(), upR.mfg_itm_sub1(), upR.mfg_itm_sub2(), upR.mfg_itm_sub3())));
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(upR.sno3_mng_typ()) && !isNullOrNullVal(upR.sno3())) {
					upR.err_flg(true);
					msgL.add(new MCMessage(upR, null, MSLAL0627, upR.data_no(), upR.data_lno(), toDispItm(upR.mfg_itm_cd(), upR.mfg_itm_sub1(), upR.mfg_itm_sub2(), upR.mfg_itm_sub3())));
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(upR.sno4_mng_typ()) && !isNullOrNullVal(upR.sno4())) {
					upR.err_flg(true);
					msgL.add(new MCMessage(upR, null, MSLAL0628, upR.data_no(), upR.data_lno(), toDispItm(upR.mfg_itm_cd(), upR.mfg_itm_sub1(), upR.mfg_itm_sub2(), upR.mfg_itm_sub3())));
				}
				
				// 打切チェック
				if (upR.abort_flg()) {
					upR.err_flg(true);
					msgL.add(new MCMessage(upR, null, MSLAL0630, upR.data_no(), upR.data_lno()));
				}
				
				// 製造承認対象外チェック
				MAM_ITM_SITE_R siteR = _cacheItmSiteL.get(upR.mfg_itm_cd(), upR.mfg_itm_sub1(), upR.mfg_itm_sub2(), upR.mfg_itm_sub3(), upR.site_cd());
				MAM_ITM_DTL_R itmDtlR = _cacheItmDtlL.getFirst(_idxItmDtlCache, upR.mfg_itm_cd(),
						upR.mfg_itm_sub1(), upR.mfg_itm_sub2(), upR.mfg_itm_sub3(), 
						upR.mfg_loc_cd(), upR.wg_cd(), upR.bom_ptn());
				if(isSame(getSysParm("MFG_APRV_ENABLE_FLG"),"1") && (!isNull(siteR.itm_cd()) && siteR.mfg_aprv_flg()) && (!isNull(itmDtlR) && !itmDtlR.no_mfg_aprv_flg())) {
					upR.err_flg(true);
					msgL.add(new MCMessage(upR, null, MSLAL0629, upR.data_no(), upR.data_lno(), toDispItm(upR.mfg_itm_cd(), upR.mfg_itm_sub1(), upR.mfg_itm_sub2(), upR.mfg_itm_sub3())));
				}
				
				// 外部出来高実績ＮＯ重複（同一IF内）チェック
				if (!isNull(upR.ext_yield_act_no()) && up0().subList(dupChkIdx, upR.ext_sys_cd(), upR.ext_yield_act_no()).size() > 1) {
					upR.err_flg(true);
					msgL.add(new MCMessage(upR, null, MSLAL0120, upR.data_no(), upR.data_lno(), upR.ext_yield_act_no(), upR.ext_sys_cd()));
				}
				
				// 外部出来高実績ＮＯ重複（DB内）チェック
				if (!isNull(upR.ext_yield_act_no()) && !_yieldActDBL.isEmpty()) {
					MST_YIELD_ACT_R dupR = _yieldActDBL.getFirst(_idxYieldActDBCache, upR.ext_yield_act_no());
					if (!isNull(dupR)) {
						upR.err_flg(true);
						msgL.add(new MCMessage(upR, null, MSLAL0121, upR.data_no(), upR.data_lno(), upR.ext_yield_act_no(), upR.ext_sys_cd()));
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
		}
	}

	//FMCB CUSTOM END
}