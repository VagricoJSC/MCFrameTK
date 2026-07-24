package mcframe.serverMSBC.MSBCL6000;

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
import mcframe.serverMSBC.MSBCL6000.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSBF.MSBFL5010.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSBC.MSBCL6100.*;
import mcframe.serverMSBC.MSBCL6010.*;
import mcframe.serverMSBC.MSBCL6020.*;
import mcframe.serverMSBC.MSBCL6090.*;
import mcframe.serverMSBC.MSBCL6110.*;
import mcframe.serverMSBC.MSBCL6140.*;
import mcframe.serverMSBD.MSBDL5090.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBE.MSBEL5200.*;
import mcframe.serverMSBE.MSBEL5900.*;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMAUC.MAUCL5010.*;
import mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil;
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_PositiveValidater;
import static mcframe.serverCore.requester.MCRequestObject.*;
import java.util.*;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverMSBF.MSBFL5220.LotInh_Upd02_Cnd01R;
import mcframe.serverMSBF.MSBFL5220.MSBFL_LotInhService;
import mcframe.serverMSLA.MSLAL6210.*;
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_MfgInstRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_MfgInstRegService_MC extends MSBCL_MfgInstRegService_MC_A{
	//FMCB CUSTOM START
	
	// ------ 工数管理マスタ　キャッシュ
	protected FXUCL_MCDbcCache<MAM_WK_COST_R> _wkCostCache;
	protected static void initWkCostCache() {
		object(CLAZZ)._wkCostCache();
	}
	protected void _wkCostCache() {
		_wkCostCache = null;
		_wkCostCache = new FXUCL_MCDbcCache<MAM_WK_COST_R>(MCQueryApiBuilder.create(MAM_WK_COST_R.create("T")));
	}
	protected static MAM_WK_COST_R getWkCost(String wk_cost_cd) {
		return object(CLAZZ)._getWkCost(wk_cost_cd);
	}
	protected MAM_WK_COST_R _getWkCost(String wk_cost_cd) {
		return _wkCostCache.get(wk_cost_cd);
	}
	
	/**
	 * MfgInstReg_Upd01オペレーション.<p>
	 *
	 * 製造指図の登録・訂正の共通処理<br>
	 */
	public class MfgInstReg_Upd01 extends MSBCL_MfgInstRegService_MC_A.MfgInstReg_Upd01 {
		/**
		 * 明細からヘッダデータにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MfgInstReg_Upd01_HdrR> _hdrCache;
		
		/**
		 * 明細から工程データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MfgInstReg_Upd01_DtlOperR> _operCache;
		
		/**
		 * ヘッダから工程データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MfgInstReg_Upd01_DtlOperR>> _operCacheForHdr;
		
		/**
		 * ヘッダから出来高データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MfgInstReg_Upd01_DtlYieldR>> _yieldCacheForHdr;

		/**
		 * 製造実績登録ですでに打切された製造指図ＮＯを保持するセット
		 */
		protected Set<String> _abortMfgInstNo;
		
		protected MCList<MST_OPER_INST_SEND_IF_R> _operSendIfL;
		protected MCIndexKey _operSendIfIdx;
		protected MCList<MST_YIELD_SCHD_SND_IF_R> _yieldSchdSendIfL;
		protected MCIndexKey _yieldSchdSendIfIdx;
		protected MCList<MST_INPT_SCHD_SEND_IF_R> _inptSchdSendIfL;
		protected MCIndexKey _inptSchdSendIfIdx;
		protected MCList<MST_WK_SCHD_SEND_IF_R> _wkSchdSendIfL;
		protected MCIndexKey _wkSchdSendIfIdx;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			setCache();
			
			doMasterCache();
			
			chkAbortMfgInst();
			
			getMfgInstSendIfData();
			
			// 上り電文の編集
			editUp();
			
			// 「未確定」または「保存」の品目オーダを製造指図した場合、品目オーダを確定する
			callOrdUpd02ToFix();
			// 品目オーダ更新
			callItmOrdUpdSrv();
			
			// 製造指図送信ＩＦサービスの呼び出し（「初回製造指図以外の取消」）
			// 各種指図・予定テーブル更新前に実行する
			callMfgInstSendIf(true);
			
			// 各種指図・予定テーブル更新
			callTblRegSrv();
			// 外注時の発注予定更新
			callPoSchdRegSrv();
			
			// 外注時の入荷予定更新
			callArrSchdRegSrv();
			
			
			// 着手後の残テーブル更新
			callInstComRegSrv();
			
			// 再展開履歴の更新
			callHstExtUpd();
			
			// 子品目期限・起算日引継ぎ
			callMainLotInf();
			
			// 仕掛更新処理
			callWipUpdService();
			
			// 投入版切替更新サービスの呼び出し
			callVerChgSrv();
			
			// ロットの製造承認状況区分の更新サービスの実行
			callLotAprvStsUpdSrv();
			
			// 受注状況更新サービスの呼び出し
			callSloStsInsSrv();
			
			// 品目オーダ・工程オーダ状況更新サービスの呼び出し
			callOrdStsUpdSrv();
			
			// 製造指図時に「未確定」または「保存」であった品目オーダの製造指図を取り消す場合、品目オーダを元のステータスに戻す
			callOrdUpd02FromFix();
			// 帳票即時発行
			callPrntSrv();

			// 指図承認依頼のプッシュ通知
			callPushNtc();
			
			// 製造指図送信ＩＦサービスの呼び出し（「初回製造指図以外の取消」以外）
			callMfgInstSendIf(false);
			setDown();
		}
		
		protected void setCache() {
			_hdrCache = new FXUCL_Cache<MfgInstReg_Upd01_HdrR>();
			_hdrCache.setFixMaxCacheSize(-1);
			_operCache = new FXUCL_Cache<MfgInstReg_Upd01_DtlOperR>();
			_operCache.setFixMaxCacheSize(-1);
			_operCacheForHdr = new FXUCL_Cache<MCList<MfgInstReg_Upd01_DtlOperR>>();
			_operCacheForHdr.setFixMaxCacheSize(-1);
			_yieldCacheForHdr = new FXUCL_Cache<MCList<MfgInstReg_Upd01_DtlYieldR>>();
			_yieldCacheForHdr.setFixMaxCacheSize(-1);
			
			for (MfgInstReg_Upd01_HdrR hdrR : up0()) {
				_hdrCache.putCache(new MCNumber[]{hdrR.peg_no()}, hdrR);
			}
			
			for (MfgInstReg_Upd01_DtlOperR operR : up1()) {
				_operCache.putCache(new MCNumber[]{operR.peg_no()}, operR);
			}
			
			MCIndexKey operKey = up1().createIndex(MfgInstReg_Upd01_DtlOperR.$hdr_peg_no);
			MCIndexKey yieldKey = up4().createIndex(MfgInstReg_Upd01_DtlYieldR.$hdr_peg_no);
			for (MfgInstReg_Upd01_HdrR hdrR : up0()) {
				MCNumber[] cacheKey = new MCNumber[]{hdrR.peg_no()};
				_hdrCache.putCache(cacheKey, hdrR);
				
				_operCacheForHdr.putCache(cacheKey, up1().subList(operKey, hdrR.peg_no()));
				_yieldCacheForHdr.putCache(cacheKey, up4().subList(yieldKey, hdrR.peg_no()));
			}
		}
		
		protected FXUCL_MCDbcCache<MAM_ITM_SITE_R> _itmSite;
		
		protected void doMasterCache() {
			MAM_ITM_SITE_R t = MAM_ITM_SITE_R.create("T");
			MCQueryApiBuilder itmSiteL_bldr = MCQueryApiBuilder.create(t);
			itmSiteL_bldr.setSelect(t.mfg_aprv_flg, t.mfg_aprv_role_cd);
			_itmSite = new FXUCL_MCDbcCache<MAM_ITM_SITE_R>(itmSiteL_bldr, up0(),
					MfgInstReg_Upd01_HdrR.$itm_cd, MfgInstReg_Upd01_HdrR.$itm_sub1,
					MfgInstReg_Upd01_HdrR.$itm_sub2, MfgInstReg_Upd01_HdrR.$itm_sub3,
					MfgInstReg_Upd01_HdrR.$mfg_loc_site_cd);
		}
		
		protected void chkAbortMfgInst() {
			_abortMfgInstNo = new HashSet<String>();

			// 着手中の製造指図に対して製造実績残を参照し、打切済かどうか判断する
			MCList<MfgInstReg_Upd01_HdrR> sttL = up0().subList(
					MfgInstReg_Upd01_HdrR.$mfg_sts_typ, MSC_MFG_STS_TYP.STT.value());

			if (sttL.isEmpty()) {
				return;
			}
			
			MCList<MSVT_MFG_INST_PR_R> mfgInstPrL = MCList.create(MSVT_MFG_INST_PR_R.class);
			MSVT_MFG_INST_PR_R t = MSVT_MFG_INST_PR_R.create("T");
			MCQueryApiBuilder mfgInstPrL_bldr = MCQueryApiBuilder.create(t);
			mfgInstPrL_bldr.setSelect(t.mfg_inst_no, t.base_unit_mfg_abort_qty);
			dbSelectKey("MSBCL6000_MSVT_MFG_INST_PR_S01", mfgInstPrL, mfgInstPrL_bldr, sttL);

			// 基準単位製造打切数量＞０の場合は製造指図ＮＯをハッシュセットに追加
			for (MSVT_MFG_INST_PR_R r : mfgInstPrL) {
				if (r.base_unit_mfg_abort_qty().isPositive()) {
					_abortMfgInstNo.add(r.mfg_inst_no());
				}
			}
		}
		
		protected void getMfgInstSendIfData() {
			MCList<MfgInstReg_Upd01_DtlOperR> tgt = up1().subList(MfgInstReg_Upd01_DtlOperR.$mes_flg, true);
			if (isNull(tgt)) return;
			
			// 工程指図送信ＩＦ取得
			_operSendIfL = MCList.create(MST_OPER_INST_SEND_IF_R.class);
			
			MCList<MST_OPER_INST_R> operInstNoL = MCList.create(MST_OPER_INST_R.class);
			tgt.forEach(r -> operInstNoL.add().oper_inst_no(r.oper_inst_no()));
			MCQueryApiBuilder oper_bldr = MCQueryApiBuilder.create(MST_OPER_INST_R.create("OPER"));
			dbWkDelete("MSBCL6000_MSW_OPER_INST_D01", oper_bldr.getBaseDbc());
			dbWkInsert("MSBCL6000_MSW_OPER_INST_I01", operInstNoL, oper_bldr.getBaseDbc());
			
			MST_OPER_INST_SEND_IF_R sendIf = MST_OPER_INST_SEND_IF_R.create("SEND_IF");
			MCQueryApiBuilder operSendIfL_bldr = MCQueryApiBuilder.create(sendIf);
			MSW_OPER_INST_KEY_R key = MSW_OPER_INST_KEY_R.create("KEY");
			MST_OPER_INST_SEND_IF_R sendIfV1 = MST_OPER_INST_SEND_IF_R.create("SEND_IF_V1");
			operSendIfL_bldr.addInnerJoin(key, bracket(sendIf.oper_inst_no.eq(key.oper_inst_no)));
			operSendIfL_bldr.addWhereWithAnd(
					sendIf.data_lno.eq(subQuery().select(max(sendIfV1.data_lno).as("data_lno"))
							.from(sendIfV1).where(sendIfV1.oper_inst_no.eq(key.oper_inst_no))));
			dbSelect("MSBCL6000_MST_OPER_INST_SEND_IF_S01", _operSendIfL, operSendIfL_bldr);
			_operSendIfIdx = _operSendIfL.createIndex(MST_OPER_INST_SEND_IF_R.$oper_inst_no);
			
			// 出来高送信ＩＦ取得
			_yieldSchdSendIfL = MCList.create(MST_YIELD_SCHD_SND_IF_R.class);
			MST_YIELD_SCHD_SND_IF_R yieldSendIf = MST_YIELD_SCHD_SND_IF_R.create("SEND_IF");
			MCQueryApiBuilder yieldSendIfL_bldr = MCQueryApiBuilder.create(yieldSendIf);
			yieldSendIfL_bldr.addInnerJoin(key, bracket(yieldSendIf.oper_inst_no.eq(key.oper_inst_no)));
			yieldSendIfL_bldr.addWhereWithAnd(
					yieldSendIf.data_lno.eq(subQuery().select(max(yieldSendIf.data_lno).as("data_lno"))
							.from(yieldSendIf).where(yieldSendIf.oper_inst_no.eq(key.oper_inst_no))));
			
			dbSelect("MSBCL6000_MST_YIELD_SCHD_SND_IF_S01", _yieldSchdSendIfL, yieldSendIfL_bldr);
			_yieldSchdSendIfIdx = _yieldSchdSendIfL.createIndex(MST_YIELD_SCHD_SND_IF_R.$oper_inst_no);
			
			// 投入予定送信ＩＦ取得
			_inptSchdSendIfL = MCList.create(MST_INPT_SCHD_SEND_IF_R.class);
			MST_INPT_SCHD_SEND_IF_R inptSendIf = MST_INPT_SCHD_SEND_IF_R.create("SEND_IF");
			MCQueryApiBuilder inptSendIfL_bldr = MCQueryApiBuilder.create(inptSendIf);
			inptSendIfL_bldr.addInnerJoin(key, bracket(inptSendIf.oper_inst_no.eq(key.oper_inst_no)));
			inptSendIfL_bldr.addWhereWithAnd(
					inptSendIf.data_lno.eq(subQuery().select(max(inptSendIf.data_lno).as("data_lno"))
							.from(inptSendIf).where(inptSendIf.oper_inst_no.eq(key.oper_inst_no))));
			
			dbSelect("MSBCL6000_MST_INPT_SCHD_SEND_IF_S01", _inptSchdSendIfL, inptSendIfL_bldr);
			_inptSchdSendIfIdx = _inptSchdSendIfL.createIndex(MST_INPT_SCHD_SEND_IF_R.$oper_inst_no);
			
			// 工数予定送信ＩＦ取得
			_wkSchdSendIfL = MCList.create(MST_WK_SCHD_SEND_IF_R.class);
			MST_WK_SCHD_SEND_IF_R wkSendIf = MST_WK_SCHD_SEND_IF_R.create("SEND_IF");
			MCQueryApiBuilder wkSendIfL_bldr = MCQueryApiBuilder.create(wkSendIf);
			wkSendIfL_bldr.addInnerJoin(key, bracket(wkSendIf.oper_inst_no.eq(key.oper_inst_no)));
			wkSendIfL_bldr.addWhereWithAnd(
					wkSendIf.data_lno.eq(subQuery().select(max(wkSendIf.data_lno).as("data_lno"))
							.from(wkSendIf).where(wkSendIf.oper_inst_no.eq(key.oper_inst_no))));
			
			dbSelect("MSBCL6000_MST_WK_SCHD_SEND_IF_S01", _wkSchdSendIfL, wkSendIfL_bldr);
			_wkSchdSendIfIdx = _wkSchdSendIfL.createIndex(MST_WK_SCHD_SEND_IF_R.$oper_inst_no);
			
			dbWkDelete("MSBCL6000_MSW_OPER_INST_D02", oper_bldr.getBaseDbc());
		}
		
		protected void editUp() {
			// ＮＯの発番
			setNo();
			
			// その他の設定
			editUpSub();
		}
		
		protected void setNo() {
			// 製造指図ＮＯの発番
			setMfgInstNo();
			
			// 品目製造指図ＮＯの発番
			setItmMfgInstNo();
			
			// 工程指図ＮＯの発番
			setOperInstNo();
			// 工程単位製造指図の一括登録で初回製造指図以外の品目製造指図ＮＯ、初回製造指図ＮＯの設定
			setNotFrstInstNo();
		}
		
		protected void setMfgInstNo() {
			MCList<MfgInstReg_Upd01_HdrR> mfgInstNoL = up0().subList(
					MfgInstReg_Upd01_HdrR.$mfg_inst_data_crud_typ,
					MAC_DATA_CRUD_TYP.CRT.value());
			if (!mfgInstNoL.isEmpty()) {
				MCList<ElmArgsR> args = MCList.create(ElmArgsR.class);
				for (MfgInstReg_Upd01_HdrR hdrR : mfgInstNoL) {
					ElmArgsR arg = ElmArgsR.create();
					arg.peg_no(hdrR.peg_no());
					arg.itm_cd(hdrR.itm_cd());
					arg.itm_sub1(hdrR.itm_sub1());
					arg.itm_sub2(hdrR.itm_sub2());
					arg.itm_sub3(hdrR.itm_sub3());
					arg.loc_cd(hdrR.mfg_loc_cd());
					arg.wg_cd(hdrR.mfg_loc_wg_cd());
					arg.site_cd(hdrR.mfg_loc_site_cd());
					arg.dt(nvl(hdrR.inst_dt(), getToday()));
					arg.co_cd(getCo().co_cd());
					args.add(arg);
					
					// 改訂番号の設定
					hdrR.mfg_inst_rev(MCNumber.ONE);
				}
				setNum(MAC_NUM_BIZ_TYP.MFGINST, args);
				String[] srcCols = new String[]{ElmArgsR.$new_no};
				String[] destCols = new String[]{MfgInstReg_Upd01_HdrR.$mfg_inst_no};
				copyByPegNo(up0(), destCols, args, srcCols);
			}
		}
		
		protected void setItmMfgInstNo() {
			MCList<MfgInstReg_Upd01_HdrR> itmMfgInstNoL = up0().subList(
					MfgInstReg_Upd01_HdrR.$itm_mfg_inst_data_crud_typ,
					MAC_DATA_CRUD_TYP.CRT.value());
			if (!itmMfgInstNoL.isEmpty()) {
				MCList<ElmArgsR> args = MCList.create(ElmArgsR.class);
				for (MfgInstReg_Upd01_HdrR hdrR : itmMfgInstNoL) {
					ElmArgsR arg = ElmArgsR.create();
					arg.peg_no(hdrR.peg_no());
					arg.itm_cd(hdrR.itm_cd());
					arg.itm_sub1(hdrR.itm_sub1());
					arg.itm_sub2(hdrR.itm_sub2());
					arg.itm_sub3(hdrR.itm_sub3());
					arg.loc_cd(hdrR.mfg_loc_cd());
					arg.wg_cd(hdrR.mfg_loc_wg_cd());
					arg.site_cd(hdrR.mfg_loc_site_cd());
					arg.dt(nvl(hdrR.inst_dt(), getToday()));
					arg.co_cd(getCo().co_cd());
					args.add(arg);
				}
				setNum(MAC_NUM_BIZ_TYP.ITMINST, args);
				String[] srcCols = new String[]{ElmArgsR.$new_no};
				String[] destCols = new String[]{MfgInstReg_Upd01_HdrR.$itm_mfg_inst_no};
				copyByPegNo(up0(), destCols, args, srcCols);
			}
		}
		
		protected void setOperInstNo() {
			MCList<MfgInstReg_Upd01_DtlOperR> operInstNoL = up1().subList(
					MfgInstReg_Upd01_DtlOperR.$data_crud_typ,
					MAC_DATA_CRUD_TYP.CRT.value());
			if (!operInstNoL.isEmpty()) {
				doSeqCache(MSC_NUM_SYS_TYP.OPRINST, operInstNoL.size());
				for (MfgInstReg_Upd01_DtlOperR operR : operInstNoL) {
					operR.oper_inst_no(getStrSeq(MSC_NUM_SYS_TYP.OPRINST));
				}
			}
		}
		
		protected void setNotFrstInstNo() {
			// 初回製造指図以外の登録（工程単位）がオンのレコードのみを抽出
			MCList<MfgInstReg_Upd01_HdrR> notFrstInstOperL = up0()
					.subList(MfgInstReg_Upd01_HdrR.$not_frst_inst_reg_oper_flg, true);

			if (notFrstInstOperL.isEmpty()) {
				return;
			}

			MCIndexKey idx = up0().createIndex(MfgInstReg_Upd01_HdrR.$itm_ord_no,
					MfgInstReg_Upd01_HdrR.$itm_mfg_inst_data_crud_typ);
			
			// 同一の品目オーダを持つ初回製造指図のレコードを抽出する
			for (MfgInstReg_Upd01_HdrR r : notFrstInstOperL) {
				// 品目オーダが同一かつ品目製造指図データ更新区分が新規
				MfgInstReg_Upd01_HdrR frstR = up0().getFirst(idx, r.itm_ord_no(),
						MAC_DATA_CRUD_TYP.CRT.value());
				
				// 品目製造指図ＮＯ、初回製造指図ＮＯを設定
				r.itm_mfg_inst_no(frstR.itm_mfg_inst_no());
				r.frst_mfg_inst_no(frstR.mfg_inst_no());
			}
		}

		protected void editUpSub() {
			// ヘッダ
			for (MfgInstReg_Upd01_HdrR hdrR : up0()) {
				if (MAC_DATA_CRUD_TYP.isCRT(hdrR.itm_mfg_inst_data_crud_typ())) {
					hdrR.frst_mfg_inst_no(hdrR.mfg_inst_no());
					
					if (!isNull(hdrR.po_schd_data_crud_typ()) && isNull(hdrR.po_schd_src_no())) {
						hdrR.po_schd_src_no(hdrR.mfg_inst_no());
					}
				}
				if (isSame(getSysParm("MFG_APRV_ENABLE_FLG"),"1")) {
					MAM_ITM_SITE_R itmSiteR = _itmSite.get(hdrR.itm_cd(), hdrR.itm_sub1(),
							hdrR.itm_sub2(), hdrR.itm_sub3(), hdrR.mfg_loc_site_cd());
					if (itmSiteR.mfg_aprv_flg() && !hdrR.no_mfg_aprv_flg()
							&& !MAC_DATA_CRUD_TYP.isDEL(hdrR.mfg_inst_data_crud_typ())
							&& !hdrR.inst_abort_flg()
							&& !MSC_MFG_STS_TYP.isSTT(hdrR.mfg_sts_typ())) {
						hdrR.aprv_flg(true);
						hdrR.mfg_aprv_role_cd(itmSiteR.mfg_aprv_role_cd());
						hdrR.mfg_aprv_sts_typ(MSC_MFG_APRV_STS_TYP.INST_OPN.value());
					}
					else {
						clearAprvVal(hdrR);
					}
				}
			}
			
			// 工程
			for (MfgInstReg_Upd01_DtlOperR operR : up1()) {
				MfgInstReg_Upd01_HdrR hdrR = _hdrCache.getCache(operR.hdr_peg_no());
				operR.mfg_mtd_typ(hdrR.mfg_mtd_typ());
				operR.itm_mfg_inst_no(hdrR.itm_mfg_inst_no());
				operR.hdr_mfg_sts_typ(hdrR.mfg_sts_typ());
				operR.mfg_inst_unit_typ(hdrR.mfg_inst_unit_typ());
				if ((hdrR.inst_abort_flg() && hdrR.old_inst_abort_flg()) ||
					(!hdrR.inst_abort_flg() && !hdrR.old_inst_abort_flg())) {
					operR.not_header_inst_abort_flg(true);
				}
				if (MSC_MFG_STS_TYP.isYET(operR.mfg_sts_typ())) {
					operR.mfg_inst_no(null);
				}
				else {
					operR.mfg_inst_no(hdrR.mfg_inst_no());
				}
			}
			
			// 投入
			for (MfgInstReg_Upd01_DtlInptR inptR : up2()) {
				MfgInstReg_Upd01_DtlOperR operR = _operCache
						.getCache(inptR.oper_peg_no());
				inptR.itm_mfg_inst_no(operR.itm_mfg_inst_no());
				inptR.mfg_inst_no(operR.mfg_inst_no());
				inptR.oper_inst_no(operR.oper_inst_no());
				
				MfgInstReg_Upd01_HdrR hdrR = _hdrCache.getCache(inptR.hdr_peg_no());
				inptR.mfg_mtd_typ(hdrR.mfg_mtd_typ());
				inptR.itm_ord_no(hdrR.itm_ord_no());
				inptR.mfg_inst_unit_typ(hdrR.mfg_inst_unit_typ());
				inptR.hdr_mfg_sts_typ(hdrR.mfg_sts_typ());
				inptR.is_src_outsrc_srv_flg(hdrR.is_src_outsrc_srv_flg());
				inptR.lst_reg_flg(hdrR.lst_reg_flg());
				inptR.inst_dt(hdrR.inst_dt());
				inptR.inst_usr_cd(hdrR.inst_usr_cd());
				inptR.inst_dpt_cd(hdrR.inst_dpt_cd());
				if ((hdrR.inst_abort_flg() && hdrR.old_inst_abort_flg()) ||
					(!hdrR.inst_abort_flg() && !hdrR.old_inst_abort_flg())) {
					inptR.not_header_inst_abort_flg(true);
				}
				if (!isSame(hdrR.mfg_loc_cd(), inptR.inpt_loc_cd())) {
					inptR.set_stk_str_ln_flg(true);
				}
				inptR.is_src_batch_flg(hdrR.is_src_batch_flg());
			}
			
			// 工数
			for (MfgInstReg_Upd01_DtlWkR wkR : up3()) {
				MfgInstReg_Upd01_DtlOperR operR = _operCache.getCache(wkR.oper_peg_no());
				wkR.itm_mfg_inst_no(operR.itm_mfg_inst_no());
				wkR.mfg_inst_no(operR.mfg_inst_no());
				wkR.oper_inst_no(operR.oper_inst_no());
				MfgInstReg_Upd01_HdrR hdrR = _hdrCache.getCache(wkR.hdr_peg_no());
				wkR.mfg_mtd_typ(hdrR.mfg_mtd_typ());
				wkR.hdr_mfg_sts_typ(hdrR.mfg_sts_typ());
				wkR.mfg_inst_unit_typ(hdrR.mfg_inst_unit_typ());
				if ((hdrR.inst_abort_flg() && hdrR.old_inst_abort_flg()) ||
					(!hdrR.inst_abort_flg() && !hdrR.old_inst_abort_flg())) {
					wkR.not_header_inst_abort_flg(true);
				}
			}
			
			// 出来高
			for (MfgInstReg_Upd01_DtlYieldR yieldR : up4()) {
				MfgInstReg_Upd01_DtlOperR operR = _operCache.getCache(yieldR.oper_peg_no());
				yieldR.itm_mfg_inst_no(operR.itm_mfg_inst_no());
				yieldR.mfg_inst_no(operR.mfg_inst_no());
				yieldR.oper_inst_no(operR.oper_inst_no());
				
				MfgInstReg_Upd01_HdrR hdrR = _hdrCache.getCache(yieldR.hdr_peg_no());
				yieldR.mfg_mtd_typ(hdrR.mfg_mtd_typ());
				yieldR.itm_ord_no(hdrR.itm_ord_no());
				yieldR.mfg_inst_unit_typ(hdrR.mfg_inst_unit_typ());
				yieldR.hdr_mfg_sts_typ(hdrR.mfg_sts_typ());
				if ((hdrR.inst_abort_flg() && hdrR.old_inst_abort_flg()) ||
					(!hdrR.inst_abort_flg() && !hdrR.old_inst_abort_flg())) {
					yieldR.not_header_inst_abort_flg(true);
				}
				if (!MAC_DATA_CRUD_TYP.isDEL(yieldR.data_crud_typ())
						&& !yieldR.inst_abort_flg() && !yieldR.not_frst_inst_can_flg()) {
					yieldR.mfg_aprv_sts_typ(hdrR.mfg_aprv_sts_typ());
					yieldR.io_schd_pr_no(hdrR.io_schd_pr_no());
					yieldR.lot_no(hdrR.lot_no());
					yieldR.sublot_no(hdrR.sublot_no());
					yieldR.mfg_loc_site_cd(hdrR.mfg_loc_site_cd());
					yieldR.mfg_loc_cd(hdrR.mfg_loc_cd());
				}
			}
			
			// 副産品
			for (MfgInstReg_Upd01_DtlByProdR byProdR : up5()) {
				MfgInstReg_Upd01_DtlOperR operR = _operCache.getCache(byProdR.oper_peg_no());
				byProdR.itm_mfg_inst_no(operR.itm_mfg_inst_no());
				byProdR.mfg_inst_no(operR.mfg_inst_no());
				byProdR.oper_inst_no(operR.oper_inst_no());
				
				MfgInstReg_Upd01_HdrR hdrR = _hdrCache.getCache(byProdR.hdr_peg_no());
				byProdR.mfg_mtd_typ(hdrR.mfg_mtd_typ());
				byProdR.itm_ord_no(hdrR.itm_ord_no());
				byProdR.mfg_inst_unit_typ(hdrR.mfg_inst_unit_typ());
				byProdR.hdr_mfg_sts_typ(hdrR.mfg_sts_typ());
				if ((hdrR.inst_abort_flg() && hdrR.old_inst_abort_flg()) ||
					(!hdrR.inst_abort_flg() && !hdrR.old_inst_abort_flg())) {
					byProdR.not_header_inst_abort_flg(true);
				}
			}
		}
		
		protected void clearAprvVal(MfgInstReg_Upd01_HdrR hdrR) {
			hdrR.aprv_flg(false);
			hdrR.mfg_aprv_role_cd(null);
			hdrR.mfg_aprv_sts_typ(null);
			hdrR.aprv_dt(null);
			hdrR.aprv_dpt_cd(null);
			hdrR.aprv_usr_cd(null);
			hdrR.aprv_tm(null);
			hdrR.aprv_rsn(null);
		}
		
		/**
		 * 「未確定」または「保存」の品目オーダを製造指図した場合、品目オーダを確定する
		 */
		protected void callOrdUpd02ToFix() {
			MSBCL_OrdRegService.Ord_Upd02 ordUpd = MSBCL_OrdRegService.crtOrd_Upd02();
			for (MfgInstReg_Upd01_HdrR r : up0()) {
				Ord_Upd01_Dtl1R ordDtl1R = getCacheForUpd01(r.itm_ord_no());
				if (MSC_ITM_ORD_STS_TYP.isOPN(ordDtl1R.b_itm_ord_sts_typ()) || MSC_ITM_ORD_STS_TYP.isSAV(ordDtl1R.b_itm_ord_sts_typ())) {
					ordDtl1R.is_src_mfg_inst_flg(true);
					ordUpd.up0().add(ordDtl1R);
				}
			}
			
			if (!ordUpd.up0().isEmpty()) {
				ordUpd.exec();
			}
		}
		protected void callItmOrdUpdSrv() {
			MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd08 o = MSBCL_MfgInstTblRegService
					.crtMfgInstTblReg_Upd08();
			
			for (MfgInstReg_Upd01_HdrR hdrR : up0()) {
				
				// 打切（指図打切ＦＬＧがオン）または打切取消（更新前指図打切ＦＬＧがオンで指図打切ＦＬＧがオフ）の場合、オーダ情報に対して何もしない
				if (hdrR.inst_abort_flg() || (hdrR.old_inst_abort_flg() && !hdrR.inst_abort_flg())) {
					continue;
				}
				
				if (isNull(hdrR.itm_mfg_inst_data_crud_typ())) {
					// 品目製造指図のデータ更新区分がNULLの場合は何もしない（品目オーダ、工程オーダの更新はcallOrdStsUpdSrvメソッドが行っている）
					continue;
				}

				MfgInstTblReg_Upd08_Dtl1R oUp0R = MfgInstTblReg_Upd08_Dtl1R.create();
				copy(oUp0R, hdrR, createMap_MfgInstTblReg_Upd08_Dtl1R_MfgInstReg_Upd01_HdrR());
				
				o.up0().add(oUp0R);
				
				MCList<MfgInstReg_Upd01_DtlOperR> operL = _operCacheForHdr.getCache(hdrR.peg_no());
				for (MfgInstReg_Upd01_DtlOperR operR : operL) {
					if (isNull(operR.oper_ord_no())) {
						continue;
					}
					MfgInstTblReg_Upd08_Dtl2R oUp1R = MfgInstTblReg_Upd08_Dtl2R.create();
					copy(oUp1R, operR, createMap_MfgInstTblReg_Upd08_Dtl2R_MfgInstReg_Upd01_DtlOperR());
					oUp1R.itm_ord_no(hdrR.itm_ord_no());
					if (!MAC_DATA_CRUD_TYP.isDEL(hdrR.itm_mfg_inst_data_crud_typ())) {
						
						oUp1R.oper_ptn(hdrR.oper_ptn());
						oUp1R.loc_cd(hdrR.mfg_loc_cd());
						oUp1R.wg_cd(hdrR.mfg_loc_wg_cd());
					}
					o.up1().add(oUp1R);
				}				
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
				copyByPegNo(up0(), new String[] {
						MfgInstReg_Upd01_HdrR.$itm_ord_no,
						MfgInstReg_Upd01_HdrR.$io_schd_pr_no
				}, o.down0(), new String[] {
						MfgInstTblReg_Upd08_Dtl1R.$itm_ord_no,
						MfgInstTblReg_Upd08_Dtl1R.$itm_ord_no
				});

				// 投入
				for (MfgInstReg_Upd01_DtlInptR inptR : up2()) {
					MfgInstReg_Upd01_HdrR hdrR = _hdrCache.getCache(inptR.hdr_peg_no());
					inptR.itm_ord_no(hdrR.itm_ord_no());
				}
				// 出来高
				for (MfgInstReg_Upd01_DtlYieldR yieldR : up4()) {
					MfgInstReg_Upd01_HdrR hdrR = _hdrCache.getCache(yieldR.hdr_peg_no());
					yieldR.itm_ord_no(hdrR.itm_ord_no());
					yieldR.io_schd_pr_no(hdrR.io_schd_pr_no());
				}
				// 副産品
				for (MfgInstReg_Upd01_DtlByProdR byProdR : up5()) {
					MfgInstReg_Upd01_HdrR hdrR = _hdrCache.getCache(byProdR.hdr_peg_no());
					byProdR.itm_ord_no(hdrR.itm_ord_no());
				}
			}
		}
		
		protected Map_MfgInstTblReg_Upd08_Dtl1R_MfgInstReg_Upd01_HdrR<MfgInstTblReg_Upd08_Dtl1R,MfgInstReg_Upd01_HdrR> createMap_MfgInstTblReg_Upd08_Dtl1R_MfgInstReg_Upd01_HdrR() {
			return new Map_MfgInstTblReg_Upd08_Dtl1R_MfgInstReg_Upd01_HdrR<MfgInstTblReg_Upd08_Dtl1R, MfgInstReg_Upd01_HdrR>();
		}

		public class Map_MfgInstTblReg_Upd08_Dtl1R_MfgInstReg_Upd01_HdrR<D extends MfgInstTblReg_Upd08_Dtl1R, S extends MfgInstReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$peg_no, MfgInstReg_Upd01_HdrR.$peg_no);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$itm_mfg_inst_data_crud_typ, MfgInstReg_Upd01_HdrR.$itm_mfg_inst_data_crud_typ);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$mfg_mtd_typ, MfgInstReg_Upd01_HdrR.$mfg_mtd_typ);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$mfg_inst_unit_typ, MfgInstReg_Upd01_HdrR.$mfg_inst_unit_typ);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$itm_ord_no, MfgInstReg_Upd01_HdrR.$itm_ord_no);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$itm_mfg_inst_no, MfgInstReg_Upd01_HdrR.$itm_mfg_inst_no);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$itm_cd, MfgInstReg_Upd01_HdrR.$itm_cd);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$itm_sub1, MfgInstReg_Upd01_HdrR.$itm_sub1);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$itm_sub2, MfgInstReg_Upd01_HdrR.$itm_sub2);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$itm_sub3, MfgInstReg_Upd01_HdrR.$itm_sub3);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$strg_loc_cd, MfgInstReg_Upd01_HdrR.$strg_loc_cd);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$strg_str_ln_cd, MfgInstReg_Upd01_HdrR.$strg_str_ln_cd);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$mfg_loc_cd, MfgInstReg_Upd01_HdrR.$mfg_loc_cd);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$sppl_cd, MfgInstReg_Upd01_HdrR.$sppl_cd);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$maker_cd, MfgInstReg_Upd01_HdrR.$maker_cd);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$bom_ptn, MfgInstReg_Upd01_HdrR.$bom_ptn);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$oper_ptn, MfgInstReg_Upd01_HdrR.$oper_ptn);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$unit_cd, MfgInstReg_Upd01_HdrR.$base_unit_cd);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$mfg_st_schd_dt, MfgInstReg_Upd01_HdrR.$st_schd_tm);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$mfg_end_schd_dt, MfgInstReg_Upd01_HdrR.$end_schd_tm);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$master_dt, MfgInstReg_Upd01_HdrR.$master_dt);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$sno1, MfgInstReg_Upd01_HdrR.$sno1);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$sno2, MfgInstReg_Upd01_HdrR.$sno2);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$sno3, MfgInstReg_Upd01_HdrR.$sno3);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$sno4, MfgInstReg_Upd01_HdrR.$sno4);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$unschd_flg, MfgInstReg_Upd01_HdrR.$unschd_inst_flg);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl1R.$not_inst_qty, MfgInstReg_Upd01_HdrR.$base_unit_not_inst_qty);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.itm_ord_data_crud_typ(getItmOrdDataCrudTyp(src));
				// 発注済の数量を変更した場合、計画外製造指図であっても品目オーダの数量は変更しない（製造指図を分割するために数量を減らした場合の考慮）
				// ※Chkオペレーションでbase_unit_ord_qtyを設定する箇所にも、同様の分岐があるため本処理を修正する場合は、そちらの影響も確認すること
				if (!isNull(src.po_d_no())) {
					dest.inst_qty(src.base_unit_ord_qty());
					dest.yield_schd_qty(src.base_unit_ord_qty());
				}
				else {
					dest.inst_qty(src.base_unit_inst_qty());
					dest.yield_schd_qty(src.base_unit_yield_qty());
				}
			}
			
		}
		
		protected String getItmOrdDataCrudTyp(MfgInstReg_Upd01_HdrR hdrR) {
			// 計画オーダの場合、常に更新
			if (!hdrR.unschd_inst_flg()) {
				return MAC_DATA_CRUD_TYP.UPD.value();
			}
			
			// 計画外の場合
			if (MAC_DATA_CRUD_TYP.isCRT(hdrR.itm_mfg_inst_data_crud_typ())) {
				// 品目製造指図を登録する場合は、登録
				return MAC_DATA_CRUD_TYP.CRT.value();
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(hdrR.itm_mfg_inst_data_crud_typ())) {
				// 品目製造指図を削除する場合は、削除
				return MAC_DATA_CRUD_TYP.DEL.value();
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(hdrR.itm_mfg_inst_data_crud_typ())) {
				// 品目製造指図を更新する場合は、更新
				return MAC_DATA_CRUD_TYP.UPD.value();
			}
			// ここにくるのは想定外
			return null;
		}
		
		protected Map_MfgInstTblReg_Upd08_Dtl2R_MfgInstReg_Upd01_DtlOperR<MfgInstTblReg_Upd08_Dtl2R,MfgInstReg_Upd01_DtlOperR> createMap_MfgInstTblReg_Upd08_Dtl2R_MfgInstReg_Upd01_DtlOperR() {
			return new Map_MfgInstTblReg_Upd08_Dtl2R_MfgInstReg_Upd01_DtlOperR<MfgInstTblReg_Upd08_Dtl2R, MfgInstReg_Upd01_DtlOperR>();
		}

		public class Map_MfgInstTblReg_Upd08_Dtl2R_MfgInstReg_Upd01_DtlOperR<D extends MfgInstTblReg_Upd08_Dtl2R, S extends MfgInstReg_Upd01_DtlOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl2R.$hdr_peg_no, MfgInstReg_Upd01_DtlOperR.$hdr_peg_no);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl2R.$peg_no, MfgInstReg_Upd01_DtlOperR.$peg_no);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl2R.$oper_ord_no, MfgInstReg_Upd01_DtlOperR.$oper_ord_no);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl2R.$st_schd_tm, MfgInstReg_Upd01_DtlOperR.$st_schd_tm);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl2R.$end_schd_tm, MfgInstReg_Upd01_DtlOperR.$end_schd_tm);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl2R.$oper_lt, MfgInstReg_Upd01_DtlOperR.$oper_lt);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl2R.$oper_offst_typ, MfgInstReg_Upd01_DtlOperR.$oper_offst_typ);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl2R.$oper_offst, MfgInstReg_Upd01_DtlOperR.$oper_offst);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl2R.$oper_schd_qty, MfgInstReg_Upd01_DtlOperR.$base_unit_qty);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl2R.$disp_seq, MfgInstReg_Upd01_DtlOperR.$disp_seq);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl2R.$oper_cd, MfgInstReg_Upd01_DtlOperR.$oper_cd);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl2R.$oper_seq, MfgInstReg_Upd01_DtlOperR.$oper_seq);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl2R.$yield_oper_flg, MfgInstReg_Upd01_DtlOperR.$yield_oper_flg);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl2R.$intr_rmrks, MfgInstReg_Upd01_DtlOperR.$intr_rmrks);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl2R.$sub_char1, MfgInstReg_Upd01_DtlOperR.$sub_char1);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl2R.$sub_char2, MfgInstReg_Upd01_DtlOperR.$sub_char2);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl2R.$sub_char3, MfgInstReg_Upd01_DtlOperR.$sub_char3);
				addColumnPathMap(MfgInstTblReg_Upd08_Dtl2R.$not_inst_qty, MfgInstReg_Upd01_DtlOperR.$not_oper_schd_qty);

			}
		}
		protected void callLotUpdSrv() {
			MSBFL_LotService.Lot_Upd01 updOpe = MSBFL_LotService.crtLot_Upd01();
			
			for (MfgInstReg_Upd01_HdrR hdrR : up0()) {
				if (isCallLotUpdSrv(hdrR, hdrR.itm_mfg_inst_data_crud_typ(),
						hdrR.lot_no(), hdrR.sublot_no())) {
					Lot_Upd01_CndR updOpeUpR = Lot_Upd01_CndR.create();
					copy(updOpeUpR, hdrR,
							createMap_Lot_Upd01_CndR_MfgInstReg_Upd01_HdrR());
					updOpe.up0().add(updOpeUpR);
				}
			}
			
			for (MfgInstReg_Upd01_DtlByProdR byProdR : up5()) {
				MfgInstReg_Upd01_HdrR hdrR = _hdrCache.getCache(byProdR.hdr_peg_no());
				if (isCallLotUpdSrv(hdrR, byProdR.data_crud_typ(), byProdR.lot_no(),
						byProdR.sublot_no())) {
					Lot_Upd01_CndR updOpeUpR = Lot_Upd01_CndR.create();
					copy(updOpeUpR, byProdR, createMap_Lot_Upd01_CndR_MfgInstReg_Upd01_DtlByProdR());
					updOpe.up0().add(updOpeUpR);
				}
			}
			if (!updOpe.up0().isEmpty()) {
				updOpe.exec();
			}
		}
		
		protected boolean isCallLotUpdSrv(MfgInstReg_Upd01_HdrR hdrR, String dataCrudTyp, String lotNo, String sublotNo) {
			if (isNullOr(lotNo, sublotNo)) {
				return false;
			}
			if (hdrR.inst_abort_flg()) {
				return false;
			}
			if (MAC_DATA_CRUD_TYP.isCRT(dataCrudTyp) || MAC_DATA_CRUD_TYP.isUPD(dataCrudTyp)) {
				return true;
			}
			return false;
		}
		
		protected Map_Lot_Upd01_CndR_MfgInstReg_Upd01_HdrR<Lot_Upd01_CndR,MfgInstReg_Upd01_HdrR> createMap_Lot_Upd01_CndR_MfgInstReg_Upd01_HdrR() {
			return new Map_Lot_Upd01_CndR_MfgInstReg_Upd01_HdrR<Lot_Upd01_CndR, MfgInstReg_Upd01_HdrR>();
		}

		public class Map_Lot_Upd01_CndR_MfgInstReg_Upd01_HdrR<D extends Lot_Upd01_CndR, S extends MfgInstReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd01_CndR.$base_dt, MfgInstReg_Upd01_HdrR.$end_schd_tm);
				addColumnPathMap(Lot_Upd01_CndR.$itm_cd, MfgInstReg_Upd01_HdrR.$itm_cd);
				addColumnPathMap(Lot_Upd01_CndR.$itm_sub1, MfgInstReg_Upd01_HdrR.$itm_sub1);
				addColumnPathMap(Lot_Upd01_CndR.$itm_sub2, MfgInstReg_Upd01_HdrR.$itm_sub2);
				addColumnPathMap(Lot_Upd01_CndR.$itm_sub3, MfgInstReg_Upd01_HdrR.$itm_sub3);
				addColumnPathMap(Lot_Upd01_CndR.$lot_no, MfgInstReg_Upd01_HdrR.$lot_no);
				addColumnPathMap(Lot_Upd01_CndR.$sublot_no, MfgInstReg_Upd01_HdrR.$sublot_no);
				addColumnPathMap(Lot_Upd01_CndR.$mfg_loc_cd, MfgInstReg_Upd01_HdrR.$mfg_loc_cd);
				addColumnPathMap(Lot_Upd01_CndR.$loc_cd, MfgInstReg_Upd01_HdrR.$strg_loc_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.schd_flg(true);
			}
		}

		protected Map_Lot_Upd01_CndR_MfgInstReg_Upd01_DtlByProdR<Lot_Upd01_CndR,MfgInstReg_Upd01_DtlByProdR> createMap_Lot_Upd01_CndR_MfgInstReg_Upd01_DtlByProdR() {
			return new Map_Lot_Upd01_CndR_MfgInstReg_Upd01_DtlByProdR<Lot_Upd01_CndR, MfgInstReg_Upd01_DtlByProdR>();
		}

		public class Map_Lot_Upd01_CndR_MfgInstReg_Upd01_DtlByProdR<D extends Lot_Upd01_CndR, S extends MfgInstReg_Upd01_DtlByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd01_CndR.$base_dt, MfgInstReg_Upd01_DtlByProdR.$schd_tm);
				addColumnPathMap(Lot_Upd01_CndR.$itm_cd, MfgInstReg_Upd01_DtlByProdR.$itm_cd);
				addColumnPathMap(Lot_Upd01_CndR.$itm_sub1, MfgInstReg_Upd01_DtlByProdR.$itm_sub1);
				addColumnPathMap(Lot_Upd01_CndR.$itm_sub2, MfgInstReg_Upd01_DtlByProdR.$itm_sub2);
				addColumnPathMap(Lot_Upd01_CndR.$itm_sub3, MfgInstReg_Upd01_DtlByProdR.$itm_sub3);
				addColumnPathMap(Lot_Upd01_CndR.$lot_no, MfgInstReg_Upd01_DtlByProdR.$lot_no);
				addColumnPathMap(Lot_Upd01_CndR.$sublot_no, MfgInstReg_Upd01_DtlByProdR.$sublot_no);
				addColumnPathMap(Lot_Upd01_CndR.$mfg_loc_cd, MfgInstReg_Upd01_DtlByProdR.$mfg_loc_cd);
				addColumnPathMap(Lot_Upd01_CndR.$loc_cd, MfgInstReg_Upd01_DtlByProdR.$strg_loc_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.schd_flg(true);
			}
		}
		
		protected void callLotDelSrv() {
			MSBFL_LotService.Lot_Del01 delOpe = MSBFL_LotService.crtLot_Del01();
			
			for (MfgInstReg_Upd01_HdrR hdrR : up0()) {
				if (isCallLotDelSrv(hdrR, hdrR.itm_mfg_inst_data_crud_typ(),
						hdrR.lot_no(), hdrR.sublot_no(), hdrR.old_lot_no(),
						hdrR.old_sublot_no(), hdrR.not_frst_inst_can_flg())) {
					Lot_Del01_CndR delOpeUpR = Lot_Del01_CndR.create();
					copy(delOpeUpR, hdrR,
							createMap_Lot_Del01_CndR_MfgInstReg_Upd01_HdrR());
					delOpe.up0().add(delOpeUpR);
				}
			}
			
			for (MfgInstReg_Upd01_DtlByProdR byProdR : up5()) {
				MfgInstReg_Upd01_HdrR hdrR = _hdrCache.getCache(byProdR.hdr_peg_no());
				if (isCallLotDelSrv(hdrR, byProdR.data_crud_typ(), byProdR.itm_cd(),
						byProdR.itm_sub1(), byProdR.itm_sub2(), byProdR.itm_sub3(),
						byProdR.lot_no(), byProdR.sublot_no(), byProdR.old_itm_cd(),
						byProdR.old_itm_sub1(), byProdR.old_itm_sub2(),
						byProdR.old_itm_sub3(), byProdR.old_lot_no(),
						byProdR.old_sublot_no(), byProdR.not_frst_inst_can_flg())) {
					Lot_Del01_CndR delOpeUpR = Lot_Del01_CndR.create();
					copy(delOpeUpR, byProdR, createMap_Lot_Del01_CndR_MfgInstReg_Upd01_DtlByProdR());
					delOpe.up0().add(delOpeUpR);
				}
			}
			
			if (!delOpe.up0().isEmpty()) {
				delOpe.exec();
			}
		}

		protected boolean isCallLotDelSrv(MfgInstReg_Upd01_HdrR hdrR, String dataCrudTyp,
				String lotNo, String sublotNo, String oldLotNo, String oldSublotNo,
				boolean notFrstInstCanFlg) {
			return isCallLotDelSrv(hdrR, dataCrudTyp, null, null, null, null, lotNo,
					sublotNo, null, null, null, null, oldLotNo, oldSublotNo,
					notFrstInstCanFlg);
		}
		
		protected boolean isCallLotDelSrv(MfgInstReg_Upd01_HdrR hdrR, String dataCrudTyp,
				String itmCd, String itmSub1, String itmSub2, String itmSub3,
				String lotNo, String sublotNo, String oldItmCd, String oldItmSub1,
				String oldItmSub2, String oldItmSub3, String oldLotNo, String oldSublotNo,
				boolean notFrstInstCanFlg) {
			if (isNullOr(oldLotNo, oldSublotNo)) {
				return false;
			}
			if (hdrR.inst_abort_flg()) {
				return false;
			}
			if (MAC_DATA_CRUD_TYP.isDEL(dataCrudTyp)) {
				return true;
			}
			if (MAC_DATA_CRUD_TYP.isUPD(dataCrudTyp)) {
				// 更新前後の品目ＣＤ、枝番１～３がすべて設定されている場合、一致しているかどうかチェック。※出来高の場合は品目が変更不可のため、副産品のみ実行されるチェック
				if (!isNullOr(itmCd, itmSub1, itmSub2, itmSub3, oldItmCd, oldItmSub1,
						oldItmSub2, oldItmSub3)) {
					if (!isSame(itmCd, oldItmCd) || !isSame(itmSub1, oldItmSub1)
							|| !isSame(itmSub2, oldItmSub2)
							|| !isSame(itmSub3, oldItmSub3)) {
						return true;
					}
				}
				if (!isSame(lotNo, oldLotNo) || !isSame(sublotNo, oldSublotNo)) {
					return true;
				}
			}
			// not_frst_inst_can_flgがオンの場合は製造指図が取り消されるため、ロットを削除する必要がある
			if (notFrstInstCanFlg) {
				return true;
			}
			return false;
		}

		protected Map_Lot_Del01_CndR_MfgInstReg_Upd01_HdrR<Lot_Del01_CndR,MfgInstReg_Upd01_HdrR> createMap_Lot_Del01_CndR_MfgInstReg_Upd01_HdrR() {
			return new Map_Lot_Del01_CndR_MfgInstReg_Upd01_HdrR<Lot_Del01_CndR, MfgInstReg_Upd01_HdrR>();
		}

		public class Map_Lot_Del01_CndR_MfgInstReg_Upd01_HdrR<D extends Lot_Del01_CndR, S extends MfgInstReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Del01_CndR.$itm_cd, MfgInstReg_Upd01_HdrR.$itm_cd);
				addColumnPathMap(Lot_Del01_CndR.$itm_sub1, MfgInstReg_Upd01_HdrR.$itm_sub1);
				addColumnPathMap(Lot_Del01_CndR.$itm_sub2, MfgInstReg_Upd01_HdrR.$itm_sub2);
				addColumnPathMap(Lot_Del01_CndR.$itm_sub3, MfgInstReg_Upd01_HdrR.$itm_sub3);
				addColumnPathMap(Lot_Del01_CndR.$lot_no, MfgInstReg_Upd01_HdrR.$old_lot_no);
				addColumnPathMap(Lot_Del01_CndR.$sublot_no, MfgInstReg_Upd01_HdrR.$old_sublot_no);
			}
		}
		
		protected Map_Lot_Del01_CndR_MfgInstReg_Upd01_DtlByProdR<Lot_Del01_CndR,MfgInstReg_Upd01_DtlByProdR> createMap_Lot_Del01_CndR_MfgInstReg_Upd01_DtlByProdR() {
			return new Map_Lot_Del01_CndR_MfgInstReg_Upd01_DtlByProdR<Lot_Del01_CndR, MfgInstReg_Upd01_DtlByProdR>();
		}

		public class Map_Lot_Del01_CndR_MfgInstReg_Upd01_DtlByProdR<D extends Lot_Del01_CndR, S extends MfgInstReg_Upd01_DtlByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Del01_CndR.$itm_cd, MfgInstReg_Upd01_DtlByProdR.$old_itm_cd);
				addColumnPathMap(Lot_Del01_CndR.$itm_sub1, MfgInstReg_Upd01_DtlByProdR.$old_itm_sub1);
				addColumnPathMap(Lot_Del01_CndR.$itm_sub2, MfgInstReg_Upd01_DtlByProdR.$old_itm_sub2);
				addColumnPathMap(Lot_Del01_CndR.$itm_sub3, MfgInstReg_Upd01_DtlByProdR.$old_itm_sub3);
				addColumnPathMap(Lot_Del01_CndR.$lot_no, MfgInstReg_Upd01_DtlByProdR.$old_lot_no);
				addColumnPathMap(Lot_Del01_CndR.$sublot_no, MfgInstReg_Upd01_DtlByProdR.$old_sublot_no);
			}
		}
		
		/** 品目詳細 */
		FXUCL_MCDbcCacheStEnd<MAM_ITM_DTL_R> _cacheItmDtl = null;
		
		protected void getItmDtlWgCd() {
			MCList<MfgInstReg_Upd01_HdrR> up0L = up0().groupBy(MfgInstReg_Upd01_HdrR.$itm_cd, MfgInstReg_Upd01_HdrR.$itm_sub1, MfgInstReg_Upd01_HdrR.$itm_sub2, MfgInstReg_Upd01_HdrR.$itm_sub3, 
					MfgInstReg_Upd01_HdrR.$mfg_loc_cd,MfgInstReg_Upd01_HdrR.$maker_cd, MfgInstReg_Upd01_HdrR.$mfg_loc_wg_cd, MfgInstReg_Upd01_HdrR.$bom_ptn);

			MCList<MAM_ITM_DTL_R> bindL = MCList.create(MAM_ITM_DTL_R.class);
			
			for (MfgInstReg_Upd01_HdrR up0R : up0L) {
				bindL.add(createItmDtlBindR(up0R));
			}
			
			_cacheItmDtl = new FXUCL_MCDbcCacheStEnd<MAM_ITM_DTL_R>(
					MCQueryApiBuilder.create(MAM_ITM_DTL_R.create("T")),
					bindL,
					MAM_ITM_DTL_R.$itm_cd,
					MAM_ITM_DTL_R.$itm_sub1,
					MAM_ITM_DTL_R.$itm_sub2,
					MAM_ITM_DTL_R.$itm_sub3,
					MAM_ITM_DTL_R.$mfg_loc_cd,
					MAM_ITM_DTL_R.$sppl_cd,
					MAM_ITM_DTL_R.$maker_cd,
					MAM_ITM_DTL_R.$rqst_loc_cd,
					MAM_ITM_DTL_R.$wg_cd,
					MAM_ITM_DTL_R.$bom_ptn);
		}
		
		protected MAM_ITM_DTL_R createItmDtlBindR(MfgInstReg_Upd01_HdrR up0R) {
			MAM_ITM_DTL_R bindR = MAM_ITM_DTL_R.create();
			bindR.itm_cd(up0R.itm_cd());
			bindR.itm_sub1(up0R.itm_sub1());
			bindR.itm_sub2(up0R.itm_sub2());
			bindR.itm_sub3(up0R.itm_sub3());
			bindR.mfg_loc_cd(up0R.mfg_loc_cd());
			bindR.sppl_cd(MAC_STR.NULL_VAL.value());
			bindR.maker_cd(MAC_STR.NULL_VAL.value());
			bindR.rqst_loc_cd(MAC_STR.NULL_VAL.value());
			bindR.wg_cd(up0R.mfg_loc_wg_cd());
			
			return bindR;
		}
		
		protected void callPoSchdRegSrv() {
			// 「計画指図の登録、更新」、「計画外指図の登録、更新、取消」用のリスト
			MCList<MfgInstReg_Upd01_HdrR> ptn1L = MCList.create(MfgInstReg_Upd01_HdrR.class);
			// 計画指図の取消用のリスト
			MCList<MfgInstReg_Upd01_HdrR> ptn2L = MCList.create(MfgInstReg_Upd01_HdrR.class);
			
			for (MfgInstReg_Upd01_HdrR r : up0()) {
				if (isNull(r.po_schd_data_crud_typ())) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isDEL(r.itm_mfg_inst_data_crud_typ())
						&& MAC_DATA_CRUD_TYP.isUPD(r.po_schd_data_crud_typ())) {
					// 外注の場合は工程単位製造指図にならないため、not_frst_inst_can_flgの条件は不要
					ptn2L.add(r);
				}
				else {
					ptn1L.add(r);
				}
			}
			if (ptn1L.isEmpty() && ptn2L.isEmpty()) {
				return;
			}
			
			// 品目オーダ、発注予定を取得
			MCList<MST_ITM_ORDER_R> ioL = getItmOrdForPoSchd(ptn1L, ptn2L);
			MCIndexKey idxKey = ioL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			
			// 「計画指図の登録、更新」、「計画外指図の登録、更新、取消」用のリスト
			MCList<PoSchd_Upd01_DtlR> oUpPtn1L = MCList.create(PoSchd_Upd01_DtlR.class);
			// 計画指図の取消用のリスト
			MCList<PoSchd_Upd01_DtlR> oUpPtn2L = MCList.create(PoSchd_Upd01_DtlR.class);
			
			if (!ptn1L.isEmpty()) {
				// 発注予定サービスの上り電文設定
				addAll(oUpPtn1L, ptn1L, createMap_PoSchd_Upd01_DtlR_MfgInstReg_Upd01_HdrR_Ptn1());
				
				// 予定日計算サービス実行用のリスト
				MCList<MfgInstReg_Upd01_HdrR> prePtn1CrtUpdL = ptn1L.subList(
						r -> !MAC_DATA_CRUD_TYP.isDEL(r.itm_mfg_inst_data_crud_typ()));
				// 予定日計算対象を再抽出
				MCList<MfgInstReg_Upd01_HdrR> ptn1CrtUpdL = MCList.create(MfgInstReg_Upd01_HdrR.class);
				for (MfgInstReg_Upd01_HdrR r : prePtn1CrtUpdL) {
					
					MST_ITM_ORDER_R ioR = ioL.getFirst(idxKey, r.itm_ord_no());
					
					if (!r.unschd_inst_flg() && r.rqst_dlv_rqst_tm().eqDate(ioR.strg_schd_dt())) {
						// 計画外指図以外、かつ納入希望日に変更がない場合は予定日計算を行わない
						
						MCIndexKey oUpPtn1LIdxKey = oUpPtn1L.createIndex(PoSchd_Upd01_DtlR.$peg_no);
						PoSchd_Upd01_DtlR oUpPtn1R = oUpPtn1L.getFirst(oUpPtn1LIdxKey, r.peg_no());
						
						// 品目オーダ情報の予定日を設定
						oUpPtn1R.po_schd_dt(ioR.po_schd_dt());
						oUpPtn1R.purc_schd_dt(ioR.accpt_schd_dt());
						oUpPtn1R.dlv_rqst_tm(ioR.strg_schd_dt());
						oUpPtn1R.rqst_avl_rqst_dt(ioR.avl_schd_dt());
						
					} else {
						ptn1CrtUpdL.add(r);
					}
				}
				
				// 外注の場合は工程単位製造指図にならず、また品目製造指図のデータ更新区分を参照しているため、not_frst_inst_can_flgの条件は不要
				if (!ptn1CrtUpdL.isEmpty()) {
					MSBCL_OrdRegService.Ord_Sprt03 calcDtOpe = MSBCL_OrdRegService.crtOrd_Sprt03();
					addAll(calcDtOpe.up0(), ptn1CrtUpdL, createMap_Ord_Sprt03_DtlR_MfgInstReg_Upd01_HdrR());
					calcDtOpe.exec();
					
					// ptn1CrtUpdLではなくoUpPtn1Lにサービスの戻り値を設定（同じpegNoが設定されているため問題ない）
					copyByPegNo(oUpPtn1L, new String[] {
							PoSchd_Upd01_DtlR.$po_schd_dt,
							PoSchd_Upd01_DtlR.$purc_schd_dt,
							PoSchd_Upd01_DtlR.$dlv_rqst_tm,
							PoSchd_Upd01_DtlR.$rqst_avl_rqst_dt
					}, calcDtOpe.down0(), new String[] {
							Ord_Sprt03_RsltR.$po_schd_dt,
							Ord_Sprt03_RsltR.$accpt_schd_dt,
							Ord_Sprt03_RsltR.$strg_schd_dt,
							Ord_Sprt03_RsltR.$avl_schd_dt
					});
				}
				
				getItmDtlWgCd();
				
				for (PoSchd_Upd01_DtlR r : oUpPtn1L) {
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						// 外注の場合は工程単位製造指図にならないため、not_frst_inst_can_flgの条件は不要
						continue;
					}
					MST_ITM_ORDER_R ioR = ioL.getFirst(idxKey, r.outsrc_itm_ord_no());
					r.pln_itm_ord_no(ioR.getStringNE("pln_itm_ord_no"));
					r.slo_no(ioR.getStringNE("po_schd_slo_no"));
					r.slo_d_no(ioR.getStringNE("po_schd_slo_d_no"));
					r.purc_rsn_cd(ioR.getStringNE("purc_rsn_cd"));
					r.dlv_cd(ioR.getStringNE("dlv_cd"));
					r.dlv_sundry_flg(MCBooleanUtil.dbStringToBoolean(ioR.getStringNE("dlv_sundry_flg")));
					r.dlv_nm(ioR.getStringNE("dlv_nm")); 
					r.dlv_cntct_dpt(ioR.getStringNE("dlv_cntct_dpt"));
					r.dlv_cntct_psn(ioR.getStringNE("dlv_cntct_psn"));
					r.dlv_zip_cd(ioR.getStringNE("dlv_zip_cd"));
					r.dlv_addr1(ioR.getStringNE("dlv_addr1"));
					r.dlv_addr2(ioR.getStringNE("dlv_addr2"));
					r.dlv_addr3(ioR.getStringNE("dlv_addr3"));
					r.dlv_addr4(ioR.getStringNE("dlv_addr4"));
					r.dlv_tel(ioR.getStringNE("dlv_tel"));
					r.dlv_fax(ioR.getStringNE("dlv_fax"));
					r.tdlv_cd(ioR.getStringNE("tdlv_cd"));
					r.tdlv_sundry_flg(MCBooleanUtil.dbStringToBoolean(ioR.getStringNE("tdlv_sundry_flg")));
					r.tdlv_nm(ioR.getStringNE("tdlv_nm"));
					r.tdlv_zip_cd(ioR.getStringNE("tdlv_zip_cd"));
					r.tdlv_addr1(ioR.getStringNE("tdlv_addr1"));
					r.tdlv_addr2(ioR.getStringNE("tdlv_addr2"));
					r.tdlv_addr3(ioR.getStringNE("tdlv_addr3"));
					r.tdlv_addr4(ioR.getStringNE("tdlv_addr4"));
					r.tdlv_tel(ioR.getStringNE("tdlv_tel"));
					r.tdlv_fax(ioR.getStringNE("tdlv_fax"));
					
					r.tdlv_cntct_dpt(ioR.getStringNE("tdlv_cntct_dpt"));
					r.tdlv_cntct_psn(ioR.getStringNE("tdlv_cntct_psn"));
					r.rqst_crrct_flg(MCBooleanUtil.dbStringToBoolean(ioR.getStringNE("rqst_crrct_flg")));
					r.intr_rmrks(ioR.getStringNE("intr_rmrks"));
					r.trd_d_rmrks(ioR.getStringNE("trd_d_rmrks"));
					r.sub_char1(ioR.getStringNE("sub_char1"));
					r.sub_char2(ioR.getStringNE("sub_char2"));
					r.sub_char3(ioR.getStringNE("sub_char3"));

					MfgInstReg_Upd01_HdrR hdrR = _hdrCache.getCache(r.peg_no());
					if (hdrR.unschd_inst_flg()) {
						// 指図保存時には指図日は任意項目であるため、指定しない場合は運用日付を設定する。
						r.reg_dt(nvl(hdrR.inst_dt(), getToday()));
						r.rqst_wg_cd(hdrR.mfg_loc_wg_cd());
						
						MAM_ITM_DTL_R itmDtl = _cacheItmDtl.get(hdrR.master_dt(),
								hdrR.itm_cd(),
								hdrR.itm_sub1(),
								hdrR.itm_sub2(),
								hdrR.itm_sub3(),
								hdrR.mfg_loc_cd(),
								MAC_STR.NULL_VAL.value(),
								MAC_STR.NULL_VAL.value(),
								MAC_STR.NULL_VAL.value(),
								hdrR.mfg_loc_wg_cd(),
								hdrR.bom_ptn());
						
						if (!isNull(itmDtl.rqst_wg_cd())) {
							r.wg_cd(itmDtl.rqst_wg_cd());
						}
						else {
							r.wg_cd(hdrR.mfg_loc_wg_cd());
						}
					}
					else {
						r.reg_dt(ioR.getDateNE("po_schd_reg_dt"));
						r.rqst_wg_cd(ioR.getStringNE("po_schd_wg_cd"));
						r.wg_cd(ioR.getStringNE("rqst_wg_cd"));
					}
				}
			}
			
			if (!ptn2L.isEmpty()) {
				addAll(oUpPtn2L, ptn2L, createMap_PoSchd_Upd01_DtlR_MfgInstReg_Upd01_HdrR_Ptn2());
				
				for (PoSchd_Upd01_DtlR r : oUpPtn2L) {
					MST_ITM_ORDER_R ioR = ioL.getFirst(idxKey, r.outsrc_itm_ord_no());
					
					r.pln_itm_ord_no(ioR.getStringNE("pln_itm_ord_no"));
					r.slo_no(ioR.getStringNE("po_schd_slo_no"));
					r.slo_d_no(ioR.getStringNE("po_schd_slo_d_no"));
					r.rqst_wg_cd(ioR.getStringNE("po_schd_wg_cd"));
					
					r.io_schd_pr_no(ioR.io_schd_pr_no());
					r.itm_cd(ioR.itm_cd());
					r.itm_sub1(ioR.itm_sub1());
					r.itm_sub2(ioR.itm_sub2());
					r.itm_sub3(ioR.itm_sub3());
					r.sno1(ioR.sno1());
					r.sno2(ioR.sno2());
					r.sno3(ioR.sno3());
					r.sno4(ioR.sno4());
					r.in_to_loc_cd(ioR.strg_loc_cd());
					r.reg_dt(ioR.getDateNE("po_schd_reg_dt"));
					r.wg_cd(ioR.wg_cd());
					r.sppl_cd(ioR.sppl_cd());
					r.maker_cd(ioR.maker_cd());
					r.mfg_loc_cd(ioR.mfg_loc_cd());
					r.bom_ptn(ioR.bom_ptn());
					r.base_unit_qty(ioR.inst_qty());
					r.base_unit_cd(ioR.getStringNE("unit_cd"));
					r.po_cnt_rmrks(ioR.inst_po_cnt_rmrks());
					r.rqst_dlv_rqst_tm(ioR.strg_schd_dt());
					r.rqst_avl_rqst_dt(ioR.avl_schd_dt());
					r.dlv_rqst_tm(ioR.strg_schd_dt());
					r.po_schd_dt(ioR.po_schd_dt());
					r.purc_schd_dt(ioR.accpt_schd_dt());
					
					r.purc_rsn_cd(ioR.getStringNE("purc_rsn_cd"));
					r.dlv_cd(ioR.getStringNE("dlv_cd"));
					r.dlv_sundry_flg(MCBooleanUtil.dbStringToBoolean(ioR.getStringNE("dlv_sundry_flg")));
					r.dlv_nm(ioR.getStringNE("dlv_nm"));
					r.dlv_cntct_dpt(ioR.getStringNE("dlv_cntct_dpt"));
					r.dlv_cntct_psn(ioR.getStringNE("dlv_cntct_psn"));
					r.dlv_zip_cd(ioR.getStringNE("dlv_zip_cd"));
					r.dlv_addr1(ioR.getStringNE("dlv_addr1"));
					r.dlv_addr2(ioR.getStringNE("dlv_addr2"));
					r.dlv_addr3(ioR.getStringNE("dlv_addr3"));
					r.dlv_addr4(ioR.getStringNE("dlv_addr4"));
					r.dlv_tel(ioR.getStringNE("dlv_tel"));
					r.dlv_fax(ioR.getStringNE("dlv_fax"));
					r.tdlv_cd(ioR.getStringNE("tdlv_cd"));
					r.tdlv_sundry_flg(MCBooleanUtil.dbStringToBoolean(ioR.getStringNE("tdlv_sundry_flg")));
					r.tdlv_nm(ioR.getStringNE("tdlv_nm"));
					r.tdlv_cntct_dpt(ioR.getStringNE("tdlv_cntct_dpt"));
					r.tdlv_cntct_psn(ioR.getStringNE("tdlv_cntct_psn"));
					r.tdlv_zip_cd(ioR.getStringNE("tdlv_zip_cd"));
					r.tdlv_addr1(ioR.getStringNE("tdlv_addr1"));
					r.tdlv_addr2(ioR.getStringNE("tdlv_addr2"));
					r.tdlv_addr3(ioR.getStringNE("tdlv_addr3"));
					r.tdlv_addr4(ioR.getStringNE("tdlv_addr4"));
					r.tdlv_tel(ioR.getStringNE("tdlv_tel"));
					r.tdlv_fax(ioR.getStringNE("tdlv_fax"));
					r.rqst_crrct_flg(MCBooleanUtil.dbStringToBoolean(ioR.getStringNE("rqst_crrct_flg")));
					r.intr_rmrks(ioR.getStringNE("intr_rmrks"));
					r.trd_d_rmrks(ioR.getStringNE("trd_d_rmrks"));
					r.sub_char1(ioR.getStringNE("sub_char1"));
					r.sub_char2(ioR.getStringNE("sub_char2"));
					r.sub_char3(ioR.getStringNE("sub_char3"));
				}
			}
			// 発注予定サービス
			MSBDL_PoSchdRegService.PoSchd_Upd01 poSchdOpe = MSBDL_PoSchdRegService.crtPoSchd_Upd01();
			poSchdOpe.up0().addAll(oUpPtn1L);
			poSchdOpe.up0().addAll(oUpPtn2L);
			poSchdOpe.exec();
		}
		
		protected MCList<MST_ITM_ORDER_R> getItmOrdForPoSchd(
				MCList<MfgInstReg_Upd01_HdrR> ptn1L,
				MCList<MfgInstReg_Upd01_HdrR> ptn2L) {
			
			MCList<MfgInstReg_Upd01_HdrR> bindL = MCList.create(MfgInstReg_Upd01_HdrR.class);
			bindL.addAll(ptn1L);
			bindL.addAll(ptn2L);
					
			MCList<MST_ITM_ORDER_R> ret = MCList.create(MST_ITM_ORDER_R.class);
			MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder ret_bldr = MCQueryApiBuilder.create(t);
			MST_PO_SCHD_R t2 = MST_PO_SCHD_R.create("T2");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_ITM_R m2 = MAM_ITM_R.create("M2");
			ret_bldr.setSelect(t.itm_ord_no);
			ret_bldr.addSelect(t.io_schd_pr_no);
			ret_bldr.addSelect(t.itm_cd);
			ret_bldr.addSelect(t.itm_sub1);
			ret_bldr.addSelect(t.itm_sub2);
			ret_bldr.addSelect(t.itm_sub3);
			ret_bldr.addSelect(t.sno1);
			ret_bldr.addSelect(t.sno2);
			ret_bldr.addSelect(t.sno3);
			ret_bldr.addSelect(t.sno4);
			ret_bldr.addSelect(t.strg_loc_cd);
			ret_bldr.addSelect(t.wg_cd);
			ret_bldr.addSelect(t.rqst_wg_cd);
			ret_bldr.addSelect(t.mfg_loc_cd);
			ret_bldr.addSelect(t.bom_ptn);
			ret_bldr.addSelect(t.inst_qty);
			ret_bldr.addSelect(t.inst_po_cnt_rmrks);
			ret_bldr.addSelect(t.avl_schd_dt);
			ret_bldr.addSelect(t.po_schd_dt);
			ret_bldr.addSelect(t.accpt_schd_dt);
			ret_bldr.addSelect(t.strg_schd_dt);
			
			ret_bldr.addSelect(t2.pln_itm_ord_no);
			ret_bldr.addSelect(t2.slo_no.as("po_schd_slo_no"));
			ret_bldr.addSelect(t2.slo_d_no.as("po_schd_slo_d_no"));
			ret_bldr.addSelect(t2.wg_cd.as("po_schd_wg_cd"));
			ret_bldr.addSelect(t2.reg_dt.as("po_schd_reg_dt"));
			ret_bldr.addSelect(t2.purc_rsn_cd);
			ret_bldr.addSelect(t2.dlv_cd);
			ret_bldr.addSelect(t2.dlv_sundry_flg);
			ret_bldr.addSelect(t2.dlv_nm);
			ret_bldr.addSelect(t2.dlv_cntct_dpt);
			ret_bldr.addSelect(t2.dlv_cntct_psn);
			ret_bldr.addSelect(t2.dlv_zip_cd);
			ret_bldr.addSelect(t2.dlv_addr1);
			ret_bldr.addSelect(t2.dlv_addr2);
			ret_bldr.addSelect(t2.dlv_addr3);
			ret_bldr.addSelect(t2.dlv_addr4);
			ret_bldr.addSelect(t2.dlv_tel);
			ret_bldr.addSelect(t2.dlv_fax);
			ret_bldr.addSelect(t2.tdlv_cd);
			ret_bldr.addSelect(t2.tdlv_sundry_flg);
			ret_bldr.addSelect(t2.tdlv_nm);
			ret_bldr.addSelect(t2.tdlv_zip_cd);
			ret_bldr.addSelect(t2.tdlv_addr1);
			ret_bldr.addSelect(t2.tdlv_addr2);
			ret_bldr.addSelect(t2.tdlv_addr3);
			ret_bldr.addSelect(t2.tdlv_addr4);
			ret_bldr.addSelect(t2.tdlv_tel);
			ret_bldr.addSelect(t2.tdlv_fax);
			
			ret_bldr.addSelect(m1.sppl_cd);
			ret_bldr.addSelect(m1.maker_cd);
			ret_bldr.addSelect(m2.unit_cd);
			
			ret_bldr.addSelect(t2.tdlv_cntct_dpt);
			ret_bldr.addSelect(t2.tdlv_cntct_psn);
			ret_bldr.addSelect(t2.rqst_crrct_flg);
			ret_bldr.addSelect(t2.intr_rmrks);
			ret_bldr.addSelect(t2.trd_d_rmrks);
			ret_bldr.addSelect(t2.sub_char1);
			ret_bldr.addSelect(t2.sub_char2);
			ret_bldr.addSelect(t2.sub_char3);

			ret_bldr.addLeftOuterJoin(t2, bracket( t.itm_ord_no.eq(t2.outsrc_itm_ord_no) 
					.and(t2.can_flg.eq(value(false)))));
			ret_bldr.addInnerJoin(m1, bracket( t.mfg_loc_cd.eq(m1.loc_cd)));
			ret_bldr.addInnerJoin(m2, bracket( t.itm_cd.eq(m2.itm_cd) 
					.and(t.itm_sub1.eq(m2.itm_sub1)) 
					.and(t.itm_sub2.eq(m2.itm_sub2)) 
					.and(t.itm_sub3.eq(m2.itm_sub3))));
			dbSelectKey("MSBCL6000_MST_ITM_ORDER_S01", ret, ret_bldr, bindL.groupBy(MfgInstReg_Upd01_HdrR.$itm_ord_no));
			
			return ret;
		}
		
		protected Map_PoSchd_Upd01_DtlR_MfgInstReg_Upd01_HdrR_Ptn1<PoSchd_Upd01_DtlR,MfgInstReg_Upd01_HdrR> createMap_PoSchd_Upd01_DtlR_MfgInstReg_Upd01_HdrR_Ptn1() {
			return new Map_PoSchd_Upd01_DtlR_MfgInstReg_Upd01_HdrR_Ptn1<PoSchd_Upd01_DtlR, MfgInstReg_Upd01_HdrR>();
		}

		public class Map_PoSchd_Upd01_DtlR_MfgInstReg_Upd01_HdrR_Ptn1<D extends PoSchd_Upd01_DtlR, S extends MfgInstReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PoSchd_Upd01_DtlR.$peg_no, MfgInstReg_Upd01_HdrR.$peg_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$data_crud_typ, MfgInstReg_Upd01_HdrR.$po_schd_data_crud_typ);
				addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_src_typ, MfgInstReg_Upd01_HdrR.$po_schd_src_typ);
				addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_src_no, MfgInstReg_Upd01_HdrR.$po_schd_src_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$io_schd_pr_no, MfgInstReg_Upd01_HdrR.$io_schd_pr_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_cd, MfgInstReg_Upd01_HdrR.$itm_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub1, MfgInstReg_Upd01_HdrR.$itm_sub1);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub2, MfgInstReg_Upd01_HdrR.$itm_sub2);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub3, MfgInstReg_Upd01_HdrR.$itm_sub3);
				addColumnPathMap(PoSchd_Upd01_DtlR.$sno1, MfgInstReg_Upd01_HdrR.$sno1);
				addColumnPathMap(PoSchd_Upd01_DtlR.$sno2, MfgInstReg_Upd01_HdrR.$sno2);
				addColumnPathMap(PoSchd_Upd01_DtlR.$sno3, MfgInstReg_Upd01_HdrR.$sno3);
				addColumnPathMap(PoSchd_Upd01_DtlR.$sno4, MfgInstReg_Upd01_HdrR.$sno4);
				addColumnPathMap(PoSchd_Upd01_DtlR.$in_to_loc_cd, MfgInstReg_Upd01_HdrR.$strg_loc_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$str_ln_cd, MfgInstReg_Upd01_HdrR.$strg_str_ln_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$reg_dt, MfgInstReg_Upd01_HdrR.$inst_dt);
				addColumnPathMap(PoSchd_Upd01_DtlR.$wg_cd, MfgInstReg_Upd01_HdrR.$mfg_loc_wg_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$sppl_cd, MfgInstReg_Upd01_HdrR.$sppl_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$maker_cd, MfgInstReg_Upd01_HdrR.$maker_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$outsrc_itm_ord_no, MfgInstReg_Upd01_HdrR.$itm_ord_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$mfg_loc_cd, MfgInstReg_Upd01_HdrR.$mfg_loc_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$bom_ptn, MfgInstReg_Upd01_HdrR.$bom_ptn);
				addColumnPathMap(PoSchd_Upd01_DtlR.$base_unit_qty, MfgInstReg_Upd01_HdrR.$base_unit_inst_qty);
				addColumnPathMap(PoSchd_Upd01_DtlR.$base_unit_cd, MfgInstReg_Upd01_HdrR.$base_unit_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$po_cnt_rmrks, MfgInstReg_Upd01_HdrR.$inst_po_cnt_rmrks);
				addColumnPathMap(PoSchd_Upd01_DtlR.$rqst_dlv_rqst_tm, MfgInstReg_Upd01_HdrR.$rqst_dlv_rqst_tm);
				addColumnPathMap(PoSchd_Upd01_DtlR.$abort_flg, MfgInstReg_Upd01_HdrR.$inst_abort_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.outsrc_flg(true);
			}
		}
		
		// 計画製造指図を取り消す際には発注予定を削除するのではなく更新する。その際に使用するMapper
		protected Map_PoSchd_Upd01_DtlR_MfgInstReg_Upd01_HdrR_Ptn2<PoSchd_Upd01_DtlR,MfgInstReg_Upd01_HdrR> createMap_PoSchd_Upd01_DtlR_MfgInstReg_Upd01_HdrR_Ptn2() {
			return new Map_PoSchd_Upd01_DtlR_MfgInstReg_Upd01_HdrR_Ptn2<PoSchd_Upd01_DtlR, MfgInstReg_Upd01_HdrR>();
		}

		public class Map_PoSchd_Upd01_DtlR_MfgInstReg_Upd01_HdrR_Ptn2<D extends PoSchd_Upd01_DtlR, S extends MfgInstReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PoSchd_Upd01_DtlR.$peg_no, MfgInstReg_Upd01_HdrR.$peg_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$data_crud_typ, MfgInstReg_Upd01_HdrR.$po_schd_data_crud_typ);
				addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_src_typ, MfgInstReg_Upd01_HdrR.$po_schd_src_typ);
				addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_src_no, MfgInstReg_Upd01_HdrR.$po_schd_src_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$outsrc_itm_ord_no, MfgInstReg_Upd01_HdrR.$itm_ord_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.outsrc_flg(true);
				dest.str_ln_cd(MAC_STR.NULL_VAL.value());
			}
		}
		
		protected Map_Ord_Sprt03_DtlR_MfgInstReg_Upd01_HdrR<Ord_Sprt03_DtlR,MfgInstReg_Upd01_HdrR> createMap_Ord_Sprt03_DtlR_MfgInstReg_Upd01_HdrR() {
			return new Map_Ord_Sprt03_DtlR_MfgInstReg_Upd01_HdrR<Ord_Sprt03_DtlR, MfgInstReg_Upd01_HdrR>();
		}

		public class Map_Ord_Sprt03_DtlR_MfgInstReg_Upd01_HdrR<D extends Ord_Sprt03_DtlR, S extends MfgInstReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Sprt03_DtlR.$peg_no, MfgInstReg_Upd01_HdrR.$peg_no);
				addColumnPathMap(Ord_Sprt03_DtlR.$strg_schd_dt, MfgInstReg_Upd01_HdrR.$rqst_dlv_rqst_tm);
				addColumnPathMap(Ord_Sprt03_DtlR.$master_dt, MfgInstReg_Upd01_HdrR.$master_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_cd, MfgInstReg_Upd01_HdrR.$itm_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub1, MfgInstReg_Upd01_HdrR.$itm_sub1);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub2, MfgInstReg_Upd01_HdrR.$itm_sub2);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub3, MfgInstReg_Upd01_HdrR.$itm_sub3);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_loc_cd, MfgInstReg_Upd01_HdrR.$mfg_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$bom_ptn, MfgInstReg_Upd01_HdrR.$bom_ptn);
				addColumnPathMap(Ord_Sprt03_DtlR.$strg_loc_cd, MfgInstReg_Upd01_HdrR.$strg_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$inst_qty, MfgInstReg_Upd01_HdrR.$base_unit_inst_qty);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
				dest.sppl_cd(MAC_STR.NULL_VAL.value());
				dest.maker_cd(MAC_STR.NULL_VAL.value());
				dest.rqst_loc_cd(MAC_STR.NULL_VAL.value());
			}
		}
		
		protected void callArrSchdRegSrv() {
			// 入荷予定の製造指図ＮＯとロット・サブロットＮＯの設定処理
			MCList<MfgInstReg_Upd01_HdrR> upArrSchdL = MCList.create(MfgInstReg_Upd01_HdrR.class);
			MCList<MST_MFG_INST_R> arrSchdBindL = MCList.create(MST_MFG_INST_R.class);
			for (MfgInstReg_Upd01_HdrR r : up0()) {
				if (!isNull(r.po_d_no()) && !r.is_src_outsrc_srv_flg()
						&& !MSC_MFG_STS_TYP.isSTT(r.mfg_sts_typ())
						&& !r.is_src_alloc_flg()){
					upArrSchdL.add(r);
					
					MST_MFG_INST_R bindR = MST_MFG_INST_R.create();
					bindR.po_d_no(r.po_d_no());
					arrSchdBindL.add(bindR);
				}
			}
			
			if (arrSchdBindL.isEmpty()) {
				return;
			}
			
			MSBEL_ArrSchdService.ArrSchd_Upd02 arrSchdSrv = MSBEL_ArrSchdService.crtArrSchd_Upd02();
			MSBFL_LotService.Lot_Del01 delOpe = MSBFL_LotService.crtLot_Del01();
			MCList<MST_ARR_SCHD_R> dbArrSchdL = getArrSchd(arrSchdBindL);
			
			MCIndexKey instNoIndexKey = dbArrSchdL.createIndex(MST_ARR_SCHD_R.$mfg_inst_no);
			MCIndexKey poDNoIndexKey = dbArrSchdL.createIndex("po_d_no", MST_ARR_SCHD_R.$mfg_inst_no);
			for (MfgInstReg_Upd01_HdrR r : upArrSchdL) {
				// 製造指図ＮＯでsubListしたリスト
				MCList<MST_ARR_SCHD_R> sub1L = dbArrSchdL.subList(instNoIndexKey, r.mfg_inst_no());
				if (!sub1L.isEmpty()) {
					for (MST_ARR_SCHD_R subDbR : sub1L) {
						ArrSchd_DtlR srvR = ArrSchd_DtlR.create(); 
						copy(srvR, r, createMap_ArrSchd_DtlR_MfgInstReg_Upd01_HdrR());
						srvR.arr_schd_no(subDbR.arr_schd_no());
						if (sub1L.sum(MST_ARR_SCHD_R.$base_unit_qty).gt(r.base_unit_inst_qty())) {
							// 指図に紐付く入荷予定の合計数量が指図数量よりも大きければ、製造指図ＮＯ、ロットＮＯ、サブロットＮＯをクリアする
							srvR.mfg_inst_no(null);
							srvR.lot_no(null);
							srvR.sublot_no(null);
						}
						arrSchdSrv.up0().add(srvR);
					}
				}
				else {
					// 製造指図ＮＯがnullかつ発注明細ＮＯでsubListしたリスト
					// 指図数量と指図に紐付く入荷予定の合計数量が同じであれば、製造指図ＮＯ、ロットＮＯ、サブロットＮＯを設定するためにサービスを実行する
					MCList<MST_ARR_SCHD_R> sub2L = dbArrSchdL.subList(poDNoIndexKey, r.po_d_no(), null);
					if (!sub2L.isEmpty()) {
						if (isSame(sub2L.sum(MST_ARR_SCHD_R.$base_unit_qty), r.base_unit_inst_qty())) {
							for (MST_ARR_SCHD_R subDbR : sub2L) {
								ArrSchd_DtlR srvR = ArrSchd_DtlR.create(); 
								copy(srvR, r, createMap_ArrSchd_DtlR_MfgInstReg_Upd01_HdrR());
								srvR.arr_schd_no(subDbR.arr_schd_no());
								arrSchdSrv.up0().add(srvR);
							}
						}
					}
				}
				if (isCallLotDelSrv(r, r.itm_mfg_inst_data_crud_typ(),
						r.lot_no(), r.sublot_no(), r.old_lot_no(),
						r.old_sublot_no(), r.not_frst_inst_can_flg())) {
					Lot_Del01_CndR delOpeUpR = Lot_Del01_CndR.create();
					copy(delOpeUpR, r, createMap_Lot_Del01_CndR_MfgInstReg_Upd01_HdrR());
					delOpe.up0().add(delOpeUpR);
				}
			}
			if (!arrSchdSrv.up0().isEmpty()) {
				setPegNo(arrSchdSrv.up0());
				arrSchdSrv.exec();
			}
			if (!delOpe.up0().isEmpty()) {
				delOpe.exec();
			}
		}
		
		protected Map_ArrSchd_DtlR_MfgInstReg_Upd01_HdrR<ArrSchd_DtlR,MfgInstReg_Upd01_HdrR> createMap_ArrSchd_DtlR_MfgInstReg_Upd01_HdrR() {
			return new Map_ArrSchd_DtlR_MfgInstReg_Upd01_HdrR<ArrSchd_DtlR, MfgInstReg_Upd01_HdrR>();
		}

		public class Map_ArrSchd_DtlR_MfgInstReg_Upd01_HdrR<D extends ArrSchd_DtlR, S extends MfgInstReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ArrSchd_DtlR.$mfg_inst_no, MfgInstReg_Upd01_HdrR.$mfg_inst_no);
				addColumnPathMap(ArrSchd_DtlR.$lot_no, MfgInstReg_Upd01_HdrR.$lot_no);
				addColumnPathMap(ArrSchd_DtlR.$sublot_no, MfgInstReg_Upd01_HdrR.$sublot_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.crt_lot_flg(false);
				dest.is_src_outsrc_srv_flg(true);
			}
		}
		
		protected void callTblRegSrv() {
			mapUpContainers(MIT);

			// 製造指図
			mitUpd01.exec();
			
			// 品目製造指図
			mitUpd02.exec();
			
			// 工程指図
			mitUpd03.exec();
			
			// ロット登録処理呼出
			callLotUpdSrv();
			
			// 出来高予定
			if (!mitUpd04.up0().isEmpty()) {
				mitUpd04.exec();
				
				copyByPegNo(up4(), new String[] {
						MfgInstReg_Upd01_DtlYieldR.$yield_schd_no
				}, mitUpd04.down0(), new String[] {
						MfgInstTblReg_Upd04_DtlYieldR.$yield_schd_no
				});
			}
			
			// 同一品目製造指図に紐づく、他の製造指図の出来高予定を更新する
			// ※発番されたロットを反映するため
			callYieldSchdSrvForLotUpd();
			
			// 副産品予定
			if (!mitUpd07.up0().isEmpty()) {
				mitUpd07.exec();
				
				copyByPegNo(up5(), new String[] {
						MfgInstReg_Upd01_DtlByProdR.$yield_schd_no
				}, mitUpd07.down0(), new String[] {
						MfgInstTblReg_Upd07_DtlByProdR.$yield_schd_no
				});
			}
			
			// ロット削除処理呼出
			// ※ロット削除処理で出来高予定を参照するため、出来高・副産品の更新が終わった後に実行する。
			// また、投入予定が呼ぶ引当処理でロットを参照するため、投入予定の更新前に実行する。
			callLotDelSrv();
			
			// 投入予定
			// ※引当のために出来高や副産品の入庫予定が更新された後に呼ぶ必要がある
			if (!mitUpd05.up0().isEmpty()) {
				mitUpd05.exec();
				
				copyByPegNo(up2(), new String[] {
						MfgInstReg_Upd01_DtlInptR.$inpt_schd_no,
						MfgInstReg_Upd01_DtlInptR.$ver_no,
						MfgInstReg_Upd01_DtlInptR.$inpt_str_ln_cd
				}, mitUpd05.down0(), new String[] {
						MfgInstTblReg_Upd05_DtlInptR.$inpt_schd_no,
						MfgInstTblReg_Upd05_DtlInptR.$ver_no,
						MfgInstTblReg_Upd05_DtlInptR.$inpt_str_ln_cd
				});
			}
			
			// ロット継承サービスの呼び出し
			MCList<MfgInstTblReg_Upd05_HdrR> stsSavHdrL = MCList.create(MfgInstTblReg_Upd05_HdrR.class);
			stsSavHdrL.addAll(mitUpd05.down1());
			stsSavHdrL.addAll(callLotInhSrv());

			if (!stsSavHdrL.isEmpty()) {
				
				Set<MCNumber> stsSavHdrSet = new HashSet<MCNumber>(); 
				for (MfgInstTblReg_Upd05_HdrR inptDown1R : stsSavHdrL) {
					MfgInstReg_Upd01_HdrR hdrR = _hdrCache.getCache(inptDown1R.hdr_peg_no());
					hdrR.alloc_tgt_cnt(inptDown1R.alloc_tgt_cnt());
					hdrR.alloc_success_cnt(inptDown1R.alloc_success_cnt());
					hdrR.alloc_failure_cnt(inptDown1R.alloc_failure_cnt());
					if (MSC_MFG_STS_TYP.isORD(hdrR.mfg_sts_typ()) && inptDown1R.sts_sav_flg()) {
						// 指図済にならないため指図書は発行しない
						hdrR.inst_immed_prnt_flg(false);
						// まだ承認対象にはしない
						// ※updMfgStsToSavメソッドでもクリアする必要があるので注意
						clearAprvVal(hdrR);
						
						hdrR.mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
						stsSavHdrSet.add(hdrR.peg_no());
					}
				}
				if (!stsSavHdrSet.isEmpty()) {
					// 製造指図・工程・出来高・副産品は再度MSBCL6010を実行する。
					// ※工数の更新順は投入の後でも構わないため、再度実行する作りにはしていない
					updMfgStsToSav(stsSavHdrSet);
				}
			}
			
			// 工数予定
			if (!mitUpd06.up0().isEmpty()) {
				mitUpd06.exec();
				
				copyByPegNo(up3(), new String[] {
						MfgInstReg_Upd01_DtlWkR.$wk_schd_no
				}, mitUpd06.down0(), new String[] {
						MfgInstTblReg_Upd06_DtlWkR.$wk_schd_no
				});
			}
		}
		
		protected void updMfgStsToSav(Set<MCNumber> stsSavHdrSet) {
			// 製造指図
			MCList<MfgInstTblReg_Upd01_DtlMfgR> hdrTblUpL = MCList.create(MfgInstTblReg_Upd01_DtlMfgR.class);
			for (MfgInstTblReg_Upd01_DtlMfgR hdrTblUpR : mitUpd01.up0()) {
				if (stsSavHdrSet.contains(hdrTblUpR.peg_no())) {
					hdrTblUpR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					hdrTblUpR.mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
					hdrTblUpR.aprv_flg(false);
					hdrTblUpR.mfg_aprv_role_cd(null);
					hdrTblUpR.mfg_aprv_sts_typ(null);
					hdrTblUpR.aprv_dt(null);
					hdrTblUpR.aprv_dpt_cd(null);
					hdrTblUpR.aprv_usr_cd(null);
					hdrTblUpR.aprv_tm(null);
					hdrTblUpR.aprv_rsn(null);
					hdrTblUpL.add(hdrTblUpR);
				}
			}
			if (!hdrTblUpL.isEmpty()) {
				MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd01 tblUpdOpe = MSBCL_MfgInstTblRegService.crtMfgInstTblReg_Upd01();
				tblUpdOpe.up0().addAll(hdrTblUpL);
				tblUpdOpe.exec();
			}

			// 工程指図
			MCList<MfgInstTblReg_Upd03_DtlOperR> operTblUpL = MCList.create(MfgInstTblReg_Upd03_DtlOperR.class);
			for (MfgInstTblReg_Upd03_DtlOperR operTblUpR : mitUpd03.up0()) {
				if (stsSavHdrSet.contains(operTblUpR.hdr_peg_no())) {
					operTblUpR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					operTblUpR.hdr_mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
					operTblUpR.mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
					operTblUpL.add(operTblUpR);
				}
			}
			if (!operTblUpL.isEmpty()) {
				MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd03 tblUpdOpe = MSBCL_MfgInstTblRegService.crtMfgInstTblReg_Upd03();
				tblUpdOpe.up0().addAll(operTblUpL);
				tblUpdOpe.exec();
			}
			
			// 出来高予定
			MCList<MfgInstTblReg_Upd04_DtlYieldR> yieldTblUpL = MCList.create(MfgInstTblReg_Upd04_DtlYieldR.class);
			for (MfgInstTblReg_Upd04_DtlYieldR yieldTblUpR : mitUpd04.up0()) {
				if (stsSavHdrSet.contains(yieldTblUpR.hdr_peg_no())) {
					yieldTblUpR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					yieldTblUpR.hdr_mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
					yieldTblUpR.old_mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
					yieldTblUpR.mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
					yieldTblUpL.add(yieldTblUpR);
				}
			}
			if (!yieldTblUpL.isEmpty()) {
				MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd04 tblUpdOpe = MSBCL_MfgInstTblRegService.crtMfgInstTblReg_Upd04();
				tblUpdOpe.up0().addAll(yieldTblUpL);
				tblUpdOpe.exec();
			}
			
			// 副産品予定
			MCList<MfgInstTblReg_Upd07_DtlByProdR> byProdTblUpL = MCList.create(MfgInstTblReg_Upd07_DtlByProdR.class);
			for (MfgInstTblReg_Upd07_DtlByProdR byProdTblUpR : mitUpd07.up0()) {
				if (stsSavHdrSet.contains(byProdTblUpR.hdr_peg_no())) {
					byProdTblUpR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					byProdTblUpR.hdr_mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
					byProdTblUpR.mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
					byProdTblUpR.old_mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
					byProdTblUpL.add(byProdTblUpR);
				}
			}
			if (!byProdTblUpL.isEmpty()) {
				MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd07 tblUpdOpe = MSBCL_MfgInstTblRegService.crtMfgInstTblReg_Upd07();
				tblUpdOpe.up0().addAll(byProdTblUpL);
				tblUpdOpe.exec();
			}

			// 工数予定（製造状況区分の上書きのみ）
			for (MfgInstTblReg_Upd06_DtlWkR wkTblUpR : mitUpd06.up0()) {
				if (stsSavHdrSet.contains(wkTblUpR.hdr_peg_no())) {
					wkTblUpR.hdr_mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
					wkTblUpR.mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
				}
			}
		}
		
		protected MCList<MfgInstTblReg_Upd05_HdrR> callLotInhSrv() {
			if (!isSame(getSysParm("LOT_INH_ENABLE_FLG"), "1")) {
				return null;
			}
			
			MCList<MfgInstReg_Upd01_HdrR> lotInhL = up0().subList(r -> isLotInhTgt(r));
			if (!lotInhL.isEmpty()) {
				// ロット継承サービスの呼び出し
				MSBFL_LotInhService.LotInh_Upd02 lotInhSrv = MSBFL_LotInhService.crtLotInh_Upd02();
				for (MfgInstReg_Upd01_HdrR lotInhR : lotInhL) {
					LotInh_Upd02_Cnd01R tmpR = LotInh_Upd02_Cnd01R.create();
					tmpR.peg_no(lotInhR.peg_no());
					tmpR.setAttributes(lotInhR);
					tmpR.itm_mfg_inst_no(lotInhR.itm_mfg_inst_no());
					tmpR.silent_flg(isSilentOnLotInh(lotInhR));
					tmpR.no_exception_flg(isNotThrowExOnLotInh(lotInhR));
					lotInhSrv.up0().add(tmpR);
				}
				lotInhSrv.exec();
				
				// エラー発生時、製造指図状況を指図済から指図保存にするリストを返す
				MCList<MfgInstTblReg_Upd05_HdrR> errL = MCList.create(MfgInstTblReg_Upd05_HdrR.class);
				Set<MCNumber> errSet = new HashSet<>();
				for (LotInh_Upd02_Cnd01R r : lotInhSrv.down0()) {
					if (r.err_flg()) {
						MfgInstReg_Upd01_HdrR hdrR = _hdrCache.getCache(r.peg_no());
						hdrR.lot_inh_err_flg(true);
						errSet.add(r.peg_no());
						if (MAC_DATA_CRUD_TYP.isDEL(hdrR.mfg_inst_data_crud_typ())) {
							continue;
						}
						
						MfgInstTblReg_Upd05_HdrR tmpR = MfgInstTblReg_Upd05_HdrR.create();
						tmpR.alloc_tgt_cnt(0);
						tmpR.alloc_success_cnt(0);
						tmpR.alloc_failure_cnt(0);
						tmpR.sts_sav_flg(true);
						tmpR.hdr_peg_no(r.peg_no());
						errL.add(tmpR);
					}
				}
				if (!errSet.isEmpty()) {
					for (MfgInstReg_Upd01_DtlOperR operR : up1()) {
						if (errSet.contains(operR.hdr_peg_no())) {
							operR.lot_inh_err_flg(true);
						}
					}
				}
				return errL;
			}
			return null;
		}
		
		protected boolean isLotInhTgt(MfgInstReg_Upd01_HdrR r) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.itm_mfg_inst_data_crud_typ())) {
				return false;
			}
			// 出来高ロットが存在しない場合は実行しない
			if (MSC_MFG_STS_TYP.isYET(r.mfg_sts_typ())
					|| MSC_MFG_STS_TYP.isSAV(r.mfg_sts_typ())
					|| MSC_MFG_STS_TYP.isORD(r.mfg_sts_typ())) {
				if (MAC_MFG_INST_UNIT_TYP.isITM(r.mfg_inst_unit_typ()) && isNullOrNullVal(r.lot_no())) {
					return false;
				}
			}
			return true;
		}
		
		protected boolean isSilentOnLotInh(MfgInstReg_Upd01_HdrR r) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.mfg_inst_data_crud_typ())) {
				return true;
			}
			return false;
		}
		
		protected boolean isNotThrowExOnLotInh(MfgInstReg_Upd01_HdrR r) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.mfg_inst_data_crud_typ())) {
				return true;
			}
			if (MSC_MFG_STS_TYP.isYET(r.mfg_sts_typ()) || MSC_MFG_STS_TYP.isSAV(r.mfg_sts_typ())) {
				return true;
			}
			if (r.is_src_alloc_flg()) {
				return true;
			}
			if (isSame(MCSys.request.reqSrcId(), "MSBCP1040")) {
				return true;
			}
			return false;
		}
		protected void callInstComRegSrv() {

			// ヘッダの製造状況区分が着手中のレコードのみを処理対象とする
			MCList<MfgInstReg_Upd01_HdrR> hdrL = up0().subList(MfgInstReg_Upd01_HdrR.$mfg_sts_typ, MSC_MFG_STS_TYP.STT.value());
			
			if (hdrL.isEmpty()) {
				return;
			}
			
			// 製造指図・実績共通処理の指図訂正時実績残更新
			MSBCL_MfgInstActComService.MfgInstActCom_Upd03 o = MSBCL_MfgInstActComService.crtMfgInstActCom_Upd03();
			addAll(o.up0(), hdrL, createMap_MfgInstActCom_Upd03_HdrR_MfgInstReg_Upd01_HdrR());
			
			o.exec();
		}
		
		/**
		 * 投入の上り電文から、自給品、指図書のみ品を除外します
		 * @return
		 */
		protected MCList<MfgInstReg_Upd01_DtlInptR> getInptActRemTgt() {
			MCList<MfgInstReg_Upd01_DtlInptR> retL = MCList.create(MfgInstReg_Upd01_DtlInptR.class);
			for (MfgInstReg_Upd01_DtlInptR r : up2()) {
				if (MAC_PROV_TYP.isSS(r.prov_typ())
						|| MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())) {
					continue;
				}
				retL.add(r);
			}
			return retL;
		}
		
		protected Map_MfgInstActCom_Upd03_HdrR_MfgInstReg_Upd01_HdrR<MfgInstActCom_Upd03_HdrR,MfgInstReg_Upd01_HdrR> createMap_MfgInstActCom_Upd03_HdrR_MfgInstReg_Upd01_HdrR() {
			return new Map_MfgInstActCom_Upd03_HdrR_MfgInstReg_Upd01_HdrR<MfgInstActCom_Upd03_HdrR, MfgInstReg_Upd01_HdrR>();
		}

		public class Map_MfgInstActCom_Upd03_HdrR_MfgInstReg_Upd01_HdrR<D extends MfgInstActCom_Upd03_HdrR, S extends MfgInstReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Upd03_HdrR.$mfg_inst_no, MfgInstReg_Upd01_HdrR.$mfg_inst_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// 打切済の製造指図ＮＯハッシュセットに存在する場合は打切フラグをtrue
				dest.abort_flg(_abortMfgInstNo.contains(src.mfg_inst_no()));
			}
		}

		protected void callHstExtUpd() {
			mapUpContainers(REH);
			rehUpd01.exec();
		}
		
		protected void callMainLotInf() {
			MSBCL_MfgInstActComService.MfgInstActCom_Upd02 o = MSBCL_MfgInstActComService.crtMfgInstActCom_Upd02();
			addAll(o.up0(), up0(), createMap_MfgInstActCom_Upd02_CndR_MfgInstReg_Upd01_HdrR());
			o.exec();
		}

		protected Map_MfgInstActCom_Upd02_CndR_MfgInstReg_Upd01_HdrR<MfgInstActCom_Upd02_CndR,MfgInstReg_Upd01_HdrR> createMap_MfgInstActCom_Upd02_CndR_MfgInstReg_Upd01_HdrR() {
			return new Map_MfgInstActCom_Upd02_CndR_MfgInstReg_Upd01_HdrR<MfgInstActCom_Upd02_CndR, MfgInstReg_Upd01_HdrR>();
		}

		public class Map_MfgInstActCom_Upd02_CndR_MfgInstReg_Upd01_HdrR<D extends MfgInstActCom_Upd02_CndR, S extends MfgInstReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Upd02_CndR.$itm_mfg_inst_no, MfgInstReg_Upd01_HdrR.$itm_mfg_inst_no);

			}
		}
		
		/**
		 * 仕掛更新処理を呼び出す
		 */
		protected void callWipUpdService() {
			// 工程単位製造指図で、製造完了済みの指図を更新した場合に呼び出す。
			MCList<MfgInstReg_Upd01_HdrR> hdrL = MCList.create(MfgInstReg_Upd01_HdrR.class);
			for (MfgInstReg_Upd01_HdrR r : up0()) {
				// データ更新区分：更新 以外、または、製造指図単位区分：工程単位 以外の場合は処理対象外とする。
				if (!MAC_DATA_CRUD_TYP.isUPD(r.mfg_inst_data_crud_typ())
						|| !MAC_MFG_INST_UNIT_TYP.isOPER(r.mfg_inst_unit_typ())) {
					continue;
				}
				// 指図打切が変更されている場合は処理対象とする。
				if (!isSame(r.inst_abort_flg(), r.old_inst_abort_flg())) {
					hdrL.add(r);
					continue;
				}
				MCList<MfgInstReg_Upd01_DtlOperR> operL = up1().subList(MfgInstReg_Upd01_DtlOperR.$hdr_peg_no, r.peg_no());
				for (MfgInstReg_Upd01_DtlOperR operR : operL) {
					// 工程打切が変更されている行が含まれる場合は処理対象とする。
					if (!isSame(operR.old_inst_abort_flg(), operR.inst_abort_flg())) {
						hdrL.add(r);
						break;
					}
				}
			}

			if (hdrL.isEmpty()) {
				return;
			}

			MSBCL_MfgInstActComService.MfgInstActCom_Upd05 o = MSBCL_MfgInstActComService
					.crtMfgInstActCom_Upd05();
			addAll(o.up0(), hdrL, createMap_MfgInstActCom_Upd05_HdrR_MfgInstReg_Upd01_HdrR());
			o.exec();
		}

		protected Map_MfgInstActCom_Upd05_HdrR_MfgInstReg_Upd01_HdrR<MfgInstActCom_Upd05_HdrR,MfgInstReg_Upd01_HdrR> createMap_MfgInstActCom_Upd05_HdrR_MfgInstReg_Upd01_HdrR() {
			return new Map_MfgInstActCom_Upd05_HdrR_MfgInstReg_Upd01_HdrR<MfgInstActCom_Upd05_HdrR, MfgInstReg_Upd01_HdrR>();
		}

		public class Map_MfgInstActCom_Upd05_HdrR_MfgInstReg_Upd01_HdrR<D extends MfgInstActCom_Upd05_HdrR, S extends MfgInstReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Upd05_HdrR.$itm_mfg_inst_no, MfgInstReg_Upd01_HdrR.$itm_mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd05_HdrR.$mfg_mtd_typ, MfgInstReg_Upd01_HdrR.$mfg_mtd_typ);
				addColumnPathMap(MfgInstActCom_Upd05_HdrR.$mfg_inst_unit_typ, MfgInstReg_Upd01_HdrR.$mfg_inst_unit_typ);
			}
		}
		
		/**
		 * 投入版切替更新サービスを実行する。
		 */
		protected void callVerChgSrv() {
			if (!isSame(getSysParm("VER_ENABLE_FLG"),"1")) {
				return;
			}
			MSBCL_VerChgUpdService.VerChg_Upd01 o = MSBCL_VerChgUpdService
					.crtVerChg_Upd01();
			
			for (MfgInstReg_Upd01_DtlInptR inptR : up2()) {
				// 新規または更新時は変更後の値で版切替更新
				// ただし、更新の場合でもnot_frst_inst_can_flgがオンの場合は削除時と同じ振舞いのため、対象としない
				if (MAC_DATA_CRUD_TYP.isCRT(inptR.data_crud_typ())
						|| (MAC_DATA_CRUD_TYP.isUPD(inptR.data_crud_typ()) && !inptR.not_frst_inst_can_flg())) {
					if (!isNull(inptR.ver_no())) {
						MfgInstReg_Upd01_HdrR hdrR = _hdrCache.getCache(inptR.hdr_peg_no());
						VerChgUpd_DtlR tmp = VerChgUpd_DtlR.create();
						tmp.par_itm_cd(hdrR.itm_cd());
						tmp.par_itm_sub1(hdrR.itm_sub1());
						tmp.par_itm_sub2(hdrR.itm_sub2());
						tmp.par_itm_sub3(hdrR.itm_sub3());
						tmp.chd_itm_cd(inptR.itm_cd());
						tmp.chd_itm_sub1(inptR.itm_sub1());
						tmp.chd_itm_sub2(inptR.itm_sub2());
						tmp.chd_itm_sub3(inptR.itm_sub3());
						tmp.ver_no(inptR.ver_no());
						tmp.bom_ptn(hdrR.bom_ptn());
						tmp.wg_cd(hdrR.mfg_loc_wg_cd());
						tmp.site_cd(hdrR.mfg_loc_site_cd());
						tmp.setAttributes(hdrR);
						o.up0().add(tmp);
					}
				}
				// 更新時または削除時は変更後の値で版切替更新
				// ※削除時かどうかの判断には本来not_frst_inst_can_flgも見る必要があるが、今回はisUPDに含まれるため、不要
				if (MAC_DATA_CRUD_TYP.isUPD(inptR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(inptR.data_crud_typ())) {
					if (!isNull(inptR.old_ver_no())) {
						MfgInstReg_Upd01_HdrR hdrR = _hdrCache.getCache(inptR.hdr_peg_no());
						VerChgUpd_DtlR tmp = VerChgUpd_DtlR.create();
						tmp.par_itm_cd(hdrR.itm_cd());
						tmp.par_itm_sub1(hdrR.itm_sub1());
						tmp.par_itm_sub2(hdrR.itm_sub2());
						tmp.par_itm_sub3(hdrR.itm_sub3());
						tmp.chd_itm_cd(inptR.itm_cd());
						tmp.chd_itm_sub1(inptR.itm_sub1());
						tmp.chd_itm_sub2(inptR.itm_sub2());
						tmp.chd_itm_sub3(inptR.itm_sub3());
						// 版ＮＯと構成パタンは変更される場合があるため、更新前の値を使用する
						tmp.ver_no(inptR.old_ver_no());
						tmp.bom_ptn(hdrR.old_bom_ptn());
						tmp.wg_cd(hdrR.mfg_loc_wg_cd());
						tmp.site_cd(hdrR.mfg_loc_site_cd());
						tmp.setAttributes(hdrR);
						o.up0().add(tmp);
					}
				}
			}
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		/**
		 * プッシュ通知を実行する。
		 */
		protected void callPushNtc() {
			MCList<MfgInstReg_Upd01_HdrR> insInstAprvRqstL = MCList.create(MfgInstReg_Upd01_HdrR.class);
			MCList<MfgInstReg_Upd01_HdrR> delInstAprvRqstL = MCList.create(MfgInstReg_Upd01_HdrR.class);
			
			for(MfgInstReg_Upd01_HdrR r : up0()) {
				if (r.aprv_flg() || r.old_aprv_flg()) {
					if(MSC_MFG_STS_TYP.isORD(r.mfg_sts_typ()) || MSC_MFG_STS_TYP.isORD(r.old_mfg_sts_typ())) {
						if(MAC_DATA_CRUD_TYP.isDEL(r.mfg_inst_data_crud_typ()) || r.not_frst_inst_can_flg()) {
							delInstAprvRqstL.add(r);
						}
						else if (r.inst_abort_flg()) {
							delInstAprvRqstL.add(r);
						}
						else if (r.old_inst_abort_flg()) {
							insInstAprvRqstL.add(r);
						}
						else if (MSC_MFG_APRV_STS_TYP.isINST_OPN(r.mfg_aprv_sts_typ())
								&& MSC_MFG_STS_TYP.isORD(r.mfg_sts_typ())
								&& !isSame(r.mfg_sts_typ(), r.old_mfg_sts_typ())) {
							insInstAprvRqstL.add(r);
						}
						else if(!isSame(r.old_mfg_aprv_role_cd(), r.mfg_aprv_role_cd())) {
							// 承認役割が変わった場合
							delInstAprvRqstL.add(r);
						}
					}
				}
			}
			
			// 製造指図承認依頼
			MCIndexKey insKey = insInstAprvRqstL.createIndex(MfgInstReg_Upd01_HdrR.$mfg_aprv_role_cd, MfgInstReg_Upd01_HdrR.$inst_dt);
			for(MfgInstReg_Upd01_HdrR r : insInstAprvRqstL.groupBy(MfgInstReg_Upd01_HdrR.$mfg_aprv_role_cd, MfgInstReg_Upd01_HdrR.$inst_dt)) {
				MCList<MfgInstReg_Upd01_HdrR> tmpL = insInstAprvRqstL.subList(insKey, r.mfg_aprv_role_cd(), r.inst_dt());
				MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();

				MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.MFG_INST_APRV_RQST);
				info.setMsg(new MCMessage(MSBCL1059, tmpL.size()));
				info.addAprvRole(r.mfg_aprv_role_cd(), nvl(r.inst_dt(), getToday()));
				info.addScrBind(MSC_MFG_INST_LIST_REG_OPE.OPE_APRV.value());
				
				mgr.exec();
			}
			
			// 製造指図承認依頼の取消
			MCIndexKey delKey = delInstAprvRqstL.createIndex(MfgInstReg_Upd01_HdrR.$old_mfg_aprv_role_cd, MfgInstReg_Upd01_HdrR.$old_inst_dt);
			for(MfgInstReg_Upd01_HdrR r : delInstAprvRqstL.groupBy(MfgInstReg_Upd01_HdrR.$old_mfg_aprv_role_cd, MfgInstReg_Upd01_HdrR.$old_inst_dt)) {
				MCList<MfgInstReg_Upd01_HdrR> tmpL = delInstAprvRqstL.subList(delKey, r.old_mfg_aprv_role_cd(), r.old_inst_dt());
				MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();

				MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.MFG_INST_APRV_RQST);
				info.setMsg(new MCMessage(MSBCL1060, tmpL.size()));
				info.addAprvRole(r.old_mfg_aprv_role_cd(), nvl(r.old_inst_dt(), getToday()));

				mgr.exec();
			}
		}
		
		protected void callLotAprvStsUpdSrv() {
			if (!isSame(getSysParm("MFG_APRV_ENABLE_FLG"),"1")) {
				return;
			}
			MSBFL_LotService.Lot_Upd03 o = MSBFL_LotService.crtLot_Upd03();
			for (MfgInstReg_Upd01_HdrR hdrR : up0()) {
				if (hdrR.aprv_flg() || hdrR.old_aprv_flg()) {
					Lot_Upd03_CndR oUpR = Lot_Upd03_CndR.create();
					copy(oUpR, hdrR, createMap_Lot_Upd03_CndR_MfgInstReg_Upd01_HdrR());
					o.up0().add(oUpR);
				}
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected Map_Lot_Upd03_CndR_MfgInstReg_Upd01_HdrR<Lot_Upd03_CndR,MfgInstReg_Upd01_HdrR> createMap_Lot_Upd03_CndR_MfgInstReg_Upd01_HdrR() {
			return new Map_Lot_Upd03_CndR_MfgInstReg_Upd01_HdrR<Lot_Upd03_CndR, MfgInstReg_Upd01_HdrR>();
		}

		public class Map_Lot_Upd03_CndR_MfgInstReg_Upd01_HdrR<D extends Lot_Upd03_CndR, S extends MfgInstReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd03_CndR.$itm_mfg_inst_no, MfgInstReg_Upd01_HdrR.$itm_mfg_inst_no);
			}
		}
		
		protected void callSloStsInsSrv() {
			MSBBL_SloStsRegService.SloSts_Ins02 o = MSBBL_SloStsRegService.crtSloSts_Ins02();
			
			for (MfgInstReg_Upd01_HdrR hdrR : up0()) {
				if (isCallSloStsInsSrv(hdrR)) {
					SloSts_DtlR oUpR = SloSts_DtlR.create();
					copy(oUpR, hdrR, createMap_SloSts_DtlR_MfgInstReg_Upd01_HdrR());
					o.up0().add(oUpR);
				}
			}
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected void callYieldSchdSrvForLotUpd() {

			// 処理対象のヘッダを抽出
			MCList<MfgInstReg_Upd01_HdrR> hdrL = getHdrForLotUpd();
			if (hdrL.isEmpty()) {
				return;
			}
			
			// 処理対象の品目製造指図に紐づく、上り電文に存在しない出来高予定（指図済のみ）を抽出
			MCList<MST_YIELD_SCHD_R> yieldL = getYieldSchdForLotUpd(hdrL);
			if (yieldL.isEmpty()) {
				return;
			}
			
			// 出来高予定登録オペレーションの上り電文を編集
			MCList<MfgInstTblReg_Upd04_DtlYieldR> upL = getYieldUpForLotUpd(hdrL, yieldL);
			
			// リビジョン管理方式のため、製造指図を空更新
			MCList<MST_MFG_INST_R> mfgInstL = getMfgInstForLotUpd(yieldL);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder upL_bldr = MCQueryApiBuilder.create(t);
			upL_bldr.setSet(t.mfg_inst_no);
			dbUpdateKey("MSBCL6000_MST_MFG_INST_U02", mfgInstL, upL_bldr);
			
			// 出来高予定登録オペレーションの実行
			MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd04 ope = MSBCL_MfgInstTblRegService.crtMfgInstTblReg_Upd04();
			ope.up0().addAll(upL);
			ope.exec();
		}
		
		protected MCList<MfgInstReg_Upd01_HdrR> getHdrForLotUpd() {
			MCList<MfgInstReg_Upd01_HdrR> hdrL = MCList.create(MfgInstReg_Upd01_HdrR.class);
			
			for (MfgInstReg_Upd01_HdrR hdrR : up0()) {
				// 工程単位製造指図のみ
				if (!MAC_MFG_INST_UNIT_TYP.isOPER(hdrR.mfg_inst_unit_typ())) {
					continue;
				}
				// 更新時のみ
				if (!MAC_DATA_CRUD_TYP.isUPD(hdrR.itm_mfg_inst_data_crud_typ())) {
					continue;
				}
				// ロット・サブロットが新規発番または変更されている場合のみ
				if (isSame(hdrR.lot_no(), hdrR.old_lot_no()) && isSame(hdrR.sublot_no(), hdrR.old_sublot_no())) {
					continue;
				}
				hdrL.add(hdrR);
			}
			
			return hdrL;
		}
		
		protected MCList<MST_YIELD_SCHD_R> getYieldSchdForLotUpd(MCList<MfgInstReg_Upd01_HdrR> hdrL) {

			// ヘッダの品目製造指図に紐づく出来高予定（指図済）を抽出
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			MSVT_YIELD_SCHD_PR_R t1 = MSVT_YIELD_SCHD_PR_R.create("T1");
			MCQueryApiBuilder retL_bldr = MCQueryApiBuilder.create(t);
			MCList<MST_YIELD_SCHD_R> yieldL = MCList.create(MST_YIELD_SCHD_R.class);
			retL_bldr.addInnerJoin(t1, t.yield_schd_no.eq(t1.yield_schd_no));
			retL_bldr.setWhere(t.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
			retL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			retL_bldr.addWhereWithAnd(t.yield_typ.neq(value(MAC_YIELD_TYP.BYPROD.value())));
			retL_bldr.addWhereWithAnd(t1.mfg_sts_typ.eq(value(MSC_MFG_STS_TYP.ORD.value())));
			dbSelect("MSBCL6000_MST_YIELD_SCHD_S08", yieldL, retL_bldr, hdrL);
			
			// 上り電文に存在する出来高予定を除外
			MCList<MST_YIELD_SCHD_R> tgtL = MCList.create(MST_YIELD_SCHD_R.class);
			MCIndexKey yieldKey = up4().createIndex(MfgInstReg_Upd01_DtlYieldR.$yield_schd_no);
			for (MST_YIELD_SCHD_R r : yieldL) {
				MfgInstReg_Upd01_DtlYieldR yieldR = up4().getFirst(yieldKey, r.yield_schd_no());
				if (isNull(yieldR)) {
					tgtL.add(r);
				}
			}
			
			return tgtL;
		}
		
		protected MCList<MfgInstTblReg_Upd04_DtlYieldR> getYieldUpForLotUpd(MCList<MfgInstReg_Upd01_HdrR> hdrL, MCList<MST_YIELD_SCHD_R> yieldL) {
			MCList<MfgInstTblReg_Upd04_DtlYieldR> upL = MCList.create(MfgInstTblReg_Upd04_DtlYieldR.class);
			
			MCIndexKey hdrKey = hdrL.createIndex(MfgInstReg_Upd01_HdrR.$itm_mfg_inst_no);
			
			for (MST_YIELD_SCHD_R yieldR : yieldL) {
				MfgInstReg_Upd01_HdrR hdrR = hdrL.getFirst(hdrKey, yieldR.itm_mfg_inst_no());
				
				MfgInstTblReg_Upd04_DtlYieldR upR = MfgInstTblReg_Upd04_DtlYieldR.create();
				upR.mfg_mtd_typ(hdrR.mfg_mtd_typ());
				upR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				upR.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
				upR.yield_schd_no(yieldR.yield_schd_no());
				upR.mfg_inst_no(yieldR.mfg_inst_no());
				upR.itm_mfg_inst_no(yieldR.itm_mfg_inst_no());
				upR.oper_inst_no(yieldR.oper_inst_no());
				upR.io_schd_pr_no(yieldR.io_schd_pr_no());
				upR.yield_typ(yieldR.yield_typ());
				upR.schd_tm(yieldR.schd_tm());
				upR.itm_cd(yieldR.itm_cd());
				upR.itm_sub1(yieldR.itm_sub1());
				upR.itm_sub2(yieldR.itm_sub2());
				upR.itm_sub3(yieldR.itm_sub3());
				upR.trd_unit_yield_qty(yieldR.trd_unit_yield_qty());
				upR.trd_unit_cd(yieldR.trd_unit_cd());
				upR.base_unit_yield_qty(yieldR.base_unit_yield_qty());
				upR.base_unit_cd(yieldR.base_unit_cd());
				upR.sno1(yieldR.sno1());
				upR.sno2(yieldR.sno2());
				upR.sno3(yieldR.sno3());
				upR.sno4(yieldR.sno4());
				upR.strg_loc_cd(yieldR.strg_loc_cd());
				upR.strg_str_ln_cd(yieldR.strg_str_ln_cd());
				upR.disp_seq(yieldR.disp_seq());
				upR.intr_rmrks(yieldR.intr_rmrks());
				upR.inst_rpt_rmrks(yieldR.inst_rpt_rmrks());
				upR.insp_cnt_rmrks(yieldR.insp_cnt_rmrks());
				upR.sub_char1(yieldR.sub_char1());
				upR.sub_char2(yieldR.sub_char2());
				upR.sub_char3(yieldR.sub_char3());
				upR.lot_no(hdrR.lot_no());
				upR.sublot_no(hdrR.sublot_no());
				upL.add(upR);
			}
			
			return upL;
		}
		
		protected MCList<MST_MFG_INST_R> getMfgInstForLotUpd(MCList<MST_YIELD_SCHD_R> yieldL) {
			MCList<MST_MFG_INST_R> mfgInstL = MCList.create(MST_MFG_INST_R.class);
			
			MCList<MST_YIELD_SCHD_R> grpL = yieldL.groupBy(MST_YIELD_SCHD_R.$mfg_inst_no);
			for (MST_YIELD_SCHD_R grpR : grpL) {
				MST_MFG_INST_R mfgInstR = MST_MFG_INST_R.create();
				mfgInstR.mfg_inst_no(grpR.mfg_inst_no());
				mfgInstL.add(mfgInstR);
			}
			
			return mfgInstL;
		}
		
		protected boolean isCallSloStsInsSrv(MfgInstReg_Upd01_HdrR hdrR) {
			if (MSC_MFG_MTD_TYP.isINTNL(hdrR.mfg_mtd_typ())) {
				if (MSC_MFG_STS_TYP.isORD(hdrR.old_mfg_sts_typ())
							|| MSC_MFG_STS_TYP.isORD(hdrR.mfg_sts_typ())) {
					return !isNull(hdrR.itm_mfg_inst_data_crud_typ());
				}
			}
			return false;
		}
		
		protected Map_SloSts_DtlR_MfgInstReg_Upd01_HdrR<SloSts_DtlR,MfgInstReg_Upd01_HdrR> createMap_SloSts_DtlR_MfgInstReg_Upd01_HdrR() {
			return new Map_SloSts_DtlR_MfgInstReg_Upd01_HdrR<SloSts_DtlR, MfgInstReg_Upd01_HdrR>();
		}

		public class Map_SloSts_DtlR_MfgInstReg_Upd01_HdrR<D extends SloSts_DtlR, S extends MfgInstReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SloSts_DtlR.$mfg_inst_no, MfgInstReg_Upd01_HdrR.$mfg_inst_no);
				addColumnPathMap(SloSts_DtlR.$itm_cd, MfgInstReg_Upd01_HdrR.$itm_cd);
				addColumnPathMap(SloSts_DtlR.$itm_sub1, MfgInstReg_Upd01_HdrR.$itm_sub1);
				addColumnPathMap(SloSts_DtlR.$itm_sub2, MfgInstReg_Upd01_HdrR.$itm_sub2);
				addColumnPathMap(SloSts_DtlR.$itm_sub3, MfgInstReg_Upd01_HdrR.$itm_sub3);
				addColumnPathMap(SloSts_DtlR.$sno1, MfgInstReg_Upd01_HdrR.$sno1);
				addColumnPathMap(SloSts_DtlR.$sno2, MfgInstReg_Upd01_HdrR.$sno2);
				addColumnPathMap(SloSts_DtlR.$sno3, MfgInstReg_Upd01_HdrR.$sno3);
				addColumnPathMap(SloSts_DtlR.$sno4, MfgInstReg_Upd01_HdrR.$sno4);
				addColumnPathMap(SloSts_DtlR.$st_schd_tm, MfgInstReg_Upd01_HdrR.$st_schd_tm);
				addColumnPathMap(SloSts_DtlR.$end_schd_tm, MfgInstReg_Upd01_HdrR.$end_schd_tm);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (MAC_DATA_CRUD_TYP.isCRT(src.itm_mfg_inst_data_crud_typ())) {
					dest.slo_sts_typ(MSC_SLO_STS_TYP.MFG_INST.value());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(src.itm_mfg_inst_data_crud_typ())) {
					if (src.inst_abort_flg()) {
						dest.slo_sts_typ(MSC_SLO_STS_TYP.MFG_ABORT.value());
					}
					else if (src.old_inst_abort_flg()) {
						dest.slo_sts_typ(MSC_SLO_STS_TYP.MFG_ABORT_CAN.value());
					}
					else {
						if (MSC_MFG_STS_TYP.isSAV(src.old_mfg_sts_typ())
								&& MSC_MFG_STS_TYP.isORD(src.mfg_sts_typ())) {
							dest.slo_sts_typ(MSC_SLO_STS_TYP.MFG_INST.value());
						}
						else if (MSC_MFG_STS_TYP.isORD(src.old_mfg_sts_typ())
								&& MSC_MFG_STS_TYP.isORD(src.mfg_sts_typ())) {
							dest.slo_sts_typ(MSC_SLO_STS_TYP.MFG_INST_UPD.value());
						}
						else if (MSC_MFG_STS_TYP.isORD(src.old_mfg_sts_typ())
								&& MSC_MFG_STS_TYP.isSAV(src.mfg_sts_typ())) {
							dest.slo_sts_typ(MSC_SLO_STS_TYP.MFG_INST_CAN.value());
						}
					}
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(src.itm_mfg_inst_data_crud_typ()) || src.not_frst_inst_can_flg()) {
					dest.slo_sts_typ(MSC_SLO_STS_TYP.MFG_INST_CAN.value());
				}
				
				// 以下の項目は、登録・更新の場合のみ設定する
				if (MSC_SLO_STS_TYP.isMFG_INST(dest.slo_sts_typ())
						|| MSC_SLO_STS_TYP.isMFG_INST_UPD(dest.slo_sts_typ())) {
					dest.unit_cd(src.base_unit_cd());
					// 指図数ではなく出来高予定数を渡す
					// ※受注の出庫予定からオーダ生成された場合、出庫予定数はとしては指図数よりも出来高予定数のほうが近い値なので
					dest.qty(src.base_unit_yield_qty());
					dest.biz_tm(src.inst_dt());
				}
			}
		}
		
		protected void callOrdStsUpdSrv() {
			// 品目オーダ・工程オーダの更新
			MSBCL_OrdRegService.Ord_Upd04 itmOrd = MSBCL_OrdRegService.crtOrd_Upd04();
			MSBCL_OrdRegService.Ord_Upd05 operOrd = MSBCL_OrdRegService.crtOrd_Upd05();

			for (MCList<MfgInstReg_Upd01_HdrR> gl : up0().groupList(MfgInstReg_Upd01_HdrR.$itm_ord_no)) {
				if (gl.get(0).is_src_outsrc_srv_flg()) {
					continue;
				}
				Ord_Upd04_DtlR oUp04R = Ord_Upd04_DtlR.create();
				copy(oUp04R, gl.get(0), createMap_Ord_Upd04_DtlR_MfgInstReg_Upd01_HdrR());
				itmOrd.up0().add(oUp04R);

				Ord_Upd05_DtlR oUp05R = Ord_Upd05_DtlR.create();
				copy(oUp05R, gl.get(0), createMap_Ord_Upd05_DtlR_MfgInstReg_Upd01_HdrR());
				operOrd.up0().add(oUp05R);
			}
			itmOrd.exec();
			operOrd.exec();
		}
		
		/**
		 * 製造指図送信ＩＦサービスを呼び出す
		 * @param isNotFrstInstCan
		 */
		protected void callMfgInstSendIf(Boolean isNotFrstInstCan) {
			if (isNotFrstInstCan) {
				callMfgInstSendIfMain(getDtlOperLForNotFrstInstCan());
			} else {
				callMfgInstSendIfMain(getDtlOperL());
			}
		}
		
		protected boolean isOldMfgInstSendIfDataNullOrDel(MfgInstReg_Upd01_DtlOperR operR) {
			MST_OPER_INST_SEND_IF_R oldOperIfR = _operSendIfL.getFirst(_operSendIfIdx, operR.oper_inst_no());
			MST_YIELD_SCHD_SND_IF_R oldYieldIfR = _yieldSchdSendIfL.getFirst(_yieldSchdSendIfIdx, operR.oper_inst_no());
			MST_INPT_SCHD_SEND_IF_R oldInptIfR = _inptSchdSendIfL.getFirst(_inptSchdSendIfIdx, operR.oper_inst_no());
			MST_WK_SCHD_SEND_IF_R oldWkIfR = _wkSchdSendIfL.getFirst(_wkSchdSendIfIdx, operR.oper_inst_no());
			
			if ((isNull(oldOperIfR) || MAC_DATA_CRUD_TYP.isDEL(oldOperIfR.data_crud_typ()))
					&& (isNull(oldYieldIfR) || MAC_DATA_CRUD_TYP.isDEL(oldYieldIfR.data_crud_typ()))
					&& (isNull(oldInptIfR) || MAC_DATA_CRUD_TYP.isDEL(oldInptIfR.data_crud_typ()))
					&& (isNull(oldWkIfR) || MAC_DATA_CRUD_TYP.isDEL(oldWkIfR.data_crud_typ()))) {
				return true;
			}
			return false;
		}
		
		/**
		 * 製造指図送信ＩＦサービスを呼び出す（メイン処理）
		 */
		protected void callMfgInstSendIfMain(MCList<MfgInstReg_Upd01_DtlOperR> subUp1L) {
			if (subUp1L.isEmpty()) {
				return;
			}
			
			MCList<MfgInstReg_Upd01_DtlInptR> addInptL = MCList.create(MfgInstReg_Upd01_DtlInptR.class);
			MCList<MfgInstReg_Upd01_DtlInptR> inptL = MCList.create(MfgInstReg_Upd01_DtlInptR.class);
			for (MfgInstTblReg_Upd05_DtlInptR r : mitUpd05.down0()) {
				MfgInstReg_Upd01_DtlInptR addInptR = MfgInstReg_Upd01_DtlInptR.create();
				addInptR.oper_inst_no(r.oper_inst_no());
				addInptR.inpt_schd_no(r.inpt_schd_no());
				addInptR.data_crud_typ(r.data_crud_typ());
				addInptL.add(addInptR);
			}
			if (addInptL.isEmpty()) {
				inptL.addAll(up2());
			}
			else {
				inptL.addAll(addInptL);
			}
			
			MCIndexKey up1Idx = subUp1L.createIndex(MfgInstReg_Upd01_DtlOperR.$hdr_peg_no);
			MCIndexKey up2Idx = inptL.createIndex(MfgInstReg_Upd01_DtlInptR.$oper_inst_no);
			MCIndexKey up3Idx = up3().createIndex(MfgInstReg_Upd01_DtlWkR.$oper_inst_no);
			MCIndexKey up4Idx = up4().createIndex(MfgInstReg_Upd01_DtlYieldR.$oper_inst_no);
			MCIndexKey up5Idx = up5().createIndex(MfgInstReg_Upd01_DtlByProdR.$oper_inst_no);
			MSLAL_MfgInstSendIfService.MfgInstSendIf_Upd01 ope = MSLAL_MfgInstSendIfService.crtMfgInstSendIf_Upd01();
			String strCrudTyp, strCrudTypInit;
			for (MfgInstReg_Upd01_HdrR hdrR : up0()) {
				if (!MAC_DATA_CRUD_TYP.isDEL(hdrR.mfg_inst_data_crud_typ()) && hdrR.aprv_flg()) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.mfg_inst_data_crud_typ()) && hdrR.old_aprv_flg()) {
					continue;
				}
				strCrudTyp = null;
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.mfg_inst_data_crud_typ()) || hdrR.not_frst_inst_can_flg() || MSC_MFG_STS_TYP.isSAV(hdrR.mfg_sts_typ())) {
					if (MSC_MFG_STS_TYP.isORD(hdrR.old_mfg_sts_typ()) || MSC_MFG_STS_TYP.isCMPL(hdrR.old_mfg_sts_typ())) {
						// 指図済→指図保存　または　完了→指図保存（打切取消）の場合は削除
						strCrudTyp = MAC_DATA_CRUD_TYP.DEL.value();
					}
				}
				// 指図打切の場合、訂正とする。指図保存の場合は送信しない
				else if (hdrR.inst_abort_flg()) {
					if (MSC_MFG_STS_TYP.isSAV(hdrR.old_mfg_sts_typ())) {
						continue;
					}
					else {
						strCrudTyp = MAC_DATA_CRUD_TYP.UPD.value();
					}
				}
				else if (MSC_MFG_STS_TYP.isORD(hdrR.mfg_sts_typ())) {
					if (MSC_MFG_STS_TYP.isORD(hdrR.old_mfg_sts_typ()) || MSC_MFG_STS_TYP.isCMPL(hdrR.old_mfg_sts_typ())) {
						// 指図済→指図済　または　完了→指図済（打切取消）の場合は更新
						strCrudTyp = MAC_DATA_CRUD_TYP.UPD.value();
					}
					else {
						strCrudTyp = MAC_DATA_CRUD_TYP.CRT.value();
					}
				}
				else if (MSC_MFG_STS_TYP.isSTT(hdrR.mfg_sts_typ())) {
					strCrudTyp = MAC_DATA_CRUD_TYP.UPD.value();
				}
				
				if (strCrudTyp != null) {
					strCrudTypInit = strCrudTyp;
					for (MfgInstReg_Upd01_DtlOperR operR : subUp1L.subList(up1Idx, hdrR.peg_no())) {
						strCrudTyp = strCrudTypInit;
						//　新規では取消行を送信しない
						if (MAC_DATA_CRUD_TYP.isCRT(strCrudTyp) && MAC_DATA_CRUD_TYP.isDEL(operR.data_crud_typ())) {
							continue;
						}
						
						if (MAC_DATA_CRUD_TYP.isUPD(strCrudTyp) && isOldMfgInstSendIfDataNullOrDel(operR)) {
							strCrudTyp = MAC_DATA_CRUD_TYP.CRT.value();
						}
						else if (MAC_DATA_CRUD_TYP.isDEL(strCrudTyp) && isOldMfgInstSendIfDataNullOrDel(operR)) {
							continue;
						}
						
						MfgInstSendIf_Upd01_DtlOperR operIfR = ope.up0().add();
						operIfR.oper_inst_no(operR.oper_inst_no());
						if (MAC_DATA_CRUD_TYP.isUPD(strCrudTyp)) {
							operIfR.data_crud_typ(operR.data_crud_typ());
						} else {
							operIfR.data_crud_typ(strCrudTyp);
						}
						
						for (MfgInstReg_Upd01_DtlInptR inptR : inptL.subList(up2Idx, operR.oper_inst_no())) {
							//　新規では取消行を送信しない
							if (MAC_DATA_CRUD_TYP.isCRT(strCrudTyp) && MAC_DATA_CRUD_TYP.isDEL(inptR.data_crud_typ())) {
								continue;
							}
							MfgInstSendIf_Upd01_DtlInptR inptIfR = ope.up1().add();
							inptIfR.inpt_schd_no(inptR.inpt_schd_no());
							inptIfR.data_crud_typ(inptR.data_crud_typ());
						}
						for (MfgInstReg_Upd01_DtlWkR wkR : up3().subList(up3Idx, operR.oper_inst_no())) {
							//　新規では取消行を送信しない
							if (MAC_DATA_CRUD_TYP.isCRT(strCrudTyp) && MAC_DATA_CRUD_TYP.isDEL(wkR.data_crud_typ())) {
								continue;
							}
							MfgInstSendIf_Upd01_DtlWkR wkIfR = ope.up3().add();
							wkIfR.wk_schd_no(wkR.wk_schd_no());
							wkIfR.data_crud_typ(wkR.data_crud_typ());
						}
						for (MfgInstReg_Upd01_DtlYieldR yieldR : up4().subList(up4Idx, operR.oper_inst_no())) {
							//　新規では取消行を送信しない
							if (MAC_DATA_CRUD_TYP.isCRT(strCrudTyp) && MAC_DATA_CRUD_TYP.isDEL(yieldR.data_crud_typ())) {
								continue;
							}
							MfgInstSendIf_Upd01_DtlYieldR yieldIfR = ope.up2().add();
							yieldIfR.yield_schd_no(yieldR.yield_schd_no());
							yieldIfR.data_crud_typ(yieldR.data_crud_typ());
						}
						for (MfgInstReg_Upd01_DtlByProdR byProdR : up5().subList(up5Idx, operR.oper_inst_no())) {
							//　新規では取消行を送信しない
							if (MAC_DATA_CRUD_TYP.isCRT(strCrudTyp) && MAC_DATA_CRUD_TYP.isDEL(byProdR.data_crud_typ())) {
								continue;
							}
							MfgInstSendIf_Upd01_DtlYieldR byProdIfR = ope.up2().add();
							byProdIfR.yield_schd_no(byProdR.yield_schd_no());
							byProdIfR.data_crud_typ(byProdR.data_crud_typ());
						}
					}
				}
			}

			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}

		protected MCList<MfgInstReg_Upd01_DtlOperR> getDtlOperL() {
			MCList<MfgInstReg_Upd01_DtlOperR> retL = MCList.create(MfgInstReg_Upd01_DtlOperR.class);
			MCIndexKey indexkey = up1().createIndex(MfgInstReg_Upd01_DtlOperR.$hdr_peg_no);
			MCList<MfgInstReg_Upd01_HdrR> reAllocL = up0()
					.subList(r -> (!r.not_frst_inst_can_flg() && r.is_src_alloc_flg()
							&& (MSC_MFG_STS_TYP.isORD(r.mfg_sts_typ())
									|| MSC_MFG_STS_TYP.isSTT(r.mfg_sts_typ())
									|| MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ()))));

			MCList<MfgInstReg_Upd01_HdrR> inptBindL = MCList.create(MfgInstReg_Upd01_HdrR.class);
			for (MfgInstReg_Upd01_HdrR hdr : reAllocL) {
				MCList<MfgInstReg_Upd01_DtlOperR> subL = up1().subList(indexkey, hdr.peg_no());
				if (subL.isEmpty()) {
					continue;
				}
				if (isNull(subL.getFirst(MfgInstReg_Upd01_DtlOperR.$mes_flg, true))) {
					continue;
				}
				inptBindL.add(hdr);
			}
			MCList<MST_INPT_SCHD_R> inptL = getInptSchdL(inptBindL);
			MCIndexKey indexkeyInpt = inptL.createIndex(MST_INPT_SCHD_R.$oper_inst_no);

			HashSet<String> mfgInstNoSet = new HashSet<String>();
			for (MfgInstReg_Upd01_HdrR hdrR : up0()) {
				if (hdrR.not_frst_inst_can_flg()) {
					continue;
				}
				MCList<MfgInstReg_Upd01_DtlOperR> subL = up1().subList(indexkey, hdrR.peg_no());
				if (hdrR.is_src_alloc_flg()) {
					// 指図書発行済の場合、改訂番号がアップされたので、投入品の差分が行わない。
					if (!isNull(hdrR.old_mfg_inst_rev()) && !isSame(hdrR.mfg_inst_rev(), hdrR.old_mfg_inst_rev())) {
						retL.addAll(subL.subList(r -> r.mes_flg()));
					}
					else {
						MCList<MST_INPT_SCHD_R> inptRevL = getInptSchdLCacheForUpd01(hdrR.mfg_inst_no());
						MCIndexKey indexkeyInptRev = inptRevL.createIndex(MST_INPT_SCHD_R.$oper_inst_no);
						for (MfgInstReg_Upd01_DtlOperR operR : subL) {
							if (!operR.mes_flg()) {
								continue;
							}
							MCList<MfgInstReg_Upd01_DtlInptR> dtlInptL = up2().subList(MfgInstReg_Upd01_DtlInptR.$oper_peg_no, operR.peg_no());
							if (!isNull(dtlInptL.getFirst(MfgInstReg_Upd01_DtlInptR.$disp_seq_upd_flg, false))) {
								MCList<MST_INPT_SCHD_R> subInptL = inptL.subList(indexkeyInpt, operR.oper_inst_no());
								MCList<MST_INPT_SCHD_R> subInptRevL = inptRevL.subList(indexkeyInptRev, operR.oper_inst_no());
								if (subInptL.size() != subInptRevL.size()) {
									retL.add(operR);
									mfgInstNoSet.add(hdrR.mfg_inst_no());
								}
								else {
									// 各投入予定の引当対象項目が変わる場合
									for (MST_INPT_SCHD_R inptR : subInptL) {
										MST_INPT_SCHD_R inptRevR = subInptRevL.getFirst(MST_INPT_SCHD_R.$inpt_schd_no, inptR.inpt_schd_no());
										if (isNull(inptRevR) || !isSame(inptR, inptRevR)) {
											retL.add(operR);
											mfgInstNoSet.add(hdrR.mfg_inst_no());
											break;
										}
									}
								}
							}
						}
					}
				}
				else {
					retL.addAll(subL.subList(r -> r.mes_flg()));
				}
			}

			if (!mfgInstNoSet.isEmpty()) {
				MCIndexKey upIdxkey = up0().createIndex(MfgInstReg_Upd01_HdrR.$mfg_inst_no);
				MCList<MST_MFG_INST_R> upL = MCList.create(MST_MFG_INST_R.class);
				for (String mfgInstNo : mfgInstNoSet) {
					MfgInstReg_Upd01_HdrR hdrR = up0().getFirst(upIdxkey, mfgInstNo);
					MST_MFG_INST_R upR = MST_MFG_INST_R.create();
					upR.mfg_inst_no(mfgInstNo);
					upR.mfg_inst_rev(hdrR.mfg_inst_rev().add(1));
					upL.add(upR);
				}
				MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
				MCQueryApiBuilder upL_bldr = MCQueryApiBuilder.create(t);
				upL_bldr.setSet(t.mfg_inst_rev);
				dbUpdateKey("MSBCL6000_MST_MFG_INST_U01", upL, upL_bldr);
				callRevDataIns01(upL);
			}
			return retL;
		}
		
		protected MCList<MfgInstReg_Upd01_DtlOperR> getDtlOperLForNotFrstInstCan() {
			return up1().subList(r -> r.not_frst_inst_can_flg() && r.mes_flg());
		}
		
		protected MCList<MST_INPT_SCHD_R> getInptSchdL(MCList<MfgInstReg_Upd01_HdrR> hdrL) {
			MCList<MST_INPT_SCHD_R> retL = MCList.create(MST_INPT_SCHD_R.class);
			MST_INPT_SCHD_R t = MST_INPT_SCHD_R.create("T");
			MCQueryApiBuilder retL_bldr = MCQueryApiBuilder.create(t);
			if (!hdrL.isEmpty()) {
				retL_bldr.setSelect(t.base_unit_inpt_qty);
				retL_bldr.addSelect(t.base_unit_rqmt_qty);
				retL_bldr.addSelect(t.base_unit_fxd_rqmt_qty);
				retL_bldr.addSelect(t.act_cont_fctr);
				retL_bldr.addSelect(t.cont_inpt_qty);
				retL_bldr.addSelect(t.cont_rqmt_qty);
				retL_bldr.addSelect(t.cont_fxd_rqmt_qty);
				retL_bldr.addSelect(t.lot_no);
				retL_bldr.addSelect(t.sublot_no);
				retL_bldr.addSelect(t.alloc_sno1);
				retL_bldr.addSelect(t.alloc_sno2);
				retL_bldr.addSelect(t.alloc_sno3);
				retL_bldr.addSelect(t.alloc_sno4);
				retL_bldr.addSelect(t.alloc_flg);
				retL_bldr.addSelect(t.gd_cd);
				retL_bldr.addSelect(t.oper_inst_no);
				retL_bldr.addSelect(t.inpt_schd_no);
				retL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
				retL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
				dbSelect("MSBCL6000_MST_INPT_SCHD_S01", retL, retL_bldr, hdrL);
			}
			return retL;
		}
		/**
		 * 製造指図時に「未確定」または「保存」であった品目オーダの製造指図を取り消す場合、品目オーダを元のステータスに戻す
		 */
		protected void callOrdUpd02FromFix() {
			MCList<MfgInstReg_Upd01_HdrR> delHdrL = up0().subList(MfgInstReg_Upd01_HdrR.$itm_mfg_inst_data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			if (delHdrL.isEmpty()) {
				return;
			}
			MCList<MST_ITM_ORDER_R> selItmOrdL = MCList.create(MST_ITM_ORDER_R.class);
			MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder selItmOrdL_bldr = MCQueryApiBuilder.create(t);
			selItmOrdL_bldr.setSelect(t.itm_ord_no);
			selItmOrdL_bldr.addSelect(t.itm_ord_sts_typ);
			selItmOrdL_bldr.addSelect(t.inst_itm_ord_sts_typ);
			dbSelectKey("MSBCL6000_MST_ITM_ORDER_S02", selItmOrdL, selItmOrdL_bldr, delHdrL);
			MCIndexKey idxkey = selItmOrdL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			MSBCL_OrdRegService.Ord_Chk02 ordChk = MSBCL_OrdRegService.crtOrd_Chk02();
			MSBCL_OrdRegService.Ord_Upd02 ordUpd = MSBCL_OrdRegService.crtOrd_Upd02();
			for (MCList<MfgInstReg_Upd01_HdrR> gl : delHdrL.groupList(MfgInstReg_Upd01_HdrR.$itm_ord_no)) {
				MST_ITM_ORDER_R itmOrdR = selItmOrdL.getFirst(idxkey, gl.get(0).itm_ord_no());
				if (!isNull(itmOrdR) && MSC_ITM_ORD_STS_TYP.isFIX(itmOrdR.itm_ord_sts_typ()) 
						&& (MSC_ITM_ORD_STS_TYP.isOPN(itmOrdR.inst_itm_ord_sts_typ()) || MSC_ITM_ORD_STS_TYP.isSAV(itmOrdR.inst_itm_ord_sts_typ())) ) {
					Ord_Upd01_Dtl1R ordUpR = Ord_Upd01_Dtl1R.create();
					ordUpR.peg_no(gl.get(0).peg_no());
					ordUpR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					ordUpR.mrp_typ(MSC_MRP_TYP.MRP.value());
					ordUpR.itm_ord_no(itmOrdR.itm_ord_no());
					ordUpR.a_itm_ord_sts_typ(itmOrdR.inst_itm_ord_sts_typ());
					ordChk.up0().add(ordUpR);
				}
			}
			
			if (!ordChk.up0().isEmpty()) {
				// チェックが目的ではなく、下り電文を元にUpd02の上り電文を設定するために呼び出す
				ordChk.exec();
				
				for (Ord_Upd01_Dtl1R dtl1R : ordChk.down0()) {
					dtl1R.is_src_mfg_inst_flg(true);
					ordUpd.up0().add(dtl1R);
				}
				
				ordUpd.exec();
			}
		}
		/**
		 * 「改訂履歴データ更新リスト」テーブルにデータを登録サービス呼び出し
		 */
		protected void callRevDataIns01(MCList<MST_MFG_INST_R> upL) {
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (MST_MFG_INST_R hdrR : upL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(hdrR.mfg_inst_no());
				opeR.rev_no(hdrR.mfg_inst_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_MFG_INST.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}
		protected Map_Ord_Upd04_DtlR_MfgInstReg_Upd01_HdrR<Ord_Upd04_DtlR,MfgInstReg_Upd01_HdrR> createMap_Ord_Upd04_DtlR_MfgInstReg_Upd01_HdrR() {
			return new Map_Ord_Upd04_DtlR_MfgInstReg_Upd01_HdrR<Ord_Upd04_DtlR, MfgInstReg_Upd01_HdrR>();
		}

		public class Map_Ord_Upd04_DtlR_MfgInstReg_Upd01_HdrR<D extends Ord_Upd04_DtlR, S extends MfgInstReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd04_DtlR.$itm_ord_no, MfgInstReg_Upd01_HdrR.$itm_ord_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (MSC_MFG_MTD_TYP.isEXTNL(src.mfg_mtd_typ())) {
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
				}
				else {
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.MFG.value());
				}
			}
		}
		
		protected Map_Ord_Upd05_DtlR_MfgInstReg_Upd01_HdrR<Ord_Upd05_DtlR,MfgInstReg_Upd01_HdrR> createMap_Ord_Upd05_DtlR_MfgInstReg_Upd01_HdrR() {
			return new Map_Ord_Upd05_DtlR_MfgInstReg_Upd01_HdrR<Ord_Upd05_DtlR, MfgInstReg_Upd01_HdrR>();
		}

		public class Map_Ord_Upd05_DtlR_MfgInstReg_Upd01_HdrR<D extends Ord_Upd05_DtlR, S extends MfgInstReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd05_DtlR.$itm_ord_no, MfgInstReg_Upd01_HdrR.$itm_ord_no);
			}
		}
		
		protected void callPrntSrv() {
			// 指図書
			MSBCL_MfgRptService.MfgRpt_Prnt01 prntInst = MSBCL_MfgRptService.crtMfgRpt_Prnt01();
			for (MfgInstReg_Upd01_HdrR hdrR : up0()) {
				if (hdrR.inst_immed_prnt_flg() && !hdrR.inst_abort_flg()) {
					MfgRpt_Prnt01_DtlR oUpR = MfgRpt_Prnt01_DtlR.create();
					copy(oUpR, hdrR, createMap_MfgRpt_Prnt01_DtlR_MfgInstReg_Upd01_HdrR());
					prntInst.up0().add(oUpR);
				}
			}
			if (!prntInst.up0().isEmpty()) {
				prntInst.exec();
			}
			
			// 工程・ＢＯＭマスタ変更リスト
			MSBCL_MfgRptService.MfgRpt_Prnt03 prntBomOper = MSBCL_MfgRptService.crtMfgRpt_Prnt03();
			for (MfgInstReg_Upd01_HdrR hdrR : up0()) {
				if (hdrR.chg_list_immed_prnt_flg() && !hdrR.inst_abort_flg()) {
					MfgRpt_Prnt03_DtlR oUpR = MfgRpt_Prnt03_DtlR.create();
					copy(oUpR, hdrR, createMap_MfgRpt_Prnt03_DtlR_MfgInstReg_Upd01_HdrR());
					prntBomOper.up0().add(oUpR);
				}
			}
			if (!prntBomOper.up0().isEmpty()) {
				prntBomOper.exec();
			}
		}
		
		protected Map_MfgRpt_Prnt01_DtlR_MfgInstReg_Upd01_HdrR<MfgRpt_Prnt01_DtlR,MfgInstReg_Upd01_HdrR> createMap_MfgRpt_Prnt01_DtlR_MfgInstReg_Upd01_HdrR() {
			return new Map_MfgRpt_Prnt01_DtlR_MfgInstReg_Upd01_HdrR<MfgRpt_Prnt01_DtlR, MfgInstReg_Upd01_HdrR>();
		}

		public class Map_MfgRpt_Prnt01_DtlR_MfgInstReg_Upd01_HdrR<D extends MfgRpt_Prnt01_DtlR, S extends MfgInstReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgRpt_Prnt01_DtlR.$peg_no, MfgInstReg_Upd01_HdrR.$peg_no);
				addColumnPathMap(MfgRpt_Prnt01_DtlR.$mfg_inst_no, MfgInstReg_Upd01_HdrR.$mfg_inst_no);
				addColumnPathMap(MfgRpt_Prnt01_DtlR.$mfg_inst_rev, MfgInstReg_Upd01_HdrR.$mfg_inst_rev);
			}
		}
		
		protected Map_MfgRpt_Prnt03_DtlR_MfgInstReg_Upd01_HdrR<MfgRpt_Prnt03_DtlR,MfgInstReg_Upd01_HdrR> createMap_MfgRpt_Prnt03_DtlR_MfgInstReg_Upd01_HdrR() {
			return new Map_MfgRpt_Prnt03_DtlR_MfgInstReg_Upd01_HdrR<MfgRpt_Prnt03_DtlR, MfgInstReg_Upd01_HdrR>();
		}

		public class Map_MfgRpt_Prnt03_DtlR_MfgInstReg_Upd01_HdrR<D extends MfgRpt_Prnt03_DtlR, S extends MfgInstReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgRpt_Prnt03_DtlR.$peg_no, MfgInstReg_Upd01_HdrR.$peg_no);
				addColumnPathMap(MfgRpt_Prnt03_DtlR.$mfg_inst_no, MfgInstReg_Upd01_HdrR.$mfg_inst_no);
				addColumnPathMap(MfgRpt_Prnt03_DtlR.$mfg_inst_rev, MfgInstReg_Upd01_HdrR.$mfg_inst_rev);
			}
		}
		
		protected void setDown() {
			MSC_MFG_STS_TYP.putNameNE(up0(),
					MfgInstReg_Upd01_HdrR.$mfg_sts_typ,
					MfgInstReg_Upd01_HdrR.$mfg_sts_typ_nm, getUsrLocale());
			down0().addAll(up0());
			down1().addAll(up1());
			down2().addAll(up2());
			down3().addAll(up3());
			down4().addAll(up4());
			down5().addAll(up5());
		}
	}
	
	/**
	 * MfgInstReg_Chk01オペレーション.<p>
	 *
	 * 製造指図の登録・訂正の共通処理<br>
	 */
	public class MfgInstReg_Chk01 extends MSBCL_MfgInstRegService_MC_A.MfgInstReg_Chk01 {
		
		/**
		 * 明細からヘッダデータにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MfgInstReg_Chk01_HdrR> _hdrCache;
		
		/**
		 * 明細から工程データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MfgInstReg_Chk01_DtlOperR> _operCache;
		
		/**
		 * ヘッダから工程データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MfgInstReg_Chk01_DtlOperR>> _operCacheForHdr;
		
		/**
		 * ヘッダから投入データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MfgInstReg_Chk01_DtlInptR>> _inptCacheForHdr;

		/**
		 * ヘッダから工数データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MfgInstReg_Chk01_DtlWkR>> _wkCacheForHdr;

		/**
		 * ヘッダから出来高データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MfgInstReg_Chk01_DtlYieldR>> _yieldCacheForHdr;

		/**
		 * ヘッダから副産品データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MfgInstReg_Chk01_DtlByProdR>> _byProdCacheForHdr;
		
		/**
		 * 品目オーダＮＯから出来高データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MfgInstReg_Chk01_DtlYieldR>> _yieldCacheForItmOrdNo;

		/**
		 * 品目オーダＮＯから投入データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MfgInstReg_Chk01_DtlInptR>> _inptCacheForItmOrdNo;

		/**
		 * 納入指示明細のキャッシュ
		 */
		protected MCList<MST_DLV_INST_D_R> _dlvInstDCache;
		protected MCIndexKey _dlvInstDCacheIdx;

		/**
		 * 納期回答受領明細のキャッシュ
		 */
		protected MCList<MST_PRMS_RCPT_D_R> _prmsRcptDCache;
		protected MCIndexKey _prmsRcptDCacheIdx;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			setGrpErrFlg();
			
			setErrToRtnStsTyp();

			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			setCache();
			wkInsert();
			initDlvInstDCache();
			initPrmsRcptDCache();
			msgL.addAll(lockAndCheckBase());

			if (!msgL.isEmpty()) {
				return msgL;
			}
			return msgL;
		}
		
		protected void setGrpErrFlg() {
			// 同一品目製造指図や品目オーダの指図数量をチェックする処理などがあるため、品目オーダでエラーフラグの値を連動する
			String[] grpKeys = new String[] {
					MfgInstReg_Chk01_HdrR.$itm_ord_no
			};
			setGrpErrFlgByKey(up0(), grpKeys, MfgInstReg_Chk01_HdrR.$err_flg);
		}
		
		@Override
		protected <R extends MCRow> MCList<R> getChkList(MCContainer container, MCRow.Status... status) {
			// doServerCheck（リストロジックチェックや必須チェックなどの定型チェック）から呼ばれる。打切行はチェック対象から外したいのでOverride
			if (container instanceof MCList) {
				MCList<R> retL = ((MCList<R>) container).createInstance();
				for (R row : (MCList<R>) container) {
					// 打切行はチェック対象から外す
					if (row instanceof MfgInstReg_Chk01_HdrR) {
						MfgInstReg_Chk01_HdrR hdrR = (MfgInstReg_Chk01_HdrR)row;
						if (!hdrR.inst_abort_flg() && !MAC_DATA_CRUD_TYP.isDEL(hdrR.mfg_inst_data_crud_typ()) && !hdrR.not_frst_inst_can_flg()) {
							retL.add(row);
						}
					}
					else if (row instanceof MfgInstReg_Chk01_DtlOperR) {
						MfgInstReg_Chk01_DtlOperR operR = (MfgInstReg_Chk01_DtlOperR)row;
						if (!operR.inst_abort_flg() && !MAC_DATA_CRUD_TYP.isDEL(operR.data_crud_typ()) && !operR.not_frst_inst_can_flg()) {
							retL.add(row);
						}
					}
					else if (row instanceof MfgInstReg_Chk01_DtlInptR) {
						MfgInstReg_Chk01_DtlInptR inptR = (MfgInstReg_Chk01_DtlInptR)row;
						if (!inptR.inst_abort_flg() && !MAC_DATA_CRUD_TYP.isDEL(inptR.data_crud_typ()) && !inptR.not_frst_inst_can_flg()) {
							retL.add(row);
						}
					}
					else if (row instanceof MfgInstReg_Chk01_DtlWkR) {
						MfgInstReg_Chk01_DtlWkR wkR = (MfgInstReg_Chk01_DtlWkR)row;
						if (!wkR.inst_abort_flg() && !MAC_DATA_CRUD_TYP.isDEL(wkR.data_crud_typ()) && !wkR.not_frst_inst_can_flg()) {
							retL.add(row);
						}
					}
					else if (row instanceof MfgInstReg_Chk01_DtlYieldR) {
						MfgInstReg_Chk01_DtlYieldR yieldR = (MfgInstReg_Chk01_DtlYieldR)row;
						if (!yieldR.inst_abort_flg() && !MAC_DATA_CRUD_TYP.isDEL(yieldR.data_crud_typ()) && !yieldR.not_frst_inst_can_flg()) {
							retL.add(row);
						}
					}
					else if (row instanceof MfgInstReg_Chk01_DtlByProdR) {
						MfgInstReg_Chk01_DtlByProdR byProdR = (MfgInstReg_Chk01_DtlByProdR)row;
						if (!byProdR.inst_abort_flg() && !MAC_DATA_CRUD_TYP.isDEL(byProdR.data_crud_typ()) && !byProdR.not_frst_inst_can_flg()) {
							retL.add(row);
						}
					}
					else if (row instanceof MfgInstReg_Chk01_DtlReExtR) {
						MfgInstReg_Chk01_DtlReExtR reExtR = (MfgInstReg_Chk01_DtlReExtR)row;
						if (!MAC_DATA_CRUD_TYP.isDEL(reExtR.data_crud_typ())) {
							retL.add(row);
						}
					}
				}
				return retL;
			}
			return super.getChkList(container, status);
		}
				
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			chkAndCompAfterListLogic();
			return msgL;
		}
		
		@Override
		protected void setErrFlg(MCRow r, MCMessageList msgL) {
			super.setErrFlg(r, msgL);
			if (msgL == null || msgL.isEmpty()) {
				return;
			}
			if (isSame(MCSys.request.logicId(), "MSBCL1010")
					&& r.getParamIndex() == 0 && r.getBooleanNE(ERR_FLG_COL)) {
				up1().setBooleanNE(ERR_FLG_COL, true);
				up2().setBooleanNE(ERR_FLG_COL, true);
				up3().setBooleanNE(ERR_FLG_COL, true);
				up4().setBooleanNE(ERR_FLG_COL, true);
				up5().setBooleanNE(ERR_FLG_COL, true);
				up6().setBooleanNE(ERR_FLG_COL, true);
			}
		}
		
		protected void setCache() {
			_hdrCache = new FXUCL_Cache<MfgInstReg_Chk01_HdrR>();
			_hdrCache.setFixMaxCacheSize(-1);
			
			_operCache = new FXUCL_Cache<MfgInstReg_Chk01_DtlOperR>();
			_operCache.setFixMaxCacheSize(-1);
			
			_operCacheForHdr = new FXUCL_Cache<MCList<MfgInstReg_Chk01_DtlOperR>>();
			_operCacheForHdr.setFixMaxCacheSize(-1);
			
			_inptCacheForHdr = new FXUCL_Cache<MCList<MfgInstReg_Chk01_DtlInptR>>();
			_inptCacheForHdr.setFixMaxCacheSize(-1);
			
			_wkCacheForHdr = new FXUCL_Cache<MCList<MfgInstReg_Chk01_DtlWkR>>();
			_wkCacheForHdr.setFixMaxCacheSize(-1);
			
			_yieldCacheForHdr = new FXUCL_Cache<MCList<MfgInstReg_Chk01_DtlYieldR>>();
			_yieldCacheForHdr.setFixMaxCacheSize(-1);
			
			_byProdCacheForHdr = new FXUCL_Cache<MCList<MfgInstReg_Chk01_DtlByProdR>>();
			_byProdCacheForHdr.setFixMaxCacheSize(-1);
			
			_yieldCacheForItmOrdNo = new FXUCL_Cache<MCList<MfgInstReg_Chk01_DtlYieldR>>();
			_yieldCacheForItmOrdNo.setFixMaxCacheSize(-1);
			
			_inptCacheForItmOrdNo = new FXUCL_Cache<MCList<MfgInstReg_Chk01_DtlInptR>>();
			_inptCacheForItmOrdNo.setFixMaxCacheSize(-1);

			MCIndexKey operKey = up1().createIndex(MfgInstReg_Chk01_DtlOperR.$hdr_peg_no);
			MCIndexKey inptKey = up2().createIndex(MfgInstReg_Chk01_DtlInptR.$hdr_peg_no);
			MCIndexKey wkKey = up3().createIndex(MfgInstReg_Chk01_DtlWkR.$hdr_peg_no);
			MCIndexKey yieldKey = up4().createIndex(MfgInstReg_Chk01_DtlYieldR.$hdr_peg_no);
			MCIndexKey byProdKey = up5().createIndex(MfgInstReg_Chk01_DtlByProdR.$hdr_peg_no);
			for (MfgInstReg_Chk01_HdrR hdrR : up0()) {
				MCNumber[] cacheKey = new MCNumber[]{hdrR.peg_no()};
				_hdrCache.putCache(cacheKey, hdrR);
				
				_operCacheForHdr.putCache(cacheKey, up1().subList(operKey, hdrR.peg_no()));
				_inptCacheForHdr.putCache(cacheKey,up2().subList(inptKey, hdrR.peg_no()));
				_wkCacheForHdr.putCache(cacheKey, up3().subList(wkKey, hdrR.peg_no()));
				_yieldCacheForHdr.putCache(cacheKey, up4().subList(yieldKey, hdrR.peg_no()));
				_byProdCacheForHdr.putCache(cacheKey, up5().subList(byProdKey, hdrR.peg_no()));
			}
			
			// 品目オーダＮＯ単位に以下のキャッシュを作成（初回製造指図の新規登録で使用）
			// ・出来高予定が存在するかどうかのチェックを品目オーダＮＯ単位に実施するためのキャッシュ
			// ・ロット・サブロット発番時に引継対象子品目の取得を品目オーダＮＯ単位に実施するためのキャッシュ
			for (MCList<MfgInstReg_Chk01_HdrR> hdrL : up0().groupList(MfgInstReg_Chk01_HdrR.$itm_ord_no)) {
				MfgInstReg_Chk01_HdrR firstR = hdrL.get(0);
				if (isNull(firstR.itm_ord_no())) {
					continue;
				}

				MCList<MfgInstReg_Chk01_DtlYieldR> yieldSubL = MCList.create(MfgInstReg_Chk01_DtlYieldR.class);
				MCList<MfgInstReg_Chk01_DtlInptR> inptSubL = MCList.create(MfgInstReg_Chk01_DtlInptR.class);

				for (MfgInstReg_Chk01_HdrR hdrR : hdrL) {
					yieldSubL.addAll(up4().subList(yieldKey, hdrR.peg_no()));
					inptSubL.addAll(up2().subList(inptKey, hdrR.peg_no()));
				}

				String[] cacheKey = new String[]{firstR.itm_ord_no()};
				_yieldCacheForItmOrdNo.putCache(cacheKey, yieldSubL);
				_inptCacheForItmOrdNo.putCache(cacheKey, inptSubL);
			}

			for (MfgInstReg_Chk01_DtlOperR operR : up1()) {
				_operCache.putCache(new MCNumber[]{operR.peg_no()}, operR);
			}
		}
		
		protected void wkInsert() {
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_MFG_INST_R.create("T"));
			dbWkDelete("MSBCL6000_MSW_MFG_INST_D04", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBCL6000_MSW_MFG_INST_I03", up0().groupBy(MfgInstReg_Chk01_HdrR.$mfg_inst_no), wkL_bldr.getBaseDbc());
		}
		
		// 納入指示明細のキャッシュ
		protected void initDlvInstDCache() {
			_dlvInstDCache = MCList.create(MST_DLV_INST_D_R.class);
			MST_DLV_INST_D_R t = MST_DLV_INST_D_R.create("T");
			MCQueryApiBuilder dlvInstDCache_bldr = MCQueryApiBuilder.create(t);
			MSW_MFG_INST_KEY_R w1 = MSW_MFG_INST_KEY_R.create("W1");
			dlvInstDCache_bldr.addInnerJoin(w1, t.mfg_inst_no.eq(w1.mfg_inst_no));
			dlvInstDCache_bldr.setWhere(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6000_MST_DLV_INST_D_S01", _dlvInstDCache, dlvInstDCache_bldr);
			_dlvInstDCacheIdx = _dlvInstDCache.createIndex(MST_DLV_INST_D_R.$mfg_inst_no);
		}
		protected MST_DLV_INST_D_R getDlvInstDCache(String mfgInstNo) {
			return _dlvInstDCache.getFirst(_dlvInstDCacheIdx, mfgInstNo);
		}
		protected MCList<MST_DLV_INST_D_R> getListDlvInstDCache(String mfgInstNo) {
			return _dlvInstDCache.subList(_dlvInstDCacheIdx, mfgInstNo);
		}
		
		// 納期回答受領明細のキャッシュ
		protected void initPrmsRcptDCache() {
			_prmsRcptDCache = MCList.create(MST_PRMS_RCPT_D_R.class);
			MST_PRMS_RCPT_D_R t = MST_PRMS_RCPT_D_R.create("T");
			MCQueryApiBuilder prmsRcptDCache_bldr = MCQueryApiBuilder.create(t);
			MSW_MFG_INST_KEY_R w1 = MSW_MFG_INST_KEY_R.create("W1");
			prmsRcptDCache_bldr.addInnerJoin(w1, t.mfg_inst_no.eq(w1.mfg_inst_no));
			prmsRcptDCache_bldr.setWhere(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6000_MST_PRMS_RCPT_D_S01", _prmsRcptDCache, prmsRcptDCache_bldr);
			_prmsRcptDCacheIdx = _prmsRcptDCache.createIndex(MST_DLV_INST_D_R.$mfg_inst_no);
		}
		protected MST_PRMS_RCPT_D_R getPrmsRcptDCache(String mfgInstNo) {
			return _prmsRcptDCache.getFirst(_prmsRcptDCacheIdx, mfgInstNo);
		}
		protected MCList<MST_PRMS_RCPT_D_R> getListPrmsRcptDCache(String mfgInstNo) {
			return _prmsRcptDCache.subList(_prmsRcptDCacheIdx, mfgInstNo);
		}
		
		/**
		 * トランザクションデータのロック・チェック・補完
		 * @return
		 */
		protected MCMessageList lockAndCheckBase() {
			// 本メソッド内での補完処理は、トランザクションデータを元にした補完を対象とする
			// ※本メソッド実行時点では、まだリストロジックによる補完が行われていないため、
			// マスタ項目を元にした補完などは、後続の処理においても行われる
			
			MCMessageList msgL = new MCMessageList();
			
			// ヘッダのロック・チェック・補完
			msgL.addAll(chkAndCompHdrBase());
			
			// 工程指図のチェック・補完
			msgL.addAll(chkAndCompOperBase());
			copyErrFlg(up0(), up1(), MfgInstReg_Upd01_HdrR.$peg_no, MfgInstReg_Upd01_DtlOperR.$hdr_peg_no);
			
			// 投入予定のチェック・補完
			msgL.addAll(chkAndCompInptBase());
			copyErrFlg(up0(), up2(), MfgInstReg_Upd01_HdrR.$peg_no, MfgInstReg_Upd01_DtlInptR.$hdr_peg_no);
			
			// 工数予定のチェック・補完
			msgL.addAll(chkAndCompWkBase());
			copyErrFlg(up0(), up3(), MfgInstReg_Upd01_HdrR.$peg_no, MfgInstReg_Upd01_DtlWkR.$hdr_peg_no);
			
			// 出来高予定のチェック・補完
			msgL.addAll(chkAndCompYieldBase());
			copyErrFlg(up0(), up4(), MfgInstReg_Upd01_HdrR.$peg_no, MfgInstReg_Upd01_DtlYieldR.$hdr_peg_no);
			
			// 副産品予定のチェック・補完
			msgL.addAll(chkAndCompByProdBase());
			copyErrFlg(up0(), up5(), MfgInstReg_Upd01_HdrR.$peg_no, MfgInstReg_Upd01_DtlByProdR.$hdr_peg_no);
			
			// ヘッダのerr_flgを明細にコピー
			// ※明細で不要なリストロジックチェックを行わないようにするためには、明細にerr_flgをコピーする必要がある
			// 場所のリストロジックで、トランザクションから補完した値を条件として使用するが、その条件が取得できないと存在チェックが正しく行われず、不自然なメッセージが出力される
			copyErrFlg(up1(), up0(), MfgInstReg_Upd01_DtlOperR.$hdr_peg_no, MfgInstReg_Upd01_HdrR.$peg_no);
			copyErrFlg(up2(), up0(), MfgInstReg_Upd01_DtlInptR.$hdr_peg_no, MfgInstReg_Upd01_HdrR.$peg_no);
			copyErrFlg(up3(), up0(), MfgInstReg_Upd01_DtlWkR.$hdr_peg_no, MfgInstReg_Upd01_HdrR.$peg_no);
			copyErrFlg(up4(), up0(), MfgInstReg_Upd01_DtlYieldR.$hdr_peg_no, MfgInstReg_Upd01_HdrR.$peg_no);
			copyErrFlg(up5(), up0(), MfgInstReg_Upd01_DtlByProdR.$hdr_peg_no, MfgInstReg_Upd01_HdrR.$peg_no);
			
			return msgL;
		}
		
		protected MCMessageList chkAndCompHdrBase() {
			MCMessageList msgL = new MCMessageList();
			// 品目オーダ、品目製造指図、製造指図、発注予定の取得
			MCList<MST_ITM_ORDER_R> ioL = getItmOrd();
			MCIndexKey iokey = ioL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			
			MCList<MST_ITM_MFG_INST_R> imiL = getItmMfgInst();
			MCIndexKey imiKey = imiL.createIndex(MST_ITM_MFG_INST_R.$itm_mfg_inst_no);
			
			MCList<MST_ITM_MFG_INST_R> imiLByIoNo = getItmMfgInstByItmOrdNo();
			MCIndexKey imiLByIoNoKey = imiLByIoNo.createIndex(MST_ITM_MFG_INST_R.$itm_ord_no);
			
			MCList<MST_MFG_INST_R> miL = getMfgInst();
			MCIndexKey mikey = miL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			
			MCList<MST_MFG_INST_R> miLByItmMfgInstNo = getMfgInstByItmMfgInstNo(imiLByIoNo);
			MCIndexKey miLByItmMfgInstNokey = miLByItmMfgInstNo.createIndex(MST_MFG_INST_R.$itm_mfg_inst_no);

			MCList<MST_PO_SCHD_R> poSchdL = getPoSchd();
			MCIndexKey poSchdKey = poSchdL.createIndex(MST_PO_SCHD_R.$outsrc_itm_ord_no);

			MCList<MST_PO_D_R> podL = getPoD();
			MCIndexKey podKey = podL.createIndex(MST_PO_D_R.$outsrc_itm_ord_no);
			
			MCList<MST_ARR_SCHD_R> reArrSchdL = getReArrSchd(podL);
			MCIndexKey reArrSchdKey = reArrSchdL.createIndex("po_d_no");
			
			MCList<MST_MFG_INST_R> otherMiL = getOtherMfgInst();
			MCIndexKey otherMikey = otherMiL.createIndex(MST_MFG_INST_R.$itm_mfg_inst_no);
			
			// あらかじめ全レコードに対して補完すべき項目を設定する
			// ※後続の処理で、自分以外のレコードを参照する処理（getSumItmMfgInstQtyByIoNo）が存在するため、そこで使用する項目を設定しておく
			for (MfgInstReg_Chk01_HdrR r : up0()) {
				// データ更新区分（製造指図）
				if (isNull(r.mfg_inst_no())) {
					r.mfg_inst_data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					if (r.isStatusDelete()) {
						r.mfg_inst_data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					else {
						r.mfg_inst_data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					}
				}

				// データ更新区分（品目製造指図）
				MST_ITM_MFG_INST_R imiR = imiL.getFirst(imiKey, r.itm_mfg_inst_no());
				if (!isNull(r.itm_mfg_inst_no()) && !isNull(imiR)) {
					if (isSame(r.mfg_inst_no(), imiR.frst_mfg_inst_no())) {
						if (r.isStatusDelete()) {
							r.itm_mfg_inst_data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						}
						else {
							r.itm_mfg_inst_data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						}
					}
					else {
						// 後続の処理は、nullの場合更新対象外とみなす仕様
						r.itm_mfg_inst_data_crud_typ(null);
					}
				}
				else {
					// 初回製造指図以外の登録（工程単位）がオンの場合はnullを設定
					if (r.not_frst_inst_reg_oper_flg()) {
						r.itm_mfg_inst_data_crud_typ(null);
					}
					else {
						r.itm_mfg_inst_data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					}
				}

				// 工程単位製造指図で、初回製造指図以外の取消処理かどうかを判断するフラグ
				if (MAC_DATA_CRUD_TYP.isDEL(r.mfg_inst_data_crud_typ())
						&& isNull(r.itm_mfg_inst_data_crud_typ())) {
					r.not_frst_inst_can_flg(true);
				}
				else {
					r.not_frst_inst_can_flg(false);
				}
			}

			MCList<MAM_ITM_R> selectItmL = MCList.create(MAM_ITM_R.class);
			MAM_ITM_R m = MAM_ITM_R.create("M");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(m);
			selectL_bldr.setSelect(
					m.itm_cd,
					m.itm_sub1,
					m.itm_sub2,
					m.itm_sub3,
					m.del_flg);
			dbSelectKey("MSBCL6000_MAM_ITM_S02", selectItmL, selectL_bldr, ioL);
			
			MCIndexKey idxKeyItm = selectItmL.createIndex(MAM_ITM_R.$itm_cd,
					MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
			// 更新カウンタチェック、値の補完
			for (MfgInstReg_Chk01_HdrR r : up0()) {
				// 品目オーダ
				MST_ITM_ORDER_R ioR = ioL.getFirst(iokey, r.itm_ord_no());
				if (!isNull(r.itm_ord_no())) {
					if (r.upd_cntr_chk_flg()) {
						msgL.addAll(checkUpdCntrNE(r, MfgInstReg_Chk01_HdrR.$itm_ord_upd_cntr, ioR));
					}
					else {
						if (isNull(ioR)) {
							msgL.addAll(getRecordNotFoundMsg("MS", "MST_ITM_ORDER"
									, new String[]{MST_ITM_ORDER_R.$itm_ord_no}
									, new Comparable[]{r.itm_ord_no()}, r));
							r.err_flg(true);
						}
					}
					if (!isNull(ioR)) {
						// 品目マスタ　論理削除チェック
						MAM_ITM_R selectItmR = selectItmL.getFirst(idxKeyItm, ioR.itm_cd(), ioR.itm_sub1(),
								ioR.itm_sub2(), ioR.itm_sub3());
						if (isNull(selectItmR)) {
							msgL.add(new MCMessage(r, null, MAUAL0189,
							toDispItm(ioR.itm_cd(), ioR.itm_sub1(), ioR.itm_sub2(), ioR.itm_sub3()),
							toDispGUIIndex(r)));
							r.err_flg(true);
						}
						r.itm_ord_sts_typ(ioR.itm_ord_sts_typ());
					}
					setErrFlg(r, msgL);
				}
				
				// 品目製造指図
				MST_ITM_MFG_INST_R imiR = imiL.getFirst(imiKey, r.itm_mfg_inst_no());
				if (!r.err_flg() && !isNull(r.itm_mfg_inst_no())) {
					if (r.upd_cntr_chk_flg()) {
						msgL.addAll(checkUpdCntrNE(r,
								MfgInstReg_Chk01_HdrR.$itm_mfg_inst_upd_cntr, imiR));
					}
					else {
						if (isNull(imiR)) {
							msgL.addAll(getRecordNotFoundMsg("MS", "MST_ITM_MFG_INST"
									, new String[]{MST_ITM_MFG_INST_R.$itm_mfg_inst_no}
									, new Comparable[]{r.itm_mfg_inst_no()}, r));
							r.err_flg(true);
						}
					}
					setErrFlg(r, msgL);
				}
				
				// 製造指図
				MST_MFG_INST_R miR = miL.getFirst(mikey, r.mfg_inst_no());
				if (!r.err_flg() && !isNull(r.mfg_inst_no())) {
					if (r.upd_cntr_chk_flg()) {
						msgL.addAll(checkUpdCntrNE(r, MfgInstReg_Chk01_HdrR.$mfg_inst_upd_cntr, miR));
					}
					else {
						if (isNull(miR)) {
							msgL.addAll(getRecordNotFoundMsg("MS", "MST_MFG_INST"
									, new String[]{MST_MFG_INST_R.$mfg_inst_no}
									, new Comparable[]{r.mfg_inst_no()}, r));
							r.err_flg(true);
						}
					}
					setErrFlg(r, msgL);
				}
				if (r.err_flg()) {
					continue;
				}
				
				// 同一品目オーダNOを持つ品目製造指図
				MCList<MST_ITM_MFG_INST_R> sameIoNoImiL = imiLByIoNo
						.subList(imiLByIoNoKey, r.itm_ord_no());
				
				// 品目製造指図を元に、同一品目オーダNOから発生した製造指図を取得
				MCList<MST_MFG_INST_R> sameItmMfgInstNoMiL = MCList.create(MST_MFG_INST_R.class);
				for (MST_ITM_MFG_INST_R sameIoNoImiR : sameIoNoImiL) {
					sameItmMfgInstNoMiL.addAll(miLByItmMfgInstNo.subList(miLByItmMfgInstNokey, sameIoNoImiR.itm_mfg_inst_no()));
				}

				// 発注予定
				MST_PO_SCHD_R poSchdR = null;
				if (MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())) {
					poSchdR = poSchdL.getFirst(poSchdKey, r.itm_ord_no());
				}
				
				// 発注明細
				MST_PO_D_R podR = null;
				MCList<MST_ARR_SCHD_R> reArrSchdSubL = MCList.create(MST_ARR_SCHD_R.class);
				if (MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())) {
					podR = podL.getFirst(podKey, r.itm_ord_no());
					if (!isNull(podR)) {
						// 再入荷予定
						reArrSchdSubL = reArrSchdL
								.subList(reArrSchdKey, podR.po_d_no());
					}
				}
								
				// 同じ品目製造指図ＮＯに紐付く他の製造指図
				MCList<MST_MFG_INST_R> otherMiSubL = otherMiL.subList(otherMikey, r.itm_mfg_inst_no());
				
				msgL.addAll(chkAndCompHdrBaseSub(r, ioR, imiR, miR, sameIoNoImiL, sameItmMfgInstNoMiL, poSchdR,
						podR, reArrSchdSubL, otherMiSubL));
			}
			return msgL;
		}
		
		/**
		 * 品目オーダを取得する
		 * @return
		 */
		protected MCList<MST_ITM_ORDER_R> getItmOrd() {
			MCList<MfgInstReg_Chk01_HdrR> subL = MCList.create(MfgInstReg_Chk01_HdrR.class);
			for (MfgInstReg_Chk01_HdrR r : up0()) {
				if (!isNull(r.itm_ord_no())) {
					subL.add(r);
				}
			}
			MCList<MST_ITM_ORDER_R> selectL = MCList.create(MST_ITM_ORDER_R.class);
			MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			MST_ITM_MFG_INST_R S1TMP = MST_ITM_MFG_INST_R.create("TMP");
			selectL_bldr.setSelect(
					t.itm_ord_no,
					t.itm_ord_sts_typ,
					t.inst_qty,
					t.not_inst_qty,
					t.mfg_st_schd_dt,
					t.mfg_end_schd_dt,
					t.io_schd_pr_no,
					t.mfg_inst_unit_typ,
					t.mfg_loc_cd,
					t.upd_cntr,
					t.itm_cd,
					t.itm_sub1,
					t.itm_sub2,
					t.itm_sub3
					);
			selectL_bldr.addSelect(
					bracket(subQuery().select(sum(S1TMP.base_unit_inst_qty)).from(S1TMP)
							.where(S1TMP.itm_ord_no.eq(t.itm_ord_no)
									.and(S1TMP.can_flg.eq(value(false)))))
											.as("tmp_sum_inst_qty"));
			selectL_bldr.setOrderByAsc(t.itm_ord_no);
			MCList<MfgInstReg_Chk01_HdrR> bindL = subL
					.groupBy(MfgInstReg_Chk01_HdrR.$itm_ord_no);
			bindL.sort(MfgInstReg_Chk01_HdrR.$itm_ord_no);
			if (!bindL.isEmpty()) {
				dbSelectKeyForUpdateNoWait("MSBCL6000_MST_ITM_ORDER_S03", selectL, selectL_bldr,bindL);
			}
			return selectL;
		}
		
		/**
		 * 品目製造指図を取得する
		 * @return
		 */
		protected MCList<MST_ITM_MFG_INST_R> getItmMfgInst() {
			MCList<MfgInstReg_Chk01_HdrR> subL = MCList.create(MfgInstReg_Chk01_HdrR.class);
			for (MfgInstReg_Chk01_HdrR r : up0()) {
				if (!isNull(r.itm_mfg_inst_no())) {
					subL.add(r);
				}
			}
			MCList<MST_ITM_MFG_INST_R> selectL = MCList.create(MST_ITM_MFG_INST_R.class);
			MST_ITM_MFG_INST_R t = MST_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.itm_mfg_inst_no,
					t.bom_ptn,
					t.itm_ord_no,
					t.frst_mfg_inst_no,
					t.mfg_mtd_typ,
					t.itm_cd,
					t.itm_sub1,
					t.itm_sub2,
					t.itm_sub3,
					t.lot_no,
					t.sublot_no,
					t.sno1,
					t.sno2,
					t.sno3,
					t.sno4,
					t.base_unit_inst_qty,
					t.io_schd_pr_no,
					t.unschd_inst_flg,
					t.unschd_act_flg,
					t.mfg_loc_cd,
					t.strg_loc_cd,
					t.wg_cd,
					t.site_cd,
					t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.itm_mfg_inst_no);
			MCList<MfgInstReg_Chk01_HdrR> bindL = subL
					.groupBy(MfgInstReg_Chk01_HdrR.$itm_mfg_inst_no);
			bindL.sort(MfgInstReg_Chk01_HdrR.$itm_mfg_inst_no);
			if (!bindL.isEmpty()) {
				dbSelectKeyForUpdateNoWait("MSBCL6000_MST_ITM_MFG_INST_S01", selectL, selectL_bldr, bindL);
			}
			return selectL;
		}
		
		/**
		 * 製造指図を取得する
		 * @return
		 */
		protected MCList<MST_MFG_INST_R> getMfgInst() {
			MCList<MfgInstReg_Chk01_HdrR> bindL = MCList.create(MfgInstReg_Chk01_HdrR.class);
			for (MfgInstReg_Chk01_HdrR r : up0()) {
				if (!isNull(r.mfg_inst_no())) {
					bindL.add(r);
				}
			}
			MCList<MST_MFG_INST_R> wkL = MCList.create(MST_MFG_INST_R.class);
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_MFG_INST_R.create("T"));
			if (!isNull(bindL)) {
				dbWkDelete("MSBCL6000_MSW_MFG_INST_D01", wkL_bldr.getBaseDbc());
				bindL.distinctNE(MfgInstReg_Chk01_HdrR.$mfg_inst_no).forEach(r -> {
					wkL.add().mfg_inst_no(r.mfg_inst_no());
				});
				dbWkInsert("MSBCL6000_MSW_MFG_INST_I01", wkL, wkL_bldr.getBaseDbc());
			}

			MCList<MST_MFG_INST_R> selectL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t1 = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t1);
			MSVT_MFG_INST_PR_R t2 = MSVT_MFG_INST_PR_R.create("T2");
			MST_ARR_PR_R t3 = MST_ARR_PR_R.create("T3");
			MSW_MFG_INST_KEY_R w = MSW_MFG_INST_KEY_R.create("W");
			selectL_bldr.setSelect(t1.mfg_inst_no,
					t1.itm_mfg_inst_no,
					t1.mfg_inst_rev,
					t1.po_d_no,
					t1.mfg_inst_unit_typ,
					t1.base_unit_inst_qty,
					t1.inst_dt,
					t1.inst_prnt_flg,
					t1.aprv_flg,
					t1.po_auto_reg_flg,
					t1.mfg_aprv_sts_typ,
					t1.mfg_aprv_role_cd,
					t1.abort_flg,
					t1.can_flg,
					t1.upd_cntr);
			selectL_bldr.addSelect(t2.mfg_sts_typ, t3.arr_pr_no);
			selectL_bldr.addInnerJoin(t2, bracket(t1.mfg_inst_no.eq(t2.mfg_inst_no)));
			selectL_bldr.addLeftOuterJoin(t3, bracket(t3.po_d_no.eq(t1.po_d_no)));
			selectL_bldr.addInnerJoin(w, bracket(w.mfg_inst_no.eq(t1.mfg_inst_no)));
			selectL_bldr.setOrderByAsc(t1.mfg_inst_no);
			selectL_bldr.addLockTable(t1.mfg_inst_no);
			if (!isNull(bindL)) {
				dbSelectForUpdateNoWait("MSBCL6000_MSW_MFG_INST_S01", selectL, selectL_bldr);
				dbWkDelete("MSBCL6000_MSW_MFG_INST_D02", wkL_bldr.getBaseDbc());
			}
			
			lockArrPr(selectL);
			
			return selectL;
		}
		
		protected void lockArrPr(MCList<MST_MFG_INST_R> selectL) {
			MCList<MST_ARR_PR_R> arrBindL = MCList.create(MST_ARR_PR_R.class);
			for (MST_MFG_INST_R selR : selectL) {
				String arrPrNo = selR.getStringNE(MST_ARR_PR_R.$arr_pr_no);
				if (!isNull(arrPrNo)) {
					MST_ARR_PR_R tmp = MST_ARR_PR_R.create();
					tmp.arr_pr_no(arrPrNo);
					arrBindL.add(tmp);
				}
			}
			if (!arrBindL.isEmpty()) {
				MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
				MCQueryApiBuilder arrBuilder = MCQueryApiBuilder.create(t);
				arrBuilder.setSelect(t.arr_pr_no);
				arrBuilder.setOrderByAsc(t.arr_pr_no);
				dbSelectKeyForUpdateNoFetch("MSBCL6000_MST_ARR_PR_S01", arrBuilder, arrBindL);
			}
		}
		
		/**
		 * 発注予定を取得する
		 * @return
		 */
		protected MCList<MST_PO_SCHD_R> getPoSchd() {
			MCList<MfgInstReg_Chk01_HdrR> subL = MCList.create(MfgInstReg_Chk01_HdrR.class);
			for (MfgInstReg_Chk01_HdrR r : up0()) {
				if (!isNull(r.itm_ord_no()) && MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())) {
					subL.add(r);
				}
			}
			MCList<MST_PO_SCHD_R> selectL = MCList.create(MST_PO_SCHD_R.class);
			MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.outsrc_itm_ord_no, 
					t.po_d_no,
					t.po_schd_src_typ,
					t.po_schd_src_no,
					t.slo_d_no,
					t.dlv_cd,
					t.base_unit_qty,
					t.in_to_loc_cd,
					t.rqst_can_flg);
			selectL_bldr.setWhere(t.outsrc_itm_ord_no.eq(bind("itm_ord_no")));
			selectL_bldr.addWhereWithAnd(t.po_d_no.isNull());
			selectL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());
			MCList<MfgInstReg_Chk01_HdrR> bindL = subL
					.groupBy(MfgInstReg_Chk01_HdrR.$itm_ord_no);
			if (!bindL.isEmpty()) {
				dbSelectForUpdate("MSBCL6000_MST_PO_SCHD_S01", selectL, selectL_bldr, bindL);
			}
			return selectL;
		}

		/**
		 * 発注明細を取得する
		 * @return
		 */
		protected MCList<MST_PO_D_R> getPoD() {
			MCList<MfgInstReg_Chk01_HdrR> subL = MCList.create(MfgInstReg_Chk01_HdrR.class);
			for (MfgInstReg_Chk01_HdrR r : up0()) {
				if (!isNull(r.itm_ord_no()) && MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())) {
					subL.add(r);
				}
			}
			MCList<MST_PO_D_R> selectL = MCList.create(MST_PO_D_R.class);
			MST_PO_D_R t = MST_PO_D_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.outsrc_itm_ord_no, t.po_d_no, 
					t.slo_d_no, t.base_unit_qty, t.rqst_can_flg);
			selectL_bldr.setWhere(t.outsrc_itm_ord_no.eq(bind("itm_ord_no")));
			selectL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());
			MCList<MfgInstReg_Chk01_HdrR> bindL = subL.groupBy(MfgInstReg_Chk01_HdrR.$itm_ord_no);
			if (!bindL.isEmpty()) {
				dbSelectForUpdate("MSBCL6000_MST_PO_D_S01", selectL, selectL_bldr, bindL);
			}
			return selectL;
		}
		
		/**
		 * 再入荷予定を取得する
		 * @return
		 */
		protected MCList<MST_ARR_SCHD_R> getReArrSchd(MCList<MST_PO_D_R> podL) {
			MCList<MST_ARR_SCHD_R> selectL = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
			selectL_bldr.setSelect(t.mfg_inst_no, t.arr_schd_no, t.base_unit_qty);
			selectL_bldr.addSelect(t2.po_d_no);
			selectL_bldr.addInnerJoin(t2, bracket( t.arr_pr_no.eq(t2.arr_pr_no)));
			selectL_bldr.setWhere(t2.po_d_no.eq(bind("po_d_no")));
			selectL_bldr.addWhereWithAnd(t.re_arr_schd_flg.eq(value(true)));
			selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());
			if (!podL.isEmpty()) {
				dbSelectForUpdate("MSBCL6000_MST_ARR_SCHD_S01", selectL, selectL_bldr, podL.groupBy(MST_PO_D_R.$po_d_no));
			}
			return selectL;
		}
		
		/**
		 * 同じ品目製造指図ＮＯに紐付く他の製造指図を取得する
		 * @return
		 */
		protected MCList<MST_MFG_INST_R> getOtherMfgInst() {
			MCList<MfgInstReg_Chk01_HdrR> bindL = MCList.create(MfgInstReg_Chk01_HdrR.class);
			for (MfgInstReg_Chk01_HdrR r : up0()) {
				if (!isNull(r.mfg_inst_no())) {
					bindL.add(r);
				}
			}
			MCList<MST_MFG_INST_R> selectL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.mfg_inst_no, t.itm_mfg_inst_no);
			selectL_bldr.addWhereWithAnd(t.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
			selectL_bldr.addWhereWithAnd(t.mfg_inst_no.neq(bind("mfg_inst_no")));
			selectL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			bindL.sort(MfgInstReg_Chk01_HdrR.$mfg_inst_no);
			if (!bindL.isEmpty()) {
				dbSelect("MSBCL6000_MST_MFG_INST_S02", selectL, selectL_bldr, bindL);
			}
			return selectL;
		}
		
		/**
		 * 品目オーダＮＯに紐付く品目製造指図を取得する
		 * @return
		 */
		protected MCList<MST_ITM_MFG_INST_R> getItmMfgInstByItmOrdNo() {
			MCList<MfgInstReg_Chk01_HdrR> bindL = MCList.create(MfgInstReg_Chk01_HdrR.class);
			for (MfgInstReg_Chk01_HdrR r : up0()) {
				if (!isNull(r.itm_ord_no())) {
					bindL.add(r);
				}
			}
			MCList<MST_ITM_MFG_INST_R> selectL = MCList.create(MST_ITM_MFG_INST_R.class);
			MST_ITM_MFG_INST_R t = MST_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.itm_mfg_inst_no);
			selectL_bldr.addSelect(t.itm_ord_no);
			selectL_bldr.addSelect(t.base_unit_inst_qty);
			selectL_bldr.setWhere(t.itm_ord_no.eq(bind("itm_ord_no")));
			selectL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			if (!bindL.isEmpty()) {
				dbSelect("MSBCL6000_MST_ITM_MFG_INST_S02", selectL, selectL_bldr, bindL);
			}
			
			return selectL;
		}
		
		/**
		 * 品目製造指図ＮＯに紐付く製造指図を取得する
		 * @return
		 */
		protected MCList<MST_MFG_INST_R> getMfgInstByItmMfgInstNo(MCList<MST_ITM_MFG_INST_R> bindL) {
			MCList<MST_MFG_INST_R> selectL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.itm_mfg_inst_no, t.po_auto_reg_flg);
			selectL_bldr.setWhere(t.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")).and(t.can_flg.eq(value(false))));
			dbSelect("MSBCL6000_MST_MFG_INST_S01", selectL, selectL_bldr, bindL);
			
			return selectL;
		}

		protected MCMessageList chkAndCompHdrBaseSub(MfgInstReg_Chk01_HdrR r,
				MST_ITM_ORDER_R ioR, MST_ITM_MFG_INST_R imiR, MST_MFG_INST_R miR,
				MCList<MST_ITM_MFG_INST_R> sameIoNoImiL,
				MCList<MST_MFG_INST_R> sameItmMfgInstNoMiL,
				MST_PO_SCHD_R poSchdR, MST_PO_D_R podR,
				MCList<MST_ARR_SCHD_R> reArrSchdSubL,
				MCList<MST_MFG_INST_R> otherMiSubL) {

			MCMessageList msgL = new MCMessageList();
			
			// 品目オーダから補完
			if (!isNull(ioR)) {
				// 製造指図単位区分
				// ※新規登録時はこの後のリストロジックで補完するが、品目オーダが登録済みであれば品目オーダの値を優先する
				// (後の処理でリストロジックで上書きされないように考慮している)
				// 品目オーダのある外注製造指図の場合は常に「品目単位」で補完する
				// 品目オーダが存在しつつ製造指図単位区分がnullである場合があるため
				if(MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())) {
					r.mfg_inst_unit_typ(MAC_MFG_INST_UNIT_TYP.ITM.value());
				}
				else {
					r.mfg_inst_unit_typ(ioR.mfg_inst_unit_typ());
				}
				r.io_schd_pr_no(ioR.io_schd_pr_no());
				if (isNull(ioR.getNumberNE("TMP_SUM_INST_QTY"))) {
					r.old_sum_inst_qty(0);
				}
				else {
					r.old_sum_inst_qty(ioR.getNumberNE("TMP_SUM_INST_QTY"));
				}
				
				// バッチから実行された場合はDACチェックしない
				if (!r.is_src_batch_flg() && MAC_DATA_CRUD_TYP.isCRT(r.itm_mfg_inst_data_crud_typ())) {
					ioR.setAttributes(r);
					msgL.addAll(checkWritableLocCdDac(ioR, MST_ITM_ORDER_R.$mfg_loc_cd));
				}
				
				if (MAC_DATA_CRUD_TYP.isDEL(r.itm_mfg_inst_data_crud_typ())) {
					// 取り消し前の未指図数が0かつ、品目製造指図数の合計が品目オーダの指図数よりも小さい＝未指図打切済み
					if (ioR.not_inst_qty().isZero() && r.old_sum_inst_qty().lt(ioR.inst_qty()) && MSC_MFG_MTD_TYP.isINTNL(r.mfg_mtd_typ())) {
						// 仮に取消を許すと、同時に未指図打ち切りが復活してしまうが、
						// 分かりづらい挙動のため先に未指図打切りを取り消す想定とする
						msgL.add(new MCMessage(r, null, MSBCL1122, r.mfg_inst_no(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}
			
			// 品目製造指図から補完
			if (!isNull(imiR)) {
				r.itm_ord_no(imiR.itm_ord_no());
				r.mfg_mtd_typ(imiR.mfg_mtd_typ());
				r.frst_mfg_inst_no(imiR.frst_mfg_inst_no());
				r.itm_cd(imiR.itm_cd());
				r.itm_sub1(imiR.itm_sub1());
				r.itm_sub2(imiR.itm_sub2());
				r.itm_sub3(imiR.itm_sub3());
				r.old_bom_ptn(imiR.bom_ptn());
				r.old_lot_no(imiR.lot_no());
				r.old_sublot_no(imiR.sublot_no());
				r.unschd_inst_flg(imiR.unschd_inst_flg());
				r.unschd_act_flg(imiR.unschd_act_flg());
				// 指図済みの場合は、（同じ値が設定されているが）品目オーダではなく品目製造指図から補完するため上書きする
				r.io_schd_pr_no(imiR.io_schd_pr_no());
				// WGCDと工場・物流倉庫は削除時に必要なためここで補完しているが、登録・訂正時には、リストロジックによって上書きされる
				r.mfg_loc_cd(imiR.mfg_loc_cd());
				r.mfg_loc_site_cd(imiR.site_cd());
				r.mfg_loc_wg_cd(imiR.wg_cd());
				
				// バッチから実行された場合はDACチェックしない
				if (!r.is_src_batch_flg()) {
					imiR.setAttributes(r);
					msgL.addAll(checkWritableLocCdDac(imiR, MST_ITM_MFG_INST_R.$mfg_loc_cd));
				}
				
				if (MAC_DATA_CRUD_TYP.isDEL(r.itm_mfg_inst_data_crud_typ())) {
					r.sno1(imiR.sno1());
					r.sno2(imiR.sno2());
					r.sno3(imiR.sno3());
					r.sno4(imiR.sno4());
				}
			}
			else {
				// 計画外指図ＦＬＧ
				if (isNull(r.itm_ord_no()) || r.unschd_act_flg()) {
					// 計画外製造実績ＦＬＧは呼出元から渡される想定のため、本処理では設定不要
					r.unschd_inst_flg(true);
				}
				else {
					r.unschd_inst_flg(false);
				}
			}
			
			// 製造指図から補完
			if (!isNull(miR)) {
				r.itm_mfg_inst_no(miR.itm_mfg_inst_no());
				String sts = miR.getString("mfg_sts_typ");
				r.old_mfg_sts_typ(sts);
				r.old_mfg_aprv_sts_typ(miR.mfg_aprv_sts_typ());
				r.old_mfg_aprv_role_cd(miR.mfg_aprv_role_cd());
				r.old_inst_dt(miR.inst_dt());
				r.old_aprv_flg(miR.aprv_flg());
				r.old_inst_abort_flg(miR.abort_flg());
				r.old_mfg_inst_rev(miR.mfg_inst_rev());
				if (!r.old_inst_abort_flg()) {
					if (MSC_MFG_STS_TYP.isSTT(sts) || MSC_MFG_STS_TYP.isCMPL(sts)) {
						r.mfg_sts_typ(sts);
						// 実績登録済みの製造指図の取消は不可
						if (MAC_DATA_CRUD_TYP.isDEL(r.mfg_inst_data_crud_typ()) || r.not_frst_inst_can_flg()) {
							msgL.add(new MCMessage(r, null, MSBCL1125, r.mfg_inst_no(), toDispGUIIndex(r)));
							r.err_flg(true);
						}
					}
				}
				if (miR.inst_prnt_flg() && !MAC_DATA_CRUD_TYP.isDEL(r.mfg_inst_data_crud_typ())
						&& !r.inst_abort_flg() && !r.old_inst_abort_flg()) {
					if (r.is_src_alloc_flg()) {
						initInptSchdCacheForUpd01(r);
					} else {
						// 発行済みデータを訂正する場合は、改訂番号を上げる
						r.mfg_inst_rev(miR.mfg_inst_rev().add(1));
					}
				}
				else {
					r.mfg_inst_rev(miR.mfg_inst_rev());
					if (r.is_src_alloc_flg()) {
						initInptSchdCacheForUpd01(r);
					}
					else if (!MAC_DATA_CRUD_TYP.isDEL(r.mfg_inst_data_crud_typ())) {
						if (MSC_MFG_STS_TYP.isORD(r.mfg_sts_typ())
								|| MSC_MFG_STS_TYP.isSTT(r.mfg_sts_typ())
								|| MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ())) {
							MCList<MfgInstReg_Chk01_DtlOperR> operL = _operCacheForHdr
									.getCache(r.peg_no());
							if (!isNull(operL.getFirst(MfgInstReg_Chk01_DtlOperR.$mes_flg, true))) {
								r.mfg_inst_rev(miR.mfg_inst_rev().add(1));
							}
						}
					}
				}
				
				// 外注関連
				// ※外注発注時に自動作成される場合、これらの項目は呼出元から設定される想定
				// （製造指図登録画面から更新した場合は、呼出元から設定されないため補完している）
				r.po_auto_reg_flg(miR.po_auto_reg_flg());
				
				if (r.inst_abort_flg() && r.old_inst_abort_flg()) {
					msgL.add(new MCMessage(r, null, MSBCL1087, r.mfg_inst_no(), toDispGUIIndex(r)));
					r.err_flg(true);
				}
				
				// 取消済の製造指図の訂正・取消は不可
				if (miR.can_flg()) {
					msgL.add(new MCMessage(r, null, MSBCL1103, r.mfg_inst_no(), toDispGUIIndex(r)));
					r.err_flg(true);
				}
				
				// 指図承認済みの製造指図の訂正・取消は不可
				if (MSC_MFG_APRV_STS_TYP.isINST_ACPT(miR.mfg_aprv_sts_typ())) {
					msgL.add(new MCMessage(r, null, MSBCL1124, r.mfg_inst_no(), toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			
			// 計画変更ＦＬＧ
			r.schd_chg_flg(isSchdChg(r, ioR));
			
			// 指図書関連
			r.inst_prnt_tm(null);
			r.inst_prnt_flg(false);
			if (isNull(r.mfg_inst_rev()) || isSame(r.mfg_inst_rev(), MCNumber.ONE)) {
				r.chg_list_immed_prnt_flg(false);
			}
			
			// 品目オーダＮＯ単位での製造指図数量の合計値
			MCNumber sumItmMfgInstQtyByIoNo = getSumItmMfgInstQtyByIoNo(r, sameIoNoImiL);
			
			// 発注、入荷関連
			if (MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())) {
				// 発注明細が存在する（＝発注済）の場合
				if (!isNull(podR)) {
					// 発注明細ＮＯを設定
					r.po_d_no(podR.po_d_no());
	
					// 取消時
					if (MAC_DATA_CRUD_TYP.isDEL(r.itm_mfg_inst_data_crud_typ())) {
						// 発注済の製造指図が取消可能かどうかのチェック
						if (!canPoOutSrcMfgInstDel(sameIoNoImiL)) {
							msgL.add(new MCMessage(r, null, MSBCL1040, r.po_d_no(),
									toDispGUIIndex(r)));
							r.err_flg(true);
						}
						if (isDlvInstPrmsRcpt(r.mfg_inst_no())) {
							msgL.add(new MCMessage(r, null, MSBCL1312, r.po_d_no(),
									toDispGUIIndex(r)));
							r.err_flg(true);
						}
					}
					// 追加・更新時
					else {
						// 同一品目オーダＮＯから発生した製造指図があれば、発注時自動生成ＦＬＧの値を引き継ぐ
						if (!isNull(sameItmMfgInstNoMiL) && !sameItmMfgInstNoMiL.isEmpty()) {
							r.po_auto_reg_flg((boolean)sameItmMfgInstNoMiL.max(MST_MFG_INST_R.$po_auto_reg_flg));
						}

						// 発注数、再入荷数に対する製造指図数のチェック
						msgL.addAll(chkInstQtyExceededPoAndReArrQty(r, podR.base_unit_qty(),
										nvl(reArrSchdSubL.sum(MST_ARR_SCHD_R.$base_unit_qty),
												MCNumber.ZERO),	sumItmMfgInstQtyByIoNo));
						
						// 納入指示、及び納期回答受領の数量に対する製造指図数のチェック
						msgL.addAll(chkInstQtyExceededDlvInstAndPrmsRcptQty(r));
						
						// 受注紐付き時の手配ＮＯ変更チェック
						chkSnoPeggedBySlo(r, imiR, podR.slo_d_no(), podR.rqst_can_flg(), msgL);
					}
				}
				
				// 未発注の発注予定が存在する（＝発注前）の場合　※発注予定は発注明細ＮＯ IS NULLで抽出しているため、未発注の場合のみpoSchdRが存在する
				if (!isNull(poSchdR)) {
					// 発注元作成情報の設定
					r.po_schd_src_typ(poSchdR.po_schd_src_typ());
					r.po_schd_src_no(poSchdR.po_schd_src_no());
					
					if (!MAC_DATA_CRUD_TYP.isDEL(r.itm_mfg_inst_data_crud_typ())) {
						// 外注の場合は工程単位製造指図にならないため、not_frst_inst_can_flgの条件は不要
						// 受注紐付き時の手配ＮＯ変更チェック
						chkSnoPeggedBySlo(r, imiR, poSchdR.slo_d_no(), poSchdR.rqst_can_flg(), msgL);
						
						// 仕入直送時の納入場所、数量変更チェック
						if (!isNull(poSchdR.dlv_cd())) {
							if (!isSame(r.base_unit_inst_qty(),
									poSchdR.base_unit_qty())) {
								msgL.add(new MCMessage(r, null, MSBCL1113,
										r.mfg_inst_no(), poSchdR.base_unit_qty(),
										toDispGUIIndex(r)));
							}
							if (!isSame(r.strg_loc_cd(), poSchdR.in_to_loc_cd())) {
								msgL.add(
										new MCMessage(r, null, MSBCL1114, r.mfg_inst_no(),
												poSchdR.in_to_loc_cd(), toDispGUIIndex(r)));
							}
						}
					}
				}

				// 発注明細、未発注の発注予定のいずれも存在しない場合
				if (isNull(podR) && isNull(poSchdR)) {
					// 計画外外注の場合
					if (r.unschd_inst_flg()) {
						// 発注元作成情報の設定
						r.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.MFG_INST.value());
						// 発注予定作成元ＮＯ（製造指図ＮＯ）はUpdが設定する
					}
				}
				
				// 発注予定データ更新区分の設定
				r.po_schd_data_crud_typ(getPoSchdDataCrudTyp(r));
			}
			
			// オーダ数量関連項目
			if (r.unschd_inst_flg()) {
				// 計画外製造指図の場合は未指図工程を打ち切ることができない
				if (r.ord_abort_flg()) {
					msgL.add(new MCMessage(r, null, MSBCL1101, r.mfg_inst_no(), toDispGUIIndex(r)));
					r.err_flg(false);
				}

				if (!isNull(r.po_d_no())) {
					// 計画外の外注製造指図であっても、既に発注済の場合、品目オーダの数量は変更しない
					// （製造指図を分割するために数量を変更している場合があるため） 
					// ※Updオペレーションで品目オーダ登録処理を実行する際にも、同様の分岐があるため本処理を修正する場合は、そちらの影響も確認すること
					r.base_unit_ord_qty(ioR.inst_qty());
					r.base_unit_not_inst_qty(getNotInstQty(r, ioR, sumItmMfgInstQtyByIoNo, podR, reArrSchdSubL));
					r.ord_abort_flg(false);
				}
				else {
					r.base_unit_ord_qty(r.base_unit_inst_qty());
					r.base_unit_not_inst_qty(0);
					r.ord_abort_flg(false);
				}
			}
			else {
				if (!isNull(ioR)) {
					r.base_unit_ord_qty(ioR.inst_qty());
					r.base_unit_not_inst_qty(getNotInstQty(r, ioR, sumItmMfgInstQtyByIoNo, podR, reArrSchdSubL));
				}
			}
			
			// 工程単位製造指図で対象工程が存在するかどうかのチェック
			if (!MAC_DATA_CRUD_TYP.isDEL(r.mfg_inst_data_crud_typ())) {
				MCList<MfgInstReg_Chk01_DtlOperR> operL = _operCacheForHdr.getCache(r.peg_no());
				if (isNull(operL.getFirst(MfgInstReg_Chk01_DtlOperR.$tgt_oper_flg, true))) {
					msgL.add(new MCMessage(r, null, MSBCL1034, toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			
			// 工程単位製造指図で同じ品目製造指図ＮＯに紐付く他の取消前製造指図が存在するかどうかのチェック
			if (MAC_DATA_CRUD_TYP.isDEL(r.mfg_inst_data_crud_typ())
					&& isSame(r.mfg_inst_no(), r.frst_mfg_inst_no())
					&& !otherMiSubL.isEmpty()) {
				// 自分が初回製造指図の場合、取消前の他の製造指図が存在する場合はエラー
				msgL.add(new MCMessage(r, null, MSBCL1109, r.mfg_inst_no(), r.itm_mfg_inst_no(), toDispGUIIndex(r)));
				r.err_flg(true);
			}
			
			// 工程単位製造指図で未指図打切可能かどうかのチェック
			if (MAC_DATA_CRUD_TYP.isUPD(r.mfg_inst_data_crud_typ()) && r.ord_abort_flg()) {
				if (!isSame(r.mfg_inst_no(), r.frst_mfg_inst_no())) {
					msgL.add(new MCMessage(r, null, MSBCL1129, r.mfg_inst_no(), toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			
			// 予定日補正フラグがオンの場合、対象工程の着手日時の最小値、終了日時の最大値をヘッダに反映する
			if (r.comp_dt_from_oper_flg()) {
				MCList<MfgInstReg_Chk01_DtlOperR> operL = _operCacheForHdr.getCache(r.peg_no());
				operL = operL.subList(operR -> operR.tgt_oper_flg() && !operR.isStatusDelete());
				r.st_schd_tm((MCDate) operL.min(MfgInstReg_Chk01_DtlOperR.$st_schd_tm));
				r.end_schd_tm((MCDate) operL.max(MfgInstReg_Chk01_DtlOperR.$end_schd_tm));
			}
			
			return msgL;
		}
		
		protected void chkSnoPeggedBySlo(MfgInstReg_Chk01_HdrR r, MST_ITM_MFG_INST_R imiR,
				String slodNo, boolean rqst_can_flg, MCMessageList msgL) {
			if (rqst_can_flg) {
				return;
			}

			// 受注紐付きの場合は手配ＮＯを変更不可とする
			if (!isNull(imiR) && !isNull(slodNo)) {
				if (!isSame(r.sno1(), imiR.sno1())) {
					msgL.add(new MCMessage(r, null, MSBCL1106, slodNo,
							getLabel(r, MfgInstReg_Chk01_HdrR.$sno1), imiR.sno1(),
							toDispGUIIndex(r)));
					r.err_flg(true);
				}
				if (!isSame(r.sno2(), imiR.sno2())) {
					msgL.add(new MCMessage(r, null, MSBCL1106, slodNo,
							getLabel(r, MfgInstReg_Chk01_HdrR.$sno2), imiR.sno2(),
							toDispGUIIndex(r)));
					r.err_flg(true);
				}
				if (!isSame(r.sno3(), imiR.sno3())) {
					msgL.add(new MCMessage(r, null, MSBCL1106, slodNo,
							getLabel(r, MfgInstReg_Chk01_HdrR.$sno3), imiR.sno3(),
							toDispGUIIndex(r)));
					r.err_flg(true);
				}
				if (!isSame(r.sno4(), imiR.sno4())) {
					msgL.add(new MCMessage(r, null, MSBCL1106, slodNo,
							getLabel(r, MfgInstReg_Chk01_HdrR.$sno4), imiR.sno4(),
							toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
		}
		
		/**
		 * 発注済の外注製造指図を取り消し可能か否かを返す
		 * @return
		 */
		protected boolean canPoOutSrcMfgInstDel(MCList<MST_ITM_MFG_INST_R> imiL) {
			Set<String> rem = new HashSet<String>();
			for (MST_ITM_MFG_INST_R imiR : imiL) {
				rem.add(imiR.itm_mfg_inst_no());
			}
			
			Set<String> upDel = new HashSet<String>();
			for (MfgInstReg_Chk01_HdrR upHdrR : up0().subList(
					MfgInstReg_Chk01_HdrR.$itm_mfg_inst_data_crud_typ,
					MAC_DATA_CRUD_TYP.DEL.value())) {
				upDel.add(upHdrR.itm_mfg_inst_no());
			}
			rem.removeAll(upDel);
			if (!rem.isEmpty()) {
				// まだ残っている場合は取り消し可能
				return true;
			}
			// 分割分も含め全件なくなる場合は取り消し不可
			return false;
		}
		
		/**
		 * 製造指図に紐づく、納入指示または納期回答受領が登録されている場合にtrueを返す
		 * @return
		 */
		protected boolean isDlvInstPrmsRcpt(String mfgInstNo) {
			// 納入指示
			if (!isNull(getDlvInstDCache(mfgInstNo))) {
				return true;
			}
			
			// 納期回答受領
			if (!isNull(getPrmsRcptDCache(mfgInstNo))) {
				return true;
			}
			
			return false;
		}
		
		protected MCMessageList chkInstQtyExceededPoAndReArrQty(MfgInstReg_Chk01_HdrR r,
				MCNumber poQty, MCNumber reArrSchdQty, MCNumber sumItmMfgInstQtyByIoNo) {
						MCMessageList msgL = new MCMessageList();
			if (reArrSchdQty.isZero()) {
				if (sumItmMfgInstQtyByIoNo.gt(poQty)) {
					msgL.add(new MCMessage(r, null, MSBCL1072, poQty,
							r.base_unit_inst_qty(),
							sumItmMfgInstQtyByIoNo.subtract(r.base_unit_inst_qty()),
							toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			else {
				if (sumItmMfgInstQtyByIoNo.gt(poQty.add(reArrSchdQty))) {
					msgL.add(new MCMessage(r, null, MSBCL1090, poQty, reArrSchdQty,
							r.base_unit_inst_qty(),
							sumItmMfgInstQtyByIoNo.subtract(r.base_unit_inst_qty()),
							toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			return msgL;
		}
		
		protected MCMessageList chkInstQtyExceededDlvInstAndPrmsRcptQty(MfgInstReg_Chk01_HdrR r) {
			MCMessageList msgL = new MCMessageList();
			
			// 納入指示の数量のチェック
			MCList<MST_DLV_INST_D_R> dlvInstDL = getListDlvInstDCache(r.mfg_inst_no());
			if (!isNull(dlvInstDL) && !dlvInstDL.isEmpty()) {
				MCNumber dlvInstQty = dlvInstDL.sum(MST_DLV_INST_D_R.$base_unit_qty);
				if (dlvInstQty.gt(r.base_unit_inst_qty())) {
					msgL.add(new MCMessage(r, null, MSBCL1313, dlvInstQty, r.base_unit_inst_qty(),
							r.po_d_no(), toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			
			// 納期回答受領の数量のチェック
			MCList<MST_PRMS_RCPT_D_R> prmsRcptDL = getListPrmsRcptDCache(r.mfg_inst_no());
			if (!isNull(prmsRcptDL) && !prmsRcptDL.isEmpty()) {
				MCNumber prmsRcptQty = prmsRcptDL.sum(MST_PRMS_RCPT_D_R.$base_unit_qty);
				if (prmsRcptQty.gt(r.base_unit_inst_qty())) {
					msgL.add(new MCMessage(r, null, MSBCL1314, prmsRcptQty, r.base_unit_inst_qty(),
							r.po_d_no(), toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			return msgL;
		}
		
		protected MCNumber getSumItmMfgInstQtyByIoNo(MfgInstReg_Chk01_HdrR r,
				MCList<MST_ITM_MFG_INST_R> sameIoNoImiL) {
			// 品目オーダ単位での品目製造指図の合計数量（打切は指図数量に含める）
			MCNumber sumInstQty = nvl(sameIoNoImiL.sum(MST_ITM_MFG_INST_R.$base_unit_inst_qty), MCNumber.ZERO);
			
			MCIndexKey idxkey = sameIoNoImiL.createIndex(MST_ITM_MFG_INST_R.$itm_mfg_inst_no);
			for (MfgInstReg_Chk01_HdrR sameItmOrdR : up0().subList(MfgInstReg_Chk01_HdrR.$itm_ord_no, r.itm_ord_no())) {
				MST_ITM_MFG_INST_R dbR = sameIoNoImiL.getFirst(idxkey, sameItmOrdR.itm_mfg_inst_no());
				
				if (!isNull(dbR)) {
					if (!r.inst_abort_flg() && !r.not_frst_inst_can_flg()) {
						// 既存の製造指図場合は、DBから取得した値を引く
						sumInstQty = sumInstQty.subtract(dbR.base_unit_inst_qty());
					}
				}
				if (!MAC_DATA_CRUD_TYP.isDEL(sameItmOrdR.itm_mfg_inst_data_crud_typ())
						&& !r.not_frst_inst_can_flg()
						&& !sameItmOrdR.not_frst_inst_reg_oper_flg()) {
					if (!r.inst_abort_flg()) {
						// 上り電文の製造指図数量を足す
						sumInstQty = sumInstQty.add(sameItmOrdR.base_unit_inst_qty());
					}
				}
			}
			return sumInstQty;
		}
		
		protected String getPoSchdDataCrudTyp(MfgInstReg_Chk01_HdrR r) {
			if (!isNull(r.po_d_no()) || r.is_src_alloc_flg()) {
				// 発注済の場合、または引当だけ実行する場合、更新しない
				return null;
			}
			if (!r.unschd_inst_flg()) {
				return MAC_DATA_CRUD_TYP.UPD.value();
			}
			else {
				return r.itm_mfg_inst_data_crud_typ();
			}
		}
		
		/**
		 * 未指図数量を計算する
		 * @return
		 */
		protected MCNumber getNotInstQty(MfgInstReg_Chk01_HdrR r, MST_ITM_ORDER_R ioR,
				MCNumber sumItmMfgInstQtyByIoNo, MST_PO_D_R podR,
				MCList<MST_ARR_SCHD_R> reArrSchdSubL) {
			if (isNull(podR) && !MAC_DATA_CRUD_TYP.isDEL(r.itm_mfg_inst_data_crud_typ()) && r.ord_abort_flg()) {
				// 未指図打切がオンの場合、0
				return MCNumber.ZERO;
			}
			
			// 外注で発注済みの場合は発注数量＋再入荷予定数量、それ以外の場合は品目オーダの指図数量を元数として算出する
			MCNumber ordQty = MCNumber.ZERO;
			if (!isNull(podR)) {
				ordQty = podR.base_unit_qty().add(nvl(
						reArrSchdSubL.sum(MST_ARR_SCHD_R.$base_unit_qty), MCNumber.ZERO));
			}
			else {
				ordQty = ioR.inst_qty();
			}
				
			// 発注数量または品目オーダの指図数量 - 品目製造指図の合計数量
			MCNumber ret = ordQty.subtract(sumItmMfgInstQtyByIoNo);
			if (ret.isNegative()) {
				return MCNumber.ZERO; 
			}
			return ret;
		}
		
		/**
		 * 計画変更ＦＬＧをオンにするかどうか
		 * @return
		 */
		protected boolean isSchdChg(MfgInstReg_Chk01_HdrR r, MST_ITM_ORDER_R ioR) {
			// 工程単位指図の場合は、後の処理で評価し直される
			// （この段階ではマスタ補完のリストロジックが実行されていないので、新規登録時に製造指図単位区分が取得されていない）
			if (isNull(ioR)) {
				return true;
			}
			if (r.unschd_inst_flg()) {
				return true;
			}
			if (r.inst_abort_flg()) {
				// 打切は計画変更
				return true;
			}
			if (isNull(r.st_schd_tm()) || isNull(r.end_schd_tm())) {
				// まだ必須チェックが終わっていないので、nullか否かを考慮している
				return true;
			}
			
			// 数量、着手予定日、終了予定日が異なれば計画変更とみなす
			if (!isSame(r.base_unit_inst_qty(), ioR.inst_qty())) {
				return true;
			}
			if (!isSame(r.st_schd_tm().startTimeOfDay(), ioR.mfg_st_schd_dt()
					.startTimeOfDay())) {
				return true;
			}
			if (!isSame(r.end_schd_tm().startTimeOfDay(), ioR.mfg_end_schd_dt()
					.startTimeOfDay())) {
				return true;
			}
			return false;
		}
		
		protected MCMessageList chkAndCompOperBase() {
			MCMessageList msgL = new MCMessageList();
			
			// 工程オーダの取得
			MCList<MST_OPER_ORDER_R> ooL = MCList.create(MST_OPER_ORDER_R.class);
			MST_OPER_ORDER_R t = MST_OPER_ORDER_R.create("T");
			MCQueryApiBuilder ooL_bldr = MCQueryApiBuilder.create(t);
			ooL_bldr.setSelect(t.oper_ord_no,
					t.st_schd_tm,
					t.end_schd_tm,
					t.oper_schd_qty);
			MCList<MfgInstReg_Chk01_DtlOperR> bindL = up1()
					.subList(r -> !isNull(r.oper_ord_no()));
			if (!bindL.isEmpty()) {
				dbSelectKey("MSBCL6000_MST_OPER_ORDER_S01", ooL, ooL_bldr,
						bindL.groupBy(MfgInstReg_Chk01_DtlOperR.$oper_ord_no));
			}
			
			// 工程指図の取得
			MCList<MST_OPER_INST_R> oiL = MCList.create(MST_OPER_INST_R.class);
			MST_OPER_INST_R t1 = MST_OPER_INST_R.create("T");
			MCQueryApiBuilder oiL_bldr = MCQueryApiBuilder.create(t1);
			MSVT_OPER_INST_PR_R t2 = MSVT_OPER_INST_PR_R.create("T2");
			oiL_bldr.setSelect(t1.oper_inst_no, t1.oper_ord_no, t1.yield_oper_flg,
					t1.yield_oper_ratio, t1.oper_abort_flg, t1.unschd_inst_flg);
			oiL_bldr.addSelect(t1.mes_flg);
			oiL_bldr.addSelect(t2.mfg_sts_typ);
			oiL_bldr.addInnerJoin(t2, bracket(t1.oper_inst_no.eq(t2.oper_inst_no)));
			bindL = up1().subList(r -> !isNull(r.oper_inst_no()));
			if (!bindL.isEmpty()) {
				dbSelectKey("MSBCL6000_MST_OPER_INST_S01", oiL, oiL_bldr,
						bindL.groupBy(MfgInstReg_Chk01_DtlOperR.$oper_inst_no));
			}
			
			MCIndexKey ooKey = ooL.createIndex(MST_OPER_ORDER_R.$oper_ord_no);
			MCIndexKey oiKey = oiL.createIndex(MSVT_OPER_INST_PR_R.$oper_inst_no);
			
			for (MfgInstReg_Chk01_DtlOperR r : up1()) {
				MST_OPER_ORDER_R ooR = ooL.getFirst(ooKey, r.oper_ord_no());
				MST_OPER_INST_R oiR = oiL.getFirst(oiKey, r.oper_inst_no());
				msgL.addAll(chkAndCompOperBaseSub(r, ooR, oiR));
			}
			
			return msgL;
		}

		protected MCMessageList chkAndCompOperBaseSub(MfgInstReg_Chk01_DtlOperR r,
				MST_OPER_ORDER_R ooR, MST_OPER_INST_R oiR) {
			MCMessageList msgL = new MCMessageList();
			
			MfgInstReg_Chk01_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
			
			// 工程指図の打切ＦＬＧは、指図を打ち切るかもしくは未指図工程を打切る場合にtrueとする
			if (hdrR.inst_abort_flg()) {
				r.inst_abort_flg(hdrR.inst_abort_flg());
				//指図打切の場合は、紐づく工程の工程打切もオンにする。
				r.oper_abort_flg(true);
			}
			else if (!hdrR.inst_abort_flg() && hdrR.old_inst_abort_flg() && r.tgt_oper_flg()) {
				//指図打切の取り消しの場合は、紐づく工程の工程打切もオフにする。
				r.oper_abort_flg(false);
			}
			else if (r.oper_abort_flg()) {
				r.inst_abort_flg(r.oper_abort_flg());
			}

			// 初回製造指図以外の取消ＦＬＧ（工程単位製造指図で初回製造指図以外の取消かどうか）の設定
			r.not_frst_inst_can_flg(hdrR.not_frst_inst_can_flg());
			
			if (isNull(r.oper_inst_no())) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (r.isStatusDelete()) {
				if (r.not_frst_inst_can_flg()) {
					// 工程単位製造指図で初回製造指図以外の製造指図を取り消した場合、未指図で更新する
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					r.mfg_sts_typ(MSC_MFG_STS_TYP.YET.value());
				}
				else {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
			}
			else {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			
			if (!isNull(oiR)) {
				// 製造状況区分
				String sts = oiR.getStringNE("mfg_sts_typ");
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) || r.not_frst_inst_can_flg()) {
					if (MSC_MFG_STS_TYP.isSTT(sts) || MSC_MFG_STS_TYP.isCMPL(sts)) {
						msgL.add(new MCMessage(r, null, MSBCL1127,
								getLabel(r, MfgInstReg_Chk01_DtlOperR.$oper_inst_no),
								r.oper_inst_no(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}

				if (!r.old_inst_abort_flg()) {
					if (MSC_MFG_STS_TYP.isSTT(hdrR.mfg_sts_typ()) || MSC_MFG_STS_TYP.isCMPL(hdrR.mfg_sts_typ())) {
						r.mfg_sts_typ(sts);
					}
				}
				r.oper_ord_no(oiR.oper_ord_no());
				r.unschd_inst_flg(oiR.unschd_inst_flg());
				
				// 出来高計上工程ＦＬＧと出来高計上比率は、トランザクションが存在する場合は、トランから補完
				r.yield_oper_flg(oiR.yield_oper_flg());
				r.yield_oper_ratio(oiR.yield_oper_ratio());
				
				// 工程指図の更新前の打切ＦＬＧは、指図が打ち切られているか、未指図工程が打ち切られている場合にtrueとする
				if (hdrR.old_inst_abort_flg()) {
					r.old_inst_abort_flg(hdrR.old_inst_abort_flg());
				}
				else if (oiR.oper_abort_flg()) {
					r.old_inst_abort_flg(oiR.oper_abort_flg());
				}
			}
			else {
				if (isNull(r.oper_ord_no())) {
					r.unschd_inst_flg(true);
				}
				// ヘッダが着手中または完了かつ工程指図が存在しない場合（着手後の指図変更で工程指図が追加された場合）は指図済
				if (MSC_MFG_STS_TYP.isSTT(hdrR.mfg_sts_typ())
						|| MSC_MFG_STS_TYP.isCMPL(hdrR.mfg_sts_typ())) {
					r.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
				}
			}
			
			// 計画変更（工程）ＦＬＧ
			// ※工程単位製造指図の場合、後の処理で工程単位で変更があった場合に指図の計画変更をオンとするために使用する
			r.oper_schd_chg_flg(isOperSchdChg(r, ooR));

			if (!r.oper_abort_flg()) {
				// 品目オーダＮＯに紐づく工程オーダをすべて取得する
				MCList<MST_OPER_ORDER_R> tgtL = MCList.create(MST_OPER_ORDER_R.class);
				MST_OPER_ORDER_R t = MST_OPER_ORDER_R.create("T");
				MCQueryApiBuilder tgtL_bldr = MCQueryApiBuilder.create(t);
				tgtL_bldr.setSelect(t.oper_ord_no, t.oper_schd_qty);
				tgtL_bldr.setWhere(t.itm_ord_no.eq(bind("itm_ord_no")));
				dbSelect("MSBCL6000_MST_OPER_ORDER_S05", tgtL, tgtL_bldr, hdrR);

				// 上り電文の工程オーダＮＯをキーに、工程オーダを抽出する
				MCIndexKey operKey = tgtL.createIndex(MST_OPER_ORDER_R.$oper_ord_no);
				MST_OPER_ORDER_R operR = tgtL.getFirst(operKey, r.oper_ord_no());

				if (!isNull(operR)) {
					MAM_ITM_R itmR = MAM_ITM_R.create();
					MAM_ITM_R m = MAM_ITM_R.create("M");
					MCQueryApiBuilder itmR_bldr = MCQueryApiBuilder.create(m);
					itmR_bldr.setSelect(m.dec_place, m.rnd_typ);
					itmR_bldr.setWhere(m.itm_cd.eq(bind("itm_cd")));
					itmR_bldr.addWhereWithAnd(m.itm_sub1.eq(bind("itm_sub1")));
					itmR_bldr.addWhereWithAnd(m.itm_sub2.eq(bind("itm_sub2")));
					itmR_bldr.addWhereWithAnd(m.itm_sub3.eq(bind("itm_sub3")));
					dbSelect("MSBCL6000_MAM_ITM_S01", itmR, itmR_bldr, hdrR);

					// 複数ユーザが同一データ更新時では、後で更新する場合には、r.err_flg()がtrueのため、nullチェックは不要
					// 品目マスタが論理削除されている場合は、データが取得できていないため計算時に使用する項目のnullチェックする
					if (isNull(itmR.dec_place())) {
						r.err_flg(true);
					}
					if (!r.err_flg()) {
						// 未指図数量を再計算する
						// 上り電文に含まれない工程オーダは後続処理で再計算される
						r.not_oper_schd_qty(operR.oper_schd_qty()
								.multiply(hdrR.base_unit_not_inst_qty())
								.divide(hdrR.base_unit_ord_qty(), itmR.dec_place().intValue(), MAC_RND_TYP.toMC(itmR.rnd_typ())));
					}
				}
				else {
					// 計画外の場合、工程未指図数量に0を設定する
					r.not_oper_schd_qty(0);
				}
			}
			else {
				// 未指図工程を打ち切る場合は、ヘッダの未指図数量と異なる。
				r.not_oper_schd_qty(0);
			}
			// 後の処理でマスタを一括でキャッシュするために、設定しておく
			if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && !r.not_frst_inst_can_flg()) {
				r.itm_cd(hdrR.itm_cd());
				r.itm_sub1(hdrR.itm_sub1());
				r.itm_sub2(hdrR.itm_sub2());
				r.itm_sub3(hdrR.itm_sub3());
				r.mfg_loc_cd(hdrR.mfg_loc_cd());
				r.oper_ptn(hdrR.oper_ptn());
			}
			
			return msgL;
		}
		
		/**
		 * 計画変更ＦＬＧ（工程）をオンにするかどうか
		 * @return
		 */
		protected boolean isOperSchdChg(MfgInstReg_Chk01_DtlOperR r, MST_OPER_ORDER_R ooR) {
			if (isNull(ooR)) {
				return true;
			}
			if (r.unschd_inst_flg()) {
				return true;
			}
			if (r.oper_abort_flg()) {
				return true;
			}
			if (isNull(r.st_schd_tm()) || isNull(r.end_schd_tm())) {
				// まだ必須チェックが終わっていないので、nullか否かを考慮している
				return true;
			}
			
			// 数量、着手予定日、終了予定日が異なれば計画変更とみなす
			if (!isSame(r.base_unit_qty(), ooR.oper_schd_qty())) {
				return true;
			}
			if (!isSame(r.st_schd_tm().startTimeOfDay(), ooR.st_schd_tm()
					.startTimeOfDay())) {
				return true;
			}
			if (!isSame(r.end_schd_tm().startTimeOfDay(), ooR.end_schd_tm()
					.startTimeOfDay())) {
				return true;
			}
			return false;
		}
		
		protected MCMessageList chkAndCompInptBase() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MST_INPT_SCHD_R> isL = MCList.create(MST_INPT_SCHD_R.class);
			MST_INPT_SCHD_R t = MST_INPT_SCHD_R.create("T");
			MCQueryApiBuilder isL_bldr = MCQueryApiBuilder.create(t);
			MSVT_INPT_SCHD_PR_R t2 = MSVT_INPT_SCHD_PR_R.create("T2");
			isL_bldr.setSelect(t.inpt_schd_no, t.itm_cd, t.itm_sub1, t.itm_sub2,
					t.itm_sub3, t.ver_no, t.prov_typ, t.inpt_ctl_typ);
			isL_bldr.addSelect(t2.mfg_sts_typ);
			isL_bldr.addInnerJoin(t2, bracket(t.inpt_schd_no.eq(t2.inpt_schd_no)));

			MCList<MfgInstReg_Chk01_DtlInptR> bindL = up2()
					.subList(r -> !isNull(r.inpt_schd_no()));
			if (!bindL.isEmpty()) {
				dbSelectKey("MSBCL6000_MST_INPT_SCHD_S02", isL, isL_bldr,
						bindL.groupBy(MfgInstReg_Chk01_DtlInptR.$inpt_schd_no));
			}
			
			createFixedLossItmCache(up2());
			MCIndexKey isKey = isL.createIndex(MST_INPT_SCHD_R.$inpt_schd_no);
			for (MfgInstReg_Chk01_DtlInptR r : up2()) {
				MST_INPT_SCHD_R isR = isL.getFirst(isKey, r.inpt_schd_no());
				msgL.addAll(chkAndCompInptBaseSub(r, isR));
			}
			
			return msgL;
		}
		protected FXUCL_MCDbcCache<MAM_ITM_R> _fixedLossItmCache;
		protected void createFixedLossItmCache(MCList<MfgInstReg_Chk01_DtlInptR> inptL) {
			// 子品目に紐づく固定ロス理由が存在する品目リストをキャッシュ
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MAM_LOSS_RSN_R m2 = MAM_LOSS_RSN_R.create("M2");
			MAM_BIZ_RSN_R m3 = MAM_BIZ_RSN_R.create("M3");
			dbc_bldr.setSelect(t.itm_cd);
			dbc_bldr.addInnerJoin(m2, bracket( t.itm_typ.eq(m2.itm_typ) 
					.and(t.itm_typ_d_cd.eq(m2.itm_typ_d_cd))));
			dbc_bldr.addInnerJoin(m3, bracket( m2.loss_rsn_cd.eq(m3.biz_rsn_cd) 
					.and(m3.fxd_loss_flg.eq(value(true)))));
			_fixedLossItmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, inptL,
					MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		}
		

		
		protected MCMessageList chkAndCompInptBaseSub(MfgInstReg_Chk01_DtlInptR r,
				MST_INPT_SCHD_R isR) {
			MCMessageList msgL = new MCMessageList();
			
			MfgInstReg_Chk01_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
			MfgInstReg_Chk01_DtlOperR operR = _operCache.getCache(r.oper_peg_no());

			// 初回製造指図以外の取消ＦＬＧ（工程単位製造指図で初回製造指図以外の取消かどうか）の設定
			r.not_frst_inst_can_flg(hdrR.not_frst_inst_can_flg());
			String yetMfgStsTyp = null;
			
			if (isNull(r.inpt_schd_no())) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (r.isStatusDelete()) {
				if (r.not_frst_inst_can_flg()) {
					// 工程単位製造指図で初回製造指図以外の製造指図を取り消した場合、未指図に戻す
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					yetMfgStsTyp = MSC_MFG_STS_TYP.YET.value();
				}
				else {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
			}
			else {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}

			if (!isNull(isR)) {
				// 製造状況区分
				String mfgStsTyp = isR.getStringNE("mfg_sts_typ");
				r.old_mfg_sts_typ(mfgStsTyp);
				r.mfg_sts_typ(nvl(yetMfgStsTyp, mfgStsTyp));
				r.old_ver_no(isR.ver_no());
				
				r.inst_abort_flg(operR.inst_abort_flg());
				r.old_inst_abort_flg(operR.old_inst_abort_flg());

				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && !r.not_frst_inst_can_flg()) {
					if (!operR.old_inst_abort_flg()) {
						if (MSC_MFG_STS_TYP.isSTT(mfgStsTyp) || MSC_MFG_STS_TYP.isCMPL(mfgStsTyp)) {
							// 実績登録済みの場合は、表示順のみ更新をtrueにする（不要なサービスを実行しないようにするため）
							// ※実績未登録で打ち切った際にも、ステータスが完了となるため更新前の打切状態を加味している
							r.disp_seq_upd_flg(true);
						}
					}
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) || r.not_frst_inst_can_flg()) {
					// 削除時または初回製造指図以外の取消時は品目関連項目を補完
					r.itm_cd(isR.itm_cd());
					r.itm_sub1(isR.itm_sub1());
					r.itm_sub2(isR.itm_sub2());
					r.itm_sub3(isR.itm_sub3());
					r.prov_typ(isR.prov_typ());
					r.inpt_ctl_typ(isR.inpt_ctl_typ());

					if (MSC_MFG_STS_TYP.isSTT(mfgStsTyp) || MSC_MFG_STS_TYP.isCMPL(mfgStsTyp)) {
						msgL.add(new MCMessage(r, null, MSBCL1127,
								getLabel(r, MfgInstReg_Chk01_DtlInptR.$inpt_schd_no),
								r.inpt_schd_no(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}
			
			if (isNull(r.alt_grp_cd())) {
				r.base_unit_alt_qty(null);
				r.alt_itm_fix_flg(false);
				r.alt_itm_typ(null);
				r.alt_alloc_prio(null);
			}
						
			r.itm_ord_no(hdrR.itm_ord_no());
			
			MAM_ITM_R itmR = _fixedLossItmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			r.addBooleanColumn("fxd_loss_rsn_none_flg");
			// 固定ロス理由へ紐づかない場合
			if (isNull(itmR.itm_cd())) {
				r.base_unit_fxd_rqmt_qty(MCNumber.ZERO);
				r.setBoolean("fxd_loss_rsn_none_flg", true);
			}
			return msgL;
		}
		
		protected MCMessageList chkAndCompWkBase() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MST_WK_SCHD_R> wsL = MCList.create(MST_WK_SCHD_R.class);
			MST_WK_SCHD_R t = MST_WK_SCHD_R.create("T");
			MCQueryApiBuilder wsL_bldr = MCQueryApiBuilder.create(t);
			MSVT_WK_SCHD_PR_R t2 = MSVT_WK_SCHD_PR_R.create("T2");
			wsL_bldr.setSelect(t.wk_schd_no);
			wsL_bldr.addSelect(t2.mfg_sts_typ);
			wsL_bldr.addInnerJoin(t2, bracket( t.wk_schd_no.eq(t2.wk_schd_no)));
			MCList<MfgInstReg_Chk01_DtlWkR> bindL = up3().subList(r -> !isNull(r.wk_schd_no()));
			if (!bindL.isEmpty()) {
				dbSelectKey("MSBCL6000_MST_WK_SCHD_S01", wsL, wsL_bldr, bindL.groupBy(MfgInstReg_Chk01_DtlWkR.$wk_schd_no));
			}
			
			MCIndexKey wsKey = wsL.createIndex(MST_WK_SCHD_R.$wk_schd_no);
			for (MfgInstReg_Chk01_DtlWkR r : up3()) {
				MST_WK_SCHD_R wsR = wsL.getFirst(wsKey, r.wk_schd_no());
				msgL.addAll(chkAndCompWkBaseSub(r, wsR));
			}
			
			return msgL;
		}
		
		protected MCMessageList chkAndCompWkBaseSub(MfgInstReg_Chk01_DtlWkR r,
				MST_WK_SCHD_R wsR) {
			MCMessageList msgL = new MCMessageList();
			
			MfgInstReg_Chk01_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
			MfgInstReg_Chk01_DtlOperR operR = _operCache.getCache(r.oper_peg_no());
			
			// 初回製造指図以外の取消ＦＬＧ（工程単位製造指図で初回製造指図以外の取消かどうか）の設定
			r.not_frst_inst_can_flg(hdrR.not_frst_inst_can_flg());
			
			if (isNull(r.wk_schd_no())) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (r.isStatusDelete()) {
				if (r.not_frst_inst_can_flg()) {
					// 工程単位製造指図で初回製造指図以外の製造指図を取り消した場合、未指図に戻す
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					r.mfg_sts_typ(MSC_MFG_STS_TYP.YET.value());
				}
				else {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
			}
			else {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			
			if (!isNull(operR)) {
				// 後の処理でマスタを一括でキャッシュするために、品目CD、枝番、工程パタンを設定しておく
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && !r.not_frst_inst_can_flg()) {
					r.itm_cd(hdrR.itm_cd());
					r.itm_sub1(hdrR.itm_sub1());
					r.itm_sub2(hdrR.itm_sub2());
					r.itm_sub3(hdrR.itm_sub3());
					r.mfg_loc_cd(hdrR.mfg_loc_cd());
					r.oper_ptn(hdrR.oper_ptn());
					r.oper_cd(operR.oper_cd());
					r.oper_seq(operR.oper_seq());
				}
			}
			
			if (!isNull(wsR)) {
				// 製造状況区分
				String mfgStsTyp = wsR.getStringNE("mfg_sts_typ");
				r.old_mfg_sts_typ(mfgStsTyp);
				
				r.inst_abort_flg(operR.inst_abort_flg());
				r.old_inst_abort_flg(operR.old_inst_abort_flg());

				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && !r.not_frst_inst_can_flg()) {
					if (!operR.old_inst_abort_flg()) {
						if (MSC_MFG_STS_TYP.isSTT(mfgStsTyp) || MSC_MFG_STS_TYP.isCMPL(mfgStsTyp)) {
							// 実績登録済みの場合は、表示順のみ更新をtrueにする（不要なサービスを実行しないようにするため）
							// ※実績未登録で打ち切った際にも、ステータスが完了となるため更新前の打切状態を加味している
							r.disp_seq_upd_flg(true);
						}
					}
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) || r.not_frst_inst_can_flg()) {
					if (MSC_MFG_STS_TYP.isSTT(mfgStsTyp) || MSC_MFG_STS_TYP.isCMPL(mfgStsTyp)) {
						msgL.add(new MCMessage(r, null, MSBCL1127,
								getLabel(r, MfgInstReg_Chk01_DtlWkR.$wk_schd_no),
								r.wk_schd_no(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}
						
			return msgL;
		}
		
		protected MCMessageList chkAndCompYieldBase() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder ysL_bldr = MCQueryApiBuilder.create(t);
			MSVT_YIELD_SCHD_PR_R t2 = MSVT_YIELD_SCHD_PR_R.create("T2");
			ysL_bldr.setSelect(t.yield_schd_no, t.mfg_inst_no,
					t.itm_mfg_inst_no, t.strg_loc_cd,
					t.strg_str_ln_cd, t.schd_tm,
					t.base_unit_yield_qty, t.base_unit_cd,
					t.trd_unit_yield_qty, t.trd_unit_cd,
					t.insp_cnt_rmrks);
			ysL.addBooleanColumn("stk_lst_prnt_flg");
			ysL_bldr.addSelect(t2.mfg_sts_typ);
			ysL_bldr.addSelect(t2.stk_lst_prnt_flg);
			ysL_bldr.addInnerJoin(t2, bracket( t.yield_schd_no.eq(t2.yield_schd_no)));
			
			MCList<MfgInstReg_Chk01_DtlYieldR> bindL = up4().subList(r -> !isNull(r.yield_schd_no()));
			if (!bindL.isEmpty()) {
				dbSelectKey("MSBCL6000_MST_YIELD_SCHD_S01", ysL, ysL_bldr, bindL.groupBy(MfgInstReg_Chk01_DtlYieldR.$yield_schd_no));
			}
			
			MCIndexKey ysKey = ysL.createIndex(MST_YIELD_SCHD_R.$yield_schd_no);
			for (MfgInstReg_Chk01_DtlYieldR r : up4()) {
				MST_YIELD_SCHD_R ysR = ysL.getFirst(ysKey, r.yield_schd_no());
				msgL.addAll(chkAndCompYieldBaseSub(r, ysR));
			}
			
			return msgL;
		}
		
		protected MCMessageList chkAndCompYieldBaseSub(MfgInstReg_Chk01_DtlYieldR r,
				MST_YIELD_SCHD_R ysR) {
			MCMessageList msgL = new MCMessageList();
			
			MfgInstReg_Chk01_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
			MfgInstReg_Chk01_DtlOperR operR = _operCache.getCache(r.oper_peg_no());

			// 初回製造指図以外の取消ＦＬＧ（工程単位製造指図で初回製造指図以外の取消かどうか）の設定
			r.not_frst_inst_can_flg(hdrR.not_frst_inst_can_flg());
			
			if (isNull(r.yield_schd_no())) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (r.isStatusDelete()) {
				if (r.not_frst_inst_can_flg()) {
					// 工程単位製造指図で初回製造指図以外の製造指図を取り消した場合、未指図に戻す
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					r.mfg_sts_typ(MSC_MFG_STS_TYP.YET.value());
				}
				else {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
			}
			else {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			
			if (!isNull(ysR)) {
				String mfgStsTyp = ysR.getStringNE("mfg_sts_typ");
				r.old_mfg_sts_typ(mfgStsTyp);
				r.stk_lst_prnt_flg(ysR.getBooleanNE("stk_lst_prnt_flg"));
				
				r.inst_abort_flg(operR.inst_abort_flg());
				r.old_inst_abort_flg(operR.old_inst_abort_flg());
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && !r.not_frst_inst_can_flg()) {
					if (!operR.old_inst_abort_flg()) {
						if (MSC_MFG_STS_TYP.isSTT(mfgStsTyp) || MSC_MFG_STS_TYP.isCMPL(mfgStsTyp)) {
							// 実績登録済みの場合は、表示順のみ更新をtrueにする（不要なサービスを実行しないようにするため）
							// ※実績未登録で打ち切った際にも、ステータスが完了となるため更新前の打切状態を加味している
							r.disp_seq_upd_flg(true);
						}
					}
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) || r.not_frst_inst_can_flg()) {
					if (MSC_MFG_STS_TYP.isSTT(mfgStsTyp) || MSC_MFG_STS_TYP.isCMPL(mfgStsTyp)) {
						msgL.add(new MCMessage(r, null, MSBCL1127,
								getLabel(r, MfgInstReg_Chk01_DtlYieldR.$yield_schd_no),
								r.yield_schd_no(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}
			
			if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && !r.not_frst_inst_can_flg()) {
				// リストロジックのチェックで使用するために、設定しておく
				r.itm_cd(hdrR.itm_cd());
				r.itm_sub1(hdrR.itm_sub1());
				r.itm_sub2(hdrR.itm_sub2());
				r.itm_sub3(hdrR.itm_sub3());
			}
			
			// 初回製造指図以外の取消の場合、未指図への更新時に検査予定サービスに渡す項目を出来高予定、ヘッダから設定する
			if (r.not_frst_inst_can_flg()) {
				// itm_cd, itm_sub1-3, sno1-4, mfg_loc_cd, itm_ord_noはchkAndCompYieldAfterListLogicで補完されるため、ここでの設定は不要
				r.mfg_inst_no(ysR.mfg_inst_no());
				r.itm_mfg_inst_no(ysR.itm_mfg_inst_no());
				r.strg_loc_cd(ysR.strg_loc_cd());
				r.strg_str_ln_cd(ysR.strg_str_ln_cd());
				r.schd_tm(ysR.schd_tm());
				r.base_unit_yield_qty(ysR.base_unit_yield_qty());
				r.base_unit_cd(ysR.base_unit_cd());
				r.trd_unit_yield_qty(ysR.trd_unit_yield_qty());
				r.trd_unit_cd(ysR.trd_unit_cd());
				r.insp_cnt_rmrks(ysR.insp_cnt_rmrks());
				r.mfg_loc_wg_cd(hdrR.mfg_loc_wg_cd());
				r.mfg_loc_cd(hdrR.mfg_loc_cd());
			}
			
			return msgL;
		}
		
		protected MCMessageList chkAndCompByProdBase() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder ysL_bldr = MCQueryApiBuilder.create(t);
			MSVT_YIELD_SCHD_PR_R t2 = MSVT_YIELD_SCHD_PR_R.create("T2");
			ysL_bldr.setSelect(t.yield_schd_no, t.itm_cd,
					t.io_schd_pr_no, t.itm_sub1,
					t.itm_sub2, t.itm_sub3,
					t.lot_no, t.sublot_no);
			ysL.addBooleanColumn("stk_lst_prnt_flg");
			ysL_bldr.addSelect(t2.mfg_sts_typ);
			ysL_bldr.addSelect(t2.stk_lst_prnt_flg);
			ysL_bldr.addInnerJoin(t2, bracket( t.yield_schd_no.eq(t2.yield_schd_no)));
			
			MCList<MfgInstReg_Chk01_DtlByProdR> bindL = up5().subList(r -> !isNull(r.yield_schd_no()));
			if (!bindL.isEmpty()) {
				dbSelectKey("MSBCL6000_MST_YIELD_SCHD_S02", 
						ysL, ysL_bldr, bindL.groupBy(MfgInstReg_Chk01_DtlByProdR.$yield_schd_no));
			}
			
			MCIndexKey ysKey = ysL.createIndex(MST_YIELD_SCHD_R.$yield_schd_no);
			
			for (MfgInstReg_Chk01_DtlByProdR r : up5()) {
				MST_YIELD_SCHD_R ysR = ysL.getFirst(ysKey, r.yield_schd_no());
				msgL.addAll(chkAndCompByProdBaseSub(r, ysR));
			}
			
			return msgL;
		}
		
		protected MCMessageList chkAndCompByProdBaseSub(MfgInstReg_Chk01_DtlByProdR r,
				MST_YIELD_SCHD_R ysR) {
			MCMessageList msgL = new MCMessageList();
			
			MfgInstReg_Chk01_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
			MfgInstReg_Chk01_DtlOperR operR = _operCache.getCache(r.oper_peg_no());

			// 初回製造指図以外の取消ＦＬＧ（工程単位製造指図で初回製造指図以外の取消かどうか）の設定
			r.not_frst_inst_can_flg(hdrR.not_frst_inst_can_flg());
			
			if (isNull(r.yield_schd_no())) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (r.isStatusDelete()) {
				if (r.not_frst_inst_can_flg()) {
					// 工程単位製造指図で初回製造指図以外の製造指図を取り消した場合、未指図に戻す
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					r.mfg_sts_typ(MSC_MFG_STS_TYP.YET.value());
				}
				else {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
			}
			else {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			
			if (!isNull(ysR)) {
				String mfgStsTyp = ysR.getStringNE("mfg_sts_typ");
				r.old_mfg_sts_typ(mfgStsTyp);
				r.stk_lst_prnt_flg(ysR.getBooleanNE("stk_lst_prnt_flg"));
				r.old_itm_cd(ysR.itm_cd());
				r.old_itm_sub1(ysR.itm_sub1());
				r.old_itm_sub2(ysR.itm_sub2());
				r.old_itm_sub3(ysR.itm_sub3());
				r.old_lot_no(ysR.lot_no());
				r.old_sublot_no(ysR.sublot_no());
				
				r.inst_abort_flg(operR.inst_abort_flg());
				r.old_inst_abort_flg(operR.old_inst_abort_flg());
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && !r.not_frst_inst_can_flg()) {
					if (!operR.old_inst_abort_flg()) {
						if (MSC_MFG_STS_TYP.isSTT(mfgStsTyp) || MSC_MFG_STS_TYP.isCMPL(mfgStsTyp)) {
							// 実績登録済みの場合は、表示順のみ更新をtrueにする（不要なサービスを実行しないようにするため）
							// ※実績未登録で打ち切った際にも、ステータスが完了となるため更新前の打切状態を加味している
							r.disp_seq_upd_flg(true);
						}
					}
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) || r.not_frst_inst_can_flg()) {
					// 削除時または初回製造指図以外の取消時は品目を補完
					r.itm_cd(ysR.itm_cd());
					r.itm_sub1(ysR.itm_sub1());
					r.itm_sub2(ysR.itm_sub2());
					r.itm_sub3(ysR.itm_sub3());

					if (MSC_MFG_STS_TYP.isSTT(mfgStsTyp) || MSC_MFG_STS_TYP.isCMPL(mfgStsTyp)) {
						msgL.add(new MCMessage(r, null, MSBCL1127,
								getLabel(r, MfgInstReg_Chk01_DtlByProdR.$yield_schd_no),
								r.yield_schd_no(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}
			
			r.itm_ord_no(hdrR.itm_ord_no());
			
			return msgL;
		}
		
		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row,
				String column) {
			if (isSame(paramIndex, 0)) {
				if (isSame(column, MfgInstReg_Chk01_HdrR.$mfg_inst_unit_typ)) {
					if (!isNull(row.getString(MfgInstReg_Chk01_HdrR.$mfg_inst_unit_typ))) {
						// 前の処理で設定した品目オーダの値を優先するためfalseを返す
						return false;
					}
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}
		
		@Override
		protected void setListLogicValue(MCNumber paramIndex, MCRow row, String column,
				Comparable<?> value) {
			super.setListLogicValue(paramIndex, row, column, value);

			if (isSame(paramIndex, 0)) {
				// ヘッダのリストロジックで補完したＷＧＣＤ、工場・物流倉庫ＣＤの値を、明細のコンテナにコピーする（明細のコンテナのリストロジックのinで使用するため）
				if (isSame(column, MfgInstReg_Chk01_HdrR.$mfg_loc_wg_cd)) {
					MfgInstReg_Chk01_HdrR hdrR = (MfgInstReg_Chk01_HdrR)row;
					copyHdrWgCdToDtl(hdrR.peg_no(), hdrR.mfg_loc_wg_cd());
				}
				else if (isSame(column, MfgInstReg_Chk01_HdrR.$mfg_loc_site_cd)) {
					MfgInstReg_Chk01_HdrR hdrR = (MfgInstReg_Chk01_HdrR)row;
					copyHdrSiteCdToDtl(hdrR.peg_no(), hdrR.mfg_loc_site_cd());
				}
			}
		}
		
		protected void copyHdrWgCdToDtl(MCNumber hdrPegNo, String val) {
			for (MfgInstReg_Chk01_DtlOperR operR : _operCacheForHdr.getCache(hdrPegNo)) {
				operR.mfg_loc_wg_cd(val);
			}
			for (MfgInstReg_Chk01_DtlInptR inptR : _inptCacheForHdr.getCache(hdrPegNo)) {
				inptR.mfg_loc_wg_cd(val);
			}
			for (MfgInstReg_Chk01_DtlYieldR yieldR : _yieldCacheForHdr.getCache(hdrPegNo)) {
				yieldR.mfg_loc_wg_cd(val);
			}
			for (MfgInstReg_Chk01_DtlByProdR byProdR : _byProdCacheForHdr.getCache(hdrPegNo)) {
				byProdR.mfg_loc_wg_cd(val);
			}
		}
		
		protected void copyHdrSiteCdToDtl(MCNumber hdrPegNo, String val) {
			for (MfgInstReg_Chk01_DtlInptR inptR : _inptCacheForHdr.getCache(hdrPegNo)) {
				inptR.mfg_loc_site_cd(val);
			}
		}

		protected void chkAndCompAfterListLogic() {
			// マスタキャッシュ処理
			doMasterCache();
			
			chkWkCost();
			
			// リストロジック実行後に実施すべきチェック、補完処理
			chkAndCompHdrAfterListLogic(up0().subList(MfgInstReg_Chk01_HdrR.$err_flg, false));
			
			chkAndCompOperAfterListLogic();
			copyErrFlg(up0(), up1(), MfgInstReg_Upd01_HdrR.$peg_no, MfgInstReg_Upd01_DtlOperR.$hdr_peg_no);
			
			chkAndCompInptAfterListLogic();
			copyErrFlg(up0(), up2(), MfgInstReg_Upd01_HdrR.$peg_no, MfgInstReg_Upd01_DtlInptR.$hdr_peg_no);
			
			chkAndCompWkAfterListLogic();
			copyErrFlg(up0(), up3(), MfgInstReg_Upd01_HdrR.$peg_no, MfgInstReg_Upd01_DtlWkR.$hdr_peg_no);
			
			chkAndCompYieldAfterListLogic();
			copyErrFlg(up0(), up4(), MfgInstReg_Upd01_HdrR.$peg_no, MfgInstReg_Upd01_DtlYieldR.$hdr_peg_no);
			
			chkAndCompByProdAfterListLogic();
			copyErrFlg(up0(), up5(), MfgInstReg_Upd01_HdrR.$peg_no, MfgInstReg_Upd01_DtlByProdR.$hdr_peg_no);
			
			chkAndCompReExtAfterListLogic();
			copyErrFlg(up0(), up6(), MfgInstReg_Upd01_HdrR.$peg_no, MfgInstReg_Upd01_DtlReExtR.$hdr_peg_no);
			
			// ロットＮＯ、サブロットＮＯの発番、チェック処理（無駄な発番をしないようにするため、チェック処理の一番最後で実施する）
			// ※ヘッダのerr_flgはsetAndChkLotNoメソッド内で設定するため、copyErrFlgは実行していない
			setAndChkLotNo();
		}
		
		/**
		 * 工数管理マスタ存在チェック
		 * @return メッセージリスト
		 */
		protected void chkWkCost() {

			for (MfgInstReg_Chk01_DtlWkR wkR : up3()) {
				MCMessageList msgL = new MCMessageList();
				if (!MAC_DATA_CRUD_TYP.isDEL(wkR.data_crud_typ()) && !wkR.inst_abort_flg()
						&& !wkR.not_frst_inst_can_flg()) {
					// 削除行、打切行以外

					if (isNull(wkR.wk_cost())) {
						// 工数管理ＣＤのマスタ存在チェック（予定工数がnull以外の場合、事前にチェックされるため、ここでは実施しない。）
						MAM_WK_COST_R wkCost = getWkCost(wkR.wk_cost_cd());
						if (wkCost.isEmpty()) {
							msgL.add(new MCMessage(wkR,
									MfgInstReg_Chk01_DtlWkR.$wk_cost_cd, MAUAL0036,
									getKeyInfoMsgLabel(wkR,
											MfgInstReg_Chk01_DtlWkR.$wk_cost_cd),
									toDispGUIIndex(wkR)));
						}
					}
				}
				setErrFlg(wkR, msgL);
				MCMessagePool.addAll(msgL);
			}
		}
		
		protected boolean isLotAutoIssue(MfgInstReg_Chk01_HdrR hdrR, String no, String lotNoTyp) {
			if (!isNull(no)) {
				return false;
			}
			if (MAC_LOT_NO_TYP.isMANUAL(lotNoTyp)) {
				return false;
			}
			if (!MAC_LOT_ISSUE_TYP.isON_INST(hdrR.lot_issue_typ())) {
				return false;
			}
			if (!MSC_MFG_STS_TYP.isORD(hdrR.mfg_sts_typ())) {
				return false;
			}
			return true;
		}
		
		protected FXUCL_MCDbcCacheStEnd<MAM_ITM_OPER_R> _itmOper;
		protected FXUCL_MCDbcCacheStEnd<MAM_OPER_WK_COST_R> _operWkCost;
		
		protected void doMasterCache() {
			// 品目工程マスタ
			MAM_ITM_OPER_R t = MAM_ITM_OPER_R.create("T");
			MCQueryApiBuilder itmOper_bldr = MCQueryApiBuilder.create(t);
			itmOper_bldr.setSelect(t.itm_cd,
					t.oper_std_qty,
					t.oper_unit_cd,
					t.oper_conv_qty,
					t.unit_conv_rnd_typ,
					t.dec_place,
					t.oper_lt,
					t.oper_lt_add_qty,
					t.oper_offst_typ,
					t.oper_offst,
					t.oper_offst_add_qty,
					t.oper_inst_grp,
					t.lmt_fr_dt_flg,
					t.oper_lower_yield,
					t.oper_std_yield,
					t.oper_upper_yield,
					t.yield_oper_flg,
					t.yield_oper_ratio,
					t.wip_rate);
			
			MCList<MfgInstReg_Chk01_DtlOperR> bindOperL = MCList.create(MfgInstReg_Chk01_DtlOperR.class);
			for (MfgInstReg_Chk01_DtlOperR operR : up1()) {
				bindOperL.add(operR);
				// 製造場所がNULL文字のレコードを取得するために、cloneしてNULL文字を設定する
				MfgInstReg_Chk01_DtlOperR nullValR = operR.clone();
				nullValR.mfg_loc_cd(MAC_STR.NULL_VAL.value());
				bindOperL.add(nullValR);
			}

			_itmOper = new FXUCL_MCDbcCacheStEnd<MAM_ITM_OPER_R>(itmOper_bldr, bindOperL,
					MfgInstReg_Chk01_DtlOperR.$itm_cd, MfgInstReg_Chk01_DtlOperR.$itm_sub1,
					MfgInstReg_Chk01_DtlOperR.$itm_sub2, MfgInstReg_Chk01_DtlOperR.$itm_sub3,
					MfgInstReg_Chk01_DtlOperR.$mfg_loc_cd, MfgInstReg_Chk01_DtlOperR.$oper_ptn,
					MfgInstReg_Chk01_DtlOperR.$oper_cd, MfgInstReg_Chk01_DtlOperR.$oper_seq);
			
			// 工程工数マスタ
			MAM_OPER_WK_COST_R t1 = MAM_OPER_WK_COST_R.create("T");
			MCQueryApiBuilder operWkCost_bldr = MCQueryApiBuilder.create(t1);
			operWkCost_bldr.setSelect(t1.itm_cd, t1.fxd_wk_cost, t1.wk_cost, t1.base_qty);

			MCList<MfgInstReg_Chk01_DtlWkR> bindWkL = MCList
					.create(MfgInstReg_Chk01_DtlWkR.class);
			for (MfgInstReg_Chk01_DtlWkR wkR : up3()) {
				bindWkL.add(wkR);
				// 製造場所がNULL文字のレコードを取得するために、cloneしてNULL文字を設定する
				MfgInstReg_Chk01_DtlWkR nullValR = wkR.clone();
				nullValR.mfg_loc_cd(MAC_STR.NULL_VAL.value());
				bindWkL.add(nullValR);
			}
			
			_operWkCost = new FXUCL_MCDbcCacheStEnd<MAM_OPER_WK_COST_R>(operWkCost_bldr, bindWkL,
					MfgInstReg_Chk01_DtlWkR.$itm_cd, MfgInstReg_Chk01_DtlWkR.$itm_sub1,
					MfgInstReg_Chk01_DtlWkR.$itm_sub2, MfgInstReg_Chk01_DtlWkR.$itm_sub3,
					MfgInstReg_Chk01_DtlWkR.$mfg_loc_cd, MfgInstReg_Chk01_DtlWkR.$oper_ptn,
					MfgInstReg_Chk01_DtlWkR.$oper_cd, MfgInstReg_Chk01_DtlWkR.$oper_seq,
					MfgInstReg_Chk01_DtlWkR.$wk_cost_cd);
			
			// 工数管理マスタ
			initWkCostCache();
		}
		
		protected void chkAndCompHdrAfterListLogic(MCList<MfgInstReg_Chk01_HdrR> notErrL) {
			for (MfgInstReg_Chk01_HdrR hdrR : notErrL) {
				if (MAC_DATA_CRUD_TYP.isCRT(hdrR.mfg_inst_data_crud_typ())) {
					if (MSC_MFG_MTD_TYP.isEXTNL(hdrR.mfg_mtd_typ())) {
						// 外注の場合は、品目単位
						hdrR.mfg_inst_unit_typ(MAC_MFG_INST_UNIT_TYP.ITM.value());
					}
					else if (isNull(hdrR.mfg_inst_unit_typ())) {
						// マスタ値がnullの場合は、品目単位
						hdrR.mfg_inst_unit_typ(MAC_MFG_INST_UNIT_TYP.ITM.value());
					}
				}
				if (!MAC_DATA_CRUD_TYP.isDEL(hdrR.mfg_inst_data_crud_typ()) && !hdrR.inst_abort_flg() && !hdrR.not_frst_inst_can_flg()) {
					// 削除行、打切行以外に対する補完、チェック処理
					if (MAC_LOT_MNG_TYP.isNOT_MNG(hdrR.lot_mng_typ())) {
						hdrR.lot_no(MAC_STR.NULL_VAL.value());
					}
					else {
						hdrR.lot_no(nullValToNull(hdrR.lot_no()));
					}
					if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(hdrR.sublot_mng_typ())) {
						hdrR.sublot_no(MAC_STR.NULL_VAL.value());
					}
					else {
						hdrR.sublot_no(nullValToNull(hdrR.sublot_no()));
					}

					
					MCMessageList msgL = new MCMessageList();
					
					// DACチェック
					if (!hdrR.is_src_batch_flg()) {
						msgL.addAll(checkWritableLocCdDac(hdrR, MfgInstReg_Chk01_HdrR.$mfg_loc_cd));
					}
					
					// 条件付必須チェック
					if (MSC_MFG_MTD_TYP.isEXTNL(hdrR.mfg_mtd_typ())) {
						// 依頼元納入希望日
						msgL.addAll(check(hdrR, MfgInstReg_Chk01_HdrR.$rqst_dlv_rqst_tm, new FXUCL_RequiredValidater()));
					}
					
					// 手配ＮＯ１～４
					// ※checkerで補完した場合も含め、NULL文字を一旦クリアしてから必須チェックする
					if (MAC_SNO_MNG_TYP.isMNG_REQ(hdrR.sno1_mng_typ())) {
						hdrR.sno1(nullValToNull(hdrR.sno1()));
						msgL.addAll(check(hdrR, MfgInstReg_Chk01_HdrR.$sno1, new FXUCL_RequiredValidater()));
					}
					if (MAC_SNO_MNG_TYP.isMNG_REQ(hdrR.sno2_mng_typ())) {
						hdrR.sno2(nullValToNull(hdrR.sno2()));
						msgL.addAll(check(hdrR, MfgInstReg_Chk01_HdrR.$sno2, new FXUCL_RequiredValidater()));
					}
					if (MAC_SNO_MNG_TYP.isMNG_REQ(hdrR.sno3_mng_typ())) {
						hdrR.sno3(nullValToNull(hdrR.sno3()));
						msgL.addAll(check(hdrR, MfgInstReg_Chk01_HdrR.$sno3, new FXUCL_RequiredValidater()));
					}
					if (MAC_SNO_MNG_TYP.isMNG_REQ(hdrR.sno4_mng_typ())) {
						hdrR.sno4(nullValToNull(hdrR.sno4()));
						msgL.addAll(check(hdrR, MfgInstReg_Chk01_HdrR.$sno4, new FXUCL_RequiredValidater()));
					}
					
					// 有効桁数チェック
					msgL.addAll(checkDecPlace(hdrR,
							MfgInstReg_Chk01_HdrR.$base_unit_dec_place,
							MfgInstReg_Chk01_HdrR.$base_unit_inst_qty));
					msgL.addAll(checkDecPlace(hdrR,
							MfgInstReg_Chk01_HdrR.$base_unit_dec_place,
							MfgInstReg_Chk01_HdrR.$base_unit_yield_qty));
					
					// 出来高の存在チェック
					msgL.addAll(chkExistYield(hdrR));
					
					// 工程単位製造指図、かつ指図保存から指図済にしようとしているとき、
					// 同一製造指図ＮＯ内にある上り電文に含まれていない工程を取得し、
					// 指図保存のレコードがあったらヘッダの製造状況区分は指図保存とする
					if (MAC_MFG_INST_UNIT_TYP.isOPER(hdrR.mfg_inst_unit_typ())
							&& !isNull(hdrR.mfg_inst_no())
							&& MSC_MFG_STS_TYP.isORD(hdrR.mfg_sts_typ())) {
						msgL.addAll(chkOperInstMfgStsTyp(hdrR));
					}
					
					setErrFlg(hdrR, msgL);
					MCMessagePool.addAll(msgL);
				}
			}
			
			// 禁止マスタのチェック
			chkItmAndBpStop(notErrL);
			
			// 送信後訂正不可チェック
			chkSendIf(notErrL);
			// 発注予定サービス
			MCList<MfgInstReg_Chk01_HdrR> poSchdL = notErrL.subList(r -> !isNull(r.po_schd_data_crud_typ()));
			if (!poSchdL.isEmpty()) {
				MSBDL_PoSchdRegService.PoSchd_Chk01 o = MSBDL_PoSchdRegService.crtPoSchd_Chk01();
				addAll(o.up0(), poSchdL, createMap_PoSchd_Upd01_DtlR_MfgInstReg_Chk01_HdrR());
				o.exec();
				copyErrFlg(notErrL, o.down0());
			}
			
			// 入荷予定サービス
			MCList<MfgInstReg_Chk01_HdrR> upArrSchdL = MCList.create(MfgInstReg_Chk01_HdrR.class);
			MCList<MST_MFG_INST_R> arrSchdBindL = MCList.create(MST_MFG_INST_R.class);
			for (MfgInstReg_Chk01_HdrR r : notErrL) {
				if (!isNull(r.po_d_no())) {
					upArrSchdL.add(r);
					
					MST_MFG_INST_R bindR = MST_MFG_INST_R.create();
					bindR.po_d_no(r.po_d_no());
					arrSchdBindL.add(bindR);
				}
			}
			MSBEL_ArrSchdService.ArrSchd_Chk02 arrSchdSrv = MSBEL_ArrSchdService.crtArrSchd_Chk02();
			MCList<MST_ARR_SCHD_R> dbArrSchdL = getArrSchd(arrSchdBindL);
			MCIndexKey arrIndexKey = dbArrSchdL.createIndex("po_d_no");
			for (MfgInstReg_Chk01_HdrR upArrSchdR : upArrSchdL) {
				MCList<MST_ARR_SCHD_R> subDbL = dbArrSchdL.subList(arrIndexKey, upArrSchdR.po_d_no());
				for (MST_ARR_SCHD_R subDbR : subDbL) {
					ArrSchd_DtlR srvR = ArrSchd_DtlR.create(); 
					copy(srvR, upArrSchdR, createMap_ArrSchd_DtlR_MfgInstReg_Chk01_HdrR());
					srvR.arr_schd_no(subDbR.arr_schd_no());
					
					arrSchdSrv.up0().add(srvR);
				}
			}
			if (!arrSchdSrv.up0().isEmpty()) {
				arrSchdSrv.exec();
				copyErrFlg(upArrSchdL, arrSchdSrv.down0());
			}
			if (!notErrL.isEmpty()) {
				initCacheForUpd01(notErrL);
				for (MfgInstReg_Chk01_HdrR r : notErrL) {
					Ord_Upd01_Dtl1R ordDtl1R = getCacheForUpd01(r.itm_ord_no());
					if (MSC_ITM_ORD_STS_TYP.isOPN(ordDtl1R.b_itm_ord_sts_typ()) || MSC_ITM_ORD_STS_TYP.isSAV(ordDtl1R.b_itm_ord_sts_typ())) {
						copyErrFlg(r, ordDtl1R);
					}
				}
			}
		}
		
		/**
		 * 同一製造指図ＮＯ内にある上り電文に含まれていない工程指図を取得し、
		 * 指図保存のレコードがあったらヘッダの製造状況区分を指図保存とする
		 */
		protected MCMessageList chkOperInstMfgStsTyp(MfgInstReg_Chk01_HdrR hdrR){
			MCMessageList msgL = new MCMessageList();
			
			// 同一製造指図ＮＯ内にある工程指図を取得
			MCList<MSVT_OPER_INST_PR_R> oiprL = MCList.create(MSVT_OPER_INST_PR_R.class);
			MSVT_OPER_INST_PR_R t = MSVT_OPER_INST_PR_R.create("T");
			MCQueryApiBuilder oiprL_bldr = MCQueryApiBuilder.create(t);
			oiprL_bldr.setSelect(t.oper_inst_no, t.mfg_sts_typ);
			oiprL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbSelect("MSBCL6000_MSVT_OPER_INST_PR_S01", oiprL, oiprL_bldr, hdrR);
			
			// oiprLから上り電文に含まれている工程指図を除く
			for (MfgInstReg_Chk01_DtlOperR upOperR : _operCacheForHdr.getCache(hdrR.peg_no())) {
				oiprL = oiprL.subList(r -> !isSame(r.oper_inst_no(), upOperR.oper_inst_no()));
			}
			
			for (MSVT_OPER_INST_PR_R oiprR : oiprL) {
				if (MSC_MFG_STS_TYP.isSAV(oiprR.mfg_sts_typ())) {
					hdrR.mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
					
					// 上り電文に対してメッセージを設定
					for (MfgInstReg_Chk01_DtlOperR upOperR : _operCacheForHdr.getCache(hdrR.peg_no())) {
						msgL.add(new MCMessage(upOperR, null, MSBCL1213, hdrR.mfg_inst_no(), toDispGUIIndex(upOperR)));
					}
					
					return msgL;
				}
			}
			
			return msgL;
		}
		
		/**
		 * 出来高予定の存在チェック
		 */
		protected MCMessageList chkExistYield(MfgInstReg_Chk01_HdrR hdrR) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MfgInstReg_Chk01_DtlYieldR> yieldL = _yieldCacheForHdr.getCache(hdrR.peg_no());
			if (MAC_DATA_CRUD_TYP.isCRT(hdrR.itm_mfg_inst_data_crud_typ())) {
				// 品目製造指図を新規登録する場合
				// ※工程単位の製造指図の場合であっても、品目製造指図を新規登録する際には、
				// 未指図工程も含め全工程が上り電文に含まれているため、出来高予定の存在のみチェックする
				if (yieldL.isEmpty()) {
					// 工程単位製造指図の一覧登録ですべての工程を同時に登録する場合（未指図工程が存在しない場合）、同一ヘッダに紐付く出来高予定が存在しない場合がある
					// その場合は、同一品目オーダＮＯに紐付く出来高予定が存在するかチェックする
					if (!isNull(hdrR.itm_ord_no())) {
						MCList<MfgInstReg_Chk01_DtlYieldR> yieldItmOrdNoL = _yieldCacheForItmOrdNo.getCache(hdrR.itm_ord_no());
						if (yieldItmOrdNoL.isEmpty()) {
							msgL.add(new MCMessage(hdrR, null, MSBCL1128, toDispGUIIndex(hdrR)));
							hdrR.err_flg(true);
						}
					}
					else {
						msgL.add(new MCMessage(hdrR, null, MSBCL1128, toDispGUIIndex(hdrR)));
						hdrR.err_flg(true);
					}
				}
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(hdrR.mfg_inst_data_crud_typ())) {
				// 製造指図（品目製造指図ではない）の更新の場合
				MCList<MfgInstReg_Chk01_DtlYieldR> exceptDelYieldL = yieldL.subList(r -> !r.isStatusDelete());
				if (MAC_MFG_INST_UNIT_TYP.isITM(hdrR.mfg_inst_unit_typ())) {
					// 品目単位の更新の場合、上り電文に全工程が含まれるため、削除行以外の出来高予定が存在しなくなる場合にチェックする
					if (exceptDelYieldL.isEmpty()) {
						msgL.add(new MCMessage(hdrR, null, MSBCL1128, toDispGUIIndex(hdrR)));
						hdrR.err_flg(true);
					}
				}
				else {
					// 工程単位の更新の場合、上り電文には対象工程しか含まれない
					// そのため、元々出来高予定が存在した製造指図において、出来高が存在しなくなる場合にチェックする
					if (!yieldL.isEmpty() && exceptDelYieldL.isEmpty()) {
						msgL.add(new MCMessage(hdrR, null, MSBCL1128, toDispGUIIndex(hdrR)));
						hdrR.err_flg(true);
					}
				}
			}
			return msgL;
		}
		
		protected void chkItmAndBpStop(MCList<MfgInstReg_Chk01_HdrR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}
			
			// 品目禁止チェック
			MCList<MfgInstReg_Chk01_HdrR> itmChkL = MCList.create(MfgInstReg_Chk01_HdrR.class);
			for (MfgInstReg_Chk01_HdrR r : notErrL) {
				if (!MAC_DATA_CRUD_TYP.isDEL(r.mfg_inst_data_crud_typ()) && !r.inst_abort_flg() && !r.not_frst_inst_can_flg()) {
					itmChkL.add(r);
				}
			}
			if (!itmChkL.isEmpty()) {
				String itmTmpCol = "tmp_itm_stop_chk_str";
				itmChkL.addStringColumn(itmTmpCol);
				execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_ITM$F_IS_MFG_INST_STOP", "01"),
						MABSFunction.getFunctionExecuter("MAPA_ITM$F_IS_MFG_INST_STOP"),
						itmTmpCol, itmChkL, MfgInstReg_Chk01_HdrR.$itm_cd,
						MfgInstReg_Chk01_HdrR.$itm_sub1, MfgInstReg_Chk01_HdrR.$itm_sub2,
						MfgInstReg_Chk01_HdrR.$itm_sub3, MfgInstReg_Chk01_HdrR.$inst_dt);
				for (MfgInstReg_Chk01_HdrR r : itmChkL) {
					if (MCBooleanUtil.dbStringToBoolean(r.getStringNE(itmTmpCol))) {
						MCMessagePool.add(new MCMessage(r, MfgInstReg_Chk01_HdrR.$inst_dt,
								MSBCL1035, toDispItm(r.itm_cd(), r.itm_sub1(),
										r.itm_sub2(), r.itm_sub3()),
								toYMDString(r.inst_dt()), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}
			
			// 取引先禁止チェック
			MCList<MfgInstReg_Chk01_HdrR> bpChkL = MCList.create(MfgInstReg_Chk01_HdrR.class);
			for (MfgInstReg_Chk01_HdrR r : notErrL) {
				if (!MAC_DATA_CRUD_TYP.isDEL(r.mfg_inst_data_crud_typ())
						&& !r.inst_abort_flg()
						&& MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ()) && !r.not_frst_inst_can_flg()) {
					bpChkL.add(r);
				}
			}
			
			if (!bpChkL.isEmpty()) {
				String bpTmpCol = "tmp_bp_stop_chk_str";
				bpChkL.addStringColumn(bpTmpCol);
				execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_BP$F_IS_MFG_INST_STOP", "01"),
						MABSFunction.getFunctionExecuter("MAPA_BP$F_IS_MFG_INST_STOP"),
						bpTmpCol, bpChkL, MfgInstReg_Chk01_HdrR.$sppl_cd,
						MfgInstReg_Chk01_HdrR.$inst_dt);
				for (MfgInstReg_Chk01_HdrR r : bpChkL) {
					if (MCBooleanUtil.dbStringToBoolean(r.getStringNE(bpTmpCol))) {
						MCMessagePool.add(new MCMessage(r, MfgInstReg_Chk01_HdrR.$inst_dt,
								MSBCL1036, r.sppl_cd(), toYMDString(r.inst_dt()), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}
		}
		
		/**
		 * 送信後訂正不可チェック
		 * 
		 * @param notErrL
		 */
		protected void chkSendIf(MCList<MfgInstReg_Chk01_HdrR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}
			
			MCIndexKey up1Idx = up1().createIndex(MfgInstReg_Chk01_DtlOperR.$hdr_peg_no, MfgInstReg_Chk01_DtlOperR.$mes_flg);
			MCList<MfgInstReg_Chk01_HdrR> mesL = MCList.create(MfgInstReg_Chk01_HdrR.class);
			for (MfgInstReg_Chk01_HdrR notErrR : notErrL) {
				if (!notErrR.err_flg() && !isNull(notErrR.mfg_inst_no())
						&& !isNull(up1().getFirst(up1Idx, notErrR.peg_no(), true))) {
					mesL.add(notErrR);
				}
			}
			if (mesL.isEmpty()) {
				return;
			}
			
			MCList<MST_MFG_INST_R> sendOkL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder sendOkL_bldr = MCQueryApiBuilder.create(t);
			PFT_SDRV_IF_R t1 = PFT_SDRV_IF_R.create("T1");
			sendOkL_bldr.setSelect(t.mfg_inst_no);
			sendOkL_bldr.setDistinct();
			sendOkL_bldr.addInnerJoin(t1, bracket(t1.attr_char1.eq(t.mfg_inst_no)));
			sendOkL_bldr.addWhereWithAnd(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			sendOkL_bldr.addConstWhereWithAnd(t1.not_send_upd_flg.eq(value(true))
					.and(t1.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.SEND_OK.value())))
					.and(t1.if_proc_typ.in(
							value(MAC_IF_PROC_TYP.MES_YIELD_SCHD_SEND.value()),
							value(MAC_IF_PROC_TYP.MES_OPER_INST_SEND.value()),
							value(MAC_IF_PROC_TYP.MES_INPT_SCHD_SEND.value()),
							value(MAC_IF_PROC_TYP.MES_WK_SCHD_SEND.value()))));
			dbSelect("MSBCL6000_MST_MFG_INST_S03", sendOkL, sendOkL_bldr, mesL, null);
			
			MCIndexKey sendOkIdx = sendOkL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			for (MfgInstReg_Chk01_HdrR mesR : mesL) {
				if (!isNull(sendOkL.getFirst(sendOkIdx, mesR.mfg_inst_no()))) {
					MCMessagePool.add(new MCMessage(mesR, null, MSBCL1201, mesR.mfg_inst_no(), toDispGUIIndex(mesR)));
					mesR.err_flg(true);
				}
			}
		}
		protected Map_PoSchd_Upd01_DtlR_MfgInstReg_Chk01_HdrR<PoSchd_Upd01_DtlR,MfgInstReg_Chk01_HdrR> createMap_PoSchd_Upd01_DtlR_MfgInstReg_Chk01_HdrR() {
			return new Map_PoSchd_Upd01_DtlR_MfgInstReg_Chk01_HdrR<PoSchd_Upd01_DtlR, MfgInstReg_Chk01_HdrR>();
		}

		public class Map_PoSchd_Upd01_DtlR_MfgInstReg_Chk01_HdrR<D extends PoSchd_Upd01_DtlR, S extends MfgInstReg_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PoSchd_Upd01_DtlR.$peg_no, MfgInstReg_Chk01_HdrR.$peg_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$data_crud_typ, MfgInstReg_Chk01_HdrR.$po_schd_data_crud_typ);
				addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_src_typ, MfgInstReg_Chk01_HdrR.$po_schd_src_typ);
				addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_src_no, MfgInstReg_Chk01_HdrR.$po_schd_src_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$outsrc_itm_ord_no, MfgInstReg_Chk01_HdrR.$itm_ord_no);				
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_cd, MfgInstReg_Chk01_HdrR.$itm_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub1, MfgInstReg_Chk01_HdrR.$itm_sub1);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub2, MfgInstReg_Chk01_HdrR.$itm_sub2);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub3, MfgInstReg_Chk01_HdrR.$itm_sub3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.fr_mfg_inst_flg(true);
			}
		}
		
		protected Map_ArrSchd_DtlR_MfgInstReg_Chk01_HdrR<ArrSchd_DtlR,MfgInstReg_Chk01_HdrR> createMap_ArrSchd_DtlR_MfgInstReg_Chk01_HdrR() {
			return new Map_ArrSchd_DtlR_MfgInstReg_Chk01_HdrR<ArrSchd_DtlR, MfgInstReg_Chk01_HdrR>();
		}

		public class Map_ArrSchd_DtlR_MfgInstReg_Chk01_HdrR<D extends ArrSchd_DtlR, S extends MfgInstReg_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ArrSchd_DtlR.$peg_no, MfgInstReg_Chk01_HdrR.$peg_no);
				addColumnPathMap(ArrSchd_DtlR.$mfg_inst_no, MfgInstReg_Chk01_HdrR.$mfg_inst_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// 外注の入荷予定を打ち切る場合は、製造側ではなく入荷予定側で打ち切る想定のためfalse
				dest.abort_flg(false);
				// ロット発番は製造側で行う想定のためfalse
				dest.crt_lot_flg(false);
				dest.is_src_outsrc_srv_flg(true);
			}
		}
		
		protected void chkAndCompOperAfterListLogic() {
			MCList<MfgInstReg_Chk01_DtlOperR> hdrPegNoL = MCList.create(MfgInstReg_Chk01_DtlOperR.class); 
			MCList<MfgInstReg_Chk01_DtlOperR> reExpPegNoL = MCList.create(MfgInstReg_Chk01_DtlOperR.class); 
			MCIndexKey Idx = up4().createIndex(MfgInstReg_Chk01_DtlYieldR.$data_crud_typ, MfgInstReg_Chk01_DtlYieldR.$oper_peg_no);
			// 出来高予定関連チェック
			MCMessagePool.addAll(chkOperYieldSchd());
			for (MfgInstReg_Chk01_DtlOperR operR : up1()) {
				MfgInstReg_Chk01_HdrR hdrR = _hdrCache.getCache(operR.hdr_peg_no());
				if (hdrR.err_flg()) {
					continue;
				}
				if (!MAC_DATA_CRUD_TYP.isDEL(operR.data_crud_typ()) && !operR.inst_abort_flg() && !operR.not_frst_inst_can_flg()) {
					// 削除行、打切行以外に対する補完、チェック処理
					
					operR.base_unit_cd(hdrR.base_unit_cd());
					operR.base_unit_dec_place(hdrR.base_unit_dec_place());
					MAM_ITM_OPER_R itmOperR = _itmOper.get(hdrR.st_schd_tm(), operR.itm_cd(),
							operR.itm_sub1(), operR.itm_sub2(), operR.itm_sub3(),
							operR.mfg_loc_cd(), operR.oper_ptn(), operR.oper_cd(),
							operR.oper_seq());
					
					if (isNull(itmOperR.itm_cd())) {
						// 取得できなかった場合、場所をNULL文字にしてもう一度取得する
						itmOperR = _itmOper.get(hdrR.st_schd_tm(), operR.itm_cd(),
								operR.itm_sub1(), operR.itm_sub2(), operR.itm_sub3(),
								MAC_STR.NULL_VAL.value(), operR.oper_ptn(), operR.oper_cd(),
								operR.oper_seq());
					}
					
					if (isNull(itmOperR.itm_cd()) || isNull(itmOperR.oper_unit_cd())) {
						// 品目工程マスタのレコードがない、または工程単位ＣＤがnullの場合は、基準単位の値を設定する
						operR.oper_std_qty(1);
						operR.oper_conv_qty(1);
						// 端数が発生しないためどのような値が設定されていても関係ないが、nullを許容すると処理が煩雑になるため、四捨五入を設定している
						operR.oper_unit_conv_rnd_typ(MAC_RND_TYP.RNDOFF.value());
						operR.oper_unit_dec_place(operR.base_unit_dec_place());
						operR.oper_unit_cd(operR.base_unit_cd());
					}
					else {
						operR.oper_std_qty(itmOperR.oper_std_qty());
						operR.oper_conv_qty(itmOperR.oper_conv_qty());
						operR.oper_unit_conv_rnd_typ(itmOperR.unit_conv_rnd_typ());
						operR.oper_unit_dec_place(itmOperR.dec_place());
						operR.oper_unit_cd(itmOperR.oper_unit_cd());
					}
					
					if (!isNull(itmOperR.itm_cd())) {
						operR.oper_lt(itmOperR.oper_lt());
						operR.oper_lt_add_qty(itmOperR.oper_lt_add_qty());
						operR.oper_offst_typ(itmOperR.oper_offst_typ());
						operR.oper_offst(itmOperR.oper_offst());
						operR.oper_offst_add_qty(itmOperR.oper_offst_add_qty());
						operR.oper_inst_grp(itmOperR.oper_inst_grp());
						operR.lmt_fr_dt_flg(itmOperR.lmt_fr_dt_flg());
						operR.oper_lower_yield(itmOperR.oper_lower_yield());
						operR.oper_std_yield(itmOperR.oper_std_yield());
						operR.oper_upper_yield(itmOperR.oper_upper_yield());
						operR.wip_rate(itmOperR.wip_rate());
					}
				
					// 計画変更ＦＬＧ
					if (MAC_MFG_INST_UNIT_TYP.isOPER(hdrR.mfg_inst_unit_typ())) {
						// 工程単位製造指図の場合、ヘッダではなく工程毎の日付で比較しないと、常に計画変更とみなされてしまうため工程の変更をチェックしている
						hdrR.schd_chg_flg(false);
						if (operR.oper_schd_chg_flg()) {
							hdrR.schd_chg_flg(true);
						}
					}
					
					operR.hdr_mfg_sts_typ(hdrR.mfg_sts_typ());
					
					MCMessageList msgL = new MCMessageList();
					
					msgL.addAll(checkDecPlace(operR,
							MfgInstReg_Chk01_DtlOperR.$base_unit_dec_place,
							MfgInstReg_Chk01_DtlOperR.$base_unit_qty));
					
					setErrFlg(operR, msgL);
					MCMessagePool.addAll(msgL);
					
					MfgInstReg_Chk01_DtlYieldR crtYieldR = up4().getFirst(Idx, MAC_DATA_CRUD_TYP.CRT.value(), operR.peg_no());
					MfgInstReg_Chk01_DtlYieldR updYieldR = up4().getFirst(Idx, MAC_DATA_CRUD_TYP.UPD.value(), operR.peg_no());
					if(!isNull(crtYieldR) || !isNull(updYieldR)) {
						operR.yield_oper_flg(true);
						operR.yield_oper_ratio(itmOperR.yield_oper_ratio());
						if (isNull(operR.yield_oper_ratio())) {
							operR.yield_oper_ratio(1);
						}
					}else {
						operR.yield_oper_flg(false);
						operR.yield_oper_ratio(null);
					}
				}
				
				if (MSC_MFG_STS_TYP.isSAV(operR.mfg_sts_typ())
						|| MSC_MFG_STS_TYP.isORD(operR.mfg_sts_typ())) {
					operR.mfg_sts_typ(hdrR.mfg_sts_typ());
				}
				if (MAC_DATA_CRUD_TYP.isCRT(hdrR.itm_mfg_inst_data_crud_typ())
						&& !isNull(operR.oper_seq())) {
					if (isNull(operR.re_exp_peg_no())) {
						hdrPegNoL.add(operR);
					}
					else {
						reExpPegNoL.add(operR);
					}
				}
			}
			
			// 出来高計上工程が一件も存在しない場合は、最終工程を出来高計上工程とする
			
			// 工程単位製造指図で初回製造指図と初回以外製造指図を同時に登録する場合、出来高計上工程が初回以外製造指図のみに紐付いていると、
			// 初回製造指図の最終工程が出来高計上工程とみなされてしまう。
			// それを防ぐため、再展開用紐付けＮＯ（工程）を使用して、初回製造指図と初回以外製造指図の工程を紐付けている。
			// 再展開用紐付けＮＯが設定されていない場合はヘッダ紐付けＮＯで紐付け、設定されている場合は再展開用紐付けＮＯで紐付ける。
			if (!hdrPegNoL.isEmpty()) {
				for (MCList<MfgInstReg_Chk01_DtlOperR> gL : up1()
						.groupList(MfgInstReg_Chk01_DtlOperR.$hdr_peg_no)) {
					setYieldOperFlg(gL);
				}
			}

			if (!reExpPegNoL.isEmpty()) {
				for (MCList<MfgInstReg_Chk01_DtlOperR> gL : up1()
						.groupList(MfgInstReg_Chk01_DtlOperR.$re_exp_peg_no)) {
					if (isNull(gL.get(0).re_exp_peg_no())) {
						continue;
					}
					setYieldOperFlg(gL);
				}
			}
		}
		protected MCMessageList chkOperYieldSchd() {
			MCMessageList msgL = new MCMessageList();

			MCList<MfgInstReg_Chk01_DtlYieldR> yieldNonDeleteL = up4().subList(MCRow.Status.CREATE, MCRow.Status.MODIFY, MCRow.Status.NONE);
			MCList<MfgInstReg_Chk01_DtlYieldR> yieldCreateL = up4().subList(MCRow.Status.CREATE);
			MCList<MST_YIELD_SCHD_R> yieldSchdL = getExistYieldSchd();
			MCIndexKey yieldNonDeleteKey = yieldNonDeleteL.createIndex(MfgInstReg_Chk01_DtlYieldR.$oper_peg_no);
			MCIndexKey yieldCreateKey = yieldCreateL.createIndex(MfgInstReg_Chk01_DtlYieldR.$oper_peg_no);
			MCIndexKey yieldSchdKey = yieldSchdL.createIndex(MST_YIELD_SCHD_R.$oper_inst_no);

			for (MCList<MfgInstReg_Chk01_DtlYieldR> yieldGrpL : up4().groupList(MfgInstReg_Chk01_DtlYieldR.$oper_peg_no)) {
				boolean hasErr = false;
				MfgInstReg_Chk01_DtlOperR operR = _operCache.getCache(yieldGrpL.get(0).oper_peg_no());

				MfgInstReg_Chk01_DtlYieldR yieldNonDeleteR = yieldNonDeleteL.getFirst(yieldNonDeleteKey, yieldGrpL.get(0).oper_peg_no());
				MfgInstReg_Chk01_DtlYieldR yieldCreateR = yieldCreateL.getFirst(yieldCreateKey, yieldGrpL.get(0).oper_peg_no());
				MST_YIELD_SCHD_R yieldSchdR = yieldSchdL.getFirst(yieldSchdKey, yieldGrpL.get(0).oper_inst_no());

				if (operR.isStatusDelete() && (!isNull(yieldNonDeleteR) || !isNull(yieldSchdR))) {
					hasErr = true;
					msgL.add(new MCMessage(operR, null, MSBCL1215, operR.oper_inst_no(), toDispGUIIndex(operR)));
				}
				else if (MSC_MFG_STS_TYP.isSTT(operR.mfg_sts_typ())) {
					if (operR.yield_oper_flg() && isNull(yieldNonDeleteR) && isNull(yieldSchdR)) {
						hasErr = true;
						msgL.add(new MCMessage(operR, null, MSBCL1214, operR.oper_inst_no(), toDispGUIIndex(operR)));
					}
					else if (!operR.yield_oper_flg() && !isNull(yieldCreateR)) {
						hasErr = true;
						msgL.add(new MCMessage(operR, null, MSBCL1214, operR.oper_inst_no(), toDispGUIIndex(operR)));
					}
				}

				if (hasErr) {
					setErrFlg(operR, msgL);
				}
			}
			return msgL;
		}

		protected MCList<MST_YIELD_SCHD_R> getExistYieldSchd() {
			MCList<MfgInstReg_Chk01_HdrR> bindL = MCList.create(MfgInstReg_Chk01_HdrR.class);
			for (MfgInstReg_Chk01_HdrR r : up0()) {
				if (!isNull(r.mfg_inst_no())) {
					bindL.add(r);
				}
			}

			MCQueryApiBuilder mfgInstWkBldr = MCQueryApiBuilder.create(MST_MFG_INST_R.create("MFG_INST_KEY"));
			dbWkDelete("MSBCL6000_MSW_MFG_INST_D01", mfgInstWkBldr.getBaseDbc());
			dbWkInsert("MSBCL6000_MSW_MFG_INST_I01", bindL, mfgInstWkBldr.getBaseDbc());

			MCList<MST_YIELD_SCHD_R> yieldSchdL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R yieldSchd = MST_YIELD_SCHD_R.create("YIELD_SCHD");
			MSW_MFG_INST_KEY_R mfgInstKey = MSW_MFG_INST_KEY_R.create("MFG_INST_KEY");
			MCQueryApiBuilder yieldSchdL_bldr = MCQueryApiBuilder.create(yieldSchd);
			yieldSchdL_bldr.setSelect(yieldSchd.yield_schd_no);
			yieldSchdL_bldr.addSelect(yieldSchd.oper_inst_no);
			yieldSchdL_bldr.addInnerJoin(mfgInstKey, yieldSchd.mfg_inst_no.eq(mfgInstKey.mfg_inst_no));
			yieldSchdL_bldr.setWhere(yieldSchd.yield_typ.neq(value(MAC_YIELD_TYP.BYPROD.value())));
			yieldSchdL_bldr.addWhereWithAnd(yieldSchd.can_flg.eq(value(false)));
			dbSelect("MSBCL6000_MST_YIELD_SCHD_S09", yieldSchdL, yieldSchdL_bldr);

			MCList<MST_YIELD_SCHD_R> tgtL = MCList.create(MST_YIELD_SCHD_R.class);
			MCIndexKey yieldSchdKey = up4().createIndex(MfgInstReg_Upd01_DtlYieldR.$yield_schd_no);
			for (MST_YIELD_SCHD_R r : yieldSchdL) {
				MfgInstReg_Chk01_DtlYieldR yieldSchdR = up4().getFirst(yieldSchdKey, r.yield_schd_no());
				if (isNull(yieldSchdR)) {
					tgtL.add(r);
				}
			}
			return tgtL;
		}

		/**
		 * 出来高計上工程が一件も存在しない場合は、最終工程を出来高計上工程とする
		 * @param gL
		 */
		protected void setYieldOperFlg(MCList<MfgInstReg_Chk01_DtlOperR> gL) {
			if (isNull(gL.getFirst(MfgInstReg_Chk01_DtlOperR.$yield_oper_flg, true))) {
				MCSortPolicy sp = new MCSortPolicy();
				sp.add(MCList.SortType.DESC, MfgInstReg_Chk01_DtlOperR.$disp_seq);
				sp.add(MCList.SortType.DESC, MfgInstReg_Chk01_DtlOperR.$oper_cd);
				sp.add(MCList.SortType.DESC, MfgInstReg_Chk01_DtlOperR.$oper_seq);
				gL.sort(sp);

				MfgInstReg_Chk01_DtlOperR yieldOperR = gL.get(0);
				//工程ＣＤ・工程連番のまとまりに対して設定
				MCIndexKey idxKey = gL.createIndex(MfgInstReg_Chk01_DtlOperR.$oper_cd, MfgInstReg_Chk01_DtlOperR.$oper_seq);
				MCList<MfgInstReg_Chk01_DtlOperR> down2L = gL.subList(idxKey, yieldOperR.oper_cd(), yieldOperR.oper_seq());
				down2L.setBoolean("yield_oper_flg", true);
				down2L.setNumber("yield_oper_ratio", 1);
			}
		}

		protected void chkAndCompInptAfterListLogic() {
			MCList<MfgInstReg_Chk01_DtlInptR> altChkL = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
			MCList<MfgInstReg_Chk01_DtlInptR> lotChkL = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
			MCList<MfgInstReg_Chk01_DtlInptR> xfrChkL = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
			MCList<MfgInstReg_Chk01_DtlInptR> xfrChkEnableL = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
			MCList<MfgInstReg_Chk01_DtlInptR> xfrChkDisableL = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
			MCList<MfgInstReg_Chk01_DtlInptR> inptAddChkL = up2().subList(r -> !isNull(r.bom_id_no()));
			MCIndexKey inptAddKey = inptAddChkL.createIndex(MfgInstReg_Chk01_DtlInptR.$itm_cd,
					MfgInstReg_Chk01_DtlInptR.$itm_sub1,
					MfgInstReg_Chk01_DtlInptR.$itm_sub2,
					MfgInstReg_Chk01_DtlInptR.$itm_sub3);
			
			for (MfgInstReg_Chk01_DtlInptR inptR : up2()) {
				MfgInstReg_Chk01_HdrR hdrR = _hdrCache.getCache(inptR.hdr_peg_no());
				if (hdrR.err_flg()) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isCRT(inptR.data_crud_typ()) && !inptR.inst_abort_flg()) {
					// 投入品の行追加許可チェック
					if (!hdrR.inpt_itm_add_flg() && isNull(inptR.bom_id_no())) {
						if (isNull(inptAddChkL.getFirst(inptAddKey, inptR.itm_cd(),
								inptR.itm_sub1(), inptR.itm_sub2(), inptR.itm_sub3()))) {
							MCMessagePool.add(new MCMessage(inptR,
									MfgInstReg_Chk01_DtlInptR.$itm_cd, MSBCL1033,
									toDispItm(inptR.itm_cd(), inptR.itm_sub1(),
											inptR.itm_sub2(), inptR.itm_sub3()),
									toDispGUIIndex(inptR)));
							inptR.err_flg(true);
						}
					}
				}
				
				if (!MAC_DATA_CRUD_TYP.isDEL(inptR.data_crud_typ()) && !inptR.inst_abort_flg() && !inptR.not_frst_inst_can_flg()) {
					// 削除行、打切行以外に対する補完、チェック処理
					
					if (MAC_LOT_MNG_TYP.isNOT_MNG(inptR.lot_mng_typ())) {
						inptR.lot_no(MAC_STR.NULL_VAL.value());
					}
					else {
						inptR.lot_no(nullValToNull(inptR.lot_no()));
					}
					if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(inptR.sublot_mng_typ())) {
						inptR.sublot_no(MAC_STR.NULL_VAL.value());
					}
					else {
						inptR.sublot_no(nullValToNull(inptR.sublot_no()));
					}

					MfgInstReg_Chk01_DtlOperR operR = _operCache.getCache(inptR.oper_peg_no());
					if (MSC_MFG_STS_TYP.isYET(operR.mfg_sts_typ())
							|| MSC_MFG_STS_TYP.isSAV(operR.mfg_sts_typ())
							|| MSC_MFG_STS_TYP.isORD(operR.mfg_sts_typ())) {
						inptR.mfg_sts_typ(operR.mfg_sts_typ());
						if (MSC_MFG_STS_TYP.isYET(operR.mfg_sts_typ())) {
							inptR.alloc_flg(false);
						}
					}
					else {
						// 工程のステータスが着手中以降の場合は元のステータスを設定。元のステータスが未設定（行追加された場合）は「指図済」とする
						inptR.mfg_sts_typ(nvl(inptR.old_mfg_sts_typ(), MSC_MFG_STS_TYP.ORD.value()));
					}

					// ロットの存在チェックサービスの呼び出し用リスト
					if (!isNullOrNullVal(inptR.lot_no())) {
						lotChkL.add(inptR);
					}
					
					// チェック処理
					MCMessageList msgL = new MCMessageList();
					
					if (!isNull(inptR.alt_grp_cd())) {
						// 代替品用のチェックリスト
						altChkL.add(inptR);
					}
					else {
						// 正の数チェック（代替品目の場合は、後の処理で行う）
						msgL.addAll(chkInptQtyPositive(inptR));
					}

					// 有効桁数チェック
					msgL.addAll(checkDecPlace(inptR,
							MfgInstReg_Chk01_DtlInptR.$base_unit_dec_place,
							MfgInstReg_Chk01_DtlInptR.$base_unit_inpt_qty));
					msgL.addAll(checkDecPlace(inptR,
							MfgInstReg_Chk01_DtlInptR.$base_unit_dec_place,
							MfgInstReg_Chk01_DtlInptR.$base_unit_rqmt_qty));
					msgL.addAll(checkDecPlace(inptR,
							MfgInstReg_Chk01_DtlInptR.$base_unit_dec_place,
							MfgInstReg_Chk01_DtlInptR.$base_unit_fxd_rqmt_qty));

					// 版ＮＯ
					if (inptR.ver_flg()) {
						msgL.addAll(check(inptR, MfgInstReg_Chk01_DtlInptR.$ver_no, new FXUCL_RequiredValidater()));
					}
					
					// 有効成分
					if (inptR.cont_fctr_flg()) {
						msgL.addAll(check(inptR, MfgInstReg_Chk01_DtlInptR.$cont_inpt_qty, new FXUCL_RequiredValidater()));
						msgL.addAll(check(inptR, MfgInstReg_Chk01_DtlInptR.$cont_rqmt_qty, new FXUCL_RequiredValidater()));
						if (!inptR.getBoolean("fxd_loss_rsn_none_flg")) {
							msgL.addAll(check(inptR, MfgInstReg_Chk01_DtlInptR.$cont_fxd_rqmt_qty, new FXUCL_RequiredValidater()));
						}
						
						msgL.addAll(checkDecPlace(inptR,
								MfgInstReg_Chk01_DtlInptR.$cont_fctr_dec_place,
								MfgInstReg_Chk01_DtlInptR.$cont_inpt_qty));
						msgL.addAll(checkDecPlace(inptR,
								MfgInstReg_Chk01_DtlInptR.$cont_fctr_dec_place,
								MfgInstReg_Chk01_DtlInptR.$cont_rqmt_qty));
						msgL.addAll(checkDecPlace(inptR,
								MfgInstReg_Chk01_DtlInptR.$cont_fctr_dec_place,
								MfgInstReg_Chk01_DtlInptR.$cont_fxd_rqmt_qty));
					}
					else {
						inptR.cont_inpt_qty(null);
						inptR.cont_rqmt_qty(null);
						inptR.cont_fxd_rqmt_qty(null);
					}
					
					// 引当チェック
					if (inptR.alloc_flg()) {
						if (MAC_PROV_TYP.isSS(inptR.prov_typ())) {
							msgL.add(new MCMessage(inptR,
									MfgInstReg_Chk01_DtlInptR.$alloc_flg, MSBCL1119,
									toDispItm(inptR.itm_cd(), inptR.itm_sub1(),
											inptR.itm_sub2(), inptR.itm_sub3()),
									toDispGUIIndex(inptR)));
						}
						if (MAC_INPT_CTL_TYP.isNO_MRP_INST(inptR.inpt_ctl_typ())) {
							msgL.add(new MCMessage(inptR,
									MfgInstReg_Chk01_DtlInptR.$alloc_flg, MSBCL1112,
									toDispItm(inptR.itm_cd(), inptR.itm_sub1(),
											inptR.itm_sub2(), inptR.itm_sub3()),
									toDispGUIIndex(inptR)));
						}
					}
					
					setErrFlg(inptR, msgL);
					MCMessagePool.addAll(msgL);
				}

				// 移動・移送予定の呼び出し用リスト
				// ※新規の場合は、ロット提案後に移動・移送予定となるかが決定するため、ここではチェックサービスを呼べない
				// そのためUpdオペレーションでChk処理を呼び出す（新規の場合は、マスタ設定の不備が主なチェック内容）。
				if (!isNull(inptR.inpt_schd_no()) && !inptR.disp_seq_upd_flg()) {
					xfrChkL.add(inptR);
				}
			}
			
			// 代替関連のチェック
			MCMessagePool.addAll(chkAltGrp(altChkL));
			
			// 投入ロットの存在チェックサービス呼び出し
			MSBFL_LotService.Lot_Chk03 lotOpe = MSBFL_LotService.crtLot_Chk03();
			if (!lotChkL.isEmpty()) {
				addAll(lotOpe.up0(), lotChkL, createMap_Lot_Chk03_CndR_MfgInstReg_Chk01_DtlInptR());
				lotOpe.exec();
				String[] destCols = new String[] {
						MfgInstReg_Chk01_DtlInptR.$lot_quality_typ,
						MfgInstReg_Chk01_DtlInptR.$act_cont_fctr,
						MfgInstReg_Chk01_DtlInptR.$vld_dt,
						MfgInstReg_Chk01_DtlInptR.$first_gr_dt,
						MfgInstReg_Chk01_DtlInptR.$lot_seq,
						MfgInstReg_Chk01_DtlInptR.$lot_ver_no
				};
				String[] srcCols = new String[] {
						Lot_Chk03_CndR.$quality_typ,
						Lot_Chk03_CndR.$act_cont_fctr,
						Lot_Chk03_CndR.$vld_dt,
						Lot_Chk03_CndR.$first_gr_dt,
						Lot_Chk03_CndR.$lot_seq,
						Lot_Chk03_CndR.$ver_no
				};
				copyByPegNo(lotChkL, destCols, lotOpe.down0(), srcCols);
				copyErrFlg(lotChkL, lotOpe.down0());
			}
			
			for (MfgInstReg_Chk01_DtlInptR r : lotChkL) {
				// 有効期限と投入予定日の前後チェック
				MCDate schdDt = r.schd_tm().startTimeOfDay();
				if (!isNull(r.vld_dt()) && r.vld_dt().ltDate(schdDt)) {
					MCMessagePool.add(new MCMessage(r, MfgInstReg_Chk01_DtlInptR.$schd_tm,
							MSBCL1044, toYMDString(r.vld_dt()), toYMDString(schdDt), toDispGUIIndex(r)));
					r.err_flg(true);
				}
				// ロットの良品区分のチェック
				if (MAC_QUALITY_TYP.isDFCT_INSP(r.lot_quality_typ())
						|| MAC_QUALITY_TYP.isDFCT_OPER(r.lot_quality_typ())) {
					MCMessagePool.add(
							new MCMessage(r, MfgInstReg_Chk01_DtlInptR.$lot_no, MSBCL1004,
									toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
									r.lot_no(), r.sublot_no(), toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			
			// 移動・移送予定のチェックサービス呼び出し（外注製造指図サービスにも同様の処理がある）
			// 移動指図済取消不可のリスト
			MCList<XfrSchdChk04_DtlR> xfrSchdSrvDelDisable = MCList.create(XfrSchdChk04_DtlR.class);
			// 移動指図済取消可のリスト
			MCList<XfrSchdChk04_DtlR> xfrSchdSrvDelEnable = MCList.create(XfrSchdChk04_DtlR.class);

			MCList<MST_XFR_SCHD_R> dbXfrRqstL = getXfrRqstL(xfrChkL);
			MCIndexKey xfrIdxKey = dbXfrRqstL.createIndex(MST_XFR_SCHD_R.$inpt_schd_no);
			for (MfgInstReg_Chk01_DtlInptR upR : xfrChkL) {
				// 投入予定に紐付く移動・移送予定が存在する場合は、チェックサービスを呼び出す
				for (MST_XFR_SCHD_R xfrR : dbXfrRqstL.subList(xfrIdxKey, upR.inpt_schd_no())) {
					XfrSchdChk04_DtlR srvR = XfrSchdChk04_DtlR.create(); 
					copy(srvR, upR, createMap_XfrSchdChk04_DtlR_MfgInstReg_Chk01_DtlInptR());
					srvR.xfr_schd_no(xfrR.xfr_schd_no());
					
					MfgInstReg_Chk01_HdrR hdrR = _hdrCache.getCache(upR.hdr_peg_no());
					if ((MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ()) || hdrR.inst_abort_flg() || hdrR.not_frst_inst_can_flg())
							&& !hdrR.xfr_inst_del_enable_flg()) {
						// 削除または打切りかつ、移動指図取消不可の場合、エラーとする
						// ※更新の場合、Updオペレーションでは数量減の場合は作成済みの移動・移送予定を引き当てる振る舞いとなり、
						// 数量増の場合は、追加の移動・移送予定を登録する振る舞いとなるため、エラーとはしない
						xfrSchdSrvDelDisable.add(srvR);
						xfrChkDisableL.add(upR);
					}
					else {
						xfrSchdSrvDelEnable.add(srvR);
						xfrChkEnableL.add(upR);
					}
				}
			}
			
			if (!xfrSchdSrvDelEnable.isEmpty() || !xfrSchdSrvDelDisable.isEmpty()) {
				MSBEL_XfrSchdService.XfrSchd_Chk04 xfrChk = MSBEL_XfrSchdService.crtXfrSchd_Chk04();
				xfrChk.up0().addAll(xfrSchdSrvDelDisable);
				xfrChk.up0().addAll(xfrSchdSrvDelEnable);
				
				MCMessageList bfrMsgL = (MCMessageList) MCMessagePool.getMessageList().clone();
				MCMessagePool.clear();
				xfrChk.exec();
				MCMessageList xfrChkMsg = (MCMessageList) MCMessagePool.getMessageList().clone();
				MCMessagePool.clear();
				// チェックサービス呼び出し前のメッセージを元に戻す
				MCMessagePool.addAll(bfrMsgL);
				
				// 移動・移送予定サービスが作成したメッセージのうち、必要なメッセージのみメッセージプールに追加する
				for (MCMessage msg : xfrChkMsg) {
					if (!isIgnoreXfrChkMsg(msg, xfrSchdSrvDelEnable)) {
						MCMessagePool.add(msg);
					}
				}
				
				MCIndexKey xfrChkIdxkey = xfrChk.down0().createIndex(
						XfrSchdChk04_DtlR.$peg_no, XfrSchdChk04_DtlR.$err_flg);
				
				if (!xfrSchdSrvDelEnable.isEmpty()) {
					for (MfgInstReg_Chk01_DtlInptR upR : xfrChkEnableL) {
						if (!isNull(xfrChk.down0().getFirst(xfrChkIdxkey, upR.peg_no(), true))) {
							upR.xfr_inst_err_flg(true);
						}
					}
				}
				
				if (!xfrSchdSrvDelDisable.isEmpty()) {
					for (MfgInstReg_Chk01_DtlInptR upR : xfrChkDisableL) {
						if (!isNull(xfrChk.down0().getFirst(xfrChkIdxkey, upR.peg_no(), true))) {
							upR.err_flg(true);
						}
					}
				}
			}
		}
		
		protected MCMessageList chkInptQtyPositive(MfgInstReg_Chk01_DtlInptR inptR) {
			MCMessageList msgL = new MCMessageList();
			if (!inptR.base_unit_rqmt_qty().isPositive() && !inptR.base_unit_fxd_rqmt_qty().isPositive()) {
				msgL.add(new MCMessage(inptR,
						MfgInstReg_Chk01_DtlInptR.$base_unit_rqmt_qty, MSBCL1117,
						toDispGUIIndex(inptR)));
			}
			return msgL;
		}
		
		/**
		 * 代替品目に関するチェック
		 * @return
		 */
		protected MCMessageList chkAltGrp(MCList<MfgInstReg_Chk01_DtlInptR> tgtL) {
			MCMessageList msgL = new MCMessageList();

			for (MCList<MfgInstReg_Chk01_DtlInptR> grpL : tgtL.groupList(
					MfgInstReg_Chk01_DtlInptR.$oper_peg_no, MfgInstReg_Chk01_DtlInptR.$alt_grp_cd,
					MfgInstReg_Chk01_DtlInptR.$alt_grp_seq)) {

				MCList<MfgInstReg_Chk01_DtlInptR> fixL = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
				MCList<MfgInstReg_Chk01_DtlInptR> notFixL = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
				
				// 代替品目指定フラグがオンとオフのレコードに分別
				for (MfgInstReg_Chk01_DtlInptR r : grpL) {
					if (r.alt_itm_fix_flg()) {
						fixL.add(r);
					}
					else {
						notFixL.add(r);
					}
				}
				
				if (!fixL.isEmpty() && !notFixL.isEmpty()) {
					// 代替品目指定フラグがオンとオフのレコードが混在する場合、オフのレコードに対してチェック
					for (MfgInstReg_Chk01_DtlInptR r : notFixL) {
						if (r.alloc_flg()) {
							MfgInstReg_Chk01_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
							if (!hdrR.lst_reg_flg()) {
								// 単票画面場合はエラー
								MCMessagePool.add(new MCMessage(r,
										MfgInstReg_Chk01_DtlInptR.$alloc_flg,
										MSBCL1115, toDispItm(r.itm_cd(), r.itm_sub1(),r.itm_sub2(), r.itm_sub3()),
										toDispGUIIndex(r)));
								r.err_flg(true);
							}
							else {
								// 一括登録の場合、ユーザが意思入れできない項目なので、falseに上書きする
								r.alloc_flg(false);
							}
						}
						
						// 代替品目指定がオフの行は、数量が全て0でなければならない
						if (!r.base_unit_inpt_qty().isZero()
								|| !r.base_unit_rqmt_qty().isZero()
								|| !r.base_unit_fxd_rqmt_qty().isZero()) {
							String couseCol;
							if (r.base_unit_inpt_qty().isZero()) {
								couseCol = MfgInstReg_Chk01_DtlInptR.$base_unit_inpt_qty;
							}
							else if (r.base_unit_rqmt_qty().isZero()) {
								couseCol = MfgInstReg_Chk01_DtlInptR.$base_unit_rqmt_qty;
							}
							else {
								couseCol = MfgInstReg_Chk01_DtlInptR.$base_unit_fxd_rqmt_qty;
							}
							MCMessagePool.add(new MCMessage(r, couseCol,
									MSBCL1116, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
									toDispGUIIndex(r)));
							r.err_flg(true);
						}
					}
				}
				else {
					// 代替品目指定フラグがオンとオフのレコードが混在しない場合、全行に対して正の数チェック
					for (MfgInstReg_Chk01_DtlInptR r : grpL) {
						msgL.addAll(chkInptQtyPositive(r));
					}
				}				
			}
			return msgL;
		}
		
		protected boolean isIgnoreXfrChkMsg(MCMessage msg, MCList<XfrSchdChk04_DtlR> xfrSchdSrvDelEnable) {
			MCRow causeRow = msg.getCauseRow();
			for (XfrSchdChk04_DtlR enableRow : xfrSchdSrvDelEnable) {
				if (causeRow.getParamIndex() == enableRow.getParamIndex()
						&& causeRow.getParamRowIndex() == enableRow.getParamRowIndex()) {
					// xfrSchdSrvDelEnableのリストについてはerr_flgのみを取得したいので、サービスがメッセージプールに追加したメッセージは無視する
					return true;
				}
			}
			return false;
		}
		
		protected Map_Lot_Chk03_CndR_MfgInstReg_Chk01_DtlInptR<Lot_Chk03_CndR,MfgInstReg_Chk01_DtlInptR> createMap_Lot_Chk03_CndR_MfgInstReg_Chk01_DtlInptR() {
			return new Map_Lot_Chk03_CndR_MfgInstReg_Chk01_DtlInptR<Lot_Chk03_CndR, MfgInstReg_Chk01_DtlInptR>();
		}

		public class Map_Lot_Chk03_CndR_MfgInstReg_Chk01_DtlInptR<D extends Lot_Chk03_CndR, S extends MfgInstReg_Chk01_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk03_CndR.$peg_no, MfgInstReg_Chk01_DtlInptR.$peg_no);
				addColumnPathMap(Lot_Chk03_CndR.$itm_cd, MfgInstReg_Chk01_DtlInptR.$itm_cd);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, MfgInstReg_Chk01_DtlInptR.$itm_sub1);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, MfgInstReg_Chk01_DtlInptR.$itm_sub2);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, MfgInstReg_Chk01_DtlInptR.$itm_sub3);
				addColumnPathMap(Lot_Chk03_CndR.$lot_no, MfgInstReg_Chk01_DtlInptR.$lot_no);
				addColumnPathMap(Lot_Chk03_CndR.$sublot_no, MfgInstReg_Chk01_DtlInptR.$sublot_no);
				addColumnPathMap(Lot_Chk03_CndR.$ver_no, MfgInstReg_Chk01_DtlInptR.$ver_no);
			}
		}
		
		protected MCList<MST_XFR_SCHD_R> getXfrRqstL(MCList<MfgInstReg_Chk01_DtlInptR> xfrChkL) {
			MCList<MST_XFR_SCHD_R> dbXfrL = MCList.create(MST_XFR_SCHD_R.class);
			MST_XFR_SCHD_R t = MST_XFR_SCHD_R.create("T");
			MCQueryApiBuilder dbXfrL_bldr = MCQueryApiBuilder.create(t);
			dbXfrL_bldr.setSelect(t.inpt_schd_no, t.xfr_schd_no);
			dbXfrL_bldr.setWhere(t.inpt_schd_no.eq(bind("inpt_schd_no")));
			dbXfrL_bldr.setOrderByAsc(dbXfrL_bldr.getBaseDbc().getKeyColumn$());
			if (!xfrChkL.isEmpty()) {
				dbSelectForUpdate("MSBCL6000_MST_XFR_SCHD_S01", dbXfrL, dbXfrL_bldr, xfrChkL);
			}
			return dbXfrL;
		}

		protected Map_XfrSchdChk04_DtlR_MfgInstReg_Chk01_DtlInptR<XfrSchdChk04_DtlR,MfgInstReg_Chk01_DtlInptR> createMap_XfrSchdChk04_DtlR_MfgInstReg_Chk01_DtlInptR() {
			return new Map_XfrSchdChk04_DtlR_MfgInstReg_Chk01_DtlInptR<XfrSchdChk04_DtlR, MfgInstReg_Chk01_DtlInptR>();
		}

		public class Map_XfrSchdChk04_DtlR_MfgInstReg_Chk01_DtlInptR<D extends XfrSchdChk04_DtlR, S extends MfgInstReg_Chk01_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdChk04_DtlR.$peg_no, MfgInstReg_Chk01_DtlInptR.$peg_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.xfr_src_typ(MSC_XFR_SRC_TYP.INPT.value());
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		
		protected void chkAndCompWkAfterListLogic() {
			for (MfgInstReg_Chk01_DtlWkR wkR : up3()) {
				MfgInstReg_Chk01_HdrR hdrR = _hdrCache.getCache(wkR.hdr_peg_no());
				if (hdrR.err_flg()) {
					continue;
				}
				if (!MAC_DATA_CRUD_TYP.isDEL(wkR.data_crud_typ()) && !wkR.inst_abort_flg() && !wkR.not_frst_inst_can_flg()) {
					// 削除行、打切行以外に対する補完、チェック処理
					MAM_OPER_WK_COST_R wkCostR = _operWkCost.get(hdrR.st_schd_tm(), 
							wkR.itm_cd(), wkR.itm_sub1(), wkR.itm_sub2(), wkR.itm_sub3(),
							wkR.mfg_loc_cd(), wkR.oper_ptn(), wkR.oper_cd(), wkR.oper_seq(),
							wkR.wk_cost_cd());
					
					if (isNull(wkCostR.itm_cd())) {
						// 取得できなかった場合、場所をNULL文字にしてもう一度取得する
						wkCostR = _operWkCost.get(hdrR.st_schd_tm(), 
								wkR.itm_cd(), wkR.itm_sub1(), wkR.itm_sub2(), wkR.itm_sub3(),
								MAC_STR.NULL_VAL.value(), wkR.oper_ptn(), wkR.oper_cd(), wkR.oper_seq(),
								wkR.wk_cost_cd());
					}
					
					wkR.mst_wk_cost(wkCostR.wk_cost());
					wkR.mst_fxd_wk_cost(wkCostR.fxd_wk_cost());
					
					MfgInstReg_Chk01_DtlOperR operR = _operCache.getCache(wkR.oper_peg_no());
					if (MSC_MFG_STS_TYP.isYET(operR.mfg_sts_typ())
							|| MSC_MFG_STS_TYP.isSAV(operR.mfg_sts_typ())
							|| MSC_MFG_STS_TYP.isORD(operR.mfg_sts_typ())) {
						wkR.mfg_sts_typ(operR.mfg_sts_typ());
					}
					else {
						wkR.mfg_sts_typ(nvl(wkR.old_mfg_sts_typ(), MSC_MFG_STS_TYP.ORD.value()));
					}
					
					MCMessageList msgL = new MCMessageList();
					
					// 正の数チェック
					// wk_zero_flgがtrueの場合、予定工数（固定）、予定工数（数量依存）が０のとき登録できる
					// wk_zero_flgがfalseの場合、予定工数（固定）、予定工数（数量依存）が０のとき登録できない
					boolean wk_zero_flg = mcframe.serverCore.resource.MCConst.app.getBoolean("MS.MSBCL6000.wk_zero_flg", false);
					
					if (!isNull(wkR.wk_cost()) && !wkR.wk_cost().isPositive() && !wkR.fxd_wk_cost().isPositive() && !wk_zero_flg) {
						msgL.add(new MCMessage(wkR, MfgInstReg_Chk01_DtlWkR.$wk_cost, MSBCL1118, toDispGUIIndex(wkR)));
					}
					
					// 有効桁数チェック
					msgL.addAll(checkDecPlace(wkR,
							MfgInstReg_Chk01_DtlWkR.$wk_cost_dec_place,
							MfgInstReg_Chk01_DtlWkR.$wk_cost));
					msgL.addAll(checkDecPlace(wkR,
							MfgInstReg_Chk01_DtlWkR.$wk_cost_dec_place,
							MfgInstReg_Chk01_DtlWkR.$fxd_wk_cost));

					setErrFlg(wkR, msgL);
					MCMessagePool.addAll(msgL);
				}
			}
		}

		protected void chkAndCompYieldAfterListLogic() {
			MCList<MfgInstReg_Chk01_DtlYieldR> inspL = MCList.create(MfgInstReg_Chk01_DtlYieldR.class);
			
			for (MfgInstReg_Chk01_DtlYieldR yieldR : up4()) {
				MfgInstReg_Chk01_HdrR hdrR = _hdrCache.getCache(yieldR.hdr_peg_no());
				if (hdrR.err_flg()) {
					continue;
				}
				if (!MAC_DATA_CRUD_TYP.isDEL(yieldR.data_crud_typ()) && !yieldR.inst_abort_flg() && !yieldR.not_frst_inst_can_flg()) {
					// 削除行、打切行以外に対する補完、チェック処理
					
					yieldR.base_unit_cd(hdrR.base_unit_cd());
					yieldR.base_unit_yield_qty(convToBaseUnit(yieldR.trd_unit_yield_qty(),
							yieldR.conv_base_qty(), yieldR.conv_qty(),
							hdrR.base_unit_dec_place(), hdrR.base_unit_conv_rnd_typ()));
					
					MfgInstReg_Chk01_DtlOperR operR = _operCache.getCache(yieldR.oper_peg_no());
					if (MSC_MFG_STS_TYP.isYET(operR.mfg_sts_typ())
							|| MSC_MFG_STS_TYP.isSAV(operR.mfg_sts_typ())
							|| MSC_MFG_STS_TYP.isORD(operR.mfg_sts_typ())) {
						yieldR.mfg_sts_typ(operR.mfg_sts_typ());
					}
					else {
						yieldR.mfg_sts_typ(nvl(yieldR.old_mfg_sts_typ(), MSC_MFG_STS_TYP.ORD.value()));
					}
					
					yieldR.itm_ord_no(hdrR.itm_ord_no());
					yieldR.mfg_loc_cd(hdrR.mfg_loc_cd());
					yieldR.mfg_aprv_sts_typ(hdrR.mfg_aprv_sts_typ());
					yieldR.itm_cd(hdrR.itm_cd());
					yieldR.itm_sub1(hdrR.itm_sub1());
					yieldR.itm_sub2(hdrR.itm_sub2());
					yieldR.itm_sub3(hdrR.itm_sub3());
					yieldR.sno1(hdrR.sno1());
					yieldR.sno2(hdrR.sno2());
					yieldR.sno3(hdrR.sno3());
					yieldR.sno4(hdrR.sno4());
					
					MCMessageList msgL = new MCMessageList();
					
					// 有効桁数チェック
					msgL.addAll(checkDecPlace(yieldR,
							MfgInstReg_Chk01_DtlYieldR.$trd_unit_dec_place,
							MfgInstReg_Chk01_DtlYieldR.$trd_unit_yield_qty));
					
					setErrFlg(yieldR, msgL);
					MCMessagePool.addAll(msgL);

				}
				
				// 検査予定サービスのチェック処理呼び出し用リスト
				if (!yieldR.disp_seq_upd_flg()) {
					inspL.add(yieldR);
				}
			}
			
			// 検査予定サービス
			if (!inspL.isEmpty()) {
				MSBFL_InspSchdService.InspSchd_Chk01 inspOpe = MSBFL_InspSchdService.crtInspSchd_Chk01();
				addAll(inspOpe.up0(), inspL, createMap_InspSchd_Chk01_CndR_MfgInstReg_Chk01_DtlYieldR());
				inspOpe.exec();
				copyErrFlg(inspL, inspOpe.down0());
			}
		}

		protected Map_InspSchd_Chk01_CndR_MfgInstReg_Chk01_DtlYieldR<InspSchd_Chk01_CndR,MfgInstReg_Chk01_DtlYieldR> createMap_InspSchd_Chk01_CndR_MfgInstReg_Chk01_DtlYieldR() {
			return new Map_InspSchd_Chk01_CndR_MfgInstReg_Chk01_DtlYieldR<InspSchd_Chk01_CndR, MfgInstReg_Chk01_DtlYieldR>();
		}

		public class Map_InspSchd_Chk01_CndR_MfgInstReg_Chk01_DtlYieldR<D extends InspSchd_Chk01_CndR, S extends MfgInstReg_Chk01_DtlYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Chk01_CndR.$peg_no, MfgInstReg_Chk01_DtlYieldR.$peg_no);
				
				addColumnPathMap(InspSchd_Chk01_CndR.$src_no3, MfgInstReg_Chk01_DtlYieldR.$yield_schd_no);
				addColumnPathMap(InspSchd_Chk01_CndR.$gr_tm, MfgInstReg_Chk01_DtlYieldR.$schd_tm);
				addColumnPathMap(InspSchd_Chk01_CndR.$base_unit_qty, MfgInstReg_Chk01_DtlYieldR.$base_unit_yield_qty);
				addColumnPathMap(InspSchd_Chk01_CndR.$base_unit_cd, MfgInstReg_Chk01_DtlYieldR.$base_unit_cd);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (src.inst_abort_flg()) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else if (src.old_inst_abort_flg()) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					dest.data_crud_typ(src.data_crud_typ());
				}
				
				dest.insp_typ(MSC_INSP_TYP.PRDCT.value());
				
				MfgInstReg_Chk01_HdrR hdrR = _hdrCache.getCache(src.hdr_peg_no());
				dest.src_no1(hdrR.mfg_inst_no());
				dest.src_no2(hdrR.itm_mfg_inst_no());
				
				if (MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ())) {
					return;
				}
				
				dest.itm_cd(hdrR.itm_cd());
				dest.itm_sub1(hdrR.itm_sub1());
				dest.itm_sub2(hdrR.itm_sub2());
				dest.itm_sub3(hdrR.itm_sub3());
				dest.sno1(hdrR.sno1());
				dest.sno2(hdrR.sno2());
				dest.sno3(hdrR.sno3());
				dest.sno4(hdrR.sno4());
				dest.loc_cd(src.strg_loc_cd());
				dest.mfg_loc_cd(hdrR.mfg_loc_cd());
				dest.str_ln_cd(hdrR.strg_str_ln_cd());
				dest.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				dest.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				dest.stk_bp_cd(MAC_STR.NULL_VAL.value());
				dest.gd_cd(getDefaultFeedStkGd().gd_cd());
				dest.lot_no(hdrR.lot_no());
				dest.sublot_no(hdrR.sublot_no());
				if (src.pack_flg()) {
					dest.pack_unit_qty(src.trd_unit_yield_qty());
					dest.pack_unit_cd(src.trd_unit_cd());
				}
				else {
					dest.pack_unit_qty(src.base_unit_yield_qty());
					dest.pack_unit_cd(src.base_unit_cd());
				}
			}
		}

		protected void chkAndCompByProdAfterListLogic() {
			for (MfgInstReg_Chk01_DtlByProdR byProdR : up5()) {
				MfgInstReg_Chk01_HdrR hdrR = _hdrCache.getCache(byProdR.hdr_peg_no());
				if (hdrR.err_flg()) {
					continue;
				}
				if (!MAC_DATA_CRUD_TYP.isDEL(byProdR.data_crud_typ()) && !byProdR.inst_abort_flg() && !byProdR.not_frst_inst_can_flg()) {
					// 削除行、打切行以外に対する補完、チェック処理
					
					if (MAC_LOT_MNG_TYP.isNOT_MNG(byProdR.lot_mng_typ())) {
						byProdR.lot_no(MAC_STR.NULL_VAL.value());
					}
					else {
						byProdR.lot_no(nullValToNull(byProdR.lot_no()));
					}
					if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(byProdR.sublot_mng_typ())) {
						byProdR.sublot_no(MAC_STR.NULL_VAL.value());
					}
					else {
						byProdR.sublot_no(nullValToNull(byProdR.sublot_no()));
					}
					
					byProdR.base_unit_yield_qty(convToBaseUnit(byProdR.trd_unit_yield_qty(),
							byProdR.conv_base_qty(), byProdR.conv_qty(),
							byProdR.base_unit_dec_place(), byProdR.base_unit_conv_rnd_typ()));
					
					MfgInstReg_Chk01_DtlOperR operR = _operCache.getCache(byProdR.oper_peg_no());
					if (MSC_MFG_STS_TYP.isYET(operR.mfg_sts_typ())
							|| MSC_MFG_STS_TYP.isSAV(operR.mfg_sts_typ())
							|| MSC_MFG_STS_TYP.isORD(operR.mfg_sts_typ())) {
						byProdR.mfg_sts_typ(operR.mfg_sts_typ());
					}
					else {
						byProdR.mfg_sts_typ(nvl(byProdR.old_mfg_sts_typ(), MSC_MFG_STS_TYP.ORD.value()));
					}
					
					byProdR.mfg_loc_cd(hdrR.mfg_loc_cd());
					
					MCMessageList msgL = new MCMessageList();
					
					// 手配ＮＯ１～４
					// ※checkerで補完した場合も含め、NULL文字を一旦クリアしてから必須チェックする
					if (MAC_SNO_MNG_TYP.isMNG_REQ(byProdR.sno1_mng_typ())) {
						byProdR.sno1(nullValToNull(byProdR.sno1()));
						msgL.addAll(check(byProdR, MfgInstReg_Chk01_DtlByProdR.$sno1, new FXUCL_RequiredValidater()));
					}
					if (MAC_SNO_MNG_TYP.isMNG_REQ(byProdR.sno2_mng_typ())) {
						byProdR.sno2(nullValToNull(byProdR.sno2()));
						msgL.addAll(check(byProdR, MfgInstReg_Chk01_DtlByProdR.$sno2, new FXUCL_RequiredValidater()));
					}
					if (MAC_SNO_MNG_TYP.isMNG_REQ(byProdR.sno3_mng_typ())) {
						byProdR.sno3(nullValToNull(byProdR.sno3()));
						msgL.addAll(check(byProdR, MfgInstReg_Chk01_DtlByProdR.$sno3, new FXUCL_RequiredValidater()));
					}
					if (MAC_SNO_MNG_TYP.isMNG_REQ(byProdR.sno4_mng_typ())) {
						byProdR.sno4(nullValToNull(byProdR.sno4()));
						msgL.addAll(check(byProdR, MfgInstReg_Chk01_DtlByProdR.$sno4, new FXUCL_RequiredValidater()));
					}
					
					// 有効桁数チェック
					msgL.addAll(checkDecPlace(byProdR,
							MfgInstReg_Chk01_DtlByProdR.$trd_unit_dec_place,
							MfgInstReg_Chk01_DtlByProdR.$trd_unit_yield_qty));
					
					setErrFlg(byProdR, msgL);
					MCMessagePool.addAll(msgL);
				}
			}
		}

		protected void chkAndCompReExtAfterListLogic() {
			if (up6().isEmpty()) {
				return;
			}
			for (MfgInstReg_Chk01_DtlReExtR reExtR : up6()) {
				MfgInstReg_Chk01_HdrR hdrR = _hdrCache.getCache(reExtR.hdr_peg_no());
				if (hdrR.err_flg()) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isDEL(reExtR.data_crud_typ())) {
					// 削除行の場合、リストロジックで値を補完しないため、これ以降の処理は実行しない
					continue;
				}
				reExtR.mfg_inst_rev(hdrR.mfg_inst_rev());
			}

			// 再展開履歴サービス
			MSBCL_ReExtHstService.ReExtHst_Chk01 o = MSBCL_ReExtHstService.crtReExtHst_Chk01();
			addAll(o.up0(), up6(), createMap_ReExtHst_Chk01_DtlR_MfgInstReg_Chk01_DtlReExtR());
			o.exec();
			copyErrFlg(up6(), o.down0());
		}
		
		protected Map_ReExtHst_Chk01_DtlR_MfgInstReg_Chk01_DtlReExtR<ReExtHst_Chk01_DtlR,MfgInstReg_Chk01_DtlReExtR> createMap_ReExtHst_Chk01_DtlR_MfgInstReg_Chk01_DtlReExtR() {
			return new Map_ReExtHst_Chk01_DtlR_MfgInstReg_Chk01_DtlReExtR<ReExtHst_Chk01_DtlR, MfgInstReg_Chk01_DtlReExtR>();
		}

		public class Map_ReExtHst_Chk01_DtlR_MfgInstReg_Chk01_DtlReExtR<D extends ReExtHst_Chk01_DtlR, S extends MfgInstReg_Chk01_DtlReExtR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExtHst_Chk01_DtlR.$peg_no, MfgInstReg_Chk01_DtlReExtR.$peg_no);
				addColumnPathMap(ReExtHst_Chk01_DtlR.$mfg_inst_no, MfgInstReg_Chk01_DtlReExtR.$mfg_inst_no);
				addColumnPathMap(ReExtHst_Chk01_DtlR.$ref_ord, MfgInstReg_Chk01_DtlReExtR.$ref_ord);
			}
		}

		protected void setAndChkLotNo() {
			// 製造品のロット発番
			MCList<MfgInstReg_Chk01_HdrR> hdrLotL = MCList.create(MfgInstReg_Chk01_HdrR.class);
			MCList<MfgInstReg_Chk01_HdrR> hdrSublotL = MCList.create(MfgInstReg_Chk01_HdrR.class);
			for (MfgInstReg_Chk01_HdrR hdrR : up0().subList(MfgInstReg_Chk01_HdrR.$err_flg, false)) {
				// 製造品のロットＮＯは品目製造指図の項目のため、品目製造指図データ更新区分で判断する（削除時または初回以外製造指図の場合は発番しない）
				if (isNull(hdrR.itm_mfg_inst_data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(hdrR.itm_mfg_inst_data_crud_typ())
						|| hdrR.inst_abort_flg() || hdrR.not_frst_inst_can_flg()) {
					continue;
				}
				if (isLotAutoIssue(hdrR, hdrR.lot_no(), hdrR.lot_no_typ())) {
					hdrLotL.add(hdrR);
				}
				if (isLotAutoIssue(hdrR, hdrR.sublot_no(), hdrR.sublot_no_typ())) {
					hdrSublotL.add(hdrR);
				}
			}
			if (!hdrLotL.isEmpty()) {
				setHdrLotNo(hdrLotL);
			}
			if (!hdrSublotL.isEmpty()) {
				setHdrSublotNo(hdrSublotL);
			}
			chkHdrLotSublotNo();
			
			MCIndexKey itmOrdMfgInstNoKey = hdrLotL.createIndex(MfgInstReg_Chk01_HdrR.$itm_ord_no, 
					MfgInstReg_Chk01_HdrR.$itm_mfg_inst_no);		
			for (MfgInstReg_Chk01_DtlOperR operR : up1().subList(MfgInstReg_Chk01_DtlByProdR.$err_flg, false)) {
				if (operR.yield_oper_flg()) {
					// 上り電文の工程のうち、出来高計上工程に該当するヘッダを取得する
					MfgInstReg_Chk01_HdrR targetHdrR = _hdrCache.getCache(operR.hdr_peg_no());
					// 出来高計上工程のヘッダと同一の品目オーダNO、品目製造指図NOを持つ、ロットNOを採番したヘッダ情報を取得する
					MfgInstReg_Chk01_HdrR hdrR = hdrLotL.getFirst(itmOrdMfgInstNoKey, 
							targetHdrR.itm_ord_no(), targetHdrR.itm_mfg_inst_no());
					if (!isNull(hdrR)) {
						// ロットNOを発番した品目オーダNO、品目製造指図NOと同じ品目オーダNO、品目製造指図NOを持つ、
						// 別の製造指図NOのデータに対し、発番したロットNOとサブロットNOを設定する
						targetHdrR.lot_no(hdrR.lot_no());
						targetHdrR.sublot_no(hdrR.sublot_no());
					}
				}
			}
			// 副産品のロット発番
			MCList<MfgInstReg_Chk01_DtlByProdR> byProdLotL = MCList.create(MfgInstReg_Chk01_DtlByProdR.class);
			MCList<MfgInstReg_Chk01_DtlByProdR> byProdSublotL = MCList.create(MfgInstReg_Chk01_DtlByProdR.class);
			for (MfgInstReg_Chk01_DtlByProdR byProdR : up5().subList(MfgInstReg_Chk01_DtlByProdR.$err_flg, false)) {
				MfgInstReg_Chk01_HdrR hdrR = _hdrCache.getCache(byProdR.hdr_peg_no());
				if (hdrR.err_flg()) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isDEL(byProdR.data_crud_typ()) || byProdR.inst_abort_flg() || byProdR.not_frst_inst_can_flg()) {
					continue;
				}
				
				if (isLotAutoIssue(hdrR, byProdR.lot_no(), byProdR.lot_no_typ())) {
					byProdLotL.add(byProdR);
				}
				if (isLotAutoIssue(hdrR, byProdR.sublot_no(), byProdR.sublot_no_typ())) {
					byProdSublotL.add(byProdR);
				}
			}
			if (!byProdLotL.isEmpty()) {
				setByProdLotNo(byProdLotL);
			}
			if (!byProdSublotL.isEmpty()) {
				setByProdSublotNo(byProdSublotL);
			}
			chkByProdLotSublotNo();
		}
		
		/**
		 * 製造品のロットＮＯ設定
		 * @param hdrLotL
		 */
		protected void setHdrLotNo(MCList<MfgInstReg_Chk01_HdrR> hdrLotL) {
			// 子品目のコンテナを設定
			MCList<MfgInstReg_Chk01_DtlInptR> inptL = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
			for (MfgInstReg_Chk01_HdrR hdrLotR : hdrLotL) {
				// ヘッダに品目オーダＮＯが設定されていない（計画外製造指図）場合または品目製造指図が登録済の場合は紐付けＮＯ、それ以外の場合は品目オーダＮＯに紐付く投入予定を取得
				if (!isNull(hdrLotR.itm_ord_no()) && MAC_DATA_CRUD_TYP.isCRT(hdrLotR.itm_mfg_inst_data_crud_typ())) {
					inptL.addAll(_inptCacheForItmOrdNo.getCache(hdrLotR.itm_ord_no()));
				}
				else {
					inptL.addAll(_inptCacheForHdr.getCache(hdrLotR.peg_no()));
				}
			}
			MSBCL_MfgInstActComService.MfgInstActCom_Sprt01 o = MSBCL_MfgInstActComService.crtMfgInstActCom_Sprt01();
			addAll(o.up0(), hdrLotL, createMap_MfgInstActCom_Sprt01_HdrR_MfgInstReg_Chk01_HdrR());
			addAll(o.up1(), inptL, createMap_MfgInstActCom_Sprt01_DtlR_MfgInstReg_Chk01_DtlInptR());
			for (MfgInstActCom_Sprt01_HdrR oUpR : o.up0()) {
				oUpR.lot_issue_flg(true);
			}
			o.exec();
			
			MCIndexKey idxkey = o.down0().createIndex(MfgInstActCom_Sprt01_HdrR.$peg_no);
			for (MfgInstReg_Chk01_HdrR hdrLotR : hdrLotL) {
				MfgInstActCom_Sprt01_HdrR downR = o.down0().getFirst(idxkey, hdrLotR.peg_no());
				if (downR.err_flg()) {
					MCMessagePool.add(new MCMessage(hdrLotR, null, MSBCL1120,
							toDispItm(hdrLotR.itm_cd(), hdrLotR.itm_sub1(),
									hdrLotR.itm_sub2(), hdrLotR.itm_sub3()), toDispGUIIndex(hdrLotR)));
					hdrLotR.mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
				}
				else {
					hdrLotR.lot_no(downR.lot_no());
				}
			}
		}
		
		/**
		 * 製造品のサブロットＮＯ設定
		 * @param hdrSublotL
		 */
		protected void setHdrSublotNo(MCList<MfgInstReg_Chk01_HdrR> hdrSublotL) {
			// 子品目のコンテナを設定
			MCList<MfgInstReg_Chk01_DtlInptR> inptL = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
			for (MfgInstReg_Chk01_HdrR hdrSublotR : hdrSublotL) {
				// ヘッダに品目オーダＮＯが設定されていない（計画外製造指図）場合または品目製造指図が登録済の場合は紐付けＮＯ、それ以外の場合は品目オーダＮＯに紐付く投入予定を取得
				if (!isNull(hdrSublotR.itm_ord_no()) && MAC_DATA_CRUD_TYP.isCRT(hdrSublotR.itm_mfg_inst_data_crud_typ())) {
					inptL.addAll(_inptCacheForItmOrdNo.getCache(hdrSublotR.itm_ord_no()));
				}
				else {
					inptL.addAll(_inptCacheForHdr.getCache(hdrSublotR.peg_no()));
				}
			}
			MSBCL_MfgInstActComService.MfgInstActCom_Sprt01 o = MSBCL_MfgInstActComService.crtMfgInstActCom_Sprt01();
			addAll(o.up0(), hdrSublotL, createMap_MfgInstActCom_Sprt01_HdrR_MfgInstReg_Chk01_HdrR());
			addAll(o.up1(), inptL, createMap_MfgInstActCom_Sprt01_DtlR_MfgInstReg_Chk01_DtlInptR());
			for (MfgInstActCom_Sprt01_HdrR oUpR : o.up0()) {
				oUpR.sublot_issue_flg(true);
			}
			o.exec();
			
			MCIndexKey idxkey = o.down0().createIndex(MfgInstActCom_Sprt01_HdrR.$peg_no);
			for (MfgInstReg_Chk01_HdrR hdrSublotR : hdrSublotL) {
				MfgInstActCom_Sprt01_HdrR downR = o.down0().getFirst(idxkey, hdrSublotR.peg_no());
				if (downR.err_flg()) {
					MCMessagePool.add(new MCMessage(hdrSublotR, null, MSBCL1121,
							toDispItm(hdrSublotR.itm_cd(), hdrSublotR.itm_sub1(),
									hdrSublotR.itm_sub2(), hdrSublotR.itm_sub3()), toDispGUIIndex(hdrSublotR)));
					hdrSublotR.mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
				}
				else {
					hdrSublotR.sublot_no(downR.sublot_no());
				}
			}
		}
		
		protected Map_MfgInstActCom_Sprt01_HdrR_MfgInstReg_Chk01_HdrR<MfgInstActCom_Sprt01_HdrR,MfgInstReg_Chk01_HdrR> createMap_MfgInstActCom_Sprt01_HdrR_MfgInstReg_Chk01_HdrR() {
			return new Map_MfgInstActCom_Sprt01_HdrR_MfgInstReg_Chk01_HdrR<MfgInstActCom_Sprt01_HdrR, MfgInstReg_Chk01_HdrR>();
		}

		public class Map_MfgInstActCom_Sprt01_HdrR_MfgInstReg_Chk01_HdrR<D extends MfgInstActCom_Sprt01_HdrR, S extends MfgInstReg_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$peg_no, MfgInstReg_Chk01_HdrR.$peg_no);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$hdr_peg_no, MfgInstReg_Chk01_HdrR.$peg_no);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_cd, MfgInstReg_Chk01_HdrR.$itm_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_sub1, MfgInstReg_Chk01_HdrR.$itm_sub1);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_sub2, MfgInstReg_Chk01_HdrR.$itm_sub2);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_sub3, MfgInstReg_Chk01_HdrR.$itm_sub3);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sno1, MfgInstReg_Chk01_HdrR.$sno1);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sno2, MfgInstReg_Chk01_HdrR.$sno2);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sno3, MfgInstReg_Chk01_HdrR.$sno3);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sno4, MfgInstReg_Chk01_HdrR.$sno4);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$lot_mng_typ, MfgInstReg_Chk01_HdrR.$lot_mng_typ);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sublot_mng_typ, MfgInstReg_Chk01_HdrR.$sublot_mng_typ);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$lot_no_ptn_cd, MfgInstReg_Chk01_HdrR.$lot_no_ptn_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sublot_no_ptn_cd, MfgInstReg_Chk01_HdrR.$sublot_no_ptn_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sppl_cd, MfgInstReg_Chk01_HdrR.$sppl_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$mfg_loc_cd, MfgInstReg_Chk01_HdrR.$mfg_loc_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$mfg_loc_wg_cd, MfgInstReg_Chk01_HdrR.$mfg_loc_wg_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$mfg_loc_site_cd, MfgInstReg_Chk01_HdrR.$mfg_loc_site_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$lot_no, MfgInstReg_Chk01_HdrR.$lot_no);
				
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				MCList<MfgInstReg_Chk01_DtlYieldR> yieldL = MCList.create(MfgInstReg_Chk01_DtlYieldR.class);
				if (!isNull(src.itm_ord_no()) && MAC_DATA_CRUD_TYP.isCRT(src.itm_mfg_inst_data_crud_typ())) {
					yieldL = _yieldCacheForItmOrdNo.getCache(src.itm_ord_no());
				}
				else {
					yieldL = _yieldCacheForHdr.getCache(src.peg_no());
					if (isNull(yieldL)) {
						// 該当する出来高予定がキャッシュに存在しなかった場合、品目製造指図NOを元に出来高予定を検索する
						MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
						MST_YIELD_SCHD_R ysR = MST_YIELD_SCHD_R.create();
						MCQueryApiBuilder ysR_bldr = MCQueryApiBuilder.create(ysR);
						ysR_bldr.setSelect(ysR.schd_tm);
						ysR_bldr.setWhere(ysR.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
						dbSelect("MSBCL6000_MST_YIELD_SCHD_R_S01", ysL, ysR_bldr, src);

						for (MST_YIELD_SCHD_R r: ysL) {
							MfgInstReg_Chk01_DtlYieldR yieldR = MfgInstReg_Chk01_DtlYieldR.create();
							yieldR.schd_tm(r.schd_tm());
							yieldL.add(yieldR);
						}
					}
				}
				dest.yield_dt((MCDate)yieldL.subList(yieldR -> !yieldR.isStatusDelete()).min(MfgInstReg_Chk01_DtlYieldR.$schd_tm));
				dest.yield_dt_label_nm(MAC_NUM_PROC.MFG_YIELD_SCHD_DT.name(getUsrLocale()));
				if (src.lst_reg_flg()) {
					dest.no_exception_flg(true);
					dest.no_err_msg_flg(true);
				}
			}
		}
		
		protected Map_MfgInstActCom_Sprt01_DtlR_MfgInstReg_Chk01_DtlInptR<MfgInstActCom_Sprt01_DtlR,MfgInstReg_Chk01_DtlInptR> createMap_MfgInstActCom_Sprt01_DtlR_MfgInstReg_Chk01_DtlInptR() {
			return new Map_MfgInstActCom_Sprt01_DtlR_MfgInstReg_Chk01_DtlInptR<MfgInstActCom_Sprt01_DtlR, MfgInstReg_Chk01_DtlInptR>();
		}

		public class Map_MfgInstActCom_Sprt01_DtlR_MfgInstReg_Chk01_DtlInptR<D extends MfgInstActCom_Sprt01_DtlR, S extends MfgInstReg_Chk01_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Sprt01_DtlR.$hdr_peg_no, MfgInstReg_Chk01_DtlInptR.$hdr_peg_no);
				addColumnPathMap(MfgInstActCom_Sprt01_DtlR.$lot_no, MfgInstReg_Chk01_DtlInptR.$lot_no);
				addColumnPathMap(MfgInstActCom_Sprt01_DtlR.$sublot_no, MfgInstReg_Chk01_DtlInptR.$sublot_no);
				addColumnPathMap(MfgInstActCom_Sprt01_DtlR.$main_itm_flg, MfgInstReg_Chk01_DtlInptR.$main_itm_flg);
				addColumnPathMap(MfgInstActCom_Sprt01_DtlR.$vld_dt, MfgInstReg_Chk01_DtlInptR.$vld_dt);
				addColumnPathMap(MfgInstActCom_Sprt01_DtlR.$first_gr_dt, MfgInstReg_Chk01_DtlInptR.$first_gr_dt);
				addColumnPathMap(MfgInstActCom_Sprt01_DtlR.$lot_seq, MfgInstReg_Chk01_DtlInptR.$lot_seq);

			}
		}
		
		protected Map_Lot_Chk02_CndR_MfgInstReg_Chk01_HdrR<Lot_Chk02_CndR,MfgInstReg_Chk01_HdrR> createMap_Lot_Chk02_CndR_MfgInstReg_Chk01_HdrR() {
			return new Map_Lot_Chk02_CndR_MfgInstReg_Chk01_HdrR<Lot_Chk02_CndR, MfgInstReg_Chk01_HdrR>();
		}

		public class Map_Lot_Chk02_CndR_MfgInstReg_Chk01_HdrR<D extends Lot_Chk02_CndR, S extends MfgInstReg_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk02_CndR.$peg_no, MfgInstReg_Chk01_HdrR.$peg_no);
				addColumnPathMap(Lot_Chk02_CndR.$itm_cd, MfgInstReg_Chk01_HdrR.$itm_cd);
				addColumnPathMap(Lot_Chk02_CndR.$itm_sub1, MfgInstReg_Chk01_HdrR.$itm_sub1);
				addColumnPathMap(Lot_Chk02_CndR.$itm_sub2, MfgInstReg_Chk01_HdrR.$itm_sub2);
				addColumnPathMap(Lot_Chk02_CndR.$itm_sub3, MfgInstReg_Chk01_HdrR.$itm_sub3);
				addColumnPathMap(Lot_Chk02_CndR.$lot_no, MfgInstReg_Chk01_HdrR.$lot_no);
				addColumnPathMap(Lot_Chk02_CndR.$sublot_no, MfgInstReg_Chk01_HdrR.$sublot_no);

			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.lot_not_change_flg(setLotNotChangeFlg(src.lot_no(), src.old_lot_no()));
			}
		}
		
		/**
		 * 副産品のロットＮＯ設定
		 * @param byProdLotL
		 */
		protected void setByProdLotNo(MCList<MfgInstReg_Chk01_DtlByProdR> byProdLotL) {
			// 子品目のコンテナを設定
			MCList<MfgInstReg_Chk01_DtlInptR> inptL = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
			for (MfgInstReg_Chk01_DtlByProdR byProdLotR : byProdLotL) {
				inptL.addAll(_inptCacheForHdr.getCache(byProdLotR.hdr_peg_no()));
			}
			MSBCL_MfgInstActComService.MfgInstActCom_Sprt01 o = MSBCL_MfgInstActComService.crtMfgInstActCom_Sprt01();
			addAll(o.up0(), byProdLotL, createMap_MfgInstActCom_Sprt01_HdrR_MfgInstReg_Chk01_DtlByProdR());
			addAll(o.up1(), inptL, createMap_MfgInstActCom_Sprt01_DtlR_MfgInstReg_Chk01_DtlInptR());
			for (MfgInstActCom_Sprt01_HdrR oUpR : o.up0()) {
				oUpR.lot_issue_flg(true);
			}
			o.exec();
			
			MCIndexKey idxkey = o.down0().createIndex(MfgInstActCom_Sprt01_HdrR.$peg_no);
			for (MfgInstReg_Chk01_DtlByProdR byProdLotR : byProdLotL) {
				MfgInstActCom_Sprt01_HdrR downR = o.down0().getFirst(idxkey, byProdLotR.peg_no());
				if (downR.err_flg()) {
					MfgInstReg_Chk01_HdrR hdrR = _hdrCache.getCache(byProdLotR.hdr_peg_no());
					MCMessagePool.add(new MCMessage(byProdLotR, null, MSBCL1120,
							toDispItm(byProdLotR.itm_cd(), byProdLotR.itm_sub1(),
									byProdLotR.itm_sub2(), byProdLotR.itm_sub3()), toDispGUIIndex(byProdLotR)));
					hdrR.mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
				}
				else {
					byProdLotR.lot_no(downR.lot_no());
				}
			}
		}
		
		/**
		 * 副産品のサブロットＮＯ設定
		 * @param byProdLotL
		 */
		protected void setByProdSublotNo(MCList<MfgInstReg_Chk01_DtlByProdR> byProdSublotL) {
			// 子品目のコンテナを設定
			MCList<MfgInstReg_Chk01_DtlInptR> inptL = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
			for (MfgInstReg_Chk01_DtlByProdR byProdSublotR : byProdSublotL) {
				inptL.addAll(_inptCacheForHdr.getCache(byProdSublotR.hdr_peg_no()));
			}
			MSBCL_MfgInstActComService.MfgInstActCom_Sprt01 o = MSBCL_MfgInstActComService.crtMfgInstActCom_Sprt01();
			addAll(o.up0(), byProdSublotL, createMap_MfgInstActCom_Sprt01_HdrR_MfgInstReg_Chk01_DtlByProdR());
			addAll(o.up1(), inptL, createMap_MfgInstActCom_Sprt01_DtlR_MfgInstReg_Chk01_DtlInptR());
			for (MfgInstActCom_Sprt01_HdrR oUpR : o.up0()) {
				oUpR.sublot_issue_flg(true);
			}
			o.exec();

			MCIndexKey idxkey = o.down0().createIndex(MfgInstActCom_Sprt01_HdrR.$peg_no);
			for (MfgInstReg_Chk01_DtlByProdR byProdSublotR : byProdSublotL) {
				MfgInstActCom_Sprt01_HdrR downR = o.down0().getFirst(idxkey, byProdSublotR.peg_no());
				if (downR.err_flg()) {
					MfgInstReg_Chk01_HdrR hdrR = _hdrCache.getCache(byProdSublotR.hdr_peg_no());
					MCMessagePool.add(new MCMessage(byProdSublotR, null, MSBCL1121,
							toDispItm(byProdSublotR.itm_cd(), byProdSublotR.itm_sub1(),
									byProdSublotR.itm_sub2(), byProdSublotR.itm_sub3()),
							toDispGUIIndex(byProdSublotR)));
					hdrR.mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
				}
				else {
					byProdSublotR.sublot_no(downR.sublot_no());
				}
			}
		}
		
		protected Map_MfgInstActCom_Sprt01_HdrR_MfgInstReg_Chk01_DtlByProdR<MfgInstActCom_Sprt01_HdrR,MfgInstReg_Chk01_DtlByProdR> createMap_MfgInstActCom_Sprt01_HdrR_MfgInstReg_Chk01_DtlByProdR() {
			return new Map_MfgInstActCom_Sprt01_HdrR_MfgInstReg_Chk01_DtlByProdR<MfgInstActCom_Sprt01_HdrR, MfgInstReg_Chk01_DtlByProdR>();
		}

		public class Map_MfgInstActCom_Sprt01_HdrR_MfgInstReg_Chk01_DtlByProdR<D extends MfgInstActCom_Sprt01_HdrR, S extends MfgInstReg_Chk01_DtlByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$peg_no, MfgInstReg_Chk01_DtlByProdR.$peg_no);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$hdr_peg_no, MfgInstReg_Chk01_DtlByProdR.$hdr_peg_no);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_cd, MfgInstReg_Chk01_DtlByProdR.$itm_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_sub1, MfgInstReg_Chk01_DtlByProdR.$itm_sub1);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_sub2, MfgInstReg_Chk01_DtlByProdR.$itm_sub2);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_sub3, MfgInstReg_Chk01_DtlByProdR.$itm_sub3);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sno1, MfgInstReg_Chk01_DtlByProdR.$sno1);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sno2, MfgInstReg_Chk01_DtlByProdR.$sno2);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sno3, MfgInstReg_Chk01_DtlByProdR.$sno3);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sno4, MfgInstReg_Chk01_DtlByProdR.$sno4);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$lot_mng_typ, MfgInstReg_Chk01_DtlByProdR.$lot_mng_typ);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sublot_mng_typ, MfgInstReg_Chk01_DtlByProdR.$sublot_mng_typ);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$lot_no_ptn_cd, MfgInstReg_Chk01_DtlByProdR.$lot_no_ptn_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sublot_no_ptn_cd, MfgInstReg_Chk01_DtlByProdR.$sublot_no_ptn_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$yield_dt, MfgInstReg_Chk01_DtlByProdR.$schd_tm);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$mfg_loc_cd, MfgInstReg_Chk01_DtlByProdR.$mfg_loc_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$lot_no, MfgInstReg_Chk01_DtlByProdR.$lot_no);
				
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				MfgInstReg_Chk01_HdrR hdrR = _hdrCache.getCache(src.hdr_peg_no());
				dest.sppl_cd(hdrR.sppl_cd());
				dest.mfg_loc_wg_cd(hdrR.mfg_loc_wg_cd());
				dest.mfg_loc_site_cd(hdrR.mfg_loc_site_cd());
				dest.yield_dt_label_nm(MAC_NUM_PROC.MFG_YIELD_SCHD_DT.name(getUsrLocale()));
				
				if (hdrR.lst_reg_flg()) {
					dest.no_exception_flg(true);
					dest.no_err_msg_flg(true);
				}
			}
		}
		
		/**
		 * 製造品のロットＮＯチェック
		 */
		protected void chkHdrLotSublotNo() {
			MCList<MfgInstReg_Chk01_HdrR> dupChk = MCList.create(MfgInstReg_Chk01_HdrR.class);
			for (MfgInstReg_Chk01_HdrR hdrR : up0()) {
				if (hdrR.err_flg()) {
					continue;
				}
				if (isNull(hdrR.itm_mfg_inst_data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(hdrR.itm_mfg_inst_data_crud_typ())
						|| hdrR.not_frst_inst_can_flg()) {
					continue;
				}
				if (hdrR.inst_abort_flg()) {
					continue;
				}
				if (MSC_MFG_STS_TYP.isORD(hdrR.mfg_sts_typ()) && MAC_LOT_ISSUE_TYP.isON_INST(hdrR.lot_issue_typ())) {
					if (isNull(hdrR.lot_no())) {
						MCMessagePool.add(new MCMessage(hdrR, MfgInstReg_Chk01_HdrR.$lot_no, MSBCL1037, toDispGUIIndex(hdrR)));
						hdrR.err_flg(true);
					}
					if (isNull(hdrR.sublot_no())) {
						MCMessagePool.add(new MCMessage(hdrR, MfgInstReg_Chk01_HdrR.$sublot_no,MSBCL1037, toDispGUIIndex(hdrR)));
						hdrR.err_flg(true);
					}
				}
				
				if (isDupChk(hdrR.lot_no(), hdrR.sublot_no(), hdrR.old_lot_no(), hdrR.old_sublot_no())) {
					dupChk.add(hdrR);
				}
			}
			
			if (!dupChk.isEmpty()) {
				MSBFL_LotService.Lot_Chk02 o = MSBFL_LotService.crtLot_Chk02();
				addAll(o.up0(), dupChk, createMap_Lot_Chk02_CndR_MfgInstReg_Chk01_HdrR());
				o.exec();
				copyErrFlg(dupChk, o.down0());
			}
		}
		
		protected boolean isDupChk(String lotNo, String sublotNo, String oldLotNo,
				String oldSublotNo) {
			if (isNullOr(lotNo, sublotNo)) {
				return false;
			}
			if (isSame(lotNo, oldLotNo) && isSame(sublotNo, oldSublotNo)) {
				return false;
			}
			return true;
		}

		protected boolean isDupChk(String itmCd, String itmSub1, String itmSub2,
				String itmSub3, String lotNo, String sublotNo, String oldItmCd,
				String oldItmSub1, String oldItmSub2, String oldItmSub3, String oldLotNo,
				String oldSublotNo) {
			if (isNullOr(lotNo, sublotNo)) {
				return false;
			}
			if (!isNullOr(itmCd, itmSub1, itmSub2, itmSub3, oldItmCd, oldItmSub1,
					oldItmSub2, oldItmSub3)) {
				// 品目が指定されている場合（副産品の場合）、品目とロットすべてが一致している場合にロット重複チェック不要とする。
				if (isSame(itmCd, oldItmCd) && isSame(itmSub1, oldItmSub1)
						&& isSame(itmSub2, oldItmSub2) && isSame(itmSub3, oldItmSub3)
						&& isSame(lotNo, oldLotNo) && isSame(sublotNo, oldSublotNo)) {
					return false;
				}
			}
			if (isSame(lotNo, oldLotNo) && isSame(sublotNo, oldSublotNo)) {
				return false;
			}
			return true;
		}

		/**
		 * 副産品のロットＮＯチェック
		 */
		protected void chkByProdLotSublotNo() {
			MCList<MfgInstReg_Chk01_DtlByProdR> dupChk = MCList.create(MfgInstReg_Chk01_DtlByProdR.class);
			MCList<MfgInstReg_Chk01_DtlByProdR> lotErrL = MCList.create(MfgInstReg_Chk01_DtlByProdR.class);
			
			for (MfgInstReg_Chk01_DtlByProdR byProdR : up5()) {
				MfgInstReg_Chk01_HdrR hdrR = _hdrCache.getCache(byProdR.hdr_peg_no());
				if (hdrR.err_flg()) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isDEL(byProdR.data_crud_typ()) || byProdR.not_frst_inst_can_flg()) {
					continue;
				}
				if (byProdR.inst_abort_flg()) {
					continue;
				}
				if (MSC_MFG_STS_TYP.isORD(hdrR.mfg_sts_typ()) && MAC_LOT_ISSUE_TYP.isON_INST(hdrR.lot_issue_typ())) {
					if (isNull(byProdR.lot_no())) {
						MCMessagePool.add(new MCMessage(byProdR, MfgInstReg_Chk01_DtlByProdR.$lot_no, MSBCL1037, toDispGUIIndex(byProdR)));
						byProdR.err_flg(true);
						lotErrL.add(byProdR);
					}
					if (isNull(byProdR.sublot_no())) {
						MCMessagePool.add(new MCMessage(byProdR, MfgInstReg_Chk01_DtlByProdR.$sublot_no, MSBCL1037, toDispGUIIndex(byProdR)));
						byProdR.err_flg(true);
						lotErrL.add(byProdR);
					}
				}
				
				if (isDupChk(byProdR.itm_cd(), byProdR.itm_sub1(), byProdR.itm_sub2(),
						byProdR.itm_sub3(), byProdR.lot_no(), byProdR.sublot_no(),
						byProdR.old_itm_cd(), byProdR.old_itm_sub1(),
						byProdR.old_itm_sub2(), byProdR.itm_sub3(), byProdR.old_lot_no(),
						byProdR.old_sublot_no())) {
					dupChk.add(byProdR);
				}
			}
			
			if (!lotErrL.isEmpty()) {
				copyErrFlg(up0(), lotErrL, MfgInstReg_Upd01_HdrR.$peg_no, MfgInstReg_Upd01_DtlByProdR.$hdr_peg_no);
			}
			
			if (!dupChk.isEmpty()) {
				MSBFL_LotService.Lot_Chk02 o = MSBFL_LotService.crtLot_Chk02();
				addAll(o.up0(), dupChk, createMap_Lot_Chk02_CndR_MfgInstReg_Chk01_DtlByProdR());
				o.exec();
				copyErrFlg(dupChk, o.down0());
				copyErrFlg(up0(), dupChk, MfgInstReg_Upd01_HdrR.$peg_no, MfgInstReg_Upd01_DtlByProdR.$hdr_peg_no);
			}
		}
		
		protected Map_Lot_Chk02_CndR_MfgInstReg_Chk01_DtlByProdR<Lot_Chk02_CndR,MfgInstReg_Chk01_DtlByProdR> createMap_Lot_Chk02_CndR_MfgInstReg_Chk01_DtlByProdR() {
			return new Map_Lot_Chk02_CndR_MfgInstReg_Chk01_DtlByProdR<Lot_Chk02_CndR, MfgInstReg_Chk01_DtlByProdR>();
		}

		public class Map_Lot_Chk02_CndR_MfgInstReg_Chk01_DtlByProdR<D extends Lot_Chk02_CndR, S extends MfgInstReg_Chk01_DtlByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk02_CndR.$peg_no, MfgInstReg_Chk01_DtlByProdR.$peg_no);
				addColumnPathMap(Lot_Chk02_CndR.$itm_cd, MfgInstReg_Chk01_DtlByProdR.$itm_cd);
				addColumnPathMap(Lot_Chk02_CndR.$itm_sub1, MfgInstReg_Chk01_DtlByProdR.$itm_sub1);
				addColumnPathMap(Lot_Chk02_CndR.$itm_sub2, MfgInstReg_Chk01_DtlByProdR.$itm_sub2);
				addColumnPathMap(Lot_Chk02_CndR.$itm_sub3, MfgInstReg_Chk01_DtlByProdR.$itm_sub3);
				addColumnPathMap(Lot_Chk02_CndR.$lot_no, MfgInstReg_Chk01_DtlByProdR.$lot_no);
				addColumnPathMap(Lot_Chk02_CndR.$sublot_no, MfgInstReg_Chk01_DtlByProdR.$sublot_no);

			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.lot_not_change_flg(setLotNotChangeFlg(src.lot_no(), src.old_lot_no()));
			}
		}
		
		protected void setDown() {
			for (MfgInstReg_Chk01_HdrR hdrR : up0()) {
				if (!hdrR.err_flg()) {
					hdrR.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
					if (!MAC_DATA_CRUD_TYP.isDEL(hdrR.mfg_inst_data_crud_typ()) && !hdrR.not_frst_inst_can_flg()
							&& MSC_MFG_STS_TYP.isSAV(hdrR.mfg_sts_typ())) {
						hdrR.inst_immed_prnt_flg(false);
						
						// 各明細の状況区分も指図保存にする
						// ※一覧登録の場合、ロット発番でエラーになった場合に、エラー終了とせず指図保存にする処理があるため、
						// ここで各明細のステータスも指図保存に戻す
						for (MfgInstReg_Chk01_DtlOperR r : _operCacheForHdr.getCache(hdrR.peg_no())) {
							if (MSC_MFG_STS_TYP.isORD(r.mfg_sts_typ())) {
								r.mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
							}
						}
						for (MfgInstReg_Chk01_DtlInptR r : _inptCacheForHdr.getCache(hdrR.peg_no())) {
							if (MSC_MFG_STS_TYP.isORD(r.mfg_sts_typ())) {
								r.mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
							}
						}
						for (MfgInstReg_Chk01_DtlWkR r : _wkCacheForHdr.getCache(hdrR.peg_no())) {
							if (MSC_MFG_STS_TYP.isORD(r.mfg_sts_typ())) {
								r.mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
							}
						}
						for (MfgInstReg_Chk01_DtlYieldR r : _yieldCacheForHdr.getCache(hdrR.peg_no())) {
							if (MSC_MFG_STS_TYP.isORD(r.mfg_sts_typ())) {
								r.mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
							}
						}
						for (MfgInstReg_Chk01_DtlByProdR r : _byProdCacheForHdr.getCache(hdrR.peg_no())) {
							if (MSC_MFG_STS_TYP.isORD(r.mfg_sts_typ())) {
								r.mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
							}
						}
					}
				}
			}

			down0().addAll(up0());
			down1().addAll(up1());
			down2().addAll(up2());
			down3().addAll(up3());
			down4().addAll(up4());
			down5().addAll(up5());
			down6().addAll(up6());
		}
	}
	
	protected boolean isErrMsg(MCMessage msg) {
		if (isSame(msg.getID(), MSBCL1120) || isSame(msg.getID(), MSBCL1121)) {
			return false;
		}
		return super.isErrMsg(msg);
	}
	
	/**
	 * 入荷予定を取得する
	 * @return
	 */
	protected MCList<MST_ARR_SCHD_R> getArrSchd(MCList<MST_MFG_INST_R> arrSchdBindL) {
		MCList<MST_ARR_SCHD_R> selectL = MCList.create(MST_ARR_SCHD_R.class);
		MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
		MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t); 
		MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
		selectL_bldr.setSelect(t.mfg_inst_no, t.arr_schd_no, t.arr_ptn_typ, t.base_unit_qty);
		selectL_bldr.addSelect(t2.po_d_no);
		selectL_bldr.addInnerJoin(t2, bracket( t.arr_pr_no.eq(t2.arr_pr_no)));
		selectL_bldr.setWhere(t2.po_d_no.eq(bind("po_d_no")));
		selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());
		if (!arrSchdBindL.isEmpty()) {
			dbSelectForUpdate("MSBCL6000_MST_ARR_SCHD_S02", selectL, selectL_bldr, arrSchdBindL.groupBy(MST_MFG_INST_R.$po_d_no));
		}
		return selectL;
	}
	
	// Chk01,Upd01で共通して使用するキャッシュ関連の処理
	protected static void initCacheForUpd01(MCList<MfgInstReg_Chk01_HdrR> upL) {
		object(CLAZZ)._initCacheForUpd01(upL);
	}

	protected FXUCL_Cache<Ord_Upd01_Dtl1R> _ordCacheForUpd01;

	protected static Ord_Upd01_Dtl1R getCacheForUpd01(String itmOrdNo) {
		if (object(CLAZZ)._ordCacheForUpd01 == null) {
			return Ord_Upd01_Dtl1R.create();
		}
		Ord_Upd01_Dtl1R ret = object(CLAZZ)._ordCacheForUpd01.getCache(itmOrdNo);
		if (ret == null) {
			ret = Ord_Upd01_Dtl1R.create();
		}
		return ret;
	}

	protected void _initCacheForUpd01(MCList<MfgInstReg_Chk01_HdrR> upL) {
		_ordCacheForUpd01 = new FXUCL_Cache<Ord_Upd01_Dtl1R>();
		_ordCacheForUpd01.setFixMaxCacheSize(-1);
		
		MCList<Ord_Upd01_Dtl1R> bindL = MCList.create(Ord_Upd01_Dtl1R.class);
		for (MfgInstReg_Chk01_HdrR r : upL) {
			if (MSC_ITM_ORD_STS_TYP.isOPN(r.itm_ord_sts_typ()) || MSC_ITM_ORD_STS_TYP.isSAV(r.itm_ord_sts_typ())) {
				Ord_Upd01_Dtl1R bindR = Ord_Upd01_Dtl1R.create();
				bindR.peg_no(r.peg_no());
				bindR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				bindR.mrp_typ(MSC_MRP_TYP.MRP.value());
				bindR.itm_ord_no(r.itm_ord_no());
				bindR.a_itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.FIX.value());
				bindL.add(bindR);
			}
		}

		if (!bindL.isEmpty()) {
			MSBCL_OrdRegService.Ord_Chk02 ordChk = MSBCL_OrdRegService.crtOrd_Chk02();
			ordChk.up0().setAll(bindL);
			ordChk.exec();

			MCIndexKey idxkey = ordChk.down0().createIndex(Ord_Upd01_Dtl1R.$peg_no);
			for (Ord_Upd01_Dtl1R bindR : bindL) {
				_ordCacheForUpd01.putCache(new String[] {bindR.itm_ord_no()}, ordChk.down0().getFirst(idxkey, bindR.peg_no()));
			}
		}
	}
	
	/**
	 * ロットが一致した場合にTRUEを返却する
	 */
	protected boolean setLotNotChangeFlg(String lot, String oldlot){
		if(isNull(lot) || isNull(oldlot)) {
			return false;
		}
		if(isSame(lot, oldlot)) {
			return true;
		}
		return false;
	}

	/**
	 * MfgInstReg_Chk02オペレーション.<p>
	 *
	 * 製造指図の取消前チェックの共通処理<br>
	 */
	public class MfgInstReg_Chk02 extends MSBCL_MfgInstRegService_MC_A.MfgInstReg_Chk02 {
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			
			editUp();
			
			srchDtl();
			
			mapUpContainers(MIR);
			chk01.exec();
			mapDownContainers(MIR);
		}
		
		protected void editUp() {
			MCList<MST_MFG_INST_R> miL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder miL_bldr = MCQueryApiBuilder.create(t);
			MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");
			MST_ITM_MFG_INST_R t3 = MST_ITM_MFG_INST_R.create("T3");
			miL_bldr.setSelect(t.mfg_inst_no);
			miL_bldr.addSelect(t.itm_mfg_inst_no);
			miL_bldr.addSelect(t.mfg_inst_unit_typ);
			miL_bldr.addSelect(t2.itm_ord_no);
			miL_bldr.addSelect(t2.mfg_mtd_typ);
			miL_bldr.addSelect(t3.frst_mfg_inst_no);
			miL_bldr.addLeftOuterJoin(t2, bracket( t.itm_mfg_inst_no.eq(t2.itm_mfg_inst_no)));
			miL_bldr.addLeftOuterJoin(t3, bracket( t.mfg_inst_no.eq(t3.frst_mfg_inst_no)));
			// chk01内でロック、更新カウンタチェックなどが行われる。ここではchk01を呼び出すために必要な情報を取得しているだけなので、ロックはしていない
			dbSelectKey("MSBCL6000_MST_MFG_INST_S04", miL, miL_bldr, up0());
			
			if (miL.isEmpty()) {
				return;
			}
			
			MCIndexKey miLIdxKey = miL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			for (MfgInstReg_Chk02_HdrR r : up0()) {
				MST_MFG_INST_R miR = miL.getFirst(miLIdxKey, r.mfg_inst_no());
				if (!isNull(miR)) {
					r.itm_ord_no(miR.getStringNE("itm_ord_no"));
					// 未指図の工程を取り消しするためには、製造指図ＮＯではなく品目製造指図ＮＯが必要なため、ここで取得する
					r.itm_mfg_inst_no(miR.itm_mfg_inst_no());
					r.mfg_inst_unit_typ(miR.mfg_inst_unit_typ());
					r.mfg_mtd_typ(miR.getStringNE("mfg_mtd_typ"));
					r.frst_mfg_inst_no(miR.getStringNE("frst_mfg_inst_no"));
				}
				
				r.setStatus(MCRow.Status.DELETE);
			}
		}
		
		protected void srchDtl() {
			MCList<MfgInstReg_Chk02_HdrR> imiL = MCList.create(MfgInstReg_Chk02_HdrR.class);
			for (MfgInstReg_Chk02_HdrR r : up0()) {
				if (!isNull(r.frst_mfg_inst_no())
						&& MAC_MFG_INST_UNIT_TYP.isOPER(r.mfg_inst_unit_typ())) {
					imiL.add(r);
				}
			}
			MCIndexKey imiKey = imiL.createIndex(MfgInstReg_Chk02_HdrR.$itm_mfg_inst_no);
			MCList<MfgInstReg_Chk02_HdrR> miL = up0();
			MCIndexKey miKey = miL.createIndex(MfgInstReg_Chk02_HdrR.$mfg_inst_no);
			srchOper(miKey, miL, imiKey, imiL);
			
			MCIndexKey oiKey = up1().createIndex(MfgInstReg_Chk02_DtlOperR.$oper_inst_no);
			MCList<MfgInstReg_Chk02_DtlOperR> oiL = up1();
			srchInpt(miKey, miL, imiKey, imiL, oiKey, oiL);
			srchWk(miKey, miL, imiKey, imiL, oiKey, oiL);
			srchYield(miKey, miL, imiKey, imiL, oiKey, oiL);
			srchReExt(miKey, miL);
		}
		
		protected void srchOper(MCIndexKey miKey, MCList<MfgInstReg_Chk02_HdrR> miL,
				MCIndexKey imiKey, MCList<MfgInstReg_Chk02_HdrR> imiL) {
			// 指図済データ
			MCList<MST_OPER_INST_R> oiL = MCList.create(MST_OPER_INST_R.class);
			MST_OPER_INST_R t = MST_OPER_INST_R.create("T");
			MCQueryApiBuilder oiL_bldr = MCQueryApiBuilder.create(t);
			oiL_bldr.setSelect(t.mfg_inst_no);
			oiL_bldr.addSelect(t.oper_inst_no);
			oiL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			oiL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6000_MST_OPER_INST_S02", oiL, oiL_bldr, miL);
			
			for (MST_OPER_INST_R r : oiL) {
				MfgInstReg_Chk02_HdrR hdrR = miL.getFirst(miKey, r.mfg_inst_no());
				if (isNull(hdrR)) {
					continue;
				}
				addToOperL(hdrR, r);
			}
			
			// 未指図データ
			if (!imiL.isEmpty()) {
				MCList<MST_OPER_INST_R> oiYetL = MCList.create(MST_OPER_INST_R.class);
				MST_OPER_INST_R t1 = MST_OPER_INST_R.create("T");
				MCQueryApiBuilder oiYetL_bldr = MCQueryApiBuilder.create(t1);
				oiYetL_bldr.setSelect(t1.itm_mfg_inst_no);
				oiYetL_bldr.addSelect(t1.oper_inst_no);
				oiYetL_bldr.setWhere(t1.mfg_inst_no.isNull()
						.and(t1.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no"))));
				oiYetL_bldr.addWhereWithAnd(t1.can_flg.eq(value(false)));
				dbSelect("MSBCL6000_MST_OPER_INST_S03", oiYetL, oiYetL_bldr, imiL);
	
				for (MST_OPER_INST_R r : oiYetL) {
					MfgInstReg_Chk02_HdrR hdrR = imiL.getFirst(imiKey, r.itm_mfg_inst_no());
					if (isNull(hdrR)) {
						continue;
					}
					addToOperL(hdrR, r);
				}
			}
			up1().setAll(down1());
			setPegNo(up1());
			down1().clear();
		}
		
		protected void addToOperL(MfgInstReg_Chk02_HdrR hdrR, MST_OPER_INST_R r) {
			MfgInstReg_Chk02_DtlOperR tmp = MfgInstReg_Chk02_DtlOperR.create();
			tmp.setAttributes(hdrR);
			tmp.setStatus(MCRow.Status.DELETE);
			tmp.hdr_peg_no(hdrR.peg_no());
			tmp.oper_inst_no(r.oper_inst_no());
			MfgInstReg_Chk02_DtlOperR operUpR = up1()
					.getFirst(MfgInstReg_Chk02_DtlOperR.$oper_inst_no, r.oper_inst_no());
			if (!isNull(operUpR)) {
				tmp.mes_flg(operUpR.mes_flg());
			}
			down1().add(tmp);
		}
		
		protected void srchInpt(MCIndexKey miKey, MCList<MfgInstReg_Chk02_HdrR> miL,
				MCIndexKey imiKey, MCList<MfgInstReg_Chk02_HdrR> imiL, MCIndexKey oiKey,
				MCList<MfgInstReg_Chk02_DtlOperR> oiL) {
			// 指図済データ
			MCList<MST_INPT_SCHD_R> isL = MCList.create(MST_INPT_SCHD_R.class);
			MST_INPT_SCHD_R t = MST_INPT_SCHD_R.create("T");
			MCQueryApiBuilder isL_bldr = MCQueryApiBuilder.create(t);
			isL_bldr.setSelect(t.mfg_inst_no);
			isL_bldr.addSelect(t.oper_inst_no);
			isL_bldr.addSelect(t.inpt_schd_no);
			isL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			isL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6000_MST_INPT_SCHD_S03", isL, isL_bldr, miL);
			
			for (MST_INPT_SCHD_R r : isL) {
				MfgInstReg_Chk02_HdrR hdrR = miL.getFirst(miKey, r.mfg_inst_no());
				if (isNull(hdrR)) {
					continue;
				}
				MfgInstReg_Chk02_DtlOperR operR = oiL.getFirst(oiKey, r.oper_inst_no());
				if (isNull(operR)) {
					continue;
				}
				addToInptL(hdrR, operR, r);
			}
			
			// 未指図データ
			if (!imiL.isEmpty()) {
				MCList<MST_INPT_SCHD_R> isYetL = MCList.create(MST_INPT_SCHD_R.class);
				MST_INPT_SCHD_R t1 = MST_INPT_SCHD_R.create("T");
				MCQueryApiBuilder isYetL_bldr = MCQueryApiBuilder.create(t1);
				isYetL_bldr.setSelect(t1.itm_mfg_inst_no);
				isYetL_bldr.addSelect(t1.oper_inst_no);
				isYetL_bldr.addSelect(t1.inpt_schd_no);
				isYetL_bldr.setWhere(t1.mfg_inst_no.isNull()
						.and(t1.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no"))));
				isYetL_bldr.addWhereWithAnd(t1.can_flg.eq(value(false)));
				dbSelect("MSBCL6000_MST_INPT_SCHD_S04", isYetL, isYetL_bldr, imiL);
	
				for (MST_INPT_SCHD_R r : isYetL) {
					MfgInstReg_Chk02_HdrR hdrR = imiL.getFirst(imiKey, r.itm_mfg_inst_no());
					if (isNull(hdrR)) {
						continue;
					}
					MfgInstReg_Chk02_DtlOperR operR = oiL.getFirst(oiKey, r.oper_inst_no());
					if (isNull(operR)) {
						continue;
					}
					addToInptL(hdrR, operR, r);
				}
			}
			setPegNo(MfgInstReg_Chk02_DtlInpt());
		}
		
		protected void addToInptL(MfgInstReg_Chk02_HdrR hdrR, MfgInstReg_Chk02_DtlOperR operR, MST_INPT_SCHD_R r) {
			MfgInstReg_Chk02_DtlInptR tmp = MfgInstReg_Chk02_DtlInptR.create();
			tmp.setAttributes(hdrR);
			tmp.setStatus(MCRow.Status.DELETE);
			tmp.hdr_peg_no(hdrR.peg_no());
			tmp.oper_peg_no(operR.peg_no());
			tmp.inpt_schd_no(r.inpt_schd_no());
			MfgInstReg_Chk02_DtlInpt().add(tmp);
		}
		
		protected void srchWk(MCIndexKey miKey, MCList<MfgInstReg_Chk02_HdrR> miL,
				MCIndexKey imiKey, MCList<MfgInstReg_Chk02_HdrR> imiL, MCIndexKey oiKey,
				MCList<MfgInstReg_Chk02_DtlOperR> oiL) {
			// 指図済データ
			MCList<MST_WK_SCHD_R> wsL = MCList.create(MST_WK_SCHD_R.class);
			MST_WK_SCHD_R t = MST_WK_SCHD_R.create("T");
			MCQueryApiBuilder wsL_bldr = MCQueryApiBuilder.create(t);
			wsL_bldr.setSelect(t.mfg_inst_no);
			wsL_bldr.addSelect(t.oper_inst_no);
			wsL_bldr.addSelect(t.wk_schd_no);
			wsL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			wsL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6000_MST_WK_SCHD_S02", wsL, wsL_bldr, miL);
			
			for (MST_WK_SCHD_R r : wsL) {
				MfgInstReg_Chk02_HdrR hdrR = miL.getFirst(miKey, r.mfg_inst_no());
				if (isNull(hdrR)) {
					continue;
				}
				MfgInstReg_Chk02_DtlOperR operR = oiL.getFirst(oiKey, r.oper_inst_no());
				if (isNull(operR)) {
					continue;
				}
				addToWkL(hdrR, operR, r);
			}
			
			// 未指図データ
			if (!imiL.isEmpty()) {
				MCList<MST_WK_SCHD_R> wsYetL = MCList.create(MST_WK_SCHD_R.class);
				MST_WK_SCHD_R t1 = MST_WK_SCHD_R.create("T");
				MCQueryApiBuilder wsYetL_bldr = MCQueryApiBuilder.create(t1);
				wsYetL_bldr.setSelect(t1.itm_mfg_inst_no);
				wsYetL_bldr.addSelect(t1.oper_inst_no);
				wsYetL_bldr.addSelect(t1.wk_schd_no);
				wsYetL_bldr.setWhere(t1.mfg_inst_no.isNull()
						.and(t1.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no"))));
				wsYetL_bldr.addWhereWithAnd(t1.can_flg.eq(value(false)));
				dbSelect("MSBCL6000_MST_WK_SCHD_S03", wsYetL, wsYetL_bldr, imiL);
	
				for (MST_WK_SCHD_R r : wsYetL) {
					MfgInstReg_Chk02_HdrR hdrR = imiL.getFirst(imiKey, r.itm_mfg_inst_no());
					if (isNull(hdrR)) {
						continue;
					}
					MfgInstReg_Chk02_DtlOperR operR = oiL.getFirst(oiKey, r.oper_inst_no());
					if (isNull(operR)) {
						continue;
					}
					addToWkL(hdrR, operR, r);
				}
			}
			setPegNo(MfgInstReg_Chk02_DtlWk());
		}
		
		protected void addToWkL(MfgInstReg_Chk02_HdrR hdrR, MfgInstReg_Chk02_DtlOperR operR, MST_WK_SCHD_R r) {
			MfgInstReg_Chk02_DtlWkR tmp = MfgInstReg_Chk02_DtlWkR.create();
			tmp.setAttributes(hdrR);
			tmp.setStatus(MCRow.Status.DELETE);
			tmp.hdr_peg_no(hdrR.peg_no());
			tmp.oper_peg_no(operR.peg_no());
			tmp.wk_schd_no(r.wk_schd_no());
			MfgInstReg_Chk02_DtlWk().add(tmp);
		}
		
		protected void srchYield(MCIndexKey miKey, MCList<MfgInstReg_Chk02_HdrR> miL,
				MCIndexKey imiKey, MCList<MfgInstReg_Chk02_HdrR> imiL, MCIndexKey oiKey,
				MCList<MfgInstReg_Chk02_DtlOperR> oiL) {
			// 指図済データ
			MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder ysL_bldr = MCQueryApiBuilder.create(t);
			ysL_bldr.setSelect(t.mfg_inst_no);
			ysL_bldr.addSelect(t.oper_inst_no);
			ysL_bldr.addSelect(t.yield_schd_no);
			ysL_bldr.addSelect(t.yield_typ);
			ysL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			ysL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6000_MST_YIELD_SCHD_S03", ysL, ysL_bldr, miL);
			
			for (MST_YIELD_SCHD_R r : ysL) {
				MfgInstReg_Chk02_HdrR hdrR = miL.getFirst(miKey, r.mfg_inst_no());
				if (isNull(hdrR)) {
					continue;
				}
				MfgInstReg_Chk02_DtlOperR operR = oiL.getFirst(oiKey, r.oper_inst_no());
				if (isNull(operR)) {
					continue;
				}

				if (!MAC_YIELD_TYP.isBYPROD(r.yield_typ())) {
					addToYieldL(hdrR, operR, r);
				}
				else {
					addToByProdL(hdrR, operR, r);
				}
			}
			// 未指図データ
			if (!imiL.isEmpty()) {
				MCList<MST_YIELD_SCHD_R> ysYetL = MCList.create(MST_YIELD_SCHD_R.class);
				MST_YIELD_SCHD_R t1 = MST_YIELD_SCHD_R.create("T");
				MCQueryApiBuilder ysYetL_bldr = MCQueryApiBuilder.create(t1);
				ysYetL_bldr.setSelect(t1.itm_mfg_inst_no);
				ysYetL_bldr.addSelect(t1.oper_inst_no);
				ysYetL_bldr.addSelect(t1.yield_schd_no);
				ysYetL_bldr.addSelect(t1.yield_typ);
				ysYetL_bldr.setWhere(t1.mfg_inst_no.isNull()
						.and(t1.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no"))));
				ysYetL_bldr.addWhereWithAnd(t1.can_flg.eq(value(false)));
				dbSelect("MSBCL6000_MST_YIELD_SCHD_S04", ysYetL, ysYetL_bldr, imiL);
				
				for (MST_YIELD_SCHD_R r : ysYetL) {
					MfgInstReg_Chk02_HdrR hdrR = imiL.getFirst(imiKey, r.itm_mfg_inst_no());
					if (isNull(hdrR)) {
						continue;
					}
					MfgInstReg_Chk02_DtlOperR operR = oiL.getFirst(oiKey, r.oper_inst_no());
					if (isNull(operR)) {
						continue;
					}
					
					if (!MAC_YIELD_TYP.isBYPROD(r.yield_typ())) {
						addToYieldL(hdrR, operR, r);
					}
					else {
						addToByProdL(hdrR, operR, r);
					}
				}
			}
			setPegNo(MfgInstReg_Chk02_DtlYield());
			setPegNo(MfgInstReg_Chk02_DtlByProd());
		}
		
		protected void addToYieldL(MfgInstReg_Chk02_HdrR hdrR, MfgInstReg_Chk02_DtlOperR operR, MST_YIELD_SCHD_R r) {
			MfgInstReg_Chk02_DtlYieldR tmp = MfgInstReg_Chk02_DtlYieldR.create();
			tmp.setAttributes(hdrR);
			tmp.setStatus(MCRow.Status.DELETE);
			tmp.hdr_peg_no(hdrR.peg_no());
			tmp.oper_peg_no(operR.peg_no());
			tmp.yield_schd_no(r.yield_schd_no());
			MfgInstReg_Chk02_DtlYield().add(tmp);
		}
		
		protected void addToByProdL(MfgInstReg_Chk02_HdrR hdrR, MfgInstReg_Chk02_DtlOperR operR, MST_YIELD_SCHD_R r) {
			MfgInstReg_Chk02_DtlByProdR tmp = MfgInstReg_Chk02_DtlByProdR.create();
			tmp.setAttributes(hdrR);
			tmp.setStatus(MCRow.Status.DELETE);
			tmp.hdr_peg_no(hdrR.peg_no());
			tmp.oper_peg_no(operR.peg_no());
			tmp.yield_schd_no(r.yield_schd_no());
			MfgInstReg_Chk02_DtlByProd().add(tmp);
		}
		
		protected void srchReExt(MCIndexKey miKey, MCList<MfgInstReg_Chk02_HdrR> miL) {
			MCList<MST_RE_EXT_HST_R> reL = MCList.create(MST_RE_EXT_HST_R.class);
			MST_RE_EXT_HST_R t = MST_RE_EXT_HST_R.create("T");
			MCQueryApiBuilder reL_bldr = MCQueryApiBuilder.create(t);
			reL_bldr.setSelect(t.mfg_inst_no);
			reL_bldr.addSelect(t.ref_ord);
			reL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbSelect("MSBCL6000_MST_RE_EXT_HST_S01", reL, reL_bldr, miL);
			
			for (MST_RE_EXT_HST_R r : reL) {
				MfgInstReg_Chk02_HdrR hdrR = miL.getFirst(miKey, r.mfg_inst_no());
				if (isNull(hdrR)) {
					continue;
				}
				addToReExtL(hdrR, r);
			}
		}
		
		protected void addToReExtL(MfgInstReg_Chk02_HdrR hdrR, MST_RE_EXT_HST_R r) {
			MfgInstReg_Chk02_DtlReExtR tmp = MfgInstReg_Chk02_DtlReExtR.create();
			tmp.setAttributes(hdrR);
			tmp.setStatus(MCRow.Status.DELETE);
			tmp.hdr_peg_no(hdrR.peg_no());
			tmp.ref_ord(r.ref_ord());
			MfgInstReg_Chk02_DtlReExt().add(tmp);
		}
	}
	
	/**
	 * MfgInstReg_Del01オペレーション.<p>
	 *
	 * 製造指図の取消の共通処理<br>
	 */
	public class MfgInstReg_Del01 extends MSBCL_MfgInstRegService_MC_A.MfgInstReg_Del01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up1());
			}
			catch (Exception e) {
				if (!up0().lst_del_flg()) {
					throw e;
				}
				handleEx(e, up1());
			}
			finally {
				setDown();
			}
		}
		
		protected void handleSuccess(MCList<MfgInstReg_Del01_HdrR> l) {
			// 一括登録でコミット不要フラグがオフの場合はコミット（一括登録で１回目と２回目に分割して登録する場合、１回目にオフとなる）
			if (up0().lst_del_flg() && !up0().not_commit_flg()) {
				dbTran().commit();
			}
			for (MfgInstReg_Del01_HdrR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}
		
		protected void handleEx(Exception e,
				MCList<MfgInstReg_Del01_HdrR> l) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (MfgInstReg_Del01_HdrR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up1());
		}
		
		@Override
		protected void doIt() {
			editUp();
			callThisChk02();
			
			if (!up0().lst_del_flg()) {
				// 単票から呼ばれた場合は、エラー時に例外をthrowするため、throwCanErrを実行する
				throwCanErr();
			}
			
			callMfgInstRegSrv();
		}
		
		protected void editUp() {
			// 一括取消の場合、上り電文「工程指図」を補完する
			if (up0().lst_del_flg()) {
				MCList<MST_OPER_INST_R> operL = MCList.create(MST_OPER_INST_R.class);
				MST_OPER_INST_R t = MST_OPER_INST_R.create("T");
				MCQueryApiBuilder operL_bldr = MCQueryApiBuilder.create(t);
				MST_ITM_MFG_INST_R t1 = MST_ITM_MFG_INST_R.create("T1");
				operL_bldr.setSelect(t.oper_inst_no, t.oper_cd);
				operL_bldr.addSelect(t1.itm_cd);
				operL_bldr.addSelect(t1.itm_sub1);
				operL_bldr.addSelect(t1.itm_sub2);
				operL_bldr.addSelect(t1.itm_sub3);
				operL_bldr.addSelect(t1.mfg_loc_cd);
				operL_bldr.addInnerJoin(t1, bracket( t.itm_mfg_inst_no.eq(t1.itm_mfg_inst_no)));
				operL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
				dbSelect("MSBCL6000_MST_OPER_INST_S04", operL, operL_bldr, up1());
				
				operL.addNumberColumn("peg_no");
				setPegNo(operL);
				MSUCL_SCMLinkUtil.SCMLinkUtil_Srch02 ope = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch02();
				for (MST_OPER_INST_R operR : operL) {
					SCMLinkUtil_Srch02_CndR cndR = SCMLinkUtil_Srch02_CndR.create();
					cndR.peg_no(operR.getNumberNE("peg_no"));
					cndR.loc_cd(operR.getStringNE("mfg_loc_cd"));
					cndR.itm_cd(operR.getStringNE("itm_cd"));
					cndR.itm_sub1(operR.getStringNE("itm_sub1"));
					cndR.itm_sub2(operR.getStringNE("itm_sub2"));
					cndR.itm_sub3(operR.getStringNE("itm_sub3"));
					cndR.oper_cd(operR.oper_cd());
					cndR.master_dt(getToday());

					ope.up0().add(cndR);
				}
				
				ope.exec();
				
				for (MST_OPER_INST_R operR : operL) {
					SCMLinkUtil_Srch02_CndR mesR = ope.down0().getFirst(SCMLinkUtil_Srch02_CndR.$peg_no, operR.getNumberNE("peg_no"));
					MfgInstReg_Del01_DtlOperR dtlOperR = MfgInstReg_Del01_DtlOperR.create();
					dtlOperR.oper_inst_no(operR.oper_inst_no());
					if (!isNull(mesR)) {
						dtlOperR.mes_flg(mesR.mes_flg());
					}
					up2().add(dtlOperR);
				}
			}
		}
		protected void callThisChk02() {
			mapUpContainers(MI);
			if (up0().lst_del_flg()) {
				miChk02_up0.setBooleanNE(MfgInstReg_Chk02_HdrR.$lst_reg_flg, true);
			}
			if (!up0().not_chk_cntr_flg()) {
				miChk02_up0.setBooleanNE(MfgInstReg_Chk02_HdrR.$upd_cntr_chk_flg, true);
			}
			miChk02.exec();
			mapDownContainers(MI);
		}
		
		protected void callMfgInstRegSrv() {
			MCList<MfgInstReg_Chk02_HdrR> notErrDown0 = MCList.create(MfgInstReg_Chk02_HdrR.class);
			MCIndexKey upIdxkey = up1().createIndex(MfgInstReg_Del01_HdrR.$peg_no);
			
			for (MfgInstReg_Chk02_HdrR chkDown0R : miChk02.down0()) {
				if (!chkDown0R.err_flg()) {
					notErrDown0.add(chkDown0R);
				}
				else {
					MfgInstReg_Del01_HdrR thisUpR = up1().getFirst(upIdxkey, chkDown0R.peg_no());
					thisUpR.err_flg(true);
					thisUpR.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
			}
			
			if (notErrDown0.isEmpty()) {
				return;
			}
			
			MCList<MfgInstReg_Chk02_DtlOperR> notErrDown1 = MCList.create(MfgInstReg_Chk02_DtlOperR.class);
			MCIndexKey down1Key = miChk02.down1().createIndex(MfgInstReg_Chk02_DtlOperR.$hdr_peg_no);

			MCList<MfgInstReg_Chk02_DtlInptR> notErrDown2 = MCList.create(MfgInstReg_Chk02_DtlInptR.class);
			MCIndexKey down2Key = miChk02.down2().createIndex(MfgInstReg_Chk02_DtlInptR.$hdr_peg_no);

			MCList<MfgInstReg_Chk02_DtlWkR> notErrDown3 = MCList.create(MfgInstReg_Chk02_DtlWkR.class);
			MCIndexKey down3Key = miChk02.down3().createIndex(MfgInstReg_Chk02_DtlWkR.$hdr_peg_no);
			
			MCList<MfgInstReg_Chk02_DtlYieldR> notErrDown4 = MCList.create(MfgInstReg_Chk02_DtlYieldR.class);
			MCIndexKey down4Key = miChk02.down4().createIndex(MfgInstReg_Chk02_DtlYieldR.$hdr_peg_no);
			
			MCList<MfgInstReg_Chk02_DtlByProdR> notErrDown5 = MCList.create(MfgInstReg_Chk02_DtlByProdR.class);
			MCIndexKey down5Key = miChk02.down5().createIndex(MfgInstReg_Chk02_DtlByProdR.$hdr_peg_no);
			
			for (MfgInstReg_Chk02_HdrR r : notErrDown0) {
				notErrDown1.addAll(miChk02.down1().subList(down1Key, r.peg_no()));
				notErrDown2.addAll(miChk02.down2().subList(down2Key, r.peg_no()));
				notErrDown3.addAll(miChk02.down3().subList(down3Key, r.peg_no()));
				notErrDown4.addAll(miChk02.down4().subList(down4Key, r.peg_no()));
				notErrDown5.addAll(miChk02.down5().subList(down5Key, r.peg_no()));
			}
			
			MSBCL_MfgInstRegService.MfgInstReg_Upd01 updOpe = MSBCL_MfgInstRegService.crtMfgInstReg_Upd01();
			addAll(updOpe.up0(), notErrDown0, createMap_MfgInstReg_Upd01_HdrR_MfgInstReg_Chk02_HdrR());
			addAll(updOpe.up1(), notErrDown1, createMap_MfgInstReg_Upd01_DtlOperR_MfgInstReg_Chk02_DtlOperR());
			addAll(updOpe.up2(), notErrDown2, createMap_MfgInstReg_Upd01_DtlInptR_MfgInstReg_Chk02_DtlInptR());
			addAll(updOpe.up3(), notErrDown3, createMap_MfgInstReg_Upd01_DtlWkR_MfgInstReg_Chk02_DtlWkR());
			addAll(updOpe.up4(), notErrDown4, createMap_MfgInstReg_Upd01_DtlYieldR_MfgInstReg_Chk02_DtlYieldR());
			addAll(updOpe.up5(), notErrDown5, createMap_MfgInstReg_Upd01_DtlByProdR_MfgInstReg_Chk02_DtlByProdR());
			// 再展開履歴は、削除の仕様がないため更新処理には渡さない
			updOpe.exec();
		}
		
		// ヘッダ
		protected Map_MfgInstReg_Upd01_HdrR_MfgInstReg_Chk02_HdrR<MfgInstReg_Upd01_HdrR,MfgInstReg_Chk02_HdrR> createMap_MfgInstReg_Upd01_HdrR_MfgInstReg_Chk02_HdrR() {
			return new Map_MfgInstReg_Upd01_HdrR_MfgInstReg_Chk02_HdrR<MfgInstReg_Upd01_HdrR, MfgInstReg_Chk02_HdrR>();
		}

		public class Map_MfgInstReg_Upd01_HdrR_MfgInstReg_Chk02_HdrR<D extends MfgInstReg_Upd01_HdrR, S extends MfgInstReg_Chk02_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_inst_data_crud_typ, MfgInstReg_Chk02_HdrR.$mfg_inst_data_crud_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_mfg_inst_data_crud_typ, MfgInstReg_Chk02_HdrR.$itm_mfg_inst_data_crud_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$peg_no, MfgInstReg_Chk02_HdrR.$peg_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_mtd_typ, MfgInstReg_Chk02_HdrR.$mfg_mtd_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_cd, MfgInstReg_Chk02_HdrR.$itm_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_sub1, MfgInstReg_Chk02_HdrR.$itm_sub1);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_sub2, MfgInstReg_Chk02_HdrR.$itm_sub2);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_sub3, MfgInstReg_Chk02_HdrR.$itm_sub3);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$bom_ptn, MfgInstReg_Chk02_HdrR.$bom_ptn);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$sno1, MfgInstReg_Chk02_HdrR.$sno1);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$sno2, MfgInstReg_Chk02_HdrR.$sno2);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$sno3, MfgInstReg_Chk02_HdrR.$sno3);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$sno4, MfgInstReg_Chk02_HdrR.$sno4);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_inst_no, MfgInstReg_Chk02_HdrR.$mfg_inst_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_mfg_inst_no, MfgInstReg_Chk02_HdrR.$itm_mfg_inst_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$frst_mfg_inst_no, MfgInstReg_Chk02_HdrR.$frst_mfg_inst_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_ord_no, MfgInstReg_Chk02_HdrR.$itm_ord_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_inst_unit_typ, MfgInstReg_Chk02_HdrR.$mfg_inst_unit_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$unschd_inst_flg, MfgInstReg_Chk02_HdrR.$unschd_inst_flg);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$base_unit_not_inst_qty, MfgInstReg_Chk02_HdrR.$base_unit_not_inst_qty);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_loc_wg_cd, MfgInstReg_Chk02_HdrR.$mfg_loc_wg_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_loc_site_cd, MfgInstReg_Chk02_HdrR.$mfg_loc_site_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$po_d_no, MfgInstReg_Chk02_HdrR.$po_d_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$po_schd_src_typ, MfgInstReg_Chk02_HdrR.$po_schd_src_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$po_schd_src_no, MfgInstReg_Chk02_HdrR.$po_schd_src_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$po_schd_data_crud_typ, MfgInstReg_Chk02_HdrR.$po_schd_data_crud_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$old_mfg_sts_typ, MfgInstReg_Chk02_HdrR.$old_mfg_sts_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$old_mfg_aprv_sts_typ, MfgInstReg_Chk02_HdrR.$old_mfg_aprv_sts_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$old_aprv_flg, MfgInstReg_Chk02_HdrR.$old_aprv_flg);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$old_mfg_aprv_role_cd, MfgInstReg_Chk02_HdrR.$old_mfg_aprv_role_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$old_inst_dt, MfgInstReg_Chk02_HdrR.$old_inst_dt);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$old_lot_no, MfgInstReg_Chk02_HdrR.$old_lot_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$old_sublot_no, MfgInstReg_Chk02_HdrR.$old_sublot_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$old_bom_ptn, MfgInstReg_Chk02_HdrR.$old_bom_ptn);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$not_frst_inst_can_flg, MfgInstReg_Chk02_HdrR.$not_frst_inst_can_flg);

			}
		}
		
		// 工程
		protected Map_MfgInstReg_Upd01_DtlOperR_MfgInstReg_Chk02_DtlOperR<MfgInstReg_Upd01_DtlOperR,MfgInstReg_Chk02_DtlOperR> createMap_MfgInstReg_Upd01_DtlOperR_MfgInstReg_Chk02_DtlOperR() {
			return new Map_MfgInstReg_Upd01_DtlOperR_MfgInstReg_Chk02_DtlOperR<MfgInstReg_Upd01_DtlOperR, MfgInstReg_Chk02_DtlOperR>();
		}

		public class Map_MfgInstReg_Upd01_DtlOperR_MfgInstReg_Chk02_DtlOperR<D extends MfgInstReg_Upd01_DtlOperR, S extends MfgInstReg_Chk02_DtlOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$data_crud_typ, MfgInstReg_Chk02_DtlOperR.$data_crud_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$hdr_peg_no, MfgInstReg_Chk02_DtlOperR.$hdr_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$peg_no, MfgInstReg_Chk02_DtlOperR.$peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_ord_no, MfgInstReg_Chk02_DtlOperR.$oper_ord_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_inst_no, MfgInstReg_Chk02_DtlOperR.$oper_inst_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$unschd_inst_flg, MfgInstReg_Chk02_DtlOperR.$unschd_inst_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$not_oper_schd_qty, MfgInstReg_Chk02_DtlOperR.$not_oper_schd_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$mfg_sts_typ, MfgInstReg_Chk02_DtlOperR.$mfg_sts_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$not_frst_inst_can_flg, MfgInstReg_Chk02_DtlOperR.$not_frst_inst_can_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$mes_flg, MfgInstReg_Chk02_DtlOperR.$mes_flg);

			}
		}
		
		// 投入
		protected Map_MfgInstReg_Upd01_DtlInptR_MfgInstReg_Chk02_DtlInptR<MfgInstReg_Upd01_DtlInptR,MfgInstReg_Chk02_DtlInptR> createMap_MfgInstReg_Upd01_DtlInptR_MfgInstReg_Chk02_DtlInptR() {
			return new Map_MfgInstReg_Upd01_DtlInptR_MfgInstReg_Chk02_DtlInptR<MfgInstReg_Upd01_DtlInptR, MfgInstReg_Chk02_DtlInptR>();
		}

		public class Map_MfgInstReg_Upd01_DtlInptR_MfgInstReg_Chk02_DtlInptR<D extends MfgInstReg_Upd01_DtlInptR, S extends MfgInstReg_Chk02_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$data_crud_typ, MfgInstReg_Chk02_DtlInptR.$data_crud_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$hdr_peg_no, MfgInstReg_Chk02_DtlInptR.$hdr_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$oper_peg_no, MfgInstReg_Chk02_DtlInptR.$oper_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$peg_no, MfgInstReg_Chk02_DtlInptR.$peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_cd, MfgInstReg_Chk02_DtlInptR.$itm_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_sub1, MfgInstReg_Chk02_DtlInptR.$itm_sub1);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_sub2, MfgInstReg_Chk02_DtlInptR.$itm_sub2);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_sub3, MfgInstReg_Chk02_DtlInptR.$itm_sub3);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$ver_no, MfgInstReg_Chk02_DtlInptR.$ver_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$old_ver_no, MfgInstReg_Chk02_DtlInptR.$old_ver_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$prov_typ, MfgInstReg_Chk02_DtlInptR.$prov_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$inpt_ctl_typ, MfgInstReg_Chk02_DtlInptR.$inpt_ctl_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$inpt_schd_no, MfgInstReg_Chk02_DtlInptR.$inpt_schd_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$old_mfg_sts_typ, MfgInstReg_Chk02_DtlInptR.$old_mfg_sts_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$xfr_inst_err_flg, MfgInstReg_Chk02_DtlInptR.$xfr_inst_err_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$mfg_sts_typ, MfgInstReg_Chk02_DtlInptR.$mfg_sts_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$not_frst_inst_can_flg, MfgInstReg_Chk02_DtlInptR.$not_frst_inst_can_flg);

			}
		}
		
		// 工数
		protected Map_MfgInstReg_Upd01_DtlWkR_MfgInstReg_Chk02_DtlWkR<MfgInstReg_Upd01_DtlWkR,MfgInstReg_Chk02_DtlWkR> createMap_MfgInstReg_Upd01_DtlWkR_MfgInstReg_Chk02_DtlWkR() {
			return new Map_MfgInstReg_Upd01_DtlWkR_MfgInstReg_Chk02_DtlWkR<MfgInstReg_Upd01_DtlWkR, MfgInstReg_Chk02_DtlWkR>();
		}

		public class Map_MfgInstReg_Upd01_DtlWkR_MfgInstReg_Chk02_DtlWkR<D extends MfgInstReg_Upd01_DtlWkR, S extends MfgInstReg_Chk02_DtlWkR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$data_crud_typ, MfgInstReg_Chk02_DtlWkR.$data_crud_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$hdr_peg_no, MfgInstReg_Chk02_DtlWkR.$hdr_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$oper_peg_no, MfgInstReg_Chk02_DtlWkR.$oper_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$peg_no, MfgInstReg_Chk02_DtlWkR.$peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$wk_schd_no, MfgInstReg_Chk02_DtlWkR.$wk_schd_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$mfg_sts_typ, MfgInstReg_Chk02_DtlWkR.$mfg_sts_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$not_frst_inst_can_flg, MfgInstReg_Chk02_DtlWkR.$not_frst_inst_can_flg);

			}
		}
		
		// 出来高
		protected Map_MfgInstReg_Upd01_DtlYieldR_MfgInstReg_Chk02_DtlYieldR<MfgInstReg_Upd01_DtlYieldR,MfgInstReg_Chk02_DtlYieldR> createMap_MfgInstReg_Upd01_DtlYieldR_MfgInstReg_Chk02_DtlYieldR() {
			return new Map_MfgInstReg_Upd01_DtlYieldR_MfgInstReg_Chk02_DtlYieldR<MfgInstReg_Upd01_DtlYieldR, MfgInstReg_Chk02_DtlYieldR>();
		}

		public class Map_MfgInstReg_Upd01_DtlYieldR_MfgInstReg_Chk02_DtlYieldR<D extends MfgInstReg_Upd01_DtlYieldR, S extends MfgInstReg_Chk02_DtlYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$data_crud_typ, MfgInstReg_Chk02_DtlYieldR.$data_crud_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$hdr_peg_no, MfgInstReg_Chk02_DtlYieldR.$hdr_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$oper_peg_no, MfgInstReg_Chk02_DtlYieldR.$oper_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$peg_no, MfgInstReg_Chk02_DtlYieldR.$peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$yield_schd_no, MfgInstReg_Chk02_DtlYieldR.$yield_schd_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$old_mfg_sts_typ, MfgInstReg_Chk02_DtlYieldR.$old_mfg_sts_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$mfg_sts_typ, MfgInstReg_Chk02_DtlYieldR.$mfg_sts_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$not_frst_inst_can_flg, MfgInstReg_Chk02_DtlYieldR.$not_frst_inst_can_flg);
				// mfg_inst_no～insp_cnt_rmrksは工程単位製造指図の初回製造指図以外の取消で検査予定サービスに渡す
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$mfg_inst_no, MfgInstReg_Chk02_DtlYieldR.$mfg_inst_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$itm_mfg_inst_no, MfgInstReg_Chk02_DtlYieldR.$itm_mfg_inst_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$itm_cd, MfgInstReg_Chk02_DtlYieldR.$itm_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$itm_sub1, MfgInstReg_Chk02_DtlYieldR.$itm_sub1);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$itm_sub2, MfgInstReg_Chk02_DtlYieldR.$itm_sub2);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$itm_sub3, MfgInstReg_Chk02_DtlYieldR.$itm_sub3);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$strg_loc_cd, MfgInstReg_Chk02_DtlYieldR.$strg_loc_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$strg_str_ln_cd, MfgInstReg_Chk02_DtlYieldR.$strg_str_ln_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$sno1, MfgInstReg_Chk02_DtlYieldR.$sno1);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$sno2, MfgInstReg_Chk02_DtlYieldR.$sno2);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$sno3, MfgInstReg_Chk02_DtlYieldR.$sno3);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$sno4, MfgInstReg_Chk02_DtlYieldR.$sno4);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$mfg_loc_cd, MfgInstReg_Chk02_DtlYieldR.$mfg_loc_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$schd_tm, MfgInstReg_Chk02_DtlYieldR.$schd_tm);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$base_unit_yield_qty, MfgInstReg_Chk02_DtlYieldR.$base_unit_yield_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$base_unit_cd, MfgInstReg_Chk02_DtlYieldR.$base_unit_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$trd_unit_yield_qty, MfgInstReg_Chk02_DtlYieldR.$trd_unit_yield_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$trd_unit_cd, MfgInstReg_Chk02_DtlYieldR.$trd_unit_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$itm_ord_no, MfgInstReg_Chk02_DtlYieldR.$itm_ord_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$insp_cnt_rmrks, MfgInstReg_Chk02_DtlYieldR.$insp_cnt_rmrks);
			}
		}
		
		// 副産品
		protected Map_MfgInstReg_Upd01_DtlByProdR_MfgInstReg_Chk02_DtlByProdR<MfgInstReg_Upd01_DtlByProdR,MfgInstReg_Chk02_DtlByProdR> createMap_MfgInstReg_Upd01_DtlByProdR_MfgInstReg_Chk02_DtlByProdR() {
			return new Map_MfgInstReg_Upd01_DtlByProdR_MfgInstReg_Chk02_DtlByProdR<MfgInstReg_Upd01_DtlByProdR, MfgInstReg_Chk02_DtlByProdR>();
		}

		public class Map_MfgInstReg_Upd01_DtlByProdR_MfgInstReg_Chk02_DtlByProdR<D extends MfgInstReg_Upd01_DtlByProdR, S extends MfgInstReg_Chk02_DtlByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Upd01_DtlByProdR.$data_crud_typ, MfgInstReg_Chk02_DtlByProdR.$data_crud_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlByProdR.$hdr_peg_no, MfgInstReg_Chk02_DtlByProdR.$hdr_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlByProdR.$oper_peg_no, MfgInstReg_Chk02_DtlByProdR.$oper_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlByProdR.$peg_no, MfgInstReg_Chk02_DtlByProdR.$peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlByProdR.$itm_cd, MfgInstReg_Chk02_DtlByProdR.$itm_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlByProdR.$itm_sub1, MfgInstReg_Chk02_DtlByProdR.$itm_sub1);
				addColumnPathMap(MfgInstReg_Upd01_DtlByProdR.$itm_sub2, MfgInstReg_Chk02_DtlByProdR.$itm_sub2);
				addColumnPathMap(MfgInstReg_Upd01_DtlByProdR.$itm_sub3, MfgInstReg_Chk02_DtlByProdR.$itm_sub3);
				addColumnPathMap(MfgInstReg_Upd01_DtlByProdR.$yield_schd_no, MfgInstReg_Chk02_DtlByProdR.$yield_schd_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlByProdR.$old_mfg_sts_typ, MfgInstReg_Chk02_DtlByProdR.$old_mfg_sts_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlByProdR.$old_itm_cd, MfgInstReg_Chk02_DtlByProdR.$old_itm_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlByProdR.$old_itm_sub1, MfgInstReg_Chk02_DtlByProdR.$old_itm_sub1);
				addColumnPathMap(MfgInstReg_Upd01_DtlByProdR.$old_itm_sub2, MfgInstReg_Chk02_DtlByProdR.$old_itm_sub2);
				addColumnPathMap(MfgInstReg_Upd01_DtlByProdR.$old_itm_sub3, MfgInstReg_Chk02_DtlByProdR.$old_itm_sub3);
				addColumnPathMap(MfgInstReg_Upd01_DtlByProdR.$old_lot_no, MfgInstReg_Chk02_DtlByProdR.$old_lot_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlByProdR.$old_sublot_no, MfgInstReg_Chk02_DtlByProdR.$old_sublot_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlByProdR.$mfg_sts_typ, MfgInstReg_Chk02_DtlByProdR.$mfg_sts_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlByProdR.$not_frst_inst_can_flg, MfgInstReg_Chk02_DtlByProdR.$not_frst_inst_can_flg);

			}
		}

	}
	
	protected static final Class<MSBCL_MfgInstRegService> CLAZZ = MSBCL_MfgInstRegService.class;
	
	// Chk03,Upd02で共通して使用するキャッシュ関連の処理
	protected static void initCacheForUpd02(MCList<MfgInstReg_Upd02_Hdr1R> upL) {
		object(CLAZZ)._initCacheForUpd02(upL);
	}

	// 品目オーダ
	protected FXUCL_Cache<MST_ITM_ORDER_R> _itmOrdCacheForUpd02;
	protected static MST_ITM_ORDER_R getItmOrdCacheForUpd02(String itmOrdNo) {
		return object(CLAZZ)._itmOrdCacheForUpd02.getCache(itmOrdNo);
	}
	
	// 品目製造指図
	protected FXUCL_Cache<MST_ITM_MFG_INST_R> _itmMfgInstCacheForUpd02;
	protected static MST_ITM_MFG_INST_R getItmMfgInstCacheForUpd02(String itmMfgInstNo) {
		return object(CLAZZ)._itmMfgInstCacheForUpd02.getCache(itmMfgInstNo);
	}

	// 製造指図
	protected FXUCL_Cache<MST_MFG_INST_R> _mfgInstCacheForUpd02;
	protected static MST_MFG_INST_R getMfgInstCacheForUpd02(String mfgInstNo) {
		return object(CLAZZ)._mfgInstCacheForUpd02.getCache(mfgInstNo);
	}

	protected void _initCacheForUpd02(MCList<MfgInstReg_Upd02_Hdr1R> upL) {
		// 品目オーダの取得
		_itmOrdCacheForUpd02 = new FXUCL_Cache<MST_ITM_ORDER_R>();
		_itmOrdCacheForUpd02.setFixMaxCacheSize(-1);
		
		MCList<MST_ITM_ORDER_R> ioBindL = MCList.create(MST_ITM_ORDER_R.class);
		for (MfgInstReg_Upd02_Hdr1R r : upL) {
			if (isNull(r.itm_ord_no())) {
				continue;
			}
			MST_ITM_ORDER_R ioBindR = MST_ITM_ORDER_R.create();
			ioBindR.itm_ord_no(r.itm_ord_no());
			ioBindL.add(ioBindR);
		}
		ioBindL = ioBindL.groupBy(MST_ITM_ORDER_R.$itm_ord_no);
		ioBindL.sort(MST_ITM_ORDER_R.$itm_ord_no);

		if (!ioBindL.isEmpty()) {
			MCList<MST_ITM_ORDER_R> ioL = srchItmOrdForUpd02(ioBindL);
			MCIndexKey idxkey = ioL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			
			for (MST_ITM_ORDER_R ioBindR : ioBindL) {
				MST_ITM_ORDER_R dbR = ioL.getFirst(idxkey, ioBindR.itm_ord_no());
				if (isNull(dbR)) {
					continue;
				}
				_itmOrdCacheForUpd02.putCache(new String[] {ioBindR.itm_ord_no()}, dbR);
			}
		}
		
		// 品目製造指図の取得
		_itmMfgInstCacheForUpd02 = new FXUCL_Cache<MST_ITM_MFG_INST_R>();
		_itmMfgInstCacheForUpd02.setFixMaxCacheSize(-1);
		
		MCList<MST_ITM_MFG_INST_R> imiBindL = MCList.create(MST_ITM_MFG_INST_R.class);
		for (MfgInstReg_Upd02_Hdr1R r : upL) {
			if (isNull(r.itm_mfg_inst_no())) {
				continue;
			}
			MST_ITM_MFG_INST_R imiBindR = MST_ITM_MFG_INST_R.create();
			imiBindR.itm_mfg_inst_no(r.itm_mfg_inst_no());
			imiBindL.add(imiBindR);
		}
		imiBindL = imiBindL.groupBy(MST_ITM_MFG_INST_R.$itm_mfg_inst_no);
		imiBindL.sort(MST_ITM_MFG_INST_R.$itm_mfg_inst_no);

		if (!imiBindL.isEmpty()) {
			MCList<MST_ITM_MFG_INST_R> imiL = srcItmMfgInstForUpd02(imiBindL);
			MCIndexKey idxkey = imiL.createIndex(MST_ITM_MFG_INST_R.$itm_mfg_inst_no);
			
			for (MST_ITM_MFG_INST_R imiBindR : imiBindL) {
				MST_ITM_MFG_INST_R dbR = imiL.getFirst(idxkey, imiBindR.itm_mfg_inst_no());
				if (isNull(dbR)) {
					continue;
				}
				_itmMfgInstCacheForUpd02.putCache(new String[] {imiBindR.itm_mfg_inst_no()}, dbR);
			}
		}
		
		// 製造指図の取得
		_mfgInstCacheForUpd02 = new FXUCL_Cache<MST_MFG_INST_R>();
		_mfgInstCacheForUpd02.setFixMaxCacheSize(-1);
		
		MCList<MST_MFG_INST_R> miBindL = MCList.create(MST_MFG_INST_R.class);
		for (MfgInstReg_Upd02_Hdr1R r : upL) {
			if (isNull(r.mfg_inst_no())) {
				continue;
			}
			MST_MFG_INST_R miBindR = MST_MFG_INST_R.create();
			miBindR.mfg_inst_no(r.mfg_inst_no());
			miBindL.add(miBindR);
		}
		miBindL = miBindL.groupBy(MST_MFG_INST_R.$mfg_inst_no);
		miBindL.sort(MST_MFG_INST_R.$mfg_inst_no);

		if (!miBindL.isEmpty()) {
			MCList<MST_MFG_INST_R> miL = srcMfgInstForUpd02(miBindL);
			MCIndexKey idxkey = miL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			
			for (MST_MFG_INST_R miBindR : miBindL) {
				MST_MFG_INST_R dbR = miL.getFirst(idxkey, miBindR.mfg_inst_no());
				if (isNull(dbR)) {
					continue;
				}
				_mfgInstCacheForUpd02.putCache(new String[] {miBindR.mfg_inst_no()}, dbR);
			}
		}

	}

	protected MCList<MST_ITM_ORDER_R> srchItmOrdForUpd02(
			MCList<MST_ITM_ORDER_R> ioBindL) {

		MCList<MST_ITM_ORDER_R> ret = MCList.create(MST_ITM_ORDER_R.class);
		MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
		MCQueryApiBuilder ret_bldr = MCQueryApiBuilder.create(t);
		ret_bldr.setSelect(t.itm_ord_no, t.itm_ord_typ, t.master_dt, t.itm_cd, t.itm_sub1,
				t.itm_sub2, t.itm_sub3, t.inst_po_cnt_rmrks, t.mfg_loc_cd, t.oper_ptn,
				t.bom_ptn, t.not_inst_qty, t.yield_schd_qty, t.mfg_st_schd_dt, t.sno1,
				t.sno2, t.sno3, t.sno4, t.upd_cntr);
		dbSelectKeyForUpdateNoWait("MSBCL6000_MST_ITM_ORDER_S04", ret, ret_bldr, ioBindL);
		return ret;
	}
	
	// 品目製造指図の取得
	protected MCList<MST_ITM_MFG_INST_R> srcItmMfgInstForUpd02(
			MCList<MST_ITM_MFG_INST_R> imiBindL) {
		MCList<MST_ITM_MFG_INST_R> imiL = MCList.create(MST_ITM_MFG_INST_R.class);
		MST_ITM_MFG_INST_R t = MST_ITM_MFG_INST_R.create("T");
		MCQueryApiBuilder imiL_bldr = MCQueryApiBuilder.create(t);
		imiL_bldr.setSelect(t.itm_mfg_inst_no, t.mfg_mtd_typ, t.master_dt, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.upd_cntr);
		dbSelectKeyForUpdateNoWait("MSBCL6000_MST_ITM_MFG_INST_S03", imiL, imiL_bldr, imiBindL);

		return imiL;
	}
	
	// 製造指図の取得
	protected MCList<MST_MFG_INST_R> srcMfgInstForUpd02(MCList<MST_MFG_INST_R> miBindL) {
		MCList<MST_MFG_INST_R> miL = MCList.create(MST_MFG_INST_R.class);
		MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
		MCQueryApiBuilder miL_bldr = MCQueryApiBuilder.create(t);
		miL_bldr.setSelect(t.mfg_inst_no, t.inst_po_cnt_rmrks, t.mfg_inst_rev, t.upd_cntr);
		dbSelectKeyForUpdateNoWait("MSBCL6000_MST_MFG_INST_S05", miL, miL_bldr, miBindL);

		return miL;
	}
	
	// 投入予定
	protected FXUCL_Cache<MCList<MST_INPT_SCHD_R>> _inptSchdLCacheForUpd01 = null;
	protected static MCList<MST_INPT_SCHD_R> getInptSchdLCacheForUpd01(String itmMfgInstNo) {
		return object(CLAZZ)._inptSchdLCacheForUpd01.getCache(itmMfgInstNo);
	}
	protected static void initInptSchdCacheForUpd01(MfgInstReg_Chk01_HdrR r) {
		object(CLAZZ)._initInptSchdCacheForUpd01(r);
	}
	protected void _initInptSchdCacheForUpd01(MfgInstReg_Chk01_HdrR r) {
		if (_inptSchdLCacheForUpd01 == null) {		
			_inptSchdLCacheForUpd01 = new FXUCL_Cache<MCList<MST_INPT_SCHD_R>>();
		}

		if (isNull(r.mfg_inst_no())) {
			return;
		}
		// 投入予定の取得
		MCList<MST_INPT_SCHD_R> dbL = MCList.create(MST_INPT_SCHD_R.class);
		MST_INPT_SCHD_R t = MST_INPT_SCHD_R.create("T");
		MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(t);
		dbL_bldr.setSelect(t.base_unit_inpt_qty);
		dbL_bldr.addSelect(t.base_unit_rqmt_qty);
		dbL_bldr.addSelect(t.base_unit_fxd_rqmt_qty);
		dbL_bldr.addSelect(t.act_cont_fctr);
		dbL_bldr.addSelect(t.cont_inpt_qty);
		dbL_bldr.addSelect(t.cont_rqmt_qty);
		dbL_bldr.addSelect(t.cont_fxd_rqmt_qty);
		dbL_bldr.addSelect(t.lot_no);
		dbL_bldr.addSelect(t.sublot_no);
		dbL_bldr.addSelect(t.alloc_sno1);
		dbL_bldr.addSelect(t.alloc_sno2);
		dbL_bldr.addSelect(t.alloc_sno3);
		dbL_bldr.addSelect(t.alloc_sno4);
		dbL_bldr.addSelect(t.alloc_flg);
		dbL_bldr.addSelect(t.gd_cd);
		dbL_bldr.addSelect(t.oper_inst_no);
		dbL_bldr.addSelect(t.inpt_schd_no);
		dbL_bldr.setWhere(t.mfg_inst_no.eq(bind("1")), r.mfg_inst_no());
		dbL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelect("MSBCL6000_MST_INPT_SCHD_S05", dbL, dbL_bldr);

		_inptSchdLCacheForUpd01.putCache(new String[] {
				r.mfg_inst_no()
		}, dbL);

	}
	/**
	 * MfgInstReg_Chk03オペレーション.<p>
	 *
	 * 製造指図の一括登録・訂正前チェックの共通処理<br>
	 */
	public class MfgInstReg_Chk03 extends MSBCL_MfgInstRegService_MC_A.MfgInstReg_Chk03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			// 本チェック処理では、Upd02がChk01を呼び出すまでの間に担保しておきたいチェック処理を行う。
			// ※更新カウンタチェックや再展開サービスを呼び出すために必要な日付や数量の必須チェック
			// Chk01のタイミングでチェックしても構わない内容であれば、本処理ではなくChk01で行う
			
			setGrpErrFlg();
			
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			MCList<MfgInstReg_Upd02_Hdr1R> updCntrChkL = getUpdCntrChkL();
			
			initCacheForUpd02(updCntrChkL);
			
			msgL.addAll(chkUpdCntr(updCntrChkL));
			
			return msgL;
		}
		
		protected MCList<MfgInstReg_Upd02_Hdr1R> getUpdCntrChkL() {
			MCList<MfgInstReg_Upd02_Hdr1R> retL = MCList.create(MfgInstReg_Upd02_Hdr1R.class);
			
			if (up0().oper_unit_flg()) {
				for (MfgInstReg_Chk03_Hdr1R upR : up1()) {
					MfgInstReg_Upd02_Hdr1R retR = MfgInstReg_Upd02_Hdr1R.create();
					retR.setAttributes(upR);
					retR.itm_ord_no(upR.itm_ord_no());
					retR.itm_mfg_inst_no(upR.itm_mfg_inst_no());
					retR.mfg_inst_no(upR.mfg_inst_no());
					retR.itm_ord_upd_cntr(upR.itm_ord_upd_cntr());
					retR.mfg_inst_upd_cntr(upR.mfg_inst_upd_cntr());
					retR.itm_mfg_inst_upd_cntr(upR.itm_mfg_inst_upd_cntr());
					
					retL.add(retR);
				}
			}
			else {
				for (MfgInstReg_Chk03_Hdr2R upR : up2()) {
					MfgInstReg_Upd02_Hdr1R retR = MfgInstReg_Upd02_Hdr1R.create();
					retR.setAttributes(upR);
					retR.itm_ord_no(upR.itm_ord_no());
					retR.itm_mfg_inst_no(upR.itm_mfg_inst_no());
					retR.mfg_inst_no(upR.mfg_inst_no());
					retR.itm_ord_upd_cntr(upR.itm_ord_upd_cntr());
					retR.mfg_inst_upd_cntr(upR.mfg_inst_upd_cntr());
					retR.itm_mfg_inst_upd_cntr(upR.itm_mfg_inst_upd_cntr());
					
					retL.add(retR);
				}
			}
			
			return retL;
		}
		
		protected MCMessageList chkUpdCntr(MCList<MfgInstReg_Upd02_Hdr1R> chkL) {
			MCMessageList msgL = new MCMessageList();
			
			for (MfgInstReg_Upd02_Hdr1R chkR : chkL) {
				if (!isNull(chkR.itm_ord_no())) {
					MST_ITM_ORDER_R ioR = getItmOrdCacheForUpd02(chkR.itm_ord_no());

					if (up0().upd_cntr_chk_flg()) {
						msgL.addAll(checkUpdCntrNE(chkR, MfgInstReg_Upd02_Hdr1R.$itm_ord_upd_cntr, ioR));
					}
					else {
						if (isNull(ioR)) {
							msgL.addAll(getRecordNotFoundMsg("MS", "MST_ITM_ORDER"
									, new String[]{MST_ITM_ORDER_R.$itm_ord_no}
									, new Comparable[]{chkR.itm_ord_no()}, chkR));
						}
					}
					setErrFlg(chkR, msgL);
				}
				
				if (!chkR.err_flg() && !isNull(chkR.itm_mfg_inst_no())) {
					MST_ITM_MFG_INST_R imiR = getItmMfgInstCacheForUpd02(chkR.itm_mfg_inst_no());
					
					if (up0().upd_cntr_chk_flg()) {
						msgL.addAll(checkUpdCntrNE(chkR, MfgInstReg_Upd02_Hdr1R.$itm_mfg_inst_upd_cntr, imiR));
					}
					else {
						if (isNull(imiR)) {
							msgL.addAll(getRecordNotFoundMsg("MS", "MST_ITM_MFG_INST"
									, new String[]{MST_ITM_MFG_INST_R.$itm_mfg_inst_no}
									, new Comparable[]{chkR.itm_mfg_inst_no()}, chkR));
						}
					}
					setErrFlg(chkR, msgL);
				}
				
				if (!chkR.err_flg() && !isNull(chkR.mfg_inst_no())) {
					MST_MFG_INST_R miR = getMfgInstCacheForUpd02(chkR.mfg_inst_no());
					
					if (up0().upd_cntr_chk_flg()) {
						msgL.addAll(checkUpdCntrNE(chkR, MfgInstReg_Upd02_Hdr1R.$mfg_inst_upd_cntr, miR));
					}
					else {
						if (isNull(miR)) {
							msgL.addAll(getRecordNotFoundMsg("MS", "MST_MFG_INST"
									, new String[]{MST_MFG_INST_R.$mfg_inst_no}
									, new Comparable[]{chkR.mfg_inst_no()}, chkR));
						}
					}
					setErrFlg(chkR, msgL);
				}
			}
			
			return msgL;
		}
		
		protected void setGrpErrFlg() {
			if (up0().oper_unit_flg()) {
				String[] grpKeys = new String[] {
						MfgInstReg_Chk03_Hdr1R.$itm_ord_no
				};
				setGrpErrFlgByKey(up1(), grpKeys, MfgInstReg_Chk03_Hdr1R.$err_flg);
			}
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			if (up0().oper_unit_flg()) {
				down0().setAll(up1());
			}
			else {
				down1().setAll(up2());
			}
		}
	}
	
	/**
	 * MfgInstReg_Upd02オペレーション.<p>
	 *
	 */
	public class MfgInstReg_Upd02 extends MSBCL_MfgInstRegService_MC_A.MfgInstReg_Upd02 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess();
			}
			catch (Exception e) {
				handleEx(e);
			}
			finally {
				setDown();
			}
		}
		
		protected void handleSuccess() {
			dbTran().commit();
			if (up0().oper_unit_flg()) {
				for (MfgInstReg_Upd02_Hdr1R r : up1()) {
					if (isNull(r.rtn_sts_typ())) {
						r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
					}
				}
			}
			else {
				for (MfgInstReg_Upd02_Hdr1R r : up2()) {
					if (isNull(r.rtn_sts_typ())) {
						r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
					}
				}
			}
		}
		
		protected void handleEx(Exception e) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			
			if (up0().oper_unit_flg()) {
				for (MfgInstReg_Upd02_Hdr1R r : up1()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
			}
			else {
				for (MfgInstReg_Upd02_Hdr1R r : up2()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
			}
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			if (up0().oper_unit_flg()) {
				down0().setAll(up1());
			}
			else {
				down1().setAll(up2());
			}
		}

		@Override
		protected void doIt() {
			if (up0().oper_unit_flg()) {
				callThisChk03(up1());

				MCList<MfgInstReg_Upd02_Hdr1R> notErrHdrUpL = getChkList(up1());
				if (notErrHdrUpL.isEmpty()) {
					return;
				}

				callThisChk01OperMode(notErrHdrUpL);

				if (MfgInstReg_Upd02_Hdr().isEmpty()) {
					return;
				}

				callThisUpd01OperMode(up1());
			}
			else {
				callThisChk03(up2());

				MCList<MfgInstReg_Upd02_Hdr1R> notErrHdrUpL = getChkList(up2());
				if (notErrHdrUpL.isEmpty()) {
					return;
				}

				callThisChk01HdrMode(notErrHdrUpL);

				if (MfgInstReg_Upd02_Hdr().isEmpty()) {
					return;
				}

				setMesFlg();
				callThisUpd01HdrMode(up2());
			}

		}
		
		protected void setMesFlg() {
			if (up0().is_src_batch_flg()) {
				return;
			}
			if (!MfgInstReg_Upd02_DtlOper().isEmpty()) {
				MSUCL_SCMLinkUtil.SCMLinkUtil_Srch02 ope = MSUCL_SCMLinkUtil
						.crtSCMLinkUtil_Srch02();
				for (MfgInstReg_Chk01_DtlOperR rstR : MfgInstReg_Upd02_DtlOper()) {
					SCMLinkUtil_Srch02_CndR cndR = SCMLinkUtil_Srch02_CndR.create();
					cndR.peg_no(rstR.peg_no());
					cndR.loc_cd(rstR.mfg_loc_cd());
					cndR.itm_cd(rstR.itm_cd());
					cndR.itm_sub1(rstR.itm_sub1());
					cndR.itm_sub2(rstR.itm_sub2());
					cndR.itm_sub3(rstR.itm_sub3());
					cndR.oper_cd(rstR.oper_cd());
					cndR.master_dt(getToday());
					boolean firstRow = true;
					for (MfgInstReg_Chk01_DtlWkR wkR : MfgInstReg_Upd02_DtlWk()) {
						// 対象工程に紐づかない工数予定ならスキップ
						if (!isSame(rstR.getNumberNE("peg_no"), wkR.oper_peg_no())) {
							continue;
						}
						if (firstRow) {
							cndR.wk_cost_cd(wkR.wk_cost_cd());
							firstRow = false;
						}
						else {
							SCMLinkUtil_Srch02_CndR subR = cndR.clone();
							subR.wk_cost_cd(wkR.wk_cost_cd());
							ope.up0().add(subR);
						}
					}
					ope.up0().add(cndR);
				}

				ope.exec();

				String[] destCols = new String[] {
						MfgInstReg_Chk01_DtlOperR.$mes_flg
				};
				String[] srcCols = new String[] {
						SCMLinkUtil_Srch02_CndR.$mes_flg
				};
				copyByPegNo(MfgInstReg_Upd02_DtlOper(), destCols, ope.down0(), srcCols);
			}
		}
		protected void callThisChk03(MCList<MfgInstReg_Upd02_Hdr1R> hdrUpL) {
			mapUpContainers(MIR2);
			mirChk03.exec();
			if (up0().oper_unit_flg()) {
				copyErrFlg(hdrUpL, mirChk03.down0());
			}
			else {
				copyErrFlg(hdrUpL, mirChk03.down1());
			}
			
			for (MfgInstReg_Upd02_Hdr1R r : hdrUpL) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
			}
		}
		
		/**
		 * ヘッダ単位でのチェック処理
		 */
		protected void callThisChk01HdrMode(MCList<MfgInstReg_Upd02_Hdr1R> upL) {
			// 本サービスの上り電文からChk01の上り電文を作成する
			MCList<MfgInstReg_Chk01_HdrR> chk01HdrReExp = MCList.create(MfgInstReg_Chk01_HdrR.class); // 新規登録かつ工程再展開有り
			MCList<MfgInstReg_Chk01_HdrR> chk01HdrNoExp = MCList.create(MfgInstReg_Chk01_HdrR.class); // 新規登録かつ工程再展開無し
			MCList<MfgInstReg_Chk01_HdrR> chk01HdrUpd = MCList.create(MfgInstReg_Chk01_HdrR.class); // 既存製造指図の更新

			FXUCL_Cache<MfgInstReg_Upd02_Hdr1R> thisUpCache = new FXUCL_Cache<MfgInstReg_Upd02_Hdr1R>();
			thisUpCache.setFixMaxCacheSize(-1);
			
			for (MfgInstReg_Upd02_Hdr1R upR : upL) {
				MfgInstReg_Chk01_HdrR chk01HdrR = MfgInstReg_Chk01_HdrR.create(); 
				copy(chk01HdrR, upR, createMap_MfgInstReg_Chk01_HdrR_MfgInstReg_Upd02_Hdr1R());
				
				if (isNull(upR.mfg_inst_no())) {
					// 新規登録
					MST_ITM_ORDER_R ioR = getItmOrdCacheForUpd02(upR.itm_ord_no());
					editChk01HdrByIoR(chk01HdrR, ioR);

					if (isReExtReq(chk01HdrR, ioR)) {
						// 工程再展開を行う
						chk01HdrReExp.add(chk01HdrR);
					}
					else {
						// 工程再展開を行わない（投入・工数・出来高・副産品は再展開する）
						chk01HdrNoExp.add(chk01HdrR);
					}
				}
				else {
					// 既存製造指図の更新
					MST_ITM_MFG_INST_R imiR = getItmMfgInstCacheForUpd02(upR.itm_mfg_inst_no());
					MST_MFG_INST_R miR = getMfgInstCacheForUpd02(upR.mfg_inst_no());
					editChk01HdrByImiR(chk01HdrR, imiR, miR);
					chk01HdrUpd.add(chk01HdrR);
				}
				
				thisUpCache.putCache(new MCNumber[]{upR.peg_no()}, upR);
			}

			// -------------------------------新規登録・工程再展開対象-------------------------------
			MCList<MfgInstReg_Chk01_DtlOperR> chk01OperReExp = MCList.create(MfgInstReg_Chk01_DtlOperR.class);
			MCList<MfgInstReg_Chk01_DtlInptR> chk01InptReExp = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
			MCList<MfgInstReg_Chk01_DtlWkR> chk01WkReExp = MCList.create(MfgInstReg_Chk01_DtlWkR.class);
			MCList<MfgInstReg_Chk01_DtlYieldR> chk01YieldReExp = MCList.create(MfgInstReg_Chk01_DtlYieldR.class);
			MCList<MfgInstReg_Chk01_DtlByProdR> chk01ByProdReExp = MCList.create(MfgInstReg_Chk01_DtlByProdR.class);
			
			if (!chk01HdrReExp.isEmpty()) {
				// 工程を再展開し、チェックサービス呼び出し用のコンテナに設定する
				setChkContainerReExp(chk01HdrReExp, chk01OperReExp, chk01InptReExp,
						chk01WkReExp, chk01YieldReExp, chk01ByProdReExp);
			}
			// 工程紐付けＮＯの最大値を保持しておく（後続の処理で重複しない値を設定する必要があるため）
			MCNumber tmpOperPegNo = nvl((MCNumber)chk01OperReExp.max(MfgInstReg_Chk01_DtlOperR.$peg_no), MCNumber.ZERO);
			
			// -------------------------------新規登録・工程再展開対象外-------------------------------
			MCList<MfgInstReg_Chk01_DtlOperR> chk01OperNoExp = MCList.create(MfgInstReg_Chk01_DtlOperR.class);
			MCList<MfgInstReg_Chk01_DtlInptR> chk01InptNoExp = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
			MCList<MfgInstReg_Chk01_DtlWkR> chk01WkNoExp = MCList.create(MfgInstReg_Chk01_DtlWkR.class);
			MCList<MfgInstReg_Chk01_DtlYieldR> chk01YieldNoExp = MCList.create(MfgInstReg_Chk01_DtlYieldR.class);
			MCList<MfgInstReg_Chk01_DtlByProdR> chk01ByProdNoExp  = MCList.create(MfgInstReg_Chk01_DtlByProdR.class);
			
			if (!chk01HdrNoExp.isEmpty()) {
				tmpOperPegNo = setChkContainerNoExp(chk01HdrNoExp, chk01OperNoExp, chk01InptNoExp,
						chk01WkNoExp, chk01YieldNoExp, chk01ByProdNoExp, tmpOperPegNo);
			}

			// -------------------------------既存製造指図更新対象-------------------------------
			MCList<MfgInstReg_Chk01_DtlOperR> chk01OperUpd = MCList.create(MfgInstReg_Chk01_DtlOperR.class);
			MCList<MfgInstReg_Chk01_DtlInptR> chk01InptUpd = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
			MCList<MfgInstReg_Chk01_DtlWkR> chk01WkUpd = MCList.create(MfgInstReg_Chk01_DtlWkR.class);
			MCList<MfgInstReg_Chk01_DtlYieldR> chk01YieldUpd = MCList.create(MfgInstReg_Chk01_DtlYieldR.class);
			MCList<MfgInstReg_Chk01_DtlByProdR> chk01ByProdUpd  = MCList.create(MfgInstReg_Chk01_DtlByProdR.class);
			// 再展開履歴コンテナは渡す必要はないため作成しない
			
			if (!chk01HdrUpd.isEmpty()) {
				setChkContainerUpd(chk01HdrUpd, chk01OperUpd, chk01InptUpd, chk01WkUpd,
						chk01YieldUpd, chk01ByProdUpd, tmpOperPegNo);
			}

			// チェック処理実行
			MSBCL_MfgInstRegService.MfgInstReg_Chk01 chkOpe = MSBCL_MfgInstRegService.crtMfgInstReg_Chk01();
			chkOpe.up0().addAll(chk01HdrReExp);
			chkOpe.up0().addAll(chk01HdrNoExp);
			chkOpe.up0().addAll(chk01HdrUpd);

			chkOpe.up1().addAll(chk01OperReExp);
			chkOpe.up1().addAll(chk01OperNoExp);
			chkOpe.up1().addAll(chk01OperUpd);

			chkOpe.up2().addAll(chk01InptReExp);
			chkOpe.up2().addAll(chk01InptNoExp);
			chkOpe.up2().addAll(chk01InptUpd);

			chkOpe.up3().addAll(chk01WkReExp);
			chkOpe.up3().addAll(chk01WkNoExp);
			chkOpe.up3().addAll(chk01WkUpd);

			chkOpe.up4().addAll(chk01YieldReExp);
			chkOpe.up4().addAll(chk01YieldNoExp);
			chkOpe.up4().addAll(chk01YieldUpd);

			chkOpe.up5().addAll(chk01ByProdReExp);
			chkOpe.up5().addAll(chk01ByProdNoExp);
			chkOpe.up5().addAll(chk01ByProdUpd);
		
			setPegNo(chkOpe.up2(), chkOpe.up3(), chkOpe.up4(), chkOpe.up5());

			// 工程
			for (MfgInstReg_Chk01_DtlOperR operR : chkOpe.up1()) {
				MfgInstReg_Upd02_Hdr1R hdrR = thisUpCache.getCache(operR.hdr_peg_no());
				operR.setAttributes(hdrR);
				operR.mfg_sts_typ(hdrR.mfg_sts_typ());
			}
			// 投入
			for (MfgInstReg_Chk01_DtlInptR inptR : chkOpe.up2()) {
				MfgInstReg_Upd02_Hdr1R hdrR = thisUpCache.getCache(inptR.hdr_peg_no());
				inptR.setAttributes(hdrR);
			}
			// 工数
			for (MfgInstReg_Chk01_DtlWkR wkR : chkOpe.up3()) {
				MfgInstReg_Upd02_Hdr1R hdrR = thisUpCache.getCache(wkR.hdr_peg_no());
				wkR.setAttributes(hdrR);
			}
			// 出来高
			for (MfgInstReg_Chk01_DtlYieldR yieldR : chkOpe.up4()) {
				MfgInstReg_Upd02_Hdr1R hdrR = thisUpCache.getCache(yieldR.hdr_peg_no());
				yieldR.setAttributes(hdrR);
			}
			// 副産品
			for (MfgInstReg_Chk01_DtlByProdR byProdR : chkOpe.up5()) {
				MfgInstReg_Upd02_Hdr1R hdrR = thisUpCache.getCache(byProdR.hdr_peg_no());
				byProdR.setAttributes(hdrR);
			}
			
			// チェック処理実行
			if (!chkOpe.up0().isEmpty()) {
				if (up0().is_src_alloc_flg()) {
					chkOpe.up0().setBoolean(MfgInstReg_Chk01_HdrR.$is_src_alloc_flg, true);
				}
				chkOpe.exec();
				
				MCList<MfgInstReg_Chk01_HdrR> notErrDown0 = MCList.create(MfgInstReg_Chk01_HdrR.class);
				for (MfgInstReg_Chk01_HdrR chkDown0R : chkOpe.down0()) {
					if (!chkDown0R.err_flg()) {
						notErrDown0.add(chkDown0R);
					}
					else {
						MfgInstReg_Upd02_Hdr1R thisUpR = thisUpCache.getCache(chkDown0R.peg_no());
						thisUpR.rtn_sts_typ(chkDown0R.rtn_sts_typ());
					}
				}
				
				if (!notErrDown0.isEmpty()) {
					MCList<MfgInstReg_Chk01_DtlOperR> notErrDown1 = MCList.create(MfgInstReg_Chk01_DtlOperR.class);
					MCIndexKey down1Key = chkOpe.down1().createIndex(MfgInstReg_Chk01_DtlOperR.$hdr_peg_no);
					for (MfgInstReg_Chk01_HdrR r : notErrDown0) {
						notErrDown1.addAll(chkOpe.down1().subList(down1Key, r.peg_no()));
					}
	
					MCList<MfgInstReg_Chk01_DtlInptR> notErrDown2 = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
					MCIndexKey down2Key = chkOpe.down2().createIndex(MfgInstReg_Chk01_DtlInptR.$hdr_peg_no);
					for (MfgInstReg_Chk01_HdrR r : notErrDown0) {
						notErrDown2.addAll(chkOpe.down2().subList(down2Key, r.peg_no()));
					}
	
					MCList<MfgInstReg_Chk01_DtlWkR> notErrDown3 = MCList.create(MfgInstReg_Chk01_DtlWkR.class);
					MCIndexKey down3Key = chkOpe.down3().createIndex(MfgInstReg_Chk01_DtlWkR.$hdr_peg_no);
					for (MfgInstReg_Chk01_HdrR r : notErrDown0) {
						notErrDown3.addAll(chkOpe.down3().subList(down3Key, r.peg_no()));
					}
	
					MCList<MfgInstReg_Chk01_DtlYieldR> notErrDown4 = MCList.create(MfgInstReg_Chk01_DtlYieldR.class);
					MCIndexKey down4Key = chkOpe.down4().createIndex(MfgInstReg_Chk01_DtlYieldR.$hdr_peg_no);
					for (MfgInstReg_Chk01_HdrR r : notErrDown0) {
						notErrDown4.addAll(chkOpe.down4().subList(down4Key, r.peg_no()));
					}
	
					MCList<MfgInstReg_Chk01_DtlByProdR> notErrDown5 = MCList.create(MfgInstReg_Chk01_DtlByProdR.class);
					MCIndexKey down5Key = chkOpe.down5().createIndex(MfgInstReg_Chk01_DtlByProdR.$hdr_peg_no);
					for (MfgInstReg_Chk01_HdrR r : notErrDown0) {
						notErrDown5.addAll(chkOpe.down5().subList(down5Key, r.peg_no()));
					}
	
					MfgInstReg_Upd02_Hdr().setAll(notErrDown0);
					MfgInstReg_Upd02_DtlOper().setAll(notErrDown1);
					MfgInstReg_Upd02_DtlInpt().setAll(notErrDown2);
					MfgInstReg_Upd02_DtlWk().setAll(notErrDown3);
					MfgInstReg_Upd02_DtlYield().setAll(notErrDown4);
					MfgInstReg_Upd02_DtlByProd().setAll(notErrDown5);
				}
			}
		}

		/**
		 * 工程再展開する場合のチェックコンテナ（各種明細）の作成
		 */
		protected void setChkContainerReExp(
				MCList<MfgInstReg_Chk01_HdrR> hdrL, MCList<MfgInstReg_Chk01_DtlOperR> operL, MCList<MfgInstReg_Chk01_DtlInptR> inptL,
				MCList<MfgInstReg_Chk01_DtlWkR> wkL, MCList<MfgInstReg_Chk01_DtlYieldR> yieldL, MCList<MfgInstReg_Chk01_DtlByProdR> byProdL){
			MSBCL_ReExpService.ReExp_Sprt05 ope = MSBCL_ReExpService.crtReExp_Sprt05();
			addAll(ope.up0(), hdrL, createMap_ReExp_Sprt05_HdrR_MfgInstReg_Chk01_HdrR());

			ope.exec();

			addAll(operL, ope.down0(), createMap_MfgInstReg_Chk01_DtlOperR_ReExp_Sprt05_RsltOperR());
			addAll(inptL, ope.down2(), createMap_MfgInstReg_Chk01_DtlInptR_ReExp_Sprt01_RsltInptR());
			addAll(wkL, ope.down4(), createMap_MfgInstReg_Chk01_DtlWkR_ReExp_Sprt02_RsltWkR());
			addAll(yieldL, ope.down1(), createMap_MfgInstReg_Chk01_DtlYieldR_ReExp_Sprt03_RsltYieldR());
			addAll(byProdL, ope.down3(), createMap_MfgInstReg_Chk01_DtlByProdR_ReExp_Sprt01_RsltByProdR());
		}

		/**
		 * 工程再展開しない場合のチェックコンテナ（各種明細）の作成
		 */
		protected MCNumber setChkContainerNoExp(MCList<MfgInstReg_Chk01_HdrR> hdrL,
				MCList<MfgInstReg_Chk01_DtlOperR> operL,
				MCList<MfgInstReg_Chk01_DtlInptR> inptL,
				MCList<MfgInstReg_Chk01_DtlWkR> wkL,
				MCList<MfgInstReg_Chk01_DtlYieldR> yieldL,
				MCList<MfgInstReg_Chk01_DtlByProdR> byProdL, MCNumber tmpOperPegNo) {
			
			MCList<MST_OPER_ORDER_R> ooL = getOperOrd(hdrL);
			MCIndexKey ookey = ooL.createIndex(MST_OPER_ORDER_R.$itm_ord_no);
			
			MCNumber operPegNo = tmpOperPegNo;
			for (MfgInstReg_Chk01_HdrR hdrR : hdrL) {
				MCList<MST_OPER_ORDER_R> subOoL = ooL.subList(ookey,hdrR.itm_ord_no());

				for (MST_OPER_ORDER_R ooR : subOoL) {
					operPegNo = operPegNo.add(MCNumber.ONE);
					
					MfgInstReg_Chk01_DtlOperR chk01OperR = MfgInstReg_Chk01_DtlOperR.create();
					copy(chk01OperR, ooR, createMap_MfgInstReg_Chk01_DtlOperR_MST_OPER_ORDER_R());
					if (isSame(hdrR.mfg_loc_cd(), chk01OperR.oper_loc_cd())) {
						chk01OperR.oper_str_ln_cd(hdrR.mfg_str_ln_cd());
					}
					chk01OperR.hdr_peg_no(hdrR.peg_no());
					chk01OperR.peg_no(operPegNo);
					operL.add(chk01OperR);
				}
			}

			if (!operL.isEmpty()) {
				MSBCL_ReExpService.ReExp_Sprt04 ope = MSBCL_ReExpService.crtReExp_Sprt04();
				addAll(ope.up0(), hdrL, createMap_ReExp_Sprt04_HdrR_MfgInstReg_Chk01_HdrR());
				addAll(ope.up1(), operL, createMap_ReExp_Sprt04_DtlOperR_MfgInstReg_Chk01_DtlOperR());

				ope.exec();

				addAll(inptL, ope.down1(), createMap_MfgInstReg_Chk01_DtlInptR_ReExp_Sprt01_RsltInptR());
				addAll(wkL, ope.down3(), createMap_MfgInstReg_Chk01_DtlWkR_ReExp_Sprt02_RsltWkR());
				addAll(yieldL, ope.down0(), createMap_MfgInstReg_Chk01_DtlYieldR_ReExp_Sprt03_RsltYieldR());
				addAll(byProdL, ope.down2(), createMap_MfgInstReg_Chk01_DtlByProdR_ReExp_Sprt01_RsltByProdR());
			}
			return operPegNo;
		}
		
		/**
		 * 更新場合のチェックコンテナ（各種明細）の作成
		 */
		protected void setChkContainerUpd(MCList<MfgInstReg_Chk01_HdrR> hdrL,
				MCList<MfgInstReg_Chk01_DtlOperR> operL,
				MCList<MfgInstReg_Chk01_DtlInptR> inptL,
				MCList<MfgInstReg_Chk01_DtlWkR> wkL,
				MCList<MfgInstReg_Chk01_DtlYieldR> yieldL,
				MCList<MfgInstReg_Chk01_DtlByProdR> byProdL, MCNumber tmpOperPegNo) {

			MCList<MfgInstReg_Chk01_HdrR> bindL = hdrL.groupBy(MfgInstReg_Upd02_Hdr1R.$mfg_inst_no);
			
			MCList<MST_OPER_INST_R> oiL = getOperInst(bindL);
			MCList<MST_INPT_SCHD_R> isL = getInptSchd(bindL);
			MCList<MST_WK_SCHD_R> wsL = getWkSchd(bindL);
			MCList<MST_YIELD_SCHD_R> ysL = getYieldSchd(bindL);
			
			MCIndexKey oiKey = oiL.createIndex(MST_OPER_INST_R.$mfg_inst_no);
			
			// 工程コンテナ
			MCNumber operPegNo = tmpOperPegNo;
			for (MfgInstReg_Chk01_HdrR hdrR : hdrL) {
				MCList<MST_OPER_INST_R> oiSubL = oiL.subList(oiKey, hdrR.mfg_inst_no());
				
				for (MST_OPER_INST_R oiR : oiSubL) {
					operPegNo = operPegNo.add(MCNumber.ONE);
					
					MfgInstReg_Chk01_DtlOperR chk01OperR = MfgInstReg_Chk01_DtlOperR.create();
					copy(chk01OperR, oiR, createMap_MfgInstReg_Chk01_DtlOperR_MST_OPER_INST_R());
					chk01OperR.hdr_peg_no(hdrR.peg_no());
					chk01OperR.peg_no(operPegNo);
					operL.add(chk01OperR);
				}
			}
			
			MCIndexKey isKey = isL.createIndex(MST_INPT_SCHD_R.$oper_inst_no);
			MCIndexKey wsKey = wsL.createIndex(MST_WK_SCHD_R.$oper_inst_no);
			MCIndexKey ysKey = ysL.createIndex(MST_YIELD_SCHD_R.$oper_inst_no);
			for (MfgInstReg_Chk01_DtlOperR operR : operL) {
				// 投入コンテナ
				MCList<MST_INPT_SCHD_R> isSubL = isL.subList(isKey, operR.oper_inst_no());
				for (MST_INPT_SCHD_R isR : isSubL) {
					MfgInstReg_Chk01_DtlInptR chk01InptR = MfgInstReg_Chk01_DtlInptR.create();
					copy(chk01InptR, isR, createMap_MfgInstReg_Chk01_DtlInptR_MST_INPT_SCHD_R());
					chk01InptR.hdr_peg_no(operR.hdr_peg_no());
					chk01InptR.oper_peg_no(operR.peg_no());
					inptL.add(chk01InptR);
				}
				
				// 工数コンテナ
				MCList<MST_WK_SCHD_R> wsSubL = wsL.subList(wsKey, operR.oper_inst_no());
				for (MST_WK_SCHD_R wsR : wsSubL) {
					MfgInstReg_Chk01_DtlWkR chk01WkR = MfgInstReg_Chk01_DtlWkR.create();
					copy(chk01WkR, wsR, createMap_MfgInstReg_Chk01_DtlWkR_MST_WK_SCHD_R());
					chk01WkR.hdr_peg_no(operR.hdr_peg_no());
					chk01WkR.oper_peg_no(operR.peg_no());
					wkL.add(chk01WkR);
				}
				
				// 出来高コンテナ
				MCList<MST_YIELD_SCHD_R> ysSubL = ysL
						.subList(ysKey, operR.oper_inst_no())
						.subList(MST_YIELD_SCHD_R.$yield_typ, MAC_YIELD_TYP.GOOD.value());
				for (MST_YIELD_SCHD_R ysR : ysSubL) {
					MfgInstReg_Chk01_DtlYieldR chk01YieldR = MfgInstReg_Chk01_DtlYieldR.create();
					copy(chk01YieldR, ysR, createMap_MfgInstReg_Chk01_DtlYieldR_MST_YIELD_SCHD_R());
					chk01YieldR.hdr_peg_no(operR.hdr_peg_no());
					chk01YieldR.oper_peg_no(operR.peg_no());
					yieldL.add(chk01YieldR);
				}
				
				// 副産品コンテナ
				MCList<MST_YIELD_SCHD_R> byProdSubL = ysL
						.subList(ysKey, operR.oper_inst_no())
						.subList(MST_YIELD_SCHD_R.$yield_typ, MAC_YIELD_TYP.BYPROD.value());
				for (MST_YIELD_SCHD_R byProdR : byProdSubL) {
					MfgInstReg_Chk01_DtlByProdR chk01ByProdR = MfgInstReg_Chk01_DtlByProdR.create();
					copy(chk01ByProdR, byProdR, createMap_MfgInstReg_Chk01_DtlByProdR_MST_YIELD_SCHD_R());
					chk01ByProdR.hdr_peg_no(operR.hdr_peg_no());
					chk01ByProdR.oper_peg_no(operR.peg_no());
					byProdL.add(chk01ByProdR);
				}
			}
		}

		/**
		 * 工程再展開を行うか否か
		 */
		protected boolean isReExtReq(MfgInstReg_Chk01_HdrR chk01HdrR, MST_ITM_ORDER_R ioR) {
			// 製造場所、工程パタン、構成パタン、製造指図数量、出来高予定数量、手配ＮＯ１～４、着手予定日
			// ※製造指図登録画面、製造指図一覧登録画面のクライアントにも同様の内容があるため、項目を変更する場合は注意すること
			if (isSame(chk01HdrR.mfg_loc_cd(), ioR.mfg_loc_cd())
					&& isSame(chk01HdrR.oper_ptn(), ioR.oper_ptn())
					&& isSame(chk01HdrR.bom_ptn(), ioR.bom_ptn())
					&& isSame(chk01HdrR.base_unit_inst_qty(), ioR.not_inst_qty())
					&& isSame(chk01HdrR.base_unit_yield_qty(), ioR.yield_schd_qty())
					&& isSame(chk01HdrR.sno1(), ioR.sno1()) && isSame(chk01HdrR.sno2(), ioR.sno2())
					&& isSame(chk01HdrR.sno3(), ioR.sno3()) && isSame(chk01HdrR.sno4(), ioR.sno4())
					&& isSame(chk01HdrR.st_schd_tm().startTimeOfDay(), ioR.mfg_st_schd_dt())) {
				return false;
			}
			return true;
		}
		
		//----------------------------------- チェック処理呼び出しのコンテナ作成-------------------------------------
		
		// ヘッダコンテナの作成（新規で工程展開する場合、新規で工程展開しない場合、更新共通）
		protected Map_MfgInstReg_Chk01_HdrR_MfgInstReg_Upd02_Hdr1R<MfgInstReg_Chk01_HdrR,MfgInstReg_Upd02_Hdr1R> createMap_MfgInstReg_Chk01_HdrR_MfgInstReg_Upd02_Hdr1R() {
			return new Map_MfgInstReg_Chk01_HdrR_MfgInstReg_Upd02_Hdr1R<MfgInstReg_Chk01_HdrR, MfgInstReg_Upd02_Hdr1R>();
		}

		public class Map_MfgInstReg_Chk01_HdrR_MfgInstReg_Upd02_Hdr1R<D extends MfgInstReg_Chk01_HdrR, S extends MfgInstReg_Upd02_Hdr1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$peg_no, MfgInstReg_Upd02_Hdr1R.$peg_no);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$mfg_sts_typ, MfgInstReg_Upd02_Hdr1R.$mfg_sts_typ);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$mfg_loc_cd, MfgInstReg_Upd02_Hdr1R.$mfg_loc_cd);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$strg_loc_cd, MfgInstReg_Upd02_Hdr1R.$strg_loc_cd);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$bom_ptn, MfgInstReg_Upd02_Hdr1R.$bom_ptn);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$base_unit_inst_qty, MfgInstReg_Upd02_Hdr1R.$base_unit_inst_qty);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$base_unit_yield_qty, MfgInstReg_Upd02_Hdr1R.$base_unit_yield_qty);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$inst_dt, MfgInstReg_Upd02_Hdr1R.$inst_dt);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$inst_usr_cd, MfgInstReg_Upd02_Hdr1R.$inst_usr_cd);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$inst_dpt_cd, MfgInstReg_Upd02_Hdr1R.$inst_dpt_cd);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$rqst_dlv_rqst_tm, MfgInstReg_Upd02_Hdr1R.$rqst_dlv_rqst_tm);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$st_schd_tm, MfgInstReg_Upd02_Hdr1R.$st_schd_tm);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$end_schd_tm, MfgInstReg_Upd02_Hdr1R.$end_schd_tm);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$oper_ptn, MfgInstReg_Upd02_Hdr1R.$oper_ptn);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$lot_no, MfgInstReg_Upd02_Hdr1R.$lot_no);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$sublot_no, MfgInstReg_Upd02_Hdr1R.$sublot_no);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$sno1, MfgInstReg_Upd02_Hdr1R.$sno1);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$sno2, MfgInstReg_Upd02_Hdr1R.$sno2);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$sno3, MfgInstReg_Upd02_Hdr1R.$sno3);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$sno4, MfgInstReg_Upd02_Hdr1R.$sno4);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$mfg_str_ln_cd, MfgInstReg_Upd02_Hdr1R.$mfg_str_ln_cd);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$strg_str_ln_cd, MfgInstReg_Upd02_Hdr1R.$strg_str_ln_cd);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$po_locked_flg, MfgInstReg_Upd02_Hdr1R.$po_locked_flg);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$inst_rpt_rmrks, MfgInstReg_Upd02_Hdr1R.$inst_rpt_rmrks);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$intr_rmrks, MfgInstReg_Upd02_Hdr1R.$intr_rmrks);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$disp_pd, MfgInstReg_Upd02_Hdr1R.$disp_pd);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$mfg_inst_no, MfgInstReg_Upd02_Hdr1R.$mfg_inst_no);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$inst_immed_prnt_flg, MfgInstReg_Upd02_Hdr1R.$inst_immed_prnt_flg);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$itm_mfg_inst_no, MfgInstReg_Upd02_Hdr1R.$itm_mfg_inst_no);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$itm_ord_no, MfgInstReg_Upd02_Hdr1R.$itm_ord_no);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$ord_abort_flg, MfgInstReg_Upd02_Hdr1R.$ord_abort_flg);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$itm_mfg_inst_sub_char1, MfgInstReg_Upd02_Hdr1R.$itm_mfg_inst_sub_char1);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$itm_mfg_inst_sub_char2, MfgInstReg_Upd02_Hdr1R.$itm_mfg_inst_sub_char2);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$itm_mfg_inst_sub_char3, MfgInstReg_Upd02_Hdr1R.$itm_mfg_inst_sub_char3);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$mfg_inst_sub_char1, MfgInstReg_Upd02_Hdr1R.$mfg_inst_sub_char1);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$mfg_inst_sub_char2, MfgInstReg_Upd02_Hdr1R.$mfg_inst_sub_char2);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$mfg_inst_sub_char3, MfgInstReg_Upd02_Hdr1R.$mfg_inst_sub_char3);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$itm_ord_upd_cntr, MfgInstReg_Upd02_Hdr1R.$itm_ord_upd_cntr);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$itm_mfg_inst_upd_cntr, MfgInstReg_Upd02_Hdr1R.$itm_mfg_inst_upd_cntr);
				addColumnPathMap(MfgInstReg_Chk01_HdrR.$mfg_inst_upd_cntr, MfgInstReg_Upd02_Hdr1R.$mfg_inst_upd_cntr);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.lst_reg_flg(true);
				dest.is_src_batch_flg(up0().is_src_batch_flg());
				dest.upd_cntr_chk_flg(up0().upd_cntr_chk_flg());
			}
		}
		
		// 新規登録時に品目オーダの値をヘッダコンテナにコピーする
		protected void editChk01HdrByIoR(MfgInstReg_Chk01_HdrR chk01HdrR, MST_ITM_ORDER_R ioR){
			chk01HdrR.master_dt(ioR.master_dt());
			chk01HdrR.itm_cd(ioR.itm_cd());
			chk01HdrR.itm_sub1(ioR.itm_sub1());
			chk01HdrR.itm_sub2(ioR.itm_sub2());
			chk01HdrR.itm_sub3(ioR.itm_sub3());
			chk01HdrR.inst_po_cnt_rmrks(ioR.inst_po_cnt_rmrks());
			
			if (MSC_ITM_ORD_TYP.isMFG(ioR.itm_ord_typ())) {
				chk01HdrR.mfg_mtd_typ(MSC_MFG_MTD_TYP.INTNL.value());
			}
			else {
				chk01HdrR.mfg_mtd_typ(MSC_MFG_MTD_TYP.EXTNL.value());
			}
		}
		
		// 更新時に品目製造指図・製造指図の値をヘッダコンテナにコピーする
		protected void editChk01HdrByImiR(MfgInstReg_Chk01_HdrR chk01HdrR, MST_ITM_MFG_INST_R imiR, MST_MFG_INST_R miR) {
			chk01HdrR.mfg_mtd_typ(imiR.mfg_mtd_typ());
			chk01HdrR.master_dt(imiR.master_dt());
			chk01HdrR.itm_cd(imiR.itm_cd());
			chk01HdrR.itm_sub1(imiR.itm_sub1());
			chk01HdrR.itm_sub2(imiR.itm_sub2());
			chk01HdrR.itm_sub3(imiR.itm_sub3());
			chk01HdrR.inst_po_cnt_rmrks(miR.inst_po_cnt_rmrks());
			chk01HdrR.mfg_inst_rev(miR.mfg_inst_rev());
		}
		
		// 工程コンテナの作成（新規で工程再展開する場合）
		protected Map_MfgInstReg_Chk01_DtlOperR_ReExp_Sprt05_RsltOperR<MfgInstReg_Chk01_DtlOperR,ReExp_Sprt05_RsltOperR> createMap_MfgInstReg_Chk01_DtlOperR_ReExp_Sprt05_RsltOperR() {
			return new Map_MfgInstReg_Chk01_DtlOperR_ReExp_Sprt05_RsltOperR<MfgInstReg_Chk01_DtlOperR, ReExp_Sprt05_RsltOperR>();
		}

		public class Map_MfgInstReg_Chk01_DtlOperR_ReExp_Sprt05_RsltOperR<D extends MfgInstReg_Chk01_DtlOperR, S extends ReExp_Sprt05_RsltOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$hdr_peg_no, ReExp_Sprt05_RsltOperR.$hdr_peg_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$peg_no, ReExp_Sprt05_RsltOperR.$peg_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_cd, ReExp_Sprt05_RsltOperR.$oper_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_seq, ReExp_Sprt05_RsltOperR.$oper_seq);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$st_schd_tm, ReExp_Sprt05_RsltOperR.$st_schd_tm);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$end_schd_tm, ReExp_Sprt05_RsltOperR.$end_schd_tm);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$base_unit_qty, ReExp_Sprt05_RsltOperR.$base_unit_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_loc_cd, ReExp_Sprt05_RsltOperR.$oper_loc_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_str_ln_cd, ReExp_Sprt05_RsltOperR.$oper_str_ln_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$disp_seq, ReExp_Sprt05_RsltOperR.$disp_seq);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$bkf_flg, ReExp_Sprt05_RsltOperR.$bkf_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$wk_cost_calc_flg, ReExp_Sprt05_RsltOperR.$wk_cost_calc_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_ord_no, ReExp_Sprt05_RsltOperR.$oper_ord_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.tgt_oper_flg(true);
			}
		}

		// 工程コンテナの作成（新規で工程再展開しない場合）
		protected Map_MfgInstReg_Chk01_DtlOperR_MST_OPER_ORDER_R<MfgInstReg_Chk01_DtlOperR,MST_OPER_ORDER_R> createMap_MfgInstReg_Chk01_DtlOperR_MST_OPER_ORDER_R() {
			return new Map_MfgInstReg_Chk01_DtlOperR_MST_OPER_ORDER_R<MfgInstReg_Chk01_DtlOperR, MST_OPER_ORDER_R>();
		}

		public class Map_MfgInstReg_Chk01_DtlOperR_MST_OPER_ORDER_R<D extends MfgInstReg_Chk01_DtlOperR, S extends MST_OPER_ORDER_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_cd, MST_OPER_ORDER_R.$oper_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_seq, MST_OPER_ORDER_R.$oper_seq);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$st_schd_tm, MST_OPER_ORDER_R.$st_schd_tm);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$end_schd_tm, MST_OPER_ORDER_R.$end_schd_tm);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$base_unit_qty, MST_OPER_ORDER_R.$not_oper_schd_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_loc_cd, MST_OPER_ORDER_R.$loc_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$disp_seq, MST_OPER_ORDER_R.$disp_seq);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_ptn, MST_OPER_ORDER_R.$oper_ptn);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$yield_oper_flg, MST_OPER_ORDER_R.$yield_oper_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_ord_no, MST_OPER_ORDER_R.$oper_ord_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_rsrc, MST_OPER_ORDER_R.$oper_rsrc);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.tgt_oper_flg(true);
				dest.bkf_flg(src.getBooleanNE("BKF_FLG"));
				if (MSC_ITM_ORD_TYP.isOUTSRC(src.getStringNE("ITM_ORD_TYP"))) {
					dest.wk_cost_calc_flg(false);
				}
				else {
					dest.wk_cost_calc_flg(true);
				}
				dest.oper_inst_grp(src.getStringNE("OPER_INST_GRP"));
				dest.yield_oper_ratio(nvl(src.getNumberNE("YIELD_OPER_RATIO"), MCNumber.ONE));
			}
		}
		
		// 工程オーダの取得
		protected MCList<MST_OPER_ORDER_R> getOperOrd(
				MCList<MfgInstReg_Chk01_HdrR> hdrL) {
			MCList<MfgInstReg_Chk01_HdrR> bindL = hdrL
					.groupBy(MfgInstReg_Chk01_HdrR.$itm_ord_no);

			MCList<MST_OPER_ORDER_R> operOrdL = MCList.create(MST_OPER_ORDER_R.class);
			MST_OPER_ORDER_R t = MST_OPER_ORDER_R.create("T");
			MCQueryApiBuilder operOrdL_bldr = MCQueryApiBuilder.create(t);
			MST_ITM_ORDER_R t2 = MST_ITM_ORDER_R.create("T2");
			MAM_ITM_OPER_R m1 = MAM_ITM_OPER_R.create("M1");
			MAVM_ITM_DTL_MFG_R m2 = MAVM_ITM_DTL_MFG_R.create("M2");
			operOrdL_bldr.setSelect(t.itm_ord_no, t.oper_cd, t.oper_seq, t.disp_seq,
					t.oper_ptn, t.st_schd_tm, t.end_schd_tm, t.not_oper_schd_qty,
					t.yield_oper_flg, t.loc_cd, t.oper_ord_no, t.oper_rsrc);

			operOrdL.addBooleanColumn("BKF_FLG");
			operOrdL_bldr.addSelect(m1.oper_inst_grp, m1.yield_oper_ratio, m2.bkf_flg,
					t2.itm_ord_typ);

			operOrdL_bldr.addInnerJoin(t2, bracket(t.itm_ord_no.eq(t2.itm_ord_no)));
			operOrdL_bldr.addLeftOuterJoin(m1, bracket(t2.itm_cd.eq(m1.itm_cd)
					.and(t2.itm_sub1.eq(m1.itm_sub1))
					.and(t2.itm_sub2.eq(m1.itm_sub2))
					.and(t2.itm_sub3.eq(m1.itm_sub3))
					.and(t2.mst_mfg_loc_cd.eq(m1.loc_cd))
					.and(t.oper_ptn.eq(m1.oper_ptn))
					.and(t.oper_cd.eq(m1.oper_cd))
					.and(t.oper_seq.eq(m1.oper_seq))
					.and(t2.mfg_st_schd_dt.between(m1.st_dt, m1.end_dt))));
			operOrdL_bldr.addLeftOuterJoin(m2, bracket(t2.itm_cd.eq(m2.itm_cd)
					.and(t2.itm_sub1.eq(m2.itm_sub1))
					.and(t2.itm_sub2.eq(m2.itm_sub2))
					.and(t2.itm_sub3.eq(m2.itm_sub3))
					.and(t2.mfg_loc_cd.eq(m2.mfg_loc_cd))
					.and(t2.sppl_cd.eq(m2.sppl_cd))
					.and(t2.maker_cd.eq(m2.maker_cd))
					.and(t2.rqst_loc_cd.eq(m2.rqst_loc_cd))
					.and(t2.wg_cd.eq(m2.wg_cd))
					.and(t2.bom_ptn.eq(m2.bom_ptn))
					.and(t2.master_dt.between(m2.st_dt, m2.end_dt))));
			operOrdL_bldr.setWhere(t.itm_ord_no.eq(bind("itm_ord_no")));
			operOrdL_bldr.setOrderByAsc(t2.mfg_st_schd_dt, t2.itm_ord_typ, t2.itm_ord_no, t.disp_seq);
			dbSelect("MSBCL6000_MST_OPER_ORDER_S02", operOrdL, operOrdL_bldr, bindL);
			return operOrdL;
		}
		
		// 工程コンテナの作成（更新の場合）
		protected Map_MfgInstReg_Chk01_DtlOperR_MST_OPER_INST_R<MfgInstReg_Chk01_DtlOperR,MST_OPER_INST_R> createMap_MfgInstReg_Chk01_DtlOperR_MST_OPER_INST_R() {
			return new Map_MfgInstReg_Chk01_DtlOperR_MST_OPER_INST_R<MfgInstReg_Chk01_DtlOperR, MST_OPER_INST_R>();
		}

		public class Map_MfgInstReg_Chk01_DtlOperR_MST_OPER_INST_R<D extends MfgInstReg_Chk01_DtlOperR, S extends MST_OPER_INST_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_cd, MST_OPER_INST_R.$oper_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_seq, MST_OPER_INST_R.$oper_seq);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$st_schd_tm, MST_OPER_INST_R.$st_schd_tm);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$end_schd_tm, MST_OPER_INST_R.$end_schd_tm);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$base_unit_qty, MST_OPER_INST_R.$base_unit_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_loc_cd, MST_OPER_INST_R.$oper_loc_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_str_ln_cd, MST_OPER_INST_R.$oper_str_ln_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$usr_cd, MST_OPER_INST_R.$usr_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_abort_flg, MST_OPER_INST_R.$oper_abort_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$disp_seq, MST_OPER_INST_R.$disp_seq);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$intr_rmrks, MST_OPER_INST_R.$intr_rmrks);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$inst_rpt_rmrks, MST_OPER_INST_R.$inst_rpt_rmrks);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$sub_char1, MST_OPER_INST_R.$sub_char1);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$sub_char2, MST_OPER_INST_R.$sub_char2);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$sub_char3, MST_OPER_INST_R.$sub_char3);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$bkf_flg, MST_OPER_INST_R.$bkf_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$wk_cost_calc_flg, MST_OPER_INST_R.$wk_cost_calc_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_inst_grp, MST_OPER_INST_R.$oper_inst_grp);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_ord_no, MST_OPER_INST_R.$oper_ord_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_inst_no, MST_OPER_INST_R.$oper_inst_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$unschd_act_flg, MST_OPER_INST_R.$unschd_act_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$mes_flg, MST_OPER_INST_R.$mes_flg);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.tgt_oper_flg(true);
			}
		}
		
		// 工程指図の取得
		protected MCList<MST_OPER_INST_R> getOperInst(
				MCList<MfgInstReg_Chk01_HdrR> bindL) {
			//テーブルから取得
			MCList<MST_OPER_INST_R> oiL = MCList.create(MST_OPER_INST_R.class);
			MST_OPER_INST_R t = MST_OPER_INST_R.create("T");
			MCQueryApiBuilder oiL_bldr = MCQueryApiBuilder.create(t);
			oiL_bldr.setSelect(t.mfg_inst_no, t.oper_cd, t.oper_seq, t.st_schd_tm,
					t.end_schd_tm, t.base_unit_qty, t.oper_loc_cd, t.oper_str_ln_cd,
					t.usr_cd, t.oper_abort_flg, t.disp_seq, t.intr_rmrks,
					t.inst_rpt_rmrks, t.sub_char1, t.sub_char2, t.sub_char3, t.bkf_flg,
					t.wk_cost_calc_flg, t.oper_inst_grp, t.oper_ord_no, t.oper_inst_no,
					t.unschd_act_flg);
			oiL_bldr.addSelect(t.mes_flg);
			oiL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			oiL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6000_MST_OPER_INST_S05", oiL, oiL_bldr, bindL);

			return oiL;
		}
		
		// 投入コンテナの作成（新規で工程再展開する場合、しない場合共通）
		protected Map_MfgInstReg_Chk01_DtlInptR_ReExp_Sprt01_RsltInptR<MfgInstReg_Chk01_DtlInptR,ReExp_Sprt01_RsltInptR> createMap_MfgInstReg_Chk01_DtlInptR_ReExp_Sprt01_RsltInptR() {
			return new Map_MfgInstReg_Chk01_DtlInptR_ReExp_Sprt01_RsltInptR<MfgInstReg_Chk01_DtlInptR, ReExp_Sprt01_RsltInptR>();
		}

		public class Map_MfgInstReg_Chk01_DtlInptR_ReExp_Sprt01_RsltInptR<D extends MfgInstReg_Chk01_DtlInptR, S extends ReExp_Sprt01_RsltInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$hdr_peg_no, ReExp_Sprt01_RsltInptR.$hdr_peg_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$oper_peg_no, ReExp_Sprt01_RsltInptR.$oper_peg_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alt_grp_cd, ReExp_Sprt01_RsltInptR.$alt_grp_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alt_grp_seq, ReExp_Sprt01_RsltInptR.$alt_grp_seq);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$itm_cd, ReExp_Sprt01_RsltInptR.$itm_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$itm_sub1, ReExp_Sprt01_RsltInptR.$itm_sub1);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$itm_sub2, ReExp_Sprt01_RsltInptR.$itm_sub2);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$itm_sub3, ReExp_Sprt01_RsltInptR.$itm_sub3);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$ver_no, ReExp_Sprt01_RsltInptR.$ver_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$base_unit_alt_qty, ReExp_Sprt01_RsltInptR.$alt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$base_unit_inpt_qty, ReExp_Sprt01_RsltInptR.$inpt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$base_unit_rqmt_qty, ReExp_Sprt01_RsltInptR.$rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$base_unit_fxd_rqmt_qty, ReExp_Sprt01_RsltInptR.$fxd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$cont_inpt_qty, ReExp_Sprt01_RsltInptR.$cont_inpt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$cont_rqmt_qty, ReExp_Sprt01_RsltInptR.$cont_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$cont_fxd_rqmt_qty, ReExp_Sprt01_RsltInptR.$cont_fxd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$schd_tm, ReExp_Sprt01_RsltInptR.$inpt_schd_dt);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$inst_lot_fix_flg, ReExp_Sprt01_RsltInptR.$inst_lot_fix_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$lot_no, ReExp_Sprt01_RsltInptR.$lot_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sublot_no, ReExp_Sprt01_RsltInptR.$sublot_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno1, ReExp_Sprt01_RsltInptR.$sno1);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno1_null_flg, ReExp_Sprt01_RsltInptR.$sno1_null_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno2, ReExp_Sprt01_RsltInptR.$sno2);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno2_null_flg, ReExp_Sprt01_RsltInptR.$sno2_null_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno3, ReExp_Sprt01_RsltInptR.$sno3);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno3_null_flg, ReExp_Sprt01_RsltInptR.$sno3_null_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno4, ReExp_Sprt01_RsltInptR.$sno4);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno4_null_flg, ReExp_Sprt01_RsltInptR.$sno4_null_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alloc_sno1, ReExp_Sprt01_RsltInptR.$sno1);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alloc_sno2, ReExp_Sprt01_RsltInptR.$sno2);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alloc_sno3, ReExp_Sprt01_RsltInptR.$sno3);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alloc_sno4, ReExp_Sprt01_RsltInptR.$sno4);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$inpt_loc_cd, ReExp_Sprt01_RsltInptR.$inpt_loc_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$inpt_str_ln_cd, ReExp_Sprt01_RsltInptR.$inpt_str_ln_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$gd_cd, ReExp_Sprt01_RsltInptR.$gd_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$bkf_typ, ReExp_Sprt01_RsltInptR.$bkf_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$par_inst_qty, ReExp_Sprt01_RsltInptR.$par_inst_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$chd_inpt_qty, ReExp_Sprt01_RsltInptR.$chd_inpt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$chd_rqmt_qty, ReExp_Sprt01_RsltInptR.$chd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$fxd_chd_rqmt_qty, ReExp_Sprt01_RsltInptR.$fxd_chd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$main_itm_flg, ReExp_Sprt01_RsltInptR.$main_itm_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$bom_id_no, ReExp_Sprt01_RsltInptR.$bom_id);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$chd_itm_seq, ReExp_Sprt01_RsltInptR.$itm_seq);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$bom_memo1, ReExp_Sprt01_RsltInptR.$bom_memo1);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$bom_memo2, ReExp_Sprt01_RsltInptR.$bom_memo2);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$bom_memo3, ReExp_Sprt01_RsltInptR.$bom_memo3);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$yield_calc_flg, ReExp_Sprt01_RsltInptR.$yield_calc_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alloc_ctl_typ, ReExp_Sprt01_RsltInptR.$alloc_ctl_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$inpt_ctl_typ, ReExp_Sprt01_RsltInptR.$inpt_ctl_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$in_offst_typ, ReExp_Sprt01_RsltInptR.$in_offst_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$in_offst, ReExp_Sprt01_RsltInptR.$in_offst);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$lot_mix_flg, ReExp_Sprt01_RsltInptR.$lot_mix_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sublot_mix_flg, ReExp_Sprt01_RsltInptR.$sublot_mix_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$prov_typ, ReExp_Sprt01_RsltInptR.$prov_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alt_itm_typ, ReExp_Sprt01_RsltInptR.$alt_itm_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alt_alloc_prio, ReExp_Sprt01_RsltInptR.$alt_alloc_prio);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alt_itm_ratio, ReExp_Sprt01_RsltInptR.$alt_itm_ratio);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$disp_seq, ReExp_Sprt01_RsltInptR.$disp_seq);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (src.inst_lot_fix_flg()) {
					dest.no_lot_fix_flg(false);
				}
				else {
					dest.no_lot_fix_flg(true);
				}
				if (MAC_ALLOC_CTL_TYP.isALLOC_INST_NG(src.alloc_ctl_typ()) || MAC_ALLOC_CTL_TYP.isALLOC_INST_OK(src.alloc_ctl_typ())) {
					dest.alloc_flg(true);
				}
			}
		}
		
		// 投入コンテナの作成（更新の場合）
		protected Map_MfgInstReg_Chk01_DtlInptR_MST_INPT_SCHD_R<MfgInstReg_Chk01_DtlInptR,MST_INPT_SCHD_R> createMap_MfgInstReg_Chk01_DtlInptR_MST_INPT_SCHD_R() {
			return new Map_MfgInstReg_Chk01_DtlInptR_MST_INPT_SCHD_R<MfgInstReg_Chk01_DtlInptR, MST_INPT_SCHD_R>();
		}

		public class Map_MfgInstReg_Chk01_DtlInptR_MST_INPT_SCHD_R<D extends MfgInstReg_Chk01_DtlInptR, S extends MST_INPT_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alt_grp_cd, MST_INPT_SCHD_R.$alt_grp_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alt_grp_seq, MST_INPT_SCHD_R.$alt_grp_seq);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alt_itm_fix_flg, MST_INPT_SCHD_R.$alt_itm_fix_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$itm_cd, MST_INPT_SCHD_R.$itm_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$itm_sub1, MST_INPT_SCHD_R.$itm_sub1);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$itm_sub2, MST_INPT_SCHD_R.$itm_sub2);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$itm_sub3, MST_INPT_SCHD_R.$itm_sub3);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$ver_no, MST_INPT_SCHD_R.$ver_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$base_unit_alt_qty, MST_INPT_SCHD_R.$base_unit_alt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$base_unit_inpt_qty, MST_INPT_SCHD_R.$base_unit_inpt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$base_unit_rqmt_qty, MST_INPT_SCHD_R.$base_unit_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$base_unit_fxd_rqmt_qty, MST_INPT_SCHD_R.$base_unit_fxd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$cont_inpt_qty, MST_INPT_SCHD_R.$cont_inpt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$cont_rqmt_qty, MST_INPT_SCHD_R.$cont_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$cont_fxd_rqmt_qty, MST_INPT_SCHD_R.$cont_fxd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$schd_tm, MST_INPT_SCHD_R.$schd_tm);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$inst_lot_fix_flg, MST_INPT_SCHD_R.$inst_lot_fix_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno1, MST_INPT_SCHD_R.$sno1);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno1_null_flg, MST_INPT_SCHD_R.$sno1_null_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno2, MST_INPT_SCHD_R.$sno2);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno2_null_flg, MST_INPT_SCHD_R.$sno2_null_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno3, MST_INPT_SCHD_R.$sno3);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno3_null_flg, MST_INPT_SCHD_R.$sno3_null_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno4, MST_INPT_SCHD_R.$sno4);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno4_null_flg, MST_INPT_SCHD_R.$sno4_null_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$inpt_loc_cd, MST_INPT_SCHD_R.$inpt_loc_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$inpt_str_ln_cd, MST_INPT_SCHD_R.$inpt_str_ln_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$gd_cd, MST_INPT_SCHD_R.$gd_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$inpt_rsn_cd, MST_INPT_SCHD_R.$inpt_rsn_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$intr_rmrks, MST_INPT_SCHD_R.$intr_rmrks);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$inst_rpt_rmrks, MST_INPT_SCHD_R.$inst_rpt_rmrks);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sub_char1, MST_INPT_SCHD_R.$sub_char1);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sub_char2, MST_INPT_SCHD_R.$sub_char2);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sub_char3, MST_INPT_SCHD_R.$sub_char3);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$bkf_typ, MST_INPT_SCHD_R.$bkf_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$par_inst_qty, MST_INPT_SCHD_R.$par_inst_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$chd_inpt_qty, MST_INPT_SCHD_R.$chd_inpt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$chd_rqmt_qty, MST_INPT_SCHD_R.$chd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$fxd_chd_rqmt_qty, MST_INPT_SCHD_R.$fxd_chd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$main_itm_flg, MST_INPT_SCHD_R.$main_itm_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$bom_id_no, MST_INPT_SCHD_R.$bom_id_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$chd_itm_seq, MST_INPT_SCHD_R.$chd_itm_seq);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$bom_memo1, MST_INPT_SCHD_R.$bom_memo1);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$bom_memo2, MST_INPT_SCHD_R.$bom_memo2);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$bom_memo3, MST_INPT_SCHD_R.$bom_memo3);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$yield_calc_flg, MST_INPT_SCHD_R.$yield_calc_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alloc_ctl_typ, MST_INPT_SCHD_R.$alloc_ctl_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$inpt_ctl_typ, MST_INPT_SCHD_R.$inpt_ctl_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$in_offst_typ, MST_INPT_SCHD_R.$in_offst_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$in_offst, MST_INPT_SCHD_R.$in_offst);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$lot_mix_flg, MST_INPT_SCHD_R.$lot_mix_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sublot_mix_flg, MST_INPT_SCHD_R.$sublot_mix_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$prov_typ, MST_INPT_SCHD_R.$prov_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alt_itm_typ, MST_INPT_SCHD_R.$alt_itm_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alt_alloc_prio, MST_INPT_SCHD_R.$alt_alloc_prio);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alt_itm_ratio, MST_INPT_SCHD_R.$alt_itm_ratio);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$inpt_schd_no, MST_INPT_SCHD_R.$inpt_schd_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$disp_seq, MST_INPT_SCHD_R.$disp_seq);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (!src.alloc_flg()) {
					if (MAC_ALLOC_CTL_TYP.isALLOC_INST_NG(src.alloc_ctl_typ())
							|| MAC_ALLOC_CTL_TYP.isALLOC_INST_OK(src.alloc_ctl_typ())) {
						if (!isNull(src.alt_grp_cd()) && src.base_unit_rqmt_qty()
								.add(src.base_unit_fxd_rqmt_qty()).isZero()) {
							dest.alloc_flg(false);
						}
						else {
							// 投入予定の引当FLGがfalseの場合
							// マスタ上で引当対象となっており、かつ代替で選択されなかった品目以外は、trueにする
							dest.alloc_flg(true);
						}
					}
				}
				else {
					dest.alloc_flg(src.alloc_flg());
				}
				
				if (up0().re_alloc_mode_flg()) {
					dest.lot_no(null);
					dest.sublot_no(null);
					dest.alloc_sno1(null);
					dest.alloc_sno2(null);
					dest.alloc_sno3(null);
					dest.alloc_sno4(null);
				}
				else {
					dest.lot_no(src.lot_no());
					dest.sublot_no(src.sublot_no());
					dest.alloc_sno1(src.alloc_sno1());
					dest.alloc_sno2(src.alloc_sno2());
					dest.alloc_sno3(src.alloc_sno3());
					dest.alloc_sno4(src.alloc_sno4());
					
					// 引当済みの場合は、表示順のみ更新FLGをオンにし、引当処理を行わないようにする
					dest.disp_seq_upd_flg(isInptDispSeqUpdFlgTrue(src));
				}
				
				if (!isNullOrNullVal(src.lot_no()) || src.inst_lot_fix_flg()) {
					dest.no_lot_fix_flg(false);
				}
				else {
					dest.no_lot_fix_flg(true);
				}
			}
			protected boolean isInptDispSeqUpdFlgTrue(S src) {
				if (src.alloc_flg()) {
					if (src.inst_lot_fix_flg()) {
						// BOMマスタ上で指図時ロット指定とされている場合
						if (!isNullOrNullVal(src.lot_no())) {
							// 既にロットＮＯが決まっている場合は、表示順のみ更新をオンにする
							return true;
						}
					}
					else {
						// BOMマスタ上で指図時ロット指定とされていない場合、引当済みの場合は表示順のみ更新をオンにする
						return true;
					}
				}
				return false;
			}
			
			protected boolean isAltGrpMixEnable(S src) {
				if (MAC_ALT_ITM_TYP.isMIX(src.alt_itm_typ())
						|| isNull(src.alt_itm_typ())) {
					return true;
				}
				return false;
			}
		}
		
		// 投入予定の取得
		protected MCList<MST_INPT_SCHD_R> getInptSchd(
				MCList<MfgInstReg_Chk01_HdrR> bindL) {
			MCList<MST_INPT_SCHD_R> isL = MCList.create(MST_INPT_SCHD_R.class);
			MST_INPT_SCHD_R t = MST_INPT_SCHD_R.create("T");
			MCQueryApiBuilder isL_bldr = MCQueryApiBuilder.create(t);
			isL_bldr.setSelect(t.mfg_inst_no, t.oper_inst_no, t.alt_grp_cd, t.alt_grp_seq,
					t.alt_itm_fix_flg, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.ver_no, t.base_unit_alt_qty, t.base_unit_inpt_qty,
					t.base_unit_rqmt_qty, t.base_unit_fxd_rqmt_qty, t.cont_inpt_qty,
					t.cont_rqmt_qty, t.cont_fxd_rqmt_qty, t.schd_tm, t.alloc_flg,
					t.inst_lot_fix_flg, t.lot_no, t.sublot_no, t.sno1, t.sno1_null_flg,
					t.sno2, t.sno2_null_flg, t.sno3, t.sno3_null_flg, t.sno4,
					t.sno4_null_flg, t.alloc_sno1, t.alloc_sno2, t.alloc_sno3,
					t.alloc_sno4, t.inpt_loc_cd, t.inpt_str_ln_cd, t.gd_cd, t.intr_rmrks,
					t.inpt_rsn_cd, t.inst_rpt_rmrks, t.sub_char1, t.sub_char2,
					t.sub_char3, t.bkf_typ, t.par_inst_qty, t.chd_inpt_qty,
					t.chd_rqmt_qty, t.fxd_chd_rqmt_qty, t.main_itm_flg, t.bom_id_no,
					t.chd_itm_seq, t.bom_memo1, t.bom_memo2, t.bom_memo3,
					t.yield_calc_flg, t.alloc_ctl_typ, t.inpt_ctl_typ, t.in_offst_typ,
					t.in_offst, t.lot_mix_flg, t.sublot_mix_flg, t.prov_typ,
					t.alt_itm_typ, t.alt_alloc_prio, t.alt_itm_ratio, t.inpt_schd_no,
					t.disp_seq);
			isL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			isL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));

			dbSelect("MSBCL6000_MST_INPT_SCHD_S06", isL, isL_bldr, bindL);

			return isL;
		}
		
		// 工数コンテナの作成（新規で工程再展開する場合、しない場合共通）
		protected Map_MfgInstReg_Chk01_DtlWkR_ReExp_Sprt02_RsltWkR<MfgInstReg_Chk01_DtlWkR,ReExp_Sprt02_RsltWkR> createMap_MfgInstReg_Chk01_DtlWkR_ReExp_Sprt02_RsltWkR() {
			return new Map_MfgInstReg_Chk01_DtlWkR_ReExp_Sprt02_RsltWkR<MfgInstReg_Chk01_DtlWkR, ReExp_Sprt02_RsltWkR>();
		}

		public class Map_MfgInstReg_Chk01_DtlWkR_ReExp_Sprt02_RsltWkR<D extends MfgInstReg_Chk01_DtlWkR, S extends ReExp_Sprt02_RsltWkR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$hdr_peg_no, ReExp_Sprt02_RsltWkR.$hdr_peg_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$oper_peg_no, ReExp_Sprt02_RsltWkR.$oper_peg_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$wk_cost_cd, ReExp_Sprt02_RsltWkR.$wk_cost_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$wk_cost, ReExp_Sprt02_RsltWkR.$wk_cost);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$fxd_wk_cost, ReExp_Sprt02_RsltWkR.$fxd_wk_cost);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$wk_cost_calc_flg, ReExp_Sprt02_RsltWkR.$wk_cost_calc_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$disp_seq, ReExp_Sprt02_RsltWkR.$disp_seq);
			}
		}
		
		// 工数コンテナの作成（更新の場合）
		protected Map_MfgInstReg_Chk01_DtlWkR_MST_WK_SCHD_R<MfgInstReg_Chk01_DtlWkR,MST_WK_SCHD_R> createMap_MfgInstReg_Chk01_DtlWkR_MST_WK_SCHD_R() {
			return new Map_MfgInstReg_Chk01_DtlWkR_MST_WK_SCHD_R<MfgInstReg_Chk01_DtlWkR, MST_WK_SCHD_R>();
		}

		public class Map_MfgInstReg_Chk01_DtlWkR_MST_WK_SCHD_R<D extends MfgInstReg_Chk01_DtlWkR, S extends MST_WK_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$wk_cost_cd, MST_WK_SCHD_R.$wk_cost_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$wk_cost, MST_WK_SCHD_R.$wk_cost);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$fxd_wk_cost, MST_WK_SCHD_R.$fxd_wk_cost);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$wk_cost_calc_flg, MST_WK_SCHD_R.$wk_cost_calc_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$intr_rmrks, MST_WK_SCHD_R.$intr_rmrks);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$sub_char1, MST_WK_SCHD_R.$sub_char1);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$sub_char2, MST_WK_SCHD_R.$sub_char2);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$sub_char3, MST_WK_SCHD_R.$sub_char3);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$wk_schd_no, MST_WK_SCHD_R.$wk_schd_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$disp_seq, MST_WK_SCHD_R.$disp_seq);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (up0().is_src_alloc_flg()) {
					dest.disp_seq_upd_flg(true);
				}
			}
		}
		
		// 工数予定の取得
		protected MCList<MST_WK_SCHD_R> getWkSchd(MCList<MfgInstReg_Chk01_HdrR> bindL) {
			MCList<MST_WK_SCHD_R> wsL = MCList.create(MST_WK_SCHD_R.class);
			MST_WK_SCHD_R t = MST_WK_SCHD_R.create("T");
			MCQueryApiBuilder wsL_bldr = MCQueryApiBuilder.create(t);
			wsL_bldr.setSelect(t.mfg_inst_no, t.oper_inst_no, t.wk_cost_cd, t.wk_cost,
					t.fxd_wk_cost, t.wk_cost_calc_flg, t.intr_rmrks, t.sub_char1,
					t.sub_char2, t.sub_char3, t.wk_schd_no, t.disp_seq);
			wsL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			wsL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));

			dbSelect("MSBCL6000_MST_WK_SCHD_S04", wsL, wsL_bldr, bindL);

			return wsL;
		}
		
		// 出来高コンテナの作成（新規で工程再展開する場合、しない場合共通）
		protected Map_MfgInstReg_Chk01_DtlYieldR_ReExp_Sprt03_RsltYieldR<MfgInstReg_Chk01_DtlYieldR,ReExp_Sprt03_RsltYieldR> createMap_MfgInstReg_Chk01_DtlYieldR_ReExp_Sprt03_RsltYieldR() {
			return new Map_MfgInstReg_Chk01_DtlYieldR_ReExp_Sprt03_RsltYieldR<MfgInstReg_Chk01_DtlYieldR, ReExp_Sprt03_RsltYieldR>();
		}

		public class Map_MfgInstReg_Chk01_DtlYieldR_ReExp_Sprt03_RsltYieldR<D extends MfgInstReg_Chk01_DtlYieldR, S extends ReExp_Sprt03_RsltYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$hdr_peg_no, ReExp_Sprt03_RsltYieldR.$hdr_peg_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$oper_peg_no, ReExp_Sprt03_RsltYieldR.$oper_peg_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$trd_unit_cd, ReExp_Sprt03_RsltYieldR.$trd_unit_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$trd_unit_yield_qty, ReExp_Sprt03_RsltYieldR.$trd_unit_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$schd_tm, ReExp_Sprt03_RsltYieldR.$yield_schd_dt);
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$strg_loc_cd, ReExp_Sprt03_RsltYieldR.$strg_loc_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$strg_str_ln_cd, ReExp_Sprt03_RsltYieldR.$strg_str_ln_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$disp_seq, ReExp_Sprt03_RsltYieldR.$disp_seq);
			}
		}
		
		// 出来高コンテナの作成（更新の場合）
		protected Map_MfgInstReg_Chk01_DtlYieldR_MST_YIELD_SCHD_R<MfgInstReg_Chk01_DtlYieldR,MST_YIELD_SCHD_R> createMap_MfgInstReg_Chk01_DtlYieldR_MST_YIELD_SCHD_R() {
			return new Map_MfgInstReg_Chk01_DtlYieldR_MST_YIELD_SCHD_R<MfgInstReg_Chk01_DtlYieldR, MST_YIELD_SCHD_R>();
		}

		public class Map_MfgInstReg_Chk01_DtlYieldR_MST_YIELD_SCHD_R<D extends MfgInstReg_Chk01_DtlYieldR, S extends MST_YIELD_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$trd_unit_cd, MST_YIELD_SCHD_R.$trd_unit_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$trd_unit_yield_qty, MST_YIELD_SCHD_R.$trd_unit_yield_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$schd_tm, MST_YIELD_SCHD_R.$schd_tm);
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$strg_loc_cd, MST_YIELD_SCHD_R.$strg_loc_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$strg_str_ln_cd, MST_YIELD_SCHD_R.$strg_str_ln_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$intr_rmrks, MST_YIELD_SCHD_R.$intr_rmrks);
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$inst_rpt_rmrks, MST_YIELD_SCHD_R.$inst_rpt_rmrks);
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$insp_cnt_rmrks, MST_YIELD_SCHD_R.$insp_cnt_rmrks);
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$sub_char1, MST_YIELD_SCHD_R.$sub_char1);
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$sub_char2, MST_YIELD_SCHD_R.$sub_char2);
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$sub_char3, MST_YIELD_SCHD_R.$sub_char3);
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$yield_schd_no, MST_YIELD_SCHD_R.$yield_schd_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlYieldR.$disp_seq, MST_YIELD_SCHD_R.$disp_seq);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (up0().is_src_alloc_flg()) {
					dest.disp_seq_upd_flg(true);
				}
			}
		}
		
		// 出来高予定の取得（製造品の出来高と副産品の出来高を、同時に取得する）
		protected MCList<MST_YIELD_SCHD_R> getYieldSchd(
				MCList<MfgInstReg_Chk01_HdrR> bindL) {
			MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder ysL_bldr = MCQueryApiBuilder.create(t);
			ysL_bldr.setSelect(t.mfg_inst_no, t.oper_inst_no, t.yield_typ, t.itm_cd,
					t.itm_sub1, t.itm_sub2, t.itm_sub3, t.trd_unit_cd,
					t.trd_unit_yield_qty, t.schd_tm, t.lot_no, t.sublot_no, t.sno1,
					t.sno2, t.sno3, t.sno4, t.strg_loc_cd, t.strg_str_ln_cd, t.bkf_typ,
					t.par_inst_qty, t.chd_inpt_qty, t.chd_rqmt_qty, t.fxd_chd_rqmt_qty,
					t.intr_rmrks, t.inst_rpt_rmrks, t.insp_cnt_rmrks, t.sub_char1,
					t.sub_char2, t.sub_char3, t.yield_schd_no, t.disp_seq);
			ysL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			ysL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));

			dbSelect("MSBCL6000_MST_YIELD_SCHD_S05", ysL, ysL_bldr, bindL);

			return ysL;
		}

		// 副産品コンテナの作成（新規で工程再展開する場合、しない場合共通）
		protected Map_MfgInstReg_Chk01_DtlByProdR_ReExp_Sprt01_RsltByProdR<MfgInstReg_Chk01_DtlByProdR,ReExp_Sprt01_RsltByProdR> createMap_MfgInstReg_Chk01_DtlByProdR_ReExp_Sprt01_RsltByProdR() {
			return new Map_MfgInstReg_Chk01_DtlByProdR_ReExp_Sprt01_RsltByProdR<MfgInstReg_Chk01_DtlByProdR, ReExp_Sprt01_RsltByProdR>();
		}

		public class Map_MfgInstReg_Chk01_DtlByProdR_ReExp_Sprt01_RsltByProdR<D extends MfgInstReg_Chk01_DtlByProdR, S extends ReExp_Sprt01_RsltByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$hdr_peg_no, ReExp_Sprt01_RsltByProdR.$hdr_peg_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$oper_peg_no, ReExp_Sprt01_RsltByProdR.$oper_peg_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$itm_cd, ReExp_Sprt01_RsltByProdR.$itm_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$itm_sub1, ReExp_Sprt01_RsltByProdR.$itm_sub1);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$itm_sub2, ReExp_Sprt01_RsltByProdR.$itm_sub2);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$itm_sub3, ReExp_Sprt01_RsltByProdR.$itm_sub3);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$trd_unit_cd, ReExp_Sprt01_RsltByProdR.$trd_unit_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$trd_unit_yield_qty, ReExp_Sprt01_RsltByProdR.$trd_unit_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$schd_tm, ReExp_Sprt01_RsltByProdR.$yield_schd_dt);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sno1, ReExp_Sprt01_RsltByProdR.$sno1);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sno2, ReExp_Sprt01_RsltByProdR.$sno2);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sno3, ReExp_Sprt01_RsltByProdR.$sno3);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sno4, ReExp_Sprt01_RsltByProdR.$sno4);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$strg_loc_cd, ReExp_Sprt01_RsltByProdR.$strg_loc_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$strg_str_ln_cd, ReExp_Sprt01_RsltByProdR.$strg_str_ln_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$bkf_typ, ReExp_Sprt01_RsltByProdR.$bkf_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$par_inst_qty, ReExp_Sprt01_RsltByProdR.$par_inst_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$chd_inpt_qty, ReExp_Sprt01_RsltByProdR.$chd_inpt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$chd_rqmt_qty, ReExp_Sprt01_RsltByProdR.$chd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$fxd_chd_rqmt_qty, ReExp_Sprt01_RsltByProdR.$fxd_chd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$disp_seq, ReExp_Sprt01_RsltByProdR.$disp_seq);
			}
		}
		
		// 副産品コンテナの作成（更新の場合）
		protected Map_MfgInstReg_Chk01_DtlByProdR_MST_YIELD_SCHD_R<MfgInstReg_Chk01_DtlByProdR,MST_YIELD_SCHD_R> createMap_MfgInstReg_Chk01_DtlByProdR_MST_YIELD_SCHD_R() {
			return new Map_MfgInstReg_Chk01_DtlByProdR_MST_YIELD_SCHD_R<MfgInstReg_Chk01_DtlByProdR, MST_YIELD_SCHD_R>();
		}

		public class Map_MfgInstReg_Chk01_DtlByProdR_MST_YIELD_SCHD_R<D extends MfgInstReg_Chk01_DtlByProdR, S extends MST_YIELD_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$itm_cd, MST_YIELD_SCHD_R.$itm_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$itm_sub1, MST_YIELD_SCHD_R.$itm_sub1);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$itm_sub2, MST_YIELD_SCHD_R.$itm_sub2);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$itm_sub3, MST_YIELD_SCHD_R.$itm_sub3);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$trd_unit_cd, MST_YIELD_SCHD_R.$trd_unit_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$trd_unit_yield_qty, MST_YIELD_SCHD_R.$trd_unit_yield_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$schd_tm, MST_YIELD_SCHD_R.$schd_tm);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$lot_no, MST_YIELD_SCHD_R.$lot_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sublot_no, MST_YIELD_SCHD_R.$sublot_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sno1, MST_YIELD_SCHD_R.$sno1);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sno2, MST_YIELD_SCHD_R.$sno2);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sno3, MST_YIELD_SCHD_R.$sno3);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sno4, MST_YIELD_SCHD_R.$sno4);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$strg_loc_cd, MST_YIELD_SCHD_R.$strg_loc_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$strg_str_ln_cd, MST_YIELD_SCHD_R.$strg_str_ln_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$bkf_typ, MST_YIELD_SCHD_R.$bkf_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$par_inst_qty, MST_YIELD_SCHD_R.$par_inst_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$chd_inpt_qty, MST_YIELD_SCHD_R.$chd_inpt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$chd_rqmt_qty, MST_YIELD_SCHD_R.$chd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$fxd_chd_rqmt_qty, MST_YIELD_SCHD_R.$fxd_chd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$intr_rmrks, MST_YIELD_SCHD_R.$intr_rmrks);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$inst_rpt_rmrks, MST_YIELD_SCHD_R.$inst_rpt_rmrks);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sub_char1, MST_YIELD_SCHD_R.$sub_char1);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sub_char2, MST_YIELD_SCHD_R.$sub_char2);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sub_char3, MST_YIELD_SCHD_R.$sub_char3);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$yield_schd_no, MST_YIELD_SCHD_R.$yield_schd_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$disp_seq, MST_YIELD_SCHD_R.$disp_seq);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (up0().is_src_alloc_flg()) {
					dest.disp_seq_upd_flg(true);
				}
			}
		}
		
		// 再展開サービスの上り電文（工程展開する場合のヘッダ）
		protected Map_ReExp_Sprt05_HdrR_MfgInstReg_Chk01_HdrR<ReExp_Sprt05_HdrR,MfgInstReg_Chk01_HdrR> createMap_ReExp_Sprt05_HdrR_MfgInstReg_Chk01_HdrR() {
			return new Map_ReExp_Sprt05_HdrR_MfgInstReg_Chk01_HdrR<ReExp_Sprt05_HdrR, MfgInstReg_Chk01_HdrR>();
		}

		public class Map_ReExp_Sprt05_HdrR_MfgInstReg_Chk01_HdrR<D extends ReExp_Sprt05_HdrR, S extends MfgInstReg_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt05_HdrR.$peg_no, MfgInstReg_Chk01_HdrR.$peg_no);
				addColumnPathMap(ReExp_Sprt05_HdrR.$wg_cd, MfgInstReg_Chk01_HdrR.$mfg_loc_wg_cd);
				addColumnPathMap(ReExp_Sprt05_HdrR.$itm_cd, MfgInstReg_Chk01_HdrR.$itm_cd);
				addColumnPathMap(ReExp_Sprt05_HdrR.$itm_sub1, MfgInstReg_Chk01_HdrR.$itm_sub1);
				addColumnPathMap(ReExp_Sprt05_HdrR.$itm_sub2, MfgInstReg_Chk01_HdrR.$itm_sub2);
				addColumnPathMap(ReExp_Sprt05_HdrR.$itm_sub3, MfgInstReg_Chk01_HdrR.$itm_sub3);
				addColumnPathMap(ReExp_Sprt05_HdrR.$oper_ptn, MfgInstReg_Chk01_HdrR.$oper_ptn);
				addColumnPathMap(ReExp_Sprt05_HdrR.$bom_ptn, MfgInstReg_Chk01_HdrR.$bom_ptn);
				addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_inst_qty, MfgInstReg_Chk01_HdrR.$base_unit_inst_qty);
				addColumnPathMap(ReExp_Sprt05_HdrR.$yield_schd_qty, MfgInstReg_Chk01_HdrR.$base_unit_yield_qty);
				addColumnPathMap(ReExp_Sprt05_HdrR.$strg_loc_cd, MfgInstReg_Chk01_HdrR.$strg_loc_cd);
				addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_loc_cd, MfgInstReg_Chk01_HdrR.$mfg_loc_cd);
				addColumnPathMap(ReExp_Sprt05_HdrR.$sno1, MfgInstReg_Chk01_HdrR.$sno1);
				addColumnPathMap(ReExp_Sprt05_HdrR.$sno2, MfgInstReg_Chk01_HdrR.$sno2);
				addColumnPathMap(ReExp_Sprt05_HdrR.$sno3, MfgInstReg_Chk01_HdrR.$sno3);
				addColumnPathMap(ReExp_Sprt05_HdrR.$sno4, MfgInstReg_Chk01_HdrR.$sno4);
				addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_st_schd_dt, MfgInstReg_Chk01_HdrR.$st_schd_tm);
				addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_end_schd_dt, MfgInstReg_Chk01_HdrR.$end_schd_tm);
				addColumnPathMap(ReExp_Sprt05_HdrR.$itm_ord_no, MfgInstReg_Chk01_HdrR.$itm_ord_no);
				addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_inst_no, MfgInstReg_Chk01_HdrR.$mfg_inst_no);
				addColumnPathMap(ReExp_Sprt05_HdrR.$master_dt, MfgInstReg_Chk01_HdrR.$master_dt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (MSC_MFG_MTD_TYP.isINTNL(src.mfg_mtd_typ())) {
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.MFG.value());
				}
				else {
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
				}
			}
		}

		// 再展開サービスの上り電文（工程展開しない場合のヘッダ）
		protected Map_ReExp_Sprt04_HdrR_MfgInstReg_Chk01_HdrR<ReExp_Sprt04_HdrR,MfgInstReg_Chk01_HdrR> createMap_ReExp_Sprt04_HdrR_MfgInstReg_Chk01_HdrR() {
			return new Map_ReExp_Sprt04_HdrR_MfgInstReg_Chk01_HdrR<ReExp_Sprt04_HdrR, MfgInstReg_Chk01_HdrR>();
		}

		public class Map_ReExp_Sprt04_HdrR_MfgInstReg_Chk01_HdrR<D extends ReExp_Sprt04_HdrR, S extends MfgInstReg_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt04_HdrR.$peg_no, MfgInstReg_Chk01_HdrR.$peg_no);
				addColumnPathMap(ReExp_Sprt04_HdrR.$itm_cd, MfgInstReg_Chk01_HdrR.$itm_cd);
				addColumnPathMap(ReExp_Sprt04_HdrR.$itm_sub1, MfgInstReg_Chk01_HdrR.$itm_sub1);
				addColumnPathMap(ReExp_Sprt04_HdrR.$itm_sub2, MfgInstReg_Chk01_HdrR.$itm_sub2);
				addColumnPathMap(ReExp_Sprt04_HdrR.$itm_sub3, MfgInstReg_Chk01_HdrR.$itm_sub3);
				addColumnPathMap(ReExp_Sprt04_HdrR.$oper_ptn, MfgInstReg_Chk01_HdrR.$oper_ptn);
				addColumnPathMap(ReExp_Sprt04_HdrR.$bom_ptn, MfgInstReg_Chk01_HdrR.$bom_ptn);
				addColumnPathMap(ReExp_Sprt04_HdrR.$yield_schd_qty, MfgInstReg_Chk01_HdrR.$base_unit_yield_qty);
				addColumnPathMap(ReExp_Sprt04_HdrR.$strg_loc_cd, MfgInstReg_Chk01_HdrR.$strg_loc_cd);
				addColumnPathMap(ReExp_Sprt04_HdrR.$mfg_loc_cd, MfgInstReg_Chk01_HdrR.$mfg_loc_cd);
				addColumnPathMap(ReExp_Sprt04_HdrR.$sno1, MfgInstReg_Chk01_HdrR.$sno1);
				addColumnPathMap(ReExp_Sprt04_HdrR.$sno2, MfgInstReg_Chk01_HdrR.$sno2);
				addColumnPathMap(ReExp_Sprt04_HdrR.$sno3, MfgInstReg_Chk01_HdrR.$sno3);
				addColumnPathMap(ReExp_Sprt04_HdrR.$sno4, MfgInstReg_Chk01_HdrR.$sno4);
				addColumnPathMap(ReExp_Sprt04_HdrR.$mfg_st_schd_dt, MfgInstReg_Chk01_HdrR.$st_schd_tm);
				addColumnPathMap(ReExp_Sprt04_HdrR.$strg_str_ln_cd, MfgInstReg_Chk01_HdrR.$strg_str_ln_cd);
			}
		}
		
		// 再展開サービスの上り電文（工程展開しない場合の工程）
		protected Map_ReExp_Sprt04_DtlOperR_MfgInstReg_Chk01_DtlOperR<ReExp_Sprt04_DtlOperR,MfgInstReg_Chk01_DtlOperR> createMap_ReExp_Sprt04_DtlOperR_MfgInstReg_Chk01_DtlOperR() {
			return new Map_ReExp_Sprt04_DtlOperR_MfgInstReg_Chk01_DtlOperR<ReExp_Sprt04_DtlOperR, MfgInstReg_Chk01_DtlOperR>();
		}

		public class Map_ReExp_Sprt04_DtlOperR_MfgInstReg_Chk01_DtlOperR<D extends ReExp_Sprt04_DtlOperR, S extends MfgInstReg_Chk01_DtlOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$hdr_peg_no, MfgInstReg_Chk01_DtlOperR.$hdr_peg_no);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$peg_no, MfgInstReg_Chk01_DtlOperR.$peg_no);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$oper_cd, MfgInstReg_Chk01_DtlOperR.$oper_cd);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$oper_seq, MfgInstReg_Chk01_DtlOperR.$oper_seq);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$oper_loc_cd, MfgInstReg_Chk01_DtlOperR.$oper_loc_cd);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$oper_ptn, MfgInstReg_Chk01_DtlOperR.$oper_ptn);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$oper_inst_qty, MfgInstReg_Chk01_DtlOperR.$base_unit_qty);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$st_schd_tm, MfgInstReg_Chk01_DtlOperR.$st_schd_tm);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$end_schd_tm, MfgInstReg_Chk01_DtlOperR.$end_schd_tm);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$yield_oper_flg, MfgInstReg_Chk01_DtlOperR.$yield_oper_flg);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$yield_oper_ratio, MfgInstReg_Chk01_DtlOperR.$yield_oper_ratio);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// 再展開用紐付けＮＯが設定されている場合はヘッダに設定
				if (!isNull(src.re_exp_peg_no())) {
					dest.hdr_peg_no(src.re_exp_peg_no());
				}
				dest.oper_str_ln_cd(src.oper_str_ln_cd());
			}
		}
		
		protected void callThisUpd01HdrMode(MCList<MfgInstReg_Upd02_Hdr1R> upL){
			mapUpContainers(MIR1);
			if (up0().re_alloc_mode_flg()) {
				mirUpd01.up0().setBoolean(MfgInstReg_Upd01_HdrR.$re_alloc_mode_flg, true);
			}
			if (up0().is_src_alloc_flg()) {
				mirUpd01.up0().setBoolean(MfgInstReg_Upd01_HdrR.$is_src_alloc_flg, true);
			}
			mirUpd01.exec();
			mapDownContainers(MIR1);
			
			String[] srcCols = new String[]{MfgInstReg_Upd01_HdrR.$mfg_sts_typ,
					MfgInstReg_Upd01_HdrR.$mfg_sts_typ_nm,
					MfgInstReg_Upd01_HdrR.$lot_no,
					MfgInstReg_Upd01_HdrR.$sublot_no,
					MfgInstReg_Upd01_HdrR.$mfg_inst_no,
					MfgInstReg_Upd01_HdrR.$mfg_inst_rev,
					MfgInstReg_Upd01_HdrR.$itm_mfg_inst_no,
					MfgInstReg_Upd01_HdrR.$alloc_tgt_cnt,
					MfgInstReg_Upd01_HdrR.$alloc_success_cnt,
					MfgInstReg_Upd01_HdrR.$alloc_failure_cnt,
					MfgInstReg_Upd01_HdrR.$lot_inh_err_flg};
			String[] destCols = new String[]{MfgInstReg_Upd02_Hdr1R.$mfg_sts_typ,
					MfgInstReg_Upd02_Hdr1R.$mfg_sts_typ_nm,
					MfgInstReg_Upd02_Hdr1R.$lot_no,
					MfgInstReg_Upd02_Hdr1R.$sublot_no,
					MfgInstReg_Upd02_Hdr1R.$mfg_inst_no,
					MfgInstReg_Upd02_Hdr1R.$mfg_inst_rev,
					MfgInstReg_Upd02_Hdr1R.$itm_mfg_inst_no,
					MfgInstReg_Upd02_Hdr1R.$alloc_tgt_cnt,
					MfgInstReg_Upd02_Hdr1R.$alloc_success_cnt,
					MfgInstReg_Upd02_Hdr1R.$alloc_failure_cnt,
					MfgInstReg_Upd02_Hdr1R.$lot_inh_err_flg};
			copyByPegNo(upL, destCols, mirUpd01.down0(), srcCols);
		}
		/**
		 * 工程単位でのチェック処理
		 */
		protected void callThisChk01OperMode(MCList<MfgInstReg_Upd02_Hdr1R> upL) {
			
			// 本処理では以下の４パターンの登録用コンテナを作成する
			// 1.工程オーダから指図済工程登録
			//  品目製造指図、製造指図、工程指図が未登録の場合に、上り電文の工程情報を元に指図情報を新規登録する
			// 2.工程オーダから未指図工程登録
			//  品目製造指図、製造指図、工程指図が未登録の場合に、上り電文に存在しない工程オーダを元に未指図工程の指図情報を新規登録する
			//  ヘッダは1.に紐付き、未指図工程（対象工程フラグがオフ）のコンテナのみが追加される
			// 3.未指図工程から指図済工程登録
			//  上り電文の工程情報が2.で登録した未指図工程の場合に、製造指図の新規登録して工程指図を指図済に更新する
			// 4.指図保存を指図済に更新
			//  上り電文の工程情報が指図保存の場合に、製造指図、工程指図を指図済に更新する

			MCList<MfgInstReg_Chk01_HdrR> chk01HdrIns = MCList.create(MfgInstReg_Chk01_HdrR.class); // 1,2.用ヘッダコンテナ
			MCList<MfgInstReg_Chk01_DtlOperR> chk01OperIns = MCList.create(MfgInstReg_Chk01_DtlOperR.class); // 1,2.用工程コンテナ
			MCList<MfgInstReg_Chk01_HdrR> chk01HdrUpd = MCList.create(MfgInstReg_Chk01_HdrR.class); // 3,4.用ヘッダコンテナ
			MCList<MfgInstReg_Chk01_DtlOperR> chk01OperUpd = MCList.create(MfgInstReg_Chk01_DtlOperR.class); // 3,4.用工程コンテナ
			MCList<MfgInstReg_Chk01_DtlOperR> chk01OperReExp = MCList.create(MfgInstReg_Chk01_DtlOperR.class); // 3,4.用工程コンテナ（予定再展開が必要）

			MCList<MfgInstReg_Upd02_Hdr1R> insUpL = MCList.create(MfgInstReg_Upd02_Hdr1R.class);
			MCList<MfgInstReg_Upd02_Hdr1R> notInstUpL = MCList.create(MfgInstReg_Upd02_Hdr1R.class);
			MCList<MfgInstReg_Upd02_Hdr1R> updUpL = MCList.create(MfgInstReg_Upd02_Hdr1R.class);
			for (MfgInstReg_Upd02_Hdr1R r : upL) {
				if (isNull(r.itm_mfg_inst_no()) && isNull(r.mfg_inst_no())) {
					// 品目製造指図ＮＯ、製造指図ＮＯが共に未設定の場合、1,2.の対象
					insUpL.add(r);
				}
				else if (isNull(r.mfg_inst_no())) {
					// 上記以外で製造指図ＮＯが未設定（＝品目製造指図ＮＯが設定済）の場合、3.の対象
					notInstUpL.add(r);
				}
				else {
					// 上記以外（品目製造指図ＮＯ、製造指図ＮＯが共に設定済）の場合は4.の対象
					updUpL.add(r);
				}
			}

			// ヘッダのキャッシュ
			FXUCL_Cache<MfgInstReg_Upd02_Hdr1R> hdrCache = new FXUCL_Cache<MfgInstReg_Upd02_Hdr1R>(); // ヘッダ紐付けＮＯで１件取得する
			FXUCL_Cache<MfgInstReg_Upd02_Hdr1R> operCache = new FXUCL_Cache<MfgInstReg_Upd02_Hdr1R>(); // 工程紐付けＮＯで１件取得する
			FXUCL_Cache<MCList<MfgInstReg_Upd02_Hdr1R>> rtnCache = new FXUCL_Cache<MCList<MfgInstReg_Upd02_Hdr1R>>(); // ヘッダ紐付けＮＯで全件取得する（処理結果の設定用）
			hdrCache.setFixMaxCacheSize(-1);
			operCache.setFixMaxCacheSize(-1);
			rtnCache.setFixMaxCacheSize(-1);
			
			// ヘッダの紐付けＮＯは採番しなおすため初期値にゼロを設定
			MCNumber hdrPegNo = MCNumber.ZERO;
			// 工程の紐付けＮＯは上り電文の紐付けＮＯを使用するが、上り電文に存在しない工程オーダを行追加する場合があるため、上り電文の紐付けＮＯの最大値を保持しておく
			MCNumber operPegNo = nvl((MCNumber)upL.max(MfgInstReg_Upd02_Hdr1R.$peg_no), MCNumber.ZERO);

			// -------------------------------1.工程オーダから指図済工程登録-------------------------------

			// 処理対象の工程オーダＮＯをワークテーブルに登録
			insOperOrdWk(insUpL);
			
			// 処理対象の工程オーダを取得
			MCList<MST_OPER_ORDER_R> ooL = getOperOrdByWk(MCList.create(MfgInstReg_Chk01_HdrR.class));
			MCIndexKey ookey = ooL.createIndex(MST_OPER_ORDER_R.$oper_ord_no);
			
			// 処理済の品目オーダＮＯを格納するハッシュセット
			Set<String> itmOrdNo = new HashSet<String>();

			// 同一品目オーダＮＯ＋工程指図Ｇ単位に同一製造指図とするため、識別用のキーを設定する
			setSameMfgInstKey(insUpL, MfgInstReg_Upd02_Hdr1R.$itm_ord_no);

			// 識別用のキー単位に上り電文を作成
			for (MCList<MfgInstReg_Upd02_Hdr1R> upSubL : insUpL
					.groupList(MfgInstReg_Upd02_Hdr1R.$same_mfg_inst_key)) {

				// 先頭行からChk01のヘッダコンテナを作成
				MfgInstReg_Chk01_HdrR chk01HdrR = MfgInstReg_Chk01_HdrR.create(); 
				MfgInstReg_Upd02_Hdr1R upHdrR = upSubL.get(0);
				copy(chk01HdrR, upHdrR, createMap_MfgInstReg_Chk01_HdrR_MfgInstReg_Upd02_Hdr1R());
				
				// 品目オーダの項目を補完
				MST_ITM_ORDER_R ioR = getItmOrdCacheForUpd02(upHdrR.itm_ord_no());
				editChk01HdrByIoR(chk01HdrR, ioR);

				// 上り電文の紐付けＮＯは工程単位に採番されているため、製造指図単位に採番しなおす
				hdrPegNo = hdrPegNo.add(MCNumber.ONE);
				chk01HdrR.peg_no(hdrPegNo);

				// 処理済品目オーダに品目オーダＮＯが存在する場合は初回製造指図以外の登録（工程単位）をオンにする
				if (itmOrdNo.contains(chk01HdrR.itm_ord_no())) {
					chk01HdrR.not_frst_inst_reg_oper_flg(true);
				}
				else {
					// 上記以外の場合は処理済品目オーダに追加
					itmOrdNo.add(chk01HdrR.itm_ord_no());
				}

				// 予定日補正は常にオン（工程の着手日・終了日からヘッダの着手日・終了日を算出）
				chk01HdrR.comp_dt_from_oper_flg(true);

				// ヘッダのコンテナ、上り電文のキャッシュに追加
				chk01HdrIns.add(chk01HdrR);
				hdrCache.putCache(new MCNumber[]{hdrPegNo}, upHdrR);
				rtnCache.putCache(new MCNumber[]{hdrPegNo}, upSubL);

				// 上り電文からChk01の工程コンテナを作成
				for (MfgInstReg_Upd02_Hdr1R upR : upSubL) {
					MfgInstReg_Chk01_DtlOperR chk01OperR = MfgInstReg_Chk01_DtlOperR.create();

					// 工程オーダから値を設定
					MST_OPER_ORDER_R ooR = ooL.getFirst(ookey, upR.oper_ord_no());
					copy(chk01OperR, ooR, createMap_MfgInstReg_Chk01_DtlOperR_MST_OPER_ORDER_R());
					
					// 上り電文から値を設定
					copy(chk01OperR, upR, createMap_MfgInstReg_Chk01_DtlOperR_MfgInstReg_Upd02_Hdr1R());

					chk01OperR.hdr_peg_no(hdrPegNo);
					chk01OperR.tgt_oper_flg(true);
					chk01OperR.mfg_sts_typ(chk01HdrR.mfg_sts_typ());

					// 工程のコンテナ、上り電文のキャッシュに追加
					chk01OperIns.add(chk01OperR);
					operCache.putCache(new MCNumber[]{upR.peg_no()}, upR);
				}
			}
			
			// -------------------------------2.工程オーダから未指図工程登録-------------------------------
			
			// 処理対象の工程オーダを取得（ワークテーブルに存在しない工程オーダ）
			MCList<MST_OPER_ORDER_R> ooNotExtL = getOperOrdByWk(chk01HdrIns);
			MCIndexKey ooNotExtkey = ooNotExtL.createIndex(MST_OPER_ORDER_R.$itm_ord_no);
			
			// 1.で追加したヘッダコンテナを元に、品目オーダ単位に未指図工程のコンテナを作成
			for (MCList<MfgInstReg_Chk01_HdrR> hdrL : chk01HdrIns
					.groupList(MfgInstReg_Chk01_HdrR.$itm_ord_no)) {
				// １件目のヘッダに紐付ける
				MfgInstReg_Chk01_HdrR hdrR = hdrL.get(0);
				
				// 品目オーダＮＯに紐付く工程オーダを取得
				MCList<MST_OPER_ORDER_R> subOoL = ooNotExtL.subList(ooNotExtkey, hdrR.itm_ord_no());
				for (MST_OPER_ORDER_R ooR : subOoL) {
					MfgInstReg_Chk01_DtlOperR chk01OperR = MfgInstReg_Chk01_DtlOperR.create();
					copy(chk01OperR, ooR, createMap_MfgInstReg_Chk01_DtlOperR_MST_OPER_ORDER_R());
					chk01OperR.hdr_peg_no(hdrR.peg_no());

					// 対象工程フラグをオフにして紐付けＮＯを採番
					operPegNo = operPegNo.add(MCNumber.ONE);
					chk01OperR.tgt_oper_flg(false);
					// 製造状況区分は未指図
					chk01OperR.mfg_sts_typ(MSC_MFG_STS_TYP.YET.value());
					chk01OperR.peg_no(operPegNo);
					// 数量にはヘッダの指図数量を設定（指図分割を行った場合、工程オーダの数量＜ヘッダの指図数量となっているため）
					chk01OperR.base_unit_qty(hdrR.base_unit_inst_qty());

					// 工程のコンテナに追加
					chk01OperIns.add(chk01OperR);
				}
			}

			// -------------------------------3.未指図工程から指図済工程登録-------------------------------

			// 上り電文の工程指図ＮＯから工程指図を取得
			// ※取得した工程指図は4.でも使用するため、upLから取得する
			MCList<MST_OPER_INST_R> oiL = getOperInstOperMode(upL.subList(r -> !isNull(r.oper_inst_no())));
			MCIndexKey oikey = oiL.createIndex(MST_OPER_INST_R.$oper_inst_no);
			
			// 同一品目製造指図ＮＯ＋工程指図Ｇ単位に同一製造指図とするため、識別用のキーを設定する
			setSameMfgInstKey(notInstUpL, MfgInstReg_Upd02_Hdr1R.$itm_mfg_inst_no);

			// 識別用のキー単位に上り電文を作成
			for (MCList<MfgInstReg_Upd02_Hdr1R> upSubL : notInstUpL
					.groupList(MfgInstReg_Upd02_Hdr1R.$same_mfg_inst_key)) {

				// 先頭行からChk01のヘッダコンテナを作成
				MfgInstReg_Chk01_HdrR chk01HdrR = MfgInstReg_Chk01_HdrR.create(); 
				MfgInstReg_Upd02_Hdr1R upHdrR = upSubL.get(0);
				copy(chk01HdrR, upHdrR, createMap_MfgInstReg_Chk01_HdrR_MfgInstReg_Upd02_Hdr1R());
				
				// 品目オーダの項目を補完
				MST_ITM_ORDER_R ioR = getItmOrdCacheForUpd02(upHdrR.itm_ord_no());
				// 品目製造指図の項目を補完
				MST_ITM_MFG_INST_R imiR = getItmMfgInstCacheForUpd02(upHdrR.itm_mfg_inst_no());
				editChk01HdrByImiR(chk01HdrR, imiR, ioR);

				// 上り電文の紐付けＮＯは工程単位に採番されているため、製造指図単位に採番しなおす
				hdrPegNo = hdrPegNo.add(MCNumber.ONE);
				chk01HdrR.peg_no(hdrPegNo);

				// 予定日補正は常にオン（工程の着手日・終了日からヘッダの着手日・終了日を算出）
				chk01HdrR.comp_dt_from_oper_flg(true);

				chk01HdrUpd.add(chk01HdrR);
				hdrCache.putCache(new MCNumber[]{hdrPegNo}, upHdrR);
				rtnCache.putCache(new MCNumber[]{hdrPegNo}, upSubL);

				// 上り電文からChk01の工程コンテナを作成
				for (MfgInstReg_Upd02_Hdr1R upR : upSubL) {
					MfgInstReg_Chk01_DtlOperR chk01OperR = MfgInstReg_Chk01_DtlOperR.create();
					copy(chk01OperR, upR, createMap_MfgInstReg_Chk01_DtlOperR_MfgInstReg_Upd02_Hdr1R());
					// 工程指図の値を補完
					MST_OPER_INST_R oiR = oiL.getFirst(oikey, upR.oper_inst_no());
					copy(chk01OperR, oiR, createMap_MfgInstReg_Chk01_DtlOperR_MST_OPER_INST_R_Oper());
					chk01OperR.hdr_peg_no(hdrPegNo);
					chk01OperR.tgt_oper_flg(true);
					chk01OperR.mfg_sts_typ(chk01HdrR.mfg_sts_typ());
					if (reExpSchd(chk01OperR, oiR)) {
						chk01OperReExp.add(chk01OperR);
					}
					else {
						chk01OperUpd.add(chk01OperR);
					}
					operCache.putCache(new MCNumber[]{upR.peg_no()}, upR);
				}
			}
			
			// -------------------------------4.指図保存を指図済に更新-------------------------------

			// 製造指図ＮＯ単位に上り電文を作成
			for (MCList<MfgInstReg_Upd02_Hdr1R> upSubL : updUpL
					.groupList(MfgInstReg_Upd02_Hdr1R.$mfg_inst_no)) {

				// 先頭行からChk01のヘッダコンテナを作成
				MfgInstReg_Chk01_HdrR chk01HdrR = MfgInstReg_Chk01_HdrR.create(); 
				MfgInstReg_Upd02_Hdr1R upHdrR = upSubL.get(0);
				copy(chk01HdrR, upHdrR, createMap_MfgInstReg_Chk01_HdrR_MfgInstReg_Upd02_Hdr1R());
				
				// 品目製造指図、製造指図の項目を補完
				MST_ITM_MFG_INST_R imiR = getItmMfgInstCacheForUpd02(upHdrR.itm_mfg_inst_no());
				MST_MFG_INST_R miR = getMfgInstCacheForUpd02(upHdrR.mfg_inst_no());
				editChk01HdrByImiR(chk01HdrR, imiR, miR);

				// 上り電文の紐付けＮＯは工程単位に採番されているため、製造指図単位に採番しなおす
				hdrPegNo = hdrPegNo.add(MCNumber.ONE);
				chk01HdrR.peg_no(hdrPegNo);

				// 予定日補正は常にオン（工程の着手日・終了日からヘッダの着手日・終了日を算出）
				chk01HdrR.comp_dt_from_oper_flg(true);

				chk01HdrUpd.add(chk01HdrR);
				hdrCache.putCache(new MCNumber[]{hdrPegNo}, upHdrR);
				rtnCache.putCache(new MCNumber[]{hdrPegNo}, upSubL);

				// 上り電文からChk01の工程コンテナを作成
				for (MfgInstReg_Upd02_Hdr1R upR : upSubL) {
					MfgInstReg_Chk01_DtlOperR chk01OperR = MfgInstReg_Chk01_DtlOperR.create();
					copy(chk01OperR, upR, createMap_MfgInstReg_Chk01_DtlOperR_MfgInstReg_Upd02_Hdr1R());
					// 工程指図の値を補完
					MST_OPER_INST_R oiR = oiL.getFirst(oikey, upR.oper_inst_no());
					if (!isNull(oiR)) {
						copy(chk01OperR, oiR, createMap_MfgInstReg_Chk01_DtlOperR_MST_OPER_INST_R_Oper());
					}
					chk01OperR.hdr_peg_no(hdrPegNo);
					chk01OperR.tgt_oper_flg(true);
					chk01OperR.mfg_sts_typ(chk01HdrR.mfg_sts_typ());
					if (reExpSchd(chk01OperR, oiR)) {
						chk01OperReExp.add(chk01OperR);
					}
					else {
						chk01OperUpd.add(chk01OperR);
					}
					operCache.putCache(new MCNumber[]{upR.peg_no()}, upR);
				}
			}
			
			// -------------------------------新規登録-------------------------------
			MCList<MfgInstReg_Chk01_DtlInptR> chk01InptIns = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
			MCList<MfgInstReg_Chk01_DtlWkR> chk01WkIns = MCList.create(MfgInstReg_Chk01_DtlWkR.class);
			MCList<MfgInstReg_Chk01_DtlYieldR> chk01YieldIns = MCList.create(MfgInstReg_Chk01_DtlYieldR.class);
			MCList<MfgInstReg_Chk01_DtlByProdR> chk01ByProdIns  = MCList.create(MfgInstReg_Chk01_DtlByProdR.class);
			
			if (!chk01HdrIns.isEmpty()) {
				setChkContainerInsOperMode(chk01HdrIns, chk01OperIns, chk01InptIns,
						chk01WkIns, chk01YieldIns, chk01ByProdIns);
			}

			// -------------------------------更新-------------------------------
			MCList<MfgInstReg_Chk01_DtlInptR> chk01InptUpd = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
			MCList<MfgInstReg_Chk01_DtlWkR> chk01WkUpd = MCList.create(MfgInstReg_Chk01_DtlWkR.class);
			MCList<MfgInstReg_Chk01_DtlYieldR> chk01YieldUpd = MCList.create(MfgInstReg_Chk01_DtlYieldR.class);
			MCList<MfgInstReg_Chk01_DtlByProdR> chk01ByProdUpd  = MCList.create(MfgInstReg_Chk01_DtlByProdR.class);
			
			if (!chk01OperUpd.isEmpty()) {
				setChkContainerUpdOperMode(chk01HdrUpd, chk01OperUpd, chk01InptUpd,
						chk01WkUpd, chk01YieldUpd, chk01ByProdUpd);
			}

			// -------------------------------更新（予定再展開）-------------------------------
			MCList<MfgInstReg_Chk01_DtlInptR> chk01InptReExp = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
			MCList<MfgInstReg_Chk01_DtlWkR> chk01WkReExp = MCList.create(MfgInstReg_Chk01_DtlWkR.class);
			MCList<MfgInstReg_Chk01_DtlYieldR> chk01YieldReExp = MCList.create(MfgInstReg_Chk01_DtlYieldR.class);
			MCList<MfgInstReg_Chk01_DtlByProdR> chk01ByProdReExp  = MCList.create(MfgInstReg_Chk01_DtlByProdR.class);
			
			if (!chk01OperReExp.isEmpty()) {
				setChkContainerReExpOperMode(chk01HdrUpd, chk01OperReExp,
						chk01InptReExp, chk01WkReExp, chk01YieldReExp, chk01ByProdReExp);
			}

			// チェック処理実行
			MSBCL_MfgInstRegService.MfgInstReg_Chk01 chkOpe = MSBCL_MfgInstRegService.crtMfgInstReg_Chk01();
			chkOpe.up0().addAll(chk01HdrIns);
			chkOpe.up0().addAll(chk01HdrUpd);

			chkOpe.up1().addAll(chk01OperIns);
			chkOpe.up1().addAll(chk01OperUpd);
			chkOpe.up1().addAll(chk01OperReExp);

			chkOpe.up2().addAll(chk01InptIns);
			chkOpe.up2().addAll(chk01InptUpd);
			chkOpe.up2().addAll(chk01InptReExp);

			chkOpe.up3().addAll(chk01WkIns);
			chkOpe.up3().addAll(chk01WkUpd);
			chkOpe.up3().addAll(chk01WkReExp);

			chkOpe.up4().addAll(chk01YieldIns);
			chkOpe.up4().addAll(chk01YieldUpd);
			chkOpe.up4().addAll(chk01YieldReExp);

			chkOpe.up5().addAll(chk01ByProdIns);
			chkOpe.up5().addAll(chk01ByProdUpd);
			chkOpe.up5().addAll(chk01ByProdReExp);
		
			setPegNo(chkOpe.up2(), chkOpe.up3(), chkOpe.up4(), chkOpe.up5());

			// 工程
			for (MfgInstReg_Chk01_DtlOperR operR : chkOpe.up1()) {
				MfgInstReg_Upd02_Hdr1R hdrR = getUpCache(hdrCache, operCache, operR.hdr_peg_no(), operR.peg_no());
				operR.setAttributes(hdrR);
			}
			// 投入
			for (MfgInstReg_Chk01_DtlInptR inptR : chkOpe.up2()) {
				MfgInstReg_Upd02_Hdr1R hdrR = getUpCache(hdrCache, operCache, inptR.hdr_peg_no(), inptR.oper_peg_no());
				if (!isSame(inptR.getStatus(), MCRow.DELETE)) {
					inptR.setAttributes(hdrR);
				}
			}
			// 工数
			for (MfgInstReg_Chk01_DtlWkR wkR : chkOpe.up3()) {
				MfgInstReg_Upd02_Hdr1R hdrR = getUpCache(hdrCache, operCache, wkR.hdr_peg_no(), wkR.oper_peg_no());
				if (!isSame(wkR.getStatus(), MCRow.DELETE)) {
					wkR.setAttributes(hdrR);
				}
			}
			// 出来高
			for (MfgInstReg_Chk01_DtlYieldR yieldR : chkOpe.up4()) {
				MfgInstReg_Upd02_Hdr1R hdrR = getUpCache(hdrCache, operCache, yieldR.hdr_peg_no(), yieldR.oper_peg_no());
				if (!isSame(yieldR.getStatus(), MCRow.DELETE)) {
					yieldR.setAttributes(hdrR);
				}
			}
			// 副産品
			for (MfgInstReg_Chk01_DtlByProdR byProdR : chkOpe.up5()) {
				MfgInstReg_Upd02_Hdr1R hdrR = getUpCache(hdrCache, operCache, byProdR.hdr_peg_no(), byProdR.oper_peg_no());
				if (!isSame(byProdR.getStatus(), MCRow.DELETE)) {
					byProdR.setAttributes(hdrR);
				}
			}
			
			// チェック処理実行
			if (!chkOpe.up0().isEmpty()) {
				chkOpe.exec();
				
				MCList<MfgInstReg_Chk01_HdrR> notErrDown0 = MCList.create(MfgInstReg_Chk01_HdrR.class);
				for (MfgInstReg_Chk01_HdrR chkDown0R : chkOpe.down0()) {
					if (!chkDown0R.err_flg()) {
						notErrDown0.add(chkDown0R);
					}
					else {
						// 同一ヘッダ紐付けＮＯに紐付く上り電文にすべて処理結果状況区分を設定する
						MCList<MfgInstReg_Upd02_Hdr1R> thisUpL = rtnCache.getCache(chkDown0R.peg_no());
						for (MfgInstReg_Upd02_Hdr1R thisUpR : thisUpL) {
							thisUpR.rtn_sts_typ(chkDown0R.rtn_sts_typ());
						}
					}
				}
				
				if (!notErrDown0.isEmpty()) {
					MCList<MfgInstReg_Chk01_DtlOperR> notErrDown1 = MCList.create(MfgInstReg_Chk01_DtlOperR.class);
					MCIndexKey down1Key = chkOpe.down1().createIndex(MfgInstReg_Chk01_DtlOperR.$hdr_peg_no);
					for (MfgInstReg_Chk01_HdrR r : notErrDown0) {
						notErrDown1.addAll(chkOpe.down1().subList(down1Key, r.peg_no()));
					}
	
					MCList<MfgInstReg_Chk01_DtlInptR> notErrDown2 = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
					MCIndexKey down2Key = chkOpe.down2().createIndex(MfgInstReg_Chk01_DtlInptR.$hdr_peg_no);
					for (MfgInstReg_Chk01_HdrR r : notErrDown0) {
						notErrDown2.addAll(chkOpe.down2().subList(down2Key, r.peg_no()));
					}
	
					MCList<MfgInstReg_Chk01_DtlWkR> notErrDown3 = MCList.create(MfgInstReg_Chk01_DtlWkR.class);
					MCIndexKey down3Key = chkOpe.down3().createIndex(MfgInstReg_Chk01_DtlWkR.$hdr_peg_no);
					for (MfgInstReg_Chk01_HdrR r : notErrDown0) {
						notErrDown3.addAll(chkOpe.down3().subList(down3Key, r.peg_no()));
					}
	
					MCList<MfgInstReg_Chk01_DtlYieldR> notErrDown4 = MCList.create(MfgInstReg_Chk01_DtlYieldR.class);
					MCIndexKey down4Key = chkOpe.down4().createIndex(MfgInstReg_Chk01_DtlYieldR.$hdr_peg_no);
					for (MfgInstReg_Chk01_HdrR r : notErrDown0) {
						notErrDown4.addAll(chkOpe.down4().subList(down4Key, r.peg_no()));
					}
	
					MCList<MfgInstReg_Chk01_DtlByProdR> notErrDown5 = MCList.create(MfgInstReg_Chk01_DtlByProdR.class);
					MCIndexKey down5Key = chkOpe.down5().createIndex(MfgInstReg_Chk01_DtlByProdR.$hdr_peg_no);
					for (MfgInstReg_Chk01_HdrR r : notErrDown0) {
						notErrDown5.addAll(chkOpe.down5().subList(down5Key, r.peg_no()));
					}
	
					MfgInstReg_Upd02_Hdr().setAll(notErrDown0);
					MfgInstReg_Upd02_DtlOper().setAll(notErrDown1);
					MfgInstReg_Upd02_DtlInpt().setAll(notErrDown2);
					MfgInstReg_Upd02_DtlWk().setAll(notErrDown3);
					MfgInstReg_Upd02_DtlYield().setAll(notErrDown4);
					MfgInstReg_Upd02_DtlByProd().setAll(notErrDown5);
				}
			}
		}

		/**
		 * 工程単位での更新処理
		 */
		protected void callThisUpd01OperMode(MCList<MfgInstReg_Upd02_Hdr1R> upL){
			mapUpContainers(MIR1);
			mirUpd01.exec();
			mapDownContainers(MIR1);
			
			MCIndexKey hdrIdxkey = mirUpd01.down0().createIndex(MfgInstReg_Upd01_HdrR.$peg_no);
			MCIndexKey operIdxkey = mirUpd01.down1().createIndex(MfgInstReg_Upd01_DtlOperR.$peg_no);
			
			for (MfgInstReg_Upd02_Hdr1R upR : upL) {
				MfgInstReg_Upd01_DtlOperR operDownR = mirUpd01.down1().getFirst(operIdxkey, upR.peg_no());
				if (!isNull(operDownR)) {
					MfgInstReg_Upd01_HdrR hdrDownR = mirUpd01.down0().getFirst(hdrIdxkey, operDownR.hdr_peg_no());
					if (!isNull(hdrDownR)) {
						upR.mfg_sts_typ(hdrDownR.mfg_sts_typ());
						upR.mfg_sts_typ_nm(hdrDownR.mfg_sts_typ_nm());
						upR.lot_no(hdrDownR.lot_no());
						upR.sublot_no(hdrDownR.sublot_no());
						upR.mfg_inst_no(hdrDownR.mfg_inst_no());
						upR.mfg_inst_rev(hdrDownR.mfg_inst_rev());
						upR.itm_mfg_inst_no(hdrDownR.itm_mfg_inst_no());
						upR.oper_inst_no(operDownR.oper_inst_no());
						upR.alloc_tgt_cnt(operDownR.alloc_tgt_cnt());
						upR.alloc_success_cnt(operDownR.alloc_success_cnt());
						upR.alloc_failure_cnt(operDownR.alloc_failure_cnt());
						upR.lot_inh_err_flg(operDownR.lot_inh_err_flg());
					}
				}
			}
		}

		/**
		 * 工程オーダのワークテーブルを元に工程オーダを取得
		 * @param hdrL
		 * @return
		 */
		protected MCList<MST_OPER_ORDER_R> getOperOrdByWk(
				MCList<MfgInstReg_Chk01_HdrR> hdrL) {
			MCList<MfgInstReg_Chk01_HdrR> bindL = hdrL
					.groupBy(MfgInstReg_Chk01_HdrR.$itm_ord_no);

			MCList<MST_OPER_ORDER_R> operOrdL = MCList.create(MST_OPER_ORDER_R.class);
			MST_OPER_ORDER_R t = MST_OPER_ORDER_R.create("T");
			MCQueryApiBuilder operOrdL_bldr = MCQueryApiBuilder.create(t);
			MST_ITM_ORDER_R t2 = MST_ITM_ORDER_R.create("T2");
			MAM_ITM_OPER_R m1 = MAM_ITM_OPER_R.create("M1");
			MAVM_ITM_DTL_MFG_R m2 = MAVM_ITM_DTL_MFG_R.create("M2");
			MSW_OPER_ORDER_KEY_R t3 = MSW_OPER_ORDER_KEY_R.create("T3");
			MSW_OPER_ORDER_KEY_R S1T3 = MSW_OPER_ORDER_KEY_R.create("S1T3");
			operOrdL_bldr.setSelect(t.itm_ord_no, t.oper_cd, t.oper_seq, t.disp_seq,
					t.oper_ptn, t.st_schd_tm, t.end_schd_tm, t.not_oper_schd_qty,t.oper_rsrc,
					t.yield_oper_flg, t.loc_cd, t.oper_ord_no);
			operOrdL.addBooleanColumn("BKF_FLG");
			operOrdL_bldr.addSelect(m1.oper_inst_grp, m1.yield_oper_ratio, m2.bkf_flg,
					t2.itm_ord_typ);

			operOrdL_bldr.addInnerJoin(t2, bracket(t.itm_ord_no.eq(t2.itm_ord_no)));
			operOrdL_bldr.addLeftOuterJoin(m1, bracket(t2.itm_cd.eq(m1.itm_cd)
					.and(t2.itm_sub1.eq(m1.itm_sub1))
					.and(t2.itm_sub2.eq(m1.itm_sub2))
					.and(t2.itm_sub3.eq(m1.itm_sub3))
					.and(t2.mst_mfg_loc_cd.eq(m1.loc_cd))
					.and(t.oper_ptn.eq(m1.oper_ptn))
					.and(t.oper_cd.eq(m1.oper_cd))
					.and(t.oper_seq.eq(m1.oper_seq))
					.and(t2.mfg_st_schd_dt.between(m1.st_dt, m1.end_dt))));
			operOrdL_bldr.addLeftOuterJoin(m2, bracket(t2.itm_cd.eq(m2.itm_cd)
					.and(t2.itm_sub1.eq(m2.itm_sub1))
					.and(t2.itm_sub2.eq(m2.itm_sub2))
					.and(t2.itm_sub3.eq(m2.itm_sub3))
					.and(t2.mfg_loc_cd.eq(m2.mfg_loc_cd))
					.and(t2.sppl_cd.eq(m2.sppl_cd))
					.and(t2.maker_cd.eq(m2.maker_cd))
					.and(t2.rqst_loc_cd.eq(m2.rqst_loc_cd))
					.and(t2.wg_cd.eq(m2.wg_cd))
					.and(t2.bom_ptn.eq(m2.bom_ptn))
					.and(t2.master_dt.between(m2.st_dt, m2.end_dt))));
			if (bindL.isEmpty()) {
				// バインドが設定されていない場合はワークテーブルに存在する工程オーダＮＯのレコードを抽出
				operOrdL_bldr.addInnerJoin(t3, bracket(t3.oper_ord_no.eq(t.oper_ord_no)));
				dbSelect("MSBCL6000_MST_OPER_ORDER_S03", operOrdL, operOrdL_bldr);
			}
			else {
				// バインドが設定されている場合は品目オーダＮＯを指定し、ワークテーブルに存在する工程オーダＮＯのレコードを除外
				operOrdL_bldr.setWhere(t.itm_ord_no.eq(bind("itm_ord_no")));
				operOrdL_bldr
						.addWhereWithAnd(notExists(subQuery().select(S1T3.oper_ord_no)
								.from(S1T3).where(S1T3.oper_ord_no.eq(t.oper_ord_no))));
				dbSelect("MSBCL6000_MST_OPER_ORDER_S04", operOrdL, operOrdL_bldr, bindL);
			}
			return operOrdL;
		}

		/**
		 * 上り電文から工程指図を取得
		 * @param upL
		 * @return
		 */
		protected MCList<MST_OPER_INST_R> getOperInstOperMode(
				MCList<MfgInstReg_Upd02_Hdr1R> upL) {
			MCList<MST_OPER_INST_R> oiL = MCList.create(MST_OPER_INST_R.class);
			MST_OPER_INST_R t = MST_OPER_INST_R.create("T");
			MCQueryApiBuilder oiL_bldr = MCQueryApiBuilder.create(t);
			oiL_bldr.setSelect(t.mfg_inst_no, t.oper_cd, t.oper_seq, t.st_schd_tm,
					t.end_schd_tm, t.base_unit_qty, t.oper_loc_cd, t.oper_str_ln_cd,
					t.usr_cd, t.oper_abort_flg, t.disp_seq, t.intr_rmrks,
					t.inst_rpt_rmrks, t.sub_char1, t.sub_char2, t.sub_char3,
					t.yield_oper_flg, t.yield_oper_ratio, t.bkf_flg,
					t.wk_cost_calc_flg, t.oper_inst_grp, t.oper_ord_no, t.oper_inst_no,
					t.unschd_act_flg);
			oiL_bldr.setWhere(t.oper_inst_no.eq(bind("oper_inst_no")));
			oiL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6000_MST_OPER_INST_S06", oiL, oiL_bldr, upL);
			return oiL;
		}

		// 投入予定の取得（工程単位製造指図）
		protected MCList<MST_INPT_SCHD_R> getInptSchdOperMode(
				MCList<MfgInstReg_Chk01_DtlOperR> bindL) {
			MCList<MST_INPT_SCHD_R> isL = MCList.create(MST_INPT_SCHD_R.class);
			MST_INPT_SCHD_R t = MST_INPT_SCHD_R.create("T");
			MCQueryApiBuilder isL_bldr = MCQueryApiBuilder.create(t);
			MSVT_LOT_LIST_R t1 = MSVT_LOT_LIST_R.create("T1");
			isL_bldr.setSelect(t.mfg_inst_no, t.oper_inst_no, t.alt_grp_cd, t.alt_grp_seq,
					t.alt_itm_fix_flg, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.ver_no, t.base_unit_alt_qty, t.base_unit_inpt_qty,
					t.base_unit_rqmt_qty, t.base_unit_fxd_rqmt_qty, t.cont_inpt_qty,
					t.cont_rqmt_qty, t.cont_fxd_rqmt_qty, t.schd_tm, t.alloc_flg,
					t.inst_lot_fix_flg, t.lot_no, t.sublot_no, t.sno1, t.sno1_null_flg,
					t.sno2, t.sno2_null_flg, t.sno3, t.sno3_null_flg, t.sno4,
					t.sno4_null_flg, t.alloc_sno1, t.alloc_sno2, t.alloc_sno3,
					t.alloc_sno4, t.inpt_loc_cd, t.inpt_str_ln_cd, t.gd_cd, t.intr_rmrks,
					t.inpt_rsn_cd, t.inst_rpt_rmrks, t.sub_char1, t.sub_char2,
					t.sub_char3, t.bkf_typ, t.par_inst_qty, t.chd_inpt_qty,
					t.chd_rqmt_qty, t.fxd_chd_rqmt_qty, t.main_itm_flg, t.bom_id_no,
					t.chd_itm_seq, t.bom_memo1, t.bom_memo2, t.bom_memo3,
					t.yield_calc_flg, t.alloc_ctl_typ, t.inpt_ctl_typ, t.in_offst_typ,
					t.in_offst, t.lot_mix_flg, t.sublot_mix_flg, t.prov_typ,
					t.alt_itm_typ, t.alt_alloc_prio, t.alt_itm_ratio, t.inpt_schd_no,
					t.disp_seq);
			isL_bldr.addSelect(t1.first_gr_dt, t1.lot_seq);
			isL_bldr.addLeftOuterJoin(t1,
					bracket(t.itm_cd.eq(t1.itm_cd)
							.and(t.itm_sub1.eq(t1.itm_sub1))
							.and(t.itm_sub2.eq(t1.itm_sub2))
							.and(t.itm_sub3.eq(t1.itm_sub3))
							.and(t.lot_no.eq(t1.lot_no))
							.and(t.sublot_no.eq(t1.sublot_no))));
			isL_bldr.setWhere(t.oper_inst_no.eq(bind("oper_inst_no")));
			isL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));

			dbSelect("MSBCL6000_MST_INPT_SCHD_S07", isL, isL_bldr, bindL);

			return isL;
		}
		
		// 工数予定の取得（工程単位製造指図）
		protected MCList<MST_WK_SCHD_R> getWkSchdOperMode(MCList<MfgInstReg_Chk01_DtlOperR> bindL){
			MCList<MST_WK_SCHD_R> wsL = MCList.create(MST_WK_SCHD_R.class);
			MST_WK_SCHD_R t = MST_WK_SCHD_R.create("T");
			MCQueryApiBuilder wsL_bldr = MCQueryApiBuilder.create(t);
			wsL_bldr.setSelect(t.mfg_inst_no, t.oper_inst_no,
					t.wk_cost_cd, t.wk_cost,
					t.fxd_wk_cost, t.wk_cost_calc_flg,
					t.intr_rmrks, t.sub_char1,
					t.sub_char2, t.sub_char3,
					t.wk_schd_no, t.disp_seq);
			wsL_bldr.setWhere(t.oper_inst_no.eq(bind("oper_inst_no")));
			wsL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			
			dbSelect("MSBCL6000_MST_WK_SCHD_S05", wsL, wsL_bldr, bindL);

			return wsL;
		}
		
		// 出来高予定の取得（製造品の出来高と副産品の出来高を、同時に取得する）工程単位製造指図
		protected MCList<MST_YIELD_SCHD_R> getYieldSchdOperMode(
				MCList<MfgInstReg_Chk01_DtlOperR> bindL) {
			MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder ysL_bldr = MCQueryApiBuilder.create(t);
			ysL_bldr.setSelect(t.mfg_inst_no, t.oper_inst_no, t.yield_typ, t.itm_cd,
					t.itm_sub1, t.itm_sub2, t.itm_sub3, t.trd_unit_cd,
					t.trd_unit_yield_qty, t.schd_tm, t.lot_no, t.sublot_no, t.sno1,
					t.sno2, t.sno3, t.sno4, t.strg_loc_cd, t.strg_str_ln_cd, t.bkf_typ,
					t.par_inst_qty, t.chd_inpt_qty, t.chd_rqmt_qty, t.fxd_chd_rqmt_qty,
					t.intr_rmrks, t.inst_rpt_rmrks, t.insp_cnt_rmrks, t.sub_char1,
					t.sub_char2, t.sub_char3, t.yield_schd_no, t.disp_seq);
			ysL_bldr.setWhere(t.oper_inst_no.eq(bind("oper_inst_no")));
			ysL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));

			dbSelect("MSBCL6000_MST_YIELD_SCHD_S06", ysL, ysL_bldr, bindL);

			return ysL;
		}

		/**
		 * ヘッダまたは工程の紐付けＮＯから上り電文のキャッシュを取得する
		 * @param hdrCache
		 * @param operCache
		 * @param hdrPegNo
		 * @param operPegNo
		 * @return
		 */
		protected MfgInstReg_Upd02_Hdr1R getUpCache(FXUCL_Cache<MfgInstReg_Upd02_Hdr1R> hdrCache, FXUCL_Cache<MfgInstReg_Upd02_Hdr1R> operCache, MCNumber hdrPegNo, MCNumber operPegNo) {
			// 工程紐付けＮＯでキャッシュを取得する
			MfgInstReg_Upd02_Hdr1R upR = operCache.getCache(operPegNo);
			if (!isNull(upR)) {
				return upR;
			}
			
			// キャッシュが取得できない場合（新規登録で上り電文に存在せず、工程オーダから補完された場合）、ヘッダ紐付けＮＯでキャッシュを取得する
			upR = hdrCache.getCache(hdrPegNo);
			if (!isNull(upR)) {
				return upR;
			}
			
			return MfgInstReg_Upd02_Hdr1R.create();
		}
		
		/**
		 * 処理対象の工程オーダＮＯをワークテーブルに追加
		 * @param upL
		 */
		protected void insOperOrdWk(MCList<MfgInstReg_Upd02_Hdr1R> upL) {
			MCList<MST_OPER_ORDER_R> wkL = MCList.create(MST_OPER_ORDER_R.class);
			MST_OPER_ORDER_R t = MST_OPER_ORDER_R.create("T");
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(t);
			dbWkDelete("MSBCL6000_MSW_OPER_ORDER_D01", wkL_bldr.getBaseDbc());

			for (MfgInstReg_Upd02_Hdr1R upR : upL) {
				MST_OPER_ORDER_R wkR = MST_OPER_ORDER_R.create();
				wkR.oper_ord_no(upR.oper_ord_no());
				wkL.add(wkR);
			}
			if (!wkL.isEmpty()) {
				dbWkInsert("MSBCL6000_MSW_OPER_ORDER_I01",
						wkL.groupBy(t.getKeyColumn()), wkL_bldr.getBaseDbc());
			}
		}
		
		/**
		 * 予定再展開が必要な工程かどうかを返す
		 * @param newR
		 * @param oldR
		 */
		protected boolean reExpSchd(MfgInstReg_Chk01_DtlOperR newR, MST_OPER_INST_R oldR) {
			// 基準単位数量が変更されている場合は対象
			if (!isSame(newR.base_unit_qty(), oldR.base_unit_qty())) {
				return true;
			}
			// 着手日が変更されている場合は対象
			if (!isSame(newR.st_schd_tm(), oldR.st_schd_tm())) {
				return true;
			}
			// 終了日が変更されている場合は対象
			if (!isSame(newR.end_schd_tm(), oldR.end_schd_tm())) {
				return true;
			}
			return false;
		}
		
		/**
		 * 更新時に品目製造指図の値をヘッダコンテナにコピーする
		 * @param chk01HdrR
		 * @param imiR
		 * @param ioR
		 */
		protected void editChk01HdrByImiR(MfgInstReg_Chk01_HdrR chk01HdrR, MST_ITM_MFG_INST_R imiR, MST_ITM_ORDER_R ioR) {
			chk01HdrR.mfg_mtd_typ(imiR.mfg_mtd_typ());
			chk01HdrR.master_dt(imiR.master_dt());
			chk01HdrR.itm_cd(imiR.itm_cd());
			chk01HdrR.itm_sub1(imiR.itm_sub1());
			chk01HdrR.itm_sub2(imiR.itm_sub2());
			chk01HdrR.itm_sub3(imiR.itm_sub3());
			chk01HdrR.inst_po_cnt_rmrks(ioR.inst_po_cnt_rmrks());
		}

		/**
		 * 同一の製造指図となる上り電文に対して、同一のキーを設定
		 * @param upL
		 * @param key
		 */
		protected void setSameMfgInstKey(MCList<MfgInstReg_Upd02_Hdr1R> upL, String no) {

			MCNumber key = MCNumber.ZERO;
			// ＮＯ（品目オーダＮＯまたは品目製造指図ＮＯ）＋工程指図Ｇ単位に同一製造指図キーを発番
			for (MCList<MfgInstReg_Upd02_Hdr1R> subL : upL.groupList(no,
					MfgInstReg_Upd02_Hdr1R.$oper_inst_grp)) {
				MfgInstReg_Upd02_Hdr1R row = subL.get(0);
				
				if (isNull(row.oper_inst_grp())) {
					// 工程指図Ｇが未設定の場合、行単位に発番
					for (MfgInstReg_Upd02_Hdr1R r : subL) {
						r.same_mfg_inst_key(key);
						key = key.add(MCNumber.ONE);
					}
				}
				else {
					// 工程指図Ｇが設定済の場合、工程指図Ｇ単位に発番
					subL.setNumberNE(MfgInstReg_Upd02_Hdr1R.$same_mfg_inst_key, key);
					key = key.add(MCNumber.ONE);
				}
			}
		}
		
		/**
		 * 新規登録の場合のチェックコンテナ（各種明細）の作成（工程単位製造指図）
		 */
		protected void setChkContainerInsOperMode(MCList<MfgInstReg_Chk01_HdrR> hdrL,
				MCList<MfgInstReg_Chk01_DtlOperR> operL,
				MCList<MfgInstReg_Chk01_DtlInptR> inptL,
				MCList<MfgInstReg_Chk01_DtlWkR> wkL,
				MCList<MfgInstReg_Chk01_DtlYieldR> yieldL,
				MCList<MfgInstReg_Chk01_DtlByProdR> byProdL) {
			
			if (operL.isEmpty()) {
				return;
			}
			
			// 再展開処理は初回製造指図のみをヘッダコンテナとして再展開サービスに渡す
			// 初回以外に紐付く工程は、初回製造指図に紐付くように再展開用紐付けＮＯを設定する
			MCList<MfgInstReg_Chk01_HdrR> frstL = hdrL.subList(r -> !r.not_frst_inst_reg_oper_flg());
			MCIndexKey frstIdx = frstL.createIndex(MfgInstReg_Chk01_HdrR.$itm_ord_no);
			MCIndexKey hdrIdx = hdrL.createIndex(MfgInstReg_Chk01_HdrR.$peg_no);
			for (MfgInstReg_Chk01_DtlOperR operR : operL) {
				// 工程が紐付くヘッダを取得
				MfgInstReg_Chk01_HdrR hdrR = hdrL.getFirst(hdrIdx, operR.hdr_peg_no());
				if (hdrR.not_frst_inst_reg_oper_flg()) {
					// ヘッダが初回製造指図以外の場合、同一オーダＮＯの初回製造指図を取得
					MfgInstReg_Chk01_HdrR frstR = frstL.getFirst(frstIdx, hdrR.itm_ord_no());
					if (isNull(frstR)) {
						// 初回製造指図が取得できない場合は再展開用紐付けＮＯにヘッダ紐付けＮＯを設定
						operR.re_exp_peg_no(hdrR.peg_no());
					}
					else {
						// 初回製造指図が取得できた場合は再展開用紐付けＮＯに初回製造指図のヘッダ紐付けＮＯを設定
						operR.re_exp_peg_no(frstR.peg_no());
					}
				}
				// ヘッダが初回製造指図の場合、再展開用紐付けＮＯにヘッダ紐付けＮＯを設定
				else {
					operR.re_exp_peg_no(hdrR.peg_no());
				}
			}
			
			MSBCL_ReExpService.ReExp_Sprt04 ope = MSBCL_ReExpService.crtReExp_Sprt04();
			addAll(ope.up0(), frstL, createMap_ReExp_Sprt04_HdrR_MfgInstReg_Chk01_HdrR());
			addAll(ope.up1(), operL, createMap_ReExp_Sprt04_DtlOperR_MfgInstReg_Chk01_DtlOperR());

			ope.exec();

			addAll(inptL, ope.down1(), createMap_MfgInstReg_Chk01_DtlInptR_ReExp_Sprt01_RsltInptR());
			addAll(wkL, ope.down3(), createMap_MfgInstReg_Chk01_DtlWkR_ReExp_Sprt02_RsltWkR());
			addAll(yieldL, ope.down0(), createMap_MfgInstReg_Chk01_DtlYieldR_ReExp_Sprt03_RsltYieldR());
			addAll(byProdL, ope.down2(), createMap_MfgInstReg_Chk01_DtlByProdR_ReExp_Sprt01_RsltByProdR());

			// 各明細に設定されたヘッダ紐付けＮＯは再展開用紐付けＮＯのため、本来のヘッダ紐付けＮＯに戻す
			MCIndexKey inptIdx = inptL.createIndex(MfgInstReg_Chk01_DtlInptR.$oper_peg_no);
			MCIndexKey wkIdx = wkL.createIndex(MfgInstReg_Chk01_DtlWkR.$oper_peg_no);
			MCIndexKey yieldIdx = yieldL.createIndex(MfgInstReg_Chk01_DtlYieldR.$oper_peg_no);
			MCIndexKey byProdIdx = byProdL.createIndex(MfgInstReg_Chk01_DtlByProdR.$oper_peg_no);

			for (MfgInstReg_Chk01_DtlOperR operR : operL) {
				MCList<MfgInstReg_Chk01_DtlInptR> inptSubL = inptL.subList(inptIdx, operR.peg_no());
				MCList<MfgInstReg_Chk01_DtlWkR> wkSubL = wkL.subList(wkIdx, operR.peg_no());
				MCList<MfgInstReg_Chk01_DtlYieldR> yieldSubL = yieldL.subList(yieldIdx, operR.peg_no());
				MCList<MfgInstReg_Chk01_DtlByProdR> byProdSubL = byProdL.subList(byProdIdx, operR.peg_no());
				
				inptSubL.setNumberNE(MfgInstReg_Chk01_DtlInptR.$hdr_peg_no, operR.hdr_peg_no());
				wkSubL.setNumberNE(MfgInstReg_Chk01_DtlWkR.$hdr_peg_no, operR.hdr_peg_no());
				yieldSubL.setNumberNE(MfgInstReg_Chk01_DtlYieldR.$hdr_peg_no, operR.hdr_peg_no());
				byProdSubL.setNumberNE(MfgInstReg_Chk01_DtlByProdR.$hdr_peg_no, operR.hdr_peg_no());
			}
		}
		
		/**
		 * 更新の場合のチェックコンテナ（各種明細）の作成（工程単位製造指図）
		 */
		protected void setChkContainerUpdOperMode(MCList<MfgInstReg_Chk01_HdrR> hdrL,
				MCList<MfgInstReg_Chk01_DtlOperR> operL,
				MCList<MfgInstReg_Chk01_DtlInptR> inptL,
				MCList<MfgInstReg_Chk01_DtlWkR> wkL,
				MCList<MfgInstReg_Chk01_DtlYieldR> yieldL,
				MCList<MfgInstReg_Chk01_DtlByProdR> byProdL){
			
			MCList<MfgInstReg_Chk01_DtlOperR> bindL = operL.groupBy(MfgInstReg_Chk01_DtlOperR.$oper_inst_no);
			
			MCList<MST_INPT_SCHD_R> isL = getInptSchdOperMode(bindL);
			MCList<MST_WK_SCHD_R> wsL = getWkSchdOperMode(bindL);
			MCList<MST_YIELD_SCHD_R> ysL = getYieldSchdOperMode(bindL);
			
			MCIndexKey isKey = isL.createIndex(MST_INPT_SCHD_R.$oper_inst_no);
			MCIndexKey wsKey = wsL.createIndex(MST_WK_SCHD_R.$oper_inst_no);
			MCIndexKey ysKey = ysL.createIndex(MST_YIELD_SCHD_R.$oper_inst_no);
			for (MfgInstReg_Chk01_DtlOperR operR : operL) {
				// 投入コンテナ
				MCList<MST_INPT_SCHD_R> isSubL = isL.subList(isKey, operR.oper_inst_no());
				for (MST_INPT_SCHD_R isR : isSubL) {
					MfgInstReg_Chk01_DtlInptR chk01InptR = MfgInstReg_Chk01_DtlInptR.create();
					copy(chk01InptR, isR, createMap_MfgInstReg_Chk01_DtlInptR_MST_INPT_SCHD_R());
					chk01InptR.hdr_peg_no(operR.hdr_peg_no());
					chk01InptR.oper_peg_no(operR.peg_no());
					inptL.add(chk01InptR);
				}
				
				// 工数コンテナ
				MCList<MST_WK_SCHD_R> wsSubL = wsL.subList(wsKey, operR.oper_inst_no());
				for (MST_WK_SCHD_R wsR : wsSubL) {
					MfgInstReg_Chk01_DtlWkR chk01WkR = MfgInstReg_Chk01_DtlWkR.create();
					copy(chk01WkR, wsR, createMap_MfgInstReg_Chk01_DtlWkR_MST_WK_SCHD_R());
					chk01WkR.hdr_peg_no(operR.hdr_peg_no());
					chk01WkR.oper_peg_no(operR.peg_no());
					wkL.add(chk01WkR);
				}
				
				// 出来高コンテナ
				MCList<MST_YIELD_SCHD_R> ysSubL = ysL
						.subList(ysKey, operR.oper_inst_no())
						.subList(MST_YIELD_SCHD_R.$yield_typ, MAC_YIELD_TYP.GOOD.value());
				for (MST_YIELD_SCHD_R ysR : ysSubL) {
					MfgInstReg_Chk01_DtlYieldR chk01YieldR = MfgInstReg_Chk01_DtlYieldR.create();
					copy(chk01YieldR, ysR, createMap_MfgInstReg_Chk01_DtlYieldR_MST_YIELD_SCHD_R());
					chk01YieldR.hdr_peg_no(operR.hdr_peg_no());
					chk01YieldR.oper_peg_no(operR.peg_no());
					yieldL.add(chk01YieldR);
				}
				
				// 副産品コンテナ
				MCList<MST_YIELD_SCHD_R> byProdSubL = ysL
						.subList(ysKey, operR.oper_inst_no())
						.subList(MST_YIELD_SCHD_R.$yield_typ, MAC_YIELD_TYP.BYPROD.value());
				for (MST_YIELD_SCHD_R byProdR : byProdSubL) {
					MfgInstReg_Chk01_DtlByProdR chk01ByProdR = MfgInstReg_Chk01_DtlByProdR.create();
					copy(chk01ByProdR, byProdR, createMap_MfgInstReg_Chk01_DtlByProdR_MST_YIELD_SCHD_R());
					chk01ByProdR.hdr_peg_no(operR.hdr_peg_no());
					chk01ByProdR.oper_peg_no(operR.peg_no());
					byProdL.add(chk01ByProdR);
				}
			}
		}

		/**
		 * 予定再展開＋更新の場合のチェックコンテナ（各種明細）の作成（工程単位製造指図）
		 */
		protected void setChkContainerReExpOperMode(MCList<MfgInstReg_Chk01_HdrR> hdrL,
				MCList<MfgInstReg_Chk01_DtlOperR> operL,
				MCList<MfgInstReg_Chk01_DtlInptR> inptL,
				MCList<MfgInstReg_Chk01_DtlWkR> wkL,
				MCList<MfgInstReg_Chk01_DtlYieldR> yieldL,
				MCList<MfgInstReg_Chk01_DtlByProdR> byProdL){
			
			MSBCL_ReExpService.ReExp_Sprt06 ope = MSBCL_ReExpService.crtReExp_Sprt06();
			addAll(ope.up0(), hdrL, createMap_ReExp_Sprt06_HdrR_MfgInstReg_Chk01_HdrR());
			addAll(ope.up1(), operL, createMap_ReExp_Sprt06_DtlOperR_MfgInstReg_Chk01_DtlOperR());

			MCList<MfgInstReg_Chk01_DtlOperR> bindL = operL.groupBy(MfgInstReg_Chk01_DtlOperR.$oper_inst_no);
			
			MCList<MST_INPT_SCHD_R> isL = getInptSchdOperMode(bindL);
			MCList<MST_WK_SCHD_R> wsL = getWkSchdOperMode(bindL);
			MCList<MST_YIELD_SCHD_R> ysL = getYieldSchdOperMode(bindL);
			
			MCIndexKey isKey = isL.createIndex(MST_INPT_SCHD_R.$oper_inst_no);
			MCIndexKey wsKey = wsL.createIndex(MST_WK_SCHD_R.$oper_inst_no);
			MCIndexKey ysKey = ysL.createIndex(MST_YIELD_SCHD_R.$oper_inst_no, MST_YIELD_SCHD_R.$yield_typ);

			MCNumber yieldPegNo = MCNumber.ZERO;
			MCNumber inptPegNo = MCNumber.ZERO;
			MCNumber wkPegNo = MCNumber.ZERO;
			MCNumber byProdPegNo = MCNumber.ZERO;
			
			for (MfgInstReg_Chk01_DtlOperR operR : operL) {
				// 出来高コンテナ
				MCList<MST_YIELD_SCHD_R> ysSubL = ysL.subList(ysKey,
						operR.oper_inst_no(), MAC_YIELD_TYP.GOOD.value());
				for (MST_YIELD_SCHD_R ysR : ysSubL) {
					yieldPegNo = yieldPegNo.add(MCNumber.ONE);
					// 予定再展開用コンテナ
					ReExp_Sprt03_DtlYieldR yieldR = ReExp_Sprt03_DtlYieldR.create();
					copy(yieldR, ysR, createMap_ReExp_Sprt03_DtlYieldR_MST_YIELD_SCHD_R());
					yieldR.hdr_peg_no(operR.hdr_peg_no());
					yieldR.oper_peg_no(operR.peg_no());
					yieldR.peg_no(yieldPegNo);
					ope.up2().add(yieldR);
					
					// Chk01用コンテナ
					MfgInstReg_Chk01_DtlYieldR chk01YieldR = MfgInstReg_Chk01_DtlYieldR.create();
					copy(chk01YieldR, ysR, createMap_MfgInstReg_Chk01_DtlYieldR_MST_YIELD_SCHD_R());
					chk01YieldR.hdr_peg_no(operR.hdr_peg_no());
					chk01YieldR.oper_peg_no(operR.peg_no());
					chk01YieldR.peg_no(yieldPegNo);
					yieldL.add(chk01YieldR);
				}
				
				// 投入コンテナ
				MCList<MST_INPT_SCHD_R> isSubL = isL.subList(isKey, operR.oper_inst_no());
				for (MST_INPT_SCHD_R isR : isSubL) {
					inptPegNo = inptPegNo.add(MCNumber.ONE);
					// 予定再展開用コンテナ
					ReExp_Sprt01_DtlInptR inptR = ReExp_Sprt01_DtlInptR.create();
					copy(inptR, isR, createMap_ReExp_Sprt01_DtlInptR_MST_INPT_SCHD_R());
					inptR.hdr_peg_no(operR.hdr_peg_no());
					inptR.oper_peg_no(operR.peg_no());
					inptR.oper_cd(operR.oper_cd());
					inptR.oper_seq(operR.oper_seq());
					inptR.first_gr_dt(isR.getDateNE("FIRST_GR_DT"));
					inptR.lot_seq(isR.getStringNE("LOT_SEQ"));
					inptR.peg_no(inptPegNo);
					ope.up3().add(inptR);
					
					// Chk01用コンテナ
					MfgInstReg_Chk01_DtlInptR chk01InptR = MfgInstReg_Chk01_DtlInptR.create();
					copy(chk01InptR, isR, createMap_MfgInstReg_Chk01_DtlInptR_MST_INPT_SCHD_R());
					chk01InptR.hdr_peg_no(operR.hdr_peg_no());
					chk01InptR.oper_peg_no(operR.peg_no());
					chk01InptR.peg_no(inptPegNo);
					inptL.add(chk01InptR);
				}
				
				// 副産品コンテナ
				MCList<MST_YIELD_SCHD_R> byProdSubL = ysL.subList(ysKey,
						operR.oper_inst_no(), MAC_YIELD_TYP.BYPROD.value());
				for (MST_YIELD_SCHD_R ysR : byProdSubL) {
					byProdPegNo = byProdPegNo.add(MCNumber.ONE);
					// 予定再展開用コンテナ
					ReExp_Sprt01_DtlByProdR byProdR = ReExp_Sprt01_DtlByProdR.create();
					copy(byProdR, ysR, createMap_ReExp_Sprt01_DtlByProdR_MST_YIELD_SCHD_R());
					byProdR.hdr_peg_no(operR.hdr_peg_no());
					byProdR.oper_peg_no(operR.peg_no());
					byProdR.oper_cd(operR.oper_cd());
					byProdR.oper_seq(operR.oper_seq());
					byProdR.peg_no(byProdPegNo);
					ope.up4().add(byProdR);
					
					// Chk01用コンテナ
					MfgInstReg_Chk01_DtlByProdR chk01ByProdR = MfgInstReg_Chk01_DtlByProdR.create();
					copy(chk01ByProdR, ysR, createMap_MfgInstReg_Chk01_DtlByProdR_MST_YIELD_SCHD_R());
					chk01ByProdR.hdr_peg_no(operR.hdr_peg_no());
					chk01ByProdR.oper_peg_no(operR.peg_no());
					chk01ByProdR.peg_no(byProdPegNo);
					byProdL.add(chk01ByProdR);
				}

				// 工数コンテナ
				MCList<MST_WK_SCHD_R> wsSubL = wsL.subList(wsKey, operR.oper_inst_no());
				for (MST_WK_SCHD_R wsR : wsSubL) {
					wkPegNo = wkPegNo.add(MCNumber.ONE);
					// 予定再展開用コンテナ
					ReExp_Sprt02_DtlWkR wkR = ReExp_Sprt02_DtlWkR.create();
					copy(wkR, wsR, createMap_ReExp_Sprt02_DtlWkR_MST_WK_SCHD_R());
					wkR.hdr_peg_no(operR.hdr_peg_no());
					wkR.oper_peg_no(operR.peg_no());
					wkR.oper_cd(operR.oper_cd());
					wkR.oper_seq(operR.oper_seq());
					wkR.peg_no(wkPegNo);
					ope.up5().add(wkR);
					
					// Chk01用コンテナ
					MfgInstReg_Chk01_DtlWkR chk01WkR = MfgInstReg_Chk01_DtlWkR.create();
					copy(chk01WkR, wsR, createMap_MfgInstReg_Chk01_DtlWkR_MST_WK_SCHD_R());
					chk01WkR.hdr_peg_no(operR.hdr_peg_no());
					chk01WkR.oper_peg_no(operR.peg_no());
					chk01WkR.peg_no(wkPegNo);
					wkL.add(chk01WkR);
				}
			}
			
			ope.exec();

			// 予定再展開の結果をChk01用コンテナに設定
			MCIndexKey yieldIdx = yieldL.createIndex(MfgInstReg_Chk01_DtlYieldR.$peg_no);
			MCIndexKey inptIdx = inptL.createIndex(MfgInstReg_Chk01_DtlInptR.$peg_no);
			MCIndexKey byProdIdx = byProdL.createIndex(MfgInstReg_Chk01_DtlByProdR.$peg_no);
			MCIndexKey wkIdx = wkL.createIndex(MfgInstReg_Chk01_DtlWkR.$peg_no);

			// 出来高
			MCList<MfgInstReg_Chk01_DtlYieldR> addYieldL = MCList.create(MfgInstReg_Chk01_DtlYieldR.class);
			for (ReExp_Sprt03_RsltYieldR r : ope.down0()) {
				// 紐付けＮＯがnullの場合は再展開結果をそのまま設定。null以外の場合はテーブルから設定し、数値、日付項目のみ再展開結果から設定
				if (isNull(r.peg_no())) {
					MfgInstReg_Chk01_DtlYieldR addR = MfgInstReg_Chk01_DtlYieldR.create();
					yieldPegNo = yieldPegNo.add(MCNumber.ONE);
					copy(addR, r, createMap_MfgInstReg_Chk01_DtlYieldR_ReExp_Sprt03_RsltYieldR());
					addR.peg_no(yieldPegNo);
					addYieldL.add(addR);
				}
				else {
					MfgInstReg_Chk01_DtlYieldR chkR = yieldL.getFirst(yieldIdx, r.peg_no());
					chkR.setAttributes(r);
					chkR.trd_unit_yield_qty(r.trd_unit_qty());
					chkR.base_unit_yield_qty(r.base_unit_qty());
					chkR.schd_tm(r.yield_schd_dt());
				}
			}
			yieldL.addAll(addYieldL);
			
			// 代替品目指定された品目が存在する代替グループのリスト
			MCList<MfgInstReg_Chk01_DtlInptR> altL = getExistsFixedItmAltGrpL(inptL);
			MCIndexKey altKey = altL.createIndex(MfgInstReg_Chk01_DtlInptR.$alt_grp_cd, MfgInstReg_Chk01_DtlInptR.$alt_grp_seq);
			// 投入
			MCList<MfgInstReg_Chk01_DtlInptR> addInptL = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
			for (ReExp_Sprt01_RsltInptR r : ope.down1()) {
				if (isNull(r.peg_no())) {
					// 紐付けＮＯがnullの場合は再展開結果をそのまま設定
					inptPegNo = inptPegNo.add(MCNumber.ONE);
					MfgInstReg_Chk01_DtlInptR addR = MfgInstReg_Chk01_DtlInptR.create();
					copy(addR, r, createMap_MfgInstReg_Chk01_DtlInptR_ReExp_Sprt01_RsltInptR());
					addR.peg_no(inptPegNo);
					addInptL.add(addR);
				}
				else {
					// 紐付けＮＯがnull以外の場合
					MfgInstReg_Chk01_DtlInptR chkR = inptL.getFirst(inptIdx, r.peg_no());
					chkR.disp_seq_upd_flg(false);
					if (r.re_exp_flg()) {
						// 再展開実施対象となった場合
						if (isNotFixedAltItm(chkR, altL, altKey)) {
							// 代替品目指定されたレコードが存在する代替グループで、自分自身の代替品目指定がオフの場合は何もしない
							// ただし再展開結果として削除されている場合は削除ステータスにしたいので、属性値のみコピーする
							if (r.isStatusDelete()) {
								chkR.setAttributes(r);
							}
						}
						else {
							// 上記以外の場合、テーブルの値に再展開結果を上書き
							copy(chkR, r, createMap_MfgInstReg_Chk01_DtlInptR_ReExp_Sprt01_RsltInptR_Upd());
						}
					}
					else {
						// 再展開実施対象外となった場合、属性値のみコピー（Rowステータスを設定）
						chkR.setAttributes(r);
					}
				}
			}
			inptL.addAll(addInptL);

			// 工数
			MCList<MfgInstReg_Chk01_DtlWkR> addWkL = MCList.create(MfgInstReg_Chk01_DtlWkR.class);
			for (ReExp_Sprt02_RsltWkR r : ope.down3()) {
				if (isNull(r.peg_no())) {
					// 紐付けＮＯがnullの場合は再展開結果をそのまま設定
					wkPegNo = wkPegNo.add(MCNumber.ONE);
					MfgInstReg_Chk01_DtlWkR addR = MfgInstReg_Chk01_DtlWkR.create();
					copy(addR, r, createMap_MfgInstReg_Chk01_DtlWkR_ReExp_Sprt02_RsltWkR());
					addR.peg_no(wkPegNo);
					addWkL.add(addR);
				}
				else {
					// 紐付けＮＯがnull以外の場合
					MfgInstReg_Chk01_DtlWkR wkR = wkL.getFirst(wkIdx, r.peg_no());
					if (r.re_exp_flg()) {
						// 再展開実施対象となった場合、テーブルの値に再展開結果を上書き
						copy(wkR, r, createMap_MfgInstReg_Chk01_DtlWkR_ReExp_Sprt02_RsltWkR_Upd());
					}
					else {
						// 再展開実施対象外となった場合、属性値のみコピー（Rowステータスを設定）
						wkR.setAttributes(r);
					}
				}
			}
			wkL.addAll(addWkL);
			
			// 副産品
			MCList<MfgInstReg_Chk01_DtlByProdR> addByProdL = MCList.create(MfgInstReg_Chk01_DtlByProdR.class);
			for (ReExp_Sprt01_RsltByProdR r : ope.down2()) {
				if (isNull(r.peg_no())) {
					// 紐付けＮＯがnullの場合は再展開結果をそのまま設定
					byProdPegNo = byProdPegNo.add(MCNumber.ONE);
					MfgInstReg_Chk01_DtlByProdR addR = MfgInstReg_Chk01_DtlByProdR.create();
					copy(addR, r, createMap_MfgInstReg_Chk01_DtlByProdR_ReExp_Sprt01_RsltByProdR());
					addR.peg_no(byProdPegNo);
					addByProdL.add(addR);
				}
				else {
					// 紐付けＮＯがnull以外の場合
					MfgInstReg_Chk01_DtlByProdR byProdR = byProdL.getFirst(byProdIdx, r.peg_no());
					if (r.re_exp_flg()) {
						// 再展開実施対象となった場合、テーブルの値に再展開結果を上書き
						copy(byProdR, r, createMap_MfgInstReg_Chk01_DtlByProdR_ReExp_Sprt01_RsltByProdR_Upd());
					}
					else {
						// 再展開実施対象外となった場合、属性値のみコピー（Rowステータスを設定）
						byProdR.setAttributes(r);
					}
				}
			}
			byProdL.addAll(addByProdL);
		}

		/**
		 * 代替品目指定された品目が存在する代替グループのリストを作成
		 * @param tblL
		 * @return
		 */
		protected MCList<MfgInstReg_Chk01_DtlInptR> getExistsFixedItmAltGrpL(
				MCList<MfgInstReg_Chk01_DtlInptR> tblL) {
			MCList<MfgInstReg_Chk01_DtlInptR> retL = MCList
					.create(MfgInstReg_Chk01_DtlInptR.class);

			// 代替品目指定フラグがオンのレコードのみを抽出
			MCList<MfgInstReg_Chk01_DtlInptR> fixL = tblL
					.subList(MfgInstReg_Chk01_DtlInptR.$alt_itm_fix_flg, true);

			// 代替グループＣＤ、代替グループ連番でグループ化
			if (!fixL.isEmpty()) {
				retL = fixL.groupBy(MfgInstReg_Chk01_DtlInptR.$alt_grp_cd,
						MfgInstReg_Chk01_DtlInptR.$alt_grp_seq);
			}

			return retL;
		}

		/**
		 * 代替品目指定されたレコードが存在する代替グループかつ自分自身の代替品目指定がオフの場合にtrueを返す
		 * @param r
		 * @param altL
		 * @param altKey
		 * @return
		 */
		protected boolean isNotFixedAltItm(MfgInstReg_Chk01_DtlInptR r, MCList<MfgInstReg_Chk01_DtlInptR> altL, MCIndexKey altKey) {
			// 代替品目指定がオンの場合はfalse
			if (r.alt_itm_fix_flg()) {
				return false;
			}
			// 代替品目指定された代替のリストが存在しない場合はfalse
			if (altL.isEmpty()) {
				return false;
			}
			// 代替グループＣＤ、代替グループ連番でaltLを参照し、存在しない場合はfalse
			MfgInstReg_Chk01_DtlInptR altR = altL.getFirst(altKey, r.alt_grp_cd(), r.alt_grp_seq());
			if (isNull(altR)) {
				return false;
			}
			// 上記に該当しなければtrue
			return true;
		}
	
		/**
		 * 上り電文から工程コンテナの作成（工程単位製造指図）
		 * @return
		 */
		protected Map_MfgInstReg_Chk01_DtlOperR_MfgInstReg_Upd02_Hdr1R<MfgInstReg_Chk01_DtlOperR,MfgInstReg_Upd02_Hdr1R> createMap_MfgInstReg_Chk01_DtlOperR_MfgInstReg_Upd02_Hdr1R() {
			return new Map_MfgInstReg_Chk01_DtlOperR_MfgInstReg_Upd02_Hdr1R<MfgInstReg_Chk01_DtlOperR, MfgInstReg_Upd02_Hdr1R>();
		}

		public class Map_MfgInstReg_Chk01_DtlOperR_MfgInstReg_Upd02_Hdr1R<D extends MfgInstReg_Chk01_DtlOperR, S extends MfgInstReg_Upd02_Hdr1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$peg_no, MfgInstReg_Upd02_Hdr1R.$peg_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$st_schd_tm, MfgInstReg_Upd02_Hdr1R.$st_schd_tm);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$end_schd_tm, MfgInstReg_Upd02_Hdr1R.$end_schd_tm);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$base_unit_qty, MfgInstReg_Upd02_Hdr1R.$oper_base_unit_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_ptn, MfgInstReg_Upd02_Hdr1R.$oper_ptn);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_loc_cd, MfgInstReg_Upd02_Hdr1R.$oper_loc_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_str_ln_cd, MfgInstReg_Upd02_Hdr1R.$oper_str_ln_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$usr_cd, MfgInstReg_Upd02_Hdr1R.$usr_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$disp_seq, MfgInstReg_Upd02_Hdr1R.$disp_seq);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_rsrc, MfgInstReg_Upd02_Hdr1R.$oper_rsrc);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$intr_rmrks, MfgInstReg_Upd02_Hdr1R.$oper_intr_rmrks);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$inst_rpt_rmrks, MfgInstReg_Upd02_Hdr1R.$oper_inst_rpt_rmrks);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$sub_char1, MfgInstReg_Upd02_Hdr1R.$oper_inst_sub_char1);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$sub_char2, MfgInstReg_Upd02_Hdr1R.$oper_inst_sub_char2);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$sub_char3, MfgInstReg_Upd02_Hdr1R.$oper_inst_sub_char3);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$bkf_flg, MfgInstReg_Upd02_Hdr1R.$bkf_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$wk_cost_calc_flg, MfgInstReg_Upd02_Hdr1R.$wk_cost_calc_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$mfg_sts_typ, MfgInstReg_Upd02_Hdr1R.$mfg_sts_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$mes_flg, MfgInstReg_Upd02_Hdr1R.$mes_flg);
			}
		}
		
		/**
		 * 工程指図から工程コンテナの作成（工程単位製造指図）
		 * @return
		 */
		protected Map_MfgInstReg_Chk01_DtlOperR_MST_OPER_INST_R_Oper<MfgInstReg_Chk01_DtlOperR,MST_OPER_INST_R> createMap_MfgInstReg_Chk01_DtlOperR_MST_OPER_INST_R_Oper() {
			return new Map_MfgInstReg_Chk01_DtlOperR_MST_OPER_INST_R_Oper<MfgInstReg_Chk01_DtlOperR, MST_OPER_INST_R>();
		}

		public class Map_MfgInstReg_Chk01_DtlOperR_MST_OPER_INST_R_Oper<D extends MfgInstReg_Chk01_DtlOperR, S extends MST_OPER_INST_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_cd, MST_OPER_INST_R.$oper_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_seq, MST_OPER_INST_R.$oper_seq);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_ord_no, MST_OPER_INST_R.$oper_ord_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$oper_inst_no, MST_OPER_INST_R.$oper_inst_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$unschd_act_flg, MST_OPER_INST_R.$unschd_act_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$yield_oper_flg, MST_OPER_INST_R.$yield_oper_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlOperR.$yield_oper_ratio, MST_OPER_INST_R.$yield_oper_ratio);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.tgt_oper_flg(true);
			}
		}

		/**
		 * 予定再展開サービスのヘッダコンテナの作成
		 * @return
		 */
		protected Map_ReExp_Sprt06_HdrR_MfgInstReg_Chk01_HdrR<ReExp_Sprt06_HdrR,MfgInstReg_Chk01_HdrR> createMap_ReExp_Sprt06_HdrR_MfgInstReg_Chk01_HdrR() {
			return new Map_ReExp_Sprt06_HdrR_MfgInstReg_Chk01_HdrR<ReExp_Sprt06_HdrR, MfgInstReg_Chk01_HdrR>();
		}

		public class Map_ReExp_Sprt06_HdrR_MfgInstReg_Chk01_HdrR<D extends ReExp_Sprt06_HdrR, S extends MfgInstReg_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt06_HdrR.$peg_no, MfgInstReg_Chk01_HdrR.$peg_no);
				addColumnPathMap(ReExp_Sprt06_HdrR.$mfg_inst_no, MfgInstReg_Chk01_HdrR.$mfg_inst_no);
				addColumnPathMap(ReExp_Sprt06_HdrR.$itm_cd, MfgInstReg_Chk01_HdrR.$itm_cd);
				addColumnPathMap(ReExp_Sprt06_HdrR.$itm_sub1, MfgInstReg_Chk01_HdrR.$itm_sub1);
				addColumnPathMap(ReExp_Sprt06_HdrR.$itm_sub2, MfgInstReg_Chk01_HdrR.$itm_sub2);
				addColumnPathMap(ReExp_Sprt06_HdrR.$itm_sub3, MfgInstReg_Chk01_HdrR.$itm_sub3);
				addColumnPathMap(ReExp_Sprt06_HdrR.$oper_ptn, MfgInstReg_Chk01_HdrR.$oper_ptn);
				addColumnPathMap(ReExp_Sprt06_HdrR.$bom_ptn, MfgInstReg_Chk01_HdrR.$bom_ptn);
				addColumnPathMap(ReExp_Sprt06_HdrR.$strg_loc_cd, MfgInstReg_Chk01_HdrR.$strg_loc_cd);
				addColumnPathMap(ReExp_Sprt06_HdrR.$mfg_loc_cd, MfgInstReg_Chk01_HdrR.$mfg_loc_cd);
				addColumnPathMap(ReExp_Sprt06_HdrR.$mfg_st_schd_dt, MfgInstReg_Chk01_HdrR.$st_schd_tm);
				addColumnPathMap(ReExp_Sprt06_HdrR.$mfg_inst_qty, MfgInstReg_Chk01_HdrR.$base_unit_inst_qty);
				addColumnPathMap(ReExp_Sprt06_HdrR.$yield_schd_qty, MfgInstReg_Chk01_HdrR.$base_unit_yield_qty);
				addColumnPathMap(ReExp_Sprt06_HdrR.$sno3, MfgInstReg_Chk01_HdrR.$sno3);
				addColumnPathMap(ReExp_Sprt06_HdrR.$sno4, MfgInstReg_Chk01_HdrR.$sno4);
				addColumnPathMap(ReExp_Sprt06_HdrR.$strg_str_ln_cd, MfgInstReg_Chk01_HdrR.$strg_str_ln_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// 手配ＮＯがＮＵＬＬの場合はＮＵＬＬ文字補完
				dest.sno1(nvl(src.sno1(), MAC_STR.NULL_VAL.value()));
				dest.sno2(nvl(src.sno2(), MAC_STR.NULL_VAL.value()));
				dest.sno3(nvl(src.sno3(), MAC_STR.NULL_VAL.value()));
				dest.sno4(nvl(src.sno4(), MAC_STR.NULL_VAL.value()));
				// 出来高予定の再展開を行わない
				dest.exp_yield_flg(false);
			}
		}

		/**
		 * 予定再展開サービスの工程コンテナの作成
		 * @return
		 */
		protected Map_ReExp_Sprt06_DtlOperR_MfgInstReg_Chk01_DtlOperR<ReExp_Sprt06_DtlOperR,MfgInstReg_Chk01_DtlOperR> createMap_ReExp_Sprt06_DtlOperR_MfgInstReg_Chk01_DtlOperR() {
			return new Map_ReExp_Sprt06_DtlOperR_MfgInstReg_Chk01_DtlOperR<ReExp_Sprt06_DtlOperR, MfgInstReg_Chk01_DtlOperR>();
		}

		public class Map_ReExp_Sprt06_DtlOperR_MfgInstReg_Chk01_DtlOperR<D extends ReExp_Sprt06_DtlOperR, S extends MfgInstReg_Chk01_DtlOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$peg_no, MfgInstReg_Chk01_DtlOperR.$peg_no);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$hdr_peg_no, MfgInstReg_Chk01_DtlOperR.$hdr_peg_no);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$tgt_oper_flg, MfgInstReg_Chk01_DtlOperR.$tgt_oper_flg);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$oper_ord_no, MfgInstReg_Chk01_DtlOperR.$oper_ord_no);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$oper_inst_no, MfgInstReg_Chk01_DtlOperR.$oper_inst_no);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$mfg_inst_no, MfgInstReg_Chk01_DtlOperR.$mfg_inst_no);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$oper_cd, MfgInstReg_Chk01_DtlOperR.$oper_cd);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$oper_seq, MfgInstReg_Chk01_DtlOperR.$oper_seq);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$oper_loc_cd, MfgInstReg_Chk01_DtlOperR.$oper_loc_cd);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$oper_ptn, MfgInstReg_Chk01_DtlOperR.$oper_ptn);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$oper_inst_qty, MfgInstReg_Chk01_DtlOperR.$base_unit_qty);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$st_schd_tm, MfgInstReg_Chk01_DtlOperR.$st_schd_tm);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$end_schd_tm, MfgInstReg_Chk01_DtlOperR.$end_schd_tm);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$yield_oper_flg, MfgInstReg_Chk01_DtlOperR.$yield_oper_flg);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$yield_oper_ratio, MfgInstReg_Chk01_DtlOperR.$yield_oper_ratio);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$oper_str_ln_cd, MfgInstReg_Chk01_DtlOperR.$oper_str_ln_cd);
			}
		}

		/**
		 * 予定再展開サービスの出来高コンテナの作成
		 * @return
		 */
		protected Map_ReExp_Sprt03_DtlYieldR_MST_YIELD_SCHD_R<ReExp_Sprt03_DtlYieldR,MST_YIELD_SCHD_R> createMap_ReExp_Sprt03_DtlYieldR_MST_YIELD_SCHD_R() {
			return new Map_ReExp_Sprt03_DtlYieldR_MST_YIELD_SCHD_R<ReExp_Sprt03_DtlYieldR, MST_YIELD_SCHD_R>();
		}

		public class Map_ReExp_Sprt03_DtlYieldR_MST_YIELD_SCHD_R<D extends ReExp_Sprt03_DtlYieldR, S extends MST_YIELD_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt03_DtlYieldR.$yield_schd_no, MST_YIELD_SCHD_R.$yield_schd_no);
				addColumnPathMap(ReExp_Sprt03_DtlYieldR.$mfg_inst_no, MST_YIELD_SCHD_R.$mfg_inst_no);
				addColumnPathMap(ReExp_Sprt03_DtlYieldR.$oper_inst_no, MST_YIELD_SCHD_R.$oper_inst_no);
				addColumnPathMap(ReExp_Sprt03_DtlYieldR.$base_unit_qty, MST_YIELD_SCHD_R.$base_unit_yield_qty);
				addColumnPathMap(ReExp_Sprt03_DtlYieldR.$trd_unit_qty, MST_YIELD_SCHD_R.$trd_unit_yield_qty);
				addColumnPathMap(ReExp_Sprt03_DtlYieldR.$yield_schd_dt, MST_YIELD_SCHD_R.$schd_tm);
			}
		}

		/**
		 * 予定再展開サービスの投入コンテナの作成
		 * @return
		 */
		protected Map_ReExp_Sprt01_DtlInptR_MST_INPT_SCHD_R<ReExp_Sprt01_DtlInptR,MST_INPT_SCHD_R> createMap_ReExp_Sprt01_DtlInptR_MST_INPT_SCHD_R() {
			return new Map_ReExp_Sprt01_DtlInptR_MST_INPT_SCHD_R<ReExp_Sprt01_DtlInptR, MST_INPT_SCHD_R>();
		}

		public class Map_ReExp_Sprt01_DtlInptR_MST_INPT_SCHD_R<D extends ReExp_Sprt01_DtlInptR, S extends MST_INPT_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$inpt_schd_no, MST_INPT_SCHD_R.$inpt_schd_no);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$mfg_inst_no, MST_INPT_SCHD_R.$mfg_inst_no);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$oper_inst_no, MST_INPT_SCHD_R.$oper_inst_no);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$alt_grp_cd, MST_INPT_SCHD_R.$alt_grp_cd);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$alt_grp_seq, MST_INPT_SCHD_R.$alt_grp_seq);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$alt_qty, MST_INPT_SCHD_R.$base_unit_alt_qty);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$itm_cd, MST_INPT_SCHD_R.$itm_cd);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$itm_sub1, MST_INPT_SCHD_R.$itm_sub1);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$itm_sub2, MST_INPT_SCHD_R.$itm_sub2);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$itm_sub3, MST_INPT_SCHD_R.$itm_sub3);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$inpt_qty, MST_INPT_SCHD_R.$base_unit_inpt_qty);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$rqmt_qty, MST_INPT_SCHD_R.$base_unit_rqmt_qty);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$fxd_rqmt_qty, MST_INPT_SCHD_R.$base_unit_fxd_rqmt_qty);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$cont_inpt_qty, MST_INPT_SCHD_R.$cont_inpt_qty);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$cont_rqmt_qty, MST_INPT_SCHD_R.$cont_rqmt_qty);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$cont_fxd_rqmt_qty, MST_INPT_SCHD_R.$cont_fxd_rqmt_qty);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$ver_no, MST_INPT_SCHD_R.$ver_no);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$itm_seq, MST_INPT_SCHD_R.$chd_itm_seq);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$in_offst_typ, MST_INPT_SCHD_R.$in_offst_typ);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$in_offst, MST_INPT_SCHD_R.$in_offst);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$par_inst_qty, MST_INPT_SCHD_R.$par_inst_qty);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$chd_inpt_qty, MST_INPT_SCHD_R.$chd_inpt_qty);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$chd_rqmt_qty, MST_INPT_SCHD_R.$chd_rqmt_qty);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$fxd_chd_rqmt_qty, MST_INPT_SCHD_R.$fxd_chd_rqmt_qty);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$alloc_flg, MST_INPT_SCHD_R.$alloc_flg);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$lot_no, MST_INPT_SCHD_R.$lot_no);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$sublot_no, MST_INPT_SCHD_R.$sublot_no);
				addColumnPathMap(ReExp_Sprt01_DtlInptR.$act_cont_fctr, MST_INPT_SCHD_R.$act_cont_fctr);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.total_rqmt_qty(nvl(src.base_unit_rqmt_qty(), MCNumber.ZERO)
						.add(nvl(src.base_unit_fxd_rqmt_qty(), MCNumber.ZERO)));
				dest.sum_cont_rqmt_qty(nvl(src.cont_rqmt_qty(), MCNumber.ZERO)
						.add(nvl(src.cont_fxd_rqmt_qty(), MCNumber.ZERO)));
			}
		}

		/**
		 * 予定再展開サービスの副産品コンテナの作成
		 * @return
		 */
		protected Map_ReExp_Sprt01_DtlByProdR_MST_YIELD_SCHD_R<ReExp_Sprt01_DtlByProdR,MST_YIELD_SCHD_R> createMap_ReExp_Sprt01_DtlByProdR_MST_YIELD_SCHD_R() {
			return new Map_ReExp_Sprt01_DtlByProdR_MST_YIELD_SCHD_R<ReExp_Sprt01_DtlByProdR, MST_YIELD_SCHD_R>();
		}

		public class Map_ReExp_Sprt01_DtlByProdR_MST_YIELD_SCHD_R<D extends ReExp_Sprt01_DtlByProdR, S extends MST_YIELD_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt01_DtlByProdR.$yield_schd_no, MST_YIELD_SCHD_R.$yield_schd_no);
				addColumnPathMap(ReExp_Sprt01_DtlByProdR.$mfg_inst_no, MST_YIELD_SCHD_R.$mfg_inst_no);
				addColumnPathMap(ReExp_Sprt01_DtlByProdR.$oper_inst_no, MST_YIELD_SCHD_R.$oper_inst_no);
				addColumnPathMap(ReExp_Sprt01_DtlByProdR.$disp_seq, MST_YIELD_SCHD_R.$disp_seq);
				addColumnPathMap(ReExp_Sprt01_DtlByProdR.$itm_cd, MST_YIELD_SCHD_R.$itm_cd);
				addColumnPathMap(ReExp_Sprt01_DtlByProdR.$itm_sub1, MST_YIELD_SCHD_R.$itm_sub1);
				addColumnPathMap(ReExp_Sprt01_DtlByProdR.$itm_sub2, MST_YIELD_SCHD_R.$itm_sub2);
				addColumnPathMap(ReExp_Sprt01_DtlByProdR.$itm_sub3, MST_YIELD_SCHD_R.$itm_sub3);
				addColumnPathMap(ReExp_Sprt01_DtlByProdR.$par_inst_qty, MST_YIELD_SCHD_R.$par_inst_qty);
				addColumnPathMap(ReExp_Sprt01_DtlByProdR.$chd_inpt_qty, MST_YIELD_SCHD_R.$chd_inpt_qty);
				addColumnPathMap(ReExp_Sprt01_DtlByProdR.$chd_rqmt_qty, MST_YIELD_SCHD_R.$chd_rqmt_qty);
			}
		}

		/**
		 * 予定再展開サービスの工数コンテナの作成
		 * @return
		 */
		protected Map_ReExp_Sprt02_DtlWkR_MST_WK_SCHD_R<ReExp_Sprt02_DtlWkR,MST_WK_SCHD_R> createMap_ReExp_Sprt02_DtlWkR_MST_WK_SCHD_R() {
			return new Map_ReExp_Sprt02_DtlWkR_MST_WK_SCHD_R<ReExp_Sprt02_DtlWkR, MST_WK_SCHD_R>();
		}

		public class Map_ReExp_Sprt02_DtlWkR_MST_WK_SCHD_R<D extends ReExp_Sprt02_DtlWkR, S extends MST_WK_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt02_DtlWkR.$wk_schd_no, MST_WK_SCHD_R.$wk_schd_no);
				addColumnPathMap(ReExp_Sprt02_DtlWkR.$mfg_inst_no, MST_WK_SCHD_R.$mfg_inst_no);
				addColumnPathMap(ReExp_Sprt02_DtlWkR.$oper_inst_no, MST_WK_SCHD_R.$oper_inst_no);
				addColumnPathMap(ReExp_Sprt02_DtlWkR.$wk_cost_cd, MST_WK_SCHD_R.$wk_cost_cd);
				addColumnPathMap(ReExp_Sprt02_DtlWkR.$mst_wk_cost, MST_WK_SCHD_R.$mst_wk_cost);
				addColumnPathMap(ReExp_Sprt02_DtlWkR.$mst_fxd_wk_cost, MST_WK_SCHD_R.$mst_fxd_wk_cost);
			}
		}

		protected Map_MfgInstReg_Chk01_DtlInptR_ReExp_Sprt01_RsltInptR_Upd<MfgInstReg_Chk01_DtlInptR,ReExp_Sprt01_RsltInptR> createMap_MfgInstReg_Chk01_DtlInptR_ReExp_Sprt01_RsltInptR_Upd() {
			return new Map_MfgInstReg_Chk01_DtlInptR_ReExp_Sprt01_RsltInptR_Upd<MfgInstReg_Chk01_DtlInptR, ReExp_Sprt01_RsltInptR>();
		}

		public class Map_MfgInstReg_Chk01_DtlInptR_ReExp_Sprt01_RsltInptR_Upd<D extends MfgInstReg_Chk01_DtlInptR, S extends ReExp_Sprt01_RsltInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alt_grp_cd, ReExp_Sprt01_RsltInptR.$alt_grp_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alt_grp_seq, ReExp_Sprt01_RsltInptR.$alt_grp_seq);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$itm_cd, ReExp_Sprt01_RsltInptR.$itm_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$itm_sub1, ReExp_Sprt01_RsltInptR.$itm_sub1);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$itm_sub2, ReExp_Sprt01_RsltInptR.$itm_sub2);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$itm_sub3, ReExp_Sprt01_RsltInptR.$itm_sub3);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$ver_no, ReExp_Sprt01_RsltInptR.$ver_no);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$ver_flg, ReExp_Sprt01_RsltInptR.$ver_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$base_unit_alt_qty, ReExp_Sprt01_RsltInptR.$alt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$base_unit_inpt_qty, ReExp_Sprt01_RsltInptR.$inpt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$base_unit_rqmt_qty, ReExp_Sprt01_RsltInptR.$rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$base_unit_fxd_rqmt_qty, ReExp_Sprt01_RsltInptR.$fxd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$cont_inpt_qty, ReExp_Sprt01_RsltInptR.$cont_inpt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$cont_rqmt_qty, ReExp_Sprt01_RsltInptR.$cont_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$cont_fxd_rqmt_qty, ReExp_Sprt01_RsltInptR.$cont_fxd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$schd_tm, ReExp_Sprt01_RsltInptR.$inpt_schd_dt);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$lot_mng_typ, ReExp_Sprt01_RsltInptR.$lot_mng_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sublot_mng_typ, ReExp_Sprt01_RsltInptR.$sublot_mng_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno1_mng_typ, ReExp_Sprt01_RsltInptR.$sno1_mng_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno2_mng_typ, ReExp_Sprt01_RsltInptR.$sno2_mng_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno3_mng_typ, ReExp_Sprt01_RsltInptR.$sno3_mng_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno4_mng_typ, ReExp_Sprt01_RsltInptR.$sno4_mng_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$base_unit_cd, ReExp_Sprt01_RsltInptR.$base_unit_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$cont_fctr_flg, ReExp_Sprt01_RsltInptR.$cont_fctr_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$cont_fctr_rnd_typ, ReExp_Sprt01_RsltInptR.$cont_fctr_rnd_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$cont_fctr_dec_place, ReExp_Sprt01_RsltInptR.$cont_fctr_dec_place);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$cont_inpt_qty, ReExp_Sprt01_RsltInptR.$cont_inpt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$cont_rqmt_qty, ReExp_Sprt01_RsltInptR.$cont_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$cont_fxd_rqmt_qty, ReExp_Sprt01_RsltInptR.$cont_fxd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$cont_fctr_unit_cd, ReExp_Sprt01_RsltInptR.$cont_fctr_unit_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$std_cont_fctr, ReExp_Sprt01_RsltInptR.$std_cont_fctr);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$inst_lot_fix_flg, ReExp_Sprt01_RsltInptR.$inst_lot_fix_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno1, ReExp_Sprt01_RsltInptR.$sno1);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno1_null_flg, ReExp_Sprt01_RsltInptR.$sno1_null_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno2, ReExp_Sprt01_RsltInptR.$sno2);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno2_null_flg, ReExp_Sprt01_RsltInptR.$sno2_null_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno3, ReExp_Sprt01_RsltInptR.$sno3);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno3_null_flg, ReExp_Sprt01_RsltInptR.$sno3_null_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno4, ReExp_Sprt01_RsltInptR.$sno4);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sno4_null_flg, ReExp_Sprt01_RsltInptR.$sno4_null_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$inpt_loc_cd, ReExp_Sprt01_RsltInptR.$inpt_loc_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$inpt_str_ln_tgt_flg, ReExp_Sprt01_RsltInptR.$inpt_str_ln_tgt_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$inpt_str_ln_cd, ReExp_Sprt01_RsltInptR.$inpt_str_ln_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$gd_cd, ReExp_Sprt01_RsltInptR.$gd_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$bkf_typ, ReExp_Sprt01_RsltInptR.$bkf_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$par_inst_qty, ReExp_Sprt01_RsltInptR.$par_inst_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$chd_inpt_qty, ReExp_Sprt01_RsltInptR.$chd_inpt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$chd_rqmt_qty, ReExp_Sprt01_RsltInptR.$chd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$fxd_chd_rqmt_qty, ReExp_Sprt01_RsltInptR.$fxd_chd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$main_itm_flg, ReExp_Sprt01_RsltInptR.$main_itm_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$bom_memo1, ReExp_Sprt01_RsltInptR.$bom_memo1);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$bom_memo2, ReExp_Sprt01_RsltInptR.$bom_memo2);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$bom_memo3, ReExp_Sprt01_RsltInptR.$bom_memo3);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$yield_calc_flg, ReExp_Sprt01_RsltInptR.$yield_calc_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alloc_ctl_typ, ReExp_Sprt01_RsltInptR.$alloc_ctl_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$inpt_ctl_typ, ReExp_Sprt01_RsltInptR.$inpt_ctl_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$in_offst_typ, ReExp_Sprt01_RsltInptR.$in_offst_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$in_offst, ReExp_Sprt01_RsltInptR.$in_offst);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$lot_mix_flg, ReExp_Sprt01_RsltInptR.$lot_mix_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$sublot_mix_flg, ReExp_Sprt01_RsltInptR.$sublot_mix_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$stk_mng_typ, ReExp_Sprt01_RsltInptR.$stk_mng_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$prov_typ, ReExp_Sprt01_RsltInptR.$prov_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alt_itm_typ, ReExp_Sprt01_RsltInptR.$alt_itm_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alt_alloc_prio, ReExp_Sprt01_RsltInptR.$alt_alloc_prio);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$alt_itm_ratio, ReExp_Sprt01_RsltInptR.$alt_itm_ratio);
				addColumnPathMap(MfgInstReg_Chk01_DtlInptR.$disp_seq, ReExp_Sprt01_RsltInptR.$disp_seq);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (src.inst_lot_fix_flg()) {
					dest.no_lot_fix_flg(false);
				}
				else {
					dest.no_lot_fix_flg(true);
				}
				if (MAC_ALLOC_CTL_TYP.isALLOC_INST_NG(src.alloc_ctl_typ()) || MAC_ALLOC_CTL_TYP.isALLOC_INST_OK(src.alloc_ctl_typ())) {
					dest.alloc_flg(true);
				}
			}
		}

		protected Map_MfgInstReg_Chk01_DtlWkR_ReExp_Sprt02_RsltWkR_Upd<MfgInstReg_Chk01_DtlWkR,ReExp_Sprt02_RsltWkR> createMap_MfgInstReg_Chk01_DtlWkR_ReExp_Sprt02_RsltWkR_Upd() {
			return new Map_MfgInstReg_Chk01_DtlWkR_ReExp_Sprt02_RsltWkR_Upd<MfgInstReg_Chk01_DtlWkR, ReExp_Sprt02_RsltWkR>();
		}

		public class Map_MfgInstReg_Chk01_DtlWkR_ReExp_Sprt02_RsltWkR_Upd<D extends MfgInstReg_Chk01_DtlWkR, S extends ReExp_Sprt02_RsltWkR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$wk_cost_cd, ReExp_Sprt02_RsltWkR.$wk_cost_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$wk_cost, ReExp_Sprt02_RsltWkR.$wk_cost);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$fxd_wk_cost, ReExp_Sprt02_RsltWkR.$fxd_wk_cost);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$mst_wk_cost, ReExp_Sprt02_RsltWkR.$mst_wk_cost);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$mst_fxd_wk_cost, ReExp_Sprt02_RsltWkR.$mst_fxd_wk_cost);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$wk_cost_calc_flg, ReExp_Sprt02_RsltWkR.$wk_cost_calc_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$disp_seq, ReExp_Sprt02_RsltWkR.$disp_seq);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$oper_cd, ReExp_Sprt02_RsltWkR.$oper_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlWkR.$oper_seq, ReExp_Sprt02_RsltWkR.$oper_seq);

			}
		}

		protected Map_MfgInstReg_Chk01_DtlByProdR_ReExp_Sprt01_RsltByProdR_Upd<MfgInstReg_Chk01_DtlByProdR,ReExp_Sprt01_RsltByProdR> createMap_MfgInstReg_Chk01_DtlByProdR_ReExp_Sprt01_RsltByProdR_Upd() {
			return new Map_MfgInstReg_Chk01_DtlByProdR_ReExp_Sprt01_RsltByProdR_Upd<MfgInstReg_Chk01_DtlByProdR, ReExp_Sprt01_RsltByProdR>();
		}

		public class Map_MfgInstReg_Chk01_DtlByProdR_ReExp_Sprt01_RsltByProdR_Upd<D extends MfgInstReg_Chk01_DtlByProdR, S extends ReExp_Sprt01_RsltByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$itm_cd, ReExp_Sprt01_RsltByProdR.$itm_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$itm_sub1, ReExp_Sprt01_RsltByProdR.$itm_sub1);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$itm_sub2, ReExp_Sprt01_RsltByProdR.$itm_sub2);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$itm_sub3, ReExp_Sprt01_RsltByProdR.$itm_sub3);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$lot_mng_typ, ReExp_Sprt01_RsltByProdR.$lot_mng_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$lot_no_typ, ReExp_Sprt01_RsltByProdR.$lot_no_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$lot_no_ptn_cd, ReExp_Sprt01_RsltByProdR.$lot_no_ptn_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sublot_mng_typ, ReExp_Sprt01_RsltByProdR.$sublot_mng_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sublot_no_typ, ReExp_Sprt01_RsltByProdR.$sublot_no_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sublot_no_ptn_cd, ReExp_Sprt01_RsltByProdR.$sublot_no_ptn_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sno1_mng_typ, ReExp_Sprt01_RsltByProdR.$sno1_mng_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sno2_mng_typ, ReExp_Sprt01_RsltByProdR.$sno2_mng_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sno3_mng_typ, ReExp_Sprt01_RsltByProdR.$sno3_mng_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sno4_mng_typ, ReExp_Sprt01_RsltByProdR.$sno4_mng_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$trd_unit_cd, ReExp_Sprt01_RsltByProdR.$trd_unit_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$trd_unit_yield_qty, ReExp_Sprt01_RsltByProdR.$trd_unit_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$schd_tm, ReExp_Sprt01_RsltByProdR.$yield_schd_dt);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$base_unit_conv_rnd_typ, ReExp_Sprt01_RsltByProdR.$base_unit_conv_rnd_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$conv_base_qty, ReExp_Sprt01_RsltByProdR.$conv_base_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$conv_qty, ReExp_Sprt01_RsltByProdR.$conv_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$base_unit_cd, ReExp_Sprt01_RsltByProdR.$base_unit_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sno1, ReExp_Sprt01_RsltByProdR.$sno1);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sno2, ReExp_Sprt01_RsltByProdR.$sno2);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sno3, ReExp_Sprt01_RsltByProdR.$sno3);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$sno4, ReExp_Sprt01_RsltByProdR.$sno4);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$strg_loc_cd, ReExp_Sprt01_RsltByProdR.$strg_loc_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$strg_str_ln_tgt_flg, ReExp_Sprt01_RsltByProdR.$strg_str_ln_tgt_flg);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$strg_str_ln_cd, ReExp_Sprt01_RsltByProdR.$strg_str_ln_cd);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$bkf_typ, ReExp_Sprt01_RsltByProdR.$bkf_typ);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$par_inst_qty, ReExp_Sprt01_RsltByProdR.$par_inst_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$chd_inpt_qty, ReExp_Sprt01_RsltByProdR.$chd_inpt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$chd_rqmt_qty, ReExp_Sprt01_RsltByProdR.$chd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$fxd_chd_rqmt_qty, ReExp_Sprt01_RsltByProdR.$fxd_chd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Chk01_DtlByProdR.$disp_seq, ReExp_Sprt01_RsltByProdR.$disp_seq);
			}
		}

	}
	/**
	 * MfgInstReg_RevUpd01オペレーション.<p>
	 *
	 * 製造指図改訂履歴テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	public class MfgInstReg_RevUpd01 extends MSBCL_MfgInstRegService_MC_A.MfgInstReg_RevUpd01 {

		MCList<MST_MFG_INST_R> _hCurrentL = MCList.create(MST_MFG_INST_R.class);
		MCList<MST_MFG_INST_P_R> _hRevL = MCList.create(MST_MFG_INST_P_R.class);
		MCList<MST_OPER_INST_R> _operCurrentL = MCList.create(MST_OPER_INST_R.class);
		MCList<MST_OPER_INST_P_R> _operRevL = MCList.create(MST_OPER_INST_P_R.class);
		MCList<MST_YIELD_SCHD_R> _yieldCurrentL = MCList.create(MST_YIELD_SCHD_R.class);
		MCList<MST_YIELD_SCHD_P_R> _yieldRevL = MCList.create(MST_YIELD_SCHD_P_R.class);
		MCList<MST_INPT_SCHD_R> _inptCurrentL = MCList.create(MST_INPT_SCHD_R.class);
		MCList<MST_INPT_SCHD_P_R> _inptRevL = MCList.create(MST_INPT_SCHD_P_R.class);
		MCList<MST_WK_SCHD_R> _wkCurrentL = MCList.create(MST_WK_SCHD_R.class);
		MCList<MST_WK_SCHD_P_R> _wkRevL = MCList.create(MST_WK_SCHD_P_R.class);
		
		MCList<MST_ITM_MFG_INST_R> _itmCurrentL = MCList.create(MST_ITM_MFG_INST_R.class);
		MCList<MST_ITM_MFG_INST_P_R> _itmRevL = MCList.create(MST_ITM_MFG_INST_P_R.class);
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			wkInsert();
			selectCurrentAndRev();
			wkInsItm();
			selectItmCurrentAndRev();
			revisionInsOrUpd();
		}
		
		/**
		 * 上り電文の項目を本体・改訂履歴ヘッダーのワークテーブルに設定
		 */
		protected void wkInsert() {
			MCList<MST_MFG_INST_R> wkL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(t);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_MFG_INST_R wkR = MST_MFG_INST_R.create();
				wkR.mfg_inst_no(r.rev_data_src_no());
				wkL.add(wkR);
			}
			dbWkDelete("MSBCL6000_MSW_MFG_INST_D03", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBCL6000_MSW_MFG_INST_I02", wkL.groupBy(t.getKeyColumn()), wkL_bldr.getBaseDbc());

			MCList<MST_MFG_INST_P_R> wkpL = MCList.create(MST_MFG_INST_P_R.class);
			MST_MFG_INST_P_R t1 = MST_MFG_INST_P_R.create("T");
			MCQueryApiBuilder wkpL_bldr = MCQueryApiBuilder.create(t1);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_MFG_INST_P_R wkpR = MST_MFG_INST_P_R.create();
				wkpR.mfg_inst_no(r.rev_data_src_no());
				wkpR.mfg_inst_rev(r.rev_no());
				wkpL.add(wkpR);
			}
			dbWkDelete("MSBCL6000_MSW_MFG_INST_P_D01", wkpL_bldr.getBaseDbc());
			dbWkInsert("MSBCL6000_MSW_MFG_INST_P_I01", wkpL.groupBy(t1.getKeyColumn()), wkpL_bldr.getBaseDbc());
			
		}
	
		/**
		 * 本体テーブルと改訂履歴テーブルからリストを取得
		 */
		protected void selectCurrentAndRev() {
			MSW_MFG_INST_KEY_R w1 = MSW_MFG_INST_KEY_R.create("W");
			
			MST_MFG_INST_R t1 = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder hCurrentL_bldr = MCQueryApiBuilder.create(t1);
			hCurrentL_bldr.addInnerJoin(w1, bracket( t1.mfg_inst_no.eq(w1.mfg_inst_no)));
			dbSelect("MSBCL6000_MST_MFG_INST_S06", _hCurrentL, hCurrentL_bldr);
			
			MST_OPER_INST_R t2 = MST_OPER_INST_R.create("T");
			MCQueryApiBuilder operCurrentL_bldr = MCQueryApiBuilder.create(t2);
			operCurrentL_bldr.addInnerJoin(w1, bracket( t2.mfg_inst_no.eq(w1.mfg_inst_no)));
			dbSelect("MSBCL6000_MST_OPER_INST_S07", _operCurrentL, operCurrentL_bldr);
			
			MST_YIELD_SCHD_R t3 = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder yieldCurrentL_bldr = MCQueryApiBuilder.create(t3);
			yieldCurrentL_bldr.addInnerJoin(w1, bracket( t3.mfg_inst_no.eq(w1.mfg_inst_no)));
			dbSelect("MSBCL6000_MST_YIELD_SCHD_S07", _yieldCurrentL, yieldCurrentL_bldr);
			
			MST_INPT_SCHD_R t4 = MST_INPT_SCHD_R.create("T");
			MCQueryApiBuilder inptCurrentL_bldr = MCQueryApiBuilder.create(t4);
			inptCurrentL_bldr.addInnerJoin(w1, bracket( t4.mfg_inst_no.eq(w1.mfg_inst_no)));
			dbSelect("MSBCL6000_MST_INPT_SCHD_S08", _inptCurrentL, inptCurrentL_bldr);
			
			MST_WK_SCHD_R t5 = MST_WK_SCHD_R.create("T");
			MCQueryApiBuilder wkCurrentL_bldr = MCQueryApiBuilder.create(t5);
			wkCurrentL_bldr.addInnerJoin(w1, bracket( t5.mfg_inst_no.eq(w1.mfg_inst_no)));
			dbSelect("MSBCL6000_MST_WK_SCHD_S06", _wkCurrentL, wkCurrentL_bldr);

			MSW_MFG_INST_P_KEY_R w2 = MSW_MFG_INST_P_KEY_R.create("W");
			
			MST_MFG_INST_P_R t6 = MST_MFG_INST_P_R.create("T");
			MCQueryApiBuilder hRevL_bldr = MCQueryApiBuilder.create(t6);
			hRevL_bldr.addInnerJoin(w2, bracket( t6.mfg_inst_no.eq(w2.mfg_inst_no) 
					.and(t6.mfg_inst_rev.eq(w2.mfg_inst_rev))));
			dbSelect("MSBCL6000_MST_MFG_INST_P_S01", _hRevL, hRevL_bldr);
			
			MST_OPER_INST_P_R t7 = MST_OPER_INST_P_R.create("T");
			MCQueryApiBuilder operRevL_bldr = MCQueryApiBuilder.create(t7);
			operRevL_bldr.addInnerJoin(w2, bracket( t7.mfg_inst_no.eq(w2.mfg_inst_no) 
					.and(t7.mfg_inst_rev.eq(w2.mfg_inst_rev))));
			dbSelect("MSBCL6000_MST_OPER_INST_P_S01", _operRevL, operRevL_bldr);
			
			MST_YIELD_SCHD_P_R t8 = MST_YIELD_SCHD_P_R.create("T");
			MCQueryApiBuilder yieldRevL_bldr = MCQueryApiBuilder.create(t8);
			yieldRevL_bldr.addInnerJoin(w2, bracket( t8.mfg_inst_no.eq(w2.mfg_inst_no) 
					.and(t8.mfg_inst_rev.eq(w2.mfg_inst_rev))));
			dbSelect("MSBCL6000_MST_YIELD_SCHD_P_S01", _yieldRevL, yieldRevL_bldr);
			
			MST_INPT_SCHD_P_R t9 = MST_INPT_SCHD_P_R.create("T");
			MCQueryApiBuilder inptRevL_bldr = MCQueryApiBuilder.create(t9);
			inptRevL_bldr.addInnerJoin(w2, bracket( t9.mfg_inst_no.eq(w2.mfg_inst_no) 
					.and(t9.mfg_inst_rev.eq(w2.mfg_inst_rev))));
			dbSelect("MSBCL6000_MST_INPT_SCHD_P_S01", _inptRevL, inptRevL_bldr);
			
			MST_WK_SCHD_P_R t10 = MST_WK_SCHD_P_R.create("T");
			MCQueryApiBuilder wkRevL_bldr = MCQueryApiBuilder.create(t10);
			wkRevL_bldr.addInnerJoin(w2, bracket( t10.mfg_inst_no.eq(w2.mfg_inst_no) 
					.and(t10.mfg_inst_rev.eq(w2.mfg_inst_rev))));
			dbSelect("MSBCL6000_MST_WK_SCHD_P_S01", _wkRevL, wkRevL_bldr);
		}
		
		/**
		 * 製造指図の本体テーブルを元に、品目製造指図の本体・改訂履歴のワークテーブルに設定
		 */
		protected void wkInsItm() {
			MCList<MST_ITM_MFG_INST_R> wkL = MCList.create(MST_ITM_MFG_INST_R.class);
			MCList<MST_ITM_MFG_INST_P_R> wkpL = MCList.create(MST_ITM_MFG_INST_P_R.class);
			for (MST_MFG_INST_R r : _hCurrentL) {
				MST_ITM_MFG_INST_R wkR = MST_ITM_MFG_INST_R.create();
				wkR.itm_mfg_inst_no(r.itm_mfg_inst_no());
				wkL.add(wkR);
				
				MST_ITM_MFG_INST_P_R wkpR = MST_ITM_MFG_INST_P_R.create();
				wkpR.mfg_inst_no(r.mfg_inst_no());
				wkpR.mfg_inst_rev(r.mfg_inst_rev());
				wkpL.add(wkpR);
			}
			MST_ITM_MFG_INST_R t = MST_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(t);
			MST_ITM_MFG_INST_P_R t1 = MST_ITM_MFG_INST_P_R.create("T");
			MCQueryApiBuilder wkpL_bldr = MCQueryApiBuilder.create(t1);
			
			dbWkDelete("MSBCL6000_MSW_ITM_MFG_INST_D01", wkL_bldr.getBaseDbc());
			dbWkDelete("MSBCL6000_MSW_ITM_MFG_INST_P_D01", wkpL_bldr.getBaseDbc());
			
			dbWkInsert("MSBCL6000_MSW_ITM_MFG_INST_I01", wkL.groupBy(t.getKeyColumn()), wkL_bldr.getBaseDbc());
			dbWkInsert("MSBCL6000_MSW_ITM_MFG_INST_P_I01", wkpL.groupBy(t1.getKeyColumn()), wkpL_bldr.getBaseDbc());
		}
		
		/**
		 * 品目製造指図の本体・改訂履歴のリストを取得
		 */
		protected void selectItmCurrentAndRev() {
			MSW_ITM_MFG_INST_KEY_R w1 = MSW_ITM_MFG_INST_KEY_R.create("W1");
			MSW_ITM_MFG_INST_P_KEY_R w2 = MSW_ITM_MFG_INST_P_KEY_R.create("W2");
			
			MST_ITM_MFG_INST_R itmCurrentL_t = MST_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder itmCurrentL_bldr = MCQueryApiBuilder.create(itmCurrentL_t);
			itmCurrentL_bldr.addInnerJoin(w1, bracket(itmCurrentL_t.itm_mfg_inst_no.eq(w1.itm_mfg_inst_no)));
			dbSelect("MSBCL6000_MST_ITM_MFG_INST_S04", _itmCurrentL, itmCurrentL_bldr);
			
			MST_ITM_MFG_INST_P_R itmRevL_t = MST_ITM_MFG_INST_P_R.create("T");
			MCQueryApiBuilder itmRevL_bldr = MCQueryApiBuilder.create(itmRevL_t);
			itmRevL_bldr.addInnerJoin(w2, bracket(itmRevL_t.mfg_inst_no.eq(w2.mfg_inst_no)
					.and(itmRevL_t.mfg_inst_rev.eq(w2.mfg_inst_rev))));
			dbSelect("MSBCL6000_MST_ITM_MFG_INST_P_S01", _itmRevL, itmRevL_bldr);
		}
		
		/**
		 * 本番テーブルのデータを元に、改訂履歴テーブルを追加又は更新する。
		 */
		protected void revisionInsOrUpd() {
			// ヘッダーの更新又は登録
			revisionHeaderInsOrUpd();
			revisionItmInsOrUpd();
			// 明細の更新又は登録
			revisionOperInsOrUpd();
			revisionYieldInsOrUpd();
			revisionInptInsOrUpd();
			revisionWkInsOrUpd();
		}
		
		/**
		 * 製造指図（改訂履歴）
		 */
		protected void revisionHeaderInsOrUpd() {
			MCIndexKey hRevIdx = _hRevL.createIndex(MST_MFG_INST_P_R.$mfg_inst_no, MST_MFG_INST_P_R.$mfg_inst_rev);
			MCList<MST_MFG_INST_P_R> hUpd = MCList.create(MST_MFG_INST_P_R.class);
			MCList<MST_MFG_INST_P_R> hIns = MCList.create(MST_MFG_INST_P_R.class);
			
			for (MST_MFG_INST_R hcurrentR : _hCurrentL) {
				
				MST_MFG_INST_P_R tempRevR = MST_MFG_INST_P_R.create();
				tempRevR.setByName(hcurrentR);
				if (_hRevL == null || isNull(_hRevL.getFirst(hRevIdx, hcurrentR.mfg_inst_no(), hcurrentR.mfg_inst_rev()))) {
					hIns.add(tempRevR);
				}
				else {
					hUpd.add(tempRevR);
				}
			}
			if (!isNull(hIns)) {
				dbInsert("MSBCL6000_MST_MFG_INST_P_I01", hIns,
						MCQueryApiBuilder.create(MST_MFG_INST_P_R.create("T")));
			}
			if (!isNull(hUpd)) {
				MCQueryApiBuilder hUpd_bldr = MCQueryApiBuilder.create(MST_MFG_INST_P_R.create("T"));
				hUpd_bldr.removeSet(hUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBCL6000_MST_MFG_INST_P_U01", hUpd, hUpd_bldr);
			}
		}
		
		/**
		 * 品目製造指図（改訂履歴）
		 */
		protected void revisionItmInsOrUpd() {
			MCIndexKey itmRevIdx = _itmRevL.createIndex(MST_ITM_MFG_INST_P_R.$mfg_inst_no, MST_OPER_INST_P_R.$mfg_inst_rev);
			MCIndexKey itmCurrentIdx = _itmCurrentL.createIndex(MST_ITM_MFG_INST_R.$itm_mfg_inst_no);
			MCList<MST_ITM_MFG_INST_P_R> updL = MCList.create(MST_ITM_MFG_INST_P_R.class);
			MCList<MST_ITM_MFG_INST_P_R> insL = MCList.create(MST_ITM_MFG_INST_P_R.class);
			
			for (MST_MFG_INST_R currentR : _hCurrentL) {
				MST_ITM_MFG_INST_R itmCurrentR = _itmCurrentL.getFirst(itmCurrentIdx, currentR.itm_mfg_inst_no());
				MST_ITM_MFG_INST_P_R tempRevR = MST_ITM_MFG_INST_P_R.create();
				tempRevR.setByName(itmCurrentR);
				tempRevR.mfg_inst_no(currentR.mfg_inst_no());
				tempRevR.mfg_inst_rev(currentR.mfg_inst_rev());
				if (_itmRevL == null || isNull(_itmRevL.getFirst(itmRevIdx, tempRevR.mfg_inst_no(), tempRevR.mfg_inst_rev()))) {
					insL.add(tempRevR);
				} else {
					updL.add(tempRevR);
				}
			}
			if (!isNull(insL)) {
				dbInsert("MSBCL6000_MST_ITM_MFG_INST_P_I01", insL,
						MCQueryApiBuilder.create(MST_ITM_MFG_INST_P_R.create("T")));
			}
			if (!isNull(updL)) {
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(MST_ITM_MFG_INST_P_R.create("T"));
				updL_bldr.removeSet(updL_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBCL6000_MST_ITM_MFG_INST_P_U01", updL, updL_bldr);
			}
		}
		
		/**
		 * 工程指図（改訂履歴）
		 */
		protected void revisionOperInsOrUpd() {
			MCIndexKey operRevIdx = _operRevL.createIndex(MST_OPER_INST_P_R.$oper_inst_no, MST_OPER_INST_P_R.$mfg_inst_rev);
			MCIndexKey hCurrentIdx = _hCurrentL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			MCList<MST_OPER_INST_P_R> updL = MCList.create(MST_OPER_INST_P_R.class);
			MCList<MST_OPER_INST_P_R> insL = MCList.create(MST_OPER_INST_P_R.class);
			for (MST_OPER_INST_R currentR : _operCurrentL) {
				
				MST_OPER_INST_P_R tempRevR = MST_OPER_INST_P_R.create();
				tempRevR.setByName(currentR);
				
				MST_MFG_INST_R hCurrentR = _hCurrentL.getFirst(hCurrentIdx, currentR.mfg_inst_no());
				tempRevR.mfg_inst_rev(hCurrentR.mfg_inst_rev());
				if (_operRevL == null || isNull(_operRevL.getFirst(operRevIdx, tempRevR.oper_inst_no(), tempRevR.mfg_inst_rev()))) {
					insL.add(tempRevR);
				}
				else {
					updL.add(tempRevR);
				}
			}
			if (!isNull(insL)) {
				dbInsert("MSBCL6000_MST_OPER_INST_P_I01", insL,
						MCQueryApiBuilder.create(MST_OPER_INST_P_R.create("T")));
			}
			if (!isNull(updL)) {
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(MST_OPER_INST_P_R.create("T"));
				updL_bldr.removeSet(updL_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBCL6000_MST_OPER_INST_P_U01", updL, updL_bldr);
			}
		}
		
		/**
		 * 出来高予定（改訂履歴）
		 */
		protected void revisionYieldInsOrUpd() {
			MCIndexKey yieldRevIdx = _yieldRevL.createIndex(MST_YIELD_SCHD_P_R.$yield_schd_no, MST_YIELD_SCHD_P_R.$mfg_inst_rev);
			MCIndexKey hCurrentIdx = _hCurrentL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			MCList<MST_YIELD_SCHD_P_R> updL = MCList.create(MST_YIELD_SCHD_P_R.class);
			MCList<MST_YIELD_SCHD_P_R> insL = MCList.create(MST_YIELD_SCHD_P_R.class);
			for (MST_YIELD_SCHD_R currentR : _yieldCurrentL) {
				
				MST_YIELD_SCHD_P_R tempRevR = MST_YIELD_SCHD_P_R.create();
				tempRevR.setByName(currentR);
				
				MST_MFG_INST_R hCurrentR = _hCurrentL.getFirst(hCurrentIdx, currentR.mfg_inst_no());
				tempRevR.mfg_inst_rev(hCurrentR.mfg_inst_rev());
				if (_yieldRevL == null || isNull(_yieldRevL.getFirst(yieldRevIdx, tempRevR.yield_schd_no(), tempRevR.mfg_inst_rev()))) {
					insL.add(tempRevR);
				}
				else {
					updL.add(tempRevR);
				}
			}
			if (!isNull(insL)) {
				dbInsert("MSBCL6000_MST_YIELD_SCHD_P_I01", insL,
						MCQueryApiBuilder.create(MST_YIELD_SCHD_P_R.create("T")));
			}
			if (!isNull(updL)) {
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(MST_YIELD_SCHD_P_R.create("T"));
				updL_bldr.removeSet(updL_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBCL6000_MST_YIELD_SCHD_P_U01", updL, updL_bldr);
			}
		}
		
		/**
		 * 投入予定（改訂履歴）
		 */
		protected void revisionInptInsOrUpd() {
			MCIndexKey inptdRevIdx = _inptRevL.createIndex(MST_INPT_SCHD_P_R.$inpt_schd_no, MST_INPT_SCHD_P_R.$mfg_inst_rev);
			MCIndexKey hCurrentIdx = _hCurrentL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			MCList<MST_INPT_SCHD_P_R> updL = MCList.create(MST_INPT_SCHD_P_R.class);
			MCList<MST_INPT_SCHD_P_R> insL = MCList.create(MST_INPT_SCHD_P_R.class);
			for (MST_INPT_SCHD_R currentR : _inptCurrentL) {
				
				MST_INPT_SCHD_P_R tempRevR = MST_INPT_SCHD_P_R.create();
				tempRevR.setByName(currentR);
				
				MST_MFG_INST_R hCurrentR = _hCurrentL.getFirst(hCurrentIdx, currentR.mfg_inst_no());
				tempRevR.mfg_inst_rev(hCurrentR.mfg_inst_rev());
				if (_inptRevL == null || isNull(_inptRevL.getFirst(inptdRevIdx, tempRevR.inpt_schd_no(), tempRevR.mfg_inst_rev()))) {
					insL.add(tempRevR);
				}
				else {
					updL.add(tempRevR);
				}
			}
			if (!isNull(insL)) {
				dbInsert("MSBCL6000_MST_INPT_SCHD_P_I01", insL,
						MCQueryApiBuilder.create(MST_INPT_SCHD_P_R.create("T")));
			}
			if (!isNull(updL)) {
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(MST_INPT_SCHD_P_R.create("T"));
				updL_bldr.removeSet(updL_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBCL6000_MST_INPT_SCHD_P_U01", updL, updL_bldr);
			}
		}
		
		/**
		 * 工数予定（改訂履歴）
		 */
		protected void revisionWkInsOrUpd() {
			MCIndexKey wkRevIdx = _wkRevL.createIndex(MST_WK_SCHD_P_R.$wk_schd_no, MST_WK_SCHD_P_R.$mfg_inst_rev);
			MCIndexKey hCurrentIdx = _hCurrentL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			MCList<MST_WK_SCHD_P_R> updL = MCList.create(MST_WK_SCHD_P_R.class);
			MCList<MST_WK_SCHD_P_R> insL = MCList.create(MST_WK_SCHD_P_R.class);
			for (MST_WK_SCHD_R currentR : _wkCurrentL) {
				
				MST_WK_SCHD_P_R tempRevR = MST_WK_SCHD_P_R.create();
				tempRevR.setByName(currentR);
				
				MST_MFG_INST_R hCurrentR = _hCurrentL.getFirst(hCurrentIdx, currentR.mfg_inst_no());
				tempRevR.mfg_inst_rev(hCurrentR.mfg_inst_rev());
				if (_wkRevL == null || isNull(_wkRevL.getFirst(wkRevIdx, tempRevR.wk_schd_no(), tempRevR.mfg_inst_rev()))) {
					insL.add(tempRevR);
				}
				else {
					updL.add(tempRevR);
				}
			}
			if (!isNull(insL)) {
				dbInsert("MSBCL6000_MST_WK_SCHD_P_I01", insL,
						MCQueryApiBuilder.create(MST_WK_SCHD_P_R.create("T")));
			}
			if (!isNull(updL)) {
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(MST_WK_SCHD_P_R.create("T"));
				updL_bldr.removeSet(updL_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBCL6000_MST_WK_SCHD_P_U01", updL, updL_bldr);
			}
		}
	}

	//FMCB CUSTOM END
}