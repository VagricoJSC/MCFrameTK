package mcframe.serverMSLA.MSLAL9210;

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
import mcframe.serverMSBC.MSBCL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSLA.MSLAL9210.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBE.MBBEL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFUD.PFUDL0040.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import java.util.*;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverPF.dbc.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverMSLA.MSLAB2210.OrdRecvIfImp_Upd01_CndR;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_OrdRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_OrdRecvIfService_MC extends MSLAL_OrdRecvIfService_MC_A{
	//FMCB CUSTOM START
	/**
	 * エラーになったキーの組み合わせを保持する(Upd03, Upd04で共有)
	 */
	protected Set<List<String>> _errSet = new HashSet<>();

	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSLAL_OrdRecvIfService> CLAZZ = MSLAL_OrdRecvIfService.class;
	
	/**
	 * OrdRecvIf_Upd01オペレーション.<p>
	 *
	 * オーダ受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	public class OrdRecvIf_Upd01 extends MSLAL_OrdRecvIfService_MC_A.OrdRecvIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			callOrdRecvIfUpd02();
		}
		
		/**
		 * オーダ受信ＩＦ取込２を実行する。
		 */
		protected void callOrdRecvIfUpd02() {
			MSLAL_OrdRecvIfService.OrdRecvIf_Upd02 ope = MSLAL_OrdRecvIfService.crtOrdRecvIf_Upd02();
			
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
			}
		}
	}
	
	/**
	 * OrdRecvIf_Upd02オペレーション.<p>
	 *
	 * オーダ受信ＩＦ取込を行う。（ＩＦデータ確認、およびオーダ受信ＩＦ取込バッチから呼び出される）<br>
	 */
	public class OrdRecvIf_Upd02 extends MSLAL_OrdRecvIfService_MC_A.OrdRecvIf_Upd02 {
		
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
		/**
		 * チェックエラーフラグ
		 */
		protected boolean _errFlg = false;
		/**
		 * ロガー作成ＦＬＧ
		 */
		protected boolean _crtNewLogger = false;
		
		/**
		 * オーダ受信ＩＦリスト 
		 */
		MCList<MST_ORDER_RECV_IF_R> _ordRecvIfL = null;
		
		protected MCList<MST_OPER_ORDER_R> _cacheUpdOperOrdForFS = null;
		protected MCIndexKey _idxUpdOperOrdForFS = null;
		protected MCIndexKey _idxUpdOutSrcOperOrdForFS = null;
		protected MCList<MST_ITM_ORDER_R> _cacheUpdItmOrdForFS = null;
		protected MCIndexKey _idxUpdItmOrdForFS = null;
		
		protected MCList<MST_ITM_LNK_R> _cacheItmLnkForFS = null;
		protected MCIndexKey _idxItmLnkForFS = null;
		protected MCList<MST_OPER_ORDER_R> _cacheAfterOperOrdForFS = null;
		protected MCIndexKey _idxAfterOperOrdForFS = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			try {
				initProc();
				
				writeStartLog();

				chkSchedulerTyp();
				
				if (!_errFlg) {
					preSrchLockSdrvIf();
					
					exe();
				}

				setDown();
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
			logger().writeStartLog(MSLAL0635);
			pushStartLog(logger());
		}

		/**
		 * チェック結果を判定する。
		 */
		protected void chk() {

			MCMessageList msgList = new MCMessageList();

			chkSub(msgList);

			if (msgList.size() > 0) {
				FXBAL_BatchLogManager.logger().writeProcessLog(msgList);
				
				for (MCMessage msgR : msgList) {
					if (isSame(msgR.getID(), MSLAL0901)) {
						continue;
					}
					_errFlg = true;
					break;
				}
			}
		}
		
		protected void chkExistsItmOrder() {
			
			MCMessageList msgList = new MCMessageList();
			if (isNull(_cacheUpdItmOrdForFS)) {
				for (MST_ORDER_RECV_IF_R ordRecvIfR : _ordRecvIfL) {
					msgList.add(new MCMessage(MSLAL0902, ordRecvIfR.data_no(), ordRecvIfR.data_lno(), ordRecvIfR.ext_sys_cd(), ordRecvIfR.ext_itm_ord_no()));
					ordRecvIfR.setBooleanNE("err_flg", true);
				}
			}
			else {
				for (MST_ORDER_RECV_IF_R ordRecvIfR : _ordRecvIfL) {
					MST_ITM_ORDER_R updItmOrdR = _cacheUpdItmOrdForFS
							.getFirst(_idxUpdItmOrdForFS, ordRecvIfR.ext_itm_ord_no());
					if (isNull(updItmOrdR)) {
						msgList.add(new MCMessage(MSLAL0902, ordRecvIfR.data_no(), ordRecvIfR.data_lno(), ordRecvIfR.ext_sys_cd(), ordRecvIfR.ext_itm_ord_no()));
						ordRecvIfR.setBooleanNE("err_flg", true);
					}
					else {
						if (!isSameItm(ordRecvIfR, updItmOrdR)) {
							msgList.add(new MCMessage(MSLAL0930, ordRecvIfR.data_no(), ordRecvIfR.data_lno(), ordRecvIfR.ext_sys_cd(), ordRecvIfR.ext_itm_ord_no()
									, toDispItm(ordRecvIfR.itm_cd(), ordRecvIfR.itm_sub1(), ordRecvIfR.itm_sub2(), ordRecvIfR.itm_sub3())));
							ordRecvIfR.setBooleanNE("err_flg", true);
						}
					}
				}
			}
			if (msgList.size() > 0) {
				FXBAL_BatchLogManager.logger().writeProcessLog(msgList);
				_errFlg = true;
			}
		}

		protected void chkSchedulerTyp() {
			if (isBatchExec()) {
				MCMessageList msgList = new MCMessageList();
				
				msgList.addAll(check(up2(), OrdRecvIf_Upd02_OrdRepCndR.$if_scheduler_typ,
						new FXUCL_RequiredValidater()));
				msgList.addAll(check(up2(), OrdRecvIf_Upd02_OrdRepCndR.$if_scheduler_typ,
						new FXUCL_ConstValidater(MSC_IF_SCHEDULER_TYP.array())));
				
				if (msgList.size() > 0) {
					FXBAL_BatchLogManager.logger().writeProcessLog(msgList);
					_errFlg = true;
				}
			}
			else {
				up2().if_scheduler_typ(MSC_IF_SCHEDULER_TYP.GP.value());
			}
		}

		protected boolean isBatchExec() {
			if (isNull(up0().get(0).if_proc_typ()) && !isNull(up0().get(0).ext_sys_cd())) {
				return true;
			}
			return false;
		}

		/**
		 * チェック処理を実行する。
		 */
		protected MCMessageList chkSub(MCMessageList msgList) {

			if (!MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up2().if_scheduler_typ())) {
				msgList.add(chkLocCd());
				msgList.addAll(chkDataCrudTyp());
			}
			else {
				msgList.add(chkArgsOrderReplaceFlg());
				msgList.add(chkArgsLocCd());
				msgList.addAll(chkRequireForFS());
				msgList.addAll(chkOutSrcDtForFS());
				msgList.addAll(setRelatedErrForFS());
			}

			return msgList;
		}
		
		protected void cacheItmOrdForFS() {
			_cacheUpdItmOrdForFS = MCList.create(MST_ITM_ORDER_R.class);
			
			MST_ITM_ORDER_R itmord = MST_ITM_ORDER_R.create("ITMORD");
			MCQueryApiBuilder cacheItmOrd_bldr = MCQueryApiBuilder.create(itmord);
			cacheItmOrd_bldr.setWhere(itmord.itm_ord_no.eq(bind("ext_itm_ord_no")));
			
			dbSelectForUpdate("MSLAL9210_MST_ITM_ORDER_S04", _cacheUpdItmOrdForFS, cacheItmOrd_bldr, _ordRecvIfL);
			
			_idxUpdItmOrdForFS = _cacheUpdItmOrdForFS.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
		}
		
		protected void cacheOperOrdForFS() {
			_cacheUpdOperOrdForFS = MCList.create(MST_OPER_ORDER_R.class);
			
			MST_OPER_ORDER_R operord = MST_OPER_ORDER_R.create("OPERORD");
			MCQueryApiBuilder cacheOperOrd_bldr = MCQueryApiBuilder.create(operord);
			cacheOperOrd_bldr.setWhere(operord.itm_ord_no.eq(bind("ext_itm_ord_no")));
			
			dbSelectForUpdate("MSLAL9210_MST_OPER_ORDER_S05", _cacheUpdOperOrdForFS, cacheOperOrd_bldr, _ordRecvIfL);
			
			_idxUpdOperOrdForFS = _cacheUpdOperOrdForFS.createIndex(
					MST_OPER_ORDER_R.$itm_ord_no,
					MST_OPER_ORDER_R.$oper_ptn, MST_OPER_ORDER_R.$oper_cd, MST_OPER_ORDER_R.$oper_seq);
			_idxUpdOutSrcOperOrdForFS = _cacheUpdOperOrdForFS
					.createIndex(MST_OPER_ORDER_R.$itm_ord_no);
			
		}
		
		protected void complementUpdDataForFS() {
			for (MST_ORDER_RECV_IF_R ordRecvIfR : _ordRecvIfL) {
				setItmOrdInfo(ordRecvIfR);
				setOperOrdInfo(ordRecvIfR);
			}
		}
		
		protected void setItmOrdInfo(MST_ORDER_RECV_IF_R ordRecvIfR) {
			MST_ITM_ORDER_R updItmOrdR = _cacheUpdItmOrdForFS
					.getFirst(_idxUpdItmOrdForFS, ordRecvIfR.ext_itm_ord_no());
			
			if (isNull(updItmOrdR)) {
				return;
			}
			
			ordRecvIfR.itm_cd(updItmOrdR.itm_cd());
			ordRecvIfR.itm_sub1(updItmOrdR.itm_sub1());
			ordRecvIfR.itm_sub2(updItmOrdR.itm_sub2());
			ordRecvIfR.itm_sub3(updItmOrdR.itm_sub3());
			ordRecvIfR.ver_no(updItmOrdR.ver_no());
			ordRecvIfR.strg_loc_cd(updItmOrdR.strg_loc_cd());
			ordRecvIfR.bom_ptn(updItmOrdR.bom_ptn());
			ordRecvIfR.inst_qty(updItmOrdR.inst_qty());
			ordRecvIfR.yield_schd_qty(updItmOrdR.yield_schd_qty());
			ordRecvIfR.sno1(updItmOrdR.sno1());
			ordRecvIfR.sno2(updItmOrdR.sno2());
			ordRecvIfR.sno3(updItmOrdR.sno3());
			ordRecvIfR.sno4(updItmOrdR.sno4());
			ordRecvIfR.itm_ord_sub_char1(updItmOrdR.sub_char1());
			ordRecvIfR.itm_ord_sub_char2(updItmOrdR.sub_char2());
			ordRecvIfR.itm_ord_sub_char3(updItmOrdR.sub_char3());
			ordRecvIfR.addDateColumn("org_avl_schd_dt", updItmOrdR.avl_schd_dt());
			
			if (MSC_ITM_ORD_TYP.isOUTSRC(ordRecvIfR.itm_ord_typ())) {
				ordRecvIfR.mfg_loc_cd(updItmOrdR.mfg_loc_cd());
				ordRecvIfR.oper_ptn(updItmOrdR.oper_ptn());
				if (!up2().allow_outsrc_schd_flg()) {
					ordRecvIfR.po_schd_dt(updItmOrdR.po_schd_dt());
					ordRecvIfR.mfg_st_schd_dt(updItmOrdR.mfg_st_schd_dt());
					ordRecvIfR.mfg_end_schd_dt(updItmOrdR.mfg_end_schd_dt());
					ordRecvIfR.strg_schd_dt(updItmOrdR.strg_schd_dt());
					ordRecvIfR.accpt_schd_dt(updItmOrdR.accpt_schd_dt());
					ordRecvIfR.insp_st_schd_dt(updItmOrdR.insp_st_schd_dt());
					ordRecvIfR.insp_end_schd_dt(updItmOrdR.insp_end_schd_dt());
					ordRecvIfR.master_dt(updItmOrdR.master_dt());
				}
			}
		}
		
		protected void setOperOrdInfo(MST_ORDER_RECV_IF_R ordRecvIfR) {
			MST_OPER_ORDER_R updOperOrdR = null;
			if (MSC_ITM_ORD_TYP.isOUTSRC(ordRecvIfR.itm_ord_typ())) {
				updOperOrdR = _cacheUpdOperOrdForFS.getFirst(_idxUpdOutSrcOperOrdForFS,
						ordRecvIfR.ext_itm_ord_no());
			}
			else {
				updOperOrdR = _cacheUpdOperOrdForFS.getFirst(_idxUpdOperOrdForFS,
						ordRecvIfR.ext_itm_ord_no(),
						ordRecvIfR.oper_ptn(), ordRecvIfR.oper_cd(), ordRecvIfR.oper_seq());
			}
			
			if (isNull(updOperOrdR)) {
				return;
			}
			
			ordRecvIfR.disp_seq(updOperOrdR.disp_seq());
			ordRecvIfR.loc_cd(updOperOrdR.loc_cd());
			ordRecvIfR.oper_ord_sub_char1(updOperOrdR.sub_char1());
			ordRecvIfR.oper_ord_sub_char2(updOperOrdR.sub_char2());
			ordRecvIfR.oper_ord_sub_char3(updOperOrdR.sub_char3());
			ordRecvIfR.addDateColumn("org_st_schd_tm", updOperOrdR.st_schd_tm());
			
			if (MSC_ITM_ORD_TYP.isOUTSRC(ordRecvIfR.itm_ord_typ())) {
				if(!up2().allow_outsrc_schd_flg()) {
					ordRecvIfR.end_schd_tm(updOperOrdR.end_schd_tm());
				}
				ordRecvIfR.oper_ptn(updOperOrdR.oper_ptn());	
				ordRecvIfR.oper_schd_qty(updOperOrdR.oper_schd_qty());
				ordRecvIfR.oper_cd(updOperOrdR.oper_cd());
				ordRecvIfR.oper_seq(updOperOrdR.oper_seq());
			}
		}
		
		protected MCMessageList chkRequireForFS() {
			MCMessageList msgList = new MCMessageList();
			for (MST_ORDER_RECV_IF_R ordRecvIfR : _ordRecvIfL) {
				if (isNull(ordRecvIfR.itm_ord_typ())) {
					msgList.add(new MCMessage(ordRecvIfR, null, MSLAL0702,
							getDBLabel(ordRecvIfR.tableName(),
									MST_ORDER_RECV_IF_R.$itm_ord_typ.toUpperCase())));
					ordRecvIfR.setBooleanNE("err_flg", true);
				}
				if (isFixedOutsrc(ordRecvIfR, up2()) ) {
					if (isNull(ordRecvIfR.avl_schd_dt())) {
						msgList.add(new MCMessage(ordRecvIfR, null, MSLAL0702,
								getDBLabel(ordRecvIfR.tableName(),
										MST_ORDER_RECV_IF_R.$avl_schd_dt.toUpperCase())));
						ordRecvIfR.setBooleanNE("err_flg", true);
					}
					if (isNull(ordRecvIfR.st_schd_tm())) {
						msgList.add(new MCMessage(ordRecvIfR, null, MSLAL0702,
								getDBLabel(ordRecvIfR.tableName(),
										MST_ORDER_RECV_IF_R.$st_schd_tm.toUpperCase())));
						ordRecvIfR.setBooleanNE("err_flg", true);
					}
				}
				if (ordRecvIfR.getBooleanNE("err_flg")) {
					_errFlg = true;
				}
			}
			return msgList;
		}
		
		protected MCMessageList setRelatedErrForFS() {
			MCMessageList msgList = new MCMessageList();
			if (_errFlg) {
				for (MST_ORDER_RECV_IF_R ordRecvIfR : _ordRecvIfL) {
					if (!ordRecvIfR.getBooleanNE("err_flg")) {
						msgList.add(new MCMessage(ordRecvIfR, null, MSLAL0905,
								ordRecvIfR.data_no(), ordRecvIfR.data_lno(), ordRecvIfR.ext_sys_cd(),
								ordRecvIfR.ext_itm_ord_no()));
						ordRecvIfR.setBooleanNE("err_flg", true);
					}
				}
			}
			return msgList;
		}
		
		protected MCMessageList chkOutSrcDtForFS() {
			MCMessageList msgList = new MCMessageList();
			for (MST_ORDER_RECV_IF_R ordRecvIfR : _ordRecvIfL) {
				if (isFixedOutsrc(ordRecvIfR, up2()) && isOutSrcDtChangedForFS(ordRecvIfR)) {
					msgList.add(new MCMessage(ordRecvIfR, null, MSLAL0922,
							ordRecvIfR.data_no(), ordRecvIfR.data_lno(), ordRecvIfR.ext_sys_cd(),
							ordRecvIfR.ext_itm_ord_no(),
							toYMDHMString(ordRecvIfR.getDateNE("org_st_schd_tm")),
							toYMDString(ordRecvIfR.getDateNE("org_avl_schd_dt"))));
					ordRecvIfR.setBooleanNE("err_flg", true);
					_errFlg = true;
				}
			}
			return msgList;
		}
		
		protected boolean isOutSrcDtChangedForFS(MST_ORDER_RECV_IF_R ordRecvIfR) {
				if ((!isNull(ordRecvIfR.avl_schd_dt()) && !isNull(ordRecvIfR.getDateNE("org_avl_schd_dt"))
						&& !isSame(toYMDString(ordRecvIfR.getDateNE("org_avl_schd_dt")),
								toYMDString(ordRecvIfR.avl_schd_dt())))
						|| (!isNull(ordRecvIfR.st_schd_tm()) && !isNull(ordRecvIfR.getDateNE("org_st_schd_tm"))
								&& !isSame(ordRecvIfR.getDateNE("org_st_schd_tm"),
										ordRecvIfR.st_schd_tm()))) {
					return true;
				}
			return false;
		}
		
		protected MCMessage chkArgsOrderReplaceFlg() {
			if (up2().ord_rep_flg()) {
				return new MCMessage(MSLAL0901, MSC_IF_SCHEDULER_TYP.FLEXSCHE.value(),
						getLabel(up2(), OrdRecvIf_Upd02_OrdRepCndR.$ord_rep_flg));
			}
			return null;
		}
		
		protected MCMessage chkArgsLocCd() {
			if (!isNull(up2().loc_cd())) {
				return new MCMessage(MSLAL0901, MSC_IF_SCHEDULER_TYP.FLEXSCHE.value(),
						getLabel(up2(), OrdRecvIf_Upd02_OrdRepCndR.$loc_cd));
			}
			return null;
		}

		/**
		 * 場所ＣＤの入力チェック
		 * */
		protected MCMessage chkLocCd() {

			// up0のリストにはすべて同一のオーダ洗い替えＦＬＧ、場所ＣＤが設定されるので
			// 先頭１件目のチェックのみを行う
			if (up2().ord_rep_flg()) {
				// オーダ洗い替えＦＬＧがtrueの場合のみ場所コードの入力チェックを行う
				if (isNull(up2().loc_cd())) {
					
					return new MCMessage(MSLAL0702, getLabel(up2(), OrdRecvIf_Upd02_OrdRepCndR.$loc_cd));
				}
			}

			return null;
		}

		/**
		 * オーダ洗い替えモード時のチェック処理
		 * 登録対象のオーダにデータ更新区分が「新規」以外のオーダがあるかチェックし、
		 * 「新規」以外のオーダが存在する場合は、メッセージを出力して処理を終了する
		 */
		protected MCMessageList chkDataCrudTyp() {
			MCMessageList msgList = new MCMessageList();
			for (MST_ORDER_RECV_IF_R r: _ordRecvIfL) {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					msgList.add(new MCMessage(MSLAL0760, r.data_no(), r.data_lno(), r.ext_sys_cd(), r.ext_itm_ord_no(), r.ext_oper_ord_no()));
				}
			}
			
			return msgList;
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
			
			logger().writeEndLog(MSLAL0636, _totalNum, _okNum, _errNum, _skipNum);
			pushEndLog(logger());
			// Loggerを新規作成した場合（呼出元からLoggerを引き継がない場合）のみクローズ
			if (_crtNewLogger) {
				logger().close();
			}
		}
		
		/**
		 * オーダ受信ＩＦデータを取得し、送受信ＩＦをロックする。
		 */		
		protected void preSrchLockSdrvIf() {
			
			_ordRecvIfL = MCList.create(MST_ORDER_RECV_IF_R.class);
			_ordRecvIfL.addNumberColumn("sdrv_if_data_no");
			
			MST_ORDER_RECV_IF_R t1 = MST_ORDER_RECV_IF_R.create("T");
			MCQueryApiBuilder ordRecvIfL_bldr = MCQueryApiBuilder.create(t1);
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");
			
			ordRecvIfL_bldr.addSelect(t2.data_no.as("sdrv_if_data_no"));
			
			ordRecvIfL_bldr.addLeftOuterJoin(t2, t1.data_no.eq(t2.data_no));
			
			ordRecvIfL_bldr.setWhere(value(0).eq(value(0)));
			ordRecvIfL_bldr.addWhereWithAnd(bracket(t2.sdrv_sts_typ.isNull().or(
					t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			ordRecvIfL_bldr.addWhereWithAnd(t1.imp_flg.eq(value(true)));
			
			if (!up0().isEmpty()) {
				ordRecvIfL_bldr.addWhereWithCutOffAnd(t1.data_lno.eq(bind("data_lno")));
				ordRecvIfL_bldr.addWhereWithCutOffAnd(t1.data_no.eq(bind("data_no")));
				ordRecvIfL_bldr.addWhereWithCutOffAnd(t1.ext_data_no.eq(bind("ext_data_no")));
				ordRecvIfL_bldr.addWhereWithCutOffAnd(t1.ext_sys_cd.eq(bind("ext_sys_cd")));
				if (MSC_IF_SCHEDULER_TYP.isGP(up2().if_scheduler_typ()) && up2().ord_rep_flg()) {
					// オーダ洗い替えモード時にのみ場所CDで取得対象を絞り込む
					up0().addStringColumn(OrdRecvIfImp_Upd01_CndR.$loc_cd, up2().loc_cd());
					ordRecvIfL_bldr.addWhereWithCutOffAnd(t1.loc_cd.eq(bind("loc_cd")));
				}
				dbSelect("MSLAL9210_MST_ORDER_RECV_IF_S01", _ordRecvIfL, ordRecvIfL_bldr, up0());
			}
			else {
				dbSelect("MSLAL9210_MST_ORDER_RECV_IF_S02", _ordRecvIfL, ordRecvIfL_bldr);
			}
			
			if (!_ordRecvIfL.isEmpty()) {
				
				MCList<MST_ORDER_RECV_IF_R> lockIfL = _ordRecvIfL.subList(r->!isNull(r.getNumberNE("sdrv_if_data_no")));
				
				if (!lockIfL.isEmpty()) {
					
					MCQueryApiBuilder sdrvIfL_bldr = MCQueryApiBuilder.create(PFT_SDRV_IF_R.create("T"));
					sdrvIfL_bldr.setSelect(sdrvIfL_bldr.getBaseDbc().getKeyColumn$());
					
					dbSelectKeyForUpdate("MSLAL9210_PFT_SDRV_IF_S01", MCList.create(PFT_SDRV_IF_R.class), sdrvIfL_bldr, lockIfL);
				}
			}
			// オーダ受信ＩＦから取得したデータは、バッチ引数に依らずオーダ洗い替えモードオフで設定しておく
			// ※後の処理でオーダ洗い替えモードがオンで指定されていた場合の処理を実行時に再設定する
			_ordRecvIfL.addBooleanColumn(OrdRecvIfImp_Upd01_CndR.$ord_rep_flg, false);
		}
		
		protected void exe() {
			// up0のリストにはすべて同一のオーダ洗い替えＦＬＧ、場所ＣＤが設定されるので
			// 先頭１件目のオーダ洗い替えＦＬＧを取得する
			if (MSC_IF_SCHEDULER_TYP.isGP(up2().if_scheduler_typ()) && up2().ord_rep_flg()) {
				chk();
				if (_errFlg) {
					// エラーがある場合は、以降の処理を行わずに処理を終了する
					return;
				}
				// オーダ洗い替えモードの場合かつ、取込対象のオーダが1件以上存在する場合のみ
				// 洗い替え対象オーダの削除を実施する
				if (!_ordRecvIfL.isEmpty()) {
					delOrder(up0().get(0));
				}
			}
			else if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up2().if_scheduler_typ())){
				
				if (!isNull(_ordRecvIfL)) { 
					cacheItmOrdForFS();
					cacheOperOrdForFS();
					setNullValToItmSub();
					chkExistsItmOrder();
					complementUpdDataForFS();
				}
				
				chk();
				
				if (_errFlg) {
					return;
				}
				
				if (!_ordRecvIfL.isEmpty()) {
					MCList<MST_ITM_ORDER_R> itmOrderList = getItmOrder();
					
					chkForFlexsche(itmOrderList);
					if (_errFlg) {
						return;
					}
					
				}
			}

			if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up2().if_scheduler_typ())) {
				cacheItmLnkForFS(_ordRecvIfL);
			}

			callOrdRecvIfUpd03();

			if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up2().if_scheduler_typ())) {
				cacheAfterOperOrdForFS();
				deleteItmLnkFixForFS();
				createItmLnkFixForFS();
				deleteNotExistsItmLnkFixForFS();
			}
		}
		
		protected void setNullValToItmSub() {
			for (MST_ORDER_RECV_IF_R ordRecvIfR : _ordRecvIfL) {
				ordRecvIfR.itm_sub1(nvl(ordRecvIfR.itm_sub1(), MAC_STR.NULL_VAL.value()));
				ordRecvIfR.itm_sub2(nvl(ordRecvIfR.itm_sub2(), MAC_STR.NULL_VAL.value()));
				ordRecvIfR.itm_sub3(nvl(ordRecvIfR.itm_sub3(), MAC_STR.NULL_VAL.value()));
			}
		}
		
		protected void deleteNotExistsItmLnkFixForFS() {
			MST_ITM_LNK_FIX_R itmLnkFix = MST_ITM_LNK_FIX_R.create("ITMLNKFIX");
			MST_ITM_ORDER_R itmOrder1 = MST_ITM_ORDER_R.create("ITMORDER1");
			MST_ITM_ORDER_R itmOrder2 = MST_ITM_ORDER_R.create("ITMORDER2");
			
			MCDelete deleteQuery = sql("MSLAL9210_MST_ITM_LNK_FIX_D02").delete(itmLnkFix)
					.where(value(0).eq(value(0))
					.and(notExists(subQuery().select(value("X")).from(itmOrder1)
							.where(value(0).eq(value(0))
									.and(itmOrder1.itm_ord_no.eq(itmLnkFix.itm_ord_no)))))
					.or(notExists(subQuery().select(value("X")).from(itmOrder2)
							.where(value(0).eq(value(0))
									.and(itmOrder2.itm_ord_no.eq(itmLnkFix.par_itm_ord_no))))));
			
			deleteQuery.executeUpdate();
		}
		
		protected void createItmLnkFixForFS() {
			MCList<MST_ITM_LNK_R> itmLnkL = _cacheItmLnkForFS;
			MCList<MST_ITM_LNK_FIX_R> itmLnkFixL = MCList.create(MST_ITM_LNK_FIX_R.class);
			
			for (MST_ITM_LNK_R itmLnkR : itmLnkL) {
				MCList<MST_OPER_ORDER_R> afterOperForFSL = _cacheAfterOperOrdForFS
						.subList(_idxAfterOperOrdForFS,
								itmLnkR.par_itm_ord_no(), 
								itmLnkR.oper_ptn(), itmLnkR.oper_cd(), itmLnkR.oper_seq());
				for (MST_OPER_ORDER_R afterOperForFSR : afterOperForFSL) {
					MST_ITM_LNK_FIX_R itmLnkFixR = MST_ITM_LNK_FIX_R.create();
					itmLnkFixR.setValuesByName(itmLnkR);
					itmLnkFixR.par_oper_ord_no(afterOperForFSR.oper_ord_no());
					itmLnkFixR.oper_ptn(afterOperForFSR.oper_ptn());
					itmLnkFixR.oper_cd(afterOperForFSR.oper_cd());
					itmLnkFixR.oper_seq(afterOperForFSR.oper_seq());
					itmLnkFixL.add(itmLnkFixR);
				}
			}
			
			if (!itmLnkFixL.isEmpty()) {
				MCList<MST_ITM_LNK_FIX_R>insL = itmLnkFixL.groupBy(
						MST_ITM_LNK_FIX_R.$itm_ord_no, MST_ITM_LNK_FIX_R.$par_itm_ord_no, 
						MST_ITM_LNK_FIX_R.$par_oper_ord_no, MST_ITM_LNK_FIX_R.$sim_mrp_no,
						MST_ITM_LNK_FIX_R.$oper_ptn, MST_ITM_LNK_FIX_R.$oper_cd, MST_ITM_LNK_FIX_R.$oper_seq,
						MST_ITM_LNK_FIX_R.$wg_cd, MST_ITM_LNK_FIX_R.$intr_rmrks,
						MST_ITM_LNK_FIX_R.$sub_char1, MST_ITM_LNK_FIX_R.$sub_char2, MST_ITM_LNK_FIX_R.$sub_char3  
						);
				MCQueryApiBuilder itmLnkFixL_bldr = MCQueryApiBuilder.create(MST_ITM_LNK_FIX_R.create("ITMLNKFIX"));
				dbInsertEx("MSLAL9210_MST_ITM_LNK_FIX_I01", insL, itmLnkFixL_bldr);
			}
		}
		
		protected void deleteItmLnkFixForFS() {
			MST_ITM_LNK_FIX_R itmLnkFixR = MST_ITM_LNK_FIX_R.create("ITMLNKFIX");
			execDbDelete("MSLAL9210_MST_ITM_LNK_FIX_D01", itmLnkFixR,
					itmLnkFixR.par_itm_ord_no.eq(bind("par_itm_ord_no")),
					_cacheItmLnkForFS);
		}
		
		protected void cacheAfterOperOrdForFS() {
			_cacheAfterOperOrdForFS = MCList.create(MST_OPER_ORDER_R.class);
			
			MST_OPER_ORDER_R operOrd = MST_OPER_ORDER_R.create("OPERORDER");
			MCQueryApiBuilder cacheAfterOperOrdDForFS_bldr = MCQueryApiBuilder.create(operOrd);
			MCList<MST_ITM_LNK_R> bindL = _cacheItmLnkForFS.groupBy(
					MST_ITM_LNK_R.$par_itm_ord_no, MST_ITM_LNK_R.$oper_ptn,
					MST_ITM_LNK_R.$oper_cd, MST_ITM_LNK_R.$oper_seq);
			cacheAfterOperOrdDForFS_bldr.addSelect(operOrd.itm_ord_no);
			cacheAfterOperOrdDForFS_bldr.addSelect(operOrd.oper_ord_no);
			cacheAfterOperOrdDForFS_bldr.addSelect(operOrd.oper_ptn);
			cacheAfterOperOrdDForFS_bldr.addSelect(operOrd.oper_cd);
			cacheAfterOperOrdDForFS_bldr.addSelect(operOrd.oper_seq);
			cacheAfterOperOrdDForFS_bldr.setWhere(operOrd.itm_ord_no.eq(bind("par_itm_ord_no")));
			cacheAfterOperOrdDForFS_bldr.addWhereWithAnd(operOrd.oper_ptn.eq(bind("oper_ptn")));
			cacheAfterOperOrdDForFS_bldr.addWhereWithAnd(operOrd.oper_cd.eq(bind("oper_cd")));
			cacheAfterOperOrdDForFS_bldr.addWhereWithAnd(operOrd.oper_seq.eq(bind("oper_seq")));
			
			dbSelectForUpdate("MSLAL9210_MST_OPER_ORDER_S04", _cacheAfterOperOrdForFS, cacheAfterOperOrdDForFS_bldr, bindL);
			
			_idxAfterOperOrdForFS = _cacheAfterOperOrdForFS.createIndex(
					MST_OPER_ORDER_R.$itm_ord_no, MST_OPER_ORDER_R.$oper_ptn,
					MST_OPER_ORDER_R.$oper_cd, MST_OPER_ORDER_R.$oper_seq);
		}
		
		protected void cacheItmLnkForFS(MCList<MST_ORDER_RECV_IF_R> ordRecvIfL) {
			_cacheItmLnkForFS = MCList.create(MST_ITM_LNK_R.class);
			MCList<MST_ITM_LNK_R> tmpItmLnkL = MCList.create(MST_ITM_LNK_R.class);
			
			MST_ITM_LNK_R itmLnk = MST_ITM_LNK_R.create("ITMLNK");
			MCQueryApiBuilder cacheItmLnkForFS_bldr = MCQueryApiBuilder.create(itmLnk);
			MCList<MST_ORDER_RECV_IF_R> bindL = ordRecvIfL.groupBy(MST_ORDER_RECV_IF_R.$ext_itm_ord_no);
			cacheItmLnkForFS_bldr.setWhere(itmLnk.par_itm_ord_no.eq(bind("ext_itm_ord_no")));
			
			dbSelectForUpdate("MSLAL9210_MST_ITM_LNK_S01", tmpItmLnkL, cacheItmLnkForFS_bldr, bindL);
			
			if (!isNull(tmpItmLnkL)) {
				for (MST_ITM_LNK_R tmpItmLnkR : tmpItmLnkL) {
					if (isCacheItmLnkTerget(tmpItmLnkR, ordRecvIfL)) {
						_cacheItmLnkForFS.add(tmpItmLnkR);
					}
				}
			}
			
			_idxItmLnkForFS = _cacheItmLnkForFS.createIndex(MST_ITM_LNK_R.$par_itm_ord_no);
		}
		
		protected boolean isCacheItmLnkTerget(MST_ITM_LNK_R tmpItmLnkR, MCList<MST_ORDER_RECV_IF_R> ordRecvIfL) {
			for (MST_ORDER_RECV_IF_R ordRecvIfR : ordRecvIfL) {
				if (isSame(tmpItmLnkR.itm_ord_no(), ordRecvIfR.ext_itm_ord_no())) {
					return true;
				}
			}
			return false;
		}
		
		protected void chkForFlexsche(MCList<MST_ITM_ORDER_R> itmOrderList) {
			MCMessageList msgList = new MCMessageList();
			
			chkForFlexscheSub(msgList, itmOrderList);
			
			if (msgList.size() > 0) {
				FXBAL_BatchLogManager.logger().writeProcessLog(msgList);
				_errFlg = true;
			}
		}
		
		protected void chkForFlexscheSub(MCMessageList msgList, MCList<MST_ITM_ORDER_R> itmOrderList) {
			boolean err_exists = false;
			_ordRecvIfL.addBooleanColumn("err_flg", false);
			err_exists = chkitmOrderExists(msgList, itmOrderList);
			
			if (!err_exists) {
				err_exists = chkitmOrderSavStatus(msgList, itmOrderList);
			}
			
			if (!err_exists) {
				err_exists = chkitmOrderSendFlg(msgList, itmOrderList);
			}
			
			if (err_exists) {
				setOtherErrMsg(msgList);
			}
		}
		
		protected boolean chkitmOrderSendFlg(MCMessageList msgList, MCList<MST_ITM_ORDER_R> itmOrderList) {
			MCIndexKey itmOrderListKey = itmOrderList.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			for (MST_ORDER_RECV_IF_R ordRecvIfR : _ordRecvIfL) {
				MST_ITM_ORDER_R itmOrderR = itmOrderList.getFirst(itmOrderListKey, ordRecvIfR.ext_itm_ord_no());
				if (!itmOrderR.ord_snd_flg()) {
					msgList.add(new MCMessage(MSLAL0904, ordRecvIfR.data_no(), ordRecvIfR.data_lno(), ordRecvIfR.ext_sys_cd(), ordRecvIfR.ext_itm_ord_no()));
					ordRecvIfR.setBoolean("err_flg", true);
					return true;
				}
			}
			
			return false;
		}
		
		protected boolean chkitmOrderSavStatus(MCMessageList msgList, MCList<MST_ITM_ORDER_R> itmOrderList) {
			MCIndexKey itmOrderListKey = itmOrderList.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			for (MST_ORDER_RECV_IF_R ordRecvIfR : _ordRecvIfL) {
				MST_ITM_ORDER_R itmOrderR = itmOrderList.getFirst(itmOrderListKey, ordRecvIfR.ext_itm_ord_no());
				if (!MSC_ITM_ORD_STS_TYP.isSAV(itmOrderR.itm_ord_sts_typ())) {
					msgList.add(new MCMessage(MSLAL0903, ordRecvIfR.data_no(), ordRecvIfR.data_lno(), ordRecvIfR.ext_sys_cd(), ordRecvIfR.ext_itm_ord_no(), itmOrderR.itm_ord_sts_typ()));
					ordRecvIfR.setBoolean("err_flg", true);
					return true;
				}
			}
			
			return false;
		}
		
		protected boolean chkitmOrderExists(MCMessageList msgList, MCList<MST_ITM_ORDER_R> itmOrderList) {
			if (itmOrderList.isEmpty()) {
				for (MST_ORDER_RECV_IF_R ordRecvIfR : _ordRecvIfL) {
					msgList.add(new MCMessage(MSLAL0902, ordRecvIfR.data_no(), ordRecvIfR.data_lno(), ordRecvIfR.ext_sys_cd(), ordRecvIfR.ext_itm_ord_no()));
					ordRecvIfR.setBoolean("err_flg", true);
				}
				return true;
			}
			
			MCIndexKey itmOrderListKey = itmOrderList.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			for (MST_ORDER_RECV_IF_R ordRecvIfR : _ordRecvIfL) {
				MST_ITM_ORDER_R itmOrderR = itmOrderList.getFirst(itmOrderListKey, ordRecvIfR.ext_itm_ord_no());
				if (isNull(itmOrderR)) {
					msgList.add(new MCMessage(MSLAL0902, ordRecvIfR.data_no(), ordRecvIfR.data_lno(), ordRecvIfR.ext_sys_cd(), ordRecvIfR.ext_itm_ord_no()));
					ordRecvIfR.setBoolean("err_flg", true);
					return true;
				}
			}
			
			return false;
		}
		
		protected void setOtherErrMsg(MCMessageList msgList) {
			for (MST_ORDER_RECV_IF_R ordRecvIfR : _ordRecvIfL) {
				if (ordRecvIfR.getBoolean("err_flg")) {
					continue;
				}
				msgList.add(new MCMessage(MSLAL0905, ordRecvIfR.data_no(), ordRecvIfR.data_lno(), ordRecvIfR.ext_sys_cd(), ordRecvIfR.ext_itm_ord_no()));
			}
		}
		
		protected MCList<MST_ITM_ORDER_R> getItmOrder() {
			MCList<MST_ITM_ORDER_R> itmOrdList = MCList.create(MST_ITM_ORDER_R.class);
			
			MST_ITM_ORDER_R itmOrder = MST_ITM_ORDER_R.create("T1");
			MCQueryApiBuilder itmOrd_bldr = MCQueryApiBuilder.create(itmOrder);
			itmOrd_bldr.addWhereWithAnd(itmOrder.itm_ord_no.eq(bind("ext_itm_ord_no")));
			
			dbSelectForUpdate("MSLAL9210_MST_ITM_ORDER_S03", itmOrdList, itmOrd_bldr, _ordRecvIfL);
			
			return itmOrdList;
		}
		
		/**
		 * オーダ洗い替えモードの場合、指定された場所に属する送信ＦＬＧがオンとなっている保存オーダを削除（洗い替え）する
		 */
		protected void delOrder(IfDataImp_Upd01_DtlR arg) {
			MCList<MST_ITM_ORDER_R> itmOrdList = MCList.create(MST_ITM_ORDER_R.class);
			MCList<Ord_Upd01_Dtl1R> delOrdWithRqmtL = MCList.create(Ord_Upd01_Dtl1R.class);
			
			MST_ITM_ORDER_R itmOrder = MST_ITM_ORDER_R.create("T1");
			MST_OPER_ORDER_R operOrder = MST_OPER_ORDER_R.create("T2");
			MCQueryApiBuilder itmOrd_bldr = MCQueryApiBuilder.create(itmOrder);
			itmOrd_bldr.addLeftOuterJoin(operOrder, itmOrder.itm_ord_no.eq(operOrder.itm_ord_no));
			
			itmOrd_bldr.addSelect(operOrder.oper_ord_no);
			itmOrd_bldr.addSelect(operOrder.ext_oper_ord_no);

			// 送信FLGがオン
			itmOrd_bldr.addWhereWithAnd(itmOrder.ord_snd_flg.eq(value(true)));
			// 受信FLGがオフ
			itmOrd_bldr.addWhereWithAnd(itmOrder.ord_rcv_flg.eq(value(false)));
			// 引数指定された場所
			itmOrd_bldr.addWhereWithAnd(itmOrder.mfg_loc_cd.eq(bind("loc_cd")));
			// オーダ状況区分が「保存」
			itmOrd_bldr.addWhereWithAnd(itmOrder.itm_ord_sts_typ.eq(value(MSC_ITM_ORD_STS_TYP.SAV.value())));

			// 洗い替え対象となる品目オーダ情報を検索する
			dbSelect("MSLAL9920_MST_ITM_ORDER_S01", itmOrdList, itmOrd_bldr, arg);

			// 洗い替えで削除対象のオーダが検索された場合に削除用の受信オーダのデータを作成する
			if (!itmOrdList.isEmpty()) {
				MSBCL_OrdRegService.Ord_Upd01 upd = MSBCL_OrdRegService.crtOrd_Upd01();
				Ord_Upd01_Dtl1R hdrR;
				for (MST_ITM_ORDER_R r : itmOrdList) {
					hdrR = Ord_Upd01_Dtl1R.create();
					hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					hdrR.mrp_typ(MSC_MRP_TYP.MRP.value());
					hdrR.ord(r);
					upd.up0().add(hdrR);
				}

				if (!upd.up0().isEmpty()) {
					//所要ＮＯを持つ削除対象のオーダを保持しておく
					delOrdWithRqmtL = upd.up0().clone().subList(r->!isNull(r.rqmt_no()));
					upd.exec();
				}
				if (!delOrdWithRqmtL.isEmpty()) {
					//削除したオーダに紐づく日次生産依頼を確定にする
					updRqmtFixFlg(delOrdWithRqmtL);
				}
			}
			
			// 洗い替えで登録するオーダは送信済FLGをオンとして登録するため、オーダ洗い替えモードを再設定する
			_ordRecvIfL.setBoolean(OrdRecvIfImp_Upd01_CndR.$ord_rep_flg, true);
		}
		/** 日次生産依頼の確定フラグを更新する */
		protected void updRqmtFixFlg(MCList<Ord_Upd01_Dtl1R> delOrdL) {
			MCList<MST_RQMT_R> rqmtL = MCList.create(MST_RQMT_R.class);
			for (Ord_Upd01_Dtl1R r: delOrdL) {
				MST_RQMT_R rqmtR = MST_RQMT_R.create();
				rqmtR.rqmt_no(r.rqmt_no());
				rqmtL.add(rqmtR);
			}
			if (!rqmtL.isEmpty()) {
				updRqmt(rqmtL.groupBy(MST_RQMT_R.$rqmt_no));
			}
		}
		protected void updRqmt(MCList<MST_RQMT_R> rqmtNoL) {
			MCList<MST_RQMT_R> rqmtL = MCList.create(MST_RQMT_R.class);
			MST_RQMT_R rqmtL_t = MST_RQMT_R.create("T");
			MCQueryApiBuilder rqmtL_bldr = MCQueryApiBuilder.create(rqmtL_t);
			rqmtL_bldr.setSelect(rqmtL_t.rqmt_no, rqmtL_t.rqmt_qty, rqmtL_t.fix_flg);
			rqmtL_bldr.setOrderByAsc(rqmtL_t.rqmt_no);
			dbSelectKeyForUpdate("MSLAL9210_MST_RQMT_S01", rqmtL, rqmtL_bldr, rqmtNoL);
			
			MCList<MST_ITM_ORDER_R> itmOrdL = MCList.create(MST_ITM_ORDER_R.class);
			MST_ITM_ORDER_R itmOrdL_t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder itmOrdL_bldr = MCQueryApiBuilder.create(itmOrdL_t);
			itmOrdL_bldr.addWhereWithAnd(itmOrdL_t.rqmt_no.eq(bind("rqmt_no")));
			itmOrdL_bldr.addGroupBy(itmOrdL_t.rqmt_no, itmOrdL_t.itm_ord_sts_typ);
			dbSelect("MSLAL9210_MST_ITM_ORDER_S02", itmOrdL, itmOrdL_bldr, rqmtL);
			
			MCList<MST_RQMT_R> updL = MCList.create(MST_RQMT_R.class);
			MCIndexKey idx = itmOrdL.createIndex(MST_ITM_ORDER_R.$rqmt_no);
			for (MST_RQMT_R r : rqmtL) {
				boolean oldFlg = r.fix_flg();
				setRqmtFixFlg(r, itmOrdL.subList(idx, r.rqmt_no()));
				if(!isSame(oldFlg, r.fix_flg())) {
					updL.add(r);
				}
			}
			if(!updL.isEmpty()) {
				updL.setBoolean(MST_RQMT_R.$fix_flg, true);
				MST_RQMT_R updL_t = MST_RQMT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
				updL_bldr.setSet(updL_t.fix_flg);
				dbUpdateKey("MSLAL9210_MST_RQMT_U01", updL, updL_bldr);
			}
		}
		/** 日時生産依頼の確定フラグを設定する */
		protected void setRqmtFixFlg(MST_RQMT_R rqmt, MCList<MST_ITM_ORDER_R> itmOrdL) {
			//同一の所要NOに紐づくオーダが全て洗い替えされた場合のみ、確定フラグをオンに更新する
			if(itmOrdL.size() == 0) {
				rqmt.fix_flg(true);
			}
		}
		/**
		 * スレッドを分割し、各スレッドごとにオーダ受信ＩＦ取込３を実行する。
		 */
		protected void callOrdRecvIfUpd03() {
			
			int no = 0;
			MSLAL_OrdRecvIfService.OrdRecvIf_Upd03 upd03;
			List<MSLAL_OrdRecvIfService.OrdRecvIf_Upd03> opeL = new ArrayList<>();
			
			for (MCList<MST_ORDER_RECV_IF_R> grpL : _ordRecvIfL.groupList("ext_sys_cd", "strg_loc_cd")) {
				upd03 = MSLAL_OrdRecvIfService.crtOrdRecvIf_Upd03();
				upd03._no = ++no;
				setAll(upd03.up0(), grpL, createMap_OrdRecvIf_Upd03_DtlR_MST_ORDER_RECV_IF_R());
				upd03.up0().setValue(OrdRecvIf_Upd03_DtlR.$if_scheduler_typ, up2().if_scheduler_typ());
				upd03.up0().setValue(OrdRecvIf_Upd03_DtlR.$allow_outsrc_schd_flg, up2().allow_outsrc_schd_flg());
				opeL.add(upd03);
			}
			if (!opeL.isEmpty()) {
				if (MCServerThreadManager.getLimitThreadSize() <= 1) {
					MCServerThreadManager.setUseMainDBTran(true);
					MCServerThreadManager.invokeAndWait(1, opeL, FXBAL_BatchLogManager.class);
				}
				else {
					MCServerThreadManager.setCommitAndRollback(true);
					// 件数の多いスレッドを優先に実行する。
					Collections.sort(opeL, new Comparator<MSLAL_OrdRecvIfService.OrdRecvIf_Upd03>() {
						public int compare(MSLAL_OrdRecvIfService.OrdRecvIf_Upd03 o1, MSLAL_OrdRecvIfService.OrdRecvIf_Upd03 o2) {
							return (o1.up0().size() - o2.up0().size()) * -1; // 降順
						}
					});
					MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
				}
				for (MSLAL_OrdRecvIfService.OrdRecvIf_Upd03 ope : opeL) {
					_totalNum += ope.down0().total_num().intValue();
					_okNum += ope.down0().ok_num().intValue();
					_errNum += ope.down0().err_num().intValue();
					_skipNum += ope.down0().skip_num().intValue();
				}
			}
		}
		
		protected void setDown() {
			down0().total_num(_totalNum);
			down0().ok_num(_okNum);
			down0().err_num(_errNum);
			down0().skip_num(_skipNum);
		}
		
		protected Map_OrdRecvIf_Upd03_DtlR_MST_ORDER_RECV_IF_R<OrdRecvIf_Upd03_DtlR,MST_ORDER_RECV_IF_R> createMap_OrdRecvIf_Upd03_DtlR_MST_ORDER_RECV_IF_R() {
			return new Map_OrdRecvIf_Upd03_DtlR_MST_ORDER_RECV_IF_R<OrdRecvIf_Upd03_DtlR, MST_ORDER_RECV_IF_R>();
		}
		
		public class Map_OrdRecvIf_Upd03_DtlR_MST_ORDER_RECV_IF_R<D extends OrdRecvIf_Upd03_DtlR, S extends MST_ORDER_RECV_IF_R> extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src) {
				dest.ordif(src);
			}
		}
	}
	
	/**
	 * OrdRecvIf_Upd03オペレーション.<p>
	 *
	 * オーダ受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	public class OrdRecvIf_Upd03 extends MSLAL_OrdRecvIfService_MC_A.OrdRecvIf_Upd03 {
		/**
		 * オーダ受信ＩＦ取込４を呼び出す際にデータＮＯ、外部品目オーダＮＯの組み合わせを何件ずつ渡すかのパラメータ
		 */
		protected int _loopCnt = MCConst.app.getInteger("MS.MSLAL9210.loop_size", 100);
		
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
		 * OrdRecvIf_Upd04バッチ呼び出しオペレーションから引き継ぐ
		 */
		protected FXBAL_BatchLogger _logger = null;
		
		/**
		 * インスタンス生成元（OrdRecvIf_Upd03）でスレッド間でユニークな値を設定
		 */
		protected int _no = 0;
		
		/**
		 * OrdRecvIf_Upd04の実行結果リスト
		 */
		protected MCList<OrdRecvIf_Upd04_DtlR> _exeRslt = null;
		
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
		 * オーダ受信ＩＦ取込処理を実行する。
		 */
		protected void exe() {
			int cnt = 0;
			
			MCList<MST_ORDER_RECV_IF_R> tgtL = MCList.create(MST_ORDER_RECV_IF_R.class);
			MST_ORDER_RECV_IF_R oldR = MST_ORDER_RECV_IF_R.create();
			
			for (OrdRecvIf_Upd03_DtlR dtlR: up0()) {
				MST_ORDER_RECV_IF_R keyR = dtlR.ordif();
				if(isNextData(oldR, keyR)) {
					if(!tgtL.isEmpty() && _loopCnt <= cnt) {
						callOrdRecvUpd04(tgtL);
						cnt = 0;
						tgtL.clear();
					}
				}
				
				oldR = keyR;
				cnt++;
				tgtL.add(keyR);
			}
			
			if(!tgtL.isEmpty()) {
				callOrdRecvUpd04(tgtL);
			}
		}
		
		protected void callOrdRecvUpd04(MCList<MST_ORDER_RECV_IF_R> tgtL) {
			crtOrdRecvIfWk(tgtL);
			
			MCList<MST_ORDER_RECV_IF_R> exeL = srchLockOrdRecvIf();
			MCIndexKey idx = exeL.createIndex(MST_ORDER_RECV_IF_R.$data_lno);
			
			Set<List<String>> afterExtDataSet = srchAfterExtData(exeL);
			MSLAL_OrdRecvIfService.OrdRecvIf_Upd04 ope = MSLAL_OrdRecvIfService.crtOrdRecvIf_Upd04();
			OrdRecvIf_Upd04_DtlR upR = null;
			
			MCList<MST_ORDER_RECV_IF_R> skipL = MCList.create(MST_ORDER_RECV_IF_R.class);
			for (MST_ORDER_RECV_IF_R recvIfR : tgtL) {
				MST_ORDER_RECV_IF_R exeR = exeL.getFirst(idx, recvIfR.data_lno());
				if (isNull(exeR)) {
					continue;
				}
				
				if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up0().get(0).if_scheduler_typ())) {
					exeRowDataCopyForFS(exeR, recvIfR);
				}
				
				exeR.addBooleanColumn(OrdRecvIfImp_Upd01_CndR.$ord_rep_flg, recvIfR.getBoolean(OrdRecvIfImp_Upd01_CndR.$ord_rep_flg));
				// 同一の処理グループでエラーが発生している場合、それ以降のデータは処理しない
				if (isPrevErr(exeR)) {
					setErrSts(exeR);
					MCMessagePool.add(exeR, null, MSLAL0638, exeR.data_no(), exeR.data_lno(), exeR.ext_sys_cd(), exeR.ext_itm_ord_no());
					skipL.add(exeR);
				}
				// 同一の処理グループで、新しいデータが既に処理されている場合、スキップする
				else if (isOkSkip(exeR, afterExtDataSet)) {
					setSkipSts(exeR);
					MCMessagePool.add(exeR, null, MSLAL0639, exeR.data_no(),exeR.data_lno(), exeR.ext_sys_cd(), exeR.ext_itm_ord_no());
					skipL.add(exeR);
				}
				else {
					upR = OrdRecvIf_Upd04_DtlR.create();
					upR.ordif(exeR);
					upR.setParamIndex(exeR.getParamIndex());
					upR.setParamRowIndex(exeR.getParamRowIndex());
					upR.addBooleanColumn(OrdRecvIfImp_Upd01_CndR.$ord_rep_flg, recvIfR.getBoolean(OrdRecvIfImp_Upd01_CndR.$ord_rep_flg));
					upR.setValue(OrdRecvIf_Upd04_DtlR.$if_scheduler_typ, up0().get(0).if_scheduler_typ());
					upR.setValue(OrdRecvIf_Upd04_DtlR.$allow_outsrc_schd_flg, up0().get(0).allow_outsrc_schd_flg());
					ope.up0().add(upR);
				}
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
			
			mergeExeRslt(skipL, ope.down0());
			
			afterCall(exeL);
			delOrdRecvIfWk(tgtL);
		}
		
		protected void exeRowDataCopyForFS(MST_ORDER_RECV_IF_R exeR, MST_ORDER_RECV_IF_R recvIfR) {
			
			exeR.itm_cd(recvIfR.itm_cd());
			exeR.itm_sub1(recvIfR.itm_sub1());
			exeR.itm_sub2(recvIfR.itm_sub2());
			exeR.itm_sub3(recvIfR.itm_sub3());
			exeR.ver_no(recvIfR.ver_no());
			exeR.strg_loc_cd(recvIfR.strg_loc_cd());
			exeR.bom_ptn(recvIfR.bom_ptn());
			exeR.inst_qty(recvIfR.inst_qty());
			exeR.yield_schd_qty(recvIfR.yield_schd_qty());
			exeR.po_schd_dt(recvIfR.po_schd_dt());
			exeR.accpt_schd_dt(recvIfR.accpt_schd_dt());
			exeR.insp_st_schd_dt(recvIfR.insp_st_schd_dt());
			exeR.insp_end_schd_dt(recvIfR.insp_end_schd_dt());
			exeR.sno1(recvIfR.sno1());
			exeR.sno2(recvIfR.sno2());
			exeR.sno3(recvIfR.sno3());
			exeR.sno4(recvIfR.sno4());
			exeR.itm_ord_intr_rmrks(recvIfR.itm_ord_intr_rmrks());
			exeR.itm_ord_sub_char1(recvIfR.sub_char1());
			exeR.itm_ord_sub_char2(recvIfR.sub_char2());
			exeR.itm_ord_sub_char3(recvIfR.sub_char3());
			exeR.addDateColumn("org_avl_schd_dt", recvIfR.avl_schd_dt());
			
			exeR.disp_seq(recvIfR.disp_seq());
			exeR.loc_cd(recvIfR.loc_cd());
			exeR.oper_ord_sub_char1(recvIfR.sub_char1());
			exeR.oper_ord_sub_char2(recvIfR.sub_char2());
			exeR.oper_ord_sub_char3(recvIfR.sub_char3());
			exeR.addDateColumn("org_st_schd_tm", recvIfR.st_schd_tm());
			
			if (MSC_ITM_ORD_TYP.isOUTSRC(exeR.itm_ord_typ())) {
				exeR.mfg_loc_cd(recvIfR.mfg_loc_cd());
				exeR.oper_ptn(recvIfR.oper_ptn());
				exeR.mfg_st_schd_dt(recvIfR.mfg_st_schd_dt());
				exeR.mfg_end_schd_dt(recvIfR.mfg_end_schd_dt());
				exeR.strg_schd_dt(recvIfR.strg_schd_dt());
				exeR.master_dt(recvIfR.master_dt());
				exeR.oper_ptn(recvIfR.oper_ptn());
				exeR.end_schd_tm(recvIfR.end_schd_tm());
				exeR.oper_schd_qty(recvIfR.oper_schd_qty());
				exeR.oper_cd(recvIfR.oper_cd());
				exeR.oper_seq(recvIfR.oper_seq());
			}
		}
		
		/**
		 * 同一キーで新しいデータが既に処理済みかどうか。
		 * @param exeR 取込対象行
		 * @param afterExtDataSet 処理済みデータリスト
		 * @return 処理済みの場合はtrue
		 */
		protected boolean isOkSkip(MST_ORDER_RECV_IF_R exeR, Set<List<String>> afterExtDataSet) {
			
			return afterExtDataSet.contains(createErrSetKey(exeR));
		}
		
		/**
		 * オーダ受信ＩＦテーブルをロックする
		 */
		protected MCList<MST_ORDER_RECV_IF_R> srchLockOrdRecvIf() {
			MCList<MST_ORDER_RECV_IF_R> exeL = MCList.create(MST_ORDER_RECV_IF_R.class);
			MST_ORDER_RECV_IF_R t = MST_ORDER_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);
			MSW_ORDER_RECV_IF_KEY_R w1 = MSW_ORDER_RECV_IF_KEY_R.create("W1");
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");
			
			exeL_bldr.addInnerJoin(w1, bracket( t.data_lno.eq(w1.data_lno)));
			exeL_bldr.addLeftOuterJoin(t2, t.data_no.eq(t2.data_no));
			
			exeL_bldr.setWhere(value(0).eq(value(0)));
			exeL_bldr.addWhereWithAnd(bracket( t2.sdrv_sts_typ.isNull()
					.or(t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			exeL_bldr.addWhereWithAnd(t.imp_flg.eq(value(true)));
			exeL_bldr.addOrderByAsc(t.ext_data_no, t.ext_sys_cd, t.ext_itm_ord_no, t.data_lno);
			exeL_bldr.setLockTable(t.data_lno);
			
			dbSelectForUpdate("MSLAL9210_MST_ORDER_RECV_IF_S03", exeL, exeL_bldr);
			
			for (MST_ORDER_RECV_IF_R exeR : exeL) {
				
				// log_sub_key1にスレッド間でユニークな値を設定
				exeR.setParamIndex(_no);
			}
			
			_logger.setLogKey(exeL,
					MST_ORDER_RECV_IF_R.$batch_log_no,
					MST_ORDER_RECV_IF_R.$log_sub_key1,
					MST_ORDER_RECV_IF_R.$log_sub_key2);
			
			return exeL;
		}
		
		/**
		 * 同一キーで取込対象より新しいかつ処理済みのデータを取得する。
		 * @param exeL 取込対象リスト
		 * @return 処理済みデータリスト
		 */
		protected Set<List<String>> srchAfterExtData(MCList<MST_ORDER_RECV_IF_R> exeL) {
			MCList<MST_ORDER_RECV_IF_R> afterL = MCList.create(MST_ORDER_RECV_IF_R.class);
			MST_ORDER_RECV_IF_R t = MST_ORDER_RECV_IF_R.create("T");
			MCQueryApiBuilder afterL_bldr = MCQueryApiBuilder.create(t);
			MST_ORDER_RECV_IF_R S1ST = MST_ORDER_RECV_IF_R.create("ST");

			afterL_bldr.setSelect(t.ext_sys_cd, t.ext_itm_ord_no);
			afterL_bldr.addConstWhereWithAnd(exists(subQuery().select(value("X")).from(S1ST)
					.where(t.ext_data_no.lt(S1ST.ext_data_no)
							.and(t.ext_sys_cd.eq(S1ST.ext_sys_cd))
							.and(t.ext_itm_ord_no.eq(S1ST.ext_itm_ord_no))
							.and(S1ST.exe_sts_typ.in(value(MAC_EXE_STS_TYP.OK.value()),
									value(MAC_EXE_STS_TYP.SKP.value()))))));
			
			dbSelectColumn("MSLAL9210_MST_ORDER_RECV_IF_S04", afterL, afterL_bldr, exeL, MST_ORDER_RECV_IF_R.$data_lno);
			
			Set<List<String>> set = new HashSet<List<String>>();
			for (MST_ORDER_RECV_IF_R afterR : afterL) {
				
				List<String> l = createErrSetKey(afterR);
				if (!set.contains(l)) {
					set.add(l);
				}
			}
			return set;
		}
		
		/**
		 * 取込結果をマージする。
		 * @param skipL スキップリスト
		 * @param downL OrdRecvIf_Upd04の下り電文
		 */
		protected void mergeExeRslt(MCList<MST_ORDER_RECV_IF_R> skipL, MCList<OrdRecvIf_Upd04_DtlR> downL) {
			_exeRslt = MCList.create(OrdRecvIf_Upd04_DtlR.class);
			_exeRslt.setAll(downL);
			
			OrdRecvIf_Upd04_DtlR dtlR = null;
			
			for (MST_ORDER_RECV_IF_R skipR : skipL) {
				
				dtlR = OrdRecvIf_Upd04_DtlR.create();
				dtlR.data_lno(skipR.data_lno());
				dtlR.exe_sts_typ(skipR.exe_sts_typ());
				_exeRslt.add(dtlR);
			}
		}
		
		/**
		 * オーダ受信ＩＦ取込の後処理。
		 * @param exeL 取込対象リスト
		 */
		protected void afterCall(MCList<MST_ORDER_RECV_IF_R> exeL) {
			rsltCnt(exeL);
			
			updIf(exeL);
			
			MCMessageList msgList = MCMessagePool.getMessageList();
			_logger.writeDataLog(msgList);
			
			dbTran().commit();
			
			msgList.clear();
		}
		
		/**
		 * 	オーダ受信ＩＦを更新する。
		 * @param exeL 取込対象リスト
		 */
		protected void updIf(MCList<MST_ORDER_RECV_IF_R> exeL) {
			MST_ORDER_RECV_IF_R t = MST_ORDER_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);
			exeL_bldr.setSet(t.imp_flg, t.exe_sts_typ, t.batch_log_no,
					t.log_sub_key1, t.log_sub_key2);
			dbUpdateKey("MSLAL9210_MST_ORDER_RECV_IF_U01", exeL, exeL_bldr);
		}
		
		/**
		 * 取込結果の件数を算出する。
		 * @param exeL 取込対象リスト
		 */
		protected void rsltCnt(MCList<MST_ORDER_RECV_IF_R> exeL) {
			MCIndexKey idxkey = _exeRslt.createIndex(OrdRecvIf_Upd03_DtlR.$data_lno);
			
			for (MST_ORDER_RECV_IF_R exeR : exeL) {
				
				OrdRecvIf_Upd04_DtlR exeRslt = _exeRslt.getFirst(idxkey, exeR.data_lno());
				if (isNull(exeRslt)) {
					// 「エラー行まで登録」によって後続データが対象外になる場合が該当する
					continue;
				}
				else if (MAC_EXE_STS_TYP.isOK(exeRslt.exe_sts_typ())) {
					
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
		protected void setSkipSts(MST_ORDER_RECV_IF_R exeR) {
			exeR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
		}
		
		/**
		 * 引数で渡された比較対象が同一取込単位かどうか。
		 * @param preR 前の取込対象
		 * @param exeR 取込対象
		 * @return 取込単位のいずれかが異なる場合はtrue
		 */
		protected boolean isNextData(MST_ORDER_RECV_IF_R preR, MST_ORDER_RECV_IF_R exeR) {
			return !(isSame(preR.ext_data_no(), exeR.ext_data_no())
					&& isSame(preR.ext_sys_cd(), exeR.ext_sys_cd()));
		}
		
		/**
		 * 同一取込単位で先に処理したデータでエラーが発生したかどうか。
		 * @param ordRecvIfR オーダ受信ＩＦ
		 * @return エラーが発生した場合はtrue
		 */
		protected boolean isPrevErr(MST_ORDER_RECV_IF_R ordRecvIfR) {
			return object(CLAZZ)._errSet.contains(createErrSetKey(ordRecvIfR));
		}
		
		/**
		オーダ受信ＩＦワークテーブルのデータを登録する。
		 * @param ordRecvIfRL オーダ受信ＩＦリスト
		 */
		protected void crtOrdRecvIfWk(MCList<MST_ORDER_RECV_IF_R> ordRecvIfRL) {
			MCQueryApiBuilder ordRecvIfRL_bldr = MCQueryApiBuilder.create(MST_ORDER_RECV_IF_R.create("T"));
			dbWkDelete("MSLAL9210_MSW_ORDER_RECV_IF_D01", ordRecvIfRL_bldr.getBaseDbc());
			dbWkInsert("MSLAL9210_MSW_ORDER_RECV_IF_I01", ordRecvIfRL, ordRecvIfRL_bldr.getBaseDbc());
		}
		
		/**
		オーダ受信ＩＦワークテーブルのデータを削除する。
		 * @param ordRecvIfRL オーダ受信ＩＦリスト
		 */
		protected void delOrdRecvIfWk(MCList<MST_ORDER_RECV_IF_R> ordRecvIfRL) {
			MCQueryApiBuilder ordRecvIfRL_bldr = MCQueryApiBuilder.create(MST_ORDER_RECV_IF_R.create("T"));
			dbWkDelete("MSLAL9210_MSW_ORDER_RECV_IF_D02", ordRecvIfRL_bldr.getBaseDbc());
		}
		
		protected void setDown() {
			down0().total_num(_totalNum);
			down0().ok_num(_okNum);
			down0().err_num(_errNum);
			down0().skip_num(_skipNum);
		}
	}
	
	/**
	 * OrdRecvIf_Upd04オペレーション.<p>
	 *
	 * オーダ受信ＩＦ取込を行う。(オーダ受信ＩＦサービスを呼び出す本処理）<br>
	 */
	public class OrdRecvIf_Upd04 extends MSLAL_OrdRecvIfService_MC_A.OrdRecvIf_Upd04 {
		
		/** 工程オーダのキャッシュ */
		protected MCList<MST_OPER_ORDER_R> _cacheOperOrd = null;

		/** 工程オーダのインデックス(外部品目オーダＮＯ) */
		protected MCIndexKey _idxExtItmOrdNoforOperkey = null;

		/**
		 * キャッシュ作成（工程オーダ）
		 */
		protected void createCacheOperOrd() {
			_cacheOperOrd = MCList.create(MST_OPER_ORDER_R.class);
			MST_OPER_ORDER_R t1 = MST_OPER_ORDER_R.create("T");
			MCQueryApiBuilder cacheOperOrd_bldr = MCQueryApiBuilder.create(t1);
			MST_ITM_ORDER_R t2 = MST_ITM_ORDER_R.create("T2");
			MCList<OrdRecvIf_Upd04_DtlR> bindL = up0().groupBy(
					MST_ITM_ORDER_R.$ext_sys_cd, MST_ITM_ORDER_R.$ext_itm_ord_no);

			_cacheOperOrd.addStringColumn(MST_ITM_ORDER_R.$ext_sys_cd);
			_cacheOperOrd.addStringColumn(MST_ITM_ORDER_R.$ext_itm_ord_no);
			cacheOperOrd_bldr.addSelect(t2.ext_sys_cd);
			cacheOperOrd_bldr.addSelect(t2.ext_itm_ord_no);
			cacheOperOrd_bldr.addInnerJoin(t2, t1.itm_ord_no.eq(t2.itm_ord_no));
			cacheOperOrd_bldr.setWhere(t2.ext_sys_cd.eq(bind("ext_sys_cd")));
			cacheOperOrd_bldr
					.addWhereWithAnd(t2.ext_itm_ord_no.eq(bind("ext_itm_ord_no")));
			dbSelectForUpdate("MSLAL9210_MST_OPER_ORDER_S02", _cacheOperOrd,
					cacheOperOrd_bldr, bindL);

			_idxExtItmOrdNoforOperkey = _cacheOperOrd.createIndex(
					MST_ITM_ORDER_R.$ext_sys_cd, MST_ITM_ORDER_R.$ext_itm_ord_no);
		}

		/**
		 * オーダ受信ＩＦ取込チェック
		 */
		protected MSLAL_OrdRecvIfService.OrdRecvIf_Chk01 _ordRecvIfChk;
		
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
		
		protected void initProc() {
			// ＰＧ実行状況区分は一旦すべて未処理に設定してから本処理の結果に応じてエラーや処理済に変更する
			up0().setString(OrdRecvIf_Upd04_DtlR.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
			up0().sort(getGrpKey());
			//訂正時の登録済工程オーダ保管用キャッシュ
			createCacheOperOrd();
		}
		
		protected void proc() {
			MCSavepoint sp = null;
			MCList<OrdRecvIf_Upd04_DtlR>[] grpL = getGrpForSrvCall();
			
			MCMessageList msgList = new MCMessageList();
			msgList.addAll(MCMessagePool.getMessageList());
			
			for (MCList<OrdRecvIf_Upd04_DtlR> ordRecvIfL : grpL) {
				MCMessagePool.clear();
				
				if (isPrevErr(ordRecvIfL)) {
					msgList.addAll(MCMessagePool.getMessageList());
					ordRecvIfL = ordRecvIfL.subList(r -> !isErr(r.ordif()));
					if (ordRecvIfL.isEmpty()) {
						continue;
					}
					MCMessagePool.clear();
				}
				
				// 訂正レコードで、全工程明細が揃っていない場合は、登録済の工程オーダを補完する
				ordRecvIfL.sort(OrdRecvIf_Upd04_DtlR.$ext_data_lno);
				for(MCList<OrdRecvIf_Upd04_DtlR> ordRecvIfByOrdL : ordRecvIfL.groupList(getGrpKey())) {
					if (!MSC_IF_SCHEDULER_TYP.isFLEXSCHE(ordRecvIfByOrdL.get(0).if_scheduler_typ())
							&& MAC_DATA_CRUD_TYP.isUPD(ordRecvIfByOrdL.get(0).ordif().data_crud_typ())) {
						MCList<MST_OPER_ORDER_R> operOrdL = _cacheOperOrd.subList(
								_idxExtItmOrdNoforOperkey, ordRecvIfByOrdL.get(0).ext_sys_cd(),
								ordRecvIfByOrdL.get(0).ext_itm_ord_no());
						MCIndexKey idx = ordRecvIfByOrdL
								.createIndex(OrdRecvIf_Upd04_DtlR.$ext_oper_ord_no);
						MCList<OrdRecvIf_Upd04_DtlR> addL = MCList
								.create(OrdRecvIf_Upd04_DtlR.class);
						for (MST_OPER_ORDER_R r : operOrdL) {
							OrdRecvIf_Upd04_DtlR ifR = ordRecvIfByOrdL.getFirst(idx,
									r.ext_oper_ord_no());
							if (isNull(ifR)) {
								OrdRecvIf_Upd04_DtlR addR = OrdRecvIf_Upd04_DtlR.create();
								// 後続処理で必要なカラムを追加、オーダ受信ＩＦの仕様を考慮しfalseにする
								addR.addBooleanColumn(OrdRecvIfImp_Upd01_CndR.$ord_rep_flg, false);
								//品目オーダ関連項目は、IFの内容から補完
								addR = setItmOrdColumn(addR, ordRecvIfByOrdL.get(0));
								//工程オーダ関連項目は、登録済の工程オーダから補完
								copy(addR, r,
										createMap_OrdRecvIf_Upd04_DtlR_MST_OPER_ORDER_R());
								addL.add(addR);
							}
							else {
								// 訂正対象のIFがある場合も、更新不可の工程項目には、IFの内容を採用せず、登録済の工程オーダの内容を上書き
								ifR.ordif().disp_seq(r.disp_seq());
								ifR.ordif().oper_cd(r.oper_cd());
								ifR.ordif().oper_seq(r.oper_seq());
								ifR.ordif().loc_cd(r.loc_cd());
							}
						}
						ordRecvIfL.addAll(addL);
					}
				}
				
				if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(ordRecvIfL.get(0).if_scheduler_typ())) {
					setItmOrderDt(ordRecvIfL);
				}
				
				callThisChk01(ordRecvIfL);
				msgList.addAll(MCMessagePool.getMessageList());
				
				ordRecvIfL = ordRecvIfL.subList(r -> !isErr(r.ordif()));
				if (ordRecvIfL.isEmpty()) {
					// 処理継続行がない場合
					continue;
				}
				
				MCMessagePool.clear();
				try {
					sp = setSavepoint();
					callOrdRegService(ordRecvIfL);
				}
				catch (Exception ex) {
					handleEx(ex, sp, ordRecvIfL);
				}
				finally {
					sp = null;
					msgList.addAll(MCMessagePool.getMessageList());
				}
			}
			MCMessagePool.clear();
			MCMessagePool.addAll(msgList);
		}
		
		protected void setItmOrderDt(MCList<OrdRecvIf_Upd04_DtlR> ordRecvIfL) {
			MCIndexKey ordRecvIfLKey = ordRecvIfL.createIndex(OrdRecvIf_Upd04_DtlR.$ext_itm_ord_no);
			for (OrdRecvIf_Upd04_DtlR ordRecvIfR : ordRecvIfL) {
				
				if (isFixedOutsrc(ordRecvIfR.ordif(), ordRecvIfR)) {
					continue;
				}
				
				MCList<OrdRecvIf_Upd04_DtlR> grpL = ordRecvIfL.subList(ordRecvIfLKey, ordRecvIfR.ext_itm_ord_no());
				MCDate minStDt = adjustSwithTime((MCDate)grpL.min( OrdRecvIf_Chk01_CndR.$st_schd_tm));
				MCDate maxEndDt = adjustSwithTime((MCDate)grpL.max( OrdRecvIf_Chk01_CndR.$end_schd_tm));
				ordRecvIfR.ordif().mfg_st_schd_dt((minStDt));
				ordRecvIfR.ordif().mfg_end_schd_dt(maxEndDt);
				if (!MSC_ITM_ORD_TYP.isOUTSRC(ordRecvIfR.ordif().itm_ord_typ())) {
					ordRecvIfR.ordif().strg_schd_dt(maxEndDt);
				}
				ordRecvIfR.ordif().master_dt(getToday());
			}
		}
		
		protected MCDate adjustSwithTime(MCDate baseDt) {
			MCNumber switchTime = getCo().dt_switch_time();
			if (isNull(switchTime)) {
				return baseDt;
			}
			if (switchTime.isNegative()) {
				switchTime.add(24);
			}
			int baseHour = baseDt.getHour();
			if (baseHour - switchTime.intValue() <= 0) {
				return baseDt;
			}
			else {
				return baseDt.addDay(1);
			}
		}
		
		/**
		 * オーダ受信ＩＦ取込チェックを実行する。
		 * @param ordRecvIfL オーダ受信ＩＦリスト
		 */
		protected void callThisChk01(MCList<OrdRecvIf_Upd04_DtlR> ordRecvIfL) {
			_ordRecvIfChk = MSLAL_OrdRecvIfService.crtOrdRecvIf_Chk01();
			
			setAll(_ordRecvIfChk.up0(), ordRecvIfL, createMap_OrdRecvIf_Chk01_CndR_OrdRecvIf_Upd04_DtlR());
			_ordRecvIfChk.exec();
			
			MCIndexKey idxkey = _ordRecvIfChk.down0().createIndex(OrdRecvIf_Chk01_CndR.$data_lno);
			
			for (OrdRecvIf_Upd04_DtlR dtlR : ordRecvIfL) {
				OrdRecvIf_Chk01_CndR chkRsltR = _ordRecvIfChk.down0().getFirst(idxkey, dtlR.data_lno());
				
				if (chkRsltR.err_flg()) {
					setErrSts(dtlR.ordif());
				}
			}
			for (MCList<OrdRecvIf_Upd04_DtlR> l : ordRecvIfL.groupList(getGrpKey())) {
				chkGrpErr(l);
			}
		}
		
		/**
		 * オーダ登録サービスを実行する。
		 * @param ordRecvIfL オーダ受信ＩＦリスト
		 */
		protected void callOrdRegService(MCList<OrdRecvIf_Upd04_DtlR> ordRecvIfL) {
			callOrdServiceUpd01(ordRecvIfL);
			
			setOk(ordRecvIfL);
		}
		
		/**
		 * オーダ登録サービスの更新処理を実行する。
		 * @param ordRecvIfL オーダ受信ＩＦリスト
		 */
		protected void callOrdServiceUpd01(MCList<OrdRecvIf_Upd04_DtlR> ordRecvIfL) {
			if (isErr(ordRecvIfL.get(0).ordif()) || _ordRecvIfChk.down1().isEmpty()) {
				return;
			}
			
			MSBCL_OrdRegService.Ord_Upd01 upd = MSBCL_OrdRegService.crtOrd_Upd01();
			MCIndexKey idxkey = _ordRecvIfChk.down2().createIndex(Ord_Upd01_Dtl1R.$peg_no);
			
			for (Ord_Upd01_Dtl1R hdrR : _ordRecvIfChk.down1()) {
				if (hdrR.err_flg()) {
					continue;
				}
				
				MCList<Ord_Upd01_Dtl2R> ordDtlL =_ordRecvIfChk.down2().subList(idxkey, hdrR.peg_no());
				upd.up0().add(hdrR);
				upd.up1().addAll(ordDtlL);
			}
			
			if (!upd.up0().isEmpty()) {
				upd.exec();
			}
		}
		
		/**
		 * 取込単位でオーダ受信ＩＦ情報をグループ化する。
		 * @return 取込単位のグループ
		 */
		@SuppressWarnings("unchecked")
		protected MCList<OrdRecvIf_Upd04_DtlR>[] getGrp() {
			List<MCList<OrdRecvIf_Upd04_DtlR>> arr = new ArrayList<>();
			OrdRecvIf_Upd04_DtlR bkR = null;
			MCList<OrdRecvIf_Upd04_DtlR> lst = null;
			
			for (OrdRecvIf_Upd04_DtlR r : up0()) {
				if (isNull(bkR) || !r.equalColumns(bkR, getGrpKey())) {
					lst = MCList.create(OrdRecvIf_Upd04_DtlR.class);
					arr.add(lst);
				}
				lst.add(r);
				bkR = r;
			}
			
			return arr.toArray(new MCList[arr.size()]);
		}
		
		/**
		 * 取込単位でオーダ受信ＩＦ情報をグループ化する。
		 * @return 取込単位のグループ
		 */
		@SuppressWarnings("unchecked")
		protected MCList<OrdRecvIf_Upd04_DtlR>[] getGrpForSrvCall() {
			List<MCList<OrdRecvIf_Upd04_DtlR>> arr = new ArrayList<>();
			OrdRecvIf_Upd04_DtlR bkR = null;
			MCList<OrdRecvIf_Upd04_DtlR> lst = null;
			
			for (OrdRecvIf_Upd04_DtlR r : up0()) {
				if (isNull(bkR) || !r.equalColumns(bkR, getGrpKeyForSrvCall())) {
					lst = MCList.create(OrdRecvIf_Upd04_DtlR.class);
					arr.add(lst);
				}
				lst.add(r);
				bkR = r;
			}
			
			return arr.toArray(new MCList[arr.size()]);
		}
		
		/**
		 * 品目オーダ関連項目は、IFの内容から補完
		 * @param destR　補完先
		 * @param srcR　補完元
		 * @return 補完結果
		 */
		protected OrdRecvIf_Upd04_DtlR setItmOrdColumn(OrdRecvIf_Upd04_DtlR destR,
				OrdRecvIf_Upd04_DtlR srcR) {
			destR.ext_itm_ord_no(srcR.ext_itm_ord_no());
			destR.ordif().data_crud_typ(srcR.ordif().data_crud_typ());
			destR.ordif().ext_sys_cd(srcR.ordif().ext_sys_cd());
			destR.ordif().ext_data_no(srcR.ordif().ext_data_no());
			destR.ordif().ext_data_lno(srcR.ordif().ext_data_lno());
			destR.ordif().itm_ord_typ(srcR.ordif().itm_ord_typ());
			destR.ordif().itm_cd(srcR.ordif().itm_cd());
			destR.ordif().itm_sub1(srcR.ordif().itm_sub1());
			destR.ordif().itm_sub2(srcR.ordif().itm_sub2());
			destR.ordif().itm_sub3(srcR.ordif().itm_sub3());
			destR.ordif().itm_nm(srcR.ordif().itm_nm());
			destR.ordif().ver_no(srcR.ordif().ver_no());
			destR.ordif().strg_loc_cd(srcR.ordif().strg_loc_cd());
			destR.ordif().mfg_loc_cd(srcR.ordif().mfg_loc_cd());
			destR.ordif().bom_ptn(srcR.ordif().bom_ptn());
			destR.ordif().oper_ptn(srcR.ordif().oper_ptn());
			destR.ordif().inst_qty(srcR.ordif().inst_qty());
			destR.ordif().yield_schd_qty(srcR.ordif().yield_schd_qty());
			destR.ordif().po_schd_dt(srcR.ordif().po_schd_dt());
			destR.ordif().mfg_st_schd_dt(srcR.ordif().mfg_st_schd_dt());
			destR.ordif().mfg_end_schd_dt(srcR.ordif().mfg_end_schd_dt());
			destR.ordif().strg_schd_dt(srcR.ordif().strg_schd_dt());
			destR.ordif().accpt_schd_dt(srcR.ordif().accpt_schd_dt());
			destR.ordif().insp_st_schd_dt(srcR.ordif().insp_st_schd_dt());
			destR.ordif().insp_end_schd_dt(srcR.ordif().insp_end_schd_dt());
			destR.ordif().avl_schd_dt(srcR.ordif().avl_schd_dt());
			destR.ordif().master_dt(srcR.ordif().master_dt());
			destR.ordif().sno1(srcR.ordif().sno1());
			destR.ordif().sno2(srcR.ordif().sno2());
			destR.ordif().sno3(srcR.ordif().sno3());
			destR.ordif().sno4(srcR.ordif().sno4());
			destR.ordif().inst_po_cnt_rmrks(srcR.ordif().inst_po_cnt_rmrks());
			destR.ordif().itm_ord_intr_rmrks(srcR.ordif().itm_ord_intr_rmrks());
			destR.ordif().itm_ord_sub_char1(srcR.ordif().itm_ord_sub_char1());
			destR.ordif().itm_ord_sub_char2(srcR.ordif().itm_ord_sub_char2());
			destR.ordif().itm_ord_sub_char3(srcR.ordif().itm_ord_sub_char3());
			return destR;
		}

		/**
		 * 更新処理例外発生時の後処理を行う。
		 * @param ex 例外
		 * @param sp セーブポイント
		 * @param ordRecvIfL オーダ受信ＩＦリスト
		 */
		protected void handleEx(Exception ex, MCSavepoint sp, MCList<OrdRecvIf_Upd04_DtlR> ordRecvIfL) {
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
			
			for (OrdRecvIf_Upd04_DtlR opeRow : ordRecvIfL) {
				MCMessagePool.add(opeRow, null, MSLAL0637, opeRow.data_no(), opeRow.data_lno(), msgId, msg);
				for (MCMessage causeMsg : causeMsgList) {
					MCMessage newMsg = new MCMessage(opeRow, null, causeMsg.getID(), (Object[])causeMsg.getBindArray());
					MCMessagePool.add(newMsg);
				}
				
				setErr(opeRow.ordif());
			}
			
			if (sp != null) {
				dbTran().rollback(sp);
			}
		}
		
		/**
		 * セーブポイントを作成する。
		 * @return セーブポイント
		 */
		protected MCSavepoint setSavepoint() {
			return dbTran().setSavepoint();
		}
		
		/**
		 * 同一取込単位のうち、エラーが存在するかどうかチェックする。<br>
		 * 一部でもエラーがあったら全てエラーとする。
		 * @param ordRecvIfL オーダ受信ＩＦリスト
		 */
		protected void chkGrpErr(MCList<OrdRecvIf_Upd04_DtlR> ordRecvIfL) {
			OrdRecvIf_Upd04_DtlR errR = ordRecvIfL.getFirst(OrdRecvIf_Upd04_DtlR.$exe_sts_typ, MAC_EXE_STS_TYP.ERR.value());
			if (errR != null) {
				for (OrdRecvIf_Upd04_DtlR ordRecvIfR : ordRecvIfL) {
					if (!isErr(ordRecvIfR.ordif())) {
						MCMessagePool.add(ordRecvIfR, null, MSLAL0643, ordRecvIfR.data_no(), ordRecvIfR.data_lno(), ordRecvIfR.ext_sys_cd(), ordRecvIfR.ext_itm_ord_no());
						setErr(ordRecvIfR.ordif());
					}
				}
			}
		}
		
		/**
		 * 同一取込単位で先に処理したデータでエラーが発生したかどうか。
		 * @param checkL オーダ受信ＩＦリスト
		 * @return エラーが発生した場合はtrue
		 */
		protected boolean isPrevErr(MCList<OrdRecvIf_Upd04_DtlR> checkL) {
			if (checkL.isEmpty()) {
				return false;
			}
			
			boolean hasErr = false;
			for (MCList<OrdRecvIf_Upd04_DtlR> subL : checkL.groupList(getGrpKey())) {
				if (object(CLAZZ)._errSet.contains(createErrSetKey(subL.get(0).ordif()))) {
					hasErr = true;
					for (OrdRecvIf_Upd04_DtlR r : subL) {
						setErrSts(r.ordif());
						MCMessagePool.add(r, null, MSLAL0638, r.data_no(), r.data_lno(), r.ext_sys_cd(), r.ext_itm_ord_no());
					}
				}
			}
			return hasErr;
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		/**
		 * 処理結果区分に処理済を設定する。
		 * @param ordRecvIfL オーダ受信ＩＦリスト
		 */
		protected void setOk(MCList<OrdRecvIf_Upd04_DtlR> ordRecvIfL) {
			for (OrdRecvIf_Upd04_DtlR ordRecvIfR : ordRecvIfL) {
				if (!isErr(ordRecvIfR.ordif())) {
					ordRecvIfR.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
				}
			}
		}
		
		/**
		 * 処理結果区分にエラーを設定する。
		 * @param ordRecvIfL オーダ受信ＩＦ
		 */
		protected void setErr(MST_ORDER_RECV_IF_R ordRecvIfL) {
			setErrSts(ordRecvIfL);
		}
		
		/**
		 * オーダ受信ＩＦの処理結果区分がエラーかどうか。
		 * @param ordRecvIfdRecvIfR オーダ受信ＩＦ
		 * @return 処理結果区分がエラーの場合はtrue
		 */
		protected boolean isErr(MST_ORDER_RECV_IF_R ordRecvIfR) {
			return MAC_EXE_STS_TYP.isERR(ordRecvIfR.exe_sts_typ());
		}
		
		/**
		 * 取込単位となるキーを返す
		 * @return 同一取込グループのキー
		 */
		protected String[] getGrpKey() {
			return new String[] {
					OrdRecvIf_Upd04_DtlR.$ext_data_no,
					OrdRecvIf_Upd04_DtlR.$ext_sys_cd,
					OrdRecvIf_Upd04_DtlR.$ext_itm_ord_no};
		}
		
		/**
		 * サービスの実行単位となるキーを返す
		 * @return 同一取込グループのキー
		 */
		protected String[] getGrpKeyForSrvCall() {
			return new String[] {
					OrdRecvIf_Upd04_DtlR.$ext_data_no,
					OrdRecvIf_Upd04_DtlR.$ext_sys_cd};
		}
		
		/** OrdRecvIf_Upd04_DtlR → OrdRecvIf_Chk01_CndR */
		protected Map_OrdRecvIf_Chk01_CndR_OrdRecvIf_Upd04_DtlR<OrdRecvIf_Chk01_CndR, OrdRecvIf_Upd04_DtlR> createMap_OrdRecvIf_Chk01_CndR_OrdRecvIf_Upd04_DtlR() {
			return new Map_OrdRecvIf_Chk01_CndR_OrdRecvIf_Upd04_DtlR<OrdRecvIf_Chk01_CndR, OrdRecvIf_Upd04_DtlR>();
		}
		public class Map_OrdRecvIf_Chk01_CndR_OrdRecvIf_Upd04_DtlR<D extends OrdRecvIf_Chk01_CndR, S extends OrdRecvIf_Upd04_DtlR> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.ordif(src.ordif());
				dest.if_scheduler_typ(src.if_scheduler_typ());
				dest.allow_outsrc_schd_flg(src.allow_outsrc_schd_flg());
				dest.setParamIndex(src.ordif().getParamIndex());
				dest.setParamRowIndex(src.ordif().getParamRowIndex());
				dest.addBooleanColumn(OrdRecvIfImp_Upd01_CndR.$ord_rep_flg, src.getBoolean(OrdRecvIfImp_Upd01_CndR.$ord_rep_flg));
			}
		}
		protected Map_OrdRecvIf_Upd04_DtlR_MST_OPER_ORDER_R<OrdRecvIf_Upd04_DtlR, MST_OPER_ORDER_R> createMap_OrdRecvIf_Upd04_DtlR_MST_OPER_ORDER_R() {
			return new Map_OrdRecvIf_Upd04_DtlR_MST_OPER_ORDER_R<OrdRecvIf_Upd04_DtlR, MST_OPER_ORDER_R>();
		}

		public class Map_OrdRecvIf_Upd04_DtlR_MST_OPER_ORDER_R<D extends OrdRecvIf_Upd04_DtlR, S extends MST_OPER_ORDER_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(OrdRecvIf_Upd04_DtlR.$ext_oper_ord_no,
						MST_OPER_ORDER_R.$ext_oper_ord_no);

			}

			@Override
			public void valueCopy(D dest, S src) {
				dest.ordif().st_schd_tm(src.st_schd_tm());
				dest.ordif().end_schd_tm(src.end_schd_tm());
				dest.ordif().oper_schd_qty(src.oper_schd_qty());
				dest.ordif().disp_seq(src.disp_seq());
				dest.ordif().oper_cd(src.oper_cd());
				dest.ordif().oper_seq(src.oper_seq());
				dest.ordif().loc_cd(src.loc_cd());
				dest.ordif().oper_rsrc(src.oper_rsrc());
				dest.ordif().oper_ord_intr_rmrks(src.intr_rmrks());
				dest.ordif().oper_ord_sub_char1(src.sub_char1());
				dest.ordif().oper_ord_sub_char2(src.sub_char2());
				dest.ordif().oper_ord_sub_char3(src.sub_char3());
			}
		}
	}
	
	/**
	 * OrdRecvIf_Chk01オペレーション.<p>
	 *
	 * オーダ受信ＩＦ取込を行う前のチェック処理<br>
	 */
	public class OrdRecvIf_Chk01 extends MSLAL_OrdRecvIfService_MC_A.OrdRecvIf_Chk01 {
		
		/** 品目オーダのインデックス */
		protected MCIndexKey _idxItmOrdKey = null;
		
		/** 品目オーダのキャッシュ */
		protected MCList<MST_ITM_ORDER_R> _cacheItmOrd = null;
		
		/** 工程オーダのキャッシュ */
		protected MCList<MST_OPER_ORDER_R> _cacheOperOrd = null;
		
		/** 場所マスタのキャッシュ */
		protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc = null;
		
		/** 品目工程マスタのキャッシュ */
		protected MCList<MAM_ITM_OPER_R> _cacheItmOper = MCList.create(MAM_ITM_OPER_R.class);
		
		//----------------------------------
		// IndexKey
		//----------------------------------
		/** 工程オーダのインデックス */
		protected MCIndexKey _idxOperOrdKey = null;
		
		/** オーダ受信ＩＦのインデックス */
		protected MCIndexKey _idxOrdRecvIfKey = null;
		
		/** 品目オーダのインデックス(外部品目オーダＮＯ) */
		protected MCIndexKey _idxExtItmOrdNoKey = null;
		
		/** 工程オーダのインデックス(外部工程オーダＮＯ) */
		protected MCIndexKey _idxExtOperOrdNoKey = null;
		
		/** 工程オーダのインデックス(外部品目オーダＮＯ) */
		protected MCIndexKey _idxExtItmOrdNoforOperkey = null;
		
		/** 品目工程のインデックス(品目ＣＤ・枝番・製造場所・工程パタン) */
		protected MCIndexKey _idxItmOper = null;
		
		/** 品目工程のインデックス(品目ＣＤ・枝番・場所ＣＤ・工程パタン・工程ＣＤ・工程連番) */
		protected MCIndexKey _idxItmOperKey = null;
		
		/**
		 * 補完およびチェック処理で使用するキャッシュ情報を作成する。
		 */
		protected void createCache() {
			createCacheItmOrd();
			createCacheOperOrd();
			createCacheLoc();
			createCacheItmOper();
		}
		
		/**
		 * キャッシュ作成（品目オーダ）
		 */
		protected void createCacheItmOrd() {
			_cacheItmOrd = MCList.create(MST_ITM_ORDER_R.class);
			MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder cacheItmOrd_bldr = MCQueryApiBuilder.create(t);
			MCList<OrdRecvIf_Chk01_CndR> bindL = up0().groupBy(
					MST_ITM_ORDER_R.$ext_sys_cd, MST_ITM_ORDER_R.$ext_itm_ord_no);
			
			cacheItmOrd_bldr.setWhere(t.ext_sys_cd.eq(bind("ext_sys_cd")));
			if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up0().get(0).if_scheduler_typ())) {
				cacheItmOrd_bldr.addWhereWithAnd(t.itm_ord_no.eq(bind("ext_itm_ord_no")));
			}
			else {
				cacheItmOrd_bldr.addWhereWithAnd(t.ext_itm_ord_no.eq(bind("ext_itm_ord_no")));
			}
			cacheItmOrd_bldr.setOrderByAsc(t.itm_ord_no);
			dbSelectForUpdate("MSLAL9210_MST_ITM_ORDER_S01", _cacheItmOrd, cacheItmOrd_bldr, bindL);
			
			_idxItmOrdKey = _cacheItmOrd.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			_idxExtItmOrdNoKey = _cacheItmOrd.createIndex(MST_ITM_ORDER_R.$ext_sys_cd, MST_ITM_ORDER_R.$ext_itm_ord_no);
		}
		
		/**
		 * キャッシュ作成（工程オーダ）
		 */
		protected void createCacheOperOrd() {
			_cacheOperOrd = MCList.create(MST_OPER_ORDER_R.class);
			MST_OPER_ORDER_R t1 = MST_OPER_ORDER_R.create("T");
			MCQueryApiBuilder cacheOperOrd_bldr = MCQueryApiBuilder.create(t1);
			MST_ITM_ORDER_R t2 = MST_ITM_ORDER_R.create("T2");
			MCList<OrdRecvIf_Chk01_CndR> bindL = up0().groupBy(
					MST_ITM_ORDER_R.$ext_sys_cd, MST_ITM_ORDER_R.$ext_itm_ord_no);
			
			_cacheOperOrd.addStringColumn(MST_ITM_ORDER_R.$ext_sys_cd);
			_cacheOperOrd.addStringColumn(MST_ITM_ORDER_R.$ext_itm_ord_no);
			cacheOperOrd_bldr.addSelect(t2.ext_sys_cd);
			cacheOperOrd_bldr.addSelect(t2.ext_itm_ord_no);
			cacheOperOrd_bldr.addInnerJoin(t2, t1.itm_ord_no.eq(t2.itm_ord_no));
			cacheOperOrd_bldr.setWhere(t2.ext_sys_cd.eq(bind("ext_sys_cd")));
			cacheOperOrd_bldr.addWhereWithAnd(t2.ext_itm_ord_no.eq(bind("ext_itm_ord_no")));
			dbSelectForUpdate("MSLAL9210_MST_OPER_ORDER_S01", _cacheOperOrd, cacheOperOrd_bldr, bindL);
			
			_idxOperOrdKey = _cacheOperOrd.createIndex(MST_OPER_ORDER_R.$itm_ord_no);
			_idxExtOperOrdNoKey = _cacheOperOrd.createIndex(MST_ITM_ORDER_R.$ext_sys_cd, MST_OPER_ORDER_R.$ext_oper_ord_no);
			_idxExtItmOrdNoforOperkey = _cacheOperOrd.createIndex(MST_ITM_ORDER_R.$ext_sys_cd, MST_ITM_ORDER_R.$ext_itm_ord_no);
		}
		
		/**
		 * キャッシュ作成（場所マスタ）
		 */
		protected void createCacheLoc() {
			_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(
					MCQueryApiBuilder.create(MAM_LOC_R.create("T")), up0(),
					OrdRecvIf_Chk01_CndR.$loc_cd);
		}
		
		/**
		 * キャッシュ作成（品目工程マスタ）
		 */
		protected void createCacheItmOper() {
			_cacheItmOper = MCList.create(MAM_ITM_OPER_R.class);
			MAM_ITM_OPER_R t = MAM_ITM_OPER_R.create("T");
			MCQueryApiBuilder itmOper_bldr = MCQueryApiBuilder.create(t);
			MCList<OrdRecvIf_Chk01_CndR> bindL = up0().groupBy(
					OrdRecvIf_Chk01_CndR.$itm_cd, OrdRecvIf_Chk01_CndR.$itm_sub1,
					OrdRecvIf_Chk01_CndR.$itm_sub2, OrdRecvIf_Chk01_CndR.$itm_sub3,
					OrdRecvIf_Chk01_CndR.$master_dt);
			
			itmOper_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
			itmOper_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			itmOper_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			itmOper_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			itmOper_bldr.addWhereWithAnd(bind("master_dt").between(t.st_dt, t.end_dt));
			dbSelect("MSLAL9210_MAM_ITM_OPER_S01", _cacheItmOper, itmOper_bldr, bindL);
			
			_idxItmOper = _cacheItmOper.createIndex(
					MAM_ITM_OPER_R.$itm_cd, MAM_ITM_OPER_R.$itm_sub1,
					MAM_ITM_OPER_R.$itm_sub2, MAM_ITM_OPER_R.$itm_sub3,
					MAM_ITM_OPER_R.$loc_cd, MAM_ITM_OPER_R.$oper_ptn);
			_idxItmOperKey = _cacheItmOper.createIndex(
					MAM_ITM_OPER_R.$itm_cd, MAM_ITM_OPER_R.$itm_sub1,
					MAM_ITM_OPER_R.$itm_sub2, MAM_ITM_OPER_R.$itm_sub3,
					MAM_ITM_OPER_R.$loc_cd, MAM_ITM_OPER_R.$oper_ptn,
					MAM_ITM_OPER_R.$oper_cd, MAM_ITM_OPER_R.$oper_seq);
		}
		
		/**
		 * キャッシュ取得（品目オーダ）
		 * @param itmOrd 品目オーダＮＯ
		 * @return 品目オーダ
		 */
		protected MST_ITM_ORDER_R getCacheItmOrd(String itmOrd) {
			return _cacheItmOrd.getFirst(_idxItmOrdKey, itmOrd);
		}
		
		/**
		 * キャッシュ取得（工程オーダ）
		 * @param operOrd 工程オーダＮＯ
		 * @return 工程オーダ
		 */
		protected MST_OPER_ORDER_R getCacheOperOrd(String operOrd) {
			return _cacheOperOrd.getFirst(_idxOperOrdKey, operOrd);
		}
		
		/**
		 * キャッシュ取得（場所マスタ）
		 * @param locCd 場所
		 * @return 場所マスタ
		 */
		protected MAM_LOC_R getCacheLoc(String locCd) {
			return _cacheLoc.get(locCd);
		}
		
		/**
		 * キャッシュ取得（品目工程マスタ）
		 * @param ordRecvIfR オーダ受信ＩＦ
		 * @return 品目工程マスタ
		 */
		protected MCList<MAM_ITM_OPER_R> getCacheItmOper(OrdRecvIf_Chk01_CndR ordRecvIfR) {
			MCList<MAM_ITM_OPER_R> itmOperL = _cacheItmOper.subList(_idxItmOper,
					ordRecvIfR.itm_cd(), ordRecvIfR.itm_sub1(), ordRecvIfR.itm_sub2(),
					ordRecvIfR.itm_sub3(), ordRecvIfR.mfg_loc_cd(), ordRecvIfR.oper_ptn());
			
			if (isNull(itmOperL)) {
				// 取得できなかった場合、場所をNULL文字にしてもう一度取得する
				itmOperL = _cacheItmOper.subList(_idxItmOper,
						ordRecvIfR.itm_cd(), ordRecvIfR.itm_sub1(), ordRecvIfR.itm_sub2(),
						ordRecvIfR.itm_sub3(), MAC_STR.NULL_VAL.value(), ordRecvIfR.oper_ptn());
			}
			
			return itmOperL;
		}
		
		/**
		 * キャッシュ取得（品目工程マスタ）
		 * @param ordRecvIfR オーダ受信ＩＦ
		 * @return 品目工程マスタ
		 */
		protected MAM_ITM_OPER_R getCacheItmOperKey(OrdRecvIf_Chk01_CndR ordRecvIfR) {
			MCList<MAM_ITM_OPER_R> itmOperL = _cacheItmOper.subList(_idxItmOperKey,
					ordRecvIfR.itm_cd(), ordRecvIfR.itm_sub1(), ordRecvIfR.itm_sub2(),
					ordRecvIfR.itm_sub3(), ordRecvIfR.mfg_loc_cd(), ordRecvIfR.oper_ptn(),
					ordRecvIfR.oper_cd(), ordRecvIfR.oper_seq());
			
			if (isNull(itmOperL)) {
				// 取得できなかった場合、場所をNULL文字にしてもう一度取得する
				itmOperL = _cacheItmOper.subList(_idxItmOperKey,
						ordRecvIfR.itm_cd(), ordRecvIfR.itm_sub1(), ordRecvIfR.itm_sub2(),
						ordRecvIfR.itm_sub3(), MAC_STR.NULL_VAL.value(), ordRecvIfR.oper_ptn(),
						ordRecvIfR.oper_cd(), ordRecvIfR.oper_seq());
			}
			
			MAM_ITM_OPER_R itmOperR = MAM_ITM_OPER_R.create();
			for (MAM_ITM_OPER_R r : itmOperL) {
				if (ordRecvIfR.master_dt().lte(r.end_dt())
						&& ordRecvIfR.master_dt().gte(r.st_dt())) {
					itmOperR = r;
					break;
				}
			}
			
			return itmOperR;
		}
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initUpSub() {
			super.initUpSub();
			
			addTmpCol();
			
			setPegNo(up0());
			
			createCache();
			
			setNullVal(up0());
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			callOrdServiceChk01();
			
			afterOrdServiceChk();
			
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			msgL.addAll(chkDuplicate(up0()));
			
			compl(up0());
			
			msgL.addAll(chkReq(up0()));
			
			msgL.addAll(chkItmOrdTyp(up0()));
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			MCList<OrdRecvIf_Chk01_CndR> notErrL = getNotErrL();
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			callOrdServiceSprt04(notErrL);
			
			msgL.addAll(chkOrdAndCompl(notErrL));
			
			msgL.addAll(chkSub(notErrL));
			
			msgL.addAll(chkOper(notErrL));
			
			return msgL;
		}
		
		/**
		 * オーダ登録サービス後に実行するチェック処理。
		 */
		protected void afterOrdServiceChk() {
			MCList<OrdRecvIf_Chk01_CndR> notErrL = getNotErrL();
			if (notErrL.isEmpty()) {
				return;
			}
			
			MCMessageList msgL = new MCMessageList();
			
			msgL.addAll(setItmOper(notErrL));
			
			msgL.addAll(chkItmOper(notErrL));
			
			setErrFlg(msgL);
			MCMessagePool.addAll(msgL);
		}
		
		/**
		 * オーダ登録サービスの補完処理を実行する。
		 */
		protected void callOrdServiceSprt04(MCList<OrdRecvIf_Chk01_CndR> ordRecvIfL) {
			// 削除を除く
			MCList<OrdRecvIf_Chk01_CndR> list = MCList.create(OrdRecvIf_Chk01_CndR.class);
			for (OrdRecvIf_Chk01_CndR ordRecvIfR : ordRecvIfL) {
				if (!MAC_DATA_CRUD_TYP.isDEL(ordRecvIfR.data_crud_typ())) {
					list.add(ordRecvIfR);
				}
			}
			
			MSBCL_OrdRegService.Ord_Sprt04 sprt = MSBCL_OrdRegService.crtOrd_Sprt04();
			addAll(sprt.up0(), list, createMap_Ord_Upd01_Dtl1R_OrdRecvIf_Chk01_CndR());
			sprt.exec();
			
			MCJoinKey<MCList<Ord_Upd01_Dtl1R>> jk1 = up0().join(Ord_Imp01_DtlR.$peg_no, sprt.down0(), Ord_Upd01_Dtl1R.$peg_no);
			join(list, jk1, createMap_OrdRecvIf_Chk01_CndR_Ord_Upd01_Dtl1R1());
		}
		
		/**
		 * オーダ登録サービスの登録チェックを実行する。
		 */
		protected void callOrdServiceChk01() {
			MCList<OrdRecvIf_Chk01_CndR> notErrL = getNotErrL();
			if (notErrL.isEmpty()) {
				return;
			}
			
			MCList<Ord_Upd01_Dtl1R> hdrL = MCList.create(Ord_Upd01_Dtl1R.class);
			MCList<Ord_Upd01_Dtl2R> dtlL = MCList.create(Ord_Upd01_Dtl2R.class);
			
			for (MCList<OrdRecvIf_Chk01_CndR> upGroupList : notErrL.groupList(getOrdRecvIfHdrKey())) {
				upGroupList.sort(OrdRecvIf_Chk01_CndR.$data_lno);
				OrdRecvIf_Chk01_CndR hdrIfR = upGroupList.get(0);
				Ord_Upd01_Dtl1R hdrR = Ord_Upd01_Dtl1R.create();
				copy(hdrR, hdrIfR, createMap_Ord_Upd01_Dtl1R_OrdRecvIf_Chk01_CndR());
				hdrL.add(hdrR);
				
				for (OrdRecvIf_Chk01_CndR upGroupRow : upGroupList) {
					Ord_Upd01_Dtl2R dtlR = Ord_Upd01_Dtl2R.create();
					if (isDefOper(upGroupRow) && !isDel(upGroupRow)) {
						setDefOper(dtlR, upGroupRow);
					}
					else {
						copy(dtlR, upGroupRow, createMap_Ord_Upd01_Dtl2R_OrdRecvIf_Chk01_CndR());
					}
					dtlR.peg_no(hdrR.peg_no());
					dtlL.add(dtlR);
				}
			}
			
			MSBCL_OrdRegService.Ord_Chk01 chk = MSBCL_OrdRegService.crtOrd_Chk01();
			chk.up0().addAll(hdrL);
			chk.up1().addAll(dtlL);
			chk.exec();
			
			copyErrFlg(up0(), chk.down0());
			MCJoinKey<MCList<Ord_Upd01_Dtl1R>> jk2 = up0().join(OrdRecvIf_Chk01_CndR.$peg_no, chk.down0(), Ord_Upd01_Dtl1R.$peg_no);
			join(notErrL, jk2, createMap_OrdRecvIf_Chk01_CndR_Ord_Upd01_Dtl1R2());
		}
		
		protected void addTmpCol() {
			up0().addStringColumn("if_proc_typ", MAC_IF_PROC_TYP.MES_ORDER_RECV.value());
		}
		
		/**
		 * ＮＵＬＬ文字を補完する。
		 * @param ordRecvIfL オーダ受信ＩＦリスト
		 */
		protected void setNullVal(MCList<OrdRecvIf_Chk01_CndR> ordRecvIfL) {
			for (OrdRecvIf_Chk01_CndR ordRecvIfR : ordRecvIfL) {
				ordRecvIfR.sno1(nvl(ordRecvIfR.sno1(), MAC_STR.NULL_VAL.value()));
				ordRecvIfR.sno2(nvl(ordRecvIfR.sno2(), MAC_STR.NULL_VAL.value()));
				ordRecvIfR.sno3(nvl(ordRecvIfR.sno3(), MAC_STR.NULL_VAL.value()));
				ordRecvIfR.sno4(nvl(ordRecvIfR.sno4(), MAC_STR.NULL_VAL.value()));
			}
		}
		
		/**
		 * 外部オーダＮＯが重複しているかをチェックする。
		 * @param ordRecvIfL オーダ受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDuplicate(MCList<OrdRecvIf_Chk01_CndR> ordRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			List<MCNumber> errL = new ArrayList<MCNumber>();
			OrdRecvIf_Chk01_CndR prev = null;
			for (OrdRecvIf_Chk01_CndR ordRecvIfR : ordRecvIfL) {
				if (prev == null) {
					prev = ordRecvIfR;
					continue;
				}
				
				if (isSame(ordRecvIfR.ext_sys_cd(), prev.ext_sys_cd())
						&& isSame(ordRecvIfR.ext_itm_ord_no(), prev.ext_itm_ord_no())
						&& isSame(ordRecvIfR.ext_oper_ord_no(), prev.ext_oper_ord_no())) {
					if (!errL.contains(prev.data_lno())) {
						msgL.add(new MCMessage(prev, null, MSLAL0644, prev.data_no(), prev.data_lno(),
								prev.ext_sys_cd(), prev.ext_itm_ord_no(), prev.ext_oper_ord_no()));
						errL.add(prev.data_lno());
					}
					
					msgL.add(new MCMessage(ordRecvIfR, null, MSLAL0644, ordRecvIfR.data_no(), ordRecvIfR.data_lno(),
							ordRecvIfR.ext_sys_cd(), ordRecvIfR.ext_itm_ord_no(), ordRecvIfR.ext_oper_ord_no()));
					errL.add(ordRecvIfR.data_lno());
				}
				
				prev = ordRecvIfR;
			}
			return msgL;
		}
		
		/**
		 * 必須チェック
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkReq(MCList<OrdRecvIf_Chk01_CndR> ordRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			for (OrdRecvIf_Chk01_CndR ordRecvIfR : ordRecvIfL) {
				if (isDel(ordRecvIfR)) {
					continue;
				}
				msgL.addAll(check(ordRecvIfR, OrdRecvIf_Chk01_CndR.$itm_ord_typ, new FXUCL_RequiredValidater()));
				msgL.addAll(check(ordRecvIfR, OrdRecvIf_Chk01_CndR.$itm_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(ordRecvIfR, OrdRecvIf_Chk01_CndR.$strg_loc_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(ordRecvIfR, OrdRecvIf_Chk01_CndR.$mfg_loc_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(ordRecvIfR, OrdRecvIf_Chk01_CndR.$master_dt, new FXUCL_RequiredValidater()));
			}
			return msgL;
		}
		
		/**
		 * オーダ区分のチェック
		 * @param ordRecvIfL オーダ受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkItmOrdTyp(MCList<OrdRecvIf_Chk01_CndR> ordRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			for (OrdRecvIf_Chk01_CndR ordRecvIfR : ordRecvIfL) {
				if (isDel(ordRecvIfR)) {
					continue;
				}
				
				if(!(isMfg(ordRecvIfR) || isOutSrc(ordRecvIfR))) {
					msgL.add(new MCMessage(ordRecvIfR, null, MSLAL0647,
							ordRecvIfR.data_no(), ordRecvIfR.data_lno(), ordRecvIfR.ext_sys_cd(),
							ordRecvIfR.ext_itm_ord_no(), ordRecvIfR.ext_oper_ord_no(), ordRecvIfR.itm_ord_typ()));
					ordRecvIfR.err_flg(true);
				}
			}
			return msgL;
		}
		
		/**
		 * 対応するオーダ情報を取込みできるかチェックし、補完する。
		 * @param ordRecvIfL オーダ受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkOrdAndCompl(MCList<OrdRecvIf_Chk01_CndR> ordRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			for (MCList<OrdRecvIf_Chk01_CndR> upGroupList : ordRecvIfL.groupList(getOrdRecvIfHdrKey())) {
				upGroupList.sort(OrdRecvIf_Chk01_CndR.$data_lno);
				OrdRecvIf_Chk01_CndR hdrIfR = upGroupList.get(0);
				MST_ITM_ORDER_R itmOrdR = null;
				boolean hdrErrFlg = false;
				
				if (!chkExistExtOperOrd(hdrIfR) && !MSC_IF_SCHEDULER_TYP.isFLEXSCHE(hdrIfR.if_scheduler_typ())) {
					upGroupList.forEach(r -> {
						msgL.add(new MCMessage(r, null, MSLAL0645, r.data_no(), r.data_lno(), r.ext_sys_cd(), r.ext_itm_ord_no()));
					});
					hdrErrFlg = true;
				}
				
				if (!MAC_DATA_CRUD_TYP.isCRT(hdrIfR.hdr_data_crud_typ())) {
					MCList<MST_ITM_ORDER_R> itmOrdL = _cacheItmOrd.subList(_idxExtItmOrdNoKey, hdrIfR.ext_sys_cd(), hdrIfR.ext_itm_ord_no());
					
					if (itmOrdL.size() == 1) {
						itmOrdR = itmOrdL.get(0);
						if (!isNull(itmOrdR) && !MSC_IF_SCHEDULER_TYP.isFLEXSCHE(hdrIfR.if_scheduler_typ())) {
							if (chkValidItm(upGroupList, itmOrdR, msgL)) {
								hdrErrFlg = true;
							}
						}
					}
					else if (itmOrdL.size() > 1) {
						upGroupList.forEach(r -> {
							msgL.add(new MCMessage(r, null, MSLAL0642, r.data_no(), r.data_lno()));
						});
						hdrErrFlg = true;
					}
				}
				
				// ヘッダ項目のデータ補完
				if (!isNull(itmOrdR) && !hdrErrFlg) {
					for (OrdRecvIf_Chk01_CndR up : upGroupList) {
						up.itm_ord_no(itmOrdR.itm_ord_no());
						up.itm_ord_typ(itmOrdR.itm_ord_typ());
						up.itm_cd(itmOrdR.itm_cd());
						up.itm_sub1(itmOrdR.itm_sub1());
						up.itm_sub2(itmOrdR.itm_sub2());
						up.itm_sub3(itmOrdR.itm_sub3());
						up.strg_loc_cd(itmOrdR.strg_loc_cd());
						
						if (isDel(up)) {
							up.master_dt(itmOrdR.master_dt());
							up.inst_qty(itmOrdR.inst_qty());
							up.mfg_loc_cd(itmOrdR.mfg_loc_cd());
							up.bom_ptn(itmOrdR.bom_ptn());
							up.mfg_st_schd_dt(itmOrdR.mfg_st_schd_dt());
						}
					}
				}
				
				msgL.addAll(chkOperOrdAndCompl(upGroupList));
			}
			return msgL;
		}
		
		protected boolean chkValidItm(MCList<OrdRecvIf_Chk01_CndR> upGroupList,MST_ITM_ORDER_R itmOrdR,MCMessageList msgL) {
			boolean hasErrflg = false;
			for (OrdRecvIf_Chk01_CndR up : upGroupList) {
				if (!isSameItm(up, itmOrdR)) {
					hasErrflg = true;
					msgL.add(new MCMessage(up, null, MSLAL0930, up.data_no(), up.data_lno(), up.ext_sys_cd(), up.ext_itm_ord_no(),
							toDispItm(up.itm_cd(), up.itm_sub1(), up.itm_sub2(), up.itm_sub3())));
				}
			}
			return hasErrflg;
		}
		
		/**
		 * 対応するオーダ明細情報を取込みできるかチェックし、補完する。
		 * @param upGroupList 外部システムデータＮＯ・外部システムデータ行ＮＯ・外部品目オーダＮＯが同一であるオーダ受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkOperOrdAndCompl(MCList<OrdRecvIf_Chk01_CndR> upGroupList) {
			MCMessageList msgL = new MCMessageList();
			for (OrdRecvIf_Chk01_CndR ordRecvIfR : upGroupList) {
				MCList<MST_OPER_ORDER_R> operOrdL = _cacheOperOrd.subList(_idxExtOperOrdNoKey, ordRecvIfR.ext_sys_cd(), ordRecvIfR.ext_oper_ord_no());
				boolean dtlErrFlg = false;
				
				if (!MSC_IF_SCHEDULER_TYP.isFLEXSCHE(ordRecvIfR.if_scheduler_typ())) {
					if (isCrt(ordRecvIfR)) {
						if (operOrdL.size() > 0) {
							msgL.add(new MCMessage(ordRecvIfR, null, MSLAL0640, ordRecvIfR.data_no(), ordRecvIfR.data_lno(),
									ordRecvIfR.ext_sys_cd(), ordRecvIfR.ext_itm_ord_no(), ordRecvIfR.ext_oper_ord_no()));
							dtlErrFlg = true;
						}
					}
					else {
						if (operOrdL.size() > 1) {
							msgL.add(new MCMessage(ordRecvIfR, null, MSLAL0646, ordRecvIfR.data_no(), ordRecvIfR.data_lno()));
							dtlErrFlg = true;
						}
						else if (operOrdL.size() == 0) {
							msgL.add(new MCMessage(ordRecvIfR, null, MSLAL0641, ordRecvIfR.data_no(), ordRecvIfR.data_lno()));
							dtlErrFlg = true;
						}
					}
				}
				
				// 明細項目のデータ補完
				if ((!isNull(operOrdL)) && !dtlErrFlg) {
					MST_OPER_ORDER_R operOrdR = operOrdL.get(0);
					ordRecvIfR.oper_ord_no(operOrdR.oper_ord_no());
					ordRecvIfR.itm_ord_no(operOrdR.itm_ord_no());
					ordRecvIfR.disp_seq(operOrdR.disp_seq());
					ordRecvIfR.oper_seq(operOrdR.oper_seq());
					ordRecvIfR.loc_cd(operOrdR.loc_cd());
					ordRecvIfR.wg_cd(operOrdR.wg_cd());
					
					if (isDel(ordRecvIfR)) {
						ordRecvIfR.st_schd_tm(operOrdR.st_schd_tm());
						ordRecvIfR.end_schd_tm(operOrdR.end_schd_tm());
						ordRecvIfR.oper_cd(operOrdR.oper_cd());
						ordRecvIfR.oper_lt(operOrdR.oper_lt());
						ordRecvIfR.oper_offst_typ(operOrdR.oper_offst_typ());
						ordRecvIfR.oper_schd_qty(operOrdR.oper_schd_qty());
						ordRecvIfR.itm_ord_sts_typ(operOrdR.itm_ord_sts_typ());
						ordRecvIfR.yield_oper_flg(operOrdR.yield_oper_flg());
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 工程オーダ明細に対応する外部工程オーダＮＯが全て存在するかをチェックする。
		 * @param hdrIfR オーダ受信ＩＦ
		 * @return 全て存在する場合はtrue
		 */
		protected boolean chkExistExtOperOrd(OrdRecvIf_Chk01_CndR hdrIfR) {
			MCList<MST_OPER_ORDER_R> operOrdL = _cacheOperOrd.subList(_idxExtItmOrdNoforOperkey, hdrIfR.ext_sys_cd(), hdrIfR.ext_itm_ord_no());
			for (MST_OPER_ORDER_R operOrdR : operOrdL) {
				OrdRecvIf_Chk01_CndR ordRecvIfR = getOrdRecvIfR(operOrdR);
				if (isNull(ordRecvIfR)) {
					return false;
				}
			}
			return true;
		}
		
		/**
		 * 整合性チェックを行う。
		 * @param ordRecvIfL オーダ受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkSub(MCList<OrdRecvIf_Chk01_CndR> ordRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			for (OrdRecvIf_Chk01_CndR ordRecvIfR : ordRecvIfL) {
				if (isDel(ordRecvIfR)) {
					continue;
				}
				
				msgL.addAll(check(ordRecvIfR, new String[] {OrdRecvIf_Chk01_CndR.$inst_qty, OrdRecvIf_Chk01_CndR.$yield_schd_qty}, new FXUCL_AtLeastOneValidater()));
				
				if (MSC_ITM_ORD_TYP.isMFG(ordRecvIfR.itm_ord_typ()) && !isNull(ordRecvIfR.strg_sppl_cd())) {
					msgL.add(new MCMessage(ordRecvIfR, OrdRecvIf_Chk01_CndR.$strg_loc_cd, MSBCL1206, toDispGUIIndex(ordRecvIfR)));
				}
				if (MSC_ITM_ORD_TYP.isMFG(ordRecvIfR.itm_ord_typ()) && !isNull(ordRecvIfR.mfg_sppl_cd())) {
					msgL.add(new MCMessage(ordRecvIfR, OrdRecvIf_Chk01_CndR.$mfg_loc_cd, MSBCL1208, toDispGUIIndex(ordRecvIfR)));
				}
				if (MSC_ITM_ORD_TYP.isOUTSRC(ordRecvIfR.itm_ord_typ()) && isNull(ordRecvIfR.mfg_sppl_cd())) {
					msgL.add(new MCMessage(ordRecvIfR, OrdRecvIf_Chk01_CndR.$mfg_loc_cd, MSBCL1209, toDispGUIIndex(ordRecvIfR)));
				}
			}
			return msgL;
		}
		
		/**
		 * 工程オーダのチェックを行う。
		 * @param ordRecvIfL オーダ受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkOper(MCList<OrdRecvIf_Chk01_CndR> ordRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			for (OrdRecvIf_Chk01_CndR ordRecvIfR : ordRecvIfL) {
				if (isDel(ordRecvIfR) || isDefOper(ordRecvIfR)) {
					continue;
				}
				
				msgL.addAll(check(ordRecvIfR, OrdRecvIf_Chk01_CndR.$st_schd_tm, new FXUCL_RequiredValidater()));
				msgL.addAll(check(ordRecvIfR, OrdRecvIf_Chk01_CndR.$end_schd_tm, new FXUCL_RequiredValidater()));
				msgL.addAll(check(ordRecvIfR, OrdRecvIf_Chk01_CndR.$oper_schd_qty, new FXUCL_RequiredValidater()));
				msgL.addAll(check(ordRecvIfR, OrdRecvIf_Chk01_CndR.$disp_seq, new FXUCL_RequiredValidater()));
				msgL.addAll(check(ordRecvIfR, OrdRecvIf_Chk01_CndR.$oper_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(ordRecvIfR, OrdRecvIf_Chk01_CndR.$oper_seq, new FXUCL_RequiredValidater()));
				msgL.addAll(check(ordRecvIfR, OrdRecvIf_Chk01_CndR.$loc_cd, new FXUCL_RequiredValidater()));
				if (!msgL.isEmpty()) {
					return msgL;
				}
				
				// 工程指図数 > 0
				if (ordRecvIfR.oper_schd_qty().lte(MCNumber.ZERO)) {
					msgL.add(new MCMessage(ordRecvIfR, null, MSBCL0092, ordRecvIfR.oper_cd(), ordRecvIfR.oper_seq()));
				}
				
				// 日付前後チェック
				// 工程着手予定日時-工程終了予定日時
				if (ordRecvIfR.st_schd_tm().gt(ordRecvIfR.end_schd_tm())) {
					msgL.add(new MCMessage(ordRecvIfR, null, MSBCL0093,
						toY2MDHMString(ordRecvIfR.st_schd_tm()),
						toY2MDHMString(ordRecvIfR.end_schd_tm()),
						ordRecvIfR.oper_cd(), ordRecvIfR.oper_seq()));
				}
			}
			return msgL;
		}
		
		/**
		 * 品目工程情報の設定
		 * @param ordRecvIfL オーダ受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList setItmOper(MCList<OrdRecvIf_Chk01_CndR> ordRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			for (OrdRecvIf_Chk01_CndR ordRecvIfR : ordRecvIfL) {
				if (isDel(ordRecvIfR) || isDefOper(ordRecvIfR)) {
					continue;
				}
				
				MAM_ITM_OPER_R itmOper = getCacheItmOperKey(ordRecvIfR);
				if (itmOper.isEmpty()) {
					msgL.add(new MCMessage(ordRecvIfR, null, MSLAL0648,
							ordRecvIfR.data_no(), ordRecvIfR.data_lno(), ordRecvIfR.ext_sys_cd(),
							ordRecvIfR.ext_itm_ord_no(), ordRecvIfR.ext_oper_ord_no(),
							ordRecvIfR.oper_cd(), ordRecvIfR.oper_seq()));
					ordRecvIfR.err_flg(true);
				}
				else {
					ordRecvIfR.disp_seq(itmOper.disp_seq());
					ordRecvIfR.oper_lt(itmOper.oper_lt());
					ordRecvIfR.oper_offst_typ(itmOper.oper_offst_typ());
					ordRecvIfR.yield_oper_flg(itmOper.yield_oper_flg());
				}
			}
			return msgL;
		}
		
		/**
		 * 品目工程マスタの工程がオーダ受信ＩＦリストに全て存在するかチェック
		 * @param ordRecvIfL オーダ受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkItmOper(MCList<OrdRecvIf_Chk01_CndR> ordRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			for (MCList<OrdRecvIf_Chk01_CndR> upGroupList : ordRecvIfL.groupList(getOrdRecvIfHdrKey())) {
				OrdRecvIf_Chk01_CndR hdrIfR = upGroupList.get(0);
				
				if (isDel(hdrIfR) || isDefOper(hdrIfR)) {
					continue;
				}
				
				// 削除を除く
				MCList<OrdRecvIf_Chk01_CndR> list = MCList.create(OrdRecvIf_Chk01_CndR.class);
				for (OrdRecvIf_Chk01_CndR upGroupRow : upGroupList) {
					if (!MAC_DATA_CRUD_TYP.isDEL(upGroupRow.data_crud_typ())) {
						list.add(upGroupRow);
					}
				}
				
				MCList<MAM_ITM_OPER_R> itmOperL = getCacheItmOper(hdrIfR);
				if (!isSame(itmOperL.size(), list.groupBy(OrdRecvIf_Chk01_CndR.$oper_cd, OrdRecvIf_Chk01_CndR.$oper_seq).size())) {
					msgL.add(new MCMessage(hdrIfR, null, MSLAL0649,
							hdrIfR.data_no(), hdrIfR.data_lno(), hdrIfR.ext_sys_cd(),
							hdrIfR.ext_itm_ord_no(), hdrIfR.loc_cd(),
							toDispItm(hdrIfR.itm_cd(), hdrIfR.itm_sub1(), hdrIfR.itm_sub2(), hdrIfR.itm_sub3())));
					hdrIfR.err_flg(true);
				}
			}
			return msgL;
		}
		
		/**
		 * 同一取込グループにエラーのないリストを返す
		 * @return エラーのないリスト
		 */
		protected MCList<OrdRecvIf_Chk01_CndR> getNotErrL() {
			if (hasErrFlgOn(up0())) {
				MCList<OrdRecvIf_Chk01_CndR> notErrL = up0().createInstance();
				for (MCList<OrdRecvIf_Chk01_CndR> list : up0().groupList(getOrdRecvIfHdrKey())) {
					if (!hasErrFlgOn(list)) {
						notErrL.addAll(list);
					}
				}
				return notErrL;
			}
			else {
				return up0();
			}
		}
		
		/**
		 * オーダ受信ＩＦの補完を行う。
		 */
		protected void compl(MCList<OrdRecvIf_Chk01_CndR> ordRecvIfL) {
			setHdrDataCrudTyp(ordRecvIfL);
			
			for (OrdRecvIf_Chk01_CndR ordRecvIfR : ordRecvIfL) {
				//オーダー登録サービス呼出時の固定値
				ordRecvIfR.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.SAV.value());
				ordRecvIfR.mrp_typ(MSC_MRP_TYP.MRP.value());
				ordRecvIfR.ord_gnrt_typ(MSC_ORD_GNRT_TYP.MNL.value());
				ordRecvIfR.oper_ord_pr_flg(false);
				ordRecvIfR.io_schd_pr_flg(true);
				if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(ordRecvIfR.if_scheduler_typ())) {
					ordRecvIfR.itm_ord_no(ordRecvIfR.ext_itm_ord_no());
				}
				setDtlStatus(ordRecvIfR);
				
				setWgCd(ordRecvIfR);
			}
		}
		
		/**
		 * ヘッダのデータ更新区分を設定する。
		 */
		protected void setHdrDataCrudTyp(MCList<OrdRecvIf_Chk01_CndR> ordRecvIfL) {
			if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(ordRecvIfL.get(0).if_scheduler_typ())) {
				ordRecvIfL.setString(OrdRecvIf_Chk01_CndR.$hdr_data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
				return;
			}
			for (MCList<OrdRecvIf_Chk01_CndR> upGroupList : ordRecvIfL.groupList(getOrdRecvIfHdrKey())) {
				if (isHdrDataCrudTypIns(upGroupList)) {
					upGroupList.setString(OrdRecvIf_Chk01_CndR.$hdr_data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (isHdrDataCrudTypDel(upGroupList)) {
					upGroupList.setString(OrdRecvIf_Chk01_CndR.$hdr_data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					upGroupList.setString(OrdRecvIf_Chk01_CndR.$hdr_data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}
		
		/**
		 * 明細のステータスを設定する。
		 */
		protected void setDtlStatus(OrdRecvIf_Chk01_CndR ordRecvIfR) {
			if (MAC_DATA_CRUD_TYP.isCRT(ordRecvIfR.data_crud_typ())) {
				ordRecvIfR.setStatus(MCRow.CREATE);
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(ordRecvIfR.data_crud_typ())) {
				ordRecvIfR.setStatus(MCRow.MODIFY);
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(ordRecvIfR.data_crud_typ())) {
				ordRecvIfR.setStatus(MCRow.DELETE);
			}
			else {
				ordRecvIfR.setStatus(MCRow.NONE);
			}
		}
		
		/**
		 * ワーキングコードの設定
		 */
		protected void setWgCd(OrdRecvIf_Chk01_CndR ordRecvIfR) {
			MAM_LOC_R locR1 = getCacheLoc(ordRecvIfR.strg_loc_cd());
			ordRecvIfR.strg_site_cd(locR1.site_cd());
			ordRecvIfR.strg_wg_cd(locR1.wg_cd());
			
			MAM_LOC_R locR2 = getCacheLoc(ordRecvIfR.mfg_loc_cd());
			ordRecvIfR.mfg_wg_cd(locR2.wg_cd());
			
			MAM_LOC_R locR3 = getCacheLoc(ordRecvIfR.loc_cd());
			ordRecvIfR.wg_cd(locR3.wg_cd());
		}
		
		/**
		 * 品目オーダのデータ更新区分が新規か
		 * @param ordRecvIfL オーダ受信ＩＦリスト
		 * @return 新規の場合はtrue
		 */
		protected boolean isHdrDataCrudTypIns(MCList<OrdRecvIf_Chk01_CndR> ordRecvIfL) {
			OrdRecvIf_Chk01_CndR hdrR = ordRecvIfL.get(0);
			MST_ITM_ORDER_R itmOrdR = _cacheItmOrd.getFirst(_idxExtItmOrdNoKey, hdrR.ext_sys_cd(), hdrR.ext_itm_ord_no());
			if (isNull(itmOrdR)) {
				return true;
			}
			return false;
		}
		
		/**
		 * 品目オーダのデータ更新区分が削除か
		 * @param ordRecvIfL オーダ受信ＩＦリスト
		 * @return 削除の場合はtrue
		 */
		protected boolean isHdrDataCrudTypDel(MCList<OrdRecvIf_Chk01_CndR> ordRecvIfL) {
			OrdRecvIf_Chk01_CndR hdrR = ordRecvIfL.get(0);
			MCList<MST_OPER_ORDER_R> operOrdL = _cacheOperOrd.subList(_idxExtItmOrdNoforOperkey, hdrR.ext_sys_cd(), hdrR.ext_itm_ord_no());
			if (!isSame(operOrdL.size(), ordRecvIfL.size())) {
				return false;
			}
			
			int ifDelSize = 0;
			
			for (MST_OPER_ORDER_R operOrdR : operOrdL) {
				OrdRecvIf_Chk01_CndR ordRecvIfR = getOrdRecvIfR(operOrdR);
				if (!isNull(ordRecvIfR) && isDel(ordRecvIfR)) {
					ifDelSize++;
				}
			}
			
			if (isSame(operOrdL.size(), ifDelSize)) {
				return true;
			}
			return false;
		}
		
		/**
		 * 工程オーダに紐付くオーダ受信ＩＦを取得する。
		 * @param oOrdR 工程オーダ
		 * @return オーダ受信ＩＦ
		 */
		protected OrdRecvIf_Chk01_CndR getOrdRecvIfR(MST_OPER_ORDER_R oOrdR) {
			if (_idxOrdRecvIfKey == null) {
				_idxOrdRecvIfKey = up0().createIndex(MST_ITM_ORDER_R.$ext_sys_cd, MST_OPER_ORDER_R.$ext_oper_ord_no);
			}
			
			return up0().getFirst(_idxOrdRecvIfKey, oOrdR.getString("ext_sys_cd"), oOrdR.ext_oper_ord_no());
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().setAll(up0());
			
			MCList<OrdRecvIf_Chk01_CndR> ordRecvIfL = getNotErrL();
			for (MCList<OrdRecvIf_Chk01_CndR> upGroupList : ordRecvIfL.groupList(getOrdRecvIfHdrKey())) {
				upGroupList.sort(OrdRecvIf_Chk01_CndR.$data_lno);
				setDownSub(upGroupList);
			}
		}
		
		/**
		 * 下り電文を設定します
		 * @param ordRecvIfL オーダ受信ＩＦリスト
		 */
		protected void setDownSub(MCList<OrdRecvIf_Chk01_CndR> ordRecvIfL) {
			OrdRecvIf_Chk01_CndR hdrIfR = ordRecvIfL.get(0);
			Ord_Upd01_Dtl1R hdrR = Ord_Upd01_Dtl1R.create();
			setOrdHdr(hdrR, hdrIfR);
			
			MCList<Ord_Upd01_Dtl2R> dtlL = MCList.create(Ord_Upd01_Dtl2R.class);
			for (OrdRecvIf_Chk01_CndR ordRecvIfR : ordRecvIfL) {
				Ord_Upd01_Dtl2R dtlR = Ord_Upd01_Dtl2R.create();
				setOrdDtl(dtlR, ordRecvIfR, hdrR);
				dtlL.add(dtlR);
			}
			
			down1().add(hdrR);
			down2().addAll(dtlL);
		}
		
		/**
		 * オーダ登録サービスコール用の電文を作成する（ヘッダ部）
		 */
		protected void setOrdHdr(Ord_Upd01_Dtl1R hdrR, OrdRecvIf_Chk01_CndR ordRecvIfR) {
			copy(hdrR, ordRecvIfR, createMap_Ord_Upd01_Dtl1R_OrdRecvIf_Chk01_CndR());
			hdrR.peg_no(ordRecvIfR.peg_no());
			hdrR.setParamIndex(ordRecvIfR.ordif().getParamIndex());
			hdrR.setParamRowIndex(ordRecvIfR.ordif().getParamRowIndex());
			if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(ordRecvIfR.if_scheduler_typ())) {
				hdrR.ord_snd_flg(true);
			}
			else {
				hdrR.ord_snd_flg(ordRecvIfR.getBoolean("ord_rep_flg"));
			}
		}
		
		/**
		 * オーダ登録サービスコール用の電文を作成する（明細部）
		 */
		protected void setOrdDtl(Ord_Upd01_Dtl2R dtlR, OrdRecvIf_Chk01_CndR ordRecvIfR, Ord_Upd01_Dtl1R hdrR) {
			if (isDefOper(ordRecvIfR) && !isDel(ordRecvIfR)) {
				setDefOper(dtlR, ordRecvIfR);
			}
			else {
				copy(dtlR, ordRecvIfR, createMap_Ord_Upd01_Dtl2R_OrdRecvIf_Chk01_CndR());
			}
			dtlR.peg_no(hdrR.peg_no());
			dtlR.setParamIndex(ordRecvIfR.ordif().getParamIndex());
			dtlR.setParamRowIndex(ordRecvIfR.ordif().getParamRowIndex());
			dtlR.scheduler_frozen_flg(ordRecvIfR.ordif().scheduler_frozen_flg());
		}
		
		/**
		 * デフォルト工程レコードを設定する
		 */
		protected void setDefOper(Ord_Upd01_Dtl2R dtlR, OrdRecvIf_Chk01_CndR ordRecvIfR) {
			dtlR.itm_ord_no(ordRecvIfR.itm_ord_no());
			dtlR.oper_ord_no(ordRecvIfR.oper_ord_no());
			dtlR.st_schd_tm(ordRecvIfR.mfg_st_schd_dt());
			dtlR.end_schd_tm(ordRecvIfR.mfg_end_schd_dt());
			dtlR.oper_lt(MCNumber.ZERO);
			dtlR.oper_offst_typ(MAC_OFFST_TYP.BY_ST.value());
			dtlR.oper_offst(MCNumber.ZERO);
			dtlR.oper_schd_qty(ordRecvIfR.inst_qty());
			dtlR.oper_ord_sts_typ(MSC_OPER_ORD_STS_TYP.OPN.value());
			dtlR.mst_mfg_loc_cd(null);
			dtlR.loc_cd(ordRecvIfR.mfg_loc_cd());
			dtlR.wg_cd(ordRecvIfR.mfg_wg_cd());
			dtlR.oper_ptn(MAC_STR.NULL_VAL.value());
			dtlR.oper_cd(MAC_STR.NULL_VAL.value());
			dtlR.oper_seq(MCNumber.ONE);
			dtlR.disp_seq(MCNumber.ONE);
			dtlR.yield_oper_flg(true);
			dtlR.oper_rsrc(ordRecvIfR.oper_rsrc());
			dtlR.ext_oper_ord_no(ordRecvIfR.ext_oper_ord_no());
		}
		
		/**
		 * オーダ受信ＩＦのヘッダ項目を返す。
		 * @return ヘッダ項目
		 */
		protected String[] getOrdRecvIfHdrKey() {
			return new String[] {
					OrdRecvIf_Chk01_CndR.$ext_data_no,
					OrdRecvIf_Chk01_CndR.$ext_sys_cd,
					OrdRecvIf_Chk01_CndR.$ext_itm_ord_no
					};
		}
		
		/**
		 * 指定されたオーダ受信ＩＦが新規かどうか。
		 * @param ordRecvIfR オーダ受信ＩＦ
		 * @return 新規の場合はtrue
		 */
		protected boolean isCrt(OrdRecvIf_Chk01_CndR ordRecvIfR) {
			return MAC_DATA_CRUD_TYP.isCRT(ordRecvIfR.data_crud_typ());
		}
		
		/**
		 * 指定されたオーダ受信ＩＦが更新かどうか。
		 * @param ordRecvIfR オーダ受信ＩＦ
		 * @return 更新の場合はtrue
		 */
		protected boolean isUpd(OrdRecvIf_Chk01_CndR ordRecvIfR) {
			return MAC_DATA_CRUD_TYP.isUPD(ordRecvIfR.data_crud_typ());
		}
		
		/**
		 * 指定されたオーダ受信ＩＦが削除かどうか。
		 * @param ordRecvIfR オーダ受信ＩＦ
		 * @return 削除の場合はtrue
		 */
		protected boolean isDel(OrdRecvIf_Chk01_CndR ordRecvIfR) {
			return MAC_DATA_CRUD_TYP.isDEL(ordRecvIfR.data_crud_typ());
		}
		
		/**
		 * 指定されたオーダ受信ＩＦの品目オーダ区分が製造かどうか。
		 * @param ordRecvIfR オーダ受信ＩＦ
		 * @return 製造の場合はtrue
		 */
		protected boolean isMfg(OrdRecvIf_Chk01_CndR ordRecvIfR) {
			return MSC_ITM_ORD_TYP.isMFG(ordRecvIfR.itm_ord_typ());
		}
		
		/**
		 * 品目オーダ区分が外注かどうか。
		 * @param ordRecvIfR オーダ受信ＩＦ
		 * @return 外注の場合はtrue
		 */
		protected boolean isOutSrc(OrdRecvIf_Chk01_CndR ordRecvIfR) {
			return MSC_ITM_ORD_TYP.isOUTSRC(ordRecvIfR.itm_ord_typ());
		}
		
		/**
		 * デフォルト工程対象であるかどうかどうか。
		 * @param ordRecvIfR オーダ受信ＩＦ
		 * @return デフォルト工程対象の場合はtrue
		 */
		protected boolean isDefOper(OrdRecvIf_Chk01_CndR ordRecvIfR) {
			return MSC_ITM_ORD_TYP.isOUTSRC(ordRecvIfR.itm_ord_typ())
					|| (MSC_ITM_ORD_TYP.isMFG(ordRecvIfR.itm_ord_typ()) && isNullOrNullVal(ordRecvIfR.oper_ptn()));
		}
		
		/** OrdRecvIf_Chk01_CndR → Ord_Upd01_Dtl1R */
		protected Map_Ord_Upd01_Dtl1R_OrdRecvIf_Chk01_CndR<Ord_Upd01_Dtl1R,OrdRecvIf_Chk01_CndR> createMap_Ord_Upd01_Dtl1R_OrdRecvIf_Chk01_CndR() {
			return new Map_Ord_Upd01_Dtl1R_OrdRecvIf_Chk01_CndR<Ord_Upd01_Dtl1R, OrdRecvIf_Chk01_CndR>();
		}
		public class Map_Ord_Upd01_Dtl1R_OrdRecvIf_Chk01_CndR<D extends Ord_Upd01_Dtl1R, S extends OrdRecvIf_Chk01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$err_flg, OrdRecvIf_Chk01_CndR.$err_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, OrdRecvIf_Chk01_CndR.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_typ, OrdRecvIf_Chk01_CndR.$mrp_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$oper_ord_pr_flg, OrdRecvIf_Chk01_CndR.$oper_ord_pr_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$io_schd_pr_flg, OrdRecvIf_Chk01_CndR.$io_schd_pr_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, OrdRecvIf_Chk01_CndR.$itm_ord_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_typ, OrdRecvIf_Chk01_CndR.$itm_ord_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ord_gnrt_typ, OrdRecvIf_Chk01_CndR.$ord_gnrt_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_cd, OrdRecvIf_Chk01_CndR.$itm_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub1, OrdRecvIf_Chk01_CndR.$itm_sub1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub2, OrdRecvIf_Chk01_CndR.$itm_sub2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub3, OrdRecvIf_Chk01_CndR.$itm_sub3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ver_no, OrdRecvIf_Chk01_CndR.$ver_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_loc_cd, OrdRecvIf_Chk01_CndR.$strg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_loc_cd, OrdRecvIf_Chk01_CndR.$mfg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mst_mfg_loc_cd, OrdRecvIf_Chk01_CndR.$mfg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_wg_cd, OrdRecvIf_Chk01_CndR.$rqst_wg_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$bom_ptn, OrdRecvIf_Chk01_CndR.$bom_ptn);
				addColumnPathMap(Ord_Upd01_Dtl1R.$oper_ptn, OrdRecvIf_Chk01_CndR.$oper_ptn);
				addColumnPathMap(Ord_Upd01_Dtl1R.$inst_qty, OrdRecvIf_Chk01_CndR.$inst_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$yield_schd_qty, OrdRecvIf_Chk01_CndR.$yield_schd_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$nmr_qty, OrdRecvIf_Chk01_CndR.$nmr_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$dnm_qty, OrdRecvIf_Chk01_CndR.$dnm_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$fxd_yield_qty, OrdRecvIf_Chk01_CndR.$fxd_yield_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_sts_typ, OrdRecvIf_Chk01_CndR.$itm_ord_sts_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$po_schd_dt, OrdRecvIf_Chk01_CndR.$po_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$purc_lt, OrdRecvIf_Chk01_CndR.$purc_lt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_st_schd_dt, OrdRecvIf_Chk01_CndR.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_end_schd_dt, OrdRecvIf_Chk01_CndR.$mfg_end_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_lt, OrdRecvIf_Chk01_CndR.$mfg_lt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_schd_dt, OrdRecvIf_Chk01_CndR.$strg_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$xfr_lt, OrdRecvIf_Chk01_CndR.$xfr_lt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$accpt_schd_dt, OrdRecvIf_Chk01_CndR.$accpt_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$accpt_insp_lt, OrdRecvIf_Chk01_CndR.$accpt_insp_lt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$insp_st_schd_dt, OrdRecvIf_Chk01_CndR.$insp_st_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$insp_end_schd_dt, OrdRecvIf_Chk01_CndR.$insp_end_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$insp_lt, OrdRecvIf_Chk01_CndR.$insp_lt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$insp_offst, OrdRecvIf_Chk01_CndR.$insp_offst);
				addColumnPathMap(Ord_Upd01_Dtl1R.$avl_schd_dt, OrdRecvIf_Chk01_CndR.$avl_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$master_dt, OrdRecvIf_Chk01_CndR.$master_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno1, OrdRecvIf_Chk01_CndR.$sno1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno2, OrdRecvIf_Chk01_CndR.$sno2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno3, OrdRecvIf_Chk01_CndR.$sno3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno4, OrdRecvIf_Chk01_CndR.$sno4);
				addColumnPathMap(Ord_Upd01_Dtl1R.$wg_cd, OrdRecvIf_Chk01_CndR.$strg_wg_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ord_fix_pd, OrdRecvIf_Chk01_CndR.$ord_fix_pd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqmt_no, OrdRecvIf_Chk01_CndR.$rqmt_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$inst_po_cnt_rmrks, OrdRecvIf_Chk01_CndR.$inst_po_cnt_rmrks);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sim_mrp_no, OrdRecvIf_Chk01_CndR.$sim_mrp_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$intr_rmrks, OrdRecvIf_Chk01_CndR.$itm_ord_intr_rmrks);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sub_char1, OrdRecvIf_Chk01_CndR.$itm_ord_sub_char1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sub_char2, OrdRecvIf_Chk01_CndR.$itm_ord_sub_char2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sub_char3, OrdRecvIf_Chk01_CndR.$itm_ord_sub_char3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_sppl_cd, OrdRecvIf_Chk01_CndR.$mfg_sppl_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_maker_cd, OrdRecvIf_Chk01_CndR.$mfg_maker_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$unit_cd, OrdRecvIf_Chk01_CndR.$unit_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$dec_place, OrdRecvIf_Chk01_CndR.$dec_place);
				addColumnPathMap(Ord_Upd01_Dtl1R.$lot_mng_typ, OrdRecvIf_Chk01_CndR.$lot_mng_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sublot_mng_typ, OrdRecvIf_Chk01_CndR.$sublot_mng_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ext_sys_cd, OrdRecvIf_Chk01_CndR.$ext_sys_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ext_itm_ord_no, OrdRecvIf_Chk01_CndR.$ext_itm_ord_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.ord_rcv_flg(true);
				dest.data_crud_typ(src.hdr_data_crud_typ());
			}
		}
		
		/** OrdRecvIf_Chk01_CndR → Ord_Upd01_Dtl2R */
		protected Map_Ord_Upd01_Dtl2R_OrdRecvIf_Chk01_CndR<Ord_Upd01_Dtl2R,OrdRecvIf_Chk01_CndR> createMap_Ord_Upd01_Dtl2R_OrdRecvIf_Chk01_CndR() {
			return new Map_Ord_Upd01_Dtl2R_OrdRecvIf_Chk01_CndR<Ord_Upd01_Dtl2R, OrdRecvIf_Chk01_CndR>();
		}
		public class Map_Ord_Upd01_Dtl2R_OrdRecvIf_Chk01_CndR<D extends Ord_Upd01_Dtl2R, S extends OrdRecvIf_Chk01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl2R.$peg_no_d, OrdRecvIf_Chk01_CndR.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl2R.$itm_ord_no, OrdRecvIf_Chk01_CndR.$itm_ord_no);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_ord_no, OrdRecvIf_Chk01_CndR.$oper_ord_no);
				addColumnPathMap(Ord_Upd01_Dtl2R.$st_schd_tm, OrdRecvIf_Chk01_CndR.$st_schd_tm);
				addColumnPathMap(Ord_Upd01_Dtl2R.$end_schd_tm, OrdRecvIf_Chk01_CndR.$end_schd_tm);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_lt, OrdRecvIf_Chk01_CndR.$oper_lt);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_offst_typ, OrdRecvIf_Chk01_CndR.$oper_offst_typ);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_schd_qty, OrdRecvIf_Chk01_CndR.$oper_schd_qty);
				addColumnPathMap(Ord_Upd01_Dtl2R.$disp_seq, OrdRecvIf_Chk01_CndR.$disp_seq);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_ptn, OrdRecvIf_Chk01_CndR.$oper_ptn);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_cd, OrdRecvIf_Chk01_CndR.$oper_cd);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_seq, OrdRecvIf_Chk01_CndR.$oper_seq);
				addColumnPathMap(Ord_Upd01_Dtl2R.$loc_cd, OrdRecvIf_Chk01_CndR.$loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl2R.$itm_ord_sts_typ, OrdRecvIf_Chk01_CndR.$itm_ord_sts_typ);
				addColumnPathMap(Ord_Upd01_Dtl2R.$wg_cd, OrdRecvIf_Chk01_CndR.$wg_cd);
				addColumnPathMap(Ord_Upd01_Dtl2R.$yield_oper_flg, OrdRecvIf_Chk01_CndR.$yield_oper_flg);
				addColumnPathMap(Ord_Upd01_Dtl2R.$oper_rsrc, OrdRecvIf_Chk01_CndR.$oper_rsrc);
				addColumnPathMap(Ord_Upd01_Dtl2R.$intr_rmrks, OrdRecvIf_Chk01_CndR.$oper_ord_intr_rmrks);
				addColumnPathMap(Ord_Upd01_Dtl2R.$sub_char1, OrdRecvIf_Chk01_CndR.$oper_ord_sub_char1);
				addColumnPathMap(Ord_Upd01_Dtl2R.$sub_char2, OrdRecvIf_Chk01_CndR.$oper_ord_sub_char2);
				addColumnPathMap(Ord_Upd01_Dtl2R.$sub_char3, OrdRecvIf_Chk01_CndR.$oper_ord_sub_char3);
				addColumnPathMap(Ord_Upd01_Dtl2R.$ext_oper_ord_no, OrdRecvIf_Chk01_CndR.$ext_oper_ord_no);
				addColumnPathMap(Ord_Upd01_Dtl2R.$scheduler_frozen_flg, OrdRecvIf_Chk01_CndR.$scheduler_frozen_flg);
			}
		}
		
		/** Ord_Upd01_Dtl1R → OrdRecvIf_Chk01_CndR (Ord_Chk01 → Ord_Imp01) */
		protected Map_OrdRecvIf_Chk01_CndR_Ord_Upd01_Dtl1R1<OrdRecvIf_Chk01_CndR,Ord_Upd01_Dtl1R> createMap_OrdRecvIf_Chk01_CndR_Ord_Upd01_Dtl1R1() {
			return new Map_OrdRecvIf_Chk01_CndR_Ord_Upd01_Dtl1R1<OrdRecvIf_Chk01_CndR, Ord_Upd01_Dtl1R>();
		}
		public class Map_OrdRecvIf_Chk01_CndR_Ord_Upd01_Dtl1R1<D extends OrdRecvIf_Chk01_CndR, S extends Ord_Upd01_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$itm_ord_typ, Ord_Upd01_Dtl1R.$itm_ord_typ);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$itm_cd, Ord_Upd01_Dtl1R.$itm_cd);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$itm_sub1, Ord_Upd01_Dtl1R.$itm_sub1);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$itm_sub2, Ord_Upd01_Dtl1R.$itm_sub2);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$itm_sub3, Ord_Upd01_Dtl1R.$itm_sub3);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$itm_nm, Ord_Upd01_Dtl1R.$itm_nm);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$ver_no, Ord_Upd01_Dtl1R.$ver_no);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$strg_loc_cd, Ord_Upd01_Dtl1R.$strg_loc_cd);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$mfg_loc_cd, Ord_Upd01_Dtl1R.$mfg_loc_cd);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$bom_ptn, Ord_Upd01_Dtl1R.$bom_ptn);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$oper_ptn, Ord_Upd01_Dtl1R.$oper_ptn);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$inst_qty, Ord_Upd01_Dtl1R.$inst_qty);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$yield_schd_qty, Ord_Upd01_Dtl1R.$yield_schd_qty);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$po_schd_dt, Ord_Upd01_Dtl1R.$po_schd_dt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$mfg_st_schd_dt, Ord_Upd01_Dtl1R.$mfg_st_schd_dt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$mfg_end_schd_dt, Ord_Upd01_Dtl1R.$mfg_end_schd_dt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$strg_schd_dt, Ord_Upd01_Dtl1R.$strg_schd_dt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$accpt_schd_dt, Ord_Upd01_Dtl1R.$accpt_schd_dt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$insp_st_schd_dt, Ord_Upd01_Dtl1R.$insp_st_schd_dt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$insp_end_schd_dt, Ord_Upd01_Dtl1R.$insp_end_schd_dt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$avl_schd_dt, Ord_Upd01_Dtl1R.$avl_schd_dt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$master_dt, Ord_Upd01_Dtl1R.$master_dt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$sno1, Ord_Upd01_Dtl1R.$sno1);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$sno2, Ord_Upd01_Dtl1R.$sno2);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$sno3, Ord_Upd01_Dtl1R.$sno3);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$sno4, Ord_Upd01_Dtl1R.$sno4);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$err_flg, Ord_Upd01_Dtl1R.$err_flg);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$peg_no, Ord_Upd01_Dtl1R.$peg_no);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$unit_cd, Ord_Upd01_Dtl1R.$unit_cd);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$dec_place, Ord_Upd01_Dtl1R.$dec_place);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$lot_mng_typ, Ord_Upd01_Dtl1R.$lot_mng_typ);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$sublot_mng_typ, Ord_Upd01_Dtl1R.$sublot_mng_typ);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$nmr_qty, Ord_Upd01_Dtl1R.$nmr_qty);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$dnm_qty, Ord_Upd01_Dtl1R.$dnm_qty);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$fxd_yield_qty, Ord_Upd01_Dtl1R.$fxd_yield_qty);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$rqst_wg_cd, Ord_Upd01_Dtl1R.$rqst_wg_cd);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$purc_lt, Ord_Upd01_Dtl1R.$purc_lt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$mfg_lt, Ord_Upd01_Dtl1R.$mfg_lt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$xfr_lt, Ord_Upd01_Dtl1R.$xfr_lt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$accpt_insp_lt, Ord_Upd01_Dtl1R.$accpt_insp_lt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$insp_lt, Ord_Upd01_Dtl1R.$insp_lt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$insp_offst, Ord_Upd01_Dtl1R.$insp_offst);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$ord_fix_pd, Ord_Upd01_Dtl1R.$ord_fix_pd);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$rqmt_no, Ord_Upd01_Dtl1R.$rqmt_no);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$mfg_sppl_cd, Ord_Upd01_Dtl1R.$mfg_sppl_cd);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$mfg_maker_cd, Ord_Upd01_Dtl1R.$mfg_maker_cd);
			}
		}
		
		/** Ord_Upd01_Dtl1R → OrdRecvIf_Chk01_CndR (Ord_Chk01 → Ord_Imp01) */
		protected Map_OrdRecvIf_Chk01_CndR_Ord_Upd01_Dtl1R2<OrdRecvIf_Chk01_CndR,Ord_Upd01_Dtl1R> createMap_OrdRecvIf_Chk01_CndR_Ord_Upd01_Dtl1R2() {
			return new Map_OrdRecvIf_Chk01_CndR_Ord_Upd01_Dtl1R2<OrdRecvIf_Chk01_CndR, Ord_Upd01_Dtl1R>();
		}
		public class Map_OrdRecvIf_Chk01_CndR_Ord_Upd01_Dtl1R2<D extends OrdRecvIf_Chk01_CndR, S extends Ord_Upd01_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$itm_ord_typ, Ord_Upd01_Dtl1R.$itm_ord_typ);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$rqst_wg_cd, Ord_Upd01_Dtl1R.$rqst_wg_cd);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$bom_ptn, Ord_Upd01_Dtl1R.$bom_ptn);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$oper_ptn, Ord_Upd01_Dtl1R.$oper_ptn);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$inst_qty, Ord_Upd01_Dtl1R.$inst_qty);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$yield_schd_qty, Ord_Upd01_Dtl1R.$yield_schd_qty);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$unit_cd, Ord_Upd01_Dtl1R.$unit_cd);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$dec_place, Ord_Upd01_Dtl1R.$dec_place);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$nmr_qty, Ord_Upd01_Dtl1R.$nmr_qty);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$dnm_qty, Ord_Upd01_Dtl1R.$dnm_qty);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$fxd_yield_qty, Ord_Upd01_Dtl1R.$fxd_yield_qty);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$po_schd_dt, Ord_Upd01_Dtl1R.$po_schd_dt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$purc_lt, Ord_Upd01_Dtl1R.$purc_lt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$mfg_st_schd_dt, Ord_Upd01_Dtl1R.$mfg_st_schd_dt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$mfg_end_schd_dt, Ord_Upd01_Dtl1R.$mfg_end_schd_dt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$mfg_lt, Ord_Upd01_Dtl1R.$mfg_lt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$strg_schd_dt, Ord_Upd01_Dtl1R.$strg_schd_dt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$xfr_lt, Ord_Upd01_Dtl1R.$xfr_lt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$accpt_schd_dt, Ord_Upd01_Dtl1R.$accpt_schd_dt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$insp_st_schd_dt, Ord_Upd01_Dtl1R.$insp_st_schd_dt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$insp_end_schd_dt, Ord_Upd01_Dtl1R.$insp_end_schd_dt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$insp_lt, Ord_Upd01_Dtl1R.$insp_lt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$insp_offst, Ord_Upd01_Dtl1R.$insp_offst);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$avl_schd_dt, Ord_Upd01_Dtl1R.$avl_schd_dt);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$wg_cd, Ord_Upd01_Dtl1R.$wg_cd);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$ver_no, Ord_Upd01_Dtl1R.$ver_no);
				addColumnPathMap(OrdRecvIf_Chk01_CndR.$accpt_insp_lt, Ord_Upd01_Dtl1R.$accpt_insp_lt);
			}
		}
	}
	
	/**
	 * 処理結果区分にエラーを設定
	 * @param ordRecvIfR オーダ受信ＩＦ
	 */
	protected void setErrSts(MST_ORDER_RECV_IF_R ordRecvIfR) {
		ordRecvIfR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
		setErrSet(ordRecvIfR);
	}
	
	/**
	 * 同一取込グループでエラーが発生した場合に、エラーリスト設定に追加する。
	 * @param ordRecvIfR オーダ受信ＩＦ
	 */
	protected void setErrSet(MST_ORDER_RECV_IF_R ordRecvIfR) {
		List<String> lst = createErrSetKey(ordRecvIfR);
		if (!object(CLAZZ)._errSet.contains(lst)) {
			object(CLAZZ)._errSet.add(lst);
		}
	}
	
	/**
	 * 同一取込グループのキー項目のリストを作成する。
	 * @param ordRecvIfR オーダ受信ＩＦ
	 * @return エラーキー項目のリスト
	 */
	protected List<String> createErrSetKey(MST_ORDER_RECV_IF_R ordRecvIfR) {
		List<String> lst = new ArrayList<String>();
		if (!isNull(ordRecvIfR)) {
			lst.add(ordRecvIfR.ext_sys_cd());
			lst.add(ordRecvIfR.ext_itm_ord_no());
		}
		return lst;
	}

	protected boolean isSameItm(MCRow row1, MCRow row2) {
		return isSame(row1.getStringNE(MAM_ITM_R.$itm_cd), row2.getStringNE(MAM_ITM_R.$itm_cd)) &&
				isSame(row1.getStringNE(MAM_ITM_R.$itm_sub1), row2.getStringNE(MAM_ITM_R.$itm_sub1)) &&
				isSame(row1.getStringNE(MAM_ITM_R.$itm_sub2), row2.getStringNE(MAM_ITM_R.$itm_sub2)) &&
				isSame(row1.getStringNE(MAM_ITM_R.$itm_sub3), row2.getStringNE(MAM_ITM_R.$itm_sub3));
	}
	
	protected boolean isFixedOutsrc(MCRow orderRow, MCRow configRow) {
		return MSC_ITM_ORD_TYP.isOUTSRC(orderRow.getString(MST_ORDER_RECV_IF_R.$itm_ord_typ)) && !configRow.getBoolean("allow_outsrc_schd_flg");
	}

	//FMCB CUSTOM END
}