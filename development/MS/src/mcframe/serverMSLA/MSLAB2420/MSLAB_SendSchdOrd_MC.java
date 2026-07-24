package mcframe.serverMSLA.MSLAB2420;

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
import mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverPFUD.PFUDL0030.DtlR;
import mcframe.serverMSLA.MSLAL9310.MSLAL_OrdSendIfService;
import mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_DtlR;
import mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_RsltR;
import mcframe.serverFXUC.FXUCL0170.*;
import java.util.*;
import java.util.stream.Stream;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAB_SendSchdOrd"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAB_SendSchdOrd_MC extends MSLAB_SendSchdOrd_MC_A{
	//FMCB CUSTOM START

	/**
	 * データＮＯ
	 */
	protected MCNumber _dataNo = null;

	/**
	 * エラーＦＬＧ
	 */
	protected boolean _errFlg = false;

	/**
	 * オーダ送信ＩＦサービスの下り電文
	 */
	protected MCList<OrdSendIf_Srch01_RsltR>_targetL = null;
	/**
	 * 送信ＩＦ登録用コンテナ
	 */
	protected MCList<MST_ORDSND_IF_R> _sndIfL = null;
	protected MST_ORDSND_IF_R _ordSndIfR = null;
	protected MCQueryApiBuilder _sndIfLBldr = null;

	/**
	 * SendSchdOrd_Upd01オペレーション.<p>
	 *
	 * スケジューラ連携用のオーダ情報をＩＦテーブルに登録する。<br>
	 */
	public class SendSchdOrd_Upd01 extends MSLAB_SendSchdOrd_MC_A.SendSchdOrd_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {

				initLogger();
				writeStartLog();

				chk();

				if (!_errFlg) {

					getMstData();

					if (!_targetL.isEmpty()) {
						crtSndIfData();

						insSndIfData();

						insSdrvIfData();
					}

				}
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				writeEndLog();
			}
		}

		/**
		 * バッチログを初期化する。
		 */
		protected void initLogger() {

			FXBAL_BatchLogManager.getLogger();
		}

		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {

			FXBAL_BatchLogManager.logger().writeStartLog(MSLAL0726, up0().ext_sys_cd(), up0().wg_cd(), up0().loc_grp_cd(),
					up0().site_cd(), up0().mfg_loc_cd(), toYMDString(up0().dt_fr()), toYMDString(up0().dt_to()), up0().include_unfirm_flg(), up0().if_scheduler_typ());
			pushStartLog(FXBAL_BatchLogManager.logger());
		}

		/**
		 * チェック結果を判定する。
		 */
		protected void chk() {

			MCMessageList msgList = new MCMessageList();
			chkSub(msgList);

			if (msgList.size() > 0) {
				FXBAL_BatchLogManager.logger().writeProcessLog(msgList);
			}
		}

		/**
		 * チェック処理を実行する。
		 */
		protected MCMessageList chkSub(MCMessageList msgList) {

			checkReq(msgList);
			checkValidIfSchdTyp(msgList);
			checkReqWgOrMfgLocCd(msgList);
			chkDtFrTo(msgList);

			if (msgList.size() > 0) {
				_errFlg = true;
			}
			chkArgs(msgList);

			return msgList;
		}

		protected void checkReq(MCMessageList msgList) {

			Arrays.stream(getRequiredCols()).forEach(r -> msgList.addAll(check(up0(), r, new FXUCL_RequiredValidater())));
		}

		protected String[] getRequiredCols() {

			String[] comCols = new String[] {
					SendSchdOrd_Upd01_CndR.$ext_sys_cd, SendSchdOrd_Upd01_CndR.$if_scheduler_typ
			};

			return Stream.concat(Stream.of(comCols), Stream.of(getRequiredColsSub())).toArray(String[]::new);
		}

		protected String[] getRequiredColsSub() {

			if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up0().getStringNE(SendSchdOrd_Upd01_CndR.$if_scheduler_typ))) {
				return new String[] {
						SendSchdOrd_Upd01_CndR.$dt_fr, SendSchdOrd_Upd01_CndR.$dt_to
				};
			}
			else {
				return new String[] {};
			}
		}

		protected void checkValidIfSchdTyp(MCMessageList msgList) {
			msgList.addAll(check(up0(), SendSchdOrd_Upd01_CndR.$if_scheduler_typ, new FXUCL_ConstValidater(MSC_IF_SCHEDULER_TYP.array())));
		}

		protected void checkReqWgOrMfgLocCd(MCMessageList msgList) {

			if (MSC_IF_SCHEDULER_TYP.isGP(up0().if_scheduler_typ())) {
				msgList.addAll(check(up0(), SendSchdOrd_Upd01_CndR.$wg_cd, new FXUCL_RequiredValidater()));
			}
			else if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up0().if_scheduler_typ())) {
				msgList.addAll(check(up0(), new String[] {
						SendSchdOrd_Upd01_CndR.$wg_cd, SendSchdOrd_Upd01_CndR.$loc_grp_cd
				}, new FXUCL_TooManyInputsValidater()));
				msgList.addAll(check(up0(), new String[] {
						SendSchdOrd_Upd01_CndR.$wg_cd, SendSchdOrd_Upd01_CndR.$loc_grp_cd
				}, new FXUCL_AtLeastOneValidater()));
			}
		}

		protected void chkDtFrTo(MCMessageList msgList) {

			if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up0().if_scheduler_typ())) {
				msgList.addAll(check(up0(), new String[] {
						SendSchdOrd_Upd01_CndR.$dt_fr, SendSchdOrd_Upd01_CndR.$dt_to
				}, new FXUCL_BeforeAfterValidater()));
			}
		}

		protected void chkArgs(MCMessageList msgList) {

			if (MSC_IF_SCHEDULER_TYP.isGP(up0().if_scheduler_typ())) {
				if (!isNull(up0().loc_grp_cd())) {
					msgList.add(new MCMessage(MSLAL0901, MSC_IF_SCHEDULER_TYP.GP.value(),
							getLabel(up0(), SendSchdOrd_Upd01_CndR.$loc_grp_cd)));
				}
				if (!isNull(up0().dt_fr())) {
					msgList.add(new MCMessage(MSLAL0901, MSC_IF_SCHEDULER_TYP.GP.value(),
							getLabel(up0(), SendSchdOrd_Upd01_CndR.$dt_fr)));
				}
				if (!isNull(up0().dt_to())) {
					msgList.add(new MCMessage(MSLAL0901, MSC_IF_SCHEDULER_TYP.GP.value(),
							getLabel(up0(), SendSchdOrd_Upd01_CndR.$dt_to)));
				}
				if (up0().include_unfirm_flg()) {
					msgList.add(new MCMessage(MSLAL0901, MSC_IF_SCHEDULER_TYP.GP.value(),
							getLabel(up0(), SendSchdOrd_Upd01_CndR.$include_unfirm_flg)));
				}
			}
		}

		/**
		 * オーダ送信ＩＦサービスを呼び出してオーダ情報のデータを取得して登録する
		 */
		protected void getMstData() {
			MSLAL_OrdSendIfService.OrdSendIf_Srch01 ope = MSLAL_OrdSendIfService.crtOrdSendIf_Srch01();
			setArg(ope.up0());
			ope.exec();
			_targetL = MCList.create(OrdSendIf_Srch01_RsltR.class);
			_targetL.addAll(ope.down0());
		}

		/**
		 * バッチ実行時の引数を検索サービスの上り電文に設定する。
		 * @param arg
		 */
		protected void setArg(OrdSendIf_Srch01_DtlR arg) {
			arg.wg_cd(up0().wg_cd());
			arg.site_cd(up0().site_cd());
			arg.mfg_loc_cd(up0().mfg_loc_cd());
			arg.if_scheduler_typ(up0().if_scheduler_typ());
			arg.upd_flg(true);
			if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up0().if_scheduler_typ())) {
				arg.loc_grp_cd(up0().loc_grp_cd());
				arg.dt_fr(up0().dt_fr());
				arg.dt_to(up0().dt_to());
				arg.include_unfirm_flg(up0().include_unfirm_flg());
			}
		}

		/**
		 * 送信対象データを作成する。
		 */
		protected void crtSndIfData() {

			_sndIfL = MCList.create(MST_ORDSND_IF_R.class);

			_dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());

			doSeqCache(MSC_NUM_SYS_TYP.ORDERSEND, _targetL.size());

			setAll(_sndIfL, _targetL, createMap_Mst_OrdSnd_If_R_OrdSendIf_Srch01_RsltR());

			clearParamRowIndex();
			writeBatchLog();
		}

		/**
		 * 送信ＩＦを登録する。
		 */
		protected void insSndIfData() {
			_ordSndIfR = MST_ORDSND_IF_R.create("ORDSND_IF");
			_sndIfLBldr = MCQueryApiBuilder.create(_ordSndIfR);
			dbInsertEx("MSLAB2310_MST_ORDER_SEND_IF_I01", _sndIfL, _sndIfLBldr);
		}

		/**
		 * 行インデックスをクリアする。<br>
		 * バッチログのサブキーを自動発番させるため、行インデックスをクリアする。
		 */
		protected void clearParamRowIndex() {

			for (MST_ORDSND_IF_R sndR : _sndIfL) {
				sndR.setParamIndex(-1);
				sndR.setParamRowIndex(-1);
			}
		}

		/**
		 * バッチログを出力する。
		 */
		protected void writeBatchLog() {
			MCMessageList msgList = MCMessagePool.getMessageList();
			FXBAL_BatchLogManager.logger().setLogKey(_sndIfL, MST_ORDSND_ITM_IF_R.$batch_log_no,
					MST_ORDSND_ITM_IF_R.$log_sub_key1, MST_ORDSND_ITM_IF_R.$log_sub_key2);
			FXBAL_BatchLogManager.logger().writeDataLog(msgList);
		}

		/**
		 * 送受信ＩＦ制御を登録する。
		 */
		protected void insSdrvIfData() {
			PFBZL_SendRecvIfCtrl.Ins01 ope = PFBZL_SendRecvIfCtrl.crtIns01();
			DtlR r = createSdrvIfUpRow();
			ope.up0().add(r);
			ope.exec();
		}

		/**
		 * 送受信ＩＦ制御上り電文作成処理
		 * */
		protected DtlR createSdrvIfUpRow() {
			DtlR r = DtlR.create();
			r.data_no(_dataNo);
			r.ext_sys_cd(up0().ext_sys_cd());
			r.if_proc_typ(MAC_IF_PROC_TYP.MES_ORDER_SEND.value());

			return r;
		}

		/**
		 * 例外処理
		 *
		 * @param ex
		 */
		protected void handleEx(Exception ex) {
			MCException mcex;
			if (ex instanceof MCException) {
				mcex = (MCException) ex;
			}
			else {
				mcex = new MCException(ex);
			}
			FXBAL_BatchLogManager.logger().writeProcessLog(mcex);

			_errFlg = true;

			throw mcex;
		}

		/**
		 * 終了ログを出力する。
		 */
		protected void writeEndLog() {

			if (_errFlg) {
				writeErrLog();
				pushErrorLog(FXBAL_BatchLogManager.logger());
			}
			else if (isNull(_sndIfL)) {
				writeEmptyLog();
			}

			writeRsltLog();
			pushEndLog(FXBAL_BatchLogManager.logger());
		}

		/**
		 * エラーが発生した場合のログを出力する。
		 */
		protected void writeErrLog() {

			FXBAL_BatchLogManager.logger().writeProcessLog(MAUDL0009);
			MCMessagePool.add(MAUDL0009);
		}

		/**
		 * 抽出対象が0件だった場合のログを出力する。
		 */
		protected void writeEmptyLog() {

			FXBAL_BatchLogManager.logger().writeProcessLog(MAUDL0008);
			MCMessagePool.add(MAUDL0008);
		}

		/**
		 * 処理結果の終了ログを出力する。
		 */
		protected void writeRsltLog() {

			FXBAL_BatchLogManager.logger().writeEndLog(MSLAL0727, up0().ext_sys_cd(), !isNull(_sndIfL) ? _sndIfL.size() : 0);
		}

		protected Map_Mst_Order_Send_If_R_OrdSendIf_Srch01_RsltR<MST_ORDSND_IF_R,OrdSendIf_Srch01_RsltR> createMap_Mst_OrdSnd_If_R_OrdSendIf_Srch01_RsltR() {
			return new Map_Mst_Order_Send_If_R_OrdSendIf_Srch01_RsltR<MST_ORDSND_IF_R, OrdSendIf_Srch01_RsltR>();
		}

		public class Map_Mst_Order_Send_If_R_OrdSendIf_Srch01_RsltR<D extends MST_ORDSND_IF_R, S extends OrdSendIf_Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap( MST_ORDSND_IF_R.$itm_ord_typ , OrdSendIf_Srch01_RsltR.$itm_ord_typ );
				addColumnPathMap( MST_ORDSND_IF_R.$itm_cd, OrdSendIf_Srch01_RsltR.$itm_cd );
				addColumnPathMap( MST_ORDSND_IF_R.$itm_sub1, OrdSendIf_Srch01_RsltR.$itm_sub1 );
				addColumnPathMap( MST_ORDSND_IF_R.$itm_sub2, OrdSendIf_Srch01_RsltR.$itm_sub2 );
				addColumnPathMap( MST_ORDSND_IF_R.$itm_sub3, OrdSendIf_Srch01_RsltR.$itm_sub3 );
				addColumnPathMap( MST_ORDSND_IF_R.$itm_nm, OrdSendIf_Srch01_RsltR.$itm_nm );
				addColumnPathMap( MST_ORDSND_IF_R.$ver_no, OrdSendIf_Srch01_RsltR.$ver_no );
				addColumnPathMap( MST_ORDSND_IF_R.$strg_loc_cd, OrdSendIf_Srch01_RsltR.$strg_loc_cd );
				addColumnPathMap( MST_ORDSND_IF_R.$strg_loc_nm, OrdSendIf_Srch01_RsltR.$strg_loc_nm );
				addColumnPathMap( MST_ORDSND_IF_R.$mfg_loc_cd, OrdSendIf_Srch01_RsltR.$mfg_loc_cd );
				addColumnPathMap( MST_ORDSND_IF_R.$mfg_loc_nm, OrdSendIf_Srch01_RsltR.$mfg_loc_nm );
				addColumnPathMap( MST_ORDSND_IF_R.$bom_ptn, OrdSendIf_Srch01_RsltR.$bom_ptn );
				addColumnPathMap( MST_ORDSND_IF_R.$oper_ptn, OrdSendIf_Srch01_RsltR.$oper_ptn );
				addColumnPathMap( MST_ORDSND_IF_R.$inst_qty, OrdSendIf_Srch01_RsltR.$inst_qty );
				addColumnPathMap( MST_ORDSND_IF_R.$yield_schd_qty, OrdSendIf_Srch01_RsltR.$yield_schd_qty );
				addColumnPathMap( MST_ORDSND_IF_R.$po_schd_dt, OrdSendIf_Srch01_RsltR.$po_schd_dt );
				addColumnPathMap( MST_ORDSND_IF_R.$mfg_st_schd_dt, OrdSendIf_Srch01_RsltR.$mfg_st_schd_dt );
				addColumnPathMap( MST_ORDSND_IF_R.$mfg_end_schd_dt, OrdSendIf_Srch01_RsltR.$mfg_end_schd_dt );
				addColumnPathMap( MST_ORDSND_IF_R.$strg_schd_dt, OrdSendIf_Srch01_RsltR.$strg_schd_dt );
				addColumnPathMap( MST_ORDSND_IF_R.$accpt_schd_dt, OrdSendIf_Srch01_RsltR.$accpt_schd_dt );
				addColumnPathMap( MST_ORDSND_IF_R.$insp_st_schd_dt, OrdSendIf_Srch01_RsltR.$insp_st_schd_dt );
				addColumnPathMap( MST_ORDSND_IF_R.$insp_end_schd_dt, OrdSendIf_Srch01_RsltR.$insp_end_schd_dt );
				addColumnPathMap( MST_ORDSND_IF_R.$avl_schd_dt, OrdSendIf_Srch01_RsltR.$avl_schd_dt );
				addColumnPathMap( MST_ORDSND_IF_R.$master_dt, OrdSendIf_Srch01_RsltR.$master_dt );
				addColumnPathMap( MST_ORDSND_IF_R.$sno1, OrdSendIf_Srch01_RsltR.$sno1 );
				addColumnPathMap( MST_ORDSND_IF_R.$sno2, OrdSendIf_Srch01_RsltR.$sno2 );
				addColumnPathMap( MST_ORDSND_IF_R.$sno3, OrdSendIf_Srch01_RsltR.$sno3 );
				addColumnPathMap( MST_ORDSND_IF_R.$sno4, OrdSendIf_Srch01_RsltR.$sno4 );
				addColumnPathMap( MST_ORDSND_IF_R.$inst_po_cnt_rmrks, OrdSendIf_Srch01_RsltR.$inst_po_cnt_rmrks );
				addColumnPathMap( MST_ORDSND_IF_R.$itm_ord_intr_rmrks, OrdSendIf_Srch01_RsltR.$itm_ord_intr_rmrks );
				addColumnPathMap( MST_ORDSND_IF_R.$itm_ord_sub_char1, OrdSendIf_Srch01_RsltR.$itm_ord_sub_char1 );
				addColumnPathMap( MST_ORDSND_IF_R.$itm_ord_sub_char2, OrdSendIf_Srch01_RsltR.$itm_ord_sub_char2 );
				addColumnPathMap( MST_ORDSND_IF_R.$itm_ord_sub_char3, OrdSendIf_Srch01_RsltR.$itm_ord_sub_char3 );
				addColumnPathMap( MST_ORDSND_IF_R.$st_schd_tm, OrdSendIf_Srch01_RsltR.$st_schd_tm );
				addColumnPathMap( MST_ORDSND_IF_R.$end_schd_tm, OrdSendIf_Srch01_RsltR.$end_schd_tm );
				addColumnPathMap( MST_ORDSND_IF_R.$oper_schd_qty, OrdSendIf_Srch01_RsltR.$oper_schd_qty );
				addColumnPathMap( MST_ORDSND_IF_R.$disp_seq, OrdSendIf_Srch01_RsltR.$disp_seq );
				addColumnPathMap( MST_ORDSND_IF_R.$oper_cd, OrdSendIf_Srch01_RsltR.$oper_cd );
				addColumnPathMap( MST_ORDSND_IF_R.$oper_nm, OrdSendIf_Srch01_RsltR.$oper_nm );
				addColumnPathMap( MST_ORDSND_IF_R.$oper_seq, OrdSendIf_Srch01_RsltR.$oper_seq );
				addColumnPathMap( MST_ORDSND_IF_R.$loc_cd, OrdSendIf_Srch01_RsltR.$loc_cd );
				addColumnPathMap( MST_ORDSND_IF_R.$loc_nm, OrdSendIf_Srch01_RsltR.$loc_nm );
				addColumnPathMap( MST_ORDSND_IF_R.$oper_rsrc, OrdSendIf_Srch01_RsltR.$oper_rsrc );
				addColumnPathMap( MST_ORDSND_IF_R.$oper_ord_intr_rmrks, OrdSendIf_Srch01_RsltR.$oper_ord_intr_rmrks );
				addColumnPathMap( MST_ORDSND_IF_R.$oper_ord_sub_char1, OrdSendIf_Srch01_RsltR.$oper_ord_sub_char1 );
				addColumnPathMap( MST_ORDSND_IF_R.$oper_ord_sub_char2, OrdSendIf_Srch01_RsltR.$oper_ord_sub_char2 );
				addColumnPathMap( MST_ORDSND_IF_R.$oper_ord_sub_char3, OrdSendIf_Srch01_RsltR.$oper_ord_sub_char3 );
				addColumnPathMap( MST_ORDSND_IF_R.$itm_ord_no, OrdSendIf_Srch01_RsltR.$itm_ord_no);
				addColumnPathMap( MST_ORDSND_IF_R.$oper_ord_no, OrdSendIf_Srch01_RsltR.$oper_ord_no);
				addColumnPathMap( MST_ORDSND_IF_R.$itm_ord_sts_typ, OrdSendIf_Srch01_RsltR.$itm_ord_sts_typ);
				addColumnPathMap( MST_ORDSND_IF_R.$oper_ord_sts_typ, OrdSendIf_Srch01_RsltR.$oper_ord_sts_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// ＩＦ共通項目の設定
				MCNumber dataLno = getSequence(
						MSC_NUM_SYS_TYP.ORDERSEND.value());
				dest.data_lno(dataLno);
				dest.data_no(_dataNo);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.ext_sys_cd(up0().ext_sys_cd());
			}
		}
	}

	//FMCB CUSTOM END
}