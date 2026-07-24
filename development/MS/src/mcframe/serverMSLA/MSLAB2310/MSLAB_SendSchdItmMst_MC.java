package mcframe.serverMSLA.MSLAB2310;

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
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl;
import mcframe.serverPFUD.PFUDL0030.DtlR;
import mcframe.serverMSLA.MSLAL9310.MSLAL_OrdSendIfService;
import mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_DtlR;
import mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_RsltR;
import mcframe.serverFXUC.FXUCL0170.*;
import java.util.stream.Stream;
import java.util.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAB_SendSchdItmMst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAB_SendSchdItmMst_MC extends MSLAB_SendSchdItmMst_MC_A{
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
	protected MCList<OrdSendIf_Itm_Srch01_RsltR>_targetL = null;
	/**
	 * 送信ＩＦ登録用コンテナ
	 */
	protected MCList<MST_ORDSND_ITM_IF_R> _sndIfL = null;
	protected MST_ORDSND_ITM_IF_R _ordSndItmIfR = null;
	protected MCQueryApiBuilder _sndIfLBldr = null;

	/**
	 * SendSchdItmMst_Upd01オペレーション.<p>
	 *
	 * スケジューラ連携用の品目マスタデータをＩＦテーブルに登録する。<br>
	 */
	public class SendSchdItmMst_Upd01 extends MSLAB_SendSchdItmMst_MC_A.SendSchdItmMst_Upd01 {
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

			FXBAL_BatchLogManager.logger().writeStartLog(MSLAL0700, up0().ext_sys_cd(), toYMDString(up0().master_dt()),
					up0().wg_cd(), up0().loc_grp_cd(), up0().if_scheduler_typ());
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
				SendSchdItmMst_Upd01_CndR.$ext_sys_cd, SendSchdItmMst_Upd01_CndR.$if_scheduler_typ
			};

			String[] addCols = new String[] {};
			if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up0().if_scheduler_typ())) {
				if (!isNull(up0().loc_grp_cd())) {
					addCols = new String[] {
							SendSchdItmMst_Upd01_CndR.$master_dt
					};
				}
			}
			return Stream.concat(Stream.of(comCols), Stream.of(addCols)).toArray(String[]::new);
		}

		protected void checkValidIfSchdTyp(MCMessageList msgList) {
			msgList.addAll(check(up0(), SendSchdItmMst_Upd01_CndR.$if_scheduler_typ, new FXUCL_ConstValidater(MSC_IF_SCHEDULER_TYP.array())));
		}

		protected void checkReqWgOrMfgLocCd(MCMessageList msgList) {

			if (MSC_IF_SCHEDULER_TYP.isGP(up0().if_scheduler_typ())) {
				msgList.addAll(check(up0(), SendSchdItmMst_Upd01_CndR.$wg_cd, new FXUCL_RequiredValidater()));
			}
			else if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up0().if_scheduler_typ())) {
				msgList.addAll(check(up0(), new String[] {
						SendSchdItmMst_Upd01_CndR.$wg_cd, SendSchdItmMst_Upd01_CndR.$loc_grp_cd
				}, new FXUCL_TooManyInputsValidater()));
				msgList.addAll(check(up0(), new String[] {
						SendSchdItmMst_Upd01_CndR.$wg_cd, SendSchdItmMst_Upd01_CndR.$loc_grp_cd
				}, new FXUCL_AtLeastOneValidater()));
			}
		}

		protected void chkArgs(MCMessageList msgList) {

			if (MSC_IF_SCHEDULER_TYP.isGP(up0().if_scheduler_typ())) {
				if (!isNull(up0().master_dt())) {
					msgList.add(new MCMessage(MSLAL0901, MSC_IF_SCHEDULER_TYP.GP.value(),
							getLabel(up0(), SendSchdItmMst_Upd01_CndR.$master_dt)));
				}
				if (!isNull(up0().loc_grp_cd())) {
					msgList.add(new MCMessage(MSLAL0901, MSC_IF_SCHEDULER_TYP.GP.value(),
							getLabel(up0(), SendSchdItmMst_Upd01_CndR.$loc_grp_cd)));
				}
			}
		}

		/**
		 * オーダ送信ＩＦサービスを呼び出して品目マスタのデータを取得して登録する
		 */
		protected void getMstData() {
			MSLAL_OrdSendIfService.OrdSendIf_Itm_Srch01 ope = MSLAL_OrdSendIfService.crtOrdSendIf_Itm_Srch01();
			setArgOrdSendIf_Itm_Srch01(ope.up0());
			ope.exec();
			_targetL = MCList.create(OrdSendIf_Itm_Srch01_RsltR.class);
			_targetL.addAll(ope.down0());
		}

		/**
		 * バッチ実行時の引数を検索サービスの上り電文に設定する。
		 * @param arg
		 */
		protected void setArgOrdSendIf_Itm_Srch01(OrdSendIf_Itm_Srch01_DtlR arg) {
			arg.wg_cd(up0().wg_cd());
			if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up0().if_scheduler_typ())) {
				arg.loc_grp_cd(up0().loc_grp_cd());
				arg.master_dt(up0().master_dt());
			}
		}

		/**
		 * 送信対象データを作成する。
		 */
		protected void crtSndIfData() {

			_sndIfL = MCList.create(MST_ORDSND_ITM_IF_R.class);

			_dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());

			doSeqCache(MSC_NUM_SYS_TYP.ORDERSENDITMIF, _targetL.size());

			setAll(_sndIfL, _targetL, createMap_Mst_Order_Send_Itm_If_R_OrdSendIf_Itm_Srch01_RsltR());

			clearParamRowIndex();
			writeBatchLog();
		}

		/**
		 * 送信ＩＦを登録する。
		 */
		protected void insSndIfData() {
			_ordSndItmIfR = MST_ORDSND_ITM_IF_R.create("ORDSND_ITM_IF");
			_sndIfLBldr = MCQueryApiBuilder.create(_ordSndItmIfR);
			dbInsertEx("MSLAB2310_MST_ORDER_SEND_ITM_IF_I01", _sndIfL, _sndIfLBldr);
		}

		/**
		 * 行インデックスをクリアする。<br>
		 * バッチログのサブキーを自動発番させるため、行インデックスをクリアする。
		 */
		protected void clearParamRowIndex() {

			for (MST_ORDSND_ITM_IF_R sndR : _sndIfL) {
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
			r.if_proc_typ(MAC_IF_PROC_TYP.MES_ORDER_SEND_ITM.value());

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

			FXBAL_BatchLogManager.logger().writeEndLog(MSLAL0701, up0().ext_sys_cd(), !isNull(_sndIfL) ? _sndIfL.size() : 0);
		}

		protected Map_Mst_Order_Send_Itm_If_R_OrdSendIf_Itm_Srch01_RsltR<MST_ORDSND_ITM_IF_R,OrdSendIf_Itm_Srch01_RsltR> createMap_Mst_Order_Send_Itm_If_R_OrdSendIf_Itm_Srch01_RsltR() {
			return new Map_Mst_Order_Send_Itm_If_R_OrdSendIf_Itm_Srch01_RsltR<MST_ORDSND_ITM_IF_R, OrdSendIf_Itm_Srch01_RsltR>();
		}

		public class Map_Mst_Order_Send_Itm_If_R_OrdSendIf_Itm_Srch01_RsltR<D extends MST_ORDSND_ITM_IF_R, S extends OrdSendIf_Itm_Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$wg_cd, OrdSendIf_Itm_Srch01_RsltR.$wg_cd);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_cd, OrdSendIf_Itm_Srch01_RsltR.$itm_cd);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_sub1, OrdSendIf_Itm_Srch01_RsltR.$itm_sub1);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_sub2, OrdSendIf_Itm_Srch01_RsltR.$itm_sub2);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_sub3, OrdSendIf_Itm_Srch01_RsltR.$itm_sub3);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_nm, OrdSendIf_Itm_Srch01_RsltR.$itm_nm);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_alt_nm1, OrdSendIf_Itm_Srch01_RsltR.$itm_alt_nm1);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_alt_nm2, OrdSendIf_Itm_Srch01_RsltR.$itm_alt_nm2);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_alt_nm3, OrdSendIf_Itm_Srch01_RsltR.$itm_alt_nm3);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_alt_nm4, OrdSendIf_Itm_Srch01_RsltR.$itm_alt_nm4);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$base_itm_nm, OrdSendIf_Itm_Srch01_RsltR.$base_itm_nm);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$base_itm_alt_nm1, OrdSendIf_Itm_Srch01_RsltR.$base_itm_alt_nm1);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$base_itm_alt_nm2, OrdSendIf_Itm_Srch01_RsltR.$base_itm_alt_nm2);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$base_itm_alt_nm3, OrdSendIf_Itm_Srch01_RsltR.$base_itm_alt_nm3);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$base_itm_alt_nm4, OrdSendIf_Itm_Srch01_RsltR.$base_itm_alt_nm4);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$unit_cd, OrdSendIf_Itm_Srch01_RsltR.$unit_cd);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$dec_place, OrdSendIf_Itm_Srch01_RsltR.$dec_place);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$lot_mng_typ, OrdSendIf_Itm_Srch01_RsltR.$lot_mng_typ);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$sublot_mng_typ, OrdSendIf_Itm_Srch01_RsltR.$sublot_mng_typ);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$sno1_mng_typ, OrdSendIf_Itm_Srch01_RsltR.$sno1_mng_typ);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$sno2_mng_typ, OrdSendIf_Itm_Srch01_RsltR.$sno2_mng_typ);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$sno3_mng_typ, OrdSendIf_Itm_Srch01_RsltR.$sno3_mng_typ);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$sno4_mng_typ, OrdSendIf_Itm_Srch01_RsltR.$sno4_mng_typ);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$stk_mng_typ, OrdSendIf_Itm_Srch01_RsltR.$stk_mng_typ);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$asset_mng_typ, OrdSendIf_Itm_Srch01_RsltR.$asset_mng_typ);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_typ, OrdSendIf_Itm_Srch01_RsltR.$itm_typ);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_typ_d_cd, OrdSendIf_Itm_Srch01_RsltR.$itm_typ_d_cd);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_grp_cd1, OrdSendIf_Itm_Srch01_RsltR.$itm_grp_cd1);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_grp_cd2, OrdSendIf_Itm_Srch01_RsltR.$itm_grp_cd2);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_grp_cd3, OrdSendIf_Itm_Srch01_RsltR.$itm_grp_cd3);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_grp_cd4, OrdSendIf_Itm_Srch01_RsltR.$itm_grp_cd4);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_grp_cd5, OrdSendIf_Itm_Srch01_RsltR.$itm_grp_cd5);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_grp_cd6, OrdSendIf_Itm_Srch01_RsltR.$itm_grp_cd6);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_grp_cd7, OrdSendIf_Itm_Srch01_RsltR.$itm_grp_cd7);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_grp_cd8, OrdSendIf_Itm_Srch01_RsltR.$itm_grp_cd8);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_grp_cd9, OrdSendIf_Itm_Srch01_RsltR.$itm_grp_cd9);
				addColumnPathMap( MST_ORDSND_ITM_IF_R.$itm_grp_cd10, OrdSendIf_Itm_Srch01_RsltR.$itm_grp_cd10);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// ＩＦ共通項目の設定
				MCNumber dataLno = getSequence(
						MSC_NUM_SYS_TYP.ORDERSENDITMIF.value());
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