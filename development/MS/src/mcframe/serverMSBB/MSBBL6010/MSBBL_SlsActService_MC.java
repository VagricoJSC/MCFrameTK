package mcframe.serverMSBB.MSBBL6010;

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
import mcframe.commonCore.container.MCRow.Status;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMSUC.MSUCL0020.*;
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMSBB.MSBBL6220.*;
import mcframe.serverMSBB.MSBBL6260.*;
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBE.MSBEL5500.*;
import mcframe.serverMSBE.MSBEL5540.*;
import mcframe.serverMSBE.MSBEL5550.*;
import mcframe.serverMSBE.MSBEL5730.*;
import mcframe.serverMSBG.MSBGL5010.*;
import mcframe.serverMSBG.MSBGL5080.*;
import mcframe.serverMSBI.MSBIL5010.*;
import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import static mcframe.serverMSBB.MSBBL6010.Query.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil;

import java.util.ArrayList;
import java.util.List;
import mcframe.serverMSLA.MSLAL5150.*;
import mcframe.serverMSUC.MSUCL0130.*;
import mcframe.serverMSUC.MSUCL0130.MSUCL_AmtUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SlsActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SlsActService_MC extends MSBBL_SlsActService_MC_A{
	//FMCB CUSTOM START
	protected static final Class<MSBBL_SlsActService> CLAZZ = MSBBL_SlsActService.class;
	
	// 会計理由マスタのキャッシュ
	protected FXUCL_MCDbcCache<MAM_AC_RSN_R> _acRsnR;
	protected static MAM_AC_RSN_R getAcRsn(String acRsnCd) {
		return object(CLAZZ)._getAcRsn(acRsnCd);
	}
	protected MAM_AC_RSN_R _getAcRsn(String acRsnCd) {
		if (_acRsnR == null) {
			_acRsnR = new FXUCL_MCDbcCache<MAM_AC_RSN_R>(MCQueryApiBuilder.create(MAM_AC_RSN_R.create("T")));
		}
		return _acRsnR.get(acRsnCd);
	}
	
	// 業務理由マスタのキャッシュ
	protected FXUCL_MCDbcCache<MAM_BIZ_RSN_R> _bizRsnR;
	protected static MAM_BIZ_RSN_R getBizRsn(String rsnCd) {
		return object(CLAZZ)._getBizRsn(rsnCd);
	}
	protected MAM_BIZ_RSN_R _getBizRsn(String rsnCd) {
		if (_bizRsnR == null) {
			_bizRsnR = new FXUCL_MCDbcCache<MAM_BIZ_RSN_R>(MCQueryApiBuilder.create(MAM_BIZ_RSN_R.create("T")));
		}
		return _bizRsnR.get(rsnCd);
	}
	
	// 通貨マスタのキャッシュ
	protected FXUCL_MCDbcCache<MAM_CUR_R> _curR;
	protected static MAM_CUR_R getCur(String curCd) {
		return object(CLAZZ)._getCur(curCd);
	}
	protected MAM_CUR_R _getCur(String curCd) {
		if (_curR == null) {
			_curR = new FXUCL_MCDbcCache<MAM_CUR_R>(MCQueryApiBuilder.create(MAM_CUR_R.create("T")));
		}
		return _curR.get(curCd);
	}
	
	// 場所マスタのキャッシュ
	protected FXUCL_MCDbcCache<MAM_LOC_R> _locR;
	protected static MAM_LOC_R getLoc(String locCd) {
		return object(CLAZZ)._getLoc(locCd);
	}
	protected MAM_LOC_R _getLoc(String locCd) {
		if (_locR == null) {
			_locR = new FXUCL_MCDbcCache<MAM_LOC_R>(MCQueryApiBuilder.create(MAM_LOC_R.create("T")));
		}
		return _locR.get(locCd);
	}
	protected FXUCL_MCDbcCache<MAM_LG_GRP_R> _lgGrpR;
	protected static MAM_LG_GRP_R getLgGrp(String lgGrpCd) {
		return object(CLAZZ)._getLgGrp(lgGrpCd);
	}
	protected MAM_LG_GRP_R _getLgGrp(String lgGrpCd) {
		if (_lgGrpR == null) {
			_lgGrpR = new FXUCL_MCDbcCache<MAM_LG_GRP_R>(MCQueryApiBuilder.create(MAM_LG_GRP_R.create("T")));
		}
		return _lgGrpR.get(lgGrpCd);
	}
	
	// 品目仕訳マスタのキャッシュ
	protected MCList<MAM_ITM_JNL_R> _itmJnlCache = null;
	MCIndexKey _itmJnlCacheIdx = null;
	protected static void initItmJnlCache(MCList<SlsAct_Upd01_DtlR> dtlL) {
		object(CLAZZ)._initItmJnlCache(dtlL);
	}
	protected void _initItmJnlCache(MCList<SlsAct_Upd01_DtlR> dtlL) {
		_itmJnlCache = MCList.create(MAM_ITM_JNL_R.class);
		MAM_ITM_JNL_R t = MAM_ITM_JNL_R.create("T");
		MCQueryApiBuilder itmJnlCache_bldr = MCQueryApiBuilder.create(t);
		MAM_ITM_R t2 = MAM_ITM_R.create("T2");
		itmJnlCache_bldr.setSelect(t.ar_typ);
		itmJnlCache_bldr.addSelect(t2.itm_cd, t2.itm_sub1, t2.itm_sub2, t2.itm_sub3);
		itmJnlCache_bldr.addLeftOuterJoin(t2, bracket( t.itm_jnl_cd.eq(t2.itm_jnl_cd)));
		itmJnlCache_bldr.setWhere(t2.itm_cd.eq(bind("itm_cd")));
		itmJnlCache_bldr.addWhereWithAnd(t2.itm_sub1.eq(bind("itm_sub1")));
		itmJnlCache_bldr.addWhereWithAnd(t2.itm_sub2.eq(bind("itm_sub2")));
		itmJnlCache_bldr.addWhereWithAnd(t2.itm_sub3.eq(bind("itm_sub3")));
		dbSelect("MSBBL6010_MAM_ITM_JNL_S01", _itmJnlCache, itmJnlCache_bldr, dtlL);
		_itmJnlCacheIdx = _itmJnlCache.createIndex(MAM_ITM_R.$itm_cd, 
				MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
	}
	// 品目仕訳マスタのキャッシュからの取得
	protected static MAM_ITM_JNL_R getItmJnlCache(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return object(CLAZZ)._getItmJnlCache(itmCd, itmSub1, itmSub2, itmSub3);
	}
	protected MAM_ITM_JNL_R _getItmJnlCache(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return _itmJnlCache.getFirst(_itmJnlCacheIdx, itmCd, itmSub1, itmSub2, itmSub3);
	}
	
	// 品目マスタのキャッシュ
	protected MCList<MAM_ITM_R> _itmCache = null;
	MCIndexKey _itmCacheIdx = null;
	protected static void initItmCache(MCList<SlsAct_Upd01_DtlR> dtlL) {
		object(CLAZZ)._initItmCache(dtlL);
	}
	protected void _initItmCache(MCList<SlsAct_Upd01_DtlR> dtlL) {

		_itmCache = MCList.create(MAM_ITM_R.class);
		getItmCache(_itmCache, dtlL);
		_itmCacheIdx = crtItmCacheIdx(_itmCache);
	}
	// 品目マスタのキャッシュからの取得
	protected static MAM_ITM_R getItmCache(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return object(CLAZZ)._getItmCache(itmCd, itmSub1, itmSub2, itmSub3);
	}
	protected MAM_ITM_R _getItmCache(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return _itmCache.getFirst(_itmCacheIdx, itmCd, itmSub1, itmSub2, itmSub3);
	}
	// 品目マスタのキャッシュにレコードを追加する
	protected static void addItmCache(MCList<SlsAct_Upd01_DtlR> dtlL) {
		object(CLAZZ)._addItmCache(dtlL);
	}
	protected void _addItmCache(MCList<SlsAct_Upd01_DtlR> dtlL) {
		
		if (_itmCache == null) {
			_itmCache = MCList.create(MAM_ITM_R.class);
		}
		MCList<MAM_ITM_R> itmCache = MCList.create(MAM_ITM_R.class);
		getItmCache(itmCache, dtlL);
		_itmCache.addAll(itmCache);
		_itmCache = _itmCache.groupBy(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2,
				MAM_ITM_R.$itm_sub3, MAM_ITM_R.$dscnt_itm_flg, MAM_ITM_R.$stk_mng_typ, MAM_ITM_R.$ver_flg);
		
		_itmCacheIdx = crtItmCacheIdx(_itmCache);
	}
	// 品目マスタのキャッシュを取得する
	protected void getItmCache(MCList<MAM_ITM_R> itmCache, MCList<SlsAct_Upd01_DtlR> dtlL) {
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder itmCache_bldr = MCQueryApiBuilder.create(t);
		itmCache_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.dscnt_itm_flg, t.stk_mng_typ, t.ver_flg);
		itmCache_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
		itmCache_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
		itmCache_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
		itmCache_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
		dbSelect("MSBBL6010_MAM_ITM_S01", itmCache, itmCache_bldr, dtlL);
	}
	// 品目マスタのキャッシュのインデックスキーを作成する
	protected MCIndexKey crtItmCacheIdx(MCList<MAM_ITM_R> itmCache) {
		return itmCache.createIndex(MAM_ITM_R.$itm_cd, 
				MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
	}
	
	// 売上集計を一度に処理するサイズ
	protected int _loopcnt = getPgmSettingInt(this, "loop_size");
	/**
	 * SlsAct_Upd01オペレーション.<p>
	 *
	 * 売上実績を登録する<br>
	 */
	public class SlsAct_Upd01 extends MSBBL_SlsActService_MC_A.SlsAct_Upd01 {
		
		// キャッシュ用
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheCst = null;
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBcst = null;
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheDlv = null;
		protected FXUCL_MCDbcCache<MAM_TRD_R> _cacheTrd;
		protected FXUCL_MCDbcCache<MAM_SLIP_FORM_R> _cacheSlipForm;
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt;
		
		// 帳票最大行数（システム最大値）
		protected int _maxLineCnt;
		// インボイス対象売上用の行カウント
		protected int _lineCnt = 1;
		
		// 登録形式に編集した売上実績ヘッダ・明細・詳細を格納
		protected MCList<SlsAct_Upd01_DtlR> _dtlL = MCList.create(SlsAct_Upd01_DtlR.class);
		protected MCList<SlsAct_Upd01_IoR> _ioL = MCList.create(SlsAct_Upd01_IoR.class);
		protected MCList<SlsAct_Upd01_HdrR> _hdrL = MCList.create(SlsAct_Upd01_HdrR.class);
		protected MCIndexKey _hdrLIdxKey = null;
		protected MCIndexKey _dtlLIdxKey = null;
		protected MCIndexKey _up0IdxKey = null;
		
		protected MCList<SlsAct_Upd01_HdrR> _befHdrL = MCList.create(SlsAct_Upd01_HdrR.class);
		
		// 債権共通SV呼出情報を格納
		protected MCList<ArCmn_Upd01_DtlR> _arInL = MCList.create(ArCmn_Upd01_DtlR.class);
		
		// 与信SV呼出情報を格納
		protected MCList<Cred_Upd01_CndR> _credL = MCList.create(Cred_Upd01_CndR.class);
		
		// EDI出荷実績SV呼出情報を格納
		protected MCList<ShipActSendIf_Upd01_DtlR> _shipActSendL = MCList.create(ShipActSendIf_Upd01_DtlR.class);
		protected MCList<ShipActSendIf_Upd01_DlvR> _shipActSendDlvL = MCList.create(ShipActSendIf_Upd01_DlvR.class);
		// 出荷帳票発行SV呼出情報を格納
		protected MCList<ShipRprt_Upd01_HdrR> _shipRprtHdrL01 = MCList.create(ShipRprt_Upd01_HdrR.class);
		protected MCList<ShipRprt_Upd01_DtlR> _shipRprtDtlL01 = MCList.create(ShipRprt_Upd01_DtlR.class);
		protected MCList<ShipRprt_Upd02_HdrR> _shipRprtHdrL02 = MCList.create(ShipRprt_Upd02_HdrR.class);
		
		// 締処理提供SV呼出情報を格納
		protected MCList<Cl_Chk03_CndR> _clChk03CndL = MCList.create(Cl_Chk03_CndR.class); 
		
		// 受注状況更新SV呼出情報を格納
		protected MCList<SloSts_DtlR> _sloStsL = MCList.create(SloSts_DtlR.class);
		
		protected MCList<MST_SLS_SUM_R> _slsSumL = MCList.create(MST_SLS_SUM_R.class);
		
		// 預り売上ＦＬＧを取得した受注情報を格納
		protected MCList<MST_SLO_D_R> _sloDL = MCList.create(MST_SLO_D_R.class);
		protected MCIndexKey _sloDKey = null;
		/** インボイス明細リスト*/
		protected MCList<MST_IV_D_R> _ivDL = null;
		/** インボイス明細リストのインデックス */
		protected MCIndexKey _ivDIdxKey = null;
		
		protected MCList<MST_DLV_SLIP_D_R> _dlvSlipDL = null;
		protected MCIndexKey _dlvSlipDIdxKey1 = null;
		protected MCIndexKey _dlvSlipDIdxKey2 = null;

		/**
		 * サービス実行前のメッセージの状態
		 */
		protected MCMessageList _msgLPreSv = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			boolean shipActSvExecFlg = false;
			
			// 前処理
			preProc();
			
			// データ編集（伝票分割、NO発番、金額計算、データ補完）
			makeSlsData();
			
			// 売上実績トラン登録・更新および出荷実績SV呼出
			shipActSvExecFlg = crtSlsActData();
			
			// 受注状況更新SV呼出
			callSloStsSv();
			
			// 出荷帳票発行SV呼出
			callShipRprtSvUpd01();
			callShipRprtSvUpd02();
			
			callShipActSendIfSv();
			// 売上予定SV呼出
			callSlsSchdSv(shipActSvExecFlg);
			
			// 出荷予定SV呼出
			callShipSchdSv();
			
			// 預り売上では出荷予定を更新
			callSvForCstStk();
			
			// 受払実績SV呼出（受払ワークの登録）
			callIoActSvWK();

			// 売上集計更新
			updSlsSum(_slsSumL);
			
			// 債権共通SV呼出
			if (!getCo().ar_no_use_flg()) {
				callArCmnSv();
			}
			
			callGALink();
			
			// 与信SV呼出
			callCredSv();
			
			// 下り電文作成
			setDown();
			
			// 分割メッセージセット
			setSplitMsg();
			
			setInterimMsg();
		}
		
		/**
		 * 締処理提供SV呼出（Cl_Chk03）
		 * 
		 */
		protected void callCloseSV() {
			
			if (_clChk03CndL.size() == 0) {
				return;
			}
			
			MSBIL_ClService.Cl_Chk03 ope = MSBIL_ClService.crtCl_Chk03();
			ope.up0().setAll(_clChk03CndL);
			ope.exec();

			if (_msgLPreSv.size() != MCMessagePool.size()) {
				
				// 締チェック処理で発生したエラーメッセージのみスローする。
				MCMessageList causeMsgList = new MCMessageList();
				
				for (MCMessage causeMsg : MCMessagePool.getMessageList()) {
					if (!_msgLPreSv.contains(causeMsg)) {
						
						causeMsgList.add(causeMsg);
					}
				}
				
				// 締チェック処理で発生したエラーメッセージをメッセージプールから消す。
				MCMessagePool.removeAll(causeMsgList);
				
				MCAppException ex = new MCAppException(causeMsgList.get(0));
				causeMsgList.remove(0);
				ex.addCauseMessageList(causeMsgList);
				
				throw ex;
			}
		}
		
		/**
		 * 出荷帳票発行SV呼出（ShipRprt_Upd01）
		 * 
		 */
		protected void callShipRprtSvUpd01() {
			MSBEL_ShipRprtPrntService.ShipRprt_Upd01 ope = MSBEL_ShipRprtPrntService.crtShipRprt_Upd01();
			ope.up0().setAll(_shipRprtHdrL01);
			ope.up1().setAll(_shipRprtDtlL01);
			ope.up2().bndl_prnt_flg(!up3().indiv_prnt_flg());
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
			aftrCallShipRprtSvUpd01(ope.down0());
		}
		/**
		 * 出荷帳票発行SV呼出後処理<br>
		 * 納品伝票連番を売上実績、出荷実績に反映する
		 */
		protected MCList<MST_SLS_ACT_R> _shipRprtSlsActL = null;
		protected MCList<MST_SLS_ACT_IO_R> _shipRprtSlsActIoL = null;
		protected void aftrCallShipRprtSvUpd01(MCList<ShipRprt_Upd01_DtlR> downL) {
			
			// 下り電文の値を設定（EDI出荷実績送信IFで使用する）
			for (ShipRprt_Upd01_DtlR dR : downL.distinctNE(ShipRprt_Upd01_DtlR.$dlv_slip_no)) {
				ShipActSendIf_Upd01_DlvR dlvR = _shipActSendDlvL.add();
				dlvR.dlv_slip_no(dR.dlv_slip_no());
				dlvR.upded_flg(dR.upded_flg());
			}
			
			// 納品伝票を取り消す場合は下り電文が設定されてこない
			// なので、取消でない実績も含め納品伝票トランの連番を取得して更新する
			MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setGroupBy(t.dlv_slip_no);
			bldr.addMax(t.dlv_slip_seq, "dlv_slip_seq");
			bldr.addMax(t.dlv_slip_rev, "dlv_slip_rev");
			bldr.setWhere(t.dlv_slip_no.eq(bind("dlv_slip_no")));
			
			MCList<MST_DLV_SLIP_R> dlvslipL = MCList.create(MST_DLV_SLIP_R.class);
			dbSelect("MSBBL6010_MST_DLV_SLIP_S06", dlvslipL, bldr,
				_shipRprtSlsActL.distinctNE(MST_SLS_ACT_R.$dlv_slip_no));
			
			MCIndexKey dlvIdx = dlvslipL.createIndex(MST_DLV_SLIP_R.$dlv_slip_no);
			MCIndexKey slsActIdx = _hdrL.createIndex(SlsAct_Upd01_HdrR.$sls_act_no);
			MCIndexKey hdrIdx = _hdrL.createIndex(SlsAct_Upd01_HdrR.$new_hdr_peg_no);
			MCIndexKey ioIdx = _shipRprtSlsActIoL.createIndex(SlsAct_Upd01_HdrR.$new_hdr_peg_no);
			MCIndexKey arActKeyIdx = _arInL.createIndex(ArCmn_Upd01_DtlR.$act_no, ArCmn_Upd01_DtlR.$act_seq, ArCmn_Upd01_DtlR.$act_rev);
			
			MCList<MST_SLS_ACT_R> slsActL = MCList.create(MST_SLS_ACT_R.class);
			MCList<MST_SHIP_ACT_D_R> shipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
			for (MCList<MST_SLS_ACT_R> gl : _shipRprtSlsActL.groupList(MST_SLS_ACT_R.$sls_act_no, MST_SLS_ACT_R.$dlv_slip_no)) {
				gl.sort(SortType.DESC, MST_SLS_ACT_R.$sls_act_seq);
				MST_SLS_ACT_R r = gl.get(0);
				
				MST_DLV_SLIP_R dlvSlipR = dlvslipL.getFirst(dlvIdx, r.dlv_slip_no());
				// 「新規」「取消」の順に-1しつつ連番を設定する。売上実績が取消の場合は「取消」のみに設定する
				// 値引承認の場合に、納品書ＮＯがNULLになることがある
				Integer seq = isNull(dlvSlipR) ? null : dlvSlipR.dlv_slip_seq().intValue();
				for (MST_SLS_ACT_R row : gl) {
					MST_SLS_ACT_R actR = MST_SLS_ACT_R.create();
					actR.sls_act_no(row.sls_act_no());
					actR.sls_act_seq(row.sls_act_seq());
					actR.sls_act_rev(row.sls_act_rev());
					// 出荷を引き継いで売上実績を初めて登録する場合、納品伝票の改訂番号を引き継ぐ
					// それ以降は常にインクリメントする（納品伝票も同様）
					if (!isNull(r.ship_act_no())
						&& isSame(actR.sls_act_seq(), MCNumber.ONE)
						&& !isNull(dlvSlipR)) {
						actR.sls_act_rev(dlvSlipR.dlv_slip_rev());
						
						// 下り電文用に再設定
						SlsAct_Upd01_HdrR up0R = _hdrL.getFirst(slsActIdx, r.sls_act_no());
						up0R.sls_act_rev(actR.sls_act_rev());
						
						// 債権共通SV呼出情報に再設定
						_arInL
							.subList(arActKeyIdx, row.sls_act_no(), row.sls_act_seq(), row.sls_act_rev())
							.forEach(arInR -> {
								arInR.act_rev(actR.sls_act_rev());
							});
					}
					
					// 納品書連番が「0」になることがある（売上実績を登録後、納品書の内容が変わらない訂正をした場合など）
					// 「0」になったデータは売上伝票発行画面には表示されない。売上実績でも使用されないので問題はない
					if (!isNull(seq)) {
						actR.dlv_slip_seq(seq--);
					}
					slsActL.add(actR);
				}
				
				SlsAct_Upd01_HdrR up0R = _hdrL.getFirst(hdrIdx, r.getNumberNE(SlsAct_Upd01_HdrR.$new_hdr_peg_no));
				if (MAC_SLIP_STS_TYP.isCRT(r.slip_sts_typ())
					&& !isNull(r.ship_act_no())
					&& up0R.ship_act_service_exec_flg()) {
					// 出荷実績は「新規」または「取消」の連番を設定
					_shipRprtSlsActIoL
						.subList(ioIdx, up0R.new_hdr_peg_no())
						.distinctNE(MST_SLS_ACT_IO_R.$ship_act_d_no)
						.forEach(ioR -> {
						
						MST_SHIP_ACT_D_R actDR = MST_SHIP_ACT_D_R.create();
						actDR.ship_act_no(r.ship_act_no());
						actDR.ship_act_d_no(ioR.ship_act_d_no());
						actDR.dlv_slip_no(dlvSlipR.dlv_slip_no());
						actDR.dlv_slip_seq(dlvSlipR.dlv_slip_seq());
						shipActDL.add(actDR);
					});
				}
			}
			
			// 売上実績を更新
			updSlsAct(slsActL);
			
			// 出荷実績を更新
			updShipAct(shipActDL);
		}
		
		/**
		 * 売上実績を更新する
		 * 出荷帳票発行SV呼出後処理から呼ばれる<br>
		 */
		protected void updSlsAct(MCList<MST_SLS_ACT_R> slsActL) {
			// 売上実績ヘッダの納品書連番を更新
			MST_SLS_ACT_R t1 = MST_SLS_ACT_R.create("T1");
			execDbUpdateKey("MSBBL6010_MST_SLS_ACT_U05", t1, slsActL, t1.sls_act_rev, t1.dlv_slip_seq);
		}
		
		/**
		 * 出荷実績を更新する
		 * 出荷帳票発行SV呼出後処理から呼ばれる<br>
		 */
		protected void updShipAct(MCList<MST_SHIP_ACT_D_R> shipActDL) {
			// 出荷実績に設定する納品書連番に対応する、納品伝票の即時発行フラグを取得する
			MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.dlv_slip_no, t.slip_prnt_flg);
			bldr.setWhere(t.dlv_slip_no.eq(bind("dlv_slip_no")));
			bldr.addWhereWithAnd(t.dlv_slip_seq.eq(bind("dlv_slip_seq")));
			
			MCList<MST_DLV_SLIP_R> dlvslipL = MCList.create(MST_DLV_SLIP_R.class);
			dbSelect("MSBBL6010_MST_DLV_SLIP_S07", dlvslipL, bldr,
				shipActDL.distinctNE(MST_SHIP_ACT_D_R.$dlv_slip_no));
			MCIndexKey idx = dlvslipL.createIndex(MST_DLV_SLIP_R.$dlv_slip_no);
			
			MCList<MST_SHIP_ACT_R> shipActL = MCList.create(MST_SHIP_ACT_R.class);
			for (MST_SHIP_ACT_D_R r : shipActDL) {
				MST_SHIP_ACT_R actR = shipActL.add();
				actR.ship_act_no(r.ship_act_no());
				actR.dlv_prnt_flg(dlvslipL.getFirst(idx, r.dlv_slip_no()).slip_prnt_flg());
			}
			
			// 出荷実績の納品書発行済、発行日時を更新
			MCGroupByPolicy gp = new MCGroupByPolicy(MST_SHIP_ACT_R.$ship_act_no);
			gp.max(MST_SHIP_ACT_R.$dlv_prnt_flg);
			shipActL = shipActL.groupBy(gp);
			shipActL.subList(r -> r.dlv_prnt_flg()).setDateNE(MST_SHIP_ACT_R.$dlv_prnt_tm, MCDate.sysnow());
			MST_SHIP_ACT_R t2 = MST_SHIP_ACT_R.create("T2");
			execDbUpdateKey(
				"MSBBL6010_MST_SHIP_ACT_U01", t2, shipActL.subList(r -> r.dlv_prnt_flg()), t2.dlv_prnt_flg, t2.dlv_prnt_tm);
			execDbUpdateKey(
				"MSBBL6010_MST_SHIP_ACT_U02", t2, shipActL.subList(r -> !r.dlv_prnt_flg()), t2.dlv_prnt_flg);
			
			// 出荷実績明細の納品書連番を更新
			MST_SHIP_ACT_D_R t3 = MST_SHIP_ACT_D_R.create("T3");
			execDbUpdateKey("MSBBL6010_MST_SHIP_ACT_D_U01", t3, shipActDL, t3.dlv_slip_no, t3.dlv_slip_seq);
		}
		
		/**
		 * 出荷帳票発行SV呼出（ShipRprt_Upd02）
		 * 
		 */
		protected void callShipRprtSvUpd02() {
			if (_shipRprtHdrL02.size() == 0) {
				return;
			}
			MSBEL_ShipRprtPrntService.ShipRprt_Upd02 ope = MSBEL_ShipRprtPrntService.crtShipRprt_Upd02();
			ope.up0().setAll(_shipRprtHdrL02);
			ope.exec();
		}
		
		/**
		 * 出荷実績送信SV呼出
		 */
		protected void callShipActSendIfSv() {
			
			if (_shipActSendL.size() == 0) {
				return;
			}
			
			MSLAL_ShipActSendIfService.ShipActSendIf_Upd01 ope = MSLAL_ShipActSendIfService
					.crtShipActSendIf_Upd01();
			ope.up0().addAll(_shipActSendL);
			ope.up1().addAll(_shipActSendDlvL);
			ope.exec();
		}
		/**
		 * 受注状況更新SV呼出
		 * 
		 */
		protected void callSloStsSv() {
			if (_sloStsL.size() == 0) {
				return;
			}
			MSBBL_SloStsRegService.SloSts_Ins01 ope = MSBBL_SloStsRegService.crtSloSts_Ins01();
			ope.up0().setAll(_sloStsL);
			ope.exec();
		}
		
		/**
		 * 与信SV呼出
		 * 
		 * @return
		 */
		protected void callCredSv() {
			if (_credL.size() == 0) {
				return;
			}
			MSBGL_CredService.Cred_Upd01 ope = MSBGL_CredService.crtCred_Upd01();
			ope.up0().setAll(_credL);
			ope.exec();
			if (!ope.down1().isEmpty()){

				MCMessageList msgList = new MCMessageList();
				for (Cred_Upd01_ErrR errR : ope.down1()) {

					MCMessage msg = new MCMessage(MSBBL0124, errR.cred_cd(), errR.cur_cd(), errR.cred_amt(), errR.cred_limit());
					msgList.add(msg);
				}

				MCAppException ex = new MCAppException(msgList.get(0));
				msgList.remove(0);
				ex.addCauseMessageList(msgList);

				throw ex;
			}
		}
		
		/**
		 * 与信SV呼出情報作成
		 * 
		 * @param hdrR 売上実績ヘッダ
		 * @param canFlg 取消データの場合true
		 * @param upHdrR 上り電文の売上実績ヘッダ
		 */
		protected void makeCredL(MST_SLS_ACT_R hdrR, boolean canFlg, SlsAct_Upd01_HdrR upHdrR) {
			Cred_Upd01_CndR credCndR = Cred_Upd01_CndR.create();
			credCndR.cst_cd(hdrR.cst_cd());									// 得意先ＣＤ
			credCndR.cur_cd(hdrR.trd_cur_cd());								// 通貨ＣＤ
			credCndR.trd_ptn_typ(hdrR.trd_ptn_typ());						// 取引パタン区分
			credCndR.amt(hdrR.trd_cur_amt().add(hdrR.trd_cur_tax_amt()));	// 金額
			if(canFlg || isNoCheckCred(upHdrR)) {
				credCndR.cred_upd_typ(MSC_CRED_UPD_TYP.UPD.value());		// 与信更新区分（更新のみ）
			}
			else {
				credCndR.cred_upd_typ(MSC_CRED_UPD_TYP.UPD_CHK.value());	// 与信更新区分（更新＆チェック）
			}
			_credL.add(credCndR);
		}
		
		/**
		 * 与信超過のチェック対象外かを判定する。
		 * @param upHdrR 上り電文の売上実績ヘッダ
		 * @return 下記のいずれかを満たす場合はtrue<br>
		 * 呼出元が売上明細訂正登録画面、取引区分が売上値引/売上値増/売上返品
		 */
		protected boolean isNoCheckCred(SlsAct_Upd01_HdrR upHdrR) {

			return upHdrR.sls_dtl_mod_flg() 
					|| MAC_TRD_PTN_TYP.isSLS_DSCNT(upHdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_XTRA(upHdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_RTN(upHdrR.trd_ptn_typ());
		}
		
		/**
		 * 預り売上時、出荷予定を更新
		 * 
		 */
		protected void callSvForCstStk() {
			
			// 更新処理用
			MSBEL_ShipSchdService.ShipSchd_Upd02 op = MSBEL_ShipSchdService.crtShipSchd_Upd02();
			// チェック処理用
			MSBEL_ShipSchdService.ShipSchd_Chk02 opChk = MSBEL_ShipSchdService.crtShipSchd_Chk02();
			MSBEL_ShipSchdService.ShipSchd_Upd08 opUpd08 = MSBEL_ShipSchdService.crtShipSchd_Upd08();
			
			// 預り売上前の出荷引当状況を保持
			insAllocStsSv();
			MCList<MST_IV_MAP_R> ivMapL = MCList.create(MST_IV_MAP_R.class);
			
			MCIndexKey up1IdxKey = up1().createIndex(SlsAct_Upd01_DtlR.$data_crud_typ, SlsAct_Upd01_DtlR.$ship_schd_no);
			
			int pegNo = 0;
			for (SlsAct_Upd01_DtlR dtlR : up1()) {
				// 預り売上のみ対象
				if (dtlR.sls_cststk_flg()) {
					MCList<SlsAct_Upd01_DtlR> delL = up1().subList(up1IdxKey, MAC_DATA_CRUD_TYP.DEL.value(),dtlR.ship_schd_no());
					// 更新・取消時は、売上実績明細に対し出荷予定が複数件になっていないかチェック
					MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
					MST_SHIP_SCHD_R shipSchdL_t = MST_SHIP_SCHD_R.create("T");
					MCQueryApiBuilder shipSchdL_bldr = MCQueryApiBuilder.create(shipSchdL_t);
					shipSchdL_bldr.setSelect(shipSchdL_t.ship_schd_no, shipSchdL_t.sls_act_d_no,
							shipSchdL_t.ship_pr_no, shipSchdL_t.trd_unit_qty, shipSchdL_t.base_unit_qty ,shipSchdL_t.iv_schd_qty);
					if (!MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
						shipSchdL_bldr.setWhere(shipSchdL_t.sls_act_d_no.eq(bind("1")), dtlR.sls_act_d_no());
					}
					else if (!delL.isEmpty()) {
						// 伝票分割した場合、分割前の売上実績明細で出荷予定を取得する
						shipSchdL_bldr.setWhere(shipSchdL_t.sls_act_d_no.eq(bind("1")), delL.get(0).sls_act_d_no());
					}
					
					if (!MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ()) || !delL.isEmpty()) {
						dbSelect("MSBBL6010_MST_SHIP_SCHD_S01", shipSchdL, shipSchdL_bldr);
					}
					
					SlsAct_Upd01_HdrR hdrR = up0().getFirst(_up0IdxKey, dtlR.hdr_peg_no());
					if (hdrR.sls_dtl_mod_flg()) {
						if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
							
							// 売上明細訂正画面で伝票分割が発生した場合、出荷予定を保持する必要があるため、削除/新規⇒更新として扱い
							ShipSchd_Upd08_DtlR upd08DtlR = ShipSchd_Upd08_DtlR.create();
							upd08DtlR.ship_schd_no(dtlR.ship_schd_no());
							upd08DtlR.sls_act_d_no(dtlR.sls_act_d_no());
							opUpd08.up0().add(upd08DtlR);
							
							if (1 < shipSchdL.size()) {
								for (MST_SHIP_SCHD_R r: shipSchdL) {
									if (isSame(r.ship_schd_no(), dtlR.ship_schd_no())) {
										continue;
									}
									ShipSchd_Upd08_DtlR spltR = ShipSchd_Upd08_DtlR.create();
									spltR.ship_schd_no(r.ship_schd_no());
									spltR.sls_act_d_no(dtlR.sls_act_d_no());
									opUpd08.up0().add(spltR);
								}
							}
						}
						
						continue;
					}
					if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) && isSlsCststkSplit(dtlR)) {
						continue;
					}
					
					// 出荷予定を取得
					MST_SHIP_SCHD_R shipSchdR = MST_SHIP_SCHD_R.create("T");
					dbSelectKey("MSBBL6010_MST_SHIP_SCHD_S02", shipSchdR,
							MCQueryApiBuilder.create(shipSchdR), dtlR);

					if (isSame(shipSchdR.base_unit_qty(), shipSchdR.alloc_qty())) {
						dtlR.no_gi_alloc_flg(true);
					}
					else {
						dtlR.no_gi_alloc_flg(false);
					}
					
					ShipSchd_DtlR schdR = ShipSchd_DtlR.create();
					copy(schdR, shipSchdR, createMap_ShipSchd_DtlR_MST_SHIP_SCHD_R());
					schdR.peg_no(++pegNo);
					if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						schdR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());		// 在庫識別区分（自社）
						schdR.stk_bp_cd(null);								// 在庫取引先（null）
						schdR.sls_act_d_no(null);							// 売上実績明細ＮＯ（null）
					}
					else {
						schdR.stk_id_typ(MSC_STK_ID_TYP.CSTSTK.value());	// 在庫識別区分（預り）
						schdR.stk_bp_cd(up0().subList(SlsAct_Upd01_HdrR.$hdr_peg_no, dtlR.hdr_peg_no()).get(0).cst_cd());	// 在庫取引先（得意先ＣＤ）
						schdR.sls_act_d_no(dtlR.sls_act_d_no());			// 売上実績明細ＮＯ
					}
					schdR.iv_chk_skip_flg(true);
					if (1 < shipSchdL.size()) {
						schdR.trd_unit_qty(shipSchdL.sum(MST_SHIP_SCHD_R.$trd_unit_qty));
						schdR.base_unit_qty(shipSchdL.sum(MST_SHIP_SCHD_R.$base_unit_qty));
						if (!isNull(shipSchdR.iv_schd_qty()) && shipSchdR.iv_schd_qty().isPositive()) {
							schdR.iv_schd_qty_upd_flg(true);
							schdR.iv_schd_qty(schdR.base_unit_qty());
							
							MST_IV_MAP_R ivMapR = MST_IV_MAP_R.create();
							ivMapR.iv_d_no(dtlR.iv_d_no());
							ivMapR.ship_schd_no(schdR.ship_schd_no());
							ivMapR.trd_unit_qty(schdR.trd_unit_qty());
							ivMapR.base_unit_qty(schdR.base_unit_qty());
							ivMapR.setStatus(Status.MODIFY);
							ivMapL.add(ivMapR);
						}
					}
					op.up1().add(schdR);
					
					// 取消の場合は、元の出荷引当状況をベースに電文設定 
					if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						// 出荷引当状況を取得
						MCList<Alloc_RsltR> alL = MCList.create(Alloc_RsltR.class);
						if (1 < shipSchdL.size()) {
							executeQuery(alL, MSBBL6010_MST_SHIP_ALLOC_STS_S1(), shipSchdL);
						}
						else {
							executeQuery(alL, MSBBL6010_MST_SHIP_ALLOC_STS_S1(), dtlR);
						}
						alL.setNumberNE(Alloc_RsltR.$peg_no, pegNo);
						op.up2().addAll(alL);
					}
					// 新規・訂正の場合は、売上実績受払をベースに電文設定
					else {
						// 明細に紐づく詳細を取得
						MCList<SlsAct_Upd01_IoR> tmpIoL = up2().subList(SlsAct_Upd01_IoR.$sls_act_d_no, dtlR.sls_act_d_no());
						for (SlsAct_Upd01_IoR ioR : tmpIoL) {
							Alloc_RsltR alR = Alloc_RsltR.create();
							alR.peg_no(pegNo);												// 紐付けＮＯ
							alR.itm_cd(dtlR.itm_cd());										// 品目ＣＤ
							alR.itm_sub1(dtlR.itm_sub1());									// 枝番１
							alR.itm_sub2(dtlR.itm_sub2());									// 枝番２
							alR.itm_sub3(dtlR.itm_sub3());									// 枝番３
							alR.stk_loc_cd(ioR.loc_cd());									// 在庫場所ＣＤ
							alR.stk_str_ln_cd(ioR.str_ln_cd());								// 在庫棚・ラインＣＤ
							alR.stk_lg_grp_cd(schdR.ship_fr_lg_grp_cd());					// 在庫物流グループＣＤ
							alR.quality_typ(MAC_QUALITY_TYP.GOOD.value());					// 良品区分
							alR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());					// 在庫検査区分
							alR.stk_id_typ(MSC_STK_ID_TYP.CSTSTK.value());					// 在庫識別区分
							alR.stk_bp_cd(schdR.stk_bp_cd());								// 在庫取引先ＣＤ
							alR.gd_cd(ioR.gd_cd());											// 格付ＣＤ
							alR.lot_no(ioR.lot_no());										// ロットＮＯ
							alR.sublot_no(ioR.sublot_no());									// サブロットＮＯ
							alR.sno1(ioR.sno1());											// 手配ＮＯ１
							alR.sno2(ioR.sno2());											// 手配ＮＯ２
							alR.sno3(ioR.sno3());											// 手配ＮＯ３
							alR.sno4(ioR.sno4());											// 手配ＮＯ４
							alR.ver_no(schdR.ver_no());										// 版ＮＯ
							alR.pack_unit_cd(ioR.pack_unit_cd());							// 荷姿単位ＣＤ
							alR.pack_unit_qty(ioR.pack_unit_qty());							// 荷姿単位数量
							alR.base_unit_cd(ioR.base_unit_cd());							// 基準単位ＣＤ
							alR.base_unit_qty(ioR.base_unit_qty());							// 基準単位数量
							alR.vld_dt_fr(schdR.vld_dt_fr());								// 有効期限ＦＲＯＭ
							alR.vld_dt_to(schdR.vld_dt_to());								// 有効期限ＴＯ
							alR.alloc_flg(true);											// 引当
							alR.alloc_scope_typ(MAC_ALLOC_SCOPE_TYP.LOC.value());			// 引当範囲区分（場所引当）
							
							op.up2().add(alR);
						}
					}
					
					if (1 < shipSchdL.size()) {
						// 分割した出荷予定を削除する
						for (MST_SHIP_SCHD_R r: shipSchdL) {
							if (isSame(r.ship_schd_no(), dtlR.ship_schd_no())) {
								continue;
							}
							ShipSchd_DtlR delR = ShipSchd_DtlR.create();
							delR.peg_no(++pegNo);
							delR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							delR.ship_pr_no(r.ship_pr_no());
							delR.ship_schd_no(r.ship_schd_no());
							delR.iv_chk_skip_flg(true);
							op.up1().add(delR);
							
							if (!isNull(r.iv_schd_qty()) && shipSchdR.iv_schd_qty().isPositive()) {
								// 削除する出荷予定に紐づくインボイスマップも削除
								MST_IV_MAP_R ivMapR = MST_IV_MAP_R.create();
								ivMapR.iv_d_no(dtlR.iv_d_no());
								ivMapR.ship_schd_no(r.ship_schd_no());
								ivMapR.setStatus(Status.DELETE);
								ivMapL.add(ivMapR);
							}
						}
					}
				}
			}
			
			opChk.up0().addAll(op.up1());	// チェック処理電文設定
			
			// チェック処理実行
			if (!opChk.up0().isEmpty()){
				opChk.exec();
				if (_msgLPreSv.size() != MCMessagePool.size()) {
					
					// チェック処理で発生したエラーメッセージのみスローする。
					MCMessageList causeMsgList = new MCMessageList();
					
					for (MCMessage causeMsg : MCMessagePool.getMessageList()) {
						if (!_msgLPreSv.contains(causeMsg)) {
							
							causeMsgList.add(causeMsg);
						}
					}
					
					// チェック処理で発生したエラーメッセージをメッセージプールから消す。
					MCMessagePool.removeAll(causeMsgList);
					
					MCAppException ex = new MCAppException(causeMsgList.get(0));
					causeMsgList.remove(0);
					ex.addCauseMessageList(causeMsgList);
					
					throw ex;
				}
			}
			
			if (!op.up1().isEmpty()) {
				op.up0().lot_chk_flg(false);
				// 更新処理実行
				op.exec();
			}
			
			if (!opUpd08.up0().isEmpty()) {
				opUpd08.exec();
			}
			
			// 出荷引当状況更新
			updAllocSts();
			
			// インボイスマップ更新
			updIvMap(ivMapL);
		}
		
		/**
		 * 預り売上かつ出荷予定が分割した状態で売上実績を訂正・取消した場合に、出荷予定のまとめに伴い、インボイスマップマップを更新する。
		 * @param ivMapL インボイスマップリスト
		 */
		protected void updIvMap(MCList<MST_IV_MAP_R> ivMapL) {
			if (!ivMapL.isEmpty()) {
				MST_IV_MAP_R ivMap = MST_IV_MAP_R.create("IVMAP");
				MCQueryApiBuilder ivMapL_bldr = MCQueryApiBuilder.create(ivMap);
				ivMapL_bldr.setSet( ivMap.trd_unit_qty, ivMap.base_unit_qty);
				
				dbLockInsUpdDelByStatusNoCheck("MSBBL6010_MST_IV_MAP_U01", ivMapL, ivMapL_bldr);
				
				updIvD(ivMapL);
			}
		}
		
		/**
		 * インボイス明細を更新する。<br>
		 * 預り売上かつ出荷予定が分割した状態で売上実績を訂正・取消した場合に、出荷予定のまとめに伴い、インボイス明細のまとめをオフに更新する。
		 * @param ivMapL インボイスマップリスト
		 */
		protected void updIvD(MCList<MST_IV_MAP_R> ivMapL) {
			
			MCList<MST_IV_D_R> ivDL = MCList.create(MST_IV_D_R.class);
			
			for (MCList<MST_IV_MAP_R> ivMapGrpL : ivMapL.groupList(MST_IV_MAP_R.$iv_d_no)) {
				
				MST_IV_D_R ivDR = MST_IV_D_R.create();
				ivDR.iv_d_no(ivMapGrpL.get(0).iv_d_no());
				ivDR.bndl_flg(false);
				
				ivDL.add(ivDR);
			}
			
			if (!isNull(ivDL)) {
				MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
				MCQueryApiBuilder ivDL_bldr = MCQueryApiBuilder.create(ivD);
				ivDL_bldr.setSet( ivD.bndl_flg);
				dbUpdateKey("MSBBL6010_MST_IV_D_U01", ivDL, ivDL_bldr);
			}
		}
		
		/**
		 * 預り売上前の出荷引当状況に更新
		 */
		protected void updAllocSts() {
			// 預り売上・取消/行削除対象を抽出
			MCIndexKey idxKey = up1().createIndex(SlsAct_Upd01_DtlR.$data_crud_typ, SlsAct_Upd01_DtlR.$sls_cststk_flg);
			MCList<SlsAct_Upd01_DtlR> tgtL = up1().subList(idxKey, MAC_DATA_CRUD_TYP.DEL.value(), true);
			if (isNull(tgtL)) {
				return;
			}
			
			MCList<SlsAct_Upd01_DtlR> allL = tgtL.clone();
			tgtL.clear();
			
			for (SlsAct_Upd01_DtlR dtlR : allL) {
				SlsAct_Upd01_HdrR hdrR = up0().getFirst(_up0IdxKey, dtlR.hdr_peg_no());
				// 呼出元画面が売上明細訂正登録画面の場合、伝票分割され時に、「削除⇒新規」を更新と扱うため、出荷引当状況を更新しない
				if (hdrR.sls_dtl_mod_flg()) {
					continue;
				}
				if (isSlsCststkSplit(dtlR)) {
					continue;
				}
				tgtL.add(dtlR);
			}
			if (isNull(tgtL)) {
				return;
			}
			
			// 出荷引当状況を預り売上前状態に更新
			MCList<MST_SHIP_ALLOC_STS_SV_R> dbc = MCList.create(MST_SHIP_ALLOC_STS_SV_R.class);
			MST_SHIP_ALLOC_STS_SV_R t = MST_SHIP_ALLOC_STS_SV_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setWhere(t.ship_schd_no.eq(bind("ship_schd_no")));
			dbSelect("MSBBL6010_MST_SHIP_ALLOC_STS_SV_S01", dbc, dbc_bldr, tgtL);
			if (isNull(dbc)) {
				return;
			}
			
			// 出荷引当状況を削除
			MST_SHIP_ALLOC_STS_R del_t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder del_bldr = MCQueryApiBuilder.create(del_t);
			del_bldr.setWhere(del_t.ship_schd_no.eq(bind("ship_schd_no")));
			del_bldr.buildDelete("MSBBL6010_MST_SHIP_ALLOC_STS_D01").executeBatchUpdate(dbc);
			
			dbc.addBooleanColumn(MST_SHIP_ALLOC_STS_R.$wms_flg, false);
			// 出荷引当状況保で復元
			MCQueryApiBuilder ins_bldr = MCQueryApiBuilder.create(MST_SHIP_ALLOC_STS_R.create("T"));
			ins_bldr.buildInsert("MSBBL6010_MST_SHIP_ALLOC_STS_I01").executeBatchUpdate(dbc);
			
			// 出荷引当状況保存を削除
			MST_SHIP_ALLOC_STS_SV_R delSts_t = MST_SHIP_ALLOC_STS_SV_R.create("T");
			MCQueryApiBuilder delSts_bldr = MCQueryApiBuilder.create(delSts_t);
			delSts_bldr.setWhere(delSts_t.ship_schd_no.eq(bind("ship_schd_no")));
			delSts_bldr.buildDelete("MSBBL6010_MST_SHIP_ALLOC_STS_SV_D01").executeBatchUpdate(dbc);
		}
		
		/**
		 * 預り売上前の出荷引当状況を出荷引当状況保存に登録
		 */
		protected void insAllocStsSv() {
			// 預り売上・新規登録対象を抽出
			MCIndexKey idxKey = up1().createIndex(SlsAct_Upd01_DtlR.$data_crud_typ, SlsAct_Upd01_DtlR.$sls_cststk_flg);
			MCList<SlsAct_Upd01_DtlR> tgtL = up1().subList(idxKey, MAC_DATA_CRUD_TYP.CRT.value(), true).subList(r->!isSlsCststkSplit(r));
			
			if (isNull(tgtL)) {
				return;
			}
			
			MCList<MST_SHIP_ALLOC_STS_R> dbc = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setWhere(t.ship_schd_no.eq(bind("ship_schd_no")));
			dbSelect("MSBBL6010_MST_SHIP_ALLOC_STS_S01", dbc, dbc_bldr, tgtL);
			if (isNull(dbc)) {
				return;
			}
			
			// 預り売上前の出荷引当状況を出荷引当状況保存に登録
			MCQueryApiBuilder ins_bldr = MCQueryApiBuilder.create(MST_SHIP_ALLOC_STS_SV_R.create("T"));
			ins_bldr.buildInsert("MSBBL6010_MST_SHIP_ALLOC_STS_SV_I01").executeBatchUpdate(dbc);
		}
		protected boolean isSlsCststkSplit(SlsAct_Upd01_DtlR dtlR) {
			
			boolean slsCststkSplit = false;
			
			String dataCrudTyp = null;
			if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
				dataCrudTyp = MAC_DATA_CRUD_TYP.DEL.value();
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				dataCrudTyp = MAC_DATA_CRUD_TYP.CRT.value();
			}
			
			for (SlsAct_Upd01_DtlR r : up1()) {
				if (r.sls_cststk_flg() && isSame(r.data_crud_typ(), dataCrudTyp) && isSame(r.ship_schd_no(), dtlR.ship_schd_no())) {
					slsCststkSplit = true;
					break;
				}
			}
			
			return slsCststkSplit;
		}
		
		protected Map_ShipSchd_DtlR_MST_SHIP_SCHD_R<ShipSchd_DtlR,MST_SHIP_SCHD_R> createMap_ShipSchd_DtlR_MST_SHIP_SCHD_R() {
			return new Map_ShipSchd_DtlR_MST_SHIP_SCHD_R<ShipSchd_DtlR, MST_SHIP_SCHD_R>();
		}

		public class Map_ShipSchd_DtlR_MST_SHIP_SCHD_R<D extends ShipSchd_DtlR, S extends MST_SHIP_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipSchd_DtlR.$ship_schd_no, MST_SHIP_SCHD_R.$ship_schd_no);
				addColumnPathMap(ShipSchd_DtlR.$ship_pr_no, MST_SHIP_SCHD_R.$ship_pr_no);
				addColumnPathMap(ShipSchd_DtlR.$dlv_inst_rcpt_no, MST_SHIP_SCHD_R.$dlv_inst_rcpt_no);
				addColumnPathMap(ShipSchd_DtlR.$slo_prms_no, MST_SHIP_SCHD_R.$slo_prms_no);
				addColumnPathMap(ShipSchd_DtlR.$ship_fr_lg_grp_cd, MST_SHIP_SCHD_R.$ship_fr_lg_grp_cd);
				addColumnPathMap(ShipSchd_DtlR.$wg_cd, MST_SHIP_SCHD_R.$wg_cd);
				addColumnPathMap(ShipSchd_DtlR.$pd_inst_dlv_tm, MST_SHIP_SCHD_R.$pd_inst_dlv_tm);
				addColumnPathMap(ShipSchd_DtlR.$ship_rqst_tm, MST_SHIP_SCHD_R.$ship_rqst_tm);
				addColumnPathMap(ShipSchd_DtlR.$ship_schd_tm, MST_SHIP_SCHD_R.$ship_schd_tm);
				addColumnPathMap(ShipSchd_DtlR.$dlv_schd_tm, MST_SHIP_SCHD_R.$dlv_schd_tm);
				addColumnPathMap(ShipSchd_DtlR.$ship_term_cd, MST_SHIP_SCHD_R.$ship_term_cd);
				addColumnPathMap(ShipSchd_DtlR.$ship_wk_cd, MST_SHIP_SCHD_R.$ship_wk_cd);
				addColumnPathMap(ShipSchd_DtlR.$itm_cd, MST_SHIP_SCHD_R.$itm_cd);
				addColumnPathMap(ShipSchd_DtlR.$itm_sub1, MST_SHIP_SCHD_R.$itm_sub1);
				addColumnPathMap(ShipSchd_DtlR.$itm_sub2, MST_SHIP_SCHD_R.$itm_sub2);
				addColumnPathMap(ShipSchd_DtlR.$itm_sub3, MST_SHIP_SCHD_R.$itm_sub3);
				addColumnPathMap(ShipSchd_DtlR.$itm_nm, MST_SHIP_SCHD_R.$itm_nm);
				addColumnPathMap(ShipSchd_DtlR.$iv_itm_nm, MST_SHIP_SCHD_R.$iv_itm_nm);
				addColumnPathMap(ShipSchd_DtlR.$sundry_itm_flg, MST_SHIP_SCHD_R.$sundry_itm_flg);
				addColumnPathMap(ShipSchd_DtlR.$sno1, MST_SHIP_SCHD_R.$sno1);
				addColumnPathMap(ShipSchd_DtlR.$sno1_null_flg, MST_SHIP_SCHD_R.$sno1_null_flg);
				addColumnPathMap(ShipSchd_DtlR.$sno2, MST_SHIP_SCHD_R.$sno2);
				addColumnPathMap(ShipSchd_DtlR.$sno2_null_flg, MST_SHIP_SCHD_R.$sno2_null_flg);
				addColumnPathMap(ShipSchd_DtlR.$sno3, MST_SHIP_SCHD_R.$sno3);
				addColumnPathMap(ShipSchd_DtlR.$sno3_null_flg, MST_SHIP_SCHD_R.$sno3_null_flg);
				addColumnPathMap(ShipSchd_DtlR.$sno4, MST_SHIP_SCHD_R.$sno4);
				addColumnPathMap(ShipSchd_DtlR.$sno4_null_flg, MST_SHIP_SCHD_R.$sno4_null_flg);
				addColumnPathMap(ShipSchd_DtlR.$lot_no, MST_SHIP_SCHD_R.$lot_no);
				addColumnPathMap(ShipSchd_DtlR.$sublot_no, MST_SHIP_SCHD_R.$sublot_no);
				addColumnPathMap(ShipSchd_DtlR.$ver_no, MST_SHIP_SCHD_R.$ver_no);
				addColumnPathMap(ShipSchd_DtlR.$stk_arrv_bp_cd, MST_SHIP_SCHD_R.$stk_arrv_bp_cd);
				addColumnPathMap(ShipSchd_DtlR.$gd_cd, MST_SHIP_SCHD_R.$gd_cd);
				addColumnPathMap(ShipSchd_DtlR.$quality_typ, MST_SHIP_SCHD_R.$quality_typ);
				addColumnPathMap(ShipSchd_DtlR.$trd_unit_qty, MST_SHIP_SCHD_R.$trd_unit_qty);
				addColumnPathMap(ShipSchd_DtlR.$trd_unit_cd, MST_SHIP_SCHD_R.$trd_unit_cd);
				addColumnPathMap(ShipSchd_DtlR.$base_unit_qty, MST_SHIP_SCHD_R.$base_unit_qty);
				addColumnPathMap(ShipSchd_DtlR.$base_unit_cd, MST_SHIP_SCHD_R.$base_unit_cd);
				addColumnPathMap(ShipSchd_DtlR.$abort_flg, MST_SHIP_SCHD_R.$abort_flg);
				addColumnPathMap(ShipSchd_DtlR.$not_dt_calc_flg, MST_SHIP_SCHD_R.$not_dt_calc_flg);
				addColumnPathMap(ShipSchd_DtlR.$fix_flg, MST_SHIP_SCHD_R.$fix_flg);
				addColumnPathMap(ShipSchd_DtlR.$ship_block_flg, MST_SHIP_SCHD_R.$ship_block_flg);
				addColumnPathMap(ShipSchd_DtlR.$inst_bndl_flg, MST_SHIP_SCHD_R.$inst_bndl_flg);
				addColumnPathMap(ShipSchd_DtlR.$not_lot_mix_flg, MST_SHIP_SCHD_R.$not_lot_mix_flg);
				addColumnPathMap(ShipSchd_DtlR.$not_sublot_mix_flg, MST_SHIP_SCHD_R.$not_sublot_mix_flg);
				addColumnPathMap(ShipSchd_DtlR.$vld_dt_fr, MST_SHIP_SCHD_R.$vld_dt_fr);
				addColumnPathMap(ShipSchd_DtlR.$vld_dt_to, MST_SHIP_SCHD_R.$vld_dt_to);
				addColumnPathMap(ShipSchd_DtlR.$re_ship_schd_flg, MST_SHIP_SCHD_R.$re_ship_schd_flg);
				addColumnPathMap(ShipSchd_DtlR.$intr_rmrks, MST_SHIP_SCHD_R.$intr_rmrks);
				addColumnPathMap(ShipSchd_DtlR.$trd_rmrks, MST_SHIP_SCHD_R.$trd_rmrks);
				addColumnPathMap(ShipSchd_DtlR.$trd_d_rmrks, MST_SHIP_SCHD_R.$trd_d_rmrks);
				addColumnPathMap(ShipSchd_DtlR.$ship_cnt_rmrks, MST_SHIP_SCHD_R.$ship_cnt_rmrks);
				addColumnPathMap(ShipSchd_DtlR.$sub_char1, MST_SHIP_SCHD_R.$sub_char1);
				addColumnPathMap(ShipSchd_DtlR.$sub_char2, MST_SHIP_SCHD_R.$sub_char2);
				addColumnPathMap(ShipSchd_DtlR.$sub_char3, MST_SHIP_SCHD_R.$sub_char3);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
		}
		
		
		/**
		 * 出荷予定SV呼出
		 * 
		 */
		protected void callShipSchdSv() {
			MSBEL_ShipSchdService.ShipSchd_Upd05 ope = MSBEL_ShipSchdService.crtShipSchd_Upd05();
			MCList<ShipSchd_Upd05_DtlR> upd05L = null;
					
			// 上り電文処理対象すべての出荷予定ＮＯに対し処理
			for (SlsAct_Upd01_DtlR dtlR : up1()) {
				SlsAct_Upd01_HdrR hdrR = up0().getFirst(_up0IdxKey, dtlR.hdr_peg_no());
				if (hdrR.sls_dtl_mod_flg() && dtlR.sls_cststk_flg()) {
					continue;
				}
				if (dtlR.sls_cststk_flg() && MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) && isSlsCststkSplit(dtlR)) {
					continue;
				}
				
				upd05L = MCList.create(ShipSchd_Upd05_DtlR.class);
				
				if (!isNull(dtlR.ship_schd_no())) {
					ShipSchd_Upd05_DtlR upd05R = ShipSchd_Upd05_DtlR.create();
					upd05R.ship_schd_no(dtlR.ship_schd_no());
					upd05L.add(upd05R);
				}
				
				if (upd05L.isEmpty() && !isNull(dtlR.dlv_slip_d_no())) {
					executeQuery(upd05L, MSBBL6010_MST_SHIP_ACT_D_S4(), dtlR);
				}
				
				if (upd05L.isEmpty() && !isNull(dtlR.sls_schd_no())) {
					executeQuery(upd05L, MSBBL6010_MST_IV_MAP_S01(), dtlR);
				}
				
				ope.up0().addAll(upd05L);
			}			
			if (ope.up0().size() > 0) {
				ope.exec();
			}
		}
		
		/**
		 * 売上予定SV呼出
		 * 
		 */
		protected void callSlsSchdSv(boolean shipActSvExecFlg) {
			MSBBL_SlsSchdService.Sls_Schd_Upd03 ope = MSBBL_SlsSchdService.crtSls_Schd_Upd03();
			MCList<Sls_Schd_Upd03_DtlR> upd03L = MCList.create(Sls_Schd_Upd03_DtlR.class);
			
			// 売上予定ＮＯを持つ明細に対し、売上予定更新のための売上数量List取得
			MCList<SlsAct_Upd01_DtlR> tmpList = getBaseUnitSlsQtyList();
			MCIndexKey idxKey = tmpList.createIndex(SlsAct_Upd01_DtlR.$sls_act_d_no);
			
			// 上り電文処理対象すべての売上予定ＮＯに対し処理
			for (SlsAct_Upd01_DtlR dtlR : up1()) {
				
				MST_IV_D_R ivDR = _ivDL.getFirst(_ivDIdxKey, dtlR.iv_d_no());
				MCList<SlsAct_Upd01_HdrR> hdrL = up0()
						.subList(SlsAct_Upd01_HdrR.$hdr_peg_no, dtlR.hdr_peg_no());
				if (isNull(dtlR.purc_ddlv_po_no()) && !dtlR.ddlv_iv_grp_flg()
						&& MAC_DATA_CRUD_TYP.isDEL(hdrL.get(0).data_crud_typ())
						&& !isIvShipOrdSls(ivDR)
						&& hdrL.get(0).ship_act_service_exec_flg()) {
					continue;
				}
				if ((hdrL.get(0).ship_act_service_via_flg()
						|| hdrL.get(0).ship_act_service_exec_flg())
						&& MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())
						&& !isIvShipOrdSls(ivDR)
						&& isNull(dtlR.purc_ddlv_po_no()) && !dtlR.ddlv_iv_grp_flg()) {
					continue;
				}
				
				if (!isNull(dtlR.sls_schd_no())) {
					Sls_Schd_Upd03_DtlR upd03R = Sls_Schd_Upd03_DtlR.create();
					upd03R.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					if ((shipActSvExecFlg && isNull(dtlR.purc_ddlv_po_no())
							&& !isIvShipOrdSls(ivDR)
							&& hdrL.get(0).ship_act_service_exec_flg())
							|| hdrL.get(0).ship_act_service_via_flg()) {
						if (isNull(dtlR.dlv_slip_d_no())) {
							continue;
						}
						// 納品書明細ＮＯで売上予定を取り直し、その売上予定ＮＯで処理を行う
						executeQuery(upd03R, MSBBL6010_MST_SLS_SCHD_S1(), dtlR);
						
						if (isNull(upd03R.sls_schd_no()) && !isNull(dtlR.iv_d_no())) {
							upd03R.sls_schd_no(dtlR.sls_schd_no());
						}
					}
					else {
						upd03R.sls_schd_no(dtlR.sls_schd_no());
					}
					upd03R.abort_flg(dtlR.sls_schd_abort_flg());
					upd03R.base_unit_sls_qty(getBaseUnitSlsQty(dtlR, tmpList, idxKey));
					upd03L.add(upd03R);
				}
				else if (!isNull(dtlR.dlv_slip_d_no())) {
					MCList<Sls_Schd_Upd03_DtlR> tmpL = MCList.create(Sls_Schd_Upd03_DtlR.class);
					executeQuery(tmpL, MSBBL6010_MST_SHIP_ACT_D_S5(), dtlR);
					if (!isNull(tmpL)) {
						upd03L.addAll(tmpL);
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
				ope.up0().setAll(tmpUpd03L);
				ope.exec();
			}
		}
		
		/**
		 * 指定された明細がインボイス取引出荷指図対象外売上かどうかどうか。
		 * @param ivDR インボイス明細
		 * @return インボイス取引出荷指図対象外売上の場合はtrue
		 */
		protected boolean isIvShipOrdSls(MST_IV_D_R ivDR) {
			
			if (!isNull(ivDR) 
					&& MAC_VIA_DLV_TYP.isNOT_VIA(ivDR.getStringNE(MST_IV_R.$via_dlv_typ))
					&& MAC_SHIP_INST_TYP.isNON(ivDR.getStringNE(MST_SLO_D_R.$ship_inst_typ))
					&& MAC_SLS_BASIS_TYP.isSHIP_BASIS(ivDR.getStringNE(MST_SLO_R.$sls_basis_typ))
					&& !ivDR.getBooleanNE(MST_SLO_D_R.$sls_cststk_flg)
					&& !MAC_SLO_PROC_TYP.isPURC_DDLV(ivDR.getStringNE(MST_SLO_D_R.$proc_typ))) {
				return true;
			}
			
			return false;
		}
		
		/**
		 * インボイス明細情報を取得する。
		 * @return インボイス明細リスト
		 */
		protected void crtIvDCache() {
			
			crtIvDWk(up1().getStringNE(SlsAct_Upd01_DtlR.$iv_d_no));
			
			_ivDL = MCList.create(MST_IV_D_R.class);
			_ivDL.addStringColumn(MST_IV_R.$via_dlv_typ);
			_ivDL.addStringColumn(MST_SLO_D_R.$ship_inst_typ);
			_ivDL.addStringColumn(MST_SLO_D_R.$proc_typ);
			_ivDL.addBooleanColumn(MST_SLO_D_R.$sls_cststk_flg);
			_ivDL.addStringColumn(MST_SLO_R.$sls_basis_typ);
			
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R iv= MST_IV_R.create("IV");
			MST_SLO_D_R sloD = MST_SLO_D_R.create("SLOD");
			MST_SLO_R slo = MST_SLO_R.create("SLO");
			MSW_IV_D_KEY_R ivDWk = MSW_IV_D_KEY_R.create("IVDWK");
			
			MCQueryApiBuilder ivDL_bldr = MCQueryApiBuilder.create(ivD);
			ivDL_bldr.setSelect(ivD.iv_d_no);
			ivDL_bldr.addSelect(ivD.trd_cur_amt, ivD.trd_cur_tax_amt);
			ivDL_bldr.addSelect(iv.via_dlv_typ);
			ivDL_bldr.addSelect(sloD.ship_inst_typ, sloD.proc_typ, sloD.sls_cststk_flg);
			ivDL_bldr.addSelect(slo.sls_basis_typ);
			ivDL_bldr.addInnerJoin(ivDWk, ivD.iv_d_no.eq(ivDWk.iv_d_no));
			ivDL_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
			ivDL_bldr.addLeftOuterJoin(sloD, ivD.slo_d_no.eq(sloD.slo_d_no));
			ivDL_bldr.addLeftOuterJoin(slo, sloD.slo_no.eq(slo.slo_no));
			dbSelect("MSBBL6010_MST_IV_D_S01", _ivDL, ivDL_bldr);
			
			_ivDIdxKey = _ivDL.createIndex(MST_IV_D_R.$iv_d_no);
		}
		
		/**
		 * インボイス明細のワークテーブルを作成する。
		 * @param ivDNoL インボイス明細NOリスト
		 */
		protected void crtIvDWk(List<String> ivDNoL) {
			
			MCList<MST_IV_D_R> lst = MCList.create(MST_IV_D_R.class);
			MST_IV_D_R r = null;
			
			for (String ivDNo : ivDNoL) {
				
				r = MST_IV_D_R.create();
				r.iv_d_no(ivDNo);
				
				lst.add(r);
			}

			MCQueryApiBuilder ivD_bldr = MCQueryApiBuilder.create(MST_IV_D_R.create("T"));
			dbWkDelete("MSBBL6010_MSW_IV_D_D01", ivD_bldr.getBaseDbc());
			dbWkInsert("MSBBL6010_MSW_IV_D_I01", lst, ivD_bldr.getBaseDbc());
		}
		
		/**
		 * 納品伝票明細情報を取得する。
		 */
		protected void crtDlvSlipDCache(MCList<SlsAct_Upd01_HdrR> hdrL) {
			
			MCList<MST_DLV_SLIP_R> bindL = crtDlvSlipBind(hdrL);
			if (bindL.isEmpty()) return;
			
			_dlvSlipDL = MCList.create(MST_DLV_SLIP_D_R.class);
			MST_DLV_SLIP_D_R dlvSlipD = MST_DLV_SLIP_D_R.create("DLVSLIPD");
			MST_DLV_SLIP_R dlvSlip = MST_DLV_SLIP_R.create("DLVSLIP");
			MCTempView v1 = createTempView("V1");
			
			MCQueryApiBuilder dlvSlipDL_bldr = MCQueryApiBuilder.create(dlvSlipD);
			dlvSlipDL_bldr.setSelectAll();
			dlvSlipDL_bldr.setWhere(dlvSlipD.dlv_slip_no.eq(bind("dlv_slip_no")));
			dlvSlipDL_bldr.addWhereWithAnd(dlvSlipD.dlv_slip_seq.eq(subQuery()
										.select(max(dlvSlip.dlv_slip_seq).as("dlv_slip_seq"))
										.from(dlvSlip)
										.where(value(0).eq(value(0))
												.and(dlvSlip.dlv_slip_no.eq(bind("dlv_slip_no")))
												.cutoff$and(dlvSlip.trn_typ.eq(bind("trn_typ")))
												.and(dlvSlip.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
												.cutoff$and(dlvSlip.slip_sts_typ.eq(bind("slip_sts_typ"))))
										.groupBy(dlvSlip.dlv_slip_no)));
			dbSelect("MSBBL6010_MST_DLV_SLIP_D_S01", _dlvSlipDL, dlvSlipDL_bldr, bindL);
			
			_dlvSlipDIdxKey1 = _dlvSlipDL.createIndex(MST_DLV_SLIP_D_R.$dlv_slip_no);
			_dlvSlipDIdxKey2 = _dlvSlipDL.createIndex(MST_DLV_SLIP_D_R.$dlv_slip_no, MST_DLV_SLIP_D_R.$dlv_slip_seq);
		}
		
		protected MCList<MST_DLV_SLIP_R> crtDlvSlipBind(MCList<SlsAct_Upd01_HdrR> hdrL) {
			MCList<MST_DLV_SLIP_R> bindL = MCList.create(MST_DLV_SLIP_R.class);
			MST_DLV_SLIP_R r = null;
			
			if (hdrL.get(0).iv_service_exec_flg() && !isNullAnd(hdrL.get(0).sls_act_no(), hdrL.get(0).sls_act_seq()) ) {
				r = MST_DLV_SLIP_R.create();
				r.dlv_slip_no(getDlvSlipNo(hdrL.get(0)));
				r.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
				bindL.add(r);
				return bindL;
			}
			
			for (SlsAct_Upd01_HdrR hdrR : hdrL) {
				r = MST_DLV_SLIP_R.create();
				r.dlv_slip_no(nvl(hdrR.dlv_slip_no(), hdrR.ship_dlv_slip_no()));
				if (isNull(r.dlv_slip_no())) continue;
				
				if (isNull(hdrR.sls_act_no())) {
					r.trn_typ(MSC_TRN_TYP.SHIP.value());
				}
				else {
					r.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
				}
				bindL.add(r);
			}
			return bindL;
		}
		
		protected String _dlvSlipNo = null;
		protected String getDlvSlipNo(SlsAct_Upd01_HdrR hdrR) {
			MST_SLS_ACT_R slsActR = MST_SLS_ACT_R.create("T");
			MCQueryApiBuilder slsActR_bldr = MCQueryApiBuilder.create(slsActR);
			slsActR_bldr.setSelect(slsActR.dlv_slip_no);
			slsActR_bldr.setWhere(slsActR.sls_act_no.eq(bind("1")), hdrR.sls_act_no());
			slsActR_bldr.addWhereWithAnd(slsActR.sls_act_seq.eq(bind("1")), hdrR.sls_act_seq());
			dbSelect("MSBBL6010_MST_SLS_ACT_S07", slsActR, slsActR_bldr);
			
			if (!slsActR.isEmpty()) {
				_dlvSlipNo = slsActR.dlv_slip_no();
			}
			return _dlvSlipNo;
		}
		
		/**
		 * 売上予定更新のための売上数量List取得
		 * 
		 * @return
		 */
		protected MCList<SlsAct_Upd01_DtlR> getBaseUnitSlsQtyList() {
			MCList<SlsAct_Upd01_DtlR> insTgtDtlL = MCList.create(SlsAct_Upd01_DtlR.class);
			for (SlsAct_Upd01_DtlR dtlR : up1()) {
				if (!isNull(dtlR.sls_schd_no())) {
					insTgtDtlL.add(dtlR);
				}
			}
			MCList<SlsAct_Upd01_DtlR> tmpDtlL = MCList.create(SlsAct_Upd01_DtlR.class);
			if (!isNull(insTgtDtlL)) {
				// WK登録
				MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
				for (SlsAct_Upd01_DtlR insTgtDtlR : insTgtDtlL) {
					MST_SLS_ACT_D_R slsActDR = MST_SLS_ACT_D_R.create();
					slsActDR.sls_act_d_no(insTgtDtlR.sls_act_d_no());
					slsActDL.add(slsActDR);
					if (!MAC_DATA_CRUD_TYP.isCRT(insTgtDtlR.data_crud_typ())) {
						MST_SLS_ACT_D_R befSlsActDR = MST_SLS_ACT_D_R.create();
						befSlsActDR.sls_act_d_no(insTgtDtlR.bef_sls_act_d_no());
						slsActDL.add(befSlsActDR);
					}
				}
				MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(MST_SLS_ACT_D_R.create("T"));
				dbWkDelete("MSBBL6010_MSW_SLS_ACT_D_D01", slsActDL_bldr.getBaseDbc());
				dbWkInsert("MSBBL6010_MSW_SLS_ACT_D_I01", slsActDL, slsActDL_bldr.getBaseDbc());
				// WKと結合して売上数量Listを取得
				executeQuery(tmpDtlL, MSBBL6010_MST_SLS_ACT_D_S2());
			}
			return tmpDtlL;
		}
		
		/**
		 * 売上予定更新のための売上数量を売上数量Listより取得
		 * 
		 * @param dtlR
		 * @param tmpDtlL
		 * @param idxKey
		 * @return
		 */
		protected MCNumber getBaseUnitSlsQty(SlsAct_Upd01_DtlR dtlR, MCList<SlsAct_Upd01_DtlR> tmpDtlL, MCIndexKey idxKey) {
			
			MCNumber baseSlsQty = MCNumber.ZERO;
			
			// 売上数量Listより基準単位売上数量を計算
			MCList<SlsAct_Upd01_DtlR> tgtDtlL = tmpDtlL.subList(idxKey, dtlR.sls_act_d_no());
			tgtDtlL.sort(SortType.DESC, SlsAct_Upd01_DtlR.$sls_act_d_seq);
			
			for (SlsAct_Upd01_DtlR tgtDtlR : tgtDtlL) {
				baseSlsQty = baseSlsQty.add(tgtDtlR.base_unit_qty());
				if (MAC_SLIP_STS_TYP.isCAN(tgtDtlR.slip_sts_typ())) {
					break;
				}
			}
			
			return baseSlsQty;
		}
		
		/**
		 * 複数に分割されていた場合のメッセージをセット
		 * 
		 */
		protected void setSplitMsg() {
			if (_hdrL.size() == 1) {
				return;
			}
			else {
				// 複数ヘッダ情報があり分割されていた場合
				MCList<SlsAct_Upd01_HdrR> grpHdrL = _hdrL.groupBy(SlsAct_Upd01_HdrR.$hdr_peg_no);
				for (SlsAct_Upd01_HdrR grpHdrR : grpHdrL) {
					MCList<SlsAct_Upd01_HdrR> tmpHdrL = _hdrL.subList(SlsAct_Upd01_HdrR.$hdr_peg_no, grpHdrR.hdr_peg_no());
					if (tmpHdrL.size() > 1) {
						MCMessagePool.add(new MCMessage(grpHdrR, null, MSBBL0063));
						for (SlsAct_Upd01_HdrR tmpHdrR : tmpHdrL) {
							MCMessagePool.add(new MCMessage(tmpHdrR, SlsAct_Upd01_HdrR.$sls_act_no,
											MSBBL0064, tmpHdrR.sls_act_no()));
						}
					}
				}
			}
		}
		
		protected void setInterimMsg() {
			MCIndexKey slsActIdx = _hdrL.createIndex(SlsAct_Upd01_HdrR.$sls_act_no);
			for (SlsAct_Upd01_DtlR dtlR : _dtlL) {
				SlsAct_Upd01_HdrR hdrR = _hdrL.getFirst(slsActIdx, dtlR.sls_act_no());
				if (dtlR.interim_flg() && !isNullOrNullVal(hdrR.iv_no())) {
					MCMessagePool.add(new MCMessage(dtlR, null, MSBBL0642, hdrR.iv_no(), dtlR.iv_d_no(), toDispGUIIndex(dtlR)));
				}
			}
		}
		
		/**
		 * 下り電文作成
		 * 
		 */
		protected void setDown() {
			for (SlsAct_Upd01_HdrR hdrR : _hdrL) {
				SlsAct_Upd01_RsltR rsltR = SlsAct_Upd01_RsltR.create();
				rsltR.hdr_peg_no(hdrR.new_hdr_peg_no());
				rsltR.sls_act_no(hdrR.sls_act_no());
				rsltR.sls_act_seq(hdrR.sls_act_seq());
				rsltR.sls_act_rev(hdrR.sls_act_rev());
				rsltR.dlv_slip_no(hdrR.dlv_slip_no());
				rsltR.iv_no(hdrR.iv_no());
				rsltR.iv_rev(hdrR.iv_rev());
				rsltR.setAttributes(hdrR);
				
				down0().add(rsltR);
			}
			
			MCIndexKey hdrKey = _hdrL.createIndex(SlsAct_Upd01_HdrR.$new_hdr_peg_no);
			
			for (SlsAct_Upd01_DtlR dtlR : _dtlL) {
				SlsAct_Upd01_Rslt_DtlR rsltDtlR = SlsAct_Upd01_Rslt_DtlR.create();
				
				SlsAct_Upd01_HdrR hdrR = _hdrL.getFirst(hdrKey, dtlR.new_hdr_peg_no());
				
				rsltDtlR.hdr_peg_no(dtlR.new_hdr_peg_no());
				rsltDtlR.dtl_peg_no(dtlR.dtl_peg_no());
				rsltDtlR.sls_act_d_no(dtlR.sls_act_d_no());
				rsltDtlR.sls_act_d_seq(dtlR.sls_act_d_seq());
				rsltDtlR.dlv_slip_d_no(dtlR.dlv_slip_d_no());
				rsltDtlR.iv_d_no(dtlR.iv_d_no());
				rsltDtlR.setAttributes(dtlR);
				
				if(!isNull(hdrR)) {
					rsltDtlR.sls_act_no(hdrR.sls_act_no());
					rsltDtlR.sls_act_seq(hdrR.sls_act_seq());
					rsltDtlR.sls_act_rev(hdrR.sls_act_rev());
					rsltDtlR.dlv_slip_no(hdrR.dlv_slip_no());
					rsltDtlR.iv_no(hdrR.iv_no());
					}
				
				down1().add(rsltDtlR);
			}
			
			for (SlsAct_Upd01_IoR ioR : _ioL) {
				MCList<SlsAct_Upd01_HdrR> tmpHdrL = _hdrL.subList(SlsAct_Upd01_HdrR.$hdr_peg_no, ioR.hdr_peg_no());
				if (!isNull(tmpHdrL) && MAC_DATA_CRUD_TYP.isDEL(tmpHdrL.get(0).data_crud_typ())) {
					continue;
				}
				SlsAct_Upd01_Rslt_IoR rsltIoR = SlsAct_Upd01_Rslt_IoR.create();
				rsltIoR.hdr_peg_no(ioR.hdr_peg_no());
				rsltIoR.dtl_peg_no(ioR.dtl_peg_no());
				rsltIoR.io_peg_no(ioR.io_peg_no());
				rsltIoR.sls_act_io_no(ioR.sls_act_io_no());
				rsltIoR.sls_act_io_seq(ioR.sls_act_io_seq());
				rsltIoR.setAttributes(ioR);
				
				down2().add(rsltIoR);
			}
		}
		
		/**
		 * 売上実績データ登録・更新と出荷実績SV呼出
		 * 
		 */
		protected boolean crtSlsActData() {
			MCList<SlsAct_Upd01_DtlR> dtlTgtL = MCList.create(SlsAct_Upd01_DtlR.class);
			MCList<SlsAct_Upd01_IoR> ioTgtL = MCList.create(SlsAct_Upd01_IoR.class);
			
			MCIndexKey dtlIdxkey = _dtlL.createIndex(SlsAct_Upd01_DtlR.$sls_act_d_no);
			
			// 更新・取消前の売上実績情報の取得
			MCList<MST_SLS_ACT_R> canWkHdrL = MCList.create(MST_SLS_ACT_R.class);
			for (SlsAct_Upd01_HdrR hdrR : _hdrL) {
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					MST_SLS_ACT_R canWkHdrR = MST_SLS_ACT_R.create();
					canWkHdrR.sls_act_no(hdrR.sls_act_no());
					canWkHdrL.add(canWkHdrR);
				}
			}
			MCList<SlsAct_Upd01_HdrR> allBefSlsActL = null;
			MCList<SlsAct_Upd01_DtlR> allBefSlsActDL = null;
			MCList<SlsAct_Upd01_IoR> allBefSlsActIoL = null;
			MCIndexKey ikAllBefSlsActL = null;
			MCIndexKey ikAllBefSlsActDL = null;
			MCIndexKey ikAllBefSlsActIoL = null;

			if (!canWkHdrL.isEmpty()) {
				MCQueryApiBuilder canWkHdrL_bldr = MCQueryApiBuilder.create(MST_SLS_ACT_R.create("T"));
				dbWkDelete("MSBBL6010_MSW_SLS_ACT_D01", canWkHdrL_bldr.getBaseDbc());
				dbWkInsert("MSBBL6010_MSW_SLS_ACT_I01", canWkHdrL, canWkHdrL_bldr.getBaseDbc());

				allBefSlsActL = MCList.create(SlsAct_Upd01_HdrR.class);
				allBefSlsActDL = MCList.create(SlsAct_Upd01_DtlR.class);
				allBefSlsActIoL = MCList.create(SlsAct_Upd01_IoR.class);
				executeQuery(allBefSlsActL, MSBBL6010_MST_SLS_ACT_S1());
				executeQuery(allBefSlsActDL, MSBBL6010_MST_SLS_ACT_D_S1());
				executeQuery(allBefSlsActIoL, MSBBL6010_MST_SLS_ACT_IO_S1());
				
				dbWkDelete("MSBBL6010_MSW_SLS_ACT_D02", canWkHdrL_bldr.getBaseDbc());
				
				ikAllBefSlsActL = allBefSlsActL.createIndex(SlsAct_Upd01_HdrR.$sls_act_no);
				ikAllBefSlsActDL = allBefSlsActDL.createIndex(SlsAct_Upd01_DtlR.$sls_act_no, SlsAct_Upd01_DtlR.$sls_act_seq);
				ikAllBefSlsActIoL = allBefSlsActIoL.createIndex(SlsAct_Upd01_IoR.$sls_act_d_no, SlsAct_Upd01_IoR.$sls_act_d_seq);
				
				_befHdrL.setAll(allBefSlsActL);
				
				// 品目マスタのキャッシュにレコードを追加する
				addItmCache(allBefSlsActDL);
			}
			
			// データベースを一括で更新するためのリスト
			MCList<MST_SLS_ACT_R> updSlsActL = MCList.create(MST_SLS_ACT_R.class);
			MCList<MST_SLS_ACT_R> insCanSlsActL = MCList.create(MST_SLS_ACT_R.class);
			MCList<MST_SLS_ACT_D_R> insCanSlsActDL = MCList.create(MST_SLS_ACT_D_R.class);
			MCList<MST_SLS_ACT_IO_R> insCanSlsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
			MCList<MST_SLS_ACT_R> insNewSlsActL = MCList.create(MST_SLS_ACT_R.class);
			MCList<MST_SLS_ACT_D_R> insNewSlsActDL = MCList.create(MST_SLS_ACT_D_R.class);
			MCList<MST_SLS_ACT_IO_R> insNewSlsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
			
			// 出荷実績サービスを一括で実行するためのリスト
			MCList<ShipAct_HdrR> allShipActHdrL = MCList.create(ShipAct_HdrR.class);
			MCList<ShipAct_DtlR> allShipActDtlL = MCList.create(ShipAct_DtlR.class);
			
			// GALinkの呼出対象のリスト
			_slsSlipSlsActL = MCList.create(MST_SLS_ACT_R.class);
			// 納品伝票連番の更新対象のリスト
			_shipRprtSlsActL = MCList.create(MST_SLS_ACT_R.class);
			_shipRprtSlsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
			
			boolean shipActSvExecFlg = false;
			int hdrCnt = 0;
			int clChkCnt = 0;
			_hdrLIdxKey = _hdrL.createIndex(SlsAct_Upd01_HdrR.$dlv_slip_no);
			_dtlLIdxKey = _dtlL.createIndex(SlsAct_Upd01_DtlR.$sls_act_no);
			// 売上実績、売上実績明細、売上実績受払の登録・更新
			for (SlsAct_Upd01_HdrR hdrR : _hdrL) {
				if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ()) 
						&& hdrR.sls_dtl_mod_flg() 
						&& !isNull(hdrR.getStringNE("ref_sls_act_no"))) {
					SlsAct_Upd01_HdrR befSlsActR = allBefSlsActL.getFirst(ikAllBefSlsActL, hdrR.getStringNE("ref_sls_act_no"));
					hdrR.ship_act_sync_flg(befSlsActR.ship_act_sync_flg());
				}
				// 更新・取消の場合、元実績を無効とし、取消データを作成
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					// 更新前のデータ取得
					// 売上実績ヘッダ
					SlsAct_Upd01_HdrR befSlsActR = allBefSlsActL.getFirst(ikAllBefSlsActL, hdrR.sls_act_no());
					if (!isSlsDscntXtra(hdrR.trd_ptn_typ())) {
						hdrR.dlv_slip_no(befSlsActR.dlv_slip_no());
						hdrR.dlv_slip_seq(befSlsActR.dlv_slip_seq());
					}
					hdrR.bef_aprv_flg(befSlsActR.aprv_flg());	// 更新前の承認対象ＦＬＧ 
					hdrR.ship_act_sync_flg(befSlsActR.ship_act_sync_flg());	// 更新前の出荷実績同時計上ＦＬＧ 
					hdrR.edi_flg(befSlsActR.edi_flg());	// 更新前のＥＤＩＦＬＧ
					
					// 売上実績明細
					MCList<SlsAct_Upd01_DtlR> befSlsActDL = allBefSlsActDL.subList(
							ikAllBefSlsActDL, befSlsActR.sls_act_no(),
							befSlsActR.sls_act_seq());
					
					// 売上実績受払
					MCList<SlsAct_Upd01_IoR> befSlsActIoL = MCList.create(SlsAct_Upd01_IoR.class);
					for (SlsAct_Upd01_DtlR befSlsActDR : befSlsActDL) {
						// 納品書明細ＮＯを設定する。
						SlsAct_Upd01_DtlR dtlR = _dtlL.getFirst(dtlIdxkey, befSlsActDR.sls_act_d_no());
						if (!isNull(dtlR) && !dtlR.isEmpty() && isNull(dtlR.dlv_slip_d_no())) {
							dtlR.dlv_slip_d_no(befSlsActDR.dlv_slip_d_no());
						}
						// 明細訂正ＦＬＧの設定
						if (!isNull(dtlR) && MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
							// 売上明細訂正登録の場合は常にオン
							if (hdrR.sls_dtl_mod_flg()) {
								dtlR.sls_dtl_upd_flg(true);
							}
							else {
								// 売上明細訂正登録以外で、単位または単価の変更があった場合はオフ
								if (!isSame(dtlR.trd_unit_cd(), befSlsActDR.trd_unit_cd())
									|| !isSame(dtlR.trd_cur_upri(), befSlsActDR.trd_cur_upri())) {
									dtlR.sls_dtl_upd_flg(false);
								}
								else {
									dtlR.sls_dtl_upd_flg(befSlsActDR.sls_dtl_upd_flg());
								}
							}
						}
						
						MCList<SlsAct_Upd01_IoR> tmpIoL = allBefSlsActIoL.subList(
								ikAllBefSlsActIoL, befSlsActDR.sls_act_d_no(),
								befSlsActDR.sls_act_d_seq());
						befSlsActIoL.addAll(tmpIoL);
						if (!isNull(befSlsActDR.purc_act_d_no())) {
							MCList<SlsAct_Upd01_DtlR> tmpUpL = up1().subList(SlsAct_Upd01_DtlR.$sls_act_d_no, befSlsActDR.sls_act_d_no());
							for (SlsAct_Upd01_DtlR tmpUpR : tmpUpL) {
								tmpUpR.purc_act_d_no(befSlsActDR.purc_act_d_no());
								tmpUpR.purc_ddlv_po_no(befSlsActDR.purc_ddlv_po_no());
							}
						}
						// 新規データの負担部門を元データの負担部門に保持
						if (!isNull(dtlR) && !dtlR.isEmpty() && !isNull(dtlR.bd_dpt_cd())) {
							befSlsActDR.setStringNE(MAUCL_DptUtil.getCrtColumn(
									SlsAct_Upd01_DtlR.$bd_dpt_cd), dtlR.bd_dpt_cd());
						}
						// 更新の場合、元データの外部仕入実績明細ＮＯを保持
						if (!isNull(dtlR) && !dtlR.isEmpty() && !isNull(befSlsActDR.ext_purc_act_d_no())) {
							if (isNull(dtlR.ext_purc_act_d_no())) {
								dtlR.ext_sys_cd(befSlsActDR.ext_sys_cd());
								dtlR.ext_purc_act_d_no(befSlsActDR.ext_purc_act_d_no());
							}
						}
					}
					
					// 更新対象の伝票状況区分を「無効」にする
					MST_SLS_ACT_R updHdrR = MST_SLS_ACT_R.create();
					updHdrR.sls_act_no(hdrR.sls_act_no());
					updHdrR.sls_act_seq(hdrR.sls_act_seq());
					updHdrR.slip_sts_typ(MAC_SLIP_STS_TYP.DIS.value());
					updSlsActL.add(updHdrR); // 出荷実績よりも前にUPDATE
					
					// 「取消」をINSERT
					// 連番を加算
					hdrR.sls_act_seq(befSlsActR.sls_act_seq().add(1));
					befSlsActR.sls_act_seq(hdrR.sls_act_seq());
					hdrR.ship_act_no(befSlsActR.ship_act_no());
					
					MCDate befAcDt = befSlsActR.ac_dt();
					
					// 取消計上日を設定していたら、上書きする
					if (!isNull(hdrR.can_ac_dt())) {
						befSlsActR.ac_dt(hdrR.can_ac_dt());
						if (befSlsActR.bill_basis_dt().lt(hdrR.can_ac_dt())) {
							befSlsActR.bill_basis_dt(hdrR.can_ac_dt());
						}
					}
					
					// 売上実績ヘッダ、売上実績明細、売上実績受払の作成（取消）
					MST_SLS_ACT_R canSlsActR = crtInsSlsAct(befSlsActR, true);
					MCList<MST_SLS_ACT_D_R> canSlsActDL = crtInsSlsActD(
							canSlsActR, befSlsActDL, true, false);
					MCList<MST_SLS_ACT_IO_R> canSlsActIoL = crtInsSlsActIo(
							canSlsActR, canSlsActDL, befSlsActIoL, true);
					// 取消時に保持した価格印字ＦＬＧをヘッダに設定
					hdrR.addBooleanColumn("pri_prnt_flg", canSlsActR.getBooleanNE("pri_prnt_flg"));
					
					if (!isSame(befAcDt, canSlsActR.ac_dt())) {
						canSlsActR.setDateNE("dis_ac_dt", befAcDt);
						canSlsActR.setDateNE(SlsAct_Upd01_HdrR.$can_ac_dt,
								hdrR.can_ac_dt());
						canSlsActR.setStringNE(MAUCL_DptUtil.getCrtColumn(
								MST_SLS_ACT_R.$sls_dpt_cd), hdrR.sls_dpt_cd());
						canSlsActR.setStringNE(MAUCL_DptUtil.getCrtColumn(
								MST_SLS_ACT_R.$ar_dpt_cd), hdrR.ar_dpt_cd());
						canSlsActR.setStringNE(MAUCL_DptUtil.getCrtColumn(
								MST_SLS_ACT_R.$sls_usr_cd), hdrR.sls_usr_cd());
						canSlsActR.setStringNE(MAUCL_DptUtil.getCrtColumn(
								MST_SLS_ACT_R.$wg_cd), hdrR.wg_cd());
						canSlsActR.setDateNE(MAUCL_DptUtil.getCrtColumn(
								MST_SLS_ACT_R.$ac_dt), hdrR.ac_dt());
						// 売上実績明細
						canSlsActDL.setDateNE(MST_SLS_ACT_R.$ac_dt, canSlsActR.ac_dt());
						canSlsActDL.setDateNE(SlsAct_Upd01_HdrR.$can_ac_dt, hdrR.can_ac_dt());
						canSlsActDL.setDateNE("dis_ac_dt", befAcDt);
						canSlsActDL.setDateNE(MAUCL_DptUtil.getCrtColumn(
								MST_SLS_ACT_R.$ac_dt), hdrR.ac_dt());
					}
					setEdiFlg(canSlsActR, canSlsActDL);
					
					insCanSlsActL.add(canSlsActR);
					insCanSlsActDL.addAll(canSlsActDL);
					insCanSlsActIoL.addAll(canSlsActIoL);
					// 取消レコードの各部門ＣＤを設定する
					if (!insCanSlsActL.isEmpty()) {
						// 売上実績ヘッダ
						String[] hdrKeys = new String[] {
								MST_SLS_ACT_R.$sls_dpt_cd,
								MST_SLS_ACT_R.$ar_dpt_cd};
						MAUCL_DptUtil.setCanDpt(insCanSlsActL, hdrKeys, null);
						// 売上実績明細
						String[] dtlKeys = new String[] {
								MST_SLS_ACT_D_R.$bd_dpt_cd};
						MAUCL_DptUtil.setCanDpt(insCanSlsActDL, dtlKeys, null);
						
						// 後続の債権共通SVに渡すため変換後の売上部門、債権部門をbefSlsActRにも反映
						befSlsActR.sls_dpt_cd(canSlsActR.sls_dpt_cd());
						befSlsActR.ar_dpt_cd(canSlsActR.ar_dpt_cd());
					}
					
					boolean execFlg = false;
					if (isSlsDscntXtra(hdrR.trd_ptn_typ()) && MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ()) &&
							(!hdrR.bef_aprv_flg() || MAC_APRV_STS_TYP.isACPT(canSlsActR.aprv_sts_typ())) &&
								hdrR.aprv_flg() && !MAC_APRV_STS_TYP.isACPT(hdrR.aprv_sts_typ()) && !hdrR.sls_dtl_mod_flg()) {
						execFlg = true;
					}
					// 承認対象外の場合
					// 承認対象で最終承認済の場合
					// 売上値引の訂正で、承認対象外から承認対象となった、かつ、売上明細訂正ＦＬＧがオフの場合
					// 上記の場合に、以下の処理を実施
					if (!canSlsActR.aprv_flg() ||
							(canSlsActR.aprv_flg() && MAC_APRV_STS_TYP.isACPT(canSlsActR.aprv_sts_typ())) || execFlg) {
						// 受注状況更新SV用電文作成
						makeSloStsL(canSlsActR, canSlsActDL);
						
						// 売上集計処理用リスト作成
						_slsSumL.addAll(makeSlsSumL(canSlsActR, canSlsActDL));
						
						// 債権共通SV用電文作成（取消）
						if (!getCo().ar_no_use_flg()) {
							makeArInL(befSlsActR, befSlsActDL, true);
						}
						
						// 与信SV用電文作成（取消）
						if (!hdrR.ship_act_service_via_flg()) {
							if (!hdrR.no_cred_upd_flg()) {
								makeCredL(canSlsActR, true, hdrR);
							}
						}
						
						// 出荷帳票発行SV用電文作成（取消のみ）、承認対象外から承認対象となった場合も取り消す
						if ((MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ()) || execFlg)
								&& !hdrR.ship_act_service_via_flg()) {
							// ShipRprt_Upd01
							makeShipRprt01Del(canSlsActR, hdrR);
							if (hdrR.dlv_slip_prnt_flg()) {
								// ShipRprt_Upd02
								makeShipRprt02(hdrR.dlv_slip_no());
							}
						}
					}
					
					// 売上明細訂正から実施した場合、更新前に対し締めチェックしない
					// （売上明細訂正では、計上日や取引先は更新後と変わらないため。過月訂正でも取消計上日は訂正後の計上日と同じになる。）
					if (!hdrR.sls_dtl_mod_flg()) { 
						// 締処理提供SV用電文作成（売上締）・更新/取消
						Cl_Chk03_CndR clChkCndR = Cl_Chk03_CndR.create();
						for (MST_SLS_ACT_D_R actDR : canSlsActDL) {
							MCList<MST_SLS_ACT_IO_R> tmpIoL = canSlsActIoL.subList(
									MST_SLS_ACT_IO_R.$sls_act_d_no, actDR.sls_act_d_no());
							for (MST_SLS_ACT_IO_R tmpIoR : tmpIoL) {
								clChkCndR.peg_no(++clChkCnt);				// 紐付けＮＯ
								clChkCndR.can_ac_dt(hdrR.can_ac_dt());		// 取消計上日
								clChkCndR.sls_cls_chk_flg(true);			// 売上締チェック
								clChkCndR.old_bp_cd(canSlsActR.acst_cd());	// 変更前取引先ＣＤ（売掛先ＣＤ）
								
								if (MAC_TRD_PTN_TYP.isSLS(canSlsActR.trd_ptn_typ()) 
									|| MAC_TRD_PTN_TYP.isSLS_CNSGN(canSlsActR.trd_ptn_typ())
									|| MAC_TRD_PTN_TYP.isSLS_RTN(canSlsActR.trd_ptn_typ())) {
									
									clChkCndR.stk_cls_chk_flg(true);		// 在庫締チェック
									if (MAC_SLS_BASIS_TYP.isIN_BASIS(canSlsActR.sls_basis_typ())
										|| MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(canSlsActR.sls_basis_typ()) 
										|| MAC_TRD_PTN_TYP.isSLS_CNSGN(canSlsActR.trd_ptn_typ()) 
											&& !getDlvCache(actDR.dlv_cd()).cnsgn_stktk_flg()) {
										// 在庫着荷先にあり、実棚数が入力できないケースは入出庫制限をチェックしない
										clChkCndR.io_lmt_skip_flg(true);
									}
									else {
										clChkCndR.old_loc_cd(tmpIoR.loc_cd());		// 変更前場所ＣＤ
										clChkCndR.old_itm_cd(actDR.itm_cd());		// 変更前品目ＣＤ
										clChkCndR.old_itm_sub1(actDR.itm_sub1());	// 変更前枝番１
										clChkCndR.old_itm_sub2(actDR.itm_sub2());	// 変更前枝番２
										clChkCndR.old_itm_sub3(actDR.itm_sub3());	// 変更前枝番３
									}
								}
								_clChk03CndL.add(clChkCndR);
							}
						}
					}
					
					// 連番、改訂番号を加算
					hdrR.sls_act_seq(befSlsActR.sls_act_seq().add(1));
					hdrR.sls_act_rev(befSlsActR.sls_act_rev().add(1));
				}
				
				// 新規・更新の場合の処理対象となる明細、詳細情報を取得
				if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
					// 新ヘッダ紐付きＮＯに紐づく明細情報を取得
					dtlTgtL = getDtlData(_dtlL, hdrR.new_hdr_peg_no(), SlsAct_Upd01_DtlR.$new_hdr_peg_no);
					dtlTgtL.sort(SlsAct_Upd01_DtlR.$disp_seq);
					
					// 新ヘッダ紐付きＮＯに紐付く詳細情報を取得
					ioTgtL = _ioL.subList(SlsAct_Upd01_DtlR.$new_hdr_peg_no, hdrR.new_hdr_peg_no());
					ioTgtL.sort(SlsAct_Upd01_IoR.$io_peg_no);
				}
				
				// 出荷実績SV
				if (hdrR.ship_act_service_exec_flg()) {
					// 更新処理の場合、変更前の売上実績明細データを取得
					MCList<SlsAct_Upd01_DtlR> befSlsActDL = null;
					if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
						befSlsActDL = allBefSlsActDL.subList(ikAllBefSlsActDL, hdrR.sls_act_no());
					}
					
					// 出荷実績SV呼出ヘッダ情報作成
					ShipAct_HdrR shipActHdrR = makeShipActHdr(hdrR, dtlTgtL, ioTgtL);
					// 出荷実績SV呼出明細情報作成
					MCList<ShipAct_DtlR> shipActDtlL = makeShipActDtl(hdrR, dtlTgtL, ioTgtL, befSlsActDL);
					if (shipActDtlL.size() > 0 
							&& shipActDtlL.size() == shipActDtlL.subList(r->MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())).size()
							&& !MAC_DATA_CRUD_TYP.isDEL(shipActHdrR.data_crud_typ())) {
						// 明細電文のデータ更新区分がすべて「削除」の場合、ヘッダのデータ更新区分を「削除」とする
						SlsAct_Upd01_HdrR delHdrR = hdrR.clone();
						delHdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						
						shipActHdrR = makeShipActHdr(delHdrR, dtlTgtL, ioTgtL);
					}
					
					// 出荷実績を登録する必要がない場合は実行しない
					if (shipActDtlL.size() > 0
							|| (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())
									&& !isNull(shipActHdrR.ship_act_no()))) {
						allShipActHdrL.add(shipActHdrR);
						allShipActDtlL.addAll(shipActDtlL);
						
						shipActSvExecFlg = true;
						if (!hdrR.ddlv_sls_flg()&&!hdrR.sls_dtl_mod_flg()) {
							ShipActSendIf_Upd01_DtlR dtlR = ShipActSendIf_Upd01_DtlR.create();
							dtlR.sls_act_no(hdrR.sls_act_no());
							dtlR.data_crud_typ(hdrR.data_crud_typ());
							_shipActSendL.add(dtlR);
						}
					}
				}
				
				// 新規・更新の場合、伝票状況区分が「新規」のデータを追加する
				if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
					// 売上値引登録からの処理で、承認対象、かつ、最終承認済以外の場合、納品書ＮＯをＮＵＬＬで登録する
					if (isSlsDscntXtra(hdrR.trd_ptn_typ()) && hdrR.aprv_flg() && !MAC_APRV_STS_TYP.isACPT(hdrR.aprv_sts_typ())) {
						hdrR.dlv_slip_no(null);
						dtlTgtL.setString(SlsAct_Upd01_DtlR.$dlv_slip_d_no, null);
					}
					// 売上実績ヘッダ、売上実績明細、売上実績受払の作成（新規）
					MST_SLS_ACT_R insSlsActR = crtInsSlsAct(hdrR, false);
					MCList<MST_SLS_ACT_D_R> insSlsActDL = crtInsSlsActD(insSlsActR, dtlTgtL, false, shipActSvExecFlg);
					MCList<MST_SLS_ACT_IO_R> insSlsActIoL = crtInsSlsActIo(insSlsActR, insSlsActDL, ioTgtL, false);
					setUniqueData(insSlsActDL, insSlsActIoL);
					setEdiFlg(insSlsActR, insSlsActDL);

					insNewSlsActL.add(insSlsActR);
					insNewSlsActDL.addAll(insSlsActDL);
					insNewSlsActIoL.addAll(insSlsActIoL);
					
					if (!insSlsActR.aprv_flg() || (insSlsActR.aprv_flg() && MAC_APRV_STS_TYP.isACPT(insSlsActR.aprv_sts_typ()))) {
						
						// 受注状況更新SV用電文作成
						makeSloStsL(insSlsActR, insSlsActDL);
						
						// 売上集計処理用リスト作成
						_slsSumL.addAll(makeSlsSumL(insSlsActR, insSlsActDL));
						
						// 債権共通SV用新規・更新情報をセット
						if (!getCo().ar_no_use_flg()) {
							makeArInL(hdrR, dtlTgtL, false);
						}
						
						// 与信SV用新規・更新情報をセット
						if (!hdrR.ship_act_service_via_flg()) {
							if (!hdrR.no_cred_upd_flg()) {
								makeCredL(insSlsActR, false, hdrR);
							}
						}
						
						// 出荷帳票発行SV用新規・更新情報をセット
						if (hdrR.ship_act_service_via_flg()) {
							if (hdrR.dlv_slip_prnt_flg()) {
								// ShipRprt_Upd02
								makeShipRprt02(hdrR.dlv_slip_no());
							}
						}
						else {
							if (hdrR.dlv_slip_prnt_flg()) {
								makeShipRprt02(hdrR.dlv_slip_no());
							}
							// ShipRprt_Upd01
							makeShipRprt01Crt(insSlsActR, insSlsActDL, insSlsActIoL, ++hdrCnt, hdrR);
						}
					}
					
					// 締処理提供SV用電文作成（売上締）・新規/更新
					Cl_Chk03_CndR clChkCndR = Cl_Chk03_CndR.create();
					for (MST_SLS_ACT_D_R actDR : insSlsActDL) {
						MCList<MST_SLS_ACT_IO_R> tmpIoL = insSlsActIoL.subList(MST_SLS_ACT_IO_R.$sls_act_d_no, actDR.sls_act_d_no());
						for (MST_SLS_ACT_IO_R tmpIoR : tmpIoL) {
							clChkCndR.peg_no(++clChkCnt);			// 紐付けＮＯ
							clChkCndR.ac_dt(insSlsActR.ac_dt());	// 計上日
							clChkCndR.sls_cls_chk_flg(true);		// 売上締チェック
							clChkCndR.bp_cd(insSlsActR.acst_cd());	// 取引先ＣＤ（売掛先ＣＤ）
							
							if (!hdrR.sls_dtl_mod_flg()) {
								if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ()) 
									|| MAC_TRD_PTN_TYP.isSLS_CNSGN(hdrR.trd_ptn_typ())
									|| MAC_TRD_PTN_TYP.isSLS_RTN(hdrR.trd_ptn_typ())) {
								
									clChkCndR.stk_cls_chk_flg(true);		// 在庫締チェック
									
									if (MAC_SLS_BASIS_TYP.isIN_BASIS(hdrR.sls_basis_typ())
										|| MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(hdrR.sls_basis_typ()) 
										|| MAC_TRD_PTN_TYP.isSLS_CNSGN(hdrR.trd_ptn_typ()) 
											&& !getDlvCache(actDR.dlv_cd()).cnsgn_stktk_flg()) {
										// 在庫着荷先にあり、実棚数が入力できないケースは入出庫制限をチェックしない
										clChkCndR.io_lmt_skip_flg(true);
									}
									else {
										clChkCndR.loc_cd(tmpIoR.loc_cd());		// 場所ＣＤ
										clChkCndR.itm_cd(actDR.itm_cd());		// 品目ＣＤ
										clChkCndR.itm_sub1(actDR.itm_sub1());	// 枝番１
										clChkCndR.itm_sub2(actDR.itm_sub2());	// 枝番２
										clChkCndR.itm_sub3(actDR.itm_sub3());	// 枝番３
									}
								}
							}
							_clChk03CndL.add(clChkCndR);
						}
					}
				}
			}
			
			// 締処理提供SV呼出
			callCloseSV();
			
			// 元の売上実績を無効に更新し、売上実績の取消レコードを登録する
			if (!insCanSlsActL.isEmpty()) {
				MST_SLS_ACT_R SlsAct_t = MST_SLS_ACT_R.create("T");
				MCQueryApiBuilder updSlsActL_bldr = MCQueryApiBuilder.create(SlsAct_t);
				updSlsActL_bldr.setSet(SlsAct_t.slip_sts_typ);
				dbUpdateKey("MSBBL6010_MST_SLS_ACT_U01", updSlsActL, updSlsActL_bldr);
				dbInsertEx("MSBBL6010_MST_SLS_ACT_I01", insCanSlsActL,
						MCQueryApiBuilder.create(SlsAct_t));
				dbInsertEx("MSBBL6010_MST_SLS_ACT_D_I01", insCanSlsActDL,
						MCQueryApiBuilder.create(MST_SLS_ACT_D_R.create("T")));
				dbInsertEx("MSBBL6010_MST_SLS_ACT_IO_I01", insCanSlsActIoL,
						MCQueryApiBuilder.create(MST_SLS_ACT_IO_R.create("T")));
				
				// GALinkの呼出対象に追加
				_slsSlipSlsActL.addAll(insCanSlsActL);
				// 納品書連番の更新対象に追加
				_shipRprtSlsActL.addAll(insCanSlsActL);
			}

			// 出荷実績サービスの呼出
			if (!allShipActHdrL.isEmpty()) {
				MSBEL_ShipActService.ShipAct_Chk01 shipActChk01 = MSBEL_ShipActService.crtShipAct_Chk01();
				shipActChk01.up0().setAll(allShipActHdrL);
				shipActChk01.up0().setBoolean(ShipAct_HdrR.$ship_cmpl_no_chk_flg, true);
				shipActChk01.up1().setAll(allShipActDtlL);
				shipActChk01.exec();
				
				if (_msgLPreSv.size() != MCMessagePool.size()) {
					
					// 出荷実績SVチェック処理で発生したエラーメッセージのみスローする。
					MCMessageList causeMsgList = new MCMessageList();
					
					for (MCMessage causeMsg : MCMessagePool.getMessageList()) {
						if (!_msgLPreSv.contains(causeMsg)) {
							
							causeMsgList.add(causeMsg);
						}
					}
					
					// 出荷実績SVチェック処理で発生したエラーメッセージをメッセージプールから消す。
					MCMessagePool.removeAll(causeMsgList);
					
					MCAppException ex = new MCAppException(causeMsgList.get(0));
					causeMsgList.remove(0);
					ex.addCauseMessageList(causeMsgList);
					
					throw ex;
				}
				
				// 出荷実績SV登録処理呼出
				MSBEL_ShipActService.ShipAct_Upd01 shipActUpd01 = MSBEL_ShipActService.crtShipAct_Upd01();
				shipActUpd01.up0().setAll(allShipActHdrL);
				shipActUpd01.up1().setAll(allShipActDtlL);
				shipActUpd01.exec();

				// 出荷実績SVの下り電文より、登録した出荷実績ＮＯ、出荷実績明細ＮＯをセット
				copyByPegNo(insNewSlsActL, shipActUpd01.down0(),
						SlsAct_Upd01_HdrR.$new_hdr_peg_no, new String[] {
								MST_SLS_ACT_R.$ship_act_no
						}, ShipAct_HdrR.$peg_no, new String[] {
								ShipAct_HdrR.$ship_act_no
						});
				// 出荷実績が削除された場合、売上実績ヘッダの出荷実績ＮＯをクリアする。
				MCList<ShipAct_HdrR> delL = shipActUpd01.down0().subList(r->MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
				if (!delL.isEmpty()) {
					MCIndexKey ikSlsAct = insNewSlsActL.createIndex(SlsAct_Upd01_HdrR.$new_hdr_peg_no);
					for (ShipAct_HdrR r : delL) {
						insNewSlsActL.subList(ikSlsAct, r.peg_no()).clear(MST_SLS_ACT_R.$ship_act_no);
					}
				}
				// 新規登録と訂正で、Ioブロックのpeg_noの振り方が異なるので、ヘッダのpeg_noと組わせてチェックする
				MCIndexKey ikShipActD = shipActUpd01.down1().createIndex(ShipAct_DtlR.$hdr_peg_no, ShipAct_DtlR.$peg_no);
				MCIndexKey ikShipActH = allShipActHdrL.createIndex(ShipAct_HdrR.$peg_no);
				for (MST_SLS_ACT_IO_R insNewSlsActIoR : insNewSlsActIoL) {
					ShipAct_DtlR shipActD = shipActUpd01.down1().getFirst(ikShipActD, 
							insNewSlsActIoR.getNumberNE(SlsAct_Upd01_HdrR.$new_hdr_peg_no), 
							insNewSlsActIoR.getNumberNE(SlsAct_Upd01_IoR.$io_peg_no));
					ShipAct_HdrR shipActH = allShipActHdrL.getFirst(ikShipActH, insNewSlsActIoR.getNumberNE(SlsAct_Upd01_HdrR.$new_hdr_peg_no));
					if (isNull(shipActH)) {
						continue;
					}
					if (shipActD != null && (MAC_DATA_CRUD_TYP.isCRT(shipActD.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(shipActD.data_crud_typ()))) {
						// データ更新区分が新規または訂正の場合、出荷実績明細ＮＯをセット
						insNewSlsActIoR.ship_act_d_no(shipActD.ship_act_d_no());
					}
					else {
						// 出荷実績ヘッダまたは出荷実績明細が削除された場合、出荷実績明細ＮＯをクリアする。
						insNewSlsActIoR.ship_act_d_no(null);
					}
				}
				
				// 出荷実績SVの実行で売上予定が更新されるので、更新後の売上予定ＮＯを反映する。
				for (MST_SLS_ACT_D_R insNewSlsActDR : insNewSlsActDL) {
					if (shipActSvExecFlg && isNull(insNewSlsActDR.purc_ddlv_po_no()) && isNull(insNewSlsActDR.iv_d_no())) {
						MST_SLS_ACT_D_R tmp = MST_SLS_ACT_D_R.create();
						executeQuery(tmp, MSBBL6010_MST_SLS_SCHD_S1(), insNewSlsActDR);
						if (!isNull(tmp.sls_schd_no())) {
							insNewSlsActDR.sls_schd_no(tmp.sls_schd_no());
						}
					}
				}
				// 明細のリストにも売上予定ＮＯを反映しておく
				for (SlsAct_Upd01_DtlR r : _dtlL) {
					MCIndexKey idxkey = insNewSlsActDL.createIndex(MST_SLS_SCHD_R.$dlv_slip_d_no);
					MST_SLS_ACT_D_R tmpR = insNewSlsActDL.getFirst(idxkey, r.dlv_slip_d_no());
					if (!isNull(tmpR)) {
						r.sls_schd_no(tmpR.sls_schd_no());
					}
				}
			}
			// 売上実績ヘッダに紐づく全明細が行削除される場合に詳細の出荷実績明細NOとインボイスNOを補完
			if (!isNull(up0()) && up0().get(0).del_all_sls_d_flg()) {
				MCIndexKey idxKey = allBefSlsActIoL.createIndex(SlsAct_Upd01_IoR.$sls_act_io_no);
				for (SlsAct_Upd01_IoR r : up2()) {
					SlsAct_Upd01_IoR row = allBefSlsActIoL.getFirst(idxKey, r.sls_act_io_no());
					if (!isNull(row)) {
						r.ship_act_d_no(row.ship_act_d_no());
					}
				}
				MCIndexKey idxKey2 = up1().createIndex(SlsAct_Upd01_DtlR.$dtl_peg_no);
				for (SlsAct_Upd01_IoR r : up2()) {
					SlsAct_Upd01_DtlR row = up1().getFirst(idxKey2, r.dtl_peg_no());
					if (!isNull(row)) {
						r.iv_d_no(row.iv_d_no());
					}
				}
			}
			// インボイス登録サービスの呼び出し（新規・更新）
			execIvSrvInsUpd(insNewSlsActL, insNewSlsActDL, insNewSlsActIoL);
			// インボイス登録サービスの呼び出し（削除）
			execIvSrvDel();
			// 売上実績の新規レコードを登録する
			if (!insNewSlsActL.isEmpty()) {
				dbInsertEx("MSBBL6010_MST_SLS_ACT_I02", insNewSlsActL,
						MCQueryApiBuilder.create(MST_SLS_ACT_R.create("T")));
				dbInsertEx("MSBBL6010_MST_SLS_ACT_D_I02", insNewSlsActDL,
						MCQueryApiBuilder.create(MST_SLS_ACT_D_R.create("T")));
				dbInsertEx("MSBBL6010_MST_SLS_ACT_IO_I02", insNewSlsActIoL,
						MCQueryApiBuilder.create(MST_SLS_ACT_IO_R.create("T")));
				
				// GALinkの呼出対象に追加
				_slsSlipSlsActL.addAll(insNewSlsActL);
				// 納品書連番の更新対象に追加
				_shipRprtSlsActL.addAll(insNewSlsActL);
				_shipRprtSlsActIoL.addAll(insNewSlsActIoL);
			}
			
			return shipActSvExecFlg;
		}
		
		protected void execIvSrvInsUpd(MCList<MST_SLS_ACT_R> insNewSlsActL, MCList<MST_SLS_ACT_D_R> insNewSlsActDL, MCList<MST_SLS_ACT_IO_R> insNewSlsActIoL) {
			// 売上単票から計画外売上のインボイスを登録・更新する場合のみ対象
			if (isNull(up0()) || !up0().get(0).iv_service_exec_flg()
					|| (MAC_DATA_CRUD_TYP.isDEL(up0().get(0).data_crud_typ()) && !up0().get(0).del_all_sls_d_flg())) {
				return;
			}
			
			// 出荷実績明細ＮＯの設定
			for (SlsAct_Upd01_IoR r : up2()) {
				for (MST_SLS_ACT_IO_R ioR : insNewSlsActIoL) {
					if (isSame(ioR.getNumberNE(SlsAct_Upd01_IoR.$io_peg_no), r.io_peg_no())) {
						r.ship_act_d_no(ioR.ship_act_d_no());
						break;
					}
				}
			}
			
			MSBEL_IvRegService.Iv_Chk01 IvChk01 = MSBEL_IvRegService.crtIv_Chk01();
			MSBEL_IvRegService.Iv_Ins01 IvIns01 = MSBEL_IvRegService.crtIv_Ins01();
			MSBEL_IvRegService.Iv_Upd01 IvUpd01 = MSBEL_IvRegService.crtIv_Upd01();
			
			// チェック処理の呼出し
			copy(IvChk01.up0(), up0().get(0), createMap_Iv_Chk01_HdrR_SlsAct_Upd01_HdrR());
			int cnt = 0;
			for (SlsAct_Upd01_DtlR r : up1()) {
				Iv_Chk01_DtlR dtlR = Iv_Chk01_DtlR.create();
				copy(dtlR, r, createMap_Iv_Chk01_DtlR_SlsAct_Upd01_DtlR());
				dtlR.index(cnt);
				
				MCList<Iv_Chk01_ShipActMapDtlR> mapL = MCList.create(Iv_Chk01_ShipActMapDtlR.class);
				addAll(mapL, up2().subList(SlsAct_Upd01_IoR.$dtl_peg_no, r.dtl_peg_no()), createMap_Iv_Chk01_ShipActMapDtlR_SlsAct_Upd01_IoR());
				mapL.setNumber(Iv_Chk01_ShipActMapDtlR.$index, cnt);
				
				if (mapL.subList(l -> !isSame(l.getStatus(), Status.DELETE)).size() >= 2) {
					dtlR.bndl_flg(true);
				}
				
				IvChk01.up1().add(dtlR);
				if (!MAC_TRD_PTN_TYP.isSLS_CNSGN(up0().get(0).trd_ptn_typ())
						&& !MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
					IvChk01.up4().addAll(mapL);
				}
				cnt++;
			}
			
			IvChk01.exec();
			throwUpdErr();
			
			MCList<Iv_Chk01_DtlR> down = MCList.create(Iv_Chk01_DtlR.class);
			MCIndexKey dlvIdxkey = null;
			
			if (MAC_DATA_CRUD_TYP.isCRT(up0().get(0).data_crud_typ())) {
				MCRow.copyvalue(IvIns01.up0(), IvChk01.down0());
				IvIns01.up0().iv_tax_cmpl_flg(true);
				IvIns01.up1().setAll(IvChk01.down1());
				if (!MAC_TRD_PTN_TYP.isSLS_CNSGN(up0().get(0).trd_ptn_typ())) {
					IvIns01.up4().setAll(IvChk01.down4());
				}
				IvIns01.exec();
				// インボイスＮＯをセット
				insNewSlsActL.setString(MST_SLS_ACT_R.$iv_no, IvIns01.down0().iv_no());
				_hdrL.setString(SlsAct_Upd01_HdrR.$iv_no, IvIns01.down0().iv_no());
				_hdrL.setNumber(SlsAct_Upd01_HdrR.$iv_rev, IvIns01.down0().iv_rev());
				_arInL.setString(ArCmn_Upd01_DtlR.$iv_no, IvIns01.down0().iv_no());
				
				dlvIdxkey = IvIns01.down1().createIndex(Iv_Chk01_DtlR.$dlv_slip_d_no);
				down = IvIns01.down1();
			}
			else {
				MCRow.copyvalue(IvUpd01.up0(), IvChk01.down0());
				IvUpd01.up0().iv_tax_cmpl_flg(true);
				IvUpd01.up1().setAll(IvChk01.down1());
				IvUpd01.up4().setAll(IvChk01.down4());
				IvUpd01.exec();
				
				_hdrL.setNumber(SlsAct_Upd01_HdrR.$iv_rev, IvUpd01.down0().iv_rev());
				dlvIdxkey = IvUpd01.down1().createIndex(Iv_Chk01_DtlR.$dlv_slip_d_no);
				down = IvUpd01.down1();
			}
			
			// インボイス明細ＮＯをセット
			MCIndexKey slsIdxkey = _dtlL.createIndex(SlsAct_Upd01_DtlR.$sls_act_d_no);
			for (MST_SLS_ACT_D_R r : insNewSlsActDL) {
				Iv_Chk01_DtlR downR = down.getFirst(dlvIdxkey, r.dlv_slip_d_no());
				if (!isNull(downR)) {
					r.iv_d_no(downR.iv_d_no());
				}
				SlsAct_Upd01_DtlR dtlR = _dtlL.getFirst(slsIdxkey, r.sls_act_d_no());
				if (!isNull(dtlR)) {
					dtlR.iv_d_no(downR.iv_d_no());
				}
			}
			
			// 非在庫品に対して売上予定ＮＯをセット
			MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			MST_SLS_SCHD_R slsSchdL_t = MST_SLS_SCHD_R.create("T");
			MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(slsSchdL_t);
			slsSchdL_bldr.setSelect(slsSchdL_t.sls_schd_no, slsSchdL_t.iv_d_no);
			slsSchdL_bldr.setWhere(slsSchdL_t.iv_d_no.eq(bind("iv_d_no")));
			dbSelect("MSBBL6010_MST_SLS_SCHD_S03", slsSchdL, slsSchdL_bldr, insNewSlsActDL);
			
			MCIndexKey ivIdxkey = slsSchdL.createIndex(Iv_Chk01_DtlR.$iv_d_no);
			for (MST_SLS_ACT_D_R r : insNewSlsActDL) {
				if (isNull(r.sls_schd_no())) {
					MST_SLS_SCHD_R schdR = slsSchdL.getFirst(ivIdxkey, r.iv_d_no());
					if (!isNull(schdR)) {
						r.sls_schd_no(schdR.sls_schd_no());
						SlsAct_Upd01_DtlR dtlR = _dtlL.getFirst(slsIdxkey, r.sls_act_d_no());
						if (!isNull(dtlR)) {
							dtlR.sls_schd_no(schdR.sls_schd_no());
						}
					}
				}
			}
		}
		
		protected Map_Iv_Chk01_HdrR_SlsAct_Upd01_HdrR<Iv_Chk01_HdrR,SlsAct_Upd01_HdrR> createMap_Iv_Chk01_HdrR_SlsAct_Upd01_HdrR() {
			return new Map_Iv_Chk01_HdrR_SlsAct_Upd01_HdrR<Iv_Chk01_HdrR, SlsAct_Upd01_HdrR>();
		}

		public class Map_Iv_Chk01_HdrR_SlsAct_Upd01_HdrR<D extends Iv_Chk01_HdrR, S extends SlsAct_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Iv_Chk01_HdrR.$iv_mng_no, SlsAct_Upd01_HdrR.$iv_mng_no);
				addColumnPathMap(Iv_Chk01_HdrR.$iv_no, SlsAct_Upd01_HdrR.$iv_no);
				addColumnPathMap(Iv_Chk01_HdrR.$iv_src_typ, SlsAct_Upd01_HdrR.$iv_src_typ);
				addColumnPathMap(Iv_Chk01_HdrR.$ac_dt, SlsAct_Upd01_HdrR.$ac_dt);
				addColumnPathMap(Iv_Chk01_HdrR.$iv_dt, SlsAct_Upd01_HdrR.$iv_dt);
				addColumnPathMap(Iv_Chk01_HdrR.$num_flg, SlsAct_Upd01_HdrR.$num_flg);
				addColumnPathMap(Iv_Chk01_HdrR.$iv_immed_prnt_flg, SlsAct_Upd01_HdrR.$iv_immed_prnt_flg);
				addColumnPathMap(Iv_Chk01_HdrR.$pl_skip_flg, SlsAct_Upd01_HdrR.$pl_skip_flg);
				addColumnPathMap(Iv_Chk01_HdrR.$trd_ptn_typ, SlsAct_Upd01_HdrR.$trd_ptn_typ);
				addColumnPathMap(Iv_Chk01_HdrR.$sls_basis_typ, SlsAct_Upd01_HdrR.$sls_basis_typ);
				addColumnPathMap(Iv_Chk01_HdrR.$trnspt_cd, SlsAct_Upd01_HdrR.$trnspt_cd);
				addColumnPathMap(Iv_Chk01_HdrR.$vssl_flght, SlsAct_Upd01_HdrR.$vssl_flght);
				addColumnPathMap(Iv_Chk01_HdrR.$load_port_cd, SlsAct_Upd01_HdrR.$load_port_cd);
				addColumnPathMap(Iv_Chk01_HdrR.$etd_dt, SlsAct_Upd01_HdrR.$etd_dt);
				addColumnPathMap(Iv_Chk01_HdrR.$dschrg_port_cd, SlsAct_Upd01_HdrR.$dschrg_port_cd);
				addColumnPathMap(Iv_Chk01_HdrR.$eta_dt, SlsAct_Upd01_HdrR.$eta_dt);
				addColumnPathMap(Iv_Chk01_HdrR.$via_port_cd, SlsAct_Upd01_HdrR.$via_port_cd);
				addColumnPathMap(Iv_Chk01_HdrR.$via_schd_dt, SlsAct_Upd01_HdrR.$via_schd_dt);
				addColumnPathMap(Iv_Chk01_HdrR.$trd_cur_cd, SlsAct_Upd01_HdrR.$trd_cur_cd);
				addColumnPathMap(Iv_Chk01_HdrR.$trd_amt_rnd_typ, SlsAct_Upd01_HdrR.$amt_rnd_typ);
				addColumnPathMap(Iv_Chk01_HdrR.$trd_tax_rnd_typ, SlsAct_Upd01_HdrR.$tax_rnd_typ);
				addColumnPathMap(Iv_Chk01_HdrR.$trd_cur_amt_dec_place, SlsAct_Upd01_HdrR.$trd_cur_amt_dec_place);
				addColumnPathMap(Iv_Chk01_HdrR.$bill_basis_dt, SlsAct_Upd01_HdrR.$bill_basis_dt);
				addColumnPathMap(Iv_Chk01_HdrR.$rcv_schd_dt, SlsAct_Upd01_HdrR.$rcv_schd_dt);
				addColumnPathMap(Iv_Chk01_HdrR.$xrate, SlsAct_Upd01_HdrR.$xrate);
				addColumnPathMap(Iv_Chk01_HdrR.$ptax_xrate, SlsAct_Upd01_HdrR.$ptax_xrate);
				addColumnPathMap(Iv_Chk01_HdrR.$iv_rmrks, SlsAct_Upd01_HdrR.$iv_rmrks);
				addColumnPathMap(Iv_Chk01_HdrR.$case_mrk1, SlsAct_Upd01_HdrR.$case_mrk1);
				addColumnPathMap(Iv_Chk01_HdrR.$case_mrk2, SlsAct_Upd01_HdrR.$case_mrk2);
				addColumnPathMap(Iv_Chk01_HdrR.$case_mrk3, SlsAct_Upd01_HdrR.$case_mrk3);
				addColumnPathMap(Iv_Chk01_HdrR.$case_mrk4, SlsAct_Upd01_HdrR.$case_mrk4);
				addColumnPathMap(Iv_Chk01_HdrR.$case_mrk5, SlsAct_Upd01_HdrR.$case_mrk5);
				addColumnPathMap(Iv_Chk01_HdrR.$case_mrk6, SlsAct_Upd01_HdrR.$case_mrk6);
				addColumnPathMap(Iv_Chk01_HdrR.$lc_no, SlsAct_Upd01_HdrR.$lc_no);
				addColumnPathMap(Iv_Chk01_HdrR.$lc_dt, SlsAct_Upd01_HdrR.$lc_dt);
				addColumnPathMap(Iv_Chk01_HdrR.$lc_rmrks, SlsAct_Upd01_HdrR.$lc_rmrks);
				addColumnPathMap(Iv_Chk01_HdrR.$bl_no, SlsAct_Upd01_HdrR.$bl_no);
				addColumnPathMap(Iv_Chk01_HdrR.$bl_dt, SlsAct_Upd01_HdrR.$bl_dt);
				addColumnPathMap(Iv_Chk01_HdrR.$bl_rmrks, SlsAct_Upd01_HdrR.$bl_rmrks);
				addColumnPathMap(Iv_Chk01_HdrR.$data_crud_typ, SlsAct_Upd01_HdrR.$data_crud_typ);
				addColumnPathMap(Iv_Chk01_HdrR.$can_ac_dt, SlsAct_Upd01_HdrR.$can_ac_dt);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.via_dlv_typ(MAC_VIA_DLV_TYP.NOT_VIA.value());
				dest.cmpl_flg(true);
				dest.non_cmpl_flg(true);
				dest.ship_rqst_id_typ(MSC_SHIP_RQST_ID_TYP.CST.value());
				dest.ship_rqst_id_cd(src.cst_cd());
				dest.intr_rmrks(src.iv_intr_rmrks());
				dest.sub_char1(src.iv_sub_char1());
				dest.sub_char2(src.iv_sub_char2());
				dest.sub_char3(src.iv_sub_char3());
				dest.tterm_cd1(src.iv_tterm_cd1());
				dest.tterm_rmrks1(src.iv_tterm_rmrks1());
				dest.tterm_cd2(src.iv_tterm_cd2());
				dest.tterm_rmrks2(src.iv_tterm_rmrks2());
				dest.tterm_cd3(src.iv_tterm_cd3());
				dest.tterm_rmrks3(src.iv_tterm_rmrks3());
				
				if (MAC_DATA_CRUD_TYP.isCRT(dest.data_crud_typ())) {
					dest.iv_upd_cntr(-1);
				}
				else {
					dest.iv_upd_cntr(src.iv_upd_cntr());
				}
				
				// 計画外売上のIV登録では納品先違いの明細はチェック処理でふさぐ
				dest.dlv_id_typ(MSC_DLV_ID_TYP.DLV.value());
				dest.dlv_id_cd(up1().get(0).dlv_cd());
				dest.dlv_id_nm(up1().get(0).dlv_nm());
				dest.dlv_cntct_dpt(up1().get(0).dlv_cntct_dpt());
				dest.dlv_cntct_psn(up1().get(0).dlv_cntct_psn());
				dest.dlv_zip_cd(up1().get(0).dlv_zip_cd());
				dest.dlv_addr1(up1().get(0).dlv_addr1());
				dest.dlv_addr2(up1().get(0).dlv_addr2());
				dest.dlv_addr3(up1().get(0).dlv_addr3());
				dest.dlv_addr4(up1().get(0).dlv_addr4());
				dest.dlv_tel(up1().get(0).dlv_tel());
				dest.dlv_fax(up1().get(0).dlv_fax());
				dest.dlv_cntry_cd(up1().get(0).dlv_cntry_cd());
				dest.dlv_sundry_flg(up1().get(0).dlv_sundry_flg());
			}
		}
		
		protected Map_Iv_Chk01_DtlR_SlsAct_Upd01_DtlR<Iv_Chk01_DtlR,SlsAct_Upd01_DtlR> createMap_Iv_Chk01_DtlR_SlsAct_Upd01_DtlR() {
			return new Map_Iv_Chk01_DtlR_SlsAct_Upd01_DtlR<Iv_Chk01_DtlR, SlsAct_Upd01_DtlR>();
		}

		public class Map_Iv_Chk01_DtlR_SlsAct_Upd01_DtlR<D extends Iv_Chk01_DtlR, S extends SlsAct_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Iv_Chk01_DtlR.$sls_usr_cd, SlsAct_Upd01_DtlR.$sls_usr_cd);
				addColumnPathMap(Iv_Chk01_DtlR.$sls_dpt_cd, SlsAct_Upd01_DtlR.$sls_dpt_cd);
				addColumnPathMap(Iv_Chk01_DtlR.$ar_dpt_cd, SlsAct_Upd01_DtlR.$ar_dpt_cd);
				addColumnPathMap(Iv_Chk01_DtlR.$iv_d_no, SlsAct_Upd01_DtlR.$iv_d_no);
				addColumnPathMap(Iv_Chk01_DtlR.$disp_seq, SlsAct_Upd01_DtlR.$disp_seq);
				addColumnPathMap(Iv_Chk01_DtlR.$slo_no, SlsAct_Upd01_DtlR.$slo_no);
				addColumnPathMap(Iv_Chk01_DtlR.$slo_d_no, SlsAct_Upd01_DtlR.$slo_d_no);
				addColumnPathMap(Iv_Chk01_DtlR.$cst_po_d_no, SlsAct_Upd01_DtlR.$cst_po_d_no);
				addColumnPathMap(Iv_Chk01_DtlR.$itm_cd, SlsAct_Upd01_DtlR.$itm_cd);
				addColumnPathMap(Iv_Chk01_DtlR.$itm_sub1, SlsAct_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(Iv_Chk01_DtlR.$itm_sub2, SlsAct_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(Iv_Chk01_DtlR.$itm_sub3, SlsAct_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(Iv_Chk01_DtlR.$itm_nm, SlsAct_Upd01_DtlR.$itm_nm);
				addColumnPathMap(Iv_Chk01_DtlR.$sno1, SlsAct_Upd01_DtlR.$sno1);
				addColumnPathMap(Iv_Chk01_DtlR.$sno2, SlsAct_Upd01_DtlR.$sno2);
				addColumnPathMap(Iv_Chk01_DtlR.$sno3, SlsAct_Upd01_DtlR.$sno3);
				addColumnPathMap(Iv_Chk01_DtlR.$sno4, SlsAct_Upd01_DtlR.$sno4);
				addColumnPathMap(Iv_Chk01_DtlR.$iv_itm_nm, SlsAct_Upd01_DtlR.$iv_itm_nm);
				addColumnPathMap(Iv_Chk01_DtlR.$cst_itm_cd, SlsAct_Upd01_DtlR.$cst_itm_cd);
				addColumnPathMap(Iv_Chk01_DtlR.$cst_itm_nm, SlsAct_Upd01_DtlR.$cst_itm_nm);
				addColumnPathMap(Iv_Chk01_DtlR.$gd_cd, SlsAct_Upd01_DtlR.$gd_cd);
				addColumnPathMap(Iv_Chk01_DtlR.$trd_unit_cd, SlsAct_Upd01_DtlR.$trd_unit_cd);
				addColumnPathMap(Iv_Chk01_DtlR.$trd_unit_qty, SlsAct_Upd01_DtlR.$trd_unit_qty);
				addColumnPathMap(Iv_Chk01_DtlR.$base_unit_qty, SlsAct_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(Iv_Chk01_DtlR.$base_unit_cd, SlsAct_Upd01_DtlR.$base_unit_cd);
				addColumnPathMap(Iv_Chk01_DtlR.$trd_cur_upri, SlsAct_Upd01_DtlR.$trd_cur_upri);
				addColumnPathMap(Iv_Chk01_DtlR.$trd_cur_amt, SlsAct_Upd01_DtlR.$trd_cur_amt);
				addColumnPathMap(Iv_Chk01_DtlR.$trd_cur_dscnt_amt, SlsAct_Upd01_DtlR.$trd_cur_dscnt_amt);
				addColumnPathMap(Iv_Chk01_DtlR.$iv_upri, SlsAct_Upd01_DtlR.$iv_upri);
				addColumnPathMap(Iv_Chk01_DtlR.$iv_amt, SlsAct_Upd01_DtlR.$iv_amt);
				addColumnPathMap(Iv_Chk01_DtlR.$sundry_itm_flg, SlsAct_Upd01_DtlR.$sundry_itm_flg);
				addColumnPathMap(Iv_Chk01_DtlR.$dscnt_itm_flg, SlsAct_Upd01_DtlR.$dscnt_itm_flg);
				addColumnPathMap(Iv_Chk01_DtlR.$tax_cd, SlsAct_Upd01_DtlR.$tax_cd);
				addColumnPathMap(Iv_Chk01_DtlR.$tax_rate, SlsAct_Upd01_DtlR.$tax_rate);
				addColumnPathMap(Iv_Chk01_DtlR.$trd_cur_tax_amt, SlsAct_Upd01_DtlR.$trd_cur_tax_amt);
				addColumnPathMap(Iv_Chk01_DtlR.$ptax_cur_amt, SlsAct_Upd01_DtlR.$ptax_cur_amt);
				addColumnPathMap(Iv_Chk01_DtlR.$wtax_rate, SlsAct_Upd01_DtlR.$wtax_rate);
				addColumnPathMap(Iv_Chk01_DtlR.$wtax_amt, SlsAct_Upd01_DtlR.$wtax_amt);
				addColumnPathMap(Iv_Chk01_DtlR.$cntry_org_cd, SlsAct_Upd01_DtlR.$cntry_org_cd);
				addColumnPathMap(Iv_Chk01_DtlR.$rsn_cd, SlsAct_Upd01_DtlR.$rsn_cd);
				addColumnPathMap(Iv_Chk01_DtlR.$bd_dpt_cd, SlsAct_Upd01_DtlR.$bd_dpt_cd);
				addColumnPathMap(Iv_Chk01_DtlR.$dscnt_rsn_cd, SlsAct_Upd01_DtlR.$dscnt_rsn_cd);
				addColumnPathMap(Iv_Chk01_DtlR.$iv_d_rmrks, SlsAct_Upd01_DtlR.$iv_d_rmrks);
				addColumnPathMap(Iv_Chk01_DtlR.$trd_rmrks, SlsAct_Upd01_DtlR.$iv_trd_rmrks);
				addColumnPathMap(Iv_Chk01_DtlR.$trd_d_rmrks, SlsAct_Upd01_DtlR.$iv_trd_d_rmrks);
				addColumnPathMap(Iv_Chk01_DtlR.$intr_d_rmrks, SlsAct_Upd01_DtlR.$iv_intr_d_rmrks);
				addColumnPathMap(Iv_Chk01_DtlR.$dtl_sub_char1, SlsAct_Upd01_DtlR.$iv_sub_char1);
				addColumnPathMap(Iv_Chk01_DtlR.$dtl_sub_char2, SlsAct_Upd01_DtlR.$iv_sub_char2);
				addColumnPathMap(Iv_Chk01_DtlR.$dtl_sub_char3, SlsAct_Upd01_DtlR.$iv_sub_char3);
				addColumnPathMap(Iv_Chk01_DtlR.$ship_schd_no, SlsAct_Upd01_DtlR.$ship_schd_no);
				addColumnPathMap(Iv_Chk01_DtlR.$inc_tax_flg, SlsAct_Upd01_DtlR.$inc_tax_flg);
				addColumnPathMap(Iv_Chk01_DtlR.$dlv_slip_d_no, SlsAct_Upd01_DtlR.$dlv_slip_d_no);
				addColumnPathMap(Iv_Chk01_DtlR.$data_crud_typ, SlsAct_Upd01_DtlR.$data_crud_typ);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.trd_cd(up0().get(0).trd_cd());
				dest.cst_po_no(up0().get(0).cst_po_no());
				if (MAC_STK_MNG_TYP.isNOT_MNG(src.stk_mng_typ())) {
					dest.manual_add_flg(true);
				}
				else {
					dest.uplnd_flg(true);
				}
			}
		}
		
		protected Map_Iv_Chk01_ShipActMapDtlR_SlsAct_Upd01_IoR<Iv_Chk01_ShipActMapDtlR,SlsAct_Upd01_IoR> createMap_Iv_Chk01_ShipActMapDtlR_SlsAct_Upd01_IoR() {
			return new Map_Iv_Chk01_ShipActMapDtlR_SlsAct_Upd01_IoR<Iv_Chk01_ShipActMapDtlR, SlsAct_Upd01_IoR>();
		}

		public class Map_Iv_Chk01_ShipActMapDtlR_SlsAct_Upd01_IoR<D extends Iv_Chk01_ShipActMapDtlR, S extends SlsAct_Upd01_IoR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Iv_Chk01_ShipActMapDtlR.$iv_d_no, SlsAct_Upd01_IoR.$iv_d_no);
				addColumnPathMap(Iv_Chk01_ShipActMapDtlR.$ship_act_d_no, SlsAct_Upd01_IoR.$ship_act_d_no);
				addColumnPathMap(Iv_Chk01_ShipActMapDtlR.$base_unit_qty, SlsAct_Upd01_IoR.$base_unit_qty);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.ship_alloc_sts_no(MAC_STR.NULL_VAL.value());
				dest.ship_schd_no(MAC_STR.NULL_VAL.value());
			}
		}
		
		protected void execIvSrvDel() {
			// 売上単票から計画外売上のインボイスを削除する場合のみ対象
			if (isNull(up0()) || !up0().get(0).iv_service_exec_flg() 
					|| !(MAC_DATA_CRUD_TYP.isDEL(up0().get(0).data_crud_typ()) && !up0().get(0).del_all_sls_d_flg())) {
				return;
			}
			
			MSBEL_IvRegService.Iv_Chk02 IvChk02 = MSBEL_IvRegService.crtIv_Chk02();
			MSBEL_IvRegService.Iv_Del01 IvDel01 = MSBEL_IvRegService.crtIv_Del01();
			
			// チェック処理の呼出し
			copy(IvChk02.up0(), up0().get(0), createMapDel_Iv_Chk01_HdrR_SlsAct_Upd01_HdrR());
			addAll(IvChk02.up1(), up1(), createMapDel_Iv_Chk01_DtlR_SlsAct_Upd01_DtlR());
			
			IvChk02.exec();
			throwUpdErr();
			
			MCRow.copyvalue(IvDel01.up0(), IvChk02.down0());
			IvDel01.up1().setAll(IvChk02.down1());
			IvDel01.exec();
		}
		
		protected MapDel_Iv_Chk01_HdrR_SlsAct_Upd01_HdrR<Iv_Chk01_HdrR,SlsAct_Upd01_HdrR> createMapDel_Iv_Chk01_HdrR_SlsAct_Upd01_HdrR() {
			return new MapDel_Iv_Chk01_HdrR_SlsAct_Upd01_HdrR<Iv_Chk01_HdrR, SlsAct_Upd01_HdrR>();
		}

		public class MapDel_Iv_Chk01_HdrR_SlsAct_Upd01_HdrR<D extends Iv_Chk01_HdrR, S extends SlsAct_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Iv_Chk01_HdrR.$iv_mng_no, SlsAct_Upd01_HdrR.$iv_mng_no);
				addColumnPathMap(Iv_Chk01_HdrR.$iv_upd_cntr, SlsAct_Upd01_HdrR.$iv_upd_cntr);
				addColumnPathMap(Iv_Chk01_HdrR.$data_crud_typ, SlsAct_Upd01_HdrR.$data_crud_typ);
				addColumnPathMap(Iv_Chk01_HdrR.$can_ac_dt, SlsAct_Upd01_HdrR.$can_ac_dt);
			}
		}
		protected MapDel_Iv_Chk01_DtlR_SlsAct_Upd01_DtlR<Iv_Chk01_DtlR,SlsAct_Upd01_DtlR> createMapDel_Iv_Chk01_DtlR_SlsAct_Upd01_DtlR() {
			return new MapDel_Iv_Chk01_DtlR_SlsAct_Upd01_DtlR<Iv_Chk01_DtlR, SlsAct_Upd01_DtlR>();
		}

		public class MapDel_Iv_Chk01_DtlR_SlsAct_Upd01_DtlR<D extends Iv_Chk01_DtlR, S extends SlsAct_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Iv_Chk01_DtlR.$iv_d_no, SlsAct_Upd01_DtlR.$iv_d_no);
				addColumnPathMap(Iv_Chk01_DtlR.$slo_no, SlsAct_Upd01_DtlR.$slo_no);
				addColumnPathMap(Iv_Chk01_DtlR.$slo_d_no, SlsAct_Upd01_DtlR.$slo_d_no);
				addColumnPathMap(Iv_Chk01_DtlR.$itm_cd, SlsAct_Upd01_DtlR.$itm_cd);
				addColumnPathMap(Iv_Chk01_DtlR.$itm_sub1, SlsAct_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(Iv_Chk01_DtlR.$itm_sub2, SlsAct_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(Iv_Chk01_DtlR.$itm_sub3, SlsAct_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(Iv_Chk01_DtlR.$trd_unit_cd, SlsAct_Upd01_DtlR.$trd_unit_cd);
				addColumnPathMap(Iv_Chk01_DtlR.$trd_unit_qty, SlsAct_Upd01_DtlR.$trd_unit_qty);
				addColumnPathMap(Iv_Chk01_DtlR.$base_unit_qty, SlsAct_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(Iv_Chk01_DtlR.$base_unit_cd, SlsAct_Upd01_DtlR.$base_unit_cd);
				addColumnPathMap(Iv_Chk01_DtlR.$trd_cur_upri, SlsAct_Upd01_DtlR.$trd_cur_upri);
				addColumnPathMap(Iv_Chk01_DtlR.$trd_cur_amt, SlsAct_Upd01_DtlR.$trd_cur_amt);
				addColumnPathMap(Iv_Chk01_DtlR.$tax_cd, SlsAct_Upd01_DtlR.$tax_cd);
				addColumnPathMap(Iv_Chk01_DtlR.$trd_cur_tax_amt, SlsAct_Upd01_DtlR.$trd_cur_tax_amt);
				addColumnPathMap(Iv_Chk01_DtlR.$ship_schd_no, SlsAct_Upd01_DtlR.$ship_schd_no);
				addColumnPathMap(Iv_Chk01_DtlR.$dlv_slip_d_no, SlsAct_Upd01_DtlR.$dlv_slip_d_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.uplnd_flg(true);
			}
		}
		protected void setEdiFlg(MST_SLS_ACT_R hdrR, MCList<MST_SLS_ACT_D_R> dtlL) {
			for (MST_SLS_ACT_D_R dtlR : dtlL) {
				if (!isNull(dtlR.ext_purc_act_d_no())) {
					hdrR.edi_flg(true);
					break;
				}
			}
		}
		protected void setUniqueData(MCList<MST_SLS_ACT_D_R> dtlL,
				MCList<MST_SLS_ACT_IO_R> ioL) {
			MCIndexKey ikIo = ioL.createIndex(MST_SLS_ACT_IO_R.$sls_act_d_no,
					MST_SLS_ACT_IO_R.$sls_act_d_seq);
			for (MST_SLS_ACT_D_R dtlR : dtlL) {
				// 明細に紐づく詳細の場所、棚、ロットＮＯ、サブロットＮＯ、格付が一意だったら明細に引き継ぐ
				MCList<MST_SLS_ACT_IO_R> tmpIoL = ioL.subList(ikIo,
						dtlR.sls_act_d_no(), dtlR.sls_act_d_seq());

				if (tmpIoL.size() > 0) {
					if (isNullOrNullVal(dtlR.loc_cd())
							&& tmpIoL.groupBy(MST_SLS_ACT_IO_R.$loc_cd).size() == 1) {
						dtlR.loc_cd(tmpIoL.get(0).loc_cd());
					}
					if (!isNull(dtlR.loc_cd())) {
						// 場所が一意になった場合で、棚・ラインが一意だったらセット
						if (isNullOrNullVal(dtlR.str_ln_cd())
								&& tmpIoL.groupBy(MST_SLS_ACT_IO_R.$str_ln_cd).size() == 1) {
							dtlR.str_ln_cd(tmpIoL.get(0).str_ln_cd());
						}
					}
					if (isNullOrNullVal(dtlR.lot_no())
							&& tmpIoL.groupBy(MST_SLS_ACT_IO_R.$lot_no).size() == 1) {
						dtlR.lot_no(tmpIoL.get(0).lot_no());
					}
					if (tmpIoL.groupBy(MST_SLS_ACT_IO_R.$sublot_no).size() == 1) {
						if (isNullOrNullVal(dtlR.sublot_no())
								&& !isNull(dtlR.lot_no())) {
							dtlR.sublot_no(tmpIoL.get(0).sublot_no());
						}
					}
					if (isNullOrNullVal(dtlR.gd_cd())
							&& tmpIoL.groupBy(MST_SLS_ACT_IO_R.$gd_cd).size() == 1) {
						dtlR.gd_cd(tmpIoL.get(0).gd_cd());
					}
				}
			}
		}
		
		protected void makeShipRprt02(String dlv_slip_no) {
			ShipRprt_Upd02_HdrR up0 = ShipRprt_Upd02_HdrR.create();
			
			up0.dlv_slip_no(dlv_slip_no);
			SlsAct_Upd01_HdrR tmpHdrR = _hdrL.getFirst(_hdrLIdxKey, dlv_slip_no);
			if (isNull(tmpHdrR)) {
				// 伝票分割発生時はこちらで取得
				tmpHdrR = _hdrL.getFirst(SlsAct_Upd01_HdrR.$dlv_slip_no, dlv_slip_no);
			}
			SlsAct_Upd01_DtlR tmpDtlR = _dtlL.getFirst(_dtlLIdxKey, tmpHdrR.sls_act_no());
			if (isNull(tmpDtlR)) {
				 tmpDtlR = _dtlL.getFirst(SlsAct_Upd01_DtlR.$sls_act_no, tmpHdrR.sls_act_no());
			}
			if (!tmpHdrR.ddlv_sls_flg() && (MAC_SLS_BASIS_TYP.isIN_BASIS(tmpHdrR.sls_basis_typ()) 
					|| MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(tmpHdrR.sls_basis_typ()))) {
				up0.sls_prnt_flg(true);		// 仕入直送を除く検収基準売上の場合、価格印字ＦＬＧに関係なく売上伝票発行済ＦＬＧはオン
			}
			else if (!isNull(tmpDtlR) && !tmpDtlR.pri_prnt_flg()) {
				up0.sls_prnt_flg(false);	// 価格印字ＦＬＧがオフの場合、売上伝票発行済ＦＬＧはオフ
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(tmpHdrR.data_crud_typ())) {
				// 取消の場合、ヘッダに保持した価格印字ＦＬＧに応じて売上伝票発行済ＦＬＧを設定
				if (tmpHdrR.getBooleanNE("pri_prnt_flg")) {
					up0.sls_prnt_flg(true);
				}
				else {
					up0.sls_prnt_flg(false);
				}
			}
			else {
				up0.sls_prnt_flg(true);
			}
			up0.sls_prnt_upd_flg(true);
			
			_shipRprtHdrL02.add(up0);
		}
		
		// 出荷帳票発行SV用電文作成：取消（ShipRprt_Upd01）
		protected void makeShipRprt01Del(MST_SLS_ACT_R hdrR, SlsAct_Upd01_HdrR orgHdrR) {
			ShipRprt_Upd01_HdrR up0 = ShipRprt_Upd01_HdrR.create();
			
			MST_DLV_SLIP_R dlvSlipR = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder dlvSlipR_bldr = MCQueryApiBuilder.create(dlvSlipR);
			dlvSlipR_bldr.setSelect(dlvSlipR.trn_typ, dlvSlipR.dlv_slip_act_no);
			dlvSlipR_bldr.setWhere(dlvSlipR.dlv_slip_no.eq(bind("1")), hdrR.dlv_slip_no());
			dlvSlipR_bldr.addWhereWithAnd(dlvSlipR.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbSelect("MSBBL6010_MST_DLV_SLIP_S01", dlvSlipR, dlvSlipR_bldr);
			
			up0.trn_typ(dlvSlipR.trn_typ());					// トランザクション区分
			up0.dlv_slip_act_no(dlvSlipR.dlv_slip_act_no());	// 納品伝票実績ＮＯ
			up0.data_crud_typ(orgHdrR.data_crud_typ());			// データ更新区分（取消）
			up0.can_ac_dt(orgHdrR.can_ac_dt());					// 取消計上日
			up0.dlv_slip_no(hdrR.dlv_slip_no());				// 納品書ＮＯ（納品書ＮＯごとに取消する場合に設定する）
			up0.dlv_slip_prnt_flg(orgHdrR.dlv_slip_prnt_flg());	// 発行ＦＬＧ
			
			_shipRprtHdrL01.add(up0);
		}
		
		// 出荷帳票発行SV用電文作成：新規/更新（ShipRprt_Upd01）
		protected void makeShipRprt01Crt(MST_SLS_ACT_R hdrR, 
				MCList<MST_SLS_ACT_D_R> dtlL,
				MCList<MST_SLS_ACT_IO_R> ioL,
				int hdrCnt,
				SlsAct_Upd01_HdrR orgHdrR) {
			ShipRprt_Upd01_HdrR up0 = ShipRprt_Upd01_HdrR.create();
			
			MST_SLS_ACT_D_R dtlR = dtlL.get(0);
			MST_SLS_ACT_IO_R ioR = ioL.get(0);
			
			MST_DLV_SLIP_R dlvSlipR = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder dlvSlipR_bldr = MCQueryApiBuilder.create(dlvSlipR);
			// 売上明細訂正により伝票分割された場合、元納品書伝票の同時計上を保持する
			if (MAC_DATA_CRUD_TYP.isCRT(orgHdrR.data_crud_typ()) 
					&& (!isNull(orgHdrR.getStringNE("ref_dlv_slip_no")))) {
				dlvSlipR_bldr.setWhere(dlvSlipR.dlv_slip_no.eq(bind("1")), orgHdrR.getStringNE("ref_dlv_slip_no"));
			}
			else {
				dlvSlipR_bldr.setWhere(dlvSlipR.dlv_slip_no.eq(bind("1")), hdrR.dlv_slip_no());
	 		}
			dlvSlipR_bldr.addWhereWithAnd(dlvSlipR.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			int cnt = dbSelect("MSBBL6010_MST_DLV_SLIP_S02", dlvSlipR, dlvSlipR_bldr);
			
			up0.trn_typ(MSC_TRN_TYP.SLS.value());				// トランザクション区分（売上）
			if (!isNull(orgHdrR.bef_dlv_slip_no())) {
				MST_DLV_SLIP_R befDlvSlipR = MST_DLV_SLIP_R.create("T");
				MCQueryApiBuilder befDlvSlipR_bldr = MCQueryApiBuilder.create(befDlvSlipR);
				befDlvSlipR_bldr.setSelect(befDlvSlipR.trn_typ, befDlvSlipR.dlv_slip_act_no, befDlvSlipR.sync_flg);
				befDlvSlipR_bldr.setWhere(befDlvSlipR.dlv_slip_no.eq(bind("1")), orgHdrR.bef_dlv_slip_no());
				befDlvSlipR_bldr.addWhereWithAnd(befDlvSlipR.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
				int befCnt = dbSelect("MSBBL6010_MST_DLV_SLIP_S04", befDlvSlipR, befDlvSlipR_bldr);
				
				if (befCnt > 0) {
					up0.dlv_slip_act_no(befDlvSlipR.dlv_slip_act_no());	// 納品伝票実績ＮＯ
					up0.dlv_slip_no(hdrR.dlv_slip_no());
				}
				else {
					up0.dlv_slip_act_no(hdrR.sls_act_no());				// 納品伝票実績ＮＯ（売上実績ＮＯ）
				}
			}
			else {
				up0.dlv_slip_act_no(hdrR.sls_act_no());				// 納品伝票実績ＮＯ（売上実績ＮＯ）
			}
			
			// ヘッダ情報の作成
			up0.hdr_peg_no(hdrCnt);									// ヘッダ紐付ＮＯ
			if (isShipDlvSlipCopy(orgHdrR) || isDDlvDlvSlipCopy(orgHdrR)) {
				up0.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());	// データ更新区分（更新）
			}
			else if (cnt > 0) {
				up0.data_crud_typ(orgHdrR.data_crud_typ());			// データ更新区分（新規/更新）
			}
			else {
				up0.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());	// データ更新区分（新規）
			}
			up0.ac_dt(hdrR.ac_dt());								// 計上日
			up0.dlv_slip_no(hdrR.dlv_slip_no());					// 納品書ＮＯ
			
			if (MAC_DATA_CRUD_TYP.isUPD(orgHdrR.data_crud_typ())) {
				up0.can_ac_dt(orgHdrR.can_ac_dt());				// 取消計上日
				up0.sync_flg(dlvSlipR.sync_flg());				// 同時計上フラグ
			}
			if (MAC_DATA_CRUD_TYP.isCRT(orgHdrR.data_crud_typ()) 
					&& (!isNull(orgHdrR.getStringNE("ref_dlv_slip_no")))) {
				up0.sync_flg(dlvSlipR.sync_flg());
			}
			up0.slo_no(hdrR.slo_no());							// 受注ＮＯ
			up0.dpt_cd(hdrR.sls_dpt_cd());						// 部門ＣＤ（売上部門ＣＤ）
			up0.usr_cd(hdrR.sls_usr_cd());						// 担当者ＣＤ（売上担当者ＣＤ）
			up0.ship_tm(hdrR.ship_tm());						// 出荷日時
			up0.dlv_tm(hdrR.dlv_tm());							// 納品日時
			up0.trd_cd(hdrR.trd_cd());							// 取引ＣＤ
			up0.trd_ptn_typ(hdrR.trd_ptn_typ());				// 取引パタン区分
			up0.cst_po_no(hdrR.cst_po_no());					// 得意先注文ＮＯ
			if (!hdrR.ddlv_sls_flg() && (MAC_SLS_BASIS_TYP.isIN_BASIS(orgHdrR.sls_basis_typ())
					|| MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(orgHdrR.sls_basis_typ()))) {
				up0.pri_prnt_flg(true);							// 価格印字ＦＬＧ（検収基準売上）
			}
			else {
				up0.pri_prnt_flg(dtlR.pri_prnt_flg());			// 価格印字ＦＬＧ
			}
			up0.trd_cur_cd(hdrR.trd_cur_cd());					// 取引通貨ＣＤ
			up0.xrate(hdrR.xrate());							// 為替レート
			up0.ptax_xrate(hdrR.ptax_xrate());					// 納税為替レート
			up0.bp_cd(hdrR.cst_cd());							// 取引先ＣＤ（得意先ＣＤ）
			up0.dlv_id_typ(MSC_DLV_ID_TYP.DLV.value());			// 納品先識別区分（納品先）
			up0.dlv_id_cd(dtlR.dlv_cd());						// 納品先識別ＣＤ（納品先、全明細の納品先は揃っている）
			up0.dlv_id_nm(dtlR.dlv_nm());						// 納品先識別名
			up0.dlv_zip_cd(dtlR.dlv_zip_cd());					// 納品先郵便番号
			up0.dlv_addr1(dtlR.dlv_addr1());					// 納品先住所１
			up0.dlv_addr2(dtlR.dlv_addr2());					// 納品先住所２
			up0.dlv_addr3(dtlR.dlv_addr3());					// 納品先住所３
			up0.dlv_addr4(dtlR.dlv_addr4());					// 納品先住所４
			up0.dlv_cntct_dpt(dtlR.dlv_cntct_dpt());			// 納品先部署
			up0.dlv_cntct_psn(dtlR.dlv_cntct_psn());			// 納品先担当者
			up0.dlv_tel(dtlR.dlv_tel());						// 納品先ＴＥＬ
			up0.dlv_fax(dtlR.dlv_fax());						// 納品先ＦＡＸ
			up0.dlv_sundry_flg(dtlR.dlv_sundry_flg());			// 納品先諸口ＦＬＧ
			
			// 場所ＣＤに対する物流グループＣＤを設定
			String loc_cd = ioR.loc_cd();
			MAM_LOC_R locR = getLoc(loc_cd);
			if (!isNull(locR)) {
				up0.ship_fr_lg_grp_cd(locR.lg_grp_cd());			// 出荷元物流グループＣＤ
			}
			
			up0.wg_cd(hdrR.wg_cd());							// ワーキンググループＣＤ
			up0.trd_rmrks(hdrR.trd_rmrks());					// 取引備考
			up0.split_flg(false);								// 伝票分割ＦＬＧ（オフ）
			up0.adjst_slip_flg(false);							// 調整伝票ＦＬＧ（オフ）
			up0.dlv_slip_prnt_flg(orgHdrR.dlv_slip_prnt_flg());	// 発行ＦＬＧ
			up0.ship_dlv_slip_no(hdrR.ship_dlv_slip_no());		// 出荷時納品書ＮＯ
			up0.ds().sls_act_no(hdrR.sls_act_no());
			
			_shipRprtHdrL01.add(up0);
			
			MCIndexKey idxShipKey = null;

			MCList<MST_SHIP_SCHD_R> tmpShipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SHIP_SCHD_R tmpShipSchdL_t = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder tmpShipSchdL_bldr = MCQueryApiBuilder.create(tmpShipSchdL_t);
			if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(hdrR.sls_basis_typ())) {
				tmpShipSchdL_bldr.setSelect(tmpShipSchdL_t.ship_schd_no, tmpShipSchdL_t.dlv_inst_rcpt_no);
				tmpShipSchdL_bldr.setWhere(tmpShipSchdL_t.ship_schd_no.eq(bind("ship_schd_no")));
				dbSelect("MSBBL6010_MST_SHIP_SCHD_S03", tmpShipSchdL, tmpShipSchdL_bldr, dtlL);
				idxShipKey = tmpShipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
			}
			
			MCIndexKey ikIo = ioL.createIndex(MST_SLS_ACT_IO_R.$sls_act_d_no, MST_SLS_ACT_IO_R.$sls_act_d_seq);
			
			// 明細情報の作成
			for (MST_SLS_ACT_D_R tmpDR : dtlL) {
				ShipRprt_Upd01_DtlR up1R = ShipRprt_Upd01_DtlR.create();
				up1R.hdr_peg_no(up0.hdr_peg_no());				// ヘッダ紐付ＮＯ
				up1R.dtl_uniq_no(tmpDR.sls_act_d_no());			// 明細特定ＮＯ（売上実績明細ＮＯ）
				up1R.dlv_slip_d_no(tmpDR.dlv_slip_d_no());		// 納品書明細ＮＯ
				up1R.dlv_slip_no(hdrR.dlv_slip_no());			// 納品書ＮＯ
				up1R.itm_cd(tmpDR.itm_cd());					// 品目ＣＤ
				up1R.itm_sub1(tmpDR.itm_sub1());				// 枝番１
				up1R.itm_sub2(tmpDR.itm_sub2());				// 枝番２
				up1R.itm_sub3(tmpDR.itm_sub3());				// 枝番３
				up1R.itm_nm(tmpDR.itm_nm());					// 品名
				up1R.sundry_itm_flg(tmpDR.sundry_itm_flg());	// 諸口品ＦＬＧ
				up1R.sno1(tmpDR.sno1());						// 手配ＮＯ１
				up1R.sno2(tmpDR.sno2());						// 手配ＮＯ２
				up1R.sno3(tmpDR.sno3());						// 手配ＮＯ３
				up1R.sno4(tmpDR.sno4());						// 手配ＮＯ４
				
				MCList<MST_SLS_ACT_IO_R> tmpIoL = ioL.subList(ikIo,
						tmpDR.sls_act_d_no(), tmpDR.sls_act_d_seq());
				
				up1R.lot_no(tmpDR.lot_no());					// ロットＮＯ
				if (isNull(up1R.lot_no())) {
					up1R.lot_no((String)getIoUniqVal(tmpIoL, MST_SLS_ACT_IO_R.$lot_no));
				}
				
				up1R.sublot_no(tmpDR.sublot_no());				// サブロットＮＯ
				if (!isNull(up1R.lot_no()) && isNull(up1R.sublot_no())) {
					up1R.sublot_no((String)getIoUniqVal(tmpIoL, MST_SLS_ACT_IO_R.$sublot_no));
				}

				up1R.gd_cd(tmpDR.gd_cd());						// 格付ＣＤ
				if (isNull(up1R.gd_cd())) {
					up1R.gd_cd((String)getIoUniqVal(tmpIoL, MST_SLS_ACT_IO_R.$gd_cd));
				}
				
				up1R.trd_unit_qty(tmpDR.trd_unit_qty());		// 取引単位数量
				up1R.trd_unit_cd(tmpDR.trd_unit_cd());			// 取引単位ＣＤ
				up1R.base_unit_qty(tmpDR.base_unit_qty());		// 基準単位数量
				up1R.base_unit_cd(tmpDR.base_unit_cd());		// 基準単位ＣＤ
				up1R.trd_cur_upri(tmpDR.trd_cur_upri());		// 取引通貨単価
				up1R.trd_cur_amt(tmpDR.trd_cur_amt());			// 取引通貨金額
				up1R.trd_cur_dscnt_amt(tmpDR.trd_cur_dscnt_amt());	// 取引通貨値引額
				up1R.base_cur_upri(tmpDR.base_cur_upri());		// 基準通貨単価
				up1R.base_cur_amt(tmpDR.base_cur_amt());		// 基準通貨金額
				up1R.tax_cd(tmpDR.tax_cd());					// 税ＣＤ
				up1R.trd_cur_tax_amt(tmpDR.trd_cur_tax_amt());	// 取引通貨税額
				up1R.base_cur_tax_amt(tmpDR.base_cur_tax_amt());	// 基準通貨税額
				up1R.wtax_rate(tmpDR.wtax_rate());				// 源泉税率
				up1R.wtax_amt(tmpDR.wtax_amt());				// 源泉税額
				up1R.rsn_cd(tmpDR.rsn_cd());					// 理由ＣＤ
				up1R.bd_dpt_cd(tmpDR.bd_dpt_cd());				// 負担部門ＣＤ
				up1R.cst_po_d_no(tmpDR.cst_po_d_no());			// 得意先注文明細ＮＯ
				up1R.cst_itm_cd(tmpDR.cst_itm_cd());			// 得意先品目ＣＤ
				up1R.cst_itm_nm(tmpDR.cst_itm_nm());			// 得意先品名
				up1R.slo_d_no(tmpDR.slo_d_no());				// 受注明細ＮＯ
				up1R.trd_d_rmrks(tmpDR.trd_d_rmrks());			// 取引明細備考
				up1R.interim_flg(tmpDR.interim_flg());			// 仮単価
				up1R.ship_dlv_slip_d_no(tmpDR.ship_dlv_slip_d_no());// 出荷時納品書明細ＮＯ
				up1R.ship_dlv_slip_multi_flg(tmpDR.ship_dlv_slip_multi_flg());// 出荷時納品書明細複数ＦＬＧ
				
				if (MAC_DATA_CRUD_TYP.isUPD(orgHdrR.data_crud_typ()) &&
					(isSlsDscntXtra(hdrR.trd_ptn_typ())) && !hdrR.aprv_flg()) {
					up1R.dlv_slip_seq(hdrR.sls_act_seq());		// 納品書連番
					up1R.dlv_slip_rev(hdrR.sls_act_rev());		// 納品書改訂番号
				}
				if (!isNull(tmpShipSchdL) && !isNull(tmpDR.ship_schd_no())) {
					MST_SHIP_SCHD_R tmpShipSchdR = tmpShipSchdL.getFirst(idxShipKey,
							tmpDR.ship_schd_no());
					if (!isNull(tmpShipSchdR)) {
						up1R.dlv_inst_rcpt_no(tmpShipSchdR.dlv_inst_rcpt_no());
					}
				}
				_shipRprtDtlL01.add(up1R);
			}
		}
		
		/**
		 * 売上実績受払で、指定したカラム名の項目の値が一意であればその値を返す。一意でなければNULLを返す。
		 * 
		 * @param tmpIoL 売上実績受払
		 * @param colName カラム名
		 * @return
		 */
		protected Comparable<?> getIoUniqVal(MCList<MST_SLS_ACT_IO_R> tmpIoL, String colName) {
			
			MCList<MST_SLS_ACT_IO_R> grpL = tmpIoL.groupBy(colName);
			if (grpL.size() == 1) {
				return tmpIoL.get(0).getValue(colName);
			}
			else {
				return null;
			}
		}
		
		/**
		 * 受注状況更新SV用電文作成
		 * 
		 * @param hdrR
		 * @param dtlL
		 */
		protected void makeSloStsL(MST_SLS_ACT_R hdrR, MCList<MST_SLS_ACT_D_R> dtlL){
			for (MST_SLS_ACT_D_R dtlR : dtlL) {
				if (!isNull(dtlR.sls_schd_no()) && !isNull(dtlR.slo_d_no())) {
					SloSts_DtlR sloStsR = SloSts_DtlR.create();
					sloStsR.slo_d_no(dtlR.slo_d_no());	// 受注明細ＮＯ
					if (!isNull(hdrR.adjst_tgt_dt())) {
						sloStsR.slo_sts_typ(MSC_SLO_STS_TYP.SLS_ADJST.value());	// 受注状況区分（売上調整）
					}
					else {
						sloStsR.slo_sts_typ(MSC_SLO_STS_TYP.SLS.value());		// 受注状況区分（売上）
					}
					sloStsR.unit_cd(dtlR.trd_unit_cd());			// 単位ＣＤ
					sloStsR.qty(dtlR.trd_unit_qty());				// 数量
					sloStsR.cur_cd(hdrR.trd_cur_cd());				// 通貨ＣＤ
					sloStsR.upri(dtlR.trd_cur_upri());				// 単価
					sloStsR.amt(dtlR.trd_cur_amt());				// 金額
					sloStsR.tax_cd(dtlR.tax_cd());					// 税ＣＤ
					sloStsR.tax_amt(dtlR.trd_cur_tax_amt());		// 税額
					sloStsR.iv_no(hdrR.iv_no());					// インボイスＮＯ
					sloStsR.iv_d_no(dtlR.iv_d_no());				// インボイス明細ＮＯ
					sloStsR.rcpt_iv_no(hdrR.rcpt_iv_no());			// 受領インボイスＮＯ
					sloStsR.dlv_slip_no(hdrR.dlv_slip_no());		// 納品書ＮＯ
					sloStsR.dlv_slip_d_no(dtlR.dlv_slip_d_no());	// 納品書明細ＮＯ
					sloStsR.ac_dt(hdrR.ac_dt());					// 計上日
					sloStsR.biz_tm(hdrR.sls_dt());					// 業務実施日時（売上日）
					sloStsR.sls_act_no(hdrR.sls_act_no());			// 売上実績ＮＯ
					sloStsR.sls_act_d_no(dtlR.sls_act_d_no());		// 売上実績明細ＮＯ
					
					_sloStsL.add(sloStsR);
				}
			}
		}
		
		/**
		 * 出荷実績SV呼出用明細情報作成
		 * 
		 * @param hdrR
		 * @param dtlL
		 * @param ioL
		 * @param befSlsActDL
		 * @return
		 */
		protected MCList<ShipAct_DtlR> makeShipActDtl(SlsAct_Upd01_HdrR hdrR, MCList<SlsAct_Upd01_DtlR> dtlL, MCList<SlsAct_Upd01_IoR> ioL, MCList<SlsAct_Upd01_DtlR> befDtlL) {
			
			// 出荷実績SV明細情報作成
			MCList<ShipAct_DtlR> shipActDtlL = MCList.create(ShipAct_DtlR.class);
			
			// ヘッダの取消だった場合は設定しない
			if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
				return shipActDtlL;
			}
			String[] ioKeys = new String[] {
					SlsAct_Upd01_IoR.$new_hdr_peg_no, SlsAct_Upd01_IoR.$dtl_peg_no
			};
			String[] ioDelKeys = new String[] {
					SlsAct_Upd01_IoR.$hdr_peg_no, SlsAct_Upd01_IoR.$dtl_peg_no, SlsAct_Upd01_IoR.$data_crud_typ
			};
			
			// 更新時、行削除の明細行も取得
			if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
				String[] dtlDelKeys = new String[] {
						SlsAct_Upd01_DtlR.$hdr_peg_no, SlsAct_Upd01_DtlR.$data_crud_typ
				};
				Comparable<?>[] dtlDelVals = new Comparable[] {
						hdrR.hdr_peg_no(), MAC_DATA_CRUD_TYP.DEL.value()
				};
				dtlL.addAll(up1().subList(dtlDelKeys, dtlDelVals));
			}
			int dispSeq = 0;
			for (SlsAct_Upd01_DtlR dtlR : dtlL) {
				
				// 明細に紐づく詳細を取得
				MCList<SlsAct_Upd01_IoR> ioTgtL = MCList.create(SlsAct_Upd01_IoR.class);
	
				if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					Comparable<?>[] ioVals = new Comparable[] {
							dtlR.new_hdr_peg_no(), dtlR.dtl_peg_no()
					};
					ioTgtL.addAll(_ioL.subList(ioKeys, ioVals));
				}
				
				// （旧）ヘッダ紐付けＮＯ、明細紐付けＮＯに紐づく削除の詳細を取得
				if (!MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
					Comparable<?>[] ioDelVals = new Comparable[] {
							dtlR.hdr_peg_no(), dtlR.dtl_peg_no(), MAC_DATA_CRUD_TYP.DEL.value()
					};
					ioTgtL.addAll(up2().subList(ioDelKeys, ioDelVals));
				}
				ioTgtL.sort(SlsAct_Upd01_IoR.$io_peg_no);
				
				// 詳細単位で出荷実績SVの明細情報を作成
				for (int i = 0; i < ioTgtL.size(); i++) {
					SlsAct_Upd01_IoR ioTgtR = ioTgtL.get(i);
					ShipAct_DtlR shipActDtlR = ShipAct_DtlR.create();
					shipActDtlR.hdr_peg_no(hdrR.new_hdr_peg_no());
					
					// 品目の在庫管理区分が変更されている場合、削除→新規で明細情報を作成
					boolean chngStkMngFlg = isChngStkMng(dtlR, befDtlL);
					if (chngStkMngFlg && !isNull(ioTgtR.ship_act_d_no())) {
						ShipAct_DtlR shipActDtlDelR = ShipAct_DtlR.create();
						shipActDtlDelR.hdr_peg_no(hdrR.new_hdr_peg_no());                       // ヘッダ紐付けＮＯ
						shipActDtlDelR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());            // データ更新区分
						shipActDtlDelR.ship_act_d_no(ioTgtR.ship_act_d_no());                   // 出荷実績明細ＮＯ
						if (isNull(ioTgtR.ship_alloc_sts_no()) && !isNull(ioTgtR.ship_act_d_no())) {
							shipActDtlDelR.ship_alloc_sts_no(getShipAllocStsNo(ioTgtR.ship_act_d_no()));   // 出荷引当状況ＮＯ
						}
						else {
							shipActDtlDelR.ship_alloc_sts_no(ioTgtR.ship_alloc_sts_no());   // 出荷引当状況ＮＯ
						}
						shipActDtlL.add(shipActDtlDelR);
					}
					
					// 出荷予定に紐づかない非在庫品、かつ、出荷実績登録で売上同時計上されていない場合は対象外
					if (isNull(dtlR.ship_schd_no()) && MAC_STK_MNG_TYP.isNOT_MNG(dtlR.stk_mng_typ()) && !hdrR.ship_act_sync_flg()) {
						continue;
					}
					
					// データ更新区分
					// 新規
					if (ioTgtR.isStatusCreate() || chngStkMngFlg) {
						shipActDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					}
					// 削除
					else if (ioTgtR.isStatusDelete()) {
						shipActDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					// 更新（ステータスに変更ない場合も更新）
					else {
						shipActDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					}
					
					// 削除の場合
					if (MAC_DATA_CRUD_TYP.isDEL(shipActDtlR.data_crud_typ())) {
						shipActDtlR.peg_no(ioTgtR.io_peg_no());								// 紐付けＮＯ
						shipActDtlR.ship_act_d_no(ioTgtR.ship_act_d_no());					// 出荷実績明細ＮＯ
						if (isNull(ioTgtR.ship_alloc_sts_no()) && !isNull(ioTgtR.ship_act_d_no())) {
							shipActDtlR.ship_alloc_sts_no(getShipAllocStsNo(ioTgtR.ship_act_d_no()));	// 出荷引当状況ＮＯ
						}
						else {
							shipActDtlR.ship_alloc_sts_no(ioTgtR.ship_alloc_sts_no());	// 出荷引当状況ＮＯ
						}
						shipActDtlL.add(shipActDtlR);
						continue;
					}
					
					// 数量ゼロは対象外
					if (!isNull(ioTgtR.trd_unit_qty()) && ioTgtR.trd_unit_qty().isZero()) {
						continue;
					}
					
					shipActDtlR.peg_no(ioTgtR.io_peg_no());									// 紐付けＮＯ
					
					// 更新の場合
					if (MAC_DATA_CRUD_TYP.isUPD(shipActDtlR.data_crud_typ())) {
						shipActDtlR.ship_act_d_no(ioTgtR.ship_act_d_no());					// 出荷実績明細ＮＯ
						ioTgtR.ship_alloc_sts_no(getShipAllocStsNo(ioTgtR.ship_act_d_no()));	// 出荷引当状況ＮＯ
					}
					else {
						// 出荷予定ＮＯで出荷引当状況を特定し出荷引当状況ＮＯをセット
						if (!isNull(dtlR.ship_schd_no()) && isNull(ioTgtR.ship_alloc_sts_no())) {
							MCList<MST_SHIP_ALLOC_STS_R> shipAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
							MST_SHIP_ALLOC_STS_R shipAllocStsL_t = MST_SHIP_ALLOC_STS_R.create("T");
							MCQueryApiBuilder shipAllocStsL_bldr = MCQueryApiBuilder.create(shipAllocStsL_t);
							shipAllocStsL_bldr.setSelect(shipAllocStsL_t.ship_alloc_sts_no);
							shipAllocStsL_bldr.setWhere(shipAllocStsL_t.ship_schd_no.eq(bind("1")), dtlR.ship_schd_no());
							// 未出荷のデータを取得（訂正時に伝票分割して取消・新規となる場合は、
							// 出荷実績が取り消される前に検索するため、出荷済も含めて検索してソートして判断する）
							shipAllocStsL_bldr
							.addSelect(bracket(shipAllocStsL_t.base_unit_qty
									.subtract(shipAllocStsL_t.ship_act_qty))
											.as("subtract_qty"));
							shipAllocStsL_bldr.setOrderByDesc(pr("subtract_qty"));
							dbSelect("MSBBL6010_MST_SHIP_ALLOC_STS_S02", shipAllocStsL, shipAllocStsL_bldr);
							
							if (!isNull(shipAllocStsL)) {
								ioTgtR.ship_alloc_sts_no(shipAllocStsL.get(0).ship_alloc_sts_no());
							}
						}
					}
					
					shipActDtlR.disp_seq(++dispSeq);											// 表示順
					
					shipActDtlR.dlv_slip_no(hdrR.dlv_slip_no());							// 納品書ＮＯ
					// 出荷帳票発行サービス実行後に再設定する
					shipActDtlR.dlv_slip_seq(nvl(hdrR.dlv_slip_seq(), MCNumber.ZERO));		// 納品書連番
					shipActDtlR.dlv_slip_d_no(dtlR.dlv_slip_d_no());						// 納品書明細ＮＯ
					
					if (!isNull(ioTgtR.ship_alloc_sts_no())) {
						MST_SHIP_ALLOC_STS_R shipAllocStsR = getShipAllocSts(ioTgtR);
						shipActDtlR.ship_alloc_sts_no(shipAllocStsR.ship_alloc_sts_no());	// 出荷引当状況ＮＯ
						shipActDtlR.ver_no(getVerNo(dtlR, ioTgtR));							// 版ＮＯ
						shipActDtlR.stk_arrv_bp_cd(shipAllocStsR.stk_arrv_bp_cd());			// 在庫着荷先ＣＤ
						shipActDtlR.quality_typ(shipAllocStsR.quality_typ());				// 良品区分
						shipActDtlR.stk_id_typ(shipAllocStsR.stk_id_typ());					// 在庫識別区分
						shipActDtlR.stk_bp_cd(shipAllocStsR.stk_bp_cd());					// 在庫取引先ＣＤ
						shipActDtlR.ship_pr_no(getShipPrNo(dtlR));							// 出荷進捗ＮＯ
						shipActDtlR.ship_schd_no(dtlR.ship_schd_no());						// 出荷予定ＮＯ
					}
					else {
						shipActDtlR.ver_no(getVerNo(dtlR, ioTgtR));							// 版ＮＯ
						shipActDtlR.quality_typ(MAC_QUALITY_TYP.GOOD.value());				// 良品区分（良品）
						shipActDtlR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());				// 在庫識別区分（自社在庫）
						shipActDtlR.stk_bp_cd(MAC_STR.NULL_VAL.value());					// 在庫取引先ＣＤ
					}
					
					shipActDtlR.trd_cd(hdrR.trd_cd());										// 取引ＣＤ
					shipActDtlR.trd_ptn_typ(hdrR.trd_ptn_typ());							// 取引パタン区分
					shipActDtlR.ship_loc_cd(ioTgtR.loc_cd());								// 出荷場所ＣＤ
					shipActDtlR.ship_str_ln_cd(ioTgtR.str_ln_cd());							// 出荷棚・ラインＣＤ
					shipActDtlR.dlv_id_typ(MSC_DLV_ID_TYP.DLV.value());						// 納品先識別区分（納品先）
					shipActDtlR.dlv_id_cd(dtlR.dlv_cd());									// 納品先識別ＣＤ（納品先ＣＤ）
					shipActDtlR.dlv_id_nm(dtlR.dlv_nm());									// 納品先識別名（納品先名）
					shipActDtlR.dlv_zip_cd(dtlR.dlv_zip_cd());								// 納品先郵便番号
					shipActDtlR.dlv_addr1(dtlR.dlv_addr1());								// 納品先住所１
					shipActDtlR.dlv_addr2(dtlR.dlv_addr2());								// 納品先住所２
					shipActDtlR.dlv_addr3(dtlR.dlv_addr3());								// 納品先住所３
					shipActDtlR.dlv_addr4(dtlR.dlv_addr4());								// 納品先住所４
					shipActDtlR.dlv_cntct_dpt(dtlR.dlv_cntct_dpt());						// 納品先部署
					shipActDtlR.dlv_cntct_psn(dtlR.dlv_cntct_psn());						// 納品先担当者
					shipActDtlR.dlv_tel(dtlR.dlv_tel());									// 納品先ＴＥＬ
					shipActDtlR.dlv_fax(dtlR.dlv_fax());									// 納品先ＦＡＸ
					shipActDtlR.dlv_sundry_flg(dtlR.dlv_sundry_flg());						// 納品先諸口ＦＬＧ
					shipActDtlR.pri_prnt_flg(dtlR.pri_prnt_flg());							// 価格印字ＦＬＧ
					shipActDtlR.itm_cd(dtlR.itm_cd());										// 品目ＣＤ
					shipActDtlR.itm_sub1(dtlR.itm_sub1());									// 枝番１
					shipActDtlR.itm_sub2(dtlR.itm_sub2());									// 枝番２
					shipActDtlR.itm_sub3(dtlR.itm_sub3());									// 枝番３
					shipActDtlR.itm_nm(dtlR.itm_nm());										// 品名
					shipActDtlR.iv_itm_nm(dtlR.iv_itm_nm());								// インボイス表記品名
					shipActDtlR.sundry_itm_flg(dtlR.sundry_itm_flg());						// 諸口品ＦＬＧ
					shipActDtlR.stk_mng_typ(dtlR.stk_mng_typ());							// 在庫管理区分
					shipActDtlR.sno1(ioTgtR.sno1());										// 手配ＮＯ１
					shipActDtlR.sno2(ioTgtR.sno2());										// 手配ＮＯ２
					shipActDtlR.sno3(ioTgtR.sno3());										// 手配ＮＯ３
					shipActDtlR.sno4(ioTgtR.sno4());										// 手配ＮＯ４
					shipActDtlR.lot_no(ioTgtR.lot_no());									// ロットＮＯ
					shipActDtlR.sublot_no(ioTgtR.sublot_no());								// サブロットＮＯ
					shipActDtlR.sno1_mng_typ(dtlR.sno1_mng_typ());							// 手配ＮＯ１管理区分
					shipActDtlR.sno2_mng_typ(dtlR.sno2_mng_typ());							// 手配ＮＯ２管理区分
					shipActDtlR.sno3_mng_typ(dtlR.sno3_mng_typ());							// 手配ＮＯ３管理区分
					shipActDtlR.sno4_mng_typ(dtlR.sno4_mng_typ());							// 手配ＮＯ４管理区分
					shipActDtlR.gd_cd(ioTgtR.gd_cd());										// 格付ＣＤ
					shipActDtlR.trd_unit_qty(ioTgtR.trd_unit_qty());						// 取引単位数量
					shipActDtlR.trd_unit_cd(ioTgtR.trd_unit_cd());							// 取引単位ＣＤ
					shipActDtlR.base_unit_qty(ioTgtR.base_unit_qty());						// 基準単位数量
					shipActDtlR.base_unit_cd(ioTgtR.base_unit_cd());						// 基準単位ＣＤ
					shipActDtlR.cst_po_no(hdrR.cst_po_no());								// 得意先注文ＮＯ
					shipActDtlR.cst_po_d_no(dtlR.cst_po_d_no());							// 得意先注文明細ＮＯ
					shipActDtlR.cst_itm_cd(dtlR.cst_itm_cd());								// 得意先品目ＣＤ
					shipActDtlR.cst_itm_nm(dtlR.cst_itm_nm());								// 得意先品名
					shipActDtlR.trd_rmrks(hdrR.trd_rmrks());								// 取引備考
					shipActDtlR.trd_d_rmrks(dtlR.trd_d_rmrks());							// 取引明細備考
					shipActDtlR.intr_d_rmrks(dtlR.intr_rmrks());							// 内部明細備考
					shipActDtlR.sub_char1(dtlR.sub_char1());								// 予備１
					shipActDtlR.sub_char2(dtlR.sub_char2());								// 予備２
					shipActDtlR.sub_char3(dtlR.sub_char3());								// 予備３
					shipActDtlR.rsn_cd(dtlR.rsn_cd());										// 理由ＣＤ
					MST_SHIP_SCHD_R shipSchdR = _befShipSchdL.getFirst(_befShipSchdLIdx, dtlR.ship_schd_no());
					if (hdrR.ship_act_sync_flg() && !isNull(shipSchdR)) {
						shipActDtlR.abort_flg(shipSchdR.abort_flg());						// 打切ＦＬＧ
					}
					else {
						shipActDtlR.abort_flg(dtlR.sls_schd_abort_flg());					// 打切ＦＬＧ
					}
					shipActDtlR.skip_chk_ship_flg(true);									// 出荷時構成チェック不要ＦＬＧ
					shipActDtlR.ref_ship_act_d_no(ioTgtR.getStringNE("ref_ship_act_d_no"));
					shipActDtlR.purc_sync_flg(ioTgtR.sync_flg());
					
					shipActDtlL.add(shipActDtlR);
				}
			}
			
			return shipActDtlL;
		}
		
		/**
		 * 品目の在庫管理区分に変更があるかを判定
		 * @param dtlR
		 * @param befSlsActDL
		 * @return
		 */
		protected boolean isChngStkMng(SlsAct_Upd01_DtlR dtlR, MCList<SlsAct_Upd01_DtlR> befDtlL) {
			if (isNull(befDtlL)) {
				return false;
			}
			if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				return false;
			}
			
			// 変更前の売上実績明細データを取得
			SlsAct_Upd01_DtlR befDtlR = befDtlL.getFirst(SlsAct_Upd01_DtlR.$sls_act_d_no, dtlR.sls_act_d_no());
			
			// 変更前と変更後の在庫管理区分を比較する
			if (isNull(befDtlR)) {
				return false;
			}
			else if (dtlR.isStatusDelete() || isSame(dtlR.stk_mng_typ(), befDtlR.stk_mng_typ())) {
				return false;
			}
			else {
				return true;
			}
		}

		/**
		 * 出荷実績明細に紐づく出荷引当状況ＮＯを取得
		 * 
		 * @param ship_act_d_no
		 * @return
		 */
		protected String getShipAllocStsNo(String ship_act_d_no) {
			MST_SHIP_ACT_D_R shipActDR = MST_SHIP_ACT_D_R.create("T");
			MCQueryApiBuilder shipActDR_bldr = MCQueryApiBuilder.create(shipActDR);
			shipActDR_bldr.setSelect(shipActDR.ship_alloc_sts_no);
			shipActDR_bldr.setWhere(shipActDR.ship_act_d_no.eq(bind("1")), ship_act_d_no);
			dbSelect("MSBBL6010_MST_SHIP_ACT_D_S01", shipActDR, shipActDR_bldr);
			if (!isNull(shipActDR.ship_alloc_sts_no())) {
				return shipActDR.ship_alloc_sts_no();
			}
			return null;
		}
		
		
		/**
		 * 出荷進捗ＮＯ取得
		 * 
		 * @param dtlR
		 * @return
		 */
		protected String getShipPrNo(SlsAct_Upd01_DtlR dtlR) {
			MST_SHIP_SCHD_R shipSchdR = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder shipSchdR_bldr = MCQueryApiBuilder.create(shipSchdR);
			shipSchdR_bldr.setSelect(shipSchdR.ship_pr_no);
			shipSchdR_bldr.setWhere(shipSchdR.ship_schd_no.eq(bind("1")), dtlR.ship_schd_no());
			dbSelect("MSBBL6010_MST_SHIP_SCHD_S04", shipSchdR, shipSchdR_bldr);
			return shipSchdR.ship_pr_no();
		}
		
		/**
		 * ロット管理情報より版ＮＯ取得
		 * 
		 * @param dtlR
		 * @param ioR
		 * @return
		 */
		protected String getVerNo(SlsAct_Upd01_DtlR dtlR, SlsAct_Upd01_IoR ioR) {
			// ロット・サブロットより版ＮＯを取得
			MAM_ITM_R itmR = getItmCache(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
			if (!itmR.ver_flg()) {
				return null;
			}
			
			MSVT_LOT_LIST_R lotR = MSVT_LOT_LIST_R.create("T");
			MCQueryApiBuilder lotR_bldr = MCQueryApiBuilder.create(lotR);
			lotR_bldr.setSelect(lotR.ver_no);
			lotR_bldr.setWhere(lotR.itm_cd.eq(bind("1")), dtlR.itm_cd());
			lotR_bldr.addWhereWithAnd(lotR.itm_sub1.eq(bind("1")), dtlR.itm_sub1());
			lotR_bldr.addWhereWithAnd(lotR.itm_sub2.eq(bind("1")), dtlR.itm_sub2());
			lotR_bldr.addWhereWithAnd(lotR.itm_sub3.eq(bind("1")), dtlR.itm_sub3());
			lotR_bldr.addWhereWithAnd(lotR.lot_no.eq(bind("1")), ioR.lot_no());
			lotR_bldr.addWhereWithAnd(lotR.sublot_no.eq(bind("1")), ioR.sublot_no());
			dbSelect("MSBBL6010_MSVT_LOT_LIST_S01", lotR, lotR_bldr);
			return lotR.ver_no();
		}
		
		/**
		 * 出荷引当状況の取得
		 * 
		 * @param dtlR
		 * @return
		 */
		protected MST_SHIP_ALLOC_STS_R getShipAllocSts (SlsAct_Upd01_IoR ioR) {
			MST_SHIP_ALLOC_STS_R shipAllocStsR = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder shipAllocStsR_bldr = MCQueryApiBuilder.create(shipAllocStsR);
			shipAllocStsR_bldr.setSelect(shipAllocStsR.ship_alloc_sts_no);
			shipAllocStsR_bldr.addSelect(shipAllocStsR.ver_no);
			shipAllocStsR_bldr.addSelect(shipAllocStsR.stk_arrv_bp_cd);
			shipAllocStsR_bldr.addSelect(shipAllocStsR.quality_typ);
			shipAllocStsR_bldr.addSelect(shipAllocStsR.stk_id_typ);
			shipAllocStsR_bldr.addSelect(shipAllocStsR.stk_bp_cd);
			shipAllocStsR_bldr.setWhere(shipAllocStsR.ship_alloc_sts_no.eq(bind("1")), ioR.ship_alloc_sts_no());
			dbSelect("MSBBL6010_MST_SHIP_ALLOC_STS_S03", shipAllocStsR, shipAllocStsR_bldr);
			return shipAllocStsR;
		}
		
		/**
		 * 出荷実績SV呼出用ヘッダ情報作成
		 * 
		 * @param hdrR
		 * @param dtlL
		 * @param ioL
		 * @return
		 */
		protected ShipAct_HdrR makeShipActHdr(SlsAct_Upd01_HdrR hdrR, MCList<SlsAct_Upd01_DtlR> dtlL, MCList<SlsAct_Upd01_IoR> ioL) {
			
			// 出荷実績SVヘッダ情報作成
			ShipAct_HdrR shipActHdrR = ShipAct_HdrR.create();

			// 伝票分割があるため分割後のpeg_noを連携する。
			// 取消時にnew_hdr_peg_noがないので、その場合は元のpeg_noを設定する
			if (!isNull(hdrR.new_hdr_peg_no())) {
				shipActHdrR.peg_no(hdrR.new_hdr_peg_no());
			}
			else {
				shipActHdrR.peg_no(hdrR.hdr_peg_no());
			}
			shipActHdrR.data_crud_typ(hdrR.data_crud_typ());			// データ更新区分
			if (MSC_IV_SRC_TYP.isSLS(hdrR.iv_src_typ())) {
				shipActHdrR.uplnd_iv_sls_flg(true);
			}
			// 取消の場合
			if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
				shipActHdrR.ship_act_no(hdrR.ship_act_no());				// 出荷実績ＮＯ
				shipActHdrR.can_ac_dt(hdrR.can_ac_dt());					// 取消計上日
				shipActHdrR.dlv_slip_prnt_flg(hdrR.dlv_slip_prnt_flg());	// 納品書即時発行ＦＬＧ
				shipActHdrR.lot_chk_off_flg(hdrR.lot_chk_off_flg());		// ロットチェック無視ＦＬＧ
				shipActHdrR.dlv_slip_flg(false);							// 納品伝票作成ＦＬＧ
				shipActHdrR.io_act_flg(false);								// 受払実績作成ＦＬＧ
				return shipActHdrR;
			}
			
			// 更新の場合
			if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
				if (isNull(hdrR.ship_act_no())) {
					// 売上実績が訂正であっても、出荷実績が存在しない場合、訂正ではなく、新規で出荷実績サービスを実行する
					// 新規登録時に非在庫品のみの売上実績を登録した後に、在庫品を追加した場合、売上実績が更新、出荷実績が新規で作成する。
					shipActHdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
				shipActHdrR.ship_act_no(hdrR.ship_act_no());			// 出荷実績ＮＯ
				shipActHdrR.can_ac_dt(hdrR.can_ac_dt());				// 取消計上日
				}
			}
			
			shipActHdrR.ac_dt(hdrR.ac_dt());							// 計上日
			shipActHdrR.ship_tm(hdrR.ship_tm());						// 出荷日時
			shipActHdrR.dlv_tm(hdrR.dlv_tm());							// 納品日時
			
			// 出荷予定の紐付きがなければ設定
			SlsAct_Upd01_DtlR conShipSchdR = getConShipSchdRow(dtlL);
			if (isNull(conShipSchdR)) {
				shipActHdrR.rqst_dpt_cd(hdrR.sls_dpt_cd());				// 依頼元部門ＣＤ
				shipActHdrR.rqst_usr_cd(hdrR.sls_usr_cd());				// 依頼元担当者ＣＤ
				shipActHdrR.via_dlv_typ(MAC_VIA_DLV_TYP.NOT_VIA.value());	// 配送先経由区分
				shipActHdrR.uplnd_flg(true);							// 計画外ＦＬＧ
			}
			else {
				// 仕入直送売上の場合
				if (hdrR.ddlv_sls_flg()) {
					shipActHdrR.via_dlv_typ(MAC_VIA_DLV_TYP.NOT_VIA.value());	// 配送先経由区分（経由しない）
				}
				else {
					MCRow viaDldTypR = MCRow.create();
					viaDldTypR.addStringColumn("via_dlv_typ");
					viaDldTypR.addStringColumn("iv_no");
					viaDldTypR.addStringColumn("ship_schd_no");
					viaDldTypR.addBooleanColumn("iv_ship_flg");
					viaDldTypR.setValue("ship_schd_no", conShipSchdR.ship_schd_no());
					
					executeQuery(viaDldTypR, MSBBL6010_MST_SHIP_PR_S1(), viaDldTypR);
					
					shipActHdrR.via_dlv_typ(viaDldTypR.getStringNE("via_dlv_typ"));	// 配送先経由区分
					shipActHdrR.uplnd_flg(false);							// 計画外ＦＬＧ
					
					if (viaDldTypR.getBooleanNE("iv_ship_flg") && !isNull(viaDldTypR.getStringNE("iv_no"))) {
						// インボイス単位出荷の場合のみ、インボイスＮＯを渡す
						shipActHdrR.iv_no(viaDldTypR.getStringNE("iv_no"));		// インボイスＮＯ
					}
				}
			}
			
			// 明細の一行目の情報を取得（明細で納品先の混在はない）
			SlsAct_Upd01_DtlR dtlR = dtlL.get(0);
			
			// 場所ＣＤに対するＷＧと物流グループＣＤを設定
			// （詳細で物流Ｇの混在はないが、NULLのケースがある。）
			String loc_cd = null;
			for (SlsAct_Upd01_IoR ioR : ioL) {
				if (!isNull(ioR.loc_cd())) {
					loc_cd = ioR.loc_cd();
					break;
				}
			}

			MAM_LOC_R locR = getLoc(loc_cd);
			if (!isNull(locR)) {
				shipActHdrR.ship_fr_lg_grp_cd(locR.lg_grp_cd());			// 出荷元物流グループＣＤ
				MAM_LG_GRP_R lgGrpR = getLgGrp(locR.lg_grp_cd());
				if (!isNull(lgGrpR)) {
					shipActHdrR.wg_cd(lgGrpR.wg_cd());							// ワーキンググループＣＤ
				}
			}
			
			shipActHdrR.ship_dpt_cd(hdrR.sls_dpt_cd());					// 出荷部門ＣＤ
			shipActHdrR.ship_usr_cd(hdrR.sls_usr_cd());					// 出荷担当者ＣＤ
			
			// 納品先の物流グループＣＤを設定
			MAM_BP_R dlvR = getDlvCache(dtlR.dlv_cd());
			shipActHdrR.ship_to_lg_grp_cd(dlvR.lg_grp_cd());			// 出荷先物流グループＣＤ
			
			shipActHdrR.cst_cd(hdrR.cst_cd());							// 得意先ＣＤ
			shipActHdrR.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.DLV.value());	// 送付先識別区分（納品先）
			shipActHdrR.ship_to_id_cd(dtlR.dlv_cd());					// 送付先識別ＣＤ
			shipActHdrR.ship_to_id_nm(dtlR.dlv_nm());					// 送付先識別名
			shipActHdrR.ship_to_zip_cd(dtlR.dlv_zip_cd());			// 送付先識別名
			shipActHdrR.ship_to_addr1(dtlR.dlv_addr1());				// 送付先住所１
			shipActHdrR.ship_to_addr2(dtlR.dlv_addr2());				// 送付先住所２
			shipActHdrR.ship_to_addr3(dtlR.dlv_addr3());				// 送付先住所３
			shipActHdrR.ship_to_addr4(dtlR.dlv_addr4());				// 送付先住所４
			shipActHdrR.ship_to_cntct_dpt(dtlR.dlv_cntct_dpt());	// 送付先部署
			shipActHdrR.ship_to_cntct_psn(dtlR.dlv_cntct_psn());	// 送付先担当者
			shipActHdrR.ship_to_tel(dtlR.dlv_tel());							// 送付先ＴＥＬ
			shipActHdrR.ship_to_fax(dtlR.dlv_fax());						// 送付先ＦＡＸ
			shipActHdrR.ship_to_sundry_flg(dtlR.dlv_sundry_flg());		// 送付先諸口ＦＬＧ
			
			shipActHdrR.intr_rmrks(hdrR.intr_rmrks());					// 内部備考
			shipActHdrR.sub_char1(hdrR.sub_char1());					// 予備１
			shipActHdrR.sub_char2(hdrR.sub_char2());					// 予備２
			shipActHdrR.sub_char3(hdrR.sub_char3());					// 予備３
			shipActHdrR.dlv_slip_prnt_flg(false);						// 納品書即時発行ＦＬＧ
			shipActHdrR.lot_chk_off_flg(hdrR.lot_chk_off_flg());		// ロットチェック無視ＦＬＧ
			shipActHdrR.dlv_slip_flg(false);							// 納品伝票作成ＦＬＧ
			shipActHdrR.io_act_flg(false);								// 受払実績作成ＦＬＧ
			shipActHdrR.sls_act_flg(false);								// 売上実績作成ＦＬＧ
			shipActHdrR.sls_dtl_mod_flg(hdrR.sls_dtl_mod_flg());
			shipActHdrR.ref_ship_act_no(hdrR.getStringNE("ref_ship_act_no"));
			
			return shipActHdrR;
		}
		
		/**
		 * 登録対象の売上実績明細Listより、最初に見つかった出荷予定紐付のあるRowを返す。紐付がある行がない場合はnullを返す。
		 * 
		 * @param dtlL
		 * @return
		 */
		protected SlsAct_Upd01_DtlR getConShipSchdRow(MCList<SlsAct_Upd01_DtlR> dtlL) {
			for (SlsAct_Upd01_DtlR dtlR : dtlL) {
				if (!isNull(dtlR.ship_schd_no())) {
					return dtlR;
				}
			}
			return null;
		}
		
		/**
		 * 受払実績SV呼出（受払ワークの登録）
		 * 
		 */
		protected void callIoActSvWK() {
			MSBEL_IoActService.IoAct_Ins01 ope = MSBEL_IoActService.crtIoAct_Ins01();
			ope.up0().setAll(makeIoUp());
			
			if (ope.up0().size() > 0) {
				ope.exec();
			}
		}
		
		/**
		 * 受払実績SV呼出のための電文作成
		 * 
		 * @return
		 */
		protected MCList<IoAct_Ins01_DtlR> makeIoUp() {
			MCList<IoAct_Ins01_DtlR> ioActL = MCList.create(IoAct_Ins01_DtlR.class);
			
			String[] ioKeys = new String[] {
					SlsAct_Upd01_IoR.$new_hdr_peg_no, SlsAct_Upd01_IoR.$dtl_peg_no
			};
			String[] ioDelKeys = new String[] {
					SlsAct_Upd01_IoR.$hdr_peg_no,
					SlsAct_Upd01_IoR.$dtl_peg_no,
					SlsAct_Upd01_IoR.$data_crud_typ,
					SlsAct_Upd01_IoR.$new_hdr_peg_no
			};
			
			MCIndexKey befHdrLIdx = _befHdrL.createIndex(SlsAct_Upd01_HdrR.$sls_act_no);
			
			// ヘッダループ
			for (SlsAct_Upd01_HdrR hdrR : _hdrL) {
				SlsAct_Upd01_HdrR befHdrR = _befHdrL.getFirst(befHdrLIdx, hdrR.sls_act_no());
				
				// 売上値引登録の場合
				if (isSlsDscntXtra(hdrR.trd_ptn_typ())) {
					// 訂正で、承認対象外から承認対象となった場合
					if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ()) && !hdrR.bef_aprv_flg() && hdrR.aprv_flg()) {
						IoAct_Ins01_DtlR ioActDelR = IoAct_Ins01_DtlR.create();
						ioActDelR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());					// データ更新区分（取消）
						ioActDelR.can_ac_dt(hdrR.can_ac_dt());									// 取消計上日
						ioActDelR.act_no(hdrR.sls_act_no());									// ヘッダ実績ＮＯ
						ioActDelR.trn_typ(MSC_TRN_TYP.SLS.value());								// トランザクション区分（売上）
						
						ioActL.add(ioActDelR);
						continue;
					}
					// 取消で、承認対象を取り消した場合
					if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ()) && hdrR.bef_aprv_flg() &&
							!MAC_APRV_STS_TYP.isACPT(befHdrR.aprv_sts_typ())) {
						continue;
					}
					// 承認対象で最終承認済ではない場合
					if (hdrR.aprv_flg() && (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())
							|| (befHdrR.aprv_flg() && !MAC_APRV_STS_TYP.isACPT(befHdrR.aprv_sts_typ())))) {
						continue;
					}
				}
				
				// 売上値引、売上値増、かつ、訂正後が承認対象、かつ、訂正後が最終承認済ではない、かつ、訂正前が最終承認済の場合はtrueを設定
				boolean delExecFlg = isSlsDscntXtra(hdrR.trd_ptn_typ()) && hdrR.aprv_flg() &&
						!MAC_APRV_STS_TYP.isACPT(hdrR.aprv_sts_typ()) && 
						MAC_APRV_STS_TYP.isACPT(befHdrR.aprv_sts_typ());
				
				// 取消の場合
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ()) || delExecFlg) {
					IoAct_Ins01_DtlR ioActDelR = IoAct_Ins01_DtlR.create();
					if (delExecFlg) {
						ioActDelR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());				// データ更新区分
					}
					else {
						ioActDelR.data_crud_typ(hdrR.data_crud_typ());						// データ更新区分
					}
					ioActDelR.can_ac_dt(hdrR.can_ac_dt());									// 取消計上日
					ioActDelR.act_no(hdrR.sls_act_no());									// ヘッダ実績ＮＯ
					ioActDelR.trn_typ(MSC_TRN_TYP.SLS.value());								// トランザクション区分（売上）
					
					ioActL.add(ioActDelR);
					continue;
				}
				
				// 新ヘッダ紐付きＮＯに紐づく明細を取得
				MCList<SlsAct_Upd01_DtlR> dtlTgtL = getDtlData(_dtlL, hdrR.new_hdr_peg_no(), SlsAct_Upd01_DtlR.$new_hdr_peg_no);
				dtlTgtL.sort(SlsAct_Upd01_DtlR.$disp_seq);
				
				if (!MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
					// （旧）ヘッダ紐付きＮＯに紐づく削除の明細を取得
					String[] dtlDelKeys = new String[] {
							SlsAct_Upd01_DtlR.$hdr_peg_no,
							SlsAct_Upd01_DtlR.$data_crud_typ,
							SlsAct_Upd01_DtlR.$new_hdr_peg_no
					};
					Comparable<?>[] dtlDelVals = new Comparable[] {
							hdrR.hdr_peg_no(), MAC_DATA_CRUD_TYP.DEL.value(), null
					};
					MCList<SlsAct_Upd01_DtlR> dtlDelL = up1().subList(dtlDelKeys, dtlDelVals); 
					dtlTgtL.addAll(dtlDelL);
				}
				// 明細ループ
				for (SlsAct_Upd01_DtlR dtlTgtR : dtlTgtL) {
					// 検収基準売上の場合
					if ((MAC_SLS_BASIS_TYP.isIN_BASIS(hdrR.sls_basis_typ()) || MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(hdrR.sls_basis_typ()))
							&& MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
						if (isNull(hdrR.bef_dlv_slip_no())) {
							MST_DLV_SLIP_D_R slipd = MST_DLV_SLIP_D_R.create("SLIPD");
							MST_DLV_SLIP_R dlvR = MST_DLV_SLIP_R.create("T");
							MCQueryApiBuilder dlvR_bldr = MCQueryApiBuilder.create(dlvR);
							dlvR_bldr.setDistinct();
							dlvR_bldr.setSelect(slipd.dlv_slip_no);
							dlvR_bldr.setWhere(dlvR.dlv_slip_act_no.eq(bind("1")), hdrR.ship_act_no());
							dlvR_bldr.addWhereWithAnd(dlvR.trd_cd.eq(bind("1")), hdrR.trd_cd());
							dlvR_bldr.addWhereWithAnd(dlvR.slo_no.eq(bind("1")), hdrR.slo_no());
							dlvR_bldr.addWhereWithAnd(dlvR.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())));
							dlvR_bldr.addWhereWithAnd(dlvR.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())));
							dlvR_bldr.addLeftOuterJoin(slipd,
									bracket(dlvR.dlv_slip_no.eq(slipd.dlv_slip_no)
											.and(dlvR.dlv_slip_seq.eq(slipd.dlv_slip_seq))));
							dlvR_bldr.addWhereWithAnd(slipd.slo_d_no.eq(bind("1")), dtlTgtR.slo_d_no());
							dlvR_bldr.addWhereWithAnd(slipd.dlv_slip_d_no.eq(bind("1")), dtlTgtR.dlv_slip_d_no());
							dbSelect("MSBBL6010_MST_DLV_SLIP_S05", dlvR, dlvR_bldr);
							if (!isNull(dlvR)) {
								hdrR.bef_dlv_slip_no(dlvR.dlv_slip_no());
							}
						}
					}
					MCList<SlsAct_Upd01_IoR> ioTgtL = MCList.create(SlsAct_Upd01_IoR.class);
					if (MAC_DATA_CRUD_TYP.isDEL(dtlTgtR.data_crud_typ())) {
						// 行削除行の場合は明細実績ＮＯまで渡す
						IoAct_Ins01_DtlR ioActDelR = IoAct_Ins01_DtlR.create();
						ioActDelR.data_crud_typ(dtlTgtR.data_crud_typ());						// データ更新区分
						ioActDelR.can_ac_dt(hdrR.can_ac_dt());									// 取消計上日
						ioActDelR.act_no(hdrR.sls_act_no());									// ヘッダ実績ＮＯ
						ioActDelR.act_d_no(dtlTgtR.sls_act_d_no());								// 明細実績ＮＯ
						ioActDelR.trn_typ(MSC_TRN_TYP.SLS.value());								// トランザクション区分（売上）
						
						ioActL.add(ioActDelR);
					}
					else {
						// 新ヘッダ紐付けＮＯ、明細紐付けＮＯに紐づく詳細取得
						Comparable<?>[] ioVals = new Comparable[] {
								dtlTgtR.new_hdr_peg_no(), dtlTgtR.dtl_peg_no()
						};
						ioTgtL.addAll(_ioL.subList(ioKeys, ioVals));
						
						// （旧）ヘッダ紐付けＮＯ、明細紐付けＮＯに紐づく削除の詳細を取得
						if (MAC_DATA_CRUD_TYP.isUPD(dtlTgtR.data_crud_typ())) {
							Comparable<?>[] ioDelVals = new Comparable[] {
									dtlTgtR.hdr_peg_no(), dtlTgtR.dtl_peg_no(), MAC_DATA_CRUD_TYP.DEL.value(), null
							};
							ioTgtL.addAll(up2().subList(ioDelKeys, ioDelVals));
						}
						
						
						for (SlsAct_Upd01_IoR ioTgtR : ioTgtL) {
							IoAct_Ins01_DtlR ioActR = IoAct_Ins01_DtlR.create();
							
							// 詳細の行削除の場合
							if (MAC_DATA_CRUD_TYP.isDEL(ioTgtR.data_crud_typ())) {
								ioActR.data_crud_typ(ioTgtR.data_crud_typ());						// データ更新区分
								ioActR.can_ac_dt(hdrR.can_ac_dt());									// 取消計上日
								ioActR.act_no(hdrR.sls_act_no());									// ヘッダ実績ＮＯ
								ioActR.act_d_no(dtlTgtR.sls_act_d_no());							// 明細実績ＮＯ
								ioActR.act_io_no(ioTgtR.sls_act_io_no());							// 実績受払ＮＯ
								ioActR.trn_typ(MSC_TRN_TYP.SLS.value());							// トランザクション区分（売上）
								
								ioActL.add(ioActR);
								continue;
							}
							
							// 取引パタン区分：売上
							if(MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())){
								ioActR.un_fix_flg(dtlTgtR.interim_flg());						// 金額未確定ＦＬＧ
								if (isNull(ioTgtR.loc_cd())) {
									ioActR.gi_wg_cd(hdrR.wg_cd());								// 出庫ＷＧ ＣＤ（ヘッダのワーキンググループＣＤ）
								}
								else {
									ioActR.gi_wg_cd(getLocWgCd(ioTgtR.loc_cd()));				// 出庫ＷＧ ＣＤ（出庫場所のワーキンググループＣＤ）
								}
								ioActR.gi_loc_cd(ioTgtR.loc_cd());								// 出庫場所ＣＤ
								ioActR.gi_str_ln_cd(ioTgtR.str_ln_cd());						// 出庫棚・ラインＣＤ
								
								if (!isNull(dtlTgtR.dlv_cd()) && !MAC_STR.isNULL_VAL(dtlTgtR.dlv_cd())) {
									ioActR.stk_arrv_bp_cd(dtlTgtR.dlv_cd());					// 在庫着荷先ＣＤ（納品先ＣＤ）
								}
								else {
									ioActR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());			// 在庫着荷先ＣＤ（NULL文字）
								}
								
								if (!MAC_STR.isNULL_VAL(ioActR.stk_arrv_bp_cd())) {
									if (getCstCache(hdrR.cst_cd()).cst_iv_flg() &&
										!isNull(hdrR.iv_no()) && !MAC_STR.isNULL_VAL(hdrR.iv_no()) && isNull(dtlTgtR.purc_ddlv_po_no())) {
										ioActR.fix_no_typ(MSC_FIX_NO_TYP.IV_NO.value());		// 確定ＮＯ区分（インボイスＮＯ）
										if (!isNull(hdrR.bef_iv_no())) {
											ioActR.fix_no(hdrR.bef_iv_no());					// 確定ＮＯ（インボイスＮＯ）
										}
										else {
											ioActR.fix_no(hdrR.iv_no());						// 確定ＮＯ（インボイスＮＯ）
										}
									}
									else {
										ioActR.fix_no_typ(MSC_FIX_NO_TYP.DLV_SLIP_NO.value());	// 確定ＮＯ区分（納品書ＮＯ）
										if (!isNull(hdrR.bef_dlv_slip_no())) {
											ioActR.fix_no(hdrR.bef_dlv_slip_no());				// 確定ＮＯ（納品書ＮＯ）
										}
										else{
											if ((MAC_SLS_BASIS_TYP.isIN_BASIS(hdrR.sls_basis_typ()) || MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(hdrR.sls_basis_typ())) 
													&& !hdrR.ddlv_sls_flg()) {
												ioActR.fix_no(hdrR.ship_dlv_slip_no());
											}
											else {
												ioActR.fix_no(hdrR.dlv_slip_no());				// 確定ＮＯ（納品書ＮＯ）
											}
										}
									}
								}
								else {
									ioActR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());				// 確定ＮＯ区分（なし）
									ioActR.fix_no(MAC_STR.NULL_VAL.value());					// 確定ＮＯ（NULL文字）
								}
								ioActR.gi_gd_cd(ioTgtR.gd_cd());								// 出庫格付ＣＤ
								ioActR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());				// 積送品区分（通常）
								ioActR.quality_typ(MAC_QUALITY_TYP.GOOD.value());				// 良品区分（良品）
								ioActR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());				// 在庫検査区分（検査済）
								ioActR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());				// 在庫識別区分（自社在庫）
								ioActR.stk_bp_cd(MAC_STR.NULL_VAL.value());						// 在庫取引先ＣＤ（NULL文字）
								ioActR.iv_no(hdrR.iv_no());										// インボイスＮＯ
								
								// 預り売上以外の場合
								if (!dtlTgtR.sls_cststk_flg()) {
									ioActR.dlv_cd(dtlTgtR.dlv_cd());							// 納品先ＣＤ
								}
								else {
									ioActR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());			// 在庫着荷先（NULL文字）
									ioActR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());				// 確定ＮＯ区分（なし）
									ioActR.fix_no(MAC_STR.NULL_VAL.value());					// 確定ＮＯ（NULL文字）
									ioActR.no_gi_alloc_flg(dtlTgtR.no_gi_alloc_flg());			// 出庫引当確認対象外
								}
							}
							// 取引パタン区分：貸出売上
							else if (MAC_TRD_PTN_TYP.isSLS_CNSGN(hdrR.trd_ptn_typ())) {
								ioActR.un_fix_flg(dtlTgtR.interim_flg());						// 金額未確定ＦＬＧ
								ioActR.gi_wg_cd(getLocWgCd(ioTgtR.loc_cd()));					// 出庫ＷＧ ＣＤ（出庫場所のワーキンググループＣＤ）
								ioActR.gi_loc_cd(ioTgtR.loc_cd());								// 出庫場所ＣＤ
								ioActR.gi_str_ln_cd(ioTgtR.str_ln_cd());						// 出庫棚・ラインＣＤ
								ioActR.stk_arrv_bp_cd(dtlTgtR.dlv_cd());						// 在庫着荷先ＣＤ（納品先ＣＤ）
								ioActR.iv_no(hdrR.iv_no());										// インボイスＮＯ
								ioActR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());				// 積送品区分（通常）
								ioActR.quality_typ(MAC_QUALITY_TYP.GOOD.value());				// 良品区分（良品）
								ioActR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());				// 在庫検査区分（検査済）
								ioActR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());				// 在庫識別区分（自社在庫）
								ioActR.stk_bp_cd(MAC_STR.NULL_VAL.value());						// 在庫取引先ＣＤ（NULL文字）
								ioActR.gi_gd_cd(ioTgtR.gd_cd());								// 出庫格付ＣＤ
								ioActR.dlv_cd(dtlTgtR.dlv_cd());								// 納品先ＣＤ
								ioActR.no_gi_alloc_flg(true);									// 出庫引当確認対象外
							}
							// 取引パタン区分：売上返品
							else if (MAC_TRD_PTN_TYP.isSLS_RTN(hdrR.trd_ptn_typ())) {
								ioActR.un_fix_flg(dtlTgtR.interim_flg());						// 金額未確定ＦＬＧ
								ioActR.iv_no(hdrR.iv_no());										// インボイスＮＯ
								if (isNull(ioTgtR.loc_cd())) {
									ioActR.gi_wg_cd(hdrR.wg_cd());								// 出庫ＷＧ ＣＤ（ヘッダのワーキンググループＣＤ）
								}
								else {
									ioActR.gi_wg_cd(getLocWgCd(ioTgtR.loc_cd()));				// 出庫ＷＧ ＣＤ（出庫場所のワーキンググループＣＤ）
								}
								ioActR.gi_loc_cd(ioTgtR.loc_cd());								// 出庫場所ＣＤ
								ioActR.gi_str_ln_cd(ioTgtR.str_ln_cd());						// 出庫棚・ラインＣＤ
								ioActR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());				// 在庫着荷先ＣＤ（NULL文字）
								ioActR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());				// 積送品区分（通常）
								ioActR.quality_typ(MAC_QUALITY_TYP.GOOD.value());				// 良品区分（良品）
								ioActR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());				// 在庫検査区分（検査済）
								ioActR.stk_id_typ(MSC_STK_ID_TYP.RTN_PRE_ACCPT.value());		// 在庫識別区分（返品検収前）
								ioActR.stk_bp_cd(hdrR.cst_cd());								// 在庫取引先ＣＤ（得意先）
								ioActR.gi_gd_cd(ioTgtR.gd_cd());								// 出庫格付ＣＤ
								ioActR.dlv_cd(dtlTgtR.dlv_cd());								// 納品先ＣＤ
							}
							// 取引パタン区分：売上値引、売上値増
							else if (isSlsDscntXtra(hdrR.trd_ptn_typ())) {
								ioActR.iv_no(hdrR.iv_no());										// インボイスＮＯ
							}
							
							ioActR.data_crud_typ(ioTgtR.data_crud_typ());						// データ更新区分
							ioActR.ac_dt(hdrR.ac_dt());											// 計上日
							
							// 更新の場合
							if (MAC_DATA_CRUD_TYP.isUPD(ioActR.data_crud_typ()) ||
								MAC_DATA_CRUD_TYP.isDEL(ioActR.data_crud_typ())) {
								ioActR.can_ac_dt(hdrR.can_ac_dt());								// 取消計上日
							}
							
							ioActR.act_tm(hdrR.sls_dt());										// 実績日時
							ioActR.act_no(hdrR.sls_act_no());									// ヘッダ実績ＮＯ
							ioActR.act_seq(hdrR.sls_act_seq());									// ヘッダ実績連番
							ioActR.act_rev_no(hdrR.sls_act_rev());								// ヘッダ実績改訂番号
							ioActR.act_d_no(dtlTgtR.sls_act_d_no());							// 明細実績ＮＯ
							ioActR.act_d_seq(dtlTgtR.sls_act_d_seq());							// 明細実績連番
							ioActR.act_io_no(ioTgtR.sls_act_io_no());							// 実績受払ＮＯ
							ioActR.act_io_seq(ioTgtR.sls_act_io_seq());							// 実績受払連番
							ioActR.trd_cd(hdrR.trd_cd());										// 取引ＣＤ
							ioActR.trd_ptn_typ(hdrR.trd_ptn_typ());								// 取引パタン区分
							ioActR.trn_typ(MSC_TRN_TYP.SLS.value());							// トランザクション区分（売上）
							ioActR.rsn_cd(dtlTgtR.rsn_cd());									// 理由ＣＤ
							ioActR.sls_dpt_cd(hdrR.sls_dpt_cd());								// 売上部門ＣＤ
							ioActR.ar_dpt_cd(hdrR.ar_dpt_cd());									// 債権部門ＣＤ
							ioActR.sls_usr_cd(hdrR.sls_usr_cd());								// 売上担当者ＣＤ
							ioActR.bd_dpt_cd(dtlTgtR.bd_dpt_cd());								// 負担部門ＣＤ
							ioActR.itm_cd(dtlTgtR.itm_cd());									// 品目ＣＤ
							ioActR.itm_sub1(dtlTgtR.itm_sub1());								// 枝番１
							ioActR.itm_sub2(dtlTgtR.itm_sub2());								// 枝番２
							ioActR.itm_sub3(dtlTgtR.itm_sub3());								// 枝番３
							ioActR.itm_nm(dtlTgtR.itm_nm());									// 品名
							ioActR.stk_mng_typ(dtlTgtR.stk_mng_typ());							// 在庫管理区分
							ioActR.sundry_itm_flg(dtlTgtR.sundry_itm_flg());					// 諸口品ＦＬＧ
							ioActR.sno1_mng_typ(dtlTgtR.sno1_mng_typ());						// 手配ＮＯ１管理区分
							ioActR.sno2_mng_typ(dtlTgtR.sno2_mng_typ());						// 手配ＮＯ２管理区分
							ioActR.sno3_mng_typ(dtlTgtR.sno3_mng_typ());						// 手配ＮＯ３管理区分
							ioActR.sno4_mng_typ(dtlTgtR.sno4_mng_typ());						// 手配ＮＯ４管理区分
							ioActR.lot_no(ioTgtR.lot_no());										// ロットＮＯ
							ioActR.sublot_no(ioTgtR.sublot_no());								// サブロットＮＯ
							ioActR.sno1(ioTgtR.sno1());											// 手配ＮＯ１
							ioActR.sno2(ioTgtR.sno2());											// 手配ＮＯ２
							ioActR.sno3(ioTgtR.sno3());											// 手配ＮＯ３
							ioActR.sno4(ioTgtR.sno4());											// 手配ＮＯ４
							ioActR.trd_unit_qty(ioTgtR.trd_unit_qty());							// 取引単位数量
							ioActR.trd_unit_cd(ioTgtR.trd_unit_cd());							// 取引単位ＣＤ
							ioActR.pack_unit_qty(ioTgtR.pack_unit_qty());						// 荷姿単位数量
							ioActR.pack_unit_cd(ioTgtR.pack_unit_cd());							// 荷姿単位ＣＤ
							ioActR.base_unit_qty(ioTgtR.base_unit_qty());						// 基準単位数量
							ioActR.base_unit_cd(ioTgtR.base_unit_cd());							// 基準単位ＣＤ
							
							// 取引パタン区分：売上値引、売上値増の場合
							if (isSlsDscntXtra(hdrR.trd_ptn_typ())) {
								ioActR.bd_dpt_cd(hdrR.sls_dpt_cd());							// 負担部門
								ioActR.bd_wg_cd(hdrR.wg_cd());									// 負担ＷＧ ＣＤ（売上部門のワーキンググループＣＤ）
								ioActR.trd_cur_cd(hdrR.trd_cur_cd());							// 取引通貨ＣＤ
								ioActR.trd_cur_upri(ioTgtR.trd_cur_upri());						// 取引通貨単価
								ioActR.trd_cur_amt(ioTgtR.trd_cur_amt());						// 取引通貨金額
								ioActR.trd_cur_tax_amt(ioTgtR.trd_cur_tax_amt());				// 取引通貨税額
								ioActR.base_cur_cd(hdrR.base_cur_cd());							// 基準通貨ＣＤ
								ioActR.base_cur_upri(ioTgtR.base_cur_upri());					// 基準通貨単価
								ioActR.base_cur_amt(ioTgtR.base_cur_amt());						// 基準通貨金額
								ioActR.base_cur_tax_amt(ioTgtR.base_cur_tax_amt());				// 基準通貨税額
								ioActR.ptax_cur_cd(hdrR.ptax_cur_cd());							// 納税通貨ＣＤ
								ioActR.ptax_cur_upri(ioTgtR.ptax_cur_upri());					// 納税通貨単価
								ioActR.ptax_cur_amt(ioTgtR.ptax_cur_amt());						// 納税通貨金額
								ioActR.ptax_cur_tax_amt(ioTgtR.ptax_cur_tax_amt());				// 納税通貨税額
								ioActR.tax_cd(dtlTgtR.tax_cd());								// 税ＣＤ
								ioActR.xrate_cd(hdrR.xrate_cd());								// 為替レートＣＤ
								ioActR.xrate(hdrR.xrate());										// 為替レート
								ioActR.ptax_xrate_cd(hdrR.xrate_cd());							// 納税為替レートＣＤ
								ioActR.ptax_xrate(hdrR.ptax_xrate());							// 納税為替レート
								ioActR.wtax_rate(dtlTgtR.wtax_rate());
								ioActR.wtax_amt(ioTgtR.getNumberNE(ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_amt));
							}
							else {
								// 他勘定の場合
								if (!isNull(dtlTgtR.rsn_cd()) && getBizRsn(dtlTgtR.rsn_cd()).sls_acxfr_flg()) {
									ioActR.bd_dpt_cd(dtlTgtR.bd_dpt_cd());						// 負担部門ＣＤ
								}
								// 他勘定ではない場合
								else {
									ioActR.trd_cur_cd(hdrR.trd_cur_cd());						// 取引通貨ＣＤ
									ioActR.trd_cur_upri(ioTgtR.trd_cur_upri());					// 取引通貨単価
									ioActR.trd_cur_amt(ioTgtR.trd_cur_amt());					// 取引通貨金額
									ioActR.trd_cur_tax_amt(ioTgtR.trd_cur_tax_amt());			// 取引通貨税額
									ioActR.base_cur_cd(hdrR.base_cur_cd());						// 基準通貨ＣＤ
									ioActR.base_cur_upri(ioTgtR.base_cur_upri());				// 基準通貨単価
									ioActR.base_cur_amt(ioTgtR.base_cur_amt());					// 基準通貨金額
									ioActR.base_cur_tax_amt(ioTgtR.base_cur_tax_amt());			// 基準通貨税額
									ioActR.ptax_cur_cd(hdrR.ptax_cur_cd());						// 納税通貨ＣＤ
									ioActR.ptax_cur_upri(ioTgtR.ptax_cur_upri());				// 納税通貨単価
									ioActR.ptax_cur_amt(ioTgtR.ptax_cur_amt());					// 納税通貨金額
									ioActR.ptax_cur_tax_amt(ioTgtR.ptax_cur_tax_amt());			// 納税通貨税額
									ioActR.tax_cd(dtlTgtR.tax_cd());							// 税ＣＤ
									ioActR.xrate_cd(hdrR.xrate_cd());							// 為替レートＣＤ
									ioActR.xrate(hdrR.xrate());									// 為替レート
									ioActR.ptax_xrate_cd(hdrR.xrate_cd());						// 納税為替レートＣＤ
									ioActR.ptax_xrate(hdrR.ptax_xrate());						// 納税為替レート
									ioActR.wtax_rate(dtlTgtR.wtax_rate());
									ioActR.wtax_amt(ioTgtR.getNumberNE(ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_amt));
								}
							}
							if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())) {					// 売上の場合
								if (!isNull(dtlTgtR.slo_d_no())) {
									ioActR.slo_no(hdrR.slo_no());								// 受注ＮＯ
								}
								// インボイス取引または仕入直送で、計画外明細かつ負担部門ＣＤがNULLの場合
								if ((!isNull(dtlTgtR.iv_d_no()) || hdrR.ddlv_sls_flg())
										&& isNullAnd(dtlTgtR.slo_d_no(), dtlTgtR.bd_dpt_cd())) {
									ioActR.bd_dpt_cd(hdrR.sls_dpt_cd());						// 負担部門ＣＤ
								}
							}
							else {
								ioActR.slo_no(dtlTgtR.slo_no());								// 受注ＮＯ
							}
							ioActR.acst_cd(hdrR.acst_cd());										// 売掛先ＣＤ
							ioActR.cst_cd(hdrR.cst_cd());										// 得意先ＣＤ
							ioActR.dest_cd1(dtlTgtR.dest_cd1());								// 仕向先ＣＤ１
							ioActR.dest_cd2(dtlTgtR.dest_cd2());								// 仕向先ＣＤ２
							ioActR.dest_cd3(dtlTgtR.dest_cd3());								// 仕向先ＣＤ３
							ioActR.cst_itm_cd(dtlTgtR.cst_itm_cd());							// 得意先品目ＣＤ
							ioActR.cst_itm_nm(dtlTgtR.cst_itm_nm());							// 得意先品名
							ioActR.trd_rmrks(hdrR.trd_rmrks());									// 取引備考
							ioActR.trd_d_rmrks(dtlTgtR.trd_d_rmrks());							// 取引明細備考
							
							ioActL.add(ioActR);
						}
					}
				}
			}
			
			return ioActL;
		}
		
		/**
		 * 場所に対するＷＧを取得
		 * 
		 * @param loc_cd
		 * @return wg_cd
		 */
		protected String getLocWgCd(String loc_cd) {
			MAM_LOC_R locR = getLoc(loc_cd);
			if (!isNull(locR)) {
				return locR.wg_cd();
			}
			return null;
		}
		
		/**
		 * 預り売上か判断
		 * 
		 * @param dtlR
		 * @return
		 */
		protected boolean isSlsCstk(SlsAct_Upd01_DtlR dtlR) {
			SlsAct_Upd01_HdrR hdrR = up0().getFirst(_up0IdxKey, dtlR.hdr_peg_no());
			if (!isNull(hdrR.trd_ptn_typ()) && !MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())) {
				return false;
			}
			if (!isNull(dtlR.slo_d_no())) {
				MST_SLO_D_R tgtSloDR = _sloDL.getFirst(_sloDKey, dtlR.slo_d_no());
				if (!isNull(tgtSloDR)){
					return tgtSloDR.sls_cststk_flg();
				}
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				MST_SLS_ACT_D_R slsActDR = MST_SLS_ACT_D_R.create("T");
				MCQueryApiBuilder slsActDR_bldr = MCQueryApiBuilder.create(slsActDR);
				MST_SLO_D_R t1 = MST_SLO_D_R.create("T1");
				MST_SLS_ACT_D_R S1W = MST_SLS_ACT_D_R.create("W");
				slsActDR_bldr.setSelect(t1.sls_cststk_flg);
				slsActDR.addBooleanColumn("sls_cststk_flg");
				slsActDR_bldr.addLeftOuterJoin(t1, bracket( slsActDR.slo_d_no.eq(t1.slo_d_no)));
				slsActDR_bldr.setWhere(slsActDR.sls_act_d_no.eq(bind("1")), dtlR.sls_act_d_no());
				slsActDR_bldr.addWhereWithAnd(slsActDR.sls_act_d_seq
						.eq(subQuery().select(max(S1W.sls_act_d_seq)).from(S1W)
								.where(S1W.sls_act_d_no.eq(slsActDR.sls_act_d_no))));
				dbSelect("MSBBL6010_MST_SLS_ACT_D_S01", slsActDR, slsActDR_bldr);
				return slsActDR.getBooleanNE("sls_cststk_flg");
			}
			return false;
		}
		
		/**
		 * 対象売上予定の同一インボイスＮＯで仕入直送となっているか判断
		 * trueの場合、売上予定サービスの実行対象となる。
		 * インボイス登録で行追加された明細でも売上予定サービスの実行対象とする。
		 * 
		 * @param dtlR
		 * @return
		 */
		protected boolean getDdlvIvGrp(SlsAct_Upd01_DtlR dtlR) {
			// インボイス取引対象ではない場合
			MCList<SlsAct_Upd01_HdrR> hdrL = up0().subList(SlsAct_Upd01_HdrR.$hdr_peg_no, dtlR.hdr_peg_no());
			if (isNull(hdrL) || isNullOrNullVal(hdrL.get(0).iv_no())) {
				return false;
			}
			
			// インボイス対象の仕入直送と判断できる場合
			if (!isNull(dtlR.sls_schd_no()) && !isNull(dtlR.iv_d_no()) && !isNull(dtlR.purc_ddlv_po_no())) {
				return true;
			}
			
			// 同一インボイスＮＯで仕入直送と既に判断済だった場合
			MCList<SlsAct_Upd01_HdrR> ivHdrL = up0().subList(SlsAct_Upd01_HdrR.$iv_no, hdrL.get(0).iv_no());
			if (!isNull(ivHdrL)) {
				MCList<SlsAct_Upd01_DtlR> ivDtlL = MCList.create(SlsAct_Upd01_DtlR.class);
				for (SlsAct_Upd01_HdrR ivHdrR : ivHdrL) {
					ivDtlL.addAll(up1().subList(SlsAct_Upd01_DtlR.$hdr_peg_no, ivHdrR.hdr_peg_no()));
				}
				if (!isNull(ivDtlL)) {
					if (ivDtlL.subList(SlsAct_Upd01_DtlR.$ddlv_iv_grp_flg, true).size() > 0) {
						return true;
					}
				}
			}
			
			if (!isNull(dtlR.sls_schd_no())) {
				MST_SLS_SCHD_R slsSchdR = MST_SLS_SCHD_R.create("T");
				MCQueryApiBuilder slsSchdR_bldr = MCQueryApiBuilder.create(slsSchdR);
				MST_SLS_SCHD_R S1W = MST_SLS_SCHD_R.create("W");
				slsSchdR.addBooleanColumn("ddlv_iv_grp_flg");
				slsSchdR_bldr.setSelect(slsSchdR.sls_schd_no);
				slsSchdR_bldr.addSelect(decode(
						bracket(subQuery().select(sign(count(S1W.sls_schd_no))).from(S1W)
								.where(slsSchdR.iv_no.eq(S1W.iv_no)
										.and(S1W.po_schd_no.isNotNull()))),
						value(0), value(false), value(true)).as("ddlv_iv_grp_flg"));
				slsSchdR_bldr.setWhere(slsSchdR.sls_schd_no.eq(bind("1")), dtlR.sls_schd_no());
				slsSchdR_bldr.addWhereWithAnd(bracket(slsSchdR.iv_no.isNotNull()
						.or(slsSchdR.iv_no.neq(value(MAC_STR.NULL_VAL.value())))));
				int cnt = dbSelect("MSBBL6010_MST_SLS_SCHD_S02", slsSchdR, slsSchdR_bldr);
				if (cnt == 0) {
					return false;
				}
				return slsSchdR.getBooleanNE("ddlv_iv_grp_flg");
			}
			return false;
		}
		
		/**
		 * 債権共通SVの呼び出し
		 * 
		 */
		protected void callArCmnSv() {
			if (_arInL.size() == 0) {
				return;
			}
			MSBGL_ArCmnService.ArCmn_Upd01 ope = MSBGL_ArCmnService.crtArCmn_Upd01();
			ope.up0().setAll(_arInL);
			ope.up1().ar_ope_typ(MSC_AR_OPE_TYP.SLS_ACT.value());	// 債権更新処理区分「売上実績」
			ope.exec();
		}

		protected String getDlvCd(String dlv_cd) {
			if (!isNull(dlv_cd) && isSame(dlv_cd, MAC_STR.NULL_VAL.value())){
				dlv_cd = null;
			}
			return dlv_cd;
		}
		
		/**
		 * 債権共通SV呼出情報作成
		 * 
		 * @param hdrR
		 * @param dtlL
		 * @param canFlg 取消データの場合true
		 */
		protected void makeArInL(SlsAct_Upd01_HdrR hdrR, MCList<SlsAct_Upd01_DtlR> dtlL, boolean canFlg) {
			for (SlsAct_Upd01_DtlR dtlR : dtlL) {
				if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					continue;
				}
				ArCmn_Upd01_DtlR arInR = ArCmn_Upd01_DtlR.create();
				arInR.trd_cd(hdrR.trd_cd());												// 取引ＣＤ
				arInR.act_no(hdrR.sls_act_no());											// ヘッダ実績ＮＯ（売上実績ＮＯ）
				arInR.act_seq(hdrR.sls_act_seq());											// ヘッダ実績連番（売上実績連番）
				arInR.act_rev(hdrR.sls_act_rev());											// ヘッダ改訂番号（売上実績改訂番号）
				arInR.act_d_no(dtlR.sls_act_d_no());										// 明細実績ＮＯ（売上実績明細ＮＯ）
				arInR.act_d_seq(dtlR.sls_act_d_seq());										// 明細実績連番（売上実績明細連番）
				arInR.trd_cur_cd(hdrR.trd_cur_cd());										// 取引通貨ＣＤ
				arInR.ar_trd_grp_typ(MAC_TRD_PTN_TYP.ar_trd_grp_typ(hdrR.trd_ptn_typ()));	// 債権取引グループ区分
				arInR.trd_ptn_typ(hdrR.trd_ptn_typ());										// 取引パタン区分
				arInR.bcst_cd(hdrR.bcst_cd());												// 請求先ＣＤ
				arInR.acst_cd(hdrR.acst_cd());												// 売掛先ＣＤ
				arInR.cst_cd(hdrR.cst_cd());												// 得意先ＣＤ
				arInR.dlv_cd(getDlvCd(dtlR.dlv_cd()));										// 納品先ＣＤ
				arInR.dlv_nm(dtlR.dlv_nm());												// 納品先名
				arInR.dlv_sundry_flg(dtlR.dlv_sundry_flg());								// 納品先諸口ＦＬＧ
				arInR.dest_cd1(dtlR.dest_cd1());											// 仕向先ＣＤ１
				arInR.dest_cd2(dtlR.dest_cd2());											// 仕向先ＣＤ２
				arInR.dest_cd3(dtlR.dest_cd3());											// 仕向先ＣＤ３
				arInR.ac_dt(hdrR.ac_dt());													// 計上日
				arInR.ac_ym(getAcYm(hdrR.ac_dt()));											// 計上年月
				arInR.dlv_dt(getDlvDt(hdrR));												// 納品日
				arInR.base_sls_ac_dt(dtlR.base_sls_ac_dt());							// 売上計上日（基）
				if (isNull(hdrR.bill_basis_dt()) || MAC_BILL_CL_TYP.isEACH_SLS(hdrR.bill_cl_typ())) {		// 請求起算日
					arInR.bill_basis_dt(hdrR.ac_dt());
				}
				else {
					arInR.bill_basis_dt(hdrR.bill_basis_dt());
				}
				arInR.bill_crryovr_times(dtlR.bill_crryovr_times());						// 請求繰越回数
				arInR.ar_dpt_cd(hdrR.ar_dpt_cd());											// 債権部門ＣＤ
				arInR.sls_dpt_cd(hdrR.sls_dpt_cd());										// 売上部門ＣＤ
				arInR.sls_usr_cd(hdrR.sls_usr_cd());										// 売上担当者ＣＤ
				arInR.dlv_slip_no(hdrR.dlv_slip_no());										// 納品書ＮＯ
				arInR.dlv_slip_d_no(dtlR.dlv_slip_d_no());									// 納品書明細ＮＯ
				arInR.ship_dlv_slip_no(hdrR.ship_dlv_slip_no());							// 出荷時納品書ＮＯ
				arInR.ship_dlv_slip_d_no(dtlR.ship_dlv_slip_d_no());						// 出荷時納品書明細ＮＯ
				arInR.ship_dlv_slip_multi_flg(dtlR.ship_dlv_slip_multi_flg());				// 出荷時納品書明細複数ＦＬＧ
				arInR.iv_no(hdrR.iv_no());													// インボイスＮＯ
				if (!isNull(dtlR.slo_d_no())) {
					if (!isNull(dtlR.slo_no())) {
						arInR.slo_no(dtlR.slo_no());										// 受注ＮＯ
					}
					else {
						arInR.slo_no(hdrR.slo_no());										// 受注ＮＯ
					}
				}
				arInR.slo_d_no(dtlR.slo_d_no());											// 受注明細ＮＯ
				arInR.cst_po_no(hdrR.cst_po_no());											// 得意先注文ＮＯ
				arInR.cst_po_d_no(dtlR.cst_po_d_no());										// 得意先注文明細ＮＯ
				arInR.itm_cd(dtlR.itm_cd());												// 品目ＣＤ
				arInR.itm_sub1(dtlR.itm_sub1());											// 枝番１
				arInR.itm_sub2(dtlR.itm_sub2());											// 枝番２
				arInR.itm_sub3(dtlR.itm_sub3());											// 枝番３
				arInR.sno1(dtlR.sno1());													// 手配ＮＯ１
				arInR.sno2(dtlR.sno2());													// 手配ＮＯ２
				arInR.sno3(dtlR.sno3());													// 手配ＮＯ３
				arInR.sno4(dtlR.sno4());													// 手配ＮＯ４
				arInR.itm_nm(dtlR.itm_nm());												// 品名
				arInR.sundry_itm_flg(dtlR.sundry_itm_flg());								// 諸口品ＦＬＧ
				arInR.cst_itm_cd(dtlR.cst_itm_cd());										// 得意先品目
				arInR.cst_itm_nm(dtlR.cst_itm_nm());										// 得意先品名
				arInR.trd_unit_cd(dtlR.trd_unit_cd());										// 取引単位ＣＤ
				arInR.base_unit_cd(dtlR.base_unit_cd());									// 基準単位ＣＤ
				arInR.trd_cur_upri(dtlR.trd_cur_upri());									// 取引通貨単価
				arInR.inc_tax_flg(dtlR.inc_tax_flg());										// 内税ＦＬＧ
				arInR.interim_flg(dtlR.interim_flg());										// 仮単価ＦＬＧ
				arInR.xrate(hdrR.xrate());													// 為替レート
				arInR.base_cur_upri(dtlR.base_cur_upri());									// 基準通貨単価
				arInR.tax_typ(dtlR.tax_typ());												// 税区分
				arInR.tax_rate(dtlR.tax_rate());											// 税率
				arInR.tax_cd(dtlR.tax_cd());												// 税ＣＤ
				arInR.wtax_rate(dtlR.wtax_rate());											// 源泉税率
				arInR.trd_d_rmrks(dtlR.trd_d_rmrks());										// 取引明細備考
				arInR.bill_d_typ(MSC_BILL_D_TYP.SLS.value());								// 請求明細区分「売上」
				arInR.ref_iv_no(hdrR.ref_iv_no());											// 対応インボイスＮＯ
				arInR.rcv_schd_dt(hdrR.rcv_schd_dt());										// 入金予定日
				arInR.wrk_no(getWrkNo(dtlR));												// 案件ＮＯ
				
				// 取消の場合
				if (canFlg) {
					// 取消データ、数量、金額はマイナス値に変換
					arInR.trd_unit_qty(dtlR.trd_unit_qty().negate());					// 取引単位数量
					arInR.base_unit_qty(dtlR.base_unit_qty().negate());					// 基準単位数量
					arInR.trd_cur_amt(dtlR.trd_cur_amt().negate());						// 取引通貨金額
					arInR.trd_cur_tax_amt(dtlR.trd_cur_tax_amt().negate());				// 取引通貨税額
					arInR.base_cur_amt(dtlR.base_cur_amt().negate());					// 基準通貨金額
					arInR.base_cur_tax_amt(dtlR.base_cur_tax_amt().negate());			// 基準通貨税額
					if (!isNull(dtlR.trd_cur_dscnt_amt())) {
						arInR.trd_cur_dscnt_amt(dtlR.trd_cur_dscnt_amt().negate());		// 取引通貨値引額
						arInR.base_cur_dscnt_amt(dtlR.base_cur_dscnt_amt().negate());	// 基準通貨値引額
					}
					if (!isNull(dtlR.wtax_amt())) {
						arInR.wtax_amt(dtlR.wtax_amt().negate());						// 源泉税額
					}
					
					arInR.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());	// 伝票状況区分「取消」
					arInR.ar_typ(dtlR.ar_typ());						// 債権区分
				}
				// 新規・更新の場合
				else {
					arInR.trd_unit_qty(dtlR.trd_unit_qty());									// 取引単位数量
					arInR.base_unit_qty(dtlR.base_unit_qty());									// 基準単位数量
					arInR.trd_cur_amt(dtlR.trd_cur_amt());										// 取引通貨金額
					arInR.trd_cur_dscnt_amt(dtlR.trd_cur_dscnt_amt());							// 取引通貨値引額
					arInR.base_cur_amt(dtlR.base_cur_amt());									// 基準通貨金額
					arInR.base_cur_dscnt_amt(dtlR.base_cur_dscnt_amt());						// 基準通貨値引額
					arInR.base_cur_tax_amt(dtlR.base_cur_tax_amt());							// 基準通貨税額
					arInR.trd_cur_tax_amt(dtlR.trd_cur_tax_amt());								// 取引通貨税額
					arInR.wtax_amt(dtlR.wtax_amt());											// 源泉税額
					
					arInR.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());	// 伝票状況区分「新規」
					arInR.ar_typ(getArTyp(dtlR));						// 債権区分
				}
				
				_arInL.add(arInR);
			}
		}
		
		/**
		 * 債権共通SVへの納品日の設定
		 * 
		 * @param hdrR
		 * @return
		 */
		protected MCDate getDlvDt(SlsAct_Upd01_HdrR hdrR) {
			// 売上返品の場合は「売上日」（売上返品日）
			if (MAC_TRD_PTN_TYP.isSLS_RTN(hdrR.trd_ptn_typ())) {
				return hdrR.sls_dt();
			}
			// インボイス取引対象で船卸予定日がセットされている場合は「船卸予定日」
			else if (getCstCache(hdrR.cst_cd()).cst_iv_flg() && !isNull(hdrR.eta_dt())) {
				return hdrR.eta_dt(); 
			}
			// 納品日
			return isNull(hdrR.dlv_tm()) ? null : hdrR.dlv_tm().startTimeOfDay();
		}
		
		protected MCList<MST_SLS_ACT_R> _slsSlipSlsActL = null;
		protected void callGALink() {
			MCList<MST_SLS_ACT_R> hdrL = MCList.create(MST_SLS_ACT_R.class);
			for (MCList<MST_SLS_ACT_R> grpL : _slsSlipSlsActL.groupList(MST_SLS_ACT_R.$sls_act_no)) {
				grpL.sort(SortType.DESC, MST_SLS_ACT_R.$sls_act_seq);
				MST_SLS_ACT_R r = grpL.get(0);
				
				MST_SLS_ACT_R hdrR = hdrL.add();
				hdrR.sls_act_no(r.sls_act_no());
				hdrR.sls_act_seq(r.sls_act_seq());
				hdrR.iv_no(r.iv_no());
				hdrR.setStringNE("data_crud_typ", getSlsSlipCrudTyp(grpL, hdrR));
				hdrR.trd_cd(r.trd_cd());
				hdrR.setAttributes(r);
			}
			callGALinkCmn(hdrL);
		}
		protected String getSlsSlipCrudTyp(MCList<MST_SLS_ACT_R> grpL, MST_SLS_ACT_R hdrR) {
			MST_SLS_ACT_R r = grpL.get(0);
			
			if (MAC_SLIP_STS_TYP.isCAN(r.slip_sts_typ())) {
				return MAC_DATA_CRUD_TYP.DEL.value();
			}
			else if (grpL.size() == 1) {
				return MAC_DATA_CRUD_TYP.CRT.value();
			}
			
			// 1レコード目は新規、2レコード目は削除で並んでいる（連番の降順でソートしているので）
			MST_SLS_ACT_R crtR = grpL.get(0), canR = grpL.get(1);
			if (isSlsDscntXtra(crtR.trd_ptn_typ())) {
				if (canR.aprv_flg()) {
					if (MAC_APRV_STS_TYP.isACPT(canR.aprv_sts_typ())) {
						if (crtR.aprv_flg() && !MAC_APRV_STS_TYP.isACPT(crtR.aprv_sts_typ())) {
							// 承認引戻（最終承認済⇒未承認）⇒削除
							// 承認引戻（最終承認済⇒承認対象外）⇒更新
							hdrR.sls_act_seq(canR.sls_act_seq());
							return MAC_DATA_CRUD_TYP.DEL.value();
						}
					}
					else if (!crtR.aprv_flg()) {
						// 最終承認済み以外の承認対象が、承認対象外になった⇒売上伝票を作成する
						return MAC_DATA_CRUD_TYP.CRT.value();
					}
				}
				else if (crtR.aprv_flg()) {
					// 訂正で承認対象外から承認対象に変更⇒削除
					hdrR.sls_act_seq(canR.sls_act_seq());
					return MAC_DATA_CRUD_TYP.DEL.value();
				}
			}
			return MAC_DATA_CRUD_TYP.UPD.value();
		}
		
		/**
		 * 売上実績受払の登録情報作成
		 * 
		 * @param slsActR 売上実績ヘッダ
		 * @param slsActL 売上実績明細
		 * @param ioL 売上実績受払（編集前）
		 * @param canFlg 取消データの場合true
		 * @return 売上実績受払
		 */
		protected MCList<MST_SLS_ACT_IO_R> crtInsSlsActIo(MST_SLS_ACT_R slsActR, MCList<MST_SLS_ACT_D_R> slsActL, MCList<SlsAct_Upd01_IoR> ioL, boolean canFlg) {
			MCList<MST_SLS_ACT_IO_R> insSlsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
			
			MCIndexKey idxkey = slsActL.createIndex(MST_SLS_ACT_D_R.$sls_act_d_no);
			
			for (SlsAct_Upd01_IoR ioR : ioL) {
				if (!canFlg && MAC_DATA_CRUD_TYP.isDEL(ioR.data_crud_typ())) {
					continue;
				}
				
				MST_SLS_ACT_D_R slsActDR = slsActL.getFirst(idxkey, ioR.sls_act_d_no());
				
				if (!isNull(slsActDR) && !slsActDR.isEmpty()) {
					ioR.sls_act_d_seq(slsActDR.sls_act_d_seq());
				}
				
				if (!MAC_DATA_CRUD_TYP.isCRT(ioR.data_crud_typ())) {
					ioR.sls_act_io_seq(ioR.sls_act_io_seq().add(1));
				}
				
				MST_SLS_ACT_IO_R insSlsActIoR = MST_SLS_ACT_IO_R.create();
				insSlsActIoR.sls_act_io_no(ioR.sls_act_io_no());
				insSlsActIoR.sls_act_io_seq(ioR.sls_act_io_seq());
				insSlsActIoR.sls_act_d_no(ioR.sls_act_d_no());
				insSlsActIoR.sls_act_d_seq(ioR.sls_act_d_seq());
				insSlsActIoR.ship_act_d_no(ioR.ship_act_d_no());
				insSlsActIoR.iv_ship_act_d_no(ioR.iv_ship_act_d_no());
				insSlsActIoR.arr_act_no(ioR.arr_act_no());
				insSlsActIoR.purc_act_io_no(ioR.purc_act_io_no());
				insSlsActIoR.gd_cd(ioR.gd_cd());
				insSlsActIoR.loc_cd(ioR.loc_cd());
				insSlsActIoR.str_ln_cd(ioR.str_ln_cd());
				if (isNull(ioR.lot_no())) {
					insSlsActIoR.lot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					insSlsActIoR.lot_no(ioR.lot_no());
				}
				if (isNull(ioR.sublot_no())) {
					insSlsActIoR.sublot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					insSlsActIoR.sublot_no(ioR.sublot_no());
				}
				insSlsActIoR.sno1(ioR.sno1());
				insSlsActIoR.sno2(ioR.sno2());
				insSlsActIoR.sno3(ioR.sno3());
				insSlsActIoR.sno4(ioR.sno4());
				insSlsActIoR.trd_unit_cd(ioR.trd_unit_cd());
				insSlsActIoR.base_unit_cd(ioR.base_unit_cd());
				insSlsActIoR.pack_unit_cd(ioR.pack_unit_cd());
				insSlsActIoR.trd_cur_upri(ioR.trd_cur_upri());
				insSlsActIoR.base_cur_upri(ioR.base_cur_upri());
				insSlsActIoR.ptax_cur_upri(ioR.ptax_cur_upri());
				insSlsActIoR.sync_flg(ioR.sync_flg());
				insSlsActIoR.sub_char1(ioR.sub_char1());
				insSlsActIoR.sub_char2(ioR.sub_char2());
				insSlsActIoR.sub_char3(ioR.sub_char3());
				
				if (canFlg) {
					// 取消データ、数量、金額はマイナス値に変換
					insSlsActIoR.trd_unit_qty(ioR.trd_unit_qty().negate());				// 取引単位数量
					insSlsActIoR.base_unit_qty(ioR.base_unit_qty().negate());			// 基準単位数量
					insSlsActIoR.pack_unit_qty(ioR.pack_unit_qty().negate());			// 荷姿単位数量
					insSlsActIoR.trd_cur_amt(ioR.trd_cur_amt().negate());				// 取引通貨金額
					if (!isNull(ioR.trd_cur_dscnt_amt())) {
						insSlsActIoR.trd_cur_dscnt_amt(ioR.trd_cur_dscnt_amt().negate());	// 取引通貨値引額
					}
					if (!isNull(ioR.base_cur_dscnt_amt())) {
						insSlsActIoR.base_cur_dscnt_amt(ioR.base_cur_dscnt_amt().negate());	// 基準通貨値引額
					}
					insSlsActIoR.trd_cur_tax_amt(ioR.trd_cur_tax_amt().negate());		// 取引通貨税額
					insSlsActIoR.base_cur_amt(ioR.base_cur_amt().negate());				// 基準通貨金額
					insSlsActIoR.base_cur_tax_amt(ioR.base_cur_tax_amt().negate());		// 基準通貨税額
					if (!isNull(slsActR.ptax_cur_cd())) {
						insSlsActIoR.ptax_cur_amt(ioR.ptax_cur_amt().negate());				// 納税通貨金額
						insSlsActIoR.ptax_cur_tax_amt(ioR.ptax_cur_tax_amt().negate());		// 納税通貨税額
						if (!isNull(ioR.ptax_cur_dscnt_amt())) {
							insSlsActIoR.ptax_cur_dscnt_amt(ioR.ptax_cur_dscnt_amt().negate());	// 納税通貨値引額
						}
					}
				}
				else {
					// 新規データ
					insSlsActIoR.trd_unit_qty(ioR.trd_unit_qty());							// 取引単位数量
					insSlsActIoR.base_unit_qty(ioR.base_unit_qty());						// 基準単位数量
					insSlsActIoR.pack_unit_qty(ioR.pack_unit_qty());						// 荷姿単位数量
					insSlsActIoR.trd_cur_amt(ioR.trd_cur_amt());							// 取引通貨金額
					insSlsActIoR.trd_cur_dscnt_amt(ioR.trd_cur_dscnt_amt());				// 取引通貨値引額
					insSlsActIoR.trd_cur_tax_amt(ioR.trd_cur_tax_amt());					// 取引通貨税額
					insSlsActIoR.base_cur_amt(ioR.base_cur_amt());							// 基準通貨金額
					insSlsActIoR.base_cur_dscnt_amt(ioR.base_cur_dscnt_amt());				// 基準通貨値引額
					insSlsActIoR.base_cur_tax_amt(ioR.base_cur_tax_amt());					// 基準通貨税額
					insSlsActIoR.ptax_cur_amt(ioR.ptax_cur_amt());							// 納税通貨金額
					insSlsActIoR.ptax_cur_dscnt_amt(ioR.ptax_cur_dscnt_amt());				// 納税通貨値引額
					insSlsActIoR.ptax_cur_tax_amt(ioR.ptax_cur_tax_amt());					// 納税通貨税額
				}
				insSlsActIoR.addNumberColumn(SlsAct_Upd01_HdrR.$new_hdr_peg_no, slsActR.getNumberNE(SlsAct_Upd01_HdrR.$new_hdr_peg_no)); // 出荷実績サービスとの紐づけ用
				insSlsActIoR.addNumberColumn(SlsAct_Upd01_IoR.$io_peg_no, ioR.io_peg_no()); // 出荷実績サービスとの紐づけ用
				
				// 売上実績受払リストに追加
				insSlsActIoL.add(insSlsActIoR);
				
				MCList<SlsAct_Upd01_IoR> setIoL = _ioL.subList(SlsAct_Upd01_IoR.$sls_act_io_no, insSlsActIoR.sls_act_io_no());
				if (!isNull(setIoL)) {
					setIoL.get(0).sls_act_io_seq(insSlsActIoR.sls_act_io_seq());
				}
			}
			return insSlsActIoL;
		}
		
		/**
		 * 売上実績明細の登録情報作成
		 * 
		 * @param slsActR 売上実績ヘッダ
		 * @param dtlL 売上実績明細(編集前)
		 * @param canFlg 取消データの場合true
		 * @param shipActSvExecFlg 出荷実績実行する場合はtrue
		 * @return　売上実績明細
		 */
		protected MCList<MST_SLS_ACT_D_R> crtInsSlsActD(MST_SLS_ACT_R slsActR, MCList<SlsAct_Upd01_DtlR> dtlL, boolean canFlg, boolean shipActSvExecFlg) {
			MCList<MST_SLS_ACT_D_R> insSlsActDL = MCList.create(MST_SLS_ACT_D_R.class);
			String crtBdDptKey = MAUCL_DptUtil.getCrtColumn(SlsAct_Upd01_DtlR.$bd_dpt_cd);
			for (SlsAct_Upd01_DtlR dtlR : dtlL) {
				if (!canFlg && MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					dtlR.sls_act_d_seq(dtlR.sls_act_d_seq().add(2));
				}
				else if (!MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
					dtlR.sls_act_d_seq(dtlR.sls_act_d_seq().add(1));
				}
				MST_SLS_ACT_D_R insSlsActDR = MST_SLS_ACT_D_R.create();
				insSlsActDR.sls_act_d_no(dtlR.sls_act_d_no());
				insSlsActDR.sls_act_d_seq(dtlR.sls_act_d_seq());
				insSlsActDR.sls_act_no(dtlR.sls_act_no());
				insSlsActDR.sls_act_seq(slsActR.sls_act_seq());
				insSlsActDR.disp_seq(dtlR.disp_seq());
				insSlsActDR.dlv_cd(getDlvCd(dtlR.dlv_cd()));
				insSlsActDR.dlv_sundry_flg(dtlR.dlv_sundry_flg());
				insSlsActDR.dlv_nm(dtlR.dlv_nm());
				insSlsActDR.dlv_zip_cd(dtlR.dlv_zip_cd());
				insSlsActDR.dlv_addr1(dtlR.dlv_addr1());
				insSlsActDR.dlv_addr2(dtlR.dlv_addr2());
				insSlsActDR.dlv_addr3(dtlR.dlv_addr3());
				insSlsActDR.dlv_addr4(dtlR.dlv_addr4());
				insSlsActDR.dlv_cntct_dpt(dtlR.dlv_cntct_dpt());
				insSlsActDR.dlv_cntct_psn(dtlR.dlv_cntct_psn());
				insSlsActDR.dlv_tel(dtlR.dlv_tel());
				insSlsActDR.dlv_fax(dtlR.dlv_fax());
				insSlsActDR.pri_prnt_flg(dtlR.pri_prnt_flg());
				insSlsActDR.dest_cd1(dtlR.dest_cd1());
				insSlsActDR.dest_cd2(dtlR.dest_cd2());
				insSlsActDR.dest_cd3(dtlR.dest_cd3());
				insSlsActDR.tdlv_cd(dtlR.tdlv_cd());
				insSlsActDR.tdlv_sundry_flg(dtlR.tdlv_sundry_flg());
				insSlsActDR.tdlv_nm(dtlR.tdlv_nm());
				insSlsActDR.tdlv_zip_cd(dtlR.tdlv_zip_cd());
				insSlsActDR.tdlv_addr1(dtlR.tdlv_addr1());
				insSlsActDR.tdlv_addr2(dtlR.tdlv_addr2());
				insSlsActDR.tdlv_addr3(dtlR.tdlv_addr3());
				insSlsActDR.tdlv_addr4(dtlR.tdlv_addr4());
				insSlsActDR.tdlv_tel(dtlR.tdlv_tel());
				insSlsActDR.tdlv_fax(dtlR.tdlv_fax());
				insSlsActDR.tdlv_cntct_dpt(dtlR.tdlv_cntct_dpt());
				insSlsActDR.tdlv_cntct_psn(dtlR.tdlv_cntct_psn());
				insSlsActDR.itm_cd(dtlR.itm_cd());
				insSlsActDR.itm_sub1(dtlR.itm_sub1());
				insSlsActDR.itm_sub2(dtlR.itm_sub2());
				insSlsActDR.itm_sub3(dtlR.itm_sub3());
				insSlsActDR.sno1(dtlR.sno1());
				insSlsActDR.sno2(dtlR.sno2());
				insSlsActDR.sno3(dtlR.sno3());
				insSlsActDR.sno4(dtlR.sno4());
				insSlsActDR.itm_nm(dtlR.itm_nm());
				insSlsActDR.iv_itm_nm(dtlR.iv_itm_nm());
				insSlsActDR.cntry_org_cd(dtlR.cntry_org_cd());
				insSlsActDR.loc_cd(dtlR.loc_cd());
				insSlsActDR.str_ln_cd(dtlR.str_ln_cd());
				insSlsActDR.lot_no(dtlR.lot_no());
				insSlsActDR.sublot_no(dtlR.sublot_no());
				insSlsActDR.gd_cd(dtlR.gd_cd());
				insSlsActDR.trd_unit_cd(dtlR.trd_unit_cd());
				insSlsActDR.base_unit_cd(dtlR.base_unit_cd());
				insSlsActDR.trd_cur_upri(dtlR.trd_cur_upri());
				insSlsActDR.upri_not_tgt_flg(dtlR.upri_not_tgt_flg());
				insSlsActDR.interim_flg(dtlR.interim_flg());
				insSlsActDR.tax_cd(dtlR.tax_cd());
				insSlsActDR.base_cur_upri(dtlR.base_cur_upri());
				insSlsActDR.ptax_cur_upri(dtlR.ptax_cur_upri());
				insSlsActDR.cost_upri(dtlR.cost_upri());
				insSlsActDR.cost_amt(dtlR.cost_amt());
				insSlsActDR.dscnt_rsn_cd(dtlR.dscnt_rsn_cd());
				insSlsActDR.bill_crryovr_times(dtlR.bill_crryovr_times());
				insSlsActDR.stk_mng_typ(dtlR.stk_mng_typ());
				insSlsActDR.sundry_itm_flg(dtlR.sundry_itm_flg());
				insSlsActDR.sno1_mng_typ(dtlR.sno1_mng_typ());
				insSlsActDR.sno2_mng_typ(dtlR.sno2_mng_typ());
				insSlsActDR.sno3_mng_typ(dtlR.sno3_mng_typ());
				insSlsActDR.sno4_mng_typ(dtlR.sno4_mng_typ());
				insSlsActDR.cst_po_d_no(dtlR.cst_po_d_no());
				insSlsActDR.cst_itm_cd(dtlR.cst_itm_cd());
				insSlsActDR.cst_itm_nm(dtlR.cst_itm_nm());
				insSlsActDR.trd_d_rmrks(dtlR.trd_d_rmrks());
				insSlsActDR.intr_rmrks(dtlR.intr_rmrks());
				insSlsActDR.rsn_cd(dtlR.rsn_cd());
				insSlsActDR.bd_dpt_cd(dtlR.bd_dpt_cd());
				insSlsActDR.wtax_rate(dtlR.wtax_rate());
				insSlsActDR.wtax_amt(dtlR.wtax_amt());
				insSlsActDR.slo_no(dtlR.slo_no());
				insSlsActDR.slo_d_no(dtlR.slo_d_no());
				insSlsActDR.sls_ret_schd_no(dtlR.sls_ret_schd_no());
				insSlsActDR.sls_ret_schd_d_no(dtlR.sls_ret_schd_d_no());
				insSlsActDR.ship_schd_no(dtlR.ship_schd_no());
				// 出荷実績ＳＶを実行する場合は、実行後に売上予定ＮＯが更新されるので、
				// 実行後に再設定する
				insSlsActDR.sls_schd_no(dtlR.sls_schd_no());
				insSlsActDR.qtn_no(dtlR.qtn_no());
				insSlsActDR.qtn_rev(dtlR.qtn_rev());
				insSlsActDR.qtn_d_no(dtlR.qtn_d_no());
				insSlsActDR.purc_ddlv_po_no(dtlR.purc_ddlv_po_no());
				insSlsActDR.purc_ddlv_po_d_no(dtlR.purc_ddlv_po_d_no());
				insSlsActDR.purc_act_no(dtlR.purc_act_no());
				insSlsActDR.purc_act_d_no(dtlR.purc_act_d_no());
				insSlsActDR.iv_d_no(dtlR.iv_d_no());
				insSlsActDR.sub_char1(dtlR.sub_char1());
				insSlsActDR.sub_char2(dtlR.sub_char2());
				insSlsActDR.sub_char3(dtlR.sub_char3());
				insSlsActDR.ref_sls_act_no(dtlR.ref_sls_act_no());
				insSlsActDR.ref_sls_act_seq(dtlR.ref_sls_act_seq());
				insSlsActDR.ref_sls_act_d_no(dtlR.ref_sls_act_d_no());
				insSlsActDR.ref_sls_act_d_seq(dtlR.ref_sls_act_d_seq());
				insSlsActDR.base_sls_ac_dt(dtlR.base_sls_ac_dt());
				if (!isNull(dtlR.bef_dlv_slip_d_no())) {
					insSlsActDR.dlv_slip_d_no(dtlR.bef_dlv_slip_d_no());
				}
				else {
					insSlsActDR.dlv_slip_d_no(dtlR.dlv_slip_d_no());
				}
				insSlsActDR.ship_dlv_slip_d_no(dtlR.ship_dlv_slip_d_no());
				insSlsActDR.ship_dlv_slip_multi_flg(dtlR.ship_dlv_slip_multi_flg());
				
				if (canFlg) {
					// 取消データ、数量、金額はマイナス値に変換
					insSlsActDR.wrk_no(dtlR.wrk_no());										// 案件ＮＯ
					insSlsActDR.trd_unit_qty(dtlR.trd_unit_qty().negate());				// 取引単位数量
					insSlsActDR.base_unit_qty(dtlR.base_unit_qty().negate());			// 基準単位数量
					insSlsActDR.trd_cur_amt(dtlR.trd_cur_amt().negate());				// 取引通貨金額
					insSlsActDR.trd_cur_tax_amt(dtlR.trd_cur_tax_amt().negate());		// 取引通貨税額
					insSlsActDR.base_cur_amt(dtlR.base_cur_amt().negate());				// 基準通貨金額
					insSlsActDR.base_cur_tax_amt(dtlR.base_cur_tax_amt().negate());		// 基準通貨税額
					if (!isNull(slsActR.ptax_cur_cd())) {
						insSlsActDR.ptax_cur_amt(dtlR.ptax_cur_amt().negate());				// 納税通貨金額
						insSlsActDR.ptax_cur_tax_amt(dtlR.ptax_cur_tax_amt().negate());		// 納税通貨税額
					}
					if (!isNull(dtlR.trd_cur_dscnt_amt())) {
						insSlsActDR.trd_cur_dscnt_amt(dtlR.trd_cur_dscnt_amt().negate());	// 取引通貨値引額
						insSlsActDR.base_cur_dscnt_amt(dtlR.base_cur_dscnt_amt().negate());	// 基準通貨値引額
						if (!isNull(slsActR.ptax_cur_cd())) {
							insSlsActDR.ptax_cur_dscnt_amt(dtlR.ptax_cur_dscnt_amt().negate());	// 納税通貨値引額
						}
					}
					if (!isNull(dtlR.wtax_amt())) {
						insSlsActDR.wtax_amt(dtlR.wtax_amt().negate());						// 源泉税額
					}
					insSlsActDR.ar_typ(dtlR.ar_typ());										// 債権区分
					// 取消の場合、明細の価格印字ＦＬＧの値をヘッダに保持
					slsActR.addBooleanColumn("pri_prnt_flg", dtlR.pri_prnt_flg());
					
					if (!slsActR.ddlv_sls_flg() && 
							(MAC_SLS_BASIS_TYP.isIN_BASIS(slsActR.sls_basis_typ()) || MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(slsActR.sls_basis_typ()))) {
						slsActR.setBooleanNE("pri_prnt_flg", true);
					}
				}
				else {
					// 新規データ
					insSlsActDR.wrk_no(getWrkNo(dtlR));										// 案件ＮＯ
					insSlsActDR.trd_unit_qty(dtlR.trd_unit_qty());							// 取引単位数量
					insSlsActDR.base_unit_qty(dtlR.base_unit_qty());						// 基準単位数量
					insSlsActDR.trd_cur_amt(dtlR.trd_cur_amt());							// 取引通貨金額
					insSlsActDR.trd_cur_tax_amt(dtlR.trd_cur_tax_amt());					// 取引通貨税額
					insSlsActDR.base_cur_amt(dtlR.base_cur_amt());							// 基準通貨金額
					insSlsActDR.base_cur_tax_amt(dtlR.base_cur_tax_amt());					// 基準通貨税額
					insSlsActDR.ptax_cur_amt(dtlR.ptax_cur_amt());							// 納税通貨金額
					insSlsActDR.ptax_cur_tax_amt(dtlR.ptax_cur_tax_amt());					// 納税通貨税額
					insSlsActDR.trd_cur_dscnt_amt(dtlR.trd_cur_dscnt_amt());				// 取引通貨値引額
					insSlsActDR.base_cur_dscnt_amt(dtlR.base_cur_dscnt_amt());				// 基準通貨値引額
					insSlsActDR.ptax_cur_dscnt_amt(dtlR.ptax_cur_dscnt_amt());				// 納税通貨値引額
					insSlsActDR.wtax_amt(dtlR.wtax_amt());									// 源泉税額
					insSlsActDR.ar_typ(getArTyp(dtlR));										// 債権区分
				}
				if (dtlR.contains(crtBdDptKey)) {
					insSlsActDR.setStringNE(crtBdDptKey, dtlR.getStringNE(crtBdDptKey));	// 新規データ負担部門ＣＤ
				}
				insSlsActDR.sls_dtl_upd_flg(dtlR.sls_dtl_upd_flg());						// 明細訂正ＦＬＧ
				insSlsActDR.ext_purc_act_d_no(dtlR.ext_purc_act_d_no());					// 外部仕入実績明細ＮＯ
				insSlsActDR.ext_sys_cd(dtlR.ext_sys_cd());
				
				// 売上実績明細リストに追加
				insSlsActDL.add(insSlsActDR);
			}
			return insSlsActDL;
		}
		
		/**
		 * 債権区分の取得
		 * 
		 * @param dtlR
		 * @return
		 */
		protected String getArTyp(SlsAct_Upd01_DtlR dtlR) {
			
			// 理由ＣＤに該当する業務理由マスタの会計理由ＣＤ、会計理由ＣＤに該当する会計理由マスタの債権区分
			MAM_BIZ_RSN_R bizRsnR = getBizRsn(dtlR.rsn_cd());
			if (!isNull(bizRsnR)) {
				MAM_AC_RSN_R acRsnR = getAcRsn(bizRsnR.ac_rsn_cd());
				if (!isNull(acRsnR) && !isNull(acRsnR.ar_typ())) {
					return acRsnR.ar_typ();
				}
			}

			// 取得できなかった場合、品目に該当する品目マスタの品目仕訳ＣＤ、品目仕訳ＣＤに該当する品目仕訳マスタの債権区分
			MAM_ITM_JNL_R itmJnlR = getItmJnlCache(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
			if (!isNull(itmJnlR) && !isNull(itmJnlR.ar_typ())) {
				return itmJnlR.ar_typ();
			}
			
			// それでも取得できなかった場合、「売掛金」固定値
			return MAC_AR_TYP.AR.value();
		}
		
		/**
		 * 案件ＮＯの取得
		 * 
		 * @param dtlR
		 * @return
		 */
		protected String getWrkNo(SlsAct_Upd01_DtlR dtlR) {
			if (isNullOrNullVal(dtlR.sno1())) {
				return null;
			}
			MST_WRK_SNO_R wrkSnoR = MST_WRK_SNO_R.create("T");
			MCQueryApiBuilder wrkSnoR_bldr = MCQueryApiBuilder.create(wrkSnoR);
			wrkSnoR_bldr.setWhere(wrkSnoR.sno1.eq(bind("1")), dtlR.sno1());
			dbSelect("MSBBL6010_MST_WRK_SNO_S01", wrkSnoR, wrkSnoR_bldr);
			return wrkSnoR.wrk_no();
		}
		
		/**
		 * 売上実績ヘッダの登録情報作成
		 * 
		 * @param hdrR
		 * @param canFlg 取消データの場合true
		 * @return
		 */
		protected MST_SLS_ACT_R crtInsSlsAct(SlsAct_Upd01_HdrR hdrR, boolean canFlg) {
			MST_SLS_ACT_R insSlsActR = MST_SLS_ACT_R.create();
			insSlsActR.sls_act_no(hdrR.sls_act_no());
			insSlsActR.sls_act_seq(hdrR.sls_act_seq());
			insSlsActR.sls_act_rev(hdrR.sls_act_rev());
			insSlsActR.trd_cd(hdrR.trd_cd());
			insSlsActR.trd_ptn_typ(hdrR.trd_ptn_typ());
			insSlsActR.ac_ym(getAcYm(hdrR.ac_dt()));
			insSlsActR.ac_dt(hdrR.ac_dt());
			insSlsActR.sls_dpt_cd(hdrR.sls_dpt_cd());
			insSlsActR.wg_cd(hdrR.wg_cd());
			insSlsActR.sls_usr_cd(hdrR.sls_usr_cd());
			insSlsActR.sls_dt(hdrR.sls_dt());
			insSlsActR.ship_tm(hdrR.ship_tm());
			insSlsActR.dlv_tm(hdrR.dlv_tm());
			insSlsActR.cst_cd(hdrR.cst_cd());
			insSlsActR.iv_no(hdrR.iv_no());
			insSlsActR.ref_iv_no(hdrR.ref_iv_no());
			insSlsActR.rcpt_iv_no(hdrR.rcpt_iv_no());
			insSlsActR.tterm_cd1(hdrR.tterm_cd1());
			insSlsActR.tterm_rmrks1(hdrR.tterm_rmrks1());
			insSlsActR.tterm_cd2(hdrR.tterm_cd2());
			insSlsActR.tterm_rmrks2(hdrR.tterm_rmrks2());
			insSlsActR.tterm_cd3(hdrR.tterm_cd3());
			insSlsActR.tterm_rmrks3(hdrR.tterm_rmrks3());
			insSlsActR.lc_no(hdrR.lc_no());
			insSlsActR.lc_dt(hdrR.lc_dt());
			insSlsActR.lc_rmrks(hdrR.lc_rmrks());
			insSlsActR.rcv_schd_dt(hdrR.rcv_schd_dt());
			if (isNull(hdrR.bill_basis_dt()) || MAC_BILL_CL_TYP.isEACH_SLS(hdrR.bill_cl_typ())) {
				insSlsActR.bill_basis_dt(hdrR.ac_dt());
			}
			else {
				insSlsActR.bill_basis_dt(hdrR.bill_basis_dt());
			}
			insSlsActR.cred_cd(hdrR.cred_cd());
			insSlsActR.bcst_cd(hdrR.bcst_cd());
			insSlsActR.acst_cd(hdrR.acst_cd());
			insSlsActR.ar_dpt_cd(hdrR.ar_dpt_cd());
			insSlsActR.cst_po_no(hdrR.cst_po_no());
			insSlsActR.trd_cur_cd(hdrR.trd_cur_cd());
			insSlsActR.base_cur_cd(hdrR.base_cur_cd());
			insSlsActR.xrate_cd(hdrR.xrate_cd());
			insSlsActR.xrate(hdrR.xrate());
			insSlsActR.ptax_cur_cd(hdrR.ptax_cur_cd());
			insSlsActR.ptax_xrate(hdrR.ptax_xrate());
			insSlsActR.trd_cur_amt(hdrR.trd_cur_amt());
			insSlsActR.trd_cur_tax_amt(hdrR.trd_cur_tax_amt());
			insSlsActR.base_cur_amt(hdrR.base_cur_amt());
			insSlsActR.base_cur_tax_amt(hdrR.base_cur_tax_amt());
			insSlsActR.trd_rmrks(hdrR.trd_rmrks());
			insSlsActR.intr_rmrks(hdrR.intr_rmrks());
			insSlsActR.ship_act_no(hdrR.ship_act_no());
			insSlsActR.slo_no(hdrR.slo_no());
			insSlsActR.sls_ret_schd_no(hdrR.sls_ret_schd_no());
			insSlsActR.qtn_no(hdrR.qtn_no());
			insSlsActR.qtn_rev(hdrR.qtn_rev());
			if (hdrR.ship_act_service_via_flg() && !isNull(hdrR.bef_dlv_slip_no())) {
				insSlsActR.dlv_slip_no(hdrR.bef_dlv_slip_no());
			}
			else {
				insSlsActR.dlv_slip_no(hdrR.dlv_slip_no());
			}
			// 出荷帳票発行サービス実行後に再設定する
			insSlsActR.dlv_slip_seq(hdrR.dlv_slip_seq());
			insSlsActR.ship_dlv_slip_no(hdrR.ship_dlv_slip_no());
			insSlsActR.slip_form_cd(hdrR.slip_form_cd());
			insSlsActR.aprv_flg(hdrR.aprv_flg());
			insSlsActR.aprv_no(hdrR.aprv_no());
			insSlsActR.aprv_sts_typ(hdrR.aprv_sts_typ());
			insSlsActR.sls_basis_typ(hdrR.sls_basis_typ());
			insSlsActR.adjst_tgt_dt(hdrR.adjst_tgt_dt());
			insSlsActR.sls_adjst_typ(hdrR.sls_adjst_typ());
			insSlsActR.adjst_mtd_typ(hdrR.adjst_mtd_typ());
			insSlsActR.sub_char1(hdrR.sub_char1());
			insSlsActR.sub_char2(hdrR.sub_char2());
			insSlsActR.sub_char3(hdrR.sub_char3());
			
			if (canFlg) {
				// 取消データ、金額情報はマイナス値に変換
				insSlsActR.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());
				insSlsActR.trd_cur_amt(hdrR.trd_cur_amt().negate());			// 取引通貨金額
				insSlsActR.trd_cur_tax_amt(hdrR.trd_cur_tax_amt().negate());	// 取引通貨税額
				insSlsActR.base_cur_amt(hdrR.base_cur_amt().negate());			// 基準通貨金額
				insSlsActR.base_cur_tax_amt(hdrR.base_cur_tax_amt().negate());	// 基準通貨税額
				insSlsActR.ship_lg_grp_cd(hdrR.ship_lg_grp_cd());				// 出荷物流グループＣＤ
			}
			else {
				// 新規データ
				insSlsActR.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
				insSlsActR.trd_cur_amt(hdrR.trd_cur_amt());							// 取引通貨金額
				insSlsActR.trd_cur_tax_amt(hdrR.trd_cur_tax_amt());					// 取引通貨税額
				insSlsActR.base_cur_amt(hdrR.base_cur_amt());						// 基準通貨金額
				insSlsActR.base_cur_tax_amt(hdrR.base_cur_tax_amt());				// 基準通貨税額
				insSlsActR.ship_lg_grp_cd(getLgGrpCd(hdrR));						// 出荷物流グループＣＤ
			}
			insSlsActR.ddlv_sls_flg(hdrR.ddlv_sls_flg());
			insSlsActR.ship_act_sync_flg(hdrR.ship_act_sync_flg());
			
			insSlsActR.addNumberColumn(SlsAct_Upd01_HdrR.$new_hdr_peg_no, hdrR.new_hdr_peg_no()); // 出荷実績サービスとの紐付け用
			
			return insSlsActR;
		}
		
		/**
		 * 出荷場所グループＣＤを設定する
		 * @param hdrR
		 * @return
		 */
		protected String getLgGrpCd(SlsAct_Upd01_HdrR hdrR) {
			MCList<SlsAct_Upd01_IoR> ioTgtL = MCList.create(SlsAct_Upd01_IoR.class);
			ioTgtL = getIoData(hdrR.hdr_peg_no());
			if (!isNull(ioTgtL) && ioTgtL.size() > 0) {
				SlsAct_Upd01_IoR ioR = ioTgtL.get(0);
				if (!isNull(ioR.loc_cd())) {
					return getLoc(ioR.loc_cd()).lg_grp_cd();
				}
			}
			return null;
		}
		
		/**
		 * 前処理
		 */
		protected void preProc() {
			_maxLineCnt = (int)Math.pow(10, MST_DLV_SLIP_D_R.dlv_slip_d_no_META.length()) - 1;
			_msgLPreSv = new MCMessageList();
			_msgLPreSv.addAll(MCMessagePool.getMessageList());
			
			// キャッシュ作成
			crtCstCache(up0());
			crtBcstCache(up0());
			crtTrdCache(up0());
			crtSlipFormCache(up0());
			crtDlvCache(up1());
			initItmJnlCache(up1());
			initItmCache(up1());
			editUp0();
			getSlsCstStkFlg();
			editUp1(up1());
			clearDlvSlipNo();
			crtIvDCache();
			crtDlvSlipDCache(up0());
			getBefShipSchdL(up1());
		}
		
		protected void editUp0() {
			
			for (SlsAct_Upd01_HdrR hdrR : up0()) {
				hdrR.bill_cl_typ(getBcstCache(hdrR.bcst_cd()).bill_cl_typ());
				setDdlvSlsFlg(hdrR, up1());
			}
		}
		
		/**
		 * 直送売上ＦＬＧを設定する。
		 * 
		 * @param hdrR
		 * @param dtlL
		 */
		protected void setDdlvSlsFlg(SlsAct_Upd01_HdrR hdrR, MCList<SlsAct_Upd01_DtlR> dtlL) {
			MCList<SlsAct_Upd01_DtlR> dtlTgtL = getDtlData(dtlL, hdrR.hdr_peg_no(), SlsAct_Upd01_DtlR.$hdr_peg_no);
			if (!isNull(dtlTgtL)) {
				for (SlsAct_Upd01_DtlR dtlR : dtlTgtL) {
					if (!isNull(dtlR.purc_ddlv_po_no())) {
						hdrR.ddlv_sls_flg(true);
						break;
					}
				}
			}
		}
		/**
		 * 納品書ＮＯをクリアする
		 */
		protected void clearDlvSlipNo() {
			// 出荷または仕入直送の発注で発番した納品書ＮＯを引き継げない場合、引き継がれないように納品書ＮＯをクリアする
			// 当該処理でクリアされなくても後続の分割処理でクリアされる場合もある
			
			MCList<SlsAct_Upd01_HdrR> tgtHdrL = MCList.create(SlsAct_Upd01_HdrR.class);
			MCList<SlsAct_Upd01_DtlR> tgtDtlL = MCList.create(SlsAct_Upd01_DtlR.class);
			MCJoinKey<MCList<SlsAct_Upd01_DtlR>> jk =
					up0().join(SlsAct_Upd01_HdrR.$hdr_peg_no, up1(), SlsAct_Upd01_DtlR.$hdr_peg_no);
			
			for (SlsAct_Upd01_HdrR hdrR : up0()) {
				MAM_BP_R cstR = getCstCache(hdrR.cst_cd());
				if (!hdrR.ship_act_service_via_flg()
					&& MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())
					&& MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())
					&& !cstR.cst_iv_flg()
					&& (!hdrR.ddlv_sls_flg()
							&& (MAC_SLS_BASIS_TYP.isIN_BASIS(hdrR.sls_basis_typ())
								|| MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(hdrR.sls_basis_typ()))
							&& !isNullOr(hdrR.dlv_slip_no(), hdrR.ship_dlv_slip_no())
							&& isSame(hdrR.dlv_slip_no(), hdrR.ship_dlv_slip_no())
						|| hdrR.ddlv_sls_flg()
							&& !isNullOr(hdrR.dlv_slip_no(), hdrR.purc_ddlv_dlv_slip_no())
							&& isSame(hdrR.dlv_slip_no(), hdrR.purc_ddlv_dlv_slip_no()))) {
					// 納品書ＮＯを引き継ぐ候補
					tgtHdrL.add(hdrR);
					tgtDtlL.addAll(hdrR.getJoined(jk));
				}
			}
			if (tgtHdrL.isEmpty()) {
				return;
			}
			
			MST_SLS_ACT_R t1 = MST_SLS_ACT_R.create("T1");
			MST_SLS_ACT_D_R t2 = MST_SLS_ACT_D_R.create("T2");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setDistinct();
			bldr.setSelect(t1.sls_act_no, t1.dlv_slip_no, t2.dlv_slip_d_no);
			bldr.addInnerJoin(t2, t2.sls_act_no.eq(t1.sls_act_no).and(t2.sls_act_seq.eq(t1.sls_act_seq)));
			bldr.setWhere(t1.dlv_slip_no.eq(bind("dlv_slip_no")));
			bldr.addConstWhereWithAnd(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			
			MCList<MST_SLS_ACT_R> actL = MCList.create(MST_SLS_ACT_R.class);
			dbSelect("MSBBL6010_MST_SLS_ACT_S06",
				actL, bldr, tgtHdrL.groupBy(SlsAct_Upd01_HdrR.$dlv_slip_no));
			
			clearDlvSlipNo(tgtHdrL, actL);
			clearDlvSlipDNo(tgtDtlL, actL);
		}
		protected void clearDlvSlipNo(MCList<SlsAct_Upd01_HdrR> tgtHdrL, MCList<MST_SLS_ACT_R> actL) {
			MCIndexKey saIdx = actL.createIndex(MST_SLS_ACT_R.$dlv_slip_no);
			MCIndexKey hdrIdx = tgtHdrL.createIndex(SlsAct_Upd01_HdrR.$dlv_slip_no);
			MCIndexKey dtlIdx = up1().createIndex(SlsAct_Upd01_DtlR.$hdr_peg_no);
			
			for (MCList<SlsAct_Upd01_HdrR> l :
				tgtHdrL.groupList(SlsAct_Upd01_HdrR.$dlv_slip_no, SlsAct_Upd01_HdrR.$hdr_peg_no)) {
				
				SlsAct_Upd01_HdrR r = l.get(0);
				MCNumber hPegNo =
					(MCNumber)tgtHdrL
						.subList(hdrIdx, r.dlv_slip_no())
						.min(ShipAct_DtlR.$hdr_peg_no);
				
				// 以下のいずれかに該当する場合、納品書ＮＯは引き継がないで再発番する
				// ・同じ納品書ＮＯが売上済みか
				// ・同じ納品書ＮＯの売上対象がヘッダ違いで複数ある
				if (!isNull(actL.getFirst(saIdx, r.dlv_slip_no()))
					|| !isSame(r.hdr_peg_no(), hPegNo)) {
					l.forEach(rr -> {
						rr.dlv_slip_no(null);
						up1().subList(dtlIdx, rr.hdr_peg_no())
							.setString(SlsAct_Upd01_DtlR.$dlv_slip_d_no, null);
					});
				}
			}
		}
		protected void clearDlvSlipDNo(MCList<SlsAct_Upd01_DtlR> tgtDtlL, MCList<MST_SLS_ACT_R> actL) {
			MCIndexKey saIdx = actL.createIndex(MST_SLS_ACT_D_R.$dlv_slip_d_no);
			java.util.Set<String> noSet = new java.util.HashSet<>();
			
			tgtDtlL.sort(SlsAct_Upd01_DtlR.$hdr_peg_no, SlsAct_Upd01_DtlR.$dtl_peg_no);
			for (SlsAct_Upd01_DtlR r : tgtDtlL) {
				if (!isNull(r.dlv_slip_d_no())) {
					// 以下のいずれかに該当する場合、納品書明細ＮＯは引き継がないで再発番する
					// ・同じ納品書明細ＮＯが売上済みか
					// ・同じ納品書明細ＮＯが複数ある
					if (!isNull(actL.getFirst(saIdx, r.dlv_slip_d_no()))
						|| noSet.contains(r.dlv_slip_d_no())) {
						r.dlv_slip_d_no(null);
					}
					else {
						noSet.add(r.dlv_slip_d_no());
					}
				}
			}
		}
		/**
		 * 出荷の納品書ＮＯを引き継いでいるか判定する
		 */
		protected boolean isShipDlvSlipCopy(SlsAct_Upd01_HdrR hdrR) {
			return
				!isNullOr(hdrR.dlv_slip_no(), hdrR.ship_dlv_slip_no())
				 && isSame(hdrR.dlv_slip_no(), hdrR.ship_dlv_slip_no());
		}
		/**
		 * 仕入直送で納品書を引き継いでいるか判定する
		 */
		protected boolean isDDlvDlvSlipCopy(SlsAct_Upd01_HdrR hdrR) {
			return
				hdrR.ddlv_sls_flg()
				 && !isNullOr(hdrR.dlv_slip_no(), hdrR.purc_ddlv_dlv_slip_no())
				 && isSame(hdrR.dlv_slip_no(), hdrR.purc_ddlv_dlv_slip_no());
		}
		
		/**
		 * 預り売上ＦＬＧ取得
		 */
		protected void getSlsCstStkFlg() {
			// 受注明細ワーク登録
			crtSloDWk();
			
			// 受注明細ワークと結合し受注明細の預り売上ＦＬＧを取得
			MST_SLO_D_R sloDL_t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(sloDL_t);
			MSW_SLO_D_KEY_R w1 = MSW_SLO_D_KEY_R.create("W1");
			sloDL_bldr.setSelect(sloDL_t.slo_d_no,sloDL_t.sls_cststk_flg);
			sloDL_bldr.addSelect(
				sloDL_t.base_unit_qty,
				sloDL_t.trd_cur_amt, sloDL_t.trd_cur_tax_amt, sloDL_t.trd_cur_dscnt_amt,
				sloDL_t.tax_cd
			);
			sloDL_bldr.addInnerJoin(w1, bracket( w1.slo_d_no.eq(sloDL_t.slo_d_no)));
			dbSelect("MSBBL6010_MST_SLO_D_S01", _sloDL, sloDL_bldr);
			_sloDKey = _sloDL.createIndex(MST_SLO_D_R.$slo_d_no);
		}
		
		/**
		 * 受注明細ワークテーブル登録
		 */
		protected void crtSloDWk() {
			MCList<MST_SLO_D_R> insL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R insR = null;
			
			for (SlsAct_Upd01_DtlR dtlR : up1().groupBy(SlsAct_Upd01_DtlR.$slo_d_no)) {
				insR = MST_SLO_D_R.create();
				insR.slo_d_no(dtlR.slo_d_no());
				insL.add(insR);
			}
			MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
			dbWkDelete("MSBBL6010_MSW_SLO_D_D01", insL_bldr.getBaseDbc());
			dbWkInsert("MSBBL6010_MSW_SLO_D_I01", insL, insL_bldr.getBaseDbc());
		}
		
		protected void editUp1(MCList<SlsAct_Upd01_DtlR> up1) {
			_up0IdxKey = up0().createIndex(SlsAct_Upd01_HdrR.$hdr_peg_no);
			for (SlsAct_Upd01_DtlR dtlR : up1) {
				dtlR.bef_sls_act_d_no(dtlR.sls_act_d_no());
				if (isSlsCstk(dtlR)) {
					dtlR.sls_cststk_flg(true);
				}
				dtlR.ddlv_iv_grp_flg(getDdlvIvGrp(dtlR));
				dtlR.dscnt_itm_flg(getDscntItmFlg(dtlR));
			}
		}
		
		/**
		 * 値引品目FLGの取得
		 * 
		 * @param dtlR
		 * @return
		 */
		protected boolean getDscntItmFlg(SlsAct_Upd01_DtlR dtlR) {
			MAM_ITM_R itmR = getItmCache(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
			if (!isNull(itmR)) {
				return itmR.dscnt_itm_flg();
			}
			return false;
		}
		
		/**
		 * 売上実績データ編集処理
		 */
		protected void makeSlsData() {
			
			up0().sort(SlsAct_Upd01_HdrR.$hdr_peg_no);
			MCList<SlsAct_Upd01_DtlR> dtlTgtL = MCList.create(SlsAct_Upd01_DtlR.class);
			MCList<SlsAct_Upd01_IoR> ioTgtL = MCList.create(SlsAct_Upd01_IoR.class);
						
			// ヘッダ単位に処理対象を取得し、分割処理を行う
			for (SlsAct_Upd01_HdrR hdrR : up0()) {
				// 処理対象ヘッダに紐づく明細情報を取得
				dtlTgtL = getDtlData(up1(), hdrR.hdr_peg_no(), SlsAct_Upd01_DtlR.$hdr_peg_no);
				// 処理対象ヘッダに紐づく詳細情報を取得
				ioTgtL = getIoData(hdrR.hdr_peg_no());
				// インボイスの明細データ補完
				MAM_BP_R bpR = getCstCache(hdrR.cst_cd());
				if (bpR.cst_iv_flg()) {
					makeDtlData(dtlTgtL, hdrR, bpR);
				}
				// 伝票分割処理
				split(hdrR, dtlTgtL, ioTgtL);
			}
			// 仕入直送売上チェック
			chkDdlvSls();
			
			// ＮＯ発番処理
			setSeqNo();
			
			// 金額計算処理
			setAmt();
		}
		protected void makeDtlData(MCList<SlsAct_Upd01_DtlR> dtlTgtL, SlsAct_Upd01_HdrR hdrR, MAM_BP_R bpR) {
			for (SlsAct_Upd01_DtlR r : dtlTgtL) {
				if (isNull(r.trd_cur_amt())) {
					MST_IV_D_R ivDR = _ivDL.getFirst(_ivDIdxKey, r.iv_d_no());
					if (!isNull(ivDR)) {
						r.trd_cur_amt(ivDR.trd_cur_amt());
						r.trd_cur_tax_amt(ivDR.trd_cur_tax_amt());
					}
					else {
						MAM_CUR_R trdCurR = getCur(hdrR.trd_cur_cd());
						hdrR.trd_cur_amt_dec_place(trdCurR.amt_dec_place());
						hdrR.amt_rnd_typ(bpR.sls_amt_rnd_typ());
						hdrR.tax_rnd_typ(bpR.sls_tax_rnd_typ());
						
						MCRow amtR = MAUCL_AmtUtil.getAmtAndTax(
								r.trd_cur_upri(),
								r.trd_unit_qty(),
								r.tax_rate(),
								r.inc_tax_flg(),
								hdrR.trd_cur_amt_dec_place(),
								hdrR.amt_rnd_typ(),
								hdrR.tax_rnd_typ(),
								r.trd_cur_dscnt_amt());
						r.trd_cur_amt(amtR.getNumber("amt"));
						r.trd_cur_tax_amt(amtR.getNumber("tax_amt"));
					}
				}
			}
		}
		
		/**
		 * インボイス単位税計算処理を呼ぶか判定する
		 */
		protected boolean isIvTaxCalcTgt (SlsAct_Upd01_HdrR hdrR, MCList<SlsAct_Upd01_DtlR> dtlL) {
			if (isSlsDscntXtra(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_RTN(hdrR.trd_ptn_typ())
					|| hdrR.iv_service_exec_flg()) {
				
				// 訂正時に税調整に関係ない項目を変更した場合はインボイス単位税計算処理を呼ばない
				boolean ivTaxCalcFlg = isPropCtaxTgt(hdrR, dtlL);
				return ivTaxCalcFlg;
			}
			else {
				return false;
			}
		}
		
		/**
		 * インボイス取引かつ税計算区分が伝票単位の場合
		 * 売上値引/値増/返品と計画外売上に対してインボイス単位税計算を行う
		 * ここでインボイス単位税計算された場合は、伝票分割後の税調整は行わない
		 */
		protected void callAmtUtilCalc01(SlsAct_Upd01_HdrR hdrR, MCList<SlsAct_Upd01_DtlR> dtlTgtL) {
				MSUCL_AmtUtil.AmtUtil_Calc01  ope = MSUCL_AmtUtil.crtAmtUtil_Calc01();
				copy(ope.up0(), hdrR, createMap_AmtUtil_Calc01_HdrR_SlsAct_Upd01_HdrR());
				setPegNo(dtlTgtL);
				setAll(ope.up1(), dtlTgtL, createMap_AmtUtil_Calc01_DtlR_SlsAct_Upd01_DtlR());
				ope.exec();
				
				String[] destCols = {SlsAct_Upd01_DtlR.$trd_cur_amt, SlsAct_Upd01_DtlR.$trd_cur_tax_amt,
						SlsAct_Upd01_DtlR.$ptax_cur_amt, SlsAct_Upd01_DtlR.$iv_amt, SlsAct_Upd01_DtlR.$wtax_amt};
				String[] srcCols = {AmtUtil_Calc01_DtlR.$trd_cur_amt, AmtUtil_Calc01_DtlR.$trd_cur_tax_amt,
						AmtUtil_Calc01_DtlR.$ptax_cur_amt, AmtUtil_Calc01_DtlR.$iv_amt, AmtUtil_Calc01_DtlR.$wtax_amt};
				copyByPegNo(dtlTgtL, destCols, ope.down0(), srcCols);
		}
		
		protected Map_AmtUtil_Calc01_HdrR_SlsAct_Upd01_HdrR<AmtUtil_Calc01_HdrR,SlsAct_Upd01_HdrR> createMap_AmtUtil_Calc01_HdrR_SlsAct_Upd01_HdrR() {
			return new Map_AmtUtil_Calc01_HdrR_SlsAct_Upd01_HdrR<AmtUtil_Calc01_HdrR, SlsAct_Upd01_HdrR>();
		}
		
		public class Map_AmtUtil_Calc01_HdrR_SlsAct_Upd01_HdrR<D extends AmtUtil_Calc01_HdrR, S extends SlsAct_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(AmtUtil_Calc01_HdrR.$trd_cur_cd, SlsAct_Upd01_HdrR.$trd_cur_cd);
				addColumnPathMap(AmtUtil_Calc01_HdrR.$amt_dec_place, SlsAct_Upd01_HdrR.$trd_cur_amt_dec_place);
				addColumnPathMap(AmtUtil_Calc01_HdrR.$tax_rnd_typ, SlsAct_Upd01_HdrR.$tax_rnd_typ);
				addColumnPathMap(AmtUtil_Calc01_HdrR.$ptax_xrate, SlsAct_Upd01_HdrR.$ptax_xrate);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (isNull(dest.amt_dec_place())) {
					MAM_CUR_R trdCurR = getCur(src.trd_cur_cd());
					dest.amt_dec_place(trdCurR.amt_dec_place());
				}
				if (isNull(dest.tax_rnd_typ())) {
					dest.tax_rnd_typ(getCstCache(src.cst_cd()).sls_tax_rnd_typ());
				}
			}
		}
		
		protected Map_AmtUtil_Calc01_DtlR_SlsAct_Upd01_DtlR<AmtUtil_Calc01_DtlR,SlsAct_Upd01_DtlR> createMap_AmtUtil_Calc01_DtlR_SlsAct_Upd01_DtlR() {
			return new Map_AmtUtil_Calc01_DtlR_SlsAct_Upd01_DtlR<AmtUtil_Calc01_DtlR, SlsAct_Upd01_DtlR>();
		}
		public class Map_AmtUtil_Calc01_DtlR_SlsAct_Upd01_DtlR<D extends AmtUtil_Calc01_DtlR, S extends SlsAct_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(AmtUtil_Calc01_DtlR.$tax_rate, SlsAct_Upd01_DtlR.$tax_rate);
				addColumnPathMap(AmtUtil_Calc01_DtlR.$inc_tax_flg, SlsAct_Upd01_DtlR.$inc_tax_flg);
				addColumnPathMap(AmtUtil_Calc01_DtlR.$dscnt_itm_flg, SlsAct_Upd01_DtlR.$dscnt_itm_flg);
				addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_upri, SlsAct_Upd01_DtlR.$trd_cur_upri);
				addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_amt, SlsAct_Upd01_DtlR.$trd_cur_amt);
				addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_tax_amt, SlsAct_Upd01_DtlR.$trd_cur_tax_amt);
				addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_dscnt_amt, SlsAct_Upd01_DtlR.$trd_cur_dscnt_amt);
				addColumnPathMap(AmtUtil_Calc01_DtlR.$ptax_cur_amt, SlsAct_Upd01_DtlR.$ptax_cur_amt);
				addColumnPathMap(AmtUtil_Calc01_DtlR.$iv_amt, SlsAct_Upd01_DtlR.$iv_amt);
				addColumnPathMap(AmtUtil_Calc01_DtlR.$wtax_rate, SlsAct_Upd01_DtlR.$wtax_rate);
				addColumnPathMap(AmtUtil_Calc01_DtlR.$wtax_amt, SlsAct_Upd01_DtlR.$wtax_amt);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.peg_no(src.getNumberNE("peg_no"));
			}
		}
		
		protected void setAmt() {
			MCList<SlsAct_Upd01_DtlR> dtlTgtL = MCList.create(SlsAct_Upd01_DtlR.class);

			for (SlsAct_Upd01_HdrR hdrR : _hdrL) {
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					continue;
				}
				// 新ヘッダ紐付きＮＯに紐づく明細情報を取得
				dtlTgtL = getDtlData(_dtlL, hdrR.new_hdr_peg_no(), SlsAct_Upd01_DtlR.$new_hdr_peg_no);
				
				// 売上税計算区分に応じた税額計算
				// 「伝票単位」の場合
				if (MAC_TAX_CALC_TYP.isSLIP(getCstCache(hdrR.cst_cd()).sls_tax_calc_typ())) {
					if (getCstCache(hdrR.cst_cd()).cst_iv_flg()) {
						if (isIvTaxCalcTgt(hdrR, dtlTgtL)) {
							callAmtUtilCalc01(hdrR, dtlTgtL);
						}
						// 伝票単位のインボイス取引の場合、インボイス単位で税調整済みのため伝票単位で税調整不要
						up0().get(0).amt_calc_flg(true);
						calcAmtPerLine(hdrR, dtlTgtL);
					}
					else {
						calcAmtPerSlip(hdrR, dtlTgtL);
					}
				}
				// 「行単位」の場合
				else {
					calcAmtPerLine(hdrR, dtlTgtL);
				}
			}
		}
		
		/**
		 * 伝票単位で金額計算を行う
		 * 
		 * @param hdrR
		 * @param dtlL
		 */
		protected void calcAmtPerSlip(SlsAct_Upd01_HdrR hdrR, MCList<SlsAct_Upd01_DtlR> dtlL) {
			MCNumber taxRate = dtlL.get(0).tax_rate();
			
			// 取引通貨の金額小数部有効桁数
			MAM_CUR_R trdCurR = getCur(hdrR.trd_cur_cd());
			
			hdrR.trd_cur_amt_dec_place(trdCurR.amt_dec_place());	// 取引通貨金額端数処理区分
			hdrR.trd_cur_upri_dec_place(trdCurR.upri_dec_place());	// 取引通貨単価端数処理区分
			
			hdrR.xrate_rnd_typ(getCo().xrate_rnd_typ());	// 為替端数処理区分
			hdrR.amt_rnd_typ(getCstCache(hdrR.cst_cd()).sls_amt_rnd_typ());	// 金額端数処理区分
			hdrR.tax_rnd_typ(getCstCache(hdrR.cst_cd()).sls_tax_rnd_typ());	// 税端数処理区分
			
			// 基準通貨の単価小数部有効桁数、金額小数部有効桁数
			hdrR.base_cur_upri_dec_place(getBaseCur().upri_dec_place());
			hdrR.base_cur_amt_dec_place(getBaseCur().amt_dec_place());
			
			// 納税通貨の単価小数部有効桁数、金額小数部有効桁数
			hdrR.ptax_cur_upri_dec_place(getPtaxCur().upri_dec_place());
			hdrR.ptax_cur_amt_dec_place(getPtaxCur().amt_dec_place());
			
			// 源泉税額計算実施ＦＬＧ
			boolean wtaxCalcFlg = false;
			String wtaxRndTyp = getCo().wtax_rnd_typ();
			// 取引通貨＝基準通貨＝納税通貨または取引通貨＝基準通貨かつ納税通貨NULLの場合源泉税額計算を行う
			if ((isSame(hdrR.trd_cur_cd(), hdrR.base_cur_cd()) && 
				isSame(hdrR.trd_cur_cd(), hdrR.ptax_cur_cd())) ||
				(isSame(hdrR.trd_cur_cd(), hdrR.base_cur_cd()) && 
				isNull(hdrR.ptax_cur_cd()))) {
				wtaxCalcFlg = true;
			}
			
			
			// 明細ごとの計算
			for (SlsAct_Upd01_DtlR dtlR : dtlL) {
				
				// 取引通貨金額が指定されている場合は取得しない
				if (isNull(dtlR.trd_cur_amt())) {
					MCRow amtR = getAmtAndTax(hdrR, dtlR);
					
					dtlR.trd_cur_amt(amtR.getNumber("amt"));
					dtlR.trd_cur_tax_amt(amtR.getNumber("tax_amt"));
					
					if (dtlR.inc_tax_flg()) {
						// 内税の場合の金額再計算のために保持
						dtlR.setNumberNE("inc_tax_amt", amtR.getNumber("inc_tax_amt"));
					}
				}
				else {
					if (dtlR.inc_tax_flg()) {
						dtlR.setNumberNE("inc_tax_amt", dtlR.trd_cur_amt().add(dtlR.trd_cur_tax_amt()));
					}
				}
				if (up0().get(0).amt_calc_flg()) {
					// 基準通貨換算
					dtlR.base_cur_upri(convToBaseCur(
							dtlR.trd_cur_upri(),
							hdrR.xrate(),
							hdrR.base_cur_upri_dec_place(),
							hdrR.xrate_rnd_typ()));
					dtlR.base_cur_amt(convToBaseCur(
							dtlR.trd_cur_amt(),
							hdrR.xrate(),
							hdrR.base_cur_amt_dec_place(),
							hdrR.xrate_rnd_typ()));
					dtlR.base_cur_tax_amt(convToBaseCur(
							dtlR.trd_cur_tax_amt(),
							hdrR.xrate(),
							hdrR.base_cur_amt_dec_place(),
							hdrR.xrate_rnd_typ()));
					dtlR.base_cur_dscnt_amt(convToBaseCur(
							dtlR.trd_cur_dscnt_amt(),
							hdrR.xrate(),
							hdrR.base_cur_amt_dec_place(),
							hdrR.xrate_rnd_typ()));
					
					// 納税通貨換算
					if (!isNull(hdrR.ptax_cur_cd())) { 
						dtlR.ptax_cur_upri(convCur(
								dtlR.trd_cur_upri(),
								hdrR.ptax_xrate(),
								hdrR.ptax_cur_upri_dec_place(),
								hdrR.xrate_rnd_typ()));
						dtlR.ptax_cur_amt(convCur(
								dtlR.trd_cur_amt(),
								hdrR.ptax_xrate(),
								hdrR.ptax_cur_amt_dec_place(),
								hdrR.xrate_rnd_typ()));
						dtlR.ptax_cur_tax_amt(convCur(
								dtlR.trd_cur_tax_amt(),
								hdrR.ptax_xrate(),
								hdrR.ptax_cur_amt_dec_place(),
								hdrR.xrate_rnd_typ()));
						dtlR.ptax_cur_dscnt_amt(convCur(
								dtlR.trd_cur_dscnt_amt(),
								hdrR.ptax_xrate(),
								hdrR.ptax_cur_amt_dec_place(),
								hdrR.xrate_rnd_typ()));
					}
				}
				// 源泉税額の計算
				if (wtaxCalcFlg) {
					if (!isNull(dtlR.wtax_rate())) {
						dtlR.wtax_amt(dtlR.trd_cur_amt().multiply(dtlR.wtax_rate())
								.divide(
										100,
										hdrR.trd_cur_amt_dec_place().intValue(),
										MAC_RND_TYP.toMC(wtaxRndTyp)));
					}
				}
				else {
					// 源泉税額の計算対象外はクリア
					dtlR.wtax_rate(null);
					dtlR.wtax_amt(null);
				}
			}
			
			// 明細の積上げを設定
			hdrR.trd_cur_amt(MCNumber.ZERO);
			hdrR.trd_cur_tax_amt(MCNumber.ZERO);
			for (SlsAct_Upd01_DtlR dtlR : dtlL) {
				// 値引品目の場合は減算（値引・値増を除く）
				if (dtlR.dscnt_itm_flg() && 
					!isSlsDscntXtra(hdrR.trd_ptn_typ())) {
					hdrR.trd_cur_amt(hdrR.trd_cur_amt().subtract(dtlR.trd_cur_amt()));
					hdrR.trd_cur_tax_amt(hdrR.trd_cur_tax_amt().subtract(dtlR.trd_cur_tax_amt()));
				}
				else {
					hdrR.trd_cur_amt(hdrR.trd_cur_amt().add(dtlR.trd_cur_amt()));
					hdrR.trd_cur_tax_amt(hdrR.trd_cur_tax_amt().add(dtlR.trd_cur_tax_amt()));
				}
			}
			if (isPropCtaxTgt(hdrR, dtlL)) {
				MCList<SlsAct_Upd01_DtlR> taxAmtL = crtGetTaxAmtL(hdrR, dtlL);
				MCNumber ttlTaxAmt = MSUCL_AmtUtil.getTaxAmtBySlip(taxAmtL,
						hdrR.tax_rnd_typ(), trdCurR.amt_dec_place(), taxRate, null);
				hdrR.trd_cur_amt(taxAmtL.sum("amt"));
				hdrR.trd_cur_tax_amt(ttlTaxAmt);
				
				// 税額の案分処理
				propCtax(hdrR, dtlL);
			}
			
			for (SlsAct_Upd01_DtlR dtlR : dtlL) {
				// 詳細の単価金額設定（上段：明細から下段：詳細へ単価・金額を算出）
				setIoAmt(hdrR, dtlR);
			}
			
			hdrR.base_cur_amt(MCNumber.ZERO);
			hdrR.base_cur_tax_amt(MCNumber.ZERO);
			for (SlsAct_Upd01_DtlR dtlR : dtlL) {
				if (dtlR.dscnt_itm_flg() && 
					!isSlsDscntXtra(hdrR.trd_ptn_typ())) {
					hdrR.base_cur_amt(hdrR.base_cur_amt().subtract(dtlR.base_cur_amt()));
					hdrR.base_cur_tax_amt(hdrR.base_cur_tax_amt().subtract(dtlR.base_cur_tax_amt()));
				}
				else {
					hdrR.base_cur_amt(hdrR.base_cur_amt().add(dtlR.base_cur_amt()));
					hdrR.base_cur_tax_amt(hdrR.base_cur_tax_amt().add(dtlR.base_cur_tax_amt()));
				}
			}
		}
		
		protected String[] _dlvSlipDCols;
		protected String[] getDlvSlipDCols() {
			if (_dlvSlipDCols == null) {
				_dlvSlipDCols = new String[]{
						MST_DLV_SLIP_D_R.$dlv_slip_d_no,
						MST_DLV_SLIP_D_R.$trd_unit_qty,
						MST_DLV_SLIP_D_R.$trd_unit_cd,
						MST_DLV_SLIP_D_R.$trd_cur_upri,
						MST_DLV_SLIP_D_R.$trd_cur_amt,
						MST_DLV_SLIP_D_R.$trd_cur_tax_amt,
						MST_DLV_SLIP_D_R.$trd_cur_dscnt_amt
				};
			}
			return _dlvSlipDCols;
		}
		
		protected boolean isPropCtaxTgt(SlsAct_Upd01_HdrR hdrR, MCList<SlsAct_Upd01_DtlR> dtlL) {
			String dlvSlipNo = null;
			if (!isNull(_dlvSlipNo)) {
				dlvSlipNo = _dlvSlipNo;
			}
			else if (!isNull(hdrR.dlv_slip_no())) {
				dlvSlipNo = hdrR.dlv_slip_no();
			}
			else {
				dlvSlipNo = hdrR.ship_dlv_slip_no();
			}
			if (isNull(dlvSlipNo) || isNull(_dlvSlipDL)) return true;
			
			MST_DLV_SLIP_D_R dlvSlipDR = _dlvSlipDL.getFirst(_dlvSlipDIdxKey1, dlvSlipNo);
			if (isNull(dlvSlipDR)) return true;
			MCList<MST_DLV_SLIP_D_R> dlvSlipDL = _dlvSlipDL.subList(_dlvSlipDIdxKey2, dlvSlipDR.dlv_slip_no(), dlvSlipDR.dlv_slip_seq());
			
			// 納品書の明細、金額に関連する項目がすべて一致するか
			if (dlvSlipDL.size() != dtlL.size()) return true;
			MCList<MST_DLV_SLIP_D_R> tgtL = MCList.create(MST_DLV_SLIP_D_R.class);
			setAll(tgtL, dtlL, createMap_MST_DLV_SLIP_D_R_SlsAct_Upd01_DtlR());
			
			tgtL.sort(MST_DLV_SLIP_D_R.$dlv_slip_d_no);
			dlvSlipDL.sort(MST_DLV_SLIP_D_R.$dlv_slip_d_no);
			
			if (getTaxCache() == null) {
				initTaxCache(MCList.create(MST_SLS_ACT_D_R.class));
			}
			
			// 値が異なる項目がある場合、税調整対象とする
			for (int i=0; i<tgtL.size(); i++) {
				if (!isColSame(tgtL.get(i), dlvSlipDL.get(i), getDlvSlipDCols())) {
					return true;
				}
				// 税CDではなく税率の一致を確認する
				MAM_TAX_R dlvSlipDTaxR = getTaxCache().get(dlvSlipDL.get(i).getString("tax_cd"));
				if (!isSame(tgtL.get(i).getNumberNE("tax_rate"), dlvSlipDTaxR.tax_rate())
						&& !isSame(tgtL.get(i).getBooleanNE("inc_tax_flg"), dlvSlipDTaxR.inc_tax_flg())) {
					return true;
				}
			}
			return false;
		}
		
		protected Map_MST_DLV_SLIP_D_R_SlsAct_Upd01_DtlR<MST_DLV_SLIP_D_R,SlsAct_Upd01_DtlR> createMap_MST_DLV_SLIP_D_R_SlsAct_Upd01_DtlR() {
			return new Map_MST_DLV_SLIP_D_R_SlsAct_Upd01_DtlR<MST_DLV_SLIP_D_R, SlsAct_Upd01_DtlR>();
		}
		
		public class Map_MST_DLV_SLIP_D_R_SlsAct_Upd01_DtlR<D extends MST_DLV_SLIP_D_R, S extends SlsAct_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_DLV_SLIP_D_R.$trd_unit_qty, SlsAct_Upd01_DtlR.$trd_unit_qty);
				addColumnPathMap(MST_DLV_SLIP_D_R.$trd_unit_cd, SlsAct_Upd01_DtlR.$trd_unit_cd);
				addColumnPathMap(MST_DLV_SLIP_D_R.$trd_cur_upri, SlsAct_Upd01_DtlR.$trd_cur_upri);
				addColumnPathMap(MST_DLV_SLIP_D_R.$trd_cur_amt, SlsAct_Upd01_DtlR.$trd_cur_amt);
				addColumnPathMap(MST_DLV_SLIP_D_R.$trd_cur_tax_amt, SlsAct_Upd01_DtlR.$trd_cur_tax_amt);
				addColumnPathMap(MST_DLV_SLIP_D_R.$trd_cur_dscnt_amt, SlsAct_Upd01_DtlR.$trd_cur_dscnt_amt);
				addColumnPathMap(MST_DLV_SLIP_D_R.$base_cur_upri, SlsAct_Upd01_DtlR.$base_cur_upri);
				addColumnPathMap(MST_DLV_SLIP_D_R.$base_cur_amt, SlsAct_Upd01_DtlR.$base_cur_amt);
				addColumnPathMap(MST_DLV_SLIP_D_R.$base_cur_tax_amt, SlsAct_Upd01_DtlR.$base_cur_tax_amt);
				addColumnPathMap(MST_DLV_SLIP_D_R.$base_cur_dscnt_amt, SlsAct_Upd01_DtlR.$base_cur_dscnt_amt);
				addColumnPathMap(MST_DLV_SLIP_D_R.$tax_cd, SlsAct_Upd01_DtlR.$tax_cd);
				addColumnPathMap("tax_rate", SlsAct_Upd01_DtlR.$tax_rate);
				addColumnPathMap("inc_tax_flg", SlsAct_Upd01_DtlR.$inc_tax_flg);
				addColumnPathMap(MST_DLV_SLIP_D_R.$wtax_rate, SlsAct_Upd01_DtlR.$wtax_rate);
				addColumnPathMap(MST_DLV_SLIP_D_R.$wtax_amt, SlsAct_Upd01_DtlR.$wtax_amt);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				if (!isNull(src.dlv_slip_d_no())) {
					dest.dlv_slip_d_no(src.dlv_slip_d_no());
				}
				else {
					dest.dlv_slip_d_no(src.ship_dlv_slip_d_no());
				}
			}
		}
		
		/**
		 * ヘッダの税を明細の金額を比率にして明細に割り振る
		 * 
		 * @param hdrR
		 * @param dtlL
		 */
		protected void propCtax(SlsAct_Upd01_HdrR hdrR, MCList<SlsAct_Upd01_DtlR> dtlL) {
			MCList<SlsAct_Upd01_DtlR> tmpDtlL = MCList.create(SlsAct_Upd01_DtlR.class);
			
			if (isSlsDscntXtra(hdrR.trd_ptn_typ())) {
				if (!hdrR.trd_cur_tax_amt().isZero()) {
					FXUCC_Divide.prop(
							dtlL,
							hdrR.trd_cur_tax_amt(),
							hdrR.trd_cur_amt_dec_place().intValue(),
							SlsAct_Upd01_DtlR.$trd_cur_amt,
							SlsAct_Upd01_DtlR.$trd_cur_tax_amt);
				}
				for (SlsAct_Upd01_DtlR dtlR : dtlL) {
					// 基準通貨換算
					dtlR.base_cur_tax_amt(convToBaseCur(
						dtlR.trd_cur_tax_amt(),
						hdrR.xrate(),
						hdrR.base_cur_amt_dec_place(),
						hdrR.xrate_rnd_typ()));
					// 納税通貨換算
					if (!isNull(hdrR.ptax_cur_cd())) { 
						dtlR.ptax_cur_tax_amt(convCur(
							dtlR.trd_cur_tax_amt(),
							hdrR.ptax_xrate(),
							hdrR.ptax_cur_amt_dec_place(),
							hdrR.xrate_rnd_typ()));
					}
				}
			}
			else {
				MCNumber addHdrTaxAmt = hdrR.trd_cur_tax_amt();
				for (SlsAct_Upd01_DtlR dtlR : dtlL) {
					// 値引品目は行単位で税額を算出。ただし値引品目は按分対象外。
					if (dtlR.dscnt_itm_flg()) {
						// 取引通貨
						MCRow amtR = MAUCL_AmtUtil.getAmtAndTax(
								dtlR.trd_cur_upri(),			// 取引通貨単価 
								dtlR.trd_unit_qty(), 			// 取引単位数量
								dtlR.tax_rate(), 				// 税率
								dtlR.inc_tax_flg(),				// 内税ＦＬＧ
								hdrR.trd_cur_amt_dec_place(),	// 金額小数部有効桁数（取引通貨）
								hdrR.amt_rnd_typ(),				// 金額端数処理区分
								hdrR.tax_rnd_typ(),				// 税端数処理区分
								dtlR.trd_cur_dscnt_amt());		// 値引額
						
						dtlR.trd_cur_amt(amtR.getNumber("amt"));
						dtlR.trd_cur_tax_amt(amtR.getNumber("tax_amt"));
						
						// 基準通貨換算
						dtlR.base_cur_tax_amt(convToBaseCur(
							dtlR.trd_cur_tax_amt(),
							hdrR.xrate(),
							hdrR.base_cur_amt_dec_place(),
							hdrR.xrate_rnd_typ()));
						// 納税通貨換算
						if (!isNull(hdrR.ptax_cur_cd())) { 
							dtlR.ptax_cur_tax_amt(convCur(
								dtlR.trd_cur_tax_amt(),
								hdrR.ptax_xrate(),
								hdrR.ptax_cur_amt_dec_place(),
								hdrR.xrate_rnd_typ()));
						}
						
						addHdrTaxAmt = addHdrTaxAmt.add(dtlR.trd_cur_tax_amt());
					}
					else {
						SlsAct_Upd01_DtlR tmpDtlR  = SlsAct_Upd01_DtlR.create();
						copy(tmpDtlR, dtlR, createMap_SlsAct_Upd01_DtlR_SlsAct_Upd01_DtlR());
						tmpDtlL.add(tmpDtlR);
					}
				}
				
				if (!addHdrTaxAmt.isZero()) {
					FXUCC_Divide.prop(
							tmpDtlL,
							addHdrTaxAmt,	// 値引品目の税額を加算した値で按分
							hdrR.trd_cur_amt_dec_place().intValue(),
							SlsAct_Upd01_DtlR.$trd_cur_amt,
							SlsAct_Upd01_DtlR.$trd_cur_tax_amt);
				}
				
				for (SlsAct_Upd01_DtlR tmpDtlR : tmpDtlL) {
					for (SlsAct_Upd01_DtlR dtlR : dtlL) {
						if (isSame(tmpDtlR.dtl_peg_no(), dtlR.dtl_peg_no())) {
							dtlR.trd_cur_tax_amt(tmpDtlR.trd_cur_tax_amt());
							if (addHdrTaxAmt.isZero()) {
								dtlR.trd_cur_tax_amt(MCNumber.ZERO);
								dtlR.base_cur_tax_amt(MCNumber.ZERO);
								if (!isNull(hdrR.ptax_cur_cd())) { 
									dtlR.ptax_cur_tax_amt(MCNumber.ZERO);
								}
							}
							else {
								// 基準通貨換算
								dtlR.base_cur_tax_amt(convToBaseCur(
									dtlR.trd_cur_tax_amt(),
									hdrR.xrate(),
									hdrR.base_cur_amt_dec_place(),
									hdrR.xrate_rnd_typ()));
								// 納税通貨換算
								if (!isNull(hdrR.ptax_cur_cd())) { 
									dtlR.ptax_cur_tax_amt(convCur(
										dtlR.trd_cur_tax_amt(),
										hdrR.ptax_xrate(),
										hdrR.ptax_cur_amt_dec_place(),
										hdrR.xrate_rnd_typ()));
								}
							}
							break;
						}
					}
				}
			}
			
			for (SlsAct_Upd01_DtlR dtlR : dtlL) {
				if (dtlR.inc_tax_flg()) {
					dtlR.trd_cur_amt(dtlR.getNumber("inc_tax_amt").subtract(dtlR.trd_cur_tax_amt()));
					// 基準通貨換算
					dtlR.base_cur_amt(convToBaseCur(
							dtlR.trd_cur_amt(),
							hdrR.xrate(),
							hdrR.base_cur_amt_dec_place(),
							hdrR.xrate_rnd_typ()));
					// 納税通貨換算
					if (!isNull(hdrR.ptax_cur_cd())) { 
						dtlR.ptax_cur_amt(convCur(
								dtlR.trd_cur_amt(),
								hdrR.ptax_xrate(),
								hdrR.ptax_cur_amt_dec_place(),
								hdrR.xrate_rnd_typ()));
					}
				}
			}
		}
		
		/**
		 * 税金額取得用の上り電文を作成する
		 */
		protected MCList<SlsAct_Upd01_DtlR> crtGetTaxAmtL(SlsAct_Upd01_HdrR hdrR, MCList<SlsAct_Upd01_DtlR> dtlL) {
			// amt は内税・外税関係なく常に税抜金額
			MCList<SlsAct_Upd01_DtlR> l = dtlL.clone();
			for (SlsAct_Upd01_DtlR r : l) {
				if (r.dscnt_itm_flg() && !isSlsDscntXtra(hdrR.trd_ptn_typ())) {
					r.addNumberColumn("amt", r.trd_cur_amt().negate());
				}
				else {
					r.addNumberColumn("amt", r.trd_cur_amt());
				}
			}
			return l;
		}
		
		/**
		 * 伝票単位のカラム
		 */
		protected String[] _slipCols;
		protected String[] getSlipCols() {
			if (_slipCols == null) {
				_slipCols = new String[]{
					SlsAct_Upd01_DtlR.$dlv_cd,
					SlsAct_Upd01_DtlR.$dlv_sundry_flg,
					SlsAct_Upd01_DtlR.$dlv_nm,
					SlsAct_Upd01_DtlR.$dlv_zip_cd,
					SlsAct_Upd01_DtlR.$dlv_addr1,
					SlsAct_Upd01_DtlR.$dlv_addr2,
					SlsAct_Upd01_DtlR.$dlv_addr3,
					SlsAct_Upd01_DtlR.$dlv_addr4,
					SlsAct_Upd01_DtlR.$dlv_cntct_dpt,
					SlsAct_Upd01_DtlR.$dlv_cntct_psn,
					SlsAct_Upd01_DtlR.$dlv_tel,
					SlsAct_Upd01_DtlR.$dlv_fax,
					SlsAct_Upd01_DtlR.$tax_rate
				};
			}
			return _slipCols;
		}
		
		/**
		 * 行単位のカラム
		 */
		protected String[] _lineCols;
		protected String[] getLineCols() {
			if (_lineCols == null) {
				_lineCols = new String[]{
					SlsAct_Upd01_DtlR.$dlv_cd,
					SlsAct_Upd01_DtlR.$dlv_sundry_flg,
					SlsAct_Upd01_DtlR.$dlv_nm,
					SlsAct_Upd01_DtlR.$dlv_zip_cd,
					SlsAct_Upd01_DtlR.$dlv_addr1,
					SlsAct_Upd01_DtlR.$dlv_addr2,
					SlsAct_Upd01_DtlR.$dlv_addr3,
					SlsAct_Upd01_DtlR.$dlv_addr4,
					SlsAct_Upd01_DtlR.$dlv_cntct_dpt,
					SlsAct_Upd01_DtlR.$dlv_cntct_psn,
					SlsAct_Upd01_DtlR.$dlv_tel,
					SlsAct_Upd01_DtlR.$dlv_fax
				};
			}
			return _lineCols;
		}
		
		protected Map_SlsAct_Upd01_DtlR_SlsAct_Upd01_DtlR<SlsAct_Upd01_DtlR,SlsAct_Upd01_DtlR> createMap_SlsAct_Upd01_DtlR_SlsAct_Upd01_DtlR() {
			return new Map_SlsAct_Upd01_DtlR_SlsAct_Upd01_DtlR<SlsAct_Upd01_DtlR, SlsAct_Upd01_DtlR>();
		}
		
		public class Map_SlsAct_Upd01_DtlR_SlsAct_Upd01_DtlR<D extends SlsAct_Upd01_DtlR, S extends SlsAct_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_DtlR.$dtl_peg_no, SlsAct_Upd01_DtlR.$dtl_peg_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_amt, SlsAct_Upd01_DtlR.$trd_cur_amt);
			}
		}
		
		/**
		 * 行単位で金額計算を行う
		 * 
		 * @param hdrR
		 * @param dtlL
		 */
		protected void calcAmtPerLine(SlsAct_Upd01_HdrR hdrR, MCList<SlsAct_Upd01_DtlR> dtlL) {
			// 取引通貨の金額小数部有効桁数
			MAM_CUR_R trdCurR = getCur(hdrR.trd_cur_cd());
			
			hdrR.trd_cur_amt_dec_place(trdCurR.amt_dec_place());	// 取引通貨金額端数処理区分
			hdrR.trd_cur_upri_dec_place(trdCurR.upri_dec_place());	// 取引通貨単価端数処理区分
			
			hdrR.xrate_rnd_typ(getCo().xrate_rnd_typ());					// 為替端数処理区分
			hdrR.amt_rnd_typ(getCstCache(hdrR.cst_cd()).sls_amt_rnd_typ());	// 金額端数処理区分
			hdrR.tax_rnd_typ(getCstCache(hdrR.cst_cd()).sls_tax_rnd_typ());	// 税端数処理区分
			
			// 基準通貨の単価小数部有効桁数、金額小数部有効桁数
			hdrR.base_cur_upri_dec_place(getBaseCur().upri_dec_place());
			hdrR.base_cur_amt_dec_place(getBaseCur().amt_dec_place());
			
			// 納税通貨の単価小数部有効桁数、金額小数部有効桁数
			hdrR.ptax_cur_upri_dec_place(getPtaxCur().upri_dec_place());
			hdrR.ptax_cur_amt_dec_place(getPtaxCur().amt_dec_place());
			
			// 源泉税額計算実施ＦＬＧ
			boolean wtaxCalcFlg = false;
			String wtaxRndTyp = getCo().wtax_rnd_typ();
			// 取引通貨＝基準通貨＝納税通貨または取引通貨＝基準通貨かつ納税通貨NULLの場合源泉税額計算を行う
			if ((isSame(hdrR.trd_cur_cd(), hdrR.base_cur_cd()) && 
				isSame(hdrR.trd_cur_cd(), hdrR.ptax_cur_cd())) ||
				(isSame(hdrR.trd_cur_cd(), hdrR.base_cur_cd()) && 
				isNull(hdrR.ptax_cur_cd()))) {
				wtaxCalcFlg = true;
			}
			
			for (SlsAct_Upd01_DtlR dtlR : dtlL) {
				if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					continue;
				}
				// 単価、金額、税額（取引通貨、基準通貨、納税通貨）セット
				if (dtlR.trd_cur_upri().isZero()) {
					dtlR.trd_cur_amt(MCNumber.ZERO);
					dtlR.trd_cur_tax_amt(MCNumber.ZERO);
					dtlR.base_cur_upri(MCNumber.ZERO);
					dtlR.base_cur_amt(MCNumber.ZERO);
					dtlR.base_cur_tax_amt(MCNumber.ZERO);
					dtlR.ptax_cur_upri(MCNumber.ZERO);
					dtlR.ptax_cur_amt(MCNumber.ZERO);
					dtlR.ptax_cur_tax_amt(MCNumber.ZERO);
				}
				else {
					if (isNull(dtlR.trd_cur_amt())) {
						// 取引通貨
						MCRow amtR = getAmtAndTax(hdrR, dtlR);
						
						dtlR.trd_cur_amt(amtR.getNumber("amt"));
						dtlR.trd_cur_tax_amt(amtR.getNumber("tax_amt"));
					}
					
					if (up0().get(0).amt_calc_flg()) {
						// 基準通貨換算
						dtlR.base_cur_upri(convToBaseCur(
								dtlR.trd_cur_upri(),
								hdrR.xrate(),
								hdrR.base_cur_upri_dec_place(),
								hdrR.xrate_rnd_typ()));
						dtlR.base_cur_amt(convToBaseCur(
								dtlR.trd_cur_amt(),
								hdrR.xrate(),
								hdrR.base_cur_amt_dec_place(),
								hdrR.xrate_rnd_typ()));
						dtlR.base_cur_tax_amt(convToBaseCur(
								dtlR.trd_cur_tax_amt(),
								hdrR.xrate(),
								hdrR.base_cur_amt_dec_place(),
								hdrR.xrate_rnd_typ()));
						dtlR.base_cur_dscnt_amt(convToBaseCur(
								dtlR.trd_cur_dscnt_amt(),
								hdrR.xrate(),
								hdrR.base_cur_amt_dec_place(),
								hdrR.xrate_rnd_typ()));
						
						// 納税通貨換算
						if (!isNull(hdrR.ptax_cur_cd())) { 
							dtlR.ptax_cur_upri(convCur(
									dtlR.trd_cur_upri(),
									hdrR.ptax_xrate(),
									hdrR.ptax_cur_upri_dec_place(),
									hdrR.xrate_rnd_typ()));
							dtlR.ptax_cur_amt(convCur(
									dtlR.trd_cur_amt(),
									hdrR.ptax_xrate(),
									hdrR.ptax_cur_amt_dec_place(),
									hdrR.xrate_rnd_typ()));
							dtlR.ptax_cur_tax_amt(convCur(
									dtlR.trd_cur_tax_amt(),
									hdrR.ptax_xrate(),
									hdrR.ptax_cur_amt_dec_place(),
									hdrR.xrate_rnd_typ()));
							dtlR.ptax_cur_dscnt_amt(convCur(
									dtlR.trd_cur_dscnt_amt(),
									hdrR.ptax_xrate(),
									hdrR.ptax_cur_amt_dec_place(),
									hdrR.xrate_rnd_typ()));
						}
					}
				}
				
				// 詳細の単価金額設定（上段：明細から下段：詳細へ単価・金額を算出）
				setIoAmt(hdrR, dtlR);
				
				// 源泉税額の計算
				if (wtaxCalcFlg) {
					if (!isNull(dtlR.wtax_rate())) {
						dtlR.wtax_amt(dtlR.trd_cur_amt().multiply(dtlR.wtax_rate())
								.divide(
										100,
										hdrR.trd_cur_amt_dec_place().intValue(),
										MAC_RND_TYP.toMC(wtaxRndTyp)));
					}
				}
				else {
					// 源泉税額の計算対象外はクリア
					dtlR.wtax_rate(null);
					dtlR.wtax_amt(null);
				}
			}
			
			// 明細の取引通貨金額、取引通貨税額、基準通貨金額、基準通貨税額の合計をヘッダにセット
			hdrR.trd_cur_amt(MCNumber.ZERO);
			hdrR.trd_cur_tax_amt(MCNumber.ZERO);
			hdrR.base_cur_amt(MCNumber.ZERO);
			hdrR.base_cur_tax_amt(MCNumber.ZERO);
			for (SlsAct_Upd01_DtlR dtlR : dtlL) {
				// 値引品目の場合は減算（値引・値増は除く）
				if (dtlR.dscnt_itm_flg() && 
					!isSlsDscntXtra(hdrR.trd_ptn_typ())) {
					hdrR.trd_cur_amt(hdrR.trd_cur_amt().subtract(dtlR.trd_cur_amt()));
					hdrR.trd_cur_tax_amt(hdrR.trd_cur_tax_amt().subtract(dtlR.trd_cur_tax_amt()));
					hdrR.base_cur_amt(hdrR.base_cur_amt().subtract(dtlR.base_cur_amt()));
					hdrR.base_cur_tax_amt(hdrR.base_cur_tax_amt().subtract(dtlR.base_cur_tax_amt()));
				}
				else {
					hdrR.trd_cur_amt(hdrR.trd_cur_amt().add(dtlR.trd_cur_amt()));
					hdrR.trd_cur_tax_amt(hdrR.trd_cur_tax_amt().add(dtlR.trd_cur_tax_amt()));
					hdrR.base_cur_amt(hdrR.base_cur_amt().add(dtlR.base_cur_amt()));
					hdrR.base_cur_tax_amt(hdrR.base_cur_tax_amt().add(dtlR.base_cur_tax_amt()));
				}
			}
		}
		
		/**
		 * 詳細欄の単価・金額設定
		 * 
		 * @param hdrR
		 * @param dtlR
		 */
		protected void setIoAmt(SlsAct_Upd01_HdrR hdrR, SlsAct_Upd01_DtlR dtlR) {
			MCList<SlsAct_Upd01_IoR> ioTgtL = MCList.create(SlsAct_Upd01_IoR.class);
			String[] ioKeys = new String[] {
					SlsAct_Upd01_IoR.$new_hdr_peg_no, SlsAct_Upd01_IoR.$dtl_peg_no
			};
			
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc03 calc03 = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc03();
			
			// 共通処理のための電文作成（ヘッダ）
			ConvQtyAmtUtil_Calc01_HdrR calc03Hdr = calc03.createHdrR();
			calc03Hdr.peg_no(1);
			calc03Hdr.inc_tax_flg(dtlR.inc_tax_flg());
			calc03Hdr.amt_dec_place(hdrR.trd_cur_amt_dec_place());
			calc03Hdr.upri_dec_place(hdrR.trd_cur_upri_dec_place());
			calc03Hdr.amt_rnd_typ(hdrR.amt_rnd_typ());
			calc03Hdr.tax_rnd_typ(hdrR.tax_rnd_typ());
			calc03.up0().add(calc03Hdr);
			
			// 共通処理のための電文作成（明細）
			ConvQtyAmtUtil_Calc01_Dtl1R calc03Dtl1 = calc03.createDtl1R();
			calc03Dtl1.peg_no(1);
			calc03Dtl1.hdr_peg_no(1);
			calc03Dtl1.trd_unit_qty(dtlR.trd_unit_qty());
			calc03Dtl1.trd_unit_cd(dtlR.trd_unit_cd());
			calc03Dtl1.trd_cur_dscnt_amt(dtlR.trd_cur_dscnt_amt());
			calc03Dtl1.trd_cur_amt(dtlR.trd_cur_amt());
			calc03Dtl1.trd_cur_tax_amt(dtlR.trd_cur_tax_amt());
			calc03Dtl1.trd_cur_inc_tax_amt(dtlR.trd_cur_amt().add(dtlR.trd_cur_tax_amt()));
			calc03Dtl1.wtax_amt(dtlR.wtax_amt());
			calc03.up1().add(calc03Dtl1);
			
			// 新ヘッダ紐付きＮＯ、明細紐付きＮＯに紐づく詳細情報を取得
			Comparable<?>[] ioVals = new Comparable[] {
					dtlR.new_hdr_peg_no(), dtlR.dtl_peg_no()
			};
			ioTgtL.addAll(_ioL.subList(ioKeys, ioVals));
			MCList<ConvQtyAmtUtil_Calc01_Dtl2R> Dtl2L = MCList.create(ConvQtyAmtUtil_Calc01_Dtl2R.class);
			
			// 共通処理のための電文作成（詳細）
			for (int i = 0; i < ioTgtL.size() ; i++) {
				SlsAct_Upd01_IoR ioR = ioTgtL.get(i); 
				ConvQtyAmtUtil_Calc01_Dtl2R calc03Dtl2 = calc03.createDtl2R();
				calc03Dtl2.base_unit_qty(ioR.base_unit_qty());
				calc03Dtl2.peg_no(ioR.io_peg_no());
				calc03Dtl2.hdr_peg_no(1);
				calc03Dtl2.dtl_peg_no(1);
				calc03Dtl2.trd_unit_qty(ioR.trd_unit_qty());
				Dtl2L.add(calc03Dtl2);
			}
			calc03.up2().addAll(Dtl2L);
			
			// 設定処理呼出
			calc03.exec();
			
			// 取得した値を詳細項目にセット
			for (SlsAct_Upd01_IoR ioR : ioTgtL) {
				for (ConvQtyAmtUtil_Calc01_Dtl2R downR : calc03.down0()) {
					if (downR.peg_no().eq(ioR.io_peg_no())) {
						// 取引通貨の単価・金額・値引額・税額を取得
						ioR.trd_cur_upri(downR.trd_cur_upri());
						ioR.trd_cur_amt(downR.trd_cur_amt());
						ioR.trd_cur_dscnt_amt(downR.trd_cur_dscnt_amt());
						ioR.trd_cur_tax_amt(downR.trd_cur_tax_amt());
						
						ioR.addNumberColumn(ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_amt, downR.wtax_amt());
						// 基準通貨換算
						ioR.base_cur_upri(convToBaseCur(
								ioR.trd_cur_upri(),
								hdrR.xrate(),
								hdrR.base_cur_upri_dec_place(),
								hdrR.xrate_rnd_typ()));
						
						// 納税通貨換算
						if (!isNull(hdrR.ptax_cur_cd())) { 
							ioR.ptax_cur_upri(convCur(
									ioR.trd_cur_upri(),
									hdrR.ptax_xrate(),
									hdrR.ptax_cur_upri_dec_place(),
									hdrR.xrate_rnd_typ()));
						}
					}
				}
			}
			// 売上実績明細の各金額項目を案分した値で売上実績受払の各金額項目を設定
			// 基準通貨金額
			FXUCC_Divide.prop(
					ioTgtL,
					dtlR.base_cur_amt(),
					hdrR.base_cur_amt_dec_place().intValue(),
					SlsAct_Upd01_IoR.$base_unit_qty,
					SlsAct_Upd01_IoR.$base_cur_amt);
			// 基準通貨税額
			FXUCC_Divide.prop(
					ioTgtL,
					dtlR.base_cur_tax_amt(),
					hdrR.base_cur_amt_dec_place().intValue(),
					SlsAct_Upd01_IoR.$base_unit_qty,
					SlsAct_Upd01_IoR.$base_cur_tax_amt);
			if (!isNull(dtlR.trd_cur_dscnt_amt())) {
				// 基準通貨値引額
				FXUCC_Divide.prop(
						ioTgtL,
						dtlR.base_cur_dscnt_amt(),
						hdrR.base_cur_amt_dec_place().intValue(),
						SlsAct_Upd01_IoR.$base_unit_qty,
						SlsAct_Upd01_IoR.$base_cur_dscnt_amt);
			}
			if (!isNull(hdrR.ptax_cur_cd())) { 
				// 納税通貨金額
				FXUCC_Divide.prop(
						ioTgtL,
						dtlR.ptax_cur_amt(),
						hdrR.ptax_cur_amt_dec_place().intValue(),
						SlsAct_Upd01_IoR.$base_unit_qty,
						SlsAct_Upd01_IoR.$ptax_cur_amt);
				// 納税通貨税額
				FXUCC_Divide.prop(
						ioTgtL,
						dtlR.ptax_cur_tax_amt(),
						hdrR.ptax_cur_amt_dec_place().intValue(),
						SlsAct_Upd01_IoR.$base_unit_qty,
						SlsAct_Upd01_IoR.$ptax_cur_tax_amt);
				if (!isNull(dtlR.trd_cur_dscnt_amt())) {
					// 納税通貨値引額
					FXUCC_Divide.prop(
							ioTgtL,
							dtlR.ptax_cur_dscnt_amt(),
							hdrR.ptax_cur_amt_dec_place().intValue(),
							SlsAct_Upd01_IoR.$base_unit_qty,
							SlsAct_Upd01_IoR.$ptax_cur_dscnt_amt);
				}
			}
		}
		protected MCRow getAmtAndTax(SlsAct_Upd01_HdrR hdrR, SlsAct_Upd01_DtlR dtlR) {
			if (getTaxCache() == null) {
				initTaxCache(MCList.create(MST_SLS_ACT_D_R.class));
			}
			MCRow schdR = null;
			MAM_TAX_R schdTaxR =null, dtlTaxR = getTaxCache().get(dtlR.tax_cd());

			if (!isNull(dtlR.slo_d_no()) && MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())) {
				schdR = _sloDL.getFirst(_sloDKey, dtlR.slo_d_no());
				schdTaxR = getTaxCache().get(schdR.getString("tax_cd"));
			}
			MST_SLS_ACT_D_R slsActDR = MST_SLS_ACT_D_R.create();
			if (!MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ()) && !isNull(dtlR.sls_act_d_no())) {
				// 売上明細訂正で変更されているか。その場合は金額は常に再計算する
				MST_SLS_ACT_D_R t1 = MST_SLS_ACT_D_R.create("T1");
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
				bldr.setSelect(t1.sls_dtl_upd_flg);
				dbSelectKey("MSBBL6010_MST_SLS_ACT_D_S08", slsActDR, bldr, dtlR);
			}
			
			MCRow amtR = MCRow.create();

			if (!slsActDR.sls_dtl_upd_flg()
				&& !isNull(schdR)
				&& isSame(dtlR.base_unit_qty(), schdR.getNumber("base_unit_qty"))
				&& isSame(dtlR.trd_cur_dscnt_amt(), schdR.getNumber("trd_cur_dscnt_amt"))
				&& isSame(dtlTaxR.tax_rate(), schdTaxR.tax_rate())
				&& isSame(dtlTaxR.inc_tax_flg(), schdTaxR.inc_tax_flg())
				&& isSame(dtlR.trd_cur_upri(), schdR.getNumber("trd_cur_upri"))) {
				// 受注明細の情報から再計算する必要がない場合は、その値を引き継ぐ
				amtR.setNumberNE("amt", schdR.getNumber("trd_cur_amt"));
				amtR.setNumberNE("tax_amt", schdR.getNumber("trd_cur_tax_amt"));
				amtR.setNumberNE("inc_tax_amt", sum(schdR.getNumber("trd_cur_amt"), schdR.getNumber("trd_cur_tax_amt")));
			}
			else {
				amtR = MAUCL_AmtUtil.getAmtAndTax(
						dtlR.trd_cur_upri(), 
						dtlR.trd_unit_qty(),
						dtlTaxR.tax_rate(),
						dtlTaxR.inc_tax_flg(),
						hdrR.trd_cur_amt_dec_place(),
						hdrR.amt_rnd_typ(),
						hdrR.tax_rnd_typ(),
						dtlR.trd_cur_dscnt_amt());
			}
			return amtR;
		}
		
		/**
		 * 新規インボイスＮＯを発番するかチェック
		 * 
		 * @param hdrR
		 * @return
		 */
		protected boolean isGetNewIvNo(SlsAct_Upd01_HdrR hdrR) {
			// インボイス対象の場合はインボイス登録サービスで発番する
			if (MSC_IV_SRC_TYP.isSLS(hdrR.iv_src_typ())) {
				return false;
			}
			if (!isSame(hdrR.trd_cur_cd(), hdrR.base_cur_cd()) 
					|| getCstCache(hdrR.cst_cd()).cst_iv_flg()
					|| MAC_BILL_CL_TYP.isEACH_SLS(getBcstCache(hdrR.bcst_cd()).bill_cl_typ())) {
				if (isNull(hdrR.iv_no()) || isSame(hdrR.iv_no(), MAC_STR.NULL_VAL.value())) {
					return true;
				}
			}
			return false;
		}
		
		/**
		 * インボイスＮＯ設定
		 * 
		 * @param hdrR
		 * @param getNewIvFlg 自動発番する場合にtrue
		 * @return
		 */
		protected String setUpIvNo(SlsAct_Upd01_HdrR hdrR, boolean getNewIvFlg) {
			String iv_no = hdrR.iv_no();
			String tgtIvNo = hdrR.iv_no();
			boolean delIvFlg = false;
			
			// 新規・更新時
			if (!MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
				// 訂正の場合
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
					MST_SLS_ACT_R slsActR = _befSlsActL.getFirst(_befSlsActLIdx, hdrR.sls_act_no());
					
					// 上り電文のインボイスＮＯがNULL（NULL文字）
					if (isNullOrNullVal(hdrR.iv_no())) {
						// 発番対象
						if (getNewIvFlg) {
							// 元の売上実績のインボイスＮＯがNULL（NULL文字）または自動発番となる場合は新規発番
							if (isNullOrNullVal(slsActR.iv_no()) || getCstCache(hdrR.cst_cd()).cst_iv_flg()) {
								ElmArgsR elm = ElmArgsR.create();
								elm.co_cd(getCo().co_cd());
								elm.dt(getToday());
								
								iv_no = getNumIv(elm, null);
							}
							// 元の売上実績のインボイスＮＯがあればそのまま利用
							else {
								iv_no = slsActR.iv_no();
							}
						}
						// 発番対象外の場合はNULL文字
						else {
							iv_no = MAC_STR.NULL_VAL.value();
						}
					}
					else {
						// インボイスＮＯの設定が不要の場合、インボイスNOをクリア（NULL文字）
						if (!getCstCache(hdrR.cst_cd()).cst_iv_flg()
								&& isSame(hdrR.trd_cur_cd(), hdrR.base_cur_cd())
								&& !MAC_BILL_CL_TYP.isEACH_SLS(getBcstCache(hdrR.bcst_cd()).bill_cl_typ())) {
							hdrR.iv_no(MAC_STR.NULL_VAL.value());
							iv_no = MAC_STR.NULL_VAL.value();
						}
					}
					
					// 元の売上実績のインボイスＮＯと異なるインボイスＮＯとなった場合
					if (!isSame(slsActR.iv_no(), iv_no)) {
						// 発番対象外
						if (!getNewIvFlg) {
							// 上り電文のインボイスＮＯが入力されている
							if (!isNullOrNullVal(hdrR.iv_no())) {
								// 売上返品予定紐づき
								if (!isNull(hdrR.sls_ret_schd_no())) {
									MST_SLS_RET_SCHD_R slsRetSchdR = MST_SLS_RET_SCHD_R.create("T");
									MCQueryApiBuilder slsRetSchdR_bldr = MCQueryApiBuilder.create(slsRetSchdR);
									slsRetSchdR_bldr.setSelect(slsRetSchdR.iv_no);
									slsRetSchdR_bldr.setWhere(slsRetSchdR.sls_ret_schd_no.eq(bind("1")), hdrR.sls_ret_schd_no());
									dbSelect("MSBBL6010_MST_SLS_RET_SCHD_S01", slsRetSchdR, slsRetSchdR_bldr);
									
									// 売上返品予定のインボイスＮＯと上り電文のインボイスＮＯが異なる場合は上り電文のインボイスＮＯをインボイス情報に登録
									if (!isSame(slsRetSchdR.iv_no(), hdrR.iv_no())) {
										getNumIv(null, hdrR.iv_no());
									}
								}
								// 売上返品予定に紐づかない
								else {
									getNumIv(null, iv_no);
								}
							}
						}
						// 元のインボイスＮＯがNULL文字ではない場合はインボイスＮＯ削除対象にする
						if (!isNullOrNullVal(slsActR.iv_no())) {
							tgtIvNo = slsActR.iv_no();
							delIvFlg = true;
						}
					}
				}
				// 新規の場合
				else {
					if (getNewIvFlg) {
						ElmArgsR elm = ElmArgsR.create();
						elm.co_cd(getCo().co_cd());
						elm.dt(getToday());
						
						iv_no = getNumIv(elm, null);
					}
					else {
						if (isNullOrNullVal(hdrR.iv_no())) {
							iv_no = MAC_STR.NULL_VAL.value();
						}
						else {
							if (!hdrR.ship_act_service_via_flg() && !MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ()) && !MAC_TRD_PTN_TYP.isSLS_CNSGN(hdrR.trd_ptn_typ())) {
								if (!isNull(hdrR.sls_ret_schd_no())) {
									MST_SLS_RET_SCHD_R slsRetSchdR = MST_SLS_RET_SCHD_R.create("T");
									MCQueryApiBuilder slsRetSchdR_bldr = MCQueryApiBuilder.create(slsRetSchdR);
									slsRetSchdR_bldr.setSelect(slsRetSchdR.iv_no);
									slsRetSchdR_bldr.setWhere(slsRetSchdR.sls_ret_schd_no.eq(bind("1")), hdrR.sls_ret_schd_no());
									dbSelect("MSBBL6010_MST_SLS_RET_SCHD_S02", slsRetSchdR, slsRetSchdR_bldr);
									if (!isSame(slsRetSchdR.iv_no(), hdrR.iv_no())) {
										getNumIv(null, hdrR.iv_no());
									}
								}
								else {
									getNumIv(null, hdrR.iv_no());
								}
							}
						}
					}
				}
			}
			
			// 更新・取消時、不要になったインボイスＮＯを削除する
			if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ()) ||
				(MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ()) && delIvFlg)) {
				
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())){
					// 削除対象となる売上実績のインボイスＮＯを取得
					MST_SLS_ACT_R slsActR = MST_SLS_ACT_R.create("T");
					MCQueryApiBuilder slsActR_bldr = MCQueryApiBuilder.create(slsActR);
					slsActR_bldr.setSelect(slsActR.iv_no);
					slsActR_bldr.setWhere(slsActR.sls_act_no.eq(bind("1")), hdrR.sls_act_no());
					slsActR_bldr.addWhereWithAnd(slsActR.sls_act_seq.eq(bind("1")), hdrR.sls_act_seq());
					dbSelect("MSBBL6010_MST_SLS_ACT_S01", slsActR, slsActR_bldr);
					tgtIvNo = slsActR.iv_no();
				}
				
				if (!isNullOrNullVal(tgtIvNo)) {
					// 取消対象のインボイスＮＯの利用箇所（受注ヘッダ、売上返品予定ヘッダ、インボイスヘッダ）がない場合は削除する
					boolean execIvDelFlg = true;
					if (!isNull(hdrR.slo_no())) {
						MST_SLO_R sloR = MST_SLO_R.create("T");
						MCQueryApiBuilder sloR_bldr = MCQueryApiBuilder.create(sloR);
						sloR_bldr.setSelect(sloR.iv_no);
						sloR_bldr.setWhere(sloR.slo_no.eq(bind("1")), hdrR.slo_no());
						sloR_bldr.addWhereWithAnd(sloR.iv_no.eq(bind("1")), tgtIvNo);
						int rsltCnt = dbSelect("MSBBL6010_MST_SLO_S01", sloR, sloR_bldr);
						
						if (rsltCnt > 0) {
							execIvDelFlg = false;
						}
					}
					else if (!isNull(hdrR.sls_ret_schd_no())) {
						MST_SLS_RET_SCHD_R slsRetSchdR = MST_SLS_RET_SCHD_R.create("T");
						MCQueryApiBuilder slsRetSchdR_bldr = MCQueryApiBuilder.create(slsRetSchdR);
						slsRetSchdR_bldr.setSelect(slsRetSchdR.iv_no);
						slsRetSchdR_bldr.setWhere(slsRetSchdR.sls_ret_schd_no.eq(bind("1")), hdrR.sls_ret_schd_no());
						slsRetSchdR_bldr.addWhereWithAnd(slsRetSchdR.iv_no.eq(bind("1")), tgtIvNo);
						int rsltCnt = dbSelect("MSBBL6010_MST_SLS_RET_SCHD_S03", slsRetSchdR, slsRetSchdR_bldr);
						
						if (rsltCnt > 0) {
							execIvDelFlg = false;
						}
					}
					
					MST_IV_R ivHR = MST_IV_R.create("T");
					MCQueryApiBuilder ivHR_bldr = MCQueryApiBuilder.create(ivHR);
					ivHR_bldr.setSelect(ivHR.iv_no);
					ivHR_bldr.setWhere(ivHR.iv_no.eq(bind("1")), tgtIvNo);
					int rsltCnt = dbSelect("MSBBL6010_MST_IV_S01", ivHR, ivHR_bldr);
					
					if (rsltCnt > 0) {
						execIvDelFlg = false;
					}
					
					if (execIvDelFlg) {
						if (chkCanIv(tgtIvNo)) {
							MST_IV_NO_R ivR = MST_IV_NO_R.create("T");
							ivR.iv_no(tgtIvNo);
							dbDeleteKey("MSBBL6010_MST_IV_NO_D01", ivR, MCQueryApiBuilder.create(ivR));
						}
					}
				}
			}
			
			// 売上都度請の場合、請求起算日に計上日を設定
			if (isNull(hdrR.bill_basis_dt()) || MAC_BILL_CL_TYP.isEACH_SLS(hdrR.bill_cl_typ())) {
				hdrR.bill_basis_dt(hdrR.ac_dt());
			}
			
			return iv_no;
		}
		
		/**
		 * 都度請求で請求残高振替をしている場合は振替先の債権伝票明細にインボイスＮＯを保持しているので
		 * 振替元の更新・取消の際にMST_IV_NOから削除しないようにする。
		 * 
		 * @param ivNo
		 * @return
		 */
		protected boolean chkCanIv(String ivNo) {
			MCList<MST_RCV_ACT_D_R> l = MCList.create(MST_RCV_ACT_D_R.class);
			MST_RCV_ACT_D_R t = MST_RCV_ACT_D_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			MST_RCV_ACT_R t1 = MST_RCV_ACT_R.create("T1");
			l_bldr.setSelect(t.rcv_act_d_no);
			l_bldr.addInnerJoin(t1, bracket( t.rcv_act_no.eq(t1.rcv_act_no) 
					.and(t.rcv_act_seq.eq(t1.rcv_act_seq))));
			l_bldr.setWhere(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			l_bldr.addWhereWithAnd(t1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value())));
			l_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), ivNo);
			int cnt = dbSelect("MSBBL6010_MST_RCV_ACT_D_S01", l, l_bldr);
			return cnt == 0;
		}
		protected MCList<MST_SLS_ACT_R> _befSlsActL = MCList.create(MST_SLS_ACT_R.class);
		protected MCIndexKey _befSlsActLIdx = null;
		/**
		 * 更新元の売上実績情報を取得
		 */
		protected void getBefSlsActL() {
			MCList<SlsAct_Upd01_HdrR> updHdrL = _hdrL.subList(SlsAct_Upd01_HdrR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
			if (isNull(updHdrL)) {
				return;
			}
			MST_SLS_ACT_R befSlsActL_t = MST_SLS_ACT_R.create("T");
			MCQueryApiBuilder befSlsActL_bldr = MCQueryApiBuilder.create(befSlsActL_t);
			befSlsActL_bldr.setSelect(befSlsActL_t.sls_act_no, befSlsActL_t.iv_no);
			befSlsActL_bldr.setWhere(befSlsActL_t.sls_act_no.eq(bind("sls_act_no")));
			befSlsActL_bldr.addWhereWithAnd(befSlsActL_t.sls_act_seq.eq(bind("sls_act_seq")));
			dbSelect("MSBBL6010_MST_SLS_ACT_S02", _befSlsActL, befSlsActL_bldr, updHdrL);
			_befSlsActLIdx = _befSlsActL.createIndex(MST_SLS_ACT_R.$sls_act_no);
		}
		protected MCList<MST_SHIP_SCHD_R> _befShipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
		protected MCIndexKey _befShipSchdLIdx = null;
		/**
		 * 更新元の売上実績情報を取得
		 */
		protected void getBefShipSchdL(MCList<SlsAct_Upd01_DtlR> up1) {
			MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
			MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
			MCQueryApiBuilder befShipSchdbldr = MCQueryApiBuilder.create(S0_SHIPSCHD);
			befShipSchdbldr.setSelect(S0_SHIPSCHD.ship_schd_no);
			befShipSchdbldr.addSelect(
					cases()
					.when(
						nvl(
							bracket(
								subQuery()
								.select(sum(S0_SLSSCHD.base_unit_abort_qty))
								.from(S0_SLSSCHD)
								.where(
									S0_SLSSCHD.ship_schd_no.eq(S0_SHIPSCHD.ship_schd_no)
									.and(S0_SLSSCHD.abort_flg.eq(value(true)))
								)
							),
							value(0)
						).gt(value(0))
					)
						.then(value(true))
					.otherwise(value(false)).as("abort_flg"));
			befShipSchdbldr.setWhere(S0_SHIPSCHD.ship_schd_no.eq(bind("ship_schd_no")));
			dbSelect("MSBBL6010_MST_SHIP_SCHD_S05", _befShipSchdL, befShipSchdbldr, up1);
			_befShipSchdLIdx = _befShipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
		}
		
		/**
		 * 各種ＮＯ発番処理
		 */
		protected void setSeqNo() {
			
			crtSeqCache(); // シーケンスキャッシュ
			setNoByNumPtn(); // 発番パタンマスタによる発番
			getBefSlsActL();
			
			for(SlsAct_Upd01_HdrR hdrR : _hdrL) {
				
				if (!isNull(hdrR.iv_no())) {
					hdrR.bef_iv_no(hdrR.iv_no());
				}
				boolean getNewIvFlg = isGetNewIvNo(hdrR);
				hdrR.iv_no(setUpIvNo(hdrR, getNewIvFlg));
				
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
					if (isNull(hdrR.dlv_slip_rev())) {
						hdrR.sls_act_rev(1);
					}
					else {
						hdrR.sls_act_rev(hdrR.dlv_slip_rev());
					}
					if (isNull(hdrR.dlv_slip_seq())) {
						hdrR.sls_act_seq(1);
					}
					else {
						hdrR.sls_act_seq(hdrR.dlv_slip_seq());
					}
				}
				
				String[] ioKeys = new String[] {
						SlsAct_Upd01_IoR.$new_hdr_peg_no, SlsAct_Upd01_IoR.$dtl_peg_no
				};
				// 新ヘッダ紐付けＮＯに紐づく明細取得
				MCList<SlsAct_Upd01_DtlR> dtlTgtL = MCList.create(SlsAct_Upd01_DtlR.class);
				dtlTgtL = getDtlData(_dtlL, hdrR.new_hdr_peg_no(), SlsAct_Upd01_DtlR.$new_hdr_peg_no);
				for (SlsAct_Upd01_DtlR dtlR : dtlTgtL) {
					if (dtlR.isStatusCreate() || MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
						// 売上実績明細ＮＯ発番
						dtlR.sls_act_d_no(getStrSeq(MSC_NUM_SYS_TYP.SLSACTD));
						dtlR.sls_act_d_seq(1);
					}
					if(isCrtSeq(dtlR)) {
						dtlR.dlv_slip_d_no(getStrSeq(MSC_NUM_SYS_TYP.DLVSLIPD));
					}
					dtlR.sls_act_no(hdrR.sls_act_no());
					dtlR.sls_act_seq(hdrR.sls_act_seq());
					
					// 新ヘッダ紐付けＮＯ、明細紐付けＮＯに紐づく詳細取得
					Comparable<?>[] ioVals = new Comparable[] {
							dtlR.new_hdr_peg_no(), dtlR.dtl_peg_no()
					};
					MCList<SlsAct_Upd01_IoR> ioL = MCList.create(SlsAct_Upd01_IoR.class);
					ioL.addAll(_ioL.subList(ioKeys, ioVals));
					for (SlsAct_Upd01_IoR ioR : ioL) {
						if (ioR.isStatusCreate() || MAC_DATA_CRUD_TYP.isCRT(ioR.data_crud_typ())) {
							// 売上実績受払ＮＯ発番
							ioR.sls_act_io_no(getStrSeq(MSC_NUM_SYS_TYP.SLSACTIO));
							ioR.sls_act_io_seq(1);
						}
						ioR.sls_act_d_no(dtlR.sls_act_d_no());
						ioR.sls_act_d_seq(dtlR.sls_act_d_seq());
					}
				}
			}
		}
		
		protected MCIndexKey _hdrLIdxPegKey = null;
		
		/**
		 * シーケンス用キャッシュ作成
		 */
		protected void crtSeqCache() {
			_hdrLIdxPegKey = _hdrL.createIndex(SlsAct_Upd01_HdrR.$hdr_peg_no);
			int crtDtlSize = up1().subList(r -> isCrtSeq(r)).size();
			int crtIoSize = up2().subList(SlsAct_Upd01_IoR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value()).size();
			
			if (crtDtlSize > 0) {
				// 売上実績明細用シーケンスキャッシュ
				doSeqCache(MSC_NUM_SYS_TYP.SLSACTD, crtDtlSize);
				// 納品伝票明細用シーケンスキャッシュ
				doSeqCache(MSC_NUM_SYS_TYP.DLVSLIPD, crtDtlSize);
			}
			if (crtIoSize > 0) {
				// 売上実績受払用シーケンスキャッシュ
				doSeqCache(MSC_NUM_SYS_TYP.SLSACTIO, crtIoSize);
			}
		}
		
		protected boolean isCrtSeq(SlsAct_Upd01_DtlR dtlR) {
			SlsAct_Upd01_HdrR hdrR = _hdrL.getFirst(_hdrLIdxPegKey, dtlR.hdr_peg_no());
			if (dtlR.isStatusCreate() || MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
				if (isAccptBase(hdrR)) {
					if (isNullDlvSlipDNo(hdrR, dtlR)) {
						return true;
					}
					// 出荷の納品書を引き継ぐので発番しない
					return false;
				}
				if (isDDlvDlvSlipCopy(hdrR)) {
					// 納品予定日違いの予定をまとめて売上する場合に、納品書明細ＮＯが設定されないことがある
					if (isNullDlvSlipDNo(hdrR, dtlR)) {
						return true;
					}
					// 仕入直送の納品書ＮＯが設定されている場合、その値を引き継ぐ
					return false;
				}
				if (isUnPlandSls(hdrR)) {
					return true;
				}
				if(isSlsDscntXtraAprvNotTarget(hdrR)) {
					return true;
				}
			}
			if (dtlR.isStatusModify() || MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
				if (isSlsDscntXtraAprvNotTarget(hdrR) && isNullDlvSlipDNo(hdrR, dtlR)) {
					return true;
				}
			}
			return false;
		}
		
		protected boolean isAccptBase(SlsAct_Upd01_HdrR hdrR) {
			return !hdrR.ship_act_service_via_flg() && isShipDlvSlipCopy(hdrR);
		}
		protected boolean isUnPlandSls(SlsAct_Upd01_HdrR hdrR) {
			return !hdrR.ship_act_service_via_flg() && !isShipDlvSlipCopy(hdrR) && !isSlsDscntXtra(hdrR.trd_ptn_typ());
		}
		protected boolean isSlsDscntXtraAprvNotTarget(SlsAct_Upd01_HdrR hdrR){
			return isSlsDscntXtra(hdrR.trd_ptn_typ()) && !hdrR.aprv_flg();
		}
		protected boolean isNullDlvSlipDNo(SlsAct_Upd01_HdrR hdrR, SlsAct_Upd01_DtlR dtlR){
			return !hdrR.ship_act_service_via_flg() && !isNull(hdrR.dlv_slip_no()) && isNull(dtlR.dlv_slip_d_no());
		}
		
		/**
		 * 発番パタンマスタによる発番を一括で行う
		 */
		protected void setNoByNumPtn() {
			
			MCList<ElmArgsR> slsActNoL = MCList.create(ElmArgsR.class);
			MCList<ElmArgsR> dlvSlipNoL = MCList.create(ElmArgsR.class);
			
			for(SlsAct_Upd01_HdrR hdrR : _hdrL) {
				if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
					if (isNull(hdrR.sls_act_no())) {
						slsActNoL.add(getSlsActNoArgs(hdrR));
					}
					if (!isNull(hdrR.dlv_slip_no()) 
							&& (MAC_SLS_BASIS_TYP.isSHIP_BASIS(hdrR.sls_basis_typ()) || isNull(hdrR.sls_basis_typ()))
							&& !hdrR.ddlv_sls_flg()) {
						// 納品書ＮＯを発番するよりも前に退避する
						hdrR.bef_dlv_slip_no(hdrR.dlv_slip_no());
					}
					if (!hdrR.ship_act_service_via_flg()) {
						if (isShipDlvSlipCopy(hdrR) || isDDlvDlvSlipCopy(hdrR)) {
							// 出荷または仕入直送の納品書ＮＯを引き継ぐので発番しない
						}
						// 売上値引、値増以外、または、承認対象外の場合
						else if (!isSlsDscntXtra(hdrR.trd_ptn_typ()) || !hdrR.aprv_flg()) {
							dlvSlipNoL.add(getDlvSlipNoArgs(hdrR));
						}
					}
				}
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
					if (isSlsDscntXtra(hdrR.trd_ptn_typ()) && !hdrR.aprv_flg() && isNull(hdrR.dlv_slip_no())) {
						dlvSlipNoL.add(getDlvSlipNoArgs(hdrR));
					}
				}
			}
			
			if (!slsActNoL.isEmpty()) {
				setNum(MAC_NUM_BIZ_TYP.SLSACT, slsActNoL);
				String[] srcCols = new String[]{ElmArgsR.$new_no};
				String[] destCols = new String[]{SlsAct_Upd01_HdrR.$sls_act_no};
				copyByPegNo(_hdrL, slsActNoL, SlsAct_Upd01_HdrR.$new_hdr_peg_no, destCols, 
						ElmArgsR.$peg_no, srcCols);
			}
			
			if (!dlvSlipNoL.isEmpty()) {
				setNum(MAC_NUM_BIZ_TYP.DLVSLIP, dlvSlipNoL);
				String[] srcCols = new String[]{ElmArgsR.$new_no};
				String[] destCols = new String[]{SlsAct_Upd01_HdrR.$dlv_slip_no};
				copyByPegNo(_hdrL, dlvSlipNoL, SlsAct_Upd01_HdrR.$new_hdr_peg_no, destCols, 
						ElmArgsR.$peg_no, srcCols);
				
			}
		}
		
		
		/**
		 * 売上実績ＮＯ発番の要素を取得する
		 * 
		 * @param hdrR
		 * @return
		 */
		protected ElmArgsR getSlsActNoArgs(SlsAct_Upd01_HdrR hdrR) {
			ElmArgsR args = ElmArgsR.create();

			args.dpt_cd(hdrR.sls_dpt_cd());
			args.co_cd(getCo().co_cd());
			args.bp_cd(hdrR.cst_cd());
			args.wg_cd(hdrR.wg_cd());
			args.trd_cd(hdrR.trd_cd());
			args.dt(hdrR.ac_dt());
			
			args.peg_no(hdrR.new_hdr_peg_no());
			
			return args;
		}
		
		/**
		 * 納品書ＮＯ発番の要素を取得する
		 * 
		 * @param hdrR
		 * @return
		 */
		protected ElmArgsR getDlvSlipNoArgs (SlsAct_Upd01_HdrR hdrR) {
			ElmArgsR args = ElmArgsR.create();
			
			args.dpt_cd(hdrR.sls_dpt_cd());
			args.co_cd(getCo().co_cd());
			args.wg_cd(hdrR.wg_cd());
			args.trd_cd(hdrR.trd_cd());
			args.dt(hdrR.ac_dt());
			
			args.peg_no(hdrR.new_hdr_peg_no());
			
			return args;
		}

		
		/**
		 * 売上実績ＮＯ発番
		 * 
		 * @param hdrR
		 * @return
		 */
		protected String getSlsActNo(SlsAct_Upd01_HdrR hdrR) {
			ElmArgsR args = ElmArgsR.create();

			args.dpt_cd(hdrR.sls_dpt_cd());
			args.co_cd(getCo().co_cd());
			args.bp_cd(hdrR.cst_cd());
			args.wg_cd(hdrR.wg_cd());
			args.trd_cd(hdrR.trd_cd());
			args.dt(hdrR.ac_dt());
			
			return getNum(MAC_NUM_BIZ_TYP.SLSACT, args);
		}
		
		/**
		 * 伝票分割処理
		 * 税ＣＤ、納品先情報、明細行数による伝票分割
		 * [納品先情報]
		 * 納品先諸口、納品先名、納品先郵便番号、納品先住所１～４、納品先部署、納品先担当者、納品先ＴＥＬ、納品先ＦＡＸ
		 * @param hdrR　処理対象のヘッダ行
		 * @param dtlL　処理対象のヘッダ行に紐づく明細リスト
		 */
		protected void split(SlsAct_Upd01_HdrR hdrR, MCList<SlsAct_Upd01_DtlR> dtlL, MCList<SlsAct_Upd01_IoR> ioL) {
			
			MCList<SlsAct_Upd01_DtlR> splitBefDtlL = dtlL.clone();
			MCList<SlsAct_Upd01_IoR> splitBefIoL = ioL.clone();
			
			// 分割処理途中の売上実績ヘッダ・明細・詳細を格納
			MCList<SlsAct_Upd01_HdrR> tmpHdrL = MCList.create(SlsAct_Upd01_HdrR.class);
			MCList<SlsAct_Upd01_DtlR> tmpDtlL = MCList.create(SlsAct_Upd01_DtlR.class);
			MCList<SlsAct_Upd01_IoR> tmpIoL = MCList.create(SlsAct_Upd01_IoR.class);
			
			if (isNull(hdrR.sls_dt())){
				hdrR.sls_dt(hdrR.ac_dt());
			}
			
			// 取消の場合は分割処理は行う必要がない。伝票分割不要の場合も分割しない
			if (hdrR.slip_split_non_flg()) {
				if (!MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					hdrR.new_hdr_peg_no(hdrR.hdr_peg_no());
					for (SlsAct_Upd01_DtlR dtlR : dtlL) {
						dtlR.new_hdr_peg_no(hdrR.hdr_peg_no());
						dtlR.new_disp_seq(dtlR.disp_seq());
					}
					ioL.setValue(SlsAct_Upd01_IoR.$new_hdr_peg_no, hdrR.hdr_peg_no());
					
					hdrR.slip_form_cd(getCstCache(hdrR.cst_cd()).cst_ship_form_cd());
					if (isNull(hdrR.slip_form_cd())) {
						hdrR.slip_form_cd(getTrdCache(hdrR.trd_cd()).slip_form_cd());
					}
					// 帳票ＣＤ取得失敗
					if (isNull(hdrR.slip_form_cd())) {
						throw new MCAppException(MSBBL0065, hdrR.cst_cd(), hdrR.trd_cd());
					}
				}
				_hdrL.add(hdrR);
				_dtlL.addAll(dtlL);
				_ioL.addAll(ioL);
			}
			else {
				if (!MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					// 税率、納品先情報による分割
					// 売上税計算区分が「行単位」の場合は税ＣＤでの分割は行わない
					boolean dlvTaxgrpFlg = false;
					if (MAC_TAX_CALC_TYP.isSLIP(getCstCache(hdrR.cst_cd()).sls_tax_calc_typ())) {
						// 税率、納品先情報でグループ化
						tmpDtlL = dtlL.groupBy(getSlipCols());
						dlvTaxgrpFlg = true;
					}
					else {
						// 納品先情報のみでグループ化
						tmpDtlL = dtlL.groupBy(getLineCols());
					}
					tmpDtlL.sort(getSlipCols());
					
					// 承認対象となる場合で分割が発生する場合はエラーとする
					if (hdrR.aprv_flg() && tmpDtlL.size() > 1) {
						throw new MCAppException(MSBBL0066);
					}
					// 売上明細訂正登録で、仕入直送の売上返品データに対し、分割が発生する場合はエラーとする
					if (hdrR.sls_dtl_mod_flg()
							&& MAC_TRD_PTN_TYP.isSLS_RTN(hdrR.trd_ptn_typ())
							&& isDdlvSlsRet(dtlL)
							&& tmpDtlL.size() > 1) {
						throw new MCAppException(MSBBL0291, hdrR.sls_act_no());
					}
					
					// 明細をグループ化した行数だけヘッダを分割
					int cnt = 0;
					for (SlsAct_Upd01_DtlR dtlR : tmpDtlL){
						SlsAct_Upd01_HdrR addHdrR = SlsAct_Upd01_HdrR.create();
						MCRow.copyall(addHdrR, hdrR);
						addHdrR.hdr_dlv_cd(dtlR.dlv_cd());
						addHdrR.hdr_dlv_sundry_flg(dtlR.dlv_sundry_flg());
						addHdrR.hdr_dlv_nm(dtlR.dlv_nm());
						addHdrR.hdr_dlv_zip_cd(dtlR.dlv_zip_cd());
						addHdrR.hdr_dlv_addr1(dtlR.dlv_addr1());
						addHdrR.hdr_dlv_addr2(dtlR.dlv_addr2());
						addHdrR.hdr_dlv_addr3(dtlR.dlv_addr3());
						addHdrR.hdr_dlv_addr4(dtlR.dlv_addr4());
						addHdrR.hdr_dlv_cntct_dpt(dtlR.dlv_cntct_dpt());
						addHdrR.hdr_dlv_cntct_psn(dtlR.dlv_cntct_psn());
						addHdrR.hdr_dlv_tel(dtlR.dlv_tel());
						addHdrR.hdr_dlv_fax(dtlR.dlv_fax());
						addHdrR.hdr_tax_rate(dtlR.tax_rate());
						// 分割が行われていた場合、売上実績ＮＯ、納品書ＮＯ、インボイスＮＯはクリア、データ状況区分は新規
						if (cnt != 0) {
							addHdrR.sls_act_no(null);
							addHdrR.sls_act_rev(1);
							addHdrR.sls_act_seq(1);
							addHdrR.dlv_slip_no(null);
							if (!hdrR.cst_iv_flg()) {
								addHdrR.iv_no(null);
							}
							addHdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
							addHdrR.setStatus(Status.CREATE);
							if (hdrR.sls_dtl_mod_flg() && hdrR.ship_act_service_exec_flg()) {
								// 売上明細訂正により伝票分割された場合、元納品書伝票と出荷情報を保持するため、一時カラムに設定する
								addHdrR.setStringNE("ref_dlv_slip_no", hdrR.dlv_slip_no());
								addHdrR.setStringNE("ref_ship_act_no", hdrR.ship_act_no());
								addHdrR.setStringNE("ref_sls_act_no", hdrR.sls_act_no());
							}
						}
						tmpHdrL.add(addHdrR);
						cnt++;
					}
					
					tmpDtlL.clear();
					String[] ioKeys = new String[] {
							SlsAct_Upd01_IoR.$hdr_peg_no, SlsAct_Upd01_IoR.$dtl_peg_no
					};
					
					// 明細行数によるヘッダ分割
					for (SlsAct_Upd01_HdrR tmpHdrR : tmpHdrL) {
						// 取引先マスタより得意先納品書ＣＤ、取得できなければ取引マスタより伝票帳票ＣＤを取得
						tmpHdrR.slip_form_cd(getCstCache(tmpHdrR.cst_cd()).cst_ship_form_cd());
						if (isNull(tmpHdrR.slip_form_cd())) {
							tmpHdrR.slip_form_cd(getTrdCache(tmpHdrR.trd_cd()).slip_form_cd());
						}
						// 帳票ＣＤ取得失敗
						if (isNull(tmpHdrR.slip_form_cd())) {
							throw new MCAppException(MSBBL0065, tmpHdrR.cst_cd(), tmpHdrR.trd_cd());
						}
						
						// 伝票帳票マスタより行数取得
						MCNumber lineMaxNum = getSlipFormCache(tmpHdrR.slip_form_cd()).line_num();
						if (isNull(lineMaxNum) || lineMaxNum.isZero()) {
							// 行数が取得できなければシステム取得の最大行数とする
							lineMaxNum  = new MCNumber(_maxLineCnt);
						}
						
						int tmp_hdr_peg_no = 0;
						if (isNull(_hdrL) || _hdrL.size() == 0) {
							tmp_hdr_peg_no = 0;
						}
						else {
							tmp_hdr_peg_no = _hdrL.size();
						}
						// ヘッダを登録
						tmp_hdr_peg_no++;
						tmpHdrR.new_hdr_peg_no(tmp_hdr_peg_no);
						_hdrL.add(tmpHdrR);	
						
						// 処理対象の納品先情報、税率と紐付く明細を取得
						if (dlvTaxgrpFlg) {
							Comparable<?>[] dtlVals = new Comparable[] {
									tmpHdrR.hdr_dlv_cd(),
									tmpHdrR.hdr_dlv_sundry_flg(),
									tmpHdrR.hdr_dlv_nm(),
									tmpHdrR.hdr_dlv_zip_cd(),
									tmpHdrR.hdr_dlv_addr1(),
									tmpHdrR.hdr_dlv_addr2(),
									tmpHdrR.hdr_dlv_addr3(),
									tmpHdrR.hdr_dlv_addr4(),
									tmpHdrR.hdr_dlv_cntct_dpt(),
									tmpHdrR.hdr_dlv_cntct_psn(),
									tmpHdrR.hdr_dlv_tel(),
									tmpHdrR.hdr_dlv_fax(),
									tmpHdrR.hdr_tax_rate()
							};
							tmpDtlL = dtlL.subList(getSlipCols(), dtlVals);
						}
						else {
							Comparable<?>[] dtlValsForDlv = new Comparable[] {
									tmpHdrR.hdr_dlv_cd(),
									tmpHdrR.hdr_dlv_sundry_flg(),
									tmpHdrR.hdr_dlv_nm(),
									tmpHdrR.hdr_dlv_zip_cd(),
									tmpHdrR.hdr_dlv_addr1(),
									tmpHdrR.hdr_dlv_addr2(),
									tmpHdrR.hdr_dlv_addr3(),
									tmpHdrR.hdr_dlv_addr4(),
									tmpHdrR.hdr_dlv_cntct_dpt(),
									tmpHdrR.hdr_dlv_cntct_psn(),
									tmpHdrR.hdr_dlv_tel(),
									tmpHdrR.hdr_dlv_fax()
							};
							tmpDtlL = dtlL.subList(getLineCols(), dtlValsForDlv);
						}
						tmpDtlL.sort(SlsAct_Upd01_DtlR.$disp_seq);
						
						boolean splitFlg = false;
	
						for (int i = 0, lineCnt = 1; i < tmpDtlL.size(); i++) {
							SlsAct_Upd01_DtlR tmpDtlR = tmpDtlL.get(i);
							SlsAct_Upd01_HdrR addHdrR = SlsAct_Upd01_HdrR.create();
							
							// 最大行数に達したらヘッダを分割して登録
							if (lineMaxNum.lt(lineCnt)) {
								MCRow.copyall(addHdrR, tmpHdrR);
								// 売上単票ではIV単位に検索を行うので、売上伝票が割れていても全明細が検索対象となる
								// 「表示順」がすべて1、ではなく1,2,3...となるようにする
								if (!hdrR.cst_iv_flg()) {
									lineCnt = 1;
								}
								tmp_hdr_peg_no++;
								addHdrR.new_hdr_peg_no(tmp_hdr_peg_no);
								addHdrR.sls_act_no(null);
								addHdrR.dlv_slip_no(null);
								if (!hdrR.cst_iv_flg()) {
									addHdrR.iv_no(null);
								}
								addHdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
								addHdrR.setStatus(Status.CREATE);
								_hdrL.add(addHdrR);
								splitFlg = true;
								// 承認対象となる場合で分割が発生する場合はエラーとする
								if (hdrR.aprv_flg()) {
									throw new MCAppException(MSBBL0066);
								}
								// 売上明細訂正登録で、仕入直送の売上返品データに対し、分割が発生する場合はエラーとする
								if (hdrR.sls_dtl_mod_flg()
										&& MAC_TRD_PTN_TYP.isSLS_RTN(hdrR.trd_ptn_typ())
										&& isDdlvSlsRet(dtlL)) {
									throw new MCAppException(MSBBL0291, hdrR.sls_act_no());
								}
							}
							// 分割が行われていた場合、売上実績明細ＮＯ、連番、納品書明細ＮＯはクリアしておく
							if (splitFlg || MAC_DATA_CRUD_TYP.isCRT(tmpHdrR.data_crud_typ())) {
								tmpDtlR.sls_act_d_no(null);
								tmpDtlR.sls_act_d_seq(1);
								if (isNull(tmpHdrR.dlv_slip_no())) {
									tmpDtlR.dlv_slip_d_no(null);
								}
								tmpDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
								tmpDtlR.setStatus(Status.CREATE);
							}
							
							// 明細を登録
							tmpDtlR.new_hdr_peg_no(tmp_hdr_peg_no);
							tmpDtlR.new_disp_seq(lineCnt);
							if (hdrR.cst_iv_flg()) {
								tmpDtlR.disp_seq(_lineCnt);
								_lineCnt++;
							}
							else {
								tmpDtlR.disp_seq(lineCnt);
							}
							lineCnt++;
							_dtlL.add(tmpDtlR);
							
							// 旧ヘッダ紐付きＮＯ、明細紐付きＮＯに紐づく詳細リストを取得
							Comparable<?>[] ioVals = new Comparable[] {
									tmpDtlR.hdr_peg_no(), tmpDtlR.dtl_peg_no()
							};
							tmpIoL = ioL.subList(ioKeys, ioVals);
							tmpIoL.sort(SlsAct_Upd01_IoR.$io_peg_no);
							for (SlsAct_Upd01_IoR tmpIoR : tmpIoL) {
								// 詳細の新ヘッダ紐付けＮＯをセット
								tmpIoR.new_hdr_peg_no(tmp_hdr_peg_no);
								if (splitFlg || MAC_DATA_CRUD_TYP.isCRT(tmpHdrR.data_crud_typ())) {
									if (hdrR.sls_dtl_mod_flg() && hdrR.ship_act_service_exec_flg()) {
										tmpIoR.setStringNE("ref_ship_act_d_no", tmpIoR.ship_act_d_no());
									}
									tmpIoR.sls_act_io_no(null);
									tmpIoR.sls_act_io_seq(1);
									tmpIoR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
									tmpIoR.setStatus(Status.CREATE);
								}
								_ioL.add(tmpIoR);
							}
						}
					}
					
					// 伝票が分割された場合に、元の伝票で削除行を作る
					MCIndexKey up1Idxkey = splitBefDtlL.createIndex(SlsAct_Upd01_DtlR.$hdr_peg_no);
					MCIndexKey up2Idxkey = splitBefIoL.createIndex(SlsAct_Upd01_IoR.$hdr_peg_no, SlsAct_Upd01_IoR.$dtl_peg_no);
					
					for (SlsAct_Upd01_HdrR slsHdrR : _hdrL) {
						
						if (MAC_DATA_CRUD_TYP.isUPD(slsHdrR.data_crud_typ())) {
							
							for(SlsAct_Upd01_DtlR dtlR : splitBefDtlL.subList(up1Idxkey, slsHdrR.hdr_peg_no())) {
								
								if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
									continue;
								}
								
								MCIndexKey idxkey = _dtlL.createIndex(SlsAct_Upd01_DtlR.$new_hdr_peg_no, SlsAct_Upd01_DtlR.$dtl_peg_no);
								if (!_dtlL.contains(idxkey, slsHdrR.new_hdr_peg_no(), dtlR.dtl_peg_no())) {
									
									SlsAct_Upd01_DtlR delR = dtlR.clone();
									delR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
									delR.setStatus(Status.DELETE);
									up1().add(delR);
									
									MCList<SlsAct_Upd01_IoR> subIoTgtL = splitBefIoL.subList(up2Idxkey, dtlR.hdr_peg_no(), dtlR.dtl_peg_no());
									
									if (!subIoTgtL.isEmpty()) {
										
										subIoTgtL = subIoTgtL.clone();
										subIoTgtL.setValueNE(SlsAct_Upd01_IoR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
										subIoTgtL.setStatus(Status.DELETE);
										up2().addAll(subIoTgtL.clone());
									}
								}
							}
						}
					}
				}
				else {
					_hdrL.add(hdrR);
					_dtlL.addAll(dtlL);
					_ioL.addAll(ioL);
				}
			}
		}
		/**
		 * 対象が仕入直送の売上返品か判断する。
		 * @param dtlL
		 * @return 仕入直送の売上返品の場合にtrue
		 */
		protected boolean isDdlvSlsRet(MCList<SlsAct_Upd01_DtlR> dtlL) {
			for (SlsAct_Upd01_DtlR dtlR : dtlL) {
				if (!isNull(dtlR.purc_act_d_no())) {
					return true;
				}
			}
			return false;
		}
		
		/**
		 * 仕入直送売上のチェックを行う。<br>
		 * 売上明細に計画外明細のみ存在する場合に、エラーとする。
		 */
		protected void chkDdlvSls() {
			
			boolean uplndOnlyFlg = true;
			
			MCIndexKey idxkey = _dtlL.createIndex(SlsAct_Upd01_DtlR.$new_hdr_peg_no);
			
			for (SlsAct_Upd01_HdrR slsHdrR : _hdrL) {
				
				uplndOnlyFlg = true;
				
				if (!slsHdrR.ddlv_sls_flg() || MAC_DATA_CRUD_TYP.isDEL(slsHdrR.data_crud_typ())) {
					continue;
				}
				
				
				for(SlsAct_Upd01_DtlR dtlR :_dtlL.subList(idxkey, slsHdrR.new_hdr_peg_no())) {
					
					if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) && !isNull(dtlR.slo_d_no())) {
						uplndOnlyFlg = false;
						break;
					}
				}
				
				if (uplndOnlyFlg) {
					throw new MCAppException(MSBBL0259);
				}
			}
		}
		
		/**
		 * 得意先がインボイス取引対象か判断する
		 * @param cst_cd　得意先ＣＤ
		 * @return　取引先マスタの得意先インボイス取引対象ＦＬＧ
		 */
		protected boolean isIvTgt(String cst_cd) {
			
			// 取引先マスタよりインボイス取引対象
			MAM_BP_R cst = getCstCache(cst_cd);
			return cst.cst_iv_flg();
		}
		
		protected void makeSlsHdr(SlsAct_Upd01_HdrR hdrR) {
			
		}
		
		protected MCList<SlsAct_Upd01_DtlR> getDtlData(MCList<SlsAct_Upd01_DtlR> orgDtlL, MCNumber peg_no, String idxKey) {
			
			// 指定のリストより指定の紐付きＮＯが合致する明細を取得
			MCIndexKey idx = orgDtlL.createIndex(idxKey);
			MCList<SlsAct_Upd01_DtlR> dtlTgtL = orgDtlL.subList(idx, peg_no);
			dtlTgtL.sort(SlsAct_Upd01_DtlR.$disp_seq);
			MCList<SlsAct_Upd01_DtlR> dtlL = MCList.create(SlsAct_Upd01_DtlR.class);
			
			// 行削除行は除外する
			for (SlsAct_Upd01_DtlR tmpDtlR : dtlTgtL) {
				if (isNull(tmpDtlR.stk_mng_typ())) {
					MAM_ITM_R itmR = getItmCache(tmpDtlR.itm_cd(), tmpDtlR.itm_sub1(), tmpDtlR.itm_sub2(), tmpDtlR.itm_sub3());
					if (!isNull(itmR)) {
						tmpDtlR.stk_mng_typ(itmR.stk_mng_typ());
					}
				}
				if (tmpDtlR.isStatusDelete()) {
					continue;
				}
				// 納品先がNULLの場合はNULL_VALを持たせておく
				if (isNull(tmpDtlR.dlv_cd())) {
					tmpDtlR.dlv_cd(MAC_STR.NULL_VAL.value());
				}
				dtlL.add(tmpDtlR);
			}
			
			return dtlL;
		}
		
		protected MCList<SlsAct_Upd01_IoR> getIoData(MCNumber hdr_peg_no) {
			
			MCIndexKey idx = up2().createIndex(SlsAct_Upd01_IoR.$hdr_peg_no);
			MCList<SlsAct_Upd01_IoR> ioTgtL = up2().subList(idx, hdr_peg_no);
			ioTgtL.sort(SlsAct_Upd01_IoR.$dtl_peg_no, SlsAct_Upd01_IoR.$io_peg_no);
			MCList<SlsAct_Upd01_IoR> ioL = MCList.create(SlsAct_Upd01_IoR.class);
			
			// 行削除行は除外する
			for (SlsAct_Upd01_IoR tmpIoR : ioTgtL) {
				if (tmpIoR.isStatusDelete()) {
					continue;
				}
				ioL.add(tmpIoR);
			}
			
			return ioL;
		}
		
		/**
		 * 取引先マスタの取得（得意先）
		 * @param cst_cd
		 * @return
		 */
		protected MAM_BP_R getCstCache(String cst_cd) {
			return _cacheCst.get(cst_cd);
		}
		
		protected void crtCstCache(MCList<SlsAct_Upd01_HdrR> hdrL) {
			_cacheCst = null;
			_cacheCst = new FXUCL_MCDbcCache<MAM_BP_R>(
					MCQueryApiBuilder.create(MAM_BP_R.create("T")), hdrL,
					SlsAct_Upd01_HdrR.$cst_cd);
		}
		
		/**
		 * 取引先マスタの取得（請求先）
		 * @param bcst_cd
		 * @return
		 */
		protected MAM_BP_R getBcstCache(String bcst_cd) {
			return _cacheBcst.get(bcst_cd);
		}
		
		protected void crtBcstCache(MCList<SlsAct_Upd01_HdrR> hdrL) {
			_cacheBcst = null;
			_cacheBcst = new FXUCL_MCDbcCache<MAM_BP_R>(
					MCQueryApiBuilder.create(MAM_BP_R.create("T")), hdrL,
					SlsAct_Upd01_HdrR.$bcst_cd);
		}
		
		/**
		 * 取引先マスタの取得（納品先）
		 * @param dlv_cd
		 * @return
		 */
		protected MAM_BP_R getDlvCache(String dlv_cd) {
			return _cacheDlv.get(dlv_cd);
		}
		
		protected void crtDlvCache(MCList<SlsAct_Upd01_DtlR> dtlL) {
			_cacheDlv = null;
			_cacheDlv = new FXUCL_MCDbcCache<MAM_BP_R>(
					MCQueryApiBuilder.create(MAM_BP_R.create("T")), dtlL,
					SlsAct_Upd01_DtlR.$dlv_cd);
		}
		
		/**
		 * 取引マスタの取得
		 * @param trd_cd
		 * @return
		 */
		protected MAM_TRD_R getTrdCache(String trd_cd) {
			return _cacheTrd.get(trd_cd);
		}
		
		protected void crtTrdCache(MCList<SlsAct_Upd01_HdrR> hdrL) {
			_cacheTrd = null;
			_cacheTrd = new FXUCL_MCDbcCache<MAM_TRD_R>(
					MCQueryApiBuilder.create(MAM_TRD_R.create("T")), hdrL,
					SlsAct_Upd01_HdrR.$trd_cd);
		}
		
		/**
		 * 伝票帳票マスタの取得
		 * @param form_cd
		 * @return
		 */
		protected MAM_SLIP_FORM_R getSlipFormCache(String form_cd) {
			return _cacheSlipForm.get(form_cd);
		}
		
		protected void crtSlipFormCache(MCList<SlsAct_Upd01_HdrR> hdrL) {
			_cacheSlipForm = null;
			_cacheSlipForm = new FXUCL_MCDbcCache<MAM_SLIP_FORM_R>(
					MCQueryApiBuilder.create(MAM_SLIP_FORM_R.create("T")), hdrL,
					SlsAct_Upd01_HdrR.$slip_form_cd);
		}
		
		/**
		 * 1伝票に持たせることができる明細件数の最大値を取得する
		 * 
		 * @return
		 */
		protected int getMaxLineCnt() {
			
			return _maxLineCnt;
		}
		
		/**
		 * 部門マスタの取得
		 * @param dptCd
		 * @param baseDt
		 * @return
		 */
		protected MAM_DPT_R getDptCache(String dptCd, MCDate baseDt) {
			return _cacheDpt.get(baseDt, dptCd);
		}
		
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _getDptCache() {
			MCList<MCRow> bindL = MCList.create(MCRow.class);
			if (_cacheDpt == null){
				_cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(
						MCQueryApiBuilder.create(MAM_DPT_R.create("T")), bindL,
						MAM_DPT_R.$dpt_cd);
			}
			return _cacheDpt;
		}
	}
	
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
			_dpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(
					MCQueryApiBuilder.create(MAM_DPT_R.create("T")), bindL,
					MAM_DPT_R.$dpt_cd);
		}
		return _dpt;
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
	
	/**
	 * SlsAct_Upd02オペレーション.<p>
	 *
	 * 売上実績を登録する（出荷実績サービスより呼び出す）<br>
	 */
	public class SlsAct_Upd02 extends MSBBL_SlsActService_MC_A.SlsAct_Upd02 {
		// 売上実績SV呼出データを保持
		protected MCList<SlsAct_Upd01_DtlR> _dtlL = MCList.create(SlsAct_Upd01_DtlR.class);
		protected MCList<SlsAct_Upd01_IoR> _ioL = MCList.create(SlsAct_Upd01_IoR.class);
		protected MCList<SlsAct_Upd01_HdrR> _hdrL = MCList.create(SlsAct_Upd01_HdrR.class);
		protected int _ioCnt = 0;
		
		protected FXUCL_MCDbcCacheStEnd<MAVM_USR_DPT_R> _cacheUsrDpt;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			// 分割伝票追加処理
			preProc();
			
			// 売上実績SV（SlsAct_Upd01）呼出の電文作成処理
			makeSlsActSvData();
			
			// 売上実績SV呼出
			callSlsActSv();
		}
		
		/**
		 * 売上で納品書分割されていた場合は分割の納品書も処理対象にする
		 */
		protected void preProc() {
			MCList<SlsAct_Upd02_CndR> tmpUpL = MCList.create(SlsAct_Upd02_CndR.class);
			for (SlsAct_Upd02_CndR cndR : up0()) {
				if (!isNull(cndR.dlv_slip_no()) && !MAC_DATA_CRUD_TYP.isCRT(cndR.data_crud_typ())) {
					MCList<SlsAct_Upd02_CndR> splitSlipL = MCList.create(SlsAct_Upd02_CndR.class);
					executeQuery(splitSlipL, MSBBL6010_MST_DLV_SLIP_S4(), cndR);
					if (!isNull(splitSlipL)) {
						tmpUpL.addAll(splitSlipL);
					}
				}
			}
			if (!isNull(tmpUpL)) {
				for (SlsAct_Upd02_CndR tmpR : tmpUpL) {
					tmpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					tmpR.split_flg(true);
					up0().add(tmpR);
				}
			}
		}
		
		/**
		 * 売上実績SV（SlsAct_Upd01）呼出の電文作成処理
		 */
		protected void makeSlsActSvData() {
			int hdr_peg_no = 0;
			for (SlsAct_Upd02_CndR cndR : up0()) {
				
				// 納品書ＮＯ指定
				if (!isNull(cndR.dlv_slip_no())) {
					setDlvSlipData(cndR, ++hdr_peg_no);
				}
				// インボイスＮＯ指定
				else if (!isNull(cndR.iv_no())){
					getViaDlvTy(cndR);
					hdr_peg_no = setIvData(cndR, ++hdr_peg_no);
				}
			}
			
			if (!isNull(_hdrL) && !_hdrL.isEmpty()) {
				// 出荷実績もしくは輸出実績と同時に売上実績計上した場合に、trueに設定する。
				_hdrL.setValueNE(SlsAct_Upd01_HdrR.$ship_act_sync_flg, true);
			}
		}
		
		/**
		 * 納品書ＮＯを元に売上実績SV用電文を編集
		 * 
		 * @param dlv_slip_no
		 */
		protected void setDlvSlipData(SlsAct_Upd02_CndR cndR, int hdr_peg_no) {
			
			// 売上実績SV用ヘッダ電文作成
			SlsAct_Upd01_HdrR slsActHdrR = SlsAct_Upd01_HdrR.create();
			slsActHdrR.addBooleanColumn(MST_DLV_SLIP_R.$slip_prnt_flg);
			
			// 削除時
			if (MAC_DATA_CRUD_TYP.isDEL(cndR.data_crud_typ())) {
				executeQuery(slsActHdrR, MSBBL6010_MST_DLV_SLIP_S2(), cndR);
			}
			// 新規・更新時
			else{
				executeQuery(slsActHdrR, MSBBL6010_MST_DLV_SLIP_S1(), cndR);
			}
			cndR.dlv_slip_seq(slsActHdrR.dlv_slip_seq());
			
			slsActHdrR.hdr_peg_no(hdr_peg_no);				// ヘッダ紐付けＮＯ
			slsActHdrR.data_crud_typ(cndR.data_crud_typ());	// データ更新区分
			// 納税通貨ＣＤが取得できていなければ納税為替レートもクリア
			if (isNull(slsActHdrR.ptax_cur_cd())){
				slsActHdrR.ptax_xrate(null);				// 納税為替レート
			}
			if (MAC_DATA_CRUD_TYP.isCRT(cndR.data_crud_typ())) {
				slsActHdrR.can_ac_dt(null);					// 取消計上日
			}
			else {
				slsActHdrR.can_ac_dt(cndR.can_ac_dt());
			}
			slsActHdrR.sls_basis_typ(MAC_SLS_BASIS_TYP.SHIP_BASIS.value());	// 売上計上区分（出荷基準）
			slsActHdrR.aprv_flg(false);						// 承認対象ＦＬＧ
			if (slsActHdrR.getBoolean(MST_DLV_SLIP_R.$slip_prnt_flg)) {
				slsActHdrR.dlv_slip_prnt_flg(true);			// 納品書即時発行ＦＬＧ
			}
			else {
				slsActHdrR.dlv_slip_prnt_flg(false);			// 納品書即時発行ＦＬＧ	
			}
			if (cndR.split_flg()) {
				slsActHdrR.ship_act_service_via_flg(false);		// 出荷実績ＳＶ経由ＦＬＧ
			}
			else {
				slsActHdrR.ship_act_service_via_flg(true);		// 出荷実績ＳＶ経由ＦＬＧ
			}
			slsActHdrR.slip_split_non_flg(true);			// 伝票分割不要ＦＬＧ
			slsActHdrR.lot_chk_off_flg(false);				// ロットチェック無視ＦＬＧ
			slsActHdrR.amt_calc_flg(true);						// 金額計算ＦＬＧ
			
			// 売上実績SV用明細電文作成
			MCList<SlsAct_Upd01_DtlR> slsActDtlL = MCList.create(SlsAct_Upd01_DtlR.class);
			// 削除時
			if (MAC_DATA_CRUD_TYP.isDEL(cndR.data_crud_typ())) {
				executeQuery(slsActDtlL, MSBBL6010_MST_DLV_SLIP_D_S2(), cndR);
				for (SlsAct_Upd01_DtlR slsActDtlR : slsActDtlL) {
					// 納品書明細ＮＯに紐づく出荷実績明細の出荷引当状況に紐づく出荷引当状況の出荷予定ＮＯ
					MCList<SlsAct_Upd01_DtlR> tmpL = MCList.create(SlsAct_Upd01_DtlR.class);
					executeQuery(tmpL, MSBBL6010_MST_SHIP_ACT_D_S6(), slsActDtlR);
					if (!isNull(tmpL)) {
						if (tmpL.size() == 1) {
							slsActDtlR.ship_schd_no(tmpL.get(0).ship_schd_no());
						}
					}
				}
			}
			// 新規・更新時
			else {
				cndR.addStringColumn("wg_cd");
				cndR.setValue("wg_cd", slsActHdrR.wg_cd());
				executeQuery(slsActDtlL, MSBBL6010_MST_DLV_SLIP_D_S1(), cndR);

				MCList<MST_SLS_ACT_D_R> oldSlsActDL = null;
				MCIndexKey ik = null;
				if (MAC_DATA_CRUD_TYP.isUPD(cndR.data_crud_typ())) {
					oldSlsActDL = MCList.create(MST_SLS_ACT_D_R.class);
					MST_SLS_ACT_D_R oldSlsActDL_t = MST_SLS_ACT_D_R.create("T");
					MCQueryApiBuilder oldSlsActDL_bldr = MCQueryApiBuilder.create(oldSlsActDL_t);
					MST_SLS_ACT_R t2 = MST_SLS_ACT_R.create("T2");
					MST_DLV_SLIP_D_R t3 = MST_DLV_SLIP_D_R.create("T3");
					MST_DLV_SLIP_R t4 = MST_DLV_SLIP_R.create("T4");
					oldSlsActDL_bldr.setSelect(oldSlsActDL_t.sls_act_no);
					oldSlsActDL_bldr.addSelect(oldSlsActDL_t.sls_act_d_no);
					oldSlsActDL_bldr.addSelect(oldSlsActDL_t.sls_act_d_seq);
					oldSlsActDL_bldr.addSelect(oldSlsActDL_t.dlv_slip_d_no);
					oldSlsActDL_bldr.addInnerJoin(t2,
							bracket(oldSlsActDL_t.sls_act_no.eq(t2.sls_act_no)
									.and(oldSlsActDL_t.sls_act_seq.eq(t2.sls_act_seq))));
					oldSlsActDL_bldr.addInnerJoin(t3,
							bracket(oldSlsActDL_t.dlv_slip_d_no.eq(t3.dlv_slip_d_no)));
					oldSlsActDL_bldr.addInnerJoin(t4,
							bracket(t3.dlv_slip_no.eq(t4.dlv_slip_no)
									.and(t3.dlv_slip_seq.eq(t4.dlv_slip_seq))));
					oldSlsActDL_bldr.setWhere(t4.dlv_slip_no.eq(bind("dlv_slip_no")));
					oldSlsActDL_bldr.addWhereWithAnd(t4.dlv_slip_seq.eq(bind("dlv_slip_seq")));
					oldSlsActDL_bldr.addWhereWithAnd(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
					dbSelect("MSBBL6010_MST_SLS_ACT_D_S02", oldSlsActDL, oldSlsActDL_bldr, cndR);
					
					ik = oldSlsActDL.createIndex(MST_SLS_ACT_D_R.$dlv_slip_d_no);
				}
				
				for (SlsAct_Upd01_DtlR slsActDtlR : slsActDtlL) {
					if (oldSlsActDL != null) {
						MST_SLS_ACT_D_R oldSlsActDR = oldSlsActDL.getFirst(ik, slsActDtlR.dlv_slip_d_no());
						if (oldSlsActDR != null) {
							slsActDtlR.sls_act_no(oldSlsActDR.sls_act_no());
							slsActDtlR.sls_act_d_no(oldSlsActDR.sls_act_d_no());
							slsActDtlR.sls_act_d_seq(oldSlsActDR.sls_act_d_seq());
						}
					}
					// 納品書明細ＮＯに紐づく出荷予定ＮＯ、売上予定ＮＯの設定
					// 納品書明細ＮＯ：出荷予定・売上予定が１：１の場合にのみセット
					MCList<SlsAct_Upd01_DtlR> tmpL = MCList.create(SlsAct_Upd01_DtlR.class);
					executeQuery(tmpL, MSBBL6010_MST_SLS_SCHD_S2(), slsActDtlR);
					if (!isNull(tmpL)) {
						if (tmpL.size() == 1) {
							slsActDtlR.sls_schd_no(tmpL.get(0).sls_schd_no());
							slsActDtlR.ship_schd_no(tmpL.get(0).ship_schd_no());
						}
					}
					// 納品書明細ＮＯに紐づく出荷実績明細の情報設定
					MCList<MST_SHIP_ACT_D_R> shipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
					MST_SHIP_ACT_D_R shipActDL_t = MST_SHIP_ACT_D_R.create("T");
					MCQueryApiBuilder shipActDL_bldr = MCQueryApiBuilder.create(shipActDL_t);
					shipActDL_bldr.setWhere(shipActDL_t.dlv_slip_d_no.eq(bind("1")), slsActDtlR.dlv_slip_d_no());
					shipActDL_bldr.addWhereWithAnd(shipActDL_t.can_flg.eq(value(false)));
					dbSelect("MSBBL6010_MST_SHIP_ACT_D_S02", shipActDL, shipActDL_bldr);
					if (!isNull(shipActDL)) {
						if (shipActDL.size() == 1) {
							slsActDtlR.loc_cd(shipActDL.get(0).ship_loc_cd());
							slsActDtlR.str_ln_cd(shipActDL.get(0).ship_str_ln_cd());
							slsActDtlR.gd_cd(shipActDL.get(0).gd_cd());
							slsActDtlR.stk_mng_typ(shipActDL.get(0).stk_mng_typ());
							slsActDtlR.sundry_itm_flg(shipActDL.get(0).sundry_itm_flg());
						}
						else {
							slsActDtlR.stk_mng_typ(shipActDL.get(0).stk_mng_typ());
							slsActDtlR.sundry_itm_flg(shipActDL.get(0).sundry_itm_flg());
						}
						if (isNull(slsActDtlR.rsn_cd())) {
							slsActDtlR.rsn_cd(shipActDL.get(0).rsn_cd());
						}
						if (isNull(slsActDtlR.bd_dpt_cd())) {
							slsActDtlR.bd_dpt_cd(shipActDL.get(0).bd_dpt_cd());
						}
					}
				}
				
				// 訂正で行削除対象となった売上実績明細を取得
				if (MAC_DATA_CRUD_TYP.isUPD(slsActHdrR.data_crud_typ())) {
					MCList<MST_SLS_ACT_D_R> tmpSlsActDL = MCList.create(MST_SLS_ACT_D_R.class);
					MST_SLS_ACT_D_R tmpSlsActDL_t = MST_SLS_ACT_D_R.create("T");
					MCQueryApiBuilder tmpSlsActDL_bldr = MCQueryApiBuilder.create(tmpSlsActDL_t);
					tmpSlsActDL_bldr.setSelect(tmpSlsActDL_t.sls_act_d_no,
							tmpSlsActDL_t.sls_act_d_seq, tmpSlsActDL_t.ship_schd_no,
							tmpSlsActDL_t.sls_schd_no);
					tmpSlsActDL_bldr.setWhere(tmpSlsActDL_t.sls_act_no.eq(bind("1")), slsActHdrR.sls_act_no());
					tmpSlsActDL_bldr.addWhereWithAnd(tmpSlsActDL_t.sls_act_seq.eq(bind("1")), slsActHdrR.sls_act_seq());
					dbSelect("MSBBL6010_MST_SLS_ACT_D_S03", tmpSlsActDL, tmpSlsActDL_bldr);
					
					for (MST_SLS_ACT_D_R tmpSlsActDR : tmpSlsActDL) {
						MCList<SlsAct_Upd01_DtlR> tmpL = slsActDtlL.subList(SlsAct_Upd01_DtlR.$sls_act_d_no, tmpSlsActDR.sls_act_d_no());
						if (isNull(tmpL)) {
							SlsAct_Upd01_DtlR slsActDtlR = SlsAct_Upd01_DtlR.create();
							copy(slsActDtlR, tmpSlsActDR, createMap_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R());
							slsActDtlR.setStatus(Status.DELETE);
							slsActDtlL.add(slsActDtlR);
						}
					}
				}
				
				// 組織変更対応
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
				
				slsActDtlL.addDateColumn(SlsAct_Upd01_HdrR.$ac_dt);
				slsActDtlL.addBooleanColumn("err_flg");
				slsActDtlL.setDateNE(SlsAct_Upd01_HdrR.$ac_dt, slsActHdrR.ac_dt());
				// 負担部門
				MAUCL_DptUtil.setDpt(slsActDtlL, SlsAct_Upd01_DtlR.$bd_dpt_cd, null, SlsAct_Upd01_HdrR.$ac_dt, true);
				if (slsActDtlL.subList("err_flg", true).size() > 0) {
					throwDptErr();
				}
				if (!isGetMamUsrAcl(slsActHdrR.ac_dt(), slsActHdrR.sls_usr_cd(), slsActHdrR.sls_dpt_cd())) {
					MCMessagePool.add(new MCMessage(MSBBL0309, toYMDString(slsActHdrR.ac_dt()), slsActHdrR.sls_usr_cd(), slsActHdrR.sls_dpt_cd()));
					throwDptErr();
				}
			}
			
			boolean wtaxRateFlg = false;
			// 取引通貨＝基準通貨＝納税通貨または取引通貨＝基準通貨かつ納税通貨NULLの場合源泉税額を指定
			if ((isSame(slsActHdrR.trd_cur_cd(), slsActHdrR.base_cur_cd()) && 
				isSame(slsActHdrR.trd_cur_cd(), slsActHdrR.ptax_cur_cd())) ||
				(isSame(slsActHdrR.trd_cur_cd(), slsActHdrR.base_cur_cd()) && 
				isNull(slsActHdrR.ptax_cur_cd()))) {
				wtaxRateFlg = true;
			}
			
			MCList<SlsAct_Upd01_IoR> slsActIoL = MCList.create(SlsAct_Upd01_IoR.class);
			
			int dtlCnt = 0;
			int ioCnt = 0;
			for (SlsAct_Upd01_DtlR slsActDtlR : slsActDtlL) {
				if (slsActDtlR.sls_cststk_flg()) {
					if (isNull(slsActDtlR.sls_schd_no()) && isNull(slsActDtlR.ship_schd_no())) {
						continue;
					}
				}
				dtlCnt++;
				slsActDtlR.hdr_peg_no(slsActHdrR.hdr_peg_no());			// ヘッダ紐付けＮＯ
				slsActDtlR.dtl_peg_no(dtlCnt);							// 明細紐付けＮＯ
				if (isNull(slsActDtlR.data_crud_typ())) {
					if (MAC_DATA_CRUD_TYP.isUPD(cndR.data_crud_typ()) && isNull(slsActDtlR.sls_act_d_no())) {
						slsActDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());	// データ更新区分（新規）
					}
					else {
						slsActDtlR.data_crud_typ(slsActHdrR.data_crud_typ());	// データ更新区分
					}
				}
				
				if (!MAC_DATA_CRUD_TYP.isDEL(slsActDtlR.data_crud_typ())) {
					slsActDtlR.disp_seq(dtlCnt);						// 表示順
					if (!isNull(slsActDtlR.slo_d_no())) {
						slsActDtlR.upri_not_tgt_flg(true);				// 単価再取得対象外ＦＬＧ
					}
					if (!wtaxRateFlg) {
						slsActDtlR.wtax_rate(null);						// 源泉税率
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
				
				// 明細に紐づく売上実績SV用詳細電文も作成
				MCList<SlsAct_Upd01_IoR> tmpIoL = MCList.create(SlsAct_Upd01_IoR.class);
				// 削除時
				if (MAC_DATA_CRUD_TYP.isDEL(cndR.data_crud_typ())) {
					executeQuery(tmpIoL, MSBBL6010_MST_SHIP_ACT_D_S2(), slsActDtlR);
				}
				// 新規・更新時
				else {
					executeQuery(tmpIoL, MSBBL6010_MST_SHIP_ACT_D_S1(), slsActDtlR);
					
					// 行削除行の情報を取得
					if (MAC_DATA_CRUD_TYP.isDEL(slsActDtlR.data_crud_typ())) {
						MCList<MST_SLS_ACT_IO_R> tmpSlsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
						MST_SLS_ACT_IO_R tmpSlsActIoL_t = MST_SLS_ACT_IO_R.create("T");
						MCQueryApiBuilder tmpSlsActIoL_bldr = MCQueryApiBuilder.create(tmpSlsActIoL_t);
						tmpSlsActIoL_bldr.setSelect(tmpSlsActIoL_t.sls_act_io_no,
								tmpSlsActIoL_t.sls_act_io_seq,
								tmpSlsActIoL_t.ship_act_d_no);
						tmpSlsActIoL_bldr.setWhere(
								tmpSlsActIoL_t.sls_act_d_no.eq(bind("1")),
								slsActDtlR.sls_act_d_no());
						tmpSlsActIoL_bldr.addWhereWithAnd(
								tmpSlsActIoL_t.sls_act_d_seq.eq(bind("1")),
								slsActDtlR.sls_act_d_seq());
						dbSelect("MSBBL6010_MST_SLS_ACT_IO_S01", tmpSlsActIoL, tmpSlsActIoL_bldr);
						
						for (MST_SLS_ACT_IO_R tmpSlsActIoR : tmpSlsActIoL) { 
							SlsAct_Upd01_IoR tmpIoR = SlsAct_Upd01_IoR.create();
							copy(tmpIoR, tmpSlsActIoR, createMap_SlsAct_Upd01_IoR_MST_SLS_ACT_IO_R());
							tmpIoR.setStatus(Status.DELETE);
							tmpIoL.add(tmpIoR);
						}
					}
				}
				for (SlsAct_Upd01_IoR tmpIoR : tmpIoL) {
					tmpIoR.hdr_peg_no(slsActHdrR.hdr_peg_no());			// ヘッダ紐付けＮＯ
					tmpIoR.dtl_peg_no(slsActDtlR.dtl_peg_no());			// 明細紐付けＮＯ
					
					// 訂正で行削除（詳細のみ行削除）されていないか
					if (MAC_DATA_CRUD_TYP.isUPD(cndR.data_crud_typ())) {
						if (isNull(tmpIoR.data_crud_typ()) && !isNull(tmpIoR.sls_act_io_no()) && !isNull(tmpIoR.ship_act_d_no())) {
							MST_SHIP_ACT_D_R shipActDR = MST_SHIP_ACT_D_R.create("T");
							MCQueryApiBuilder shipActDR_bldr = MCQueryApiBuilder.create(shipActDR);
							shipActDR_bldr.setSelect(shipActDR.ship_act_d_no);
							shipActDR_bldr.setWhere(shipActDR.ship_act_d_no.eq(bind("1")), tmpIoR.ship_act_d_no());
							shipActDR_bldr.addWhereWithAnd(shipActDR.can_flg.eq(value(false)));
							if (dbSelect("MSBBL6010_MST_SHIP_ACT_D_S03", shipActDR, shipActDR_bldr) == 0) {
								tmpIoR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value()); // データ更新区分（削除）
								tmpIoR.setStatus(Status.DELETE);
							}
						}
					}
					
					if (isNull(tmpIoR.data_crud_typ())) {
						if (isNull(tmpIoR.sls_act_io_no())) {
							tmpIoR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());	// データ更新区分（新規）
						}
						else {
							tmpIoR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());	// データ更新区分（更新）
						}
					}
					tmpIoR.io_peg_no(++ioCnt);							// 受払紐付けＮＯ
					slsActIoL.add(tmpIoR);
				}
			}
			
			// 売上実績SV用電文に追加
			_hdrL.add(slsActHdrR);
			for (SlsAct_Upd01_DtlR slsActDtlR : slsActDtlL) {
				if (slsActDtlR.sls_cststk_flg()) {
					if (isNull(slsActDtlR.sls_schd_no()) && isNull(slsActDtlR.ship_schd_no())) {
						continue;
					}
				}
				_dtlL.add(slsActDtlR);
			}
			_ioL.addAll(slsActIoL);
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
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
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
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_schd_no, MST_SLS_ACT_D_R.$ship_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_schd_no, MST_SLS_ACT_D_R.$sls_schd_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		
		/**
		 * インボイスの配送先経由区分取得
		 * 
		 * @param cndR
		 */
		protected void getViaDlvTy(SlsAct_Upd02_CndR cndR) {
			MST_IV_R tmpIvR = MST_IV_R.create("T");
			MCQueryApiBuilder tmpIvR_bldr = MCQueryApiBuilder.create(tmpIvR);
			tmpIvR_bldr.setSelect(tmpIvR.via_dlv_typ);
			tmpIvR_bldr.setWhere(tmpIvR.iv_no.eq(bind("1")), cndR.iv_no());
			dbSelect("MSBBL6010_MST_IV_S02", tmpIvR, tmpIvR_bldr);
			cndR.via_dlv_typ(tmpIvR.via_dlv_typ());
		}
		
		/**
		 * インボイスＮＯを元に売上実績SV用電文を編集
		 * 
		 * @param iv_no
		 */
		protected int setIvData(SlsAct_Upd02_CndR cndR, int hdr_peg_no) {
			// インボイスヘッダ・明細情報を取得
			MCList<SlsAct_Upd02_IvLR> ivDtlL = MCList.create(SlsAct_Upd02_IvLR.class);
			if (!MAC_DATA_CRUD_TYP.isDEL(cndR.data_crud_typ())) {
				if (MAC_VIA_DLV_TYP.isVIA(cndR.via_dlv_typ())) {
					executeQuery(ivDtlL, MSBBL6010_MST_IV_S1(), cndR);
				}
				else if (cndR.use_iv_ship_act_map()) {
					// 出荷基準かつインボイス単位出荷ではない場合、インボイス出荷実績を使って出荷実績を取得する
					executeQuery(ivDtlL, MSBBL6010_MST_IV_S4(), cndR);
				}
				else {
					executeQuery(ivDtlL, MSBBL6010_MST_IV_S3(), cndR);
				}
			}
			else {
				executeQuery(ivDtlL, MSBBL6010_MST_IV_S2(), cndR);
				// 削除の時はインボイスＮＯに紐付く売上実績・売上実績受払を取得
				MCList<MST_SLS_ACT_R> slsActL = MCList.create(MST_SLS_ACT_R.class);
				MST_SLS_ACT_R slsActL_t = MST_SLS_ACT_R.create("T");
				MCQueryApiBuilder slsActL_bldr = MCQueryApiBuilder.create(slsActL_t);
				slsActL_bldr.setSelect(slsActL_t.sls_act_no, slsActL_t.sls_act_seq,
						slsActL_t.sls_act_rev, slsActL_t.trd_cd, slsActL_t.trd_ptn_typ,
						slsActL_t.ac_dt);
				slsActL_bldr.setWhere(slsActL_t.iv_no.eq(bind("1")), cndR.iv_no());
				slsActL_bldr.addWhereWithAnd(slsActL_t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
				dbSelect("MSBBL6010_MST_SLS_ACT_S03", slsActL, slsActL_bldr);
				
				int dtlCnt = 0;
				int ioCnt = 0;
				for (MST_SLS_ACT_R slsActR : slsActL) {
					SlsAct_Upd01_HdrR slsActHdrR = SlsAct_Upd01_HdrR.create();
					slsActHdrR.hdr_peg_no(hdr_peg_no++);						// ヘッダ紐付ＮＯ
					slsActHdrR.data_crud_typ(cndR.data_crud_typ());				// データ更新区分
					slsActHdrR.sls_act_no(slsActR.sls_act_no());				// 売上実績ＮＯ
					slsActHdrR.sls_act_seq(slsActR.sls_act_seq());				// 売上実績連番
					slsActHdrR.sls_act_rev(slsActR.sls_act_rev());				// 売上実績改訂番号
					slsActHdrR.trd_cd(slsActR.trd_cd());						// 取引ＣＤ
					slsActHdrR.trd_ptn_typ(slsActR.trd_ptn_typ());				// 取引パタン区分
					slsActHdrR.iv_no(cndR.iv_no());								// インボイスＮＯ
					slsActHdrR.can_ac_dt(cndR.can_ac_dt());						// 取消計上日
					slsActHdrR.slip_split_non_flg(true);						// 伝票分割不要ＦＬＧ
					slsActHdrR.no_cred_upd_flg(true);							// 与信更新不要ＦＬＧ
					
					MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
					MST_SLS_ACT_D_R slsActDL_t = MST_SLS_ACT_D_R.create("T");
					MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(slsActDL_t);
					slsActDL_bldr.setSelect(slsActDL_t.sls_act_d_no,
							slsActDL_t.sls_act_d_seq, slsActDL_t.ship_schd_no,
							slsActDL_t.sls_schd_no);
					
					slsActDL_bldr.setWhere(slsActDL_t.sls_act_no.eq(bind("1")), slsActR.sls_act_no());
					slsActDL_bldr.addWhereWithAnd(slsActDL_t.sls_act_seq.eq(bind("1")), slsActR.sls_act_seq());
					dbSelect("MSBBL6010_MST_SLS_ACT_D_S04", slsActDL, slsActDL_bldr);
					
					// 売上実績明細電文
					for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
						SlsAct_Upd01_DtlR slsActDtlR = SlsAct_Upd01_DtlR.create();
						slsActDtlR.hdr_peg_no(slsActHdrR.hdr_peg_no());					// ヘッダ紐付けＮＯ
						slsActDtlR.dtl_peg_no(++dtlCnt);								// 明細紐付けＮＯ
						slsActDtlR.data_crud_typ(cndR.data_crud_typ());					// データ更新区分
						slsActDtlR.sls_act_d_no(slsActDR.sls_act_d_no());				// 売上実績明細ＮＯ
						slsActDtlR.sls_act_d_seq(slsActDR.sls_act_d_seq());				// 売上実績明細連番
						slsActDtlR.ship_schd_no(slsActDR.ship_schd_no());				// 出荷予定ＮＯ
						slsActDtlR.sls_schd_no(slsActDR.sls_schd_no());					// 売上予定ＮＯ
						_dtlL.add(slsActDtlR);
						
						// 売上実績受払電文
						MCList<MST_SLS_ACT_IO_R> slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
						MST_SLS_ACT_IO_R slsActIoL_t = MST_SLS_ACT_IO_R.create("T");
						MCQueryApiBuilder slsActIoL_bldr = MCQueryApiBuilder.create(slsActIoL_t);
						slsActIoL_bldr.setWhere(slsActIoL_t.sls_act_d_no.eq(bind("1")), slsActDR.sls_act_d_no());
						slsActIoL_bldr.addWhereWithAnd(slsActIoL_t.sls_act_d_seq.eq(bind("1")), slsActDR.sls_act_d_seq());
						slsActIoL_bldr.setSelect(slsActIoL_t.sls_act_io_no, slsActIoL_t.sls_act_io_seq);
						dbSelect("MSBBL6010_MST_SLS_ACT_IO_S02", slsActIoL, slsActIoL_bldr);
						
						for (MST_SLS_ACT_IO_R tmpSlsActIoR : slsActIoL) {
							SlsAct_Upd01_IoR slsActIoR = SlsAct_Upd01_IoR.create();
							slsActIoR.hdr_peg_no(slsActHdrR.hdr_peg_no());				// ヘッダ紐付けＮＯ
							slsActIoR.dtl_peg_no(slsActDtlR.dtl_peg_no());				// 明細紐付けＮＯ
							slsActIoR.io_peg_no(++ioCnt);								// 受払紐付けＮＯ
							slsActIoR.sls_act_io_no(tmpSlsActIoR.sls_act_io_no());		// 売上実績受払ＮＯ
							slsActIoR.sls_act_io_seq(tmpSlsActIoR.sls_act_io_seq());	// 売上実績受払連番
							slsActIoR.data_crud_typ(cndR.data_crud_typ());				// データ更新区分
							_ioL.add(slsActIoR);
						}
					}
					
					_hdrL.add(slsActHdrR);
				}
				
				return hdr_peg_no;
			}
			
			int dtlCnt = 0;
			// 取得した単位で売上実績を作成
			for (SlsAct_Upd02_IvLR ivDtlR : ivDtlL) {
				
				if (!MAC_DATA_CRUD_TYP.isCRT(cndR.data_crud_typ())) {
					// 対応する売上実績情報を取得
					executeQuery(ivDtlR, MSBBL6010_MST_SLS_ACT_S2(), ivDtlR);
				}
				
				// 売上実績ヘッダ電文
				SlsAct_Upd01_HdrR slsActHdrR = SlsAct_Upd01_HdrR.create();
				
				copy(slsActHdrR, ivDtlR, createMap_SlsAct_Upd01_HdrR_SlsAct_Upd02_IvLR());
				slsActHdrR.hdr_peg_no(hdr_peg_no++);							// ヘッダ紐付ＮＯ
				slsActHdrR.data_crud_typ(cndR.data_crud_typ());					// データ更新区分
				slsActHdrR.amt_calc_flg(true);								// 金額計算ＦＬＧ
				if (!MAC_DATA_CRUD_TYP.isCRT(cndR.data_crud_typ())) {
					slsActHdrR.can_ac_dt(cndR.can_ac_dt());						// 取消計上日
				}
				if (!MAC_DATA_CRUD_TYP.isDEL(cndR.data_crud_typ())) {
					if (isSame(ivDtlR.base_cur_cd(), ivDtlR.trd_cur_cd())) {
						slsActHdrR.xrate(1);									// 為替レート
					}
					if (isSame(ivDtlR.ptax_cur_cd(), ivDtlR.trd_cur_cd())) {
						slsActHdrR.ptax_xrate(1);								// 納税為替レート
					}
					slsActHdrR.sls_basis_typ(MAC_SLS_BASIS_TYP.SHIP_BASIS.value());	// 売上計上区分
				}
				
				slsActHdrR.slip_split_non_flg(true);							// 伝票分割不要ＦＬＧ
				slsActHdrR.no_cred_upd_flg(true);								// 与信更新不要ＦＬＧ
				
				// 売上実績明細電文
				SlsAct_Upd01_DtlR slsActDtlR = SlsAct_Upd01_DtlR.create();
				copy(slsActDtlR, ivDtlR, createMap_SlsAct_Upd01_DtlR_SlsAct_Upd02_IvLR());
				slsActDtlR.hdr_peg_no(slsActHdrR.hdr_peg_no());					// ヘッダ紐付けＮＯ
				slsActDtlR.dtl_peg_no(++dtlCnt);								// 明細紐付けＮＯ
				slsActDtlR.data_crud_typ(cndR.data_crud_typ());					// データ更新区分
				if (!MAC_DATA_CRUD_TYP.isDEL(cndR.data_crud_typ())) {
					slsActDtlR.disp_seq(1);										// 表示順
					if (!isNull(ivDtlR.slo_d_no())) {
						slsActDtlR.upri_not_tgt_flg(true);						// 単価再取得対象外ＦＬＧ
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
				
				// 配送先経由区分が「経由する」場合はインボイス出荷実績明細を取得
				if (MAC_VIA_DLV_TYP.isVIA(ivDtlR.via_dlv_typ())) {
					MCList<SlsAct_Upd02_IoLR> ioL = MCList.create(SlsAct_Upd02_IoLR.class);
					executeQuery(ioL, MSBBL6010_MST_IV_SHIP_ACT_D_S1(), ivDtlR);
					
					_ioL.addAll(makeIoL(cndR, slsActHdrR, slsActDtlR, ioL, ivDtlR));
					
				}
				// 配送先経由区分が「経由しない」場合は出荷実績明細を取得（インボイスマップ→出荷引当状況→出荷実績明細）
				else {
					// 出荷予定ＮＯより出荷引当情報の取得
					MCList<MST_SHIP_ALLOC_STS_R> shipAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
					MST_SHIP_ALLOC_STS_R shipAllocStsL_t = MST_SHIP_ALLOC_STS_R.create("T");
					MCQueryApiBuilder shipAllocStsL_bldr = MCQueryApiBuilder.create(shipAllocStsL_t);
					if (cndR.use_iv_ship_act_map()) {
						MST_IV_SHIP_ACT_MAP_R ivShipActMap = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
						MST_SHIP_ACT_D_R shipActD = MST_SHIP_ACT_D_R.create("SHIPACTD");
						shipAllocStsL_bldr.addSelect(ivShipActMap.iv_d_no);
						shipAllocStsL_bldr.addSelect(shipActD.ship_act_no);
						shipAllocStsL_bldr.addInnerJoin(ivShipActMap, shipAllocStsL_t.ship_alloc_sts_no.eq(ivShipActMap.ship_alloc_sts_no));
						shipAllocStsL_bldr.addInnerJoin(shipActD, ivShipActMap.ship_act_d_no.eq(shipActD.ship_act_d_no));
						shipAllocStsL_bldr.setWhere(ivShipActMap.iv_d_no.eq(bind("1")), ivDtlR.iv_d_no());
					}
					else {
						shipAllocStsL_bldr.setWhere(shipAllocStsL_t.ship_schd_no.eq(bind("1")), ivDtlR.ship_schd_no());
					}
					dbSelect("MSBBL6010_MST_SHIP_ALLOC_STS_S04", shipAllocStsL, shipAllocStsL_bldr);
					
					if (!isNull(shipAllocStsL)) {
						// 取得した出荷引当状況ＮＯより出荷実績明細を取得
						MCList<SlsAct_Upd02_IoLR> ioL = MCList.create(SlsAct_Upd02_IoLR.class);
						 if (cndR.use_iv_ship_act_map()) {
							 if (shipAllocStsL.getStringNE(MST_SHIP_ACT_D_R.$ship_act_no).size() == 1) {
								 slsActHdrR.ship_act_no(shipAllocStsL.get(0).getString(MST_SHIP_ACT_D_R.$ship_act_no));
							}
							 executeQuery(ioL, MSBBL6010_MST_SHIP_ACT_D_S7(), shipAllocStsL);
						}
						else {
							executeQuery(ioL, MSBBL6010_MST_SHIP_ACT_D_S3(), shipAllocStsL);
						}
						_ioL.addAll(makeIoL(cndR, slsActHdrR, slsActDtlR, ioL, ivDtlR));
					}
					else {
						// 明細と同等の内容を詳細として取得
						SlsAct_Upd01_IoR ioR = SlsAct_Upd01_IoR.create();
						copy(ioR, slsActDtlR, createMap_SlsAct_Upd01_IoR_SlsAct_Upd01_DtlR());
						
						if (!MAC_DATA_CRUD_TYP.isCRT(cndR.data_crud_typ())) {
							MST_SLS_ACT_IO_R tmpIoR = MST_SLS_ACT_IO_R.create();
							executeQuery(tmpIoR, MSBBL6010_MST_SLS_ACT_IO_S2(), ivDtlR);
							ioR.sls_act_io_no(tmpIoR.sls_act_io_no());
						}
						_ioL.add(ioR);
					}
				}
				// 新規・訂正の場合
				if (!MAC_DATA_CRUD_TYP.isDEL(cndR.data_crud_typ())) {
					// 組織変更対応
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
					
					slsActDtlR.addDateColumn(SlsAct_Upd01_HdrR.$ac_dt);
					slsActDtlR.setDateNE(SlsAct_Upd01_HdrR.$ac_dt, slsActHdrR.ac_dt());
					// 負担部門
					MAUCL_DptUtil.setDpt(slsActDtlR, SlsAct_Upd01_DtlR.$bd_dpt_cd, null, SlsAct_Upd01_HdrR.$ac_dt, true);
					if (slsActDtlR.getBooleanNE("err_flg")) {
						throwDptErr();
					}
					if (!isGetMamUsrAcl(slsActHdrR.ac_dt(), slsActHdrR.sls_usr_cd(), slsActHdrR.sls_dpt_cd())) {
						MCMessagePool.add(new MCMessage(MSBBL0309, toYMDString(slsActHdrR.ac_dt()), slsActHdrR.sls_usr_cd(), slsActHdrR.sls_dpt_cd()));
						throwDptErr();
					}
				}
				// 売上実績SV用電文に追加
				_hdrL.add(slsActHdrR);
				_dtlL.add(slsActDtlR);
			}
			
			return hdr_peg_no;
		}
		
		/**
		 * 担当者権限マスタビューに担当者・部門・有効期限で定義されているか
		 * @param baseDt
		 * @param usrCd
		 * @param dptCd
		 * @return　true:存在するまたは担当者が空、false:存在しない
		 */
		protected boolean isGetMamUsrAcl(MCDate baseDt, String usrCd, String dptCd) {
			if (isNull(usrCd)) {
				return true;
			} else {
				MAVM_USR_DPT_R ret = getUsrDptCache().get(baseDt, usrCd, dptCd);
				if (isNull(ret.usr_cd())) {
					return false;
				} else { 
					return true;
				}
			}
		}
		
		protected FXUCL_MCDbcCacheStEnd<MAVM_USR_DPT_R> getUsrDptCache() {
			MCList<MCRow> bindL = MCList.create(MCRow.class);
			if (_cacheUsrDpt == null){
				MAVM_USR_DPT_R t = MAVM_USR_DPT_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setSelect(t.usr_cd);
				_cacheUsrDpt = new FXUCL_MCDbcCacheStEnd<MAVM_USR_DPT_R>(dbc_bldr, bindL, new String[] {MAVM_USR_DPT_R.$usr_cd, MAVM_USR_DPT_R.$dpt_cd});
			}
			return _cacheUsrDpt;
		}
		
		protected void throwDptErr() {
			MCAppException ex = new MCAppException(MCMessagePool.getMessageList().get(0));
			MCMessagePool.removeAll(MCMessagePool.getMessageList());
			throw ex;
		}
		
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
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_cd, SlsAct_Upd01_DtlR.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_qty, SlsAct_Upd01_DtlR.$trd_unit_qty);
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
		
		/**
		 * 売上実績SV用受払情報の作成
		 * 
		 * @param cndR
		 * @param slsActHdrR
		 * @param slsActDtlR
		 * @param ioL
		 * @param ivDtlR
		 * @return
		 */
		protected MCList<SlsAct_Upd01_IoR> makeIoL(
				SlsAct_Upd02_CndR cndR,
				SlsAct_Upd01_HdrR slsActHdrR,
				SlsAct_Upd01_DtlR slsActDtlR,
				MCList<SlsAct_Upd02_IoLR> ioL,
				SlsAct_Upd02_IvLR ivDtlR) {
			
			MCList<SlsAct_Upd01_IoR> slsActIoL = MCList.create(SlsAct_Upd01_IoR.class);
			
			MCList<MST_SLS_ACT_IO_R> tmpIoL = MCList.create(MST_SLS_ACT_IO_R.class);
			MCIndexKey idxShipAct = null;
			MCIndexKey idxIVShipAct = null;
			
			if (!MAC_DATA_CRUD_TYP.isCRT(cndR.data_crud_typ())) {
				executeQuery(tmpIoL, MSBBL6010_MST_SLS_ACT_IO_S2(), ivDtlR);
				idxShipAct = tmpIoL.createIndex(MST_SLS_ACT_IO_R.$ship_act_d_no);
				idxIVShipAct = tmpIoL.createIndex(MST_SLS_ACT_IO_R.$iv_ship_act_d_no);
			}

			for (SlsAct_Upd02_IoLR ioR : ioL) {
				SlsAct_Upd01_IoR slsActIoR = SlsAct_Upd01_IoR.create();
				if (!MAC_DATA_CRUD_TYP.isCRT(cndR.data_crud_typ())) {
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
				if (MAC_DATA_CRUD_TYP.isUPD(cndR.data_crud_typ()) && isNull(slsActIoR.sls_act_io_no())) {
					slsActIoR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					slsActIoR.data_crud_typ(cndR.data_crud_typ());
				}
				slsActIoL.add(slsActIoR);
			}
			if (MAC_DATA_CRUD_TYP.isUPD(cndR.data_crud_typ())) {
				MCList<SlsAct_Upd01_IoR> tmpSlsActIoL = MCList.create(SlsAct_Upd01_IoR.class);
				tmpSlsActIoL.addAll(slsActIoL);
				MCIndexKey idxTmpIo = tmpSlsActIoL.createIndex(SlsAct_Upd01_IoR.$sls_act_io_no);
				for (MST_SLS_ACT_IO_R tmpIoR : tmpIoL) {
					SlsAct_Upd01_IoR chkSlsActIoR = tmpSlsActIoL.getFirst(idxTmpIo, tmpIoR.sls_act_io_no());
					if (isNull(chkSlsActIoR)) {
						SlsAct_Upd01_IoR slsActIoR = SlsAct_Upd01_IoR.create();
						slsActIoR.hdr_peg_no(slsActHdrR.hdr_peg_no());
						slsActIoR.dtl_peg_no(slsActDtlR.dtl_peg_no());
						slsActIoR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						slsActIoR.sls_act_io_no(tmpIoR.sls_act_io_no());
						slsActIoR.sls_act_io_seq(tmpIoR.sls_act_io_seq());
						slsActIoR.io_peg_no(++_ioCnt);
						slsActIoR.setStatus(Status.DELETE);
						slsActIoL.add(slsActIoR);
					}
				}
			}
			if (ioL.size() > 0) {
				slsActDtlR.stk_mng_typ(ioL.get(0).stk_mng_typ());
			}
			
			return slsActIoL;
		}
		
		/**
		 * 売上実績SV呼出
		 */
		protected void callSlsActSv() {
			MSBBL_SlsActService.SlsAct_Upd01 ope = MSBBL_SlsActService.crtSlsAct_Upd01();
			ope.up0().addAll(_hdrL);
			ope.up1().addAll(_dtlL);
			ope.up2().addAll(_ioL);
			
			// 売上実績SV呼出
			ope.exec();
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
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_nm, SlsAct_Upd02_IvLR.$itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$iv_itm_nm, SlsAct_Upd02_IvLR.$iv_itm_nm);
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
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.ship_act_no(src.getStringNE("ship_act_no"));
			}
		}
	}
	
	protected FXUCL_MCDbcCache<MAM_TAX_R> _taxCache = null;
	// 税マスタ 「税ＣＤ」
	public static void initTaxCache(MCList<MST_SLS_ACT_D_R> mcL) {
		object(CLAZZ)._initTaxCache(mcL);
	}
	
	protected void _initTaxCache(MCList<MST_SLS_ACT_D_R> mcL) {
		MAM_TAX_R t = MAM_TAX_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.tax_cd, t.tax_typ, t.inc_tax_flg, t.tax_rate);
		_taxCache = new FXUCL_MCDbcCache<MAM_TAX_R>(dbc_bldr, mcL, MST_SLS_ACT_D_R.$tax_cd);
	}
	
	public static FXUCL_MCDbcCache<MAM_TAX_R> getTaxCache() {
		return object(CLAZZ)._taxCache;
	}
	
	// 品目マスタのキャッシュ（承認処理用）
	protected static void initItmCacheUpd03(MCList<MST_SLS_ACT_D_R> dtlL) {
		object(CLAZZ)._initItmCacheUpd03(dtlL);
	}
	protected void _initItmCacheUpd03(MCList<MST_SLS_ACT_D_R> dtlL) {
		_itmCache = MCList.create(MAM_ITM_R.class);
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder itmCache_bldr = MCQueryApiBuilder.create(t);
		itmCache_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.dscnt_itm_flg, t.stk_mng_typ);
		itmCache_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
		itmCache_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
		itmCache_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
		itmCache_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
		dbSelect("MSBBL6010_MAM_ITM_S02", _itmCache, itmCache_bldr, dtlL);
		_itmCacheIdx = _itmCache.createIndex(MAM_ITM_R.$itm_cd, 
				MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
	}
	
	/**
	 * SlsAct_Upd03オペレーション.<p>
	 *
	 * 売上値引で承認/承認取消された場合に、売上実績を承認/承認取消として更新する<br>
	 */
	public class SlsAct_Upd03 extends MSBBL_SlsActService_MC_A.SlsAct_Upd03 {
		// 債権共通SV呼出情報を格納
		protected MCList<ArCmn_Upd01_DtlR> _arInLAprv = MCList.create(ArCmn_Upd01_DtlR.class);
		// 与信SV呼出情報を格納
		protected MCList<Cred_Upd01_CndR> _credLAprv = MCList.create(Cred_Upd01_CndR.class);
		// 出荷帳票発行SV呼出情報を格納
		protected MCList<ShipRprt_Upd01_HdrR> _shipRprtHdrL01 = MCList.create(ShipRprt_Upd01_HdrR.class);
		protected MCList<ShipRprt_Upd01_DtlR> _shipRprtDtlL01 = MCList.create(ShipRprt_Upd01_DtlR.class);
		// 締処理提供SV呼出情報を格納
		protected MCList<Cl_Chk03_CndR> _clChk03CndL = MCList.create(Cl_Chk03_CndR.class);
		/**
		 * サービス実行前のメッセージの状態
		 */
		protected MCMessageList _msgLPreSv = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			preProc();
			// 更新処理
			updSlsActMain();
			
		}
		
		protected void updSlsActMain() {
			List<String> trdPtnTypL = new ArrayList<String>();
			trdPtnTypL.add(MAC_TRD_PTN_TYP.SLS_DSCNT.value());
			trdPtnTypL.add(MAC_TRD_PTN_TYP.SLS_XTRA.value());
			MCList<MST_SLS_SUM_R> slsSumL = MCList.create(MST_SLS_SUM_R.class);
			int hdrCnt = 0;
			for (SlsAct_Upd03_AprvR upR : up0()) {
				int slsCnt = 0;
				// 処理対象の売上実績ヘッダ抽出とロック
				MST_SLS_ACT_R slsActR = MST_SLS_ACT_R.create("T");
				MCQueryApiBuilder slsActR_bldr = MCQueryApiBuilder.create(slsActR);
				slsActR_bldr.setWhere(slsActR.sls_act_no.eq(bind("1")), upR.sls_act_no());
				slsActR_bldr.addWhereWithAnd(slsActR.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));	// 伝票状況区分（新規）
				slsActR_bldr.addWhereWithAnd(slsActR.aprv_flg.eq(value(true)));						// 承認対象フラグ（承認対象）
				slsActR_bldr.addWhereInWithAnd(slsActR.trd_ptn_typ, trdPtnTypL);			// 取引パタン区分（売上値引、売上値増）
				
				slsCnt = dbSelectForUpdate("MSBBL6010_MST_SLS_ACT_S04", slsActR, slsActR_bldr);
				if (slsCnt == 0) {
					throw new MCAppException(MSBBL0169, upR.sls_act_no());
				}
				String befAprvSts = slsActR.aprv_sts_typ();
				
				// 売上実績ヘッダに紐づく売上実績明細を取得
				MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
				MST_SLS_ACT_D_R slsActDL_t = MST_SLS_ACT_D_R.create("T");
				MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(slsActDL_t);
				slsActDL_bldr.setWhere(slsActDL_t.sls_act_no.eq(bind("1")), slsActR.sls_act_no());
				slsActDL_bldr.addWhereWithAnd(slsActDL_t.sls_act_seq.eq(bind("1")), slsActR.sls_act_seq());
				slsActDL_bldr.addOrderByAsc(slsActDL_t.disp_seq);
				dbSelectForUpdate("MSBBL6010_MST_SLS_ACT_D_S05", slsActDL, slsActDL_bldr);
				
				// 売上実績明細に紐づく売上実績受払を取得
				MCList<MST_SLS_ACT_IO_R> slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
				for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
					MCList<MST_SLS_ACT_IO_R> tmpSlsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
					MST_SLS_ACT_IO_R tmpSlsActIoL_t = MST_SLS_ACT_IO_R.create("T");
					MCQueryApiBuilder tmpSlsActIoL_bldr = MCQueryApiBuilder.create(tmpSlsActIoL_t);
					tmpSlsActIoL_bldr.setWhere(tmpSlsActIoL_t.sls_act_d_no.eq(bind("1")), slsActDR.sls_act_d_no());
					tmpSlsActIoL_bldr.addWhereWithAnd(tmpSlsActIoL_t.sls_act_d_seq.eq(bind("1")), slsActDR.sls_act_d_seq());
					tmpSlsActIoL_bldr.setOrderByAsc(tmpSlsActIoL_t.sls_act_io_no);
					dbSelect("MSBBL6010_MST_SLS_ACT_IO_S03", tmpSlsActIoL, tmpSlsActIoL_bldr);
					slsActIoL.addAll(tmpSlsActIoL);
				}
				
				// 品目マスタキャッシュ（承認処理用）
				initItmCacheUpd03(slsActDL);
				
				// 上り電文・処理対象の承認状況区分の状態により売上実績の更新・赤黒などを判別
				boolean nextProcFlg = false;
				// 最終承認済から非承認となる場合
				if (MAC_APRV_STS_TYP.isACPT(slsActR.aprv_sts_typ())) {
					// 売上実績の赤黒処理と後続処理を実施
					
					
					// 元売上実績を「無効」に更新
					slsActR_bldr.setSet(slsActR.slip_sts_typ);
					slsActR.slip_sts_typ(MAC_SLIP_STS_TYP.DIS.value());
					dbUpdateKey("MSBBL6010_MST_SLS_ACT_U02", slsActR, slsActR_bldr);
					
					// 「取消」の売上実績を登録
					MST_SLS_ACT_R canSlsActR = MST_SLS_ACT_R.create("T");
					canSlsActR.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());
					canSlsActR.aprv_sts_typ(slsActR.aprv_sts_typ());
					
					copy(canSlsActR, slsActR, createMap_MST_SLS_ACT_R_MST_SLS_ACT_R());
					
					MCList<MST_SLS_ACT_D_R> canSlsActDL = MCList.create(MST_SLS_ACT_D_R.class);
					for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
						MST_SLS_ACT_D_R canSlsActDR = MST_SLS_ACT_D_R.create();
						copy(canSlsActDR, slsActDR, createMap_MST_SLS_ACT_D_R_MST_SLS_ACT_D_R_CAN());
						canSlsActDL.add(canSlsActDR);
					}
					
					MCList<MST_SLS_ACT_IO_R> canSlsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
					for (MST_SLS_ACT_IO_R slsActIoR : slsActIoL) {
						MST_SLS_ACT_IO_R canSlsActIoR = MST_SLS_ACT_IO_R.create();
						copy(canSlsActIoR, slsActIoR, createMap_MST_SLS_ACT_IO_R_MST_SLS_ACT_IO_R_CAN());
						canSlsActIoL.add(canSlsActIoR);
					}
					
					// 売上実績ヘッダ、売上実績明細、売上実績受払の登録（取消）
					dbInsertEx("MSBBL6010_MST_SLS_ACT_I03", canSlsActR,
							MCQueryApiBuilder.create(canSlsActR));
					dbInsertEx("MSBBL6010_MST_SLS_ACT_D_I03", canSlsActDL,
							MCQueryApiBuilder.create(MST_SLS_ACT_D_R.create("T")));
					dbInsertEx("MSBBL6010_MST_SLS_ACT_IO_I03", canSlsActIoL,
							MCQueryApiBuilder.create(MST_SLS_ACT_IO_R.create("T")));

					// 売上集計処理用リスト作成
					slsSumL.addAll(makeSlsSumL(canSlsActR, canSlsActDL));
					
					// 債権共通SV用電文作成（取消）
					if (!getCo().ar_no_use_flg()) {
						makeArInLAprv(canSlsActR, slsActDL, true);
					}
					
					makeSlsSlipAprv(canSlsActR);
					
					// 与信SV用電文作成（取消）
					makeCredLAprv(canSlsActR, true);
					
					// 「新規」の売上実績
					MST_SLS_ACT_R crtSlsActR = MST_SLS_ACT_R.create("T");
					crtSlsActR.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
					crtSlsActR.aprv_sts_typ(upR.aprv_sts_typ());
					
					copy(crtSlsActR, slsActR, createMap_MST_SLS_ACT_R_MST_SLS_ACT_R());
					
					MCList<MST_SLS_ACT_D_R> crtSlsActDL = MCList.create(MST_SLS_ACT_D_R.class);
					for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
						MST_SLS_ACT_D_R crtSlsActDR = MST_SLS_ACT_D_R.create();
						copy(crtSlsActDR, slsActDR, createMap_MST_SLS_ACT_D_R_MST_SLS_ACT_D_R_CRT());
						crtSlsActDL.add(crtSlsActDR);
					}
					
					MCList<MST_SLS_ACT_IO_R> crtSlsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
					for (MST_SLS_ACT_IO_R slsActIoR : slsActIoL) {
						MST_SLS_ACT_IO_R crtSlsActIoR = MST_SLS_ACT_IO_R.create();
						copy(crtSlsActIoR, slsActIoR, createMap_MST_SLS_ACT_IO_R_MST_SLS_ACT_IO_R_CRT());
						crtSlsActIoL.add(crtSlsActIoR);
					}
					
					// 売上実績ヘッダ、売上実績明細、売上実績受払の登録（新規：未承認）
					dbInsertEx("MSBBL6010_MST_SLS_ACT_I04", crtSlsActR,
							MCQueryApiBuilder.create(crtSlsActR));
					dbInsertEx("MSBBL6010_MST_SLS_ACT_D_I04", crtSlsActDL,
							MCQueryApiBuilder.create(MST_SLS_ACT_D_R.create("T")));
					dbInsertEx("MSBBL6010_MST_SLS_ACT_IO_I04", crtSlsActIoL,
							MCQueryApiBuilder.create(MST_SLS_ACT_IO_R.create("T")));

					// 出荷帳票発行SV用電文作成（取消）
					makeShipRprt01Del(canSlsActR);
					makeClChk03Cnd(canSlsActR, ++hdrCnt, true);
					
					nextProcFlg = true;
				}
				// 非承認から最終承認済となる場合
				else if (MAC_APRV_STS_TYP.isACPT(upR.aprv_sts_typ())) {
					// 承認状況区分、納品書ＮＯ発番。赤黒処理は行わずに後続処理を実施
					slsActR_bldr.setSet(slsActR.aprv_sts_typ);
					slsActR_bldr.addSet(slsActR.dlv_slip_no);
					slsActR_bldr.addSet(slsActR.dlv_slip_seq);
					slsActR.aprv_sts_typ(upR.aprv_sts_typ());
					slsActR.dlv_slip_no(getDlvSlipNo(slsActR.sls_dpt_cd(),
							slsActR.wg_cd(), slsActR.trd_cd(), slsActR.ac_dt()));
					slsActR.dlv_slip_seq(slsActR.sls_act_seq());
					dbUpdateKey("MSBBL6010_MST_SLS_ACT_U03", slsActR, slsActR_bldr);
					
					// 納品書明細用シーケンスキャッシュ
					doSeqCache(MSC_NUM_SYS_TYP.DLVSLIPD, slsActDL.size());
					
					// 売上実績明細の納品書明細ＮＯセット
					slsActDL_bldr.setSet(slsActDL_t.dlv_slip_d_no);
					for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
						slsActDR.dlv_slip_d_no(getStrSeq(MSC_NUM_SYS_TYP.DLVSLIPD));
					}
					dbUpdateKey("MSBBL6010_MST_SLS_ACT_D_U01", slsActDL, slsActDL_bldr);
					
					// 売上集計処理用リスト作成
					slsSumL.addAll(makeSlsSumL(slsActR, slsActDL));
					
					// 債権共通SV用電文作成（新規）
					if (!getCo().ar_no_use_flg()) {
						makeArInLAprv(slsActR, slsActDL, false);
					}
					
					makeSlsSlipAprv(slsActR);
					
					// 与信SV用電文作成（新規）
					makeCredLAprv(slsActR, false);
					
					// 出荷帳票発行SV用電文作成（新規）
					makeShipRprt01Crt(slsActR, ++hdrCnt);
					makeClChk03Cnd(slsActR, ++hdrCnt, false);
					
					nextProcFlg = true;
				}
				// 非承認から非承認となる場合
				else {
					// 承認状況区分の更新のみ実施し後続処理は行わない
					slsActR_bldr.setSet(slsActR.aprv_sts_typ);
					slsActR.aprv_sts_typ(upR.aprv_sts_typ());
					dbUpdateKey("MSBBL6010_MST_SLS_ACT_U04", slsActR, slsActR_bldr);
				}
				
				// 後続処理を実施
				if (nextProcFlg) {
					// 受払実績サービス
					callIoActSvWK(upR, slsActR, slsActDL, slsActIoL, befAprvSts);
					callIoActSv();
					
					// 売上集計更新
					updSlsSum(slsSumL);
					
					// 債権共通サービス（債権不使用の場合は実施しない）
					if (!getCo().ar_no_use_flg()) {
						callArCmnSvAprv();
					}
					
					callGALink();
					
					// 与信サービス
					callCredSvAprv();
					
					// 帳票発行サービス（発行はせず納品伝票の登録）
					callShipRprtSvUpd01();
					
					// 締処理提供SV呼出
					callCloseSV();
				}
			}
		}
		
		/**
		 * 納品書ＮＯ発番
		 * 
		 * @param hdrR
		 * @return
		 */
		protected String getDlvSlipNo(String dptCd, String wgCd, String trdCd, MCDate acDt) {
			ElmArgsR args = ElmArgsR.create();
			
			args.dpt_cd(dptCd);
			args.co_cd(getCo().co_cd());
			args.wg_cd(wgCd);
			args.trd_cd(trdCd);
			args.dt(acDt);
			
			return getNum(MAC_NUM_BIZ_TYP.DLVSLIP, args);
		}
		
		protected void preProc() {
			_msgLPreSv = new MCMessageList();
			_msgLPreSv.addAll(MCMessagePool.getMessageList());
		}
		
		protected void callCloseSV() {
			
			if (_clChk03CndL.size() == 0) {
				return;
			}
			
			MSBIL_ClService.Cl_Chk03 ope = MSBIL_ClService.crtCl_Chk03();
			ope.up0().setAll(_clChk03CndL);
			ope.exec();
			
			if (_msgLPreSv.size() != MCMessagePool.size()) {
				
				// 締チェック処理で発生したエラーメッセージのみスローする。
				MCMessageList causeMsgList = new MCMessageList();
				
				for (MCMessage causeMsg : MCMessagePool.getMessageList()) {
					if (!_msgLPreSv.contains(causeMsg)) {
						
						causeMsgList.add(causeMsg);
					}
				}
				
				// 締チェック処理で発生したエラーメッセージをメッセージプールから消す。
				MCMessagePool.removeAll(causeMsgList);
				
				MCAppException ex = new MCAppException(causeMsgList.get(0));
				causeMsgList.remove(0);
				ex.addCauseMessageList(causeMsgList);
				
				throw ex;
			}
		}
		
		protected void makeClChk03Cnd(MST_SLS_ACT_R hdrR, int hdrCnt, boolean canFlg) {
			Cl_Chk03_CndR clChkCndR = Cl_Chk03_CndR.create();
			clChkCndR.peg_no(hdrCnt);			// 紐付けＮＯ
			if(canFlg) {
				clChkCndR.can_ac_dt(hdrR.ac_dt());		// 取消計上日
				clChkCndR.old_bp_cd(hdrR.acst_cd());	// 変更前取引先ＣＤ（売掛先ＣＤ）
			}
			else {
				clChkCndR.ac_dt(hdrR.ac_dt());		// 計上日
				clChkCndR.bp_cd(hdrR.acst_cd());	// 取引先ＣＤ（売掛先ＣＤ）
			}
			clChkCndR.sls_cls_chk_flg(true);			// 売上締チェック
			
			_clChk03CndL.add(clChkCndR);
		}
		
		/**
		 * 出荷帳票発行SV呼出（ShipRprt_Upd01）
		 * 
		 */
		protected void callShipRprtSvUpd01() {
			if (_shipRprtHdrL01.size() == 0) {
				return;
			}
			MSBEL_ShipRprtPrntService.ShipRprt_Upd01 ope = MSBEL_ShipRprtPrntService.crtShipRprt_Upd01();
			ope.up0().setAll(_shipRprtHdrL01);
			ope.up1().setAll(_shipRprtDtlL01);
			ope.exec();
		}
		
		// 出荷帳票発行SV用電文作成：取消（ShipRprt_Upd01）
		protected void makeShipRprt01Del(MST_SLS_ACT_R hdrR) {
			ShipRprt_Upd01_HdrR up0 = ShipRprt_Upd01_HdrR.create();
			
			up0.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());	// データ更新区分（取消）
			up0.can_ac_dt(hdrR.ac_dt());						// 取消計上日
			up0.trn_typ(MSC_TRN_TYP.SLS.value());				// トランザクション区分（売上）
			up0.dlv_slip_act_no(hdrR.sls_act_no());				// 納品伝票実績ＮＯ（売上実績ＮＯ）
			up0.dlv_slip_prnt_flg(false);						// 発行ＦＬＧ
			
			_shipRprtHdrL01.add(up0);
		}
		
		// 出荷帳票発行SV用電文作成：新規（ShipRprt_Upd01）
		protected void makeShipRprt01Crt(MST_SLS_ACT_R hdrR, int hdrCnt) {
			ShipRprt_Upd01_HdrR up0 = ShipRprt_Upd01_HdrR.create();
			
			// ヘッダに紐づく売上実績明細、売上実績受払を取得
			MCList<MST_SLS_ACT_D_R> dtlL = MCList.create(MST_SLS_ACT_D_R.class);
			MST_SLS_ACT_D_R dtlL_t = MST_SLS_ACT_D_R.create("T");
			MCQueryApiBuilder dtlL_bldr = MCQueryApiBuilder.create(dtlL_t);
			dtlL_bldr.setWhere(dtlL_t.sls_act_no.eq(bind("1")), hdrR.sls_act_no());
			dtlL_bldr.addWhereWithAnd(dtlL_t.sls_act_seq.eq(bind("1")), hdrR.sls_act_seq());
			dbSelect("MSBBL6010_MST_SLS_ACT_D_S06", dtlL, dtlL_bldr);
			MST_SLS_ACT_D_R dtlR = dtlL.get(0);
			
			MCList<MST_SLS_ACT_IO_R> ioL = MCList.create(MST_SLS_ACT_IO_R.class);
			MST_SLS_ACT_IO_R ioL_t = MST_SLS_ACT_IO_R.create("T");
			MCQueryApiBuilder ioL_bldr = MCQueryApiBuilder.create(ioL_t);
			ioL_bldr.setWhere(ioL_t.sls_act_d_no.eq(bind("1")), dtlR.sls_act_d_no());
			ioL_bldr.addWhereWithAnd(ioL_t.sls_act_d_seq.eq(bind("1")), dtlR.sls_act_d_seq());
			dbSelect("MSBBL6010_MST_SLS_ACT_IO_S04", ioL, ioL_bldr);
			MST_SLS_ACT_IO_R ioR = ioL.get(0);
			
			// ヘッダ情報の作成
			up0.hdr_peg_no(hdrCnt);								// ヘッダ紐付ＮＯ
			up0.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());	// データ更新区分（新規）
			up0.ac_dt(hdrR.ac_dt());							// 計上日
			up0.slo_no(hdrR.slo_no());							// 受注ＮＯ
			up0.trn_typ(MSC_TRN_TYP.SLS.value());				// トランザクション区分（売上）
			up0.dlv_slip_act_no(hdrR.sls_act_no());				// 納品伝票実績ＮＯ（売上実績ＮＯ）
			up0.dpt_cd(hdrR.sls_dpt_cd());						// 部門ＣＤ（売上部門ＣＤ）
			up0.usr_cd(hdrR.sls_usr_cd());						// 担当者ＣＤ（売上担当者ＣＤ）
			up0.ship_tm(hdrR.ship_tm());						// 出荷日時
			up0.dlv_tm(hdrR.dlv_tm());							// 納品日時
			up0.trd_cd(hdrR.trd_cd());							// 取引ＣＤ
			up0.trd_ptn_typ(hdrR.trd_ptn_typ());				// 取引パタン区分
			up0.cst_po_no(hdrR.cst_po_no());					// 得意先注文ＮＯ
			up0.pri_prnt_flg(dtlR.pri_prnt_flg());				// 価格印字ＦＬＧ（全明細の価格印字ＦＬＧは揃っている）
			up0.trd_cur_cd(hdrR.trd_cur_cd());					// 取引通貨ＣＤ
			up0.xrate(hdrR.xrate());							// 為替レート
			up0.ptax_xrate(hdrR.ptax_xrate());					// 納税為替レート
			up0.bp_cd(hdrR.cst_cd());							// 取引先ＣＤ（得意先ＣＤ）
			up0.dlv_id_typ(MSC_DLV_ID_TYP.DLV.value());			// 納品先識別区分（納品先）
			up0.dlv_id_cd(dtlR.dlv_cd());						// 納品先識別ＣＤ（納品先、全明細の納品先は揃っている）
			up0.dlv_id_nm(dtlR.dlv_nm());						// 納品先識別名
			up0.dlv_zip_cd(dtlR.dlv_zip_cd());					// 納品先郵便番号
			up0.dlv_addr1(dtlR.dlv_addr1());					// 納品先住所１
			up0.dlv_addr2(dtlR.dlv_addr2());					// 納品先住所２
			up0.dlv_addr3(dtlR.dlv_addr3());					// 納品先住所３
			up0.dlv_addr4(dtlR.dlv_addr4());					// 納品先住所４
			up0.dlv_cntct_dpt(dtlR.dlv_cntct_dpt());			// 納品先部署
			up0.dlv_cntct_psn(dtlR.dlv_cntct_psn());			// 納品先担当者
			up0.dlv_tel(dtlR.dlv_tel());						// 納品先ＴＥＬ
			up0.dlv_fax(dtlR.dlv_fax());						// 納品先ＦＡＸ
			up0.dlv_sundry_flg(dtlR.dlv_sundry_flg());			// 納品先諸口ＦＬＧ
			
			// 場所ＣＤに対する物流グループＣＤを設定
			String loc_cd = ioR.loc_cd();
			MAM_LOC_R locR = getLoc(loc_cd);
			if (!isNull(locR)) {
				up0.ship_fr_lg_grp_cd(locR.lg_grp_cd());			// 出荷元物流グループＣＤ
			}
			
			up0.wg_cd(hdrR.wg_cd());							// ワーキンググループＣＤ
			up0.trd_rmrks(hdrR.trd_rmrks());					// 取引備考
			up0.split_flg(false);								// 伝票分割ＦＬＧ（オフ）
			up0.adjst_slip_flg(false);							// 調整伝票ＦＬＧ（オフ）
			up0.dlv_slip_prnt_flg(false);						// 発行ＦＬＧ
			
			_shipRprtHdrL01.add(up0);
			
			// 明細情報の作成
			for (MST_SLS_ACT_D_R tmpDR : dtlL) {
				ShipRprt_Upd01_DtlR up1R = ShipRprt_Upd01_DtlR.create();
				up1R.hdr_peg_no(up0.hdr_peg_no());				// ヘッダ紐付ＮＯ
				up1R.dtl_uniq_no(tmpDR.sls_act_d_no());			// 明細特定ＮＯ（売上実績明細ＮＯ）
				up1R.dlv_slip_d_no(tmpDR.dlv_slip_d_no());		// 納品書明細ＮＯ
				up1R.dlv_slip_d_seq(tmpDR.sls_act_d_seq());		// 納品書明細連番
				up1R.dlv_slip_no(hdrR.dlv_slip_no());			// 納品書ＮＯ
				up1R.dlv_slip_seq(hdrR.sls_act_seq());			// 納品書連番
				up1R.dlv_slip_rev(hdrR.sls_act_rev());			// 納品書改訂番号
				up1R.itm_cd(tmpDR.itm_cd());					// 品目ＣＤ
				up1R.itm_sub1(tmpDR.itm_sub1());				// 枝番１
				up1R.itm_sub2(tmpDR.itm_sub2());				// 枝番２
				up1R.itm_sub3(tmpDR.itm_sub3());				// 枝番３
				up1R.itm_nm(tmpDR.itm_nm());					// 品名
				up1R.sundry_itm_flg(tmpDR.sundry_itm_flg());	// 諸口品ＦＬＧ
				up1R.sno1(tmpDR.sno1());						// 手配ＮＯ１
				up1R.sno2(tmpDR.sno2());						// 手配ＮＯ２
				up1R.sno3(tmpDR.sno3());						// 手配ＮＯ３
				up1R.sno4(tmpDR.sno4());						// 手配ＮＯ４
				up1R.lot_no(tmpDR.lot_no());					// ロットＮＯ
				up1R.sublot_no(tmpDR.sublot_no());				// サブロットＮＯ
				up1R.trd_unit_qty(tmpDR.trd_unit_qty());		// 取引単位数量
				up1R.trd_unit_cd(tmpDR.trd_unit_cd());			// 取引単位ＣＤ
				up1R.base_unit_qty(tmpDR.base_unit_qty());		// 基準単位数量
				up1R.base_unit_cd(tmpDR.base_unit_cd());		// 基準単位ＣＤ
				up1R.trd_cur_upri(tmpDR.trd_cur_upri());		// 取引通貨単価
				up1R.trd_cur_amt(tmpDR.trd_cur_amt());			// 取引通貨金額
				up1R.trd_cur_dscnt_amt(tmpDR.trd_cur_dscnt_amt());	// 取引通貨値引額
				up1R.base_cur_upri(tmpDR.base_cur_upri());		// 基準通貨単価
				up1R.base_cur_amt(tmpDR.base_cur_amt());		// 基準通貨金額
				up1R.tax_cd(tmpDR.tax_cd());					// 税ＣＤ
				up1R.trd_cur_tax_amt(tmpDR.trd_cur_tax_amt());	// 取引通貨税額
				up1R.base_cur_tax_amt(tmpDR.base_cur_tax_amt());	// 基準通貨税額
				up1R.wtax_rate(tmpDR.wtax_rate());				// 源泉税率
				up1R.wtax_amt(tmpDR.wtax_amt());				// 源泉税額
				up1R.rsn_cd(tmpDR.rsn_cd());					// 理由ＣＤ
				up1R.bd_dpt_cd(tmpDR.bd_dpt_cd());				// 負担部門ＣＤ
				up1R.cst_po_d_no(tmpDR.cst_po_d_no());			// 得意先注文明細ＮＯ
				up1R.cst_itm_cd(tmpDR.cst_itm_cd());			// 得意先品目ＣＤ
				up1R.cst_itm_nm(tmpDR.cst_itm_nm());			// 得意先品名
				up1R.slo_d_no(tmpDR.slo_d_no());				// 受注明細ＮＯ
				up1R.trd_d_rmrks(tmpDR.trd_d_rmrks());			// 取引明細備考
				
				_shipRprtDtlL01.add(up1R);
			}
		}
		
		/**
		 * 与信SV呼出
		 * 
		 * @return
		 */
		protected void callCredSvAprv() {
			if (_credLAprv.size() == 0) {
				return;
			}
			MSBGL_CredService.Cred_Upd01 ope = MSBGL_CredService.crtCred_Upd01();
			ope.up0().setAll(_credLAprv);
			ope.exec();
		}
		
		/**
		 * 与信SV呼出情報作成
		 * 
		 * @param hdrR
		 * @param canFlg 取消データの場合true
		 */
		protected void makeCredLAprv(MST_SLS_ACT_R hdrR, boolean canFlg) {
			Cred_Upd01_CndR credCndR = Cred_Upd01_CndR.create();
			credCndR.cst_cd(hdrR.cst_cd());									// 得意先ＣＤ
			credCndR.cur_cd(hdrR.trd_cur_cd());								// 通貨ＣＤ
			credCndR.trd_ptn_typ(hdrR.trd_ptn_typ());						// 取引パタン区分
			credCndR.amt(hdrR.trd_cur_amt().add(hdrR.trd_cur_tax_amt()));	// 金額
			if(canFlg) {
				credCndR.cred_upd_typ(MSC_CRED_UPD_TYP.UPD.value());		// 与信更新区分（更新のみ）
			}
			else {
				credCndR.cred_upd_typ(MSC_CRED_UPD_TYP.UPD_CHK.value());	// 与信更新区分（更新＆チェック）
			}
			_credLAprv.add(credCndR);
		}
		
		/**
		 * 債権共通SV呼出情報作成
		 * 
		 * @param slsActR
		 * @param slsActDL
		 * @param canFlg 取消データの場合true
		 */
		protected void makeArInLAprv(MST_SLS_ACT_R slsActR, MCList<MST_SLS_ACT_D_R> slsActDL, boolean canFlg) {
			
			initTaxCache(slsActDL);
			
			for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
				ArCmn_Upd01_DtlR arInR = ArCmn_Upd01_DtlR.create();
				MAM_TAX_R taxCacheR = getTaxCache().get(slsActDR.tax_cd());
				
				arInR.trd_cd(slsActR.trd_cd());												// 取引ＣＤ
				arInR.act_no(slsActR.sls_act_no());											// ヘッダ実績ＮＯ（売上実績ＮＯ）
				arInR.act_seq(slsActR.sls_act_seq());										// ヘッダ実績連番（売上実績連番）
				arInR.act_rev(slsActR.sls_act_rev());										// ヘッダ改訂番号（売上実績改訂番号）
				arInR.act_d_no(slsActDR.sls_act_d_no());									// 明細実績ＮＯ（売上実績明細ＮＯ）
				arInR.trd_cur_cd(slsActR.trd_cur_cd());										// 取引通貨ＣＤ
				arInR.ar_trd_grp_typ(MAC_TRD_PTN_TYP.ar_trd_grp_typ(slsActR.trd_ptn_typ()));// 債権取引グループ区分
				arInR.trd_ptn_typ(slsActR.trd_ptn_typ());									// 取引パタン区分
				arInR.bcst_cd(slsActR.bcst_cd());											// 請求先ＣＤ
				arInR.acst_cd(slsActR.acst_cd());											// 売掛先ＣＤ
				arInR.cst_cd(slsActR.cst_cd());												// 得意先ＣＤ
				arInR.dlv_cd(slsActDR.dlv_cd());											// 納品先ＣＤ
				arInR.dlv_nm(slsActDR.dlv_nm());											// 納品先名
				arInR.dlv_sundry_flg(slsActDR.dlv_sundry_flg());							// 納品先諸口ＦＬＧ
				arInR.dest_cd1(slsActDR.dest_cd1());										// 仕向先ＣＤ１
				arInR.dest_cd2(slsActDR.dest_cd2());										// 仕向先ＣＤ２
				arInR.dest_cd3(slsActDR.dest_cd3());										// 仕向先ＣＤ３
				arInR.ac_dt(slsActR.ac_dt());												// 計上日
				arInR.ac_ym(getAcYm(slsActR.ac_dt()));										// 計上年月
				arInR.dlv_dt(slsActR.dlv_tm());												// 納品日
				arInR.base_sls_ac_dt(slsActDR.base_sls_ac_dt());					// 売上計上日（基）
				arInR.bill_basis_dt(slsActR.bill_basis_dt());								// 請求起算日
				arInR.bill_crryovr_times(slsActDR.bill_crryovr_times());					// 請求繰越回数
				arInR.ar_dpt_cd(slsActR.ar_dpt_cd());										// 債権部門ＣＤ
				arInR.sls_dpt_cd(slsActR.sls_dpt_cd());										// 売上部門ＣＤ
				arInR.sls_usr_cd(slsActR.sls_usr_cd());										// 売上担当者ＣＤ
				arInR.dlv_slip_no(slsActR.dlv_slip_no());									// 納品書ＮＯ
				arInR.iv_no(slsActR.iv_no());												// インボイスＮＯ
				if (!isNull(slsActDR.slo_d_no())) {
					if (!isNull(slsActDR.slo_no())) {
						arInR.slo_no(slsActDR.slo_no());									// 受注ＮＯ
					}
					else {
						arInR.slo_no(slsActR.slo_no());										// 受注ＮＯ
					}
				}
				arInR.slo_d_no(slsActDR.slo_d_no());										// 受注明細ＮＯ
				arInR.cst_po_no(slsActR.cst_po_no());										// 得意先注文ＮＯ
				arInR.cst_po_d_no(slsActDR.cst_po_d_no());									// 得意先注文明細ＮＯ
				arInR.itm_cd(slsActDR.itm_cd());											// 品目ＣＤ
				arInR.itm_sub1(slsActDR.itm_sub1());										// 枝番１
				arInR.itm_sub2(slsActDR.itm_sub2());										// 枝番２
				arInR.itm_sub3(slsActDR.itm_sub3());										// 枝番３
				arInR.sno1(slsActDR.sno1());												// 手配ＮＯ１
				arInR.sno2(slsActDR.sno2());												// 手配ＮＯ２
				arInR.sno3(slsActDR.sno3());												// 手配ＮＯ３
				arInR.sno4(slsActDR.sno4());												// 手配ＮＯ４
				arInR.itm_nm(slsActDR.itm_nm());											// 品名
				arInR.sundry_itm_flg(slsActDR.sundry_itm_flg());							// 諸口品ＦＬＧ
				arInR.cst_itm_cd(slsActDR.cst_itm_cd());									// 得意先品目
				arInR.cst_itm_nm(slsActDR.cst_itm_nm());									// 得意先品名
				arInR.trd_unit_cd(slsActDR.trd_unit_cd());									// 取引単位ＣＤ
				arInR.base_unit_cd(slsActDR.base_unit_cd());								// 基準単位ＣＤ
				arInR.trd_cur_upri(slsActDR.trd_cur_upri());								// 取引通貨単価
				arInR.inc_tax_flg(taxCacheR.inc_tax_flg());									// 内税ＦＬＧ
				arInR.interim_flg(slsActDR.interim_flg());									// 仮単価ＦＬＧ
				arInR.xrate(slsActR.xrate());												// 為替レート
				arInR.base_cur_upri(slsActDR.base_cur_upri());								// 基準通貨単価
				arInR.tax_typ(taxCacheR.tax_typ());											// 税区分
				arInR.tax_rate(taxCacheR.tax_rate());										// 税率
				arInR.tax_cd(slsActDR.tax_cd());											// 税ＣＤ
				arInR.wtax_rate(slsActDR.wtax_rate());										// 源泉税率
				arInR.trd_d_rmrks(slsActDR.trd_d_rmrks());									// 取引明細備考
				arInR.bill_d_typ(MSC_BILL_D_TYP.SLS.value());								// 請求明細区分「売上」
				arInR.ref_iv_no(slsActR.ref_iv_no());										// 対応インボイスＮＯ
				arInR.rcv_schd_dt(slsActR.rcv_schd_dt());									// 入金予定日
				arInR.wrk_no(slsActDR.wrk_no());											// 案件ＮＯ
				
				// 取消の場合
				if (canFlg) {
					// 取消データ、数量、金額はマイナス値に変換
					arInR.trd_unit_qty(slsActDR.trd_unit_qty().negate());					// 取引単位数量
					arInR.base_unit_qty(slsActDR.base_unit_qty().negate());					// 基準単位数量
					arInR.trd_cur_amt(slsActDR.trd_cur_amt().negate());						// 取引通貨金額
					arInR.trd_cur_tax_amt(slsActDR.trd_cur_tax_amt().negate());				// 取引通貨税額
					arInR.base_cur_amt(slsActDR.base_cur_amt().negate());					// 基準通貨金額
					arInR.base_cur_tax_amt(slsActDR.base_cur_tax_amt().negate());			// 基準通貨税額
					if (!isNull(slsActDR.trd_cur_dscnt_amt())) {
						arInR.trd_cur_dscnt_amt(slsActDR.trd_cur_dscnt_amt().negate());		// 取引通貨値引額
						arInR.base_cur_dscnt_amt(slsActDR.base_cur_dscnt_amt().negate());	// 基準通貨値引額
					}
					if (!isNull(slsActDR.wtax_amt())) {
						arInR.wtax_amt(slsActDR.wtax_amt().negate());						// 源泉税額
					}
					
					arInR.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());						// 伝票状況区分「取消」
					arInR.ar_typ(slsActDR.ar_typ());										// 債権区分
					arInR.act_d_seq(slsActDR.sls_act_d_seq().add(1));						// 明細実績連番（売上実績明細連番）
				}
				// 新規・更新の場合
				else {
					arInR.trd_unit_qty(slsActDR.trd_unit_qty());							// 取引単位数量
					arInR.base_unit_qty(slsActDR.base_unit_qty());							// 基準単位数量
					arInR.trd_cur_amt(slsActDR.trd_cur_amt());								// 取引通貨金額
					arInR.trd_cur_dscnt_amt(slsActDR.trd_cur_dscnt_amt());					// 取引通貨値引額
					arInR.base_cur_amt(slsActDR.base_cur_amt());							// 基準通貨金額
					arInR.base_cur_dscnt_amt(slsActDR.base_cur_dscnt_amt());				// 基準通貨値引額
					arInR.base_cur_tax_amt(slsActDR.base_cur_tax_amt());					// 基準通貨税額
					arInR.trd_cur_tax_amt(slsActDR.trd_cur_tax_amt());						// 取引通貨税額
					arInR.wtax_amt(slsActDR.wtax_amt());									// 源泉税額
					
					arInR.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());						// 伝票状況区分「新規」
					arInR.ar_typ(slsActDR.ar_typ());										// 債権区分
					arInR.act_d_seq(slsActDR.sls_act_d_seq());								// 明細実績連番（売上実績明細連番）
				}
				
				_arInLAprv.add(arInR);
			}
		}
		
		/**
		 * 債権共通SVの呼び出し
		 * 
		 */
		protected void callArCmnSvAprv() {
			if (_arInLAprv.size() == 0) {
				return;
			}
			MSBGL_ArCmnService.ArCmn_Upd01 ope = MSBGL_ArCmnService.crtArCmn_Upd01();
			ope.up0().setAll(_arInLAprv);
			ope.up1().ar_ope_typ(MSC_AR_OPE_TYP.SLS_ACT.value());	// 債権更新処理区分「売上実績」
			ope.exec();
		}
		
		/**
		 * 受払実績SV呼出（実績登録）
		 * 
		 */
		protected void callIoActSv() {
			MSBEL_IoActService.IoAct_Upd01 o = MSBEL_IoActService.crtIoAct_Upd01();
			o.exec();
		}
		
		/**
		 * 受払実績SV呼出（受払ワークの登録）
		 * 
		 */
		protected void callIoActSvWK(SlsAct_Upd03_AprvR upR, MST_SLS_ACT_R slsActR,
				MCList<MST_SLS_ACT_D_R> slsActDL, MCList<MST_SLS_ACT_IO_R> slsActIoL,
				String befAprvStsTyp) {
			MSBEL_IoActService.IoAct_Ins01 ope = MSBEL_IoActService.crtIoAct_Ins01();
			ope.up0().setAll(makeIoUpAprv(upR, slsActR, slsActDL, slsActIoL, befAprvStsTyp));
			ope.exec();
		}
		
		/**
		 * 受払実績SV呼出のための電文作成
		 * 
		 * @return
		 */
		protected MCList<IoAct_Ins01_DtlR> makeIoUpAprv(SlsAct_Upd03_AprvR upR, MST_SLS_ACT_R slsActR,
				MCList<MST_SLS_ACT_D_R> slsActDL, MCList<MST_SLS_ACT_IO_R> slsActIoL,
				String befAprvStsTyp
				) {
			
			MCList<IoAct_Ins01_DtlR> ioActL = MCList.create(IoAct_Ins01_DtlR.class);
			
			// 処理対象が最終承認済だった場合、削除の受払電文を作成
			if (MAC_APRV_STS_TYP.isACPT(befAprvStsTyp)) {
				IoAct_Ins01_DtlR ioActR = IoAct_Ins01_DtlR.create();
				ioActR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());				// データ更新区分
				ioActR.can_ac_dt(slsActR.ac_dt());									// 取消計上日（計上日）
				ioActR.act_no(slsActR.sls_act_no());								// ヘッダ実績ＮＯ
				ioActR.trn_typ(MSC_TRN_TYP.SLS.value());							// トランザクション区分（売上）
				
				ioActL.add(ioActR);
			}
			
			// 上り電文が最終承認済だった場合、新規の受払電文を作成
			else if (MAC_APRV_STS_TYP.isACPT(upR.aprv_sts_typ())){
				for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
					IoAct_Ins01_DtlR ioActR = IoAct_Ins01_DtlR.create();
					ioActR.bd_dpt_cd(slsActR.sls_dpt_cd());							// 負担部門ＣＤ
					ioActR.bd_wg_cd(slsActR.wg_cd());								// 負担ＷＧ ＣＤ（売上部門のワーキンググループＣＤ）
					ioActR.iv_no(slsActR.iv_no());									// インボイスＮＯ
					
					// 明細に紐づく詳細情報を取得
					MCList<MST_SLS_ACT_IO_R> ioTgtL = 
							slsActIoL.subList(SlsAct_Upd01_IoR.$sls_act_d_no, slsActDR.sls_act_d_no());
					
					for (MST_SLS_ACT_IO_R ioTgtR : ioTgtL) {
						ioActR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());		// データ更新区分
						ioActR.ac_dt(slsActR.ac_dt());								// 計上日
						ioActR.act_tm(slsActR.sls_dt());							// 実績日時
						ioActR.act_no(slsActR.sls_act_no());						// ヘッダ実績ＮＯ
						ioActR.act_seq(slsActR.sls_act_seq());						// ヘッダ実績連番
						ioActR.act_rev_no(slsActR.sls_act_rev());					// ヘッダ実績改訂番号
						ioActR.act_d_no(slsActDR.sls_act_d_no());					// 明細実績ＮＯ
						ioActR.act_d_seq(slsActDR.sls_act_d_seq());					// 明細実績連番
						ioActR.act_io_no(ioTgtR.sls_act_io_no());					// 実績受払ＮＯ
						ioActR.act_io_seq(ioTgtR.sls_act_io_seq());					// 実績受払連番
						ioActR.trd_cd(slsActR.trd_cd());							// 取引ＣＤ
						ioActR.trd_ptn_typ(slsActR.trd_ptn_typ());					// 取引パタン区分
						ioActR.trn_typ(MSC_TRN_TYP.SLS.value());					// トランザクション区分（売上）
						ioActR.rsn_cd(slsActDR.rsn_cd());							// 理由ＣＤ
						ioActR.sls_dpt_cd(slsActR.sls_dpt_cd());					// 売上部門ＣＤ
						ioActR.ar_dpt_cd(slsActR.ar_dpt_cd());						// 債権部門ＣＤ
						ioActR.sls_usr_cd(slsActR.sls_usr_cd());					// 売上担当者ＣＤ
						ioActR.itm_cd(slsActDR.itm_cd());							// 品目ＣＤ
						ioActR.itm_sub1(slsActDR.itm_sub1());						// 枝番１
						ioActR.itm_sub2(slsActDR.itm_sub2());						// 枝番２
						ioActR.itm_sub3(slsActDR.itm_sub3());						// 枝番３
						ioActR.itm_nm(slsActDR.itm_nm());							// 品名
						ioActR.stk_mng_typ(slsActDR.stk_mng_typ());					// 在庫管理区分
						ioActR.sundry_itm_flg(slsActDR.sundry_itm_flg());			// 諸口品ＦＬＧ
						ioActR.sno1_mng_typ(slsActDR.sno1_mng_typ());				// 手配ＮＯ１管理区分
						ioActR.sno2_mng_typ(slsActDR.sno2_mng_typ());				// 手配ＮＯ２管理区分
						ioActR.sno3_mng_typ(slsActDR.sno3_mng_typ());				// 手配ＮＯ３管理区分
						ioActR.sno4_mng_typ(slsActDR.sno4_mng_typ());				// 手配ＮＯ４管理区分
						ioActR.lot_no(ioTgtR.lot_no());								// ロットＮＯ
						ioActR.sublot_no(ioTgtR.sublot_no());						// サブロットＮＯ
						ioActR.sno1(ioTgtR.sno1());									// 手配ＮＯ１
						ioActR.sno2(ioTgtR.sno2());									// 手配ＮＯ２
						ioActR.sno3(ioTgtR.sno3());									// 手配ＮＯ３
						ioActR.sno4(ioTgtR.sno4());									// 手配ＮＯ４
						ioActR.trd_unit_qty(ioTgtR.trd_unit_qty());					// 取引単位数量
						ioActR.trd_unit_cd(ioTgtR.trd_unit_cd());					// 取引単位ＣＤ
						ioActR.pack_unit_qty(ioTgtR.pack_unit_qty());				// 荷姿単位数量
						ioActR.pack_unit_cd(ioTgtR.pack_unit_cd());					// 荷姿単位ＣＤ
						ioActR.base_unit_qty(ioTgtR.base_unit_qty());				// 基準単位数量
						ioActR.base_unit_cd(ioTgtR.base_unit_cd());					// 基準単位ＣＤ
						ioActR.trd_cur_cd(slsActR.trd_cur_cd());					// 取引通貨ＣＤ
						ioActR.trd_cur_upri(ioTgtR.trd_cur_upri());					// 取引通貨単価
						ioActR.trd_cur_amt(ioTgtR.trd_cur_amt());					// 取引通貨金額
						ioActR.trd_cur_tax_amt(ioTgtR.trd_cur_tax_amt());			// 取引通貨税額
						ioActR.base_cur_cd(slsActR.base_cur_cd());					// 基準通貨ＣＤ
						ioActR.base_cur_upri(ioTgtR.base_cur_upri());				// 基準通貨単価
						ioActR.base_cur_amt(ioTgtR.base_cur_amt());					// 基準通貨金額
						ioActR.base_cur_tax_amt(ioTgtR.base_cur_tax_amt());			// 基準通貨税額
						ioActR.ptax_cur_cd(slsActR.ptax_cur_cd());					// 納税通貨ＣＤ
						ioActR.ptax_cur_upri(ioTgtR.ptax_cur_upri());				// 納税通貨単価
						ioActR.ptax_cur_amt(ioTgtR.ptax_cur_amt());					// 納税通貨金額
						ioActR.ptax_cur_tax_amt(ioTgtR.ptax_cur_tax_amt());			// 納税通貨税額
						ioActR.tax_cd(slsActDR.tax_cd());							// 税ＣＤ
						ioActR.xrate_cd(slsActR.xrate_cd());						// 為替レートＣＤ
						ioActR.xrate(slsActR.xrate());								// 為替レート
						ioActR.ptax_xrate_cd(slsActR.xrate_cd());					// 納税為替レートＣＤ
						ioActR.ptax_xrate(slsActR.ptax_xrate());					// 納税為替レート
						if (!isNull(slsActDR.slo_d_no())) {
							ioActR.slo_no(slsActR.slo_no());						// 受注ＮＯ
						}
						ioActR.acst_cd(slsActR.acst_cd());							// 売掛先ＣＤ
						ioActR.cst_cd(slsActR.cst_cd());							// 得意先ＣＤ
						ioActR.dest_cd1(slsActDR.dest_cd1());						// 仕向先ＣＤ１
						ioActR.dest_cd2(slsActDR.dest_cd2());						// 仕向先ＣＤ２
						ioActR.dest_cd3(slsActDR.dest_cd3());						// 仕向先ＣＤ３
						ioActR.cst_itm_cd(slsActDR.cst_itm_cd());					// 得意先品目ＣＤ
						ioActR.cst_itm_nm(slsActDR.cst_itm_nm());					// 得意先品名
						ioActR.trd_rmrks(slsActR.trd_rmrks());						// 取引備考
						ioActR.trd_d_rmrks(slsActDR.trd_d_rmrks());					// 取引明細備考
						ioActR.wtax_rate(slsActDR.wtax_rate());						// 源泉税率
						ioActR.wtax_amt(slsActDR.wtax_amt());						// 源泉税額
						
						ioActL.add(ioActR);
					}
				}
			}
			return ioActL;
		}
		
		protected Map_MST_SLS_ACT_IO_R_MST_SLS_ACT_IO_R_CRT<MST_SLS_ACT_IO_R,MST_SLS_ACT_IO_R> createMap_MST_SLS_ACT_IO_R_MST_SLS_ACT_IO_R_CRT() {
			return new Map_MST_SLS_ACT_IO_R_MST_SLS_ACT_IO_R_CRT<MST_SLS_ACT_IO_R, MST_SLS_ACT_IO_R>();
		}
		
		public class Map_MST_SLS_ACT_IO_R_MST_SLS_ACT_IO_R_CRT<D extends MST_SLS_ACT_IO_R, S extends MST_SLS_ACT_IO_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SLS_ACT_IO_R.$sls_act_io_no, MST_SLS_ACT_IO_R.$sls_act_io_no);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sls_act_d_no, MST_SLS_ACT_IO_R.$sls_act_d_no);
				addColumnPathMap(MST_SLS_ACT_IO_R.$ship_act_d_no, MST_SLS_ACT_IO_R.$ship_act_d_no);
				addColumnPathMap(MST_SLS_ACT_IO_R.$arr_act_no, MST_SLS_ACT_IO_R.$arr_act_no);
				addColumnPathMap(MST_SLS_ACT_IO_R.$purc_act_io_no, MST_SLS_ACT_IO_R.$purc_act_io_no);
				addColumnPathMap(MST_SLS_ACT_IO_R.$gd_cd, MST_SLS_ACT_IO_R.$gd_cd);
				addColumnPathMap(MST_SLS_ACT_IO_R.$loc_cd, MST_SLS_ACT_IO_R.$loc_cd);
				addColumnPathMap(MST_SLS_ACT_IO_R.$str_ln_cd, MST_SLS_ACT_IO_R.$str_ln_cd);
				addColumnPathMap(MST_SLS_ACT_IO_R.$lot_no, MST_SLS_ACT_IO_R.$lot_no);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sublot_no, MST_SLS_ACT_IO_R.$sublot_no);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sno1, MST_SLS_ACT_IO_R.$sno1);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sno2, MST_SLS_ACT_IO_R.$sno2);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sno3, MST_SLS_ACT_IO_R.$sno3);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sno4, MST_SLS_ACT_IO_R.$sno4);
				addColumnPathMap(MST_SLS_ACT_IO_R.$trd_unit_cd, MST_SLS_ACT_IO_R.$trd_unit_cd);
				addColumnPathMap(MST_SLS_ACT_IO_R.$trd_unit_qty, MST_SLS_ACT_IO_R.$trd_unit_qty);
				addColumnPathMap(MST_SLS_ACT_IO_R.$base_unit_cd, MST_SLS_ACT_IO_R.$base_unit_cd);
				addColumnPathMap(MST_SLS_ACT_IO_R.$base_unit_qty, MST_SLS_ACT_IO_R.$base_unit_qty);
				addColumnPathMap(MST_SLS_ACT_IO_R.$pack_unit_cd, MST_SLS_ACT_IO_R.$pack_unit_cd);
				addColumnPathMap(MST_SLS_ACT_IO_R.$pack_unit_qty, MST_SLS_ACT_IO_R.$pack_unit_qty);
				addColumnPathMap(MST_SLS_ACT_IO_R.$trd_cur_upri, MST_SLS_ACT_IO_R.$trd_cur_upri);
				addColumnPathMap(MST_SLS_ACT_IO_R.$trd_cur_amt, MST_SLS_ACT_IO_R.$trd_cur_amt);
				addColumnPathMap(MST_SLS_ACT_IO_R.$trd_cur_dscnt_amt, MST_SLS_ACT_IO_R.$trd_cur_dscnt_amt);
				addColumnPathMap(MST_SLS_ACT_IO_R.$trd_cur_tax_amt, MST_SLS_ACT_IO_R.$trd_cur_tax_amt);
				addColumnPathMap(MST_SLS_ACT_IO_R.$base_cur_upri, MST_SLS_ACT_IO_R.$base_cur_upri);
				addColumnPathMap(MST_SLS_ACT_IO_R.$base_cur_amt, MST_SLS_ACT_IO_R.$base_cur_amt);
				addColumnPathMap(MST_SLS_ACT_IO_R.$base_cur_dscnt_amt, MST_SLS_ACT_IO_R.$base_cur_dscnt_amt);
				addColumnPathMap(MST_SLS_ACT_IO_R.$base_cur_tax_amt, MST_SLS_ACT_IO_R.$base_cur_tax_amt);
				addColumnPathMap(MST_SLS_ACT_IO_R.$ptax_cur_upri, MST_SLS_ACT_IO_R.$ptax_cur_upri);
				addColumnPathMap(MST_SLS_ACT_IO_R.$ptax_cur_amt, MST_SLS_ACT_IO_R.$ptax_cur_amt);
				addColumnPathMap(MST_SLS_ACT_IO_R.$ptax_cur_dscnt_amt, MST_SLS_ACT_IO_R.$ptax_cur_dscnt_amt);
				addColumnPathMap(MST_SLS_ACT_IO_R.$ptax_cur_tax_amt, MST_SLS_ACT_IO_R.$ptax_cur_tax_amt);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sync_flg, MST_SLS_ACT_IO_R.$sync_flg);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sub_char1, MST_SLS_ACT_IO_R.$sub_char1);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sub_char2, MST_SLS_ACT_IO_R.$sub_char2);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sub_char3, MST_SLS_ACT_IO_R.$sub_char3);
				addColumnPathMap(MST_SLS_ACT_IO_R.$ins_usr_id, MST_SLS_ACT_IO_R.$ins_usr_id);
				addColumnPathMap(MST_SLS_ACT_IO_R.$ins_usr_nm, MST_SLS_ACT_IO_R.$ins_usr_nm);
				addColumnPathMap(MST_SLS_ACT_IO_R.$ins_ts, MST_SLS_ACT_IO_R.$ins_ts);
				addColumnPathMap(MST_SLS_ACT_IO_R.$ins_func_id, MST_SLS_ACT_IO_R.$ins_func_id);
				addColumnPathMap(MST_SLS_ACT_IO_R.$upd_cntr, MST_SLS_ACT_IO_R.$upd_cntr);
				addColumnPathMap(MST_SLS_ACT_IO_R.$upd_usr_id, MST_SLS_ACT_IO_R.$upd_usr_id);
				addColumnPathMap(MST_SLS_ACT_IO_R.$upd_usr_nm, MST_SLS_ACT_IO_R.$upd_usr_nm);
				addColumnPathMap(MST_SLS_ACT_IO_R.$upd_ts, MST_SLS_ACT_IO_R.$upd_ts);
				addColumnPathMap(MST_SLS_ACT_IO_R.$upd_func_id, MST_SLS_ACT_IO_R.$upd_func_id);
				addColumnPathMap(MST_SLS_ACT_IO_R.$upd_srv_req_no, MST_SLS_ACT_IO_R.$upd_srv_req_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.sls_act_d_seq(src.sls_act_d_seq().add(2));
				dest.sls_act_io_seq(src.sls_act_io_seq().add(2));
			}
		}
		
		protected Map_MST_SLS_ACT_D_R_MST_SLS_ACT_D_R_CRT<MST_SLS_ACT_D_R,MST_SLS_ACT_D_R> createMap_MST_SLS_ACT_D_R_MST_SLS_ACT_D_R_CRT() {
			return new Map_MST_SLS_ACT_D_R_MST_SLS_ACT_D_R_CRT<MST_SLS_ACT_D_R, MST_SLS_ACT_D_R>();
		}
		
		public class Map_MST_SLS_ACT_D_R_MST_SLS_ACT_D_R_CRT<D extends MST_SLS_ACT_D_R, S extends MST_SLS_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SLS_ACT_D_R.$sls_act_d_no, MST_SLS_ACT_D_R.$sls_act_d_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$sls_act_no, MST_SLS_ACT_D_R.$sls_act_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$disp_seq, MST_SLS_ACT_D_R.$disp_seq);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_cd, MST_SLS_ACT_D_R.$dlv_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_sundry_flg, MST_SLS_ACT_D_R.$dlv_sundry_flg);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_nm, MST_SLS_ACT_D_R.$dlv_nm);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_zip_cd, MST_SLS_ACT_D_R.$dlv_zip_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_addr1, MST_SLS_ACT_D_R.$dlv_addr1);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_addr2, MST_SLS_ACT_D_R.$dlv_addr2);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_addr3, MST_SLS_ACT_D_R.$dlv_addr3);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_addr4, MST_SLS_ACT_D_R.$dlv_addr4);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_cntct_dpt, MST_SLS_ACT_D_R.$dlv_cntct_dpt);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_cntct_psn, MST_SLS_ACT_D_R.$dlv_cntct_psn);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_tel, MST_SLS_ACT_D_R.$dlv_tel);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_fax, MST_SLS_ACT_D_R.$dlv_fax);
				addColumnPathMap(MST_SLS_ACT_D_R.$pri_prnt_flg, MST_SLS_ACT_D_R.$pri_prnt_flg);
				addColumnPathMap(MST_SLS_ACT_D_R.$dest_cd1, MST_SLS_ACT_D_R.$dest_cd1);
				addColumnPathMap(MST_SLS_ACT_D_R.$dest_cd2, MST_SLS_ACT_D_R.$dest_cd2);
				addColumnPathMap(MST_SLS_ACT_D_R.$dest_cd3, MST_SLS_ACT_D_R.$dest_cd3);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_cd, MST_SLS_ACT_D_R.$tdlv_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_sundry_flg, MST_SLS_ACT_D_R.$tdlv_sundry_flg);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_nm, MST_SLS_ACT_D_R.$tdlv_nm);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_zip_cd, MST_SLS_ACT_D_R.$tdlv_zip_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_addr1, MST_SLS_ACT_D_R.$tdlv_addr1);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_addr2, MST_SLS_ACT_D_R.$tdlv_addr2);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_addr3, MST_SLS_ACT_D_R.$tdlv_addr3);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_addr4, MST_SLS_ACT_D_R.$tdlv_addr4);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_tel, MST_SLS_ACT_D_R.$tdlv_tel);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_fax, MST_SLS_ACT_D_R.$tdlv_fax);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_cntct_dpt, MST_SLS_ACT_D_R.$tdlv_cntct_dpt);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_cntct_psn, MST_SLS_ACT_D_R.$tdlv_cntct_psn);
				addColumnPathMap(MST_SLS_ACT_D_R.$itm_cd, MST_SLS_ACT_D_R.$itm_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$itm_sub1, MST_SLS_ACT_D_R.$itm_sub1);
				addColumnPathMap(MST_SLS_ACT_D_R.$itm_sub2, MST_SLS_ACT_D_R.$itm_sub2);
				addColumnPathMap(MST_SLS_ACT_D_R.$itm_sub3, MST_SLS_ACT_D_R.$itm_sub3);
				addColumnPathMap(MST_SLS_ACT_D_R.$sno1, MST_SLS_ACT_D_R.$sno1);
				addColumnPathMap(MST_SLS_ACT_D_R.$sno2, MST_SLS_ACT_D_R.$sno2);
				addColumnPathMap(MST_SLS_ACT_D_R.$sno3, MST_SLS_ACT_D_R.$sno3);
				addColumnPathMap(MST_SLS_ACT_D_R.$sno4, MST_SLS_ACT_D_R.$sno4);
				addColumnPathMap(MST_SLS_ACT_D_R.$itm_nm, MST_SLS_ACT_D_R.$itm_nm);
				addColumnPathMap(MST_SLS_ACT_D_R.$iv_itm_nm, MST_SLS_ACT_D_R.$iv_itm_nm);
				addColumnPathMap(MST_SLS_ACT_D_R.$cntry_org_cd, MST_SLS_ACT_D_R.$cntry_org_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$wrk_no, MST_SLS_ACT_D_R.$wrk_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$loc_cd, MST_SLS_ACT_D_R.$loc_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$str_ln_cd, MST_SLS_ACT_D_R.$str_ln_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$lot_no, MST_SLS_ACT_D_R.$lot_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$sublot_no, MST_SLS_ACT_D_R.$sublot_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$gd_cd, MST_SLS_ACT_D_R.$gd_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$trd_unit_cd, MST_SLS_ACT_D_R.$trd_unit_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$trd_unit_qty, MST_SLS_ACT_D_R.$trd_unit_qty);
				addColumnPathMap(MST_SLS_ACT_D_R.$base_unit_cd, MST_SLS_ACT_D_R.$base_unit_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$base_unit_qty, MST_SLS_ACT_D_R.$base_unit_qty);
				addColumnPathMap(MST_SLS_ACT_D_R.$trd_cur_upri, MST_SLS_ACT_D_R.$trd_cur_upri);
				addColumnPathMap(MST_SLS_ACT_D_R.$trd_cur_amt, MST_SLS_ACT_D_R.$trd_cur_amt);
				addColumnPathMap(MST_SLS_ACT_D_R.$upri_not_tgt_flg, MST_SLS_ACT_D_R.$upri_not_tgt_flg);
				addColumnPathMap(MST_SLS_ACT_D_R.$interim_flg, MST_SLS_ACT_D_R.$interim_flg);
				addColumnPathMap(MST_SLS_ACT_D_R.$tax_cd, MST_SLS_ACT_D_R.$tax_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$trd_cur_tax_amt, MST_SLS_ACT_D_R.$trd_cur_tax_amt);
				addColumnPathMap(MST_SLS_ACT_D_R.$base_cur_upri, MST_SLS_ACT_D_R.$base_cur_upri);
				addColumnPathMap(MST_SLS_ACT_D_R.$base_cur_amt, MST_SLS_ACT_D_R.$base_cur_amt);
				addColumnPathMap(MST_SLS_ACT_D_R.$base_cur_tax_amt, MST_SLS_ACT_D_R.$base_cur_tax_amt);
				addColumnPathMap(MST_SLS_ACT_D_R.$ptax_cur_upri, MST_SLS_ACT_D_R.$ptax_cur_upri);
				addColumnPathMap(MST_SLS_ACT_D_R.$ptax_cur_amt, MST_SLS_ACT_D_R.$ptax_cur_amt);
				addColumnPathMap(MST_SLS_ACT_D_R.$ptax_cur_tax_amt, MST_SLS_ACT_D_R.$ptax_cur_tax_amt);
				addColumnPathMap(MST_SLS_ACT_D_R.$cost_upri, MST_SLS_ACT_D_R.$cost_upri);
				addColumnPathMap(MST_SLS_ACT_D_R.$cost_amt, MST_SLS_ACT_D_R.$cost_amt);
				addColumnPathMap(MST_SLS_ACT_D_R.$trd_cur_dscnt_amt, MST_SLS_ACT_D_R.$trd_cur_dscnt_amt);
				addColumnPathMap(MST_SLS_ACT_D_R.$base_cur_dscnt_amt, MST_SLS_ACT_D_R.$base_cur_dscnt_amt);
				addColumnPathMap(MST_SLS_ACT_D_R.$ptax_cur_dscnt_amt, MST_SLS_ACT_D_R.$ptax_cur_dscnt_amt);
				addColumnPathMap(MST_SLS_ACT_D_R.$dscnt_rsn_cd, MST_SLS_ACT_D_R.$dscnt_rsn_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$bill_crryovr_times, MST_SLS_ACT_D_R.$bill_crryovr_times);
				addColumnPathMap(MST_SLS_ACT_D_R.$stk_mng_typ, MST_SLS_ACT_D_R.$stk_mng_typ);
				addColumnPathMap(MST_SLS_ACT_D_R.$sundry_itm_flg, MST_SLS_ACT_D_R.$sundry_itm_flg);
				addColumnPathMap(MST_SLS_ACT_D_R.$sno1_mng_typ, MST_SLS_ACT_D_R.$sno1_mng_typ);
				addColumnPathMap(MST_SLS_ACT_D_R.$sno2_mng_typ, MST_SLS_ACT_D_R.$sno2_mng_typ);
				addColumnPathMap(MST_SLS_ACT_D_R.$sno3_mng_typ, MST_SLS_ACT_D_R.$sno3_mng_typ);
				addColumnPathMap(MST_SLS_ACT_D_R.$sno4_mng_typ, MST_SLS_ACT_D_R.$sno4_mng_typ);
				addColumnPathMap(MST_SLS_ACT_D_R.$ar_typ, MST_SLS_ACT_D_R.$ar_typ);
				addColumnPathMap(MST_SLS_ACT_D_R.$cst_po_d_no, MST_SLS_ACT_D_R.$cst_po_d_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$cst_itm_cd, MST_SLS_ACT_D_R.$cst_itm_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$cst_itm_nm, MST_SLS_ACT_D_R.$cst_itm_nm);
				addColumnPathMap(MST_SLS_ACT_D_R.$trd_d_rmrks, MST_SLS_ACT_D_R.$trd_d_rmrks);
				addColumnPathMap(MST_SLS_ACT_D_R.$intr_rmrks, MST_SLS_ACT_D_R.$intr_rmrks);
				addColumnPathMap(MST_SLS_ACT_D_R.$rsn_cd, MST_SLS_ACT_D_R.$rsn_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$bd_dpt_cd, MST_SLS_ACT_D_R.$bd_dpt_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$wtax_rate, MST_SLS_ACT_D_R.$wtax_rate);
				addColumnPathMap(MST_SLS_ACT_D_R.$wtax_amt, MST_SLS_ACT_D_R.$wtax_amt);
				addColumnPathMap(MST_SLS_ACT_D_R.$slo_no, MST_SLS_ACT_D_R.$slo_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$slo_d_no, MST_SLS_ACT_D_R.$slo_d_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$sls_ret_schd_no, MST_SLS_ACT_D_R.$sls_ret_schd_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$sls_ret_schd_d_no, MST_SLS_ACT_D_R.$sls_ret_schd_d_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$ship_schd_no, MST_SLS_ACT_D_R.$ship_schd_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$sls_schd_no, MST_SLS_ACT_D_R.$sls_schd_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$qtn_no, MST_SLS_ACT_D_R.$qtn_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$qtn_rev, MST_SLS_ACT_D_R.$qtn_rev);
				addColumnPathMap(MST_SLS_ACT_D_R.$qtn_d_no, MST_SLS_ACT_D_R.$qtn_d_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$purc_ddlv_po_no, MST_SLS_ACT_D_R.$purc_ddlv_po_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$purc_ddlv_po_d_no, MST_SLS_ACT_D_R.$purc_ddlv_po_d_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$purc_act_no, MST_SLS_ACT_D_R.$purc_act_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$purc_act_d_no, MST_SLS_ACT_D_R.$purc_act_d_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$iv_d_no, MST_SLS_ACT_D_R.$iv_d_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$sub_char1, MST_SLS_ACT_D_R.$sub_char1);
				addColumnPathMap(MST_SLS_ACT_D_R.$sub_char2, MST_SLS_ACT_D_R.$sub_char2);
				addColumnPathMap(MST_SLS_ACT_D_R.$sub_char3, MST_SLS_ACT_D_R.$sub_char3);
				addColumnPathMap(MST_SLS_ACT_D_R.$ref_sls_act_no, MST_SLS_ACT_D_R.$ref_sls_act_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$ref_sls_act_seq, MST_SLS_ACT_D_R.$ref_sls_act_seq);
				addColumnPathMap(MST_SLS_ACT_D_R.$ref_sls_act_d_no, MST_SLS_ACT_D_R.$ref_sls_act_d_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$ref_sls_act_d_seq, MST_SLS_ACT_D_R.$ref_sls_act_d_seq);
				addColumnPathMap(MST_SLS_ACT_D_R.$base_sls_ac_dt, MST_SLS_ACT_D_R.$base_sls_ac_dt);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.sls_act_d_seq(src.sls_act_d_seq().add(2));
				dest.sls_act_seq(src.sls_act_seq().add(2));
			}
		}
		
		protected Map_MST_SLS_ACT_R_MST_SLS_ACT_R<MST_SLS_ACT_R,MST_SLS_ACT_R> createMap_MST_SLS_ACT_R_MST_SLS_ACT_R() {
			return new Map_MST_SLS_ACT_R_MST_SLS_ACT_R<MST_SLS_ACT_R, MST_SLS_ACT_R>();
		}

		public class Map_MST_SLS_ACT_R_MST_SLS_ACT_R<D extends MST_SLS_ACT_R, S extends MST_SLS_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SLS_ACT_R.$sls_act_no, MST_SLS_ACT_R.$sls_act_no);
				addColumnPathMap(MST_SLS_ACT_R.$sls_act_rev, MST_SLS_ACT_R.$sls_act_rev);
				addColumnPathMap(MST_SLS_ACT_R.$trd_cd, MST_SLS_ACT_R.$trd_cd);
				addColumnPathMap(MST_SLS_ACT_R.$trd_ptn_typ, MST_SLS_ACT_R.$trd_ptn_typ);
				addColumnPathMap(MST_SLS_ACT_R.$ac_ym, MST_SLS_ACT_R.$ac_ym);
				addColumnPathMap(MST_SLS_ACT_R.$ac_dt, MST_SLS_ACT_R.$ac_dt);
				addColumnPathMap(MST_SLS_ACT_R.$sls_dpt_cd, MST_SLS_ACT_R.$sls_dpt_cd);
				addColumnPathMap(MST_SLS_ACT_R.$wg_cd, MST_SLS_ACT_R.$wg_cd);
				addColumnPathMap(MST_SLS_ACT_R.$sls_usr_cd, MST_SLS_ACT_R.$sls_usr_cd);
				addColumnPathMap(MST_SLS_ACT_R.$sls_dt, MST_SLS_ACT_R.$sls_dt);
				addColumnPathMap(MST_SLS_ACT_R.$ship_tm, MST_SLS_ACT_R.$ship_tm);
				addColumnPathMap(MST_SLS_ACT_R.$dlv_tm, MST_SLS_ACT_R.$dlv_tm);
				addColumnPathMap(MST_SLS_ACT_R.$cst_cd, MST_SLS_ACT_R.$cst_cd);
				addColumnPathMap(MST_SLS_ACT_R.$iv_no, MST_SLS_ACT_R.$iv_no);
				addColumnPathMap(MST_SLS_ACT_R.$ref_iv_no, MST_SLS_ACT_R.$ref_iv_no);
				addColumnPathMap(MST_SLS_ACT_R.$rcpt_iv_mng_no, MST_SLS_ACT_R.$rcpt_iv_mng_no);
				addColumnPathMap(MST_SLS_ACT_R.$rcpt_iv_no, MST_SLS_ACT_R.$rcpt_iv_no);
				addColumnPathMap(MST_SLS_ACT_R.$tterm_cd1, MST_SLS_ACT_R.$tterm_cd1);
				addColumnPathMap(MST_SLS_ACT_R.$tterm_rmrks1, MST_SLS_ACT_R.$tterm_rmrks1);
				addColumnPathMap(MST_SLS_ACT_R.$tterm_cd2, MST_SLS_ACT_R.$tterm_cd2);
				addColumnPathMap(MST_SLS_ACT_R.$tterm_rmrks2, MST_SLS_ACT_R.$tterm_rmrks2);
				addColumnPathMap(MST_SLS_ACT_R.$tterm_cd3, MST_SLS_ACT_R.$tterm_cd3);
				addColumnPathMap(MST_SLS_ACT_R.$tterm_rmrks3, MST_SLS_ACT_R.$tterm_rmrks3);
				addColumnPathMap(MST_SLS_ACT_R.$lc_no, MST_SLS_ACT_R.$lc_no);
				addColumnPathMap(MST_SLS_ACT_R.$lc_dt, MST_SLS_ACT_R.$lc_dt);
				addColumnPathMap(MST_SLS_ACT_R.$lc_rmrks, MST_SLS_ACT_R.$lc_rmrks);
				addColumnPathMap(MST_SLS_ACT_R.$rcv_schd_dt, MST_SLS_ACT_R.$rcv_schd_dt);
				addColumnPathMap(MST_SLS_ACT_R.$bill_basis_dt, MST_SLS_ACT_R.$bill_basis_dt);
				addColumnPathMap(MST_SLS_ACT_R.$cred_cd, MST_SLS_ACT_R.$cred_cd);
				addColumnPathMap(MST_SLS_ACT_R.$bcst_cd, MST_SLS_ACT_R.$bcst_cd);
				addColumnPathMap(MST_SLS_ACT_R.$acst_cd, MST_SLS_ACT_R.$acst_cd);
				addColumnPathMap(MST_SLS_ACT_R.$ar_dpt_cd, MST_SLS_ACT_R.$ar_dpt_cd);
				addColumnPathMap(MST_SLS_ACT_R.$cst_po_no, MST_SLS_ACT_R.$cst_po_no);
				addColumnPathMap(MST_SLS_ACT_R.$trd_cur_cd, MST_SLS_ACT_R.$trd_cur_cd);
				addColumnPathMap(MST_SLS_ACT_R.$base_cur_cd, MST_SLS_ACT_R.$base_cur_cd);
				addColumnPathMap(MST_SLS_ACT_R.$xrate_cd, MST_SLS_ACT_R.$xrate_cd);
				addColumnPathMap(MST_SLS_ACT_R.$xrate, MST_SLS_ACT_R.$xrate);
				addColumnPathMap(MST_SLS_ACT_R.$ptax_cur_cd, MST_SLS_ACT_R.$ptax_cur_cd);
				addColumnPathMap(MST_SLS_ACT_R.$ptax_xrate, MST_SLS_ACT_R.$ptax_xrate);
				addColumnPathMap(MST_SLS_ACT_R.$trd_cur_amt, MST_SLS_ACT_R.$trd_cur_amt);
				addColumnPathMap(MST_SLS_ACT_R.$trd_cur_tax_amt, MST_SLS_ACT_R.$trd_cur_tax_amt);
				addColumnPathMap(MST_SLS_ACT_R.$base_cur_amt, MST_SLS_ACT_R.$base_cur_amt);
				addColumnPathMap(MST_SLS_ACT_R.$base_cur_tax_amt, MST_SLS_ACT_R.$base_cur_tax_amt);
				addColumnPathMap(MST_SLS_ACT_R.$trd_rmrks, MST_SLS_ACT_R.$trd_rmrks);
				addColumnPathMap(MST_SLS_ACT_R.$intr_rmrks, MST_SLS_ACT_R.$intr_rmrks);
				addColumnPathMap(MST_SLS_ACT_R.$ship_act_no, MST_SLS_ACT_R.$ship_act_no);
				addColumnPathMap(MST_SLS_ACT_R.$slo_no, MST_SLS_ACT_R.$slo_no);
				addColumnPathMap(MST_SLS_ACT_R.$sls_ret_schd_no, MST_SLS_ACT_R.$sls_ret_schd_no);
				addColumnPathMap(MST_SLS_ACT_R.$qtn_no, MST_SLS_ACT_R.$qtn_no);
				addColumnPathMap(MST_SLS_ACT_R.$qtn_rev, MST_SLS_ACT_R.$qtn_rev);
				addColumnPathMap(MST_SLS_ACT_R.$dlv_slip_no, MST_SLS_ACT_R.$dlv_slip_no);
				addColumnPathMap(MST_SLS_ACT_R.$slip_form_cd, MST_SLS_ACT_R.$slip_form_cd);
				addColumnPathMap(MST_SLS_ACT_R.$aprv_flg, MST_SLS_ACT_R.$aprv_flg);
				addColumnPathMap(MST_SLS_ACT_R.$aprv_no, MST_SLS_ACT_R.$aprv_no);
				addColumnPathMap(MST_SLS_ACT_R.$sls_basis_typ, MST_SLS_ACT_R.$sls_basis_typ);
				addColumnPathMap(MST_SLS_ACT_R.$adjst_tgt_dt, MST_SLS_ACT_R.$adjst_tgt_dt);
				addColumnPathMap(MST_SLS_ACT_R.$sls_adjst_typ, MST_SLS_ACT_R.$sls_adjst_typ);
				addColumnPathMap(MST_SLS_ACT_R.$adjst_mtd_typ, MST_SLS_ACT_R.$adjst_mtd_typ);
				addColumnPathMap(MST_SLS_ACT_R.$sub_char1, MST_SLS_ACT_R.$sub_char1);
				addColumnPathMap(MST_SLS_ACT_R.$sub_char2, MST_SLS_ACT_R.$sub_char2);
				addColumnPathMap(MST_SLS_ACT_R.$sub_char3, MST_SLS_ACT_R.$sub_char3);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (MAC_SLIP_STS_TYP.isCAN(dest.slip_sts_typ())) {
					dest.sls_act_seq(src.sls_act_seq().add(1));
					dest.trd_cur_amt(src.trd_cur_amt().negate());			// 取引通貨金額
					dest.trd_cur_tax_amt(src.trd_cur_tax_amt().negate());	// 取引通貨税額
					dest.base_cur_amt(src.base_cur_amt().negate());			// 基準通貨金額
					dest.base_cur_tax_amt(src.base_cur_tax_amt().negate());	// 基準通貨税額
				}
				else {
					dest.sls_act_seq(src.sls_act_seq().add(2));
					dest.sls_act_rev(src.sls_act_rev().add(1));
					dest.dlv_slip_no(null);
				}
			}
		}
		
		protected Map_MST_SLS_ACT_IO_R_MST_SLS_ACT_IO_R_CAN<MST_SLS_ACT_IO_R,MST_SLS_ACT_IO_R> createMap_MST_SLS_ACT_IO_R_MST_SLS_ACT_IO_R_CAN() {
			return new Map_MST_SLS_ACT_IO_R_MST_SLS_ACT_IO_R_CAN<MST_SLS_ACT_IO_R, MST_SLS_ACT_IO_R>();
		}

		public class Map_MST_SLS_ACT_IO_R_MST_SLS_ACT_IO_R_CAN<D extends MST_SLS_ACT_IO_R, S extends MST_SLS_ACT_IO_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SLS_ACT_IO_R.$sls_act_io_no, MST_SLS_ACT_IO_R.$sls_act_io_no);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sls_act_d_no, MST_SLS_ACT_IO_R.$sls_act_d_no);
				addColumnPathMap(MST_SLS_ACT_IO_R.$ship_act_d_no, MST_SLS_ACT_IO_R.$ship_act_d_no);
				addColumnPathMap(MST_SLS_ACT_IO_R.$arr_act_no, MST_SLS_ACT_IO_R.$arr_act_no);
				addColumnPathMap(MST_SLS_ACT_IO_R.$purc_act_io_no, MST_SLS_ACT_IO_R.$purc_act_io_no);
				addColumnPathMap(MST_SLS_ACT_IO_R.$gd_cd, MST_SLS_ACT_IO_R.$gd_cd);
				addColumnPathMap(MST_SLS_ACT_IO_R.$loc_cd, MST_SLS_ACT_IO_R.$loc_cd);
				addColumnPathMap(MST_SLS_ACT_IO_R.$str_ln_cd, MST_SLS_ACT_IO_R.$str_ln_cd);
				addColumnPathMap(MST_SLS_ACT_IO_R.$lot_no, MST_SLS_ACT_IO_R.$lot_no);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sublot_no, MST_SLS_ACT_IO_R.$sublot_no);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sno1, MST_SLS_ACT_IO_R.$sno1);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sno2, MST_SLS_ACT_IO_R.$sno2);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sno3, MST_SLS_ACT_IO_R.$sno3);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sno4, MST_SLS_ACT_IO_R.$sno4);
				addColumnPathMap(MST_SLS_ACT_IO_R.$trd_unit_cd, MST_SLS_ACT_IO_R.$trd_unit_cd);
				addColumnPathMap(MST_SLS_ACT_IO_R.$base_unit_cd, MST_SLS_ACT_IO_R.$base_unit_cd);
				addColumnPathMap(MST_SLS_ACT_IO_R.$pack_unit_cd, MST_SLS_ACT_IO_R.$pack_unit_cd);
				addColumnPathMap(MST_SLS_ACT_IO_R.$trd_cur_upri, MST_SLS_ACT_IO_R.$trd_cur_upri);
				addColumnPathMap(MST_SLS_ACT_IO_R.$base_cur_upri, MST_SLS_ACT_IO_R.$base_cur_upri);
				addColumnPathMap(MST_SLS_ACT_IO_R.$ptax_cur_upri, MST_SLS_ACT_IO_R.$ptax_cur_upri);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sync_flg, MST_SLS_ACT_IO_R.$sync_flg);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sub_char1, MST_SLS_ACT_IO_R.$sub_char1);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sub_char2, MST_SLS_ACT_IO_R.$sub_char2);
				addColumnPathMap(MST_SLS_ACT_IO_R.$sub_char3, MST_SLS_ACT_IO_R.$sub_char3);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.sls_act_d_seq(src.sls_act_d_seq().add(1));
				dest.sls_act_io_seq(src.sls_act_io_seq().add(1));
				
				// 取消データ、数量、金額はマイナス値に変換
				dest.trd_unit_qty(src.trd_unit_qty().negate());						// 取引単位数量
				dest.base_unit_qty(src.base_unit_qty().negate());					// 基準単位数量
				dest.pack_unit_qty(src.pack_unit_qty().negate());					// 荷姿単位数量
				dest.trd_cur_amt(src.trd_cur_amt().negate());						// 取引通貨金額
				if (!isNull(src.trd_cur_dscnt_amt())) {
					dest.trd_cur_dscnt_amt(src.trd_cur_dscnt_amt().negate());		// 取引通貨値引額
				}
				if (!isNull(src.base_cur_dscnt_amt())) {
					dest.base_cur_dscnt_amt(src.base_cur_dscnt_amt().negate());		// 基準通貨値引額
				}
				dest.trd_cur_tax_amt(src.trd_cur_tax_amt().negate());				// 取引通貨税額
				dest.base_cur_amt(src.base_cur_amt().negate());						// 基準通貨金額
				dest.base_cur_tax_amt(src.base_cur_tax_amt().negate());				// 基準通貨税額
				if (!isNull(src.ptax_cur_amt())) {
					dest.ptax_cur_amt(src.ptax_cur_amt().negate());					// 納税通貨金額
					dest.ptax_cur_tax_amt(src.ptax_cur_tax_amt().negate());			// 納税通貨税額
					if (!isNull(src.ptax_cur_dscnt_amt())) {
						dest.ptax_cur_dscnt_amt(src.ptax_cur_dscnt_amt().negate());	// 納税通貨値引額
					}
				}
			}
		}
		
		protected Map_MST_SLS_ACT_D_R_MST_SLS_ACT_D_R_CAN<MST_SLS_ACT_D_R,MST_SLS_ACT_D_R> createMap_MST_SLS_ACT_D_R_MST_SLS_ACT_D_R_CAN() {
			return new Map_MST_SLS_ACT_D_R_MST_SLS_ACT_D_R_CAN<MST_SLS_ACT_D_R, MST_SLS_ACT_D_R>();
		}
		
		public class Map_MST_SLS_ACT_D_R_MST_SLS_ACT_D_R_CAN<D extends MST_SLS_ACT_D_R, S extends MST_SLS_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SLS_ACT_D_R.$sls_act_d_no, MST_SLS_ACT_D_R.$sls_act_d_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$sls_act_no, MST_SLS_ACT_D_R.$sls_act_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$disp_seq, MST_SLS_ACT_D_R.$disp_seq);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_cd, MST_SLS_ACT_D_R.$dlv_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_sundry_flg, MST_SLS_ACT_D_R.$dlv_sundry_flg);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_nm, MST_SLS_ACT_D_R.$dlv_nm);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_zip_cd, MST_SLS_ACT_D_R.$dlv_zip_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_addr1, MST_SLS_ACT_D_R.$dlv_addr1);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_addr2, MST_SLS_ACT_D_R.$dlv_addr2);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_addr3, MST_SLS_ACT_D_R.$dlv_addr3);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_addr4, MST_SLS_ACT_D_R.$dlv_addr4);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_cntct_dpt, MST_SLS_ACT_D_R.$dlv_cntct_dpt);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_cntct_psn, MST_SLS_ACT_D_R.$dlv_cntct_psn);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_tel, MST_SLS_ACT_D_R.$dlv_tel);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_fax, MST_SLS_ACT_D_R.$dlv_fax);
				addColumnPathMap(MST_SLS_ACT_D_R.$pri_prnt_flg, MST_SLS_ACT_D_R.$pri_prnt_flg);
				addColumnPathMap(MST_SLS_ACT_D_R.$dest_cd1, MST_SLS_ACT_D_R.$dest_cd1);
				addColumnPathMap(MST_SLS_ACT_D_R.$dest_cd2, MST_SLS_ACT_D_R.$dest_cd2);
				addColumnPathMap(MST_SLS_ACT_D_R.$dest_cd3, MST_SLS_ACT_D_R.$dest_cd3);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_cd, MST_SLS_ACT_D_R.$tdlv_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_sundry_flg, MST_SLS_ACT_D_R.$tdlv_sundry_flg);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_nm, MST_SLS_ACT_D_R.$tdlv_nm);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_zip_cd, MST_SLS_ACT_D_R.$tdlv_zip_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_addr1, MST_SLS_ACT_D_R.$tdlv_addr1);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_addr2, MST_SLS_ACT_D_R.$tdlv_addr2);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_addr3, MST_SLS_ACT_D_R.$tdlv_addr3);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_addr4, MST_SLS_ACT_D_R.$tdlv_addr4);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_tel, MST_SLS_ACT_D_R.$tdlv_tel);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_fax, MST_SLS_ACT_D_R.$tdlv_fax);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_cntct_dpt, MST_SLS_ACT_D_R.$tdlv_cntct_dpt);
				addColumnPathMap(MST_SLS_ACT_D_R.$tdlv_cntct_psn, MST_SLS_ACT_D_R.$tdlv_cntct_psn);
				addColumnPathMap(MST_SLS_ACT_D_R.$itm_cd, MST_SLS_ACT_D_R.$itm_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$itm_sub1, MST_SLS_ACT_D_R.$itm_sub1);
				addColumnPathMap(MST_SLS_ACT_D_R.$itm_sub2, MST_SLS_ACT_D_R.$itm_sub2);
				addColumnPathMap(MST_SLS_ACT_D_R.$itm_sub3, MST_SLS_ACT_D_R.$itm_sub3);
				addColumnPathMap(MST_SLS_ACT_D_R.$sno1, MST_SLS_ACT_D_R.$sno1);
				addColumnPathMap(MST_SLS_ACT_D_R.$sno2, MST_SLS_ACT_D_R.$sno2);
				addColumnPathMap(MST_SLS_ACT_D_R.$sno3, MST_SLS_ACT_D_R.$sno3);
				addColumnPathMap(MST_SLS_ACT_D_R.$sno4, MST_SLS_ACT_D_R.$sno4);
				addColumnPathMap(MST_SLS_ACT_D_R.$itm_nm, MST_SLS_ACT_D_R.$itm_nm);
				addColumnPathMap(MST_SLS_ACT_D_R.$iv_itm_nm, MST_SLS_ACT_D_R.$iv_itm_nm);
				addColumnPathMap(MST_SLS_ACT_D_R.$cntry_org_cd, MST_SLS_ACT_D_R.$cntry_org_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$wrk_no, MST_SLS_ACT_D_R.$wrk_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$loc_cd, MST_SLS_ACT_D_R.$loc_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$str_ln_cd, MST_SLS_ACT_D_R.$str_ln_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$lot_no, MST_SLS_ACT_D_R.$lot_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$sublot_no, MST_SLS_ACT_D_R.$sublot_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$gd_cd, MST_SLS_ACT_D_R.$gd_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$trd_unit_cd, MST_SLS_ACT_D_R.$trd_unit_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$base_unit_cd, MST_SLS_ACT_D_R.$base_unit_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$trd_cur_upri, MST_SLS_ACT_D_R.$trd_cur_upri);
				addColumnPathMap(MST_SLS_ACT_D_R.$upri_not_tgt_flg, MST_SLS_ACT_D_R.$upri_not_tgt_flg);
				addColumnPathMap(MST_SLS_ACT_D_R.$interim_flg, MST_SLS_ACT_D_R.$interim_flg);
				addColumnPathMap(MST_SLS_ACT_D_R.$tax_cd, MST_SLS_ACT_D_R.$tax_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$base_cur_upri, MST_SLS_ACT_D_R.$base_cur_upri);
				addColumnPathMap(MST_SLS_ACT_D_R.$ptax_cur_upri, MST_SLS_ACT_D_R.$ptax_cur_upri);
				addColumnPathMap(MST_SLS_ACT_D_R.$cost_upri, MST_SLS_ACT_D_R.$cost_upri);
				addColumnPathMap(MST_SLS_ACT_D_R.$cost_amt, MST_SLS_ACT_D_R.$cost_amt);
				addColumnPathMap(MST_SLS_ACT_D_R.$dscnt_rsn_cd, MST_SLS_ACT_D_R.$dscnt_rsn_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$bill_crryovr_times, MST_SLS_ACT_D_R.$bill_crryovr_times);
				addColumnPathMap(MST_SLS_ACT_D_R.$stk_mng_typ, MST_SLS_ACT_D_R.$stk_mng_typ);
				addColumnPathMap(MST_SLS_ACT_D_R.$sundry_itm_flg, MST_SLS_ACT_D_R.$sundry_itm_flg);
				addColumnPathMap(MST_SLS_ACT_D_R.$sno1_mng_typ, MST_SLS_ACT_D_R.$sno1_mng_typ);
				addColumnPathMap(MST_SLS_ACT_D_R.$sno2_mng_typ, MST_SLS_ACT_D_R.$sno2_mng_typ);
				addColumnPathMap(MST_SLS_ACT_D_R.$sno3_mng_typ, MST_SLS_ACT_D_R.$sno3_mng_typ);
				addColumnPathMap(MST_SLS_ACT_D_R.$sno4_mng_typ, MST_SLS_ACT_D_R.$sno4_mng_typ);
				addColumnPathMap(MST_SLS_ACT_D_R.$ar_typ, MST_SLS_ACT_D_R.$ar_typ);
				addColumnPathMap(MST_SLS_ACT_D_R.$cst_po_d_no, MST_SLS_ACT_D_R.$cst_po_d_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$cst_itm_cd, MST_SLS_ACT_D_R.$cst_itm_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$cst_itm_nm, MST_SLS_ACT_D_R.$cst_itm_nm);
				addColumnPathMap(MST_SLS_ACT_D_R.$trd_d_rmrks, MST_SLS_ACT_D_R.$trd_d_rmrks);
				addColumnPathMap(MST_SLS_ACT_D_R.$intr_rmrks, MST_SLS_ACT_D_R.$intr_rmrks);
				addColumnPathMap(MST_SLS_ACT_D_R.$rsn_cd, MST_SLS_ACT_D_R.$rsn_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$bd_dpt_cd, MST_SLS_ACT_D_R.$bd_dpt_cd);
				addColumnPathMap(MST_SLS_ACT_D_R.$wtax_rate, MST_SLS_ACT_D_R.$wtax_rate);
				addColumnPathMap(MST_SLS_ACT_D_R.$slo_no, MST_SLS_ACT_D_R.$slo_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$slo_d_no, MST_SLS_ACT_D_R.$slo_d_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$sls_ret_schd_no, MST_SLS_ACT_D_R.$sls_ret_schd_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$sls_ret_schd_d_no, MST_SLS_ACT_D_R.$sls_ret_schd_d_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$ship_schd_no, MST_SLS_ACT_D_R.$ship_schd_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$sls_schd_no, MST_SLS_ACT_D_R.$sls_schd_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$qtn_no, MST_SLS_ACT_D_R.$qtn_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$qtn_rev, MST_SLS_ACT_D_R.$qtn_rev);
				addColumnPathMap(MST_SLS_ACT_D_R.$qtn_d_no, MST_SLS_ACT_D_R.$qtn_d_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$purc_ddlv_po_no, MST_SLS_ACT_D_R.$purc_ddlv_po_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$purc_ddlv_po_d_no, MST_SLS_ACT_D_R.$purc_ddlv_po_d_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$purc_act_no, MST_SLS_ACT_D_R.$purc_act_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$purc_act_d_no, MST_SLS_ACT_D_R.$purc_act_d_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$iv_d_no, MST_SLS_ACT_D_R.$iv_d_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$sub_char1, MST_SLS_ACT_D_R.$sub_char1);
				addColumnPathMap(MST_SLS_ACT_D_R.$sub_char2, MST_SLS_ACT_D_R.$sub_char2);
				addColumnPathMap(MST_SLS_ACT_D_R.$sub_char3, MST_SLS_ACT_D_R.$sub_char3);
				addColumnPathMap(MST_SLS_ACT_D_R.$ref_sls_act_no, MST_SLS_ACT_D_R.$ref_sls_act_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$ref_sls_act_seq, MST_SLS_ACT_D_R.$ref_sls_act_seq);
				addColumnPathMap(MST_SLS_ACT_D_R.$ref_sls_act_d_no, MST_SLS_ACT_D_R.$ref_sls_act_d_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$ref_sls_act_d_seq, MST_SLS_ACT_D_R.$ref_sls_act_d_seq);
				addColumnPathMap(MST_SLS_ACT_D_R.$base_sls_ac_dt, MST_SLS_ACT_D_R.$base_sls_ac_dt);
				addColumnPathMap(MST_SLS_ACT_D_R.$dlv_slip_d_no, MST_SLS_ACT_D_R.$dlv_slip_d_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.sls_act_d_seq(src.sls_act_d_seq().add(1));
				dest.sls_act_seq(src.sls_act_seq().add(1));
				// 取消データ、数量、金額はマイナス値に変換
				dest.trd_unit_qty(src.trd_unit_qty().negate());						// 取引単位数量
				dest.base_unit_qty(src.base_unit_qty().negate());					// 基準単位数量
				dest.trd_cur_amt(src.trd_cur_amt().negate());						// 取引通貨金額
				dest.trd_cur_tax_amt(src.trd_cur_tax_amt().negate());				// 取引通貨税額
				dest.base_cur_amt(src.base_cur_amt().negate());						// 基準通貨金額
				dest.base_cur_tax_amt(src.base_cur_tax_amt().negate());				// 基準通貨税額
				if (!isNull(src.ptax_cur_amt())) {
					dest.ptax_cur_amt(src.ptax_cur_amt().negate());					// 納税通貨金額
					dest.ptax_cur_tax_amt(src.ptax_cur_tax_amt().negate());			// 納税通貨税額
				}
				if (!isNull(src.trd_cur_dscnt_amt())) {
					dest.trd_cur_dscnt_amt(src.trd_cur_dscnt_amt().negate());		// 取引通貨値引額
					dest.base_cur_dscnt_amt(src.base_cur_dscnt_amt().negate());		// 基準通貨値引額
					if (!isNull(src.ptax_cur_dscnt_amt())) {
						dest.ptax_cur_dscnt_amt(src.ptax_cur_dscnt_amt().negate());	// 納税通貨値引額
					}
				}
				if (!isNull(src.wtax_amt())) {
					dest.wtax_amt(src.wtax_amt().negate());							// 源泉税額
				}
			}
		}
		
		protected MCList<MST_SLS_ACT_R> _slsSlipAprvL = MCList.create(MST_SLS_ACT_R.class);
		protected void makeSlsSlipAprv(MST_SLS_ACT_R slsActR) {
			MST_SLS_ACT_R hdrR = _slsSlipAprvL.add();
			hdrR.sls_act_no(slsActR.sls_act_no());
			hdrR.sls_act_seq(slsActR.sls_act_seq());
			hdrR.iv_no(slsActR.iv_no());
			hdrR.setStringNE("data_crud_typ",
				MAC_SLIP_STS_TYP.isCAN(slsActR.slip_sts_typ()) ?
					MAC_DATA_CRUD_TYP.DEL.value() : MAC_DATA_CRUD_TYP.CRT.value());
			hdrR.trd_cd(slsActR.trd_cd());
			hdrR.setAttributes(slsActR);
		}
		protected void callGALink() {
			if (_slsSlipAprvL.isEmpty()) {
				return;
			}
			callGALinkCmn(_slsSlipAprvL);
			_slsSlipAprvL.clear();
		}
	}
	
	/**
	 * SlsAct_Upd04オペレーション.<p>
	 *
	 * 請求繰越回数を更新する<br>
	 */
	public class SlsAct_Upd04 extends MSBBL_SlsActService_MC_A.SlsAct_Upd04 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 前処理
			preProc();
			
			// 売上実績明細更新
			updSlsActD();
		}
		
		/**
		 * 売上実績明細更新（請求繰越回数の更新）
		 * 
		 */
		protected void updSlsActD() {
			MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
			for (SlsAct_Upd04_DtlR upR : up0()) {
				MST_SLS_ACT_D_R slsActDR = MST_SLS_ACT_D_R.create();
				copy(slsActDR, upR, createMap_MST_SLS_ACT_D_R_SlsAct_Upd04_DtlR());
				slsActDL.add(slsActDR);
			}
			MST_SLS_ACT_D_R t = MST_SLS_ACT_D_R.create("T");
			MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(t);
			slsActDL_bldr.setSet(t.bill_crryovr_times);
			dbUpdateKey("MSBBL6010_MST_SLS_ACT_D_U02", slsActDL, slsActDL_bldr);
		}
		
		protected Map_MST_SLS_ACT_D_R_SlsAct_Upd04_DtlR<MST_SLS_ACT_D_R,SlsAct_Upd04_DtlR> createMap_MST_SLS_ACT_D_R_SlsAct_Upd04_DtlR() {
			return new Map_MST_SLS_ACT_D_R_SlsAct_Upd04_DtlR<MST_SLS_ACT_D_R, SlsAct_Upd04_DtlR>();
		}
		
		public class Map_MST_SLS_ACT_D_R_SlsAct_Upd04_DtlR<D extends MST_SLS_ACT_D_R, S extends SlsAct_Upd04_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SLS_ACT_D_R.$sls_act_d_no, SlsAct_Upd04_DtlR.$sls_act_d_no);
				addColumnPathMap(MST_SLS_ACT_D_R.$sls_act_d_seq, SlsAct_Upd04_DtlR.$sls_act_d_seq);
				addColumnPathMap(MST_SLS_ACT_D_R.$bill_crryovr_times, SlsAct_Upd04_DtlR.$bill_crryovr_times);
			}
		}
		
		/**
		 * 前処理：処理対象の売上実績明細のロック
		 * 
		 */
		protected void preProc() {
			
			MCList<MST_SLS_ACT_D_R> slsActDLockL = MCList.create(MST_SLS_ACT_D_R.class);
			slsActDLockL.addStringColumn("tgt_sls_act_d_no");
			up0().addStringColumn("tgt_sls_act_d_no");
			MST_SLS_ACT_D_R t = MST_SLS_ACT_D_R.create("T");
			MCQueryApiBuilder slsActDLockL_bldr = MCQueryApiBuilder.create(t);
			slsActDLockL_bldr.setSelect(t.sls_act_d_no.as("tgt_sls_act_d_no"));
			dbSelectKeyForUpdateNoWait("MSBBL6010_MST_SLS_ACT_D_S07", slsActDLockL, slsActDLockL_bldr, up0());
			
			for (MST_SLS_ACT_D_R lockR : slsActDLockL) {
				if (isNull(lockR.getStringNE("tgt_sls_act_d_no"))) {
					throw new MCAppException(MSBBL0137, lockR.sls_act_d_no(), lockR.sls_act_d_seq());
				}
			}
		}
	}
	
	/** 取引先マスタ取得 */
	protected FXUCL_MCDbcCache<MAM_BP_R> _bp;
	/**
	 * 取引先ＣＤから取引先マスタ情報を取得する。
	 * 
	 * @param bpCd
	 */
	public static MAM_BP_R getBp(String bpCd) {
		return object(CLAZZ)._getBp(bpCd);
	}
	
	protected MAM_BP_R _getBp(String bpCd) {
		if (_bp == null) {
			_bp = new FXUCL_MCDbcCache<MAM_BP_R>(MCQueryApiBuilder.create(MAM_BP_R.create("T")));
		}
		return _bp.get(bpCd);
	}
	
	/**
	 * 取引パタン区分が売上値引または売上値増であるかどうかを判定
	 * 
	 * @param trdPtnTyp
	 * @return
	 */
	protected boolean isSlsDscntXtra(String trdPtnTyp) {
		return MAC_TRD_PTN_TYP.isSLS_DSCNT(trdPtnTyp) || MAC_TRD_PTN_TYP.isSLS_XTRA(trdPtnTyp);
	}
	
	/**
	 * 売上集計用リスト作成
	 * 
	 * @param hdrR
	 * @param dtlL
	 */
	protected MCList<MST_SLS_SUM_R> makeSlsSumL(MST_SLS_ACT_R hdrR, MCList<MST_SLS_ACT_D_R> dtlL) {
		MCList<MST_SLS_SUM_R> tmpSlsSumL = MCList.create(MST_SLS_SUM_R.class);
		
		MCNumber amtMk = MCNumber.ONE;
		MCNumber qtyMk = MCNumber.ONE;
		
		// 売上値引、売上返品の場合、金額項目はマイナス
		if (MAC_TRD_PTN_TYP.isSLS_DSCNT(hdrR.trd_ptn_typ()) ||
			MAC_TRD_PTN_TYP.isSLS_RTN(hdrR.trd_ptn_typ())) {
			amtMk = MCNumber.ONE.negate();
			// 売上返品の場合、数量項目もマイナス
			if (MAC_TRD_PTN_TYP.isSLS_RTN(hdrR.trd_ptn_typ())) {
				qtyMk = MCNumber.ONE.negate();
			}
		}
		
		for (MST_SLS_ACT_D_R dtlR : dtlL) {
			MST_SLS_SUM_R tmpSlsSumR = MST_SLS_SUM_R.create();
			
			// 負担部門が指定されている場合は売上集計対象外とする
			if (!isNull(dtlR.bd_dpt_cd())) {
				continue;
			}
			
			tmpSlsSumR.ym(hdrR.ac_ym());
			tmpSlsSumR.sls_dpt_cd(hdrR.sls_dpt_cd());
			tmpSlsSumR.sls_usr_cd(hdrR.sls_usr_cd());
			tmpSlsSumR.cst_cd(hdrR.cst_cd());
			tmpSlsSumR.itm_cd(dtlR.itm_cd());
			tmpSlsSumR.itm_sub1(dtlR.itm_sub1());
			tmpSlsSumR.itm_sub2(dtlR.itm_sub2());
			tmpSlsSumR.itm_sub3(dtlR.itm_sub3());
			tmpSlsSumR.cur_cd(hdrR.trd_cur_cd());
			tmpSlsSumR.wrk_no(dtlR.wrk_no());
			
			// 売上値引・売上値増の場合、数量項目はゼロとする
			if (isSlsDscntXtra(hdrR.trd_ptn_typ())) {
				tmpSlsSumR.base_unit_sls_qty(MCNumber.ZERO);
			}
			else {
				tmpSlsSumR.base_unit_sls_qty(dtlR.base_unit_qty().multiply(qtyMk));
			}
			
			tmpSlsSumR.trd_cur_sls_amt(dtlR.trd_cur_amt().multiply(amtMk));
			tmpSlsSumR.base_cur_sls_amt(dtlR.base_cur_amt().multiply(amtMk));
			tmpSlsSumR.cost_amt(
					MSUCL_SlsUtil.getCostAmt(
						dtlR.cost_upri(),
						dtlR.base_unit_qty(),
						getBaseCur().amt_dec_place()));
			
			if (isNull(tmpSlsSumR.base_unit_sls_qty())) {
				tmpSlsSumR.base_unit_sls_qty(MCNumber.ZERO);
			}
			if (isNull(tmpSlsSumR.trd_cur_sls_amt())) {
				tmpSlsSumR.trd_cur_sls_amt(MCNumber.ZERO);
			}
			if (isNull(tmpSlsSumR.base_cur_sls_amt())) {
				tmpSlsSumR.base_cur_sls_amt(MCNumber.ZERO);
			}
			if (isNull(tmpSlsSumR.cost_amt())) {
				tmpSlsSumR.cost_amt(MCNumber.ZERO);
			}
			
			tmpSlsSumR.cost_amt(tmpSlsSumR.cost_amt().multiply(qtyMk));
			
			// 売上値引・売上値増値ではなく、値引品目の場合マイナス
			if (isDscntItmFlg(dtlR) && !isSlsDscntXtra(hdrR.trd_ptn_typ())) {
				tmpSlsSumR.trd_cur_sls_amt(tmpSlsSumR.trd_cur_sls_amt().negate());
				tmpSlsSumR.base_cur_sls_amt(tmpSlsSumR.base_cur_sls_amt().negate());
			}
			
			tmpSlsSumL.add(tmpSlsSumR);
		}
		return tmpSlsSumL;
	}
	
	protected boolean isDscntItmFlg(MST_SLS_ACT_D_R dtlR) {
		MAM_ITM_R itmR = getItmCache(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
		if (!isNull(itmR)) {
			return itmR.dscnt_itm_flg();
		}
		return false;
	}
	
	/**
	 * 売上集計更新
	 * 
	 * @param slsSumL
	 */
	protected void updSlsSum(MCList<MST_SLS_SUM_R> slsSumL) {
		if (slsSumL.size() == 0) {
			return;
		}
		MCGroupByPolicy gp = new MCGroupByPolicy(getGroupByCols(slsSumL));
		gp.sum(getSumCols());
		MCList<MST_SLS_SUM_R> list = slsSumL.groupBy(gp);
		
		list.sort(list.createRow().getKeyColumn());
		
		MCList<MST_SLS_SUM_R> exeL = MCList.create(MST_SLS_SUM_R.class);
		MST_SLS_SUM_R exeL_t = MST_SLS_SUM_R.create("T");
		MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(exeL_t);
		exeL_bldr.removeSet("base_unit_sls_qty");
		exeL_bldr.addSetVL(exeL_t.base_unit_sls_qty, exeL_t.base_unit_sls_qty.add(bindEx("base_unit_sls_qty")));
		exeL_bldr.removeSet("trd_cur_sls_amt");
		exeL_bldr.addSetVL(exeL_t.trd_cur_sls_amt, exeL_t.trd_cur_sls_amt.add(bindEx("trd_cur_sls_amt")));
		exeL_bldr.removeSet("base_cur_sls_amt");
		exeL_bldr.addSetVL(exeL_t.base_cur_sls_amt, exeL_t.base_cur_sls_amt.add(bindEx("base_cur_sls_amt")));
		exeL_bldr.removeSet("cost_amt");
		exeL_bldr.addSetVL(exeL_t.cost_amt, exeL_t.cost_amt.add(bindEx("cost_amt")));
		exeL_bldr.setOrderByAsc(exeL_bldr.getBaseDbc().getKeyColumn$());
		
		int cnt = 0;
		try {
			for (int i = 0; i < list.size(); i++) {
				MST_SLS_SUM_R r = list.get(i);
				exeL.add(r);
				cnt++;
				if (_loopcnt <= cnt) {
					dbLockUpdInsNoCheck("MSBBL6010_MST_SLS_SUM_U01", exeL, exeL_bldr);
					exeL.clear();
					cnt = 0;
				}
			}
			if (0 < exeL.size()) {
				dbLockUpdInsNoCheck("MSBBL6010_MST_SLS_SUM_U02", exeL, exeL_bldr);
			}
		}
		catch (MCException ex) {
			if (isDupValOnIndex(ex)) {
				throw new MCAppException(MSBBL0284);
			}
			else {
				throw ex;
			}
		}
	}
	
	/**
	 * 売上集計用リストの合計を求めるカラム設定を取得
	 * 
	 * @return
	 */
	protected String[] getSumCols() {
		
		return new String[] {
				MST_SLS_SUM_R.$base_unit_sls_qty,
				MST_SLS_SUM_R.$trd_cur_sls_amt,
				MST_SLS_SUM_R.$base_cur_sls_amt,
				MST_SLS_SUM_R.$cost_amt
		};
	}
	
	/**
	 * 売上集計用リストのグループ化項目を取得
	 * 
	 * @param slsSumL
	 * @return
	 */
	protected String[] getGroupByCols(MCList<MST_SLS_SUM_R> slsSumL) {
		return slsSumL.createRow().getKeyColumn();
	}
	
	/**
	 * 取引マスタキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_TRD_R> _trdCache;

	/**
	 * GALinkに送信する
	 */
	protected void callGALinkCmn(MCList<MST_SLS_ACT_R> hdrL) {
		if (!isCallGALink()) {
			return;
		}
		
		MCList<MST_SLS_ACT_R> sendL = hdrL.shallowClone();
		MCList<MST_SLS_ACT_R> updL = hdrL.subList(
			r -> MAC_DATA_CRUD_TYP.isUPD(r.getStringNE("data_crud_typ")));
		if (!updL.isEmpty()) {
			sendL.merge(
				// インボイス取引の場合、売上伝票に複数の売上実績が含まれるので、引数に存在しない分を取得する
				// インボイスに対応する売上実績がすべて揃わないことがあるのは更新の場合のみ（売上明細訂正とか）
				getSlsActIvLForGALink(updL.subList(r -> !isNullOrNullVal(r.iv_no()))),
				MST_SLS_ACT_R.$sls_act_no, MST_SLS_ACT_R.$sls_act_seq
			);
		}
		
		if (_trdCache == null) {
			_trdCache = new FXUCL_MCDbcCache<MAM_TRD_R>(
				MCQueryApiBuilder.create(MAM_TRD_R.create("T")), sendL, MST_SLS_ACT_R.$trd_cd
			);
		}
		MSBBL_SlsSlipSendIfService.SlsSlipSendIf_Upd01 o = MSBBL_SlsSlipSendIfService.crtSlsSlipSendIf_Upd01();
		for (MST_SLS_ACT_R sendR : sendL) {
			MAM_TRD_R trdR = _trdCache.get(sendR.trd_cd());
			if (!trdR.not_sls_slip_snd_flg()) {
				SlsSlipSendIf_Upd01_DtlR r = o.up0().add();
				r.sls_act_no(sendR.sls_act_no());
				r.sls_act_seq(sendR.sls_act_seq());
				r.data_crud_typ(nvl(sendR.getStringNE("data_crud_typ"), MAC_DATA_CRUD_TYP.UPD.value()));
				r.setAttributes(sendR);
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}
	protected boolean isCallGALink() {
		String parm = getSysParmNE("GA_SLS_SLIP_EXT_SYS_CD");
		if (!isNull(parm)) {
			MAM_EXT_SYS_R m1 = MAM_EXT_SYS_R.create("M1");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(m1);
			bldr.setSelect(m1.ext_sys_cd);
			bldr.setWhere(m1.ext_sys_cd.eq(bind("1")), parm);
			bldr.addWhereWithAnd(m1.ext_sys_typ.eq(value(MAC_EXT_SYS_TYP.AC.value())));
			bldr.addWhereWithAnd(m1.web_api_flg.eq(value(true)));
			
			MCRow rslt = MCRow.create();
			dbSelect("MSBBL6010_MAM_EXT_SYS_S01", rslt, bldr);
			return !isNull(rslt.getStringNE(MAM_EXT_SYS_R.$ext_sys_cd));
		}
		return false;
	}
	protected MCList<MST_SLS_ACT_R> getSlsActIvLForGALink(MCList<MST_SLS_ACT_R> ivL) {
		MCList<MST_SLS_ACT_R> saL = MCList.create(MST_SLS_ACT_R.class);
		if (!ivL.isEmpty()) {
			MST_SLS_ACT_R t = MST_SLS_ACT_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.sls_act_no, t.sls_act_seq, t.trd_cd);
			bldr.setWhere(t.iv_no.eq(bind("iv_no")));
			bldr.addConstWhereWithAnd(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbSelect("MSBBL6010_MST_SLS_ACT_S05", saL, bldr, ivL.groupBy(MST_SLS_ACT_R.$iv_no));
		}
		return saL;
	}

	//FMCB CUSTOM END
}